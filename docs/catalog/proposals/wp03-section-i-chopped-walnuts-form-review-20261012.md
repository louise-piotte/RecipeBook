# WP03 Section I chopped-walnut form review — 2026-10-12

## Recommendation

Accept `chopped walnuts / noix de Grenoble hachées` as a form under the existing
`ingredient-ref-walnuts` identity and link only recipe `058#11`. Preserve the row's original wording
and 1/2 cup amount. The recipe source publishes 1/2 cup chopped walnuts, so the saved amount is
source-aligned; it publishes no mass equivalent. Add no density, conversion, yield, particle-size
standard, or substitution.

Do not link recipe `055#10` yet. Its saved row says `1 cup walnuts, chopped`, but the currently
linked Preppy Kitchen Coffee Cake page has no walnut mention in its current recipe card. Keep that
source mismatch visible rather than treating the saved row as a second independent source.

## Exact demand and source comparison

| Recipe row | Saved ingredient text | Current linked publisher evidence | Disposition |
|---|---|---|---|
| `058#11` | `1/2 cup walnuts, chopped` | Allrecipes, [Queen Elizabeth Cake](https://www.allrecipes.com/recipe/7666/queen-elizabeth-cake-i/), updated 2026-03-02: recipe card lists `1/2 cup chopped walnuts`. | Link the chopped-walnut form; keep 1/2 cup unchanged. No mass or density is published. |
| `055#10` | `1 cup walnuts, chopped` | Preppy Kitchen, [Coffee Cake](https://preppykitchen.com/coffee-cake/), updated 2025-10-21: the current recipe card does not mention walnuts. | Leave the form unlinked; investigate recipe/source reconciliation separately. |

The full manifest scan found these two walnut-plus-chopped rows and no other exact walnut-preparation
demand. The earlier broad nut audit kept both as line-level wording; the current Allrecipes card now
provides an exact source match for `058#11`, while the other page remains unsupported.

## Québec French wording

The OQLF [*noix de Grenoble* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361125/noix-de-grenoble)
lists `noix de Grenoble` and `noix` as preferred terms and gives English `walnut`. The OQLF
[*hacher* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491547/hacher)
defines the food-preparation verb as reducing food to small pieces and gives English `chop`. These
support the French form label; they do not establish a walnut-specific particle size.

## Numeric and substitution boundaries

- The source and saved row both give 1/2 cup for `058#11`. Preserve that recipe-specific volume;
  neither source provides a mass pair or packing convention.
- Do not add a density, mass conversion, yield, or transferable cup measure.
- Measurement and substitution research remain `not_yet_researched`; no substitution is inferred.
- No recipe quantity, `preparation` text, reference alias, or instruction changes.

## Ledger source-ID audit

The proposed ledger source IDs are unique in the current 5,365-entry ledger and in existing
proposal/batch files:

| Source ID | Source and bounded scope |
|---|---|
| `WP03-WALNUT-CHOPPED-FORM-20261012-S01` | Allrecipes, Queen Elizabeth Cake, updated 2026-03-02; exact chopped-walnut ingredient line and 1/2 cup for `058#11`. |
| `WP03-WALNUT-CHOPPED-FORM-20261012-S02` | OQLF, *noix de Grenoble*; supports the French/English walnut identity only. |
| `WP03-WALNUT-CHOPPED-FORM-20261012-S03` | OQLF, *hacher*; supports the French/English preparation wording only. |
| `WP03-WALNUT-CHOPPED-FORM-20261012-S04` | Preppy Kitchen, Coffee Cake, updated 2025-10-21; current card excludes walnuts, so it does not support `055#10`. |

## Integration boundary

Add one form under existing walnuts and attach it only to `058#11`. Keep the broader Section I form
checklist open for whole, sliced/slivered, ground, roasted, salted, and other source-backed states.
