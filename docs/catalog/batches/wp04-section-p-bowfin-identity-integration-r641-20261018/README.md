# WP04 Section P R641 — Bowfin identity

Integrated on 2026-10-18 after root review of the [R641 proposal](../../proposals/wp04-section-p-next-regional-fish-gap-review-r641-20261018.md).

## Catalog decision

- Added identity-only `Bowfin / poisson-castor` for *Amia calva* as `ingredient-ref-bowfin` in `PROTEIN`.
- Added `Bow Fin` as the only English alias. The CFIA Fish List and OQLF tie that spelling and the preferred Québec fish-product term to *A. calva*.
- Kept `Dogfish`, `Mudfish`, `grinnel`, `amie chauve`, `amie`, `poisson des marais`, and the scientific name out of picker aliases. OQLF explicitly excludes the latter French names from Québec consumer fish-product labelling.
- The BAPE-archived report's 2008 Saint-Laurent catch table lists 1.7 metric tonnes for the species. This is historical context only, not evidence of current catch or retail supply.
- No recipe demand, form, measurement, density, unit mapping, conversion, yield, recipe link, or substitution was added. Measurement and substitution research remain open.

## Sources and validation

- [CFIA Fish List query](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Bow%20Fin) pairs TSN 161104, *Amia calva*, and `Bow Fin / Poisson-castor`.
- [OQLF, poisson-castor](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199117/poisson-castor) gives the preferred Québec fish-product term, `bowfin`, and *Amia calva*.
- [BAPE-archived technical report](https://archives.bape.gouv.qc.ca/sections/mandats/oleoduc_energie-est/documents/PR8.5.6.1.1.pdf), table 3-1, records historical 2008 Saint-Laurent landings.
- Static package normalization, generated-index freshness, ledger schema/source ownership, picker projection, and recipe-corpus checks passed. The final snapshot has 1,832 references, 161 forms, 2,203 ledger records, and 114 recipes / 1,123 ingredient rows.
- No software tests, build, emulator run, or deployment were needed for this database-JSON-only change under `AGENTS.md`.

Section P remains open.
