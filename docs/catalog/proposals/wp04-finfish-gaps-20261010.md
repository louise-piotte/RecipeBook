# WP04 Section P — finfish gaps review

- **Packet type:** proposal-only identity and search-boundary review.
- **Review date:** 2026-10-10.
- **Disposition:** advance three species-scoped, identity-only candidates: American plaice, channel catfish, and Pacific halibut. Keep generic sole/flounder, bass/bream, snapper/grouper, tilapia/catfish/carp, sardine, and anchovy names unresolved. Add no aliases, forms, measurements, conversions, yields, substitutions, or recipe links.
- **Worktree changes:** this proposal only. No seed data, ledger, legacy candidates, tests, plan, roadmap, code, or existing proposal is changed.

## Scope and prior work

This bounded review continues Section P after the already integrated Atlantic cod, haddock, Atlantic halibut, Arctic char, American eel, rainbow trout, white hake, Atlantic herring, Alaska pollock, Atlantic/Pacific mackerel, spotted Spanish mackerel, salmon fillets, tuna, salt cod, stockfish, and dried bonito identities. It does not reopen those rows. Earlier Section P packets already identified the sole/flounder/turbot naming problem and the Greenland-halibut versus European-turbot boundary; this packet reuses those conclusions and narrows the new review to still-open species labels and Québec picker behavior.

The three proposed additions are species-scoped catalog identities. Their names do not imply a cut, preservation state, edible yield, culinary interchangeability, or common recipe measurement.

## Refreshed inventory and audit

The following snapshot was read immediately before drafting. File hashes are SHA-256 over exact bytes. The recipe-corpus digest walks `manifest.v1.json` in its stored `recipeFiles` order and hashes each relative path, a NUL byte, the recipe file's exact bytes, and a NUL byte.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 654 references | `7ea212dc45e6c03d47826ac3bbd44e87171492e26aeef1d71e341836109ace3f` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| `docs/catalog/research-ledger.v1.json` | 838 records; 1,430 source entries / 1,197 distinct source IDs | `3fb50a7a1b31678ea02d67d861e92a001e63152e79d473a55a32b188ea9df063` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The collision audit follows `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, replace non-ASCII-alphanumeric runs with spaces, then trim and collapse whitespace. Proposed full display names were checked against every active reference name/alias, every form label/match term, and every legacy candidate name/alias. The three proposed IDs are absent from active references, legacy candidate IDs, and ledger record IDs. The proposal-local source prefix `WP04-FINFISH-GAPS-20261010-S` is absent from the current ledger and existing catalog research documents.

All 114 manifest-listed recipe files and all 1,123 `ingredients[]` rows were searched using ingredient name, source text, reference ID, and all parsed recipe strings with normalized whole-word-phrase matching. There were zero hits for the three proposed name pairs or scientific names, and zero hits for the reviewed sole/flounder, bass/bream, snapper/grouper, tilapia/catfish/carp, sardine, and anchovy terms. The current adjacent finfish rows remain recipe 077 row 10 (salmon fillets) and recipe 111 row 1 (tuna); recipes 093 row 6 and 095 row 5 contain fish sauce, a condiment. None supports a new recipe link or form.

### Picker search behavior to account for

The app matches a query as a complete word phrase anywhere inside a display name or alias before using substring fallback. A simulation with the three proposed rows found:

- `American plaice` and `plie canadienne` each retrieve the proposed American plaice row alone; the shorter query `plie` also retrieves it because it is a word in the French display.
- `channel catfish` and `barbue de rivière` each retrieve the proposed channel catfish row alone; `catfish` also retrieves it because it is a word in the English display.
- `Pacific halibut` and `flétan du Pacifique` each retrieve the proposed Pacific row alone. The shorter queries `halibut` and `flétan` retrieve both Atlantic and Pacific halibut, exposing the species distinction in the results.
- A hypothetical `common sole` / `sole commune` row would be the only result for a bare `sole` query at this snapshot. Because OQLF documents that Québec products sold as “sole” often include several other flatfish, that picker result would give a bare query a misleadingly narrow answer. This packet therefore does not propose that row or a `sole` alias.

Exact normalized candidate phrases have no current active-reference, form, legacy-candidate, or recipe collision. The broad one-word searches above are search behavior, not evidence that the species share an identity.

## Proposed identity-only candidates

| Candidate ID | Category | English display | fr-CA display | Additional aliases | Species scope |
|---|---|---|---|---|---|
| `ingredient-ref-american-plaice` | `PROTEIN` | **American plaice** | **plie canadienne** | None. | *Hippoglossoides platessoides*. Use the OQLF-normalized Québec name, not the broad market word *sole*. |
| `ingredient-ref-channel-catfish` | `PROTEIN` | **channel catfish** | **barbue de rivière** | None. | *Ictalurus punctatus*. Use the OQLF-preferred Québec display and keep other catfish species distinct. |
| `ingredient-ref-pacific-halibut` | `PROTEIN` | **Pacific halibut** | **flétan du Pacifique** | None. | *Hippoglossus stenolepis*. Keep separate from active Atlantic halibut. |

