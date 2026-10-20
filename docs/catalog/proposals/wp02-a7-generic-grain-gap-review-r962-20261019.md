# WP02 Section A7 R962: oat germ meal identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, checklist, or recipe data was changed.
- **Open-plan anchor:** The A7 parent remains open for other grain meals and milling products ([active plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). R957's barley-middlings identity is now integrated and is excluded from this review.
- **Selected gap:** Generic **oat germ meal**, a human-food ingredient identified in primary bread studies as an oil-production by-product.
- **Recommendation:** If accepted, add one identity-only `GRAIN_AND_CEREAL` reference for oat germ meal. Keep it separate from the active raw `oat germ` fraction. The studies establish this ingredient in bread research, but do not define a consumer grade, general composition, household measure, or transferable recipe substitution.
- **Scope:** Generic culinary ingredient diversity across all ingredient categories. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. The named wheat-meal product lead remains out of scope because commercial-product counts do not add ingredient diversity; this review did not reopen it. Preserve all existing branded rows and product-scoped evidence.

## Candidate selection and identity boundary

The current A7 checklist keeps review of other grain meals and milling products open. The recently integrated barley-middlings item is already owned. The existing oat-germ reference, added in R933, covers the isolated anatomical germ prepared as a generic grain fraction; R933 explicitly keeps oil and extracted or concentrated oat components separate. The present candidate is narrower and materially different: the primary bread studies call it **oat germ meal** and identify it as a by-product of oil production. It is not a new alias, form, or evidence extension for raw oat germ.

Limit the proposed identity to oat germ meal for human-food use as evidenced by the cited bread studies. Do not infer that all oat germ, all oat-germ oil by-products, feed-grade materials, or all meal from extracted oat germ share a single specification. The studies do not report enough processing detail to characterize an industry-wide extraction or stabilization method. Keep whole oats, oat germ, oat bran, oat flour, whole-grain oat flour, and sprouted/germinated oat products separate. Do not transfer study measurements or use claims to any existing oat row.

The scope rule also applies to queued work outside cereal ingredients. No roster-only task was identified in the open A7 parent; the previously listed further research on the named wheat-meal product is already marked out of scope for the stated commercial-count reason. No such product research was performed here.

## Ownership and recipe-demand scan

Read-only scan of the current repository on 2026-10-19:

| Surface checked | Current state | Proposal consequence |
| --- | --- | --- |
| Ingredient references | 1,978 references. No row owns `ingredient-ref-oat-germ-meal`, `oat germ meal`, or the proposed French display. The related active identity is `ingredient-ref-oat-germ` (`oat germ / germe d’avoine`, `GRAIN_AND_CEREAL`). | If accepted, add one separate meal identity. Keep the raw-germ row, source entries, and all other oat rows unchanged. Add no alias between the two. |
| Ingredient forms | 205 forms. No form owns the proposed ID or exact English/French meal terms. | Add no form; the primary studies do not establish a consumer form taxonomy. |
| Legacy import candidates | 55 candidates. No candidate owns the meal wording or proposed ID. | No legacy promotion, merge, or alias transfer is needed. |
| Research ledger | 2,383 records. The existing `ingredient-ref-oat-germ` record has R933 evidence about a raw germ preparation; it does not own oat germ meal or either cited oil-by-product bread study. No current source record owns the 2020 or 2021 DOI/URL below. The OQLF `avoine` source already on the raw-oat-germ record can be reused only for the base noun, not for the proposed French compound. | If accepted, add a new identity record with new source IDs for S01–S03. Do not edit the raw-germ record or transfer its composition evidence. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for `oat germ meal`, `oat-germ meal`, oil-extraction meal wording, proposed French wording, `ingredient-ref-oat-germ-meal`, and the related raw-germ terms. There were zero file matches and zero ingredient-row matches. | No recipe demand, quantity, or direct link supports this addition. |
| Nearby A7 decisions | R957 adds barley middlings; R948 adds defatted corn germ flour; R951 holds standalone sorghum germ; R954 adds Tartary buckwheat bran flour. R933 separately adds raw oat germ. | None owns oat germ meal. Preserve each identity and its evidence boundary. |

## Primary evidence and source limits

| Proposal-local source ID | Source and evidence | Limits |
| --- | --- | --- |
| `WP02-A7-OAT-GERM-MEAL-R962-20261019-S01` | S. Oliinyk et al., [“Study of the influence of meals of wheat and oat germs and wild rose fruits on the fermenting microflora activity of rye-wheat dough”](https://media.neliti.com/media/publications/297153-study-of-the-influence-of-meals-of-wheat-426f5338.pdf), *EUREKA: Life Sciences* 1 (2020), 40–47, DOI [10.21303/2504-5695.2020.001114](https://doi.org/10.21303/2504-5695.2020.001114). The primary study lists oat germ meal among the ingredients used in rye-wheat dough and evaluates bread-related fermentation. | Supports direct human-food research use of a generic oat germ meal. The paper's test meal, dough formulas, addition levels, composition table, and fermentation results are study-specific; none is a general household measure or replacement rule. The article does not define a universal manufacturing specification. |
| `WP02-A7-OAT-GERM-MEAL-R962-20261019-S02` | S. Oliinyk et al., [“Effect of rosehip meal and oat germ meal on change of quality indices of rye-wheat bread during storage”](https://dspace.nuft.edu.ua/server/api/core/bitstreams/7fc899c4-f120-4dcb-af63-206d3867fa6f/content), *Scientific Works of NUFT* 27(5) (2021), 154–161, DOI [10.24263/2225-2924-2021-27-5-19](https://doi.org/10.24263/2225-2924-2021-27-5-19). The authors identify oat germ meal as a by-product of oil production and study it in rye-wheat bread. | Directly supports the oil-production by-product boundary and food use. The study's ingredient sample, composition, formula, amount, storage period, and results remain specific to that paper. It does not establish retail prevalence, extraction method, residual-oil level, stabilization, a nutrition claim, or a reusable bread formula. |
| `WP02-A7-OAT-GERM-MEAL-R962-20261019-S04` | S. Oliinyk et al., [publisher record for “Studying the influence of meats from wheat and oat germs, and rose hips, on the formation of quality of rye-wheat dough and bread”](https://journals.uran.ua/eejet/article/view/187944) (the publisher's English title uses “meats”), *Eastern-European Journal of Enterprise Technologies* 1(11 (103)) (2020), 59–65, DOI [10.15587/1729-4061.2020.187944](https://doi.org/10.15587/1729-4061.2020.187944); [full article PDF](https://media.neliti.com/media/publications/308452-studying-the-influence-of-meats-from-whe-5448c763.pdf). The methods describe a no-additive control and test doughs with oil-production oat-seed meal added at 10–20% of the rye-and-wheat flour mass; the paper recommends no more than 15% for its tested bread quality. | Directly supports addition-only use of the oil-production meal in one rye-wheat bread system. Its percentage and sensory recommendation apply to that study's material and formulation; they are not replacement guidance or a general household amount. The source does not test removing or replacing flour or another ingredient. Sample moisture/acidity, increased dough moisture, and bread outcomes remain study-specific. |
| `WP02-A7-OAT-GERM-MEAL-R962-20261019-S03` | Office québécois de la langue française, [“tourteau” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357130/tourteau). Defines the term as a residue of oil extraction by pressure or solvents. | The entry is classified under animal feeding and describes tourteaux as animal feed. It is not evidence of human-food use or an OQLF-approved oat-germ-meal name. For that reason, do not use `tourteau de germe d’avoine` as the proposed display. |

S01, S02, and S04 are primary food studies from the same research group, not independent evidence of a standardized ingredient category. S02 and S04 identify the studied meal as an oil-production by-product, but none supplies a transferable manufacturing specification. The OQLF source helps define a French technical boundary only; it does not settle food terminology.

### Focused substitution review

The online search used exact-name and generic bread-replacement terms, including `"oat germ meal" bread substitute replacement flour`, `"oat germ meal" replace wheat flour bread`, `"oat germ meal" substitution bread recipe`, `"oat germ meal" replacement`, and `"meal of oat germ" replace flour bread`. No direct replacement trial or general bread-substitution recommendation was found. The relevant primary bread studies above describe the meal as an addition or enrichment to a flour-based dough. S01 examines additions by flour mass, S02 adds it jointly with rosehip meal, and S04 compares an additive-free control with doughs receiving the meal. S04's recommendation of no more than 15% applies to that tested rye-wheat bread and is an addition ceiling, not a flour-replacement ratio. Do not infer an amount of displaced flour, a one-for-one exchange, hydration adjustment, or substitution direction.

A 2016 bread paper surfaced under the wording “oat germ meal,” but its methods describe germinating whole oats, drying the sprouts, and milling germinated oat flour. That is a sprouted/germinated oat preparation, not an oil-production by-product; its recipe and results are excluded from this candidate's substitution evidence ([paper](https://biotechnologyjournal.usamv.ro/pdf/2016/Art23.pdf)). No brand or commercial-product source was researched.

### Bounded household-measure review

The exact-name searches were limited to `"oat germ meal" "cup" grams`, `"oat germ meal" "g/ml" density`, `"oat germ meal" bulk density measurement`, and `"oat germ meal" "1 cup"`. They found no supported household mass-volume amount, bulk density, or `g/ml` value for the generic human-food meal. The primary papers report sample composition and bread-formula percentages by flour mass, not a reusable volume measure or density. S04's sample moisture and recipe-specific adjustment to dough moisture are not density or hydration-conversion data. Keep measurement state at `researched_no_supported_value`, density null, and unit mappings empty.

Do not transfer measurements or claims from animal-feed `tourteau`/oil-cake material, feed-grade milling by-products, raw oat germ, germinated oat flour, oat flour, oat bran, oat groats, or wheat germ. Those are different scopes or forms and do not establish a measure for this oil-production oat-germ meal.

## Proposed minimal data and ledger state

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-oat-germ-meal",
  "nameEn": "oat germ meal",
  "nameFr": "farine de germe d’avoine issue de l’extraction d’huile",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The French wording is a provisional descriptive rendering, not a Québec terminology ruling or retail label. OQLF's `tourteau` entry is feed-oriented, so it is not copied into the display. Keep both alias arrays empty pending terminology review.

Proposed ledger disposition, if accepted:

- `recordId`: `ingredient-ref-oat-germ-meal`
- `recordType`: `ingredient_reference`
- `identityState`: `verified`, supported by S01, S02, and S04 for an oat-germ meal used in human-food research and identified as an oil-production by-product.
- `measurementState`: `researched_no_supported_value`; exact-name measure searches and the primary studies provide no transferable household measure, density, unit mapping, conversion, or yield. Keep study amounts and sample composition attached to their source contexts.
- `substitutionResearchState`: `blocked_pending_evidence`.
- Proposed substitution finding: `researchState: blocked_pending_evidence`; context is bread baking with oil-production oat germ meal added to flour-based dough. S01, S02, and S04 do not test replacing a named recipe ingredient; S04's 10–20% inclusion range and 15% recommendation are for its specific additive trials. Limitations: the studies come from one research group, use rye-wheat or wheat bread systems, and do not establish a displaced ingredient, exchange ratio, hydration adjustment, or recipe-independent rule. Cite S01, S02, and S04. Keep the finding blocked until a direct replacement study establishes direction and applicable adjustments.
- Proposed decision: accept only the generic identity if approved; leave substitution unresolved and add no rule. Do not convert study addition percentages into a substitution or general-use recommendation.
- Add one identity decision and the four proposal-local sources. Reuse the existing OQLF `avoine` source only for the base noun if the proposal is integrated; do not alter its current owner or claim. Add no aliases, forms, measures, density, mappings, conversions, yields, recipe links, or active substitution rules.

## Remaining uncertainty

1. Only primary bread studies from one research group were found for the oil-production oat germ meal; common household availability and use are not established.
2. The studies do not specify a transferable extraction, stabilization, or residual-oil specification.
3. The French display is descriptive and provisional; the OQLF `tourteau` entry is animal-feed scoped and does not establish a human-food name.
4. No replacement advice or household mass-volume/density value is supported. Formula percentages, sample composition, and process observations remain study-specific.
5. The recipe corpus has no matching demand.

Recommend one identity-only generic oat germ meal reference if accepted, bounded to the oil-production by-product supported by the primary studies. Keep it separate from raw oat germ and preserve all current entries and source-scoped evidence. No tests were run because this is proposal-only.

## Proposal file checks

- Recounted current ownership before writing: 1,978 ingredient references, 205 forms, 55 legacy candidates, and 2,383 ledger records. The proposed reference ID, English/French display, and four proposal-local source IDs have no current owner. The three research DOIs and cited primary-article PDF URLs are not already present in the ledger; the OQLF `avoine` source is reused only for the base noun.
- Re-scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; no candidate or related raw-oat-germ wording matched.
- The relative plan link resolves to `docs/RecipeBook-global-ingredient-catalog-plan.txt`, and its `L2289` anchor exists. The three primary-study PDF links and the OQLF GDT link opened during source review.
- This Markdown file decodes as UTF-8 without a BOM; no trailing whitespace or NUL bytes were found. No software tests were run.
