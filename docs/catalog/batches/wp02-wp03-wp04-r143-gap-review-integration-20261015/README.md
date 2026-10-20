# WP02 / WP03 / WP04 R143 gap-review integration

Reviewed three open catalog gaps and integrated the banana-pepper identity:

- **WP02 Section 04 B3:** held isolated finger-millet starch (*Eleusine coracana*) outside active references and the research ledger. Canadian studies establish a research fraction, while reviewed Canadian-facing products were grain or flour; no standalone starch product, product-specific Québec French starch name, or bundle demand was established.
- **WP03 Section L:** added fresh-market `banana pepper / piment banane` with only the English plural alias `banana peppers` and one `fresh` form. French aliases remain empty. The separate hot-qualified identity and terms remain held because Québec product evidence for `piment banane fort` is preserved-only, while a second row would make broad `banana pepper` and `piment banane` searches return two choices. No reusable measure or bundle recipe link was added.
- **WP04 Section P:** held Atlantic surf clam (*Spisula solidissima*) outside the active picker and ledger. Québec sources establish its identity and a canned local product, but an active bilingual row would make broad `clam`, `surf clam`, and `mactre` searches misleading singletons while generic clam and Stimpson surf-clam choices remain unresolved.

The existing R142 AP/Milk Street paprikash either/or is now a `researched_supported` ledger finding from Hungarian Wax to banana pepper for that named recipe only. No active global or contextual substitution rule, bundled recipe-line link, quantity conversion, or measure was added.

The package now contains **1,500 ingredient references** and **117 forms**. The research ledger has **1,845 records**, **7,758 source entries**, and **6,614 distinct source IDs**. The bundled corpus remains **114 recipes / 1,123 ingredient rows**.

Static package normalization and validation, reference normalization, generated-index freshness, ledger/schema validation, source-ID ownership, picker projection, recipe-corpus scan, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run: the catalog addition only adds database JSON data, and the other decisions are documentation-only under the updated `AGENTS.md` rule.

See the [WP02 proposal](../../proposals/wp02-section-04-b3-finger-millet-starch-product-boundary-hold-r143-20261015.md), [WP03 proposal](../../proposals/wp03-section-l-banana-pepper-identity-review-r143-20261015.md), and [WP04 proposal](../../proposals/wp04-section-p-atlantic-surf-clam-picker-boundary-review-r143-20261015.md).
