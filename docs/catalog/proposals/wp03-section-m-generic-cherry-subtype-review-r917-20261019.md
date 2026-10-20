# WP03 Section M — generic fresh cherry subtypes (R917)

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This is the only file changed for this review; shared catalog data, ledger, legacy candidates, recipes, plan, roadmap, workflow, and tests are untouched.
- **Scope:** Generic fresh sweet and sour cherries only. No cultivar or commercial-product roster is in scope.

## Recommendation

Add two generic, identity-only fresh-fruit references:

| ID | English display | Québec French display | Category | Aliases, forms, and numeric data |
|---|---|---|---|---|
| `ingredient-ref-sweet-cherries` | `sweet cherries` | `cerises douces` | `FRUIT` | None |
| `ingredient-ref-sour-cherries` | `sour cherries` | `cerises acides` | `FRUIT` | None |

Keep `ingredient-ref-cherries` as the existing unqualified `cherries / cerises` identity. Preserve its current fresh, frozen, and pitted aliases, the `ingredient-form-cherries-pitted` form, and recipe 029’s existing generic link. Do not merge or relink any current row. The generic identity remains useful for unqualified and mixed-cherry recipe lines; the two new rows make the source-supported sweet and sour classes selectable when a recipe does specify them.

The boundary is supported by Québec terminology and is useful in a bundled recipe: the linked cake-filling source describes sweet cherries as its base and allows mixing in sour cherries with a sugar adjustment. The bundled ingredient line itself remains unqualified and permits a mixture, so it stays on the existing generic identity. This is a generic culinary distinction, not a request to expand a commercial roster.

## Plan fit and scope

