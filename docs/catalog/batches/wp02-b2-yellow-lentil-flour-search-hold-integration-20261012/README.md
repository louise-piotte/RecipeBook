# WP02 B2 yellow lentil flour search-boundary hold

- **Disposition:** Hold `yellow lentil flour / farine de lentilles jaunes`; leave `ingredient-ref-yellow-lentil-flour` unallocated.
- **Reason:** The source review supports a distinct flour product, but the current phrase-first picker would return it alone for the broader queries `yellow lentil` and `lentilles jaunes`. Whole yellow lentils remain unresolved, so the flour row cannot own those queries.
- **Data:** No active reference, ledger candidate, form, recipe link, measurement, conversion, yield, or substitution was added.
- **Verification:** Reviewed exact ownership, query behavior in `IngredientSearch.kt`, source-ID uniqueness, and all 114 bundled recipes / 1,123 ingredient rows. No app tests or emulator checks were run; this was a documentation-only hold.

The proposal records Canadian and Québec-facing product sources, including Simpson Seeds, Avena Foods, Health Canada, and a Montréal retail listing, while keeping industrial specifications out of reusable kitchen data: [yellow lentil flour search-boundary review](../../proposals/wp02-b2-yellow-lentil-flour-search-boundary-review-20261012.md). Revisit after search can preserve the broader unresolved query while supporting an exact flour query.
