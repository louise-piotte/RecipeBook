# WP07 peanut-butter portion observation review

- **Date:** 2026-10-13
- **Status:** Source-specific portion accepted into the research ledger; no active conversion or recipe edit.
- **Scope:** Review USDA SR28's household-measure entry for peanut butter and the linked recipe lines. Preserve the source product and measure exactly; do not generalize this row to all peanut-butter products.

## Finding

USDA Standard Reference Release 28's `Per Measure` table lists NDB 16098, `Peanut butter, smooth style, with salt`, as **32.0 g per 2.0 tbsp**. The table supports that published portion for this exact food code. It does not state a tablespoon convention or filling method, and it does not establish a generic peanut-butter density or mapping.

The research ledger now stores this as a `portion_weight` observation on `ingredient-ref-peanut-butter`, sourced to `WP07-PEANUT-BUTTER-20261013-S01`. The measurement state is `researched_supported` to reflect the bounded observation. The bundled ingredient reference remains unchanged: `defaultDensity` is null and `unitMappings` is empty.

## Recipe context and limits

The active identity is linked in seven recipes across seven ingredient rows:

| Recipe | Stored ingredient text |
|---|---|
| 001 | `1 tbsp peanut butter` |
| 020 | `1/2 cup creamy peanut butter` |
| 022 | `240 g smooth peanut butter` |
| 031 | `peanut butter` |
| 067 | `1/2 cup natural peanut butter` |
| 090 | `1/2 cup natural creamy peanut butter` |
| 095 | `2 tbsp peanut butter` |

The USDA row is a salted, smooth-style product, while recipe text includes generic, creamy, and natural product descriptions. The observation therefore does not resolve any recipe line's amount, establish a cross-product conversion, or support an active density. No recipe text, quantities, ingredient links, forms, substitutions, or catalog values changed.

## Source

- **`WP07-PEANUT-BUTTER-20261013-S01`** — USDA National Nutrient Database for Standard Reference, Release 28, [EPA Content PDF](https://ods.od.nih.gov/pubs/usdandb/EPA-Content.pdf), NDB 16098, `Per Measure` table. The official table reports 32.0 g for 2.0 tbsp of `Peanut butter, smooth style, with salt`; it does not define spoon capacity or filling method.

## Verification

- Confirmed the official table row and exact food-code description.
- Confirmed seven linked peanut-butter rows across seven manifest-listed recipes; the recipe corpus remains 114 files and 1,123 ingredient rows.
- Confirmed that the active reference still has null density and no unit mappings.
- No Android, unit, instrumentation, or emulator tests were run because the change only adds a research-ledger JSON observation, under the updated `AGENTS.md` rule.
