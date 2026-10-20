# WP02 / WP03 / WP04 round-eighteen gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — Kodo millet:** Added `varagu` to the English aliases for the existing
  `ingredient-ref-kodo-millet` grain row and `varagu maavu` to the existing
  `ingredient-ref-kodo-millet-flour` row. ICAR–IIMR maps Tamil `Varagu` to Kodo Millet and separately
  maps `Pani varagu` to Proso Millet; FreshOnTheGo’s Scarborough listing uses `Varagu Kodo Millet`.
  Organic Mandya identifies `Varagu Maavu` as a name for its kodo flour, with a Canada-localized
  Silkrute title corroborating the wording. The Silkrute source is stale in the search index and
  could not be fetched directly, so it supports wording only. Kept `pani varagu` and `panivaragu`
  unassigned, and preserved both French displays, all numeric fields, the flour measurement
  observations, and blocked substitution findings.
- **WP03 Section F — common millet:** Added `cheena` and `cheena millet` to the English aliases on
  `ingredient-ref-common-millet`. ICAR–IIMR maps Bengali and Punjabi `Cheena` to proso millet;
  Agriculture and Agri-Food Canada lists `cheena` for *Panicum miliaceum*, and TERMIUM standardizes
  `cheena millet` for the species. A Canada-facing marketplace listing corroborates the grain
  spelling but is not treated as a verified Canadian package label. Preserved the OQLF-backed French
  display, separate flour row, and all numeric and recipe-link fields; flour-qualified Cheena terms
  remain unassigned.
- **WP04 Section P — Yellowmouth Rockfish:** Held yellowmouth rockfish / sébaste à bouche jaune
  (*Sebastes reedi*) outside the active catalog and ledger. The qualified display would make broad
  `rockfish` a one-result picker query, while the reviewed Québec retail item identifies only
  *Sebastes* spp. and the recipe corpus has no matching demand. Fishery and SARA status evidence stays
  in the proposal and is limited to its stated species, geography, and management scope.

## Shared data changes

The active reference package remains at **1,345 references** and **98 forms**. It gained four aliases
on existing references; no new reference identity, form, recipe link, or numeric field was added or
changed.

The research ledger remains at **1,658 records** and now has **6,441 source entries**, **5,393
distinct source IDs**, and **4,483 distinct URLs**. It retains **342 measurement observations** and
**195 substitution findings**. Four new source IDs and URLs were added. Two existing sources were
reused for the Kodo grain row, and the existing ICAR–IIMR and Organic Mandya entries were narrowed or
expanded in their locators and support text to cover the reviewed wording. The Kodo flour’s existing
source-specific density and portion observations and its blocked formulation findings were preserved.

The manifest-ordered recipe corpus remains **114 files / 1,123 ingredient rows**, with fingerprint
`7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Verification

- Bundled seed-package normalization and validation passed.
- Generated ingredient-catalog index freshness passed.
- Research-ledger JSON Schema validation passed.
- Focused source-ID / URL checks and picker projections passed for `varagu`, `varagu maavu`,
  `pani varagu`, `cheena`, `cheena millet`, `cheena flour`, and `rockfish`.
- Recipe corpus fingerprint, UTF-8 without BOM, local Markdown links, and changed-file whitespace
  checks passed.
- No app, unit, instrumentation, emulator, or other tests were run. The catalog update only adds
  database JSON data and documentation, so tests were not needed under the updated workspace rule.

WP02 A6, WP03 Section F, and WP04 Section P remain open. See the [WP02 Varagu proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round18-varagu-kodo.md),
[WP03 Cheena proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round18-cheena-alias.md),
and [WP04 Yellowmouth Rockfish proposal](../../proposals/wp04-section-p-yellowmouth-rockfish-picker-boundary-review-20261013-round18.md).
