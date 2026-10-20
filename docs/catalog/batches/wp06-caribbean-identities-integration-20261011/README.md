# WP06 Caribbean identity integration and Pixel 9a QA

## Accepted scope

Promoted the existing WP03 `ingredient-ref-pigeon-peas` candidate as `pigeon peas / pois cajan`
in `LEGUME_AND_PULSE`, with source-attested aliases `gungo peas` and `pois d’Angole`. Added
`ackee / akée`, `Scotch Bonnet pepper / piment Scotch Bonnet`, `Cubanelle pepper / piment doux
Cubanelle`, Puerto Rican `ají dulce pepper / piment ají dulce`, Haitian `djon djon mushrooms /
champignons djon djon`, `Colombo powder / poudre à Colombo`, and `West Indian bay leaves / feuilles
de bois d’Inde` as distinct identities. The French display for ají dulce remains provisional;
TERMIUM supplies only a generic `piment doux` term in a Venezuelan record.

Added directly attested Trinidad and Tobago names to existing identities: `chadon beni`, `shadon
beni`, and `bandania` to culantro; `geera powder` to ground cumin; and `ochro` / `ochros` to okra.
The current alias fields have no geographic scope, so the ledger retains the island provenance.
Spanish `gandules` / `guandules` remain in source evidence rather than EN/FR alias fields.

Kept roselle calyces and Trinidadian pimento pepper as unresolved candidates. Roselle’s calyx
product lacks a settled Québec French display and unqualified `sorrel` collides with the active
common-sorrel alias. Trinidadian pimento pepper remains source-named as `Capsicum` sp. without a
reviewed Québec French product name. Also kept regional or ambiguous terms such as `callaloo`,
`green fig`, `channa`, `goat pepper`, `pimiento de cocinar`, and `recao` out of unscoped aliases.

No product forms, density, measurements, unit mappings, conversions, yields, substitutions, or
recipe links were added. Dry, green, canned, and fresh pigeon-pea states remain unresolved. Djon
djon remains species-neutral. Colombo powder has no universal formula. Bois d’Inde leaves remain
separate from bay laurel and allspice. The three proposal packets report no Caribbean benchmark
phrase in the 114 bundled recipes / 1,123 ingredient lines.

## Evidence

- OQLF, [akée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502937/akee),
  [pois cajan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296902/pois-cajan),
  and [piment Scotch Bonnet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037054/piment-scotch-bonnet): bilingual names and food identity boundaries.
- Trinidad and Tobago Ministry of Agriculture, [pigeon pea / gungo peas and ochro guide](https://agriculture.gov.tt/wp-content/uploads/2020/05/How2Grow-Compiled_compressed.pdf)
  and [vegetable and herb crop list](https://agriculture.gov.tt/wp-content/uploads/2020/01/Veg-PDF.pdf):
  local crop names and identity distinctions.
- Visit Trinidad, [Trini doubles](https://visittrinidad.tt/blog/street-food-favourites-how-to-make-trini-doubles/),
  and Foodie Nation, [fried ochro](https://www.foodienationtt.com/single-post/2019/04/30/trinbagonian-fried-ochro-recipe):
  chadon beni/culantro, geera/cumin powder, and ochro/okra usage.
- Jamaica Ministry of Agriculture, [Produce Grading Manual](https://tradeportal.moa.gov.jm/static/files/Produce-Grading-Manual.pdf):
  fresh Scotch Bonnet as *Capsicum chinense*.
- UPR, [Puerto Rican sweet-pepper landrace study](https://revistas.upr.edu/index.php/jaupr/article/download/21154/18698),
  Puerto Rico Government, [Condimento Criollo procurement](https://subastas.pr.gov/Pages/aviso.aspx?itemID=6616),
  and TERMIUM, [Cubanelle and sweet-pepper terminology](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frr&lang=fra&srchtxt=PIMENT):
  separate ají dulce and Cubanelle identities.
- Embassy of Haiti, [Riz djon djon recipe](https://www.haiti.org/wp-content/uploads/2017/06/chef-Lilavois-receipt.pdf),
  and SADA Foods, [Djon Djon](https://www.sadafoods.com/djon-djon): species-neutral Haitian mushroom identity.
- Tatie Maryse, [Colombo de porc](https://www.tatiemaryse.com/colombo-de-porc/),
  Ducros, [Colombo powder](https://www.ducros.com/fr-fr/produits/epices/epices/colombo),
  and [Colombo composition overview](https://www.ducros.com/fr-fr/le-secret-des-epices): local blend name and variable composition.
- Guadeloupe National Park, [bois d’Inde](https://www.guadeloupe-parcnational.fr/fr/des-connaissances/patrimoines-naturels/la-flore/arbres/foret),
  and Bourgeois, [West Indian bay (*Pimenta racemosa*)](https://www.persee.fr/doc/jatba_0183-5173_1995_num_37_1_3566): botanical and culinary leaf identity.

The full evidence, source locators, and access limits remain in the three source packets:
[English-speaking Caribbean](../../proposals/wp06-caribbean-english-cuisine-gap-sweep-20261011.md),
[Spanish-speaking Caribbean](../../proposals/wp06-caribbean-spanish-cuisine-gap-sweep-20261011.md),
and [Haiti and French Antilles](../../proposals/wp06-caribbean-french-creole-cuisine-gap-sweep-20261011.md).

## Package snapshot

- Ingredient references: 962; SHA-256 `c61d90194437037efe066360b68bd8c242a6c74cb2009a3dfdacc10b3f72743f`.
- Ingredient forms: 53; SHA-256 `540eba0619c98e5b8fed5a3e1e3c808dd7f9e511940b1271707c55d14daf987a`.
- Research ledger: 1,233 records / 3,716 source entries / 3,020 distinct source IDs; SHA-256 `7b850288a0b25458df9f2b7d2b3033bdfe11b19f23cf8c3ed7a90464333ae025`.
- Manifest: 114 recipes; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Recipe corpus: 114 recipes / 1,123 ingredient lines; unchanged by this integration.

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` and
  `--validate-only`: passed; package is normalized and valid.
- `python3 -m unittest tools.seed_package.test_bundled_seed_package`: 108 tests passed.
- `:app:testDebugUnitTest` and the deploy script's full `test` task: passed.
- `:app:connectedDebugAndroidTest` on Pixel 9a / Android 16 (API 36): 36 tests, 2 skipped,
  0 failed. The deploy script then reinstalled and launched `app.recipebook/.MainActivity`.
- Manual picker QA on the deployed Pixel 9a: the English list shows `ackee`; searching the English
  alias `ochro` returns canonical `okra`; French searches return `pois cajan` and `piment Scotch
  Bonnet`. The empty draft was discarded and the emulator language was restored to English. Screenshots:
  [English picker](screenshots/ingredient-picker-en.png),
  [English alias search](screenshots/ingredient-picker-ochro.png),
  [French pois cajan](screenshots/ingredient-picker-fr-pois-cajan.png),
  [French Scotch Bonnet](screenshots/ingredient-picker-fr-scotch-bonnet.png).
- `git diff --check` passes for the touched tracked files in this integration. A repository-wide
  check still reports pre-existing trailing whitespace in imported/exported recipe files outside
  this batch; those files were left untouched.
