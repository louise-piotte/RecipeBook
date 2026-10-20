# WP02 Section A7 wheat-bran measurement and recipe-alternative review — R628 — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. This review creates this proposal file only; it changes no active reference, ledger, form, rule, package, recipe, plan, roadmap, README, code, or test.
- **Plan anchor:** Section A7 remains open for further grain-meal and milling-product review in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). Its wheat-bran identity checkpoint explicitly left measurement and substitution evidence open in [wheat-bran and wheat-germ identities](../batches/wheat-bran-germ-identities.md).
- **Scope:** Review source-bounded portions and the named Banana Pancakes optional alternative for the existing `ingredient-ref-wheat-bran`. Do not reopen identity or French naming.
- **Source and ID ownership:** Reuse the existing chart source ID `WP07-KAB-IWC` and the existing Banana Pancakes source ID from the integrated wheat-germ review, `WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02`, for their exact URLs. The Bob’s Red Mill product URL and the R628-specific source, observation, finding, and proposal IDs are new in the ledger/archive.

## Recommendation

Update only the existing `ingredient-ref-wheat-bran` research-ledger record:

- Set `measurementState` to `researched_supported` and append three `portion_weight` observations: King Arthur Baking’s chart portion (1/2 cup, 32 g), its Banana Pancakes formula (1/4 cup, 16 g), and Bob’s Red Mill’s named product label (1/4 cup, 13 g).
- Set `substitutionResearchState` to `researched_supported` and append one recipe-scoped finding for wheat bran in favor of wheat germ only in King Arthur Baking’s Banana Pancakes, where the source explicitly lists the two optional alternatives.
- Keep the verified identity, English/French names, empty alias lists, `defaultDensity: null`, and `unitMappings: []` unchanged. Add no form, active conversion, default measure, package yield, bundled recipe link, or global/contextual runtime rule.

**Active numeric behavior supported:** none. The evidence supports keeping three source-specific portions in the research ledger. It does not support one active wheat-bran volume-to-mass mapping: a KAB recipe lists 1/4 cup as 16 g while Bob’s Red Mill lists 1/4 cup as 13 g for its named product. KAB’s chart also says recipe-page gram values can differ and advises following recipe weights. Preserve these observations without calculating a density, normalizing the differences, or selecting a universal value.

The Banana Pancakes source supports only that formula’s optional wheat-bran-or-wheat-germ choice. It does not support an active reusable substitution beyond the named pancake ingredient role.

## Ownership, current state, and duplication audit

| Surface | Current owner/state | R628 disposition |
|---|---|---|
| Active reference | `ingredient-ref-wheat-bran`, `wheat bran / son de blé`, category `GRAIN_AND_CEREAL`; `aliasesEn: []`, `aliasesFr: []`; density null; mappings empty. | Keep unchanged. The existing OQLF and Bob’s Red Mill Canadian French product-list evidence owns the identity and labels (`WP02-S98`, `WP02-S100`). |
| Forms, rules, and yields | No wheat-bran form, substitution rule, contextual rule, or package yield is attached in the current package. | Add none. The pancake option is limited to a named formula and optional role. |
| Research ledger | Identity `verified`; measurement and substitution states `not_yet_researched`; no measurement observations or substitution findings on the wheat-bran row. | Add the three portions and one recipe-scoped finding below. Reuse the Banana Pancakes source already registered on the wheat-germ row. |
| Source ownership | `WP07-KAB-IWC` is already used for King Arthur Baking’s exact chart URL; R624-S02 owns the exact Banana Pancakes URL on the wheat-germ row. The canonical Bob’s Red Mill Wheat Bran product URL is not currently registered in the ledger. | Reuse both existing IDs for the same sources. Add the Bob’s Red Mill page once with the new R628 source ID. |
| Picker names | The exact English and French displays are owned by the current wheat-bran row. Other `bran` names include barley, corn, oat, rice, and rye brans and branded bran cereals. | No names, aliases, forms, or IDs change, so picker results do not change. Exact `wheat bran` remains owned by this row. |
| Bundled recipe demand | The package manifest lists 114 recipes. A parsed scan of all 114 found no occurrence of the wheat-bran reference ID, `wheat bran`, `wheat-bran`, `son de blé`, or `son de ble`. | No bundled recipe line or recipe link is proposed. The external KAB recipe is evidence only. |

