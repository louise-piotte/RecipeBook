# WP04 Section P — pollock and mackerel species boundaries

- **Packet type:** proposal-only research and catalog/recipe audit.
- **Review date:** 2026-10-09.
- **Disposition:** advance four species-qualified, identity-only candidates: Alaska pollock, Atlantic mackerel, Pacific mackerel, and spotted Spanish mackerel. Hold Atlantic pollock pending a source-backed, unambiguous Québec French display; do not assign generic `pollock` / `goberge` or `mackerel` / `maquereau` names across the candidate species.
- **Worktree change:** this proposal only. No active seed data, ledger, plan, roadmap, code, tests, or other proposal is changed.

## Scope

This is a bounded continuation of WP04 Section P. The earlier finfish reviews left pollock and mackerel species naming unresolved. This review covers the two pollock taxa that appear under overlapping Canadian common names, the Atlantic and Pacific *Scomber* names directly relevant to the mackerel boundary, and the Spanish-mackerel name collision with a closely related *Scomberomorus* species. It does not expand the wider finfish checklist or revisit existing finfish rows.

All proposed rows are identity-only. The evidence establishes names and taxonomic scope; it does not establish edible forms, portions, yields, unit mappings, conversions, substitutions, recipe relinks, or cooking guidance.

## Refreshed inventory and reproducible recipe audit

The following exact-byte snapshot was read immediately before this proposal was written. The recipe corpus digest iterates the manifest's `recipeFiles` array in stored order and hashes each UTF-8 relative path, a NUL byte, the exact recipe file bytes, and a NUL byte.

| Artifact | Current count | SHA-256 of exact bytes |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 631 references | `8935fb3c03acc994f0127d59a2a44c580e93260db8367229c0d9cdb9975dbfe0` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| `docs/catalog/research-ledger.v1.json` | 801 records; 1,321 source entries / 1,119 distinct source IDs | `99448ddaf0ac44ef0b34130634eead1132e41a90ce0f69cada0f60e6a66cba2e` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned. The row audit checked each line's `ingredientName`, `originalText`, and `ingredientRefId`; the file audit checked the complete UTF-8 JSON text. Search terms covered `pollock` / `goberge`, `mackerel` / `maquereau`, their plural or qualified wording, and the candidate/common-name variants discussed below. **There were zero matching ingredient rows and zero matching recipe files.** No recipe links are proposed.

The proposed display names and IDs were checked against active reference names and aliases, active form labels and match terms, legacy candidate names and aliases, and ledger record IDs. The exact normalized display keys had no active or legacy owners. All four proposed IDs are absent from the active references, legacy candidates, and ledger records. The packet-local source-ID prefix `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S` was absent from the current ledger and existing catalog proposals before this file was created.

## Identity-only candidates

| Candidate ID | Category | English display | fr-CA display | Aliases | Species scope |
|---|---|---|---|---|---|
| `ingredient-ref-alaska-pollock` | `PROTEIN` | **Alaska pollock** | **goberge de l’Alaska** | None | *Gadus chalcogrammus* (older name used by OQLF: *Theragra chalcogramma*) [S01, S03–S05] |
| `ingredient-ref-atlantic-mackerel` | `PROTEIN` | **Atlantic mackerel** | **maquereau de l’Atlantique** | None | *Scomber scombrus* [S06–S09] |
| `ingredient-ref-pacific-mackerel` | `PROTEIN` | **Pacific mackerel** | **maquereau du Pacifique** | None | *Scomber japonicus* [S06, S10–S11] |
| `ingredient-ref-spotted-spanish-mackerel` | `PROTEIN` | **spotted Spanish mackerel** | **thazard tacheté** | None | *Scomberomorus maculatus* [S06, S11] |

No unqualified term is added as an alias. In particular, do not alias `pollock`, `goberge`, `mackerel`, `maquereau`, `Spanish mackerel`, `maquereau espagnol`, or `thazard` to these rows.

## Boundary decisions and explicit holds

