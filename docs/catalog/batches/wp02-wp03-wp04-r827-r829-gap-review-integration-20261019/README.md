# WP02/WP03/WP04 R827–R829 gap review integration — 2026-10-19

## Scope and disposition

Reviewed and integrated three proposal-only evidence reviews. The broader WP02 Section A7, WP03 Section F, and WP04 Section P coverage remains open.

- **R827 — precooked corn flour:** recorded one P.A.N. U.S. manufacturer-label serving of 3 Tbsp. (30 g) for the named 1 kg pre-cooked white-corn product on the existing precooked-corn-flour ledger row. The observation is product-specific; the label does not supply a SKU/GTIN, spoon method, or metric volume. No generic measure, density, conversion, package yield, recipe link, or substitution was added.
- **R828 — common millet:** recorded CNF 2015 Food Code 4491’s 46.0 g and CNF 2026 Food Code 4491’s 46.04 g as separate dry-input-to-stated-125-mL relations. The CNF 2026 joined row identifies Measure Code 921 as “amount to make 125ml”; CFIA’s general guidance supports only the direction. The editions were not compared or averaged. No method, output mass, cooked form, density, or active conversion was inferred.
- **R829 — blue crab:** recorded one historical CNF 2015 Food Code 3096 portion, 1 crab (150 g) = 23.1 g, on the existing species-specific blue-crab ledger row. CNF’s total refuse 86% remains separately reported source context; the values were not reconciled and no yield was calculated. CNF 2026 row contents remain unverified.

## Data and catalog effects

The research ledger is the only database JSON file changed. It now has **2,294 records**, **10,788 source entries**, **9,080 distinct source IDs**, **7,717 distinct source URLs**, **861 measurement observations**, and **361 substitution findings**. Five source entries and four observations were added. Two existing common-millet CNF source descriptions were expanded in place; the R828 observations use the existing R547 CNF 2015/2026 evidence IDs and one new CFIA source ID. No source ID maps to conflicting URLs, and no observation or finding ID is duplicated.

The bundled catalog remains at **1,886 references and 199 forms**. No active reference, form, alias, generated index, density, unit mapping, conversion, package yield, recipe link, or substitution rule changed. The package remains at **114 recipes** and **1,123 structured ingredient rows**, including **1,097** with an `ingredientRefId`; no recipe file changed.

## Static validation

- Research-ledger JSON Schema validation passed with zero errors. Source-ID/URL integrity and observation/finding-ID uniqueness checks passed.
- Verified P.A.N.’s current U.S. nutrition label and product-family description, CNF 2015 Food Code 4491 and 3096 pages, CNF 2026 common-millet rows preserved in the R547 source records, CFIA further-preparation direction, and the CNF 2015/2026 access limitation for blue crab. No new CNF 2026 blue-crab row claim is made.
- The seed package and generated ingredient index were unchanged. JSON remains UTF-8 without BOM and ASCII-escaped; a stable-format round-trip check passed. Proposal, integration, plan, roadmap, and workflow local links were checked, as were scoped whitespace and mojibake checks.
- No software tests, app build, emulator run, or deployment were performed. Under the updated `AGENTS.md` rule, the active database changes add research JSON data only.

See the [R827 proposal](../../proposals/wp02-section-a7-next-gap-review-r827-20261019.md), [R828 proposal](../../proposals/wp03-section-f-next-gap-review-r828-20261019.md), and [R829 proposal](../../proposals/wp04-section-p-next-gap-review-r829-20261019.md).
