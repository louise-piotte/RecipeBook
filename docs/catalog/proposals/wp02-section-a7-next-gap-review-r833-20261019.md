# WP02 Section A7 R833 — granular-flour substitution evidence

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, generated index, or recipe file was changed.
- **Plan anchor:** Section A7 remains open for other grain meals and milling products ([live A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2284)). This review completes only the unresearched substitution-evidence dimension for the separate Ardent Mills `granular flour / farine granulaire` identity added at R455. It does not overlap R830's barley-flour finding, R827–R829, or a completed A7 item. R455 already set measurement research to `researched_no_supported_value`.

## Recommendation

On the existing `ingredient-ref-granular-flour` ledger row, set `substitutionResearchState` to `researched_no_supported_substitute` and append one evidence-only no-substitute finding. Ardent Mills describes its granular flour as an application-specific product for bakery goods, dusting, and thickening, but its current bilingual product pages and portfolio give no replacement ingredient, direction, quantity, ratio, or process for replacing another ingredient.

Keep the finding limited to the current Ardent Mills product evidence. The 2023 portfolio calls Talisman Granular an “instant blending flour” and says it is best used for dusting or thickening. That is a use description; it does not establish that the product replaces a particular starch, flour, or other thickener in a recipe. Likewise, listing breads, pastries, sauces, and gravies as applications does not show that granular flour can replace another ingredient in those products.

Leave `measurementState: researched_no_supported_value`, the active bilingual name pair, empty aliases, `defaultDensity: null`, and `unitMappings: []` unchanged. Add no measurement observation, form, recipe link, global rule, contextual rule, or active substitution. Keep this separate from the active Farina/spring-wheat-semolina, Wheatlets, durum-semolina, and all-purpose-flour identities.

## Identity and current evidence

The active reference is `ingredient-ref-granular-flour`, category `FLOUR_AND_STARCH`, displayed as **granular flour / farine granulaire**, with no aliases. The R455 ledger row has verified identity, `researched_no_supported_value` measurement status, and `not_yet_researched` substitution status. It already owns the four Ardent Mills sources below; no new source ID or duplicate URL is needed.

| Existing source ID | Current primary source | Evidence and limit |
| --- | --- | --- |
| `WP02-A7-GRANULAR-FLOUR-R455-20261017-S01` | Ardent Mills Canada, [Granular Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/granular-flour/), product applications and specifications. | The current page describes granular flour made from Canadian hard-red-spring wheat and lists bread, bun, roll, croissant, pastry, premium dusting-flour, and sauce/gravy-thickener applications. It lists 20 kg bags and totes, and says Ardent Mills does not sell directly to home bakers or consumers. It supplies no home measure or replacement instruction. |
| `WP02-A7-GRANULAR-FLOUR-R455-20261017-S02` | Ardent Mills Canada, [Farine granulaire](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/granular-flour/), current French product page. | Confirms the same product applications in French, including premium dusting flour and thickening agent for preparations and sauces. It supplies no replacement direction or ratio. |
| `WP02-A7-GRANULAR-FLOUR-R455-20261017-S03` | Ardent Mills Canada, [Flour Portfolio](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf), February 2023, p. 2, code 10392. | Calls Talisman Granular an “instant blending flour” best used for dusting or thickening. The portfolio names no ingredient that it replaces and gives no amount, ratio, or method. It lists Wheatlets and Farina as separate products. |
| `WP02-A7-GRANULAR-FLOUR-R455-20261017-S04` | Ardent Mills Canada, [Gamme de farine](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf), February 2023, code 10392. | Describes Talisman Granuleuse as a granular “farine à mélanger instantanée” used for dusting or thickening. It gives no replacement ingredient, direction, ratio, or method. |

The current English and French pages were reopened on 2026-10-19. Their use statements agree with the existing R455 source descriptions. No new source entry is proposed; all four source records are already attached to the target row. The English portfolio source ID is also reused on the Wheatlets row for its distinct-product boundary, with the same URL.

## Substitution boundary

No reviewed primary source instructs a cook or baker to replace another ingredient with this product, or to replace granular flour with another ingredient. The manufacturer's stated applications are not substitution instructions. “Thickening agent” does not identify a displaced ingredient, sauce composition, amount, or preparation method; “instant blending flour” is not a transferable ratio.

Do not infer a relationship with cornstarch, all-purpose flour, Farina/spring-wheat semolina, Wheatlets, durum semolina, or any other named flour from application overlap, granularity, or the word “instant.” Third-party listings with generic baking claims are not used to broaden the manufacturer's product-specific evidence. The finding does not say that no substitution could ever be designed; it records that the reviewed sources support no actionable replacement relation.

