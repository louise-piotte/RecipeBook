# WP08 cornstarch-to-tapioca-starch ratio conflict

**Date:** 2026-10-16
**Scope:** Directional contextual-substitution research in the cornstarch research-ledger record.
**Shared owner:** Root integration agent.

## Decision

Recorded a blocked, one-way cornstarch-to-tapioca-starch candidate for liquid thickening in
`docs/catalog/research-ledger.v1.json`. The evidence supports recording the direction, but not
selecting a usable amount:

- Iowa State Extension reports 2 tablespoons tapioca starch per 1 tablespoon cornstarch and
  attributes that recommendation to Bob's Red Mill.
- Bob's Red Mill's direct *All About Starches* guide gives 4 tablespoons tapioca starch per
  3 tablespoons cornstarch.

These are conflicting volume ratios. The ledger keeps both source statements and leaves the finding
`blocked_pending_evidence`; it does not select, average, reconcile, reverse, or activate either ratio.
The candidate has no quantity on its replacement, no active substitution rule, and no recipe-line
link. The 1:1 statement for instant/minute tapioca is kept separate from extracted tapioca starch,
and the source's pearl, flake, powder, and granule forms are not collapsed into one replacement.

The context is limited to liquid thickening. Neither source resolves a specific sauce or recipe, and
the current runtime cannot enforce the thickener role or source volume basis. Bob's Red Mill reports
a glossy finish for tapioca starch and an opaque finish for cornstarch; that difference is recorded
as an expected effect without claiming a recipe-specific result.

## Sources

- [Iowa State University Extension and Outreach, AnswerLine: Tapioca](https://blogs.extension.iastate.edu/answerline/tag/cornstarch-substitution/), published 2018-01-29 and reviewed/updated 2025-03. Its entry distinguishes tapioca forms and separately reports the 2:1 starch and 1:1 instant-tapioca recommendations.
- [Bob's Red Mill, All About Starches](https://www.bobsredmill.com/articles/all-about-starches), dated 2018-07-06. The direct manufacturer guide reports the 3:4 cornstarch-to-tapioca-starch ratio and finish comparison.

The Iowa State URL is already cited on the tapioca-starch ledger record, and the Bob's Red Mill URL is
already cited on the arrowroot record. New source IDs were added to the cornstarch record so the new
finding has record-local source linkage; neither URL increased the distinct-URL total.

## Validation

- Seed package and research-ledger schema validation passed: 1,886 ledger records, zero errors.
- Generated ingredient index is current at 1,542 references; no reference, form, runtime rule, or
  generated-index row changed in this batch.
- The new finding has the cornstarch-to-tapioca-starch direction, both local source links, no
  selected quantity, and `blocked_pending_evidence` state. Its source IDs are unique and each URL
  collision is an intentional reuse of the cited page on another ingredient record.
- Scanning the 114 bundled recipes (1,123 ingredient rows) found no tapioca-starch reference links.
- Totals: 1,542 references, 119 forms, 1,886 ledger records, 8,052 source entries, 6,891 distinct
  source IDs, 5,687 distinct source URLs, and 114 recipes / 1,123 ingredient rows.
- JSON and plan files have no UTF-8 BOM and end with a newline; scoped `git diff --check` passed.
- No tests were run because the change only adds database JSON research data, under the updated
  `AGENTS.md` rule.

Broader WP08 contextual-substitution research remains open.
