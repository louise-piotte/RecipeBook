# WP04 Section P — lake whitefish identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, naming, measurement, substitution, and recipe-demand review.
- **Disposition:** propose one species-scoped identity for lake whitefish / grand corégone, *Coregonus clupeaformis*. Keep the names species-qualified and add no aliases. Do not link a recipe, create a form, or activate a density, unit mapping, yield, conversion, or substitution.
- **Worktree scope:** this proposal file only. No shared catalog JSON, ledger, recipe, checklist, roadmap, workflow, generated file, or test was changed.

## Bounded decision

Recommend one identity-only PROTEIN reference:

| Candidate ID | English display | fr-CA display | Aliases | Taxon |
|---|---|---|---|---|
| ingredient-ref-lake-whitefish | lake whitefish | grand corégone | None | *Coregonus clupeaformis* |

The Québec Office de la langue française (OQLF) identifies lake whitefish as the English equivalent of its standardized Québec food-fish term grand corégone and assigns both to *C. clupeaformis*. TERMIUM Plus gives the same English/French pairing and says grand corégone is the standardized commercial name. DFO maintains matching English and French species profiles. CFIA also lists *C. clupeaformis*, but its Fish List distributes the English and French variants over multiple rows: Whitefish / Grand Corégone, Lake Whitefish / Corégone, and a French-only Poisson Blanc row. This proposal uses the specific pair supported directly by OQLF, TERMIUM, and DFO; it does not treat CFIA's row variants as generic aliases.

Keep this candidate distinct from:

- Lake herring / cisco, *Coregonus artedi*, and Arctic cisco, *C. autumnalis*;
- broad whitefish, *C. nasus*, which CFIA also lists as Whitefish and Poisson Blanc;
- generic whitefish, poisson blanc, and pale-fleshed fish wording, none of which selects this species;
- the active freshwater species rows and the other Section P finfish identities.

Do not infer identity or recipe demand from shared genus, freshwater habitat, pale flesh, or commercial-fish status. A one-word search for whitefish may still retrieve the species-qualified display because it contains that word; the display is not a stored generic alias and does not authorize linking an unqualified recipe line.

## Prior-work and current-plan boundary

The current Section P checklist leaves additional finfish identities open. The finfish coordinator review, species follow-up, finfish-gaps review, freshwater finfish review, salmon/tuna scope review, pollock/mackerel review, sardine review, sablefish review, and 2026-10-12 next-finfish sweep were checked. Those packets cover their named species and held market-name boundaries; none allocates or holds lake whitefish / grand corégone. The recent next-finfish sweep advances red hake and keeps Atlantic pollock held, not this species.

The current shellfish and seafood work was checked for collisions. This candidate does not reopen the held or integrated crab, crayfish, oyster, clam, cockle, mussel, cuttlefish, octopus, scallop, lobster, langoustine, periwinkle, sea-cucumber, sea-urchin, conch, whelk, fish-ball/surimi, or preserved-fish decisions. It is a separate species-scoped finfish gap. No matching lake-whitefish proposal or batch exists in the current catalog documents.

## Exact-key ownership and live snapshot

The exact-key audit mirrors normalizeIngredientSearchKey in IngredientSearch.kt: lowercase, Unicode NFKD, fold œ / æ / ß and ampersand, remove combining marks, replace punctuation with spaces, and collapse whitespace. Exact normalized phrases were checked against active reference names and aliases, every form label and match term, legacy-candidate names and aliases, and ledger record IDs.

Snapshot read from the live worktree on 2026-10-12. File hashes cover exact bytes. The recipe-corpus digest iterates manifest.recipeFiles in stored order and hashes each relative path, a NUL byte, the exact recipe bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,236 references | 5777a596ace933894fca32a4b5f0269894a4543b10d45f798013d05f3dda1c9f |
| ingredient-forms.v1.json | 86 forms | 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| legacy-import-identities.v1.json | 66 candidates | bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f |
| research-ledger.v1.json | 1,535 records; 5,300 source entries; 4,342 distinct source IDs | 9b330827411ea776a62e8b68a21a49ea7a809ccf1e5d3f64febc34c08bcacb23 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,993 recipe-file bytes | 2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27 |

Exact normalized-key results:

| Query key | Exact active reference / form / legacy / ledger-ID owner | Decision |
|---|---|---|
| lake whitefish | None | Candidate English display. |
| grand corégone | None | Candidate fr-CA display. |
| Coregonus clupeaformis | None | No taxon string is stored as an exact display, alias, form term, legacy name, or ledger record ID. |
| whitefish; white fish | None | Do not add as aliases; CFIA applies Whitefish to more than one *Coregonus* taxon, and the short term has broad culinary usage. |
| corégone; corégone de lac; poisson blanc | None | Do not add as aliases; OQLF normalizes grand corégone for Québec fish-product naming and says these broader alternatives are not retained for that use. |
| lake whiting; eastern whitefish; Great Lakes whitefish; common whitefish; inland whitefish; gizzard fish | None | TERMIUM lists these as other English terms for *C. clupeaformis*; none is needed for the bounded display and no alias is proposed. |
| ingredient-ref-lake-whitefish; candidate-lake-whitefish | Neither ID exists in references, forms, legacy candidates, or ledger records. | Reference ID is unallocated; there is no candidate record to promote. |

The active Pacific halibut, Atlantic halibut, Atlantic cod, Alaska pollock, freshwater walleye, northern pike, yellow perch, channel catfish, and other fish rows do not own either proposed display or the taxon. The full source list below was also checked against the live ledger: the six proposal-local source IDs are absent there and absent from existing proposal/batch files. No source entry is being reissued under a new ID.

