# WP04 Section P R101 — Atlantic bluefin picker-boundary hold

- **Date:** 2026-10-14
- **Decision:** Keep *Thunnus thynnus* outside active references and the research ledger for now.
- **Review:** [Picker-boundary proposal](../../proposals/wp04-section-p-atlantic-bluefin-tuna-picker-boundary-hold-r101-20261014.md)

## Decision and boundary

An Atlantic-only row would make broad `bluefin` and `thon rouge` searches return one taxon even though CFIA's Fish List assigns those names to both *T. thynnus* and *T. orientalis*. Current Québec trade evidence also includes a wholesaler's farmed *T. orientalis* under `Bluefin`. Keep the generic `tuna / thon` reference and recipe 111 link unchanged; do not infer a species from `1 tuna steak`.

Revisit this candidate after a paired Pacific-bluefin review or picker behavior can keep the shared terms visibly unresolved. Add no species row, alias, form, measure, conversion, yield, recipe link, or substitution now.

## Evidence and recipe scope

- The CFIA [Fish List tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna) shows `Bluefin Tuna` and `Thon Rouge` across the two taxa, with qualified English and French names as well.
- OQLF's [thon rouge entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge) identifies the edible fish and preferred Québec term but uses older subspecies nomenclature. The later-modified CFIA list distinguishes *T. orientalis* as its own taxon.
- DFO has separate [English](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-eng.html) and [French](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-fra.html) species profiles for Atlantic bluefin. The Québec wholesaler JANS lists a farmed [Bluefin](https://www.jansseafood.ca/) product as *T. orientalis*; this is market evidence, not a taxonomic naming authority.
- The recipe corpus contains 114 recipes and 1,123 ingredient rows. Its only tuna line is recipe 111's unqualified `1 tuna steak`, which stays linked to generic tuna.

## Picker projection

| Query | Current | With one Atlantic row | Why held |
|---|---|---|---|
| `Atlantic bluefin tuna` | 0 | 1 | Qualified search would be precise. |
| `bluefin tuna` / `bluefin` | 0 | 1 | Singleton would hide the shared CFIA name for *T. orientalis*. |
| `thon rouge` | 0 | 1 | Singleton would hide the CFIA *T. orientalis* row. |
| `tuna` / `thon` | Generic tuna / thon | Generic plus Atlantic bluefin | Generic recipe phrase would become multi-result without resolving the broad-name collision. |

This documentation-only hold changed no catalog or ledger data and needed no tests or emulator checks.
