# WP02/WP06/WP08 focused catalog integration — 2026-10-10

## Accepted decisions

- **Almond flour boundary:** retain `ingredient-ref-almond-flour`; remove the broad English alias
  `ground almonds`, keep `poudre d'amande`, and add `poudre d'amandes`. Keep `almond meal`
  unassigned because source labels do not establish one stable grind/process boundary and the
  bundled recipes do not request it. See the [WP02 review](../../proposals/wp02-almond-flour-meal-boundary-review-20261010.md).
- **Awaze:** add `ingredient-ref-awaze` as an identity-only `SAUCE_AND_CONDIMENT` reference with
  `awaze` in both display fields and narrow English aliases `awaze sauce` and `awaze paste`. The
  Québec French borrowed display remains provisional; berbere and generic pepper-sauce identities
  stay separate. See the [WP06 review](../../proposals/wp06-ethiopian-awaze-condiment-boundary-review-20261010.md).
- **Mitmita:** add `ingredient-ref-mitmita` as an identity-only `BAKING_AND_SPICE` reference with
  `mitmita` in both display fields and `mitmita powder` as its only English alias. OLO distinguishes
  it from berbéré, and a regional Ethiopian study documents mitmita powder. The borrowed French
  display remains provisional; berbere, generic chili powder, and prepared awaze stay separate.
  See the [WP06 review](../../proposals/wp06-mitmita-berbere-boundary-review-20261010.md).
- **Hazelnut meal boundary:** keep the existing `hazelnut flour / farine de noisette` row unchanged
  and leave hazelnut meal unassigned. Bob’s Red Mill and Oregon Hazelnut Industry use “meal” and
  “flour” for the same ground product; an indexed supplier listing distinguishes coarse and fine
  grades, but its page was not directly accessible. The evidence does not establish a market-wide
  boundary or recipe demand. See the [WP02 review](../../proposals/wp02-hazelnut-flour-meal-boundary-review-20261010.md).
- **Flour and cornstarch:** add a separate all-purpose-flour → cornstarch ledger finding for sauce
  and gravy thickening. Illinois Extension compares 2 Tbsp flour or 1 Tbsp cornstarch per cup of
  liquid, and USU lists the direct flour-to-cornstarch direction. Keep the existing cornstarch →
  flour finding separate. Neither direction is an automatic rule because the current resolver
  cannot enforce thickener role, sauce/gravy context, method, or fixed-liquid volume basis. See the
  [WP08 review](../../proposals/wp08-wheat-flour-cornstarch-thickening-context-review-20261010.md).
- **Sour cream and Greek-style yogurt:** add four direction/context findings to the research ledger:
  sour cream → plain Greek-style yogurt in selected baking, one specific ranch formula, and
  method-limited soup; plus plain Greek-style yogurt → sour cream for selected uncooked uses. Keep
  generic plain yogurt and Greek-style yogurt distinct. No runtime rules or recipe-line swaps were
  added because the model cannot enforce form/fat, method, and source-specific amount constraints.
  See the [WP08 review](../../proposals/wp08-sour-cream-greek-yogurt-context-review-20261010.md).
- The previously integrated green-banana flour, green-plantain flour, Ghanaian shito, and
  buttermilk-to-acidified-milk findings remain part of this verification packet. They have no new
  recipe links or runtime substitution rules.

## Catalog and recipe snapshot

The integrated seed contains **710 ingredient references and 34 forms**. The research ledger
contains **899 records, 1,754 source entries, and 1,438 distinct source IDs**. The package still
contains **114 recipes and 1,123 ingredient rows**; its manifest-ordered recipe-corpus digest is
`921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629`.

The new awaze reference has no forms, density, unit mappings, measurements, conversions, yields,
recipe links, or substitution findings. No almond forms or numeric data were added. The new flour →
cornstarch finding is ledger-only; both active substitution arrays remain empty.

## Verification

| Check | Result |
|---|---|
| Bundled package normalization | Passed; already normalized |
| Ingredient-reference normalization | Passed; already normalized |
| Generated Kotlin catalog freshness | Passed; current at 710 references |
| Research-ledger / package schema validation | Passed; 899 records, 0 errors |
| Python seed-package tests | Passed; 10 tests |
| Android unit tests | Passed; 323 tests, 0 failures |
| Pixel 9a / Android 16 instrumentation | `emulator-5556`: 30 cases, 28 passed, 2 skipped, 0 failures/errors. Gradle also saw `emulator-5554`, where installation failed for insufficient storage and 0 tests ran. |
| Pixel deployment | `tools/deploy_to_pixel9a_emulator.sh` passed its test and APK assembly steps, installed the APK on `emulator-5556`, and launched RecipeBook. |
| `git diff --check` | Passed |

