# WP03 Section L R133 — Chinese eggplant identity review — 2026-10-15

- **Status:** proposal only; no shared catalog, ledger, checklist, roadmap, or generated file was changed.
- **Decision:** add one identity-only fresh produce reference, **Chinese eggplant / aubergine chinoise**, with no aliases.
- **Numeric scope:** record Metro product 3089’s displayed 200 g average per item only as a retailer-specific estimate. Do not activate it as a generic count conversion, density, serving, yield, or unit mapping.
- **Substitution scope:** record Metro’s “Chinese eggplant or 2 large regular” option only for its named grilled-eggplant recipe. Add no active substitution rule or amount conversion.
- **Forms:** add no preparation or preservation form. The source pages describe fresh whole eggplant; grilling is a cooking method.

## Checklist and requirements

The open WP03 Section L produce list still includes “eggplant types.” Its nested progress note says the general eggplant identity was added and explicitly leaves eggplant subtypes open pending narrower product labels. The 2026-10-09 Section L coordinator review likewise deferred subtype rows until current Canadian bilingual product evidence was available. This review advances one named type only; it does not decide Chinese/Japanese/Thai/Indian/Italian eggplant as a family, or close the parent produce checklist.

Requirements.md §2.2 calls for bilingual ingredient-reference names and aliases, with density only when meaningful and optional unit mappings. The proposal follows the current bilingual product label and activates no general conversion data.

## Current catalog, ledger, legacy, archive, and recipe audit

Read-only snapshot on 2026-10-15:

- **Active catalog:** 1,483 ingredient references and 109 forms.
- **Research ledger:** 1,828 records, 7,620 source entries, and 6,476 distinct source IDs.
- **Legacy candidates:** 61 entries; declared and actual counts agree.
- **Bundled recipe corpus:** 114 manifest-listed recipes and 1,123 ingredient rows.

The active reference catalog has one general eggplant identity, eggplant / aubergine, with empty aliases, null density, and no unit mappings. No active reference or form names Chinese eggplant / aubergine chinoise. The general eggplant ledger record is verified from the OQLF’s general aubergine entry; its measurement and substitution research states remain not yet researched. There is no Chinese-eggplant record, proposed-ID collision, matching legacy candidate, or eggplant preparation form.

Historical evidence is bounded. The 2026-10-09 Section L coordinator recommends deferring type-specific aliases pending bilingual product labels. The 2026-10-11 Southeast Asia gap review keeps Thai eggplant as a cuisine-qualified recipe variant, not a new identity. Neither record decides Chinese eggplant. No separate archived Chinese-eggplant identity or decision was found.

All 114 manifest recipe files and 1,123 ingredient rows were scanned for Chinese eggplant / aubergine chinoise and related Chinese, Asian, Japanese, Thai, Indian, and Italian eggplant terms in English and French. There were no subtype-specific matches. The external Metro recipe listed below is not part of the bundled library.

## Bilingual name and product boundary

Propose **Chinese eggplant / aubergine chinoise**, matching Metro’s English and French listings for fresh product 3089. Keep both alias arrays empty: the canonical bilingual names already cover the exact supported phrases.

The current product label supports this catalog identity as a retailer-named fresh product. It does not establish a botanical taxon or a universal cultivar definition. In particular, the older OQLF entry (last updated 1990) describes Chinese eggplants as lavender or white and Japanese eggplants as dark purple, while Metro’s current product 3089 is titled Chinese Eggplant / Aubergine chinoise and describes a deep-purple, long, slender item. The OQLF material is retained for Québec terminology and the fact that Chinese and Japanese varieties are separately named; its old color description is not used to reclassify Metro’s current SKU. Do not infer that Chinese and Japanese eggplant are synonyms or that all Chinese eggplant has one color or shape.

Do not add broad or unsupported aliases:

