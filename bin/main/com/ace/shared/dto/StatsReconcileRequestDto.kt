package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO para POST /api/stats/reconcile.
 * El móvil envía sus stats locales; el backend responde con correcciones.
 *
 * @see Apéndice S10 (Estadísticas)
 */
@Serializable
data class StatsReconcileRequestDto(
    val clientStats: ClientStatsDto
)