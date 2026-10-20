# WP04 Section P — next finfish gap sweep

- **Review / source access date:** 2026-10-12.
- **Scope:** remaining finfish species-name gaps adjacent to the integrated hake and pollock references; exact catalog ownership, current ledger state, and all 114 bundled recipes.
- **Disposition:** propose one identity-only reference for red hake / merluche-écureuil (*Urophycis chuss*). Keep Atlantic pollock, generic pollock, and unqualified goberge unresolved. Do not add forms, aliases, measurements, conversions, yields, substitutions, or recipe links.
- **Integration status:** added the species-qualified `red hake / merluche-écureuil` reference for *Urophycis chuss* and registered new CFIA/DFO evidence on its ledger record. Atlantic pollock and generic hake/pollock names remain held. No recipe, form, numeric behavior, conversion, yield, or substitution rule changed. No tests or emulator checks were run under the JSON-only data rule; see the [integration record](../batches/wp04-section-p-red-hake-integration-20261012/README.md).

## Decisions

| Name or boundary | Recommendation | Reason |
|---|---|---|
| Red hake / merluche-écureuil | Advance `ingredient-ref-red-hake`, category `PROTEIN`, with no aliases. Scope it to *Urophycis chuss*. | CFIA directly lists `Red Hake / Merluche écureuil` for this taxon. DFO’s English and French fish sheets independently pair the names and species. OQLF explains that Québec commercial `merluche` can denote either this species or the already-integrated white hake, so keep the displayed name species-qualified and do not alias bare `hake` or `merluche`. [S01–S03; reused R02–R03] |
| Atlantic pollock / goberge | Hold a new identity row for this sweep. | CFIA lists English `Pollock` for both *Pollachius virens* and Alaska pollock (*Gadus chalcogrammus*); it also lists bare `Goberge` for Alaska pollock. OQLF and DFO use bare `goberge` for *P. virens*, while the current Canadian French imitation-crab label uses Alaska pollock as an ingredient in a finished surimi product. The salt-cured Canadian *P. virens* product page supplies only an English name. The evidence does not validate a French display such as `goberge de l’Atlantique`; do not coin it by analogy. [R01, S04–S07] |
| Generic hake / merluche | Hold generic identity and aliases. | OQLF says Québec commerce includes both *U. chuss* and *U. tenuis* under the broader `merluche` wording. The active white hake identity is already species-scoped. No recipe or supplied product identifies an unqualified hake species. [reused R03] |
| Generic pollock / goberge | Hold generic identity and aliases. | Canadian common-name evidence spans two pollock taxa, while an exact species-qualified French display for *P. virens* remains unsupported. Keep the active Alaska pollock display unchanged and do not add bare `pollock`, `pollack`, or `goberge` to either species. [R01, S06–S07] |

## Refreshed snapshot and exact-key ownership

Counts and SHA-256 values below were refreshed on 2026-10-12 after integration of the French alias on the existing whole-rye reference. Hashes cover exact file bytes. The recipe-corpus digest iterates `manifest.v1.json` in its stored `recipeFiles` order and hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a NUL byte.

| Artifact | Count / kind | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,214 references | `a8326df9201bae959e611868b29383400d17f6c3ff4ccce961e70751b0962c82` |
| `BundledIngredientCatalog.kt` | Generated ingredient catalog | `1cd5f43080f8d2ba471229b0d2f66c6845a961411c54dba39282dc48e1143599` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,517 records; 5,120 source entries; 4,183 distinct source IDs | `3e227f82c0b4b5fe3a59a3d966f51bf1ecfac4a8ade128a8849e651287b3ce03` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

The exact-key audit mirrored `normalizeIngredientSearchKey`: lowercase, Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, convert punctuation to spaces, then collapse whitespace. It checked candidate English/French displays, common-name variants, and scientific names against all active reference names and aliases, form labels and match terms, and legacy candidate names and aliases.

| Exact owner / candidate | Current owner and evidence state |
|---|---|
| `Alaska pollock` / `goberge de l’Alaska` | Exact active owner: `ingredient-ref-alaska-pollock`, `PROTEIN`, no aliases, verified. The ledger accepts *Gadus chalcogrammus* and says to omit unqualified `pollock` and `goberge` due to Canadian naming overlap. [R01] |
| `white hake` / `merluche blanche` | Exact active owner: `ingredient-ref-white-hake`, `PROTEIN`, no aliases, verified. The ledger keeps *Urophycis tenuis* distinct from red hake / merluche-écureuil and generic hake / merluche. [R02, R03] |
| `red hake`, `merluche-écureuil`, `Urophycis chuss` | No exact active reference, form, legacy candidate, or ledger record owns these keys. Proposed reference ID `ingredient-ref-red-hake` is unowned. No form is attached to a red-hake identity. |
| `Atlantic pollock`, `Pollachius virens`, `goberge de l’Atlantique` | No exact active reference, form, legacy candidate, or ledger record owns these keys. This absence is not evidence for a qualified French name or for an alias. |
| Unqualified `pollock` / `goberge` | No exact display or alias owner exists. A whole-word search for `pollock` or `goberge` can still retrieve the qualified Alaska pollock display; that search result does not identify *P. virens*. |

