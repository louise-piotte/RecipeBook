# WP02/WP03/WP05 R1036–R1041 generic ingredient integration

Reviewed and integrated on 2026-10-19. This batch adds five identity-only culinary ingredients across grain milling, edible flowers, roots, and regional preserves. R1040 remains an unresolved generic milling question. Catalog scope applies across all ingredient types: ingredient diversity is the goal, while commercial-product counts do not add ingredient diversity.

## Integrated identities and hold

| Review | Disposition | Boundary and evidence limit |
| --- | --- | --- |
| R1036 | Added `kodo millet bran-rich fraction / fraction de mouture riche en son de millet kodo` in `GRAIN_AND_CEREAL`. | The paper’s fraction includes true bran, broken grain, and husk in its sample. Keep dehulling, grinding, sieving, stabilization, blend percentages, recipes, and results scoped to that study. The French display is descriptive and provisional. |
| R1037 | Added `bee balm flowers / fleurs de monarde écarlate` in `VEGETABLE_AND_AROMATIC`. | The identity is limited to flowers of *Monarda didyma*. The displays remain plain, with the species boundary recorded in the evidence. Do not add ambiguous bergamot/bergamote terms; they remain owned by *Citrus bergamia*. |
| R1038 | Added `Sichuan paocai` in `SAUCE_AND_CONDIMENT`. | Keep the Sichuan qualifier and the provisional descriptive French display. Preserve its boundary from Jiangxi yancai, Dongbei and Bashang suancai, Tianjin dongcai, kimchi, and other preserves. Study ingredients, brine, fermentation conditions, and standard scope remain source-specific. |
| R1039 | Added `skirret / chervis` in `VEGETABLE_AND_AROMATIC`. | Limit the identity to edible roots of *Sium sisarum* L. OQLF supports the bilingual pair. Keep it separate from parsnip, leafy chervil, and turnip-rooted chervil; do not add `grand chervis` as an alias. |
| R1040 | Held generic sorghum meal unresolved. | FAO supports human-food use, but its broad meal definition overlaps active sorghum flour, grits, and semolina identities. No distinct consumer-facing boundary or non-conflicting Québec French name is established. Preserve the candidate and all five existing sources. |
| R1041 | Added `Jiangxi yancai` in `SAUCE_AND_CONDIMENT`. | Keep the Jiangxi qualifier and provisional descriptive French display. Preserve its distinction from Sichuan paocai, Dongbei suancai, Sanjiang radish pickle, and other regional preserves. Study samples and local-process details remain source-scoped. |

No forms, aliases, reusable measures, recipe links, conversions, yields, or active substitutions were added. R1036, R1038, and R1041 include blocked substitution findings; R1037 and R1039 leave measurement and substitution research open. Study-specific formulas and process values were not added as generic defaults.

## Scope and preservation

- All three active research threads were directed to generic ingredient diversity across every ingredient type. No brand, product-line, flavour-family, SKU, retailer-variant, or commercial-roster research was pursued.
- R1040 marks the existing Nu Life Market sorghum-meal product pages and Dempsey distributor listing out of scope because commercial-product counts do not add ingredient diversity. Stop those product-only lines. Preserve their existing candidate sources and product-specific claims; do not generalize package sizes, grind options, preparation, or performance claims.
- R1036 reconfirms that the named Anson Mills wheat-meal lead is out of scope. Preserve its historical evidence; the separate generic wheat-meal question remains unresolved. No other roster-only queue item was found in this batch.
- Existing branded entries were not deleted, merged, or generalized. Manufacturer pages remain usable for generic evidence only when their claims support the broader ingredient; product-specific claims and measurements stay scoped to their named product.
- The cross-category out-of-scope reason and queue review are recorded in the [scope review](../generic-ingredient-scope-review-20261019/README.md).

## Data and static validation

The integrated snapshot contains:

- 2,051 ingredient references and 205 ingredient forms.
- 2,456 research-ledger records, 11,476 source entries, and 9,636 distinct source IDs.
- 55 legacy candidates, 114 manifest-listed recipes, and 1,123 structured recipe ingredient rows.
- Five new references and five new ledger records; no forms, recipes, recipe rows, conversion rules, yields, or active substitutions were added for these candidates.

Static checks passed: bundled package normalization check, ingredient-reference normalization and generated-catalog freshness, research-ledger schema/source validation, unique candidate ownership, recipe-demand scan, UTF-8 without BOM, and scoped `git diff --check`. No software tests, build, emulator, or deployment were run because the app change only adds database JSON under `AGENTS.md`.

## Review records

- [R1036 kodo millet bran-rich fraction proposal](../../proposals/wp02-next-generic-milling-gap-review-r1036-20261019.md)
- [R1037 bee balm flowers proposal](../../proposals/wp03-section-k-generic-edible-flower-gap-review-r1037-20261019.md)
- [R1038 Sichuan paocai proposal](../../proposals/wp05-section-w-generic-preserved-food-gap-review-r1038-20261019.md)
- [R1039 skirret proposal](../../proposals/wp03-section-j-generic-root-tuber-gap-review-r1039-20261019.md)
- [R1040 sorghum meal boundary proposal](../../proposals/wp02-next-generic-milling-gap-review-r1040-20261019.md)
- [R1041 Jiangxi yancai proposal](../../proposals/wp05-section-w-generic-preserved-food-gap-review-r1041-20261019.md)
