# WP02 / WP03 / WP05 R424–R426 gap-review integration

**Date:** 2026-10-17
**Scope:** WP02 Section D chocolate presentation; WP03 Section J cassava-root alias; WP05 Section Z prepared condiment.

## Integrated decisions

- **R424 — chocolate chunks:** Hold a generic chocolate-chunks identity and form. Canadian manufacturers sell milk and semi-sweet chunks as distinct shapes, but the bundled recipes do not request a chunk product. The sole French instruction phrase “morceaux de chocolat blanc” belongs to the existing white-chocolate-chips ingredient row. Keep chips forms and recipe text unchanged; do not activate `morceaux de chocolat` as a chunk alias because Québec retail uses it for a Chipits baking-chip product. No catalog or ledger data was added for this hold. See the [proposal](../../proposals/wp02-section-d-chocolate-chunks-boundary-review-r424-20261017.md).
- **R425 — cassava root:** Add `yuca` to both alias arrays of `ingredient-ref-cassava-root` (`cassava root / manioc`). Keep bare `yucca` unassigned because it also names the distinct accepted *Yucca* plant genus. Leave Brazilian regional names and cassava-derived products unchanged. No form, measure, recipe link, conversion, yield, or substitution was added. Update the existing root ledger record with the Mayrand Québec product evidence and accepted alias decision; reuse its OQLF source entry. See the [proposal](../../proposals/wp03-section-j-cassava-yuca-alias-review-r425-20261017.md).
- **R426 — prepared horseradish:** Add identity-only `prepared horseradish / raifort préparé` as `ingredient-ref-prepared-horseradish` in `SAUCE_AND_CONDIMENT`, with empty aliases, null density, and no unit mappings. Keep it separate from fresh horseradish root, wasabi, and unresolved cream-style sauce wording. Add the Health Canada CNF food-code 4891 portions (5 mL = 5.1 g and 15 mL = 15.2 g) as source-specific ledger observations only; do not activate a density, unit mapping, recipe link, yield, or substitution. See the [proposal](../../proposals/wp05-section-z-prepared-horseradish-identity-review-r426-20261017.md).

The 114-recipe / 1,123-ingredient-row corpus has no candidate-specific ingredient demand. Recipe files were not changed.

## Validation

- Bundled seed package validation and normalization check: passed; no bundled part files required normalization.
- Ingredient-reference normalization check: passed.
- Generated ingredient catalog freshness check: passed at 1,724 references.
- Ledger schema and bundled package validation: passed through the package check.
- Picker projection: `yuca` resolves only to cassava root; `yucca` has no result; `prepared horseradish` and `raifort préparé` resolve only to the new row; broad `horseradish` and `raifort` queries return the fresh root and prepared condiment separately. Chunk queries remain unallocated; existing `chocolate chips` still returns the five chocolate-type rows.
- Snapshot totals: 1,724 references, 141 forms, 2,083 ledger records, 9,446 source entries, 8,005 distinct source IDs, and 6,721 distinct source URLs.
- UTF-8 without BOM, escaped accents in bundled seed JSON, local links, and scoped whitespace checks passed.
- The repository-wide `git diff --check` reports trailing whitespace in pre-existing dirty files under `docs/exported-recipe-lists/`; those files are outside this integration. The check scoped to files touched in this batch passes.
- No software tests, builds, emulator checks, or deployment were run. The active data changes add database JSON only, under the `AGENTS.md` exception; R424 is a documentation-only hold.

## Remaining work

The parent checklists remain open: Section D chocolate forms, Section J regional root/tuber and independent Québec terminology coverage, and WP05 sauce and condiment coverage. This batch resolves only the bounded decisions above.
