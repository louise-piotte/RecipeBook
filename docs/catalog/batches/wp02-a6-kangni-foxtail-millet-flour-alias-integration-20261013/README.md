# WP02 A6: Kangni alias integration for foxtail millet

Added `kangni` to the existing `ingredient-ref-foxtail-millet` English aliases and `kangni flour` to `ingredient-ref-foxtail-millet-flour`. The existing bilingual displays remain unchanged. IIMR lists Kangni as the Punjabi name for foxtail millet; Canadian product listings support the qualified flour phrase and connect the term to the same source grain.

The `hari kangni` family remains unassigned to preserve the separate brown-top candidate hold. `kangani` and `kangni atta` remain inactive because the reviewed Canadian products support Kangni/Kangni Flour, not those spellings or constructions. No form, measurement, density, unit mapping, conversion, yield, recipe link, or substitution rule changed. The 114-recipe / 1,123-row bundle has no matching demand.

After integration, `kangni flour` selects the foxtail-millet-flour row alone, while bare `kangni` offers both foxtail-millet grain and flour. `hari kangni`, `hari kangni flour`, `kangani`, and `kangni atta` remain unavailable as aliases. Existing `thinai` and French search behavior is unchanged.

Static package normalization passed; the generated Kotlin index is current at 1,333 references; the research ledger schema validator passed with 1,641 records; source IDs are unique for this batch; the 114 recipe files had no candidate phrase hits; the seed reference JSON is UTF-8 without BOM and uses escaped Unicode; and scoped `git diff --check` passed. No app tests or emulator checks were run because this change only adds database JSON data and its documentation. WP02 A6 remains open.

See the [review proposal and source register](../../proposals/wp02-a6-kangni-foxtail-millet-flour-alias-review-20261013.md).
