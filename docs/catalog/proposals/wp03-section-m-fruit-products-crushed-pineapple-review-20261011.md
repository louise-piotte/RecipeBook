# WP03 Section M — crushed-pineapple form review

- **Reviewed:** 2026-10-11
- **Coordinator status:** Integrated on 2026-10-11 as a crushed-pineapple form and exact recipe-row assignment; no measurement or package-yield behavior was added.
- **Scope:** one exact Section M fruit-product qualifier found in the current 114-recipe bundle.
- **Disposition:** accept a `crushed` form under the existing pineapple reference and associate it with recipe 053#14. Do not encode canned status, packing liquid, a drained-volume basis, or a measurement conversion.

## Recommendation

Add the bilingual form **crushed pineapple / ananas broyé** to `ingredient-ref-pineapple`. The exact bundle line is `1 cup crushed pineapple, drained`; current Canadian producer and Québec retail product pages use the same product wording in English and French. Canadian product classifications also distinguish crushed pineapple from sliced, tidbit, and chunk styles.

The recipe file has `source: null`. Its line says `crushed and drained`, but does not say `canned` or identify the packing medium. The form should therefore record the crushed physical format only. Keep `drained` in the line’s existing bilingual preparation and do not infer canned fruit, pineapple juice, syrup, a net-versus-drained quantity basis, or an equivalence to any one branded product.

No new ingredient reference is needed. Keep the existing `pineapple / ananas` reference as the parent. Add no aliases, density, unit mapping, package yield, conversion, or substitution.

## Current catalog and prior-work audit

The manifest currently contains 114 recipes and 1,123 ingredient rows. The live package has 1,020 ingredient references and 69 ingredient forms. `ingredient-ref-pineapple` is an existing `FRUIT` reference with display names `pineapple / ananas`, no aliases, density, or unit mappings; no form currently points to it. Its ledger record is `unreviewed` with no sources.

The only proposed form ID, `ingredient-form-pineapple-crushed`, is unused in references, forms, and the ledger. The parent reference ID is already active. This packet does not repeat the completed citrus-zest review or the 2026-10-11 date/cherry pitting-form review. It also treats the 2026-10-10 strawberry-purée identity and recipe link as complete.

Relevant prior work:

- `docs/catalog/proposals/wp03-section-m-fruit-pitting-form-review-20261011.md` and its integration README cover recipe 024#1 dates, 029#1 cherries, and 058#2 dates.
- `docs/catalog/proposals/wp03-dried-orange-zest-identity-review-20261010.md` covers the separate dried-orange-zest product. Existing lemon-zest and citrus-zest references remain as-is.
- `docs/catalog/proposals/wp02-section-d-fruit-product-boundary-review-20261010.md` integrated the strawberry-purée identity and recipe 051#12 link.
- The Section M checklist in `docs/RecipeBook-global-ingredient-catalog-plan.txt` continues to list juice, peel, pulp, concentrate, purée, canned fruit, jams, jellies, preserves, compote, and fruit butter as open families. This packet resolves only one exact crushed-fruit form.

## Exact recipe-row audit

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for fruit terms together with product or preparation terms such as juice, zest, jam, purée, canned, drained, crushed, dried, candied, and pitted. The table lists every fruit-token row matching that surface scan; rows closed by prior packets and rows outside WP03 Section M are labeled accordingly.

