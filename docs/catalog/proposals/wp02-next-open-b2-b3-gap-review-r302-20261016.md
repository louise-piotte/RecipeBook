# WP02 Section 04 B2 R302 — Green lentil flour measurement and substitution review

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal-only. This subtask changed only this proposal file. No shared catalog JSON, research ledger, plan, roadmap, generated index, recipe, or application file was changed by this review. No software tests, build, or emulator run was performed.
- **Checklist fit:** WP02 Section 04 B2, “Alternative flours starches and regional starch products,” specifically the existing `green lentil flour / farine de lentilles vertes` identity. This closes only its open measurement and substitution research states; it does not close the B2 parent. The relevant plan rows are in [Section 04 B2](../../RecipeBook-global-ingredient-catalog-plan.txt#L2361) and the identity integration note at [the green-lentil-flour checklist entry](../../RecipeBook-global-ingredient-catalog-plan.txt#L2521).
- **Candidate:** `ingredient-ref-green-lentil-flour`, `green lentil flour / farine de lentilles vertes`, category `FLOUR_AND_STARCH`.
- **Prior-work boundary:** The accepted identity review added the row with no aliases, measures, forms, or substitutions. The existing ledger entry has identity `verified`, while measurement and substitution research remain `not_yet_researched`. The nearby red-, yellow-, and black-lentil flour reviews concern separate unresolved identities or picker boundaries; this proposal does not reopen them. No focused green-lentil-flour measurement/substitution proposal or integration was found.
- **Proposed new source-ID prefix:** `WP02-B2-GREEN-LENTIL-FLOUR-MEASURE-SUBSTITUTION-R302-20261016-S`. S01–S04 were checked against the current ledger and proposal/batch archive; no ownership collision was found. Existing identity source IDs remain in place.

## Decision recommendation

Keep the active ingredient reference unchanged. Update only its ledger research states and add source-scoped formula findings:

1. Set `measurementState` to `researched_no_supported_value`. The current Canadian product finder lists the Québec mill’s 10 kg and 20 kg packages, but the reviewed product and research sources provide no household serving, cup-to-mass pair, or product-matched bulk density. Package weights and laboratory blend percentages are not kitchen measures. Add no measurement observation, `defaultDensity`, or `unitMapping`. [S01–S02]
2. Set `substitutionResearchState` to `researched_supported` and record the tested green-lentil/wheat bread blend as formulation-specific evidence. One study describes an 80:20 wheat-flour/green-lentil-flour blend made with whole-seed green lentil flour; a companion study tests 10 and 20 g/100 g green lentil flour in bread and reports changes in colour, structure, and digestibility. These study conditions support no household wheat-replacement rule or universal ratio. [S03–S04]
3. Preserve empty alias arrays, empty unit mappings, null density, and the absence of ingredient forms, recipe links, yields, conversions, and active global/contextual substitution rules. The bundle has no recipe demand for this flour.

The Québec manufacturer’s earlier product pages remain identity evidence. Their product naming does not establish a standard kitchen portion or a transferable substitution instruction. The active row’s bilingual display and picker ownership need no change for this research batch.

## Measurement evidence

| Evidence | Supported observation | Limit |
|---|---|---|
| Celiac Canada’s current Canadian GF Product Finder lists La Minoterie des Anciens’ `Farine de lentilles vertes biologique` in 10 kg and 20 kg packages, with separate GTINs. | Confirms current listed package amounts for this named product. | Package amounts are not servings or household-volume equivalents. The directory supplies no cup weight, density, or recipe amount. [S01] |
| Guldiken et al. compare green-lentil and yellow-pea flour streams from different milling techniques. The abstract reports differences in particle-size distribution and other flour characteristics across streams/milling methods. | Shows why a study or mill specification cannot by itself stand in for a universal kitchen conversion. | This is milling research, not a household measure study; it reports no cup mass or retail package conversion. [S02] |

No reviewed source provides a product-matched green-lentil-flour cup weight or a controlled bulk-density measurement. Keep measurement research closed as “no supported value” unless a current product label or controlled household-scale measurement supplies that evidence.

## Substitution evidence and boundary

| Source | Bounded finding | Limit |
|---|---|---|
| Gallo et al., *LWT* (2022), green-lentil-flour wheat-bread study. | The study examines bread formulations with 0, 10, and 20 g lentil flour per 100 g; its abstract identifies green lentil flour and reports darker, more compact bread structure at higher inclusion, with higher density/lower gas-bubble area and changes to protein, free glucose, and starch-digestibility outcomes. [S03] | Experimental bread formulations and particular flour/process samples; the reported percentages are not an equal-volume replacement instruction or a general recommended rate. |
| Gallo et al., *Food Structure* (2022), fixed-blend green-lentil-flour bread study. | The publisher’s article record describes an 80% wheat flour / 20% green lentil flour blend, sourced from producers and made by grinding whole green seeds and sieving below 300 μm. At that 20% inclusion, proof times of 60, 105, and 150 minutes changed moisture, weight loss, colour, crumb compactness, and compression behavior. [S04] | One Italian flour and a defined bread process; outcomes vary with proof time. The paper does not establish a general substitution ratio for other bread formulas, pastries, pancakes, soups, or sauces. The publisher page returned 403 during direct retrieval; its indexed article text and the accessible University of Naples repository abstract were checked. |

These are useful research-ledger findings, not runtime advice. Do not activate a global substitution or contextual recipe rule. The flour’s percentage in an experimental wheat-bread formula is not a safe default for an arbitrary recipe, and the studies do not address the bundled recipes.

## Proposed ledger disposition

| Field | Proposed value | Limit |
|---|---|---|
| `measurementState` | `researched_no_supported_value` | No volume-to-mass value or density supported for the active identity. Add no `measurementObservations`. |
| `substitutionResearchState` | `researched_supported` | Add two bounded bread-formulation findings, tied to their reported flour blend and method. |
| Active reference | No change | Preserve `nameEn`, `nameFr`, empty aliases, null `defaultDensity`, and empty `unitMappings`. |
| Forms and recipe links | No change | No form or bundled recipe line is linked to this flour. |
| Runtime substitutions | No change | Add no global or contextual rule. |

Suggested ledger finding shape, for review only:

```json
{
  "findingId": "green-lentil-flour-wheat-bread-formulation-r302",
  "researchState": "researched_supported",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-green-lentil-flour",
      "roleInCompound": "Study-specific component in an 80% wheat / 20% green-lentil flour bread blend"
    }
  ],
  "context": "Experimental wheat bread using producer-sourced green lentil flour milled from whole, non-decorticated green seeds and sieved below 300 μm; proofing tested at 60, 105, and 150 minutes.",
  "basis": "Gallo et al. report that proof time changed moisture, weight loss, crumb colour and structure, and mechanical behavior in the 20% green-lentil-flour bread.",
  "expectedEffects": [
    "The tested blend and proof schedule affected crumb compactness, colour, moisture, and compression behavior."
  ],
  "limitations": [
    "One flour product, particle-size preparation, and experimental wheat-bread process; do not generalize as a household replacement ratio or apply to other dish types."
  ],
  "sourceIds": [
    "WP02-B2-GREEN-LENTIL-FLOUR-MEASURE-SUBSTITUTION-R302-20261016-S04"
  ]
}
```

The companion *LWT* result can be recorded separately with its own 10/20 g per 100 g study basis and source ID S03. Do not convert either study blend into an ingredient `unitMapping` or active substitution rule.

## Read-only catalog, picker, and corpus audit

The final read-only snapshot has 1,671 active ingredient references, 127 forms, 2,018 research-ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows. The active row is exactly `green lentil flour / farine de lentilles vertes`, with empty alias arrays, null `defaultDensity`, and no unit mappings. No form is attached to `ingredient-ref-green-lentil-flour`; its ledger has only the two earlier identity sources and one accepted identity decision, with no measurement observations or substitution findings. No matching phrase or ingredient-reference ID was found in the legacy-import identity file, bundled recipe files, or active rule records.

Static picker boundary checks used the current phrase-first, accent-folding search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L1):

