# WP03 Section F sprouted brown-rice identity integration

Added identity-only `ingredient-ref-sprouted-brown-rice` as `sprouted brown rice / riz brun germé` in `GRAIN_AND_CEREAL`, with `germinated brown rice` as the sole English alias. The term pair is supported by the NOW Foods product, its French Canadian Walmart listing, FAO conference proceedings, and a Canadian patent title. No French aliases, forms, recipe links, or active substitution rules were added.

The ledger preserves two conflicting product-specific servings: NOW Foods reports 1/4 cup dry at 51 g, while the Walmart Canada listing reports 1/4 cup at 46 g. These remain separate observations; the reference keeps `defaultDensity` null and `unitMappings` empty. The manufacturer’s use-in-place statement and one bowl’s choice of sprouted rice or quinoa remain source-bounded substitution evidence, with no runtime rule.

The pre-integration proposal found no exact owner in the active reference/form/legacy/ledger surfaces and no phrase hits across the 114 bundled recipes or 1,123 ingredient rows. Recipe data and links remain unchanged. Root reviewed the source claims against the linked records, including the retailer’s caveat that third-party marketplace details are not independently verified.

Sources and full boundary notes are in [the proposal](../../proposals/wp03-section-f-sprouted-brown-rice-identity-review-20261012-round2.md):

- [NOW Foods product page](https://www.nowfoods.com/products/natural-foods/sprouted-brown-rice-organic?VARI=1043)
- [Walmart Canada French listing](https://www.walmart.ca/fr/ip/NOW-Foods-Riz-Brun-Germ-Biologique-16-oz/32HR7I4QR3G4)
- [FAO proceedings, English and French sections](https://www.fao.org/4/a0033e/a0033e0a.htm)
- [Canadian Intellectual Property Office archive](https://publications.gc.ca/collections/collection_2016/opic-cipo/RG42-5-131-39.pdf)
- [NOW Foods power-bowl recipe](https://www.nowfoods.com/healthy-living/recipes/build-your-power-bowls)

Static package, reference normalization, generated-index freshness, ledger schema, exact-key ownership, corpus, UTF-8/no-BOM, and scoped whitespace checks are recorded after integration. No tests or emulator checks were run because the implementation only adds database JSON data and documentation.
