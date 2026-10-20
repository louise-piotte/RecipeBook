# WP03 Section L R675 — whole dried Ancho form integration

Integrated 2026-10-18. Added whole dried Ancho as `ingredient-form-poblano-pepper-whole-dried-ancho` under the existing `ingredient-ref-poblano-pepper` identity.

## Naming and search

OQLF identifies dried Poblano as `piment ancho / ancho pepper`; Canadian whole-product listings confirm the whole presentation. The form uses `piment ancho entier séché / whole dried ancho pepper`, with the exact English form term `ancho` plus `ancho pepper(s)`, and French `piment ancho / piments anchos` terms. Bare `ancho` is a form match, not a parent alias, so it now returns Poblano with the dried-form hint instead of four unrelated substring matches for anchovy products. Ground Ancho remains outside this whole form.

## Data change

- Added one `whole_dehydrated` form with `prepState: dry`; density remains null.
- Added one form-level research-ledger record with verified identity and `researched_no_supported_value` / `researched_no_supported_substitute` states.
- Reused the existing R136 OQLF, Esslinger, and Club House source IDs. Added the Québec indexed Moulin aux Épices product title and Gaia Organics bilingual seed listing under two new R675 source IDs; neither package quantity nor seed-product measurements were generalized.
- The bundled corpus contains no Ancho/Poblano recipe demand. No reference, parent alias, measurement observation, conversion, yield, recipe link, or substitution rule was added.

## Validation

Static package, ledger schema/custom, ID/URL ownership, picker projection, recipe-corpus, encoding, local-link, and whitespace checks passed. No software tests, build, emulator, or deployment were run because this update only adds database JSON data under [AGENTS.md](../../../../AGENTS.md).

At integration time the package contained 1,837 references, 168 forms, and 114 bundled recipes / 1,123 ingredient rows. The ledger contained 2,214 records.
