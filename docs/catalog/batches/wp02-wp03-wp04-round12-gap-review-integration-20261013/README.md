# WP02 / WP03 / WP04 round-twelve gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — Mabele / Amabele:** held `mabele`, `mabele meal`, `mabele flour`, `amabele`, `amabele flour`, and Canadian spelling `mabela` outside active aliases. Added unresolved source-backed decisions to the existing grain-sorghum, sorghum-flour, and pearl-millet ledger records. The record identities, displays, aliases, research states, observations, findings, measures, forms, recipe links, and substitutions remain unchanged.
- **WP03 Section F — finger millet rava / ragi rava:** added ledger-only `candidate-finger-millet-rava` with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: researched_no_supported_substitute`. No active reference or alias was added because a Québec French product display remains unsupported.
- **WP04 Section P — Manila clam:** held a species-specific active row because CFIA maps `Manila Clam` and `Palourde Japonaise` to more than one clam taxon, so the current picker would return a misleading singleton for broad `clam` and `palourde` searches. The generic clam candidate remains unchanged. This review made no catalog or ledger change.

## Shared data changes

Only `docs/catalog/research-ledger.v1.json` changed for shared database data. The two Mabele boundary reviews registered eight new source IDs across three existing records (15 source occurrences). Finger-millet rava registered five new source IDs plus two existing reused source IDs on its new candidate (7 source occurrences). No measurement observations, substitution findings, active references, forms, recipe links, or unit conversions were added.

Post-integration ledger counts: 1,655 records, 6,385 source entries, 5,353 distinct source IDs, 342 measurement observations, and 192 substitution findings. Active references remain at 1,343; the generated Kotlin index remains unchanged.

## Verification

Static package validation, ledger schema, focused source-link checks for changed records, unchanged active-reference/form hashes, picker-ownership projections, recipe-corpus fingerprint, UTF-8, and whitespace checks passed. No Android tests or emulator checks were run because the shared data change only adds research-ledger JSON data, consistent with the workspace rule.

The active checklist and roadmap record these dispositions. The broad A6, Section F, and Section P items remain open. See the linked WP02, WP03, and WP04 round-twelve proposals for evidence and revisit conditions.
