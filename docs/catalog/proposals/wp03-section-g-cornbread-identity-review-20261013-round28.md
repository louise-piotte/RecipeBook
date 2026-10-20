# WP03 Section G — cornbread / pain de maïs identity review (R28, 2026-10-13)

**Status:** Proposal only. No catalog JSON, research ledger, shared plan, roadmap, or other shared file was edited.

**Scope:** One prepared bread identity, its Québec French display, picker boundaries, bundled recipe demand, and any directly supported numeric or recipe behavior.

## Checklist anchor and prior-work check

The selected open candidate is the regional prepared bread **cornbread / pain de maïs**, under the exact plan line at [WP03 Section G, line 2688](../../RecipeBook-global-ingredient-catalog-plan.txt#L2781):

> [ ] Naan, roti, paratha, injera, bread rolls, sandwich bread, sourdough bread, and regional breads used as ingredients.

Before choosing it, I checked the current Section G checklist and archived WP03 Section G proposals and batches. The named work for wrappers, tortillas, pita/lavash, naan/roti/paratha/chapati, injera, generic bread rolls, sandwich bread, sourdough bread, bagels, arepas, bannock, baguette, focaccia, crumbs, and purchased dough boundaries is already represented in the plan/archive. The R24 arepa packet mentions cornbread and pain de maïs only to keep those terms out of the arepa alias set; it does not decide whether cornbread has its own identity. No prior cornbread identity review or active cornbread reference was found.

## Recommendation

Accept one identity-only prepared-bread reference if the coordinator accepts this proposal:

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-cornbread |
| Category | BAKING_MIXIN_AND_PANTRY |
| English display | cornbread |
| English aliases | corn bread; corn breads |
| fr-CA display | pain de maïs |
| fr-CA aliases | pains de maïs |
| defaultDensity | null |
| unitMappings | empty |

Use **pain de maïs** as the Québec French display. The OQLF’s preferred term is pain de maïs and its English equivalent is corn bread. The entry describes a baked bread made with cornmeal, wheat flour, eggs, milk, and leavening; it was last updated in 1986. Fondation Olo’s current Québec recipe independently uses pain de maïs and labels it “ou cornbread.” Health Canada’s current English and French recipe pages also pair Cornbread with Pain de maïs [S01–S03]. Use the one-word English display cornbread from current Canadian usage and retain the OQLF’s spaced English spelling as an alias.

Scope the identity to finished bread sold or named cornbread / pain de maïs. Recipes differ in their flour, leavener, sweetness, and pan or loaf format; do not encode one source’s formula as a universal ingredient declaration. The American Society of Baking describes chemically leavened U.S. batter and yeast-leavened versions elsewhere. It also uses maize bread as an alternate name, but that term lacks current Québec or Canadian product corroboration in this review, so keep it out of the alias set [S05].

Keep this finished bread separate from cornmeal / semoule de maïs, polenta, corn flour, precooked corn flour, tortillas de maïs, arepas, generic flatbread, generic bread, corn muffins, johnnycakes, hush puppies, corn cakes, and cornbread dressing. Fondation Olo’s recipe uses quick-cooking polenta to make one named pain de maïs; that ingredient line does not make polenta an alias or establish a reusable polenta-to-bread conversion. The earlier arepa review also explicitly excludes cornbread / pain de maïs from arepa aliases [S02, R24].

## Current catalog and picker collision audit

Snapshot checked on 2026-10-13. The live seed contains 1,355 ingredient references and 100 ingredient forms. Accent-, punctuation-, and case-folded exact ownership checks found no reference or form term for cornbread, corn bread, corn breads, pain de maïs, pains de maïs, maize bread, or the proposed ID. Simulating the current IngredientReferenceSearchIndex phrase-first, partial-fallback search over all active reference and form terms returned no matches for those complete candidate phrases. The 64 legacy import candidates also have no exact owner for them.

The adjacent live identities are distinct:

| Current identity | Current display | Boundary |
|---|---|---|
| ingredient-ref-cornmeal | cornmeal / semoule de maïs | Milled ingredient, not the baked bread. |
| ingredient-ref-corn-tortillas | corn tortillas / tortillas de maïs | Tortilla product, not bread made with cornmeal. |
| ingredient-ref-arepa | arepa / arepa | Prepared maize food with its own product identity. |
| ingredient-ref-flatbread | flatbread / pain plat | Broad flatbread family, not a synonym for this named bread. |
| ingredient-ref-bread-roll | bread roll / petit pain | Generic small roll, not this named bread. |
| ingredient-ref-brioche-bread | brioche bread / pain brioche | Different named bread. |
| ingredient-ref-breadcrumbs and ingredient-ref-panko | bread crumbs / chapelure; panko bread crumbs / chapelure panko | Crumb products are not aliases or forms of cornbread. |

The current picker returns 18 references for the broad query corn, 20 for maïs, 13 for bread, and 15 for pain. Do not add standalone aliases for these generic words. Proposed full phrases are unowned today and will resolve to the proposed identity if accepted.

The proposed full labels necessarily contain these words, so the conditional row will also appear in those broader searches: the projected counts become 19 for `corn`, 21 for `maïs`, 14 for `bread`, and 16 for `pain`. Each remains a multi-result query; no standalone generic alias is added.

## Bundled recipe corpus scan

I scanned every recipe file named by the bundled-library manifest as full UTF-8 JSON and scanned each ingredient row separately. The corpus contains 114 files, 1,123 ingredient rows, and 753,792 raw recipe bytes. The scan included cornbread, corn bread, cornbreads, corn breads, maize bread(s), pain de maïs and pains de maïs, pain au maïs, cornmeal bread, corn meal bread, corn cake(s), corn muffin(s), corn pone, spoonbread, and cornbread dressing.

- Full recipe JSON matches: 0.
- Ingredient-row matches: 0.
- Bundled recipe links to add: none.

This is source-backed coverage for a prepared bread named as a recipe ingredient elsewhere; it is not a response to a bundled recipe line. An Alabama Cooperative Extension recipe uses both crumbled bread and crumbled cornbread as separate ingredients in cornbread dressing [S06]. That example supports the ingredient use and product boundary; it is not a bundled recipe link or a general measure.

## Forms, numeric data, conversions, yields, substitutions, and recipe links

| Area | Disposition |
|---|---|
| Aliases | Add only the proposed English spelling variants and French plural listed above. Do not add maize bread, cornmeal bread, pain au maïs or pains au maïs, corn muffin(s), johnnycake(s), hush puppy/hush puppies, corn cake(s), corn pone, cornbread dressing, corn, maïs, bread, or pain as aliases. These terms either cover other products or are too broad. |
| Forms | Add no ingredient forms. Crumbled, stale, toasted, or muffin-shaped products are preparation or separately named product states; the reviewed sources do not establish reusable cornbread form semantics. Do not attach crumb or muffin forms to this identity. |
| Numeric data | Add no active measures, default density, unit mappings, or per-piece weight. Health Canada’s Canadian Nutrient File record 3693 is specifically “Bread, cornbread, homemade, made with 2% milk” / “Pain, semoule de maïs, fait maison, avec lait 2% M.G.” It reports 1/2 slice = 32.5 g, one 6.3 × 6.3 × 3.8 cm piece = 65 g, and one 20 cm × 20 cm cake = 586 g. Preserve these values only as evidence about that exact CNF record; do not transfer them to a generic catalog identity [S04]. This proposal adds no ledger record. |
| Conversions | Add no volume-to-mass, piece-to-mass, cornmeal-to-bread, polenta-to-bread, or other bread conversion. Ingredient quantities from the Fondation Olo, Health Canada, and dressing recipes are formula-specific, not general conversions. |
| Yields | Add no package yield or generic recipe yield. Fondation Olo’s eight portions / sixteen squares and Health Canada’s 16 portions describe their respective recipes and pans; they are not generic product yields [S02–S03]. |
| Substitutions | Add no global or contextual substitution rule. Fondation Olo says its named pain de maïs can replace white bread as an accompaniment to a main dish, soup, or slaw. This is a scoped serving suggestion without a general quantity, role rule, or replacement behavior; keep it as source context only [S02]. |
| Recipe links | Add none. The full corpus and all ingredient rows have no matching term, so there is no bundled line to relink. |

## Source register

All sources were opened on 2026-10-13. The source IDs below are proposal-local and were not added to the shared research ledger.

| ID | Source and supported claim | Limits |
|---|---|---|
| WP03-G-CORNBREAD-20261013-R28-S01 | Office québécois de la langue française, [GDT: pain de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17038856/pain-de-mais). Gives preferred French term pain de maïs, English corn bread, and defines a baked cornmeal bread. | Last updated in 1986; supports terminology and a traditional definition, not every current formula or product format. |
| WP03-G-CORNBREAD-20261013-R28-S02 | Fondation Olo, [Pain de maïs](https://fondationolo.ca/fr/recettes/pain-de-mais/). Current Québec French page labels the recipe pain de maïs (ou cornbread), describes it as an accompaniment that can replace white bread, and provides one recipe using dry quick-cooking polenta. | One formula and one serving context; it does not define all cornbread or justify a substitution rule or conversion. The page states eight portions; its [recipe PDF](https://fondationolo.ca/media/clxkaswm/fondation-olo-recette-pain-de-mais.pdf) specifies sixteen squares, two per person. |
| WP03-G-CORNBREAD-20261013-R28-S03 | Health Canada, [Cornbread](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/recipes/cornbread.html) and [Pain de maïs](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/recettes/pain-mais.html). The paired current recipe titles provide English cornbread and Québec French pain de maïs; the recipe is baked in a square pan and cut into portions. | A home recipe with its own ingredient ratios and 16 portions, not a class-wide formula, conversion, or yield. |
| WP03-G-CORNBREAD-20261013-R28-S04 | Health Canada, Canadian Nutrient File, [Serving size: Bread, cornbread, homemade, made with 2% milk](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3693). Food code 3693 supplies the bilingual record description and source-specific slice, piece, and cake masses listed above. | Exact CNF food description only; do not generalize its values to other recipes or products. |
| WP03-G-CORNBREAD-20261013-R28-S05 | American Society of Baking, [Cornbread](https://asbe.org/article/cornbread/). Technical article describes U.S. chemically leavened batter and yeast-leavened cornbread elsewhere, and uses maize bread as an alternate name. | Technical product-family source; it does not establish maize bread as current Québec or Canadian retail wording. |
| WP03-G-CORNBREAD-20261013-R28-S06 | Alabama Cooperative Extension System, [No Fuss Cornbread Dressing](https://www.aces.edu/blog/topics/by-ingredients/live-well-recipe-no-fuss-cornbread-dressing/). Ingredient list and method use two cups of crumbled cornbread separately from one cup of crumbled bread in a dressing. | One regional recipe and quantity; it supports use as an ingredient and separation, not a reusable measure or substitution rule. |
| Reused R24 boundary | [WP03 Section G arepa identity review](wp03-section-g-arepa-identity-review-20261013-round24.md). It excludes cornbread, pain de maïs, and other broad corn-bread terms from the arepa alias set. | This was an arepa boundary decision, not an independent cornbread identity review. |

## Review record

- Plan/archive check: one candidate only, anchored at WP03 Section G line 2676.
- Exact reference/form phrase ownership and picker behavior checked against the current 1,355 references and 100 forms; exact legacy ownership checked against all 64 legacy import candidates.
- Recipe scan covered all 114 manifest-listed recipe JSON files and 1,123 ingredient rows.
- Proposal-local source IDs and direct links were checked for uniqueness in the existing archive. No shared source ledger or plan update was made.
- UTF-8/no-BOM, mojibake, whitespace, and proposal-local link checks were run after writing.
- No app, unit, instrumentation, emulator, or other implementation tests were run; this change is proposal-only.
