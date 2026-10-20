# WP02 A6 R788 — generic glutinous-rice-flour substitution evidence — 2026-10-19

## Review record

- **Status:** Integrated on 2026-10-19. Root added the proposed research-ledger evidence; see the [R788–R790 integration README](../batches/wp02-wp03-wp04-r788-r790-gap-review-integration-20261019/README.md).
- **Plan fit:** The open [WP02 A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1860) continues review of regional grain flours. R785 completed measurement research for generic glutinous rice flour and explicitly left its substitution question unchanged. This proposal advances that deferred substitution question; the broader A6 parent remains open.
- **Target:** Existing `ingredient-ref-glutinous-rice-flour`, `glutinous rice flour / farine de riz gluant`, category `FLOUR_AND_STARCH`.
- **Exact open question:** Does a directly documented recipe context support a bounded alternative for the generic glutinous-rice-flour row, and what quantity or scope can be retained without inferring a reusable replacement rule?
- **Prior-work boundary:** R785 recorded five product- or formula-specific measurement observations and kept `substitutionResearchState: not_yet_researched`. Its Bob’s Red Mill and King Arthur Baking measurement sources and observations remain unchanged. The existing Shiratamako-to-Mochiko finding from Télé-Québec applies only to that named ice-cream-mochi recipe; it does not establish a generic glutinous-rice-flour replacement.
- **Proposal-local IDs:** New source IDs `WP02-A6-GLUTINOUS-RICE-FLOUR-SUB-R788-20261019-S01` and `WP02-A6-GLUTINOUS-RICE-FLOUR-SUB-R788-20261019-S02`; finding ID `glutinous-rice-flour-ice-kimchi-pancake-recipe-r788-20261019`. These IDs and the requested proposal path were checked against the live ledger and documentation archive; no prior owner or collision was found.

## Recommendation

Set `substitutionResearchState` on `ingredient-ref-glutinous-rice-flour` to `researched_supported` and append one source-scoped, recipe-specific finding for all-purpose flour in the Institute of Culinary Education’s Fermented Garlic Scape Kimchi Pancakes. The recipe’s note says the pancakes are denser and chewier when made with glutinous rice flour, but that this recipe can use only all-purpose flour. The printed recipe lists 1 1/2 cups of each flour; the source gives no revised amount for its all-purpose-only version.

Record all-purpose flour as the bounded alternative without a quantity. Do not infer that 1 1/2 cups of all-purpose flour replaces 1 1/2 cups of glutinous rice flour, that the printed 3 cups of combined flour should become 3 cups of all-purpose flour, or that the alternative applies to other pancakes, batters, or products. This is one supported finding, not a completed family review or a claim that other contexts have no substitutes.

Bob’s Red Mill’s Starch Compendium is a useful boundary source: its Sweet White Rice Flour discussion describes product-specific differences from ordinary White Rice Flour and gives thickener guidance involving wheat flour. It does not recommend all-purpose flour for the ICE pancake batter, identify its thickener comparator as the active all-purpose-flour reference, or supply evidence for a general replacement. Keep that discussion out of the R788 substitution finding.

Add no `ruleId`, active contextual or form-substitution rule, measurement, form, density, unit mapping, conversion, yield, alias, or recipe-line link. Preserve R785’s measurement state, five observations, sources, and decisions. Keep the generic row distinct from ordinary rice flour, Mochiko, and Shiratamako; do not copy the Shiratamako-to-Mochiko finding onto the generic row.

This remains ledger evidence only. It does not authorize an automatic picker suggestion or imply that RecipeBook can calculate a replacement quantity.

## Current row and evidence boundary

