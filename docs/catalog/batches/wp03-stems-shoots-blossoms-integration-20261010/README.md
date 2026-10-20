# WP03 stems, shoots, blossoms, and sprouts integration — 2026-10-10

## Integrated identities

Retained `ingredient-ref-celery` and `ingredient-ref-asparagus`; added only source-supported aliases:

- Celery: `branch celery`, `céleri-branche`, and `céleri à côtes`.
- Asparagus: singular French `asperge`.

Added ten identity-only `VEGETABLE_AND_AROMATIC` references:

| ID | English / fr-CA display | Alias boundary |
| --- | --- | --- |
| `ingredient-ref-florence-fennel` | Florence fennel / fenouil de Florence | `fennel bulb`, `bulb fennel`; French `fenouil bulbeux`; bare fennel/fenouil and seed terms excluded. |
| `ingredient-ref-globe-artichoke` | globe artichoke / artichaut | English `artichoke`; separate from Jerusalem artichoke and canned/marinated hearts. |
| `ingredient-ref-banana-blossom` | banana blossom / fleur de bananier | `banana flower`, `banana flower bud`; separate from fruit and leaf. |
| `ingredient-ref-squash-blossoms` | squash blossoms / fleurs de courgettes | Flower/blossom phrases for squash and zucchini; French singular `fleur de courgette`. |
| `ingredient-ref-nopal-pads` | nopal pads / feuilles de cactus nopal | `nopales`, `nopalitos`; separate from prickly-pear fruit and generic cactus leaves. |
| `ingredient-ref-fiddleheads` | fiddleheads / têtes-de-violon | `fiddle-head`, `crosse de fougère`, `crosse de fougère-à-l'autruche`. |
| `ingredient-ref-pea-shoots` | pea shoots / pousses de pois | `pea microgreens`, `micropousses de pois`; separate from mature peas and sprouts. |
| `ingredient-ref-alfalfa-sprouts` | alfalfa sprouts / germes de luzerne | No aliases; separate from microgreens. |
| `ingredient-ref-mung-bean-sprouts` | mung bean sprouts / germes de haricot mungo | No generic `bean sprouts` or `germes de haricot` alias. |
| `ingredient-ref-soybean-sprouts` | soybean sprouts / germes de soya | No generic bean-sprout alias; separate from mung sprouts. |

Recipe lines 077#5, 105#7, and 104#1 remain linked to their existing celery/asparagus identities. No new identity has recipe-line demand. The artichoke mention in recipe 104 is a method note only.

## Ledger evidence and runtime scope

Added 33 source records and source-specific evidence observations, including historical Health Canada portions, the 65 g pea-microgreen package, and size-specific celery/asparagus portions. These do not set default densities or unit mappings. No forms, generic conversions, yield rules, or substitutions were activated. Generic shoots, sprouts, blossoms, `bean sprouts`, and overlapping `germes de haricot` remain unresolved.

The proposal records exact source and product limits: [WP03 identity review](../../proposals/wp03-stems-shoots-blossoms-identity-review-20261010.md).

## Package snapshot

The final shared-package totals and artifact fingerprints are recorded in the [WP04 butter integration snapshot](../wp04-butter-products-integration-20261010/README.md#package-snapshot): 853 ingredient references, 47 forms, and 1,099 research-ledger records.

## Verification

- Package normalization, ingredient-reference normalization, generated-index freshness, and ledger validation passed; the 1,099-record ledger had no validation errors.
- Python bundled-seed package tests: 29 passed. Android unit tests: 349 passed, 0 failed. Connected instrumentation: 30 cases, 28 passed, 2 skipped, 0 failures/errors.
- The `stemsShootsAndSproutsKeepBilingualProductBoundaries` catalog test checks the English/French boundaries. The ten new identities have no bundled recipe-line demand, so the Pixel 9a screen check focused on seed loading and recipe navigation rather than an unsaved ingredient edit. The app opened all 114 recipes; shared screenshots are linked from the [butter integration verification](../wp04-butter-products-integration-20261010/README.md#verification).
- `tools/deploy_to_pixel9a_emulator.sh` passed, installed the debug APK, and launched the app on a disposable Pixel 9a / Android 16 API 36 clone. The original AVD image remained unchanged. `git diff --check` passed.
