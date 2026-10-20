# WP02 A4 follow-up proposal: mochiko and shiratamako product boundary

- **Status:** proposal-only; no catalog or ledger changes
- **Research date:** 2026-10-11
- **Scope:** Revisit the held Japanese glutinous-rice flour terms using current Japanese authority and manufacturer sources, Canadian/Québec retail naming, and recipe evidence. This updates the evidence review, not the shared catalog decision.
- **Existing catalog anchor:** `ingredient-ref-glutinous-rice-flour` — `glutinous rice flour / farine de riz gluant`; EN aliases `sweet rice flour`, `sweet rice powder`; no French aliases, forms, density, or unit mappings.

## Recommendation

Treat **Mochiko** and **Shiratamako** as two distinct named product identities within the broader glutinous-rice-flour family. Do not alias either product name to the generic glutinous-rice-flour row or to each other. If integrated, keep the generic row and its existing aliases unchanged; use exact product names and add no broad family aliases.

Candidate bilingual displays for independent Québec review:

| Product | EN display candidate | fr-CA display candidate | Alias boundary |
| --- | --- | --- | --- |
| Mochiko | `Mochiko glutinous rice flour` | `farine de riz gluant Mochiko` | The manufacturer uses both `Mochiko` and the spaced/hyphenated spellings `Mochi ko` / `Mochi-ko`; those spellings may be narrow EN aliases on this product. Do not move `sweet rice flour`, `sweet rice powder`, or generic `glutinous rice flour` off the existing generic row. |
| Shiratamako | `Shiratamako glutinous rice flour` | `farine de riz gluant Shiratamako` | Keep `Shiratamako` on this product only. Do not add `glutinous rice flour`, `sweet rice flour`, `sweet rice powder`, `Mochiko`, or unsupported spelling variants as aliases. |

The French candidates combine a Québec recipe’s wording `shiratamako (farine de riz gluant)` and `farine de type shiratamako` with current French-language Canadian retail titles `Farine de riz gluant Gishi Mochiko` and `Farine Tamasan Shiratamako`. They are descriptive catalog candidates, not OQLF-approved terms or verified French package-panel text. Keep them provisional until the independent bilingual reviewer approves them.

This recommendation concerns **separate product identities**, not a claim that every package has one invariant manufacturing process. Japanese government sources recognize `mochiko` and `shiratamako` as separate glutinous-rice flour classes but explicitly report variation in regional definitions and milling methods. The distinction is still useful for catalog identity: Canadian sellers carry both as separate products, Québec recipe guidance reports a texture difference, and the terms should not collapse to a generic flour alias. Do not encode `dry-milled` as a universal Mochiko form or process rule. If the coordinator prefers representing named grades as forms, that should be a deliberate model decision after Québec review; the current evidence does not support a single shared process-value pair for the names.

## Product and process evidence

| Product | Source-backed composition/process | Boundary and limit |
| --- | --- | --- |
| Mochiko | Koda Farms describes its Blue Star Mochiko as short-grain sweet-rice flour, cold-roll milled, 105 mesh, and without additives. Maehara Seifun’s product page describes polishing glutinous rice, soaking, grinding, and drying; its FAQ instead describes washed rice dried and pounded without water. Ueki describes one `mochiko` process as washed/dewatered rice pounded, dried, and sifted; its `kin-in mochiko` blends pounding- and roll-milled flour for a coarser result. | This is a named, sold flour product, but the named class does not support one cross-manufacturer milling specification. Do not infer a universal dry process, particle size, or purity rule. Product composition can vary: Maehara says some manufacturers may add non-glutinous rice or starch; the examined Koda and Gishi retail listings declare rice-only ingredients. |
| Shiratamako | MAFF’s classification describes glutinous-rice Shiratamako as rice soaked and ground with water, then settled, pressed, and dried. Shiratamaya, Hinode Seifun, and Ueki separately document wet/water milling and subsequent dewatering/drying for their Shiratamako products. The Canadian Tamasan listing says its flour is made from 100% Japanese glutinous rice; Ozawa Canada lists Gishi Shiratamako as glutinous rice flour. | The wet-milling distinction is more consistent across the reviewed sources than Mochiko’s process. MAFF still cautions that regional rice flours lack uniform standards. Manufacturer examples establish the named product family, not a guaranteed particle size or universal texture specification. |

The terms are neither ordinary rice flour (`joshinko`) nor the glutinous-rice grain. Both are already milled glutinous-rice products. The source supports keeping both within `FLOUR_AND_STARCH` if separate references are accepted, while keeping ordinary rice flour and rice grain separate.

## Québec and Canadian terminology

