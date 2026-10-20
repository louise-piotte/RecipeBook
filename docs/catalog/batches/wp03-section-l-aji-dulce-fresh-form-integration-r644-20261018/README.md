# WP03 Section L R644 — ají dulce fresh form

Integrated on 2026-10-18 after root review of the [R644 proposal](../../proposals/wp03-section-l-aji-dulce-fresh-form-review-r644-20261018.md).

## Catalog update

- Added one `fresh` form under the existing `ingredient-ref-aji-dulce-pepper` identity, using labels `fresh ají dulce pepper / piment ají dulce frais` and no match terms.
- Kept the existing reference names, aliases, category, density, and unit mappings unchanged. No species, cultivar, pungency, dried form, recipe link, measurement, conversion, yield, or substitution was added.
- Added three source records and one bounded decision to the existing ledger row. Its measurement and substitution states remain `not_yet_researched`.
- The 114 bundled recipes (1,123 ingredient rows) have no ají dulce match. The external Télé-Québec salsa recipe remains evidence only; its one-pepper quantity and 300 ml yield are not linked or generalized.

## Sources and static validation

- The University of Puerto Rico's 1970 journal article says Puerto Rican ají dulce is widely used fresh and describes whole or cut fresh fruit used to season food and flavor sauces.
- Télé-Québec's *Empanadas de carne mechada* recipe lists finely chopped `piment Aji Dulce` in a salsa mixed in a bowl without a cooking step.
- Semences Ancestrales Québec documents its seller-specific seed-product name; its `Ajicito` wording was not promoted to a global alias.
- Static bundled-package validation passed. The generated ingredient catalog check passed with 1,832 references. Research-ledger JSON Schema validation, source/form ownership, picker projection, recipe-corpus, encoding, local-link, and scoped-whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed because this update only adds database JSON data under `AGENTS.md`.

Section L remains open.
