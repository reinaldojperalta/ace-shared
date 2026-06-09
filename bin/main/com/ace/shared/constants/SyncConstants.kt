package com.ace.shared.constants

/**
 * Constantes del sistema de sincronización offline-first.
 *
 * @see Apéndice S3 (Sync)
 */
object SyncConstants {
    /** Máximo de bloques por batch de sync */
    const val BATCH_MAX_SIZE = 20

    /** Duración objetivo de un bloque en segundos (~5 minutos) */
    const val BLOCK_DURATION_SECONDS = 300

    /** Tolerancia de duración de bloque: ±10% */
    const val BLOCK_DURATION_TOLERANCE_PERCENT = 10

    /** Duración mínima aceptable de un bloque (270s) */
    val BLOCK_MIN_DURATION: Int
        get() = BLOCK_DURATION_SECONDS * (100 - BLOCK_DURATION_TOLERANCE_PERCENT) / 100

    /** Duración máxima aceptable de un bloque (330s) */
    val BLOCK_MAX_DURATION: Int
        get() = BLOCK_DURATION_SECONDS * (100 + BLOCK_DURATION_TOLERANCE_PERCENT) / 100

    /** Delay inicial de reintento (15 minutos en millis) */
    const val RETRY_DELAY_INITIAL_MS = 15L * 60L * 1000L

    /** Factor de backoff exponencial */
    const val RETRY_BACKOFF_MULTIPLIER = 2.0

    /** Máximo de reintentos antes de marcar ERROR */
    const val MAX_RETRIES = 5

    /** Timeout de desconexión del reloj en segundos */
    const val WATCH_DISCONNECT_TIMEOUT_SECONDS = 5

    /** Schema version actual de los DTOs */
    const val CURRENT_SCHEMA_VERSION = 1
}