# WP05 Section V — oolong tea identity integration (R362, 2026-10-16)

## Review record

- **Status:** Integrated as an identity-only database-JSON change on 2026-10-16; see the [proposal](../../proposals/wp05-section-v-oolong-tea-identity-review-r362-20261016.md).
- **Identity:** Added `ingredient-ref-oolong-tea`, displayed as `oolong tea / thé oolong`, in `OTHER`.
- **Scope:** Dry *Camellia sinensis* tea only. No aliases, forms, density, unit mappings, measurements, recipe links, conversions, yields, or substitutions were added. Ledger measurement and substitution states remain `not_yet_researched`.

## Evidence and boundaries

ISO 20715:2023 separates oolong tea from black, green, white, dark, and yellow tea and limits its tea-type classification to products of *Camellia sinensis*. The CFIA standard defines the parent tea product as dried leaves and buds of *C. sinensis*, but does not define oolong separately. Québec tea seller pages use `thé oolong` in a collection heading and product titles. OQLF's 1982 entry `thé chinois` mentions the older spelling `thé Oolang`; that historical entry was not used to set the display or aliases.

Keep oolong separate from black tea, green tea, matcha, herbal infusions, prepared drinks, flavoured blends, extracts, and instant tea. Do not infer brewing ratios, steeping directions, yield, or substitution from tea-type classification or retail copy.

## Picker and recipe impact

- `oolong tea`, `thé oolong`, and `oolong` now resolve to the new reference.
- Broad `tea` search grows from two to three identities.
- Accent-folded `thé` search grows from four to five identities. It continues to include `corn on the cob`, whose English display contains the complete word `the`.
- The 114 manifest-listed recipes and 1,123 ingredient rows contain no tea or oolong ingredient demand. No recipe link was changed.

## Source record

Six sources support the accepted identity decision in `docs/catalog/research-ledger.v1.json`: ISO's tea-type classification, CFIA's dry-tea parent standard, Taiwan's tea-industry reference, the historical OQLF entry, and two Québec seller product pages. Source IDs use the proposal prefix `WP05-SECTION-V-OOLONG-TEA-R362-20261016-`.

## Validation

- Bundled seed normalization and validation passed; the package contains 1,694 ingredient references and 139 forms.
- The generated Kotlin ingredient index is current.
- The research ledger validates with 2,050 records and no duplicate source IDs or URLs.
- Static picker projection and the 114-recipe / 1,123-row corpus scan passed.
- UTF-8 without BOM, local Markdown links, and scoped whitespace checks passed.
- No software tests were run because this change only adds database JSON data, as permitted by `AGENTS.md`.
