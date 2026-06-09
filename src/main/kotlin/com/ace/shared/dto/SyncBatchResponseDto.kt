package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta del backend tras procesar un batch de sync.
 *
 * @see Apéndice S3 (Sync)
 */
@Serializable
data class SyncBatchResponseDto(
    val acceptedBlocks: List<String>, // blockIds aceptados
    val rejectedBlocks: List<RejectedBlockDto>,
    val officialStats: OfficialStatsDto,
    val streakState: StreakStateDto,
    val rankChanged: Boolean = false
)