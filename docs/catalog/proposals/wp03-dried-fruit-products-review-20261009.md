# WP03 Section M dried-fruit product identities

- **Reviewed:** 2026-10-09
- **Status:** proposal only. This file is the sole change in this packet; the shared catalog, recipes, ledger, plan, roadmap, code, tests, and other proposals were not changed.
- **Scope:** dried apricot, dried fig, dried prune/pruneau, dried dates, raisins/sultanas, dried currants, and dried tart cherries. Barberry and goji are recorded as holds.
- **Sources accessed:** 2026-10-09. Government of Canada food specifications, OQLF terminology, and Codex standards support product terminology and boundaries. No measurement or substitution evidence is activated.

## Recommendation

Carry forward six identity-only product recommendations, all in NUT_SEED_AND_DRIED_FRUIT: reuse the legacy dried-apricot and prune IDs; add dried fig, dried dates, dried currants, and dried tart cherries; and consider source-backed sultana terms only as alias candidates on the existing raisins identity. These are coordinator candidates, not accepted catalog edits.

Use the exact FR-CA and English display pairs below. Only the listed terms are candidates for later alias review; none is activated here. Review normalized search collisions before integration. Keep fresh fruit identities separate. Do not add forms, measurements, conversions, yields, substitutions, or recipe links.

## Refreshed working-tree snapshot

The snapshot was refreshed immediately before this proposal was written. The recipe digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe file bytes, and a NUL byte, in manifest order. Ledger source-entry count is the number of entries in records[].sources[]; distinct IDs are the union of sourceId values there and IDs listed by unitConversions[].sourceIds[].

| Artifact | Live count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 618 references | 87220c5008d76b7f89f805e4cebe67d05e3729b9f8e5ae17c878c03763bf31d3 |
| ingredient-forms.v1.json | 33 forms | 275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| research-ledger.v1.json | 790 records; 1,288 source entries; 1,096 distinct source IDs | 97570bc5586dc066e7b2afe58362b4c79f6ad543c47fd1e2cae3f5b466e5fdfb |
| legacy-import-identities.v1.json | 88 candidates | 048ab0b0d99447ac3374af17ef6aa14681aa06f72fbe6c1139de78beffa984c8 |
| Manifest-listed recipe corpus | 114 recipes; 1,123 ingredient rows | 7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f |

## Current ownership and boundary audit

The live catalog has active generic identities for fresh apricot, fig, dates, grapes, plum, cherries, black currant, and red currant. It separately has Medjool dates and raisins in NUT_SEED_AND_DRIED_FRUIT. The active French grape name is raisin; the active fresh plum name is prune. Do not map bare French raisin or bare English prune to the dried-product rows.

No active ingredient form matches these targets. Relevant live and legacy owners are:

| Product or adjacent identity | Current owner and state | Boundary for this proposal |
|---|---|---|
| Fresh apricot / abricot | ingredient-ref-apricot is active; its ledger identity state is verified. | Keep separate from dried apricot. |
| Dried apricot | Legacy ingredient-ref-dried-apricot is unreviewed; its ledger record is also unreviewed and has no sources. | Reuse this ID only if the coordinator accepts the product identity. |
| Fresh fig / figue | ingredient-ref-fig is active; its ledger identity state is verified. | Keep separate from dried fig. |
| Dried fig | No active or legacy identity owner; no matching ledger identity record. | New candidate ID is proposed below. |
| Fresh plum / prune | ingredient-ref-plum is active, with French display prune. | Do not use bare English prune as a dried-prune alias. |
| Dried prune / pruneau | Legacy ingredient-ref-prune is unreviewed; its ledger record is unreviewed. | Reuse this ID only with the dried-product display pair below; do not promote it as fresh plum. |
| Generic dates / dattes | ingredient-ref-dates is active. The separate ingredient-ref-medjool-dates identity is active without broad dates/dattes aliases. | Keep unqualified dates separate from explicit dried dates and Medjool dates. Do not reinterpret the unqualified recipe wording. |
| Raisins / raisins secs | ingredient-ref-raisins is active; its ledger identity state is verified and measurement state is blocked pending evidence. | Keep as the generic dried-grape identity. Consider sultana terms as candidates only; do not create a separate sultana identity in this packet. |
| Fresh grapes / raisin | ingredient-ref-grapes is active. | No bare French raisin alias on dried raisins. |
| Fresh black and red currants | ingredient-ref-black-currant / cassis and ingredient-ref-red-currant / groseille rouge à grappes are active; both ledger identities are verified. | Keep Ribes berry names distinct from dried Corinth grapes. |
| Fresh cherries / cerises | ingredient-ref-cherries is active with fresh/frozen/pitted wording; ingredient-ref-cherry is an unreviewed legacy duplicate of generic cherry. | Do not promote the legacy generic cherry row as a dried identity or alias dried cherries to fresh cherries. |

