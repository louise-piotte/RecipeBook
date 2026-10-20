# WP03 Section L R131 — kabocha squash identity

## Decision

Added identity-only `ingredient-ref-kabocha-squash`, displayed as `kabocha squash / courge kabocha`, in `VEGETABLE_AND_AROMATIC`. Aliases remain empty. OQLF supplies terminology context; current Canadian English and Québec French retailer listings support the display pair. `Japanese squash`, `courge japonaise`, `Japanese pumpkin`, and `Buttercup squash` remain unassigned because sources do not establish one consistent product boundary.

The Metro recipe’s kabocha-or-butternut choice for its named vegetable mash is recorded as a source-specific ledger finding only. It does not create an active substitution rule or a bundled recipe link. No forms, measures, density, mappings, yields, conversions, recipe links, or reusable substitutions were added. The recipe bundle contains no matching demand.

Sources: [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404009/courge-dhiver), [Wholesale Club Québec](https://www.wholesaleclub.ca/fr/alimentation/fruits-et-l-gumes/l-gumes-frais/courges-et-citrouilles/squash/c/34519), [Extra Foods](https://www.extrafoods.ca/en/food/fruits-vegetables/fresh-vegetables/squash-pumpkin/squash/c/34519), [Ferme Bastien](https://www.fermebastien.ca/Shopping/ProductDescription/VG3), [Metro recipe](https://www.metro.ca/en/recipes-occasions/recipes/two-toned-vegetable-and-squash-mash), and [BCfresh](https://bcfresh.ca/squash/).

## Validation

No app, Gradle, unit, instrumentation, or emulator tests were run because the active changes only add database JSON data. Passed bundled-package validation and normalization checks, reference normalization, generated-index freshness, source-ID and ledger ownership checks, picker projections, recipe-corpus scan, UTF-8/no-BOM, local-link, whitespace, and scoped `git diff --check` checks. The package now contains 1,482 references and 109 forms; the ledger has 1,827 records / 7,613 source entries / 6,469 distinct source IDs; the library remains 114 recipes / 1,123 ingredient rows.

The global catalog plan’s Section L parent remains open for delicata, remaining tomato products, eggplant subtypes, gourds/okra, and broader pepper review.

See the [proposal](../../proposals/wp03-section-l-kabocha-squash-identity-review-20261015-r131.md) and [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).
