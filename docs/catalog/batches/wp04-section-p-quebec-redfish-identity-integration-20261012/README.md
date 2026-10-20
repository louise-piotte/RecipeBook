# WP04 Section P: Québec redfish / sébaste du Québec identity integration

Integrated on 2026-10-12 from the [market-group review](../../proposals/wp04-section-p-quebec-redfish-market-group-review-20261012.md).

## Catalog change

Added `ingredient-ref-quebec-redfish` as `Québec redfish / sébaste du Québec`, category `PROTEIN`, with empty alias lists. It represents a Québec commercial *Sebastes* market group, not one species. OQLF reports that Québec catches include *S. marinus*, *S. fasciatus*, and *S. mentella*; MAPAQ reports current landings under `SÉBASTE`; and a current Québec retailer uses `sébaste du Québec` for a Gaspésie fishery product. The English display pairs OQLF's `redfish` with the regional qualifier evidenced by the Québec market name.

Generic `redfish` and `sébaste` searches match the qualified display text, so no bare aliases were added. Keep Pacific Ocean Perch (*S. alutus*), Acadian redfish, and other species-specific identities separate. The 114-recipe / 1,123-row bundle has no matching fish request.

## Product and evidence limits

The research ledger records the 454 g frozen-fillet package and its approximate 3–4 portions only in the Québec retailer source note. These do not establish a standardized fillet mass or serving measure. A 175 g seasoned canned sébaste product is also source evidence for one composite product, not a general canned form. No form, active measure, density, mapping, recipe link, conversion, yield, or substitution rule was added.

CFIA's Fish List assigns redfish to multiple species and taxa, so a Canadian species-level label cannot be projected onto every Québec retail package. The English display is a localized catalog pairing, not a quoted Québec regulatory heading. The 2012 OQLF catch proportions and 2025 MAPAQ landing totals provide market-group context; neither identifies a specific fillet's species.

## Sources

- [OQLF, sébaste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) supplies the Québec edible-fish term, *Sebastes* sp. scope, English `redfish` term, and the distinct species in Québec catches.
- [MAPAQ's 2026 Québec seafood brochure](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/BR_brochure-poissons-fruits-mer-qc-int_MAPAQ.pdf) reports preliminary 2025 landings for sébaste and describes it as a Gulf of St. Lawrence fishery product.
- [DFO's 2026–2027 Unit 1 management plan](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-33-fra.html) and its [2025 commercial-fishery release](https://www.canada.ca/en/fisheries-oceans/news/2025/06/fisheries-and-oceans-canada-announces-details-for-second-year-of-commercial-redfish-fishery.html) support the current Gulf fishery context and keep *S. mentella* and *S. fasciatus* biologically distinct.
- [Réserve Locale's frozen Québec sébaste fillets](https://reservelocale.ca/products/sebaste-sauvage-du-quebec-454g) support the qualified regional product wording and record one source-specific package.
- [CFIA's redfish Fish List query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Redfish) shows the species-specific naming boundary across listed taxa.
- [Chasse-Marée's seasoned sébaste](https://chassemaree.ca/products/sebaste-a-laneth-et-moutarde) documents one prepared, canned product; it does not support a global form.

## Validation

The full bundle has 114 recipes and 1,123 ingredient rows; none contains the candidate terms. The accepted qualified displays have one exact active owner each, and no exact owner conflict was found in references, forms, or legacy candidates. The package validator, reference normalization check, generated-index check, and ledger validation passed at 1,285 references, 97 forms, and 1,592 ledger records; the ledger contains 5,686 source entries and 4,717 distinct source IDs. JSON files are UTF-8 without BOM and use escaped Unicode. No app tests or emulator checks were run because this change only adds database JSON data.
