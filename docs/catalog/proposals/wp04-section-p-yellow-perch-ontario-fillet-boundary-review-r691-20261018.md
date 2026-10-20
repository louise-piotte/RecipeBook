# WP04 Section P R691 — Ontario yellow-perch fillet boundary review

- **Review/source-access date:** 2026-10-18.
- **Open checklist:** The Section P finfish and regional-fish parent remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6747).
- **Candidate:** Metro product 219318, **Fresh Ontario Yellow Perch Fillets / Filets de perchaude d’Ontario frais**, under the active `ingredient-ref-yellow-perch` (*Perca flavescens*) identity.
- **Recommendation:** **Hold** a fresh Ontario yellow-perch fillet form outside active data. The Québec-facing product page names and identifies this SKU, but adding its natural wording would make generic **perch fillets** return Yellow perch alone even though the catalog has five perch-family results. The selected Metro listing also showed out of stock, and the bundle has no matching demand.
- **Status:** Integrated on 2026-10-18 as a documentation-only hold. No active catalog or ledger data changed. See the [R689–R691 integration README](../batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md).
- **Proposal-local source labels:** `WP04-SECTIONP-YELLOW-PERCH-FRESH-FILLET-R691-20261018-S01` and `S02`; these are not shared-ledger allocations.

## Scope and prior boundary

This review covers one product presentation only. It does not reopen the accepted Yellow perch identity or R600's Eurasian-perch identity, add a generic perch identity, or assign Metro's product to a different fish. The open Section P fish parent includes regional fish and product gaps. R600 deliberately kept `perch / perche` broad and retained **European Yellow Perch** as a scoped alias on Eurasian perch, so `yellow perch` returns both *Perca* species. R600 did not review a fresh Ontario Yellow perch form; see the [R600 proposal](wp04-section-p-eurasian-perch-identity-review-r600-20261017.md) and [integration README](../batches/wp04-section-p-eurasian-perch-identity-integration-r600-20261017/README.md).

The current Metro page identifies the product as *Perca flavescens*, calls it Fresh Ontario Yellow Perch Fillets / Filets de perchaude d’Ontario frais, and reports Great Lakes/Canada provenance and wild gillnet catch. Both routes give the same product number, 219318, and an average 200 g. The selected item was marked out of stock in the search result; that status is location- and time-specific. The English/French retailer routes support one named product, not province-wide inventory or a reusable kitchen amount. [S01–S02]

OQLF's existing **perchaude** record pairs that Québec fish-product term with **yellow perch** and *Perca flavescens*; it says `perche` was not retained for Québec fish-product labelling. Québec's species profile independently confirms the bilingual names and taxon. The Government of Québec commercial-fishing profile says the perchaude fishery is under moratorium in specified St. Lawrence sectors; it does not establish a province-wide retail ban. Metro's named Ontario provenance must stay product-specific and must not be generalized into a claim of Québec commercial catch. Reuse parent sources `WP04-FRESHWATER-FINFISH-20261010-S05` and `S06`, and existing commercial-portrait source `WP04-BROWN-BULLHEAD-20261012-S04` or `WP04-P-YELLOW-BULLHEAD-20261013-S05`.

## Hypothetical form for the picker audit only

This counterfactual is not an allocated data delta.

| Field | Hypothetical value |
|---|---|
| ID | `ingredient-form-yellow-perch-fresh-ontario-fillets` |
| Parent | `ingredient-ref-yellow-perch` |
| Form code / prep state | `fresh_fillet` / `fresh` |
| English display | `fresh Ontario yellow perch fillets` |
| Québec French display | `filets de perchaude d’Ontario frais` |
| Extra match terms | None; the bilingual labels already reproduce Metro's product title. |
| Density / unit mappings | None |

The French display follows the current Québec retailer title and OQLF's preferred fish name. Do not add generic `perch fillets`, `fillet(s)`, `filet(s)`, `fresh fish`, or `poisson frais` as explicit aliases or match terms. The label itself still contains the consecutive English words `perch fillets`, which is why the broad-query effect remains even without such an alias.

## Current ownership and source audit

