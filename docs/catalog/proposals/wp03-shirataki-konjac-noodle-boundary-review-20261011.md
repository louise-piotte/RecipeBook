# WP03 Section G shirataki / konjac noodle boundary review

- **Reviewed:** 2026-10-11
- **Recommendation:** add one identity-only `shirataki noodles / nouilles shirataki` candidate, with narrow konjac-name aliases. Keep tofu shirataki as a separate product boundary, do not merge dry and refrigerated states into recipe conversion data, and keep generic glass/cellophane noodles separate.
- **Scope:** assess whether the open Section G shirataki/konjac noodle item has a source-backed product name in English and fr-CA, and establish boundaries against the konjac plant/flour, glucomannan, tofu shirataki, konnyaku blocks, generic glass noodles, and product-state variants. No shared catalog, ledger, seed, recipe, plan, roadmap, test, or code files are changed.

## Catalog and recipe audit

Live snapshot checked on 2026-10-11:

| Artifact | Snapshot |
| --- | ---: |
| Active ingredient references | 964 |
| Ingredient forms | 53 |
| Research-ledger records | 1,235 |
| Legacy import candidates | 75 |
| Manifest-listed bundled recipes | 114 |
| Bundled recipe ingredient rows | 1,123 |

The normalized exact-key check found no active reference or form for `shirataki noodles`, `konjac noodles`, `konjac`, `konnyaku`, `glucomannan`, `tofu shirataki`, `nouilles shirataki`, or `nouilles de konjac`. The ledger and legacy-candidate file have no matching record. The recipe audit found no candidate-term matches in any ingredient row or full recipe JSON.

Relevant active boundaries:

- `ingredient-ref-sweet-potato-starch-noodles` is a distinct source-qualified noodle identity (`sweet potato starch noodles / nouilles à base de fécule de patate douce`), with `sweet potato glass noodles` and `vermicelles de patate douce` aliases. It does not overlap konjac noodles. The broader Section G review still holds unqualified `glass noodles`, `cellophane noodles`, and `nouilles de verre` because starch sources vary.
- `ingredient-ref-bean-thread-cellophane-noodles` remains the mung-bean-flour thread noodle (`LEGUME_AND_PULSE`). Do not attach shirataki or konjac aliases to it.
- `ingredient-ref-yam` (`true yam / igname`) and `ingredient-ref-yam-flour` (`yam flour / farine d’igname`) remain separate active identities. One House Foods tofu-shirataki listing uses the package ingredient wording `yam flour`, while House Foods describes its source as konnyaku/konjac flour. Do not convert that product-specific label into a general alias for the active true-yam flour.

Earlier Section G packets defer shirataki/konjac as an open noodle identity and do not resolve it. The current audit therefore supports a new candidate without re-opening integrated rice vermicelli, mung-bean threads, sweet-potato-starch noodles, or other existing noodle rows.

## Terminology and product boundary

OQLF’s GDT entry accepts French `konjac` and says the plant’s tuberous rhizome is used to produce flour and to make pasta, noodles, or rice [S01]. It does not list a dedicated entry for the finished product `shirataki`; the Canadian French product wording comes from current manufacturer and retailer usage. Japan’s Ministry of Agriculture, Forestry and Fisheries describes konnyaku as a processed konjac food and lists block-shaped *ita-konnyaku*, noodle-like *shirataki*, and *ito-konnyaku* strings as distinct forms [S02]. This supports keeping bare `konnyaku` for the broader konjac-gel product family, not using it as a noodle alias.

House Foods Canada’s French-language pages use `Nouilles Shirataki` as the product family, then distinguish `Shirataki Traditionnel` from `Tofu Shirataki`; the first is described as made from konjac and without soy, while the second is described as based on tofu and konnyaku flour [S03–S04]. That product distinction is echoed by Canadian retail pages: House Foods Tofu Shirataki fettuccine ingredient listings include soybeans and konjac/“yam” flour and identify the product as perishable/refrigerated [S07–S08]. Because tofu is a defining ingredient in the tofu variant, `tofu shirataki` should not be an alias for the plain shirataki identity.

