# R954–R956 cross-category generic ingredient integration

**Date:** 2026-10-19  
**Status:** Integrated by the root agent after reviewing all three proposal packets.

## Catalog changes

- **R954 — Tartary buckwheat bran flour / farine de son de sarrasin de Tartarie:** added an identity-only `FLOUR_AND_STARCH` reference for the bran-flour fraction of *Fagopyrum tataricum*. Kept it distinct from common buckwheat bran, whole Tartary buckwheat flour, unground bran, hulls, and core flour. The laboratory milling methods, sample composition, bread and noodle formulas, and study outcomes remain source-specific; no reusable measurement or substitution was added.
- **R955 — garden cress / cresson alénois:** added one `VEGETABLE_AND_AROMATIC` identity for the young leafy culinary crop of *Lepidium sativum*. Kept it separate from watercress and unresolved upland/land cress. Added only the OQLF-listed French aliases `passerage cultivée` and `nasitort`; omitted ambiguous `cresson de jardin`. Three Health Canada portions are recorded only for CNF Food Code 2084. They do not create a generic density, active unit mapping, universal sprig weight, or reusable trim yield.
- **R956 — khalpi / khalpi:** added an identity-only `SAUCE_AND_CONDIMENT` reference for the named Himalayan fermented-cucumber food, with the source-attested English spelling alias `khaipi`. Kept it separate from raw cucumber, generic cucumber pickles, gundruk, sinki, and other preserved vegetables. Study-specific preparation and fermentation details remain scoped.

No forms, recipe links, conversions, yields, or active substitutions were added. Existing entries were not deleted, renamed, merged, or generalized. Existing branded rows and product-specific evidence remain intact.

## Evidence and measurement scoping

- R954 uses three primary food studies to distinguish Tartary bran flour and document human-food use. The same 2021 paper already appears under R884-S04 for a narrow boundary on common buckwheat bran; the new R954 source record stays on the Tartary identity and does not move or generalize that evidence.
- R955 uses OQLF for the French/English terms and plant identity, Utah State University Extension for leafy culinary use, and Health Canada CNF Food Code 2084 for its measurements. The 100 mL, 250 mL, and one-sprig observations remain attached to that exact CNF food code. The CNF 29% refuse statement is source-scoped and is not turned into a general trimming rule.
- R956 uses primary fermentation studies for the named food, cucumber substrate, and spelling boundary. Experimental cultures, times, and regional preparation details are not stored as universal process requirements.

## Cross-category scope review

All three assignments addressed generic ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched or added. The queue review found no pending task whose sole deliverable is a commercial roster. The two Section F commercial cereal-roster clauses and further Anson Mills named-wheat-meal research remain out of scope because commercial-product counts do not add ingredient diversity; their generic parent gaps remain open. Existing branded records remain historical catalog data and were not deleted, merged, or used as generic evidence without a transferability review.

## Static validation

- Ingredient-reference normalization, bundled seed-package normalization/validation, and generated picker-index freshness passed.
- Research-ledger JSON Schema validation passed for **2,380 records**. The source-ID scan found no source ID assigned to conflicting URLs.
- Exact identity-ownership checks found no conflicts. Recipe-text search found **0 candidate matches across 114 bundled recipes**.
- Final totals are **1,975 ingredient references**, **205 forms**, and **2,380 ledger records**. The seed reference JSON retains escaped Unicode; UTF-8/no-BOM, proposal local links, and scoped whitespace checks passed.
- No Gradle, app, instrumentation, emulator, deployment, or software tests were run. The app data changes only add ingredient database JSON under `AGENTS.md`.

## Reviews

- [R954 Tartary buckwheat bran flour review](../../proposals/wp02-a7-generic-grain-gap-review-r954-20261019.md)
- [R955 garden cress review](../../proposals/wp03-section-k-generic-produce-gap-review-r955-20261019.md)
- [R956 khalpi review](../../proposals/wp05-section-w-generic-preserved-food-gap-review-r956-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
