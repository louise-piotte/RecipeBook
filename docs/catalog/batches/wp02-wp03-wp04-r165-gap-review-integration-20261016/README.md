# WP02/WP03/WP04 R165 gap-review integration — 2026-10-16

## Integrated decisions

| Work package | Decision |
|---|---|
| WP02 Section 04 A6 — foxtail millet | Added `kauni` as an English alias to the existing foxtail-millet grain row. Kept it off the plain flour row: the regional recipe uses foxtail millet flour without calling it Kauni flour, and the direct Kauni-flour listing is explicitly sprouted. Existing displays, measurements, and substitution research remain unchanged. |
| WP03 Section F — yellow corn | Added identity-only `yellow corn kernels / grains de maïs jaune` for dry, whole, shelled, food-grade yellow field-corn kernels marketed for human food use. Kept it separate from generic and other color-qualified corn, sweet corn, popcorn, canjica/hominy, and milled or prepared products. The French display is a transparent construction from Québec grain terminology and color wording, not an OQLF package-term ruling. No aliases or numeric behavior were added. |
| WP04 Section P — kippered sardine | Held Brunswick's `Kippered Sardine Fillets / Filets de sardines kipper` outside references, forms, legacy mappings, and the ledger. The manufacturer does not provide a species or smoking process, retailer fish wording conflicts, and the bundled recipes contain no matching demand. |

The active catalog contains **1,541 references** and **119 forms**. The research ledger contains **1,886 records**, **8,045 source entries**, **6,884 distinct source IDs**, and **5,682 distinct URLs**. The bundle contains **114 recipes / 1,123 ingredient rows**; no Kauni or yellow-corn candidate terms were found in the recipe corpus.

## Static validation

Bundled seed-package validation passed, and the generated Kotlin index is current at 1,541 references. Research-ledger schema validation reported zero errors. New source ownership and decision links, exact alias ownership, the picker projections for `kauni`, `yellow corn kernels`, and `maïs jaune`, recipe counts and candidate-term scan, UTF-8/no-BOM checks, escaped seed Unicode, and scoped `git diff --check` passed.

No app, unit, instrumentation, emulator, deployment, or build tests were run because the catalog change adds database JSON data under the updated `AGENTS.md` rule.

## Proposal reviews

- [WP02 A6 Kauni foxtail-millet review](../../proposals/wp02-a6-next-regional-flour-review-r165-20261016-kauni.md)
- [WP03 Section F yellow-corn review](../../proposals/wp03-section-f-next-grain-cereal-review-r165-20261016.md)
- [WP04 Section P kippered-sardine hold](../../proposals/wp04-section-p-next-seafood-review-r165-20261016.md)

Sections 04 A6, F, and P remain open for further gap review.
