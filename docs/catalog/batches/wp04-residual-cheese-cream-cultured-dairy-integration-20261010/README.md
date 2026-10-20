# WP04 residual cheese, cream, and cultured-dairy integration

## Integration record

- **Integrated:** 2026-10-10
- **Scope:** Section Q residual cheese identities, cream product boundaries, and cultured-dairy gaps.
- **Package result:** Added 16 cheese identities, including cottage cheese, feta, and ricotta promoted from legacy candidates; added identity-only skyr, kefir, and ayran. Added three held research candidates for farmer cheese, double cream, and clotted cream.
- **Existing names corrected:** `cheddar / cheddar cheese`, `Gruyère / Gruyère`, `mascarpone / mascarpone`, `parmesan / parmesan cheese`, and accented `crème fraîche` in both language fields. Removed unsupported cream-cheese brick, bare whipping-cream, crème-à-fouetter, and coffee-cream aliases.
- **Recipe changes:** None. Existing recipe references remain intact; no source discrepancies were rewritten.
- **Runtime conversions and substitutions:** None added. Skyr/Greek-yogurt alternatives and Health Canada CNF portions remain source-specific ledger evidence.

## Identity boundaries

The accepted cheese set keeps generic Parmesan separate from Parmigiano Reggiano, generic Mexican queso fresco separate from queso fresco serrano and Québec fromage frais, and Brie distinct from Camembert. Fresh and North American mozzarella styles remain unlinked because the bundled mozzarella line does not state a style. Unqualified farmer cheese remains unresolved; `fromage fermier` is not used as its French equivalent. Queso Oaxaca, Cotija, and queso panela retain their source-market names provisionally in both locales.

For creams, heavy cream keeps only the exact `heavy whipping cream` alias; unqualified `whipping cream` and Québec `crème à fouetter` remain unresolved because the cited Canadian and U.S. classes have different fat boundaries. Half-and-half no longer claims `coffee cream`; generic 90 ml cream remains unlinked. Double and clotted cream remain held candidates. Crème fraîche stays distinct from sour cream.

For cultured products, skyr, dairy kefir, and ayran are distinct identities. The broad legacy yogurt candidate remains held, as do sweetened yogurt and process-based `strained yogurt`. Existing plain/Greek-style yogurt, buttermilk, and labneh records were retained.

## Measurement and substitution evidence

Health Canada Canadian Nutrient File measures for cheddar, part-skim mozzarella, shredded Parmesan, 1% cottage cheese, liquid/whipped cream, half-and-half, and light sour cream are stored only as exact food-code observations. They do not populate default densities or unit mappings. The branded `1/2 cup (125 g)` skyr portion is a published recipe observation; its Greek-style-yogurt alternatives are limited to the named Dairy Farmers of Canada cold recipes and are not an active rule. No cheese or cream replacement rule was activated.

The primary boundaries were checked against the CFIA's current incorporated dairy standards and OQLF terminology records. Those sources support product distinctions and Québec names, while source-specific recipe or nutrient-file amounts remain narrowly scoped.

## Evidence

- [`wp04-cheese-dairy-residual-identity-review-20261010.md`](../../proposals/wp04-cheese-dairy-residual-identity-review-20261010.md)
- [`wp04-cream-products-identity-review-20261010.md`](../../proposals/wp04-cream-products-identity-review-20261010.md)
- [`wp04-cultured-dairy-identity-gap-review-20261010.md`](../../proposals/wp04-cultured-dairy-identity-gap-review-20261010.md)

## Verification

The final shared-package totals and fingerprints are recorded in the [WP04 butter integration snapshot](../wp04-butter-products-integration-20261010/README.md#package-snapshot): 853 ingredient references, 47 forms, and 1,099 research-ledger records.

- Package normalization, schema validation, ingredient-reference normalization, generated-index freshness, and ledger validation passed; the ledger had no validation errors.
- Python bundled-seed package tests: 29 passed. Android unit tests: 349 passed, 0 failed. Connected instrumentation: 30 cases, 28 passed, 2 skipped, 0 failures/errors.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test/build steps, installed the debug APK, and launched the app on a disposable Pixel 9a / Android 16 API 36 clone. The home and Date Squares detail screens rendered with all 114 recipes loaded. No cheese or cultured-dairy recipe lines were changed, so verification did not create a recipe edit. Shared screen captures and the unchanged owner AVD hash are documented in the [Pixel verification record](../wp04-butter-products-integration-20261010/README.md#verification).
- `git diff --check` passed.
