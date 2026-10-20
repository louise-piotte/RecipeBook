# WP04 Section P R565 — Atlantic cod centre-cut hold — 2026-10-17

## Decision

Kept `ingredient-form-atlantic-cod-centre-cut` and its aliases out of active catalog data and the research ledger. High Liner documents Atlantic cod centre cuts as a distinct cut class from its loins, but the natural English and French labels would make the current picker return Atlantic cod alone for broad `centre` and `coupe` queries. The existing results cover nine juice/concentrate rows for `centre` and three rows for `coupe` (kkakdugi, leaf lettuce, and steel-cut oats). The bundled recipes contain no centre-cut demand.

R565’s English and French product routes identify the same High Liner SKU: product code **6128**, GTIN **10061763061285**, about **85 g per piece**. This is a SKU-specific product serving, not a reusable centre-cut weight or recipe portion. The 2026 product guide lists code 6129 separately as another centre-cut SKU and distinguishes both centre-cut codes from loin products. R560’s paired cod-loin forms remain unchanged.

No alias, form, source row, ledger record, measurement, package yield, recipe link, conversion, or substitution was added. Revisit the hold if picker behavior can preserve the broader result sets while exposing the qualified cut, or if a broader product-backed cut set produces a useful non-singleton search result.

## Sources

- High Liner [English Atlantic Cod Centre Cuts, product 6128](https://www.highlinerfoodservice.com/en-CA/products/atlantic/e7b1b127-5035-4e70-bbb2-ff9b72f5d011/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-centre-cuts-approx-85-g-3-oz) and [French product route](https://www.highlinerfoodservice.com/fr/products/atlantic/e7b1b127-5035-4e70-bbb2-ff9b72f5d011/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-centre-cuts-approx-85-g-3-oz) pair the English and French product wording with the same product code and GTIN.
- The [2026 French product guide](https://assets.contentstack.io/v3/assets/blt4f0d20e0e71d660d/blt1a9263728c7bbcce/6966cffe149b23000862408d/HL-ProductGuide-2026-CAN-FR-FF_%282%29.pdf) was reviewed as manufacturer assortment evidence; its 6128 and 6129 amounts remain separate SKU details.
- The current [R560 cod-loin review](../../proposals/wp04-section-p-next-gap-review-r560-20261017.md) remains the source for the two integrated loin forms.

## Files updated

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- [R565 proposal](../../proposals/wp04-section-p-next-gap-review-r565-20261017.md)

## Verification

- High Liner’s current indexed English and French routes pair to code 6128 and GTIN 10061763061285; the 6129 guide line remains a separate SKU.
- Read-only picker projection confirms the broad `centre` and `coupe` result sets would be suppressed by the proposed form label.
- The 114-recipe / 1,123-row bundle scan found no centre-cut demand.
- Local Markdown links, UTF-8/no-BOM, final newline, and whitespace checks passed.
- No software tests were run: this was a documentation-only hold with no catalog, ledger, or code changes.

WP04 Section P remains open.
