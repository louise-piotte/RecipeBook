# WP02 Section 04 B2 R103 — Kersting’s groundnut flour integration

- **Date:** 2026-10-14
- **Decision:** Add identity-only `Kersting’s groundnut flour / farine de lentille de terre` in `FLOUR_AND_STARCH`.
- **Review:** [Identity review proposal](../../proposals/wp02-next-specialty-flour-starch-gap-review-r103-20261014.md)

## Catalog change

Added `ingredient-ref-kerstings-groundnut-flour` with two English aliases: `Kersting groundnut flour` and `Kersting’s groundnut seed flour`. The French display is a descriptive construction from PROTA’s French whole-seed name and remains provisional for Québec. No French alias, forms, density, unit mappings, active measures, conversions, yields, recipe links, or substitutions were added.

The flour is distinct from the active whole-seed `Kersting’s groundnut / lentille de terre` row, Bambara groundnut flour, isolated starch, chemically defatted flour, protein materials, and composite products. Study-specific flour preparation methods do not define reusable catalog forms.

## Evidence and limits

- Kew accepts *Macrotyloma geocarpum* and lists *Kerstingiella geocarpa* as a synonym. PROTA identifies `lentille de terre` as the French seed name and documents dry-seed flour for galettes and other foods.
- Reviews and primary studies document flour use while distinguishing whole flour, defatted flour, isolated starch, and composite blends. The cited 0.805 g/cm³ value belongs to a rice-cassava-Kersting blend; it is not the density of plain Kersting flour. A reported starch yield and formula-specific replacement ratios remain inactive.
- The manifest corpus contains 114 recipes and 1,123 ingredient rows. It has no Kersting-flour demand or links to the whole-seed Kersting reference.

## Picker projection

The projection follows the phrase-first search across current names, aliases, and forms.

| Query | Before | After |
|---|---:|---:|
| `Kersting’s groundnut` / `Kersting groundnut` | 1 each | 2 each |
| `Kersting’s groundnut seed flour` | 0 | 1 |
| `farine de lentille de terre` | 0 | 1 |
| `lentille de terre` | 1 | 2 |
| `groundnut flour` | 1 | 2 |
| `groundnut` | 4 | 5 |
| `ground bean` | 1 | 1 |

## Validation

Static package and ledger validation, catalog normalization, generated-index checks, picker projection, recipe corpus scan, source-ID checks, UTF-8/no-BOM checks, links, and whitespace checks passed. The catalog now has 1,442 references, 105 forms, and 1,782 research-ledger records. No app tests or emulator checks were run because this change only adds database JSON data and its generated catalog index.
