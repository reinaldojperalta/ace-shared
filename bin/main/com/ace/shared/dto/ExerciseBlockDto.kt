package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que representa un bloque de ejercicio de ~5 minutos.
 * Es la unidad mínima de procesamiento, persistencia y sincronización.
 *
 * @see Apéndice S2 (Sesión) · Apéndice S3 (Sync) · Apéndice S5 (XP)
 */
@Serializable
data class ExerciseBlockDto(
    val blockId: String,
    val sessionId: String,
    val userId: String,
    val deviceId: String,
    val sportType: com.ace.shared.enums.SportType,
    val timestampStart: Long,
    val timestampEnd: Long,
    val durationSeconds: Int,
    val avgBpm: Double,
    val maxBpm: Double,
    val minBpm: Double,
    val sampleCount: Int,
    val xpCalculated: Int,
    val schemaVersion: Int = 1
)