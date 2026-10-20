# WP03 Section F millet-flakes identity review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as an identity-only reference. The reference and new ledger record were added; see [integration README](../batches/wp03-section-f-millet-flakes-integration-20261012/README.md).
- **Scope:** Recheck the current Section F holds for farro, generic sushi rice, pearled hominy, and pozole corn. If none is materially resolved, select one distinct unfinished grain/cereal identity gap.
- **Candidate:** Plain millet flakes, separate from the active millet grain, species-level millet grains, flour, puffed millet, and composite cereals.
- **Plan location:** Section F keeps broad grain-product coverage open at [plan lines 502–508](../../RecipeBook-global-ingredient-catalog-plan.txt#L502) and [1839–1854](../../RecipeBook-global-ingredient-catalog-plan.txt#L1932). Wheat flakes and amaranth flakes were integrated in the 2026-10-12 checkpoint work; neither is reopened here.

## Integration status (2026-10-12)

Root accepted the narrow identity-only recommendation. Added `ingredient-ref-millet-flakes` as `millet flakes / flocons de millet` in `GRAIN_AND_CEREAL`, with no aliases. Added a verified identity ledger record using proposal sources S01–S04; measurement and substitution research remain unresearched. No recipe link, form, measure, density, unit mapping, conversion, yield, or substitution was added. The package snapshot and exact-key audit below describe the state at proposal review, before this integration and the later octopus integration; see the [integration README](../batches/wp03-section-f-millet-flakes-integration-20261012/README.md) for post-integration checks.

## Recommendation

**Add an identity-only `millet flakes / flocons de millet` reference** with proposed ID `ingredient-ref-millet-flakes` and category `GRAIN_AND_CEREAL`.

Current Canadian retail evidence lists a standalone millet-flake product whose ingredient line is millet grains. Canadian French retail and Québec sources attest the display `flocons de millet` in product naming, ingredient declarations, and a Québec producer's current goods list [WP03-MILLETFLAKES-QC-20261012-S01–S04]. These sources support the unqualified market product name without identifying one millet species or universal flaking/heat treatment.

The scope is the plain human-food product sold under the unqualified `millet flakes` / `flocons de millet` name. Keep explicit species-qualified products source-specific; do not add `finger millet flakes`, `ragi flakes`, or any other species phrase as an alias. Do not include millet flour, puffed millet, infant cereal made from millet flour, formulated or multigrain breakfast cereals, or grain-free extrudates. The exact naming evidence is sufficient for an identity proposal, but does not establish a production method, ready-to-eat status, or a common cooking ratio.

| Proposed field | Recommendation |
| --- | --- |
| ID | `ingredient-ref-millet-flakes` (unallocated) |
| English display | `millet flakes` |
| Québec French display | `flocons de millet` |
| Category | `GRAIN_AND_CEREAL` |
| English/French aliases | None |
| Recipe links | None; no matching line in the manifest corpus |
| Forms, measures, density, unit mappings, conversions, yields, substitutions | None |

Keep this identity separate from `millet / millet`, the active common/pearl/foxtail/finger millet grain identities, their flour rows, and `puffed millet / millet soufflé`. Do not reuse the pre-cooked description, package size, ingredient-language details, nutrition panel, or product directions from one seller as general runtime data. No parser, picker, matching, or other runtime behavior is proposed.

## Recheck of the four open holds

The latest evidence does not change the prior holds. Their current research-ledger records remain `candidate` with `identityState: needs_clarification` and have no active identity proposal in this review.

| Held candidate | Current recheck | Result |
| --- | --- | --- |
| Unqualified farro | A current Canadian retailer listing sells one product titled `Farro – Emmer & Spelt` and describes farro as hulled whole wheat made of emmer and spelt [WP03-MILLETFLAKES-QC-20261012-S05]. This adds a current multi-species product example beside the Québec OQLF emmer sense and broader prior farro evidence. | Hold remains. Product names and descriptions still do not establish one species, grade, or grain/flour scope for unqualified `farro`. |
| Generic sushi rice | Current Québec distributor and manufacturer pages label specific Calrose products `Riz à sushi Calrose` [WP03-MILLETFLAKES-QC-20261012-S06–S07]. The prior independent review also documents sushi-marketed rice attached to different grain classes and authoritative food-safety use of `riz à sushi` for prepared, seasoned rice ([review](./wp03-section-f-sushi-rice-independent-review-20261011.md)). | Hold remains. The retail use label identifies particular products, not one shared grain class, and the prepared-food sense remains. |
| Pearled hominy | The ledger candidate remains unresolved. Targeted current Canadian/Québec searches did not identify a human-food product that establishes `pearled hominy / hominy perlé` as a distinct Québec display. The current CFIA feed-ingredient table mentions pearled hominy in defining a feed by-product; that does not resolve a human-food name [WP03-MILLETFLAKES-QC-20261012-S10]. Prior product-boundary analysis remains in the [pozole-corn review](./wp03-section-f-pozole-corn-boundary-review-20261010.md). | Hold remains. Dry-milled hominy and whole-kernel hominy/pozole products should not be merged solely because they are sold dry. |
| Pozole corn | A current Québec retailer lists `Carey – Maïs Pozolero Blanc`; a second Québec-market page titles its product `Maïs blanc Hominy à la mexicaine` and describes it as `Maíz Pozolero Blanco`, ready to serve [WP03-MILLETFLAKES-QC-20261012-S08–S09]. The accessible local listings concern a packaged hominy/pozolero product, not a distinct dry whole-grain product label. | Hold remains. The new Québec evidence reinforces the existing dry whole-kernel versus prepared/packed product boundary without settling the dry product's French name. |

## Package snapshot at proposal review and exact-key audit

This read-only snapshot was captured at proposal review, before root integration of this row and the later octopus integration. Hashes are SHA-256 over exact file bytes. The corpus digest uses each manifest-relative recipe path, NUL, exact recipe bytes, NUL, in manifest order.

| Artifact | Current count/state | SHA-256 or digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,218 references; 106 `GRAIN_AND_CEREAL` | `a446785f1cd9b409d9220ab6471dff9b9834ff7a7c9333bcbcae49352ff43933` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 recipe-file bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,520 records; 5,139 source entries; 4,202 distinct source IDs; 8 unit conversions | `a8c9e1e7597d29535831c7b43d3bb5627f5f78905567add80753ea61b51d68d2` |
| Generated `BundledIngredientCatalog.kt` | 1,218 references | `453204d42068302ec9ec1891e93c9a649f96e1714c8a79f046fd96676ca9aade` |

The exact-key check used the repository `normalize_search_key` implementation for active reference IDs, names and aliases; form IDs, labels and match terms; every legacy candidate; ledger record IDs and full serialized ledger text; and all manifest-listed recipes. Candidate keys were `millet flakes`, `millet flake`, `flaked millet`, `flakes of millet`, `flocons de millet`, `flocon de millet`, `flocons millet`, `flocons de mil`, `millet en flocons`, `finger millet flakes`, `flocons d'éleusine cultivée`, and `flocons d'éleusine`.

| Search scope | Result |
| --- | --- |
| Active reference exact-key owners | 0. The proposed ID and candidate names/aliases are absent. Existing millet grain, species, flour, and puffed-millet rows remain separate. |
| Form labels and match terms | 0 exact owners; no millet-flake form exists. |
| Legacy imports | 0 of 66 candidates own any candidate key or proposed ID. |
| Research ledger | No `ingredient-ref-millet-flakes` record and no candidate phrase in the serialized ledger. The four rechecked hold records remain present: farro (15 sources), sushi rice (10), pearled hominy (5), pozole corn (5). |
| Full manifest recipe text | 0 matching files out of 114. |
| Ingredient rows | 0 matching rows out of 1,123. |

This is a static identity and text audit, not a live picker-ranking test. The absence of recipe demand means no relinking or recipe-line change is proposed.

## Remaining Section F gaps

This one identity would not close Section F. The current plan still leaves unqualified farro, generic sushi rice, pearled hominy, pozole corn, generic grits/polenta, dried sweet corn, and residual puffed-grain candidates open ([plan lines 502–508](../../RecipeBook-global-ingredient-catalog-plan.txt#L502), [1839–1885](../../RecipeBook-global-ingredient-catalog-plan.txt#L1932)). Species-level brown-top, barnyard, and Sikiya/crab-finger millet reviews remain held ([plan lines 509–522](../../RecipeBook-global-ingredient-catalog-plan.txt#L509)); sorghum flakes remain held at [plan line 7400](../../RecipeBook-global-ingredient-catalog-plan.txt#L7671), and whole-kernel puffed oats remain held at [plan lines 2103–2106](../../RecipeBook-global-ingredient-catalog-plan.txt#L2196). Independent Québec display decisions and wider cereal-mix/preprocessed-grain coverage also remain open. Wheat flakes, amaranth flakes, and puffed millet are existing distinct identities and are not part of this candidate.

## Proposal-local source register

Source IDs below are local to this proposal. They were checked absent from the shared ledger before drafting. Pages and records were checked on 2026-10-12; source-specific qualifications are retained.

| Source ID | Source and locator | Supports / does not support |
| --- | --- | --- |
| `WP03-MILLETFLAKES-QC-20261012-S01` | Naturitas Canada, [Priméal Millet flakes, 500 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/millet/millet-flakes-500-g-primeal), product page. | Current Canadian storefront listing marked in stock; English product title is `Millet flakes`, ingredient line says `Millet grains`, and the listing presents breakfast and other human-food uses. This specific page calls the product pre-cooked and gives its own directions; no such process, measure, species, or origin is generalized here. |
| `WP03-MILLETFLAKES-QC-20261012-S02` | Spice Divine, [Flocons de millet S&V, 2 lb](https://spicedivine.ca/fr/products/sv-finger-millet-flakes-2lb), French Canadian storefront page. | Exact Canadian French retail title `Flocons de millet`; the page describes breakfast and snack use. It was marked out of stock at review time, so it supports terminology, not present availability. The page path/description associate this particular product with finger millet/Ragi; it does not support `finger millet flakes` as an alias of the generic proposal. |
| `WP03-MILLETFLAKES-QC-20261012-S03` | La Boîte à Grains, [Pain artisanal L'Angélique millet, chia et quinoa](https://laboiteagrains.com/products/pain-langelique-sans-gluten-bio-cuisine-langelique), Gatineau-area retailer product page, ingredients. | Québec French ingredient declaration says `flocons (millet, quinoa)`. The product is composite bread and was marked out of stock on the page; this is local terminology corroboration, not a standalone millet-flake specification. |
| `WP03-MILLETFLAKES-QC-20261012-S04` | Canadian Intellectual Property Office, Trade-marks Journal, Vol. 73, No. 3726, [French](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3726-fra.pdf) and [English](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3726-eng.pdf) editions, published 2026-03-25, Cuisine L'Angélique Inc., Coaticook, Québec, application 2,170,662, class 30 goods. | The French goods list includes `flocons de millet`; the English journal entry for the same application includes `millet flakes`. This supports bilingual Québec commercial terminology, not a currently stocked standalone product or a grain specification. |
| `WP03-MILLETFLAKES-QC-20261012-S05` | The Gourmet Warehouse, [Farro – Emmer & Spelt, 17.6 oz](https://gourmetwarehouse.ca/farro-emmer-spelt-17-6oz/), current product page. | In-stock Canadian listing says this product is made of emmer and spelt and can ship within Canada. Product-specific current evidence corroborates the farro hold; it does not define every farro product. |
| `WP03-MILLETFLAKES-QC-20261012-S06` | Aubut, [Riz à sushi Calrose](https://www.aubut.ca/produits/details/riz-a-sushi-calrose-3588), Laval/Montréal food distributor product page. | Current Québec retail title uses `Riz à sushi calrose` for a 20 kg item. This is product-label evidence for a named Calrose product, not a generic rice-class definition. |
| `WP03-MILLETFLAKES-QC-20261012-S07` | MITO Sushi, [Riz à sushi Calrose – 450 g](https://mito.ca/produit/riz-calrose-450-g/), product page. | Current Québec manufacturer page lists the ingredient as Calrose rice, storage cool and dry, and describes Calrose as medium grain. Supports the current retail label attached to one grain class; its use/cooking guidance is not generalized. |
| `WP03-MILLETFLAKES-QC-20261012-S08` | Casa Sabor, [Tous les produits](https://www.casa-sabor.ca/boutique/tous-les-produits), Québec retailer listing. | Current store page lists `Carey – Maïs Pozolero Blanc` with an add-to-cart option. The linked detail page was not retrievable in this review, so no package or processing claim is inferred from the listing. |
| `WP03-MILLETFLAKES-QC-20261012-S09` | Rancho Latin Market, [Maïs blanc Hominy à la mexicaine / Maíz Pozolero Blanco](https://rancholatinmarket.ca/fr/products/goya-white-hominy-corn-mexican-29-oz-maiz-pozolero-blanco-grande-hominy-822g-by-goya), French product page. | The Québec-market listing titles the item as white hominy, calls it `Maíz Pozolero Blanco`, and says it is ready to serve. This is direct product-specific evidence of label overlap for a prepared/packed item, not the dry pozole grain. |
| `WP03-MILLETFLAKES-QC-20261012-S10` | Canadian Food Inspection Agency, [Canadian Feed Ingredients Table](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail), corn/by-product entries. | Current federal feed table mentions pearled hominy in defining a feed by-product. This is animal-feed scope and does not establish a human-food common name or Québec display. |

## Verification

Sources S01–S04 are now registered on `ingredient-ref-millet-flakes`; S05–S10 remain proposal-local. The proposal is UTF-8 without a BOM. No tests or emulator checks were run because this integration only adds database JSON data and its generated index under `AGENTS.md`.
