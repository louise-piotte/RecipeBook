package app.recipebook

import app.recipebook.data.schema.UnitDefinitionDto
import app.recipebook.data.schema.IngredientFormDto
import app.recipebook.data.schema.PackageYieldObservationDto
import app.recipebook.data.schema.RecipeCreationPayloadDto
import app.recipebook.data.schema.RecipeDto
import app.recipebook.data.schema.toDomain
import app.recipebook.data.schema.toDomainRecipe
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.PackageYieldObservation
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitType
import java.io.File
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

private val bundledSeedJson = Json { ignoreUnknownKeys = true }
private val bundledSeedRoot = File("src/main/assets/seed/bundled-library")

internal fun loadBundledUnitDefinitionsForTest(): List<UnitDefinition> {
    val path = File(bundledSeedRoot, "units.v1.json")
    val dtos = bundledSeedJson.decodeFromString(ListSerializer(UnitDefinitionDto.serializer()), path.readText())
    return dtos.map { dto ->
        UnitDefinition(
            unitId = dto.unitId,
            symbol = dto.symbol,
            nameFr = dto.nameFr,
            nameEn = dto.nameEn,
            type = UnitType.valueOf(dto.type.uppercase()),
            baseUnitId = dto.baseUnitId,
            toBaseFactor = dto.toBaseFactor
        )
    }
}

internal fun loadBundledIngredientFormsForTest(): List<IngredientForm> =
    bundledSeedJson.decodeFromString(
        ListSerializer(IngredientFormDto.serializer()),
        File(bundledSeedRoot, "ingredient-forms.v1.json").readText()
    ).map(IngredientFormDto::toDomain)

internal fun loadBundledPackageYieldObservationsForTest(): List<PackageYieldObservation> =
    bundledSeedJson.decodeFromString(
        ListSerializer(PackageYieldObservationDto.serializer()),
        File(bundledSeedRoot, "package-yields.v1.json").readText()
    ).map(PackageYieldObservationDto::toDomain)

internal fun loadBundledRecipeForTest(recipeId: String): Recipe {
    val manifest = bundledSeedJson.parseToJsonElement(File(bundledSeedRoot, "manifest.v1.json").readText()).jsonObject
    val recipeFiles = manifest.getValue("recipeFiles").jsonArray.map { it.jsonPrimitive.content }
    val dto = recipeFiles.asSequence()
        .map { fileName ->
            bundledSeedJson.decodeFromString(
                RecipeDto.serializer(),
                File(bundledSeedRoot, fileName).readText()
            )
        }
        .first { it.id == recipeId }
    return RecipeCreationPayloadDto(recipe = dto).toDomainRecipe()
}
