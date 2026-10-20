# WP04 Section P — Arctic wedge clam picker boundary (round 50)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, Québec product context, picker, exact ownership,
  recipe-demand, measurement, and substitution review.
- **Recommendation:** **Hold** Arctic wedge clam / `clovisse arctique` (*Mesodesma arctatum*) outside
  active ingredient references and the research ledger. Canadian and Québec sources establish an
  edible clam species and local French/English names, but the current picker would make the broad
  query `clam` return this single species while generic clam remains unresolved. A regional Québec
  seafood guide reports an undetermined resource status and says commercial fishing occurs sometimes
  in the Moyenne-Côte-Nord, with catches below authorized quotas; the bundled recipe corpus has no clam
  demand. An Exploramer 2022 supplier directory lists no distributor, but that historical snapshot
  does not establish current availability; no current Québec retail SKU surfaced in this review. Do not
  activate a species-only row until the
  picker can preserve the broader clam choice or a recipe/product request selects this species.
- **Conditional identity shape, for impact analysis only:** `ingredient-ref-arctic-wedge-clam`,
  category `PROTEIN`, English **Arctic wedge clam**, Québec French **clovisse arctique**, scoped to
  *M. arctatum*; empty alias arrays, null density, and no unit mappings. This row is **not** recommended
  for activation.
- **Shared-data effect:** none. Add no active reference, form, alias, recipe link, measurement,
  conversion, yield, substitution, legacy candidate, or ledger record.
- **New proposal-local source IDs:**
  `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S01` through `S06`. The prefix is absent from the live
  ledger and proposal/batch archive.

## Why this is a distinct open Section P gap

The Section P shellfish checklist remains open for mussel, clam, oyster, cockle, and remaining
shellfish identities. Prior reviews hold generic clam / `palourde`, Manila clam, Stimpson’s surf clam,
and cockle boundaries, but no proposal or batch has made a focused decision for *Mesodesma arctatum*.
The generic-clam review cites Fisheries and Oceans Canada’s bivalve guide as broad cross-species
context; it does not allocate this species or decide its identity, picker effect, food-market need, or
recipe use. This packet leaves those existing holds intact and addresses only the Arctic wedge clam.

DFO’s bilingual species guide pairs `Arctic wedge clam` and `clovisse arctique` with *M. arctatum*.
The Québec seafood education site De l’eau à la bouche also identifies the species as seafood and
gives it the culinary name `palourde`, but describes its resource status as undetermined and says
commercial fishing occurs sometimes in the Moyenne-Côte-Nord, with catches below authorized quotas.
Those sources support a bounded food-species identity and local harvesting context; they do not
establish routine retail availability or recipe demand. The word `Arctic` is part of the documented name, not a claim that
this clam is confined to Arctic waters: the Québec species page notes its range extends south to
Virginia and explains that the name arose from a translation error in *arctatum*.[S01, S03]

## Québec and Canadian identity and food-market evidence

- DFO’s Canadian bivalve guide lists `Arctic wedge clam (*Mesodesma arctatum*)` among harvested
  Canadian clams. Its French version gives `clovisse arctique` for the same species, describes the
  Atlantic coast range, and notes that the clam does not shrink during cooking. The page is a species
  identification guide, not a Canadian label standard, current product listing, recipe, or portion
  source. It was last modified 2021-06-09. [S01]
- DFO’s open-data layer maps known concentration areas of *M. arctatum* in the Estuary and Gulf of
  St. Lawrence, Québec region. The metadata says the mapped areas include harvested **and unharvested**
  concentrations, rely on inventories and research from 2000–2020, and do not indicate where fishing
  is permitted. The Open Government Portal record was modified 2026-03-24. This supports a Québec
  species/distribution boundary, not current supply or harvest authorization. [S02]
- De l’eau à la bouche, a Québec seafood education site developed with Exploramer and Université
  Laval, calls the species a mollusc/seafood, uses `clovisse arctique` and *M. arctatum*, and lists
  generic culinary wording `palourde`. It says commercial fishing sometimes occurs along the central
  North Shore, and that landings do not reach authorized quotas. It reports the resource status as
  undetermined and recreational harvesting as conditional on local
  openings and shellfish safety. Those statements are a regional food-program summary, not a current
  vendor SKU or a substitute for DFO harvest notices. [S03]
