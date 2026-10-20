# WP02 proposal: light corn syrup / Québec identity boundary

- **Review date:** 2026-10-11
- **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, WP02 Section C, “Light/dark corn syrup, glucose syrup, golden syrup, invert sugar, treacle, regular/fancy molasses, blackstrap molasses, malt syrup, and rice syrup.” The item remains open.
- **Scope:** light corn syrup / *sirop de maïs clair* only, in relation to the active generic corn syrup and dark corn syrup references. This packet records the proposal; root integration is recorded below.
- **Recommendation:** add a separate, identity-only `light corn syrup / sirop de maïs clair` reference. It is a marketed and recipe-named color/flavor grade with a Canadian French term and a distinct Health Canada CNF entry. Treat it as a culinary product grade, not as a separate Canadian compositional standard or a universal formula. Keep generic corn syrup and dark corn syrup separate. Do not add a form, recipe link, density, unit mapping, conversion, package yield, or global substitution rule. Root integration is recorded below.

## Disposition and boundary

| Candidate | Proposed disposition | Boundary |
| --- | --- | --- |
| Light corn syrup | Add identity-only reference; proposed ID `ingredient-ref-light-corn-syrup`; category `SUGAR_AND_SWEETENER`; English name `light corn syrup`; French name `sirop de maïs clair`; French alias `sirop de maïs léger`. | The descriptor marks a marketed culinary grade associated with a clear/pale color and delicate flavor. It is not a universal composition or processing specification. Keep package names and brand-only synonyms out of global aliases. |
| Generic corn syrup | Keep `ingredient-ref-corn-syrup`, `corn syrup / sirop de maïs`, unchanged and distinct. | A recipe that says only “corn syrup” stays generic; the proposed light reference does not become its alias. |
| Dark corn syrup | Keep `ingredient-ref-dark-corn-syrup`, `dark corn syrup / sirop de maïs foncé`, distinct. | “Dark” carries a color/flavor distinction in current product evidence; one manufacturer’s light/dark interchange advice remains brand-family guidance only. |
| Glucose syrup | Keep active `ingredient-ref-glucose-syrup`, `glucose syrup / sirop de glucose`, separate. | CFIA standard language defines glucose/glucose syrup by starch hydrolysis. It does not establish light corn syrup as a synonym for glucose syrup. |
| “White corn syrup” | Do not add as a global alias. | Karo says consumers may use this for Karo Light; Crown’s Canadian retail name is “Lily White,” and those product-/brand-specific usages do not establish a universal bilingual synonym. |
| “Crown Lily White” / “Lily White” | Do not add as an alias. | This is a branded product name, not a generic identity term. |

The distinction is supported at the culinary product-name level, not as a Canadian legal standard with a defined composition. CFIA’s current Volume 15 has standards for glucose/glucose syrup and source-named glucose syrup but no separate “light corn syrup” standard entry. CFIA also treats “light” as a sensory claim when it refers to color, taste, or flavor, and requires the sensory characteristic to be identified. Health Canada’s CNF separately indexes “corn light” with the French name *sirop de maïs, clair*. These sources support preserving the grade when a recipe or product specifies it; they do not define a single light-syrup recipe or guarantee that brands are interchangeable.

### Proposed narrow reference fields

```text
id: ingredient-ref-light-corn-syrup
nameEn: light corn syrup
nameFr: sirop de maïs clair
aliasesEn: []
aliasesFr: [sirop de maïs léger]
category: SUGAR_AND_SWEETENER
defaultDensity: null
unitMappings: []
forms: none
recipe links: none
substitution rules: none
```

Do not add `white corn syrup`, `Crown Lily White`, or `Lily White` as global aliases. The English canonical phrase is established in current product and Canadian recipe usage; *clair* has direct Canadian/French support from CNF and a Québec retail listing, while *léger* occurs in a Canadian French recipe and retailer product-type field. The two French labels are retained as searchable terms rather than presented as distinct products.

## Live package and collision audit

Preflight against the live tree on 2026-10-11 found 940 active ingredient references, 52 ingredient forms, 75 legacy candidates, 1,204 research-ledger records, and 114 manifest-listed recipes. Search normalization was checked against `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` (case-folding, NFKD/accent folding, ligature folding, punctuation-to-space, and complete phrase matching before partial matching).

