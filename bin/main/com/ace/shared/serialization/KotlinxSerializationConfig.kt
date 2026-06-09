package com.ace.shared.serialization

import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule

/**
 * Configuración centralizada de kotlinx-serialization JSON.
 * Usada por backend (Spring Boot 4.0 starter) y mobile.
 *
 * @see Apéndice S3 (Sync)
 */
object KotlinxSerializationConfig {

    /**
     * Configuración por defecto: tolerante para consumo de APIs,
     * ignora claves desconocidas, no falla por nulls.
     */
    val json: Json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        encodeDefaults = true
        prettyPrint = false
    }

    /**
     * Configuración estricta para tests y validación de contratos.
     */
    val strictJson: Json = Json {
        ignoreUnknownKeys = false
        isLenient = false
        encodeDefaults = true
        prettyPrint = true
    }

    /**
     * Permite extender con módulos de serialización polimórfica si se necesita en el futuro.
     */
    fun withModule(module: SerializersModule): Json = Json(from = json) {
        serializersModule = module
    }
}