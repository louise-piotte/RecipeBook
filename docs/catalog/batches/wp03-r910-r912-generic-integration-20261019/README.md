# WP03 R910–R912 generic ingredient integration

Integrated 2026-10-19 as two generic identity gaps and one maturity form. No brand, product-line,
flavour-family, SKU, or retailer-variant roster was researched or added.

## Catalog changes

- Added `ingredient-form-tomatoes-unripe-green` under `ingredient-ref-tomatoes` with qualified labels
  `unripe green tomatoes / tomates vertes non mûres`. The French phrase is descriptive and remains
  provisional, not an OQLF-standardized compound. Bare green-tomato phrases were not added as form
  aliases. Mature green cultivars and the existing green-tomato-ketchup identity remain separate.
- Preserved the USDA SR28 NDB 11527 portions and Télé-Québec's 20-tomato ketchup count as source-only
  evidence. The USDA source does not resolve maturity; the recipe count stays with its one formula.
  No measurement observation, density, mapping, conversion, yield, recipe link, or active substitution
  was added to the form.
- Promoted the exact legacy candidate `ingredient-ref-avocado` to the generic `avocado / avocat`
  reference in `FRUIT`. The candidate's prior unresolved ledger decision remains as history, followed
  by the accepted decision; only the exact matching legacy-list row was removed. The active avocado-oil
  identity and the held avocado-seed-flour decision remain separate.
- Recorded eight Health Canada CNF food-code 1511 serving observations, each tied to the raw,
  all-commercial-varieties avocado entry and its stated preparation: pureed, cubed, sliced, whole
  fruit, and half fruit. These source portions do not establish a generic density or unit mapping.
  The separate 100 g edible-portion basis and 26% seeds-and-skin refuse remain source qualifiers, not
  an active mass conversion or general edible-yield value. No avocado forms, recipe links, or
  substitutions were added.
- Added identity-only `black trumpet mushroom / fausse corne d’abondance` in
  `VEGETABLE_AND_AROMATIC`. Its identity evidence is bounded to Québec/eastern North American
  *Craterellus fallax*. The bilingual display pairing is an explicit cross-source inference through
  that species; `black chanterelle` and other ambiguous common names were excluded. Generic mushroom,
  chanterelle, and candy-cap identities remain unchanged. No form, measure, recipe link, conversion,
  yield, or substitution was added.

## Cross-category scope disposition

All three reviews pursued generic culinary ingredient diversity. The current queue scan found no
roster-only assignment in these Sections L/M/N items. The two Section F commercial cereal-roster
clauses remain out of scope because commercial-product counts do not add ingredient diversity; their
generic cereal coverage remains open. Existing branded rows and product-specific evidence were
preserved. No product-specific measurement or claim was generalized without a transferability review.

## Validation

- Bundled seed-package validation: valid; 1,939 references and 203 forms.
- Research-ledger JSON Schema: 0 errors; 2,342 records, 11,045 source entries, 9,268 distinct source
  IDs, and no source-ID-to-URL conflicts.
- The exact avocado picker terms resolve to avocado and, for broad `avocado` / `avocat`, the separate
  avocado-oil row as well; `avocado oil` remains oil-only. `alligator pear` and `avocado pear` were
  not added. The black-trumpet display and reviewed aliases resolve only to the new row; the ambiguous
  `black chanterelle` query has no added match.
- The qualified tomato form terms return generic tomatoes with the unripe-green form hint. Incomplete
  `green tomato` and `tomates vertes` queries can return the separate ketchup row and/or generic
  tomatoes, without a maturity hint; no bare phrase was added as a form alias.
- The manifest-ordered corpus remains 114 recipes / 1,123 ingredient rows, with no new avocado,
  black-trumpet, or unripe-green-tomato ingredient line to link.
- Generated Kotlin catalog is current at 1,939 references. JSON remains ASCII-escaped with no BOM;
  Markdown remains UTF-8 without BOM; local links and scoped whitespace checks pass.
- No software tests, build, emulator, or deployment were run because the active changes add ingredient
  database JSON under `AGENTS.md`.

See the [R910 tomato proposal](../../proposals/wp03-section-l-generic-produce-gap-review-r910-20261019.md),
[R911 avocado proposal](../../proposals/wp03-section-m-generic-fruit-gap-review-r911-20261019.md),
[R912 mushroom proposal](../../proposals/wp03-section-n-generic-fungi-sea-vegetable-gap-review-r912-20261019.md),
and [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md).