### Name and alias boundaries

- **American plaice:** OQLF pairs *American plaice* with *plie canadienne* and *Hippoglossoides platessoides*. It also documents `plie du Canada` as Québec/Canada wording and `Canadian plaice` as a Canadian English term. The CFIA list includes `American Plaice / Plie` and `Canadian Plaice / Plie Canadienne` for the same taxon. Use the normalized OQLF display pair only in this proposal; do not add bare `plaice`, `plie`, `flounder`, or `sole` as aliases. OQLF marks `sole` as discouraged for American plaice because that market name can confuse it with common sole.
- **Channel catfish:** OQLF directly pairs *channel catfish* with *barbue de rivière* and *Ictalurus punctatus*, says the French species name is normalized, and rejects the less precise `barbue d’Amérique`. The Québec government species profile corroborates that bilingual pair and species. The CFIA Fish List has a naming inconsistency for this taxon: it lists `Channel Catfish / Poisson Chat` and separately `Catfish / Barbue De Rivière`; `Catfish` is also used for many unrelated species. Follow OQLF for the fr-CA catalog display, but add neither `catfish` nor `poisson chat` as an alias. The proposed localized display does not claim to replace the CFIA labeling name for commercial product labels.
- **Pacific halibut:** DFO's English and French species profiles directly pair *Pacific halibut* with *flétan du Pacifique* and *Hippoglossus stenolepis*. CFIA lists Pacific and Atlantic halibut under the short English name `Halibut`, and gives `Flétan du Pacifique` for the Pacific species. Keep the short terms out of aliases: both will naturally retrieve the two species-qualified rows after integration because they already occur in the displays.

No candidate receives density, unit mappings, form links, package values, portion defaults, yields, conversions, or substitutions. No recipe line is changed.

## Held names and Québec display limits

| Open name | Disposition for this pass | Evidence and boundary |
|---|---|---|
| Generic sole / flounder | Hold. The only candidate names researched closely are the species-qualified common sole and American plaice; only American plaice is advanced. | OQLF says Québec seafood may be sold as `sole` even when it is plie grise, plie rouge, plie canadienne, or limande à queue jaune. CFIA also assigns `Sole` and `Flounder` to many species. Do not alias these market/family words across species. |
| Turbot | Hold as a generic row or alias. | Reuse the earlier WP04 finding: Québec fish-trade `turbot` can denote Greenland halibut, while OQLF distinguishes European turbot (*Scophthalmus maximus*) and did not retain the Greenland-halibut trade name as a fish-product name. Any later row must be species-qualified. |
| Sea bass / sea bream | Hold generic names. | CFIA lists multiple taxa under `Sea Bass` / related names and `Bream`; for example, European sea bass (*Dicentrarchus labrax*) is `Sea Bass / Bar Commun`, black sea bass is *Centropristis striata*, while `Common Bream / Brème Commune` is *Abramis brama*. These are possible future species candidates, not generic aliases. |
| Snapper / grouper | Hold generic names. | The CFIA list assigns `Snapper` and `Grouper` to numerous species and sometimes uses those terms alongside species-specific labels. No recipe line selects a taxon. A future proposal should start from a named species and a Québec display, not from a family or market category. |
| Tilapia | Hold generic identity and aliases. | CFIA lists `Nile Tilapia`, `Mozambique Tilapia`, and several species with only the common English or French `Tilapia` name. Do not map an unqualified recipe line to *Oreochromis niloticus* or any other one species. A named future row needs a bilingual species-qualified display and must omit generic `tilapia` aliases. |
| Catfish | Keep generic term unresolved; advance only channel catfish. | CFIA uses `Catfish` across unrelated taxa, and its French labeling for *Ictalurus punctatus* does not align cleanly with the OQLF Québec-normalized display. Do not treat the proposed channel-specific display as a family-wide alias. |
| Carp | Hold generic identity and aliases. | OQLF maps Québec fish-market `carpe` to *Cyprinus carpio*, but CFIA also uses French `Carpe` for other taxa such as mrigal/catla and mud carp. A later common-carp row needs species-qualified names and no bare carp/carpe alias. |
| Sardine | Hold generic identity and aliases. | CFIA applies `Sardine` to multiple clupeid species and also lists *Clupea harengus* as `Canadian Sardine`; it applies `Sardine` to *Engraulis anchoita* as well. This does not make sardines aliases for active Atlantic herring or anchovy. |
| Anchovy / anchois | Hold generic identity and aliases. | CFIA applies `Anchovy / Anchois` to multiple species, including *Anchoa*, *Engraulis*, and other genera, and lists regional species-specific names. No single species is selected by the recipe corpus. |

