# WP02 B2 sacred lotus seed flour identity integration — 2026-10-13

## Decision

Added identity-only `ingredient-ref-lotus-seed-flour` in `FLOUR_AND_STARCH`:

- English: `sacred lotus seed flour (Nelumbo nucifera)`
- provisional Québec French: `farine de graines de lotus sacré (Nelumbo nucifera)`
- aliases, forms, active density, unit mappings, recipe links, conversions, yields, and substitutions: none

Primary food studies document flour made from *Nelumbo nucifera* seed cotyledons for cooked noodle
and baked biscuit formulations. They do not establish a current Canadian retail flour product,
a universal flour process, or raw ready-to-eat use. The new reference remains separate from whole
sacred-lotus seeds, lotus root, lotus-root starch, and *Euryale ferox* makhana.

## Whole-seed picker guard

Added the English alias `sacred lotus seed` to the existing `ingredient-ref-lotus-seeds` so
singular `lotus seed` and `sacred lotus seed` searches return both the whole-seed and seed-flour
identities. Without it, the flour row would win the complete-word-phrase pass and suppress the
whole-seed substring result. No French singular alias was added; that query remains unresolved
pending Québec terminology review. The broad `lotus` query returns distinct root, root-starch,
whole-seed, and seed-flour results.

## Sample-only flour measurements

The 2022 University of Agricultural Sciences study reports two laboratory bulk-density values
for its specific seed-coat-removed sample, dried at 60°C, milled, and sieved through 72 µm mesh:

- loose-filled: 0.50 g/mL
- gently tapped/packed: 0.58 g/mL

Both observations remain in the research ledger only. Active density and unit mappings remain
empty; these values are not household measures or a retail-grade density. The study-specific
noodle and biscuit replacement ratios also remain inactive as substitutions. The bundle has no
matching lotus-seed-flour recipe line, so no recipe link was added.

## Records

- Research packet: [R72 WP02 review](../../proposals/wp02-b2-b3-next-open-flour-starch-boundary-review-20261013-r72.md)
- New reference and ledger record: `ingredient-ref-lotus-seed-flour`
- Existing whole-seed reference with the singular English search alias: `ingredient-ref-lotus-seeds`

The database JSON package was normalized and structurally validated, and the generated ingredient
catalog was refreshed. No app tests or emulator checks were run because this change adds database
JSON data. Section B remains open.
