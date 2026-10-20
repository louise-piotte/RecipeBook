# WP05 Section W takuan integration — 2026-10-12

## Catalog decision

- Added identity-only `ingredient-ref-takuan`: `takuan (pickled daikon) / takuan (radis daïkon mariné)`, category `SAUCE_AND_CONDIMENT`, with no aliases. The borrowed product name is attested in a Québec French restaurant menu; the descriptive French wording follows current Canadian French product wording and OQLF's `daïkon` term.
- Japan's MAFF identifies takuan as a Japanese daikon pickle traditionally made in rice-bran paste. Canadian distributor listings carry Japanese-style Takuwan and separately label a sweet Korean-style Takuan product. Keep the new identity bounded to takuan; do not use it as an alias for generic daikon, generic pickled radish, or Korean sweet takuan.
- All 114 manifest recipes and 1,123 ingredient rows were scanned. No takuan, takuwan, takuan-zuke, pickled-daikon, or matching French ingredient line was found. No recipe link changed.
- No forms, measures, density, unit mappings, package/cooking yields, conversions, or substitutions were added.

## Sources

- Japan Ministry of Agriculture, Forestry and Fisheries, [Pickled — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/tukemono.html): takuan's traditional product and daikon/rice-bran context.
- Ozawa Canada, [Kimura Takuwan (Pickled Radish)](https://ozawa.ca/product/kimura-traditional-dried-takuwan-1kg/) and [July 2025 catalogue](https://ozawa.ca/wp-content/uploads/2024/08/Ozawa-Catalogue-July-2025.pdf): Canadian distribution, Japanese-style product naming, and the separate Korean-style product label.
- Hungry Ninja, [Tokai Takuwan Taro Tokyo Pickle Radis](https://hungry-ninja.ca/fr/products/rfg-tokai-takuwan-taro-tokyo-pickle-radish-400g): Canadian French retail wording and a Japan-origin SKU; its ingredients remain product-specific.
- Iru Izakaya, [French menu](https://iruizakaya.ca/menu/): Québec restaurant ingredient use of `takuan`.
- OQLF, [daïkon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17018743/daikon): preferred Québec French forms `daïkon` and `radis daïkon`; it does not define an official compound name for the pickle.

## Data and static validation

The package has 1,165 references / 85 forms / 114 recipes / 1,123 ingredient rows, 67 legacy candidates, and 1,466 research-ledger records / 4,899 source entries / 4,008 distinct source IDs / 8 unit conversions. Package normalization and validation, generated-index freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
