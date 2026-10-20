# WP02 A6 R779 — untreated sorghum-flour bread evidence — 2026-10-18

- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, generated file, or app file was edited.
- **Plan fit:** The A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1855). This review covers one unrecorded primary-study finding on the existing sorghum-flour identity.
- **Target:** Existing `ingredient-ref-sorghum-flour`, `sorghum flour / farine de sorgho`, category `FLOUR_AND_STARCH`.
- **Exact open question:** Does a controlled sorghum–wheat bread study support a reusable replacement rule for the generic sorghum-flour row?
- **Prior-work boundary:** The existing row has source-scoped qualitative manufacturer guidance from Westpoint Naturals and remains `substitutionResearchState: blocked_pending_evidence`. R779 adds one distinct controlled bread study; it does not revisit the existing measurement observations, aliases, or Westpoint finding. The separate sprouted-sorghum-flour candidate remains held.
- **Proposal-local IDs:** Source `WP02-A6-SORGHUM-FLOUR-SUB-R779-20261018-S01`; finding `sorghum-flour-untreated-wheat-bread-study-r779-20261018`. The source ID, finding ID, source URL/DOI, and proposal path were checked against the current ledger and catalog archive; no collisions were found.

## Recommendation

Append one primary-study source and one blocked, source-scoped finding to the existing `ingredient-ref-sorghum-flour` ledger record. Leave the row's `substitutionResearchState` as `blocked_pending_evidence`.

Sharanagat et al. compare refined-wheat bread with experimental blends that use untreated control sorghum flour from one HJ-513 grain lot. The control blend series holds rice flour at 10% while varying control sorghum flour from 10% to 40% and reducing refined wheat flour from 80% to 50%. Their conclusion reports that control-sorghum bread was acceptably rated up to 20% sorghum flour within this study. The fixed rice-flour share means that the result does not isolate sorghum as the sole wheat replacement; at the 20% control-sorghum level, the cereal-flour base is 70% refined wheat flour, 20% sorghum flour, and 10% rice flour.

Record the tested formulation and limit as evidence only. The grain cultivar, 212 μm milling screen, co-ingredient, yeast bread process, ingredient additions, and farinograph-directed water prevent transfer to an arbitrary recipe. The article does not identify its refined wheat flour as any current RecipeBook wheat-flour class, so do not set `fromIngredientRefId`. Add no `replacements`, `ruleId`, active substitution rule, recipe-line link, alias, form, measurement, density, unit mapping, conversion, or yield. Preserve all existing sources, observations, aliases, and decisions.

## Current row and evidence boundary

| Surface | Current state | R779 disposition |
|---|---|---|
| Active reference | `sorghum flour / farine de sorgho`; English aliases include `jowar flour`, `jowar atta`, `guinea corn flour`, `sweet white sorghum flour`, and `red sorghum flour`; French alias `farine douce de sorgho blanc`; `defaultDensity: null`; empty `unitMappings`. | Keep unchanged. |
| Target ledger row | Identity `verified`; measurement `researched_supported`; substitution `blocked_pending_evidence`. Existing measurement observations and the Westpoint source-scoped substitution finding are present. | Preserve current state and evidence; append only the new source, finding, and decision. |
| Comparator flour | The paper calls its comparator `refined wheat flour` from a local market. It gives no flour class, product, or brand. | Do not assign a wheat-flour reference or assert that it is all-purpose, bread, or another cataloged class. |
| Forms and active behavior | No sorghum-flour forms, package yields, global substitution rules, or contextual substitution rules are attached to the target. | Add none. Keep the separately held sprouted-sorghum candidate unchanged. |

## Primary study and limits

