# WP02 B3 R601 cassava-flour measure and substitution research

- **Status:** Integrated 2026-10-17.
- **Proposal:** [R601 review](../../proposals/wp02-b3-cassava-flour-measure-substitution-review-r601-20261017.md).
- **Plan anchors:** flour/starch checklist at [line 3042](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3042) and broader WP02 work at [line 15893](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15921).

## Integrated evidence

The existing `ingredient-ref-cassava-flour` ledger record now contains two separate product-label observations:

| Product | Observation | Label amount |
| --- | --- | --- |
| Bob’s Red Mill Cassava Flour | `cassava-flour-bobs-red-mill-quarter-cup-35g-r601-20261017` | 1/4 cup (35 g) |
| Yupik Organic Cassava Flour, Fine (Gluten Free), SKU P31516 | `cassava-flour-yupik-p31516-quarter-cup-30g-r601-20261017` | 1/4 cup (30 g) |

Both are dry, as-sold manufacturer-label servings. Neither source specifies cup capacity or filling method. The 5 g difference remains source-specific: it is not averaged into an interval or used as a generic cup-to-mass mapping. Measurement research stays `blocked_pending_evidence`; density stays null and unit mappings remain empty.

## Wheat-flour replacement boundary

The ledger records `cassava-flour-general-wheat-replacement-r601-20261017` as `blocked_pending_evidence`. Bob’s Red Mill advises against one-to-one replacement, Yupik gives an unspecified-basis 1:1 statement, and Otto’s Naturals gives brand-specific advice on weight and volume. These sources do not establish a transferable replacement rule. No replacement list, active rule, or recipe-line link was added; each manufacturer’s advice remains scoped to its own product.

The active ingredient name and aliases are unchanged. No form, density, unit mapping, conversion, package yield, or recipe link was added. The recipe bundle has no direct cassava-flour demand.

## Verification

The research ledger schema and source/identifier ownership checks are run for the new evidence. No app tests, build, emulator run, or deployment are needed for this database-JSON-only update under `AGENTS.md`.