## Pixel picker results and screenshots

The deployed fresh-seed picker returned `mitmita` for `mitmita powder`, `awaze` for `awaze sauce` and
`awaze paste`, and shito for `pepper sauce`. The French phrase `poudre d'amandes` returned almond flour;
French `farine de noisette` returned the localized hazelnut-flour identity. The held queries `ground
almonds`, `almond meal`, `hazelnut meal`, `Ethiopian chili powder`, and `Ethiopian hot sauce` returned
no result after the search settled. Existing owner app data was backed up before the fresh-seed pass;
the owner database and recipe-catalog preferences were restored with hashes matching the backups.
After deployment, the app was left in French and the home showed all 114 recipes. The final emulator
SHA-256 values are `4e5175c27806ed5778755164716b9e2fbf8f09ca0616df7e387211afa4c22621` for
`databases/recipebook.db` and `6d10aedaacfdb21227ab2053e3f6925cdee41da910111f0258dcb384f33073c8` for
`files/datastore/recipe_catalog.preferences_pb`; both match their pre-run backups. The app-language
preference is now set to French (`d116672ec5a029be8308bac97ad535bd4365844149bb44a97ec4edbffbe83ba0`).

| Screenshot | Check | SHA-256 |
|---|---|---|
| [picker-mitmita-powder.png](picker-mitmita-powder.png) | `mitmita powder` → mitmita | `134dd5c58818e4bf40a5151d8f1c77170bef829961bba0275e4a7708010689eb` |
| [picker-awaze-sauce.png](picker-awaze-sauce.png) | `awaze sauce` → awaze | `d8e77bc8a974385d04044b6f8a77b7bd22a033cadc49a3b11d99ad1d5425e178` |
| [picker-awaze-paste.png](picker-awaze-paste.png) | `awaze paste` → awaze | `58e8842ef85251eb51268e4be2d6068974c195696377c879f9da1e51346ea989` |
| [picker-pepper-sauce-shito.png](picker-pepper-sauce-shito.png) | `pepper sauce` → shito | `972ec8542f7243bde3efddb0a55ba6fc5b8581e1a784df2d94c5f824dc2c7c79` |
| [picker-poudre-damandes-alias.png](picker-poudre-damandes-alias.png) | `poudre d'amandes` → almond flour | `508df5b3dbabfec33fbc97ee8860805d665319fe0d39ff8b0cc7a73e756bb201` |
| [picker-fr-farine-de-noisette.png](picker-fr-farine-de-noisette.png) | French `farine de noisette` → farine de noisette | `1c9568063d0bb7255c3234c4578998284393ae154da67ee60d38fb4147f0f6ba` |
| [picker-negative-ethiopian-hot-sauce.png](picker-negative-ethiopian-hot-sauce.png) | `Ethiopian hot sauce` → no result | `91901eeedcc1f444fa594f645ab860d369fb949566d11367c936ca6e6ab01495` |
| [picker-negative-ethiopian-chili-powder.png](picker-negative-ethiopian-chili-powder.png) | `Ethiopian chili powder` → no result | `fba660fb515dc482dcb6f3a040836c0043e8d7c9b5383b058f54fdedb0183320` |
| [picker-negative-ground-almonds.png](picker-negative-ground-almonds.png) | `ground almonds` → no result | `59e3c197bbeda2066a3524f42ceff9805153d59d095a4687e713bba8bf955402` |
| [picker-negative-almond-meal.png](picker-negative-almond-meal.png) | `almond meal` → no result | `fe63ef8fefd6bf722fbc48dba251bfa75969c2dfd097d846ac2e2eabd42d1128` |
| [picker-negative-hazelnut-meal.png](picker-negative-hazelnut-meal.png) | `hazelnut meal` → no result | `f164cdde69d700faf094f1ad188c225c14ebc3f7a223e8bd94f3cf80a3dd36f9` |
| [home-restored-fr-114.png](home-restored-fr-114.png) | Final French home; 114 recipes | `7112f7c3deb2536914ba28f429bb377693fe1b1f41dcc2928d769172bca8ada2` |

## Final artifact hashes

| Artifact | Count / status | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 710 references | `bafb292cc5635dc0d0e6bfbc3d4d8ee2f2e82dae0a90887636e87458111f1ffc` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `manifest.v1.json` | Normalized | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 899 records / 1,754 source entries / 1,438 distinct source IDs | `4d2dd2976128ac09f9562480a2c4af43494f459ee9cca4099e66f4d03d9e63fa` |
| `BundledIngredientCatalog.kt` | Current generated index | `530044eb00a1c5398e0252252931140e56627f64e471da6e180519e38e1d0bdd` |
| Manifest-ordered recipe corpus | 114 recipes / 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |
