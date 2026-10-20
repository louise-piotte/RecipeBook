# WP02/WP03/WP05 R1048–R1050 generic-gap integration

**Date:** 2026-10-19

**Scope:** Generic grain milling, edible roots, and preserved foods.

**Result:** Three identity-only generic ingredient references added.

## Decisions

- **R1048 — add wheat aleurone flour / farine d’aleurone de blé.** The identity is limited to flour made from the isolated aleurone fraction of wheat. Keep it distinct from wheat bran, wheat bran flour, wheat germ, whole-wheat flour/meal, and aleurone from other cereals. The French display is descriptive and provisional. Human-food study servings, bread formulas, compositions, and outcomes remain source-specific. Add no aliases, forms, measurements, conversions, yields, recipe links, or substitutions.
- **R1049 — add parsley root / persil-racine.** The identity covers the enlarged edible root of root-grown parsley (*Petroselinum crispum*). Use the OQLF-attested qualified English and French synonyms only. Preserve leaf parsley, dried parsley, parsnip, and celeriac owners. Add no forms, measures, recipe links, conversions, yields, or substitutions.
- **R1050 — add koji-zuke (vegetables pickled with koji).** Keep the identity vegetable-only, with a provisional descriptive French display. Distinguish it from shio-koji seasoning, miso-zuke, nukazuke, and individually named preserves. The MAFF general vegetable-salting percentage and the NIBN small-oval eggplant example are source-specific; neither becomes a class-wide value. Add no aliases, forms, measures, recipe links, conversions, yields, or active substitutions.

## Source ownership and commercial scope

Ten new source IDs were added to the three new ledger records. The MAFF classification and NIBN food-list URLs are also cited by R1047 miso-zuke. R1050 uses separate locators and source IDs with claims limited to koji-zuke; the R1047 source records and claims remain unchanged.

The active plan scan found no new brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task. The remaining open brand/formulation mentions are measurement and evidence safeguards, while open compound-ingredient and cereal parents remain generic coverage work. Previously dispositioned cereal rosters and the Anson Mills, Nu Life Market, and Dempsey product-only leads remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific evidence were preserved; no commercial roster or product-specific measurement was researched or generalized. See the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md).

## Static verification

- Ingredient references normalized and checked; the bundled seed package normalization check passed.
- Generated ingredient catalog is current at **2,058 references**.
- Research-ledger validation passed with **2,463 records**, **11,498 source entries**, and **9,658 distinct source IDs**. Each new reference and all ten new source IDs have one exact owner.
- The package has **205 forms**, **55 legacy-import candidates**, and **114 manifest-listed recipes / 1,123 ingredient rows**. Candidate-term scans found no recipe hits for these additions.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, or emulator run was needed: the application changes only add database JSON, as allowed by `AGENTS.md`.

## Review packets

- [R1048 wheat-aleurone-flour identity review](../../proposals/wp02-next-generic-milling-gap-review-r1048-20261019.md)
- [R1049 parsley-root identity review](../../proposals/wp03-section-j-parsley-root-identity-review-r1049-20261019.md)
- [R1050 koji-zuke preserve review](../../proposals/wp05-section-w-generic-koji-zuke-vegetable-preserve-review-r1050-20261019.md)

Sections A7, J, and W remain open for generic ingredient diversity and evidence gaps.
