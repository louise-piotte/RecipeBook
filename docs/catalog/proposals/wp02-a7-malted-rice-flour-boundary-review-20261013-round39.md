# WP02 A7 — Malted Rice Flour Boundary Review (R39)

- Reviewed: 2026-10-13.
- Status: Integrated documentation-only hold.
- Proposal-local source-ID prefix: `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S` (sources S01–S07). These IDs belong only to this proposal and are not ledger records.
- Scope: flour made from malted rice, called `malted rice flour` in food-science studies. Keep it distinct from plain white, brown, and glutinous rice flours; branded Mochiko and Shiratamako flours; roasted red rice flour; toasted rice powder; rice malt syrup; fermented malted rice/koji; and generic malt flour.

## Disposition

Keep malted rice flour **unresolved and unallocated**. Add no active reference, alias, form, legacy identity, ledger candidate, measure, density, unit mapping, recipe link, conversion, yield, or substitution.

Research establishes malted rice flour as an experimental ingredient. The current Canadian and Québec product sources reviewed identify ordinary rice flour and several malted-grain flour products, but do not establish a standalone malted-rice-flour SKU, its commercial specification, or a Québec French display. The research term `malted rice flour` is not itself evidence of a retail product. Treat `farine de riz maltée` as a literal search query only; no reviewed Québec terminology or product source validates it as the display name or alias.

## A7 and archive check

