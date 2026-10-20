# WP03 Section F — glutinous-rice alias integration (2026-10-12)

## Decision

Added `waxy rice` and `sweet rice` as English aliases and `riz glutineux` and `riz doux` as French
aliases to the existing `ingredient-ref-glutinous-rice` row. Retained `glutinous rice / riz gluant`
as its English and Québec French display pair. No new identity was created.

Keep `sticky rice / riz collant` out of the row under the existing Canadian product-boundary decision.
Keep `sweet brown rice`, `Thai sweet rice`, `riz doux thaïlandais`, and glutinous-rice flour names
separate. “Sweet” does not mean sugar is added, and “glutinous” does not mean the rice contains
wheat gluten. Keep default density null, unit mappings empty, and ingredient forms, measurements,
conversions, yields, substitutions, and recipe links absent.

## Evidence and picker boundary

- OQLF lists `riz glutineux`, `riz gluant`, and `riz doux` as preferred terms, with English `sweet
  rice` and `glutinous rice`. The older entry's descriptive note is not used for gluten or nutrition
  claims.
- USDA NAL lists `sweet rice` and `waxy rice` as synonyms of its glutinous-rice concept and separates
  the rice variety from stickiness as a property of cooked or processed rice.
- A Government of Canada procurement specification groups “Sweet or Waxy Rice.” Western Rice Mills,
  a Canadian rice supplier/importer, uses “US Sweet Rice”; a Montréal retailer lists sweet-rice
  products under “Glutinous Rice”; and a French-language Canadian grocery index uses `riz glutineux`
  and the qualified product title `riz doux thaïlandais`.
- The exact phrase preflight found no existing active reference, form, legacy-candidate, or ledger
  record owner for the four aliases. After integration, each of the four exact queries has the
  glutinous-rice grain as its only exact phrase owner.
- The exact `sweet rice` query returns both the grain and the existing glutinous-rice flour, whose
  longer alias is `sweet rice flour`. `sweet rice flour` and `sweet rice powder` continue to return
  only the flour. The broader `glutinous rice` / `riz gluant` query still returns the grain and three
  flour identities, as before.
- `sticky rice` and `riz collant` remain unallocated because Canadian product labels also use these
  phrases for short-grain sushi rice and a separate ready-to-heat product. The NAL synonym listing
  does not overturn that local picker boundary.

## Recipe and package snapshot

The full manifest-listed recipe corpus was rescanned after integration: 114 files, 1,123 ingredient
rows, and no candidate phrase hits. No recipe rows were changed.

Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a
NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,268 references | 406,019 | `8e91765cbf4f5e334dcf95662e7af4606dac6804a6d4aa490d133d2afd23d737` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,576 records; 5,561 source entries; 4,597 distinct source IDs | 5,437,570 | `e71d8321beffe3530bc0ba902ab48dd44a6d304731b51d87e13f8d32aefb8a32` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,268 references | 555,778 | `437f05fee79246a5e055676b452d59ccedf8ed6e6fe0a221ce0d87d1bc397be8` |

## Sources

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| Existing `WP03-S11` | [OQLF, riz glutineux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux) | Preferred Québec terms and English equivalents; terminology only. |
| `WP03-GLUTINOUS-RICE-ALIAS-20261012-S01` | [USDA NAL Thesaurus, glutinous rice](https://lod.nal.usda.gov/nalt/en/page/68074) | Synonyms `sweet rice` and `waxy rice`; scope note distinguishes the rice variety from stickiness in other rice products. |
| `WP03-GLUTINOUS-RICE-ALIAS-20261012-S02` | [Government of Canada, Rice procurement specification](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf) | Table 2 groups the “Sweet or Waxy Rice” procurement class; it does not establish consumer measures or cooking conversions. |
| `WP03-GLUTINOUS-RICE-ALIAS-20261012-S03` | [Western Rice Mills, ASIAN DRAGON US Sweet Rice](https://www.westernricemills.com/our-products/asian-dragon-us-sweet-rice) | Canadian supplier/importer product name; product-specific wording only. |
| `WP03-GLUTINOUS-RICE-ALIAS-20261012-S04` | [Lordford, Montréal Glutinous Rice category](https://lordford.ca/product-category/grainsoils/rice/glutinous-rice/) | Lists sweet-rice products within its glutinous-rice category; retail catalog context only. |
| `WP03-GLUTINOUS-RICE-ALIAS-20261012-S05` | [Loblaws, French Canadian grocery index](https://www.loblaws.ca/fr/search?search-bar=sticky+rice) | Uses `riz glutineux` and qualified `riz doux thaïlandais`; the regional/variety qualifier is not generalized. |

## Static validation

- Ingredient-reference normalization, generated-index freshness, and bundled seed-package validation
  passed.
- Research-ledger validation passed with 1,576 records and zero errors.
- Exact alias ownership, current picker-query behavior, and all five proposal-source-ID mappings were
  checked against the live package.
- The complete 114-recipe / 1,123-row scan found no candidate phrase hits.
- Database JSON is UTF-8 without BOM and contains explicit Unicode escapes; `git diff --check` passed.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change only adds
  database JSON data, as allowed by `AGENTS.md`.
