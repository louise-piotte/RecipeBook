from __future__ import annotations

import json
from collections import defaultdict
from pathlib import Path
from typing import Any


REPO_ROOT = Path(__file__).resolve().parents[2]
SEED_ROOT = REPO_ROOT / "app" / "src" / "main" / "assets" / "seed" / "bundled-library"
MANIFEST_PATH = SEED_ROOT / "manifest.v1.json"
SEED_PACKAGE_SCHEMA_VERSION = "bundled-seed-package/v1"
RECIPES_DIR = SEED_ROOT / "recipes"

PART_KEY_ORDER = (
    "metadataFile",
    "recipeFiles",
    "ingredientReferencesFile",
    "ingredientFormsFile",
    "substitutionRulesFile",
    "contextualSubstitutionRulesFile",
    "unitsFile",
    "tagsFile",
    "collectionsFile",
    "settingsFile",
)

STATIC_PARTS = (
    "metadata",
    "ingredientReferences",
    "ingredientForms",
    "substitutionRules",
    "contextualSubstitutionRules",
    "units",
    "tags",
    "collections",
    "settings",
)

CANONICAL_RECIPE_FILE_STEMS_BY_ID = {
    "0a8b29b8-faf0-4597-8514-e09335de6c03": "001-air-fryer-baked-oats-0a8b29b8-faf0-4597-8514-e09335de6c03",
    "1882aaf2-bb7a-4c13-bb7d-59ce0836ac48": "002-all-butter-pie-crust-1882aaf2-bb7a-4c13-bb7d-59ce0836ac48",
    "8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d": "003-amaretti-8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d",
    "583ae5e3-e482-42ba-971f-72d8418ef175": "004-anko-sweet-red-bean-paste-583ae5e3-e482-42ba-971f-72d8418ef175",
    "559fff48-4d46-4922-b1b8-66808cb0715c": "005-bao-buns-vapeur-steamed-bao-buns-559fff48-4d46-4922-b1b8-66808cb0715c",
    "9a714acf-d991-4932-bb4c-63af19051022": "006-barres-nanaimo-nanaimo-bars-9a714acf-d991-4932-bb4c-63af19051022",
    "4392bc3d-9785-43ac-b98e-496f96c1d628": "007-haricots-pinto-refrits-refried-pinto-beans-4392bc3d-9785-43ac-b98e-496f96c1d628",
    "41d7331d-2cf7-4a72-b1ce-ac90ffb97f33": "008-best-vanilla-cake-41d7331d-2cf7-4a72-b1ce-ac90ffb97f33",
    "3e2bd9d9-95fc-43ea-8d33-140de5b7de25": "009-bicuit-aux-brisures-de-chocolat-chocolate-chip-cookies-3e2bd9d9-95fc-43ea-8d33-140de5b7de25",
    "a1e9ba5d-be5c-447d-a368-3ae4954a0a07": "010-biscuit-linzer-linzer-cookies-a1e9ba5d-be5c-447d-a368-3ae4954a0a07",
    "2d1a7685-9425-40ae-bdd5-6eaf2a55792f": "011-biscuits-bonbons-aux-amandes-almond-bonbon-cookies-2d1a7685-9425-40ae-bdd5-6eaf2a55792f",
    "f07ba465-a5c8-4fad-bba3-83941f165410": "012-biscuits-froiss-s-au-citron-lemon-crinkle-cookies-f07ba465-a5c8-4fad-bba3-83941f165410",
    "4d4af0ad-f76b-4562-9956-60070fba7802": "013-biscuits-tourbillon-biscuits-pinwheel-cookies-4d4af0ad-f76b-4562-9956-60070fba7802",
    "4207e09a-429f-437f-b7bd-14e862d6d696": "050-gateau-au-chocolat-devil-s-food-cake-4207e09a-429f-437f-b7bd-14e862d6d696",
    "c9022b89-8181-425a-9141-6a4e6086b5c8": "061-gla-age-au-chocolat-blanc-white-chocolate-buttercream-c9022b89-8181-425a-9141-6a4e6086b5c8",
}


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


def normalize_recipe(recipe: dict[str, Any]) -> dict[str, Any]:
    recipe["id"] = recipe["id"].strip()
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
    return recipe


def normalize_recipes(data: list[dict[str, Any]]) -> list[dict[str, Any]]:
    return [normalize_recipe(recipe) for recipe in data]


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
    normalized["recipeFiles"] = dedupe_preserve_order(
        [recipe_file.strip().replace("\\", "/") for recipe_file in normalized.get("recipeFiles", [])]
    )
    for key in PART_KEY_ORDER:
        if key == "recipeFiles":
            continue
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