| Query / normalized phrase | Exact active reference owner | Active phrase-search result(s) | Forms / legacy exact owner | Ledger finding |
| --- | --- | --- | --- | --- |
| `light corn syrup` | none | none | none / none | No light-specific record or key. |
| `sirop de maïs clair` | none | none | none / none | No light-specific record or key. |
| `sirop de maïs léger` | none | none | none / none | No light-specific record or key. |
| `white corn syrup` | none | none | none / none | No light-specific record or key. |
| `lily white corn syrup` | none | none | none / none | No light-specific record or key. |
| `corn syrup` | `ingredient-ref-corn-syrup` | `ingredient-ref-corn-syrup`; `ingredient-ref-dark-corn-syrup` also matches because its canonical name contains the full phrase | none / none | Current generic record has Karo product/FAQ evidence; no light candidate record. |
| `sirop de maïs` | `ingredient-ref-corn-syrup` | generic and `ingredient-ref-dark-corn-syrup` (the latter’s full name contains this phrase) | none / none | Generic and dark records have existing syrup research; no light candidate record. |
| `dark corn syrup` / `sirop de maïs foncé` | `ingredient-ref-dark-corn-syrup` | dark reference | none / none | Dark has Karo, CNF, and recipe evidence. |
| `glucose syrup` / `sirop de glucose` | `ingredient-ref-glucose-syrup` | glucose-syrup reference | none / none | Separate glucose-syrup record and CFIA/OQLF evidence. |

The 52 forms contain no light-, corn-syrup-, or sirop-de-maïs form. The 75 legacy candidates contain no exact or phrase candidate for the light English/French names, white corn syrup, or Lily White. The ledger has no light-specific record: the existing Karo products source `WP02-C-SYR-20261009-S06` and FAQ source `WP02-C-SYR-20261009-S07` are attached to the generic and dark corn-syrup records. The prefix proposed here, `WP02-C-LCS-20261011-S`, has no existing ledger source-ID collision. The active generic row currently has no aliases, density, or unit mappings; dark also has no aliases, density, or mappings. The older broad syrup proposal held light inactive because its recipe scan found no exact light-corn-syrup line; this review adds the current Canadian naming and CNF identity evidence but still finds no bundled recipe line demanding the light grade.

### Exact bundled recipe-line demand

The scan covered all 114 manifest-listed recipe files and all 1,123 ingredient rows. There are no exact light-corn-syrup ingredient rows and no French equivalent. Related demand is:

| Recipe file | Ingredient row / ID | Exact `originalText` | Current reference |
| --- | --- | --- | --- |
| `recipes/040-croustillant-chocolate-et-noix-chocolate-nutty-crisp-798352ab-d4ad-4e5d-9c90-f0484609bca2.v1.json` | row 1 / `798352ab-d4ad-4e5d-9c90-f0484609bca2-ingredient-1` | `1 cup corn syrup` | `ingredient-ref-corn-syrup` |
| `recipes/057-gateau-quadruple-chocolat-chocolate-truffle-cake-f4807560-d19f-4e2d-aeab-80138564b93f.v1.json` | row 22 / `f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-22` | `1/4 cup corn syrup` | `ingredient-ref-corn-syrup` |
| `recipes/109-tarte-aux-pacanes-pecan-pie-02721958-323d-47a4-96df-d383ae0994ff.v1.json` | row 3 / `02721958-323d-47a4-96df-d383ae0994ff-ingredient-3` | `1/3 cup dark corn syrup` | `ingredient-ref-dark-corn-syrup` |

Thus exact bundled demand is two generic corn-syrup rows, one dark row, and zero light rows. Do not relink either generic recipe to light based on external product guidance.

## Observed source facts

