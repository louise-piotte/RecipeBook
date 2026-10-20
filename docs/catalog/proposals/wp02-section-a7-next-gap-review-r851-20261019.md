# WP02 Section A7 R851 — spring-wheat-semolina substitution evidence

- **Reviewed:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. The bounded finding and accepted decision are in the research ledger; the plan and progress records are updated in the [R851–R853 integration README](../batches/wp02-wp03-wp04-r851-r853-gap-review-integration-20261019/README.md).
- **Plan anchor:** Section A7 remains open at the parent item to continue review of other grain meals and milling products ([plan line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). The completed R394 identity item for `ingredient-ref-spring-wheat-semolina` explicitly added no active substitution ([plan lines 2554–2560](../../RecipeBook-global-ingredient-catalog-plan.txt#L2554)); its proposal left exact-product substitution research open. R851 completes that distinct, still-unresearched ledger dimension. It does not revisit R848's durum-flour recipe lead, R809's durum-semolina baking alternatives, R836's emmer-semolina review, R833's granular-flour review, or R839's white-whole-wheat finding.
- **Candidate and path:** Source-bounded substitution-evidence review for the existing `ingredient-ref-spring-wheat-semolina` ledger record; `docs/catalog/proposals/wp02-section-a7-next-gap-review-r851-20261019.md`.

## Recommendation

On the existing `ingredient-ref-spring-wheat-semolina` ledger row, change `substitutionResearchState` to `researched_no_supported_substitute` and append one finding with an empty `replacements` array plus one accepted decision. The finding should record why the reviewed source set does not support an actionable replacement for the Canadian Red Spring Wheat semolina represented by this row.

The direct mill sources describe the target product and its applications, but give no replacement direction, amount, ratio, or formula comparison. U.S. Wheat Associates does state a direction: **U.S. Hard Red Spring wheat flour or semolina is an alternative to traditional durum wheat semolina when the latter is not needed for pasta**. Keep this as a rejected, class-level lead. The source addresses U.S. HRS wheat, not the exact Canadian Red Spring Wheat products represented by the active row, and gives no product match, formula, grade, amount, or proportion. It does not support a finding that the active Canadian ingredient replaces durum semolina, a reverse replacement finding, or any active rule.

This is a bounded result about the reviewed evidence, not a claim that no substitution could be developed or that no other source exists. Add no global or contextual rule, recipe link, form, alias, measure, conversion, yield, or active catalog data. Keep R809's King Arthur direction on its durum-semolina ledger record and do not transfer it to spring-wheat semolina.

## Identity and ownership

The active reference is `ingredient-ref-spring-wheat-semolina`, category `FLOUR_AND_STARCH`, displayed as **spring wheat semolina / semoule de blé tendre**. It retains only the accepted exact Ardent Mills aliases **farina flour / farine farina**. `defaultDensity` is null and `unitMappings` is empty. The linked research record is identity-verified, has `measurementState: researched_no_supported_value`, has no measurement observations or substitution findings, and currently has `substitutionResearchState: not_yet_researched`.

Keep adjacent identities separate: durum semolina and remilled durum semolina; emmer, Khorasan, barley, and sorghum semolinas; the unresolved whole-wheat-meal identity; wheatlets; granular flour; and prepared Cream of Wheat hot cereal. The R454 Ardent aliases name a specific coarse, granular Canadian hard-red-spring endosperm product; they do not make every product named *farina* equivalent. No form is attached to the target. The global and contextual substitution-rule files contain zero rules. R851 changes no names, aliases, forms, rules, measurements, or picker behavior.

## Source review

The current mill and industry sources are directly accessible. The first four sources already belong to the target row, so this proposal adds no source entry, source ID, or URL. OQLF is reused only for the terminology boundary between soft and durum wheat semolina.

| Existing source ID | Source and locator | Supports | Limit |
| --- | --- | --- | --- |
| `WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S01` | Prairie Flour Mills Ltd., [Products](https://prairieflour.com/products/), “Wheat Semolina,” accessed 2026-10-19. | Identifies its wheat semolina as a specialty product milled from Canadian Red Spring Wheat endosperm, in coarse or fine granulation; lists couscous, pizza dough, cakes, and pies as applications. | Does not recommend replacing another ingredient or name a replacement, formula, amount, or ratio. Its product is bulk-tote available. |
| `WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S03` | U.S. Wheat Associates, [Hard Red Spring](https://newuswheat.mysites.io/crop-quality/hard-red-spring/), pasta-use statement, accessed 2026-10-19. | States that U.S. HRS wheat flour or semolina is a very acceptable alternative to traditional durum wheat semolina when durum is not needed, in pasta applications. | This is the explicit direction **U.S. HRS flour/semolina as an alternative to traditional durum semolina**. It is class-level guidance for U.S. wheat, not an exact Canadian Red Spring product match. It gives no formula, semolina grade, amount, ratio, or handling adjustment. Do not map it to a replacement finding on this Canadian target. |
| `WP02-A7-FARINA-ALIASES-R454-20261017-S01` | Ardent Mills Canada, [Farina Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/farina/), product description and applications, accessed 2026-10-19. | Identifies coarse granules made from purified endosperm of Canadian hard red spring wheat; lists slow-cooking breakfast cereals and specialty breads as applications. | The product page provides applications and commercial pack availability, not a substitute recommendation or household formula. It is a commercial supplier and says it does not sell directly to home bakers. |
| `WP02-A7-FARINA-ALIASES-R454-20261017-S02` | Ardent Mills Canada, [Farine Farina](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/farina/), French product title and description, accessed 2026-10-19. | Confirms the same named Canadian hard-red-spring endosperm product and its French manufacturer title. | Supports the existing exact alias only; it gives no replacement direction. |
| `WP03-IDLI-RAVA-20261012-S07` | Office québécois de la langue française, [GDT: semoule de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432749/semoule-de-ble-tendre), preferred term and definition. | Supports the target's wheat-milling identity and the soft-wheat qualification, distinct from durum semolina. | Terminology evidence, not a current product specification or substitution source. |

The U.S. Wheat Associates alternative remains visible in the record as a rejected candidate so future reviewers can see the exact direction and why it is not transferred. R809 concerns a different finding on `ingredient-ref-durum-semolina`: King Arthur Baking recommends bread flour, or an unquantified all-purpose option, when a recipe calls for its durum semolina. R851 neither reuses that advice as evidence for this row nor adds an alternative in the reverse direction. R848 is a separate King Arthur recipe-specific durum-flour lead with an unresolved semolina grade and amount basis.

## Catalog, picker, rules, and recipe audit

| Surface | Current state and proposed effect |
| --- | --- |
| Identity and aliases | One active reference owns `spring wheat semolina / semoule de blé tendre`, `farina flour`, and `farine farina`. Preserve that reference and all search terms. |
| Forms and measurements | No forms are attached. `defaultDensity` is null, `unitMappings` is empty, and the target ledger row has no measurement observations. Preserve these values. |
| Ledger and source ownership | The target row has five existing source IDs listed above, no substitution finding, and an unresearched substitution state. Each reused source ID maps to its existing URL; no new source ID or URL is proposed. The finding ID `spring-wheat-semolina-no-supported-substitute-r851-20261019` is unused in the ledger. |
| Active substitution rules | Both bundled global and contextual rule files are empty. Add no rule and no recipe-line substitution link. |
| Picker projection | Reproducing `IngredientSearch.kt`'s accent-folded, phrase-first search with substring fallback, `spring wheat semolina`, `semoule de blé tendre`, `farina flour`, and `farine farina` each return this target alone. `farina` returns four Italian type-flour rows plus this row; `semolina` returns eight grain-qualified semolina identities; `durum semolina` returns durum and remilled-durum semolina. No query result changes because no catalog term is proposed. |
| Bundled recipe demand | Parsed all 114 recipe files named by `manifest.v1.json` and all 1,123 ingredient objects. The full recipe JSON and ingredient rows contain no target ID or phrase match for `spring wheat semolina`, `semoule de blé tendre`, `farina flour`, `farine farina`, `wheat semolina`, `wheat farina`, or `durum semolina`. No bundled recipe link or edit is proposed. |

## Exact proposed ledger delta

Apply only to the record whose `recordId` is `ingredient-ref-spring-wheat-semolina`. Preserve all existing sources, the identity and measurement states, the active catalog, and all other ledger records. The following existing IDs are cited in the delta; do not append duplicate source entries.

```json
{
  "recordId": "ingredient-ref-spring-wheat-semolina",
  "replace": {
    "substitutionResearchState": "researched_no_supported_substitute"
  },
  "append": {
    "substitutionFindings": [
      {
        "findingId": "spring-wheat-semolina-no-supported-substitute-r851-20261019",
        "researchState": "researched_no_supported_substitute",
        "fromIngredientRefId": "ingredient-ref-spring-wheat-semolina",
        "replacements": [],
        "context": "Source-bounded review of whether current manufacturer and wheat-industry sources support an actionable ingredient replacement for Canadian Red Spring Wheat semolina in its listed food applications.",
        "basis": "Prairie Flour Mills identifies its target-class wheat semolina as milled from Canadian Red Spring Wheat endosperm and lists couscous, pizza dough, cakes, and pies as applications without naming a substitute. Ardent Mills identifies a coarse Canadian hard-red-spring endosperm Farina product and lists slow-cooking breakfast cereals and specialty breads, again without a replacement recommendation. U.S. Wheat Associates states that U.S. Hard Red Spring flour or semolina can be an alternative to traditional durum semolina when durum is not needed for pasta. That statement gives a clear but U.S.-class-level direction; it does not match the exact Canadian product represented by this row or provide a grade, formula, amount, or proportion. It is retained below as a rejected lead, not as a substitution finding.",
        "limitations": [
          "This is a no-supported-substitute result for the reviewed sources, not proof that no substitution could be developed or that no other source exists.",
          "Do not encode U.S. Hard Red Spring semolina as a replacement for durum semolina on this Canadian spring-wheat-semolina row. The U.S. industry statement is a pasta-scoped, class-level alternative without a Canadian product match, formula, grade, amount, or proportion.",
          "The mill pages list applications and do not say that this product replaces durum semolina, bread flour, all-purpose flour, or another ingredient.",
          "Do not transfer R809's King Arthur baking alternatives for durum semolina or R848's recipe-specific durum-flour note to this target.",
          "No active global or contextual substitution rule, recipe link, form, alias, measurement, conversion, yield, or catalog change is supported."
        ],
        "rejectedCandidates": [
          {
            "candidate": "U.S. Hard Red Spring wheat flour or semolina as an alternative to traditional durum wheat semolina in pasta",
            "reason": "U.S. Wheat Associates states this direction when durum is not needed, but its class-level source does not establish that the reviewed Canadian Red Spring Wheat semolina product is the same or interchangeable. It gives no formula, named grade, amount, proportion, or adjustment for a recipe. Preserve the statement as a blocked lead; add no replacement relation to this row and no active rule.",
            "sourceIds": [
              "WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S03"
            ]
          }
        ],
        "sourceIds": [
          "WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S01",
          "WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S03",
          "WP02-A7-FARINA-ALIASES-R454-20261017-S01",
          "WP02-A7-FARINA-ALIASES-R454-20261017-S02",
          "WP03-IDLI-RAVA-20261012-S07"
        ]
      }
    ],
    "decisions": [
      {
        "outcome": "accepted",
        "reason": "Complete the outstanding source-bounded substitution review for the Canadian Red Spring Wheat semolina identity. The exact Canadian manufacturer sources list applications but no replacements. U.S. Wheat Associates' explicit direction is U.S. Hard Red Spring flour or semolina as an alternative to traditional durum semolina for pasta; that class-level statement lacks an exact Canadian product match and usable formula detail, so retain it only as a rejected lead. Add no replacement relation or active substitution rule.",
        "sourceIds": [
          "WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S01",
          "WP02-A7-SPRING-WHEAT-SEMOLINA-R394-20261017-S03",
          "WP02-A7-FARINA-ALIASES-R454-20261017-S01",
          "WP02-A7-FARINA-ALIASES-R454-20261017-S02",
          "WP03-IDLI-RAVA-20261012-S07"
        ]
      }
    ]
  }
}
```

No new source record is needed: every cited source ID already belongs to the target ledger record at the same URL. Do not change `ingredient-references.v1.json`, forms, either substitution-rule file, generated code, recipes, or other ledger records.

## Static checks and scope

- Read the current `AGENTS.md`, the A7 parent and R394 checklist lines, roadmap, catalog workflow, latest R848–R850 integration README, R394 and R454 records, and adjacent R809/R836/R839/R845/R848 reviews. The exact target ledger row still has `substitutionResearchState: not_yet_researched`; no earlier review completed this target's substitution dimension.
- Reopened Prairie Flour Mills, Ardent Mills Canada, and U.S. Wheat Associates source pages on 2026-10-19. Verified the Canadian product/application statements and the exact U.S.-HRS-to-durum direction. Source IDs and URLs are already owned by this ledger row and have no conflicting URL mappings. The proposed finding ID and proposal path are unused.
- Audited the current reference, forms, global/contextual rules, search projection, and manifest-listed recipe corpus. Confirmed one active target, no attached form, null density, empty unit mappings, no rules, and zero recipe demand in 114 files / 1,123 ingredient rows.
- Integration changed only database JSON data plus the generated index and review documentation. No software tests, build, emulator run, or deployment were needed under `AGENTS.md`.
