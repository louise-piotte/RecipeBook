# R951–R953 cross-category generic ingredient integration

**Date:** 2026-10-19  
**Status:** R951 held after review; R952 and R953 integrated by the root agent.

## Decisions

- **R951 — sorghum germ:** held outside active catalog and research-candidate data. Primary milling evidence shows the anatomical germ can be separated, but the direct germ-fraction food-use study concerns dog-food extrusion. Human-food milling sources discuss germ retained in flour or included in mixed bran/offal, not a standalone culinary germ ingredient. Keep current sorghum rows and their source ownership unchanged; reopen only with direct human-food use evidence that defines the separated fraction.
- **R952 — common lamb’s-quarters / chénopode blanc:** added one identity-only `VEGETABLE_AND_AROMATIC` reference for leafy culinary use of *Chenopodium album* L. Kept it separate from Good King Henry, garden orach, amaranth greens, spinach, and quinoa seed. Use only the qualified, source-backed displays and no broad ambiguous aliases. The Maine Extension recipe amounts and methods remain source-specific.
- **R953 — gundruk / gundruk:** added one identity-only `SAUCE_AND_CONDIMENT` reference for the named Himalayan fermented leafy-vegetable food. Kept it distinct from sinki and nearby preserves without encoding a universal plant-part boundary. The borrowed French display remains provisional; study-specific processing, time, acidity, and sample observations remain scoped.

R952 and R953 add no forms, aliases, reusable measurements, recipe links, conversions, yields, or substitutions. No existing row was deleted, renamed, merged, or generalized. The R951 hold changed no catalog or ledger data.

## Scope review

All three assignments focused on generic ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched or added. The Section F commercial cereal-roster clauses and named Anson Mills wheat-meal lead remain out of scope because commercial-product counts do not add ingredient diversity. Preserve all existing branded entries and review transferability before reusing product-specific evidence.

## Static validation

- Ingredient-reference normalization, bundled package normalization/validation, and generated picker-index freshness passed.
- Research-ledger schema validation passed for **2,377 records**. Source IDs were checked for stable URL ownership; the reused OQLF source ID remains consistent.
- Exact recipe-text scan found **0 matches across 114 bundled recipes** for the reviewed candidate names and IDs. The R951 sorghum-germ hold created no reference or ledger record.
- Final catalog totals are **1,972 ingredient references and 205 forms**. UTF-8/no-BOM, local-link, exact ownership, and scoped whitespace checks passed.
- No Gradle, app, instrumentation, emulator, or software tests were run. R952 and R953 add ingredient database JSON under `AGENTS.md`; R951 is a hold.

## Reviews

- [R951 sorghum-germ hold review](../../proposals/wp02-a7-generic-grain-gap-review-r951-20261019.md)
- [R952 common lamb’s-quarters review](../../proposals/wp03-section-k-generic-produce-gap-review-r952-20261019.md)
- [R953 gundruk review](../../proposals/wp05-section-w-gundruk-generic-identity-review-r953-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