This addresses the open Section M plan item at [`docs/RecipeBook-global-ingredient-catalog-plan.txt:6938`](../../RecipeBook-global-ingredient-catalog-plan.txt#L6938): resolve cherry subtypes where both source and recipe evidence support separate identities while keeping generic identities distinct from state and cultivar.

The cross-category queue rule excludes brand-, product-line-, flavour-family-, SKU-, and retailer-variant-only work because commercial-product counts do not add ingredient diversity. None of that work was pursued here. Existing identities and their evidence remain in place; this proposal does not enumerate cultivars or commercial variants.

## Current-state audit

| Surface | Read-only finding |
|---|---|
| Active references | The current package has 1,939 references. `ingredient-ref-cherries` is `cherries / cerises` in `FRUIT`; its English aliases are `fresh cherries`, `frozen cherries`, and `pitted cherries`, and its French alias is `cerises dénoyautées`. Its density is null and its unit mappings are empty. The proposed sweet and sour IDs are absent from active references. |
| Active forms | The package has 204 forms. The only form owned by generic cherries is `ingredient-form-cherries-pitted`, which represents pit removal only. There is no sweet or sour form. Do not copy the pitted form to a new identity without a transferability review. |
| Dried identities | `ingredient-ref-dried-sweet-cherries` and `ingredient-ref-dried-tart-cherries` are separate verified identities in `NUT_SEED_AND_DRIED_FRUIT`. Keep their dried-product scope, aliases, evidence, and categories unchanged; dried-specific naming or product standards do not by themselves transfer forms or measurements to fresh fruit. |
| Legacy import | The unreviewed singular `ingredient-ref-cherry` (`cherry / cerise`) remains a generic duplicate candidate, not a sweet or sour subtype. Do not promote it or use it as either new ID. |
| Research ledger | `ingredient-ref-cherries` is verified with identity terminology evidence; its measurement and substitution states remain `not_yet_researched`. The accepted prior decision held subtype splits for lack of recipe demand. The dried sweet and tart records are separately verified. The proposed IDs have no current ledger records. |
| Recipe corpus | All 114 manifest-listed recipes and 1,123 ingredient rows were scanned. Exactly one row links to `ingredient-ref-cherries`: recipe 029#1, `460 g pitted cherries, fresh or frozen`. Recipe 029#2 keeps the note “add more if the cherries are tart.” Other cherry ingredient rows use separate prepared-cherry identities; no recipe ingredient row names dried sweet or tart cherries. |
| Prior reviews | The 2026-10-09 open-fruit and 2026-10-10 fruit-gap proposals held fresh subtype rows because the bundled cherry ingredient text was generic. The 2026-10-11 pitting-form review accepted only a generic pitted form and kept the 460 g / 1 lb amount source-specific. This review adds the linked publisher page’s subtype guidance to that recipe evidence; it does not supersede the accepted pitting-form or measurement limits. |

## Terminology and recipe evidence

OQLF’s `cerise` entry distinguishes the two principal cultivated cherry species: sweet cherries (*Prunus avium*) and sour cherries (*Prunus cerasus*). Its related entries give the Québec French terms `cerise douce` and `cerise acide`, with English `sweet cherry` and `sour cherry`. These terms provide clear bilingual labels for generic species-level culinary groups; no cultivar terms are needed. [WP03-FRUIT-OPEN-20261009-S08; WP03-DRIED-NEXT-20261009-S10; WP03-DRIED-NEXT-20261009-S12]

Recipe 029’s bundled ingredient row is intentionally still generic: it specifies pitted cherries, fresh or frozen, without naming a type. The same recipe’s sugar note responds to tartness. The linked publisher page gives the culinary context that the structured ingredient row omits: its filling uses sweet cherries as the base, permits a sweet-and-sour mixture, and says to increase sugar when the fruit is tart. This makes the sweet/sour distinction useful to recipe selection and preparation, while the source’s allowance for a mixture explains why the current line remains linked to generic cherries. [WP03-FRUIT-PITTED-20261011-S05]

The publisher’s 460 g / 1 lb pitted-cherry amount remains specific to that recipe and source. Do not transfer it to either new reference, turn it into a unit mapping or density, or infer a pitting yield. No recipe line is relinked, and no form, substitution, or conversion is proposed.

## Proposed integration delta

If approved by the root integrator:

1. Add `ingredient-ref-sweet-cherries` as `sweet cherries / cerises douces` and `ingredient-ref-sour-cherries` as `sour cherries / cerises acides`, both in `FRUIT` with empty aliases, null density, and empty unit mappings. Their identity scope is respectively *Prunus avium* and *Prunus cerasus*; they are generic classes, not cultivar records.
2. Leave `ingredient-ref-cherries`, its aliases, and `ingredient-form-cherries-pitted` unchanged. Keep recipe 029#1 linked to generic cherries because its structured line permits fresh or frozen cherries and the source allows a mixture. Future explicitly typed lines can use the matching new identity.
3. Keep both dried cherry identities, their sources, labels, aliases, categories, and product-specific evidence unchanged. Do not treat `tart` as a fresh sour-cherry alias: in this recipe it describes the fruit’s taste condition, while OQLF’s bounded fresh class is `sour cherry / cerise acide`.
4. Leave legacy `ingredient-ref-cherry` unreviewed and unpromoted. No current identity is merged or replaced.
5. Attach existing source records to the two new ledger identities rather than creating duplicate owners for the same URLs. Preserve measurement and substitution research states as `not_yet_researched`; add no amounts, forms, mappings, conversions, yields, substitutions, or recipe links.

## Source register

Source IDs below already exist in the research ledger and are reused; this proposal adds no ledger source record.

| Existing source ID | Source | Support and limits |
|---|---|---|
| `WP03-FRUIT-OPEN-20261009-S08` | OQLF, [*cerise* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358152/cerise). | Broad `cerise / cherry` identity and the sweet/sour species distinction. Identity and Québec terminology only; no measures or substitutions. |
| `WP03-DRIED-NEXT-20261009-S12` | OQLF, [*cerise douce* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358079/cerise-douce). | Québec French `cerise douce`, English `sweet cherry`, and *Prunus avium*. Reused from the dried sweet-cherry review for terminology, not dried-product scope. |
| `WP03-DRIED-NEXT-20261009-S10` | OQLF, [*cerise acide* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358080/cerise-acide). | Québec French `cerise acide`, English `sour cherry`, and *Prunus cerasus*. Reused from the dried tart-cherry review for terminology, not dried-product scope. |
| `WP03-FRUIT-PITTED-20261011-S05` | Baking With Butter, [*Cherry Cake Filling*](https://bakingwithbutter.com/cherry-cake-filling/#mv-creation-197-jtr). | The printable card supports the recipe-specific 460 g / 1 lb fresh-or-frozen pitted-cherry amount. The article text also describes sweet cherries as the base, allows a mixture with sour cherries, and adjusts sugar for tart fruit. This review rechecked the page on 2026-10-19; if integrated, expand the existing source locator/support rather than creating a second source ID for the URL. No transferable catalog measurement is supported. |

This proposal changes no catalog data, ledger, legacy list, recipe, plan, roadmap, workflow, or tests. No tests were run.

## Root integration decision

Accepted and integrated on 2026-10-19 as two identity-only `FRUIT` references: `ingredient-ref-sweet-cherries` and `ingredient-ref-sour-cherries`. The existing generic cherry identity, pitted form, dried cherry identities, and recipe 029 link remain unchanged. The shared Baking With Butter source locator now also records the article's sweet/sour context; its 460 g / 1 lb amount remains recipe-specific and was not added to either new reference as a measure or observation. See the [R917–R918 integration README](../batches/wp03-r917-r918-generic-fruit-integration-20261019/README.md).
