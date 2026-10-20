# WP02 Section A7 R830 — barley-flour replacement guidance

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, workflow, generated index, or recipe file was changed.
- **Plan anchor:** The live Section A7 parent remains open for review of other grain meals and milling products ([plan, A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2283)). R827 recorded a named P.A.N. pre-cooked-corn portion; R809, R812, R815, R818, R821, and R824 cover distinct semolina and wheat-flour evidence. This review applies one existing, source-scoped manufacturer guide to the still-blocked wheat-flour replacement question on the separate barley-flour ledger row.

## Recommendation

On the existing `ingredient-ref-barley-flour` ledger row, record Bob’s Red Mill’s one-page **Baking with Alternative Flours** guidance for replacing a portion of recipe whole-wheat flour with barley flour. The guide instructs bakers to use the table percentage of the recipe flour called for and lists **Barley Flour — 50%**. Restrict the finding to that manufacturer's guidance and the source’s explicitly named whole-wheat-flour direction.

Change the row’s overall `substitutionResearchState` from `blocked_pending_evidence` to `researched_supported` because this source supports one narrow recommendation. Preserve the existing blocked study finding unchanged: its selected bread-study ratios still do not establish a recipe-independent rule. The new finding remains ledger evidence; add no active global or contextual substitution rule, recipe-line link, or quantity conversion.

Do not map the guide’s other phrase, “white flour,” to all-purpose flour. The page does not identify a specific recipe, barley-flour SKU or grade, or whether its 50% basis is by mass or volume. Record the printed percentage as an unqualified source recommendation, not as an app-usable mass or volume ratio. The sheet says substitutions vary in color, texture, and flavor; it does not give a hydration or other formula adjustment.

Keep the bilingual reference, aliases, measurement evidence, `defaultDensity: null`, empty `unitMappings`, forms, and active rules unchanged. In particular, do not change the supported measurement state or its three existing, source-specific observations.

## Identity, labels, and aliases

The active target is `ingredient-ref-barley-flour`, category `FLOUR_AND_STARCH`, displayed as **barley flour / farine d’orge**. Its only alias is English **jau atta**; it has no French aliases. The current OQLF fiche directly pairs preferred Québec French `farine d’orge` with English `barley flour`; it was last updated in 1982, so it supports terminology, not current products or substitution performance. Existing La Milanaise and Mayrand sources separately support the bilingual product identity. The Bob’s Red Mill guide is English-only and does not justify any label or alias change.

Keep the active row distinct from malted barley flour, roasted barley flour, and whole barley flour. The guide only says “Barley Flour”; it does not establish which grade, whole-grain status, or barley variety it covers. Do not add “Bob’s Red Mill,” “white barley flour,” a product grade, or any other phrase as an alias.

## Source evidence and limits

