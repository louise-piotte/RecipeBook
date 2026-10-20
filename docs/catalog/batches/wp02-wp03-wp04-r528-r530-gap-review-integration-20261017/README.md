# WP02 / WP03 / WP04 R528–R530 integration

- **Date:** 2026-10-17
- **R528:** Added two identity-only `GRAIN_AND_CEREAL` references for Mesa Sunrise cereal and Mesa Sunrise with raisins. Each has a product-specific French Metro title alias; UPCs and package sizes stay source-specific context. No forms, measures, density, mappings, conversions, yields, recipe links, or substitutions were added.
- **R529:** Added one Ecoideas-specific 2 tbsp (15 g) label portion and one formula-bounded white-lupin-for-re-milled-semolina bread finding to the existing sweet-lupin flour ledger record. No active density, reusable measure, unit mapping, conversion, recipe link, or substitution rule was added.
- **R530:** Held generic kamaboko outside active references and the shared ledger because reviewed sources do not establish one family-wide Québec French name or a single product scope. The seven source IDs remain proposal-local.

## Demand and evidence boundaries

The R528 manifest scan found no Mesa Sunrise wording, UPC, candidate reference ID, alias, or linked ingredient row in the 114 bundled recipes / 1,123 structured ingredient rows. The R529 scan likewise found no lupin-flour demand. R530 found no kamaboko or neighboring fish-paste product demand. None of the three reviews edited recipes or the manifest.

R528 distinguishes the original 750 g SKU `058449779018` from the raisin 825 g SKU `058449771616`. Both manufacturer multipacks were marked sold out at review; Metro’s French-indexed title results support the aliases, while direct French page opens redirected to English. These are identity sources, not claims of current retailer stock.

R529 preserves the 2 tbsp (15 g) claim as one named Ecoideas label serving, not a density or reusable flour conversion. The Spina et al. finding applies only to its defined durum-semolina bread formula and tested white-lupin flour; it is not an active substitution recommendation.

R530 preserves the active chikuwa, fish-ball, fish-tofu, fish-cake, surimi, and naruto-maki boundaries. MAFF documents diverse fish-paste products and methods; the Québec-facing references do not establish a generic French label that would resolve the family safely.

## Snapshot and validation

Post-integration snapshot: **1,799 ingredient references / 144 forms / 56 legacy candidates; 2,156 ledger records / 9,910 source entries / 8,388 distinct source IDs / 7,096 distinct source URLs; 114 recipes / 1,123 ingredient rows.**

Static package normalization/validation, generated-index freshness, ledger schema and source ownership, source-linked observation/finding checks, picker projection, manifest corpus scans, UTF-8/no-BOM, local Markdown links, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were needed for these database-JSON additions or documentation-only hold under `AGENTS.md`.

See the [R528 Mesa Sunrise proposal](../../proposals/wp03-section-f-next-gap-review-r528-20261017.md), [R529 sweet-lupin proposal](../../proposals/wp02-b2-next-flour-starch-gap-review-r529-20261017.md), and [R530 kamaboko hold proposal](../../proposals/wp04-section-p-kamaboko-boundary-review-r530-20261017.md). Sections WP02 B2, WP03 Section F, and WP04 Section P remain open.
