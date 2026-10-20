# WP02 / WP03 / WP04 round-twenty-five gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A7 — micronised toasted millet flour:** Recorded unresolved ledger-only `candidate-micronised-toasted-millet-flour`. CerealVeneta describes a species-unspecified, heat-treated and cryo-milled semi-finished ingredient for bakery and pasta use. The sources establish generic `millet / millet` and ordinary `farine de millet`, but no Québec French name for this processed product. Added no active row or picker alias. Added no forms, measurements, conversions, yields, recipe links, or substitutions.
- **WP03 Section G — bannock / banique:** Added identity-only `ingredient-ref-bannock`, displayed as `bannock / banique`, under `BAKING_MIXIN_AND_PANTRY`. English alias: `bannocks`. French aliases: `baniques`, `bannique`, `banniques`, `banik`, `baniks`, `pain banique`, and `pain bannique`. OQLF pairs the English and Québec French terms; Parks Canada and L’Itinéraire support the French compounds. Kept Scottish bannock, Mi’kmaq luski, and the Batoche family bread Grandma’s Bangs separate. The recipe corpus has no matching demand. Added no forms, measures, density, mappings, recipe links, conversions, yields, or substitutions.
- **WP04 Section O — Yecapixtla cecina:** Recorded unresolved ledger-only `candidate-cecina-de-yecapixtla` for the product named by Mexico’s protected geographical-indication declaration. It defines a beef rear-leg product with salting, partial sun drying, and pork lard. Montréal listings use `cecina` for Mexican beef and describe a product in the style of Yecapixtla, but do not show that it is authorized to use the protected indication. Because bare `cecina` already returns the active Peruvian Amazon identity, no active row or alias was added. Oaxacan pork cecina enchilada remains separate. Added no forms, measurements, recipe links, conversions, yields, or substitutions.

## Shared data changes

The active package now has **1,353 ingredient references** and **98 forms**. The research ledger has **1,674 records** and **6,540 source entries**, with **5,478 distinct source IDs** and **4,564 distinct URLs**. It retains **343 measurement observations** and **195 substitution findings**. The generated Kotlin catalog contains 1,353 references. This batch added one active identity row and two ledger-only candidates. It added no ingredient forms, measurement observations, recipe links, or substitutions.

| Artifact | Count / state |
|---|---:|
| `ingredient-references.v1.json` | 1,353 references |
| `ingredient-forms.v1.json` | 98 forms |
| `research-ledger.v1.json` | 1,674 records; 6,540 source entries; 5,478 IDs; 4,564 URLs |
| `BundledIngredientCatalog.kt` | 1,353 references |
| Measurement observations | 343 |
| Substitution findings | 195 |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes; SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Verification

- Bundled seed-package normalization and validation passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger schema validation and R25 decision/source-ID resolution passed. Thirteen source entries were added; twelve source IDs and ten URLs are new. The OQLF millet and Celiac Canada product-finder URLs were already cited by other records, and the OQLF `viande séchée` boundary source was reused from the cecina ledger work.
- Phrase-first picker projections show the new `bannock` / `banique` phrases resolve to the new row, while `flatbread`, `bread roll`, `luski`, and the existing Peruvian `cecina` result remain unchanged. The ledger-only millet-flour and Yecapixtla cecina candidates produce no active picker results.
- The manifest-ordered recipe-corpus fingerprint is unchanged. None of the R25 gaps has a bundled ingredient row or recipe link.
- UTF-8 without BOM, mojibake, local-link, and scoped whitespace checks passed for the maintained R25 files.
- No app, unit, instrumentation, emulator, or other tests were run. Under the updated `AGENTS.md` rule, the active change only adds database JSON data; the generated catalog was refreshed from that data.

See the [micronised toasted millet flour review](../../proposals/wp02-a7-micronised-toasted-millet-flour-boundary-review-20261013-round25.md), [bannock / banique identity review](../../proposals/wp03-section-g-bannock-banique-identity-review-20261013-round25.md), and [Yecapixtla cecina picker-boundary review](../../proposals/wp04-section-o-yecapixtla-cecina-picker-boundary-review-20261013-round25.md). WP02 A7, Section G, and Section O remain open.
