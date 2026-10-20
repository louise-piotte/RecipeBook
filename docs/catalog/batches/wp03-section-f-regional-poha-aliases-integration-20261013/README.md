# WP03 Section F regional flattened-rice aliases (2026-10-13)

## Decision

Add only `powa`, `pawa`, `pauwa`, `pauaa`, and `paunva` to the English aliases on the existing
`ingredient-ref-flattened-rice-poha` reference. Keep `poya` unassigned pending independent product
or regional terminology evidence.

The Government of India's NIFTEM PMFME presentation lists `Paunva - Gujarati` under flaked rice on
page 2 and says on page 19 that flaked rice is commonly sold as poha or pawa. Root independently
opened the PDF and verified both page locators. Current product and exporter pages support powa,
pauwa, and pauaa as names for flattened rice. Keep all five non-French terms in `aliasesEn`; do not
add them as French aliases or map them to the thin, medium, or thick forms.

Seven accepted source records and one additional source record supporting the unresolved `poya`
decision were added to the existing flattened-rice ledger record. The ledger records both the five
accepted aliases and why `poya` remains unassigned. The current
French displays and aliases, forms, density, mappings, recipe links, measurements, and blocked
grade-substitution state are unchanged. The 114-recipe / 1,123-row bundle has no matching term or
flattened-rice link.

## Static validation

The bundled seed package validator and catalog generator were run after integration. The generated
index matches the reference JSON. UTF-8/no-BOM, source-ID uniqueness, ledger schema, exact-key,
recipe-corpus, local-link, and whitespace checks passed.

No app tests or emulator checks were run because the change only adds database JSON data and its
generated catalog index.

See the [round-70 proposal](../../proposals/wp03-section-f-next-regional-poha-alias-cluster-review-20261013-r70.md).
Section F remains open.
