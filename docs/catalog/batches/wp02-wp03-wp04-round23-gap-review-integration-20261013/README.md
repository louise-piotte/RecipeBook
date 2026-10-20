# WP02 / WP03 / WP04 round-twenty-three gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A7 — buckwheat meal:** Kept the unresolved product name in the ledger as
  `candidate-buckwheat-meal`. Current Canadian retail wording also uses it for dark buckwheat flour,
  while a separate coarse-ground product is sold under the same name. The evidence does not establish
  a common milling boundary or current Québec French display. No active reference, alias, form,
  measure, recipe link, conversion, yield, or substitution was added.
- **WP03 Section G — focaccia:** Added identity-only `ingredient-ref-focaccia`, displayed as
  `focaccia` in English and French, with `focaccias` as the plural alias in both locales under
  `BAKING_MIXIN_AND_PANTRY`. Québec recipe and dictionary usage support the finished bread name.
  Kept generic flatbread, pizza dough, and fouace/fouasse/fougasse separate. The bundled recipe corpus
  has no matching demand. No forms, measures, density, mappings, recipe links, conversions, yields,
  or substitutions were added.
- **WP04 Section O — Cuban tasajo:** Kept the regional gap in the ledger as unresolved
  `candidate-cuban-tasajo`. Cuban and Oaxacan uses share the bare name, and no Québec-specific French
  display was established. The candidate is not an active picker row; do not route broad `tasajo` to
  Cuba or alias it to charqui, jerky, cecina, biltong, or bresaola. No active measurements, forms,
  recipe links, conversions, yields, or substitutions were added.

## Shared data changes

The active package now has **1,350 ingredient references** and **98 forms**. The research ledger has
**1,668 records**, **6,510 source entries**, **5,451 distinct source IDs**, and **4,539 distinct URLs**.
It retains **343 measurement observations** and **195 substitution findings**. The generated Kotlin
catalog contains 1,350 references. This batch added one active identity and two unresolved ledger-only
candidate records; it added no recipe lines, ingredient forms, measurements, or substitutions.

| Artifact | Count / state |
|---|---:|
| `ingredient-references.v1.json` | 1,350 references |
| `research-ledger.v1.json` | 1,668 records; 6,510 source entries; 5,451 IDs; 4,539 URLs |
| `BundledIngredientCatalog.kt` | 1,350 references |
| Ingredient forms | 98 forms |
| Measurement observations | 343 |
| Substitution findings | 195 |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes; SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Verification

- Bundled seed-package normalization and validation passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger schema validation and source-ID uniqueness checks passed.
- Phrase-first picker projections show `focaccia` and `focaccias` select only the new row;
  generic `flatbread` remains on its existing family row. The buckwheat-meal and tasajo candidates
  remain ledger-only and return no active picker result; `charqui` retains its existing identity.
- The manifest-ordered recipe-corpus fingerprint is unchanged; none of the three candidate names has
  a bundled recipe line or recipe link.
- UTF-8 without BOM and mojibake checks passed for maintained R23 text and data. Local links in the R23 proposals and batch README, plus scoped whitespace checks, passed.
- No app, unit, instrumentation, emulator, or other tests were run because the catalog update adds
  database JSON data, under the updated `AGENTS.md` rule.

See the [buckwheat-meal review](../../proposals/wp02-a7-buckwheat-meal-boundary-review-20261013-round23.md),
[focaccia review](../../proposals/wp03-section-g-focaccia-identity-review-20261013-round23.md), and
[Cuban tasajo review](../../proposals/wp04-section-o-cuban-tasajo-picker-boundary-review-20261013-round23.md).
WP02 A7, Section G, and Section O remain open.
