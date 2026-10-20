# WP02 Section A R575 / WP03 Section F R576 integration

Date: 2026-10-17

## Decision

R575 adds `sprouted oat flour / farine d'avoine germée` as the `sprouted` form of the existing `ingredient-ref-whole-grain-oat-flour`. The manufacturer describes its flour as made from its organic sprouted oats; La Moisson's Québec-facing product image supplies the French wording and its ingredient declaration says organic sprouted whole oats. The French phrase remains retailer product wording, not an OQLF-approved technical compound. The generic oat-flour reference and separate sprouted oat-grain references remain unchanged. The form has no match terms, density, reusable measure, unit mapping, conversion, cooking yield, recipe link, or active substitution. Its two One Degree recipe amounts (190 g and 1½ cups) remain separate formula-specific context and are not combined into a conversion. The 114-recipe / 1,123-row bundle has no matching demand.

The form ledger record uses `researched_no_supported_value` for reusable measurements and `researched_no_supported_substitute` for a general home-recipe rule. It records the manufacturer's broad, qualitative oat-flour replacement language and the R287 experiment only as bounded evidence; no runtime replacement rule is activated. The parent reference's states and data remain unchanged.

R576 adds two CNF 2026 Food Code 4412 volume observations to the existing `ingredient-ref-roasted-buckwheat-groats-dry` ledger record: 100 mL = 69.315 g and 250 mL = 173.288 g. They remain separate source-specific published portions, not a household conversion. Keep the prior CNF 2015 page observations separate. Exclude the 45 g mass-only row and the total-refuse row. Leave the type-9 `Yield / Rendement` value 36.04 for `amount to make 125ml` uninterpreted; the general API description does not explain this exact entry. The identity, aliases, density, mappings, forms, recipes, and substitution state remain unchanged.

## Sources

- [One Degree Organic Sprouted Oat Flour](https://onedegreeorganics.com/products/organic-sprouted-oat-flour/) identifies the marketed flour and says it is not intended for raw consumption; the warning is not generalized to all sprouted flour.
- [One Degree's sprouted-oat-flour article](https://onedegreeorganics.com/oat-flour-the-best-gluten-free-alternative/) says its flour is made from organic sprouted oats and gives broad oat-flour replacement claims without a form-specific exchange amount.
- [La Moisson's Québec-facing listing](https://lamoisson.com/en/products/farine-davoine-germee) exposes `Farine d'avoine germée` in the product-image alt text, lists organic sprouted whole oats, and shows a 510 g package.
- [One Degree's pie-crust recipe](https://onedegreeorganics.com/recipe/easy-vegan-oat-flour-pie-crust-flaky-gluten-free/) uses 190 g; its [pancake recipe](https://onedegreeorganics.com/recipe/fluffy-oat-flour-pancakes/) uses 1½ cups. These quantities belong to separate formulas.
- Health Canada's [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes the 2026 CNF as relational CSV files and links the official dataset. The R576 proposal records read-only retrieval of the four official CSVs, the row joins, sizes, and SHA-256 hashes. The current browser and workspace shell could not independently open or download those CSV files during root integration; the exact R576 row values therefore rely on the recorded direct-retrieval evidence in that proposal.
- The [CNF 2026 Measure Weight Conversion file](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv), [Measure Name file](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), and [Measure Type file](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) are cited with Food Code 4412 locators in the ledger.
- Health Canada's [CNF API Guide](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html) describes the general Yield Amount field but does not interpret Food Code 4412's 36.04 value.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R575 and R576 proposals and this integration README

## Verification

- The bundled seed package passed normalization check and validation; the form addition is in the canonical split package.
- Research-ledger schema/source-reference validation passed; targeted checks confirmed both observations' sources, the form record, source IDs, and unchanged recipe files and existing reference rows.
- UTF-8/no-BOM, explicit Unicode-escape, final-newline, local-link, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were run for these database-JSON-only changes under `AGENTS.md`.

WP02 Section A and WP03 Section F remain open. See the [R575 proposal](../../proposals/wp02-next-gap-review-r575-20261017.md) and [R576 proposal](../../proposals/wp03-section-f-next-gap-review-r576-20261017.md).
