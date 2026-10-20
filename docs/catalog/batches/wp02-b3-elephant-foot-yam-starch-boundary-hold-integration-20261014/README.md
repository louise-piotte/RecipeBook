# WP02 B3 elephant-foot-yam starch boundary hold — 2026-10-14

## Decision

Keep starch isolated from *Amorphophallus paeoniifolius* corms as a separate research-ledger
candidate. Do not activate it as a reference or form yet. *A. paeoniifolius* is an edible Araceae
tuber crop, distinct from *Dioscorea* yams and *A. konjac*, and primary research establishes an
extracted starch fraction. Reviewed Canadian and Québec-facing sources name the whole tuber or
frozen cut-corm product, not an isolated starch product.

The ordinary English name `elephant foot yam starch` would make the unresolved `yam starch` picker
query select this species-specific row alone. A French display built from `igname` would also broaden
a Québec term that OQLF defines for *Dioscorea*. No matching ingredient demand was found in the 114
bundled recipes / 1,123 ingredient rows.

Added only `candidate-elephant-foot-yam-starch` to the research ledger with `needs_clarification`,
`researched_no_supported_value`, and `not_yet_researched` states. The last state is intentional:
this review did not assess substitute candidates. No active reference, form, alias, measure, density,
mapping, conversion, yield, recipe link, or substitution rule was added. Existing `candidate-yam-starch`
and the yam, yam-flour, and konjac-flour references remain unchanged. Section 04 B3 stays open.

## Evidence

- [Kew Plants of the World Online — *Amorphophallus paeoniifolius*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:60444138-2/general-information) distinguishes elephant yam from *Dioscorea* yams and *A. konjac* and documents edible tubers.
- [ICAR-CCARI — Elephant foot yam](https://ccari.res.in/dss/elephantfootyam.html) identifies *A. paeoniifolius*, gives Suran and Zamikand as local names, and reports 18% starch in whole tubers.
- [Karmakar et al. — starch extraction study](https://doi.org/10.1016/j.ijbiomac.2023.124183) reports a maximum 51.76 g starch per 100 g dry corm under its laboratory extraction process; this is not a kitchen yield or measure.
- [Health Canada English NHPD listing](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/atReq?atid=antiox2&lang=eng&promo_code=INTLSHIP&wbdisable=true) and [French listing](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/atReq?atid=antiox2&lang=fre&promo_code=INTLSHIP&wbdisable=true) use `Elephant yam` / `Igname d'éléphant` for the species and root/tuber preparations, not starch product labels.
- [OQLF — *igname*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname) defines the Québec food term for tubers of *Dioscorea*.
- [Spice Divine — *Suran congelé*](https://spicedivine.ca/fr/products/vadilal-frozen-suran-312gm) lists frozen whole-corm pieces as `Suran` / `igname pied d'éléphant`.
- [Nagar et al. — packaging-film formulation](https://pmc.ncbi.nlm.nih.gov/articles/PMC7054476/) uses starch in a starch-hydrocolloid film experiment. The formula and finished-film properties do not support starch-powder measures or density.

The full ownership, picker, corpus, and numeric-boundary audit is in the [R117 proposal](../../proposals/wp02-next-b3-regional-starch-gap-review-20261014-r2.md).

## Validation

- Root independently checked the Kew, ICAR-CCARI, Health Canada, OQLF, Canadian retailer, and primary extraction-study evidence.
- No active reference, form, or legacy candidate was changed; the new unresolved record is ledger-only.
- No app tests or emulator checks were run because this change only adds JSON research data, under the updated `AGENTS.md` rule.
