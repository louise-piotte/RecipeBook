# WP03 Section F: Raisin Bran Deux Pelletées family identity review (R189)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Integrated in R189. Two reference rows, two ledger records, the generated Kotlin catalog, the Section F checklist, the roadmap, and the batch README were updated.
- **Reopened condition:** R188 held Raisin Bran Crunch until standard Raisin Bran Deux Pelletées could be reviewed in the same family and picker decision. This review handles both current Canadian siblings together.
- **Open checklist:** The Section F regional cereal and preprocessed-grain sweep remains open in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Recommendation

**Add both current Canadian products as separate identity-only `GRAIN_AND_CEREAL` references.** The manufacturer's current Canadian English and French family pages list standard Two Scoops Raisin Bran and Raisin Bran Crunch separately. Their bilingual SKU pages and UPC-specific SmartLabel pages confirm different products and different nutrition serving weights. Returning both rows for family-level Raisin Bran searches preserves that choice; Crunch-qualified searches still return only Crunch.

Use the manufacturer's product titles and omit trademark symbols from stored names. Add one product-specific French alias per row from the current Québec Provigo title [S11–S12]. Leave English aliases empty: the canonical English names already return both siblings for the broad `Raisin Bran` query.

| Proposed reference ID | `nameEn` | `nameFr` | `aliasesEn` | `aliasesFr` |
| --- | --- | --- | --- | --- |
| `ingredient-ref-kelloggs-two-scoops-raisin-bran` | `Kellogg's Two Scoops Raisin Bran` | `Kellogg's Raisin Bran Deux Pelletées` | `[]` | [`Raisin Bran Céréales format familial`] |
| `ingredient-ref-kelloggs-two-scoops-raisin-bran-crunch-cereal` | `Kellogg's Two Scoops Raisin Bran Crunch Cereal` | `Céréales Kellogg's Raisin Bran deux pelletées Croquantes` | `[]` | [`Raisin Bran Céréales croquantes`] |

Each French alias is the distinctive retailer title for its corresponding product; their normalized keys are different. Do not add an English alias or a shared alias. Do not create product-component links for the wheat, bran, raisins, oats, rice, or granola listed on the labels.

## Product identity and Québec naming

WK Kellogg Canada's English family page lists **Kellogg's Two Scoops Raisin Bran®** and **Kellogg's Two Scoops Raisin Bran® Crunch Cereal** as separate products [S05]. Its French family page separately lists **Kellogg's Raisin Bran Deux Pelletées®** and **Céréales Kellogg's Raisin Bran deux pelletées® Croquantes** [S06]. The current bilingual SKU pages confirm those titles and give separate ingredient declarations [S01–S04]. The standard French product page is set to Québec; the Crunch French SKU page offers Québec retailer routes [S02, S04]. These manufacturer pages support current Canadian French product naming; they are not an OQLF terminology ruling or a promise of local store stock.

Provigo's current Québec product pages use the local retail titles **Raisin Bran Céréales format familial** and **Raisin Bran Céréales croquantes**, identifying a 600 g standard package and a 436 g Crunch package [S11–S12]. Retail titles are supporting local-market evidence, not additional aliases.

The identity boundary is the finished ready-to-eat cereal sold under each named SKU. The label declarations differ: standard Raisin Bran lists bran flakes and raisins; Crunch lists a broader mix including multigrain flakes, raisins, rice cereal, and oat granola components [S01–S04, S07–S10]. The declared ingredients have no proportions, so do not derive a formula or component links. Keep both products distinct from `ingredient-ref-bran-flakes-cereal`, wheat bran, raisins, and other grain references.

## Current ownership and archive audit

At the review snapshot, the live package contained **1,568 ingredient references**, **122 forms**, **61 legacy-import candidates**, and **1,913 research-ledger records** with **8,233 source entries**, **7,028 distinct source IDs**, and **5,822 distinct source URLs**.

