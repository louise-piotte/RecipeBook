# WP04 Section P R523 integration — fish-floss boundary hold

- **Date:** 2026-10-17
- **Decision:** Keep generic `fish floss` unallocated until a Québec-facing human-food label or recipe establishes a usable French product name and clearer product boundary.
- **Data change:** None. No ingredient reference, form, legacy mapping, recipe link, ledger record, source entry, measure, conversion, yield, or substitution was added. The six R523 source IDs remain proposal-local.

## Evidence and boundary

Chuang’s Company’s current Canadian product index groups Pollock Floss, Marlin Fish Floss, and Seaweed & Sesame Tuna Fish Floss, while also listing soy-floss products. Its marlin listing gives a 200 g package, but neither listing provides a complete ingredient declaration, processing specification, or Québec French package name. The assortment supports multiple seller-named products, not a shared formulation or species-level catalog rows.

CIPO records include `fish floss` in registered goods and several French renderings in trademark descriptions. Those records are not food standards, OQLF recommendations, or current Québec consumer labels. The S06 journal result is search-indexed; its printed page number was not independently verified because direct PDF extraction exceeded the browser content limit. The citations, limits, source ownership audit, and detailed review are in the [R523 proposal](../../proposals/wp04-section-p-fish-floss-product-boundary-review-r523-20261017.md).

Do not create species-specific pollock, marlin, or tuna floss identities from this single retailer assortment, and do not alias bare `floss`; the same seller lists soy-floss products. Keep fish powder, flakes, jerky, dried bonito, and surimi distinct.

## Picker and recipe corpus

The hypothetical identity changes exact `fish floss` from 0 to 1 and `rousong de poisson` from 0 to 1; broad `fish` and `poisson` remain multi-result queries (13 to 14 and 12 to 13). Bare `floss` would change from 0 to 1 despite the seller's soy-floss products, supporting the hold and exclusion of that alias.

The manifest scan covered all 114 recipe files and 1,123 ingredient rows, with zero candidate matches. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

No catalog or ledger data changed, so no software tests were needed. WP04 fish-product coverage remains open.
