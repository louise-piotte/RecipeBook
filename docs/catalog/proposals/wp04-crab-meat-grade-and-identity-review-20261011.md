# WP04 crab-meat identity and jumbo-lump grade review

- **Review date:** 2026-10-11.
- **Question:** Keep the sole crab ingredient request searchable without treating a named grade as the generic crab identity or inferring a species.
- **Disposition:** Use `crab meat / chair de crabe` as the broad edible-product reference. Represent Jumbo Lump as a named form. Keep species, measurement, density, conversion, yield, and substitution behavior unset.
- **Corpus target:** Recipe 019, “Crab Balls,” ingredient row 8: `1 lb jumbo lump crab meat`.

## Source-to-claim register

| Source | Evidence used | Limit |
|---|---|---|
| [OQLF, crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488189/crabe) | Defines the broad animal term across multiple decapod families. | Retained from the prior Section P review to keep the animal/species boundary source-backed; it does not name the edible product or establish a single crab species. |
| [OQLF, chair de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488141/chair-de-crabe) | Pairs the preferred French term `chair de crabe` with English `crab meat`. Its note describes an international-trade term for canned white crab meat and names multiple species. | Supports the generic bilingual food name, not a species assignment, fresh/canned equivalence, or measurement. |
| [Avocados from Mexico Canada, Sandwichs de crabe, d’avocat et de cresson](https://avocadosfrommexico.ca/fr/recettes/sandwichs-de-crabe-davocat-et-de-cresson/) | Current Canadian French culinary usage applies `chair de crabe` to fresh cooked pieces and drained pasteurized canned pieces. | Canadian French usage, not a Québec terminology authority; no species or conversion is inferred. |
| [OQLF, similicrabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199054/similicrabe) | Defines `similicrabe` as a surimi imitation product. | Used to keep imitation crab separate; it is not an alias or substitution source. |
| [Phillips Seafood, Information and Tips on Crab and Crab Meat Grades](https://www.phillipsfoods.com/tips-tricks/all-about-crabs/) | Describes Jumbo Lump as a distinct grade made from two large muscles connected to the swimming fins. | Manufacturer/industry grade description; no crab species or grade conversion is inferred. |
| [Eat Yourself Skinny, Baked Crab Cake Bites with Sriracha Dipping Sauce](https://www.eatyourselfskinny.com/baked-crab-cake-bites-with-sriracha-dipping-sauce/) | Current publisher page specifies 1 pound jumbo lump crab meat and instructs readers to preserve the large lumps during mixing. | Corroborates the named grade and handling context only. This is not treated as an archived copy of the imported recipe or as a general measure. |

## Catalog and recipe decision

| Item | Result |
|---|---|
| Generic reference | `ingredient-ref-crab`: English `crab meat`, French `chair de crabe`, category `PROTEIN`, no aliases, density, or unit mappings. |
| Grade form | `ingredient-form-crab-jumbo-lump`: English `jumbo lump crab meat`, French `chair de crabe en gros morceaux (jumbo lump)`, code `jumbo_lump`; no preparation state or numeric behavior. The French label is a descriptive rendering that retains the source grade name, not an official French grade translation. |
| Recipe 019 row 8 | `ingredientRefId` now points to `ingredient-ref-crab`; `ingredientFormId` points to `ingredient-form-crab-jumbo-lump`. Original ingredient text, ingredient name, quantity, unit, and order remain unchanged. |
| Retired identity | `ingredient-ref-jumbo-lump-crab-meat` is removed; the grade no longer owns the generic `crab meat` search phrase. |
| Species/product boundary | No species is chosen. Imitation crab remains distinct. Whole-crab terms `crab` and `crabe` are not added as aliases. |
| Numeric and substitution behavior | No density, mapping, measurement observation, form conversion, package yield, or substitution is added. The source recipe’s `1 lb` is preserved without deriving a volume or edible-yield rule. |

The bundled picker search index includes form labels in reference search. Therefore `jumbo lump crab meat` returns the generic crab-meat reference and its complete form phrase can set the Jumbo Lump form hint. A generic `crab meat` search returns the same reference without selecting a grade form. The regression coverage checks both search and the saved recipe link.

## Verification

The integration adds a Python seed/ledger assertion, an Android unit test for catalog search and the recipe link, and an instrumented picker test that selects the French display from the English grade query. Test and disposable Pixel 9a emulator results are recorded in `docs/catalog/batches/wp04-crab-meat-jumbo-lump-integration-20261011/README.md`.

The overall ingredient-catalog plan remains open. This review closes only the crab-meat identity and grade question; the other shellfish and cephalopod holds in the Section P proposal are unchanged.
