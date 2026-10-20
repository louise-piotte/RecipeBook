# WP02/WP03/WP05 R1042–R1044 generic ingredient integration

Reviewed and integrated on 2026-10-19. This batch adds two generic culinary identities, keeps one milling candidate on hold, and records the out-of-scope disposition of a commercial-only wheat-meal lead. Scope applies across all ingredient types: commercial product counts do not add ingredient diversity.

## Integrated identities and hold

| Review | Disposition | Boundary and evidence limit |
| --- | --- | --- |
| R1042 | Held generic barnyard millet bran unresolved. | The primary food-use study does not identify the barnyard-millet species, and the existing sources do not establish a non-conflicting Québec French food name. Do not borrow foxtail-millet wording or promote a species based on secondary attribution. Study recovery, sieve, treatment, and formula values remain source-specific. |
| R1043 | Added `chayote root / racine de chayotte` in `VEGETABLE_AND_AROMATIC`. | Limit the identity to edible tuberous storage portions of chayote’s adventitious roots. Preserve the separate fruit and shoots references and their source ownership. The French compound is descriptive and provisional. Do not transfer fruit or shoots measurements or claims. |
| R1044 | Added `nukazuke (vegetables pickled in rice bran) / nukazuke (légumes fermentés au son de riz)` in `SAUCE_AND_CONDIMENT`. | Keep the identity vegetable-only and distinguish the finished pickle from the `nukadoko` bed, raw rice bran, fish nukazuke, takuan, and other named preserves. French wording is descriptive and provisional. Keep the study’s bed quantities, preparation, fermentation, and sample observations source-scoped. |

No aliases, forms, reusable measures, recipe links, conversions, yields, or active substitutions were added. R1043 leaves measurement and substitution research open. R1044 records no supported measure and blocked substitution research. R1042 adds no reference or ledger data.

## Scope and preservation

- The assigned reviews focused on generic culinary diversity across milling, plant parts, and preserved foods. No brand, product-line, flavour-family, SKU, retailer-variant, or commercial-roster research was pursued.
- R1042 marks the named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead out of scope because another commercial product does not add ingredient diversity. Stop that product-only line and preserve the historical R605 review, its source IDs, and its product-specific evidence. The separate generic wheat-meal question remains unresolved.
- The barnyard bran candidate is a generic evidence hold, not a commercial lead. Reopen only if primary or equivalent traceable evidence identifies the food-study sample’s species and supports a non-conflicting Québec food name.
- Existing branded rows, chayote fruit and shoots, rice bran, takuan, other preserves, and all prior source owners remain intact. No product-specific or plant-part-specific claims were merged into the new generic identities.
- The [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md) records the queue check and reason for the out-of-scope work.

## Data and static validation

The integrated snapshot contains:

- 2,053 ingredient references and 205 ingredient forms.
- 2,458 research-ledger records, 11,483 source entries, and 9,643 distinct source IDs.
- 55 legacy candidates, 114 manifest-listed recipes, and 1,123 structured recipe ingredient rows.
- Two new references and two new ledger records, with seven new source entries; no forms, recipes, recipe rows, conversion rules, yields, or active substitutions were added.

Static checks passed: bundled package normalization check, ingredient-reference normalization and generated-catalog freshness, research-ledger schema/source validation, unique candidate ownership, recipe-demand scan, UTF-8 without BOM, local Markdown links, and scoped whitespace checks. No software tests, build, emulator, or deployment were run because the app change only adds database JSON under `AGENTS.md`.

## Review records

- [R1042 barnyard millet bran hold](../../proposals/wp02-next-generic-milling-gap-review-r1042-20261019.md)
- [R1043 chayote root proposal](../../proposals/wp03-section-j-chayote-root-identity-review-r1043-20261019.md)
- [R1044 nukazuke vegetables proposal](../../proposals/wp05-section-w-nukazuke-vegetable-preserve-review-r1044-20261019.md)
