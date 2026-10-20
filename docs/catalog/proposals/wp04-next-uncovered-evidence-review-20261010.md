# WP04 Proposal: Turkey Meatballs Source-Version and Lean-Ground-Turkey Boundary

**Review date:** 2026-10-10
**Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, code, or test files changed.
**Scope:** One high-impact poultry ingredient line and its source-version evidence: Turkey Meatballs `018#1`, `2 lb lean ground turkey`. This is a focused follow-up to the broader residual coverage audit; it does not revisit egg, pork, chicken-breast, tuna, dairy-package, or produce-count findings.

## Disposition

Keep the imported recipe line and its existing `ingredient-ref-ground-turkey` link unchanged for now. Preserve `lean` as the exact source qualifier already stored in `originalText` and in the bilingual line preparation (`lean` / `maigre`). Do not encode a fat percentage, create a `lean ground turkey` identity or form, alter the amount, or record a count/portion observation.

The current Preppy Kitchen page is directly accessible, but it describes a materially different recipe card: one pound of ground turkey for four servings, with no `lean` qualifier, and it explicitly says any type of ground turkey may be used. The archived RecipeKeeper export and bundled recipe retain two pounds of lean ground turkey, alongside other ingredient and method differences. Those local files verify what RecipeBook imported; they do not capture which dated publisher-page version supplied it. Treat this as an unresolved source-version mismatch, not evidence that either quantity is a transcription error.

**Integration is not justified from the evidence available.** A ledger note could record the accessible current source and the unresolved version mismatch after coordinator approval, but it should not replace the recipe’s saved ingredient or establish a reusable product composition. Resolve the recipe version first if a source correction is considered.

## Exact demand and source-version comparison

The current manifest contains **114 recipe files and 1,123 ingredient rows**. A fresh scan found one ground-turkey line:

| Recipe line | Bundled and archived local evidence | Current publisher evidence | Disposition |
|---|---|---|---|
| `018#1` — Turkey Meatballs; `43199cff-7fba-4cd0-8447-2c7265b0bb1c-ingredient-1` | `originalText`: `2 lb lean ground turkey`; `quantity: 2`; `unit: lb`; `ingredientName: ground turkey`; `ingredientRefId: ingredient-ref-ground-turkey`; EN/FR preparation: `lean` / `maigre`. The local [bundled recipe](../../../app/src/main/assets/seed/bundled-library/recipes/018-boulette-de-dinde-turkey-meatballs-43199cff-7fba-4cd0-8447-2c7265b0bb1c.v1.json) and [RecipeKeeper export](../../../docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes/processed_018-boulette-de-dinde-turkey-meatballs-43199cff-7fba-4cd0-8447-2c7265b0bb1c.json) both retain the two-pound wording. | The [current source page](https://preppykitchen.com/turkey-meatballs/) says the card is for four servings and lists `1 pound ground turkey (450g)`. Its ingredient guidance says any type of ground turkey works and that a less-lean option is more flavorful and moist. | Keep the bundled line and existing generic ground-turkey link. Mark the source-version comparison unresolved; do not replace two pounds with one pound or remove the local `lean` qualifier based only on the current card. |

The mismatch is broader than this one line. The bundled export also specifies one cup of breadcrumbs, one cup of grated Manchego, half a cup of red onion, one tablespoon of garlic, and four teaspoons of smoked paprika. The current source card lists half a cup of breadcrumbs, one-third cup of grated Parmesan, half a small onion, three garlic cloves, and dried oregano instead of smoked paprika. The saved method uses two sheet pans, 425°F, and about 15 minutes; the current card uses one baking sheet, 400°F, and 18–20 minutes, and shapes 28 one-inch meatballs. These differences show that the two records cannot be reconciled by changing the turkey amount alone.

The local export retains the English source phrase `2 lb lean ground turkey`; the bundled recipe stores that phrase and separately records the bilingual preparation qualifier `lean` / `maigre`. The export is named under the `RecipeKeeper_20260320_143058` snapshot and the bundled recipe records `sourceType: recipekeeper-manual-cleanup`; neither records a publisher-page capture date, source HTML, revision identifier, or archived URL. The direct publisher page says “Updated Mar 25, 2023,” but that displayed date does not establish what version RecipeBook imported. No historical source snapshot was available in the reviewed repository.

## Product and composition boundaries

- **Generic ground turkey:** Keep `ingredient-ref-ground-turkey` as the catalog identity for the linked row. The current page’s “any type” language is recipe-specific guidance and does not make all ground-turkey products compositionally identical.
- **“Lean”:** Treat this as a source qualifier on the saved ingredient line. The archived export preserves the English phrase `lean ground turkey` and the French `dinde hachée maigre`; no package label, fat percentage, white/dark-meat composition, skin status, or source-market definition accompanies it. Do not convert `lean` to a numeric fat value or generalize it to other ground-turkey lines.
- **Canadian naming rules:** CFIA describes Canadian standardized ground-meat common names as species-qualified and sets a maximum 17% fat limit for “Lean Ground (naming the species or cut).” CFIA also publishes turkey procurement descriptions for products at 30%, 20%, and 10% maximum fat, with different meat/skin specifications. These Canadian standards show why fat class and formulation matter; they do not prove that the US publisher’s earlier `lean` wording denotes the Canadian standardized class, nor do they identify the imported product.
- **Current source’s optional product guidance:** The page’s “any type” and “less lean” note supports that a less-lean variant is acceptable in that current recipe version. It gives no amount ratio, fat percentage, package specification, or tested equivalence for the older two-pound version. Do not turn it into a general ground-turkey substitution rule.
- **Preparation and yield:** The local amount is recipe input before mixing and baking. The current page’s four-serving yield and 28 meatballs belong to its one-pound version. Do not divide or scale these yield details onto the bundled two-pound version, infer cooked meatball mass, or interpret nutrition per serving as raw-meat composition.
- **Measurement and edible portion:** `lb` is a mass unit already represented on the recipe line. Neither source supplies a matching edible-portion factor, refuse, raw-to-cooked yield, or mass-volume relation. No conversion or portion observation is proposed.

## Model and fixture recommendation

This is a source-integrity and composition-boundary fixture for the open WP04 count/edible-portion/composition-sensitive work item in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). It can assert that a linked generic reference does not erase a source qualifier, and that an accessible newer source version does not silently rewrite the saved recipe. The existing recipe fields already preserve the source line and its localized `lean` qualifier; no schema or DTO change is needed for this bounded finding.

