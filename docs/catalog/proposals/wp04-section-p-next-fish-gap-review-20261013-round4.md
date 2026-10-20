# WP04 Section P — golden king crab / crabe royal doré picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Species identity, Québec naming, picker, product-boundary, and recipe-demand review; recommendation integrated as a documentation-only hold.
- **Recommendation:** Hold *Lithodes aequispinus* outside the active ingredient catalog. Current official sources support the qualified names `golden king crab / crabe royal doré`, but the shared picker would return this one species for the broader queries `king crab` and `crabe royal`. CFIA assigns those broad names to multiple crab taxa, and a Québec retailer uses `crabe royal` for a cooked product without naming a taxon. The corpus contains no golden-king-crab demand. Add no active reference, legacy candidate, ledger record, alias, form, measure, recipe link, conversion, yield, or substitution.
- **Conditional identity shape if picker behavior changes:** `ingredient-ref-golden-king-crab`, category `PROTEIN`, English `golden king crab`, Québec French `crabe royal doré`, evidence scope *L. aequispinus*, empty alias arrays, null density, and empty unit mappings. This row is **not** recommended for activation under current search behavior.

## Scope and prior-work boundary

This packet reviews only golden king crab (*Lithodes aequispinus*) and the broad king-crab search terms its qualified display would contain. It does not reopen the generic crab-meat identity and Jumbo Lump form, the Dungeness integration, or the snow-crab and red-king-crab picker holds.

The earlier generic-crab review and red-king review mention golden king crab only as one species in DFO’s regional fishery plan. Archive searches found no earlier dedicated *L. aequispinus* ownership decision, picker projection, or integration. This is a separate species boundary: current federal sources support an exact taxon and bilingual qualified names, while the shared picker makes their shorter roots misleading. The proposal-only red-king hold remains unchanged.

Before drafting, the current Section P checklist, related proposals and batches, active references and forms, legacy candidates, ledger record/source IDs, and all manifest-listed recipe files were checked. No shared catalog or ledger data is changed by this packet.

## Identity evidence and Canadian / Québec naming

CFIA’s Fish List query for crab returns these relevant rows:

| Taxon | CFIA common-name rows |
|---|---|
| *Lithodes aequispinus* | `Golden King Crab` (no French name on that row); `Brown King Crab / Crabe`; `Crab / Crabe Royal Doré` |
| *Lithodes* spp. | `King Crab / Crabe Royal` |
| *Paralithodes camtschaticus* | `Red King Crab`; `King Crab / Crabe Royal Du Kamchatka`; `Crab / Crabe Royal`; `Alaska King Crab / Crabe` |
| *Paralithodes platypus* | `Red King Crab / Crabe Royal`; `Blue King Crab / Crabe royal bleu`; `King Crab / Crabe` |
| *Paralithodes brevipes* | `King Crab / Crabe Royal` |

The Fish List identifies *L. aequispinus* and links `Golden King Crab` and `Crabe Royal Doré` to that taxon. It also lists `King Crab / Crabe Royal` for other crab taxa. The crab query page reports a modification date of 2023-09-18; this review records the names as the current query result but does not claim that the underlying list was recently revised.

DFO’s current French Pacific crab-by-trap plan, for 1 April 2026 through 31 March 2027, explicitly lists **crabe royal doré (*Lithodes aequispinus*)** and separately **crabe royal rouge (*Paralithodes camtschatic*)**. Its English counterpart lists golden king crab and red king crab separately. These are current fishery-management sources: they establish the species and qualified fishery names, not a Québec retail SKU, recipe demand, or culinary equivalence. The French spelling in DFO’s plan is retained as published.

OQLF’s GDT entry for **crabe royal** is a Québec commercial fish-product term for *Paralithodes camtschatica* / *P. camtschaticus*; it gives `king crab`, `red king crab`, and `Alaska king crab` as English terms and says `crabe royal` is the preferred normalized Québec label. The entry was last updated in 2012 and does not establish the golden-king name. It does show why making `crabe royal doré` an active display would cause a broad `crabe royal` query to select golden king crab alone even though OQLF uses the shorter Québec term for red king crab.

