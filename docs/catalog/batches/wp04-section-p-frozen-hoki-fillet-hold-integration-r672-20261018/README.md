# WP04 Section P R672 — frozen Hoki fillet form hold

Reviewed and held on 2026-10-18. The existing Hoki reference correctly represents *Macruronus novaezelandiae* as identity-only. Canadian seafood suppliers list frozen Hoki fillets, but the reviewed evidence does not establish a current Québec retail listing or stocked Québec SKU. This hold leaves the existing identity and ledger unchanged.

The [Seafood Depot product page](https://www.seafooddepot.ca/product-hoki) identifies the species and says it is available as fillet, frozen, wild, and product of New Zealand. The [Cityfish frozen catalogue](https://www.cityfish.ca/seafood-frozen) lists `Hoki Fillet “New Zealand” (Fz) (15 lb)`; its business address is in Calgary. The [Sogelco profile](https://groupexport.ca/repertoire-des-membres/sogelco-international-inc/) includes Hoki in the Montréal-area company's portfolio but lists current export markets outside Canada. These sources support a Canadian supply-channel product, not present Québec stock. They do not establish Canadian harvest.

## Picker and demand boundary

The phrase-first search projection was checked against the current references and forms and a hypothetical form labeled `frozen hoki fillet / filet de hoki surgelé`:

- Generic English `fillet` currently returns seven references, whose labels use plural `fillets`. The proposed singular word phrase would become an exact phrase-first match and return only Hoki.
- French `filet` currently returns two references and would return three with the proposed Hoki term, so it remains multi-result.
- Exact `frozen hoki fillet` and `filet de hoki surgelé` queries would return Hoki with a form hint.
- `hake` remains two references.

The 114 bundled recipes and 1,123 ingredient rows contain no Hoki, *Macruronus novaezelandiae*, Blue Hake, New Zealand Hoki, New Zealand whiting, blue grenadier, whiptail, or grenadier bleu match. No recipe link or measure is supported.

The Cityfish 15 lb value is a wholesale line/package quantity, not a per-fillet amount. No kitchen measure, density, unit mapping, package yield, thawing/cooking yield, or edible-mass relationship was found. No source establishes a Hoki substitution. The proposal therefore adds no alias, form, ledger source, measurement, conversion, yield, recipe link, or substitution.

## Sources

- [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [species lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&q=Macruronus%20novaezelandiae): regulatory name boundary, not market availability.
- [OQLF GDT: hoki](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199120/hoki): Québec fish terminology; retained French edible-fish term is *hoki*.
- [TERMIUM Plus, *Macruronus novaezelandiae*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=ZEALAND) and [DFO *Lexique des espèces marines*](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/118315.pdf): terminology cross-checks.
- [New Zealand MPI Hoki fishery page](https://www.mpi.govt.nz/fishing-aquaculture/fisheries-management/fish-stock-status/hoki-new-zealands-largest-fishery): species and origin context only.

## Validation

Static source review, picker projection, manifest-corpus scan, local links, UTF-8/no-BOM, and scoped whitespace checks passed. No software tests were run because this documentation-only hold does not change database JSON or runtime code.
