# WP02 A7 R434 / WP04 Section P R435 / WP06 Europe R436 integration

Integrated on 2026-10-17 after root review of [R434](../../proposals/wp02-section-a7-next-milling-gap-review-r434-20261017.md), [R435](../../proposals/wp04-section-p-crab-claws-product-identity-review-r435-20261017.md), and [R436](../../proposals/wp06-europe-pecorino-romano-identity-review-r436-20261017.md).

## Decisions

- **R434 — rye grits:** keep `rye grits` / `rye grit` unallocated. Statistics Canada and a current U.S. mill support the product concept, but no current Canadian/Québec source supplies a product-matched French name and milling boundary distinct from cracked rye and rye meal. Preserve `seigle concassé` on cracked rye and `gruau de seigle` / `semoule de seigle` on rye meal. No active row, alias, candidate, source entry, form, measurement, recipe link, conversion, yield, or substitution was added.
- **R435 — crab claws:** add identity-only `crab claws / pinces de crabe` as `ingredient-ref-crab-claws` in `PROTEIN`. Keep intact claws separate from crab meat and picked claw meat, crab cakes, imitation products, legs, and species identities. The ledger records identity verification, `researched_no_supported_value` for measurements, and `researched_no_supported_substitute` for substitutions. No form, alias, recipe link, default density, unit mapping, measurement observation, conversion, package yield, or substitution rule was added.
- **R436 — Pecorino Romano PDO:** add `Pecorino Romano AOP / Pecorino Romano PDO` as `ingredient-ref-pecorino-romano-pdo` in `CHEESE`, with `Pecorino Romano DOP` as the only French and English alias. Keep generic pecorino, Sardo, Siciliano, Toscano, unqualified Romano-labelled products, and Parmesan distinct. Measurement research is `researched_no_supported_value`; substitution research remains `not_yet_researched`. Add no form, density, mapping, observation, conversion, package yield, recipe link, or substitution rule.

## Catalog and picker effects

- Active references: **1,731**, up from 1,729. Ingredient forms remain at **141**.
- The ledger contains **2,090 records**, **9,483 source entries**, **8,035 distinct source IDs**, and **6,751 distinct URLs**. R435 adds five source IDs and reuses four source records already in the ledger; R436 adds six source IDs and reuses the existing OQLF pecorino entry.
- The bundle remains **114 recipes / 1,123 ingredient rows**. Neither new identity has matching recipe demand; no recipe line was changed.
- `crab claws`, `crab claw`, and `pinces de crabe` select the crab-claws identity. The broad `crab` / `crabe` projection grows from eight to nine results.
- `Pecorino Romano`, `Pecorino Romano AOP`, `Pecorino Romano PDO`, and `Pecorino Romano DOP` select the new PDO identity. `pecorino` now returns the generic family and the PDO identity; `Romano` selects the PDO row through its registered display name. `cheese` / `fromage` results remain unchanged.
- The R434 hold adds no `grits` or `rye` result and preserves existing rye-meal and cracked-rye ownership.

## Validation

- Bundled seed package normalization and validation passed; the ingredient-reference normalizer reports no pending changes.
- Research-ledger schema validation passed with no errors. The two new ledger records use source IDs present on their records, and the new source IDs and non-reused URLs do not collide with existing entries.
- The generated `BundledIngredientCatalog.kt` index is current at **1,731 references**.
- Exact bilingual name and alias ownership checks passed. A full scan of all 114 manifest-listed recipes and 1,123 ingredient rows found no `crab claws`, `pinces de crabe`, or Pecorino Romano match.
- UTF-8/no-BOM, escaped-Unicode JSON, proposal/plan links, and scoped whitespace checks passed.
- No app tests, builds, emulator checks, or deployment were run because this integration only adds database JSON data and documentation, under `AGENTS.md`.

WP02 A7, WP04 Section P, and WP06 Europe remain open for their other regional and product-identity gaps.
