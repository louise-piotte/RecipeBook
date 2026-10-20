# WP02 A6 — Sprouted Brown-Rice Flour Form Review (R250)

- **Reviewed:** 2026-10-16.
- **Status:** Recommend one source-bounded form under the existing brown-rice-flour reference.
- **Scope:** The flour made from sprouted brown rice. This is separate from the active whole-grain `sprouted brown rice / riz brun germé` identity and does not revisit WP02 R246's sprouted-sorghum picker hold.

## Recommendation

Add `sprouted brown rice flour / farine de riz brun germé` as the `sprouted` form of `ingredient-ref-brown-rice-flour`, using `ingredient-form-brown-rice-flour-sprouted`. Do not create a second flour reference. The Québec French phrase is directly present in a Québec retailer's ingredient declaration, while OQLF supports only the generic head term `farine de riz`; keep the compound display source-backed but provisional rather than calling it an OQLF ruling. [S04–S05]

Use `sprouted brown rice flour` and `farine de riz brun germé` as the form labels. Add only `germinated brown rice flour` as an English form match term, supported by primary flour research; leave French match terms empty. Keep the existing brown-rice-flour aliases unchanged and do not add `sprouted rice flour`, which loses the brown-rice qualifier. [S06]

## Live-catalog and archive audit

| Surface | Current state and finding |
|---|---|
| Active references and forms | `ingredient-ref-brown-rice-flour` is `brown rice flour / farine de riz brun`, category `FLOUR_AND_STARCH`, with French aliases `farine de riz complet` and `farine de riz brun complet`, no English aliases, null density, and no unit mappings. It has no forms. `ingredient-ref-sprouted-brown-rice` is already the separate whole-grain `sprouted brown rice / riz brun germé`, with `germinated brown rice` as its English alias; it has no forms. No active reference or form owns `sprouted brown rice flour`, `germinated brown rice flour`, or `farine de riz brun germé`. |
| Legacy identities | No legacy candidate owns the candidate names or proposed form. No legacy promotion or new reference ID is needed. |
| Research ledger | The ordinary brown-rice-flour record is identity-verified, with `researched_no_supported_value` measurement state and `not_yet_researched` substitution state. Its two Québec product portions (La Milanaise 1/3 cup/60 g and Cuisine Soleil 1/4 cup/31 g) are separate SKU observations, not a reusable flour measure. The sprouted-brown-rice record is for whole grains only: NOW's 1/4 cup/51 g and Walmart Canada's conflicting 1/4 cup/46 g are grain-package observations, and NOW's grain-to-grain replacement advice does not transfer to flour. There is no flour-specific ledger record or form record. |
| Bundled recipe demand | Scanned all 114 manifest-listed recipes and 1,123 ingredient rows. The proposed English and French phrases produced no recipe-file or ingredient-row hits; no row links to `ingredient-ref-brown-rice-flour`. |
| Current plan and roadmap | Section 04 A6 remains open for regional and other grain-flour review, including rice flour; Section A's rice source-grade family and Section B's alternative flour/starch families remain open at the parent level. The roadmap has the general instruction to execute the plan in reviewed batches but no sprouted-brown-rice-flour item. |
| Proposal and batch archive | The WP03 sprouted-brown-rice review explicitly says the grain row must not absorb `sprouted brown rice flour` and leaves the flour review to WP02; its batch adds only the grain identity. The WP02 brown-rice-flour source-grade integration and R115 `complet` alias review add no sprouted form. The WP02 sprouted-black-bean-flour review is a process-form precedent, not a rice decision. No prior WP02 proposal, batch, or R250 source-ID prefix reviews this flour form. |

## Picker behavior

Projected under the current exact-form-first, complete-phrase search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L96):

| Query | Expected result |
|---|---|
| `sprouted brown rice flour` | Existing brown-rice-flour reference with the sprouted form hint. |
| `farine de riz brun germé` | Existing brown-rice-flour reference with the sprouted form hint. |
| `germinated brown rice flour` | Existing brown-rice-flour reference with the sprouted form hint. |
| `sprouted brown rice`, `riz brun germé`, or `germinated brown rice` | Both the existing whole-grain sprouted-rice reference and the brown-rice-flour reference. The shorter grain phrase remains multi-result; the flour form is not allowed to take its whole-grain owner. |
| `brown rice flour` or `farine de riz brun` | The existing brown-rice-flour reference, without a sprouted form hint unless the complete form phrase was entered. |

Do not add a new base-reference alias for the full form phrase. Do not shorten the French label to `riz brun germé`, which already names the whole-grain product, or add the broad alias `sprouted rice flour`.

