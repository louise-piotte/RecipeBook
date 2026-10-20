# WP02 Section 04 B3 — Bunya seed starch (R102)

Integrated 2026-10-14. The broader Section 04 B3 regional-starch checklist remains open.

## Decision

Added identity-only **Bunya seed starch / amidon de graines de bunya** for starch isolated from edible Bunya seed, identified in the primary study as *Araucaria bidwillii*. Kept it separate from whole Bunya nuts, the held Bunya-flour candidate, and pinhão/piñón products from other Araucaria species. The French display is descriptive and provisional; no Québec product label or OQLF compound entry was found.

Aliases remain empty. The source phrase “Bunya nut starch” is documented but not searchable as an alias because it would take over the current generic `nut starch` picker query, which presently returns chestnut starch through substring fallback. The new row is discoverable by its full English or French display and by `Bunya`.

No forms, density, unit mappings, recipe links, measures, conversions, yields, or substitutions were added. The 114 manifest-listed recipes and 1,123 ingredient rows contain no matching candidate demand.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added `ingredient-ref-bunya-seed-starch`.
- `docs/catalog/research-ledger.v1.json`: added the identity review, six source records, and no numeric or substitution observations.
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`: regenerated from canonical reference data.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` and `roadmap.md`: recorded the integration while leaving the broad B3 item open.

See the [R102 proposal](../../proposals/wp02-b3-bunya-seed-starch-identity-review-r102-20261014.md) for source details, exact picker projections, recipe scan, and evidence limits.

## Verification

Static checks passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` and `--validate-only`.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` (1,439 references).
- Research-ledger validation: 1,779 records, zero errors; all six R102 source IDs are unique.
- Picker projection: exact English and French starch phrases each return the new row once; `bunya` returns both Bunya nuts and Bunya seed starch; `nut starch` remains the existing chestnut-starch result; `Araucaria` remains unmatched.
- Recipe corpus: 114 recipes, 1,123 ingredient rows, zero Bunya-starch matches or links.
- UTF-8/no-BOM, final newline, local Markdown links, and scoped whitespace checks.

No app tests, Gradle tasks, instrumentation tests, emulator runs, or deployment were performed because this change only adds database JSON data and refreshes its generated catalog index.
