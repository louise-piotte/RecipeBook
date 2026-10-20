# WP04 Section P — finfish identity coordinator review

- **Packet type:** proposal-only research and catalog/recipe audit.
- **Review date:** 2026-10-09.
- **Disposition:** advance three species-scoped, identity-only candidates: Atlantic cod, haddock, and Atlantic halibut. Keep aliases tightly scoped; do not add forms, numeric data, conversions, yields, or substitution rules.
- **Worktree changes:** this packet only. No seed/catalog/ledger/recipe, plan, roadmap, code, or test file is changed by this review.

## Scope and prior work

This is a bounded finfish subset of Section P, selected for clear Canadian English/fr-CA naming evidence and species anchors. It does not claim to finish the finfish checklist. Shellfish, roe, surimi, fish balls, and preserved/smoked/canned products are excluded from this review. Previously integrated salt cod, stockfish, dried bonito/katsuobushi, tuna, and salmon fillets are not reopened; the existing WP04 seafood proposal already handled Arctic char and American eel. The current salt cod / morue salée and stockfish product identities remain distinct from an Atlantic cod species identity.

The existing WP04 seafood proposal and its source registers were checked alongside roadmap.md, Requirements.md, and the global ingredient-catalog plan. Section P still leaves named finfish and species-sensitive vernacular resolution open. Plan research rules 06–10 require evidence for each claim to stay scoped to its source, recipe demand to be distinguished from naming evidence, and measures/conversions/substitutions not to be inferred from biological size, relatedness, market class, or culinary similarity.

## Refreshed inventory and reproducible audit

roadmap.md's latest regional integration checkpoint reports 543 references, 32 forms, 96 legacy candidates, and 722 ledger records / 1,178 source entries / 992 distinct source IDs. A fresh read for this packet found the following later worktree snapshot. The roadmap was not edited.

| Artifact | Current count | SHA-256 |
|---|---:|---|
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 553 references | ef0e0b74cff528390443d3d6f5ea4dbe164b6bc31901be3df4ee01ddbeac9af4 |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 33 forms | 275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732 |
| docs/catalog/legacy-import-identities.v1.json | 94 candidates | 1421628350323bd7c3fbf2dc566073cfc602f3dc6ff054b44aca3034680e69b5 |
| docs/catalog/research-ledger.v1.json | 731 records / 1,193 source entries / 1,007 distinct source IDs | 7a8ca099dd119fba800c0c3d3f3ef27ecc31bbd02b4e5f3fd911a1c31fb8220f |
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | 30e8640e29dfaf52843f22feb3fde376b0e5e618909163548c267d88bd6e41e6 |

The recipe digest is reproducible by parsing manifest.v1.json, iterating its recipeFiles array in stored order, and feeding SHA-256 each UTF-8 relative path, a NUL byte, the exact corresponding file bytes, and a NUL byte. Counts above were read from the JSON arrays and recipe ingredients[] arrays; file hashes are hashes of exact bytes.

The exact-name audit applied the app's search-key behavior (case fold; Unicode NFKD; fold œ, æ, ß, and &; remove combining accents; replace punctuation/non-alphanumerics with spaces; trim and collapse whitespace). Proposed display names, aliases, excluded short terms, and the candidate Latin binomials were checked against all active reference names/aliases, form labels/match terms, and legacy candidate names/aliases. None of the exact normalized candidate phrases has an active reference, form, or legacy owner. The three proposed IDs are absent from current reference IDs, legacy IDs, and ledger record IDs.

The live aquatic PROTEIN rows include American eel, Arctic char, calamari, dried bonito, dried oyster, dried scallop, dried shrimp, jumbo lump crab meat, salmon fillets, salt cod, stockfish, and tuna. Adjacent non-protein rows include fish sauce, Hondashi, Kapi, oyster sauce, and vegan oyster sauce. None is a target-species identity. The matching seafood forms count is zero. The existing gooseberry row's French display includes the compound groseille à maquereau; it is not an exact standalone mackerel-name owner. charqui is camelid meat and was not counted as fish evidence.

