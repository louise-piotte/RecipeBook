# WP02 Section A7 R815 — malted-wheat-flour improver-substitution evidence

- **Reviewed:** 2026-10-19
- **Status:** Proposal only; no shared catalog, ledger, plan, workflow, or generated-index files were changed.
- **A7 anchor:** The open checklist still calls for review of other grain meals and milling products ([plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2282)). R812 covers einkorn-flour portions and a recipe-specific einkorn-grade choice. R660 recorded one malted-wheat-flour recipe portion but explicitly left substitution research open; this review addresses only that remaining substitution-evidence question.

## Recommendation

On the existing `ingredient-ref-malted-wheat-flour` ledger row:

1. Change `substitutionResearchState` from `not_yet_researched` to `blocked_pending_evidence`.
2. Add the 2025 primary study below as one source and record one blocked, source-scoped finding about whether malted wheat flour can replace a composite commercial bread improver in general recipe use.

The study supports a narrow result for specially malted bread-wheat cultivar Anapo in a controlled soft-bread / bun process. It does not support a general home-baking rule for every malted-wheat-flour product. The comparator was a specific composite improver with no active ingredient-reference ID, and the malt's cultivar and micromalting process are product-defining. Keep the study out of active forms, global or contextual rules, and recipe-line substitution data.

Keep the accepted English and Québec French names, empty alias arrays, null `defaultDensity`, empty `unitMappings`, current `measurementState`, and the R660 50 g recipe observation unchanged. Do not add a density or measurement observation from the study's experimental percentages: those percentages describe controlled dough formulations, not a reusable household measure.

## Candidate identity and boundary

The active row is `ingredient-ref-malted-wheat-flour`, named **malted wheat flour / farine de blé maltée**, category `FLOUR_AND_STARCH`. Its bilingual identity is already verified by the existing CFIA, TERMIUM Plus, and manufacturer sources WP02-S114–S117. Both alias arrays remain empty. No alias or display change is proposed.

The article uses the academic descriptions “malted bread wheat flour” and “malted Anapo flour” for its specific experimental flour. It does not establish a Québec retail product name or a broader synonym that should become an alias. Preserve the existing wheat-malt identity and its boundaries with generic malt flour, malted barley flour, malted rye flour, roasted wheat flour, and roasted wheat-malt flour.

“Commercial improver” is not an active ingredient reference in the package. The paper's comparator is one composite product containing E471 (mono- and diglycerides of fatty acids), vegetable-origin oils, type 0 wheat flour, an enzyme complex, and ascorbic acid. No active reference or form owns `commercial bread improver`, `bread improver`, or `améliorant de panification`; do not create one in this review. A blocked finding is the appropriate ledger outcome because the source-specific potential is real but cannot be represented as a directed catalog replacement without a target identity and transferable scope.

## Substitution evidence and limits

Canale et al. (2025) tested malted flour from cultivar **Anapo** (type 0 flour, 120–260 μm, with a specified micromalting process) in controlled soft-bread / bun formulations. Table 1 lists malted-flour additions of 0.5–5% by wheat-flour mass, a 1.75% commercial-improver comparator, and a 1% + 1% blend. The comparator's disclosed components are E471, vegetable-origin oils, wheat flour, an enzyme complex, and ascorbic acid. Formula water was set from farinograph absorption at 500 B.U. The authors identify **0.5% malted Anapo flour** as their best overall treatment and a viable alternative in that process; the 5% treatment had the largest volume but irregular crumb. This is not a general household ratio or a result for other malted-wheat products. The study does not provide home-baking hydration adjustments.

There is a count mismatch within the paper's summary: the abstract says seven formulations were tested, while Table 1 displays eight rows when its control, improver comparator, 1% + 1% blend, and five Anapo additions are counted. This proposal follows the explicit Table 1 treatments and does not rely on the abstract's total formulation count.

The already-owned current manufacturer pages from R660 reinforce the product boundary, not a general improver-substitution rule. Molino Moras describes its own high-diastatic whole malted soft-wheat flour, recommending 1% of flour weight for bread and pizza and at most 2% for breadsticks and focaccia. IRCA describes OROMALT as high-diastatic wheat malt flour and gives product- and application-specific dosage ranges. Neither page establishes that every malted wheat flour can replace a composite commercial improver.

## Catalog, ownership, picker, and recipe audit

