# WP02 A6 next gap review — R758 buckwheat-flour substitution — 2026-10-18

## Review record

- **Status:** Proposal only. No shared catalog data, plan, roadmap, workflow, recipe, generated index, or integration file was edited.
- **Exact open item:** The parent A6 review remains open at [the catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838), which calls for continued review of buckwheat and other regional grain flours.
- **Target:** The existing ledger record for `ingredient-ref-buckwheat-flour`, `buckwheat flour / farine de sarrasin`.
- **Scope:** Complete the still-open substitution research for generic buckwheat flour. This is separate from the R3 `soba-ko` alias review and R731's product-specific measurement review.
- **Recent-work separation:** R737–R755 covered white/black/red quinoa flour, fonio, teff, millet, and Job's-tears flour questions. This proposal does not revisit those findings or the R755 measurement review; it selects the unresolved substitution sub-question on plain buckwheat flour.
- **Archive/source audit:** No focused substitution finding for the generic buckwheat-flour record exists in the proposal or integration archive. [R3](wp02-a6-next-regional-flour-gap-review-20261013-round3.md) observed vague retailer wording for one Gishi product but left substitution research unreviewed. [R731](wp02-a6-next-gap-review-r731-20261018.md) recorded a 2023 Coop Agrobio serving only and explicitly kept substitution research open. The three proposed source IDs, finding ID, and output path were absent from the live ledger/archive at drafting.

## Recommendation

Update only the existing research-ledger record for `ingredient-ref-buckwheat-flour`:

1. Set `substitutionResearchState` to `blocked_pending_evidence`.
2. Add one blocked, source-scoped finding describing the available wheat-flour substitution guidance and its limits.
3. Add the three new source records below and one accepted decision.

Keep the active ingredient row, aliases, forms, measurements, and all recipe records unchanged. Add no `fromIngredientRefId`, `replacements`, recipe-line substitution, `SubstitutionRule`, or `ContextualSubstitutionRule`.

The sources give potentially useful trial guidance, but they do not support a reliable active conversion. King Arthur Baking says to begin by replacing 25% of wheat flour in a non-yeasted recipe or 15% in yeasted bread, by weight or volume. These are expressly starting suggestions. Health Canada's gluten-free recipe guidance offers buckwheat flour as an alternative to wheat flour but gives no ratio and warns that the texture may change and other ingredients may need adjustment. Eren and Akkaya's controlled bread study tested 10%, 20%, and 30% flour blends in one white-bread formula and selected 20% as most appropriate within that study; all buckwheat additions produced lower bread volume than the control.

