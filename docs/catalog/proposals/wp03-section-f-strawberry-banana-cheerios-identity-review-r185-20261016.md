# WP03 Section F: Strawberry Banana Cheerios identity review (R185)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only; shared catalog data and the checklist were not changed.
- **Open checklist:** Section F still calls for regionally significant cereal mixes and preprocessed grains in the [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3543). R184's neighboring [Crispix proposal](wp03-section-f-kelloggs-crispix-cereal-identity-review-r184-20261016.md) added a different cereal.
- **Candidate:** current Canadian ready-to-eat SKU **Strawberry Banana Cheerios / Cheerios Fraises et bananes**.
- **Recommendation:** Add identity-only `GRAIN_AND_CEREAL` reference `ingredient-ref-strawberry-banana-cheerios`. Use the manufacturer's exact bilingual titles, keep aliases empty, and add no forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions.

## Product identity and Québec naming

General Mills' current Canadian English and French product pages give the exact names **Strawberry Banana Cheerios** and **Cheerios Fraises et bananes** [S01–S02]. Both identify a 317 g ready-to-eat cereal and list a Nutrition Facts serving of 1 cup / 1 tasse (39 g). Use the manufacturer titles for the catalog display. Metro Québec's current French listing corroborates the matching 317 g item and product code **065633188518** under its local descriptive title [S04]. Keep that retailer wording as evidence rather than an alias; the manufacturer's French title is the stable bilingual search key.

The product is a formulated, packaged cereal with whole-grain oats, sugars, banana and strawberry purees, corn starch, oils, and other ingredients. The declaration gives no ingredient proportions, so it does not justify a formula, component links, or mappings to oats, banana, strawberry, or corn products [S01–S02]. Keep this named cereal separate from generic rolled oats, the fruit ingredients, and other Cheerios variants.

The Canadian manufacturer currently lists 17 Cheerios products, including this SKU, Multi-Grain Cheerios, and three Oat Crunch variants [S03]. The existing `ingredient-ref-multi-grain-cheerios` is the separate [R180 product](wp03-section-f-multi-grain-cheerios-identity-review-r180-20261016.md), not an alias or base identity. The [R181 Cinnamon Oat Crunch proposal](wp03-section-f-cheerios-oat-crunch-cinnamon-identity-review-r181-20261016.md) was held because one flavor would otherwise own a bare `Oat Crunch` search; this Strawberry Banana SKU has its own exact manufacturer title and is not proposed as a generic Cheerios identity. Keep the wider brand family boundary visible in picker results and in future catalog reviews.

| Neighbor | Existing owner | Boundary |
|---|---|---|
| `Multi-Grain Cheerios / céréales multigrains Cheerios` | `ingredient-ref-multi-grain-cheerios` ([R180 proposal](wp03-section-f-multi-grain-cheerios-identity-review-r180-20261016.md)) | A separate ready-to-eat SKU. Shared brand is not equivalence. |
| Oat Crunch Cinnamon and its siblings | No active Oat Crunch identity; Cinnamon was held in R181 | Separate flavors and formulations. Do not add `Oat Crunch`, `Cheerios`, or sibling flavors as aliases for this SKU. |
| Oats, banana, strawberry, corn starch, sugar, and other listed components | Existing ingredient references | Product-label components are not the complete cereal identity or a quantified formula. |
| Other breakfast cereals | Existing generic and named cereal references | Keep all finished cereal products separate unless a source supports a precise equivalence. |

## Exact ownership and archive audit

At the review snapshot the working tree contains **1,563 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,908 research-ledger records**. Searches of reference displays and aliases, form labels and match terms, legacy names and aliases, ledger records, the active plan, and proposal/batch archives found no owner or focused prior decision for the proposed ID, either exact product title, the French local product wording, or UPC `065633188518`. No active form, legacy allocation, or ledger record is proposed for the product. The only exact Cheerios reference found is R180's distinct Multi-Grain SKU. R180 and R181 are relevant family decisions, but neither reviews this flavor.

The exact R185 source IDs `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S01` through `S04`, and the four exact source URLs below, were absent from the ledger's source-ID and URL registers. The candidate title, UPC, and stable ID were absent from the bundled recipe corpus and catalog archive.

## Picker projection

`IngredientReferenceSearchIndex` normalizes case, accents, and punctuation, returns complete word-phrase matches first, and falls back to substring matching only if there are no phrase matches. A static projection from the current reference and form data gives:

| Query | Current results | With proposed display |
|---|---:|---:|
| `Strawberry Banana Cheerios` | 0 | 1 proposed row |
| `Cheerios Fraises et bananes` | 0 | 1 proposed row |
| `Cheerios` | 1: Multi-Grain Cheerios | 2: Multi-Grain and Strawberry Banana |
| `cereal` / `céréales` | 22 / 19 | 22 / 19; neither proposed display contains those words |
| `strawberry` / `banana` | 1 / 8 | 2 / 9, adding this finished cereal alongside existing ingredient choices |
| `fraise` | 3 substring matches | 4, adding this cereal without changing the existing substring results |
| `banane` | 7 phrase matches | 7; an exact phrase result set suppresses substring fallback, and the official title uses plural `bananes` |

The exact bilingual product names route to one row. The broad `Cheerios` query intentionally gains this second exact SKU, while the brand's wider 17-product lineup remains only partly represented. Do not add a plain `Cheerios` alias. The Metro French wording uses singular `fraise`; adding it as an alias would make `fraise` a complete-word phrase and cause the picker to return only that cereal instead of the current three substring matches. Retain the retailer title as source evidence, not an alias. If French singular fruit queries need stronger recall, revisit after the picker can preserve both phrase and substring matches.