| Query | Current result | Boundary note |
|---|---|---|
| `green lentil flour` / `farine de lentilles vertes` | `ingredient-ref-green-lentil-flour` only | Correct qualified identity owner. |
| `lentil flour` / `farine de lentilles` | `ingredient-ref-green-lentil-flour` only | The existing green-flour row is the only current active lentil-flour identity. Separate yellow/red candidate reviews remain distinct and unchanged. |
| `green lentil` | `ingredient-ref-green-lentil-flour` only | Existing singular query resolves to flour because the phrase is contained in its display. |
| `green lentils` | `ingredient-ref-green-lentils` and `ingredient-ref-french-green-lentils` | The English plural query returns both whole-seed identities. |
| `lentilles vertes` | `ingredient-ref-french-green-lentils`, `ingredient-ref-green-lentils`, and `ingredient-ref-green-lentil-flour` | Existing French phrase is broad across three identities. |

The singular/plural and French broad-query behavior is a pre-existing picker boundary issue. This research proposal adds no alias and changes no display; a separate search-boundary review should address it if the bare singular `green lentil` query needs whole-seed results. Current specific flour queries remain unambiguous.

The recipe corpus was checked for both names and the ID; no hit or linked line was found. There is no recipe-grounded substitution or reason to add a recipe link.

