package com.ace.shared.dto

import kotlinx.serialization.Serializable
import com.ace.shared.enums.SessionStatus
import com.ace.shared.enums.SportType

/**
 * DTO que representa una sesión de ejercicio completa.
 * Contenedor lógico de una actividad física desde inicio hasta cierre.
 *
 * @see Apéndice S2 (Sesión)
 */
@Serializable
data class ExerciseSessionDto(
    val sessionId: String,
    val userId: String,
    val status: SessionStatus,
    val sportType: SportType,
    val timestampStart: Long,
    val timestampEnd: Long? = null,
    val totalBlocks: Int = 0,
    val totalXp: Int = 0
)