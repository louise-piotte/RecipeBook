# WP04 Section P — Pacific herring identity boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, picker, source-portion, and recipe-demand review.
- **Disposition:** Recommend one identity-only PROTEIN reference for Pacific herring / hareng du Pacifique (*Clupea pallasii*). Add no aliases. Keep Atlantic herring (*C. harengus*), unqualified herring / hareng, Pacific herring roe, and preservation products separately scoped. No form, density, unit mapping, conversion, yield, substitution rule, or recipe link is proposed.
- **Worktree scope:** This proposal file only. No catalog or ledger JSON, recipe, plan, roadmap, generated code, or other file was changed. No tests were run.

## Why this is a distinct open gap

The Section P plan has an open finfish and regional-fish checklist. The existing Atlantic herring row is species-scoped to *Clupea harengus*. The earlier finfish follow-up notes Pacific herring (*C. pallasii*) in the CFIA Fish List and withholds unqualified herring / hareng, but it neither allocates the Pacific species nor proposes a dedicated review. Among herring fish identities, the current ledger and active catalog contain only Atlantic herring. This packet resolves that adjacent species identity while keeping the broad name unresolved.

Pacific herring is a commercially important Canadian Pacific fish. DFO’s current 2025–2026 management plan describes food-and-bait fisheries as well as roe and spawn-on-kelp fisheries. This establishes a distinct Canadian fish identity; it does not establish recipe demand or turn the roe and spawn products into forms of fish flesh.

## Bounded recommendation

Add one species-scoped identity:

| Candidate ID | Category | English display | fr-CA display | Aliases | Species scope |
|---|---|---|---|---|---|
| ingredient-ref-pacific-herring | PROTEIN | **Pacific herring** | **hareng du Pacifique** | None | *Clupea pallasii* |

The bilingual display is supported by the current DFO English/French management plan and TERMIUM Plus, which identifies hareng du Pacifique as the standardized commercial French name recommended by DFO and the fisheries terminology committee. CFIA’s Fish List identifies *C. pallasii* as Pacific Herring, while its French field is blank for that qualified row. Use DFO and TERMIUM for the French display; do not copy the unqualified French Hareng listing into the new identity.

Do not add Pacific herring roe, herring eggs, spawn-on-kelp, kipper, bloater, or other product-state terms as aliases or forms on this fish reference. Keep the active Atlantic herring identity unchanged. Do not add bare herring / hareng or scientific nomenclature, including Clupea pallasii and Clupea pallasi, as aliases.

## Prior work and current ownership

The exact-key audit mirrors normalizeIngredientSearchKey in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, fold œ / æ / ß and ampersands, remove combining marks, and normalize punctuation and spaces. Exact candidate keys were checked against active reference names and aliases, active form labels and match terms, legacy-candidate names and aliases, and ledger record IDs.

| Candidate key or ID | Active reference owner | Form owner | Legacy owner | Ledger owner |
|---|---|---|---|---|
| Pacific herring | None | None | None | None |
| hareng du Pacifique | None | None | None | None |
| Clupea pallasii / Clupea pallasi | None | None | None | None |
| ingredient-ref-pacific-herring | None | None | None | None |
| WP04-PACIFIC-HERRING-IDENTITY-20261012-S01 through S05 | Not an ingredient key | Not applicable | Not applicable | Prefix and IDs absent before this packet |

The exact existing bilingual owner is ingredient-ref-atlantic-herring: Atlantic herring / hareng de l’Atlantique. Its verified ledger record cites the English and French DFO Atlantic-herring plans and records measurementState and substitutionResearchState as not_yet_researched. There is no active form attached to that row. There is no Pacific-herring record or candidate in the live ledger, and no legacy candidate for the proposed name or ID. The prior finfish proposal’s CFIA herring query is reused below as R01 rather than issued under another source ID.

### Picker-query behavior

The current IngredientReferenceSearchIndex matches complete word phrases across reference names, aliases, and attached form terms before falling back to substring matches. It does not search scientific names unless one is stored as a term.

- Today, a query for herring returns only ingredient-ref-atlantic-herring, because herring occurs in its English display. A query for hareng likewise returns only that row through its French display. Neither is a stored bare alias.
- Today, Pacific herring, hareng du Pacifique, and Clupea pallasii return no active row.
- With the proposed row, Pacific herring and hareng du Pacifique return the new identity. Broad herring and hareng queries return both Pacific and Atlantic identities. This exposes the species ambiguity without assigning the broad term to either species.
- Clupea pallasii will remain unsearchable as a picker phrase because scientific names are not proposed aliases.

CFIA’s Fish List and Canadian Grade Compendium establish the boundary: the Fish List has multiple herring-named taxa, and the Compendium defines herring as fish of either *C. harengus* or *C. pallasii*. Those sources do not support treating one species as the generic identity. The generic phrase remains unallocated.

## Full bundled-recipe audit

The manifest lists 114 recipes and 1,123 ingredient rows. Each manifest path, all ingredient rows, and the complete UTF-8 JSON text were scanned for Pacific herring, hareng du Pacifique, *C. pallasii*, *C. pallasi*, and the broad terms herring / hareng. The audit found **zero matching ingredient rows and zero matching recipe files**. There is no direct demand for this species, its roe, or its products, so no recipe link is supported.

The existing salmon-fillet and tuna recipe lines do not identify herring. Generic cooked-meat-or-seafood wording does not establish fish species and is not linked. Fish sauce is a condiment and provides no fish-flesh demand.

## Measurements and numeric evidence

Health Canada’s Canadian Nutrient File serving page for food code 3018, “Fish, herring, pacific, raw / Poisson, hareng, pacifique, cru,” reports these source-specific portions:

