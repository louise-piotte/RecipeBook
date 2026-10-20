# WP02 — Flax meal/flour process-boundary hold (2026-10-12)

## Decision

Keep unqualified `flax meal`, `flaxseed meal`, `flax flour`, `flaxseed flour`, `linseed meal`,
`linseed flour`, and bare `farine de lin` unassigned. Do not add them to the active
`flax seeds / graines de lin` reference. Preserve the existing reference, aliases, and forms without
change; no active reference, alias, legacy candidate, research-ledger record, measure, conversion,
recipe link, density, unit mapping, yield, or substitution was added.

Canadian sources use `flaxseed meal` for two materially different products: ground whole seed with
its oil retained, and seed residue after oil pressing. Québec product wording distinguishes
`graines de lin moulues` from `farine de lin déshuilée`, but that qualified product name does not
settle the scope of bare `farine de lin` or the English meal/flour terms. A later review may consider
a product-specific defatted identity if a recipe or package establishes that need.

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned; no reviewed meal/flour phrase
or link to `ingredient-ref-flax-seeds` was found. Keep the source-specific observations separate from
active behavior: Health Canada's whole/ground flax portions, Bob's product serving, Shape Foods'
partially defatted technical specification, Patelin's product-specific baking guidance, and
flax/water egg-binder methods do not establish a generic density, unit mapping, conversion, or
substitution.

## Evidence reviewed

The full ownership and picker audit, corpus fingerprint, measurement limits, and source register are
in the [review proposal](../../proposals/wp02-b2-flax-meal-process-boundary-review-20261012.md).
Key sources include:

- [Health Canada's Canadian Nutrient File](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4528&lang=fre), whose bilingual entry combines whole and ground flaxseed, not defatted meal.
- [Bob's Red Mill Canada](https://www.bobsredmill.ca/produit/flaxseed-meal) and [Well.ca](https://well.ca/products/bobs-red-mill-whole-ground-flaxseed_143212.html), which describe a whole-ground flax product.
- Québec processor Patelin's [farine de lin déshuilée](https://www.patelin.ca/farine-de-lin-pour-notre-sante--patelin), listed separately from ground seed by [Aliments du Québec](https://alimentsduquebec.com/entreprises/les-produits-patelin) and [Grains du Québec](https://grainsduquebec.ca/repertoire-des-produits-certifies).
- Canadian processors Manitoba Flax, [TA Foods](https://www.tafoods.ca/), and [Shape Foods](https://shapefoods.com/wp-content/uploads/2022/01/Shape-Foods-Flax-Meal-Technical-Spec-Sheet-April-7-2020.pdf), whose product wording demonstrates differences in meal and defatted scope without a common threshold.
- [King Arthur Baking's flax egg method](https://www.kingarthurbaking.com/blog/2015/07/12/make-homemade-egg-replacer), which provides a source-specific binder method, not a general catalog conversion or ingredient substitution.

## Reconciliation

This closes the named flax meal/flour process-boundary review beneath the open WP02 Section B
alternative-flour checklist; the broader checklist remains open. Canonical JSON, recipes, the research
ledger, generated code, and app behavior were unchanged. This documentation-only reconciliation
required no app tests or emulator checks.
