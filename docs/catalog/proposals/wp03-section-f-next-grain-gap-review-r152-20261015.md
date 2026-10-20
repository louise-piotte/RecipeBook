# WP03 Section F — Hard red spring wheat berries (R152, 2026-10-15)

## Review record

- **Status:** Proposal only. This review changed no shared catalog JSON, ledger, plan, roadmap, recipe, or generated index.
- **Scope:** One unresolved Section F whole-grain identity: hard red spring wheat sold as intact berries for cooking, milling, or other food use.
- **Recommendation:** Add identity-only `hard red spring wheat berries / grains de blé roux de printemps` as a `GRAIN_AND_CEREAL` reference. Use no aliases, forms, active measures, density, unit mappings, recipe links, conversions, cooking yields, or substitutions.
- **Source-ID prefix:** `WP03-HRSW-R152-20261015-S` (S01–S07). The prefix and proposed reference ID were checked against the live ledger and repository archive; neither is allocated.
- **Open checklist:** The current Section F checklist remains open for other grain products and terminology. This candidate is independent of the recently reviewed R150 red quinoa and R151 black quinoa identities and of prior held candidates such as generic sushi rice, pearled hominy, and pozole corn ([global plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L519)).

## Why this candidate

The R151 handoff added black quinoa as a color-qualified market product and explicitly left Section F open. For R152 I selected a different, currently sold Canadian whole-kernel product. The Canadian Grain Commission treats red spring wheat as a market class containing multiple designated varieties, and current Canadian food sellers list intact hard red spring wheat berries separately from generic wheat berries, Red Fife berries, durum berries, and other grain products [S01–S04]. This supports a useful exact picker choice without claiming a cultivar, a single regional grade, or a recipe demand that is not in the bundle.

No earlier focused WP03 Section F proposal or hold for hard red spring wheat berries was found. One related archive mention is in the WP02 high-gluten-flour review: it identifies Canadian hard red spring wheat as the source grain for a flour product. That is milling-source context, not a review of the intact whole-kernel food identity. The current generic `wheat berries / grains de blé entiers` row and the separate durum, Red Fife, and sprouted-wheat rows do not name the hard red spring product class.

## Product identity and French wording

Current Canadian suppliers sell the exact English product wording **Hard Red Spring Wheat Berries**. Storehouse's current wheat-berries collection lists hard red spring berries alongside hard white spring, soft white, Red Fife, and durum berry products [S03]. Its direct listing says the hard-red-spring product is Canadian and offers 1 kg, 2.5 kg, 10 kg, and 20 kg package sizes [S04]. Highwood Crossing lists its Canadian whole-grain hard red spring berries as food that can be cooked whole, milled, sprouted, or added to salads [S05]. Flourist separately lists Canadian-grown red spring wheat berries and calls the grain Hard Red Spring Wheat [S06]. Together these sources establish an actual whole-kernel food product, not only a commodity class or a flour source.

The Canadian Grain Commission's current French page uses **blé roux de printemps** for Canadian red-spring wheat classes, including the Eastern Canadian class [S02]. I propose the transparent whole-product display **grains de blé roux de printemps** to retain the existing whole-kernel boundary in French. This compound is a source-informed construction, not an OQLF ruling or a currently located Québec retail title for the whole-berry product. Do not add the shorter `blé roux de printemps` as a separate alias; the picker already finds that contiguous phrase within the proposed display. Independent Québec review can revisit the display if a direct local package label becomes available.

The proposed row is limited to whole food-grade kernels marketed as hard red spring wheat berries. Canadian Grain Commission classes group varieties by functional characteristics and growing region; hard red spring wheat is not one cultivar [S01–S02]. The row therefore does not assert a specific variety, grade, province, organic status, protein level, or origin. Keep it separate from:

- generic `wheat berries / grains de blé entiers`;
- `durum wheat berries`, Red Fife wheat berries, sprouted wheat berries, and other named whole-kernel products;
- wheat flour, wheat meal, cracked wheat, bulgur, bran, flakes, and prepared cereal products; and
- hard red winter wheat and hard white spring wheat.

Do not add broad aliases such as `whole wheat`, `red wheat`, `hard wheat`, `bread wheat`, or `high-protein wheat`. Those phrases either broaden the class or invite flour and other whole-wheat products.

## Proposed reference delta

