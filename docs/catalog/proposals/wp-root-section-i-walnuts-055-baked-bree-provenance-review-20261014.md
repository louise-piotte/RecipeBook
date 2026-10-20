# Section I Follow-up: Chopped Walnuts in Recipe 055

- Review date: 2026-10-14.
- Scope: reconcile saved recipe `055#10` against its linked publisher page and cited streusel
  variation; attach an existing form only if the source boundary is explicit.
- Recommendation: link `055#10` to the existing `ingredient-form-walnuts-chopped`.

## Source reconciliation

The earlier chopped-walnut review left `055#10` unlinked because Preppy Kitchen's current Coffee
Cake ingredient card omits walnuts. The saved RecipeBook card is more specific: its instructions
incorporate walnuts into the streusel, and both saved language notes say that the walnut-streusel
variation is sourced from Baked Bree's [Delicious Coffee Cake](https://bakedbree.com/blue-ribbon-coffee-cake#recipe).

The current Baked Bree card lists `1 cup walnuts chopped` in its streusel ingredient list. That
matches the saved row's `1 cup walnuts, chopped` and supports the existing chopped-walnut form for
this recipe-specific variation. The Preppy Kitchen source remains the source for the base coffee
cake; it is not treated as the source for the walnut ingredient.

## Boundary and data effect

- Add only `ingredientFormId: ingredient-form-walnuts-chopped` to `055#10`.
- Keep the saved text, amount, unit, preparation, and group unchanged.
- Keep `058#11` linked to the same form under its independent Allrecipes source.
- The Baked Bree page supplies a recipe-specific volume but no mass equivalent or packing
  convention. Activate no density, general measure, mapping, conversion, yield, particle-size
  standard, or substitution.
- The existing French form label remains `noix de Grenoble hachées`, supported by the earlier OQLF
  entries for `noix de Grenoble` and culinary `hacher`; no aliases or form labels change.

## Sources

| Source ID | Source and evidence | Limit |
| --- | --- | --- |
| `WP-ROOT-SECTIONI-WALNUTS-055-PROVENANCE-20261014-S01` | Baked Bree, [Delicious Coffee Cake](https://bakedbree.com/blue-ribbon-coffee-cake#recipe), updated 2026-09-15. The streusel ingredient list says `1 cup walnuts chopped`; the saved recipe notes cite this URL for its walnut-streusel variation. | Supports the form and amount only for this recipe variation; no mass equivalent, packing convention, or general measure. |
| `WP03-WALNUT-CHOPPED-FORM-20261012-S01` | Allrecipes, [Queen Elizabeth Cake](https://www.allrecipes.com/recipe/7666/queen-elizabeth-cake-i/), updated 2026-03-02; lists `1/2 cup chopped walnuts` for recipe `058#11`. | Supports only its own recipe line and amount. |
| `WP03-WALNUT-CHOPPED-FORM-20261012-S02–S03` | OQLF entries for [noix de Grenoble](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361125/noix-de-grenoble) and [hacher](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491547/hacher). | Support the base French name and preparation wording; no walnut-specific particle size. |
| `WP03-WALNUT-CHOPPED-FORM-20261012-S04` | Preppy Kitchen, [Coffee Cake](https://preppykitchen.com/coffee-cake/), updated 2025-10-21; current base card has no walnut ingredient. | Establishes why this page alone does not support the walnut row. |

## Static review record

- The saved 055 English and French instructions identify walnuts as part of the streusel and cite
  the Baked Bree URL as the source for its walnut-streusel variation.
- The Baked Bree ingredient list confirms the same walnut cut and one-cup recipe amount.
- The existing active owner and form remain `ingredient-ref-walnuts` and
  `ingredient-form-walnuts-chopped`; no new reference, form, alias, ledger record, or recipe text was
  introduced.
- This is a database JSON-only link addition. No application or emulator tests were run, consistent
  with the current `AGENTS.md` rule.
