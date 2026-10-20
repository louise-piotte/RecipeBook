# WP03 Section M fruit identity integration — 2026-10-09

## Scope and disposition

This integration accepts the identity-only subset of the [Section M follow-up proposal](../../proposals/wp03-section-m-open-fruit-followup-20261009.md). It adds 33 references, promoting the matching legacy apple, pear, and peach candidates. The shared ledger records the accepted identity sources and decisions. No fruit forms, densities, unit mappings, yields, conversions, or substitutions were added.

## Integrated identities

| ID | English | fr-CA |
|---|---|---|
| `ingredient-ref-apple` | apple | pomme |
| `ingredient-ref-pear` | pear | poire |
| `ingredient-ref-peach` | peach | pêche |
| `ingredient-ref-nectarine` | nectarine | nectarine |
| `ingredient-ref-plum` | plum | prune |
| `ingredient-ref-apricot` | apricot | abricot |
| `ingredient-ref-grapes` | grapes | raisin |
| `ingredient-ref-fig` | fig | figue |
| `ingredient-ref-dates` | dates | dattes |
| `ingredient-ref-persimmon` | persimmon | kaki |
| `ingredient-ref-pomegranate` | pomegranate | grenade |
| `ingredient-ref-quince` | quince | coing |
| `ingredient-ref-medlar` | medlar | nèfle |
| `ingredient-ref-rhubarb` | rhubarb | rhubarbe |
| `ingredient-ref-watermelon` | watermelon | melon d’eau |
| `ingredient-ref-plantain` | plantain banana | banane plantain |
| `ingredient-ref-papaya` | papaya | papaye |
| `ingredient-ref-guava` | guava | goyave |
| `ingredient-ref-passion-fruit` | passion fruit | fruit de la passion |
| `ingredient-ref-lychee` | lychee | litchi |
| `ingredient-ref-longan` | longan | longane |
| `ingredient-ref-rambutan` | rambutan | ramboutan |
| `ingredient-ref-pitaya` | dragon fruit | pitaya |
| `ingredient-ref-kiwi` | kiwifruit | kiwi |
| `ingredient-ref-star-fruit` | star fruit | carambole |
| `ingredient-ref-tamarind` | tamarind | tamarin |
| `ingredient-ref-breadfruit` | breadfruit | fruit à pain |
| `ingredient-ref-durian` | durian | durion |
| `ingredient-ref-mangosteen` | mangosteen | mangoustan |
| `ingredient-ref-soursop` | soursop | corossol épineux |
| `ingredient-ref-cherimoya` | cherimoya | chérimole |
| `ingredient-ref-sapodilla` | sapodilla | sapotille |
| `ingredient-ref-acerola` | acerola | cerise des Antilles |

Source-supported aliases are limited to `plaquemine`, `pie plant`, `pastèque`, `letchi`, `œil-de-dragon`, `fruit étoile`, `carambola`, `fruit de l’arbre à pain`, `dourian`, `corossol`, and `nèfle d’Amérique`. The catalog does not activate English `prune` on fresh plum, `fruit de Sharon` on persimmon, `pawpaw` on papaya, `cerise` on acerola, or broad species/product aliases for pitaya and other regional fruits.

## Recipe and identity boundaries

The Medjool reference no longer carries generic `dates` / `dattes` aliases. Recipe 058#2 (`1 1/4 cups dates, pitted and chopped`) now links to `ingredient-ref-dates`; its exact wording, quantity, unit, and preparation are unchanged. The two explicit Medjool recipe rows remain linked to `ingredient-ref-medjool-dates`.

Fresh grape / `raisin` stays distinct from dried raisins / `raisins secs`. Dried-product identities such as prunes, dried apricots, figs, dates, currants, sultanas, and barberries remain separate review work. Generic melon, cantaloupe, plantain maturity, fruit cooking classes, and cherry subtypes remain open. No other recipe rows changed.

The existing banana, cherries, Medjool dates, and dried-raisins ledger records gained identity sources; their unresolved measurement states remain unchanged. The generic cherry row and its state/preparation wording were retained. The inactive legacy dried-prune and dried-apricot candidates were not repurposed.

## Verification

- Seed package normalization and generated index checks pass at 618 references.
- All 10 Python seed-package tests pass.
- All 317 Android unit tests pass. `BundledIngredientCatalogTest` now covers the 33 new identities, their categories, empty numeric data, and date/grape search boundaries.
- The updated build was installed and opened on the Pixel 9a / Android 16 emulator `emulator-5556`.
- On the French picker, `dates` returned `dattes` and `dattes medjool`; `raisin` returned `raisin`; `raisins` returned `raisins secs`; and `oignon jaune` returned only `oignon jaune`. On the English picker, `grapes` returned `grapes`, and `fingerroot` returned `fingerroot`. English `wasabi root` displayed `racine de wasabi` in French.
- The original emulator profile retained an older stored English `yellow onion` alias on generic onion, so its English `yellow onion` search also displayed `onion`. The canonical seed and unit-tested bundled catalog give that phrase only to the yellow-onion identity. No local database row was overwritten or migrated. A temporary secondary Android user did not seed the recipe library and was removed; the original profile remained intact.
- The empty draft was discarded. French was restored, and the home screen shows 114 recipes.

| Screenshot | Evidence | SHA-256 |
|---|---|---|
| `screenshots/generic-dates-fr-picker.png` | French picker, English query `dates`, generic and Medjool rows | `3470e958670ab77f6e136e912d47f441750272e28c5c7c33458956e5dc402e33` |
| `screenshots/fresh-grape-fr-picker.png` | French `raisin` resolves to fresh grape | `1f61b5ef74b62c1ee4cfd715b7544f7e4d534d64577ae3c28487217eeaf9189d` |
| `screenshots/dried-raisins-fr-picker.png` | French `raisins` resolves to dried raisins | `f5fdadbcd0d2cacd4c56a9fc177bf0b663d1da5f0fe10b87d85f55542db26061` |
| `screenshots/apple-en-picker.png` | English apple search and localized English rows | `d6b02bb1c370a09c330c4d274eefc7ff0c5d4097160f4aa48e1ec8f708452e26` |
| `screenshots/grapes-en-picker.png` | English `grapes` result | `bf2c660082fc34ef1d17d86bea4595e96121a3a835d0acb9782be3770a9e3f6d` |
| `screenshots/dates-en-picker.png` | English `dates` returns generic and Medjool identities | `08cbab575d4b2a5b83595e910aa9dadcb654585e34dfda6f85cfddef36ace2f7` |
| `screenshots/home-fr-ca-114.png` | Restored French home with 114 recipes | `1d0629acf6aedf5291fb0a3593d672263814e483e7dc8eeb859db847146e4d38` |

## Package checkpoint

The package contains 618 references (`87220c5008d76b7f89f805e4cebe67d05e3729b9f8e5ae17c878c03763bf31d3`), 33 forms (`275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732`), and 790 research-ledger records / 1,288 source entries / 1,096 distinct source IDs (`97570bc5586dc066e7b2afe58362b4c79f6ad543c47fd1e2cae3f5b466e5fdfb`). The legacy file has 88 candidates (`048ab0b0d99447ac3374af17ef6aa14681aa06f72fbe6c1139de78beffa984c8`). The manifest has 114 recipes; the manifest-ordered 1,123-row recipe corpus digest is `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f`.

The wider Section M and A–Z catalog plan remain open. The full hold/defer table and OQLF evidence register are in the linked proposal.
