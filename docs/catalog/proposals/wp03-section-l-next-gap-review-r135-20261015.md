# WP03 Section L R135 — Indian eggplant identity review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, ledger, plan, roadmap, or generated file was changed.
- **Disposition:** add one identity-only produce reference, **Indian eggplant / aubergine indienne**, with no aliases, density, unit mappings, or form. Keep plural aliases out of all eggplant references in this proposal; the canonical product names are singular, and adding only Indian plurals would make bare plural searches point to the Indian row.
- **Scope:** tie the identity to current Canadian retail and Montréal produce listings that use the bilingual product names. This is a product-name classification; the evidence does not assign a species, cultivar, or universal definition to every eggplant sold as Indian.
- **Numeric scope:** keep Walmart's 0.03–0.11 kg single-item range and Atlantic Superstore's 0.1 kg/item average as separate source-scoped ledger observations. Metro's displayed 60 g is an approximate pricing quantity derived from its per-kilogram price, not an average eggplant weight; do not record it as a measurement. Do not pool retailer values or activate a count conversion.
- **Substitution scope:** record one Bagara Baingan recipe’s fallback from small Indian or Italian baby eggplants to large globe eggplant as a dish-scoped finding only. It gives no equivalent amount; add no active rule or recipe-line link.
- **Recipe scope:** no matching demand in the bundled corpus; add no recipe link.

## Checklist and review history

The active Section L checklist remains open for “eggplant types.” The 2026-10-09 coordinator deferred type-specific rows until product-specific labels could support them. Subsequent WP03 reviews integrated Chinese eggplant and Thai eggplant as separate product identities. This proposal advances Indian eggplant only and does not close the remaining produce or eggplant review.

The Chinese eggplant review named Indian eggplant / aubergine indienne among possible neighboring terms but did not add it as an alias because that review had no evidence for it. This proposal does not attach the phrase to Chinese eggplant: new bilingual listings support a separate Indian eggplant identity. The targeted search did not locate an equally strong current Canadian/Québec bilingual product listing for Japanese eggplant; that search result is a bounded review finding, not evidence that no such products exist.

`Requirements.md` §2.2 calls for bilingual ingredient-reference names and aliases, with density only where meaningful and optional unit mappings. The proposal uses the exact bilingual product names, leaves both alias arrays empty, and keeps all item weights in the research ledger rather than reusable catalog conversions.

## Current catalog, ledger, legacy, and recipe audit

Read-only snapshot on 2026-10-15:

- **Active catalog:** 1,487 ingredient references and 109 forms.
- **Research ledger:** 1,832 records, 7,647 source entries, and 6,503 distinct source IDs.
- **Legacy candidates:** 61; declared and actual counts agree.
- **Bundled corpus:** 114 manifest-listed recipes and 1,123 ingredient rows.

The active catalog has three relevant references:

| ID | English | French | Aliases / numeric data |
|---|---|---|---|
| `ingredient-ref-eggplant` | `eggplant` | `aubergine` | empty aliases; null density; no mappings |
| `ingredient-ref-chinese-eggplant` | `Chinese eggplant` | `aubergine chinoise` | empty aliases; null density; no mappings |
| `ingredient-ref-thai-eggplant` | `Thai eggplant` | `aubergine thaïe` | French alias `aubergine thaï`; null density; no mappings |

There is no Indian eggplant reference, form, ledger record, or legacy candidate. The exact proposed reference ID, ledger ID, and R135 source-ID prefix are unused. The generic eggplant ledger record remains identity-verified with measurement and substitution research not yet completed. No eggplant forms are active.

Every recipe file listed by the current package manifest was scanned as UTF-8 JSON. Searching all recipe fields and ingredient objects for `Indian eggplant`, `aubergine indienne`, `eggplant`, `aubergine`, `brinjal`, and `baingan` found **zero hits across 114 recipes / 1,123 ingredient rows**. The external Bagara Baingan recipe below is evidence about a dish, not bundled-library demand.

## Product naming and boundary

