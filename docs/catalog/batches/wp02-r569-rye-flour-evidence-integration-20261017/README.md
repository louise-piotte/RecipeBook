# WP02 Section A R569 — rye-flour evidence integration

Date: 2026-10-17

## Decision

Added one `portion_weight` observation to the existing `ingredient-ref-rye-flour` ledger record: AGROBIO's 2023 catalog reports 1/4 cup (30 g) for its named organic rye flour. The record keeps the serving tied to that catalog version; no physical package was inspected, the fill method is unspecified, and the current co-op page does not verify the current label.

The same record now states that no reusable generic rye-for-wheat replacement amount is supported. Coop Agrobio's current page says rye flour is an excellent complement to wheat during breadmaking but gives no ratio. Pourafshar et al. tested 20% rye flour with 80% all-purpose wheat flour in one Barbari bread formula; that result remains formula-specific.

No active reference alias, density, unit mapping, form, package yield, recipe link, conversion, or substitution rule changed. Rye-meal, light, medium, and whole-rye-flour records remain separate.

## Sources

- [AGROBIO 2023 catalog](https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf), p. 7: bilingual rye-flour name and the printed 1/4 cup (30 g) serving.
- [Coop Agrobio Québec product page](https://coopagrobioquebec.com/produits/): qualitative breadmaking complement wording; no amount or ratio.
- [Pourafshar et al. (2015)](https://pmc.ncbi.nlm.nih.gov/articles/PMC4554633/): formula-specific Barbari study.

## Verification

- Research-ledger schema and source-link validation passed after integration.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed for this database-JSON-only update under `AGENTS.md`.

The broader WP02 Section A flour-grade parent remains open. See the [R569 proposal](../../proposals/wp02-next-gap-review-r569-20261017.md).
