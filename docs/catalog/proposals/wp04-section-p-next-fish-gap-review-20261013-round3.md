# WP04 Section P — red king crab / crabe royal rouge picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only identity, product-boundary, picker, and recipe-demand review.
- **Disposition:** Integrated as a documented hold. No species-specific red king crab row, aliases, or ledger sources were added because broad picker names remain shared across taxa; see the [round-three integration note](../batches/wp02-wp03-wp04-round3-gap-review-integration-20261013/README.md).
- **Recommendation:** Hold the species-specific *Paralithodes camtschaticus* identity outside the active catalog. Although Fisheries and Oceans Canada (DFO) uses the qualified Québec French name **crabe royal rouge**, the shared picker would make broader **king crab**, **red king crab**, and **crabe royal** searches return this one species. CFIA assigns these names across multiple crab taxa, and a current Québec retail product is specified only as *Paralithodes* spp. Do not add a reference, legacy candidate, ledger record, alias, form, measure, recipe link, conversion, yield, or substitution.
- **Conditional identity shape for a later picker-capable review:** `ingredient-ref-red-king-crab`, category `PROTEIN`, English `red king crab`, Québec French `crabe royal rouge`, scoped to *P. camtschaticus*, with no aliases. This row is **not** recommended for activation under current search behavior.

## Scope and prior-work boundary

Section P remains open for crab species and picker boundaries. This review selects the red king crab candidate as a species-level follow-up to the generic crab review. It does not reopen the general `crab meat / chair de crabe` identity, its `jumbo lump` grade form, the integrated Dungeness identity, or the separate snow-crab hold.

The generic-crab review mentions red king crab among examples showing the breadth of `crab / crabe`; it does not assess *P. camtschaticus*, reconcile a Québec French display against CFIA’s accepted-name collisions, or project the current phrase picker for `king crab` and `crabe royal`. The recent Dungeness proposal and integration decide only *Metacarcinus magister*. Searches of the Section P proposal and batch archive found no earlier red-king-specific integration or hold. The red-king candidate therefore remains a distinct open gap rather than a repeat of the generic-crab or snow-crab decisions.

Before drafting, the active reference catalog, attached forms, legacy candidates, research-ledger record IDs and source IDs, Section P checklist, and related proposal/batch files were checked. Current exact-key ownership and picker behavior are summarized below. No shared catalog or ledger data is changed by this packet.

## Identity evidence and Canadian / Québec naming

OQLF’s GDT entry for **crabe royal** gives *Paralithodes camtschaticus* (also the older spelling *P. camtschatica*) and lists `Alaska king crab`, `king crab`, and `red king crab` as English terms. It identifies `crabe royal` as the preferred Québec term, while `crabe royal du Kamchatka` and `crabe d’Alaska` were not retained by the Québec fish-products terminology committee. OQLF is direct Québec terminology evidence, but it does not settle the broader accepted-name scope in the Canadian Fish List or the exact local product species.

CFIA says its Fish List gives English and French common names accepted for Canadian fish labelling together with scientific names and taxonomic serial numbers. The current crab query has the following relevant rows (the Fish List reports a 2023-09-18 modification date):

| Taxon | CFIA names relevant to this candidate |
|---|---|
| *Paralithodes camtschaticus* | `King Crab / Crabe Royal Du Kamchatka`; `Crab / Crabe Royal`; `Red King Crab` (no French name on that line); `Alaska King Crab / Crabe` |
| *Paralithodes platypus* | `King Crab / Crabe`; `Red King Crab / Crabe Royal`; `Blue King Crab / Crabe royal bleu` |
| *Paralithodes brevipes* | `King Crab / Crabe Royal` |
| *Lithodes* spp. | `King Crab / Crabe Royal` |

Thus the English phrase **red king crab** is accepted for both *P. camtschaticus* and *P. platypus*. The broader **king crab** and French **crabe royal** labels also span taxa. CFIA naming evidence does not say that any one retail package contains those taxa; it establishes that the shared names cannot uniquely identify the proposed species across Canadian labels.

DFO’s current 2026–2027 French Pacific crab-by-trap plan directly lists **crabe royal rouge (*Paralithodes camtschatic*)** alongside Dungeness crab, red rock crab, and golden king crab. This is current official fishery evidence for the qualified Québec French phrase and Pacific fishery scope; preserve the plan’s scientific-name spelling as published, since OQLF and CFIA use their own spellings. DFO’s English fishery sources also use **Red King Crab** for this fishery. These are fishery-management sources, not retail specifications, recipe demand, or culinary equivalence. The qualified French name does not repair the current picker boundary: a query for the shorter phrase `crabe royal` also matches a display containing `crabe royal rouge`.

