package com.ace.shared.enums

import kotlinx.serialization.Serializable

/**
 * Estados del ciclo de vida de una sesión de ejercicio.
 *
 * @see Apéndice S2 (Sesión)
 */
@Serializable
enum class SessionStatus {
    ACTIVE,
    PAUSED,
    COMPLETED,
    ABORTED
}