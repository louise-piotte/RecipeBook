# WP02 Section A7 R662 — malted-rye-flour portion integration

Recorded Briess's published **3/4 cup (98 g)** amount of BriesSpecialty Malted Rye Flour L100 in its *Malted Rye Rolls* formula as one `portion_weight` observation on the existing `ingredient-ref-malted-rye-flour` research-ledger row. The [manufacturer PDF](https://food.briess.com/wp-content/uploads/2019/05/Briess_Recipes_MaltedRyeRolls.pdf) presents the volume and mass in adjacent columns on the same ingredient row; Briess's [current malted-flour page](https://food.briess.com/products/briess-specialty-malt-flours/) lists MRF L100 as malted rye flour.

The paired amounts remain product- and formula-specific. No cup convention, density, reusable conversion, general measure, serving amount, or substitution is inferred. Existing product-page source S08 and its metadata are reused without change. The ledger row's `measurementState` is now `researched_supported`; its active reference, aliases, null density, empty mappings, forms, recipe links, and substitution state remain unchanged.

## Static validation

- Research-ledger schema and custom validation passed with zero errors.
- New source and observation IDs were unique; the PDF URL had no prior exact ledger owner and now has one. The existing Briess product-page URL remains attached to its previously owned records.
- The 114-recipe / 1,123-row bundle had no matching recipe demand; no recipe link or seed catalog change was made.
- No software tests, build, emulator run, or deployment were performed for this database-JSON-only ledger update under `AGENTS.md`.

See the [R662 proposal](../../proposals/wp02-a7-malted-rye-flour-portion-review-r662-20261018.md). Section A7 remains open.
