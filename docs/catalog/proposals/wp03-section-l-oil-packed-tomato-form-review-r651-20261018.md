# WP03 Section L R651 — Oil-packed sun-dried tomato form review — 2026-10-18

- **Status:** Integrated.
- **Recommendation:** Add one `sun_dried_packed_in_oil` form under the existing generic tomato reference.
- **Scope:** Model the explicitly oil-packed sun-dried presentation separately from the active R648 dry sun-dried form. Keep tomato identity and aliases unchanged.
- **No numeric behavior:** Add no measure, density, unit mapping, package yield, conversion, recipe link, or substitution. Do not treat Health Canada’s nutrition-label reference amount or a recipe quantity as a reusable kitchen measure.
- **Testing:** No app tests, build, emulator run, or deployment were performed. The project instructions exempt database-JSON-only additions from software testing.

## Why this is the next distinct Section L gap

The Section L tomato checklist remains open because purée and passata product decisions still need their own evidence. R648 integrated the dry `sun_dried` form under `ingredient-ref-tomatoes`; R651 now resolves the separate oil-packed presentation. The nested checklist preserves both decisions separately, and the parent produce item remains open for its other pending candidates.

R128 covered canned whole tomatoes, R129 canned crushed tomatoes, and R130 the separate tomato-purée identity. None covers packing sun-dried tomatoes in oil. The 2026-10-09 tomato/cucurbit coordinator also left oil-packed tomato products pending a Canadian French product source. This review addresses only that remaining named presentation, without reopening those decisions or the fresh-chile reviews.

See the [Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6112), [R648 proposal](wp03-section-l-sun-dried-tomato-form-review-r648-20261018.md), [R648 integration record](../batches/wp03-section-l-sun-dried-tomato-form-integration-r648-20261018/README.md), and [earlier tomato/cucurbit coordinator review](wp03-tomato-cucurbit-coordinator-review-20261009.md).

## Current ownership and ID audit

The post-integration snapshot has **1,833 active references, 164 forms, 56 legacy candidates, 2,206 research-ledger records, and 10,305 ledger source entries**. The manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Current owner and proposed treatment |
|---|---|
| Active reference | `ingredient-ref-tomatoes` is the generic `tomates / tomatoes` identity. Its existing generic aliases, `VEGETABLE_AND_AROMATIC` category, null default density, and empty unit mappings stay unchanged. |
| Tomato forms | The reference owns canned-diced, canned-whole, canned-crushed, R648 `sun_dried`, and R651 `sun_dried_packed_in_oil` forms. The dry form’s label terms are `tomates séchées au soleil / sun-dried tomatoes`; they do not include an oil phrase. |
| Neighboring identities | Cherry and plum tomatoes, tomato paste, purée, passata, sauce, juice, ketchup, and San Marzano PDO tomatoes remain separate. No alias is moved between these records. |
| Legacy archive | No oil-packed or sun-dried-oil-packed candidate, alias, or proposed form ID appears among the 56 archived candidates. No legacy row is promoted. |
| Research ledger | The generic tomato ledger record contains a source-specific 182 g portion for one raw red-ripe whole tomato of 7.6 cm diameter. It is not transferred. The separate R648 dry-form and R651 oil-packed-form ledger records hold their own identity evidence; neither includes a measurement observation. |
| IDs and source ownership | Before integration, the new form ID and R651 source IDs S01–S05 were absent from active references/forms, legacy candidates, and the ledger. The integrated form and ledger record are now present once. The 2008 Health Canada URL is already ledger-owned under S11 for unrelated artichoke/fiddlehead rows; S03 records the tomato-specific locator under its own source ID. Metro’s tuna-salad URL and R648-S03 source ID were reused rather than duplicated. |

The source-ID audit checked the live ledger and catalog archive. The Metro tuna-salad source is reused from the integrated R648 ledger entry; it is not a new source claim.

## Evidence and Québec naming