## Catalog, ownership, picker, and recipe audit

| Surface | Current state and proposed effect |
| --- | --- |
| Identity and search-term ownership | `ingredient-ref-granular-flour` owns `granular flour / farine granulaire`; both alias lists are empty. `ingredient-ref-spring-wheat-semolina` owns `farina flour / farine farina`; `ingredient-ref-wheatlets` owns `Wheatlets`. Keep all names and aliases unchanged. |
| Measurement and forms | The ledger already records `researched_no_supported_value`; the active density is null and unit mappings are empty. No form mentions the target or its display names. No measurement or form change is proposed. |
| Active substitution rules | The global and contextual substitution-rule files contain zero rules and no target mention. Add no rule. |
| Picker projection | Current searches for `granular flour`, `farine granulaire`, `granular`, and `granulaire` each return only this row. `Talisman`, `instant blending flour`, and `instant flour` return no row; `Wheatlets` returns only Wheatlets; `farina flour` returns only spring-wheat semolina. No picker terms change. Projection follows the app's current NFKD/accent-folded phrase-first matching and partial fallback in `IngredientSearch.kt`. |
| Bundled recipe demand | A manifest-driven scan parsed all 114 listed recipe files and 1,123 ingredient rows (1,097 with `ingredientRefId`). It found no direct target link and no full-recipe or ingredient-row hit for `granular flour`, `farine granulaire`, Talisman, “instant blending flour,” or the target ID. No recipe link is proposed. |

## Exact proposed ledger delta

Apply only to `records[]` where `recordId == "ingredient-ref-granular-flour"`:

```json
{
  "replace": {
    "substitutionResearchState": "researched_no_supported_substitute"
  },
  "addSubstitutionFinding": {
    "findingId": "granular-flour-no-supported-substitute-r833-20261019",
    "researchState": "researched_no_supported_substitute",
    "fromIngredientRefId": "ingredient-ref-granular-flour",
    "replacements": [],
    "context": "Whether Ardent Mills granular flour has a source-supported, actionable replacement relationship for household recipes, including its stated dusting and thickening applications.",
    "basis": "Ardent Mills' current bilingual product pages list bakery products, premium dusting flour, and sauce/gravy thickening as applications. Its February 2023 English and French portfolios describe Talisman Granular as an instant blending flour best used for dusting or thickening. None identifies an ingredient to replace, a replacement direction, quantity, ratio, or process. These uses do not establish a tested or actionable substitute relationship.",
    "limitations": [
      "Do not convert the manufacturer's application list into a substitution claim.",
      "The words 'thickening agent' and 'instant blending flour' do not identify a displaced ingredient, formula, quantity, ratio, or method.",
      "Do not infer a relationship with cornstarch, all-purpose flour, Farina/spring-wheat semolina, Wheatlets, durum semolina, or another flour from functional overlap or product wording.",
      "The pages describe an industrial product available in 20 kg bags and totes and state that Ardent Mills does not sell directly to home bakers or consumers; this finding does not establish home-recipe behavior.",
      "No global or contextual substitution rule or bundled recipe link is supported by the reviewed sources."
    ],
    "sourceIds": [
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S01",
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S02",
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S03",
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S04"
    ]
  },
  "addDecision": {
    "outcome": "accepted",
    "reason": "Complete the substitution-evidence review for the existing granular-flour identity. The manufacturer documents applications for baking, dusting, and thickening but no replacement ingredient, direction, amount, ratio, or method. Keep the source-bounded no-substitute finding in the ledger and add no active substitution behavior.",
    "sourceIds": [
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S01",
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S02",
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S03",
      "WP02-A7-GRANULAR-FLOUR-R455-20261017-S04"
    ]
  }
}
```

Do not alter the reference row, source entries, measurement status, observations, forms, rules, generated index, package yields, or recipes.

## Static checks and test scope

- Read the current `AGENTS.md`, A7 plan and roadmap status, workflow, R830–R832 integration, R455 identity proposal, active reference and ledger rows, form catalog, both substitution-rule files, search implementation, and manifest-listed recipe corpus before selecting the target.
- Reopened the current Ardent Mills English and French product pages and the official February 2023 flour portfolios. Confirmed the exact applications, industrial formats, consumer-sales limitation, and the absence of a source-stated replacement ingredient, amount, ratio, or method.
- Confirmed the four cited source IDs and URLs already belong to the target ledger row; the proposed finding ID is not currently present. The active catalog has one matching target ID, no matching form, and no active substitution-rule reference.
- The proposal is Markdown only. No app tests, build, emulator run, or deployment were performed. If accepted, the only data change is a research-ledger JSON addition under the `AGENTS.md` no-testing rule for database-JSON-only changes.
