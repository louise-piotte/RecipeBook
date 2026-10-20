# WP03/WP04 round-30 product-boundary holds

Reviewed 2026-10-13. This packet records two separate candidate reviews that remain outside the
active ingredient picker. Neither review changed catalog JSON or the research ledger.

## Decisions

- **WP03 Section F — Hausa Koko flour:** Keep the dry flour mix unallocated. Ghanaian sources use
  Hausa koko for prepared porridge, while Canadian retail listings also use the phrase for a dry
  flour mix. The current phrase-first picker would make bare `koko` and `Hausa koko` select the dry
  product alone, and the bundled recipes do not establish that users need this product. Do not add
  an active row, alias, ledger candidate, form, measure, recipe link, conversion, yield, or
  substitution. See the [proposal](../../proposals/wp03-section-f-hausa-koko-flour-identity-review-20261013.md).
- **WP04 Section P — dried fish maw:** Keep it as an unallocated research candidate. Canadian
  retail and federal terminology sources support the dried product name and the fish-maw/air-bladder
  equivalence, but an active row would make bare `fish maw` and `vessie natatoire` select only the
  dried item. The recipe bundle has no demand to clarify whether users intend this dried product or
  another state. Historical Québec `nauve`/`nôve` wording is not added as an alias because local
  sources apply those forms to different cod parts and preparations. Add no active row, alias, form,
  measure, recipe link, conversion, yield, or substitution. See the
  [proposal](../../proposals/wp04-section-p-dried-fish-maw-product-boundary-review-20261013-round30.md).

## Verification

Proposal-local source IDs, local links, UTF-8/no-BOM, and scoped whitespace were checked. No tests
were run: this hold-only packet changes no code, and the concurrent catalog additions consist only
of database JSON data under `AGENTS.md`.
