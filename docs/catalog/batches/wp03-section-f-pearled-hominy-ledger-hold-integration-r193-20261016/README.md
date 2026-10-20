# WP03 Section F R193 — Pearled Hominy Candidate Hold Refresh

- **Date:** 2026-10-16
- **Disposition:** Retained `ingredient-ref-pearled-hominy` as the existing ledger-only candidate. No active reference, alias, form, recipe link, conversion, yield, or substitution was added.
- **Reason:** Statistics Canada's NAPCS lists pearled corn as a human-consumption grain product, separate from white hominy, and excludes pearled corn from unprocessed corn-for-grain. This supports a processed-grain boundary but does not establish equivalence to pearled hominy or a Québec French human-food product name. The remaining French wording is broad, an import classification, a feed-byproduct term, or a separate animal-feed product.
- **Ledger update:** Kept the candidate ID, unresolved identity state, and one unresolved decision. Added three already-registered source IDs to the candidate and two new source records for NAPCS 1151111 and Ferme Maxiel. Refreshed existing `WP03-S139` to the current CFIA table revision and its exact feed-table locators. Corrected the existing Recettes du Québec source note to match the article's `maïs perlé` spelling.
- **Research states:** Set measurement to `researched_no_supported_value` and substitution research to `researched_no_supported_substitute`. Added no measurement observations or substitution findings.
- **Demand:** No candidate wording occurs in the 114 bundled recipes / 1,123 ingredient rows. No measure or reusable substitution is supported.

## Independent source check

- Statistics Canada's [NAPCS human-consumption grain examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022) list `pearled corn (maize)` and `white hominy` as separate examples. The [corn-for-grain class](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1151111&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502) excludes hulled, pearled, sliced, or kibbled corn to the human-consumption grain-product class.
- The [CBSA Customs Tariff Chapter 11](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html) classifies maize among other worked grains; this is trade classification, not a consumer product name.
- CFIA's [French SARI update](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-jour-acia-sari-2024-12-02) uses `Maïs : mondé ou perlé` as an import category. The [current Canadian Feed Ingredients Table](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail) was last modified 2026-10-07; `hominy perlé` occurs in the definition of a feed milling byproduct.
- OQLF's [semoules du maïs entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17036518/semoules-du-mais) defines broad hulled and degermed maize broken or ground to different sizes. The Québec food article [Le maïs](https://www.recettes.qc.ca/chroniques/quoi-manger/article/le-mais-29) calls `maïs perlé` a broad food-maize type without defining a dry-milled product. Ferme Maxiel's [Perles de maïs](https://maxiel.ca/products/perles-de-mais) is dried, shelled maize intended for birds and small rodents.
- TERMIUM's [hominy entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=23&i=&index=enb&lang=eng&sg_kp_wet=1113184&srchtxt=CAUSTIC) distinguishes pearled and lye-treated hominy and describes grits as ground hominy. The USDA ERS [1982 dry-milling report](https://esmis.nal.usda.gov/sites/default/release-files/dv13zt20x/2j62s871n/m613n2962/Feedsit-08-18-1982.pdf) distinguishes pearl hominy from grits, meal, and flour; it supplies no current Canadian name or kitchen measure.

## Static verification

- Research ledger schema validation, exact source-ID/URL ownership, candidate source count, unique decision-source list, and no-supported-measure/substitution states passed.
- Bundled package validation and normalization, ingredient-reference normalization, generated-catalog freshness, candidate ownership, manifest-listed corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- Totals after this update: 1,573 references, 122 forms, and 1,918 ledger records / 8,275 source entries / 7,059 distinct source IDs / 5,849 distinct source URLs.
- No software tests or emulator checks were run because the update only changes database evidence JSON and documentation, per `AGENTS.md`.

See the [R193 source review](../../proposals/wp03-section-f-pearled-hominy-canadian-classification-recheck-r193-20261016.md).
