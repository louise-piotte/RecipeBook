# WP04 Section P — yellow croaker / courbine jaune picker-boundary review (R371)

- **Review and source-access date:** 2026-10-16.
- **Status:** Proposal-only; no shared catalog, ledger, plan, roadmap, README, recipe, or code changed.
- **Candidate:** yellow croaker, *Larimichthys polyactis* (CFIA TSN 646548).
- **Recommendation:** Hold the candidate outside active references, forms, and the research ledger. A hypothetical `Yellow Croaker / courbine jaune` row would make broad `croaker` and `courbine` searches return this one species, although CFIA uses those generic common names for many fish taxa. The bundle has no recipe demand for this candidate.
- **Verification:** Read-only source, ownership, picker, and manifest checks only. No software tests, build, or emulator were run.

## Open gap and prior-work boundary

The parent checklist remains open for the listed finfish and regional fish in [Section P of the global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5878). Before this proposal was written, a repository-wide case-insensitive search found no prior focused review, integration, hold, active reference, form, legacy identity, or ledger record for `yellow croaker`, `courbine jaune`, or *Larimichthys polyactis*.

Prior Section P work has already reviewed the generic `croaker` boundary for Atlantic croaker and black drum and has kept `croaker` out of the weakfish aliases. Those reviews concern other taxa and do not allocate *L. polyactis*. This proposal uses the same picker-safety concern without reopening those decisions. It also does not revisit the GuineaSea dried-pagne hold (R365) or the recipe-backed calamari-rings form (R368).

## Canadian and Québec name evidence

The CFIA Fish List identifies *L. polyactis* (TSN 646548) under **Yellow Croaker** with no French name on that row, and separately lists **Croaker / Courbine Jaune** for the same TSN. The same list assigns bare **Croaker** to numerous other fish taxa, including *Cheilotrema saturnum*, *Nibea* spp., *Pennahia anea*, *P. argentata*, and *Pseudotolithus elongatus*. Thus the qualified species identity is clear in CFIA nomenclature, but its English and French accepted common names contain generic words that are not unique to this fish. [S01, S02]

Current Canadian product catalogues corroborate consumer-facing use of the qualified wording, but do not supply a taxonomic crosswalk:

- PriceSmart Foods lists **Frozen - Yellow Croaker (150–250g)** in an 800 g package and describes the item as frozen, with croaker weight in the range of 150–250 g. The listing does not state a binomial; its package and size claims apply to this SKU only. [S03]
- Walmart Canada lists **Searay Yellow Croaker**, marks its storage type as frozen, and says it is farmed mostly in Asia. The item was out of stock when reviewed and the listing does not state a binomial. It is product-name evidence, not current-stock or species-identification evidence. [S04]
- Uniking Enterprises’ current French-language Canadian catalogue includes `Poisson courbine jaune entier`, `Filets de courbine jaune`, and salted listings. It does not give the scientific name or a product-level taxonomic specification. Its catalogue URL is already owned in the ledger by `WP04-P-PACIFIC-SAURY-20261013-S07`; I reuse that URL observation without allocating another ledger source entry. [Existing source S07]

I found no OQLF GDT entry for the exact phrase `courbine jaune` in this review. The existing OQLF entry for *Pogonias cromis* records bare `courbine` among contextual terms not retained by the fish-products terminology committee; that supports caution around the unqualified word only and does not decide whether `courbine jaune` is the preferred Québec term for *L. polyactis*. Reuse its existing source ID if that entry is discussed; do not treat it as direct yellow-croaker terminology evidence. [Existing source S01]

## Existing ownership and recipe demand

