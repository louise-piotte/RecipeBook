# WP02 A7 malted-sorghum-flour boundary integration

Reviewed 2026-10-13. Added one unresolved research-ledger candidate:
`candidate-malted-sorghum-flour`. No active ingredient reference, alias, form, recipe link,
measurement, density, unit mapping, conversion, yield, substitution, generated index, or application
code changed.

## Decision

Tanzania's compulsory standards list names **Malted sorghum flour — Specification** (TZS
4019:2025), and one study distinguishes a malted-flour process from a separate fermented-flour
process. This establishes a source-named candidate, not a Canadian/Québec product or Québec French
display. The only Canada-facing bilingual wording found is an unavailable marketplace listing whose
title says fermented sorghum flour while its package image says malted sorghum flour. Rwanda FDA
separately records an Akanozo fermented sorghum flour; the sources do not establish whether the
listing image and registered SKU are identical. Keep the candidate separate from plain sorghum flour,
generic malt flour, and other cereal-specific malted flours. Add no active name, measurement,
conversion, form, or substitution. See the
[R36 proposal](../../proposals/wp02-a7-malted-sorghum-flour-boundary-review-20261013-round36.md).

## Static checks

- The research-ledger validator accepted all 1,699 records with zero errors. Six source IDs are
  unique, and the candidate decision links to every source.
- Active-reference, form, legacy, and ledger projections found no exact owner for the malted-sorghum
  phrases. `sorghum flour / farine de sorgho` remains owned by the existing plain-flour row.
- The scan of every manifest-listed recipe found zero matches in 114 files / 1,123 ingredient rows.
- Package validation, ingredient-reference normalization, and generated-index freshness checks
  passed; the index remains at 1,365 active references.
- Changed files are UTF-8 without BOM; the ledger stores non-ASCII values as explicit Unicode
  escapes. Relative links resolved and scoped `git diff --check` passed.

No tests were run because the change only adds database JSON candidate data and documentation under
`AGENTS.md`.
