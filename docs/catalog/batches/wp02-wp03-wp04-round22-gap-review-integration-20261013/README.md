# WP02 / WP03 / WP04 round-twenty-two gap-review integration

Date: 2026-10-13

## Dispositions

- **WP03 Section G — generic flatbread:** Added identity-only `flatbread / pain plat` as
  `ingredient-ref-flatbread` in `BAKING_MIXIN_AND_PANTRY`, with grammatical plural aliases
  `flatbreads` and `pains plats`. OQLF defines the family and gives both leavened and unleavened
  examples; named breads remain separate. Kept `flat bread` and `flat pita` out because OQLF
  associates them with a narrower non-pocket pita sense; left contextual `galette` out because the
  active picker already returns rice-paper sheets. No forms, recipe links, measures, conversions,
  yields, or substitutions were added.
- **WP02 A7 — unqualified wheat meal:** Kept `wheat meal` unresolved on the existing
  `ingredient-ref-wheat-meal` ledger record. Added the Canadian Importers Database classification
  source and a refreshed decision. The active reference stays scoped to whole wheat meal, with no
  new alias or French display for the generic term.
- **WP04 Section O — beef jerky:** Added `candidate-beef-jerky` as an unresolved, ledger-only
  candidate. Québec product names and CFIA categories document more than one species, so an active
  beef-only row would make bare `jerky` resolve to beef alone. Kept `charqui` scoped to its existing
  Peruvian camelid identity. Added no active identity, alias, form, measurement, recipe link,
  conversion, package yield, or substitution.

## Shared data changes

The active package now has **1,349 ingredient references** and **98 forms**. The ledger now has
**1,665 records**, **6,493 source entries**, **5,437 distinct source IDs**, and **4,527 distinct
URLs**. It retains **343 measurement observations** and **195 substitution findings**. Nine source
entries were added; six new source IDs and six new URLs were introduced, while existing OQLF
`pain plat`, OQLF `charqui`, and CFIA glossary source IDs were reused.

| Artifact | Count / state |
|---|---:|
| `ingredient-references.v1.json` | 1,349 references |
| `research-ledger.v1.json` | 1,665 records; 6,493 source entries; 5,437 IDs; 4,527 URLs |
| `BundledIngredientCatalog.kt` | 1,349 references |
| Ingredient forms | 98 forms |
| Measurement observations | 343 |
| Substitution findings | 195 |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes; SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Verification

- Bundled seed-package normalization and validation passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger JSON Schema validation and changed-record source-ID checks passed.
- Picker projections confirmed `flatbread`, `flatbreads`, `pain plat`, and `pains plats` resolve to the
  new family row; `flat bread` and `flat pita` remain unmatched; named bread results remain unchanged.
- The wheat-meal candidate remains inactive, and `candidate-beef-jerky` has no active picker row.
- The manifest-ordered recipe corpus fingerprint is unchanged. The only accent-folded `roti` text hit is Recipe 085#9, where French `rôti et haché` describes peanuts; it is not a bread request.
- UTF-8/no-BOM, local Markdown links, and scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, or other tests were run because the changes add database
  JSON data, consistent with the updated `AGENTS.md` rule.

See the [wheat-meal review](../../proposals/wp02-a7-unqualified-wheat-meal-round22-review-20261013.md),
[flatbread review](../../proposals/wp03-section-g-flatbread-family-boundary-review-20261013-round22.md),
and [beef-jerky review](../../proposals/wp04-section-o-jerky-gap-picker-boundary-review-20261013-round22.md).
Section G and Section O remain open; WP02 A7 remains open.
