# WP02 A6 R722 proposal: fonio-flour formula evidence — 2026-10-18

- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, generated file, or integration record was edited.
- **Open checklist:** Continue the broad A6 review of regional grain flours in [Section A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1810). This proposal reviews one evidence gap on the existing generic fonio-flour row.
- **Scope:** Review one primary study of white fonio flour in sugar cookies. Do not reopen the generic identity, Québec French display, or `acha flour` alias; do not infer a household measure or general replacement rule.
- **Proposal-local identifiers:** `WP02-A6-FONIO-SUB-R722-20261018-S01` and `fonio-flour-wheat-cookie-formula-r722-20261018`. These are examples for review only and are not allocated shared IDs.

## Bounded recommendation

Record one source-scoped experimental finding on `ingredient-ref-fonio-flour`: the study's eight-formula flour series includes a **50% wheat-flour / 50% white-fonio-flour composition** in one basic sugar-cookie formulation. The methods give the base recipe's flour amount as **75.5 g** (along with the other recipe quantities listed below) and express each formulation as percentages of its flour components, so the denominator is the flour-component blend, not the whole cookie dough. The publisher's full text does not say whether those component percentages are based on mass or volume. Preserve the reported 50/50 composition as formula-specific evidence; do not calculate component grams from 75.5 g or turn it into a transferable 1:1 rule. In the sensory results, the 50/50 formula and the 100% wheat control were highest: flavor ratings were 6.7 and 7.1, and overall-acceptability ratings were 6.5 and 6.9, respectively; the other six formulations scored below 6 for both measures.

If accepted, append one `SubstitutionFinding` and the source and decision below to the existing `ingredient-ref-fonio-flour` record. Set `substitutionResearchState` to `researched_supported`; leave `measurementState` as `not_yet_researched`. This evidence supports only the tested white-fonio/all-purpose-wheat sugar-cookie context. Keep all active substitution rules empty for fonio. No measurement observation, density, unit mapping, form, conversion, yield, recipe link, alias, or new reference is recommended.

The paper also reports that its formulation with 75% fonio and formulations combining fonio with unheated raw cowpea flour were among those below 6 for flavor and overall acceptability. This is an outcome for that study's tested formulations, not a general failure threshold for fonio baking or other recipes. The paper does not establish equivalent performance for black fonio, roasted or precooked fonio flour, bread, cakes, or arbitrary home recipes.

## Current ownership and prior decisions

| Surface | Current state | R722 recommendation |
|---|---|---|
| Active generic flour | `ingredient-ref-fonio-flour` is `fonio flour / farine de fonio`, category `FLOUR_AND_STARCH`, with `acha flour` as its sole English alias; density is null and unit mappings are empty. | Retain the identity and all names unchanged. |
| Species and adjacent products | Prior A6 review scoped the generic flour to food flour made from white fonio, *Digitaria exilis*. Black fonio and black-fonio flour remain separate; precooked and roasted fonio products also remain distinct or unresolved. | Use the study only because it names white fonio (*D. exilis*); do not transfer this result to black, roasted, or precooked products. |
| Research ledger | The generic flour row is `verified`; measurement and substitution research are both `not_yet_researched`, with no observations or findings. Existing identity sources and decisions remain on the record. | Append one new source and formula-specific finding. Keep measurement unreviewed and preserve all existing sources and decisions. |
| Forms and active data | No fonio form, substitution rule, contextual substitution rule, or package yield is present. `defaultDensity` is null and `unitMappings` is empty. | Add none. A ledger finding is evidence only and does not activate runtime behavior. |
| Recipe corpus | No bundled recipe currently links to either fonio-flour reference. | Add no recipe link or recipe change. |

The prior A6 identity and process-boundary reviews retain the generic `fonio flour / farine de fonio` row and its one `acha flour` alias. They did not review this cookie substitution finding. The more recent R616, R620, and R719 reviews concern roasted quinoa flour, sprouted amaranth flour, and generic quinoa-flour label measurement, respectively; none is reopened here. The broad A6 checklist remains open.

## Source-backed finding and limits

McWatters et al. studied sugar cookies made with white fonio (*Digitaria exilis*), cowpea, and plain all-purpose wheat flours. In the publisher-hosted full text, the method gives the basic formula as flour 75.5 g, granulated cane sugar 75.0 g, hydrogenated vegetable shortening 47.0 g, whole fresh egg 24.0 g, cream of tartar 1.6 g, baking soda 1.0 g, cinnamon 0.5 g, and salt 0.4 g. It lists eight flour-component formulations, including 50% wheat / 50% fonio. The results report that this 50/50 formulation and the 100% wheat control had the highest flavor and overall-acceptability ratings; the 50/50 formulation scored 6.7 for flavor and 6.5 for overall acceptability, versus 7.1 and 6.9 for the control. All other formulations scored below 6 on those measures. This supports recording one experimental formula, not a reusable substitute for wheat flour across recipes.

