# WP03 Section L R138 — Anaheim pepper identity review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, ledger, plan, roadmap, generated index, or batch file was changed.
- **Disposition:** add the named fresh-market identity **Anaheim pepper / piment Anaheim**, with one explicit `fresh` form. Add only the English alias `Anaheim peppers` and the Québec French phrase alias `piment d’Anaheim`. Keep bare `piments`, `piment fort`, `pepper(s)`, `poivron`, and `chile` out of aliases.
- **Open boundaries:** do not merge Anaheim with Hatch-type or New Mexico chiles, dried `chile seco del norte`, or the existing Cubanelle identity. An older Metro recipe writes “Anaheim or Cuban peppers” for one dish; `Cuban pepper` is not identified as Cubanelle there, so this remains dish-scoped evidence and no catalog substitution is proposed.
- **Quantities and recipe demand:** the Canadian Food Inspection Agency (CFIA) lists 11 Anaheim samples in a three-year fresh-whole retail study; those are study sample counts, not item weights. A retailer listing shows 113 g alongside per-item pricing, without a method that would make it a reusable weight. No Anaheim phrase appears in the bundled recipes. Add no measurement observation, count mapping, density, conversion, yield, recipe link, or active substitution.

## Checklist, ownership, and audit

The active [Section L pepper checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4472) still includes Anaheim among the unfinished fresh-chile identities. R136 integrated fresh Poblano and R137 integrated Habanero; neither resolves Anaheim. The plan keeps Anaheim and Hatch-type as separate list items. This proposal advances only Anaheim’s fresh-market name and does not close the broader Section L pepper work. See the [Poblano review](wp03-section-l-poblano-pepper-identity-review-r136-20261015.md) and [Habanero review](wp03-section-l-habanero-pepper-identity-review-r137-20261015.md) for those separate decisions.

Read-only snapshot on 2026-10-15:

- The live package contains **1,492 ingredient references and 112 forms**. Neither has an Anaheim owner or Anaheim-named form.
- The legacy import file has **61 candidates** and no Anaheim candidate.
- The research ledger has **1,837 records** and no Anaheim identity record or Anaheim-specific research record. Prior broad chile reviews do not assign this identity.
- The live package manifest lists **114 recipes**. Scanning every manifest-listed recipe string and all **1,123 ingredient rows** for `Anaheim`, `Anaheims`, `piment Anaheim`, `piment d'Anaheim`, `Hatch`, `New Mexico chile/pepper`, `Fresno`, bird’s-eye, Shishito, Padrón, Hungarian wax, and banana pepper produced **zero hits**.
- The proposed reference ID `ingredient-ref-anaheim-pepper`, form ID `ingredient-form-anaheim-pepper-fresh`, ledger record ID, and R138 source-ID prefix are unused.

Existing `Cubanelle pepper / piment doux Cubanelle`, Poblano, Habanero, Scotch Bonnet, jalapeño, serrano, and the source-qualified Andean chile identities remain separate. The source review does not add a broad pepper or chile alias, and does not use `Cuban pepper` as a Cubanelle synonym.

Picker edge: the existing Cubanelle reference already matches the query `Cuban pepper` through its current `sweet Cuban pepper` alias. That existing search result does not establish that Metro’s shorter recipe wording denotes Cubanelle, so no source-specific recipe link or substitution is attached to the Cubanelle row.

## Names, aliases, and picker projection

Use **`Anaheim pepper` / `piment Anaheim`** as canonical names. The CFIA report’s French fresh-retail table labels the product `Piment Anaheim`. A Québec farm page is titled `Piment Anaheim` and also uses the qualified phrase `piment d’Anaheim`. A current Canadian produce listing uses the English plural `Anaheim Peppers`. No OQLF GDT or TERMIUM record for Anaheim surfaced in this pass; the French wording is therefore supported by Canadian and Québec use, not presented as an OQLF-preferred term.

Propose only these aliases:

- English: `Anaheim peppers`, matching current Canadian retail wording and the Metro recipe wording.
- French: `piment d’Anaheim`, a crop-qualified phrase used by the Québec farm source.

Do not add French `piments Anaheim`: the current picker’s full-phrase-first behavior would make a bare `piments` query return this single identity, while the live catalog currently returns no result for `piments`. The singular canonical `piment Anaheim` and qualified `piment d’Anaheim` remain searchable. Do not add `Anaheims`, `piment Anaheim séché`, `chile seco del norte`, `piment Magdalena`, `piment de Californie`, or `piment du Nouveau-Mexique`; reviewed alternate names are source-specific or refer to different forms and need a separate boundary review. Do not add `Hatch`, `Hatch chile`, `New Mexico chile`, `Cuban pepper`, `Cubanelle`, `poivron`, generic `piment(s)`, `pepper(s)`, `chile`, or `chili` as aliases.

