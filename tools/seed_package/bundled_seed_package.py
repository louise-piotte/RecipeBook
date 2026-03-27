from __future__ import annotations

import json
from collections import defaultdict
from pathlib import Path
from typing import Any


REPO_ROOT = Path(__file__).resolve().parents[2]
SEED_ROOT = REPO_ROOT / "app" / "src" / "main" / "assets" / "seed" / "bundled-library"
MANIFEST_PATH = SEED_ROOT / "manifest.v1.json"
SEED_PACKAGE_SCHEMA_VERSION = "bundled-seed-package/v1"

PART_KEY_ORDER = (
    "metadataFile",
    "recipesFile",
    "ingredientReferencesFile",
    "ingredientFormsFile",
    "substitutionRulesFile",
    "contextualSubstitutionRulesFile",
    "unitsFile",
    "tagsFile",
    "collectionsFile",
    "settingsFile",
)


def dedupe_preserve_order(values: list[str]) -> list[str]:
    seen: set[str] = set()
    result: list[str] = []
    for value in values:
        normalized = value.strip()
        if not normalized:
            continue
        key = normalized.casefold()
        if key in seen:
            continue
        seen.add(key)
        result.append(normalized)
    return result


def normalize_ingredient_reference_entry(entry: dict[str, Any]) -> None:
    name_fr = entry["nameFr"].strip()
    name_en = entry["nameEn"].strip()

    entry["nameFr"] = name_fr
    entry["nameEn"] = name_en
    entry["aliasesFr"] = dedupe_preserve_order(entry.get("aliasesFr", []))
    entry["aliasesEn"] = dedupe_preserve_order(entry.get("aliasesEn", []))

    if name_fr.casefold() != name_en.casefold():
        entry["aliasesFr"] = [alias for alias in entry["aliasesFr"] if alias.casefold() != name_en.casefold()]
        entry["aliasesEn"] = [alias for alias in entry["aliasesEn"] if alias.casefold() != name_fr.casefold()]

    entry["aliasesFr"] = [alias for alias in entry["aliasesFr"] if alias.casefold() != name_fr.casefold()]
    entry["aliasesEn"] = [alias for alias in entry["aliasesEn"] if alias.casefold() != name_en.casefold()]


def apply_curated_ingredient_reference_normalization(entry: dict[str, Any]) -> None:
    entry_id = entry["id"]

    if entry_id == "ingredient-ref-creme-fraiche":
        entry["nameEn"] = "creme fraiche"
        entry["aliasesEn"] = ["cr\u00e8me fra\u00eeche"]
    elif entry_id == "ingredient-ref-gruyere":
        entry["nameEn"] = "gruyere"
        entry["aliasesEn"] = ["gruy\u00e8re", "gruyere cheese", "gruy\u00e8re cheese"]
    elif entry_id == "ingredient-ref-thyme":
        entry["nameFr"] = "thym"
        entry["nameEn"] = "thyme"
        entry["aliasesFr"] = ["thym frais"]
        entry["aliasesEn"] = ["fresh thyme"]
    elif entry_id == "ingredient-ref-rosemary-sprigs":
        entry["nameFr"] = "romarin"
        entry["nameEn"] = "rosemary"
        entry["aliasesFr"] = ["romarin frais"]
        entry["aliasesEn"] = ["rosemary sprigs", "fresh rosemary"]
    elif entry_id == "ingredient-ref-plain-yogurt":
        entry["aliasesFr"] = []
        entry["aliasesEn"] = ["plain yoghurt"]
    elif entry_id == "ingredient-ref-ground-dried-candy-cap-mushrooms":
        entry["nameFr"] = "lactaires s\u00e9ch\u00e9s moulus"
        entry["aliasesFr"] = ["lactaires s\u00e9ch\u00e9s et moulus"]
    elif entry_id == "ingredient-ref-cerises-au-marasquin":
        entry["nameEn"] = "maraschino cherries"
        entry["aliasesEn"] = ["marasquino cherries"]
    elif entry_id == "ingredient-ref-jus-du-pot-de-cerises-au-marasquin":
        entry["nameEn"] = "maraschino cherry juice"
        entry["aliasesEn"] = ["marasquino cherry juice"]


