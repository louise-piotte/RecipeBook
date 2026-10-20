# WP04 Section Q R286 integration: sheep milk

Added identity-only `sheep milk / lait de brebis` in `DAIRY_AND_ALTERNATIVE`, with the OQLF-backed English aliases `sheep's milk` and `ewe's milk`. Kept cow and goat milk, sheep-milk cheese and other processed dairy, sheep meat, and fat classes separate. The dairy-labeling source requires the animal source to be identified; it does not imply culinary equivalence.

The 1 L retailer listing is source-specific and is not a reusable household measure or mass conversion. No forms, density, unit mappings, conversions, yields, recipe links, or substitutions were added. The bundled recipe corpus has no matching sheep-milk lines.

## Files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated projection)
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- `docs/catalog/proposals/wp04-section-q-sheep-milk-identity-review-r286-20261016.md`

## Verification

Static data and package checks passed:

- Bundled package normalization/validation, ingredient-reference normalization, and generated picker-index freshness.
- Research-ledger schema and source-ID/URL ownership checks for the R286 record.
- Picker projection and manifest-listed recipe-corpus scan.
- UTF-8 without BOM, escaped Unicode in database JSON, local Markdown links, and scoped whitespace checks.

Totals: 1,661 ingredient references, 126 forms, and 2,010 research-ledger records / 8,837 source entries / 7,480 distinct source IDs / 6,242 distinct URLs; 114 bundled recipes / 1,123 ingredient rows.

No software tests, builds, or emulator checks were run. This change adds database JSON data; the generated Kotlin file is a projection of the canonical references.

## Sources

- [R286 sheep-milk identity proposal](../../proposals/wp04-section-q-sheep-milk-identity-review-r286-20261016.md)
- [OQLF: lait de brebis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298770/lait-de-brebis)
- [Government of Québec: Élevage ovin](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-ovin-agneau)
- [CFIA: dairy product labelling requirements](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy)
- [Ambrosia: Grassfed Sheep Milk](https://canada.ambrosia.ca/products/grassfed-sheep-milk)
