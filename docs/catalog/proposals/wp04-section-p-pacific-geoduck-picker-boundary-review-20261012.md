# WP04 Section P — Pacific geoduck / panope du Pacifique picker-boundary review

- **Review date:** 2026-10-12.
- **Packet type:** proposal-only identity, Québec naming, picker-scope, measurement, substitution, and recipe-demand review.
- **Disposition:** **Hold the Pacific geoduck identity unallocated.** Current Canadian sources support *Panopea generosa* as `Geoduck` / `panope du Pacifique`, but seafood nomenclature also uses unqualified `Geoduck` for other *Panopea* species. If this were the only active geoduck candidate, the current picker would return Pacific geoduck alone for a bare `geoduck` search. No bundled recipe or supplied product specifies the Pacific species. Keep the generic clam candidate held and do not add an active row, aliases, forms, measures, conversions, yields, recipe links, or substitutions.
- **Worktree scope:** this proposal file only. No catalog JSON, research ledger, recipe, checklist, roadmap, code, generated file, or test was changed.

## Candidate boundary and hold rationale

The bounded candidate for a future species-qualified identity is:

| Prospective reference, if reopened | Category | English display | fr-CA display | Taxon |
|---|---|---|---|---|
| `ingredient-ref-pacific-geoduck` | `PROTEIN` | **Pacific geoduck** | **panope du Pacifique** | *Panopea generosa* |

Fisheries and Oceans Canada (DFO) currently pairs the English `Geoduck Clam` and French `Panope du Pacifique` with *P. generosa*. The current Pacific Fishery Regulations separately list `Geoduck` / `Panope du Pacifique` with the same taxon. CFIA’s Vietnam export requirements also identify live `Geoduck Clam (Panopea generosa)` harvested in Canadian waters. These sources support a **Pacific-species candidate** and Canadian commercial relevance; they do not support assigning every unqualified geoduck request to that species.

The current U.S. FDA Seafood List distinguishes *P. generosa* as `Pacific Geoduck`, *P. bitruncata* as `Atlantic Geoduck`, and *P. globosa* as `Mexican Geoduck`; each record also lists `Clam, Geoduck` as a market name. This is U.S. market nomenclature, not Canadian naming law, but it establishes that an unqualified `geoduck` product term can span distinct species in the global seafood market. The global catalog picker has no generic geoduck option or species-selection step. If this sole candidate were active, a bare `geoduck` query would return it by a phrase match inside `Pacific geoduck`, potentially making an unqualified product or recipe look species-resolved.

Hold until a supplied product or recipe explicitly identifies Pacific geoduck / panope du Pacifique and the picker can preserve the distinction for bare geoduck searches. This is a scope and search-boundary hold, not a claim that the Pacific species or its Canadian name is unverified. Do not use the generic clam candidate as a substitute: its existing ledger decision holds broad `clam / palourde` allocation because Québec commercial terms span multiple species and no product or recipe selects one.

## Name, alias, and taxonomy boundaries

| Term | Evidence and proposed treatment |
|---|---|
| `Pacific geoduck` / `panope du Pacifique` | Species-qualified display pair to use only if the candidate is later allocated. DFO’s current English/French profiles and the federal Pacific Fishery Regulations pair the species and current taxon. |
| `geoduck` | OQLF gives this as the English equivalent for its preferred French `panope`; DFO and the Canadian regulation use the English name for *P. generosa* in the Pacific-fishery context. Do not activate it as an alias while the other geoduck species remain outside the catalog: the current phrase picker would surface the Pacific row as the only result for this bare query. |
| `panope` | OQLF’s preferred Québec term maps to the panope species entry, and the proposed French display contains this phrase. Do not add a separate alias during the hold. OQLF’s 1979 entry shows *Panope generosa* as a Latin form; use current federal sources for the accepted *Panopea generosa* spelling. |
| `geoduck clam`, `Pacific geoduck clam`, `Clam, Geoduck` | These source-backed product/common-name strings include the broader `clam` term. Do not add them as aliases: the picker would make a bare `clam` query return this one species, while the generic clam candidate remains unresolved. Keep them as source wording only. |
| *Panopea generosa* | Current taxon for source provenance, not a proposed picker alias. |
| *Panope abrupta* | Do not use. The 2017 Canada Gazette correction says this was the wrong name for the harvested species and identifies *Panopea generosa* as correct. |
| `goeduck`, `goeyduc`, `gooeyduck`, `gweduc`, `king clam`, `elephant-trunk clam`, and other geoduck species | Do not add. OQLF’s dated variant spellings are not needed for Québec search coverage; U.S. FDA records show that other names and species must remain distinct from Pacific geoduck. |

No extra aliases are proposed. In particular, the eventual display itself contains `geoduck`, so omitting an explicit alias does **not** prevent the current picker from returning it for the broad query.