If a later integration is authorized after the recipe version is resolved:

1. Attach only source evidence that belongs to the same recipe version as the saved two-pound formula, or explicitly record that a newer publisher version conflicts with the saved snapshot.
2. Keep `ingredient-ref-ground-turkey` generic. Do not add a `lean ground turkey` identity, alias, form, numeric fat class, density, unit mapping, count weight, edible-portion yield, cooking yield, or substitution.
3. Keep the exact source line’s quantity and qualifier together. Do not transfer current card amounts, serving count, meatball count, nutrition, or optional “less lean” wording to the older saved formula.
4. Leave this as source-text/recipe provenance evidence. Do not make the current page’s one-pound recipe the canonical RecipeBook recipe without a version or owner decision establishing that intent.

This review changes no active catalog or ledger values. The live `ingredient-ref-ground-turkey` record remains `identityState: unreviewed`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, with no sources or decisions. The existing WP04 residual audit already names lean ground turkey as a composition-sensitive boundary example; this proposal adds the missing exact recipe-source comparison for `018#1` rather than reopening the ground-beef `078#3` follow-up.

## Sources and access limits

All external pages below were directly accessible and checked on **2026-10-10**.

| ID | Source | Evidence and limit |
|---|---|---|
| **S01** | Preppy Kitchen, [Turkey Meatballs](https://preppykitchen.com/turkey-meatballs/), recipe card and ingredient guidance. | Current page lists one pound (450 g) ground turkey for four servings; the body says any type may be used and a less-lean option is more flavorful and moist. It also gives the current recipe’s 28 one-inch meatball yield and current method. It does not show the imported two-pound formulation or define a fat percentage. Page displays “Updated Mar 25, 2023.” Accessed 2026-10-10. |
| **S02** | CFIA, [Labelling requirements for meat and poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products), “Ground meat.” | Gives Canadian standardized ground-meat classes, including “Lean Ground” at a maximum of 17% fat, and says the common name must identify the species or cut. This is Canadian product-labeling evidence, not a definition of the US publisher’s former wording. Accessed 2026-10-10. |
| **S03** | CFIA, [Turkey wholesale nomenclature](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/wholesale-meat/turkey). | Provides Canadian turkey procurement descriptions at 30%, 20%, and 10% maximum fat; the entries describe white/dark/trim meat and skin differently. These are product-specific wholesale specifications, not measures for this recipe line. Accessed 2026-10-10. |
| **S04** | CFIA, [Canadian Standards of Identity, Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7), Table 2, Part A. | The standardized ground-meat classes list fresh boneless, skinless meat and maximum fat values of 30%, 23%, 17%, and 10% for regular, medium, lean, and extra-lean respectively. No claim is made that the recipe’s earlier source-market term satisfies a Canadian class. Accessed 2026-10-10. |

**Access limit:** The current publisher page was accessible. The historical page version that would show whether the two-pound “lean” line once belonged to the same recipe was not present in the local export or bundled package, and no versioned archive was reviewed. The local RecipeKeeper export is evidence of the saved imported wording only, not an independent publisher source. Therefore the source mismatch is established, but its cause and which version should be canonical remain unresolved.

## Review boundary

The review read the current WP04 checklist, current recipe manifest and all listed recipe ingredient rows, the active ground-turkey reference, its ledger record, the archived RecipeKeeper export for recipe 018, the WP04 residual animal-food audit, and the separate ground-beef 90%-lean follow-up. No other ground-turkey line was found in the 114-recipe corpus. No shared files were changed, no tests were run, and no external source was inaccessible during this review.