Current Canadian French product listings support `nouilles shirataki`: Metro’s Québec grocery listing is titled `Nouilles shirataki séchées sans gluten Liviva`, while Loblaws’ French results list both dried shirataki pasta and konjac angel hair [S05–S06]. The listings show product naming and formulations, not a standardized noodle specification. Liviva’s Canadian retailer listing says its product is dried and reports the manufacturer-label ingredients as water, konjac flour, tapioca flour, and oat fibre [S06–S07]. This is a konjac-containing, multi-ingredient dried product; it does not support a pure-konjac formula claim. Other House Foods listings identify refrigerated tofu shirataki, so state and composition need to remain explicit whenever a recipe names them.

Proposed identity:

| Field | Proposal |
| --- | --- |
| Candidate ID | `ingredient-ref-shirataki-noodles` |
| English display | `shirataki noodles` |
| fr-CA display | `nouilles shirataki` |
| English alias | `konjac noodles` |
| French alias | `nouilles de konjac` |
| Identity boundary | Finished noodle products sold as shirataki/konjac noodles and identified with konjac/konnyaku material. Product formulations may include other ingredients; the display does not claim a universal recipe. |

`Shirataki` is the strongest display because it appears as the named noodle product on the Canadian manufacturer’s French page and in Québec grocery listings. `Nouilles de konjac` is a narrow source-qualified search alias supported by Québec French retailer usage and OQLF’s acceptable French term `konjac`. Keep the complete product phrase; do not activate bare `shirataki`, `konjac`, or `konnyaku` as aliases because they also name a plant or broader processed food.

## Composition, state, and search boundaries

- **Plain versus tofu shirataki:** keep `tofu shirataki` out of the proposed aliases and outside this row’s identity boundary. Canadian labels identify tofu/soybeans as part of that product, and House Foods markets it as a separate variety. If added later, review it as a distinct composite noodle identity with its own ingredient and state evidence.
- **Dried versus refrigerated/water-packed:** current Canadian listings show a dried Liviva shirataki product and refrigerated House Foods tofu shirataki. Do not collapse these states in recipe data. No dry, wet, or cooked form is proposed here because the bundled recipes have no direct demand and these sources do not establish a general state-conversion rule for the whole product family.
- **Konjac versus glucomannan:** keep konjac root, konjac flour/gum, and glucomannan separate from the finished noodles. `Glucomannan` names a constituent/material, not the noodle product or a safe search alias for it. The product evidence does not justify density, quantity conversions, yield, or recipe links.
- **Konnyaku versus shirataki:** *konnyaku* covers multiple konjac foods, including blocks; *shirataki* names the noodle form in the Japanese government source. Do not alias `konnyaku` or `ito-konnyaku` without separate product evidence and a deliberate shape boundary.
- **Glass/cellophane noodles:** keep `glass noodles`, `cellophane noodles`, `nouilles de verre`, and `nouilles transparentes` off this row. Appearance does not establish konjac composition, and Section G already keeps generic starch glass noodles unresolved by source. Do not conflate shirataki with mung-bean threads or sweet-potato-starch glass noodles.
- **Yam flour label:** House Foods’ particular tofu-shirataki ingredient list uses `yam flour`, while the manufacturer describes that product using konnyaku/konjac flour. This is not evidence that `yam flour / farine d’igname` is a shirataki alias or that all yam flour is konjac.

No substitution rule is proposed. No nutritional, density, yield, cooking-time, or package-size claim is transferred to the catalog.

## Sources

All sources were checked on **2026-10-11**. Product assortments, stock, and retailer-generated descriptions can change; product labels are evidence for their own product only.

