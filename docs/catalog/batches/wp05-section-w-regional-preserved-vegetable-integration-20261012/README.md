# WP05 Section W preserved-mustard identity integration — 2026-10-12

## Catalog decisions

- Added two identity-only references in `SAUCE_AND_CONDIMENT`:
  - `pickled mustard greens / feuilles de moutarde marinées`
  - `takana-zuke (pickled takana) / takana-zuke`
- The Montréal Dobe & Andy menu directly pairs the generic English and French names. OQLF supports
  the French base term for the raw leafy plant but does not define a preserved-product name.
- Japan's Ministry of Agriculture, Forestry and Fisheries documents Setaka and Aso takana-zuke as
  named regional products. A Montréal article supplies a local descriptive phrase, and a Canadian
  distributor lists a Takana Shiozuke product. The active French display keeps the borrowed name:
  using `feuilles de moutarde marinées (takana)` would make that generic French query return both
  references.
- Kept raw mustard greens, generic pickled mustard greens, and named takana-zuke separate. Held broad
  `preserved mustard greens`, `suan cai`, `xue cai`, Hunan radish peel, sinki, and other regional
  preserves outside aliases and active identities until product and Québec terminology boundaries
  are resolved.
- The 114 manifest-listed recipes contain no matching ingredient rows or source-variant mentions.
  No recipe links, aliases, forms, densities, unit mappings, measures, yields, conversions, or
  substitutions were added.

## Sources

The sources supporting the accepted identities are recorded on their research-ledger records under
`WP05-W-REGIONAL-PRESERVES-20261012-S01`, `S02`, and `S04`–`S07`.

- OQLF, [feuilles de moutarde (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488385/feuilles-de-moutarde): supports the Québec French term for the raw leaves only.
- Dobe & Andy Montréal, [SkipTheDishes menu](https://www.skipthedishes.com/dobe-and-andy): lists `Feuilles de moutarde marinées / Pickled Mustard Greens` and separately `Chou mariné / Pickled Cabbage`; it does not specify a preservation process or establish the substrate of every translated menu term.
- Ozawa Canada, [Frozen Takana Shiozuke](https://ozawa.ca/product/frozen-takana-shiozuke/): product-specific Canadian trade evidence for the named Takana product.
- Japan MAFF, [Setaka no Takana Zuke](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4323/index.html) and [Aso Takana-zuke](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/3357/index.html): regional product identity and differing aging/fermentation practices.
- Nightlife Montréal, [Nakamichi ramen article](https://nightlife.ca/2016/02/16/nakamichi-un-nouveau-spot-ramen-au-centre-ville/): local French description `feuilles de moutarde marinées (takana)`; descriptive usage, not a standardized compound term.

The proposed Brossard DoorDash source was not used because the current page extraction did not expose
the bilingual wording claimed in the proposal. Held-candidate sources remain in the linked review
packet and were not added to the ledger for these two identities.

## Static validation

- Package: 1,201 references, 86 forms, 114 recipes, 1,123 ingredient rows, and 66 legacy candidates.
- Ledger: 1,503 records, 5,072 source entries, 4,141 distinct source IDs, and 8 unit conversions.
- Package normalization and validation, reference normalization, generated-catalog freshness, ledger
  validation, exact-name ownership, recipe-demand scan, UTF-8/no-BOM, and whitespace checks passed.
- No tests or emulator checks were run because this change only adds new data to database JSON files
  under `AGENTS.md`.

The broader boundary review and held-candidate evidence are documented in
[`wp05-section-w-regional-preserved-vegetable-boundary-review-20261012.md`](../../proposals/wp05-section-w-regional-preserved-vegetable-boundary-review-20261012.md).
