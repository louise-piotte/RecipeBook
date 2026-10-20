# WP02 Section A7 R660: malted-wheat-flour recipe portion review

- **Reviewed:** 2026-10-18
- **Status:** Integrated on 2026-10-18 after root source and ledger-ownership review; one recipe-specific observation was added to the existing ledger row.
- **Scope:** The remaining measurement question on the existing `ingredient-ref-malted-wheat-flour` row. This is a ledger-only portion review, not a new identity or a general malt-flour measure.
- **A7 anchor:** The active checklist remains open for other grain meals and malted/toasted flour questions. The current malted-wheat identity packet records measurement and substitution as not yet researched.

## Recommendation

Record Hodmedod's published **50 g malted wheat flour** amount from its named *Malted Loaf* recipe as one formula-specific `portion_weight` observation on the existing `ingredient-ref-malted-wheat-flour` ledger row. Set that row's `measurementState` to `researched_supported` because one directly published recipe amount is supported. Keep `substitutionResearchState` at `not_yet_researched` and add no substitution finding.

The recipe line offers the same 50 g amount of malted naked oat flour as an alternative. This review records only the malted-wheat-flour portion. It does not resolve or allocate the naked-oat candidate, create a substitution rule, or generalize the alternative beyond that formula. R30 and R33 treated the line as recipe-specific evidence while reviewing the distinct roasted-oat identity and unallocated malted-naked-oat candidate; neither added this wheat-flour portion to the active wheat-flour ledger record. R659 concerns the separate roasted wheat flour identity.

Do not update the active ingredient-reference JSON. Keep its current name, Québec French display, empty aliases, null density, empty unit mappings, and category unchanged. The proposed ledger observation does not activate picker or conversion behavior.

## Proposal-time ownership and audit

The read-only pre-integration snapshot had **1,834 active ingredient references**, **164 forms**, **56 legacy-import candidates**, **2,207 research-ledger records**, and **114 manifest-listed recipes with 1,123 ingredient rows**; R658 root integration subsequently added one reference and one ledger record.

