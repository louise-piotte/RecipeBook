# WP02 Section A7 — hominy-grits substitution lead (R854, 2026-10-19)

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. The blocked finding and unresolved decision are in the research ledger; the plan and progress records are updated in the [R854–R856 integration README](../batches/wp02-wp03-wp04-r854-r856-gap-review-integration-20261019/README.md).
- **Plan anchor:** The Section A7 parent remains open for other grain meals and milling products ([global catalog plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). Its R794 child records the Pearl Milling Quick Grits portion and explicitly excludes a substitution ([plan, line 2311](../../RecipeBook-global-ingredient-catalog-plan.txt#L2311)); this review covers only that still-open substitution dimension.
- **Target:** Existing `ingredient-ref-hominy-grits` (`hominy grits / gruau de maïs`).
- **Scope and separation:** Review the manufacturer's direction to replace Quaker Quick Grits with regular Quaker or Aunt Jemima Enriched Hominy Grits in one named Quick Cheese Grits formula. This does not reopen R794's Pearl Milling portion, R851's spring-wheat semolina finding, R845's wheat-starch lead, R848's durum-flour lead, or the wider A7 checklist.
- **Ledger IDs:** `WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S01` through `S03`, and `hominy-grits-quaker-quick-cheese-regular-grits-replacement-r854-20261019`, are allocated on integration to retain the reviewed sources and blocked lead.

## Recommendation

Keep the manufacturer's direction as a **proposal-local blocked lead**, oriented **Quaker Quick Grits - Original → regular Quaker or Aunt Jemima Enriched Hominy Grits** for the named Quick Cheese Grits formula. Do not reverse the direction. The current Quaker product pages do not explicitly crosswalk both named grades to the active unqualified `hominy grits` ledger identity, and the recipe's ingredient list uses water while its replacement note says to increase milk to 2 1/4 cups. The note gives no baseline milk amount or explicit replacement quantity, and it does not identify the regular product by current SKU or package.

If accepted, change only the existing row's `substitutionResearchState` to `blocked_pending_evidence`, append the three manufacturer sources, and add one blocked ledger finding without `fromIngredientRefId` or `replacements`. The source explicitly names enriched hominy grits as the replacement, so the finding can be filed as a lead on this row; this does **not** map either commercial grade to an active form/reference or create a replacement relation. Preserve the exact direction and water/milk conflict. Add no active rule, form, alias, recipe link, or catalog mapping.

## Primary-source evidence and limits

| Proposal-local source ID / ownership | Official source and evidence | Limits for this ledger row |
|---|---|---|
| **New** `WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S01` | The Quaker Oats Company, [Quick Cheese Grits](https://www.quakeroats.com/cooking-and-recipes/quick-cheese-grits), current manufacturer recipe. It lists four servings, 1/2 cup Quaker Quick Grits - Original, and 2 cups water; the serving tip says to substitute “regular Quaker or Aunt Jemima Enriched Hominy Grits,” increase milk to 2 1/4 cups, and simmer 12–14 minutes. | Direct evidence of a product-named, one-recipe replacement direction. The listed recipe uses water, not milk; the source gives no baseline milk amount or explicit dry-grits amount for the replacement. It supplies no current SKU/GTIN for the regular Quaker or Aunt Jemima product. The recipe page's tip therefore cannot be applied as a complete adjustment. |
| **New** `WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S02` | The Quaker Oats Company, [Quick Grits: Original](https://www.quakeroats.com/products/hot-cereals/grits/quick-grits), current manufacturer product page. It calls the product white hominy, gives 5–7 minute stove-top instructions, and warns that formulation and packaging may change. | Confirms the named quick-product family and its current preparation range, but does not establish a formula for the Quick Cheese Grits substitution note or a transferable amount. |
| **New** `WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S03` | The Quaker Oats Company, [Old Fashioned: Standard Grits](https://www.quakeroats.com/products/hot-cereals/grits/grits-old-fashioned), current manufacturer product page. It identifies the Old Fashioned Standard Grits product and gives 15–20 minute stove-top instructions. | The page does not state that this current product is the exact “regular Quaker … Enriched Hominy Grits” wording in the recipe note; no package/SKU crosswalk or substitution formula is given. It corroborates a separate cooking-time grade only. |

The reviewed Quaker product pages establish that Quaker sells quick and old-fashioned/standard grits with different preparation times. They do not turn those commercial grades into active ingredient forms. This proposal does not transfer the note to Pearl Milling Quick Grits: R794's `1/4 cup (37 g)` is a separate Pearl Milling product-label observation, not an amount for Quaker's recipe or its replacement. It also does not transfer corn-grits, cornmeal, polenta, or masa-harina guidance to hominy grits.

## Pre-integration ownership and behavior audit

This table records the state reviewed before integration on 2026-10-19. The integrated state is summarized in the R854–R856 integration README.

| Surface | Current state and disposition |
|---|---|
| Active identity | `ingredient-ref-hominy-grits` is `hominy grits / gruau de maïs`, category `GRAIN_AND_CEREAL`; both alias lists are empty, density is null, and unit mappings are empty. Preserve it. |
| Ledger identity and measurement | Identity is `verified`; measurement is `researched_supported` because R794 records Pearl Milling Quick Grits, 1/4 cup (37 g), as one dry product-specific portion. Keep that observation and its source scope unchanged; do not transfer it to Quaker Quick or regular grits. |
| Ledger substitution status | `substitutionResearchState` is currently `not_yet_researched`, with no substitution findings on this row. The Quaker source URLs have no owner on another ledger record. A blocked ledger finding can retain the exact manufacturer lead on this row because the replacement wording explicitly says enriched hominy grits; omit `fromIngredientRefId` and `replacements` so neither Quaker grade is mapped to the active row or to another ingredient. |
| Forms and active rules | No ingredient form targets `ingredient-ref-hominy-grits`; the global and contextual substitution-rule files contain no rules. Do not create a `quick`/`regular` form from this recipe note or activate a rule. There is no separate active reference for the commercial grades. |
| Source and key ownership | The exact Quaker recipe URL and the two linked product URLs have no existing source owner in the ledger. The proposal-local source IDs have no current ledger or archive owner. No alias or catalog key is proposed. Existing identity evidence keeps `hominy grits` and `gruau de maïs` on the current row; the broader `grits` query is already multi-result. |
| Static picker projection | Phrase-first projection over current reference display names and aliases returns the hominy-grits row alone for `hominy grits` and `gruau de maïs`; `quick grits` and `regular hominy grits` return no row; `grits` returns six identities; `hominy` returns whole hominy corn and hominy grits. This proposal changes none of those terms. |
| Bundled recipe corpus | The live manifest lists 114 recipe files and 1,123 ingredient rows. Scanning each manifest-listed JSON file found no match for `ingredient-ref-hominy-grits`, hominy grits, Quick Grits, regular Quaker, Aunt Jemima, or `gruau de maïs`. The manufacturer's external recipe is not a bundled recipe; add no recipe link. |
| Prior-work ownership | R794 owns the Pearl Milling label portion only and explicitly left substitution out of scope ([R794 proposal](wp02-section-a7-next-grain-meal-gap-review-r794-20261019.md), [R794–R796 integration README](../batches/wp02-wp03-wp04-r794-r796-gap-review-integration-20261019/README.md)). R851 records a rejected U.S. hard-red-spring-to-durum-semolina class-level lead on its separate wheat-semolina row. Neither source or decision is reused here. The [R851–R853 integration README](../batches/wp02-wp03-wp04-r851-r853-gap-review-integration-20261019/README.md), [R845–R847 README](../batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md), and [R848–R850 README](../batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md) preserve those separate gaps. |

## Exact proposed data delta

Append three Quaker source records, one blocked finding, and one unresolved decision to the existing `ingredient-ref-hominy-grits` ledger record; set its substitution state to `blocked_pending_evidence`. The finding intentionally has no `fromIngredientRefId` and no `replacements`, so it records the source-local direction without asserting a product-grade crosswalk or runtime relation. The exact direction is **Quaker Quick Grits - Original → regular Quaker or Aunt Jemima Enriched Hominy Grits**, for Quaker's Quick Cheese Grits formula only. Its note states **increase milk to 2 1/4 cups and simmer 12–14 minutes**, but the current formula lists **2 cups water**. Do not reverse the direction, apply the inconsistent values, infer that the listed 1/2 cup dry quantity carries over, or map either product grade to an active catalog form/reference.

```json
{
  "recordId": "ingredient-ref-hominy-grits",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S01",
      "url": "https://www.quakeroats.com/cooking-and-recipes/quick-cheese-grits",
      "title": "The Quaker Oats Company, Quick Cheese Grits",
      "accessedOn": "2026-10-19",
      "locator": "Ingredients, cooking instructions, and serving tip",
      "supports": "The current four-serving recipe lists 1/2 cup Quaker Quick Grits - Original and 2 cups water. Its serving tip directs replacing the quick product with regular Quaker or Aunt Jemima Enriched Hominy Grits, increasing milk to 2 1/4 cups, and simmering 12 to 14 minutes. The recipe's listed liquid is water rather than milk, so the adjustment conflicts with its current formula. This is the manufacturer's source-local direction, not a crosswalk to a catalog form or ingredient replacement relation.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S02",
      "url": "https://www.quakeroats.com/products/hot-cereals/grits/quick-grits",
      "title": "The Quaker Oats Company, Quick Grits: Original",
      "accessedOn": "2026-10-19",
      "locator": "Product details and stove-top preparation",
      "supports": "The manufacturer identifies Quaker Quick Grits Original with white hominy and gives 5 to 7 minute stove-top directions; the page warns that formulation and packaging may change. It does not provide the Quick Cheese Grits replacement amount or a crosswalk to the active hominy-grits catalog row.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S03",
      "url": "https://www.quakeroats.com/products/hot-cereals/grits/grits-old-fashioned",
      "title": "The Quaker Oats Company, Old Fashioned: Standard Grits",
      "accessedOn": "2026-10-19",
      "locator": "Product details and stove-top preparation",
      "supports": "The manufacturer lists an Old Fashioned Standard Grits product and gives 15 to 20 minute stove-top directions. The page does not cross-reference the recipe's wording 'regular Quaker ... Enriched Hominy Grits' to a current SKU, package, or active catalog form.",
      "sourceKind": "manufacturer"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "hominy-grits-quaker-quick-cheese-regular-grits-replacement-r854-20261019",
      "researchState": "blocked_pending_evidence",
      "context": "Quaker's Quick Cheese Grits formula gives a product-specific direction: replace Quaker Quick Grits - Original with regular Quaker or Aunt Jemima Enriched Hominy Grits.",
      "basis": "The manufacturer recipe gives that direction and says to simmer 12 to 14 minutes, but its current ingredient list uses 2 cups water while the replacement tip says to increase milk to 2 1/4 cups. It does not state a baseline milk amount, explicitly carry over the listed 1/2 cup dry amount, or identify the regular product by current SKU/package. The current catalog has no distinct reference or form for these commercial grades. Retain the source direction without inferring an active ingredient mapping or a directed replacement relation.",
      "limitations": [
        "Keep the direction oriented from Quaker Quick Grits - Original to regular Quaker or Aunt Jemima Enriched Hominy Grits; do not reverse it.",
        "Scope the note to Quaker's Quick Cheese Grits formula; do not generalize it to all hominy grits, hot cereal, baking, or other grits recipes.",
        "Do not apply the 2 1/4 cup milk or 12 to 14 minute values until the conflict with the current water-based ingredient list is resolved.",
        "Do not infer that the listed 1/2 cup dry amount carries over or map either commercial grade to an active catalog form/reference without a current product/SKU crosswalk.",
        "Do not transfer Pearl Milling's R794 1/4 cup (37 g) portion or corn-grits, cornmeal, polenta, or masa-harina substitution guidance."
      ],
      "sourceIds": [
        "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S01",
        "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S02",
        "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S03"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "unresolved",
      "reason": "Retain the manufacturer's explicitly directional Quick Grits-to-regular/enriched hominy grits note as a blocked, source-local finding only. The current recipe's liquid conflict and the lack of a current product/SKU crosswalk prevent an executable adjustment or a mapped ingredient relation. No fromIngredientRefId or replacements are recorded; no active catalog mapping or substitution rule is added.",
      "sourceIds": [
        "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S01",
        "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S02",
        "WP02-A7-HOMINY-GRITS-SUB-R854-20261019-S03"
      ]
    }
  ]
}
```

## Static checks and retrieval limits

- Read the current `AGENTS.md`, A7 plan section, ledger schema and target row, active reference and form files, both substitution-rule files, catalog workflow, roadmap, R794 proposal/integration, and recent R845–R853 integration READMEs.
- Verified the three current Quaker manufacturer pages online. The pages loaded; their product formulation/packaging caveats remain applicable. The inconsistency between the Quick Cheese Grits ingredient list and its serving tip is visible on the current page, not a web-reader retrieval failure.
- Checked exact source URL and proposed source-ID ownership in the ledger/archive; no existing owner was found. Confirmed the current A7 parent and R794 child plan anchors.
- Parsed all 114 manifest-listed recipe files and counted 1,123 ingredient rows. Ran a static phrase-first projection using the search normalization and matching rules in `IngredientSearch.kt`; the queries and result counts are listed above.
- No shared catalog, ledger, recipe, generated file, or active-rule change is made by this proposal. The snippet above is only a proposed ledger delta for root review. No software tests, build, emulator, or deployment were run. Under `AGENTS.md`, a future change limited to database JSON data needs no software tests; static data/schema/ownership checks are the applicable verification.

## Hold alternative

Reopen ledger-level substitution research if a current manufacturer package or SKU crosswalk ties Quaker Quick Grits and the named regular/enriched grits products to the active hominy-grits identity, and an internally consistent current formula resolves the water/milk adjustment. Keep the A7 parent open.
