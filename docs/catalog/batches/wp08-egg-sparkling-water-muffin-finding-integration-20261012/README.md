# WP08 egg-to-sparkling-water finding integration

## Decision

Added two source records and one blocked, one-way finding to the existing `ingredient-ref-egg`
research-ledger record. The finding proposes `1/4 cup` plain sparkling water per whole egg only in
selected light, fluffy muffin batters where the egg is mixed with liquids before incorporation into
dry ingredients.

Bundled recipe 069 calls for one large egg and combines it with margarine and brown sugar before
adding the wet ingredients to the dry ingredients. The instructions do not establish whether the
fat and egg are creamed, and this exact family recipe has not been tested with sparkling water. The
finding therefore remains `blocked_pending_evidence`.

King Arthur's `57 g` is the mass of the same sparkling-water quantity, not the egg. Source egg size
is unstated. No mass-for-mass amount, adjustment to other liquids or leaveners, inverse direction,
active substitution rule, or recipe-line substitution link was added. The finding excludes flavoured
or sweetened carbonated drinks, tonic, club soda, and bare `soda`.

## Sources

- [University of Maine Cooperative Extension, Using Egg Substitutes in Baking and Cooking](https://extension.umaine.edu/food-health/2023/02/16/using-egg-substitutes-in-baking-and-cooking/): tested a yellow cake calling for two eggs; gives 1/4 cup seltzer per egg and notes pale color.
- [King Arthur Baking, No eggs? Here's your guide for substituting](https://www.kingarthurbaking.com/blog/2021/01/21/guide-for-substituting-eggs-best-egg-replacers): gives 1/4 cup (57 g) sparkling water per egg, warns it may be hit-or-miss and does not blend well with creamed butter, and reports one similar Basic Muffin result.

The published evidence supports a bounded research finding, not a recipe-specific replacement. The
egg and sparkling-water references remain unchanged.

## Validation

- Research-ledger schema validation passed with zero errors.
- The finding is attached to the egg record and references the existing sparkling-water identity.
- No app tests or emulator checks were run because this update only adds database JSON evidence; static ledger validation was used.

See [the source review](../../proposals/wp08-egg-sparkling-water-muffin-source-review-20261012.md).
