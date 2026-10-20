# WP02 Section A7 R656: Khorasan semolina recipe-portion review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated as a formula-specific research-ledger observation. No active catalog, recipe, conversion, density, mapping, form, or substitution data changed.
- **Plan anchor:** Section A7 remains open for review of other grain meals and milling products in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). R653 covers a separate remilled-durum-semolina formula.
- **Candidate:** The existing ingredient reference ingredient-ref-khorasan-semolina, displayed as Khorasan semolina / semoule de blé khorasan. Its identity is verified. The ledger has no measurement observations, and its active density and unit mappings are empty.
- **Distinct scope:** R469 established this identity and rejected using package sizes and experimental milling quantities as reusable measurements. R656 adds one newly found recipe-published ingredient amount, without reconsidering identity, adding aliases, or treating the amount as reusable.
- **Audit scope:** Reviewed Requirements.md conversion rules, AGENTS.md, the active plan and roadmap, current ingredient references/forms/rules/yields, ledger row/schema, recent A7 proposals including R653, and all 114 bundled recipes.

## Recommendation

Make one bounded ledger-only update to ingredient-ref-khorasan-semolina:

1. Change measurementState from researched_no_supported_value to researched_supported for the source-specific formula observation below.
2. Add the current Kitchen Stories recipe page as one source and record its published 70 g amount of Kamut semolina for that complete recipe.
3. Keep identityState verified and substitutionResearchState not_yet_researched.

**Active numeric behavior supported:** none. This is one formula's ingredient mass only. The recipe page gives no volume, measuring method, or separate per-serving quantity. Do not derive 35 g per serving from its two-serving yield. Do not add a reusable measure, density, mapping, conversion, serving amount, form, recipe link, or substitution.