The list is not exhaustive. Regional fish names can be reviewed later when a species-specific Canadian or Québec display is supported.

## Sources

Online sources were accessed 2026-10-10. These source IDs are proposal-local only; they are not ledger entries.

| Source ID | Source and link | Support and limit |
|---|---|---|
| WP04-FINFISH-GAPS-20261010-S01 | OQLF GDT, [plie canadienne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198638/plie-canadienne) | Direct English/French/Latin match, Québec/Canada variants, and warning that Canadian sale as `sole` can conflate American plaice with common sole. Naming evidence only. |
| WP04-FINFISH-GAPS-20261010-S02 | CFIA Fish List, [American plaice query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=American%20Plaice) | Lists *Hippoglossoides platessoides* as American Plaice / Plie and Canadian Plaice / Plie Canadienne. Canadian labeling terminology; the OQLF display is preferred for this Québec-facing catalog. |
| WP04-FINFISH-GAPS-20261010-S03 | OQLF GDT, [barbue de rivière](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198686/barbue-de-riviere) | Directly pairs channel catfish, normalized Québec French, and *Ictalurus punctatus*; distinguishes it from European `barbue`. |
| WP04-FINFISH-GAPS-20261010-S04 | Gouvernement du Québec, [Barbue de rivière](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/barbue-riviere) | Confirms the French and English names and *I. punctatus* for a Québec species. Biological profile, not a culinary form or recipe source. |
| WP04-FINFISH-GAPS-20261010-S05 | CFIA Fish List, [channel catfish query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Channel%20Catfish) | Fish List naming evidence for *I. punctatus* and neighboring catfish entries; the alternate French labels demonstrate why broad `catfish` aliases are withheld. Fish List last modified 2023-09-18. |
| WP04-FINFISH-GAPS-20261010-S06 | Fisheries and Oceans Canada, [Pacific Halibut](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-halibut-fletan-pac-eng.html) | English species name and *Hippoglossus stenolepis*; biological/fishery profile, not a recipe or edible-yield source. |
| WP04-FINFISH-GAPS-20261010-S07 | Pêches et Océans Canada, [Flétan du Pacifique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-halibut-fletan-pac-fra.html) | Québec-facing French name and same species. The page describes the Canadian Pacific fishery; it does not support a form or substitute. |
| WP04-FINFISH-GAPS-20261010-S08 | CFIA Fish List, [halibut query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Halibut) | Lists Atlantic and Pacific halibut as distinct taxa and shows how short `Halibut` can span both. Fish List last modified 2023-09-18. |
| WP04-FINFISH-GAPS-20261010-S09 | OQLF GDT, [sole commune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198945/sole-commune) | Directly pairs common sole, sole commune, and *Solea solea*; explicitly notes the wider Québec market use of `sole` for other flatfish. Basis for holding a bare-sole result/alias. |
| WP04-FINFISH-GAPS-20261010-S10 | CFIA Fish List, [sole query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sole) | Shows numerous species with Sole/Flounder names, including *H. platessoides*, *Glyptocephalus* spp., *Microstomus pacificus*, and *Solea solea*. Fish List last modified 2023-09-18. |
| WP04-FINFISH-GAPS-20261010-S11 | CFIA Fish List, [current fish-name list](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [search page](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpsel.asp?cbShowAll=on&cmbIn=e) | Canadian English/French accepted names and taxa. Queried for bass/bream, snapper/grouper, tilapia, carp, sardine, and anchovy; results show several species sharing each generic market name, including sardine/anchovy cross-use. The list is for fish labeling, not a recipe equivalence standard. |
| WP04-FINFISH-GAPS-20261010-S12 | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains that CFIA Fish List common names are the accepted English/French names for labeling listed species and are supported by scientific references. Labeling guidance only. |
| WP04-FINFISH-GAPS-20261010-S13 | OQLF GDT, [carpe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198858/carpe) | Maps Québec fish-market `carpe` to *Cyprinus carpio* and discusses names not retained in Québec fish-product marketing; it does not erase the additional CFIA uses of `Carpe` for other taxa. |
| WP04-FINFISH-GAPS-20261010-S14 | OQLF GDT, [plie grise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198644/plie-grise), [plie rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198643/plie-rouge), and [limande à queue jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198645/limande-a-queue-jaune) | Species-specific Québec terms and additional examples of flatfish sometimes sold as `sole`; those English/French names should not be merged into one ingredient identity. |

## Remaining work

This packet advances three identity-only species candidates and leaves the broad market/family terms open. It does not complete the Section P finfish checklist. Any integration should preserve the scoped displays, omit aliases, retain the documented picker behavior, and leave recipes untouched unless a future exact species request appears.
