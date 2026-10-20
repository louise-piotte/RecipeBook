# WP02 Section 04 — white-bean flour product-boundary hold (R90)

Proposal reviewed and hold integrated 2026-10-14; the proposal's source review was completed 2026-10-13. Section 04 B2/B3 remains open.

## Decision

Keep generic **white bean flour** and directory-listed **whole white bean flour** unassigned. Add no ingredient reference, alias, legacy candidate, ledger record, form, measurement, conversion, recipe link, yield, or substitution.

The [Canadian Celiac Association's finder](https://www.celiac.ca/gf-product-finder/) lists AGT Whole White Bean Flour and Whole White Bean Flour – Deflavored separately from whole Navy-bean and Great Northern-bean flour products. The finder was last updated in July 2026, says it is not updated in real time, and supplies no UPC or variety/process detail for the white-bean entries. Its product names do not identify which variety or milling scope “white bean” means.

By contrast, the Canadian retailer Bare Market's [White Bean Flour listing](https://baremarket.ca/products/bean-flour) identifies its ingredient as **white navy bean**. This establishes one retailer's use of the broad English product title for Navy-bean flour; it does not define all white-bean flour products. AGT's current [PulsePlus flour page](https://www.agtfoods.com/ingredients/pulseplus-ingredients/flours) says its pulse flours may use whole or dehulled pulses and lists pea, lentil, chickpea, and faba products, but no white-bean flour. AGT's [bean overview](https://www.agtfoods.com/about/productcategories/pulses/beans) groups several varieties under white beans, including Navy and Great Northern.

The OQLF GDT entries for [haricot blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296956/haricot-blanc) and [petit haricot blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083589/petit-haricot-blanc) describe whole beans. The latter identifies Navy bean and white pea bean within the wider white-bean family. They do not establish a standalone flour name. A Metro Québec [white-bean and millet bread listing](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-emballes/sans-gluten-et-dietes-speciales/pains-tranches-aux-haricots-blancs-et-graine-de-millet/p/833966000025) has indexed French ingredient wording *farine de haricots blancs*, but it is a composite bread declaration; direct retrieval returned a cache miss. It does not specify variety or standalone flour scope.

## Picker and recipe boundary

There is no exact current owner for `white bean flour`, `whole white bean flour`, `farine de haricots blancs`, or `farine de haricots blancs entiers`. A hypothetical row displayed as `whole white bean flour / farine de haricots blancs entiers` would match those product phrases and would also appear alongside the whole-bean row for broad `white bean` and `haricots blancs` queries. Keep `navy bean flour` and `Great Northern bean flour` attached to their respective source-scoped flour rows. Do not route the generic query to Navy flour based on Bare Market alone.

The 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for the candidate English/French flour names and direct references to the related whole-bean and flour identities. No matching recipe line or link was found.

## Measures and substitutions

Ontario Bean Growers' [pizza-crust recipe](https://ontariobeans.on.ca/recipe/pizza-crust/) specifies 2/3 cup (150 mL) white-bean flour but gives no mass, brand, or variety. The value remains a recipe-specific volume. Jacques et al. report 0.90 ± 0.01 g/mL for ungerminated study flour and 0.75 ± 0.02 g/mL after germination; the beans were study-prepared and the tapped-cylinder method heading says “starch” while its procedure and results refer to flour. Do not activate either result as a generic density or unit mapping.

The [white-kidney-bean noodle study](https://pmc.ncbi.nlm.nih.gov/articles/PMC9689948/) reports a 20% preferred formulation only for its named flour in wheat noodles. It is not a transferable replacement ratio. No global, contextual, or recipe-line substitution is supported.

Molendum's [wholemeal white-bean flour page](https://www.molendum.com/en/food-industry-ingredients/natural-flour/wholemeal-flours/manufacturer-wholemeal-flour-white-red-pinto-beans/) confirms a manufacturer-defined wholemeal product made from dry, mature *Phaseolus vulgaris* beans, but gives no cultivar or Québec product name. This supports a possible product class without resolving the Canadian listing's identity.

## Verification

Root reviewed the proposal and checked the cited Celiac Canada, AGT, Bare Market, OQLF, Ontario Bean Growers, Molendum, and research pages. A static projection using the current phrase-match rules confirmed that adding a hypothesized whole-white-bean-flour row would create the expected specific result while broad white-bean searches would retain the existing whole-bean result and include the flour. The 114-recipe / 1,123-row scan found no matching lines or links. No shared catalog or ledger data changed. No app, Gradle, instrumentation, or emulator tests were run because this was a documentation-only hold.

See the [R90 proposal](../../proposals/wp02-b2b3-r90-white-bean-flour-product-boundary-review-20261013.md) for the full source register, phrase-owner inventory, and exact projection.
