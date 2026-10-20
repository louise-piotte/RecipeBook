# WP03 Section F: Rye bran identity review — 2026-10-13 (R58)

## Review record

- **Status:** Accepted and integrated on 2026-10-13 as identity-only `ingredient-ref-rye-bran` / `rye bran / son de seigle` in `GRAIN_AND_CEREAL`.
- **Open checklist:** Section F continues to call for remaining grain and processed-cereal identities, including regional/preprocessed grains ([global plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) and [regional cereal item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2631)).
- **Scope:** Food-grade rye bran as a distinct rye-milling fraction. This does not cover rye flour or meal, whole rye grain, rye feed, mill-run products, or formulated foods containing rye bran.
- **Source-ID prefix:** `WP03-RYE-BRAN-20261013-R58-`; checked absent from the live ledger and proposal/batch archive before drafting. This WP03-specific prefix is distinct from the WP02 A7 R58 proposal prefix.
- **Decision:** Add one identity-only `GRAIN_AND_CEREAL` reference named **`rye bran / son de seigle`**, with no aliases. Current Canadian product listings use `rye bran` as a food ingredient, a current Québec retailer's French ingredient list uses `son de seigle`, and CFIA requires the grain source to be named for non-wheat bran. Treat the French display as Québec-market-attested wording, not an OQLF ruling. No forms, measures, density, unit mappings, package yields, conversions, recipe links, or substitutions were added.

## Product identity and naming boundary

Rye bran is a separately named milling fraction of rye, distinct from rye grain and rye flour. A peer-reviewed industrial milling study collected rye bran as one of the main fractions alongside wholemeal and white flour; the study's process and fraction yield are industrial observations, not a home-kitchen definition or conversion [S03]. A current Australian food manufacturer also sells a one-ingredient rye-bran product [S04]. Canadian food listings use `Rye bran` in ingredient declarations, and a current French-language Québec listing uses `son de seigle` [S05–S07].

Use the source-attested bilingual pair **`rye bran / son de seigle`** for the food-grade milling fraction. CFIA says unqualified `bran / son` conventionally means wheat bran and that a different grain source must be named; its French guidance gives `son d'avoine` as an example [S01–S02]. The reviewed Québec retailer uses the exact phrase `son de seigle` in a product ingredient list [S05]. No OQLF terminology record for this exact compound was located in the targeted search; do not describe it as an OQLF-preferred term.

| Candidate or nearby product | Decision | Boundary |
|---|---|---|
| `rye bran / son de seigle` | **Recommend one identity-only reference.** | Food-grade bran fraction from rye milling; retain the grain qualifier in both languages. |
| `bran / son` | Do not add as an alias. | CFIA reserves unqualified bran wording for wheat bran. |
| Rye grain, rye berries, cracked rye, rye flakes | Keep their existing identities. | Whole kernels and processed grain formats are not the bran fraction. |
| Rye flour, whole-rye flour, rye meal, malted rye flour | Keep their existing identities. | Flour and meal are milling products with different scopes; do not add `rye bran` as an alias to them. |
| Rye feed, rye mill run, rye middlings, and feed-grade by-products | Exclude. | Feed or mixed milling by-products are not established as the human-food bran ingredient reviewed here. Do not assign their names to this row. |
| Rye crispbread, multigrain cereal, bran flakes, and other prepared products | Exclude. | A food containing rye bran is not itself the rye-bran ingredient. |

## Live ownership and archive audit

Read-only snapshot after the integrated barley-bran R56 update: **1,382 active references, 100 forms, 63 legacy-import candidates, and 1,713 research-ledger records**. Exact checks use the repository's `normalizeIngredientSearchKey` behavior: case-folding, accent folding, ligature expansion, and punctuation normalization.

| Surface | Current exact owner or relevant neighbor | Disposition |
|---|---|---|
| Active ingredient references | No exact owner for `rye bran`, `son de seigle`, or checked inflections/qualified phrases. Nearby references include rye grain, rye berries, cracked rye, rye flakes, rye meal, rye flours, and the separate wheat/oat/rice/corn/barley bran references. | Allocate a separate rye-bran identity; do not merge it with rye grain/flour/meal or another cereal's bran. |
| Forms | None of the 100 forms has an exact rye-bran or `son de seigle` label or match term. | Add no `IngredientForm`; the proposal is an ingredient identity, not a dry/cooked or milling-grade form under rye grain. |
| Legacy import | No exact name, alias, or ID owner among the 63 legacy candidates. | No legacy promotion or remapping. |
| Research ledger | No exact rye-bran identity/candidate record ID or exact display/alias owner among the 1,713 records. | The rye-bran review is new; do not alter the existing rye or other bran records as part of this proposal. |
| Proposal/batch archive | No focused rye-bran identity or terminology review and no previous `WP03-RYE-BRAN-20261013-R58-` source registration. | This is a separate cereal-milling-fraction review after R56 barley bran, not a reopening of R56 or the existing rye-grain/meal/flour decisions. |
| Proposed identifiers | `ingredient-ref-rye-bran` and any rye-bran candidate ID are absent from the active references, forms, legacy identities, and ledger record IDs. | Root can allocate the active ID during integration if the proposal is accepted. |

