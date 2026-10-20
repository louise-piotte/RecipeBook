# WP02 A6 R770 — black-fonio flour measurement review — 2026-10-18

- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, recipe, or generated file was edited.
- **Checklist fit:** The broad [WP02 A6 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838) remains open. R761 recorded black-fonio flour substitution evidence and explicitly left measurement research open. R743 concerns the separate white-fonio flour row scoped to *Digitaria exilis*. R768 concerns Job’s-tears flour. The current plan, ledger, and proposal/batch archive contain no prior decision on measurement for `ingredient-ref-black-fonio-flour`.
- **Target and question:** Existing `ingredient-ref-black-fonio-flour`, `black fonio flour / farine de fonio noir`, for *Digitaria iburua*. Determine whether species-resolved primary measurement evidence supports a source-scoped observation.
- **Scope:** Measurement only. Do not change identity, Québec wording, aliases, forms, recipe links, substitution findings, or active substitution behavior.
- **Proposal-local IDs:** `black-fonio-flour-malomo-i3-fermented-iburu-bulk-density-r770-20261018` and `black-fonio-flour-malomo-i5-fermented-iburu-bulk-density-r770-20261018`. Both observation IDs and the proposal path were checked for prior ownership.

## Recommendation

Set the target ledger row’s `measurementState` to `researched_supported` and append two source-scoped `bulk_density` observations for the study’s 3-day and 5-day fermented Iburu flour samples. The full text identifies Iburu as *D. iburua* and reports the two values separately. Its method weighs a known amount of flour into a 50 mL measuring cylinder, taps the cylinder gently ten times from a 5 cm height, and records the occupied volume.

These are laboratory bulk-density observations for particular fermented study flours. Preserve each sample’s process and reported ± term without interpreting it as a standard deviation or standard error; the table does not define which statistic it represents. Do not turn the values into `defaultDensity`, a grams-per-cup measure, a unit mapping, or a claim about unfermented or retail black-fonio flour. Keep the active reference’s `defaultDensity: null` and empty `unitMappings`; add no form, yield, conversion, recipe link, or rule.

The article has one internal reporting conflict: its abstract gives the combined bulk-density range as 0.83–0.94 g/mL, while Table 2 and §3.5 both report Iburu I3 as 0.80 ± 0.03 and I5 as 0.83 ± 0.05 g/mL. Record the table/discussion values with this conflict and the undefined ± terms stated in the source and observation notes. Do not replace or average them with the abstract range.

## Current state and prior-work boundary

| Surface | Current state | R770 disposition |
|---|---|---|
| Active reference | `ingredient-ref-black-fonio-flour`, category `FLOUR_AND_STARCH`, no aliases, `defaultDensity: null`, empty `unitMappings`. | No catalog change. |
| Target ledger row | Identity `verified`; `measurementState: not_yet_researched`; `substitutionResearchState: blocked_pending_evidence`; no measurement observations; one R761 blocked substitution finding. | Set measurement state to `researched_supported`; append two observations and one measurement decision. Preserve the R761 state and finding. |
| Source ownership | Existing source `WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02` already owns the Ife Journal article page URL on this same ledger row. | Refresh this source entry in place to add its measurement locator and findings. Do not create another source ID for the article or its linked PDF. |
| Forms, rules, yields | No form, active global/contextual rule, or package-yield record references the target. | Add none. |