Health Canada’s current [French](https://www.canada.ca/fr/sante-canada/services/documents-techniques-exigences-etiquetage/etiquetage-nutritionnel-tableau-quantites-reference-aliments.html) and [English](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html) reference-amount tables group sun-dried tomatoes with artichoke hearts and other vegetables packed in oil under one food-label category. The table’s 30 g value is a regulatory nutrition-label reference amount, and its footnote addresses the packing liquid. Neither is a recipe conversion or a reusable ingredient mapping. [S01–S02]

Health Canada’s older 2008 [vegetable table](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-4-vegetables-vegetable-products-nutrient-value-some-common-foods-2008.html) has separate rows for “Tomatoes, sun-dried” and “Tomatoes, sun-dried, packed in oil, drained.” That is direct evidence that the oil-packed, drained presentation is described separately from sun-dried tomatoes generally. The table is not current product-label guidance; no displayed “1 piece” serving is converted into mass or adopted as a measure. [S03]

Metro Québec’s [Cucina Sardo product listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/tomates-sechees-au-soleil-dans-l-huile-d-olive/p/055823052316) is headed “Tomates séchées au soleil dans l’huile d’olive” (product 055823052316). Its indexed ingredient listing includes sun-dried tomatoes, olive oil, water, vinegar, salt, dehydrated garlic, seasoning, calcium chloride, and sulfites. The listing showed a 250 mL package and was marked out of stock when checked; the direct page fetch was blocked. This supports the Québec-facing phrase and one specific formulation, not a universal ingredient list or serving amount. [S04]

Metro’s [Brie recipe](https://www.metro.ca/recettes-et-occasions/recettes/baluchons-de-brie-aux-tomates-sechees) treats oil-packed and rehydrated-and-drained sun-dried tomatoes as alternatives in that one dish. The displayed quantity is recipe-specific and supports no general measure or conversion. [S05] The already-ledgered Metro tuna-salad recipe also names sun-dried tomatoes in oil and separately lists oil from the tomatoes; both quantities are local to that recipe. [R648-S03]

Use the product-qualified Québec label `tomates séchées au soleil dans l’huile` and the federal English phrase `sun-dried tomatoes packed in oil`. Do not claim OQLF approval. Do not add generic `tomates séchées`, `dried tomatoes`, `tomates dans l’huile`, `tomatoes in oil`, brand names, oil types, cuts, herbs, or vinegar as reference aliases. These broader product words either omit the drying qualification or describe only one source-specific product.

## Recipe demand and picker projection

A fresh scan read all **114 manifest-listed recipes and 1,123 ingredient rows**. No ingredient row or recipe text mentions sun-dried tomatoes, tomato-in-oil, or oil-packed tomatoes. The five tomato-related ingredient rows remain:

| Recipe row | Existing wording | Current treatment |
|---|---|---|
| 034#8 | 798 mL canned diced tomatoes | Generic tomatoes with the existing canned-diced form. |
| 078#12 | 2 tbsp tomato paste | Separate tomato-paste reference. |
| 086#12 | 156 mL tomato paste | Separate tomato-paste reference. |
| 090#1 | 1 cup tomato sauce | Separate tomato-sauce reference. |
| 096#1 | 4 large tomatoes, diced | Generic tomatoes; no canned or dried state is inferred. |

No bundled line is relinked. The case for this form is the still-open product checklist and direct Canadian/Québec naming evidence, not bundled recipe frequency.

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized phrase search includes attached form labels and match terms, while a form hint is returned only for an exact full form term. Counts below compare the pre-integration 1,833-reference / 163-form catalog with the one added form and its exact terms; the current package has 164 forms.

| Query | Before | After | Effect |
|---|---:|---:|---|
| `sun-dried tomatoes`, `tomates séchées au soleil` | 1 each | 1 each | Same generic tomato result and the existing R648 `sun_dried` form hint. |
| `sun-dried tomatoes in oil`, `sun-dried tomatoes packed in oil`, `oil-packed sun-dried tomatoes` | 0 each | 1 each | Generic tomato result with the new oil-packed form hint. |
| `tomates séchées au soleil dans l’huile`, singular `tomate séchée au soleil dans l’huile` | 0 each | 1 each | Same generic tomato result with the new form hint. |
| `tomatoes in oil`, `tomato in oil` | 0 each | 1 each | Partial-phrase match to generic tomatoes, with no form hint; these broad queries are not added as aliases. |
| `tomates séchées` | 1 | 1 | Same generic tomato result and no exact form hint. |
| `tomato(es)`, `tomate(s)` | 12 / 4 / 7 / 7 | unchanged | Generic search result sets do not change. |
| `oil`, `huile` | 31 each | 32 each | Broad one-word searches each gain the generic tomato reference because the new form includes the packing word. |

This is one reference with two explicit forms, not a second tomato ingredient identity. The oil-specific form requires the full drying-plus-packing phrase for a form hint; shorter phrases can return the generic tomato without asserting which presentation the recipe uses.

## Exact proposed JSON delta

Add one object to `ingredient-forms.v1.json`. Do not change the tomato reference or any recipe:

```json
{
  "id": "ingredient-form-tomatoes-sun-dried-packed-in-oil",
  "ingredientRefId": "ingredient-ref-tomatoes",
  "formCode": "sun_dried_packed_in_oil",
  "labelFr": "tomates s\u00e9ch\u00e9es au soleil dans l\u2019huile",
  "labelEn": "sun-dried tomatoes packed in oil",
  "prepState": "sun_dried_packed_in_oil",
  "matchTermsFr": ["tomate s\u00e9ch\u00e9e au soleil dans l\u2019huile"],
  "matchTermsEn": [
    "sun-dried tomato packed in oil",
    "sun-dried tomatoes in oil",
    "sun-dried tomato in oil",
    "oil-packed sun-dried tomatoes"
  ],
  "densityGPerMl": null,
  "notesFr": "Forme combinant tomates s\u00e9ch\u00e9es au soleil et emballage dans l\u2019huile. Les sources distinguent les tomates s\u00e9ch\u00e9es des tomates s\u00e9ch\u00e9es emball\u00e9es dans l\u2019huile et \u00e9goutt\u00e9es; les produits qu\u00e9b\u00e9cois contiennent aussi des ingr\u00e9dients propres \u00e0 chaque produit. La quantit\u00e9 de r\u00e9f\u00e9rence de Sant\u00e9 Canada sert \u00e0 l\u2019\u00e9tiquetage nutritionnel, pas \u00e0 une mesure de recette. L\u2019huile, l\u2019\u00e9gouttage, l\u2019assaisonnement, la coupe et l\u2019hydratation ne sont pas mod\u00e9lis\u00e9s.",
  "notesEn": "Combined sun-dried, oil-packed tomato presentation. Sources distinguish sun-dried tomatoes from the oil-packed and drained version; Qu\u00e9bec retail products also contain product-specific ingredients. Health Canada\u2019s reference amount is for nutrition labeling, not a recipe measure. Oil, draining, seasoning, cut, and hydration are not modeled.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Add a form-specific `ingredient_form` ledger record with the sources and decision below if the form is accepted. Keep both research states open; add no measurement observation or substitution finding:

```json
{
  "recordId": "ingredient-form-tomatoes-sun-dried-packed-in-oil",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S01",
      "url": "https://www.canada.ca/fr/sante-canada/services/documents-techniques-exigences-etiquetage/etiquetage-nutritionnel-tableau-quantites-reference-aliments.html",
      "title": "Santé Canada, Étiquetage nutritionnel - Tableau des quantités de référence pour les aliments",
      "versionOrDate": "Publié le 2024-10-18; current table reviewed 2026-10-18",
      "accessedOn": "2026-10-18",
      "locator": "Section V.9, French product-category heading and footnote 2.",
      "supports": "Lists sun-dried tomatoes with artichoke hearts and other vegetables packed in oil in a Canadian food-label category. The 30 g reference amount and liquid exclusion are for nutrition labeling; they do not establish a recipe measure, mass-volume mapping, or density.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S02",
      "url": "https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html",
      "title": "Health Canada, Nutrition labelling - Table of reference amounts for food",
      "versionOrDate": "Published 2024-10-18; current table reviewed 2026-10-18",
      "accessedOn": "2026-10-18",
      "locator": "Section V.9, English product-category heading and footnote 2.",
      "supports": "Lists sun-dried tomatoes with artichoke hearts and other vegetables packed in oil in a Canadian food-label category. The 30 g reference amount and liquid exclusion are for nutrition labeling; they do not establish a recipe measure, mass-volume mapping, or density.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S03",
      "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-4-vegetables-vegetable-products-nutrient-value-some-common-foods-2008.html",
      "title": "Health Canada, Nutrient Value of Some Common Foods, Table 4: Vegetables",
      "versionOrDate": "2008 table",
      "accessedOn": "2026-10-18",
      "locator": "Separate rows “Tomatoes, sun-dried” and “Tomatoes, sun-dried, packed in oil, drained.”",
      "supports": "The older table distinguishes sun-dried tomatoes from sun-dried tomatoes packed in oil and drained. Its table serving display is not converted into a mass, recipe measure, or reusable mapping. This URL is already used by ledger source S11 for other vegetables; this new source ID records the separate tomato rows.",
      "sourceKind": "food_composition"
    },
    {
      "sourceId": "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S04",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/tomates-sechees-au-soleil-dans-l-huile-d-olive/p/055823052316",
      "title": "Metro Québec, Tomates séchées au soleil dans l’huile d’olive Cucina Sardo",
      "accessedOn": "2026-10-18",
      "locator": "Product 055823052316, product title, listed ingredients, package volume, and stock status.",
      "supports": "The Québec retailer uses the French product phrase and lists a specific formulation with sun-dried tomatoes, olive oil, water, vinegar, salt, dehydrated garlic, seasoning, calcium chloride, and sulfites. The listing showed 250 mL and was out of stock when checked; neither the package volume nor ingredients are generalized.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S05",
      "url": "https://www.metro.ca/recettes-et-occasions/recettes/baluchons-de-brie-aux-tomates-sechees",
      "title": "Metro, Brie and Sun-dried Tomato Bundles",
      "accessedOn": "2026-10-18",
      "locator": "Ingredient list and English page wording: sun-dried tomatoes may be oil-packed or rehydrated and drained.",
      "supports": "One Metro recipe presents oil-packed and rehydrated/drained sun-dried tomatoes as alternative preparations. Its 250 mL recipe amount applies only to that recipe and is not a reusable measure, conversion, or substitution.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-L-TOMATO-SUN-DRIED-20261018-R648-S03",
      "url": "https://www.metro.ca/recettes-et-occasions/recettes/salade-de-thon-et-tomates-sechees",
      "title": "Metro Québec, Salade de thon et tomates séchées",
      "accessedOn": "2026-10-18",
      "locator": "Ingredient list and preparation method; existing R648 source ID reused.",
      "supports": "The recipe names sun-dried tomatoes in oil and separately lists the tomatoes’ oil. Those quantities and uses belong to that salad; they do not establish a general measure or oil amount.",
      "sourceKind": "culinary_reference"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add the oil-packed sun-dried tomato presentation as a distinct form under generic tomatoes. Health Canada documents a separate oil-packed category and food description; Québec retail and recipe sources use the qualified French product wording and distinguish oil-packed from other dried-tomato preparations. Keep the form product-state only: add no oil quantity, ingredient composition, draining rule, measure, density, conversion, recipe link, or substitution.",
      "sourceIds": [
        "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S01",
        "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S02",
        "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S03",
        "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S04",
        "WP03-L-TOMATO-OIL-PACKED-20261018-R651-S05",
        "WP03-L-TOMATO-SUN-DRIED-20261018-R648-S03"
      ]
    }
  ]
}
```

## Remaining scope and static checks

This review resolves only the oil-packed sun-dried tomato presentation. Keep fresh/generic tomato aliases, cherry/plum identities, canned cuts, purée, passata, paste, and sauce unchanged. Do not create an oil ingredient link or a dried-to-oil-packed global conversion. The Section L parent remains open.

Static checks: reviewed the current plan, roadmap progress, R128–R130, R648 proposal/integration, the active reference/form package, legacy archive, tomato ledger records, all 114 recipe files, and the picker implementation; verified pre-integration ID/source-ID uniqueness and the final integrated ownership; projected exact and broad picker queries; checked source claims against the opened Health Canada and Québec/Canadian source pages. After integration, bundled package validation, generated-index freshness, ledger schema/source-ID validation, UTF-8/escape checks, local-link checks, and whitespace checks passed. No software tests, build, emulator run, or deployment were performed.