Exact phrase ownership was checked for `rye bran`, `rye brans`, `son de seigle`, `son de seigle bio`, `bran of rye`, `rye bran flakes`, `rye bran cereal`, `rye bran meal`, `seigle bran`, `son seigle`, `rye mill run`, and `rye middlings`. No exact active reference, form, legacy identity, or ledger identity owner exists. The catalog does already contain separate rye identities and five other bran-related references (wheat, oat, rice, corn, and barley bran, plus bran-flakes cereal); those remain unchanged.

The proposal-local IDs `WP03-RYE-BRAN-20261013-R58-S01` through `S07` were checked against all live ledger source IDs and existing proposal/batch files; none is already allocated. They remain proposal-local and are not ledger additions.

## Picker consequences

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers complete normalized word-phrase matches, then falls back to substring matching. The projection below adds only the bilingual display and no aliases or forms.

| Query | Current results | Projected results | Consequence |
|---|---:|---:|---|
| `rye bran` | 0 | 1 | Exact English query selects the proposed reference. |
| `son de seigle` | 0 | 1 | Exact French query selects the proposed reference; apostrophe/accent normalization does not add another owner. |
| `bran` | 7 | 8 | Broad query gains one clearly named grain-specific bran result. It also returns bran flakes, rice bran oil, and other bran identities today. |
| `rye` | 10 | 11 | Broad rye query gains one clearly labeled rye milling fraction among the existing rye grain, meal, flake, and flour choices. |
| `seigle` | 10 | 11 | French broad query gains the same labeled rye-bran product among existing rye choices. |
| `wheat bran`, `son de blé`, `oat bran`, `son d'avoine`, `rye flakes`, `rye flour` | Existing qualified owner(s) | Unchanged | Existing source-grain bran and rye flour/flake queries retain their owners. |

Do not add bare `bran`, `son`, `rye`, `seigle`, `rye meal`, `rye mill run`, or `rye middlings` as aliases. The primary display already makes the candidate searchable; broad aliases would increase ambiguity or collapse distinct milling products.

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 ingredient rows**. Each manifest-listed recipe was parsed and scanned across serialized text and each ingredient row's `originalText`, `ingredientName`, and `ingredientRefId`. Exact normalized searches for the candidate names and variants above found **zero recipe files and zero ingredient rows**. No bundled recipe currently calls for rye bran or links to a rye-bran identity. No recipe link or recipe edit is proposed.

## Numeric, form, and substitution evidence

- **Package and serving data:** Ryedical's current Australian product page describes a 250 g pouch of one-ingredient rye bran and gives a product-specific 13 g serving [S04]. Keep both values as SKU evidence only; neither is a reusable household measure or volume-to-mass pair.
- **Canadian product amounts:** A Canadian Save-On Foods listing for Rogers Rye Flour lists rye flour and rye bran together and reports `1/4 cup (30 g)` for the combined product [S07]. The listing was out of stock at review and does not state the component ratio; do not assign its amount to rye bran.
- **Density and mappings:** No reviewed source gives a generic rye-bran cup weight, fill method, or density. Keep `defaultDensity: null` and `unitMappings: []` if the identity is integrated.
- **Forms and yield:** The industrial paper's milling fractions and mass yields describe milling tests, not RecipeBook dry/cooked states or cooking yields [S03]. Add no form, conversion, or package/cooking yield.
- **Substitutions:** Sources describe rye bran as an ingredient or topping, but provide no validated recipe context and quantity-preserving replacement. Add no global or contextual substitutions with wheat, oat, rice, corn, or barley bran, flour, flakes, or whole rye.
- **Health claims:** Do not transfer fibre or health claims from commercial pages into catalog behavior or nutrition data.

## Source evidence