Current Québec-facing product evidence confirms market use but not one species assignment:

- Metro’s Aqua Star listing is titled **Crabe royal pattes et pinces surgelées**, 500 g, and its ingredient statement identifies **crabe royal (*Paralithodes* spp.), sel**. That is genus-level product wording, not a *P. camtschaticus* declaration. The retrieved listing showed the product out of stock; direct page retrieval returned 403, so this supports the visible product label and package statement, not present inventory.
- Capone Gourmet’s current Québec crab collection lists **Alaska King Crab – Crabe Royal Rouge** and says Alaska King Crab is offered according to arrivals, with delivery across Québec. This supports a real local bilingual retail phrase. The collection does not state a scientific name, species composition, or a stable product state for this item.
- VitaMenu’s Québec product page is titled **Patte de Crabe Royal d’Alaska 1.4 kg** and describes cooked, frozen legs. The page is currently marked sold out and does not identify a taxon; its descriptive text contradicts itself by also naming 1.6 kg and 1.8 kg boxes. Treat it as a product-name/state observation, not evidence that a particular species or package amount is standard.

Together, the Québec sources support local use of `crabe royal`, `crabe royal rouge`, and `crabe royal d’Alaska`, but the current local product evidence either leaves the species open or uses a commercial phrase without taxonomic disclosure. The CFIA collision remains relevant to a Québec-configured catalog because the shared picker has no region-scoped search mode.

## Exact ownership and source-ID audit

The proposed identity has no exact active or legacy owner. The refreshed exact-key check normalized English and French displays/aliases, form labels and match terms, legacy names/aliases, and ledger record IDs with the same lowercase, accent-folding, punctuation, and whitespace rules as the picker.

| Candidate key | Current exact owner |
|---|---|
| `ingredient-ref-red-king-crab`; `candidate-red-king-crab` | None in active references, forms, legacy candidates, or ledger record IDs. |
| `red king crab`; `crabe royal rouge`; `Paralithodes camtschaticus` | None as an exact active reference/form/legacy key. No ledger record owns the candidate species identity. |
| `king crab`; `crabe royal`; `Alaska king crab`; `crabe royal d’Alaska` | No exact active reference/form/legacy key. These names occur in the reviewed terminology and retail evidence, but are not allocated catalog terms. |
| `crab meat`; `chair de crabe` | Exact active owner `ingredient-ref-crab`, category `PROTEIN`, no aliases. |
| `jumbo lump crab meat` | Exact active owner `ingredient-form-crab-jumbo-lump`, attached to `ingredient-ref-crab`; this is a grade form, not a species. |
| `Dungeness crab`; `crabe dormeur`; `crabe Dungeness`; `crabe de Dungeness` | Exact active owner `ingredient-ref-dungeness-crab`, category `PROTEIN`, identity-only. |

The broad crab identities remain separate: recipe 019#8 uses `1 lb jumbo lump crab meat`, linked to the existing crab reference and grade form. Nothing assigns that line to red king crab. The 2026-10-12 generic-crab proposal mentions the broad term `king crab` as part of its reviewed search inventory; that review did not allocate or hold the *P. camtschaticus* identity. The recent Dungeness batch is also distinct.

The proposal-local source-ID namespace `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S01` through `...-S10` was absent from the live ledger and proposal/batch archive before this file was created. The ten IDs below are unique within this packet and were not copied from an earlier catalog source entry.

## Picker projection and risk

