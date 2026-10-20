# WP05 garam masala identity review integration

## Decision

Verified the existing `garam masala / garam masala` reference and added OQLF-attested `garam massala` as a French and English search alias. The existing butter-chicken recipe 086 ingredient link remains unchanged. Recipe 048 lists component spices for one homemade blend; it does not supply a universal formula.

Current Canadian McCormick/Club House pages list different SKU ingredient statements. Keep product formulations separate and do not infer a universal composition, density, measure, conversion, or substitution. Health Canada's current recipe also lists `poudre de cari` and `garam masala` as separate ingredients. See the [identity review](../../proposals/wp05-garam-masala-identity-review-20261011.md).

## Files and verification

Updated the existing reference JSON and its research-ledger record, generated Kotlin search index, global plan, and roadmap. The package has 1,036 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,328 records / 4,350 source entries / 3,583 distinct source IDs.

Package normalization/validation, reference normalization, generated-index freshness, ledger schema, alias collision and recipe-demand review, UTF-8/no-BOM and whitespace checks passed. No tests or emulator were run for this database JSON identity and alias update.
