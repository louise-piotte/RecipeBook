# WP03 Section F R255 — Sona Masoori Rice Integration

- **Status:** Integrated one identity-only `GRAIN_AND_CEREAL` reference.
- **Review date:** 2026-10-16.

## Integrated identity

| English display | French display | Aliases | Category |
|---|---|---|---|
| `Sona Masoori rice` | `riz Sona Masoori` | `Sona Masuri rice`; `riz Sona Masuri` | `GRAIN_AND_CEREAL` |

The spelling variants are limited to source-attested English and Canadian French product wording. The row remains separate from generic rice, named varieties such as basmati, jasmine, Calrose, and Koshihikari, grain-length classes, Ponni rice, and idli rice. It does not assert a universal cultivar, milling state, or grain length.

## Measurements and substitutions

The ledger stores the Tilda listing's 4.535 kg package and its 1/4 cup (45 g) Nutrition Facts serving as observations specific to that SKU. The serving does not define a reusable cup-to-mass mapping or generic rice density.

Two reviewed cooking directions differ: Tasty Grains gives 1:1.5 rice to water, while Nitra Foods gives 2–2.5 cups water per cup of rinsed and soaked rice under its method. They remain source-specific cooking instructions, not a dry-to-cooked yield or active conversion. Taste Lab's Ponni 1:1 replacement claim remains blocked because it lacks a test protocol, preparation context, and dish-role scope. No forms, density, unit mappings, conversions, yields, or substitutions were added.

## Picker and recipe-corpus audit

Static phrase-first projection returns the new row for `Sona Masoori`, `Sona Masoori rice`, `Sona Masuri`, `Sona Masuri rice`, `riz Sona Masoori`, `riz Sona Masuri`, and `sona`. `rice` grows from 68 to 69 results; `medium-grain rice` remains on the medium-grain row, and `cassonade` remains on its three existing partial matches.

The manifest-listed bundle contains 114 recipes and 1,123 structured ingredient rows. It has no matching Sona Masoori / Sona Masuri wording or direct reference link.

## Sources and static checks

The [R255 proposal](../../proposals/wp03-section-f-gap-review-r255-20261016.md) contains the source register, identity and naming evidence, boundaries, and original ownership audit. The Noor English and French retailer URLs are stored as separate ledger source entries so each source ID maps to one URL.

Static checks passed for bundled seed-package normalization and validation, generated-index freshness, research-ledger schema and source ID/URL consistency, exact ownership, picker projection, recipe corpus, UTF-8/no-BOM, local links, and scoped whitespace.

Totals: **1,650 references**, **125 forms**, and **1,998 ledger records / 8,735 source entries / 7,404 distinct source IDs / 6,173 distinct source URLs**; 114 recipes / 1,123 ingredient rows.

No software tests, emulator checks, or deployment were run because this batch adds database JSON data and its generated catalog index. Section F remains open.
