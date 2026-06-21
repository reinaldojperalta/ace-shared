package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que el móvil envía al backend en cada batch de sincronización.
 * Contiene hasta 20 bloques + estadísticas locales del cliente.
 *
 * Versión 1.0.5: Agregados sessionId, sentAt, schemaVersion para trazabilidad.
 *
 * @see Apéndice S3 (Sync) · Apéndice S10 (Estadísticas)
 */
@Serializable
data class SyncBatchRequestDto(
    val blocks: List<ExerciseBlockDto>,
    val clientStats: ClientStatsDto,
    val deviceId: String,
    val sessionId: String? = null,      // ← NUEVO v1.0.5: UUID de la sesión padre
    val sentAt: Long = System.currentTimeMillis(), // ← NUEVO v1.0.5: timestamp de envío
    val schemaVersion: Int = 1           // ← NUEVO v1.0.5: versionado de contrato
)