# WP03 Section F — brown-rice `riz complet` alias integration (2026-10-12)

## Decision

Added only the French search alias `riz complet` to existing `ingredient-ref-brown-rice`. The display remains `brown rice / riz brun`; existing aliases `hulled rice / riz cargo` remain. No new reference, form, density, unit mapping, measurement, recipe link, conversion, yield, or substitution was added.

TERMIUM’s existing brown-rice milling record lists `riz complet` and `riz intégral` as French terms, while `riz brun` is the correct French term. Québec retailer La Moisson explicitly calls its long brown rice `riz complet`; Dainty uses `riz complet` for brown basmati. These usages support one search alias for the same hull-removed, bran-retaining rice class. This is a search mapping, not an OQLF-preferred display claim. Keep `riz intégral`, `cargo rice`, `riz décortiqué`, and `riz non usiné` inactive. OQLF’s [riz cargo entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432771/riz-cargo) keeps `riz brun` as the display and `riz cargo` as the existing Québec alias.

Keep product qualifiers intact. `riz complet rouge` stays unmatched under the separate red-rice identity boundary; `flocons de riz complet` stays outside intact brown rice and rice-flake names. Do not create a color × milling × grain-length × cooked-state matrix.

## Picker and recipe boundary

The phrase-first picker audit follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Results after integration:

| Query | Result |
|---|---|
| `riz complet` | `ingredient-ref-brown-rice` only |
| `riz complet rouge` | No result; red qualifier is not stripped |
| `flocons de riz complet` | No result; no rice-flake alias added |
| `riz intégral` | No result; remains an inactive TERMIUM variant |
| `riz brun` or `brown rice` | Brown rice, brown rice flakes, brown rice flour, and brown rice syrup, as before |
| `riz cargo` or `hulled rice` | `ingredient-ref-brown-rice` only, as before |

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned for brown-rice terms and related variants. There were zero matching files, zero matching ingredient rows, and zero rows linked to `ingredient-ref-brown-rice`; recipe data did not change. The existing ledger measurement and substitution states remain `not_yet_researched`.

## Evidence recorded

Two sources and one accepted alias decision were added to the existing brown-rice ledger record. The decision reuses existing source IDs `WP03-S115` (TERMIUM brown-rice milling record) and `WP03-S118` (OQLF `riz cargo` record), without duplicating them.

- [TERMIUM Plus, brown rice / riz brun](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frt&lang=eng&srchtxt=RIZ+INTEGRAL) lists the term under its milling and cereal record; it does not make `riz complet` the Québec display choice.
- [La Moisson, Riz brun long biologique](https://lamoisson.com/products/riz-brun-long-biologique) explicitly says `Le riz long brun, aussi appelé riz complet`. This is Québec retailer wording for one long-grain product, not a measure or official terminology ruling.
- [Dainty, Basmati brun](https://dainty.ca/fr/produits/riz-basmati-brun/) describes brown basmati as `un riz complet à grains entiers` with only its hull removed. This is Canadian manufacturer usage for a named rice variety; its cooking ratio is not a catalog conversion.

## Static verification and snapshot

- Ingredient-reference normalization, bundled seed-package normalization/validation, and generated-index freshness passed.
- Research-ledger JSON Schema validation passed with 1,578 records and zero errors. Both new source IDs are unique and attached to the existing brown-rice record.
- Exact phrase ownership, picker boundaries, and the full recipe-corpus scan passed.
- Changed JSON files are UTF-8 without BOM and store non-ASCII characters as explicit Unicode escapes. Scoped whitespace checks passed.
- No app tests, unit tests, instrumentation tests, emulator checks, or deployment were run because this change only adds database JSON data, as specified by `AGENTS.md`.

Hashes cover exact file bytes. The recipe fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,270 references | 406,705 | `feb642bf2bee7302a02fe4030fe38189f8f423f897437b6b68881285a4500915` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,578 records; 5,581 source entries; 4,617 distinct source IDs; 8 conversions | 5,456,899 | `86272bdcb8fa38a7b1984879ed76df09893a3ba306df041fab118ec24573588b` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,270 references | 556,660 | `071e0d0a34b243f588c4ec971d77edcd4fb6fd4eaaa297c2c9bfb6423774e3f3` |

See the [source proposal](../../proposals/wp03-section-f-brown-rice-riz-complet-quebec-alias-review-20261012.md) for the pre-integration ownership audit and complete source boundary.
