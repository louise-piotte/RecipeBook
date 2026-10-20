# WP02 A7 R440 / WP04 Section P R441 / WP06 Europe R442 integration

Integrated on 2026-10-17 after root review of [R440](../../proposals/wp02-section-a7-emmer-semolina-identity-review-r440-20261017.md), [R441](../../proposals/wp04-section-p-coconut-butterfly-shrimp-product-boundary-review-r441-20261017.md), and [R442](../../proposals/wp06-europe-ossau-iraty-pdo-cheese-identity-review-r442-20261017.md).

## Decisions

- **R440 — emmer semolina:** added identity-only `emmer semolina / semoule de blé amidonnier` as `ingredient-ref-emmer-semolina` in `FLOUR_AND_STARCH`, with no aliases. Reused the existing DND and OQLF source IDs in the ledger decision and added the direct True Grain and Anson Mills sources. Kept emmer flour and grain, farro flour and grain, and other semolina identities separate. No form, measure, conversion, yield, recipe link, or substitution was added.
- **R441 — coconut butterfly shrimp:** added identity-only `coconut butterfly shrimp / crevettes papillon à la noix de coco` as `ingredient-ref-coconut-butterfly-shrimp` in `PROTEIN`, with only the English and French tail-on product-name aliases. Reused R438's existing OQLF, CFIA, and Metro source IDs without duplicating their source entries. Kept regular breaded butterfly shrimp, generic coconut shrimp, and shrimp species separate. No form, measure, conversion, yield, recipe link, or substitution was added.
- **R442 — Ossau-Iraty PDO:** added identity-only `Ossau-Iraty AOP / Ossau-Iraty PDO` as `ingredient-ref-ossau-iraty-pdo` in `CHEESE`, with the exact current Québec retailer spelling `Ossau-Iraty, A.O.P.` as the sole alias in each language. Kept sheep milk and other sheep, Basque, Pyrenean, and protected cheese identities separate. No form, measure, conversion, yield, recipe link, or substitution was added.

## Catalog and picker effects

- Active references: **1,736**, up from 1,733. Ingredient forms remain **141**.
- The research ledger contains **2,095 records**, **9,513 source entries**, **8,063 distinct source IDs**, and **6,779 distinct source URLs**. The batch adds three records and thirteen new source IDs; existing DND, OQLF, CFIA, and Metro evidence is referenced by its existing source ID.
- The bundle remains **114 recipes / 1,123 ingredient rows**. The full manifest scan in each proposal found no candidate-specific recipe demand; no recipe lines changed.
- R440 makes `emmer semolina` and `semoule de blé amidonnier` exact picker results. Broad `emmer` and `semolina` searches each gain one result; bare `farro` remains unchanged.
- R441 makes the exact bilingual product names and tail-on variants selectable. `butterfly shrimp` and `crevettes papillon` return both the regular breaded and coconut product identities; `papillon` returns those two plus moth beans. `shrimp` grows from six to seven results. Generic `coconut shrimp` and `crevettes à la noix de coco` remain unmatched.
- R442 makes `Ossau`, `Iraty`, and the qualified product name exact results. `AOP` grows from six to seven results and `PDO` from four to five. Generic sheep-milk and cheese queries keep their existing scope.

## Validation

- Bundled seed package normalization and validation completed with zero package-part changes.
- Research-ledger validation passed with no errors. The generated `BundledIngredientCatalog.kt` index contains **1,736 references**.
- The recipe corpus is unchanged at **753,988 bytes**, with manifest-order fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`.
- New ingredient-reference strings are stored as escaped Unicode. The edited JSON and generated index are UTF-8 without BOM.
- Search-boundary assertions now cover the three new identities and R441's broader picker results. The database JSON additions needed no separate test run; the broader Android changes were verified by the unit and instrumentation suites.

## Snapshot hashes

- References: `68a7b6fe122964f43ce1a206b9f10be3ed69b1a64cf5bc79662b29a73a3df9fd`
- Forms: `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed`
- Research ledger: `ac0327aaf44fe111ac8e0d2ed770183c396bf1c11f1e0765b6647c6993097d93`
- Generated Kotlin index: `d4aac9d18e5759b6aeaf129876ffbf4168fc9a19d1597a495c1dd689ccf42c99`

WP02 A7, WP04 Section P, and WP06 Europe remain open for their other milling, seafood, and regional-identity gaps.