The live ledger has verified identity states for the active fresh fruit owners listed above. The Medjool-date record is verified for identity, with measurement state blocked pending evidence. There is no active form data for any candidate in this packet. No shared ledger evidence is added.

## Source-backed identity candidates

All candidates below are identity-only and use category NUT_SEED_AND_DRIED_FRUIT. Alias terms are review candidates, not approved aliases.

| Candidate ID | English display | FR-CA display | Alias candidates and boundaries | Sources |
|---|---|---|---|---|
| ingredient-ref-dried-apricot (reuse legacy) | dried apricot | abricot séché | dried apricots; abricots séchés. Do not alias apricot/abricot or infer a form from the fresh identity. | S01–S03 |
| ingredient-ref-dried-fig | dried fig | figue sèche | dried figs; figues sèches; figues séchées. Do not alias fig/figue. | S01, S04 |
| ingredient-ref-prune (reuse legacy) | dried prune | pruneau | dried prunes; pruneaux. Do not activate bare English prune, which can collide with fresh plum usage, or French prune, already owned by fresh plum. | S01, S05 |
| ingredient-ref-dried-dates | dried dates | dattes séchées | dried date; datte séchée. Keep generic dates/dattes and Medjool dates separate; do not link the unqualified dates recipe line to this candidate. | S01, S10 |
| ingredient-ref-raisins (retain active) | raisins | raisins secs | Conditional candidates: sultana, sultanas, sultana raisin(s), golden raisin(s), raisin de Smyrne, raisins de Smyrne. These name a golden/Smyrna type; expose them only if the coordinator accepts them as search aliases for the broader active raisins identity. Do not add French raisin, owned by fresh grapes. | S01, S06, S08, S09 |
| ingredient-ref-dried-currants | dried currants | raisins de Corinthe séchés | dried currant; raisin de Corinthe. Do not alias bare currant(s), cassis, groseille, or generic raisins. | S01, S07, S09 |
| ingredient-ref-dried-tart-cherries | dried tart cherries | cerises séchées acidulées | No alias proposed. The source names dried cherries and distinguishes sweet and tart/acidulées types; do not use dried sour cherries as an alias without terminology evidence. Keep apart from generic active cherries. | S01–S02 |

The dried-currant row is a distinct dried-grape product: OQLF identifies raisin de Corinthe with English dried currant, and Codex treats currants separately from its raisins standard. Neither fresh currant berries nor the active generic raisins identity should absorb it.

Sultana remains a named dried-grape type, not a separate identity recommendation. The Government of Canada specification describes golden raisins and sultanas as interchangeable terms; OQLF identifies raisin de Smyrne with the Sultana raisin. Because the active row represents raisins broadly, the terms remain conditional alias candidates pending coordinator review of the catalog's synonym scope.

## Recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned using originalText, ingredientName, and ingredientRefId. The scoped direct-demand set contains four lines in four recipes:

| Recipe and line | Ingredient wording | Current reference | Audit result |
|---|---|---|---|
| 024#1 | Medjool dates, pitted and chopped | ingredient-ref-medjool-dates | Existing explicit variety; retain. |
| 031#1 | Medjool dates | ingredient-ref-medjool-dates | Existing explicit variety; retain. |
| 058#2 | dates, pitted and chopped | ingredient-ref-dates | Generic wording; it does not say dried or Medjool. Retain the current generic owner. |
| 102#7 | raisins | ingredient-ref-raisins | Existing dried-grape identity; retain. |

