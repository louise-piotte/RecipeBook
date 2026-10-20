# WP02 A6 R761 — Black fonio flour substitution evidence — 2026-10-18

## Review record

- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, or generated file was edited.
- **Plan context:** The broad [WP02 A6 review](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838) remains open for buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours.
- **Target:** The existing `ingredient-ref-black-fonio-flour` row, `black fonio flour / farine de fonio noir`, for *Digitaria iburua*.
- **Exact open question:** Whether source evidence supports a recipe-ready replacement of wheat flour or another recipe flour with black-fonio flour. The existing row has no substitution finding and `substitutionResearchState: not_yet_researched`.
- **Review boundary:** This is a substitution-evidence review of black-fonio flour only. It does not change the already-reviewed Québec display, revisit the separate *D. exilis* white-fonio flour row, or assess measurement.
- **Proposal-local IDs:** `WP02-A6-BLACK-FONIO-SUB-R761-20261018-S01` and `WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02`; finding ID `black-fonio-flour-wheat-replacement-scope-blocked-r761-20261018`. Exact IDs and URLs were unowned in the ledger and proposal/batch archive before drafting.

## Recommendation

Update only the existing `ingredient-ref-black-fonio-flour` research-ledger record:

1. Set `substitutionResearchState` to `blocked_pending_evidence`.
2. Add the two primary-study sources below and one blocked source-scoped finding.
3. Add an accepted decision stating that the studies document flour blends and a general wheat-alternative claim, but do not give a recipe-specific replacement ratio or a transferable rule.

Keep the active reference, bilingual display, empty aliases, `defaultDensity: null`, and empty `unitMappings` unchanged. Leave `measurementState: not_yet_researched`. Add no `SubstitutionRule`, `ContextualSubstitutionRule`, replacement amount, recipe-line link, form, conversion, density, yield, or measure.

The 2024 article's abstract says fermented Acha and Iburu flour may provide an alternative to wheat flour in snack production. Its study measures flour properties after fermentation; it gives no snack formula, replacement percentage, or adjustment instructions. The 2020 study tests black-fonio/pigeon-pea flour blends and develops two blends into breakfast food, not as a replacement for a named ingredient in a recipe. These are useful boundaries for the ledger, but do not support an active replacement rule.

## Current target and prior-work boundary

