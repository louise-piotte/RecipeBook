# WP02 A6 R776 — generic spelt-flour measurement review — 2026-10-18

## Review record

- **Status:** Proposal only. This review edits no shared catalog, ledger, plan, roadmap, workflow, generated, recipe, or app file.
- **Plan fit:** The parent [WP02 A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1855) remains open after the integrated R773–R775 checkpoint. This review addresses the measurement state of the existing generic `ingredient-ref-spelt-flour` row.
- **Prior-work boundary:** R206 added the separate whole-spelt identity. R209 added white spelt flour and explicitly left the generic spelt row’s measurement research unreviewed. R761 and R770 concern black-fonio flour substitution and lab density, respectively; R773 covers generic quinoa-flour substitution. None answers this generic spelt measurement question. The five A6 flour rows already matching `spelt flour` and `farine d'épeautre` remain separate identities.
- **Exact question:** Do current primary baking references support a reusable mass/volume value for all generic spelt flour, or only source- and formula-specific observations?
- **Proposal-local IDs:** The two new recipe source IDs and four observation IDs below were checked against the live ledger and proposal archive. The shared King Arthur Ingredient Weight Chart source ID is reused.

## Recommendation

Set `measurementState` on `ingredient-ref-spelt-flour` to `researched_supported` and append four source-scoped `portion_weight` observations: King Arthur Baking’s chart row (`1 cup = 99 g`), its Spelt Pita formula (`2 cups = 198 g`), and its Honey Spelt Sourdough formula (`1 cup = 99 g` in the levain; `3 cups = 298 g` in the dough).

These records preserve exact published quantities from one publisher’s chart and test-kitchen recipes. The recipe pages state the flour-weighing or spoon-and-sweep method; the chart does not specify a filling method and notes that recipe weights may differ from chart weights. Keep each formula at its published quantity. Do not scale, average, or derive a generic density or cup mapping from the KAB values.

Bob’s Red Mill’s current product page lists `1/4 cup (30 g)` for its stone-ground whole-grain spelt flour. That is a product-label serving, and the page explicitly identifies the product as whole grain. Keep it as a scope comparator for the separate `ingredient-ref-whole-spelt-flour` identity, not as a generic spelt-flour observation. Do not multiply the rounded quarter-cup serving into an inferred one-cup value. The page’s replacement advice is outside this measurement review.

Keep `defaultDensity: null` and `unitMappings: []`. Add no form, yield, conversion, recipe link, substitution finding, or active rule. The reviewed measures are useful evidence, but the sources do not establish a cross-brand convention for the catalog-wide generic row.

## Current row and source scope

| Surface | Current state | R776 disposition |
|---|---|---|
| Active generic reference | `ingredient-ref-spelt-flour`, `spelt flour / farine d'épeautre`, `FLOUR_AND_STARCH`; no aliases, forms, density, or unit mappings. | No picker or catalog change. |
| Ledger row | Identity `verified`; measurement and substitution research `not_yet_researched`; no measurement observations. | Change measurement research state only; append four source-scoped observations and one decision. Keep substitution research unchanged. |
| Qualified spelt rows | Whole, white, malted, and sprouted spelt flours are separate active references. | Do not merge their identities or transfer a qualified product’s value to the generic row. |
| Forms, rules, yields | No form, substitution rule, or package yield references the generic spelt-flour row. | Add none. |

The current [King Arthur Baking Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) lists `Spelt Flour` as `1 cup = 3 1/2 ounces = 99 g` (current page lines 509; accessed 2026-10-18). Its note at line 554 says recipe-page gram weights may differ because of rounding and similar factors, and advises using the weight printed in each recipe. The chart is a useful source-specific reference, not a flour-grade standard: it does not specify a cup capacity, spelt product, or row-specific filling method.

