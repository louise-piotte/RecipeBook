# R381 pregelatinized sorghum-flour boundary hold

Integrated 2026-10-16 under the open WP02 Section 04 B3 whole-root flour versus extracted-starch and raw versus pregelatinized/precooked checklist.

## Decision

Keep Nu Life Market’s UltraLIFT outside active forms and aliases until a product-matched Québec French name is supported. Treat it as a possible process-specific form under the existing `ingredient-ref-sorghum-flour`; do not create a separate starch identity. Dempsey Food’s current market page lists UltraLIFT as pregelatinized sorghum flour in its Canada bakery result. The hold is limited to the bilingual product name, not Canadian-market evidence. Keep the existing `sorghum flour / farine de sorgho` and `sorghum starch / amidon de sorgho` owners unchanged.

No reference, alias, form, ledger candidate, measure, density, mapping, recipe link, conversion, yield, or substitution was added. The existing flour and extracted-starch records remain untouched. The broader B2/B3 review stays open; the [R381 proposal](../../proposals/wp02-b2-b3-pregelatinized-sorghum-flour-boundary-review-r381-20261016.md) contains the source register, evidence limits, ownership review, and picker boundary.

## Review checks

- Confirmed the Canadian-market wording on [Dempsey Food’s markets page](https://www.dempseyfood.com/markets): UltraLIFT is listed in the Canada bakery result as pregelatinized sorghum flour. The page is a market listing, not proof of inventory, retail availability, or Québec sale.
- Rechecked the [Nu Life product page](https://nulifemarket.com/gf/ultralift-flour/), its [brochure](https://nulifemarket.com/wp-content/uploads/2023/02/nlm_brochure-pages.pdf), and the source limits summarized in the proposal. None supplies product-matched Québec French wording.
- No UltraLIFT or pregelatinized-sorghum-flour owner was found in active references, forms, legacy-import identities, or the ledger. The five proposal-local source IDs are unique; the five new source URLs are distinct and unregistered. Existing Québec sources reuse their original IDs.
- Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows (753,988 recipe-file bytes): zero candidate-phrase file hits, ingredient-row hits, or direct links to the sorghum-flour or sorghum-starch references.
- UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests, build, emulator, or deployment checks were run because this change only records a documentation-only hold under `AGENTS.md`.
