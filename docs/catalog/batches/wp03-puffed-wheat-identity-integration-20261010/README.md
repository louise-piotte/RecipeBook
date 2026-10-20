# WP03 Puffed Wheat Identity Integration

**Date:** 2026-10-10
**Scope:** one identity-only grain reference, its bounded evidence states, package normalization, unit coverage, and Pixel 9a picker verification.

## Decision

Added `ingredient-ref-puffed-wheat` as `puffed wheat / blé soufflé` in `GRAIN_AND_CEREAL`. It has no aliases, forms, recipe links, density, unit mappings, or substitution rule. Puffed rice and crispy rice cereal remain separate; coated puffed wheat is not an alias for plain puffed wheat. The identity does not imply a whole-grain claim.

The seed row has a verified identity. Its ledger retains one **brand-specific** measurement observation from Health Canada's historical food portion table: Quaker™ puffed wheat, 250 mL = 13 g. This is not a general density or cup conversion and activates no unit mapping. The broad CFIA 14 g reference intake for puffed cereals is not treated as a kitchen portion. Measurement research records the source-scoped observation; no generic measure is inferred.

No supported substitution was found. A search-result suggestion to replace puffed wheat with puffed rice at a 1:1 ratio lacked tested or authoritative support and was recorded as rejected evidence, not a runtime rule.

No bundled recipe row used puffed wheat or a coated variant, so no recipe was edited or linked. The catalog remains separate from the active recipe library.

## Sources and limits

- [Usito, *blé*](https://usito.usherbrooke.ca/d%C3%A9finitions/bl%C3%A9) identifies *blé soufflé* as the French term for heat-expanded wheat grains. This supports the bilingual identity name.
- [Statistics Canada MDFoodCode table, code 933](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf) lists puffed wheat separately from puffed rice and shredded wheat.
- The [withdrawn 1988 Canadian General Standards Board breakfast-cereal specification](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf) distinguished plain and coated puffed wheat. It is used as historical product-boundary evidence only.
- [CFIA grain and bakery product guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products) lists puffed cereals within refined cereal examples for its whole-grain-claim guidance. The identity therefore carries no inferred whole-grain status.
- [Health Canada, 2008 Table 2](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-2-breads-cereals-other-grain-products-nutrient-value-some-common-foods-2008.html) lists Quaker™ puffed wheat at 250 mL / 13 g. The brand, product, and historical table context remain attached to the observation.
- The [CFIA Schedule K reasonable daily intake table](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table) lists 14 g for the broad class of puffed cereals. That regulatory intake value is not a recipe portion or unit conversion.
- [Forktionary's puffed-wheat page](https://forktionary.com/ingredient/puffed-wheat-cereal) suggests a 1:1 puffed-rice replacement without tested support. It was rejected as insufficient evidence for a substitution.

## Package state and verification

- Active references: **796** (`daa87d5fec47b702f1555ad598f8c92b241b0ec0864865fb498afa1cc55327b8`).
- Forms: **36** (`1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef`).
- Research ledger: **1,022 records / 2,190 source entries / 1,772 distinct source IDs** (`6632b7ed1154c775602683d3874745841fb7d53525f6e048a4c06138f6910165`).
- Legacy candidates: **81**; manifest recipes: **114**; recipe ingredient rows: **1,123**.
- Manifest: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Generated ingredient catalog: `5d3ba6ba589d26a7e85c9196a281399e8d221f2cde7d79368af31dae751a62a6`.
- Python seed-package suite: **27 passed**. Android unit suite: **344 passed**. Package and ledger validation, generated-index freshness, and `git diff --check` passed.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test/build steps, installed the debug APK, and launched the app. On the disposable Pixel 9a / API 36 clone (`emulator-5558`, 1080×2424 at 420 dpi), the cold first launch showed an Android not-responding dialog. One force-stop and relaunch recovered the app; all picker checks then passed.
- English `puffed wheat` showed `puffed wheat / blé soufflé`; English `puffed rice` showed the distinct `puffed rice / riz soufflé`; English `coated puffed wheat` showed no reusable ingredient. In French, accent-insensitive `ble souffle` showed `blé soufflé / puffed wheat`.
- The French home screen was restored to `Toutes les recettes (114)`. No ingredient draft was created. The owner AVD image SHA-256 remained `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` before and after. The disposable clone was shut down.
- Debug APK SHA-256: `97360471da96271eb88acf3f1f0600b4ce29c21a1f910c547e3593fccd542228`.
- Captured UI evidence and hashes are in [`screenshots/`](screenshots/) and [`SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Related proposal reviews

Three parallel proposal-only reviews were checked against their stated live package and source boundaries. They made no catalog changes:

- [WP02 Québec flour terminology review](../../proposals/wp02-quebec-white-whole-wheat-terminology-review-20261010.md): retain the current white whole-wheat display; keep alternate wording and mill/SKU descriptors out of aliases and generic identities.
- [WP03 sushi-rice boundary review](../../proposals/wp03-section-f-sushi-rice-boundary-review-20261010.md): keep generic sushi rice unresolved because dry products marketed for sushi span different grain classes and the phrase also describes seasoned cooked rice.
- [WP04 package-count residual review](../../proposals/wp04-next-animal-food-count-residual-20261010.md): keep recipe 081#12's existing 15 oz cream-of-coconut can note source-specific; leave recipe 015#4's beef-broth can size unavailable.

These reviews do not close the remaining WP02, WP03 Section F, WP04 animal-food, or count/portion evidence work in the plan.
