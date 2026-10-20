# WP02 Section 04 B2 R269 — chestnut-flour measurement and substitution evidence

## Ledger update

Updated the existing `ingredient-ref-chestnut-flour` research-ledger record. The active reference row remains unchanged with no aliases, forms, default density, unit mappings, or active substitutions.

The ledger now records two recipe-specific `portion_weight` observations:

- GialloZafferano reports 2 cups (200 g) for chestnut flour in one cantucci formula.
- The American Chestnut Foundation lists 1½ cups (7½ oz) in one blondies recipe. The mass is converted to 212.6 g and marked `derived`.

These source amounts imply roughly 100 g/cup and 141.7 g/cup respectively, but neither source states a cup fill or packing method. Keep them separate; they do not establish a generic chestnut-flour cup mass or density.

The ledger also records two formulation-specific research findings. Raczyk et al. tested chestnut flour as a 5%, 10%, 15%, 30%, or 50% by-weight replacement in a single-phase wheat-bread formula; the 50% bread was very sweet, had low specific volume, and was not advisable in that process. Gallego et al. found lower specific volume and lower consumer overall acceptability for a 50% wheat / 50% chestnut layer-cake blend than for wheat-only cake. Its 100% chestnut sample was not consumer-scored. These studies do not support a general replacement rule.

Both `measurementState` and `substitutionResearchState` are now `researched_supported` to reflect the source-specific portions and tested formulations recorded in the ledger. No reusable measure, contextual rule, recipe link, or bundled recipe change was added. The recipe corpus contains no chestnut-flour line.

## Sources

- [GialloZafferano — Chestnut Flour Cantucci with Almonds and Chocolate](https://www.giallozafferano.com/recipes/chestnut-flour-cantucci-with-almonds-and-chocolate.html): ingredient list reports 2 cups (200 g).
- [The American Chestnut Foundation — Chestnut Blondies](https://www.acf.org/wp-content/uploads/2020/05/FINAL_Chestnut_Winter2019.pdf): Winter 2019 issue, p. 36; ingredient list reports 1½ cups (7½ oz).
- [Raczyk et al. — Wheat bread study](https://pmc.ncbi.nlm.nih.gov/articles/PMC8347958/): tested replacement levels and formula-specific bread quality/sensory results.
- [Gallego et al. — Layer-cake study](https://academic.oup.com/ijfst/article/57/8/4840/7807014): 50/50 blend and wheat-only comparisons; chestnut-flour particle size and consumer-test scope.
- [Hearthy Foods — Chestnut Flour](https://www.hearthyfoods.com/en-ca/products/chestnut-flour): qualitative maker statement that its product can substitute for white flour, with no replacement percentage.
- [R269 proposal](../../proposals/wp02-next-open-b2-b3-gap-review-r269-20261016.md): full evidence tables, source register, schema-shaped proposal, corpus scan, and remaining limitations.

## Files updated

- `docs/catalog/research-ledger.v1.json`: added five source records, two measurement observations, two research findings, and an accepted research-evidence decision for the existing chestnut-flour record.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: recorded completion of this chestnut-flour evidence subitem; the B2 parent remains open.
- `roadmap.md`: logged the source-scoped ledger update.
- This README: recorded the accepted evidence boundaries.

The research-ledger schema and source-ID ownership were statically validated. No software tests, builds, emulator checks, or deployments were run; this change adds database JSON evidence and supporting documentation only.
