# WP02 / WP03 / WP04 round-three gap-review integration — 2026-10-13

## WP02 A6: Japanese buckwheat-flour wording

Added the English alias `soba-ko` to `ingredient-ref-buckwheat-flour`. The ledger records the accepted hyphenated spelling and keeps fused `sobako` unresolved because it shares the picker key with the distinct, 0%-buckwheat SOBAKO product concept. No French alias, form, measurement, density, mapping, or substitution was added. The broader A6 review remains open.

## WP03 Section F: Bengali flattened-rice wording

Added the English alias `chira` to `ingredient-ref-flattened-rice-poha`. Added four new source entries and reused `WP06-SA-20261010-S19` for the Bangladesh Food Composition Table entries. Recorded the FAO / BBF *Chirar Polao* amount as one published portion observation: 60 g / 3 fistfuls for the complete recipe formula yielding one 230 g cooked bowl and two servings. This is not a per-serving value or a reusable fistful conversion. Measurement research is `researched_supported` for this bounded observation; density remains null, unit mappings remain empty, and substitution research remains blocked. Existing English/French displays, French aliases, and thin/medium/thick forms remain unchanged. Section F remains open.

## WP04 Section P: red king crab boundary

Closed this reviewed subgap as a documented hold. No species-specific `Paralithodes camtschaticus` row or ledger sources were added because CFIA applies broad king-crab labels to multiple taxa, Québec product evidence is genus-level, and the current picker would present the proposed species row for broader searches. Section P remains open.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed; bundled seed package and research ledger are valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — passed; the bundled seed package is normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed; generated Kotlin catalog is current at 1,338 references.
- Focused JSON assertions — passed for both aliases, the five chira source IDs on the poha record, the scoped 60 g observation, unchanged null density/empty mappings, and blocked substitution state.
- Static picker projection — `chira` resolves to flattened rice; `achira starch` remains on canna starch; `soba-ko` resolves to buckwheat flour; held fused `sobako` has no result.
- Current 114-file seed recipe corpus — no `chira` text hits or direct flattened-rice links; this integration edited no recipe files.
- UTF-8 without BOM, mojibake-marker scan, and scoped `git diff --check` — passed for the changed files.
- No app, unit, instrumentation, or emulator tests were run. These changes add database JSON data; the repository rule exempts that work from testing.

## Review packets

- [WP02 A6 `soba-ko` review](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round3.md)
- [WP03 Section F `chira` review](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round3.md)
- [WP04 Section P red king crab hold](../../proposals/wp04-section-p-next-fish-gap-review-20261013-round3.md)