def normalize_ingredient_references(data: list[dict[str, Any]]) -> list[dict[str, Any]]:
    for entry in data:
        apply_curated_ingredient_reference_normalization(entry)
        normalize_ingredient_reference_entry(entry)
    return data


def normalize_recipes(data: list[dict[str, Any]]) -> list[dict[str, Any]]:
    for recipe in data:
        recipe["tags"] = dedupe_preserve_order(recipe.get("tags", []))
        recipe["collections"] = dedupe_preserve_order(recipe.get("collections", []))
        if "photos" in recipe:
            seen_photo_ids: set[str] = set()
            normalized_photos: list[dict[str, Any]] = []
            for photo in recipe.get("photos", []):
                photo_id = photo["id"].strip()
                if photo_id in seen_photo_ids:
                    continue
                seen_photo_ids.add(photo_id)
                normalized_photos.append(
                    {
                        **photo,
                        "id": photo_id,
                        "relativePath": photo["relativePath"].strip().replace("\\", "/"),
                    }
                )
            recipe["photos"] = normalized_photos
        if "attachments" in recipe:
            seen_attachment_ids: set[str] = set()
            normalized_attachments: list[dict[str, Any]] = []
            for attachment in recipe.get("attachments", []):
                attachment_id = attachment["id"].strip()
                if attachment_id in seen_attachment_ids:
                    continue
                seen_attachment_ids.add(attachment_id)
                normalized_attachments.append(
                    {
                        **attachment,
                        "id": attachment_id,
                        "relativePath": attachment["relativePath"].strip().replace("\\", "/"),
                    }
                )
            recipe["attachments"] = normalized_attachments
    return data


def normalize_tags(data: list[dict[str, Any]]) -> list[dict[str, Any]]:
    for tag in data:
        tag["id"] = tag["id"].strip()
        tag["slug"] = tag["slug"].strip()
        tag["nameFr"] = tag["nameFr"].strip()
        tag["nameEn"] = tag["nameEn"].strip()
    return data


def normalize_units(data: list[dict[str, Any]]) -> list[dict[str, Any]]:
    for unit in data:
        unit["unitId"] = unit["unitId"].strip()
        unit["symbol"] = unit["symbol"].strip()
        unit["nameFr"] = unit["nameFr"].strip()
        unit["nameEn"] = unit["nameEn"].strip()
    return data


def normalize_collections(data: list[dict[str, Any]]) -> list[dict[str, Any]]:
    for collection in data:
        collection["id"] = collection["id"].strip()
        collection["nameFr"] = collection["nameFr"].strip()
        collection["nameEn"] = collection["nameEn"].strip()
        collection["recipeIds"] = dedupe_preserve_order(collection.get("recipeIds", []))
    return data


def normalize_identity_list(data: list[dict[str, Any]], id_key: str) -> list[dict[str, Any]]:
    for item in data:
        item[id_key] = item[id_key].strip()
    return data


def normalize_metadata(data: dict[str, Any]) -> dict[str, Any]:
    return {
        **data,
        "libraryId": data["libraryId"].strip(),
        "appVersion": data.get("appVersion"),
    }


def normalize_settings(data: dict[str, Any]) -> dict[str, Any]:
    normalized = dict(data)
    if normalized.get("language") is not None:
        normalized["language"] = normalized["language"].strip().lower()
    return normalized


def normalize_manifest(data: dict[str, Any]) -> dict[str, Any]:
    normalized = dict(data)
    normalized["schemaVersion"] = normalized["schemaVersion"].strip()
    normalized["packageId"] = normalized["packageId"].strip()
    for key in PART_KEY_ORDER:
        normalized[key] = normalized[key].strip().replace("\\", "/")
    return normalized


