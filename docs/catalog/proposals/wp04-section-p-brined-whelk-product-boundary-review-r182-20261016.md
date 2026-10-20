# WP04 Section P — brined whelk product-boundary review (R182)

- **Reviewed / source-access date:** 2026-10-16.
- **Status:** Root disposition recorded below; no shared catalog or ledger data was integrated.
- **Candidate:** Les fruits de mer Madeleine’s *Buccinum undatum* preserved in brine; its French page calls the product *buccins en pot*, and its English page calls it canned whelks.
- **Recommendation:** **Hold** the product outside active references, forms, legacy mappings, and the research ledger until the picker can preserve the existing whelk/buccin ambiguity or a recipe requests a qualified species/product.
- **Scope:** One current Québec preserved-seafood product. This is distinct from the earlier generic whelk identity review and the processor’s raw/frozen whelk item. It does not reopen the octopus-in-olive-oil review, other gastropods, or generic canned/brined forms.
- **Proposal-local source IDs:** `WP04-SECTIONP-WHELK-BRINE-R182-20261016-S01` through `S03`, plus audit ID `WP04-SECTIONP-WHELK-BRINE-R182-20261016-R01`. Existing sources from the generic whelk and periwinkle reviews are reused below under their original IDs.

## Product boundary and evidence

Les fruits de mer Madeleine, a Québec seafood processor, has separate current English and French pages for the product. The English page calls it “Whelks, canned”; the French page names *Buccins en pot*. Both pages say the product is preserved in brine, identify *Buccinum undatum*, give a 99 g jar format and year-round availability, and identify the Magdalen Islands / Gulf of St. Lawrence fishing area. The processor’s separate raw/frozen product page also identifies *B. undatum* but has a different product state and package sizes. This supports a specific preserved product boundary and separates it from the generic whelk identity. [S01–S03]

The French product page says the product may be stored at least five years unopened, while the English page says up to three years after production. The manufacturer pages therefore conflict on shelf life; do not turn either statement into a catalog storage rule or resolve the discrepancy by inference. Neither page provides a drained weight or edible weight separate from brine. [S01–S02]

The specific species evidence meets the prior whelk review’s condition for a species-scoped *Buccinum undatum* candidate. However, using *whelk* / *buccin* in any natural searchable display still changes those broad picker queries into results for a single species. CFIA uses bare `Whelk` for more than one taxon, and OQLF’s Québec `buccin` entry describes more than one species in regional catches. The proposed product cannot serve as a generic answer to those terms merely because this Québec processor identifies its own product. [reused `WP04-WHELK-20261011-S01` through `S04`]

The maker’s French page also says the animal is called *bigorneau*. That supplier-specific usage conflicts with the active reference `common periwinkle / bigorneau` for *Littorina littorea*. Do not copy *bigorneau* into any whelk display or alias, and keep the existing periwinkle row unchanged. [S01; reused `WP04-PERIWINKLE-20261011-S08`]

## Ownership, source, and picker audit

The read-only snapshot contains **1,559 active ingredient references**, **122 forms**, **61 legacy candidates**, and **1,904 research-ledger records / 8,168 source entries / 6,979 distinct source IDs / 5,775 distinct source URLs**. The bundled manifest lists **114 recipe files and 1,123 ingredient rows**.

Exact normalized-key checks covered active reference names and aliases, form labels and match terms, legacy candidate names and aliases, ledger IDs and terms, candidate identifiers, source IDs, and source URLs. No active reference, form, or legacy entry owns `whelk`, `waved whelk`, `buccin`, `buccin commun`, `whelks in brine`, `canned whelks`, or `buccins en pot`. The existing `candidate-whelk` in the research ledger records the unresolved generic whelk identity and the prior source-level name collision; it is not an active picker result. No focused prior proposal on this brined/canned *B. undatum* SKU was found. The English and French canned-product URLs and the raw/frozen product URL below have no ledger URL owner. The raw/frozen URL is already present in the periwinkle proposal as `WP04-PERIWINKLE-20261011-S08`; that reference is reused rather than assigned a new source ID. OQLF, CFIA, and DFO URLs are also reused by existing source IDs. [R01]