1. **Canadian standards and labeling.** CFIA’s current Canadian Food Compositional Standards, Volume 15, 15.1.12–15.1.14, defines glucose/glucose syrup, glucose solids, and source-named glucose syrup; the reviewed volume does not list a separate standard for light corn syrup. CFIA French ingredient-label examples include *sirop de maïs* as a sweetening-agent name but do not establish a light-grade formula. CFIA’s light-claims guidance says that when “light” describes a sensory characteristic such as color or taste, that characteristic must accompany the claim. This supports interpreting light as a sensory grade descriptor in product usage, not a reduced-calorie assertion or a separate standard formula. [S01–S03]
2. **Canadian French naming and CNF.** Health Canada CNF food code 4323 names the item “Sweets, syrups, corn light” / “Confiseries, sirop de maïs, clair.” The French phrase *sirop de maïs clair* is also used in a current French-language Canadian retail listing for Crown Lily White. Canadian French Cuisinart recipe text uses *sirop de maïs léger*. These sources support the proposed French display and alias as actual Canadian usage; CNF and retailer wording do not make either a legally prescribed product name. [S04, S06, S09]
3. **Canadian Crown product.** Bake Good, the current Canadian product site, markets Crown Lily White Corn Syrup in a 500 mL size and describes its use in frozen treats, icings, glazes, and desserts. The French Walmart listing titles it “Crown Sirop de Maïs Clair,” classifies it as light, and lists glucose, glucose-fructose, water, salt, and vanillin. Walmart’s product-description text says it is clear/translucent, mildly sweet, and intended where a recipe calls for corn syrup flavor/texture without added color. The detailed composition and use description here are retailer-supplied product information; Bake Good’s page does not state a formula. [S05–S06]
4. **Karo product-family examples.** Karo’s current product page calls one item “Light Corn Syrup,” lists corn syrup, salt, and vanilla extract, and gives a 2 Tbsp (30 mL) serving. It describes its Dark product as corn syrup plus molasses, with a more robust flavor and color, also at 2 Tbsp (30 mL). Its FAQ says light/dark refer to color, not calories; consumers may call Karo Light “white corn syrup”; and Karo Light and Dark can be interchanged in Karo recipes despite flavor/color differences. These are Karo-specific facts and advice, not a universal light-corn-syrup formula, alias list, or cross-brand substitution rule. [S07–S08]
5. **Canadian French recipe measurement.** Cuisinart Canada’s French CPM-100C booklet has a caramel-popcorn recipe listing 2 Tbsp (30 mL) *sirop de maïs léger* and an approximate finished yield of 10 cups (2.36 L) of popped corn. It does not pair the syrup volume with a syrup mass. [S09]
6. **Current recipe-page use.** Ready Set Eat Canada’s French peanut-butter popcorn recipe uses 250 mL (1 cup) *sirop de maïs léger* for 36 portions. This is a recipe quantity, not a mass conversion or a general yield relation. [S10]

## Measures, conversion, yield, and substitution limits

| Evidence | Source fact | Permitted use and limit |
| --- | --- | --- |
| CNF 4323 portions | 15 mL = 20.8 g; 30 mL = 41.6 g; 100 mL = 138.6 g; 125 mL = 173.3 g; 250 mL = 346.6 g. | Health Canada’s bilingual portion record is a published source-specific volume-to-mass set. It was last modified 2019-03-01 and identifies no brand or measurement method. Keep the observations in this proposal/source record only; do not promote them to a default density, unit mapping, or recipe conversion. [S04] |
| Karo label | 2 Tbsp (30 mL) per stated serving. | Brand serving volume only; no syrup mass is stated. Nutrition carbohydrate grams are not product mass. [S07] |
| Crown package | Bake Good lists a 500 mL product size. | Package volume only; it is not a recipe yield or mass. Walmart’s “739 grams” appears in an anomalous dimensions/weight metadata field but is not identified as syrup net mass, so exclude it as a product mass. [S05–S06] |
| Cuisinart caramel popcorn | 2 Tbsp (30 mL) light syrup; approximate finished yield 10 cups / 2.36 L popped corn. | One recipe’s input and output, not a syrup density or universal yield. [S09] |
| Ready Set Eat popcorn | 250 mL (1 cup) light syrup for 36 portions. | One recipe’s serving count; no paired mass or transferable yield basis. [S10] |
| Crown usage note | Retailer describes this product for recipes calling for corn syrup when corn-syrup flavor/texture is desired without added color. | Record as Crown-product use guidance from a retailer. It does not prove every generic-corn-syrup recipe will work unchanged with all light products. [S06] |
| Karo interchange statement | Karo says its Light and Dark syrups can be interchanged in its recipes. | Brand-family guidance only; it does not establish an app-level directed substitution or equivalence between generic, light, dark, or other brands. [S08] |

No source supports a default density, weight-per-cup mapping, package yield, form conversion, or cross-brand substitution for the proposed reference. No source supports a general substitution to or from generic corn syrup, glucose syrup, golden corn syrup, maple syrup, molasses, or another syrup. Keep all such behavior unknown.

## Source-to-claim register

All online sources below were accessed 2026-10-11. Source IDs are proposal-local; none currently exists in the shared research ledger.

