# WP04 Section P: golden tilefish / tile picker boundary — R82

- **Review date:** 2026-10-13.
- **Decision:** **Hold**; do not allocate an active reference or ledger identity yet.
- **Scope:** one species candidate, golden tilefish (*Lopholatilus chamaeleonticeps*). This does not reopen the R81 sea-raven/toad-crab work or any other Section P decision.
- **Repository rule:** proposal-only research. The current `AGENTS.md` says changes limited to database JSON data need no app tests; no tests or emulator were run.

## Open checklist line and distinctness

The active [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4181) still has this open line:

> [ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

The current plan also records the R81 *Hyas* hold under this still-open parent. A case-insensitive audit of the current plan, all catalog proposals and batches, live references/forms, legacy identities, and ledger found no dedicated golden-tilefish review or identity allocation. The only focused-archive text hit is the cunner proposal’s cross-name note that `achigan de mer` is also used for *L. chamaeleonticeps*; that note does not establish golden-tilefish ownership, choose a picker name, or allocate an ID. The live references contain no owner for `golden tilefish`, `tilefish`, `tile`, `tile de mer`, `Lopholatilus chamaeleonticeps`, or `achigan de mer`.

Post-R81 snapshot: **1,409 references, 104 forms, 1,748 research-ledger records, and 63 legacy candidates**. None has an exact candidate-term match. The manifest bundle has **114 recipes and 1,123 ingredient rows**; a full-row scan for the candidate names, French market phrase, and binomial found no matching recipe row. There is therefore no bundled recipe demand or recipe link to justify selecting this identity on the current corpus alone.

## Species and Québec name boundary

OQLF’s fish-product entry identifies *Lopholatilus chamaeleonticeps*, gives English **tilefish**, and selects Québec French **tile** as its preferred term. The same entry calls the species one of commercial potential in Québec. OQLF lists `tile de mer` among terms used in some contexts but says it was not retained by the fish-product terminology committee. Its 2012 update date means it is authoritative terminology evidence, not proof of present stock or sales.

The CFIA Fish List gives *L. chamaeleonticeps* two name rows: **Tilefish** with no French term, and **Golden Tilefish / Tile**. It also assigns **Tilefish / Tile** to other taxa, including *Caulolatilus* spp., *C. princeps*, and *Malacanthus plumieri*. CFIA describes the Fish List as a source for common names used to label fish sold or processed in Canada; that labeling scope is relevant to name safety but does not set RecipeBook’s picker behavior or establish which fish a recipe writer intended.

A Poissonnerie La Mer arrival list dated 2026-04-28 pairs **TILE DE MER / GOLDEN TILEFISH**. The entry is in the list’s `FILETS / FILLETS` section, marked `SMALL`, and billed in `KG`. This is a dated supplier-list observation, not a current inventory claim or scientific identification: the row gives no binomial or origin. Its French phrase is not OQLF’s preferred term, so it should not become a French alias. The list’s section supplies a vendor category for fillets, but does not specify skin, bones, trimming, freshness/freezing, or portion size.

Taken together, the OQLF and CFIA sources support a real, bounded species identity and bilingual names **golden tilefish / tile**. The Québec supplier evidence supports one dated market-name occurrence, but it uses the non-preferred French phrase. The unresolved issue is whether that species-level pair can be safely exposed by the app’s unscoped picker while the accepted Canadian names overlap with other tilefish taxa.

## Ownership, aliases, and picker projection

There is no active reference, form, legacy identity, or ledger record for this species or its candidate names. No ID is reserved. The prior `achigan de mer` cross-name mention is not an active alias owner. Do not add `tile de mer`, `achigan de mer`, `doré de mer`, `bar`, `tyle fish`, `tilefish`, or the scientific name as aliases: the first four are unretained/contextual terms in OQLF’s entry, while `tilefish` and `tile` are themselves the overlapping names that create the picker question. OQLF does list `tyle fish` as an English term, but this spelling is unnecessary for a held row and would not fix the cross-species boundary.

`IngredientSearch.kt` first finds whole normalized phrases across reference names, aliases, and form terms, then falls back to partial matching. A local projection against the current references/forms gives:

| Query | Current results | Counterfactual result after adding only `golden tilefish / tile` |
|---|---:|---|
| `golden tilefish` | 0 | 1: golden tilefish / tile |
| `tilefish` | 0 | 1: golden tilefish / tile |
| `tile` | 0 | 1: golden tilefish / tile |
| `tile de mer` | 0 | 0, unless the non-preferred vendor phrase is added as an alias |
| `Lopholatilus chamaeleonticeps` | 0 | 0, with the scientific name kept out of search terms |

The counterfactual is based on a synthetic reference using only the OQLF/CFIA display pair and no aliases or forms. `tilefish` would become a **single result** even though CFIA uses it for other taxa, and French `tile` would also become a single result despite CFIA listing that French name for other taxa. The displayed English qualifier `golden` helps users who read English, but the French result is unqualified, and neither display gives the picker an alternative for those other taxa. Since the search implementation has no region, taxonomy, or broad-query warning, this is a meaningful false-specificity risk.

## Product state, measures, conversions, yield, and substitution

- **Identity:** the supported taxon is *L. chamaeleonticeps*. Do not treat a generic tilefish query as proof of this species.
- **Product evidence and form:** the supplier list places the dated offering under `FILETS / FILLETS`; that supports a fillet-category observation only. It does not establish a standardized fillet form or handling state. The live forms file has no candidate form.
- **Measurements:** `SMALL` is a vendor size descriptor, not a number or recipe amount. `KG` is the list’s unit of sale; the row gives no mass per fish, package size, count, or recipe quantity.
- **Conversion and yield:** no density, unit mapping, conversion, edible yield, or raw-to-cooked factor is supported. Do not derive one from the kilogram billing unit or from other fish.
- **Substitution:** no recipe or method source supports substituting this species for another fish. Add no substitution rule or recipe-line link.

## Recommendation and exact data delta

**Hold the candidate outside active references and the research ledger.** The sourced taxon and Québec term are strong enough for an identity proposal, but the current single-result picker projection collapses overlapping Canadian `tilefish`/`tile` names to one species, the vendor’s French term is explicitly not preferred, and the bundle has no recipe demand. Keep the Section P parent open.

Exact requested database delta: **none**. Do not add a reference, alias, form, ledger record, legacy candidate, recipe link, unit mapping, conversion, package yield, or substitution. `ingredient-ref-golden-tilefish` below is only a synthetic projection key; it is not an allocated ID or a future insertion request. Revisit if the picker can preserve species qualifiers for broad bilingual queries, if additional tilefish taxa are independently justified, or if a directly species-identified Québec product source and recipe demand change the evidence.

## Source register

| Source ID | Source | Use and limits |
|---|---|---|
| WP04-SECTIONP-GOLDEN-TILEFISH-BOUNDARY-R82-20261013-S01 | Office québécois de la langue française, [GDT: tile](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198904/tile), updated 2012. | Directly maps `tile` / `tilefish` to *Lopholatilus chamaeleonticeps*, calls it a fish species with commercial potential in Québec, and marks `tile de mer` and other listed terms as not retained by the fish-product terminology committee. Terminology and species-name scope; not current market or recipe evidence. |
| WP04-SECTIONP-GOLDEN-TILEFISH-BOUNDARY-R82-20261013-S02 | Canadian Food Inspection Agency, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), checked 2026-10-13; query *Lopholatilus chamaeleonticeps*. | Lists `Tilefish` and `Golden Tilefish / Tile` for the candidate and overlapping `Tilefish / Tile` names for other taxa. Canadian fish-name list; not recipe-picker policy or a current retail offer. The result page reports a 2023-09-18 modification date. |
| WP04-SECTIONP-GOLDEN-TILEFISH-BOUNDARY-R82-20261013-S03 | Canadian Food Inspection Agency, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), checked 2026-10-13. | Defines the Fish List’s Canadian labeling role and states that listed names are for fish species sold or processed in Canada. It does not prescribe an ingredient-search UX or resolve recipe intent. |
| WP04-SECTIONP-GOLDEN-TILEFISH-BOUNDARY-R82-20261013-S04 | Poissonnerie La Mer, [Arrival list / Liste des arrivages, 2026-04-28](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_28-04-2026.pdf?v=1777318537). | Lists `TILE DE MER / GOLDEN TILEFISH` under `FILETS / FILLETS`, with `SMALL` and `KG`. Dated supplier evidence only; it does not print the binomial, establish ongoing availability, or give a transferable recipe measure, package size, yield, or substitution. |

## Static review record

- Re-read the current `AGENTS.md` and checked the live Section P line, proposal/batch archive, references, forms, ledger, legacy candidates, recipe manifest and all ingredient rows.
- Checked the current [picker implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) and reproduced its normalized phrase/fallback behavior for the current and counterfactual name pair.
- Confirmed the four source IDs are unique within this proposal and do not collide with existing catalog source IDs; verified UTF-8/no BOM, final newline, no trailing whitespace, local relative links, and the counterfactual search simulation.
- No Gradle, app tests, or emulator were run.
