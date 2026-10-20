# WP04 Section P R100 — Northern stone crab integration

- **Date:** 2026-10-14
- **Decision:** Add an identity-only `PROTEIN` reference for *Lithodes maja* as `Northern stone crab / crabe épineux`.
- **Review:** [Identity review proposal](../../proposals/wp04-section-p-northern-stone-crab-lithodes-identity-review-r100-20261014.md)

## Catalog change

Added `ingredient-ref-northern-stone-crab` with the French alias `crabe épineux du nord`. No English aliases, forms, density, unit mappings, measurements, conversions, recipe links, yields, or substitutions were added. The Latin taxon remains in the evidence record because the reference schema has no taxon field. Broad `king crab`, `deep-sea king crab`, and `crabe royal` terms remain unassigned.

The row is distinct from `stone crab / crabe caillou` for the CFIA *Menippe* market group. A `stone crab` search now returns both references. The update does not claim a current Québec retail product, directed fishery, harvest authorization, or species identity for the Metro stone-crab-claw listing.

## Evidence and limits

- Reused the [R99 stone-crab evidence](../wp04-section-p-stone-crab-menippe-identity-integration-20261014/README.md), including the CFIA Fish List and OQLF records, for the Canadian species/name boundary and preferred Québec French name. OQLF classifies the term under edible crustaceans, but its commercial-potential note dates to 1998.
- Added four R100 sources: [WoRMS](https://www.marinespecies.org/aphia.php?id=590139&p=taxdetails) for the accepted *Lithodes maja* spelling; DFO's [2023 Greenland-halibut assessment](https://publications.gc.ca/collections/collection_2023/mpo-dfo/fs70-6/Fs70-6-2023-022-fra.pdf) for bycatch occurrence figures; DFO's [1998 stock-status report](https://publications.gc.ca/collections/collection_2016/mpo-dfo/Fs76-1-C4-04-1998-fra.pdf) for historical industrial processing context; and Newfoundland and Labrador's [2000 exploratory-fishing project summary](https://www.gov.nl.ca/fisheries/files/research-development-fdp-pdf-fdp-84.pdf).
- The 2023 DFO figures concern bycatch in another directed fishery. The report's 26% shelling result is an industrial plant trial, not a home-preparation yield or active catalog value.
- The corpus contains 114 recipes and 1,123 ingredient rows. It has no *Lithodes*-specific demand. Recipe 019's jumbo-lump crab-meat line does not identify this species.

## Picker projection

The projection uses the current phrase-first reference search across names, aliases, and forms.

| Query | Before | After |
|---|---:|---:|
| `Northern stone crab` | 0 | 1 |
| `crabe épineux` | 0 | 1 |
| `crabe épineux du nord` | 0 | 1 |
| `stone crab` | 1 | 2 |
| `crab` / `crabe` | 6 each | 7 each |
| `king crab` / `deep-sea king crab` / `crabe royal` | 0 each | 0 each |

## Validation

Static package and ledger validation, catalog normalization, generated-index checks, picker projection, recipe corpus scan, source-ID checks, UTF-8/no-BOM checks, links, and whitespace checks passed. The catalog now has 1,441 references, 105 forms, and 1,781 research-ledger records. No app tests or emulator checks were run because this change only adds database JSON data and its generated catalog index.
