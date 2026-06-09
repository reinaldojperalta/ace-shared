package com.ace.shared.constants

/**
 * Constantes del sistema de autenticación JWT híbrida.
 *
 * @see Apéndice S4 (Autenticación JWT Híbrida)
 */
object AuthConstants {
    /** Duración del access token en minutos */
    const val ACCESS_TOKEN_TTL_MINUTES = 15

    /** Duración del refresh token en días */
    const val REFRESH_TOKEN_TTL_DAYS = 7

    /** Header HTTP de autorización */
    const val AUTHORIZATION_HEADER = "Authorization"

    /** Prefijo del token Bearer */
    const val BEARER_PREFIX = "Bearer"

    /** Margen de seguridad para expiración local (60 segundos) */
    const val EXPIRATION_MARGIN_SECONDS = 60

    /** Código de error: refresh token reutilizado (posible robo) */
    const val ERROR_REFRESH_REUSED = "REFRESH_REUSED"

    /** Código de error: refresh token revocado */
    const val ERROR_REFRESH_REVOKED = "REFRESH_REVOKED"

    /** Código de error: refresh token inválido o expirado */
    const val ERROR_REFRESH_INVALID = "REFRESH_INVALID"
}