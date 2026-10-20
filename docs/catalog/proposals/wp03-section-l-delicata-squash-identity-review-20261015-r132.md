# WP03 Section L R132 — delicata squash identity review — 2026-10-15

- **Status:** proposal only; no shared catalog, ledger, checklist, roadmap, or generated file was changed.
- **Decision:** add one identity-only fresh produce reference, **delicata squash / courge Delicata**, with no aliases.
- **Numeric scope:** preserve Metro’s listed average of 535 g per item as one retailer-specific estimate in the research ledger. Do not activate it as a count conversion, density, unit mapping, portion, or generic measure.
- **Forms and substitutions:** add no ingredient form, conversion, recipe link, yield, or substitution rule.
- **Review scope:** the open WP03 Section L Delicata item, with current references/forms, research ledger, legacy candidates, prior Section L proposals, picker implementation, and all bundled recipes reviewed.

## Checklist and requirements

The active catalog plan at lines 4380–4393 names kabocha, delicata, and spaghetti squash in the Section L produce list. The nested completion note now leaves delicata open pending narrower bilingual product labeling. The R131 kabocha proposal resolved that neighboring item but did not close the parent checklist. Roadmap R131 also leaves the broader Section L work open.

Requirements.md §2.2 calls for bilingual ingredient-reference names and aliases, with density only when meaningful and optional unit mappings. This proposal uses those fields for a distinct fresh product, but activates no conversion data.

## Current catalog and archive audit

Read-only snapshot on 2026-10-15:

- **Active catalog:** 1,482 ingredient references and 109 forms.
- **Research ledger:** 1,827 records, 7,613 source entries, and 6,469 distinct source IDs.
- **Legacy candidates:** 61 entries; declared and actual counts agree.
- **Bundled recipe corpus:** 114 manifest-listed recipes and 1,123 ingredient rows.

The current reference file contains no Delicata name or alias. The new ID, ingredient-ref-delicata-squash, is absent from active references, forms, ledger records, and legacy candidates. The legacy file has no Delicata candidate; its only related squash-fruit candidate is the separate unreviewed pumpkin-purée candidate. There is no separate Section L or Delicata archive data file in the repository inventory. The older Section L coordinator proposal is the prior historical Delicata decision: it kept the name unresolved until a bilingual product label could be confirmed.

Nearby active identities remain distinct:

| Existing reference | Current English / French display |
|---|---|
| ingredient-ref-acorn-squash | acorn squash / courge poivrée |
| ingredient-ref-butternut-squash | butternut squash / courge butternut |
| ingredient-ref-kabocha-squash | kabocha squash / courge kabocha |
| ingredient-ref-spaghetti-squash | spaghetti squash / courge spaghetti |
| ingredient-ref-summer-squash | summer squash / courge d’été |
| ingredient-ref-pumpkin | pumpkin / citrouille |
| ingredient-ref-zucchini | zucchini / courgette |
| ingredient-ref-squash-blossoms | squash blossoms / fleurs de courgettes |

No existing reference owns Delicata. There is no generic squash/courge reference or winter-squash/courge d’hiver parent. No current form describes Delicata or a squash cultivar, and none of the listed neighboring produce identities has an attached form.

The previous Section L coordinator review explicitly deferred Delicata because it lacked a current Canadian bilingual product label. The current retailer and grower sources below close that naming gap. The R128–R130 tomato proposals and the R131 kabocha proposal do not make a Delicata decision.

## Product name and safe picker boundary

Current Canadian and Québec product sources use the bilingual pair **delicata squash / courge delicata**. The OQLF’s older winter-squash entry calls Delicata a distinct club-shaped type and separately names sweet dumpling squash and other cultivars. A current Québec grower also lists Delicata separately from spaghetti, butternut, and Buttercup squash.

Propose the French display **courge Delicata** to retain the product’s locally used varietal name. The English display is **delicata squash**. Keep both alias arrays empty: the canonical names make the exact terms searchable, and the picker normalizes case and accents, so queries written as “courge delicata” or “courge Délicata” resolve to the same proposed item without duplicate aliases.

Do not add broad or unverified synonyms:

- **squash**, **courge**, **winter squash**, and **courge d’hiver** name a broader family or category, not this cultivar.
- **sweet dumpling squash** is listed separately from Delicata by OQLF.
- **sweet potato squash**, **Bohemian squash**, and **peanut squash** are not supported by the reviewed Canadian or Québec product labels. Metro’s sweet-potato comparison is flavor language, not a product synonym.
- **acorn**, **butternut**, **kabocha**, **spaghetti**, and **Buttercup** remain separate named products.