| Surface | Current state | R788 disposition |
|---|---|---|
| Active reference | `ingredient-ref-glutinous-rice-flour`, `glutinous rice flour / farine de riz gluant`; English aliases `sweet rice flour` and `sweet rice powder`; `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []`. | Keep unchanged. Do not add recipe wording as an alias. |
| Generic ledger row | Identity `verified`; measurement `researched_no_supported_value` with five R785 observations; substitution `not_yet_researched`; no substitution findings. | Change only substitution research state; append one bounded finding, two source records, and one decision. |
| All-purpose flour | Existing active row `ingredient-ref-all-purpose-flour`, `all-purpose flour / farine tout usage`. | Use only as the named replacement in the ICE recipe finding; add no mapping or rule. |
| Ordinary rice flour | Separate active `ingredient-ref-rice-flour`; Bob’s source says Sweet White Rice Flour and White Rice Flour cannot necessarily be interchanged because they absorb liquid differently. | Preserve the existing distinction; add no alias or replacement claim between them. |
| Named glutinous-rice flours | Mochiko and Shiratamako are separate active references. Shiratamako has one supported Télé-Québec finding that Mochiko may replace it in that named ice-cream-mochi recipe, with a slight texture difference. | Keep the existing finding and its owners unchanged. Do not generalize it to this generic row. |
| Active behavior | No forms, default density, unit mappings, or reusable generic-flour substitution rule are proposed. | Keep catalog, conversion, picker, and recipe-line behavior unchanged. |

## Directly checked sources and limits

