# R860 — Generic egg wash identity integration

Integrated 2026-10-19 as a generic ingredient coverage gap found in the bundled recipe corpus.

## Decision

Added identity-only `egg wash / dorure à l'œuf` and linked the exact `Egg wash` topping in recipe 072. OQLF supports the Québec French wording and distinguishes egg-based dorure from milk-, starch-water-, and honey-water coatings. King Arthur Baking documents conventional egg wash and discusses plant-based alternatives separately. The bun recipe gives no mixture ratio or quantity, so none was generalized.

No aliases, forms, reusable measures, densities, mappings, conversions, yields, or substitutions were added. The source's example egg-to-water ratio remains specific to that source.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/recipes/072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json`
- `docs/catalog/research-ledger.v1.json`
- generated `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- `docs/catalog/ingredient-catalog-workflow.md`
- [R860 proposal](../../proposals/wp02-generic-egg-wash-identity-review-r860-20261019.md)

## Source record

- [OQLF, dorure (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17048956/dorure)
- [King Arthur Baking, egg wash overview](https://www.kingarthurbaking.com/blog/2021/11/12/soy-milk-best-vegan-egg-wash)

The bundled seed package remained normalized and passed validation. The generated index is current at 1,892 references; the research ledger passes its JSON Schema at 2,300 records. Scoped checks confirmed the new source IDs each occur once, the recipe line links only to the new reference, the row has no form or numeric behavior, focused R855–R859 plan links remain in range, and the changed JSON is UTF-8 without BOM and stores non-ASCII text as escapes.

This change only adds database JSON data. No software tests, build, emulator run, or deployment were needed under `AGENTS.md`.
