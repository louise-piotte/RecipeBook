# WP04 Section P lumpfish / lompe whole-fish hold — 2026-10-12

- **Status:** Reconciled; whole-fish candidate remains unallocated.
- **Source proposal:** [`wp04-section-p-lumpfish-lompe-identity-review-20261012.md`](../../proposals/wp04-section-p-lumpfish-lompe-identity-review-20261012.md).
- **Decision:** Keep a prospective whole-fish identity for *Cyclopterus lumpus* on hold. Add no reference, ledger record, alias, form, numeric value, recipe link, or substitution.

## Evidence and boundary

OQLF gives `lompe` as the normalized Québec term, English `lumpfish`, and the taxon *Cyclopterus lumpus*. CFIA's Fish List uses the bilingual pair `Lumpfish / Lompe`; the MAPAQ seafood directory likewise names the species and documents `œufs de lompe saumurés` and `caviar de lompe`. These sources establish the fish and naming, while the Québec product evidence is roe or caviar rather than whole-fish flesh. [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198845/lompe) · [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) · [MAPAQ seafood directory (searchable copy)](https://cdi.merici.ca/mapaq_quebec/repertoire-poissons-fruits-mer-quebec.pdf)

DFO's 2024 assessment states that roe is the landed product and the carcass has little commercial value and is generally discarded; the 2024 inshore table lists `Roe, lumpfish`. Fisheries statistics about roe-to-round-weight estimation are not recipe conversions. An older DFO factsheet reports some local flesh consumption historically, which does not establish current Québec whole-fish supply. [DFO 2024 assessment](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41230097.pdf) · [DFO 2024 landings](https://inter-w02.dfo-mpo.gc.ca/publications/reports_rapports/Land_Inshore_Debarquer_cotiere_2024_eng.htm) · [DFO factsheet](https://waves-vagues.dfo-mpo.gc.ca/Library/4062691x.pdf)

The full 114-recipe / 1,123-row scan found no lumpfish, lompe, roe, or caviar demand. A display-only `lumpfish / lompe` projection would return the species for those exact terms, while broad `fish` and `poisson` searches retain their current multiple results. Keep `lump fish`, roe, and caviar out of any future whole-fish aliases; recipe 019's `jumbo lump crab meat` is a crab grade and remains unrelated.

No food measure, density, edible yield, conversion, or substitution is established. Keep salted roe and caviar as possible separate product identities if future recipe demand appears; they are not forms or equivalents of whole lumpfish.

## Validation

This reconciliation changed plan and review documentation only. No app tests or emulator checks were run; no database JSON or application code was changed. Scoped `git diff --check`, UTF-8/no-BOM and local-link checks passed.
