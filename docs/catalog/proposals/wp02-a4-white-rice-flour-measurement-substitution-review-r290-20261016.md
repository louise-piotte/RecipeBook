# WP02 A4 white rice flour measurement and substitution review — R290 — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Integrated into the white-rice-flour research record and checklist on 2026-10-16; see the [R290 integration README](../batches/wp02-a4-white-rice-flour-measurement-substitution-integration-r290-20261016/README.md).
- **Scope:** Research the unreviewed measurement and substitution fields for existing `ingredient-ref-white-rice-flour`. Do not reopen its accepted identity, alias the generic rice-flour family, or merge it with brown or glutinous rice flour.
- **Checklist anchor:** [WP02 Section A, rice source-grain grades](../../RecipeBook-global-ingredient-catalog-plan.txt#L1577). The open A4 parent still includes white/brown rice-flour grade distinctions; R115 covers the separate brown-rice-flour record.
- **New source-ID namespace:** `WP02-A4-WRF-R290-20261016-S01`–`S02`. Both IDs, the proposal path, and their exact URLs were checked against `docs/catalog` and were unowned. Reuse the already-owned Bob's Red Mill flour-weight-chart ID `WP02-B23-RESIDUAL-20261010-S05` for its separate white-rice row; do not allocate a duplicate ID or URL. Existing `WP02-S77`–`S79` remain attached to their original identity evidence and are reused below.

## Recommendation

**Keep `white rice flour / farine de riz blanc` unchanged, preserve the manufacturer's reported amounts as product-scoped observations, and add no reusable conversion or substitution rule.** If accepted into the ledger, set `measurementState` to `researched_no_supported_value` for an identity-wide mapping and record:

- One `manufacturer_label` `portion_weight` observation for Bob's Red Mill White Rice Flour: **1/4 cup = 40 g** [S01]. The page gives no package fill method or cup standard.
- One `published_portion` `portion_weight` observation from the same maker's chart: its `White Rice Flour` row reports **1 cup = 160 g** [reused `WP02-B23-RESIDUAL-20261010-S05`]. The chart gives general spoon-and-level advice, but does not state the fill method used for this particular row. Retain that limit with the observation.

These values belong to Bob's Red Mill's named flour and measurement presentation. Keep `defaultDensity: null` and `unitMappings: []`; do not use the two values as proof of a general density or an identity-wide cup mapping. The chart's separate `Sweet White Rice Flour` entry does not make sweet/glutinous rice flour an alias for white rice flour.

Set `substitutionResearchState` to `researched_no_supported_substitute` for a reusable catalog rule. A peer-reviewed study tested **5–30%** white-rice-flour replacement in bread and biscuits. In its formulas, bread volume fell to about half at 30%, and bread crumb above 20% was less acceptable; biscuit effects were smaller and varied by level [S02]. Those experimental formulations do not establish a reliable exchange amount across home recipes. Bob's product page lists baking and thickening uses but gives no wheat-flour replacement ratio [S01]. Add no active wheat-to-rice contextual rule, preferred alternative, line-level link, or hydration correction.

Add no ingredient form or same-ingredient form conversion. Keep aliases empty and `category: FLOUR_AND_STARCH`. Do not change the separate generic rice-flour, brown-rice-flour, glutinous-rice-flour, rice-starch, or white-rice-grain rows.

## Current ownership and prior work

The live `ingredient-ref-white-rice-flour` row is `white rice flour / farine de riz blanc`, with no aliases, null default density, empty unit mappings, and `category: FLOUR_AND_STARCH`. Its ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it cites `WP02-S77`–`S79` for the accepted source-grain identity, not for numeric or replacement behavior.

R115's brown-rice-flour review and integration cover `ingredient-ref-brown-rice-flour`; they do not supply measurements or substitution rules for the white-rice row. Existing WP02 proposals mention the white-rice identity while reviewing other boundaries, but no dedicated measurement/substitution review for this row was found. R281 (whole barley), R284 (generic chickpea flour), and R287 (generic oat flour) concern separate records and gaps. No form is attached to white rice flour, and neither active global nor contextual substitution rules name the row.

## Naming and picker projection

Retain `white rice flour / farine de riz blanc` with no aliases. Existing source ownership supports the bilingual distinction: USA Rice describes white rice flour as milled without the bran layer, while current Ontario producer QUeen Milling lists `Gluten Free Superfine White Rice Flour / Farine de riz blanc extra-fine sans gluten` separately from its whole-grain brown-rice flour [reused `WP02-S77`–`S79`]. `Superfine`, `extra-fine`, and `gluten free` describe that producer's product; do not make them generic aliases. Keep white rice flour distinct from rice flour as a family term, brown rice flour, sweet/glutinous rice flour, rice starch, and white rice grain.

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) projection was applied to the live references and forms:

| Query | Current result | R290 effect |
|---|---|---|
| `white rice flour` or `farine de riz blanc` | `ingredient-ref-white-rice-flour` only | Keep the current unique specific result. |
| `rice flour` or `farine de riz` | 12 flour identities, including generic, white, brown, red, wild, black, and glutinous/market-specific products | Keep the family query broad; do not add a family alias to the white row. |
| `white rice` or `riz blanc` | White rice grain and white rice flour | Keep the grain and flour separate. |
| `sweet white rice flour` | No result | Do not add it to the ordinary white-rice-flour row; the chart treats sweet white rice flour as a distinct product entry. |

