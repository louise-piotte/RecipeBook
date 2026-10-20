# WP02/WP03/WP04 Residual Evidence Review Integration — 2026-10-11

## Scope and decisions

This evidence-only integration reconciles three reviews without changing active references, forms, recipes, measurements, mappings, conversions, yields, or substitutions.

| Area | Decision |
| --- | --- |
| Extracted taro-corm starch | Keep `candidate-taro-corm-starch` held. No exact Québec/Canadian French product name for isolated *Colocasia esculenta* corm starch was found. Keep taro flour separate and add no active row, alias, or numeric behavior. |
| Jute leaves and molokhia | Retain the existing distinct identities and aliases. Keep `feuilles de jute` and the molokhia French display provisional; reviewed Québec terminology does not settle species/leaf scope, and `molokhia` can also refer to soup. |
| Egg count evidence | Retain the three official FDC April 2026 one-count observations already in the ledger: 50.3 g whole egg without shell, 34.0 g white, and 17.0 g yolk. FDC item descriptions do not state species or preparation state, so all recipe-linked runtime egg measurements remain blocked. |
| Independent egg variability | Add nine derived `observed_sample_range` intervals across published UK sample-group means and U.S. retail brand means. The intervals describe ranges of published means, not individual-egg extrema or distributions. Preserve the original market, size, shell, preparation, basis, sample, and source qualifiers. |

### Recorded intervals

| Reference / part | Evidence basis | Range |
| --- | --- | ---: |
| Whole egg | UK raw shell-on medium-size sample-group means | 58.2–60.5 g |
| Whole egg | UK raw shell-on large-size sample-group means | 64.0–67.6 g |
| Whole egg | U.S. retail shell-on brand means; size class not stated | 59.6–62.4 g |
| Egg white | UK raw medium-size sample-group means | 34.4–37.5 g |
| Egg white | UK raw large-size sample-group means | 39.1–42.7 g |
| Egg white / albumen | U.S. raw retail brand means; size class not stated | 30.3–35.5 g |
| Egg yolk | UK raw medium-size sample-group means | 14.1–15.7 g |
| Egg yolk | UK raw large-size sample-group means | 15.7–17.7 g |
| Egg yolk | U.S. raw retail brand means; size class not stated | 14.9–21.4 g |

The UK values are ranges across the report's published sample-group averages, not ranges across individual eggs. The U.S. values are ranges across six reported brand means, not individual eggs. Do not equate the UK size bands with Canadian or U.S. carton classes. These intervals are separate from the FDC count portions and do not establish a recipe-line conversion.

## Review packets and sources

- [WP02 extracted taro-corm starch Québec term review](../../proposals/wp02-extracted-taro-corm-starch-quebec-term-review-20261011.md)
- [WP03 jute leaves and molokhia Québec identity review](../../proposals/wp03-jute-leaves-molokhia-quebec-identity-review-20261011.md)
- [WP04 FDC egg portions and source-preserving variability review](../../proposals/wp04-fdc-egg-portion-retrieval-variability-review-20261011.md)
- [Earlier WP07 FDC archive retrieval](../../proposals/wp07-fdc-chicken-egg-archive-retrieval-20261010.md)
- [Earlier WP07 egg variability review](../../proposals/wp07-fdc-chicken-egg-portion-retrieval-review-20261010.md)

The Québec terminology review for molokhia is grounded in the [OQLF GDT entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17486151/melochie), which includes `mélochie`, `corète`, and `mloukhiya`, describes multiple cultivated species, and notes the soup use. The official USDA [FDC data downloads page](https://fdc.nal.usda.gov/download-datasets/) identifies the Foundation Foods archive release used for the existing count portions. The variability sources and detailed limitations are documented in the WP04/WP07 proposal packets: the UK Department of Health's [egg sampling report](https://assets.publishing.service.gov.uk/media/5a7aa918ed915d71db8b19bf/Nutrient_analysis_of_eggs_Sampling_Report.pdf) and the U.S. retail egg study by [Hisasaga, Griffin, and Tarrant (2020)](https://pmc.ncbi.nlm.nih.gov/articles/PMC7705037/).

## Validation

- Bundled seed-package normalization check passed; the package remained unchanged.
- Generated ingredient-index freshness check passed at 927 references.
- Research-ledger validation passed: 1,184 records, 3,192 source entries, 2,582 distinct source IDs, 0 errors.
- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: 82 tests passed, including a regression check for all nine intervals and the blocked runtime state.
- No Android unit/instrumentation run or emulator deployment was needed for this ledger, proposal, and regression-test update; app-facing catalog data and runtime behavior did not change.
- Targeted UTF-8/no-BOM and whitespace checks are recorded with the final integration verification.

## Fingerprints

| File | SHA-256 |
| --- | --- |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | `e14ad6668bc34bd83f7e1fd3993ac023d5d748ff134fafd807583435d6850468` |
| `ingredient-forms.v1.json` | `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267` |
| `research-ledger.v1.json` | `56cb8e03300cb59696fbed1664d2c02bc2f3405ca92cd9014c178315ca1cee77` |
| `BundledIngredientCatalog.kt` | `65f7c5fab875aff1057d341acb7462cc356726a6c08ddbecbec80796a65b0b0a` |
