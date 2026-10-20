# WP03 Section F — Quaker Squares cereal family review (R789, 2026-10-19)

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. Root added the three proposed references and ledger records; see the [R788–R790 integration README](../batches/wp02-wp03-wp04-r788-r790-gap-review-integration-20261019/README.md).
- **Checklist gap:** The open Section F item “Regionally significant cereal mixes and preprocessed
  grains encountered in the cuisine sweeps” at the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4919).
- **Scope:** The three current products shown on Quaker Canada’s English Squares Cereal family page:
  Corn Squares, Oatmeal Squares, and Oatmeal Squares Maple & Brown Sugar Flavour. This is a named
  ready-to-eat cereal family review, not a review of generic corn bran, oats, or oatmeal.
- **Recommendation:** Add all three as separate identity-only `GRAIN_AND_CEREAL` references. Use the
  exact product-qualified English names and the French product wording verified on Quaker Canada’s
  product pages and recipe page. Keep aliases, forms, density, unit mappings, recipe links, and
  substitutions empty. Record each manufacturer Nutrition Facts serving only as an observation for
  that named finished cereal; do not turn any serving into a general cereal measure.
- **Current snapshot:** 1,873 ingredient references, 195 forms, 56 legacy-import candidates, and
  2,277 research-ledger records. The bundled package has 114 manifest-listed recipes and 1,123
  structured ingredient rows.

## Bilingual family and proposed references

Quaker’s current English Squares Cereal family page lists exactly three products: Quaker Corn Squares
Cereal, Quaker Oatmeal Squares Cereal, and Quaker Oatmeal Squares Maple & Brown Sugar Flavour Cereal
[S01]. The two French product pages provide `Céréales Squares au maïs` and `Céréales Squares à
l’avoine`; the manufacturer’s French snack-mix recipe calls the maple variant `Céréales Squares à
l’avoine à saveur d’érable et de cassonade` [existing `WP03-CORN-BRAN-20261013-S05`, R789 S04, R789
S06]. The last phrase is recipe-page
wording, not a French product-card title.

| Proposed reference ID | English display | French display | Aliases | Product-specific label portion |
|---|---|---|---|---|
| `ingredient-ref-quaker-corn-squares-cereal` | `Quaker Corn Squares cereal` | `Céréales Squares au maïs` | None | 1 cup (30 g) |
| `ingredient-ref-quaker-oatmeal-squares-cereal` | `Quaker Oatmeal Squares cereal` | `Céréales Squares à l’avoine` | None | 3/4 cup (45 g) |
| `ingredient-ref-quaker-oatmeal-squares-maple-brown-sugar-cereal` | `Quaker Oatmeal Squares Maple & Brown Sugar Flavour cereal` | `Céréales Squares à l’avoine à saveur d’érable et de cassonade` | None | 3/4 cup (45 g) |

Keep the Corn Squares product separate from the active `ingredient-ref-corn-bran` ingredient. Its
name and product page describe a finished cereal that includes corn and bran; they do not make the
finished cereal identical to plain corn bran. Keep both Oatmeal Squares products separate from oats,
instant oatmeal, and other Quaker cereals. The Maple & Brown Sugar product is a named finished
variant, not a flavor alias on plain Oatmeal Squares. Do not decompose product ingredients, infer
formulas or proportions, or add aliases such as `corn bran squares`, `oat squares`, or bare `Squares`.

## Product and measurement evidence

The product pages publish the listed serving sizes for their named finished cereals. Each observation
is product-specific: the pages do not describe a cup-filling method, the exact packaged UPC, or a
transferable mass for cereals generally. Preserve the label household units and values as quoted;
do not normalize them to RecipeBook’s cup, infer density, or create active measures or mappings.

Quaker’s French Corn Squares page contains an apparent rendering typo `1 coup (30 g)` in its
Nutrition Facts text. Use the English product page’s `1 Cup (30 g)` only for the Corn Squares serving
observation, and use the French page for its French product wording. The old CNF 2015 Food Code 1477
page cited as `WP03-CORN-BRAN-20261013-S06` is already owned by the corn-bran ledger row and contains
historical Quaker-cereal portions. Do not copy those volume-to-mass values to this current family or
use them as a current SKU match.

The official French snack-mix recipe uses 8 cups of the Maple & Brown Sugar cereal in that one
formula [S06]. This is a recipe-specific amount, not another label serving or a general conversion.
The recipe and product pages do not recommend replacing one Squares product with another or with a
different ingredient. This proposal performs no independent substitution review: keep each new
record’s substitution state `not_yet_researched` and add no global or contextual rule.

## Source register and ownership

