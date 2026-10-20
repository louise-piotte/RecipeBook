# WP03 Section L R142 — Hungarian wax pepper fresh-market review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, ledger, plan, roadmap, generated index, or batch file was changed.
- **Disposition:** add the fresh-market identity **Hungarian wax pepper / piment fort hongrois** and one `fresh` form. Use the exact English plural market names `Hungarian wax peppers` and `Hungarian wax chili peppers`; keep French aliases empty.
- **Scope:** keep this as the named hot Hungarian Wax pepper. Do not infer a specific botanical species/cultivar, growing origin, colour stage, or fixed heat. Keep Sweet Hungarian and generic banana peppers separate. Do not add a dried, pickled, cooked, or ground form.
- **Numeric and substitution boundary:** add no reusable measure, density, mapping, yield, or conversion. A Milk Street paprikash recipe published by AP gives banana peppers or wax peppers as one dish's either/or ingredient; retain that only as a recipe-scoped note. Do not create an alias or active substitution rule, since banana pepper has no separate active catalog reference and the recipe does not establish general interchangeability.

## Checklist, ownership, archive, and recipe audit

The active [WP03 Section L fresh-chile checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4488) lists Hungarian wax after Padrón and before banana pepper. R140 integrated Shishito and R141 integrated Padrón; this review advances Hungarian wax only. Earlier reviews mention Hungarian wax as one of several zero-hit search terms, but no prior focused Hungarian wax proposal or hold was found.

Read-only snapshot on 2026-10-15:

- The bundled catalog contains **1,498 references and 115 forms**. No reference, alias, or form owns `Hungarian wax`, `Hungarian wax pepper`, `Hungarian banana pepper`, `piment fort hongrois`, `piment hongrois`, `piment banane`, or `jaune hongrois`. The proposed IDs `ingredient-ref-hungarian-wax-pepper` and `ingredient-form-hungarian-wax-pepper-fresh` are unused.
- Nearby pepper identities already include jalapeño, serrano, Poblano, Habanero, Anaheim, Shishito, and Padrón. None owns a Hungarian Wax phrase. The active banana fruit reference does not identify banana pepper, and no distinct banana-pepper reference is active.
- `docs/catalog/legacy-import-identities.v1.json` has **61 candidates** and no Hungarian Wax or banana-pepper candidate.
- The research ledger has **1,843 records** and no focused Hungarian Wax or banana-pepper record. R138 mentions Hungarian wax only in its broad pepper query sweep; R141's Padrón finding is unrelated.
- The manifest lists **114 recipes and 1,123 ingredient rows**. A full scan of every manifest-listed recipe JSON file and every ingredient row found **zero full-file hits and zero ingredient-row hits** for Hungarian/Hungarian Wax/Hot Wax, Hungarian banana pepper, banana pepper(s), piment fort hongrois, piment hongrois, piment banane, poivron banane, and jaune hongrois. There is no bundled recipe demand to link.

## Identity, Canadian product evidence, and Québec French

Use the bilingual display **`Hungarian wax pepper` / `piment fort hongrois`**. The fresh-market evidence is clear enough for a bounded identity:

- The 2026 CFIA report concerns **whole fresh hot peppers sold at retail in Canada**, with samples collected in Montréal and Québec City as well as other Canadian cities. Its French Table 5 includes `Piment hongrois` as a retail product-type label, with five samples. That label does **not** identify a botanical species or cultivar; the cross-source link to Hungarian Wax comes from Ontario's classification of Hungarian Wax among hot types plus the Canadian supplier's exact Hungarian Wax produce listing. The sample count is surveillance evidence, not a recipe amount or weight for one pepper.
- Ontario's government pepper pages list **Hungarian Wax** among hot elongated pepper types grown in Ontario and distinguish it from yellow sweet types such as **Sweet Hungarian**. This supports keeping the hot Wax item separate from sweet banana/Hungarian peppers. The French Ontario page leaves the cultivar name `Hungarian Wax` untranslated.
- Produce Market Guide's commodity page uses the exact English product name **Hungarian Wax Chili Peppers**. The associated Exeter Produce & Storage company page, located in Ontario, lists **Hungarian Wax Chili Peppers** among its produce and describes Canadian, U.S., and offshore service. The supplier directory says company profile details are self-reported; this is Canadian supply-chain evidence, not a grocery shelf SKU.
- Québec grower La Brouette Maraîchère uses the product title **Piment Fort Hongrois** and identifies the variety as `Hungarian Hot Wax`. The page is for a four-inch plant pot, not fresh-food retail; it showed sold out and stated the shop would reopen in January 2027. Use its French wording as local crop/product terminology, not an OQLF or TERMIUM preferred-term claim.

