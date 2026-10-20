# WP02 / WP03 / WP04 Follow-up Integration

Date: 2026-10-10

## Outcome

Added one identity-only ingredient reference and recorded three reviewed evidence outcomes in the
research ledger:

- `ingredient-ref-tempeh`: bilingual display `tempeh / tempeh`, category `PROTEIN`, no aliases,
  forms, density, or unit mappings. Recipe 095's tempeh variation stays in its local note; its
  unquantified pork replacement is not a reusable substitution.
- `candidate-yam-starch`: held for extracted starch from edible *Dioscorea* tubers. `fécule
  d’igname` remains a reviewer proposal, and the scope of unqualified products called `yam starch`
  remains unclear.
- `candidate-little-millet`: held for human-food *Panicum sumatrense*. `petit mil` remains inactive
  because OQLF uses it for foxtail and pearl millet as well.
- Existing `ingredient-ref-stew-meat`: evidence and an unresolved identity decision added. Recipe
  090#8 remains linked and keeps its saved 454 g quantity; its publisher's optional chicken, beef,
  or pork choices remain recipe-local.

Health Canada's CNF food code 4986 records one 150 g serving for its cooked soybean-tempeh entry.
The ledger preserves that source-specific portion only; it is not assigned to recipe 095 or used as a
conversion. The same source reports 100 g edible portion per 100 g and 0% refuse.

No recipe rows or text, ingredient forms, active measurements or conversions, yields, or reusable
substitutions changed. The plan's broad WP02, WP03, and WP04 work remains open.

## Source review packets

- [WP02 isolated yam starch](../../proposals/wp02-followup-flour-starch-coverage-review-20261010.md)
- [WP03 little millet](../../proposals/wp03-section-f-followup-grain-coverage-review-20261010.md)
- [WP04 tempeh](../../proposals/wp04-next-animal-food-review-20261010.md)
- [WP04 stew-meat boundary](../../proposals/wp04-next-animal-product-gap-review-20261010.md)

The OQLF entry supports `tempeh` in Québec French and English. FSSAI and Agriculture and Agri-Food
Canada support the little-millet species boundary, while OQLF evidence prevents activating an
ambiguous `petit mil` label. The exact source and evidence limits for every ledger entry are in the
linked packets and `docs/catalog/research-ledger.v1.json`.

## Package snapshot

- Ingredient references: 888 (one new tempeh row)
- Ingredient forms: 48 (unchanged)
- Research-ledger records: 1,138 (three added records; stew meat updated in place)
- Recipes / ingredient rows: 114 / 1,123 (unchanged)

## Verification

Completed 2026-10-11 on a disposable Windows-native AVD using the Pixel 9a device profile
(Android 16 / API 36, 1080 × 2424). The AVD used new temporary user data; the running owner AVD was
not accessed.

- `python3 -B tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`, both
  `tools/seed_package/normalize_bundled_seed_package.py` validation/check modes, and
  `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed. The
  ledger validator reports 1,138 records, 2,859 source entries, 2,268 distinct source IDs, 173
  measurement observations, and zero schema errors.
- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` passed all 53 tests.
- `tools/deploy_to_pixel9a_emulator.sh` passed its `test` and `assembleDebug` builds, installed the
  APK, and launched `app.recipebook/.MainActivity` on `emulator-5558`.
- The ingredient picker returned `tempeh` in English and French. The French editor controls were
  localized, and the unsaved draft was discarded. The French library home returned to 114 recipes.
- The owner AVD userdata and sdcard SHA-256 hashes still match the pre-verification baseline:
  `48D6753085207CBBDF6B1C2BC9416AF3FE92AD42F6000ED5CFA49103ED0F9997` and
  `5F2D56E8DCD5F647175EA2FF9818471A0757F0BB28EC3959E658B99716ABCD1A`.
- [English picker](tempeh-picker-en.png) — SHA-256
  `722006c8e778338fdd5c00bac0ba655e48fce04799b5da1fab15b63521ddb2e0`.
- [French picker](tempeh-picker-fr.png) — SHA-256
  `fca07e2ba2f607b17806d9fe8225978f3e3598d10475381502c472ef174673ff`.
- [French library home](library-home-fr-114.png) — SHA-256
  `f049d579f2df870fdaed1814cd0be5e31b29a7e731265a8cd401617ed2ad093d`.
- Focused `git diff --check` plus UTF-8/no-BOM, mojibake, and trailing-whitespace checks passed for
  this integration's files. Full-tree `git diff --check` still reports 1,574 trailing-whitespace
  findings across 69 pre-existing dirty files under
  `docs/exported-recipe-lists/RecipeKeeper_20260320_143058`; no findings were outside that directory,
  and those unrelated files were left intact.

No Android behavior code changed. Broader WP02, WP03, and WP04 work remains open.
