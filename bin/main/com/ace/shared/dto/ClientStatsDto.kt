package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que el móvil envía al backend con sus totales locales acumulados.
 * El backend valida consistencia y responde con [OfficialStatsDto].
 *
 * @see Apéndice S10 (Estadísticas Persistentes de Perfil)
 */
@Serializable
data class ClientStatsDto(
    val totalXp: Long,
    val totalSessions: Int,
    val totalBlocks: Int,
    val totalDurationSeconds: Long,
    val avgBpmAllTime: Double
)