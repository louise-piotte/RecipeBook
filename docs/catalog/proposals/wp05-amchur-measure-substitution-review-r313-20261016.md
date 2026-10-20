# R313 proposal: amchur measurement and substitution evidence

## Work-packet contract

- Scope: proposal-only review of the existing `ingredient-ref-amchur` row.
- Reviewed: 2026-10-16.
- Inputs: live bundled references, forms, package yields and substitution rules; the matching research-ledger record; the accepted WP05 South Asia/MENA identity proposal and batch note; the open catalog plan; and the manifest-listed recipe corpus.
- Ownership: the two existing identity source IDs remain owned by the amchur ledger record. The Loblaws product source ID proposed below was checked against the ledger, proposals and batches and is unowned. Reuse the existing Ameen source ID for the same URL; do not mint a second ID for it.
- Change boundary: this file is the only proposed change. Do not edit shared catalog, ledger, package-yield, plan, roadmap, generated, or recipe data as part of this review. Root owns integration.

## Recommendation

Keep the existing names, aliases, category, and identity boundaries unchanged. Set the ledger `measurementState` to `researched_supported` only for one Suraj listing's stated 0.5 g serving and Ameen Foods' currently displayed package options (150 g jar, 400 g pouch, and 1,000 g pouch). These are separate product-specific label/listing observations. They supply no spoon-to-mass relationship, volume-to-mass factor, or identity-wide package size. Leave `defaultDensity` null and `unitMappings` empty.

Set `substitutionResearchState` to `researched_no_supported_substitute` and leave `substitutionFindings` empty. Ameen Foods does say that amchur can stand in for lemon or tamarind in dry mixtures, with samosa filling and kebab mince as examples. The page gives a suggested starting dose of 1/2 teaspoon for four servings, but it does not provide a corresponding lemon or tamarind amount, name the tamarind form, or give a full formula and outcome. This is worth preserving in the reused source's evidence description, but it does not establish a form-resolved, formula-scoped finding or an actionable rule. The schema's no-supported state here means that no qualifying, exact-identity substitute finding was established; it does not claim that no cook or seller ever recommends amchur in place of another souring ingredient.

Add no form, conversion, unit mapping, global substitution, contextual rule, or bundled recipe link. Leave the broader WP05 condiment and Québec terminology checklist open.

## Existing state and boundaries

