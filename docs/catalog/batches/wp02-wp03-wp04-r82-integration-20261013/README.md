# WP02 / WP03 / WP04 R82 integration (2026-10-13)

## Decisions

### WP02 B2 — unqualified coffee flour

Held the unqualified `coffee flour` key outside active references, aliases, forms, and the research
ledger. A Canadian storefront describes its `Coffee Flour` as made from coffee cherry, while a
separate manufacturer sells par-baked, milled coffee-bean flour. Québec terminology distinguishes
the fruit (`cerise de café`) from its dried seed (`grain de café`), and the Canadian French phrase
`farine de café` is used for coffee-cherry pulp flour without supplying a Québec product label or
specification. Those findings do not support one unqualified bilingual catalog identity. Keep
coffee-cherry and coffee-bean products separate from one another and from brewed, instant, ground,
and whole-bean coffee. The 114-recipe / 1,123-row corpus has no flour demand; its existing three
coffee-related recipe lines remain unchanged. No database JSON changed.

### WP03 Section F — black-rice flakes

Held black-rice flakes / black-rice poha outside the active catalog. Two India-market listings
describe black-rice flake products, including a Karuppu Kavuni SKU, but no Canadian or Québec French
product name was verified. Do not transfer the intact-grain display `black rice / riz noir` to the
processed flakes or add color-specific wording to generic flattened rice. The corpus has no matching
recipe demand. No database JSON changed.

### WP04 Section P — golden tilefish

Held golden tilefish (*Lopholatilus chamaeleonticeps*) outside active references and the ledger.
OQLF supports the species-specific pair `golden tilefish / tile`; CFIA also assigns the unqualified
names `Tilefish / Tile` to other taxa. The current picker would make broad `tilefish` and `tile`
queries return this species alone. A dated Québec supplier arrival list uses `tile de mer`, which
OQLF says was not retained by the fish-product terminology committee. The 114-recipe / 1,123-row
corpus has no matching demand. No database JSON changed.

## Verification

- Post-R81 inventory remains **1,409 references, 104 forms, 1,748 research-ledger records, and 63
  legacy candidates**.
- The manifest remains **114 recipes / 1,123 ingredient rows**; all three reviewed candidates have
  zero recipe matches.
- Proposal reviews checked exact ownership, archive overlap, source scope, current picker behavior,
  and candidate demand. Source IDs used by proposals remain local because no ledger evidence record
  was accepted.
- All three proposals and this README pass UTF-8/no-BOM, final-newline, whitespace, and local-link
  checks.
- No Gradle, instrumentation, emulator, or deployment checks were run. R82 is documentation-only
  and adds no database JSON or application logic.

## Proposals and sources

- [WP02 coffee-flour boundary review](../../proposals/wp02-b2-coffee-flour-product-boundary-hold-r82-20261013.md)
- [WP03 black-rice-flakes review](../../proposals/wp03-section-f-black-rice-flakes-review-r82-20261013.md)
- [WP04 golden-tilefish picker review](../../proposals/wp04-section-p-golden-tilefish-picker-boundary-review-r82-20261013.md)
- [Buy Coffee Canada, Coffee Flour](https://buycoffeecanada.com/products/coffee-flour)
- [JavaPower Coffee Bean Flour](https://www.coffeebeanflour.com/)
- [Second Harvest, `farine de café`](https://www.secondharvest.ca/fr-ca/post/flour-power)
- [Ulamart, black-rice flakes](https://www.ulamart.com/flakes-black-rice)
- [Freshly Ground Foods, black-rice flakes](https://freshlygroundfoods.com/products/black-rice-flakes-poha-karuppu-kavuni-aval-200g)
- [OQLF, `tile`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198904/tile)
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp)
- [Poissonnerie La Mer, April 28, 2026 arrival list](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_28-04-2026.pdf?v=1777318537)
