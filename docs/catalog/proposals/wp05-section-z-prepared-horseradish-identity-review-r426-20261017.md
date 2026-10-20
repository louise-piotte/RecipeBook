# WP05 Section Z — Prepared horseradish identity review (R426)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates no catalog, ledger, plan, roadmap, recipe, generated-index, batch README, or test changes.
- **Scope:** One common pantry condiment currently absent from the catalog: prepared horseradish. Keep it distinct from the fresh root, cream-style horseradish products, and wasabi products.
- **Snapshot:** Ownership, picker, and corpus findings describe the workspace read on 2026-10-17.
- **Proposed source-ID prefix:** `WP05-PREPARED-HORSERADISH-R426-20261017`; checked against the live ledger and repository documents for collisions.

## Recommendation

Add one identity-only **`SAUCE_AND_CONDIMENT`** reference for **`prepared horseradish / raifort préparé`**, with no aliases. Health Canada’s Canadian Nutrient File (CNF) uses this exact bilingual name for food code 4891 and lists metric portions. Current Québec-facing Metro listings use `Raifort préparé` and `Extra-Hot Prepared Horseradish`; a Bubbies manufacturer page also names the product as prepared horseradish. These sources establish a useful prepared-condiment identity without requiring one universal formula. [S01, S03–S05]

This is the next bounded item under the open WP05 Section Z everyday-sauce checklist, which still names horseradish sauce. The earlier everyday-condiment review found no active matching identity; its note did not decide whether the fresh root and prepared pantry condiment are one catalog item. The plan checklist remains open. [prior review](wp05-barbecue-sauce-alias-boundary-review-20261010.md) · [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8968)

### Proposed catalog row

If accepted for integration, add only this reference:

```json
{
  "id": "ingredient-ref-prepared-horseradish",
  "nameFr": "raifort préparé",
  "nameEn": "prepared horseradish",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "SAUCE_AND_CONDIMENT"
}
```

Keep aliases empty: the proposed bilingual displays are the directly attested names. Do not add brand names, `prepared white horseradish`, `extra-hot horseradish`, `horseradish paste`, `horseradish sauce`, or `creamed horseradish` as aliases. Retail heat and color qualifiers and the cream-style product boundary need their own evidence before they can be generalized. [S03–S06]

## Current ownership and collision audit

| Surface | Current finding | Decision |
|---|---|---|
| Active reference catalog | 1,723 rows. `ingredient-ref-horseradish` is `horseradish / raifort`, with no aliases, null density, no mappings, category `VEGETABLE_AND_AROMATIC`. `ingredient-ref-wasabi-root` is separate. | Keep the existing row as the plant/root identity; add the prepared condiment under a new ID. Do not alias wasabi or Japanese-horseradish wording to either row. [S02] |
| Active forms | 141 rows; no horseradish, raifort, or prepared-horseradish form or match term. | The proposed prepared product is its own compound condiment identity, not a form of fresh root. Add no form. |
| Legacy candidates | 56 candidates; no match for prepared horseradish, raifort préparé, horseradish sauce, or creamed horseradish. | No legacy ID to promote or merge. |
| Research ledger | 2,082 records, 9,436 source entries, 7,995 distinct source IDs, and 6,713 distinct source URLs. The only relevant record is the verified root reference, `ingredient-ref-horseradish`, with the OQLF root source and `measurementState` / `substitutionResearchState` both `not_yet_researched`. No prepared-condiment record or CNF 4891 source exists. | Add a new ledger record only if this proposal is accepted; leave the root evidence and state unchanged. The OQLF URL already supports the root record, so any candidate entry would use this review’s unique source ID for its separate boundary claim. |
| Forms, substitutions, and package yields | No candidate-matching forms or yields; the global and contextual substitution files each contain zero active rules. The single package-yield record is unrelated. | No form, yield, conversion, or substitution rule proposed. |
| Source and identity ownership | `ingredient-ref-prepared-horseradish`, the R426 source-ID prefix, and the proposed filename have no prior match. CNF and Metro/Bubbies URLs are absent from the live ledger. The OQLF root URL is already cited on `ingredient-ref-horseradish`; the CFIA page URL is already cited on `ingredient-ref-strawberry-jam` for a different labeling claim. | Proposed source IDs are unique; if integrated, retain the separate source IDs and their distinct locators/claims. |

