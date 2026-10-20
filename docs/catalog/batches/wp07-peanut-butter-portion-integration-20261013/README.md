# WP07 peanut-butter portion integration

Added one bounded USDA SR28 portion observation for `ingredient-ref-peanut-butter`: 32.0 g per 2.0 tbsp for NDB 16098, `Peanut butter, smooth style, with salt`. The research ledger now records its source, decision, and `portion_weight` observation. Its measurement state is `researched_supported` for this evidence only.

The active reference catalog remains unchanged: no default density or unit mapping was added. Recipe files and their ingredient quantities remain unchanged. The evidence limits and seven linked recipe rows are recorded in [the review memo](../../proposals/wp07-peanut-butter-portion-observation-review-20261013.md).

The ledger now contains 1,681 records, 6,572 source entries, and 345 measurement observations. The recipe corpus remains 114 files, 1,123 ingredient rows, and 753,792 bytes. The ledger passed Draft 2020-12 schema validation; seed-reference/package normalization, package validation, and generated-index freshness checks passed. UTF-8/no-BOM and focused whitespace checks passed. No app or Android tests were run because this batch only adds database JSON evidence, as permitted by the updated `AGENTS.md` rule.
