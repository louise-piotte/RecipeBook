# WP03 Section L R654 integration — dried ñora pepper identity

Integrated on 2026-10-18 after root review of the [R654 proposal](../../proposals/wp03-section-l-nora-dried-pepper-identity-review-r654-20261018.md).

## Catalog decision

- Added identity-only `dried ñora pepper / piment ñora séché` as `ingredient-ref-nora-pepper` in `VEGETABLE_AND_AROMATIC`.
- Added only the reviewed English aliases `ñora peppers` and `nyora peppers`, and French alias `piments ñora`. The French display is provisional local Montréal wording, not an OQLF-approved named term.
- Kept fresh pimiento de bola, ground pimentón/paprika, pimiento choricero, and prepared ñora pulp separate. The Murcia source supports its regional dried-product name and its ground pimentón boundary; it does not establish a universal cultivar or fresh-to-dry rule.
- The Canadian retailer page supports the dry-product and `nyora` spelling but currently shows the item sold out. No bundled recipe demand was found in 114 recipes / 1,123 ingredient rows.
- Added no forms, measurements, density, unit mappings, conversions, recipe links, yields, or substitutions. Measurement and substitution research remain `not_yet_researched`.

## Ledger and validation

- Added one accepted identity decision and nine new evidence sources to the ledger. Reused the existing OQLF generic `piment` entry by source ID; no duplicate source ID was created for that page.
- The integrated package has 1,834 ingredient references and 164 forms. The ledger has 2,207 records and 10,316 source entries across 8,712 distinct source IDs.
- Static package validation, generated-index freshness, ledger schema/custom validation, source and ID ownership, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed because this change adds database JSON data under `AGENTS.md`.

## Sources

- [Instituto de Turismo de la Región de Murcia — Ve al mercado](https://itrem.carm.es/es/ir_al_mercado/) identifies pimiento de bola dried as ñora and says grinding ñora produces pimentón.
- [Región de Murcia — D.O. Pimentón de Murcia](https://www.carm.es/web/pagina?IDCONTENIDO=835&IDTIPO=11&RASTRO=c%24m1185%2C34701) defines the protected ground product.
- [L'Española — Recette authentique de paella aux fruits de mer](https://lespanola.com/fr/blogs/recipes/authentic-seafood-paella-recipe) uses the exact French phrase `piment ñora séché` and lists paprika separately.
- [Little Spain Market Canada — Dry Ñora Peppers](https://littlespainmarket.ca/products/dry-nora-peppers-la-barraca-110g) calls the product ñora peppers and nyora peppers; the listing showed sold out when reviewed.
- [TERMCAT — nyora](https://www.termcat.cat/ca/diccionaris-en-linia/184/fitxa/MTg5ODUyMw%3D%3D) records Catalan `nyora` with Spanish `ñora`; its pungency description was not turned into a fixed heat claim.
- [OQLF — piment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment) supports the generic French noun only and is reused from R144.

Section L remains open.
