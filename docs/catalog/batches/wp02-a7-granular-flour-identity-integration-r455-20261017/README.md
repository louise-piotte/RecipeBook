# WP02 Section A7 R455 — granular flour identity integration

- **Integrated:** 2026-10-17.
- **Proposal:** [R455 granular flour identity review](../../proposals/wp02-section-a7-granular-flour-identity-review-r455-20261017.md).
- **Decision:** Add identity-only `granular flour / farine granulaire` as `ingredient-ref-granular-flour` in `FLOUR_AND_STARCH`.

## Evidence and boundary

Ardent Mills Canada’s current product pages use the exact English and French canonical names and describe the same Canadian hard-red-spring-wheat milling product. Its 2023 portfolio lists Talisman Granular separately from Farina and Wheatlets. The integration keeps the row distinct from those adjacent products and generic instant-blending flour.

- [Ardent Mills Canada — Granular Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/granular-flour/)
- [Ardent Mills Canada — Farine granulaire](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/granular-flour/)
- [Ardent Mills Canada — Flour Portfolio](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf)
- [Ardent Mills Canada — Gamme de farine](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf)

The row has no aliases, forms, measurements, density, unit mappings, conversions, recipe links, yields, or substitutions. The exact bilingual product titles are sufficient. No bundled recipe requests granular flour or its adjacent milling terms. The existing R454 `farina flour / farine farina` aliases remain on spring-wheat semolina.

## Picker effect

The picker now finds the row for `granular flour`, `farine granulaire`, `granular`, and `granulaire`. The broad `farine` result count changes from 171 to 172 and `flour` from 170 to 171 because each word occurs in a canonical name. Brand and product-family terms such as `Talisman`, `Wheatlets`, and `instant flour` remain unindexed.

## Data and verification

This integration added one reference and one ledger record with four manufacturer sources and one accepted identity decision. At the R455 integration snapshot, the package contained 1,743 references, 141 forms, 2,102 ledger records, 9,568 source entries, 8,117 distinct source IDs, and 6,830 distinct URLs. The recipe manifest remained at 114 files and 1,123 ingredient rows.

Package normalization and validation, generated-index freshness, source ownership, picker projection, and UTF-8/no-BOM checks passed. No software tests were run because this change only adds database JSON data under the `AGENTS.md` rule.
