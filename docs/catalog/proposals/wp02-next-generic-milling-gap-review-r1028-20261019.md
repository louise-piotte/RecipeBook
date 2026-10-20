# WP02 Section A7 R1028: barley bran flour identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog JSON, ledger, plan, roadmap, recipes, generated files, or tests were changed.
- **Open-plan anchor:** WP02 Section A7 remains open for review of other grain meals and milling products, including the unresolved generic wheat-meal question ([catalog plan, A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** Generic culinary **barley bran flour**, a bran-derived milling ingredient named directly in primary bread and human-diet studies.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference, `barley bran flour / farine de son d’orge`. Keep the French compound descriptive and provisional for Québec. Add no aliases, forms, reusable measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. Do not research or add brands, product lines, flavours, SKUs, or retailer variants. Commercial-product counts do not add ingredient diversity.

## Identity boundary and bilingual naming

The candidate is the food ingredient explicitly named **barley bran flour** in a primary bread-quality study and a human-diet intervention study [S01–S02]. The evidence establishes use of the named ingredient in human food, but it does not provide a universal particle-size threshold, milling specification, composition, barley cultivar, or retail grade. Keep the identity limited to the source-named barley-bran flour class. Do not infer that every ground barley bran, bran-rich barley flour, or powder labelled only `barley bran` is necessarily the same ingredient.

Keep the candidate separate from these current identities:

- **`ingredient-ref-barley-bran` — barley bran / son d’orge.** This is the existing bran identity. Preserve its name, source ownership, verified identity, and existing measurement/substitution findings. The reviewed flour studies do not justify adding `barley bran flour`, `ground barley bran`, or `barley bran powder` as aliases to it.
- **`ingredient-ref-barley-flour` — barley flour / farine d’orge.** This is flour from barley grain, not a flour made from barley bran. Preserve its aliases and source-scoped measurement and formula findings.
- **`ingredient-ref-whole-barley-flour`, `ingredient-ref-malted-barley-flour`, `ingredient-ref-roasted-barley-flour`, and `ingredient-ref-roasted-barley-malt-flour`.** These are existing whole-grain, malted, or roasted barley-flour identities. Do not transfer their source-specific claims or merge their names into this candidate.
- **`ingredient-ref-barley-middlings`, barley germ, barley grits, barley semolina, barley starch, and extracted barley beta-glucan.** These retain their existing milling or ingredient boundaries.
- **`ingredient-ref-oat-bran-flour`, `ingredient-ref-corn-bran-flour`, `ingredient-ref-rice-bran-flour`, and `ingredient-ref-tartary-buckwheat-bran-flour`.** These existing bran-flour identities remain cereal-specific. Their existence supports keeping flour made from bran distinct from unqualified bran, but their measurements and behaviors do not apply to barley.

Use **farine de son d’orge** as a transparent descriptive French display. Santé Canada’s French list uses **son d’orge** for the barley-bran ingredient; OQLF defines **son** as a cereal-milling term. Neither source attests the compound **farine de son d’orge** as a preferred Québec term. Keep the proposed French display provisional and both alias arrays empty pending exact Québec terminology evidence [reused S03–S04]. Do not replace it with the existing **farine d’orge**, which belongs to barley flour.

## Ownership and recipe-demand audit

Read-only repository audit on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,038** active rows. No exact `barley bran flour`, `barley-bran flour`, `barley bran powder`, `farine de son d’orge`, or proposed ID `ingredient-ref-barley-bran-flour` owner was found. Nearby owners include barley bran, barley flour, whole barley flour, roasted and malted barley flours, barley middlings, and barley germ. | The candidate identity is unowned. Add a distinct row only if accepted; preserve every existing reference and alias. |
| Ingredient forms | **205** forms. No form, match term, or form owner refers to barley bran flour; the existing barley-bran reference has no attached form. | Add no form. The proposal is a separately named milling ingredient, not a cooking-state form of barley bran. |
| Research ledger | **2,443** records. No candidate record, exact candidate name, candidate ID, or R1028 source ID exists. The existing barley-bran record is identity-verified with `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`; its six sources and findings remain on that owner. The existing barley-flour record separately owns its 17 sources and its own source-scoped evidence. | If accepted, create a separate candidate record and source IDs. Reuse existing Health Canada and OQLF sources only for their narrow terminology claims; do not copy or broaden their source ownership or any state, quantity, or finding from barley bran or barley flour. |
| Legacy import identities | **55** candidates. No exact proposed ID or English/French candidate wording was found. | No legacy promotion, merge, or alias transfer is proposed. |
| Bundled recipes | Scanned all **114** manifest-listed recipe files and **1,123** structured ingredient rows. Queries for the candidate ID, `barley bran flour`, `barley-bran flour`, `barley bran powder`, `barley bran`, `son d’orge`, `son d'orge`, `farine de son d’orge`, and `farine d’orge` found **0 matching files and 0 matching ingredient rows**. | There is no bundled recipe demand, quantity, or recipe link to support a reusable value. |
| Forms, yields, and substitution rules | No candidate-specific form, package-yield row, ingredient unit mapping, global substitution rule, or contextual substitution rule exists. | Add none. Keep all active behavior for neighboring barley identities unchanged. |
| Proposal/source history | No R1028 proposal path, source ID prefix, or exact study title/source URL was found in the proposal archive or ledger. Nearby generic bran-flour additions concern other cereal identities. | This proposal and its two new source IDs are unique. Keep those cereal-specific reviews and evidence intact. |

The audit also checked adjacent barley names to keep the proposed flour from absorbing barley bran, barley flour, or barley middlings wording. The recipe scan returned no adjacent barley-bran or barley-flour term hits either.

## Numeric and substitution limits

The reviewed sources do not establish a reusable household mass-volume measure, density, unit mapping, conversion, cooking yield, or general recipe instruction for barley bran flour:

- S01 reports bread samples made with barley bran flour at **5%, 10%, and 15%** levels. Its abstract reports that the 5% group was not significantly different from the control in sensory evaluation, while 10% and 15% groups scored lower. Those are study-specific formula levels and outcomes; the abstract does not provide a transferable home-recipe ratio or universal replacement recommendation.
- S02 reports a clinical diet supplemented with **30 g barley bran flour** for study participants. That is a study dose, not a household measure, serving recommendation, or mass-volume conversion.
- A secondary food-composition table lists **1/4 cup** for an entry named `Barley bran flour`, but supplies no ingredient mass or derivation. It is not sufficient to define a reusable volume-to-mass measure. A separate laboratory study reports bulk density for untreated **barley bran**, not barley bran flour; its sample result stays with that study and is not transferred to this candidate. Likewise, barley-flour cup weights are not evidence for bran flour [S05–S07].

The bread study tests a particular use in bread, but neither it nor the clinical study supports an amount-preserving substitution rule across flour or bran identities. Do not infer that barley bran flour can replace barley flour, wheat flour, or another cereal bran at a general ratio. If accepted, set measurement research to `researched_no_supported_value` and substitution research to `blocked_pending_evidence`; keep `defaultDensity` null, mappings empty, and forms, recipe links, conversions, yields, and global/contextual rules absent.

The source-specific percentages and 30 g diet dose may be described in the research record as bounded study findings. Do not store them as reusable measures or active substitution rules.

## Source register

The R1028 source IDs below are proposal-local. Reused sources remain attached to their current ledger owners; this review does not add them to the shared ledger.

| Source | Source and locator | What it supports and limits |
|---|---|---|
| **S01 / `WP02-A7-BARLEY-BRAN-FLOUR-R1028-20261019-S01`** | Ung-Kyu Choi, [“Effect of Barley Bran Flour Addition on the Quality of Bread”](https://www.kci.go.kr/kciportal/ci/sereArticleSearch/ciSereArtiView.kci?sereArticleSearchBean.artiId=ART001102997), *Korean Journal of Food Science and Technology* 37(5) (2005), 746–750, abstract and keywords. | Directly names barley bran flour as an ingredient in human bread and reports study-specific 5%, 10%, and 15% additions and sensory outcomes. Supports a generic culinary ingredient identity; the abstract does not define a standard grind, composition, retail grade, household measure, or transferable substitution ratio. |
| **S02 / `WP02-A7-BARLEY-BRAN-FLOUR-R1028-20261019-S02`** | Lupton, Morin, and Robinson, [“Barley bran flour accelerates gastrointestinal transit time”](https://pubmed.ncbi.nlm.nih.gov/8393033/), *Journal of the American Dietetic Association* 93(8) (1993), 881–885, DOI [10.1016/0002-8223(93)91526-V](https://doi.org/10.1016/0002-8223(93)91526-V), abstract. | Names barley bran flour as a human-consumed food ingredient and reports a diet supplemented with 30 g in a study group. The clinical dose and results are study-specific; the source does not define a kitchen portion, grind, product specification, or recipe substitution. |
| **Reused S03 / `WP03-BARLEY-BRAN-20261013-R56-S02`** | Santé Canada, [Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), table 1, entry `Son d’orge`. Current owner: `ingredient-ref-barley-bran`. | Supports the French base name `son d’orge` for barley bran. It does not attest the compound `farine de son d’orge`, a flour grind, or a candidate measure. Reuse only for this stated base term. |
| **Reused S04 / `WP03-BARLEY-BRAN-QC-R89-20261013-S01`** | Office québécois de la langue française, [GDT: son](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), food / processed-cereal entry. Current owner: `ingredient-ref-barley-bran`. | Supports `son` as a Québec French cereal-milling term. It does not name barley bran flour or validate the proposed compound. |
| **S05, screening only** | [CSID Cares: Food Composition (Grain products)](https://www.csidcares.org/food-grain/), entry `Barley bran flour`. | Lists a 1/4-cup serving label but no mass or measure derivation. Not adopted as a reusable measure or conversion. |
| **S06, adjacent-source boundary only** | [Effect of extrusion variables (temperature, moisture) on the antinutrient components of cereal brans](https://pmc.ncbi.nlm.nih.gov/articles/PMC4348277/), bulk-density results. | Reports a sample bulk density for untreated barley bran among cereal-bran samples. It concerns bran, not barley bran flour, and is experimental sample data; it is not transferred. |
| **S07, adjacent-source boundary only** | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), entry `Barley flour`. | Lists a cup weight for barley flour, not barley bran flour. It is excluded from the candidate's measures. |

## Commercial queue scope

The historical Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead is product-only. It remains out of scope because commercial-product counts do not add ingredient diversity. Stop that line; preserve the historical R605 record, the unresolved generic wheat-meal question, existing branded entries, and each entry’s own product-specific evidence. No brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued for this review.

## Proposed minimal state

If accepted, add only this identity reference and a separate source-linked research-ledger record:

```json
{
  "id": "ingredient-ref-barley-bran-flour",
  "nameEn": "barley bran flour",
  "nameFr": "farine de son d’orge",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Proposed ledger state: `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`. Add the two proposal-local study sources and preserve their formula amounts as source-bounded findings only. Reuse S03–S04 for their narrow terminology support without moving or duplicating their ownership. Keep forms, aliases, reusable measurements, recipe links, conversions, yields, density, mappings, global substitutions, and contextual substitutions empty. Keep the French display provisional pending an exact Québec terminology review.

This is a proposal only. No tests, build, emulator run, or deployment were performed.