The current phrase-first picker projection was calculated from the live reference/form JSON and IngredientSearch.kt; it is not a runtime or UI test.

| Query | Current results | With proposed reference |
|---|---:|---:|
| delicata | 0 | 1 — ingredient-ref-delicata-squash |
| delicata squash | 0 | 1 — ingredient-ref-delicata-squash |
| courge Delicata / courge délicata / courge Délicata | 0 | 1 — ingredient-ref-delicata-squash |
| squash | 7 | 8 |
| courge | 10 | 11 |
| winter squash / courge d’hiver | 0 | 0 |
| kabocha, butternut, acorn squash, spaghetti squash | Existing exact owners | Unchanged |

The broad **squash** and **courge** queries already return multiple related references; adding Delicata expands those sets by one and does not make either broad query a false singleton.

## Evidence register

All sources were reviewed on 2026-10-15. Retail price and availability text can change; the proposal relies on product names and narrowly described evidence only.

| ID | Source | Evidence and limitation |
|---|---|---|
| **WP03-L-DELICATA-20261015-R132-S01** | Office québécois de la langue française, [courge d’hiver (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404009/courge-dhiver) | The French notes list “la Delicata en forme de massue”; the English notes list club-shaped delicata separately from sweet dumpling and other squash types. The entry was last updated in 1991, so it supports Québec terminology and the named-type boundary, not a current product label or species claim. |
| **WP03-L-DELICATA-20261015-R132-S02** | Aliments du Québec, [Courge Delicata](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/courge-delicata-5) | Current French-facing fresh-produce entry; identifies the product title, Metro as a retailer, “1 vrac” as the available format, and Les Fermes Émile Gariépy as a Québec grower in Saint-Roch-de-l’Achigan. “1 vrac” is not a recipe measure or unit mapping. Direct retrieval succeeded. |
| **WP03-L-DELICATA-20261015-R132-S03** | Aliments du Québec, [delicata squash](https://alimentsduquebec.com/en/certified-products/fruits-and-vegetables/delicata-squash) | The English-facing fresh-produce listing uses “delicata squash” and names Québec grocery retailers. The page appeared in the current search index, but direct retrieval returned a cache miss; the indexed 35 lb format is not treated as an item weight or recipe measure. |
| **WP03-L-DELICATA-20261015-R132-S04** | Les Cultures de chez nous, [Nos courges](https://www.cultures.ca/nos-produits/nos-courges) | Current Québec grower page says it cultivates “la courge Delicata” alongside spaghetti, butternut, and Buttercup squash; its French page describes the skin as edible once cooked. It supports the local name and separation from neighboring types. The cooking note does not establish a catalog form or a substitution. |
| **WP03-L-DELICATA-20261015-R132-S05** | Metro Québec, [Courge delicata, product 4763](https://api.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/courges-et-citrouilles/courge-delicata/p/4763) | The current indexed French product page uses “Courge delicata” and lists an approximate 535 g average per item. Search indexing showed the product page two weeks before review; direct retrieval returned a cache miss, and its displayed promotion had ended on 2026-09-30. Preserve the item name and estimate only; make no current price or stock claim. |
| **WP03-L-DELICATA-20261015-R132-S06** | Metro, [Delicata Squash, product 4763](https://api.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/squash-pumpkin/delicata-squash/p/4763) | The current indexed English version of product 4763 uses “Delicata Squash” and also lists an approximate 535 g average per item. It was indexed one week before review; direct retrieval returned HTTP 403, and the displayed promotion had ended on 2026-10-07. This is the English page for the same retailer product, not a separate measurement sample. |
| **WP03-L-DELICATA-20261015-R132-S07** | Super C, [Delicata Squash, product 4763](https://www.superc.ca/en/aisles/fruits-vegetables/vegetables/squash-pumpkin/delicata-squash/p/4763) | The Canadian English retailer page identifies “Delicata Squash” as a Québec product and lists a 535 g average item weight. Direct page content was accessible, but its promotion end date was 2026-09-30; no current stock or price claim is made. This is a retailer-specific listing, not a second independent sample. |

## Numeric, form, recipe, and substitution audit

- **Source-scoped numeric observation:** Metro product 4763 lists an average of approximately 535 g per item in its French and English pages. This is retained in the proposed ledger record as an estimate for that listing only. The same item appears through Metro and Super C pages; these are not independent sample measurements.
- **No reusable measure:** the retailer does not state a weighing method or sample range. The figure does not support a default density, a generic one-squash mass, a count-to-mass conversion, serving amount, edible yield, or unit mapping. The Aliments du Québec bulk-format field is not a one-item mass.
- **No form:** sources describe the fresh whole product. Baking, roasting, pan-frying, stuffing, and the cooked edible-skin note are culinary methods or characteristics, not distinct commercial forms with a reusable conversion.
- **No global substitution:** the reviewed sources distinguish Delicata from other cultivars but do not offer another ingredient as an exchange or provide a ratio. The taste comparison with sweet potato is not a substitution rule. Add no global same-ingredient or contextual ingredient substitution.
- **No bundled demand:** all 114 manifest recipe files and 1,123 ingredient rows were scanned for Delicata and the candidate boundary terms. There were zero matches for delicata, delicata squash, courge delicata, courge délicata, sweet potato squash, Bohemian squash, peanut squash, sweet dumpling squash, winter squash, courge d’hiver, kabocha, acorn squash, butternut squash, spaghetti squash, and Buttercup squash. No recipe link is proposed.

## Proposed exact delta

The reference is identity-only. The ledger retains the single retailer average as a scoped estimate, records that no reusable measurement or general substitution was supported, and does not create an active conversion. No form record is proposed.

    {
      "ingredientReference": {
        "id": "ingredient-ref-delicata-squash",
        "nameFr": "courge Delicata",
        "nameEn": "delicata squash",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-15T00:00:00Z",
        "category": "VEGETABLE_AND_AROMATIC"
      },
      "ledgerRecord": {
        "recordId": "ingredient-ref-delicata-squash",
        "recordType": "ingredient_reference",
        "identityState": "verified",
        "measurementState": "researched_supported",
        "substitutionResearchState": "researched_no_supported_substitute",
        "sources": [
          {
            "sourceId": "WP03-L-DELICATA-20261015-R132-S01",
            "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404009/courge-dhiver",
            "title": "Office québécois de la langue française, courge d’hiver (GDT)",
            "versionOrDate": "Last updated 1991; rechecked 2026-10-15",
            "accessedOn": "2026-10-15",
            "locator": "French winter-squash notes and English list.",
            "supports": "The French notes list Delicata as a club-shaped winter squash; the English notes list delicata separately from sweet dumpling and other named types. This is an older family entry, not a current product label or species claim.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP03-L-DELICATA-20261015-R132-S02",
            "url": "https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/courge-delicata-5",
            "title": "Aliments du Québec, Courge Delicata",
            "accessedOn": "2026-10-15",
            "locator": "Fresh-produce product title, retailer, available format, and producer.",
            "supports": "Current French-facing fresh-produce listing uses Courge Delicata and identifies a Québec grower and Metro retail channel. The vrac format is not an ingredient measure.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-DELICATA-20261015-R132-S03",
            "url": "https://alimentsduquebec.com/en/certified-products/fruits-and-vegetables/delicata-squash",
            "title": "Aliments du Québec, delicata squash",
            "accessedOn": "2026-10-15",
            "locator": "Indexed English-facing fresh-produce product title and grocery-retailer list.",
            "supports": "The indexed English listing uses delicata squash for a fresh produce product. Direct retrieval returned a cache miss; the indexed bulk-format field is not adopted as a portion or measure.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-DELICATA-20261015-R132-S04",
            "url": "https://www.cultures.ca/nos-produits/nos-courges",
            "title": "Les Cultures de chez nous, Nos courges",
            "accessedOn": "2026-10-15",
            "locator": "Winter-squash varieties and Delicata description.",
            "supports": "A Québec grower names courge Delicata separately from spaghetti, butternut, and Buttercup squash and says its skin is edible after cooking. This does not establish a form or substitution.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-DELICATA-20261015-R132-S05",
            "url": "https://api.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/courges-et-citrouilles/courge-delicata/p/4763",
            "title": "Metro Québec, Courge delicata, product 4763",
            "accessedOn": "2026-10-15",
            "locator": "Indexed French product title and approximate average item mass; direct fetch returned a cache miss.",
            "supports": "The indexed listing uses Courge delicata and reports approximately 535 g average per item for product 4763. Its method and sample are unstated; its listed promotion had expired before review.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-DELICATA-20261015-R132-S06",
            "url": "https://api.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/squash-pumpkin/delicata-squash/p/4763",
            "title": "Metro, Delicata Squash, product 4763",
            "accessedOn": "2026-10-15",
            "locator": "Indexed English product title and approximate average item mass; direct fetch returned HTTP 403.",
            "supports": "The English version of product 4763 uses Delicata Squash and reports approximately 535 g average per item. This is the same product listing as the French page, not another sample; its listed promotion had expired before review.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-DELICATA-20261015-R132-S07",
            "url": "https://www.superc.ca/en/aisles/fruits-vegetables/vegetables/squash-pumpkin/delicata-squash/p/4763",
            "title": "Super C, Delicata Squash, product 4763",
            "accessedOn": "2026-10-15",
            "locator": "Product title, product-of-Québec label, and approximate average item mass.",
            "supports": "The Canadian English retailer page lists Delicata Squash, identifies it as a Québec product, and reports a 535 g average item weight. It is a retailer-specific page for product 4763, not an independent sample or current price/stock confirmation.",
            "sourceKind": "other"
          }
        ],
        "measurementObservations": [
          {
            "observationId": "delicata-metro-product-4763-average-item-weight-20261015",
            "relationship": "count_weight",
            "value": 535,
            "valueUnit": "g",
            "foodDescription": "Fresh whole Delicata squash listed as Metro product 4763.",
            "foodState": "Whole fresh item as sold; the retailer listing does not report an individual sample or processing state.",
            "measurementMethod": "Retailer-displayed approximate average per-item weight; the method and sample are not stated.",
            "quantityBasis": "One retailer listing-specific average only. Do not use as a generic count-to-mass conversion, density, or unit mapping.",
            "sourceQuantity": {
              "amount": 1,
              "unit": "item"
            },
            "evidenceKind": "estimate",
            "sourceIds": [
              "WP03-L-DELICATA-20261015-R132-S05",
              "WP03-L-DELICATA-20261015-R132-S06",
              "WP03-L-DELICATA-20261015-R132-S07"
            ]
          }
        ],
        "substitutionFindings": [
          {
            "findingId": "delicata-squash-global-substitution-review-20261015",
            "researchState": "researched_no_supported_substitute",
            "fromIngredientRefId": "ingredient-ref-delicata-squash",
            "replacements": [],
            "context": "General substitution review for fresh whole Delicata squash.",
            "basis": "The reviewed OQLF, Québec grower, and Canadian retailer sources describe Delicata as a distinct squash product but give no alternative ingredient or exchange ratio. A sweet-potato flavor comparison is not an exchange instruction.",
            "limitations": [
              "Do not infer interchangeability with acorn, butternut, kabocha, spaghetti, Buttercup, sweet dumpling, pumpkin, or sweet potato.",
              "The Metro retailer average is not a substitution quantity."
            ],
            "sourceIds": [
              "WP03-L-DELICATA-20261015-R132-S01",
              "WP03-L-DELICATA-20261015-R132-S04",
              "WP03-L-DELICATA-20261015-R132-S05",
              "WP03-L-DELICATA-20261015-R132-S06",
              "WP03-L-DELICATA-20261015-R132-S07"
            ]
          }
        ],
        "decisions": [
          {
            "outcome": "accepted",
            "reason": "Add identity-only delicata squash / courge Delicata with empty aliases. Current Canadian and Québec fresh-produce labels support the bilingual display; keep broad squash-family wording and neighboring varieties separate. Do not add forms, density, mappings, recipe links, conversions, yields, or active substitutions.",
            "sourceIds": [
              "WP03-L-DELICATA-20261015-R132-S01",
              "WP03-L-DELICATA-20261015-R132-S02",
              "WP03-L-DELICATA-20261015-R132-S03",
              "WP03-L-DELICATA-20261015-R132-S04",
              "WP03-L-DELICATA-20261015-R132-S05",
              "WP03-L-DELICATA-20261015-R132-S06",
              "WP03-L-DELICATA-20261015-R132-S07"
            ]
          },
          {
            "outcome": "accepted",
            "reason": "Preserve Metro product 4763’s approximate 535 g average as a retailer-specific estimate only. Do not add a reusable count weight, density, unit mapping, or conversion.",
            "sourceIds": [
              "WP03-L-DELICATA-20261015-R132-S05",
              "WP03-L-DELICATA-20261015-R132-S06",
              "WP03-L-DELICATA-20261015-R132-S07"
            ]
          }
        ]
      }
    }

## Validation and limitations

- Confirmed the proposed reference ID and R132 source IDs do not collide with the current references, forms, ledger, or legacy candidates.
- Reproduced phrase-first and fallback picker projections from IngredientSearch.kt and the current JSON arrays. The case/accent-normalized exact queries return only the proposed identity; broad family queries remain multi-result.
- Scanned every manifest recipe file and every ingredient row; there is no Delicata or named neighboring-squash demand.
- The source-specific 535 g average is a retailer estimate for one product listing; the page does not publish a sample or measurement method.
- No app, Gradle, unit, instrumentation, or emulator tests were run. This is proposal-only catalog data work, and no shared database JSON was changed.

