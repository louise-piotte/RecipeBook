# WP02/WP03/WP04 R734–R736 integration — 2026-10-18

Integrated two bounded catalog updates and one family hold. Sections A6, F, and P remain open.

## Decisions

- **R734 — white-quinoa-flour portion:** Recorded Tootsi's 1/4 cup (40 g) Nutrition Facts portion as product-specific evidence for product code 31501 on the existing white quinoa flour ledger row. The bilingual pages are two language views of one label, not independent measurements. Since neither page gives cup capacity or filling/weighing method, transferable measurement remains `researched_no_supported_value`; no generic measure, density, mapping, conversion, or substitution was added. The page's separate up-to-25% replacement statement remains outside this measurement review. See the [R734 proposal](../../proposals/wp02-a6-next-gap-review-r734-20261018.md).
- **R735 — Reese's Puffs family:** Held the family outside active references and the research ledger. General Mills Canada's bilingual product guides map the plain and Bats package codes one way, while Metro's indexed English/French listings reverse those titles and codes; Metro also indexes a Dark Chocolate listing absent from the Canadian guide set. Current Canadian variant/package evidence is needed before allocating family rows. No data or source identifiers were added. See the [R735 proposal](../../proposals/wp03-section-f-next-open-gap-review-r735-20261018.md).
- **R736 — Haddock form:** Added `fresh whole haddock / églefin frais entier` as one `fresh_whole` form under the existing Haddock identity. Qualified English/French whole-fish phrases select that form while plain/smoked Haddock results and broad whole-fish searches remain unchanged. The form does not imply cleaning, scaling, heading, evisceration, a measure, yield, recipe behavior, or substitution. R554's held Haddock-loin form and the R149, R164, and R712 boundaries remain unchanged. See the [R736 proposal](../../proposals/wp04-section-p-haddock-fresh-whole-form-review-r736-20261018.md).

## Package state

- 1,848 ingredient references; 176 forms; 114 manifest-listed recipes; 1,123 structured ingredient rows.
- 2,233 research-ledger records; 10,476 source entries; 8,845 distinct source IDs; 7,492 distinct source URLs.
- The recipe corpus scan found no R734/R736 candidate names or links and no R735 Reese's Puffs family/variant matches or links.

## Static verification

- Bundled package normalization/validation, generated reference-index freshness, and ledger schema/semantic validation passed.
- Four new source IDs each have one ledger owner. The R734 Tootsi English/French detail URLs and R736 Seafood from Canada English/French URLs are distinct and were unowned before integration. R735's May 2025 General Mills PDF is already owned on four Chex records; its hold added no duplicate source.
- Picker projection: R736's qualified whole-Haddock English/French terms each return one Haddock form hint. `haddock` and `aiglefin` remain 2 results, `scrod` remains 2, `whole fish` and `poisson entier` remain 1, and broad `fresh`/`frais` and `whole`/`entier` searches remain multi-result. R734 is ledger-only; R735 adds no terms.
- The R735 package-code conflict is documented with the linked proposal evidence. No active cereal row or source ID was allocated.
- Changed JSON files decode as UTF-8 without BOM, with French characters escaped in bundled seed JSON. Local links, scoped whitespace, and diff checks passed.
- No software tests, builds, emulator run, or deployment were performed. The active catalog changes only add database JSON data, so tests are not required under [AGENTS.md](../../../../AGENTS.md).

## Follow-up

Continue the broader WP02 Section A6, WP03 Section F, and WP04 Section P reviews.
