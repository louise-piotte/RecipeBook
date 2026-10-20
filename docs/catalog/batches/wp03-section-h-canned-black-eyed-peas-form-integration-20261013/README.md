# WP03 Section H canned black-eyed peas form integration — 2026-10-13

## Decision

Added `ingredient-form-black-eyed-peas-canned-with-liquid` under the existing
`ingredient-ref-black-eyed-peas` identity:

- English: `canned black-eyed peas with liquid`
- Québec French: `doliques à œil noir en conserve, avec le liquide`
- form code and preparation state: `canned_with_liquid` / `with_liquid`
- match terms: `canned black-eyed peas` / `pois à œil noir en conserve`
- density and active unit mappings: none
- bundled recipe links, package yields, conversions, and substitutions: none

The current Walmart Canadian product page names peas and water and instructs consumers to drain
and rinse before serving. Loblaws lists a Québec French 540 mL canned product. These support a
canned product state with packing liquid; neither package volume nor a drained-bean yield is
inferred. The bundle has no black-eyed-pea ingredient line, so no recipe link was added.

## Source-specific CNF observations

Health Canada CNF food code 3284 explicitly describes canned plain black-eyed peas, solids and
liquid. Its serving-size record reports:

- 100 mL = 101.4 g
- 125 mL = 126.8 g
- 175 mL = 177.5 g
- 250 mL = 253.6 g

The ledger retains each pair as a food-code-specific published portion observation. They do not
establish density, a general volume mapping, drained mass, or 540 mL can yield. The later drained
and rinsed state remains separate. The federal canned-legume specification provides qualitative
readiness and texture context, not a substitution ratio.

## Records

- Research packet: [R72 WP03 review](../../proposals/wp03-section-h-next-uncovered-pulse-identity-review-20261013-r72.md)
- Form and ledger record: `ingredient-form-black-eyed-peas-canned-with-liquid`
- Parent identity remains: `ingredient-ref-black-eyed-peas`

The database JSON package was normalized and structurally validated, and the generated ingredient
catalog was refreshed. No app tests or emulator checks were run because this change adds database
JSON data. Section H remains open.