Current market evidence remains product-specific and does not resolve a Québec golden-king purchase to this taxon:

- Metro’s Québec listing for **Pattes et pinces de crabe royal cuites** shows an approximate 400 g retail item. The indexed product record does not state a scientific name or golden-king qualifier, and direct page retrieval returned 403. It supports current local use of broad `crabe royal` and a cooked legs/claws state for that listing only.
- Ontario retailer 7C Seafood lists `16-20 GOLDEN KING CRAB LEGS` and `20-24 GOLDEN KING CRAB LEGS` under frozen seafood. Its 20–24 item detail says the price is per pound, but the listing is currently out of stock and supplies no Latin name. These are commercial product labels and sale details, not a taxon declaration, count-to-mass conversion, or evidence of Québec availability.

The Québec listing therefore demonstrates a real picker collision rather than evidence to attach `crabe royal` or a cooked-leg form to *L. aequispinus*. The Ontario listings show that the qualified English market name is used, but do not settle a local Québec package’s species or state.

## Exact ownership and source-ID audit

Exact ownership was checked after applying the same search-key normalization used in `normalizeIngredientSearchKey`: lowercase with compatibility decomposition, accent and ligature folding, punctuation-to-space normalization, and whitespace folding. Active reference displays and aliases, attached form labels and match terms, legacy candidate IDs/names/aliases, and ledger record IDs were included.

| Candidate key | Current exact owner |
|---|---|
| `ingredient-ref-golden-king-crab`; `candidate-golden-king-crab` | None in active references, forms, legacy candidates, or ledger record IDs. |
| `golden king crab`; `crabe royal doré`; `Lithodes aequispinus`; `brown king crab` | None as exact normalized active reference/form/legacy keys; no ledger record owns the proposed species identity. |
| `king crab`; `crabe royal` | No exact active reference/form/legacy owner. These terms occur in the official naming sources but remain unallocated catalog keys. |
| `crab meat`; `chair de crabe` | Active `ingredient-ref-crab`, category `PROTEIN`, no aliases; its existing `ingredient-form-crab-jumbo-lump` is a grade form, not a species. |
| `Dungeness crab`; `crabe dormeur`; `crabe Dungeness`; `crabe de Dungeness` | Active `ingredient-ref-dungeness-crab`, category `PROTEIN`, with its reviewed French aliases. |

The archive search confirmed that golden king crab appears only incidentally in the generic-crab and red-king evidence as part of DFO’s species list. There is no prior golden-king hold or assigned candidate ID to duplicate. The proposal-local source namespace `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S01` through `...-S08` was absent from the existing research ledger, proposal archive, and batch archive before use. The eight source IDs below are unique in this packet; as the recommendation is a hold, none is proposed for insertion into the ledger.

## Picker projection and risk