| Surface | Proposal-time state and R660 boundary |
| --- | --- |
| Active identity | `ingredient-ref-malted-wheat-flour` is `malted wheat flour / farine de blé maltée`, category `FLOUR_AND_STARCH`, with no aliases, null density, and empty unit mappings. Keep the accepted bilingual wording unchanged. |
| Neighboring identities | Generic `ingredient-ref-malt-flour`, `ingredient-ref-malted-barley-flour`, `ingredient-ref-malted-rye-flour`, `ingredient-ref-roasted-wheat-flour`, and `ingredient-ref-roasted-wheat-malt-flour` remain distinct owners. No alias, ingredient ID, or category change is proposed. |
| Forms and rules | No form is attached to `ingredient-ref-malted-wheat-flour`; the active package has no global or contextual substitution rules. At proposal time the target ledger row had no measurement observation or substitution finding; root integration added only the single R660 observation. |
| Ledger and prior work | At the proposal-time snapshot, the target ledger row was `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, with only identity sources WP02-S114–S117 and no measurement observation. The already registered Hodmedod recipe source is `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S04`; it was on the roasted-oat and unallocated malted-naked-oat records. Integration attaches that exact source object to the wheat row with identical metadata instead of creating a duplicate URL/ID. |
| Legacy ownership | No legacy-import candidate contains `malted wheat flour` or `farine de blé maltée`. |
| Proposal archive | The R30/R33 discussion concerns the malted-naked-oat alternative and roasted oat product boundary. The pre-integration ledger snapshot contained no malted-wheat measurement observation. The R660 source-ID prefix and proposal path were absent before drafting. |

### Picker projection

The static projection uses the repository's phrase-first, accent-folded search behavior in `IngredientSearch.kt` over the current reference and form files.

| Query | Current result | Proposed effect |
| --- | --- | --- |
| `malted wheat flour` | `ingredient-ref-malted-wheat-flour` only | No change; this review adds no alias. |
| `farine de blé maltée` or accent-folded `farine de ble maltee` | `ingredient-ref-malted-wheat-flour` only | No change; retain the accepted Québec French display. |
| `malted wheat` | `ingredient-ref-malted-wheat-flakes` and `ingredient-ref-malted-wheat-flour` | No change; the broader phrase remains multi-result. |
| `malt flour` | Existing generic and cereal/product malt-flour matches | No change; no broad alias is added. |

### Bundled recipe demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for `malted wheat flour`, `farine de blé maltée`, its accent-folded spelling, and the broader phrase `malted wheat`. The scan found zero full-file hits, zero ingredient-row hits, and zero direct links to `ingredient-ref-malted-wheat-flour`. The Hodmedod recipe is external source evidence, not bundled recipe demand; no recipe link or relink is proposed.

## Source evidence and decision boundary

Hodmedod's live recipe page, published 2022-06-28, says the formula makes one loaf and lists `50g Malted Wheat Flour or Malted Naked Oat Flour` on a single ingredient line. That directly supports a 50 g amount for the wheat-flour option in this recipe. It gives no volume, measuring method, product SKU, or flour grade/activity specification. Its optional oat-flour wording remains limited to that recipe and is not recorded here as a substitute.

Two current manufacturer pages help limit the interpretation. Molino Moras describes its product as malted soft-wheat flour, recommends 1% of flour weight for bread and pizza and at most 2% for breadsticks and focaccia, and sells a 500 g bag. IRCA identifies OROMALT as high-diastatic wheat malt flour, lists 10 kg and 25 kg professional bags, and gives product/application-specific percentages on flour. These brand- and application-specific directions are not household measures or a reusable mass-volume conversion. They are not copied into observations and are not transferred to every malted-wheat product.

### Exact proposed ledger delta

Apply the following JSON Patch to `records[]` entry `recordId == "ingredient-ref-malted-wheat-flour"`. The reused Hodmedod source object is shown with its existing ID and existing ledger metadata. The two R660 source IDs are new and unique.

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
      "sourceId": "WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S04",
      "url": "https://hodmedods.co.uk/blogs/recipes/malted-naked-oat-loaf",
      "title": "Hodmedod's, Malted Naked Oat Loaf",
      "versionOrDate": "2022-06-28",
      "accessedOn": "2026-10-13",
      "locator": "Ingredient lines for malted flour and whole malted oats.",
      "supports": "Names malted naked oat flour as one recipe-specific alternative to malted wheat flour and lists 50 g in that recipe. It does not identify Castle Oat 80 or support a transferable measure or substitution.",
      "sourceKind": "culinary_reference"
    }
  },
  {
    "op": "add",
    "path": "/sources/-",
    "value": {
      "sourceId": "WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S01",
      "url": "https://www.molinomoras.live/en/products/malted-wheat-flour",
      "title": "Molino Moras, Malted Wheat Flour",
      "accessedOn": "2026-10-18",
      "locator": "Product description, usage advice, ingredients, and package details.",
      "supports": "Describes its own malted soft-wheat flour, specifies brand/product-specific bread, pizza, breadstick, and focaccia dosage guidance relative to flour weight, and lists a 500 g package. It provides no household volume measure or transferable density.",
      "sourceKind": "manufacturer"
    }
  },
  {
    "op": "add",
    "path": "/sources/-",
    "value": {
      "sourceId": "WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S02",
      "url": "https://www.ircagroup.com/en/products/oromalt",
      "title": "IRCA Group, OROMALT",
      "accessedOn": "2026-10-18",
      "locator": "Product description, professional package sizes, and directions for use.",
      "supports": "Identifies OROMALT as high-diastatic wheat malt flour and lists product/application-specific percentage additions on flour for professional bakery products. It provides no household volume measure or transferable density.",
      "sourceKind": "manufacturer"
    }
  },
  {
    "op": "add",
    "path": "/measurementObservations",
    "value": [
      {
        "observationId": "malted-wheat-flour-hodmedod-malted-loaf-50g-r660-20261018",
        "relationship": "portion_weight",
        "value": 50,
        "valueUnit": "g",
        "foodDescription": "Malted wheat flour in Hodmedod's Malted Loaf; the recipe offers malted naked oat flour as the other option on the same ingredient line.",
        "foodState": "Listed before mixing into dough; the recipe does not specify the wheat-malt flour grade or activity.",
        "measurementMethod": "The published recipe ingredient line directly lists 50 g; it gives no independent weighing procedure.",
        "quantityBasis": "One named loaf formula only. Record the wheat-flour option only; do not transfer the amount to another product or recipe, infer a volume measure, or encode the oat alternative as a substitution.",
        "observedMassG": 50,
        "evidenceKind": "published_portion",
        "sourceIds": [
          "WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S04"
        ]
      }
    ]
  },
  {
    "op": "add",
    "path": "/decisions/-",
    "value": {
      "outcome": "accepted",
      "reason": "Record Hodmedod's directly published 50 g malted-wheat-flour portion as one recipe-specific observation on the existing malted-wheat-flour ledger row. The oat alternative is not generalized into a substitution. Molino Moras and IRCA give only product/application-specific professional percentages and package sizes, not a household measure, density, or reusable conversion. Keep active numeric behavior, aliases, forms, mappings, recipe links, and substitution behavior unchanged.",
      "sourceIds": [
        "WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S04",
        "WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S01",
        "WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S02"
      ]
    }
  }
]
```

