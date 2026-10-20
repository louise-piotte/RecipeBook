# WP03 Section L R141 — Padrón pepper fresh-market identity review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, research ledger, plan, roadmap, generated index, or batch file was changed.
- **Disposition:** add a fresh-market identity **Padrón pepper / piment de Padrón**, with one explicit `fresh` form. Add only the English plural alias `Padron peppers`, matching the Canadian listing's unaccented spelling. Keep French aliases empty.
- **Scope:** use the Québec grower's French name as local product wording, not as an OQLF/TERMIUM preferred-term claim. Do not infer species, cultivar, protected-origin status, growing origin, or fixed heat. Do not merge Padrón with Shishito, pepperoncini, or generic peppers.
- **Numeric and recipe boundary:** the Canadian marketplace pack size, Québec seed count and crop dimensions, and the U.S. recipe's amount are source-scoped. No reusable mass, count mapping, density, conversion, yield, or recipe link is proposed. Record one explicitly dish-scoped Shishito alternative from the reviewed blistered-pepper recipe; do not add an active substitution rule.

## Checklist, ownership, archive, and recipe audit

The active [WP03 Section L fresh-chile checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4483) still lists Padrón between Shishito and Hungarian wax. R140 integrated Shishito and explicitly kept Padrón outside that row's aliases; this review evaluates Padrón as its own named market item and does not reopen R140.

Read-only snapshot on 2026-10-15:

- The live bundled catalog contains **1,496 references and 114 forms**. No active reference, alias, or form owns `Padrón`, `Padron`, `Piment de Padrón`, or `Pimientos de Padrón`. The proposed reference ID `ingredient-ref-padron-pepper` and form ID `ingredient-form-padron-pepper-fresh` are unused.
- `docs/catalog/legacy-import-identities.v1.json` contains **61 candidates** and no Padrón candidate.
- The research ledger contains **1,841 records** and no Padrón identity record. The only relevant pepper-row mention is R140's Shishito record, which excludes Padrón from Shishito aliases/substitutions. A broad text search also matches unrelated Portuguese `padronizados` (“standardized”) in two unrelated records; those are not Padrón pepper evidence.
- No focused prior Padrón proposal or integration was found. R140 mentions Padrón only as a term intentionally excluded from Shishito; R138 includes Padrón in a broad zero-hit recipe search, without deciding its identity.
- The manifest lists **114 recipes / 1,123 ingredient rows**. A static scan of all manifest-listed recipe files and ingredient rows found no Padrón/Padron wording or linked ingredient demand. An external Montréal menu lists a Padrón pepper tapa; that is local culinary context, not bundled demand.

## Names, local wording, and product boundary

Use **`Padrón pepper` / `piment de Padrón`** as the bilingual display. A current Canadian Instacart marketplace page places **`del Cabo Organic Spanish Padron Peppers`** under `Fresh Produce > Fresh Vegetables > Chili Peppers > Other Chili Peppers` and displays a 4 oz product. The page loaded with postal code H3A3J5 and says it can browse 32 stores in the area. This verifies a Canadian fresh-produce market listing; the page does not establish a specific store's current stock or the product's growing location. Its English title uses unaccented `Padron`, which is preserved as the sole English alias.

The Québec seed seller Jardins de l’Écoumène titles its seed product **`Piment de Padrón - Bio`** and uses the same French phrase in the page text. It also gives the Spanish name `Pimientos de Padrón` parenthetically. This is valuable Québec French crop wording, but that page sells seeds, not fresh peppers. The Montréal restaurant Ibéricos uses **`Pimientos de Padrón`** as a Spanish menu title and describes its dish in English as Galician green peppers. Neither the Spanish parenthetical nor the Spanish menu wording is a French localized alias. OQLF's generic [piment entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment) defines and translates `piment` as the broad food/plant term; it does not standardize the Padrón subtype. Targeted OQLF and TERMIUM searches did not surface a specific Padrón term record in this pass. Treat the French display as Québec producer wording, not official terminology.

The word `Spanish` in the Instacart product title and Galicia references in the local seed/menu descriptions do not prove that this marketplace product was grown in Spain, nor do they support a geographic restriction on all Padrón-labeled fresh peppers. This proposal makes no country, region, denomination, botanical, cultivar, or origin assertion. It also keeps Shishito separate even though a recipe permits either pepper for one dish.

### Alias boundary and picker projection

Propose one English alias, **`Padron peppers`**, because the exact Canadian product title uses that spelling. The picker normalizes accents, so a search for `Padrón peppers` also finds this alias. Leave `aliasesFr` empty: the Québec source already supplies the singular canonical `piment de Padrón`, while indexing a French plural would make a bare `piments` query a new singleton. Exclude `Pimientos de Padrón` because it is Spanish menu/source wording rather than an English or French display term. Exclude generic `pepper(s)`, `piment(s)`, `poivron(s)`, `chile`, `chili`, `Shishito`, and `pepperoncini` aliases.

