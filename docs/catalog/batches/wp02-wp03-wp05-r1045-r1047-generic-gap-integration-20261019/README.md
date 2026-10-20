# WP02/WP03/WP05 R1045–R1047 generic-gap integration

**Date:** 2026-10-19

**Scope:** Generic ingredient diversity across grain milling, produce parts, and preserved foods.

**Result:** Two identity-only generic references added; one lab-specific milling subdivision held.

## Decisions

- **R1045 — hold fine triticale bran.** A 2024 milling study separates fine and coarse bran under one laboratory system, while separate food-use studies use triticale bran generally. The reviewed evidence does not establish a transferable consumer-grade fine-bran identity. Preserve `ingredient-ref-triticale-bran`, its existing six source records, and neighboring triticale milling identities. No new candidate, source, or ledger record was allocated.
- **R1046 — add radish microgreens / micropousses de radis.** The identity covers young aerial shoots of cultivated radish (*Raphanus sativus*) grown and harvested as a microgreen crop. It remains separate from mature roots, daikon, radish leaves, water-grown germinations, and other crop-specific shoots. No aliases, forms, reusable measures, recipe links, conversions, yields, or substitutions were added.
- **R1047 — add miso-zuke vegetables.** The identity is `miso-zuke (salted vegetables pickled in miso) / miso-zuke (légumes salés puis marinés au miso)`, with a provisional descriptive French display. Keep it distinct from miso as an ingredient, rice-bran pickles, and individually named preserves. Do not generalize the MAFF page’s general vegetable-salting percentage. No aliases, forms, reusable measures, recipe links, conversions, yields, or active substitutions were added.

## Cross-category brand and product scope

The active plan scan found no newly queued brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task. The Section F commercial cereal rosters and the previously reviewed Anson Mills, Nu Life Market, and Dempsey product-only leads remain out of scope because commercial-product counts do not add ingredient diversity. No additional commercial research was done. Existing branded reference rows and source records were preserved; no named-product claim or measurement was generalized. Open references to brands/formulation in the measurement section remain evidence-scoping safeguards, and open compound-ingredient and cereal parents remain generic diversity work. See the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md).

## Static verification

- Reference JSON normalized and checked; bundled package normalization check passed.
- Generated ingredient catalog is current at **2,055 references**.
- Research ledger validation passed with **2,460 records**, **11,488 source entries**, and **9,648 distinct source IDs**; each new reference and each of the five new source IDs has one exact owner.
- The package has **205 forms**, **55 legacy-import candidates**, and **114 manifest-listed recipes / 1,123 ingredient rows**. Whole-package candidate-term scanning found no recipe hits for the two additions.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, or emulator run was needed: the application changes only add database JSON, as allowed by `AGENTS.md`.

## Review packets

- [R1045 fine-triticale-bran boundary review](../../proposals/wp02-next-generic-milling-gap-review-r1045-20261019.md)
- [R1046 radish-microgreens identity review](../../proposals/wp03-section-k-radish-microgreens-identity-review-r1046-20261019.md)
- [R1047 miso-zuke preserve review](../../proposals/wp05-section-w-generic-misozuke-vegetable-preserve-review-r1047-20261019.md)

Sections A7, K, and W remain open for generic ingredient diversity and evidence gaps.