Propose the exact bilingual display **Indian eggplant / aubergine indienne**. Metro’s current product 4838 has matching English and French titles and descriptions of a small, round, deep-purple item. A Montréal produce distributor also lists **Aubergine indienne** and describes small-to-medium deep-purple eggplants. Walmart Canada’s French product title uses **Aubergine indienne** for a small fresh product sold singly. These sources support the Québec-facing French name and a useful picker identity.

The OQLF GDT entry prefers generic **aubergine** and gives generic English **eggplant**. It was last updated in 1990 and describes Chinese, Japanese, and Thai varieties, but does not give an Indian subtype name. Treat it as base-term and language evidence, not as a complete modern type list. Metro and the Montréal distributor support the product wording; neither establishes a botanical species, cultivar, required colour, or comprehensive definition. The user-facing identity stays product-name scoped.

Keep aliases empty for this proposal:

- The current canonical product titles and reference names use singular `Indian eggplant` / `aubergine indienne`; these full singular queries each resolve to one row. The observed plural wording is in product descriptions, not an alternate title.
- Do not add only `Indian eggplants` / `aubergines indiennes`. The picker’s phrase-first search matches a query word contained in any normalized search term, so either qualified plural alias would also make bare `eggplants` / `aubergines` resolve to the Indian row. The live references currently have no plural aliases, and the search index does not singularize terms.
- A consistent plural-search change would need coordinated qualified plurals for generic, Chinese, Thai, and Indian rows plus bare plurals on the generic row; that wider normalization change is outside this identity proposal. Leave every new plural out. As a result, plural-only queries remain unmatched; use the canonical singular forms for this identity.
- Do not alias bare singular `eggplant` / `aubergine`; those remain generic terms and already return multiple results across the current subtype references.
- Do not alias `baby eggplant`; the Bagara Baingan recipe identifies Indian **or Italian** baby varieties, so “baby” is a size class and not unique to this identity.
- Do not alias `brinjal` or `baingan`; Health Canada’s generic raw-eggplant entry includes `brinjal` beside `eggplant` and `aubergine`, and the reviewed Canadian product titles do not use either term to identify the Indian retail item.
- Do not alias `Asian eggplant`, `aubergine asiatique`, or `aubergine d’Asie`; they are broader than one product class.
- Keep `Chinese eggplant / aubergine chinoise`, `Thai eggplant / aubergine thaïe`, and Italian eggplant terms distinct. No reviewed source says they are synonyms for Metro item 4838.
- Do not add `baingan bharta`, a dish name, as an ingredient alias.

The following projection reproduces `IngredientReferenceSearchIndex` phrase-first and substring-fallback behavior using the live reference/form data and Kotlin search-key normalization (lowercase, compatibility decomposition, accent folding, and punctuation-to-space). It is a static projection, not a runtime or UI test. It includes current generic, Chinese, and Thai rows and the proposed Indian row; there is no plural stemming.

| Query | Current results | With proposed reference |
|---|---:|---:|
| `Indian eggplant` | 0 | 1 — `ingredient-ref-indian-eggplant` |
| `aubergine indienne` | 0 | 1 — `ingredient-ref-indian-eggplant` |
| `Indian eggplants` | 0 | 0 — plural form is not indexed |
| `aubergines indiennes` | 0 | 0 — plural form is not indexed |
| generic `eggplant` | 3 — generic, Chinese, Thai | 4 — generic, Chinese, Thai, Indian |
| generic `aubergine` | 3 — generic, Chinese, Thai | 4 — generic, Chinese, Thai, Indian |
| bare `eggplants` / `aubergines` | 0 / 0 | 0 / 0 — no plural aliases on any of the four rows |
| `Chinese eggplants` / `aubergines chinoises` | 0 / 0 | 0 / 0 — no plural aliases |
| `Thai eggplants` / `aubergines thaïes` | 0 / 0 | 0 / 0 — current Thai alias is singular `aubergine thaï` |
| `Indian` | 5 | 6 — remains multi-result |
| `indienne` | 1 | 2 — remains multi-result |
| `brinjal`, `baingan`, `baby eggplant` | 0 | 0 |
| `Japanese eggplant` / `aubergine japonaise` | 0 | 0 |
| `Chinese eggplant` / `aubergine chinoise` | 1 — Chinese | 1 — unchanged |
| `Thai eggplant` / `aubergine thaïe` | 1 — Thai | 1 — unchanged |

