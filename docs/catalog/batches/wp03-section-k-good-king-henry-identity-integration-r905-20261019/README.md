# WP03 Section K R905 — Good King Henry identity integration

Date: 2026-10-19

Scope: one generic leafy-green identity and a cross-category queue review.

## Decision

Added identity-only `Good King Henry / ansérine Bon-Henri` (`ingredient-ref-good-king-henry`) as `VEGETABLE_AND_AROMATIC`, for the leafy culinary use of *Blitum bonus-henricus* (syn. *Chenopodium bonus-henricus*). The English and Québec French names and two narrow aliases are supported by OQLF. Kew resolves the accepted taxon/synonym boundary; RHS supports culinary leaf use.

The alias set is `Good-Henry` and `bon-henri`. `wild spinach` is excluded because OQLF says it is used for multiple *Chenopodium* plants; OQLF’s `arroche Bon-Henri` is omitted because substring matching would broaden the existing `arroche` query for garden orach. Broad `arroche`, `goosefoot`, `fat hen`, and botanical names are not added. The new row stays separate from spinach, garden orach, and other goosefoot greens.

Li and Savage's study-specific oxalate measurements, sample differences, two-minute boiling result, and dietary interpretation remain source-scoped. No general food-composition value, intake amount, safety statement, or cooking direction was inferred or activated.

## Cross-category scope and preservation

- The R902–R904 reviewers have completed; no active subagent or pending research task was assigned to a commercial roster.
- A fresh scan of open checklist tasks found no new brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only deliverable. The two Section F cereal-roster clauses remain explicitly out of scope because commercial-product counts do not add ingredient diversity. The generic cereal coverage parent stays open. Further Anson Mills named-wheat-meal research remains out of scope under R875 for the same reason.
- Open manufacturer and product-measurement mentions describe evidence rules or source-specific observations, not a reason to enumerate more products. Existing branded rows, their identity boundaries, and product-specific evidence remain intact. No measurement or claim was transferred.
- No existing ingredient, form, recipe, or ledger record was modified, deleted, or merged. The prior branded and related vegetable entries remain unchanged.

## Picker and recipe review

- The active reference list had no exact owner for the proposed display or aliases; the legacy-candidate and form lists had no owner. The four source IDs and URLs had no prior ledger owner.
- All 114 manifest-listed recipes and 1,123 ingredient rows were searched; none mentions Good King Henry, ansérine Bon-Henri, or *Blitum bonus-henricus*. No recipe link or amount was added.
- Static phrase-first/substring projection resolves `Good King Henry`, `Good-Henry`, `ansérine Bon-Henri`, and `bon-henri` to the new identity. The broad `arroche` term continues to resolve to garden orach; the OQLF alternate `arroche Bon-Henri` is omitted to preserve that behavior. `wild spinach` does not resolve through this new identity. Broad `spinach` behavior is unchanged.

## Validation

Passed:

- Ingredient-reference normalization and bundled package normalization/validation
- Research-ledger schema and source ownership validation
- Generated Kotlin catalog freshness
- Exact reference/source-ID/URL ownership and static picker projection
- Full recipe corpus scan for the candidate terms
- UTF-8 without BOM; explicit Unicode escapes in bundled JSON
- Local proposal/README links, plan anchors, and scoped whitespace

Current package totals: **1,933 references / 201 forms / 114 recipes / 1,123 ingredient rows**. Current ledger totals: **2,336 records / 11,014 source entries / 9,240 distinct source IDs / 7,857 distinct URLs / 8 unit conversions**.

No software tests, build, emulator, or deployment were run. The only active catalog data change adds database JSON, which `AGENTS.md` exempts from testing.

See the [proposal](../../proposals/wp03-section-k-good-king-henry-identity-review-r905-20261019.md) and the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md).