The active [A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) still covers other grain meals, malted/toasted flour identities, and gluten-flour equivalence. The [roadmap's R38 entry](../../../roadmap.md#L639) records the malted-quinoa hold and says A7 remains open. R38 reviews malted quinoa; R32–R37 and earlier A7 decisions cover other candidates, including malted finger millet, malted maize, malted naked oat, malted buckwheat, malted sorghum, malted teff, rice grits, and the already reviewed meal/toasted-flour items. None adjudicates malted rice flour. The requested filename and source-ID prefix were unused before this review.

Nearby records do not assign this candidate: the [brown-rice-syrup review](wp02-brown-rice-syrup-identity-boundary-review-20261011.md) treats brown-rice-malt syrup as a syrup, and the [shio-koji review](wp05-shio-koji-identity-boundary-review-20261010.md) explicitly keeps fermented rice malt/koji separate from generic malt. Neither defines a flour.

## Live ownership and picker audit

Audit snapshot: **1,367 active references**, **100 forms**, **64 legacy-import candidates**, **1,699 research-ledger records**, **114 manifest-listed recipes**, and **1,123 ingredient rows**.

| Surface | Current owner or finding |
|---|---|
| Rice-flour references | `ingredient-ref-rice-flour` (`rice flour / farine de riz`), `ingredient-ref-brown-rice-flour` (`brown rice flour / farine de riz brun`), and `ingredient-ref-white-rice-flour` (`white rice flour / farine de riz blanc`) are separate `FLOUR_AND_STARCH` identities. Each has empty aliases, `defaultDensity: null`, and no unit mappings. |
| Other rice flours | `ingredient-ref-glutinous-rice-flour` owns `glutinous rice flour / farine de riz gluant` with English aliases `sweet rice flour` and `sweet rice powder`. `ingredient-ref-mochiko-glutinous-rice-flour` and `ingredient-ref-shiratamako-glutinous-rice-flour` are brand/process-specific references. `ingredient-ref-roasted-red-rice-flour` is separately named `roasted red rice flour / farine de riz rouge torréfiée`. None identifies a malted-rice flour. All seven references returned by `rice flour` and `farine de riz` have null default density and empty unit mappings. |
| Generic malt | `ingredient-ref-malt-flour` owns `malt flour / farine maltée`, with English alias `malted cereal flour`; it has no density, unit mapping, or form. It is not an exact owner for malted rice flour. Other malted and malt-roasted flour identities remain cereal-specific. |
| Related rice products | `ingredient-ref-brown-rice-syrup` owns `brown rice syrup / sirop de riz brun`; no active flour row owns rice malt syrup. Toasted rice powder and fermented rice/koji products are separate identities. The syrup and koji archive decisions do not imply flour aliases or forms. |
| Forms | The 100-form package has dry/cooked forms for generic rice and white rice and thickness forms for flattened rice/poha. It has no rice-flour or malted-rice-flour form, and no form attached to generic malt flour. These rice grain and flake forms do not own the candidate. |
| Legacy and ledger | Searches of all 64 legacy candidates and 1,699 ledger records found no exact candidate owner for `malted rice flour`, `rice malt flour`, `farine de riz maltée`, or `farine maltée de riz`. The ledger's brown-rice-syrup record and the koji records concern distinct products. No candidate is proposed for either store. |

The picker uses normalized names, aliases, and attached form terms in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Static projections from the current package are:

| Query | Current results | If a separate row used `malted rice flour / farine de riz maltée` |
|---|---:|---:|
| `malted rice flour`; `rice malt flour`; `farine de riz maltée`; `farine maltée de riz` | 0 | 1 for the two exact candidate phrases; the other phrase remains 0 |
| `rice flour` | 7 rice-flour references | 8 |
| `farine de riz` | 7 rice-flour references | 8 |
| `rice` | 51 references | 52 |

These are search-index projections, not a live UI test. A candidate row would add another result to broad rice-flour and rice searches without serving any current recipe line; no picker change is recommended.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files** and all **1,123 structured ingredient rows** in the [bundled package](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json). Searches for the candidate English and French phrases returned **zero full-recipe matches and zero ingredient-row matches**. The five structured rows that mention rice are one crispy-rice-cereal line and four cooked-rice lines; none names rice flour or malted rice flour. For example, the [fried-rice recipe](../../../app/src/main/assets/seed/bundled-library/recipes/093-riz-frit-fried-rice-2a2a7481-b5dc-45a5-9733-e3885d682131.v1.json) links cooked rice to `ingredient-ref-rice` and `ingredient-form-rice-cooked`. It supplies no flour demand or recipe link for this review.

## Measurement, density, and substitution limits

- The active rice-flour and generic malt-flour references have no default density or unit mappings. No rice-flour or malted-rice-flour form has a form-level density.
- The Québec Food Directory reports a **1/3 cup (60 g)** serving for Les Moulins de Soulanges' named organic whole brown rice flour. This is that plain product's serving description, not a reusable density or mapping, and it cannot be transferred to malted rice flour.
- The 2010 bread study reports its best result at **35% wheat-flour replacement** with a particular three-day-germinated rice malt flour in its tested bread formulation. The 2025 weaning-mix study includes **5% malted rice flour** in one optimized multi-ingredient formula. These are study-specific recipes, not general replacement ratios, household conversions, or substitutions between rice flour and malted rice flour.
- No reviewed source establishes an exact-form household volume-to-weight measure, density, general yield, global form conversion, or safe general substitution for malted rice flour. Add none.

## Sources and limits

Online sources checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S01` | Kalita and Srivastava, [“Multivariate optimization approach for formulation of malted Rice flour-based weaning mix and its rheological behavior in simulated human digestive system”](https://www.sciencedirect.com/science/article/abs/pii/S0308814625019235), *Food Chemistry* 486 (2025), 144672, DOI [10.1016/j.foodchem.2025.144672](https://doi.org/10.1016/j.foodchem.2025.144672); abstract, ingredient selection, and formulation. | Current peer-reviewed research explicitly names malted rice flour and reports preparing it from germinated rice; one optimized weaning mix uses 5% malted rice flour. | Experimental North-East Indian rice and a specific multi-ingredient infant-weaning formula; not a Canadian product specification, Québec label, household measure, or general substitution. |
| `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S02` | Veluppillai et al., [“Optimization of Bread Preparation from Wheat Flour and Malted Rice Flour”](https://www.sciencedirect.com/science/article/pii/S1672630808601043), *Rice Science* 17(1) (2010), 51–59, DOI [10.1016/S1672-6308(08)60104-3](https://doi.org/10.1016/S1672-6308(08)60104-3); abstract, rice variety/process, and bread formulation. | Food-science paper names malted rice flour and reports a 35% wheat-flour replacement result for three-day-germinated local Mottaikaruppan rice flour. | One specific bread formula and rice source; the percentage is not a broadly validated home-baking substitution or product equivalence. |
| `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S03` | Office québécois de la langue française, [*farine de riz* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), updated 2025; definition, note, and preferred term. | Establishes the Québec French term `farine de riz` for fine ground rice and says it can come from white or brown rice. | Does not name malted rice flour or validate `farine de riz maltée`. |
| `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S04` | Répertoire des aliments québécois, [La Milanaise, *Farine de riz brun entière biologique*](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204185), product description, ingredients, portion, and last-updated field (2026-09-24). | Current Québec product record describes plain brown rice flour and reports a product serving of 1/3 cup (60 g). | One named plain SKU; neither its name nor portion supports a malted flour identity, general density, or transferable mapping. |
| `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S05` | Port Royal Mills, [Canadian supplier product overview](https://www.portroyalmills.com/), company scope, product list, and custom milling (2026 page); see lines 35–39 and 55–89. | Ontario supplier lists rice, malted barley, and malted wheat product families separately and describes custom grain milling. | Its public list does not name a malted-rice-flour SKU; a public portfolio is not a market-wide absence proof and does not give a Québec French name. |
| `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S06` | Snow Cap, [Flour – Misc / Alternative catalogue](https://snowcap.com/product-category/ingredients/flours-and-grains/flour-misc-alternative/), product catalogue lines 32–89 (19 listed products when checked). | Canadian distributor lists malted barley flour and separate rice, brown-rice, and sweet-rice flour products. | The displayed catalogue has no malted-rice-flour item; it does not define the whole Canadian market or a Québec French term. |
| `WP02-A7-MALTED-RICE-FLOUR-20261013-R39-S07` | Tibiona, [*Farine maltée*](https://tibiona.eu/fr/farine/farines-introuvables/farine-maltee), French product-category explanation, lines 319–324. | Describes malted flour as germinated, dried, and ground grain and says rice can be used as the cereal. | European retailer's general process discussion; not a rice-specific product listing, Canadian/Québec market evidence, or French name validation. |

## Next action

Keep malted rice flour inactive and unallocated. Reopen if a current Canadian or Québec-facing source identifies a standalone malted-rice-flour food product, distinguishes it from plain rice flour, rice malt syrup, and fermented rice malt/koji, and supports a Québec French product name. Then rerun ownership and picker checks. Research exact-form measurement and any recipe-specific substitution separately; do not infer them from plain brown rice flour, experimental malting conditions, or the two study formulas.

This documentation-only hold is recorded under the open A7 checklist. No shared catalog, ledger, recipe, or generated data changed, and no tests were run.
