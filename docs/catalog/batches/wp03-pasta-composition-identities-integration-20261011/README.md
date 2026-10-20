# WP03 pasta composition and state-boundary integration

Date: 2026-10-11

## Integrated decisions

Added identity-only `whole-wheat pasta / pâtes de blé entier` and `gluten-free pasta / pâtes sans gluten` in `GRAIN_AND_CEREAL`. Whole-wheat pasta stays separate from whole-wheat flour, generic pasta, egg pasta, shapes, and fresh/dry states. Gluten-free pasta denotes the marketed finished-product claim across different grain and pulse formulas; it does not define one grain, recipe composition, shape, or state. The gluten-free identity has no aliases.

The broader fresh/dry pasta review is complete, with both states held off the broad pasta identity. Generic pasta is not wheat-specific, Québec fresh-pasta wording can imply egg composition, and no bundled recipe line requests these states. Neither identity received forms, density, unit mappings, measurements, package yield, conversion, substitution, or recipe links.

The current 114-recipe bundle has no matching whole-wheat-pasta or gluten-free-pasta ingredient line. The audit covers 1,123 ingredient rows. See the [whole-wheat](../../proposals/wp03-section-g-whole-wheat-pasta-identity-boundary-review-20261011.md), [gluten-free](../../proposals/wp03-section-g-gluten-free-pasta-identity-boundary-review-20261011.md), and [fresh/dry](../../proposals/wp03-section-g-fresh-dry-pasta-form-boundary-review-20261011.md) boundary reviews and the [Section G plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).

Two adjacent noodle reviews also ended in holds. Flat rice noodles / rice sticks have a distinct flat-strip boundary, but no bundled recipe demands them and the proposed names would match unresolved broad rice-noodle searches. Generic glass/cellophane noodles remain held because market products use differing starches; keep the mung-bean and sweet-potato-starch identities source-qualified. The existing longer `sweet potato glass noodles` alias still makes a bare `glass noodles` search surface that specific row through phrase matching. Neither review added catalog data or numeric behavior; see the [flat rice review](../../proposals/wp03-section-g-flat-rice-noodles-rice-sticks-boundary-review-20261011.md) and [glass-noodle review](../../proposals/wp03-section-g-glass-noodles-starch-source-boundary-review-20261011.md).

## Pixel 9a picker QA

On Android 16 / API 36 disposable `RecipeBook_Pixel_9a_QA` (`emulator-5556`), the English and French picker searches returned the intended identities:

- `whole wheat pasta` → `whole-wheat pasta`
- `pates alimentaires de ble entier` → `pâtes de blé entier`
- `gluten free pasta` → `gluten-free pasta`
- `pates sans gluten` → `pâtes sans gluten`

The same session completed the pending bilingual egg-pasta and Scotch Bonnet picker checks; their result screenshots are in their integration batches. The blank draft was discarded. The app returned to `Toutes les recettes (114)` in French; the owner emulator `emulator-5554` was not used.

## Package state and verification

The package has **975 references / 61 forms / 114 recipes / 1,123 ingredient rows**. The ledger has **1,250 records / 3,952 source entries / 3,244 distinct source IDs / 8 unit conversions**.

For the integrated data and picker coverage, the bundled package checks passed, **115 Python package tests** passed, **428 Android unit tests** passed, and connected Android 16 instrumentation reported **62 total: 60 executed, 2 skipped, 0 failures**. Deployment installed and launched the APK on disposable `emulator-5556`.

Captures are 1080 × 2424. SHA-256 values are also in [SHA256SUMS.txt](screenshots/SHA256SUMS.txt).

| Screen | SHA-256 |
| --- | --- |
| English whole-wheat result | `940281ce013780b7dd100f4fb3416ee844ab121b484fc4ba9d39da862d10d556` |
| French whole-wheat result | `666655b69951114be4abb1ceb2492798c7619aa545b10944b4b60e88a65377d1` |
| English gluten-free result | `f2108b0dd9122917af17736da3c436a4edc7741c42d4a7a91258d95041cbfaad` |
| French gluten-free result | `02a1370afcbac35d96110cfd7fd47f38cc2310a889eeebf5fdefe2c43f2764f6` |
| Restored French home (114 recipes) | `45ac3f9ed7b6b87c2e6929d34076a160fb2beb26561c9b4ad3b39f0b53553b65` |

## Remaining Section G work

The explicitly named rice-noodle subsection is complete as integrations or evidence-backed holds. Other Section G work—including prepared dumpling/starch products, breads, crumbs, pastry doughs, and regional prepared starches—remains in the global plan. Broad fresh/dry pasta states and held generic noodle identities remain unavailable as active catalog rows.
