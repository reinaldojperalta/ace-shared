package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que representa el perfil completo de un usuario.
 * Respuesta de GET /api/profile.
 *
 * @see Apéndice S10 (Perfil y Estadísticas)
 * @since 1.0.6
 */
@Serializable
data class UserProfileDto(
    val userId: String,
    val username: String,
    val nickname: String?,
    val cityId: String?,
    val weightKg: Double?,
    val birthDate: String?   // ISO-8601 (YYYY-MM-DD)
)