There is also a representation limit. The [contextual-rule schema](../../schemas/full-library.schema.v1.json#L784) supports one ingredient-to-ingredient ratio plus dish, role, and cooking-method scopes, but it has no field to replace only a stated fraction of a recipe's wheat-flour quantity while retaining the rest of that wheat flour. A 1:1 ratio would imply replacing the whole wheat-flour line, which the source guidance does not recommend; a 0.25 or 0.15 ratio would leave the recipe with only that fraction of the flour amount unless the un-replaced wheat portion were modeled separately. Do not encode the guidance as an active ratio.

## Current target and product-class boundary

The live [reference](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) is `ingredient-ref-buckwheat-flour`, displayed as **`buckwheat flour / farine de sarrasin`**, category `FLOUR_AND_STARCH`, with English aliases `kuttu atta`, `kuttu ka atta`, `kuttu flour`, and `soba-ko`; it has no French aliases. Its `defaultDensity` is `null`, `unitMappings` is empty, and no [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) are attached. The [ledger record](../research-ledger.v1.json) is identity-verified, has `measurementState: researched_no_supported_value` from R731, and still has `substitutionResearchState: not_yet_researched`; it contains one R731 product-specific measurement observation and no substitution findings.

Keep this target distinct from the existing **whole**, **dark/gray**, **light/pale**, **sprouted**, and **Tartary** buckwheat-flour references. Eren and Akkaya's experiment identifies its sample as common buckwheat (*Fagopyrum esculentum*) made by grinding whole groats below 500 micrometres at 100% yield. That sample is specifically whole flour and does not establish a transferable ratio for generic flour, another species, or another milling class. It is retained as formulation evidence only, not used to merge or redefine any flour identity.

Keep the existing Québec display and alias ownership unchanged. The existing OQLF source `WP02-S31` pairs `farine de sarrasin` with English `buckwheat flour`; the current aliases remain as listed above. No naming or alias decision is part of R758.

## Evidence and limits

- Health Canada's [Adjusting recipes to meet your needs](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/adjusting-recipes-meet-your-needs.html) says that, for a gluten-free diet, one can try buckwheat flour instead of wheat flour. It warns that the change may alter texture and may require changing other ingredients. It does not specify a replacement proportion, particular recipe types, or a test formula.
- King Arthur Baking's test-kitchen [guide to baking with buckwheat](https://www.kingarthurbaking.com/blog/2021/07/21/a-guide-to-baking-with-buckwheat) says buckwheat has no gluten and advises against replacing all of a recipe's wheat flour. It suggests starting with 25% replacement in a non-yeasted recipe and 15% in a yeasted bread recipe, by weight or volume. Those percentages are baking guidance, not a catalog-measured property or formula validated across every buckwheat-flour product.
- Eren and Akkaya's 2024 primary paper, [Effect of different forms of buckwheat addition on the physicochemical and sensory properties of bread](https://cjfs.agriculturejournals.cz/pdfs/cjf/2024/03/03.pdf), tests 10%, 20%, and 30% substitution in one white-wheat-bread formula. It describes common buckwheat groats milled below 500 micrometres into whole buckwheat flour at 100% yield. The authors select the 20% flour treatment as most appropriate within the tested formula; the paper reports lower volume for all buckwheat-added samples than the control. The results concern this formula, flour, yeast process, and study outcome, not a household replacement rule for all recipes.

The percentages are worth preserving as source-scoped text in the finding: King Arthur's 25% and 15% starting levels have an explicit non-yeasted/yeasted distinction and mass-or-volume wording; the research trial's 10%, 20%, and 30% are its specific white-bread flour blends, with 20% favored in that study. They are not density, unit mappings, unit conversions, active amount ratios, or validated caps for the generic ingredient row. Health Canada's guidance contributes no numeric value.

The previously reviewed Gishi retailer wording is not used to broaden the conclusion: R3 describes it as a product-specific suggestion to use the named flour in soba noodles, pancakes, and bread and adjust water, without a named replacement flour, quantified ratio, or tested outcome. That gap is why the R3 packet retained `not_yet_researched`; R758 now records the stronger but still non-universal test-kitchen, government, and study evidence.

## Proposed ledger delta

This is a delta to the existing record, not a replacement record. Preserve all current identity, alias, R731 source/decision, and measurement-observation data. Append only the proposed sources, finding, and decision below.

```json
{
  "recordId": "ingredient-ref-buckwheat-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S01",
      "url": "https://www.kingarthurbaking.com/blog/2021/07/21/a-guide-to-baking-with-buckwheat",
      "title": "King Arthur Baking, A guide to baking with buckwheat",
      "versionOrDate": "2021-07-21",
      "accessedOn": "2026-10-18",
      "locator": "Start baking with buckwheat section; guidance for non-yeasted recipes and yeasted bread.",
      "supports": "Test-kitchen guidance says to begin by replacing 25% of wheat flour in a non-yeasted recipe or 15% in a yeasted bread recipe, by weight or volume, and says not to replace all wheat flour. These are starting suggestions, not validation for every product or formula.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S02",
      "url": "https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/adjusting-recipes-meet-your-needs.html",
      "title": "Health Canada, Adjusting recipes to meet your needs",
      "accessedOn": "2026-10-18",
      "locator": "Adjusting recipes for dietary restrictions; gluten-free example.",
      "supports": "Official Canadian guidance says one can try buckwheat flour instead of wheat flour for gluten-free needs, while noting that texture may change and the amounts of other ingredients may need adjustment. It supplies no ratio or recipe-specific outcome.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S03",
      "url": "https://cjfs.agriculturejournals.cz/pdfs/cjf/2024/03/03.pdf",
      "title": "Eren and Akkaya, Effect of different forms of buckwheat addition on the physicochemical and sensory properties of bread",
      "versionOrDate": "Czech Journal of Food Sciences 42(3) (2024), 216-223; DOI 10.17221/36/2024-CJFS",
      "accessedOn": "2026-10-18",
      "locator": "Abstract; Materials and Methods, Material and Bread production; Table 1; Conclusion.",
      "supports": "Primary study tests 10%, 20%, and 30% buckwheat-flour substitution in one white-wheat-bread formula, using common buckwheat groats ground below 500 micrometres to whole flour at 100% yield. It identifies 20% as the most appropriate flour level within that study and reports lower bread volume for all buckwheat-added samples than control. The tested flour and formula do not establish a general recipe rule.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "buckwheat-flour-partial-wheat-replacement-scope-blocked-r758-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "Use of buckwheat flour to replace part of wheat flour in recipes, including non-yeasted baked goods and yeasted bread.",
      "basis": "Health Canada offers buckwheat flour as an option to try instead of wheat flour for gluten-free needs and notes possible texture and other-ingredient adjustments. King Arthur Baking suggests starting at 25% replacement in non-yeasted recipes and 15% in yeasted bread, by weight or volume. Eren and Akkaya test 10%, 20%, and 30% common whole buckwheat flour in one white-wheat-bread formula, favoring 20% within that study while finding lower loaf volume for every buckwheat-added sample than control.",
      "limitations": [
        "The Health Canada advice has no replacement amount, recipe type, or tested result; it is general adjustment guidance.",
        "King Arthur's 25% and 15% values are starting guidance for two recipe contexts, not a validated maximum or instruction for every flour product. The source explicitly discourages replacing all wheat flour.",
        "The primary trial is one yeasted white-bread formula and uses common buckwheat whole flour milled from whole groats below 500 micrometres. Its 10%, 20%, and 30% results do not transfer to generic home recipes or the separate dark, light, sprouted, Tartary, and whole-flour identities.",
        "The current contextual-rule model has no field to represent replacing only a stated fraction of a recipe's wheat-flour quantity while retaining the remainder. A single ratio would either imply full-line replacement or omit the un-replaced flour amount.",
        "No matching bundled recipe line supplies a recipe role, amount, or method for a recipe-specific substitution."
      ],
      "sourceIds": [
        "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S01",
        "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S02",
        "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S03"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the deferred substitution review by retaining the government guidance, test-kitchen starting levels, and one formula-specific bread trial as a blocked source-scoped finding. Their contexts and partial-replacement amounts cannot be represented safely as a reusable ingredient-to-ingredient rule. Keep the active catalog and all ingredient naming and numeric behavior unchanged.",
      "sourceIds": [
        "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S01",
        "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S02",
        "WP02-A6-BUCKWHEAT-SUB-R758-20261018-S03"
      ]
    }
  ]
}
```

The percentages appear only in source notes. Do not add a `fromIngredientRefId`, `replacements` array, active rule, conversion, density, unit mapping, form, package yield, or recipe-line link. Keep the R731 Agrobio portion observation separate; it does not supply a wheat-flour replacement amount or resolve the mass/volume basis of the King Arthur guidance.

## Naming, picker, and corpus audit

No display or alias changes are proposed. R731's live picker audit found these current results; R758 is ledger-only, so the same results remain:

| Query | Current results | R758 effect |
|---|---|---|
| `buckwheat flour` | Generic, dark, light, sprouted, Tartary, and whole buckwheat flour | No change |
| `farine de sarrasin` | Generic, sprouted, Tartary, and whole buckwheat flour | No change |
| `kuttu atta`, `kuttu flour`, `soba-ko` | Generic buckwheat flour | No change |

The live manifest lists **114 recipe files** with **1,123 structured ingredient rows**. A read-only scan of all manifest-listed recipe JSON and ingredient rows found zero hits for the target ID, buckwheat/sarrasin terms, or the current regional aliases; no recipe directly links to `ingredient-ref-buckwheat-flour`. No bundled recipe demand, substitution link, or recipe edit is proposed.

## Source and ID ownership; verification notes

- The three proposed source IDs and URLs were checked against the live research ledger; none is currently owned there. Existing R731/OQLF and R3 naming sources remain unchanged, and no duplicate source object is needed for them.
- The proposal-local finding ID was checked against current substitution-finding IDs and the proposal/batch archive; no collision was found.
- The live [global](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json) and [contextual](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json) substitution-rule files contain no rules. No buckwheat package-yield record exists in the [package-yield file](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json), and no buckwheat-flour form is attached in the [forms file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json).
- This proposal changes documentation only. If the ledger-only delta is integrated, `AGENTS.md` exempts changes that only add database JSON from software tests and emulator checks; none were run for this proposal.

The broader WP02 A6 regional-flour review remains open.
