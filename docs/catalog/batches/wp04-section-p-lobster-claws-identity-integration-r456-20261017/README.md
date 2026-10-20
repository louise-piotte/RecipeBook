# WP04 Section P R456 — lobster claws integration

- **Integrated:** 2026-10-17.
- **Proposal:** [R456 lobster-claws product-boundary review](../../proposals/wp04-section-p-lobster-claws-product-boundary-review-r456-20261017.md).
- **Decision:** Add identity-only `lobster claws / pinces de homard` as `ingredient-ref-lobster-claws` in `PROTEIN`.

## Identity and evidence boundary

Québec product sources use the plural name `pinces de homard`; MAPAQ lists claws and segments separately from lobster meat and tails. The English and French row remains species-neutral because several product listings do not identify a scientific species. It represents edible intact claw-cut products, distinct from whole lobster, tails, picked claw/knuckle meat, crab claws, and imitation claw products.

- [OQLF — `pince` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199041/pince) defines a marketable crustacean anatomical part and lists lobster and crabs among the species in scope. OQLF’s separate [medical `pince de homard` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17055918/pince-de-homard) is not seafood naming evidence.
- [La Pantrée — seafood inventory](https://www.lapantree.ca/fr/la-viande/poisson-fruits-de-mer/) lists `Pinces de homard` separately from lobster meat and tails.
- [Metro Québec — cooked frozen lobster claw](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/pince-de-homard-cuit-surgele/p/226189), product 226189, gives a product-specific example using singular French seller wording; the localized page redirects to English and reports an average 300 g SKU.
- [MAPAQ — Les crustacés du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf) separates shell-on claws/segments from meat presentations under American lobster. These commercial grades and formats are not recipe measures or yields.
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) pairs *Homarus americanus* with American Lobster / Homard Américain and Lobster / Homard. This supports context only; the new row does not infer species for an unspecified product.
- [Rock Harbour — Lobster Claws & Arms](https://www.rockharbourseafood.ca/products/lobster) lists a cooked, scored claws-and-arms product; it does not establish a claw-only measure.
- [La Mer — Lobster Meat (CK) Frozen](https://www.lamer.ca/en/products/chair-de-homard-ck-congelee) describes shelled claw-and-knuckle meat, supporting its exclusion from the intact-claw row.

The reference has no aliases, forms, measurements, density, unit mappings, conversions, recipe links, package yields, or substitutions. The bundle has no matching recipe demand.

## Picker effect

The exact plural queries `lobster claws` and `pinces de homard` now return the new row; English singular `lobster claw` also matches through the picker’s substring fallback. Broad `lobster` and `homard` results add the cut row while keeping both lobster species visible. Broad `claw(s)` and `pince(s)` return crab claws and lobster claws together.

The singular French phrase `pince de homard` remains unindexed. Adding it as an alias would make the single-word `pince` query prefer the lobster row alone and suppress the existing crab-claws result. The plural canonical term does not match the singular compound under current picker rules, so `pince de homard` itself returns no row. This tradeoff is documented for future picker review.

## Data and verification

The integration added one reference and one accepted ledger record with five R456 sources; existing CFIA and MAPAQ source IDs were reused for their existing URLs. The bundle contains 1,744 references, 141 forms, 2,103 ledger records, 9,575 source entries, 8,122 distinct source IDs, and 6,835 distinct URLs. The manifest contains 114 recipe files and 1,123 ingredient rows; a full scan found no lobster-claw mention.

Bundled-package normalization and validation, generated-index freshness, ledger JSON Schema validation, exact-name and ID ownership checks, source-ID URL consistency, picker projection, recipe scan, UTF-8/no-BOM verification, and scoped whitespace checks passed. No software tests were run because this change only adds database JSON data under the `AGENTS.md` rule.
