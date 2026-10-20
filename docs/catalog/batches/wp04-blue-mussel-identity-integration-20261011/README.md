# WP04 blue mussel identity integration — 2026-10-11

## Decision

Add a species-specific identity for *Mytilus edulis*: `blue mussel / moule`. OQLF lists `moule` as the preferred Québec term in the food-mollusc domain and links it to *M. edulis*. DFO names blue mussel as the single mussel species harvested in Canada. CFIA Fish List and current Metro product pages corroborate the English and French species/product names.

Use only `blue mussels`, `moule bleue`, and `moules bleues` as search aliases. The French aliases are attested species-qualified market terms; `moule` remains the preferred display. Do not use `edible mussel`, bare plural `mussels` / `moules`, `moucle`, `mouque`, or the scientific name as aliases.

Keep the generic `ingredient-ref-mussel` candidate unresolved. DFO's harvest statement does not make every imported product or unqualified recipe request the same species. CFIA separately lists *Mytilus chilensis* and *M. galloprovincialis*. The bundled recipe scan found no exact mussel ingredient line, so no recipe was linked.

## Changes

- Added identity-only `ingredient-ref-blue-mussel` to `ingredient-references.v1.json`, category `PROTEIN`, with null density and no unit mappings.
- Added the new verified reference record with six scoped sources. Added three relevant sources and an unresolved decision to the existing generic mussel candidate.
- Regenerated `BundledIngredientCatalog.kt` at 1,031 references.
- Marked the focused species identity task complete in the Section P checklist; broader shellfish and Section P work remains open.
- No forms, recipe links, quantities, measurements, conversions, yields, or substitutions changed.

## Validation

- Reference normalizer completed; bundled package and reference structure validated.
- Generated ingredient catalog freshness passed at 1,031 references.
- Research ledger schema passed with 1,322 records, 4,308 source entries, and 3,541 distinct source IDs. The blue-mussel identity record has six sources; the generic mussel candidate remains `needs_clarification`.
- Active reference/form/legacy collision and 114-recipe / 1,123-row demand audit found no exact pre-existing blue-mussel owner or ingredient line. The intentional preferred display `moule` is OQLF's species-scoped term for this reference.
- UTF-8/no-BOM and targeted whitespace checks passed.
- No tests or emulator were run because this change only adds database JSON data under `AGENTS.md`.

The broad shellfish and fish product-state checklist remains open.
