# WP03 Section F crispy rice cereal measurement integration — R291 — 2026-10-16

## Decision

Completed bounded measurement and cereal-replacement research for the existing `ingredient-ref-rice-cereal` identity, `crispy rice cereal / céréales de riz croustillantes`. The active reference and picker remain unchanged: no aliases, forms, density, unit mappings, conversion, or yield were added.

The ledger records two Canadian product-label portions as SKU-specific observations:

- WK Kellogg Rice Krispies Cereal, GTIN `00064100108271`: `1 cup (28 g)`.
- Nature's Path Organic Crispy Rice Cereal, Healthy Planet SKU `A0014398`: `1 cup (34 g)`.

Health Canada's Nutrition Facts guide gives `1/2 cup = 125 mL`; the resulting Canadian label cup convention is 250 mL. These observations are not RecipeBook's 236.5882 mL cup, and they do not establish a generic crispy-rice-cereal mass or conversion.

The bundle's sole linked use remains recipe 040's unbranded `6 cups crispy rice cereal`. Allrecipes gives no cereal alternative; WK Kellogg's branded treat recipe warns that results may vary with other products. The available sources do not support a reusable cereal substitution. Recipe 040 and its quantity were not edited.

## Files updated

- `docs/catalog/research-ledger.v1.json` — completed measurement and substitution research states; added four source records, two label observations, a no-supported-substitute finding, and a decision to the existing cereal record.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` — checked the R291 measurement/replacement subtask; independent Québec review and broader Section F coverage remain open.
- `roadmap.md` — recorded R291.
- `docs/catalog/proposals/wp03-section-f-crispy-rice-cereal-measurement-review-r291-20261016.md` — recorded integrated status.

The ingredient-reference JSON, ingredient forms, substitution rules, and recipe 040 remain unchanged.

## Verification

- Opened WK Kellogg Canada's SmartLabel for the 1120 g Rice Krispies product; it reports `1 cup (28 g)` and warns that label data can change.
- Opened Healthy Planet's current Nature's Path product page; it identifies SKU `A0014398`, the 750 g product, ingredients, and `1 cup (34 g)` / `1/2 cup (17 g)` label values, with a packaging-update disclaimer.
- Opened Health Canada's Nutrition Facts table guidance and WK Kellogg Canada's treat recipe for the Canadian label cup convention and product-specific recipe note.
- Rechecked Allrecipes recipe 040's `6 cups` line and cashew-butter-only option. Scanned all 114 manifest-listed recipes / 1,123 structured ingredient rows; recipe 040 remains the only crispy-rice-cereal use.
- Confirmed source-ID and URL ownership, unchanged reference/picker projection, and absence of forms or active substitution rules for the reference.
- Static seed-package, reference-normalization, generated-index, research-ledger schema, UTF-8/no-BOM, source-link, local-link, and whitespace checks passed.
- No software tests, build, or emulator run was performed. This update adds database research JSON and documentation only, per `AGENTS.md`.

Totals at the R291 integration point: 1,663 ingredient references, 126 forms, and 2,012 ledger records / 8,868 source entries / 7,509 distinct source IDs / 6,270 distinct URLs; 114 recipes / 1,123 structured ingredient rows.

## Sources

- [R291 crispy-rice-cereal measurement proposal](../../proposals/wp03-section-f-crispy-rice-cereal-measurement-review-r291-20261016.md)
- WK Kellogg Canada, [Rice Krispies SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100108271)
- Healthy Planet Canada, [Nature's Path Organic Crispy Rice Cereal](https://www.healthyplanetcanada.com/en/nature-s-path-organic-cereal-crispy-rice-750g.html)
- Health Canada, [Nutrition Facts table serving-size guidance](https://www.canada.ca/en/health-canada/services/food-nutrition/nutrition-labelling/nutrition-facts-tables.html)
- WK Kellogg Canada, [The Original Rice Krispies Treats microwave recipe](https://www.ricekrispies.ca/en/orginal-treats-microwave)
- Allrecipes, [Chocolate Nutty Crispy Treats](https://www.allrecipes.com/recipe/258753/chocolate-nutty-crispy-treats/)