| CNF observation | Reported value | Use and limit |
|---|---:|---|
| One fish, source-labeled 700 g | 378.6 g | Preserve only as a CNF count-weight observation with the raw-food description. Do not turn it into a general whole-fish conversion or an ingredient-wide yield. |
| One fillet | 184.0 g | Preserve only as a source-specific raw-fish portion; no standard fillet size or recipe default follows. |
| One food-guide serving | 90.0 g | Source-specific nutrition-guide serving only; not a recipe portion recommendation. |
| Total refuse | 46% | Retain as source context only. Do not activate an edible-yield conversion or derive a general yield from it. |

These observations can be recorded on a future ledger record as published portions with their exact CNF food description and source basis. They do not justify an active kitchen measure, form, conversion, or yield.

## Aliases, forms, density, mappings, conversions, and substitutions

- **Aliases:** None. In particular, do not add bare herring / hareng, roe terms, product-state names, or scientific nomenclature as aliases.
- **Forms:** None. CNF’s raw descriptor is measurement context, not a catalog form. Do not attach fillet, fresh, raw, smoked, dried, salted, canned, pickled, or roe forms without an exact product or recipe request.
- **Density and unit mappings:** Leave defaultDensity null and unitMappings empty. The CNF record supplies count/portion observations, not a general g/ml density or volume-to-mass mapping.
- **Conversions and yields:** None. Do not derive a fish-to-fillet, whole-to-edible, raw-to-cooked, or preservation conversion from the CNF portions or refuse percentage.
- **Substitutions:** No supported Pacific-herring-to-Atlantic-herring, capelin, sardine, or other-fish substitution was identified in the reviewed sources. If integrated, record no supported substitute; add no global or contextual substitution rule.
- **Recipe links:** None. The full corpus scan found no species or product demand.

## Recommended integration delta

1. Add ingredient-ref-pacific-herring in PROTEIN with the bilingual display pair above, no aliases, null default density, and an empty unitMappings list.
2. Add a verified ledger record for *Clupea pallasii*. Preserve the CNF portions only as source-specific observations, with the raw food state, 46% refuse caveat, and no runtime conversion or yield. Record no supported substitute.
3. Leave the active Atlantic herring identity, all preserved-fish and roe boundaries, forms, recipes, and substitution rules unchanged.

## Sources

Online sources were accessed on 2026-10-12. R01 is reused from the prior proposal’s source ID; the new S01–S05 IDs are proposal-local and were not present in the ledger before this packet.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **R01 — WP04-FINFISH-FOLLOWUP-20261009-S09** | CFIA Fish List, [herring query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Herring) | Shows *Clupea pallasii* as Pacific Herring and also lists Herring / Hareng for multiple herring taxa. The Pacific-qualified row has no French label. Canadian fish-name evidence; no culinary equivalence. |
| **WP04-PACIFIC-HERRING-IDENTITY-20261012-S01** | Fisheries and Oceans Canada, [Pacific herring 2025–2026 management plan](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/herring-hareng-ifmp-pgip-sm-eng.html) | Identifies Pacific Herring as *C. pallasii* and describes Canadian fisheries for food/bait, roe, and spawn-on-kelp. Current management and identity evidence; no recipe or kitchen-conversion guidance. |
| **WP04-PACIFIC-HERRING-IDENTITY-20261012-S02** | Pêches et Océans Canada, [Hareng du Pacifique 2025–2026](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/herring-hareng-ifmp-pgip-sm-fra.html) | Uses hareng du Pacifique with *C. pallasii* in the French plan. Its overview paragraph has a version-label inconsistency, so this source is cited for the name/taxon pairing only; it does not support a recipe form or measurement. |
| **WP04-PACIFIC-HERRING-IDENTITY-20261012-S03** | Government of Canada Translation Bureau, [TERMIUM Plus: hareng du Pacifique](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=HARENG+PACIFIQUE) | Gives Pacific herring / hareng du Pacifique for *C. pallasii* and identifies the French trade name as standardized by the commercial-fisheries terminology committee. Terminology evidence only. |
| **WP04-PACIFIC-HERRING-IDENTITY-20261012-S04** | Health Canada, [Canadian Nutrient File serving portion, food code 3018](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3018) | Reports the listed raw-fish portions and 46% total refuse. Source-specific food-composition observations only; no recipe serving, active measure, edible-yield rule, or density. |
| **WP04-PACIFIC-HERRING-IDENTITY-20261012-S05** | CFIA, [Canadian Grade Compendium: Volume 8 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-8) | Defines herring for the Canadian fish-grade rules as *C. harengus* or *C. pallasii*. This supports the generic-name boundary, not an equivalence between the two species. |

Reused prior work: [WP04 finfish species follow-up](wp04-finfish-species-followup-20261009.md) already integrated Atlantic herring and kept generic herring unresolved. Its CFIA herring query is reused as R01. The [preserved-fish product-state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) and [roe boundary review](wp04-tobiko-masago-roe-boundary-review-20261009.md) remain separate; this proposal makes no decision to activate preserved fish or roe identities.

## Refreshed snapshot

Counts and hashes below reflect the live worktree read on 2026-10-12. File hashes cover exact bytes. The recipe-corpus digest iterates manifest.recipeFiles in stored order and hashes each relative path, a NUL byte, its exact file bytes, and a NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,264 references | c373d1cf4f192b0cfdaf8f8095b8642a5bd6d55cd50be822ef81ed3060914d39 |
| ingredient-forms.v1.json | 94 forms | 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b |
| legacy-import-identities.v1.json | 66 candidates | bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f |
| research-ledger.v1.json | 1,573 records; 5,526 source entries; 4,562 distinct source IDs | f0caa10408e515af8bc74cf7a158d73f7f3b5ad8873d1f5c9d0622664bd14965 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

No test or emulator run is applicable to this proposal-only work.
