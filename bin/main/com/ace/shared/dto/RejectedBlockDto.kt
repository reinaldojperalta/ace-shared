package com.ace.shared.dto

import kotlinx.serialization.Serializable

/**
 * DTO que describe un bloque rechazado por el backend.
 *
 * @see Apéndice S3 (Sync) · Apéndice S5 (XP)
 */
@Serializable
data class RejectedBlockDto(
    val blockId: String,
    val reason: String,
    val ruleViolated: String
)