# WP04 Section P monkfish / baudroie search hold

- **Date:** 2026-10-12.
- **Status:** Accepted documentation-only hold; no catalog JSON or ledger data changed.
- **Proposal:** [Monkfish / baudroie species and picker boundary](../../proposals/wp04-section-p-monkfish-baudroie-picker-boundary-review-20261012.md).

OQLF uses `baudroie` for a commercial *Lophius* market class in which both *L. piscatorius* and *L. americanus* may occur. CFIA also lists `Monkfish` for both species. Adding a row qualified as American monkfish / baudroie d’Amérique would make the unqualified picker searches `monkfish` and `baudroie` return that single species-specific row.

The 114-recipe / 1,123-row corpus has no exact monkfish demand. Keep `lotte` separate: Québec uses it for freshwater burbot (*Lota lota*), while the older DFO market guide's use for a monkfish tail is historical wording. Do not add a generic row, species-only row, alias, form, recipe link, measurement, conversion, yield, or substitution. Reopen for an exact product/recipe request or search behavior that preserves the generic-versus-species distinction.

This hold changes documentation only. No app tests or emulator checks were run.
