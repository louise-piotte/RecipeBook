# WP02/WP03/WP04 R164 gap-review integration — 2026-10-16

## Integrated decisions

| Work package | Decision |
|---|---|
| WP02 Section 04 A6 — foxtail millet | Added `kangani` to the existing grain row and the exact phrase `kangani ka atta` to the existing flour row. The previous hold was based on Canadian listings that did not use these exact spellings. ICAR–IIMR maps Kangani to foxtail millet, a current Canadian grain listing pairs `Foxtail Millet` with `Kangani`, and the maker’s flour page labels its foxtail flour `kangani ka Atta`. The shorter `kangani` query offers grain and flour; `kangani ka atta` selects flour. `kangani atta`, `kangani flour`, `kangni atta`, and Hari Kangni/Hari Kangani remain inactive. Existing French displays, measures, observations, and blocked flour-substitution research were preserved. |
| WP03 Section F — Peruvian purple corn | Added identity-only `Peruvian purple corn kernels / grains de maïs mauve péruvien` for dry, food-grade whole kernels marketed as Peru-sourced `maíz morado`. No Spanish alias, forms, measurements, conversions, yields, recipe links, or substitutions were added. The short French `maïs mauve` search returns this row; bare Spanish `maíz morado` remains unassigned to preserve the cross-country boundary. The one-word `mauve` query now returns the corn row through a complete-word match; `guimauve` finds marshmallow creme and `guimauves` finds marshmallows. |
| WP04 Section P — Finnan haddie | Held Finnan haddie / `gades fumés` outside active references and the ledger. OQLF defines the Québec term for several gadid species or mixtures and cautions against applying it to a single smoked-haddock product; current Canadian sellers use Finnan haddie for single-species smoked haddock. No current Québec-facing product label or bundled recipe resolves the scope. The accepted `smoked haddock / aiglefin fumé` row remains unchanged. |

All 114 manifest-listed recipe files and 1,123 structured ingredient rows were scanned; no R164 candidate demand or direct recipe links were found.

## Data and verification

The package now contains **1,540 references** and **119 forms**. The research ledger contains **1,885 records**, **8,031 source entries**, **6,872 distinct source IDs**, and **5,670 distinct URLs**. The generated Kotlin catalog index is current at 1,540 references.

Static package normalization and validation, generated-index freshness, ledger-schema validation, R164 decision-to-source linkage, metadata consistency for reused source entries touched this round, ownership checks for new source IDs and URLs, exact-key ownership, picker projections, full manifest-recipe scan, UTF-8/no-BOM checks, escaped French Unicode, proposal/README links, and scoped whitespace checks passed. No app, unit, instrumentation, emulator, deployment, or build tests were run: the catalog implementation only adds database JSON data and refreshes its derived index under the updated `AGENTS.md` rule.

## Proposal reviews

- [WP02 A6 Kangani foxtail-millet review](../../proposals/wp02-a6-next-regional-flour-gap-review-r164-20261016-kangani-foxtail-millet.md)
- [WP03 Section F Peruvian purple-corn review](../../proposals/wp03-section-f-peruvian-purple-corn-kernels-identity-review-r164-20261016.md)
- [WP04 Section P Finnan-haddie naming hold](../../proposals/wp04-section-p-finnan-haddie-naming-picker-boundary-review-r164-20261016.md)

Sections 04 A6, F, and P remain open for further gap review.
