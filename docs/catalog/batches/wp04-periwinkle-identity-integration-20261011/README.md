# WP04 Section P — common periwinkle identity

Added one identity-only ingredient reference for *Littorina littorea*: `common periwinkle / bigorneau`. The French display follows OQLF's Québec-normalized term for the edible mollusc; DFO independently identifies the species. The row has no aliases, density, unit mappings, forms, or recipe links.

## Naming boundary

CFIA's Fish List associates `Periwinkle / Bigorneau` with the genus *Littorina*, not just *L. littorea*. A current Québec processor also markets *Buccinum undatum* as `bigorneau`. The catalog row therefore represents the cited species and must not receive an unqualified recipe or product phrase without species evidence. No generic periwinkle or whelk identity was created. No recipe line in the 114-recipe / 1,123-row bundle names periwinkle, bigorneau, winkle, or *Littorina*.

Sources recorded in the evidence ledger:

- [OQLF, bigorneau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198886/bigorneau): Québec terminology, English equivalent, and *Littorina littorea* mapping.
- [Fisheries and Oceans Canada, Bigorneau](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/periwinkle-bigorneau-fra.html): taxonomy and range.
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names): genus-level Canadian product-label naming boundary.
- [MAPAQ, Québec fish and seafood glossary](https://www.mapaq.gouv.qc.ca/fr/Publications/repertoireFRfinal-b.pdf): older Québec commercial-name corroboration.
- [Frandon Seafoods](https://frandon.ca/produits/) and [Seafood Depot, Winkles](https://www.seafooddepot.ca/product-winkles): current market wording without species-specific package evidence.
- [Les Fruits de Mer Madeleine, Buccins crus, congelés](https://www.fruitsdemermadeleine.com/nos-produits/nos-buccins/buccins-crus-congeles): current Québec listing of *B. undatum* also called `bigorneau`.

No measures, conversions, yields, substitutions, or recipe links were added. The CFIA marine-toxin flag is recorded only as source context, not as a preparation or safety rule.

## Validation

- Bundled package check and validation passed.
- Ingredient-reference normalization and generated-index freshness checks passed.
- Research-ledger schema validation passed with 1,318 records and zero errors.
- Changed data is UTF-8 without BOM; targeted diff checks passed.
- No tests or emulator run were needed because the change only adds database JSON data under `AGENTS.md`.

## Package state

- 1,029 ingredient references, 71 forms, 114 recipes, and 1,123 ingredient rows.
- 1,318 ledger records, 4,278 source entries, and 3,514 distinct source IDs.
- Reference JSON SHA-256: `f089a129d865d334659a2b77b65a9ca0bcc9efe415aedaff11b55be3552377b7`.
- Form JSON SHA-256: `1db31d8f54262555a18e15173f2a69b0d164cad5d53bf14fad86dac390c7989a`.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger SHA-256: `8624ec09e42626acb7de8457a0b453057e45333cf471a4ae0dcade4c16687605`.
- Generated catalog SHA-256: `c27786259fc1a14b52d6305c2fc94762c868569d8e55447f45da8a6c48312f7c`.

Section P and the broader catalog plan remain open.
