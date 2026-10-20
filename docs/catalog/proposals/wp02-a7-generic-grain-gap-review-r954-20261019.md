# WP02 A7 R954: Tartary buckwheat bran flour identity review

- **Packet type:** Proposal-only generic ingredient review. No catalog, ledger, plan, roadmap, or checklist data has been changed.
- **Open-plan anchor:** The A7 parent remains “Continue A7 review of other grain meals (including the unresolved wheat-meal candidate) and milling products” ([active plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). R948 added generic defatted corn germ flour and marked further named Anson Mills wheat-meal research out of scope. R951 held standalone sorghum germ because the reviewed use evidence did not establish a human-food ingredient.
- **Candidate:** Generic, species-qualified **Tartary buckwheat bran flour**, a flour made from a bran fraction of Tartary buckwheat.
- **Recommendation:** Add an identity-only `FLOUR_AND_STARCH` reference if this proposal is accepted. Multiple primary food studies distinguish the fraction and use it in steamed bread and dried noodles. The identity is supported; the studies do not establish a general milling specification, retail prevalence, household measure, or reusable recipe substitution.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavor-family, SKU, or retailer roster was researched. The named Anson Mills wheat-meal lead is out of scope because commercial-product counts do not add ingredient diversity; it was already scoped out in R948 and is not pursued here.

## Identity boundary

Limit the candidate to flour made from the bran fraction of *Fagopyrum tataricum*. Keep it separate from:

- `ingredient-ref-buckwheat-bran`, the existing generic buckwheat-bran identity added for common buckwheat;
- `ingredient-ref-tartary-buckwheat-flour`, the existing whole Tartary buckwheat flour identity;
- unground Tartary buckwheat bran, common-buckwheat bran, hulls, and any core/endosperm flour fraction.

R884 cited a Tartary bran-flour study only to keep its species and fraction boundary from being transferred to common buckwheat bran. That boundary is consistent with a distinct Tartary identity; it is not a reason to alias Tartary bran flour to the common-bran row. Do not merge, rename, or otherwise revise any existing row. The existing French alias `farine de sarrasin tartare` remains on Tartary buckwheat flour and must not be copied to the proposed bran-flour identity.

## Current ownership and recipe demand

| Surface checked | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | 1,972 references. No row owns ID `ingredient-ref-tartary-buckwheat-bran-flour`, `Tartary buckwheat bran flour`, `Tartary buckwheat bran`, or the proposed French display. The nearest rows are `ingredient-ref-buckwheat-bran` (`buckwheat bran / son de sarrasin`, `GRAIN_AND_CEREAL`) and `ingredient-ref-tartary-buckwheat-flour` (`Tartary buckwheat flour / farine de sarrasin de Tartarie`, `FLOUR_AND_STARCH`). | Add one separate identity only. Keep both current rows, their aliases, and their evidence unchanged. Add no alias that could conflate the bran flour with either identity. |
| Ingredient forms | 205 forms. No form is owned by the proposed ID or matches Tartary buckwheat bran flour / bran. | Add no form. The studies do not establish a reusable form taxonomy. |
| Legacy import candidates | 55 candidates. No exact or near-exact Tartary-buckwheat-bran-flour candidate was found. | No legacy merge or resolution is needed. |
| Research ledger | 2,377 records. No ingredient-reference record owns the proposed identity. The only existing identity record that mentions the fraction is `ingredient-ref-buckwheat-bran`; its source `R884-S04` is limited to preserving the species/fraction boundary and explicitly does not transfer Tartary study data to common buckwheat bran. No other record owns the 2022 noodle-paper or 2003 milling-paper DOI/URL. | Use new R954 source IDs for the proposed Tartary identity. Keep `R884-S04` and its current locator/support on the common-bran record unchanged. The shared 2021 article URL supports distinct, separately scoped claims; it does not authorize moving or generalizing the existing evidence. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. There were zero matches for `Tartary buckwheat bran flour`, `Tartary buckwheat bran`, `Tartarian buckwheat bran`, the proposed French display, or the proposed ID. | No bundled recipe demand, recipe link, or recipe-specific quantity supports the addition. |
| Nearby proposals and checklist | R884 added common buckwheat bran and explicitly kept Tartary bran flour separate. R948 covered defatted corn-germ flour; R951 held standalone sorghum germ. None owns or resolves the Tartary bran-flour identity. The unresolved wheat-meal lead remains a separate plan item. | Continue this bounded identity review only. Do not reopen those decisions or investigate the named Anson Mills lead. |

## Primary evidence and limits

| Proposed source ID | Source and evidence | Limits |
|---|---|---|
| `WP02-A7-TARTARY-BUCKWHEAT-BRAN-FLOUR-R954-20261019-S01` | Zhang et al., [“Effects of Tartary Buckwheat Bran Flour on Dough Properties and Quality of Steamed Bread”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8467894/), *Foods* 10(9), 2052 (2021), DOI [10.3390/foods10092052](https://doi.org/10.3390/foods10092052). The authors separately prepare Tartary buckwheat flour, bran flour, and core flour by grinding and sieving, then use the bran flour in a steamed-bread study. | Direct identity and human-food-use evidence. The variety, laboratory milling and sieving, sample properties, blend proportions, bread process, and results belong to this study; they do not set a standard flour grade, transferable composition, nutrition claim, household measure, or recipe ratio. This URL is already present as `R884-S04` on the common-bran record for boundary purposes only; the proposed R954 source record has a separate owner and claim. |
| `WP02-A7-TARTARY-BUCKWHEAT-BRAN-FLOUR-R954-20261019-S02` | Xue et al., [“Effect of Tartary Buckwheat Bran Substitution on the Quality, Bioactive Compounds Content, and In Vitro Starch Digestibility of Tartary Buckwheat Dried Noodles”](https://pmc.ncbi.nlm.nih.gov/articles/PMC9689101/), *Foods* 11(22), 3696 (2022), DOI [10.3390/foods11223696](https://doi.org/10.3390/foods11223696). The study identifies Tartary buckwheat bran flour as an ingredient in dried noodles. | Supports a second human-food use, not ordinary household prevalence or a transferable replacement ratio. Flour samples, noodle formula, tested proportions, processing, and analytical outcomes are source-specific. |
| `WP02-A7-TARTARY-BUCKWHEAT-BRAN-FLOUR-R954-20261019-S03` | Bonafaccia, Marocchini, and Kreft, [“Composition and technological properties of the flour and bran from common and tartary buckwheat”](https://www.sciencedirect.com/science/article/pii/S0308814602002285), *Food Chemistry* 80(1), 9–15 (2003), DOI [10.1016/S0308-8146(02)00228-5](https://doi.org/10.1016/S0308-8146(02)00228-5). The study evaluates flour and bran fractions from both species and identifies Tartary buckwheat bran as a food material. | Supports the species-specific bran boundary and food-material context; it does not establish bran flour fineness, a general milling specification, or a particular recipe use. Its stone-mill fractions and composition data remain study-specific. |

All three are primary studies, accessed on 2026-10-19, and their URLs/DOIs were checked against the current ledger. The R954 source IDs are not currently assigned. S01 reuses the URL already listed as R884-S04 but makes a separate source record for the distinct Tartary claim; S02 and S03 URLs/DOIs have no current ledger owner. No source measurement, recipe quantity, percentage, or outcome is transferred between ingredients or generalized beyond its study.

## Proposed minimal data and ledger state

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-tartary-buckwheat-bran-flour",
  "nameEn": "Tartary buckwheat bran flour",
  "nameFr": "farine de son de sarrasin de Tartarie",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The French display is a provisional descriptive translation built from the existing Canadian plant name `sarrasin de Tartarie` and the French bran term `son`; the reviewed papers do not establish a preferred Québec food label. Do not add it as an alias to another row, and do not add a claimed English or French synonym without separate evidence.

Proposed research-ledger record:

- `recordId`: `ingredient-ref-tartary-buckwheat-bran-flour`
- `recordType`: `ingredient_reference`
- `identityState`: `verified`, supported by S01–S03 for a distinct Tartary bran fraction and direct food use.
- `measurementState`: `researched_no_supported_value`; no transferable household measure, density, unit mapping, conversion, or yield was found. Keep the studies’ sample compositions and recipe quantities attached to their sources.
- `substitutionResearchState`: `blocked_pending_evidence`; the experimental bread and noodle substitutions do not justify global or contextual recipe-picker rules.
- `decisions`: one accepted identity-only decision with S01–S03. Add no forms, aliases, measures, density, mappings, conversions, yields, recipe links, or substitutions.

## Decision

Recommend adding one generic, identity-only Tartary buckwheat bran flour reference if the proposal is accepted. The fraction is separately named and prepared in primary research and has documented human-food uses. Keep the identity scoped to the species and bran-flour fraction; preserve common buckwheat bran and Tartary buckwheat flour as they are. The present evidence does not support quantitative catalog fields, a Québec terminology claim, recipe-demand link, or substitution rule.
