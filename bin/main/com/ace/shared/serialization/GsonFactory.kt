package com.ace.shared.serialization

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.time.Instant
import java.util.UUID

/**
 * Factory centralizada para instancias de Gson configuradas.
 * Coherente entre backend (Spring Boot) y mobile (Retrofit).
 *
 * @see Apéndice S3 (Sync)
 */
object GsonFactory {

    /**
     * Gson estándar con adapters para tipos comunes.
     * Usado por Retrofit en mobile y por Spring Boot en backend.
     */
    @JvmStatic
    fun create(): Gson = GsonBuilder()
        .registerTypeAdapter(Instant::class.java, InstantAdapter())
        .registerTypeAdapter(UUID::class.java, UuidAdapter())
        .setPrettyPrinting()
        .create()

    /**
     * Gson compacto sin pretty-printing para producción.
     */
    @JvmStatic
    fun createCompact(): Gson = GsonBuilder()
        .registerTypeAdapter(Instant::class.java, InstantAdapter())
        .registerTypeAdapter(UUID::class.java, UuidAdapter())
        .create()
}