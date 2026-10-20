# WP02/WP03/WP04 R794–R796 integration — 2026-10-19

Integrated three reviewed catalog gaps. The data stays within the product, source, and measurement scopes established by the reviews.

## Decisions

- **R794 — Pearl Milling Quick Grits:** Added one current manufacturer source and one dry product-label portion to the existing `ingredient-ref-hominy-grits` ledger row: 1/4 cup (37 g). The product is identified as hominy grits, but the cup convention is unspecified. Do not transfer the amount to other grits, or derive a generic measure, density, mapping, conversion, form, recipe link, yield, or substitution. The existing bilingual identity and its provisional Québec French status are unchanged. See the [R794 proposal](../../proposals/wp02-section-a7-next-grain-meal-gap-review-r794-20261019.md) and the [Pearl Milling product page](https://www.pearlmillingcompany.com/products/other_products/quick_grits).
- **R795 — Red River Cream of Whole Wheat cereal:** Added identity-only `Red River Cream of Whole Wheat cereal / Céréales chaudes Red River à la crème de blé entier` as `ingredient-ref-red-river-cream-of-whole-wheat-cereal`. This resolves the R175 hold with process-matched French product naming. Keep Original Red River, 7 Grain, generic cream of wheat, and component grains distinct. Add no aliases, forms, measures, density, mappings, recipe links, yields, conversions, or substitutions. See the [R795 proposal](../../proposals/wp03-section-f-next-cereal-grain-gap-review-r795-20261019.md), [Arva product page](https://arvaflourmills.com/products/red-river-cream-of-whole-wheat-cereal-908g), [Arva French collection](https://arvaflourmills.com/fr/collections/red-river-cereal), and [Canadian French listing](https://www.walmart.ca/fr/ip/Red-River-C-r-ales-Chaudes-la-Cr-me-de-Bl-Entier-908-g-Lot-de-5-Livraison-Gratuite-au-Canada/4CAGI1SCMQ2O).
- **R796 — dried flatfish powder:** Added the identity-only, species-neutral `dried flatfish powder / poudre de poissons plats séchés` reference with only the English alias `dried flounder fish powder`. Keep it separate from generic fish powder, Bonga powder, dried bonito, and the flounder and sole market-name groups. Added no Chinese alias, form, measure, density, mapping, conversion, yield, recipe link, or substitution. See the [R796 proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r796-20261019.md), [T&T product record](https://www.tntsupermarket.com/eng/51369401-sunnymark-dried-flatfish-powder.html), and [Hong Kong Centre for Food Safety product list](https://www.cfs.gov.hk/tc_chi/programme/programme_nifl/files/SVE_exempted_product.pdf).

## Package state

- 1,881 ingredient references and 197 forms.
- 114 manifest-listed recipes and 1,123 structured ingredient rows. This batch added no recipe rows or links.
- 2,287 research-ledger records, 10,715 source entries, 9,016 distinct source IDs, 7,663 distinct source URLs, and 817 measurement observations.
- The generated Kotlin reference index is current at 1,881 references.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid, including bundled schema and research-ledger validation.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — current.
- Source ownership checks passed: R794's new Pearl Milling source and observation are on the existing hominy-grits record; R795's reused French collection source ID remains attached to its original owner and is also cited by the new product record; R796's nine new source IDs map to the nine reviewed URLs.
- The recipe corpus remains 114 files / 1,123 rows. No new recipe link or recipe change was made for these candidates.
- The two updated seed/ledger JSON files remain ASCII-escaped without a BOM. Documentation is UTF-8 without a BOM; local links, identifiers, and scoped whitespace were checked.

No software tests were run after this data-only JSON integration, as directed by `AGENTS.md`. Full unit, instrumentation, and Pixel 9a emulator validation for concurrent application/test changes in the shared worktree had completed before this catalog integration; those runs did not exercise this new data. Sections A7, F, and P remain open.
