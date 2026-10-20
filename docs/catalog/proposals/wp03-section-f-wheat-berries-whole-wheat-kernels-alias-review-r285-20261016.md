# WP03 Section F R285 — whole-wheat-kernels alias review

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Integrated. See [R285 integration README](../batches/wp03-section-f-wheat-berries-alias-integration-r285-20261016/README.md).
- **Target anchor:** The open Section F aggregate at [`docs/RecipeBook-global-ingredient-catalog-plan.txt:533`](../../RecipeBook-global-ingredient-catalog-plan.txt#L533), “Continue remaining Section F identity and terminology coverage.” This is a terminology gap on the already integrated `wheat berries / grains de blé entiers` identity; it is not a new ingredient identity.
- **Scope:** Assess the English search phrase `whole wheat kernels` for the existing generic wheat-berries reference, including picker behavior, bundled demand, product boundary, measures, forms, conversions, and substitutions.
- **Recommendation:** Add `whole wheat kernels` as the sole new English alias on `ingredient-ref-wheat-berries`. Keep the existing display pair and French aliases unchanged. Add no identity, form, measure, mapping, conversion, yield, recipe link, or substitution rule.
- **Source-ID prefix:** `WP03-WHEAT-KERNELS-R285-20261016-S`. Sources S01–S03 were allocated to the existing wheat-berries research-ledger record during integration.

## Existing identity and product boundary

The live reference is `ingredient-ref-wheat-berries`, displayed as `wheat berries / grains de blé entiers`, in `GRAIN_AND_CEREAL`. It currently has no aliases, a null default density, and empty unit mappings. Its accepted ledger record already defines wheat berries as intact edible whole-wheat kernels retaining bran, germ, and endosperm, and distinguishes them from cracked wheat, bulgur, flour, and species-specific wheat references [WP03-S57–S59].

The proposed alias names that same generic whole-kernel food product. Canadian Food Focus explicitly describes wheat berries as whole wheat kernels that have not been processed or milled [S01]. A current Canadian retailer also uses `whole wheat kernels` as a name for wheat berries in a food-product description [S02]. The full phrase is appropriately more specific than bare `wheat`; it does not assert a wheat class, cultivar, origin, or organic status.

Keep the existing distinctions:

| Neighbor | Current owner | Boundary |
|---|---|---|
| Generic wheat berries | `ingredient-ref-wheat-berries` | Whole, intact edible kernels without a claimed variety or class. Add only the exact English alias proposed here. |
| Named wheat-berry classes | `ingredient-ref-durum-wheat-berries`, the hard/soft seasonal rows, and `ingredient-ref-red-fife-wheat-berries` | Preserve each qualified identity. Do not add `whole wheat kernels` to a particular class or infer a class from the unqualified phrase. |
| Sprouted wheat berries | `ingredient-ref-sprouted-wheat-berries` | Keep germinated and dried kernels separate from unsprouted whole kernels. |
| Cracked wheat, bulgur, wheat flour/meal, wheat germ, and bran | Existing separate identities | These are processed grains or separated milling parts, not aliases for intact kernels. |
| Planting seed or wheatgrass seed | Outside this alias | A food ingredient search term does not establish planting or sprouting-seed use. |

Do not add `whole wheat`, `whole grain wheat`, `wheat grain`, `wheat seeds`, or a French alias. Those expressions are broader, can describe other wheat products or planting seed, or are unnecessary because the approved French display already owns `grains de blé entiers`.

## Exact ownership and source audit

At the review snapshot, the active generic row has no English aliases. Exact searches across active reference names/aliases, form labels/match terms, legacy-import candidates, and the research ledger found no exact owner for `whole wheat kernels` or `wheat kernels`. No focused proposal or hold allocates either phrase to another identity. The broader archive mentions wheat kernels only while describing whole-kernel product boundaries; it does not decide this picker alias.

The existing source IDs `WP03-S57` (federal bilingual whole-wheat-grain specification) and `WP03-S58` (Arva Flour Mills product page) already belong to the accepted wheat-berries ledger record. Reuse those records as boundary context; do not reassign either ID. The three R285 source IDs below and their URLs were absent from the live research ledger and proposal/batch archive when checked. No new ingredient or form ID is proposed.

## Picker projection

The static projection follows the current phrase-first, accent-folding search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). A complete phrase in any display or alias term takes priority over substring fallback. This is a source-code projection, not live Android picker QA.

| Query | Current result | With proposed alias | Effect |
|---|---|---|---|
| `whole wheat kernels` | No result | `ingredient-ref-wheat-berries` only | Exact new alias returns the existing generic row. |
| `wheat kernels` | No result | `ingredient-ref-wheat-berries` only | The query phrase occurs within `whole wheat kernels`; no second alias is needed. |
| `grains de blé entiers` | `ingredient-ref-wheat-berries` only | Same | Existing French display remains unchanged. |
| `wheat berries` | 11 references, including the generic and qualified wheat-berry rows | Same 11 | The new alias does not displace the qualified choices. |
| `whole wheat` | 7 whole-wheat product references | 8, adding `ingredient-ref-wheat-berries` | The added generic whole-kernel choice is appropriate for this broad query. |
| `kernels` | 11 references, a multi-result query | 12, adding `ingredient-ref-wheat-berries` | The query remains multi-result and does not silently select wheat. |
| `wheat` | 61 references | Same 61 | No change to the broad wheat result set. |

