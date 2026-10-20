# WP04 Section Q R289 integration: water buffalo milk

Added identity-only `water buffalo milk / lait de bufflonne` in `DAIRY_AND_ALTERNATIVE`, with OQLF-backed aliases `buffalo's milk` and `lait de bufflesse`. Kept bison, buffalo meat, cow/goat/sheep milk, and processed water-buffalo dairy separate. The product’s 1 L package is source-specific and is not a reusable kitchen measure. No forms, density, unit mappings, conversions, yields, recipe links, or substitutions were added.

The picker can return the explicitly named water-buffalo-milk row for `buffalo`, `buffalo milk`, and `water buffalo` because those words occur in its visible display name. No bare `buffalo` alias was added; the row label retains both milk and source. `bison` remains unassigned. The 114-recipe bundle has no matching demand.

## Files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/manifest.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (generated projection)
- `docs/catalog/proposals/wp04-section-q-water-buffalo-milk-identity-review-r289-20261016.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

## Verification

- Bundled package normalization and validation, ingredient-reference normalization, and generated picker-index freshness passed.
- Research-ledger schema and targeted R289 source-ID/URL ownership checks passed; the existing CFIA dairy-label URL owners remain unchanged.
- Targeted alias ownership and picker projection checks passed. Scanned all 114 manifest-listed recipes (1,123 structured ingredient rows); no water-buffalo-milk or bison-milk demand was found.
- UTF-8/no-BOM, escaped Unicode in bundled database JSON, local-link, scoped whitespace, and targeted database JSON checks passed.
- No software tests, builds, or emulator checks were run. This batch adds database JSON data, per `AGENTS.md`.

Totals at the R289 integration point: 1,662 ingredient references, 126 forms, and 2,011 ledger records / 8,854 source entries / 7,496 distinct source IDs / 6,257 distinct URLs; 114 recipes / 1,123 ingredient rows.

## Sources

- [R289 water-buffalo-milk identity proposal](../../proposals/wp04-section-q-water-buffalo-milk-identity-review-r289-20261016.md)
- [OQLF: lait de bufflonne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298608/lait-de-bufflonne)
- [Gouvernement du Québec / MAPAQ dairy processing guidance](https://www.quebec.ca/entreprises-et-travailleurs-autonomes/industrie-bioalimentaire/permis-alimentaires/fabrication-produits-laitiers-usine-laitiere)
- [CFIA water-buffalo-milk retail survey](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/testing-reports-and-journal-articles/bacterial-pathogens-and-indicators-1)
- [Ambrosia / HOPE Eco Farms: Water Buffalo Whole Milk](https://canada.ambrosia.ca/products/water-buffalo-whole-milk)
- [CFIA dairy-labelling requirements](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy)