The publisher full text provides the base recipe quantities and the flour-component percentages, but does not state whether the component percentages are based on mass or volume. The proposal retains the reported flour-component share without calculating individual flour quantities from the 75.5 g base flour amount or turning it into a machine-ready unit ratio. The paper's 2003 test result is not a current commercial-product specification and does not establish ingredient behavior for different fonio species or processing.

### Source register and ownership audit

| ID | Source | What it directly supports and limits |
|---|---|---|
| **R722-S01, proposal-local** | McWatters, K. H. et al., [“Physical and sensory characteristics of sugar cookies containing mixtures of wheat, fonio (*Digitaria exilis*) and cowpea (*Vigna unguiculata*) flours”](https://academic.oup.com/ijfst/article/38/4/403/7911223), *International Journal of Food Science & Technology* 38(4), 403–410 (2003), DOI [10.1046/j.1365-2621.2003.00716.x](https://doi.org/10.1046/j.1365-2621.2003.00716.x). | Primary study; the publisher-hosted full text gives the basic recipe quantities and eight flour-component formulations (p. 404, “Cookie formula”), including the 50% wheat / 50% fonio composition. The same formula lists 75.5 g flour, 75.0 g sugar, 47.0 g shortening, 24.0 g egg, 1.6 g cream of tartar, 1.0 g baking soda, 0.5 g cinnamon, and 0.4 g salt. Sensory results (p. 407, sensory evaluation) report ratings for the 50/50 formulation and control; the component-percent mass-versus-volume basis is not stated. The result is not generalized to other dishes, species, processes, or flour brands. |

The proposed source ID has no owner in the current ledger. Neither the DOI URL nor the publisher article URL is currently registered as a ledger source, and the exact DOI/article title was not found in the current proposal/batch archive. The ID and finding ID above are proposal-local. Preserve the existing identity-source owners on `ingredient-ref-fonio-flour`; do not reuse or replace them.

## Bilingual names, alias collisions, and picker projection

The existing English and French displays remain `fonio flour` and `farine de fonio`; the English alias remains `acha flour`. The prior A6 wording decision is retained, including its stated independent Québec terminology-review limit. The new English-language study contributes no French label or alias evidence.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents/compatibility forms and prefers complete phrase matches before substring fallback. Current query projections, and R722 projections because it is ledger-only, are:

| Query | Current result | R722 result |
|---|---|---|
| `fonio flour` | Generic fonio flour and black fonio flour | Same two rows |
| `farine de fonio` | Generic fonio flour and black fonio flour | Same two rows |
| `acha flour` | Generic fonio flour | Same single row |
| `fonio` | Black fonio grain, black fonio flour, generic fonio flour, precooked fonio, and white fonio | Same five rows |
| `acha` | Generic fonio flour and white fonio | Same two rows |

The qualified flour phrases are already ambiguous across generic and black fonio flour because they occur inside both displayed names. No alias is added, so these existing results do not change. Do not add bare `acha` or use this study to collapse the two species-specific flour identities.

## Manifest-listed recipe scan

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. The reference IDs `ingredient-ref-fonio-flour` and `ingredient-ref-black-fonio-flour`, and the exact phrases `fonio flour`, `farine de fonio`, `fonio`, `fonio blanc`, and `fonio noir`, had no recipe-file or ingredient-row hits. There were also no exact `acha flour` ingredient hits. A substring-only `acha` scan finds two `sriracha sauce` ingredient lines; they are not fonio/acha references or demands. No bundled recipe supports a recipe-line link or substitution.

## Proposed research-ledger delta

This schema-shaped `Record` example contains only the proposed R722 addition. At integration, append its source, finding, and decision to the existing row, preserve prior evidence and identity decisions, update only `substitutionResearchState`, and leave the shared ingredient-reference, forms, rules, yield, and recipe files unchanged.

```json
{
  "recordId": "ingredient-ref-fonio-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-A6-FONIO-SUB-R722-20261018-S01",
      "url": "https://doi.org/10.1046/j.1365-2621.2003.00716.x",
      "title": "McWatters et al., Physical and sensory characteristics of sugar cookies containing mixtures of wheat, fonio (Digitaria exilis) and cowpea (Vigna unguiculata) flours",
      "versionOrDate": "2003",
      "accessedOn": "2026-10-18",
      "locator": "Publisher-hosted full text, p. 404, “Cookie formula” subsection (base recipe quantities and eight flour-component formulations); p. 407, sensory evaluation results and ratings; article conclusion.",
      "supports": "The full text lists the base formula as flour 75.5 g, granulated cane sugar 75.0 g, hydrogenated vegetable shortening 47.0 g, whole fresh egg 24.0 g, cream of tartar 1.6 g, baking soda 1.0 g, cinnamon 0.5 g, and salt 0.4 g; its eight flour-component formulations include 50% wheat / 50% fonio. Percentages are given for the flour components, but the text does not state whether those component shares are by mass or volume. The sensory results report flavor 6.7 and overall acceptability 6.5 for the 50/50 formulation, versus 7.1 and 6.9 for the 100% wheat control; the other six formulations scored below 6 on both measures. This single study does not establish a general substitution rule.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "fonio-flour-wheat-cookie-formula-r722-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-all-purpose-flour",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-fonio-flour",
          "quantity": {
            "amount": 0.5,
            "unit": "reported share of the flour-component blend; mass/volume basis unspecified"
          },
          "roleInCompound": "Fonio half of the tested wheat/fonio flour blend"
        }
      ],
      "context": "One basic sugar-cookie formulation using white fonio (Digitaria exilis) and plain all-purpose wheat flour; the method gives 75.5 g flour in the base recipe and lists 50% wheat / 50% fonio among eight flour-component formulations.",
      "basis": "The 0.5 share is the fonio fraction of the reported flour-component blend, not of total dough. Although the method gives 75.5 g flour for the base formula, it does not state whether component percentages are by mass or volume; do not calculate component grams or convert this study-specific share into a general ratio, recipe amount, or active runtime rule.",
      "expectedEffects": [
        "Among the tested formulations, the 50% wheat / 50% fonio cookie and the 100% wheat control had the highest flavor and overall-acceptability ratings; the 50/50 formula scored 6.7 and 6.5, respectively, versus 7.1 and 6.9 for the control."
      ],
      "limitations": [
        "One experimental basic sugar-cookie context only; do not generalize to other cookies, bread, cakes, or home recipes.",
        "The study names white fonio (Digitaria exilis); do not transfer the result to black fonio (Digitaria iburua), roasted fonio flour, precooked fonio flour, or uncharacterized products.",
        "The full text provides the base recipe quantities, including 75.5 g flour, but does not identify whether the flour-component percentages are based on mass or volume; do not derive component amounts.",
        "No active contextual or form-substitution rule is supported by this evidence record alone."
      ],
      "sourceIds": [
        "WP02-A6-FONIO-SUB-R722-20261018-S01"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record only the reported 50% fonio share of the flour-component blend and its measured outcome in one basic sugar-cookie study as formula-specific substitution evidence. Keep measurement research not yet done and add no active substitution rule or broader wheat-flour replacement claim.",
      "sourceIds": [
        "WP02-A6-FONIO-SUB-R722-20261018-S01"
      ]
    }
  ]
}
```

## Review checks

- [x] Read current `AGENTS.md`, the relevant `Requirements.md` conversion/substitution provisions, the open A6 checklist, recent A6 roadmap/workflow entries, live references/forms/rules/yields, the target ledger row, the research-ledger schema, and prior fonio/quinoa/amaranth proposals.
- [x] Verified the publisher-hosted full text and article conclusion online, including the p. 404 base formula and flour-component list and the p. 407 sensory results; retained the reported composition without inferring a mass-versus-volume basis.
- [x] Checked existing bilingual names, alias ownership, and picker projection against `IngredientSearch.kt`; no active naming or picker change is proposed.
- [x] Scanned all 114 manifest-listed recipe files / 1,123 ingredient rows for both flour IDs and exact fonio flour terms; found no linked or textual recipe demand.
- [x] Audited exact source ID and DOI/article URL ownership; R722 identifiers remain proposal-local.
- [x] Validated the proposed `Record` example against `research-ledger.schema.json`; verified UTF-8 without BOM and no mojibake.
- [x] No software tests, build, emulator, or deployment were run. This is a proposal-only review; the current `AGENTS.md` also exempts changes limited to database JSON additions from software testing.

The broader WP02 Section A6 review remains open.
