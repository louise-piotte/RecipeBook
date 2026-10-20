# WP06 Europe R466 — Prosciutto di Parma identity

Recorded on 2026-10-17 after root review of the [R466 proposal](../../proposals/wp06-europe-next-regional-identity-review-r466-20261017.md).

## Decision

Added identity-only `Prosciutto di Parma` as `ingredient-ref-prosciutto-di-parma-pdo`, using the registered Italian name in both language fields and `jambon de Parme AOP` as the only French alias. Kept generic `prosciutto / prosciutto`, generic `ham / jambon`, Prosciutto di San Daniele, jamón, and other cured hams distinct. No English aliases were added; in particular, `Parma ham` remains unallocated in light of the Consortium's Canadian naming context.

The European Commission identifies the PDO as raw, aged ham whose production is restricted to the Province of Parma. The Consortium reports 2025 exports to Canada and lists importers in Laval and Montréal. The Montréal butcher and Costco Canada pages support current Italian-name product listings, but their SKU claims do not certify every Parma-named product or establish local stock for every postal code.

## Search and recipe boundaries

The generic `prosciutto` search now returns both the generic row and Prosciutto di Parma. `jambon` also returns the generic ham row and the Parma row through the qualified French alias; exact `jambon de Parme` and `Parma` queries select the regional row. `prosciutto ham` remains on the generic owner, and `Parma ham` remains unallocated.

The manifest scan found no matching ingredient demand. No forms, reusable measures, density, unit mappings, conversions, recipe links, yields, or substitutions were added. The local 100 g product label and online 7 kg package remain product-specific.

## Evidence reviewed

- European Commission, [Prosciutto di Parma PDO](https://agriculture.ec.europa.eu/farming/geographical-indications-and-quality-schemes/geographical-indications-food-and-drink/prosciutto-di-parma-pdo_en) and [Prosciutto di Parma AOP](https://agriculture.ec.europa.eu/farming/geographical-indications-and-quality-schemes/geographical-indications-food-and-drink/prosciutto-di-parma-pdo_fr): protected product identity, Province of Parma production boundary, and the French wording `jambon de Parme AOP`.
- Consorzio del Prosciutto di Parma, [North America importers and distributors](https://www.prosciuttodiparma.com/en/export-north-america/): 2025 Canadian exports, Laval and Montréal importers, and Canadian naming context.
- Boucherie Capitol, Montréal, [Sliced Italian Prosciutto di Parma 100g Portion](https://www.boucheriecapitol.com/product-page/italian-prosciutto-18-month-100g-portion): local product title and current cart listing; no individual-SKU PDO mark.
- Costco Canada, [French listing](https://www.costco.ca/p/-/prosciutto-di-parma-dop-16-mois-7-kg/4000361272?langId=-25) and [English listing](https://www.costco.ca/p/-/prosciutto-di-parma-dop-16-months-7-kg/4000361272): same Gualerzi 7 kg SKU in both languages; shipping depends on postal code.
- Existing OQLF generic prosciutto and EU specification sources were reused from the generic prosciutto record, without duplicate entries.

## Validation record

The current package contains 1,749 references and 141 forms. The ledger contains 2,108 records, 9,601 source entries, 8,148 distinct source IDs, and 6,861 distinct source URLs. The manifest remains 114 recipes / 1,123 ingredient rows. Package normalization, generated-index freshness, ledger/source ownership, picker projection, corpus, encoding, and local-document checks passed. No app or Android tests were run because this change only adds database JSON data under `AGENTS.md`.

Europe-wide coverage remains open.