- Current French-language Ottawa retailer Hungry Ninja lists **`Farine de riz gluant Gishi Mochiko (250 g)`** and gives the ingredient as `Riz gluant`. Its separate Gishi page describes the retail product’s rice as polished, soaked, ground, and dried; treat that process claim as retailer-translated product copy, not a universal Mochiko definition.
- The same retailer lists **`Farine Tamasan Shiratamako (200 g)`**, describes it as made from 100% Japanese glutinous rice, and gives `Riz gluant (Japon)` as its ingredient.
- Its French Koda Farms product listing uses **`Koda Farms Farine de riz gluant Mochiko`** and says the listed ingredient is short-grain sweet-rice flour.
- Télé-Québec’s recipe uses **`shiratamako (farine de riz gluant)`** and refers to **`farine de type shiratamako`**. Its note says Mochiko can replace Shiratamako in this mochi recipe and describes Mochiko as the powder form with a slightly different texture.
- Canadian English retailers distinguish products directly: Gusta lists `KODA FARMS Mochiko Sweet Rice Flour` separately from `TAMASAN "Shiratamako" – Japanese Glutinous Rice Flour for Mochi`; Ozawa Canada lists `Gishi Shiratamako (Rice Flour)` and classifies it as glutinous rice flour.

These listings establish that the Japanese names are used to distinguish products in Canadian retail and provide workable French descriptors. They do not establish bilingual manufacturer packaging or a Québec terminology ruling. Keep the proposed French displays provisional; retain the native product names as the exact distinguishing terms.

## Recipe demand and transferable numeric evidence

- The live bundled library has 114 recipe files. Searches of the bundled recipes and the archived 114-recipe export found no matches for `mochiko`, `mochi-ko`, `shiratamako`, `glutinous rice flour`, `farine de riz gluant`, `sweet rice flour`, or `sweet rice powder`. There is no bundled recipe line to relink.
- Québec does have a relevant external use case: Télé-Québec’s *Mochis à la crème glacée* recipe calls for `120 g (¾ tasse)` Shiratamako. Its note allows Mochiko in this same recipe and reports a texture difference. This is contextual recipe guidance, not evidence for a general substitution rule or a documented equal-mass/equal-volume conversion.
- The recipe’s single `120 g / ¾ cup` pair is tied to its unspecified Shiratamako product and preparation. It does not establish bulk density, packing convention, or a value transferable to Mochiko or generic glutinous rice flour. Do not populate a `defaultDensity`, `densityGPerMl`, unit mapping, or conversion from it.
- No reviewed source gives a reusable measurement conversion, product-specific density, cooking yield, or general substitution ratio. Do not transfer values from generic rice flour or glutinous rice flour. Preserve the one recipe-specific substitution observation only as bounded evidence for ice-cream mochi; do not activate a global substitution.

## Current catalog and ledger audit

- The live reference remains `ingredient-ref-glutinous-rice-flour`, with only `sweet rice flour` and `sweet rice powder` as EN aliases; its `defaultDensity` is null and `unitMappings` is empty.
- No current ingredient form points to that reference. No Mochiko or Shiratamako reference/candidate record exists; the live ledger has the existing Mochiko/Shiratamako source and hold decisions attached to the generic glutinous-rice-flour record.
- The generic product stays separate from ordinary rice flour and glutinous-rice grain. Do not add the Japanese product names as aliases to any of these records.

## Evidence limits and remaining review

The distinction is strong enough to recommend separate named product identities, but the sources do not establish a regulated cross-manufacturer specification. Mochiko’s process is especially variable in the reviewed manufacturer accounts; a process annotation must be package/source-specific. The Canadian French pages are retailer translations rather than verified package text, and no OQLF entry for either Japanese product name was located in this review. Independent bilingual Québec review should approve the displays and confirm the chosen identity-versus-form representation before integration. No numeric data or global substitution remains supported.

## Proposal-local source register

Sources were accessed on **2026-10-11**. Japanese descriptions below are paraphrased.