def normalize_part(part_name: str, data: Any) -> Any:
    if part_name == "manifest":
        return normalize_manifest(data)
    if part_name == "metadata":
        return normalize_metadata(data)
    if part_name == "settings":
        return normalize_settings(data)
    if part_name == "ingredientReferences":
        return normalize_ingredient_references(data)
    if part_name == "recipes":
        return normalize_recipes(data)
    if part_name == "tags":
        return normalize_tags(data)
    if part_name == "units":
        return normalize_units(data)
    if part_name == "collections":
        return normalize_collections(data)
    if part_name == "ingredientForms":
        return normalize_identity_list(data, "id")
    if part_name == "substitutionRules":
        return normalize_identity_list(data, "id")
    if part_name == "contextualSubstitutionRules":
        return normalize_identity_list(data, "id")
    return data


def serialize_json(data: Any) -> str:
    return json.dumps(data, indent=2, ensure_ascii=True) + "\n"


def load_json(path: Path) -> Any:
    return json.loads(path.read_text(encoding="utf-8"))


def load_seed_package() -> tuple[dict[str, Any], dict[str, Path], dict[str, Any]]:
    manifest = normalize_manifest(load_json(MANIFEST_PATH))
    part_paths = {
        "manifest": MANIFEST_PATH,
        "metadata": SEED_ROOT / manifest["metadataFile"],
        "recipes": SEED_ROOT / manifest["recipesFile"],
        "ingredientReferences": SEED_ROOT / manifest["ingredientReferencesFile"],
        "ingredientForms": SEED_ROOT / manifest["ingredientFormsFile"],
        "substitutionRules": SEED_ROOT / manifest["substitutionRulesFile"],
        "contextualSubstitutionRules": SEED_ROOT / manifest["contextualSubstitutionRulesFile"],
        "units": SEED_ROOT / manifest["unitsFile"],
        "tags": SEED_ROOT / manifest["tagsFile"],
        "collections": SEED_ROOT / manifest["collectionsFile"],
        "settings": SEED_ROOT / manifest["settingsFile"],
    }
    payload = {part_name: load_json(path) for part_name, path in part_paths.items()}
    return manifest, part_paths, payload


def normalize_seed_package(payload: dict[str, Any]) -> dict[str, Any]:
    return {part_name: normalize_part(part_name, data) for part_name, data in payload.items()}


def validate_unique_ids(items: list[dict[str, Any]], id_key: str, label: str) -> list[str]:
    counts: dict[str, int] = defaultdict(int)
    for item in items:
        counts[item[id_key]] += 1
    return [f"duplicate {label} id: {item_id}" for item_id, count in counts.items() if count > 1]


