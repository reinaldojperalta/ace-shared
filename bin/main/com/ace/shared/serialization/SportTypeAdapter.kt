package com.ace.shared.serialization

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import com.ace.shared.enums.SportType

/**
 * Adapter Gson para serializar/deserializar [SportType] como String.
 *
 * @see Apéndice S2 (Sesión)
 */
class SportTypeAdapter : TypeAdapter<SportType>() {

    override fun write(out: JsonWriter, value: SportType?) {
        if (value == null) {
            out.nullValue()
        } else {
            out.value(value.name)
        }
    }

    override fun read(input: JsonReader): SportType? {
        return try {
            val name = input.nextString()
            SportType.valueOf(name)
        } catch (e: IllegalArgumentException) {
            null
        } catch (e: IllegalStateException) {
            input.nextNull()
            null
        }
    }
}