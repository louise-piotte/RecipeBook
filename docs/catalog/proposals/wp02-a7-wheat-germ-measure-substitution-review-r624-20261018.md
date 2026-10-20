# WP02 Section A7 wheat-germ measure and recipe-alternative review — R624 — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. This review changes no active reference, form, ledger, package, plan, roadmap, recipe, generated file, batch README, code, or test.
- **Plan anchor:** The open WP02 Section A7 item continues review of bran and germ products and other milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). The earlier [wheat-bran and wheat-germ identity checkpoint](../batches/wheat-bran-germ-identities.md) explicitly left measurement and substitution evidence open.
- **Scope:** Research published portions and source-specific recipe alternatives for the existing `ingredient-ref-wheat-germ`. Do not reopen its identity or French name.
- **Source ownership:** `WP07-KAB-IWC` already owns King Arthur Baking’s exact Ingredient Weight Chart URL in the ledger; reuse it. The three recipe URLs and the R624 source-ID prefix below were absent from the ledger and proposal/batch archive at review time. Source IDs `S01`–`S03` are proposal-local until integration.

## Recommendation

Update only the existing `ingredient-ref-wheat-germ` ledger record:

- Set `measurementState` to `researched_supported` and append two source-bounded `portion_weight` observations. King Arthur’s chart and two recipe pages publish 1/4 cup = 28 g; a separate muffin recipe publishes 1/3 cup = 43 g.
- Set `substitutionResearchState` to `researched_supported` and append two recipe-local findings: wheat germ may be omitted in favor of wheat bran in King Arthur’s Banana Pancakes ingredient line, and in favor of sunflower seeds in its Morning Glory Muffins ingredient line. The sources state these as optional alternatives in those formulas.
- Keep the verified identity and its names unchanged. Keep the reference’s `defaultDensity: null` and `unitMappings: []`; add no active measure, form, conversion, package yield, recipe link, or global/contextual runtime substitution rule.

The evidence gives published portions and two recipe-specific options. It does not establish a mass-volume density, an identity-wide default for every wheat-germ product, or a reusable replacement outside the named recipe roles.

## Ownership, current state, and duplication audit

| Surface | Current owner/state | R624 disposition |
|---|---|---|
| Active reference | `ingredient-ref-wheat-germ`, `wheat germ / germe de blé`, category `GRAIN_AND_CEREAL`; aliases empty; density null; unit mappings empty. | Keep unchanged. The OQLF and Bob’s Red Mill Canada sources already establish the identity and bilingual display (`WP02-S99`, `WP02-S100`). |
| Forms | No ingredient form is attached to this reference. | Add none. The source recipes use dry wheat germ in an ingredient role; they do not establish a reusable process form. |
| Research ledger | Identity is `verified`; measurement and substitution research are `not_yet_researched`; no observations or substitution findings exist on the row. | Add the proposed observations and findings only to this record. |
| Runtime rules and package yields | No global rule, contextual rule, or package-yield record references `ingredient-ref-wheat-germ`. | Add none. |
| Recipe links | No bundled recipe links to the reference. | Add none. The externally published recipes are evidence sources, not bundled recipe-line links. |
| Picker ownership | The exact names `wheat germ` and `germe de blé` are owned by the current reference. No proposed alias or new identity is needed. | No picker result changes. Ledger observations and findings are not searchable names. |

The R624 proposal path, finding IDs, observation IDs, and `WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018` source prefix are new. The three recipe URLs are not already registered in the ledger. `WP07-KAB-IWC` is reused for the chart rather than allocating another ID to its exact URL. The existing bilingual identity sources remain owned by the current wheat-germ row and are not duplicated.

## Portion evidence and limits

