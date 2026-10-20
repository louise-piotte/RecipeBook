# WP02 A6 black quinoa flour substitution review — R740 — 2026-10-18

## Review record

- **Status:** Integrated in the WP02/WP03/WP04 R740–R742 batch. The formula-specific blocked finding and study source are recorded on the existing ledger row; no replacement rule or active catalog change was added.
- **Plan anchor:** The broad A6 flour review remains open at the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1827). [R728's proposal](wp02-a6-next-gap-review-r728-20261018.md) explicitly left black-quinoa-flour substitution research at `not_yet_researched` because Naturquinoa's usage text did not give a replacement amount or tested alternative.
- **Review boundary:** Complete that deferred question for `ingredient-ref-black-quinoa-flour`. R728's product-specific 60 g portion and the separate R737 white-quinoa-flour finding are not reopened.
- **Current checkpoint:** R737–R739 is the latest integrated checkpoint. It records 1,848 references, 177 forms, 114 manifest-listed recipes / 1,123 ingredient rows, and 2,234 ledger records. A6 remains open.
- **Proposal-local identifiers:** `WP02-A6-BLACK-QUINOA-SUB-R740-20261018-S01` and `black-quinoa-flour-bread-trial-context-blocked-r740-20261018` are absent from current shared data and the proposal archive; the output filename is also unique.

## Bounded recommendation

Update only the existing research-ledger row for `ingredient-ref-black-quinoa-flour`:

- Keep `identityState: verified`, `measurementState: researched_no_supported_value`, its R728 portion observation, and the active bilingual reference unchanged.
- Set `substitutionResearchState: blocked_pending_evidence` and append the source-scoped bread-trial finding below.
- Reuse the row's existing R728 Naturquinoa product-page and catalog source IDs as product/process context. Append the one new primary-study source only once.
- Keep `defaultDensity: null`, `unitMappings: []`, aliases, forms, conversions, package yields, recipe links, and active global/contextual rules unchanged.

The study establishes that black royal quinoa flour has been used in one controlled bread formulation. Its methods say the researchers ground ANAPQUI organic black royal quinoa seeds in a commercial blender and used ungraded commercial wheat flour from a local Carrefour supermarket. The bread formula included whole quinoa flour at 25 g per 100 g flour; the discussion and conclusion describe the bread as replacing 25% of wheat flour. That is useful formula-specific evidence, not a validated rule for a named catalog wheat-flour identity or a user's arbitrary bread recipe.

The target row's existing Naturquinoa evidence describes its ordinary black quinoa flour as polished, washed, physically desaponified, classified, and milled, and separately distinguishes its precooked product. No direct study/product match or equivalence of flour preparation is established. The study does not identify the supermarket flour grade: although the catalog has `all-purpose flour` and many grade-specific wheat-flour references, none can be selected as the tested source ingredient without inferring a grade. The current contextual rule model also cannot capture this source's particular flour, the experimental preparation, and the complete bread formula as a reusable amount rule. Keep the trial evidence in the ledger with no `fromIngredientRefId`, `replacements`, or `ruleId`.

## Current identity, number, and rule state

The active reference is `black quinoa flour / farine de quinoa noir` in `FLOUR_AND_STARCH`; both aliases arrays are empty. It has no attached form, density, unit mapping, global substitution rule, contextual substitution rule, package-yield record, or bundled recipe link. Its ledger row currently has verified identity, one R728 `portion_weight` observation for Naturquinoa's 60 g nutrition portion, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`.

The study's percentage is not a household measure and supplies no volume-to-mass relationship. Do not convert 25 g/100 g into a default substitution, density, unit mapping, or recipe-line amount. Naturquinoa's 60 g nutrition portion remains product-specific and does not define a substitution quantity.

## First-party and primary evidence

- The current [Naturquinoa black quinoa flour page](https://naturquinoa.com/harina-quinoa-negra/) describes the product as ground organic black royal quinoa, lists bakery/pastry applications, and says it requires cooking. It gives no wheat-flour replacement percentage or formula. The page returned an anti-bot interstitial on direct open during R728; its indexed first-party text remains the page's source evidence.
- Naturquinoa's existing [2020 product catalog](https://naturquinoa.com/wp-content/uploads/2020/04/CATALOGO-NQ.V6.pdf), PDF p. 5 / printed p. 11, §2.3, describes ordinary black quinoa flour as polished, washed, physically desaponified, classified, and milled. Section 3.3 separately describes precooked black quinoa flour. These source IDs are already owned by the target row under R728 and are reused without duplicate source entries.
- Ballester-Sánchez et al.'s primary open-access [2019 bread study](https://pmc.ncbi.nlm.nih.gov/articles/PMC6769893/) (Foods 8(9):379; DOI 10.3390/foods8090379) reports whole white, red, and black royal quinoa flours in bread. Sections 2.1–2.2 identify the ANAPQUI seed source, the blender grinding method, supermarket Carrefour wheat flour, and the formula (control: 500 g wheat flour; yeast 1.0 g/100 g flour; salt 1.6 g/100 g flour; water 70.8 g/100 g flour; quinoa flour 25 g/100 g flour). The results and conclusion describe replacement of 25% of wheat flour. The trial is limited to the authors' bread process and source materials; it does not identify a current RecipeBook wheat-flour reference or validate a general home-baking rule.

## Identity, alias, and picker projection

No identity or alias change is proposed. Keep `black quinoa flour / farine de quinoa noir` distinct from black whole quinoa, the generic flour, roasted quinoa flour, and white/red quinoa flours. Do not add Spanish product wording, brand wording, or the Naturquinoa-specific nutrition portion as aliases.

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) projection uses the active reference names, aliases, and forms, preferring complete word-phrase matches before substring fallback. Since R740 changes only ledger research state, results stay the same:

| Query | Current result | R740 effect |
|---|---|---|
| `black quinoa flour` | `ingredient-ref-black-quinoa-flour` | No change. |
| `farine de quinoa noir` | `ingredient-ref-black-quinoa-flour` | No change. |
| `black quinoa`; `quinoa noir` | `ingredient-ref-black-quinoa` and `ingredient-ref-black-quinoa-flour` | No change; both grain and flour remain visible. |
| `quinoa flour`; `farine de quinoa` | Five distinct rows: generic, roasted, black, red, and white quinoa flour | No change. |
| `harina de quinoa negra` | No result | No Spanish alias is added. |

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. Searches across serialized recipe files and ingredient rows for `ingredient-ref-black-quinoa-flour`, `black quinoa flour`, `farine de quinoa noir`, `harina de quinoa negra`, and `harina quinoa negra` found zero hits. The bundle supplies no recipe-specific amount, application method, or recipe-line source for a substitution. No recipe or recipe-line substitution is proposed.

## Proposed ledger delta

This is an append/update fragment for the existing target row, not a replacement record. Preserve all R728 sources, decisions, and the existing measurement observation. Reuse the two R728 Naturquinoa source IDs already on the row; add only the new study source, finding, and review decision shown here.

```json
{
  "recordId": "ingredient-ref-black-quinoa-flour",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-BLACK-QUINOA-SUB-R740-20261018-S01",
      "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC6769893/",
      "title": "Ballester-Sánchez et al., Development of Healthy, Nutritious Bakery Products by Incorporation of Quinoa",
      "versionOrDate": "Foods 8(9):379 (2019); DOI 10.3390/foods8090379",
      "accessedOn": "2026-10-18",
      "locator": "Sections 2.1–2.2 (materials and bread formula), 3.2 (bread results), and 4 (conclusions).",
      "supports": "Primary study uses whole white, red, and black royal quinoa flours in a controlled bread formula. The researchers grind ANAPQUI organic royal quinoa seeds with a commercial blender and use commercial wheat flour from a local Carrefour supermarket. Methods specify 25 g quinoa flour per 100 g flour, while the results and conclusion characterize the bread as a 25% replacement of wheat flour. The study does not identify a catalog-grade wheat flour, match the Naturquinoa product, or establish a reusable recipe rule.",
      "sourceKind": "other"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "black-quinoa-flour-bread-trial-context-blocked-r740-20261018",
      "researchState": "blocked_pending_evidence",
      "context": "One controlled bread study incorporating whole black royal quinoa flour at 25 g per 100 g flour; the authors describe the bread as replacing 25% of wheat flour.",
      "basis": "The formula combines the study's black quinoa flour with its supermarket Carrefour commercial wheat flour, yeast, salt, water, and breadmaking process. The source does not name a wheat grade or RecipeBook source-reference ID. Its reported ratio is bounded to that experimental bread formula.",
      "limitations": [
        "The study's source flour is ungraded supermarket wheat flour. Do not assign the result to all-purpose flour, whole-wheat flour, or any other active wheat-flour reference without a source match.",
        "The researchers grind ANAPQUI organic black royal quinoa seeds with a commercial blender; no tested match to Naturquinoa's described milling process or flour batch is established.",
        "The reported 25% is part of a specific controlled bread formula and method. Do not apply it to other recipe types or arbitrary bread recipes.",
        "No bundled recipe line, matching source-flour ID, adjustment guidance, or transferable ingredient pair supports a contextual rule or recipe-line substitution."
      ],
      "sourceIds": [
        "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S01",
        "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S02",
        "WP02-A6-BLACK-QUINOA-SUB-R740-20261018-S01"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Complete the deferred black-quinoa-flour substitution review by retaining the 25% bread-trial result as formula-specific evidence. The source does not identify a catalog wheat-flour counterpart or establish a tested match to the Naturquinoa product, so reusable substitution research remains blocked and no active substitution behavior is added.",
      "sourceIds": [
        "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S01",
        "WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S02",
        "WP02-A6-BLACK-QUINOA-SUB-R740-20261018-S01"
      ]
    }
  ]
}
```

The fragment intentionally has no `fromIngredientRefId`, `replacements`, or `ruleId`. No active reference, form, package yield, rule file, recipe, or generated index changes. Reopen if a source identifies the exact wheat flour and a tested product/method scope that can be represented safely.

## Source ownership and review checks

- The Naturquinoa product page and catalog URLs are already owned once on `ingredient-ref-black-quinoa-flour` by `WP02-A6-BLACK-QUINOA-FLOUR-MEASURE-R728-20261018-S01` and `...-S02`. They are referenced by ID in the finding rather than duplicated.
- At review time, the PMC article URL and proposed R740 source ID had no ledger owner. Integration added the source, finding, and decision to the existing row; no source ID, finding ID, or output filename collided with current data or the proposal archive.
- The 114-recipe / 1,123-row manifest counts, catalog state, source ownership, active rule references, recipe corpus, and picker projection were checked against the current package and ledger. The fragment uses the current ledger's allowed `blocked_pending_evidence` state and source fields.
- Relative links in this proposal target the A6 plan, R728 proposal, and `IngredientSearch.kt`; UTF-8/no-BOM, mojibake, and scoped whitespace checks are recorded after the file is written.
- No software tests, build, emulator run, or deployment were performed. The integrated change only adds database JSON, which `AGENTS.md` exempts from testing.

The broader WP02 Section A6 review remains open.
