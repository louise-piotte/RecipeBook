# WP03 Section F — Chulpe corn identity review (R161)

## Review record

- **Reviewed:** 2026-10-16.
- **Open checklist:** Continue remaining grain and cereal coverage under [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L519). The integrated R160 Section F review held the ambiguous phrase “barley berries”; it did not review Chulpe maize.
- **Recommendation:** Add one identity-only reference for dried, whole Chulpe kernels sold for cooking or toasting. Use the source-supported Québec French display **`maïs chulpe`** and English display **`Chulpe corn`**. Keep the reference distinct from generic corn kernels, ordinary `maíz para tostar`, popcorn, and prepared toasted corn.
- **Unallocated candidate key:** `candidate-chulpe-corn` (proposal subject only; no ledger candidate is proposed).
- **Prospective reference / ledger ID:** `ingredient-ref-chulpe-corn` (unallocated; no active object currently owns it).
- **Proposal-local source IDs:** `WP03-CHULPE-CORN-R161-20261016-S01` through `S13`. They remain local to this proposal and are not shared-ledger allocations.
- **Scope:** Proposal only. No shared catalog JSON, generated Kotlin, research ledger, checklist, roadmap, recipe, or batch README was changed.

## Why this is a distinct, bounded grain identity

Current Quebec-facing food use supports the French name: Kawsay Montréal’s French menu lists `maïs chulpe` in its locro de papa, and Québec City retailer Épicerie Tropica lists a Peruvian product as `Maiz Chulpe` [S01, S02]. The retail listing does not define its processing state, so the product state comes from direct grain-product sources. Goya Europe lists `Maíz chulpe` as a grain, says it must be cooked before eating, and describes its Andean kernel as becoming crisp when toasted [S04]. La Salmantina sells whole Chulpi kernels as a cereal and gives a raw-kernel toasting method [S07]. Together these support a dry whole-kernel ingredient that is cooked or toasted, rather than a ready-to-eat snack.

The variety spelling is not uniform. A Québec seed listing groups `Chullpi` with `Ch'ullpi`, `Chulpi`, and `Chulpe`; Peru’s INIA describes the Chullpi race and distinguishes it from a named improved hybrid derived partly from Chullpi [S03, S08]. These spellings support search aliases for the same named variety, but do not justify broadening the reference to every corn product used for toasting.

Keep the product boundary narrow. Goya Europe lists `Maíz para tostar` as a separate product from `Maíz chulpe`, with its own description of soft, floury kernels [S04, S05]. Goya US likewise lists `Chulpe Corn for Toasting` as a named product [S06]. The two product listings support a qualified Chulpe identity and do not make the generic phrase “corn for toasting” a synonym. Popcorn remains separate because it is a different named grain product and preparation behavior.

Do not add **`cancha`** or **`cancha tostada`** as aliases. Some sources use cancha for toasted Chulpi, while an importer separately lists dried Chulpe corn and dried cancha corn as distinct products; Goya’s recipe also uses Chulpe as the corn served toasted and calls the result cancha [S07, S10, S11]. The name therefore crosses variety, preparation, and market-product boundaries. A bare `cancha` query should not silently resolve to raw Chulpe kernels.