| Surface | Current state and proposed effect |
| --- | --- |
| Active identity and Québec French | `ingredient-ref-malted-wheat-flour` owns `malted wheat flour / farine de blé maltée`. Existing identity sources WP02-S114–S117 support that bilingual identity. Keep the row, labels, category, and empty aliases unchanged. |
| Measurement and density | The ledger has `measurementState: researched_supported` and one R660 published-portion observation: Hodmedod's 50 g malted-wheat-flour option in its named *Malted Loaf*. The reference has `defaultDensity: null` and `unitMappings: []`. Keep all of these unchanged. The experimental percentages in this study are formulation quantities, not a portion, density, or volume mapping. |
| Forms and active substitutions | The package has 199 ingredient forms; none belongs to this reference. It has zero global and zero contextual substitution rules, with no rules or forms mentioning this ID. Keep the structure unchanged. |
| Proposed substitution finding | The ledger currently has `substitutionResearchState: not_yet_researched` and no finding on this row. Add one `blocked_pending_evidence` finding scoped to the paper's Anapo soft-bread / bun conditions. Add no replacement because the specific composite improver has no active reference and the evidence is not transferable to a general target. |
| Neighboring ownership | The active generic malt-flour, malted barley, malted rye, roasted wheat, and roasted wheat-malt references remain distinct. No existing reference owns a commercial improver label, and no new target identity is proposed. |
| Source, finding, and target ownership | The R815 DOI and proposed source/finding IDs are absent from the current ledger and catalog archive. Searches of active references, forms, rules, and legacy-import identities find no commercial bread-improver owner. Reuse R660's existing Molino Moras and IRCA source records as boundary context; do not duplicate their URLs. |
| Picker | No active data changes are proposed. Current phrase-first, accent-folded results are: `malted wheat flour` → this row only; `farine de blé maltée` and `farine de ble maltee` → this row only; `malted bread wheat flour` → no result; `malted wheat` → malted wheat flakes plus malted wheat flour; `bread improver` → no result. The broad `malt flour` query remains seven results, including malted rye flour through the contiguous `malt flour` subphrase in its existing `rye malt flour` alias. Add no broad alias; all picker results remain unchanged. |
| Bundled recipe demand | A read-only scan traversed all manifest-listed recipe JSON: 114 files with 1,123 total entries in the recipes' `ingredients` arrays. Of those, 1,097 ingredient objects contain an `ingredientRefId`; the remaining 26 are still ingredient-array entries but have no reference link. The scan found zero direct links to this reference and zero normalized phrase hits for malted wheat flour, malted bread wheat flour, farine de blé maltée, malted wheat, commercial improver, bread improver, or améliorant de panification in full files or ingredient rows. This reconciles R812's 1,123 total-row count with the separate count of 1,097 reference-linked rows. |

The scan normalized full recipe-file text using the same lowercasing, NFKD accent folding, punctuation-to-space, and whitespace behavior as `IngredientSearch.kt`. It counted each object containing `ingredientRefId` separately from all `ingredients` array entries, then checked full files and rows for the same phrases. R812's 1,123 total-row count is correct; 1,097 is the narrower count of rows that currently carry an ingredient reference ID. Neither count changes the zero-demand finding for this candidate.

## Exact proposed ledger delta

Apply to `records[]` entry `recordId == "ingredient-ref-malted-wheat-flour"`:

