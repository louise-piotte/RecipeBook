# WP02 Section A7 R836 — emmer-semolina substitution evidence

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, generated index, or recipe file was changed.
- **Plan anchor:** The open A7 parent remains `[ ] Continue A7 review of other grain meals (including the unresolved wheat-meal candidate) and milling products` ([live checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). This review covers a separate unresearched ledger dimension on the existing `ingredient-ref-emmer-semolina` row. R440 completed the identity decision and R640 recorded one formula-specific portion; R640 deliberately left `substitutionResearchState: not_yet_researched`. R836 does not reopen either completed decision. It does not transfer R809's durum-semolina finding to emmer semolina and is separate from R833's granular-flour substitution review and R830's barley-flour review.

## Recommendation

On the existing `ingredient-ref-emmer-semolina` ledger row, set `substitutionResearchState` to `researched_no_supported_substitute` and append a source-bounded finding with no replacements. The evidence reviewed does not establish an actionable replacement for Anson Mills Ancient Emmer Semolina or a direction for replacing another ingredient with it.

Anson Mills describes this product as nearly 100% whole grain and distinguishes it from modern industrial durum semolina. Its current Gnocchi alla Romana recipe uses the emmer product directly. Its Ancient Emmer Pita Bread recipe combines emmer semolina with the mill's Pizza Maker's Flour as separate formula ingredients; that co-use is not a substitute instruction or a ratio for replacing one with the other. King Arthur Baking's equal-volume bread-flour advice is for semolina flour, which the article defines as coarsely ground durum. Neither that generic durum guidance nor Anson Mills' product description supports transferring a replacement recommendation to this near-whole-grain emmer product.

Keep this result limited to these sources. It is not a claim that no substitution could be developed or that no other source exists. Do not add an active global or contextual rule, recipe link, form, alias, or measurement. Preserve the active reference and its search behavior, density, and mappings.

## Identity and ownership

The active identity is `ingredient-ref-emmer-semolina`, category `FLOUR_AND_STARCH`, displayed as **emmer semolina / semoule de blé amidonnier**, with empty English and French alias arrays, `defaultDensity: null`, and `unitMappings: []`. The ledger row is `verified`, its measurement state is `researched_supported`, and it already contains one Anson Mills Gnocchi alla Romana portion observation (1½ cups / 8 ounces). Its substitution state is still `not_yet_researched`, with no substitution findings.

Keep neighboring identities distinct: `ingredient-ref-emmer-flour`, `ingredient-ref-emmer-grain`, `ingredient-ref-durum-semolina`, `ingredient-ref-semola-rimacinata`, `ingredient-ref-spring-wheat-semolina`, and `ingredient-ref-barley-semolina`. Do not add `durum semolina`, `bread flour`, or Anson Mills' Pizza Maker's Flour as aliases or replacements. R440's Canadian mill source identifies emmer semolina as an ingredient in finished fettuccine, not a substitute relationship.

## Primary source review

| Source ID | Source | Evidence and boundary |
| --- | --- | --- |
| Existing `WP02-A7-EMMER-SEMOLINA-R440-20261017-S03` | Anson Mills, [Ancient Emmer Semolina](https://ansonmills.com/products/98), current product description. | Describes the product as stone-milled and hand-bolted, nearly 100% whole grain, and usable in porridge, breads, pasta, and gnocchi. It contrasts this with industrial durum semolina, whose bran and germ are removed. It gives no replacement ingredient, direction, ratio, or adjustment. |
| Existing `WP02-A7-EMMER-SEMOLINA-MEASURE-R640-20261018-S01` | Anson Mills, [Gnocchi alla Romana](https://ansonmills.com/recipes/589), introduction and formula. | Calls the emmer product the forerunner of modern durum semolina, describes its softer gnocchi compared with modern durum, and lists 1½ cups (8 ounces) for this formula. The recipe gives no replacement direction. This does not make emmer semolina and durum semolina interchangeable. |
| New `WP02-A7-EMMER-SEMOLINA-SUB-R836-20261019-S01` | Anson Mills, [Ancient Emmer Pita Bread](https://ansonmills.com/recipes/593), introduction, formula, and directions. | The mill describes Ancient Emmer Semolina and Pizza Maker's Flour as the two flours selected for this recipe. Its dough formula lists 6 ounces of Pizza Maker's Flour and 3 ounces of Ancient Emmer Semolina separately. The method uses both; it does not propose replacing one with the other or supply a substitution ratio. |
| Existing `WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01` (reused from the durum-semolina ledger row) | King Arthur Baking, [What Is Semolina Flour, and How Do I Bake With It?](https://www.kingarthurbaking.com/blog/2023/06/20/what-is-semolina-flour-and-how-do-i-bake-with-it), “What is semolina flour?” and “How to substitute for semolina flour.” | Defines semolina flour as coarsely ground durum and recommends bread flour by equal volume as an in-a-pinch substitute for that flour. It does not discuss emmer semolina or Anson Mills' whole-grain product; the generic durum recommendation is not applied to this row. Reuse the existing source ID and URL; add no duplicate source record. |

Anson's product page and its two current formula pages are manufacturer sources and were directly accessible on 2026-10-19. The King Arthur source is already recorded on the durum-semolina row by R809. R836 mirrors that same source entry on the emmer-semolina row under its existing source ID and URL so the rejected generic candidate is traceable; no new King Arthur source ID or URL is allocated. The finding does not claim an exhaustive search of all recipes, brands, or third-party publications.

## Catalog, picker, rules, and recipe audit

| Surface | Current state and proposed effect |
| --- | --- |
| Identity and aliases | One active reference owns the exact English and French names. The aliases are empty. Keep the display pair, category, and aliases unchanged. Emmer flour and emmer grain remain separate owners. |
| Measurement and forms | The ledger already has the R640 product-specific portion. Active density is null and unit mappings are empty. No ingredient form is attached to emmer semolina. Preserve all measurement data and add no form. |
| Active substitution rules | The global and contextual rule files each contain zero rules and no target reference. Add no rule. |
| Search projection | `IngredientSearch.kt` applies NFKD/accent folding, phrase-first matching, then partial matching across names, aliases, and forms. Exact `emmer semolina` and `semoule de blé amidonnier` queries each return only this reference; `emmer` also returns emmer flour and emmer wheat, while broad `semolina` returns other grain-specific identities. Names, aliases, and the projection remain unchanged. |
| Bundled recipe demand | A manifest-driven scan parsed all 114 recipe files and their 1,123 ingredient rows. It found zero direct links to `ingredient-ref-emmer-semolina` and zero full-file or ingredient-row text matches for `emmer semolina`, `semoule de blé amidonnier`, or the target ID. No bundled recipe link is proposed. |

## Exact proposed ledger delta

Apply only to `records[]` where `recordId == "ingredient-ref-emmer-semolina"`. Retain all other source entries, the R640 measurement state and observation, and existing decisions.

1. Set `substitutionResearchState` to `researched_no_supported_substitute`.
2. Append the Anson Mills source and mirror the existing King Arthur source entry on this row. Preserve the R809 source ID, URL, title, date, locator, support text, and kind exactly; do not allocate a new source ID or URL for that page.

```json
[
  {
    "sourceId": "WP02-A7-EMMER-SEMOLINA-SUB-R836-20261019-S01",
    "url": "https://ansonmills.com/recipes/593",
    "title": "Anson Mills, Ancient Emmer Pita Bread",
    "accessedOn": "2026-10-19",
    "locator": "Introduction, dough ingredient list, and method; the formula lists 6 ounces of Anson Mills Pizza Maker's Flour and 3 ounces of Anson Mills Ancient Emmer Semolina.",
    "supports": "The manufacturer describes its Ancient Emmer Semolina and Pizza Maker's Flour as the two flours selected for this pita recipe, lists them separately in the formula, and uses both in the method. It gives no replacement direction or substitution ratio. Co-use in this formula is not evidence that either ingredient can replace the other.",
    "sourceKind": "test_kitchen"
  },
  {
    "sourceId": "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01",
    "url": "https://www.kingarthurbaking.com/blog/2023/06/20/what-is-semolina-flour-and-how-do-i-bake-with-it",
    "title": "King Arthur Baking, What is semolina flour, and how do I bake with it?",
    "versionOrDate": "Published 2023-06-20",
    "accessedOn": "2026-10-19",
    "locator": "Opening definition and semolina-flour substitution section.",
    "supports": "Defines semolina flour as coarse-ground durum wheat. For a recipe that calls for semolina flour, recommends equal volume bread flour in a pinch and also permits all-purpose flour, preferring bread flour because its protein is closer. Does not state a separate all-purpose-flour amount or report a comparative trial.",
    "sourceKind": "culinary_reference"
  }
]
```

3. Append this finding:

```json
{
  "findingId": "emmer-semolina-no-supported-substitute-r836-20261019",
  "researchState": "researched_no_supported_substitute",
  "fromIngredientRefId": "ingredient-ref-emmer-semolina",
  "replacements": [],
  "context": "Whether a source-supported, actionable replacement for emmer semolina is documented for household recipes, including gnocchi alla Romana and pita dough.",
  "basis": "Anson Mills describes its Ancient Emmer Semolina as a nearly 100% whole-grain, stone-milled product distinct from industrial durum semolina. Its Gnocchi alla Romana and Ancient Emmer Pita Bread recipes use the named emmer product directly and give no replacement direction, ratio, or adjustment. The pita formula uses its Pizza Maker's Flour and emmer semolina as separate ingredients; this co-use is not a substitute relation. King Arthur Baking's equal-volume bread-flour advice applies to semolina flour it defines as coarsely ground durum and does not address Anson's emmer product. The reviewed sources therefore do not support an actionable replacement for this emmer-semolina product.",
  "limitations": [
    "This is a source-bounded no-supported-substitute result, not proof that no substitution could be developed or that no other source exists.",
    "Do not transfer the generic equal-volume bread-flour advice for durum semolina to this nearly whole-grain emmer product.",
    "Do not infer a substitute from Anson Mills calling emmer the forerunner of durum, from similar particle texture, or from application overlap.",
    "Do not interpret Pizza Maker's Flour and emmer semolina appearing together in the pita formula as a replacement ratio or substitution instruction.",
    "The sources do not establish a replacement amount, method, dough adjustment, context, or expected effect for this target; no active rule or bundled recipe link is supported."
  ],
  "rejectedCandidates": [
    {
      "candidate": "Equal-volume bread flour",
      "reason": "King Arthur Baking offers this option for generic durum semolina flour; its page does not test or address Anson Mills' nearly whole-grain emmer semolina.",
      "sourceIds": [
        "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01",
        "WP02-A7-EMMER-SEMOLINA-R440-20261017-S03"
      ]
    },
    {
      "candidate": "Anson Mills Pizza Maker's Flour",
      "reason": "Anson Mills' pita recipe uses it alongside the emmer semolina as a separate formula ingredient and provides no replacement direction or ratio.",
      "sourceIds": [
        "WP02-A7-EMMER-SEMOLINA-SUB-R836-20261019-S01"
      ]
    }
  ],
  "sourceIds": [
    "WP02-A7-EMMER-SEMOLINA-R440-20261017-S03",
    "WP02-A7-EMMER-SEMOLINA-MEASURE-R640-20261018-S01",
    "WP02-A7-EMMER-SEMOLINA-SUB-R836-20261019-S01",
    "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01"
  ]
}
```

4. Append this decision:

```json
{
  "outcome": "accepted",
  "reason": "Complete the source-bounded substitution-evidence review for the existing emmer-semolina identity. The reviewed Anson Mills product page and formulas do not provide an actionable replacement, while King Arthur Baking's equal-volume bread-flour guidance is specific to generic durum semolina and does not address this nearly whole-grain emmer product. Keep the no-supported-substitute finding limited to these sources; do not add a replacement, active substitution behavior, form, alias, recipe link, or measurement change.",
  "sourceIds": [
    "WP02-A7-EMMER-SEMOLINA-R440-20261017-S03",
    "WP02-A7-EMMER-SEMOLINA-MEASURE-R640-20261018-S01",
    "WP02-A7-EMMER-SEMOLINA-SUB-R836-20261019-S01",
    "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01"
  ]
}
```

Do not change the active ingredient reference, forms, global or contextual rules, generated index, recipe files, package yields, R640 measurement observation, or other ledger records.

## Static checks and test scope

- Read the current `AGENTS.md`, open A7 plan anchor, roadmap, workflow, and R833–R835 integration README. Re-read the R440 identity and R640 portion proposals and checked that no prior proposal addresses this emmer-semolina substitution dimension.
- Reopened the current Anson Mills product page and manufacturer recipe pages for Gnocchi alla Romana and Ancient Emmer Pita Bread. The Anson pages distinguish the near-whole-grain emmer product from industrial durum semolina and provide recipe uses without a replacement instruction. Checked the King Arthur Baking article's definition and generic durum semolina recommendation as a boundary; it does not name emmer.
- Confirmed one active reference and one ledger row for the target, no attached form, null density, empty unit mappings and aliases, one existing measurement observation, no existing substitution findings, and `not_yet_researched` substitution state. The active global and contextual rule files are empty. The new Anson recipe source ID and URL are unowned; the reused King Arthur ID maps to the same URL already on the durum-semolina row, with no conflicting source-ID/URL ownership.
- Reproduced the exact phrase search behavior from `IngredientSearch.kt` and scanned all 114 manifest-listed recipes, 1,123 ingredient rows, and full recipe JSON text. Found no target link or target phrase match.
- This is a Markdown-only proposal. No tests, build, emulator, or deployment were run. If accepted, the only database edit is to add research evidence in the ledger JSON; under the updated `AGENTS.md` rule, database-JSON-only changes need no software tests.
