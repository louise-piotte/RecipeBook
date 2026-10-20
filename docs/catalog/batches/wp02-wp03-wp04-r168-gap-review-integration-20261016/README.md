# WP02/WP03/WP04 R168 gap-review integration

**Reviewed and integrated:** 2026-10-16

**Plan:** [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Proposals:** [Mandua Atta alias](../../proposals/wp02-a6-next-regional-flour-review-r168-20261016-mandua-atta.md), [amaranth-grain Québec display](../../proposals/wp03-section-f-amaranth-grain-quebec-display-review-r168-20261016.md), and [canned-tuna product boundary](../../proposals/wp04-section-p-canned-tuna-product-boundary-review-r168-20261016.md).

## Integrated decisions

- **WP02 A6 — Mandua Atta:** Add only `mandua atta` to `aliasesEn` on `ingredient-ref-finger-millet-flour`. Two maker pages use the exact name for finger-millet flour; the existing FSSAI entry supports the Mandua/finger-millet crop boundary. Retain `farine de ragi`, all other aliases, flour density observations, and blocked wheat-replacement research. Add no French alias, identity, form, active measure, mapping, conversion, yield, recipe link, or substitution.
- **WP03 Section F — amaranth grain:** Retain `ingredient-ref-amaranth-grain.nameFr = "amarante"` with no catalog or ledger delta. OQLF supports `amarante` as the preferred French cereal term; Québec product wording does not establish a better generic display. Keep the independent human Québec-language review open.
- **WP04 Section P — canned tuna:** Add identity-only `ingredient-ref-canned-tuna`, `canned tuna / thon en conserve`, in `PROTEIN`. Keep it separate from raw or unspecified tuna and all species-specific rows. Add no aliases, forms, measures, conversions, yields, recipe links, or substitutions. Keep species, cut, packing medium, seasoning, package amount, drained state, and readiness product-specific.

## Source registration

The finger-millet-flour record received new source IDs `WP02-A6-MANDUA-ATTA-ALIAS-R168-20261016-S01` and `-S02`; its accepted decision also cites the existing FSSAI source ID `WP02-A6-RAGI-ATTA-20261012-S01`.

The canned-tuna record received six new source IDs, `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01` through `-S06`, for the English/French Clover Leaf catalogs, the current MAPAQ 2025 report, and three Québec retailer product pages. The MAPAQ URL now serves the 2025 report; the registered title, date, and locator reflect that live version. The ledger records its category evidence without treating the reported sales value as a measure. Four existing source entries were reused on the new record: Clover Leaf's canned-skipjack page, Québec public-health terminology, OQLF's `germon` entry, and CFIA common-name guidance. The older Ocean's portfolio citation remains in its proposal archive; no live ledger entry was needed because the current manufacturer catalog already supports the product-variation boundary.

## Static validation

- Bundled seed-package validation, ingredient-reference normalization, and generated catalog freshness checks passed.
- Research-ledger validation passed with **1,888 records and 0 errors**. The eight new source IDs and URLs are unique; all new decision-source links resolve.
- The catalog has **1,544 references** and **119 forms**. The ledger has **8,078 source entries**, **6,910 distinct source IDs**, and **5,706 distinct URLs**. The bundle remains **114 recipes / 1,123 ingredient rows**.
- Static picker projection returns only the flour for `mandua atta`; broad `mandua` still returns the grain/flour pair and `atta` remains 11 rows. Exact `canned tuna` and `thon en conserve` searches return only the new row; broad `tuna` and `thon` searches each retain the eight existing generic/species choices plus the new product group.
- The manifest-listed recipe scan found no Mandua Atta or canned-tuna term hits and no canned-tuna reference link.
- Changed JSON is UTF-8 without BOM, ends with a newline, and stores non-ASCII characters as Unicode escapes. Local links and scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, build, or deployment tests were run because the catalog application-data changes only add database JSON data and refresh the generated catalog under `AGENTS.md`.

Sections 04 A6, F, and P remain open for broader reviews; the independent human Québec-language display review for `amarante` remains open.