All 114 manifest-listed recipe files and 1,123 ingredient rows were checked for the proposed English/French names and short terms, using the ingredient-row name, source text, and reference ID fields; the complete recipe JSON text was also searched. **There are zero candidate phrase matches in ingredient rows and zero full-file phrase matches.** The current adjacent finfish recipe lines remain recipe 077 row 10 (675 g salmon fillets without skin, cut into cubes, linked to ingredient-ref-salmon-fillets-without-skin) and recipe 111 row 1 (1 tuna steak, linked to ingredient-ref-tuna). Neither supports one of the proposed identities, a new form, or a species inference.

## Identity-only candidates

| Candidate ID | Proposed category and display names | Exact aliases proposed | Species and scope |
|---|---|---|---|
| ingredient-ref-atlantic-cod | PROTEIN; EN **Atlantic cod**; fr-CA **morue de l’Atlantique** | EN: none. FR: none. | *Gadus morhua*. Use the species-qualified display pair only. |
| ingredient-ref-haddock | PROTEIN; EN **haddock**; fr-CA **églefin** | EN: none. FR: aiglefin. | *Melanogrammus aeglefinus*. OQLF normalizes both églefin and aiglefin; CFIA lists Haddock / Aiglefin. |
| ingredient-ref-atlantic-halibut | PROTEIN; EN **Atlantic halibut**; fr-CA **flétan de l’Atlantique** | EN: none. FR: flétan. | *Hippoglossus hippoglossus*. OQLF and CFIA support flétan as the short Québec/Fish List name for this species. |

No candidate gets a density, unit mapping, form, package value, portion default, yield, conversion, or substitution. The exact alias exclusions are part of the proposal:

- **Atlantic cod:** omit bare cod and morue. CFIA's list assigns Cod / Morue to both Atlantic cod (*G. morhua*) and Pacific cod (*G. macrocephalus*); it also lists further cod-named fish. OQLF's unqualified morue entry maps to *G. morhua*, but a catalog alias must work against the broader Canadian name scope too. Omit cabillaud: OQLF marks it France/Europe. Do not fold salt cod / morue salée or stockfish into this species row.
- **Haddock:** aiglefin is the sole additional French alias. OQLF marks both French spellings as normalized. Exclude the discouraged phonetic spelling haddeck; do not treat smoked haddock or finnan haddie as synonyms for unqualified fish identity.
- **Atlantic halibut:** accept the short French flétan because OQLF says the Atlantic species is commonly called that and CFIA lists it for *H. hippoglossus*. Omit bare English halibut: the CFIA Fish List assigns it to both Atlantic and Pacific halibut. Keep Pacific halibut (*H. stenolepis*) distinct. Exclude Greenland halibut / flétan du Groenland / flétan noir and the regional trade word turbot; OQLF says the latter is not retained for Québec fish-product naming and distinguishes European turbot (*Scophthalmus maximus*).

These names identify species, not recipe forms or preservation states. A search for a short term may still return a species-qualified result, but the source evidence does not justify automatically resolving an unqualified cod or halibut ingredient line to one species.

## Deferred scope-name collisions

The following Section P names were not included in this bounded set. The live recipe scan found no target line for them, and their common-name scope needs to be maintained at the source-qualified level:

- **Pollock:** CFIA gives unqualified Pollock for *Pollachius virens* and *Gadus chalcogrammus* (Alaska/walleye/Pacific pollock); OQLF's Québec goberge points to *P. virens*. A later candidate could be species-qualified, but no generic pollock / goberge alias is proposed here.
- **Trout:** OQLF distinguishes rainbow, brown, brook, and lake trout (touladi), and notes Québec commercial-use limits and a distinct saltwater-associated saumon arc-en-ciel usage. Do not create a generic trout / truite identity from the family name.
- **Mackerel:** OQLF's general maquereau entry covers *Scomber* sp.; the CFIA mackerel query returns numerous species and common names. Species-specific Atlantic mackerel is a separate future candidate, not a generic alias for mackerel products.
- Sole, flounder, turbot, hake, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, herring, sardine, anchovy, regional fish, and other Section P finfish remain open; this packet does not declare absence of a need for them.

