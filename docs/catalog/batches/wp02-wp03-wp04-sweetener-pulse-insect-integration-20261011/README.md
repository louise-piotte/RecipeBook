# WP02/WP03/WP04 sweetener, pulse, and insect review integration

- Integrated: 2026-10-11.
- Status: root-integrated source-backed batch; broader WP02 Section C, WP03 Section H, and WP04 insect coverage remain open.
- Source of requested coverage: `docs/RecipeBook-global-ingredient-catalog-plan.txt`.

## Integrated identities and form

- Kept whole date powder as a powdered form of dried dates, displayed `date powder / dattes en poudre`; its 1/4 cup (28 g) U.S. brand serving remains ledger-only.
- Kept whole house-cricket powder (*Acheta domesticus*) and whole banded-cricket powder (*Gryllodes sigillatus*) as separate protein identities. Revised the banded-cricket fr-CA display to `poudre de grillon à bandes` after an independent Québec terminology review. Its Entomo Farms 1 level tbsp / 10 g remains a product-specific ledger observation.
- Added coconut sugar / sucre de noix de coco as a sap-derived sugar identity, separate from coconut sap syrup, coconut flesh, and generic palm sugar.
- Verified the existing honey / miel identity and added agave syrup / sirop d’agave as a separate sweetener. The CNF honey portion pairs and one publication’s agave substitution note remain ledger-only. `Agave nectar` is not an alias because it would capture the existing `nectar` → `nectarine` search; no defaults, forms, mappings, conversions, yields, substitutions, or recipe links were added.
- Promoted the source-empty legacy candidate to `brown rice syrup / sirop de riz brun`. Generic `rice syrup / sirop de riz` remains unresolved and is not an alias. Existing phrase search returns the qualified display for an unqualified query. The Briess 42 DE density observations and Lundberg product-specific sugar ratio are ledger-only.
- Added `blackstrap molasses / mélasse verte` with the narrow English aliases `blackstrap`, `black strap`, and `third molasses`. Generic molasses, fancy/table molasses, cooking-molasses blends, treacle, and ambiguous dark/second terms remain separate or unresolved. CNF and Crosby portions are ledger-only.
- Added identity-only `golden syrup / sirop doré` as the distinct Canadian refined-sugar-syrup class. Active aliases are limited to CFIA co-names and OQLF-preferred `mélasse claire` / `mélasse légère`; generic molasses, golden corn syrup, corn/glucose syrup, invert syrup, maple syrup, and treacle remain separate. The recipe corpus has no golden-syrup line, and no forms, measures, conversions, yields, recipe links, or substitutions were added.
- Added moth beans / haricots papillon for *Vigna aconitifolia* and Bambara beans / pois bambara for *Vigna subterranea*, with species-scoped aliases only. Neither has a form, measure, density, mapping, conversion, yield, substitution, or recipe link.
- Added identity-only Great Northern beans / haricots Great Northern for the mature dry edible seed class of *Phaseolus vulgaris*, using only the OQLF-supported singular aliases. The merge-time exact-key preflight found no active Great Northern owner, form, ledger owner, or bundled recipe line; generic white-bean, navy, and cannellini legacy candidates remain distinct. Kept generic white-bean, navy, cannellini, white-kidney, and historical `gros haricots blancs` wording outside the alias list. USDA's 183 g raw and 177 g cooked U.S.-cup observations stay in the ledger and are not used as density, mapping, or a dry-to-cooked yield; a qualitative Great Northern/cannellini cooking note stays source-scoped with no active substitution rule. No forms, yields, conversions, or recipe links were added.
- Added identity-only mung beans / haricots mungo for the food seed of *Vigna radiata*. OQLF supports the bilingual name and English aliases; its separate *Vigna mungo* entry records the French-name overlap, so `urd` and `black gram` remain excluded. Whole mung beans are distinct from the existing sprouts, starch, flour candidate, and bean-thread noodles. The exact-key and recipe audit found no whole-seed owner or recipe use. No forms, measurements, mappings, recipe links, conversions, yields, or substitutions were added.
- Promoted the source-empty Cannellini candidate to `cannellini beans / haricots cannellini` with narrow TERMIUM aliases. White-kidney wording remains ledger-only because its query would also match the existing kidney-bean identity; Great Northern, Navy, and generic white beans remain distinct. Source-specific seed-size, generic CNF, package-volume, and qualitative exchange observations were not turned into recipe measures or rules. No forms, mappings, conversions, yields, recipe links, or substitutions were added.
- Added identity-only `rabbit meat / viande de lapin` for plain meat from farmed domestic rabbit. MAPAQ supports the Québec food name and domestic scope; OQLF supports the bilingual animal name. Wild rabbit, hare/game, pet products, processed products, and offal remain separate. The bundle has no rabbit recipe line, and no aliases, forms, measures, conversions, yields, recipe links, or substitutions were added.
- Kept a broad human-food mealworm powder row held because current product pages do not identify a product species and process that can be matched to the relevant Health Canada determinations. The evidence boundary is recorded in the ledger and proposal; no active mealworm row was added.
- Reviewed abalone / ormeau and kept the candidate held without an active identity or links: the corpus has no matching recipe line, and no intended product specifies the species or product state. The generic name pair is supported, but the status of Northern Abalone cannot be generalized to all *Haliotis*. No names, forms, app measures, conversions, yields, or substitutions were activated.

