# WP02 Section A7 R809 — durum-semolina baking substitution evidence review

- **Date:** 2026-10-19
- **Status:** Proposal for review; this file does not change the catalog or ledger.
- **Recommendation:** Accept one directional, source-scoped baking finding on the existing `ingredient-ref-durum-semolina` ledger row. Keep the bilingual display, aliases, measurements, density, mappings, forms, recipes, and active substitution rules unchanged.
- **Plan anchor:** WP02 Section A7 remains open. R635 completed five product- and formula-specific durum-semolina portions but explicitly left substitution research open. R806–R808 are now integrated; this review addresses the distinct outstanding substitution-evidence field.

## Finding and limits

King Arthur Baking's current guide, in its substitution section, says a baker may use an “equal amount by volume of bread flour in a pinch.” It also permits “all-purpose flour, but bread flour is a better option,” because bread flour's higher protein is closer to semolina. This is useful, directional baking guidance for a recipe that calls for semolina flour. The page does not report a comparative trial or give a separate amount for all-purpose flour.

Treat this as ledger evidence only. Do not create a global or contextual runtime rule from the general article. The statement is not evidence for replacing bread or all-purpose flour with durum semolina, for pasta, or for surface-dusting and porridge roles. The article separately suggests replacing 25% of all-purpose flour with semolina when a recipe calls for all-purpose flour; that is the reverse direction and is excluded from this finding.

## Identity, labels, and aliases

The active target is `ingredient-ref-durum-semolina`, displayed as **durum semolina / semoule de blé dur**, category `FLOUR_AND_STARCH`. The English and French alias arrays are empty. OQLF's preferred Québec French term is `semoule de blé dur`; its fiche defines the product as coarsely milled durum wheat and lists `durum semolina` and `semolina` as English terms. King Arthur's current product page independently identifies its semolina flour as a coarse grind of durum wheat. These sources support mapping the guide's *semolina flour* to the existing durum-semolina identity while retaining its existing display pair.

Do not add `semolina flour` as an alias in this evidence-only review. The current catalog has eight semolina-qualified identities, and the lookup `semolina flour` presently returns no row. Keep the English and French alias arrays unchanged.

