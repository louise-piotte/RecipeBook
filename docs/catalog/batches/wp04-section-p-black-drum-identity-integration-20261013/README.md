# WP04 Section P: black drum identity integration

Added identity-only `ingredient-ref-black-drum` as **black drum / grand tambour** for *Pogonias cromis* in `PROTEIN`, with no aliases. The qualified names are supported by CFIA and OQLF. Bare `drum` and `tambour` remain broad; `sea drum`, `oyster drum`, `grondeur noir`, and `courbine` remain outside the row.

The ledger records the Canadian name, Québec terminology, species identity, and bounded product-state evidence. Health Canada's reviewed CNF search and common-food fish table did not provide a species-matched serving value; the ledger does not infer a measurement from another fish. No forms, measures, density, mappings, conversions, yields, recipe links, or active substitutions were added. The 114-recipe / 1,123-row bundle has no matching demand, and the identity does not claim current Québec retail availability.

After integration, `black drum` and `grand tambour` each select the new species alone. Broad `drum` returns three fish and `tambour` returns two. `oyster drum` and `sea drum` remain unavailable as aliases, so these terms do not broaden unrelated queries.

Static package normalization passed; the generated Kotlin index is current at 1,333 references; the research ledger schema validator passed with 1,641 records and 14 new source IDs; the 114 recipe files had no candidate phrase hits; the seed reference JSON is UTF-8 without BOM and uses escaped Unicode; and scoped `git diff --check` passed. No app tests or emulator checks were run because this change only adds database JSON data and its documentation. Section P remains open.

See the [root-reviewed identity proposal and source register](../../proposals/wp04-section-p-black-drum-grand-tambour-identity-review-20261013.md).