- **eggplant / aubergine** remains the existing general identity; the subtype is a separate, narrower result.
- **Asian eggplant / aubergine asiatique** is broader than one named product.
- **Japanese eggplant / aubergine japonaise** and **Thai eggplant / aubergine thaïe** are distinct named types in the OQLF’s older description; they are not synonyms for this current Chinese-labeled SKU.
- **Indian eggplant / aubergine indienne** and **Italian eggplant / aubergine italienne** are not supported as aliases by the reviewed sources.
- Do not add bare **Chinese / chinoise** as an alias. Those words also describe many unrelated foods.

The picker projection was calculated from the live reference/form JSON and IngredientSearch.kt. It uses case/accent normalization and complete phrase matches before substring fallback; this is a static search projection, not a runtime or UI test.

| Query | Current results | With proposed reference |
|---|---:|---:|
| Chinese eggplant | 0 | 1 — ingredient-ref-chinese-eggplant |
| aubergine chinoise | 0 | 1 — ingredient-ref-chinese-eggplant |
| eggplant | 1 — ingredient-ref-eggplant | 2 — generic and Chinese eggplant |
| aubergine | 1 — ingredient-ref-eggplant | 2 — generic and Chinese eggplant |
| Asian eggplant / aubergine asiatique | 0 | 0 |
| Japanese eggplant / aubergine japonaise | 0 | 0 |
| Thai eggplant / aubergine thaïe | 0 | 0 |
| Indian eggplant / aubergine indienne | 0 | 0 |
| Chinese | 9 | 10 — broad multi-result query |

## Evidence register

Sources were reviewed on 2026-10-15. Retail prices, stock, and location-specific availability can change; no current price or stock claim is used.

