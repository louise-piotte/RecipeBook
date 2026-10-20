# WP03 Section F R617 — Farm Girl Rainbow Hoops cereal identity review (2026-10-18)

- **Status:** Accepted and integrated as R617. See the [integration README](../batches/wp03-section-f-farm-girl-rainbow-hoops-identity-integration-r617-20261018/README.md).
- **Open plan anchor:** [Section F: regionally significant cereal mixes and preprocessed grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L4551). Section F remains open in the active [roadmap](../../../roadmap.md).
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for Farm Girl Rainbow Hoops. Record the manufacturer’s `1 cup (40 g)` label serving only as a product-page observation in the research ledger. Do not turn it into a generic cereal conversion or map it to the UPC-listed package until the product-version link is confirmed.
- **Boundary:** This covers one named, ready-to-eat packaged cereal. It does not cover generic rainbow-shaped cereals, Fruit Loops/Froot Loops, Farm Girl’s other cereals, or any cereal component.

## Evidence and product boundary

Farm Girl’s manufacturer page names “Rainbow Hoops,” describes it as cereal, and gives a current product-page serving of `1 cup (40 g)`. The page currently displays the item as sold out; that status is not treated as evidence of general availability. The serving declaration is retained only as a statement on that manufacturer page, since the page does not give a UPC or a measuring protocol [S01].

Metro’s Québec listing identifies Farm Girl “Céréales anneaux arc-en-ciel,” a 280 g package, and product number `628678617544`. The search index also exposes the French ingredient declaration, but direct retrieval returned HTTP 403 during this review. Purity Life’s 2025 Canadian order form independently pairs that same UPC with `Cerceaux arc-en-ciel`, 280 g, under its Farm Girl product section [S02–S03]. A Québec-facing Ikigaï Santé listing uses “Anneaux Arc-en-ciel” in a bilingual product title [S04]. Together, these sources support one branded cereal identity and the proposed French display/alias.

`Cerceaux arc-en-ciel` alone is an unqualified shape-and-colour description, so it is not stored as an alias by itself. The alias is brand-qualified as `Cerceaux arc-en-ciel Farm Girl`: Purity Life lists that French product wording in the explicit FARM GIRL section and ties the row to the same UPC. The current picker still returns this product for the shorter phrase because that phrase occurs at the start of the qualified alias; this effect is made explicit in the projection below.

The manufacturer and Metro ingredient declarations differ. The manufacturer page does not show the UPC, so this review does not claim that the manufacturer’s current formulation or `1 cup (40 g)` serving is tied to the exact 280 g UPC listing. The proposed ledger observation preserves only the manufacturer’s own label statement, with that limit in its description. No ingredients, formula, health claim, or package contents are normalized into the active catalog.

The manufacturer compares Rainbow Hoops’ fibre content with Fruit Loops. That comparison does not establish that the products are interchangeable. Keep Fruit Loops/Froot Loops, generic fruit-flavoured cereal, and generic ring cereal out of this row’s aliases.

## Integrated JSON changes

The integrated reference in `ingredient-references.v1.json` is:

