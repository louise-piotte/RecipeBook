# WP03 Section F R177 — wild-rice dry/cooked form review (2026-10-16)

## Review record

- **Status:** Proposal-only at authoring. No shared catalog, research ledger, plan, roadmap, batch, recipe, or application files had been changed by the reviewer.
- **Open plan item:** [Section F, dry versus cooked forms for remaining grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L3486). Generic rice has dry/cooked forms; this review considers only state forms on the existing wild-rice identity.
- **Scope:** Whether dry and cooked wild rice should be represented as forms of `ingredient-ref-wild-rice`; bilingual labels, identity and picker ownership, bundled demand, portion evidence, and numeric/substitution boundaries.
- **Recommendation:** Add bilingual dry and cooked forms to `ingredient-ref-wild-rice`, without match terms, densities, active measures, conversions, yield, substitutions, or recipe links. Keep the forms attached to the distinct wild-rice identity; do not extend ordinary-rice forms or imply that wild rice is *Oryza sativa*. Keep measurement research open pending direct inspection of the 2026 CNF food-name and measure-weight rows.

## Why this is a distinct state review

The active identity is `wild rice / riz sauvage`, a separate `GRAIN_AND_CEREAL` ingredient. The OQLF pairs those English and Québec French names, and Ontario's agriculture ministry distinguishes *Zizania* wild rice from ordinary *Oryza sativa* rice [existing `WP03-S12`, `WP03-S13`]. The current generic-rice dry/cooked forms therefore do not automatically apply to wild rice. This proposal tests a state distinction within the already integrated wild-rice product, not a rice-type × state matrix.

Health Canada's bilingual CNF 2015 names separately identify wild rice as **dry / sec** and **cooked / cuit**. A Health Canada recipe also measures wild rice before cooking and then cooks it with barley until both grains are cooked [S01–S03]. Those sources support two useful state labels. They do not establish a universal preparation method, a raw-to-cooked conversion, or a reusable yield.

The bundle has no matching wild-rice recipe demand. The recommendation is limited to state vocabulary evidenced in Canadian sources and does not claim a corpus need or justify numeric conversion behavior.

## Ownership, archive, and collision audit

The read-only live snapshot contains **1,551 references, 120 forms, 61 legacy candidates, and 1,896 research-ledger records**. The search projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, punctuation, and spacing; matches complete phrases over reference and attached-form terms; and returns a form hint only for an exact complete form label.

| Surface | Current owner or evidence | R177 result |
|---|---|---|
| Base wild-rice identity | `ingredient-ref-wild-rice` owns `wild rice / riz sauvage`; category `GRAIN_AND_CEREAL`; no aliases, density, or unit mappings. Its ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. | Keep the existing identity and ledger states. Attach any accepted forms only to this reference. |
| Nearby product identities | `ingredient-ref-wild-rice-blend` owns `wild rice blend / mélange de riz sauvage`; `ingredient-ref-puffed-wild-rice` owns `puffed wild rice / riz sauvage soufflé`; `ingredient-ref-wild-rice-flour` owns `wild rice flour / farine de riz sauvage`. Ordinary rice remains under `ingredient-ref-rice`. | Keep blends, puffed preparation, flour, ordinary rice, and plain wild rice separate. No new identity or alias is proposed. |
| Existing forms | `ingredient-ref-rice` owns `dry rice / riz sec` and `cooked rice / riz cuit`. No form belongs to `ingredient-ref-wild-rice`; no active form label or match term contains `wild rice` or `riz sauvage`. | Do not transfer generic-rice forms. Proposed forms have distinct qualified labels and IDs. |
| Legacy imports | The 61 legacy candidates contain no wild-rice or state-qualified wild-rice candidate. | No legacy ID or normalized term is reassigned. |
| Ledger and source allocation | The ledger already uses `WP03-S12` for OQLF and `WP03-S13` for OMAFRA. It has no wild-rice dry/cooked form record and no source URL for CNF food codes 4449 or 4450 or the Health Canada recipe below. The proposal-local IDs `WP03-WILDRICE-FORMS-R177-20261016-S01` through `S04` are unused in the ledger. | Reuse `WP03-S12` and `WP03-S13` as existing identity evidence. Keep the new source IDs proposal-local unless root elects to add ledger provenance. |
| Prior reviews | The archive includes the pure wild-rice identity review, a separate wild-rice-blend review, and the puffed-wild-rice identity review. The puffed-wild-rice review cites dry wild-rice recipe input only as raw material for puffing. No focused dry/cooked wild-rice form decision was found. R175's Red River Cream of Whole Wheat review and R176's Bistro Express brown-rice product boundary are separate candidates. | This is a new state-form question. It does not reopen those identity/product decisions or R174's hulless-oat/oat-rice review. |

