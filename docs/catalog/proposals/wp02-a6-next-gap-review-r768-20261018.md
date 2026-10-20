# WP02 Section A6 R768 — Job’s-tears flour formula-specific substitution evidence — 2026-10-18

## Review record

- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, or generated file was edited.
- **Open checklist:** Continue the A6 regional and specialty grain-flour review in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1855).
- **Target:** Existing `ingredient-ref-jobs-tears-flour`, `Job’s tears flour / farine de larmes de Job`, category `FLOUR_AND_STARCH`.
- **Exact open question:** What does the existing primary study support about using Job’s-tears flour in its tested foods, and can those results support reusable substitution behavior?
- **Proposal-local finding IDs:** `jobs-tears-flour-watanabe-cookie-formulas-r768-20261018` and `jobs-tears-flour-watanabe-crepe-formula-r768-20261018`. Both were unallocated in the live ledger and proposal/batch archive. The output path is also unallocated.

## Prior-decision and scope audit

The current ledger row is identity-verified, has `measurementState: researched_no_supported_value`, `substitutionResearchState: not_yet_researched`, and no substitution findings. It has no form, default density, unit mapping, global rule, contextual rule, or package yield. [R755](wp02-a6-next-gap-review-r755-20261018.md) recorded a Greenmax-Adlay beverage amount only as a named-product observation and explicitly left substitution research unreviewed. Its measurement conclusion and observation remain out of scope here.

The older [A6 identity review](wp02-a6-regional-grain-flour-gaps-20261010.md) cites the Watanabe article for the existence of Job’s-tears flour, but does not review its tested formulas or make a substitution finding. Recent A6 substitution reviews address generic buckwheat ([R758](wp02-a6-next-gap-review-r758-20261018.md)), black fonio ([R761](wp02-a6-next-gap-review-r761-20261018.md)), and ivory teff ([R764](wp02-a6-next-gap-review-r764-20261018.md)); the related [R764–R766 checkpoint](../batches/wp02-wp03-wp04-r764-r766-gap-review-integration-20261018/README.md) covers a cereal family and lake-whitefish form in its other two reviews. None decides how the Watanabe formulas should be recorded for this target. R755 is the only focused Job’s-tears follow-up and concerns measurement, not substitution.

## Recommendation

Update only the existing `ingredient-ref-jobs-tears-flour` ledger record:

1. Set `substitutionResearchState` to `researched_supported` because Watanabe et al. directly test Job’s-tears flour in named cookie and crepe formulas that replace the wheat-flour control.
2. Refresh the existing article source `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10` in place with a current access date and full-text locator. Do not register another source for the same article or a separate duplicate PDF URL.
3. Add two `researched_supported` findings, one for the cookie formulas and one for the crepe formula, each restricted to the exact study context and outcomes below.
4. Append one accepted decision preserving the boundary between directly tested formulas and reusable home-recipe guidance.

The study material is a refined flour from the Aki Shizuku cultivar grown in Oyama, Tochigi, milled through a 100 μm screen. The comparator is Nisshin “Flower,” identified in the article methods as `薄力小麦粉` (thin/weak wheat flour). Map the comparator in both findings to the active `ingredient-ref-japanese-weak-wheat-flour` through `fromIngredientRefId`: the Japanese Ministry of Agriculture, Forestry and Fisheries describes the corresponding `薄力粉` class as lower in gluten and soft, and that reference already owns this authoritative source as `WP02-JSF-20261011-S01`. This is a class-level link only. It does not assert that Nisshin Flower is the same product as Nisshin Violet, or that either is equivalent to generic cake flour, pastry flour, or every wheat flour.

In the crepe trial, 25 g of either wheat flour or Job’s-tears flour is used in the same fixed formula with egg, milk, sugar, and butter. Job’s-tears crepes were easier to fracture and less preferred than the wheat-flour crepes; the paper reports that a 30-minute batter rest made the Job’s-tears batter easier to prepare. In the cookie trial, the paper compares a 100 g wheat-flour control with a 50:50 blend (50 g of each flour), a 100% Job’s-tears-flour formula, and a 100% Job’s-tears formula that replaces some added water with additional butter. The 50% cookie had preference ratings similar to the control. The unmodified 100% Job’s-tears cookie was smaller, harder, and less preferred; the butter-adjusted 100% formula improved acceptance.

These are **supported source-scoped findings**, not a general substitution recommendation. The direct tests justify recording the exact trials and outcomes; they do not establish that other Job’s-tears flours, other milling processes, or other recipes will behave similarly. Keep all tested amounts in the research finding text. Add no `SubstitutionRule`, `ContextualSubstitutionRule`, recipe-line substitution, recipe link, form, density, unit mapping, conversion, yield, or alias. Do not infer a general 1.5× water adjustment from the separate dough-consistency experiment or abstract.

## Source ownership and evidence