The active reference is `ingredient-ref-black-fonio-flour`, category `FLOUR_AND_STARCH`, with no aliases, forms, density, or unit mappings. Its ledger row is identity-verified and currently has `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, and no substitution findings. Existing identity sources are Fall et al.'s *D. iburua* whole-grain flour study (`WP02-A6-BLACK-FONIO-FLOUR-20261011-S01`), Coda et al.'s Acha/Iburu flour study (`...-S02`), and TERMIUM Plus (`...-S03`); reuse these for identity and species context rather than duplicating their source entries.

The [2026-10-11 identity review](wp02-a6-black-fonio-flour-identity-review-20261011.md) established this flour as a separate *D. iburua* identity, and the [Québec wording review](wp02-black-fonio-flour-quebec-wording-review-20261011.md) retained `farine de fonio noir`. Neither made a substitution decision. The recent [R722 white-fonio study review](wp02-a6-next-open-gap-review-r722-20261018.md) concerns the different `ingredient-ref-fonio-flour` row scoped to *D. exilis*; its cookie result is not transferred to black fonio. R743 likewise addresses measurement on that white-fonio row. R755's Job's-tears measurement and R758's buckwheat substitution target different references and questions.

No form, global or contextual rule, or package-yield record references `ingredient-ref-black-fonio-flour`. The current global and contextual substitution files also contain no rule for this reference.

## Evidence and limits

- **Babarinde et al. (2020), Springer Nature.** The primary article studies fonio (*Digitaria iburua*) and pigeon-pea flour blends at reported fonio:pigeon-pea proportions of 100:0, 95:5, 90:10, 85:15, and 80:20. It develops the 100:0 and 80:20 blends into a breakfast food. This is a tested composite-flour formulation; it does not identify wheat or another recipe ingredient being replaced, provide an adaptation amount for an existing recipe, or establish an interchangeable flour ratio.
- **Malomo et al. (2024), Ife Journal of Technology.** The primary paper describes producing separate Acha (*D. exilis*) and Iburu (*D. iburua*) flours by steeping, drying, milling, and sieving. The abstract's statement that the flours may be an alternative to wheat for snack production does not report a snack formula or replacement proportion. Its reported property ranges combine the two flour types, so they are not used as species-specific substitution data.

The article contexts do not establish that all black-fonio flour has the same process or behavior. Do not transfer the 2020 fonio:pigeon-pea formula to wheat replacement, or the 2024 fermented-flour statement to unfermented commercial flour. Existing white-fonio findings are also not transferable across the species boundary.

## Proposed source entries

Append these sources to the existing `ingredient-ref-black-fonio-flour` ledger row. The IDs and exact URLs were checked against the current research ledger and proposal/batch archive; neither source is already registered.

| Source ID | Source and locator | Supported scope and limit |
|---|---|---|
| `WP02-A6-BLACK-FONIO-SUB-R761-20261018-S01` | Babarinde, G.O., Adeyanju, J.A., Ogunleye, K.Y., et al., [“Nutritional composition of gluten-free flour from blend of fonio (*Digitaria iburua*) and pigeon pea (*Cajanus cajan*) and its suitability for breakfast food”](https://link.springer.com/article/10.1007/s13197-020-04393-7), *Journal of Food Science and Technology* 57 (2020), 3611–3620. Accessed 2026-10-18. Locator: abstract, reported flour-blend proportions and breakfast-food formulation. | Primary study of black-fonio/pigeon-pea flour blends. Supports the tested blend compositions and breakfast-food context only; no wheat-flour replacement instruction or general recipe ratio is stated. Source kind: `other`. |
| `WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02` | Malomo et al., [“Studies On Microbiological Contents, Nutrient Composition and Functional Properties of Flour Produced from Fermented Acha (*Digitaria exilis*) And Iburu (*Digitaria iburua*)”](https://ijt.oauife.edu.ng/index.php/ijt/article/view/223), *Ife Journal of Technology* 29(1) (2024), 34–39. Accessed 2026-10-18. Locator: abstract and §§1–2; official PDF is linked from the article page. | Primary study of fermented Acha and Iburu flour. The abstract makes a general wheat-alternative statement for snack production, but the study reports no snack recipe or replacement proportion and does not separate all reported flour-property ranges by species. Source kind: `other`. |

## Exact proposed ledger delta

Preserve all current sources and identity decisions. Append the two source records above, then add:

```json
{
  "recordId": "ingredient-ref-black-fonio-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "substitutionFindings": [
    {
      "findingId": "black-fonio-flour-wheat-replacement-scope-blocked-r761-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "Using culinary flour made from black fonio (Digitaria iburua) to replace wheat flour or another recipe flour.",
      "basis": "Malomo et al. (2024) describe fermented Acha and Iburu flours and state broadly that they may be an alternative to wheat flour for snack production, but report no snack formula or replacement amount. Babarinde et al. (2020) test black-fonio/pigeon-pea flour blends and develop the 100:0 and 80:20 blends into breakfast food; this is composite-flour formulation evidence, not replacement of a named recipe ingredient.",
      "limitations": [
        "The 2024 wheat-alternative statement is not paired with a tested snack recipe, a replacement percentage, an identified base flour, or adjustment instructions.",
        "The 2020 article studies fonio and pigeon-pea blend proportions; it does not test substituting black-fonio flour for wheat in an existing formula.",
        "The 2024 study uses fermented flour and reports some property ranges for Acha and Iburu together; do not transfer those findings to unfermented flour or treat them as species-specific replacement evidence.",
        "Do not transfer the separate white-fonio (*Digitaria exilis*) sugar-cookie study to this *D. iburua* reference.",
        "No matching bundled recipe line supplies a role, amount, or method for a recipe-specific replacement."
      ],
      "sourceIds": [
        "WP02-A6-BLACK-FONIO-SUB-R761-20261018-S01",
        "WP02-A6-BLACK-FONIO-SUB-R761-20261018-S02"
      ]
    }
  ]
}
```

No `fromIngredientRefId` or `replacements` are proposed. The finding records why active substitution remains blocked; it does not imply that black-fonio flour is interchangeable with wheat or pigeon-pea flour.

## Picker projection and recipe-corpus demand

The current phrase-first ingredient search returns the following results for the relevant queries. Since R761 proposes no name or alias change, every result remains unchanged:

| Query | Current result | R761 effect |
|---|---|---|
| `black fonio flour` | Black fonio flour only | No change |
| `farine de fonio noir` | Black fonio flour only | No change |
| `black fonio`; `fonio noir` | Black fonio grain and black fonio flour | No change |
| `fonio` | Black fonio grain, black fonio flour, generic fonio flour, precooked fonio, and white fonio | No change |
| `farine de fonio` | Black fonio flour and generic fonio flour | No change |

The current bundled manifest lists **114 recipes** and **1,123 structured ingredient rows**. A read-only scan of all manifest-listed recipe JSON and ingredient rows found zero candidate-reference links or text hits for `black fonio flour`, `farine de fonio noir`, `iburu flour`, `Digitaria iburua`, `black fonio`, `fonio noir`, `iburu`, or `fonio`. There is no bundled-recipe demand, substitution role, method, or amount to link.

## Ownership and static checks

- Confirmed the target reference and ledger state, existing species-specific sources, and absence of forms, package yields, or active substitution rules for this row.
- Confirmed the new source IDs, finding ID, and exact Springer/Ife article URLs are unowned in the research ledger and proposal/batch archive. Reused identity sources remain attached to their existing ledger entries; no duplicate source records are proposed for them.
- Reviewed the A6 parent, the black-fonio identity and Québec wording reviews, R722 and R743 for white fonio, and the recent R755/R758 proposals. The target is the separate black-fonio flour row and the unresolved question is substitution evidence only.
- Projected current picker results from the active reference names and aliases; no picker change is proposed.
- Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows; found no candidate text or direct reference link.
- This proposal changes documentation only. No software tests, build, emulator run, or deployment were performed, consistent with `AGENTS.md` and the task instruction.

The proposed update would close only the research-state question for *D. iburua* black-fonio flour: preserve the available research as blocked evidence and keep active substitution behavior empty. The broader WP02 A6 review remains open.
