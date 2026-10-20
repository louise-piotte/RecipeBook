# WP02 Section A7 R704 — Sprouted Whole-Barley Flour Form Review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. This review changes no shared catalog JSON, research ledger, plan, roadmap, workflow, or recipe.
- **Plan anchor:** The A7 parent remains open for other grain meals and milling products ([plan, line 2114](../../RecipeBook-global-ingredient-catalog-plan.txt#L2114)). Wheatlets and its separate measurement review are excluded.
- **Scope:** One candidate flour form: sprouted whole-barley flour, potentially represented under the existing whole-barley-flour reference.

## Recommendation

**Hold the sprouted whole-barley-flour form pending a current manufacturer confirmation of the product identity.** A Québec retailer currently lists “organic sprouted whole barley flour” / “farine d’orge entière germée biologique” in the ingredients for Silver Hills Little Big Bread, UPC 055991040863 [S03–S05]. Silver Hills’ current English and French product pages for Little Big Bread show a different ingredient list: organic sprouted whole grains are specified as whole wheat and whole oats, with no barley flour [S01–S02]. Its current FAQ confirms that Silver Hills sells sprouted grain flour at its Abbotsford retail store, but does not identify barley as a flour product or name a matching SKU [S06].

The retailer wording is useful evidence of a Québec French ingredient phrase and a possible flour identity. The same UPC and product title on the retailer pages, however, do not establish that their barley-flour ingredient data matches the manufacturer's current formulation. No product-specific, manufacturer-confirmed barley-flour product page or current label resolves that conflict. Do not add an active form, new reference, alias, or ledger candidate on this evidence alone.

If a current manufacturer label confirms this product or a standalone sprouted whole-barley flour, the narrow integration shape would be one **sprouted** form under **ingredient-ref-whole-barley-flour**, with the labels **sprouted whole barley flour / farine d’orge entière germée**, no match-term aliases, and no numeric or recipe behavior. It should remain distinct from the whole sprouted barley grain and malted barley flour.

## Why this is an open A7 gap

The A7 parent at plan line 2114 explicitly keeps other grain meals and milling products open. The integrated R698 Wheatlets identity and R701 Wheatlets measurement review address a different product.

The archive has a related but distinct **WP03** identity for dried sprouted barley as a whole grain, **sprouted barley, dried / orge avec écorce germée séchée** ([R8 proposal](wp03-section-f-next-gap-review-20261012-round8.md)). That review distinguishes the whole dried grain from barley flours; it does not decide a sprouted flour form. The existing A7 reference **ingredient-ref-whole-barley-flour** concerns flour, and the existing **ingredient-ref-malted-barley-flour** concerns malted barley flour. Neither owns or aliases sprouted whole-barley flour. The R250 sprouted brown-rice-flour form is a process-form precedent for a different cereal; it does not resolve this barley product.

Exact-name checks across the current references, forms, legacy identities, and research ledger found no owner for **sprouted whole barley flour**, **farine d’orge entière germée**, or the proposed form ID **ingredient-form-whole-barley-flour-sprouted**. Searches of the proposal and batch archive found no prior WP02 A7 review specifically about sprouted whole-barley flour. The related sprouted-barley-grain review is not reopened here.

## Current owners and boundary

| Existing owner | Current display and category | Boundary |
| --- | --- | --- |
| **ingredient-ref-barley-flour** | **barley flour / farine d’orge**; FLOUR_AND_STARCH | Generic barley flour. Do not move the whole-grain qualifier or sprouting wording here. |
| **ingredient-ref-whole-barley-flour** | **whole barley flour / farine d’orge entière**; FLOUR_AND_STARCH | Existing whole-kernel flour identity supported by La Milanaise’s bilingual Québec product pages [reused WP02-A4-WBF-20261011-S01–S02]. This is the only plausible parent if the sprouted whole-flour form is later confirmed. |
| **ingredient-ref-malted-barley-flour** | **malted barley flour / farine d’orge maltée**; FLOUR_AND_STARCH | A distinct malted product. Do not use **malted** as an alias for the retailer’s **germée** wording or infer equivalent processing. |
| **ingredient-ref-sprouted-barley** | **sprouted barley, dried / orge avec écorce germée séchée**; GRAIN_AND_CEREAL | A dried sprouted whole-grain product. It is not flour and does not own flour wording. |

The current catalog and active French base term **farine d’orge** are supported by the existing OQLF record for barley flour [reused WP02-A4-WBF-20261011-S04]. It does not settle the full sprouted compound.

## Product identity and Québec wording

The retailer-listed phrase has two identity qualifiers: **whole** barley and **sprouted** barley, in a flour ingredient. If confirmed, those qualifiers distinguish the milling product from the whole sprouted grain and the unqualified whole-barley flour. They also avoid treating it as malted barley flour. The available retailer declaration does not specify the sprouting, drying, or milling process, and no process claim is inferred.

Use the French phrase only as the current Québec retailer’s ingredient-list wording, not as an OQLF ruling or an independently verified standalone flour product title. The manufacturer’s current French product page does not list this barley-flour ingredient. Do not shorten the candidate to **farine d’orge germée**, **farine d’orge maltée**, or **orge germée**; none has been established as an equivalent product name.

## Recipe demand and picker audit

The read-only bundled-recipe scan covered all **114 manifest-listed files** and **1,123 structured ingredient rows**. It found no matching text for the candidate English or French phrases, no barley/orge ingredient row, and no link to the whole-barley-flour reference. The 430 g weight on the retailer page is the finished bread package weight, not a quantity of barley flour. No bundled recipe demand, portion, measurement, or substitution is supported.

The picker projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it accent-folds terms, prefers complete word-phrase matches, then falls back to substring matching.

| Query | Current result | If the form is later confirmed and added |
| --- | --- | --- |
| **sprouted whole barley flour** | No result | **ingredient-ref-whole-barley-flour**, with a sprouted form hint |
| **farine d’orge entière germée** | No result | **ingredient-ref-whole-barley-flour**, with a sprouted form hint |
| **sprouted barley** | **ingredient-ref-sprouted-barley** only | Unchanged; the whole-grain row remains the result |
| **whole barley flour** / **farine d’orge entière** | **ingredient-ref-whole-barley-flour** | Unchanged |
| **barley flour** / **farine d’orge** | Four rows: generic, malted, roasted, and whole barley flour | Still the same four references; a form does not add a fifth identity |

Do not add **organic** / **biologique** as aliases. Those are product claims and do not resolve whether the two sources describe the same current formulation. Do not add broader **sprouted barley flour** or **farine d’orge germée** terms unless a matching product source supports those less-qualified phrases.

## Source register

| ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| **WP02-A7-SPROUTED-WHOLE-BARLEY-FLOUR-R704-S01** | Silver Hills Bakery, [Little Big Bread — English product page](https://silverhillsbakery.ca/products/little-big-bread/), current product and ingredient sections. Accessed 2026-10-18. | Manufacturer’s current product page marks Little Big Bread available in Canada and lists organic sprouted grains as whole-grain wheat and whole-grain oats. It does not list barley flour in its current ingredient statement. The page does not explain when retailer product data was updated. |
| **WP02-A7-SPROUTED-WHOLE-BARLEY-FLOUR-R704-S02** | Silver Hills Bakery, [Little Big Bread — French product page](https://silverhillsbakery.ca/fr/produits/little-big-bread/), current product and ingredient sections. Accessed 2026-10-18. | The manufacturer’s French page likewise lists sprouted whole wheat and oats, not barley flour. It does not provide the Québec retailer’s **farine d’orge entière germée** compound. |
| **WP02-A7-SPROUTED-WHOLE-BARLEY-FLOUR-R704-S03** | Metro Québec, [Pain au blé germé en petites tranches Silver Hills](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-emballes/ble-entier-et-cereales/pain-au-ble-germe-en-petites-tranches/p/055991040863), 430 g, UPC 055991040863, ingredient panel. Accessed 2026-10-18. | Lists **farine d’orge entière germée biologique**. This is Québec retailer wording for an ingredient in finished bread; the page warns that suppliers may change product information and that package labels should be checked. The 430 g is bread package weight. |
| **WP02-A7-SPROUTED-WHOLE-BARLEY-FLOUR-R704-S04** | Metro Canada, [Silver Hills Sprouted Wheat Sliced Bread](https://www.metro.ca/en/online-grocery/aisles/bread-bakery-products/packaged-bread/whole-wheat-grain/sprouted-wheat-sliced-bread/p/055991040863), 430 g, same UPC, ingredient panel. Accessed 2026-10-18. | Lists **organic sprouted whole barley flour** for the same SKU. It is the English counterpart of the Metro Québec listing, not an independent manufacturer statement. |
| **WP02-A7-SPROUTED-WHOLE-BARLEY-FLOUR-R704-S05** | La Boîte à Grains, [Pain de Blé Germé Little Big Bread](https://laboiteagrains.com/products/pain-de-ble-germe-little-big-bread-silver-hills), 430 g, ingredient panel. Accessed 2026-10-18. | A second Québec retailer page uses **farine d’orge entière germée biologique**. Its product page names the same Silver Hills Little Big Bread, so it corroborates local phrase usage but does not resolve the conflict with the manufacturer’s current formulation. |
| **WP02-A7-SPROUTED-WHOLE-BARLEY-FLOUR-R704-S06** | Silver Hills Bakery, [FAQs](https://silverhillsbakery.ca/faqs/), “Does Silver Hills Bakery sell sprouted grain flour?” Accessed 2026-10-18. | Says sprouted grain flour is sold at the company’s Sprouted Oven retail store in Abbotsford. It does not identify barley flour, a product name, a package, or a Canadian/Québec French display. |
| Reuse existing **WP02-A4-WBF-20261011-S01–S02** and **WP02-A4-WBF-20261011-S04** | La Milanaise’s bilingual whole-barley-flour pages and OQLF’s **farine d’orge** entry, already in the whole-barley-flour ledger record. | These sources support the existing parent identity and French head term only. They do not establish a sprouted form. |
| Reuse existing **WP03-SPBARLEY-20261012-S01** and **WP03-SPBARLEY-20261012-S07** | Malterie Caux-Laflamme’s dried sprouted barley product page and CFIA’s general dried-sprouted-seed survey, already in the sprouted-barley ledger record. | These sources concern sprouted barley grain and the general dried sprouted-seed class. They do not identify sprouted whole-barley flour or settle its milling process. |

## Integration boundary

Do not change the references, forms, ledger, plan, roadmap, workflow, or recipes for this hold. If a current manufacturer label or product page later confirms the product, add only one **sprouted** form to **ingredient-ref-whole-barley-flour** with:

- Form ID **ingredient-form-whole-barley-flour-sprouted**.
- English label **sprouted whole barley flour**.
- French label **farine d’orge entière germée**, after confirming that the Québec retailer wording still matches the manufacturer’s product.
- Empty match-term arrays, null form density, and no measurements, mappings, conversions, yields, recipe links, or substitutions.
- One form-level ledger record with the current manufacturer evidence and Québec French wording source.

No new active identity or ledger candidate is justified by the present evidence. This was a proposal-only source, catalog, ledger, archive, recipe, and picker review; no tests, build, emulator, or deployment were run.