## Proposed row and picker effect

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-chulpe-corn` (unallocated) |
| English display | `Chulpe corn` |
| Québec French display | `maïs chulpe` |
| English aliases | `Chulpi corn`; `Chullpi corn` |
| French aliases | `maïs chulpi`; `maïs chullpi` |
| Category | `GRAIN_AND_CEREAL` |
| Default density / unit mappings | `null` / `[]` |
| Forms, package yields, conversions, recipe links, substitutions | None |

The local Québec menu wording supports `maïs chulpe` as the display; the French retailer’s `Maiz Chulpe` corroborates local market presence but is Spanish-style package wording, not a French terminology authority. The Chulpi and Chullpi aliases are spelling routes supported by the variety listing, not separate identities or claims that these spellings are Québec-preferred.

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which folds accents and punctuation and matches complete query phrases within a term before substring fallback. After the one-row addition, `Chulpe corn`, `Chulpi corn`, `Chullpi corn`, `maïs chulpe`, `maïs chulpi`, and `maïs chullpi` resolve to the proposed row. The Goya product phrase `Chulpe corn for toasting` is retained as source evidence but omitted as an alias because it would also make the broader `corn for toasting` query resolve to this single row. The broad `corn` and `maïs` searches gain one result; they remain broad searches. `corn kernels` continues to reach the existing generic-kernel row, and `cancha` and `corn for toasting` remain unassigned. No generic `corn`, `maïs`, or `maize` alias is proposed.

## Current ownership and archive audit

The post-R160 package snapshot has **1,535 references, 119 forms, 61 legacy candidates, and 1,880 research-ledger records**. The manifest contains **114 recipes and 1,123 ingredient rows**. Exact candidate terms and spelling variants were checked across active references, forms, legacy candidates, ledger records, and the prior proposal/batch archive. No Chulpi/Chulpe/Chullpi identity or alias, matching form, prior naming decision, candidate record, or proposed ID is present. The exact proposed ID strings above are unallocated.

| Existing neighbor | Current owner and effect |
|---|---|
| Generic corn kernels | `ingredient-ref-corn-kernels`, `corn kernels / maïs`, currently categorized `VEGETABLE_AND_AROMATIC`; no Chulpe aliases. Keep broad corn naming there. |
| Dried sweet corn kernels | `ingredient-ref-dried-sweet-corn-kernels`, a separately qualified product; do not transfer its source-specific portion observation to Chulpe. |
| Popcorn | `ingredient-ref-popcorn`, `popcorn / maïs soufflé`, with `maïs éclaté`; keep the ready-to-pop grain separate. |
| Toasted corn germ | `ingredient-ref-toasted-corn-germ`; a different kernel component, not whole Chulpe grain. |
| Cornmeal and corn grits | Existing milling products; no flour, meal, or grits alias or form is proposed. |

All 13 source URLs below were checked against current ledger ownership and were unregistered at proposal time. The `WP03-CHULPE-CORN-R161-20261016-S01…S13` IDs were also absent from the active ledger and earlier archive. If this proposal is integrated, register each source under one owner as appropriate; do not allocate these IDs to any other review in the meantime.

## Recipe demand, measurements, and substitutions

A scan of every manifest-listed recipe file and structured ingredient row found no `chulpi`, `chulpe`, `chullpi`, `cancha`, or `canchita` mention and no linked candidate ID. This is regional catalog coverage without bundled recipe demand.

No reusable amount or conversion is supported:

- Tropica’s **14 oz** and Goya’s **500 g** are product package sizes, not recipe quantities or volume-to-mass measures [S02, S04].
- A current third-party nutrition mirror reports **¼ cup (32 g)** for Goya UPC `041331025003`, but the manufacturer label and matching USDA FoodData Central record were not verified [S12]. Keep the figure proposal-scoped and non-reusable; do not create a ledger observation from the mirror alone.
- Aqua-Calc reports **128 g per US cup** and **135 g per metric cup**, derived from the same UPC and older USDA data. It is not independent evidence and is not a current primary record [S13]. Do not use it as density or a unit mapping.
- INIA reports a thousand-kernel mass for the specific improved hybrid INIA 614 Paccho, which derives from both local Chullpi and Mexican Cacahuazintle material. That agronomic cultivar measurement is not a household measure and cannot be transferred to the retail Chulpe product [S08].
- FAO’s approximately one tablespoon of oil per cup of kernels is a preparation-method ratio, not a kernel mass conversion. Goya’s one-bag recipe is served with a six-portion ceviche recipe and supplies neither a Chulpe package mass nor a reusable toasted-kernel yield [S09, S11].

If integrated, use `measurementState: researched_no_supported_value`, `defaultDensity: null`, and `unitMappings: []`; create no form, measure observation, package yield, or cooking-yield record. The global and contextual substitution files currently contain no rules. FAO mentions other varieties used for cancha, but the sources provide no tested Chulpe replacement ratio or recipe-context validation; add no global or contextual substitute. Do not substitute popcorn or generic toasting corn by assumption.

## Bounded integration recommendation and reopening conditions

If accepted, add only the single `GRAIN_AND_CEREAL` reference above and an `ingredient_reference` ledger record with `recordId: ingredient-ref-chulpe-corn`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Keep forms, density, mappings, conversions, yields, recipe links, and substitution links empty. Keep `cancha`, generic `toasting corn`, and finished toasted kernels outside this row’s aliases.

Reopen measurement work when a manufacturer label or exact USDA FoodData Central record confirms the Chulpe product serving and measure, or when replicated household-measure data identifies the product and method. Reopen cooking-yield or substitution work only when a source identifies the exact Chulpe product, cooking method, dish context, and supported quantity relationship. Revisit `cancha` only if independent evidence establishes a stable raw-product name that does not collide with the prepared snack or other corn products. Revisit the French display if Québec food sources establish a more widely preferred term than `maïs chulpe`.

## Source register

The IDs in this table are proposal-local and unallocated. Current pages were checked on 2026-10-16 unless the source note says otherwise.

| Local source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-CHULPE-CORN-R161-20261016-S01` | Kawsay Montréal, [menu](https://kawsaymtl.ca/food/), French locro de papa entry. | Uses `maïs chulpe` in a current Québec French food menu. Supports local food-use wording, not a package state, variety specification, or measure. |
| `WP03-CHULPE-CORN-R161-20261016-S02` | Épicerie Tropica, [Maiz Chulpe](https://epicerietropica.com/product/maiz-chulpe/), product title and description. | Québec City retailer lists a 14 oz Peruvian product. Supports local market presence and the source spelling; the package size is not a recipe measure and the listing does not define preparation state. |
| `WP03-CHULPE-CORN-R161-20261016-S03` | Semences Solana, [other vegetables and maize listings](https://ww21.solanacom.com/autreslegumes.html), Chullpi entry. | Groups `Maïs Chullpi (Ch'ullpi, Chulpi, Chulpe)`. Supports spelling relationships for the variety from a seed seller, not food-grade retail or Québec food nomenclature. |
| `WP03-CHULPE-CORN-R161-20261016-S04` | Goya Europe, [Maíz chulpe](https://goya.es/productos/granos/maiz/chulpe-goya), product title and description. | Lists 500 g Chulpe grain, says to cook before consuming, and describes its toasted texture. Product/package evidence; 500 g is not a kitchen measure. |
| `WP03-CHULPE-CORN-R161-20261016-S05` | Goya Europe, [Maíz para tostar](https://goya.es/productos/granos/maiz/tostar-goya), product title and description. | Separately lists 500 g and 25 kg toasting corn with soft/floury kernel description. Supports a separate product boundary, not a universal distinction among all corn varieties. Package sizes are not measures. |
| `WP03-CHULPE-CORN-R161-20261016-S06` | Goya US, [Corn product category](https://www.goya.com/en/product-subcategory/beans-grains-and-peas/peas-dry-beans-and-other-grains/corn/), Chulpe listing. | Lists `Chulpe Corn for Toasting` as a qualified product. The detail page was not accessible during review; this category listing supports the name only. |
| `WP03-CHULPE-CORN-R161-20261016-S07` | La Salmantina, [Chulpi Corn](https://www.lasalmantina.com/en/productos/category-cereals/chulpi-corn/), product description and instructions. | Categorizes whole Chulpi as cereal, describes small kernels consumed toasted, and gives an oil-toasting method. Its statement that toasted Chulpi is called cancha tostada does not make bare cancha an unambiguous raw-grain alias. |
| `WP03-CHULPE-CORN-R161-20261016-S08` | Peru INIA, [INIA 614 Paccho technical sheet](https://www.inia.gob.pe/wp-content/uploads/investigacion/programa/sistProductivo/variedad/maiz-amilaceo/INIA_614.pdf), variety origin and thousand-seed-weight section. | Describes the Chullpi race and says INIA 614 derives from local Chullpi and Mexican Cacahuazintle; gives a cultivar-specific thousand-seed weight. The weight is agronomic and not transferable to Chulpe retail kernels or household measures. |
| `WP03-CHULPE-CORN-R161-20261016-S09` | FAO, [Traditional High Andean Cuisine](https://www.fao.org/4/i1466e/i1466e.pdf), toasted-kernel preparation. | Describes Chulpe/Chulpi and mentions other varieties used for cancha; gives an oil-per-cup method ratio. It does not establish kernel mass, yield, or a substitution ratio. |
| `WP03-CHULPE-CORN-R161-20261016-S10` | Peruvian Import / Peimco, [catalogue](https://peruvianimport.com/wp-content/uploads/2022/09/Peimco_Catalog_60_090622_rev.pdf), p. 6. | Lists dried Chulpe / `Maiz Cancha Chulpe` separately from dried `Cancha` corn with package-size options. Supports product-name ambiguity; package sizes are not measures. |
| `WP03-CHULPE-CORN-R161-20261016-S11` | Goya US, [Peruvian fish ceviche recipe](https://www.goya.com/en/recipes/peruvian-fish-ceviche/), ingredient list and serving statement. | Uses a bag of Goya Chulpe as a toasted side and yields six servings of the complete ceviche recipe. The recipe does not give a product mass, kernel yield, or individual snack portion. |
| `WP03-CHULPE-CORN-R161-20261016-S12` | NutritionDataList, [Goya Chulpe Corn for Toasting UPC 041331025003](https://nutritiondatalist.com/product/chulpe-corn-for-toasting-upc-041331025003), serving information. | Third-party mirror reports ¼ cup (32 g) and points to USDA data. The primary label and matching USDA record were not verified; this is a non-reusable lead only. |
| `WP03-CHULPE-CORN-R161-20261016-S13` | Aqua-Calc, [Chulpe Corn volume-to-weight page](https://www.aqua-calc.com/calculate/food-volume-to-weight/substance/chulpe-blank-corn-blank-for-blank-toasting-coma-and-blank-upc-column--blank-041331025003), calculation notes. | Reports US and metric cup weights derived from the same UPC and older USDA data. It is a secondary calculation, not an independent or current primary measure source. |

## Review checks

- Rechecked exact phrase ownership, proposed IDs, source-ID prefix, and source URLs against the live reference, form, legacy, ledger, proposal, and batch files; no exact candidate owner or URL/source-ID collision was found.
- Parsed all 114 manifest-listed recipes and their 1,123 ingredient rows; found no candidate-name hits or linked candidate ID. Confirmed current global and contextual substitution rule files have no entries and the only package-yield record is for black beans.
- No tests, build, emulator, or deployment were run. This is a proposal-only Markdown file; no database JSON data was changed.