## Portion, density, conversion, and substitution evidence

Evidence is reported separately from identity. The Health Canada Canadian Nutrient File pages provide these record-specific raw-fish portion observations:

| CNF food record | Source entry | Evidence found | Limit |
|---|---|---|---|
| 3194 | Fish, cod (scrod), Atlantic, raw | 1 fillet = 231.0 g; 1 food-guide serving = 90.0 g; total refuse 66%. | The record is qualified as scrod and raw; this single fillet value is not an average Atlantic-cod fillet or default recipe conversion. |
| 3198 | Fish, haddock, raw | 1 fillet = 193.0 g; 1 food-guide serving = 90.0 g; total refuse 66%. | Record-specific raw fillet value; no general cooked portion or fillet-size rule. |
| 3200 | Fish, halibut, Atlantic or Pacific, raw | 1/2 fillet = 204.0 g; 1 food-guide serving = 90.0 g; total refuse 64%. | The source combines Atlantic and Pacific species, so it cannot establish an Atlantic-halibut-specific portion. |

These CNF observations are not recipe evidence and should not be loaded as defaults. None of the examined Canadian records gives a source-qualified g/mL density or a volume-to-mass conversion for these proposed identities. Do not derive density from water/nutrient composition, size, or fillet weight. The measured amounts are observations for exact database records, not accepted conversions for every state or species.

Recipe sources contain contextual alternatives, but none supports a global or catalog-ID substitution rule:

1. NOAA / U.S. Fish and Wildlife's school-lunch recipe Baked Cod Fillets with Bread Stuffing names cod fillets (fresh or frozen), 100 portions, and gives a haddock variation: use 18 lb haddock in place of 18 lb cod, bake at 350°F for about 30–40 minutes. The same source's directions call for pieces of about 2½ oz, while the 18 lb batch total does not arithmetically equal 100 pieces of that size. Preserve that source-internal mismatch; do not derive a yield or ratio from it. The source does not identify its cod species, so it does not connect safely to ingredient-ref-atlantic-cod.
2. America's Test Kitchen's WSKG Halibut à la Nage with Parsnips and Tarragon specifies four skinless halibut fillets, 5–6 oz each and ¾–1 inch thick, poached. It says other flaky white fish such as cod, haddock, pollock, or hake may replace halibut and asks for uniformly thick fillets. It supplies no replacement mass and no species qualification.
3. America's Test Kitchen's WSKG Crispy Fish Sandwiches with Tartar Sauce specifies four skinless haddock fillets, 4–6 oz each, 1 inch thick, for a beer-battered deep-fried sandwich; it says cod or halibut can be substituted for haddock. No substitute species, replacement weight, or ratio is given.

These sources document recipe-specific suggestions only. Their unqualified cod and halibut terms do not resolve Atlantic versus Pacific species, and they do not establish equal performance across recipes. The supported decision for this packet is **no global substitute and no candidate-ID contextual rule**. No bundled recipe line requests any of these fish, so no recipe substitution link is proposed.

## Sources

All online sources were accessed 2026-10-09. The source IDs in this packet are proposal-local; this proposal adds no ledger entries.

