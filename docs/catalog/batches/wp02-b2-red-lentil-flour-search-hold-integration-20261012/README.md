# WP02 B2 red lentil flour search-boundary hold

## Decision

Keep the proposed `red lentil flour / farine de lentilles rouges` identity unallocated until the
picker can preserve both the whole-pulse result and the flour result for their intended queries.
The proposed identity is source-supported, but the current search returns complete phrase matches
before considering partial matches. Adding the English display `red lentil flour` would make the
bare `red lentil` query return the flour row alone and suppress the existing whole-pulse fallback.
Do not add `red lentil` as an alias to either row to work around this collision.

No catalog, ledger, recipe, generated, or Kotlin search data changed. The source IDs remain local to
the [review proposal](../../proposals/wp02-b2-red-lentil-flour-search-boundary-review-20261012.md).
The English and French product wording, source-specific measure limits, and exact-query table are
recorded there.

## Reconciliation

- Confirmed `IngredientSearch.kt` prioritizes complete normalized word phrases and returns them
  before partial-match fallback.
- Confirmed the current whole-food reference owns `red lentils / lentilles rouges`, while the
  proposed qualified flour phrases have no exact active owner.
- The bundled corpus has 114 recipes and 1,123 ingredient rows, with no red-lentil-flour request.
- Keep the broader WP02 B2/B3 flour review open. Revisit only after a source-backed search boundary
  is available, then repeat the exact query set in the proposal.
- No tests or emulator checks were run because this is a documentation-only hold.
