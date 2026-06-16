package com.ace.shared.constants

/**
 * Paths del Wear OS Data Layer API.
 * Usados por mobile (consumidor de :shared) y hardcodeados en wear como strings literales.
 *
 * @see Apéndice S1 (Captura de Sensor)
 */
object DataLayerPaths {
    const val HEART_RATE = "/ace/health/heart_rate"
    const val SESSION_STATUS_PREFIX = "/ace/session/"
    const val COMMAND = "/ace/command"
    const val INITIAL_SYNC = "/ace/initial_sync"
    const val START_COMMAND = "START"
const val STOP_COMMAND = "STOP"

    fun sessionStatusPath(sessionId: String): String =
        "$SESSION_STATUS_PREFIX$sessionId/status"
}