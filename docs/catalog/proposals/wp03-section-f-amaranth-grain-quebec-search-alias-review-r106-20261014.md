# WP03 Section F R106: Amaranth-grain Québec French search alias review

- **Reviewed:** 2026-10-14.
- **Status:** Reviewed and integrated on 2026-10-14; independent human Québec display review remains open.
- **Decision:** Added the single French search alias `grains d'amarante` to the existing `ingredient-ref-amaranth-grain` row. Kept `amarante` as the French display and `amaranth` as the English display. This source review does not claim an independent human Québec display sign-off; the separate display-review checklist remains open.
- **Scope:** An alternate French product phrase for the existing edible amaranth-seed grain identity. No new identity, form, measure, density, unit mapping, conversion, yield, recipe link, or substitution is proposed.
- **R106 source IDs:** `WP03-AMARANTH-GRAIN-QC-R106-20261014-S01` through `S05`; these five records are now appended to the amaranth-grain ledger row.

## Open plan item and prior-review boundary

The Section F packet still asks for independent Québec French review of `amarante` as the display for edible-seed cereal, alongside two quick-oats phrases ([plant-grains-cereals checklist](../batches/plant-grains-cereals.md#L532)). The global plan's [R96 teff-alias checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L14874) explicitly leaves the independent human Québec display review and Section F open. The current roadmap likewise keeps Section F open after its [R103 Shreddies hold](../../../roadmap.md#L801) and [R96 teff alias](../../../roadmap.md#L814). This proposal addresses only the grain's French search wording.

The existing [R9 review](wp02-a6-next-regional-flour-gap-review-20261013-round9.md) added English `ramdana` to the grain row and `ramdana flour` to the separate flour row. It explicitly left French wording unchanged. The later [Québec French wording review](wp02-a6-quinoa-amaranth-quebec-wording-review-20261011.md) concerned quinoa-flour and sprouted-amaranth-flour displays, not the whole-grain query phrase proposed here. This is therefore a distinct French search-coverage gap, not a reopening of either accepted review.

## Ownership and identity boundary

The live reference is already `ingredient-ref-amaranth-grain`, with `amaranth / amarante`, English alias `ramdana`, category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and no unit mappings. The related references are separately named:

| Reference | Current English / French display | Boundary |
|---|---|---|
| `ingredient-ref-amaranth-grain` | `amaranth / amarante` | Edible amaranth seeds used as a grain; this is the only target. |
| `ingredient-ref-amaranth-flour` | `amaranth flour / farine d'amarante` | Milled flour; retain its existing English aliases `rajgira flour`, `rajgira atta`, and `ramdana flour`. |
| `ingredient-ref-amaranth-flakes` | `amaranth flakes / flocons d'amarante` | Flaked product. |
| `ingredient-ref-amaranth-greens` | `amaranth greens / feuilles d'amarante` | Edible leaves, category `VEGETABLE_AND_AROMATIC`. |
| `ingredient-ref-puffed-amaranth` | `puffed amaranth / amarante soufflée` | Expanded/puffed product. |
| `ingredient-ref-sprouted-amaranth-flour` | `sprouted amaranth flour / farine d'amarante germée` | Flour made from sprouted grain. |

Before R106, an exact-key audit found no owner for `grains d'amarante` in active reference names or aliases, forms, legacy-import candidates, or the ledger. The legacy list has no amaranth candidate. The grain ledger is identity-verified. The R9 sources establish the regional name `ramdana`, not this French phrase. R106 added the French alias and set measurement research to `researched_no_supported_value` after reviewing product-specific cooking directions; substitution research remains `not_yet_researched`.

Keep the generic food identity at its existing scope. OQLF's cereal entry discusses *Amaranthus caudatus*, while Ontario's Ministry of Agriculture crop profile describes grain amaranth across several *Amaranthus* species. Neither supports narrowing the existing generic row to a single species. Keep the leaf, flour, flakes, puffed grain, and sprouted flour rows distinct.

## Naming recommendation and exact data delta

OQLF lists feminine `amarante` as the preferred Québec French term for the edible-seed cereal and gives English `amaranth`. A Québec-addressed Moulin Abénakis product page uses `Amarante biologique en grains`; a Québec distributor's product listing uses the exact ingredient phrase `Grains d'amarante biologiques`. These sources support retaining the existing display and adding the product phrase as a search alias.

The sole reference delta was:

```json
{
  "id": "ingredient-ref-amaranth-grain",
  "aliasesFr": ["grains d'amarante"]
}
```

This patch preserves the existing English display and alias, category, null density, and empty mappings. Do not add `amaranthe`: OQLF's separate entry defines that spelling as a red-brown coloring powder. Do not add `kiwicha`: it is mentioned as a regional English term in the OQLF translation field, but the current reference and R9 review intentionally keep the broader regional naming boundary unexpanded.

## Picker projection

The static projection follows the application's normalized phrase-first search and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The added phrase belongs only to the grain reference.

| Query | Before R106 | After R106 | Effect |
|---|---|---|---|
| `grains d'amarante` / `grains d’amarante` | 0 | `ingredient-ref-amaranth-grain` | Resolves the exact French product wording to the edible-seed grain. |
| `grains` | 22 reference results | 23 reference results, including `ingredient-ref-amaranth-grain` | This broad query gains one result; the exact multiword phrase still returns only the grain identity. |
| `amarante` | 6 amaranth-related rows | Same 6 | Broad French query remains a multi-choice search across grain, flour, flakes, greens, puffed amaranth, and sprouted-amaranth flour. |
| `amaranth` | 6 amaranth-related rows | Same 6 | Broad English query is unchanged. |
| `farine d'amarante` | Amaranth flour and sprouted-amaranth flour | Same 2 | Both are product-qualified; the new grain alias does not capture flour wording. |
| `amaranth flour` | Amaranth flour and sprouted-amaranth flour | Same 2 | Existing flour distinction remains. |
| `amaranthe` / `kiwicha` | 0 | 0 | Neither spelling is proposed as an alias. |

The exact new query had no owner before R106 and now returns one specific existing identity. The broader `amarante` results remain visible choices rather than silently merging grain, flour, leaf, and processed products.

## Recipe demand, measures, forms, and substitutions

The manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. A full serialized-file and structured-row scan for both apostrophe forms of `grains d'amarante`, `amaranth`, `amarante`, `ramdana`, `kiwicha`, `amaranthe`, and the six related reference IDs found **zero matching files, rows, or direct reference links**. No bundled recipe currently calls for this grain or the proposed alias.

The grain row has no attached ingredient form, active density, unit mapping, global substitution rule, or contextual substitution rule. The live global and contextual substitution-rule files are both empty. Do not add a cooked-grain form or a grain-to-cooked conversion from retail cooking directions. The product-specific directions differ: the Québec distributor page gives 1/3 cup grain to 1 cup water for 30 minutes, while another Canadian French product page gives 1 cup amaranth to 2 cups water for 20 minutes and an approximate cooked yield. These are product directions, not transferable measures, densities, conversions, or yields. The target ledger's substitution status remains `not_yet_researched`; this alias review does not attempt to resolve it. Do not infer equivalence among grain, flour, flakes, puffed grain, or other grains.

## Sources checked 2026-10-14

The two OQLF sources were reopened for this review; their existing ledger source IDs are reused rather than proposed as new source records. New proposal-local source IDs are used only for the additional source pages below.

| Source ID | Source and date | Evidence and limit |
|---|---|---|
| Existing `WP03-S23` | Office québécois de la langue française, [GDT: *amarante*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), last updated 2009; reopened 2026-10-14. | Lists feminine `amarante` as the preferred term, gives English `amaranth`, defines a cereal from edible seeds, and says the seeds may be used whole or milled into flour. Its species example is *A. caudatus*; it is not used to narrow every commercial grain product to that species. |
| Existing `WP03-S48` | Office québécois de la langue française, [GDT: *amaranthe*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8884624/amaranthe), entry dated 1983; reopened 2026-10-14. | Defines the visually similar spelling as a red-brown powder used to color food. This supports keeping it out of the grain aliases. |
| `WP03-AMARANTH-GRAIN-QC-R106-20261014-S01` | Moulin Abénakis, [Amarante biologique en grains](https://moulinabenakis.com/products/amarante-grains-bio), manufacturer page; ©2026, checked 2026-10-14. | The French product title identifies amaranth sold in grain form. The page lists the distributor's Saint-Léonard, Québec address. It supports Québec market terminology and identity, not a universal species, cooking method, or amount. |
| `WP03-AMARANTH-GRAIN-QC-R106-20261014-S02` | Le Monde au Naturel, [Amarante bio 500 g](https://shop.mondenaturel.ca/products/amarant-bio-500g), checked 2026-10-14. | The Québec distributor's product description says `Ingrédient : Grains d'amarante biologiques`, the exact proposed phrase. The indexed page was last crawled about 1.1 years ago and currently says to request notice when the product returns; use only for wording, not present availability. Its package cooking directions remain SKU-specific. |
| `WP03-AMARANTH-GRAIN-QC-R106-20261014-S03` | Artisan Tradition, [Grains et céréales](https://www.artisan-tradition.ca/grains-cereals), checked 2026-10-14; search crawl last month. | The French product listing uses `Amarante Bio`, names `Amarante` as the ingredient, and gives one product's 500 g format and preparation instructions. It independently supports French edible-grain usage; the package mass and cooking directions are not generic measures. |
| `WP03-AMARANTH-GRAIN-QC-R106-20261014-S04` | Ontario Ministry of Agriculture, Food and Agribusiness, [Amarante – grain](https://omafra.gov.on.ca/CropOp/fr/field_grain/spec_grains/gama.html), checked 2026-10-14; page search crawl is old. | The crop profile uses `amarante à grains`, lists *A. caudatus*, *A. cruentus*, and *A. hypochondriacus*, and describes culinary grain uses. It supports the multi-species grain boundary, not current retail availability or a Québec display ruling. |
| `WP03-AMARANTH-GRAIN-QC-R106-20261014-S05` | Walmart Canada, [Abenakis Grains d'Amarante Biologiques](https://www.walmart.ca/fr/ip/Abenakis-Grains-d-Amarante-Biologiques-Sans-Gluten-1-Lb/3U11S2TFBT9C), search listing crawled last month, checked 2026-10-14. | The Canadian French-facing marketplace title independently attests the phrase `Grains d'Amarante`; direct page retrieval returned a cache miss. Use only the title as naming evidence, not seller copy, composition, stock, package size, or preparation. |

## Disposition and limits

Add one French search alias to the existing grain row. Preserve `amaranth / amarante` as the displays, preserve English `ramdana`, and keep all adjacent product identities separate. Leave forms, unit mappings, substitutions, yields, and recipe links unchanged. The ledger now records that differing retail cooking directions do not support a transferable measure, conversion, or yield. No recipe demand was found.

This is an evidence review, not an independent human Québec-language approval. Keep the checklist request for independent display review open until that review is separately completed; the alias recommendation does not by itself close it. The larger Section F regional cereal and processed-grain checklist also remains open.

## Static checks and testing

- The pre-change ownership audit covered 1,445 live ingredient references, 105 forms, 63 legacy candidates, and 1,785 ledger records; the French alias had no exact existing owner.
- The current application search behavior was read from `IngredientSearch.kt`; the before/after projections above were reproduced statically from all live reference and form search terms plus the proposed alias.
- The complete manifest scan covered all 114 bundled recipe files and 1,123 ingredient rows; no candidate-term or direct-reference demand was found.
- Root added the alias to the reference, appended five source records and two decisions to its ledger row, regenerated the Kotlin search index, and updated the global plan and roadmap. See the [R106 integration record](../batches/wp03-section-f-amaranth-grain-search-alias-integration-20261014/README.md).
- No app, Gradle, instrumentation, or emulator tests were run because the active catalog change adds database JSON data.
