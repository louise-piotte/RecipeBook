# WP02 A7 R403 / WP04 Section P R404 / WP06 Europe R405 integration

Integrated on 2026-10-17. The three reviewed proposals are [R403](../../proposals/wp02-section-a7-next-milling-gap-review-r403-20261017.md), [R404](../../proposals/wp04-section-p-next-seafood-gap-review-r404-20261017.md), and [R405](../../proposals/wp06-europe-next-regional-identity-review-r405-20261017.md).

## Decisions

- **R403 — roasted-corn semolina:** keep it outside active references and the ledger. Two French mills attest `semoule de maïs torréfié`, but no Québec source pairs a product-specific French display with an English name. OQLF supports the base term only. Keep it separate from cornmeal, corn grits, roasted corn flour, hominy grits, and prepared polenta. Add no candidate, aliases, forms, measures, or conversions.
- **R404 — steamed monkfish liver:** add identity-only `steamed monkfish liver / foie de baudroie cuit à la vapeur`, with `ankimo` as its only English alias. Keep the prepared product species-neutral and distinct from whole monkfish, burbot / `lotte`, roe, and other fish-liver products. The ledger records Azuma's 20 g broth amount as one recipe-specific `portion_weight` observation for its complete two-serving ramen, with `sourceQuantity` of 2 servings. The separate two-slice topping remains unweighted; the `15 pieces / 190 g / case` statement has no clear mass basis. Broad `monkfish`, `baudroie`, `liver`, `foie`, and substring `fish liver` searches return this sole qualified row, so its product-specific label must remain visible. No forms, reusable measures, mappings, density, package conversion, recipe link, yield, or substitution rule was added. Substitution research remains `not_yet_researched`.
- **R405 — soubressade / sobrasada:** add identity-only `PROTEIN` reference `ingredient-ref-sobrasada`, with French alias `saucisson soubressade` and English alias `sobrassada`. Keep Mallorcan PGI, Iberian/bellota, cular, brand, and chorizo-description wording specific to their sources; keep nduja and other sausage identities separate. The observed 1 kg and 300 g packages are SKU-specific. Add no forms, measurements, mappings, recipe links, yields, or substitutions. Measurement research is `researched_no_supported_value`; substitution research remains `not_yet_researched`.

All three proposals scanned the complete manifest-listed bundle: 114 recipe files and 1,123 structured ingredient rows. The integration scan found no matching recipe files. The plan records the held R403 decision and the accepted R404 and R405 identities; the active roadmap now points to this batch.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — bundled seed package valid.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — references normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,712 references.
- `docs/catalog/research-ledger.v1.json` validates against `research-ledger.schema.json`.
- Picker projection follows `IngredientSearch.kt`; the exact R404 and R405 terms resolve to their intended rows, and broad R404 terms show the documented singleton result.
- Manifest-ordered recipe scan: 114 files, no matching file for the reviewed candidate terms.
- Current totals: 1,712 references, 141 forms, 2,072 ledger records, 9,372 source entries, 7,938 distinct source IDs, and 6,656 distinct source URLs.

No software tests, builds, instrumentation, emulator checks, or deployment were run. The catalog change adds database JSON data; the checks above validate data shape, normalization, generated-index freshness, source ownership, picker projection, and bundled-recipe coverage.