## Bundled recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Ingredient text and reference-ID scans for `white rice flour`, `farine de riz blanc`, and `ingredient-ref-white-rice-flour` found **zero matching rows** and **zero direct links**. The bundled corpus provides no recipe-specific measure, form, or dish context for substitution.

## Measurement, forms, and substitution boundaries

- Bob's Red Mill's current manufacturer product page names `White Rice Flour`, lists `White Rice` as its ingredient, describes its own product as stone-ground, and prints **1/4 cup (40 g)** in the Nutrition Facts [S01]. This is a label serving for that maker's product, not a generic rice-flour measurement.
- Bob's manufacturer chart lists **White Rice Flour: 40 g per 1/4 cup and 160 g per cup** [reused `WP02-B23-RESIDUAL-20261010-S05`]. The chart says flour weights vary with flour type and particle size, recommends weighing for best results, and gives general spoon-and-level instructions; it does not state the fill method used for the white-rice row. Preserve the chart's direct 1-cup value as a separate product-specific observation, without deriving density or activating a mapping.
- Existing source-grain evidence places brown rice flour in a separate identity and distinguishes it from white rice flour [reused `WP02-S77`–`S79`]. Neither the brown-rice CNF entries nor brown-rice product measures are applicable to the white-rice row.
- The study by Švec and Hrušková explicitly tested white rice flour at 5%, 10%, 15%, 20%, 25%, and 30% in wheat-flour bread and biscuit formulas [S02]. It reports water absorption falling by up to about 10% in the tested flour composites; at 30%, bread volume fell from 319 to 154 ml/100 g, and samples above 20% were less acceptable for crumb chewiness. Biscuit changes were smaller, with responses varying by level. These values describe the study's flours and methods, not a general ratio or household water adjustment.
- The manufacturer page names possible product uses—breads, noodles, cakes, cookies, thickening, and coating—but does not say how much wheat flour to replace [S01]. The research and manufacturer wording do not support one cross-recipe substitute. Any later contextual rule would need a defined recipe type, ingredient role, and method under [Requirements FR-5 and §6.5](../../../Requirements.md); the bundled corpus currently gives no white-rice-flour example.

No forms or active rules are present, and there is no recipe context to justify a global form conversion or contextual wheat replacement. Record no active rule, replacement amount, confidence, risk level, or hydration correction.

## Source register

New sources were accessed on **2026-10-16**. New IDs are local to this proposal; if integrated, record only the bounded observations/findings on the existing white-rice-flour ledger row.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A4-WRF-R290-20261016-S01` | Bob's Red Mill, [White Rice Flour](https://www.bobsredmill.com/product/white-rice-flour), product description, Nutrition Facts, and ingredient statement. | Current manufacturer page for its White Rice Flour product. Reports `1/4 cup (40 g)`, names White Rice as the ingredient, and lists uses. It does not state cup fill method, a general replacement ratio, or availability in Québec. |
| `WP02-A4-WRF-R290-20261016-S02` | Švec and Hrušková, [“Characteristics of Bread and Biscuit Made With Wheat and Rice Flour Composites”](https://archive.conscientiabeam.com/index.php/58/article/view/348), *Journal of Food Technology Research*, published 2014-12-15, abstract and formula results; DOI [10.18488/journal.58/2014.1.2/58.2.156.163](https://doi.org/10.18488/journal.58/2014.1.2/58.2.156.163). | Tests 5–30% white-rice-flour replacement in bread and biscuits. Reports formula-specific dough, loaf-volume, chewiness, and biscuit outcomes; does not establish a general exchange amount or hydration correction. |
| Reused `WP02-B23-RESIDUAL-20261010-S05` | Bob's Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart), separate `White Rice Flour` row and general measurement guidance. | The URL already has an owner and source ID in the ledger for its Arrowroot Starch rows. Reuse that ID for the chart's separate white-rice-flour rows; its `1/4 cup = 40 g` and `1 cup = 160 g` values remain manufacturer-chart observations. The chart does not state a row-specific fill method. |
| Reused `WP02-S77`–`S79` | USA Rice, [Rice Flour 101](https://www.usarice.com/thinkrice/detail-pages/blog/rice-flour-101-everything-you-need-to-know); QUeen Milling, [current English product collection](https://www.queenmilling.ca/collections/all) and [French storefront](https://www.queenmilling.ca/fr). | Existing source ownership on the white-rice identity; reused only for the white/brown source-grain and bilingual product-name boundary. These sources do not establish the new measurements or substitution behavior. |

## Verification record

Re-read current `AGENTS.md`, the Requirements conversion/substitution sections, the roadmap, WP02 plan, live reference catalog, and target ledger row. Confirmed the white-rice-flour measurement and substitution states remain open, and checked the R115 brown-rice review and R281–R289 recent archive for overlap. Rechecked current form and both substitution-rule packages; source-ID and exact-URL ownership; live picker projection; and manifest-listed recipe demand. Opened the current Bob's Red Mill product page and chart, QUeen Milling English/French pages, USA Rice source, and the publisher-hosted primary study online. No software tests, build, or emulator checks were run; this is a proposal-only static research review.
