package com.ace.shared.constants

/**
 * Constantes del sistema de ranking y posicionamiento.
 *
 * @see Apéndice S6 (Ranking)
 */
object RankingConstants {
    /** Cantidad de posiciones en el top devuelto por el backend */
    const val TOP_GLOBAL_SIZE = 100

    /** Cantidad de posiciones cacheadas localmente en el móvil */
    const val TOP_LOCAL_CACHE_SIZE = 10

    /** TTL del cache de ranking en horas */
    const val RANKING_CACHE_TTL_HOURS = 1

    /** Cron del job de recálculo de ranking (cada hora) */
    const val RANKING_RECALCULATION_CRON = "0 0 * * * *"
}