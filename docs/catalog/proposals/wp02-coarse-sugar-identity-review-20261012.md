# WP02 Section C — coarse sugar identity and recipe-demand review

- **Reviewed and integrated:** 2026-10-12.
- **Disposition:** Accept identity-only `coarse sugar / sucre à gros cristaux` as a product separate from granulated sugar and pearl sugar; link the one exact bundled recipe ingredient row.
- **Source-ID prefix:** `WP02-COARSE-SUGAR-20261012`; checked against active references and the research ledger before insertion.
- **Scope:** Québec display, coarse-sugar product boundary, exact phrase ownership, and one recipe association. This review does not activate measurements, forms, conversions, yields, or substitutions.

## Decision

Create `ingredient-ref-coarse-sugar` with the canonical display `coarse sugar / sucre à gros cristaux`, category `SUGAR_AND_SWEETENER`, empty alias lists, null default density, and no unit mappings. OQLF defines the Québec term as white crystallized sugar used to decorate pastry, with crystals larger than granulated sugar, and gives the exact English equivalent `coarse sugar`. The Canadian Sugar Institute independently distinguishes coarse sugar (granulated crystals with a larger size) from pearl sugar (lumps of refined sugar particles); CFIA lists the two separately as ingredient examples. [S01–S03]

Keep `sucre cristallisé` and `sucre cristal` out of active aliases. OQLF records them as occasional names for coarse sugar, but these unqualified phrases can overlap with the existing generic granulated-sugar identity. Keep `sanding sugar` and `decorating sugar` with pearl sugar, where Canadian Sugar Institute usage places them. Do not generalize the red, decorative McCall’s product’s color, package size, crystal size, or manufacturer-specific properties to all coarse sugar. [S01–S04]

Link only Recipe 049 ingredient row 11, which says `Coarse sugar, for sprinkling`. The publisher’s current recipe lists the ingredient without an amount and describes it as a sprinkle for the biscuit tops. Preserve the saved row wording and notes; add only `ingredientRefId: ingredient-ref-coarse-sugar`. [S05]

## Boundary and exact-owner review

Before integration, the candidate ID and five source IDs were unused. Exact normalized ownership searches found no active reference, form, legacy candidate, or ledger assignment for `coarse sugar` or `sucre à gros cristaux`. The phrases `sucre cristallisé` and `sucre cristal` already appeared in the pearl-sugar ledger decision as excluded overlapping terms; neither was activated as an alias. The active pearl-sugar reference remains `pearl sugar / sucre perlé` with `sanding sugar`, `decorating sugar`, and `sucre décoratif`, and is not merged with coarse sugar.

The manifest-ordered corpus audit covered 114 recipe files and 1,123 ingredient rows. It found one exact coarse-sugar ingredient demand, Recipe 049 row 11, and no other ingredient line using the proposed French display or the ambiguous French synonyms. The recipe row has no quantity or unit. No other recipe was relinked.

The pre-integration snapshot was 1,255 ingredient references, 94 forms, 66 legacy candidates, 1,564 ledger records / 5,472 source entries / 4,510 distinct source IDs, and 114 manifest-listed recipes. Pre-integration hashes and the post-integration corpus fingerprint are recorded in the batch README.

## Source register

All sources were accessed on 2026-10-12. The same source IDs and evidence limits are recorded in the live research ledger under `ingredient-ref-coarse-sugar`.

| Source ID | Source and support | Limits |
|---|---|---|
| **WP02-COARSE-SUGAR-20261012-S01** | Office québécois de la langue française, [sucre à gros cristaux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360533/sucre-a-gros-cristaux). Its 2003 definition describes white crystallized sugar for pastry decoration, larger than granulated sugar, and gives `coarse sugar` as the English term. | Terminology and product definition. The listed `sucre cristallisé` and `sucre cristal` forms are kept out of aliases because of catalog overlap with generic granulated sugar. |
| **WP02-COARSE-SUGAR-20261012-S02** | Canadian Sugar Institute, [Types of Sugar](https://www.sugar.ca/sugar-basics/types-of-sugar?lang=en). Separately defines coarse sugar and pearl sugar and lists their different general uses. | Supports the product boundary; does not establish a recipe-safe substitution. |
| **WP02-COARSE-SUGAR-20261012-S03** | Canadian Food Inspection Agency, [List of ingredients and allergens on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens), Annex 1A. Lists `Coarse sugar` and `Pearl sugar (sanding sugar)` separately. | Ingredient-labeling examples, not a conversion or culinary equivalence. |
| **WP02-COARSE-SUGAR-20261012-S04** | McCall’s, [Coarse Sugar Red 4.4 kg / 10 lb](https://www.mccalls.ca/Ingredients/COLORED-SUGAR/sugar-coarse-red-5kg.html). Canadian manufacturer listing describes a decorative coarse-sugar product with large crystals slightly larger than its standard sanding sugar. | Describes one colored product only; no universal color, crystal-size, package, or use claim is inferred. |
| **WP02-COARSE-SUGAR-20261012-S05** | Sally’s Baking Addiction, [Homemade Strawberry Shortcake](https://sallysbakingaddiction.com/easy-homemade-strawberry-shortcake/). Lists coarse sugar for sprinkling and describes sprinkling it on the shortcake biscuit tops. | The source gives no amount for coarse sugar; supports only ingredient identity and use in this recipe. |

## Integration delta

1. Add one identity-only `ingredient-ref-coarse-sugar` reference with no aliases, density, or unit mappings.
2. Link only Recipe 049 ingredient row 11. Keep its source text, translation notes, and amount state unchanged.
3. Add the verified identity record and five bounded source entries to the research ledger.
4. Add no forms, conversion data, package yield, recipe quantity, density, or substitution.

The corresponding batch note is `docs/catalog/batches/wp02-coarse-sugar-identity-integration-20261012/README.md`.