| Row | Exact English text | Current reference | Audit |
|---|---|---|---|
| 007#5 | `5 g vinegar or lime juice` | none | Mixed alternative, not a new juice identity. Existing lime-juice identity is available, but the line does not select it separately from vinegar; leave unlinked. |
| 010#7 | `1 tsp lemon zest` | `ingredient-ref-lemon-zest` | Existing citrus product; no change. |
| 010#10 | `120 ml raspberry jam` | `ingredient-ref-raspberry-jam` | Existing preserve identity; no change. |
| 012#2 | `1 tbsp grated lemon zest` | `ingredient-ref-lemon-zest` | Existing zest identity; retain `grated` as line preparation. |
| 012#6 | `60 ml fresh lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity; retain `fresh` as line preparation. |
| 014#4 | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity. This cake-filling recipe uses whole blueberries as an ingredient; it does not request purchased blueberry filling. |
| 014#5 | `1 tsp lemon zest` | `ingredient-ref-lemon-zest` | Existing zest identity; no change. |
| 019#5 | `2 tsp fresh lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity; no change. |
| 024#1 | `425 g Medjool dates, pitted and chopped` | `ingredient-ref-medjool-dates` | Pitted-date form and recipe line were reviewed in the completed 2026-10-11 packet; excluded here. |
| 024#3 | `2 tbsp lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity; no change. |
| 025#9 | `1/2 cup dried cranberries, chopped` | `ingredient-ref-dried-cranberries` | Existing dried-fruit identity; no change. |
| 028#5 | `1 tbsp maraschino cherry juice` | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` | Existing distinct product identity; no change. |
| 028#7 | `16 maraschino cherries, drained and chopped` | `ingredient-ref-cerises-au-marasquin` | Existing maraschino-cherry identity; drainage/chopping remain line preparation. |
| 029#1 | `460 g pitted cherries, fresh or frozen` | `ingredient-ref-cherries` | Pitted-cherry form and recipe line were reviewed in the completed 2026-10-11 packet; excluded here. |
| 029#4 | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity. “Cherry cake filling” is the recipe output, not a purchased filling ingredient. |
| 034#13 | `3 tbsp lime juice` | `ingredient-ref-lime-juice` | Existing juice identity; no change. |
| 051#12 | `1/2 cup reduced strawberry puree` | `ingredient-ref-strawberry-puree` | Separate purée identity and recipe link already integrated; excluded here. |
| 053#14 | `1 cup crushed pineapple, drained` | `ingredient-ref-pineapple` | **Candidate:** add and assign `ingredient-form-pineapple-crushed`; retain the exact text, quantity, unit, parent reference, and preparation. This is the only new form proposed. |
| 058#2 | `1 1/4 cups dates, pitted and chopped` | `ingredient-ref-dates` | Pitted-date form and recipe line were reviewed in the completed 2026-10-11 packet; excluded here. |
| 062#1 | `25 g freeze-dried strawberries` | `ingredient-ref-freeze-dried-strawberries` | Existing dried-fruit product identity; no change. |
| 067#6 | `2 tbsp maraschino cherry juice` | `ingredient-ref-jus-du-pot-de-cerises-au-marasquin` | Existing distinct product identity; no change. |
| 067#8 | `18 maraschino cherries` | `ingredient-ref-cerises-au-marasquin` | Existing product identity; no change. |
| 070#10 | `3/4 cup canned coconut milk, room temperature` | `ingredient-ref-coconut-milk` | Existing DAIRY_AND_ALTERNATIVE reference; outside Section M fruit-product scope. |
| 086#13 | `1 cup canned coconut milk` | `ingredient-ref-coconut-milk` | Existing DAIRY_AND_ALTERNATIVE reference; outside Section M fruit-product scope. |
| 095#2 | `1/2 cup canned coconut milk` | `ingredient-ref-coconut-milk` | Existing DAIRY_AND_ALTERNATIVE reference; outside Section M fruit-product scope. |
| 095#7 | `1 tbsp fresh lime juice` | `ingredient-ref-lime-juice` | Existing juice identity; no change. |
| 106#3 | `1/2 tsp lemon zest` | `ingredient-ref-lemon-zest` | Existing zest identity; no change. |
| 106#4 | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity; no change. |
| 108#3 | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity; no change. |
| 111#5 | `Fresh aromatics such as thyme, dill, parsley, thinly sliced shallots, and/or citrus zest` | none | Optional instruction ingredient with no quantity or separate fruit row; not a new citrus-zest identity. |
| 112#3 | `10 g freeze-dried raspberries` | `ingredient-ref-freeze-dried-raspberries` | Existing dried-fruit product identity; no change. |
| 112#4 | `Extra freeze-dried raspberries for coating` | `ingredient-ref-freeze-dried-raspberries` | Existing dried-fruit product identity; no change. |
| 113#5 | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice` | Existing juice identity; no change. |

The title `Cranberry Sauce` in recipe 098 names a recipe output: its ingredient 098#1 is `1 box cranberries`, linked to `ingredient-ref-cranberries`. Recipe 065 mentions cranberry sauce only as an optional topping example in notes, not as an ingredient row. Neither line requests a purchased sauce. Likewise, recipe 014#1 is `450 g blueberries, fresh or frozen`; the word “filling” in its title does not indicate a commercial filling product. The scan found no other open recipe line for fruit juice, peel, pulp, concentrate, purée, canned fruit, jam, jelly, preserve, compote, or fruit butter.