## Full manifest recipe-demand audit

All 114 manifest paths were read in manifest order. The audit checked every one of the 1,123 ingredient rows, including ingredient name, original text, reference/form IDs, and localized notes, and searched every parsed string value in each complete recipe JSON file. Whole-word normalized phrases included lake whitefish, lake white fish, grand corégone, Coregonus clupeaformis, whitefish, white fish, corégone, corégone de lac, poisson blanc, lake whiting, eastern whitefish, Great Lakes whitefish, common whitefish, inland whitefish, and gizzard fish.

**Result: zero matching ingredient rows and zero matching recipe files.** Nearby seafood lines do not identify this fish: recipe 077#10 names salmon fillets; recipe 111#1 names tuna; recipe 093#4 is an unlinked “Cooked meat or seafood, to taste” placeholder; 093#6 and 095#5 are fish sauce; 019#8 is Jumbo Lump crab meat; and 023#1 is sliced calamari. None supports a lake-whitefish link, form, or amount.

## Measurement and density evidence

Health Canada’s Table 8, Nutrient Value of Some Common Foods, reports “Whitefish, lake, native, baked” with a 75 g measure and 75 g weight. This is one prepared-food nutrient-table entry. Retain it only as a source-specific baked-fish observation; it is not a recipe direction, raw-filleting basis, count weight, or default portion.

No reviewed Canadian or Québec source supports a general lake-whitefish density in g/mL, raw volume-to-mass mapping, standard fillet weight, edible yield, or cooking yield. If the identity is accepted, preserve only the exact 75 g baked reference observation and leave defaultDensity null and unitMappings empty. Add no form or conversion without a product or recipe target.

## Substitution evidence

The reviewed CFIA, DFO, OQLF, TERMIUM, and Health Canada sources establish naming, taxon, Canadian fishery context, or a source-specific nutrition-table observation. They do not establish a recipe-scoped substitution from lake whitefish to another fish, or from another fish to lake whitefish, with a method and quantity adjustment. No bundled recipe requests this species.

If the candidate is accepted, record that this bounded review found no supported recipe substitute. Do not create a global whitefish-family crosswalk, contextual substitution, or recipe-line link based on shared genus, habitat, or white flesh.

## Recommended integration delta

1. Add ingredient-ref-lake-whitefish in PROTEIN with English display lake whitefish and Québec French display grand corégone; add no aliases.
2. Add one verified ledger identity record keyed to that ID and attach the source entries below. Record the Health Canada 75 g amount only as a prepared baked-food observation with its table-specific basis; keep density and unit mappings unknown.
3. Set substitution research to no supported recipe substitute for this bounded review. Keep cisco, broad whitefish, and unqualified whitefish / poisson blanc distinct.
4. Make no recipe, form, conversion, yield, density, package-yield, or legacy-candidate change. Leave the listed held and integrated Section P work unchanged.

## Sources

The pages were accessed on 2026-10-12. The WP04-LAKE-WHITEFISH-20261012-S01 through S06 IDs below were checked absent from the live research ledger and existing catalog proposal/batch files before assignment. They are proposal-local, not ledger additions.

| Source ID | Primary Canadian / Québec source | Evidence and limits |
|---|---|---|
| WP04-LAKE-WHITEFISH-20261012-S01 | CFIA Fish List, [Lake Whitefish query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Lake%20Whitefish) | Lists *Coregonus clupeaformis* as Whitefish / Grand Corégone, Lake Whitefish / Corégone, and a French-only Poisson Blanc entry. Also lists *C. nasus* as Broad Whitefish / Poisson Blanc. This confirms the taxon and shows why short names are not safe global aliases; the rows do not themselves supply the exact proposed bilingual pair. |
| WP04-LAKE-WHITEFISH-20261012-S02 | Fisheries and Oceans Canada, [Lake Whitefish (*Coregonus clupeaformis*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-whitefish-grand-coregone-eng.html) | English species profile pairs the name and taxon and documents Canadian commercial and other fisheries. Fishery evidence is not culinary interchangeability or a recipe measure. |
| WP04-LAKE-WHITEFISH-20261012-S03 | Pêches et Océans Canada, [Grand corégone (*Coregonus clupeaformis*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-whitefish-grand-coregone-fra.html) | French species profile uses the Québec-facing display and the same taxon; describes commercial, recreational, and Indigenous fisheries. This is not recipe or conversion evidence. |
| WP04-LAKE-WHITEFISH-20261012-S04 | OQLF, [grand corégone (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199106/grand-coregone) | In zoology and edible-fish domains, directly pairs grand corégone with English lake whitefish and *C. clupeaformis*. Marks grand corégone as Québec’s standardized term and says corégone de lac and poisson blanc were not retained for Québec commercial fish-product labeling. Terminology evidence only. |
| WP04-LAKE-WHITEFISH-20261012-S05 | Government of Canada Translation Bureau, [TERMIUM Plus: lake whitefish](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=SAULT+WHITEFISH) | The *C. clupeaformis* entry marks lake whitefish correct and gives grand corégone as correct and standardized. It also lists broader or regional alternatives; this proposal does not activate them as aliases. |
| WP04-LAKE-WHITEFISH-20261012-S06 | Health Canada, [Nutrient Value of Some Common Foods, Table 8: Fish and Shellfish](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html) | Table row “Whitefish, lake, native, baked” reports a 75 g measure / 75 g weight. Preserve as one baked reference-food observation, not a raw portion, recipe-serving recommendation, density, or conversion. |

No tests or emulator checks were run for this proposal-only review.
