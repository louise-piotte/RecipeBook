# WP02/WP03/WP04 R821–R823 gap review integration — 2026-10-19

## Scope and disposition

Reviewed and integrated three proposal-only reviews. Sections A7, F, and P remain open.

- **R821 — whole-wheat flour:** recorded two CNF 2015 Food Code 4500 portions (100 mL = 50.7 g; 250 mL = 126.8 g) on the existing whole-wheat-flour ledger row and refreshed its existing source S3. These are historical, food-code-specific portions; no density, app-cup mapping, active conversion, alias, or recipe link was added. CNF 2026 row values remain unverified.
- **R822 — couscous:** recorded five CNF 2015 volume portions on the existing couscous row: two for dry Food Code 4420 and three for cooked Food Code 4490. Also recorded the directly stated Food Code 4420 “amount to make 125 mL” as 34.5 g dry input → 125 mL prepared-product amount using a ledger-only `cooking_yield` observation. No active form, alias, conversion, recipe link, or substitution was added. Recipe 018 mentions couscous only as an optional serving suggestion, not as an ingredient line. CNF 2026 row values remain unverified.
- **R823 — blue mussel:** recorded five CNF 2015 Food Code 3115 portions (100/250 mL and small/medium/large counts) on the existing *Mytilus edulis* ledger row. The listed masses are edible portions without refuse. The separate 70% refuse field does not establish shell-on mass or yield. CNF 2026 row values remain unverified.

## Data and catalog effects

The research ledger is the only database JSON file changed. It now has **2,294 records**, **10,779 source entries**, **9,071 distinct source IDs**, **7,713 distinct source URLs**, **851 measurement observations**, and **361 substitution findings**. R821 reuses S3; R822 and R823 add five record-scoped source entries and two new URLs. No source ID points to conflicting URLs.

The active catalog remains at **1,886 references and 199 forms**. No active reference, form, alias, generated index, density, unit mapping, conversion, package yield, recipe link, or substitution rule changed. The manifest contains **114 recipes**, with **1,123 entries in `ingredients` arrays**, including **1,097** rows carrying an `ingredientRefId`.

## Static validation

- Research-ledger schema validation passed with zero errors. Source ID / URL integrity, observation-ID uniqueness, and substitution-finding-ID uniqueness checks passed.
- Independently checked Health Canada's CNF 2015 Food Codes 4500, 4420, 4490, and 3115 pages. Also checked the CNF 2015 Users' Guide interpretation of edible portions without refuse and CFIA guidance for the direction of a declared amount needed to prepare a finished-food reference amount. The CNF 2026 row values for these candidates remain unverified.
- The proposals document record/source ownership, measurement scope, picker projections, and manifest-listed recipe scans. Recipe 018 contains only a qualitative couscous serving suggestion. No active catalog terms changed, so picker behavior and the generated ingredient index are unchanged.
- Research ledger text remains ASCII-escaped UTF-8 without BOM and round-trips with stable formatting. Proposal and integration links and scoped whitespace checks were reviewed.

No software tests, app build, emulator run, or deployment were performed. The only database change adds research JSON, as allowed by the current `AGENTS.md` rule.

See the [R821 proposal](../../proposals/wp02-section-a7-next-gap-review-r821-20261019.md), [R822 proposal](../../proposals/wp03-section-f-next-gap-review-r822-20261019.md), and [R823 proposal](../../proposals/wp04-section-p-next-gap-review-r823-20261019.md).