| Source ID | Owner, locator, and scope |
|---|---|
| **Existing `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10` — reuse in place** | Watanabe, Kobayashi (Awatsuhara), and Nagao, [“A Study on the Adaptability of Job’s Tears Flour as a Substitute for Wheat Flour in Prepared Food Products”](https://www.jstage.jst.go.jp/article/cookeryscience/49/2/49_128/_article/-char/en), *Journal of Cookery Science of Japan* 49(2) (2016), 128–137, DOI 10.11402/cookeryscience.49.128. Accessed 2026-10-18. Locator: full-text PDF linked from the existing J-STAGE article page, pp. 1–2 (materials and formulas, including cookie Table 1) and pp. 5–7 (physical and sensory results). The primary study supports only the specified Aki Shizuku flour sample, comparator, formulas, and reported outcomes; it does not validate a reusable household substitution range. |

The article landing-page URL and source ID are already owned by the target ledger row; update that record’s `accessedOn`, `locator`, and `supports` fields in place. The PDF is the full-text location for this same article, not a second source. Its separate PDF URL and DOI URL are not source records in the ledger and are not proposed as new source entries. The R768 finding IDs and output path are new and unique; no new source ID or ledger source URL is proposed.

## Proposed ledger delta

Preserve the current identity and measurement decisions, source list, and R755 product-specific observation. Refresh S10 as above, then append these findings and the decision:

```json
{
  "recordId": "ingredient-ref-jobs-tears-flour",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10",
      "url": "https://www.jstage.jst.go.jp/article/cookeryscience/49/2/49_128/_article/-char/en",
      "title": "Watanabe et al., A Study on the Adaptability of Job's Tears Flour as a Substitute for Wheat Flour in Prepared Food Products",
      "versionOrDate": "2016",
      "accessedOn": "2026-10-18",
      "locator": "Full-text PDF linked from the article page, pp. 1-2 (flour materials and cookie/crepe formulas, including Table 1) and pp. 5-7 (physical and sensory results).",
      "supports": "The primary study tests refined flour from Aki Shizuku Job's tears grown in Oyama, Tochigi and milled through a 100 μm screen against Nisshin Flower wheat flour, identified as 薄力小麦粉 (Japanese weak wheat flour). It reports exact cookie and crepe formulas: 50% flour replacement in one cookie blend, 100% Job's-tears flour in separate cookie and crepe formulas, and a butter-adjusted all-Job's-tears cookie. Outcomes vary by formula. This supports only those study materials, formulas, and results, not a general home-recipe substitution range.",
      "sourceKind": "culinary_reference"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "jobs-tears-flour-watanabe-cookie-formulas-r768-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-japanese-weak-wheat-flour",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-jobs-tears-flour"
        }
      ],
      "context": "Watanabe et al.'s cookie trials only: a 100 g flour control made with Nisshin Flower wheat flour (`薄力小麦粉`, Japanese weak wheat flour); a 100 g flour blend of 50 g wheat flour plus 50 g Job's-tears flour; a 100 g all-Job's-tears-flour formula; and a separate all-Job's-tears formula with additional butter replacing part of the added water.",
      "basis": "The 50% Job's-tears-flour cookie received preference ratings similar to the wheat-flour control. The unmodified 100% Job's-tears-flour cookie was significantly smaller in volume, harder, and less preferred. In a second formula, the authors used 100 g Job's-tears flour, 46.4 g butter, and 11.5 g added water (compared with 30 g butter and 23 g added water in the unmodified 100% formula); its overall acceptance was similar to the control, with improved hardness preference. These are distinct tested formulas, not one scalable replacement rule.",
      "expectedEffects": [
        "Within the study's 50% cookie formula, preference ratings were similar to the wheat-flour control.",
        "Within the study's unmodified 100% formula, cookies were smaller, harder, and less preferred.",
        "Within the study's butter-adjusted 100% formula, acceptance improved compared with the unmodified 100% formula."
      ],
      "limitations": [
        "The study uses one refined Aki Shizuku flour sample from Oyama, Tochigi, milled through a 100 μm screen; the results do not establish behavior for all Job's-tears flours or milling processes.",
        "The comparator is Nisshin Flower `薄力小麦粉`, linked at the Japanese weak-wheat class level. Do not describe the result as guidance for generic cake flour, all-purpose flour, or every wheat-flour class.",
        "The cookie ingredient quantities and water/butter adjustment belong only to the tested formulas. Do not turn 50% or 100% into a reusable recipe recommendation or runtime rule.",
        "Sensory results came from 50 female university students with a mean age of 20; they are not a broad consumer-preference study.",
        "No bundled recipe supplies demand, a matching cookie role, or a line to link to these trial formulas."
      ],
      "sourceIds": [
        "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10"
      ]
    },
    {
      "findingId": "jobs-tears-flour-watanabe-crepe-formula-r768-20261018",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-japanese-weak-wheat-flour",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-jobs-tears-flour"
        }
      ],
      "context": "Watanabe et al.'s single crepe formula only: 25.0 g of either Nisshin Flower wheat flour (`薄力小麦粉`, Japanese weak wheat flour) or refined Job's-tears flour, with 25.0 g egg, 83.7 g milk, 7.5 g sugar, and 3.7 g butter. Batters were rested for 0, 30, 60, 90, or 120 minutes and cooked on a 160°C hot plate for 3 minutes per side.",
      "basis": "The same 25.0 g flour amount was used for either flour in this fixed crepe formula. Across the tested batter-rest times, Job's-tears crepes had significantly lower fracture stress than wheat-flour crepes and were less preferred. A 30-minute Job's-tears batter rest was reported as easier to prepare; this describes the study batter, not a general resting instruction.",
      "expectedEffects": [
        "The tested Job's-tears crepes were easier to fracture than the wheat-flour crepes.",
        "The tested Job's-tears crepes had lower preference ratings than the wheat-flour control."
      ],
      "limitations": [
        "This is one fixed crepe formula using 25.0 g of one refined Aki Shizuku flour sample from Oyama, Tochigi, milled through a 100 μm screen.",
        "The comparator is Nisshin Flower `薄力小麦粉`, linked at the Japanese weak-wheat class level; do not generalize to generic cake flour or other wheat-flour classes.",
        "The 25.0 g amount and 30-minute batter observation are not a reusable measure or recipe substitution instruction.",
        "Sensory results came from 50 female university students with a mean age of 20.",
        "No bundled recipe supplies demand, a matching crepe role, or a line to link to the study formula."
      ],
      "sourceIds": [
        "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Watanabe et al.'s direct cookie and crepe substitution trials as two supported, formula-scoped findings on the existing Job's-tears-flour ledger record. Set each finding's fromIngredientRefId to the active Japanese weak-wheat-flour reference because the paper identifies Nisshin Flower as 薄力小麦粉 and the existing MAFF source on that reference defines the 薄力粉 class; this is not a product equivalence or generic cake-flour crosswalk. Retain the tested flour, formulas, and outcomes without transfer to generic home recipes. Keep the R755 named-product measurement observation and researched_no_supported_value measurement state unchanged. Add no active substitution rule, recipe-line link, recipe link, form, measure, density, unit mapping, conversion, yield, or alias.",
      "sourceIds": [
        "WP02-A6-GRAIN-FLOUR-GAPS-20261010-S10"
      ]
    }
  ]
}
```

This delta adds research findings only. The substitution state records that direct formula evidence exists, while active substitution behavior remains empty.

## Picker projection

The proposal changes no reference name, alias, or form, so the picker is unchanged. A static projection of the current phrase-first ingredient search gives:

| Query | Current and projected result |
|---|---|
| `Job’s tears flour` / `farine de larmes de Job` | Job’s tears flour only |
| `Job’s tears` | Job’s tears grain and Job’s tears flour |
| `adlay` | Job’s tears grain only |
| `adlay flour` / `Coix flour` | No result |

## Bundled recipe-corpus demand

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows** for the target reference ID and Job’s-tears flour terms, including its French display, adlay flour/powder, and Coix flour. The scan found **0 matching files, 0 ingredient-row matches, and 0 direct reference-ID links**. There is no bundled recipe role, method, or amount to link to the study.

## Ownership and static checks

- Confirmed the target reference, the R755 ledger update, the empty current substitution findings, and the absence of forms or active substitution rules for this reference.
- Confirmed the article source ID and landing-page URL are already owned by the target ledger record. The PDF and DOI are publication access metadata only and are not proposed as additional ledger sources. The two R768 finding IDs and proposal path have no prior owner in the live ledger or proposal/batch archive.
- Verified the paper's exact comparator term (`薄力小麦粉`, Nisshin Flower) against the active `ingredient-ref-japanese-weak-wheat-flour` identity and its existing MAFF source `WP02-JSF-20261011-S01`. Both findings use that reference as the comparator class; no source is copied to the Job's-tears record, and no product equivalence, generic flour crosswalk, or picker alias is proposed.
- Reviewed the open A6 checklist, the 2026-10-10 identity packet, R755, R758, R761, and R764–R766. No earlier focused substitution decision exists for Job’s-tears flour.
- Reproduced the current phrase-first search over active ingredient-reference names and aliases; all four relevant query results are unchanged.
- Scanned the manifest-listed recipe files and structured ingredient rows; found no recipe demand or direct reference link.
- Proposal-local static checks: UTF-8 without BOM, embedded JSON parses, relative links resolve, no mojibake or trailing whitespace. No software tests, build, emulator, or deployment were run, consistent with `AGENTS.md` and the proposal-only task.

R768 would complete only the open substitution-research question for the existing Job’s-tears-flour reference. The broader WP02 Section A6 review remains open.