- **Alaska pollock — advance.** CFIA ties Alaska, Alaskan, Pacific, and walleye pollock names to *Gadus chalcogrammus*; its listing also uses `Goberge d’Alaska` and, in one listing, the shorter `Goberge`. OQLF's preferred Québec term is `goberge de l’Alaska` and its older Latin name is *Theragra chalcogramma*. NOAA Fisheries confirms the current *Gadus chalcogrammus* name and NOAA's taxonomic note documents the change from *Theragra*. Use the species-qualified bilingual display pair only [S01, S03–S05].
- **Atlantic pollock — hold.** OQLF maps Québec `goberge` to *Pollachius virens* and includes English `Atlantic pollock`, but CFIA also uses `Goberge` for Alaska pollock. The inspected sources do not provide a standardized Québec French species-qualified display such as `goberge de l’Atlantique`. Do not create that term by analogy or place bare `goberge` on either species row. Resume only with a source-backed French label that separates the two fish in the catalog [S01–S03].
- **Generic pollock / goberge — hold.** CFIA attaches the English name `Pollock` to both *P. virens* and *G. chalcogrammus*; OQLF's unqualified `goberge` points to the former while CFIA also uses `Goberge` for the latter. These are not safe cross-species aliases [S01–S03].
- **Atlantic mackerel — advance as a qualified pair.** DFO uses `Atlantic Mackerel` / `maquereau de l’Atlantique` for *S. scombrus*. OQLF's general Québec `maquereau` entry is *Scomber* sp. and CFIA lists both a generic *Scomber* record and several mackerel-named species. Use DFO's species-qualified display pair and omit bare `mackerel` / `maquereau` [S06–S09].
- **Pacific mackerel — advance as a qualified pair.** CFIA lists *S. japonicus* as `Pacific Mackerel` / `Maquereau du Pacifique`. OQLF also has `maquereau espagnol` / `chub mackerel`, but its entry notes *S. colias* as another species name, while CFIA lists *S. colias* separately as Atlantic chub mackerel. Keep `maquereau espagnol`, `chub mackerel`, and bare `mackerel` out of aliases; use only the unambiguous Pacific-qualified CFIA pair [S06, S10–S11].
- **Spotted Spanish mackerel — advance as a qualified pair.** OQLF gives the Québec-preferred `thazard tacheté` for *S. maculatus* and lists English `spotted Spanish mackerel`. It does not retain `maquereau espagnol` as the Québec commercial name for this fish. The qualifier is essential: CFIA also returns `Spanish Mackerel` for other taxa. Do not use bare `Spanish mackerel` or `maquereau espagnol` as aliases [S06, S11].
- **Atlantic chub mackerel and king mackerel — hold.** CFIA lists *S. colias* as Atlantic chub mackerel / `maquereau blanc`; OQLF says `maquereau blanc` was not retained by the fisheries terminology committee for its chub-mackerel entry. CFIA applies `King Mackerel` and French `Thazard` to more than one *Scomberomorus* taxon, although OQLF's `thazard` entry is tied to *S. cavalla*. These French and English common-name boundaries need resolution before a catalog identity or aliases are assigned [S06, S10–S12].

No fish-to-fish substitution or cooking-safety inference is made. No form, numeric value, conversion, yield, or recipe relation is proposed for any candidate.

## Sources

Sources were accessed on 2026-10-09. These proposal-local IDs are not ledger additions.

