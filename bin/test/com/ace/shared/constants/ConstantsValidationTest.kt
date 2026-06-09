package com.ace.shared.constants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConstantsValidationTest {

    @Test
    fun `should have valid block duration constants`() {
        assertThat(SyncConstants.BLOCK_DURATION_SECONDS).isEqualTo(300)
        assertThat(SyncConstants.BLOCK_MIN_DURATION).isEqualTo(270)
        assertThat(SyncConstants.BLOCK_MAX_DURATION).isEqualTo(330)
    }

    @Test
    fun `should have valid auth token TTLs`() {
        assertThat(AuthConstants.ACCESS_TOKEN_TTL_MINUTES).isEqualTo(15)
        assertThat(AuthConstants.REFRESH_TOKEN_TTL_DAYS).isEqualTo(7)
    }

    @Test
    fun `should have valid ranking constants`() {
        assertThat(RankingConstants.TOP_GLOBAL_SIZE).isEqualTo(100)
        assertThat(RankingConstants.TOP_LOCAL_CACHE_SIZE).isEqualTo(10)
        assertThat(RankingConstants.RANKING_CACHE_TTL_HOURS).isEqualTo(1)
    }

    @Test
    fun `should have valid history constants`() {
        assertThat(HistoryConstants.MAX_LOCAL_SESSIONS).isEqualTo(5)
    }

    @Test
    fun `should have valid streak constants`() {
        assertThat(StreakConstants.STREAK_REMINDER_HOUR).isEqualTo(20)
        assertThat(StreakConstants.STREAK_REMINDER_MINUTE).isEqualTo(0)
    }

    @Test
    fun `should have valid retry constants`() {
        assertThat(SyncConstants.MAX_RETRIES).isEqualTo(5)
        assertThat(SyncConstants.RETRY_DELAY_INITIAL_MS).isEqualTo(15L * 60L * 1000L)
    }

    @Test
    fun `should have valid data layer paths`() {
        assertThat(DataLayerPaths.HEART_RATE).isEqualTo("/ace/health/heart_rate")
        assertThat(DataLayerPaths.COMMAND).isEqualTo("/ace/command")
        assertThat(DataLayerPaths.INITIAL_SYNC).isEqualTo("/ace/initial_sync")
        assertThat(DataLayerPaths.sessionStatusPath("abc-123"))
            .isEqualTo("/ace/session/abc-123/status")
    }

    @Test
    fun `should have valid API endpoints`() {
        assertThat(ApiEndpoints.AUTH_LOGIN).startsWith("/api/auth/")
        assertThat(ApiEndpoints.EXERCISE_BLOCKS).startsWith("/api/exercise/")
        assertThat(ApiEndpoints.RANKING_GLOBAL).startsWith("/api/ranking/")
    }
}