The static projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the index first checks exact form phrases, then exact normalized word phrases across results, then partial substrings; form hints are returned only for an exact form-term query.

| Query | Current results | Proposed results | Effect |
|---|---:|---:|---|
| `Padrón`, `Padron`, `Padrón pepper`, `Padron peppers`, `piment de Padrón` | 0 | 1 each | Named bilingual terms resolve to the new identity; the English alias preserves the Canadian unaccented title. |
| `fresh Padrón pepper`, `piment de Padrón frais` | 0 | 1 each | The same reference resolves with its exact fresh-form hint. |
| `pepper`, `peppers`, `piment` | 25 / 5 / 20 | 26 / 6 / 21 | Each remains a multi-result query; no generic term is an alias. |
| `piments`, `poivrons` | 0 / 0 | 0 / 0 | No French plural alias creates a misleading singleton. |
| `Pimientos de Padrón`, `Shishito`, `pepperoncini` | 0 / 1 / 0 | 0 / 1 / 0 | Keep the Spanish menu phrase out of bilingual aliases and preserve Shishito as its own identity. |
| `poivron` | 1 | 1 | The existing result is unchanged; no broad French bell-pepper alias is added. |

This is a static projection against the live 1,496-reference / 114-form files and the current search implementation, not a modified package or app test.

## Fresh form, quantities, recipe demand, and substitution evidence

Add one `fresh` form. The Canadian listing's category path identifies a fresh-produce item, and the Québec grower describes harvested Padrón fruit for cooking. Do not add raw, green, grilled, blistered, fried, roasted, dried, or pickled forms: the reviewed sources do not establish these as distinct reusable catalog products/forms for this identity.

No reusable measure is supported:

- Instacart displays **4 oz** for the whole product package; it does not give a pepper count or single-pepper mass.
- Jardins de l’Écoumène lists **20 seeds**, not a food portion, and describes young fruit as **5–7 cm**. The count is a seed pack size and the length is a grower crop description, not a generic edible portion or mass conversion.
- Ibéricos' Montréal menu gives no ingredient mass or count.
- ZWILLING's recipe lists **12 oz Padrón or Shishito peppers** for its own **2–4 servings**. This is the recipe-line amount for that dish, not a per-pepper measurement, generic serving, or reusable Padrón-to-Shishito conversion.

The recipe corpus has no matching demand. Outside the bundle, Ibéricos lists `Pimientos de Padrón` as a Montréal tapa. Separately, ZWILLING's **Blistered Padrón Peppers with Smoked Sea Salt** explicitly says Shishito may be used if Padrón is unavailable and lists `12 ounces Padrón or shishito peppers`. Record that as a single recipe-scoped option only. It does not justify an alias, a global/contextual substitution rule for other dishes, or a general equal-mass conversion. No other reusable substitution is proposed.

## Source register

Sources were opened or searched on 2026-10-15. Market availability, seed pack size, and recipe amounts are kept source-scoped.