The live catalog already has verified `ingredient-ref-yellow-perch`, displayed as **yellow perch / perchaude**, category `PROTEIN`, with no aliases or forms, null default density, and empty unit mappings. Its OQLF and Québec-species-profile sources are already attached to the parent. The related active `ingredient-ref-eurasian-perch` owns aliases `European perch` and `European Yellow Perch`; its R600 review preserves broad perch-family search choices. No exact active name, alias, form label, or match term owns Metro's product number or complete bilingual SKU phrase.

| Audit key | Current owner / finding | Disposition |
|---|---|---|
| `ingredient-form-yellow-perch-fresh-ontario-fillets` | Absent from live forms, ledger record IDs, and the focused archive. | Illustrative only; do not allocate while held. |
| Metro English URL, Metro French URL, item `219318` | The two exact URLs and item number have no shared-ledger owner. They identify the same retailer product. | Sources stay proposal-local. If the form is later accepted, allocate new form-ledger source IDs only after rechecking URL ownership. |
| OQLF `perchaude` URL | Already belongs to parent source `WP04-FRESHWATER-FINFISH-20261010-S05`. | Reuse that exact source on `ingredient-ref-yellow-perch`; do not duplicate it on a form. |
| Québec `Perchaude` species-profile URL | Already belongs to parent source `WP04-FRESHWATER-FINFISH-20261010-S06`. | Reuse the parent record. |
| Québec commercial-fishing portrait URL | Already recorded as `WP04-BROWN-BULLHEAD-20261012-S04` and `WP04-P-YELLOW-BULLHEAD-20261013-S05` on other fish records. | Reuse an existing source ID if cited; no new URL ownership. Its moratorium statement is limited to specified sectors. |
| R691 proposal/source prefix | No R691 proposal, ledger source ID, or exact Metro URL allocation was found. | New proposal path and local labels are unique; no shared allocation is made. |

The R600 Eurasian-perch review and batch are the direct neighboring boundary. Earlier finfish form reviews such as [R548](wp04-section-p-next-gap-review-r548-20261017.md) (rainbow-trout fillet) and [R683](wp04-section-p-atlantic-cod-fillet-form-boundary-review-r683-20261018.md) (Atlantic-cod fillet) are precedent for checking broad cut queries, not owners of this species or this Metro item. [R686](wp04-section-p-frozen-whole-octopus-form-review-r686-20261018.md) concerns frozen whole octopus and does not overlap.

## Picker projection

The read-only projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized phrase matches win; substring matching is used only when no full phrase matches; exact form terms return the parent reference with a form hint.

| Query | Current | With hypothetical form | Effect |
|---|---:|---:|---|
| `fresh Ontario yellow perch fillets`; `filets de perchaude d’Ontario frais` | 0 | 1 Yellow perch result with form hint | Exact Metro product wording becomes searchable. |
| `yellow perch` | 2: Eurasian perch, Yellow perch | Same 2 | R600's visible *Perca* species distinction remains. |
| `perchaude` | 1: Yellow perch | Same 1 | Québec species name remains scoped. |
| `perch` / `perche` | 5 / 2 results | Same 5 / 2 | Broad family searches remain multi-result. |
| `perch fillets`; `perch fillet` | 0 / 0 | 1 Yellow perch result each | A generic English cut phrase appears species-resolved despite the wider perch family. |
| `fillets` / `filets` | 7 / 7 | 8 / 8 | Broad plural-cut queries gain one visible result and remain multi-result. |
| `fillet` | 7 | 8 | Substring fallback adds Yellow perch; the query stays multi-result. |
| `filet` | 2 | 2 | Existing exact phrase results take priority, so the French singular query does not add the plural form. |
| `whole fish` / `poisson entier` | 1 / 1: Whole tilapia | Same | No whole-fish boundary changes. |

The concern is the new `perch fillets`/`perch fillet` singleton, not a collapse of the broad existing `perch` result set. R600 intentionally keeps multiple fish identities visible for broad perch queries; a lone fresh-fillet result would imply a resolved generic product phrase that the catalog cannot currently substantiate across those species.

## Full bundled-recipe demand

I scanned all **114** manifest-listed recipe files, all **1,123** structured ingredient rows, and the decoded recipe JSON for `yellow perch`, `perchaude`, *Perca flavescens*, `Ontario yellow perch fillets`, `filets de perchaude`, and the full bilingual Metro phrases. The corpus snapshot is **754,048 bytes**, with manifest-ordered SHA-256 `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`. Results: **0 matching recipe files and 0 matching ingredient rows**. No recipe link, amount, role, preparation method, or substitution context selects this product. Generic salmon-fillets wording elsewhere in the corpus does not identify Yellow perch. [R01]