- **WP03-SHKN-20261011-S01 — Office québécois de la langue française**, [konjac (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559799/konjac), last updated 2022. OQLF marks `konjac` as an acceptable French borrowing and notes use of the tuberous rhizome to make flour, noodles, and related products. Directly accessible; it does not define the full compound `nouilles shirataki`.
- **WP03-SHKN-20261011-S02 — Japan Ministry of Agriculture, Forestry and Fisheries**, [Other processed agricultural products: Konnyaku](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/nousan-kakou.html). Directly accessible. Distinguishes block-shaped konnyaku products from noodle-like shirataki and strings called ito-konnyaku. It explains traditional product taxonomy, not Canadian retail formulations.
- **WP03-SHKN-20261011-S03 — House Foods Canada**, [site en français](https://www.house-foods.com/ca-fr). Manufacturer’s indexed French page uses `Nouilles Shirataki` and distinguishes `Shirataki Traditionnel` from `Tofu Shirataki`. Direct page access returned an internal/cache error; the wording is recorded from the indexed page content. Manufacturer terminology, not an independent French-language ruling.
- **WP03-SHKN-20261011-S04 — House Foods Canada**, [Shirataki Traditionnel](https://www.house-foods.com/ca-fr/produit/traditional-shirataki/shirataki-traditionnel) and [Tofu Shirataki Fettucine](https://www.house-foods.com/ca-fr/produit/tofu-shirataki/tofu-shirataki-fettucine-fr). Indexed French pages identify the product names and family distinction; direct open was unavailable/cache-blocked, and ingredient panels were not exposed in the indexed result.
- **WP03-SHKN-20261011-S05 — Metro Canada**, [Nouilles shirataki séchées sans gluten Liviva](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/nouilles-et-vermicelle/nouilles-shirataki-sechees-sans-gluten/p/628110422408). French Québec product listing; search-indexed title and ingredient excerpt identify konjac flour with tapioca flour and oat fibre. Direct page access returned HTTP 403, so the listing is used as indexed retail evidence only.
- **WP03-SHKN-20261011-S06 — Loblaws**, [French shirataki search results](https://www.loblaws.ca/fr/search?search-bar=shirataki). Directly accessible. The page lists House Foods traditional shirataki, dried Liviva shirataki, and konjac angel hair, with add-to-cart controls; inventory can depend on selected store. Listing names only, not a product ingredient declaration.
- **WP03-SHKN-20261011-S07 — Greenbrook Natural Foods**, [Liviva Dried Shirataki Noodles](https://greenrx.ca/liviva-dried-shirataki-noodles-120g.html). Canadian retailer page, directly accessible. Calls the format dried and transcribes the manufacturer label as water, konjac flour, tapioca flour, and oat fibre. Retailer page is not an independent lab analysis; product claims beyond the ingredient statement were not used.
- **WP03-SHKN-20261011-S08 — Ambrosia Canada**, [Gluten Free Fettuccine Tofu Shirataki](https://canada.ambrosia.ca/products/gluten-free-fettuccine-tofu-shirataki). Directly accessible Canadian retail listing; it gives water, soybeans, yam flour, and coagulant ingredients and calls the product perishable/refrigerated. The retailer says ingredient and nutrition data may not be exact and offers this product for in-store purchase; used only to identify the tofu-composition and state distinction.
- **WP03-SHKN-20261011-S09 — Walmart Canada**, [House Foods Shirataki Fettuccine](https://www.walmart.ca/fr/ip/Nouilles-en-forme-de-Fettuccinis/6000197635544), French page. Directly accessible; the page identifies the product in details as Tofu Shirataki, lists soy and yam flour, and labels it refrigerated. It showed out of stock at access and includes retailer/translated descriptions, so it corroborates product naming/state but does not replace the manufacturer or label evidence.
- **WP03-SHKN-20261011-S10 — Japan Ministry of Agriculture, Forestry and Fisheries**, [Sukiyaki regional cuisine page](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/5831/index.html). The recipe source explicitly glosses shirataki as `konjac noodle`; accessed 2026-10-11. Supports English source-qualified wording, not a Canadian product label.

## Disposition

Add one identity-only `shirataki noodles / nouilles shirataki` candidate with only `konjac noodles / nouilles de konjac` as aliases. This is a distinct, source-backed noodle family in current Canadian and Québec listings and in OQLF/Japanese government terminology. Keep the tofu-shirataki variant, konnyaku blocks, active true-yam flour, mung-bean threads, sweet-potato-starch noodles, and generic glass/cellophane noodles separate. The bundled corpus has no direct ingredient demand, so leave forms, numeric data, conversions, yields, recipe links, and substitutions empty.