The TERMIUM Plus search result exposes two older records with overlapping wording: one lists `Hungarian wax` and `Hungarian banana pepper` with French `jaune hongrois`, while another lists sweet/yellow banana and Sweet Hungarian peppers with French `piment banane` and `Hongrois jaune`. It also notes that “banana” may describe long, slender, cream/yellow forms. Because those terms cross hot and sweet naming, do not add `Hungarian banana pepper`, `banana pepper`, `banana wax pepper`, `piment banane`, `poivron banane`, `jaune hongrois`, or `Hongrois jaune` as aliases. Also leave the bare CFIA wording `piment hongrois` out of aliases: while its table context is hot fresh peppers, the phrase itself lacks `fort`/`wax` and could become a false singleton for a future Sweet Hungarian/banana-pepper row. The canonical display follows the Ontario hot-type classification, the Canadian Hungarian Wax supplier wording, and the local Québec `piment fort hongrois` product wording; it does not claim official terminology status.

## Alias boundary and picker projection

The English plural aliases preserve both the exact produce-directory title `Hungarian Wax Chili Peppers` and the industry page's plural `Hungarian Wax Peppers`. Produce Market Guide notes visual similarity to banana peppers; this is not a synonym claim. French aliases stay empty: the fuller canonical `piment fort hongrois` is supported by Québec crop wording, while bare `piment hongrois` is withheld to avoid routing a possible sweet Hungarian query to this hot type. If a sweet Hungarian/banana-pepper identity is later added, that bare phrase should be reviewed for multi-result behavior rather than assigned only to the hot pepper. No generic `pepper(s)`, `chili`, `piment(s)`, `poivron(s)`, or `piment fort` aliases are added.

