# WP02/WP03/WP04 R167 gap-review integration

**Reviewed and integrated:** 2026-10-16
**Plan:** [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
**Proposals:** [Varagu podi boundary](../../proposals/wp02-a6-next-regional-flour-review-r167-20261016-varagu-podi.md), [teff grain Québec display](../../proposals/wp03-section-f-teff-grain-quebec-display-review-r167-20261016.md), and [smoked mackerel product boundary](../../proposals/wp04-section-p-smoked-mackerel-product-boundary-review-r167-20261016.md).

## Integrated decisions

- **WP02 A6 — Varagu podi:** Keep `varagu podi` unassigned and add no active alias, reference, or ledger record. Organic Mandya uses it for fine Kodo flour while Sri Saraswathi Organics uses it on Kodo rava. Adding it to the existing flour row would also change the phrase-first picker's broad `podi` result, replacing its Sapodilla substring fallback. The conflict is documented without allocating a source ID.
- **WP03 Section F — teff grain:** Change the existing `ingredient-ref-teff-grain` French display to `graines de teff`; retain `teff d'Abyssinie` and `tef` as French aliases. Keep English `teff`, the grain/flour boundary, category, density, mappings, forms, recipes, and substitution state unchanged. Register the two R167 product sources below and append one accepted display decision to the existing ledger record.
- **WP04 Section P — smoked mackerel:** Add identity-only `ingredient-ref-smoked-mackerel`, `smoked mackerel / maquereau fumé`, in `PROTEIN`. It is a finished-food market group, separate from Atlantic, Pacific, and Spanish mackerel species. Add no aliases, forms, measures, density, mappings, conversions, yields, recipe links, or substitutions. Keep smoke method, cut, seasoning, package size, storage, and readiness product-specific.

## Source registration

The teff-grain ledger record received new source IDs `WP03-TEFF-FR-DISPLAY-R167-20261016-S01` and `-S02` for Épices Anatol and the Tootsi Canada 2026 catalog. The Tootsi page URL also appears in a proposal-only Kaniwa review for a different product code; this registration identifies the separate teff code 20075, and the URL had no prior live-ledger registration. Existing OQLF, CFIA, TERMIUM, and Yupik sources were reused in the accepted decision rather than registered again.

The smoked-mackerel ledger record received nine new product-page source IDs, `WP04-SECTIONP-SMOKED-MACKEREL-R167-20261016-S01` through `-S09`. It also reuses existing CFIA Fish List, OQLF `maquereau`, and CFIA fish-labelling sources. Their registrations are reused on this record only to support the species and product-state boundaries; they do not assign the retail products to a species or establish a universal preparation state.

## Static validation

- Bundled seed package validation passed; ingredient-reference normalization and generated catalog freshness checks passed.
- Research-ledger validation passed with **1,887 records and 0 errors**. New IDs and URLs are unique, and decision-source links on both touched records resolve.
- The catalog has **1,543 references** and **119 forms**. The ledger has **8,066 source entries**, **6,902 distinct source IDs**, and **5,698 distinct URLs**. The bundle remains **114 recipes / 1,123 ingredient rows**.
- The full recipe corpus scan found no `varagu podi`, `smoked mackerel`, or `maquereau fumé` phrase hits and no direct smoked-mackerel recipe link. Static picker review preserves the existing `podi` result and teff query result sets; exact smoked-mackerel names resolve to the new row.
- UTF-8 without BOM, final newline, escaped Unicode in bundled JSON, and scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, build, or deployment tests were run; this batch changes catalog database JSON and its generated reference index only.

Sections 04 A6, F, and P remain open for their broader reviews.
