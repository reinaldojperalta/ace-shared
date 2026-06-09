package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que define la fórmula de cálculo de XP para un deporte específico.
 * El backend expone; el móvil cachea y aplica localmente.
 *
 * @see Apéndice S5 (Cálculo de XP)
 */
@Serializable
data class XpFormulaDto(
    val sportType: com.ace.shared.enums.SportType,
    val minBpm: Int,
    val xpPerMinute: Int,
    val maxXpPerBlock: Int,
    val version: Int = 1
)