| Source ID | Source and URL | Exact support and limit |
|---|---|---|
| WP04-FINFISH-ID-20261009-S01 | OQLF GDT, [morue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198846/morue) | Maps morue to English cod and *Gadus morhua*; labels cabillaud France/Europe and explains fresh/frozen French usage. It does not resolve the broader CFIA Canadian list collision. |
| WP04-FINFISH-ID-20261009-S02 | OQLF GDT / Faune et flore du pays, [morue de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573546/morue-de-latlantique) | Direct EN Atlantic Cod / FR morue de l’Atlantique / Latin *Gadus morhua* pairing. The species description is not edible-portion evidence. |
| WP04-FINFISH-ID-20261009-S03 | OQLF GDT, [églefin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199838/eglefin) | Maps EN haddock to *Melanogrammus aeglefinus*, lists both normalized FR terms églefin and aiglefin, and discourages hadde(c)k. |
| WP04-FINFISH-ID-20261009-S04 | OQLF GDT, [flétan de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198639/fletan-de-latlantique) | Direct EN/FR/Latin pairing for Atlantic halibut, *Hippoglossus hippoglossus*; says the species is commonly called flétan and that a species-specific normalized term avoids consumer-label confusion. |
| WP04-FINFISH-ID-20261009-S05 | OQLF GDT, [flétan du Groenland](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland) | Identifies *Reinhardtius hippoglossoides*, distinguishes it from Atlantic halibut, and says Québec trade turbot was not retained for fish-product names; separates European turbot. |
| WP04-FINFISH-ID-20261009-S06 | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Says CFIA Fish List names are the accepted common names for listed species and supplies English/French names and taxonomic serial numbers. This is Canadian labeling guidance, not a recipe lexicon. |
| WP04-FINFISH-ID-20261009-S07 | CFIA Fish List, [cod query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Cod) | Lists *G. macrocephalus* and *G. morhua* with Cod / Morue, plus species-specific Atlantic/Pacific names; supports withholding generic aliases. Fish List last modified 2023-09-18. |
| WP04-FINFISH-ID-20261009-S08 | CFIA Fish List, [haddock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Haddock) | Maps *M. aeglefinus* to Haddock / Aiglefin and also lists French églefin; supports proposed alias and species. Fish List last modified 2023-09-18. |
| WP04-FINFISH-ID-20261009-S09 | CFIA Fish List, [halibut query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Halibut) | Lists both *H. hippoglossus* and *H. stenolepis* under English Halibut; distinguishes Atlantic and Pacific species names and French terms. Fish List last modified 2023-09-18. |
| WP04-FINFISH-ID-20261009-S10 | DFO, [Rebuilding plan for Atlantic Cod—NAFO Divisions 2J3KL](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/cod-morue/2020/cod-atl-morue-2020-eng.html) | Uses Atlantic cod for *Gadus morhua* in a specific Canadian management area; species context, not food labeling, portions, or measures. |
| WP04-FINFISH-ID-20261009-S11 | DFO, [Haddock](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/haddock-aiglefin-eng.html) | Identifies haddock as *Melanogrammus aeglefinus* and Canadian North Atlantic range; biological profile does not establish recipe interchangeability. |
| WP04-FINFISH-ID-20261009-S12 | DFO, [Atlantic Halibut](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/atl-halibut-fletan-atl-eng.html) | Identifies Atlantic halibut as *Hippoglossus hippoglossus* and documents Atlantic distribution; size/weight descriptions are not edible fillet yields. |
| WP04-FINFISH-ID-20261009-S13 | Health Canada CNF, [food 3194](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3194) | Exact raw cod (scrod), Atlantic record with 231 g per fillet, 90 g serving, and 66% refuse; record-specific only. Page modified 2019-03-01. |
| WP04-FINFISH-ID-20261009-S14 | Health Canada CNF, [food 3198](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3198) | Exact raw haddock record with 193 g per fillet, 90 g serving, and 66% refuse; record-specific only. Page modified 2019-03-01. |
| WP04-FINFISH-ID-20261009-S15 | Health Canada CNF, [food 3200](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3200) | Combined raw Atlantic-or-Pacific halibut record with 204 g per half fillet, 90 g serving, and 64% refuse; not Atlantic-species-specific. Page modified 2019-03-01. |
| WP04-FINFISH-ID-20261009-S16 | NOAA / U.S. Fish and Wildlife, [Baked Cod Fillets with Bread Stuffing](https://spo.nmfs.noaa.gov/sites/default/files/legacy-pdfs/testkitchen05.pdf), Test Kitchen Series No. 5 | One 100-portion institutional recipe offers haddock in place of cod using the same listed 18 lb batch amount. Its unqualified cod name and internal portion/batch mismatch preclude a species-wide amount or rule. |
| WP04-FINFISH-ID-20261009-S17 | WSKG / America's Test Kitchen, [Halibut à la Nage with Parsnips and Tarragon](https://www.wskg.org/arts/2025-01-10/americas-test-kitchen-halibut-a-la-nage-with-parsnips-and-tarragon-ep-2512) (2025-01-10) | Gives the 4 × 5–6 oz halibut fillet recipe and suggests flaky white fish including cod/haddock/pollock/hake, with uniform thickness. No replacement amount or species-qualified cod/halibut. |
| WP04-FINFISH-ID-20261009-S18 | WSKG / America's Test Kitchen, [Crispy Fish Sandwiches with Tartar Sauce](https://www.wskg.org/episodes/2022-07-12/americas-test-kitchen-crispy-fish-sandwiches-with-tartar-sauce-ep-2218) (2022-07-12) | Gives 4 × 4–6 oz, 1-inch haddock fillets for one beer-battered sandwich recipe and says cod or halibut can replace haddock. No replacement weights or Atlantic/Pacific scope. |
| WP04-FINFISH-ID-20261009-S19 | CFIA Fish List, [pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock) | Returns Pollock for *Pollachius virens* and *Gadus chalcogrammus*; the latter is also Alaska/walleye/Pacific pollock. Fish List last modified 2023-09-18. |
| WP04-FINFISH-ID-20261009-S20 | OQLF GDT, [goberge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198637/goberge) | Québec goberge maps to *Pollachius virens* and English pollock/Atlantic pollock; France/Europe terms differ. This can support a future species-scoped candidate, not a broad alias. |
| WP04-FINFISH-ID-20261009-S21 | OQLF GDT, [truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel) | Identifies rainbow trout, *Oncorhynchus mykiss*, and distinguishes four Québec salmonids called trout, including touladi; notes narrow commercial exceptions and a distinct saumon arc-en-ciel context. |
| WP04-FINFISH-ID-20261009-S22 | OQLF GDT, [maquereau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau) | General Québec maquereau maps to *Scomber* sp.; does not scope every fish sold under English mackerel. |
| WP04-FINFISH-ID-20261009-S23 | CFIA Fish List, [mackerel query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=MACKEREL) | Returns multiple mackerel species/common-name records, supporting deferral of an unqualified mackerel identity. Fish List last modified 2023-09-18. |
| WP04-FINFISH-ID-20261009-S24 | DFO, [Pollock (*Pollachius virens*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pollock-goberge-eng.html) | Confirms the Atlantic pollock species named by OQLF's Québec goberge; its biological page does not create culinary forms or substitutes. |

## Source-ID and candidate-ID checks; remaining work

The proposed source prefix WP04-FINFISH-ID-20261009-S had no match in the 1,007 distinct source IDs in the refreshed ledger or in the existing repository proposal/batch text before this packet was written. The 24 IDs above are nonrepeating within this packet and are proposal-local, not ledger additions. Each proposed candidate ID was also checked against live references, legacy identities, and ledger record IDs; none is already owned.

No cod, haddock, pollock, halibut, trout, or mackerel recipe line is present in the current bundle. The three identities above are bounded catalog coverage recommendations without recipe relinking. Species-level work for the deferred names, the remaining Section P fish, and independent Québec terminology review remain open. No portion, conversion, density, yield, form, or substitution claim is ready for global activation from this evidence.
