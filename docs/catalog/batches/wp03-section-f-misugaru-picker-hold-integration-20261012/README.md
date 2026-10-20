# WP03 Section F Korean misugaru picker hold

## Decision

Keep the prospective Korean misugaru mixed-grain drink powder outside the active ingredient catalog. The product family is supported by historical Korean food documentation, current manufacturer descriptions, and a CFIA survey sample, but the review did not establish a Québec-facing French product name or recipe demand.

The active picker uses phrase-first matching and falls back to substring matching. A future `misugaru` display would therefore match the query `misu`, which the Academy of Korean Studies uses for the prepared beverage made by mixing misugaru with sugar or honey water. Do not add `misu` as an alias or activate the powder row until this search boundary is addressed. The CFIA French sample description is descriptive government wording, not a Québec package label or OQLF term.

## Data disposition

No catalog reference, alias, ledger record, form, measurement, density, unit mapping, yield, recipe link, conversion, or substitution was added. SKU-specific directions of 40 g mixed with 200 mL and 40 g mixed with 180 mL remain product preparation observations in the proposal only; they do not establish a generic measure, density, or recipe ratio. The proposal-local source IDs remain unallocated.

The current manifest has 114 recipes and 1,123 ingredient rows. The proposal's full text and structured-row scan found no misugaru, misutgaru, misu, or candidate descriptive-phrase demand.

## Review and verification

See [the misugaru boundary review](../../proposals/wp03-section-f-misugaru-powder-boundary-review-20261012.md) for the product-family evidence, source register, naming limits, owner audit, picker projection, and recipe scan. Static checks found no exact owner in active references, forms, legacy candidates, or the ledger. This is a documentation-only hold; under the user's database-JSON testing rule, no app, unit, instrumentation, or emulator tests were run.

Section F remains open.
