# WP02 Section A7 R671 integration — roasted corn flour research states

## Decision

Updated only the research states on the existing `ingredient-ref-roasted-corn-flour` ledger record. Current English and French pages from Les Moulins de Soulanges describe a heat-treated flour that promotes corn-starch gelatinization and list bakery uses, but give no recipe quantity, serving, package amount, mass-volume pair, density, or measuring method. The pages do not recommend replacing another flour.

Set `measurementState` to `researched_no_supported_value` and `substitutionResearchState` to `researched_no_supported_substitute`. Refreshed existing manufacturer sources `WP02-S130` and `WP02-S131` with the review date and current page locators. No catalog value, alias, observation, density, mapping, conversion, substitution finding/rule, form, yield, or recipe link changed.

Mills of Crete’s 5%–20% advice belongs to its separate roasted-corn product, and the Ghana study’s 0.6 g/mL bulk density and Tom Brown formulas belong to its own roasted flour and food context. Neither was assigned to the active Québec-mill product. This closes research for the source-defined Moulins product without claiming all roasted-corn-flour products lack measures or replacement advice. The broader A7 parent remains open.

## Integration and static checks

- Changed one existing ledger record; references remain at **1,837**, forms at **166**, and the manifest corpus at **114 recipes / 1,123 ingredient lines**. The ledger remains **2,212 records**, with **10,355 source entries**, **8,745 distinct source IDs**, and **7,395 distinct source URLs**.
- Static checks passed: bundled-package validation/normalization check, ingredient-reference normalization, generated-index freshness, ledger schema/custom validation (2,212 records, zero errors), source-ID/URL ownership, unchanged picker and recipe-link projections, UTF-8/no-BOM, local links, and whitespace.
- No software tests, build, emulator run, or deployment were performed because the change only updates database JSON, under the updated `AGENTS.md` rule.

## Proposal and sources

See the [R671 proposal](../../proposals/wp02-a7-next-grain-meal-review-r671-20261018.md), with [Moulins de Soulanges’ English product page](https://moulinsdesoulanges.com/language/en/roasted-corn-flour/) and [French product page](https://moulinsdesoulanges.com/language/fr/farine-de-mais-torrefie/). The proposal separately documents [Mills of Crete’s roasted-corn-flour guidance](https://www.mills.gr/en/product/roasted-corn-flour/) and [the Ghana Tom Brown study](https://onlinelibrary.wiley.com/doi/full/10.1002/fsn3.70288), whose product-specific figures were not transferred.
