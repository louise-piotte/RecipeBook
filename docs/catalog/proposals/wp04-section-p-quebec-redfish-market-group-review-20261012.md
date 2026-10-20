# WP04 Section P — Québec redfish / sébaste du Québec market-group review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** identity, market-group, picker, catalog-ownership, and recipe-demand review.
- **Status:** integrated by root on 2026-10-12 as `ingredient-ref-quebec-redfish`; see `docs/catalog/batches/wp04-section-p-quebec-redfish-identity-integration-20261012/README.md`.
- **Recommendation:** accepted and integrated as one identity-only `PROTEIN` row for the Québec *Sebastes* market group, displayed **Québec redfish / sébaste du Québec**. This is a regional group identity, not an assertion that one species is present in every product: OQLF says Québec catches include *S. marinus*, *S. fasciatus*, and *S. mentella* (with *S. mentella* dominant); MAPAQ’s 2026 seafood brochure reports current Québec landings under `SÉBASTE`; and a current Québec retailer lists frozen Gaspésie redfish fillets. The English display is a transparent localization: OQLF pairs `sébaste` with `redfish`, while the French regional qualifier is attested in Québec market wording.
- **Boundary:** keep species-level identities such as Acadian redfish, deepwater/Atlantic redfish, and Pacific Ocean Perch distinct. Do not add bare aliases `redfish`, `sébaste`, `ocean perch`, `rosefish`, `poisson rouge`, or `perche de mer`; the first two will still retrieve the qualified market-group display as complete-word matches. Do not infer a species from an unqualified retail product.
- **Integration boundary:** root added the identity reference and ledger evidence record. The product package amounts remain source notes; no form, recipe link, active measure, conversion, yield, or substitution was added. No app tests or emulator checks were run because this change only adds database JSON data.

## Open-checklist fit and prior-work boundary

The live Section P checklist still has open work for remaining fish identities and vernacular fish names. At the pre-integration snapshot, this **Québec regional market group** had no active catalog row or focused review. Integration does not reopen the species-specific Pacific ocean perch hold or the red-hake review.

The nearest prior packet is `wp04-section-p-pacific-ocean-perch-picker-boundary-review-20261012.md`. That review considered *Sebastes alutus* and held a species-specific row because a bare `sébaste` or `ocean perch` query could otherwise present one Pacific species as the only answer. This review asks a different question: whether the *generic Québec-caught redfish group* has an identity that can responsibly serve a generic `redfish` / `sébaste` search. OQLF describes *Sebastes* sp. as a Québec edible-fish market name and enumerates multiple locally caught species; it is therefore a group boundary, not another species row. The Pacific Ocean Perch candidate remains held and is not included in this proposed group.

The Section P plan and current proposal/batch archive were checked for an existing Québec redfish group decision. Prior documents mention redfish only as overlapping naming evidence or as a name excluded from other species rows; none allocates a generic Québec redfish reference. The current open plan also retains broader fish-species and regional-terminology work.

## Candidate identity and scope

| Proposed ID | Category | English display | fr-CA display | Additional aliases | Catalog scope |
|---|---|---|---|---|---|
| `ingredient-ref-quebec-redfish` | `PROTEIN` | **Québec redfish** | **sébaste du Québec** | None | Québec-market *Sebastes* group as sold from the estuary and Gulf of St. Lawrence fisheries; not one taxon or an all-genus crosswalk. |

OQLF’s edible-fish entry assigns preferred Québec French `sébaste`, gives the broader taxonomic identity *Sebastes* sp., and lists English `redfish`, `rosefish`, and `ocean perch`. It notes that Québec catches include *S. marinus*, *S. fasciatus*, and *S. mentella*, with *S. mentella* accounting for about 90% in the entry’s 2012 snapshot. MAPAQ’s 2026 seafood-industry brochure uses `SÉBASTE`, reports 653 tonnes and $557,171 in preliminary 2025 Québec landings, and describes the fish as caught in the Gulf of St. Lawrence. A current Québec retailer uses `Filets de sébaste sauvage du Québec` for a Gaspésie fishery product [S01–S03, S06]. Together these support a regional consumer-market group, while leaving the species of a particular fillet unasserted.

The English display `Québec redfish` localizes the OQLF-supported English name `redfish` with the Québec qualifier used in the French market label. No Québec government English product heading was located, so treat the regional English phrasing as a paired catalog display, not a quoted regulatory label. Keep the source-exact generic terms `redfish` and `sébaste` out of alias arrays: they occur as complete words in the displayed group names and already retrieve that group through the picker.

