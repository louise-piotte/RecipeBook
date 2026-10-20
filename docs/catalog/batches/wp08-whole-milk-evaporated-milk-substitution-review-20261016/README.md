# WP08 whole-milk to evaporated-milk substitution review

## Finding

Colorado State University Extension and a Utah State University Extension table both list 1 cup
whole milk as replaceable with 1/2 cup evaporated milk plus 1/2 cup water. This is consistent
directional evidence from general substitution tables, not a recipe-specific test.

The finding is recorded under `ingredient-ref-milk` as
`wp08-whole-milk-evaporated-milk-half-half-20261016` with
`researchState: blocked_pending_evidence`. The evaporated-milk identity has since been verified in
WP04. The finding remains ledger-only because neither table establishes performance in the bundled
recipes, and their source cup amounts are not asserted as a conversion to RecipeBook's unit basis.
No active substitution rule, recipe-line link, or recipe edit was added.

## Integration record

- Added both source references and the bounded replacement finding to the milk research-ledger record.
- Set milk substitution research to `blocked_pending_evidence`; the target identity is verified, but
  recipe-specific performance and unit-basis evidence remain unresolved.
- Added a completed WP08 evidence-review item; the wider WP08 substitution packet remains open.
- No app tests or emulator checks were run; this change only adds research data to the JSON ledger and documentation.

## Sources

- [Colorado State University Extension — Ingredient Substitutions](https://extension.colostate.edu/resource/ingredient-substitutions/), whole-milk row (1 cup).
- [Utah State University Extension — Ingredient Substitution](https://extension.usu.edu/boxelder/files/fn255.pdf), whole-milk row (1 cup).
