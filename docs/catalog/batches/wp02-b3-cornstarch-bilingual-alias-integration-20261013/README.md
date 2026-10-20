# WP02 B3 cornstarch bilingual alias integration

Reviewed and integrated on 2026-10-13 from [the proposal](../../proposals/wp02-b3-cornstarch-bilingual-picker-alias-review-20261013.md).

## Decision

Add English `corn starch` and French `amidon de maïs` as aliases on the existing `ingredient-ref-cornstarch` identity. Keep the canonical display `cornstarch / fécule de maïs`. OQLF lists the English and French terms, and matching Metro Canada / Québec listings use them for the same product number. Keep `corn flour` unassigned because its regional starch/flour meanings remain ambiguous without locale-scoped aliases.

No forms, measures, density, mappings, recipes, conversions, or substitutions changed. The existing cornstarch research record now records the alias decision against its existing OQLF source `WP02-S89`. The recipe corpus has nine linked cornstarch lines in eight recipes, and none uses either newly added spelling; no recipe was relinked.

## Files

- Active reference: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- Research evidence: `docs/catalog/research-ledger.v1.json`
- Generated import index: `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`
- Plan and roadmap: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`
- Proposal: [cornstarch alias review](../../proposals/wp02-b3-cornstarch-bilingual-picker-alias-review-20261013.md)

Static reference/package, ownership, picker-projection, generated-index, UTF-8/no-BOM, link, and whitespace checks passed. No tests or emulator checks were run under the database-JSON-only rule in `AGENTS.md`.
