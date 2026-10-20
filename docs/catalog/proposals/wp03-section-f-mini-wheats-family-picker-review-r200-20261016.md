# WP03 Section F: Mini-Wheats family picker review (R200)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Integrated as eight identity-only `GRAIN_AND_CEREAL` references with accepted ledger records and SKU-specific count/weight observations.
- **Open condition:** R182 held Mini-Wheats Original Frosted pending a family-wide catalog and picker decision. This packet reopens that condition and reviews all products currently listed on the Canadian English and French manufacturer family pages.
- **Recommendation:** Add the eight listed cereal products as separate identity-only GRAIN_AND_CEREAL references, including the previously held Original Frosted SKU. Use the manufacturer’s current Canadian English and French names, with no aliases. Record each source-reported biscuit-count serving only as a product-specific research-ledger observation. Add no active measures, forms, density, mappings, recipe links, conversions, yields, or substitutions.

## Current Canadian family and Québec naming

WK Kellogg Canada’s current English and French Mini-Wheats brand pages each list the same eight products [S01–S02]. The English page calls them distinct products; the French page supplies the following Canadian French titles. The names below omit registered-mark symbols but otherwise retain manufacturer wording.

| English manufacturer title | French Canadian manufacturer title | Proposed ID |
|---|---|---|
| Mini-Wheats Original Frosted Cereal | Céréales Mini-Wheats Originale | ingredient-ref-mini-wheats-original-frosted |
| Mini-Wheats Brown Sugar Flavour Cereal | Céréales Mini-Wheats Saveur de cassonade | ingredient-ref-mini-wheats-brown-sugar |
| Mini-Wheats Strawberry Flavour | Céréales Mini-Wheats Fraise | ingredient-ref-mini-wheats-strawberry |
| Kellogg's Mini-Wheats Low Sugar Cereal | Céréales Kellogg's Mini-Wheats à faible teneur en sucre | ingredient-ref-mini-wheats-low-sugar |
| Mini-Wheats Original Minis Cereal | Céréales Mini-Wheats Minis Originale | ingredient-ref-mini-wheats-original-minis |
| Mini-Wheats Blueberry Flavour Cereal | Céréales Mini-Wheats Bleuet | ingredient-ref-mini-wheats-blueberry |
| Mini-Wheats Chocolate Flavour Cereal | Céréales Mini-Wheats Saveur de chocolat | ingredient-ref-mini-wheats-chocolate |
| Mini-Wheats Pumpkin Spice Flavour Cereal | Céréales Mini-Wheats Saveur d’épices à citrouille | ingredient-ref-mini-wheats-pumpkin-spice |

The French names are current Canadian manufacturer product titles, not OQLF terminology rulings. Québec-facing Maxi listings corroborate local product naming and availability for Original, Brown Sugar, Strawberry, Original Minis, and Blueberry [S05–S09]. The manufacturer’s French brand page is the direct evidence for the Low Sugar, Chocolate, and seasonal Pumpkin Spice French titles. Retailer wording is retained as source evidence, not copied into aliases.

Each product is a named ready-to-eat cereal in the Mini-Wheats family. The manufacturer’s product material describes whole-grain wheat cereals; the current line also includes flavors, a low-sugar product, and a smaller Original Minis product [S01–S04, S06–S12]. Do not turn one SKU into a synonym or form of another. Keep every product separate from plain shredded-wheat cereal: frostings, flavors, product-specific ingredients, and the different Minis biscuit count do not establish process equivalence or a tested substitution.

## Ownership and source-collision audit

The current working tree has **1,579 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,924 research-ledger records**.

Exact normalized-name checks across reference displays and aliases, form labels and match terms, legacy-import names and aliases, and ledger record IDs found no owner for the eight manufacturer titles, any proposed ID, or the Mini-Wheats brand phrase. No Mini-Wheats form or legacy mapping exists. The closest active cereal neighbor is ingredient-ref-shredded-wheat-cereal (shredded wheat cereal / blé filamenté); it remains a separate plain-cereal identity. Bran flakes cereal and wheat bran are also separate product/fraction owners, not Mini-Wheats identities.