Sources were reviewed on 2026-10-13. New source IDs are local to this proposal and were absent from the live ledger at review time.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-RYE-BRAN-20261013-R58-S01` | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), “Common name — Bran.” | States that unqualified `bran` means wheat bran and that a different grain source must be named, giving oat bran as an example. Supports keeping rye explicit; it does not define rye-bran milling or prescribe its French term. |
| `WP03-RYE-BRAN-20261013-R58-S02` | Agence canadienne d'inspection des aliments, [Exigences d'étiquetage et de composition pour les céréales et les produits de boulangerie](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie), « Son ». | Gives the same source-grain rule in French and the example `son d'avoine`. Supports source-qualified French naming; it does not prescribe `son de seigle` specifically. |
| `WP03-RYE-BRAN-20261013-R58-S03` | Jaksics et al., [“Comparative compositional and functional characterisation of rye varieties and novel industrial milling fractions,” *International Journal of Food Science & Technology* 57(7) (2022)](https://academic.oup.com/ijfst/article/57/7/4463/7807373), methods and results. | Primary peer-reviewed milling study collects rye bran as a main fraction separately from wholemeal and white flour and describes industrial particle-size and yield measurements. It supports the milling-fraction boundary, not a household measure or generic process specification. |
| `WP03-RYE-BRAN-20261013-R58-S04` | Ryedical, [Rye Bran Fibre 250g — Cold-Processed, One Ingredient](https://www.ryedical.com/products/ryedical-rye-bran-250g-pouch), current product description. | Manufacturer identifies a one-ingredient Australian rye-bran product, a 250 g pouch, and an approximate 13 g serving. This is one source-specific product; direct page retrieval returned a cache miss, so it is not used as evidence of Canadian availability or generic measure behavior. |
| `WP03-RYE-BRAN-20261013-R58-S05` | Marché Tau, [Ryvita Pain de Seigle Croustillant Multigrains](https://marchestau.com/pain-croustillant-mutligrains-250gr), Québec retailer product page, French ingredient list. | Current page showed the 250 g product in stock and lists `son de seigle` within the ingredients. This directly attests the Québec-facing French phrase as an ingredient name; the crispbread recipe is not the rye-bran product itself and does not define the bran ratio. |
| `WP03-RYE-BRAN-20261013-R58-S06` | Metro Canada, [Rye and Oat Bran Rye Crispbread](https://www.metro.ca/en/online-grocery/aisles/snacks/salty-snacks/flatbreads-crisps/rye-and-oat-bran-rye-crispbread/p/078935005193), product listing and ingredients. | Current Canadian retailer listing names `Rye bran` and lists it beside whole grain rye flour, oat bran, and salt. The 250 g package belongs to the crispbread, not the bran ingredient; direct page retrieval returned 403 during this review. |
| `WP03-RYE-BRAN-20261013-R58-S07` | Save-On Foods, [Rogers Rye Flour, 2.5 kg](https://www.saveonfoods.com/sm/pickup/rsid/2220/product/rogers-rogers-rye-flour-id-00060179030215), ingredients and serving panel. | Canadian listing names rye bran in a rye-flour product and gives a combined-product `1/4 cup (30 g)` portion. It was out of stock on the page at review; the mixture ratio is absent, so the measure cannot be transferred to bran. |

## Proposed disposition

The live catalog row is `ingredient-ref-rye-bran` as **`rye bran / son de seigle`** in `GRAIN_AND_CEREAL`, with empty alias arrays, null default density, and empty unit mappings. Keep it distinct from rye grain, berries, cracked rye, meal, flour, flakes, feed by-products, and prepared cereals. Treat `son de seigle` as Québec product-ingredient wording rather than an OQLF ruling. No forms, measures, conversions, package yields, recipe links, or substitution rules were added. The bundle has no matching demand. Section F remains open.

## Root integration result

The catalog integration lead independently reopened CFIA's English and French bran-labeling guidance, the Jaksics et al. 2022 rye-milling study, and Marché Tau's current Québec Ryvita page. CFIA requires the source grain to be named in English and French for bran from a non-wheat grain. The milling study separates rye bran from wholemeal and white-flour fractions. Marché Tau shows the exact ingredient wording `son de seigle` in stock in a current Québec retailer listing. This supports the bounded identity; it does not turn product package or serving sizes into reusable measures.

The active row and `ingredient-ref-rye-bran` research-ledger record are integrated. The reference and package normalizers passed, the generated index now includes 1,383 references, and the ledger contains 1,714 records. No app tests or emulator checks were run because this change only adds database JSON data and its generated index.