| Source | Exact evidence | Limits |
| --- | --- | --- |
| Reuse existing ledger source `WP02-A6-TEFF-SUB-R725-20261018-S01`: Bob’s Red Mill, [*Baking with Alternative Flours*](https://docs.bobsredmill.com/document-center/how-to-use-our-products-top-1/5906-baking-with-alternative-flours-info-sheet/file), one-page PDF. | The sheet says: “To replace part of the whole wheat or white flour called for in a recipe” and directs readers to use the listed percentage of the flour called for. Its table row is “Barley Flour* 50%.” It also says each substitution changes baked-good color, texture, and flavor. | This is a manufacturer guide, not a controlled trial or a named formula. The PDF gives no publication or revision date, SKU, barley variety, or milling grade. It does not state whether 50% means weight or volume, or give a hydration/process adjustment. The `*` footnote says these flours are not produced in the company’s gluten-free facility and may contain gluten. The result must not be described as gluten-free guidance. |
| Existing target source `WP02A4-BF-S01`: Office québécois de la langue française, [*farine d’orge*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge). | OQLF lists `farine d’orge` as the preferred term and gives `barley flour` as its English translation. | Last updated in 1982. Used for the existing identity only; none of its historical baking commentary is used to support the new recommendation. |

The Bob’s Red Mill document is currently retrievable from the company’s document center, but the content itself is undated. A search for a current SKU-matched barley-flour product page did not establish that the guide’s “Barley Flour” is one particular retail item. Accordingly, this proposal records the manufacturer’s stated guidance without asserting a SKU-level or universal product-performance match.

## Exact proposed ledger delta

Apply only to `records[]` entry `recordId == "ingredient-ref-barley-flour"`:

~~~json
{
  "replace": {
    "substitutionResearchState": "researched_supported"
  },
  "addSource": {
    "sourceId": "WP02-A6-TEFF-SUB-R725-20261018-S01",
    "url": "https://docs.bobsredmill.com/document-center/how-to-use-our-products-top-1/5906-baking-with-alternative-flours-info-sheet/file",
    "title": "Bob's Red Mill, Baking with Alternative Flours",
    "accessedOn": "2026-10-19",
    "locator": "One-page PDF; instruction above the table and the Barley Flour row.",
    "supports": "For replacing part of the whole-wheat or white flour called for in a recipe, the guide says to use the table percentage of the recipe flour amount; its Barley Flour row lists 50%. It warns that substitutions change color, texture, and flavor. The guide does not state a mass or volume basis, name a formula or SKU, or provide a hydration adjustment.",
    "sourceKind": "manufacturer"
  },
  "addSubstitutionFinding": {
    "findingId": "barley-flour-bobs-red-mill-whole-wheat-substitution-r830-20261019",
    "researchState": "researched_supported",
    "fromIngredientRefId": "ingredient-ref-whole-wheat-flour",
    "replacements": [
      {
        "ingredientRefId": "ingredient-ref-barley-flour",
        "roleInCompound": "Bob's Red Mill guide's Barley Flour alternative for the stated 50% portion of a recipe's whole-wheat flour amount; measurement basis is unspecified."
      }
    ],
    "context": "Bob's Red Mill's undated Baking with Alternative Flours guide, limited to its explicit whole-wheat-flour wording and Barley Flour table row.",
    "basis": "The guide says to use the listed percentage of recipe flour when replacing part of whole-wheat or white flour, and lists Barley Flour at 50%. This supports recording a manufacturer recommendation for the stated whole-wheat-flour context; it does not establish a weight- or volume-based ratio.",
    "adjustments": [],
    "expectedEffects": [
      "Bob's Red Mill says the substitution changes baked-good color, texture, and flavor."
    ],
    "limitations": [
      "Use the source's explicit whole-wheat-flour wording only; do not map its separate 'white flour' wording to the all-purpose-flour reference.",
      "The undated guide names no formula, product SKU, barley variety, or milling grade, and gives no weight-versus-volume basis for 50%.",
      "Do not interpret the finding as a mass ratio, volume ratio, density, active conversion, or exact recipe ingredient amount.",
      "Do not generalize the manufacturer guidance to all barley-flour products, recipe methods, or flour grades; it is not controlled performance testing.",
      "The source says its starred barley flour may contain gluten; this is not gluten-free substitution guidance.",
      "No active global or contextual rule or bundled recipe link is supported by this source alone."
    ],
    "sourceIds": [
      "WP02-A6-TEFF-SUB-R725-20261018-S01"
    ]
  },
  "addDecision": {
    "outcome": "accepted",
    "reason": "Record the manufacturer’s explicit 50% barley-flour recommendation for replacing part of recipe whole-wheat flour as a narrow source-scoped finding. Keep the 50% basis unqualified and retain the existing study-based block on broader transfer. Add no active substitution rule, conversion, or recipe link.",
    "sourceIds": [
      "WP02-A6-TEFF-SUB-R725-20261018-S01",
      "WP02-A6-JAU-ATTA-BARLEY-20261012-S08",
      "WP02-A6-JAU-ATTA-BARLEY-20261012-S09"
    ]
  }
}
~~~

Do not alter the old study finding, the three current measurement observations, the active reference or aliases, forms, rules, recipe data, or generated index. Reuse the existing source ID registered on the teff-flour row rather than allocating a second identifier for the same PDF.

## Ownership, picker projection, and recipe demand

| Surface | Current audit and proposal effect |
| --- | --- |
| Reference ownership | `ingredient-ref-barley-flour` owns `barley flour / farine d’orge` and `jau atta`. Separate active rows own barley grain, malted barley flour, roasted barley flour, and whole barley flour. No active-name or alias change is proposed. |
| Source ownership | The exact Bob’s Red Mill PDF URL is already registered as `WP02-A6-TEFF-SUB-R725-20261018-S01` on the teff-flour row for the same guide’s teff recommendation. Reuse that source ID for this new, separate barley finding. Existing barley sources `WP02-A6-JAU-ATTA-BARLEY-20261012-S08` and `S09` are the two bread studies recorded in the prior blocked finding; this proposal does not replace or rewrite them. The proposed finding ID is not present in the live ledger. |
| Forms and active rules | The barley-flour row has no attached forms. Neither active substitution-rules file contains a rule mentioning it. Density remains null and unit mappings remain empty. No form or rule is proposed. |
| Phrase-first picker | With form terms included, `barley flour` returns four rows: barley flour, malted barley flour, roasted barley flour, and whole barley flour. `farine d’orge` returns the same four because the exact phrase occurs inside each qualified display. `jau atta` returns only barley flour; `farine d’orge maltée` returns only malted barley flour. The picker uses contiguous subphrase matching before substring fallback. These results remain unchanged because the proposal adds no active search term. |
| Bundled recipe demand | A manifest-driven scan read all 114 recipe files and counted 1,123 ingredient-array objects, including 1,097 rows with `ingredientRefId`. It found zero direct links to `ingredient-ref-barley-flour`, zero full-file normalized phrase hits, and zero ingredient-like row phrase hits for `barley flour`, `farine d’orge`, or `jau atta`. No recipe link is proposed. |

The picker projection follows `IngredientSearch.kt`: lowercase with `Locale.ROOT`, NFKD normalization, diacritic folding, punctuation-to-space conversion, contiguous word-phrase matching first, and substring fallback only when no phrase match exists. The corpus scan used only the 114 recipe paths listed by `manifest.v1.json`, counted ingredient-array objects separately from rows carrying a reference ID, and searched complete serialized recipe content and ingredient-like row objects separately.

## Static checks and test scope

- Read the live Section A7 checklist and R827 integration note, recent A7 proposals through R827, the current barley reference and ledger record, its earlier blocked replacement finding, forms, substitution-rule files, and the current picker implementation.
- Reopened the official Bob’s Red Mill PDF and the OQLF fiche. Confirmed the PDF’s exact 50% table entry, the existing source URL/ID owner, and the proposed finding ID’s availability.
- Projected current phrase-first queries from live references and forms and scanned all manifest-listed recipes. These checks are static data/document audits; no app test, build, emulator, or deployment was run.
- This file is proposal-only. If accepted, the integration changes only research-ledger JSON. Under `AGENTS.md`, JSON-only database additions do not require software tests.