The R182 proposal is the only prior Mini-Wheats family review located. It reserved ingredient-ref-mini-wheats-original-frosted but did not add it to the reference catalog or ledger. Reuse that proposed ID for Original Frosted; do not mint a replacement. Reuse R182 source IDs S01–S05 for their exact existing URLs below. Those held R182 sources were not registered in the ledger. New R200 source IDs S06–S12 have unique URLs and were not found in the ledger or proposal archive. No source ID in this packet maps to more than one URL.

## Picker projection

The active picker normalizes accents and punctuation, returns complete word-phrase matches first, and falls back to substring matching only if no phrase matches [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). A static projection over the current references and forms gives:

| Query | Current results | With all eight displays |
|---|---:|---:|
| Mini-Wheats / Mini Wheats | 0 | 8, all listed products |
| Céréales Mini-Wheats | 0 | 7; the official Low Sugar title places Kellogg's between Céréales and Mini-Wheats |
| Mini-Wheats Original | 0 | 2: Original Frosted and Original Minis |
| Mini-Wheats Original Frosted | 0 | 1, Original Frosted |
| Mini-Wheats Original Minis | 0 | 1, Original Minis |
| cereal / céréales | 23 / 21 | 30 / 29 |
| shredded wheat / blé filamenté | 1 / 1 | 1 / 1 |

The brand query returns the full family, while the more restrictive French phrase Céréales Mini-Wheats intentionally misses the Low Sugar row because the exact manufacturer title contains an intervening Kellogg's. Do not add that shared phrase as an alias: exact shared aliases would collide in package validation and would obscure product selection. Keep aliases empty; the broad Mini-Wheats search is the appropriate family query. The generic cereal result grows by seven English matches because the manufacturer’s Strawberry title omits the word Cereal; the French Céréales query returns all eight. The existing shredded-wheat result is unchanged.

## Bundled recipe-corpus demand

The complete manifest-listed bundle contains **114 recipe files and 1,123 ingredient rows**. A normalized scan of each serialized recipe and ingredient row for the eight proposed IDs, exact English/French product-title phrases, and the Mini-Wheats / Mini Wheats family spellings found **zero matching recipe files and zero matching ingredient rows**. No recipe links or legacy mappings are proposed.

## Product-specific numeric evidence and boundaries

Current Québec retailer nutrition panels and Canadian WK Kellogg SmartLabel pages report the following product-specific serving bases [S05–S12]. Record them only as research-ledger observations if the family is accepted. Biscuit counts differ by SKU; do not divide a serving mass by the count to infer a per-biscuit conversion or transfer any serving to a sibling.

| Product | Published serving basis | Source | Limit |
|---|---|---|---|
| Original Frosted | 23 biscuits (55 g) | Maxi Québec [S05] | This listed product and panel only. |
| Brown Sugar | 23 biscuits (55 g) | Maxi Québec [S06] | This listed product and panel only. |
| Strawberry | 23 biscuits (55 g) | Maxi Québec [S07] | This listed product and panel only. |
| Low Sugar | 26 biscuits (54 g) | WK Kellogg Canada SmartLabel [S10] | Manufacturer label basis for this SKU only. |
| Original Minis | 41 biscuits (55 g) | Maxi Québec [S08] | Minis count and mass are SKU-specific; not a count equivalence with Original Frosted. |
| Blueberry | 23 biscuits (55 g) | Maxi Québec [S09] | This listed product and panel only. |
| Chocolate | 21 biscuits (54 g) | WK Kellogg Canada SmartLabel [S11] | Manufacturer label basis for this SKU only. |
| Pumpkin Spice | 25 biscuits (55 g) | WK Kellogg Canada SmartLabel [S12] | Manufacturer label basis for this SKU only; seasonal product. |

These source portions support separate count-to-mass observations, not a cup measure, bulk density, reusable conversion, or common measure for the family. Package weights and sizes are product/package descriptions, not recipe amounts or yields. Add no forms or preparation yields. Product ingredient statements do not give component proportions. The reviewed pages establish no tested, quantity-qualified substitution among Mini-Wheats SKUs, plain shredded wheat, bran flakes, or another cereal; add no substitution finding or rule.

## Proposed reference JSON and ledger plan

