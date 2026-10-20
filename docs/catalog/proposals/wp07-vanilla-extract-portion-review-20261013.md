# WP07 vanilla-extract published-portion review

- **Status:** Root-reviewed and integrated as one ledger-only measurement observation.
- **Scope:** USDA SR28 NDB 02050, `Vanilla extract`, and the existing `ingredient-ref-vanilla-extract` measurement record.
- **Disposition:** Record the source's 1 teaspoon = 4.2 g as a dated, source-specific `portion_weight` observation. Do not activate a default density, unit mapping, mass-volume conversion, recipe-line conversion, form, or substitution.

## Evidence and limits

The USDA National Nutrient Database for Standard Reference, Release 28, publishes a `Vanilla extract` row under NDB 02050 with a measure of `1.0 tsp` and weight of `4.2 g` in its EPA-content table. The row supports that single published portion for that exact food-code description. It does not state a volume in millilitres, a teaspoon convention, a direct density, a preparation or fill method, or a formula applicable to every standardized vanilla extract, essence, or flavour preparation. The record therefore remains a portion observation rather than a reusable conversion.

The source is the USDA SR28 release hosted by the U.S. National Institutes of Health Office of Dietary Supplements: [USDA National Nutrient Database for Standard Reference, Release 28 — EPA Content](https://ods.od.nih.gov/pubs/usdandb/EPA-Content.pdf). The table's vanilla-extract row is NDB 02050; nearby imitation extracts have separate NDB codes and are not included in this observation. Accessed 2026-10-13.

## Exact ledger observation

```json
{
  "observationId": "ingredient-ref-vanilla-extract-usda-sr28-ndb02050-tsp",
  "relationship": "portion_weight",
  "value": 4.2,
  "valueUnit": "g",
  "foodDescription": "Vanilla extract (USDA SR28 NDB 02050).",
  "foodState": "Vanilla extract; no further form or preparation specified in the source row.",
  "quantityBasis": "Published portion for USDA SR28 food code 02050 only; not a general density, volume conversion, or universal extract value.",
  "evidenceKind": "published_portion",
  "sourceIds": ["WP07-VANILLA-EXTRACT-20261013-S01"],
  "observedMassG": 4.2,
  "sourceQuantity": {"amount": 1, "unit": "tsp"}
}
```

No `observedVolumeMl` is added because the source row gives `tsp`, not a volume or convention. The observation is not promoted to `ingredient-references.v1.json`; `defaultDensity` remains null and `unitMappings` remains empty.

## Recipe and catalog checks

The manifest-listed seed contains 114 recipe files and 1,123 ingredient rows. The existing vanilla-extract reference is already linked from 53 rows across 46 recipes; no new reference or recipe link is required. Those recipe rows contain teaspoon and millilitre quantities, but the SR28 observation does not establish a transferable conversion for either unit. Recipe text and quantities remain unchanged.

The ledger's substitution state remains `researched_no_supported_substitute`. This review found no substitution evidence and changes no form, conversion, yield, recipe, or active catalog field.

## Source ledger entry

| Source ID | Source and locator | Supported claim and limitation |
|---|---|---|
| `WP07-VANILLA-EXTRACT-20261013-S01` | USDA National Nutrient Database for Standard Reference Release 28, [EPA Content PDF](https://ods.od.nih.gov/pubs/usdandb/EPA-Content.pdf), NDB 02050 row in the `Per Measure` table. | `Vanilla extract`: 4.2 g per 1.0 tsp. This is one source-specific published portion; it does not state mL, teaspoon convention, method, generic density, or applicability to other extract products. |

