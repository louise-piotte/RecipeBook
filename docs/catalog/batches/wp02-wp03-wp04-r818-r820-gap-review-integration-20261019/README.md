# WP02/WP03/WP04 R818–R820 gap review integration — 2026-10-19

## Scope and disposition

Reviewed and integrated three proposal-only reviews. The broader WP02 Section A7, WP03 Section F, and WP04 Section P packets remain open.

- **R818 — whole-wheat pastry flour:** refreshed the already-owned King Arthur SKU 212374 product source and recorded a supported, product-specific ledger finding to the existing pastry-flour identity. The manufacturer says this SKU can be used interchangeably with regular pastry flour. No amount, hydration adjustment, recipe link, or active substitution rule was added.
- **R819 — Frosted Flakes:** recorded the current English SmartLabel serving of 1 cup (38 g) on the exact 1,410 g package, GTIN `00064100108301`. Held the older French 580 g SmartLabel portion because its package size is absent from the searchable French size list and the direct product page returns only a shell. The already-verified French identity remains unchanged.
- **R820 — calamari:** recorded one historical CNF 2015 portion, one raw, mixed-species squid = 272.0 g, on the existing generic calamari ledger row. This source-specific count does not describe the separate 140 g ring-cut recipe or create a reusable count conversion. CNF 2026 row inspection remains open.

## Data and catalog effects

The research ledger is the only database JSON file changed. It now has **2,294 records**, **10,774 source entries**, **9,066 distinct source IDs**, **7,711 distinct source URLs**, **838 measurement observations**, and **361 substitution findings**. R818 reused its existing King Arthur product URL/source ID; R819 and R820 added three new source entries and two new URLs. No source ID points to conflicting URLs.

The active catalog remains at **1,886 references and 199 forms**. The manifest contains **114 recipes** with **1,123 entries in their `ingredients` arrays**; **1,097** entries carry an `ingredientRefId`. No active reference, form, alias, generated index, density, mapping, conversion, package yield, recipe link, or substitution rule changed.

## Static validation

- Research-ledger JSON Schema validation passed with zero errors. Source ID / URL integrity, observation-ID uniqueness, and substitution-finding-ID uniqueness checks passed.
- Independently checked King Arthur's current SKU 212374 product page and pie-crust context, the current WK Kellogg product page and English SmartLabel for Frosted Flakes, the French family page and older French SmartLabel record, Health Canada's CNF 2015 Food Code 3125 page and Users' Guide, and the current CNF overview.
- Confirmed the three proposal-local source IDs, two observation IDs, and one finding ID were available. The R818 King Arthur source is reused and refreshed in place.
- The active seed package and generated ingredient index did not change. Picker behavior is unchanged because R818–R820 modify research-ledger JSON only; each proposal records the relevant picker and recipe-demand review.
- JSON remains UTF-8 without BOM and ASCII-escaped. Proposal, integration, plan, roadmap, and workflow links were checked. Scoped whitespace checks passed.

No software tests, app build, emulator run, or deployment were performed. The only database change adds research JSON; the related plan, roadmap, workflow, and review files document that data-only work under the current `AGENTS.md` rule.

See the [R818 proposal](../../proposals/wp02-section-a7-next-gap-review-r818-20261019.md), [R819 proposal](../../proposals/wp03-section-f-next-gap-review-r819-20261019.md), and [R820 proposal](../../proposals/wp04-section-p-next-gap-review-r820-20261019.md). Current CNF 2026 oyster and squid row inspection remains open in Section P.
