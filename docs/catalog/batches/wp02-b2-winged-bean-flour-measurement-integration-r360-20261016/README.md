# WP02 Section 04 B2 R360 — winged-bean flour measurement integration

Integrated a narrow measurement update for the existing `ingredient-ref-winged-bean-flour`. Added the untreated flour sample at 0.387 g/mL and the 45%-proteolyzed sample at 0.597 g/mL as separate, source-scoped laboratory bulk-density observations from Narayana and Narasinga Rao (1984). The study abstract does not state the filling or packing protocol. These observations are not household cup weights or transferable conversions.

Kept `defaultDensity` null, `unitMappings` empty, aliases and forms unchanged, and substitution research and recipe links unchanged. The 114-recipe / 1,123-row bundle contains no matching flour demand. The broader WP02 B2/B3 checklist remains open.

## Files updated

- `docs/catalog/research-ledger.v1.json`: one source, one accepted measurement decision, and two observations on the existing flour record.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` and `roadmap.md`: recorded R360 while preserving the open parent checklist.
- The [R360 proposal](../../proposals/wp02-b2-winged-bean-flour-measurement-review-r360-20261016.md): marked integrated.

## Validation

- Research-ledger schema and semantic validation passed; source IDs are unique.
- Seed-package normalization and generated-index freshness checks passed; no recipe part or active reference changed.
- UTF-8 without BOM, local links, and `git diff --check` passed for the scoped changes.
- No software tests, build, or emulator run was performed because this only adds database JSON data under `AGENTS.md`.
