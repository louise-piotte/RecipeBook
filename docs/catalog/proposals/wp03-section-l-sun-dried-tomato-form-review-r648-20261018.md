# WP03 Section L R648 — Sun-dried tomato form review — 2026-10-18

- **Status:** Integrated. Added one sun-dried form under generic tomatoes and a form-specific evidence-ledger record; no reference or recipe fields changed.
- **Recommendation:** Add one `sun_dried` form under the existing generic tomato reference.
- **Boundary:** Keep the generic tomato identity and its existing aliases unchanged. Model the drying state only; do not add an oil-packed or seasoned form, tomato-paste identity, recipe link, measure, density, conversion, or substitution.
- **Testing:** No software tests, build, emulator run, or deployment were performed because this change only adds database JSON data under `AGENTS.md`.

## Why this is a distinct open item

Section L still lists sun-dried tomato among the open tomato products. R128 addressed canned whole tomatoes, R129 canned crushed tomatoes, and R130 tomato purée. R128 explicitly left sun-dried and oil-packed products for separate review. The [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6099) therefore retains a produce-form gap with direct Canadian regulatory-surveillance and Québec retail evidence now available.

This review does not reopen the Ancho/Poblano boundary already covered in the [WP06 Mexican dried-chile review](wp06-mexican-dried-chile-boundaries-20261009.md), or R629/R632/R636/R639/R642/R644. It advances one different Section L product form under the active tomato identity. Requirements [FR-7](../../../Requirements.md#L375) calls for searchable French and English ingredient names and forms.

## Current ownership and identifier audit

The read-only snapshot on 2026-10-18 contains **1,833 active references, 162 forms, 56 legacy candidates, and 2,204 research-ledger records with 10,289 source entries**. The manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Current owner and proposed treatment |
|---|---|
| Active reference | `ingredient-ref-tomatoes` is the generic `tomates / tomatoes` identity. It owns its existing generic aliases, including `tomate` / `tomato` and the unqualified whole/crushed terms. Keep its ID, aliases, category, density, and unit mappings unchanged. |
| Forms | The reference currently owns only `ingredient-form-tomatoes-canned-diced`, `ingredient-form-tomatoes-canned-whole`, and `ingredient-form-tomatoes-canned-crushed`. No active form owns `sun-dried tomatoes`, `sun-dried tomato`, `tomates séchées au soleil`, or `tomate séchée au soleil`. Add only `ingredient-form-tomatoes-sun-dried`. |
| Other tomato identities | Cherry and plum tomato, tomato juice, paste, purée, sauce, passata, and ketchup identities remain separate. This proposal adds no tomato-paste, pesto, sauce, or oil-packed identity. |
| Legacy archive | No exact sun-dried tomato candidate or proposed form ID appears in the 56-row legacy archive. No legacy record is promoted. |
| Research ledger | The generic tomato row has an accepted, source-specific CNF observation for one large raw red-ripe tomato (7.6 cm diameter, 182 g). That raw whole-tomato observation is not transferred to a dried form. No sun-dried tomato form record or proposed form ID exists in the ledger. |
| Source and form IDs | `ingredient-form-tomatoes-sun-dried` is unused. New source IDs `WP03-L-TOMATO-SUN-DRIED-20261018-R648-S01` through `S04` are absent from the ledger and catalog proposal/batch archive. |

The source evidence distinguishes a sun-dried state from the package and recipe around it. CFIA surveyed air-packed sun-dried tomatoes. Metro Québec product pages list sun-dried tomatoes in oil and with added ingredients, and Metro’s recipe uses them in oil. The form represents only the sun-dried tomato ingredient; it does not declare oil, vinegar, herbs, a packing liquid, rehydration level, or a recipe-specific preparation.

## Evidence and Québec naming

CFIA’s 2016–2017 survey says sun-dried tomatoes are used in foods such as salads, soups, and sauces. Its sampling covered 221 retail samples of air-packed sun-dried tomatoes from 11 Canadian cities. This directly establishes a named sun-dried tomato product in Canadian retail and supports keeping air-packed product separate from the Québec oil-packed examples. The survey is not a product standard and does not define drying level, cultivar, mass, or recipe substitutions. [S01]

Metro Québec’s Kémia listing uses the French product heading `Tomates séchées au soleil`. Its 314 mL product lists tomatoes, olive oil, herbs, and vinegar. This is direct local product wording, but the listing is a specific seasoned-in-oil item, not an official terminology ruling or a general package composition. The page was listed as out of stock when checked; this review does not infer current availability from the listing. [S02]

Metro’s Québec recipe for tuna salad names sun-dried tomatoes in oil and lists a separate amount of the oil from the tomatoes. This documents culinary use and the oil-packed variant. The recipe’s tomato and oil quantities are specific to that salad and are not catalog measures, mappings, or substitutions. [S03]

A targeted OQLF search did not surface an entry for this product wording. Use `tomates séchées au soleil` as a Québec-facing display based on local Metro product wording, without presenting it as an OQLF-approved term. The English display follows the CFIA and Canadian retail wording. The regular singular forms below are qualified search variants of these full labels; do not add generic `tomates séchées`, `dried tomatoes`, or `tomato(es) in oil` as aliases.

## Recipe demand and picker projection

Every manifest-listed recipe and all **1,123 ingredient rows** were scanned across recipe text and ingredient fields. No normalized hit was found for sun-dried tomato, tomato-in-oil, or the proposed bilingual terms. The Metro recipe above is external evidence and does not create bundled recipe demand or a recipe link.

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/punctuation normalization, form search under the owning reference, complete phrase matching before substring fallback, and an exact full-query check for form hints. The counts below use the current 1,833-reference / 162-form snapshot and only the proposed bilingual form labels and qualified singular variants.

| Query | Before | After | Form hint / effect |
|---|---:|---:|---|
| `sun-dried tomatoes`, `sun dried tomatoes`, `sun-dried tomato` | 0 | 1 | Returns `ingredient-ref-tomatoes` with the new sun-dried form hint. |
| `tomates séchées au soleil`, `tomate séchée au soleil` | 0 each | 1 each | Both qualified Québec phrases return the same reference with the new form hint. |
| `dried tomatoes`, `tomates séchées` | 0 each | 1 each | The picker matches the shorter phrase inside the specific sun-dried label; no generic alias or exact form hint is added. The result displays the specific form. |
| `tomatoes`, `tomato`, `tomates`, `tomate` | 4 / 12 / 7 / 7 | unchanged | The same generic tomato reference was already returned. |
| `sun-dried` | 1 | 2 | Adds tomatoes alongside the existing rocoto qacha result; the products stay separate. |
| `dried`, `séchées` | 64 / 22 | 65 / 23 | Each broad dried-state query gains the tomato reference. |
| `sun-dried tomatoes in oil`, `tomates séchées au soleil dans l’huile`, `tomatoes in oil` | 0 each | 0 each | Oil-packed wording remains unresolved and is not a match term. |

The proposed form uses only a full sun-dried phrase and its grammatical singular. Do not add brand, Italian/plum cultivar, air-packed, oil-packed, herb, vinegar, julienne, pesto, or generic dried-tomato phrases as aliases or match terms.

## Exact proposed JSON delta

Add one object to `ingredient-forms.v1.json` and add its sources to the existing generic tomato ledger record if accepted. Do not change `ingredient-references.v1.json` or any recipe:

```json
{
  "id": "ingredient-form-tomatoes-sun-dried",
  "ingredientRefId": "ingredient-ref-tomatoes",
  "formCode": "sun_dried",
  "labelFr": "tomates s\u00e9ch\u00e9es au soleil",
  "labelEn": "sun-dried tomatoes",
  "prepState": "dry",
  "matchTermsFr": ["tomate s\u00e9ch\u00e9e au soleil"],
  "matchTermsEn": ["sun-dried tomato"],
  "densityGPerMl": null,
  "notesFr": "Forme de tomate s\u00e9ch\u00e9e au soleil. Les sources documentent des produits conditionn\u00e9s \u00e0 l'air et un produit qu\u00e9b\u00e9cois contenant de l'huile; l'emballage, l'huile, l'assaisonnement, l'hydratation et les mesures ne sont pas mod\u00e9lis\u00e9s.",
  "notesEn": "Sun-dried tomato form. Sources document air-packed products and a Qu\u00e9bec product containing oil; packaging, oil, seasoning, hydration, and measures are not modeled.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Do not apply the raw-tomato 182 g CNF portion to this form. Add no mass, density, unit mapping, can or jar yield, package conversion, rehydration ratio, recipe link, conversion, or substitution. Keep the separately open oil-packed product boundary unresolved.

## Source register — checked 2026-10-18

| Source ID | Primary source and locator | Supports and limits |
|---|---|---|
| `WP03-L-TOMATO-SUN-DRIED-20261018-R648-S01` | Canadian Food Inspection Agency, [2016–2017 Viruses in Sun-Dried Tomatoes](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/viruses-sun-dried-tomatoes), summary and sample scope. | Uses the source term `sun-dried tomatoes`; reports 221 air-packed retail samples from 11 Canadian cities and describes common culinary use. Does not define a commercial grade, drying level, mass, or conversion. |
| `WP03-L-TOMATO-SUN-DRIED-20261018-R648-S02` | Metro Québec, [Tomates séchées au soleil Kémia](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/tomates-sechees-au-soleil/p/6191457400254), product 6191457400254, listing title and ingredients. | Supports the local French product wording and one oil/herb/vinegar product. The listed 314 mL is package volume only; the listing was out of stock when checked. The direct page redirected to English during this review, while the French listing and ingredients were available in search results. |
| `WP03-L-TOMATO-SUN-DRIED-20261018-R648-S03` | Metro Québec, [Salade de thon et tomates séchées](https://www.metro.ca/recettes-et-occasions/recettes/salade-de-thon-et-tomates-sechees), ingredient list and method. | Lists sun-dried tomatoes in oil and a separate amount of tomato oil. It supports a recipe use and the oil-packed wording only; quantities and preparation are not generalized. The French page redirected to Metro’s English recipe page during this review. |
| `WP03-L-TOMATO-SUN-DRIED-20261018-R648-S04` | Metro Québec, [Tomates séchées au soleil Pastene](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/tomates-sechees-au-soleil/p/066086016052), product 066086016052, product title and ingredient list. | Independently confirms Québec retailer wording and another sun-dried tomato product with added sunflower oil, vinegar, salt, and flavorings. Does not establish one universal formulation, package mass, or oil-packing rule. |

## Remaining open scope and checks

This proposal resolves only the sun-dried state under generic tomatoes. Oil-packed tomato products, sun-dried tomato paste/pesto, tomato purée/pulp, passata, and other processed tomato products remain separate open decisions. The Section L parent checklist remains open.

Static checks completed: package and ledger validation, active reference/form/legacy and ledger ownership, picker projection, and scan of all 114 manifest recipes and 1,123 ingredient rows. No software tests, build, emulator, or deployment were run because this only adds database JSON data under `AGENTS.md`.
