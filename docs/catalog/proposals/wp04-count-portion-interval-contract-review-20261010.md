# WP04 Proposal: Count and Portion Interval Contract

**Review date:** 2026-10-10
**Status:** Integrated on 2026-10-10. The schema, validator, tuna ledger record, workflow documentation, and Python coverage are in place; package and Pixel verification are recorded in [`catalog-residual-boundaries-integration-20261010`](../batches/catalog-residual-boundaries-integration-20261010/README.md). This file remains the contract decision record.
**Scope:** Define an in-v1, source-preserving representation for interval-valued measurement observations before promoting range evidence, centered on recipe `111#1` (tuna steak). Keep recipe count ranges, scalar count portions, and package quantities distinguishable.

## Recommendation

Evolve the research-ledger v1 `MeasurementObservation` shape so a measurement result is exactly one of:

- the current scalar pair, `value` plus `valueUnit`; or
- a non-empty `valueIntervals` array whose entries each carry their own bounds, unit, endpoint flags, interval meaning, and source text.

Keep existing scalar observations in their present shape. Do not translate scalar source portions into intervals, select a midpoint from a range, or normalize co-reported units into a conversion. Keep evidence in the existing research ledger; this does not create an active unit mapping, density, package yield, recipe edit, or runtime conversion.

For recipe `111#1`, store the Anova page's `10-12oz.` and `280-320g` as two source-reported mass intervals in the same `count_weight` observation for one steak. They are two printed ranges for the same per-steak amount, not an equivalence calculation. Keep the source's thickness, count basis, and unstated edible/as-purchased and skin/bone qualifiers explicit.

## Evidence and current limitations

The live bundled recipe [`111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json`](../../../app/src/main/assets/seed/bundled-library/recipes/111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json) stores line `b699f193-4545-4e7a-98ad-ce092a1e38e4-ingredient-1` as `1 tuna steak`, quantity `1`, unit `count`, linked to `ingredient-ref-tuna`. Its `source.sourceUrl` is Anova's [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna) page.

The original source page is accessible. Its “Ingredients for 4” list says: “2 tuna steaks (about 1 1/2 to 2 inches thick; 10-12oz. / 280-320g each).” The per-piece `each` qualifier means the source's four-serving yield does not need to be scaled to derive the interval for one steak. The page lists the ingredient before sous-vide cooking and searing. It does not name a tuna species, trimming state, skin/bone status, or whether the listed amount is edible or as-purchased mass. Accessed 2026-10-10. [Anova Culinary, *Sous Vide Tuna*](https://recipes.anovaculinary.com/recipe/sous-vide-tuna).

At the review snapshot, the [`MeasurementObservation` schema](../../../docs/catalog/research-ledger.schema.json) required one positive `value` and one `valueUnit`, and the tuna record had no source or observation. The schema and validator now accept preserved intervals; the [`ingredient-ref-tuna` record](../../../docs/catalog/research-ledger.v1.json) now records the Anova source, accepted decision, and two source-reported intervals. Its measurement state is `researched_supported`; identity remains `unreviewed`, and the unrelated [animal-food/package residual](wp04-next-animal-food-count-residual-20261010.md) still excludes this line by scope.

At the review snapshot, the ledger contained 33 scalar `count_weight` observations. It now retains those scalars and the separate tuna interval. The app does not define a `MeasurementObservation` DTO, domain model, or mapper. These observations remain in the sidecar research ledger, whose JSON Schema is validated in `tools/seed_package/bundled_seed_package.py`. The app's `PackageYieldObservation` DTO/domain model is a separate full-library surface for product/package-specific scalar yields; it cannot represent or replace this tuna portion interval. See [`SchemaDtos.kt`](../../../app/src/main/java/app/recipebook/data/schema/SchemaDtos.kt), [`SchemaMappers.kt`](../../../app/src/main/java/app/recipebook/data/schema/SchemaMappers.kt), [`SchemaRoundTripTest.kt`](../../../app/src/test/java/app/recipebook/data/schema/SchemaRoundTripTest.kt), and [`data.schema DESIGN.md`](../../../app/src/main/java/app/recipebook/data/schema/DESIGN.md).

The [roadmap](../../../roadmap.md) and integration report record the interval implementation alongside the source-specific scalar garlic, leek, and drained-cherry portions. Basil and rosemary count lines remain held.

## Implemented v1 shape

