# WP04 Section P white perch / baret identity integration

Added identity-only `white perch / baret` as `ingredient-ref-white-perch` in `PROTEIN` for
*Morone americana*. Kept aliases empty so broad `perch` queries retain species-qualified choices
and the CFIA-listed `bar blanc d’Amérique` cannot become the sole result for `bar`. White bass,
yellow perch, Nile perch, striped bass, and unretained French fish-product names remain separate.
No forms, measures, density, mappings, conversions, yields, recipe links, or substitutions were
added.

The OQLF edible-fish entry supports `baret`; the CFIA Fish List search-result output is recorded
with its access limitation because the exact result endpoint did not render directly. SeaCore's
whole-fish and fillet sizes are supplier-specific and are not generalized. The 114-recipe /
1,123-row corpus has no matching demand.

Evidence and picker/corpus details are in [the review proposal](../../proposals/wp04-section-p-next-gap-review-20261012-round9.md), including [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198873/baret), the [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), and [SeaCore's product page](https://www.seacoreseafood.com/product/white-perch).

Static package, generated-index, ledger, ownership, corpus, encoding, and whitespace checks were
run. No app tests or emulator checks were run because this only adds database JSON data and its
generated search index.
