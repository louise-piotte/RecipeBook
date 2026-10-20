# WP02/WP03/WP04 R830–R832 gap review integration — 2026-10-19

## Scope and disposition

Reviewed and integrated three evidence proposals. Broader WP02 Section A7, WP03 Section F, and WP04 Section P work remains open.

- **R830 — barley flour:** recorded Bob’s Red Mill’s 50% guidance for replacing part of recipe whole-wheat flour as a narrow source-scoped substitution finding on the existing barley-flour ledger row. The guide does not say whether the percentage is by weight or volume, name a recipe or flour grade, or provide hydration adjustments. The broader study-based block remains; no active substitution rule, conversion, or recipe link was added.
- **R831 — dry white rice:** recorded CNF 2015 Food Code 4471’s 35.3 g and CNF 2026 Measure Code 921’s 35.29 g as separate inputs to the stated 125 mL prepared-product amount. CFIA guidance supports the direction only. The editions were not compared or averaged; no method, output mass, cooked form, or active conversion was inferred. The CNF 2026 row evidence is carried forward from R553; its CSV files were not freshly retrieved for R831.
- **R832 — cuttlefish:** recorded one CNF 2015 Food Code 3114 portion, 1 food guide serving = 90.0 g, for raw mixed-species cuttlefish. The page’s blank Refuse fields mean no value was reported, not zero. Species, cleaning state, cut, and roe inclusion remain unspecified; CNF 2026 was not checked.

## Data and catalog effects

The research ledger is the only database JSON file changed. It now has **2,294 records**, **10,792 source entries**, **9,082 distinct source IDs**, **7,718 distinct source URLs**, **864 measurement observations**, and **362 substitution findings**. Four source entries and three measurement observations were added; one substitution finding was added. R830 reuses the Bob’s Red Mill PDF source ID already registered for teff flour. R832 reuses the CNF users’ guide source ID already registered for blue crab. No source ID maps to conflicting URLs, and no observation or finding ID is duplicated.

The active catalog remains at **1,886 references and 199 forms**. No active reference, form, alias, generated index, density, unit mapping, conversion, package yield, recipe link, or substitution rule changed. The bundle remains at **114 recipes** and **1,123 structured ingredient rows**, including **1,097** with an `ingredientRefId`; no recipe file changed.

## Static validation

- Research-ledger JSON Schema, source-ID/URL integrity, local source ownership for the new measurement observations and substitution finding, and observation/finding-ID uniqueness checks passed.
- Verified the official [Bob’s Red Mill alternative-flour sheet](https://docs.bobsredmill.com/document-center/how-to-use-our-products-top-1/5906-baking-with-alternative-flours-info-sheet/file), [CNF 2015 Food Code 3114](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3114), CNF 2015 portion guidance, CFIA further-preparation guidance, and the official CNF 2026 access statement. CNF 2026 Food Code 4471 evidence remains the row data and hashes recorded in R553; Food Code 3114 in CNF 2026 remains unchecked.
- The bundled catalog, generated index, and recipe corpus were unchanged. JSON remains UTF-8 without BOM and ASCII-escaped; stable-format round-trip, local-link, mojibake, and scoped whitespace checks passed.
- No software tests, app build, emulator run, or deployment were performed. Under `AGENTS.md`, database-JSON-only changes need no software tests.

See the [R830 proposal](../../proposals/wp02-section-a7-next-gap-review-r830-20261019.md), [R831 proposal](../../proposals/wp03-section-f-next-gap-review-r831-20261019.md), and [R832 proposal](../../proposals/wp04-section-p-next-gap-review-r832-20261019.md).
