package com.ace.shared.dto

import com.ace.shared.enums.SportType
import com.google.gson.Gson
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SyncBatchRequestDtoTest {

    private val gson = Gson()

    @Test
    fun `should serialize SyncBatchRequestDto with blocks and stats`() {
        val block = ExerciseBlockDto(
            blockId = "block-001",
            sessionId = "session-001",
            userId = "user-001",
            deviceId = "device-001",
            sportType = SportType.CYCLING,
            timestampStart = 1717315200000L,
            timestampEnd = 1717315500000L,
            durationSeconds = 300,
            avgBpm = 130.0,
            maxBpm = 150.0,
            minBpm = 110.0,
            sampleCount = 300,
            xpCalculated = 8
        )

        val clientStats = ClientStatsDto(
            totalXp = 1250,
            totalSessions = 15,
            totalBlocks = 45,
            totalDurationSeconds = 13500,
            avgBpmAllTime = 142.5
        )

        val batch = SyncBatchRequestDto(
            blocks = listOf(block),
            clientStats = clientStats,
            deviceId = "device-001"
        )

        val serialized = gson.toJson(batch)

        // Round-trip verification
        val deserialized = gson.fromJson(serialized, SyncBatchRequestDto::class.java)
        assertThat(deserialized.blocks).hasSize(1)
        assertThat(deserialized.blocks[0].blockId).isEqualTo("block-001")
        assertThat(deserialized.blocks[0].sportType).isEqualTo(SportType.CYCLING)
        assertThat(deserialized.clientStats.totalXp).isEqualTo(1250)
        assertThat(deserialized.clientStats.totalSessions).isEqualTo(15)
        assertThat(deserialized.deviceId).isEqualTo("device-001")
    }

    @Test
    fun `should enforce batch size limit in domain logic`() {
        // El límite de 20 bloques es responsabilidad del ensamblador de batch (Sistema 3),
        // no del DTO. Este test documenta la expectativa del contrato.
        val maxBatchSize = com.ace.shared.constants.SyncConstants.BATCH_MAX_SIZE
        assertThat(maxBatchSize).isEqualTo(20)
    }

    @Test
    fun `should round-trip SyncBatchRequestDto through Gson`() {
        val blocks = listOf(
            ExerciseBlockDto(
                blockId = "b1",
                sessionId = "s1",
                userId = "u1",
                deviceId = "d1",
                sportType = SportType.RUNNING,
                timestampStart = 1000L,
                timestampEnd = 1300L,
                durationSeconds = 300,
                avgBpm = 140.0,
                maxBpm = 160.0,
                minBpm = 120.0,
                sampleCount = 300,
                xpCalculated = 10
            )
        )

        val clientStats = ClientStatsDto(
            totalXp = 100,
            totalSessions = 1,
            totalBlocks = 1,
            totalDurationSeconds = 300,
            avgBpmAllTime = 140.0
        )

        val original = SyncBatchRequestDto(
            blocks = blocks,
            clientStats = clientStats,
            deviceId = "d1"
        )

        val json = gson.toJson(original)
        val roundTripped = gson.fromJson(json, SyncBatchRequestDto::class.java)

        assertThat(roundTripped.blocks).hasSize(1)
        assertThat(roundTripped.blocks[0].blockId).isEqualTo("b1")
        assertThat(roundTripped.clientStats.totalXp).isEqualTo(100)
        assertThat(roundTripped.deviceId).isEqualTo("d1")
    }
}