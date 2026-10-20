# WP02 A6 R773 — generic quinoa-flour substitution review — 2026-10-18

- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, generated file, or app file was edited.
- **Plan fit:** The broad [A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1855) remains open. This review covers the still-unresearched substitution state on the existing generic `ingredient-ref-quinoa-flour` row.
- **Exact open question:** Do the existing product guidance and primary bread study support a reusable replacement of wheat flour with generic quinoa flour?
- **Prior-work boundary:** R719 recorded Cuisine Soleil’s `1/4 cup (30 g)` portion and explicitly left substitution research unreviewed. R616 concerns roasted quinoa flour; R737 concerns white quinoa flour and already reviews Wang et al.; R740 concerns black quinoa flour. This review uses none of those separate findings or Wang et al.’s study. R770–R772 integration concerns black fonio flour, oatmeal-crisp families, and bluefish, not this row.
- **Proposal-local IDs:** New sources `WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S01` and `WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S02`; findings `quinoa-flour-wheat-bread-optimization-context-r773-20261018` and `quinoa-flour-cuisine-soleil-blend-guidance-blocked-r773-20261018`. Their source URLs, IDs, finding IDs, and proposal path were checked for prior ledger/archive ownership.

## Recommendation

Set `substitutionResearchState` on `ingredient-ref-quinoa-flour` to `blocked_pending_evidence` and append two source-scoped findings:

1. Kurek and Sokolova’s primary bread-optimization study reports a single optimized lab formula using a local supplier’s quinoa flour at a 5.41% wheat-flour replacement level and 219 μm particle size. The study does not identify the wheat-flour grade or a current product equivalent. Retain the tested context; do not make the 5.41% result a household recommendation.
2. Cuisine Soleil’s current page gives component ranges for its branded all-purpose flour blend, including 15–50% quinoa flour. The company also publishes a banana-blueberry muffin formula with quinoa, buckwheat, and brown-rice flours, gums, and no wheat flour. Neither source says to replace wheat flour in an existing recipe. Retain these as product-specific blend and recipe evidence, not as a generic substitution ratio.

The evidence does not identify a matching source-flour reference for the study or establish an adaptable home-recipe ratio. Preserve the R719 measurement state and product-specific portion. Add no `fromIngredientRefId`, `replacements`, active rule, recipe-line link, alias, form, density, unit mapping, conversion, or yield.

## Current row and evidence boundary

| Surface | Current state | R773 disposition |
|---|---|---|
| Active reference | `ingredient-ref-quinoa-flour`, `quinoa flour / farine de quinoa`, category `FLOUR_AND_STARCH`; no aliases, `defaultDensity: null`, empty `unitMappings`. | Keep unchanged. |
| Target ledger row | Identity `verified`; measurement `researched_no_supported_value`; substitution `not_yet_researched`; one R719 product-specific `portion_weight` observation; no substitution findings. | Change only substitution state; append the two findings and one decision. Preserve the R719 measurement evidence. |
| Existing Cuisine Soleil source | `WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S03` already owns the current manufacturer URL on this target row. | Reuse unchanged; do not create another source record or URL owner. |
| Forms, active rules, yields, recipe links | No form, global or contextual substitution rule, package-yield record, or bundled recipe line references the generic quinoa-flour ID. | Add none. |

The R719 portion belongs to one named Cuisine Soleil product and remains separate from reusable measurement and substitution behavior. The active catalog also distinguishes roasted, white, red, and black quinoa-flour rows; this review does not transfer their product or study evidence to generic quinoa flour.

## Primary study and manufacturer guidance