No recipe line names dried apricot, dried fig, prune/pruneau, explicitly dried dates, dried currants, sultanas, or dried tart/sour cherries. The unqualified dates line is not evidence for a dried-date identity. These candidates therefore add catalog coverage without recipe relinking.

## Explicit holds and exclusions

| Item | Disposition | Boundary |
|---|---|---|
| Barberry and goji | Hold; no identity candidate. | This pass did not establish a product-specific bilingual pair or direct recipe demand suitable for a collision-reviewed catalog identity. Do not infer a food product identity from a plant or market name. |
| Generic and sweet dried cherries | Hold for a separate product decision. | This proposal covers the source-distinguished tart/acidulées product only. Do not make it an alias for the live generic fresh-cherry owner or assume it represents every dried cherry product. |
| Sultana as a separate identity | Hold. | The sources support a named type within dried grapes; this packet proposes conditional aliases on the active raisins owner, not a new identity. |
| Unqualified prune / pruneau boundaries | Hold alias expansion. | Keep English prune and French prune scoped to their live fresh-plum usage; use dried prune / pruneau for the proposed dried product. |
| Unqualified currant / groseille | Hold alias expansion. | Keep active black/red currants separate from dried currants, which are Vitis products. |
| Densities, mappings, forms, yields, conversions, substitutions, and recipe links | No proposal. | This review establishes identity terminology only. The active raisins and Medjool measurement states remain as recorded in the ledger. |

## Sources

Source IDs are local to this proposal and are not ledger entries. All online sources below were accessed 2026-10-09. The Government of Canada specifications support product categories and the dried-cherry distinction; OQLF sources support Québec French terminology and named-product boundaries; Codex supports the separate scope of raisins and dried currants.

| ID | Source and URL | Support used |
|---|---|---|
| S01 | Government of Canada, Department of National Defence, [Food Quality Specifications: Dried Fruits, English PDF](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-eng.pdf) | Dried apricots, prunes, cherries, currants, figs, dates, raisins, and golden raisins/sultanas as specified dried-fruit products; dried cherries include sweet and tart types. |
| S02 | Government of Canada, Department of National Defence, [Food Quality Specifications: Dried Fruits, French PDF](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-fra.pdf) | Product names including abricots séchés, cerises séchées, figues séchées, dattes séchées, raisins secs, raisins de Corinthe séchés; cherry types include sucrées and acidulées; dried prune wording includes prunes/pruneaux séchés. |
| S03 | OQLF, [fruit sec](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889578/fruit-sec) | FR-CA category vocabulary including raisins secs, pruneaux, dried figs, and dates; used as category terminology, not an alias for a fresh fruit. |
| S04 | OQLF, [figue sèche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10437379/figue-seche) | Direct English dried fig / FR figue sèche terminology. |
| S05 | OQLF, [pruneau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084075/pruneau) | Dried prune / pruneau terminology and the English prune ambiguity with fresh plum trade usage. |
| S06 | OQLF, [raisin sec](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084076/raisin-sec) | Dried grape terminology; discusses Sultana as a raisin type and Corinthe/Zante as a distinct small seedless type. |
| S07 | OQLF, [raisin de Corinthe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298833/raisin-de-corinthe) | English dried currant/currant and French raisin de Corinthe; identifies the dried Vitis product. |
| S08 | OQLF, [raisin de Smyrne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297130/raisin-de-smyrne) | English Sultana raisin/Sultana and French raisin de Smyrne terminology. |
| S09 | Codex Alimentarius, [Standard for Raisins CXS 67-1981](https://www.fao.org/input/download/standards/244/CXS_067e.pdf) | Scope for dried grapes consumed as raisins or sultanas and exclusion of dried currants. |
| S10 | Codex Alimentarius, [Standard for Dates CXS 143-1985](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B143-1985%252FCXS_143e.pdf) | Commercial dates can be dried or hydrated; supports keeping unqualified dates wording distinct from explicitly dried-date wording, without proposing a form or conversion. |

No independent bilingual review or normalized-key acceptance is claimed. The coordinator should resolve the conditional alias candidates and candidate IDs before any catalog integration.

