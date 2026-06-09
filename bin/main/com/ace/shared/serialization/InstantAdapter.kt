package com.ace.shared.serialization

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.time.Instant

/**
 * Adapter Gson para serializar/deserializar [Instant] como epoch millis (Long).
 *
 * A.C.E usa epoch millis en todos los timestamps para coherencia entre plataformas.
 *
 * @see Apéndice S1 (Captura de Sensor)
 */
class InstantAdapter : TypeAdapter<Instant>() {

    override fun write(out: JsonWriter, value: Instant?) {
        if (value == null) {
            out.nullValue()
        } else {
            out.value(value.toEpochMilli())
        }
    }

    override fun read(input: JsonReader): Instant? {
        return if (input.peek() == com.google.gson.stream.JsonToken.NULL) {
            input.nextNull()
            null
        } else {
            Instant.ofEpochMilli(input.nextLong())
        }
    }
}