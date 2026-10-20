# WP02/WP03/WP04 residual boundary integration — 2026-10-10

## Scope and package changes

This batch merges the baking-inclusion and decoration review, the Section F cereal residual review, the count-portion interval contract, and the exact recipe-reference links into the shared canonical seed package. The catalog plan and roadmap track the remaining evidence gaps.

- Added six identity-only references: candied ginger, candied lemon peel, candied orange peel, glacé cherries, nougat, and sugar pearls.
- Promoted the existing legacy butterscotch-chip ID into the active references. Its French display uses OQLF's preferred base term in a transparent descriptive phrase; it is not presented as a verbatim OQLF entry.
- Verified the existing marshmallow, marshmallow-crème, sprinkles, and chocolate-shavings identities. Changed the sprinkles French display to `bonbons décoratifs` and added only the source-attested crystallized-ginger aliases.
- Added granola and muesli as distinct processed-cereal identities. Corrected quick oats to `flocons d'avoine à cuisson rapide` and removed the unsupported short French alias. Red rice, hominy grits, and roasted buckwheat received bounded evidence decisions; no further aliases or measures were added.
- Linked Fraisier 045's sugar-pearl garnish and recipes 057/068's chocolate-shavings lines. The recipe text, quantities, units, notes, groups, and qualifiers remain as authored. No glacé-cherry row was inferred from the neighboring cherry recipes.
- Added a ledger representation for scalar observations and preserved intervals. Recipe 111's tuna steak source reports `10-12oz.` and `280-320g` per steak; both remain separate source-reported intervals with unknown endpoint semantics, and no midpoint, conversion, or active mapping was added.
- Added regression coverage for the new references, the three links, their preserved line context, and the absence of glacé-cherry recipe links.

No ingredient forms, density values, unit mappings, package yields, or substitution rules were added. The recipe count and authored recipe quantities remain unchanged.

## Evidence packets

- [WP02 baking-inclusions and decorations review](../proposals/wp02-baking-inclusions-decorations-boundary-review-20261010.md)
- [WP03 Section F residual cereal review](../proposals/wp03-section-f-residual-cereal-review-20261010.md)
- [WP04 count and portion interval contract](../proposals/wp04-count-portion-interval-contract-review-20261010.md)
- [Catalog workflow and interval rules](../ingredient-catalog-workflow.md)

Caramel bits, generic toffee bits, generic edible decorations, generic sushi rice, unqualified farro, pot-barley Québec picker wording, pearled hominy, pozole corn, extracted taro-corm starch naming, and broader count/portion evidence remain open. The focused caramel/toffee review keeps both identities held and corrects the prior SKOR/HEATH ingredient-specification conflation; see docs/catalog/proposals/wp02-caramel-toffee-product-boundary-review-20261010.md.

## Validation

- Final package: 862 ingredient references, 47 forms, 1,107 research-ledger records, 2,648 source entries / 2,072 distinct source IDs, and 114 recipes.
- `python3 tools/seed_package/normalize_bundled_seed_package.py`: passed with no changes; `--check` passed.
- Research-ledger validation passed; generated ingredient-catalog index freshness check passed.
- `python3 -m unittest tools.seed_package.test_bundled_seed_package`: passed, 33 tests.
- `GRADLE_USER_HOME=/home/louise/RecipeBook/.gradle-user-home ./gradlew test --no-daemon --console=plain`: passed.
- Pixel 9a instrumentation: an initial full run had one locale content-description timing timeout; the isolated case passed on retry, then the complete connected suite passed with 32 tests finished, 2 skipped, and 0 failures.
- `tools/deploy_to_pixel9a_emulator.sh`: passed its test/build/install/launch steps on the temporary Pixel 9a clone.
- Live picker checks returned one exact localized match for English `sugar pearls` and French `perles de sucre`; French `muesli` returned `musli`, accent-folded `avoine a cuisson rapide` returned `flocons d'avoine à cuisson rapide`, and `granola` returned `granola`. The French recipe home returned to 114 recipes after the unsaved draft was discarded. The final post-deploy English home also showed 114 recipes.
- The owner Pixel 9a `userdata-qemu.img` SHA-256 remained `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997`. QA used a separate AVD clone, which was shut down and removed after validation.
- `git diff --check`: passed.

### Pixel 9a screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English picker: one `sugar pearls` result | [catalog-residual-picker-en.png](screenshots/catalog-residual-picker-en.png) | `d6c6e1709807d81236e6f3a50215b2096d5b3304ff3689dde5afcb07ab580a5b` |
| French picker: one `perles de sucre` result | [catalog-residual-picker-fr.png](screenshots/catalog-residual-picker-fr.png) | `f8ea1aee61acf58f871e2424e77140533a3dad77e19a1cd1478f4b5f3d71fcca` |
| French home after draft discard: 114 recipes | [catalog-residual-home-final-fr.png](screenshots/catalog-residual-home-final-fr.png) | `205723ac21133ebb5ef639833086d6c876e6562c0e2578d2fdc9b27afd2c5331` |
| Final post-deploy English home: 114 recipes | [catalog-residual-home-after-deploy.png](screenshots/catalog-residual-home-after-deploy.png) | `baf723352a338900d1ca327c16428e2ac6631b2146d985fc965b3058373da565` |
