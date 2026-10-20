# WP03 Section F R96 — Kashi GoActive Original Cereal identity review

Review date: 2026-10-14

Status: accepted and integrated on 2026-10-14 as one identity-only reference and one research-ledger record; no recipe was changed.

## Recommendation

Add one product-specific `GRAIN_AND_CEREAL` identity for **`Kashi GoActive Original Cereal / Céréales Kashi GOACTIVE Originale`**, proposed ID `ingredient-ref-kashi-goactive-original-cereal`. The current Canadian manufacturer SmartLabel provides both names, the ingredient declaration, and a label serving of 1 cup (52 g); Kashi's Québec retailer finder lists the French-named product as offered by five online retailers [S01–S03]. The product is a ready-to-eat composite cereal whose finished formulation includes a four-grain puffed blend, soy protein, corn ingredients, oat fibre, bran, flour, sweeteners, flavour, and annatto. Keep the identity tied to this complete named product.

The broader Section F checklist remains open for regional cereal mixes and preprocessed grains ([global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2892)). This review does not reopen the integrated Red River, Rogers, Mighty Tasty, granola, muesli, or generic puffed-grain identities.

## Identity and process boundary

The manufacturer lists the current product as **Kashi GoActive Original Cereal** in English and **Céréales Kashi GOACTIVE Originale** in French. Its current Canadian ingredient list begins with a `puffed whole grains blend (hard red wheat, triticale, brown rice, rye)`, then lists soy protein concentrate, degerminated corn flour and meal, oat hull fibre, wheat bran, soy flour, corn bran, a separate seven-whole-grain flour, sugar and honey, salt, natural flavour, and annatto [S01–S02]. The identity is the boxed finished cereal, not the inner puffed-grain blend.

Keep it separate from the individual wheat, triticale, rice, rye, corn, oat, barley, buckwheat, soy, bran, and flour references; the generic puffed-grain references; and existing branded or formulated cereals. Do not treat `puffed whole grains blend` as a name or alias for the finished cereal.

Current Québec retail-finder evidence is specific to GoActive. A Super C listing indexed in the same period uses the earlier **`Céréales soufflées de 8 grains entiers Go Lean Kashi`** name, a different product number, and an older eight-grain ingredient blend; that selected listing reports the item out of stock [S04]. It does not establish `Go Lean`, `8 whole grain puff cereal`, or `céréales soufflées de 8 grains entiers` as aliases or synonyms for the current GoActive cereal. Do not merge product names or transfer the older blend's composition.

