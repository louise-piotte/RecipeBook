# WP04 recipe package amounts integration

## Scope

This batch records two exact source-recipe package facts using the existing v1 `IngredientPackageAmount` model. It adds no reusable package yield, density, unit mapping, measurement observation, ingredient form, or substitution.

| Recipe line | Source fact | Stored package data | Preserved recipe amount |
|---|---|---|---|
| `086#12`, tomato paste | [Trois fois par jour, Poulet au beurre](https://www.troisfoisparjour.com/fr/recettes/plats-principaux/poulet-volaille/poulet-au-beurre/) specifies one 156 ml can. | `count: 1`, `packageType: CAN`, `declaredNetQuantity: 156`, `declaredNetUnit: ml`; localized notes are `1 boîte` / `1 can`. | `quantity: 156`, `unit: ml`; the unsupported `small` wording was removed. |
| `007#4`, pinto beans | [Ethan Chlebowski, Mexican Inspired Bento Box Lunch](https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch) calls for one can and adds the whole can with its liquid. | `count: 1`, `packageType: CAN`, `requestedBasis: NET_CONTENTS`; declared size and packing-medium type remain unknown. | `quantity: 1`, `unit: can`, source wording and bilingual preparation are unchanged. |

## Implementation and coverage

`packageAmountForIngredientLine` resolves count from an explicit package-unit quantity, a parsed package expression, or saved structured metadata, in that order. A mass or volume ingredient quantity does not become a package count. The package-resolver design note records this contract.

Unit fixtures cover the structured tomato-paste row, a parsed `1 can (156 ml)` expression, a two-can package-unit row, and the pinto-bean contents basis. `SchemaRoundTripTest` preserves the tomato-paste declared volume and a pinto package amount with no declared size in both v1 payloads. The Pixel 9a detail-screen fixture checks `156 ml tomato paste (1 can)` and `156 ml pâte de tomates (1 boîte)`. The seed-package regression checks both recipe rows.

## Validation

- `python3 -m unittest tools.seed_package.test_bundled_seed_package` — passed, 37 tests.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — passed.
- `git diff --check` — passed.
- `./gradlew :app:testDebugUnitTest --no-daemon` — passed, 353 tests, 0 failures.
- `ADB_SERVER_SOCKET=tcp:127.0.0.1:5037 ./gradlew :app:connectedDebugAndroidTest --no-daemon` — passed on the disposable Pixel 9a/API 36 test AVD: 31 tests reported, 2 skipped, 0 failed.
- `tools/deploy_to_pixel9a_emulator.sh` — passed generic tests, debug assembly, streamed install, and app launch on `emulator-5556`.
- Manual navigation verified `156 ml tomato paste (1 can)` and `156 ml pâte de tomates (1 boîte)` in the recipe detail. Screenshots: [English](screenshots/tomato-paste-detail-en.png) and [French](screenshots/tomato-paste-detail-fr.png). SHA-256: English `a94b2b9fb720d9806debe4b45dbad50197da632346c0adf339fa2d0bf634a9d0`; French `fdda61ea690ef49acdd24be1a65c08f215dbc0c9726ac1cf85175aa3e39cab57`.
- The already-running `Pixel_9a` process was not stopped or reset. Navigation ran on a disposable Pixel 9a/API 36 clone at 1080×2424, which was shut down and removed after the screenshots were saved. No data on the existing AVD was cleared.

## Evidence boundary

Neither recipe source provides a product brand/SKU or a reusable package specification. The pinto source does not state its can size, mass, liquid type, drained weight, or cooked yield. These line-level facts do not generalize to other recipes or products.
