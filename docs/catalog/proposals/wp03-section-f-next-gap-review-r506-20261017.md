# WP03 Section F — white-corn grits picker alias review (R506, 2026-10-17)

## Review record

- **Status:** Integrated on 2026-10-17 as an English alias on the existing corn-grits reference. No ledger record, recipe link, or runtime numeric data was added. See the [R504–R506 integration README](../batches/wp03-wp04-wp06-r504-r506-gap-review-integration-20261017/README.md).
- **Scope:** One phrase gap in the open Section F grits/polenta/hominy/pozole/dried-corn/puffed-grain cluster. This review covers the manufacturer-attested English phrase **`white corn grits`** and does not reopen the existing corn-grits identity boundary or the broader cluster.
- **Recommendation:** Add `white corn grits` as an English alias to the active `ingredient-ref-corn-grits` row. Keep the existing French display and aliases unchanged. Do not create a white-grits identity or French alias.

The active plan keeps this aggregate cluster open at [line 4155](../../RecipeBook-global-ingredient-catalog-plan.txt#L4164). The existing ordinary-grits decision is recorded in the [R113 review](wp03-section-f-ordinary-corn-grits-boundary-review-r113-20261014.md) and its integration. This proposal addresses only a current manufacturer phrase that R113 documented as product evidence but did not allocate to the picker.

## Evidence and product scope

Bob’s Red Mill’s 2026 Canadian French product list pairs the English product name **`Corn Grits, White`** with **`Gruau de maïs blanc typique du Sud`** and identifies white corn as its ingredient [R113-S05]. Its current Canadian French product page describes dried white corn ground into a coarse gruel, distinguishes the product from its stone-ground cornmeal, and says it is not instant; the product image is identified as **`White Corn Grits`** [R113-S06]. Together these support the scoped English phrase `white corn grits` as a color-qualified product name within ordinary corn grits.

The proposal does not claim that all corn grits are white, that this one brand establishes an industry-wide processing specification, or that white corn kernels are interchangeable with grits. It adds a searchable product phrase to the existing generic grits reference rather than creating a separate color identity. The current identity remains `corn grits / semoule de maïs de type grits`, with `degermed corn grits` and `maize grits` as its existing English aliases.

Keep the French product wording off the alias list. The manufacturer’s `gruau de maïs blanc typique du Sud` is product-attested, but the shorter phrase `gruau de maïs` is currently owned by `ingredient-ref-hominy-grits`; the picker matches a query phrase inside longer terms, so adding the longer French wording would also make the broad query return both corn grits and hominy grits. Keep `semoule de maïs de type grits` as the disambiguating French display. Do not use `semoule de maïs` as a new alias; `ingredient-ref-cornmeal` already owns that broad French term.

## Current ownership audit

The current package contains **1,783 ingredient references**, **143 forms**, and **2,140 research-ledger records**. The legacy-import file has **56 candidates**.

| Owner or record | Current state | Decision for R506 |
|---|---|---|
| `ingredient-ref-corn-grits` | `corn grits / semoule de maïs de type grits`; English aliases `degermed corn grits`, `maize grits`; no French aliases; category `GRAIN_AND_CEREAL`; null density; empty unit mappings. Its ledger identity is `verified`, measurement state is `researched_no_supported_value`, and substitution state is `not_yet_researched`. | Add only the English alias `white corn grits`. Do not change the displays, category, numeric fields, or states. |
| `ingredient-ref-hominy-grits` | `hominy grits / gruau de maïs`; no aliases, forms, density, or unit mappings. | Keep this row as owner of the existing French phrase. Do not add the manufacturer’s longer French wording as an alias. |
| `ingredient-ref-cornmeal` | `cornmeal / semoule de maïs`; English alias `corn meal`; category `FLOUR_AND_STARCH`. | Keep the broad meal identity and French term separate from grits. |
| `ingredient-ref-white-corn-kernels` | `white corn kernels / grains de maïs blanc`; identity-only. | Keep the whole-kernel identity separate. A broad `white corn` search may show it beside the qualified `white corn grits` result. |
| Forms | No active form label or match term contains corn-grits, hominy-grits, or cornmeal wording. | Add no form or form hint. |
| Legacy candidates | No legacy-import candidate names or aliases contain corn, grits, hominy, or polenta terms. | No legacy candidate needs reassignment. |
| Research ledger | `ingredient-ref-corn-grits` already owns the R113 evidence and source-specific observations. No distinct `white corn grits` candidate or decision exists. | Reuse the R113 source IDs below; do not create duplicate source records or another ingredient identity. |

The core product boundaries are established in the existing R113 evidence: Codex distinguishes ordinary degermed grits from cornmeal, hominy grits, quick grits, and alkaline-treated corn products [R113-S01]; OQLF’s broad `semoule de maïs` entry remains on cornmeal [R113-S02]; Statistics Canada separately maps human-food corn meal and hominy grits [R113-S04]. La Moisson’s current Québec listing also uses `gruau de maïs` for a white-corn grits product, but does not establish hominy processing or a general equivalence [R113-S10]. Those boundaries remain unchanged.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case and accents, checks complete word phrases across names, aliases, and form terms, then uses substring matching if there is no phrase match. The projection below follows that behavior over the current references and forms; it is a static ownership calculation, not a UI or emulator test.

| Query | Current result | Projected result with `white corn grits` | Effect |
|---|---|---|---|
| `white corn grits` | No result | `ingredient-ref-corn-grits` | Newly searchable, fully qualified product phrase. |
| `corn grits` | `ingredient-ref-corn-grits` | Same row | Unchanged. |
| `degermed corn grits`; `maize grits` | `ingredient-ref-corn-grits` | Same row | Existing aliases remain. |
| `white corn` | `ingredient-ref-white-corn-kernels` | `ingredient-ref-corn-grits`; `ingredient-ref-white-corn-kernels` | Broader query gains the grits product as a second scoped result. |
| `white corn kernels` | `ingredient-ref-white-corn-kernels` | Same row | The more specific whole-kernel query remains distinct. |
| `hominy grits`; `gruau de maïs` | `ingredient-ref-hominy-grits` | Same row | Existing hominy-grits ownership remains. |
| `semoule de maïs` | `ingredient-ref-corn-grits`; `ingredient-ref-cornmeal` | Same two rows | Existing broad French ambiguity remains; no alias is added. |
| `grits` | `ingredient-ref-attieke`, `ingredient-ref-barley-grits`, `ingredient-ref-buckwheat-grits`, `ingredient-ref-corn-grits`, `ingredient-ref-hominy-grits`, `ingredient-ref-sorghum-grits` | Same six rows | No new row or broad alias is added. |
| `polenta` | No result | No result | No generic-polenta identity is proposed. |

Do not add `gruau de maïs blanc typique du Sud` as a French alias: the phrase-first picker would also return `ingredient-ref-corn-grits` for the shorter `gruau de maïs` query, alongside `ingredient-ref-hominy-grits`. The query `white corn` is an intentional broad search; the full phrase `white corn grits` selects the grits row alone.

## Measurements, forms, and substitutions

The corn-grits ledger record already preserves two non-generalizable observations:

- Bob’s product label states **1/4 cup (40 g)** for its dry white corn grits [R113-S06]. This is one SKU’s serving, not a default measure, density, or conversion.
- RICARDO specifies **1 cup (180 g)** of corn grits for its shrimp-grits recipe [R113-S09]. This is a recipe-specific amount; it does not override the manufacturer serving or define a reusable cup weight.

The active row remains identity-only: no forms, default measure, density, unit mappings, conversions, yields, or recipe links. Its substitution state remains `not_yet_researched`; RICARDO’s recipe-specific option to use coarse cornmeal/polenta-type semolina does not support a global or contextual substitution. The R506 alias proposal adds no numeric or substitution behavior.

## Manifest recipe scan

The full package manifest lists **114 recipe files** with **1,123 structured ingredient rows**. A UTF-8 scan of every manifest-listed recipe file and every ingredient row for `white corn grits`, `corn grits`, `grits`, `hominy grits`, `hominy`, `cornmeal`, `corn meal`, `semoule de maïs`, `gruau de maïs`, `polenta`, and `maïs blanc` found **0 matching recipe files and 0 matching ingredient rows**. There is no bundled recipe demand, line to relink, or recipe-specific substitution to infer.

Corpus fingerprint: SHA-256 `d870d4e10ea14513b63e36f522668d948df59f27e9b21882826885a549ac26cd`, computed over manifest-listed recipe paths in lexical order by updating with each UTF-8 relative path, a NUL byte, and that file’s raw bytes. This identifies the recipe corpus snapshot reviewed here.

## Proposed fields

| Field | Projected value |
|---|---|
| ID | `ingredient-ref-corn-grits` (existing) |
| English display | `corn grits` (unchanged) |
| fr-CA display | `semoule de maïs de type grits` (unchanged) |
| English aliases | `degermed corn grits`; `maize grits`; **`white corn grits`** |
| French aliases | None |
| Category | `GRAIN_AND_CEREAL` (unchanged) |
| Forms | None |
| Default density / unit mappings | `null` / `[]` |
| Recipe links / substitutions | None |

This alias fills the previously unowned, source-attested English product phrase without changing identity ownership or French query behavior. The aggregate Section F checklist remains open.

## Source-ID to URL mapping and limits

All IDs below are already owned by the active `ingredient-ref-corn-grits` ledger record from R113. Their source-ID-to-URL mapping is preserved; this proposal creates no new IDs and does not duplicate ledger sources. Bob’s product-list and Canadian product-page URLs were reopened on 2026-10-17; the historical ledger access date remains 2026-10-14.

| Source ID | Source URL | Support and limits |
|---|---|---|
| `WP03-OCG-R113-20261014-S01` | https://www.fao.org/4/a1392e/a1392e00.pdf | Codex defines the ordinary degermed maize-grits product class and distinguishes it from hominy grits, quick grits, alkaline-treated corn, and meal; it does not establish the proposed color-qualified alias. |
| `WP03-OCG-R113-20261014-S02` | https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais | OQLF’s broad `semoule de maïs` term remains on cornmeal; it does not name this alias. |
| `WP03-OCG-R113-20261014-S03` | https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais | Lexical record lists `grits`, `corn grits`, and U.S.-scoped `hominy grits` in a brewing/malt-crushing domain. It is not used as standalone evidence for a modern food label. |
| `WP03-OCG-R113-20261014-S04` | https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf | The human-food classification keeps corn meal and hominy grits in separate bilingual rows; it does not directly name ordinary corn grits. |
| `WP03-OCG-R113-20261014-S05` | https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/30-31/ | Bob’s 2026 Canadian French list pairs `Corn Grits, White` with `Gruau de maïs blanc typique du Sud` and identifies white corn. This directly supports the English alias, but the French phrase remains off the alias list because of the existing `gruau de maïs` picker collision. |
| `WP03-OCG-R113-20261014-S06` | https://www.bobsredmill.ca/produit/cereales-chaudes-de-gruau-de-mais-cremeux | Current Canadian French manufacturer page describes dry white corn ground coarse, identifies its product image as `White Corn Grits`, and lists a product-specific 1/4 cup (40 g) serving. It does not provide a generic measure or make a universal processing claim. |
| `WP03-OCG-R113-20261014-S09` | https://www.ricardocuisine.com/recettes/8419-grits-aux-crevettes | Québec recipe uses `semoule de maïs de type grits` and gives 1 cup (180 g); both the amount and coarse-cornmeal/polenta-style replacement suggestion are recipe-specific. |
| `WP03-OCG-R113-20261014-S10` | https://lamoisson.com/products/gruau-de-mais-blanc-cremeux-creamy-white-corn-grits | Québec retailer uses `gruau de maïs` for a white-corn grits product; it does not identify the product as hominy or establish an industry-wide process. |

## Verification and tests rule

The alias was added to the canonical ingredient-reference JSON and the generated Kotlin index was refreshed. Package normalization/validation, generated-index freshness, ledger schema and source-ID/URL ownership, static picker projections, the 114-recipe scan, UTF-8/no-BOM, local links, and scoped whitespace checks passed. No software tests, build, emulator, or deployment were run because the change adds database JSON data under `AGENTS.md`.