```json
{
  "id": "ingredient-ref-farm-girl-rainbow-hoops-cereal",
  "nameFr": "Céréales anneaux arc-en-ciel Farm Girl",
  "nameEn": "Farm Girl Rainbow Hoops cereal",
  "aliasesFr": ["Cerceaux arc-en-ciel Farm Girl"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The integrated record in `research-ledger.v1.json` uses the same `recordId`:

```json
{
  "recordId": "ingredient-ref-farm-girl-rainbow-hoops-cereal",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-FARMGIRL-R617-20261018-S01",
      "url": "https://farmgirlcereal.com/products/rainbow-hoops-gluten-free-cereal",
      "title": "Gluten-Free and Sugar-Free Rainbow Hoops Cereal – Farm Girl",
      "accessedOn": "2026-10-18",
      "locator": "Product name and description; nutrition facts serving declaration, Per 1 cup (40 g). The page displays the product as sold out and does not show a UPC.",
      "supports": "The manufacturer identifies Rainbow Hoops as cereal and publishes one product-page serving of 1 cup (40 g). This supports only a manufacturer-page portion observation, not a generic cereal measure or a crosswalk to the 280 g retailer SKU.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-FARMGIRL-R617-20261018-S02",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/nature-s-signature/garde-manger/collations/cereales-anneaux-arc-en-ciel/p/628678617544",
      "title": "Céréales anneaux arc-en-ciel Farm Girl – Metro",
      "accessedOn": "2026-10-18",
      "locator": "Indexed Québec product listing: title, Farm Girl brand, 280 g package, product number 628678617544, and French ingredient declaration. Direct page retrieval returned HTTP 403.",
      "supports": "Supports the Québec French product wording and a specific 280 g Farm Girl product identified by UPC 628678617544. The indexed ingredient declaration differs from the current manufacturer page and is not used to assert a formula.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-FARMGIRL-R617-20261018-S03",
      "url": "https://puritylife.com/wp-content/uploads/2025/04/CHFA-NOW-Vancouver-2025-Bon-de-Commande.pdf",
      "title": "Purity Life, CHFA NOW Vancouver 2025 Bon de Commande",
      "versionOrDate": "2025",
      "accessedOn": "2026-10-18",
      "locator": "Printed page 49, row 437310: UPC 628678617544, `Cerceaux arc-en-ciel`, 280 g; the product section is headed FARM GIRL.",
      "supports": "Pairs the French product wording `Cerceaux arc-en-ciel` and 280 g package with the same UPC as Metro’s listing in the explicit FARM GIRL product section. The proposed search alias adds the section’s brand qualifier so the unqualified descriptor is not stored as its owner.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-FARMGIRL-R617-20261018-S04",
      "url": "https://www.ikigaisante.com/products/cereales-sante-proteines-et-fibres-prebiotiques-anneaux-arc-en-ciel-rainbow-hoops-farm-girl",
      "title": "Céréales santé, protéines et fibres prébiotiques – Anneaux Arc-en-ciel – Rainbow Hoops – Farm Girl – Ikigaï Santé",
      "accessedOn": "2026-10-18",
      "locator": "Québec-facing retailer product title and store address in Saint-Georges, Québec; the product is listed as a 280 g Farm Girl cereal.",
      "supports": "Corroborates the French term `Anneaux Arc-en-ciel` in a Québec retailer’s bilingual product title. It does not establish an OQLF-preferred term or a UPC crosswalk.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "farm-girl-rainbow-hoops-one-cup-40g-manufacturer-label-20261018",
      "relationship": "portion_weight",
      "value": 40,
      "valueUnit": "g",
      "foodDescription": "Farm Girl Rainbow Hoops cereal, manufacturer product-page label serving; UPC not displayed on that page",
      "evidenceKind": "manufacturer_label",
      "sourceIds": ["WP03-FARMGIRL-R617-20261018-S01"],
      "sourceQuantity": {
        "amount": 1,
        "unit": "cup"
      },
      "observedMassG": 40,
      "quantityBasis": "One serving as printed on the manufacturer product page. The page gives no cup convention or measuring protocol; this observation is source-specific and is not crosswalked to the retailer’s 280 g UPC listing.",
      "measurementMethod": "Manufacturer product-page label serving declaration."
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add the named Farm Girl Rainbow Hoops cereal as one GRAIN_AND_CEREAL identity. Keep the manufacturer’s 1 cup (40 g) serving as a product-page-only portion observation; the page does not show the UPC, and no generic measure, density, unit mapping, or conversion is supported. The current manufacturer and UPC-listed retailer ingredient declarations differ, so do not assert a fixed product formulation.",
      "sourceIds": [
        "WP03-FARMGIRL-R617-20261018-S01",
        "WP03-FARMGIRL-R617-20261018-S02",
        "WP03-FARMGIRL-R617-20261018-S03",
        "WP03-FARMGIRL-R617-20261018-S04"
      ]
    }
  ]
}
```

The observation above is evidence attached to this named product’s research record. It is not a reusable `cup` conversion, density, or default measure. The UPC package mass `280 g` is package context only. No ingredient form, form conversion, cooking yield, recipe link, or substitution rule is proposed. No source supports substituting another cereal for this product.

## Picker projection

The static projection follows the bilingual phrase-first and substring search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Counts below are reference results before and after the proposed row; forms are included in each reference’s search terms.

| Query | Before | Proposed | Effect |
|---|---:|---:|---|
| `Farm Girl Rainbow Hoops cereal`; `Farm Girl`; `Rainbow Hoops` | 0; 0; 0 | 1; 1; 1 | Each finds the named product. |
| `Céréales anneaux arc-en-ciel Farm Girl`; `Cerceaux arc-en-ciel Farm Girl`; `anneaux arc-en-ciel` | 0; 0; 0 | 1; 1; 1 | Each finds the named product in French. |
| `Cerceaux arc-en-ciel` | 0 | 1 | Matches the opening phrase of the brand-qualified alias; the short unqualified phrase is not stored as an alias. |
| `arc-en-ciel`; `rainbow` | 1; 2 | 2; 3 | Each broad color query gains one result; existing owners remain visible. |
| `cereal`; `céréales` | 71; 67 | 72; 68 | Each broad cereal query gains one named product. |
| `Fruit Loops`; `Froot Loops` | 0; 0 | 0; 0 | No competitor or comparison wording is added as an alias. |

## Catalog ownership and recipe demand

The read-only ownership scan covered the active ingredient references and forms, legacy import identities, research-ledger records and source URLs, and the existing proposal/batch archive. After the concurrent R615 and R619 updates and immediately before R617 integration, the shared snapshot contained 1,823 references, 156 forms, 56 legacy candidates, and 2,195 research-ledger records. R617 brings the totals to 1,824 references and 2,196 research-ledger records. No exact owner was found for the proposed reference ID, product names, French display or alias, or UPC `628678617544`. None of the four proposed source URLs is already owned in the ledger, and the proposal-local source ID prefix `WP03-FARMGIRL-R617-20261018-` is unused. No prior proposal or batch contains the candidate’s product name, French wording, or UPC.

I scanned all 114 recipe files named by the current bundled-library manifest and their 1,123 structured ingredient rows. Exact searches for Farm Girl, Rainbow Hoops, the UPC, the French product strings, and the proposed reference ID found zero matching files and zero matching ingredient rows. The ordered manifest corpus read for this audit was 753,988 bytes, SHA-256 `1cfa3fe878669664da92964122abdd4baca348a112e89cdd41ca42590a69750e`.

There is no bundled-recipe demand for a recipe link, recipe amount, form, cooking yield, or substitution. The product is a ready-to-eat formulated cereal; no separate cooked or dry form is needed for this identity. Do not alias the finished cereal to oats, corn, starch, protein, or any other declared component.

## Static review checks

- [x] Confirmed the open Section F plan item and checked the active roadmap.
- [x] Read the active references, forms, legacy identities, ledger, manifest-listed recipes, and prior Section F proposals before selecting this product.
- [x] Checked exact normalized identity, UPC, source-URL, and source-ID-prefix ownership.
- [x] Reviewed manufacturer product evidence plus Québec/Canadian French product wording; recorded Metro’s direct-retrieval 403 and formulation mismatch as limitations.
- [x] Projected exact and broad picker results using the current phrase-first search semantics.
- [x] Scanned all manifest-listed recipes and structured ingredient rows for product-specific demand.
- [x] Kept active density, unit mappings, generic measures, forms, conversions, yields, recipe links, and substitutions out of the proposed data.
- [x] Checked this Markdown proposal for UTF-8 without BOM and scoped whitespace.
- [x] No software tests, builds, emulator checks, or deployment were run. The shared update contains only database JSON data and catalog documentation; integration checks are recorded in the [R617 integration README](../batches/wp03-section-f-farm-girl-rainbow-hoops-identity-integration-r617-20261018/README.md).

## Sources

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP03-FARMGIRL-R617-20261018-S01` | Farm Girl, [Rainbow Hoops](https://farmgirlcereal.com/products/rainbow-hoops-gluten-free-cereal). The manufacturer calls it cereal and publishes `Per 1 cup (40 g)` on its nutrition panel. | Page displays “Sold out,” does not show UPC, and does not specify a cup-measuring protocol. The serving remains a product-page observation. |
| `WP03-FARMGIRL-R617-20261018-S02` | Metro Québec, [Céréales anneaux arc-en-ciel Farm Girl](https://www.metro.ca/epicerie-en-ligne/allees/nature-s-signature/garde-manger/collations/cereales-anneaux-arc-en-ciel/p/628678617544). The indexed listing gives the product title, Farm Girl brand, 280 g, UPC `628678617544`, and French ingredient declaration. | Direct page retrieval returned 403; use the indexed listing for product-name and SKU corroboration only. Its ingredient declaration differs from Farm Girl’s current product page. |
| `WP03-FARMGIRL-R617-20261018-S03` | Purity Life, [CHFA NOW Vancouver 2025 Bon de Commande](https://puritylife.com/wp-content/uploads/2025/04/CHFA-NOW-Vancouver-2025-Bon-de-Commande.pdf), printed p. 49, row 437310. It pairs UPC `628678617544` with `Cerceaux arc-en-ciel`, 280 g, in the FARM GIRL product section. | A 2025 Canadian distributor order form; supports the branded product scope and SKU, not current retail stock or recipe measurements. |
| `WP03-FARMGIRL-R617-20261018-S04` | Ikigaï Santé, [Céréales santé, protéines et fibres prébiotiques – Anneaux Arc-en-ciel – Rainbow Hoops – Farm Girl](https://www.ikigaisante.com/products/cereales-sante-proteines-et-fibres-prebiotiques-anneaux-arc-en-ciel-rainbow-hoops-farm-girl). Québec-facing product title identifies the cereal in French and English. | Retailer wording, not an OQLF ruling or UPC crosswalk. Its product formulation is not treated as authoritative over the manufacturer. |