### Picker projection

| Query | Current result | With proposed forms |
|---|---|---|
| `wild rice` / `riz sauvage` | Plain wild rice, wild-rice blend, puffed wild rice, and wild-rice flour family results. | Same reference results; the attached forms do not create new ingredient identities. |
| `wild rice, dry` / `riz sauvage, sec` | No exact form phrase. | `ingredient-ref-wild-rice`, with dry-form hint for the complete label query. |
| `wild rice, cooked` / `riz sauvage, cuit` | No exact form phrase. | `ingredient-ref-wild-rice`, with cooked-form hint for the complete label query. |
| `cooked rice` / `riz cuit` | `ingredient-ref-rice` with its cooked form. | Unchanged. The qualified wild-rice labels do not broaden generic-rice ownership. |
| `wild rice blend`, `puffed wild rice`, `wild rice flour` and French equivalents | Their separate active identities. | Unchanged. No proposed match terms or aliases create overlap. |

The query projection is static against the live catalog and implementation; no runtime picker was launched.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for `wild rice`, `riz sauvage`, the wild-rice reference ID, and state-qualified English/French phrases. Results:

| Audit result | Count |
|---|---:|
| Files containing candidate wild-rice terms or ID | 0 / 114 |
| Matching structured ingredient rows | 0 / 1,123 |
| Direct links to the wild-rice reference or a proposed form | 0 |

No bundled recipe link or recipe-text change is proposed. Health Canada's external recipe is evidence of a Canadian dry-input-to-cooked-use context, not bundled-corpus demand.

## Proposed form labels and numeric boundaries

| Proposed form ID | Form code / prep state | English label | fr-CA label | Match terms | Form density |
|---|---|---|---|---|---|
| `ingredient-form-wild-rice-dry` | `dry` / `dry` | `wild rice, dry` | `riz sauvage, sec` | None | `null` |
| `ingredient-form-wild-rice-cooked` | `cooked` / `cooked` | `wild rice, cooked` | `riz sauvage, cuit` | None | `null` |

Use the complete bilingual labels as names. Do not add `dry`, `cooked`, `sec`, or `cuit` as aliases or broad match terms; those words alone do not identify wild rice. Keep reference density `null` and unit mappings empty.

Health Canada's 2015 CNF online pages report these food-specific portion entries:

| CNF 2015 record | Source-reported values | Boundary |
|---|---|---|
| Food code 4449, wild rice, dry / *Grains céréaliers, riz sauvage, sec* | 100 mL = 67.6 g; 250 mL = 169.1 g; “amount to make 125 mL” = 32.5 g. | Edition- and food-code-specific source observations. “Amount to make” is not a measured cooking yield. |
| Food code 4450, wild rice, cooked / *Grains céréaliers, riz sauvage, cuit* | 100 mL = 69.3 g; 125 mL = 86.6 g; 250 mL = 173.3 g. | Edition- and food-code-specific source observations; no packing or preparation method is supplied on the serving page. |

