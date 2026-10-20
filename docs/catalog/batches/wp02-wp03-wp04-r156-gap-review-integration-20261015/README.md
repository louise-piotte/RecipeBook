# WP02/WP03/WP04 R156 gap-review integration

Integrated 2026-10-15 after root review of the three proposal-only R156 gap reviews.

## Decisions

- **WP02 A6 — red teff flour:** Keep the candidate outside active references and the research ledger.
  VANA's current Calgary own-label sack is named Red Teff Flour, while the existing brown-teff row
  comes from a separate Ontario product. Canadian seller wording overlaps red and brown; a study
  from Ethiopia distinguishes red and mixed-brown teff in its own sample taxonomy but does not
  identify VANA's flour. No source establishes that the products are identical or distinct, and no
  Québec French display is supported for VANA's product. Do not add a separate row or map red to
  brown.
- **WP03 Section F — hard red winter wheat berries:** Added identity-only
  `hard red winter wheat berries / grains de blé de force rouge d'hiver` as
  `ingredient-ref-hard-red-winter-wheat-berries` in `GRAIN_AND_CEREAL`. Canadian food sellers name
  whole hard-red-winter wheat as berries/seeds, including an Ontario-grown product. Keep it separate
  from generic and other named wheat berries, flour, and durum wheat. Do not infer cultivar, grade,
  origin, or regulated grain class from retail listings. The French display is provisional, informed
  by Canadian Grain Commission class wording and OQLF's `blé de force` term for hard wheat flour; it
  is not a verified Québec retail title. Independent Québec wording review remains open. Add no
  aliases, forms, measures, density, unit mappings, conversions, yields, recipe links, or
  substitutions.
- **WP04 Section P — tarako:** Hold unqualified `tarako` outside active references, forms, legacy
  mappings, and the research ledger. MAFF describes the common Japanese salted product as Alaska-
  pollock roe but documents an Akita regional use of the term for raw Pacific-cod roe. Current
  Canadian salted-roe listings do not establish one as Japanese `shio-tarako`, and no Québec French
  product name was verified. The bundled corpus has no roe demand; a hypothetical row would capture
  the generic `roe` query. Add no identity, alias, form, measure, recipe link, conversion, yield, or
  substitution.

## Independent source review

- The [WP02 proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-r156-20261015.md) links
  VANA's [current Calgary product evidence](https://vanaafrica.ca/), Zula Market's separate
  [Brown Teff Flour listing](https://zulamarket.ca/products/mama-brown-teff-flour), a
  [primary teff study](https://journals.plos.org/plosone/article?id=10.1371/journal.pone.0272010),
  the French-market `Farine complète de teff rouge` product, and OQLF's base `tef` entry. Root
  confirmed that VANA names its product in English and gives its Calgary own-label context, while
  the other sources do not map that product to the existing brown row or establish a Québec label.
- The [WP03 proposal](../../proposals/wp03-section-f-next-grain-gap-review-r156-20261015.md) links
  Ontario and other seller listings for whole hard-red-winter kernels, the Canadian Grain
  Commission's [French CEHRW designation](https://www.grainscanada.gc.ca/fr/qualite-grains/listes-des-varietes-designees/2026/lvd-ble-cehrw.html),
  and OQLF entries for [`farine de blé de force`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force)
  and [`blé dur`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357379/ble-dur).
  Root confirmed the named Ontario-grown retail product and official French class wording. The
  retail listing does not assign the product to that regulated class, and OQLF's `blé dur` refers
  to durum wheat.
- The [WP04 proposal](../../proposals/wp04-section-p-tarako-product-boundary-review-r156-20261015.md)
  links MAFF's [salted-food classification](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/siozuke.html)
  and [Akita regional dish entry](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4839/index.html),
  Japan's food-composition table, OQLF, and Canadian retailer listings. Root confirmed MAFF's
  distinction between salted Alaska-pollock roe and Akita's raw Pacific-cod roe use. The Canadian
  listings do not settle species, preparation, or Québec naming for the recipe product.

## Static verification

- Ingredient-reference normalization passed. Bundled package normalization check and validation
  passed. The generated Kotlin catalog is current at **1,529 references**.
- Research-ledger schema and semantic validation passed. The ledger contains **1,874 records / 7,944
  source entries / 6,792 distinct source IDs**; all seven new hard-red-winter source IDs are unique
  and unallocated before this integration.
- Static phrase-first picker projection returns the new row for each complete bilingual name;
  `hard red` returns the spring and winter identities, `winter wheat berries` returns soft-red-winter
  and hard-red-winter, and `wheat berries` now returns nine identities. Existing soft-red-winter and
  durum exact queries remain specific.
- Scanned all **114 manifest-listed recipes / 1,123 ingredient rows** for the three candidates and
  related English/French wording. There are no matching recipe-file or ingredient-row hits.
- The reference and ledger JSON remain UTF-8 without BOM; bundled French accents use Unicode
  escapes. Encoding, mojibake, local-link, and scoped whitespace checks passed.

No tests, builds, emulator runs, or deployments were performed. The only data change adds one
identity-only record to database JSON, covered by the current `AGENTS.md` no-testing rule; the two
holds are documentation-only.

See the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt),
[roadmap](../../../../roadmap.md), and the three R156 proposals linked above. Sections 04 A6, F,
and P remain open.