The Institute of Culinary Education, [“Garlic Scape Kimchi Pancakes Recipe”](https://www.ice.edu/blog/garlic-scape-kimchi-pancakes-recipe), accessed 2026-10-19, is the direct positive source. Under “What’s Good to Know,” it says glutinous rice flour makes these pancakes “a bit denser and chewier” and that this recipe can be made using only all-purpose flour. Its printed ingredient list uses 1 1/2 cups of all-purpose flour plus 1 1/2 cups of glutinous rice flour; the page does not provide the quantities for an all-purpose-only version. The page identifies the author as a former chef-instructor at ICE. Record the alternative only for this named recipe, with no quantity or inferred adjustment.

Bob’s Red Mill, [“Starch Compendium”](https://docs.bobsredmill.com/document-center/how-to-use-our-products-top-1/18543-starch-compendium/file), accessed 2026-10-19, is a manufacturer source. In its Sweet White Rice Flour section, it describes that flour as starchier than White Rice Flour and says the two may absorb liquid at different rates and cannot necessarily be used interchangeably. It separately says Sweet White Rice Flour can thicken stews, soups, and sauces using the same amount as wheat flour. These are product- and function-scoped statements; they do not supply an all-purpose-flour amount for the ICE recipe or evidence for a universal glutinous-rice-flour substitute.

The only new supported replacement finding below comes from the ICE recipe. The Bob’s source is retained with the decision as an explicit boundary; it is not cited as support for replacing glutinous rice flour with all-purpose flour.

## Proposed ledger delta

Append the following fields to the existing `ingredient-ref-glutinous-rice-flour` record. Preserve R785’s measurement fields and all existing sources, observations, and decisions.

```json
{
  "recordId": "ingredient-ref-glutinous-rice-flour",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-A6-GLUTINOUS-RICE-FLOUR-SUB-R788-20261019-S01",
      "url": "https://www.ice.edu/blog/garlic-scape-kimchi-pancakes-recipe",
      "title": "Institute of Culinary Education, Garlic Scape Kimchi Pancakes Recipe",
      "accessedOn": "2026-10-19",
      "locator": "What’s Good to Know; Fermented Garlic Scape Kimchi Pancakes, ingredients and directions.",
      "supports": "The recipe note says glutinous rice flour makes these pancakes a bit denser and chewier, but that this recipe can be made with only all-purpose flour. The printed formula lists 1 1/2 cups of each flour; no revised quantity for the all-purpose-only version is given. Supports only a qualitative alternative in this named recipe, with no replacement amount or transferable rule.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP02-A6-GLUTINOUS-RICE-FLOUR-SUB-R788-20261019-S02",
      "url": "https://docs.bobsredmill.com/document-center/how-to-use-our-products-top-1/18543-starch-compendium/file",
      "title": "Bob’s Red Mill, Starch Compendium",
      "accessedOn": "2026-10-19",
      "locator": "Sweet White Rice Flour section; comparison with White Rice Flour and thickener guidance.",
      "supports": "The manufacturer describes Sweet White Rice Flour as starchier than White Rice Flour and says the two may absorb liquid at different rates and cannot necessarily be used interchangeably. It also gives Sweet White Rice Flour thickener guidance against wheat flour. This does not discuss all-purpose flour in pancakes, identify the comparator as the active all-purpose-flour row, or establish a generic substitution.",
      "sourceKind": "manufacturer"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "glutinous-rice-flour-ice-kimchi-pancake-recipe-r788-20261019",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-glutinous-rice-flour",
      "replacements": [
        { "ingredientRefId": "ingredient-ref-all-purpose-flour" }
      ],
      "context": "Institute of Culinary Education’s Fermented Garlic Scape Kimchi Pancakes. The printed formula lists 1 1/2 cups each all-purpose flour and glutinous rice flour; the accompanying note says the recipe can be made using only all-purpose flour.",
      "basis": "The source explicitly permits using only all-purpose flour in this named pancake recipe and says glutinous rice flour makes the pancakes a bit denser and chewier. It supplies no revised amount for the all-purpose-only version.",
      "expectedEffects": [
        "The author says including glutinous rice flour makes these pancakes a bit denser and chewier; the source does not quantify the texture of the all-purpose-only version."
      ],
      "limitations": [
        "Recipe-specific evidence only; do not generalize to other pancake formulas, batters, baking contexts, brands, Mochiko, or Shiratamako.",
        "The all-purpose-only version has no stated flour quantity. Do not infer equal-volume or equal-mass replacement, whether to retain 1 1/2 cups or use the printed 3 cups total, or any liquid adjustment.",
        "The source provides no reason to change the active identity, aliases, picker behavior, measurement state, density, unit mappings, forms, or recipe-line links.",
        "Do not create a reusable or automatic substitution rule from this single qualitative recipe note."
      ],
      "sourceIds": ["WP02-A6-GLUTINOUS-RICE-FLOUR-SUB-R788-20261019-S01"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record one positive, source-scoped finding: the ICE Fermented Garlic Scape Kimchi Pancakes recipe permits an all-purpose-only version while describing the texture contribution of glutinous rice flour. The source gives no revised amount, so record no ratio, quantity, adjustment, or active rule. Bob’s manufacturer guidance is retained only as a product/function boundary and does not support this all-purpose substitution. This is not a completed review of all possible glutinous-rice-flour contexts. Preserve R785 measurement work and all active catalog and recipe behavior.",
      "sourceIds": [
        "WP02-A6-GLUTINOUS-RICE-FLOUR-SUB-R788-20261019-S01",
        "WP02-A6-GLUTINOUS-RICE-FLOUR-SUB-R788-20261019-S02"
      ]
    }
  ]
}
```

`researched_supported` here denotes the one supported recipe-specific finding above. It does not mean there is a generic replacement ratio, a reusable rule, or a completed no-substitute family review. Keep the global and contextual substitution-rule files unchanged.

## Picker projection and recipe-corpus demand

No active reference, alias, or form changes are proposed, so picker results remain unchanged. `glutinous rice flour`, `sweet rice flour`, and `sweet rice powder` continue to resolve to the generic row; ordinary `rice flour`, `Mochiko`, and `Shiratamako` retain their separate identities. Do not add the recipe title or “kimchi pancake flour” as an ingredient alias. No substitution should be surfaced automatically from this evidence.

Scanned all **114 bundled recipe files** and **1,123 structured ingredient rows** for generic glutinous-rice-flour wording and reference ID, `sweet rice flour`, `sweet rice powder`, `Mochiko`, and `Shiratamako`. No matching rows or ingredient-reference links were found. The ICE recipe is external to the bundled corpus, so it supplies no RecipeBook recipe-line link or bundled demand.

## Ownership and review checks

- Confirmed the current generic reference keeps its existing bilingual display, English aliases, `FLOUR_AND_STARCH` category, null density, and empty unit mappings. Confirmed its live ledger state is measurement `researched_no_supported_value` and substitution `not_yet_researched`, with five R785 measurement observations and no substitution findings.
- Confirmed the ICE and Bob’s URLs and the new source IDs, finding ID, and proposal path have no current owner/collision in the ledger and documentation archive. Allocate the two new source IDs only to the generic glutinous-rice-flour ledger record. Do not duplicate or transfer the existing Télé-Québec source/finding for Shiratamako-to-Mochiko.
- The proposed change is a research-ledger delta only. Active ingredient-reference JSON, forms, rules, recipes, picker behavior, and R785 measurement data remain unchanged.
- Root integrated the research-ledger delta only. No software tests, build, emulator, or deployment were run because the change only adds database JSON data under the updated AGENTS.md rule.
