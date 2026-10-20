# Catalog identity-boundary integration — 2026-10-09

**Status:** integrated and verified. This batch closes one whole-kernel checklist row and records
bounded search fixes under Sections E, H, and N. The broader category checklists remain open.

## Changes

- Added identity-only `cashews / noix de cajou`, `macadamia nuts / noix de macadamia`, and
  `sweet chestnuts / marrons`. Retained the seven existing whole-kernel IDs. Added source-backed
  French search aliases `pacane` and `noix de pacane` to pecans, and `cacahuète` and `cacahouète`
  to peanuts. Kept bare `noix` generic and sweet chestnuts separate from water chestnuts. The
  category is catalog taxonomy, not an allergen or botanical claim.
- Changed the fresh pea display to `green peas / petits pois`; removed `petits pois jaunes` from
  dried yellow peas. Dry/whole/split states remain unmodeled, and no recipe row changed.
- Added `food colour` and `food colouring` to generic food coloring and the exact
  `green gel food coloring` alias to green food coloring. Removed bare `red` and an instruction-like
  phrase from red food coloring. Relinked only recipe 017 line 7 to green coloring and recipes 091
  line 11 / 092 line 8 to red coloring. Recipe 051's red-or-pink line and recipe 071's unqualified
  line remain generic; original line text and amounts are preserved.
- Added only the grammatical English alias `mushrooms` to the species-unspecified generic mushroom
  identity, with an OQLF identity record. The duplicate legacy candidate remains inactive; a plural
  search returns both the generic mushroom and the separate candy-cap product.
- No forms, densities, unit mappings, package yields, conversions, substitutions, or other recipe
  links were added.

## Evidence and open scope

Identity and alias decisions are detailed in the source-reviewed proposals:

- [Tree nuts and peanuts](../../proposals/wp03-tree-nuts-coordinator-review-20261009.md)
- [Peas, lentils, and soybeans](../../proposals/wp03-lentils-peas-soybeans-coordinator-review-20261009.md)
- [Floral waters, colorants, pandan, and ube](../../proposals/wp02-floral-waters-colorants-ube-coordinator-review-20261009.md)
- [Fungi and sea vegetables](../../proposals/wp03-fungi-seaweed-coordinator-review-20261009.md)

Rose water and orange-blossom water remain identity proposals pending independent Québec French
review. Pandan extract, ube flavor products, and edible luster products remain deferred pending
product scope and terminology evidence. The other named mushrooms and seaweeds remain open where
French product wording or species scope is unresolved. Broader pulse states, forms, measurements,
and substitutions also remain open.

## Package snapshot

Hashes cover exact file bytes. The recipe digest hashes each manifest-relative recipe path in order,
then a NUL byte, the file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 512 | `3c84c47314c63fd5d5e91d2aa00ec204a3f16f9e4e068990097b2a71316e8497` |
| Ingredient forms | 32 | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| Manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 692 records; 1,142 source entries; 956 source IDs | `3aeff6dd9e43422aee43f450fda6a3de8eb464458757366ebe47de2a1b3eb384` |
| Legacy candidates | 97 | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `81a6a940e7bfdbe76f85b0b68b7b6c2a69ba8dec31a4a48c45f5ed31a0668937` |

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — normalized.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — current at 512 references.
- `python3 -m unittest tools.seed_package.test_bundled_seed_package` — 10 passed.
- Research-ledger validator — 692 records, no errors.
- `./gradlew :app:testDebugUnitTest --no-daemon` — passed (315 Android unit tests).
- `tools/deploy_to_pixel9a_emulator.sh` — build and install passed on Pixel 9a / API 36 (`emulator-5556`).
  After uninstalling the disposable emulator app to force seed import, the library loaded 114 recipes.
- English picker: `mushrooms` returned generic mushroom and ground dried candy-cap mushrooms;
  `noix de pacane` returned pecans; `petits pois` returned green peas; `yellow peas` returned dried
  yellow peas; `petits pois jaunes` returned no result; `food colouring`, `green gel food coloring`,
  and `gel red food coloring` returned their intended identities.
- French picker: `champignons`, `noix de cajou`, `marrons`, `petits pois`, and
  `colorant alimentaire vert en gel` returned their French display labels. The empty drafts were
  discarded and the French home was restored to 114 recipes.

## Pixel 9a screenshots

The SHA-256 column records each saved PNG.

| Screenshot | SHA-256 |
|---|---|
| [English home after reinstall](en-home-114-after-reinstall.png) | `8686580401d935bbda4b53acd2793ada5b43400fe33bf684b3d6c540a341ceae` |
| [English plural mushroom results](en-mushrooms.png) | `22f37d5ca8eba5bd4bd4c20eab089e892f621de68a77f417b32ca20ec34724a4` |
| [French mushroom result](fr-champignons.png) | `09d6e2728efc06ddbc23379c1c0e66c0642aa14cc10d7651d57b956c9dfb8aae` |
| [French cashew](fr-cashew.png) | `27e6f8b828c5c4df33fc9d55fedace4e29d61b7b5615a88befa03eefba771b62` |
| [French sweet chestnut](fr-sweet-chestnut.png) | `3a049dc5dffe13c4f56acb3f154ff2c389e7cd30c9713b62ff28f52068e4c53b` |
| [English query: French pecan alias](en-french-pecan-alias.png) | `a59959c2063c54635a84f2222f7afa79b4fa971ebb62a925720e5d4a8bac58d4` |
| [English query: petits pois](en-petits-pois.png) | `582d8749e165d415945050a1d7b04d3644df83b75a3d3aafa8c6ed06661365ef` |
| [English query: yellow peas](en-yellow-peas.png) | `d2bdcdfeab9161c8f3132e82c2a0c731949932dbfccde51f1535d17c225c1ee8` |
| [Former pea-collision phrase returns no result](en-former-pea-collision-no-result.png) | `57cf87ca92be5d6f2f8721d4fd6a54055836b3f2eb3ed501649f33d582feb7ea` |
| [French query: petits pois](fr-petits-pois.png) | `75f9915cd2383c936a22b95fca2ab1dead370c5409d517d6a04817aabb900d81` |
| [English query: food colouring](en-food-colouring.png) | `5b2ee5f2253587b66cdbf2829a8c980ed0603fe870aa148144034b96a702987a` |
| [English query: green gel coloring](en-green-gel-coloring.png) | `6836980b32ca6c787acc6064b4619be464e59268d859cc6dddbb1ee804df1c98` |
| [French query: green gel coloring](fr-green-gel-coloring.png) | `972ed01894707d9337cc454ac70a6864211db28c8c0699c0feb6b520a76899d6` |
| [English query: red gel coloring](en-red-gel-coloring.png) | `ae1f94ca07be3f1417f9a568fa27dd2f34f99bd42b6b0adc8282cfa37887011d` |
| [French home restored with 114 recipes](fr-home-114-restored.png) | `03d96c4d13d4a71b30c084efb8f6a6f3effb1f6e9169f241bae9a498c394429a` |
