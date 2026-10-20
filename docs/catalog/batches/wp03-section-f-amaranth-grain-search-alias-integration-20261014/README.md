# WP03 Section F — amaranth-grain French search alias (R106)

Reviewed and integrated on 2026-10-14. Section F and the separate human Québec display review remain open.

## Change

Added the French search alias `grains d'amarante` to the existing `ingredient-ref-amaranth-grain` identity. Kept `amaranth / amarante` as the displays, English `ramdana`, and the distinct flour, flakes, greens, puffed-grain, and sprouted-flour rows.

Appended five sources and two decisions to the existing ledger record. The sources attest Québec-facing French grain wording and show two different product-specific cooking instructions. The ledger records that neither supports a reusable dry-to-cooked measure, conversion, or yield; `measurementState` is `researched_no_supported_value`, while substitution research remains open. No form, active measure, density, mapping, recipe link, conversion, yield, or substitution was added.

## Picker and recipe boundary

The phrase-first picker projection resolves `grains d'amarante` and its curly-apostrophe variant to the grain row. Broad `grains` results grow from 22 to 23. Broad `amarante` and `amaranth` remain six-result searches; `farine d'amarante` and `amaranth flour` remain the two distinct flour rows. Searches for `amaranthe` and `kiwicha` remain empty.

The full manifest-listed corpus has 114 recipe files and 1,123 ingredient rows, with no amaranth-related query, alias, or direct reference demand.

## Verification

Reference normalization, package normalization and validation, ledger-schema validation, generated-index freshness, picker projection, recipe scan, and scoped whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because the active catalog change adds database JSON data.

See the [R106 source and wording review](../../proposals/wp03-section-f-amaranth-grain-quebec-search-alias-review-r106-20261014.md).
