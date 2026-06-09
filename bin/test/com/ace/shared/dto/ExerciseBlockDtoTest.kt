package com.ace.shared.dto

import com.ace.shared.enums.SportType
import com.google.gson.Gson
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExerciseBlockDtoTest {

    private val gson = Gson()

    @Test
    fun `should serialize ExerciseBlockDto to JSON`() {
        val block = ExerciseBlockDto(
            blockId = "550e8400-e29b-41d4-a716-446655440000",
            sessionId = "550e8400-e29b-41d4-a716-446655440001",
            userId = "550e8400-e29b-41d4-a716-446655440002",
            deviceId = "test-device-001",
            sportType = SportType.RUNNING,
            timestampStart = 1717315200000L,
            timestampEnd = 1717315500000L,
            durationSeconds = 300,
            avgBpm = 145.0,
            maxBpm = 165.0,
            minBpm = 125.0,
            sampleCount = 300,
            xpCalculated = 10,
            schemaVersion = 1
        )

        val serialized = gson.toJson(block)

        // Verificar round-trip: serializar -> deserializar -> comparar
        val deserialized = gson.fromJson(serialized, ExerciseBlockDto::class.java)
        assertThat(deserialized.blockId).isEqualTo(block.blockId)
        assertThat(deserialized.sportType).isEqualTo(SportType.RUNNING)
        assertThat(deserialized.xpCalculated).isEqualTo(10)
        assertThat(deserialized.schemaVersion).isEqualTo(1)
        assertThat(deserialized.avgBpm).isEqualTo(145.0)
    }

    @Test
    fun `should deserialize ExerciseBlockDto from JSON`() {
        val jsonString = """
            {
                "blockId": "550e8400-e29b-41d4-a716-446655440000",
                "sessionId": "550e8400-e29b-41d4-a716-446655440001",
                "userId": "550e8400-e29b-41d4-a716-446655440002",
                "deviceId": "test-device-001",
                "sportType": "RUNNING",
                "timestampStart": 1717315200000,
                "timestampEnd": 1717315500000,
                "durationSeconds": 300,
                "avgBpm": 145.0,
                "maxBpm": 165.0,
                "minBpm": 125.0,
                "sampleCount": 300,
                "xpCalculated": 10,
                "schemaVersion": 1
            }
        """.trimIndent()

        val deserialized = gson.fromJson(jsonString, ExerciseBlockDto::class.java)

        assertThat(deserialized.blockId).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(deserialized.sportType).isEqualTo(SportType.RUNNING)
        assertThat(deserialized.xpCalculated).isEqualTo(10)
        assertThat(deserialized.schemaVersion).isEqualTo(1)
        assertThat(deserialized.avgBpm).isEqualTo(145.0)
        assertThat(deserialized.durationSeconds).isEqualTo(300)
    }

    @Test
    fun `should handle missing schemaVersion with Gson default`() {
        // NOTA: Gson NO respeta los default values de Kotlin.
        // Si schemaVersion no está en el JSON, Gson lo inicializa a 0 (default de Int en Java).
        // Este test documenta ese comportamiento para que no sea sorpresa.
        val jsonString = """
            {
                "blockId": "550e8400-e29b-41d4-a716-446655440000",
                "sessionId": "550e8400-e29b-41d4-a716-446655440001",
                "userId": "550e8400-e29b-41d4-a716-446655440002",
                "deviceId": "test-device-001",
                "sportType": "RUNNING",
                "timestampStart": 1717315200000,
                "timestampEnd": 1717315500000,
                "durationSeconds": 300,
                "avgBpm": 145.0,
                "maxBpm": 165.0,
                "minBpm": 125.0,
                "sampleCount": 300,
                "xpCalculated": 10
            }
        """.trimIndent()

        val deserialized = gson.fromJson(jsonString, ExerciseBlockDto::class.java)

        // Gson no respeta el default value de Kotlin (= 1), usa 0
        assertThat(deserialized.schemaVersion).isEqualTo(0)
    }

    @Test
    fun `should round-trip ExerciseBlockDto through Gson`() {
        val original = ExerciseBlockDto(
            blockId = "block-abc-123",
            sessionId = "session-xyz-789",
            userId = "user-001",
            deviceId = "device-001",
            sportType = SportType.CYCLING,
            timestampStart = 1000L,
            timestampEnd = 1300L,
            durationSeconds = 300,
            avgBpm = 130.5,
            maxBpm = 150.0,
            minBpm = 110.0,
            sampleCount = 300,
            xpCalculated = 8
        )

        val json = gson.toJson(original)
        val roundTripped = gson.fromJson(json, ExerciseBlockDto::class.java)

        assertThat(roundTripped.blockId).isEqualTo(original.blockId)
        assertThat(roundTripped.sessionId).isEqualTo(original.sessionId)
        assertThat(roundTripped.userId).isEqualTo(original.userId)
        assertThat(roundTripped.deviceId).isEqualTo(original.deviceId)
        assertThat(roundTripped.sportType).isEqualTo(original.sportType)
        assertThat(roundTripped.timestampStart).isEqualTo(original.timestampStart)
        assertThat(roundTripped.timestampEnd).isEqualTo(original.timestampEnd)
        assertThat(roundTripped.durationSeconds).isEqualTo(original.durationSeconds)
        assertThat(roundTripped.avgBpm).isEqualTo(original.avgBpm)
        assertThat(roundTripped.maxBpm).isEqualTo(original.maxBpm)
        assertThat(roundTripped.minBpm).isEqualTo(original.minBpm)
        assertThat(roundTripped.sampleCount).isEqualTo(original.sampleCount)
        assertThat(roundTripped.xpCalculated).isEqualTo(original.xpCalculated)
        assertThat(roundTripped.schemaVersion).isEqualTo(original.schemaVersion)
    }
}