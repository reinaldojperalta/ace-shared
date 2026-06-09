package com.ace.shared.serialization

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.util.UUID

/**
 * Adapter Gson para serializar/deserializar [UUID] como String.
 *
 * @see Apéndice S2 (Sesión) — block_id y session_id son UUID
 */
class UuidAdapter : TypeAdapter<UUID>() {

    override fun write(out: JsonWriter, value: UUID?) {
        if (value == null) {
            out.nullValue()
        } else {
            out.value(value.toString())
        }
    }

    override fun read(input: JsonReader): UUID? {
        return if (input.peek() == com.google.gson.stream.JsonToken.NULL) {
            input.nextNull()
            null
        } else {
            UUID.fromString(input.nextString())
        }
    }
}