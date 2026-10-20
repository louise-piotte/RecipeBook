# WP05 Section T dried goraka rind integration — R301 — 2026-10-16

## Decision

Promoted the held `ingredient-ref-goraka` record to identity-only **dried goraka rind / pelure séchée de goraka** in `BAKING_AND_SPICE`. The identity is scoped to dried fruit rind of *Garcinia quaesita*, used as a Sri Lankan souring spice. Added English aliases `goraka`, `rath goraka`, and `rathgoraka`, and French alias `goraka séché`.

Current Kew taxonomy accepts *G. quaesita* as native to Sri Lanka. FAO and Sri Lankan academic sources identify its dried rind as goraka and describe its culinary use. Older sources use *Garcinia cambogia* inconsistently; Kew currently lists that name under *G. gummi-gutta*, so it is not a goraka alias. Keep Malabar tamarind, dried kokum, tamarind, and the separate compounded goraka paste candidate distinct.

The French display is descriptive, not an official terminology recommendation. No OQLF entry or Québec grocery label for this culinary product was found. No reusable measure or yield was established. Substitution research remains `not_yet_researched`; no forms, mappings, recipe links, or active rules were added.

The 114-recipe / 1,123-row corpus contains no matching demand.

## Data changes

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added one reference.
- `docs/catalog/research-ledger.v1.json`: promoted one existing candidate and added five source IDs; previous Sri Lankan paste and recipe sources remain attached.
- `BundledIngredientCatalog.kt`: regenerated the picker index from the bundled JSON.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: marked the goraka identity resolved and left broader regional souring-spice coverage open.
- `roadmap.md`: recorded the review and static validation.

## Verification

Static reference normalization, bundled-package validation, generated-index freshness, ledger schema and source ownership, picker phrase uniqueness, corpus scan, UTF-8/no-BOM and explicit seed escapes, local links, and scoped whitespace checks passed. No software tests, builds, or emulator checks were run for this database JSON addition, following the repository instruction.

## References

- [R301 proposal](../../proposals/wp05-section-t-dried-goraka-rind-identity-review-r301-20261016.md)
- [Royal Botanic Gardens, Kew: *Garcinia quaesita*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:428198-1)
- [FAO Sri Lanka forest genetic resources country report](https://www.fao.org/4/i3825e/i3825e63.pdf)
- [Journal of Food Quality: *Garcinia quaesita* fruit-rind study](https://onlinelibrary.wiley.com/doi/10.1155/2020/7389714)
- [Institute of Chemistry Ceylon: *Chemistry in Sri Lanka*](https://ichemc.ac.lk/wp-content/uploads/2025/06/Vol.-42-No.-2-final.pdf)
- [Royal Botanic Gardens, Kew: *Garcinia gummi-gutta*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:427982-1)
