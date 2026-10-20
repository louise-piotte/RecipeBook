# WP02 Section D R333 — raspberry jam identity review

Reviewed and integrated on 2026-10-16. This review confirms the existing `ingredient-ref-raspberry-jam` identity; it adds no active reference, alias, form, or recipe data.

## Integrated decision

The existing row remains `raspberry jam / confiture de framboises` in `SAUCE_AND_CONDIMENT`, with no aliases, forms, density, or unit mappings. Its research-ledger identity state is now `verified`. Four direct identity sources were added to that ledger record: OQLF's current *confiture* entry, OQLF's Linzer-tart definition, and the English and French Mayrand pages for Bonne Maman item 05781. The OQLF entry gives English *jam* and says fruit complements are generally plural; the Linzer definition uses the exact phrase `confiture de framboises`. The same Mayrand SKU is titled `Raspberry Jam` in English and `Confiture de framboise` in French.

The retail singular remains unallocated as an explicit alias. Current phrase-first picker projection resolves `confiture de framboise` by partial matching to the raspberry-jam row alone, so an alias would not improve reachability. The canonical French display stays plural.

The manifest has 114 recipes and 1,123 ingredient rows. Recipe 010 has the only direct raspberry-jam line: authored `120 ml raspberry jam`, already linked to `ingredient-ref-raspberry-jam`. Its link, amount, unit, and text remain unchanged. This formula amount is not a mass equivalence or generic measure. The existing strawberry-jam alternative from R326 stays under the strawberry-jam ledger owner and is not duplicated.

Measurement and substitution research remain `not_yet_researched`. Density remains null; unit mappings and forms remain empty. No generic conversion, yield, or active substitution was added.

## Source links

- [OQLF, confiture (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059918/confiture): product-class definition, English *jam*, and general plural-complement note.
- [OQLF, linzertorte (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17038879/linzertorte): Quebec baking definition that uses `confiture de framboises`.
- [Mayrand, Raspberry Jam 250 ml](https://mayrand.ca/en/our-products/grocery/jam-and-spread/jelly-and-jam/confiture-de-framboises-bonne-maman-05781): English name, item 05781, SKU package listing.
- [Mayrand, Confiture de framboise 250 ml](https://mayrand.ca/fr/nos-produits/epicerie/confiture-et-tartinade/gelee-et-confiture/confiture-de-framboises-bonne-maman-05781): French singular product title for the same item.

The existing reference and recipe records were inspected read-only. A static projection following `IngredientSearch.kt` returned the raspberry-jam row alone for `raspberry jam`, `confiture de framboises`, and `confiture de framboise`; broader `framboise` and `confiture` queries returned 3 and 4 rows, respectively. A scan of the manifest-listed recipe files found one recipe-file hit, recipe 010.

The combined R333/R334 catalog state was statically validated: the bundled package is valid and normalized, the reference normalizer reports no changes, the generated index is current, and ledger validation reports 2,031 records with zero errors. Exact picker projection and the 114-recipe / 1,123-row corpus scan passed. JSON encoding, links, and whitespace checks passed. No software tests, builds, or emulator checks were run because this work only adds identity research data to database JSON and updates catalog tracking documentation, under the JSON-only exception in `AGENTS.md`.
