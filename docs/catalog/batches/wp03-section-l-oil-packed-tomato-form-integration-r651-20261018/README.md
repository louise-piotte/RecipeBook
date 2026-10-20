# WP03 Section L R651 integration — oil-packed sun-dried tomato form

## Decision

Added `sun_dried_packed_in_oil` under the existing generic `tomatoes / tomates` reference. The French display uses the product-qualified Québec phrase `tomates séchées au soleil dans l’huile`; the English display is `sun-dried tomatoes packed in oil`. This form remains distinct from R648’s dry sun-dried form.

Health Canada places sun-dried tomatoes in a nutrition-label category for vegetables packed in oil and its older food-composition table separately lists drained sun-dried tomatoes packed in oil. Metro Québec’s Cucina Sardo listing uses the French product phrase, and a Metro recipe names oil-packed tomatoes as one of two recipe-local alternatives. These sources support the product-state boundary; Health Canada’s 30 g reference amount and the recipe’s 250 mL quantity are not reusable measures.

The tomato reference and recipe links remain unchanged. No oil ingredient, composition, draining rule, aliases on the generic reference, measure, density, unit mapping, conversion, package yield, recipe link, or substitution was added. The 114-recipe / 1,123-row bundle has no matching demand.

## Integration and checks

- Added one form to `ingredient-forms.v1.json` and a form-specific `ingredient_form` ledger record with five new sources, the reused R648 Metro tuna-salad source, and one accepted decision.
- Updated the Section L checklist and progress record, `roadmap.md`, the workflow, and the R651 proposal status.
- Static bundled-package validation passed. The generated catalog index is current at 1,833 references; ledger schema and custom validation report zero errors across 2,206 records. The new form ID and new source IDs are unique; Unicode is stored in the JSON with explicit escapes; local links and whitespace checks passed.
- No app tests, build, emulator run, or deployment were performed. The change only adds database JSON data and its generated catalog index under `AGENTS.md`.

## Sources

- [Health Canada — Nutrition labelling: Table of reference amounts for food (French)](https://www.canada.ca/fr/sante-canada/services/documents-techniques-exigences-etiquetage/etiquetage-nutritionnel-tableau-quantites-reference-aliments.html)
- [Health Canada — Nutrient Value of Some Common Foods, Table 4: Vegetables (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-4-vegetables-vegetable-products-nutrient-value-some-common-foods-2008.html)
- [Metro Québec — Cucina Sardo sun-dried tomatoes in olive oil](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/tomates-sechees-au-soleil-dans-l-huile-d-olive/p/055823052316)
- [Metro — Brie and Sun-dried Tomato Bundles](https://www.metro.ca/recettes-et-occasions/recettes/baluchons-de-brie-aux-tomates-sechees)
- [Metro Québec — Tuna salad with sun-dried tomatoes](https://www.metro.ca/recettes-et-occasions/recettes/salade-de-thon-et-tomates-sechees) (source ID reused from R648)

See the [R651 proposal](../../proposals/wp03-section-l-oil-packed-tomato-form-review-r651-20261018.md). Section L remains open.