The current bilingual picker query `horseradish` / `raifort` finds only the fresh-root row. The new row’s exact display phrases do not currently resolve. The separate `wasabi` query finds only `ingredient-ref-wasabi-root`.

## Proposed picker effect

`IngredientReferenceSearchIndex` prefers complete normalized word phrases across the result set, then falls back to partial matching. Accent folding makes `raifort préparé` resolve consistently. The projection below applies that current matching rule to the proposed row; it is not an app test.

| Query | Current result | With proposed row |
|---|---|---|
| `prepared horseradish` | None | `ingredient-ref-prepared-horseradish` |
| `raifort préparé` | None | `ingredient-ref-prepared-horseradish` |
| `horseradish` | `ingredient-ref-horseradish` | `ingredient-ref-horseradish` and `ingredient-ref-prepared-horseradish` |
| `raifort` | `ingredient-ref-horseradish` | `ingredient-ref-horseradish` and `ingredient-ref-prepared-horseradish` |
| `horseradish sauce`, `creamed horseradish`, `sauce au raifort` | None | None |
| `wasabi` | `ingredient-ref-wasabi-root` | Unchanged |

The broad root word returning both root and prepared condiment is intentional. Exact prepared phrases stay specific, while the unqualified fresh-root and condiment identities remain separately selectable. Do not use a broad `horseradish` or `raifort` alias on the proposed row.

## Recipe demand and numeric evidence

All **114 manifest-listed recipe files** were scanned across their full JSON content: **1,123 ingredient rows**, with no prepared-horseradish, horseradish, or raifort text or linked reference. There is no bundled recipe demand or recipe line to relink. The recipe file set’s concatenated-byte SHA-256 for this snapshot is `1cfa3fe878669664da92964122abdd4baca348a112e89cdd41ca42590a69750e`.

Health Canada CNF food code 4891 publishes two metric portions for `Horseradish, prepared / Raifort, préparé`: 5 mL = 5.1 g and 15 mL = 15.2 g. Preserve these as source-specific `portion_weight` observations if the candidate is integrated. CNF does not state a fill/levelling method or product formula, so neither portion supports a universal density or active unit mapping. Keep `defaultDensity: null` and `unitMappings: []`. [S01]

Metro Québec’s published recipe for grilled beef with snail butter uses 30 mL prepared horseradish “(or fresh if available)” for its named recipe. This is external, recipe-specific evidence only: it is not bundled-library demand, a product-mass observation, or a general fresh-root substitution rule. Do not add a recipe link, use its amount as a reusable measure, or activate a substitution. [S07]

### Proposed ledger state

If accepted, add one `ingredient_reference` record for `ingredient-ref-prepared-horseradish`:

| Field | Proposed value |
|---|---|
| `identityState` | `verified` |
| `measurementState` | `researched_supported` for the two CNF source portions only; this does not mean runtime conversion support. |
| `substitutionResearchState` | `not_yet_researched`; no generic replacement rule is proposed. |
| `measurementObservations` | Two `portion_weight` observations from S01: 5 mL / 5.1 g and 15 mL / 15.2 g, with the CNF food code, product description, date, metric basis, and explicit source-only scope. No `ingredientFormId` is needed. |
| `substitutionFindings` | None. The Metro recipe’s one “or fresh” note is context-specific and does not justify a general rule. |

Add no `ingredientForm`, unit conversion, default density, unit mapping, package yield, recipe link, or active substitution. Keep the existing root ledger record’s measurements and substitution state unchanged.

## Identity and exclusion boundaries

- **Fresh horseradish root:** remains `ingredient-ref-horseradish / horseradish / raifort`, category `VEGETABLE_AND_AROMATIC`. OQLF defines `raifort` as a plant cultivated for its root and pairs it with English `horseradish`; this is the root boundary, not a prepared-product definition. [S02]
- **Prepared horseradish:** the proposed unbranded pantry-condiment family. Current products show that formulations vary: Bubbies lists horseradish, water, vinegar, sugar, salt, and natural mustard oil, while the Québec Metro listings include a separate extra-hot product. Do not store those formulations or qualifiers as universal properties. [S03–S05]
- **Horseradish sauce / creamed horseradish:** keep unresolved as a separate future product boundary. CFIA’s processed-fruit-and-vegetable page lists “Horseradish sauce, prepared horseradish, creamed horseradish” in a regulatory labeling table. That shared listing is a product-class context, not evidence that the terms are compositional synonyms or the same recipe ingredient. Do not alias them together. [S06]
- **Wasabi and “Japanese horseradish”:** remain separate. The catalog already has a wasabi-root identity; the ordinary word `horseradish` is not a wasabi synonym. [S02 and existing WP03 root review]
- **Unqualified `horseradish paste` or `raifort en pâte`:** exclude. A manufacturer may describe prepared horseradish as usable as a paste, but that does not make the phrase a product name or a synonym. [S05]