The static projection mirrors [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): case and accent folding, complete word-phrase matching before substring fallback, and a form hint only when the entire query is a form term. Results with the proposed reference and fresh form are:

| Query | Current | Proposed | Effect |
|---|---:|---:|---|
| `Anaheim pepper`, `piment Anaheim`, `Anaheim` | 0 | 1 | One named Anaheim result; the canonical terms already match the short `Anaheim` query through substring fallback. |
| `Anaheim peppers` | 0 | 1 | One result through the qualified English plural alias. |
| `piment d’Anaheim` | 0 | 1 | One result through the Québec phrase alias. |
| `fresh Anaheim pepper`, `piment Anaheim frais` | 0 | 1 | Anaheim with the fresh-form hint. |
| `piments Anaheim`, `piments` | 0 / 0 | 0 / 0 | No plural French alias is added, avoiding a singleton result for bare `piments`. |
| `pepper`, `peppers`, `piment` | 23 / 3 / 18 | 24 / 4 / 19 | Each remains a multi-result search; the increase comes from the named identity’s canonical phrase. |
| `poivron`, `chile`, `chili` | 1 / 1 / 8 | 1 / 1 / 8 | No generic bell-pepper or chile search changes. |
| `Hatch`, `piment du Nouveau-Mexique`, `Cuban pepper`, `Cubanelle` | 0 / 0 / 1 / 1 | 0 / 0 / 1 / 1 | The `Cuban pepper` result is the existing Cubanelle row through its `sweet Cuban pepper` alias; this proposal does not map the Metro recipe to it. |

This is a static projection of the current search code and data, not an app test or a claim that a modified package was run.

## Fresh form, measurement, and substitution boundaries

Add one `fresh` form, because the CFIA source explicitly studies fresh whole retail Anaheim peppers and the Québec grower discusses the fresh fruit. Keep green/red color or maturity, grilling, and roasting out of separate forms; the reviewed evidence describes them as color/maturity or cooking state. Do not add a dried Anaheim form from one Québec farm’s phrase `chile seco del norte`; that product name and its relationship to other New Mexico dried chiles need a separate identity/form review.

No reusable measurement is supported:

- CFIA sampled retail lots in Québec City, Montréal, and other Canadian cities from 2022-04-01 to 2025-03-31. Its table includes **11 Anaheim samples**, and its protocol says each sample had at least 250 g. The table count is product-category sample count and the 250 g minimum is a study protocol, not one pepper’s mass.
- Save-On Foods’ current `Anaheim Peppers - Green Hot` listing shows 113 g and per-item pricing. The page does not say that this is an average, a weighed sample, or a reusable per-pepper amount. Direct page opening returned a cache miss; the indexed current listing is used for its product name only.
- The Québec farm source gives dimensions for its specifically cultivated Charger variety. Those dimensions are not a mass or a generic count weight for the market identity.
- Courges & Cie also suggests using Anaheim when a recipe calls for bell pepper and the cook wants more heat. This is qualitative, preference-based advice without a dish role, method, amount, or ratio; retain it as source-specific evidence and add no global or contextual substitution rule.
- Metro’s recipe lists “3 Anaheim or Cuban peppers” in a four-serving Moroccan roasted pepper salad. This is one dish-specific count and an explicit source wording choice, not a count-to-mass measure.

The Metro recipe is outside the bundled manifest, was published in 2014, and its direct page could not be opened in this pass (cache miss); the current search index retained the ingredient list. It does not identify whether its `Cuban pepper` is the same product as the live Cubanelle reference. The current picker does return Cubanelle for that shorter query through an existing `sweet Cuban pepper` alias, but that search behavior does not establish the recipe’s intended ingredient. Record this as a bounded recipe-source finding only. Do not add `Cuban pepper` or `Cubanelle` as an Anaheim alias, do not create an active substitution rule, and do not infer a general interchangeability or ratio. No matching bundled recipe line or substitution was found.

## Source register

Sources were rechecked on 2026-10-15. Retail stock and prices are not used as identity evidence. Search-indexed product detail and direct-access limitations are recorded below.

