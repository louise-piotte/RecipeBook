# WP02/WP03/WP04 R701–R703 integration — 2026-10-18

This batch closes three focused follow-ups while leaving the A7, Section F, and Section P parent reviews open.

## Decisions

- **R701 — Wheatlets measurement review:** kept `ingredient-ref-wheatlets` at `measurementState: researched_no_supported_value`. Ardent Mills code 10287's 20 kg commercial package is not a household measure, and the wheat-middlings application note gives no named replacement or ratio. No observation, source ID, density, mapping, form, yield, or substitution was added. See the [R701 proposal](../../proposals/wp02-a7-wheatlets-measurement-review-r701-20261018.md).
- **R702 — pot barley Québec display:** approved the existing `pot barley / orge en pot` display as market-attested wording, not OQLF-preferred wording. The French alias list remains empty; `orge mondé` and `orge perlé` stay with hulled and pearl barley. See the [R702 proposal](../../proposals/wp03-section-f-pot-barley-quebec-display-review-r702-20261018.md) and [pot-barley boundary note](../pot-barley-boundary-review.md).
- **R703 — imitation crab:** added identity-only `imitation crab / similicrabe`, category `PROTEIN`, as `ingredient-ref-imitation-crab`. Added English alias `imitation crab meat` and French aliases `imitation crabe`, `simili-chair de crabe`, and `simili-crabe`. Reused the existing OQLF GDT and CFIA source IDs; added three source records for OQLF spelling guidance and current Metro/Provigo wording. See the [R703 proposal](../../proposals/wp04-section-p-imitation-crab-product-class-boundary-review-r703-20261018.md).

The imitation-crab row has null density and no unit mappings, forms, recipe links, measurement observations, package yields, conversions, or substitution rules. Exact `crab meat` and `chair de crabe` queries intentionally show both actual crab meat and imitation crab under their distinct labels. Raw surimi, crab-flavoured pollock flakes, surimi sticks, fish balls, fish tofu, chikuwa, kamaboko, and fish cakes remain separate. The recipe bundle had no matching imitation-crab ingredient lines.

## Resulting data

- Bundled catalog: **1,840 references**, 173 forms, 114 recipes, and 1,123 ingredient rows.
- Research ledger: **2,222 records**, 10,413 source entries, 8,785 distinct source IDs, and 7,434 distinct source URLs.
- Generated `BundledIngredientCatalog.kt` was refreshed from the canonical reference JSON.

## Checks

- Seed package normalization and data validation: passed; the package is normalized and valid.
- Generated catalog freshness: passed at 1,840 references.
- Research-ledger validation passed. The exact search projection returned one imitation-crab row for all exact class terms, two clearly labelled rows for `crab meat` / `chair de crabe`, 13 broad `crab` / `crabe` matches, and unchanged surimi and pollock-flake results.
- Database JSON remained UTF-8 without BOM and stored accents as `\u` escapes; scoped relative links resolved and `git diff --check` passed for this batch.
- No software tests, build, emulator run, or deployment were performed for this database-JSON addition under `AGENTS.md`.

See the [catalog workflow](../../ingredient-catalog-workflow.md), [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt), and the R701–R703 plan checklist entries for ongoing work.
