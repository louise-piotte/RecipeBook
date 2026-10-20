# WP02 A7 sorghum-meal candidate integration — 2026-10-13

## Decision

Added unresolved ledger-only `candidate-sorghum-meal`. Current manufacturer and Canadian distributor
pages establish a human-food sorghum-meal product family, but Nu Life offers whole and pearled meal
products with coarse, medium, and fine grind profiles. Those product variants do not define one
source-neutral picker identity. The reviewed Québec list names `farine de sorgho` and `grain de
sorgho`, but does not establish a meal-specific French display. The phrases `farine de sorgho`,
`gruau de sorgho`, and `semoule de sorgho` remain owned by the existing flour, grits, and semolina
references.

The candidate is `needs_clarification`; measurement research is `researched_no_supported_value` and
substitution research is `researched_no_supported_substitute`. No active reference, form, alias,
legacy identity, recipe link, measure, density, mapping, conversion, yield, or substitution was added.
The bundled corpus has 114 recipes and 1,123 ingredient rows, with no sorghum-meal demand. The earlier
A6 Mabele-name hold remains separate; no regional spelling was attached to this generic candidate.

## Evidence

- [Nu Life Market — Sorghum Meal](https://nulifemarket.com/glutenfree/meal/): distinguishes meal from flour, lists whole and pearled variants, and offers multiple grind profiles for commercial food production.
- [Nu Life Market — White Whole Sorghum Meal](https://nulifemarket.com/gf/white-whole-sorghum-meal/): describes one coarse meal made from the entire white grain; bulk sizes remain package-specific.
- [Dempsey Food — Product Lines, Canada](https://www.dempseyfood.com/products-lines-canada): lists Nu Life among Canadian product lines and names meal, flour, and whole grains.
- [Statistics Canada — Customs Tariff 2025, Section II](https://www150.statcan.gc.ca/n1/pub/65-209-x/2025001/section2-eng.htm): includes grain sorghum and defines meal/groats under heading 11.03 with a sieve criterion. This is a tariff classification, not a household milling or language standard.
- [Les Aliments Kabeya International — Nos produits, Québec](https://www.lesalimentskabeya.com/nos-produits.php): distinguishes its powdery `farine de sorgho` listing from `grain de sorgho` used for porridge; neither names sorghum meal.
- [FAO/WHO Codex — Sorghum Flour Standard](https://www.fao.org/input/download/standards/58/CXS_173e.pdf): the existing ledger source WP02-S33 specifies standardized sorghum flour and explicitly excludes sorghum grits or meal; it does not set a consumer-facing meal grind or Québec French display.

The source records, exact-ownership audit, picker projection, recipe scan, and decision are in the
[R54 proposal](../../proposals/wp02-a7-sorghum-meal-product-boundary-review-20261013-round54.md).

## Verification

- Research-ledger schema validation passes with the new candidate and five proposal source records.
- Exact active/form/legacy ownership and all manifest-listed recipe files and ingredient rows were checked; no active row or recipe link was added.
- Package normalization and ledger validation passed; no app, unit, instrumentation, or emulator tests were run because this change only adds database JSON research data under the updated `AGENTS.md` rule.