Leave `substitutionResearchState` at `not_yet_researched`; add no `substitutionFindings`. Add no active catalog value, alias, form, conversion, density, mapping, package yield, recipe link, or runtime rule. In particular, do not encode any of the manufacturers' percentages as a recipe default or transfer the recipe's oat alternative beyond its named formula.

## Source and identifier register

Sources were checked online on 2026-10-18, except the reused Hodmedod ledger record, originally accessed 2026-10-13 and re-opened for this review.

| Source ID | Source and evidence | Scope limit |
| --- | --- | --- |
| `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S04` (reused) | Hodmedod's, [Malted Loaf](https://hodmedods.co.uk/blogs/recipes/malted-naked-oat-loaf), published 2022-06-28; malted-flour ingredient line. | Direct 50 g formula amount for the malted-wheat option. No household volume, SKU, grade, or universal substitution. The source ID already exists on the roasted-oat and malted-naked-oat records. |
| `WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S01` | Molino Moras, [Malted Wheat Flour](https://www.molinomoras.live/en/products/malted-wheat-flour), product description and use advice. | Manufacturer-specific high-diastatic soft-wheat product; weight-relative use guidance and 500 g pack, not a cup measure or identity-wide default. |
| `WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S02` | IRCA Group, [OROMALT](https://www.ircagroup.com/en/products/oromalt), product description and usage table. | Manufacturer-specific high-diastatic product and commercial application dosage; no home measure or transferable mass-volume conversion. |

The existing active row owns `malted wheat flour / farine de blé maltée`; no new ingredient ID is proposed. The reused Hodmedod source ID is not reassigned or edited on its existing owners; its exact source object is also attached to the target wheat row. Before integration, the two R660 source IDs and the new observation ID were unallocated in the active ledger and archive. The existing Québec French display remains unchanged; this proposal adds no translation or alias.

## Static checks

- Confirmed the proposed ID prefix and output path were unused before drafting.
- Confirmed the cited Hodmedod source ID already exists with the same URL and claim; no new ID or duplicate source object is proposed.
- Confirmed the catalog row has no density, unit mapping, or aliases; no form or substitution rule is attached.
- Confirmed the full package manifest contains 114 recipes and 1,123 ingredient rows; the current bundle has no matching row or direct reference link.
- Root integration updated the existing ledger row and its documentation only; the active reference and generated picker index remain unchanged. No software tests, app build, emulator, or deployment checks were run for this database-JSON-only update.


## Root integration

Accepted the source-bounded observation. The existing `ingredient-ref-malted-wheat-flour` row now has `measurementState: researched_supported` and one `portion_weight` observation for 50 g on Hodmedod's named *Malted Loaf*. Reused its existing source record with identical metadata; the new Molino Moras and IRCA sources only bound manufacturer-specific dosing and packaging. Substitution research remains `not_yet_researched`; the oat alternative was not modeled as a substitution. Active reference fields, forms, density, unit mappings, recipe links, conversions, yields, and substitution rules remain unchanged.

See the [R660 integration README](../batches/wp02-a7-malted-wheat-flour-portion-integration-r660-20261018/README.md).

## Root static validation

- `validate_research_ledger()` passed with 2,208 records and zero errors. The malted-wheat row has one unique 50 g observation; substitution research remains `not_yet_researched`.
- The reused Hodmedod source ID and URL now have three owners with identical metadata. The two R660 source IDs and the observation ID each have one owner.
- The R658-generated catalog index remains current at 1,835 references. Maintained documentation passed UTF-8/no-BOM, local-link, newline, whitespace, and scoped `git diff --check` validation.
