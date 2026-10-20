# WP05 yeast-extract spread boundary integration

## Decision

Recorded `candidate-yeast-extract-spread` in the research ledger with `needs_clarification` identity
state. Marmite and Vegemite remain branded examples; they are not aliases. The candidate describes
a savory, prepared yeast-extract spread and remains separate from generic yeast extract, nutritional
yeast, baker's yeast, and malt extract.

The English `yeast extract spread` wording is supported by manufacturer descriptions, while the
current Canadian Marmite listing uses the brand-specific French display `Extrait de levure`.
OQLF supports `tartinade` as the general Québec term for a spread, but the exact generic phrase
`tartinade à l'extrait de levure` was not attested by the reviewed sources. Keep the candidate held
until that French display receives review. The audit found no matching recipe demand. No active
reference ID, alias, form, measurement, recipe link, conversion, yield, or substitution was added.

Sources: [WP05 yeast-extract spread review](../../proposals/wp05-yeast-extract-spread-boundary-review-20261011.md).

## Files and verification

Updated the research ledger, global plan, and roadmap. Package totals remain 1,031 references / 72
forms / 114 recipes / 1,123 ingredient rows. The shared ledger now has 1,323 records / 4,319 source
entries / 3,552 distinct source IDs after this hold and the plantain alias integration.

Passed `normalize_bundled_seed_package.py --check` and `--validate-only`, the ingredient-reference
normalizer check, and the generated-index freshness check. Research-ledger schema validation passed;
the audited recipe bundle has no matching plantain-flour or yeast-spread demand. Targeted UTF-8/no-BOM,
whitespace, and `git diff --check` checks passed. No tests or emulator run were needed for the database
JSON data update.