## Taxon and product boundaries

- The proposed row represents the regional *Sebastes* market group described by OQLF and MAPAQ. The relevant local catch sources name *S. mentella*, *S. fasciatus*, and *S. marinus*; DFO’s current Gulf redfish material identifies *S. mentella* and *S. fasciatus* as key managed species. This does not make those species synonyms or interchangeable recipe ingredients.
- Do not attach one species name to the generic Québec retail product. A retailer’s unqualified `sébaste` / `redfish` label is not sufficient to identify *S. mentella*, *S. fasciatus*, or *S. marinus* individually.
- Keep species-specific CFIA names such as `Acadian Redfish / Sébaste Acadien` and `Redfish / Sébaste` for *S. mentella* within their own source-taxonomy scope. CFIA also uses `Redfish` and `Sébaste` for Pacific *Sebastes* species and other taxa. Do not use CFIA’s individual species rows as evidence that every group-labeled Québec product is one of those species [S04–S05].
- Keep the held Pacific Ocean Perch (*S. alutus*) outside this Québec group. Also exclude other Pacific rockfish, Pacific Snapper, Atlantic rosefish and non-*Sebastes* rows carrying the English label `Redfish` in the CFIA list.
- OQLF says the terms `poisson rouge` and `perche de mer` were not retained for Québec fish-product marketing. Do not add those, `rosefish`, `ocean perch`, `sébaste acadien`, or `sébaste atlantique` as aliases. The latter two are species qualifiers, not generic regional-market names.
- The Québec retailer product is frozen fillets. A local producer also sells seasoned canned `sébaste`; treat that as a preserved, composite product, not a same-fish form or a universal canned-fish conversion [S07]. Do not add fillet, frozen, canned, or seasoned forms based on one product page.

## Exact ownership and snapshot

Pre-integration snapshot read from the live worktree on 2026-10-12. Hashes cover exact bytes at the time of review. The recipe-corpus digest iterates manifest `recipeFiles` in stored order and hashes each relative path, a NUL byte, exact recipe-file bytes, and another NUL byte.

