# WP02 B2 R319 Besan and gram-flour aliases

Integrated the bounded naming review in the [R319 proposal](../../proposals/wp02-b2-besan-gram-flour-alias-boundary-review-r319-20261016.md).

## Data changes

- Added `besan`, `besan flour`, and `gram flour` as English search aliases, plus the retailer-attested French search alias `farine de besan`, to the existing generic chickpea-flour reference.
- Added the qualified English alias `desi besan` to the existing Desi chickpea-flour reference.
- Kept chana sattu and all its aliases unchanged. `gram flour` returns both generic chickpea flour and chana sattu because the latter already owns `roasted Bengal gram flour`.
- Added seven new source records and accepted naming decisions to the three existing ledger records. Cambridge and Norwegian food-table sources remain under their earlier modified-potato-starch ledger record and were reused by ID, not duplicated.
- Changed no display names, categories, recipe links, forms, numeric observations, densities, mappings, conversions, yields, or substitutions. The R284 manufacturer portions and CNF 4886 values remain scoped to their original products/code.
- No bundled recipe text, ingredient rows, or links matched the reviewed names in 114 recipe files / 1,123 ingredient rows.

## Evidence and limits

FSSAI distinguishes Besan made from dehusked Bengal gram from Chana Sattu made from roasted gram; its Besan provision does not expressly prohibit prior heating. Current Indian and Canadian product pages support Besan/gram flour as chickpea-flour wording, with product-specific limits. The exact `Desi Besan` alias is supported by an Ontario product title and description, without an inferred milling process. Metro's `farine de besan` title is used only as a retailer search phrase: the listing was out of stock and redirected to English when checked. It is not presented as a Québec-preferred French term.

The picker projection was checked against the phrase-first behavior in `IngredientSearch.kt`:

| Query | Result after integration |
|---|---|
| `besan` | Generic chickpea flour; Desi chickpea flour |
| `besan flour` | Generic chickpea flour |
| `gram flour` | Generic chickpea flour; chana sattu |
| `desi besan` | Desi chickpea flour |
| `farine de besan` | Generic chickpea flour |
| `chickpea flour` | Existing generic, Desi, and chana sattu results |
| `farine de pois chiche` | Existing generic result |
| `farine de pois chiches` | Existing generic, Desi, and chana sattu results |
| `roasted Bengal gram flour` | Existing chana sattu result |

## Validation

After integration, the bundled package validated and was already normalized; the ingredient-reference normalizer reported no changes, and the generated Kotlin catalog index was current. Ledger schema, source ownership, alias ownership, picker projection, recipe-corpus boundary, UTF-8/no-BOM, and whitespace checks passed.

The integration checkpoint contained 1,675 ingredient references, 127 forms, and 2,022 ledger records with 8,991 source occurrences, 7,622 distinct source IDs, and 6,369 distinct source URLs. These are checkpoint totals and can advance with later catalog work. No software tests, builds, emulator checks, or deployment were run because this change only adds database JSON data under `AGENTS.md`.
