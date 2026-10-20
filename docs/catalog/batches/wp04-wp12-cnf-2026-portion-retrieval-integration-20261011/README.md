# WP04/WP12 CNF 2026 Count Portion Retrieval Integration

## Result

The official Health Canada CNF 2026 relational CSVs were retrieved and joined for all five count portions carried forward from the interim 2015 review. Each result is recorded as a source-specific ledger observation; no general count conversion is active.

| Ingredient | CNF 2026 food row | Exact measure | Mass | Refuse qualifier |
| --- | --- | --- | ---: | --- |
| Raw garlic | 2394, *Allium sativum*, USDA NDB 11215 | 482, `1 clove` / `1 gousse` | 3 g | 13%; total refuse, including knob and skin |
| Raw onion | 2401, *Allium cepa*, USDA NDB 11282 | 139, `1 large` / `1 gros` | 150 g | 10%; total refuse |
| Raw carrot | 2380, *Daucus carota*, USDA NDB 11124 | 1244, `1 small (14cm long)` / `1 petit (14cm long)` | 50 g | 11%; total refuse |
| Raw leek | 2396, *Allium ampeloprasum*, USDA NDB 11246; bulb and lower-leaf portion | 149, `1 leek` / `1 poireau` | 89 g | 56%; tops, root ends and skin |
| Red-ripe raw tomato, year-round average | 2460, *Solanum lycopersicum*, USDA NDB 11529 | 1298, `1 large whole (7.6cm dia)` / `1 gros entier (7.6cm dia)` | 182 g | 9%; total refuse |

The source rows use Measure Type code 6 (`User-defined`). Each count tuple was checked in `measure_weight_conversion.csv`, then joined to the bilingual Food Name, Measure Name, and Measure Type rows using the published codes. The listed refuse percentages come from separate type 3 (`Refuse`) rows. They are recorded as qualifiers and are not added to the count weights.

## Scope

- Garlic and leek observations corroborate their earlier USDA food-composition observations.
- CNF's large raw onion observation (150 g) remains distinct from USDA ERS's medium onion assumption (110 g, 2½-inch diameter, edible/as-purchased basis unresolved).
- The small-carrot observation is explicitly 14 cm long. The recipe only says “small,” so 50 g is not assigned to that recipe line.
- The tomato observation is explicitly 7.6 cm in diameter. The recipe only says “large,” with no diameter or cultivar, so 182 g is not assigned to that recipe line. This CNF 2026 row is for red-ripe raw year-round average tomato, separate from the USDA SR28 green-tomato record.
- The leek food description names its bulb/lower-leaf portion. Its 89 g observation is not a whole untrimmed leek mass.
- No recipe wording, recipe quantity, ingredient link, seed reference, form, density, unit mapping, conversion, yield, or substitution changed.

The earlier [retrieval proposal](../../proposals/wp04-wp12-cnf-2026-portion-retrieval-check-20261010.md) retains the original failed-access audit and now includes the successful follow-up addendum.

## Primary files and fingerprints

Official [Health Canada CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109):

- [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) — SHA-256 `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c`
- [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) — SHA-256 `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f`
- [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) — SHA-256 `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977`
- [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) — SHA-256 `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f`

## Validation

The 53 Python seed-package tests passed, including the updated scoped-evidence regression test. Seed-package validation and normalization, ingredient-reference normalization, generated-index freshness, and research-ledger validation passed. The ledger contains 1,138 records, 2,864 source entries, 2,273 distinct source IDs, and 178 measurement observations with zero schema errors. Focused `git diff --check` and UTF-8/no-BOM/mojibake checks passed.

This batch changes the research ledger and its Python regression assertions only; the bundled seed package and generated Android ingredient catalog are unchanged. No app deployment or emulator UI check was needed for these observations.