- **WP02-MSHR-20261011-S01 — Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), rice-flour classes and methods.** [Rice-flour types and characteristics](https://www.maff.go.jp/j/syouan/keikaku/soukatu/okome_summary/08/rice_flour_charac_teristic_01.html). Separates glutinous-rice Mochiko, Shiratamako, and other flours; lists dry, semi-wet, and wet milling for Mochiko, and water grinding, settling, pressing, and drying for Shiratamako. Also says finer `gyuhi` flour may be made from Mochiko. Supports separate named product classes and a typical Shiratamako process, not universal standards.
- **WP02-MSHR-20261011-S02 — MAFF, regional processing variation.** [Rice-flour milling characteristics](https://www.maff.go.jp/j/syouan/keikaku/soukatu/okome_summary/09/rice_flour_pro_cessing_03.html). States that regional `joshinko`, `shiratamako`, and `mochiko` lack flour-like uniform standards/definitions and that tastes, textures, and milling methods vary by region. Limits any universal process claim.
- **WP02-MSHR-20261011-S03 — Ueki Food Industry, manufacturing flow.** [Manufacturer process page](https://uekifood.com/flow). Its shared `joshinko / mochiko` process washes and dewaters rice, pounds it in a milling machine, dries, and sifts it; its separate Shiratamako process soaks rice, rubs it with water into a milky liquid, sieves, dewaters, forms, cuts, and dries it. Supports within-manufacturer distinction, not a Japan-wide standard.
- **WP02-MSHR-20261011-S04 — Ueki Food Industry, flour product lines.** [Manufacturer product page](https://uekifood.com/riceflour). Describes multiple glutinous-rice flours including Mochiko/gyuhi powders and separately lists several Shiratamako products made by water milling; also describes the coarser blended-milling Mochiko grade. Demonstrates product/grade variation.
- **WP02-MSHR-20261011-S05 — Shiratamaya Shinshaburo, Shiratamako process.** [Manufacturer process page](https://www.shiratamaya.co.jp/%E7%99%BD%E7%8E%89%E7%B2%89%E3%81%AB%E3%81%A4%E3%81%84%E3%81%A6/). Describes domestic glutinous rice, overnight soaking, water-added stone milling, sediment separation, and press dewatering before drying.
- **WP02-MSHR-20261011-S06 — Hinode Seifun, Shiratamako process.** [Manufacturer production page](https://www.hinodeseifun.com/shiratamako/). Shows washing, soaking, stone water-milling, dewatering, cutting, and drying. Independent manufacturer corroboration of the Shiratamako method.
- **WP02-MSHR-20261011-S07 — Maehara Seifun / Gishi, Mochiko product page.** [Manufacturer product category](https://www.gishi.co.jp/home/item.asp?ct=19). Calls `もち粉` / Mochi ko glutinous-rice flour, describes polishing, soaking, grinding, drying, and says other makers may add non-glutinous rice or starch. It lists several Mochiko products.
- **WP02-MSHR-20261011-S08 — Maehara Seifun / Gishi, Mochiko/Shiratamako comparison.** [Manufacturer FAQ](https://www.gishi.co.jp/home/faq_view.asp?id=77). Contrasts powder-like Mochiko with granular Shiratamako and says Shiratamako is water-milled while Mochiko is pounded dry. This conflicts with S07’s soaked/wet process account; retain as evidence of inconsistent process descriptions, not an invariant.
- **WP02-MSHR-20261011-S09 — Koda Farms, Blue Star Mochiko.** [Manufacturer product page](https://www.kodafarms.com/our-branded-products/). Describes a 105-mesh, cold-rolled flour milled from California short-grain sweet rice, with no additives; the page presents Mochiko as a branded product. Product details are specific to Koda’s flour.
- **WP02-MSHR-20261011-S10 — Gusta Supplies, Canadian Japanese-flour collection.** [Retail collection](https://supplies.gusta.ca/collections/japanese-starch). Separately lists Koda Farms Mochiko, Tamasan Shiratamako, and Mitake Joshinko, identifying Mochiko as sweet-rice flour and Shiratamako as Japanese glutinous-rice flour for mochi. Supports Canadian market separation and English retail terminology only.
- **WP02-MSHR-20261011-S11 — Ozawa Canada, Gishi Shiratamako.** [Canadian importer listing](https://ozawa.ca/product/gishi-shiratamako-1kg/). Names Gishi Shiratamako, places it in Flour, and describes it as glutinous rice flour. Does not provide French wording or manufacturing specifications.
- **WP02-MSHR-20261011-S12 — Hungry Ninja, Gishi Mochiko, French listing.** [Canadian retailer page](https://hungry-ninja.ca/fr/products/gishi-mochiko-glutinous-rice-flour-250g). Uses `Farine de riz gluant Gishi Mochiko`; its ingredient line says `Riz gluant`. The process text is retailer product copy and should not generalize beyond the listed item.
- **WP02-MSHR-20261011-S13 — Hungry Ninja, Koda Farms Mochiko, French listing.** [Canadian retailer page](https://hungry-ninja.ca/fr/products/koda-farms-mochiko-sweet-rice-flour-454g). Uses `Koda Farms Farine de riz gluant Mochiko` and lists short-grain sweet-rice flour as the ingredient. This is a retailer translation of the Koda product.
- **WP02-MSHR-20261011-S14 — Hungry Ninja, Tamasan Shiratamako, French listing.** [Canadian retailer page](https://hungry-ninja.ca/fr/products/tamasan-shiratamako-flour-200g). Uses `Farine Tamasan Shiratamako`, describes 100% Japanese glutinous rice, and lists `Riz gluant (Japon)` as its ingredient. This supports French-language Canadian retail wording, not manufacturer package text.
- **WP02-MSHR-20261011-S15 — Hungry Ninja, Canadian location.** [Ottawa store contact page](https://hungry-ninja.ca/pages/location). Identifies the retailer’s store at 1529 Merivale Road, Ottawa, Ontario, Canada.
- **WP02-MSHR-20261011-S16 — Télé-Québec, Mochis à la crème glacée.** [Québec recipe](https://cuisinez.telequebec.tv/recettes/6076/mochis-a-la-creme-glacee). Calls for `120 g (¾ tasse) de shiratamako (farine de riz gluant)` and says Mochiko can replace the Shiratamako in this recipe, with a slightly different texture. This is the sole recipe-specific measurement/substitution evidence found here; it does not define density or a universal ratio.

## Coordinator disposition

Pending coordinator and bilingual review. Proposed decision: create two distinct product references under `FLOUR_AND_STARCH`, retain the generic reference and its aliases unchanged, add no form/conversion/substitution data, and keep process notes source-specific. If the reviewer declines distinct references, preserve both terms as unresolved rather than aliasing them to the generic product.
