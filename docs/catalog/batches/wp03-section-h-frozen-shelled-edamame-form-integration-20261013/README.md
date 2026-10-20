# WP03 Section H frozen-shelled edamame form integration — 2026-10-13

## Decision

Added `ingredient-form-edamame-frozen-shelled` under the existing
`ingredient-ref-edamame` identity:

- English: `frozen shelled edamame`
- Québec French: `edamames écossés surgelés`
- match terms: `shelled edamame` / `edamames écossés`
- preparation state: `frozen`; density: null
- active mappings, package yields, recipe links, and substitutions: none

Metro lists the same 450 g product number in English and French, and three Metro Québec recipes
specify frozen, shelled edamame. The bundle itself has no edamame ingredient row, so no recipe line
was linked. In-pod edamame remains outside this form.

## Measurement boundary

Health Canada CNF 2015 food code 6217 lists these generic frozen, unprepared edamame portions:

- 100 mL = 49.9 g
- 125 mL = 62.3 g
- 250 mL = 124.7 g

The online entry does not state whether the beans are shelled or pod-on, and its refuse section is
blank. These weights are retained on the parent edamame ledger record only. No shell-state or refuse
adjustment is inferred, and the values are not attached to the frozen-shelled form. The form's
measurement status remains blocked pending exact-form evidence; density and unit mappings remain
empty.

CNF food code 2208 explicitly describes raw edamame with 47% pod refuse. That raw value is recorded
only as a comparison and is not transferred to code 6217 or the new form. Recipe volumes and the
retail package weight do not establish a reusable mass conversion or package yield.

## Records

- Research packet: [Round 71 WP03 review](../../proposals/wp03-section-h-next-uncovered-pulse-identity-review-20261013-r71.md)
- Form: `ingredient-form-edamame-frozen-shelled`
- Generic CNF serving observations: `ingredient-ref-edamame`

The database JSON package was normalized and structurally validated. No app tests or emulator checks
were run because this change adds database JSON data. Section H remains open.
