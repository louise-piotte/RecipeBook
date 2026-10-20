# WP02/WP03/WP05 R1031–R1035 generic ingredient integration

Reviewed and integrated on 2026-10-19. This batch adds five identity-only culinary ingredients across grain milling, edible flowers, regional preserves, and roots. The scope is generic ingredient diversity across all ingredient types; commercial brand and product-family counts do not add ingredient diversity.

## Integrated identities

| Review | Added identity | Category | Boundary and evidence limit |
| --- | --- | --- | --- |
| R1031 | `wheat bran flour / farine de son de blé` | `FLOUR_AND_STARCH` | OQLF attests the exact bilingual term. Grain-milling and steamed-bun studies support food use. Keep milling settings, particle sizes, formula proportions, and results source-specific; distinguish from unqualified wheat bran and wheat-kernel flour. |
| R1032 | `butterfly pea flowers / fleurs de pois bleus` | `VEGETABLE_AND_AROMATIC` | Limit to culinary flowers of *Clitoria ternatea*. Keep the descriptive French wording provisional. Tea, dye, and rice-extract procedures and quantities remain scoped to their sources; do not extend edible-part claims to other species or parts. |
| R1033 | `Tianjin dongcai` | `SAUCE_AND_CONDIMENT` | Add source-supported English aliases `Tianjin preserved vegetables` and `Tianjin pickled vegetable`; French display is descriptive and provisional. Retain the Tianjin qualifier and distinctions from other regional preserves. Formulations, garlic descriptions, and fermentation claims remain source-specific. |
| R1034 | `rye bran flour / farine de son de seigle` | `FLOUR_AND_STARCH` | The French compound is descriptive and provisional. Preserve rye bran and rye-kernel flour identities. The 487 g bread formula and experimental replacement percentage remain attached to their respective studies. |
| R1035 | `turnip-rooted chervil / cerfeuil tubéreux` | `VEGETABLE_AND_AROMATIC` | Limit to the edible root of *Chaerophyllum bulbosum*. Keep distinct from leafy *Anthriscus cerefolium* and turnip. Québec crop-list terminology and root-edibility evidence do not establish retail prevalence. |

No aliases, forms, default densities, unit mappings, measurement observations, recipe links, conversions, yields, or active substitutions were added. The five new ledger records keep study measures and process claims scoped to their sources. R1031, R1033, and R1034 have blocked substitution findings; R1032 records no supported substitute; R1035 leaves measurement and substitution research open.

## Scope and preservation

The current user instruction applies across every ingredient type, not only cereals. No brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only research was pursued for this batch. Any queued item limited to commercial variants is out of scope because commercial-product counts do not add ingredient diversity; stop that line after recording the reason.

The prior Mochiko/Shiratamako independent display-approval item remains out of scope as named-product terminology work. Preserve those rows, their evidence, and their provisional displays. The named Anson Mills wheat-meal lead remains out of scope; the open generic wheat-meal question remains separate. Existing branded entries were not deleted, merged, or generalized. Product-specific claims and measurements remain on their existing owners unless a separate transferability review supports reuse.

## Data and static validation

The integrated snapshot contains:

- 2,046 ingredient references and 205 ingredient forms.
- 2,451 research-ledger records, 11,464 source entries, and 9,624 distinct source IDs.
- 55 legacy candidates, 114 manifest-listed recipes, and 1,123 structured recipe ingredient rows.
- Five new references and five new ledger records; no forms, recipes, or recipe rows changed for these candidates.

Static checks passed: bundled package validation, ingredient-reference normalization and check, generated Kotlin catalog freshness, research-ledger schema/source ownership validation, exact-name ownership and recipe-demand checks, UTF-8 without BOM, local Markdown links, and scoped `git diff --check`. The package now contains 2,046 references. No software tests, build, emulator, or deployment were run because the app change only adds database JSON under `AGENTS.md`.

## Review records

- [R1031 wheat bran flour proposal](../../proposals/wp02-next-generic-milling-gap-review-r1031-20261019.md)
- [R1032 butterfly pea flowers proposal](../../proposals/wp03-section-k-butterfly-pea-flowers-identity-review-r1032-20261019.md)
- [R1033 Tianjin dongcai proposal](../../proposals/wp05-section-w-tianjin-dongcai-generic-identity-review-r1033-20261019.md)
- [R1034 rye bran flour proposal](../../proposals/wp02-next-generic-milling-gap-review-r1034-20261019.md)
- [R1035 turnip-rooted chervil proposal](../../proposals/wp03-section-j-turnip-rooted-chervil-identity-review-r1035-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
