# WP07 baking-soda portion integration

Recorded two source-specific baking-soda `portion_weight` observations in `docs/catalog/research-ledger.v1.json`:

- King Arthur Baking: 1/2 teaspoon = 1/10 ounce = 3 g.
- Health Canada NVSCF revised 1999: 5 mL = 5 g.

The measures retain their source wording and are not normalized or averaged. Both sources omit fill/leveling method details; King Arthur does not specify its teaspoon volume convention. `ingredient-ref-baking-soda` remains `blocked_pending_evidence`; active density and unit mappings remain empty. Recipe lines and substitution data are unchanged.

Updated the WP07 checklist in `docs/RecipeBook-global-ingredient-catalog-plan.txt`. Evidence details and limitations are in `docs/catalog/proposals/wp07-baking-soda-portion-observations-review-20261013.md`.

`validate_research_ledger()` accepted all 1,644 ledger records with zero errors. Targeted JSON checks confirmed both observation/source links and that no active baking-soda density or unit mapping was added.

No app tests or emulator checks were run because this change only adds database JSON evidence and documentation, consistent with `AGENTS.md`.
