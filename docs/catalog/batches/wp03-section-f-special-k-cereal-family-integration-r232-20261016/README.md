# WP03 Section F R232: Canadian Special K cereal family

Added five distinct identity-only `GRAIN_AND_CEREAL` references using the current Canadian English
and French manufacturer titles:

- `Special K Red Berries Cereal / Céréales Special K Baies rouges`
- `Special K Vanilla Almond Cereal / Céréales Special K Vanille et amandes`
- `Special K Fruit & Yogurt Flavour Cereal / Céréales Special K Saveur Fruits et Yogourt`
- `Special K Original Cereal / Céréales Special K Original`
- `Special K Cinnamon Maple Crumble Flavour Cereal / Céréales Special K croustade à l'érable et à la cannelle`

All five have empty aliases, null density, and no unit mappings or forms. The Original 32 g
manufacturer portion and Fruit & Yogurt 1 cup (44 g) label serving are recorded only as
SKU-specific ledger observations. No reusable measure, conversion, yield, recipe link, or
substitution was added. The recipe bundle has no matching demand.

The current manufacturer family pages list these five cereals. Special K Blueberry remains outside
active references and the research ledger because the Canadian manufacturer family does not list
it and the reviewed Québec retailer pages do not establish current availability. See the [R232
proposal](../../proposals/wp03-section-f-special-k-cereal-family-review-r232-20261016.md) for its
bounded hold, product evidence, picker projection, and source-specific limits.

All five evidence records are in [`research-ledger.v1.json`](../../research-ledger.v1.json) under
the `WP03-SPECIALK-CANADA-R232-20261016-` prefix.

Static package normalization, generated-index freshness, ledger schema, source ownership, picker
projection, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed. No software
tests or emulator checks were run because the catalog change only adds database JSON data, with its
generated index and progress documentation, under `AGENTS.md`.
