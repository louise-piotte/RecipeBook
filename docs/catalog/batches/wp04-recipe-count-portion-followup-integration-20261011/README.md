# WP04 Recipe Count and Portion Follow-up — 2026-10-11

## Decisions

### Sweet potato — recipe 090#13

Recorded one source-specific `count_weight` observation on `ingredient-ref-sweet-potato`: Cotter Crunch's linked recipe card pairs **10 oz (280 g)** peeled and cubed sweet potatoes with **about two small**. The ledger preserves the exact published mass/count pair and unknown weighing stage. No per-potato value, size rule, density, unit mapping, yield, conversion, or substitution was added. The bundled `2 small sweet potatoes, peeled and diced` line is unchanged.

Source ID: `WP04-SWEETPOTATO-PORTION-20261011-S01`, Lindsay Cotter / Cotter Crunch, [African Peanut Stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/), ingredient card updated 2022-07-20. The recipe-specific amount is not generalized to other uses. Full limits and comparative sources are in the [proposal](../../proposals/wp04-next-small-sweet-potato-count-portion-review-20261011.md).

### Carrot — recipe 105#6

Added a source-scoped unresolved decision to the existing carrot record. The bundled line remains four small carrots, diced; the linked publisher version lists two medium carrots and does not establish the bundle's adaptation. The existing CNF 2026 observation of 50 g for one small 14 cm carrot remains unchanged and is not scaled to this line. No new carrot measurement observation, recipe edit, density, or mapping was added.

The review citations are `WP04-NEXT-COUNT-PORTION-20261011-S01` (the linked publisher page) and `WP04-NEXT-COUNT-PORTION-20261011-S02` (USDA's 1986 food-code table). See the [proposal](../../proposals/wp04-next-count-portion-review-20261011.md) for the exact mismatch and the existing CNF portions.

### Banana — recipe 073#10

Added two source records and an unresolved decision to `ingredient-ref-banana`, with measurement state `blocked_pending_evidence`. Preppy Kitchen's linked card lists three very ripe mashed bananas as **1 1/2 cups**, but gives no mass or weighing stage. Health Canada's CNF 1704 gives generic raw mashed-banana portions of 95.1 g per 100 ml and 237.8 g per 250 ml; it does not establish matching ripeness or a shared measurement basis. No mass, edible-portion yield, density, unit mapping, or count conversion was derived. Recipe 073#10 remains three bananas, count, with its existing `very ripe, mashed` preparation.

Sources: `WP04-NEXT-BANANA-MASHED-20261011-S01`, [Preppy Kitchen](https://preppykitchen.com/chocolate-chip-banana-bread/); and `WP04-NEXT-BANANA-MASHED-20261011-S02`, [Health Canada CNF 1704](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1704). See the [proposal](../../proposals/wp04-next-banana-mashed-portion-gap-review-20261011.md).

### Celery — recipe 077#5

Added the directly linked RICARDO card as a source and a line-specific unresolved decision to `ingredient-ref-celery`. The page identifies itself as advertising content, so it is used only for this linked recipe wording, not as general measurement authority. The card says one celery branch, cut into small dice, and softens it in butter but gives no size, mass, trimming basis, or cooked weight. Health Canada CNF lists 17 g for a 13 cm small stalk, 40 g for a 19–20 cm medium stalk, and 64 g for a 28–31 cm large stalk; the recipe chooses none. The three existing source-specific CNF observations remain unchanged. No new measurement observation, mapping, trim adjustment, yield, or recipe edit was added.

Source ID: `WP04-NEXT-CELERY-STALK-20261011-S01`, RICARDO, [Pâté au saumon style pot en pot de Ricardo](https://www.ricardocuisine.com/recettes/6174-pate-au-saumon-style-pot-en-pot-de-ricardo); existing CNF evidence remains `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S02`. See the [proposal](../../proposals/wp04-next-celery-stalk-portion-gap-review-20261011.md).

## Package snapshot and checks

- Package unchanged by this ledger-only tranche: 889 references, 48 forms, 114 recipes, and 1,123 recipe rows.
- Research ledger: 1,139 records, 2,877 source entries, 2,286 distinct source IDs, and 179 measurement observations; validation reports zero errors.
- Reference normalization, seed-package validation/normalization, generated-index freshness, and all 56 Python seed-package tests passed.
- Android unit suite: 375 passed. The same merged catalog build passed 32 connected Android instrumentation cases (2 skipped, 0 failures) on the isolated Pixel 9a / Android 16 profile; placali was the only changed picker identity and its live bilingual checks are recorded in the [Placali report](../wp02-placali-identity-integration-20261011/README.md).
- No recipe file, active conversion, package yield, density, unit mapping, or substitution changed in this WP04 tranche.
