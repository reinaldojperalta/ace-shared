package com.ace.shared.enums

import kotlinx.serialization.Serializable

/**
 * Identificadores de canales de notificación de Android.
 * Definidos en :shared para coherencia entre backend y mobile.
 *
 * @see Apéndice S8 (Notificaciones)
 */
@Serializable
enum class NotificationChannelId(val channelId: String) {
    SESSION_ACTIVE("ace_session_active"),
    STREAK_REMINDER("ace_streak_reminder"),
    SYNC_ERROR("ace_sync_error")
}