def validate_seed_package(payload: dict[str, Any], part_paths: dict[str, Path]) -> list[str]:
    errors: list[str] = []
    manifest = payload["manifest"]

    if manifest["schemaVersion"] != SEED_PACKAGE_SCHEMA_VERSION:
        errors.append(f"unexpected manifest schemaVersion: {manifest['schemaVersion']}")

    for part_name, path in part_paths.items():
        if not path.exists():
            errors.append(f"missing seed package part: {part_name} -> {path}")

    ingredient_references = payload["ingredientReferences"]
    ingredient_reference_ids = {item["id"] for item in ingredient_references}
    ingredient_form_ids = {item["id"] for item in payload["ingredientForms"]}
    substitution_rule_ids = {item["id"] for item in payload["substitutionRules"]}
    contextual_substitution_rule_ids = {item["id"] for item in payload["contextualSubstitutionRules"]}
    tag_ids = {item["id"] for item in payload["tags"]}
    collection_ids = {item["id"] for item in payload["collections"]}
    unit_ids = {item["unitId"] for item in payload["units"]}
    recipe_ids = {item["id"] for item in payload["recipes"]}

    errors.extend(validate_unique_ids(payload["ingredientReferences"], "id", "ingredient reference"))
    errors.extend(validate_unique_ids(payload["ingredientForms"], "id", "ingredient form"))
    errors.extend(validate_unique_ids(payload["substitutionRules"], "id", "substitution rule"))
    errors.extend(validate_unique_ids(payload["contextualSubstitutionRules"], "id", "contextual substitution rule"))
    errors.extend(validate_unique_ids(payload["tags"], "id", "tag"))
    errors.extend(validate_unique_ids(payload["collections"], "id", "collection"))
    errors.extend(validate_unique_ids(payload["recipes"], "id", "recipe"))
    errors.extend(validate_unique_ids(payload["units"], "unitId", "unit"))

    tag_slugs = defaultdict(int)
    for tag in payload["tags"]:
        tag_slugs[tag["slug"]] += 1
    errors.extend([f"duplicate tag slug: {slug}" for slug, count in tag_slugs.items() if count > 1])

    alias_owners: dict[str, set[str]] = defaultdict(set)
    for reference in ingredient_references:
        canonical_fr = reference["nameFr"].strip().lower()
        canonical_en = reference["nameEn"].strip().lower()
        aliases_fr = reference.get("aliasesFr", [])
        aliases_en = reference.get("aliasesEn", [])

        if aliases_fr != dedupe_preserve_order(aliases_fr):
            errors.append(f"ingredient reference aliasesFr not normalized: {reference['id']}")
        if aliases_en != dedupe_preserve_order(aliases_en):
            errors.append(f"ingredient reference aliasesEn not normalized: {reference['id']}")
        if any(alias.strip().lower() == canonical_fr for alias in aliases_fr):
            errors.append(f"ingredient reference aliasesFr repeats canonical FR name: {reference['id']}")
        if any(alias.strip().lower() == canonical_en for alias in aliases_en):
            errors.append(f"ingredient reference aliasesEn repeats canonical EN name: {reference['id']}")
        if canonical_fr != canonical_en and any(alias.strip().lower() == canonical_en for alias in aliases_fr):
            errors.append(f"ingredient reference aliasesFr repeats canonical EN name: {reference['id']}")
        if canonical_fr != canonical_en and any(alias.strip().lower() == canonical_fr for alias in aliases_en):
            errors.append(f"ingredient reference aliasesEn repeats canonical FR name: {reference['id']}")

        for key in [reference["nameFr"], reference["nameEn"], *aliases_fr, *aliases_en]:
            alias_owners[key.strip().lower()].add(reference["id"])

        for mapping in reference.get("unitMappings", []):
            if mapping["toUnit"] not in unit_ids:
                errors.append(f"ingredient reference {reference['id']} maps to unknown unit: {mapping['toUnit']}")

    for key, owners in alias_owners.items():
        if len(owners) > 1:
            errors.append(f"ingredient reference name/alias collision: {key} -> {sorted(owners)}")

    for unit in payload["units"]:
        base_unit_id = unit.get("baseUnitId")
        if base_unit_id is not None and base_unit_id not in unit_ids:
            errors.append(f"unit {unit['unitId']} references unknown baseUnitId: {base_unit_id}")

    for ingredient_form in payload["ingredientForms"]:
        if ingredient_form["ingredientRefId"] not in ingredient_reference_ids:
            errors.append(
                f"ingredient form {ingredient_form['id']} references unknown ingredientRefId: "
                f"{ingredient_form['ingredientRefId']}"
            )

    for substitution_rule in payload["substitutionRules"]:
        if substitution_rule["fromFormId"] not in ingredient_form_ids:
            errors.append(
                f"substitution rule {substitution_rule['id']} references unknown fromFormId: "
                f"{substitution_rule['fromFormId']}"
            )
        if substitution_rule["toFormId"] not in ingredient_form_ids:
            errors.append(
                f"substitution rule {substitution_rule['id']} references unknown toFormId: "
                f"{substitution_rule['toFormId']}"
            )

    for contextual_rule in payload["contextualSubstitutionRules"]:
        if contextual_rule["fromIngredientRefId"] not in ingredient_reference_ids:
            errors.append(
                f"contextual substitution rule {contextual_rule['id']} references unknown fromIngredientRefId: "
                f"{contextual_rule['fromIngredientRefId']}"
            )
        if contextual_rule["toIngredientRefId"] not in ingredient_reference_ids:
            errors.append(
                f"contextual substitution rule {contextual_rule['id']} references unknown toIngredientRefId: "
                f"{contextual_rule['toIngredientRefId']}"
            )

    for collection in payload["collections"]:
        for recipe_id in collection.get("recipeIds", []):
            if recipe_id not in recipe_ids:
                errors.append(f"collection {collection['id']} references unknown recipeId: {recipe_id}")

    for recipe in payload["recipes"]:
        photo_ids = {photo["id"] for photo in recipe.get("photos", [])}
        attachment_ids = {attachment["id"] for attachment in recipe.get("attachments", [])}
        ingredient_line_ids = set()

        if recipe.get("mainPhotoId") is not None and recipe["mainPhotoId"] not in photo_ids:
            errors.append(f"recipe {recipe['id']} mainPhotoId does not match any photo: {recipe['mainPhotoId']}")

        for tag_id in recipe.get("tags", []):
            if tag_id not in tag_ids:
                errors.append(f"recipe {recipe['id']} references unknown tag: {tag_id}")
        for collection_id in recipe.get("collections", []):
            if collection_id not in collection_ids:
                errors.append(f"recipe {recipe['id']} references unknown collection: {collection_id}")

        for photo in recipe.get("photos", []):
            if not photo["relativePath"].startswith("photos/"):
                errors.append(f"recipe {recipe['id']} photo path is not portable: {photo['relativePath']}")
        for attachment in recipe.get("attachments", []):
            if not attachment["relativePath"].startswith("attachments/"):
                errors.append(f"recipe {recipe['id']} attachment path is not portable: {attachment['relativePath']}")

        if len(photo_ids) != len(recipe.get("photos", [])):
            errors.append(f"recipe {recipe['id']} has duplicate photo ids")
        if len(attachment_ids) != len(recipe.get("attachments", [])):
            errors.append(f"recipe {recipe['id']} has duplicate attachment ids")

        for ingredient in recipe.get("ingredients", []):
            ingredient_id = ingredient["id"]
            if ingredient_id in ingredient_line_ids:
                errors.append(f"recipe {recipe['id']} has duplicate ingredient line id: {ingredient_id}")
            ingredient_line_ids.add(ingredient_id)

            ingredient_ref_id = ingredient.get("ingredientRefId")
            if ingredient_ref_id is not None and ingredient_ref_id not in ingredient_reference_ids:
                errors.append(
                    f"recipe {recipe['id']} ingredient line {ingredient_id} references unknown ingredientRefId: "
                    f"{ingredient_ref_id}"
                )

            for substitution in ingredient.get("substitutions", []):
                if substitution["ingredientLineId"] != ingredient_id:
                    errors.append(
                        f"recipe {recipe['id']} substitution {substitution['id']} does not match ingredientLineId: "
                        f"{substitution['ingredientLineId']}"
                    )
                substitution_rule_id = substitution.get("substitutionRuleId")
                if substitution_rule_id is not None and substitution_rule_id not in substitution_rule_ids:
                    errors.append(
                        f"recipe {recipe['id']} substitution {substitution['id']} references unknown "
                        f"substitutionRuleId: {substitution_rule_id}"
                    )
                contextual_rule_id = substitution.get("contextualSubstitutionRuleId")
                if contextual_rule_id is not None and contextual_rule_id not in contextual_substitution_rule_ids:
                    errors.append(
                        f"recipe {recipe['id']} substitution {substitution['id']} references unknown "
                        f"contextualSubstitutionRuleId: {contextual_rule_id}"
                    )

    return errors


def write_seed_package(part_paths: dict[str, Path], payload: dict[str, Any]) -> None:
    for part_name, path in part_paths.items():
        path.write_text(serialize_json(payload[part_name]), encoding="utf-8", newline="\n")