## Numeric and substitution limits

Metro's 200 g average describes this one retailer SKU, not an individual fillet mass, serving, household measure, package yield, or transferable conversion. The parent Yellow-perch record has null density and empty unit mappings; its research states remain `not_yet_researched`. This proposal changes none of them. No reviewed source or bundled recipe establishes a reusable measure, edible/cooking yield, conversion, or directed substitution between this fresh fillet product, other perch species, generic fish fillets, or another fish. Add no observation, finding, form-ledger record, measure, recipe link, warning, conversion, yield, or substitution.

## Bounded disposition and follow-up checklist

**Hold** the hypothetical form and keep the R600 identities unchanged. The paired Québec retailer pages verify a real, taxon-identified product, but the exact form phrase introduces a new generic English query—`perch fillets`—that returns Yellow perch alone. There is no bundled demand to justify that risk, and the selected Metro page showed the SKU out of stock at the chosen location when accessed.

- Keep `ingredient-ref-yellow-perch`, its R600 neighbor, and all parent source allocations unchanged.
- Do not add the hypothetical form, a new reference, alias, legacy candidate, shared-ledger source, or recipe link.
- Keep product number 219318, its Ontario/Great Lakes provenance, 200 g average, and availability note proposal-local.
- Revisit if bundled recipe demand selects this exact product or if the picker can preserve a multi-result interpretation for `perch fillets` across relevant perch species.
- Section P remains open; no recipe package or software test is needed for this documentation-only hold.

## Source register

Online sources were accessed 2026-10-18. Narrative labels `S01`–`S02` and `R01` are shorthand for the proposal-local IDs ending in those suffixes in this table; they are not shared-ledger allocations. Existing source IDs remain attached to their current shared-ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-YELLOW-PERCH-FRESH-FILLET-R691-20261018-S01** | Metro, [Fresh Ontario Yellow Perch Fillets, product 219318](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/fresh-ontario-yellow-perch-fillets/p/219318). | English listing names the fresh Ontario fillet product, identifies *Perca flavescens*, gives Great Lakes/Canada provenance and wild gillnet method, and shows 200 g average. The selected item was marked out of stock in the retrieved result; stock is location-specific. Package average is not a reusable recipe measure. |
| **WP04-SECTIONP-YELLOW-PERCH-FRESH-FILLET-R691-20261018-S02** | Metro, [Filets de perchaude d’Ontario frais, product 219318](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filets-de-perchaude-d-ontario-frais/p/219318). | French route pairs the same item number and product title, identifies *Perca flavescens*, and gives the same provenance/method and average. The selected item was marked out of stock; this is not Québec-wide availability evidence. |
| **Existing parent `WP04-FRESHWATER-FINFISH-20261010-S05`** | OQLF, [perchaude (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198859/perchaude). | Reuse on `ingredient-ref-yellow-perch`. Supports Québec `perchaude`, English `yellow perch`, *P. flavescens*, and the fish-product naming boundary for `perche`; not a fillet-state source. |
| **Existing parent `WP04-FRESHWATER-FINFISH-20261010-S06`** | Gouvernement du Québec, [Perchaude species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/perchaude), updated 2026-10-15. | Reuse on the parent. Confirms the French/English species names, taxon, and Québec range; does not establish retail form or recipe behavior. |
| **Existing `WP04-BROWN-BULLHEAD-20261012-S04` / `WP04-P-YELLOW-BULLHEAD-20261013-S05`** | Gouvernement du Québec, [Portrait de la pêche commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-peche-commerciale), updated 2026-06-16. | Reuse an existing source ID if needed. Notes perchaude commercial/recreational moratorium in specified St. Lawrence sectors; it does not establish a province-wide sales restriction or Metro availability. |
| **WP04-SECTIONP-YELLOW-PERCH-FRESH-FILLET-R691-20261018-R01** | Read-only audit of the Section P plan, R600/R548/R683/R686 archive boundaries, live references/forms, legacy identities, ledger/source URL ownership, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and all manifest-listed recipes. | Confirms the counts, exact candidate ownership, source-ID/URL ownership, picker projection, and recipe snapshot reported above; not a ledger source. |
