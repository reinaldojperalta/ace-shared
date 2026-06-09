package com.ace.shared.serialization

import com.google.gson.GsonBuilder
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.Instant

class InstantAdapterTest {

    private val gson = GsonBuilder()
        .registerTypeAdapter(Instant::class.java, InstantAdapter())
        .create()

    @Test
    fun `should serialize Instant to epoch millis`() {
        val instant = Instant.ofEpochMilli(1717315200000L)

        val json = gson.toJson(instant)

        assertThat(json).isEqualTo("1717315200000")
    }

    @Test
    fun `should deserialize epoch millis to Instant`() {
        val instant = gson.fromJson("1717315200000", Instant::class.java)

        assertThat(instant.toEpochMilli()).isEqualTo(1717315200000L)
    }

    @Test
    fun `should handle null Instant`() {
        val json = gson.toJson(null as Instant?)

        assertThat(json).isEqualTo("null")
    }
}