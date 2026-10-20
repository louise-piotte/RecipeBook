# WP03 Section M: generic candied citrus peel boundary review (R923)

- **Reviewed:** 2026-10-19
- **Disposition:** accept one identity-only cross-citrus `candied citrus peel / écorce d’agrumes confite` reference, separate from the existing species-specific candied peel references, dried citrus peel, and zest.
- **Scope:** the generic culinary peel product only. This proposal does not change shared catalog data, recipes, the ledger, checklist, roadmap, or workflow.

## Recommendation

Add `ingredient-ref-candied-citrus-peel` in `FRUIT` with this bilingual identity:

| Field | Proposed value |
|---|---|
| English display | `candied citrus peel` |
| Québec French display | `écorce d’agrumes confite` |
| English alias | `candied citrus peels` |
| Québec French alias | `écorces d’agrumes confites` |
| Category | `FRUIT` |

The singular English and French displays name the generic ingredient; source-attested plurals are useful picker spellings. The French phrase follows the Québec culinary wording in Zeste's recipe title and ingredient description. It is a clear generic description, not a claim that OQLF has entered the cross-citrus phrase as a preferred term.

The evidence now supports a peel-qualified generic identity. Bon Appétit titles a recipe *Candied Citrus Peel*, combines orange, lemon, and pink grapefruit in that recipe, and calls the resulting ingredient “citrus peel.” Québec culinary publisher Zeste titles its recipe *Écorces d'agrumes confites* and names lemon, orange, or grapefruit as its source fruit. King Arthur Baking describes candying as applicable to citrus peels generally and names lemon, grapefruit, pomelo, and kumquat, with orange as its worked example. These sources support one cross-citrus culinary class. They do not make each species-specific product an alias of the generic identity or establish equal flavor, cut, or recipe performance across species. [S01–S03]

This resolves a narrower question than the earlier hold on unspecified “candied citrus.” The unqualified phrase can refer to a peel, slice, or whole-fruit preserve. The proposed phrase explicitly says **peel**, and the cited recipes make the peel boundary clear. Keep a request for simply `candied citrus` unresolved until its cut or product is clear. The prior Section M boundary review and the WP02 inclusion review remain valid for that broader phrase. [S08–S09]

## Existing identities and product-state boundaries

The live package snapshot reviewed on 2026-10-19 has 1,944 active ingredient references, 204 ingredient forms, and 55 legacy candidates. Relevant active identities are:

| Current identity | Treatment |
|---|---|
| `ingredient-ref-candied-lemon-peel` — `candied lemon peel / écorce de citron confite` | Preserve as the exact lemon-specific identity; do not alias it to the cross-citrus candidate. OQLF directly documents this product name and its use in cakes, puddings, and mincemeat. [S05] |
| `ingredient-ref-candied-orange-peel` — `candied orange peel / écorce d’orange confite` | Preserve as the exact orange-specific identity; do not alias it to the cross-citrus candidate. OQLF directly documents this product name and culinary use. [S06] |
| `ingredient-ref-dried-citrus-peel` — `dried citrus peel / écorce d’agrumes séchée` | Keep separate: it is unsweetened dried peel, not peel candied in sugar/syrup. The R918 decision and its source limits remain intact. [S07] |
| `ingredient-ref-citrus-zest` — `citrus zest / zeste d’agrumes` | Keep separate: OQLF defines zest as the colored, aromatic outer part of citrus rind and distinguishes the white layer beneath. Candied peel is a sweetened peel product, not a zest synonym. [S04] |
| `ingredient-ref-lemon-zest` and `ingredient-ref-dried-orange-zest` | Preserve their species-specific zest boundaries; neither is an alias or form of candied peel. [S04, S10] |

The new identity is a generic product reference, not a form under lemon, orange, or another whole-fruit reference. Do not add forms for strip width, peel thickness, pith amount, syrup-packed versus drained state, sugar coating, or cut size. The reviewed sources describe such recipe or preparation details, but do not establish a shared form taxonomy needed by the current catalog.

Do not add `candied citrus`, `candied peel`, `mixed peel`, `fruit confit`, or `succade` as aliases. Those phrases can name a broader or differently composed product, and the reviewed sources do not establish them as unambiguous synonyms for the proposed generic peel identity. Do not add citrus species names as aliases either: those would erase useful species specificity in the existing lemon and orange identities.

## Exact-key and picker audit

The live exact-key scan followed `normalizeIngredientSearchKey` in `IngredientSearch.kt` across all active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. The following candidate keys have no current exact owner:

| Proposed term | Normalized key | Current owner |
|---|---|---|
| `candied citrus peel` | `candied citrus peel` | None |
| `candied citrus peels` | `candied citrus peels` | None |
| `écorce d’agrumes confite` | `ecorce d agrumes confite` | None |
| `écorces d’agrumes confites` | `ecorces d agrumes confites` | None |

The exact species-qualified keys already resolve to their current rows: `candied lemon peel` and `écorce de citron confite` map to `ingredient-ref-candied-lemon-peel`; `candied orange peel` and `écorce d’orange confite` map to `ingredient-ref-candied-orange-peel`. Keep these owners unchanged.

