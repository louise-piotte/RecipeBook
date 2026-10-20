# WP03 Section F — Sprouted triticale grain boundary review (2026-10-13, R59)

- **Scope:** Determine whether food-use `sprouted triticale grains`, found in a current Canadian bakery-grain product, merits a standalone Section F identity or form.
- **Recommendation:** Record ledger-only candidate `candidate-sprouted-triticale-grain` as `needs_clarification`; do not add an active reference or form. The current Canadian source names sprouted triticale only as one component in a 13-grain/seed baking mix. No standalone human-food product or Québec French name for this component was verified.
- **Proposal-local source IDs:** `WP03-SPROUTED-TRITICALE-20261013-R59-S01` through `S04`. Reuse existing ledger sources `WP03-SORGFLAKE-20261011-S06` and `WP03-S79`; do not duplicate those URLs.
- **Plan context:** Section F keeps remaining grain and cereal coverage open at [the active identity checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) and [the remaining puffed-grain and preprocessed-product checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2535). This is a new sprouted-grain boundary, not a repeat of the separately reviewed triticale-meal or malted-triticale-flour boundaries.

## Findings

Puratos Canada currently lists Softgrain Treize, a ready-to-use multi-grain bakery ingredient, in a 16.5 kg bucket. Its ingredient statement includes the exact phrase `Sprouted triticale grains` among thirteen grain and seed components, alongside wheat sourdough, whole oats, seeds, flakes, and other grains. This establishes a named food-use component in a Canadian commercial product. It does not establish a separately sold triticale ingredient, its share of the blend, the sprouting process or endpoint, whether the grain is dried or cooked, or a retail package for home recipes. The bucket size applies to the complete blend, not to the triticale component. [WP03-SORGFLAKE-20261011-S06, WP03-SPROUTED-TRITICALE-20261013-R59-S01]

Québec terminology supports the base noun `triticale`. Usito and OQLF define the wheat–rye cereal under that term, but neither supplies a compound for this intentionally sprouted food product [WP03-S79, WP03-SPROUTED-TRITICALE-20261013-R59-S04]. The Canadian Grain Commission's French grading guide uses `grains germés` for visible signs of germination in triticale grain samples; that is a grading condition and does not name an intentionally sprouted food ingredient [WP03-SPROUTED-TRITICALE-20261013-R59-S02]. A current Québec bread label uses `triticale concassé` for a different, cracked-grain ingredient, which confirms local French labeling of a qualified triticale product but does not support `triticale germé` or `grains de triticale germés` [WP03-SPROUTED-TRITICALE-20261013-R59-S03]. Do not promote either constructed French phrase to a display or alias.

The proposed scope is the source-named sprouted triticale grain component, distinct from plain whole triticale, triticale flakes, triticale flour, and triticale meal. The only reviewed source does not establish a standalone product boundary or enough state detail to decide whether a future reference should be an identity or an `IngredientForm`. No equivalence to other sprouted cereal grains is supported.

## Exact-key ownership and recipe demand

| Surface | Current owner or finding |
|---|---|
| `triticale` | `ingredient-ref-triticale-grain`, displayed `triticale / triticale`. This is the plain food-grain identity. |
| `triticale flakes` / `flocons de triticale` | `ingredient-ref-triticale-flakes`. Keep the processed flake product separate. |
| `triticale flour` / `farine de triticale` | `ingredient-ref-triticale-flour`. Keep flour separate. |
| `sprouted triticale grains`, `sprouted triticale grain`, `sprouted triticale`, `grains de triticale germés`, `triticale germé` | No exact owner in active reference names or aliases, ingredient forms, or the research ledger. These remain source/search terms only; no French phrase is proposed as a key. |
| Triticale forms | No form is attached to the three active triticale references. |
| Related prior work | Triticale meal remains a separate held grain-meal candidate; malted triticale flour is a separate experimental flour hold. Neither decides sprouted whole grain. |

I scanned all 114 recipe files listed in the bundled-library manifest and all 1,123 ingredient rows. No recipe or ingredient row mentions the source phrase or the proposed English/French search phrases. The bundle has no matching demand and no recipe link is supported.

## Recommendation and unsupported fields

Keep `candidate-sprouted-triticale-grain` ledger-only until a standalone human-food product or a recipe need establishes a clearer product boundary. It remains `identityState: needs_clarification`; do not create an active ingredient reference or assign a Québec French display.

- Do not add an alias to plain `triticale` or to a sprouted-wheat, sprouted-barley, or sprouted-rice identity.
- Do not add a form until product evidence establishes a reusable sprouted state and its scope.
- Do not record the 16.5 kg blend bucket as an ingredient measure. No component percentage, household portion, mass-volume conversion, density, or cooking yield is supported.
- No ingredient-to-ingredient or form-to-form substitution is supported.
- Add no recipe link or other numeric behavior.

## Sources

| ID | Source | Finding and limit |
|---|---|---|
| Reused `WP03-SORGFLAKE-20261011-S06` | Puratos Canada, [Softgrain Treize, English product page](https://www.puratos.ca/en/products/Softgrain-Treize), product description, ingredient statement, and specifications. | Current Canadian manufacturer page lists `Sprouted triticale grains` as one component in the ready-to-use 13-grain/seed baking mix, product code 4021908, packaged in a 16.5 kg bucket. This is not a stand-alone triticale SKU or a household measure. Reuse the ledger source ID and expand its support description if the proposal is accepted. |
| `WP03-SPROUTED-TRITICALE-20261013-R59-S01` | Puratos Canada, [Softgrain Treize, French product page](https://www.puratos.ca/fr/products/Softgrain-Treize), product description, ingredient statement, and specifications; accessed 2026-10-13. | The Canadian French product page describes the ready-to-use whole-grain blend and its 16.5 kg bucket, but the component list still names `Sprouted triticale grains` in English. It does not provide a Québec French product name for that ingredient or a separate SKU. |
| Reused `WP03-S79` | Usito, [triticale](https://usito.usherbrooke.ca/d%C3%A9finitions/triticale). | Supports the base French noun `triticale` and the cereal's wheat–rye identity. It does not name a sprouted food product. |
| `WP03-SPROUTED-TRITICALE-20261013-R59-S02` | Canadian Grain Commission, [Triticale: Grading factors](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/08-triticale/facteurs-classement.html), French entry `Grains germés`; accessed 2026-10-13. | Defines visibly germinated kernels as a triticale grading factor. This is grain-quality terminology, not a Québec food-product label for intentional sprouting. |
| `WP03-SPROUTED-TRITICALE-20261013-R59-S03` | Gouvernement du Québec, [Répertoire des aliments québécois: St-Méthode 9-grain bread](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8200383), French ingredient statement; accessed 2026-10-13. | A current Québec bread label uses `triticale concassé` for a cracked-grain component. It is local terminology evidence for a different product state and does not support a sprouted-triticale compound. |
| `WP03-SPROUTED-TRITICALE-20261013-R59-S04` | Office québécois de la langue française, [triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480832/triticale); accessed 2026-10-13. | Defines the base French cereal term `triticale` as a wheat–rye hybrid. It does not name a sprouted food product. |