Keep scalar records unchanged. For an interval result, omit both `value` and `valueUnit` and supply `valueIntervals`. The JSON Schema enforces the scalar-versus-interval choice with `oneOf`; a record with both shapes or neither shape is invalid. This is an in-place v1 contract extension for draft research data, not a version bump or a compatibility layer.

Each `valueIntervals` item has:

| Field | Contract |
| --- | --- |
| `lowerValue`, `upperValue` | Positive finite numbers, with `lowerValue < upperValue`. |
| `unit` | Unit for these endpoints; each co-reported range has its own unit. |
| `lowerInclusive`, `upperInclusive` | Required booleans or `null`. `null` means the source does not define endpoint inclusion; it does not mean the endpoint is excluded. |
| `intervalKind` | Required enum that distinguishes `source_reported_range`, `observed_sample_range`, `confidence_interval`, `measurement_uncertainty`, and `estimate_range`. Never infer one kind from another. |
| `origin` | Required `source_reported`, `measured`, or `derived` value. A `source_reported` interval requires non-empty `reportedText`; a `derived` interval requires the observation's calculation provenance. |
| `reportedText` | Exact source token string, including dash, spacing, decimal notation, and any qualifier that applies to that interval. It preserves precision the JSON number cannot express. |
| `unitConvention` | Optional unless the unit is ambiguous. An `oz` mass observation must explicitly say mass ounce/avoirdupois; it must not mean `fl oz`. |

Retain the existing observation fields for `relationship`, `sourceQuantity`, `foodDescription`, `foodState`, `measurementMethod`, `quantityBasis`, `evidenceKind`, `calculation`, and `sourceIds`. For a new interval-valued `count_weight`, require `sourceQuantity` plus non-empty food-state, method, and basis descriptions. State unknown qualifiers explicitly in these descriptions; do not fill unknowns with inferred defaults. `sourceIds` must point to source entries in the same ledger record.

Scalar observations remain as they are now. For example, the accepted maraschino observation remains `value: 5.0`, `valueUnit: "g"`, `sourceQuantity: {"amount": 1, "unit": "cherry"}`. It is one USDA SR28 published portion, not an interval or an item-to-gram runtime mapping. Other source-specific scalar portions likewise remain separate records; differing observations from different sources must not be merged into a fabricated range.

## Exact tuna observation in the ledger

The following observation is now recorded on `ingredient-ref-tuna`. It makes the measurement evidence `researched_supported`, with no active reference density or unit mapping.

```json
{
  "observationId": "wp04-tuna-steak-anova-recipe-111-count-interval",
  "relationship": "count_weight",
  "sourceQuantity": {"amount": 1, "unit": "tuna steak"},
  "valueIntervals": [
    {
      "lowerValue": 10,
      "upperValue": 12,
      "unit": "oz",
      "unitConvention": "avoirdupois mass ounce; not fluid ounce",
      "lowerInclusive": null,
      "upperInclusive": null,
      "intervalKind": "source_reported_range",
      "origin": "source_reported",
      "reportedText": "10-12oz."
    },
    {
      "lowerValue": 280,
      "upperValue": 320,
      "unit": "g",
      "lowerInclusive": null,
      "upperInclusive": null,
      "intervalKind": "source_reported_range",
      "origin": "source_reported",
      "reportedText": "280-320g"
    }
  ],
  "foodDescription": "Tuna steaks, about 1 1/2 to 2 inches thick",
  "foodState": "Listed before sous-vide cooking and searing; species, trim, skin/bone state, and edible-versus-as-purchased basis are not stated.",
  "measurementMethod": "Anova recipe ingredient list for four; two steaks are each assigned the printed weight interval.",
  "quantityBasis": "Per one steak, as stated by 'each'; not a per-serving total or a cooking-yield measure.",
  "evidenceKind": "published_portion",
  "sourceIds": ["WP04-TUNA-COUNT-20261010-S01"]
}
```

The two intervals stay as printed, independently, in their source units. Do not calculate a grams interval from the ounce interval, treat the pair as a mass conversion, average endpoints, or emit a nominal `300 g`/`11 oz` scalar. The source does not publish a statistical sample range or confidence interval, so `source_reported_range` records only that the publisher gave a range. The source does not specify endpoint semantics, so the example preserves that as `null` rather than asserting closed bounds.

## Related count and edible-portion cases

The interval contract must not blur these nearby cases:

