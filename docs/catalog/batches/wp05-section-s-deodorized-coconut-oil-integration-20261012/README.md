# WP05 Section S — deodorized coconut oil integration

- **Date:** 2026-10-12
- **Disposition:** integrated as one identity-only reference
- **Source proposal:** `docs/catalog/proposals/wp05-section-s-regional-oils-residual-boundaries-followup-20261012.md`

## Decision

Added `deodorized coconut oil / huile de noix de coco désodorisée` under `FAT_AND_OIL`, with the
French alias `huile de coco désodorisée`. The current bilingual Cha’s Organics pages provide the
narrow product ingredient wording and cooking/baking context; Metro supports the French retail
phrase, and OQLF supports the coconut-oil base terminology. The product title “neutral taste” is not
an alias. `refined`, `RBD`, `copra`, `cold-pressed`, `unrefined`, and `virgin` remain outside its aliases.
Generic coconut oil remains unqualified, and virgin coconut oil remains a separate identity.

No recipe row matched. No form, recipe link, measurement, density, unit mapping, conversion, yield,
or substitution was added. The ledger records five sources under
`WP05-OIL-RESIDUAL-20261012-S01..S05`.

## Validation

At this oil/juice checkpoint, before the later stock/broth follow-up, the package had 1,169 references / 85 forms / 114 recipes / 1,123
ingredient rows; 67 legacy candidates; and 1,470 research-ledger records / 4,909 source entries /
4,017 distinct source IDs / 8 unit conversions. Package validation and normalization, ingredient
reference normalization, generated catalog freshness, ledger validation, exact-key ownership,
recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run
because this change only adds database JSON data under `AGENTS.md`.

See the companion [juice integration](../wp05-section-v-juice-identities-integration-20261012/README.md).