## Unresolved limits

- No current Québec retail or mill source reviewed here supplies a household cup measure or measured bulk density for green lentil flour. The 10 kg and 20 kg package listings do not resolve that gap.
- The Canadian milling study documents process-dependent flour properties, while the bread studies are experimental and tied to their flour streams, particle size, formula, and proof schedule.
- No source establishes a transferable percentage for substituting green lentil flour in general baking. Do not infer that the 20% study blend works for other breads or recipes.
- The existing `green lentil` singular query returns the flour, while the plural query returns whole lentils. That picker issue is noted but not changed here.
- The bundle contains no matching recipe demand.

## Evidence register

Sources were reviewed online on 2026-10-16. Existing identity source IDs I01–I02 are already owned by `ingredient-ref-green-lentil-flour`; new R302 source IDs S01–S04 were checked against the current research ledger and proposal/batch archive and were unused.

| ID | Source and direct support | Limit |
|---|---|---|
| **I01 — `WP02-B23-FLOUR-RESIDUAL-20261010-S03`** | Aliments du Québec, [Farine de lentilles vertes biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-lentilles-vertes-biologique). Supports the local French product wording and product attribution to La Minoterie des Anciens / Pure Gaspésie. | Identity and product title only; no household measure. |
| **I02 — `WP02-B23-FLOUR-RESIDUAL-20261010-S04`** | La Minoterie des Anciens, [Organic green lentil flour](https://www.laminoteriedesanciens.com/en/products/flour/organic-green-lentil-flour). Supports the Québec mill’s English product wording. | Product page supplies no transferable measurement or substitution ratio. Direct page retrieval timed out during this recheck; the existing ledger source was retained as identity evidence. |
| **S01 — `WP02-B2-GREEN-LENTIL-FLOUR-MEASURE-SUBSTITUTION-R302-20261016-S01`** | Celiac Canada, [GF Product Finder](https://www.celiac.ca/gf-product-finder/), current La Minoterie des Anciens listings at lines 3041–3042: `Farine de lentilles vertes biologique`, 10 kg and 20 kg, with separate GTINs. | Listed package amounts are not recipe portions or household-volume conversions. |
| **S02 — `WP02-B2-GREEN-LENTIL-FLOUR-MEASURE-SUBSTITUTION-R302-20261016-S02`** | Guldiken et al., [Impact of milling on the functional and physicochemical properties of green lentil and yellow pea flours](https://doi.org/10.1002/cche.10504), *Cereal Chemistry* 99 (2022), 218–229. Canadian university and grain-research coauthors; the abstract compares milling techniques and reports changes in particle distribution and flour characteristics. | Technical milling study; not a household measure study or product-matched recipe test. |
| **S03 — `WP02-B2-GREEN-LENTIL-FLOUR-MEASURE-SUBSTITUTION-R302-20261016-S03`** | Gallo et al., [Physicochemical properties, structure and digestibility in simulated gastrointestinal environment of bread added with green lentil flour](https://www.sciencedirect.com/science/article/pii/S0023643821018661), *LWT* 154 (2022), 112713. Reports bread formulations with 0, 10, and 20 g/100 g lentil flour; identifies green lentil flour and describes darker, more compact bread structure and composition/digestibility changes. | Experimental bread formula; no household substitution guidance or measure. |
| **S04 — `WP02-B2-GREEN-LENTIL-FLOUR-MEASURE-SUBSTITUTION-R302-20261016-S04`** | Gallo et al., [Properties and in vitro digestibility of a bread enriched with lentil flour at different leavening times](https://www.sciencedirect.com/science/article/pii/S2213329122000338), *Food Structure* 33 (2022), 100284. The publisher’s article record gives the 80% wheat / 20% green-lentil flour blend, whole-seed flour preparation, and proof-time comparison. The University of Naples [research record](https://www.iris.unina.it/handle/11588/887983) confirms the citation and accessible abstract. DOI [10.1016/j.foostr.2022.100284](https://doi.org/10.1016/j.foostr.2022.100284). | The publisher page returned 403 during direct retrieval; the article search result and University of Naples repository record were checked. One specified research blend and process; no general replacement rule. |

## Static review only

Read-only review covered `AGENTS.md`, the WP02 Section 04 B2 plan section, current references and forms, the ledger record and schema context, roadmap, nearby proposals and batch notes, current phrase-first picker code, legacy identity entries, recipe manifest and files, and the active substitution records. No software tests, build, or emulator run was performed, as instructed for this proposal-only task. No file outside this proposal was changed.
