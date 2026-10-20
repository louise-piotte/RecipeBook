# WP03 Section I — roasted peanut form review (2026-10-14)

**Decision:** Add `roasted peanuts / arachides grillées` as a form of the existing peanut identity and link only recipe `085#9`. The recipe already records the remaining chopped state in its ingredient text and `preparation` fields. Preserve that wording and its optional, amountless state.

## Scope and boundaries

- Parent identity: `ingredient-ref-peanuts` (`peanuts / arachides`).
- New form: `ingredient-form-peanuts-roasted`, `formCode: roasted`, `prepState: roasted`.
- Do not add peanut aliases or a separate chopped-peanut form. The recipe's `chopped` qualifier remains line-specific.
- Salt status and roasting medium remain unspecified. Keep dry-roasted salted, dry-roasted unsalted, and oil-roasted evidence distinct.
- Keep density null, unit mappings empty, and package yields, conversions, substitutions, and other recipe links absent.

The saved bundle line `085#9` is `chopped roasted peanuts`, optional and without a quantity. The linked source is Foodie Badge's [One Pan Butter Garlic Chicken](https://foodiebadge.com/one-pan-butter-garlic-chicken-korean-soy-sauce-chicken-chicken-breast-recipe/); the page was not independently retrievable during this review. The form label is independently supported by current Canadian culinary usage and the Québec French term evidence below.

## Evidence

| Source | Evidence and limit |
| --- | --- |
| [Arachides Canada, Tarte Banoffee aux noix](https://arachides.ca/recipe/95) | Uses `arachides grillées et hachées` as a recipe ingredient and topping. A separate 1 tbsp garnish amount has no mass and is specific to that recipe. Supports the French roasted-and-chopped wording, not a general measure. |
| [OQLF, arachides hachées](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497914/arachides-hachees) | Pairs Québec French `arachides hachées` with English `chopped peanuts`. This supports the saved recipe's chopped qualifier; the separate Arachides Canada source supplies `grillées`. |
| [Health Canada CNF, dry-roasted salted peanuts, food code 3302](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3302) | The legacy online CNF row reports 60 mL = 37.0 g and 100 mL = 61.7 g for dry-roasted, salted peanuts. These portions are source-specific and do not state chopped size. |
| [Health Canada CNF, dry-roasted peanuts, food code 3362](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3362) | The legacy online row reports the same 60 mL and 100 mL portions for dry-roasted peanuts without a salt qualifier. Keep it as a separate food-code observation; it does not state chopped size. |
| [Health Canada CNF, oil-roasted peanuts, food code 3413](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3413) | The legacy online CNF row reports 60 mL = 33.7 g, 100 mL = 56.2 g, and 250 mL = 140.5 g for oil-roasted peanuts, plus 10 peanuts = 8.8 g. The roast method differs from codes 3302 and 3362, so the figures do not support one generic roasted-peanut density. |

## Integration limits

The three CNF records report seven portions across dry-roasted salted, dry-roasted (salt not stated), and oil-roasted peanuts. The oil-roasted values differ from the dry-roasted values; none addresses this recipe's chopped size or unknown roast-medium state. Retain all observations as ledger evidence only. Do not derive a reusable conversion or populate `densityGPerMl` or `unitMappings`.

The sources provide no tested replacement quantity for this optional garnish. Add no substitution rule. The corpus contains no amount on `085#9`, so the recipe link adds only the explicit roasted form and keeps the chopped qualifier in the saved line.

