# WP02 / WP03 / WP04 round-seventeen gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — proso millet flour:** Added `barri flour` to the English aliases on the existing `ingredient-ref-proso-millet-flour` row. Kept `barri atta` unassigned with an unresolved ledger decision: the exact product wording was found on a page with all sizes sold out, and the same phrase appears for an unidentified medicinal plant in a separate ethnobotanical context. No Canadian or Québec flour label supports either phrase. Preserved the French display, density, unit mappings, forms, measurement research, recipe links, and blocked substitution findings.
- **WP03 Section F — common millet:** Added `cheno` to the English aliases on `ingredient-ref-common-millet`. ICAR–IIMR maps Gujarati `Cheno` to proso millet, and A1’s Ontario grain listing uses the spelling with proso millet. Preserved `millet commun`, the flour row, all numeric fields, and recipe links.
- **WP04 Section P — spotted wolffish:** Added identity-only `spotted wolffish / loup tacheté` for *Anarhichas minor*, with no aliases. OQLF and CFIA support the species-qualified names. DFO conservation rules remain scoped to the named fisheries, and the single seller report is limited evidence of PEI farmed supply; the catalog makes no claim of routine Québec availability or wild-retention permission. No form, measure, recipe link, conversion, yield, or substitution was added.

## Shared data changes

The active reference package has **1,345 references** and **98 forms**. It gained two aliases on existing references and one identity-only reference. No form or recipe data changed.

The research ledger has **1,658 records**, **6,435 source entries**, **5,389 distinct source IDs**, and **4,479 distinct URLs**. It retains **342 measurement observations** and **195 substitution findings**. The new wolffish record has no measurement observations or substitution findings. The common-millet decision reuses the existing ICAR–IIMR and A1 records. The proso-flour record now holds four new regional-flour and homonym sources. The wolffish record reuses four ledger sources and adds six sources not previously registered in the ledger, including one source ID first introduced in an earlier proposal.

The manifest-ordered recipe corpus remains **114 files / 1,123 ingredient rows**, with fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Verification

- Bundled seed-package normalization and validation passed.
- Generated ingredient-catalog index freshness passed.
- Research-ledger JSON Schema validation passed.
- Focused source ID / URL and picker-projection checks passed for `cheno`, `barri flour`, `barri atta`, `spotted wolffish`, `loup tachete`, `wolffish`, `loup`, and `catfish`.
- Recipe corpus fingerprint, local Markdown links, UTF-8 without BOM, mojibake, and changed-file whitespace checks passed.
- No app, unit, instrumentation, emulator, or other tests were run. The catalog change only adds database JSON data, so tests were not needed under the updated workspace rule.

WP02 A6, WP03 Section F, and WP04 Section P remain open. See the [WP02 Barri flour proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round17-barri-flour.md), [WP03 Cheno proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round17-cheno-alias.md), and [WP04 spotted-wolffish proposal](../../proposals/wp04-section-p-spotted-wolffish-loup-tachete-identity-review-20261013-round17.md).
