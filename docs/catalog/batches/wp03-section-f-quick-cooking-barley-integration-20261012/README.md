# WP03 Section F quick-cooking barley identity integration

## Decision

Added `ingredient-ref-quick-cooking-barley` as `quick-cooking barley / orge à cuisson rapide` in `GRAIN_AND_CEREAL`, with no aliases. The identity is limited to the documented Canadian product made from whole-kernel, hull-less barley that is pre-cooked in water and dried. The French compound appears in a historical manufacturer-submitted CIPO goods description; it is not presented as an OQLF ruling or verified current package wording.

The row is separate from hulled, pearl, and pot barley, barley flakes, hot cereal, puffed and sprouted barley, and barley flour. It has no forms, default measure, default density, active unit mappings, conversions, package yields, recipe links, or active substitutions. The bundled recipe corpus has no matching demand.

## Ledger evidence

Seven sources cover the manufacturer product and process, Alberta's export catalogue, the French wording in the CIPO filing, OQLF's base term `orge`, Metro Québec's indexed SKU listing, and the manufacturer's nutrition page.

The manufacturer-published 50 g (½ cup) serving is recorded only as a product-specific `portion_weight` observation. The source does not specify the cup convention or whether the volume was measured before or after preparation. No density or active unit mapping is inferred. The product's promotional claims about replacing rice, potatoes, or pasta remain a `blocked_pending_evidence` ledger finding with no runtime rule.

## Verification

The data change adds one catalog reference and one ledger record with seven sources, one SKU-specific portion observation, and one blocked substitution finding. Static package, generated-catalog, ledger, source-ID, ownership, recipe-corpus, UTF-8/no-BOM, and whitespace checks are appropriate for this database-data change. No app, unit, instrumentation, or emulator tests were run.

See [the quick-cooking barley proposal](../../proposals/wp03-section-f-quick-cooking-barley-identity-review-20261012.md). Section F remains open.
