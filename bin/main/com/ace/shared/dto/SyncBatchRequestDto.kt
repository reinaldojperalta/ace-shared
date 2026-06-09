package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que el móvil envía al backend en cada batch de sincronización.
 * Contiene hasta 20 bloques + estadísticas locales del cliente.
 *
 * @see Apéndice S3 (Sync) · Apéndice S10 (Estadísticas)
 */
@Serializable
data class SyncBatchRequestDto(
    val blocks: List<ExerciseBlockDto>,
    val clientStats: ClientStatsDto,
    val deviceId: String
)