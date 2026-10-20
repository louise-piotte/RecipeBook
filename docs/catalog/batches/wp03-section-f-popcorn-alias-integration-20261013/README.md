# WP03 Section F popcorn alias integration — 2026-10-13

## Decision

Added the OQLF-listed French alias `maïs éclaté` to the existing `ingredient-ref-popcorn`
(`popcorn / maïs soufflé`) identity. OQLF defines *maïs soufflé* as corn popped by heat and lists
*maïs éclaté* as a preferred French term. OQLF separately defines *maïs à éclater* as the variety
used as input, so it remains outside the ready-popped identity.

No reference, form, or recipe link was added. The bundled recipe corpus has no popcorn ingredient
line. The identity keeps its existing category, English display, French display, null density, and
empty unit mappings. No reusable measure, conversion, yield, or substitution was added; RICARDO's
50 g (4 cups) is one recipe-specific observation only.

## Sources

- [OQLF — *maïs soufflé*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358440/mais-souffle): defines the popped food, gives the English equivalent *popcorn*, and lists *maïs soufflé* and *maïs éclaté* as preferred terms.
- [OQLF — *maïs à éclater*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082773/mais-a-eclater): describes the small, hard-kernel variety used to make popped corn.
- [Télé-Québec Cuisinez — *Petit mode d’emploi pour le parfait maïs soufflé maison*](https://cuisinez.telequebec.tv/articles/314/petit-mode-demploi-pour-le-parfait-mais-souffle-maison): uses *grains de maïs* for the input and *maïs éclaté* for the finished popcorn.
- [RICARDO — *Popcorn sucré*](https://www.ricardocuisine.com/recettes/5034-popcorn-sucre): uses *maïs éclaté nature* and specifies one recipe's 50 g (4 cups); that amount is not generalized.

The source records and accepted alias decision are on `ingredient-ref-popcorn` in the research ledger.
The ownership, picker, recipe-corpus, and numeric-boundary review is recorded in the [R53 proposal](../../proposals/wp03-section-f-popcorn-maiz-eclate-alias-review-20261013-r53.md).

## Validation

- Confirmed the exact French alias is unique in active references, forms, and legacy candidates; `maïs à éclater` remains unassigned.
- Confirmed no bundled recipe line needs relinking.
- Package normalization, ingredient-reference normalization, generated-index freshness, ledger validation, UTF-8/no-BOM, and scoped whitespace checks are recorded at integration.
- No tests or emulator checks were run because this change only adds database JSON data under the updated `AGENTS.md` rule.