## Source evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| Kitchen Stories, [Kamut semolina porridge](https://www.kitchenstories.com/en/recipes/kamut-semolina-porridge), with Eat this! listed as contributor; accessed 2026-10-18 | The page labels the formula as 2 servings, lists 70 g kamut semolina, and directs adding it to heated plant-based milk. This supports the total recipe ingredient amount only. | It gives no volume amount, cup-fill method, separate weighing procedure, product SKU, or milling grade. The amount is not per serving; do not divide it by two or transfer it to another formula. |
| KAMUT International, [Flour](https://www.kamut.com/flour), current brand-owner page; accessed 2026-10-18 | The brand owner says mills make semolina, re-milled semolina, and whole semolina from KAMUT brand wheat. This supports the grain and milling-product relationship for the recipe's wording. | The source confirms that distinct semolina grades exist. The recipe does not identify a grade or specific producer. Keep the observation bound to the recipe wording and do not make Kamut an active alias. |
| Existing ledger source WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S03 | Molino Grassi's product specification documents a fine-calibration KAMUT brand Khorasan semolina product. | This is an existing product-specific source; do not duplicate it or use it to infer that the recipe's ingredient has that grade. |

The recipe's use of “Kamut” is source wording for the brand. The app's active bilingual display remains unchanged. No new French translation or Québec-facing alias is proposed.

## Ownership, picker, and recipe-demand audit

| Surface | Current state | R656 disposition |
|---|---|---|
| Active identity and aliases | ingredient-ref-khorasan-semolina owns Khorasan semolina / semoule de blé khorasan with empty alias arrays, category FLOUR_AND_STARCH, defaultDensity null, and unitMappings empty. | Preserve the existing identity and bilingual display. Add no alias, including Kamut semolina. |
| Neighboring identities | Khorasan grain, flour, flakes, and puffed wheat are separate. Durum, remilled durum, spring-wheat, emmer, barley, and sorghum semolinas are separate. | Record the formula amount only on the existing Khorasan-semolina ledger row. Do not transfer it to any other identity or grade. |
| Ledger and source ownership | The target row has no measurementObservations. The Kitchen Stories URL, proposed R656 source ID, and observation ID are absent from the active ledger and repository proposal/batch archive. Reuse R469's existing KAMUT brand-owner source rather than duplicating its URL or source ID. | Append one recipe source, one formula-specific observation, and one decision. Preserve all existing sources and decisions. |
| Forms, conversions, substitutions, and package yields | No ingredient form, form-conversion rule, contextual-substitution rule, or package-yield record refers to this reference. Density is null, mappings are empty, and substitution research remains not yet researched. | Add none. The recipe does not support a form change, conversion, density, yield, or substitute. |
| Picker | The English and French display terms are owned by this row. Kamut semolina is not an active display or alias. | Ledger-only change leaves all picker results unchanged. Keep the trademark wording out of aliases. |
| Bundled recipe demand | Parsed all 114 manifest-listed recipes and 1,123 ingredient rows. No ingredient row links to the target ID, and normalized text search found no Khorasan semolina, Kamut semolina, Kamut porridge, or semoule de blé khorasan phrase. | The external formula is evidence only. Add no bundled recipe link or recipe edit. |

The R656 proposal path, source ID WP02-A7-KHORASAN-SEMOLINA-PORTION-R656-20261018-S01, and observation ID khorasan-semolina-kitchen-stories-kamut-semolina-porridge-70-g-r656-20261018 were absent before drafting. The exact Kitchen Stories URL was also unowned in the active ledger and proposal/batch archive. No R654 or R655 proposal or allocation was found in the repository archive; R656 is the assigned batch ID.

## Exact proposed ledger delta

Merge into recordId ingredient-ref-khorasan-semolina, preserving all existing fields and source entries. Set measurementState to researched_supported, append this source, append one observation, and append the decision below. No active catalog JSON change is proposed.

```json
{
  "sourceId": "WP02-A7-KHORASAN-SEMOLINA-PORTION-R656-20261018-S01",
  "url": "https://www.kitchenstories.com/en/recipes/kamut-semolina-porridge",
  "title": "Kitchen Stories, Kamut semolina porridge (contributor: Eat this!)",
  "accessedOn": "2026-10-18",
  "locator": "Ingredients for 2 servings and step 1",
  "supports": "The page lists 70 g kamut semolina in a two-serving formula and directs adding it to heated plant-based milk. This supports the total formula amount only; no volume, measuring method, product SKU, or milling grade is given.",
  "sourceKind": "culinary_reference"
}
```

```json
{
  "observationId": "khorasan-semolina-kitchen-stories-kamut-semolina-porridge-70-g-r656-20261018",
  "relationship": "portion_weight",
  "value": 70,
  "valueUnit": "g",
  "foodDescription": "Kamut semolina in Kitchen Stories' Kamut semolina porridge formula, with Eat this! listed as contributor.",
  "foodState": "Semolina as listed before addition to heated plant-based milk.",
  "measurementMethod": "The recipe directly lists 70 g. It gives no volume amount, cup-fill method, or separate weighing procedure.",
  "quantityBasis": "The complete formula is marked for 2 servings. Keep the 70 g as the total amount in that formula; do not divide it into a per-serving quantity or derive a household measure, density, mapping, or conversion.",
  "observedMassG": 70,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP02-A7-KHORASAN-SEMOLINA-PORTION-R656-20261018-S01",
    "WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S01"
  ]
}
```

```json
{
  "outcome": "accepted",
  "reason": "Record the recipe-published 70 g amount of kamut semolina in the named two-serving porridge formula only. The recipe does not state a milling grade, producer, volume measure, or weighing method. The two-serving yield does not support deriving a per-serving amount. Keep the observation formula-specific; do not create an alias, reusable measure, density, unit mapping, conversion, form, package yield, recipe link, or substitution. Preserve the active bilingual names and picker behavior, null density, empty mappings, verified identity, and not-yet-researched substitution state.",
  "sourceIds": [
    "WP02-A7-KHORASAN-SEMOLINA-PORTION-R656-20261018-S01",
    "WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S01"
  ]
}
```

## Integration status

- Added one Kitchen Stories recipe source, one `portion_weight` observation, and one accepted decision to the existing Khorasan-semolina ledger row; set measurement state to `researched_supported`. No active catalog or recipe data changed.
- Static package and generated-index validation, ledger schema/custom validation, source and observation ownership checks, UTF-8/no-BOM, local-link, whitespace, and scoped diff checks passed.
- No app tests, build, emulator run, or deployment were run. This change only adds database JSON data under `AGENTS.md`.