| Source ID | Official source | Support and limit |
|---|---|---|
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01 | CFIA Fish List, [pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock) | Lists `Pollock` for both *Pollachius virens* and *Gadus chalcogrammus*, and gives Alaska pollock's French names as `Goberge d’Alaska` / `Goberge`. The list shows a 2023-09-18 modification date. Naming and listed taxon only. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S02 | OQLF GDT, [goberge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198637/goberge) | Québec/Canada `goberge`, English `pollock` / `Atlantic pollock`, and *Pollachius virens*. Naming source; it does not resolve CFIA's short French-name collision with Alaska pollock. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S03 | OQLF GDT, [goberge de l’Alaska](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199004/goberge-de-lalaska) | Preferred Québec French display and English pollock variants; gives the older taxon *Theragra chalcogramma*. It is not evidence for *P. virens* terminology. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S04 | NOAA Fisheries, [Alaska Pollock](https://www.fisheries.noaa.gov/species/alaska-pollock) | Uses *Gadus chalcogrammus* and lists Alaska pollock, walleye pollock, and Pacific pollock. Fisheries identification, not culinary equivalence. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S05 | NOAA Alaska Fisheries Science Center, [Yes, Virginia, Walleye Pollock is *Gadus chalcogrammus*](https://apps-afsc.fisheries.noaa.gov/quarterly/ond2013/OND13-Quarterly.pdf) | Explains the change from *Theragra chalcogramma* to *Gadus chalcogrammus*. Taxonomic nomenclature only. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06 | CFIA Fish List, [mackerel query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?c=&lang=e&q=Mackerel) | Returns generic *Scomber* spp. and multiple species including *S. scombrus*, *S. japonicus*, *S. colias*, and several *Scomberomorus* taxa; it pairs Pacific mackerel / `Maquereau du Pacifique` with *S. japonicus*. The list shows a 2023-09-18 modification date. Naming/taxon listing only. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S07 | OQLF GDT, [maquereau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau) | Gives Québec `maquereau`, English `mackerel` / `Atlantic mackerel`, and *Scomber* sp. Supports withholding a generic identity; it does not define all CFIA-listed mackerel species. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S08 | Fisheries and Oceans Canada, [Atlantic Mackerel](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/atl-mackerel-maquereau-eng.html) | Uses `Atlantic Mackerel` with *Scomber scombrus*. Species/fishery page, not a recipe or measurement source. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S09 | Pêches et Océans Canada, [Plan de rétablissement du maquereau de l’Atlantique, *Scomber scombrus*](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/mackerel-atl-maquereau/mac-atl-maq-2024-fra.html) | Uses `maquereau de l’Atlantique` with *S. scombrus*. Management and naming evidence only. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S10 | OQLF GDT, [maquereau espagnol](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198997/maquereau-espagnol) | Gives `maquereau espagnol` / `chub mackerel`, *S. japonicus*, and notes *S. colias* as another species name. It says `maquereau blanc` was not retained by the fisheries terminology committee. This does not support conflating the two taxa. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S11 | OQLF GDT, [thazard tacheté](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198985/thazard-tachete) | Québec preferred term for *Scomberomorus maculatus*; English includes `Spanish mackerel` and `spotted Spanish mackerel`. OQLF says `maquereau espagnol` was not retained as the commercial term for this species. |
| WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S12 | OQLF GDT, [thazard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198963/thazard) | Gives Québec `thazard`, English `king mackerel`, and *Scomberomorus cavalla*. Read with CFIA's broader listing; it does not resolve the other species also listed as king mackerel. |

## Proposal-only acceptance notes

- [x] Keep pollock species separate; advance only the Alaska pollock pair with an explicit Québec French species qualifier.
- [x] Keep Atlantic and Pacific mackerel names species-qualified and omit broad aliases.
- [x] Use OQLF-preferred `thazard tacheté` for the adjacent spotted Spanish mackerel species; do not use the overlapping `maquereau espagnol` label.
- [x] Confirm no exact recipe demand in the manifest-listed recipe corpus.
- [x] Check all four candidate IDs and normalized display names against active references, forms, legacy identities, and ledger record IDs; check the proposal-local source ID prefix against the ledger and existing proposals.
- [x] Preserve the audit as UTF-8 without BOM; no tests or active catalog changes are part of this proposal.

## Coordinator integration disposition

Integrated Alaska pollock, Atlantic mackerel, Pacific mackerel, and spotted Spanish mackerel with only the species-qualified bilingual displays. Corrected the spotted Spanish mackerel citation above to OQLF source S11 (`thazard tacheté`); S12 is the separate `thazard` entry used to explain the king-mackerel boundary. Generic pollock/goberge, Atlantic pollock pending an unambiguous Québec French name, and generic mackerel terms remain unresolved. No recipe links, forms, measurements, conversions, yields, or substitutions were added. See the linked integration README for the accepted rows and verification.