If accepted, add all eight references together. The displays are the exact Canadian manufacturer product names above; aliases remain empty to avoid duplicate normalized keys and unintended picker collisions. French accents and punctuation are escaped in this proposed JSON.

    [
      {
        "id": "ingredient-ref-mini-wheats-original-frosted",
        "nameFr": "C\u00e9r\u00e9ales Mini-Wheats Originale",
        "nameEn": "Mini-Wheats Original Frosted Cereal",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      },
      {
        "id": "ingredient-ref-mini-wheats-brown-sugar",
        "nameFr": "C\u00e9r\u00e9ales Mini-Wheats Saveur de cassonade",
        "nameEn": "Mini-Wheats Brown Sugar Flavour Cereal",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      },
      {
        "id": "ingredient-ref-mini-wheats-strawberry",
        "nameFr": "C\u00e9r\u00e9ales Mini-Wheats Fraise",
        "nameEn": "Mini-Wheats Strawberry Flavour",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      },
      {
        "id": "ingredient-ref-mini-wheats-low-sugar",
        "nameFr": "C\u00e9r\u00e9ales Kellogg's Mini-Wheats \u00e0 faible teneur en sucre",
        "nameEn": "Kellogg's Mini-Wheats Low Sugar Cereal",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      },
      {
        "id": "ingredient-ref-mini-wheats-original-minis",
        "nameFr": "C\u00e9r\u00e9ales Mini-Wheats Minis Originale",
        "nameEn": "Mini-Wheats Original Minis Cereal",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      },
      {
        "id": "ingredient-ref-mini-wheats-blueberry",
        "nameFr": "C\u00e9r\u00e9ales Mini-Wheats Bleuet",
        "nameEn": "Mini-Wheats Blueberry Flavour Cereal",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      },
      {
        "id": "ingredient-ref-mini-wheats-chocolate",
        "nameFr": "C\u00e9r\u00e9ales Mini-Wheats Saveur de chocolat",
        "nameEn": "Mini-Wheats Chocolate Flavour Cereal",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      },
      {
        "id": "ingredient-ref-mini-wheats-pumpkin-spice",
        "nameFr": "C\u00e9r\u00e9ales Mini-Wheats Saveur d\u2019\u00e9pices \u00e0 citrouille",
        "nameEn": "Mini-Wheats Pumpkin Spice Flavour Cereal",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
        "category": "GRAIN_AND_CEREAL"
      }
    ]

For each accepted reference, use one ledger record whose `recordId` equals the reference ID, `recordType` is `ingredient_reference`, `identityState` is `verified`, `measurementState` is `researched_supported`, and `substitutionResearchState` is `researched_no_supported_substitute`. Each accepted decision should say that this is a separate named Canadian cereal SKU, keep the exact manufacturer display pair, preserve any serving only as product-specific source evidence, and add no active conversion behavior. Keep `substitutionFindings` empty. Attach the shared English and French family-page sources S01 and S02 to each identity decision, plus each row’s direct SKU or Québec listing source from the table below. In the table, S01–S12 abbreviate the full source IDs in the register.

Each label observation uses `relationship: count_weight`, `value: <mass in g>`, `valueUnit: g`, `sourceQuantity: { "amount": <published biscuit count>, "unit": "biscuits" }`, and the same amount as `observedMassG`. Set `foodDescription` to the named Mini-Wheats SKU’s nutrition-label serving, `foodState` to `dry ready-to-eat cereal, as sold`, `measurementMethod` to the applicable source’s Nutrition Facts serving-size declaration, and `quantityBasis` to `SKU-specific label serving only; do not infer per-biscuit mass, a family measure, density, or a cross-SKU conversion`. Use `evidenceKind: published_portion` for Maxi panels and `manufacturer_label` for SmartLabel.