| Evidence source | Supports | Limit |
|---|---|---|
| Existing `WP02-S23`, [OQLF, semoule de blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur) | Preferred Québec French display and English `durum semolina`; definition distinguishes coarse-ground durum from flour. | The fiche was last updated in 1982. It supports terminology and identity, not current retail availability or substitutions. |
| Existing `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02`, [King Arthur Semolina Flour product page](https://shop.kingarthurbaking.com/items/semolina-flour) | Current SKU 100227 / UPC 071012108268; identifies the product as coarse-ground durum wheat. | Product identity and use information only; its advice about semolina replacing some all-purpose flour is the opposite direction and supplies no transferable ratio. |

The target is distinct from `ingredient-ref-durum-flour` (finer durum flour), `ingredient-ref-semola-rimacinata` (remilled durum semolina), and spring-wheat semolina. Do not transfer measurements or findings across those identities. R529's white-lupin finding concerns the distinct remilled durum-semolina identity and is not evidence for this target.

## Measurement and density evidence

R635 already records five durum-semolina portions. Keep them source-scoped and do not derive a default measure, density, or mapping:

| Existing evidence | Recorded amount | Limit |
|---|---:|---|
| Bob's Red Mill [Semolina Flour product page](https://www.bobsredmill.com/product/semolina-pasta-flour), source `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S01` | Product-label serving: 1/4 cup (45 g). | Named product only; the label does not state cup capacity or filling method. |
| Bob's Red Mill [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart), reused source `WP02-B23-RESIDUAL-20261010-S05` | Semolina row: 1 cup (180 g). | Chart value only; its 1/4-cup value repeats the same manufacturer's 45 g serving, not independent corroboration. The row method and cup capacity are unstated. |
| King Arthur package PDF, source `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S03` | Package serving: 3 tbsp (28 g); separate package bread formula: 2 3/4 cups (448 g). | A package serving and a separate formula amount; neither supplies a generic measure or stated fill method. [Package PDF](https://shop.kingarthurbaking.com/content/packaging/100227_1.pdf). |
| King Arthur [Semolina Pasta recipe](https://www.kingarthurbaking.com/recipes/semolina-pasta-recipe), source `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S04` | Pasta formula: 1 3/4 cups (285 g), with instructions to weigh or spoon-and-sweep. | One formula and method only; additional sprinkling flour is unquantified. The current recipe pairs semolina with 00 pizza flour and gives no replacement for semolina. |

The active target and both proposed replacement references currently have `defaultDensity: null`, empty `unitMappings`, and no forms. The bread-flour and all-purpose-flour advice is volume-based; it does not establish a mass-volume conversion or density.

## Substitution evidence and scope

| Source | Evidence | Limit |
|---|---|---|
| Proposal-local `WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01`, King Arthur Baking, [What is semolina flour, and how do I bake with it?](https://www.kingarthurbaking.com/blog/2023/06/20/what-is-semolina-flour-and-how-do-i-bake-with-it), published 2023-06-20; accessed 2026-10-19. | In its substitution section, recommends equal-volume bread flour when a recipe calls for semolina flour; also names all-purpose flour as an option and prefers bread flour because its protein is closer. The article defines semolina flour as coarsely ground durum wheat. | General editorial baking advice, not a published comparative trial. The equal-volume amount is explicit for bread flour only; no separate all-purpose-flour amount, method-specific result, or pasta replacement is given. |
| Existing King Arthur [Semolina Pasta recipe](https://www.kingarthurbaking.com/recipes/semolina-pasta-recipe), source `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S04`, updated 2025-04-30. | Uses 1 3/4 cups (285 g) King Arthur Semolina Flour with 3/4 cup (87 g) 00 Pizza Flour. | Formula-specific co-use only; it does not compare or recommend a replacement for semolina. Exclude pasta from the proposed finding. |
| Existing King Arthur [Semolina Flour product page](https://shop.kingarthurbaking.com/items/semolina-flour), source `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02`. | Describes semolina as a coarse-ground durum product, mentions bread, pizza, and pasta uses, and suggests replacing some all-purpose flour with semolina. | It supplies no amount for that reciprocal statement. Do not invert or combine it with the R809 direction. |
| Existing cornmeal finding `cornmeal-to-durum-semolina-baking-sheet-kab-r666-20261018`, reusing the product-page source above. | King Arthur recommends its semolina flour in place of cornmeal for surface dusting under bread. | This is a different ingredient direction and only a dusting role; it does not establish a dough substitution. |

The evidence supports recording the bread-flour alternative with an equal-volume adjustment and recording the all-purpose-flour alternative without a numeric amount. It does not justify a default substitution rule: the source is broad guidance, it does not establish recipe-specific results, and the catalog's runtime rules cannot safely represent this source's unqualified baking context. `Requirements.md` models ingredient-to-ingredient substitutions as contextual rules with scope such as dish, role, or method; this article does not supply those limits. Keep pasta, dusting, porridge, and other non-dough uses unavailable as automatic substitutions.

## Exact proposed ledger delta

On the existing `ingredient-ref-durum-semolina` record:

- Change `substitutionResearchState` from `not_yet_researched` to `researched_supported`.
- Append the new King Arthur article source below.
- Append one source-scoped finding below and one accepted decision explaining why the evidence stays inactive.
- Leave `identityState`, `measurementState`, `measurementObservations`, and every active catalog field unchanged. Add no alias, form, density, unit mapping, recipe link, global substitution, contextual substitution, or yield.

```json
{
  "recordId": "ingredient-ref-durum-semolina",
  "substitutionResearchState": "researched_supported",
  "sources": [
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
  ],
  "substitutionFindings": [
    {
    "findingId": "durum-semolina-baking-replacements-r809-20261019",
    "researchState": "researched_supported",
    "fromIngredientRefId": "ingredient-ref-durum-semolina",
    "replacements": [
      { "ingredientRefId": "ingredient-ref-bread-flour" },
      { "ingredientRefId": "ingredient-ref-all-purpose-flour" }
    ],
    "context": "One-way, source-scoped guidance for a baking recipe that calls for semolina flour (coarse-ground durum wheat).",
    "basis": "King Arthur recommends equal-volume bread flour as a substitute when a recipe calls for semolina flour, in a pinch. It also permits all-purpose flour but prefers bread flour because its higher protein is closer to semolina. The source defines semolina flour as coarse-ground durum wheat, matching this record's identity.",
    "adjustments": [
      "Bread flour: use the same volume as the semolina flour specified by the recipe (1:1 by volume only).",
      "All-purpose flour: the source names it as an alternative but does not separately state an amount; do not infer the bread-flour quantity.",
      "The article's 25% semolina-for-all-purpose guidance is the reverse direction and is not part of this finding."
    ],
    "limitations": [
      "This is general editorial baking guidance, not a reported comparative trial or validation across recipe classes.",
      "Do not apply to pasta, surface dusting, porridge, or other roles; the reviewed sources give no replacement for those contexts.",
      "King Arthur's pasta formula uses semolina with 00 pizza flour but gives no semolina replacement.",
      "Do not transfer the recommendation to other products loosely called semolina, including cornmeal or farina; the article says those products are generally not interchangeable.",
      "Do not treat this ledger finding as an active global or contextual substitution rule."
    ],
    "sourceIds": [
      "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01",
      "WP02-S23",
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02",
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S04"
    ]
    }
  ],
  "decisions": [
    {
    "outcome": "accepted",
    "reason": "Record the directional baking guidance and its stated amount in the evidence ledger only. Bread flour is explicitly equal-volume; all-purpose flour has no stated amount. No recipe-role-specific validation supports an active rule, and the pasta and dusting evidence is separate.",
    "sourceIds": [
      "WP02-A7-DURUM-SEMOLINA-SUBSTITUTION-R809-20261019-S01",
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02",
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S04"
    ]
    }
  ]
}
```

This is a partial update keyed to the existing record; append the shown objects to its `sources`, `substitutionFindings`, and `decisions` arrays. The ledger `Replacement` schema has no ratio field. Therefore, the equal-volume instruction is kept in `adjustments` rather than encoded as a misleading absolute `quantity`; no ratio is inferred for all-purpose flour.

## Ownership, picker, and recipe audit

The current bundled package has 1,885 ingredient references and 199 forms, with zero global and zero contextual substitution rules. `ingredient-ref-durum-semolina`, `ingredient-ref-bread-flour`, and `ingredient-ref-all-purpose-flour` are valid distinct IDs. None has a form. No active or legacy identity owns the exact `semolina flour` phrase. The proposed finding ID, source ID, and article URL are unowned. Reuse existing IDs for OQLF (`WP02-S23`), King Arthur's product page (`...-R635-20261018-S02`), and pasta recipe (`...-R635-20261018-S04`); do not create duplicate source entries. The product-page source ID is already correctly shared by the target and the R666 cornmeal finding.

Static phrase-first projection was recreated from the current names, aliases, and forms using the normalization and contiguous whole-word-phrase behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Since this proposal adds no active term, every result below remains unchanged:

| Query | Current result | R809 effect |
|---|---|---|
| `durum semolina` | `ingredient-ref-durum-semolina`; `ingredient-ref-semola-rimacinata` | None |
| `semolina` | `ingredient-ref-barley-semolina`; `ingredient-ref-durum-semolina`; `ingredient-ref-emmer-semolina`; `ingredient-ref-khorasan-semolina`; `ingredient-ref-sankhal`; `ingredient-ref-semola-rimacinata`; `ingredient-ref-sorghum-semolina`; `ingredient-ref-spring-wheat-semolina` | None |
| `semolina flour` | No results | None; no alias added |
| `semoule de blé dur` and accent-folded `semoule de ble dur` | `ingredient-ref-durum-semolina`; `ingredient-ref-semola-rimacinata` | None |
| `malt flour` | Seven results: `ingredient-ref-light-caramelized-barley-malt-flour`, `ingredient-ref-malt-flour`, `ingredient-ref-malted-rye-flour`, `ingredient-ref-malted-spelt-flour`, `ingredient-ref-roasted-barley-malt-flour`, `ingredient-ref-roasted-oat-malt-flour`, and `ingredient-ref-roasted-wheat-malt-flour`. The rye row matches the contiguous subphrase in R806's `rye malt flour` alias. | None; the broad query stays multi-result |
| `rye malt flour` | `ingredient-ref-malted-rye-flour` | None |

The current manifest lists 114 recipe files containing 1,123 structured ingredient rows. A full manifest-file scan found zero `ingredient-ref-durum-semolina` links and zero occurrences of `durum semolina`, `semolina flour`, `semolina`, or `semoule de blé dur` (including its accent-folded spelling). The external King Arthur formula is source evidence, not bundled recipe demand; add no recipe link.

## Static checks and test scope

- Read the current A7 plan items, roadmap status, catalog workflow, R635/R666/R806 records and proposals, active references, forms, substitution files, research ledger, and ledger schema before selecting this open evidence gap.
- Rechecked the OQLF, King Arthur product, baking-guide, and pasta-recipe pages online on 2026-10-19; verified the new source URL and proposed IDs have no current owners.
- Parsed the manifest and all 114 listed recipes, checked target links and phrase demand, enumerated current search results from catalog names/aliases/forms, and checked the active reference/ledger ownership and rule counts.
- No tests, build, emulator, or deployment were run. Under `AGENTS.md`, if this proposal is accepted as a database-JSON-only ledger update, software tests and emulator verification are not needed.

This proposal file is the only file created for R809.
