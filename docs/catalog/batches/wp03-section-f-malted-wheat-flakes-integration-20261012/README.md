# WP03 Section F malted wheat flakes integration — 2026-10-12

## Decision

Added identity-only `malted wheat flakes / flocons de blé malté` as `ingredient-ref-malted-wheat-flakes` in `GRAIN_AND_CEREAL`. Current manufacturer descriptions distinguish malted flakes from plain wheat flakes, and current Canadian bread ingredient labels support food use and the Québec-facing French display wording. The French name is label-attested; no OQLF terminology ruling is claimed.

Kept plain wheat flakes, malted wheat flour, malted barley flour, malt extract, generic malt flour, and composite breakfast cereals separate. The product-specific Muntons brewing range and GoodMills bakery replacement guidance remain ledger evidence only; neither becomes a reusable recipe measure or substitution. Added no aliases, forms, density, unit mappings, recipe links, conversions, yields, or active substitution rules.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated)
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- `docs/catalog/proposals/wp03-section-f-malted-wheat-flakes-identity-review-20261012.md`
- This integration record

## Static validation

The package now contains 1,297 active ingredient references and 1,605 research-ledger records, with 94 forms and 114 recipes / 1,123 ingredient rows. The generated catalog contains 1,297 references. The new exact English and French phrases had no active reference, form, or legacy-candidate owner before integration; the manifest-listed recipe corpus had no matching phrase or ingredient-row demand. Broad `wheat flakes` searches now include both qualified plain and malted product names by design.

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- Research-ledger schema validation, ID/source-link checks, and targeted whitespace/encoding checks — passed.

No unit, instrumentation, or emulator tests were run because this change only adds database JSON data, as directed in `AGENTS.md`.

See the [source-backed proposal](../../proposals/wp03-section-f-malted-wheat-flakes-identity-review-20261012.md). Section F remains open.