```json
{
  "replace": {
    "substitutionResearchState": "blocked_pending_evidence"
  },
  "addSources": [
    {
      "sourceId": "WP02-A7-MALTED-WHEAT-IMPROVER-R815-20261019-S01",
      "url": "https://doi.org/10.1016/j.lwt.2025.118150",
      "title": "Michele Canale et al., Malted bread wheat grain as a natural and competitive alternative to commercial improver in breadmaking",
      "accessedOn": "2026-10-19",
      "locator": "Abstract; section 2.1; Table 1; results and Conclusions.",
      "supports": "Primary evidence for the bounded Anapo formulation set and the study-specific soft-bread / bun conclusion described above; it does not establish a general household substitute, ratio, or hydration rule. The abstract's formulation count differs from Table 1's displayed rows.",
      "sourceKind": "other"
    }
  ],
  "addSubstitutionFinding": {
    "findingId": "malted-wheat-flour-anapo-commercial-improver-soft-roll-r815-20261019",
    "researchState": "blocked_pending_evidence",
    "fromIngredientRefId": "ingredient-ref-malted-wheat-flour",
    "replacements": [],
    "context": "The 2025 study's controlled soft-bread / bun formulations using specially malted cultivar Anapo flour and one composite commercial improver.",
    "basis": "The study identifies 0.5% malted Anapo flour as its best overall treatment for that process.",
    "adjustments": [],
    "expectedEffects": [],
    "limitations": [
      "Do not apply the study's 0.5% result as a general replacement ratio for household recipes, other brands or grades of malted wheat flour, other wheat cultivars, or other commercial improvers.",
      "The comparator combines E471, vegetable-origin oils, type 0 wheat flour, an enzyme complex, and ascorbic acid; no active ingredient reference owns that product, and the package has no commercial-improver form.",
      "Formula water is tied to farinograph absorption; the paper does not provide a transferable home-baking hydration adjustment.",
      "The study reports a narrow formulation result and does not create an active ingredient-to-ingredient substitution rule or recipe-line link."
    ],
    "sourceIds": ["WP02-A7-MALTED-WHEAT-IMPROVER-R815-20261019-S01"]
  },
  "addDecisions": [
    {
      "outcome": "accepted",
      "reason": "Record the primary study and its cultivar-, improver-, and process-specific scope on the existing malted-wheat-flour row. Update substitution research state to blocked_pending_evidence; keep the identity, aliases, R660 measurement observation, density, mappings, forms, and active rules unchanged.",
      "sourceIds": ["WP02-A7-MALTED-WHEAT-IMPROVER-R815-20261019-S01"]
    },
    {
      "outcome": "unresolved",
      "reason": "The study does not support a general substitute for an unmodeled class of commercial bread improvers. Further evidence would need to identify the improver product and the malted-wheat product, then test the relevant recipe or application before an active directed rule could be considered.",
      "sourceIds": ["WP02-A7-MALTED-WHEAT-IMPROVER-R815-20261019-S01"]
    }
  ]
}
```

This delta updates only the existing malted-wheat-flour ledger row. Do not add a reference, alias, form, density, unit mapping, conversion, package yield, recipe link, global rule, contextual rule, or line-level substitution.

## Sources and limits

| Source | Evidence used | Limits |
| --- | --- | --- |
| `WP02-A7-MALTED-WHEAT-IMPROVER-R815-20261019-S01` — Canale et al. (2025), [Malted bread wheat grain as a natural and competitive alternative to commercial improver in breadmaking](https://doi.org/10.1016/j.lwt.2025.118150), *LWT – Food Science and Technology* 229, article 118150. | Primary experimental paper; abstract, §2.1, Table 1, results, and conclusion. | Narrow evidence only: Anapo cultivar, specified malting, one comparator, and controlled bakery conditions. No general ratio, Québec retail product, or home-baking hydration rule. The abstract's formulation count differs from Table 1's displayed rows. |
| Reuse existing `WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S01` — Molino Moras, [Malted Wheat Flour](https://www.molinomoras.live/en/products/malted-wheat-flour). | Current product page describes this brand's malted soft-wheat flour and product/application-specific addition guidance. | Its 1% bread/pizza and maximum 2% breadstick/focaccia advice is for its own high-diastatic product, not a tested replacement for the study's commercial improver or a general substitute. No new source record is needed. |
| Reuse existing `WP02-A7-MALTED-WHEAT-FLOUR-PORTION-R660-20261018-S02` — IRCA, [OROMALT](https://www.ircagroup.com/en/products/oromalt). | Current manufacturer page identifies its own high-diastatic wheat malt flour and gives dosage ranges by bakery application. | Brand-specific dosing is not evidence that a catalog-wide malted-wheat-flour identity replaces composite commercial improvers. No new source record is needed. |
| Existing identity sources WP02-S114–S117. | CFIA, TERMIUM Plus, and product/manufacturer evidence already recorded in the ledger support the active identity and bilingual names `malted wheat flour / farine de blé maltée`. | These sources do not address improver substitution; no identity-source update is proposed. |

## Static checks and test scope

- Read `AGENTS.md`, `Requirements.md`, `roadmap.md`, Section A7, the catalog workflow and ledger schema, the active malted-wheat-flour row and reference, the R660 and R812 proposals, and the R660 integration note before choosing this gap.
- Checked the 2025 primary paper and current Molino Moras and IRCA product sources; reviewed identity labels, alias ownership, R660's source-scoped measurement, and the separation between manufacturer dosing and study-specific improver replacement.
- Audited current ledger ownership for the DOI, proposed source/finding IDs, active forms and rules, phrase-first picker projection (including R806's contiguous `malt flour` subphrase behavior), and all manifest-listed recipe files using the method and live counts stated above.
- This is a proposal-only Markdown change. If accepted, the ledger integration would only add database JSON evidence and status. Under `AGENTS.md`, database-JSON-only changes need no software tests; no tests, app build, emulator run, or deployment were performed.
