# WP02/WP03/WP04 R815–R817 gap review integration — 2026-10-19

## Scope and disposition

Reviewed and integrated three proposal-only gap reviews. The broader WP02 Section A7, WP03 Section F, and WP04 Section P packets remain open.

- **R815 — malted wheat flour:** recorded Canale et al.'s Anapo soft-bread study as a blocked, study-scoped substitution finding on the existing malted-wheat-flour ledger record. The 0.5% result does not transfer to household recipes, other malted-wheat products, or an unmodeled composite improver. Added no active substitution rule, form, alias, measurement, or recipe link.
- **R816 — Froot Loops cereal:** recorded two manufacturer SmartLabel portions, each 1 cup / 1 tasse (39 g), on the existing reference ledger record. Kept the 825 g English GTIN `00064100595705` and 780 g French GTIN `00064100144699` observations separate. Added no density, conversion, package yield, or recipe link; the French SmartLabel page has an older crawl indicator and recommends checking the package for current details.
- **R817 — Eastern oyster:** recorded seven historical CNF 2015 portions on the existing Eastern-oyster ledger record: four wild Food Code 3118 values and three farmed Food Code 3191 values. Kept volume and six-medium observations distinct and food-code-specific; the CNF guide identifies conversion weights as edible portions without refuse. Current CNF 2026 row inspection remains open; no current-edition value is claimed.

## Data and catalog effects

The research ledger is the only database JSON file changed. It now has **2,294 records**, **10,771 source entries**, **9,063 distinct source IDs**, **7,709 distinct source URLs**, and **836 measurement observations**. The malted-wheat-flour row has one new blocked substitution finding; the Froot Loops row has two source-scoped observations; the Eastern-oyster row has seven CNF 2015 observations. The source guide URL for R817 is reused under a record-specific source ID; no source ID points to conflicting URLs.

The active catalog remains at **1,886 references and 199 forms**. The manifest contains **114 recipes** with **1,123 entries in their `ingredients` arrays**; **1,097** of those entries currently contain an `ingredientRefId`. This distinction reconciles the recent 1,097 reference-linked-row scan with the 1,123 total ingredient-row count used in R812 and later proposals. No active reference, form, alias, generated index, density, mapping, conversion, package yield, recipe link, or substitution rule changed.

## Static validation

- Research-ledger JSON Schema validation passed with zero errors. Source ID to URL integrity, observation-ID uniqueness, and substitution-finding-ID uniqueness checks passed.
- Independently checked the Anapo paper, both official WK Kellogg SmartLabel GTIN pages, Health Canada's CNF 2015 serving pages and user guide, and Health Canada's current CNF overview. The R817 historical rows remain explicitly distinct from the current CNF 2026 files, whose row contents were not available for this review.
- Confirmed the proposal-local IDs are new and all new source handles resolve to the intended target ledger records. The existing record-specific CNF 2015 guide URL is used with a new local source ID; no source ID / URL conflict was introduced.
- The active seed package and generated ingredient index did not change. Picker behavior is unchanged because R815–R817 only add research-ledger JSON; each proposal records the relevant picker and recipe-demand review.
- JSON remains UTF-8 without BOM and ASCII-escaped. Proposal, integration, roadmap, workflow, and plan links were checked. Scoped whitespace checks passed.

No software tests, app build, emulator run, or deployment were performed. The only database change adds research JSON, and the related plan, roadmap, workflow, and review files document that data-only work under the current `AGENTS.md` rule.

See the [R815 proposal](../../proposals/wp02-section-a7-next-gap-review-r815-20261019.md), [R816 proposal](../../proposals/wp03-section-f-next-gap-review-r816-20261019.md), and [R817 proposal](../../proposals/wp04-section-p-next-gap-review-r817-20261019.md). The current CNF 2026 oyster-row inspection remains an open follow-up in Section P.
