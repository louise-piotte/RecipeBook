# WP06 Section U Mexican herb and Québec French review (R1007)

**Date:** 2026-10-19  
**Status:** integrated in [the R1007 batch](../batches/wp06-section-u-mexican-herbs-r1007-integration-20261019/README.md)  
**Plan anchor:** Section U, “Epazote, hoja santa, huacatay, papalo, lovage, sorrel, fenugreek leaves, lemon verbena, and lemon balm.”

This review continues generic culinary ingredient coverage. It does not expand branded products, commercial product lines, flavours, SKUs, or retailer variants. Existing references and product-scoped evidence remain intact.

## Decisions

| Ingredient | Decision | Catalog change and limits |
|---|---|---|
| Epazote | Retain the existing `ingredient-ref-epazote` identity. | Set the Québec French display to OQLF-preferred `épazote` and add `fausse-ambroisie` as a French alias. Keep English `epazote`; do not add broader names with cross-species ambiguity. No forms or numeric data. |
| Hoja santa | Retain the existing `ingredient-ref-hoja-santa` identity, distinct from avocado leaf. | Add the Mexican culinary names `acuyo` and `hierba santa` as search aliases. Keep `hoja santa` for both displays because this review did not find a Québec French replacement. No forms or numeric data. |
| Pápalo | Add identity-only `papalo / pápalo` in `HERB` for the named Mexican culinary herb. | Use the source name in both languages; add no aliases or forms. SADER names *Porophyllum ruderale* subsp. *macrocephalum* and describes fresh taco use. The entry does not claim every regional use of `papaloquelite` or related names has the same botanical scope. |

SADER also says pápalo may substitute for cilantro, but gives no dish, role, form, method, ratio, or outcome criteria. The ledger records the claim as `blocked_pending_evidence`; no active substitution rule was created. No measurement was researched or generalized. No bundled recipe matched pápalo or the queried herb names, so no recipe link was added.

## Current-catalog audit

The pre-change live package had 2,018 references, 205 forms, 99 legacy candidates, and 114 bundled recipes / 1,123 ingredient rows. Exact normalized-name checks found epazote and hoja santa only on their existing reference rows; `fausse-ambroisie`, `acuyo`, `hierba santa`, pápalo spellings, and queried botanical names had no other reference, form, or legacy owner. The bundled recipe scan found no matching candidate rows. Existing records were not deleted, merged, or relinked.

The previous [Mexican herb boundary review](wp06-mexican-herb-identity-boundaries-20261009.md) remains as historical research. Its catalog snapshot is stale; this R1007 review rechecked the live state before integration.

## Sources

- **WP06-MEX-HERB-R1007-20261019-S01 —** Office québécois de la langue française, [fausse-ambroisie (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503262/fausse-ambroisie), updated 2009; definition, preferred French terms, and English translation. Supports `épazote`, `fausse-ambroisie`, and English `epazote`; its older Latin name is not used to change the existing identity.
- **WP06-MEX-HERB-R1007-20261019-S02 —** Secretaría de Agricultura y Desarrollo Rural, [Quelites, el pequeño gran tesoro de la alimentación](https://www.gob.mx/agricultura/es/articulos/quelites-el-pequeno-gran-tesoro-de-la-alimentacion?idiom=es), 2026-08-13; entries for pápalo and hoja santa. Supports the named *P. ruderale* subsp. *macrocephalum* culinary herb and its fresh taco use, plus *Piper auritum* and the hoja-santa names `acuyo` and `hierba santa`.
- **WP06-MEX-HERB-R1007-20261019-S03 —** Secretaría de Agricultura y Desarrollo Rural, [Pápalo la hierba alas de mariposa](https://www.gob.mx/agricultura/es/articulos/papalo-la-hierba-alas-de-mariposa), 2016-06-02; culinary-use paragraphs. Supports pápalo as a culinary herb and records a broad cilantro-substitute suggestion. That statement lacks contextual conditions and is not treated as a general rule.

