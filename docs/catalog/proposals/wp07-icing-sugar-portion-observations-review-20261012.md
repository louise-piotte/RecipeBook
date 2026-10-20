# WP07 icing-sugar portion observations review (2026-10-12)

## Review disposition

- **Target:** Existing `ingredient-ref-icing-sugar` (`icing sugar / sucre à glacer`).
- **Decision:** Record nine source-specific portion observations in the research ledger. Keep measurement research `blocked_pending_evidence`, `defaultDensity` null, `unitMappings` empty, and substitution research `not_yet_researched`.
- **Scope:** King Arthur Baking's unsifted cup chart entry; Health Canada CNF 2015 Food Code 4319's sifted, unsifted, and unqualified metric measures; and Health Canada's 2008 Table 15 5 ml entry.
- **Limits:** Do not average, scale, infer a cup convention, derive density, map a source unit to an app unit, or link an observation to a recipe line. Sifted/unsifted labels remain source-specific. The matching CNF 2026 food and measure rows were not retrieved; the current dataset access failure is not evidence that those rows are absent.

## Live catalog and recipe audit

The live reference is `ingredient-ref-icing-sugar`, with English aliases `confectioners' sugar`, `confectionery sugar`, and `powdered sugar`; its French display is `sucre à glacer`. Its active density is null and it has no unit mappings. The ledger record had no sources or portion observations before this review, and its measurement state was blocked. The current bundle has 30 linked icing-sugar lines across 26 recipes. No recipe row, amount, unit, or reference link is changed.

The comparison is source-qualified rather than a conversion table:

| Source food description | Published measure | Published mass | Treatment |
|---|---:|---:|---|
| King Arthur Baking, `Confectioners' sugar (unsifted)` | 1 cup | 113 g | Unsifted chart portion; cup capacity and row-specific fill method unspecified. |
| Health Canada CNF 2015, Food Code 4319, unsifted | 100 ml | 50.7 g | Source metric portion; no sifting/filling procedure. |
| Same CNF record, unsifted | 125 ml | 63.4 g | Separate published portion; no interpolation. |
| Same CNF record, unsifted | 250 ml | 126.8 g | Separate published portion; no interpolation. |
| Same CNF record, sifted | 100 ml | 42.3 g | Sifted source portion; no filling procedure. |
| Same CNF record, sifted | 125 ml | 52.8 g | Separate published portion; no interpolation. |
| Same CNF record, sifted | 250 ml | 105.7 g | Separate published portion; no interpolation. |
| Same CNF record, unqualified | 5 ml | 2.5 g | No sifted state or fill procedure stated; not an app teaspoon mapping. |
| Health Canada 2008 Table 15, unqualified | 5 ml | 3 g | Retained separately from CNF 2015; no sifting state or filling procedure. |

The sources publish different 5 ml weights and different sifted/unsifted volume weights. These are not averaged or used to infer a physical density. The King Arthur cup is not converted to millilitres because its cup system is unspecified.

## Ledger disposition

Added three source records and nine `portion_weight` observations to the existing ledger record. One accepted decision records the source observations; one unresolved decision keeps runtime measurement behavior blocked. Each observation cites only its source and preserves the published amount and unit. No form, package yield, substitution, conversion, recipe link, or active mapping was added.

The CNF page identifies itself as Food Code 4319, `Sweets, sugars, icing (powdered) / Confiseries, sucre à glacer`, and publishes the source measures together. Its page date is 2019-03-01 and it is the CNF 2015 online publication. Health Canada's 2008 table gives a separate 5 ml value. The 2026 Canadian Nutrient File public download listing was reachable in search, but the dataset resource did not open through the available route (403); the exact icing-sugar food and measure rows remain unverified.

## Sources

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP07-ICING-SUGAR-20261012-S01` | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), accessed 2026-10-12. | `Confectioners' sugar (unsifted)`: 1 cup = 4 oz = 113 g. No cup capacity, brand, or row-specific filling method. |
| `WP07-ICING-SUGAR-20261012-S02` | Health Canada, [Canadian Nutrient File serving portions, Food Code 4319](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4319), CNF 2015 online publication; accessed 2026-10-12; page modified 2019-03-01. | Publishes 5 ml = 2.5 g; unsifted 100/125/250 ml = 50.7/63.4/126.8 g; sifted 100/125/250 ml = 42.3/52.8/105.7 g. It does not state sifting/filling procedures. |
| `WP07-ICING-SUGAR-20261012-S03` | Health Canada, [Nutrient Value of Some Common Foods (2008), Table 15: Sweets and Sugars](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-15-sweets-sugars-nutrient-value-some-common-foods-2008.html), accessed 2026-10-12. | `Icing sugar (powdered)`, 5 ml = 3 g. No sifted state or filling procedure. |
| Access note | Health Canada, [Canadian Nutrient File, 2026 public dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=2), dataset listing accessed 2026-10-12. | The public listing identifies a 2026 data package, but the dataset route returned 403 during this review. No absence claim is made for Food Code 4319 or a successor row. |

## Static verification

- Confirmed no prior sources, measurement observations, or source-ID collisions on the icing-sugar ledger record.
- Checked the live reference, all 30 linked lines across 26 recipes, and the 114-file/1,123-row bundle; no recipe links or rows changed.
- The ledger validates with 1,618 records and no errors. Package and generated-index data are unchanged by this ledger-only evidence update.
- Checked proposal and integration note as UTF-8 without BOM, with no mojibake markers or trailing whitespace; scoped diff whitespace check passed.
- No app tests or emulator checks were run because this adds only database JSON evidence and documentation.
