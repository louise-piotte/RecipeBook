# WP02/WP03/WP04 R179 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Tarwi flour](../../proposals/wp02-b2-tarwi-andean-lupin-flour-boundary-review-r179-20261016.md), [Frosted Flakes Less Sugar Multigrain Cereal](../../proposals/wp03-section-f-frosted-flakes-less-sugar-multigrain-identity-review-r179-20261016.md), and [Haitian smoked-herring chiktay](../../proposals/wp04-section-p-haitian-smoked-herring-chiktay-product-boundary-review-r179-20261016.md).

## Integrated decisions

- **WP02 B2 — Tarwi (*Lupinus mutabilis*) flour:** Held a separate flour reference and all aliases outside the active catalog and research ledger. The reviewed flour is a real process-sensitive product, but current evidence does not establish a Canadian consumer product or product-matched Québec French name. Existing white- and blue-lupin flours remain species-qualified and unchanged.
- **WP03 Section F — Frosted Flakes Less Sugar Multigrain Cereal:** Added identity-only `Kellogg's Frosted Flakes Less Sugar Multigrain Cereal / Céréales Kellogg's Frosted Flakes Multigrains Moins de sucre` as `GRAIN_AND_CEREAL`. Keep the named ready-to-eat branded product separate from loose multigrain flakes, bran-flakes cereal, corn flakes, and other Frosted Flakes variants. Record the 41 g label basis only as a product- and claim-specific ledger observation. No aliases, forms, active measures, density, unit mappings, recipe links, conversions, yields, or substitutions were added.
- **WP04 Section P — Haitian smoked-herring chiktay:** Held generic chiktay and the proposed herring-specific row outside active references, forms, and the research ledger. Current local products vary by fish and preparation, and the bundled corpus does not select a narrower product identity. No data was added.

All three reviews found no matching demand in the manifest-listed **114 recipes / 1,123 ingredient rows**. Only the named cereal product was added; the other two decisions are documentation-only holds.

## Source registration

- Added the current English and French manufacturer pages and the corroborating Metro Québec listing to the Frosted Flakes cereal ledger record. The Metro page was indexed but unavailable to the browser directly; it is not the lead evidence.
- No ledger record or catalog data was added for Tarwi flour or chiktay. Reused sources remain with their existing ledger owners.

## Static data validation

- Bundled seed-package validation, ingredient-reference normalization checks, and generated Kotlin catalog freshness passed.
- JSON parsing, UTF-8/no-BOM, escaped-Unicode, ledger schema/source linkage, new source ID and URL ownership, and candidate-ID uniqueness checks passed.
- Picker projection, recipe-corpus scan, local Markdown links, and scoped whitespace checks passed.
- Totals: **1,556 references**, **122 forms**, **1,901 ledger records / 8,158 source entries / 6,969 distinct source IDs / 5,765 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.
- No software tests, builds, emulator runs, or deployments were performed. The catalog change only adds database JSON data under the updated `AGENTS.md` rule.

Broader WP02 B2/B3, Section F, and Section P coverage remains open.
