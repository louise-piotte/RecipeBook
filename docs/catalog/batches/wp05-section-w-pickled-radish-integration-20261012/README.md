# WP05 Section W pickled-radish identity integration — 2026-10-12

- **Status:** integrated, identity-only; the broader Section W review remains open.
- **Reference:** `ingredient-ref-pickled-radish`, displayed as `pickled radish / radis mariné`, with no aliases and category `SAUCE_AND_CONDIMENT`.
- **Scope:** a generic radish product explicitly presented as a salt-and-vinegar pickle. Canada's food compositional standard defines pickles and relishes as vegetable or fruit products prepared with salt and vinegar and permits specified seasonings and additions. The OQLF supports `marinades` and `conserves au vinaigre`; a Canadian French-language trademark-journal goods description attests the singular phrase `radis mariné`. The latter is usage evidence, not a terminology ruling.
- **Boundaries:** keep fresh radish/daikon, Japanese takuan, named Korean radish products, sinki and other fermented radish preserves, bamboo shoots, and named Chinese mustard preserves distinct. No regional product names were added as aliases.
- **Recipe demand:** no matches across the 114 manifest-listed recipes and 1,123 ingredient rows. No recipe links, forms, measurements, density, unit mappings, yields, conversions, or substitutions were added.

## Source register

The corresponding source records are stored under `ingredient-ref-pickled-radish` in `docs/catalog/research-ledger.v1.json`.

| Source ID | Evidence |
|---|---|
| `WP05-W-PICKLED-RADISH-20261012-S01` | CFIA, [Canadian Food Compositional Standards, 10.5.2](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0): defines the salt-and-vinegar pickle/relish class. |
| `WP05-W-PICKLED-RADISH-20261012-S02` | OQLF, [marinades (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095319/marinades): supports `marinades` and `conserves au vinaigre`; discourages `pickles`. |
| `WP05-W-PICKLED-RADISH-20261012-S03` | Canadian Intellectual Property Office, [Canadian Trademarks Journal, 24 December 2025](https://cipo-opic.ic.gc.ca/opic-cipo/tmj/fra/24Dec2025_fr.pdf?edition=12-24&year=2025): attests singular `radis mariné` in a commercial goods description. |
| `WP05-W-PICKLED-RADISH-20261012-S04`–`S12` | OQLF daïkon entry, Japan MAFF takuan description, Canadian distributor and Montréal retail listings, Codex/Canadian bamboo-shoot product sources, Hunan Government regional dish list, and the sinki fermentation paper; these support the neighboring-product holds recorded in the ledger. |

## Validation

- Package: 1,197 references, 86 forms, 114 recipes, 1,123 ingredient rows, and 66 legacy candidates.
- Ledger: 1,498 records, 5,043 source entries, 4,113 distinct source IDs, and 8 unit conversions.
- Reference normalization, seed-package normalization check and validation, generated-index freshness, ledger schema validation, exact-key ownership, recipe-demand scan, UTF-8/no-BOM, and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- SHA-256: references `4d12c120489d6076127f3b797f439ebdafbe8b1db4706c46b8c6467b8b699be1`; ledger `ba6146784a36e1ca5cb9041500e15e30e5d488fdbd6136881d8992fdf38464f7`.

The full boundary review is in [`wp05-section-w-generic-pickled-radish-boundary-review-20261012.md`](../../proposals/wp05-section-w-generic-pickled-radish-boundary-review-20261012.md).