## Source and review packets

- [Brown rice syrup identity and product-boundary review](../../proposals/wp02-brown-rice-syrup-identity-boundary-review-20261011.md)
- [Blackstrap molasses product and Québec naming review](../../proposals/wp02-blackstrap-molasses-quebec-product-review-20261011.md)
- [Honey and agave syrup identity-boundary review](../../proposals/wp02-honey-agave-syrup-product-identity-boundary-review-20261011.md)
- [Banded-cricket identity review](../../proposals/wp04-banded-cricket-identity-boundary-review-20261011.md)
- [Independent Québec display review for banded cricket powder](../../proposals/wp04-banded-cricket-quebec-display-review-20261011.md)
- [Mealworm identity-boundary review](../../proposals/wp04-mealworm-food-identity-boundary-review-20261011.md)
- [Abalone / ormeau species and product-boundary review](../../proposals/wp04-abalone-ormeau-species-product-boundary-review-20261011.md)
- [Great Northern bean identity and Québec display review](../../proposals/wp03-great-northern-beans-quebec-identity-review-20261011.md)
- [Mung bean identity and species-boundary review](../../proposals/wp03-mung-beans-quebec-identity-review-20261011.md)
- [Golden syrup identity and Québec terminology review](../../proposals/wp02-golden-syrup-quebec-identity-review-20261011.md)
- [Cannellini identity and white-kidney boundary review](../../proposals/wp03-cannellini-beans-quebec-identity-review-20261011.md)
- [Rabbit meat identity and farmed/wild boundary review](../../proposals/wp04-rabbit-meat-quebec-identity-review-20261011.md)

Independent root checks confirmed CFIA’s separate English `agave syrup` and French `sirop d’agave` examples; OQLF’s `haricot Great Northern` / `Great Northern bean`, separate navy-bean terminology, and preferred term `ormeau`; USDA’s separate Great Northern, Navy, Small White, and White Kidney dry-bean classes; the USDA source-specific 183 g raw and 177 g cooked cup portions; Loblaws Québec’s plural `Haricots Great Northern` listing; and the AAFC historical descriptor `gros haricots blancs`, which remains excluded from aliases. The Illinois Extension substitution note is limited to a white-chicken-chili context. Root also checked the CFIA Fish List’s generic and species-scoped Haliotis rows and DFO’s Northern Abalone restriction. The CFIA live/raw molluscan-shellfish page explicitly limits its Haliotidae exclusion to that regulatory definition; it does not establish a general import or sale exemption.

## Verification

The completed follow-up package has 940 ingredient references, 52 forms, 114 recipes, and 1,123 ingredient rows. The research ledger has 1,204 records, 3,466 source entries, 8 unit-conversion records, and 2,814 distinct source IDs.

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the bundled package and research ledger were valid with 0 errors and already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; the generated Kotlin catalog is current at 940 references.
- `python3 -m unittest tools.seed_package.test_bundled_seed_package` passed all 103 tests.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed all 405 tests.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon` on `emulator-5560` (Android 16 / API 36, Pixel 9a profile) reported 35 passed, 2 skipped, and 0 failed.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5560 tools/deploy_to_pixel9a_emulator.sh` built and installed the tested debug APK successfully. English picker checks returned `rabbit meat`, `mung beans`, `golden syrup`, and `cannellini beans`; the French checks returned `viande de lapin`, `haricots mungo`, `sirop doré` for `sirop de raffineur`, and `haricots cannellini`. `white kidney beans` did not return Cannellini, and `kidney beans` returned the existing kidney-bean identity. The temporary unsaved draft was discarded, and the French home was restored at 114 recipes.

The follow-up screenshots below were captured from the 940-reference build. The earlier screenshots later in the file document the original 936-reference checkpoint.

| Follow-up screenshot | SHA-256 |
|---|---|
| [English rabbit picker](picker-rabbit-en.png) | `c4cd41705cd274399cfde3618b80f5699f3f82c53a7ae3dd21a561d488774f99` |
| [French rabbit picker](picker-rabbit-fr.png) | `8c441e5c824d4ba1dd1600ec0d12c924d86bff56e77675c5efd54c4cbda1dcf1` |
| [English mung-bean picker](picker-mung-beans-en.png) | `8aa162ee81a58b4a716343428866cc54ba08bda1b89626646a3a24b675284ab5` |
| [French mung-bean picker](picker-mung-beans-fr.png) | `a028c15780fb40ead6d2dd82e9d2655ee1f2d30c1032d7e6a6f916b91439df0e` |
| [English golden-syrup picker](picker-golden-syrup-en.png) | `52ff53c904814e97ef88e6b1ff3f46a16e710a2457c28a7deeccd50f43a2a09f` |
| [French golden-syrup alias query](picker-golden-syrup-fr.png) | `db6b888e1f48d3f8433d25006da8cd65d82d47cc1ebeb570c008b44350f44b35` |
| [English Cannellini picker](picker-cannellini-en.png) | `0129be8a73cf99e7590f482024eef33bdcab70f65b78da567cbcbd5c85f146d0` |
| [French Cannellini picker](picker-cannellini-fr.png) | `553402acd64796efd537acf6d163077370a874fa99e2178405e6a008ba5137ea` |
| [Restored French home, 114 recipes](home-fr-114-recipes.png) | `1e460e4dff2419e1adec15afee0df05c29ca801e53c72927bdfc0f4c80642991` |

