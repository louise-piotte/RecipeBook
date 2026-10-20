# WP03 Section F R173: Bob's Red Mill 8 Grain Hot Cereal identity review — 2026-10-16

**Recommendation: integrate one identity-only, brand-specific `GRAIN_AND_CEREAL` reference** for Bob's Red Mill's Canadian 8 Grain Hot Cereal, item P101125 / UPC 0-39978-00118-4. The live Section F parent remains open for regionally significant cereal mixes and preprocessed grains ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3503)); the existing 10 Grain Hot Cereal row covers a different SKU and formula. This is a product identity decision, not a generic eight-grain blend identity.

## Evidence and identity boundary

The 2026 Bob's Red Mill Canadian French product list names **Cereal, 8 Grain Hot, Gluten Free / Céréales chaudes 8 grains** and identifies Canadian item **P101125**, UPC **0-39978-00118-4**, GTIN **10039978001181**, and a **709 g** package. Its ingredient declaration lists gluten-free whole-grain oats, whole-grain brown rice, corn, soybeans, millet, whole-grain sorghum, oat bran, sunflower seeds, and flaxseed [S01]. This supports one named Canadian packaged blend. The label's “8 Grain” wording is a product name; the component declaration includes seeds and soy and does not support an “eight cereal species” taxonomy or component-level recipe links.

Well.ca's English listing uses **Bob's Red Mill Gluten Free 8 Grain Hot Cereal**, identifies the same 709 g product, and lists soybeans in the ingredient declaration [S02]. Its French listing uses **Bob's Red Mill Céréales chaudes à 8 grains sans gluten** [S03]. The retailer page reported “notify me” for availability when checked; it is used for bilingual product naming and matching package identity, not as evidence of current stock. The manufacturer list supplies the current Canadian SKU and composition.

Keep this SKU separate from the active Bob's Red Mill **10 Grain Hot Cereal** (`P101131`, UPC 0-39978-00119-1), Red River 7 Grain, Bob's Mighty Tasty, individual oats/rice/corn/soy/millet/sorghum ingredients, and Kashi Go Lean's older puffed eight-grain cereal. The Kashi listing is a different ready-to-eat cereal, not an alias or formulation source for this hot cereal [R96]. Do not add bare `8 grain`, `multigrain cereal`, `hot cereal`, or component names as aliases.

The US manufacturer product page is a comparator for a separate item, **P101124**, and gives a 1/4 cup (40 g) serving [S04]. Its ingredient list omits soybeans, while the manufacturer's 2026 US product list identifies P101124 and includes soybeans [S05]. The manufacturer sources therefore conflict on that item's formula. Do not resolve the discrepancy here or transfer the US serving or formula to Canadian P101125.

## Exact proposed delta

Allocate this key only if the review is accepted; it is proposal-local and not reserved in the live catalog:

```json
{
  "id": "ingredient-ref-bobs-red-mill-8-grain-hot-cereal",
  "nameEn": "Bob's Red Mill Gluten Free 8 Grain Hot Cereal",
  "nameFr": "Bob's Red Mill Céréales chaudes à 8 grains sans gluten",
  "aliasesEn": ["Cereal, 8 Grain Hot, Gluten Free"],
  "aliasesFr": ["Céréales chaudes 8 grains"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The Well.ca titles are the brand-qualified displays; the two aliases are the exact product labels from the manufacturer's Canadian catalog. Add no generic grain-count alias or component alias. The proposed ledger record is `ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`, with sources S01–S03, empty measurement observations and substitution findings, and one accepted identity decision. Do not attach comparator S04 to the Canadian record.

## Ownership, picker, and recipe demand

The live package currently has 1,548 ingredient references and 119 forms. Exact normalized scans found no owner for the proposed ID, either bilingual display, P101125, its UPC/GTIN, or the candidate's exact manufacturer/retailer titles in active references, forms, legacy-import identities, or the research ledger. The existing 10-grain reference and ledger record are present and remain separately owned. The older Kashi Go Lean eight-grain puffed cereal appears only as a separate historical retailer source in the ledger. No existing source ID matches `WP03-BRM8G-R173-20261016-S01` through `S05`; the five proposed product URLs below also have no exact URL owner in the ledger.

`IngredientSearch.kt` folds case and accents, strips punctuation, and prefers complete normalized word phrases before partial matches ([normalization and matching](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9), [reference/form terms](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L186)). A static projection using that behavior gives:

| Query | Current results | With proposed row |
|---|---:|---:|
| `Bob's Red Mill Gluten Free 8 Grain Hot Cereal` | 0 | 1 |
| `Bob's Red Mill Céréales chaudes à 8 grains sans gluten` | 0 | 1 |
| `Cereal, 8 Grain Hot, Gluten Free` | 0 | 1 |
| `Céréales chaudes 8 grains` | 0 | 1 |
| `8 grain hot cereal` / `8 grains` | 0 | 1 each |
| `hot cereal` | 8 | 9 |
| `cereal` / `céréales` | 17 / 13 | 18 / 14 |
| `Bob's Red Mill 10 Grain Hot Cereal` | 1 | 1 |

