package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta del backend tras procesar un batch de sync.
 *
 * Versión 1.0.5: Agregado xpDetails para granularidad por bloque.
 *
 * @see Apéndice S3 (Sync)
 */
@Serializable
data class SyncBatchResponseDto(
    val acceptedBlocks: List<String>,           // blockIds aceptados
    val rejectedBlocks: List<RejectedBlockDto>,  // Bloques rechazados con razón
    val officialStats: OfficialStatsDto,         // Stats validadas/corregidas
    val streakState: StreakStateDto,             // Estado de racha actualizado
    val rankChanged: Boolean = false,            // ¿Hubo cambio de rango?
    val xpDetails: List<XpAwardedResponseDto> = emptyList() // ← NUEVO v1.0.5: detalle por bloque
)