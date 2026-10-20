# WP04 Section P R517 integration — Dungeness crab sections

- **Date:** 2026-10-17
- **Catalog ID:** `ingredient-ref-dungeness-crab-sections`
- **Identity:** `Dungeness crab cluster / section de crabe dormeur`, category `PROTEIN`.
- **Aliases:** English `Dungeness crab section`, `Dungeness crab clusters`, and `Dungeness crab sections`; French `sections de crabe dormeur`.
- **Boundary:** Costco's species-qualified cluster/section product title, kept separate from the Dungeness species row, snow-crab sections, loose crab legs, picked meat, claws, and other crab products.
- **Behavior:** no forms, density, mappings, measures, conversions, yields, recipe links, or substitutions.

## Evidence and picker boundary

Costco Business Centre currently lists item 2732946 as “Olivia Dungeness Crab Clusters” in English and “Olivia - Sections de Crabe Dormeur” in French, both at 4.54 kg. The views identify the same SKU and are not independent products. Direct retrieval of the pages returned cache misses in this review; the current indexed page content supplies the product titles and details. The anomalous SKU text “7–10 clusters per ounce” was not normalized or retained as reusable behavior. The pages do not state a scientific name, ingredient panel, or cooking state.

OQLF pairs Québec French `crabe dormeur` with English `Dungeness crab`, while the current DFO profile names *Metacarcinus magister*. These sources support the naming boundary only; the Costco listing does not itself state the binomial. Costco Canada's French consumer article describes a cluster as several legs attached to part of the body, but does not establish the current SKU's exact assembly or cooking state.

The new exact product queries each return one result. `Dungeness crab`, `crabe dormeur`, and `dormeur` now return the existing species row and the new product row. Broad `cluster(s)` and `section(s)` searches remain multi-result with snow-crab sections; broad `crab/crabe` searches increase from 11 to 12. Existing `snow crab cluster`, `sections de crabe des neiges`, and `crab legs` results are unchanged.

Sources: [Costco English product listing](https://www.costcobusinesscentre.ca/p/-/Olivia-Dungeness-Crab-Clusters%2C-4.54-kg/4201007193?langId=-24); [Costco French product listing](https://www.costcobusinesscentre.ca/p/-/Olivia-Dungeness-Crab-Clusters%2C-4.54-kg/4201007193?langId=-25); [OQLF — crabe dormeur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198911/crabe-dormeur); [DFO — Crabe dormeur](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/dungeness-crab-crabe-dormeur-fra.html); [Costco Canada — Crabes dormeurs](https://www.costco.ca/f/-/connection-fyt-dungeness-crabs-june-2023?langId=-25).

## Recipe corpus and static checks

The full manifest scan found zero Dungeness cluster/section mentions in 114 recipe files or 1,123 ingredient rows. The unchanged manifest-ordered fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

The bundled seed package normalized without additional changes and validated successfully. The generated Kotlin index is current with 1,792 references. After the R516/R517 integrations and existing R518 entry, the catalog contains 143 forms and 56 legacy candidates; the ledger has 2,149 records, 9,863 source entries, 8,347 distinct source IDs, and 7,057 distinct URLs, with no source ID mapped to multiple URLs. R517 reuses three OQLF/DFO/Costco article source IDs already owned by `ingredient-ref-dungeness-crab`; its two new Costco URL mappings each map to one new source ID.

No software tests, build, emulator check, or deployment were run because this change adds database JSON data under `AGENTS.md`. See the [R517 proposal](../../proposals/wp04-section-p-next-seafood-review-r517-20261017.md). Section P remains open.
