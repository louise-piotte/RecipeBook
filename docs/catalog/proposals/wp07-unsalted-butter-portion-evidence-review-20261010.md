# WP07 unsalted-butter portion evidence review — 2026-10-10

**Status:** Integrated as source-qualified ledger observations; no runtime density or unit mapping.

## Disposition

The Canadian Nutrient File (CNF) entry for **Butter, unsalted** (Food code 92) publishes serving
equivalences of 15 mL = 14.4 g, 100 mL = 95.9 g, 250 mL = 239.9 g, and 1 stick = 113.5 g. Record
these values as source-specific `portion_weight` observations. The serving-size page does not state
how the portions were measured or establish that the millilitre values are a laboratory density.
The stick entry also does not define a globally portable “stick” unit.

Do not set `defaultDensity` or add an active unit mapping. Canada's 250 mL cooking cup differs from
the app's current `cup` unit (236.5882 mL). The source observations remain useful evidence, but the
active model cannot label a unit mapping with that Canadian cup convention or the CNF portion
method. Do not derive and activate a g/mL value by treating these serving equivalents as a physical
density. Runtime mass-volume conversion therefore remains unavailable for this identity.

## Current-state audit

- Canonical row: `ingredient-ref-unsalted-butter`, `unsalted butter / beurre non salé`, category
  `FAT_AND_OIL`; no active density or unit mappings.
- The 114 manifest-listed recipes contain 68 linked lines using this identity. That frequency makes
  it a useful measurement-research target, but recipe demand is not measurement evidence.
- The ledger had no source or numeric observation for this record. Its prior unresolved decision
  about removing unsupported draft numeric values remains in place.
- `units.v1.json` defines `cup` as 236.5882 mL. Health Canada's cooking guide identifies 250 mL as
  one Canadian cup; do not equate those unit conventions.

## Ledger update

Set `measurementState` to `researched_supported` for the four published CNF portions, with
`evidenceKind: published_portion`, exact source quantities, the Food code in `foodDescription`, and
the missing method noted in `quantityBasis`. Keep the observations source-qualified and inactive in
the bundled ingredient row. Do not change `substitutionResearchState`, which remains
`existing_rule_needs_review`.

| Observation | Published source quantity | Published mass | Limits |
|---|---:|---:|---|
| `unsalted-butter-cnf-15ml` | 15 mL | 14.4 g | CNF portion equivalence; method unspecified. |
| `unsalted-butter-cnf-100ml` | 100 mL | 95.9 g | CNF portion equivalence; not labeled as a measured density. |
| `unsalted-butter-cnf-250ml` | 250 mL | 239.9 g | CNF portion equivalence; not an app `cup` mapping. |
| `unsalted-butter-cnf-stick` | 1 CNF “stick” | 113.5 g | Retain as a source-defined count portion only. |

## Sources

| ID | Source | Supports |
|---|---|---|
| `WP07-BUTTER-CNF-20261010-S01` | Health Canada, [Canadian Nutrient File serving portion: Butter, unsalted, Food code 92](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=92) | The four published portion equivalences above. The page does not state preparation, temperature, or measuring method. |
| `WP07-BUTTER-HC-MEASURE-20261010-S02` | Health Canada, [Measure ingredients like a pro](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/measure-ingredients-pro.html) | Defines 250 mL as one cup in its Canadian household-measure table; it does not define butter mass. |
| `WP07-BUTTER-KAB-IWC-20261010-S03` | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) | Lists butter as 8 tablespoons (1/2 cup), 4 oz, 113 g. The chart does not qualify salted state or state cup capacity, so this is corroborative context only and is not used as an unsalted-butter mapping. |

## Acceptance checks

- The CNF quantities are stored as distinct `portion_weight` observations; no value is averaged or
  relabeled as physical density.
- No seed density, unit mapping, rule, recipe link, or substitution is changed.
- Ledger validation and bundled-package validation pass; the existing generated Kotlin catalog
  remains current.

