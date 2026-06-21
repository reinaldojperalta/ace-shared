package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta por bloque tras validación de XP.
 * Incluido en [SyncBatchResponseDto] como lista (uno por bloque procesado).
 *
 * Versión 1.0.5: Nuevo DTO para granularidad de respuestas.
 *
 * @see Apéndice S3 (Sync) · Apéndice S5 (XP)
 */
@Serializable
data class XpAwardedResponseDto(
    val blockId: String,                 // UUID del bloque procesado
    val xpAccepted: Int,                 // XP aceptada por el backend
    val xpRejected: Int = 0,             // XP rechazada (0 si fue aceptado)
    val newTotalXp: Long,                // Nuevo total acumulado del usuario
    val rankChanged: Boolean = false,    // ¿Subió de rango?
    val newRankId: String? = null,       // ID del nuevo rango (si aplica)
    val balanceAfter: Long,              // Balance después de la transacción
    val schemaVersion: Int = 1           // Versionado de contrato
)