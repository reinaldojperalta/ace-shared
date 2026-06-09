package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO para solicitud de renovación de tokens (refresh).
 *
 * @see Apéndice S4 (Autenticación JWT Híbrida)
 */
@Serializable
data class RefreshTokenRequestDto(
    val refreshToken: String,
    val deviceId: String
)