Kurek and Sokolova, [“Optimization of bread quality with quinoa flour of different particle size and degree of wheat flour replacement”](https://www.scielo.br/j/cta/a/Fz3sKNLscZ4sjgcnnzTCnyx/?lang=en), *Food Science and Technology* 40(2) (2020), 307–314, [DOI 10.1590/fst.38318](https://doi.org/10.1590/fst.38318), is the primary experimental source. The publisher’s abstract reports an optimized bread composition at **219 μm** quinoa-flour particle size and **5.41%** wheat-flour substitution. Sections 2.1–2.3 say a local supplier provided both flours; the researchers prepared quinoa-flour particle-size classes and used a central-composite design spanning 1.1–17.4% substitution. Section 3.6 reports the selected optimum. The paper describes one bread optimization and how particle size and substitution affected product properties. It does not identify the local flour supplier, wheat grade, cultivar, color, consumer package, or a household recipe that matches a RecipeBook ingredient reference. Although the active catalog has an all-purpose-flour reference and multiple specific wheat-flour classes, the paper does not identify its sample as all-purpose flour or any of those classes; do not assign one as the study’s source-flour reference.

The current [Cuisine Soleil quinoa-flour page](https://cuisinesoleil.com/en/product/quinoa-flour/) identifies a 100% organic quinoa flour and gives three-step guidance for a branded all-purpose flour blend: 50–85% brown-rice, oat, or millet flour; 15–50% quinoa flour; and 1–15% hemp or flax flour. This is first-party product guidance. The page gives component ranges rather than a single composition and does not say that quinoa flour replaces wheat flour in an existing recipe. The exact page is already registered as source `WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S03` on the target row, so no duplicate source is proposed.

The Cuisine Soleil product page lists a banana-muffin recipe among its recipes with quinoa flour, and the company separately publishes [Banana Blueberry Muffins](https://cuisinesoleil.com/en/recipe/banana-blueberry-muffins/). That gluten-free formula uses 1/2 cup quinoa flour, 1/4 cup buckwheat flour, 3/4 cup brown-rice flour, guar gum, and xanthan gum; it does not contain wheat flour. This supports one company-published flour blend in a specific muffin formula, but it gives no wheat-to-quinoa replacement instruction. Its distinct official URL is recorded separately from the already-owned product-page source.

The R737 white-quinoa review’s Wang et al. article is intentionally not reused. It is already recorded as formula-specific evidence on the separate white-quinoa row. R616’s roasted-flour studies, R740’s black-quinoa study, and the whole-quinoa/meals studies reviewed in A7 likewise do not become generic quinoa-flour replacement instructions here.

## Proposed ledger delta

Append this fragment to the existing generic quinoa-flour ledger record. Preserve its current sources, R719 measurement observation, decisions, and `measurementState: researched_no_supported_value`.

```json
{
  "recordId": "ingredient-ref-quinoa-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S01",
      "url": "https://www.scielo.br/j/cta/a/Fz3sKNLscZ4sjgcnnzTCnyx/?lang=en",
      "title": "Kurek, M.A., and Sokolova, N. Optimization of bread quality with quinoa flour of different particle size and degree of wheat flour replacement",
      "versionOrDate": "Food Science and Technology 40(2), 307–314 (2020); DOI 10.1590/fst.38318",
      "accessedOn": "2026-10-18",
      "locator": "Publisher abstract; §§2.1–2.3 materials and bread preparation; §§3.2–3.6 results and optimized bread; conclusion.",
      "supports": "Primary study of quinoa-flour particle size and wheat-flour replacement in bread. The authors report local-supplier wheat and quinoa flour, prepare quinoa particle-size classes, and test a response-surface design spanning 1.1–17.4% substitution. The selected lab-bread optimum is 219 μm quinoa flour and 5.41% substitution. The paper does not identify a wheat-flour grade, quinoa cultivar/color, or matching commercial flour, and the optimized result is not a reusable home-recipe ratio.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S02",
      "url": "https://cuisinesoleil.com/en/recipe/banana-blueberry-muffins/",
      "title": "Cuisine Soleil. Banana Blueberry Muffins",
      "versionOrDate": "Cuisine Soleil recipe page, undated; accessed 2026-10-18",
      "accessedOn": "2026-10-18",
      "locator": "Ingredient list and method. Cuisine Soleil’s quinoa-flour product page separately lists a banana-muffin recipe under recipes with this flour.",
      "supports": "First-party gluten-free muffin formula using 1/2 cup quinoa flour, 1/4 cup buckwheat flour, 3/4 cup brown-rice flour, guar gum, xanthan gum, and other ingredients. The formula contains no wheat flour and does not instruct the reader to replace wheat flour in an existing recipe.",
      "sourceKind": "manufacturer"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "quinoa-flour-wheat-bread-optimization-context-r773-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "One controlled bread optimization using locally sourced quinoa flour to replace a portion of local-supplier wheat flour.",
      "basis": "Kurek and Sokolova tested quinoa-flour particle sizes across a response-surface design with 1.1–17.4% wheat-flour substitution. Their selected optimum was a 219 μm quinoa-flour particle size and 5.41% substitution for the study’s bread and response criteria.",
      "limitations": [
        "The study identifies only local-supplier wheat flour. It does not identify the sample as all-purpose flour or as any specific cataloged wheat-flour class, so do not assign a source-flour reference.",
        "The quinoa flour is local-supplier material prepared into study-specific particle-size classes; it is not matched to the named Cuisine Soleil product or another current catalog product.",
        "The 5.41% optimum is specific to one experimental bread process and the study’s optimization goals. It is not a universal wheat-replacement starting point or a home-baking recommendation.",
        "No bundled recipe line supplies a matching flour, role, amount, or bread method for a recipe-specific link."
      ],
      "sourceIds": ["WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S01"]
    },
    {
      "findingId": "quinoa-flour-cuisine-soleil-blend-guidance-blocked-r773-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "Whether Cuisine Soleil’s product guidance and linked banana-blueberry muffin formula support replacing wheat flour in a home recipe.",
      "basis": "Cuisine Soleil lists quinoa flour at 15–50% as one component in its own all-purpose blend, alongside 50–85% brown-rice, oat, or millet flour and 1–15% hemp or flax flour. The company’s gluten-free Banana Blueberry Muffins formula uses 1/2 cup quinoa flour, 1/4 cup buckwheat flour, and 3/4 cup brown-rice flour, plus guar and xanthan gums; it contains no wheat flour. These are product-specific blend and recipe examples, not wheat-replacement instructions for an existing recipe.",
      "limitations": [
        "The guidance is for a named 100% organic Cuisine Soleil product and does not establish interchangeable behavior for every generic quinoa flour.",
        "The page lists broad component ranges rather than one complete formula; do not derive or combine percentages into an unreported blend.",
        "The company-published muffin recipe is a gluten-free formula with three flour ingredients and two gums; it contains no wheat flour and does not test a wheat-to-quinoa replacement.",
        "Neither page names wheat flour as the source ingredient to replace or gives adjustment instructions for modifying an existing wheat-flour recipe."
      ],
      "sourceIds": [
        "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S03",
        "WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S02"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the generic quinoa-flour substitution review by preserving the primary bread study and Cuisine Soleil’s branded blend/recipe evidence as separate blocked findings. The study does not identify a catalog wheat-flour counterpart or match its quinoa flour to a current product; the manufacturer’s component ranges and gluten-free muffin formula do not state wheat-flour replacement. Keep substitution behavior inactive and preserve the R719 product-specific measurement evidence.",
      "sourceIds": [
        "WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S01",
        "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S03",
        "WP02-A6-QUINOA-FLOUR-SUB-R773-20261018-S02"
      ]
    }
  ]
}
```

Do not add a `fromIngredientRefId`, `replacements`, or `ruleId` to either finding. The article’s wheat flour is not classified precisely enough to map to a current wheat reference, and the manufacturer gives a component blend rather than a source-to-replacement instruction. Add no global or contextual substitution rule.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches the current reference names, aliases, and attached form terms. This ledger-only proposal changes no picker fields, so results remain unchanged:

| Query | Current results | R773 effect |
|---|---|---|
| `quinoa flour` | Generic, roasted, black, red, and white quinoa-flour references | No change |
| `farine de quinoa` | Generic, roasted, black, red, and white quinoa-flour references | No change |
| `quinoa` | Black quinoa; black quinoa flour; puffed quinoa; quinoa; quinoa flakes; generic quinoa flour; red quinoa; red quinoa flour; roasted quinoa flour; white quinoa flour | No change |

## Recipe-corpus demand

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. No file or ingredient row contains `ingredient-ref-quinoa-flour`, `quinoa flour`, or `farine de quinoa`. The bundled quinoa-bites recipe uses cooked whole quinoa; it is not a quinoa-flour line. The corpus provides no recipe amount, source-flour role, or method to link to the experimental bread study. No recipe change is proposed.

## Ownership and static checks

- Confirmed the current A6 parent is still open and no previous generic-quinoa-flour substitution decision exists. R719 specifically leaves substitution unreviewed; R616, R737, and R740 cover separate flour identities.
- The SciELO article URL, DOI, S01 ID, and Cuisine Soleil recipe URL/S02 ID were not found in the live ledger or proposal/batch archive. Reuse Cuisine Soleil product source `WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S03`, already owned by this row; do not add a second owner for that product URL.
- Recomputed current phrase-first picker results from live names, aliases, forms, and `IngredientSearch.kt`; no active search data changes are proposed.
- Scanned every manifest-listed recipe file and ingredient row; found no direct reference or exact flour-name demand.
- Static document/data checks only. No software tests, build, emulator run, or deployment were performed.

This proposal closes only the generic quinoa-flour substitution evidence question. The broader WP02 A6 review remains open.