The live catalog has the exact row `ingredient-ref-amchur`: EN `amchur powder`; fr-CA `amchur (mangue) en poudre`; EN aliases `aamchur`, `amchoor`; FR alias `amchoor`; category `BAKING_AND_SPICE`; null `defaultDensity`; and empty `unitMappings`. The identity-verified ledger record has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`, with two identity sources and no measurement observations or substitution findings.

The existing identity sources are [Épices Anatol, “Amchur (mangue) en poudre”](https://www.epicesanatol.com/fr/epices/amchur-poudre/) (`WP05-MENA2-S07`) and [Ameen Foods Canada, “Amchur Powder”](https://ameenfoods.ca/products/amchur-powder-100g) (`WP05-MENA2-S08`). Épices Anatol's current Montréal page describes peeled green mango, cut, sun-dried, and ground to a brownish spice; it gives no household measure. Ameen's URL slug still says `100g`, but its current selector displays 150 g, 400 g, and 1,000 g variants.

The WP05 plan still marks broad condiment coverage and Québec terminology review open. The 2026-10-08 identity decision deliberately left general mango-powder terms inactive and did not add numeric or substitution data. This review keeps that boundary: no alias change for `mango powder`, `dry mango powder`, `dried mango powder`, or `sour mango powder`.

## Measurement review

| Evidence | Exact source statement | Proposed treatment | Limit |
|---|---|---|---|
| Suraj Amchoor Powder Mango Powder, Loblaws product 20618075_EA | Current indexed Loblaws listing names a 100 g product and reports “Serving Size Per 0.5 g.” | One `portion_weight` observation: one source-listed serving = 0.5 g, attached only to this listed Suraj product. | Loblaws' product page returned no extractable lines when opened; the directly indexed retailer result supplied the serving statement. It gives no teaspoon, tablespoon, cup, or other volume equivalent. The ingredient list is only “Mango Powder”; the listing title supplies the amchoor name. Do not treat this as a general amchur portion. |
| Ameen Foods Amchur Powder, current product page | The current selector shows 150 g jar, 400 g pouch, and 1,000 g pouch. | Three separate `package_yield` observations, one package at the displayed mass for each page variant. Reuse `WP05-MENA2-S08`, extending its locator/support text to include the current selector. | The product page supplies no UPC or separate product code for its variants. Keep each result as the Ameen page's product option only; do not infer an amchur package norm or recipe measure. |
| Ameen Foods use instructions | Advises 1/2–1 tsp in chana masala, an aloo dish, chaat, or dry rub; start with 1/2 tsp for four servings. | Retain as source text only. | The page gives no mass for the spoon dose and no specified spoon convention or full formula. Do not convert it to grams or volume density. |

The Suraj listing's mass-serving statement and Ameen's package sizes are independent evidence for different products. None can be averaged, substituted for one another, or promoted to `defaultDensity` or `unitMappings`. The Ameen page's package choices also do not represent a fixed package for the active identity.

## Substitution review

Ameen Foods' current page describes amchur as a common tamarind substitute and says it can stand in for lemon or tamarind when a mixture needs to stay dry, giving samosa filling and kebab mince as examples. It also recommends adding amchur near the end of cooking or off heat. This is direct Canadian seller guidance for a dry-use context, but it supplies no full recipe formula, matched replacement amount, or comparative test. “Tamarind” is not resolved to the active `ingredient-ref-tamarind` or the separate `ingredient-ref-tamarind-paste`; “lemon” likewise does not say whether the source means the whole fruit or `ingredient-ref-lemon-juice`. Assigning either source ingredient ID or a dose would require an unsupported form choice.

The [Culinary Institute of America’s *The Plant-Forward Kitchen: India*](https://www.plantforwardkitchen.org/s/Plant-Forward-Kitchen-India-Recipes.pdf) includes a defined Saunth chutney formula using 3 oz of “Amchur (whole slices of dried raw mango)” and a variation that replaces those slices with 10 oz tamarind pulp. That is a formula-specific comparison, but it concerns whole dried mango slices rather than the powdered identity in this review and gives the reverse direction. Do not transfer its amount or substitution to amchur powder.

An Australian spice seller, [True Indian Spices](https://trueindianspices.com.au/blogs/frequently-asked-questions/what-can-i-use-instead-of-amchur-powder), currently gives 1 tsp lemon juice per 1/2 tsp amchur while describing the result as suitable for “most recipes.” This is broad merchant advice, not a named tested formula or identified amchur SKU. It does not resolve Ameen's dry-mixture limitation or the missing tamarind form, so it is not used to create a ratio or ledger finding.

Therefore the recommendation is no formula-scoped substitution finding and no runtime rule. Retain the Ameen statement in its source's evidence text so the no-supported state does not erase what the seller claims. The ledger state distinguishes completed review with no supported recordable substitution from `not_yet_researched`; it does not negate the seller's qualitative statement.

## Catalog, picker, and recipe audit

The bundled manifest lists 114 recipe files. A manifest-ordered scan for the target ID and the phrases `amchur`, `amchoor`, `aamchur`, `mango powder`, and `mangue en poudre` found no recipe matches. There is no bundled recipe demand or recipe line to link.

The forms, global substitution rules, contextual substitution rules, and package-yield part have no amchur entry. No proposed edit changes those files. A picker check using the current normalized phrase-first search behavior produces these boundaries:

| Query | Current result | Boundary |
|---|---|---|
| `amchur`, `amchur powder`, `amchoor`, `aamchur` | `ingredient-ref-amchur` only | Keep the existing exact names and aliases. |
| `mangue en poudre` | `ingredient-ref-amchur` only | Existing qualified French name remains precise. |
| `mango powder`, `dry mango powder`, `dried mango powder`, `sour mango powder` | No result | Do not add these broader aliases. |
| `mango` | Mango pickle and sweet mango chutney | Existing English query is broader and does not resolve amchur. |
| `mangue` | Amchur, mango pickle, and sweet mango chutney | Existing French query is broad; do not add further short mango terms. |

The only relevant source-ID ownership already in the ledger is `WP05-MENA2-S07` and `WP05-MENA2-S08`, both attached to `ingredient-ref-amchur`. The new Loblaws source ID below was not found in the ledger, archived proposals, or batches. The target R313 proposal path was unoccupied before this write.

## Proposed ledger delta

For the existing `ingredient-ref-amchur` record, append the Loblaws source below; reuse and update `WP05-MENA2-S08` rather than duplicate its URL; set `measurementState` to `researched_supported`; and add the four product-specific observations listed in the JSON sketch. Set `substitutionResearchState` to `researched_no_supported_substitute` and leave `substitutionFindings` empty. Keep the existing accepted identity decision, source `WP05-MENA2-S07`, names, aliases, and category. If a measurement decision is appended, state explicitly that it covers only the listed Suraj serving and Ameen package variants.

The JSON sketch illustrates the new Loblaws source and proposed measurement observations only; it is not a standalone replacement for the current ledger record:

```json
{
  "source": {
    "sourceId": "WP05-AMCHUR-MEASURE-SUBSTITUTION-R313-20261016-S01",
    "url": "https://www.loblaws.ca/en/amchoor-powder-mango-powder/p/20618075_EA",
    "title": "Loblaws, Suraj Amchoor Powder Mango Powder, 100 g",
    "accessedOn": "2026-10-16",
    "locator": "Indexed product listing, product number 20618075_EA, Nutrition Facts serving-size line; direct page open returned no extractable lines.",
    "supports": "The current retailer listing names Suraj Amchoor Powder Mango Powder, 100 g, and reports a serving size per 0.5 g. It supports only a product-specific label serving; no volume measure or generic amchur conversion is reported.",
    "sourceKind": "other"
  },
  "measurementState": "researched_supported",
  "measurementObservations": [
    {
      "observationId": "wp05-amchur-suraj-20618075-0p5g-serving-r313-20261016",
      "relationship": "portion_weight",
      "value": 0.5,
      "valueUnit": "g",
      "foodDescription": "Suraj Amchoor Powder Mango Powder, Loblaws product 20618075_EA, listed as 100 g.",
      "foodState": "Retail product as sold.",
      "measurementMethod": "The indexed Loblaws product listing reports a 0.5 g Nutrition Facts serving; direct page extraction was unavailable.",
      "quantityBasis": "One serving as stated for this listed Suraj product only; not a spoon measure, density, or general amchur value.",
      "sourceQuantity": { "amount": 1, "unit": "serving" },
      "observedMassG": 0.5,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP05-AMCHUR-MEASURE-SUBSTITUTION-R313-20261016-S01"]
    },
    {
      "observationId": "wp05-amchur-ameen-150g-jar-package-r313-20261016",
      "relationship": "package_yield",
      "value": 150,
      "valueUnit": "g",
      "foodDescription": "Ameen Foods Amchur Powder, current 150 g jar listing variant.",
      "foodState": "Retail product as sold.",
      "measurementMethod": "Current Ameen Foods product-page variant selector displays 150 g (Jar).",
      "quantityBasis": "One listed Ameen variant only; not a serving, household measure, or generic amchur package size.",
      "sourceQuantity": { "amount": 1, "unit": "package" },
      "observedMassG": 150,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP05-MENA2-S08"]
    },
    {
      "observationId": "wp05-amchur-ameen-400g-pouch-package-r313-20261016",
      "relationship": "package_yield",
      "value": 400,
      "valueUnit": "g",
      "foodDescription": "Ameen Foods Amchur Powder, current 400 g pouch listing variant.",
      "foodState": "Retail product as sold.",
      "measurementMethod": "Current Ameen Foods product-page variant selector displays 400 g (Pouch).",
      "quantityBasis": "One listed Ameen variant only; not a serving, household measure, or generic amchur package size.",
      "sourceQuantity": { "amount": 1, "unit": "package" },
      "observedMassG": 400,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP05-MENA2-S08"]
    },
    {
      "observationId": "wp05-amchur-ameen-1000g-pouch-package-r313-20261016",
      "relationship": "package_yield",
      "value": 1000,
      "valueUnit": "g",
      "foodDescription": "Ameen Foods Amchur Powder, current 1,000 g pouch listing variant.",
      "foodState": "Retail product as sold.",
      "measurementMethod": "Current Ameen Foods product-page variant selector displays 1,000 g (Pouch).",
      "quantityBasis": "One listed Ameen variant only; not a serving, household measure, or generic amchur package size.",
      "sourceQuantity": { "amount": 1, "unit": "package" },
      "observedMassG": 1000,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP05-MENA2-S08"]
    }
  ],
  "substitutionResearchState": "researched_no_supported_substitute",
  "substitutionFindings": []
}
```

## Evidence register

Sources were checked online on 2026-10-16. `WP05-MENA2-S07` and `WP05-MENA2-S08` are existing identity sources; only the Loblaws listing requires a new ledger source ID. The CIA and Australian retailer pages below were reviewed as substitution evidence boundaries and are not proposed as new ledger sources for the amchur powder record.

| Source ID | Source and evidence | Limit |
|---|---|---|
| Existing `WP05-MENA2-S07` | Épices Anatol, [Amchur (mangue) en poudre](https://www.epicesanatol.com/fr/epices/amchur-poudre/). Current product page and Montréal address. | Green mango drying and powdering, seasoning use, and marinade use; no package mass or household measure. |
| Existing `WP05-MENA2-S08` (reuse/update) | Ameen Foods Canada, [Amchur Powder](https://ameenfoods.ca/products/amchur-powder-100g). Current product selector, description, and “How to use it” text. | Current variants are 150 g, 400 g, and 1,000 g; seller describes dry-mixture alternatives to lemon/tamarind and a starting dose of 1/2 tsp for four servings, with no comparative amount, mass, or full recipe formula. The URL slug is stale. |
| New `WP05-AMCHUR-MEASURE-SUBSTITUTION-R313-20261016-S01` | Loblaws, [Suraj Amchoor Powder Mango Powder, 100 g](https://www.loblaws.ca/en/amchoor-powder-mango-powder/p/20618075_EA), product number 20618075_EA. Indexed page text reports a serving size per 0.5 g and lists Mango Powder as the ingredient. | Direct page extraction returned zero lines; the indexed listing is the only accessible text used here. Product-specific serving only; no volume equivalent. |
| Reviewed for boundary, not assigned a new ledger source ID | Culinary Institute of America, [*The Plant-Forward Kitchen: India*](https://www.plantforwardkitchen.org/s/Plant-Forward-Kitchen-India-Recipes.pdf), Saunth chutney on PDF page 17. | Defined recipe substitutes 10 oz tamarind pulp for 3 oz whole dried raw mango slices; the mango form and direction do not match amchur powder. |
| Reviewed for boundary, not assigned a new ledger source ID | True Indian Spices, [What Can I Use Instead of Amchur Powder?](https://trueindianspices.com.au/blogs/frequently-asked-questions/what-can-i-use-instead-of-amchur-powder), dated June 8, 2026. | Australian seller's general lemon-juice ratio is not a named formula, tested comparison, or Canada/Québec product measure. Not used as a catalog ratio or finding. |

## Open items and limits

- No teaspoon, tablespoon, cup, or mass-volume relationship is supported. Do not infer mass from Ameen's 1/2 tsp dose or from either package amount.
- The Suraj 0.5 g serving depends on the retailer's indexed listing because the current product page did not expose extractable lines. Root may omit this observation if direct label confirmation is required; the Ameen package variants remain independently stated on the seller page.
- No matching amchur recipe exists in the bundled corpus, so neither Ameen's examples nor the CIA formula creates a bundled line link.
- No exact powder-form, form-resolved recipe substitution formula was found. Retain supplier wording as evidence, but do not encode a source form, ratio, rule, or active picker suggestion.
- Do not broaden mango aliases or change the open WP05 checklist.
- No software tests, build, emulator check, or deployment was run; this is a proposal-only research task and the current data-only policy requires no software testing.