The new Bob’s Red Mill URL and `WP02-A7-WHEAT-BRAN-MEASURE-SUB-R628-20261018-S01` are absent from the current ledger. The source ID is reserved for this proposal. Observation IDs, finding ID, and proposal path were checked against the existing proposal and batch archive. The shared KAB chart ID has multiple existing row owners, and the R624 Banana Pancakes ID already identifies the exact source URL; both are reused rather than creating duplicate IDs for those URLs.

## Source evidence and limits

- King Arthur Baking’s current [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) lists **wheat bran, 1/2 cup, 1 1/8 ounces, 32 g**. Its note says recipe-page weights may differ because of rounding and similar factors and recommends following the recipe weight. The chart does not identify a wheat-bran product or specify a fill method or cup convention [WP07-KAB-IWC].
- King Arthur Baking’s [Banana Pancakes](https://www.kingarthurbaking.com/recipes/banana-pancakes-recipe) page, updated June 24, 2026, lists **1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ**, optional for extra fiber and texture. Its first instruction repeats “wheat bran or germ.” This supports the exact optional ingredient role and both published masses in that recipe only [R624-S02].
- Bob’s Red Mill’s [Wheat Bran product page](https://www.bobsredmill.com/product/wheat-bran) describes its bran as the separated outer layer of the wheat berry and lists the ingredient as Wheat Bran. Its current Nutrition Facts panel gives **1/4 cup (13 g)** as the serving size. This is a manufacturer-label portion for that named product, not a general wheat-bran measure [S01].

The KAB chart and recipe are separate published references, while the Bob’s Red Mill value belongs to a named product label. The two direct 1/4-cup values differ, so the ledger should retain their source scopes rather than average, convert, or promote either value to active behavior. No source specifies the relevant cup convention or fill method.

## Proposed ledger delta

Append the following source records, observations, finding, and decision to the existing `ingredient-ref-wheat-bran` ledger record. Set its measurement and substitution research states as shown, preserve its current `sources` and `decisions`, and leave the active reference unchanged.

```json
{
  "recordId": "ingredient-ref-wheat-bran",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP07-KAB-IWC",
      "url": "https://www.kingarthurbaking.com/learn/ingredient-weight-chart",
      "title": "King Arthur Baking, Ingredient Weight Chart",
      "accessedOn": "2026-10-18",
      "locator": "Wheat bran row; chart note following the table.",
      "supports": "The chart lists wheat bran as 1/2 cup = 1 1/8 ounces = 32 g. Its note says recipe-page gram values may differ due to rounding and similar factors and advises following recipe weights. It does not specify a bran product, cup convention, or row-specific fill method.",
      "sourceKind": "culinary_reference"
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
      "sourceId": "WP02-A7-WHEAT-BRAN-MEASURE-SUB-R628-20261018-S01",
      "url": "https://www.bobsredmill.com/product/wheat-bran",
      "title": "Bob's Red Mill Natural Foods, Wheat Bran",
      "accessedOn": "2026-10-18",
      "locator": "Product description, Nutrition Facts serving size, and ingredient statement.",
      "supports": "The manufacturer describes its wheat bran as the separated outer layer of the wheat berry; the current label lists 1/4 cup (13 g) per serving and the ingredient statement says Wheat Bran. This is evidence for the named product only.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "wheat-bran-kab-chart-half-cup-32-g-r628-20261018",
      "relationship": "portion_weight",
      "value": 32,
      "valueUnit": "g",
      "foodDescription": "Wheat bran in King Arthur Baking's general Ingredient Weight Chart.",
      "foodState": "Dry as listed; the chart does not identify a product or fill method.",
      "measurementMethod": "The chart lists wheat bran as 1/2 cup, 1 1/8 ounces, and 32 g. The chart does not specify a cup convention or fill method.",
      "quantityBasis": "Published chart portion only. Do not infer a product-independent density, default measure, or active unit mapping; the chart itself directs readers to follow recipe-page weights where they differ.",
      "sourceQuantity": {
        "amount": 0.5,
        "unit": "cup",
        "unitConvention": "Cup convention and wheat-bran fill method are unspecified by the source."
      },
      "observedMassG": 32,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP07-KAB-IWC"
      ]
    },
    {
      "observationId": "wheat-bran-kab-banana-pancakes-quarter-cup-16-g-r628-20261018",
      "relationship": "portion_weight",
      "value": 16,
      "valueUnit": "g",
      "foodDescription": "Optional wheat bran in King Arthur Baking's Banana Pancakes.",
      "foodState": "Dry as listed before mixing; product and fill method are unspecified.",
      "measurementMethod": "The recipe lists 1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ as an optional ingredient.",
      "quantityBasis": "One named pancake formula only. Do not generalize this amount or infer an equal-mass substitution or density.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Cup convention and wheat-bran fill method are unspecified by the source."
      },
      "observedMassG": 16,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02"
      ]
    },
    {
      "observationId": "wheat-bran-bobs-red-mill-quarter-cup-13-g-r628-20261018",
      "relationship": "portion_weight",
      "value": 13,
      "valueUnit": "g",
      "foodDescription": "Bob's Red Mill Wheat Bran, as named on the manufacturer product page.",
      "foodState": "Dry as marketed; the product page's ingredient statement is Wheat Bran.",
      "measurementMethod": "The manufacturer's Nutrition Facts panel lists a serving size of 1/4 cup (13 g); it does not specify a fill method.",
      "quantityBasis": "Manufacturer-label serving for this named product only. Do not generalize it to all wheat bran or use it to replace a recipe's own published amount.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Cup convention and product-serving fill method are unspecified by the source."
      },
      "observedMassG": 13,
      "evidenceKind": "manufacturer_label",
      "sourceIds": [
        "WP02-A7-WHEAT-BRAN-MEASURE-SUB-R628-20261018-S01"
      ]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "wheat-bran-to-wheat-germ-kab-banana-pancakes-r628-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-wheat-bran",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-wheat-germ",
          "quantity": {
            "amount": 0.25,
            "unit": "cup",
            "unitConvention": "King Arthur's Banana Pancakes list either optional ingredient at 1/4 cup; the source reports different masses."
          },
          "roleInCompound": "Optional wheat-bran-or-wheat-germ ingredient in the named pancake formula."
        }
      ],
      "context": "Only King Arthur Baking's Banana Pancakes.",
      "basis": "The ingredient line explicitly lists 1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ as optional, and the first instruction repeats wheat bran or germ.",
      "limitations": [
        "This is one recipe-specific optional ingredient role, not a general wheat-bran-to-wheat-germ rule.",
        "The source specifies equal volume and different masses; do not infer an equal-mass exchange or derive density.",
        "Do not apply to other recipes, flour replacement, or other baking roles.",
        "Do not activate a global or contextual runtime rule; the runtime model cannot enforce this named formula and optional role, and no bundled recipe uses wheat bran."
      ],
      "sourceIds": [
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the evidence review for the verified wheat-bran milling-fraction identity. King Arthur Baking publishes a general chart portion and a named pancake recipe portion; Bob's Red Mill publishes a different same-volume serving for its named product. Retain these as source-bounded ledger observations and the named optional pancake alternative only. Keep active density, mappings, forms, conversions, package yields, recipe links, picker names, and runtime substitution behavior unchanged.",
      "sourceIds": [
        "WP07-KAB-IWC",
        "WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02",
        "WP02-A7-WHEAT-BRAN-MEASURE-SUB-R628-20261018-S01",
        "WP02-S98",
        "WP02-S100"
      ]
    }
  ]
}
```

## Exact data and search treatment

| Field | Proposed outcome |
|---|---|
| Active identity, category, bilingual names, aliases | Keep `ingredient-ref-wheat-bran` and its existing `GRAIN_AND_CEREAL` identity unchanged; aliases remain empty. |
| Research measurements | Record the three published portions above with their source-specific quantity bases. Do not derive or average any amount. |
| Default density and unit mappings | Keep `null` and `[]`. No active mass-volume behavior is supported across these sources. |
| Forms, conversions, package yields | Add none. |
| Recipe links and substitutions | Add no recipe link or active rule. Keep only the named pancake alternative in ledger evidence. |
| Picker behavior | No change. Do not add aliases or broaden the `bran` query. |

## Static review checks

- Read the current root `AGENTS.md`, `Requirements.md`, A7 plan item, wheat-bran/germ checkpoint, current catalog row and ledger state, relevant forms/rules/yields, R624 integration, and proposal/batch history.
- Checked exact source URL and source-ID ownership. Reused `WP07-KAB-IWC` and R624-S02 for their existing URLs; the Bob’s Red Mill product URL is new to the ledger.
- Audited the current names and aliases. The wheat-bran identity has no aliases; no active name or alias changes are proposed.
- Parsed and scanned every manifest-listed recipe: 114 files, no matching reference ID or English/French wheat-bran terms. No recipe link or bundled demand exists.
- This is a proposal-only review. No shared database JSON, plan, roadmap, README, code, or tests were changed. No software tests, build, emulator run, or deployment were run.
