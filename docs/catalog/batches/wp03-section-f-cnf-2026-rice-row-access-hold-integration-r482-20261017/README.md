# WP03 Section F R482 — CNF 2026 rice row access hold

Accepted the bounded hold in the [R482 proposal](../../proposals/wp03-section-f-next-gap-review-r482-20261017.md).

Health Canada's overview lists the CNF 2026 relational CSV files and says the 2015 online CNF remains available as an interim measure. The Open Government listing identifies the Food Name, Measure Weight Conversion, Measure Name, and Measure Type files. Direct access to the 2026 CSV rows was unavailable during this review. The visible Health Canada Food Code 4523 serving page is the legacy 2015 site, so it cannot establish 2026 row presence or values.

The three existing CNF 2015 observations on `ingredient-form-rice-cooked` remain unchanged: 100 mL = 66.8 g, 125 mL = 83.5 g, and 250 mL = 166.9 g. No reference, form, ledger observation, measure, conversion, yield, substitution, recipe link, picker term, or generated index changed. The dedicated CNF 2026 row-inspection checkbox remains open until the food row and its joined measure rows can be inspected directly.

The proposal rechecked the live catalog counts, source-ID/URL ownership, picker queries, rice-linked recipe lines, and the manifest-ordered corpus fingerprint. No app tests or emulator checks were run because this hold made no database JSON change and did not change application code.