The picker uses [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents and punctuation, checks exact form phrases first, then word phrases across names/aliases/forms, then partial substrings. The static projection uses the live refs/forms plus the proposed reference and form.

| Query | Current results | Proposed results | Effect |
|---|---:|---:|---|
| `Hungarian wax`, `Hungarian wax pepper`, `Hungarian wax peppers`, `Hungarian wax chili peppers` | 0 | 1 each | Source-qualified English names resolve to the new identity. |
| `piment fort hongrois` | 0 | 1 | The fully qualified local Québec French wording resolves to the new identity. |
| `piment hongrois` | 0 | 0 | Withhold the CFIA's bare retail product-type wording to avoid a future sweet Hungarian/banana-pepper false singleton. |
| `fresh Hungarian wax pepper`, `piment fort hongrois frais` | 0 | 1 each | Exact fresh names resolve to the new identity and form. |
| `pepper`, `peppers`, `piment` | 26 / 6 / 21 | 27 / 7 / 22 | Each remains a multi-result search; no broad alias is added. |
| `piments`, `piments forts`, `hot peppers` | 0 / 0 / 0 | 0 / 0 / 0 | No plural or broad hot-pepper alias creates an unintended singleton. |
| `banana pepper`, `banana peppers`, `piment banane`, `poivron banane`, `jaune hongrois` | 0 | 0 | Keep the sweet/banana naming boundary unresolved and separate. |
| `Hungarian Hot Wax`, `Hungarian hot pepper`, `piment hongrois frais` | 0 | 0 | Do not promote nursery variety/English descriptors or constructed form phrases to aliases. |

This is a static projection against the current **1,498-reference / 115-form** package and current search implementation; no catalog files or app tests were changed or run.

## Form, numeric evidence, recipes, and substitution boundary

Add one explicit `fresh` form. CFIA's Canadian surveillance study defines the scope as whole fresh hot peppers sold at retail, and the Ontario supplier page lists the named fresh produce item. Do not infer `whole` as a separate preparation form, or add fried, grilled, roasted, pickled, dried, or ground forms from culinary suggestions alone.

No reusable amount is supported:

- The CFIA table reports **five samples** for `Piment hongrois`; the study's sampling protocol uses at least **250 g per sample** made up of one or more retail units. Neither number is a pepper count or per-pepper weight.
- Produce Market Guide describes the peppers as about **4–6 inches** long and reports a **5,000–15,000 SHU** range. These are industry-description claims, not a mass, density, count mapping, or fixed heat level for every labeled pepper. La Brouette's similar heat range refers to its named plant variety and is kept source-specific.
- La Brouette's four-inch number is the **plant pot size**, and its 60 cm height / 25 cm width describe the plant, not its harvested fruit. It gives no per-pepper mass.
- AP's Milk Street paprikash ingredient line lists **two banana peppers or wax peppers** for that recipe, which serves 4–6. This is a recipe-specific either/or and quantity, not a reusable per-serving count or a general banana-to-wax conversion.

The AP/Milk Street article is the only reviewed external recipe-level alternative. It can be recorded as a blocked, dish-scoped finding because the banana-pepper side has no separate active catalog reference. It does not support aliasing the pepper names or a global/contextual substitution rule for other dishes. No separate recipe link, yield, conversion, density, or measurement observation is proposed. The bundled corpus itself has no matching demand.

## Source register

Sources were checked on 2026-10-15. Access limitations and source scope are included so that search-indexed or supplier-specific wording is not mistaken for a product standard.

| Source ID | Source and access | Evidence used and limits |
|---|---|---|
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S01` | CFIA, [Bactéries pathogènes et organismes indicateurs dans des piments forts entiers à l’état frais](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), directly opened. | Final 2026 report; sampling ran 2022-04-01 to 2025-03-31 and included Montréal and Québec City. Table 5 uses `Piment hongrois` as a retail product-type label and reports five samples; it does not identify a cultivar. The five samples and pooled minimum sample mass are not individual-pepper measures. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S02` | Foodland Ontario, [Peppers](https://www.ontario.ca/foodland/food/peppers), current government page found in search; direct open returned 403. | Search-indexed page lists Hungarian Wax among hot elongated types grown in Ontario and distinguishes yellow Sweet Hungarian. Supports the hot/sweet boundary and crop name; page retrieval was blocked on direct open. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S03` | Ontario Terre nourricière, [Poivrons des champs](https://jobs.ontario.ca/fr/terre-nourriciere/aliments/poivrons-des-champs), current French page found in search; direct open returned a cache miss. | Search-indexed French page retains `Hungarian Wax` for the hot type and names `Sweet Hungarian` separately among sweet elongated types. Supports the same boundary, not a translated French preferred term. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S04` | Produce Market Guide, [Hungarian Wax Chili Peppers](https://www.producemarketguide.com/produce/peppers-chili/hungarian-wax-chili-peppers), directly opened. | Supports the exact plural English commodity label and commercial produce context. Its listed size and SHU range are descriptive industry claims, not reusable mass or fixed properties. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S05` | Produce Market Guide, [Exeter Produce & Storage Co Ltd](https://www.producemarketguide.com/company/112832/exeter-produce-storage-co-ltd), directly opened. | The Ontario company page lists `Hungarian Wax Chili Peppers`, names the business as a grower/shipper/importer/wholesaler, and says it services Canadian, U.S., and offshore markets. The profile notes that company data are self-reported and last updated June 19, 2026; it is not a grocery retail SKU. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S06` | La Brouette Maraîchère, [Piment Fort Hongrois](https://www.labrouettemaraichere.com/products/piment-fort-hungarian), directly opened. | Supports local Québec French crop wording and identifies `Hungarian Hot Wax` as the variety. The item is a potted plant (four-inch pot), showed sold out, and the online shop said it would reopen in January 2027; it is not fresh-food retail or an OQLF term record. Its plant dimensions and SHU range are source-specific. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S07` | Government of Canada, TERMIUM Plus, [search for YELLOW BANANA](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=YELLOW+BANANA), result reviewed; dynamic page direct open returned a cache miss. | The indexed records show the overlap between Hungarian wax / Hungarian banana pepper / `jaune hongrois` and a separate sweet banana / Sweet Hungarian record using `piment banane` / `Hongrois jaune`. Used to exclude these ambiguous aliases; not used as the preferred-name basis. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S08` | AP News republishing Milk Street, [Use two types of paprika for the best Hungarian chicken paprikash](https://apnews.com/article/hungarian-chicken-paprikash-recipe-milk-street-898250ed32ad7dbe341b13eaf15e406f), directly opened. | The 4–6-serving paprikash recipe lists “2 banana peppers or wax peppers.” Supports only this dish-scoped either/or; it does not establish a synonym, general substitute, or reusable count conversion. |

## Exact proposed JSON delta

These are additive objects only. JSON strings retain explicit Unicode escapes in line with `AGENTS.md`. Do not add density, unit mappings, measurement observations, recipe links, yields, active substitutions, or a banana-pepper alias.

### Addition to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-hungarian-wax-pepper",
  "nameFr": "piment fort hongrois",
  "nameEn": "Hungarian wax pepper",
  "aliasesFr": [],
  "aliasesEn": ["Hungarian wax peppers", "Hungarian wax chili peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-hungarian-wax-pepper-fresh",
  "ingredientRefId": "ingredient-ref-hungarian-wax-pepper",
  "formCode": "fresh",
  "labelFr": "piment fort hongrois frais",
  "labelEn": "fresh Hungarian wax pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Le rapport de l'ACIA classe le piment hongrois parmi les piments forts entiers frais vendus au Canada; un fournisseur ontarien affiche Hungarian Wax Chili Peppers. Aucune masse par piment n'est établie.",
  "notesEn": "The CFIA report classifies Hungarian pepper among whole fresh hot peppers sold in Canada; an Ontario supplier lists Hungarian Wax Chili Peppers. No per-pepper mass is established.",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

### Proposed addition to `research-ledger.v1.json` `records`

The blocked finding captures the AP/Milk Street option without inventing a banana-pepper reference or active rule. The missing target identity should be revisited only if banana pepper is separately reviewed.

```json
{
  "recordId": "ingredient-ref-hungarian-wax-pepper",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S01",
      "url": "https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf",
      "title": "CFIA, Bactéries pathogènes et organismes indicateurs dans des piments forts entiers à l'état frais",
      "versionOrDate": "Final report 2026; sampling 2022-04-01 to 2025-03-31",
      "accessedOn": "2026-10-15",
      "locator": "Summary and Table 5; French fresh whole hot-pepper retail scope and product-type row Piment hongrois.",
      "supports": "Supports the retail product-type label Piment hongrois in a Canadian fresh whole hot-pepper study. It does not identify a botanical species or cultivar; the five samples and pooled sample mass are not per-pepper culinary measures.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S02",
      "url": "https://www.ontario.ca/foodland/food/peppers",
      "title": "Foodland Ontario, Peppers",
      "versionOrDate": "Current page found in search; direct retrieval returned 403; reviewed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Varieties section in indexed page text.",
      "supports": "Lists Hungarian Wax among hot elongated Ontario-grown pepper types and separately lists Sweet Hungarian. Direct open was blocked; the indexed government page text was reviewed.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S03",
      "url": "https://jobs.ontario.ca/fr/terre-nourriciere/aliments/poivrons-des-champs",
      "title": "Ontario Terre nourricière, Poivrons des champs",
      "versionOrDate": "Current French page found in search; direct retrieval returned a cache miss; reviewed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Varieties section in indexed French page text.",
      "supports": "Retains Hungarian Wax for the hot type and lists Sweet Hungarian separately. The page does not provide a French rendering of the type name.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S04",
      "url": "https://www.producemarketguide.com/produce/peppers-chili/hungarian-wax-chili-peppers",
      "title": "Produce Market Guide, Hungarian Wax Chili Peppers",
      "versionOrDate": "Commodity page directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Commodity title and produce category; size and Scoville descriptions.",
      "supports": "Supports the English plural produce label Hungarian Wax Chili Peppers. The 4-6 inch size and 5,000-15,000 SHU figures are descriptive source claims, not mass or universal fixed properties.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S05",
      "url": "https://www.producemarketguide.com/company/112832/exeter-produce-storage-co-ltd",
      "title": "Produce Market Guide, Exeter Produce & Storage Co Ltd",
      "versionOrDate": "Company page last updated 2026-06-19; directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Produce list, business operations, Ontario location, and Canadian/U.S./offshore service statement.",
      "supports": "An Ontario produce supplier lists Hungarian Wax Chili Peppers. The profile notes company data are self-reported and is supply-chain, not retail-SKU evidence.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S06",
      "url": "https://www.labrouettemaraichere.com/products/piment-fort-hungarian",
      "title": "La Brouette Maraîchère, Piment Fort Hongrois",
      "versionOrDate": "Québec plant listing, directly opened 2026-10-15; sold out; shop reopening stated for January 2027",
      "accessedOn": "2026-10-15",
      "locator": "Product heading, common names, plant pot size, variety Hungarian Hot Wax, and cultivation description.",
      "supports": "Supports local French crop wording and ties the page's plant to Hungarian Hot Wax. It is a nursery product, not fresh-food retail or official terminology evidence; plant and heat figures remain source-specific.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S07",
      "url": "https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=YELLOW+BANANA",
      "title": "Government of Canada, TERMIUM Plus search for YELLOW BANANA",
      "versionOrDate": "Indexed records reviewed 2026-10-15; dynamic page direct retrieval returned a cache miss",
      "accessedOn": "2026-10-15",
      "locator": "Record dated 1994-07-15 for Hungarian wax/Hungarian banana pepper/jaune hongrois and record dated 1990-12-10 for sweet banana/Sweet Hungarian/piment banane/Hongrois jaune.",
      "supports": "Documents overlapping hot-Wax and sweet banana/Hungarian terminology. Used to exclude ambiguous aliases, not to establish the proposed display name.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-HUNGARIAN-WAX-20261015-R142-S08",
      "url": "https://apnews.com/article/hungarian-chicken-paprikash-recipe-milk-street-898250ed32ad7dbe341b13eaf15e406f",
      "title": "AP News / Milk Street, Use two types of paprika for the best Hungarian chicken paprikash",
      "versionOrDate": "Recipe article directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Chicken Paprikash ingredient line lists two banana peppers or wax peppers; serves 4-6.",
      "supports": "Supports only this recipe's either/or ingredient option. The recipe amount is not a generic count conversion or serving measure.",
      "sourceKind": "culinary_reference"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "wp03-l-hungarian-wax-r142-ap-paprikash-banana-pepper-option",
      "researchState": "blocked_pending_evidence",
      "fromIngredientRefId": "ingredient-ref-hungarian-wax-pepper",
      "context": "AP/Milk Street Hungarian Chicken Paprikash recipe, yield 4-6.",
      "basis": "The recipe lists two banana peppers or wax peppers on one ingredient line.",
      "limitations": [
        "This is an either/or option for this named paprikash recipe only.",
        "The banana-pepper option does not establish an alias or a general substitution rule.",
        "No separate banana-pepper reference is active, so no catalog replacement link or rule is proposed.",
        "The recipe's two-pepper quantity is not a per-pepper measure or reusable count conversion."
      ],
      "sourceIds": ["WP03-L-HUNGARIAN-WAX-20261015-R142-S08"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add fresh-market Hungarian wax pepper / piment fort hongrois. Preserve only the source-qualified English plural market names; keep the CFIA's unqualified Piment hongrois table wording, sweet banana/Hungarian naming, cultivar claims, origin, and generic pepper terms out of aliases.",
      "sourceIds": [
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S01",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S02",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S04",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S05",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S06"
      ]
    },
    {
      "outcome": "accepted",
      "reason": "Add one fresh form for the whole fresh hot-pepper retail product; add no cooked, dried, pickled, or ground form.",
      "sourceIds": [
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S01",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S05"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Do not add a reusable measure, density, unit mapping, count weight, yield, or conversion from surveillance samples, supplier descriptions, nursery plant dimensions, or the paprikash recipe amount.",
      "sourceIds": [
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S01",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S04",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S06",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S08"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Keep the paprikash banana-pepper option dish-scoped and blocked from an active catalog substitution until banana pepper has a separately reviewed identity; do not treat it as synonym or general equivalence.",
      "sourceIds": [
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S07",
        "WP03-L-HUNGARIAN-WAX-20261015-R142-S08"
      ]
    }
  ]
}
```