## Proposed catalog fields and picker boundary

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-kashi-goactive-original-cereal` |
| English display | `Kashi GoActive Original Cereal` |
| Québec French display | `Céréales Kashi GOACTIVE Originale` |
| Category | `GRAIN_AND_CEREAL` |
| English aliases | None |
| French aliases | None |
| Default density | `null` |
| Unit mappings | `[]` |
| Ingredient forms | None |

The exact English and French displays are currently unowned. Exact-key scans also found no owner for the proposed ID or `GoActive` in active references, forms, legacy candidates, or ledger record IDs. Keep the older Go Lean wording and the inner-component phrase out of aliases.

The following picker projection applies the current phrase-first search to the live references/forms plus the proposed display pair:

| Query | Current result count | Proposed result count | Boundary |
| --- | ---: | ---: | --- |
| `Kashi GoActive Original Cereal` | 0 | 1 | Exact English product name. |
| `GoActive` | 0 | 1 | Current product line. |
| `Céréales Kashi GOACTIVE Originale` | 0 | 1 | Exact manufacturer French product name; accent folding handles unaccented `Cereales`. |
| `Kashi` | 0 | 1 | The new identity is the only current Kashi reference. |
| `cereal` | 14 | 15 | Broad cereal search includes the new product alongside existing cereal choices. |
| `céréales` | 9 | 10 | Broad French cereal search includes the new product alongside existing choices. |
| `puffed whole grains blend` | 0 | 0 | Ingredient-list wording is not an alias for the finished cereal. |
| `8 Whole Grain Puff Cereal` | 0 | 0 | Earlier Go Lean listing remains outside the GoActive identity. |

## Recipe demand

The current package manifest lists 114 recipe files. Scanning every recipe's serialized JSON and all 1,123 structured ingredient rows for `Kashi`, `GoActive`, `Go Active`, `Kashi GoActive Original Cereal`, `Céréales Kashi GOACTIVE Originale`, and the older Go Lean product name found no matches and no direct recipe links. No recipe edit or link is proposed.

## Measures, forms, and substitutions

- **Product-specific portion:** Kashi's Canadian English and French SmartLabel pages give a nutrition serving of **1 cup (52 g)** for this product [S01–S02]. Record only that published portion observation. The pages do not provide a measuring method or cup-volume convention, so do not activate a density, unit mapping, general cup conversion, or volume-to-mass rule.
- **Forms and yields:** Add no `IngredientForm`. This is a finished ready-to-eat composite cereal, not a dry/cooked state of a component grain. No cooked yield or reconstitution conversion is reported.
- **Substitutions:** No reviewed source gives a tested, quantity-qualified replacement for this product in a defined recipe role or method. Other breakfast cereals, puffed grains, and hot cereals are not interchangeable by name alone. Add no global or contextual substitution rule and no recipe-line substitution link.
- **Recipe links:** None; the bundled recipe corpus has no matching request.

## Exact proposed identity and ledger delta

**Ingredient reference**

```json
{
  "id": "ingredient-ref-kashi-goactive-original-cereal",
  "nameEn": "Kashi GoActive Original Cereal",
  "nameFr": "C\u00e9r\u00e9ales Kashi GOACTIVE Originale",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

**Research-ledger record**

```json
{
  "recordId": "ingredient-ref-kashi-goactive-original-cereal",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-GOACTIVE-R96-20261014-S01",
      "url": "https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00018627115939",
      "title": "WK Kellogg Co Canada — Kashi GoActive Original Cereal, SmartLabel",
      "accessedOn": "2026-10-14",
      "locator": "Product title, 349 g package, 1 cup (52 g) Nutrition Facts serving, and Ingredients.",
      "supports": "Current Canadian manufacturer label for UPC 00018627115939 names Kashi GoActive Original Cereal, lists the current ingredients, and gives the product-specific 1 cup (52 g) serving. This serving is not a general cereal conversion or density.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-GOACTIVE-R96-20261014-S02",
      "url": "https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00018627115939",
      "title": "WK Kellogg Co Canada — Céréales Kashi GOACTIVE Originale, SmartLabel",
      "accessedOn": "2026-10-14",
      "locator": "French product title, 349 g package, 1 tasse (52 g) Valeur nutritive serving, and ingredient list.",
      "supports": "French Canadian manufacturer label for the same UPC pairs the product with Céréales Kashi GOACTIVE Originale, lists the same current ingredients, and reports 1 tasse (52 g) as a product-specific serving.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-GOACTIVE-R96-20261014-S03",
      "url": "https://www.kashi.ca/fr/ou-acheter",
      "title": "Kashi Canada — Où acheter",
      "accessedOn": "2026-10-14",
      "locator": "Québec region filter and product list, Céréales Kashi GOACTIVE Originale.",
      "supports": "The manufacturer retailer finder set to Québec lists Céréales Kashi GOACTIVE Originale as offered by five online retailers. The listing establishes current Québec-market product naming and retail-finder presence, not store-level inventory.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-GOACTIVE-R96-20261014-S04",
      "url": "https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-soufflees-de-8-grains-entiers/p/018627597667",
      "title": "Super C — Céréales soufflées de 8 grains entiers Go Lean Kashi",
      "accessedOn": "2026-10-14",
      "locator": "French retailer listing, product number 018627597667, older eight-grain ingredient declaration, and out-of-stock message.",
      "supports": "A separate retailer-listed Go Lean product uses an older eight-grain puff-cereal name and a different ingredient blend. It was marked out of stock at the selected store; it does not establish an alias, formula, or synonym for the current GoActive product.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "WP03-GOACTIVE-R96-20261014-M1-CUP-52G",
      "relationship": "portion_weight",
      "value": 52,
      "valueUnit": "g",
      "foodDescription": "Kashi GoActive Original Cereal, Canadian manufacturer product label",
      "foodState": "Dry ready-to-eat composite cereal, as sold.",
      "measurementMethod": "Published nutrition-label serving; no measuring or weighing method is stated.",
      "quantityBasis": "Product-specific label serving only. The manufacturer states one cup but does not specify a cup-volume convention; do not use as a general cup-to-mass conversion or density.",
      "sourceQuantity": {
        "amount": 1,
        "unit": "cup",
        "unitConvention": "Not specified by the manufacturer label."
      },
      "observedMassG": 52,
      "evidenceKind": "manufacturer_label",
      "sourceIds": [
        "WP03-GOACTIVE-R96-20261014-S01",
        "WP03-GOACTIVE-R96-20261014-S02"
      ]
    }
  ],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one product-specific GRAIN_AND_CEREAL identity for Kashi GoActive Original Cereal / Céréales Kashi GOACTIVE Originale. Keep it scoped to the current Canadian finished cereal and distinct from its puffed whole-grain component, other Kashi products, the older Go Lean eight-grain listing, and all component ingredients. Add no aliases or forms; retain the 1 cup (52 g) only as a product-label portion observation; leave defaultDensity null and unitMappings empty; add no recipe links, yield, conversion, or substitutions. No bundled recipe demand was found.",
      "sourceIds": [
        "WP03-GOACTIVE-R96-20261014-S01",
        "WP03-GOACTIVE-R96-20261014-S02",
        "WP03-GOACTIVE-R96-20261014-S03",
        "WP03-GOACTIVE-R96-20261014-S04"
      ]
    }
  ]
}
```

## Source register and limits

| Source ID | Source | Evidence used | Limits |
| --- | --- | --- | --- |
| `WP03-GOACTIVE-R96-20261014-S01` | WK Kellogg Co Canada, [Kashi GoActive Original Cereal SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00018627115939) | Current English product name, UPC 00018627115939, 349 g package, ingredient list, and 1 cup (52 g) serving. | Product-specific manufacturer label; one serving does not define a reusable conversion. The page says product information can change and advises checking the package. |
| `WP03-GOACTIVE-R96-20261014-S02` | WK Kellogg Co Canada, [Céréales Kashi GOACTIVE Originale SmartLabel](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00018627115939) | Current French Canadian product name, the matching UPC and ingredients, and 1 tasse (52 g) serving. | Manufacturer label wording, not an OQLF ruling or general cereal-measure standard. |
| `WP03-GOACTIVE-R96-20261014-S03` | Kashi Canada, [Où acheter](https://www.kashi.ca/fr/ou-acheter) | With the region set to Québec, Kashi lists Céréales Kashi GOACTIVE Originale and says it is offered by five online retailers. | Retail-finder listings do not establish stock at a particular store. |
| `WP03-GOACTIVE-R96-20261014-S04` | Super C, [Céréales soufflées de 8 grains entiers Go Lean Kashi](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-soufflees-de-8-grains-entiers/p/018627597667) | Earlier French retailer title and a different, eight-grain puffed component blend; the page reports out of stock at the selected store. | Retailer product data, not a current manufacturer formulation or a synonym source. Direct page access returned 403; the current search index supplied the listing text. |

No source was found that validates a quantity-preserving substitution for the current GoActive cereal. A suggested replacement for the older Go Lean product or a cereal use in a different recipe is not transferred to this current formula.

## Static checks performed

- Re-read `AGENTS.md`, `Requirements.md`, the live Section F plan and roadmap, recent Section F proposals, and the current cereal reference/form/ledger/legacy data before selecting this candidate.
- At proposal time the split package contained 1,428 references, 105 forms, 63 legacy candidates, and 1,768 ledger records; the recipe package contained 114 manifest-listed files and 1,123 structured ingredient rows.
- Checked the proposed ID, English/French display keys, `GoActive`, current UPC, source-ID prefix, and prior Go Lean wording against active references, forms, legacy candidates, the ledger, proposal/batch archive, plan, roadmap, and bundled recipes. No exact active owner or source-ID collision was found.
- Reproduced phrase-first picker results for the exact displays, broad cereal queries, the inner puffed-grain phrase, and the older Go Lean phrase; the proposal results are recorded above.
- Scanned every manifest-listed recipe file and ingredient row for the current and older product names; found no recipe-file, row, or direct-link matches.
- No application, Gradle, instrumentation, or emulator tests were run because the accepted change only adds database JSON data and its generated catalog index under the `AGENTS.md` exception.

## Root integration decision (2026-10-14)

Accepted the product-specific `Kashi GoActive Original Cereal / Céréales Kashi GOACTIVE Originale` identity as `ingredient-ref-kashi-goactive-original-cereal` in `GRAIN_AND_CEREAL`. The current Canadian manufacturer labels and Québec product finder support the exact bilingual product identity. The older Go Lean listing and the inner puffed-grain blend remain outside this row. Alias arrays, forms, default density, and unit mappings remain empty. The manufacturer’s 1 cup (52 g) serving is recorded only as a product-specific ledger observation; no reusable conversion, yield, recipe link, or substitution was added.

Updated the Section F checklist, global plan, and roadmap. The canonical package now has 1,429 references and 1,769 research-ledger records. See the batch README for static validation results.