| Ledger/reference ID | Decision source IDs | Observation ID | Label quantity and mass | Observation source / evidence kind |
|---|---|---|---|---|
| `ingredient-ref-mini-wheats-original-frosted` | S01, S02, S03, S04, S05 | `mini-wheats-original-frosted-23-biscuits-55g-maxi-20261016` | 23 biscuits → 55 g | S05 / `published_portion` |
| `ingredient-ref-mini-wheats-brown-sugar` | S01, S02, S06 | `mini-wheats-brown-sugar-23-biscuits-55g-maxi-20261016` | 23 biscuits → 55 g | S06 / `published_portion` |
| `ingredient-ref-mini-wheats-strawberry` | S01, S02, S07 | `mini-wheats-strawberry-23-biscuits-55g-maxi-20261016` | 23 biscuits → 55 g | S07 / `published_portion` |
| `ingredient-ref-mini-wheats-low-sugar` | S01, S02, S10 | `mini-wheats-low-sugar-26-biscuits-54g-smartlabel-20261016` | 26 biscuits → 54 g | S10 / `manufacturer_label` |
| `ingredient-ref-mini-wheats-original-minis` | S01, S02, S08 | `mini-wheats-original-minis-41-biscuits-55g-maxi-20261016` | 41 biscuits → 55 g | S08 / `published_portion` |
| `ingredient-ref-mini-wheats-blueberry` | S01, S02, S09 | `mini-wheats-blueberry-23-biscuits-55g-maxi-20261016` | 23 biscuits → 55 g | S09 / `published_portion` |
| `ingredient-ref-mini-wheats-chocolate` | S01, S02, S11 | `mini-wheats-chocolate-21-biscuits-54g-smartlabel-20261016` | 21 biscuits → 54 g | S11 / `manufacturer_label` |
| `ingredient-ref-mini-wheats-pumpkin-spice` | S01, S02, S12 | `mini-wheats-pumpkin-spice-25-biscuits-55g-smartlabel-20261016` | 25 biscuits → 55 g | S12 / `manufacturer_label` |

Add each observation’s row-specific source ID only; do not attach another SKU’s retail evidence to it. If an integration omits a product’s SKU-specific observation, set that row’s `measurementState` to `not_yet_researched` and omit its observation instead of using a family or generic cereal value.

Do not add ingredient forms, active measures, density, unit mappings, recipe links, conversions, yields, contextual substitutions, or global conversion rules.

## Source register

