# WP02 / WP03 / WP04 catalog gap integration — 2026-10-11

## Scope and decisions

Integrated three proposal-only review streams into the canonical seed, research ledger, checklist, and search tests. The proposals and their source detail remain in `docs/catalog/proposals/`.

Accepted six identity-only ingredient references:

- `whole rye flour / farine entière de seigle`, with only `complete rye flour` as an English alias. White/light/medium/dark grades remain held; rye meal and pumpernickel remain distinct.
- `Graham flour / farine Graham`, with no aliases and distinct from whole-wheat flour, Graham cracker crumbs, and composite products.
- `puffed buckwheat / sarrasin soufflé`, with the English alias `buckwheat puffs`.
- `puffed spelt / épeautre soufflé`, with the English alias `spelt puffs`; it remains separate from emmer and generic puffed wheat.
- `puffed barley / orge soufflée`, with no aliases. The French wording is recorded as local culinary language, not a standardized or retail-label term.
- Whole-seed `black chickpeas / pois chiches noirs`, with the scoped `black chickpea`, `kala chana`, `pois chiche noir`, and `kala chana` aliases. This does not equate all Desi chickpeas with black chickpeas or alias black gram/black beans.

Held two candidates without creating active references: generic mung-bean flour, because the available French term does not distinguish the relevant species; and whole-kernel puffed oats, because current Québec French product evidence does not name that exact scope. The sources and boundaries are recorded in the ledger and proposal files.

Reviewed four exact pie-shell lines without deriving masses or changing recipe text: `107#1` (one prebaked, cooled 5-inch crust), `089#8` (four individual 5-inch shells of unknown state), `108#1` (one raw 5-inch shell plus extra top dough), and `109#1` (one raw 5-inch shell). Each remains count-only with count-to-mass blocked. The existing crust observations were not changed.

No forms, measurements, conversions, recipe ingredient links, or substitutions were added for the six accepted identities. The package remains at 901 references, 48 forms, 114 recipes, and 1,123 ingredient lines. The ledger has 1,153 records, 2,986 source entries, and 2,391 distinct source IDs; this batch adds 91 source entries/IDs.

## Verification

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` — 61 tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon` — 378 unit tests passed.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon` — 34 cases reported, 32 passed, 2 skipped, 0 failed.
- Package normalization, ingredient-reference normalization, generated Kotlin freshness, deployment helper, and debug assembly passed.
- Installed and launched on an isolated Android 16 Pixel 9a AVD clone. The English home showed 114 recipes and returned to 114 after discarding the unsaved QA draft. Manual ingredient-picker checks returned the reviewed rows for English and French search terms; exact bilingual lookup is also covered by the Kotlin search fixtures. Screenshots: [launch](screenshots/00-launch.png), [puffed buckwheat EN](screenshots/01-puffed-buckwheat-en.png), [puffed buckwheat FR](screenshots/03-puffed-buckwheat-fr.png), [puffed spelt EN](screenshots/puffed-spelt-en.png), [puffed spelt FR](screenshots/puffed-spelt-fr.png), [puffed barley EN](screenshots/puffed-barley-en.png), [puffed barley FR](screenshots/puffed-barley-fr.png), [Graham flour EN](screenshots/graham-en.png), [Graham flour FR](screenshots/graham-fr.png), [black chickpeas EN](screenshots/black-chickpeas-en.png), [black chickpeas FR](screenshots/black-chickpeas-fr.png), [whole rye flour EN](screenshots/whole-rye-en.png), [broad French `seigle` query](screenshots/whole-rye-fr.png), and [home after draft discard](screenshots/10-home-after-discard.png).
- The original owner AVD userdata SHA-256 remained `48D6753085207CBBDF6B1C2BC9416AF3FE92AD42F6000ED5CFA49103ED0F9997` after testing.

Broader WP02/WP03/WP04 checklist work and independent Québec terminology review remain open.
