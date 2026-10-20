# WP02 Section A7 R662: malted-rye-flour recipe portion review

- **Reviewed:** 2026-10-18
- **Status:** Integrated as one ledger-only portion observation; active catalog and picker data are unchanged.
- **Scope:** One formula-specific portion observation on the existing `ingredient-ref-malted-rye-flour` ledger row.
- **A7 anchor:** The open parent checklist item is [Continue A7 review](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). R660 records a separate malted-wheat-flour formula amount. R56 concerns malted rye **meal**, so it does not review this flour row.

## Recommendation

Record Briess's **3/4 cup (98 g)** of `BriesSpecialty™ Malted Rye Flour L100` in its *Malted Rye Rolls* formula as one product- and formula-specific `portion_weight` observation. Set `measurementState` on the existing `ingredient-ref-malted-rye-flour` ledger row to `researched_supported`.

Keep `substitutionResearchState: not_yet_researched`. The formula does not name an alternative ingredient. Record the cup and mass together as Briess published them, without deriving density, millilitres, a reusable cup conversion, or a general measure for malted rye flour. The observation describes the named L100 product in one Briess formula; it does not activate numeric behavior in the app.

## Proposal-time ownership and demand audit

The post-R657/R658/R660 snapshot before this ledger update had **1,836 active ingredient references**, **164 forms**, **56 legacy-import candidates**, **2,209 ledger records**, and **114 manifest-listed recipes with 1,123 ingredient rows**.

| Surface | Current state and proposed boundary |
| --- | --- |
| Active identity | `ingredient-ref-malted-rye-flour` is `malted rye flour / farine de seigle malté`, category `FLOUR_AND_STARCH`, with no aliases, null `defaultDensity`, and empty `unitMappings`. Keep every field unchanged. |
| Ledger | The row is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It has the existing identity sources S08 and S09 and no measurement observations. Add one source and one observation; retain substitution state. |
| Neighboring owners | Plain `rye flour`, `rye meal`, generic `malt flour`, malted barley and wheat flours, and roasted wheat malt flour remain separate. R56's `candidate-malted-rye-meal` remains unresolved and is not an owner of this flour measure. |
| Forms and rules | No form is attached to this reference. The active package currently has zero global and zero contextual substitution rules. No form or rule is proposed. |
| Legacy import | No legacy candidate owns the exact malted-rye-flour terms or this reference ID. |
| Recipe demand | All 114 manifest-listed recipes and 1,123 ingredient rows were scanned for the English and French names, accent-folded French, `malted rye`, the L100 product wording, and the active reference ID. The scan found no matching recipe text, ingredient row, or direct reference link. Briess's external formula is evidence, not a bundled recipe demand; do not create a recipe link. |

### Picker projection

Search uses the active bilingual names and aliases. The current queries `malted rye flour`, `malted rye`, `farine de seigle malté`, and accent-folded `farine de seigle malte` return only `ingredient-ref-malted-rye-flour`. Since this proposal changes only the research ledger, all picker results remain unchanged. No alias or French translation is proposed.

## Source evidence and decision boundary

Briess's manufacturer-published *Malted Rye Rolls* formula lists `BriesSpecialty™ Malted Rye Flour L100` as **3/4 cup** in the `Volume` column and **98 g** in the adjacent `Grams` column on the same ingredient row [S01]. Its method mixes the flour with salt and all-purpose flour before adding those dry ingredients to the wet ingredients. The formula gives no cup convention, filling method, serving count, or independent weighing procedure; none is inferred here.

Briess's current [Malted Flours product page](https://food.briess.com/products/briess-specialty-malt-flours/) lists product MRF L100 as a malted rye flour option. This is the same manufacturer product family named in the formula. The existing ledger source ID `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S08` already records this product page and is owned by both `candidate-generic-malt-flour` and `ingredient-ref-malted-rye-flour`; it will be reused as existing evidence without changing its source object or adding a duplicate URL record.

The formula's paired volume and mass are retained only as one published portion for this named product and formula. Do not use the pair as a density, an active unit mapping, a cup conversion for other malted rye flour products, a serving amount, or a substitution ratio. The source gives no replacement option. Active density stays null, mappings stay empty, and substitution research remains open.

## Exact proposed ledger delta

Apply this JSON Patch to the `records[]` object whose `recordId` is `ingredient-ref-malted-rye-flour`. The paths below are relative to that record. S01 and the observation ID are new; existing identity source S08 is reused by reference only.

