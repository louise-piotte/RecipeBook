# WP05 yeast extract identity integration

## Decision

Added identity-only `yeast extract / extrait de levure` with no aliases. Canadian government material recognizes yeast extract as a food ingredient and uses the French wording family `extraits de levure`; Canadian supplier portfolios list powder, paste, and liquid presentations. OQLF’s recorded yeast-extract term is process-qualified (`extrait de levure autolysée`), so no process alias was added.

Kept baker’s yeast, nutritional yeast, autolysed extract, MSG, bouillon blends, and the held Marmite/Vegemite-type spread candidate separate. Retailer wording for the Marmite product is recorded as product-specific. No bundled recipe ingredient line asks for generic yeast extract. No form, density, unit mapping, yield, conversion, or substitution was added. See the [identity review](../../proposals/wp05-yeast-extract-identity-review-20261011.md).

## Files and verification

Added one active reference and one verified identity-ledger record with 13 scoped sources; generated the Kotlin search index and updated the global plan and roadmap. The package has 1,038 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,330 records / 4,371 source entries / 3,604 distinct source IDs.

Package normalization/validation, reference normalization, generated-index freshness, ledger schema, exact collision and recipe-demand audit, UTF-8/no-BOM, and whitespace checks passed. No tests or emulator were run for this database JSON addition.