The static projection follows `normalizeIngredientSearchKey` and phrase-first matching in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`. It checks the current bilingual reference terms and attached form terms. For the conditional projection, one alias-free row (`red king crab / crabe royal rouge`) was added in memory. This is a source-backed static projection, not an application UI test.

| Query | Current results | If the conditional row were active | Implication |
|---|---|---|---|
| `red king crab` | None | `red king crab / crabe royal rouge` only | CFIA assigns the English phrase to both *P. camtschaticus* and *P. platypus*; a single-result row would imply a species assignment the source list does not make. |
| `king crab` | None | `red king crab / crabe royal rouge` only | The phrase is contained in the proposed English display. CFIA also uses `King Crab` for *P. brevipes*, *P. camtschaticus*, *P. platypus*, and *Lithodes* spp. |
| `crabe royal` | None | `red king crab / crabe royal rouge` only | The shorter query is a word phrase inside the French display. CFIA applies `Crabe Royal` across the taxa above. |
| `crabe royal rouge` | None | `red king crab / crabe royal rouge` only | DFO’s fully qualified French phrase is species-linked, but the picker does not require a full-display match; `crabe royal` still returns the same single row. |
| `Alaska king crab` | None | None, if no alias is added | Do not add this retail term as an alias: the Québec Metro SKU says *Paralithodes* spp., not the proposed species. |
| `crab` / `crabe` | `crab meat / chair de crabe`; `Dungeness crab / crabe dormeur` | Those two plus the conditional red-king row | Broad crab queries would continue to show multiple choices, but they do not make the narrower king-crab queries safe. |
| `crab meat` | `crab meat / chair de crabe` | Same result | Keep recipe 019#8 attached to the species-unspecified crab-meat identity and existing grade form. |

This is concrete search/index risk, not just a lexical concern: the picker tests whether the query phrase occurs anywhere in a normalized display or alias, then returns phrase matches ahead of substring fallback. Consequently, a qualified display cannot preserve the broader Canadian market choice when the broad phrase appears inside it. Until search preserves multiple taxa for these shared phrases (or supports an explicit disambiguation step), keep the species row unallocated even though `crabe royal rouge` has an authoritative Québec French source.

## Recipe demand

All **114** recipe paths in `manifest.v1.json` and all **1,123** ingredient rows were scanned. For each file, the audit checked complete JSON text; for each row, it checked `ingredientName`, `originalText`, `ingredientRefId`, and `ingredientFormId`. Terms included `red king crab`, `king crab`, `Alaska king crab`, `crabe royal`, `crabe royal rouge`, `crabe royal du Kamchatka`, *Paralithodes camtschaticus*, and *Paralithodes* spp.

**Result:** zero matching files and zero matching ingredient rows for the proposed species, its qualified names, or the broad king-crab phrases. The only crab ingredient line is recipe **019#8**, `1 lb jumbo lump crab meat`, already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. It is not species-specific and must not be relinked. No recipe asks for king-crab legs, claws, frozen crab, or red king crab.

## Product states, measurements, and substitutions

Keep the evidence dimensions separate:

- **Identity:** DFO supports the species-qualified red-king/crabe-royal-rouge fishery name, while CFIA and local retail evidence show broader accepted or used names. This review recommends no active identity because of the picker collision.
- **Product state:** the observed retail offers are frozen legs/claws, including a Metro product identified at the *Paralithodes* genus level; VitaMenu describes cooked frozen legs. These are SKU/product states, not forms attached to an active species reference. Do not infer that all red king crab products are cooked, frozen, leg-only, or species-confirmed.
- **Measurements:** Metro’s 500 g is the package amount for one SKU, not a portion. VitaMenu’s 1.4 kg title and conflicting 1.6/1.8 kg body text, plus its approximate 500 g leg claim, are source-specific and inconsistent. Leamington Food Outlet lists a Canadian red-king leg/claw product sold by the pound and in a 10 lb box; those are retailer sale units. None supplies a transferable serving, shell-on edible yield, density, count-to-mass mapping, recipe amount, or raw/cooked conversion. Add no measure, unit mapping, density, or yield.
- **Substitutions:** no reviewed source establishes a directed, recipe- and product-state-specific replacement between red king crab, blue king crab, snow crab, Dungeness crab, or generic crab meat. The general crab-meat recipe line is not substitution evidence. Add no global or contextual substitution, recipe-line substitution, or cooking claim.

## Sources

Sources were accessed or reviewed on 2026-10-13. Each source ID is proposal-local; because the recommendation is a hold, no ledger record is proposed.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S01` | OQLF, [crabe royal (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198914/crabe-royal) | Preferred Québec term and English translations for *P. camtschaticus* / older *P. camtschatica*; rejects `crabe royal du Kamchatka` and `crabe d’Alaska` as Québec commercial terms. Terminology, updated 2012; not current product or stock evidence. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S02` | CFIA, [Fish List query for crab](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) | Canadian accepted-name/species rows show `Red King Crab` for both *P. camtschaticus* and *P. platypus*, and `King Crab / Crabe Royal` on additional taxa. The query page reports 2023-09-18 as its modification date. Label/name scope, not evidence of the species in a particular package. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S03` | CFIA, [Fish List purpose and scope](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the list pairs acceptable Canadian English/French common names with scientific names and taxonomic serial numbers. Naming guidance, not culinary equivalence or retail verification. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S04` | Fisheries and Oceans Canada, [Fishery Notice FN0255, Red and Golden King Crab](https://notices.dfo-mpo.gc.ca/fns-sap/index-eng.cfm?DOC_ID=347918&ID=all&pg=view_notice) | Pairs `Red King Crab` with *P. camtschatica* in a March 10, 2026 commercial-fishery notice. Fishery-specific and uses an older taxonomic spelling; not retail or recipe evidence. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S05` | Pêches et Océans Canada, [Résumé du Plan de gestion intégrée des pêcheries : Crabes pêchés à l’aide de casiers — Région du Pacifique, du 1er avril 2026 au 31 mars 2027](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-fra.html) | Current French plan directly lists `crabe royal rouge (Paralithodes camtschatic)` with Dungeness, red rock, and golden king crab. Preserve DFO’s published taxonomic spelling. This is Pacific fishery scope, not a retail species specification, recipe demand, package state, measurement, or substitution. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S06` | Fisheries and Oceans Canada, [Pacific crab-by-trap plan, April 2026–March 2027](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-eng.html) | Current Pacific fishery scope names Dungeness, red rock, red king, and golden king crabs. A regional fishery source, not nationwide ingredient demand, retail composition, or culinary measurements. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S07` | Metro, [Aqua Star frozen king-crab legs and claws, product 731149112292](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crabe-royal-pattes-et-pinces-surgelees/p/731149112292) | Current indexed Québec product page displays a 500 g frozen package and ingredient wording `crabe royal (Paralithodes spp.), sel`; listing showed out of stock, and direct retrieval returned 403. Supports a genus-level product boundary and package amount only. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S08` | Capone Gourmet, [crabe and crustacean collection](https://caponegourmet.com/collections/crabe-caponegourmet) | Current Québec-facing page lists `Alaska King Crab – Crabe Royal Rouge`, says Alaska king crab is offered according to arrivals, and advertises delivery across Québec. Retail wording and market context only; the collection does not state a scientific taxon or exact SKU specification. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S09` | VitaMenu, [Patte de Crabe Royal d’Alaska 1.4 kg](https://vitamenu.ca/products/king-crab-alaska) | Québec product page describes cooked/frozen legs and an approximate 500 g leg, but also gives conflicting 1.4, 1.6, and 1.8 kg package descriptions; currently sold out, no scientific name. Product-specific observations only; quantities are not activated. |
| `WP04-SECTIONP-RED-KING-CRAB-PICKER-20261013-R3-S10` | Leamington Food Outlet, [King Crab Legs & Claws](https://leamingtonfoodoutlet.ca/products/red-king-crab) | Current Canadian product listing says red king crab legs/claws are individually quick frozen, sold per pound, with a 10 lb box option. Ontario retailer; no Latin species name, Québec display, portion, or edible yield. |

## Baseline and verification

Snapshot recomputed from the shared worktree on 2026-10-13. File hashes are over exact bytes. The recipe digest iterates the manifest’s `recipeFiles` in stored order and hashes each UTF-8 relative path, a NUL byte, exact recipe bytes, and a trailing NUL.

| Artifact | Current count / bytes | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,338 references / 428,755 bytes | `2e7900418e95d420b0fe16f44d64e870f59c032e0134b187375d329698e3a88a` |
| `ingredient-forms.v1.json` | 98 forms / 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates / 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,646 records; 6,225 source entries; 5,229 distinct source IDs / 6,196,145 bytes | `43a6523376af96b26ab0bc7c7c23c56dc66b1c44f029cdb7fa49e169257c7436` |
| `manifest.v1.json` | 114 recipe paths / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `BundledIngredientCatalog.kt` | 586,669 bytes | `3fe619271d9f59f865bd4955651b655f824b26b2f9652b98586f0e3cf4958596` |
| Global and contextual substitution rule JSON | 0 rules each; 3 bytes each | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |

Static exact-key, prior-archive, source-ID-prefix, phrase-picker projection, and full recipe-corpus checks support the hold. No active reference, alias, form, measurement, conversion, yield, recipe link, or substitution was added. The proposal-local source IDs remain outside the ledger because no narrower species-qualified active identity is established. This closes only the reviewed red king crab subgap; Section P remains open. Static checks and the database-data testing exemption are recorded in the [integration note](../batches/wp02-wp03-wp04-round3-gap-review-integration-20261013/README.md).
