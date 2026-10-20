# WP02 / WP03 / WP04 R144 gap-review integration

Reviewed three remaining catalog candidates and integrated the Fresno pepper identity:

- **WP02 Section 04 B3:** held proso-millet starch (*Panicum miliaceum*) outside active references and the research ledger. Studies establish laboratory starch fractions, while reviewed Canadian and Québec product sources identify grain or flour. No standalone local starch product, product-specific Québec French name, or bundled recipe demand was established.
- **WP03 Section L:** added fresh-market `Fresno pepper / piment Fresno`, the English plural alias `Fresno peppers`, the qualified French alias `piment fort Fresno`, and one `fresh` form. Kept the French plural `piments forts Fresno` out because it would turn the currently empty generic `piments` query into a singleton. The product evidence does not establish a formal cultivar, species, origin, color, or fixed heat. No reusable measure, additional form, recipe link, or substitution was added.
- **WP04 Section P:** held Greenland cockle (*Serripes groenlandicus*) outside active references and the ledger. Canadian product sources support frozen raw or blanched meats, but activating the bilingual species row would make broad `cockle` and `coque` queries appear resolved while the generic cockle boundary remains open. The bundle has no matching ingredient demand.

The package now contains **1,501 ingredient references** and **118 forms**. The research ledger has **1,846 records**, **7,765 source entries**, and **6,621 distinct source IDs**. The bundled corpus remains **114 recipes / 1,123 ingredient rows**.

Static package normalization and validation, reference normalization, generated-index freshness, ledger/schema validation, source-ID linkage, picker projection, recipe-demand review, UTF-8/no-BOM and ASCII-escaped database JSON, local-link, and scoped whitespace checks passed. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run: the only database changes add JSON data, which the updated `AGENTS.md` exempts from testing; the other decisions are documentation-only.

See the [WP02 proposal](../../proposals/wp02-section-04-b3-next-regional-starch-gap-review-r144-20261015.md), [WP03 proposal](../../proposals/wp03-section-l-next-fresh-chile-review-r144-20261015.md), and [WP04 proposal](../../proposals/wp04-section-p-next-shellfish-identity-gap-review-r144-20261015.md).