With the proposed name and aliases, an exact `candied citrus peel` or `écorces d’agrumes confites` query will resolve to the generic cross-citrus identity, while exact lemon/orange phrases continue to resolve to their species-specific references. Broader `citrus peel` / `écorce d’agrumes` queries can show both the dried and candied generic identities, which represents distinct preparation states. Do not add `candied peel` merely to suppress that distinction; exact phrase matching should preserve the named product scope. This is a static consequence review from the current search implementation, not a picker runtime test.

The proposed ID `ingredient-ref-candied-citrus-peel` is not present in active references, forms, ledger records, or legacy candidates.

## Recipe demand

All 114 bundled recipe JSON files (1,123 ingredient rows) were scanned. No ingredient row or full recipe text contains `candied citrus peel`, `candied lemon peel`, `candied orange peel`, `candied peel`, `mixed peel`, or the corresponding French terms. Recipe demand therefore supports no link or quantity; it does not negate a generic culinary identity supported independently by cross-citrus culinary sources. Preserve all recipes and existing line links.

## Measurement, density, and substitutions

Add no default density, unit mapping, measurement observation, package yield, conversion, or substitution rule.

- Zeste's recipe lists 2 cups (500 ml) of citrus peel and its own recipe water/sugar quantities; Bon Appétit's recipe combines one orange, one lemon, and half a pink grapefruit and reports a finished yield of about 1 1/2 cups. These are recipe-specific inputs and yield, not transferable ingredient conversions. [S01–S02]
- King Arthur's worked example gives about 1 1/2 cups peel with its own 2-cup sugar and water quantities. That demonstration is not a density or generic peel-to-syrup ratio. Do not generalize it to other citrus species or finished candied peel. [S03]
- The sources give no mass-per-volume value that applies across cut, pith, syrup drainage, moisture, sugar coating, and citrus-species differences. Recommend `measurementState: researched_no_supported_value`; keep the cited recipe values in their source scope only.
- The sources show preparation methods across more than one citrus species, but do not establish a recipe-independent substitution between candied citrus peel, candied lemon/orange peel, dried peel, zest, whole candied fruit, or non-citrus candied peel. Do not add aliases or global directed substitutions. Recommend `substitutionResearchState: researched_no_supported_substitute` for this generic reference; any future contextual replacement should be reviewed against the named source recipe, role, and form.

## Sources

Sources were accessed 2026-10-19. These IDs are local to this proposal and have not been added to the shared research ledger.

| ID | Source | Supports and limits |
|---|---|---|
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S01` | Bon Appétit, [Candied Citrus Peel](https://www.bonappetit.com/recipe/candied-citrus-peel) | Exact generic English recipe title; combines orange, lemon, and pink grapefruit and describes the prepared ingredient as citrus peel. The recipe quantities, cut, chilling, and yield are scoped to this recipe. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S02` | Zeste, [Écorces d'agrumes confites](https://www.zeste.ca/recettes/ecorces-dagrumes-confites) | Québec French culinary title and generic ingredient wording; the recipe allows lemon, orange, or grapefruit. Its volume, water/sugar quantities, simmering, storage, and optional sugar coating are recipe-specific. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S03` | King Arthur Baking, [How to make candied citrus peel](https://www.kingarthurbaking.com/blog/2020/08/05/how-to-make-candied-citrus-peel) | Culinary guidance explicitly applies candying to citrus peel across multiple species and identifies the sweetened peel as a baking ingredient. The worked orange example and its quantities/storage statements are not generalized. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S04` | Office québécois de la langue française, [zeste (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497908/zeste) | Defines culinary zest as the colored external citrus-rind layer and distinguishes the white bitter ziste beneath. Supports keeping zest separate from full peel. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S05` | OQLF, [écorce de citron confite (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432972/ecorce-de-citron-confite) | Directly supports the existing lemon-specific term and product identity. Does not make lemon peel a generic alias. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S06` | OQLF, [écorce d'orange confite (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889577/ecorce-dorange-confite) | Directly supports the existing orange-specific term and product identity. Does not make orange peel a generic alias. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S07` | [R918 generic dried citrus peel review](wp03-section-m-generic-dried-citrus-peel-review-r918-20261019.md) | Records the accepted identity boundary and evidence limits for unsweetened dried peel; used only to preserve that existing decision. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S08` | [WP02 baking inclusions and decorations boundary review](wp02-baking-inclusions-decorations-boundary-review-20261010.md) | Earlier review held the broad phrase “candied citrus” but added species-qualified candied orange and lemon peel. This proposal resolves only the narrower, directly sourced peel-qualified generic. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S09` | [WP03 citrus products boundary review](wp03-citrus-products-boundary-review-20261009.md) | Preserves the established separation between generic citrus zest, citrus peel, dried/candied products, and other citrus products. |
| `WP03-M-CANDIED-CITRUS-PEEL-R923-20261019-S10` | OQLF, [zeste d'orange déshydraté (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299059/zeste-dorange-deshydrate) | Supports the existing orange-specific dried-zest identity; not evidence for candied peel. |

No brand, product-line, flavor-family, SKU, or retailer-variant roster was researched. No existing branded entries were reviewed for merging or altered.
