# R942–R944 cross-category generic ingredient integration

**Date:** 2026-10-19
**Status:** Integrated by the root agent after review of all three proposal packets.

## Catalog changes

- **R942 — triticale germ / germe de triticale:** added one identity-only `GRAIN_AND_CEREAL` reference for the cereal fraction named in Barnes's research. Kept the French compound provisional because OQLF attests only the base term `triticale`. Study preparation and oxidation findings remain sample-specific; no measures, aliases, forms, recipe links, conversions, yields, or substitutions were added.
- **R943 — feijoa / feijoa:** added one identity-only `FRUIT` reference distinct from common guava. Added only the source-backed English aliases `feijoas` and `pineapple guava`. Horticultural fruit weights, peel details, and the extension page's broad pulp replacement sentence were not transferred to reusable measures, forms, or substitutions.
- **R944 — dongchimi / dongchimi:** added one identity-only `SAUCE_AND_CONDIMENT` reference for a generic Korean kimchi type. Added only `radish water kimchi` as an English alias. The French borrowed display remains provisional. The official example recipe's amounts and method remain source-specific. Before integration, unnecessary Montréal retailer and Ottawa maker pages, product labels, and package volumes were removed from the proposal; official Korean sources and OQLF's parent-term entry support the bounded identity and naming limit.

No bundled recipe demand was found for these three identities. No recipe links, forms, measurements, densities, unit mappings, conversions, yields, or active substitutions were added. Existing references, including branded rows and their product-scoped evidence, were preserved without deletion or merging.

## Cross-category scope review

The three completed reviews cover cereal fraction, fruit, and preserved-food types. None researches or adds a brand, product line, flavour family, SKU, or retailer-specific variant roster. A fresh scan of unchecked plan items that mention brands, flavours, retailers, manufacturers, or commercial products found no active assignment whose sole deliverable is such a roster. The Section F cereal-roster clauses and the named Anson Mills wheat-meal lead remain explicitly out of scope because commercial-product counts do not add ingredient diversity; their generic parent gaps remain open.

The same rule applies across every ingredient type. Preserve existing branded entries, and review transferability before using their evidence for a generic identity. Manufacturer or producer sources may support a generic ingredient when the claim applies beyond the named product; product-only measurements and claims stay product-scoped.

## Static validation

- Ingredient reference normalization and bundled package validation passed.
- The generated ingredient index was regenerated from the canonical reference JSON.
- Package, reference, generated-index, research-ledger schema/source, identity ownership, recipe-demand, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- Final counts: **1,964 ingredient references, 205 forms, and 2,369 research-ledger records**.
- No software tests were run. The app data changes add database JSON under `AGENTS.md`; the generated Kotlin index was regenerated from that data.

## Reviews

- [R942 triticale-germ review](../../proposals/wp02-plan-generic-gap-r942-20261019.md)
- [R943 feijoa review](../../proposals/wp03-plan-generic-gap-r943-20261019.md)
- [R944 dongchimi review](../../proposals/wp05-plan-generic-gap-r944-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
