# WP04 Section P R450 crab-legs identity integration

Integrated on 2026-10-17 after root review of the [R450 proposal](../../proposals/wp04-section-p-crab-legs-product-boundary-review-r450-20261017.md).

## Decision

Added identity-only `crab legs / pattes de crabe` as `ingredient-ref-crab-legs` in `PROTEIN`, with the singular aliases `crab leg` and `patte de crabe`. OQLF directly pairs those terms and describes a crab leg as a marketable anatomical part. Current Montréal and Québec retailer evidence names king-crab legs and snow-crab legs, supporting a species-neutral cut identity.

Kept claws, picked crab meat, crab cakes, species-qualified products, and snow-crab sections or clusters distinct. OQLF defines a snow-crab section as five legs attached to the shoulder; that product assembly is not a synonym or generic unit for crab legs. The full 114-recipe / 1,123-row bundle has no crab-leg demand. No forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitution rules were added. Measurement research found no supported reusable value; substitution research found no supported substitute.

## Data and validation

- Added one reference and one identity ledger record with eleven source entries. The record reuses La Mer collection source ID `WP04-SECTIONP-CRAB-CLAWS-R435-20261017-S02` unchanged; other reused terminology and retailer sources are identified in the proposal.
- Ingredient forms remain at **141**; recipe files and numeric behavior did not change.
- Current totals: **1,742 references**, **141 forms**, **2,101 research-ledger records**, and **9,562 source entries**.
- Bundled package normalization and validation passed; the generated ingredient index is current. UTF-8, no-BOM, local-path, and touched-document whitespace checks passed.
- No app tests, build, emulator check, or deployment was run because this update only adds database JSON data.

## Sources reviewed

- OQLF GDT entries for [patte de crabe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435848/patte-de-crabe), [patte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199065/patte), [section](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199044/section), and [bouquet de pattes de crabe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18060893/bouquet-de-pattes-de-crabe).
- MAPAQ, [Les crustacés du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf), describing snow-crab commercial categories and pack formats. Those figures were not used as kitchen measures or yields.
- Montréal retailer [La Mer King Crab Legs listing](https://www.lamer.ca/en/products/patte-crabe-royal) and [crab collection](https://www.lamer.ca/collections/crabe), which distinguish king-crab legs, snow-crab products, and leg meat.
- Metro Québec’s indexed [Patte de crabe des neiges listing](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/patte-de-crabe-des-neiges/p/840152300098), item 840152300098. Direct retrieval returned 403; only the indexed title and item locator were used.
- The [CFIA Fish List crab lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) and two Metro listings of species-qualified mixed king-crab legs and claws are recorded as boundary evidence, not as generic terms or measures.

Section P remains open for other seafood identities and preparations.
