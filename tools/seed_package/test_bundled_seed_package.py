from __future__ import annotations

import json
import unittest

from tools.seed_package.bundled_seed_package import RESEARCH_LEDGER_PATH
from tools.seed_package.bundled_seed_package import normalize_seed_package
from tools.seed_package.bundled_seed_package import recipe_relative_path
from tools.seed_package.bundled_seed_package import normalize_recipe
from tools.seed_package.bundled_seed_package import normalize_ingredient_reference_entry
from tools.seed_package.bundled_seed_package import load_seed_package
from tools.seed_package.bundled_seed_package import validate_numeric_values
from tools.seed_package.bundled_seed_package import validate_research_ledger
from tools.seed_package.bundled_seed_package import validate_seed_package


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
                "packageYieldsFile": "package-yields.v1.json",
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
            "packageYields": [],
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


class BundledSeedPackageRecipeLinkTests(unittest.TestCase):
    def test_normalize_recipe_removes_redundant_link_positions_without_changing_order(self) -> None:
        recipe = {
            "id": "recipe-a",
            "recipeLinks": [
                {"id": "link-a", "targetRecipeId": "recipe-b", "linkType": "SAUCE", "position": 0},
                {"id": "link-b", "targetRecipeId": "recipe-c", "linkType": "FILLING", "position": 1},
            ],
        }

        normalized = normalize_recipe(recipe)

        self.assertEqual([link["id"] for link in normalized["recipeLinks"]], ["link-a", "link-b"])
        self.assertTrue(all("position" not in link for link in normalized["recipeLinks"]))

    def test_normalize_recipe_rejects_link_position_that_disagrees_with_array_order(self) -> None:
        recipe = {
            "id": "recipe-a",
            "recipeLinks": [
                {"id": "link-a", "targetRecipeId": "recipe-b", "linkType": "SAUCE", "position": 1},
            ],
        }

        with self.assertRaisesRegex(ValueError, "does not match list order"):
            normalize_recipe(recipe)


class BundledSeedPackageIngredientAliasTests(unittest.TestCase):
    def test_normalize_ingredient_reference_removes_accent_folded_canonical_aliases(self) -> None:
        reference = {
            "id": "ingredient-ref-beef-stock",
            "nameFr": "fond de bœuf",
            "nameEn": "beef stock",
            "aliasesFr": ["fond de boeuf", "fond de bœuf", "fond de viande"],
            "aliasesEn": ["Beef Stock", "beef stock"],
        }

        normalize_ingredient_reference_entry(reference)

        self.assertEqual(reference["aliasesFr"], ["fond de viande"])
        self.assertEqual(reference["aliasesEn"], [])


