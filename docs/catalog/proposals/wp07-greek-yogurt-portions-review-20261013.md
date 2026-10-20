# WP07 Greek-style yogurt source-specific portions

- **Date:** 2026-10-13
- **Status:** Root-reviewed and integrated as ledger-only measurement evidence.
- **Scope:** Existing `ingredient-ref-greek-yogurt`, linked recipes, and Health Canada Canadian Nutrient File serving portions for plain Greek-style yogurt.

## Findings

Health Canada's CNF lists these metric volume-to-mass portions for two separate plain Greek-style yogurt food codes:

| CNF food code | Source food | Published portions |
|---|---|---|
| 7469 | Greek-style yogurt, plain, 2% M.F. | 100 mL = 101.0 g; 125 mL = 126.3 g; 175 mL = 176.8 g; 250 mL = 252.5 g |
| 6982 | Greek-style yogurt, plain, rich (8–12% M.F.) | 125 mL = 130.4 g; 175 mL = 182.6 g; 250 mL = 260.8 g |

The serving pages publish the portions but do not state a measuring or packing procedure. The product codes are distinct fat classes, and the four bundled recipe rows do not specify either class. The observations therefore remain food-code-specific. They do not support one reusable density or conversion for the unqualified plain Greek-style yogurt form.

## Ledger disposition

Added seven `portion_weight` observations to `ingredient-ref-greek-yogurt` and set its measurement state to `researched_supported` for these bounded findings. Added two source records:

- `WP07-GREEK-YOGURT-20261013-S01` — [Health Canada CNF, Food Code 7469](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=7469), serving-portion page.
- `WP07-GREEK-YOGURT-20261013-S02` — [Health Canada CNF, Food Code 6982](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6982), serving-portion page.

`defaultDensity` remains null and `unitMappings` remains empty. No conversion, form, substitution, recipe line, or recipe quantity changed.

## Recipe context

The current identity is linked in four ingredient rows across three recipes: Tzatziki (one 1.5-cup row), Butter Chicken (one 1/2-cup row), and Crab Balls (two 1/4-cup rows). No recipe states a milk-fat percentage; the source-specific amounts were not mapped onto those lines.

## Verification

- Confirmed the exact CNF food codes, bilingual product descriptions, and portions on Health Canada's serving pages.
- Confirmed the existing yogurt identity remains linked to four rows across three recipes and that recipe JSON was not changed.
- Confirmed the active ingredient reference still has null default density and no unit mappings.
- Static package normalization and validation, ledger schema/source checks, generated-index freshness, corpus counts, UTF-8/no-BOM, and focused whitespace checks passed.
- No app, unit, instrumentation, emulator, or other tests were run because this change only adds database JSON evidence under the updated `AGENTS.md` rule.

WP07 remains open; this review adds bounded observations and does not resolve a generic cup-to-mass conversion.
