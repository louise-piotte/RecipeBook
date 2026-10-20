# WP02 B2/B3 whole pinto bean flour identity integration

Added identity-only `whole pinto bean flour / farine de haricots pinto` as
`ingredient-ref-pinto-bean-flour` in `FLOUR_AND_STARCH`. The French display remains provisional
pending independent Québec product-name review. Both alias arrays are empty; the entry remains
separate from whole pinto beans and black bean flour. No forms, measures, density, unit mappings,
conversions, yields, recipe links, or substitutions were added.

Avena Foods supplies the exact English product title. OQLF supports the underlying pinto-bean
term, and Cuisinart Canada's indexed French manual wording supports the proposed French phrase only;
the PDF could not be retrieved directly, so its 15 mL recipe quantity is not recorded as a flour
measure. The 114-recipe / 1,123-row corpus has no flour demand. Recipe `007#4` remains the existing
canned whole-bean line with liquid.

Sources and ownership/picker/corpus details are in [the review proposal](../../proposals/wp02-b2b3-next-gap-review-20261012-round8.md), including [Avena Foods](https://www.avenafoods.com/products/pulses-and-pulse-ingredients/flours/), [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083587/haricot-pinto), and the [Cuisinart Canada booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1770545043648/Instruction%20Booklet/CYM-100C_fr.pdf).

Static package, generated-index, ledger, ownership, corpus, encoding, and whitespace checks were
run. No app tests or emulator checks were run because this only adds database JSON data and its
generated search index.
