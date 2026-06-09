package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO para solicitud de login/registro.
 *
 * @see Apéndice S4 (Autenticación JWT Híbrida)
 */
@Serializable
data class AuthRequestDto(
    val email: String,
    val password: String,
    val deviceId: String? = null
)