Add this single row to `ingredient-references.v1.json` if accepted:

    {
      "id": "ingredient-ref-hard-red-spring-wheat-berries",
      "nameFr": "grains de blé roux de printemps",
      "nameEn": "hard red spring wheat berries",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-15T00:00:00Z",
      "category": "GRAIN_AND_CEREAL"
    }

Add no row to `ingredient-forms.v1.json`. The bundle has no recipe line for this product, and neither generic nor named wheat-berry rows currently provide an associated form that should be copied here.

## Exact ownership and picker impact

The live snapshot has **1,520 active references, 119 forms, 61 legacy candidates, 1,865 research-ledger records, and 114 manifest-listed recipes**. Accent-, case-, punctuation-, and ligature-normalized exact-key checks covered reference IDs, names, and aliases; form IDs, labels, and match terms; legacy IDs, names, and aliases; and all ledger record IDs and string values. No exact owner was found for either proposed display, the proposed ID, or `candidate-hard-red-spring-wheat-berries`. The source-ID prefix is also unallocated. The only related ledger record is `ingredient-ref-high-gluten-flour`, whose Ardent Mills sources identify hard red spring wheat as that flour's milling source [WP02-HG-FORCE-20261012-S02, S03, S06].

The archive scan of Section F proposals and batches found no focused review of the whole-berry product. It found the high-gluten-flour source discussion above, which does not assign a whole-grain identity. The R150 red-quinoa and R151 black-quinoa proposals were read as recent handoff context, but neither is reopened here.

The table applies `IngredientReferenceSearchIndex` phrase-first matching to the current reference/form snapshot, then to the same snapshot with the proposed display names appended. Counts are reference results; no aliases are added.

| Query | Current → proposed | Picker effect |
| --- | ---: | --- |
| `hard red spring wheat berries` | 0 → 1 | Finds the exact English product. |
| `hard red spring wheat` | 0 → 1 | Finds the hard-red-spring class within the proposed display. |
| `red spring wheat berries` | 0 → 1 | Finds the phrase used in the Flourist source within the proposed display. |
| `grains de blé roux de printemps` | 0 → 1 | Finds the proposed French display. |
| `blé roux de printemps` | 0 → 1 | Finds the contiguous French class phrase within the display. |
| `wheat berries` | 4 → 5 | Adds the named class beside generic, sprouted, durum, and Red Fife berries; all remain visible as distinct choices. |
| `grains de blé entiers` | 1 → 1 | Remains with the generic wheat-berries identity. |
| `durum wheat berries` | 1 → 1 | Remains with durum wheat berries. |
| `Red Fife wheat berries` | 1 → 1 | Remains with Red Fife wheat berries. |
| `wheat` / `blé` | 48 / 51 → 49 / 52 | Broad family queries each gain one clearly qualified result. |

## Bundled recipe demand

All **114 manifest-listed recipe files and 1,123 structured ingredient rows** were searched using normalized phrases for `hard red spring wheat berries`, `hard red spring wheat`, `red spring wheat berries`, `hard red wheat berries`, `red spring wheat`, `wheat berries`, `whole wheat berries`, `grains de blé roux de printemps`, `grain de blé roux de printemps`, `blé roux de printemps`, `blé de force roux du printemps`, and the proposed ID. The search found **zero candidate-term hits in recipe files and zero ingredient-row hits**. There are also no direct links to the generic wheat-berries, durum-wheat-berries, or Red Fife wheat-berries references in the current bundle. No recipe link or relink is proposed.

## Forms, measures, and substitutions

- **Forms:** Add none. The reviewed sources show the food sold as whole berries and describe possible cooking, milling, or sprouting uses; they do not establish a form mapping suitable for a recipe row in this bundle.
- **Package quantities:** Storehouse's 1 kg, 2.5 kg, 10 kg, and 20 kg options and Highwood Crossing's 10 kg listing are package sizes only [S03–S04]. Do not turn them into portions or measures.
- **Cooking direction:** Flourist gives one product-specific direction to combine one part wheat berries with four parts water and simmer for 45–60 minutes [S07]. This is a water-to-grain cooking instruction, not a mass-volume measure, density, general cooking yield, or transferable ratio. Keep it out of active fields and forms.
- **Reusable measurement data:** None. Leave `defaultDensity` null and `unitMappings` empty. Do not transfer any value from generic wheat berries, Red Fife berries, or another grain.
- **Substitution:** No reviewed source establishes a tested substitution ratio or scoped replacement involving this product. Cooking it for salads, soups, or porridge is a use description, not substitution evidence. Add no global or contextual rule and no recipe-line substitution link.

