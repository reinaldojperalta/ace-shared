package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que representa el estado de racha de un usuario.
 * Incluido en respuestas de sync para cacheo local.
 *
 * @see Apéndice S7 (Racha)
 */
@Serializable
data class StreakStateDto(
    val currentStreak: Int,
    val bestStreak: Int,
    val lastExerciseDate: String?
)