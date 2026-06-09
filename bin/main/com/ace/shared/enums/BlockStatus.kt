package com.ace.shared.enums

import kotlinx.serialization.Serializable

/**
 * Estados de un bloque en el ciclo de vida de sincronización.
 *
 * @see Apéndice S3 (Sync)
 */
@Serializable
enum class BlockStatus {
    OPEN,       // En RAM, recibiendo muestras
    CLOSED,     // Métricas agregadas, listo para persistir
    PENDING,    // En SQLite, esperando sync
    SYNCING,    // En vuelo hacia el backend
    SYNCED,     // Backend confirmó con 201
    ERROR       // Rechazado (422) o agotados reintentos
}