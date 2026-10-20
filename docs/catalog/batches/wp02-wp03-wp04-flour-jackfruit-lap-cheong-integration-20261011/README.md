# WP02/WP03/WP04 Flour, Jackfruit, and Lap-Cheong Review Integration — 2026-10-11

## Decisions

| Area | Integrated decision |
| --- | --- |
| Italian and French flour classes | Retain country-qualified descriptive class labels. Remove the shortened French type-0/type-00 aliases and the Québec pizza-product wording from the generic Italian type-00 row. Keep official Italian class terms on their corresponding rows. No flour-grade crosswalk or recipe link was added. |
| Jackfruit | Keep the existing `jackfruit / jaque` identity and its spelling aliases. Add no maturity forms, processed-product identities, measurement behavior, or recipe links because the bundled corpus has no matching demand. |
| Lap-cheong | Keep a source-bounded `needs_clarification` candidate in the ledger, with no active reference, alias, form, amount, measurement, or substitution. The wider sausage-family and cooking-safety work remains open. |

The Québec terminology review found that OQLF supports `farine de blé tendre` as generic soft-wheat wording but does not define the numbered national classes. Québec product labels for T55/T65 and Tipo 00 are evidence about those products, not a shared cross-country equivalence. The product-specific `farine à pizza Tipo « 00 »` wording therefore stays off the generic type-00 row. See the [flour review packet](../../proposals/wp02-regional-flour-classes-quebec-terminology-review-20261011.md), [OQLF soft-wheat entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre), and [La Milanaise Tipo 00 pizza product](https://lamilanaise.com/produits/farine-a-pizza-tipo-00-biologique/).

Jackfruit evidence does not establish a common maturity threshold or a Québec product name that warrants an additional global identity. OQLF lists [`jaque`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297111/jaque); Kew recognizes [*Artocarpus heterophyllus*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:850389-1/general-information) as the jackfruit species. The [jackfruit review packet](../../proposals/wp03-jackfruit-maturity-product-quebec-review-20261011.md) records the product boundaries and recipe-demand audit.

OQLF's [`saucisse chinoise`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298988/saucisse-chinoise) entry is broader than lap-cheong. The [smallgoods guide](https://pir.sa.gov.au/__data/assets/pdf_file/0003/487371/guidelines-safe-manufacture-smallgoods.pdf#page=211) describes a source-specific dry-sausage process, and a Vancouver [manufacturer](https://www.wing-wing.com/products.php?lang=en) distinguishes pork `lap cheung` from pork-and-liver `guan cheung`. The [lap-cheong review packet](../../proposals/wp04-lap-cheong-regional-sausage-boundary-review-20261011.md) keeps those boundaries source-qualified; these examples do not define all products with related names.

## Snapshot and validation

- The package contains 927 ingredient references, 51 forms, 114 recipe files, and 1,123 ingredient rows.
- The research ledger contains 1,185 records, 3,253 source entries, and 2,610 distinct source IDs, with zero validation errors.
- No jackfruit or sausage recipe lines, forms, conversions, yields, or substitutions were added. Catalog changes in this integration are limited to the reviewed flour alias cleanup; ledger evidence records all three review outcomes.
- Bundled seed-package normalization check and generated ingredient-index freshness check passed.
- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: 83 tests passed.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:testDebugUnitTest --no-daemon --console=plain`: 396 tests passed.
- `ADB_SERVER_SOCKET=tcp:127.0.0.1:5037 GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:connectedDebugAndroidTest --no-daemon --console=plain`: 35 instrumentation cases reported, 33 passed, 2 skipped, 0 failed, on the disposable API 36 Pixel 9a-profile emulator.
- `tools/deploy_to_pixel9a_emulator.sh` installed and launched the app on that disposable emulator. English and French picker checks passed, and the app returned to the French `Toutes les recettes (114)` home without saving the draft.

## Emulator screenshots

| Check | Result | Screenshot |
| --- | --- | --- |
| English `Italian type 00` | One result: Italian type-00 soft-wheat flour | [Positive](screenshots/picker-en-italian-type-00.png) |
| English `Tipo 00 pizza flour` | No result | [Rejected product alias](screenshots/picker-en-rejected-pizza-alias.png) |
| French `tipo 00` | One result: `farine de blé tendre de type 00 (Italie)` | [Positive](screenshots/picker-fr-italian-type-00.png) |
| French `farine de type 00` | No result | [Rejected short alias](screenshots/picker-fr-rejected-short-alias.png) |
| French recipe list | `Toutes les recettes (114)`; unsaved draft discarded | [Home](screenshots/home-fr-114.png) |

## Fingerprints

| File | SHA-256 |
| --- | --- |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | `37a74c5144da3e4f0e6d288bd106610cfad1e93f3f8635282ba581104ae8a2b7` |
| `ingredient-forms.v1.json` | `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267` |
| `BundledIngredientCatalog.kt` | `22bc89ed784b52194339cb01747b7fddcb2b6441f1d3c35f44b3ab911cc81a1e` |
| `research-ledger.v1.json` | `ec16623e6bab2101a25805640c791474b61ecc16527fb63cfe13f89d2228b372` |

Screenshot SHA-256 values are recorded in the checksums below.

```text
429eeafb91db7090b3fa50d48e6ed59a7896d94dd6f37cd2dfc8444225046f8b  home-fr-114.png
93a9dca0305ebc3d383fe0c3cec1e1dc9d62701854827ee4bdcde8e5797864f2  picker-en-italian-type-00.png
5792a82aa724a207338d525a05b09c672b54cca2fde90fb1dd193bc5c658a938  picker-en-rejected-pizza-alias.png
2792b168c86a2b553b986e685f2f7e4081bb425dcd4aea3b7ffd24711283da7a  picker-fr-italian-type-00.png
07f729db8ec2606e686e812e5579461b34f29cfcd718893a719663b0113b2970  picker-fr-rejected-short-alias.png
```

## Remaining work

Broader WP02 flour/starch coverage, WP03 regional terminology and product boundaries, and WP04 sausage and portion work remain open. This batch completes only the three bounded review items above; the global catalog plan remains open.
