# WP02 B2/B3 Lima bean flour integration — 2026-10-13

## Decision

Added identity-only `ingredient-ref-lima-bean-flour` in `FLOUR_AND_STARCH`:

- English: `lima bean flour`
- Québec French: `farine de haricots de Lima` (provisional)
- aliases: none
- default density: null; unit mappings: empty
- forms, recipe links, conversions, yields, and active substitutions: none

The bilingual Molino Bongiovanni catalogue identifies the product as flour made from Lima beans; a
US consumer listing corroborates the product class but does not establish Québec availability. The
French compound is attested by the supplier, while OQLF supports the base term `haricot de Lima`.
The flour remains distinct from whole Lima beans, generic bean flour, butter-bean terminology,
starch, and protein concentrate.

## Evidence retained without activating behavior

The ledger preserves three bulk-density statements from the Enugu `okpokoro` cultivar study:
0.80 ± 0.02 g/mL for dehulled flour in the table, 0.82 g/mL for dehulled flour in the prose, and
0.88 ± 0.30 g/mL for undehulled flour in the table. The dehulled values conflict within the paper;
none is linked to the commercial product or a household scoop convention.

Two formulation studies remain bounded findings: one tests steeped Lima flour in particular
wheat/sorghum bread blends, and one tests Lima/emmer cookie blends. Neither supports a general flour
replacement rule. The milling description says dried, raw beans; it does not establish that the flour
is ready to eat uncooked or provide a preparation instruction.

The 114 bundled recipes contain no Lima bean flour line. No density, unit mapping, form, recipe link,
yield, or substitution was added.

## Records

- Research packet: [Round 71 WP02 review](../../proposals/wp02-b2-b3-next-open-starch-boundary-review-20261013-r71.md)
- Canonical reference: `ingredient-ref-lima-bean-flour`
- Research ledger: `ingredient-ref-lima-bean-flour`

The database JSON package was normalized and structurally validated. No app tests or emulator checks
were run because this change adds database JSON data. WP02 B2/B3 remains open.