At that snapshot, an exact ownership scan found no Raisin Bran or Deux Pelletées reference, form term, legacy candidate, or ledger record. The only focused prior review was the R188 Crunch family-picker hold and its integration note; R188's proposed Crunch ID and source IDs were conditional documentation only. The existing bran-flakes, wheat-bran, and raisin references own their ingredient identities, not either complete cereal product.

After R189 integration, a normalized-key audit against all **1,571** live references confirms that each canonical name and French alias for these two rows has one owner; neither row has an English alias. The standard alias `Raisin Bran Céréales format familial` and Crunch alias `Raisin Bran Céréales croquantes` do not collide with each other or any other reference name or alias. The R189 source IDs are attached to the intended ledger records; family-page and contextual recipe sources are shared only between these two sibling records.

## Picker projection

The picker folds accents and punctuation, searches complete normalized word phrases first, and falls back to partial matching only when no phrase matches [implementation: `IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The following projection uses the integrated R189 reference rows and their product-specific French aliases:

| Query | Integrated results |
| --- | ---: |
| `Raisin Bran` | 2: standard and Crunch |
| `Raisin Bran Deux Pelletées` / `Deux Pelletées` | 2: standard and Crunch |
| `Kellogg's Two Scoops Raisin Bran` | 2: standard and Crunch |
| `Raisin Bran Céréales` | 2: both rows match through their distinct Provigo-title aliases |
| `Raisin Bran cereal` | 2: partial-match fallback finds the normalized query in both French aliases because `cereales` contains `cereal` |
| `Raisin Bran Céréales format familial` | 1: standard |
| `Raisin Bran Céréales croquantes` | 1: Crunch |
| `Raisin Bran Crunch` / full Crunch titles in English or French | 1: Crunch |
| `bran flakes` | 1: existing generic bran-flakes cereal |
| `bran` | 10 |
| `cereal` / `céréales` | 23 / 21 |

The standard product's full title is a phrase within the Crunch title, so the manufacturer's standard-name query returns both rows. That is a deliberate family result, with the visible `Crunch` / `Croquantes` suffix distinguishing the products. `Raisin Bran Céréales` returns both through phrase matching against the two distinct French retailer-title aliases. `Raisin Bran cereal` also returns both, but through partial-match fallback: after normalization, `cereal` is a substring of `cereales` in each alias. This incidental fallback does not come from an English alias; both `aliasesEn` arrays remain empty. Each full French retail title still returns its corresponding single product. Crunch-specific full English and French terms remain exclusive to the Crunch row. `bran flakes` remains with its existing generic owner.

## Bundled recipe-corpus demand

The current manifest contains **114 recipe files and 1,123 structured ingredient rows**. Full-file text and ingredient-row scans for both proposed IDs, the English and French product/family names, Raisin Bran/Deux Pelletées/Crunch wording, UPCs `00059724102514` and `00064100148109`, and Provigo item numbers `21652002_EA` and `21594420_EA` found **0 matching files and 0 matching ingredient rows**. No bundled recipe link or relinking is supported.

## Product-specific measures and substitution boundary

- **Standard product:** WK Kellogg SmartLabel for the 350 g SKU, UPC `00059724102514`, gives a serving of **1 cup (55 g)** in English and French [S07–S08]. Provigo's separate 600 g Québec item `21652002_EA` reports the same label serving [S11]. Record the manufacturer label observation only for its cited UPC; the retailer listing corroborates a separate package listing and does not extend that observation to every package size.
- **Crunch product:** WK Kellogg SmartLabel for the 436 g SKU, UPC `00064100148109`, gives **1 cup (57 g)** in English and French [S09–S10]. Provigo's 436 g item `21594420_EA` corroborates the same serving [S12]. Keep this observation with Crunch.
- **No density or unit mapping:** The two label portions differ by 2 g and are nutrition-label servings, not bulk-density measurements. The labels do not describe cup fill, packing, or a cup-volume convention. Add no `defaultDensity`, `unitMappings`, or reusable volume-to-mass conversion.
- **Recipe context:** A current manufacturer cookie recipe calls for 1 cup (250 mL) of standard Two Scoops Raisin Bran and says results with other products may vary [S13]. It neither names Crunch nor establishes an interchangeable quantity. It remains external recipe context, not bundled demand or a reusable mapping.
- **Forms, yields, substitutions:** Both are ready-to-eat products as sold. No source reviewed establishes a shared preparation form, product yield, or quantity-qualified substitution between these siblings. Add no forms, yield, conversion, recipe link, substitution rule, or substitution finding; use `researched_no_supported_substitute` for each ledger row.

## Integrated reference and ledger details

The two references in `ingredient-references.v1.json` are:

```json
[
  {
    "id": "ingredient-ref-kelloggs-two-scoops-raisin-bran",
    "nameFr": "Kellogg's Raisin Bran Deux Pelletées",
    "nameEn": "Kellogg's Two Scoops Raisin Bran",
    "aliasesFr": ["Raisin Bran Céréales format familial"],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-16T00:00:00Z",
    "category": "GRAIN_AND_CEREAL"
  },
  {
    "id": "ingredient-ref-kelloggs-two-scoops-raisin-bran-crunch-cereal",
    "nameFr": "Céréales Kellogg's Raisin Bran deux pelletées Croquantes",
    "nameEn": "Kellogg's Two Scoops Raisin Bran Crunch Cereal",
    "aliasesFr": ["Raisin Bran Céréales croquantes"],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-16T00:00:00Z",
    "category": "GRAIN_AND_CEREAL"
  }
]
```

The ledger has one `ingredient_reference` record per ID with `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: researched_no_supported_substitute`. The standard record carries sources S01, S02, S05–S08, S11, and S13; the Crunch record carries S03–S06 and S09–S13. Both have empty `substitutionFindings` and no legacy mapping.

The only numeric evidence recorded is these manufacturer-label portion observations:

| Observation ID | Reference | Observation | Source IDs |
| --- | --- | --- | --- |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-M1-STANDARD-55G` | Standard Raisin Bran | `relationship: portion_weight`; `value: 55`; `valueUnit: g`; `observedMassG: 55`; `sourceQuantity: { "amount": 1, "unit": "cup", "unitConvention": "Not specified by the manufacturer." }`; 350 g UPC `00059724102514` only. | S07, S08 |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-M2-CRUNCH-57G` | Raisin Bran Crunch | `relationship: portion_weight`; `value: 57`; `valueUnit: g`; `observedMassG: 57`; `sourceQuantity: { "amount": 1, "unit": "cup", "unitConvention": "Not specified by the manufacturer." }`; 436 g UPC `00064100148109` only. | S09, S10 |

For both observations use `foodState: dry ready-to-eat cereal, as sold`, `measurementMethod: manufacturer SmartLabel nutrition serving`, and a `quantityBasis` limited to the named UPC's label serving, not a generic cereal measure, density, or conversion. Use `evidenceKind: manufacturer_label`. The Provigo pages remain source entries for Québec retail wording and separate package listings; do not combine their amounts with the SmartLabel UPC observations.

## Source register

Sources checked online on 2026-10-16. Each source ID below maps to exactly one URL. R189 source entries are integrated on the two intended ledger records; shared family-page and recipe evidence is attached to both records where it supports their family boundary.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S01` | WK Kellogg Co Canada, [Kellogg's Two Scoops Raisin Bran](https://www.wkkellogg.ca/en/products/raisin-bran-original-product) | Current English SKU page: exact product name, description, ingredient statement, and 350 g through 1,445 g package variants. It sends full nutrition details to SmartLabel; no package-specific measure is inferred here. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S02` | WK Kellogg Co Canada, [Kellogg's Raisin Bran Deux Pelletées](https://www.wkkellogg.ca/fr/produits/raisin-bran-original-product) | Current Canadian French SKU title and ingredients; Québec region selection; 350 g through 1,445 g package variants. Product naming is manufacturer evidence, not an OQLF ruling or a guarantee of store-level availability. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S03` | WK Kellogg Co Canada, [Kellogg's Two Scoops Raisin Bran Crunch Cereal](https://www.wkkellogg.ca/en/products/raisin-bran-crunch-product) | Current English SKU title, Crunch description, ingredient statement, and 436 g package. It points to SmartLabel for full nutrition information. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S04` | WK Kellogg Co Canada, [Céréales Kellogg's Raisin Bran deux pelletées Croquantes](https://www.wkkellogg.ca/fr/produits/raisin-bran-crunch-product) | Current French SKU title and ingredients, 436 g package, and Québec retailer routes. Supports current Québec-facing manufacturer wording, not guaranteed store stock. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S05` | WK Kellogg Co Canada, [Raisin Bran brand page, English](https://www.wkkellogg.ca/en/our-foods/our-brands/raisin-bran) | Current Canadian product-family listing names standard Raisin Bran and Raisin Bran Crunch separately. It does not establish ingredient proportions or interchangeability. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S06` | WK Kellogg Co Canada, [Raisin Bran Deux Pelletées brand page, French](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/two-scoops-raisin-bran) | Current French family listing links separately to the standard and Croquantes SKUs. Supports family scope and French naming. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S07` | WK Kellogg Co Canada SmartLabel, [Two Scoops Raisin Bran, 350 g, UPC 00059724102514, English](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724102514) | Product-matched English manufacturer nutrition label reports 1 cup (55 g), package mass, UPC, ingredients, and current product title. This serving applies to this cited label only. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S08` | WK Kellogg Co Canada SmartLabel, [Raisin Bran Deux Pelletées, 350 g, UPC 00059724102514, French](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00059724102514) | French manufacturer label for the same UPC reports 1 tasse (55 g) and the French product title. Supports the matched French wording and product-specific serving, not a general conversion. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S09` | WK Kellogg Co Canada SmartLabel, [Two Scoops Raisin Bran Crunch Cereal, 436 g, UPC 00064100148109, English](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100148109) | Product-matched English manufacturer nutrition label reports 1 cup (57 g), package mass, UPC, ingredients, and Crunch product title. This serving applies to this cited label only. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S10` | WK Kellogg Co Canada SmartLabel, [Raisin Bran deux pelletées Croquantes, 436 g, UPC 00064100148109, French](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00064100148109) | French manufacturer label for the same Crunch UPC reports 1 tasse (57 g) and the French product title. Supports the matched French wording and product-specific serving, not a general conversion. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S11` | Provigo Québec, [Raisin Bran Céréales format familial, 600 g, item 21652002_EA](https://www.provigo.ca/fr/raisin-bran-c-r-ales-format-familial/p/21652002_EA) | Current selected-store listing supports Québec retail wording, 600 g package, and its 1 cup (55 g) nutrition-panel serving. The retailer says nutrition values are approximate; treat the listing as SKU-specific corroboration. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S12` | Provigo Québec, [Raisin Bran Céréales croquantes, 436 g, item 21594420_EA](https://www.provigo.ca/fr/raisin-bran-c-r-ales-croquantes/p/21594420_EA) | Current listing supports Québec retail wording, the 436 g package, and its 1 cup (57 g) nutrition-panel serving. The retailer says nutrition values are approximate; treat the listing as SKU-specific corroboration. |
| `WP03-RAISIN-BRAN-FAMILY-R189-20261016-S13` | WK Kellogg Co Canada, [Two Scoop Raisin Bran Sweet-and-Salty Raisin Oatmeal Cookies](https://www.wkkellogg.ca/en/recipes/kellogg-s-two-scoop-raisin-bran-sweet-and-salty-raisin-oatmeal-cookies-recipe) | Current manufacturer recipe uses 1 cup (250 mL) of standard Two Scoops Raisin Bran. Its product-specific recipe note says results with other products may vary; it does not list Crunch as an option or define a substitution. |

## Reopen conditions

This family review met R188's stated reopen condition, and both references were integrated together with distinct Québec retailer-title aliases and product-specific SmartLabel observations above. Recheck the bilingual titles, current family listing, UPCs, and serving labels if the products or packaging change. Reopen measures, forms, conversions, recipe links, yields, or substitutions only with direct product-specific evidence or new bundled recipe demand.
