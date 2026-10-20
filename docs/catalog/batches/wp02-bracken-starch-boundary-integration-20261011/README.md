# WP02 bracken-starch boundary integration — 2026-10-11

## Decision

Keep pure bracken-rhizome starch as an unresolved candidate. MAFF and a primary study support a distinct starch identity from *Pteridium aquilinum*. The OQLF entry supports Québec French plant terminology, but not a starch product name. Current Canadian `warabi-ko` listings describe blends containing only a small amount of true bracken starch alongside lotus-root and processed starches. No standalone Canadian package for pure bracken starch with a Québec French product name was established.

## Changes

- Added `candidate-bracken-starch` to the research ledger with seven source records and an unresolved identity decision.
- Marked the focused bracken-starch review complete in the B3 checklist; the broader regional-starch checklist remains open.
- Kept the active reference catalog, forms, recipes, aliases, measurements, conversions, yields, and substitutions unchanged.
- Updated the research proposal with the reviewed OQLF source and the shared-worktree audit snapshot.

The source-to-claim map and collision/recipe audit are in [`wp02-b2-b3-next-open-flour-starch-review-20261011.md`](../../proposals/wp02-b2-b3-next-open-flour-starch-review-20261011.md).

## Verification

- Bundled package normalization check and validation passed.
- Ingredient-reference normalization check and generated Kotlin catalog freshness passed.
- Research-ledger schema validation passed with 1,319 records, 4,287 source entries, and 3,523 distinct source IDs; the new candidate has seven unique source IDs.
- Targeted exact-name collision scan found no active reference, form, or legacy owner; the manifest-listed recipe scan found no matching recipe or ingredient rows (114 recipes / 1,123 rows).
- UTF-8/no-BOM and escaped-Unicode checks passed for the updated ledger; targeted whitespace checks passed.
- No tests or emulator run: the change only adds research data to the JSON ledger and updates its checklist documentation, under the current `AGENTS.md` data-only exemption.

At the bracken-starch integration checkpoint, before the later pinto-form update, the package had 1,029 references / 71 forms / 114 recipes / 1,123 ingredient rows. The active references, forms, manifest, and generated Kotlin catalog retained their hashes from the pre-integration snapshot; the ledger SHA-256 was `77b92a44dfb83bfef231ac5edcdcf1671505bb71284a6a0d7c9b307d7d8a883d`.