| Nearby current result or term | Current owner / likely effect | Disposition |
|---|---|---|
| `whelk`; `buccin` | No active exact owner. Source authorities associate the broader names with multiple gastropod taxa. | Hold any display containing these terms until a broad query will not misleadingly resolve to one product/species. |
| `bigorneau` | `ingredient-ref-common-periwinkle`, displayed as `common periwinkle / bigorneau` for *Littorina littorea*. | Do not use as a whelk alias; retain the supplier’s usage only as a documented source-specific collision. |
| `Buccinum undatum`; `waved whelk`; `buccin commun` | No active exact result. The prior source audit allows a future species-scoped candidate only when product/recipe evidence explicitly identifies *B. undatum*. | The new product does identify it, but adding a natural bilingual product display would still cause broad `whelk` / `buccin` phrase matches under the current picker. |
| Raw/frozen whelk | The same producer has a separate raw/frozen SKU and package presentation. | Do not attach preserved-in-brine behavior or package facts to the raw/frozen product or a generic whelk reference. |
| Periwinkle, other whelk-named gastropods, conch, and abalone | Separate species/product boundaries tracked in active rows and prior reviews. | Add no cross-alias or substitution. |

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, prefers complete word phrases, then falls back to substring matches. If a row displayed `brined waved whelk / buccin commun en saumure` were added, exact queries for that complete phrase could find it, but broad `whelk`, `buccin`, and `waved whelk` queries would also return the single row. This would narrow the source-level ambiguous market terms to one fish. The French term `bigorneau` would already return common periwinkle and must not be added to this product. The hold leaves picker behavior unchanged. [R01]

## Bundled-recipe demand

A read-only scan parsed all manifest-listed recipe files: **114 recipes and 1,123 ingredient rows**. It searched full recipe JSON and ingredient-row text for `whelk`, `whelks`, `Buccinum`, `buccin`, `buccin commun`, `bigorneau`, `bourgot`, brine/canned variants, and the product’s bilingual wording. It found **zero matching recipe files and zero matching ingredient rows**. No recipe links the generic seafood, periwinkle, or any adjacent gastropod identity to this product. [R01]

## Numeric, form, conversion, and substitution limits

- **Package facts:** The 99 g jar is one producer’s package format; the English page also lists 12-jar cases. Neither fact is a household measure, edible weight, or reusable package size. No drained weight is reported. Add no measure, unit mapping, density, package conversion, or yield.
- **Shelf life and storage:** The English and French manufacturer pages conflict (up to three years versus at least five years unopened). This does not justify any app-wide shelf-life or storage claim. The producer’s refrigeration-after-opening direction remains specific to its product page.
- **Forms and processing:** Do not add a general canned, jarred, brined, cooked, or preserved form to the generic whelk candidate. The source describes only the named SKU; its exact thermal process and commercial sterility are not documented in the reviewed product pages.
- **Conversions and substitutions:** No source gives a recipe amount, drained-content weight, cooking yield, or conversion from raw/frozen whelk. The corpus has no dish or method context. Add no conversion, yield, recipe link, or global/contextual substitution between brined whelk, raw/frozen whelk, periwinkle, other whelk species, conch, abalone, or other seafood.

## Proposed delta

**No active catalog or shared-ledger delta is proposed.** Keep `candidate-whelk` unresolved and add no `ingredient-ref-whelk-in-brine`, species alias, form, legacy mapping, or product-source record. Retain the producer’s exact product claims in this proposal. Reopen if a bundled recipe requests the product and the picker can make its *Buccinum undatum* scope clear without making broad `whelk` / `buccin` terms misleading.

## Source register

