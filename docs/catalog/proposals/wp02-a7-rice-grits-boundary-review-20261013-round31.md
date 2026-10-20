# WP02 A7 — Rice-grits product-boundary review

- **Reviewed:** 2026-10-13
- **Status:** Proposal only. This packet is the only new file; no reference, form, ledger, recipe, plan, roadmap, or generated file was changed.
- **Scope:** Resolve whether the unallocated English phrase `rice grits` can be assigned to the active broken-rice identity or needs a separate grain-meal identity. This does not reopen the distinct `rice meal` or brown-rice-farina reviews, the broken-rice identity, or the R29 amaranth-meal and R30 roasted-oat-malt decisions.
- **Proposal-local source IDs:** `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S01` through `S10`. These IDs are unique to this packet and are not ledger records.

## Disposition

**Keep the unqualified phrase `rice grits` unallocated. Add no active reference, alias, French name, form, measurement, or substitution.** Current sources use the English phrase for at least two different product boundaries:

1. Two Carolina Gold rice mills use `rice grits` for broken rice kernels or milling fragments.
2. An international ingredient supplier describes `rice grits` as a coarser-ground rice product made by grinding and sieving.

Statistics Canada lists `rice grits` as a human-consumption grain product, but its classification example does not define a process or settle whether the ground product and the broken-kernel product share one catalog identity. The evidence supports a named candidate and a specific reason to hold it. It does not support mapping every `rice grits` query to broken rice or creating a generic rice-meal row.

Keep the existing `ingredient-ref-broken-rice` identity unchanged as `broken rice / riz en brisures`. Keep `rice grits`, `rice middlins`, `middlins`, `rice screenings`, `brewers' rice`, `cracked rice`, `rice groats`, and `rice meal` off that row. Do not map `rice grits` to rice flour, the existing cream-of-rice hot cereal, brown-rice farina, or generic rice. Do not infer a French name such as `gruau de riz` or `semoule de riz` for the ground product.

## Archive and ownership audit

The active A7 checklist still calls for review of other grain meals and retains `rice grits` as part of the broader open scope. The 2026-10-10 A7 proposal already cited Statistics Canada's NAPCS examples, including rice grits and rice groats, but did not define `rice grits` as a product. The WP03 broken-rice integration explicitly kept rice grits inactive as a broad alias because the then-reviewed Québec terminology source was brewing-scoped. This packet rechecks that boundary with current miller and supplier product pages; it does not repeat R29's amaranth-meal decision or R30's Castle Oat 80 decision.

The live package snapshot contains **1,364 active references**, **100 forms**, **64 legacy candidates**, **1,691 ledger records**, and **114 manifest-listed recipes**. The active `ingredient-ref-broken-rice` row is `broken rice / riz en brisures`, category `GRAIN_AND_CEREAL`, with empty alias arrays, null default density, and no unit mappings. There is no exact active reference or alias for `rice grits`, `rice grit`, `rice middlins`, `rice middling(s)`, or `middlins`. No form label or match term owns these phrases, and no legacy candidate owns them. The ledger has no separate rice-grits candidate record; its `ingredient-ref-broken-rice` record carries the earlier decision to keep rice grits inactive as an alias.

Nearby active owners include `ingredient-ref-rice`, `ingredient-ref-rice-flour`, `ingredient-ref-cream-of-rice-hot-cereal`, `ingredient-ref-broken-rice`, `ingredient-ref-hominy-grits`, `ingredient-ref-sorghum-grits`, and `ingredient-ref-attieke` (which has the English alias `steamed cassava grits`). Those rows do not establish an owner for generic rice grits. The existing brown-rice-farina hold is a separate cut-rice hot-cereal review; `rice meal` remains a separate held phrase from Canadian cracker ingredient lists and feed terminology.

## Picker and search audit

The current picker uses normalized complete-word-phrase matching first, then substring matching, with accent folding; see [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). I projected queries from the live reference and form terms against that behavior.

| Query | Current result | If `rice grits` were aliased to broken rice | Disposition effect |
| --- | --- | --- | --- |
| `rice grits` | No result | `broken rice` | Keep no result while the two product boundaries remain unresolved. |
| `rice grit` | No result | `broken rice` by substring matching | Do not add a singular alias or rely on plural substring matching to conceal the boundary. |
| `broken rice` | `broken rice` | `broken rice` | Existing owner remains unchanged. |
| `riz en brisures` | `broken rice` | `broken rice` | Existing French display remains searchable. |
| `brisures de riz` | No result | No result | OQLF's entry is brewing-scoped; do not add it as a broad alias. |
| `grits` | `attiéké`, `hominy grits`, `sorghum grits` | Those three plus `broken rice` | A broad query would also gain a result whose product boundary is not settled. |
| `rice` | Broad set of rice-related rows, including `broken rice` | Same set | The existing broken-rice display already participates in this broad query. |

No picker-code change or search alias is proposed.

## Bundled recipe demand

The manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. I scanned ingredient `originalText`, `ingredientName`, `preparation`, and `notes`, plus the complete serialized recipe files, for `rice grits`, `rice grit`, `rice middlins`, `middlins`, `middlings`, `broken rice`, `brisures de riz`, `riz en brisures`, `rice groats`, `rice meal`, and `brown rice farina`. There were **zero matching rows and zero recipe-file hits**. The five broader rice ingredient rows are crispy rice cereal or cooked rice for serving; none requests broken rice or a grain grits product. No recipe link or relink is proposed.

## Measurement, form, and substitution limits

- The live broken-rice row has no form, default density, or unit mapping. No generic rice-grits measure, density, cooking yield, conversion, or substitution can be added from this evidence.
- Anson Mills' recipe for its exact Carolina Gold Rice Grits product gives `7 ounces (1 cup)` and a finished recipe yield of about `3¼ cups`. This is one branded/cultivar-specific recipe and cook process. It does not establish a mass-volume mapping or yield for the generic phrase or for all broken rice; do not transfer it to the catalog row.
- Safa Agro lists commercial bag sizes for its own ground product. Packaging sizes are not household measures or a density observation.
- Tidewater Grain recommends its white Carolina Gold rice middlins in place of stone-ground corn grits. That is a manufacturer statement about one named product, with no general ratio or method scope. Do not create a global substitution from it.
- Add no ingredient form, same-ingredient conversion, contextual substitution rule, recipe-line substitution, package yield, or measurement record.

## Sources and limits

Sources checked on 2026-10-13. Manufacturer pages support their own product wording and uses; classification and standards sources have the limits noted below.

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S01` | Statistics Canada, [NAPCS Canada 2022, class 1821294 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022), “Grain products for human consumption, n.e.c.” | Lists `rice grits` and `rice groats` among human-consumption grain-product examples. | An illustrative statistical classification; it gives no process, particle-size, consumer label, or equivalence definition. This same classification was cited in the earlier A7 review as S06. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S02` | Anson Mills, [Carolina Gold Rice Grits](https://ansonmills.com/products/105), product description. | Describes `shorts`, `brokens`, `grits`, and `middlins` as fragments resulting from threshing or milling of low-tensile-strength Carolina Gold rice. | One cultivar and mill's product; it does not define every product sold as rice grits. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S03` | Tidewater Grain Co., [Middlins/Grits](https://www.tidewatergrain.com/retail/p/rice-grits), product description. | Calls its middlins broken, imperfect pieces of Carolina Gold rice, also known as rice grits, produced during hulling and polishing. | One producer's product and crop; not a market-wide specification or Québec French label. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S04` | Safa Agro, [Rice Grits](https://safaagro.com/rice-grits-semolina/), “Rice Grits” description and “Application” section. | Defines rice grit as a coarser-ground product prepared by grinding and sieving; lists industrial, baking, cereal, and brewing uses. This supplies a materially different product process from the two Carolina Gold mills. | International B2B supplier page; it does not state a Canadian retail name, Québec French term, exact grain variety, or a particle-size specification. Its product characteristics are not transferred to broken rice. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S05` | Codex Alimentarius Commission, [Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf), sections 1 and 2.1.1. | Applies to husked, milled, and parboiled rice for direct human consumption and defines rice kernels as whole or broken. | Does not define rice grits or cover every ground rice product; it supports the broken-rice neighbor only. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S06` | Canada Border Services Agency, [2026 Customs Tariff, Chapter 10](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/00/ch10-eng.html), tariff item 1006.40.00. | Names the English item `Broken rice`, matching the existing active reference's identity. | A tariff classification, not a retail usage or rice-grits equivalence definition. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S07` | Canada Border Services Agency, [2026 Tarif des douanes, chapitre 10](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/00/ch10-fra.html), item 1006.40.00. | Pairs that tariff item with `Riz en brisures`, the current active French display. | Does not give a French equivalent for Safa Agro's ground product or for generic `rice grits`. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S08` | OQLF, [brisures de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8890710/brisures-de-riz), 1982 entry, “Domaine” and definition. | Records `brisures de riz` and associated `riz en brisures` for brewing, with English `broken rice`. | The entry is explicitly brewing-scoped; it does not establish `brisures de riz` as a general French food alias for the ground product. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S09` | Anson Mills, [Simple Buttered Carolina Gold Rice Grits](https://ansonmills.com/recipes/408), ingredient list and yield. | Gives `7 ounces (1 cup)` of the named Carolina Gold rice grits and a finished yield of about `3¼ cups`. | A source-specific recipe and cook process, not a generic density, unit mapping, or dry-to-cooked yield. |
| `WP02-A7-RICE-GRITS-BOUNDARY-20261013-R31-S10` | Tidewater Grain Co., [How to Use Middlins](https://www.tidewatergrain.com/howto/how-to-use-middlins), opening paragraph. | Recommends its white rice middlins as a replacement for stone-ground corn grits in recipes. | A producer's broad culinary recommendation for its own middlins; no generally scoped rule, ratio, or validated use across rice-grits products. |

## Next action

Keep `rice grits` as an unallocated A7 candidate and preserve the active broken-rice row as-is. Revisit only when a current Canadian or Québec-facing food product or standard defines whether the unqualified name covers broken kernels, a ground-and-sieved product, or both, and supplies a defensible French display for the ground product. If a recipe later names a specific branded product, research that exact product's measure and substitution separately.