- King Arthur Baking’s live [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) lists `Wheat germ` as **1/4 cup = 1 ounce = 28 g**. Its notes say recipe-page gram values may differ due to rounding and similar factors and advises following the recipe’s own weight. The chart does not state a cup-volume convention, wheat-germ brand, or row-specific fill method. Reuse the existing ledger source ID `WP07-KAB-IWC`.
- King Arthur Baking’s [Whole Grain Dinner Rolls](https://www.kingarthurbaking.com/recipes/whole-grain-dinner-rolls-recipe) lists **1/4 cup (28 g) wheat germ** in the dough. This is one recipe-formula amount, not a package yield or a product-specific wheat-germ label [S01].
- King Arthur Baking’s [Banana Pancakes](https://www.kingarthurbaking.com/recipes/banana-pancakes-recipe) lists **1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ**, optional. The two alternatives share a stated volume and have different stated masses. Preserve both published values without calculating a density or equal-mass replacement [S02].
- King Arthur Baking’s [Morning Glory Muffins](https://www.kingarthurbaking.com/recipes/morning-glory-muffins-recipe) lists **1/3 cup (42 g) sunflower seeds or 1/3 cup (43 g) wheat germ**, optional, and directs the baker to stir in either. Preserve the recipe’s own values and cup fraction; do not generalize the alternative or derive a reusable volume-to-mass conversion [S03].

The two 1/4-cup recipes corroborate the chart value in King Arthur’s test-kitchen material. The separate 1/3-cup formula remains its own portion observation. Neither cup fraction becomes `defaultDensity`, `unitMappings`, or a common measure for every wheat-germ product.

## Recipe-alternative evidence and limits

The Banana Pancakes ingredient line explicitly permits wheat bran or wheat germ in the same optional role for added fiber and texture. The published amounts are the same by volume but differ by mass: 16 g bran and 28 g germ. This supports only the single pancake formula. It does not support an equal-mass exchange or replacing flour with wheat germ or bran [S02].

The Morning Glory Muffins ingredient line explicitly permits sunflower seeds or wheat germ as the optional ingredient, with each listed at one-third cup. The masses differ slightly in the source formula: 42 g seeds and 43 g germ. This supports only that muffin formula and ingredient role; it does not establish general seed-for-germ equivalence [S03].

Neither recipe justifies an active substitution rule. The current runtime model cannot enforce either named formula, optional inclusion role, or the source-specific amount. Keep both findings in the research ledger as bounded evidence only.

## Picker and bundled recipe audit

R624 proposes no active name, alias, form, or reference change. `wheat germ` and `germe de blé` continue to resolve to the current reference; broader wheat and germ searches retain their existing results.

The package manifest lists **114** recipe files. A text and structured-file scan of all manifest-listed recipes found no occurrence of `ingredient-ref-wheat-germ`, `wheat germ`, `germe de blé`, `wheat bran`, or `son de blé`. There is no bundled ingredient demand or recipe line to link. The external King Arthur recipes above are research sources only.

## Proposed ledger delta

Append these source records to the existing `ingredient-ref-wheat-germ` ledger record. The chart source uses the existing shared ID; sources S01–S03 are proposal-local pending integration.

```json
[
  {
    "sourceId": "WP07-KAB-IWC",
    "url": "https://www.kingarthurbaking.com/learn/ingredient-weight-chart",
    "title": "King Arthur Baking, Ingredient Weight Chart",
    "accessedOn": "2026-10-18",
    "locator": "Wheat germ row; chart note following the table.",
    "supports": "The chart lists wheat germ as 1/4 cup = 1 ounce = 28 g. Its note says recipe-page gram amounts may differ due to rounding and similar factors. The chart does not state the cup convention, product brand, or a row-specific fill method.",
    "sourceKind": "culinary_reference"
  },
  {
    "sourceId": "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S01",
    "url": "https://www.kingarthurbaking.com/recipes/whole-grain-dinner-rolls-recipe",
    "title": "King Arthur Baking, Whole Grain Dinner Rolls",
    "versionOrDate": "Updated 2024-09-23.",
    "accessedOn": "2026-10-18",
    "locator": "Ingredients, Dough: wheat germ line.",
    "supports": "The recipe lists 1/4 cup (28 g) wheat germ in its dough formula. It does not identify a germ brand or fill method.",
    "sourceKind": "test_kitchen"
  },
  {
    "sourceId": "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02",
    "url": "https://www.kingarthurbaking.com/recipes/banana-pancakes-recipe",
    "title": "King Arthur Baking, Banana Pancakes",
    "versionOrDate": "Updated 2026-06-24.",
    "accessedOn": "2026-10-18",
    "locator": "Ingredients, Pancakes: optional bran-or-germ line; instructions step 1.",
    "supports": "The recipe lists 1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ as an optional ingredient. It supports this single formula's same-volume alternatives, with distinct masses.",
    "sourceKind": "test_kitchen"
  },
  {
    "sourceId": "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S03",
    "url": "https://www.kingarthurbaking.com/recipes/morning-glory-muffins-recipe",
    "title": "King Arthur Baking, Morning Glory Muffins",
    "versionOrDate": "Updated 2026-07-07.",
    "accessedOn": "2026-10-18",
    "locator": "Ingredients: optional sunflower-seed-or-wheat-germ line; instructions step 4.",
    "supports": "The recipe lists 1/3 cup (42 g) sunflower seeds or 1/3 cup (43 g) wheat germ as optional, and its instructions direct the baker to stir in either. It supports this single muffin formula only.",
    "sourceKind": "test_kitchen"
  }
]
```

Set these research states and append the observations, two recipe-scoped findings, and decision shown below. Preserve the target row’s existing `sources` and `decisions`.

```json
{
  "recordId": "ingredient-ref-wheat-germ",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_supported",
  "measurementObservations": [
    {
      "observationId": "wheat-germ-kab-quarter-cup-28-g-r624-20261018",
      "relationship": "portion_weight",
      "value": 28,
      "valueUnit": "g",
      "foodDescription": "Wheat germ in King Arthur Baking's general weight chart and named recipe portions.",
      "foodState": "Dry as listed; product brand and treatment are unspecified.",
      "measurementMethod": "The Ingredient Weight Chart lists 1/4 cup = 1 ounce = 28 g. Whole Grain Dinner Rolls and Banana Pancakes separately list 1/4 cup (28 g) wheat germ. The chart and recipes do not specify a wheat-germ brand or fill method, and the chart does not specify its cup convention.",
      "quantityBasis": "Published chart and recipe portions only. Do not turn this observation into active density, a unit mapping, or a brand-independent default for every wheat-germ product.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Cup convention and wheat-germ fill method are unspecified by the sources."
      },
      "observedMassG": 28,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP07-KAB-IWC",
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S01",
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02"
      ]
    },
    {
      "observationId": "wheat-germ-morning-glory-muffins-third-cup-43-g-r624-20261018",
      "relationship": "portion_weight",
      "value": 43,
      "valueUnit": "g",
      "foodDescription": "Optional wheat germ in King Arthur Baking's Morning Glory Muffins.",
      "foodState": "Dry as listed; product brand and treatment are unspecified.",
      "measurementMethod": "The recipe lists 1/3 cup (43 g) wheat germ as an optional ingredient; the cup convention and fill method are not specified.",
      "quantityBasis": "One named recipe portion only. Do not infer a density, default measure, or transferable mass-volume conversion.",
      "sourceQuantity": {
        "amount": 0.3333333333333333,
        "unit": "cup",
        "unitConvention": "The source states 1/3 cup; cup convention and fill method are unspecified."
      },
      "observedMassG": 43,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S03"
      ]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "wheat-germ-to-wheat-bran-kab-banana-pancakes-r624-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-wheat-germ",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-wheat-bran",
          "quantity": {
            "amount": 0.25,
            "unit": "cup",
            "unitConvention": "King Arthur's Banana Pancakes list either option at 1/4 cup; the source reports different masses."
          },
          "roleInCompound": "Optional wheat-bran-or-wheat-germ ingredient in the named pancake formula."
        }
      ],
      "context": "Only King Arthur Baking's Banana Pancakes.",
      "basis": "The ingredient list says 1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ, optional. The source describes the optional ingredient as adding fiber and texture; it gives both alternatives within this formula.",
      "limitations": [
        "This is one recipe-specific optional ingredient role, not a general wheat-germ-to-bran rule.",
        "The source specifies equal volume and different masses; do not infer an equal-mass exchange or derive density.",
        "Do not apply to flour replacement, other recipes, or non-pancake contexts.",
        "Do not activate a global or contextual runtime rule; the runtime model cannot enforce this named formula and role, and no bundled recipe uses wheat germ."
      ],
      "sourceIds": [
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02"
      ]
    },
    {
      "findingId": "wheat-germ-to-sunflower-seeds-kab-morning-glory-muffins-r624-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-wheat-germ",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-sunflower-seeds",
          "quantity": {
            "amount": 0.3333333333333333,
            "unit": "cup",
            "unitConvention": "King Arthur's Morning Glory Muffins list either option at 1/3 cup; the source reports different masses."
          },
          "roleInCompound": "Optional sunflower-seed-or-wheat-germ ingredient in the named muffin formula."
        }
      ],
      "context": "Only King Arthur Baking's Morning Glory Muffins.",
      "basis": "The ingredient line says 1/3 cup (42 g) sunflower seeds or 1/3 cup (43 g) wheat germ, optional; step 4 directs the baker to stir in sunflower seeds or wheat germ.",
      "limitations": [
        "This is one recipe-specific optional ingredient role, not a general wheat-germ-to-sunflower-seed rule.",
        "The source specifies equal volume and different masses; do not infer an equal-mass exchange or derive density.",
        "Do not apply to other recipes, baking roles, or methods.",
        "Do not activate a global or contextual runtime rule; the runtime model cannot enforce this named formula and role, and no bundled recipe uses wheat germ."
      ],
      "sourceIds": [
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S03"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the evidence review for the verified wheat-germ milling-fraction identity. King Arthur Baking publishes one generic 1/4 cup (28 g) chart portion, and its recipes preserve source-specific portions and two optional alternatives in their named formulas. Keep the portions and replacements evidence-only; leave active density, mappings, forms, conversions, package yields, recipe links, picker names, and runtime substitution behavior unchanged.",
      "sourceIds": [
        "WP07-KAB-IWC",
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S01",
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02",
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S03",
        "WP02-S99",
        "WP02-S100"
      ]
    }
  ]
}
```

## Exact data and search treatment

| Field | Proposed outcome |
|---|---|
| Active identity, category, bilingual names, aliases | Keep `ingredient-ref-wheat-germ` and its existing `GRAIN_AND_CEREAL` names unchanged; aliases stay empty. |
| Measurement observations | Add the two published portions above. Keep both as `portion_weight` observations with source-specific quantity bases. |
| Default density and unit mappings | Keep `null` and `[]`. No single published volume/weight observation is used as a density or conversion. |
| Forms and package yields | Add none. The sources do not establish a reusable form or yield record. |
| Recipe links and substitutions | Add no recipe links or active runtime rule. Retain only the two named-recipe findings. |
| Picker behavior | No change. No search names, aliases, or forms are added. |

## Static review checks

- Re-read root `AGENTS.md`, `Requirements.md`, the active roadmap entries, the open Section A7 item, the wheat-bran/germ identity checkpoint, current reference, forms, target ledger row, related rules/yields, and proposal/batch history.
- Confirmed current identity ownership, zero attached forms, null active density, empty mappings, `not_yet_researched` measurement/substitution states, and no rule or package-yield ownership.
- Checked the three proposed recipe URLs, source-ID prefix, observation IDs, finding IDs, and proposal path for duplication. Reused existing source ID `WP07-KAB-IWC`; retained the target row’s existing OQLF/manufacturer identity sources `WP02-S99` and `WP02-S100`.
- Scanned all 114 manifest-listed bundled recipes for the wheat-germ and bran names and the wheat-germ reference ID; found no occurrence or recipe demand.
- Verified that adding only ledger evidence does not affect picker names or results. No code, test, package JSON, shared ledger, plan, or roadmap file was changed.
- This is proposal-only documentation, so no software tests, build, emulator run, or deployment were run.