The static projection follows the current normalization and complete-word-phrase-first matching in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`. Current terms include active bilingual displays and aliases plus attached form terms. The conditional row adds only `golden king crab / crabe royal doré`, with no aliases.

| Query | Current results | With the conditional row | Implication |
|---|---|---|---|
| `golden king crab` | None | `golden king crab / crabe royal doré` only | Qualified English identity is source-supported for *L. aequispinus*. |
| `crabe royal doré` | None | `golden king crab / crabe royal doré` only | Qualified French identity is source-supported by DFO and CFIA. |
| `king crab` | None | `golden king crab / crabe royal doré` only | The query is a complete phrase inside the English display; CFIA applies broad king-crab names to *Lithodes* and multiple *Paralithodes* taxa. |
| `crabe royal` | None | `golden king crab / crabe royal doré` only | The query is a complete phrase inside the French display. OQLF uses the shorter term for red king crab, and CFIA has it across multiple crab taxa. |
| `crab` / `crabe` | `crab meat / chair de crabe`; `Dungeness crab / crabe dormeur` | Those two plus golden king crab | Broad crab queries continue to show multiple product/species choices; this does not make the narrower `king crab` and `crabe royal` queries safe. |
| `crab meat` | `crab meat / chair de crabe` | Same result | Keep recipe 019#8 on the species-unspecified crab-meat identity and Jumbo Lump grade. |
| `brown king crab` | None | None, if no alias is added | CFIA lists this name for *L. aequispinus*, but it is not established as a Québec product term in the reviewed sources; do not add it as an alias in this packet. |

This is a concrete search/index risk. The picker checks whether a full query phrase occurs anywhere within a normalized display before substring fallback, and if a query phrase matches one row it returns that row. An alias-free species display therefore still captures broader `king crab` and `crabe royal` queries. The single result would imply that either broad market phrase uniquely means golden king crab, despite the CFIA name collisions and the OQLF red-king entry. Keep the species unallocated until search supports a genuine disambiguation path or the broader term is safely represented by multiple choices.

## Recipe demand

All **114** paths in `manifest.v1.json` and all **1,123** ingredient rows were scanned. Each recipe file’s complete JSON text was searched; each ingredient row’s `ingredientName`, `originalText`, `ingredientRefId`, and `ingredientFormId` were checked. Golden-specific terms included `golden king crab`, `gold king crab`, `brown king crab`, `crabe royal doré`, *Lithodes aequispinus*, and the spelling variant *L. aequispina*.

**Result:** zero files and zero ingredient rows match golden king crab, its species, or its qualified names. The broad `crab / crabe` scan finds only recipe **019#8**, `1 lb jumbo lump crab meat`, already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. That request does not identify golden king crab and must not be relinked. No bundled recipe asks for golden-king legs, claws, meat, or a frozen/cooked state.

## Product states, measurements, and substitutions

Keep the evidence dimensions separate:

- **Identity:** DFO and CFIA support the qualified species pair `golden king crab / crabe royal doré` for *L. aequispinus*. This review still recommends no active identity because the shared picker would assign broader queries to that one row.
- **Product state:** 7C lists golden-king legs in its frozen-seafood category but does not declare the taxon or cooking state; Metro’s cooked legs/claws listing is species-unspecified. Do not infer that all golden king crab is leg-only, cooked, frozen, or available in Québec. Add no form.
- **Measurements:** Metro’s approximate 400 g item is a retailer product amount, not a serving. 7C’s 20–24 item is priced per pound and its title carries a 20–24 grade, but the page does not define that grade’s counting basis or a recipe portion. Neither listing establishes edible yield, shell-on conversion, density, count-to-mass mapping, or a reusable measure. Add no measure, unit mapping, density, conversion, or yield.
- **Substitutions:** no reviewed source establishes a directed, recipe- and product-state-specific replacement between golden king crab, red king crab, snow crab, Dungeness crab, or generic crab meat. Shared “king crab” naming and general culinary similarity are not substitution evidence. Add no global or contextual substitution, recipe-line link, or cooking claim.

## Sources

Sources were accessed or reviewed on 2026-10-13. Each source ID is proposal-local. No ledger record is proposed under the hold recommendation.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S01` | OQLF, [crabe royal (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198914/crabe-royal) | Québec preferred commercial term `crabe royal`, English terms `king crab`, `red king crab`, and `Alaska king crab`, with Latin identification *Paralithodes camtschatica* / *P. camtschaticus*. Last updated 2012; directly relevant to the broad French picker query, not golden-king nomenclature. |
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S02` | CFIA, [Fish List crab query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) | Query rows link `Golden King Crab`, `Brown King Crab`, and `Crabe Royal Doré` to *Lithodes aequispinus*, while broader `King Crab / Crabe Royal` names appear on several taxa. The query page reports 2023-09-18 as its modification date; it is Canadian label-name evidence, not a retail species declaration. |
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S03` | CFIA, [Fish List purpose and scope](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes the Fish List’s role in assigning accepted Canadian English/French common names and scientific names. It is naming guidance, not a culinary source or evidence for one package. |
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S04` | Fisheries and Oceans Canada, [French Pacific crab-by-trap plan, 2026–2027](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-fra.html) | Current-season plan directly lists `crabe royal doré (Lithodes aequispinus)` and distinguishes `crabe royal rouge (Paralithodes camtschatic)`. Pacific fishery-management scope, not national retail supply, product state, recipe amount, or substitution evidence. |
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S05` | Fisheries and Oceans Canada, [English Pacific crab-by-trap plan, 2026–2027](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-eng.html) | Current English plan lists golden and red king crab separately; the same regional plan says nearly all BC coastal crab are Dungeness. This does not establish broad Canadian product availability or recipe equivalence. |
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S06` | Metro, [Pattes et pinces de crabe royal cuites, product 248545](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/pattes-et-pinces-de-crabe-royal-cuites/p/248545) | Current Québec listing is indexed as cooked royal-crab legs/claws, approximately 400 g. The item gives no Latin species name; direct page retrieval returned 403, so this supports visible listing language and one SKU’s state/amount only. |
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S07` | 7C Seafood (Bradford, Ontario), [crab products](https://www.7cseafood.com/product-category/fish-products/crab/) | Live retailer category lists 16–20 and 20–24 `GOLDEN KING CRAB LEGS` under frozen seafood. The category does not identify a taxon or establish Québec availability; current individual item pages show out-of-stock status. |
| `WP04-SECTIONP-GOLDEN-KING-CRAB-PICKER-20261013-R4-S08` | 7C Seafood, [20–24 Golden King Crab Legs](https://www.7cseafood.com/product/20-24-golden-king-crab-legs/) | Item detail says the price is per pound and currently lists the product out of stock. The pound is a retailer sale unit; the page does not provide a portion, taxon, package yield, or count basis for the 20–24 descriptor. |

## Baseline and verification

Snapshot recomputed from the shared worktree on 2026-10-13. File hashes cover exact bytes. The manifest-ordered recipe digest hashes each UTF-8 relative path, NUL, exact recipe bytes, and a trailing NUL.

| Artifact | Current count / bytes | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,338 references / 428,802 bytes | `4c5ebe5497543acde7d6d6aca9e50bea928cee477c538ce795910589e90239e3` |
| `ingredient-forms.v1.json` | 98 forms / 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates / 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,646 records; 6,243 source entries; 5,251 distinct source IDs / 6,213,018 bytes | `04b039774e364d2707a77b5759195a1b46ea4837731a6d2f89936704a1b060df` |
| `manifest.v1.json` | 114 recipe paths / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `BundledIngredientCatalog.kt` | 586,698 bytes | `f7fab835ba4b02f301c4ad966b52c78553bab66ba7801528a290f4988131fbd9` |
| Global and contextual substitution rule JSON | 0 rules each; 3 bytes each | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |

Static review confirmed no exact active or legacy candidate owner, no prior golden-king-specific proposal or integration, no source-ID collision, and zero golden-king recipe demand. The picker projection was evaluated from the current normalization and matching logic, with the proposed row added in memory only. This packet changes no shared catalog data, ledger, generated file, recipe, checklist, roadmap, or application source. No app tests or emulator checks were run.

## Integration record

The recommendation was accepted as a documentation-only hold. No species row or ledger data was added. The checklist and roadmap record the disposition; Section P remains open. Static picker and recipe-corpus review, UTF-8/no-BOM, and scoped whitespace checks are documented in the [integration batch record](../batches/wp04-section-p-golden-king-crab-picker-hold-integration-20261013/README.md).