Sharanagat, Nema, Singh, Mani, and Kishore, [“Effect of sorghum pre-processing (roasting and germination) on the replacement level and quality of sorghum-wheat bread”](https://pmc.ncbi.nlm.nih.gov/articles/PMC10772035/), *Journal of Food Science and Technology* 61(2) (2024), 253–267, [DOI 10.1007/s13197-023-05810-3](https://doi.org/10.1007/s13197-023-05810-3), is a primary experimental study. Its Materials and Methods section identifies sorghum cultivar HJ-513, procured from Hisar Agriculture University (Haryana, India). The authors divide cleaned grain into three treatments; the control sorghum is unprocessed, and the flour is ground and passed through a 212 μm sieve. Their control bread uses 100% refined wheat flour. Each composite formula contains rice flour at 10%, control sorghum flour at 10%, 20%, 30%, or 40%, and refined wheat flour at 80%, 70%, 60%, or 50%, respectively, alongside yeast, oil, sugar, salt, and water set from farinograph analysis. The article reports 20% control sorghum flour as the upper acceptable level in this experiment; higher additions reduced sensory acceptance.

This is direct evidence for the named study formulas. It does not give a stand-alone instruction to replace a particular proportion of wheat flour with generic sorghum flour in an existing recipe. In particular, the constant 10% rice-flour addition means the change from the all-wheat control is a multi-flour reformulation. No bundled RecipeBook recipe matches this formulation or provides a role, quantity, or method for linking it to a recipe.

## Proposed ledger delta

Append this fragment to the existing sorghum-flour ledger record. Keep its current measurement observations, sources, Westpoint finding, and decision history intact. The row's substitution research state remains `blocked_pending_evidence`.

```json
{
  "recordId": "ingredient-ref-sorghum-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-SORGHUM-FLOUR-SUB-R779-20261018-S01",
      "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC10772035/",
      "title": "Sharanagat et al. Effect of sorghum pre-processing (roasting and germination) on the replacement level and quality of sorghum-wheat bread: bread characteristics, digestibility, consumer acceptability and microbiological analysis",
      "versionOrDate": "Journal of Food Science and Technology 61(2) (2024), 253–267; first published 2023-09-27; DOI 10.1007/s13197-023-05810-3",
      "accessedOn": "2026-10-18",
      "locator": "Materials and Methods: Material, Processing of sorghum, Table 1; Results and discussion; Conclusion.",
      "supports": "Primary experimental study of sorghum–wheat bread. The authors identify cultivar HJ-513, mill unprocessed control sorghum through a 212 μm sieve, and test composite bread formulas with rice flour fixed at 10%, control sorghum flour at 10–40%, and refined wheat flour at 80–50%. The control-sorghum bread is reported as acceptably rated up to 20% sorghum flour in this formula family. These results are limited to the study cultivar, milling, co-ingredient, additions, method, and sensory assessment; they do not establish a general wheat-flour replacement ratio.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "sorghum-flour-untreated-wheat-bread-study-r779-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "One yeasted composite-bread study using untreated HJ-513 sorghum flour with refined wheat flour and a fixed rice-flour addition.",
      "basis": "The study compares a 100% refined-wheat control with composite flour bases containing 10% rice flour, 10–40% untreated control sorghum flour, and 80–50% refined wheat flour. It reports control-sorghum bread as acceptably rated up to 20% sorghum flour within this formula family. Water was set according to farinograph analysis, and the bread formula also includes yeast, oil, sugar, and salt.",
      "limitations": [
        "The sorghum sample is from one HJ-513 grain lot and is milled through a 212 μm sieve; the result does not establish behavior for every commercial sorghum flour.",
        "All composite formulas include 10% rice flour. The study therefore tests a multi-flour reformulation, not sorghum as the only replacement for wheat flour.",
        "The comparator is described only as local-market refined wheat flour. Do not map it to all-purpose flour or another active wheat-flour reference.",
        "The flour proportions and sensory finding belong to one experimental yeasted-bread process with fixed added ingredients and farinograph-directed water; they are not a home-recipe replacement rule.",
        "No bundled recipe has matching sorghum-flour demand or the study's flour role, quantities, and method. No recipe-line link is supported."
      ],
      "sourceIds": [
        "WP02-A6-SORGHUM-FLOUR-SUB-R779-20261018-S01"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Sharanagat et al.'s untreated HJ-513 sorghum flour bread trial as one formula-scoped finding on the existing generic sorghum-flour row. The fixed rice-flour share, specific flour sample and process, and unidentified refined-wheat class do not support a reusable wheat-replacement rule. Preserve the existing measurement evidence and Westpoint finding; keep active catalog behavior and recipe links unchanged.",
      "sourceIds": [
        "WP02-A6-SORGHUM-FLOUR-SUB-R779-20261018-S01"
      ]
    }
  ]
}
```

The proposal intentionally omits `fromIngredientRefId`, `replacements`, and `ruleId`. Those fields would imply a cataloged source-flour match or a structured reusable replacement that the paper does not establish.

## Picker projection and recipe-corpus demand

No active reference name, alias, or form changes are proposed, so picker results are unchanged. A read-only projection using the current phrase-first search terms returns:

| Query | Current result | R779 effect |
|---|---|---|
| `sorghum flour` | Sorghum flour only | No change |
| `farine de sorgho` | Sorghum flour only | No change |
| `sorghum` | Grain sorghum, puffed sorghum, sorghum flour, sorghum grits, sorghum semolina, and sorghum starch | No change |

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. No file or row contains the target reference ID, sorghum wording, or the target's flour aliases. No bundled recipe demand, link, or edit is proposed.

## Ownership and review checks

- Confirmed the A6 parent checklist remains open, the sorghum-flour ledger row has only the existing Westpoint substitution finding, and no prior ledger decision records this primary study.
- Checked the new source ID, finding ID, PMC article URL, DOI, and proposal filename against the live ledger, plan, proposal archive, and batch archive. No prior owner or path collision was found.
- Confirmed current aliases, density, mappings, forms, package yields, active substitution rules, and recipe links for the target; none is changed.
- Reproduced current phrase-first picker results for `sorghum flour`, `farine de sorgho`, and `sorghum`; no active search data changes are proposed.
- Scanned all manifest-listed recipe files and ingredient rows; found no target reference or sorghum-related demand.
- This is proposal-only documentation. No software tests, build, emulator run, or deployment was performed.

This review advances one source-scoped question within WP02 Section A6. The broader A6 review remains open.
