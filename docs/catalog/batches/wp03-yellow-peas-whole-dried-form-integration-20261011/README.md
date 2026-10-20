# WP03 Section H whole-dried yellow-pea form integration

Integrated the one recipe-backed form recommended by the [residual pulse-form corpus audit](../../proposals/wp03-h-pulse-form-residual-corpus-audit-20261011.md).

## Integrated form and recipe link

Added ingredient-form-yellow-peas-whole-dried under the existing ingredient-ref-yellow-peas identity and linked it only to recipe 105#1. The publisher’s recipe card specifies “2 cups dried whole yellow peas,” distinguishes them from split peas, and says their seed coats remain. This supports the exact whole, dry input for this row. The recipe’s soaking and cooking instructions do not create separate requested ingredient forms. [Bryanna Clark Grogan’s recipe card](https://veganfeastkitchen.blogspot.com/2013/02/homemade-habitant-pea-soup-soupe-aux.html)

Moved the already-existing state-qualified terms dried whole yellow peas, whole yellow peas, and pois jaunes entiers séchés from the base reference aliases to the form. Preserved the bundled row text “2 cups dried yellow peas”, its quantity 2, and unit cup.

No cup-to-mass value, density, unit mapping, package yield, soaking/cooked form, conversion, or substitution was added. The separate green/yellow split-pea identities remain unchanged. No aquafaba or generic bean-cooking-liquid identity was added: the only other identified liquid uses are the pinto can’s existing whole-can form and recipe-specific azuki cooking liquid instructions.

## Validation

- Bundled package validation passed.
- Generated ingredient-catalog freshness check passed at 1,081 references.
- The recipe’s exact line and quantity remain intact; only its form link changed.
- Database JSON is ASCII-escaped UTF-8 without BOM.
- No tests or emulator run: this batch only adds database JSON data and updates its documentation.

## Snapshot

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,081 | 3a381c9d6293786ddf26f8f9dcff3688400caebace60c293175797b67a7a87ab |
| Ingredient forms | 79 | e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419 |
| Research ledger | 1,380 records; 4,572 source entries; 3,742 distinct source IDs | 951867ea3e6f3d035d484d84234dd223996080e5c74b27422193be5f040c2258 |
| Manifest | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Recipe corpus | 114 files; 1,123 ingredient rows | 5d3ac3f9b0ea87ee42539255594754b782b4c0f99cf3dea7277fe096c7737425 |
| Generated Kotlin index | 1,081 references | 4f1fbc2a12d1b67daeaf7fac0303a414b127d29043a6d2aaa688d5465cfed393 |