| ID | Source | Evidence and limitation |
|---|---|---|
| **WP03-L-CHINESE-EGGPLANT-20261015-R133-S01** | Office québécois de la langue française, [aubergine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine) | Supports the general Québec/English terms aubergine / eggplant and separately describes Chinese, Japanese, and Thai varieties. Last updated in 1990. Its Chinese/Japanese color description differs from Metro’s current Chinese-labeled item; use this source for terminology and the distinct-name boundary, not to infer SKU taxonomy. |
| **WP03-L-CHINESE-EGGPLANT-20261015-R133-S02** | Metro Québec, [Aubergine chinoise, product 3089](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/aubergine-chinoise/p/3089) | Search-indexed French product title and description use Aubergine chinoise and list a 200 g average per item. The page was indexed about two months before review; direct opening redirected to the English product page. The average is listing-specific and does not state a sample or method. |
| **WP03-L-CHINESE-EGGPLANT-20261015-R133-S03** | Metro Canada, [Chinese Eggplant, product 3089](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/chinese-eggplant/p/3089) | English product title and description identify Chinese Eggplant, product 3089, and list a 200 g average per item. The page was indexed about one month before review. A direct open of the English URL returned HTTP 403, though the page content was available through the French-page redirect. This is the English version of the same Metro product, not another sample. |
| **WP03-L-CHINESE-EGGPLANT-20261015-R133-S04** | Metro, [Marinated Sea Trout and Grilled Eggplant with Garlic Oil](https://www.metro.ca/en/recipes-occasions/recipes/marinated-sea-trout-and-grilled-eggplant-with-garlic-oil) | Publisher-indexed ingredient line offers “Chinese eggplant or 2 large regular” for the grilled-eggplant component. The recipe page is an older external recipe; direct retrieval failed because the site’s robots file was unavailable. This supports only the recipe-specific option, not a general substitute, standard ratio, or bundled recipe link. |

## Numeric, form, substitution, and recipe audit

- **Source-scoped numeric observation:** Metro product 3089 lists a 200 g average per item on its English page and the bilingual counterpart. Record this as one estimate for that listing only. The two language pages are the same product, not independent weight samples.
- **No reusable measure:** no weighing method, sample size, or range is stated. Do not adopt 200 g as a generic Chinese eggplant count weight, a general eggplant count weight, a portion, density, yield, or unit mapping. Metro’s per-kilogram price does not establish any of those values.
- **No form:** the listing describes fresh whole eggplant. Grilling and slicing are recipe preparation methods, not distinct reusable catalog forms or form conversions.
- **One dish-scoped recipe option:** Metro’s indexed recipe line offers Chinese eggplant or two large regular eggplants for that recipe’s grilled component. The Chinese-side amount is not specified, and “large regular” is not a standardized measure. Preserve this as source-specific recipe evidence only; add no global or contextual substitution rule, ratio, or recipe-line link.
- **No bundled demand:** there are no subtype-specific terms in the 114 bundled recipes / 1,123 ingredient rows. No recipe link is proposed.

## Proposed exact delta

The reference is identity-only. The ledger records the Metro average as an item-specific estimate and the Metro recipe option as a dish-scoped evidence finding; neither becomes active conversion or substitution behavior. No form record is proposed.

    {
      "ingredientReference": {
        "id": "ingredient-ref-chinese-eggplant",
        "nameFr": "aubergine chinoise",
        "nameEn": "Chinese eggplant",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-15T00:00:00Z",
        "category": "VEGETABLE_AND_AROMATIC"
      },
      "ledgerRecord": {
        "recordId": "ingredient-ref-chinese-eggplant",
        "recordType": "ingredient_reference",
        "identityState": "verified",
        "measurementState": "researched_supported",
        "substitutionResearchState": "researched_supported",
        "sources": [
          {
            "sourceId": "WP03-L-CHINESE-EGGPLANT-20261015-R133-S01",
            "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine",
            "title": "Office québécois de la langue française, aubergine (GDT)",
            "versionOrDate": "Last updated 1990; rechecked 2026-10-15",
            "accessedOn": "2026-10-15",
            "locator": "French note on Chinese, Japanese, and Thai varieties; English and Latin terms.",
            "supports": "Supports general aubergine / eggplant terminology and separately names Chinese, Japanese, and Thai varieties. The old color description conflicts with the current Metro SKU's deep-purple description; use this source for terminology and the distinct-name boundary, not to infer the product's taxonomy.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP03-L-CHINESE-EGGPLANT-20261015-R133-S02",
            "url": "https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/aubergine-chinoise/p/3089",
            "title": "Metro Québec, Aubergine chinoise, product 3089",
            "versionOrDate": "French product page indexed about two months before review; direct open redirected to English",
            "accessedOn": "2026-10-15",
            "locator": "French product title, description, product number, and average item weight.",
            "supports": "The French Metro listing calls product 3089 Aubergine chinoise and reports a 200 g average per item. The listing does not state sample size or weighing method; this is not a reusable count mapping.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-CHINESE-EGGPLANT-20261015-R133-S03",
            "url": "https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/chinese-eggplant/p/3089",
            "title": "Metro Canada, Chinese Eggplant, product 3089",
            "versionOrDate": "English product page indexed about one month before review; direct URL returned HTTP 403",
            "accessedOn": "2026-10-15",
            "locator": "English product title, description, product number, and average item weight; content also retrieved after the French URL redirected to English.",
            "supports": "The English Metro listing calls product 3089 Chinese Eggplant and reports a 200 g average per item. It is the English version of the same product as the French listing, not a second weight sample.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-CHINESE-EGGPLANT-20261015-R133-S04",
            "url": "https://www.metro.ca/en/recipes-occasions/recipes/marinated-sea-trout-and-grilled-eggplant-with-garlic-oil",
            "title": "Metro, Marinated Sea Trout and Grilled Eggplant with Garlic Oil",
            "versionOrDate": "Older publisher recipe; rechecked 2026-10-15 through search index; direct fetch failed because robots.txt was unavailable",
            "accessedOn": "2026-10-15",
            "locator": "Indexed ingredient line for the grilled-eggplant component.",
            "supports": "The publisher-indexed line offers Chinese eggplant or 2 large regular eggplants for this named dish. The Chinese-side amount is not specified, so the option gives no general quantity ratio or substitution rule.",
            "sourceKind": "culinary_reference"
          }
        ],
        "measurementObservations": [
          {
            "observationId": "chinese-eggplant-metro-product-3089-average-item-weight-20261015",
            "relationship": "count_weight",
            "value": 200,
            "valueUnit": "g",
            "foodDescription": "Fresh whole eggplant listed by Metro as Chinese Eggplant / Aubergine chinoise, product 3089.",
            "foodState": "Whole fresh item as sold; the product page does not report an individual sample or processing state.",
            "measurementMethod": "Retailer-displayed average per-item weight; method and sample size are not stated.",
            "quantityBasis": "One listing-specific 200 g average only. Do not use as a generic eggplant count conversion, density, portion, edible yield, or unit mapping.",
            "sourceQuantity": {
              "amount": 1,
              "unit": "item"
            },
            "evidenceKind": "estimate",
            "sourceIds": [
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S02",
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S03"
            ]
          }
        ],
        "substitutionFindings": [
          {
            "findingId": "wp03-chinese-eggplant-metro-grilled-trout-recipe-option-20261015",
            "researchState": "researched_supported",
            "fromIngredientRefId": "ingredient-ref-chinese-eggplant",
            "replacements": [
              {
                "ingredientRefId": "ingredient-ref-eggplant",
                "roleInCompound": "Regular eggplant option for the grilled-eggplant component in Metro’s named sea-trout recipe."
              }
            ],
            "context": "Only Metro’s Marinated Sea Trout and Grilled Eggplant with Garlic Oil, where the publisher-indexed line offers Chinese eggplant or 2 large regular eggplants for the same grilled component.",
            "basis": "This is an explicit alternative in one recipe. The Chinese-eggplant amount is not specified, and the source does not give a tested ratio beyond that recipe’s wording.",
            "limitations": [
              "Do not generalize this option to other recipes, cooking methods, or eggplant types.",
              "The recipe line does not establish a standard amount or count-to-count conversion."
            ],
            "sourceIds": [
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S04"
            ]
          }
        ],
        "decisions": [
          {
            "outcome": "accepted",
            "reason": "Add the current Metro-labeled Chinese eggplant / aubergine chinoise product as a distinct identity-only fresh produce reference. Keep aliases empty and do not infer a cultivar taxonomy from the difference between the old OQLF color description and the current retailer SKU.",
            "sourceIds": [
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S01",
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S02",
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S03"
            ]
          },
          {
            "outcome": "accepted",
            "reason": "Record Metro product 3089’s 200 g average as one retailer-specific estimate. Do not add a reusable count weight, density, serving, yield, unit mapping, or conversion.",
            "sourceIds": [
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S02",
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S03"
            ]
          },
          {
            "outcome": "accepted",
            "reason": "Record Metro’s Chinese-or-regular eggplant option only for its named grilled-eggplant recipe. Do not create an active global or contextual substitution rule or a quantity conversion.",
            "sourceIds": [
              "WP03-L-CHINESE-EGGPLANT-20261015-R133-S04"
            ]
          }
        ]
      }
    }

## Validation and limitations

- Confirmed the proposed ID and R133 source IDs do not collide with active references, forms, ledger records, or legacy candidates.
- Reproduced the phrase-first picker projection from IngredientSearch.kt and the current reference/form arrays. Exact bilingual product queries resolve to only the proposed identity; generic eggplant/aubergine searches return both the general and named product; related Asian/Japanese/Thai/Indian terms remain unassigned.
- Scanned all manifest-listed recipe files and ingredient rows for subtype-specific English and French terms; there is no bundled demand and no recipe link is proposed.
- The Metro 200 g value is a retailer average for product 3089 only; the source gives no sample or measurement method.
- The recipe substitution evidence is an indexed, older, single-dish option whose page could not be directly retrieved. It does not supply a standard amount or support an active substitution rule.
- No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. This is proposal-only research; no shared database JSON was changed.