The new `WP03-QUAKER-SQUARES-R789-20261019-S01` through `S06` IDs are proposal-local and were absent
from the live ledger and proposal archive at review time. The French Quaker Corn Squares page is an
existing source, not a new R789 URL owner: preserve `WP03-CORN-BRAN-20261013-S05` under its current
`ingredient-ref-corn-bran` owner. If the Corn Squares ledger record needs a source entry for that
French name, share that existing source ID without allocating a second ID for the URL. The source
and observation state for plain corn bran remain unchanged.

| Source ID | Direct source and evidence | Limit |
|---|---|---|
| `WP03-QUAKER-SQUARES-R789-20261019-S01` | PepsiCo Canada, [Quaker Squares Cereal family page (English)](https://www.tastyrewards.com/en-ca/brands/quaker/products-categories/squares-cereal), accessed 2026-10-19. Lists the three products in the current family. | Family roster and English names only; it does not establish all package codes, ingredient formulas, or French titles. |
| `WP03-QUAKER-SQUARES-R789-20261019-S02` | PepsiCo Canada, [Quaker Corn Squares Cereal](https://www.tastyrewards.com/en-ca/node/2982), accessed 2026-10-19. Gives the English product name and Nutrition Facts serving `1 Cup (30 g)`. | The serving belongs to this named finished cereal page, not to corn bran or other cereals; no cup-fill method or UPC was checked. |
| Reuse `WP03-CORN-BRAN-20261013-S05` (existing owner retained) | PepsiCo Canada, [Quaker Céréales Squares au maïs](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-squares-au-mais), rechecked 2026-10-19. French product page and product wording. | Existing ledger source on `ingredient-ref-corn-bran`; its serving is for the finished cereal. Do not duplicate the URL under a new source ID or copy its `1 coup` rendering as a separate unit. |
| `WP03-QUAKER-SQUARES-R789-20261019-S03` | PepsiCo Canada, [Quaker Oatmeal Squares Cereal](https://www.tastyrewards.com/en-ca/node/2980), accessed 2026-10-19. Gives the English name and `3/4 Cup (45 g)` Nutrition Facts serving. | Product-specific label portion only; no reusable cereal measure or cup-filling method. |
| `WP03-QUAKER-SQUARES-R789-20261019-S04` | PepsiCo Canada, [Quaker Céréales Squares à l’avoine](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-squares-lavoine), accessed 2026-10-19. French product page for plain Oatmeal Squares. | Supports the French wording for the plain product; do not use its rendered `coup` Nutrition Facts text as an independent unit observation. |
| `WP03-QUAKER-SQUARES-R789-20261019-S05` | PepsiCo Canada, [Quaker Oatmeal Squares Maple & Brown Sugar Flavour Cereal](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-oatmeal-squares-maple-brown-sugar-flavour-cereal), accessed 2026-10-19. Gives the English variant name and `3/4 Cup (45 g)` serving. | English product and its own serving only; it does not establish a French product-card title. |
| `WP03-QUAKER-SQUARES-R789-20261019-S06` | PepsiCo Canada, [Mélange-collation aux Squares à l’avoine Quaker](https://www.tastyrewards.com/fr-ca/recettes/melange-collation-aux-squares-lavoine-quakerr), accessed 2026-10-19. The ingredient list names `Céréales Squares à l’avoine à saveur d’érable et de cassonade` and uses 8 cups in that snack-mix formula. | Supports source-attested French recipe wording and one formula-specific amount; it is not a product detail page, a Nutrition Facts serving, or a reusable measure. |

The English family URL and R789 product/recipe URLs had no exact owner in the live ledger. The only
current ledger owners among these pages are `WP03-CORN-BRAN-20261013-S05` (the French Quaker Corn
Squares page) and `WP03-CORN-BRAN-20261013-S06` (the older CNF serving page), both on
`ingredient-ref-corn-bran`. Preserve their IDs and owners. Do not duplicate or reinterpret the CNF
2015 portion rows as current product evidence.

## Catalog and collision audit

At review time, the three proposed reference IDs and normalized bilingual names were absent from the
active reference and form files, the 56-entry `legacy-import-identities.v1.json`, ledger record IDs,
and focused proposal/batch archives. No recipe or form owns these product identities. No existing
source ID begins with `WP03-QUAKER-SQUARES-R789-20261019-`. The only related previous research is the
corn-bran review, which explicitly kept Corn Bran Squares as a finished product rather than treating
the cereal as plain corn bran; it did not create a Corn Squares cereal identity.

The three identities are intended to be created together from the current family roster. If the
French source for the maple variant is not accepted as sufficient product wording because it is a
recipe page rather than a product card, hold all three identities together pending a French
manufacturer listing or a complete bilingual Squares family roster. Do not integrate just one
Oatmeal Squares row and make the current two-product Oatmeal Squares family appear to be a singleton.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and normalize accents/punctuation, prefer complete word phrases, then use substring matching only if no complete phrase matches. The projection includes current reference and form terms and the three displays above, with no aliases.

| Query | Current | With all three | Effect |
|---|---:|---:|---|
| `Quaker Corn Squares`; `Corn Squares` | 0; 0 | 1; 1 | Finds only Corn Squares. |
| `Quaker Oatmeal Squares`; `Oatmeal Squares` | 0; 0 | 2; 2 | Returns plain and Maple & Brown Sugar as separate products. |
| `Céréales Squares` | 0 | 3 | Returns the complete three-product Squares family in French. |
| `Céréales Squares au maïs` | 0 | 1 | Finds only Corn Squares. |
| `Céréales Squares à l’avoine` | 0 | 2 | Returns both oat-based variants; the full Maple qualifier narrows to one. |
| `Quaker` | 11 | 14 | Adds three named Quaker products to the existing Quaker results. |
| `cereal` / `céréales` | 99 / 96 | 102 / 99 | Adds three named finished cereals to broad category searches. |
| `avoine` | 26 | 28 | Adds the two products whose French displays specify oats. |
| `corn bran` / `son de maïs` | unchanged | unchanged | The plain ingredient remains on `ingredient-ref-corn-bran`; no cereal-to-bran alias is added. |

Each full product name returns one reference. This is a deterministic static projection, not a live
Android picker check.

## Bundled-recipe demand

The manifest lists 114 recipe files containing 1,123 structured ingredient rows. I scanned every
manifest-listed file and row for the three proposed IDs, `Quaker Corn Squares`, `Quaker Oatmeal
Squares`, `Oatmeal Squares`, `Squares au maïs`, `Squares à l’avoine`, and the maple/cassonade product
phrases. The scan found zero matching recipe files and zero matching ingredient rows. The official
Quaker snack-mix recipe cited above is external recipe evidence only; it is not bundled-library
demand. Add no recipe links or change no bundled recipe text.

## Precise proposed data delta

Add exactly the three references in the bilingual table as identity-only `GRAIN_AND_CEREAL` products,
with empty alias arrays, `defaultDensity: null`, `unitMappings: []`, and no forms. Add one
`ingredient_reference` research-ledger record for each product with `identityState: verified`,
`measurementState: researched_supported` for its product-specific manufacturer portion, and
`substitutionResearchState: not_yet_researched`. Add one `portion_weight` observation per row using
the current manufacturer serving shown above, `foodState: dry, ready-to-eat cereal as sold`, and a
method that says the published Nutrition Facts portion does not specify cup filling. Keep
`sourceQuantity.unit` as the printed `cup`; do not declare a cup convention or activate a general
conversion, density, or unit mapping.

Use observation IDs:

- `quaker-corn-squares-1-cup-30g-r789-20261019`
- `quaker-oatmeal-squares-plain-3-4-cup-45g-r789-20261019`
- `quaker-oatmeal-squares-maple-brown-sugar-3-4-cup-45g-r789-20261019`

Register R789 sources S01–S06 once with the owners shown above, sharing S01 across the three family
records if row-level evidence lists require it. Reuse `WP03-CORN-BRAN-20261013-S05` for the French
Corn Squares product wording without changing its original owner. Keep the CNF 2015 source
`WP03-CORN-BRAN-20261013-S06` and all current `ingredient-ref-corn-bran` state intact. Add no aliases,
other products, recipe links, forms, active measures, density, mappings, conversions, yields, or
substitutions. The broader
Section F checklist remains open.

## Proposal-only checks

- [x] Confirmed the exact open Section F checklist item and read the current references, forms,
  legacy candidate file, ledger, relevant plan entries, R785–R787 proposals/integration note, and
  catalog workflow contract.
- [x] Checked proposed reference IDs, bilingual names, R789 source-ID prefix, source URLs, and the
  R789 proposal path against current catalog/ledger and prior review ownership.
- [x] Reopened the manufacturer pages on 2026-10-19; preserved the current owner of the existing
  French Corn Squares source and kept the historical CNF serving values out of the new portions.
- [x] Projected phrase-first picker effects and scanned all 114 manifest-listed recipes and 1,123
  structured ingredient rows.
- **No software tests, build, emulator checks, or deployment were run.** Root integrated database
  JSON data and regenerated the reference index; this database-only change falls under the updated
  AGENTS.md testing rule. Static verification is recorded in the integration README.
