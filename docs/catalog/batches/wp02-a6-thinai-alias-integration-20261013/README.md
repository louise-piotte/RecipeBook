# WP02 A6 Thinai alias integration

Added `thinai flour` as the only English alias on `ingredient-ref-foxtail-millet-flour` and `thinai` as an English alias on the existing `ingredient-ref-foxtail-millet` grain row. The grain-level alias keeps a bare `thinai` search from returning flour alone; it offers the grain and flour as separate choices. The complete `thinai flour` query returns only the flour row.

Official Indian food and agriculture sources connect Thinai/Tenai with foxtail millet (*Setaria italica*). A Kitchener product page describes its foxtail millet flour as made from foxtail millet (Thinai), and a Greater Toronto retailer uses the exact title `Thinai Flour`. No Québec source identifies a French Thinai flour term, so French aliases remain empty. Other unreviewed regional phrases remain inactive.

Recorded the flour-study bulk-density range endpoints (502.6 and 534.9 kg/m³) as study-specific observations across moisture levels, and the 30% bread-ready-mix result as formula-specific substitution research. `measurementState` is `researched_supported`; `substitutionResearchState` is `blocked_pending_evidence`. Runtime density and unit mappings remain empty, and no substitution rule, new form, recipe link, yield, or conversion was added. The full recipe corpus had no matching ingredient demand.

The source review and post-integration picker projection are documented in the [Thinai review](../../proposals/wp02-a6-thinai-foxtail-millet-flour-alias-review-20261013.md). Static seed-package and ledger-schema validation, generated-index freshness, source-ID and query-ownership checks, recipe-corpus scan, encoding, and whitespace checks passed. No app tests or emulator checks were run for this database-data update. WP02 A6 remains open.
