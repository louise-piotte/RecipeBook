# WP02 Section 04 B3 — katakuriko potato-starch alias (R118)

## Decision

Added romanized `katakuriko` to both alias arrays on the existing
`ingredient-ref-potato-starch` reference. Current Japanese manufacturer and Canadian product
sources identify the market product as potato starch, and Télé-Québec uses the term alongside the
Québec French name `fécule de pomme de terre`. The row's displays, category, other aliases, null
density, and empty unit mappings remain intact. No separate *Erythronium* starch identity or
Japanese-script alias was added.

The bundled corpus has no matching recipe ingredient or reference link. No form, recipe link,
conversion, yield, or active substitution rule was added.

## Measurements and method-specific alternative

The research ledger records a Canadian retailer's 10 g nutrition serving for one 300 g Gishi
product as a product-page observation. It is not a household measure, density, or reusable serving.
Gishi and Ozawa package sizes remain package weights only.

The ledger also records Télé-Québec's qualitative choice of potato starch or cornstarch for dusting
and rolling mochi. The finding is directed potato starch → cornstarch and limited to that method.
The recipe gives no amount, ratio, or tested equivalence; no reverse direction or general use is
inferred.

## Evidence and validation

The [proposal](../../proposals/wp02-b3-katakuriko-potato-starch-alias-review-r118-20261014.md)
contains the source register and picker-boundary audit. The existing OQLF potato-starch source ID was
reused rather than duplicated. Section 04 B3 remains open.

Static package and ledger validation, reference normalization, generated-index freshness, alias
ownership, recipe-corpus, UTF-8/no-BOM, local-link, and whitespace checks passed. No app, Gradle,
instrumentation, or emulator tests were run because this integration adds database JSON data under
the updated `AGENTS.md` rule.