## Proposed research-ledger delta

If the identity is accepted, append the following `ingredient_reference` record. This is a proposed ledger item only; the live ledger was not changed.

```json
{
  "recordId": "ingredient-ref-hard-red-spring-wheat-berries",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-HRSW-R152-20261015-S01",
      "url": "https://www.canada.ca/en/grain-commission/services/grain-quality-system/wheat-classes.html",
      "title": "Canadian Grain Commission, Canadian wheat classes",
      "versionOrDate": "Page details: 2026-08-24",
      "accessedOn": "2026-10-15",
      "locator": "Red spring class descriptions, regional class names, assigned varieties, and end uses.",
      "supports": "Establishes that Canadian red spring wheat is a market class containing multiple varieties; it does not establish a cultivar or a whole-kernel retail item.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HRSW-R152-20261015-S02",
      "url": "https://www.grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html",
      "title": "Commission canadienne des grains, Classes de blé canadien",
      "accessedOn": "2026-10-15",
      "locator": "French names and descriptions for western and eastern Canadian red spring wheat classes.",
      "supports": "Uses blé roux de printemps for red spring class names and blé de force roux de printemps in descriptions. Supports the base French wording, not an OQLF ruling or a Québec whole-berry retail title.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-HRSW-R152-20261015-S03",
      "url": "https://storehousefoods.ca/collections/grains-cereals/wheat-berries",
      "title": "Storehouse Foods, Wheat Berries collection",
      "accessedOn": "2026-10-15",
      "locator": "Collection product titles for hard red spring, hard white spring, soft white, Red Fife, and durum wheat berries.",
      "supports": "Shows the seller listing hard red spring wheat berries separately from neighboring wheat-berry products. It is evidence of this seller's product distinction, not an industry-wide standard.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HRSW-R152-20261015-S04",
      "url": "https://storehousefoods.ca/products/hard-red-spring-wheat-berries",
      "title": "Storehouse Foods, Hard Red Spring Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product heading, Product of Canada statement, package-size options, and retailer address.",
      "supports": "Uses the exact English product wording and identifies a Canadian product. Listed package sizes and grade are supplier-specific and are not recipe measures or catalog attributes.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HRSW-R152-20261015-S05",
      "url": "https://www.highwoodcrossing.ca/product-page/organic-hard-red-spring-wheat-berries",
      "title": "Highwood Crossing, Organic Hard Red Spring Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product title, Canadian whole-grain description, and whole-kernel use descriptions.",
      "supports": "Names a Canadian whole-grain product and describes cooking whole, milling, sprouting, and salad use. Organic status, package size, and suggested uses are listing-specific and do not establish a reusable measure or substitution.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HRSW-R152-20261015-S06",
      "url": "https://flourist.com/products/wheat-berries",
      "title": "Flourist, Organic Wheat Berries",
      "accessedOn": "2026-10-15",
      "locator": "Product description and red spring / Hard Red Spring Wheat naming.",
      "supports": "Identifies the supplier's Canadian-grown red spring wheat berries as Hard Red Spring Wheat and describes whole-kernel uses. It supports this supplier's product naming, not a separate cultivar or household measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-HRSW-R152-20261015-S07",
      "url": "https://flourist.com/en-us/blogs/recipes/cooking-guide-wheat-berries",
      "title": "Flourist, Wheat Berries: A Cooking Guide",
      "accessedOn": "2026-10-15",
      "locator": "Product-specific water-to-berries instruction and simmer time.",
      "supports": "Gives one part berries to four parts water and a 45–60 minute simmer for the supplier product. This is a cooking direction, not a mass-volume measure, density, general cooking yield, or transferable ratio.",
      "sourceKind": "culinary_reference"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only hard red spring wheat berries / grains de blé roux de printemps for the marketed whole-kernel class. Canadian supplier listings distinguish this product from other wheat berries; the Grain Commission class contains multiple varieties, not one cultivar. The French display is a source-informed construction from the official class wording; no direct Québec whole-berry retail label or OQLF entry was located. Add no aliases, forms, active measures, density, unit mappings, recipe links, conversions, yields, or substitutions. Keep the cited cooking direction product-specific and inactive.",
      "sourceIds": [
        "WP03-HRSW-R152-20261015-S01",
        "WP03-HRSW-R152-20261015-S02",
        "WP03-HRSW-R152-20261015-S03",
        "WP03-HRSW-R152-20261015-S04",
        "WP03-HRSW-R152-20261015-S05",
        "WP03-HRSW-R152-20261015-S06",
        "WP03-HRSW-R152-20261015-S07"
      ]
    }
  ]
}
```

