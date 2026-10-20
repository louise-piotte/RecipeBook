# WP02 B3 pea starch identity integration

- **Date:** 2026-10-12.
- **Status:** Integrated as one identity-only ingredient reference and one research-ledger record.
- **Proposal:** [WP02 B3 pea starch identity review](../../proposals/wp02-b3-pea-starch-identity-review-20261012.md).

## Accepted catalog scope

Added `ingredient-ref-pea-starch` as `pea starch / amidon de pois`, category `FLOUR_AND_STARCH`, with the narrow English alias `native pea starch`. The Québec French display remains provisional: Canadian food-market evidence and Montréal food labeling support the phrase, but no exact OQLF entry was found. No French aliases were added.

The row has no forms, density, unit mappings, recipe links, conversions, yield, or substitutions. Pea flour, whole and split peas, pea protein, pea fibre, and other starch identities remain separate. Evidence for native starch does not define every cultivar or modified pea-starch product.

## Search and recipe audit

The picker source uses complete normalized phrase matching before partial matching. The static phrase audit found:

- `pea starch`, `amidon de pois`, and `native pea starch` resolve to the new row alone.
- Broad `pea` increases from 6 to 7 results and broad `pois` from 18 to 19; existing results remain present.
- `peas`, `green pea(s)`, `yellow pea(s)`, and `farine de pois` keep their prior behavior. `pois jaunes` still returns dried yellow peas and yellow split peas; `petits pois` still returns frozen peas and carrots plus green peas.

The full bundled corpus has 114 recipes and 1,123 ingredient rows, with no exact pea-starch recipe demand. No recipe row was changed.

## Evidence limits

The ledger records five sources: AAFC market reporting and Canadian food labels support ingredient wording; a current Canadian-origin supplier page supports the English `native pea starch` alias; the CFIA definition is explicitly scoped to livestock feed and supplies no human-food numeric property. Supplier nutrition values, feed thresholds, and market counts were not used as catalog measurements.

## Verification

After integration the package has 1,247 references / 94 forms / 114 recipes / 1,123 ingredient rows. The ledger has 1,554 records / 5,396 source entries / 4,434 distinct source IDs / 0 errors. Static package normalization, reference normalization, generated-index freshness, and ledger validation passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Québec terminology follow-up

The subsequent [Québec terminology review](../../proposals/wp02-b3-pea-starch-quebec-term-adjudication-20261012.md) confirmed the existing `amidon de pois` display, rejected `fécule de pois` as an alias, and updated the existing ledger decision without changing the active reference. See the [follow-up integration record](../wp02-b3-pea-starch-quebec-terminology-integration-20261012/README.md).