## Proposed reference and form data

The parent reference remains unchanged:

```json
{
  "id": "ingredient-ref-pineapple",
  "nameFr": "ananas",
  "nameEn": "pineapple",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-03-23T00:00:00Z",
  "category": "FRUIT"
}
```

Proposed form row:

```json
{
  "id": "ingredient-form-pineapple-crushed",
  "ingredientRefId": "ingredient-ref-pineapple",
  "formCode": "crushed",
  "labelFr": "ananas broyé",
  "labelEn": "crushed pineapple",
  "prepState": "crushed",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "La forme nomme uniquement le fruit broyé. Les sources canadiennes consultées documentent des produits commerciaux d’ananas broyé en conserve, mais la ligne 053#14 ne précise pas que le fruit est en conserve ni le liquide de conditionnement. Aucune densité, conversion ou relation de rendement n’est établie.",
  "notesEn": "This form names the crushed fruit only. The Canadian sources reviewed document commercial canned crushed pineapple, but line 053#14 does not state that the fruit is canned or name its packing medium. No density, conversion, or yield relationship is established.",
  "updatedAt": "2026-10-11T00:00:00Z"
}
```

For recipe 053#14 (`1da10533-75ef-41b4-af55-298775c4c9ea-ingredient-14`), the exact proposed assignment is:

```json
{
  "id": "1da10533-75ef-41b4-af55-298775c4c9ea-ingredient-14",
  "originalText": "1 cup crushed pineapple, drained",
  "ingredientName": "pineapple",
  "ingredientRefId": "ingredient-ref-pineapple",
  "ingredientFormId": "ingredient-form-pineapple-crushed",
  "quantity": 1,
  "unit": "cup",
  "preparation": {
    "fr": "écrasé et égoutté",
    "en": "crushed and drained"
  },
  "group": "Cake"
}
```

Keep the recipe’s existing bilingual preparation intact even though `crushed` also appears in the form label, matching the package’s existing pattern for reference, form, and line preparation. The line says drained, but available product pages do not give a drained mass or a matching cup-to-mass measure.

## Proposed ledger JSON

Update the existing parent ledger record with direct OQLF support for its already-active FR/EN name; leave its measurement and substitution states untouched:

```json
{
  "recordId": "ingredient-ref-pineapple",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-PINEAPPLE-FORM-20261011-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297104/ananas",
      "title": "Office québécois de la langue française, ananas (GDT)",
      "accessedOn": "2026-10-11",
      "locator": "Food-fruit domain, preferred French term, English translation, and Latin name.",
      "supports": "Supports the existing generic pineapple / ananas fruit identity and botanical name Ananas comosus. Does not define a crushed, canned, or drained product form.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Verify the existing pineapple / ananas FRUIT identity from OQLF terminology. Keep its active display names and empty aliases unchanged; this evidence does not establish product forms or measurements.",
      "sourceIds": [
        "WP03-PINEAPPLE-FORM-20261011-S01"
      ]
    }
  ]
}
```

Add this ledger record for the form:

