package com.ace.shared.constants

/**
 * Constantes del sistema de cálculo de XP y gamificación.
 *
 * @see Apéndice S5 (Cálculo de XP)
 */
object XpConstants {
    /** Header para versión de fórmula en respuestas del backend */
    const val FORMULA_VERSION_HEADER = "X-Formula-Version"

    /** Rango mínimo fisiológico de BPM aceptable */
    const val MIN_BPM_PHYSIOLOGICAL = 30

    /** Rango máximo fisiológico de BPM aceptable */
    const val MAX_BPM_PHYSIOLOGICAL = 250

    /** Umbral de discrepancia silenciosa en XP (menor a esto: sin notificación) */
    const val SILENT_CORRECTION_THRESHOLD_XP = 10

    /** Razones de transacción XP */
    object XpReason {
        const val BLOCK_VALIDATED = "BLOCK_VALIDATED"
        const val CORRECTION = "CORRECTION"
        const val MANUAL_ADJUST = "MANUAL_ADJUST"
    }
}