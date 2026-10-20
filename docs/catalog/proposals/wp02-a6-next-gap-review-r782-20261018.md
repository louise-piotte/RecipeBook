# WP02 A6 R782 — generic spelt-flour substitution review — 2026-10-18

## Review record

- **Status:** Proposal only. This review edits no shared catalog, ledger, recipe, plan, roadmap, workflow, generated file, or app file.
- **Plan fit:** The broad [WP02 A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1855) remains open. R776 completed measurement research for the existing generic `ingredient-ref-spelt-flour` row and explicitly left its substitution state unchanged.
- **Target:** Existing `ingredient-ref-spelt-flour`, `spelt flour / farine d'épeautre`, category `FLOUR_AND_STARCH`.
- **Exact open question:** Do current primary baking sources support a reusable wheat-flour replacement rule for generic spelt flour, or only source- and formula-scoped evidence?
- **Prior-work boundary:** R776 recorded King Arthur Baking's chart and two recipe amounts as separate measurement observations, while leaving substitution research `not_yet_researched`. White, whole, malted, and sprouted spelt flour are separate active references; this review does not transfer evidence to those qualified identities. The existing chart source `WP07-KAB-IWC` remains unchanged.
- **Proposal-local IDs:** New source IDs `WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S01` and `WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S02`; finding IDs `spelt-flour-badem-mixed-bread-study-r782-20261018` and `spelt-flour-kab-ancient-grains-test-context-r782-20261018`. The IDs, Springer article URL/DOI, King Arthur article URL, finding IDs, and requested proposal path were checked against the live ledger, plan, proposal archive, and batch archive; no prior owner or collision was found.

## Recommendation

Set `substitutionResearchState` on `ingredient-ref-spelt-flour` to `blocked_pending_evidence` and append two source-scoped findings:

1. Badem, Yörük, and Şahin's controlled bread study uses locally purchased *Triticum spelta* flour at 0%, 25%, 50%, 75%, and 100% of the flour blend, with Ahlat pear flour as a separate 0–10% factor. The 50% spelt / 50% common-wheat formula and a different pear-containing formula had the highest comparable sensory acceptance in that experiment. The local flour grade and supplier are not reported; water was formulation-adjusted using Mixolab, and the trial is not a home-recipe instruction.
2. King Arthur Baking's R&D account says its team tested eight ancient-grain flours, including spelt, at 25%, 50%, and 100% replacement in five breakfast-baking formulas. It describes 25% as a starting point that worked in many recipes and cautions against more than 50% ancient grains in yeast bread. It does not disclose the spelt sample's grade, supplier, or formula-by-formula results.

Keep the evidence tied to those studies and do not turn 25% or 50% into a generic app recommendation. Neither source identifies a matching RecipeBook recipe or supports a source-to-replacement link for every cataloged wheat-flour class. Set each finding's `fromIngredientRefId` to `ingredient-ref-spelt-flour`; add no `replacements`, `ruleId`, active contextual or form-substitution rule, recipe-line link, alias, form, measurement, density, unit mapping, conversion, or yield. Preserve R776's measurement state, sources, observations, and decisions.

This is consistent with [Requirements.md](../../../Requirements.md), which requires ingredient-to-ingredient substitutions to remain contextual, scoped, and risk-evaluated rather than treated as globally valid.

### Contextual-rule readiness

King Arthur's advice supports a bounded *future candidate*: the page names spelt among the eight tested flours, recommends replacing 25% of all-purpose flour with an equal amount of ancient-grain flour in “just about any recipe,” and gives a separate 50% ceiling for ancient-grain use in yeast breads. It is not activation-ready as a current contextual rule. The current resolver requires a nonempty matching `allowedDishTypes` list and rejects role or cooking-method scopes; King Arthur's broad recipe guidance does not define a finite spelt-specific dish-type scope, and its yeast-bread ceiling is an aggregate ancient-grain limit rather than a spelt-specific target. Risk notes or warnings can communicate caution after a rule matches, but they cannot narrow that evidence or change its quantity behavior.

