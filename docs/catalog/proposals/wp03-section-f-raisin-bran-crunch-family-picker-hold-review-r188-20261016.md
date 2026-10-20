# WP03 Section F: Raisin Bran Crunch family picker hold (R188)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Integrated as a documentation-only family-picker hold. No shared catalog JSON, ledger, recipe, or generated data changed; the active Section F checklist, roadmap, and batch README now record the hold. No software tests were run because no database JSON data was added.
- **Open checklist:** The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L3566) still requests regionally significant cereal mixes and preprocessed grains encountered in cuisine sweeps.
- **Candidate:** WK Kellogg Canada's current ready-to-eat SKU **Kellogg's Two Scoops Raisin Bran Crunch Cereal / Céréales Kellogg's Raisin Bran deux pelletées Croquantes**.
- **Recommendation:** Hold this single family member outside active references, forms, legacy mappings, and the research ledger until the standard Raisin Bran Deux Pelletées sibling is covered in the same picker decision. A Crunch-only row would make both broad English and French Raisin Bran searches return just the Crunch product.
- **Scope:** This review concerns the Crunch SKU only. It does not combine it with standard Raisin Bran, generic bran-flakes cereal, wheat bran, raisins, granola, rice cereal, or other listed components.

## Product identity and Québec naming evidence

WK Kellogg Canada's current English SKU page names **Kellogg's Two Scoops Raisin Bran Crunch Cereal**, describes crispy multi-grain flakes with raisins and honey-flavour oat granola clusters, lists the 436 g package, and provides its ingredient declaration [S01]. The Canadian French SKU page names **Céréales Kellogg's Raisin Bran deux pelletées® Croquantes**, gives the corresponding French ingredient declaration and 436 g package, and has its region set to Québec with local retailer routes including Provigo and Metro Québec [S02]. Use the French manufacturer title for the display; it is Canada-French product wording with Québec retail context, not an OQLF ruling.

The Canadian manufacturer brand pages list two separate products: **Kellogg's Two Scoops Raisin Bran®** and **Kellogg's Two Scoops Raisin Bran® Crunch Cereal** in English [S03], and **Kellogg's Raisin Bran Deux Pelletées®** and **Céréales Kellogg's Raisin Bran deux pelletées® Croquantes** in French [S04]. This family listing supports distinct product identities, not ingredient equivalence.

Provigo Québec's current indexed product listing calls the candidate **Raisin Bran Céréales croquantes**, identifies a 436 g package and product number `21594420_EA`, and reports a Nutrition Facts serving of 1 tasse (57 g) [S05]. The retailer phrase is secondary product-list wording and is not proposed as an alias. Its stock status is store-specific and is not used to generalize availability.

The package is a formulated ready-to-eat cereal. Its ingredient list does not quantify ingredient proportions, so it does not support component links, a formula, or mappings to bran flakes, raisins, oats, rice, granola, or other ingredients [S01–S02]. Keep the Crunch product separate from the standard Two Scoops Raisin Bran SKU and from generic bran flakes.

## Ownership and prior-review audit

The R188 pre-hold audit snapshot contained **1,567 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,912 ledger records** with **8,225 source entries**, **7,024 distinct source IDs**, and **5,818 distinct source URLs**.

Exact normalized-key searches across reference IDs, bilingual names and aliases; form labels and match terms; legacy names and aliases; and ledger records found no owner for the proposed ID, either manufacturer product title, the local retailer title, the phrase `Raisin Bran Crunch`, or product number `21594420_EA`. Nearby active references include `ingredient-ref-bran-flakes-cereal`, wheat bran, and raisins; none names this finished cereal. No Raisin Bran Crunch form, legacy allocation, or ledger identity exists.

At proposal review time, the active plan and archives contained no focused Raisin Bran or Two Scoops identity decision or hold. The general bran-flakes review concerns generic cereal and does not allocate a Kellogg's product identity. The R188 family hold is now recorded in the active plan and roadmap. The manufacturer product and family URLs, Provigo URL, recipe URL, and proposal-local R188 source IDs below are absent from the current ledger source register. The S01–S06 identifiers are proposal-local only and do not allocate ledger entries while this hold stands.

## Picker projection and collision consequence

