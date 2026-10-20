# WP03 Section K R124 — rapini identity integration

Add identity-only `ingredient-ref-rapini` as `rapini / rapini`, with English aliases `broccoli rabe` and `broccoli raab` from OQLF and French alias `brocoli italien` from Metro Québec. Keep rapini as the display name. Do not add bare broccoli/brocoli, `brocoli-rave`, turnip broccoli/Italian turnip, broccoletti, or Broccolini.

Picker projection: `rapini`, `broccoli rabe`, `broccoli raab`, and `brocoli italien` return the new row; broad `broccoli` grows from three to four results and `brocoli` from two to three. The complete-word `rabe` query resolves to rapini and takes priority over the existing substring matches in crabe. No recipe row in the 114-recipe / 1,123-row bundle matched.

The ledger records identity evidence and the source-specific measurement review. Health Canada’s 2015 cooked-rapini portions are not transferred to the fresh Metro bunch; the current CNF version caveat remains in the source record. No density, form, mapping, conversion, yield, recipe link, or substitution was added. See the [review proposal and source register](../../proposals/wp03-section-k-rapini-identity-alias-review-r124-20261015.md).

Static package and ledger validation, reference normalization, generated-index freshness, picker projection, source-prefix ownership, recipe-corpus boundary, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No Gradle, application, instrumentation, emulator, or deployment tests were run because the only database change adds JSON data under `AGENTS.md`.

At integration, the package contains 1,471 ingredient references, 105 forms, 1,812 ledger records, 7,492 source entries, and 6,370 distinct source IDs; the bundle remains 114 recipes / 1,123 ingredient rows. Section K remains open.