```json
{
  "recordId": "ingredient-form-pineapple-crushed",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-PINEAPPLE-FORM-20261011-S02",
      "url": "https://dolefoodservice.ca/products/crushed-pineapple-in-juice/",
      "title": "Dole Canada Foodservice, Crushed Pineapple in Juice",
      "accessedOn": "2026-10-11",
      "locator": "Product name, ingredients, description, and canned-pineapple navigation.",
      "supports": "Current Canadian manufacturer page names a 398 mL DOLE Crushed Pineapple in Juice product, lists crushed pineapple and pineapple juice, and describes the fruit as finely crushed. Product and packing-medium evidence only; it does not identify recipe 053#14’s product or drained cup mass.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-PINEAPPLE-FORM-20261011-S03",
      "url": "https://dolefoodservice.ca/fr/products/crushed-pineapple-in-juice/",
      "title": "Dole Canada Foodservice, Ananas broyé dans du jus",
      "accessedOn": "2026-10-11",
      "locator": "French product heading, ingredient list, description, and canned-pineapple navigation.",
      "supports": "The Canadian French product page names Ananas broyé DOLE dans du jus and lists ananas broyé and jus d’ananas. Supports ananas broyé as product wording, not a claim that the bundled recipe uses this brand or packing medium.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-PINEAPPLE-FORM-20261011-S04",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/food-product-innovation/changes",
      "title": "Canadian Food Inspection Agency, Food Product Innovation initiative: summary of changes",
      "accessedOn": "2026-10-11",
      "locator": "List of products including pineapple, sliced, crushed, tidbits or chunks; packaged-fruit categories.",
      "supports": "The Canadian regulatory summary lists pineapple cut styles including crushed and distinguishes fruit packaged with water, juice, juice from concentrate, or syrup. It supports a distinct cut style and separate packing-medium boundary, not the recipe line’s package state.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-PINEAPPLE-FORM-20261011-S05",
      "url": "https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fruit/crushed-pineapple-in-pineapple-juice/p/059749888325",
      "title": "Metro, Selection Crushed Pineapple in Pineapple Juice (540 mL)",
      "accessedOn": "2026-10-11",
      "locator": "Product heading, canned-fruit aisle, 540 mL size, and ingredient list; the French sibling listing uses Ananas broyés dans du jus d’ananas.",
      "supports": "Current Québec retail listing corroborates bilingual crushed-pineapple product wording. This specific Selection item is packaged in pineapple juice and has a 540 mL declared size; it does not supply the drained amount or basis for recipe 053#14.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add crushed pineapple / ananas broyé as a physical form under the existing pineapple identity and assign it to recipe 053#14. Keep canned status and packing medium unspecified because the recipe line omits them; preserve its authored text, quantity, unit, and bilingual preparation. Add no aliases, density, measure, unit mapping, conversion, yield, or substitution.",
      "sourceIds": [
        "WP03-PINEAPPLE-FORM-20261011-S02",
        "WP03-PINEAPPLE-FORM-20261011-S03",
        "WP03-PINEAPPLE-FORM-20261011-S04",
        "WP03-PINEAPPLE-FORM-20261011-S05"
      ]
    }
  ]
}
```

## Evidence and limits

All pages below were accessed 2026-10-11.

| Source | Evidence used | Limit |
|---|---|---|
| [OQLF, *ananas*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297104/ananas) | Preferred Québec French `ananas`; English `pineapple`; food-fruit domain; Latin *Ananas comosus*. | Generic fruit identity only; no crushed, canned, drained, or packing-medium definition. |
| [Dole Canada Foodservice, *Crushed Pineapple in Juice*](https://dolefoodservice.ca/products/crushed-pineapple-in-juice/) and [*Ananas broyé dans du jus*](https://dolefoodservice.ca/fr/products/crushed-pineapple-in-juice/) | Same Canadian product in English and French; product pages describe finely crushed fruit in juice and list the fruit and packing juice. | Manufacturer-specific product. It is not evidence that recipe 053#14 names Dole or that its quantity uses this product’s package basis. |
| [CFIA, *Food Product Innovation initiative: summary of changes*](https://inspection.canada.ca/en/food-labels/labelling/food-product-innovation/changes) | Canadian product list groups pineapple by cut style, including crushed; the same page distinguishes packing media for fruit. | A regulatory summary of product categories, not a source for this recipe’s state or a drained-weight conversion. |
| [Metro, *Selection Crushed Pineapple in Pineapple Juice*](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fruit/crushed-pineapple-in-pineapple-juice/p/059749888325) and [French product listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/fruits/ananas-broyes-dans-du-jus-d-ananas/p/059749888325) | Québec grocery product listings use `Crushed Pineapple in Pineapple Juice` / `Ananas broyés dans du jus d’ananas`; the English page lists a 540 mL product and ingredients. | Retailer listing for a specific SKU, subject to change; does not state drained mass or prove that recipe 053#14 uses a canned product. |

The Dole nutrition pages also show a serving of 2/3 cup (167 mL), but do not provide a matching drained mass for the recipe’s 1 cup line. This value is not a density, serving conversion, or yield observation for the proposed form. No measurement data should be imported from those product pages.

## Proposed disposition

Accept one `crushed` form and its exact recipe-row assignment. Keep the existing pineapple reference display and aliases untouched. Keep the recipe wording and its `drained` preparation intact. Leave canned status, packaging liquid, drained weight, density, and all conversions unresolved. The remaining Section M fruit-product checklist stays open.


## Coordinator integration

Added `ingredient-form-pineapple-crushed`, updated the existing pineapple identity evidence record, and linked only recipe 053#14. The recipe line’s wording, cup quantity, and bilingual drained preparation are preserved. Canned status, packing medium, drained mass, conversions, yields, and substitutions remain unspecified.
