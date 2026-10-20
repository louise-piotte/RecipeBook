# WP03 Section F — red-rice poha French alias integration (2026-10-12)

## Decision

Added French search alias `poha rouge` to the existing `ingredient-ref-red-rice-flakes` reference. Kept the English display `red rice flakes`, provisional French display `riz rouge aplati`, existing English alias `red rice poha`, category, null density, and empty unit mappings unchanged. No new identity or form was added.

This is a Canadian French retail search alias, not an OQLF or TERMIUM preferred-term claim. Keep generic `poha`, `flocons de riz`, intact red rice, red-rice flour, product-grade wording, and other regional names separate. No measures, conversions, yields, recipe links, or substitutions were added.

## Evidence and picker boundary

The [Spice Divine French listing](https://spicedivine.ca/fr/products/easternriceflakes500gm) uses the exact phrase `poha rouge` in its title and description for a red-rice-flake product. The indexed listing was out of stock at review time, so it supports wording only, not current availability. [Qualifirst’s French-Canada storefront](https://odoo.qualifirst.com/fr_CA/food/rices/poha-medium-red-rice-m) calls a product `Riz rouge moyen Poha` and describes red poha as flattened rice; `moyen` remains product-specific wording. The [Provigo French listing](https://www.provigo.ca/fr/alimentation/aliments-internationaux/aliments-de-l-asie-du-sud/c/58045) shows generic `Flocons de riz (Poha)` without a red-rice qualifier.

TERMIUM’s [rice flake / flocon de riz record](https://www.btb.termiumplus.gc.ca/tpv2source?fchrcrdnm=41&i=1&index=enb&lang=eng&rlang=fr&src_id=OCDE-1021999%2CSRCL37642002%2CSRCL37642004&srchtxt=UP+INCLUDING&titl=flocon+de+riz) is in the milling and cereal industries and describes cooked grains or pieces shaped into flakes, toasted, then oven-dried; it does not define every poha product. OQLF’s [orzo entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2094699/orzo) uses flattened-rice wording only to describe a pasta shape. Neither source establishes a preferred Québec French term for red rice poha, so the existing display remains provisional.

The phrase-first picker audit follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases across reference and form terms take precedence, then substring matching is used if no phrase match exists. Results after integration:

| Query | Result |
|---|---|
| `poha rouge` | `ingredient-ref-red-rice-flakes` only |
| `poha` | Generic flattened rice/poha, red rice flakes, and corn poha |
| `red rice` or `riz rouge` | Intact red rice, red rice flakes, and roasted red rice flour |
| `rice flakes` | Generic flattened rice/poha, brown rice flakes, and red rice flakes |
| `flocons de riz` | Generic flattened rice/poha and brown rice flakes |
| `riz aplati` or `riz battu` | Generic flattened rice/poha |
| `flocons de riz rouge` | No result; not added as an alias |

## Recipe demand and ledger

All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned for `poha rouge` and neighboring red-rice-flake / poha wording. There were zero matching recipe files or ingredient rows and no recipe link to the target reference. The research ledger keeps `measurementState` and `substitutionResearchState` as `not_yet_researched`; this terminology change adds no culinary measurement or substitution finding. Five source records and one accepted alias decision were appended to the existing `ingredient-ref-red-rice-flakes` ledger record. No new candidate record was created.

## Static validation and snapshot

- Ingredient-reference normalization passed.
- Bundled seed-package normalization and validation passed.
- Research-ledger validation passed: 1,578 records and zero errors; all five new source IDs are unique and attached to the existing red-rice-flakes record.
- Generated `BundledIngredientCatalog.kt` is current at 1,270 references.
- Exact ownership and picker-boundary checks passed; the full recipe scan found zero candidate hits.
- The reference and ledger JSON are UTF-8 without BOM and store non-ASCII characters as explicit Unicode escapes. Scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change only adds database JSON data, as specified by `AGENTS.md`.

Hashes cover exact file bytes. The recipe fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,270 references | 406,652 | `6559f9b7af6928c73c4f6c84edf21e56a455ebc9d313d07882618f421ad59354` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,578 records; 5,577 source entries; 4,613 distinct source IDs | 5,452,201 | `924213ec3b353a9c94eda878e17e9322ee246580a9039d3a8277beb38c18aba6` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,270 references | 556,625 | `0a388f2c132bcfbab9a46817cac63ce594ca1414f5bd57dcdae286b6a2913e8e` |

See the [proposal](../../proposals/wp03-section-f-red-rice-flakes-poha-rouge-quebec-alias-review-20261012.md) for the complete terminology, ownership, source, and boundary audit.