- DFO’s species-code report distinguishes the species from the broader `Mesodesma` / `clovisse` name:
  it gives *Mesodesma* sp. as `clovisse` / `wedgeclam`, *M. arctatum* as `clovisse arctique` /
  `Arctic wedgeclam`, and *M. deauratum* as a separate clovisse species. This supports keeping bare
  `clovisse` out of aliases. The code list is taxonomy/monitoring nomenclature, not consumer-label
  guidance. [S04]

No current Québec retailer SKU or bundled recipe selects Arctic wedge clam. The source evidence
establishes more than a taxonomic identification, but it does not resolve the shared picker’s broad
clam query or establish a current consumer supply channel. The recommendation is therefore a picker
hold, not a denial that the species is edible or harvested.

## Exact ownership and prior-work audit

The exact-key audit follows `normalizeIngredientSearchKey` in
[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):
lowercase, NFKD normalization, compatibility folding, accent removal, punctuation-to-space
conversion, and whitespace collapse. Reference display names/aliases, form labels/match terms,
legacy-import names/aliases, ledger record IDs, and the Section P archive were checked separately.

| Candidate key or ID | Current owner / evidence state |
|---|---|
| `Arctic wedge clam`, `wedge clam`, `compressed clam`, `clovisse arctique`, `clovisse comprimé`, `mésodesme arctique`, *Mesodesma arctatum* | No exact active-reference, form, or legacy-import field owner; no candidate-specific ledger identity record. |
| `ingredient-ref-arctic-wedge-clam`; `candidate-arctic-wedge-clam` | Absent from active references, forms, legacy candidates, and ledger record IDs. Neither ID is allocated by this hold. |
| `ingredient-ref-clam` | Existing ledger-only candidate with `identityState: needs_clarification`; there is no active generic clam reference. Keep this hold unchanged. |
| `ingredient-ref-blue-mussel`; `ingredient-ref-scallop`; `ingredient-ref-fresh-oyster`; `ingredient-ref-cockle`; `ingredient-ref-mussel` | Existing neighboring seafood decisions/ledger candidates. None owns any exact Arctic wedge clam name or taxon. No form is attached to an Arctic wedge clam identity. |
| Forms | The 100 live forms contain no exact candidate name or search term. Current picker projections for `clam`, `clovisse`, and candidate-qualified phrases return no form-backed result. |
| Legacy candidates | No candidate owns the candidate names, aliases, taxon, or proposed ID. |
| Prior focused packets | No dedicated Arctic wedge clam identity/product-boundary proposal or batch. The generic-clam packet mentions clovisse only as broad bivalve context; it does not assess *M. arctatum*. |
| New source-ID prefix `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S` | No collision in the live ledger source register or proposal/batch archive. New IDs S01–S05 are unique within this proposal. |

The live snapshot at review time contained **1,378 references**, **100 forms**, **63 legacy-import
candidates**, and **1,708 ledger records**. The only directly related ledger identity is the unresolved
generic `ingredient-ref-clam` candidate; it is not an owner for this species.

## Picker projection

This static projection mirrors the live search rules in
[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):
complete normalized word phrases win, then substring matching is used only when no full-phrase result
exists. It considers active references and attached form terms. No row or form was created; the
conditional row below uses the proposed bilingual displays with no aliases solely to show picker
impact.

| Query | Current picker result(s) | With the conditional alias-free row | Consequence |
|---|---|---|---|
| `arctic wedge clam`; `clovisse arctique` | No result | Arctic wedge clam / clovisse arctique only | Adds a sole species result for the qualified names. |
| `clam` | No result | Arctic wedge clam / clovisse arctique only | A broad English clam search would present this one species, although the generic clam candidate remains unresolved and Canadian guides distinguish several clam species. |
| `wedgeclam` | No result | No result | Do not add this one-word genus-level English term as an alias; DFO’s species-code list uses it for *Mesodesma* sp. |
| `clovisse` | No result | Arctic wedge clam / clovisse arctique only | This broad French family/genus wording would look exclusive despite DFO listing separate *Mesodesma* species and the unresolved generic clam boundary. |
| `palourde` | No result | No result | Keep the local culinary category name off the row; it is generic and is not the DFO French display. |
| `arctique` | Antarctic toothfish / légine antarctique | Antarctic toothfish plus Arctic wedge clam | The English/French displays add a second reference to this broad fragment query. |
| `Mesodesma arctatum`; `compressed clam` | No result | No result | Keep the scientific name and source-listed alternate wording out of aliases. |

