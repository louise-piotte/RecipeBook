# R963–R965 generic ingredient gap integration

Reviewed and integrated 2026-10-19. This batch adds generic ingredient diversity across grain milling, leafy produce, and regional preserved foods. It does not expand commercial products, brands, product lines, flavours, SKUs, or retailer variants.

## Integrated identities

- **R963 — defatted wheat germ meal / germe de blé déshuilé moulu.** Added as an identity-only `GRAIN_AND_CEREAL` ingredient, separate from raw wheat germ and other wheat fractions. The French display is provisional. Primary cookie and bread studies support human-food use but their sample specifications and flour-replacement/addition amounts remain study-specific. No supported household measure or density was found; substitution remains `blocked_pending_evidence`.
- **R964 — New Zealand spinach / tétragone.** Added for food-grown leaves of *Tetragonia tetragonioides*, separate from ordinary spinach, Malabar spinach, water spinach, garden orach, fruit, and other plant parts. Added four OQLF-supported French aliases. Two published portions (100 mL chopped = 23.7 g; 250 mL chopped = 59.2 g) remain tied to raw Health Canada CNF Food Code 2132. No density, unit mapping, or general yield was derived. Broad cooking replacement evidence remains blocked pending recipe context.
- **R965 — senmaizuke / senmaizuke.** Added as a named Kyoto turnip pickle, separate from generic pickled radish, suguki-zuke, shibazuke, takuan, raw turnip, and Kyoto mibuna. `senmai-zuke` is the one spelling alias. The French display remains a provisional borrowing. No reusable measure or finished-pickle substitute was supported; the daikon option remains scoped to one preparation recipe.

No forms, recipe links, conversions, yields, active substitutions, or reusable household measurements were added. Existing ingredient rows and source evidence remain unchanged. The R963 branded hot-cereal declaration was preserved on its original owner and not generalized to the generic meal.

## Scope disposition

- A fresh open-checklist review found no new item whose sole deliverable is a brand, product-line, flavour-family, SKU, or retailer-variant roster.
- The Section F commercial cereal-roster clauses and named Anson Mills wheat-meal lead remain marked out of scope because commercial-product counts do not add ingredient diversity. The generic Section F and wheat-meal coverage parents remain open where ingredient evidence supports them.
- Existing branded entries were not deleted or merged. Product-specific measurements and claims remain scoped; manufacturer evidence is used for generic claims only when the claim transfers beyond the named product.

## Verification

- Refreshed package totals: **1,984 ingredient references**, **205 forms**, **2,389 research-ledger records**.
- The candidate scans found no prior identity owner or bundled recipe match for these additions. The bundle remains 114 recipes and 1,123 ingredient rows.
- Static seed-package/reference normalization and validation, research-ledger schema/source ownership, generated-index freshness, identity ownership, recipe-demand, UTF-8/no-BOM, local links, and scoped whitespace checks passed.
- No software tests, builds, emulator runs, or deployments were performed. The catalog implementation only adds database JSON data, which `AGENTS.md` exempts from software testing.

## Research proposals

- [R963 — defatted wheat germ meal](../../proposals/wp02-a7-generic-grain-gap-review-r963-20261019.md)
- [R964 — New Zealand spinach](../../proposals/wp03-section-k-generic-produce-gap-review-r964-20261019.md)
- [R965 — senmaizuke](../../proposals/wp05-section-w-generic-preserved-food-gap-review-r965-20261019.md)
- [Cross-category ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