Sources were checked online on 2026-10-16. Each source ID maps to exactly one URL. S01–S05 reuse their existing R182 source IDs for the exact same URLs; S06–S12 are new URLs.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S01 | WK Kellogg Co Canada, [Mini-Wheats English family page](https://www.wkkellogg.ca/en/our-foods/our-brands/mini-wheats). | Reused from R182. Current English Canadian family list names all eight products separately. Supports current roster and English product names, not composition or serving amounts for every SKU. |
| WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S02 | WK Kellogg Co Canada, [Mini-Wheats French family page](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/mini-wheats). | Reused from R182. Current Canadian French family list names the same eight products and gives their exact French product titles. This is manufacturer wording, not an OQLF ruling. |
| WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S03 | WK Kellogg Co Canada, [Mini-Wheats Original Frosted Cereal](https://www.wkkellogg.ca/en/products/mini-wheats-original-frosted-cereal-product). | Reused from R182. Current Canadian SKU page supports Original Frosted identity and its ingredient statement. Full nutrition details are routed to SmartLabel; package sizes are not recipe quantities. |
| WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S04 | WK Kellogg Co Canada, [Céréales Mini-Wheats Originale](https://www.wkkellogg.ca/fr/produits/cereales-mini-wheats-originale). | Reused from R182. Current French SKU page confirms the title and lists Québec-region retailers. It is commercial French product wording, not a terminology ruling. |
| WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S05 | Maxi Québec, [Mini Wheats Céréales originale, 460 g](https://www.maxi.ca/fr/mini-wheats-c-r-ales-originale/p/21607207_EA). | Reused from R182. Current Québec listing gives item 21607207_EA and reports 23 biscuits (55 g) on its nutrition panel. The retailer warns that panel information may be approximate; retain only for this SKU. |
| WP03-MINI-WHEATS-FAMILY-R200-20261016-S06 | Maxi Québec, [Mini Wheats Saveur de cassonade](https://www.maxi.ca/fr/mini-wheats-saveur-de-cassonade-format-familial-c/p/21430741_EA). | Current Québec listing reports 23 biscuits (55 g) for the listed Brown Sugar product; local title and package are retailer-specific. Do not transfer its measure to another SKU. |
| WP03-MINI-WHEATS-FAMILY-R200-20261016-S07 | Maxi Québec, [Mini Wheats Céréales fraise](https://www.maxi.ca/fr/mini-wheats-c-r-ales-fraise/p/21651989_EA). | Current Québec listing supports local Strawberry wording and reports 23 biscuits (55 g) for item 21651989_EA. The retailer title is evidence, not an alias. |
| WP03-MINI-WHEATS-FAMILY-R200-20261016-S08 | Maxi Québec, [Mini Wheats Céréales Mini Wheat Minis Originale](https://www.maxi.ca/fr/mini-wheats-c-r-ales-mini-wheat-minis-originale/p/21607199_EA). | Current Québec listing supports local Minis wording and reports 41 biscuits (55 g) for item 21607199_EA. Its count is specific to Minis. |
| WP03-MINI-WHEATS-FAMILY-R200-20261016-S09 | Maxi Québec, [Mini Wheats Céréales bleuet](https://www.maxi.ca/fr/mini-wheats-c-r-ales-bleuet/p/21652057_EA). | Current Québec listing supports local Blueberry wording and reports 23 biscuits (55 g) for item 21652057_EA. The retailer title is evidence, not an alias. |
| WP03-MINI-WHEATS-FAMILY-R200-20261016-S10 | WK Kellogg Canada SmartLabel, [Mini-Wheats Low Sugar Cereal](https://smartlabel.kelloggs.com/en_CA/Product/Index/00064100148123). | Canadian manufacturer label page for the 450 g Low Sugar product. Reports 26 biscuits (54 g); the panel says to check the package for current information. The value is this SKU’s label basis only. |
| WP03-MINI-WHEATS-FAMILY-R200-20261016-S11 | WK Kellogg Canada SmartLabel, [Mini-Wheats Chocolate Flavour Cereal](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724101920). | Canadian manufacturer label page for the 377 g Chocolate product. Reports 21 biscuits (54 g); retain this only as the product’s own label serving. |
| WP03-MINI-WHEATS-FAMILY-R200-20261016-S12 | WK Kellogg Canada SmartLabel, [Mini-Wheats Pumpkin Spice Flavour Cereal](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724104686). | Canadian manufacturer label page for the 460 g seasonal product. Reports 25 biscuits (55 g). This does not make the seasonal SKU a permanent year-round offering or provide a family measure. |

## Recommendation and reopen conditions

**Add all eight Mini-Wheats identities together** using the proposed names and IDs. This completes the R182 family-picker condition: Mini-Wheats and Mini Wheats will return all eight listed Canadian products, while Original Frosted and Original Minis remain individually selectable. Keep plain shredded-wheat cereal and cereal components separate. Retain the eight source-reported count/weight servings only as individual ledger observations. Keep aliases, forms, active measures, density, unit mappings, recipe links, conversions, yields, and substitutions empty. The bundled corpus has no matching demand.

Reopen this decision if WK Kellogg changes the Canadian roster, adds/removes/renames a SKU, the seasonal Pumpkin Spice product leaves the current line, Québec retailer evidence materially changes, a product label changes its portion basis, new evidence supports a reusable measure or substitution, or the bundled recipe corpus gains a concrete Mini-Wheats ingredient line.


## Integration disposition

Root independently reviewed the current English and French Canadian manufacturer family pages, which list the same eight distinct products and provide their exact Canadian display names. Root also checked the Québec retailer panels for Original Frosted, Brown Sugar, Strawberry, Original Minis, and Blueberry, plus the Canadian manufacturer SmartLabel panels for Low Sugar, Chocolate, and Pumpkin Spice. The eight source-reported serving bases match the proposal; each remains a product-specific ledger observation.

Added the eight references together, reopening and satisfying R182’s family-wide condition. The Mini-Wheats query returns all eight products; the more restrictive `Céréales Mini-Wheats` phrase returns seven because the manufacturer places `Kellogg’s` between those words in the Low Sugar title. Aliases remain empty. No forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions were added. The corpus has no matching demand.

The Section F checklist and roadmap now record the family addition. Static seed/package, catalog normalization, generated-index, ledger schema, source-ID/URL ownership, picker projection, recipe-corpus, encoding, local-link, and whitespace checks passed. No software tests or emulator checks were run because the application change adds database JSON data under `AGENTS.md`.
