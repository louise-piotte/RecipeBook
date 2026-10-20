# WP03 Section F R288 integration: Palakkadan Matta rice

Added identity-only `Palakkadan Matta rice / riz Palakkadan Matta` in `GRAIN_AND_CEREAL`, with both alias arrays empty. The French display is provisional Canadian product wording, not an OQLF ruling. Kept the GI-named regional rice distinct from generic red rice, parboiled rice, other rice identities/forms, and red-rice flakes; broader seller synonyms remain evidence only. No forms, measures, density, mappings, conversions, yields, recipe links, or substitutions were added.

The name itself makes `Palakkadan Matta`, `Matta rice`, and `riz Palakkadan Matta` searchable. No Matta Aval alias was added. The 114-recipe bundle has no matching demand.

## Files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/manifest.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (generated projection)
- `docs/catalog/proposals/wp03-section-f-palakkadan-matta-rice-identity-review-r288-20261016.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

## Verification

- Bundled package normalization and validation, ingredient-reference normalization, and generated picker-index freshness passed.
- Research-ledger schema and targeted source-ID/URL ownership checks passed; all seven source URLs were previously unowned.
- Targeted picker projection and alias-boundary checks passed. Scanned all 114 manifest-listed recipes (1,123 ingredient rows); no matching whole-rice or Matta Aval demand was found.
- UTF-8/no-BOM, escaped Unicode in bundled database JSON, local-link, scoped whitespace, and targeted database JSON checks passed.
- No software tests, builds, or emulator checks were run. This batch adds database JSON data, per `AGENTS.md`.

Totals at the R288 integration point (after R287–R289): 1,663 ingredient references, 126 forms, and 2,012 ledger records / 8,861 source entries / 7,503 distinct source IDs / 6,264 distinct URLs; 114 recipes / 1,123 ingredient rows.

## Sources

- [R288 Palakkadan Matta rice proposal](../../proposals/wp03-section-f-palakkadan-matta-rice-identity-review-r288-20261016.md)
- [Intellectual Property India: Geographical Indications Registry](https://search.ipindia.gov.in/GIRPublicSearch/Application/Details/36)
- [Kerala State Biodiversity Board rice-variety publication](https://keralaagriculture.gov.in/wp-content/uploads/2021/04/Aromatic_medicinal_rice_varieties.pdf)
- [Kerala Industries Department: Palakkadan Matta Rice](https://industry.kerala.gov.in/images/pdf/odop/product-desc/ODOP_PRODUCT_DESCRIPTION-PALAKKAD.pdf)
- [Eraa Supermarket: Palakkadan Matta Rice](https://eraa.ca/products/eraa-palakkadan-matta-rice)
- [Spice Divine Canada (French): Riz Palakadan Matta](https://spicedivine.ca/fr/products/quality-palakadan-matta-rice-8lb)
- [Walmart Canada (French): Riz Divine Rice Rouge Matta](https://www.walmart.ca/fr/ip/Riz-Divine-Rice-Rouge-Matta-8-Lb/3KJ5II1NFGIT)
- [Veehacart Canada: Kerala Matta Rice](https://veehacart.ca/products/kerala-matta-rice-semi-polished-parboiled-w4usz)
