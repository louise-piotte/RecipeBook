# WP02 Section A7 R1077: defatted corn bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Reviewed and integrated on 2026-10-19. Added the generic reference and ledger record described below; no recipe, form, measure, conversion, yield, or active substitution was added. No software tests were run because the application change only adds database JSON under `AGENTS.md`.
- **Open-plan anchor:** Section A7 remains open for review of other grain meals and milling products, including the unresolved generic wheat-meal question ([catalog plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected generic gap:** Human-food **defatted corn bran**, distinct from ordinary corn bran and corn bran flour.
- **Integrated result:** Added one identity-only `GRAIN_AND_CEREAL` reference: **defatted corn bran / son de maïs dégraissé**. The French compound is descriptive and provisional for Québec. Added no aliases, forms, measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. The project-wide filter was applied across every ingredient category: brand-, product-line-, flavour-family-, SKU-, retailer-variant-, and named-product expansions do not count as ingredient gaps because commercial-product counts do not add ingredient diversity. Existing branded entries and their evidence remain intact for separate transferability review; this proposal recommends no branded-entry removal, merge, or alias transfer. No commercial-product roster was researched. The named Anson Mills wheat-meal lead remains out of scope; preserve its R605 history and the separate unresolved generic wheat-meal question.

## Identity and naming

Two primary human-food studies directly use defatted corn bran in biscuit work. Nagi et al. list corn among the cereal brans defatted for their biscuit study, describe corn bran as a study material, and conclude that full-fat and defatted corn bran were among the cereal brans used in biscuits [S01]. Parate, Kale, and Talib separately describe defatting and milling corn bran, then testing it in biscuit formulations [S02]. This supports a generic source-grain-qualified ingredient identity. Neither paper defines a universal commercial grade, residual-fat threshold, or consumer preparation method.

Keep the proposed identity separate from:

- **`ingredient-ref-corn-bran` — corn bran / son de maïs.** This is the ordinary corn-bran milling fraction. Its existing reference, aliases, sources, and research states remain unchanged. Defatted corn bran is not an alias for it.
- **`ingredient-ref-corn-bran-flour` — corn bran flour / farine de son de maïs.** R1022 covers flour made from bran. It does not establish fat removal, and the R1077 samples' study-specific grinding does not make `corn bran flour` an alias for defatted corn bran.
- **`ingredient-ref-defatted-corn-germ-flour` — defatted corn germ flour**, and `ingredient-ref-toasted-corn-germ` — toasted corn germ. These are germ fractions, not bran.
- Other grain-specific brans and defatted-bran identities, including defatted barley, wheat, rice, and oat bran. Do not transfer their names, source claims, procedures, or measurements to corn.
- Isolated corn fibre, cornmeal, corn flour, and branded or prepared cereal products containing corn bran. Shared source grain does not make these identities interchangeable.

The proposed French display `son de maïs dégraissé` is a transparent compound built from the Canadian French term `son de maïs` in Health Canada's Table 1 [S03]. The exact defatted compound is not attested by that source or an OQLF entry; keep it provisional and add no French alias. This is a French wording proposal, not a claim that it is established Québec terminology.

## Ownership and duplicate audit

Pre-integration read-only snapshot of the live repository on 2026-10-19. Candidate searches included the proposed ID and normalized English/French variants such as `defatted corn bran`, `corn bran defatted`, `defatted maize bran`, `defatted corn bran powder`, `son de maïs dégraissé`, and `son de maïs déshuilé`.

| Surface | Current snapshot and finding | Proposal consequence |
|---|---|---|
| Ingredient references | **2,071** rows. No exact proposed ID or candidate phrase is present. The closest active owners are `ingredient-ref-corn-bran`, `ingredient-ref-corn-bran-flour`, and `ingredient-ref-defatted-corn-germ-flour`. | Add no alias and do not merge or modify these rows. The defatted-bran distinction is source-grain-specific and remains separate from flour and germ fractions. |
| Ingredient forms | **205** forms. No proposed ID, exact candidate phrase, or form match term is present. | Add no form or match term. The papers do not establish a reusable recipe form or state transition. |
| Research ledger | **2,476** records before integration. No proposed ID, exact candidate phrase, candidate record, or corn-specific defatted-bran finding was present. The Nagi et al. URL is already registered as crop-specific evidence on `ingredient-ref-defatted-barley-bran` and `ingredient-ref-defatted-wheat-bran` under their respective R1067 and R1073 source IDs. Its text explicitly names corn in the defatting procedure and biscuit conclusion; this review uses that direct corn-specific evidence without broadening or moving either existing claim. The Health Canada terminology page used for `son de maïs` is already registered for the `Son d’orge` entry on the barley-bran and barley-bran-flour records; R1077 registers a distinct `Son de maïs` locator. | A new identity record and three crop/name-scoped source entries were added. Existing Nagi and Health Canada source entries on other owners remain unchanged. |
| Legacy import identities | **55** candidates. No proposed ID or normalized candidate phrase is present. | No legacy promotion, merge, or alias transfer. |
| Bundled recipes | **114** recipe files and **1,123** structured ingredient rows. Scans found no candidate phrase, proposed ID, or ordinary corn-bran wording in recipe text or ingredient rows. | No recipe demand, quantity, or recipe link supports reusable data. |
| Proposal and batch history | No focused defatted-corn-bran identity proposal or hold was found. R1067 covers defatted barley bran and R1073 covers defatted wheat bran; the plain corn-bran and corn-bran-flour decisions cover different identities. | Preserve every prior decision and source claim. No merge or transfer is proposed. |

The exact ID and variants above were checked across live references, forms, the full ledger, legacy candidates, and the bundled recipe corpus. No separate owner or recipe request was found. Existing ordinary corn bran and corn bran flour remain their own owners.

## Measurement, preparation, and substitution limits

No source establishes a generic household measure, density, unit mapping, conversion, package yield, or cooking yield for defatted corn bran. Do not transfer portions or numeric findings from plain corn bran, corn bran flour, defatted corn germ, or other grain brans.

Nagi et al.'s hexane-to-bran ratio, 24-hour extraction, filtration, drying, 50 °C oven treatment, mill setting, and 48-mesh sieve describe that study's samples [S01]. Parate et al.'s Soxhlet petroleum-ether extraction, 105 °C drying for six hours, grinder, and 105-micron sieve likewise describe their laboratory material [S02]. These are study protocols, not home-processing advice, a universal defatting standard, a residual-fat specification, or a stable consumer product form.

Both studies' biscuit formulas, replacement percentages, water adjustments, particle preparation, sensory results, and storage results stay with the tested material and protocol. Parate et al.'s reported highest acceptability at 20% is specific to that experiment; it is not a general replacement ratio or baking recommendation. The studies establish use as a food ingredient, but do not establish a directional, context-qualified substitution for another ingredient. If integrated, recommend `measurementState: researched_no_supported_value` and `substitutionResearchState: blocked_pending_evidence`; add no measurement observation or active rule.

## Source register

S01–S03 are registered on the new generic ledger record with crop-specific locators. Existing Nagi and Health Canada source entries on other records remain unchanged.

| Source | Exact locator | What it supports and limits |
|---|---|---|
| **S01 / `WP02-A7-DEFATTED-CORN-BRAN-R1077-20261019-S01`** | H.P.S. Nagi, J. Kaur, B.N. Dar, and S. Sharma, [“Effect of Storage Period and Packaging on the Shelf Life of Cereal Bran Incorporated Biscuits”](https://scialert.net/fulltext/?doi=ajft.2012.301.310), *American Journal of Food Technology* 7(5) (2012), 301–310, DOI [10.3923/ajft.2012.301.310](https://doi.org/10.3923/ajft.2012.301.310). **Materials and Methods**, “Materials” and “Defatted bran” (article lines 98–108); **Conclusion** (lines 189–193). | Primary human-food study. Names corn bran among its materials, lists corn among the cereal brans defatted, describes the study's sample preparation, and names full-fat and defatted corn bran in its biscuit conclusion. The solvent, sample, drying/grinding/sieving process, formula, storage conditions, and results remain study-specific. |
| **S02 / `WP02-A7-DEFATTED-CORN-BRAN-R1077-20261019-S02`** | Vishal Parate, Snehal Kale, and M.I. Talib, [“Development of Fibre Rich Biscuits from Corn Bran”](https://ijamtes.org/gallery/124-jan19.pdf), *International Journal of Management, Technology and Engineering* IX(1) (January 2019). PDF locators: Abstract (first page); section 2.1, “Preparation of Corn Bran Shells De-fated Powder” (PDF page 2); section 2.3, “Preparation of Corn Bran Incorporated Biscuits” (PDF page 3); section 5, Conclusion (PDF page 5). | Primary report describing defatted corn-bran powder and its use in a laboratory biscuit formulation. The PDF states a petroleum-ether Soxhlet protocol and tested 5–30% flour replacement levels with water adjustment. Those exact conditions and the reported 20% acceptability point are limited to this experiment; they are not a consumer method or transferable substitution. |
| **S03 / `WP02-A7-DEFATTED-CORN-BRAN-R1077-20261019-S03`** | Health Canada, [Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), Table 1, **Sons**, entry **Son de maïs**. | The table row names `son de maïs` and describes it as the pericarp of corn separated by dry or wet milling. It supports the base Canadian French term only; it does not attest `son de maïs dégraissé`. The existing source ID and its distinct barley locator remain unchanged. |

## Integrated minimal data and ledger disposition

Integrated identity:

```json
{
  "id": "ingredient-ref-defatted-corn-bran",
  "nameEn": "defatted corn bran",
  "nameFr": "son de maïs dégraissé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Integrated ledger record:

- `recordId: ingredient-ref-defatted-corn-bran`; `recordType: ingredient_reference`.
- `identityState: verified`, based on direct human-food study use of defatted corn bran; the French compound remains descriptive and provisional.
- `measurementState: researched_no_supported_value`.
- `substitutionResearchState: blocked_pending_evidence`.
- No aliases, forms, measurement observations, default density, unit mappings, recipe links, conversions, yields, or active substitutions.
- New crop-specific source records for the R1077 primary claims, while preserving the existing Nagi article entries on barley and wheat rows and the existing Health Canada source record on barley rows. Do not transfer procedures, measurements, formulas, or outcomes from those identities.

## Test disposition

This application change only adds database JSON data and refreshes the generated catalog index. No software tests, build, emulator run, or deployment were needed or run under `AGENTS.md`. The ownership and recipe audit is recorded above. Section A7 remains open for other generic milling gaps.
