# WP02 / WP03 / WP04 R83 integration (2026-10-13)

## Decisions

### WP02 B2 — defatted poppy-seed flour

Added identity-only `defatted poppy seed flour / farine de pavot déshuilée` for food flour made
from defatted poppy-seed press cake. The French display is provisional for Québec: the reviewed
French-language product page is from a French seller, while OQLF supports the base culinary seed
term but does not name this flour. Whole seeds, oil, and composite poppy-seed filling stay separate.
No aliases, forms, measurements, conversions, yields, recipe links, or substitutions were added.

### WP03 Section F — sprouted millet

Added identity-only `sprouted millet / millet germé` for a single-ingredient whole grain that is
sprouted and dried back to shelf-stable moisture. The millet species is unspecified. Two Québec
French ingredient declarations support `millet germé`; neither is a standalone sprouted-millet
product label. No aliases, forms, measurements, conversions, yields, recipe links, or active
substitutions were added.

### WP04 Section P — barracuda

Added identity-only `barracuda / barracuda` for the *Sphyraena* market group. The French display
uses the OQLF-preferred Québec term. `bécune`, `sennet`, the seller term `seudd`, and species-level
names are not aliases. The Montréal seller's listing does not identify a species. No aliases,
forms, measurements, conversions, yields, recipe links, or substitutions were added.

## Verification

- Inventory is now **1,412 references, 104 forms, 1,751 research-ledger records, and 63 legacy
  candidates**.
- The manifest remains **114 recipes / 1,123 ingredient rows**; none of the three candidates has
  a bundled recipe match.
- Fifteen new source IDs were added to the ledger. The existing OQLF generic-millet source ID was
  reused for the sprouted-millet decision; no duplicate evidence record was added.
- Seed-package validation, ingredient-reference normalization, generated-index freshness, ledger
  schema, ID/source ownership, picker projections, recipe scans, UTF-8/no-BOM, local-link, and
  changed-file whitespace checks passed.
- No app tests, Gradle tasks, instrumentation, or emulator checks were run. The application data
  changes only add database JSON data, as directed by the current `AGENTS.md` rule.

## Proposals and sources

- [WP02 defatted poppy-seed flour review](../../proposals/wp02-b2-poppy-seed-flour-identity-review-r83-20261013.md)
- [WP03 sprouted millet review](../../proposals/wp03-section-f-next-grain-review-r83-20261013.md)
- [WP04 barracuda market-group review](../../proposals/wp04-section-p-barracuda-market-group-review-r83-20261013.md)
- [Adal Terra, poppy flour](https://adalterra.bio/farines/262-567-farine-bio-de-pavot.html)
- [Proper Foods, defatted poppy-seed flour](https://www.properfoodsgroup.com/nut-seed-flours)
- [Second Spring Foods, organic sprouted millet](https://secondspringfoods.com/product/organic-sprouted-millet/)
- [La Milanaise, nine-grain sprouted blend](https://lamilanaise.com/produits/melange-9-grains-germes-biologique/)
- [OQLF, `barracuda`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199023/barracuda)
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp)
- [GuineaSea, barracuda listing in French](https://guineasea.com/fr/products/fresh-barracuda)
