# WP02 / WP03 / WP04 round-twenty-four gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A7 — malted spelt flour:** Added identity-only `ingredient-ref-malted-spelt-flour`,
  displayed as `malted spelt flour / farine d'épeautre malté`, with `spelt malt flour` as its only
  English alias under `FLOUR_AND_STARCH`. IREKS North America's French Canada listing supplies the
  product phrase; OQLF confirms `épeautre` as the Québec term for spelt and defines generic
  `farine maltée` as a different, broader product. The chosen compound is source-attested Canadian
  French, not an OQLF ruling. Kept it separate from generic malt flour, plain spelt flour, and other
  cereal-specific malt flours. No forms, measures, density, mappings, recipe links, conversions,
  yields, or substitutions were added.
- **WP03 Section G — arepa:** Added identity-only `ingredient-ref-arepa`, displayed as `arepa` in
  English and French, with `arepas` as the plural alias in both locales under
  `BAKING_MIXIN_AND_PANTRY`. Tourisme Montréal and local restaurant/retail sources use the borrowed
  French name; Colombian culinary documentation describes a varied prepared-maize family. Kept
  arepa separate from tortillas, maize inputs, generic flatbread, variants, and fillings. The recipe
  corpus has no matching demand. No forms, measures, recipe links, conversions, yields, or
  substitutions were added.
- **WP04 Section O — pastirma/basturma:** Kept the unresolved product gap as ledger-only
  `candidate-beef-pastirma`. MAPAQ uses the spellings `basterma` and `pastirma` for salted-and-dried
  beef charcuterie; a Québec producer pairs `basturma (pastirma)` for one beef product, while
  Türkiye's current standard defines pastırma across cattle, water buffalo, and camel. No active
  row or picker aliases were added because bare terms would route too narrowly. The producer's
  approximate 50 g listing remains product-specific source evidence, not a reusable measure. No
  forms, measurements, recipe links, conversions, yields, or substitutions were added.

## Shared data changes

The active package now has **1,352 ingredient references** and **98 forms**. The research ledger has
**1,671 records**, **6,527 source entries**, **5,466 distinct source IDs**, and **4,554 distinct URLs**.
It retains **343 measurement observations** and **195 substitution findings**. The generated Kotlin
catalog contains 1,352 references. This batch added two active identity rows and one unresolved
ledger-only candidate. It added no recipe lines, forms, measurement observations, or substitutions.

| Artifact | Count / state |
|---|---:|
| `ingredient-references.v1.json` | 1,352 references |
| `research-ledger.v1.json` | 1,671 records; 6,527 source entries; 5,466 IDs; 4,554 URLs |
| `BundledIngredientCatalog.kt` | 1,352 references |
| Ingredient forms | 98 forms |
| Measurement observations | 343 |
| Substitution findings | 195 |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes; SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Verification

- Bundled seed-package normalization and validation passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger schema validation and R24 decision/source-ID resolution passed. Fifteen new
  source IDs and URLs were added; the existing OQLF spelt and pastrami sources were reused.
- Phrase-first picker projections show `arepa` and `arepas` select only the new arepa row, while
  flatbread and tortilla queries retain their current owners. Malted-spelt queries select the new row;
  broad spelt-flour and malt-flour queries show the appropriate separate products, and generic
  `farine maltée` remains on the existing generic malt-flour row. Pastirma/basturma spellings remain
  without active picker results; pastrami, charqui, and cecina boundaries remain unchanged.
- The manifest-ordered recipe-corpus fingerprint is unchanged. None of the R24 gaps has a bundled
  recipe line or recipe link.
- UTF-8 without BOM and mojibake checks passed for maintained R24 text/data. Local links in the
  R24 proposals and batch README, plus scoped whitespace checks, passed.
- No app, unit, instrumentation, emulator, or other tests were run because the catalog additions are
  database JSON data, under the updated `AGENTS.md` rule.

See the [malted-spelt-flour review](../../proposals/wp02-a7-malted-spelt-flour-quebec-name-boundary-review-20261013-round24.md),
[arepa review](../../proposals/wp03-section-g-arepa-identity-review-20261013-round24.md), and
[pastirma/basturma review](../../proposals/wp04-section-o-pastirma-basturma-product-boundary-review-20261013-round24.md).
WP02 A7, Section G, and Section O remain open.
