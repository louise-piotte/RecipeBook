# WP04 Proposal: Source-Specific Diced-Ham Cup Portion for Recipe 089

**Review date:** 2026-10-10

**Status:** The source-specific USDA portion was accepted in the research ledger. Recipe 089 applicability remains unresolved.

**Scope:** One uncovered WP04 portion observation for `089#1` and the existing `ingredient-ref-ham`. This is a measurement follow-up to the cured-pork identity review, not a new ham identity or a recipe correction.

## Disposition

Record USDA SR28's published **135 g per 1 cup diced** as one source-specific scalar `portion_weight` observation for the exact USDA food description `Pork, fresh, leg (ham), whole, separable lean only, cooked, roasted` (NDB 10011). Keep the observation ledger-only and preserve its cooked, roasted, lean-only food state.

Do **not** apply 135 g to RecipeBook's `089#1` line. The bundled line says `1 cup diced ham`, but its source is unavailable and the recipe directions then cook the ham. The archived import says the former quantity was `1/2 ham`; the bundle records that local normalization to one cup. Neither file establishes that the recipe's ham is USDA's fresh pork leg, lean only, cooked and roasted. Do not treat the 135 g portion as proof that `1/2 ham` equals `1 cup diced ham`.

**Integration is justified only for the narrowly qualified ledger observation.** The recipe quantity, ingredient link, active reference, default density, unit mappings, forms, package yields, and runtime remain unchanged. `measurementState: researched_supported` describes the accepted observation for that exact USDA item; it does not make the recipe line's measure match.

The ledger now records the 135 g / 1 cup diced observation under `ingredient-ref-ham`, with the USDA food description, cooked/roasted and lean-only state, and source-specific limitations preserved. It does not add a recipe-linked gram amount or runtime mapping. See the [integration record](../batches/wp04-ham-cup-portion-integration-20261010/README.md).

## Exact recipe demand and local evidence

The manifest-listed corpus has 114 recipes and 1,123 ingredient rows. A scan of every recipe file found exactly one row linked to `ingredient-ref-ham`:

| Row | Current bundled evidence | Source/import evidence | Finding |
|---|---|---|---|
| Recipe 089, `089#1`, ingredient ID `1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-1` | `originalText: "1 cup diced ham"`; `quantity: 1`; `unit: "cup"`; `preparation.en: "diced"`; linked to `ingredient-ref-ham`. The recipe's source URL is empty. Its instructions cut the ham and sauté it with the leek and mushrooms. | The [archived RecipeKeeper export](../../exported-recipe-lists/RecipeKeeper_20260320_143058/recipes/processed_089-quiche-au-jambon-et-champignons-mushroom-and-ham-quiche-1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee.json) has `sourceUrl: null`; its original fraction glyph did not survive in the saved ingredient line. The [bundled recipe note](../../../app/src/main/assets/seed/bundled-library/recipes/089-quiche-au-jambon-et-champignons-mushroom-and-ham-quiche-1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee.v1.json) states that the export originally listed `1/2 ham` and that this version normalizes it to `1 cup diced ham`. | The old quantity and the current quantity are different representations, and the export does not identify an accessible publisher page or a ham's size, cut, cured/smoked state, bone/refuse state, or edible basis. Treat the normalization as local recipe cleanup, not a sourced mass conversion. |

The [existing cured-pork review](wp04-section-o-cured-pork-boundaries-20261010.md) verified the broad `ham / jambon` identity from the Canadian hind-leg definition and deliberately added no measure. The separate [WP04 count/package residual](wp04-next-animal-food-count-residual-20261010.md) covers can-count cases, not this diced-cup portion. The recipe line is also outside the excluded egg, turkey, tuna, produce, butter, and fresh-herb packets.

## Source match and limits

USDA SR28 NDB 10011 reports the common measure **1 cup, diced = 135 g** for **Pork, fresh, leg (ham), whole, separable lean only, cooked, roasted**. It also reports 3 oz = 85 g for that same food. The table labels these as amounts in the edible portion of common measures. This is an exact published measure for that data record, not a range, sample-variability interval, generic ham density, or claim about another ham product. The record does not specify a cup filling/packing method or a variability range. Preserve the published scalar `135 g`; do not add an uncertainty interval or extra precision.

The current CFIA standard defines ham as an edible meat product from the hind leg of a dressed swine carcass; it separately defines `fresh` as not preserved or cooked and `preserved` to include cured and smoked products. Those definitions reinforce the need to keep food-state qualifiers visible. The USDA SR28 record's wording is preserved as printed; this proposal does not translate the USDA use of `fresh` into a Canadian regulatory classification or infer that Recipe 089 uses the same food.

The distinction is material to this line: its import description says only `ham`, and its method cooks the diced ingredient after the ingredient-list amount is stated. The recipe does not establish that its cup is already cooked roasted fresh pork leg, separable lean only. The source record therefore supports the ledger observation but **not** a recipe-specific conversion.

## Proposed ledger record fragment

