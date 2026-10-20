# WP03 Section G — Focaccia Identity Review

**Reviewed:** 2026-10-13 (round 23)

**Status:** Proposal only; no catalog, ledger, generated, plan, roadmap, code, or test files were changed.

**Scope:** Focaccia as a finished prepared bread ingredient, with its boundary from generic flatbread and nearby active bread identities.

## Recommendation

Integrate one identity-only prepared-bread reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-focaccia` |
| Category | `BAKING_MIXIN_AND_PANTRY` |
| English display | `focaccia` |
| English aliases | `focaccias` |
| fr-CA display | `focaccia` |
| French aliases | `focaccias` |
| Density / unit mappings | None |
| Forms / recipe links | None |

Québec French sources use *focaccia* as the name of the finished bread. The OQLF’s 2026 *pain plat* entry also uses the plural *focaccias* as an example within the broad flatbread family. Keep the named product separate from the family: do not add `flatbread`, `flatbreads`, `flat bread`, `pain plat`, or `pains plats` as aliases. Focaccia remains separate from naan, roti, paratha, chapati, pita, lavash, injera, rolls, sandwich bread, sourdough bread, bagels, brioche, and pizza dough.

This exact identity was left open in R22: that family review said focaccia could receive its own future row if an exact ingredient use warranted it. The direct Québec ingredient example below supplies that use; R22’s generic-family decision and integration did not add or individually review a focaccia identity. The Section G regional-breads item remains open in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Ownership and recipe demand

The 2026-10-13 snapshot has 1,349 active references and 98 forms. Searches across active bilingual displays and aliases, form labels and match terms, the generated picker catalog, and 64 legacy import candidates found no exact owner for `focaccia`, `focaccias`, `focacce`, `focaccia bread`, `pain focaccia`, `fouace`, `fouasse`, or `fougasse`. The research ledger has no focaccia identity record. Its only focaccia text is in the bread-flour test-kitchen record, where focaccia is one of several breads in a formula-specific flour comparison; that finding does not own the prepared bread or establish its measurements.

I scanned all 114 manifest-listed bundled recipe files, including decoded string fields and all 1,123 ingredient rows. The corpus has no focaccia spelling or ingredient line. Its manifest-ordered snapshot is 753,792 bytes with SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. The current adjacent prepared-bread ingredient line is Recipe 075#4, `5 to 8 slices brioche bread`, already linked to `ingredient-ref-brioche-bread`; it is not focaccia demand.

The Québec media recipe [*Focaccia au porc effiloché*](https://cuisinez.telequebec.tv/recettes/8035/focaccia-au-porc-effiloche) lists `1 focaccia (maison ou du commerce)` as an ingredient for six portions. That wording treats focaccia as a distinct ready-made product even when it is store-bought. The [ITHQ’s *La recette de focaccia d’Elvio Galasso*](https://www.ithq.qc.ca/blogue/la-recette-de-focaccia-delvio-galasso/) independently uses the same French product name. These sources establish a useful picker identity without linking any bundled recipe.

## Active names and boundaries

The live reference file has no exact focal owner. The neighboring active identities inspected are:

| Active ID | English display / aliases | fr-CA display / aliases | Keep separate because |
|---|---|---|---|
| `ingredient-ref-flatbread` | `flatbread` / `flatbreads` | `pain plat` / `pains plats` | This is the generic family row, not a focaccia synonym. [S01] |
| `ingredient-ref-naan-bread` | `naan bread` / `nan` | `pain naan` / `nan` | Named naan product. |
| `ingredient-ref-roti` | `roti` / none | `roti` / none | Named bread; current query also finds toasted rice powder through French `rôti`. |
| `ingredient-ref-paratha` | `paratha` / none | `paratha` / none | Named bread. |
| `ingredient-ref-chapati-bread` | `chapati` / `chapatti`, `chappati`, `chapathi` | `chapati` / `chapatis` | Prepared bread; current query also finds atta through flour aliases. |
| `ingredient-ref-injera` | `injera` / `injera bread` | `injera` / none | Named bread. |
| `ingredient-ref-pita-bread` | `pita bread` / none | `pain pita` / none | Named bread. |
| `ingredient-ref-lavash-bread` | `lavash bread` / none | `pain lavash` / none | Named bread. |
| `ingredient-ref-bread-roll` | `bread roll` / `bread rolls` | `petit pain` / `petits pains` | Generic roll identity. |
| `ingredient-ref-sandwich-bread` | `sandwich bread` / `sandwich loaf` | `pain de mie` / `pain à sandwich` | Sandwich loaf identity. |
| `ingredient-ref-sourdough-bread` | `sourdough bread` / none | `pain au levain` / none | Finished bread, separate from sourdough starter. |
| `ingredient-ref-bagel` | `bagel` / `bagels`, `beigel` | `bagel` / `baguel` | Named bread product. |
| `ingredient-ref-brioche-bread` | `brioche bread` / none | `pain brioche` / none | Separate prepared bread and current recipe ingredient. |
| `ingredient-ref-pizza-dough` | `pizza dough` / none | `pâte à pizza` / none | Dough is not the finished focaccia product. |

None of the prepared-bread comparators above has a form attached in the live forms file. Keep focaccia itself independent; no focal variety, dough state, filling, garlic/cheese topping, or generic bread form is proposed.

## Picker projection

The recipe editor builds its search index from active references and forms ([picker](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt#L1064)). Search folds case, accents, ligatures, punctuation, and spaces; it returns full word-phrase matches before trying substring matches ([search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23)). The table applies that behavior to the current catalog and then projects one row with only the displays and plural aliases above.

| Query | Current picker result | With proposed row | Boundary |
|---|---|---|---|
| `focaccia` | No result | `ingredient-ref-focaccia` | Exact borrowed product name. |
| `focaccias` | No result | `ingredient-ref-focaccia` | OQLF-attested plural alias. [S01] |
| `focacce`, `focaccia bread`, `pain focaccia` | No result | No result | No alias proposed for Italian plural or unverified compounds. |
| `fouace`, `fouasse`, `fougasse` | No result | No result | Excluded; see the distinct OQLF entry [S04]. |
| `flatbread`, `pain plat` | `ingredient-ref-flatbread` | Same | Family query remains family-level. |
| `naan`, `nan`, `pain naan` | `ingredient-ref-naan-bread` | Same | Named product stays separate. |
| `roti` | `ingredient-ref-roti`, `ingredient-ref-toasted-rice-powder` | Same | Existing co-result comes from accent folding French `rôti`. |
| `paratha` | `ingredient-ref-paratha` | Same | Named product stays separate. |
| `chapati` | `ingredient-ref-atta`, `ingredient-ref-chapati-bread` | Same | Existing flour/bread co-result comes from atta aliases `chapati flour` and `farine à chapati`. |
| `pita`, `pita bread`, `pain pita` | `ingredient-ref-pita-bread` | Same | Named product stays separate. |
| `lavash`, `pain lavash` | `ingredient-ref-lavash-bread` | Same | Named product stays separate. |
| `injera`, `injera bread` | `ingredient-ref-injera` | Same | Named product stays separate. |
| `bread roll`, `petit pain` | `ingredient-ref-bread-roll` | Same | Roll identity stays separate. |
| `sandwich bread`, `pain de mie` | `ingredient-ref-sandwich-bread` | Same | Sandwich-loaf identity stays separate. |
| `sourdough bread`, `pain au levain` | `ingredient-ref-sourdough-bread` | Same | Finished bread stays separate from starter. |
| `bagel`, `baguel`, `beigel` | `ingredient-ref-bagel` | Same | Bagel identity stays separate. |
| `brioche`, `pain brioche` | `ingredient-ref-brioche-bread` | Same | Prepared brioche identity stays separate. |
| `pizza dough`, `pâte à pizza` | `ingredient-ref-pizza-dough` | Same | The dough query does not resolve to focaccia. |

The proposed row does not appear in any current family or named-bread projection. Searches for `focaccia` and its attested plural resolve only to the proposed identity. Broad aliases such as `bread`, `flatbread`, or `pain plat` would turn those family or generic searches into an unsuitable focaccia suggestion, so keep them out.

## Measurement and substitution limits

The Tele-Québec ingredient quantity `1 focaccia` is a count in one recipe, not a standard package yield, serving mass, density, or count-to-mass conversion. The ITHQ recipe describes one homemade formula; its flour, water, oil, timing, and yield do not define all focaccia. Add no measure, unit mapping, density, package yield, or form. Both active substitution-rule files are empty, and the ledger’s bread-flour findings are formula-specific flour comparisons, not prepared-bread substitutions. Add no global or contextual substitutions and do not infer focaccia ↔ pizza dough or focaccia ↔ generic flatbread interchangeability.

## Evidence

| ID | Source and supported claim | Limits |
|---|---|---|
| **WP03-G-FOCACCIA-20261013-R23-S01** | Office québécois de la langue française, [*pain plat* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488041/pain-plat), updated 2026. Gives *pain plat* as the French family term, *flatbread* in English, and cites *focaccias* as leavened examples. | Family membership and plural spelling do not make *pain plat* a focaccia synonym or establish bread-to-bread substitutions. |
| **WP03-G-FOCACCIA-20261013-R23-S02** | Télé-Québec Cuisinez, [*Focaccia au porc effiloché*](https://cuisinez.telequebec.tv/recettes/8035/focaccia-au-porc-effiloche), accessed 2026-10-13. Uses the French name *focaccia* and lists one homemade or store-bought focaccia as a recipe ingredient. | One recipe supports identity and product use; it does not establish a package size, general yield, mass, or serving conversion. |
| **WP03-G-FOCACCIA-20261013-R23-S03** | Institut de tourisme et d’hôtellerie du Québec, [*La recette de focaccia d’Elvio Galasso*](https://www.ithq.qc.ca/blogue/la-recette-de-focaccia-delvio-galasso/), published 2018. Québec culinary-school material uses *focaccia* as the French product name. | One homemade recipe; do not generalize its ingredient ratios, process, or output to catalog measurements or forms. |
| **WP03-G-FOCACCIA-20261013-R23-S04** | OQLF, [*fouace* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17016352/fouace), updated 1994. Its definition is a rustic brioché galette associated with Christmas or Epiphany; it lists *fouace*, *fouasse*, and *fougasse* as preferred French terms and *focaccia* as the English translation. | This narrow older record does not support these French terms as aliases for the contemporary Québec recipe’s Italian-style bread; keep all three out of the proposed aliases. |

## Disposition

Integrate the identity-only `ingredient-ref-focaccia` row with `focaccia` as both displays and `focaccias` as the sole alias in each locale. Keep recipe links, forms, measurements, conversions, yields, and substitutions empty. Leave the broader Section G regional-breads checklist open for the remaining gaps.
## Coordinator integration decision (2026-10-13)

Accepted and integrated as identity-only `ingredient-ref-focaccia`, with `focaccia` as the English and French display and `focaccias` as the plural alias in both locales. No forms, numeric data, recipe links, or substitutions were added. See the [R23 integration record](../batches/wp02-wp03-wp04-round23-gap-review-integration-20261013/README.md).
