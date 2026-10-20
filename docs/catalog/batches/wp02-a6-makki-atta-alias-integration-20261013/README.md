# WP02 A6 Makki atta alias integration

Added `makki atta` and `makki ka atta` as English aliases on the existing
`ingredient-ref-whole-kernel-corn-flour` reference. The French display, category, and empty French
alias list remain unchanged. Cornmeal, cornstarch, masa harina, precooked corn flour, and roasted
corn flour remain separate identities.

Recorded the three Health Canada CNF food-code 4417 values (100 mL = 49.5 g, 250 mL = 123.6 g, and
one serving = 20.0 g) as source-specific ledger observations only. Runtime density and unit mappings
remain empty. General wheat-flour replacement remains blocked because the located bread study tests
maize meal in specific formulas and does not establish equivalence to this reference.

The proposal documents the product-name evidence, OQLF corn-flour/cornmeal boundary, exact-key and
picker audit, and the full recipe-corpus scan: [Makki atta review](../../proposals/wp02-a6-next-regional-flour-gap-review-20261012-round2.md).

Static package validation, generated-catalog freshness, ledger-schema validation, exact query
ownership, 114-file corpus, UTF-8/no-BOM, Unicode-escape, and whitespace checks passed. No app or
emulator tests were run because this adds catalog data and refreshes its generated index without
changing application behavior. A6 remains open.
