# WP02/WP04 Status and Product-Boundary Integration — 2026-10-11

## Decisions

| Review | Integrated result |
| --- | --- |
| Allulose Canadian status | Keep `candidate-allulose` held and unresolved. The public sweetener, completed novel-food, and non-novel lists reviewed for allulose/psicose do not provide a determination for a specified conventional-food product and use. A licensed NHP listing names D-allulose as a non-medicinal ingredient, but that does not determine conventional-food use. The next step requires one selected product specification, manufacturing process, and intended food use/level, followed by a product-specific written determination. No inquiry was sent. |
| Hattai-ko, mugikogashi, and roasted regional products | Keep the unqualified Japanese names and `pottukadalai maavu` inactive; retain existing chana-sattu and roasted-urid identities; keep roasted Mong flour unresolved. No global alias or new active reference is supported by the current corpus. |
| Blood-sausage regional boundaries | Keep blood sausage, black/blood pudding, boudin noir, blood-and-tongue sausage, Morcilla, and sanguinaccio source-bounded. Canadian standards distinguish multiple cooked product classes, Québec terminology overlaps them, and regional product sources do not establish a shared synonym group. No matching recipe demand exists. |

The allulose source review distinguishes a list lookup from a product decision: Health Canada's [permitted sweetener list](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/food-additives/lists-permitted/9-sweeteners.html) does not list allulose/psicose, while a [licensed NHP record](https://health-products.canada.ca/lnhpd-bdpsnh/info?licence=80130989) lists D-allulose as a non-medicinal ingredient. Neither source settles the held candidate's unspecified conventional-food use. See the [allulose review](../../proposals/wp02-allulose-product-specific-canadian-status-recheck-20261011.md).

MEXT identifies mugikogashi/Hattai-ko as roasted barley flour, while Maehara's regional product information also documents corn and millet uses; the exact 100% barley Maehara SKU does not define the wider name family. The Québec mill's existing roasted barley flour remains separate because its product page does not establish process equivalence. See the [roasted-grain review](../../proposals/wp02-hattai-ko-mugikogashi-product-and-quebec-name-review-20261011.md), [MEXT barley entry](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01010_7), and [Maehara product information](https://gishi.co.jp/home/item.asp?ct=28).

CFIA's [Canadian meat-product standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) distinguish Blood Sausage, Black Pudding/Blood Pudding, and Blood and Tongue Sausage. OQLF's [boudin entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092645/boudin) gives overlapping English terms, so the integration keeps source-qualified boundaries. See the [blood-sausage review](../../proposals/wp04-blood-sausage-regional-boundary-review-20261011.md).

## Shared ledger and catalog state

- Added 38 source entries and three held candidate records: Hattai-ko/mugikogashi, pottukadalai maavu, and regional blood-sausage products.
- Updated `candidate-allulose` with the current Canadian public-status evidence; retained its `needs_clarification` state.
- Added evidence and decisions to the existing chana-sattu, roasted-urid, and roasted-Mong records. No active catalog references, forms, recipes, measurements, conversions, yields, or substitutions changed.
- The bundled package remains at 927 references, 51 forms, 114 recipes, and 1,123 ingredient rows.
- The ledger now has 1,188 records, 3,291 source entries, 2,648 distinct source IDs, and 0 validation errors.

## Verification

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: 84 tests passed, including ledger validation and held-candidate regressions.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check`: passed; bundled seed package is normalized.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`: passed; generated catalog is current at 927 references.
- No Android build, instrumentation run, or emulator deployment was needed for this ledger-only update; it changed no app code or bundled seed data.
- Updated text was checked as UTF-8 without BOM, and targeted `git diff --check` passed.

## Fingerprints

| File | SHA-256 |
| --- | --- |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | `37a74c5144da3e4f0e6d288bd106610cfad1e93f3f8635282ba581104ae8a2b7` |
| `ingredient-forms.v1.json` | `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267` |
| `research-ledger.v1.json` | `7229ed1b4e138a934e4c325f3444c91a930e3d301f56e8dbc4d946ac4eb80099` |

## Remaining work

Allulose remains held until an exact product and conventional-food use can be assessed. Broader WP02 roasted flour/starch work and WP04 regional sausage coverage remain open; this integration closes only the bounded source-review steps above.
