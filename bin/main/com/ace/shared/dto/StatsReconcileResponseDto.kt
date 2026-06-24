package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta para POST /api/stats/reconcile.
 * Incluye stats oficiales + flags de corrección.
 *
 * @see Apéndice S10 (Estadísticas)
 */
@Serializable
data class StatsReconcileResponseDto(
    val officialStats: OfficialStatsDto,
    val currentRank: String,
    val discrepancies: List<String> = emptyList()
)