def recipe_relative_path(recipe: dict[str, Any]) -> str:
    recipe_id = recipe["id"].strip()
    recipe_file_stem = CANONICAL_RECIPE_FILE_STEMS_BY_ID.get(recipe_id, recipe_id)
    return f"recipes/{recipe_file_stem}.v1.json"


def load_seed_package() -> tuple[dict[str, Any], dict[str, Any], dict[str, Any]]:
    manifest = normalize_manifest(load_json(MANIFEST_PATH))
    recipe_paths = [SEED_ROOT / recipe_file for recipe_file in manifest["recipeFiles"]]
    part_paths: dict[str, Any] = {
        "manifest": MANIFEST_PATH,
        "metadata": SEED_ROOT / manifest["metadataFile"],
        "recipes": recipe_paths,
        "ingredientReferences": SEED_ROOT / manifest["ingredientReferencesFile"],
        "ingredientForms": SEED_ROOT / manifest["ingredientFormsFile"],
        "substitutionRules": SEED_ROOT / manifest["substitutionRulesFile"],
        "contextualSubstitutionRules": SEED_ROOT / manifest["contextualSubstitutionRulesFile"],
        "units": SEED_ROOT / manifest["unitsFile"],
        "tags": SEED_ROOT / manifest["tagsFile"],
        "collections": SEED_ROOT / manifest["collectionsFile"],
        "settings": SEED_ROOT / manifest["settingsFile"],
    }
    payload = {
        "manifest": load_json(MANIFEST_PATH),
        "metadata": load_json(part_paths["metadata"]),
        "recipes": [load_json(path) for path in recipe_paths],
        "ingredientReferences": load_json(part_paths["ingredientReferences"]),
        "ingredientForms": load_json(part_paths["ingredientForms"]),
        "substitutionRules": load_json(part_paths["substitutionRules"]),
        "contextualSubstitutionRules": load_json(part_paths["contextualSubstitutionRules"]),
        "units": load_json(part_paths["units"]),
        "tags": load_json(part_paths["tags"]),
        "collections": load_json(part_paths["collections"]),
        "settings": load_json(part_paths["settings"]),
    }
    return manifest, part_paths, payload


def normalize_seed_package(payload: dict[str, Any]) -> dict[str, Any]:
    normalized = {part_name: normalize_part(part_name, data) for part_name, data in payload.items()}
    normalized["manifest"]["recipeFiles"] = [recipe_relative_path(recipe) for recipe in normalized["recipes"]]
    return normalized


def validate_unique_ids(items: list[dict[str, Any]], id_key: str, label: str) -> list[str]:
    counts: dict[str, int] = defaultdict(int)
    for item in items:
        counts[item[id_key]] += 1
    return [f"duplicate {label} id: {item_id}" for item_id, count in counts.items() if count > 1]


def validate_seed_package(payload: dict[str, Any], part_paths: dict[str, Any]) -> list[str]:
    errors: list[str] = []
    manifest = payload["manifest"]

    if manifest["schemaVersion"] != SEED_PACKAGE_SCHEMA_VERSION:
        errors.append(f"unexpected manifest schemaVersion: {manifest['schemaVersion']}")

    for part_name, path in part_paths.items():
        if part_name == "recipes":
            for recipe_path in path:
                if not recipe_path.exists():
                    errors.append(f"missing seed package part: recipes -> {recipe_path}")
            continue
        if not path.exists():
            errors.append(f"missing seed package part: {part_name} -> {path}")

    if len(manifest["recipeFiles"]) != len(payload["recipes"]):
        errors.append("manifest recipeFiles count does not match loaded recipe count")

    expected_recipe_files = [recipe_relative_path(recipe) for recipe in payload["recipes"]]
    if manifest["recipeFiles"] != expected_recipe_files:
        errors.append("manifest recipeFiles do not match the canonical recipe file naming")

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


def write_seed_package(part_paths: dict[str, Any], payload: dict[str, Any]) -> None:
    for part_name in ("manifest", *STATIC_PARTS):
        path = part_paths[part_name]
        path.write_text(serialize_json(payload[part_name]), encoding="utf-8", newline="\n")

    recipe_paths = [SEED_ROOT / recipe_file for recipe_file in payload["manifest"]["recipeFiles"]]
    RECIPES_DIR.mkdir(parents=True, exist_ok=True)

    for recipe_path, recipe in zip(recipe_paths, payload["recipes"], strict=True):
        recipe_path.parent.mkdir(parents=True, exist_ok=True)
        recipe_path.write_text(serialize_json(recipe), encoding="utf-8", newline="\n")

    referenced_recipe_paths = {path.resolve() for path in recipe_paths}
    for existing_path in RECIPES_DIR.glob("*.json"):
        if existing_path.resolve() not in referenced_recipe_paths:
            existing_path.unlink()
