package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO para solicitud de actualización parcial de perfil (PATCH semántico).
 * Body de PUT /api/profile.
 *
 * Todos los campos son opcionales para permitir actualización parcial.
 * El backend aplica solo los campos no-nulos.
 *
 * @see Apéndice S10 (Perfil y Estadísticas)
 * @since 1.0.6
 */
@Serializable
data class UpdateProfileRequestDto(
    val username: String? = null,
    val nickname: String? = null,
    val cityId: String? = null,
    val weightKg: Double? = null,
    val birthDate: String? = null   // ISO-8601 (YYYY-MM-DD)
)