| Case | Evidence and disposition |
| --- | --- |
| `028#7` maraschino cherries | USDA SR28 NDB 09328 publishes one canned, drained cherry at 5.0 g. The exact recipe line asks for 16 cherries, drained and chopped. Preserve the accepted source observation as a scalar one-cherry `count_weight`; do not compute the recipe total or create a variability interval. |
| `067#8` maraschino cherries | The recipe requests 18 cherries but does not say drained. Keep it unsupported: the drained scalar portion does not establish the unspecified-drainage portion. See the [maraschino review](wp04-maraschino-cherry-count-portion-review-20261010.md). |
| `021#2` rosemary sprigs | Source text says `4 to 5 rosemary sprigs`, while the stored recipe quantity is `4` count. That is an interval in the requested ingredient count, not a mass interval. The reviewed SR28 source has no sprig weight, so create no `count_weight` observation; keep it held as described in the [fresh-herb review](wp04-fresh-herb-count-portion-review-20261010.md). |
| `015#4` beef broth; `081#12` cream of coconut | These are package counts, not count-to-edible-mass findings. The family source for beef broth gives no can size. The cream-of-coconut recipe already retains a source-specific `15 oz can` description but no net edible mass. Do not use `valueIntervals` or `PackageYieldObservation` to invent contents or drained/edible yield. See the [WP04 package residual](wp04-next-animal-food-count-residual-20261010.md). |

This distinction follows the plan's Section 07 requirement to keep count weight, package yield, edible-portion yield, and density separate. It also preserves the Section 10 rule that conflicts and source-specific portions stay traceable and that practical uncertainty must not be represented with false precision. `Requirements.md` FR-5 independently says counts should not auto-convert unless explicitly mapped.

## Integrated change set

The coordinated implementation is:

1. **Ledger schema:** `research-ledger.schema.json` now defines observed intervals and enforces the scalar/interval choice, positive ordered bounds, endpoint semantics, source text, unit, and interval kind/origin. Interval `count_weight` observations require item basis and explicit qualifiers.
2. **Ledger entry:** The source and accepted decision are recorded on `ingredient-ref-tuna`, along with the one-steak observation. The recipe, active ingredient-reference data, package-yield part, unit conversions, densities, substitutions, and runtime are unchanged.
3. **Validator and Python coverage:** `validate_research_ledger()` validates ordered finite bounds, mass units for count-weight intervals, avoirdupois qualification for `oz`, source IDs, source text and calculation provenance, and scalar/interval exclusivity. The 33-test Python package suite passed.
4. **Kotlin DTOs and mappers:** No `MeasurementObservation` DTO, domain class, or mapper exists because the research ledger is a separate evidence sidecar. No app schema DTO or round-trip test was changed. If app import/export later needs these observations, add a typed model and explicit mappers together with a full-library v1 schema/ZIP-part update and Kotlin fixtures; keep the manifest-plus-parts ZIP as the only full-library interchange format.
5. **Docs/design:** The catalog workflow and root architecture notes describe scalar-versus-interval evidence and clarify that the ledger does not activate runtime conversions. No v2 schema, data migration, startup migration, or compatibility shim was added.

## Acceptance criteria

- The ledger JSON Schema accepts the exact tuna interval record and every existing scalar observation.
- A range preserves each source interval and unit, endpoint inclusivity or explicit unknown state, source wording/precision, count basis, preparation qualifiers, and source citation.
- No midpoint, endpoint selection, conversion factor, density, edible yield, or species/cut inference is created.
- Scalar source portions stay scalar and distinct across source/product/state differences.
- Recipe count ranges and package-size declarations do not become measurement intervals.
- Schema, validator, data, relevant tests, docs, and any future DTO/mapper surface stay aligned under v1 without introducing a parallel full-library format.

## References and access

- Anova Culinary, [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna), “Ingredients for 4,” tuna-steak line. Direct source opened and read on 2026-10-10.
- Local source mapping: [bundled recipe 111](../../../app/src/main/assets/seed/bundled-library/recipes/111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json).
- Current measurement and schema rules: [global ingredient catalog plan, Section 07](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt), [Section 10](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt), [Section 13](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt), [Requirements.md FR-5](../../../Requirements.md).
- Current adjacent source reviews: [WP04 tuna proposal](wp04-next-animal-food-or-count-residual-20261010.md), [WP04 animal-food/package residual](wp04-next-animal-food-count-residual-20261010.md), [WP04 maraschino portion review](wp04-maraschino-cherry-count-portion-review-20261010.md), and [WP04 fresh-herb portion review](wp04-fresh-herb-count-portion-review-20261010.md).