```json
[
  {
    "op": "replace",
    "path": "/measurementState",
    "value": "researched_supported"
  },
  {
    "op": "add",
    "path": "/sources/-",
    "value": {
      "sourceId": "WP02-A7-MALTED-RYE-FLOUR-PORTION-R662-20261018-S01",
      "url": "https://food.briess.com/wp-content/uploads/2019/05/Briess_Recipes_MaltedRyeRolls.pdf",
      "title": "Briess Malt & Ingredients Co., Malted Rye Rolls",
      "accessedOn": "2026-10-18",
      "locator": "Page 1, ingredient table row for BriesSpecialty Malted Rye Flour L100; method steps 2–3.",
      "supports": "Lists 3/4 cup and 98 g for BriesSpecialty Malted Rye Flour L100 in the same formula row. It gives no cup convention, filling method, serving count, or independent weighing procedure.",
      "sourceKind": "manufacturer"
    }
  },
  {
    "op": "add",
    "path": "/measurementObservations",
    "value": [
      {
        "observationId": "malted-rye-flour-briess-malted-rye-rolls-l100-98g-r662-20261018",
        "relationship": "portion_weight",
        "value": 98,
        "valueUnit": "g",
        "foodDescription": "BriesSpecialty Malted Rye Flour L100 in Briess's Malted Rye Rolls formula.",
        "foodState": "Dry flour listed before mixing; no further preparation state is specified.",
        "measurementMethod": "Briess publishes 3/4 cup and 98 g in adjacent Volume and Grams columns on the same ingredient row; it gives no independent weighing procedure.",
        "quantityBasis": "One manufacturer-published formula and the named L100 product only. Preserve the paired source amounts as a recipe portion; do not derive density, millilitres, a reusable conversion, or a general measure.",
        "sourceQuantity": {
          "amount": 0.75,
          "unit": "cup",
          "unitConvention": "Briess does not specify the cup convention or filling method."
        },
        "observedMassG": 98,
        "evidenceKind": "published_portion",
        "sourceIds": [
          "WP02-A7-MALTED-RYE-FLOUR-PORTION-R662-20261018-S01"
        ]
      }
    ]
  },
  {
    "op": "add",
    "path": "/decisions/-",
    "value": {
      "outcome": "accepted",
      "reason": "Record Briess's directly published 3/4 cup (98 g) amount of its BriesSpecialty Malted Rye Flour L100 in the named Malted Rye Rolls formula as one product- and formula-specific portion observation. Preserve the paired quantities without inferring a cup convention, density, reusable conversion, or general measure. No replacement option is stated. Keep active catalog values, forms, mappings, recipe links, and substitution behavior unchanged; substitution research remains not_yet_researched.",
      "sourceIds": [
        "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S08",
        "WP02-A7-MALTED-RYE-FLOUR-PORTION-R662-20261018-S01"
      ]
    }
  }
]
```

Do not add `substitutionFindings`, active density, unit mappings, a form, a recipe link, a conversion, a yield, or any catalog alias. `substitutionResearchState` remains `not_yet_researched`.

## Source and ID ownership

| Source ID | Source and evidence | Ownership and limit |
| --- | --- | --- |
| `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S08` (existing) | Briess, [Malted Flours](https://food.briess.com/products/briess-specialty-malt-flours/), current product listing. | Already attached to `candidate-generic-malt-flour` and `ingredient-ref-malted-rye-flour`; reuse for product identity only. No source object change or new duplicate URL record. |
| `WP02-A7-MALTED-RYE-FLOUR-PORTION-R662-20261018-S01` (new) | Briess, [Malted Rye Rolls](https://food.briess.com/wp-content/uploads/2019/05/Briess_Recipes_MaltedRyeRolls.pdf), page 1, formula ingredient table and method. | Direct formula evidence for the paired 3/4-cup and 98-g amount of Briess's L100 product. No transferable recipe behavior or cup convention. |

At proposal time the source ID and observation ID had no existing ledger or archive owner. They are now attached once to the existing malted-rye-flour ledger record. No new ingredient ID is proposed. R660's IDs and wheat-flour observation are separate; R56's malted rye meal candidate remains separate.

## Integration disposition

Accepted the manufacturer-published 3/4-cup / 98-g amount as one product- and formula-specific `portion_weight` observation on the existing `ingredient-ref-malted-rye-flour` ledger row. The new source is attached once; existing product-page source S08 and its metadata are unchanged. The ledger now has one measurement observation for this identity and `measurementState: researched_supported`. The active reference, aliases, null density, empty mappings, forms, recipe links, substitutions, generated index, and bundled recipe files remain unchanged.

Static research-ledger schema and custom validation passed with zero errors. New source and observation IDs are unique; the Briess formula PDF URL now has one ledger owner, while the reused S08 product-page URL retains its existing owners. The ledger remains at 2,209 records. No software tests, build, emulator run, or deployment were performed for this ledger-only database JSON addition under `AGENTS.md`. See the [R662 integration README](../batches/wp02-a7-malted-rye-flour-portion-integration-r662-20261018/README.md).

## Static checks

- Read the active Section A7 parent item, recent accepted R659/R660 work, relevant proposal archive, catalog, ledger, forms, rules, legacy candidates, and manifest-listed recipe corpus.
- Reopened Briess's current product page and its manufacturer recipe PDF on 2026-10-18; the PDF directly pairs 3/4 cup with 98 g for the named L100 product.
- Confirmed the active malted-rye-flour row has no observations and remains measurement-unresearched; its display, aliases, density, and mappings need no change.
- Confirmed the proposed source and observation IDs have no existing ledger or archive owner and the new source URL differs from the two existing row URLs.
- Confirmed no recipe rows or direct links match the candidate terms or reference ID in the 114-recipe manifest.
- The exact source, observation, recipe-demand, and catalog boundaries described above were preserved during integration; no active picker data changed.
