# WP03 Section F: Barley bran identity integration

Integrated 2026-10-13 from the [R56 identity review](../../proposals/wp03-section-f-barley-bran-identity-review-20261013-r56.md).

## Catalog decision

Added `ingredient-ref-barley-bran` as `barley bran / son d'orge` in `GRAIN_AND_CEREAL`, with empty alias arrays, null density, and no unit mappings. Keep it separate from generic barley, other cereal brans, extracted barley beta-glucan, and bran-flakes cereal. The French display is supported Canadian wording; independent Québec review remains open.

The live `ingredient-ref-barley-bran` ledger record has a verified identity, `researched_no_supported_value` measurement state, and `researched_no_supported_substitute` substitution state. Health Canada's English and French lists define the dry-milled barley fraction. CFIA says the grain source must be named for bran from a source other than wheat. The reused OQLF barley entry supports only the `orge / barley` component, not the compound term.

Sources: [Health Canada, English dietary-fibre list](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html), [Santé Canada, liste des fibres alimentaires](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), and [CFIA grain and bakery labelling](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products). OQLF's [orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge) entry remains scoped to the base grain.

## Recipe and behavior limits

The 114-recipe / 1,123-row bundle has no matching ingredient demand. No recipe link, form, legacy candidate, density, unit mapping, measure, conversion, cooking yield, health claim, or substitution was added. The accepted-fibre classification does not become a product health claim or numeric recipe value.

## Integration checks

- The normalized seed package contains 1,382 references, 100 forms, and 63 legacy candidates.
- The generated bundled catalog is current with 1,382 references.
- Research-ledger validation passes with 1,713 records and zero errors.
- Seed-package and ingredient-reference normalization checks pass.
- Static ownership, no-alias/no-numeric-data, local-link, UTF-8/no-BOM, and scoped whitespace checks pass.
- No app tests or emulator checks were needed for this database-JSON addition.

Section F remains open.