At proposal review, the shared ledger had no red-hake or Atlantic-pollock candidate record. Integration adds only the accepted red-hake identity record. Relevant existing records remain the accepted `ingredient-ref-alaska-pollock` and `ingredient-ref-white-hake` rows and the unresolved `candidate-surimi-product-boundary`. The latter remains a paste-versus-finished-product boundary; the product-label observation below does not resolve it. Atlantic pollock remains held without a new candidate record in this batch.

## Proposed identity-only row

| Candidate ID | Category | English display | fr-CA display | Additional aliases | Species scope |
|---|---|---|---|---|---|
| `ingredient-ref-red-hake` | `PROTEIN` | **red hake** | **merluche-écureuil** | None | *Urophycis chuss*. Keep distinct from white hake (*U. tenuis*) and broad `hake` / `merluche` wording. |

Use only the paired, species-qualified names. Do not add `squirrel hake`, `mud hake`, `ling`, `lingue`, `redfish`, `hake`, or `merluche` as aliases. The historical DFO fishery atlas groups some alternate names and mixed landings across red and white hake; those broad or inconsistent names are not suitable catalog aliases. [S02–S03, R03]

This establishes a taxon/name pair only. It does not establish a cut, freshness or preservation form, edible yield, measure, conversion, substitution, or recipe interpretation.

## Atlantic pollock evidence hold

The prior pollock review integrated Alaska pollock and explicitly left Atlantic pollock unresolved. The refreshed evidence supports retaining that decision:

- CFIA’s current Fish List query returns *Gadus chalcogrammus* with `Pollock` and `Alaska Pollock`, and it includes both `Goberge d’Alaska` and `Goberge`; it separately returns *Pollachius virens* with `Pollock` and no French name. [R01]
- OQLF’s Québec/Canada entry uses `goberge` for *P. virens* and lists English `pollock` / `Atlantic pollock`. DFO’s current French profile likewise titles the species `La goberge (Pollachius virens)`, without an Atlantic-qualified French name. [S06–S07]
- A Canadian Seafood Depot page markets a salt-cured product as `Salted Pollock`, identifies it as *P. virens*, and describes it as caught and processed in Eastern Canada. The page is English and product-state-specific; it cannot establish a general Québec French display or a salt-cod equivalence. [S04]
- Clover Leaf’s current French-Canadian page for finished Crab Delectables lists `Goberge d’Alaska et/ou merlu du Pacifique` and identifies *Gadus chalcogrammus* and *Merluccius productus*. This is useful evidence that the packaged surimi ingredient can be Alaska pollock; it does not make the finished product a fish identity or settle *P. virens* terminology. [S05]

Do not create `goberge de l’Atlantique` by analogy, map `Atlantic pollock` to the existing Alaska pollock row, or treat the finished Crab Delectables product as fish flesh. Reopen only with direct Québec or Canadian consumer-label evidence for a qualified *P. virens* French name that distinguishes it from the active Alaska pollock name and product uses.

## Complete bundled-recipe audit

All 114 paths in the manifest, all 1,123 `ingredients[]` rows, and complete recipe JSON text were scanned for `red hake`, `merluche-écureuil` (with and without the hyphen), *U. chuss*, `Atlantic pollock`, *P. virens*, and French qualifier variants. There were **zero exact candidate phrase hits in ingredient rows and zero full-file hits**. No recipe link or relink is supported.

Nearby rows confirm the bundle does not imply the proposed species:

| Recipe row | Exact ingredient text | Active link / interpretation |
|---|---|---|
| 077#10 | `675 g salmon fillets without skin, cut into cubes` | `ingredient-ref-salmon-fillets-without-skin`; does not identify a hake or pollock species. |
| 111#1 | `1 tuna steak` | `ingredient-ref-tuna`; no species or preservation state. |
| 093#4 | `Cooked meat or seafood, to taste` | Unlinked, intentionally broad placeholder; no fish species can be inferred. |
| 093#6 and 095#5 | `fish sauce` | Existing condiment `ingredient-ref-fish-sauce`, not fish flesh. |
| 019#8 | `jumbo lump crab meat` | Existing crab identity with a grade form; shellfish, not finfish. |
| 023#1 | `sliced calamari` | Existing calamari identity; cephalopod, not finfish. |

Other keyword hits such as `hondashi` are prepared stock/seasoning, not a request for a finfish species. No species inference, recipe link, or substitution follows from nearby seafood lines.