The current contextual suggestion also turns one source ingredient line into one target ingredient and computes the target quantity as `source quantity × ratio` ([resolver](../../../app/src/main/java/app/recipebook/data/local/recipes/IngredientSubstitutionResolver.kt)). It cannot express the KAB instruction to replace only 25% of the all-purpose flour while retaining the other 75% in that recipe line: `ratio: 0.25` would suggest only one-quarter of the original flour amount as spelt, while `ratio: 1.0` would imply full-line replacement. A caution/high-risk label would not correct either mismatch. Keep the ledger state blocked and defer activation until the substitution model can represent a partial flour blend and a spelt-specific scope supported by the source.

## Current row and evidence boundary

| Surface | Current state | R782 disposition |
|---|---|---|
| Active reference | `ingredient-ref-spelt-flour`, `spelt flour / farine d'épeautre`, `FLOUR_AND_STARCH`; no aliases, `defaultDensity: null`, empty `unitMappings`. | Keep unchanged. |
| Target ledger row | Identity `verified`; measurement `researched_supported` with four R776 source-scoped observations; substitution `not_yet_researched`; no substitution findings. | Change only substitution research state; append two source-scoped findings and one decision. |
| Comparator flour | Badem et al. call the comparator common wheat flour and do not name a product or flour grade. King Arthur's guide refers to all-purpose flour, but does not identify its tested flour products or the wheat class behind each formula. | Do not assign either source to an active wheat-flour reference or imply equivalence across flour classes. |
| Qualified spelt identities | Whole, white, malted, and sprouted spelt flours are separate active references. | Keep their ledger and picker data unchanged; do not transfer the findings to them. |
| Forms and active behavior | The generic row has no forms, package yields, or substitution rules; the bundled global and contextual rule files are empty. | Add none. |

## Primary evidence and limits

