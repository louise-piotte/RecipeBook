# WP04 Section P: mahi-mahi / coryphène identity integration

Integrated on 2026-10-12 from the [market-identity review](../../proposals/wp04-section-p-mahi-mahi-coryphene-market-identity-review-20261012.md).

## Catalog change

Added `ingredient-ref-mahi-mahi` as `mahi-mahi / coryphène`, category `PROTEIN`, with English alias `dolphinfish` only. The row follows the group-level *Coryphaena* market identity described by OQLF; it does not claim a single species. CFIA's common-name entry is for *C. hippurus* and remains scoped to that species in the research ledger. Do not add bare `dolphin`, `dorado`, `pompano dolphin`, `dauphin`, or `dorade tropicale` as aliases.

The complete recipe corpus has no mahi-mahi or coryphène demand. Metro's published recipe calls for 680 g fresh mahi-mahi fillets for four portions; that amount remains a source-specific `portion_weight` observation only. No form, active serving measure, density, unit mapping, recipe link, conversion, yield, or substitution rule was added.

## Evidence

- [OQLF, coryphène](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198955/coryphene) supports the Québec French display, the English `mahi-mahi` and `dolphinfish` terms, and a market group that includes *C. hippurus* and *C. equisetis*.
- [CFIA's Fish List mahi-mahi result](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Mahi-mahi) gives *C. hippurus*-specific English/French common names. [CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) informs the limited use of that regulatory entry.
- [Metro's Québec exotic-fish guide](https://www.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/poissons-exotiques-decouvrir) and [fish-cooking guidance](https://api.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/cuisinez-mer-tout-simplement) provide local consumer-market context. [Metro's dijonnaise recipe](https://www.metro.ca/recettes-et-occasions/recettes/filet-de-mahi-mahi-a-la-dijonnaise) is the source for 680 g/four portions.
- [SeaCore's mahi-mahi listing](https://www.seacoreseafood.com/product/Mahi_Mahi) and a current [Québec fishmonger listing](https://www.poissonneriegranada.ca/poissons-et-fruits-de-mer) corroborate the market name; the latter lists the fish without supplying a binomial.

## Validation

The complete bundle has 114 recipes and 1,123 ingredient rows; none contains the candidate terms. The accepted English and French names each have one exact active owner. The package validator, reference normalization check, generated-index check, and research-ledger validation passed at 1,284 references, 97 forms, and 1,591 ledger records; the ledger has 5,679 source entries and 4,710 distinct source IDs. JSON files are UTF-8 without BOM and contain only ASCII bytes through escaped Unicode where needed. No app tests or emulator checks were run because this change only adds database JSON data.
