# WP02 A4 generic rice-flour family measurement and substitution review — R546 — 2026-10-17

## Review record

- **Reviewed and current source pages accessed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17; the family-level ledger conclusion and finding are recorded.
- **Scope:** Complete the still-open measurement and reusable wheat-flour substitution research for the existing family-level **rice flour / farine de riz** reference. Do not reopen its identity, expand its aliases, or merge it with white, brown, glutinous, pigmented, sprouted, or starch products.
- **Checklist anchor:** The open WP02 Section A4 parent at [the active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) still includes rice source-grain work. R290 covers the white-rice-flour row and R543 covers the unsprouted brown-rice-flour row. The active plan separately retains unqualified rice flour as a family-level discovery term [here](../../RecipeBook-global-ingredient-catalog-plan.txt#L2605). This proposal keeps the broader parent open.
- **Source ownership:** The generic row already owns WP02-S26, WP02-S27, and WP02-S77. The product servings and primary studies used for comparison are already owned by the white- and brown-rice-flour ledger rows, as itemized below. Reuse those existing source IDs if integrated; allocate no R546 source IDs and do not move sibling observations or findings onto the family row.

## Recommendation

**Add an evidence-only conclusion to the existing family-level ledger row and hold all generic numeric and substitution behavior.** If integrated:

- Set the row’s **measurementState** to **researched_no_supported_value**, meaning that reviewed evidence does not support a measurement reusable across the family.
- Set **substitutionResearchState** to **researched_no_supported_substitute** for a reusable wheat-flour replacement across recipe types.
- Add no measurement observation, density, unit mapping, ingredient form, conversion, yield, alias, recipe link, recipe-line substitution, or active substitution rule.

The conclusion is limited to the unqualified white/brown rice-flour family represented by the existing row. It does not assess glutinous, colored, sprouted, cultivar-specific, or other separately cataloged rice flours, and it does not apply to rice starch.

## Evidence and limits

The OQLF’s current GDT entry gives **farine de riz** as the preferred French term and **rice flour** as its English equivalent. It defines the flour as finely milled rice and says it can come from white or brown rice. This establishes the family boundary; it gives no volume-to-mass measure or wheat-replacement guidance. [WP02-S27]

Current product evidence is product-specific:

| Product/source | Reported amount | Evidence limit |
|---|---:|---|
| Bob’s Red Mill White Rice Flour, current manufacturer page [WP02-A4-WRF-R290-20261016-S01] | 1/4 cup (40 g) | One named white-rice product; the page does not specify the cup convention or filling method. |
| Bob’s Red Mill Flour Weight Chart, separate white-rice-flour row [WP02-B23-RESIDUAL-20261010-S05] | 1 cup (160 g) | Manufacturer chart observation; its general measurement guidance does not state this row’s fill method. Do not derive a family density or mapping. |
| La Milanaise Organic Whole Brown Rice Flour, MAPAQ Québec Food Directory [WP02-A4-BROWN-RICE-FLOUR-R115-S05] | 1/3 cup (60 g) | One named brown-rice SKU; the directory says it is not suitable for bread-making and suggests cookies and muffins. |
| Cuisine Soleil Organic Gluten Free Brown Rice Flour, MAPAQ Québec Food Directory [WP02-A4-BROWN-RICE-FLOUR-R115-S06] | 1/4 cup (31 g) | A separate named brown-rice SKU; the directory reports its own serving only. |

These amounts do not establish one measure for the white/brown family, a shared cup-filling method, or a density. Retain each observation on its current product-grade ledger row. Do not average the servings, normalize them into a conversion, or use them to fill a recipe line on the family row.

The substitution studies are formula-specific and point to different experimental contexts:

- Švec and Hrušková tested 5–30% white rice flour in wheat-flour bread and biscuit formulas. Their reported water-absorption, loaf-volume, and biscuit outcomes are results for those tested composites; the bread volume fell at the 30% treatment, while biscuit responses differed. This does not establish a transferable home-recipe ratio or hydration adjustment. [WP02-A4-WRF-R290-20261016-S02]
- Khoshgozaran-Abras et al. tested 5%, 10%, and 15% whole brown rice flour in one wheat-based Iranian Barbary flatbread formula. The 5% treatment was closest to the control and rated best in that study. It does not establish a general exchange amount for other breads, pastries, roles, or the family row. [WP02-A4-BRF-SUB-R543-20261017-S01]

The two studies do not support a single wheat-replacement rule across the white/brown family. Do not encode their tested percentages, water behavior, product outcomes, or the brown study’s 5% result as general guidance. Do not transfer either study to glutinous or other distinct rice flours. No bundled recipe supplies the missing dish, role, or method context.

A later contextual substitution rule would require a supported dish type, ingredient role, and method under [Requirements FR-5 and §6.5](../../../Requirements.md).

## Current catalog and ledger ownership

| Surface | Current state | R546 handling |
|---|---|---|
| Family reference | **ingredient-ref-rice-flour**, **rice flour / farine de riz**, empty English and French alias arrays, **FLOUR_AND_STARCH**, null default density, empty unit mappings. | Keep the reference and all fields unchanged. |
| Family ledger row | Identity verified; measurement and substitution states are both **not_yet_researched**. Existing sources are WP02-S26, WP02-S27, and WP02-S77. It has no measurement observations, substitution findings, or decisions about numeric behavior. | Add the bounded states and one no-general-wheat-substitute finding described below. Reuse existing source IDs for evidence; add no product observation. |
| White-rice-flour row | **ingredient-ref-white-rice-flour** is already **researched_no_supported_value** and **researched_no_supported_substitute**. Its R290 product observations and white-rice study remain attached to that row. | Do not copy its product measurements or formula finding as family-level facts. Cite the sources only to explain the family-level hold. |
| Brown-rice-flour row | **ingredient-ref-brown-rice-flour** is already **researched_no_supported_value** and **researched_no_supported_substitute**. R115’s two SKU servings and R543’s Barbary study remain attached there. | Do not transfer its servings, aliases, or study finding to the family row. |
| Forms and active rules | The generic row has no attached form. The existing sprouted form belongs to the brown-rice-flour row. The global and contextual substitution-rule files contain no active rice-flour rule. | Keep the sprouted form’s product-specific evidence in scope only for its current row; add no rule or form. |

Source-ID ownership for this proposal:

| Existing source IDs | Current ledger owner | Use in R546 |
|---|---|---|
| WP02-S26, WP02-S27, WP02-S77 | **ingredient-ref-rice-flour** | Existing family identity and boundary evidence. WP02-S27 is the direct OQLF support for the family-level name and white/brown scope. |
| WP02-A4-WRF-R290-20261016-S01, WP02-A4-WRF-R290-20261016-S02, WP02-B23-RESIDUAL-20261010-S05 | **ingredient-ref-white-rice-flour** | Cross-reference only for one white-product serving, its manufacturer chart row, and the white-rice replacement study. |
| WP02-A4-BROWN-RICE-FLOUR-R115-S05, WP02-A4-BROWN-RICE-FLOUR-R115-S06, WP02-A4-BRF-SUB-R543-20261017-S01 | **ingredient-ref-brown-rice-flour** | Cross-reference only for two brown-product servings and the one-formula Barbary study. |

The white and brown sources above already have source IDs and URL owners in the active ledger. If a generic-row finding needs its own source declarations, reuse those IDs and source metadata; do not mint duplicate IDs or URLs. Keep all existing source-specific observations attached to their current rows.

## Bilingual naming and picker projection

Retain the current display names and empty aliases. The OQLF-supported generic display remains **rice flour / farine de riz**; no new wording is needed for this evidence-only review.

The current search implementation normalizes accents and punctuation, prefers complete word-phrase matches, then falls back to partial matches. A static projection over current references and attached forms gives:

| Query | Current projection | R546 effect |
|---|---|---|
| rice flour; farine de riz | 12 rice-flour references: black glutinous, black, brown, generic, glutinous, Joshinko, Mochiko, red, roasted red, Shiratamako, white, and wild rice flour | Keep this broad family query unchanged; add no alias to any qualified row. |
| white rice flour; farine de riz blanc | White rice flour only | No naming change. |
| brown rice flour; farine de riz brun; farine de riz complet | Brown rice flour only | Keep the existing French aliases on the brown row; do not move them to the generic row. |
| glutinous rice flour | Four distinct glutinous-flour rows | Keep them separate from the OQLF white/brown family conclusion. |
| rice starch; amidon de riz | Four distinct starch rows | Keep rice starch separate from rice flour. |

This is a static projection of current catalog data and matching logic, not an Android picker test.

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows** in the current bundled package. Searches across serialized recipe files and ingredient rows for rice flour, farine de riz, the generic/white/brown reference IDs, white- and brown-rice flour names, glutinous rice flour, and rice-starch wording found **zero recipe-file hits, zero ingredient-row hits, and zero direct reference links**. The bundle supplies no recipe-specific measure or dish context for a reusable replacement rule.

## Proposed ledger data

If accepted, update only **ingredient-ref-rice-flour** in the research ledger:

| Field | Proposed value |
|---|---|
| measurementState | researched_no_supported_value |
| Measurement observations | None. Keep the current white- and brown-product observations on their existing rows. |
| substitutionResearchState | researched_no_supported_substitute |
| Finding ID | rice-flour-family-no-general-wheat-substitute-r546-20261017 |
| Finding research state | researched_no_supported_substitute |
| Finding context | Whether unqualified rice flour, covering the white- and brown-rice source grades identified by OQLF, has a reusable wheat-flour replacement across recipe types and ingredient roles. |
| Finding basis | Current Québec product servings are SKU-specific. The white- and brown-rice studies test distinct formulas and do not establish a shared family-level replacement amount or hydration adjustment. |
| Finding limitations | Do not encode a tested percentage or water adjustment as general guidance; do not transfer evidence to glutinous, pigmented, sprouted, or other distinct rice-flour rows or to rice starch; do not create an active substitution rule without supported dish, role, and method context. |
| Finding source IDs | WP02-S27; WP02-A4-WRF-R290-20261016-S02; WP02-A4-BRF-SUB-R543-20261017-S01 |
| Decisions | Add two accepted evidence decisions: no family-wide measure and no reusable family-wide wheat replacement. |

Add no replacements to the finding. Leave density null and unit mappings empty. Do not add a form, conversion, yield, alias, recipe link, recipe-line substitution, or active global/contextual rule.

Proposed decision reasons and source IDs:

- **Measurement:** The OQLF-defined row spans white- and brown-rice flour, while the current portion evidence belongs to named products on separate source-grade rows and reports distinct serving conventions. None establishes an identity-wide measure, density, or mapping. Cite WP02-S27, WP02-A4-WRF-R290-20261016-S01, WP02-B23-RESIDUAL-20261010-S05, WP02-A4-BROWN-RICE-FLOUR-R115-S05, and WP02-A4-BROWN-RICE-FLOUR-R115-S06.
- **Substitution:** The reviewed white- and brown-rice primary studies test different bounded formulas and do not establish a transferable wheat-replacement amount across the family. Cite WP02-S27, WP02-A4-WRF-R290-20261016-S02, and WP02-A4-BRF-SUB-R543-20261017-S01. The separate finding above carries the same narrow scope and limitations.

## Source register

The existing source records below were reopened on **2026-10-17**. Their current ledger ownership and original record dates are retained.

| Source ID and owner | Source and locator | Supports and limits |
|---|---|---|
| WP02-S27 — generic family row | OQLF, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), updated 2025; definition, note, preferred term, English translation. | Defines the family as finely milled rice and states it may come from white or brown rice. Supports bilingual family scope only; no measure or replacement claim. |
| WP02-A4-BROWN-RICE-FLOUR-R115-S05 — brown row | MAPAQ, [La Milanaise Organic Whole Brown Rice Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204185), product description, serving fields, and suggested uses. | One SKU reports 1/3 cup (60 g) and suggests cookies and muffins. Not a generic measure or a transferable bread-substitution claim. |
| WP02-A4-BROWN-RICE-FLOUR-R115-S06 — brown row | MAPAQ, [Cuisine Soleil Organic Gluten Free Brown Rice Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223778), nutrition serving and product fields; page updated 2026-07-24. | One separate SKU reports 1/4 cup (31 g). Not a generic measure or shared mapping. |
| WP02-A4-WRF-R290-20261016-S01 — white row | Bob’s Red Mill, [White Rice Flour](https://www.bobsredmill.com/product/white-rice-flour), current product description and Nutrition Facts. | Current page reports 1/4 cup (40 g) for its named white-rice product. It states neither a row-specific fill method nor a general replacement amount. |
| WP02-B23-RESIDUAL-20261010-S05 — white row | Bob’s Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart), White Rice Flour row. | Lists 1 cup (160 g) for its chart row. Keep it chart- and product-specific; the row’s fill method is unstated. |
| WP02-A4-WRF-R290-20261016-S02 — white row | Švec and Hrušková, [Characteristics of Bread and Biscuit Made With Wheat and Rice Flour Composites](https://archive.conscientiabeam.com/index.php/58/article/view/348), *Journal of Food Technology Research* 1(2) (2014), 156–163; DOI [10.18488/journal.58/2014.1.2/58.2.156.163](https://doi.org/10.18488/journal.58/2014.1.2/58.2.156.163). | Primary study of white-rice-flour partial replacement in specific wheat-bread and biscuit formulas at 5–30%. Does not establish a reusable household ratio or hydration adjustment. |
| WP02-A4-BRF-SUB-R543-20261017-S01 — brown row | Khoshgozaran-Abras et al., [Effect of brown rice flour fortification on the quality of wheat-based dough and flat bread](https://pmc.ncbi.nlm.nih.gov/articles/PMC4190248/), *Journal of Food Science and Technology* 51(10) (2014), 2821–2826; DOI 10.1007/s13197-012-0716-x. | Primary study tests whole brown rice flour at 5%, 10%, and 15% in one Iranian Barbary flatbread formula. The 5% treatment was closest to control and highest-rated tested level. This is not a general home-recipe ratio. |

## Verification record

Re-read the current AGENTS.md, relevant Requirements.md conversion and substitution requirements, active WP02 plan and roadmap, live reference/form/rule files, and relevant family, white-rice, and brown-rice ledger rows. Reviewed R290 and R543 to avoid duplicating their row-specific evidence. Reopened the OQLF, MAPAQ, manufacturer, and primary-study sources; checked current source-ID ownership; projected bilingual picker matches from current catalog data and search logic; and scanned the manifest-listed recipe package. This proposal changes no shared catalog, ledger, plan, roadmap, recipe, or rule file. It is proposal-only, so no software tests, build, or emulator checks were run.

## Integration boundary

Integrate only the bounded evidence states and finding on the existing family-level ledger row if accepted. Keep WP02 Section A4 open for the remaining checklist work and retain the white/brown source-grade, glutinous-flour, and rice-starch boundaries.


## Integration result

The generic ingredient-ref-rice-flour ledger row now records researched_no_supported_value for measurement and researched_no_supported_substitute for reusable wheat-flour replacement. Its evidence-only finding cites the OQLF family scope and the existing white- and brown-rice study sources. Product observations remain on their source-grade rows; no measure, density, mapping, form, conversion, yield, alias, recipe link, or active substitution rule was added. The Section A4 parent remains open. See the [R546–R548 integration README](../batches/wp02-wp03-wp04-r546-r548-gap-review-integration-20261017/README.md).
