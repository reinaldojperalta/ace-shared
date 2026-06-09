package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que representa una entrada individual en el ranking (global o municipal).
 *
 * @see Apéndice S6 (Ranking)
 */
@Serializable
data class RankingEntryDto(
    val position: Int,
    val userId: String,
    val totalXp: Long,
    val username: String
)