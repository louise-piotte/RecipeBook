# WP05 Section X — Rendang paste product identity review

- **Status:** Integrated as identity-only reference `ingredient-ref-rendang-paste`.
- **Reviewed:** 2026-10-18.
- **Decision:** Add `rendang paste / pâte d’épices pour rendang` to `SAUCE_AND_CONDIMENT`, with no aliases or numeric behavior.
- **Scope:** A prepared seasoning paste marketed for preparing rendang. Keep finished rendang curry or stew, dry seasoning blends, generic curry paste, and named product formulations distinct.

## Decision and boundaries

Current Canadian listings identify both an Asian Home Gourmet spice paste for Indonesian rendang curry and a Mak Nyonya product titled Rendang Paste. The Canadian distributor THL also lists the Asian Home Gourmet item as a condiment product. These listings support a searchable prepared-paste identity, but they do not establish one shared recipe, ingredient formula, national origin, heat level, or package measure. The imported Thai-made Indonesian-style product and the Malaysian product remain source-specific examples.

No matching ingredient row was found in the 114 bundled recipes. The display name `pâte d’épices pour rendang` is a transparent French description; no Québec terminology authority or Québec French product title was found in this review, so the wording remains provisional. The English display follows a current Canadian product title.

Use no forms, density, unit mappings, measurement observations, recipe links, package yields, conversions, or substitutions. Measurement and substitution research remain `not_yet_researched`. The older broad proposal held rendang paste because the Prima Taste products it reviewed were complete sauce or kits; the current Canadian product pages add direct evidence for a distinct paste. Satay paste remains a separate unresolved candidate.

## Ownership and source review

The exact English phrase `rendang paste` was not owned by another active reference, form, or ledger identity. The exact phrase `pâte d’épices pour rendang` likewise had no existing owner. No recipe lines contain rendang.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-RENDANG-PASTE-R606-S01** | Haisue, [Asian Home Gourmet — Spice Paste for Indonesian Rendang Curry 50 g](https://haisue.ca/collections/asian-home-gourmet/products/asian-home-gourmet-spice-paste-for-indonesian-rendang-curry-50g). | Toronto retailer title, item specification, ingredient list, and Thai origin. The listing says backordered; it supports the product identity, not current shelf availability or a common formula. |
| **WP05-RENDANG-PASTE-R606-S02** | THL Gourmet Foods, [Asian Home Gourmet Spice Paste for Indonesian Rendang Curry](https://thlfoods.com/product/asian-home-gourmet-spice-paste-for-indonesian-rendang-curry/). | Canadian distributor product record identifies the named spice paste, SKU 40931, 50 g package, and Thai origin. Package data are not reusable kitchen measures. |
| **WP05-RENDANG-PASTE-R606-S03** | Shop Malaysia Canada, [Mak Nyonya Rendang Paste](https://www.shopmalaysiacanada.com/product/mak-nyonya-rendang-paste/). | Canadian retailer identifies a separate Malaysian product as Rendang Paste and classifies it under seasoning/paste and instant sauce/paste. Its 200 g retail package is not a measure or shared formula. |
| **WP05-RENDANG-PASTE-R606-S04** | Walmart Canada, [Spice Paste for Indonesian Rendang Curry](https://www.walmart.ca/en/ip/Spice-Paste-for-Indonesian-Rendang-Curry/6000196402017). | Canadian retail title and food-form metadata identify paste; the page showed the item out of stock. It supports naming and product form, not current availability. |

## Static checks

Exact identity ownership, recipe demand, source-ID uniqueness, ledger schema, seed package normalization, generated-index freshness, Unicode escaping, UTF-8/no-BOM, links, and scoped whitespace were checked after integration. No app tests, builds, or emulator checks were run because the change only adds database JSON data and catalog documentation, as directed in `AGENTS.md`.

