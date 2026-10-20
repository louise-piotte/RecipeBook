# WP06 African regional R512 integration — uziza leaves

**Date:** 2026-10-17
**Review:** [R512 proposal](../../proposals/wp06-african-next-regional-review-r512-20261017.md)

## Disposition

Added identity-only `uziza leaves / feuilles d’uziza` as `ingredient-ref-uziza-leaves` in `HERB`,
with `uziza leaf` as its only English alias. Scope the identity to *Piper guineense* leaves used
as a Southeast Nigerian seasoning. Keep the French display provisional: a Montréal-facing seller
uses the phrase, but it is not an OQLF ruling or a standardized Québec term.

The 2023 Southeast Nigerian food study identifies *P. guineense* as uziza and describes leaf use
in pepper soup; a current Canadian listing names `Uziza Leaves (Piper guineense)`. The reused FAO
trade survey lists uziza only at *Piper* genus scope, which does not establish species identity.
Keep the fruit/seed spice, broad `African pepper` / `Guinea pepper` names, and other *Piper*
species separate.

The bundled recipe corpus has no matching demand across 114 manifest recipes and 1,123 ingredient
rows. No forms, measures, density, unit mappings, conversions, yields, recipe links, or active
substitutions were added. Measurement research records no supported reusable value; substitution
research remains open.

## Static validation

- Picker projection returns the new row for `uziza leaves`, `uziza leaf`, `feuilles d’uziza`, and
  broad `uziza`. The result display remains leaf-qualified. `uziza seeds` remains unassigned.
- `pepper` and `poivre` searches are unchanged; `leaves` increases from 33 to 34 results and
  `feuilles` from 41 to 42.
- Seed-package normalization and validation, research-ledger schema/source ownership, and
  generated-index freshness passed. UTF-8/no-BOM, explicit escaped seed Unicode, local links, and
  scoped whitespace checks passed.
- Post-integration snapshot: 1,787 references / 143 forms / 56 legacy candidates; 2,144 ledger
  records / 9,840 source entries / 8,327 distinct source IDs / 7,037 distinct URLs.

No software tests, build, emulator check, or deployment were run because the only application data
change adds database JSON under `AGENTS.md`.
