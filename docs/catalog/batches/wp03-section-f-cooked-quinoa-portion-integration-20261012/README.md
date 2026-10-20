# WP03 Section F: Cooked-quinoa portion evidence

## Integration

Added four source-version-specific portion observations to the existing
`ingredient-form-quinoa-cooked` research-ledger record:

- Health Canada CNF 2015 food code 5917: 100 mL = 78.2 g, 125 mL = 97.7 g, and 250 mL = 195.5 g.
- Health Canada's 2008 *Nutrient Value of Some Common Foods*: 125 mL = 73 g for its ready-to-eat household portion.

The 2008 and 2015 values remain separate. No value was averaged or promoted to active density,
unit mapping, conversion, or cooking yield. Recipe 016#1 remains linked to cooked quinoa with its
existing quantity and wording.

## Open source check

Health Canada says the CNF 2026 relational files are the current dataset and the online CNF 2015
search is an interim access method. The item-level 2026 Food Name and Measure Weight Conversion
CSVs returned 403 through the available browser tool, so the cooked-quinoa `measurementState`
remains `not_yet_researched` and the plan item remains open until those rows can be checked.

## Validation

- The research ledger and bundled package validate; the generated ingredient catalog remains current.
- Source IDs resolve, and the existing form/reference ownership and recipe link remain unchanged.
- UTF-8/no-BOM and scoped whitespace checks pass.
- No app or emulator tests were run because this change only adds research data to JSON files.

See the [full proposal and source register](../../proposals/wp03-section-f-cooked-quinoa-portion-evidence-review-20261012.md).