## Recipe-corpus demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for the exact English and French product names, Metro's French listing phrase, UPC `065633188518`, the proposed ID, and any `Cheerios` mention. The scan found **0 matching files and 0 matching ingredient rows**. No recipe link or recipe-text change is supported.

## Numeric, preparation, and substitution boundaries

- **Nutrition serving:** The manufacturer's bilingual nutrition panels give **1 cup (39 g)** / **1 tasse (39 g)** for this SKU [S01–S02]. If recorded in the ledger, keep it as a product-specific `portion_weight` observation in the dry, as-packaged state. It is not a generic cereal measure, active unit mapping, or reusable density.
- **Package:** The 317 g amount is the package net mass, not a recipe quantity or yield [S01–S02, S04].
- **Forms and preparation:** The product is ready to eat. The reviewed pages do not establish a dry-to-prepared yield or another reusable form conversion; add no form or yield.
- **Composition:** The ingredient declaration supplies no proportions. Do not decompose the cereal into oat, fruit, starch, or sweetener links.
- **Substitution:** The manufacturer says the cereal can be used in a recipe but supplies no tested, quantity-qualified replacement with another cereal or component [S01–S02]. Add no global or contextual substitution rule.

## Proposed reference and ledger details

If accepted, add this reference under `GRAIN_AND_CEREAL`:

```json
{
  "id": "ingredient-ref-strawberry-banana-cheerios",
  "nameFr": "Cheerios Fraises et bananes",
  "nameEn": "Strawberry Banana Cheerios",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

Add no `ingredient-form` or legacy-import mapping. If accepted, the ledger record should be `recordType: ingredient_reference`, `recordId: ingredient-ref-strawberry-banana-cheerios`, `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: researched_no_supported_substitute`. Attach sources S01–S04 and one product-specific observation:

- `observationId`: `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-M1-LABEL-1-CUP-39G`
- `relationship`: `portion_weight`; `value`: `39`; `valueUnit`: `g`; `sourceQuantity`: `{ "amount": 1, "unit": "cup" }`
- `foodDescription`: Strawberry Banana Cheerios, Canadian manufacturer Nutrition Facts serving
- `foodState`: dry ready-to-eat cereal, as sold
- `measurementMethod`: manufacturer Nutrition Facts serving-size label
- `quantityBasis`: product-specific nutrition serving only; not a generic cereal measure, density, or unit conversion
- `evidenceKind`: `manufacturer_label`; `sourceIds`: S01 and S02

Keep `substitutionFindings` empty and add no active conversion, yield, recipe link, or substitution. No source record needs to be reused.

## Source register

Sources accessed 2026-10-16. Proposal-local source IDs are not ledger additions. The Metro Québec item page was present in the current search index; direct page retrieval returned a cache miss, so use it only as corroborating retail title, UPC, and package evidence.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S01` | General Mills / Cheerios Canada, [Strawberry Banana Cheerios](https://www.cheerios.ca/products/strawberry-banana-cheerios), product title, description, ingredient declaration, package size, and Nutrition Facts panel. | Current Canadian English manufacturer SKU page. Supports the exact English name, ready-to-eat cereal identity, ingredients, 317 g package, and 1 cup (39 g) panel serving. The page directs consumers to the package if online information differs. |
| `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S02` | General Mills / Cheerios Canada, [Cheerios Fraises et bananes](https://www.cheerios.ca/fr-CA/products/cheerios-fraises-et-bananes), French title, ingredient declaration, package size, and Valeur nutritive panel. | Current Canadian French manufacturer SKU page. Supports the exact French display, ingredient wording, 317 g package, and 1 tasse (39 g) serving. The manufacturer title is used for the catalog display. |
| `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03` | General Mills / Cheerios Canada, [Our Products](https://www.cheerios.ca/products), current product list. | Lists Strawberry Banana Cheerios within a 17-product Canadian lineup, including the distinct Multi-Grain and three Oat Crunch products. Supports current product-family scope, not an equivalence or a need to add all siblings in this proposal. |
| `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S04` | Metro Québec, [Céréales à saveur de fraise et banane Cheerios](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-a-saveur-de-fraise-et-de-banane/p/065633188518), product listing, package amount, and product number. | Current indexed Québec listing corroborates a local French product phrase, 317 g package, and product code `065633188518`. It supports retail naming and product identification only, not a generic cereal measure or substitution. |

## Recommendation

**Add identity-only `ingredient-ref-strawberry-banana-cheerios` as `Strawberry Banana Cheerios / Cheerios Fraises et bananes`.** Current Canadian manufacturer pages establish the exact bilingual identity and a product-specific 1 cup (39 g) label observation; Metro Québec corroborates the local product and code. Keep it separate from Multi-Grain Cheerios, Oat Crunch variants, fruit ingredients, and generic cereal. Keep both alias arrays empty to preserve the manufacturer's exact French wording and prevent the singular retailer term `fraise` from suppressing existing substring results. Add no forms, active measures, density, mappings, conversions, yields, recipe links, or substitutions. The broader Section F review remains open.

## Reopen conditions

- Recheck the identity if the Canadian manufacturer removes or renames the SKU, the 317 g format changes, or the Metro product number no longer points to this product.
- Review the wider Cheerios picker family together if bare `Cheerios` is expected to list all current manufacturer variants; the current catalog has two exact product rows after this proposed addition while the manufacturer lists 17.
- Revisit French singular retailer-name aliases only if search behavior changes so a product phrase does not hide existing fruit substring matches.
- Add active measurements, forms, yields, recipe links, or substitutions only after a current source supplies product-specific evidence or bundled recipes create a concrete need.
