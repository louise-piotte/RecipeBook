# WP02 Section A7 R963: defatted wheat germ meal identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, checklist, or recipe data was changed.
- **Open-plan anchor:** The A7 parent remains open for other grain meals and milling products ([active plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). Refreshes here exclude integrated R960–R962 work, including barley middlings and oat germ meal/raw oat germ.
- **Selected gap:** Generic **defatted wheat germ meal**, an oil-extraction wheat-germ fraction used in human-food studies.
- **Recommendation:** If accepted, add one identity-only `GRAIN_AND_CEREAL` reference for defatted wheat germ meal. Keep it distinct from active raw wheat germ, which names the wheat-kernel embryo before oil removal. Keep aliases, forms, numeric fields, recipe links, and runtime substitutions empty.
- **Scope:** Generic culinary ingredient diversity across every category. No brand, product-line, flavour-family, SKU, or retailer roster research was done. The named Anson Mills wheat-meal lead remains out of scope because commercial-product counts do not add ingredient diversity. Preserve all existing branded entries and keep product-specific evidence on its current owner.

## Candidate selection and identity boundary

The current A7 checklist still invites review of distinct grain meals and milling products. I selected defatted wheat germ meal as a generic, human-food ingredient rather than another commercial product variant. Primary food studies identify defatted wheat germ as the residue of wheat-germ oil extraction and test it in cookies or bread. A separate 2022 study calls its material wheat germ meal and describes it as a dry, defatted powder by-product of low-temperature CO₂ extraction.

The active `ingredient-ref-wheat-germ` is the raw wheat-kernel embryo (`wheat germ / germe de blé`). Its measurements and recipe-specific optional replacements concern raw germ, not the defatted meal. Oil removal changes the ingredient material; do not treat the proposed identity as an alias, synonym, or form on the raw-germ row. Also keep wheat germ oil, germinated wheat, bran, flour, and product formulations separate. The reviewed papers do not establish a single extraction method, residual-oil specification, grind, stabilization method, or composition for every defatted wheat-germ meal.

One current ledger record mentions “defatted wheat germ” in the ingredient declaration for a branded hot cereal. That evidence belongs to the named cereal formulation and is not used to establish the generic identity. No additional product research was performed. The plan's named Anson Mills wheat-meal lead is out of scope for the same global reason: commercial-product counts do not add ingredient diversity.

## Ownership and recipe-demand scan

Read-only scan of the current repository on 2026-10-19:

| Surface checked | Current state | Proposal consequence |
| --- | --- | --- |
| Ingredient references | 1,981 references. No exact proposed ID, “defatted wheat germ meal,” “defatted wheat germ,” or proposed French phrase is active. `ingredient-ref-wheat-germ` is the adjacent raw embryo identity. | If accepted, add one separate processed-fraction identity. Preserve the raw-germ row and its evidence. |
| Ingredient forms | 205 forms. No exact candidate ID or meal/defatted-germ form is registered. | Add no form; the oil-extraction fraction is proposed as its own ingredient identity. |
| Legacy import identities | 55 candidates. No exact candidate name or proposed ID is present. | No legacy promotion, merge, or alias transfer is needed. |
| Research ledger | 2,386 records. No generic meal record or candidate is present. The only exact phrase hit is `ingredient-ref-cream-of-wheat-hot-cereal`, whose manufacturer source describes defatted wheat germ as one ingredient in that named hot cereal. The active `ingredient-ref-wheat-germ` ledger record contains raw-germ measures and two recipe-specific alternatives; neither transfers to the defatted meal. | If accepted, add a new identity record and new primary-study source entries. Preserve both adjacent records and their source scopes. |
| Bundled recipes | All 114 manifest-listed files and 1,123 ingredient rows were scanned for the proposed identity and wording variants. There were zero candidate phrase matches, zero candidate ingredient-row matches, and zero direct links. A separate scan found zero recipe rows naming raw wheat germ. | No bundled recipe demand, amount, or recipe link supports the candidate. |
| Nearby A7 decisions | Current A7 work includes integrated defatted corn germ flour, Tartary buckwheat bran flour, barley middlings, and oat germ meal, plus an out-of-catalog hold for sorghum germ. Raw wheat germ is separately active. | None owns defatted wheat germ meal. Preserve every existing identity and source boundary. |

The three primary-study source IDs and URLs below do not already occur in the research ledger. The OQLF page for `germe de blé` already appears as `WP02-S99`, but that ID has inconsistent locator/support metadata between the wheat-germ and barley-germ records. To avoid carrying that conflict into this candidate, add a new candidate-scoped source entry for the base noun only; it does not validate the full proposed French compound.

## Primary evidence and source limits

| Proposal-local source ID | Source and evidence | Limits |
| --- | --- | --- |
| `WP02-A7-DEFATTED-WHEAT-GERM-MEAL-R963-20261019-S01` | J. Petrović et al., [“Effect of Defatted Wheat Germ Content and Its Particle Size on the Rheological and Textural Properties of the Cookie Dough”](https://onlinelibrary.wiley.com/doi/10.1111/jtxs.12137), *Journal of Texture Studies* 46(5) (2015), 374–384, DOI [10.1111/jtxs.12137](https://doi.org/10.1111/jtxs.12137). The article describes defatted wheat germ as the by-product of wheat-germ oil removal and examines its use in cookie dough. | The flour-replacement amounts, particle sizes, dough moisture, and physical results are experimental conditions and outcomes for that cookie study. They do not provide home-recipe advice, a general replacement ratio, a household measure, or a specification for all defatted wheat germ. |
| `WP02-A7-DEFATTED-WHEAT-GERM-MEAL-R963-20261019-S02` | O. Samokhvalova, S. Oliinyk, and N. Grevtseva, [“Prospects for the Use of the By-Products of Oil and Wine Production in Bakery and Confectionery Technologies”](https://www.mdpi.com/2673-9976/6/1/91), *Biology and Life Sciences Forum* 6(1) (2021), article 91, published 2022, DOI [10.3390/Foods2021-11027](https://doi.org/10.3390/Foods2021-11027). The primary study describes its wheat germ meal as a dry, defatted powder by-product of low-temperature CO₂ extraction of wheat-germ oil and tests it in rye–wheat bread. | The sample source, extraction conditions, formulation, ingredient percentages, water absorption, and bread outcomes are specific to this paper. The authors' recommended 10% wheat-germ meal plus 5% rosehip meal is for their tested formulation only. It is not a general recipe ratio or ingredient specification. |
| `WP02-A7-DEFATTED-WHEAT-GERM-MEAL-R963-20261019-S03` | M. U. Arshad, F. M. Anjum, and T. Zahoor, [“Nutritional assessment of cookies supplemented with defatted wheat germ”](https://www.sciencedirect.com/science/article/pii/S0308814606003864), *Food Chemistry* 102(1) (2007), 123–128, DOI [10.1016/j.foodchem.2006.04.040](https://doi.org/10.1016/j.foodchem.2006.04.040). The study reports replacing wheat flour with defatted wheat germ at 0–25% and found up to 15% substitution acceptable in its cookies. | These percentages and acceptability results are limited to this study's cookie formulas and tested sample. They do not establish a transferable household substitution or a replacement rule for other recipes or roles. The paper's rat-diet evaluation is not a human serving or nutrition recommendation. |
| `WP02-A7-DEFATTED-WHEAT-GERM-MEAL-R963-20261019-S04` | Office québécois de la langue française, [“germe de blé” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432763/germe-de-ble). | Defines `germe de blé` as the wheat-kernel embryo and gives `wheat germ` as the English term. This supports only the French base noun, not a preferred Québec term or standardized compound for defatted wheat germ meal. |

These primary papers establish direct human-food research use and the oil-extraction boundary, but they do not define a standardized retail class. In particular, a study result about a sample from one process is not transferable to every extracted germ, raw wheat germ, animal-feed meal, or other wheat fraction.

### Bounded measurement review

The measurement search was limited to generic exact-name terms and household measure/density wording, including `"defatted wheat germ meal" cup grams`, `"defatted wheat germ" cup mass`, `"defatted wheat germ" bulk density`, and `"wheat germ meal" cup grams density`. It did not investigate named brands or commercial listings. No supported household mass/volume measure, bulk density, or `g/ml` value for generic defatted wheat germ meal was found.

A result in the historical USDA household codebook is for a composite ready-to-eat cereal described as bran with defatted wheat germ added. It is not a measurement of standalone defatted wheat germ meal and is not transferable. The primary studies report study-formula amounts, replacement percentages, sample properties, or particle sizes, not a reusable household measure. Keep `defaultDensity` null, `unitMappings` empty, and add no measurement observations or conversions. Preserve every percentage, sample amount, particle size, moisture value, and result only within its cited study context.

### Bounded substitution review

Generic searches covered exact-name and flour-replacement terms such as `"defatted wheat germ meal" bread substitute`, `"wheat germ meal" replace flour`, `"defatted wheat germ" cookies flour replacement`, and `"defatted wheat germ" substitution`. The primary studies found in this bounded review do test replacement of flour in specific bakery formulas: S01 and S03 report cookie trials, and S02 reports rye–wheat bread trials. Those are experimental formula conditions, not transferable consumer instructions. They do not establish one common replacement level, ingredient role, hydration adjustment, or method across cookies, breads, and other recipes. Keep study values source-scoped and do not add a global or contextual rule.

If accepted, set `substitutionResearchState` to `blocked_pending_evidence` and record one blocked research finding with the cookie/bread study context, the exact sources, and the limits above. Do not record generalized replacement amounts or replacement ingredient links. Reopen only if evidence supports a recipe-relevant scope and applicable method or adjustments. This status reflects that published trials exist but do not support reusable recipe-picker advice.

## Proposed minimal catalog and ledger state

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-defatted-wheat-germ-meal",
  "nameEn": "defatted wheat germ meal",
  "nameFr": "germe de blé déshuilé moulu",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The French display is a provisional descriptive construction, not an OQLF-approved or independently reviewed Québec term. It describes the defatted, ground material and does not add `tourteau` as an alias. Keep both alias arrays empty pending Québec terminology review.

Proposed ledger disposition, if accepted:

- `recordId`: `ingredient-ref-defatted-wheat-germ-meal`
- `recordType`: `ingredient_reference`
- `identityState`: `verified`, based on primary human-food research that identifies defatted wheat germ or wheat germ meal as an oil-extraction ingredient used in bakery studies.
- `measurementState`: `researched_no_supported_value`; the bounded search and reviewed primary papers do not establish a transferable household measure, density, unit mapping, conversion, or yield. Add no measurement observations; keep experimental formula values in source context.
- `substitutionResearchState`: `blocked_pending_evidence`.
- Add one blocked substitution finding for the source-specific flour-replacement trials in cookies and rye–wheat bread. Record the study contexts and sources, but no generic replacement amount, replacement link, adjustment, active rule, or transferable advice.
- Add one identity decision and the three proposal-local primary-paper sources. Add candidate-scoped source S04 only for the base French noun `germe de blé`; it does not approve the full display. The historical `WP02-S99` metadata conflict remains untouched.
- Add no aliases, forms, measures, density, mappings, conversions, yields, recipe links, or runtime substitutions. Do not alter the raw-germ or branded hot-cereal entries.

## Remaining uncertainty

1. The studies establish research use, not broad household availability or a standardized commercial specification.
2. The study materials vary by extraction method, particle-size treatment, and recipe context. No universal process boundary or residual-oil value was established.
3. The provisional French wording needs independent Québec terminology review.
4. Study formula percentages cannot be generalized into a home substitution rule; no household mass-volume or density value is supported.
5. The bundled recipe corpus contains no matching ingredient demand.

Recommend one identity-only defatted wheat germ meal reference if accepted, scoped to the generic oil-extraction ingredient documented in human-food studies. Preserve raw wheat germ and all existing branded/product-specific records and evidence. No tests were run because this is proposal-only work.

## Proposal file checks

- Recounted current ownership: 1,981 ingredient references, 205 forms, 55 legacy candidates, and 2,386 ledger records. The proposed ID and names are unowned; the exact wording hit in the ledger belongs to a named hot-cereal ingredient declaration. The active raw-germ evidence remains source-scoped.
- Re-scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; no candidate wording or ID matched, and no raw wheat-germ rows matched.
- Checked the three primary-paper source IDs/URLs against current ledger sources; no duplicates were found. The OQLF URL is already present under `WP02-S99`, whose locator/support metadata differs between the wheat-germ and barley-germ rows; the proposal uses a new, candidate-scoped source ID and does not change either existing record. The A7 relative plan link resolves and the `L2289` anchor exists.
- This Markdown file was checked for UTF-8 without BOM, NUL bytes, and trailing whitespace. No software tests were run.
