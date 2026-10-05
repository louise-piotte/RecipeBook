package app.recipebook.data.local.recipes

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.descriptors.StructureKind
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/** The request schema follows the same serializable DTOs consumed by recipe parsing. */
@OptIn(ExperimentalSerializationApi::class)
internal fun SerialDescriptor.toRecipeJsonSchema(includeNull: Boolean = true): JsonObject {
    val schema = buildJsonObject {
        when (kind) {
            PrimitiveKind.STRING, PrimitiveKind.CHAR, SerialKind.ENUM -> {
                put("type", "string")
                if (kind == SerialKind.ENUM) put("enum", JsonArray((0 until elementsCount).map { JsonPrimitive(getElementName(it)) }))
            }
            PrimitiveKind.BOOLEAN -> put("type", "boolean")
            PrimitiveKind.BYTE, PrimitiveKind.SHORT, PrimitiveKind.INT, PrimitiveKind.LONG -> put("type", "integer")
            PrimitiveKind.FLOAT, PrimitiveKind.DOUBLE -> put("type", "number")
            StructureKind.LIST -> { put("type", "array"); put("items", getElementDescriptor(0).toRecipeJsonSchema()) }
            StructureKind.CLASS, StructureKind.OBJECT -> {
                put("type", "object")
                put("properties", buildJsonObject {
                    for (i in 0 until elementsCount) put(getElementName(i), getElementDescriptor(i).toRecipeJsonSchema())
                })
                put("required", JsonArray((0 until elementsCount).map { JsonPrimitive(getElementName(it)) }))
                put("additionalProperties", false)
            }
            else -> error("unsupported_recipe_schema")
        }
    }
    return if (includeNull && isNullable) buildJsonObject {
        put("anyOf", JsonArray(listOf(schema, buildJsonObject { put("type", "null") })))
    } else schema
}
