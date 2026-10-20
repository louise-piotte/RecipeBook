# WP02 A4 malted barley flour measurement and substitution review — R549 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17; see the [R549–R551 integration README](../batches/wp02-wp03-wp04-r549-r551-gap-review-integration-20261017/README.md).
- **Scope:** Research reusable measurement and wheat-flour replacement evidence for the existing `ingredient-ref-malted-barley-flour`. Keep the accepted identity, aliases, category, and distinction from other barley and malt products unchanged.
- **Exact plan anchor:** The still-open WP02 Section A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) calls for the remaining barley-flour grades and malted/toasted distinctions. The identity-only malted-barley-flour item at [line 11225](../../RecipeBook-global-ingredient-catalog-plan.txt#L11253) is already checked. R549 addresses the outstanding evidence states for that existing identity; it does not close the parent or resolve other barley grades, malted/toasted identities, rye, oats, or rice.
- **New source ID:** `WP02-A4-MBF-SUB-R549-20261017-S01` was collision-free at review and is now attached to the existing malted-barley-flour ledger record. Existing IDs `WP02-S110`–`WP02-S113` remain attached to the malted-barley-flour identity and are reused without duplicate declarations; `WP02-S110`, `WP02-S112`, and `WP02-S113` are also shared by the roasted-barley-flour record for their boundary review. `WP02-S111` is attached to the malted-barley-flour record. No other source ID is allocated here.

## Recommendation

**Keep the identity and picker unchanged; record no reusable measure, density, mapping, conversion, or active substitution rule.** Set `measurementState` to `researched_no_supported_value` and `substitutionResearchState` to `researched_no_supported_substitute` for a reusable wheat-flour replacement across home-recipe types. Add no `measurementObservations`; add one evidence-only `substitutionFindings` entry that explicitly preserves the authors’ recommendation of 5% for their tested bread when proper malting, dough-development, and baking protocols are followed, and explains why that conditioned recommendation does not transfer to a general home-recipe rule.

The active reference remains `malted barley flour / farine d'orge maltée`, with English alias `malt barley flour`, no French aliases, category `FLOUR_AND_STARCH`, `defaultDensity: null`, and empty `unitMappings`. Keep the broad `malt flour` identity and other cereal-specific malted or roasted flours separate. Do not add diastatic/non-diastatic forms, a form conversion, a volume-to-mass mapping, a recipe link, a preferred substitute, a contextual rule, or a recipe-line substitution.

## Current catalog, source ownership, and prior work

At R549 review, the existing ledger record for `ingredient-ref-malted-barley-flour` had `identityState: verified`, while `measurementState` and `substitutionResearchState` were `not_yet_researched`; it had no measurement observations, substitution findings, or forms. Integration changed the two research states and added the finding below. The reference JSON still has null default density and no unit mappings. The global and contextual substitution-rule files remain empty.

| Existing source ID | Current owner/use | R549 handling |
|---|---|---|
| `WP02-S110` | OQLF’s `farine d'orge maltée` / `malt barley flour` terminology; also reused on the roasted-barley-flour row for the malted/roasted boundary. | Reuse for the current bilingual naming only; no new alias. |
| `WP02-S111` | CFIA Canadian Food Compositional Standards, currently attached to the malted-barley-flour row. | Reuse for the limited standardized-flour composition allowance; do not read it as a consumer recipe ratio. |
| `WP02-S112`, `WP02-S113` | Arva’s English and French product pages, attached to the malted-barley-flour row and reused on the roasted-barley-flour row as a boundary source. | Reuse only as manufacturer product evidence. The current page copy gives no household measure or replacement ratio. |
| `WP02-A4-MBF-SUB-R549-20261017-S01` | New source ID for Aslam et al.’s 2023 original research article. | Declared once on the existing malted-barley-flour ledger record; no second flour identity was created. |

The accepted identity work explicitly declined numeric data and diastatic/non-diastatic forms [plan line 11228](../../RecipeBook-global-ingredient-catalog-plan.txt#L11256). The completed whole-barley-flour measurement/substitution review, [R281](wp02-a4-whole-barley-flour-measurement-substitution-review-r281-20261016.md), covers a different row; its generic-barley, whole-barley, and roasted-barley observations or findings do not transfer to malted barley flour. No earlier proposal was found that specifically completes the malted-barley-flour row’s measurement and substitution research.

The current Arva product-page review uses the existing URL owners `WP02-S112` and `WP02-S113`, not duplicate source entries. Integration refreshed those existing source descriptions and access dates in place rather than minting another source ID for either URL. Root could not directly retrieve the French route during this review; its indexed 700 g package heading is retained as lower-confidence product context only and is not used as a measure or yield.

## Bilingual naming and picker projection

Retain the existing English display `malted barley flour`, French display `farine d'orge maltée`, and English alias `malt barley flour`. Keep French aliases empty. OQLF’s GDT entry pairs the preferred French term with the English term `malt barley flour`; the entry was last updated in 1984, so it is used for terminology, not current consumer-product or measurement claims [WP02-S110].

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns complete phrase matches before partial matches, and includes form terms in the reference projection. A static projection over current reference and form JSON gives:

| Query | Current result | R549 effect |
|---|---|---|
| `malted barley flour`; `farine d'orge maltée`; `malt barley flour` | The malted-barley-flour reference only. | No change. |
| `barley flour`; `farine d'orge` | Four references: general, malted, roasted, and whole barley flour. | Preserve these multi-result family queries. |
| `malt flour` | Six separate references, including generic malt flour and distinct cereal/malt products; not the malted-barley row. | Do not add this broad phrase as an alias. |
| `farine maltée` | Generic malt flour only. | Do not broaden the malted-barley row to this phrase. |
| `diastatic malted barley flour` | No result; the current product wording is not an alias or form term. | Keep this behavior; the Arva page describes its own currently sold diastatic product, not a catalog-wide form mapping. |

The French name’s accent-folded query continues to resolve through the unchanged full phrase. This is a static projection, not a live Android picker test.

## Bundled recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows** in the current bundled package. Searches over complete recipe text and all ingredient-row values for `malted barley flour`, `farine d'orge maltée`, `malt barley flour`, `malted barley`, `orge maltée`, and `ingredient-ref-malted-barley-flour` found **zero recipe-file hits and zero ingredient-row hits**. There is no bundled recipe line, recipe link, dish context, or recipe-specific measure supporting an active substitution. Arva’s product page lists external recipe suggestions, but none is a recipe in the bundled manifest, and the manufacturer page does not give a transferable replacement amount.

## Measurement, density, and conversion evidence

- The directly retrieved Arva English page names a **600 g** malted-barley-flour package and says its available version is diastatic [WP02-S112]. The French route was not directly retrievable during root review; its indexed page heading reports **700 g** and identifies the offered version as diastatic [WP02-S113]. The displayed package amounts conflict, and neither is a household volume or mass-per-volume measure. Do not add either package quantity as a measurement observation, density, yield, or unit mapping.
- Arva describes the product as germinated, dried, and ground barley, and distinguishes diastatic and non-diastatic product variants [WP02-S112, WP02-S113]. This is useful product-specific identity context; it does not define an app form or support transferring recipe behavior between variants.
- CFIA standard 12.1.1 permits malted barley flour at up to 0.50% of the flour in standardized white flour; standard 12.1.3 permits the same ceiling in whole-wheat flour [WP02-S111]. These are composition allowances for standardized flour, not a recipe ratio, consumer serving, or replacement recommendation.
- Aslam et al. report laboratory weighing in a bread experiment, including a flour blend of 100 g at the tested replacement levels [S01]. That is a controlled formula amount, not a household volume measure or transferable flour density. The paper supplies no cup mass, filling method, consumer-serving definition, or app unit mapping.

No reviewed source supports a reusable household measure, density, mass-volume conversion, generic portion, or package yield for the active identity. Keep `defaultDensity: null`, `unitMappings: []`, and `measurementObservations: []`. Under [Requirements FR-5](../../../Requirements.md#L322), weight-volume conversion requires an ingredient density or mapping; preserve the missing-density prompt rather than silently borrowing a neighboring barley-flour value.

## Substitution evidence and limits

The primary 2023 bread study by Aslam et al. produced its own malted barley flour from a named barley variety through steeping, germination, kilning/drying, and milling, then tested **0%, 2.5%, 5%, 7.5%, and 10%** malted-barley-flour replacement of wheat flour in one yeast-bread research formulation [S01]. The authors measured changes in dough water absorption, development time, stability, falling number, and bread quality; which sensory attribute scored best differed across levels. Their conclusion explicitly recommends **5% malted barley flour for acceptable breads when proper malting, dough development, and baking protocols are followed** [S01]. Preserve this as the authors’ conditioned recommendation for their bread experiment. The article’s method uses named barley and wheat varieties, a custom-malted flour, and a controlled yeast-bread formula and process; it does not establish that the same 5% level applies to other home bread formulas, an untested commercial flour, cakes, pastry, sauces, or other ingredient roles.

Arva describes diastatic and non-diastatic variants; its English page identifies a currently offered diastatic 600 g product [WP02-S112], while the French page’s indexed content reports a diastatic 700 g package [WP02-S113]. The French package detail is lower-confidence because root could not directly retrieve that route. These qualitative manufacturer statements do not supply a household amount or method adjustment, and do not establish that the study’s custom malt flour behaves like Arva’s product. The CFIA allowance for malted barley flour in standardized white and whole-wheat flour concerns flour composition rather than direct replacement of wheat flour in a recipe [WP02-S111].

Under [Requirements FR-5 and §6.5](../../../Requirements.md#L322), ingredient-to-ingredient substitutions must be contextual and matched to dish type, role, and method. The article supplies one conditioned 5% bread-study recommendation, but no bundle demand exists for this ingredient, the current catalog identity is not linked to the article’s experimentally prepared flour or process, and the study does not establish a reusable amount or adjustments across home recipes. Set the general reusable replacement conclusion to `researched_no_supported_substitute`, retain the authors’ recommendation as evidence in one finding, and add no global same-ingredient form conversion, contextual substitution rule, warning text, confidence level, rounding policy, preferred substitute, or recipe-line substitution link.

## Proposed ledger delta

The integration updated only the existing `ingredient-ref-malted-barley-flour` research record:

| Field | Proposed value |
|---|---|
| `identityState` | Keep `verified`. |
| `measurementState` | `researched_no_supported_value`. |
| `measurementObservations` | None. Do not record the conflicting package weights as measures. |
| `substitutionResearchState` | `researched_no_supported_substitute` for a reusable wheat-flour replacement across home-recipe types and roles. |
| Finding ID | `malted-barley-flour-no-general-wheat-substitute-r549-20261017` |
| Finding `researchState` | `researched_no_supported_substitute`. |
| Finding `context` | Whether unspecified malted barley flour has a reusable wheat-flour replacement amount across home-recipe dish types and ingredient roles, beyond the cited authors’ conditioned recommendation for their bread experiment. |
| Finding `basis` | The authors tested a custom-prepared malted barley flour in one controlled yeast-bread formula at 2.5%–10% replacement and explicitly recommended 5% for acceptable bread when proper malting, dough development, and baking protocols are followed. This is a source-backed recommendation for that study’s flour/formula/process, not a transferable home-recipe ratio. Current manufacturer descriptions are qualitative and product-specific. |
| Finding `limitations` | Preserve the 5% recommendation only as study-specific, conditioned evidence; do not encode it as a general ratio or active contextual rule. Do not infer water, leavening, fermentation-time, texture, or yield adjustments for home recipes; do not transfer the study to Arva’s product, non-diastatic malted barley flour, other malted/roasted cereal flours, or other bread formulas without matching flour and process evidence. |
| Finding `sourceIds` | Reused `WP02-S111`, `WP02-S112`, `WP02-S113`; new proposal-local `WP02-A4-MBF-SUB-R549-20261017-S01`. |

Add no measurement or substitution behavior to the ingredient reference package. Keep forms, density, mappings, conversions, recipe links, substitutions, aliases, and recipe-line data unchanged.

## Source register

New study evidence was accessed on **2026-10-17**. Reused source IDs remain owned by the existing ledger rows described above. The article source ID is now attached to the malted-barley-flour record.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-A4-MBF-SUB-R549-20261017-S01` | Aslam J. et al., [“Utilization of malted barley flour as replacement of wheat flour to improve technological, rheological, physicochemical, and organoleptic parameters of fortified breads”](https://doi.org/10.3389/fsufs.2023.1230374), *Frontiers in Sustainable Food Systems* 7 (2023), article 1230374, DOI 10.3389/fsufs.2023.1230374; published 27 September 2023. | Original research. Methods §§2.4–2.7 and Table 1 describe a custom-malted flour and one laboratory bread formula tested at 0%, 2.5%, 5%, 7.5%, and 10% replacement. The conclusion recommends 5% for acceptable bread subject to proper malting, dough development, and baking protocols. This is limited to the study’s flour/formula/process and does not define a reusable home-recipe ratio, household measure, or catalog rule. |
| Reused `WP02-S110` | OQLF, [farine d'orge maltée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee). | Pairs the French preferred term with English `malt barley flour`; last updated 1984. Terminology only. |
| Reused `WP02-S111` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 12, standards 12.1.1 and 12.1.3. | Allows up to 0.50% malted barley flour in specified standardized white and whole-wheat flours. This regulated flour-composition allowance is not a home recipe substitution rate, measure, or density. |
| Reused `WP02-S112` | Arva Flour Mills, [Malted Barley Flour](https://arvaflourmills.com/products/malted-barley-flour), current English product page. | Describes germinated/dried/ground barley and a currently offered diastatic product; lists a 600 g package. It gives no household measure or replacement amount. |
| Reused `WP02-S113` | Arva Flour Mills, [Farine d'orge maltée](https://arvaflourmills.com/fr/products/malted-barley-flour), French product page. | Uses the accepted French product wording and its indexed content reports a diastatic offering and 700 g package. Root could not directly retrieve this route; the package detail is lower-confidence, differs from the directly retrieved English page, and is not a household measure or replacement amount. |

## Verification and integration result

Re-read the current `AGENTS.md`, the relevant conversion and contextual-substitution requirements, the open WP02 A4 parent, the checked malted-barley identity checkpoint, the active reference/form/rule files, the target ledger row, and prior barley flour proposals. Rechecked source-ID and DOI ownership, static picker projection, and all manifest-listed recipe and ingredient rows. This ledger-only data integration required no software tests under `AGENTS.md`; none were run.

**Integration result:** Accepted with the study’s scope preserved. The ledger now records `researched_no_supported_value` for measurement and `researched_no_supported_substitute` for a general home-recipe wheat-flour replacement, along with the evidence-only finding above. The CFIA source entry now records the standardized-flour 0.50% composition allowances; Arva source entries were refreshed in place on both the malted- and roasted-barley records. No active density, measure, form, mapping, conversion, or substitution rule changed. The A4 parent remains open for the other barley grades and distinctions.
