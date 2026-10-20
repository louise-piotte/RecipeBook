# WP05 mushroom-seasoning identity integration

## Decision

Added identity-only `mushroom seasoning / assaisonnement aux champignons` in `BAKING_AND_SPICE`, with no aliases. The identity applies to savory products explicitly named or marketed as mushroom seasoning. Product examples vary in mushroom species, salt and flavourings, extracts, and physical presentation, so no universal formula, format, nutrition profile, or amount is implied.

Kept mushroom powder, mushroom bouillon, mushroom gravy and sauce mixes, MSG, yeast extract, seasoning salt, and broader umami blends separate. No bundled recipe line matches the reviewed phrases. No recipe link, form, density, unit mapping, package yield, conversion, or substitution was added. See the [identity and mixture-boundary review](../../proposals/wp05-mushroom-seasoning-mixture-boundary-review-20261011.md).

## Files and verification

Added one active reference and one verified identity-ledger record with nine scoped sources, then updated the plan and roadmap. Before integration, the live package had 1,038 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger had 1,330 records / 4,371 source entries / 3,604 distinct source IDs. Exact normalized-name, form, and legacy collisions were zero; the full recipe scan found zero phrase matches; the nine source IDs were unused.

Structural package validation, reference normalization, generated-index freshness, ledger validation, encoding, and whitespace checks passed. No tests or emulator were run for this database JSON addition.
