# WP02 / WP03 / WP04 R81 integration (2026-10-13)

## Decisions

### WP02 B2 — grape-seed flour

Added identity-only `ingredient-ref-grape-seed-flour` in `FLOUR_AND_STARCH`:

- English: `grape seed flour`; alias: `grapeseed flour`
- Québec French display: `farine de pépins de raisin` (provisional); no French aliases
- No forms, density, unit mappings, recipe links, conversions, yields, or substitutions

Salute Santé sells Chardonnay and Merlot grapeseed flours and describes food uses. Naturitas Canada
lists a 400 g Ecoidees grape-seed flour made from oil-press cake, but its page said it would be back
in stock soon. Second Harvest uses the exact French compound `farine de pépins de raisin`; OQLF
supports the base term `pépin de raisin`, not the flour compound. The French display is therefore
descriptive and provisional. Grape-seed oil, whole seeds, pomace flour, and supplement preparations
remain distinct. The manufacturer’s package size and baking directions are product-specific, so no
shared measure or substitution was activated. The 114-recipe / 1,123-row corpus had no candidate
mentions or links.

### WP03 Section F — popped barley boundary

Held `popped barley` out of the existing `puffed barley / orge soufflée` aliases. The current
Canadian Expeditor listing offers Salt & Vinegar, Whiskey Tango, and Maple Cinnamon snack variants;
it does not establish a plain SKU or Québec French label. Its 50 g / approximately 1 cup statement
belongs to that package and was not added as a measure. The linked cereal-science paper uses
`popped barley` for expanded kernels but does not establish the current snack as an unflavoured
ingredient for recipe selection. Adding the alias would also broaden the current `popped` query,
which already returns popped makhana and puffed sorghum. No catalog or ledger data changed for this
hold, and no bundled recipe mentions the candidate.

### WP04 Section P — *Hyas* / toad crab boundary

Held the candidate outside active references, forms, legacy identities, and the research ledger.
CFIA lists *Hyas araneus* and *H. coarctatus* under `Toad Crab`, while TERMIUM records shared common
names and broader French use of `crabe araignée`. Exploramer’s 2022 Québec supplier directory lists
`Crabe araignée, Toad crab, Hyas sp.` without resolving species; its dated supply notes do not
establish current inventory. OQLF’s snow-crab entry documents a Québec commercial-labeling caution
for `crabe araignée`. The picker would make each unqualified candidate term appear to identify one
ingredient despite those overlaps. The 114-recipe / 1,123-row corpus has no matching demand. No
catalog or ledger data changed for this hold.

## Verification

- Active reference catalog: **1,409** identities; forms: **104**; research ledger: **1,748** records.
- The recipe corpus remains **114** files and **1,123** ingredient rows; candidate recipe demand is
  zero.
- Package and ledger validation, reference normalization, generated-index freshness, source/ID
  ownership, picker projections, UTF-8/no-BOM checks, and scoped whitespace checks passed.
- No Gradle, instrumentation, emulator, or deployment checks were run. The only active application
  data change adds database JSON identity/evidence; static package and catalog checks cover this
  batch under the updated `AGENTS.md` rule.

## Proposals and sources

- [WP02 grape-seed flour review](../../proposals/wp02-next-regional-flour-starch-review-r81-20261013.md)
- [WP03 popped-barley review](../../proposals/wp03-section-f-next-grain-review-r81-20261013.md)
- [WP04 toad-crab review](../../proposals/wp04-section-p-next-seafood-review-r81-20261013.md)
- [Salute Santé grapeseed flour](https://shop.grapeseedoil.com/products/chardonnay-grapeseed-flour)
- [Naturitas Canada grape-seed flour](https://www.naturitas.ca/catalog/product/view/id/18568/)
- [Second Harvest, `farine de pépins de raisin`](https://www.secondharvest.ca/fr-ca/post/flour-power)
- [OQLF, `pépin de raisin`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3695867/pepin-de-raisin)
- [Expeditor Dry Goods, Popped Barley](https://expeditordrygoods.com/products/popped-black-barley)
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on%2F1000&cmbIn=e&lang=e&q=crab)
- [TERMIUM Plus, *Hyas* common names](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&index=frr&lang=fra&srchtxt=AUSSI)
- [Exploramer, 2022 supplier directory](https://exploramer.qc.ca/wp-content/uploads/2022/10/22.09.30-Repertoire-des-fournisseurs-2022.pdf)
- [OQLF, `crabe des neiges`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198901/crabe-des-neiges)
