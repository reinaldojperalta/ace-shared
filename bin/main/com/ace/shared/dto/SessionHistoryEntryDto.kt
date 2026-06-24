package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que representa una entrada del historial de sesiones.
 *
 * @see Apéndice S9 (Historial)
 */
@Serializable
data class SessionHistoryEntryDto(
    val sessionId: String,
    val timestampStart: String,      // ISO-8601
    val timestampEnd: String?,       // ISO-8601 o null
    val sportType: String,
    val durationSeconds: Int,
    val totalXp: Int,
    val totalBlocks: Int,
    val avgBpm: Double?
)