If accepted, add one source entry and this scalar observation to the existing `ingredient-ref-ham` record. Retain the record's identity source and decision. Set `measurementState` to `researched_supported` for the recorded observation, while the decision text explicitly leaves Recipe 089 applicability unresolved.

```json
{
  "observationId": "wp04-ham-sr28-10011-cup-diced-20261010",
  "relationship": "portion_weight",
  "value": 135,
  "valueUnit": "g",
  "foodDescription": "Pork, fresh, leg (ham), whole, separable lean only, cooked, roasted (USDA SR28 NDB 10011)",
  "foodState": "USDA record describes fresh pork leg ham, separable lean only, cooked and roasted; not specified as cured, smoked, or deli ham.",
  "measurementMethod": "USDA SR28 common-measure table: Measure 1 = 135 g, 1 cup, diced; the table gives no filling or packing method.",
  "quantityBasis": "One source-published diced-cup measure for NDB 10011, reported as edible portion; retain the source unit 'cup' without asserting a capacity or fill method. Source-specific only and not matched to RecipeBook recipe 089.",
  "sourceQuantity": {"amount": 1, "unit": "cup"},
  "evidenceKind": "published_portion",
  "sourceIds": ["WP04-HAM-CUP-20261010-S01"]
}
```

The integration added source **WP04-HAM-CUP-20261010-S01** for USDA ARS, *USDA National Nutrient Database for Standard Reference, Release 28 (2015)*, NDB 10011, food group 10, common measures. It reuses the existing CFIA source ID `WP04-CURED-PORK-20261010-S02` for the Canadian identity/state boundary; no duplicate source entry was added.

This uses the ledger's existing scalar `MeasurementObservation` shape: `portion_weight`, positive `value` plus `valueUnit`, source quantity, exact food description/state, method, basis, evidence kind, and resolvable source IDs. Keep `valueIntervals` absent. The measure is a portion, not a count weight, package yield, cooking yield, edible-portion yield, or mass-volume density.

## Integration boundary and validation plan

- Keep `ingredient-ref-ham` as the existing generic identity. Add no `fresh ham`, deli ham, cured ham, smoked ham, or cooked-ham reference/form from this portion alone.
- Keep the measurement observation only in `docs/catalog/research-ledger.v1.json`. Do not add `defaultDensity`, `unitMappings`, an active conversion, recipe-linked weight, or a package-yield record.
- Keep Recipe 089's current text, quantity, preparation, and reference link unchanged. Do not reconstruct the original fraction from the damaged export, interpret `1/2 ham` as a half-package, or infer bone/refuse or cooked yield.
- The current [research-ledger schema](../research-ledger.schema.json) already supports scalar `portion_weight` observations. The ledger is a sidecar, not the full-library ZIP format. The app has no `MeasurementObservation` DTO or mapper; its [`PackageYieldObservationDto`](../../../app/src/main/java/app/recipebook/data/schema/SchemaDtos.kt) and package-yield round-trip fixture are for a different relation and should not be repurposed. No full-library DTO, mapper, ZIP part, schema version, or compatibility shim is needed.
- The sidecar integration is validated with the existing ledger/package validator and Python coverage asserting that the source ID resolves, the scalar portion remains source-qualified, and Recipe 089 remains unchanged. No Kotlin round-trip test is needed for this research-ledger-only observation.

## Sources and access

| ID | Source | Evidence and limit |
|---|---|---|
| **WP04-HAM-CUP-20261010-S01** | USDA Agricultural Research Service, [Standard Reference Release 28, Pork Products report (PDF)](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg10.pdf#page=452). | NDB 10011, PDF p. 452, Food Group 10. Names the exact fresh whole pork leg (ham), separable lean only, cooked, roasted record and gives `135 g: 1 cup, diced` and `85 g: 3 oz`. Supports one scalar published portion for that record; it does not identify the Recipe 089 product or its pre-cooking state. Opened 2026-10-10. |
| **WP04-CURED-PORK-20261010-S02** *(existing source ID)* | CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7). | Definitions for `ham`, `fresh`, and `preserved`; product-boundary evidence only, no measure. The current page says last amended 2024-12-18. Opened 2026-10-10. |

**Source-access limit:** The publisher/source page for this imported recipe could not be checked because the archived export has `sourceUrl: null` and the bundled recipe has an empty source URL. Exact-title and ingredient-phrase web searches did not identify a matching publisher version. The local export and bundle are evidence of the stored line and its cleanup note only. The direct official USDA and CFIA sources above were accessible; no source weight is asserted for the recipe's unspecified ham.

## Review boundary

The review checked the WP04 open checklist, existing WP04 proposal inventory, the full manifest-listed recipe corpus, recipe 089 and its archived RecipeKeeper export, the live ham reference and ledger record, the measurement-observation schema, the relevant DTO/mapper/test surface, and the current USDA and CFIA source pages. The corpus scan found one ham-reference recipe line. No tests were run and no files other than this proposal were edited.
