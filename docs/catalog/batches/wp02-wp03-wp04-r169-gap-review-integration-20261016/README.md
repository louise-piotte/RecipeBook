# WP02/WP03/WP04 R169 gap-review integration

**Reviewed and integrated:** 2026-10-16

**Plan:** [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Proposals:** [Kodra aliases](../../proposals/wp02-a6-next-regional-flour-review-r169-20261016-kodra.md), [grain-sorghum Québec display](../../proposals/wp03-section-f-grain-sorghum-quebec-display-review-r169-20261016.md), and [smoked-salmon product boundary](../../proposals/wp04-section-p-smoked-salmon-product-boundary-review-r169-20261016.md).

## Integrated decisions

- **WP02 A6 — Kodo millet:** Added `kodra` to the existing Kodo-grain search aliases and `kodra flour` / `kodra atta` to the Kodo-flour aliases. Bare `kodra` returns both grain and flour; each qualified flour query returns only the flour. Retained both French displays, all source-specific measurement observations, and blocked substitution findings. Added no form, active measure, recipe link, conversion, yield, or substitution.
- **WP03 Section F — grain sorghum:** Retained `grain sorghum / sorgho à graine` and its existing aliases. The registered OQLF entry supports the Québec bilingual display; its page returned a cache miss during this review. Made no catalog or ledger change. The independent human Québec-language review remains open.
- **WP04 Section P — smoked salmon:** Added identity-only `smoked salmon / saumon fumé` as a species-neutral finished-food market group, separate from raw salmon, salmon species, and other smoked fish. Kept species, cut, cure, smoke method, storage, readiness, package, and composite preparations product-specific. Added no aliases, forms, measures, conversions, yields, recipe links, or substitutions.

## Source registration

The Kodo-flour record received the new Aman Brand source `WP02-A6-KODO-KODRA-ALIASES-R169-20261016-S01`. Existing Organic Mandya source `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` and ICAR–IIMR source `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` were reused and their locators/support updated. The proposal's Aman page showed the item sold out; the record preserves product wording without inferring availability. The language label attached to Kodra Atta remains unassigned.

The smoked-salmon record received sources `WP04-SECTIONP-SMOKED-SALMON-R169-20261016-S02` through `S05`, plus the reused OQLF terminology source `WP04-PFSTATE-20261012-S02`. The OQLF source supports the exact French and English display. No product-specific package or serving values were added. WP03 registered no new source.

## Static validation

- Bundled seed-package validation, ingredient-reference normalization, generated catalog freshness, and research-ledger schema validation passed.
- The catalog has **1,545 references** and **119 forms**. The ledger has **1,889 records**, **8,084 source entries**, **6,916 distinct source IDs**, and **5,712 distinct URLs**.
- Static picker projection returns both Kodo grain and flour for `kodra`; `kodra flour` and `kodra atta` return only flour. Exact `smoked salmon` and `saumon fumé` return only the new identity. Broad `salmon / saumon` and `smoked / fumé` searches remain multi-result.
- The manifest-ordered scan covered **114 recipe files and 1,123 ingredient rows**. It found no candidate phrase hits and no direct Kodo-grain, Kodo-flour, or smoked-salmon recipe links.
- New source IDs and URLs are unique; accepted-decision source links resolve. JSON and Markdown files are UTF-8 without BOM and have final newlines. Database JSON stores non-ASCII characters as Unicode escapes.
- No app, unit, instrumentation, emulator, build, or deployment tests were run. This batch only adds database JSON data and documentation under `AGENTS.md`.

Sections 04 A6, F, and P remain open for broader reviews; independent human Québec-language sign-off for `sorgho à graine` remains open.