Pages were accessed on 2026-10-16 unless identified as reused. R182 source IDs are proposal-local and unallocated.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-WHELK-BRINE-R182-20261016-S01** | Les fruits de mer Madeleine, [Buccins en pot](https://www.fruitsdemermadeleine.com/nos-produits/nos-buccins/buccins-en-pot). | Current Québec processor page identifies *Buccinum undatum*, preservation in brine, 99 g jars / 12-jar cases, and year-round availability. It says the product is also called `Bigorneau`, a maker-specific usage that conflicts with the active periwinkle display. Its stated unopened shelf life (at least five years) conflicts with the English page. |
| **WP04-SECTIONP-WHELK-BRINE-R182-20261016-S02** | Les fruits de mer Madeleine, [Whelks, canned](https://www.fruitsdemermadeleine.com/en/our-products/our-whelks/whelks-canned). | English-facing page confirms the same species, brine preservation, 99 g jars / 12-jar cases, and year-round availability. It states an unopened shelf life of up to three years, conflicting with the French page. |
| **WP04-SECTIONP-WHELK-BRINE-R182-20261016-S03** | Les fruits de mer Madeleine, [Whelks, raw frozen](https://www.fruitsdemermadeleine.com/en/our-products/our-whelks/whelks-raw-frozen). | Distinct *B. undatum* product state, with 227 g or 454 g formats and seasonal availability. Used to keep raw/frozen and brined products separate; these package weights do not apply to the brined SKU. This URL is reused from `WP04-PERIWINKLE-20261011-S08`. |
| **Reused `WP04-WHELK-20261011-S01`** | CFIA, [Fish List lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fplist.asp). | Existing source record documents that bare `Whelk` covers *Buccinum undatum* and *Busycon*, with additional compound whelk names. Reused for the source-level naming collision. |
| **Reused `WP04-WHELK-20261011-S02`** | OQLF, [GDT: buccin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198884/buccin). | Existing source record supports the normalized Québec French food term and records multiple taxa in Québec catches; it does not make this product a generic buccin identity. |
| **Reused `WP04-WHELK-20261011-S03` and `S04`** | Fisheries and Oceans Canada, [Integrated Fisheries Management Plan for Whelk](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/whelk-buccin/2025/index-eng.html) and [French plan for Buccin](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/whelk-buccin/2025/index-fra.html). | Existing sources pair *Buccinum undatum* with `waved whelk / buccin commun`; the fishery-specific names do not resolve all generic market uses. |
| **Reused `WP04-PERIWINKLE-20261011-S08`** | Les fruits de mer Madeleine, [Buccins crus, congelés](https://www.fruitsdemermadeleine.com/nos-produits/nos-buccins/buccins-crus-congeles). | Existing proposal source records the same maker’s *B. undatum* raw/frozen item and its use of `Bigorneau`; this is retained as evidence of a supplier-specific naming collision, not as an alias recommendation. |
| **WP04-SECTIONP-WHELK-BRINE-R182-20261016-R01** | Active references/forms, legacy candidates, research ledger, focused proposal/batch archive, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only ownership, source-ID/URL, picker, and recipe-corpus audit. No shared data was changed. |

## Final disposition

**Hold** the brined *Buccinum undatum* product outside active references, forms, legacy mappings, and the research ledger. The maker provides unusually strong current Québec product evidence, including species, bilingual product pages, and brine preservation, so the product boundary itself is clear. The open issue is whether the catalog can present this narrower product without making ambiguous `whelk` / `buccin` searches appear species-resolved; the maker’s *bigorneau* wording also overlaps the active common-periwinkle name. The bundle has no recipe demand to justify that picker cost. No measures, conversions, yields, links, substitutions, or generalized preservation rules are supported.

## Root integration decision

**Hold confirmed.** The brined *Buccinum undatum* product remains outside active references, forms, legacy mappings, and the research ledger. The product evidence is strong, but natural `whelk` / `buccin` displays would make broad searches appear species-resolved; the maker’s `bigorneau` wording also conflicts with the active common-periwinkle row. The English and French shelf-life statements conflict, and no recipe demand was found. The R182 plan and batch README record the hold; no shared data record was added.