Screenshots from the earlier 936-reference checkpoint remain for the original additions; their SHA-256 values are recorded for repeatable review:

| Screenshot | SHA-256 |
|---|---|
| [English Great Northern picker](picker-great-northern-en.png) | `60c15fca38c2d97a0f959946fc15eeb42ff96b12e3bc755f4b01f9f6affdf439` |
| [French Great Northern picker](picker-great-northern-fr.png) | `c6779ab3704b32dbc381d2585f71cf861a4bc3272019d9a47c33af7591c44a89` |
| [English agave picker](picker-agave-en.png) | `b43527db8992264105de916e955f562cfe199d28aea035af7f79eb6512b274fb` |
| [French agave picker](picker-agave-fr.png) | `1d63738f90624093e047238cd52f0c3d226962e8ec55b8ed4b08c9169f271124` |
| [English cricket-powder picker](picker-cricket-en.png) | `c33691b99cbae86a132636247b847571c95f28763c327ef7fb63caef48b5598b` |
| [French cricket-powder picker](picker-cricket-fr.png) | `b3ad738b654bbaa1fbde190d7236354c8b29cfbe0d1aa85c127047c197d115ad` |
| [French rice-syrup query](picker-rice-syrup-fr-query.png) | `a44979d03113a251ab21c91c42ec305b9b8a8b24fa67fc30b426796a4e7ade16` |
| [Restored French home, 114 recipes](home-fr-114-recipes.png) | `4834a7e5ec7daceb3eaa23e38c8d0e1e77707f7f044d5c8f4c2ae82bd001b9e0` |

## 2026-10-11 follow-up: light corn syrup, Navy beans, and tuna boundary

Added identity-only `light corn syrup / sirop de maïs clair`, with `sirop de maïs léger` as its
narrow French alias, and Navy beans / haricots Navy, with OQLF-backed `petit haricot blanc`. The
five CNF code 4323 serving portions remain ledger observations; no default density or mapping was
created. Karo Light/Dark interchange advice remains brand-family-specific and is not a global
substitution. Neither new row has a recipe link, form, conversion, yield, or substitution rule.

The tuna review retained recipe `111#1` on generic `ingredient-ref-tuna` at count 1. The ledger's
existing source-reported mass intervals and its unreviewed identity state were left unchanged; the
current publisher wording does not establish a species or a reusable steak form.

The package has 942 ingredient references, 52 forms, 114 recipes, and 1,123 ingredient rows. The
ledger has 1,205 records, 3,478 source entries, 2,826 distinct source IDs, 8 unit-conversion
records, and 0 validation errors.

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 942
  references; the generated index is current.
- `python3 -m unittest tools.seed_package.test_bundled_seed_package` passed all 105 tests.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed all 407 tests with no skips or failures.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon` on `emulator-5560` (Android 16 / API 36,
  Pixel 9a profile) completed 35 test cases: 33 passed, 2 skipped, 0 failed.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5560 tools/deploy_to_pixel9a_emulator.sh` passed its test
  and assemble steps, installed the debug APK, and launched the app.
- English picker search `navy` returned `navy beans`; the French picker returned `haricots Navy`.
  English `light corn syrup` returned the new row; French `sirop de mais leger` returned
  `sirop de maïs clair`. The empty draft was discarded and the French home returned to 114 recipes.

| 942-reference follow-up screenshot | SHA-256 |
|---|---|
| [English Navy-bean picker](screenshots/picker-navy-en.png) | `612cf73c243753799e332acd4905e8071910f7b9eaa1eade3282a1bc589d9748` |
| [French Navy-bean picker](screenshots/picker-navy-fr.png) | `b82f32310d105e8758ebca09cd8b575e4877f869545bcda60f9cd6f5b20bdb8f` |
| [English light-corn-syrup picker](screenshots/picker-light-corn-syrup-en.png) | `573dfbd7bdb33c07d1d280c647b7fbf6c562cb2121e5bfdf3bc7c01c4a192756` |
| [French light-corn-syrup alias picker](screenshots/picker-light-corn-syrup-fr.png) | `ffbc01e95be07777f6f7aa8e0c0abc203c3358eba98ad02b45c8fce5edd779dd` |
| [Restored French home, 114 recipes](screenshots/home-fr-114-recipes-942.png) | `e34857b536b17e8316bbe10666901d78465110947464b5a7a91dfa1b032f8a55` |

The same fingerprints are in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).