| Source ID | Direct source and locator | Claims used | Limits |
| --- | --- | --- | --- |
| `WP02-C-LCS-20261011-S01` | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 15, standards 15.1.12–15.1.14. | Current standards distinguish glucose/glucose syrup, glucose solids, and source-named syrup. No separate light-corn-syrup standard appears in this volume. | Absence from this volume does not disprove a culinary or retail grade; the standard is not a catalog of every marketed recipe term. |
| `WP02-C-LCS-20261011-S02` | [CFIA, Liste d’ingrédients et allergènes sur les étiquettes des aliments](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/liste-dingredients-allergenes), Annex 1, examples of sugar-based ingredients/sweetening agents. | Lists generic *sirop de maïs* and separately identifies other syrups. | Labeling examples, not an exhaustive product dictionary or light-grade formula. |
| `WP02-C-LCS-20261011-S03` | [CFIA, Food composition and quality claims](https://inspection.canada.ca/en/food-labels/labelling/industry/composition-and-quality), “Light claims” and “Sensory characteristic.” | “Light” may describe color/taste/flavor when the sensory characteristic is identified; it is distinct from a nutrient-reduction interpretation. | General labeling guidance; it does not define corn-syrup grades. |
| `WP02-C-LCS-20261011-S04` | [Health Canada, CNF serving portion, food code 4323](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4323), name and available serving sizes. | Bilingual food name `Sweets, syrups, corn light / Confiseries, sirop de maïs, clair`; listed volume/mass portions. | Page modified 2019-03-01; brand and measurement method are not stated. Do not create a default app conversion. |
| `WP02-C-LCS-20261011-S05` | [Bake Good, Crown Lily White Corn Syrup](https://bakegood.ca/products/crown-lily-white-corn-syrup/), product name, size, uses. | Current Canadian manufacturer-side product listing calls it Crown Lily White Corn Syrup and gives 500 mL size and uses. | Does not state a full ingredient formula or call the product “light” on this page. |
| `WP02-C-LCS-20261011-S06` | [Walmart Canada, French Crown listing](https://www.walmart.ca/fr/ip/Crown-Lily-White-Sirop-de-Ma-s/10278567), title, “Type de sirop de maïs,” details and ingredient panel. | Uses *Sirop de Maïs Clair*, classifies it as `Léger`, describes clear color/no added color use, lists ingredients, and gives a 500 mL package size. | Retailer-supplied product text and labeling; not a compositional standard or manufacturer-authored technical specification. The 739 g value is in a dimensions/weight metadata field and is not identified as syrup net mass. |
| `WP02-C-LCS-20261011-S07` | [Karo, Products](https://www.karosyrup.com/products/), “Karo Light Corn Syrup” and “Karo Dark Corn Syrup” product panels. | Product-specific ingredients, color/flavor descriptions, and 2 Tbsp (30 mL) servings for Light and Dark. | U.S. brand product evidence; not a Canadian terminology authority or universal composition. |
| `WP02-C-LCS-20261011-S08` | [Karo, Frequently Asked Questions](https://www.karosyrup.com/fequently-asked-questions/), “Can Karo Light and Dark Corn Syrups be interchanged in recipes?” and “Does ‘light’ mean…?” | Brand-family interchange advice; light/dark color distinction; “white corn syrup” usage limited to what consumers may call Karo Light. | Karo-only usage/advice; not a global alias or substitution rule. |
| `WP02-C-LCS-20261011-S09` | [Cuisinart Canada, CPM-100C French instruction/recipe booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1773219861568/Instruction%20Booklet/CPM-100C_fr.pdf), “Maïs éclaté au caramel.” | Canadian French term *sirop de maïs léger*, 2 Tbsp (30 mL), approximately 10 cups / 2.36 L yield. | Appliance recipe only; no syrup mass or cross-recipe conversion. |
| `WP02-C-LCS-20261011-S10` | [Ready Set Eat Canada, Maïs éclaté au beurre d’arachide](https://www.readyseteat.ca/fr/recettes-mais-eclate-au-beurre-darachide-33931), ingredient list and serving count. | Canadian French *sirop de maïs léger* at 250 mL (1 cup), 36 portions. | One recipe’s amount/portion count; no mass or general yield. |

## Integration note

## Root integration outcome

Accepted and integrated on 2026-10-11 after root rechecking the active generic/dark syrup keys, recipe lines, CNF code 4323, CFIA standard and light-claim guidance, Canadian French product/recipe usage, and brand-scope limits. Added `ingredient-ref-light-corn-syrup` as `light corn syrup / sirop de maïs clair`, category `SUGAR_AND_SWEETENER`, with French alias `sirop de maïs léger`. The five CNF portions remain ledger-only observations; no default density, mapping, conversion, or yield was activated. Karo interchange advice remains brand-family-specific, and `white corn syrup` stays excluded as a global alias. No form, recipe link, or substitution rule was added. See the 942-reference integration checkpoint in [`../batches/wp02-wp03-wp04-sweetener-pulse-insect-integration-20261011/README.md`](../batches/wp02-wp03-wp04-sweetener-pulse-insect-integration-20261011/README.md).
