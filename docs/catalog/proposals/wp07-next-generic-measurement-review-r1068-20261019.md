# WP07 R1068 — Generic almond-extract measurement review

**Accessed:** 2026-10-19

**Disposition:** bounded no-supported-value result for the reviewed sources; retain the current null density, empty unit mappings, and `researched_no_supported_value` state.

## Scope and recommendation

Review the accepted generic `ingredient-ref-almond-extract` for a transferable household measure, portion, density, unit mapping, conversion, edible yield, or count-weight relationship. The reference is a distinct baking ingredient with verified identity and ten recipe links. It is not covered by the R1061 jackfruit-seed or R1062 Matsumae-zuke reviews, and does not overlap the current R1063 milling or R1065 substitution assignments.

The reviewed primary and authoritative sources do not publish a mass for an almond-extract household volume, a source-neutral density, an edible yield, a count-weight relation, or a standard portion. The CFIA definition limits the product’s source and minimum flavouring strength but leaves the preparation’s overall formulation unstandardized beyond that limit. Health Canada’s accessible 2008 common-food reference has no almond-extract row. USDA SR28 Food Group 02 contains vanilla-extract rows, not an almond-extract row; vanilla values cannot be transferred. Health Canada lists CNF 2026 food-name and measure-weight files as current, but those file downloads were inaccessible in the browser review, so this proposal makes no claim about their almond-extract rows.

Recommend no ledger or bundled-catalog mutation. Preserve `measurementState: researched_no_supported_value`, `defaultDensity: null`, and `unitMappings: []`; add no measurement observation, form, conversion, yield, or recipe quantity. If the CNF 2026 files can later be retrieved and joined, they can be checked as a follow-up before making any broader absence claim.

## Current record and recipe demand

The live seed row is `ingredient-ref-almond-extract` (`almond extract` / `extrait d'amande`), category `BAKING_AND_SPICE`, with the accepted aliases `almond essence`, `almond flavour`, `essence d'amande`, and `préparation aromatisante à l'amande`. Its density is null and its unit mappings are empty.

