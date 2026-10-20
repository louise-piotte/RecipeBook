# WP02 A6 generic quinoa flour portion review — R719 — 2026-10-18

## Review record

- **Status:** Proposal only. No shared reference, ledger, recipe, plan, roadmap, workflow, generated, or integration file changed.
- **Scope:** One still-open measurement question for existing `ingredient-ref-quinoa-flour`: whether a current Québec product label supports a source-specific household portion and whether that portion can be used as a generic flour measure.
- **Plan anchor:** The open A6 parent at [global catalog plan line 1805](../../RecipeBook-global-ingredient-catalog-plan.txt#L1805) continues reviews of quinoa and other regional grain flours. R616 completed measurement and substitution research for the separate roasted-quinoa-flour reference; R620 reviewed sprouted amaranth flour. This proposal concerns the plain generic quinoa-flour reference only.
- **Prior-review boundary:** The A6 identity review retained generic `quinoa flour / farine de quinoa` without numeric data. R132's quinoa-starch hold and R38's malted-quinoa-flour hold cited the MAPAQ plain-flour page only as a boundary source. They did not add a portion to the generic quinoa-flour ledger row. No prior identity, French-name, color, process, or substitution decision is reopened.
- **Proposal-local IDs:** `WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S01` through `S03`, and `quinoa-flour-cuisine-soleil-quarter-cup-30-g-r719-20261018`. These IDs are review examples only and are not allocated in shared data.

## Bounded recommendation

Record the Cuisine Soleil label's **1/4 cup (30 g)** serving as one product-specific `portion_weight` observation on the existing `ingredient-ref-quinoa-flour` ledger row. Set that row's `measurementState` to `researched_no_supported_value` for a transferable generic measure: this observation belongs to one named product and does not establish a default density, generic cup mapping, or standardized fill method. Preserve `defaultDensity: null`, `unitMappings: []`, the active bilingual names, and the separate generic/roasted/color-qualified quinoa identities.

This review addresses measurement only. Keep `substitutionResearchState: not_yet_researched`; do not create a finding or runtime substitution from Cuisine Soleil's separate, brand-specific three-step flour-blend guidance. Add no alias, form, package yield, conversion, recipe link, or active substitution.

## Current ownership and prior decisions

| Surface | Current state | R719 disposition |
|---|---|---|
| Active reference | `ingredient-ref-quinoa-flour`, English `quinoa flour`, French `farine de quinoa`, category `FLOUR_AND_STARCH`; no aliases; `defaultDensity: null`; `unitMappings: []`. | Preserve the row and all active data. Do not default unqualified quinoa flour to a color or add the brand/organic phrase as an alias. |
| Research ledger | Identity `verified`; measurement and substitution states both `not_yet_researched`; no observations or substitution findings. Existing `WP02-S25` and `WP02-S26` support the generic French/English market names and identity only. | Add the R719 sources, one label-portion observation, and one measurement decision; update only the measurement state. Preserve both existing sources and the identity decision. |
| Adjacent references | Separate active rows exist for roasted, white, red, and black quinoa flour, alongside quinoa grain, flakes, and puffed quinoa. | Keep them distinct; do not transfer this plain product's serving to another flour or to intact quinoa. |
| Forms, rules, yields, and recipe links | No form, substitution rule, package-yield record, or recipe line references the generic quinoa-flour ID. | Add none. |

R616 was integrated on `ingredient-ref-roasted-quinoa-flour`; it reviewed study formulas and found no reusable measure for that Québec-mill product. R620 concerned a different processed flour. The A6 generic quinoa/amaranth identity proposal left generic quinoa flour without measurement data. The new portion below fills that remaining measurement-evidence question without reopening those decisions.

## Product evidence and limits

- The [Québec Food Directory product sheet](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223789) identifies Cuisine Soleil Organic Quinoa Flour, produced by Moulin A. Coutu (2002) inc., as a 700 g product with GTIN `851424000028`. It describes organic stone-ground quinoa flour and lists Nutrition Facts **per 1/4 cup (30 g)** plus a 30 g serving size. The directory says the entry was last updated 2026-03-09. Its legal notice says MAPAQ is not responsible for company-published information, so treat the quantity as a reproduced product-label statement, not a government measurement.
- Healthy Planet Canada's [Cuisine Soleil Organic Quinoa Flour 700 g listing](https://www.healthyplanetcanada.com/en/cuisine-soleil-organic-quinoa-flour-700g.html) also reproduces Nutrition Facts per 1/4 cup (30 g) and identifies the ingredient as organic quinoa flour. It does not show the MAPAQ GTIN, so it corroborates the brand, product name, package size, and stated serving but is not a UPC crosswalk or independent weighing.
- Cuisine Soleil's current [first-party quinoa-flour page](https://cuisinesoleil.com/en/product/quinoa-flour/) names a 100% organic quinoa flour and is available for shipping to Quebec and Ontario. It provides no household portion or volume-to-mass method. Its three-step all-purpose-blend guidance lists 15%–50% quinoa flour alongside a base flour and hemp or flax flour; that branded blend-building range is not a generic cup measure or a standalone replacement rule.

The sources support one product-label portion. They do not state the cup capacity, fill/packing method, flour moisture, a direct weighing procedure, or how the portion varies across brands and processing. Preserve the stated pair as observation evidence only. Do not derive density or a unit mapping from it, and do not treat the other flours' label or study values as corroboration for a generic quinoa-flour measure.

## Bilingual names, alias collisions, and picker projection

The current generic reference owns the exact displayed phrases `quinoa flour` and `farine de quinoa`, with no aliases. The product label's `Organic Quinoa Flour` and `Farine de Quinoa Biologique` wording remains brand/product evidence; no `organic` or `biologique` alias is proposed. It does not change the existing boundary between generic quinoa flour and the separately named roasted, white, red, and black flour rows.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds accents and uses complete word-phrase matches before substring fallback. With the current names and aliases:

| Query | Current result | R719 result |
|---|---|---|
| `quinoa flour` | Generic, roasted, black, red, and white quinoa-flour references | Same five rows |
| `farine de quinoa` | Generic, roasted, black, red, and white quinoa-flour references | Same five rows |
| `organic quinoa flour`; `farine de quinoa biologique` | No result | No result |
| `roasted quinoa flour`; `farine de quinoa torréfiée` | `ingredient-ref-roasted-quinoa-flour` | Same single row |

The two generic phrases produce five results because each full phrase occurs within multiple qualified flour names; this is existing picker behavior, not an exact alias ownership collision. R719 is ledger-only, so picker projection and recipe-entry behavior remain unchanged.

## Bundled recipe scan

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. A serialized-content and ingredient-row search for `ingredient-ref-quinoa-flour`, `quinoa flour`, and `farine de quinoa` found **no hits**. Recipe 016 uses cooked whole quinoa, not quinoa flour. No bundled recipe demand or link supports a recipe-line portion or substitution; no recipe changes are proposed.

## Proposed ledger delta

This schema-valid `Record` example contains only proposed R719 entries. At integration, append its sources, observation, and decision to the existing record; preserve `WP02-S25`, `WP02-S26`, and the prior decision. Update only `measurementState` to `researched_no_supported_value`. Leave substitution research `not_yet_researched` and all active catalog files unchanged.

```json
{
  "recordId": "ingredient-ref-quinoa-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S01",
      "url": "https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223789",
      "title": "Quebec Food Directory, Cuisine Soleil Organic Quinoa Flour, GTIN 851424000028",
      "versionOrDate": "Directory entry last updated 2026-03-09",
      "accessedOn": "2026-10-18",
      "locator": "Product identity, 700 g net content, GTIN, Nutrition Facts per 1/4 cup (30 g), serving-size declaration, and legal notice.",
      "supports": "The directory lists Cuisine Soleil Organic Quinoa Flour, GTIN 851424000028, as a 700 g organic stone-ground quinoa-flour product and reproduces Nutrition Facts per 1/4 cup (30 g) with a 30 g serving size. The quantity is a product-label statement, not a government measurement or a generic flour measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S02",
      "url": "https://www.healthyplanetcanada.com/en/cuisine-soleil-organic-quinoa-flour-700g.html",
      "title": "Healthy Planet Canada, Cuisine Soleil Organic Quinoa Flour 700 g",
      "accessedOn": "2026-10-18",
      "locator": "Product title, 700 g package, ingredient description, and reproduced Nutrition Facts panel.",
      "supports": "The retailer lists Cuisine Soleil Organic Quinoa Flour in a 700 g package, identifies organic quinoa flour as the ingredient, and reproduces Nutrition Facts per 1/4 cup (30 g). The listing does not show the MAPAQ GTIN or describe an independent weighing method.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S03",
      "url": "https://cuisinesoleil.com/en/product/quinoa-flour/",
      "title": "Cuisine Soleil, Quinoa Flour",
      "accessedOn": "2026-10-18",
      "locator": "Current product title, 100% organic ingredient description, shipping note, and three-step flour-blend guidance.",
      "supports": "The manufacturer currently markets a 100% organic quinoa flour and ships to Quebec and Ontario. Its blend-building guidance lists quinoa flour as one component at 15% to 50% alongside other flour and hemp or flax flour; it does not give a household portion or a generic replacement rule.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "quinoa-flour-cuisine-soleil-quarter-cup-30-g-r719-20261018",
      "relationship": "portion_weight",
      "value": 30,
      "valueUnit": "g",
      "foodDescription": "Cuisine Soleil Organic Quinoa Flour, 700 g product listed under GTIN 851424000028 by the Quebec Food Directory.",
      "foodState": "Dry, as sold; product-label serving.",
      "measurementMethod": "The Quebec Food Directory and a Canadian retailer reproduce Nutrition Facts per 1/4 cup (30 g); neither describes direct weighing or a fill method.",
      "quantityBasis": "One named Cuisine Soleil product-label serving only. Do not infer a transferable measure, default density, or standardized cup fill for generic quinoa flour.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Source-stated cup; capacity and fill method are unspecified."
      },
      "observedMassG": 30,
      "evidenceKind": "manufacturer_label",
      "sourceIds": [
        "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S01",
        "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S02"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Cuisine Soleil's 1/4 cup (30 g) serving as a product-specific portion observation on the generic quinoa-flour research row. The label does not support a transferable generic measure, density, cup mapping, or standardized fill. Preserve the active reference and leave substitution research unreviewed.",
      "sourceIds": [
        "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S01",
        "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S02",
        "WP02-A6-QUINOA-FLOUR-MEASURE-R719-20261018-S03"
      ]
    }
  ]
}
```

The observation does not activate `defaultDensity`, `unitMappings`, a package yield, or a runtime conversion. No `SubstitutionFinding` is proposed.

## Source ownership and uniqueness audit

| Source ID / owner | URL | Use and limit |
|---|---|---|
| **R719-S01, proposal-local** | Québec Food Directory, [Cuisine Soleil Organic Quinoa Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223789). | New R719 source ID for an exact current Québec product record and its reproduced label portion. The URL was mentioned in the prior R132 and R38 proposals as plain-flour boundary context but has no live ledger source owner; those proposal-local IDs were not integrated. |
| **R719-S02, proposal-local** | Healthy Planet Canada, [Cuisine Soleil Organic Quinoa Flour 700 g](https://www.healthyplanetcanada.com/en/cuisine-soleil-organic-quinoa-flour-700g.html). | Current retailer entry with matching brand, product name, package size, and reproduced 1/4-cup (30 g) panel. It does not show a GTIN or an independent measurement. |
| **R719-S03, proposal-local** | Cuisine Soleil, [Quinoa Flour](https://cuisinesoleil.com/en/product/quinoa-flour/). | First-party current product page supports the named 100% organic flour and its Quebec/Ontario market; the brand-specific blend guidance is not used as a reusable conversion or substitution. |
| `WP02-S25`, existing on target record | SATAU / Cuisine Soleil, current French product list. | Keep the existing identity wording source and ID. It does not support the 30 g portion. |
| `WP02-S26`, existing on target record | SATAU / Cuisine Soleil, bilingual portfolio. | Keep the existing product-name source and ID. It does not support the 30 g portion. |

The three R719 URLs and IDs were checked against the live ledger and current plan/roadmap/workflow. None of the new IDs is already allocated. The MAPAQ URL is cited in R132/R38 proposal archives only, not in a live ledger record. The observation ID is also new. All identifiers remain proposal-local.

## Review checks

- [x] Read the current `AGENTS.md`, measurement requirements, open A6 checklist, recent A6 roadmap/workflow progress, generic quinoa-flour reference and ledger, forms/rules/yields, and related identity/measurement proposals.
- [x] Verified the Québec Food Directory product sheet, current Cuisine Soleil product page, and a Canadian retailer's matching product/portion listing online; recorded each source's direct limits.
- [x] Audited bilingual display names, exact alias ownership, and the five-row bilingual flour search projection using `IngredientSearch.kt`; no alias or picker change proposed.
- [x] Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; no target ID or quinoa-flour name match was found.
- [x] Checked source URL and ID ownership. R719 identifiers remain proposal-local; no shared data changed.
- [x] No software tests, build, emulator, or deployment were run for this proposal-only evidence review.
