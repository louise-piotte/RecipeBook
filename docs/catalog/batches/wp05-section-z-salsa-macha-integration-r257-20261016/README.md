# WP05 Section Z R257 — Salsa Macha Integration

- **Status:** Integrated one identity-only `SAUCE_AND_CONDIMENT` reference.
- **Review date:** 2026-10-16.

## Integrated identity

| English display | French display | Aliases | Category |
|---|---|---|---|
| `Salsa macha` | `salsa macha` (provisional fr-CA wording) | None | `SAUCE_AND_CONDIMENT` |

The named condiment family is separate from generic salsa, Salsa Lizano, hot sauce, chili oil or crisp,
salsa roja or verde, Mexican adobo sauce, chipotles in adobo, and mole. Québec and Mexican maker sources
show different ingredient lists and variants, so no universal formula, allergen profile, or variant rows
were added.

## Package observations and picker behavior

The ledger preserves the Aliments du Québec product's 250 mL listing and Luna Brava's 200 g and 300 g
presentations as package-specific observations. They are not recipe portions, reusable measures, or
mass-volume conversions. The active reference has a null density and empty unit mappings; no forms,
recipe links, yields, or substitutions were added.

Current picker projection:

- `salsa macha` → Salsa macha
- `macha` → Salsa macha
- `salsa` → Salsa macha and Lizano sauce

The full 114-recipe bundle (1,123 ingredient rows) has no `salsa macha` text or linked ingredient line.

## Sources and static checks

The [R257 proposal](../../proposals/wp05-section-z-salsa-macha-boundary-review-r257-20261016.md)
contains the source register and full ownership, picker, and recipe audit. Static checks passed for
bundled seed-package normalization and validation, generated-index freshness, research-ledger schema
and source ID/URL consistency, exact phrase ownership, picker projection, recipe corpus, UTF-8/no-BOM,
local links, and scoped whitespace.

Totals: 1,649 references, 125 forms, and 1,997 ledger records / 8,726 source entries / 7,395 distinct
source IDs / 6,164 distinct source URLs; 114 recipes / 1,123 ingredient rows.

No software tests, emulator checks, or deployment were run because this batch only adds database JSON
data and its generated index. Broader Section Z coverage remains open.
