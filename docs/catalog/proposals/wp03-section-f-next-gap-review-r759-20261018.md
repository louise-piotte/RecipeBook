# WP03 Section F: Apple Cinnamon Cheerios identity review (R759)

## Review record

- **Reviewed:** 2026-10-18.
- **Open-plan fit:** Section F keeps remaining grain and cereal identity coverage open in the [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L564).
- **Candidate:** the current Canadian ready-to-eat cereal titled **Apple Cinnamon Cheerios / Pomme et Cannelle Cheerios** on the bilingual manufacturer pages.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, `ingredient-ref-apple-cinnamon-cheerios`, using the manufacturer’s English and French titles. Add `Cheerios Pomme et cannelle` as one French alias because the manufacturer’s French page and a current Québec retailer use that brand-first wording. If integrated, record the manufacturer’s **1 cup (39 g)** / **1 tasse (39 g)** only as a product-specific `portion_weight` observation. Add no form, active conversion, density, recipe link, cooking or package yield, or substitution rule.
- **Status:** Proposal only. No catalog, ledger, plan, roadmap, workflow, or generated data was edited for this review.
- **Snapshot:** 1,848 active references, 184 forms, 56 legacy-import candidates, 2,241 ledger records (10,519 source entries; 8,876 distinct source IDs and 7,523 distinct URLs), and 114 manifest-listed recipes / 1,123 structured ingredient rows.

This is a distinct Canadian oat cereal product, not a U.S. product inference. The candidate’s exact French brand-first phrase appears in R181 only as a neighboring Canadian listing while that proposal reviewed Oat Crunch Cinnamon; R181 did not review or assign an identity to this Apple Cinnamon product. This proposal is separate from R738’s Oatmeal Crisp family hold, R741’s cooked-millet CNF access review, R744’s prepared-kasha boundary, R750’s rice-poha thickness grades, R753’s sorghum-couscous product hold, and R756’s whole-grain sorghum forms and yield.

## Product identity and bilingual naming

General Mills’ current Canada-English product page titles the cereal **Apple Cinnamon Cheerios** and describes it as toasted oat cereal flavored with apples and cinnamon. It lists whole-grain oats as the first ingredient, apple puree and cinnamon in the ingredient declaration, and current package sizes of 420 g and 778 g. The Canada-French product page is a separate language route for the same product and titles it **Pomme et Cannelle Cheerios**. It describes toasted oat cereal with apple and cinnamon, gives the French ingredient declaration, and lists the same package sizes. Both manufacturer Nutrition Facts panels state **1 cup (39 g)** / **1 tasse (39 g)** [S01–S02]. The manufacturer warns that online ingredients and nutrition details can change and that the package is the reference if it differs.

The current French manufacturer page also uses the brand-first wording `Cheerios Pomme et cannelle` in its product description. A current Walmart Canada Québec listing is titled **Cheerios Pomme et cannelle Céréales, Format familial 778g** and lists the brand as Cheerios, flavor as `Pomme Cannelle`, and grain as oats [S02–S03]. Use the manufacturer page title for the French display and the supported brand-first phrase as a search alias. The retailer corroborates Québec-facing retail wording; it does not establish a UPC crosswalk to either manufacturer-listed package size, and Walmart cautions that product details may be provided by suppliers and are not separately verified.

| Field | Proposed value | Basis |
|---|---|---|
| `nameEn` | `Apple Cinnamon Cheerios` | Exact title on the current Canada-English manufacturer product page. |
| `nameFr` | `Pomme et Cannelle Cheerios` | Exact title on the current Canada-French manufacturer product page. |
| `aliasesEn` | `[]` | The manufacturer’s exact English product title is the searchable display. |
| `aliasesFr` | `["Cheerios Pomme et cannelle"]` | Brand-first phrase in the French manufacturer description and current Québec retailer title. |
| `category` | `GRAIN_AND_CEREAL` | A named, formulated, ready-to-eat oat cereal. |

Keep the product separate from the original Cheerios identity, Apple Cinnamon Chex cereal, generic oat/cereal ingredients, and apple or cinnamon references. The manufacturer’s ingredient declaration is not a quantified formula and does not support component mappings or recipe-line links. The French brand title is manufacturer wording, not a claim of an OQLF terminology ruling.

| Neighbor | Current owner | Boundary |
|---|---|---|
| Apple Cinnamon Chex cereal / Céréales de riz aux pommes et cannelle Chex | `ingredient-ref-apple-cinnamon-chex-cereal`, with alias `Chex Pomme et cannelle` | A separately named rice-based ready-to-eat cereal. The shared apple/cinnamon flavor wording does not identify the same product. |
| Cheerios original, Multi-Grain, Oat Crunch, Honey Nut, and Strawberry Banana variants | Their separate active reference rows | Shared brand wording is not ingredient equivalence. Keep this product as its own finished cereal. |
| Oats, apple, cinnamon, sugars, oils, and other declared ingredients | Existing generic ingredient references | The declaration gives no proportions or evidence to replace the complete product identity with a component. |