The exact product names resolve to one row each; broader cereal queries add one expected product. The existing 10 Grain Hot Cereal result stays unchanged.

The bundled manifest enumerates **114 recipe files / 1,123 ingredient rows** ([manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)). A full-file and ingredient-row scan for P101125, its GTIN, the 8-grain titles, and bilingual product wording found **zero recipe or ingredient-row matches**. Add no recipe link, relink, or recipe substitution.

## Numeric, form, and substitution assessment

The 709 g package size is package metadata, not a kitchen measure. The Canadian product list and Canadian retailer pages do not supply a dry household serving, density, conversion, or cooked yield. Leave `defaultDensity` null; add no measures, mappings, dry/cooked forms, conversion, or yield. In particular, the US P101124 1/4 cup (40 g) serving is for a different item/formula and is not a supported value for P101125.

The blend's ingredient list does not establish an exchange ratio with 10 Grain Hot Cereal, other cereal blends, or its component grains. Add no global or contextual substitution and no substitution finding. Keep the state `not_yet_researched`; a future recipe-specific substitution review would need evidence for the blend's role and preparation method.

## Source register

The source IDs are proposal-local and unallocated. S01 is the primary Canadian identity/formula source. The browser search index returned the 2026 product-list text for S01; a direct fetch of its page deep link returned a cache miss, so the locator below identifies the catalog page and item number. S04 and S05 document conflicting US manufacturer information for the separate P101124 comparator. Retailer availability is not asserted.

| ID | Source | Supports and limits |
|---|---|---|
| `WP03-BRM8G-R173-20261016-S01` | Bob's Red Mill, [2026 Canadian French Product List, pp. 26–27](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/26-27/) (accessed 2026-10-16). | French manufacturer catalog title and English product label; P101125, UPC/GTIN, 709 g package, ingredient declaration. Direct page fetch was a browser cache miss; indexed catalog text was available. Manufacturer evidence for the Canadian SKU. |
| `WP03-BRM8G-R173-20261016-S02` | Well.ca, [Bob's Red Mill Gluten Free 8 Grain Hot Cereal](https://well.ca/products/bobs-red-mill-gluten-free-8-grain_298595.html) (accessed 2026-10-16). | English retailer display, 709 g package, ingredient list including soybeans. Page showed notify-me availability; not used to claim current stock. |
| `WP03-BRM8G-R173-20261016-S03` | Well.ca, [Bob's Red Mill Céréales chaudes à 8 grains sans gluten](https://well.ca/fr/produits/bobs-red-mill-gluten-free-8-grain_298595.html) (accessed 2026-10-16). | French retailer product title. Direct page fetch was unavailable; the indexed product listing provided the title. Not used as a composition or serving source. |
| `WP03-BRM8G-R173-20261016-S04` | Bob's Red Mill, [8 Grain Hot Cereal](https://www.bobsredmill.com/product/8-grain-hot-cereal) (accessed 2026-10-16). | Excluded comparator only: the US product page image identifies P101124, the page gives a 1/4 cup (40 g) serving, and its ingredient list omits soybeans. The 2026 US catalog lists soybeans for P101124 [S05], so manufacturer sources conflict on its formula. Do not attach to the Canadian P101125 record or transfer its serving. |
| `WP03-BRM8G-R173-20261016-S05` | Bob's Red Mill, [2026 Product List, pp. 36–37](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Product-List/36-37/) (accessed 2026-10-16). | Excluded comparator only: the current US catalog identifies P101124 and lists soybeans in the 8 Grain Hot Cereal formula. This conflicts with the product-page ingredient list [S04]; it does not provide the P101124 serving size shown on that page. Do not attach to the Canadian P101125 record or transfer its formula. |

## Related repository records

- Live open checklist: [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3503).
- Existing distinct 10-grain identity: [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L2232), [R100 proposal](./wp03-section-f-next-grain-gap-review-r100-20261014.md), and [integration README](../batches/wp03-section-f-bobs-red-mill-10-grain-hot-cereal-integration-20261014/README.md).
- Separate older Kashi listing: [R96 GoActive review](./wp03-section-f-r96-goactive-original-cereal-identity-review-20261014.md).
- Current R172 Section F disposition: [integration README](../batches/wp02-wp03-wp04-r172-gap-review-integration-20261016/README.md).

This proposal changes no shared catalog, ledger, generated code, plan, roadmap, or batch README. No app or software tests are applicable to this proposal-only review.
