# WP04 Section P: golden king crab picker hold (2026-10-13)

## Decision

Keep *Lithodes aequispinus* outside the active ingredient catalog under the current picker. CFIA and Fisheries and Oceans Canada support the qualified pair `golden king crab / crabe royal doré`. CFIA also assigns `king crab` and `crabe royal` across multiple crab taxa, and the Québec OQLF entry pairs `crabe royal` with red king crab. Adding a row whose display contains `golden king crab / crabe royal doré` would make each broad query return this one species row.

The [round-four proposal](../../proposals/wp04-section-p-next-fish-gap-review-20261013-round4.md) records source locators, picker projection, and product-state limits. CFIA’s broad names and OQLF’s Québec term do not identify a single golden-king product. The 2026–2027 DFO plan distinguishes golden and red king crab in its Pacific fishery scope; it does not establish national retail prevalence or recipe interchangeability.

## Recipe demand and disposition

The scan covered 114 manifest-listed recipes and 1,123 ingredient rows. It found no golden-king-specific wording or links. Recipe 019#8 remains attached to generic crab meat and its Jumbo Lump grade; it does not specify a species.

No catalog reference, legacy candidate, ledger source, alias, form, measurement, conversion, yield, recipe link, or substitution was added. The broad species picker risk remains unresolved, so Section P stays open.

## Static verification

- Recomputed current and conditional search results from active bilingual reference terms, attached forms, and the existing phrase-first picker behavior. A hypothetical golden-king display would be the sole result for `king crab` and `crabe royal`; the existing `crab meat` query remains on generic crab meat.
- Rechecked the 114-file / 1,123-row recipe corpus and confirmed no golden-king-specific demand.
- Reviewed the [CFIA Fish List crab results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab), [DFO Pacific crab plan for 2026–2027](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-eng.html), its [French edition](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-fra.html), and the [OQLF `crabe royal` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198914/crabe-royal).
- UTF-8 without BOM, mojibake markers, and scoped whitespace were checked for the proposal, batch note, plan, and roadmap.
- No app, unit, instrumentation, or emulator tests were run. No database JSON changed in this documentation-only hold.
