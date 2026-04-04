from __future__ import annotations

import unittest

from tools.seed_package.bundled_seed_package import normalize_seed_package
from tools.seed_package.bundled_seed_package import recipe_relative_path


def make_recipe(recipe_id: str, fr_title: str, en_title: str) -> dict:
    return {
        "id": recipe_id,
        "languages": {
            "fr": {"title": fr_title},
            "en": {"title": en_title},
        },
        "tags": [],
        "collections": [],
        "photos": [],
        "attachments": [],
    }


class BundledSeedPackageRecipePathTests(unittest.TestCase):
    def test_known_recipe_id_uses_curated_stem(self) -> None:
        recipe = make_recipe(
            "9a714acf-d991-4932-bb4c-63af19051022",
            "Barres Nanaimo",
            "Nanaimo Bars",
        )

        self.assertEqual(
            recipe_relative_path(recipe),
            "recipes/006-barres-nanaimo-nanaimo-bars-9a714acf-d991-4932-bb4c-63af19051022.v1.json",
        )

    def test_unknown_recipe_id_preserves_existing_slugged_filename(self) -> None:
        recipe = make_recipe(
            "d2f76a5c-63b6-4dad-b33d-f3270a04f5c2",
            "Carres aux dattes",
            "Date Squares",
        )

        self.assertEqual(
            recipe_relative_path(
                recipe,
                "recipes/024-carres-aux-dattes-date-squares-d2f76a5c-63b6-4dad-b33d-f3270a04f5c2.v1.json",
            ),
            "recipes/024-carres-aux-dattes-date-squares-d2f76a5c-63b6-4dad-b33d-f3270a04f5c2.v1.json",
        )

    def test_unknown_recipe_id_falls_back_to_title_slug_when_existing_file_is_uuid_only(self) -> None:
        recipe = make_recipe(
            "9015696d-4126-49ee-91f5-578d66061fd9",
            "Casserole dejeuner",
            "Breakfast Casserole",
        )

        self.assertEqual(
            recipe_relative_path(recipe, "recipes/9015696d-4126-49ee-91f5-578d66061fd9.v1.json"),
            "recipes/casserole-dejeuner-breakfast-casserole-9015696d-4126-49ee-91f5-578d66061fd9.v1.json",
        )

    def test_normalize_seed_package_updates_uuid_only_manifest_entries_for_unknown_recipes(self) -> None:
        recipe = make_recipe(
            "ff66e4f7-c719-4203-970b-06993cdb25de",
            "Carres magiques",
            "Magic Cookie Bars",
        )
        payload = {
            "manifest": {
                "schemaVersion": "bundled-seed-package/v1",
                "packageId": "bundled-library",
                "metadataFile": "metadata.v1.json",
                "recipeFiles": ["recipes/ff66e4f7-c719-4203-970b-06993cdb25de.v1.json"],
                "ingredientReferencesFile": "ingredient-references.v1.json",
                "ingredientFormsFile": "ingredient-forms.v1.json",
                "substitutionRulesFile": "substitution-rules.v1.json",
                "contextualSubstitutionRulesFile": "contextual-substitution-rules.v1.json",
                "unitsFile": "units.v1.json",
                "tagsFile": "tags.v1.json",
                "collectionsFile": "collections.v1.json",
                "settingsFile": "settings.v1.json",
            },
            "metadata": {"libraryId": "bundled-library", "appVersion": None},
            "recipes": [recipe],
            "ingredientReferences": [],
            "ingredientForms": [],
            "substitutionRules": [],
            "contextualSubstitutionRules": [],
            "units": [],
            "tags": [],
            "collections": [],
            "settings": {"language": "en"},
        }

        normalized = normalize_seed_package(payload)

        self.assertEqual(
            normalized["manifest"]["recipeFiles"],
            ["recipes/carres-magiques-magic-cookie-bars-ff66e4f7-c719-4203-970b-06993cdb25de.v1.json"],
        )


if __name__ == "__main__":
    unittest.main()
