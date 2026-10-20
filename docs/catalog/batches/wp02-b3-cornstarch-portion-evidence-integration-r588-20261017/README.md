# WP02 B3 R588 — cornstarch portion evidence

Date: 2026-10-17

## Decision

Added five `portion_weight` observations to the existing `ingredient-ref-cornstarch` research-ledger record:

- Health Canada CNF 2015 Food Code 4419: 100 mL = 54.1 g and 250 mL = 135.2 g.
- King Arthur Baking chart: 1/4 cup = 28 g.
- Bob’s Red Mill chart: 1/4 cup = 32 g and 1 cup = 128 g.

These values stay separate and source-bounded. The two charts disagree at the nominal quarter-cup quantity; neither chart supplies a shared cup volume or row-specific fill method. CNF 2015 remains distinct from the current CNF 2026 publication, whose cornstarch row join is not established here.

Kept `measurementState: blocked_pending_evidence`. The reference retains a null default density and empty unit mappings. No measure, conversion, form, recipe link, yield, or substitution was added; the existing substitution research remains unchanged. No bundled recipe line is a paired mass-and-volume measurement.

## Evidence

- Health Canada, [CNF 2015 Food Code 4419 serving portion](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4419): the bilingual generic cornstarch row lists 100 mL = 54.1 g, 250 mL = 135.2 g, and a separate 20.0 g serving. Only the two volume/mass pairs were recorded.
- King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart): the cornstarch row lists 1/4 cup = 1 ounce = 28 g.
- Bob’s Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart): the cornstarch row lists 32 g per 1/4 cup and 128 g per 1 cup.
- Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html): the 2026 CNF is published as relational CSV files; the 2015 online interface remains available as an interim route. This does not establish a 2026 cornstarch row.

The CNF source is new to the cornstarch record. The King Arthur and Bob’s Red Mill source IDs are reused with their existing URLs. All five observations reference the matching source entry.

See the [R588 proposal](../../proposals/wp02-b3-cornstarch-measurement-review-r588-20261017.md), the [B3 starch checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3042), and the broader [B2/B3 review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15900). Both broader tasks remain open.

## Static verification

Static seed-package validation, normalizer checks, generated-index freshness, research-ledger schema/source-ID validation, source ownership, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed or run because the change only adds database JSON data and tracking documentation under `AGENTS.md`.
