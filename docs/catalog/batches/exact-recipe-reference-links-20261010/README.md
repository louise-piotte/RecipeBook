# Exact recipe ingredient-reference links — 2026-10-10

## Scope

Linked twelve recipe ingredient rows where the existing English ingredient name matched exactly one active reference name or alias. The rows are direct references only; edits preserve source wording, quantity, unit, preparation, optional status, notes, and grouping.

| Recipe | Original line | Reference |
|---|---|---|
| 015 Beef Stroganov | `1 tbsp paprika` | `ingredient-ref-paprika` |
| 021 Yule Log | `180 ml water` | `ingredient-ref-water` |
| 024 Date Squares | `1 cup water` | `ingredient-ref-water` |
| 050 Devil's Food Cake | `240 ml hot coffee` | `ingredient-ref-coffee` |
| 057 Chocolate Truffle Cake | `1 cup water`; `3 large egg yolks`; `1/4 cup plus 2 tbsp water` | water; egg yolk; water |
| 058 Queen Elizabeth Cake | `1 1/4 cups boiling water` | `ingredient-ref-water` |
| 065 Overnight Oats | `Nuts, to taste` | `ingredient-ref-nuts` |
| 066 Korean Soy-Marinated Jammy Eggs | `1 cup water` | `ingredient-ref-water` |
| 069 Double Chocolate Muffins | `1 1/3 tbsp margarine` | `ingredient-ref-margarine` |
| 072 Hamburger Buns | `1 egg yolk` | `ingredient-ref-egg-yolk` |

Unqualified butter remains unlinked because the exact existing candidate is specifically unsalted butter. At the time of this exact-match pass, the African Peanut Stew garnish remained unlinked because its text combines peanuts and fresh cilantro. A later WP03 H/I follow-up accepted a peanut-component link while retaining the combined source wording; the link was reconciled in [the 2026-10-12 follow-up](../peanut-stew-component-link-reconciliation-20261012/README.md). Alternative products and compound ingredient lines were outside this exact-match pass.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py`: passed; no package parts needed formatting changes.
- `python3 -m unittest tools.seed_package.test_bundled_seed_package`: 30 tests passed at the time of this pass. The associated regression assertion was later updated to pin the twelve reference IDs and original line text, quantity, and unit while covering the accepted 090#17 peanut-component link; the test suite was not rerun. The follow-up is documented in the [reconciliation report](../peanut-stew-component-link-reconciliation-20261012/README.md), while unqualified butter remains unlinked.
- Full Android and Pixel 9a validation passed with the merged residual-boundary batch. See [its validation report and screenshots](../catalog-residual-boundaries-integration-20261010/README.md).