Badem, Abdullah, Ayşe Yörük, and Nazlı Şahin, [“Evaluation of the effects of *Triticum spelta* flour and Ahlat pear flour on the physical, chemical, textural, and sensory properties of bread”](https://link.springer.com/article/10.1007/s11694-026-04420-9), *Journal of Food Measurement and Characterization* 20 (2026), 9510–9522, DOI [10.1007/s11694-026-04420-9](https://doi.org/10.1007/s11694-026-04420-9), is a primary experimental study published 2026-04-28. The materials section says the common-wheat and spelt flours were purchased from local markets in Karaman, Türkiye; it reports flour compositions but no brand, cultivar, extraction rate, or milling grade. Its design tests five spelt levels (0%, 25%, 50%, 75%, 100%) with three Ahlat-pear-flour levels (0%, 5%, 10%), keeping total flour at 100%. Water varies by formula (56.0–62.4%) based on Mixolab dough analysis. The study reports the 50% *T. aestivum* / 50% *T. spelta* formula and the 70% wheat / 25% spelt / 5% Ahlat pear formula as the two highest comparable overall-acceptability results; all-spelt bread scored lowest on several sensory measures. The pear-containing blend is a distinct multi-flour formulation, not a stand-alone 25% spelt substitution result. Seven trained evaluators assessed samples on a five-point scale. These findings describe this local-market flour, laboratory bread method, adjusted water, and small trained panel; they do not establish a general replacement ratio or transferable water adjustment.

King Arthur Baking's [“Baking with ancient grains”](https://www.kingarthurbaking.com/blog/2017/02/10/baking-ancient-grains), published 2017-02-10 and checked 2026-10-18, is a first-party R&D/test-kitchen account. The author says the team selected eight flours from grocery stores, including spelt, then tested 25%, 50%, and 100% substitutions in five breakfast-baking recipes (banana bread, muffins, scones, pancakes, and cinnamon bread). It calls equal-amount 25% substitution a useful starting point across many recipes and says the team does not recommend more than 50% ancient-grain flour in yeast bread because the dough becomes difficult to work and the loaf dense and fractured. It also reports that quick breads and pancakes were the most adaptable tested recipe types. The page gives no brand, cultivar, extraction rate, or spelt-specific table of outcomes, so its broad language cannot be assigned as a rule for every generic spelt flour or every RecipeBook dish. It is retained as evidence of this test kitchen's advice, not a cross-source validation of a universal ratio.

R776's `WP07-KAB-IWC` chart source is already attached to the generic spelt row but supports measurement only. R782 does not repurpose it as substitution evidence. The two URLs proposed below are separate from the R776 chart and recipe URLs.

## Proposed ledger delta

Append this fragment to the existing `ingredient-ref-spelt-flour` record. Preserve its R776 observations and all existing sources and decisions.

```json
{
  "recordId": "ingredient-ref-spelt-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S01",
      "url": "https://link.springer.com/article/10.1007/s11694-026-04420-9",
      "title": "Badem, A., Yörük, A., and Şahin, N. Evaluation of the effects of Triticum spelta flour and Ahlat pear flour on the physical, chemical, textural, and sensory properties of bread",
      "versionOrDate": "Journal of Food Measurement and Characterization 20, 9510–9522 (2026); published 2026-04-28; DOI 10.1007/s11694-026-04420-9",
      "accessedOn": "2026-10-18",
      "locator": "Abstract; Materials and methods: Materials, Experimental design, Composite flour rheology, Bread production, Sensory analysis; Results: sensory properties; Conclusion.",
      "supports": "Primary study of bread formulas using locally purchased common-wheat and Triticum spelta flours, with Ahlat pear flour as a separate factor. The design tests five spelt shares (0–100%) and three Ahlat-pear shares (0–10%) in a 100% total flour blend. The 50% wheat / 50% spelt formula and a distinct 70% wheat / 25% spelt / 5% pear-flour formula have the highest comparable overall-acceptability results in this experiment. Water is adjusted by Mixolab analysis. The samples, formula set, and laboratory process do not establish a general home-recipe replacement ratio.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S02",
      "url": "https://www.kingarthurbaking.com/blog/2017/02/10/baking-ancient-grains",
      "title": "King Arthur Baking. Baking with ancient grains",
      "versionOrDate": "Published 2017-02-10; accessed 2026-10-18",
      "accessedOn": "2026-10-18",
      "locator": "Creating a guide from scratch; Baking and tasting; Our favorite ancient grains combinations; What we learned about baking with ancient grains.",
      "supports": "First-party test-kitchen account says the R&D team selected eight grocery-store flours, including spelt, and tested 25%, 50%, and 100% replacement levels in five breakfast-baking formulas. It describes equal-amount 25% substitution as a useful starting point for many recipes and advises against using more than 50% ancient-grain flour in yeast breads. The page gives qualitative group-level advice but does not identify the spelt sample's brand, cultivar, extraction rate, or formula-specific numeric results.",
      "sourceKind": "test_kitchen"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "spelt-flour-badem-mixed-bread-study-r782-20261018",
      "fromIngredientRefId": "ingredient-ref-spelt-flour",
      "researchState": "blocked_pending_evidence",
      "context": "One laboratory bread study using local-market Triticum spelta and common-wheat flours, with Ahlat pear flour as a 0–10% formulation factor.",
      "basis": "The study tests five spelt shares (0%, 25%, 50%, 75%, and 100%) across formulas with 0%, 5%, or 10% Ahlat pear flour, for a 100% total flour blend. The 50% wheat / 50% spelt formula and a separate 70% wheat / 25% spelt / 5% pear-flour formula receive the highest comparable overall-acceptability results. Water is adjusted from Mixolab rheology; seven trained evaluators assess sensory attributes on a five-point scale. The 100% spelt bread scores lowest for several sensory measures.",
      "limitations": [
        "Both wheat flours are local-market samples from Karaman, Türkiye. The article does not name a supplier, cultivar, extraction rate, or milling grade; do not assign the comparator to an active wheat-flour reference or transfer the result to whole-, white-, or another qualified spelt-flour row.",
        "The best-rated pear-containing formula includes a third flour and is not evidence for a stand-alone 25% spelt substitution. The 50% result is one formula in this specific bread experiment, not a home-baking starting ratio.",
        "Water is adjusted by Mixolab, and the laboratory dough process, baking conditions, and seven-person trained panel limit transfer to other breads and recipes.",
        "No bundled RecipeBook recipe matches the flour blend, bread process, or sensory study context; no recipe-line link or active substitution rule is supported."
      ],
      "sourceIds": ["WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S01"]
    },
    {
      "findingId": "spelt-flour-kab-ancient-grains-test-context-r782-20261018",
      "fromIngredientRefId": "ingredient-ref-spelt-flour",
      "researchState": "blocked_pending_evidence",
      "context": "King Arthur Baking's R&D tests of spelt as one of eight ancient-grain flours in selected breakfast-baking formulas.",
      "basis": "The account says the R&D team tested equal-amount 25%, 50%, and 100% substitutions in banana bread, muffins, scones, pancakes, and cinnamon bread. It calls 25% a useful starting point that worked in many recipes without significantly changing flavor and texture; it also advises against more than 50% ancient-grain flour in yeast breads. Quick breads and pancakes were the most adaptable categories in the tested set.",
      "limitations": [
        "The tested spelt sample is not identified by brand, cultivar, extraction rate, or other milling grade, and the page does not report separate numeric results for each spelt/formula combination.",
        "The 25% and yeast-bread statements summarize King Arthur's mixed ancient-grain test set and test-kitchen advice; they do not establish one transferable ratio for all generic spelt flour or every dish.",
        "The page does not provide a matching RecipeBook recipe-line context. Keep the guidance source-scoped and do not create an active replacement rule or recipe link."
      ],
      "sourceIds": ["WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S02"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the first substitution review for generic spelt flour by recording the controlled bread formulas and King Arthur Baking's R&D guidance as separate source-scoped, blocked findings. The local-market samples, mixed-flour formula, test-kitchen sample limitations, and lack of a matching bundled recipe do not establish a catalog-wide substitution rule or wheat-class mapping. Preserve R776 measurement evidence and keep all active catalog and recipe behavior unchanged.",
      "sourceIds": [
        "WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S01",
        "WP02-A6-SPELT-FLOUR-SUB-R782-20261018-S02"
      ]
    }
  ]
}
```

The `fromIngredientRefId` on each finding identifies the reviewed spelt-flour source row. It does not map a replacement ingredient or activate a recipe-line link or substitution rule. The proposal omits `replacements` and `ruleId`: the scientific article does not identify a cataloged wheat-flour grade, while the King Arthur guidance is qualitative, group-level guidance rather than a single tested rule for the app's range of recipe contexts.

## Picker projection and recipe-corpus demand

No active reference, alias, or form field changes are proposed, so picker results do not change. A phrase-first projection using the current names, aliases, form terms, and search behavior returns:

| Query | Current results | R782 effect |
|---|---|---|
| `spelt flour` | Malted, generic, sprouted, white, and whole spelt flour | No change |
| `farine d'épeautre` | The same five spelt-flour references | No change |
| `spelt` | Malted spelt flour, puffed spelt, spelt berries, spelt flakes, generic spelt flour, sprouted spelt flour, white spelt flour, and whole spelt flour | No change |
| `whole spelt flour` | Whole spelt flour only | No change |

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. No recipe file, ingredient row, or direct ingredient reference contains spelt wording or any spelt reference ID. The bundled corpus therefore supplies no source-matched replacement use or recipe-line link.

## Ownership and review checks

- Confirmed R776's integrated generic-spelt measurement work leaves `substitutionResearchState: not_yet_researched`; no earlier focused review answers this substitution question.
- Confirmed the active generic-spelt row has no aliases, forms, density, unit mappings, or package-yield link. The bundled global and contextual substitution-rule files contain no rules.
- The Springer article URL and DOI, King Arthur article URL, new source/finding IDs, and requested R782 proposal path have no prior owner in the current ledger, plan, proposal archive, or batch archive. The existing KAB weight-chart source `WP07-KAB-IWC` remains owned by the measurement work and is not duplicated or repurposed.
- Recomputed current picker projections and scanned all manifest-listed bundled recipes and structured ingredient rows. No catalog search term or recipe link is proposed.
- This is proposal-only documentation. No software tests, build, emulator, or deployment were run.

This review addresses only generic spelt-flour substitution evidence. The broader WP02 Section A6 review remains open.