| Source ID | Source and access | Evidence used and limits |
|---|---|---|
| `WP03-L-PADRON-20261015-R141-S01` | Instacart Canada, [del Cabo Organic Spanish Padron Peppers (4 oz)](https://www.instacart.ca/products/431235-del-cabo-organic-spanish-padron-peppers-4-oz), directly opened. | Current product title and category path `Fresh Produce > Fresh Vegetables > Chili Peppers > Other Chili Peppers`; the page displayed postal code H3A3J5 and 32 stores in the area. Its 4 oz is a product/package amount, not a single-pepper quantity; the page does not establish actual store stock or growing origin. |
| `WP03-L-PADRON-20261015-R141-S02` | Jardins de l’Écoumène, [Piment de Padrón - Bio](https://ecoumene.com/products/piment-de-padron-bio), Québec seed-seller page, directly opened. | Supports the French product/crop wording `Piment de Padrón`, the parenthetical Spanish `Pimientos de Padrón`, and use of harvested fruit in cooking. It sells 20 seeds; its 5–7 cm young-fruit description is source-specific crop context, not a pepper weight or reusable measure. This is not fresh-food retail evidence. |
| `WP03-L-PADRON-20261015-R141-S03` | OQLF, [piment — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment), directly opened. | The generic entry gives privileged French term `piment`, English `pepper`, and broad plant/fruit scope; it contains no Padrón-specific terminology. Targeted OQLF/TERMIUM searches for `Padrón`, `Padron pepper`, and `piment de Padrón` surfaced no specific subtype record in this pass; non-discovery is not proof that none exists. |
| `WP03-L-PADRON-20261015-R141-S04` | OpenTable, [Ibéricos Taverne à Tapas Espagnoles, Montréal](https://www.opentable.com/r/ibericos-taverne-a-tapas-espagnoles-reservations-montreal), current menu opened directly. | The Montréal restaurant menu lists `Pimientos de Padrón`, describes Galician green peppers grilled and salted, and shows its menu last updated 2025-12-10. The Spanish menu name and dish are local culinary context; no mass, count, or French localized name is given. |
| `WP03-L-PADRON-20261015-R141-S05` | ZWILLING / Staub, [Blistered Padrón Peppers with Smoked Sea Salt](https://www.zwilling.com/us/magazine/inspiring-recipes/the-staub-cookbook/recipe-culinary-world-usa-the-staub-cookbook-padron-peppers.html), opened directly. | The recipe serves 2–4 and lists 12 oz Padrón **or** Shishito peppers, with blistering instructions; the page also says to substitute Shishito if Padrón cannot be found. Supports only that recipe-specific alternate. The U.S. recipe amount and method are not a general measure or active substitution rule. |
| `WP03-L-PADRON-20261015-R141-S06` | Government of Canada, [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/), targeted search for `Padrón`, `Padron pepper`, and `piment de Padrón`; reviewed 2026-10-15. | No relevant Padrón food-term record surfaced in this bounded search. The OQLF generic `piment` entry and the Québec product wording above remain the actual terminology evidence; absence from search is not evidence that no terminology record exists. |

## Exact proposed JSON delta

These are additive objects only. French accents in database JSON are escaped as required by `AGENTS.md`. No `measurementObservations` object is proposed: the reviewed values are a package size, a seed count, a crop length, and one recipe's portion amount.

### Addition to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-padron-pepper",
  "nameFr": "piment de Padr\u00f3n",
  "nameEn": "Padr\u00f3n pepper",
  "aliasesFr": [],
  "aliasesEn": ["Padron peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-padron-pepper-fresh",
  "ingredientRefId": "ingredient-ref-padron-pepper",
  "formCode": "fresh",
  "labelFr": "piment de Padr\u00f3n frais",
  "labelEn": "fresh Padr\u00f3n pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "La fiche canadienne classe le produit parmi les fruits et l\u00e9gumes frais; le fournisseur qu\u00e9b\u00e9cois d\u00e9crit le fruit r\u00e9colt\u00e9 et son usage culinaire. Aucune mesure g\u00e9n\u00e9rique n'est \u00e9tablie.",
  "notesEn": "The Canadian listing classifies the product under fresh produce; the Quebec grower describes harvested fruit and culinary use. No generic measure is established.",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

### Addition to `research-ledger.v1.json` `records`

```json
{
  "recordId": "ingredient-ref-padron-pepper",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP03-L-PADRON-20261015-R141-S01",
      "url": "https://www.instacart.ca/products/431235-del-cabo-organic-spanish-padron-peppers-4-oz",
      "title": "Instacart Canada, del Cabo Organic Spanish Padron Peppers (4 oz)",
      "versionOrDate": "Current indexed Canadian marketplace listing, opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product title, fresh-produce category path, displayed 4 oz, and page location/store context.",
      "supports": "Supports the current Canadian English market wording and fresh-produce listing for Padron peppers. The 4 oz is a package amount; the page does not show a per-pepper weight or establish source farm/origin.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-PADRON-20261015-R141-S02",
      "url": "https://ecoumene.com/products/piment-de-padron-bio",
      "title": "Jardins de l'\u00c9coum\u00e8ne, Piment de Padr\u00f3n - Bio",
      "versionOrDate": "Current Qu\u00e9bec seed listing, opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "French product title, 20-seed package, crop description, harvested-fruit culinary uses, and 5-7 cm young-fruit wording.",
      "supports": "Supports the Qu\u00e9bec French crop wording Piment de Padr\u00f3n. The item sold is seed, and the 20-seed count and 5-7 cm crop description are not fresh-food retail quantity or reusable kitchen measures.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-PADRON-20261015-R141-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment",
      "title": "OQLF, piment — Grand dictionnaire terminologique",
      "versionOrDate": "Entry last updated 1988; opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Definition, privileged term piment, English translation pepper, and scope note.",
      "supports": "Supports piment as the broad French plant/food term only. It does not establish an OQLF preferred term for Padr\u00f3n.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-PADRON-20261015-R141-S04",
      "url": "https://www.opentable.com/r/ibericos-taverne-a-tapas-espagnoles-reservations-montreal",
      "title": "OpenTable, Ib\u00e9ricos Taverne \u00e0 Tapas Espagnoles, Montr\u00e9al",
      "versionOrDate": "Current menu page; menu last updated 2025-12-10; opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Menu item Pimientos de Padr\u00f3n and its English description as Galician green peppers, grilled and salted.",
      "supports": "Supports local culinary use of the named peppers in a single Montr\u00e9al tapa. The Spanish dish name is not adopted as a French alias and the menu gives no ingredient quantity.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-L-PADRON-20261015-R141-S05",
      "url": "https://www.zwilling.com/us/magazine/inspiring-recipes/the-staub-cookbook/recipe-culinary-world-usa-the-staub-cookbook-padron-peppers.html",
      "title": "ZWILLING / Staub, Blistered Padr\u00f3n Peppers with Smoked Sea Salt",
      "versionOrDate": "Current recipe page, opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Recipe yield 2-4; 12 oz ingredient line says Padr\u00f3n or Shishito peppers; text also suggests Shishito when Padr\u00f3n cannot be found.",
      "supports": "Supports a Shishito alternative in this blistered-pepper appetizer recipe only. Its amount and method are not a generic Padr\u00f3n measure or universal substitution instruction.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-L-PADRON-20261015-R141-S06",
      "url": "https://www.btb.termiumplus.gc.ca/",
      "title": "Government of Canada, TERMIUM Plus targeted search",
      "versionOrDate": "Search for Padr\u00f3n, Padron pepper, and piment de Padr\u00f3n; reviewed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Targeted terminology searches; no relevant Padr\u00f3n food-term record surfaced.",
      "supports": "No specific TERMIUM Plus preferred-term record was located in this bounded search. Non-discovery is not proof that no record exists.",
      "sourceKind": "regional_authority"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "wp03-l-padron-r141-zwilling-blistered-appetizer-option",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-padron-pepper",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-shishito-pepper"
        }
      ],
      "context": "ZWILLING / Staub recipe Blistered Padr\u00f3n Peppers with Smoked Sea Salt, a 2-4-serving appetizer or side.",
      "basis": "The recipe says to use Shishito if Padr\u00f3n is unavailable and lists 12 oz Padr\u00f3n or Shishito peppers on one ingredient line.",
      "limitations": [
        "This is a source-scoped either/or option for the named blistered-pepper recipe only.",
        "Do not add an alias or global/contextual substitution rule for other dish roles or methods.",
        "The recipe's 12 oz ingredient amount is not a per-pepper weight, generic serving, or reusable cross-ingredient conversion."
      ],
      "sourceIds": [
        "WP03-L-PADRON-20261015-R141-S05"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add a distinct fresh-market Padr\u00f3n pepper / piment de Padr\u00f3n reference. Use the Canadian listing spelling Padron peppers as the sole English alias; keep French aliases empty and do not infer species, cultivar, or origin.",
      "sourceIds": [
        "WP03-L-PADRON-20261015-R141-S01",
        "WP03-L-PADRON-20261015-R141-S02",
        "WP03-L-PADRON-20261015-R141-S04"
      ]
    },
    {
      "outcome": "accepted",
      "reason": "Add one fresh form supported by the Canadian fresh-produce category and the Qu\u00e9bec grower's harvested-fruit description; do not add cooking-method forms.",
      "sourceIds": [
        "WP03-L-PADRON-20261015-R141-S01",
        "WP03-L-PADRON-20261015-R141-S02"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Do not add a reusable measure, density, unit mapping, count weight, or conversion from package, seed, crop-length, or recipe quantities.",
      "sourceIds": [
        "WP03-L-PADRON-20261015-R141-S01",
        "WP03-L-PADRON-20261015-R141-S02",
        "WP03-L-PADRON-20261015-R141-S04",
        "WP03-L-PADRON-20261015-R141-S05"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Retain the Shishito alternative as a recipe-scoped finding only; add no active substitution rule, alias, or general ratio.",
      "sourceIds": [
        "WP03-L-PADRON-20261015-R141-S05"
      ]
    }
  ]
}
```

## Reconsideration conditions

- Revisit the French label/alias only if an OQLF or TERMIUM subtype entry, or a Québec fresh-food retailer's own bilingual label, gives a clearer Padrón-specific French term. Keep any plural alias qualified so bare `piments` does not become a one-result query.
- Revisit geographic or product boundaries only if a standards authority or primary producer source defines the specific market name by a protected area, place of production, or formal product category. Do not retroactively infer growing origin from `Spanish` in a retailer title.
- Revisit count/weight data only with a source that measures a stated number of individual fresh Padrón peppers under a defined method. Do not derive it from the 4 oz pack, seed quantity, crop length, or 12 oz recipe line.
- Revisit substitutions only with a tested or editorial recipe source specifying the dish role and method. The current Shishito finding remains limited to the named blistered appetizer.

This is a proposal-only documentation review. No app, Gradle, unit, instrumentation, emulator, deployment, or other tests were run; the project instructions exempt database-JSON-only additions from testing, and this work did not change shared database data.
