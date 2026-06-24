package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta para GET /api/stats.
 * Totales oficiales del usuario + rango actual.
 *
 * @see Apéndice S10 (Estadísticas)
 */
@Serializable
data class StatsResponseDto(
    val totalXp: Long,
    val totalSessions: Int,
    val totalBlocks: Int,
    val totalDurationSeconds: Long,
    val avgBpmAllTime: Double,
    val currentRank: String,
    val nextRank: String?,
    val xpToNextRank: Long?
)