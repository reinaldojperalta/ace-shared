package com.ace.shared.constants

/**
 * Endpoints REST del backend.
 * Centraliza las rutas para evitar discrepancias entre mobile y backend.
 *
 * @see Apéndice S3 (Sync) · Apéndice S4 (Auth) · Apéndice S6 (Ranking)
 */
object ApiEndpoints {
    // Auth
    const val AUTH_LOGIN = "/api/auth/login"
    const val AUTH_REGISTER = "/api/auth/register"
    const val AUTH_REFRESH = "/api/auth/refresh"
    const val AUTH_LOGOUT = "/api/auth/logout"

    // Exercise
    const val EXERCISE_BLOCKS = "/api/exercise/blocks"

    // XP / Gamification
    const val XP_FORMULAS = "/api/xp/formulas"

    // Ranking
    const val RANKING_GLOBAL = "/api/ranking/global"
    const val RANKING_MUNICIPAL = "/api/ranking/municipal"

    // User
    const val USER_PROFILE = "/api/user/profile"
    const val USER_STATS = "/api/user/stats"
}