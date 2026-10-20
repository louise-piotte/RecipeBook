# WP02 A7 rye-groats hold (R540)

Date: 2026-10-17

## Decision

Keep `rye groats` and `rye groat` unallocated. Current Canadian product listings distinguish whole rye kernels, cut or cracked rye, rolled rye, and rye flour, but do not establish a separate rye-groats product or its Québec French name. The 2026 CBSA tariff defines groats for a customs classification by cereal-grain fragmentation and sieve size; this is not a retail product specification. The Canadian Grain Commission definition of groats is explicitly about oat kernels. Neither source establishes a rye-specific identity or Québec display.

Keep `grains de seigle` on rye berries, `seigle concassé` on cracked rye, and `gruau de seigle` / `semoule de seigle` on rye meal. Add no row, aliases, ledger candidate, form, measure, recipe link, conversion, yield, or substitution. The bundle has no matching recipe demand. Reopen only with a current Canadian or Québec human-food product that defines its rye-groats state and supplies product-matched French wording.

## Integration

- No catalog, form, research-ledger, legacy-identity, or recipe JSON changed.
- Added this hold under the still-open WP02 A7 checklist parent and recorded R540 in `roadmap.md`.
- Source and picker boundaries are detailed in the [R540 proposal](../../proposals/wp02-section-a7-next-milling-gap-review-r540-20261017.md).
- The proposal archive was searched for an existing rye-groats disposition; adjacent rye-grits, rye-semolina, rye-meal, and rye-flakes reviews have separate scopes.
- The 114-recipe / 1,123-row corpus scan found no matching demand.

## Verification

Reviewed the current [Canadian rye product listing](https://www.basicgrain.ca/products), the [Québec whole-rye product listing](https://comptoirstvrac.com/product/2087), the [2026 CBSA Chapter 11 tariff](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html), the [Canadian Grain Commission oat grading definition](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/07-oats/grading-factors.html), and OQLF's [food sense of `gruau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau) and [milling sense of `gruau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau). These sources support keeping current names separate and do not support a new rye-groats row.

This was a documentation-only hold with no application or database JSON change, so no tests, build, emulator run, or deployment were needed.
