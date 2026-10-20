# R945–R947 cross-category generic ingredient integration

**Date:** 2026-10-19
**Status:** Integrated by the root agent after review of all three proposal packets.

## Catalog changes

- **R945 — citric acid / acide citrique:** added one identity-only `BAKING_AND_SPICE` reference for generic food-grade citric acid. Health Canada’s named food classes and conditions remain regulatory source context; they do not become a household dose or general preservation instruction. No aliases, forms, measures, recipe links, conversions, yields, or substitutions were added.
- **R946 — winter savory / sarriette vivace:** added one identity-only `HERB` reference for culinary leaves of *Satureja montana*, distinct from summer savory and thyme. The Montréal Botanical Garden supports the bilingual names and culinary leaves; Kew supports taxonomy and food use. No aliases, forms, measures, recipe links, conversions, yields, or substitutions were added.
- **R947 — baek-kimchi / baek-kimchi:** added one identity-only `SAUCE_AND_CONDIMENT` reference as a generic named kimchi type, with source-attested English aliases `white kimchi` and `baekkimchi`. The borrowed French display remains provisional. Recipe particulars on the official source page remain source-scoped; no forms, measures, recipe links, conversions, yields, or substitutions were added.

No bundled recipe demand was found for these identities. Existing summer savory, generic kimchi, dongchimi, and other branded entries remain unchanged. Product-specific claims and measurements were not transferred to generic identities.

## Cross-category scope review

The three assignments cover generic culinary ingredient diversity across baking, herbs, and preserved foods. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched or added. The open-plan scan found no other active commercial-only roster assignment; the two Section F cereal-roster clauses and named Anson Mills wheat-meal lead remain out of scope because commercial-product counts do not add ingredient diversity. Generic cereal and wheat-meal gaps remain open.

All current subagents received the catalog-wide scope reminder. Their assigned proposal work was generic and complete; no brand-specific task remained pending. Existing branded entries and source-scoped evidence were preserved without deletion or merging.

The OQLF kimchi parent-term source reuses the existing `WP05-EAST-S06` source ID on both the R944 dongchimi and R947 baek-kimchi records. No new duplicate source ID was created for the same OQLF page.

## Static validation

- Ingredient reference normalization, bundled package validation, and generated-index freshness passed.
- Research-ledger schema/source checks, identity ownership, exact recipe-demand scans, UTF-8/no-BOM checks, local-link checks, and scoped whitespace checks passed.
- Final counts: **1,967 ingredient references, 205 forms, and 2,372 research-ledger records**.
- No software tests were run. The application data change adds ingredient JSON; the generated Kotlin picker index was regenerated from that canonical data under the `AGENTS.md` testing exception.

## Reviews

- [R945 citric-acid review](../../proposals/wp02-plan-generic-gap-r945-20261019.md)
- [R946 winter-savory review](../../proposals/wp03-plan-generic-gap-r946-20261019.md)
- [R947 baek-kimchi review](../../proposals/wp05-plan-generic-gap-r947-20261019.md)
- [R942–R944 integration README](../wp02-wp03-wp05-r942-r944-generic-gap-integration-20261019/README.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
