# WP02 A6 R785 — Generic glutinous rice flour measurement review

- **Status:** Integrated on 2026-10-18 in the [R785–R787 batch](../batches/wp02-wp03-wp04-r785-r787-gap-review-integration-20261018/README.md); five source-scoped portions were added to the existing ledger row.
- **Disposition:** Record source-scoped product and recipe portions on the existing generic glutinous-rice-flour ledger row and set transferable measurement research to `researched_no_supported_value`. Keep density null and unit mappings empty. Do not change the ingredient reference or substitution research.
- **Target:** `ingredient-ref-glutinous-rice-flour`, `glutinous rice flour / farine de riz gluant`, category `FLOUR_AND_STARCH`.
- **Open gap:** The live ledger has `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, and no measurement observations. The 2026-10-06 identity review explicitly left measurement open. This is distinct from R782’s generic-spelt substitution review and completed A6 checklist reviews.
- **Scope:** WP02 A6 includes “other regional grain flours” in its continuing review. The generic glutinous-rice-flour identity was integrated earlier under A4/B5 and remains distinct from glutinous-rice grain and the separately named Mochiko and Shiratamako rows. Keep each proposed observation tied to its exact product or recipe context.
- **Assigned IDs:** R785 allocated new source IDs `WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S01`–`S03`, reused chart source ID `WP02-B23-RESIDUAL-20261010-S05`, and added five observation IDs ending `-r785-20261018`. The chart URL and shared source ID were already present in the live ledger for other ingredient rows; the R785 record reuses that source ID with a Sweet White Rice Flour locator. The proposal path and new observation IDs were collision-checked before integration.

## Recommendation

Set `measurementState` on `ingredient-ref-glutinous-rice-flour` to `researched_no_supported_value` and append five `portion_weight` observations:

1. Bob’s Red Mill Sweet White Rice Flour label: `1/4 cup (40 g)`, limited to that named product.
2. Bob’s Red Mill Flour Weight Chart: `1 cup (160 g)` Sweet White Rice Flour, limited to Bob’s named product and the chart’s volume-measuring guidance.
3. King Arthur Baking’s Hotteok formula: `1/2 cup (60 g)` sweet glutinous rice flour, with Koda Farms Mochiko preferred; retain this as one recipe portion, not a serving or generic cup conversion.
4. King Arthur Baking’s Jiān Duī formula: `3/4 cup (90 g)` water-milled glutinous rice flour.
5. The same Jiān Duī formula’s second divided flour portion: `1/3 cup (40 g)` water-milled glutinous rice flour.

The Bob’s Red Mill product page reports the `1/4 cup (40 g)` label portion but omits a cup-filling method. Its separate chart lists the same product at `1/4 cup = 40 g` and `1 cup = 160 g`; the chart’s accompanying volume-measuring guidance recommends fluffing, spooning into the cup, and leveling without packing or scooping from the bag. Record the matching quarter-cup portion once, linked to both sources, and add the distinct one-cup chart portion. These are still Bob’s product-specific values; the chart does not establish a generic measure or controlled experimental protocol. The King Arthur portions remain formula-specific. Do not average or derive a generic cup weight, density, conversion, or `unitMapping`.

Keep the reference’s current names, aliases, category, and empty form list. Keep Mochiko, Shiratamako, black glutinous rice flour, ordinary rice flour, and glutinous-rice grain distinct. Leave `substitutionResearchState: not_yet_researched`; this measurement review does not assess substitution directions. Add no recipe-line link, alias, form, density, mapping, conversion, yield, or active rule.

## Current row and prior-work boundary

| Surface | Current state | R785 disposition |
|---|---|---|
| Active ingredient reference | `ingredient-ref-glutinous-rice-flour`, `glutinous rice flour / farine de riz gluant`; EN aliases `sweet rice flour` and `sweet rice powder`; `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []`. | Keep unchanged. |
| Generic ledger row | Identity `verified`; measurement and substitution both `not_yet_researched`; no observations or substitution findings. | Set measurement research to `researched_no_supported_value`; append five portions and one measurement decision. Keep substitution state unchanged. |
| Earlier identity work | The [2026-10-06 identity note](../batches/glutinous-rice-flour-identity.md) accepted the generic identity and aliases while explicitly leaving measurement and substitution research open. | Do not repeat identity work or transfer ordinary rice-flour values. |
| Neighboring products | Mochiko and Shiratamako have separate active references. The [R159–R161 integration](../batches/wp02-wp03-wp04-mochiko-barley-onion-integration-20261011/README.md) retained them as named products and recorded Télé-Québec’s Shiratamako-to-Mochiko replacement only for its ice-cream-mochi recipe. | Do not transfer that recipe or quantity to the generic row. |
| Completed R782 | R782 reviews generic spelt-flour substitution evidence. Its row and findings do not cover glutinous rice flour. | No overlap with R782. |
| Forms and active conversions | The generic row has no forms, density, mappings, or unit-conversion entries. | Add none. |

## Primary evidence and limits

**Bob’s Red Mill, [Sweet White Rice Flour](https://www.bobsredmill.com/product/sweet-white-rice-flour)** is a current manufacturer product page. It identifies the product as milled from glutinous rice and lists a Nutrition Facts serving of `1/4 cup (40 g)`. The declared portion applies to Bob’s product; the page does not state how the flour is filled or weighed into the cup. Its ingredient line says “Sweet White Rice,” so the observation remains tied to the named product.

**Bob’s Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart)** is the manufacturer’s chart for its own flours. Its Sweet White Rice Flour row lists `1/4 cup = 40 g` and `1 cup = 160 g`. The page also recommends the spoon-and-level volume method: fluff the flour, spoon it into a measuring cup, and level it, without packing or scooping directly from the bag. The chart’s quarter-cup value matches Bob’s product label and should corroborate that observation rather than create a duplicate. Record the chart’s distinct one-cup value as a second product-specific observation. The accompanying guidance supplies the method for measuring by volume; the page does not provide a controlled weighing protocol or cup-capacity specification. Neither value transfers to other glutinous rice flours.

**King Arthur Baking, [Hotteok (Korean Sweet Pancakes)](https://www.kingarthurbaking.com/recipes/hotteok-korean-sweet-pancakes-recipe)**, updated 2026-03-19, lists `1/2 cup (60 g)` sweet glutinous rice flour in its yeast-dough formula and says Koda Farms Mochiko is preferred. This is one recipe portion, not a label serving or universal measure. It does not establish that all products represented by the generic reference share Mochiko’s portion weight.

**King Arthur Baking, [Jiān Duī (Fried Sesame Balls)](https://www.kingarthurbaking.com/recipes/jian-dui-fried-sesame-balls-recipe)**, updated 2026-09-17, lists `3/4 cup (90 g)` plus `1/3 cup (40 g)` water-milled glutinous rice flour, divided, with more flour as needed. Its tips say water-milled flour, such as Erawan, is essential for the recipe’s chewy texture. These are formula-specific amounts for a process-qualified flour in a dough first made into a hot-syrup paste. They do not establish a measure for unqualified flour or Mochiko/Shiratamako.

Together, these sources support recording the quoted portions only. Bob’s chart gives a two-point cup/weight reference for its named Sweet White Rice Flour, with spoon-and-level guidance; it does not establish a transferable `1 cup = X g` value for the generic identity. The King Arthur amounts belong to named recipe and flour contexts. Do not normalize or average the quantities into a generic measure or density.

## Proposed ledger delta

Append this fragment to the existing `ingredient-ref-glutinous-rice-flour` record. Preserve its identity sources and decisions, empty substitution findings, and current active reference.

```json
{
  "recordId": "ingredient-ref-glutinous-rice-flour",
  "measurementState": "researched_no_supported_value",
  "sources": [
    {
      "sourceId": "WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S01",
      "url": "https://www.bobsredmill.com/product/sweet-white-rice-flour",
      "title": "Bob’s Red Mill, Sweet White Rice Flour",
      "accessedOn": "2026-10-18",
      "locator": "Product description, Nutrition Facts serving size, and ingredient line.",
      "supports": "The manufacturer identifies its Sweet White Rice Flour as milled from glutinous rice and lists a 1/4 cup (40 g) Nutrition Facts serving. This is a product-specific label portion; no cup-filling or weighing method is stated, and the portion does not establish a generic glutinous-rice-flour measure.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S02",
      "url": "https://www.kingarthurbaking.com/recipes/hotteok-korean-sweet-pancakes-recipe",
      "title": "King Arthur Baking, Hotteok (Korean Sweet Pancakes)",
      "versionOrDate": "Updated 2026-03-19",
      "accessedOn": "2026-10-18",
      "locator": "Ingredients, Dough.",
      "supports": "The test-kitchen formula lists 1/2 cup (60 g) sweet glutinous rice flour and says Koda Farms Mochiko is preferred. This is a recipe amount in yeast-raised hotteok dough, not a label serving or transferable generic measure.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S03",
      "url": "https://www.kingarthurbaking.com/recipes/jian-dui-fried-sesame-balls-recipe",
      "title": "King Arthur Baking, Jiān Duī (Fried Sesame Balls)",
      "versionOrDate": "Updated 2026-09-17",
      "accessedOn": "2026-10-18",
      "locator": "Ingredients, Dough; Tips from our Bakers.",
      "supports": "The recipe lists 3/4 cup (90 g) plus 1/3 cup (40 g) water-milled glutinous rice flour, divided, with more as needed. The test kitchen says water-milled flour such as Erawan is essential to its texture. These are formula-specific quantities for a process-qualified flour, not an unqualified cup conversion.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-B23-RESIDUAL-20261010-S05",
      "url": "https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart",
      "title": "Bob’s Red Mill, Flour Weight Chart",
      "accessedOn": "2026-10-18",
      "locator": "Sweet White Rice Flour row, 1/4-cup and 1-cup columns; volume-measuring guidance.",
      "supports": "Bob’s Red Mill’s chart for its own flours lists Sweet White Rice Flour at 40 g per 1/4 cup and 160 g per 1 cup. It recommends fluffing, spooning, and leveling flour for volume measurement, without packing or scooping from the bag. This is product-scoped guidance, not a generic glutinous-rice-flour measure or controlled weighing protocol.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "glutinous-rice-flour-bobs-sweet-white-rice-label-quarter-cup-r785-20261018",
      "relationship": "portion_weight",
      "value": 40,
      "valueUnit": "g",
      "foodDescription": "Bob’s Red Mill Sweet White Rice Flour, manufacturer Nutrition Facts serving.",
      "foodState": "Dry retail flour as sold.",
      "measurementMethod": "Bob’s Nutrition Facts label reports the serving; its Flour Weight Chart recommends fluffing, spooning, and leveling for volume measurement. The sources do not provide a controlled weighing protocol.",
      "quantityBasis": "One product-specific label portion, corroborated by Bob’s chart. Do not treat it as a generic glutinous-rice-flour measure, density, or serving for Mochiko, Shiratamako, or other products.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Bob’s Red Mill label states 1/4 cup and its chart recommends the spoon-and-level method; cup capacity is not specified."
      },
      "observedMassG": 40,
      "evidenceKind": "manufacturer_label",
      "sourceIds": ["WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S01", "WP02-B23-RESIDUAL-20261010-S05"]
    },
    {
      "observationId": "glutinous-rice-flour-bobs-sweet-white-rice-chart-one-cup-r785-20261018",
      "relationship": "portion_weight",
      "value": 160,
      "valueUnit": "g",
      "foodDescription": "Bob’s Red Mill Sweet White Rice Flour, manufacturer Flour Weight Chart entry.",
      "foodState": "Dry retail flour as sold.",
      "measurementMethod": "Bob’s chart lists the one-cup weight and recommends fluffing, spooning, and leveling flour for volume measurement; do not pack or scoop directly from the bag. The page gives no controlled weighing protocol.",
      "quantityBasis": "One product-specific chart value only. Keep it scoped to Bob’s Sweet White Rice Flour; it does not establish a generic glutinous-rice-flour measure, density, or mapping for Mochiko, Shiratamako, or other products.",
      "sourceQuantity": {
        "amount": 1,
        "unit": "cup",
        "unitConvention": "Bob’s Red Mill Flour Weight Chart; the accompanying volume guidance recommends spoon-and-level. Cup capacity is not specified."
      },
      "observedMassG": 160,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-B23-RESIDUAL-20261010-S05"]
    },
    {
      "observationId": "glutinous-rice-flour-hotteok-koda-mochiko-half-cup-r785-20261018",
      "relationship": "portion_weight",
      "value": 60,
      "valueUnit": "g",
      "foodDescription": "Sweet glutinous rice flour in King Arthur Baking’s Hotteok recipe; Koda Farms Mochiko is preferred.",
      "foodState": "Dry flour before mixing into the yeast dough.",
      "measurementMethod": "Published test-kitchen recipe quantity; no flour cup-filling method is stated.",
      "quantityBasis": "One recipe-formula amount only. The preferred product and dough context do not support a generic cup measure.",
      "sourceQuantity": {
        "amount": 0.5,
        "unit": "cup",
        "unitConvention": "King Arthur Baking recipe states 1/2 cup; capacity and flour-filling method are not specified on the recipe page."
      },
      "observedMassG": 60,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S02"]
    },
    {
      "observationId": "glutinous-rice-flour-jian-dui-water-milled-three-quarter-cup-r785-20261018",
      "relationship": "portion_weight",
      "value": 90,
      "valueUnit": "g",
      "foodDescription": "Water-milled glutinous rice flour in King Arthur Baking’s Jiān Duī recipe.",
      "foodState": "Dry water-milled flour before mixing with hot syrup.",
      "measurementMethod": "Published test-kitchen recipe quantity; no flour cup-filling method is stated.",
      "quantityBasis": "One divided recipe amount in a process-specific dough formula. The recipe calls for water-milled flour such as Erawan and does not establish a generic measure.",
      "sourceQuantity": {
        "amount": 0.75,
        "unit": "cup",
        "unitConvention": "King Arthur Baking recipe states 3/4 cup; capacity and flour-filling method are not specified on the recipe page."
      },
      "observedMassG": 90,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S03"]
    },
    {
      "observationId": "glutinous-rice-flour-jian-dui-water-milled-one-third-cup-r785-20261018",
      "relationship": "portion_weight",
      "value": 40,
      "valueUnit": "g",
      "foodDescription": "Water-milled glutinous rice flour in King Arthur Baking’s Jiān Duī recipe.",
      "foodState": "Dry water-milled flour before mixing with hot syrup.",
      "measurementMethod": "Published test-kitchen recipe quantity; no flour cup-filling method is stated.",
      "quantityBasis": "One divided recipe amount in a process-specific dough formula. The recipe calls for water-milled flour such as Erawan and does not establish a generic measure.",
      "sourceQuantity": {
        "amount": 0.3333333333333333,
        "unit": "cup",
        "unitConvention": "King Arthur Baking recipe states 1/3 cup; amount is represented numerically as 0.3333333333333333 cup."
      },
      "observedMassG": 40,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S03"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete a bounded measurement review for generic glutinous rice flour by recording Bob’s label and chart portions for its named Sweet White Rice Flour and King Arthur Baking’s formula-specific quantities as source-scoped observations. Bob’s chart gives a spoon-and-level volume-measuring recommendation but no controlled weighing protocol; its values remain product-specific. The King Arthur amounts belong to recipes that prefer Mochiko or require water-milled flour. These sources do not establish a transferable measure for the generic identity, so set measurement research to researched_no_supported_value and keep density, mappings, and reusable measures empty. Preserve all substitution and active catalog data.",
      "sourceIds": [
        "WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S01",
        "WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S02",
        "WP02-A6-GLUTINOUS-RICE-MEASURE-R785-20261018-S03",
        "WP02-B23-RESIDUAL-20261010-S05"
      ]
    }
  ]
}
```

## Picker projection and recipe-corpus demand

No active reference, alias, form, or picker field changes are proposed, so picker results remain unchanged. English and French queries continue to resolve from the current rows: `glutinous rice flour`, `sweet rice flour`, and `farine de riz gluant` select the generic flour row; `mochiko` and `shiratamako` continue to select their separate named-product rows.

Scanned all **114 manifest-listed bundled recipe files** and **1,123 structured ingredient rows** for `glutinous rice flour`, `farine de riz gluant`, `sweet rice flour`, `sweet rice powder`, `Mochiko`, `Shiratamako`, and the generic/Mochiko reference IDs. No matches were found, so the corpus provides no matching portion or recipe-line link.

## Ownership and review checks

- Confirmed the live generic flour row is `verified`, with measurement and substitution both `not_yet_researched`, and no measurement observations or substitution findings.
- Confirmed the earlier identity note left measurement open and the active reference has null density and empty unit mappings. The completed R159 black glutinous rice flour work and R782 spelt substitution review concern different rows and questions.
- Checked the three R785 source URLs and three new source IDs; reused the existing chart URL/source ID already cited for other ingredient rows, with a new Sweet White Rice Flour locator. The five observation IDs and requested proposal path were checked against the live ledger and archive; no collisions were found for those new IDs or path.
- Picker projection is unchanged because the active ingredient-reference catalog is untouched. The full bundled recipe corpus scan found no matching demand.
- This is proposal-only documentation. No software tests, build, emulator, or deployment were run.

This review addresses only generic glutinous-rice-flour measurement evidence. WP02 Section A6 remains open.
