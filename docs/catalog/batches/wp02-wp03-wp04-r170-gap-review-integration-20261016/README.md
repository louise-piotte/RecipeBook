# WP02/WP03/WP04 R170 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Kodo flour alias](../../proposals/wp02-a6-next-regional-flour-review-r170-20261016-kodra-peeth.md), [spelt berries](../../proposals/wp03-section-f-spelt-berries-current-evidence-recheck-r170-20261016.md), and [canned sardines](../../proposals/wp04-section-p-canned-sardine-product-boundary-review-r170-20261016.md).

## Integrated decisions

- **WP02 A6 — Kodo millet flour:** Added only `kodra peeth` as an English-search alias to the existing Kodo flour reference. The exact regional phrase is listed for the maker's finely ground Kodo flour, and ICAR–IIMR maps Marathi `Kodra` to Kodo millet ([Organic Mandya](https://organicmandya.com/products/kodo-millet-flour-500-gm), [ICAR–IIMR](https://millets.res.in/millets_info.php)). Kept the French display and all measurement observations and blocked substitution findings unchanged; added no French term, form, active measure, recipe link, conversion, yield, or substitution.
- **WP03 Section F — spelt berries:** Added identity-only `spelt berries / grains d’épeautre` as `GRAIN_AND_CEREAL`. The Québec product page identifies *Triticum spelta* and labels its whole grain for cooking; the existing OQLF source supports the base bilingual name ([Coop Agrobio / Comptoir Saint-Vrac](https://comptoirstvrac.com/product/2088), [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre)). Kept the row separate from generic wheat berries, einkorn, emmer, flour, flakes, and puffed spelt. Added no aliases, forms, reusable measures, recipe links, conversions, yields, or substitutions; cooking instructions remain source-specific.
- **WP04 Section P — canned sardines:** Added identity-only `canned sardines / sardines en conserve` as `PROTEIN`, a finished-food market group separate from raw European pilchard, Pacific sardine, Atlantic herring, and canned tuna. Codex defines a multi-species canned product class, while Brunswick markets its Canadian sardine products in the canned-seafood section and states its own products use Atlantic herring ([Codex CXS 94-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B94-1981%252FCXS_094e.pdf), [Brunswick FAQ](https://brunswickcanada.ca/faq/)). Kept product species, packing medium, cut, and drained state source-specific. The 106 g package and 84 g drained nutrition basis apply to one SKU each; they are not reusable measures or a conversion. Added no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

## Source registration

- WP02 reused Organic Mandya S03 and ICAR–IIMR S08. The Organic Mandya source locator and support now include `Kodra Peeth`; no source ID or URL was duplicated.
- WP03 added four source entries for Coop Agrobio, Almanac Grain, Équiterre, and the Gouvernement du Québec. It reused the established OQLF source ID for `épeautre`.
- WP04 added five source entries for Brunswick's English/French product information and Metro's Québec retail listing. It reused the existing OQLF sardine, CFIA Fish List/common-name and labelling, and Codex sources. The Brunswick French FAQ and Metro item could only be confirmed from indexed results in this audit; the ledger records those retrieval limits. Their package or product wording is not generalized.

## Static validation

- Bundled seed package validation passed; ingredient-reference normalization and generated-index freshness checks passed. The generated index contains **1,547 references**.
- Research-ledger schema, accepted-decision source linkage, new source-ID and URL ownership, and UTF-8/no-BOM checks passed.
- Static picker projection passed for 10 exact and broad queries: `kodra peeth` and `peeth` return only Kodo flour; `kodra` still returns grain and flour; exact canned-sardine English/French queries return the new product group; singular `sardine` stays on the two species rows; `spelt berries` and `grains d’épeautre` return the new grain row; `grains de petit épeautre` stays on einkorn.
- The manifest scan covered **114 recipe files / 1,123 ingredient rows** and found no R170 candidate phrase or direct identity link.
- Totals: **1,547 references**, **119 forms**, **1,891 ledger records**, **8,099 source entries**, **6,925 distinct source IDs**, and **5,721 distinct source URLs**; the bundle remains **114 recipes / 1,123 ingredient rows**. Local Markdown links and scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, build, or deployment tests were run. This batch adds database JSON data and related documentation under the updated `AGENTS.md` rule.

Sections 04 A6, F, and P remain open for broader candidate coverage. Independent human Québec-language review for grain sorghum remains open.