Retain the complete `wheat berries` display on the picker result. The alias is a search term, not a shorter display or a claim that all wheat products are wheat berries.

The unqualified `wheat kernels` phrase intentionally returns the generic whole-kernel choice alone; it does not state durum, hard/soft class, season, or cultivar. Users who need a named wheat class can search its existing qualified name. Do not copy this broad alias onto the named-class rows.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for `whole wheat kernels`, `wheat kernels`, `wheat berries`, `grains de blé entiers`, and the existing reference ID. The scan found zero matching recipe files, zero matching ingredient rows, and zero direct links to `ingredient-ref-wheat-berries`. No recipe relinking, amount, form hint, or recipe-text change is supported.

## Forms, measurements, conversions, and substitutions

- **Forms:** Add none. `Whole wheat kernels` is another name for the existing intact-kernel identity, not a dry/cooked, sprouted, cracked, or milled form. The corpus has no wheat-berry use requiring a preparation hint.
- **Measures:** Add no reusable measure. A current Healthy Planet listing shows a 30 g Nutrition Facts serving for one Oak Manor hard-wheat-kernel SKU, while the seller separately identifies its 1 kg package [S03]. Neither quantity is generic wheat-berry household-measure evidence.
- **Density and unit mappings:** Keep `defaultDensity` null and `unitMappings` empty. No reviewed source establishes a reusable volume-to-mass value for generic wheat berries.
- **Conversions and yields:** Add none. Canadian Food Focus gives a qualitative cooking method, roughly one hour of simmering, and water “to completely cover” the grain [S01]; it does not provide a mass/volume ratio, dry-to-cooked yield, or standard cooking conversion. Do not transfer product-specific cook directions or package quantities to the generic row.
- **Substitutions:** Add no global or contextual rule. Canadian Food Focus describes wheat berries as an alternative to rice or pearled barley in some casseroles, soups, and salads [S01], but does not give a tested amount, method, or validated dish-role scope. This qualitative use statement is not a directed, quantity-qualified substitution rule under the project model.
- **Ledger research state if integrated:** The existing record can add the R285 sources and alias decision, set measurement research to `researched_no_supported_value`, and set substitution research to `researched_no_supported_substitute`. Keep numeric catalog fields and active rules empty.

## Sources

Sources were checked online on **2026-10-16**. Product stock, package size, and nutrition amounts are source-specific and are not generalized.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-WHEAT-KERNELS-R285-20261016-S01` | Canadian Food Focus, [Wheat Product: Wheat Berries](https://canadianfoodfocus.org/courses/wheat-from-farm-to-table/lessons/wheat-in-the-kitchen/topic/14847/), current educational page; checked 2026-10-16. | Directly calls wheat berries whole wheat kernels that have not been processed or milled, and explains the bran/endosperm/germ boundary. It also gives culinary uses and a qualitative cooking method. The page is an educational source, not a Canadian product standard or measure source. |
| `WP03-WHEAT-KERNELS-R285-20261016-S02` | Bulk Mart, [Clic Soft Wheat Kernels #1 — 2 lb](https://bulkmart.ca/collections/food/products/soft-wheat-kernels-1-2-lbs), current Canadian retail listing; checked 2026-10-16. | The product description calls the listed soft-wheat product `wheat berries` and `whole wheat kernels`. Its disclaimer says products are sold by title, cautions that descriptions can be inaccurate, and recommends checking package labels. Use as current market corroboration, not as a universal product specification. The 2 lb size is not a kitchen measure. |
| `WP03-WHEAT-KERNELS-R285-20261016-S03` | Healthy Planet, [Oak Manor Organic Hard Wheat Kernels, 1 kg](https://www.healthyplanetcanada.com/en/oak-manor-hard-wheat-kernels-organic-1kg.html), current Canadian retail listing; checked 2026-10-16. | Product page identifies hard, red spring wheat, gives cooking-whole/milling/flaking uses, and shows a 30 g Nutrition Facts panel. It confirms that `wheat kernels` is current Canadian food-product wording, but is a class-specific SKU and does not support a generic serving or conversion. |
| Reuse `WP03-S57` | Department of National Defence, [Food Quality Specifications — Cereal Grains (French)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), whole wheat grains specification. | Existing ledger record supports the French display `grains de blé entiers` and the whole-kernel grain boundary. Its URL/source ID remains owned by the existing wheat-berries record. |
| Reuse `WP03-S58` | Arva Flour Mills, [Soft Wheat Kernels 800 g](https://arvaflourmills.com/products/soft-wheat-berries-bulk), current Ontario mill product page. | Existing ledger record owns this URL and describes the same product as soft wheat kernels in its current title and soft wheat berries in the page body. Reuse it as boundary context; do not create a second source record. |

## Recommendation

**Add only `whole wheat kernels` to `ingredient-ref-wheat-berries.aliasesEn`.** Keep the existing bilingual display, category, forms, measures, density, unit mappings, recipe links, conversions, yields, and substitutions unchanged. If accepted, record the R285 research and the no-supported-measure/substitution findings on the existing wheat-berries ledger record. Section F remains open.