The ledger already records `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Its three existing sources cover Canadian standardized naming/composition and Québec terminology, not a measure. A prior accepted decision removed source-less draft density and mapping values and requires exact source, food/form, unit convention, and basis before restoring a measurement.

The bundled recipe corpus contains **10 linked ingredient rows in 9 recipe files**: four lines say `1 tsp`, five say `1/2 tsp`, and one says `1/8 tsp`. These are original recipe amounts, not weighed portions or measurement studies. Keep each recipe quantity unchanged and do not turn recipe use into a generic extract conversion.

## Evidence review

| Source and locator | Identity, preparation, and portion basis checked | Finding and limit |
|---|---|---|
| CFIA, [Canadian Food Compositional Standards, Volume 9](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), sections 9.1.1–9.1.6. | Section 9.1.1 defines named extracts/essences as solutions in ethyl alcohol, glycerol, propylene glycol, or combinations, and allows water and a sweetening agent. Section 9.1.2 distinguishes artificial/imitation extracts and essences; sections 9.1.3–9.1.4 distinguish flavour preparations and their artificial/imitation variants. Section 9.1.3 allows sweetener, water, and edible vegetable oil. Section 9.1.6 names almond extract/essence/flavour and specifies kernels of bitter almond, apricot, or peach plus at least 1% by volume hydrocyanic-acid-free volatile oil. | This is the strongest exact generic identity/composition source. It specifies no complete recipe, solvent proportions, household measure, portion mass, density, or mass-volume relation. The minimum volatile-oil fraction is not the density of the whole preparation. Keep artificial/imitation qualifiers distinct. The already-owned source `WP02-VEX-20261009-S01` supports identity only; no measurement observation is proposed from it. |
| Health Canada, [Nutrient Value of Some Common Foods (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html), introduction and full HTML food tables. | The introduction states that values use reasonable average household measures of ready-to-eat foods and that this edition emphasizes mixed dishes, with ingredient details in the CNF. A full-page search for “almond extract” and “almond essence” returned no match. | No almond-extract household measure appears in this accessible 2008 reference. This is a bounded negative result for that publication, not for every CNF release. |
| USDA ARS, [Standard Reference Release 28, Food Group 02: Spices and Herbs](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf), full 158-page report; extract records on printed pages 142–146. | Full-report text search for “almond” returned no match. The report includes separate vanilla-extract records (NDB 02050 and imitation variants 02051/02052); those records concern vanilla, not almond. | No almond-extract food code or portion is published in this report. Do not transfer the vanilla-extract observation `4.2 g per 1 tsp` (`WP07-VANILLA-EXTRACT-20261013-S01`), which is owned by `ingredient-ref-vanilla-extract` and expressly limited to USDA SR28 NDB 02050. The shared SR28 report URL is already cited for other ingredient records; this review proposes no additional source ownership for it. |
| Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), sections “Data in the Canadian Nutrient File” and “2015 CNF online”; [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). | The current overview says CNF 2026 is distributed as relational CSV files and the 2015 online interface remains as an interim route. The current dataset page lists both a Food Name CSV and a Measure Weight Conversion CSV. | The 2026 files could not be inspected through the available browser route: the Open Canada dataset/resource returned HTTP 403. The 2015 CNF page exposes a search form, but the available browser view did not return an exact almond-extract result. No conclusion about the contents of the current 2026 food-name/measure join is made. |

The OQLF source already owned by the almond-extract row, [“extrait d’amande”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095057/extrait-damande), is a terminology record and contains no measurement evidence. It remains identity-only.

## Source ownership and transferability audit

- The almond-extract ledger row currently owns `WP02-VEX-20261009-S01` (CFIA standard), `WP02-VEX-20261009-S02` (CFIA French regulatory-reference summary), and `WP02-VEX-20261009-S05` (OQLF terminology). All three are identity/name evidence; none reports a household measure.
- `WP07-VANILLA-EXTRACT-20261013-S01` and its 4.2 g per teaspoon observation remain on the vanilla-extract row for USDA SR28 NDB 02050. The observation explicitly says it is not a general density, volume conversion, or universal extract value. It is not transferable to almond extract.
- Existing SR28 Food Group 02 source entries are attached to other ingredient records, including dried oregano, dried thyme, garlic powder, ground cinnamon, and vanilla pod. This review adds no duplicate source or source ID because the report yields no almond measurement.
- The Health Canada CNF overview and NVSCF pages are already cited on other research-ledger records for their relevant metadata or ingredient rows. They are not assigned new almond-extract source IDs here because no exact measurement observation resulted.
- No manufacturer, brand, product-line, retailer, or recipe measurement is used as a generic almond-extract measure. No existing branded identity or value is changed, removed, or generalized.

## Search log

Queries and page inspections were performed on 2026-10-19. A result not found in a bounded search is not treated as proof that it does not exist.

| Query or inspection | Result and bound |
|---|---|
| `site:fdc.nal.usda.gov "almond extract"` | No exact generic USDA FoodData Central row surfaced in accessible search results. This does not establish that the complete live FDC database lacks such a record. |
| `site:ars.usda.gov "almond extract" "SR Legacy"` | No exact USDA SR Legacy almond-extract record surfaced. Followed with a full-text search of USDA ARS SR28 Food Group 02; no “almond” match was returned. |
| `"Extracts, almond" USDA FoodData Central SR Legacy` | No primary USDA food-code row or portion found in accessible results. Excluded secondary aggregators’ numerical entries because they did not expose an exact authoritative record and can conflate extract types. |
| `"almond extract" "Canadian Nutrient File"` | No exact official CNF food-code result surfaced in search results. The current 2026 dataset is available as CSV according to Health Canada, but the linked Open Canada file route returned 403 in this review. |
| `site:aliments-nutrition.canada.ca/cnf-fce "almond extract"` | The official CNF 2015 search page was identified; its interactive search form could not be submitted through the available browser tool. No exact 2015 row is asserted. |
| Health Canada NVSCF 2008 full-page search for `almond extract` and `almond essence` | No match. The page states that this 2008 edition emphasizes mixed dishes and that detailed ingredient information is in the CNF. |
| CFIA Volume 9 review of 9.1.1, 9.1.3, 9.1.6 | Exact preparation identity and minimum volatile-oil requirement checked. No portion, density, or conversion is specified. |
| USDA SR28 Food Group 02 PDF full-text search for `almond`; locator check around vanilla-extract rows | No almond match; vanilla entries are exact vanilla identities only and remain nontransferable. |

## Final disposition

Keep `ingredient-ref-almond-extract` and its recipe links unchanged. Keep `measurementState: researched_no_supported_value`, `defaultDensity: null`, and `unitMappings: []`. Add no ledger source, observation, conversion, form, edible yield, count-weight relation, or recipe quantity. This is a bounded no-supported-value result for the sources inspected; the current CNF 2026 food-name and measure rows remain unchecked because their download route was inaccessible. No software tests were run because this is a proposal-only evidence review.
