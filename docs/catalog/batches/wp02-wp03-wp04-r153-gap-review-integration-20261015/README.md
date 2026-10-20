# WP02 / WP03 / WP04 R153 gap-review integration

Integrated the three R153 proposals after reviewing their source evidence, existing catalog
ownership, French naming limits, picker projections, and bundled-recipe impact.

- **WP02 Section 04 A6 — kaniwa flour:** added identity-only `kaniwa flour / farine de kaniwa` in
  `FLOUR_AND_STARCH`, with `canihua flour` as its only English alias. Kept whole kaniwa seeds,
  quinoa flour, and the existing isolated-kaniwa-starch hold separate. The French display is a
  transparent construction from the OQLF-preferred grain term, not an exact Québec package name or
  OQLF flour entry; independent Québec wording review remains open.
- **WP03 Section F — hard white spring wheat berries:** added identity-only `hard white spring wheat
  berries / grains de blé de force blanc de printemps` as a Canadian whole-kernel product class.
  Kept it separate from generic, hard red spring, durum, Red Fife, sprouted, and season-unspecified
  white wheat berries, as well as white whole-wheat flour. Its French display is a source-informed
  construction from Canadian Grain Commission wording, not an OQLF ruling or verified Québec retail
  title.
- **WP04 Section P — shishamo:** held unqualified `shishamo` outside references, forms, and the
  ledger. Sources use the name for both Hokkaido shishamo (*Spirinchus lanceolatus*) and Atlantic
  capelin (*Mallotus villosus*), and this review found no Québec French name for the intended scope.
  Kept the existing Atlantic-capelin reference unchanged and did not add `shishamo` as an alias.

The accepted rows add no forms, recipe links, reusable measures, density, unit mappings,
conversions, yields, or active substitutions. The shishamo hold adds no catalog or ledger data. No
matching candidate wording or ingredient links were found in the manifest-listed recipe corpus.

The package now contains **1,524 references and 119 forms**. The research ledger contains **1,869
records, 7,907 source entries, and 6,762 distinct source IDs**. The generated Kotlin catalog index
contains 1,524 references. The bundle remains **114 recipes and 1,123 ingredient rows**.

Static reference normalization/check, bundled-package normalization/check and validation,
generated-index freshness, research-ledger schema/source linkage, picker projection, full
manifest-corpus scan, UTF-8/no-BOM and mojibake checks, local links, and scoped whitespace checks
passed. No Gradle, unit, instrumentation, emulator, app, or deployment tests were run. The catalog
changes only add database JSON data, and the shishamo disposition is documentation-only, under the
updated `AGENTS.md` rule.

Source evidence was checked against the [OQLF kaniwa entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532687/kaniwa),
[Port Royal Mills](https://www.portroyalmills.com/seeds/), [Villa Andina](https://www.villaandina.com/granos-andinos),
and [Metro's mixed-flour listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-tout-usage-biologique/p/896899000449);
the [Canadian Grain Commission's French class list](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/04-ble/classes-varietes.html)
and [Storehouse Foods](https://storehousefoods.ca/products/hard-white-wheat-berries-1); and the
[MAFF shishamo overview](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/3588/index.html),
[Seaborn Toronto product listing](https://www.seaborntoronto.com/product-page/shishamo-8pc), and
[OQLF capelan entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198782/capelan).

See the [WP02 kaniwa-flour proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-r153-20261015.md),
[WP03 hard-white-spring-wheat proposal](../../proposals/wp03-section-f-next-grain-gap-review-r153-20261015.md),
[WP04 shishamo hold proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r153-20261015.md),
and the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). Sections 04 A6,
F, and P remain open.