## Numeric, substitution, and use limits

- Well.ca lists One Degree's 680 g flour with a 1/4 cup (43 g) nutrition serving. One Degree's hosted brownie recipe gives 3/4 cup (107 g) of its sprouted brown-rice flour. Record these only as separate product/recipe-specific observations; do not average them, derive a household mapping, or populate density/unit mappings. [S03, S07]
- One Degree says its own sprouted brown-rice flour can replace regular brown-rice flour in recipes that call for it. The FAQ gives no explicit amount basis and warns against treating the gluten-free flour as a one-for-one replacement for gluten-containing flour or a gluten-free all-purpose blend. Keep this directional brand guidance in the ledger only; add no active global or contextual substitution. [S02]
- A primary study reports germination-time effects on flour hydration and pasting properties. Its experimental process and bread formulas do not establish a general measure or substitution ratio for retail flour. Do not transfer the existing whole-grain, ordinary brown-rice-flour, or laboratory values to this form. [S06]
- One Degree's product says it is not intended for raw consumption; Health Canada advises cooking flour before eating. Preserve this as source/use evidence only, not a claim that sprouting makes flour ready to eat. [S01–S02, S08]
- Add no recipe links, reusable measures, density, unit mappings, conversions, yields, or active substitution rules. The bundle has no matching demand.

## Source register

| ID | Source | Evidence and limit |
|---|---|---|
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S01` | One Degree Organics, [Organic Sprouted Brown Rice Flour](https://onedegreeorganics.com/products/organic-sprouted-brown-rice-flour/) (manufacturer). | Current product title and description establish a marketed sprouted brown-rice flour; product page says it is not intended for raw consumption. Product-specific, not a universal processing specification. |
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S02` | One Degree Organics, [Sprouted Flour FAQs](https://onedegreeorganics.com/sprouted-flour-faqs/) (manufacturer). | Describes its own wash, soak/sprout, gentle oven-dry, and milling sequence; supports source-specific flour-to-brown-rice-flour use advice and its stated limits. Do not generalize this process or substitution claim to all suppliers. |
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S03` | Well.ca, [One Degree Organics Sprouted Brown Rice Flour](https://well.ca/products/one-degree-organics-sprouted-brown_171302.html) (Canadian retailer). | Lists the 680 g product, organic sprouted brown rice as ingredient, and a 1/4 cup (43 g) serving. This is a retailer-displayed product serving, not a reusable measure. |
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S04` | La Moisson, [Pain 7 Grains Germés](https://lamoisson.com/products/pain-7-grains-germes) (Québec retailer). | Its French ingredient declaration names `farine de riz brun germé` in a 482 g multi-grain bread. This supports the Québec French compound in an ingredient list, not a standalone flour package or terminology ruling. |
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S05` | OQLF, [farine de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz) (GDT; updated 2025). | Defines the generic rice flour and notes that it can come from white or brown rice. It does not establish the complete sprouted-flour compound. |
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S06` | Cornejo and Rosell, [Influence of germination time of brown rice in relation to flour and gluten free bread quality](https://pmc.ncbi.nlm.nih.gov/articles/PMC4573127/), *Journal of Food Science and Technology* 52(10) (2015), 6591–6598, DOI 10.1007/s13197-015-1720-8. | Primary study reports germination-time effects on brown-rice-flour hydration and pasting properties. Its controlled samples and gluten-free bread formulas are not a Canadian product specification, serving measure, or general substitution rule. The phrase `germinated brown rice flour` supports the English form match term. |
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S07` | One Degree Organics, [Vegan Candy Cane Brownies](https://onedegreeorganics.com/recipe/vegan-candy-cane-brownies/) (brand-hosted recipe). | Ingredient list uses 3/4 cup (107 g) of One Degree sprouted brown-rice flour. Keep as one recipe-specific amount; it differs from Well.ca's 1/4 cup/43 g listing. |
| `WP02-A6-SPROUTED-BROWN-RICE-FLOUR-R250-S08` | Health Canada, [Safe handling of flour](https://www.canada.ca/en/health-canada/services/general-food-safety-tips/safe-handling-flour.html). | Advises that flour is raw and should be cooked before consumption. General handling guidance, not a product-specific measure or additional form. |

## Implementation boundary

If accepted, add one `sprouted` form under the existing brown-rice-flour reference and one form-level ledger record with the source-specific observations above. Keep the reference's aliases, null density, empty unit mappings, recipe links, and active substitution behavior unchanged. Do not modify the active catalog, forms JSON, ledger, plan, or roadmap from this proposal-only review.