The [Spelt Pita recipe](https://www.kingarthurbaking.com/recipes/spelt-pita-recipe) is attributed to the King Arthur Test Kitchen (current page lines 220–231; updated 2022-12-09). It yields eight pitas (lines 244–246) and lists `2 cups (198 g) spelt flour` (line 255). Its first instruction says to weigh the flour or gently spoon it into a cup and sweep off the excess (line 269). The description calls the pitas whole grain, but the spelt flour line names no brand or milling grade; preserve the amount as this formula’s evidence.

The [Honey Spelt Sourdough Bread recipe](https://www.kingarthurbaking.com/recipes/honey-spelt-sourdough-bread-recipe) lists `1 cup (99 g)` spelt flour in the levain (line 257) and `3 cups (298 g)` in the dough (line 262). Its instructions likewise say to weigh or gently spoon and sweep the flours (lines 276–277). The published `3 cups (298 g)` is retained exactly; it is not replaced by a scaled chart value. These source-specific amounts are consistent with the chart’s approximate convention while illustrating why each recipe’s printed mass remains authoritative for that formula.

Bob’s Red Mill’s [Spelt Flour product page](https://www.bobsredmill.com/product/spelt-flour) describes its flour as stone-ground and whole grain (current page line 259; ingredients at lines 347–349) and lists a serving size of `1/4 cup (30 g)` (line 286). It gives no cup-filling method. Because the page explicitly describes a whole-grain product and the catalog has a separate whole-spelt reference, R776 does not attach this observation to the generic row. The label serving is not scaled into a precise four-serving cup weight.

## Source ownership and proposed ledger delta

| Source | Current ownership | R776 treatment |
|---|---|---|
| King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) | Its exact URL is already reused in 27 ledger source entries; `WP07-KAB-IWC` is the established shared source ID. | Reuse `WP07-KAB-IWC` on the generic spelt row. Do not create an R776-specific duplicate for the chart URL. |
| King Arthur Baking Test Kitchen, [Spelt Pita](https://www.kingarthurbaking.com/recipes/spelt-pita-recipe) | Exact URL has no live ledger owner or prior proposal/archive owner. | Add source `WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S01`. |
| King Arthur Baking, [Honey Spelt Sourdough Bread](https://www.kingarthurbaking.com/recipes/honey-spelt-sourdough-bread-recipe) | Exact URL has no live ledger owner or prior proposal/archive owner. | Add source `WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S02`. |
| Bob’s Red Mill, [Spelt Flour](https://www.bobsredmill.com/product/spelt-flour) | Exact URL has no live ledger owner. The source describes a whole-grain product, so it is not assigned to the generic row in this review. | Comparator only; no source ID or observation is proposed here. A later whole-spelt measurement review can assess this product label against that qualified row. |

Append these sources, four observations, and one decision to the existing `ingredient-ref-spelt-flour` ledger record. Preserve its identity sources and substitution state.

```json
{
  "recordId": "ingredient-ref-spelt-flour",
  "measurementState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP07-KAB-IWC",
      "url": "https://www.kingarthurbaking.com/learn/ingredient-weight-chart",
      "title": "King Arthur Baking, Ingredient Weight Chart",
      "accessedOn": "2026-10-18",
      "locator": "Spelt Flour row (current page line 509: 1 cup = 3 1/2 ounces = 99 g) and chart note at line 554",
      "supports": "The chart publishes 1 cup = 99 g for its Spelt Flour row. Its note says recipe-page weights can differ because of rounding and similar factors and advises using the recipe value. The chart does not specify a spelt product, grade, cup capacity, or row-specific fill method; keep this as a chart-scoped observation, not a general conversion.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S01",
      "url": "https://www.kingarthurbaking.com/recipes/spelt-pita-recipe",
      "title": "King Arthur Baking Test Kitchen, Spelt Pita",
      "accessedOn": "2026-10-18",
      "locator": "Updated 2022-12-09; yield at lines 244–246; spelt-flour ingredient at line 255; instruction 1 at line 269",
      "supports": "The eight-pita formula lists 2 cups (198 g) spelt flour. Instruction 1 says to weigh the flour or gently spoon it into a cup and sweep off excess. The recipe does not name a spelt-flour brand or grade; retain this amount for this formula only.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S02",
      "url": "https://www.kingarthurbaking.com/recipes/honey-spelt-sourdough-bread-recipe",
      "title": "King Arthur Baking, Honey Spelt Sourdough Bread",
      "accessedOn": "2026-10-18",
      "locator": "Updated 2022-06-30; levain at line 257; dough at line 262; instructions 1–2 at lines 276–277",
      "supports": "The formula lists 1 cup (99 g) spelt flour in the levain and 3 cups (298 g) in the dough. Its instructions say to weigh or gently spoon and sweep the flour. These amounts belong to this formula; preserve each quantity as printed and do not scale to a general cup weight.",
      "sourceKind": "test_kitchen"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "spelt-flour-kab-chart-one-cup-99-g-r776-20261018",
      "relationship": "portion_weight",
      "value": 99,
      "valueUnit": "g",
      "foodDescription": "King Arthur Baking Ingredient Weight Chart row ‘Spelt Flour’",
      "measurementMethod": "The chart directly lists 1 cup = 3 1/2 ounces = 99 g; no row-specific fill method is stated.",
      "quantityBasis": "King Arthur Baking chart row only. Its chart note says recipe weights may differ; this is not a cross-brand cup weight or a density.",
      "sourceQuantity": { "amount": 1, "unit": "cup" },
      "observedMassG": 99,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP07-KAB-IWC"]
    },
    {
      "observationId": "spelt-flour-kab-spelt-pita-two-cups-198-g-r776-20261018",
      "relationship": "portion_weight",
      "value": 198,
      "valueUnit": "g",
      "foodDescription": "Spelt flour in King Arthur Baking Test Kitchen’s Spelt Pita formula for eight pitas",
      "foodState": "Dry flour ingredient in the dough; the recipe describes whole-grain pita but does not specify the spelt flour grade or product.",
      "measurementMethod": "The ingredient line lists 2 cups (198 g); instruction 1 permits weighing or gently spooning into a cup and sweeping off excess.",
      "quantityBasis": "One published pita formula. Do not reduce this pair to a class-wide mass per cup.",
      "sourceQuantity": { "amount": 2, "unit": "cup" },
      "observedMassG": 198,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S01"]
    },
    {
      "observationId": "spelt-flour-kab-honey-sourdough-levain-one-cup-99-g-r776-20261018",
      "relationship": "portion_weight",
      "value": 99,
      "valueUnit": "g",
      "foodDescription": "Spelt flour in the levain of King Arthur Baking’s Honey Spelt Sourdough Bread formula",
      "foodState": "Dry flour ingredient in the levain.",
      "measurementMethod": "The ingredient line lists 1 cup (99 g); instruction 1 says to weigh or gently spoon into a measuring cup and sweep off excess.",
      "quantityBasis": "Levain quantity in this published sourdough formula only.",
      "sourceQuantity": { "amount": 1, "unit": "cup" },
      "observedMassG": 99,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S02"]
    },
    {
      "observationId": "spelt-flour-kab-honey-sourdough-dough-three-cups-298-g-r776-20261018",
      "relationship": "portion_weight",
      "value": 298,
      "valueUnit": "g",
      "foodDescription": "Spelt flour in the dough of King Arthur Baking’s Honey Spelt Sourdough Bread formula",
      "foodState": "Dry flour ingredient in the dough.",
      "measurementMethod": "The ingredient line lists 3 cups (298 g); instruction 2 says to weigh or gently spoon and sweep the flour.",
      "quantityBasis": "Dough quantity in this published sourdough formula only. Preserve the recipe’s 298 g; do not replace it with a scaled chart value.",
      "sourceQuantity": { "amount": 3, "unit": "cup" },
      "observedMassG": 298,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S02"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete measurement research on generic spelt flour by preserving the King Arthur chart and formula amounts as distinct source-scoped observations. The chart and two recipes are from one publisher; its own chart note says recipe weights may differ and instructs bakers to use recipe values. Bob’s 1/4 cup (30 g) label serving is for a specifically whole-grain product and is not scaled or transferred to the generic row. These sources do not establish one cross-brand measure. Keep defaultDensity null and unitMappings empty; add no conversion or runtime behavior.",
      "sourceIds": [
        "WP07-KAB-IWC",
        "WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S01",
        "WP02-A6-SPELT-FLOUR-MEASURE-R776-20261018-S02"
      ]
    }
  ]
}
```

## Picker and recipe-corpus impact

The current [picker search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) uses reference names and aliases plus attached form terms. The proposed delta changes none of those fields, so it adds no picker terms or results.

| Query | Current results | R776 effect |
|---|---:|---|
| `spelt flour` | 5: generic, malted, sprouted, white, and whole spelt flour | No change |
| `farine d'épeautre` | 5: the same five flour references | No change |
| `whole spelt flour` | 1: whole spelt flour | No change; Bob’s product remains outside this generic-row proposal |

The bundled corpus audit parsed all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. Case- and accent-insensitive scans for the three spelt-flour reference IDs and `spelt flour`, `whole spelt flour`, `white spelt flour`, and their French equivalents found **zero recipe-file hits, zero ingredient-row hits, and zero direct links**. The external King Arthur formulas provide source-specific measurement evidence, not bundled recipe demand; add no recipe link.

## Review checks

- Confirmed the A6 parent remains open, R209 left the generic row’s measurement state unreviewed, and the integrated R773–R775 items do not overlap this question.
- Verified the current King Arthur chart row and note, both recipe quantities and spoon-and-sweep instructions, and Bob’s product description and nutrition serving on the primary publisher/manufacturer pages.
- Checked source URL ownership, reused `WP07-KAB-IWC`, and confirmed the two KAB recipe URLs, R776 source IDs, observation IDs, and proposal path are not previously owned.
- Recomputed current phrase-match counts from reference names, aliases, forms, and the picker matching rules; the proposal adds no searchable terms.
- Scanned the complete manifest-listed recipe corpus and structured ingredient rows; no spelt-flour demand or link was found.
- Static document, ID, URL, corpus, picker-projection, UTF-8/no-BOM, local-link, and whitespace checks only. No software tests, build, emulator, or deployment were run.

This proposal closes only the measurement research question for generic spelt flour. The WP02 A6 parent item remains open.