class BundledSeedPackageValidationTests(unittest.TestCase):
    def test_current_package_conforms_to_schema_and_evidence_rules(self) -> None:
        _, part_paths, payload = load_seed_package()

        self.assertEqual(validate_seed_package(payload, part_paths), [])

    def test_fine_crystal_sugar_form_has_scoped_search_and_no_numeric_claims(self) -> None:
        _, _, payload = load_seed_package()
        form = next(
            item for item in payload["ingredientForms"]
            if item["id"] == "ingredient-form-granulated-sugar-fine-grain"
        )
        self.assertEqual("ingredient-ref-granulated-sugar", form["ingredientRefId"])
        self.assertEqual("fine_grain", form["formCode"])
        self.assertEqual("fine_crystal", form["prepState"])
        self.assertEqual(
            ["caster sugar", "castor sugar", "superfine sugar", "super-fine sugar"],
            form["matchTermsEn"],
        )
        self.assertEqual(
            ["sucre semoule", "sucre-semoule", "sucre superfin", "sucre extra fin"],
            form["matchTermsFr"],
        )
        self.assertIsNone(form["densityGPerMl"])
        self.assertNotIn("powdered sugar", form["matchTermsEn"])
        self.assertNotIn("sucre en poudre", form["matchTermsFr"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        evidence = records[form["id"]]
        self.assertEqual("ingredient_form", evidence["recordType"])
        self.assertEqual("accepted", evidence["decisions"][0]["outcome"])
        self.assertEqual(3, len(evidence["sources"]))
        self.assertEqual([], evidence.get("measurementObservations", []))
        self.assertEqual("not_yet_researched", evidence["substitutionResearchState"])

    def test_brown_sugar_grades_and_pearl_sugar_keep_identity_boundaries(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = {item["id"]: item for item in payload["ingredientForms"]}

        brown = references["ingredient-ref-brown-sugar"]
        self.assertEqual(["cassonade bien tassée", "sucre brun tassé"], brown["aliasesFr"])
        self.assertEqual([], brown["aliasesEn"])
        light = forms["ingredient-form-brown-sugar-light"]
        dark = forms["ingredient-form-brown-sugar-dark"]
        self.assertEqual("ingredient-ref-brown-sugar", light["ingredientRefId"])
        self.assertEqual("light brown sugar", light["labelEn"])
        self.assertEqual("cassonade claire", light["labelFr"])
        self.assertIn("packed light brown sugar", light["matchTermsEn"])
        self.assertIn("cassonade claire bien tassée", light["matchTermsFr"])
        self.assertEqual("ingredient-ref-brown-sugar", dark["ingredientRefId"])
        self.assertEqual("dark brown sugar", dark["labelEn"])
        self.assertEqual("cassonade foncée", dark["labelFr"])
        for form in (light, dark):
            self.assertIsNone(form["densityGPerMl"])

        pearl = references["ingredient-ref-pearl-sugar"]
        sugar_pearls = references["ingredient-ref-sugar-pearls"]
        sprinkles = references["ingredient-ref-sprinkles"]
        self.assertEqual(("pearl sugar", "sucre perlé"), (pearl["nameEn"], pearl["nameFr"]))
        self.assertEqual(["sanding sugar", "decorating sugar"], pearl["aliasesEn"])
        self.assertEqual(["sucre décoratif"], pearl["aliasesFr"])
        self.assertNotIn("sucre cristallisé", pearl["aliasesFr"])
        self.assertNotEqual(pearl["id"], sugar_pearls["id"])
        self.assertNotEqual(pearl["id"], sprinkles["id"])
        self.assertEqual([], pearl["unitMappings"])
        self.assertIsNone(pearl["defaultDensity"])
        self.assertTrue(
            all(
                row.get("ingredientRefId") != pearl["id"]
                for recipe in payload["recipes"]
                for row in recipe.get("ingredients", [])
            )
        )

        explicit_light_ids = {
            "f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-10",
            "ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-5",
            "4207e09a-429f-437f-b7bd-14e862d6d696-ingredient-9",
            "f6d10ccb-a696-4898-813b-a5a01e7f82ce-ingredient-1",
            "f6d10ccb-a696-4898-813b-a5a01e7f82ce-ingredient-16",
            "c97910fb-2301-40c7-8019-433bb361c44c-ingredient-4",
            "d73d6bff-fc0c-4b79-a607-441e546d32ad-ingredient-7",
        }
        recipe_rows = {
            row["id"]: row
            for recipe in payload["recipes"]
            for row in recipe.get("ingredients", [])
        }
        self.assertEqual(explicit_light_ids, {
            row_id for row_id, row in recipe_rows.items()
            if row.get("ingredientFormId") == light["id"]
        })
        ambiguous = recipe_rows["e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-15"]
        self.assertNotIn("ingredientFormId", ambiguous)

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for record_id in (light["id"], dark["id"], pearl["id"]):
            self.assertEqual("accepted", records[record_id]["decisions"][-1]["outcome"])
            self.assertEqual([], records[record_id].get("measurementObservations", []))

    def test_wp06_cuisine_gap_identities_keep_regional_boundaries(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipe_rows = [row for recipe in payload["recipes"] for row in recipe.get("ingredients", [])]
        added_ids = {
            "ingredient-ref-five-spice-powder",
            "ingredient-ref-matcha",
            "ingredient-ref-indian-gooseberry",
            "ingredient-ref-khoya",
            "ingredient-ref-anardana",
            "ingredient-ref-thai-basil",
            "ingredient-ref-vietnamese-coriander",
            "ingredient-ref-yardlong-bean",
            "ingredient-ref-toasted-rice-powder",
        }
        self.assertTrue(added_ids <= references.keys())

        expected = {
            "ingredient-ref-five-spice-powder": (
                "five-spice powder", "cinq épices chinoises", "BAKING_AND_SPICE", [], []
            ),
            "ingredient-ref-matcha": ("matcha", "matcha", "OTHER", [], ["thé matcha"]),
            "ingredient-ref-indian-gooseberry": (
                "Indian gooseberry", "groseille indienne", "FRUIT", ["amla"], []
            ),
            "ingredient-ref-khoya": (
                "khoya", "khoya", "DAIRY_AND_ALTERNATIVE", ["khoa", "mawa"], []
            ),
            "ingredient-ref-anardana": (
                "anardana", "graines entières de grenade anardana", "BAKING_AND_SPICE", ["anar dana"], []
            ),
            "ingredient-ref-thai-basil": ("Thai basil", "basilic thaï", "HERB", [], []),
            "ingredient-ref-vietnamese-coriander": (
                "Vietnamese coriander", "coriandre vietnamienne", "HERB", [], []
            ),
            "ingredient-ref-yardlong-bean": (
                "yardlong bean", "dolique asperge", "VEGETABLE_AND_AROMATIC",
                ["asparagus bean", "Chinese long bean"],
                ["dolic asperge", "haricot vert chinois", "dolique à longue cosse"],
            ),
            "ingredient-ref-toasted-rice-powder": (
                "toasted rice powder", "poudre de riz rôti", "BAKING_AND_SPICE", ["khao khua"], []
            ),
        }
        for reference_id, (name_en, name_fr, category, aliases_en, aliases_fr) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual((name_en, name_fr, category), (
                    reference["nameEn"], reference["nameFr"], reference["category"]
                ))
                self.assertEqual(aliases_en, reference["aliasesEn"])
                self.assertEqual(aliases_fr, reference["aliasesFr"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                self.assertFalse(any(form["ingredientRefId"] == reference_id for form in forms))
                self.assertFalse(any(row.get("ingredientRefId") == reference_id for row in recipe_rows))

        self.assertNotIn("ingredient-ref-five-spice-powder", {
            item["id"] for item in json.loads(
                (RESEARCH_LEDGER_PATH.parent / "legacy-import-identities.v1.json").read_text(encoding="utf-8")
            )["candidates"]
        })
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        five_spice = records["ingredient-ref-five-spice-powder"]
        self.assertEqual("ingredient_reference", five_spice["recordType"])
        self.assertEqual("verified", five_spice["identityState"])
        self.assertEqual("unresolved", five_spice["decisions"][0]["outcome"])
        self.assertEqual("accepted", five_spice["decisions"][-1]["outcome"])
        self.assertEqual(4, len(five_spice["sources"]))
        for reference_id in added_ids - {"ingredient-ref-five-spice-powder"}:
            with self.subTest(ledger_record=reference_id):
                record = records[reference_id]
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
                self.assertEqual("not_yet_researched", record["measurementState"])
                self.assertEqual("not_yet_researched", record["substitutionResearchState"])
                self.assertEqual([], record.get("measurementObservations", []))
                self.assertEqual([], record.get("substitutionFindings", []))

    def test_wp02_wp03_wp04_residual_identities_keep_product_boundaries(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipe_rows = [row for recipe in payload["recipes"] for row in recipe.get("ingredients", [])]
        expected = {
            "ingredient-ref-crude-stevia-extract": (
                "crude aqueous stevia-leaf extract",
                "extrait aqueux brut de la feuille de stévia",
                "SUGAR_AND_SWEETENER", [], [],
            ),
            "ingredient-ref-monk-fruit-juice-concentrate": (
                "monk fruit juice concentrate",
                "concentré de jus de fruit de moines",
                "SUGAR_AND_SWEETENER", [], [],
            ),
            "ingredient-ref-rice-paddy-herb": (
                "rice paddy herb", "herbe à paddy", "HERB", ["rau om"], ["limnophile aromatique"],
            ),
            "ingredient-ref-seitan": (
                "seitan", "seitan", "PROTEIN", ["wheat meat"], [],
            ),
            "ingredient-ref-textured-vegetable-protein": (
                "textured vegetable protein", "protéine végétale texturée", "PROTEIN",
                ["TVP", "texturized vegetable protein", "texturised vegetable protein"], ["PVT"],
            ),
        }
        self.assertTrue(set(expected) <= references.keys())
        for reference_id, (name_en, name_fr, category, aliases_en, aliases_fr) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual((name_en, name_fr, category), (
                    reference["nameEn"], reference["nameFr"], reference["category"]
                ))
                self.assertEqual(aliases_en, reference["aliasesEn"])
                self.assertEqual(aliases_fr, reference["aliasesFr"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                if reference_id != "ingredient-ref-textured-vegetable-protein":
                    self.assertFalse(any(form["ingredientRefId"] == reference_id for form in forms))
                self.assertFalse(any(row.get("ingredientRefId") == reference_id for row in recipe_rows))

        tvp_forms = [
            form for form in forms
            if form["ingredientRefId"] == "ingredient-ref-textured-vegetable-protein"
        ]
        self.assertEqual(
            {
                "ingredient-form-textured-vegetable-protein-balls",
                "ingredient-form-textured-vegetable-protein-flakes",
                "ingredient-form-textured-vegetable-protein-pieces",
                "ingredient-form-textured-vegetable-protein-strips",
            },
            {form["id"] for form in tvp_forms},
        )
        self.assertEqual({"balls", "flakes", "pieces", "strips"}, {form["formCode"] for form in tvp_forms})

        self.assertNotIn("ingredient-ref-allulose", references)
        self.assertNotIn("ingredient-ref-commercial-sweetener-blend", references)
        self.assertEqual([], references["ingredient-ref-vietnamese-coriander"]["aliasesEn"])
        self.assertEqual([], references["ingredient-ref-vietnamese-coriander"]["aliasesFr"])
        self.assertNotIn("seitan", references["ingredient-ref-vital-wheat-gluten"]["aliasesEn"])
        self.assertEqual("monk fruit extract", references["ingredient-ref-monk-fruit-extract"]["nameEn"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for reference_id in expected:
            with self.subTest(ledger_record=reference_id):
                record = records[reference_id]
                self.assertEqual("ingredient_reference", record["recordType"])
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
                self.assertEqual("not_yet_researched", record["measurementState"])
                self.assertEqual("not_yet_researched", record["substitutionResearchState"])
                self.assertEqual([], record.get("measurementObservations", []))
                self.assertEqual([], record.get("substitutionFindings", []))
        self.assertEqual("unresolved", records["candidate-allulose"]["decisions"][-1]["outcome"])
        allulose = records["candidate-allulose"]
        self.assertEqual("needs_clarification", allulose["identityState"])
        self.assertTrue({
            f"WP02-ALLULOSE-STATUS-RECHECK-20261011-S{i:02d}" for i in range(1, 8)
        }.issubset({source["sourceId"] for source in allulose["sources"]}))
        self.assertIn("non-medicinal ingredient", allulose["decisions"][-1]["reason"])
        self.assertEqual(
            "unresolved", records["candidate-commercial-sweetener-blends"]["decisions"][-1]["outcome"]
        )

    def test_whole_barley_flour_is_separate_and_puffed_teff_hold_is_recorded(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        whole_barley = references["ingredient-ref-whole-barley-flour"]
        self.assertEqual("whole barley flour", whole_barley["nameEn"])
        self.assertEqual("farine d'orge entière", whole_barley["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", whole_barley["category"])
        self.assertEqual([], whole_barley["aliasesEn"])
        self.assertEqual([], whole_barley["aliasesFr"])
        self.assertIsNone(whole_barley["defaultDensity"])
        self.assertEqual([], whole_barley["unitMappings"])
        self.assertNotIn("ingredient-ref-puffed-teff", references)

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        accepted = records["ingredient-ref-whole-barley-flour"]
        self.assertEqual("verified", accepted["identityState"])
        self.assertEqual("accepted", accepted["decisions"][0]["outcome"])
        accepted_source_ids = {source["sourceId"] for source in accepted["sources"]}
        self.assertTrue({f"WP02-A4-WBF-20261011-S{i:02d}" for i in range(1, 5)} <= accepted_source_ids)
        self.assertTrue({f"WP02-A4-WBF-R281-20261016-S{i:02d}" for i in range(1, 8)} <= accepted_source_ids)
        self.assertEqual("researched_no_supported_value", accepted["measurementState"])
        self.assertEqual("blocked_pending_evidence", accepted["substitutionResearchState"])
        self.assertEqual([], accepted.get("measurementObservations", []))
        held = records["candidate-puffed-teff"]
        self.assertEqual("needs_clarification", held["identityState"])
        self.assertEqual("unresolved", held["decisions"][0]["outcome"])
        self.assertEqual(13, len(held["sources"]))
        self.assertTrue({f"WP03-PTEFF-R158-20261016-S{i:02d}" for i in range(1, 7)} <= {
            source["sourceId"] for source in held["sources"]
        })

        puffed_rye = records["candidate-puffed-rye"]
        self.assertEqual("needs_clarification", puffed_rye["identityState"])
        self.assertEqual("unresolved", puffed_rye["decisions"][0]["outcome"])
        self.assertEqual(6, len(puffed_rye["sources"]))
        self.assertNotIn("ingredient-ref-puffed-rye", references)

    def test_three_mango_recipe_count_remains_unconverted_and_source_scoped(self) -> None:
        _, _, payload = load_seed_package()
        recipe = next(item for item in payload["recipes"] if item["id"] == "9ec55a0a-92b7-425d-9d7f-1a9a455022bb")
        line = next(item for item in recipe["ingredients"] if item["id"].endswith("-ingredient-1"))
        self.assertEqual("3 mangos", line["originalText"])
        self.assertEqual(3, line["quantity"])
        self.assertNotIn("unit", line)

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        mango = records["ingredient-ref-mangos"]
        self.assertEqual("blocked_pending_evidence", mango["measurementState"])
        self.assertEqual([], mango.get("measurementObservations", []))
        self.assertEqual("unresolved", mango["decisions"][-1]["outcome"])
        self.assertEqual(7, len(mango["sources"]))

    def test_sambal_oelek_identity_keeps_only_the_specific_spelling_alias(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        sambal = references["ingredient-ref-sambal-oelek"]
        self.assertEqual("sambal oelek", sambal["nameEn"])
        self.assertEqual("sambal oelek", sambal["nameFr"])
        self.assertEqual("SAUCE_AND_CONDIMENT", sambal["category"])
        self.assertEqual(["sambal ulek"], sambal["aliasesEn"])
        self.assertEqual(["sambal ulek"], sambal["aliasesFr"])
        self.assertIsNone(sambal["defaultDensity"])
        self.assertEqual([], sambal["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == sambal["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(
            line.get("ingredientRefId") == sambal["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-sambal-oelek"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual(6, len(record["sources"]))

    def test_sambal_matah_uses_local_borrowed_name_and_stays_separate_from_oelek(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        matah = references["ingredient-ref-sambal-matah"]
        self.assertEqual("sambal matah", matah["nameEn"])
        self.assertEqual("sambal matah", matah["nameFr"])
        self.assertEqual("SAUCE_AND_CONDIMENT", matah["category"])
        self.assertEqual([], matah["aliasesEn"])
        self.assertEqual([], matah["aliasesFr"])
        self.assertIsNone(matah["defaultDensity"])
        self.assertEqual([], matah["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == matah["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(
            line.get("ingredientRefId") == matah["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))
        oelek = references["ingredient-ref-sambal-oelek"]
        self.assertNotEqual(matah["id"], oelek["id"])
        self.assertEqual(["sambal ulek"], oelek["aliasesEn"])
        self.assertEqual(["sambal ulek"], oelek["aliasesFr"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-sambal-matah"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual([], record.get("measurementObservations", []))

    def test_chunjang_is_identity_only_and_distinct_from_black_bean_sauce(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        chunjang = references["ingredient-ref-chunjang"]
        self.assertEqual("chunjang", chunjang["nameEn"])
        self.assertEqual("chunjang", chunjang["nameFr"])
        self.assertEqual("SAUCE_AND_CONDIMENT", chunjang["category"])
        self.assertEqual([], chunjang["aliasesEn"])
        self.assertEqual([], chunjang["aliasesFr"])
        self.assertIsNone(chunjang["defaultDensity"])
        self.assertEqual([], chunjang["unitMappings"])
        self.assertFalse(any(
            form["ingredientRefId"] == chunjang["id"] for form in payload["ingredientForms"]
        ))
        self.assertFalse(any(
            line.get("ingredientRefId") == chunjang["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))
        black_bean_sauce = references["ingredient-ref-black-bean-sauce"]
        self.assertEqual("black bean sauce", black_bean_sauce["nameEn"])
        self.assertEqual("sauce de soja noir", black_bean_sauce["nameFr"])
        self.assertNotEqual(chunjang["id"], black_bean_sauce["id"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-chunjang"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual(6, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))

    def test_lizano_sauce_keeps_product_aliases_and_no_generic_recipe_or_measure_links(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        lizano = references["ingredient-ref-lizano-sauce"]
        self.assertEqual("Lizano sauce", lizano["nameEn"])
        self.assertEqual("sauce Lizano", lizano["nameFr"])
        self.assertEqual("SAUCE_AND_CONDIMENT", lizano["category"])
        self.assertEqual(["Salsa Lizano", "Lizano Salsa"], lizano["aliasesEn"])
        self.assertEqual(["Salsa Lizano"], lizano["aliasesFr"])
        self.assertIsNone(lizano["defaultDensity"])
        self.assertEqual([], lizano["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == lizano["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(
            line.get("ingredientRefId") == lizano["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))
        self.assertNotIn("ingredient-ref-salsa", references)

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-lizano-sauce"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual(5, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))

    def test_wild_rice_blend_is_distinct_and_identity_only(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        blend = references["ingredient-ref-wild-rice-blend"]
        pure = references["ingredient-ref-wild-rice"]
        self.assertEqual("wild rice blend", blend["nameEn"])
        self.assertEqual("mélange de riz sauvage", blend["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", blend["category"])
        self.assertEqual([], blend["aliasesEn"])
        self.assertEqual([], blend["aliasesFr"])
        self.assertIsNone(blend["defaultDensity"])
        self.assertEqual([], blend["unitMappings"])
        self.assertEqual("wild rice", pure["nameEn"])
        self.assertEqual("riz sauvage", pure["nameFr"])
        self.assertFalse(any(form["ingredientRefId"] == blend["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(
            line.get("ingredientRefId") == blend["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-wild-rice-blend"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual(11, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))

    def test_chimichurri_and_spelt_flakes_are_identity_only(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        chimichurri = references["ingredient-ref-chimichurri-sauce"]
        self.assertEqual("chimichurri sauce", chimichurri["nameEn"])
        self.assertEqual("sauce chimichurri", chimichurri["nameFr"])
        self.assertEqual("SAUCE_AND_CONDIMENT", chimichurri["category"])
        self.assertEqual(["chimichurri"], chimichurri["aliasesEn"])
        self.assertEqual(["chimichurri"], chimichurri["aliasesFr"])
        self.assertIsNone(chimichurri["defaultDensity"])
        self.assertEqual([], chimichurri["unitMappings"])
        self.assertFalse(any(
            form["ingredientRefId"] == chimichurri["id"] for form in payload["ingredientForms"]
        ))
        self.assertFalse(any(
            line.get("ingredientRefId") == chimichurri["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

        spelt_flakes = references["ingredient-ref-spelt-flakes"]
        self.assertEqual("spelt flakes", spelt_flakes["nameEn"])
        self.assertEqual("flocons d’épeautre", spelt_flakes["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", spelt_flakes["category"])
        self.assertEqual([], spelt_flakes["aliasesEn"])
        self.assertEqual([], spelt_flakes["aliasesFr"])
        self.assertIsNone(spelt_flakes["defaultDensity"])
        self.assertEqual([], spelt_flakes["unitMappings"])
        self.assertFalse(any(
            form["ingredientRefId"] == spelt_flakes["id"] for form in payload["ingredientForms"]
        ))
        self.assertFalse(any(
            line.get("ingredientRefId") == spelt_flakes["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for record_id, source_count in (
            ("ingredient-ref-chimichurri-sauce", 4),
            ("ingredient-ref-spelt-flakes", 4),
        ):
            with self.subTest(record_id=record_id):
                record = records[record_id]
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("accepted", record["decisions"][0]["outcome"])
                self.assertEqual("researched_no_supported_value", record["measurementState"])
                self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
                self.assertEqual(source_count, len(record["sources"]))
                self.assertEqual([], record.get("measurementObservations", []))

    def test_puffed_rye_remains_held_without_a_quebec_french_product_name(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        self.assertNotIn("ingredient-ref-puffed-rye", references)
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        candidate = records["candidate-puffed-rye"]
        self.assertEqual("candidate", candidate["recordType"])
        self.assertEqual("needs_clarification", candidate["identityState"])
        self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])
        self.assertEqual([], candidate.get("measurementObservations", []))
        self.assertEqual(6, len(candidate["sources"]))

    def test_lap_cheong_remains_a_source_bounded_candidate_without_active_behavior(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipes = payload["recipes"]
        self.assertNotIn("ingredient-ref-lap-cheong", references)
        self.assertFalse(any("lap cheong" in str(item).casefold() or "lap cheung" in str(item).casefold() for item in references.values()))
        self.assertFalse(any("lap cheong" in str(recipe).casefold() or "lap cheung" in str(recipe).casefold() for recipe in recipes))
        self.assertFalse(any("lap cheong" in str(item).casefold() or "lap cheung" in str(item).casefold() for item in forms))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        candidate = records["candidate-lap-cheong-dried-chinese-sausage"]
        self.assertEqual("candidate", candidate["recordType"])
        self.assertEqual("needs_clarification", candidate["identityState"])
        self.assertEqual("not_yet_researched", candidate["measurementState"])
        self.assertEqual("not_yet_researched", candidate["substitutionResearchState"])
        self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])
        self.assertEqual(7, len(candidate["sources"]))
        self.assertEqual([], candidate.get("measurementObservations", []))
        self.assertEqual([], candidate.get("substitutionFindings", []))

    def test_korean_tteokbokki_sticks_are_narrow_identity_only_after_quebec_review(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipes = payload["recipes"]
        ref_id = "ingredient-ref-korean-tteokbokki-rice-cake-sticks"
        sticks = references[ref_id]
        self.assertEqual("Korean rice cake sticks for tteokbokki", sticks["nameEn"])
        self.assertEqual("bâtonnets de gâteau de riz coréen pour tteokbokki", sticks["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", sticks["category"])
        self.assertEqual(
            ["Korean rice cake stick", "Korean rice cake sticks", "rice cake stick", "rice cake sticks"],
            sticks["aliasesEn"],
        )
        self.assertEqual(["bâtonnet de gâteau de riz", "bâtonnets de gâteau de riz"], sticks["aliasesFr"])
        for unqualified_alias in ("tteok", "tteokbokki", "topokki", "rice cake", "rice cakes", "gâteau de riz", "galettes de riz"):
            self.assertNotIn(unqualified_alias, [alias.casefold() for alias in sticks["aliasesEn"] + sticks["aliasesFr"]])
        self.assertIsNone(sticks["defaultDensity"])
        self.assertEqual([], sticks["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == ref_id for form in forms))
        self.assertFalse(any(
            line.get("ingredientRefId") == ref_id
            for recipe in recipes
            for line in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        candidate = records["candidate-korean-tteokbokki-rice-cake-sticks"]
        self.assertEqual("merged", candidate["identityState"])
        self.assertEqual("merged", candidate["decisions"][-1]["outcome"])
        self.assertEqual(12, len(candidate["sources"]))
        self.assertEqual([], candidate.get("measurementObservations", []))
        record = records[ref_id]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][-1]["outcome"])
        self.assertEqual([], record.get("measurementObservations", []))

    def test_fava_bean_flour_uses_the_quebec_gourgane_name_without_generic_measurements(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        flour = references["ingredient-ref-fava-bean-flour"]
        self.assertEqual("fava bean flour", flour["nameEn"])
        self.assertEqual("farine de gourgane", flour["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", flour["category"])
        self.assertEqual([], flour["aliasesEn"])
        self.assertEqual([], flour["aliasesFr"])
        self.assertIsNone(flour["defaultDensity"])
        self.assertEqual([], flour["unitMappings"])
        flour_forms = [form for form in payload["ingredientForms"] if form["ingredientRefId"] == flour["id"]]
        self.assertEqual(["ingredient-form-fava-bean-flour-precooked"], [form["id"] for form in flour_forms])
        precooked = flour_forms[0]
        self.assertEqual("precooked", precooked["formCode"])
        self.assertEqual("precooked fava flour", precooked["labelEn"])
        self.assertEqual("farine de gourgane précuite", precooked["labelFr"])
        self.assertIsNone(precooked["densityGPerMl"])
        self.assertFalse(any(
            line.get("ingredientRefId") == flour["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[flour["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual(10, len(record["sources"]))
        self.assertTrue({
            "WP02-B2-PRECOOKED-FAVA-FLOUR-R372-20261016-S01",
            "WP02-B2-PRECOOKED-FAVA-FLOUR-R372-20261016-S02",
            "WP02-B2-PRECOOKED-FAVA-FLOUR-R372-20261016-S03",
        } <= set(record["decisions"][-1]["sourceIds"]))
        self.assertEqual([], record.get("measurementObservations", []))

    def test_rice_starch_is_separate_from_rice_flour_and_has_no_generic_measures(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        starch = references["ingredient-ref-rice-starch"]
        rice_flour = references["ingredient-ref-rice-flour"]
        self.assertEqual("rice starch", starch["nameEn"])
        self.assertEqual("amidon de riz", starch["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", starch["category"])
        self.assertEqual([], starch["aliasesEn"])
        self.assertEqual([], starch["aliasesFr"])
        self.assertIsNone(starch["defaultDensity"])
        self.assertEqual([], starch["unitMappings"])
        self.assertNotEqual(starch["id"], rice_flour["id"])
        self.assertFalse(any(form["ingredientRefId"] == starch["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(
            line.get("ingredientRefId") == starch["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[starch["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual(6, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))

    def test_shanghai_rice_cake_slices_remain_held_pending_quebec_product_naming(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        self.assertNotIn("ingredient-ref-shanghai-rice-cake-slices", references)
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        candidate = records["candidate-shanghai-rice-cake-slices"]
        self.assertEqual("candidate", candidate["recordType"])
        self.assertEqual("needs_clarification", candidate["identityState"])
        self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])
        self.assertEqual(5, len(candidate["sources"]))
        self.assertEqual([], candidate.get("measurementObservations", []))

    def test_rye_flakes_are_identity_only_and_vanilla_pod_count_stays_unconverted(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        flakes = references["ingredient-ref-rye-flakes"]
        self.assertEqual("rye flakes", flakes["nameEn"])
        self.assertEqual("flocons de seigle", flakes["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", flakes["category"])
        self.assertEqual([], flakes["aliasesEn"])
        self.assertEqual([], flakes["aliasesFr"])
        self.assertIsNone(flakes["defaultDensity"])
        self.assertEqual([], flakes["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == flakes["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(
            line.get("ingredientRefId") == flakes["id"]
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        rye = records["ingredient-ref-rye-flakes"]
        self.assertEqual("verified", rye["identityState"])
        self.assertEqual("not_yet_researched", rye["measurementState"])
        self.assertEqual("not_yet_researched", rye["substitutionResearchState"])
        self.assertEqual([], rye.get("measurementObservations", []))
        self.assertEqual("accepted", rye["decisions"][-1]["outcome"])
        self.assertEqual(8, len(rye["sources"]))

        recipe = next(item for item in payload["recipes"] if item["id"] == "b8cf19ee-618b-495a-9ecb-9a90e88a9dac")
        vanilla_line = next(item for item in recipe["ingredients"] if item["id"].endswith("-ingredient-6"))
        self.assertEqual("1 vanilla pod", vanilla_line["originalText"])
        self.assertEqual(1, vanilla_line["quantity"])
        self.assertNotIn("unit", vanilla_line)

        vanilla = records["ingredient-ref-vanilla-pod"]
        self.assertEqual("researched_no_supported_value", vanilla["measurementState"])
        self.assertEqual([], vanilla.get("measurementObservations", []))
        self.assertEqual("unresolved", vanilla["decisions"][-1]["outcome"])
        self.assertTrue(any(
            source["sourceId"].startswith("WP04-VANILLA-POD-PORTION-20261011-")
            for source in vanilla["sources"]
        ))

    def test_residual_pulse_and_lupin_flours_are_identity_only_and_source_backed(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        expected = {
            "ingredient-ref-green-lentil-flour": ("green lentil flour", "farine de lentilles vertes"),
            "ingredient-ref-yellow-pea-flour": ("yellow pea flour", "farine de pois jaune"),
            "ingredient-ref-partially-defatted-peanut-flour": (
                "partially defatted peanut flour", "farine d’arachide partiellement dégraissée"
            ),
            "ingredient-ref-sweet-lupin-flour": ("sweet lupin flour", "farine de lupin blanc"),
            "ingredient-ref-sweet-blue-lupin-flour": (
                "sweet blue lupin flour", "farine de lupin à feuilles étroites"
            ),
        }
        identity_ids = set(expected)
        research_states = {
            "ingredient-ref-green-lentil-flour": ("researched_no_supported_value", "researched_supported", 0, 3),
            "ingredient-ref-yellow-pea-flour": ("researched_supported", "researched_no_supported_substitute", 1, 1),
            "ingredient-ref-partially-defatted-peanut-flour": ("researched_supported", "researched_supported", 1, 2),
            "ingredient-ref-sweet-lupin-flour": ("not_yet_researched", "not_yet_researched", 0, 0),
            "ingredient-ref-sweet-blue-lupin-flour": ("not_yet_researched", "not_yet_researched", 0, 0),
        }

        self.assertEqual(identity_ids, references.keys() & identity_ids)
        for reference_id, (name_en, name_fr) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual("FLOUR_AND_STARCH", reference["category"])
                self.assertEqual([], reference["aliasesEn"])
                self.assertEqual([], reference["aliasesFr"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])

        self.assertFalse(any(form["ingredientRefId"] in identity_ids for form in payload["ingredientForms"]))
        self.assertFalse(any(
            line.get("ingredientRefId") in identity_ids
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for reference_id in identity_ids:
            with self.subTest(ledger_record=reference_id):
                record = records[reference_id]
                self.assertEqual("verified", record["identityState"])
                measurement_state, substitution_state, observation_count, finding_count = research_states[reference_id]
                self.assertEqual(measurement_state, record["measurementState"])
                self.assertEqual(substitution_state, record["substitutionResearchState"])
                self.assertTrue(record["sources"])
                self.assertTrue(any(decision["outcome"] == "accepted" for decision in record["decisions"]))
                self.assertEqual(observation_count, len(record.get("measurementObservations", [])))
                self.assertEqual(finding_count, len(record.get("substitutionFindings", [])))

    def test_a6_regional_flours_and_east_asian_ferments_keep_scoped_identities(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}

        expected = {
            "ingredient-ref-millet-flour": ("millet flour", "farine de millet", "FLOUR_AND_STARCH", []),
            "ingredient-ref-fonio-flour": ("fonio flour", "farine de fonio", "FLOUR_AND_STARCH", ["acha flour"]),
            "ingredient-ref-jobs-tears-flour": ("Job's tears flour", "farine de larmes de Job", "FLOUR_AND_STARCH", []),
            "ingredient-ref-douchi": ("douchi", "douchi", "SAUCE_AND_CONDIMENT", ["fermented black soybeans"]),
            "ingredient-ref-white-fermented-bean-curd": (
                "white fermented bean curd", "tofu blanc fermenté", "SAUCE_AND_CONDIMENT", []
            ),
            "ingredient-ref-red-fermented-bean-curd": (
                "red fermented bean curd", "tofu fermenté rouge", "SAUCE_AND_CONDIMENT", []
            ),
            "ingredient-ref-chinese-sesame-paste": (
                "Chinese sesame paste", "pâte de sésame à la chinoise", "SAUCE_AND_CONDIMENT", []
            ),
            "ingredient-ref-gochujang": (
                "gochujang", "pâte de soya fermentée au piment fort (gochujang)", "SAUCE_AND_CONDIMENT", []
            ),
            "ingredient-ref-doenjang": (
                "doenjang", "pâte de soya fermentée coréenne (doenjang)", "SAUCE_AND_CONDIMENT", []
            ),
            "ingredient-ref-ssamjang": (
                "ssamjang", "pâte de soya coréenne assaisonnée (ssamjang)", "SAUCE_AND_CONDIMENT", []
            ),
        }
        for reference_id, (name_en, name_fr, category, aliases_en) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual(category, reference["category"])
                self.assertEqual(aliases_en, reference["aliasesEn"])
                self.assertEqual([], reference["aliasesFr"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        expected_sources = {
            "ingredient-ref-millet-flour": {
                "WP06-SA-20261010-S28", "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S01", "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S02",
                "WP02-A6-MILLET-FLOUR-MEASURE-R312-20261016-S01", "WP02-A6-MILLET-FLOUR-MEASURE-R312-20261016-S02",
            },
            "ingredient-ref-fonio-flour": {
                "WP02-S93", "WP02-S94", "WP02-S95", "WP02-S96", "WP02-S97",
                "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S03", "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S04",
                "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S05", "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S06",
                "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S07", "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S08",
                "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S09",
            },
            "ingredient-ref-jobs-tears-flour": {
                "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10", "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S11",
                "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S12", "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S13",
            },
            "ingredient-ref-douchi": {f"WP05-EAS-ID-20261010-S{i:02d}" for i in range(1, 6)},
            "ingredient-ref-white-fermented-bean-curd": {
                "WP05-EAS-ID-20261010-S01", "WP05-EAS-ID-20261010-S06", "WP05-EAS-ID-20261010-S07", "WP05-EAS-ID-20261010-S10"
            },
            "ingredient-ref-red-fermented-bean-curd": {
                "WP05-EAS-ID-20261010-S01", "WP05-EAS-ID-20261010-S08", "WP05-EAS-ID-20261010-S09", "WP05-EAS-ID-20261010-S10"
            },
            "ingredient-ref-chinese-sesame-paste": {
                f"WP05-EAS-ID-20261010-S{i:02d}" for i in range(11, 16)
            },
            "ingredient-ref-gochujang": {
                "WP05-KFP-ID-20261010-S01", "WP05-KFP-ID-20261010-S04", "WP05-KFP-ID-20261010-S05",
                "WP05-KFP-ID-20261010-S08", "WP05-KFP-ID-20261010-S09", "WP05-KFP-ID-20261010-S10",
            },
            "ingredient-ref-doenjang": {
                "WP05-KFP-ID-20261010-S02", "WP05-KFP-ID-20261010-S08", "WP05-KFP-ID-20261010-S09",
                "WP05-KFP-ID-20261010-S10", "WP05-KFP-ID-20261010-S11",
            },
            "ingredient-ref-ssamjang": {
                "WP05-KFP-ID-20261010-S03", "WP05-KFP-ID-20261010-S08", "WP05-KFP-ID-20261010-S09",
                "WP05-KFP-ID-20261010-S10", "WP05-KFP-ID-20261010-S12",
            },
        }
        for record_id, source_ids in expected_sources.items():
            with self.subTest(ledger_record=record_id):
                record = records[record_id]
                self.assertEqual("ingredient_reference", record["recordType"])
                self.assertEqual("verified", record["identityState"])
                expected_measurement_state = (
                    "researched_no_supported_value"
                    if record_id == "ingredient-ref-millet-flour"
                    else "not_yet_researched"
                )
                self.assertEqual(expected_measurement_state, record["measurementState"])
                self.assertEqual("not_yet_researched", record["substitutionResearchState"])
                self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
                if record_id == "ingredient-ref-millet-flour":
                    self.assertEqual(3, len(record.get("measurementObservations", [])))
                else:
                    self.assertNotIn("measurementObservations", record)

        for candidate_id in (
            "candidate-generic-fermented-bean-curd",
            "candidate-generic-sesame-paste",
            "candidate-fermented-soybean-paste",
        ):
            candidate = records[candidate_id]
            self.assertEqual("candidate", candidate["recordType"])
            self.assertEqual("needs_clarification", candidate["identityState"])
            self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])

        new_reference_ids = set(expected)
        self.assertFalse(any(form.get("ingredientRefId") in new_reference_ids for form in payload["ingredientForms"]))
        self.assertFalse(any(
            ingredient.get("ingredientRefId") in new_reference_ids
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        ))

    def test_reviewed_quinoa_millet_spaetzle_and_gnocchi_integrations_stay_scoped(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}

        quinoa = references["ingredient-ref-puffed-quinoa"]
        self.assertEqual(("puffed quinoa", "quinoa soufflé", "GRAIN_AND_CEREAL"),
                         (quinoa["nameEn"], quinoa["nameFr"], quinoa["category"]))
        self.assertEqual([], quinoa["aliasesEn"])
        self.assertEqual([], quinoa["aliasesFr"])
        millet = references["ingredient-ref-puffed-millet"]
        self.assertEqual(["millet puffs"], millet["aliasesEn"])
        self.assertEqual([], millet["aliasesFr"])
        spaetzle = references["ingredient-ref-spaetzle"]
        self.assertEqual(("spaetzle", "spätzle"), (spaetzle["nameEn"], spaetzle["nameFr"]))
        gnocchi = references["ingredient-ref-gnocchi"]
        self.assertEqual(("gnocchi", "gnocchi"), (gnocchi["nameEn"], gnocchi["nameFr"]))
        self.assertEqual(["gnocchis"], gnocchi["aliasesFr"])
        self.assertIsNone(gnocchi["defaultDensity"])
        self.assertEqual([], gnocchi["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        gnocchi_record = records["ingredient-ref-gnocchi"]
        self.assertEqual("researched_supported", gnocchi_record["measurementState"])
        self.assertEqual(
            {("1.25", "cup", 215), ("0.5", "cup", 85)},
            {(str(o["sourceQuantity"]["amount"]), o["sourceQuantity"]["unit"], o["observedMassG"])
             for o in gnocchi_record["measurementObservations"]},
        )
        self.assertEqual("blocked_pending_evidence", gnocchi_record["substitutionResearchState"])
        self.assertFalse(any(
            "gnocchi" in str(rule).casefold()
            for key in ("substitutionRules", "contextualSubstitutionRules")
            for rule in payload[key]
        ))

        shepherd = next(recipe for recipe in payload["recipes"] if recipe["id"] ==
                        "d356eec5-b3c4-4e22-b943-63900317e569")
        meat = next(line for line in shepherd["ingredients"] if line["id"].endswith("-ingredient-3"))
        self.assertEqual("1 lb. 90% lean ground beef -or ground lamb", meat["originalText"])
        self.assertEqual((1, "lb", "ingredient-ref-ground-beef"),
                         (meat["quantity"], meat["unit"], meat["ingredientRefId"]))
        self.assertIn("WP04-GROUND-BEEF-90-20261010-S01",
                      {source["sourceId"] for source in records["ingredient-ref-ground-beef"]["sources"]})

        lotus = records["ingredient-ref-lotus-root-starch"]
        self.assertEqual("needs_clarification", lotus["identityState"])
        self.assertEqual("amidon de racine de lotus", references["ingredient-ref-lotus-root-starch"]["nameFr"])
        self.assertIn("WP02-LOTUS-STARCH-QC-20261010-S03",
                      {source["sourceId"] for source in lotus["sources"]})

    def test_a7_malted_rye_and_gluten_flour_aliases_keep_scoped_identities(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}

        malted_rye = references["ingredient-ref-malted-rye-flour"]
        self.assertEqual("malted rye flour", malted_rye["nameEn"])
        self.assertEqual("farine de seigle malté", malted_rye["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", malted_rye["category"])
        self.assertEqual([], malted_rye["aliasesEn"])
        self.assertEqual([], malted_rye["aliasesFr"])
        self.assertIsNone(malted_rye["defaultDensity"])
        self.assertEqual([], malted_rye["unitMappings"])

        vital = references["ingredient-ref-vital-wheat-gluten"]
        self.assertEqual(["gluten flour"], vital["aliasesEn"])
        self.assertEqual(["gluten de blé vital", "farine de gluten"], vital["aliasesFr"])
        self.assertEqual("GRAIN_AND_CEREAL", vital["category"])
        self.assertIsNone(vital["defaultDensity"])
        self.assertEqual([], vital["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        expected_sources = {
            "ingredient-ref-malted-rye-flour": {
                "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S08",
                "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S09",
            },
            "ingredient-ref-vital-wheat-gluten": {
                "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S01",
                "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S02",
                "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S04",
            },
        }
        for record_id, source_ids in expected_sources.items():
            record = records[record_id]
            self.assertEqual("verified", record["identityState"])
            self.assertTrue(source_ids <= {source["sourceId"] for source in record["sources"]})
            if record_id == "ingredient-ref-vital-wheat-gluten":
                self.assertTrue(any(decision["outcome"] == "accepted" for decision in record["decisions"]))
                self.assertEqual("unresolved", record["decisions"][-1]["outcome"])
                self.assertIn("Keep the wider CFIA Gluten Flour class distinct", record["decisions"][-1]["reason"])
            else:
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
            self.assertNotIn("measurementObservations", record)

        for candidate_id in (
            "candidate-barley-meal",
            "candidate-dry-oat-meal",
            "candidate-toasted-rye-flour",
        ):
            candidate = records[candidate_id]
            self.assertEqual("candidate", candidate["recordType"])
            self.assertEqual("needs_clarification", candidate["identityState"])
            self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])

        self.assertFalse(any(form.get("ingredientRefId") == malted_rye["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(
            ingredient.get("ingredientRefId") == malted_rye["id"]
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        ))

        generic_malt_candidate = records["candidate-generic-malt-flour"]
        self.assertEqual("merged", generic_malt_candidate["identityState"])
        self.assertEqual("merged", generic_malt_candidate["decisions"][-1]["outcome"])
        self.assertIn("ingredient-ref-malt-flour", generic_malt_candidate["decisions"][-1]["reason"])

    def test_generic_malt_flour_and_shio_koji_are_identity_only(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipes = payload["recipes"]

        expected = {
            "ingredient-ref-malt-flour": {
                "nameEn": "malt flour",
                "nameFr": "farine maltée",
                "category": "FLOUR_AND_STARCH",
                "aliasesEn": ["malted cereal flour"],
                "aliasesFr": [],
                "sourceIds": {
                    "WP02-MALT-FLOUR-IDENTITY-20261010-S01",
                    "WP02-MALT-FLOUR-IDENTITY-20261010-S02",
                    "WP02-MALT-FLOUR-IDENTITY-20261010-S03",
                },
            },
            "ingredient-ref-shio-koji": {
                "nameEn": "shio koji",
                "nameFr": "shio koji",
                "category": "SAUCE_AND_CONDIMENT",
                "aliasesEn": ["salt koji"],
                "aliasesFr": ["koji au sel"],
                "sourceIds": {
                    f"WP05-SHIOKOJI-IDENTITY-20261010-S0{index}" for index in range(1, 7)
                },
            },
        }
        for reference_id, fields in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                for field in ("nameEn", "nameFr", "category", "aliasesEn", "aliasesFr"):
                    self.assertEqual(fields[field], reference[field])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                self.assertFalse(any(form.get("ingredientRefId") == reference_id for form in forms))
                self.assertFalse(any(
                    ingredient.get("ingredientRefId") == reference_id
                    for recipe in recipes
                    for ingredient in recipe.get("ingredients", [])
                ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for reference_id, fields in expected.items():
            with self.subTest(ledger_record=reference_id):
                record = records[reference_id]
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("not_yet_researched", record["measurementState"])
                self.assertEqual("not_yet_researched", record["substitutionResearchState"])
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
                self.assertEqual(fields["sourceIds"], {source["sourceId"] for source in record["sources"]})
                self.assertNotIn("measurementObservations", record)

    def test_japanese_condiment_identities_preserve_product_and_name_boundaries(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipes = payload["recipes"]
        expected = {
            "ingredient-ref-miso": ("miso", "miso", ["pâte de miso"], [], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-amazake": ("amazake", "amazake", [], [], "OTHER"),
            "ingredient-ref-ponzu-sauce": ("ponzu sauce", "sauce ponzu", [], [], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-mentsuyu": ("mentsuyu", "mentsuyu", [], [], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-shiro-dashi": ("shiro dashi", "shiro dashi", [], [], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-teriyaki-sauce": ("teriyaki sauce", "sauce teriyaki", [], [], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-yuzu-kosho": ("yuzu kosho", "piment au yuzu", [], ["yuzu chili paste"], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-umeboshi": ("umeboshi", "umeboshi", [], ["Japanese pickled plum"], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-beni-shoga": ("beni shoga", "beni shoga", [], ["red pickled ginger"], "SAUCE_AND_CONDIMENT"),
        }
        for reference_id, (name_en, name_fr, aliases_fr, aliases_en, category) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual(aliases_fr, reference["aliasesFr"])
                self.assertEqual(aliases_en, reference["aliasesEn"])
                self.assertEqual(category, reference["category"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                self.assertFalse(any(form.get("ingredientRefId") == reference_id for form in forms))
                self.assertFalse(any(
                    ingredient.get("ingredientRefId") == reference_id
                    for recipe in recipes
                    for ingredient in recipe.get("ingredients", [])
                ))

        self.assertEqual("pâte miso blanche", references["ingredient-ref-white-miso-paste"]["nameFr"])
        self.assertNotIn("white miso paste", references["ingredient-ref-miso"]["aliasesEn"])
        self.assertEqual(["garri"], references["ingredient-ref-gari"]["aliasesEn"])
        self.assertNotIn("gari", references["ingredient-ref-beni-shoga"]["aliasesEn"])
        self.assertEqual(["mayo"], references["ingredient-ref-mayo"]["aliasesFr"])
        self.assertEqual(["mayo"], references["ingredient-ref-mayo"]["aliasesEn"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for reference_id in expected:
            with self.subTest(ledger_record=reference_id):
                record = records[reference_id]
                self.assertEqual("ingredient_reference", record["recordType"])
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("not_yet_researched", record["measurementState"])
                self.assertEqual("not_yet_researched", record["substitutionResearchState"])
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
                self.assertTrue(record["sources"])
                self.assertNotIn("measurementObservations", record)

        for candidate_id in (
            "candidate-japanese-tare",
            "candidate-tonkatsu-sauce",
            "candidate-okonomiyaki-sauce",
            "candidate-japanese-mayonnaise",
        ):
            candidate = records[candidate_id]
            self.assertEqual("candidate", candidate["recordType"])
            self.assertEqual("needs_clarification", candidate["identityState"])
            self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])

        gari_record = records["ingredient-ref-gari"]
        self.assertEqual("verified", gari_record["identityState"])
        self.assertEqual("unresolved", gari_record["decisions"][-1]["outcome"])

    def test_andean_tuber_identities_keep_bounded_names_and_research_states(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipes = payload["recipes"]
        expected = {
            "ingredient-ref-oca": ("oca", "oca", [], []),
            "ingredient-ref-ulluco": ("ulluco", "ulluque", [], ["papa lisa", "melloca"]),
            "ingredient-ref-mashua": ("mashua", "capucine tubéreuse", [], ["tuberous nasturtium"]),
        }
        for reference_id, (name_en, name_fr, aliases_fr, aliases_en) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual(aliases_fr, reference["aliasesFr"])
                self.assertEqual(aliases_en, reference["aliasesEn"])
                self.assertEqual("VEGETABLE_AND_AROMATIC", reference["category"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                self.assertFalse(any(form.get("ingredientRefId") == reference_id for form in forms))
                self.assertFalse(any(
                    ingredient.get("ingredientRefId") == reference_id
                    for recipe in recipes
                    for ingredient in recipe.get("ingredients", [])
                ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for reference_id in expected:
            with self.subTest(ledger_record=reference_id):
                record = records[reference_id]
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("researched_no_supported_value", record["measurementState"])
                self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
                self.assertTrue(record["sources"])
                self.assertEqual(1, len(record["substitutionFindings"]))
                self.assertEqual("researched_no_supported_substitute", record["substitutionFindings"][0]["researchState"])
                self.assertEqual([], record["substitutionFindings"][0]["replacements"])
                self.assertNotIn("measurementObservations", record)

    def test_puffed_wheat_keeps_exact_names_and_branded_measurement_evidence(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = payload["ingredientForms"]
        recipes = payload["recipes"]
        reference = references["ingredient-ref-puffed-wheat"]

        self.assertEqual("puffed wheat", reference["nameEn"])
        self.assertEqual("blé soufflé", reference["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", reference["category"])
        self.assertEqual([], reference["aliasesEn"])
        self.assertEqual([], reference["aliasesFr"])
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        self.assertFalse(any(form.get("ingredientRefId") == reference["id"] for form in forms))
        self.assertFalse(any(
            ingredient.get("ingredientRefId") == reference["id"]
            for recipe in recipes
            for ingredient in recipe.get("ingredients", [])
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[reference["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_supported", record["measurementState"])
        observation = record["measurementObservations"][0]
        self.assertEqual("portion_weight", observation["relationship"])
        self.assertEqual(13.0, observation["value"])
        self.assertEqual("g", observation["valueUnit"])
        self.assertEqual({"amount": 250.0, "unit": "mL"}, observation["sourceQuantity"])
        self.assertIn("Quaker", observation["foodDescription"])
        self.assertEqual(["WP03-PW-20261010-S05"], observation["sourceIds"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual([], record["substitutionFindings"][0]["replacements"])

    def test_jalapeno_and_serrano_portions_match_exact_raw_recipe_lines(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        }
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        cases = {
            "ingredient-ref-jalapeno-pepper": {
                "line_id": "4cbff09a-679f-420c-89e2-4175fb8e8662-ingredient-2",
                "source_id": "WP04-RESIDUAL-PRODUCE-COUNT-20261010-S01",
                "mass": 14.0,
                "text": "1 jalapeno pepper, finely chopped",
                "basis_phrase": "seeded-if-desired",
                "source_phrase": "11979",
            },
            "ingredient-ref-serrano-pepper": {
                "line_id": "e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-4",
                "source_id": "WP04-RESIDUAL-PRODUCE-COUNT-20261010-S02",
                "mass": 6.1,
                "text": "1 serrano pepper, thinly sliced",
                "basis_phrase": "3% stem refuse",
                "source_phrase": "11977",
            },
        }
        for reference_id, case in cases.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                line = recipe_lines[case["line_id"]]
                self.assertEqual(case["text"], line["originalText"])
                self.assertEqual(reference_id, line["ingredientRefId"])
                record = records[reference_id]
                self.assertEqual("researched_supported", record["measurementState"])
                observation = record["measurementObservations"][0]
                self.assertEqual("count_weight", observation["relationship"])
                self.assertEqual("published_portion", observation["evidenceKind"])
                self.assertEqual({"amount": 1, "unit": "pepper"}, observation["sourceQuantity"])
                self.assertEqual(case["mass"], observation["observedMassG"])
                self.assertIn(case["source_phrase"], observation["foodDescription"])
                self.assertIn(case["basis_phrase"], observation["quantityBasis"])
                self.assertEqual([case["source_id"]], observation["sourceIds"])
                self.assertIn(case["source_id"], {source["sourceId"] for source in record["sources"]})

        jalapeno = recipe_lines[cases["ingredient-ref-jalapeno-pepper"]["line_id"]]
        serrano = recipe_lines[cases["ingredient-ref-serrano-pepper"]["line_id"]]
        self.assertIn("seeded if desired", jalapeno["preparation"]["en"])
        self.assertTrue(serrano["optional"])

    def test_regional_flours_sauces_and_produce_counts_keep_scoped_evidence(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        expected = {
            "ingredient-ref-breadfruit-flour": ("breadfruit flour", "farine de fruit à pain", "FLOUR_AND_STARCH"),
            "ingredient-ref-tigernut-flour": ("tigernut flour", "farine de souchet", "FLOUR_AND_STARCH"),
            "ingredient-ref-yam-flour": ("yam flour", "farine d’igname", "FLOUR_AND_STARCH"),
            "ingredient-ref-taro-flour": ("taro flour", "farine de taro", "FLOUR_AND_STARCH"),
            "ingredient-ref-chili-oil": ("chili oil", "huile de piment rouge", "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-chiu-chow-style-chili-crisp-oil": (
                "Chiu Chow Style Chili Crisp Oil",
                "huile au piment croustillante de type Chiu Chow",
                "SAUCE_AND_CONDIMENT",
            ),
            "ingredient-ref-xo-sauce": ("XO sauce", "sauce de XO", "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-sa-cha-sauce": ("Sa Cha sauce", "sauce sa cha", "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-char-siu-sauce": ("char siu sauce", "sauce char siu", "SAUCE_AND_CONDIMENT"),
        }
        for reference_id, (name_en, name_fr, category) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual(category, reference["category"])
                self.assertEqual([], reference["aliasesEn"])
                self.assertEqual([], reference["aliasesFr"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for reference_id in expected:
            with self.subTest(ledger_record=reference_id):
                record = records[reference_id]
                self.assertEqual("verified", record["identityState"])
                if reference_id == "ingredient-ref-breadfruit-flour":
                    self.assertEqual("researched_no_supported_value", record["measurementState"])
                    self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
                    self.assertEqual(
                        {0.52, 0.66, 0.7},
                        {item["value"] for item in record["measurementObservations"]},
                    )
                    self.assertTrue(
                        all("not a household cup measure" in item["quantityBasis"] for item in record["measurementObservations"])
                    )
                else:
                    self.assertEqual("not_yet_researched", record["measurementState"])
                    self.assertEqual("not_yet_researched", record["substitutionResearchState"])
                    self.assertNotIn("measurementObservations", record)

        count_references = {
            reference_id: references[reference_id]
            for reference_id in (
                "ingredient-ref-garlic",
                "ingredient-ref-onion",
                "ingredient-ref-carrot",
                "ingredient-ref-leek",
                "ingredient-ref-tomatoes",
            )
        }
        for reference_id, reference in count_references.items():
            with self.subTest(count_reference=reference_id):
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])

        garlic = records["ingredient-ref-garlic"]
        self.assertEqual("researched_supported", garlic["measurementState"])
        garlic_observations = garlic["measurementObservations"]
        self.assertEqual(3.0, next(o for o in garlic_observations if "WP04-WP12-FDC-ALT-20261010-S02" in o["sourceIds"])["observedMassG"])
        garlic_cnf = next(o for o in garlic_observations if any("CNF-2026-PRODUCE-20261011-GARLIC" in sid for sid in o["sourceIds"]))
        self.assertEqual("count_weight", garlic_cnf["relationship"])
        self.assertEqual({"amount": 1, "unit": "clove"}, garlic_cnf["sourceQuantity"])
        self.assertEqual(3, garlic_cnf["observedMassG"])
        self.assertIn("Size is unspecified", garlic_cnf["quantityBasis"])

        leek = records["ingredient-ref-leek"]
        leek_observations = leek["measurementObservations"]
        self.assertEqual(89, next(o for o in leek_observations if "WP04-WP12-FDC-ALT-20261010-S04" in o["sourceIds"])["observedMassG"])
        leek_cnf = next(o for o in leek_observations if any("CNF-2026-PRODUCE-20261011-LEEK" in sid for sid in o["sourceIds"]))
        self.assertEqual("count_weight", leek_cnf["relationship"])
        self.assertEqual({"amount": 1, "unit": "leek"}, leek_cnf["sourceQuantity"])
        self.assertEqual(89, leek_cnf["observedMassG"])
        self.assertIn("56%", leek_cnf["foodState"])

        onion = records["ingredient-ref-onion"]
        self.assertEqual("researched_supported", onion["measurementState"])
        onion_ers = next(o for o in onion["measurementObservations"] if o["sourceIds"] == ["WP04-MEDIUM-ONION-ERS-20261010-S01"])
        self.assertEqual({"amount": 1, "unit": "medium onion"}, onion_ers["sourceQuantity"])
        self.assertEqual(110, onion_ers["observedMassG"])
        self.assertIn("does not label", onion_ers["quantityBasis"])
        onion_cnf = next(o for o in onion["measurementObservations"] if any("CNF-2026-PRODUCE-20261011-ONION" in sid for sid in o["sourceIds"]))
        self.assertEqual({"amount": 1, "unit": "large onion"}, onion_cnf["sourceQuantity"])
        self.assertEqual(150, onion_cnf["observedMassG"])
        self.assertIn("Keep separate", onion_cnf["quantityBasis"])
        onion_line_match = next(
            decision for decision in onion["decisions"]
            if "WP04-NEXT-COUNT-EDIBLE-PORTION-20261011-S01" in decision.get("sourceIds", [])
        )
        self.assertEqual("accepted", onion_line_match["outcome"])
        self.assertIn("105#3", onion_line_match["reason"])
        self.assertIn("an active count conversion", onion_line_match["reason"])
        onion_recipe = next(
            recipe for recipe in payload["recipes"]
            if recipe["id"] == "e152b749-db75-4a7c-9bbf-3b94f721451d"
        )
        onion_line = next(
            line for line in onion_recipe["ingredients"]
            if line["id"] == "e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-3"
        )
        self.assertEqual("1 large onion, chopped", onion_line["originalText"])
        self.assertEqual(1, onion_line["quantity"])
        self.assertEqual("count", onion_line["unit"])

        carrot = records["ingredient-ref-carrot"]
        self.assertEqual("researched_supported", carrot["measurementState"])
        carrot_cnf = next(o for o in carrot["measurementObservations"] if any("CNF-2026-PRODUCE-20261011-CARROT" in sid for sid in o["sourceIds"]))
        self.assertEqual({"amount": 1, "unit": "small carrot (14 cm long)"}, carrot_cnf["sourceQuantity"])
        self.assertEqual(50, carrot_cnf["observedMassG"])
        self.assertIn("has no length", carrot_cnf["quantityBasis"])
        carrot_recipe_hold = next(
            decision for decision in carrot["decisions"]
            if "WP04-NEXT-COUNT-PORTION-20261011-S01" in decision.get("sourceIds", [])
        )
        self.assertEqual("unresolved", carrot_recipe_hold["outcome"])
        self.assertIn("105#6", carrot_recipe_hold["reason"])
        carrot_recipe = next(
            recipe for recipe in payload["recipes"]
            if recipe["id"] == "e152b749-db75-4a7c-9bbf-3b94f721451d"
        )
        carrot_line = next(
            line for line in carrot_recipe["ingredients"]
            if line["id"] == "e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-6"
        )
        self.assertEqual("4 small carrots, diced", carrot_line["originalText"])
        self.assertEqual(4, carrot_line["quantity"])
        self.assertEqual("count", carrot_line["unit"])

        tomatoes = records["ingredient-ref-tomatoes"]
        self.assertEqual("researched_supported", tomatoes["measurementState"])
        tomato_cnf = next(o for o in tomatoes["measurementObservations"] if any("CNF-2026-PRODUCE-20261011-TOMATO" in sid for sid in o["sourceIds"]))
        self.assertEqual({"amount": 1, "unit": "large whole tomato (7.6 cm diameter)"}, tomato_cnf["sourceQuantity"])
        self.assertEqual(182, tomato_cnf["observedMassG"])
        self.assertIn("gives no diameter", tomato_cnf["quantityBasis"])

    def test_japanese_glutinous_rice_flours_are_distinct_identity_only_products(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        generic = references["ingredient-ref-glutinous-rice-flour"]
        self.assertEqual(["sweet rice flour", "sweet rice powder"], generic["aliasesEn"])
        self.assertEqual([], generic["aliasesFr"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        expected = {
            "ingredient-ref-mochiko-glutinous-rice-flour": (
                "Mochiko glutinous rice flour", "farine de riz gluant Mochiko"
            ),
            "ingredient-ref-shiratamako-glutinous-rice-flour": (
                "Shiratamako glutinous rice flour", "farine de riz gluant Shiratamako"
            ),
        }
        for reference_id, (name_en, name_fr) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual("FLOUR_AND_STARCH", reference["category"])
                self.assertEqual([], reference["aliasesEn"])
                self.assertEqual([], reference["aliasesFr"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                record = records[reference_id]
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("researched_no_supported_value", record["measurementState"])
                self.assertEqual([], record["measurementObservations"])
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])

        self.assertFalse(any(
            form["ingredientRefId"] in expected
            for form in payload["ingredientForms"]
        ))
        shiratamako = records["ingredient-ref-shiratamako-glutinous-rice-flour"]
        finding = shiratamako["substitutionFindings"][0]
        self.assertEqual("researched_supported", finding["researchState"])
        self.assertEqual(
            "ingredient-ref-mochiko-glutinous-rice-flour",
            finding["replacements"][0]["ingredientRefId"],
        )
        self.assertIn("recipe 6076", finding["context"])
        self.assertTrue(any("Do not activate a global" in limit for limit in finding["limitations"]))

    def test_pot_barley_has_distinct_source_backed_quebec_french_display(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        pot = references["ingredient-ref-pot-barley"]
        self.assertEqual("pot barley", pot["nameEn"])
        self.assertEqual("orge en pot", pot["nameFr"])
        self.assertEqual(["Scotch barley"], pot["aliasesEn"])
        self.assertEqual([], pot["aliasesFr"])
        self.assertIsNone(pot["defaultDensity"])
        self.assertEqual([], pot["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-pot-barley"]
        self.assertEqual("ingredient_reference", record["recordType"])
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][-1]["outcome"])
        self.assertIn("WP03-PB-NAME-20261011-S10", record["decisions"][-1]["sourceIds"])
        self.assertIn("orge mondé", record["decisions"][-1]["reason"])

    def test_maraschino_cherry_portion_matches_only_the_drained_recipe_line(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        maraschino = references["ingredient-ref-cerises-au-marasquin"]
        self.assertIsNone(maraschino["defaultDensity"])
        self.assertEqual([], maraschino["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-cerises-au-marasquin"]
        self.assertEqual("researched_supported", record["measurementState"])
        observation = record["measurementObservations"]
        self.assertEqual(1, len(observation))
        self.assertEqual("count_weight", observation[0]["relationship"])
        self.assertEqual("published_portion", observation[0]["evidenceKind"])
        self.assertEqual({"amount": 1, "unit": "cherry"}, observation[0]["sourceQuantity"])
        self.assertEqual(5.0, observation[0]["observedMassG"])
        self.assertIn("canned, drained", observation[0]["foodDescription"])
        self.assertIn("does not support cherries retaining liquid", observation[0]["quantityBasis"])
        self.assertEqual(
            ["WP04-MARASCHINO-PORTION-20261010-S01"],
            observation[0]["sourceIds"],
        )

    def test_sweet_potato_recipe_card_portion_stays_source_specific(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        reference = references["ingredient-ref-sweet-potato"]
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[reference["id"]]
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        observation = record["measurementObservations"][-1]
        self.assertEqual("count_weight", observation["relationship"])
        self.assertEqual("published_portion", observation["evidenceKind"])
        self.assertEqual(280, observation["observedMassG"])
        self.assertEqual({"amount": 2, "unit": "small sweet potatoes (about)"}, observation["sourceQuantity"])
        self.assertIn("weighing stage", observation["quantityBasis"])
        self.assertIn("WP04-SWEETPOTATO-PORTION-20261011-S01", observation["sourceIds"])

        recipe = next(
            item for item in payload["recipes"]
            if item["id"] == "89f89f5e-4afc-4e3a-b37f-e7841ac24ff8"
        )
        line = next(
            item for item in recipe["ingredients"]
            if item["id"] == "89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-13"
        )
        self.assertEqual("2 small sweet potatoes, peeled and diced", line["originalText"])
        self.assertEqual(2, line["quantity"])
        self.assertEqual("count", line["unit"])

        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe["ingredients"]
        }
        drained = recipe_lines["5719878d-25d9-40df-9f2c-8035a862f9e4-ingredient-7"]
        unspecified = recipe_lines["4a10822e-551d-4738-b0c2-d7492fb5b86f-ingredient-8"]
        self.assertEqual("16 maraschino cherries, drained and chopped", drained["originalText"])
        self.assertEqual("ingredient-ref-cerises-au-marasquin", drained["ingredientRefId"])
        self.assertEqual("18 maraschino cherries", unspecified["originalText"])
        self.assertEqual("ingredient-ref-cerises-au-marasquin", unspecified["ingredientRefId"])

    def test_mashed_banana_recipe_volume_does_not_become_a_mass(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        banana = references["ingredient-ref-banana"]
        self.assertIsNone(banana["defaultDensity"])
        self.assertEqual([], banana["unitMappings"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[banana["id"]]
        self.assertEqual("blocked_pending_evidence", record["measurementState"])
        source_ids = {
            "WP04-NEXT-BANANA-MASHED-20261011-S01",
            "WP04-NEXT-BANANA-MASHED-20261011-S02",
        }
        self.assertTrue(source_ids.issubset({source["sourceId"] for source in record["sources"]}))
        self.assertFalse(
            any(source_ids.intersection(observation.get("sourceIds", [])) for observation in record.get("measurementObservations", []))
        )
        decision = next(
            item for item in record["decisions"]
            if source_ids.issubset(set(item.get("sourceIds", [])))
        )
        self.assertEqual("unresolved", decision["outcome"])
        self.assertIn("1 1/2 cups", decision["reason"])
        self.assertIn("no mass", decision["reason"])

        recipe = next(
            item for item in payload["recipes"]
            if item["id"] == "c5486a31-4047-4437-ad8b-14a6e776bdd5"
        )
        line = next(
            item for item in recipe["ingredients"]
            if item["id"] == "c5486a31-4047-4437-ad8b-14a6e776bdd5-ingredient-10"
        )
        self.assertEqual("3 bananas, mashed", line["originalText"])
        self.assertEqual("ingredient-ref-banana", line["ingredientRefId"])
        self.assertEqual(3, line["quantity"])
        self.assertEqual("count", line["unit"])
        self.assertEqual({"fr": "très mûr, écrasé", "en": "very ripe, mashed"}, line["preparation"])

    def test_chipotle_in_adobo_count_remains_blocked_without_a_pepper_weight(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-chipotle-in-adobo"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("blocked_pending_evidence", record["measurementState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual(
            {"WP04-CHIPOTLE-COUNT-20261010-S01", "WP04-CHIPOTLE-COUNT-20261010-S02"},
            {source["sourceId"] for source in record["sources"]},
        )

        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe["ingredients"]
        }
        pepper = recipe_lines["4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-3"]
        self.assertEqual("1 chipotle in adobo, minced", pepper["originalText"])
        self.assertEqual("ingredient-ref-chipotle-in-adobo", pepper["ingredientRefId"])
        self.assertEqual(1, pepper["quantity"])
        self.assertEqual("count", pepper["unit"])
        self.assertEqual({"fr": "émincé", "en": "minced"}, pepper["preparation"])

    def test_attieke_is_an_identity_only_cassava_product_with_bounded_names(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        attieke = references["ingredient-ref-attieke"]
        self.assertEqual("attiéké", attieke["nameEn"])
        self.assertEqual("attiéké", attieke["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", attieke["category"])
        self.assertEqual(["steamed cassava grits", "akyeke"], attieke["aliasesEn"])
        self.assertEqual([], attieke["aliasesFr"])
        self.assertIsNone(attieke["defaultDensity"])
        self.assertEqual([], attieke["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == attieke["id"] for form in payload["ingredientForms"]))

        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(line.get("ingredientRefId") == attieke["id"] for line in recipe_lines))
        self.assertFalse(any("attiéké" in line.get("originalText", "").casefold() for line in recipe_lines))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[attieke["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))
        self.assertEqual(
            {f"WP02-ATTIEKE-20261010-S{i:02d}" for i in range(1, 7)},
            {source["sourceId"] for source in record["sources"]},
        )

    def test_placali_is_identity_only_and_keeps_cassava_product_boundaries(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        placali = references["ingredient-ref-placali"]
        self.assertEqual("placali", placali["nameEn"])
        self.assertEqual("placali", placali["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", placali["category"])
        self.assertEqual([], placali["aliasesEn"])
        self.assertEqual([], placali["aliasesFr"])
        self.assertIsNone(placali["defaultDensity"])
        self.assertEqual([], placali["unitMappings"])

        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(form["ingredientRefId"] == placali["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(line.get("ingredientRefId") == placali["id"] for line in recipe_lines))
        self.assertFalse(any("placali" in line.get("originalText", "").casefold() for line in recipe_lines))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[placali["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))
        self.assertEqual(
            {f"WP02-PLACALI-QUEBEC-20261011-S{i:02d}" for i in range(1, 7)},
            {source["sourceId"] for source in record["sources"]},
        )

    def test_lafun_is_an_identity_only_cassava_flour_product(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        lafun = references["ingredient-ref-lafun"]
        self.assertEqual("lafun", lafun["nameEn"])
        self.assertEqual("lafun", lafun["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", lafun["category"])
        self.assertEqual([], lafun["aliasesEn"])
        self.assertEqual([], lafun["aliasesFr"])
        self.assertIsNone(lafun["defaultDensity"])
        self.assertEqual([], lafun["unitMappings"])

        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(form["ingredientRefId"] == lafun["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any(line.get("ingredientRefId") == lafun["id"] for line in recipe_lines))
        self.assertFalse(any("lafun" in line.get("originalText", "").casefold() for line in recipe_lines))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[lafun["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))
        self.assertEqual(
            {f"WP02-LAFUN-IDENTITY-20261010-S{i:02d}" for i in range(1, 5)},
            {source["sourceId"] for source in record["sources"]},
        )

    def test_pupuru_is_distinct_from_generic_cassava_flour_and_keeps_bounded_substitution_evidence(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        pupuru = references["ingredient-ref-pupuru"]
        cassava_flour = references["ingredient-ref-cassava-flour"]

        self.assertEqual("pupuru", pupuru["nameEn"])
        self.assertEqual("pupuru", pupuru["nameFr"])
        self.assertEqual(["pupuru flour"], pupuru["aliasesEn"])
        self.assertEqual([], pupuru["aliasesFr"])
        self.assertEqual("FLOUR_AND_STARCH", pupuru["category"])
        self.assertIsNone(pupuru["defaultDensity"])
        self.assertEqual([], pupuru["unitMappings"])
        self.assertEqual(["manioc flour"], cassava_flour["aliasesEn"])
        self.assertFalse(any(form["ingredientRefId"] == pupuru["id"] for form in payload["ingredientForms"]))
        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(line.get("ingredientRefId") == pupuru["id"] for line in recipe_lines))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[pupuru["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        finding = record["substitutionFindings"][0]
        self.assertEqual("researched_no_supported_substitute", finding["researchState"])
        self.assertEqual([], finding["replacements"])
        self.assertIn("WP02-PUPURU-IDENTITY-20261010-S02", finding["sourceIds"])
        self.assertEqual(
            {f"WP02-PUPURU-IDENTITY-20261010-S{i:02d}" for i in range(1, 8)},
            {source["sourceId"] for source in record["sources"]},
        )

    def test_kodo_millet_is_species_qualified_and_keeps_measurements_unresearched(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        kodo = references["ingredient-ref-kodo-millet"]

        self.assertEqual("kodo millet", kodo["nameEn"])
        self.assertEqual("kodo", kodo["nameFr"])
        self.assertEqual(["koda millet", "varagu", "arikelu", "kodra", "harka", "kodon"], kodo["aliasesEn"])
        self.assertEqual([], kodo["aliasesFr"])
        self.assertEqual("GRAIN_AND_CEREAL", kodo["category"])
        self.assertIsNone(kodo["defaultDensity"])
        self.assertEqual([], kodo["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == kodo["id"] for form in payload["ingredientForms"]))
        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(line.get("ingredientRefId") == kodo["id"] for line in recipe_lines))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records[kodo["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))
        self.assertEqual(
            {
                *(f"WP03-KODO-20261010-S{i:02d}" for i in range(1, 7)),
                "WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08",
                "WP02-A6-KAMBU-PEARL-MILLET-20261013-R14-S01",
            },
            {source["sourceId"] for source in record["sources"]},
        )

    def test_bajra_aliases_keep_pearl_millet_grain_and_flour_separate(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        grain = references["ingredient-ref-pearl-millet"]
        flour = references["ingredient-ref-pearl-millet-flour"]
        self.assertEqual(["bajra", "bajri", "sajjalu", "kambu", "sajje"], grain["aliasesEn"])
        self.assertEqual([], grain["aliasesFr"])
        self.assertEqual(["bajra flour", "bajri flour", "sajjalu flour", "kambu flour", "sajje hittu"], flour["aliasesEn"])
        self.assertEqual(["farine de millet perlé"], flour["aliasesFr"])
        self.assertIsNone(grain["defaultDensity"])
        self.assertIsNone(flour["defaultDensity"])
        self.assertEqual([], grain["unitMappings"])
        self.assertEqual([], flour["unitMappings"])

        forms = payload["ingredientForms"]
        self.assertFalse(any(form["ingredientRefId"] in {grain["id"], flour["id"]} for form in forms))
        recipes = payload["recipes"]
        self.assertFalse(any(
            line.get("ingredientRefId") in {grain["id"], flour["id"]}
            for recipe in recipes for line in recipe["ingredients"]
        ))

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        for ref_id, source_id in [
            (grain["id"], "WP03-BAJRA-GRAIN-20261010-S01"),
            (flour["id"], "WP03-BAJRA-FLOUR-20261010-S01"),
        ]:
            record = records[ref_id]
            if ref_id == grain["id"]:
                self.assertEqual("not_yet_researched", record["measurementState"])
                self.assertEqual("not_yet_researched", record["substitutionResearchState"])
            else:
                self.assertEqual("researched_supported", record["measurementState"])
                self.assertEqual("blocked_pending_evidence", record["substitutionResearchState"])
            self.assertEqual({source_id}, {source["sourceId"] for source in record["sources"] if "BAJRA-" in source["sourceId"]})

    def test_bread_and_butter_pickle_count_has_no_supported_count_mapping(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-bread-and-butter-pickle"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("blocked_pending_evidence", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual(
            {
                "WP04-PICKLE-PORTION-20261010-S01",
                "WP04-PICKLE-PORTION-20261010-S02",
                "WP04-PICKLE-PORTION-20261010-S03",
            },
            {source["sourceId"] for source in record["sources"] if source["sourceId"].startswith("WP04-PICKLE-PORTION-")},
        )

        exact_line_id = "834bade3-bdda-432f-a4a6-1cb0fec6f065-ingredient-7"
        recipe_lines = {
            line["id"]: line
            for recipe in payload["recipes"]
            for line in recipe["ingredients"]
        }
        pickle = recipe_lines[exact_line_id]
        self.assertEqual("1 bread and butter pickle, finely diced", pickle["originalText"])
        self.assertEqual("ingredient-ref-bread-and-butter-pickle", pickle["ingredientRefId"])
        self.assertEqual(1, pickle["quantity"])
        self.assertEqual("count", pickle["unit"])

    def test_brioche_slice_count_remains_blocked_without_a_matching_portion_source(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-brioche-bread"]
        self.assertEqual("unreviewed", record["identityState"])
        self.assertEqual("blocked_pending_evidence", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual(
            {"WP04-BRIOCHE-COUNT-20261010-S01"},
            {source["sourceId"] for source in record["sources"] if source["sourceId"].startswith("WP04-BRIOCHE-COUNT-")},
        )
        self.assertEqual("unresolved", record["decisions"][-1]["outcome"])

        exact_line_id = "b3aacc80-d2f6-471d-bf42-85ba5fb8843a-ingredient-4"
        recipe_lines = {
            line["id"]: line
            for recipe in payload["recipes"]
            for line in recipe["ingredients"]
        }
        brioche = recipe_lines[exact_line_id]
        self.assertEqual("5 to 8 slices brioche bread", brioche["originalText"])
        self.assertEqual("ingredient-ref-brioche-bread", brioche["ingredientRefId"])
        self.assertEqual(8, brioche["quantity"])
        self.assertEqual("count", brioche["unit"])

    def test_blueberry_pie_crust_count_remains_blocked_without_a_matching_portion_source(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-pie-crust"]
        self.assertEqual("unreviewed", record["identityState"])
        self.assertEqual("blocked_pending_evidence", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual(
            {
                "WP04-PIE-CRUST-COUNT-20261010-S01",
                "WP04-PIE-CRUST-COUNT-20261010-S02",
            },
            {
                source["sourceId"]
                for source in record["sources"]
                if source["sourceId"].startswith("WP04-PIE-CRUST-COUNT-")
            },
        )
        self.assertEqual("unresolved", record["decisions"][-1]["outcome"])

        exact_line_id = "477572c0-6d31-4ba2-a7ae-20c4dde12e93-ingredient-1"
        recipe_lines = {
            line["id"]: line
            for recipe in payload["recipes"]
            for line in recipe["ingredients"]
        }
        crust = recipe_lines[exact_line_id]
        self.assertEqual(
            "1 raw 5-inch pie crust, plus extra dough for the top crust",
            crust["originalText"],
        )
        self.assertEqual("ingredient-ref-pie-crust", crust["ingredientRefId"])
        self.assertEqual(1, crust["quantity"])
        self.assertEqual("count", crust["unit"])

    def test_20261011_identity_reviews_keep_supported_rows_and_held_candidates_scoped(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected = {
            "ingredient-ref-black-chickpeas": ("black chickpeas", "pois chiches noirs", "LEGUME_AND_PULSE", ["black chickpea", "kala chana"], ["pois chiche noir", "kala chana"]),
            "ingredient-ref-puffed-buckwheat": ("puffed buckwheat", "sarrasin soufflé", "GRAIN_AND_CEREAL", ["buckwheat puffs"], []),
            "ingredient-ref-puffed-spelt": ("puffed spelt", "épeautre soufflé", "GRAIN_AND_CEREAL", ["spelt puffs"], []),
            "ingredient-ref-puffed-barley": ("puffed barley", "orge soufflée", "GRAIN_AND_CEREAL", [], []),
            "ingredient-ref-whole-rye-flour": ("whole rye flour", "farine entière de seigle", "FLOUR_AND_STARCH", ["complete rye flour"], ["farine de seigle entière"]),
            "ingredient-ref-graham-flour": ("Graham flour", "farine Graham", "FLOUR_AND_STARCH", [], []),
        }
        for ref_id, (name_en, name_fr, category, aliases_en, aliases_fr) in expected.items():
            with self.subTest(reference=ref_id):
                reference = references[ref_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual(category, reference["category"])
                self.assertEqual(aliases_en, reference["aliasesEn"])
                self.assertEqual(aliases_fr, reference["aliasesFr"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                self.assertFalse(any(form["ingredientRefId"] == ref_id for form in payload["ingredientForms"]))
                self.assertFalse(any(
                    line.get("ingredientRefId") == ref_id
                    for recipe in payload["recipes"]
                    for line in recipe["ingredients"]
                ))
                ledger_record = records[ref_id]
                self.assertEqual("ingredient_reference", ledger_record["recordType"])
                self.assertEqual("verified", ledger_record["identityState"])
                expected_substitution_state = (
                    "researched_no_supported_substitute"
                    if ref_id == "ingredient-ref-black-chickpeas"
                    else "not_yet_researched"
                )
                self.assertEqual(expected_substitution_state, ledger_record["substitutionResearchState"])
                self.assertEqual([], ledger_record.get("measurementObservations", []))
                self.assertEqual("accepted", ledger_record["decisions"][-1]["outcome"])
                self.assertTrue(ledger_record["decisions"][-1]["sourceIds"])

        for candidate_id in ("candidate-mung-bean-flour", "candidate-puffed-oats"):
            self.assertNotIn(candidate_id.replace("candidate-", "ingredient-ref-"), references)
            candidate = records[candidate_id]
            self.assertEqual("candidate", candidate["recordType"])
            self.assertEqual("needs_clarification", candidate["identityState"])
            self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])
            self.assertEqual([], candidate.get("measurementObservations", []))

        graham_crumb_lines = [
            line for recipe in payload["recipes"] for line in recipe["ingredients"]
            if "graham cracker crumbs" in line.get("originalText", "").casefold()
        ]
        self.assertEqual(3, len(graham_crumb_lines))
        self.assertTrue(all(line["ingredientRefId"] == "ingredient-ref-graham-cracker-crumbs" for line in graham_crumb_lines))

    def test_20261011_pie_crust_reviews_preserve_four_exact_counts_without_mass_observations(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-pie-crust"]
        self.assertEqual("blocked_pending_evidence", record["measurementState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        decisions = record["decisions"]
        for label in ("089#8", "107#1", "108#1", "109#1"):
            matching = [decision for decision in decisions if label in decision["reason"]]
            self.assertEqual(1, len(matching), label)
            self.assertEqual("unresolved", matching[0]["outcome"])
            self.assertTrue(matching[0]["sourceIds"])
        source_ids = {source["sourceId"] for source in record["sources"]}
        for prefix in (
            "WP04-PIE-CRUST-089-20261011-",
            "WP04-PIE-CRUST-107-20261011-",
            "WP04-PIE-CRUST-108-20261011-",
            "WP04-PIE-CRUST-109-20261011-",
        ):
            self.assertTrue(any(source_id.startswith(prefix) for source_id in source_ids), prefix)

        lines = {
            line["id"]: line
            for recipe in payload["recipes"]
            for line in recipe["ingredients"]
        }
        expected_lines = {
            "1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-8": ("4 individual 5-inch pie crusts", 4),
            "ae0f1410-da1e-478b-98a0-67fa6b420576-ingredient-1": ("1 prebaked 5-inch pie crust, cooled", 1),
            "166eae41-5c40-4a1c-8c3e-2cec590ab18c-ingredient-1": ("1 raw 5-inch pie crust, plus extra dough for the top crust", 1),
            "02721958-323d-47a4-96df-d383ae0994ff-ingredient-1": ("1 raw 5-inch pie crust", 1),
        }
        for line_id, (text, count) in expected_lines.items():
            with self.subTest(recipe_line=line_id):
                line = lines[line_id]
                self.assertEqual(text, line["originalText"])
                self.assertEqual("ingredient-ref-pie-crust", line["ingredientRefId"])
                self.assertEqual(count, line["quantity"])
                self.assertEqual("count", line["unit"])

    def test_rye_berries_keep_usda_cup_weight_on_the_generic_rye_source_record(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        berries = records["ingredient-ref-rye-berries"]
        self.assertEqual("researched_no_supported_value", berries["measurementState"])
        self.assertEqual("blocked_pending_evidence", berries["substitutionResearchState"])
        self.assertEqual([], berries.get("measurementObservations", []))
        self.assertEqual(
            "blocked_pending_evidence",
            berries["substitutionFindings"][0]["researchState"],
        )
        self.assertEqual([], berries["substitutionFindings"][0].get("replacements", []))

        rye_grain = records["ingredient-ref-rye-grain"]
        self.assertEqual("researched_supported", rye_grain["measurementState"])
        observation = next(
            item for item in rye_grain["measurementObservations"]
            if item["observationId"] == "WP03-RYE-RECHECK-20261010-M1"
        )
        self.assertEqual("portion_weight", observation["relationship"])
        self.assertEqual({"amount": 1, "unit": "cup"}, observation["sourceQuantity"])
        self.assertEqual(169, observation["observedMassG"])
        self.assertIn("NDB 20062", observation["foodDescription"])
        self.assertIn("transfer it to rye berries", observation["quantityBasis"])

    def test_farro_label_delta_keeps_generic_candidate_unresolved(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"] for item in payload["ingredientReferences"]}
        self.assertNotIn("ingredient-ref-farro", references)

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        farro = records["ingredient-ref-farro"]
        self.assertEqual("candidate", farro["recordType"])
        self.assertEqual("needs_clarification", farro["identityState"])
        self.assertEqual("not_yet_researched", farro["measurementState"])
        self.assertEqual("not_yet_researched", farro["substitutionResearchState"])
        self.assertEqual([], farro.get("measurementObservations", []))
        self.assertEqual([], farro.get("substitutionFindings", []))
        source_ids = {source["sourceId"] for source in farro["sources"]}
        self.assertTrue(
            {"FARRO-DELTA-S01", "FARRO-DELTA-S02", "FARRO-DELTA-S03", "FARRO-DELTA-S04"}
            <= source_ids
        )
        latest = farro["decisions"][-1]
        self.assertEqual("unresolved", latest["outcome"])
        self.assertIn("do not add an alias, form, recipe link, or numeric behavior", latest["reason"].lower())

    def test_numeric_validation_rejects_non_finite_and_non_positive_values(self) -> None:
        errors = validate_numeric_values({
            "ingredient": {"defaultDensity": 0.0, "unitMappings": [{"factor": float("inf")}]}
        })

        self.assertEqual(len(errors), 2)
        self.assertTrue(any("non-positive defaultDensity" in error for error in errors))
        self.assertTrue(any("non-finite numeric" in error for error in errors))

    def test_spice_sesame_and_vinegar_observations_stay_source_scoped(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        black_pepper = records["ingredient-ref-black-pepper"]
        black_portions = black_pepper["measurementObservations"]
        self.assertEqual(6, len(black_portions))
        self.assertEqual(
            {"WP07-PPC-20261009-S14"},
            {source_id for item in black_portions for source_id in item["sourceIds"]},
        )
        self.assertEqual(
            {0.1, 2.3, 2.9, 7.0, 8.8, 58.8},
            {item["observedMassG"] for item in black_portions},
        )
        self.assertEqual("not_yet_researched", black_pepper["substitutionResearchState"])

        white_sesame = records["ingredient-ref-white-sesame-seeds"]
        white_portion = white_sesame["measurementObservations"]
        self.assertEqual(1, len(white_portion))
        self.assertEqual({"WP03-SES-20261009-S05"}, set(white_portion[0]["sourceIds"]))
        self.assertEqual({"amount": 3, "unit": "Tbsp"}, white_portion[0]["sourceQuantity"])
        self.assertEqual(29.0, white_portion[0]["observedMassG"])
        self.assertIn("Product-specific", white_portion[0]["quantityBasis"])

        toasted_sesame = records["ingredient-form-sesame-seeds-toasted"]
        toasted_portions = toasted_sesame["measurementObservations"]
        self.assertEqual([15, 60, 100], [item["observedVolumeMl"] for item in toasted_portions])
        self.assertEqual([9.5, 38.0, 63.4], [item["observedMassG"] for item in toasted_portions])
        self.assertTrue(all(item["sourceIds"] == ["WP03-SES-20261009-S09"] for item in toasted_portions))
        self.assertTrue(all("not density" in item["quantityBasis"] for item in toasted_portions))

        chinkiang = records["ingredient-ref-chinkiang-vinegar"]
        findings = chinkiang["substitutionFindings"]
        self.assertEqual(1, len(findings))
        self.assertEqual("researched_supported", chinkiang["substitutionResearchState"])
        self.assertEqual({"WP05-RV-20261009-S05"}, set(findings[0]["sourceIds"]))
        self.assertEqual(
            ["ingredient-ref-rice-vinegar", "ingredient-ref-soy-sauce"],
            [replacement["ingredientRefId"] for replacement in findings[0]["replacements"]],
        )
        self.assertTrue(any("not a direct one-to-one" in limit for limit in findings[0]["limitations"]))

    def test_cocoa_and_chocolate_portions_remain_source_scoped(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        cocoa = records["ingredient-ref-unsweetened-cocoa-powder"]
        natural_cocoa = records["ingredient-ref-natural-cocoa-powder"]
        dutch_cocoa = records["ingredient-ref-dutch-process-cocoa-powder"]
        self.assertEqual("researched_no_supported_value", cocoa["measurementState"])
        self.assertEqual("researched_no_supported_value", natural_cocoa["measurementState"])
        self.assertEqual("researched_no_supported_value", dutch_cocoa["measurementState"])
        self.assertEqual(
            {5.4, 86.0},
            {item["observedMassG"] for item in cocoa["measurementObservations"]},
        )
        self.assertEqual(
            {5.0, 85.0, 106.0},
            {item["observedMassG"] for item in natural_cocoa["measurementObservations"]},
        )
        self.assertEqual(
            {5.4, 86.0},
            {item["observedMassG"] for item in dutch_cocoa["measurementObservations"]},
        )
        self.assertTrue(all("density" in item["quantityBasis"].lower() for item in cocoa["measurementObservations"]))
        self.assertTrue(all("density" in item["quantityBasis"].lower() for item in natural_cocoa["measurementObservations"]))
        self.assertTrue(all("density" in item["quantityBasis"].lower() for item in dutch_cocoa["measurementObservations"]))
        for record in (cocoa, natural_cocoa, dutch_cocoa):
            source_ids = {source["sourceId"] for source in record["sources"]}
            self.assertTrue(all(set(item["sourceIds"]).issubset(source_ids) for item in record["measurementObservations"]))

        semisweet_chips = records["ingredient-form-semisweet-chocolate-chips"]
        white_chips = records["ingredient-form-white-chocolate-chips"]
        milk_chips = records["ingredient-form-milk-chocolate-chips"]
        self.assertEqual("not_yet_researched", semisweet_chips["measurementState"])
        self.assertEqual(
            {14.0, 168.0, 170.0, 173.0, 182.0, 340.0},
            {item["observedMassG"] for item in semisweet_chips["measurementObservations"]},
        )
        self.assertEqual({170.0}, {item["observedMassG"] for item in white_chips["measurementObservations"]})
        self.assertEqual({168.0}, {item["observedMassG"] for item in milk_chips["measurementObservations"]})
        for record in (semisweet_chips, white_chips, milk_chips):
            source_ids = {source["sourceId"] for source in record["sources"]}
            self.assertTrue(all(set(item["sourceIds"]).issubset(source_ids) for item in record["measurementObservations"]))

        _, _, payload = load_seed_package()
        cocoa_refs = {
            item["id"]: item
            for item in payload["ingredientReferences"]
            if item["id"] in {"ingredient-ref-unsweetened-cocoa-powder", "ingredient-ref-natural-cocoa-powder", "ingredient-ref-dutch-process-cocoa-powder"}
        }
        self.assertEqual(3, len(cocoa_refs))
        self.assertTrue(all(item["defaultDensity"] is None and item["unitMappings"] == [] for item in cocoa_refs.values()))
        self.assertFalse(any(item["id"] == "ingredient-form-bittersweet-chocolate-chips" for item in payload["ingredientForms"]))

    def test_quinoa_flakes_keep_identity_and_product_portions_separate(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        reference = next(
            item for item in payload["ingredientReferences"]
            if item["id"] == "ingredient-ref-quinoa-flakes"
        )
        self.assertEqual("quinoa flakes", reference["nameEn"])
        self.assertEqual("flocons de quinoa", reference["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", reference["category"])
        self.assertEqual([], reference["aliasesEn"])
        self.assertEqual([], reference["aliasesFr"])
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        self.assertFalse(any(
            form["ingredientRefId"] == reference["id"]
            for form in payload["ingredientForms"]
        ))
        self.assertFalse(any(
            line.get("ingredientRefId") == reference["id"]
            for recipe in payload["recipes"]
            for line in recipe["ingredients"]
        ))

        record = records[reference["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual(
            {
                "WP03-QFLAKES-20261010-S01", "WP03-QFLAKES-20261010-S02",
                "WP03-QFLAKES-20261010-S03", "WP03-QFLAKES-20261010-S04",
                "WP03-QFLAKES-20261010-S05", "WP03-QFLAKES-20261010-S06",
                "WP03-QFLAKES-20261010-S07", "WP03-QFLAKES-20261010-S08",
            },
            {source["sourceId"] for source in record["sources"]},
        )
        portions = {
            observation["observationId"]: (
                observation["sourceQuantity"]["amount"],
                observation["sourceQuantity"]["unit"],
                observation["observedMassG"],
            )
            for observation in record["measurementObservations"]
        }
        self.assertEqual(
            {
                "tootsi-white-quinoa-flakes-30099-quarter-cup-portion-20261010": (0.25, "cup", 40),
                "tootsi-red-quinoa-flakes-30093-quarter-cup-portion-20261010": (0.25, "cup", 45),
                "gogo-quinoa-flakes-one-third-cup-portion-20261010": (1 / 3, "cup", 40),
            },
            portions,
        )
        self.assertEqual(
            "researched_no_supported_substitute",
            record["substitutionFindings"][0]["researchState"],
        )
        self.assertFalse(any(
            "quinoa flakes" in str(rule).casefold()
            for key in ("substitutionRules", "contextualSubstitutionRules")
            for rule in payload[key]
        ))

    def test_buckwheat_flakes_keep_plain_grain_identity_separate_from_groats_and_cereal(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        flakes = references["ingredient-ref-buckwheat-flakes"]
        self.assertEqual("buckwheat flakes", flakes["nameEn"])
        self.assertEqual("flocons de sarrasin", flakes["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", flakes["category"])
        self.assertEqual([], flakes["aliasesEn"])
        self.assertEqual([], flakes["aliasesFr"])
        self.assertIsNone(flakes["defaultDensity"])
        self.assertEqual([], flakes["unitMappings"])
        self.assertEqual("FLOUR_AND_STARCH", references["ingredient-ref-buckwheat-flour"]["category"])
        self.assertEqual("GRAIN_AND_CEREAL", references["ingredient-ref-roasted-buckwheat-groats-dry"]["category"])
        self.assertFalse(any(
            form["ingredientRefId"] == flakes["id"]
            for form in payload["ingredientForms"]
        ))
        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(line.get("ingredientRefId") == flakes["id"] for line in recipe_lines))

        record = records[flakes["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual(
            {f"WP03-BWFLAKES-20261010-S{i:02d}" for i in range(1, 9)},
            {source["sourceId"] for source in record["sources"]},
        )
        self.assertEqual("researched_no_supported_substitute", record["substitutionFindings"][0]["researchState"])
        self.assertEqual([], record["substitutionFindings"][0]["replacements"])

    def test_roasted_buckwheat_groats_use_reviewed_quebec_display(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        groats = references["ingredient-ref-roasted-buckwheat-groats-dry"]
        self.assertEqual("buckwheat groats, roasted, dry", groats["nameEn"])
        self.assertEqual("grains de sarrasin rôtis et secs", groats["nameFr"])
        self.assertEqual([], groats["aliasesEn"])
        self.assertEqual([], groats["aliasesFr"])
        self.assertIsNone(groats["defaultDensity"])
        self.assertEqual([], groats["unitMappings"])
        record = records[groats["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("accepted", record["decisions"][-1]["outcome"])
        self.assertTrue({
            "WP03-BW-GROATS-QC-20261011-S01",
            "WP03-BW-GROATS-QC-20261011-S02",
            "WP03-BW-GROATS-QC-20261011-S03",
        }.issubset({source["sourceId"] for source in record["sources"]}))
        self.assertEqual("FLOUR_AND_STARCH", references["ingredient-ref-buckwheat-flour"]["category"])
        self.assertFalse(any(
            form["ingredientRefId"] == groats["id"]
            for form in payload["ingredientForms"]
        ))
        self.assertFalse(any(
            ingredient.get("ingredientRefId") == groats["id"]
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        ))

    def test_sweet_potato_flour_is_distinct_from_roots_starch_potato_and_yam(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        flour = references["ingredient-ref-sweet-potato-flour"]
        self.assertEqual("sweet potato flour", flour["nameEn"])
        self.assertEqual("farine de patate douce", flour["nameFr"])
        self.assertEqual(["sweetpotato flour"], flour["aliasesEn"])
        self.assertEqual([], flour["aliasesFr"])
        self.assertEqual("FLOUR_AND_STARCH", flour["category"])
        self.assertIsNone(flour["defaultDensity"])
        self.assertEqual([], flour["unitMappings"])
        self.assertEqual("VEGETABLE_AND_AROMATIC", references["ingredient-ref-sweet-potato"]["category"])
        self.assertEqual("FLOUR_AND_STARCH", references["ingredient-ref-sweet-potato-starch"]["category"])
        self.assertEqual("FLOUR_AND_STARCH", references["ingredient-ref-potato-flour"]["category"])
        self.assertEqual("FLOUR_AND_STARCH", references["ingredient-ref-yam-flour"]["category"])
        self.assertFalse(any(
            form["ingredientRefId"] == flour["id"]
            for form in payload["ingredientForms"]
        ))
        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(line.get("ingredientRefId") == flour["id"] for line in recipe_lines))

        record = records[flour["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual(
            {f"WP02-SWEETPOTATO-FLOUR-20261010-S{i:02d}" for i in range(1, 9)},
            {source["sourceId"] for source in record["sources"]},
        )
        self.assertEqual([], record["substitutionFindings"][0]["replacements"])
        self.assertFalse(any(
            "sweet potato flour" in str(rule).casefold()
            for key in ("substitutionRules", "contextualSubstitutionRules")
            for rule in payload[key]
        ))

    def test_puffed_amaranth_is_a_distinct_identity_only_grain_product(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        puffed = references["ingredient-ref-puffed-amaranth"]
        self.assertEqual("puffed amaranth", puffed["nameEn"])
        self.assertEqual("amarante soufflée", puffed["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", puffed["category"])
        self.assertEqual([], puffed["aliasesEn"])
        self.assertEqual([], puffed["aliasesFr"])
        self.assertIsNone(puffed["defaultDensity"])
        self.assertEqual([], puffed["unitMappings"])
        self.assertEqual("GRAIN_AND_CEREAL", references["ingredient-ref-amaranth-grain"]["category"])
        self.assertEqual("GRAIN_AND_CEREAL", references["ingredient-ref-puffed-millet"]["category"])
        self.assertFalse(any(
            form["ingredientRefId"] == puffed["id"]
            for form in payload["ingredientForms"]
        ))
        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(line.get("ingredientRefId") == puffed["id"] for line in recipe_lines))

        record = records[puffed["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual(
            {"WP03-PAMARANTH-20261010-S01", "WP03-PAMARANTH-20261010-S02", "WP03-S23",
             "WP03-PAMARANTH-20261010-S04", "WP03-PAMARANTH-20261010-S05"},
            {source["sourceId"] for source in record["sources"]},
        )
        self.assertFalse(any(
            "puffed amaranth" in str(rule).casefold()
            for key in ("substitutionRules", "contextualSubstitutionRules")
            for rule in payload[key]
        ))

    def test_puffed_sorghum_is_a_distinct_identity_only_grain_product(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        puffed = references["ingredient-ref-puffed-sorghum"]
        self.assertEqual("puffed sorghum", puffed["nameEn"])
        self.assertEqual("sorgho soufflé", puffed["nameFr"])
        self.assertEqual("GRAIN_AND_CEREAL", puffed["category"])
        self.assertEqual(["popped sorghum", "sorghum puffs"], puffed["aliasesEn"])
        self.assertEqual([], puffed["aliasesFr"])
        self.assertIsNone(puffed["defaultDensity"])
        self.assertEqual([], puffed["unitMappings"])

        exact_terms = ("puffed sorghum", "sorgho soufflé", "popped sorghum", "sorghum puffs")
        for term in exact_terms:
            owners = [
                reference["id"] for reference in payload["ingredientReferences"]
                if term in [reference["nameEn"], reference["nameFr"]]
                + reference["aliasesEn"] + reference["aliasesFr"]
            ]
            self.assertEqual([puffed["id"]], owners, term)

        self.assertFalse(any(
            form["ingredientRefId"] == puffed["id"] for form in payload["ingredientForms"]
        ))
        recipe_lines = [line for recipe in payload["recipes"] for line in recipe["ingredients"]]
        self.assertFalse(any(line.get("ingredientRefId") == puffed["id"] for line in recipe_lines))
        record = records[puffed["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertNotIn("measurementObservations", record)
        self.assertEqual(
            {
                "WP03-PSORGHUM-20261011-S01", "WP03-PSORGHUM-20261011-S02",
                "WP03-PSORGHUM-20261011-S03", "WP03-PSORGHUM-20261011-S04",
                "WP03-PSORGHUM-20261011-S06",
            },
            {source["sourceId"] for source in record["sources"]},
        )
        self.assertFalse(any(
            "puffed sorghum" in str(rule).casefold()
            for key in ("substitutionRules", "contextualSubstitutionRules")
            for rule in payload[key]
        ))

    def test_medjool_date_portion_is_pitted_source_evidence_without_recipe_mass_conversion(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        reference = next(
            item for item in payload["ingredientReferences"]
            if item["id"] == "ingredient-ref-medjool-dates"
        )
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        record = records[reference["id"]]
        self.assertEqual("researched_supported", record["measurementState"])
        observation = next(
            item for item in record["measurementObservations"]
            if item["observationId"] == "wp04-medjool-date-sr28-pitted-one-date-20261010"
        )
        self.assertEqual("count_weight", observation["relationship"])
        self.assertEqual({"amount": 1, "unit": "date"}, observation["sourceQuantity"])
        self.assertEqual(24, observation["observedMassG"])
        self.assertEqual("published_portion", observation["evidenceKind"])
        self.assertIn("size is unspecified", observation["quantityBasis"])
        self.assertIn("WP04-MEDJOOL-COUNT-20261010-S02", observation["sourceIds"])

        recipe = next(item for item in payload["recipes"] if item["id"] == "fdb8f001-0f1a-4c73-a916-8721bdc1713f")
        line = next(item for item in recipe["ingredients"] if item["id"] == "fdb8f001-0f1a-4c73-a916-8721bdc1713f-ingredient-1")
        self.assertEqual("20 Medjool dates", line["originalText"])
        self.assertEqual(20, line["quantity"])
        self.assertEqual("date", line["unit"])
        self.assertNotIn("mass", line)

    def test_roasted_quinoa_flour_is_identity_only_and_unlinked(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        record = records["ingredient-ref-roasted-quinoa-flour"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual(
            {
                "WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S06",
                "WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S07",
                "WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S08",
                "WP02-ROASTED-QC-REVIEW-20261011-S01",
            },
            {source["sourceId"] for source in record["sources"]},
        )

        _, _, payload = load_seed_package()
        reference = next(
            item for item in payload["ingredientReferences"]
            if item["id"] == "ingredient-ref-roasted-quinoa-flour"
        )
        self.assertEqual("roasted quinoa flour", reference["nameEn"])
        self.assertEqual("farine de quinoa torréfiée", reference["nameFr"])
        self.assertEqual("FLOUR_AND_STARCH", reference["category"])
        self.assertEqual([], reference["aliasesEn"])
        self.assertEqual([], reference["aliasesFr"])
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        roasted_barley = next(
            item for item in payload["ingredientReferences"]
            if item["id"] == "ingredient-ref-roasted-barley-flour"
        )
        self.assertNotIn("hattai-ko", roasted_barley["aliasesEn"])
        self.assertNotIn("mugikogashi", roasted_barley["aliasesEn"])
        self.assertFalse(any(item.get("ingredientRefId") == reference["id"] for item in payload["ingredientForms"]))
        self.assertFalse(any(
            ingredient.get("ingredientRefId") == reference["id"]
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        ))

    def test_roasted_urid_and_red_rice_flours_are_identity_only(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected_sources = {
            "ingredient-ref-roasted-urid-flour": {
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S01",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S02",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S03",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S05",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S13",
                "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S14",
                "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S15",
                "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S16",
                "WP02-ROASTED-QC-REVIEW-20261011-S01",
            },
            "ingredient-ref-roasted-red-rice-flour": {
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S05",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S07",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S12",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S13",
                "WP02-ROASTED-QC-REVIEW-20261011-S01",
            },
        }
        for record_id, source_ids in expected_sources.items():
            record = records[record_id]
            self.assertEqual("ingredient_reference", record["recordType"])
            self.assertEqual("verified", record["identityState"])
            self.assertEqual("not_yet_researched", record["measurementState"])
            self.assertEqual("not_yet_researched", record["substitutionResearchState"])
            self.assertEqual("accepted", record["decisions"][-1]["outcome"])
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})

        candidate_sources = {
            "candidate-roasted-mong-flour": {
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S04",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S05",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S06",
                "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S17",
                "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S18",
            },
            "candidate-roasted-white-rice-flour": {
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S05",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S08",
            },
            "candidate-oat-flour-thermal-grade": {
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S09",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S10",
                "WP02-ROASTED-FLOUR-GAP-REVIEW-20261010-S11",
            },
        }
        for record_id, source_ids in candidate_sources.items():
            record = records[record_id]
            self.assertEqual("candidate", record["recordType"])
            self.assertEqual("needs_clarification", record["identityState"])
            self.assertEqual("unresolved", record["decisions"][-1]["outcome"])
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})

        _, _, payload = load_seed_package()
        refs = {item["id"]: item for item in payload["ingredientReferences"]}
        expected_names = {
            "ingredient-ref-roasted-urid-flour": ("roasted urid flour", "farine de haricot urd torréfiée"),
            "ingredient-ref-roasted-red-rice-flour": ("roasted red rice flour", "farine de riz rouge torréfiée"),
        }
        for reference_id, names in expected_names.items():
            reference = refs[reference_id]
            self.assertEqual(names, (reference["nameEn"], reference["nameFr"]))
            self.assertEqual("FLOUR_AND_STARCH", reference["category"])
            self.assertEqual([], reference["aliasesEn"])
            self.assertEqual([], reference["aliasesFr"])
            self.assertIsNone(reference["defaultDensity"])
            self.assertEqual([], reference["unitMappings"])
            self.assertFalse(any(item.get("ingredientRefId") == reference_id for item in payload["ingredientForms"]))
            self.assertFalse(any(
                ingredient.get("ingredientRefId") == reference_id
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
            ))

        self.assertFalse(set(candidate_sources).intersection(refs))

    def test_20261011_roasted_grain_and_blood_product_boundaries_remain_held(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected_sources = {
            "candidate-hattai-ko-mugikogashi": {
                f"WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S{i:02d}" for i in range(1, 9)
            },
            "candidate-pottukadalai-maavu": {
                "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S19",
                "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S20",
                "WP02-ROASTED-GRAM-PRODUCT-BOUNDARY-20261011-S01",
                "WP02-ROASTED-GRAM-PRODUCT-BOUNDARY-20261011-S02",
                "WP02-ROASTED-GRAM-PRODUCT-BOUNDARY-20261011-S05",
                "WP02-ROASTED-GRAM-PRODUCT-BOUNDARY-20261011-S06",
                "WP02-ROASTED-GRAM-PRODUCT-BOUNDARY-20261011-S07",
            },
            "candidate-blood-sausage-regional-products": {
                f"WP04-BLOOD-SAUSAGE-BOUNDARY-20261011-S{i:02d}" for i in range(1, 11)
            },
        }
        for record_id, source_ids in expected_sources.items():
            record = records[record_id]
            self.assertEqual("candidate", record["recordType"])
            self.assertEqual("needs_clarification", record["identityState"])
            self.assertEqual("unresolved", record["decisions"][-1]["outcome"])
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})
            self.assertEqual([], record.get("measurementObservations", []))
            self.assertEqual([], record.get("substitutionFindings", []))

        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        for reference_id in (
            "ingredient-ref-hattai-ko",
            "ingredient-ref-mugikogashi",
            "ingredient-ref-pottukadalai-maavu",
            "ingredient-ref-blood-sausage",
            "ingredient-ref-black-pudding",
            "ingredient-ref-morcilla",
            "ingredient-ref-sanguinaccio",
        ):
            self.assertNotIn(reference_id, references)

        sattu_sources = {source["sourceId"] for source in records["ingredient-ref-chana-sattu"]["sources"]}
        self.assertTrue({
            *(f"WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S{i:02d}" for i in range(9, 14)),
            "WP02-HATTKO-MUGIKOGASH-ROASTED-GRAM-20261011-S21",
        }.issubset(sattu_sources))

    def test_20261011_quebec_roasted_flour_review_preserves_product_boundaries(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        reviewed_names = {
            "ingredient-ref-roasted-barley-flour": ("roasted barley flour", "farine d'orge torréfiée", ["toasted barley flour"]),
            "ingredient-ref-roasted-quinoa-flour": ("roasted quinoa flour", "farine de quinoa torréfiée", []),
            "ingredient-ref-roasted-wheat-flour": ("roasted wheat flour", "farine de blé torréfiée", []),
            "ingredient-ref-roasted-corn-flour": ("roasted corn flour", "farine de maïs torréfiée", []),
            "ingredient-ref-roasted-red-rice-flour": ("roasted red rice flour", "farine de riz rouge torréfiée", []),
            "ingredient-ref-roasted-urid-flour": ("roasted urid flour", "farine de haricot urd torréfiée", []),
        }
        for reference_id, names in reviewed_names.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                self.assertEqual(names, (reference["nameEn"], reference["nameFr"], reference["aliasesEn"]))
                self.assertEqual([], reference["aliasesFr"])
                self.assertEqual("FLOUR_AND_STARCH", reference["category"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                record = records[reference_id]
                self.assertEqual("accepted", record["decisions"][-1]["outcome"])
                self.assertIn(
                    "WP02-ROASTED-QC-REVIEW-20261011-S01",
                    {source["sourceId"] for source in record["sources"]},
                )
                self.assertFalse(any(form["ingredientRefId"] == reference_id for form in payload["ingredientForms"]))
                self.assertFalse(any(
                    line.get("ingredientRefId") == reference_id
                    for recipe in payload["recipes"]
                    for line in recipe.get("ingredients", [])
                ))

        wheat_malt = references["ingredient-ref-roasted-wheat-malt-flour"]
        self.assertEqual("farine de malt de blé torréfié", wheat_malt["nameFr"])
        self.assertEqual("accepted", records[wheat_malt["id"]]["decisions"][-1]["outcome"])

    def test_20261011_sea_urchin_uni_remains_held_without_recipe_demand(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        candidate = records["candidate-sea-urchin-gonads-uni"]
        self.assertEqual("candidate", candidate["recordType"])
        self.assertEqual("needs_clarification", candidate["identityState"])
        self.assertEqual("researched_no_supported_value", candidate["measurementState"])
        self.assertEqual("researched_no_supported_substitute", candidate["substitutionResearchState"])
        self.assertEqual("unresolved", candidate["decisions"][-1]["outcome"])
        self.assertEqual(
            {f"WP04-SEAUNI-20261011-S{i:02d}" for i in range(1, 8)},
            {source["sourceId"] for source in candidate["sources"]},
        )
        self.assertEqual([], candidate.get("measurementObservations", []))
        self.assertEqual([], candidate.get("substitutionFindings", []))
        self.assertNotIn("ingredient-ref-sea-urchin-gonads-uni", references)
        self.assertFalse(any(
            "sea urchin" in str(line.get("originalText", "")).casefold()
            or "uni" == str(line.get("originalText", "")).casefold().strip()
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))

    def test_cooking_sauce_identities_preserve_product_boundaries(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected_sources = {
            "ingredient-ref-pesto": {"WP05-CSCR-20261010-S01", "WP05-CSCR-20261010-S02", "WP05-CSCR-20261010-S03"},
            "ingredient-ref-tapenade": {"WP05-CSCR-20261010-S04", "WP05-CSCR-20261010-S05"},
            "ingredient-ref-anchovy-paste": {"WP05-CSCR-20261010-S06", "WP05-CSCR-20261010-S07"},
            "ingredient-ref-passata": {"WP05-CSCR-20261010-S12", "WP05-CSCR-20261010-S13", "WP05-CSCR-20261010-S14"},
            "ingredient-ref-bagna-cauda": {"WP05-CSCR-20261010-S08", "WP05-CSCR-20261010-S09"},
            "ingredient-ref-tomato-sauce": {"WP05-CSCR-20261010-S10", "WP05-CSCR-20261010-S11"},
            "ingredient-ref-marinara-sauce": {"WP05-CSCR-20261010-S23", "WP05-CSCR-20261010-S25"},
        }
        for record_id, source_ids in expected_sources.items():
            record = records[record_id]
            self.assertEqual("ingredient_reference", record["recordType"])
            self.assertEqual("verified", record["identityState"])
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})
            self.assertEqual("accepted", record["decisions"][-1]["outcome"])

        candidate_sources = {
            "candidate-capers": {"WP05-CSCR-20261010-S19", "WP05-CSCR-20261010-S22"},
            "candidate-caperberries": {"WP05-CSCR-20261010-S20", "WP05-CSCR-20261010-S21", "WP05-CSCR-20261010-S22"},
            "candidate-bechamel-sauce": {"WP05-CSCR-20261010-S15", "WP05-CSCR-20261010-S16"},
            "candidate-hollandaise-sauce": {"WP05-CSCR-20261010-S17", "WP05-CSCR-20261010-S18"},
        }
        for record_id, source_ids in candidate_sources.items():
            record = records[record_id]
            self.assertEqual("candidate", record["recordType"])
            self.assertEqual("needs_clarification", record["identityState"])
            self.assertEqual("unresolved", record["decisions"][-1]["outcome"])
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})

        _, _, payload = load_seed_package()
        refs = {item["id"]: item for item in payload["ingredientReferences"]}
        self.assertEqual("SAUCE_AND_CONDIMENT", refs["ingredient-ref-pesto"]["category"])
        self.assertEqual(["basil pesto"], refs["ingredient-ref-pesto"]["aliasesEn"])
        self.assertEqual(["pesto au basilic"], refs["ingredient-ref-pesto"]["aliasesFr"])
        self.assertEqual("VEGETABLE_AND_AROMATIC", refs["ingredient-ref-passata"]["category"])
        self.assertEqual("passata", refs["ingredient-ref-passata"]["nameEn"])
        self.assertEqual("coulis de tomates (passata)", refs["ingredient-ref-passata"]["nameFr"])
        self.assertEqual(["bagna caoda"], refs["ingredient-ref-bagna-cauda"]["aliasesEn"])
        self.assertEqual(["bagna caoda"], refs["ingredient-ref-bagna-cauda"]["aliasesFr"])
        new_reference_ids = set(expected_sources) - {"ingredient-ref-tomato-sauce", "ingredient-ref-marinara-sauce"}
        for reference_id in new_reference_ids:
            reference = refs[reference_id]
            self.assertIsNone(reference["defaultDensity"])
            self.assertEqual([], reference["unitMappings"])
        self.assertFalse(any(item.get("ingredientRefId") in new_reference_ids for item in payload["ingredientForms"]))
        self.assertFalse(any(
            ingredient.get("ingredientRefId") in new_reference_ids
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        ))
        self.assertFalse(any("hollandaise sauce" in item["nameEn"].lower() for item in payload["ingredientReferences"]))
        self.assertFalse(any("caperberry" in item["nameEn"].lower() for item in payload["ingredientReferences"]))

        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        }
        self.assertEqual("ingredient-ref-marinara-sauce", recipe_lines["c68bebce-c549-4789-a5b4-d023ed58f782-ingredient-10"]["ingredientRefId"])
        self.assertEqual("ingredient-ref-tomato-sauce", recipe_lines["89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-1"]["ingredientRefId"])

    def test_preserved_condiment_review_keeps_only_existing_pickle_demand(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        pickle = records["ingredient-ref-bread-and-butter-pickle"]
        self.assertEqual("verified", pickle["identityState"])
        self.assertEqual("accepted", pickle["decisions"][0]["outcome"])
        self.assertEqual("unresolved", pickle["decisions"][-1]["outcome"])
        self.assertEqual(
            {
                "WP04-PICKLE-PORTION-20261010-S01",
                "WP04-PICKLE-PORTION-20261010-S02",
                "WP04-PICKLE-PORTION-20261010-S03",
                "WP05-PRESCOND-20261010-S02",
                "WP05-PRESCOND-20261010-S03",
                "WP05-PRESCOND-20261010-S04",
                "WP05-PRESCOND-20261010-S11",
            },
            {source["sourceId"] for source in pickle["sources"]},
        )

        held_sources = {
            "candidate-sauerkraut": {"WP05-PRESCOND-20261010-S01"},
            "candidate-generic-pickled-cucumber": {
                "WP05-PRESCOND-20261010-S02",
                "WP05-PRESCOND-20261010-S03",
                "WP05-PRESCOND-20261010-S04",
            },
            "candidate-table-olives": {"WP05-PRESCOND-20261010-S09", "WP05-PRESCOND-20261010-S10"},
            "candidate-pickled-onions": {"WP05-PRESCOND-20261010-S05", "WP05-PRESCOND-20261010-S06"},
            "candidate-generic-chutney": {"WP05-PRESCOND-20261010-S07"},
            "candidate-relish": {"WP05-PRESCOND-20261010-S08"},
        }
        for record_id, source_ids in held_sources.items():
            record = records[record_id]
            self.assertEqual("candidate", record["recordType"])
            self.assertEqual("needs_clarification", record["identityState"])
            self.assertEqual("unresolved", record["decisions"][-1]["outcome"])
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})

        _, _, payload = load_seed_package()
        refs = {item["id"]: item for item in payload["ingredientReferences"]}
        self.assertEqual("bread and butter pickle", refs["ingredient-ref-bread-and-butter-pickle"]["nameEn"])
        self.assertEqual("cornichons sucrés", refs["ingredient-ref-bread-and-butter-pickle"]["nameFr"])
        self.assertEqual([], refs["ingredient-ref-bread-and-butter-pickle"]["aliasesFr"])
        self.assertFalse(set(held_sources).intersection(refs))

        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        }
        exact_line_id = "834bade3-bdda-432f-a4a6-1cb0fec6f065-ingredient-7"
        self.assertEqual("1 bread and butter pickle, finely diced", recipe_lines[exact_line_id]["originalText"])
        self.assertEqual("ingredient-ref-bread-and-butter-pickle", recipe_lines[exact_line_id]["ingredientRefId"])
        self.assertEqual(
            1,
            sum(
                ingredient.get("ingredientRefId") == "ingredient-ref-bread-and-butter-pickle"
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
            ),
        )

    def test_white_whole_wheat_identity_and_white_flour_alias_decision_are_sourced(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        white_whole_wheat = records["ingredient-ref-white-whole-wheat-flour"]
        self.assertEqual("verified", white_whole_wheat["identityState"])
        self.assertEqual("not_yet_researched", white_whole_wheat["measurementState"])
        self.assertEqual("not_yet_researched", white_whole_wheat["substitutionResearchState"])
        self.assertEqual(
            {"WP02-WQF-20261010-S03", "WP02-WQF-20261010-S04", "WP02-WQF-20261010-S05", "WP02-WQF-20261010-S06"},
            {source["sourceId"] for source in white_whole_wheat["sources"]},
        )

        all_purpose = records["ingredient-ref-all-purpose-flour"]
        decision = next(
            decision for decision in all_purpose["decisions"]
            if set(decision.get("sourceIds", [])) == {
                "WP02-WQF-20261010-S01",
                "WP02-WQF-20261010-S02",
                "WP02-WQF-20261010-S07",
                "WP02-WQF-20261010-S08",
            }
        )
        self.assertEqual("accepted", decision["outcome"])
        self.assertIn("Removed the broad alias farine blanche", decision["reason"])

    def test_nut_seed_butters_and_prepared_fillings_are_sourced_identity_only_records(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected_sources = {
            "ingredient-ref-cashew-butter": {
                "WP03-PASTE-PRODUCT-20261010-S04",
                "WP03-PASTE-PRODUCT-20261010-S05",
                "WP03-PASTE-PRODUCT-20261010-S06",
                "WP03-PASTE-PRODUCT-20261010-S13",
                "WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S01",
                "WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S02",
                "WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S03",
                "WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S04",
                "WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S05",
                "WP03-I-CASHEW-BUTTER-FORMULATION-R376-20261016-S06",
            },
            "ingredient-ref-macadamia-butter": {
                "WP03-PASTE-PRODUCT-20261010-S04",
                "WP03-PASTE-PRODUCT-20261010-S07",
                "WP03-PASTE-PRODUCT-20261010-S13",
                "WP03-I-MACADAMIA-BUTTER-FORMULATION-R379-20261016-S01",
                "WP03-I-MACADAMIA-BUTTER-FORMULATION-R379-20261016-S02",
                "WP03-I-MACADAMIA-BUTTER-FORMULATION-R379-20261016-S03",
            },
            "ingredient-ref-walnut-butter": {
                "WP03-PASTE-PRODUCT-20261010-S10",
                "WP03-PASTE-PRODUCT-20261010-S13",
                "WP03-I-WALNUT-BUTTER-FORMULATION-R382-20261016-S01",
                "WP03-I-WALNUT-BUTTER-FORMULATION-R382-20261016-S02",
            },
            "ingredient-ref-pecan-butter": {
                "WP03-PASTE-PRODUCT-20261010-S01",
                "WP03-PASTE-PRODUCT-20261010-S11",
                "WP03-PASTE-PRODUCT-20261010-S12",
                "WP03-PASTE-PRODUCT-20261010-S13",
            },
            "ingredient-ref-pine-nut-butter": {
                "WP03-PASTE-PRODUCT-20261010-S03",
                "WP03-PASTE-PRODUCT-20261010-S14",
                "WP03-PASTE-PRODUCT-20261010-S16",
                "WP03-PINE-NUT-BUTTER-QC-20261011-S01",
            },
            "ingredient-ref-brazil-nut-butter": {
                "WP03-PASTE-PRODUCT-20261010-S13",
                "WP03-PASTE-PRODUCT-20261010-S17",
                "WP03-PASTE-PRODUCT-20261010-S18",
                "WP03-PASTE-PRODUCT-20261010-S19",
            },
            "ingredient-ref-pumpkin-seed-butter": {
                "WP03-PASTE-PRODUCT-20261010-S04",
                "WP03-PASTE-PRODUCT-20261010-S08",
            },
            "ingredient-ref-sunflower-seed-butter": {
                "WP03-PASTE-PRODUCT-20261010-S04",
                "WP03-PASTE-PRODUCT-20261010-S09",
                "WP03-I-SUNFLOWER-BUTTER-R370-20261016-S01",
                "WP03-I-SUNFLOWER-BUTTER-R370-20261016-S02",
                "WP03-I-SUNFLOWER-BUTTER-R370-20261016-S03",
                "WP03-I-SUNFLOWER-BUTTER-R370-20261016-S04",
                "WP03-I-SUNFLOWER-BUTTER-R370-20261016-S05",
            },
            "ingredient-ref-chestnut-puree": {
                "WP03-PASTE-PRODUCT-20261010-S02",
                "WP03-PASTE-PRODUCT-20261010-S21",
                "WP03-PASTE-PRODUCT-20261010-S24",
            },
            "ingredient-ref-sweetened-chestnut-spread": {
                "WP03-PASTE-PRODUCT-20261010-S02",
                "WP03-PASTE-PRODUCT-20261010-S21",
                "WP03-PASTE-PRODUCT-20261010-S26",
                "WP03-PASTE-PRODUCT-20261010-S27",
            },
            "ingredient-ref-poppy-seed-filling": {
                "WP03-PASTE-PRODUCT-20261010-S22",
                "WP03-PASTE-PRODUCT-20261010-S23",
                "WP03-PASTE-PRODUCT-20261010-S28",
            },
        }
        for record_id, source_ids in expected_sources.items():
            record = records[record_id]
            self.assertEqual("verified", record["identityState"])
            expected_measurement_state = {
                "ingredient-ref-cashew-butter": "researched_supported",
                "ingredient-ref-sunflower-seed-butter": "researched_supported",
            }.get(record_id, "not_yet_researched")
            self.assertEqual(expected_measurement_state, record["measurementState"])
            self.assertEqual("not_yet_researched", record["substitutionResearchState"])
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})
            self.assertEqual("accepted", record["decisions"][-1]["outcome"])
            expected_observation_count = {
                "ingredient-ref-cashew-butter": 4,
                "ingredient-ref-sunflower-seed-butter": 3,
            }.get(record_id, 0)
            self.assertEqual(expected_observation_count, len(record.get("measurementObservations", [])))

    def test_south_asian_identities_and_held_candidates_are_sourced(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected_sources = {
            "ingredient-ref-cumin-seeds": {"WP06-SA-20261010-S02", "WP06-SA-20261010-S10", "WP06-SA-20261010-S26"},
            "ingredient-ref-curry-leaves": {
                "WP06-SA-20261010-S06", "WP06-SA-20261010-S30", "WP06-SA-20261010-S38",
                "WP03-CURRY-LEAVES-QUEBEC-R347-20261016-S01", "WP03-CURRY-LEAVES-QUEBEC-R347-20261016-S02",
                "WP03-CURRY-LEAVES-QUEBEC-R347-20261016-S03", "WP03-CURRY-LEAVES-QUEBEC-R347-20261016-S04",
                "WP03-CURRY-LEAVES-QUEBEC-R347-20261016-S05", "WP03-CURRY-LEAVES-QUEBEC-R347-20261016-S06",
            },
            "ingredient-ref-fenugreek-seeds": {"WP06-SA-20261010-S09", "WP06-SA-20261010-S11", "WP06-SA-20261010-S12", "WP06-SA-20261010-S33"},
            "ingredient-ref-ajwain": {"WP06-SA-20261010-S02", "WP06-SA-20261010-S15", "WP06-SA-20261010-S39"},
            "ingredient-ref-nigella-seeds": {"WP06-SA-20261010-S13", "WP06-SA-20261010-S14", "WP06-SA-20261010-S26"},
            "ingredient-ref-large-cardamom": {"WP06-SA-20261010-S07", "WP06-SA-20261010-S08", "WP06-SA-20261010-S09"},
            "ingredient-ref-ghee": {"WP06-SA-20261010-S01", "WP06-SA-20261010-S02", "WP06-SA-20261010-S16", "WP06-SA-20261010-S17"},
            "ingredient-ref-mustard-oil": {"WP06-SA-20261010-S03", "WP06-SA-20261010-S18"},
            "ingredient-ref-finger-millet-flour": {
                "WP06-SA-20261010-S04",
                "WP06-SA-20261010-S05",
                "WP02-A6-NACHNI-FLOUR-20261012-S01",
                "WP02-A6-NACHNI-FLOUR-20261012-S02",
                "WP02-A6-NACHNI-FLOUR-20261012-S03",
                "WP02-A6-NACHNI-FLOUR-20261012-S04",
                "WP02-A6-RAGI-ATTA-20261012-S01",
                "WP02-A6-RAGI-ATTA-20261012-S02",
                "WP02-A6-RAGI-ATTA-20261012-S03",
                "WP02-A6-RAGI-ATTA-20261012-S04",
                "WP02-A6-RAGI-ATTA-20261012-S05",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S01",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S03",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S04",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S05",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S06",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S07",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S08",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S09",
                "WP02-A6-KURAKKAN-FLOUR-20261012-S10",
                "WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S01",
                "WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S02",
                "WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S03",
                "WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S04",
                "WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S05",
                "WP02-A6-MANDUA-ATTA-ALIAS-R168-20261016-S01",
                "WP02-A6-MANDUA-ATTA-ALIAS-R168-20261016-S02",
            },
            "ingredient-ref-panch-phoron": {"WP06-SA-20261010-S03", "WP06-SA-20261010-S35"},
            "ingredient-ref-rihaakuru": {"WP06-SA-20261010-S31", "WP06-SA-20261010-S32"},
            "ingredient-ref-timur-pepper": {"WP06-SA-20261010-S26", "WP06-SA-20261010-S27", "WP06-SA-20261010-S40"},
        }
        for record_id, source_ids in expected_sources.items():
            record = records[record_id]
            self.assertEqual("ingredient_reference", record["recordType"])
            self.assertEqual("verified", record["identityState"])
            self.assertEqual(
                "researched_supported" if record_id == "ingredient-ref-finger-millet-flour" else "not_yet_researched",
                record["measurementState"],
            )
            self.assertEqual(
                "blocked_pending_evidence" if record_id == "ingredient-ref-finger-millet-flour" else "not_yet_researched",
                record["substitutionResearchState"],
            )
            self.assertEqual(source_ids, {source["sourceId"] for source in record["sources"]})
            self.assertEqual("accepted", record["decisions"][-1]["outcome"])
            expected_observations = 4 if record_id == "ingredient-ref-finger-millet-flour" else 0
            expected_findings = 1 if record_id == "ingredient-ref-finger-millet-flour" else 0
            self.assertEqual(expected_observations, len(record.get("measurementObservations", [])))
            self.assertEqual(expected_findings, len(record.get("substitutionFindings", [])))

        unresolved_ids = {
            "ingredient-ref-date-palm-jaggery",
            "candidate-goraka-paste",
            "ingredient-form-hikimas",
            "ingredient-form-valhoamas",
            "ingredient-ref-himali-jeera",
            "ingredient-ref-jimbu",
            "candidate-kala-zeera",
            "candidate-chaku",
            "candidate-githeyo-mirus",
        }
        for record_id in unresolved_ids:
            self.assertEqual("candidate", records[record_id]["recordType"])
            self.assertEqual("needs_clarification", records[record_id]["identityState"])
            self.assertEqual("unresolved", records[record_id]["decisions"][-1]["outcome"])

        goraka = records["ingredient-ref-goraka"]
        self.assertEqual("ingredient_reference", goraka["recordType"])
        self.assertEqual("verified", goraka["identityState"])
        self.assertEqual("accepted", goraka["decisions"][0]["outcome"])
        self.assertEqual("researched_no_supported_value", goraka["measurementState"])

        millet_flour = records["ingredient-ref-millet-flour"]
        self.assertEqual("ingredient_reference", millet_flour["recordType"])
        self.assertEqual("verified", millet_flour["identityState"])
        self.assertEqual("accepted", millet_flour["decisions"][-1]["outcome"])

    def test_butter_stems_and_gluten_free_blend_integrations_stay_scoped(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        half_salted = references["ingredient-ref-half-salted-butter"]
        self.assertEqual(("half-salted butter", "beurre demi-sel", ["semi-salted butter"]),
                         (half_salted["nameEn"], half_salted["nameFr"], half_salted["aliasesEn"]))
        self.assertNotIn("beurre demi-sel", references["ingredient-ref-salted-butter"]["aliasesFr"])
        butter_recipe = next(
            recipe for recipe in payload["recipes"]
            if any(line.get("originalText") == "170 g semi-salted butter, softened" for line in recipe["ingredients"])
        )
        butter_line = next(line for line in butter_recipe["ingredients"]
                           if line.get("originalText") == "170 g semi-salted butter, softened")
        self.assertEqual("ingredient-ref-half-salted-butter", butter_line["ingredientRefId"])

        new_stem_ids = {
            "ingredient-ref-florence-fennel", "ingredient-ref-globe-artichoke",
            "ingredient-ref-banana-blossom", "ingredient-ref-squash-blossoms",
            "ingredient-ref-nopal-pads", "ingredient-ref-fiddleheads", "ingredient-ref-pea-shoots",
            "ingredient-ref-alfalfa-sprouts", "ingredient-ref-mung-bean-sprouts",
            "ingredient-ref-soybean-sprouts",
        }
        for reference_id in new_stem_ids:
            reference = references[reference_id]
            self.assertEqual("VEGETABLE_AND_AROMATIC", reference["category"])
            self.assertIsNone(reference["defaultDensity"])
            self.assertEqual([], reference["unitMappings"])
        self.assertEqual(
            {"ingredient-ref-celery", "ingredient-ref-asparagus"},
            {line["ingredientRefId"] for recipe in payload["recipes"] for line in recipe["ingredients"]
             if line.get("ingredientRefId") in {"ingredient-ref-celery", "ingredient-ref-asparagus"}
             and (line.get("originalText", "").endswith("celery, chopped")
                  or line.get("originalText", "").endswith("asparagus, trimmed and cut into 1/2-inch pieces"))},
        )

        gf = records["candidate-gluten-free-flour-blend-family"]
        self.assertEqual("candidate", gf["recordType"])
        self.assertEqual("unresolved", gf["decisions"][-1]["outcome"])
        self.assertEqual(
            {34, 37},
            {observation["observedMassG"] for observation in gf["measurementObservations"]},
        )
        self.assertNotIn("ingredient-ref-gluten-free-flour-blend", references)


class BundledSeedPackageCeleryPortionReviewTests(unittest.TestCase):
    def test_unsized_celery_stalk_line_remains_unresolved(self) -> None:
        _, _, payload = load_seed_package()
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        celery = records["ingredient-ref-celery"]
        self.assertEqual("researched_supported", celery["measurementState"])
        self.assertEqual([], next(
            item for item in payload["ingredientReferences"] if item["id"] == "ingredient-ref-celery"
        )["unitMappings"])
        self.assertIsNone(next(
            item for item in payload["ingredientReferences"] if item["id"] == "ingredient-ref-celery"
        )["defaultDensity"])

        source = next(
            item for item in celery["sources"]
            if item["sourceId"] == "WP04-NEXT-CELERY-STALK-20261011-S01"
        )
        self.assertIn("no stalk size, mass", source["supports"])
        decision = next(
            item for item in celery["decisions"]
            if "recipe 077#5" in item["reason"]
        )
        self.assertEqual("unresolved", decision["outcome"])
        self.assertEqual(
            {"WP04-NEXT-CELERY-STALK-20261011-S01", "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S02"},
            set(decision["sourceIds"]),
        )
        self.assertFalse(any(
            "WP04-NEXT-CELERY-STALK-20261011-S01" in observation["sourceIds"]
            for observation in celery["measurementObservations"]
        ))
        self.assertEqual(
            [
                ("celery-raw-small-stalk-13cm-cnf2015-20261010", 17),
                ("celery-raw-medium-stalk-19-20cm-cnf2015-20261010", 40),
                ("celery-raw-large-stalk-28-31cm-cnf2015-20261010", 64),
            ],
            [(item["observationId"], item["observedMassG"]) for item in celery["measurementObservations"]],
        )

        celery_line = next(
            line for recipe in payload["recipes"] for line in recipe["ingredients"]
            if line["id"] == "b8e3b67d-3a62-4e68-8842-457c86bbab5f-ingredient-5"
        )
        self.assertEqual("1 celery stalk, cut into small dice", celery_line["originalText"])
        self.assertEqual("ingredient-ref-celery", celery_line["ingredientRefId"])

    def test_asparagus_bunch_line_remains_exact_and_unconverted(self) -> None:
        _, _, payload = load_seed_package()
        recipe = next(
            recipe for recipe in payload["recipes"]
            if recipe["id"] == "7239d74f-e895-421d-96e4-09a049546aa1"
        )
        line = next(
            line for line in recipe["ingredients"]
            if line["id"] == "7239d74f-e895-421d-96e4-09a049546aa1-ingredient-1"
        )
        self.assertEqual("1 bunch asparagus, trimmed and cut into 1/2-inch pieces", line["originalText"])
        self.assertEqual(1, line["quantity"])
        self.assertEqual("bunch", line["unit"])
        self.assertEqual("ingredient-ref-asparagus", line["ingredientRefId"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        asparagus = records["ingredient-ref-asparagus"]
        decision = next(item for item in asparagus["decisions"] if "recipe 104#1" in item["reason"])
        self.assertEqual("unresolved", decision["outcome"])
        self.assertEqual(5, len(decision["sourceIds"]))
        followup_source_ids = {
            source["sourceId"] for source in asparagus["sources"]
            if source["sourceId"].startswith("WP04-ASPARAGUS-BUNCH-FOLLOWUP-20261011-")
        }
        self.assertEqual(5, len(followup_source_ids))
        self.assertFalse(any(
            followup_source_ids.intersection(observation["sourceIds"])
            for observation in asparagus["measurementObservations"]
        ))

    def test_lemon_half_line_remains_exact_and_measurement_blocked(self) -> None:
        _, _, payload = load_seed_package()
        recipe = next(
            recipe for recipe in payload["recipes"]
            if recipe["id"] == "e0a437cb-da80-4fd5-954d-87caf3b299e7"
        )
        line = next(
            line for line in recipe["ingredients"]
            if line["id"] == "e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-13"
        )
        self.assertEqual("1/2 lemon, thinly sliced", line["originalText"])
        self.assertEqual(0.5, line["quantity"])
        self.assertEqual("item", line["unit"])
        self.assertEqual("ingredient-ref-lemon", line["ingredientRefId"])

        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        lemon = records["ingredient-ref-lemon"]
        self.assertEqual("blocked_pending_evidence", lemon["measurementState"])
        decision = next(
            item for item in lemon["decisions"]
            if item["outcome"] == "unresolved" and "recipe 066#13" in item["reason"]
        )
        source_ids = {f"WP04-LEMON-066-20261011-S{i:02}" for i in range(1, 4)}
        self.assertEqual(source_ids, set(decision["sourceIds"]))
        self.assertEqual(source_ids, {
            source["sourceId"] for source in lemon["sources"]
            if source["sourceId"].startswith("WP04-LEMON-066-20261011-")
        })
        self.assertFalse(any(
            source_ids.intersection(observation["sourceIds"])
            for observation in lemon.get("measurementObservations", [])
        ))


class BundledSeedPackageIntervalMeasurementTests(unittest.TestCase):
    def _ledger_with_tuna_mutation(self, mutate_observation):
        ledger = json.loads(RESEARCH_LEDGER_PATH.read_text(encoding="utf-8"))
        tuna = next(record for record in ledger["records"] if record["recordId"] == "ingredient-ref-tuna")
        mutate_observation(tuna["measurementObservations"][0])
        return ledger

    def test_tuna_interval_preserves_two_source_ranges_and_existing_scalar_portion(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        tuna = records["ingredient-ref-tuna"]
        self.assertEqual("researched_supported", tuna["measurementState"])
        observation = tuna["measurementObservations"][0]
        self.assertEqual("count_weight", observation["relationship"])
        self.assertNotIn("value", observation)
        self.assertNotIn("valueUnit", observation)
        self.assertEqual({"amount": 1, "unit": "tuna steak"}, observation["sourceQuantity"])
        self.assertEqual(
            [
                (10, 12, "oz", "10-12oz."),
                (280, 320, "g", "280-320g"),
            ],
            [
                (item["lowerValue"], item["upperValue"], item["unit"], item["reportedText"])
                for item in observation["valueIntervals"]
            ],
        )
        self.assertTrue(all(item["intervalKind"] == "source_reported_range" for item in observation["valueIntervals"]))
        self.assertTrue(all(item["origin"] == "source_reported" for item in observation["valueIntervals"]))
        self.assertTrue(all(item["lowerInclusive"] is None and item["upperInclusive"] is None
                            for item in observation["valueIntervals"]))

        maraschino = records["ingredient-ref-cerises-au-marasquin"]["measurementObservations"][0]
        self.assertEqual((5.0, "g"), (maraschino["value"], maraschino["valueUnit"]))
        self.assertNotIn("valueIntervals", maraschino)

    def test_interval_validator_rejects_invalid_bounds_and_mixed_shapes(self) -> None:
        cases = [
            ("equal bounds", lambda observation: observation["valueIntervals"][0].update(
                upperValue=observation["valueIntervals"][0]["lowerValue"]
            ), "unordered or equal bounds"),
            ("inverted bounds", lambda observation: observation["valueIntervals"][0].update(
                lowerValue=observation["valueIntervals"][0]["upperValue"] + 1
            ), "unordered or equal bounds"),
            ("zero endpoint", lambda observation: observation["valueIntervals"][0].update(lowerValue=0), "less than or equal to the minimum"),
            ("scalar mixed with intervals", lambda observation: observation.update(value=300, valueUnit="g"), "not valid under any of the given schemas"),
            ("missing source text", lambda observation: observation["valueIntervals"][0].pop("reportedText"), "reportedText"),
            ("unqualified ounce", lambda observation: observation["valueIntervals"][0].pop("unitConvention"), "unitConvention"),
            ("volume count-weight interval", lambda observation: observation["valueIntervals"][1].update(unit="ml"),
             "must use a mass unit"),
            ("unresolved source", lambda observation: observation.update(sourceIds=["missing-source"]),
             "references a source not present"),
            ("derived interval without calculation", lambda observation: observation["valueIntervals"][0].update(origin="derived"),
             "calculation"),
        ]
        for name, mutate, expected_error in cases:
            with self.subTest(case=name):
                ledger = self._ledger_with_tuna_mutation(mutate)
                _, errors = validate_research_ledger(ledger)
                self.assertTrue(any(expected_error in error for error in errors), errors)

    def test_fdc_egg_count_portions_are_source_scoped_and_not_runtime_mappings(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected = {
            "ingredient-ref-egg": (
                "WP07-FDC-EGG-20261010-S01",
                "WP07-EGG-FDC748967-whole-without-shell",
                50.3,
                "large egg, whole without shell",
                "FDC 748967",
            ),
            "ingredient-ref-egg-white": (
                "WP07-FDC-EGG-20261010-S02",
                "WP07-EGG-FDC747997-large-white",
                34.0,
                "large egg white",
                "FDC 747997",
            ),
            "ingredient-ref-egg-yolk": (
                "WP07-FDC-EGG-20261010-S03",
                "WP07-EGG-FDC748236-large-yolk",
                17.0,
                "large egg yolk",
                "FDC 748236",
            ),
        }
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        archive_url = (
            "https://fdc.nal.usda.gov/fdc-datasets/"
            "FoodData_Central_foundation_food_json_2026-04-30.zip"
        )

        for record_id, (source_id, observation_id, grams, unit, fdc_item) in expected.items():
            with self.subTest(record=record_id):
                record = records[record_id]
                self.assertEqual("blocked_pending_evidence", record["measurementState"])
                observation = next(
                    item for item in record["measurementObservations"]
                    if item["observationId"] == observation_id
                )
                self.assertEqual("count_weight", observation["relationship"])
                self.assertEqual((grams, "g"), (observation["value"], observation["valueUnit"]))
                self.assertEqual({"amount": 1, "unit": unit}, observation["sourceQuantity"])
                self.assertEqual("published_portion", observation["evidenceKind"])
                self.assertIn(fdc_item, observation["foodDescription"])
                self.assertNotIn("valueIntervals", observation)
                source = next(item for item in record["sources"] if item["sourceId"] == source_id)
                self.assertEqual(archive_url, source["url"])
                self.assertEqual("food_composition", source["sourceKind"])
                reference = references[record_id]
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])

    def test_egg_variability_ranges_preserve_sample_group_and_brand_bases(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        expected = {
            ("ingredient-ref-egg", "WP07-EGG-VAR-UK-MEDIUM-WHOLE-SHELL-ON-MEAN-RANGE"): (58.2, 60.5),
            ("ingredient-ref-egg", "WP07-EGG-VAR-UK-LARGE-WHOLE-SHELL-ON-MEAN-RANGE"): (64.0, 67.6),
            ("ingredient-ref-egg", "WP07-EGG-VAR-US-SHELL-ON-BRAND-MEAN-RANGE"): (59.6, 62.4),
            ("ingredient-ref-egg-white", "WP07-EGG-VAR-UK-MEDIUM-RAW-WHITE-GROUP-MEAN-RANGE"): (34.4, 37.5),
            ("ingredient-ref-egg-white", "WP07-EGG-VAR-UK-LARGE-RAW-WHITE-GROUP-MEAN-RANGE"): (39.1, 42.7),
            ("ingredient-ref-egg-white", "WP07-EGG-VAR-US-RAW-ALBUMEN-BRAND-MEAN-RANGE"): (30.3, 35.5),
            ("ingredient-ref-egg-yolk", "WP07-EGG-VAR-UK-MEDIUM-RAW-YOLK-GROUP-MEAN-RANGE"): (14.1, 15.7),
            ("ingredient-ref-egg-yolk", "WP07-EGG-VAR-UK-LARGE-RAW-YOLK-GROUP-MEAN-RANGE"): (15.7, 17.7),
            ("ingredient-ref-egg-yolk", "WP07-EGG-VAR-US-RAW-YOLK-BRAND-MEAN-RANGE"): (14.9, 21.4),
        }

        for (record_id, observation_id), bounds in expected.items():
            with self.subTest(record=record_id, observation=observation_id):
                record = records[record_id]
                self.assertEqual("blocked_pending_evidence", record["measurementState"])
                observation = next(
                    item for item in record["measurementObservations"]
                    if item["observationId"] == observation_id
                )
                interval = observation["valueIntervals"][0]
                self.assertEqual((bounds[0], bounds[1], "g"), (
                    interval["lowerValue"], interval["upperValue"], interval["unit"]
                ))
                self.assertEqual("observed_sample_range", interval["intervalKind"])
                self.assertEqual("derived", interval["origin"])
                self.assertIn("not an individual-egg range", observation["calculation"])
                self.assertTrue(
                    "sample-group" in observation["measurementMethod"]
                    or "brand means" in observation["measurementMethod"]
                )
                self.assertIn("WP07-EGG-VAR-AUDIT-20261010-S0", " ".join(observation["sourceIds"]))

    def test_ham_cup_portion_is_source_scoped_and_not_applied_to_recipe_089(self) -> None:
        records, errors = validate_research_ledger()
        self.assertEqual([], errors)
        record = records["ingredient-ref-ham"]
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual(1, len(record["measurementObservations"]))
        observation = record["measurementObservations"][0]
        self.assertEqual("wp04-ham-sr28-10011-cup-diced-20261010", observation["observationId"])
        self.assertEqual("portion_weight", observation["relationship"])
        self.assertEqual((135, "g"), (observation["value"], observation["valueUnit"]))
        self.assertEqual({"amount": 1, "unit": "cup"}, observation["sourceQuantity"])
        self.assertEqual("published_portion", observation["evidenceKind"])
        self.assertIn("USDA SR28 NDB 10011", observation["foodDescription"])
        self.assertIn("Pork, fresh, leg (ham)", observation["foodDescription"])
        self.assertIn("cooked, roasted", observation["foodDescription"])
        self.assertIn("not matched to RecipeBook recipe 089", observation["quantityBasis"])
        self.assertEqual(["WP04-HAM-CUP-20261010-S01"], observation["sourceIds"])
        self.assertNotIn("valueIntervals", observation)

        source = next(item for item in record["sources"] if item["sourceId"] == observation["sourceIds"][0])
        self.assertEqual(
            "https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg10.pdf#page=452",
            source["url"],
        )
        self.assertEqual("food_composition", source["sourceKind"])

        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        reference = references["ingredient-ref-ham"]
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        }
        line = recipe_lines["1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-1"]
        self.assertEqual("1 cup diced ham", line["originalText"])
        self.assertEqual("ingredient-ref-ham", line["ingredientRefId"])
        self.assertEqual((1, "cup"), (line["quantity"], line["unit"]))

    def test_tomato_paste_recipe_package_count_keeps_156_ml_quantity(self) -> None:
        _, _, payload = load_seed_package()
        recipe = next(recipe for recipe in payload["recipes"] if recipe["id"] == "1d0098bc-da72-40b3-ab68-d128d7ba0c3c")
        line = next(
            ingredient for ingredient in recipe["ingredients"]
            if ingredient["id"] == "1d0098bc-da72-40b3-ab68-d128d7ba0c3c-ingredient-12"
        )

        self.assertEqual("156 ml tomato paste", line["originalText"])
        self.assertEqual("ingredient-ref-tomato-paste", line["ingredientRefId"])
        self.assertEqual((156, "ml"), (line["quantity"], line["unit"]))
        self.assertEqual({"fr": "1 boîte", "en": "1 can"}, line["notes"])
        self.assertEqual(
            {
                "count": 1,
                "packageType": "CAN",
                "declaredNetQuantity": 156,
                "declaredNetUnit": "ml",
            },
            line["packageAmount"],
        )

    def test_pinto_bean_recipe_records_only_the_source_supported_can_basis(self) -> None:
        _, _, payload = load_seed_package()
        recipe = next(recipe for recipe in payload["recipes"] if recipe["id"] == "4392bc3d-9785-43ac-b98e-496f96c1d628")
        line = next(
            ingredient for ingredient in recipe["ingredients"]
            if ingredient["id"] == "4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-4"
        )

        self.assertEqual("1 can pinto beans with liquid", line["originalText"])
        self.assertEqual("ingredient-ref-pinto-beans", line["ingredientRefId"])
        self.assertEqual((1, "can"), (line["quantity"], line["unit"]))
        self.assertEqual({"fr": "avec le liquide", "en": "with liquid"}, line["preparation"])
        self.assertEqual(
            {"count": 1, "packageType": "CAN", "requestedBasis": "NET_CONTENTS"},
            line["packageAmount"],
        )

    def test_recipe_reference_links_preserve_source_lines_and_leave_unqualified_butter_unlinked(self) -> None:
        _, _, payload = load_seed_package()
        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        }

        expected_links = {
            "e1e7939b-206f-4839-97d9-2a91febb28eb-ingredient-6": (
                "ingredient-ref-paprika", "1 tbsp paprika", 1, "tbsp"
            ),
            "30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-3": (
                "ingredient-ref-water", "180 ml water", 180, "ml"
            ),
            "d2f76a5c-63b6-4dad-b33d-f3270a04f5c2-ingredient-2": (
                "ingredient-ref-water", "1 cup water", 1, "cup"
            ),
            "4207e09a-429f-437f-b7bd-14e862d6d696-ingredient-14": (
                "ingredient-ref-coffee", "240 ml hot coffee", 240, "ml"
            ),
            "f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-5": (
                "ingredient-ref-water", "1 cup water", 1, "cup"
            ),
            "f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-8": (
                "ingredient-ref-egg-yolk", "3 large egg yolks", 3, "count"
            ),
            "f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-24": (
                "ingredient-ref-water", "1/4 cup plus 2 tbsp water", 0.375, "cup"
            ),
            "a3d38f7e-1c25-402b-a51e-8f99680eb02c-ingredient-1": (
                "ingredient-ref-water", "1 1/4 cups boiling water", 1.25, "cup"
            ),
            "7dde7849-5f6e-4e20-b84f-e90fa780d871-ingredient-7": (
                "ingredient-ref-nuts", "Nuts, to taste", 1, "to taste"
            ),
            "e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-7": (
                "ingredient-ref-water", "1 cup water", 1, "cup"
            ),
            "81d376ac-c305-402f-a73d-8bb721045319-ingredient-5": (
                "ingredient-ref-margarine", "1 1/3 tbsp margarine", 1.3333333333, "tbsp"
            ),
            "cfa64319-d4b9-4425-b087-3e30be3cc4a0-ingredient-11": (
                "ingredient-ref-egg-yolk", "1 egg yolk", 1, "count"
            ),
        }
        for line_id, (reference_id, original_text, quantity, unit) in expected_links.items():
            with self.subTest(line_id=line_id):
                line = recipe_lines[line_id]
                self.assertEqual(reference_id, line["ingredientRefId"])
                self.assertEqual(original_text, line["originalText"])
                self.assertEqual(quantity, line["quantity"])
                self.assertEqual(unit, line["unit"])

        peanut_component = recipe_lines["89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-17"]
        self.assertEqual("ingredient-ref-peanuts", peanut_component["ingredientRefId"])
        self.assertEqual("peanuts", peanut_component["ingredientName"])
        self.assertEqual("peanuts and fresh cilantro, for garnish", peanut_component["originalText"])
        self.assertEqual("with fresh cilantro, for garnish", peanut_component["notes"]["en"])

        unlinked_line_ids = {
            "ff66e4f7-c719-4203-970b-06993cdb25de-ingredient-2",  # unqualified butter
        }
        for line_id in unlinked_line_ids:
            with self.subTest(unlinked_line_id=line_id):
                self.assertNotIn("ingredientRefId", recipe_lines[line_id])

    def test_baking_inclusion_links_and_identities_preserve_recipe_context(self) -> None:
        _, _, payload = load_seed_package()
        refs = {reference["id"]: reference for reference in payload["ingredientReferences"]}
        recipe_lines = {
            ingredient["id"]: ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
        }

        expected_refs = {
            "ingredient-ref-butterscotch-chips": ("brisures de caramel écossais", "butterscotch chips"),
            "ingredient-ref-candied-ginger": ("gingembre confit", "candied ginger"),
            "ingredient-ref-candied-lemon-peel": ("écorce de citron confite", "candied lemon peel"),
            "ingredient-ref-candied-orange-peel": ("écorce d’orange confite", "candied orange peel"),
            "ingredient-ref-glace-cherries": ("cerises confites", "glacé cherries"),
            "ingredient-ref-nougat": ("nougat", "nougat"),
            "ingredient-ref-sugar-pearls": ("perles de sucre", "sugar pearls"),
            "ingredient-ref-sprinkles": ("bonbons décoratifs", "sprinkles"),
        }
        for reference_id, (name_fr, name_en) in expected_refs.items():
            with self.subTest(reference_id=reference_id):
                self.assertEqual(name_fr, refs[reference_id]["nameFr"])
                self.assertEqual(name_en, refs[reference_id]["nameEn"])
                self.assertIsNone(refs[reference_id]["defaultDensity"])
                self.assertEqual([], refs[reference_id]["unitMappings"])

        self.assertEqual(
            "crystallized ginger",
            refs["ingredient-ref-candied-ginger"]["aliasesEn"][0],
        )
        self.assertEqual(
            "gingembre cristallisé",
            refs["ingredient-ref-candied-ginger"]["aliasesFr"][0],
        )

        expected_links = {
            "b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-17": (
                "ingredient-ref-sugar-pearls", "Sugar pearls, to taste", None, None, "Decoration"
            ),
            "f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-28": (
                "ingredient-ref-chocolate-shavings",
                "Bittersweet and white chocolate shavings, for garnish",
                None, None, "Garnish"
            ),
            "2d53895b-8bd0-4225-bf63-766d29418eac-ingredient-11": (
                "ingredient-ref-chocolate-shavings", "Chocolate shavings", 1, "for garnish", "For serving"
            ),
        }
        for line_id, (reference_id, text, quantity, unit, group) in expected_links.items():
            with self.subTest(line_id=line_id):
                line = recipe_lines[line_id]
                self.assertEqual(reference_id, line["ingredientRefId"])
                self.assertEqual(text, line["originalText"])
                self.assertEqual(quantity, line.get("quantity"))
                self.assertEqual(unit, line.get("unit"))
                self.assertEqual(group, line["group"])

        glace_link_ids = {
            line_id for line_id, line in recipe_lines.items()
            if line.get("ingredientRefId") == "ingredient-ref-glace-cherries"
        }
        self.assertEqual(set(), glace_link_ids)


class BundledSeedPackageDatePowderAndCricketIdentityTests(unittest.TestCase):
    def test_date_powder_is_a_form_with_only_source_specific_measurement_evidence(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        forms = {item["id"]: item for item in payload["ingredientForms"]}
        dried_dates = references["ingredient-ref-dried-dates"]
        powder = forms["ingredient-form-dried-dates-powdered"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("dattes en poudre", powder["labelFr"])
        self.assertEqual("date powder", powder["labelEn"])
        self.assertEqual(["sucre de dattes", "poudre de datte"], powder["matchTermsFr"])
        self.assertEqual(["date sugar"], powder["matchTermsEn"])
        self.assertIsNone(powder["densityGPerMl"])
        self.assertIsNone(dried_dates["defaultDensity"])
        self.assertEqual([], dried_dates["unitMappings"])
        self.assertNotIn("date sugar", dried_dates["aliasesEn"])
        self.assertNotIn("sucre de dattes", dried_dates["aliasesFr"])

        form_record = ledger_records["ingredient-form-dried-dates-powdered"]
        self.assertEqual("researched_supported", form_record["measurementState"])
        self.assertEqual("blocked_pending_evidence", form_record["substitutionResearchState"])
        self.assertEqual(1, len(form_record["measurementObservations"]))
        observation = form_record["measurementObservations"][0]
        self.assertEqual(28, observation["observedMassG"])
        self.assertEqual({"amount": 0.25, "unit": "cup"}, observation["sourceQuantity"])
        self.assertIn("not a generic bulk density", observation["quantityBasis"])

        linked_lines = [
            ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
            if ingredient.get("ingredientFormId") == powder["id"]
        ]
        self.assertEqual([], linked_lines)

    def test_cricket_powder_identity_stays_species_qualified_and_numeric_data_free(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        cricket = references["ingredient-ref-house-cricket-powder"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("house cricket powder", cricket["nameEn"])
        self.assertEqual("poudre de grillon domestique", cricket["nameFr"])
        self.assertEqual("PROTEIN", cricket["category"])
        self.assertEqual([], cricket["aliasesEn"])
        self.assertEqual([], cricket["aliasesFr"])
        self.assertIsNone(cricket["defaultDensity"])
        self.assertEqual([], cricket["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == cricket["id"] for form in payload["ingredientForms"]))

        record = ledger_records["ingredient-ref-house-cricket-powder"]
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        linked_lines = [
            ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
            if ingredient.get("ingredientRefId") == cricket["id"]
        ]
        self.assertEqual([], linked_lines)

    def test_coconut_sugar_is_distinct_and_keeps_measures_ledger_only(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        coconut = references["ingredient-ref-coconut-sugar"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("coconut sugar", coconut["nameEn"])
        self.assertEqual("sucre de noix de coco", coconut["nameFr"])
        self.assertEqual("SUGAR_AND_SWEETENER", coconut["category"])
        self.assertEqual(
            ["coconut blossom sugar", "coconut palm sugar", "coconut sap sugar", "coco sugar"],
            coconut["aliasesEn"],
        )
        self.assertEqual(["sucre de coco", "sucre de fleur de coco"], coconut["aliasesFr"])
        self.assertIsNone(coconut["defaultDensity"])
        self.assertEqual([], coconut["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == coconut["id"] for form in payload["ingredientForms"]))

        record = ledger_records["ingredient-ref-coconut-sugar"]
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("blocked_pending_evidence", record["substitutionResearchState"])
        self.assertEqual(2, len(record["measurementObservations"]))
        self.assertEqual(
            {4, 77},
            {observation["observedMassG"] for observation in record["measurementObservations"]},
        )
        self.assertTrue(
            all(
                "not" in observation["quantityBasis"].casefold()
                or "no " in observation["quantityBasis"].casefold()
                for observation in record["measurementObservations"]
            )
        )
        linked_lines = [
            ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
            if ingredient.get("ingredientRefId") == coconut["id"]
        ]
        self.assertEqual([], linked_lines)

    def test_moth_bean_identity_is_species_scoped_and_numeric_data_free(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        moth_beans = references["ingredient-ref-moth-beans"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("moth beans", moth_beans["nameEn"])
        self.assertEqual("haricots papillon", moth_beans["nameFr"])
        self.assertEqual("LEGUME_AND_PULSE", moth_beans["category"])
        self.assertEqual(["mat bean", "matki", "moth bean"], moth_beans["aliasesEn"])
        self.assertEqual(["haricot mat", "haricot papillon"], moth_beans["aliasesFr"])
        self.assertIsNone(moth_beans["defaultDensity"])
        self.assertEqual([], moth_beans["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == moth_beans["id"] for form in payload["ingredientForms"]))

        record = ledger_records["ingredient-ref-moth-beans"]
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        linked_lines = [
            ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
            if ingredient.get("ingredientRefId") == moth_beans["id"]
        ]
        self.assertEqual([], linked_lines)

    def test_banded_cricket_powder_keeps_species_and_measurement_scope(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        banded = references["ingredient-ref-banded-cricket-powder"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("banded cricket powder", banded["nameEn"])
        self.assertEqual("poudre de grillon à bandes", banded["nameFr"])
        self.assertEqual("PROTEIN", banded["category"])
        self.assertEqual([], banded["aliasesEn"])
        self.assertEqual([], banded["aliasesFr"])
        self.assertIsNone(banded["defaultDensity"])
        self.assertEqual([], banded["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == banded["id"] for form in payload["ingredientForms"]))

        record = ledger_records["ingredient-ref-banded-cricket-powder"]
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("blocked_pending_evidence", record["substitutionResearchState"])
        self.assertEqual(1, len(record["measurementObservations"]))
        observation = record["measurementObservations"][0]
        self.assertEqual({"amount": 1, "unit": "tbsp"}, observation["sourceQuantity"])
        self.assertEqual(10, observation["observedMassG"])
        self.assertIn("about 10 g", observation["quantityBasis"])
        self.assertIn("not a default tablespoon weight", observation["quantityBasis"])
        linked_lines = [
            ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
            if ingredient.get("ingredientRefId") == banded["id"]
        ]
        self.assertEqual([], linked_lines)

    def test_bambara_beans_are_distinct_from_moth_beans_and_have_no_numeric_data(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        bambara = references["ingredient-ref-bambara-beans"]
        moth_beans = references["ingredient-ref-moth-beans"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("Bambara beans", bambara["nameEn"])
        self.assertEqual("pois bambara", bambara["nameFr"])
        self.assertEqual("LEGUME_AND_PULSE", bambara["category"])
        self.assertEqual(["Bambara bean", "Bambara groundnut", "Bambara groundnuts"], bambara["aliasesEn"])
        self.assertEqual(["pois de terre", "voandzou"], bambara["aliasesFr"])
        self.assertIsNone(bambara["defaultDensity"])
        self.assertEqual([], bambara["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == bambara["id"] for form in payload["ingredientForms"]))
        self.assertNotEqual(moth_beans["id"], bambara["id"])

        record = ledger_records["ingredient-ref-bambara-beans"]
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertNotIn("measurementObservations", record)
        linked_lines = [
            ingredient
            for recipe in payload["recipes"]
            for ingredient in recipe.get("ingredients", [])
            if ingredient.get("ingredientRefId") == bambara["id"]
        ]
        self.assertEqual([], linked_lines)

    def test_brown_rice_syrup_promotes_legacy_identity_and_keeps_observations_in_ledger(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        brown_rice_syrup = references["ingredient-ref-brown-rice-syrup"]
        ledger_records, errors = validate_research_ledger()
        legacy = json.loads(
            (RESEARCH_LEDGER_PATH.parent / "legacy-import-identities.v1.json").read_text(encoding="utf-8")
        )

        self.assertEqual([], errors)
        self.assertEqual("brown rice syrup", brown_rice_syrup["nameEn"])
        self.assertEqual("sirop de riz brun", brown_rice_syrup["nameFr"])
        self.assertEqual("SUGAR_AND_SWEETENER", brown_rice_syrup["category"])
        self.assertEqual([], brown_rice_syrup["aliasesEn"])
        self.assertEqual([], brown_rice_syrup["aliasesFr"])
        self.assertIsNone(brown_rice_syrup["defaultDensity"])
        self.assertEqual([], brown_rice_syrup["unitMappings"])
        self.assertFalse(
            any(form["ingredientRefId"] == brown_rice_syrup["id"] for form in payload["ingredientForms"])
        )
        self.assertNotIn("ingredient-ref-brown-rice-syrup", {item["id"] for item in legacy["candidates"]})
        self.assertEqual(len(legacy["candidates"]), legacy["candidateCount"])

        record = ledger_records["ingredient-ref-brown-rice-syrup"]
        self.assertEqual("ingredient_reference", record["recordType"])
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("blocked_pending_evidence", record["substitutionResearchState"])
        self.assertEqual(14, len(record["sources"]))
        self.assertEqual(3, len(record["measurementObservations"]))
        self.assertEqual({11.89, 11.84, 11.78}, {item["value"] for item in record["measurementObservations"]})
        self.assertTrue(all(item["valueUnit"] == "lb/US gal" for item in record["measurementObservations"]))
        self.assertTrue(all("not a household" in item["quantityBasis"] for item in record["measurementObservations"]))
        self.assertFalse(
            any(item["nameEn"] == "rice syrup" or item["nameFr"] == "sirop de riz" for item in references.values())
        )
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == brown_rice_syrup["id"]
            ],
        )

    def test_agave_syrup_is_separate_and_honey_measurements_stay_ledger_only(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        agave = references["ingredient-ref-agave-syrup"]
        honey = references["ingredient-ref-honey"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("agave syrup", agave["nameEn"])
        self.assertEqual("sirop d’agave", agave["nameFr"])
        self.assertEqual("SUGAR_AND_SWEETENER", agave["category"])
        self.assertEqual([], agave["aliasesEn"])
        self.assertEqual([], agave["aliasesFr"])
        self.assertIsNone(agave["defaultDensity"])
        self.assertEqual([], agave["unitMappings"])
        self.assertEqual("honey", honey["nameEn"])
        self.assertEqual("miel", honey["nameFr"])
        self.assertIsNone(honey["defaultDensity"])
        self.assertEqual([], honey["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == agave["id"] for form in payload["ingredientForms"]))
        self.assertFalse(any("agave nectar" in alias.lower() for alias in agave["aliasesEn"]))

        agave_record = ledger_records["ingredient-ref-agave-syrup"]
        self.assertEqual("verified", agave_record["identityState"])
        self.assertEqual("researched_no_supported_value", agave_record["measurementState"])
        self.assertEqual("blocked_pending_evidence", agave_record["substitutionResearchState"])
        self.assertEqual([], agave_record.get("measurementObservations", []))
        self.assertIn(
            "agave-syrup-editorial-substitution-note-limited-context-20261011",
            {finding["findingId"] for finding in agave_record["substitutionFindings"]},
        )

        honey_record = ledger_records["ingredient-ref-honey"]
        self.assertEqual("verified", honey_record["identityState"])
        self.assertEqual("researched_supported", honey_record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", honey_record["substitutionResearchState"])
        observations = honey_record["measurementObservations"]
        self.assertEqual({5, 15, 100}, {item["sourceQuantity"]["amount"] for item in observations})
        self.assertEqual({7.2, 21.5, 143.2}, {item["observedMassG"] for item in observations})
        self.assertTrue(all("not a default density" in item["quantityBasis"] for item in observations))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == agave["id"]
            ],
        )

    def test_great_northern_beans_are_identity_only_and_keep_white_bean_boundaries(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        great_northern = references["ingredient-ref-great-northern-beans"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("Great Northern beans", great_northern["nameEn"])
        self.assertEqual("haricots Great Northern", great_northern["nameFr"])
        self.assertEqual(["Great Northern bean"], great_northern["aliasesEn"])
        self.assertEqual(["haricot Great Northern"], great_northern["aliasesFr"])
        self.assertEqual("LEGUME_AND_PULSE", great_northern["category"])
        self.assertIsNone(great_northern["defaultDensity"])
        self.assertEqual([], great_northern["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == great_northern["id"] for form in payload["ingredientForms"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == great_northern["id"]
            ],
        )

        record = ledger_records[great_northern["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("blocked_pending_evidence", record["substitutionResearchState"])
        self.assertEqual(7, len(record["sources"]))
        self.assertEqual(
            {183, 177},
            {observation["observedMassG"] for observation in record["measurementObservations"]},
        )
        self.assertTrue(all(observation["sourceQuantity"] == {"amount": 1, "unit": "cup", "unitConvention": "USDA common measure"}
                            for observation in record["measurementObservations"]))
        self.assertEqual(
            "blocked_pending_evidence",
            record["substitutionFindings"][0]["researchState"],
        )
        self.assertNotIn("white beans", great_northern["aliasesEn"])
        self.assertNotIn("haricots blancs", great_northern["aliasesFr"])
        self.assertNotIn("navy beans", great_northern["aliasesEn"])
        self.assertNotIn("cannellini beans", great_northern["aliasesEn"])
        self.assertNotIn("gros haricots blancs", great_northern["aliasesFr"])
        self.assertNotIn("grands haricots blancs", great_northern["aliasesFr"])

    def test_mung_beans_are_species_scoped_identity_only_and_separate_from_products(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        mung_beans = references["ingredient-ref-mung-beans"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("mung beans", mung_beans["nameEn"])
        self.assertEqual("haricots mungo", mung_beans["nameFr"])
        self.assertEqual(["mung bean", "green gram", "golden gram"], mung_beans["aliasesEn"])
        self.assertEqual(["haricot mungo"], mung_beans["aliasesFr"])
        self.assertEqual("LEGUME_AND_PULSE", mung_beans["category"])
        self.assertIsNone(mung_beans["defaultDensity"])
        self.assertEqual([], mung_beans["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == mung_beans["id"] for form in payload["ingredientForms"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == mung_beans["id"]
            ],
        )
        record = ledger_records[mung_beans["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual(4, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))
        for excluded in ["black gram", "black grams", "urd", "urad", "mung bean flour", "mung dal"]:
            self.assertNotIn(excluded, mung_beans["aliasesEn"])
        for sibling_id in (
            "ingredient-ref-mung-bean-sprouts",
            "ingredient-ref-mung-bean-starch",
            "ingredient-ref-bean-thread-cellophane-noodles",
        ):
            self.assertIn(sibling_id, references)
            self.assertNotEqual(mung_beans["id"], references[sibling_id]["id"])

    def test_golden_syrup_is_separate_from_corn_syrup_and_generic_molasses(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        golden_syrup = references["ingredient-ref-golden-syrup"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("golden syrup", golden_syrup["nameEn"])
        self.assertEqual("sirop doré", golden_syrup["nameFr"])
        self.assertEqual(["refined sugar syrup", "refiners' syrup"], golden_syrup["aliasesEn"])
        self.assertEqual(
            ["sirop de sucre raffiné", "sirop de raffineur", "mélasse claire", "mélasse légère"],
            golden_syrup["aliasesFr"],
        )
        self.assertEqual("SUGAR_AND_SWEETENER", golden_syrup["category"])
        self.assertIsNone(golden_syrup["defaultDensity"])
        self.assertEqual([], golden_syrup["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == golden_syrup["id"] for form in payload["ingredientForms"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == golden_syrup["id"]
            ],
        )
        record = ledger_records[golden_syrup["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual(5, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))
        self.assertNotIn("golden corn syrup", golden_syrup["aliasesEn"])
        self.assertNotIn("molasses", golden_syrup["aliasesEn"])
        self.assertNotIn("mélasse", golden_syrup["aliasesFr"])
        for sibling_id in (
            "ingredient-ref-corn-syrup",
            "ingredient-ref-dark-corn-syrup",
            "ingredient-ref-glucose-syrup",
            "ingredient-ref-invert-sugar",
            "ingredient-ref-liquid-invert-sugar",
            "ingredient-ref-maple-syrup",
            "ingredient-ref-blackstrap-molasses",
        ):
            self.assertIn(sibling_id, references)
            self.assertNotEqual(golden_syrup["id"], references[sibling_id]["id"])

    def test_light_corn_syrup_is_a_distinct_grade_with_source_scoped_portions(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        light = references["ingredient-ref-light-corn-syrup"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("light corn syrup", light["nameEn"])
        self.assertEqual("sirop de maïs clair", light["nameFr"])
        self.assertEqual([], light["aliasesEn"])
        self.assertEqual(["sirop de maïs léger"], light["aliasesFr"])
        self.assertEqual("SUGAR_AND_SWEETENER", light["category"])
        self.assertIsNone(light["defaultDensity"])
        self.assertEqual([], light["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == light["id"] for form in payload["ingredientForms"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == light["id"]
            ],
        )
        record = ledger_records[light["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("blocked_pending_evidence", record["substitutionResearchState"])
        observations = record["measurementObservations"]
        self.assertEqual(5, len(observations))
        self.assertEqual(
            {(15, 20.8), (30, 41.6), (100, 138.6), (125, 173.3), (250, 346.6)},
            {
                (observation["sourceQuantity"]["amount"], observation["value"])
                for observation in observations
            },
        )
        self.assertTrue(
            all("not a default density or mapping" in observation["quantityBasis"]
                for observation in observations)
        )
        self.assertEqual("blocked_pending_evidence", record["substitutionFindings"][0]["researchState"])
        self.assertIn("ingredient-ref-corn-syrup", references)
        self.assertIn("ingredient-ref-dark-corn-syrup", references)
        self.assertNotEqual(light["id"], references["ingredient-ref-corn-syrup"]["id"])
        self.assertNotEqual(light["id"], references["ingredient-ref-dark-corn-syrup"]["id"])

    def test_navy_beans_promote_the_candidate_without_claiming_generic_white_beans(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        navy = references["ingredient-ref-navy-beans"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("navy beans", navy["nameEn"])
        self.assertEqual("haricots Navy", navy["nameFr"])
        self.assertEqual(["navy bean", "white pea bean", "white pea beans"], navy["aliasesEn"])
        self.assertEqual(["petit haricot blanc"], navy["aliasesFr"])
        self.assertEqual("LEGUME_AND_PULSE", navy["category"])
        self.assertIsNone(navy["defaultDensity"])
        self.assertEqual([], navy["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == navy["id"] for form in payload["ingredientForms"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == navy["id"]
            ],
        )
        record = ledger_records[navy["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual(6, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))
        for sibling_id in (
            "ingredient-ref-great-northern-beans",
            "ingredient-ref-cannellini-beans",
            "ingredient-ref-kidney-beans",
            "ingredient-ref-yellow-peas",
        ):
            self.assertNotEqual(navy["id"], references[sibling_id]["id"])

    def test_cannellini_beans_keep_the_white_kidney_phrase_collision_inactive(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        cannellini = references["ingredient-ref-cannellini-beans"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("cannellini beans", cannellini["nameEn"])
        self.assertEqual("haricots cannellini", cannellini["nameFr"])
        self.assertEqual(["cannellini bean", "cannellino bean"], cannellini["aliasesEn"])
        self.assertEqual(["haricot cannellini"], cannellini["aliasesFr"])
        self.assertEqual("LEGUME_AND_PULSE", cannellini["category"])
        self.assertIsNone(cannellini["defaultDensity"])
        self.assertEqual([], cannellini["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == cannellini["id"] for form in payload["ingredientForms"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == cannellini["id"]
            ],
        )
        record = ledger_records[cannellini["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual(9, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual(1, len(record["substitutionFindings"]))
        self.assertNotIn("white kidney bean", cannellini["aliasesEn"])
        self.assertNotIn("white kidney beans", cannellini["aliasesEn"])
        self.assertNotIn("white beans", cannellini["aliasesEn"])
        self.assertNotIn("haricots blancs", cannellini["aliasesFr"])
        self.assertEqual("kidney beans", references["ingredient-ref-kidney-beans"]["nameEn"])
        self.assertNotEqual(cannellini["id"], references["ingredient-ref-kidney-beans"]["id"])
        self.assertNotEqual(cannellini["id"], references["ingredient-ref-great-northern-beans"]["id"])

    def test_rabbit_meat_is_a_scoped_identity_only_reference(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        rabbit = references["ingredient-ref-rabbit-meat"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("rabbit meat", rabbit["nameEn"])
        self.assertEqual("viande de lapin", rabbit["nameFr"])
        self.assertEqual([], rabbit["aliasesEn"])
        self.assertEqual([], rabbit["aliasesFr"])
        self.assertEqual("PROTEIN", rabbit["category"])
        self.assertIsNone(rabbit["defaultDensity"])
        self.assertEqual([], rabbit["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == rabbit["id"] for form in payload["ingredientForms"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == rabbit["id"]
            ],
        )
        record = ledger_records[rabbit["id"]]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("not_yet_researched", record["measurementState"])
        self.assertEqual("not_yet_researched", record["substitutionResearchState"])
        self.assertEqual(3, len(record["sources"]))
        self.assertEqual([], record.get("measurementObservations", []))
        self.assertEqual([], record.get("substitutionFindings", []))

    def test_blackstrap_molasses_is_separate_from_generic_and_pomegranate_molasses(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        blackstrap = references["ingredient-ref-blackstrap-molasses"]
        ledger_records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("blackstrap molasses", blackstrap["nameEn"])
        self.assertEqual("mélasse verte", blackstrap["nameFr"])
        self.assertEqual("SUGAR_AND_SWEETENER", blackstrap["category"])
        self.assertEqual(["blackstrap", "black strap", "third molasses"], blackstrap["aliasesEn"])
        self.assertEqual([], blackstrap["aliasesFr"])
        self.assertIsNone(blackstrap["defaultDensity"])
        self.assertEqual([], blackstrap["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == blackstrap["id"] for form in payload["ingredientForms"]))

        record = ledger_records["ingredient-ref-blackstrap-molasses"]
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_supported", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual(9, len(record["sources"]))
        self.assertEqual(5, len(record["measurementObservations"]))
        self.assertIn(
            {"amount": 15, "unit": "mL"},
            [observation.get("sourceQuantity") for observation in record["measurementObservations"]],
        )
        self.assertTrue(
            all("not a default density" in observation["quantityBasis"]
                for observation in record["measurementObservations"])
        )
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == blackstrap["id"]
            ],
        )

    def test_mealworm_candidate_stays_held_without_an_active_identity_or_recipe_link(self) -> None:
        _, _, payload = load_seed_package()
        ledger_records, errors = validate_research_ledger()
        candidate = ledger_records["candidate-mealworm-human-food-product-boundary"]
        searchable_reference_text = " ".join(
            term
            for reference in payload["ingredientReferences"]
            for term in [reference["nameEn"], reference["nameFr"], *reference["aliasesEn"], *reference["aliasesFr"]]
        ).casefold()

        self.assertEqual([], errors)
        self.assertEqual("needs_clarification", candidate["identityState"])
        self.assertEqual("researched_no_supported_value", candidate["measurementState"])
        self.assertEqual("researched_no_supported_substitute", candidate["substitutionResearchState"])
        self.assertEqual("unresolved", candidate["decisions"][0]["outcome"])
        self.assertEqual(23, len(candidate["sources"]))
        self.assertTrue(
            {f"MW-CURRENT-{index:02}" for index in range(1, 13)}
            <= {source["sourceId"] for source in candidate["sources"]}
        )
        self.assertNotIn("mealworm", searchable_reference_text)
        self.assertNotIn("ténébrion", searchable_reference_text)
        self.assertNotIn("tenebrio", searchable_reference_text)
        self.assertTrue(all("mealworm" not in str(recipe).casefold() for recipe in payload["recipes"]))

    def test_abalone_candidate_stays_held_pending_species_and_product_demand(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"] for item in payload["ingredientReferences"]}
        ledger_records, errors = validate_research_ledger()
        candidate = ledger_records["candidate-abalone-species-product-boundary"]

        self.assertEqual([], errors)
        self.assertNotIn("ingredient-ref-abalone", references)
        self.assertEqual("candidate", candidate["recordType"])
        self.assertEqual("needs_clarification", candidate["identityState"])
        self.assertEqual("researched_no_supported_value", candidate["measurementState"])
        self.assertEqual("researched_no_supported_substitute", candidate["substitutionResearchState"])
        self.assertEqual(8, len(candidate["sources"]))
        self.assertEqual(
            [],
            [
                ingredient
                for recipe in payload["recipes"]
                for ingredient in recipe.get("ingredients", [])
                if ingredient.get("ingredientRefId") == "ingredient-ref-abalone"
            ],
        )


class WP03HempSeedButterBoundaryTests(unittest.TestCase):
    def test_hemp_seed_butter_stays_held_until_the_product_seed_hull_state_is_known(self) -> None:
        _, _, payload = load_seed_package()
        ledger_records, errors = validate_research_ledger()
        candidate = ledger_records["candidate-hemp-seed-butter"]
        active_terms = [
            term
            for reference in payload["ingredientReferences"]
            for term in [reference["nameEn"], reference["nameFr"], *reference["aliasesEn"], *reference["aliasesFr"]]
        ]
        active_terms.extend(
            term
            for form in payload["ingredientForms"]
            for term in [form["labelEn"], form["labelFr"], *form["matchTermsEn"], *form["matchTermsFr"]]
        )
        active_text = " ".join(active_terms).casefold()

        self.assertEqual([], errors)
        self.assertEqual("candidate", candidate["recordType"])
        self.assertEqual("needs_clarification", candidate["identityState"])
        self.assertEqual("researched_no_supported_value", candidate["measurementState"])
        self.assertEqual("researched_no_supported_substitute", candidate["substitutionResearchState"])
        self.assertEqual("unresolved", candidate["decisions"][0]["outcome"])
        self.assertEqual(5, len(candidate["sources"]))
        self.assertNotIn("hemp seed butter", active_text)
        self.assertNotIn("hemp butter", active_text)
        self.assertNotIn("beurre de graines de chanvre", active_text)
        self.assertFalse(any("hemp seed butter" in json.dumps(recipe).casefold() for recipe in payload["recipes"]))


class BundledSeedPackageCrabMeatGradeTests(unittest.TestCase):
    def test_jumbo_lump_crab_meat_is_a_form_of_generic_crab_meat(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        crab = references["ingredient-ref-crab"]
        jumbo_lump = next(form for form in payload["ingredientForms"] if form["id"] == "ingredient-form-crab-jumbo-lump")
        recipe_rows = {
            row["id"]: row
            for recipe in payload["recipes"]
            for row in recipe.get("ingredients", [])
        }
        line = recipe_rows["135813a6-75e2-4596-8c71-ffd450fab0ca-ingredient-8"]
        records, errors = validate_research_ledger()

        self.assertEqual([], errors)
        self.assertEqual("crab meat", crab["nameEn"])
        self.assertEqual("chair de crabe", crab["nameFr"])
        self.assertEqual("PROTEIN", crab["category"])
        self.assertEqual([], crab["aliasesEn"])
        self.assertEqual([], crab["aliasesFr"])
        self.assertIsNone(crab["defaultDensity"])
        self.assertEqual([], crab["unitMappings"])
        self.assertNotIn("ingredient-ref-jumbo-lump-crab-meat", references)

        self.assertEqual("ingredient-ref-crab", jumbo_lump["ingredientRefId"])
        self.assertEqual("jumbo_lump", jumbo_lump["formCode"])
        self.assertEqual("jumbo lump crab meat", jumbo_lump["labelEn"])
        self.assertEqual("chair de crabe en gros morceaux (jumbo lump)", jumbo_lump["labelFr"])
        self.assertIsNone(jumbo_lump["densityGPerMl"])
        self.assertEqual("ingredient-ref-crab", line["ingredientRefId"])
        self.assertEqual("ingredient-form-crab-jumbo-lump", line["ingredientFormId"])
        self.assertEqual("1 lb jumbo lump crab meat", line["originalText"])
        self.assertEqual("jumbo lump crab meat", line["ingredientName"])
        self.assertEqual((1, "lb"), (line["quantity"], line["unit"]))
        self.assertEqual([], line.get("substitutions", []))
        self.assertFalse(any(
            rule.get("fromIngredientRefId") == crab["id"] or rule.get("toIngredientRefId") == crab["id"]
            for part in ("substitutionRules", "contextualSubstitutionRules")
            for rule in payload[part]
        ))

        crab_record = records["ingredient-ref-crab"]
        form_record = records["ingredient-form-crab-jumbo-lump"]
        self.assertEqual("ingredient_reference", crab_record["recordType"])
        self.assertEqual("verified", crab_record["identityState"])
        self.assertEqual("not_yet_researched", crab_record["measurementState"])
        self.assertEqual("not_yet_researched", crab_record["substitutionResearchState"])
        self.assertEqual("accepted", crab_record["decisions"][-1]["outcome"])
        self.assertEqual(
            {
                "WP04-MOLLUSKS-20261009-S01",
                "WP04-CRAB-MEAT-20261011-S01",
                "WP04-CRAB-MEAT-20261011-S02",
                "WP04-CRAB-MEAT-20261011-S03",
            },
            {source["sourceId"] for source in crab_record["sources"]},
        )
        self.assertEqual("ingredient_form", form_record["recordType"])
        self.assertEqual("verified", form_record["identityState"])
        self.assertEqual("not_yet_researched", form_record["measurementState"])
        self.assertEqual("not_yet_researched", form_record["substitutionResearchState"])
        self.assertEqual("accepted", form_record["decisions"][-1]["outcome"])
        self.assertEqual(
            {"WP04-CRAB-MEAT-20261011-S04", "WP04-CRAB-MEAT-20261011-S05"},
            {source["sourceId"] for source in form_record["sources"]},
        )
        self.assertEqual([], form_record.get("measurementObservations", []))
        self.assertEqual([], form_record.get("substitutionFindings", []))


class WP04PortionAndCompositionFixtureTests(unittest.TestCase):
    def test_count_package_and_composition_gaps_remain_source_scoped(self) -> None:
        _, _, payload = load_seed_package()
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        recipes = {item["id"]: item for item in payload["recipes"]}
        lines = {
            line["id"]: line
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        }
        package_yields = payload["packageYields"]
        forms = payload["ingredientForms"]

        unresolved_package_lines = {
            "e1e7939b-206f-4839-97d9-2a91febb28eb-ingredient-4": (
                "1 can beef broth", "ingredient-ref-beef-broth", 1, "can"
            ),
            "1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-3": (
                "1/2 box mushrooms", "ingredient-ref-mushroom", 0.5, "count"
            ),
            "05a7ab4d-bf11-40ff-a570-cc0733da292b-ingredient-1": (
                "1 box cranberries", "ingredient-ref-cranberries", 1, "count"
            ),
        }
        for line_id, (source_text, reference_id, quantity, unit) in unresolved_package_lines.items():
            with self.subTest(line_id=line_id):
                line = lines[line_id]
                self.assertEqual(source_text, line["originalText"])
                self.assertEqual(reference_id, line["ingredientRefId"])
                self.assertEqual((quantity, unit), (line["quantity"], line["unit"]))
                self.assertIsNone(line.get("packageAmount"))
                self.assertEqual([], line.get("substitutions", []))
                self.assertFalse(any(row["ingredientRefId"] == reference_id for row in package_yields))

        for reference_id in {
            "ingredient-ref-beef-broth",
            "ingredient-ref-mushroom",
            "ingredient-ref-cranberries",
        }:
            reference = references[reference_id]
            self.assertIsNone(reference["defaultDensity"])
            self.assertEqual([], reference["unitMappings"])

        magic_bars = recipes["ff66e4f7-c719-4203-970b-06993cdb25de"]
        condensed_milk = magic_bars["ingredients"][2]
        condensed_milk_id = "ingredient-ref-sweetened-condensed-milk"
        condensed_milk_reference = references[condensed_milk_id]
        self.assertEqual(
            "1 can (300 mL) Eagle Brand® Original or Low Fat Sweetened Condensed Milk",
            condensed_milk["originalText"],
        )
        self.assertEqual((300, "ml", condensed_milk_id), (
            condensed_milk["quantity"], condensed_milk["unit"], condensed_milk["ingredientRefId"]
        ))
        self.assertIsNone(condensed_milk_reference["defaultDensity"])
        self.assertEqual([], condensed_milk_reference["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == condensed_milk_id for form in forms))
        self.assertFalse(any(row["ingredientRefId"] == condensed_milk_id for row in package_yields))

        shepherds_pie = recipes["d356eec5-b3c4-4e22-b943-63900317e569"]
        ground_beef = shepherds_pie["ingredients"][2]
        beef_reference = references["ingredient-ref-ground-beef"]
        self.assertEqual("1 lb. 90% lean ground beef -or ground lamb", ground_beef["originalText"])
        self.assertEqual((1, "lb", beef_reference["id"]), (
            ground_beef["quantity"], ground_beef["unit"], ground_beef["ingredientRefId"]
        ))
        self.assertEqual("ground lamb can be used instead", ground_beef["notes"]["en"])
        self.assertEqual([], ground_beef.get("substitutions", []))
        self.assertIsNone(beef_reference["defaultDensity"])
        self.assertEqual([], beef_reference["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == beef_reference["id"] for form in forms))
        self.assertFalse(any(
            rule.get("fromIngredientRefId") == beef_reference["id"]
            or rule.get("toIngredientRefId") == beef_reference["id"]
            for field in ("substitutionRules", "contextualSubstitutionRules")
            for rule in payload[field]
        ))

        turkey_meatballs = recipes["43199cff-7fba-4cd0-8447-2c7265b0bb1c"]
        turkey = turkey_meatballs["ingredients"][0]
        turkey_reference = references["ingredient-ref-ground-turkey"]
        self.assertEqual("2 lb lean ground turkey", turkey["originalText"])
        self.assertEqual((2, "lb", turkey_reference["id"]), (
            turkey["quantity"], turkey["unit"], turkey["ingredientRefId"]
        ))
        self.assertIsNone(turkey_reference["defaultDensity"])
        self.assertEqual([], turkey_reference["unitMappings"])
        self.assertFalse(any(form["ingredientRefId"] == turkey_reference["id"] for form in forms))
        self.assertFalse(any(row["ingredientRefId"] == turkey_reference["id"] for row in package_yields))

        recipe_local_choices = {
            "1fb908b6-f079-44f2-916b-1b6c6b55367c-ingredient-10": "30 ml heavy cream or buttermilk",
            "eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-9": "75 g sour cream or plain yogurt, room temperature",
        }
        for line_id, source_text in recipe_local_choices.items():
            with self.subTest(line_id=line_id):
                line = lines[line_id]
                self.assertEqual(source_text, line["originalText"])
                self.assertIsNone(line.get("ingredientRefId"))
                self.assertEqual([], line.get("substitutions", []))

        substitutions = payload["substitutionRules"] + payload["contextualSubstitutionRules"]
        self.assertFalse(any(
            any(term in str(rule).casefold() for term in ("buttermilk", "sour cream", "plain yogurt"))
            for rule in substitutions
        ))


class WP05MolePasteAndEggNoodleIdentityTests(unittest.TestCase):
    def test_product_identities_remain_narrow_and_numeric_data_free(self) -> None:
        _, _, payload = load_seed_package()
        ledger_records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        references = {reference["id"]: reference for reference in payload["ingredientReferences"]}
        expected = {
            "ingredient-ref-mole-paste": ("mole paste", "mole en pâte", [], [], "SAUCE_AND_CONDIMENT"),
            "ingredient-ref-egg-noodles": (
                "egg noodles", "nouilles aux œufs", [], [], "GRAIN_AND_CEREAL"
            ),
        }
        form_reference_ids = {form["ingredientRefId"] for form in payload["ingredientForms"]}
        package_yield_reference_ids = {row["ingredientRefId"] for row in payload["packageYields"]}
        recipe_reference_ids = {
            line.get("ingredientRefId")
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
            if line.get("ingredientRefId")
        }

        for reference_id, (name_en, name_fr, aliases_en, aliases_fr, category) in expected.items():
            with self.subTest(reference_id=reference_id):
                reference = references[reference_id]
                record = ledger_records[reference_id]
                self.assertEqual(name_en, reference["nameEn"])
                self.assertEqual(name_fr, reference["nameFr"])
                self.assertEqual(aliases_en, reference["aliasesEn"])
                self.assertEqual(aliases_fr, reference["aliasesFr"])
                self.assertEqual(category, reference["category"])
                self.assertIsNone(reference["defaultDensity"])
                self.assertEqual([], reference["unitMappings"])
                self.assertNotIn(reference_id, form_reference_ids)
                self.assertNotIn(reference_id, package_yield_reference_ids)
                self.assertNotIn(reference_id, recipe_reference_ids)
                self.assertEqual("verified", record["identityState"])
                self.assertEqual("accepted", record["decisions"][0]["outcome"])
                self.assertTrue(record["sources"])
                self.assertEqual([], record.get("measurementObservations", []))
                self.assertEqual([], record.get("unitObservations", []))
                self.assertEqual([], record.get("substitutionFindings", []))


class WP05ScotchBonnetPepperSauceTests(unittest.TestCase):
    def test_scotch_bonnet_pepper_sauce_is_identity_only_and_keeps_sauce_boundaries(self) -> None:
        _, _, payload = load_seed_package()
        ledger_records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        reference_id = "ingredient-ref-scotch-bonnet-pepper-sauce"
        reference = next(item for item in payload["ingredientReferences"] if item["id"] == reference_id)
        record = ledger_records[reference_id]
        self.assertEqual("Scotch Bonnet pepper sauce", reference["nameEn"])
        self.assertEqual("sauce au piment fort Scotch Bonnet", reference["nameFr"])
        self.assertEqual(
            ["Scotch Bonnet hot pepper sauce", "hot Scotch Bonnet pepper sauce", "Scotch Bonnet sauce"],
            reference["aliasesEn"],
        )
        self.assertEqual([], reference["aliasesFr"])
        self.assertEqual("SAUCE_AND_CONDIMENT", reference["category"])
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual(10, len(record["sources"]))

        self.assertNotIn(reference_id, {form["ingredientRefId"] for form in payload["ingredientForms"]})
        self.assertNotIn(reference_id, {row["ingredientRefId"] for row in payload["packageYields"]})
        recipe_lines = [
            line
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
            if line.get("ingredientRefId") == reference_id
        ]
        self.assertEqual([], recipe_lines)
        pepper = next(
            item for item in payload["ingredientReferences"] if item["id"] == "ingredient-ref-scotch-bonnet-pepper"
        )
        self.assertEqual("Scotch Bonnet pepper", pepper["nameEn"])
        self.assertEqual([], [form for form in payload["ingredientForms"] if form["ingredientRefId"] == reference_id])


class WP03EggPastaIdentityTests(unittest.TestCase):
    def test_egg_pasta_identity_stays_separate_from_generic_pasta_and_egg_noodles(self) -> None:
        _, _, payload = load_seed_package()
        ledger_records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        reference_id = "ingredient-ref-egg-pasta"
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        reference = references[reference_id]
        record = ledger_records[reference_id]
        self.assertEqual("egg pasta", reference["nameEn"])
        self.assertEqual("pâtes aux œufs", reference["nameFr"])
        self.assertEqual([], reference["aliasesEn"])
        self.assertEqual(["pâtes alimentaires aux œufs"], reference["aliasesFr"])
        self.assertEqual("GRAIN_AND_CEREAL", reference["category"])
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual(9, len(record["sources"]))

        self.assertNotIn(reference_id, {form["ingredientRefId"] for form in payload["ingredientForms"]})
        self.assertNotIn(reference_id, {row["ingredientRefId"] for row in payload["packageYields"]})
        self.assertFalse(any(
            line.get("ingredientRefId") == reference_id
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))
        self.assertNotEqual(reference_id, "ingredient-ref-pasta")
        self.assertNotEqual(reference_id, "ingredient-ref-egg-noodles")


class WP03WholeWheatPastaIdentityTests(unittest.TestCase):
    def test_whole_wheat_pasta_identity_stays_composition_scoped(self) -> None:
        _, _, payload = load_seed_package()
        ledger_records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        reference_id = "ingredient-ref-whole-wheat-pasta"
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        reference = references[reference_id]
        record = ledger_records[reference_id]
        self.assertEqual("whole-wheat pasta", reference["nameEn"])
        self.assertEqual("pâtes de blé entier", reference["nameFr"])
        self.assertEqual([], reference["aliasesEn"])
        self.assertEqual(["pâtes alimentaires de blé entier"], reference["aliasesFr"])
        self.assertEqual("GRAIN_AND_CEREAL", reference["category"])
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual(8, len(record["sources"]))
        self.assertEqual(8, len(set(source["sourceId"] for source in record["sources"])))

        self.assertNotIn(reference_id, {form["ingredientRefId"] for form in payload["ingredientForms"]})
        self.assertNotIn(reference_id, {row["ingredientRefId"] for row in payload["packageYields"]})
        self.assertFalse(any(
            line.get("ingredientRefId") == reference_id
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))
        self.assertNotEqual(reference_id, "ingredient-ref-pasta")
        self.assertNotEqual(reference_id, "ingredient-ref-egg-pasta")
        self.assertNotEqual(reference_id, "ingredient-ref-whole-wheat-flour")


class WP03GlutenFreePastaIdentityTests(unittest.TestCase):
    def test_gluten_free_pasta_identity_stays_a_finished_product_claim(self) -> None:
        _, _, payload = load_seed_package()
        ledger_records, errors = validate_research_ledger()
        self.assertEqual([], errors)

        reference_id = "ingredient-ref-gluten-free-pasta"
        references = {item["id"]: item for item in payload["ingredientReferences"]}
        reference = references[reference_id]
        record = ledger_records[reference_id]
        self.assertEqual("gluten-free pasta", reference["nameEn"])
        self.assertEqual("pâtes sans gluten", reference["nameFr"])
        self.assertEqual([], reference["aliasesEn"])
        self.assertEqual([], reference["aliasesFr"])
        self.assertEqual("GRAIN_AND_CEREAL", reference["category"])
        self.assertIsNone(reference["defaultDensity"])
        self.assertEqual([], reference["unitMappings"])
        self.assertEqual("verified", record["identityState"])
        self.assertEqual("researched_no_supported_value", record["measurementState"])
        self.assertEqual("researched_no_supported_substitute", record["substitutionResearchState"])
        self.assertEqual("accepted", record["decisions"][0]["outcome"])
        self.assertEqual(8, len(record["sources"]))
        self.assertEqual(8, len(set(source["sourceId"] for source in record["sources"])))

        self.assertNotIn(reference_id, {form["ingredientRefId"] for form in payload["ingredientForms"]})
        self.assertNotIn(reference_id, {row["ingredientRefId"] for row in payload["packageYields"]})
        self.assertFalse(any(
            line.get("ingredientRefId") == reference_id
            for recipe in payload["recipes"]
            for line in recipe.get("ingredients", [])
        ))
        self.assertNotEqual(reference_id, "ingredient-ref-pasta")
        self.assertNotEqual(reference_id, "ingredient-ref-egg-pasta")
        self.assertNotEqual(reference_id, "ingredient-ref-whole-wheat-pasta")


if __name__ == "__main__":
    unittest.main()