No OQLF preferred-term claim is made for `raifort préparé`: its display is supported by Health Canada’s bilingual CNF description and current Québec retail product wording. The review did not find a source establishing a single prepared-horseradish recipe, universal heat/color classes, cream-sauce equivalence, or a generally applicable fresh-root substitution.

## Sources checked 2026-10-17

| ID | Source and locator | Use and limits |
|---|---|---|
| `WP05-PREPARED-HORSERADISH-R426-20261017-S01` | Health Canada, [Canadian Nutrient File, serving portion, food code 4891](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4891), page details modified 2019-03-01. | Direct bilingual food description `Horseradish, prepared / Raifort, préparé` and the 5 mL / 5.1 g and 15 mL / 15.2 g source portions. The page does not state formula, filling method, or a universal density. |
| `WP05-PREPARED-HORSERADISH-R426-20261017-S02` | Office québécois de la langue française, [raifort (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095252/raifort), term, definition, and English/Latin equivalents; updated 1982. | Supports the existing botanical/root identity and French/English distinction. It does not define the prepared condiment. The OQLF URL is already present on the root’s ledger record. |
| `WP05-PREPARED-HORSERADISH-R426-20261017-S03` | Metro Québec, [Bubbies Raifort préparé, 250 mL](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/raifort-prepare/p/038261957665), product 038261957665, French title and product details. | Current Québec-facing French retail wording `Raifort préparé`; the paired English page calls the same SKU `Prepared Horseradish`, gives a 250 mL package, and lists ingredients. Metro displayed the item out of stock when checked; availability is store-specific and not part of the identity claim. |
| `WP05-PREPARED-HORSERADISH-R426-20261017-S04` | Metro Québec, [Irrésistible Extra-Hot Prepared Horseradish](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/relish-chutney-et-sauces-aux-fruits/raifort-prepare-extra-fort/p/059749927604), product 059749927604, product name and description. | Current Québec-market product listing calls it an extra-hot prepared condiment made from freshly grated root and identifies 250 mL / Canadian production. It supports a separate heat-qualified product example, not an alias or universal formulation. |
| `WP05-PREPARED-HORSERADISH-R426-20261017-S05` | Bubbies, [Prepared Horseradish](https://www.bubbies.com/products/prepared-horseradish), Canada label section and ingredient list. | Manufacturer product name and one current formulation: horseradish, water, distilled vinegar, sugar, salt, and natural mustard oil. Do not generalize this formula, fermentation claim, refrigeration, or product instructions to the entire identity. |
| `WP05-PREPARED-HORSERADISH-R426-20261017-S06` | Canadian Food Inspection Agency, [Labelling requirements for processed fruit or vegetable products](https://inspection.canada.ca/en/food-labels/labelling/industry/processed-fruit-vegetable-products), product-name table, row 311. | Lists `Horseradish sauce, prepared horseradish, creamed horseradish` in a processed-product labeling context. It does not provide a formula or establish those phrases as recipe-level synonyms. |
| `WP05-PREPARED-HORSERADISH-R426-20261017-S07` | Metro Québec, [Bœuf grillé, beurre aux escargots et raifort](https://www.metro.ca/recettes-et-occasions/recettes/boeuf-grille-beurre-aux-escargots-et-raifort), ingredient list and recipe, published 2024-07-05. | Uses 30 mL prepared horseradish, with a recipe-specific parenthetical option for fresh root. Supports culinary use only; it does not justify an active substitution or reusable measure. |

## Disposition

Proceed with the identity-only `prepared horseradish / raifort préparé` row and the two source-specific CNF portions in its ledger record. Keep root, prepared condiment, creamy sauce, and wasabi wording separate. Leave alias arrays empty, density and unit mappings unset, substitutions inactive, and the bundled recipe corpus unchanged. The broad WP05 everyday-sauce checklist remains open.

No app, Gradle, emulator, deployment, or software tests were run; this is a proposal-only documentation change.
