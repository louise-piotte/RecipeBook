# WP02 Section C — Malt-syrup picker-boundary hold integration (R349, 2026-10-16)

## Decision

Kept generic `malt syrup / sirop de malt`, barley-qualified malt-syrup labels, `rice malt syrup`, `brown rice malt syrup`, generic `rice syrup`, and `jocheong` out of active identities and aliases. The Section C sweetener checklist remains open. Existing brown-rice syrup, malt flour, malted barley flour, malt extract, molasses grades, golden syrup, amazake, and shio-koji records remain unchanged.

No active identity, alias, form, measure, density, mapping, recipe link, conversion, yield, or substitution was added. The reviewed terms have no match in the 114 manifest-listed recipes / 1,123 ingredient rows.

## Evidence and picker boundary

- The OQLF GDT entry for [sirop de malt](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10491445/sirop-de-malt) gives the Québec French term and English `malt syrup`, without a formula definition. TERMIUM Plus separately lists `barley malt syrup / sirop de malt d’orge`; its generic malt-syrup entry says products are usually barley-based but may use wheat or rice.
- CFIA’s English and French [ingredient-name examples](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens) list malt syrup, malted barley syrup, and rice syrup separately. The Canadian bread standard also lists malt syrup, malt extract, and malt flour as separate permitted names. These are distinct names, not product definitions.
- Canadian retailer and manufacturer examples vary: [Eden’s barley malt syrup](https://well.ca/fr/produits/eden-organic-barley-malt-syrup_18381.html) declares organic sprouted barley and water; [Chung Jung One Rice Syrup](https://www.thekmart.ca/en/products/%EC%B2%AD%EC%A0%95%EC%9B%90-%EC%A1%B0%EC%B2%AD%EC%8C%80%EC%97%BF-1-2kg) lists rice, malt, and water; [Ceres Organic Brown Rice Malt Syrup](https://products.ceresorganics.com.au/Baking/Baking-Supplies/Sugar-and-Sweeteners/12171-Organic-Brown-Rice-Malt-Syrup-400g/) describes a syrup made by culturing certified organic rice. Rice Show’s [Rice Jocheong](https://riceshow.or.kr/html/info/productView.php?lang=eng&no=368) lists rice, malt, and enzyme as its ingredients. These product formulas do not define universal product classes.
- The live matcher returns `ingredient-ref-brown-rice-syrup` for generic `rice syrup / sirop de riz` due phrase containment. A new qualified barley row would similarly make broad `malt syrup / sirop de malt` queries resolve to barley. The catalog has no market or formulation qualifier to preserve these distinctions.

No SKU package amount, manufacturer reconstitution, or product-specific sweetening advice was made reusable. No data or software tests were needed for this documentation-only decision.

See the [R349 proposal](../../proposals/wp02-section-c-malt-syrup-boundary-review-r349-20261016.md) and the active [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).
