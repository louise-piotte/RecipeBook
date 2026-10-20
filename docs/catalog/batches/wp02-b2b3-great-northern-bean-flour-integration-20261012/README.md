# WP02 B2/B3 whole Great Northern bean flour identity integration

## Decision

Added `ingredient-ref-great-northern-bean-flour` as `whole Great Northern bean flour / farine de haricots Great Northern entiers` in `FLOUR_AND_STARCH`. The French flour compound is provisional; it is constructed from OQLF's whole-bean term and Québec retail wording, but no current source attests that exact flour name. Both alias arrays remain empty.

The English identity follows AGT's `Whole Great Northern Bean Flour 50` listing in Celiac Canada's product finder. The finder was last updated in July 2026, is not real-time, provides no UPC, and notes that some entries may be ingredients intended for food manufacturers. Keep `50` as source wording only; it is not interpreted as a measure, percentage, grade, or particle size.

Keep this product separate from whole Great Northern beans, generic white-bean flour, Navy-bean flour, and pinto-bean flour. Add no forms, default measure, density, unit mappings, conversions, package yields, or recipe links. The bundled recipe corpus has no matching demand.

## Ledger evidence

Eight sources cover the AGT-named product listing, AGT's broader bean classes, OQLF's French whole-bean term, Québec retail wording, Statistics Canada's separate crop classes, Pulse Canada's processing context, and two historical Great Northern flour formulation studies.

The studies report formulation-specific wheat-flour inclusion levels for cookies and bread, with different outcomes across applications. The current product listing does not identify raw or pre-gelatinized processing. Keep the study evidence as a `blocked_pending_evidence` ledger finding; no global or contextual substitution rule is active. No household measure or flour-specific density is supported.

## Verification

The data change adds one catalog reference and one ledger record with eight sources and one blocked substitution finding. Static package, generated-catalog, ledger, source-ID, ownership, recipe-corpus, UTF-8/no-BOM, and whitespace checks are appropriate for this database-data change. No app, unit, instrumentation, or emulator tests were run.

See [the round10 proposal](../../proposals/wp02-b2b3-next-gap-review-20261012-round10.md). Broader WP02 B2/B3 coverage remains open.