No other ledger record, rule file, form, reference, recipe, or generated artifact changes.

## Source register

Sources were checked on 2026-10-15. Availability and package options can change; each claim below is bounded to the cited source.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-HRSW-R152-20261015-S01` | Canadian Grain Commission, [Canadian wheat classes](https://www.canada.ca/en/grain-commission/services/grain-quality-system/wheat-classes.html), page details 2026-08-24. | Groups Canadian wheat varieties into regional classes and describes the relevant red-spring classes and end uses. Establishes that the class contains multiple varieties; it does not establish a whole-kernel retail item, a cultivar, or a home measure. |
| `WP03-HRSW-R152-20261015-S02` | Commission canadienne des grains, [Classes de blé canadien](https://www.grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html), current French page. | Uses `blé roux de printemps` for western and eastern Canadian red-spring wheat class names and `blé de force roux de printemps` in descriptions. Supports the base fr-CA class wording; it is not an OQLF entry or a Québec retail label for whole berries. |
| `WP03-HRSW-R152-20261015-S03` | Storehouse Foods, [Wheat Berries collection](https://storehousefoods.ca/collections/grains-cereals/wheat-berries), current category listing. | Lists Hard Red Spring Wheat Berries separately from hard-white spring, soft-white, Red Fife, and durum berry products. This supports the seller's product distinction, not an industry-wide naming standard. Package sizes are not household measures. |
| `WP03-HRSW-R152-20261015-S04` | Storehouse Foods, [Hard Red Spring Wheat Berries](https://storehousefoods.ca/products/hard-red-spring-wheat-berries), current product listing. | Uses the exact product wording, says Product of Canada, identifies offered package sizes, and gives a Lacombe, Alberta address. Its No. 1 grade and product attributes are source-specific and are not added to the catalog identity. Package weights are not household measures. |
| `WP03-HRSW-R152-20261015-S05` | Highwood Crossing, [Organic Hard Red Spring Wheat Berries](https://www.highwoodcrossing.ca/product-page/organic-hard-red-spring-wheat-berries), current product listing. | Names a Canadian whole-grain product and describes whole-kernel cooking, milling, sprouting, and salad use. The 10 kg offer, organic claim, and use suggestions are listing-specific; none establishes a household measure or substitution. |
| `WP03-HRSW-R152-20261015-S06` | Flourist, [Organic Wheat Berries](https://flourist.com/products/wheat-berries). | The product page identifies Canadian-grown red spring wheat as the supplier's Hard Red Spring Wheat and describes whole-kernel uses. It supports the supplier's product naming and whole-kernel boundary, not a separate cultivar or household measure. |
| `WP03-HRSW-R152-20261015-S07` | Flourist, [Wheat Berries: A Cooking Guide](https://flourist.com/en-us/blogs/recipes/cooking-guide-wheat-berries). | Gives one part berries to four parts water and a 45–60 minute simmer for the supplier product. This is a product-specific cooking direction, not a reusable ratio, density, cooking yield, or measure. |

## Static review checks

- Read `AGENTS.md`, the active Section F plan checklist, the R150/R151 quinoa proposals, and the R151 integration README before candidate selection.
- Parsed the live split package, forms, legacy candidates, ledger, substitution rule files, and manifest-listed recipe corpus; checked exact normalized ownership and source-prefix uniqueness.
- Reproduced the phrase-first picker projection for the proposed names and neighboring wheat-berry queries.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows for the candidate phrase family and checked direct links to the neighboring whole-wheat-berry identities.
- No Gradle tests, emulator, app, or deployment work was run; this is proposal-only and the user-directed workflow calls for static data, encoding, link, and ownership checks.

## Root integration disposition (R152)

Accepted and added identity-only `hard red spring wheat berries / grains de blé roux de printemps`
to the bundled reference catalog and research ledger. No aliases, forms, measurements, conversions,
yields, recipe links, or substitutions were added. See the [R152 integration README](../batches/wp02-wp03-wp04-r152-gap-review-integration-20261015/README.md).