The article is Malomo, Bosrosti, and Fabiyi, “Studies On Microbiological Contents, Nutrient Composition and Functional Properties of Flour Produced from Fermented Acha (*Digitaria exilis*) And Iburu (*Digitaria iburua*),” *Ife Journal of Technology* 29(1) (2024), 34–39. The [journal article page](https://ijt.oauife.edu.ng/index.php/ijt/article/view/223) links the [publisher PDF](https://ijt.oauife.edu.ng/index.php/ijt/article/download/223/161/886); its PDF prints DOI [10.5281/zenodo.13682848](https://doi.org/10.5281/zenodo.13682848).

The full text’s §2.2 says the grains were purchased at Kaduna Central Market, soaked in water at 1:2 w/v for 3 or 5 days, rinsed and drained, dried at 50 °C for 8 hours, milled, and sieved through a stated 0.02 mm sieve. Section 2.5.3 describes the tapped-cylinder bulk-density method. Table 2 labels the flour samples I3 and I5 and reports the values below; §3.5 repeats that Iburu flour had densities of 0.80 and 0.83 g/mL on days 3 and 5. The study does not establish a household cup-fill method or a general density for commercial flour.

## Source ownership and proposed ledger delta

| Source ID | Current owner | R770 treatment |
|---|---|---|
| `WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02` | Existing source on `ingredient-ref-black-fonio-flour`; URL `https://ijt.oauife.edu.ng/index.php/ijt/article/view/223`. | Reuse the same ID and URL. Update `accessedOn` to `2026-10-18`, add §2.2, §2.5.3, Table 2, and §3.5 to the locator, and revise `supports` to include the two table/discussion values, the abstract range conflict, the undefined ± terms, and their fermented-study scope. Change `sourceKind` to `direct_measurement`. Keep the article page as the ledger URL; the linked PDF is the full-text locator, not a second source. |

Append the two observations below and one accepted decision to the existing ledger record. This is a partial delta: preserve all other sources, identity decisions, and the R761 substitution finding.

```json
{
  "recordId": "ingredient-ref-black-fonio-flour",
  "measurementState": "researched_supported",
  "measurementObservations": [
    {
      "observationId": "black-fonio-flour-malomo-i3-fermented-iburu-bulk-density-r770-20261018",
      "relationship": "bulk_density",
      "value": 0.80,
      "valueUnit": "g/mL",
      "foodDescription": "I3 fermented Iburu flour (Digitaria iburua) prepared from market-purchased grain.",
      "foodState": "Grain steeped for 3 days in water at 1:2 w/v, rinsed and drained, dried at 50 °C for 8 hours, milled, and sieved through the study’s stated 0.02 mm sieve.",
      "measurementMethod": "Known amount weighed into a 50 mL measuring cylinder; cylinder tapped gently 10 times from 5 cm; occupied volume recorded. Table 2 reports 0.80 ± 0.03 g/mL; the article does not define the ± statistic. §3.5 repeats 0.80 g/mL; the abstract’s combined range begins at 0.83 g/mL and conflicts with this value.",
      "quantityBasis": "Source-specific bulk density for the study’s 3-day fermented Iburu flour only. Not a retail-product value, household cup-fill convention, reusable cup mass, or default density.",
      "evidenceKind": "measured",
      "sourceIds": ["WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02"]
    },
    {
      "observationId": "black-fonio-flour-malomo-i5-fermented-iburu-bulk-density-r770-20261018",
      "relationship": "bulk_density",
      "value": 0.83,
      "valueUnit": "g/mL",
      "foodDescription": "I5 fermented Iburu flour (Digitaria iburua) prepared from market-purchased grain.",
      "foodState": "Grain steeped for 5 days in water at 1:2 w/v, rinsed and drained, dried at 50 °C for 8 hours, milled, and sieved through the study’s stated 0.02 mm sieve.",
      "measurementMethod": "Known amount weighed into a 50 mL measuring cylinder; cylinder tapped gently 10 times from 5 cm; occupied volume recorded. Table 2 reports 0.83 ± 0.05 g/mL; §3.5 repeats 0.83 g/mL.",
      "quantityBasis": "Source-specific bulk density for the study’s 5-day fermented Iburu flour only. Not a retail-product value, household cup-fill convention, reusable cup mass, or default density.",
      "evidenceKind": "measured",
      "sourceIds": ["WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Malomo et al.’s Table 2 and §3.5 bulk-density values for 3-day and 5-day fermented Iburu flour as separate source-scoped observations. The table and discussion report 0.80 ± 0.03 and 0.83 ± 0.05 g/mL but do not define the ± statistic; the abstract’s 0.83–0.94 g/mL range conflicts with the I3 value. Retain both limits in the evidence record. These laboratory results do not establish a retail flour default density or household measure. Keep defaultDensity null and unitMappings empty.",
      "sourceIds": ["WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02"]
    }
  ]
}
```

No source ID or URL is added. Preserve the existing substitution status and finding; this measurement decision makes no replacement recommendation.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches current reference names and aliases plus attached form terms. Since R770 changes no picker data, current results stay the same:

| Query | Current result | R770 effect |
|---|---|---|
| `black fonio flour` | Black fonio flour | No change |
| `farine de fonio noir` | Black fonio flour | No change |
| `fonio noir` | Black fonio grain; black fonio flour | No change |
| `fonio flour` | Black fonio flour; generic fonio flour | No change |
| `fonio` | Black fonio grain; black fonio flour; generic fonio flour; precooked fonio; white fonio | No change |
| `iburu flour` | No result | No change |

## Recipe-corpus scan

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. No file or ingredient row matched the target reference ID or the phrases `black fonio flour`, `farine de fonio noir`, `iburu flour`, `Digitaria iburua`, `fonio noir`, or `black fonio`. No bundled recipe supplies a measure, portion, preparation context, or reason to create a recipe link.

## Review checks

- Confirmed R761’s accepted blocked substitution finding and open measurement status, the separate R743 white-fonio measurement review, and the distinct R768 Job’s-tears review. No previous decision for this black-fonio flour measurement question was found.
- Verified the primary journal page and full-text PDF. Checked the sample identity and process in §2.2, the method in §2.5.3, and the reported values and abstract inconsistency in Table 2 and §3.5.
- Confirmed source ID and article URL ownership on the target row. The proposal reuses the existing source; the new observation IDs and proposal path are unique.
- Recomputed picker phrase results from current names, aliases, forms, and `IngredientSearch.kt`; no picker change is proposed.
- Scanned every manifest-listed recipe and ingredient row; found no candidate text or direct reference link.
- Static document/data checks only. No software tests, build, emulator run, or deployment were performed.

This proposal closes only the black-fonio flour measurement evidence question. The broader WP02 A6 review remains open.
