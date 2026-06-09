package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta del backend tras validar un batch de bloques.
 * Incluye información de XP aceptada, ranking y racha.
 *
 * @see Apéndice S3 (Sync) · Apéndice S5 (XP)
 */
@Serializable
data class XpAwardedResponseDto(
    val xpAccepted: Boolean,
    val newTotalXp: Long,
    val rankChanged: Boolean = false,
    val currentStreak: Int = 0,
    val bestStreak: Int = 0,
    val lastExerciseDate: String? = null,
    val formulaVersion: Int = 1
)