## Prior work and exact-key ownership

The active Section P checklist leaves “clam, oyster, cockle, and remaining shellfish identities” open. Its later clam review and the active ledger’s `ingredient-ref-clam` decision keep generic clam / palourde unallocated. A repository search of the plan, proposal archive, batches, active catalog, and ledger found no prior geoduck/panope review or allocation. The clam review mentions razor clam / couteau as a separate boundary, not geoduck.

Exact normalized keys were checked using the same rules as `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. References and aliases, form labels and match terms, legacy-candidate names and aliases, and ledger record IDs were checked separately.

| Exact key / ID checked | Active reference | Active form | Legacy candidate | Ledger ownership |
|---|---|---|---|---|
| `Pacific geoduck`, `geoduck`, `geoduck clam`, `Pacific geoduck clam` | None | None | None | No geoduck record or candidate. |
| `panope`, `panope du Pacifique`, *Panopea generosa*, *Panope generosa*, *Panopea abrupta* | None | None | None | No panope / *Panopea* record or candidate. |
| `clam`, `clams`, `palourde`, `palourdes` | No exact name or alias owner | None | None | `ingredient-ref-clam` is the existing held generic candidate; its decision says to hold pending a product or recipe target. |
| `ingredient-ref-pacific-geoduck`, `candidate-pacific-geoduck` | Neither ID exists | Neither ID exists | Neither ID exists | Neither record ID exists. |

Picker behavior was audited from `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`. It searches bilingual reference names and aliases plus attached form labels and match terms. It returns complete normalized phrase matches first, and only uses substring fallback if there are no phrase matches.

| Query | Current picker | Hypothetical result if only `Pacific geoduck / panope du Pacifique` were added |
|---|---|---|
| `geoduck`, `Pacific geoduck` | No result | One species-specific result; bare `geoduck` is a complete phrase inside the English display. |
| `panope`, `panope du Pacifique` | No result | One species-specific result. |
| `clam`, `palourde` | No result | No result if the row omits `clam` and the `geoduck clam` aliases above. |
| `geoduck clam` | No result | No result unless the broad `geoduck clam` wording is added as an alias; adding it also makes bare `clam` return the Pacific row. |

The concern is therefore specific: a species-qualified display would prevent the `clam` collision if kept free of `clam` wording, but would still make the unqualified `geoduck` query return a lone Pacific species. The row remains on hold until that picker scope is clear.

## Bundled recipe demand

The audit followed all 114 paths in `manifest.v1.json`, examined all 1,123 ingredient rows (`ingredientName`, `originalText`, and `ingredientRefId`), and searched parsed recipe text for `geoduck`, `geoduck clam`, `Pacific geoduck`, `panope`, `panope du Pacifique`, *Panopea generosa*, *Panopea abrupta*, `Atlantic geoduck`, `Mexican geoduck`, and related terms.

**Result: zero candidate-term hits in the 1,123 ingredient rows and zero hits in all 114 recipe files.** No row can be linked to Pacific geoduck, no recipe-derived measure or product state exists, and no recipe-scoped substitution can be proposed. The generic phrase “cooked meat or seafood, to taste” elsewhere in the bundle does not select geoduck or a species.

## Forms, measurements, conversions, substitutions, and recipe links

| Data family | Proposal |
|---|---|
| **Forms** | None. DFO and CFIA describe live geoduck in Canadian fishery/export contexts; that does not establish a recipe-requested kitchen form. Keep live-in-shell, shucked, siphon, body, frozen, cooked, and prepared products unmodeled until an exact recipe or target product identifies one. |
| **Density / unit mappings** | No evidence supports an ingredient-wide density or unit mapping. If later integrated, leave `defaultDensity` null and `unitMappings` empty. |
| **Measurements** | None. DFO reports biological whole-animal weight (about 1 kg average and up to 3 kg); it is not edible meat weight, a recipe serving, or a count-to-mass conversion. Do not store it as culinary quantity data. No kitchen portion, volume measure, or edible-portion basis is proposed. |
| **Conversions / yields** | None. No shell-on edible yield, siphon-to-body ratio, live-to-shucked conversion, raw-to-cooked conversion, or preparation yield is supported. |
| **Substitutions** | None. No source or bundled recipe supports geoduck ↔ generic clam, surf clam, scallop, or another seafood as a global or contextual replacement. |
| **Recipe links** | None. All 114 bundled recipes were scanned; no exact species/product request exists. |

## Recommended hold

1. Keep generic `clam / palourde` held under the existing `ingredient-ref-clam` ledger decision.
2. Do not create `ingredient-ref-pacific-geoduck` or a geoduck ledger allocation in this pass. The name pair and taxon are verified, but a bare `geoduck` picker query would surface the Pacific species alone while current seafood nomenclature includes other geoduck species.
3. Do not add `geoduck clam`, `Pacific geoduck clam`, or `Clam, Geoduck` as aliases; they would cause bare `clam` to return the Pacific row and blur the held generic clam boundary.
4. Reopen after a recipe or supplied product identifies Pacific geoduck / panope du Pacifique and the picker can expose the species scope without assigning bare `geoduck` to this sole result.
5. When reopened, keep the candidate identity-only unless separate recipe/product evidence supports a form or quantity. No measure, conversion, yield, or substitution follows from the fishery and nomenclature sources in this review.

## Sources

Sources were accessed or rechecked on 2026-10-12. New source IDs `WP04-SECTIONP-GEODUCK-20261012-S01` through `S08` were checked for collision against the ledger and proposal/batch archive; none was already assigned.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-GEODUCK-20261012-S01** | Fisheries and Oceans Canada, [Geoduck clam (*Panopea generosa*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/geoduck-clam-panope-pac-eng.html) | Current English profile pairs Geoduck Clam with *P. generosa*, describes the commercial British Columbia fishery, and says most Canadian harvest is exported live. Its biological weight estimates are not food portions or edible yields. |
| **WP04-SECTIONP-GEODUCK-20261012-S02** | Pêches et Océans Canada, [Panope du Pacifique (*Panopea generosa*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/geoduck-clam-panope-pac-fra.html) | French profile modified 2026-06-10. Supports the Québec-facing species name and taxon; it directly says the species is called “Geoduck” in English. Commercial live shipment is context only, not a recipe form or portion. |
| **WP04-SECTIONP-GEODUCK-20261012-S03** | Department of Justice Canada, [Pacific Fishery Regulations, 1993, Schedule I](https://laws-lois.justice.gc.ca/eng/regulations/SOR-93-54/page-5.html) / [Règlement de pêche du Pacifique (1993), annexe I](https://laws-lois.justice.gc.ca/fra/reglements/DORS-93-54/section-sched944892.html?txthl=nom) | Current Canadian Pacific-regional schedule pairs `Geoduck` / `Panope du Pacifique` with *P. generosa*. This is regional federal nomenclature, not a claim that generic clam means geoduck. |
| **WP04-SECTIONP-GEODUCK-20261012-S04** | Office québécois de la langue française, [panope (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059023/panope) | Preferred Québec term `panope`; English `geoduck`; entry last updated 1979. Its older Latin spelling is not used as the current taxon; federal sources support *P. generosa*. |
| **WP04-SECTIONP-GEODUCK-20261012-S05** | CFIA, [Vietnam — Export requirements for fish and seafood](https://inspection.canada.ca/en/exporting-food-plants-animals/food-exports/requirements-library/vietnam-fish-and-seafood?wbdisable=false) | The current destination-specific requirements name live `Geoduck Clam (Panopea generosa)` from Canadian waters. Supports Canadian commercial product relevance only; it does not establish a universal form or all-market naming rule. |
| **WP04-SECTIONP-GEODUCK-20261012-S06** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Canadian Fish List/common-name role and that names may be prescribed by applicable Canadian legislation. Used as naming-policy context; no unobserved Fish List search result is claimed here. |
| **WP04-SECTIONP-GEODUCK-20261012-S07** | U.S. Food and Drug Administration, [*Panopea generosa*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Panopea_generosa&set=SeafoodList), [*P. bitruncata*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Panopea_bitruncata&set=SeafoodList), and [*P. globosa*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Panopea_globosa&set=SeafoodList) | Current U.S. Seafood List identifies Pacific, Atlantic, and Mexican geoduck species, respectively, and lists `Clam, Geoduck` as a market name. This supports the global picker ambiguity only; it is not Canadian labeling authority. |
| **WP04-SECTIONP-GEODUCK-20261012-S08** | Canada Gazette, [2017 amendment correcting the Pacific geoduck scientific name](https://faune-especes.canada.ca/registre-especes-peril/virtual_sara/files/orders/g2-151091.pdf) | Explains that *Panope abrupta* was an incorrect fossil-species identification for this harvested geoduck and corrects the name to *Panopea generosa*. Taxonomy correction only. |

## Refreshed live-worktree snapshot

Counts and exact-byte hashes below reflect the live worktree read on 2026-10-12. The recipe corpus digest follows `manifest.v1.json` order and hashes each relative path, a NUL byte, its exact recipe-file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,265 references | `9ba32a8390b08dc51e58febd93489f51ec74be85468efb3eeb4e699ad1f15cf4` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,574 records; 5,534 source entries; 4,570 distinct source IDs | `4de44380aa8c51109e4e99052ac3410e8bec8a3bc23f53f6874b765e9ae2c0b3` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

No tests or emulator checks apply to this proposal-only review.