## Exact ownership and archive audit

The proposed stable ID, exact English title, exact French title, and brand-first French alias were checked against active reference names and aliases, form labels and match terms, the 56 legacy-import candidates, research-ledger records and source URLs, the active plan, roadmap, proposal archive, and bundled recipe corpus. No exact owner or prior focused review was found. The only proposal-archive phrase hit was R181’s brief mention of `Cheerios Pomme et Cannelle` as a distinct neighboring Canadian listing; it did not define this product’s identity, picker fields, portion, or recipe demand.

There is no matching active form or ledger identity. The proposed source IDs `WP03-APPLE-CINNAMON-CHEERIOS-R759-20261018-S01` through `S03`, the candidate-specific English and French manufacturer URLs, and the Walmart URL are unowned in the current ledger. The general Cheerios product-list URL is already registered in the ledger under R185’s existing source `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03`; reuse that source if family-roster context is needed rather than creating another source entry for the same URL. If it is attached to this product, extend its existing locator/support text to record Apple Cinnamon Cheerios’ listing. The English product-list page currently lists the product among 17 Canadian Cheerios products [S04]. These 17 products are brand-lineup context, not evidence that the active catalog contains every variant.

The active brand rows already include eight distinct Cheerios products. Adding this title makes the broad brand query a nine-result query, not a single-row alias. The exact Apple Cinnamon Chex neighbor remains separate. No shared ingredient or source IDs are allocated by this proposal; the ID and source labels are recommendations for a future integration after it repeats the ownership check.

## Picker projection