| Source ID | Source and access | Evidence used and limits |
|---|---|---|
| `WP03-L-ANAHEIM-20261015-R138-S01` | CFIA, [Pathogenic bacteria and indicator organisms in fresh whole hot peppers, final report](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf); official French PDF opened directly. Sampling period 2022-04-01–2025-03-31. | The study sampled retail chains and local/regional grocery stores, including Québec City and Montréal. Table 5 labels a product class `Piment Anaheim` and lists 11 samples. The whole-fresh-retail context supports the proposed name/form. The sample count and minimum sample size are not food measures. The study does not define a cultivar or all uses of the name. |
| `WP03-L-ANAHEIM-20261015-R138-S02` | Courges & Cie, [Piment Anaheim](https://courgescie.com/culture/piment-anaheim/); Québec farm page opened directly. | Uses the titles `Piment Anaheim` and the phrase `piment d’Anaheim`; discusses fresh use and a Charger variety cultivated at the farm. It suggests Anaheim instead of bell pepper when a cook wants more heat, but gives no dish role, method, amount, or ratio for a transferable substitution. Other names, dried terms, cultivar dimensions, and heat scale are not generalized. |
| `WP03-L-ANAHEIM-20261015-R138-S03` | Save-On Foods, [Anaheim Peppers - Green Hot, product 4677](https://www.saveonfoods.com/sm/pickup/rsid/902/product/anaheim-peppers-green-hot-id-4677); current search-indexed Canadian produce page, crawled 2026-10-15; direct opening returned a cache miss. | The title gives the English plural `Anaheim Peppers - Green Hot` in the fresh-vegetable/peppers aisle. The displayed 113 g is not stated to be an average or one pepper’s general weight. The source supports product wording only. |
| `WP03-L-ANAHEIM-20261015-R138-S04` | Metro, [Moroccan Roasted Pepper Salad](https://www.metro.ca/en/recipes-occasions/recipes/moroccan-roasted-pepper-salad); page published 2014-04-18, indexed within two months of review; direct opening returned a cache miss. | Its four-serving recipe lists `3 Anaheim or Cuban peppers`. This is evidence of one source-specific recipe choice and count, outside the bundled corpus. The page does not establish what `Cuban pepper` means; do not map it to Cubanelle or generalize a substitution. |

## Exact proposed JSON delta

These are additive objects only. The ledger contains no measurement observation. Its Anaheim substitution research remains blocked for reusable rules because the Québec farm’s bell-pepper advice is not scoped to a dish role or method and the external dish does not establish whether its `Cuban pepper` option is the same product as the Cubanelle result already returned by the picker. No recipe, form conversion, density, unit mapping, yield, or active substitution rule is added. Bundled database JSON must encode the French Unicode characters as escapes, per AGENTS.md.

### Addition to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-anaheim-pepper",
  "nameFr": "piment Anaheim",
  "nameEn": "Anaheim pepper",
  "aliasesFr": ["piment d\u2019Anaheim"],
  "aliasesEn": ["Anaheim peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-anaheim-pepper-fresh",
  "ingredientRefId": "ingredient-ref-anaheim-pepper",
  "formCode": "fresh",
  "labelFr": "piment Anaheim frais",
  "labelEn": "fresh Anaheim pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "L\u2019ACIA et un producteur qu\u00e9b\u00e9cois documentent le piment Anaheim vendu ou consomm\u00e9 frais. Aucune mesure g\u00e9n\u00e9rique n\u2019est ajout\u00e9e.",
  "notesEn": "The CFIA study and a Qu\u00e9bec grower document whole fresh Anaheim peppers. No generic measure is added.",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

### Addition to `research-ledger.v1.json` `records`

```json
{
  "recordId": "ingredient-ref-anaheim-pepper",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP03-L-ANAHEIM-20261015-R138-S01",
      "url": "https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf",
      "title": "Agence canadienne d\u2019inspection des aliments, Bact\u00e9ries pathog\u00e8nes et organismes indicateurs dans des piments forts entiers \u00e0 l\u2019\u00e9tat frais",
      "versionOrDate": "Final report (cover: December 2025; copyright 2026); sampling 2022-04-01 to 2025-03-31",
      "accessedOn": "2026-10-15",
      "locator": "Sampling design and Table 5 product-type row Piment Anaheim.",
      "supports": "Supports the French market wording Piment Anaheim in the fresh whole retail category; 11 is the number of study samples, not a culinary measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-ANAHEIM-20261015-R138-S02",
      "url": "https://courgescie.com/culture/piment-anaheim/",
      "title": "Courges & Cie, Piment Anaheim",
      "versionOrDate": "Qu\u00e9bec farm page, directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Page title, use of piment d\u2019Anaheim, fresh use, and farm-grown Charger variety.",
      "supports": "Supports local French use of piment Anaheim / piment d\u2019Anaheim and fresh culinary use. The page also suggests Anaheim instead of bell pepper when a cook wants more heat, but supplies no dish role, method, amount, or ratio for a transferable substitution. Other names, dried-product terms, variety dimensions, and heat values remain source-specific.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-ANAHEIM-20261015-R138-S03",
      "url": "https://www.saveonfoods.com/sm/pickup/rsid/902/product/anaheim-peppers-green-hot-id-4677",
      "title": "Save-On Foods, Anaheim Peppers - Green Hot, product 4677",
      "versionOrDate": "Current search-indexed produce listing; direct opening returned a cache miss",
      "accessedOn": "2026-10-15",
      "locator": "English product title and fresh-vegetable aisle listing.",
      "supports": "Supports current Canadian English retail wording Anaheim Peppers. The displayed 113 g does not establish a generic or average per-pepper weight.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-ANAHEIM-20261015-R138-S04",
      "url": "https://www.metro.ca/en/recipes-occasions/recipes/moroccan-roasted-pepper-salad",
      "title": "Metro, Moroccan Roasted Pepper Salad",
      "versionOrDate": "Published 2014-04-18; current index reviewed 2026-10-15; direct opening returned a cache miss",
      "accessedOn": "2026-10-15",
      "locator": "Four-serving ingredient list: 3 Anaheim or Cuban peppers.",
      "supports": "Supports an explicit count and source-specific Anaheim-or-Cuban choice in this named dish. The page does not identify whether Cuban pepper is the product currently returned as Cubanelle by the picker or establish a reusable substitution.",
      "sourceKind": "culinary_reference"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "wp03-l-anaheim-r138-bell-pepper-flavor-advice",
      "fromIngredientRefId": "ingredient-ref-anaheim-pepper",
      "researchState": "blocked_pending_evidence",
      "context": "Courges & Cie suggests using Anaheim instead of bell pepper when a cook wants more heat in a recipe.",
      "basis": "This is a qualitative preference suggestion; the source does not define a dish role, method, amount, ratio, or expected result beyond more heat.",
      "limitations": [
        "Do not encode a global poivron-to-Anaheim substitution from this unquantified advice.",
        "No contextual rule is supported without a specified dish, role, method, and safe amount guidance."
      ],
      "sourceIds": ["WP03-L-ANAHEIM-20261015-R138-S02"]
    },
    {
      "findingId": "wp03-l-anaheim-r138-moroccan-salad-cuban-pepper-choice",
      "fromIngredientRefId": "ingredient-ref-anaheim-pepper",
      "researchState": "blocked_pending_evidence",
      "context": "Metro\u2019s 2014 Moroccan Roasted Pepper Salad, for four servings, lists 3 Anaheim or Cuban peppers.",
      "basis": "The recipe source gives a disjunctive ingredient choice for this one salad, but does not identify whether its Cuban pepper is the same product as the live Cubanelle reference.",
      "limitations": [
        "Do not attach this recipe choice to Cubanelle or treat the existing sweet Cuban pepper alias match as evidence of the recipe\u2019s intended product.",
        "Do not generalize this recipe wording to other dishes or encode a global or contextual substitution rule.",
        "The recipe is not part of the bundled recipe corpus and no bundled Anaheim demand was found."
      ],
      "sourceIds": ["WP03-L-ANAHEIM-20261015-R138-S04"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add the fresh-market Anaheim pepper / piment Anaheim identity and explicit fresh form. Keep only the qualified English plural and Qu\u00e9bec French phrase aliases. Add no reusable measure, form conversion, yield, recipe link, or active substitution.",
      "sourceIds": [
        "WP03-L-ANAHEIM-20261015-R138-S01",
        "WP03-L-ANAHEIM-20261015-R138-S02",
        "WP03-L-ANAHEIM-20261015-R138-S03"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Keep the Courges & Cie bell-pepper replacement suggestion as qualitative source evidence only. It does not scope the replacement to a dish role or method and supplies no amount or ratio for a contextual rule.",
      "sourceIds": ["WP03-L-ANAHEIM-20261015-R138-S02"]
    },
    {
      "outcome": "unresolved",
      "reason": "Retain the Metro recipe\u2019s Anaheim-or-Cuban phrase only as a dish-scoped source finding. The second ingredient is not resolved to Cubanelle, so no active substitution or alias is supported.",
      "sourceIds": ["WP03-L-ANAHEIM-20261015-R138-S04"]
    }
  ]
}
```

No tests were run. If integrated, this change adds database JSON data only, for which AGENTS.md says testing is not required.
