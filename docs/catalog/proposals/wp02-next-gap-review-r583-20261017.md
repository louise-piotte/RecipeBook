# WP02 Section A4 — stone-ground rye flour process boundary review (R583)

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Integrated as a documentation-only process-boundary hold; see the [R583 integration README](../batches/wp02-r583-stone-ground-rye-boundary-hold-integration-20261017/README.md).
- **Exact open plan anchor:** [Section A4, line 10833](../../RecipeBook-global-ingredient-catalog-plan.txt#L10861). Its broader rye-milling parent remains open at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658).
- **Bounded question:** Does the current evidence support `stone-ground` / `stone-milled rye flour` as a distinct extraction or grind class, or as a global alias on an existing rye-flour identity?

## Recommendation

**Hold; do not add a `stone-ground rye flour` identity, alias, or form.** Current Canadian and Québec mill pages use stone milling alongside different rye product descriptions and grades. A Canadian mill describes its stone-milled rye flour as exceptionally fine after multiple passes and also calls that named product whole-grain. A Québec mill describes its stone-milled rye product as whole rye flour with a T125 ash label. R275's French-mill catalogue also describes both T130 and T170 rye products as stone-ground. These are product-specific pairings, not a general crosswalk from stone milling to whole-grain status, extraction rate, particle size, or another active rye grade.

Keep `stone-ground`, `stoneground`, `stone-milled`, `moulu(e) sur pierre`, and `moulu(e) sur meule de pierre` as source-level product/process wording. Do not add them to `ingredient-ref-rye-flour` or `ingredient-ref-whole-rye-flour`, and do not route them to rye meal. The broader A4 rye parent remains open for any future class supported by a distinct product boundary or authoritative specification.

## Current identities and prior decisions

At R583 proposal audit, the live reference file contained 1,806 ingredient references and 154 forms. Current rye flour ownership is:

| Active reference | Current names and aliases | Boundary for R583 |
|---|---|---|
| `ingredient-ref-rye-flour` | `rye flour / farine de seigle`; no aliases | Generic rye flour remains broad. Do not attach stone-milling claims from specific products. |
| `ingredient-ref-light-rye-flour` | `light rye flour / farine de seigle claire`; aliases `white rye flour`, `farine de seigle blanche`, `farine de seigle légère` | Keep its light/white terms separate from milling equipment. |
| `ingredient-ref-medium-rye-flour` | `medium rye flour / farine de seigle moyenne` | Named market grade; no universal extraction or sifting threshold. |
| `ingredient-ref-dark-rye-flour` | `dark rye flour / farine de seigle foncée` | Added by [R579](wp02-next-gap-review-r579-20261017.md) as a named market grade without a whole-grain or milling-process crosswalk. |
| `ingredient-ref-whole-rye-flour` | `whole rye flour / farine entière de seigle`; aliases `complete rye flour`, `whole grain rye flour`, `farine de seigle entière` | Whole-grain wording does not imply stone milling; stone milling on a specific product does not make it a global synonym. |
| `ingredient-ref-malted-rye-flour` | `malted rye flour / farine de seigle malté` | Malting is a distinct processing claim; do not infer it from milling method. |
| `ingredient-ref-rye-meal` | `rye meal / gruau de seigle`; aliases `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`, `semoule de seigle`, `farine à pumpernickel` | Retain the existing coarse whole-kernel/pumpernickel boundary. Stone milling alone does not establish a coarse meal. |

There are no rye ingredient forms. All listed rye-flour references have `defaultDensity: null` and empty `unitMappings`. R579 integrated the dark-rye identity and product-specific evidence; its broader A4 parent remains open. R275 already reviewed French T170 and kept it outside active references pending independent Québec wording review. This proposal does not reopen that hold or treat stone-ground as another T170 class. The reviewed R275 catalogue itself lists T130 and T170 as separate stone-ground products, while assigning no universal process specification.

## Current source and ID ownership

| Evidence | Current ownership / ID status | Supported use and limit |
|---|---|---|
| Moulin Lacoste, [Farine de Seigle Entière](https://moulinlacoste.com/index.php/product/farine-de-seigle-entiere/) | Existing ledger source `WP02-AB-DARK-RYE-GAP-20261012-S01`, owned by `ingredient-ref-whole-rye-flour`. Reuse this record by reference; do not mint another ID for the same URL. | Current Québec product page calls its rye flour whole and stone-milled, lists T125, and identifies Québec rye. Product-specific grade and method only. |
| Moulins Bourgeois, [English export catalogue, 2024](https://www.moulins-bourgeois.com/wp-content/uploads/2024/10/Catalogue-EN-pays-tiers.pdf), rye section | R275 proposal-local source `WP02-SECTION-A-RYE-T170-REVIEW-R275-20261016-S02`; it is not in the live ledger because R275 was integrated as a documentation hold. | Lists T130 as stone-ground rye flour and T170 as stone-ground wholemeal rye flour for that mill. This supports process/grade coexistence in its catalogue, not universal thresholds. Retain the source ID and ownership in R275; do not assign it to a new row. |
| Tevah Acres, [Fresh Milled Rye Flour](https://tevahacres.ca/products/fresh-milled-light-rye-flour-1) | No matching URL or source ID exists in the live ledger or prior proposal archive. Proposal-local ID: `WP02-A4-RYE-STONE-GROUND-R583-20261017-S01`; it is not proposed as a ledger addition in this hold. | The current product page calls the item stone-ground, says it is whole-grain, and states that multiple milling passes create an exceptionally fine flour. It does not define a reusable rye particle-size or extraction class. The page's availability labels conflict (`Sold out` and `Low stock`), so no stock conclusion is drawn. |
| OQLF, [farine de blé entier moulue sur pierre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361557/farine-de-ble-entier-moulue-sur-pierre) | No new source ID proposed. The URL is not assigned to a rye reference in the live ledger. | OQLF defines a wheat-specific term and retains all wheat-kernel parts. It is useful wording context only; it does not establish a Québec rye term or rye milling equivalence. |
| CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 12, §§12.1.1–12.1.10; Canadian Grain Commission, [Rye grading tables](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/05-rye/primary-export-grade-determination-tables.html) | These current URLs already occur in the wider ledger for other food records; no new source ID is proposed here. | The cited CFIA flour standards specify wheat-flour classes, and the Commission's rye table grades rye grain. Neither establishes consumer rye-flour stone-milling, extraction, or particle-size classes. This is a targeted source check, not a claim that no other standard exists. |

The proposed Tevah source ID was checked against the current ledger and proposal archive and is unused. No new shared source ownership is recommended. Reused source IDs remain attached to their existing rows; source evidence from R275 remains local to its hold record.

## Bilingual naming and picker projection

The current Québec product page uses `moulue sur meule de pierre` for its own whole rye flour. OQLF's accepted whole-wheat construction is `farine de blé entier moulue sur pierre`, but its scope is wheat. Neither source establishes a Québec-approved rye alias such as `farine de seigle moulue sur pierre` or `farine de seigle moulue sur meule`. Keep the wording on the cited products and do not add a French alias by analogy.

The static picker projection follows `IngredientReferenceSearchIndex` in `IngredientSearch.kt`: normalized exact phrases match first, then substring matching. Current results are:

| Query | Current result |
|---|---|
| `rye flour` / `farine de seigle` | Six flour identities: generic, light, medium, dark, whole, and malted rye flour. |
| `whole rye flour` / `farine de seigle entière` | `ingredient-ref-whole-rye-flour` only. |
| `rye meal` / `gruau de seigle` | `ingredient-ref-rye-meal` only. |
| `stone-ground rye flour`, `stoneground rye flour`, `stone-milled rye flour` | No result. |
| `farine de seigle moulue sur pierre`, `farine de seigle moulue sur meule` | No result. |

Keeping these queries unmatched avoids routing a process phrase to a generic or whole-grain identity without support. No active alias, reference, or picker projection changes are proposed.

## Bundled demand and behavior data

The manifest lists 114 recipes containing 1,123 ingredient rows. A raw substring scan reported three recipe files because `rye` occurs inside `fryer` in air-fryer recipe text. Reviewing those matches found no standalone `rye` or `seigle` mention, no rye ingredient row, and no stone-ground/milled rye or reviewed French process phrase. There is no bundled demand or line eligible for a recipe link. This scan describes the current bundled corpus only.

The sources give no source-neutral home measure, flour density, conversion, reusable particle-size threshold, extraction percentage, or cross-product grade equivalence. Tevah's fineness statement and Moulin Lacoste's T125 label are product-specific. No substitution study or matched recipe supports replacing one rye grade with another. Add no measure, density, unit mapping, form, conversion, yield, recipe link, substitution finding, or active rule.

## Root integration

Root recorded this bounded decision under the still-open A4 parent: stone-ground/stone-milled rye remains product-level process wording, not a global extraction/grind class. No catalog or ledger data changed. The existing rows, aliases, source-ID ownership, and R275 T170 hold remain intact. Revisit only if a rye-specific terminology authority or a documented consumer/product standard supplies a stable boundary not already represented by an active rye identity.

## Static checks

- Rechecked the current reference and form files, the source ownership in the research ledger, R275 and R579, picker phrase matching, and all manifest-listed recipes.
- Root updated the plan, roadmap, and [R583 integration README](../batches/wp02-r583-stone-ground-rye-boundary-hold-integration-20261017/README.md). The proposal and README pass UTF-8/no-BOM, local-link/anchor, and whitespace checks; picker projection, recipe-demand, source ownership, and rye-reference checks remain clean. No app tests, build, emulator, or deployment were run for this documentation-only hold.