The picker does not provide a way to choose a generic clam identity alongside species-specific clams.
Activating the conditional row now would make both `clam` and `clovisse` appear resolved to one
species. Keep the name/taxon evidence for a later decision, but do not allocate the row until family
search can preserve multiple appropriate choices or a specific recipe/product request justifies the
scope.

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 ingredient rows**. Every complete recipe JSON
document and every ingredient row was scanned for `Arctic wedge clam`, `wedge clam`, `compressed clam`,
`clovisse`, `clovisse arctique`, *Mesodesma arctatum*, and the generic neighbors `clam`, `clams`,
`palourde`, `mactre`, and `shellfish`.

**Result: zero matching recipe files and zero matching ingredient rows**, including generic clam
wording. Recipe 093#4’s unlinked “Cooked meat or seafood, to taste” does not select a clam or shellfish
species. No recipe link, relink, product state, quantity, or recipe-specific substitution is supported.

## Measurement and substitution evidence

| Dimension | Evidence found | Catalog decision |
|---|---|---|
| Identity and product | DFO identifies the harvested species and Québec French name. The local seafood guide documents a Québec food/harvest context but says resource status is undetermined, commercial fishing occurs sometimes in the Moyenne-Côte-Nord, and catches remain below authorized quotas. | Keep the identity unallocated because the current picker would turn broad clam wording into a one-species result; do not claim routine Québec retail supply. |
| Aliases and forms | The Québec source lists `clovisse comprimé` and `mésodesme arctique` as French alternate wording; `compressed clam` is only a literal English rendering, and `palourde` is the generic culinary name. No recipe or exact consumer package selects a state. | Add no aliases, fresh/live/shelled/cooked/frozen form, or other form hint. Keep the scientific name out of picker terms. |
| Numeric evidence | DFO’s 4 cm maximum length is a biological shell-size observation; the local guide’s 3 cm harvest minimum is a harvesting rule. Neither is an ingredient count, portion, package weight, household measure, volume-to-mass mapping, density, or yield. DFO and the local guide say the clam does not shrink during cooking, but provide no measured before/after yield. | Record no measurement observation, default measure, density, unit mapping, conversion, count mapping, package yield, or preparation-state yield. |
| Substitutions | No bundled recipe or reviewed Canadian/Québec source tests Arctic wedge clam against another clam species with a cooking method and quantity. Shellfish-family membership and qualitative texture notes are not substitution evidence. | Add no global or contextual substitution, ratio, warning, recipe-line link, or food-safety equivalence. |

## Proposal-time baseline snapshot

Counts and hashes describe the live shared artifacts read on 2026-10-13 after the R49 stonecat hold
was added to the documentation archive. The recipe fingerprint hashes each manifest-ordered relative
path, a NUL byte, exact recipe bytes, and another NUL byte. No shared catalog, ledger, recipe, plan,
roadmap, batch, or generated file was changed by this proposal.

| Artifact | Count / size | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,378 references; 442,247 bytes | `c1b1d802c18d225b01ed516808305598000f14a7143fd5376c251289e87a73e6` |
| `ingredient-forms.v1.json` | 100 forms; 74,742 bytes | `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63` |
| `legacy-import-identities.v1.json` | 63 candidates; 15,042 bytes | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `research-ledger.v1.json` | 1,708 records; 6,684 source entries; 5,608 distinct source IDs; 6,656,388 bytes | `4c29739158ba81a4828069d890e1a5d5b38c1fb29a37e9e52940acf6ef0b30f1` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,806 bytes | `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552` |
| Generated `BundledIngredientCatalog.kt` | 1,378 references; 604,612 bytes | `1b514b30aa668a18f6fcb4cc1d1565a3786d2dcb87a3b39f2ecab17df8f3d0ae` |

## Source register

Online sources were checked on 2026-10-13. IDs are proposal-local and are not added to the live
ledger. Sources establish species terminology, regional occurrence, or product/harvest context;
none establishes a transferable kitchen measure or substitution.

