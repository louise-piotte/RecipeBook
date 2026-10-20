# WP02 Section 04 B3 R192 — Native Waxy Maize Starch Integration

- **Date:** 2026-10-16
- **Result:** Added identity-only `native waxy maize starch / amidon de maïs cireux natif` as `ingredient-ref-native-waxy-maize-starch` in `FLOUR_AND_STARCH`.
- **Search alias:** Added the source-attested English alias `waxy corn starch`; French aliases remain empty.
- **Boundary:** Kept this source-qualified extracted starch separate from generic cornstarch, high-amylose corn starch, modified corn starch, and whole waxy-maize grain. Allzone's Canadian food-grade listing is quote-based: it does not promise current stock, a fixed package, or a fixed grade document.
- **Usage:** Added no forms, density, unit mappings, measures, yields, recipe links, conversions, or substitutions. The manifest-listed corpus of 114 recipes and 1,123 ingredient rows has no matching waxy-maize or waxy-corn starch demand.
- **Data:** Updated the bundled ingredient reference, added one `ingredient_reference` evidence record in `docs/catalog/research-ledger.v1.json`, and regenerated `BundledIngredientCatalog.kt`.

## Source basis

- OQLF's [amidon de grains cireux entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2085948/amidon-de-grains-cireux) defines the waxy-starch class and permits source-specific `amidon de maïs cireux`; the display adds `natif` to reflect the supplier's native-state qualifier. OQLF's [amidon entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon) supports `amidon` for cereal starch and differentiates the more specific tuber use of `fécule`. The complete French display is a descriptive construction, not an attested package title.
- Allzone's [Waxy Starch listing](https://allzonetrading.ca/supply/waxy-starch) currently names native waxy maize starch as a food-grade powder and lists food applications. The seller confirms grade, documents, package, origin, price, lead time, and logistics at quotation; the page guarantees none of them.
- Québec retailer Keys Nutrition's [XPN Waxy Maize page](https://keysnutrition.com/en/products/waxy-maize-plain-2kg) supplies the exact English wording `waxy corn starch` in a medicinal-ingredient declaration. The listed product is sold out and does not establish a culinary measure or density.
- Fineberry's [NutriTex 680 page](https://www.fineberry.ca/modifiedcornstarch.html) identifies an E1422 modified waxy-corn product, which remains separate from this native row.

## Static verification

- Bundled package normalization and validation, reference normalization, and generated-catalog freshness passed.
- Ledger schema, source-ID/URL ownership, active name and alias ownership, corpus demand, picker projection, UTF-8/no-BOM, and scoped whitespace/link checks passed.
- Resulting totals: 1,573 references, 122 forms, and 1,918 ledger records / 8,270 source entries / 7,057 distinct source IDs / 5,847 distinct source URLs.
- No software tests or emulator checks were run because this change only adds database JSON data, as directed in `AGENTS.md`.

See the [R192 identity review proposal](../../proposals/wp02-section-04-b3-native-waxy-maize-starch-identity-review-r192-20261016.md).
