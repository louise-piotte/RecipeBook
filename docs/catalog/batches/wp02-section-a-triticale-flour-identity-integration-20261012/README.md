# WP02 Section A triticale-flour identity integration

Integrated 2026-10-12 after the bounded review in [the proposal](../../proposals/wp02-section-a-triticale-flour-identity-review-20261012.md).

## Change

- Added `ingredient-ref-triticale-flour` as `triticale flour / farine de triticale` in `FLOUR_AND_STARCH`.
- Kept both alias arrays empty, `defaultDensity` null, and `unitMappings` empty.
- Added one ledger record with four source entries and an accepted identity decision. No measurement observations, substitution findings, forms, conversions, yields, legacy candidates, recipe links, or recipe edits were added.
- Kept the row distinct from `ingredient-ref-triticale-grain` and `ingredient-ref-triticale-flakes`. The A7 triticale-meal candidate remains unresolved.

## Evidence

- [OQLF, farine de triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497480/farine-de-triticale) gives the preferred Québec French term and English translation `triticale flour`.
- [Usito, triticale](https://usito.usherbrooke.ca/d%C3%A9finitions/triticale) defines the cereal as a wheat–rye hybrid and includes its grains and extracted flour in a metonymic sense.
- [Government of Saskatchewan, Triticale: Production and Use](https://www.saskatchewan.ca/business/agriculture-natural-resources-and-industry/agribusiness-farmers-and-ranchers/crops-and-irrigation/field-crops/cereals-barley-wheat-oats-triticale/triticale-production-and-use) describes the flour as whole-grain and used in health-food products, and reports that the food market is poorly developed. The general whole-grain description was not promoted to a catalog attribute or alias.
- [Statistics Canada, Monthly Millers Survey, 2024](https://www23.statcan.gc.ca/imdb/p3Instr_f.pl?Function=assembleInstr&Item_Id=1530723) lists triticale flour production and stocks under human-consumption milling products. The archived survey is not evidence of current production volume, retail availability, or kitchen measures.

## Picker and corpus boundary

The pre-integration audit found no owner or picker result for `triticale flour` or `farine de triticale`; bare `triticale` returned the existing grain and flakes rows. After integration, each complete proposed display returns only `ingredient-ref-triticale-flour`; bare `triticale` returns the grain, flakes, and flour rows. The new row has no aliases, so it does not claim bare `triticale`.

The post-integration scan covers all 114 manifest-listed recipe files and 1,123 ingredient rows. It found no triticale wording or link to the new ID. No recipe changed.

## Static verification

- `python3 -B tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — passed.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check` — passed.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- Research-ledger JSON Schema validation — passed; the four new source IDs are unique and attached to this record.
- Exact ownership, picker-boundary, full recipe-corpus, UTF-8/no-BOM, escaped-JSON, and scoped whitespace checks — passed.

No app tests or emulator checks were run because the change only adds database JSON data under `AGENTS.md`.

## Post-integration snapshot

| Surface | State | Bytes | SHA-256 / digest |
|---|---:|---:|---|
| Ingredient references | 1,271 | 406,998 | `e816b31e04190a7ecba3dbf4a26c185734994d7ca37cf0cd2b8f700d08a636ef` |
| Ingredient forms | 94 | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy-import candidates | 65 | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,579 records; 5,585 source entries; 4,621 distinct source IDs; 8 conversions | 5,461,043 | `44982093e310a53c60ea398bfda92d9380132209f99915c1a01ad233b1696330` |
| Seed manifest | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,271 references | 557,085 | `29002e10a34450d85d11d1136c63dc32a8fc9b68bdb244613bc59a4c025d742b` |