Health Canada identifies the serving pages as part of the **2015 CNF** and says it will not update that online publication while making the **2026 CNF** available as relational files [S03]. The 2026 dataset listing includes Food Name and Measure Weight Conversion resources, but their wild-rice rows were not inspected for this proposal. Do not activate any 2015 portion as a default measure, density, unit mapping, or conversion. Do not compare the dry and cooked portion masses to infer a yield: the entries are different serving descriptions, not paired preparation measurements.

The Canada.ca recipe lists **125 mL (½ cup) wild rice** with barley, 250 mL each broth and water, and a 30-minute covered simmer until both grains are cooked but firm [S02]. Its grain amount is an input to one mixed-grain method. The recipe provides no wild-rice-only cooked mass, final volume, or yield. Do not transfer its method or mixed output into a general cooking conversion.

## Substitution boundary

No reviewed source establishes a safe or culinary-equivalent substitute for wild rice, or an exchange amount for ordinary rice, wild-rice blends, or another grain. Add no global form conversion or contextual ingredient substitution. Keep `substitutionResearchState` unchanged and do not add recipe-line substitution links.

## Source register

Sources checked 2026-10-16. Existing `WP03-S12` and `WP03-S13` are reused for identity context; the following source IDs are local to this proposal and are not shared-ledger records.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-S12` (existing) | Office québécois de la langue française, [GDT: riz sauvage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage). | Pairs Québec French `riz sauvage` with English `wild rice` and describes the food. It does not define dry/cooked measures. |
| `WP03-S13` (existing) | Ontario Ministry of Agriculture, Food and Rural Affairs, [Wild rice](https://www.omafra.gov.on.ca/CropOp/fr/field_grain/spec_grains/wiri.html). | Supports keeping *Zizania* wild rice distinct from ordinary *Oryza sativa* rice. It does not establish forms or culinary conversions. |
| `WP03-WILDRICE-FORMS-R177-20261016-S01` | Health Canada, [CNF 2015 wild rice, dry, food code 4449](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4449). | Provides the bilingual dry-state descriptor and historical food-code-specific portions listed above. It does not establish a reusable dry measure or cooking yield. |
| `WP03-WILDRICE-FORMS-R177-20261016-S02` | Health Canada, [CNF 2015 wild rice, cooked, food code 4450](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4450). | Provides the bilingual cooked-state descriptor and historical food-code-specific portions listed above. It does not establish a reusable cooked measure or packing method. |
| `WP03-WILDRICE-FORMS-R177-20261016-S03` | Health Canada, [Salade d'orge rôtie et de riz sauvage](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/recettes/salade-orge-rotie-riz-sauvage.html). | Québec-facing federal recipe shows dry wild rice measured as a raw ingredient and cooked with barley until both are done. It is a mixed recipe and supplies no isolated yield. |
| `WP03-WILDRICE-FORMS-R177-20261016-S04` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Identifies CNF as bilingual Canadian food-composition data and says 2015 online remains interim while CNF 2026 is provided as relational files. It does not establish a specific 2026 wild-rice row. |
| `WP03-WILDRICE-FORMS-R177-20261016-A01` | Project audit: current references and forms, legacy IDs, ledger source IDs/URLs and wild-rice record, focused proposal/batch archive, `IngredientSearch.kt`, and manifest-listed recipes. | Read-only ownership, archive, picker, source-collision, and corpus audit. |

## Disposition

Recommend two bilingual state forms on the existing `ingredient-ref-wild-rice`. Keep all match terms, form densities, active measurements, conversions, yields, substitutions, and recipe links empty. Retain the existing identity and measurement ledger state. The source-specific CNF 2015 values remain historical observations only; inspect the 2026 CNF rows before any measurement-state change. This proposal addresses one unresolved Section F form question and does not close the wider grain-state checklist.


## Integration outcome

Root accepted the two bilingual forms and reused the existing CNF-overview source record for the CNF 2026 availability note. CNF 2015 portion values remain narrative source context only; no measures or conversions were activated. See the R177 integration README.
