# WP04 tofu product boundaries integration

- Date: 2026-10-12
- Status: identity-only data integration. The global catalog plan remains open.
- Review packet: [tofu product boundary review](../../proposals/wp04-section-r-tofu-product-boundaries-review-20261012.md).

## Integrated decisions

- Added generic tofu / tofu, with the OQLF-supported English alias bean curd.
- Added pressed tofu / tofu pressé, with OQLF-supported English aliases block tofu and regular tofu.
- Added silken tofu / tofu soyeux as a separate product type.
- Added smoked tofu / tofu fumé from matching Canadian manufacturer product names.
- Added tofu skin / peau de tofu, with yuba as an English alias. The Québec display pair is supported by a Montréal retailer; the Japanese agriculture ministry and a Canadian importer support the product boundary.
- Kept soft, firm, and extra-firm wording as product qualifiers, not separate identities or cross-type aliases.
- Kept fried tofu / tofu frit as an unresolved candidate. Canadian Nutrient File wording supports a bilingual food class, while Japanese product-process sources distinguish several fried products; the term can also describe a cooking step.
- Preserved the existing white and red fermented bean curd identities. Generic fermented-curd wording remains unresolved.

No matches appeared in the 114 bundled recipes or 1,123 ingredient rows. No recipe links, forms, densities, unit mappings, measurements, package yields, conversions, or substitutions were added.

## Evidence

- OQLF, [tofu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26526882/tofu), [tofu pressé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26527131/tofu-presse), and [tofu soyeux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26526996/tofu-soyeux).
- Sunrise Soya Foods, [Tofu Fumé Sunrise](https://sunrise-soya.com/fr/product/tofu-fume-sunrise/) and [Sunrise Smoked Tofu Original](https://sunrise-soya.com/product/sunrise-smoked-tofu-original/). Formula and firmness details are SKU-specific.
- Japan Ministry of Agriculture, Forestry and Fisheries, [Processed bean products](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/mamerui-kakou.html). The page distinguishes tofu, yuba, and named fried products; it is not a complete cross-cultural naming standard.
- Canadian importer Ozawa, [Hikiage Hira-Yuba (Tofu Skin)](https://ozawa.ca/product/hikiage-hira-yuba-tofu-skin/), and Montréal retailer Paradis Végétarien, [Tofu skin / Peau de tofu](https://www.paradisvegetarien.com/fr/product-page/veg-o-mix-tofu-skin-v%C3%A9g%C3%A9-mix-peau-de-tofu-vegan).
- Health Canada, [Canadian Nutrient File: Tofu, fried / Tofu, frit](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6577). No serving quantity was reused.

## Data checks

The package contains 1,108 references / 79 forms / 114 recipes / 1,123 ingredient rows. The research ledger contains 1,409 records / 4,698 source entries / 3,856 distinct source IDs / 8 unit conversions.

Package validation and normalization checks, generated catalog freshness, ledger-schema validation, exact phrase ownership, recipe-demand scan, and UTF-8/no-BOM checks passed. No unit tests, instrumentation tests, or emulator run were performed because this change only adds database catalog data, consistent with AGENTS.md.

The separate tempeh, natto, seitan, TVP, plant-based mince, and culinary-beverage tasks in Section R remain open.
