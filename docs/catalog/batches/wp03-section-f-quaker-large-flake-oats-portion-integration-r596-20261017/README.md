# WP03 Section F R596 — Quaker large-flake oats portion

Date: 2026-10-17

## Decision

Added one `portion_weight` observation to the existing `ingredient-ref-rolled-oats` ledger record: Quaker Canada Large Flake Oats, 1/3 cup = 30 g, dry and as sold. The English and French manufacturer pages describe the same product and label portion, so they support one observation rather than two independent measurements.

Kept `measurementState: blocked_pending_evidence`, `defaultDensity: null`, and `unitMappings: []`. The existing AgroFusion 54 g per 1/2-cup observation remains separate and unchanged. No generic cup conversion, dry/cooked form, yield, recipe quantity, alias, recipe link, or substitution was added. The French nutrition heading says “coup”; the narrative correctly says “tasse,” and the typo is not treated as a unit or alias.

## Evidence

- Quaker / PepsiCo Canada, [Large Flake Oats](https://www.tastyrewards.com/en-ca/brands/quaker/products/large-flake-quakerr-oats): states a serving is 1/3 cup (30 g), repeats that value in the nutrition heading, and declares 100% rolled oats.
- Quaker / PepsiCo Canada, [Gruau Quaker Gros flocons](https://www.tastyrewards.com/fr-ca/node/3022): the narrative states 1/3 tasse (30 g) and the ingredient declaration says 100% de flocons d’avoine; the nutrition heading contains the apparent typo “coup.”

The serving is one product-specific nutrition label portion. Neither page states a cup volume in millilitres, the method used to fill the cup, or a transferable measure for other oats.

See the [R596 proposal](../../proposals/wp03-section-f-next-gap-review-r596-20261017.md), the [dry/cooked forms checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4405), and the broader [Section F review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14968). Both larger plan items remain open.

## Static verification

Research-ledger schema and source ownership checks, bundled package validation, reference normalizer, generated-index freshness, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed because this change only adds database JSON data and tracking documentation under `AGENTS.md`.