The exact bilingual singular phrases add singleton results. Broad singular eggplant, aubergine, Indian, and indienne queries remain multi-result searches. Bare and qualified plural queries remain unmatched consistently across the four rows; no Indian-only plural alias changes the meaning of a bare plural query.

## Evidence register

Sources were reviewed on 2026-10-15. Retail prices, stock, selected location, and retailer averages can change. Product-page indexing/direct-retrieval limitations are stated below; no claim depends on price or inventory.

| ID | Source | Evidence and limitation |
|---|---|---|
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S01** | Office québécois de la langue française, [aubergine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine) | Preferred Québec French `aubergine` and English `eggplant`; last updated 1990. Its note names Chinese, Japanese, and Thai varieties but does not establish an Indian product name. Use for the generic bilingual boundary only. |
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S02** | Metro Québec, [Aubergine indienne, product 4838](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/aubergine-indienne/p/4838) | Current French product listing names item 4838 `Aubergine indienne` and describes a small, round, deep-purple item. It displays about `$0.40 each` at `$6.59/kg`, with 60 g as the approximate pricing quantity implied by those values, not an average eggplant weight. Search-index and current category-listing content were available; direct product opening returned a cache miss. |
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S03** | Metro Canada, [Indian Eggplant, product 4838](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/indian-eggplant/p/4838) | English counterpart names the same product 4838 `Indian Eggplant` and gives the matching description and price display. The 60 g quantity aligns with the approximate per-item price calculation; it is not stated as an average eggplant weight. The page was search-indexed about one month before review; direct opening returned HTTP 403. This is the same Metro item as S02, not an independent weight source. |
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S04** | Frescadel International / Les Saveurs du Monde (Montréal), [Aubergine indienne](https://www.lessaveursdumonde.ca/aubergine-indienne) | Montréal produce-distributor catalogue page uses the exact French name and describes small-to-medium, deep-purple eggplants used in Indian cooking. The page was directly accessible and lists a Montréal address. Its English-language toggle led to a cache miss; do not treat the FR page as an English source or as a current stock claim. |
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S05** | Walmart Canada, [Aubergine indienne, vendue individuellement](https://www.walmart.ca/fr/ip/aubergine-indienne/6000197106999) | French Canadian listing for SKU 6000197106999 uses `Aubergine indienne` and a 0.03–0.11 kg sold-individually range; direct page opening worked. It displayed a Mississauga default pickup location, so it supports Canadian retail terminology, not Québec-specific availability. |
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S06** | Atlantic Superstore, [Indian Eggplant, product 20055882001_KG](https://www.atlanticsuperstore.ca/en/indian-eggplant/p/20055882001_KG) | Separate Canadian retailer item, directly opened, titles the product `Indian Eggplant`, describes smaller deep-purple eggplants, and reports an average weight of 0.1 kg. This is that retailer’s listing estimate, not a reusable count weight or an independent Metro sample. |
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S07** | Table & Traditions Editors, [Bagara Baingan (Hyderabadi Baby Eggplants in Peanut-Sesame Gravy)](https://www.tableandtraditions.com/recipes/bagara-baingan) | Published 2026-08-07. For this recipe only, specifies 500 g (about 12) small purple brinjals and says Indian or Italian baby varieties work; for a fallback, large globe eggplant can be cut into thick wedges or 4 cm chunks, salted, dried, and fried. It does not give an equivalent amount for the globe-eggplant fallback. The recipe page is a recent publisher source, not a Canadian standard or a Metro-item specification. |
| **WP03-L-INDIAN-EGGPLANT-20261015-R135-S08** | Health Canada, [Canadian Nutrient File, eggplant serving portions, food code 2088](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2088) | Generic raw `Eggplant (aubergine, brinjal), raw / Aubergine, crue` terminology and serving weights; the page is dated 2019. It does not identify Indian eggplant, so none of its weights are transferred to this reference. |

## Numeric, form, substitution, and recipe audit

- **Source-scoped count-weight evidence only:** Walmart’s SKU page gives a 0.03–0.11 kg single-item range; Atlantic Superstore’s distinct product 20055882001_KG gives a 0.1 kg average. Record these as separate observations. Metro product 4838 shows a 60 g approximate pricing quantity at about `$0.40 each` and `$6.59/kg`; because it is the denominator for the price estimate rather than a stated weight average, do not record it as a measurement. None of the retailer figures is pooled or treated as a sampled measurement or universal mean.
- **No reusable count measure:** retailer-specific ranges/averages do not provide a common sample or method, and Health Canada’s CNF amounts are for generic raw eggplant. Add no density, count conversion, portion, edible yield, package yield, or unit mapping.
- **No form:** the retail listings describe fresh eggplant. “Baby” or small-sized produce is not a preparation/preservation state; cooking in curries, stuffing, roasting, and grilling are recipe methods.
- **One dish-scoped fallback:** Table & Traditions gives a specific large-globe-eggplant fallback for its Bagara Baingan recipe, with cut and preparation changes but no equivalent amount. Its requested 500 g covers Indian or Italian baby varieties, not exclusively Metro product 4838. Record only the source-specific finding; add no global/contextual rule or recipe-line link.
- **No bundled recipe demand:** the 114 manifest recipes / 1,123 ingredient rows contain no eggplant terms. Add no recipe links, forms, conversions, yields, or active substitutions.

## Exact proposed JSON delta

Add one identity-only bilingual reference and one evidence-ledger record. Its measurement observations retain separate retail-specific estimates, and its substitution finding stays limited to one named recipe. The active catalog row remains free of mappings, density, and aliases.

```json
{
  "ingredientReference": {
    "id": "ingredient-ref-indian-eggplant",
    "nameFr": "aubergine indienne",
    "nameEn": "Indian eggplant",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-15T00:00:00Z",
    "category": "VEGETABLE_AND_AROMATIC"
  },
  "ledgerRecord": {
    "recordId": "ingredient-ref-indian-eggplant",
    "recordType": "ingredient_reference",
    "identityState": "verified",
    "measurementState": "researched_supported",
    "substitutionResearchState": "researched_supported",
    "sources": [
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S01",
        "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297068/aubergine",
        "title": "Office québécois de la langue française, aubergine (GDT)",
        "versionOrDate": "Last updated 1990; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Preferred French term, English term, and note on Chinese, Japanese, and Thai varieties.",
        "supports": "Supports the generic Québec terms aubergine / eggplant. The old note does not name Indian eggplant and is not a full current subtype list.",
        "sourceKind": "regional_authority"
      },
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S02",
        "url": "https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/aubergine-indienne/p/4838",
        "title": "Metro Québec, Aubergine indienne, product 4838",
        "versionOrDate": "Current listing search-indexed; direct product-page open returned a cache miss; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "French title, product number, fresh-product description, and approximate price-per-item display.",
        "supports": "Names Metro product 4838 Aubergine indienne and describes a small, round, deep-purple eggplant. The page displays about $0.40 each at $6.59/kg; its 60 g quantity is an approximate pricing basis, not an average eggplant weight.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S03",
        "url": "https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/indian-eggplant/p/4838",
        "title": "Metro Canada, Indian Eggplant, product 4838",
        "versionOrDate": "English page search-indexed about one month before review; direct open returned HTTP 403",
        "accessedOn": "2026-10-15",
        "locator": "English title, product number, product description, and approximate price-per-item display.",
        "supports": "Names the same Metro item 4838 Indian Eggplant and shows the matching price display. Its 60 g quantity is an approximate pricing basis, not a stated average eggplant weight; this is the English page for S02, not a separate weight source.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S04",
        "url": "https://www.lessaveursdumonde.ca/aubergine-indienne",
        "title": "Frescadel International / Les Saveurs du Monde, Aubergine indienne",
        "versionOrDate": "Montréal produce-distributor catalogue page; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "French catalogue title, product description, and Montréal contact/address.",
        "supports": "Uses Aubergine indienne for small-to-medium, deep-purple eggplants used in Indian cooking. The English toggle was inaccessible in this review; no stock or current availability claim is inferred.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S05",
        "url": "https://www.walmart.ca/fr/ip/aubergine-indienne/6000197106999",
        "title": "Walmart Canada, Aubergine indienne, SKU 6000197106999",
        "versionOrDate": "French product page directly opened; selected pickup location was Mississauga; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "French item title, sold-individually description, stated 0.03–0.11 kg range, and SKU.",
        "supports": "Uses the exact French product name and a source-reported single-item weight range. The displayed default store is in Ontario, so it supports Canadian naming but not Québec-specific availability.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S06",
        "url": "https://www.atlanticsuperstore.ca/en/indian-eggplant/p/20055882001_KG",
        "title": "Atlantic Superstore, Indian Eggplant, product 20055882001_KG",
        "versionOrDate": "Current product page directly opened; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "English item title, separate product number, product description, and average weight.",
        "supports": "A separate Canadian retailer calls its small deep-purple product Indian Eggplant and reports an average of 0.1 kg per item. Keep this estimate scoped to this listing.",
        "sourceKind": "other"
      },
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S07",
        "url": "https://www.tableandtraditions.com/recipes/bagara-baingan",
        "title": "Table & Traditions Editors, Bagara Baingan (Hyderabadi Baby Eggplants in Peanut-Sesame Gravy)",
        "versionOrDate": "Published 2026-08-07; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Brinjal ingredient line and large-globe-eggplant fallback note.",
        "supports": "The recipe uses 500 g (about 12) small purple brinjals and says Indian or Italian baby varieties work; for this recipe only it permits large globe eggplant cut into thick wedges or 4 cm chunks, salted, dried, and fried. No equivalent replacement amount is stated.",
        "sourceKind": "culinary_reference"
      },
      {
        "sourceId": "WP03-L-INDIAN-EGGPLANT-20261015-R135-S08",
        "url": "https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2088",
        "title": "Health Canada, Canadian Nutrient File, raw eggplant serving portions, food code 2088",
        "versionOrDate": "Page dated 2019-03-01; rechecked 2026-10-15",
        "accessedOn": "2026-10-15",
        "locator": "Generic bilingual raw-eggplant name and serving portions.",
        "supports": "Labels generic raw eggplant as eggplant / aubergine / brinjal and reports unqualified serving weights. It does not identify Indian eggplant and supports no transferred measure or Indian-subtype alias.",
        "sourceKind": "food_composition"
      }
    ],
    "measurementObservations": [
      {
        "observationId": "indian-eggplant-walmart-6000197106999-single-item-range-20261015",
        "relationship": "count_weight",
        "valueIntervals": [
          {
            "lowerValue": 0.03,
            "upperValue": 0.11,
            "unit": "kg",
            "lowerInclusive": true,
            "upperInclusive": true,
            "intervalKind": "source_reported_range",
            "origin": "source_reported",
            "reportedText": "0.03–0.11 kg per single item"
          }
        ],
        "foodDescription": "Fresh Indian eggplant sold individually in Walmart Canada SKU 6000197106999.",
        "foodState": "Fresh produce as sold; no preparation state is specified.",
        "measurementMethod": "Retailer product-title weight range; the page does not state how the bounds were determined.",
        "quantityBasis": "Walmart SKU 6000197106999 only. Keep separate from other retailer estimates and do not use as a reusable count mapping.",
        "sourceQuantity": {"amount": 1, "unit": "item"},
        "evidenceKind": "estimate",
        "sourceIds": ["WP03-L-INDIAN-EGGPLANT-20261015-R135-S05"]
      },
      {
        "observationId": "indian-eggplant-atlantic-superstore-20055882001kg-average-item-weight-20261015",
        "relationship": "count_weight",
        "value": 0.1,
        "valueUnit": "kg",
        "foodDescription": "Fresh Indian Eggplant in Atlantic Superstore product 20055882001_KG.",
        "foodState": "Fresh item as sold; the listing does not describe processing or edible trimming.",
        "measurementMethod": "Retailer-displayed 0.1 kg average per item; weighing method and sample count are not stated.",
        "quantityBasis": "Atlantic Superstore product 20055882001_KG only. Do not pool with the Metro or Walmart listing evidence or use as a generic count conversion.",
        "sourceQuantity": {"amount": 1, "unit": "item"},
        "evidenceKind": "estimate",
        "sourceIds": ["WP03-L-INDIAN-EGGPLANT-20261015-R135-S06"]
      }
    ],
    "substitutionFindings": [
      {
        "findingId": "wp03-indian-eggplant-bagara-baingan-recipe-fallback-20261015",
        "researchState": "researched_supported",
        "fromIngredientRefId": "ingredient-ref-indian-eggplant",
        "replacements": [
          {
            "ingredientRefId": "ingredient-ref-eggplant",
            "roleInCompound": "Large globe eggplant fallback for the small-brinjal component in this Bagara Baingan recipe; source specifies wedges or 4 cm chunks, salting, drying, and frying."
          }
        ],
        "context": "Only Table & Traditions Editors’ Bagara Baingan (Hyderabadi Baby Eggplants in Peanut-Sesame Gravy).",
        "basis": "The recipe names small purple brinjals, accepts Indian or Italian baby varieties, and says a large globe eggplant can be used as a fallback after cutting and preparing it differently. It gives no equivalent amount for the fallback.",
        "limitations": [
          "This recent publisher recipe is not a Canadian or Québec standard.",
          "The requested 500 g covers Indian or Italian baby varieties, not exclusively Metro product 4838.",
          "No replacement amount or count-to-weight conversion is stated.",
          "Do not generalize the fallback to other recipes, methods, eggplant types, or a global/contextual rule."
        ],
        "sourceIds": ["WP03-L-INDIAN-EGGPLANT-20261015-R135-S07"]
      }
    ],
    "decisions": [
      {
        "outcome": "accepted",
        "reason": "Add the separate product-name identity Indian eggplant / aubergine indienne. Current Canadian retailer listings and a Montréal produce distributor support the bilingual singular label; do not infer a species, cultivar, or universal subtype definition. Keep aliases empty: the picker does not singularize, and adding only the qualified Indian plurals would make bare eggplants / aubergines resolve to this subtype. A uniform plural-search change would need coordinated aliases on all four eggplant rows and is outside this identity proposal.",
        "sourceIds": [
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S01",
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S02",
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S03",
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S04",
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S05"
        ]
      },
      {
        "outcome": "accepted",
        "reason": "Retain only Walmart's item-specific range and Atlantic Superstore's item-specific average as separate source-scoped evidence. Metro's 60 g is an approximate pricing basis, not an item average; generic CNF measures do not identify this subtype. No reusable average or count conversion is established.",
        "sourceIds": [
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S05",
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S06",
          "WP03-L-INDIAN-EGGPLANT-20261015-R135-S08"
        ]
      },
      {
        "outcome": "accepted",
        "reason": "Record the large-globe fallback as one Bagara Baingan dish-scoped finding only. No amount is established, and no active rule or recipe-line link is proposed.",
        "sourceIds": ["WP03-L-INDIAN-EGGPLANT-20261015-R135-S07"]
      }
    ]
  }
}
```

## Validation and limitations

- The live reference/form/ledger/legacy audit found no Indian eggplant identity, form, matching legacy candidate, or ID collision. The eight proposal source IDs are unique in the current ledger and were reserved under the unique `WP03-L-INDIAN-EGGPLANT-20261015-R135-` prefix.
- The picker projection gives one result for each canonical singular bilingual phrase. Generic eggplant/aubergine now returns four distinct rows; `Indian` and `indienne` are also multi-result queries. Plural forms are not stemmed by the current matcher; no plural alias is added to any row, and no neighboring subtype alias is added.
- The 114 manifest-listed recipe files and 1,123 ingredient rows contain no eggplant or subtype terminology. No bundled recipe link, form, conversion, yield, or active substitution is proposed.
- Metro pages were usable through current search-index/category content, but direct product URLs returned cache miss / HTTP 403. Its bilingual pages are one product listing, not two measurements; the displayed 60 g is an approximate pricing basis and is not recorded as weight evidence. Walmart’s French item is independently accessible but displayed an Ontario default location; the Atlantic Superstore average and Walmart range are each retailer-specific. No item estimates are combined.
- The Bagara Baingan fallback is outside the bundle and supplies no equivalent amount. It remains a single dish-scoped finding only.
- No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. This is proposal-only review; the project instruction says database-JSON-only additions do not need testing.