The read-only snapshot contains **1,695 active references**, **140 forms**, **56 legacy candidates**, and **2,051 research-ledger records**. No active reference, attached form, legacy identity, or ledger record owns `yellow croaker`, `courbine jaune`, or *Larimichthys polyactis*. The pre-existing proposal and batch archive had no focused candidate-specific review. `croaker` and `courbine` occur in prior fish-boundary research but have no active reference or form owner. The hypothetical IDs `ingredient-ref-yellow-croaker` and `candidate-yellow-croaker` are unallocated.

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `yellow croaker`, `courbine jaune`, and *Larimichthys polyactis*. The scan found **0 matching files and 0 matching rows**. The read-only corpus snapshot was 753,988 bytes; its manifest-order path-and-content digest was `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. No recipe link or relink is supported.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the index includes reference names, aliases, and attached form terms; complete normalized word phrases take priority, with substring matching used only when no complete phrase matches. This table projects a display-only `Yellow Croaker / courbine jaune` reference with no aliases or forms; it does not propose activation.

| Query | Current live results | With hypothetical row | Effect |
|---|---|---|---|
| `yellow croaker` | None | Yellow Croaker / courbine jaune only | Qualified English phrase selects the intended candidate. |
| `courbine jaune` | None | Yellow Croaker / courbine jaune only | Qualified French phrase selects the intended candidate. |
| `croaker` | None | Yellow Croaker / courbine jaune only | Bare English query falsely appears to identify one species. |
| `courbine` | None | Yellow Croaker / courbine jaune only | Bare French query falsely appears to identify one species. |
| `yellow` | 12 references | Same 12 plus Yellow Croaker / courbine jaune | Remains a multi-result query. |
| *Larimichthys polyactis* | None | None | Do not add the scientific name as an alias; it is not a user-facing ingredient term. |

The singleton results for bare `croaker` and `courbine` are the blocking picker effect. Keep those terms out of aliases; the display itself still contains them. Revisit after the picker can preserve the generic croaker scope or communicate that a broad query has multiple fish identities.

## Numeric, form, and substitution limits

The cited retailer entries are SKU-specific. The 150–250 g item range, 800 g bag, and Walmart's frozen and farming description do not establish a default serving, edible yield, household measure, package conversion, density, or unit mapping. Uniking's several product labels also do not justify adding salted, fillet, whole, or other forms to a candidate that is held. Add no form, measure, density, mapping, conversion, or yield.

The manifest-listed recipe corpus has no candidate use or method/quantity context. No reviewed source supports *L. polyactis* as a directed global or contextual substitute for generic croaker, another drum/croaker, or white fish. The bundled global and contextual substitution-rule files currently contain zero rules each. Add no substitution or recipe-line link, and infer no cooking, preservation, storage, or raw-consumption equivalence.

## Source-ID and URL uniqueness

Proposal-local source IDs below were checked against the shared ledger and pre-existing proposal/batch archive; no prior exact ID collision was found. The four proposed source URLs for the two CFIA searches and the PriceSmart Foods and Walmart product pages had no prior exact URL owner in the shared ledger or focused WP04 archive. The Uniking and OQLF URLs already have ledger owners, so their existing source IDs are identified and reused as context only. No source ID or ledger entry is allocated by this hold.

## Proposed catalog delta

1. Keep *L. polyactis*, `ingredient-ref-yellow-croaker`, and `candidate-yellow-croaker` absent from active references, forms, legacy identities, and the research ledger.
2. Add no alias, form, recipe link, measurement, density, unit mapping, conversion, yield, or substitution.
3. Revisit when generic croaker search can represent several species without making one qualified species look like the only answer, or when a recipe establishes a specifically identified use.

## Source register

Sources were checked on 2026-10-16. Direct URLs are included for review. Source IDs in this table are proposal-local except entries explicitly marked as already owned in the ledger.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-YELLOW-CROAKER-R371-20261016-S01` | CFIA, [Fish List lookup for Yellow Croaker](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=yellow%20croaker). | Maps TSN 646548 and *L. polyactis* to `Yellow Croaker`; another row for that TSN gives `Croaker / Courbine Jaune`. Canadian fish-label nomenclature, not retailer stock or a recipe measure. |
| `WP04-SECTIONP-YELLOW-CROAKER-R371-20261016-S02` | CFIA, [Fish List lookup for Croaker](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=croaker). | Shows bare `Croaker` assigned across multiple taxa. Supports the generic-name collision; not a taxonomy treatment or food-use equivalence. The Fish List page was last modified 2023-09-18. |
| `WP04-SECTIONP-YELLOW-CROAKER-R371-20261016-S03` | PriceSmart Foods, [Frozen Fish](https://www.pricesmartfoods.com/categories/frozen-seafood/frozen-fish-id-30844), listing “Frozen - Yellow Croaker (150–250g), 800 Gram.” | The listing describes a frozen product and a croaker weight range of 150–250 g; it gives no binomial. Package and size information is SKU-specific, not a general measure or yield. |
| `WP04-SECTIONP-YELLOW-CROAKER-R371-20261016-S04` | Walmart Canada, [Searay Yellow Croaker](https://www.walmart.ca/en/ip/Searay-Yellow-Croaker/6000198769828). | Product page marks storage type as frozen and says farmed mostly in Asia; it was out of stock when reviewed and gives no binomial. |
| `WP04-P-PACIFIC-SAURY-20261013-S07` *(existing ledger source; URL reused)* | Uniking Enterprises (Canada) Ltd., [French product catalogue](https://www.uniking.ca/fr/products). | Existing ledger entry covers the same page for a Pacific-saury listing. The current page also displays the French yellow-croaker product wording noted above, but it does not identify the species scientifically; no duplicate URL or ledger source entry is proposed. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S01` *(existing ledger source; URL reused)* | Office québécois de la langue française, [GDT: grand tambour](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199003/grand-tambour). | Existing ledger entry says bare `courbine` is a contextual term not retained for *Pogonias cromis* fish-product terminology. It does not establish the preferred name for *L. polyactis*. |
| `WP04-SECTIONP-YELLOW-CROAKER-R371-20261016-R01` | Read-only audit of the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5878), live references/forms/legacy identities/research ledger, [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), manifest-listed recipes, [picker search code](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and WP04 proposal/batch archive. | Snapshot: 1,695 references, 140 forms, 56 legacy candidates, 2,051 ledger records, 114 recipe files / 1,123 ingredient rows. Checked exact candidate ownership, proposed source IDs and URL ownership, recipe demand, and picker projection. No shared file was changed. |

## Disposition

**Recommend hold.** Canadian nomenclature and market catalogues show that qualified yellow-croaker wording is in use, but CFIA also assigns `Croaker` and `Courbine` across many taxa. The current picker would collapse both bare generic queries to this one candidate if the row were activated, and the bundled recipe corpus supplies no demand that would justify that boundary risk. Keep this candidate outside shared data until generic croaker selection can preserve the broader scope.
