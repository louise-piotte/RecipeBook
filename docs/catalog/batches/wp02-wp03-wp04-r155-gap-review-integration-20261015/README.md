# WP02/WP03/WP04 R155 gap-review integration

Integrated 2026-10-15 after independent review of the three proposal-only R155 reviews.

## Decisions

- Added identity-only `red rice flour / farine de riz rouge` as
  `ingredient-ref-red-rice-flour` in `FLOUR_AND_STARCH`. Keep it separate from red rice grain,
  flakes, explicitly roasted red rice flour, and the unresolved Puttu family. The French display is
  attested on current French-language product pages, not an OQLF ruling or verified Québec-preferred
  name; independent Québec review remains open. Add no aliases, forms, measures, density, mappings,
  conversions, yields, recipe links, or active substitutions.
- Added identity-only `soft red winter wheat berries / grains de blé tendre rouge d'hiver` as
  `ingredient-ref-soft-red-winter-wheat-berries` in `GRAIN_AND_CEREAL`. Keep it separate from generic
  and other named wheat berries; do not infer cultivar, grade, origin, season, or formal grain class.
  The French display is a provisional construction informed by OQLF and Canadian Grain Commission
  wording, not a verified Québec retail title; independent review remains open. Add no aliases, forms,
  measures, density, mappings, conversions, yields, recipe links, or substitutions.
- Held unqualified packaged smoked oysters / `huîtres fumées` outside active references, forms,
  legacy mappings, and the research ledger. Ocean's and Clover Leaf identify their manufacturer
  products as *Crassostrea gigas*, while Metro's Québec `Huîtres fumées entières` listing does not
  specify species or smoke process. Do not attach the general phrase to an oyster species or add a
  universal smoked/canned form. No bundled recipe demand was found.

## Source review

Root independently checked the product and terminology sources linked in the [WP02 red-rice-flour
proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-r155-20261015.md), the [WP03
soft-red-winter-wheat proposal](../../proposals/wp03-section-f-next-grain-gap-review-r155-20261015.md),
and the [WP04 smoked-oyster proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r155-20261015.md).

- Miller and product-directory pages name unqualified red rice flour, including the exact French
  wording `Farine de Riz Rouge`; Canadian retailer listings support the English product name. These
  sources do not establish a single cultivar or grade. OQLF's base `farine de riz` entry does not
  approve the compound French display. The Walmart marketplace item contradicts its own French title
  by describing white-rice flour and was excluded as evidence.
- 1847 Stone Milling's visible product heading and collection list soft-red-winter berries separately
  from soft-white and hard-red-spring products. Its product URL slug says `soft-white`, so the heading
  is used only alongside the separate collection evidence. A Canadian retailer also lists the soft-red
  product. No source identifies the cultivar or assigns a Canadian grain class. The French display
  combines OQLF's `blé tendre` with Canadian Grain Commission class wording and remains provisional.
- Ocean's and Clover Leaf identify their own smoked-oyster products as *C. gigas*. Metro's Québec
  SKU provides `Huîtres fumées entières`, an 85 g package, and ingredients, but no species or smoking
  method. OQLF's entries distinguish bare `huître` / American oyster from `huître creuse du Pacifique`;
  they do not define a general smoked-oyster class. The 65 g drained label basis on Clover Leaf remains
  product-specific and is not transferred to Metro's 85 g package.

## Static verification

- Reference normalization, bundled package normalization and validation, generated-catalog freshness,
  and research-ledger validation passed.
- Static picker projection resolves both new bilingual names. `rice flour` returns 10 references;
  `wheat berries` returns 8; `soft wheat` remains at 11; `blé tendre` returns 13. The smoked-oyster
  phrases remain absent, and broad `oyster` / `huître` results remain at 9 / 7.
- The 114 manifest-listed recipes and 1,123 ingredient rows contain no matching candidate phrases or
  oyster terms. Recipe files and rows were not changed.
- UTF-8 without BOM, escaped accents in bundled database JSON, no mojibake, local Markdown links, and
  scoped whitespace checks passed.
- Final totals: **1,528 ingredient references**, **119 forms**, **1,873 ledger records**, **7,937
  source entries**, and **6,785 distinct source IDs**. The generated Kotlin index contains 1,528
  references; the bundled corpus remains **114 recipes / 1,123 ingredient rows**.

No tests, app builds, emulator runs, or deployments were performed. The catalog changes add database
JSON data, under the current `AGENTS.md` no-testing rule; WP04 is documentation-only.

See the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt) and the three
R155 proposals linked above. WP02 A6, Section F, and Section P remain open.
