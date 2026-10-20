# WP02 Section E custard-powder Québec name update — 2026-10-12

## Catalog decision

- Updated the existing `ingredient-ref-custard-powder` French display from
  `poudre à crème pâtissière` to TERMIUM's recipe-domain term `poudre à crème anglaise`.
- Retained `poudre à crème pâtissière` as a French alias for existing catalog wording and added
  `poudre pour crème anglaise` from a current Québec retailer listing.
- Kept the English display, reference ID, `FLOUR_AND_STARCH` category, recipe links, and quantities
  unchanged. The two Nanaimo recipe rows remain linked to this reference.
- Both recipes' French instructions still say `poudre à crème pâtissière`; retaining that phrase as
  an alias preserves search alignment without editing recipe text.
- Added three terminology/product-label sources and an accepted identity decision to the existing
  research-ledger record. No ingredient row, form, measure, conversion, package yield, or substitution
  was added.
- The broader Section E inventory remains open. The bundle has no requests for lecithin, glycerol,
  acids, sodium citrate, meringue powder, or dried egg products.

## Sources

Sources are attached to `ingredient-ref-custard-powder` under
`WP02-E-TECHBAKING-QC-20261012-S10`–`S12`.

- TERMIUM Plus, [custard powder, fiche 87](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=NOTABLY): recipe-domain entry with `poudre à crème anglaise` and `poudre pour faire la crème anglaise`.
- Aubut, [French baking-ingredient listing](https://www.aubut.ca/produits/epicerie-1/ingredient-patisserie-59/melange-patisserie-66): current Québec listing `Birds Poudre pour crème anglaise`.
- FoodServiceDirect Canada, [Bird's Poudre à crème anglaise originale](https://www.foodservicedirect.ca/fr-CA/bird-s-poudre---cr-me-anglaise-originale--340-g----12-par-bo-te-281491.html): product title and description for the same branded powder, including existing `poudre de crème pâtissière` wording.

## Static validation

- Package: 1,201 ingredient references, 86 forms, 114 recipes, 1,123 ingredient rows, and 66 legacy
  candidates.
- Ledger: 1,503 records, 5,075 source entries, 4,144 distinct source IDs, and 8 unit conversions.
- Package/reference normalization, generated-catalog freshness, ledger validation, alias ownership,
  recipe-link preservation, UTF-8/no-BOM, and whitespace checks passed.
- No tests or emulator checks were run because this change only updates ingredient database JSON data
  under `AGENTS.md`.

The full wording and source-boundary review is recorded in
[`wp02-section-e-technical-baking-quebec-french-review-20261012.md`](../../proposals/wp02-section-e-technical-baking-quebec-french-review-20261012.md).