The current picker folds case, accents, and punctuation, returns complete word-phrase matches first, and falls back to substring matching only when no complete phrase matches [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). A static projection using the current reference and form terms gives:

| Query | Current results | If Crunch alone were added |
| --- | --- | --- |
| `Raisin Bran Crunch` / full English display | 0 | 1 Crunch row |
| `Raisin Bran` | 0 | 1 Crunch row, although the manufacturer lists standard Raisin Bran separately |
| `Raisin Bran deux pelletées` | 0 | 1 Crunch row, although the manufacturer lists standard Deux Pelletées separately |
| `bran flakes` | 1 generic bran-flakes cereal | 1, unchanged |
| `cereal` / `céréales` | 22 / 19 | 23 / 20 |
| `bran` | 8 | 9, including Crunch |

The exact Crunch query would be useful, but the display itself contains the broader Raisin Bran family phrase; empty aliases cannot prevent the family query from becoming a one-product result. Adding the retailer title as an alias would also create an unreviewed retail-name search route and would not represent the standard sibling. Reopen only with the family boundary handled together or when the picker can show both sibling choices for broad Raisin Bran queries.

## Bundled recipe-corpus demand

The manifest lists **114 recipe files and 1,123 structured ingredient rows**. Full-file text and ingredient-row scans for the proposed ID, both manufacturer titles, the local retail title, Raisin Bran/Deux Pelletées wording, and product number `21594420_EA` found **0 matching files and 0 matching ingredient rows**. There is no recipe link or relinking demand.

## Numeric, form, and substitution boundaries

- **Product-specific serving:** Provigo reports **1 cup (57 g)** for this exact 436 g SKU [S05]. If the family is later accepted, retain this only as a product-specific `portion_weight` observation from the retailer-presented label. The retailer says nutrition values are approximate; the listing supplies no cup fill or packing method. Do not use this observation as a generic cereal measure, density, or active unit mapping.
- **Package:** 436 g is the product's net package mass, not a recipe amount, serving conversion, or yield [S01–S02, S05].
- **Composition:** The ingredient statement is not a quantified formula. Do not create component links to bran flakes, raisins, oats, rice, or granola.
- **Forms and preparation:** The cereal is ready to eat as sold. No dry-to-prepared yield or reusable preparation conversion is established; add no form or yield.
- **Substitution:** The manufacturer has a cookie recipe calling for 1 cup of standard Two Scoops Raisin Bran cereal [S06]. It does not name Raisin Bran Crunch as an option or establish interchangeability. Do not transfer that recipe amount or infer a global or contextual substitution. No active substitution is supported.

## Conditional reference and ledger details if the family decision later permits an add

This is a future integration sketch only; **do not add this row while the hold stands**.

