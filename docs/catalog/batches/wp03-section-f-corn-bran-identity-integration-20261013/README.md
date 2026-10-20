# WP03 Section F: corn bran identity integration

Added identity-only `ingredient-ref-corn-bran` as **corn bran / son de maïs** in `GRAIN_AND_CEREAL`, with no aliases. It remains separate from oat, rice, and wheat bran; rice-bran oil; cornmeal and corn flours; isolated corn fibre; and prepared cereals containing corn bran.

The ledger records CFIA's naming and fibre-claim boundary, Cargill's food-ingredient product, and current French-Canadian cereal-label wording. The 60–65% fibre statement and Quaker Corn Bran Squares serving values remain source-specific evidence; no general measure, density, mapping, form, conversion, yield, recipe link, or active substitution was added. The 114-recipe / 1,123-row bundle has no matching demand.

After integration, `corn bran` and `son de maïs` each select the new row alone. Broad `corn` and `maïs` return 15 and 19 results; `bran` and `son` return six and five. The English and French source-qualified names do not absorb broad search terms.

Static package normalization passed; the generated Kotlin index is current at 1,333 references; the research ledger schema validator passed with 1,641 records and 14 new source IDs; the 114 recipe files had no candidate phrase hits; the seed reference JSON is UTF-8 without BOM and uses escaped Unicode; and scoped `git diff --check` passed. No app tests or emulator checks were run because this change only adds database JSON data and its documentation. Section F remains open.

See the [identity review and source register](../../proposals/wp03-section-f-corn-bran-identity-review-20261013.md).