## Sources

New source IDs below were proposal-local and checked absent from the shared ledger at review time. Integration registered S01–S03 on `ingredient-ref-red-hake`; S04–S07 remain proposal evidence for the pollock hold. Source pages were accessed 2026-10-12.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-NEXT-FINFISH-20261012-S01** | CFIA Fish List, [Red Hake query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Red%20Hake) | Lists *Urophycis chuss* as `Red Hake / Merluche écureuil`. The Fish List is Canadian fish-label naming evidence, not a recipe equivalence standard; its page is dated 2023-09-18. |
| **WP04-P-NEXT-FINFISH-20261012-S02** | Fisheries and Oceans Canada, [Red Hake (*Urophycis chuss*)](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/40582632.pdf) | DFO English Underwater World fish sheet; gives the taxon and the French equivalent `merluche-écureuil`. Fishery/species evidence, not a measurement or substitution source. |
| **WP04-P-NEXT-FINFISH-20261012-S03** | Pêches et Océans Canada, [Merluche-écureuil (*Urophycis chuss*)](https://waves-vagues.dfo-mpo.gc.ca/Library/24740v.3fre.pdf) | French species sheet uses the exact Québec-facing display, names English `red hake`, and describes commercial uses. This does not establish a universal preserved or prepared form. |
| **WP04-P-NEXT-FINFISH-20261012-S04** | Seafood Depot, [Salted Pollock](https://www.seafooddepot.ca/product-saltedpollock2) | Current Canadian product page identifies `Salted Pollock` as *P. virens*, caught and processed in Eastern Canada. English-only, salt-cured product label; no French display or general form equivalence. |
| **WP04-P-NEXT-FINFISH-20261012-S05** | Clover Leaf, [Crab Delectables, flake style — French product page](https://www.cloverleaf.ca/fr/produits/crabe-delectables-de-clover-leaf-mc-en-flocons/) | Current French-Canadian manufacturer page lists `Goberge d’Alaska et/ou merlu du Pacifique` and identifies Alaska pollock (*G. chalcogrammus*) in the finished surimi product. Product evidence only; not an identity mapping for Atlantic pollock or generic surimi. |
| **WP04-P-NEXT-FINFISH-20261012-S06** | Pêches et Océans Canada, [La goberge (*Pollachius virens*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pollock-goberge-fra.html) | Current French species/fishery profile confirms the taxon and bare Québec French name `goberge`; it does not provide an Atlantic-qualified display. Page last modified 2025-07-04. |
| **WP04-P-NEXT-FINFISH-20261012-S07** | OQLF GDT, [goberge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198637/goberge) | Maps Québec/Canada `goberge` and English `pollock` / `Atlantic pollock` to *P. virens*, and notes use of the flesh in surimi. The entry does not remove CFIA’s cross-species overlap or establish a qualified French display. |

Reused shared-ledger evidence (IDs are existing ledger IDs, not new proposal IDs):

- **R01 — `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01`:** CFIA pollock query. Same query also appears under `WP04-FRESHWATER-FINFISH-20261010-S07`. Reused for the species/name overlap; no duplicate source entry is proposed.
- **R02 — `WP04-FINFISH-ID-20261009-S06`:** CFIA guidance on determining common names for fish sold or processed in Canada. Labeling scope only.
- **R03 — `WP04-FINFISH-FOLLOWUP-20261009-S04`:** OQLF GDT, `merluche`. States that Québec commercial `merluche` may refer to *U. chuss* or *U. tenuis* and lists broader English variants. Terminology boundary only.

## Remaining gaps

- **Atlantic pollock:** remain held pending a qualified, species-resolving fr-CA name supported by direct Québec or Canadian consumer-label evidence. Keep the existing Alaska pollock identity and current generic-name exclusions unchanged.
- **Other finfish:** preserve prior holds for generic sole/flounder/turbot, bass/bream, snapper/grouper, tilapia, catfish, and carp market names where common names span taxa or the current Québec display is not resolved. Species-scoped candidates can be reviewed when a direct bilingual source and intended market identity are supported.
- **Already reviewed:** do not reopen the integrated cod/haddock/halibut, Alaska pollock, mackerels, white hake, freshwater walleye/pike/perch, herring, trout, sablefish, sardines, anchovy, eel, salmon/tuna scope, preserved products, or recent shellfish decisions here.
- **Other Section P work:** roe, fish powder, fish balls, surimi, remaining shellfish/cephalopods, regional seafood names, and product-state questions remain separate open work. This sweep changes none of them.

The only integrated identity row is red hake / merluche-écureuil; the recipe corpus supplies no exact demand for that row or for Atlantic pollock. The pollock and generic hake holds remain open. No tests or emulator checks were run.
