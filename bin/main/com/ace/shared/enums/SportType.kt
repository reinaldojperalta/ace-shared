package com.ace.shared.enums

import kotlinx.serialization.Serializable

/**
 * Tipos de actividad deportiva soportados por A.C.E.
 *
 * @see Apéndice S2 (Sesión)
 */
@Serializable
enum class SportType {
    RUNNING,
    CYCLING,
    WALKING
}