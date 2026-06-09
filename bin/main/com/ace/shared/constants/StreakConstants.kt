package com.ace.shared.constants

/**
 * Constantes del sistema de racha (streaks).
 *
 * @see Apéndice S7 (Racha)
 */
object StreakConstants {
    /** Hora local del recordatorio diario de racha (20:00) */
    const val STREAK_REMINDER_HOUR = 20

    /** Minuto del recordatorio diario */
    const val STREAK_REMINDER_MINUTE = 0

    /** Tag del WorkManager para recordatorio de racha */
    const val STREAK_WORKER_TAG = "ace_streak_reminder"
}