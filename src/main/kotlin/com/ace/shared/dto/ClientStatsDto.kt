package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que el móvil envía al backend con sus totales locales acumulados.
 * El backend valida consistencia y responde con [OfficialStatsDto].
 *
 * Versión 1.0.5: Agregados userId, lastSyncAt, schemaVersion.
 *
 * @see Apéndice S10 (Estadísticas Persistentes de Perfil)
 */
@Serializable
data class ClientStatsDto(
    val totalXp: Long,
    val totalSessions: Int,
    val totalBlocks: Int,
    val totalDurationSeconds: Long,
    val avgBpmAllTime: Double,
    val userId: String? = null,           // ← NUEVO v1.0.5: para validación cruzada
    val lastSyncAt: Long? = null,       // ← NUEVO v1.0.5: último sync exitoso
    val schemaVersion: Int = 1           // ← NUEVO v1.0.5: versionado de contrato
)