The static projection uses the current reference and form search terms with [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized case, accents, ligatures, and punctuation; complete word-phrase matches first; substring fallback only when there are no phrase matches. The hypothetical row uses the two proposed manufacturer titles and the single French alias above.

| Query | Current results | With R759 | Effect |
|---|---:|---:|---|
| `Apple Cinnamon Cheerios` | 0 | 1 proposed row | Exact English product name. |
| `Pomme et Cannelle Cheerios` | 0 | 1 proposed row | Exact French manufacturer title. |
| `Cheerios Pomme et cannelle` | 0 | 1 proposed row | The supported French brand-first query. |
| `Apple Cinnamon` | 1: Apple Cinnamon Chex | 2: Chex and Cheerios | Expected shared flavor wording; the brand-qualified full title distinguishes products. |
| `Pomme et Cannelle` | 1: Apple Cinnamon Chex | 2: Chex and Cheerios | Expected shared French flavor wording; do not present it as product equivalence. |
| `Cheerios` | 8 | 9 | Adds one distinct product to the existing brand-family results. The current brand list has 17 products, so this is not a complete-family claim. |
| `cereal` / `céréales` | 77 / 73 | 77 / 73 | Neither proposed display nor alias adds a generic cereal term. |

The flavor-only results intentionally broaden because the full manufacturer product titles include the flavor. No `cereal`, `céréales`, plain `Cheerios`, or component alias is needed. This is a static projection, not an Android picker test.

## Recipe-corpus demand

All **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** were searched for the English and French titles, the French brand-first phrase, the proposed stable ID, and the spelling variants `Cheerios Pomme et cannelle` / `Cheerios Pomme et Cannelle`. The scan found **0 matching recipe files and 0 matching ingredient rows**. No recipe link, ingredient-line rename, or recipe-text change is supported. Generic mentions of oats, apples, cinnamon, or cereal are not evidence of demand for this formulated branded product.

## Portion, form, and substitution boundaries

- **Nutrition serving:** Both current manufacturer language pages list **1 cup (39 g)** / **1 tasse (39 g)** for this named cereal [S01–S02]. If recorded, keep it as a product-specific `portion_weight` observation for dry, ready-to-eat cereal as sold. It is not a generic cereal cup measure, density, unit mapping, or mass-volume conversion.
- **Packages:** The manufacturer lists 420 g and 778 g package variants; Walmart’s Québec page is titled for a 778 g family package [S01–S03]. These are package net amounts, not recipe portions, yields, or evidence that the retailer listing is crosswalked to a particular manufacturer code.
- **Forms and preparation:** The product is sold as ready-to-eat cereal. The reviewed pages establish no alternate ingredient form, crushed/cooked conversion, preparation ratio, or yield. Add no ingredient form or package/cooking yield.
- **Composition:** The label gives ingredient names, not proportions. Do not decompose the cereal into oat, apple, cinnamon, or other component references.
- **Substitution:** None of the reviewed sources supplies a tested, quantity-qualified replacement between this SKU and another cereal, a generic oat ingredient, or Apple Cinnamon Chex. Keep substitution findings empty and add no global or contextual substitution rule. The manufacturer’s statement that the cereal tastes good in recipes is not an exchange recommendation.

If accepted, set ledger identity to `verified`, measurement to `researched_supported`, and bounded substitution research to `researched_no_supported_substitute`. Record one source-scoped observation:

| Field | Value |
|---|---|
| `observationId` | `WP03-APPLE-CINNAMON-CHEERIOS-R759-M1-LABEL-1-CUP-39G` |
| `relationship` / `value` / `valueUnit` | `portion_weight` / `39` / `g` |
| `sourceQuantity` / `observedMassG` | `{ "amount": 1, "unit": "cup" }` / `39` |
| `foodDescription` | Apple Cinnamon Cheerios, Canadian manufacturer Nutrition Facts serving |
| `foodState` | Dry ready-to-eat cereal, as sold |
| `measurementMethod` | Manufacturer Nutrition Facts serving-size label |
| `quantityBasis` | SKU-specific nutrition serving only; not a generic cereal measure, density, or unit conversion |
| `evidenceKind` / `sourceIds` | `manufacturer_label` / S01 and S02 |

## Proposed reference example

The following is an integration example only; it does not edit or allocate the active catalog row. French database JSON text uses explicit Unicode escapes per the seed-data convention.

```json
{
  "id": "ingredient-ref-apple-cinnamon-cheerios",
  "nameFr": "Pomme et Cannelle Cheerios",
  "nameEn": "Apple Cinnamon Cheerios",
  "aliasesFr": ["Cheerios Pomme et cannelle"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The ledger entry should keep `substitutionFindings` empty and attach S01–S03 plus the single observation above. S04 is reusable family-list context and need not be copied to the candidate record. Add no ingredient form, legacy-import mapping, active unit conversion, cooking/package yield, recipe link, or substitution rule. Section F remains open.

## Source register

Sources accessed 2026-10-18. S01–S03 are proposal-local and are not ledger additions.

| Source | Source and locator | Evidence and limits |
|---|---|---|
| **S01** `WP03-APPLE-CINNAMON-CHEERIOS-R759-20261018-S01` | General Mills / Cheerios Canada, [Apple Cinnamon Cheerios](https://www.cheerios.ca/products/apple-cinnamon-cheerios), title, product description, ingredients, package options, Nutrition Facts serving, and online-information notice. | Current Canada-English product page identifies the ready-to-eat oat cereal and exact English title; lists 420 g and 778 g sizes and a 1 cup (39 g) serving. It cautions that product details may change and the package governs if online data differ. |
| **S02** `WP03-APPLE-CINNAMON-CHEERIOS-R759-20261018-S02` | General Mills / Cheerios Canada, [Pomme et Cannelle Cheerios](https://www.cheerios.ca/fr-CA/products/pomme-et-cannelle-cheerios), French title, product description, ingredients, package options, Valeur nutritive serving, and online-information notice. | Current Canada-French product page supplies the exact French manufacturer title, French ingredient declaration, 420 g and 778 g sizes, and 1 tasse (39 g). Its brand-first prose wording supports the proposed French alias; the label remains the authority if online data differ. |
| **S03** `WP03-APPLE-CINNAMON-CHEERIOS-R759-20261018-S03` | Walmart Canada, [Cheerios Pomme et cannelle Céréales, Format familial 778g](https://www.walmart.ca/fr/ip/Cheerios-Pomme-et-cannelle-C-r-ales-Format-familial/6000198309713), French title and product attributes. | Current Québec French retail page supports a local brand-first product phrase and lists Cheerios, Pomme Cannelle flavor, oats, and a 778 g package. Walmart says product details may come from suppliers and are not independently verified; no UPC is shown, so this is not used to crosswalk the retailer package to a manufacturer label or to support formula or portion claims. |
| **S04 — reuse existing ledger source** `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03` | General Mills / Cheerios Canada, [Our Products](https://www.cheerios.ca/products), current product list, rechecked 2026-10-18. | The current Canada-English list shows Apple Cinnamon Cheerios as a distinct product among 17 results. The URL is already owned in the ledger by the cited R185 source; if used for this row, update that source’s locator/support in place rather than adding a duplicate URL entry or creating a second source ID. It is lineup context, not evidence that the current active catalog covers all brand variants. |

## Static checks and test scope

- [x] Read current `AGENTS.md`, active Section F plan, roadmap through R755–R757, relevant proposal history, live reference/form JSON, research ledger, and the bundled recipe corpus.
- [x] Verified the product and both display names on current Canada-English and Canada-French manufacturer SKU pages; corroborated the French brand-first phrase with a current Québec retail page. No U.S.-only evidence is used for Canadian availability.
- [x] Audited active reference/form/legacy/ledger ownership, exact source-ID and product-URL ownership, prior proposal mentions, and the exact bilingual phrase boundary. No shared identifiers were allocated.
- [x] Projected exact, flavor, brand, and broad-category queries against current name, alias, and form terms using the live phrase-first picker behavior.
- [x] Scanned the complete 114-file / 1,123-row manifest-listed recipe corpus; found no candidate-specific demand or direct reference.
- **No software tests, build, emulator, or deployment were run.** This is a proposal-only documentation change; `AGENTS.md` waives testing for database-JSON-only additions, and no database data changed here.
