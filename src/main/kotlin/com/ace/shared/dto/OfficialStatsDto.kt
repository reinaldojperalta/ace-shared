package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que el backend responde con los totales validados y corregidos.
 *
 * @see Apéndice S10 (Estadísticas Persistentes de Perfil)
 */
@Serializable
data class OfficialStatsDto(
    val officialTotalXp: Long,
    val officialTotalSessions: Int,
    val officialTotalBlocks: Int,
    val officialTotalDurationSeconds: Long,
    val officialAvgBpmAllTime: Double,
    val correctionApplied: Boolean = false,
    val correctionReason: String? = null
)