```json
{
  "id": "ingredient-ref-kelloggs-two-scoops-raisin-bran-crunch-cereal",
  "nameFr": "Céréales Kellogg's Raisin Bran deux pelletées Croquantes",
  "nameEn": "Kellogg's Two Scoops Raisin Bran Crunch Cereal",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

If later accepted with the standard sibling considered alongside it, create one `ingredient_reference` ledger record keyed by that ID with `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: researched_no_supported_substitute`. Attach sources S01–S06 and one product-specific observation:

- `observationId`: `WP03-RAISIN-BRAN-CRUNCH-R188-20261016-M1-LABEL-1-CUP-57G`
- `relationship`: `portion_weight`; `value`: `57`; `valueUnit`: `g`; `observedMassG`: `57`
- `sourceQuantity`: `{ "amount": 1, "unit": "cup" }`
- `foodDescription`: Kellogg's Two Scoops Raisin Bran Crunch Cereal, 436 g Provigo Québec item
- `foodState`: dry ready-to-eat cereal, as sold
- `measurementMethod`: retailer-presented Nutrition Facts serving-size label; fill method not stated
- `quantityBasis`: this SKU's listed label serving only; not a generic cereal measure, density, or unit conversion
- `evidenceKind`: `published_portion`; `sourceIds`: S05

Leave `substitutionFindings` empty. Add no form, alias, legacy mapping, recipe link, reusable measure, density, unit mapping, conversion, yield, or substitution rule. The single-sibling family hold means no reference, observation, source registration, or ledger record is proposed for current integration.

## Source register

Sources checked online on 2026-10-16. Each proposal-local source ID below points to exactly one URL; none is registered in the active ledger by this proposal.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP03-RAISIN-BRAN-CRUNCH-R188-20261016-S01` | WK Kellogg Co Canada, [Kellogg's Two Scoops Raisin Bran Crunch Cereal](https://www.wkkellogg.ca/en/products/raisin-bran-crunch-product) | Current English Canada SKU page gives the product title, extra-crunch description, ingredients, 436 g package, and product/retailer context. No Nutrition Facts serving amount is shown in the page content. |
| `WP03-RAISIN-BRAN-CRUNCH-R188-20261016-S02` | WK Kellogg Co Canada, [Céréales Kellogg's Raisin Bran deux pelletées Croquantes](https://www.wkkellogg.ca/fr/produits/raisin-bran-crunch-product) | Current indexed French Canada product page gives the exact French title, French ingredient wording, 436 g package, Québec region setting, and Québec-facing retailer routes. Direct page retrieval rendered a JavaScript placeholder, so use indexed product content for those facts; this is manufacturer wording, not an OQLF ruling. |
| `WP03-RAISIN-BRAN-CRUNCH-R188-20261016-S03` | WK Kellogg Co Canada, [Kellogg's Two Scoops Raisin Bran brand page](https://www.wkkellogg.ca/en/our-foods/our-brands/raisin-bran) | Current English family page lists standard Two Scoops Raisin Bran and Two Scoops Raisin Bran Crunch as separate products. Supports sibling scope, not formula or interchangeability. |
| `WP03-RAISIN-BRAN-CRUNCH-R188-20261016-S04` | WK Kellogg Co Canada, [Kellogg's Raisin Bran Deux Pelletées brand page](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/two-scoops-raisin-bran) | Current Canadian French family page links separately to `Kellogg's Raisin Bran Deux Pelletées®` and `Céréales Kellogg's Raisin Bran deux pelletées® Croquantes`. Supports the exact French family/product wording and sibling boundary. |
| `WP03-RAISIN-BRAN-CRUNCH-R188-20261016-S05` | Provigo Québec, [Raisin Bran Céréales croquantes, 436 g](https://www.provigo.ca/fr/raisin-bran-c-r-ales-croquantes/p/21594420_EA) | Current indexed Québec listing gives local retail wording, item number `21594420_EA`, 436 g package, ingredients, and 1 tasse (57 g) Nutrition Facts serving. The page is store-sensitive and marks nutrition values approximate; serving evidence is SKU-specific only. |
| `WP03-RAISIN-BRAN-CRUNCH-R188-20261016-S06` | WK Kellogg Co Canada, [Two Scoops Raisin Bran Sweet-and-Salty Raisin Oatmeal Cookies](https://www.wkkellogg.ca/en/recipes/kellogg-s-two-scoop-raisin-bran-sweet-and-salty-raisin-oatmeal-cookies-recipe) | Current manufacturer recipe calls for 1 cup of standard Two Scoops Raisin Bran cereal. It is context for the standard sibling only and does not establish a Crunch option, transferable measure, or substitution. |

## Recommendation and reopen conditions

**Hold `Kellogg's Two Scoops Raisin Bran Crunch Cereal / Céréales Kellogg's Raisin Bran deux pelletées Croquantes` outside the active catalog and research ledger until the standard Raisin Bran Deux Pelletées sibling can be considered in the same family/picker decision.** Current manufacturer and Québec-facing sources establish a distinct Crunch SKU and product-matched bilingual wording, but a one-row addition would make broad Raisin Bran family searches select only Crunch. The full bundled recipe corpus has no matching demand. If a later family review accepts the reference, keep it identity-only and retain 1 cup (57 g) solely as the Provigo item-specific observation.

Reopen when the family can be reviewed with both current product identities together, or when picker behavior can preserve the family boundary while returning the specific Crunch result. Recheck the titles and retailer item if the Canadian product is renamed or removed. Add measures, conversions, forms, yields, recipe links, or substitutions only with direct product-specific evidence or new bundled recipe demand.
