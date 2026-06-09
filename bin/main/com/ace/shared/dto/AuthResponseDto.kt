package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO de respuesta tras login/registro exitoso.
 * Contiene el par de tokens JWT + información del usuario.
 *
 * @see Apéndice S4 (Autenticación JWT Híbrida)
 */
@Serializable
data class AuthResponseDto(
    val accessToken: String,
    val refreshToken: String,
    val tokenType: String = "Bearer",
    val expiresIn: Long = 900, // 15 minutos en segundos
    val userId: String,
    val email: String
)