| Source ID | Source and supported claim | Limits |
|---|---|---|
| `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S01` | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) and [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm). The Canadian harvested-bivalve guides give `Arctic wedge clam` / `clovisse arctique` and *Mesodesma arctatum*. The French page says the species does not shrink during cooking. | Species/identification and qualitative cooking note; page last modified 2021-06-09. Not a current label, market inventory, portion, measured yield, or conversion source. |
| `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S02` | Government of Canada Open Data, Fisheries and Oceans Canada, [Known concentration areas of Arctic wedge clam in the Estuary and Gulf of St. Lawrence](https://open.canada.ca/data/en/dataset/b0633101-18e6-483a-b668-4e1f76789696?wbdisable=true), record modified 2026-03-24; metadata also available from the [DFO ArcGIS item record](https://egisp.dfo-mpo.gc.ca/arcgis/rest/services/open_data_donnees_ouvertes/biological_sensitivity_mapping_for_oil_spill_planning_and_response_quebec_en/MapServer/1/iteminfo). Identifies *M. arctatum* / `clovisse arctique` / `Arctic wedge clam` and maps known harvested or unharvested concentration areas in Québec’s Estuary and Gulf, using inventories and research through 2020. | The layer expressly does not show general distribution or where fishing is permitted; source data do not establish current retail supply. |
| `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S03` | De l’eau à la bouche, [Clovisse arctique](https://deleaualabouche.ca/especes/clovisse-arctique/) and [Arctic wedge clam](https://deleaualabouche.ca/en/species/clovisse-arctique/), a Québec seafood education project developed with Exploramer and Université Laval; accessed 2026-10-13. Names *M. arctatum*, gives French `clovisse comprimé` and English `compressed clam` as alternate wording, and identifies `palourde` / `clam` as generic kitchen wording. It reports undetermined resource status, commercial fishing sometimes along the central North Shore with catches below authorized quotas, and conditional recreational harvesting. | Regional education summary, not an official commercial label or a current seller SKU. Harvest size and qualitative cooking notes do not supply a recipe amount, edible yield, or substitution. |
| `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S04` | Fisheries and Oceans Canada, [Rapport statistique — codes des espèces (2014)](https://publications.gc.ca/collections/collection_2014/mpo-dfo/Fs97-13-1254.pdf), PDF page 16, species-code rows 4374–4385. Lists *Mesodesma* sp. as `clovisse` / `wedgeclam`, *M. arctatum* as `clovisse arctique` / `Arctic wedgeclam`, and *M. deauratum* as a separate clovisse species. | Species-code and monitoring terminology; not consumer-label guidance, retail evidence, or a recipe equivalence. |
| `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S05` | Exploramer, [Répertoire des fournisseurs 2022](https://exploramer.qc.ca/wp-content/uploads/2022/05/22.05.04-Repertoire-des-fournisseurs-2022.pdf), species entry 6. It lists `Clovisse arctique, Arctic wedgeclam, Mesodesma arctatum` and states `Aucun distributeur`. | First-party supplier-directory snapshot from 2022; useful historical availability context but not evidence of current 2026 distribution or retail stock. |
| `WP04-P-ARCTIC-WEDGE-CLAM-20261013-R50-S06` | Exploramer, [Clovisse arctique — Fourchette bleue](https://fourchettebleue.ca/produits/clovisse-arctique/), current species/product information page. It names *Mesodesma arctatum* and reports that commercial fishing sometimes occurs on the Moyenne-Côte-Nord. | Current food-program species page, not a vendor SKU or evidence of routine retail availability. It supports food context without changing the picker or recipe-demand findings. |

## Recommendation and revisit condition

Keep Arctic wedge clam / `clovisse arctique` unallocated in the active picker and ledger. Do not add
`palourde` as an alias: the local food source uses it as generic culinary wording. Do not add the
literal rendering `compressed clam`, scientific name, or broad `clovisse` term as aliases. Add no form,
measure, recipe link, conversion, yield, or substitution. Revisit if a bundled recipe or exact Québec/
Canadian product request selects this species, or if picker behavior can preserve the generic clam
choice alongside multiple species. Section P remains open.

This is documentation-only. No app tests or emulator checks were run or needed.

## Root integration review — 2026-10-13

Accepted as a documentation-only hold. Independent review confirmed the bilingual DFO names and
taxon, the current DFO Québec concentration-area dataset's limits, and the local seafood page's
species and harvesting context. Exploramer's current Fourchette bleue species page also supports a
current food-program context, while its 2022 supplier directory still only documents the older
`Aucun distributeur` snapshot; neither source identifies a current vendor SKU. These findings do not
change the search impact: an alias-free species row would be the sole result for broad `clam` and
`clovisse` queries while the generic candidate remains unresolved. The current 114-recipe corpus has
no clam demand. No catalog or ledger data changed, and no app tests or emulator checks were run.