| Artifact | Count / kind | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,284 references | `a02fbf9597c145dfe7a567c3323bccdd1bc10898dac2f531cc77ba7780027bfe` |
| `ingredient-forms.v1.json` | 97 forms | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,591 records; 5,679 source entries; 4,710 distinct source IDs | `5a2ccde48f9c00c762008af20bb8bd30b600e0464d74e6b3bf997c3819df27a0` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Exact-key ownership uses `normalizeIngredientSearchKey` from `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. The audit covered reference displays and aliases, form labels and match terms, legacy candidate names and aliases, ledger record IDs, and allocation of the proposed IDs.

| Name or allocation | Active reference / form / legacy owner | Ledger ownership |
|---|---|---|
| `Québec redfish`, `sébaste du Québec`, `redfish`, `sébaste`, `Sebastes spp.` | No exact active reference, form label/match term, or legacy candidate owner at the pre-integration snapshot. | The group-level record was added during integration. |
| `S. mentella`, `S. fasciatus`, `S. marinus`, `Acadian redfish`, `sébaste acadien` | No exact active reference/form/legacy owner. | No species-specific local-catch identity allocation. These taxa remain separate from the group record. |
| `ingredient-ref-quebec-redfish`, `candidate-wp04-quebec-redfish` | The reference ID was unallocated at the pre-integration snapshot; the unused candidate ID remains inactive. | The reference ID is now the accepted ledger record. |
| `ingredient-ref-pacific-ocean-perch` | No active reference; this remains a species-specific **hold**, not an active group owner. | The associated proposal/plan boundary is preserved; no promotion is implied. |
| Source IDs `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01` through `S07` | They were new when this packet was created. | All seven were added to the accepted `ingredient-ref-quebec-redfish` ledger record. |

Nearby active identities are not this group: `red hake / merluche-écureuil` is *Urophycis chuss*; `sablefish / morue charbonnière` is *Anoplopoma fimbria*; Pacific, Atlantic, and Greenland halibut references have separate species scopes. The integration does not broaden those rows or promote the Pacific Ocean Perch hold.

## Picker behavior and accepted effect

The picker normalizes display terms and aliases, returns complete normalized word-phrase matches first, then falls back to substring matching only when there are no complete-phrase results. At the pre-integration snapshot the new terms had no active result. After integration, complete normalized phrase matches in the qualified displays make the group row the result for the names below; no bare alias is stored. This expected behavior follows the picker code and static data check; no app runtime check was run.

| Query | Pre-integration picker | Accepted display match | Behavior and limit |
|---|---|---|---|
| `redfish` | No result | One result: **Québec redfish / sébaste du Québec** | Complete word-phrase match in the English display; `redfish` is not a stored alias. The result is a Québec multi-species market group, not a species row. |
| `sébaste`, `sebaste` | No result | One result: **Québec redfish / sébaste du Québec** | Complete word-phrase match in the French display; accent folding handles the unaccented query. No bare alias is stored. |
| `Québec redfish` | No result | One result: **Québec redfish / sébaste du Québec** | Complete phrase. |
| `sébaste du Québec` | No result | One result: **Québec redfish / sébaste du Québec** | Complete phrase. |
| `ocean perch`, `Acadian redfish`, `sébaste acadien`, `sébaste atlantique`, `poisson rouge`, `S. mentella`, `S. fasciatus` | No result | No result | These are not aliases. Keep species-level or unretained labels distinct. |

`redfish` and `sébaste` are broad query words, but the accepted match is deliberately the **group-level** Québec market identity supported by the Québec terminology and catch sources. The display names carry the regional qualifier. The query does not silently select *S. mentella* or another single taxon. This differs from the prior Pacific ocean perch concern: its held row was one *S. alutus* species under generic `sébaste` / `ocean perch`, while the integrated row represents the regionally marketed group containing several local *Sebastes* species. CFIA’s broader cross-Canada labels still limit the claim: this entry must not be treated as an all-species lookup for every fish sold as redfish.

## Full bundled-recipe demand scan

All 114 recipe paths in the package manifest, all 1,123 `ingredients[]` rows, and every string in the complete recipe JSON files were scanned for `redfish`, `red fish`, `Québec redfish`, `sébaste` / `sebaste`, `sébaste du Québec`, *Sebastes*, *S. mentella*, *S. fasciatus*, *S. marinus*, `Acadian redfish`, `deepwater redfish`, `sébaste acadien`, `sébaste atlantique`, `ocean perch`, `poisson rouge`, and `perche rose`. **There were zero matching ingredient rows and zero matching recipe files.** No recipe link or relink is supported.

The catalog’s other fish lines do not imply this identity: the optional `cooked meat or seafood, to taste` line is unqualified; fish sauce is a condiment; salmon fillets and tuna have separate references; no recipe requests generic redfish, sébaste, rockfish, or a Sebastes species. No quantity, product state, cooking method, or substitution can be derived from the recipe bundle.

## Measurement and substitution limits

- The current Québec retailer lists a frozen Gaspésie product as **454 g** of fillets and estimates **about 3–4 portions** [S06]. That is a package-specific estimate, not a source-supported default serving, standard fillet mass, portion conversion, or yield. Do not calculate or activate a per-serving mass from it.
- MAPAQ’s 653 tonnes and $557,171 are 2025 fishery totals, not kitchen quantities [S02]. DFO quota and landing figures are commercial management data, not measures [S03].
- A current Chasse-Marée product is a **175 g** seasoned can of sébaste with sunflower oil, salt, dill, mustard seed, and spices [S07]. This documents one prepared product. It does not support a global canned, oil-packed, or seasoned form, and the quantity is not a recipe measure.
- No reviewed source establishes density, whole-fish edible yield, thaw/drain loss, fillet-count mapping, or a general conversion among fresh, frozen, cooked, canned, or flaked states. Add no active density, unit mapping, form, package yield, or conversion.
- No source supports a directed redfish-to-cod, haddock, halibut, or other fish substitution with recipe context and a ratio. Similar descriptions of mild or flaky flesh do not establish an app substitution. Add no global or contextual substitution.

## Accepted integration delta

Integration adds one `PROTEIN` market-group reference and one verified identity ledger record keyed to the same ID. Keep the row group-scoped in the ledger: `Québec commercial *Sebastes* group marketed as redfish / sébaste; the local catch/product label does not determine one species.` Keep *S. mentella*, *S. fasciatus*, and *S. marinus* as distinct biological taxa and do not transfer species-level CFIA labels to an unqualified product.

```json
{
  "id": "ingredient-ref-quebec-redfish",
  "nameFr": "sébaste du Québec",
  "nameEn": "Québec redfish",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "PROTEIN"
}
```

Add no forms, recipe links, package yields, measures, conversions, or substitutions. Preserve the 454 g / approximately 3–4 portion note and the 175 g seasoned-can description only as source-specific observations if the coordinator wants those product details in the ledger. Do not allocate any species name or alias from the CFIA multi-species result set.

## Sources

Sources were accessed on 2026-10-12. Direct URLs are included so a coordinator can recheck source scope. Naming sources, fishery data, retail product evidence, and prepared-product evidence answer different questions.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01** | OQLF GDT, [sébaste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Preferred Québec edible-fish term; maps to *Sebastes* sp. and English `redfish`, `rosefish`, and `ocean perch`; reports three different species in Québec catches and *S. mentella* at about 90% in its 2012 entry. Terminology and historical catch composition, not current retail availability or an individual product taxon. |
| **WP04-P-QUEBEC-REDFISH-GROUP-20261012-S02** | MAPAQ, [Poissons et fruits de mer du Québec à l’international (2026 brochure PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/BR_brochure-poissons-fruits-mer-qc-int_MAPAQ.pdf) | 2026 Québec government brochure reports preliminary 2025 `SÉBASTE` landings of 653 tonnes / $557,171 (data consulted January 2026) and describes the fish as from the Gulf of St. Lawrence. Group-level current Québec industry context; the brochure does not identify each landed fish to species. |
| **WP04-P-QUEBEC-REDFISH-GROUP-20261012-S03** | DFO, [Unit 1 Redfish Management Plan 2026–2027](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-33-fra.html) | Current Gulf commercial management plan, with fishing access and allocations for the 2026–2027 season. Management-unit evidence; do not read TAC or quota as food product availability, identity, or a kitchen measure. |
| **WP04-P-QUEBEC-REDFISH-GROUP-20261012-S04** | Fisheries and Oceans Canada, [second year of the commercial Redfish fishery (2025–2026)](https://www.canada.ca/en/fisheries-oceans/news/2025/06/fisheries-and-oceans-canada-announces-details-for-second-year-of-commercial-redfish-fishery.html) | States the Gulf has two key commercial redfish species, *S. mentella* and *S. fasciatus*, which differ in depth distribution. Current-fishery group evidence, not a product label or proof that a specific retail package contains either species alone. |
| **WP04-P-QUEBEC-REDFISH-GROUP-20261012-S05** | CFIA Fish List, [redfish query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Redfish) | Canadian fish-label list shows `Redfish` assigned across multiple *Sebastes* taxa (including Pacific and Atlantic species) and other taxa; entries pair different species with names including `Sébaste`, `Sébaste Acadien`, and `Sébaste à Longue Mâchoire`. This is why the proposed row is a local market group and does not claim one CFIA taxon. List page dated 2023-09-18. |
| **WP04-P-QUEBEC-REDFISH-GROUP-20261012-S06** | Réserve Locale / La Gaspésienne, [Filets de sébaste sauvage du Québec (454 g)](https://reservelocale.ca/products/sebaste-sauvage-du-quebec-454g) | Current Québec retailer lists a frozen Gaspésie fishery product under `Filets de sébaste sauvage du Québec`, 454 g, estimated at about 3–4 portions. Product-specific name/amount; no binomial, general portion standard, or fillet conversion. |
| **WP04-P-QUEBEC-REDFISH-GROUP-20261012-S07** | Chasse-Marée, [Sébaste à l’aneth et moutarde](https://chassemaree.ca/products/sebaste-a-laneth-et-moutarde) | Québec producer lists a 175 g seasoned canned sébaste product and its ingredients. This is prepared-product evidence, not a universal canned form or a general identity measure. |

## Recommendation

**Accepted and integrated:** `ingredient-ref-quebec-redfish` is the group-level row shown above. Québec terminology and current government/retail evidence support a local *Sebastes* market group, and the current picker displays its region-qualified names for generic `redfish` / `sébaste` queries without selecting one species. Keep the CFIA species-name boundaries, the held Pacific Ocean Perch candidate, the current frozen-fillet package amount, and the seasoned-can product state as separate evidence. No recipe link, alias, form, measure behavior, conversion, yield, or substitution was added.
