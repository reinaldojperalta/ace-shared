package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta para endpoints de ranking.
 * Incluye posición del usuario autenticado + top N.
 *
 * @see Apéndice S6 (Ranking)
 */
@Serializable
data class RankingResponseDto(
    val myPosition: Int,
    val myTotalXp: Long,
    val top: List<RankingEntryDto>,
    val lastUpdated: String
)