# WP02 Section A7 R884: generic buckwheat bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, batch, recipe, or code changes were made.
- **Open-plan anchor:** The A7 parent remains open for other grain meals and milling products, including the unresolved wheat-meal candidate ([plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). The current WP02/WP03/WP04 workflow records the integrated R881–R883 generic gaps ([workflow](../ingredient-catalog-workflow.md#L3402)).
- **Scope:** Review one missing generic grain-milling fraction: buckwheat bran. This is ingredient-diversity work, not a commercial product roster.
- **Recommendation:** Add identity-only `buckwheat bran / son de sarrasin` as `ingredient-ref-buckwheat-bran` in `GRAIN_AND_CEREAL`. Keep the French compound provisional pending independent Québec terminology review.
- **Research boundary:** Use primary food studies for the milling fraction and culinary use, and OQLF terminology only for the base crop name. Keep sample fractions, milling specifications, composition, formulas, and outcomes scoped to their sources.

## Recommendation

Add generic `buckwheat bran` as a distinct pseudocereal milling fraction. A primary study of common buckwheat (*Fagopyrum esculentum*) separately reports fine flour, grits, bran, and two hull fractions. Another primary food study describes bran obtained by grinding buckwheat groats and uses buckwheat bran in bread research. Together they support a human-food milling-fraction identity distinct from buckwheat flour, grits, raw or roasted groats, and hulls. [R884-S01–S02]

Keep the identity broad only to the named ingredient. The studies do not establish one universal bran boundary across mills or prove equivalence between common-buckwheat bran and a Tartary-buckwheat bran-flour product. Do not add a species alias, an unqualified `bran` alias, or `buckwheat bran flour` as an alias. The proposed French display `son de sarrasin` is descriptive and provisional: OQLF supports the base crop name `sarrasin`, but the reviewed Québec terminology does not establish this exact bran compound as a preferred human-food name. [WP03-BWGROATS-RAW-20261012-S03, R884-S03]

Add no aliases, forms, density, unit mappings, measurements, conversions, package yields, recipe links, or substitutions. Leave measurement and substitution research `not_yet_researched`. Do not transfer study sieve sizes, fraction yields, nutrient values, or bread replacement percentages to the generic ingredient.

## Why this is an open generic gap

The open A7 parent includes grain meals and milling products. Existing buckwheat identities cover flakes, flour grades, grits, groats, starch, puffed buckwheat, hot cereal, sprouted buckwheat, and noodles; there is no active bran identity. R881 recently added [proso millet bran](wp02-next-generic-grain-gap-review-r881-20261019.md), which confirms that a grain-specific bran fraction can add ingredient diversity while remaining separate from its flour and whole-grain identities. This proposal applies that identity-only approach to a different missing fraction; it does not extend a product roster. The [cross-category scope review](../batches/generic-ingredient-scope-review-20261019/README.md) keeps catalog work focused on generic ingredient diversity and preserves existing branded entries and product-scoped evidence.

The A7 wheat-meal candidate remains unresolved under R875, and barley meal remains unresolved under R864. Neither hold assigns or owns buckwheat bran. R881–R883 left the parent open for further generic gaps. This review leaves all those decisions unchanged.

Any further research devoted only to Anson Mills' named `Colonial-Style Toasted Stone Cut Wheat Meal` remains **out of scope** under R875 because another commercial product adds no ingredient diversity. Preserve the historical R605 record, all existing branded rows, and their product-specific evidence. No brand, product-line, flavour-family, SKU, or retailer-variant research was pursued in this review.

## Evidence and naming boundary

| Claim | Evidence reviewed | Limit |
|---|---|---|
| Buckwheat is a distinct food plant name in Québec French | OQLF pairs `sarrasin` with English `buckwheat` and lists *Fagopyrum esculentum* and *F. sagittatum*. [WP03-BWGROATS-RAW-20261012-S03] | The entry is old, concerns the crop term, and does not name bran or settle the modern species scope of every buckwheat product. It is not evidence that all buckwheat milling fractions are equivalent. |
| Bran is a distinct common-buckwheat milling fraction | Kasar et al. roller-milled four common-buckwheat samples into five fractions, including bran, fine flour, grits, and two hull fractions. The study reports these as separate fractions and notes their potential food applications. [R884-S01] | The five fractions, their separation, the study's sample set, and all composition/function measurements are study-specific. Milling streams and terminology can vary; no universal particle size, yield, composition, or bran/hull boundary is proposed. |
| Buckwheat bran has documented human-food use | Żmijewski et al. describe bran obtained by grinding buckwheat groats and include it in rye-bread research. [R884-S02] | The PubMed abstract does not identify the buckwheat species. The study's flour-replacement levels, results, and nutritional statements apply only to its samples and bread formula. They do not establish a general replacement rule, recipe measure, or health claim. |
| `son de sarrasin` is a possible descriptive French display | The existing OQLF `sarrasin` record supports the crop term. The OQLF `son` entry reviewed for this pass defines `son` specifically from wheat milling; it does not attest the proposed compound or human-food use for buckwheat. [WP03-BWGROATS-RAW-20261012-S03, R884-S03] | Keep the compound provisional. No exact OQLF Québec-preferred human-food name was found. Seek independent Québec terminology review before treating the French display as settled. |

Do not use the Tartary-buckwheat study of bran flour to generalize to this row. That research concerns a specific Tartary crop and a separately prepared bran-flour fraction; its species, sieving, composition, blend ratios, and steamed-bread outcomes remain specific to that study. The proposed row adds no `Tartary buckwheat bran`, `Tartary buckwheat bran flour`, or other species-qualified alias, and it makes no interchangeability claim. [R884-S04]

## Live ownership and data audit

Read-only snapshot of the live package and ledger on 2026-10-19:

| Store | Snapshot | Finding |
|---|---:|---|
| Ingredient references | 1,912 rows | No active ID, display, or exact alias owner exists for `ingredient-ref-buckwheat-bran`, `buckwheat bran`, or `son de sarrasin`. Existing buckwheat flour, flour-grade, grits, groats, starch, flake, sprouted, hot-cereal, and noodle identities remain separate. |
| Ingredient forms | 201 rows | No form or form match term uses the proposed identity or exact English/French phrase. No form is proposed. |
| Research ledger | 2,317 records; 8 unit conversions | No target ID, exact phrase, or buckwheat-bran research record exists. The OQLF crop source is already owned by `ingredient-ref-raw-buckwheat-groats` as `WP03-BWGROATS-RAW-20261012-S03`. The existing OQLF `son` source ID `WP03-BARLEY-BRAN-QC-R89-20261013-S01` is already shared by other bran references; neither source will be duplicated or treated as exact compound evidence. The two study URLs and R884 proposal-local source IDs are currently unowned. |
| Legacy import identities | Current file read | No exact target ID or phrase was found. No duplicate, merge, or promotion is proposed. |
| Bundled recipes | 114 manifest-listed files; 1,123 ingredient rows | A full JSON text scan found no target ID, `buckwheat bran`, or `son de sarrasin`. No recipe demand supports a recipe link or reclassification. |

No existing branded entry, product-specific measurement, or evidence record is changed or generalized by this proposal. The target has no active forms, conversions, package yields, or substitutions; the proposed row would introduce none.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases match first across reference and form terms, followed by substring fallback only when no complete phrase matches. The projection adds only the proposed bilingual display and no aliases.

| Query | Current result | With proposal | Interpretation |
|---|---|---|---|
| `buckwheat bran` | No result | Proposed buckwheat-bran row | Exact English identity. |
| `son de sarrasin` | No result | Proposed buckwheat-bran row | Exact French display; terminology remains provisional. |
| `buckwheat` | 14 buckwheat-related references | Adds proposed bran row | Broad crop query gains the bran fraction alongside existing grain, flour, and processed forms. |
| `sarrasin` | 15 references containing the French crop term | Adds proposed bran row | Broad French crop query gains the proposed milling fraction. |
| `bran` | 18 references containing the term | Adds proposed generic bran row | Existing results remain, including current branded cereal entries; none is changed or removed. |
| `sarrasin bran`; `buckwheat bran flour`; `Tartary buckwheat bran flour` | No result | No result | No mixed-language or species/product alias is added; the proposed row does not absorb a qualified bran-flour phrase. |

The broad crop queries intentionally return multiple identities. Do not add `buckwheat`, `sarrasin`, or `bran` as aliases on the new row, and do not alter the existing flour, grits, groats, or branded cereal owners.

## Proposed data delta for later integration

If accepted, add one reference row only:

```json
{
  "id": "ingredient-ref-buckwheat-bran",
  "nameEn": "buckwheat bran",
  "nameFr": "son de sarrasin",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The corresponding ledger record should be identity-only, with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Record the French compound as provisional. The proposed change is **+1 reference and +1 identity ledger record if later accepted**; this R884 review itself changes no shared data.

## Decision for integration

1. Add generic identity-only `buckwheat bran / son de sarrasin` as `ingredient-ref-buckwheat-bran` in `GRAIN_AND_CEREAL`, with no aliases. Keep the French display provisional.
2. Keep buckwheat flour and its grades, grits, raw/roasted groats, hulls, flakes, starch, hot cereal, sprouted products, and noodles distinct. Do not assign Tartary-specific bran flour to this identity or claim equivalence between species or milling streams.
3. Add no forms, measurement data, density, unit mappings, conversions, yields, recipe links, or substitutions. Keep study-specific fraction sizes, compositions, formulas, and outcomes in the source record only.
4. Keep any further Anson Mills named wheat-meal product research out of scope because commercial-product counts do not add ingredient diversity; preserve its R605 history and all current product-specific evidence.
5. Leave the A7 parent open for remaining generic grain-meal and milling gaps. Obtain independent Québec French terminology review before treating `son de sarrasin` as settled.

## Proposal-local and reused sources

The proposal-local source IDs below were checked against the current ledger and were unused before this proposal. Reused IDs remain owned by their existing ledger records; no source or source ID is added to the shared ledger here.

| Source ID | Source and finding | Evidence limit |
|---|---|---|
| **R884-S01, proposal-local** | Crassina Kasar, M. P. Thanushree, Stuti Gupta, and Aashitosh A. Inamdar, [“Milled fractions of common buckwheat (*Fagopyrum esculentum*) from the Himalayan regions: grain characteristics, functional properties and nutrient composition”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8357863/), *Journal of Food Science and Technology* 58(10), 3871–3881 (2021); DOI [10.1007/s13197-020-04848-x](https://doi.org/10.1007/s13197-020-04848-x). | Primary study. Supports a distinct bran fraction in common-buckwheat milling and potential food use. Its four regional samples, roller-milling streams, fraction sizes, yields, functional properties, and nutrient values are not reusable generic specifications. |
| **R884-S02, proposal-local** | Mirosław Żmijewski et al., [“Antioxidant activity of rye bread enriched with milled buckwheat groats fractions”](https://pubmed.ncbi.nlm.nih.gov/26024399/), *Roczniki Państwowego Zakładu Higieny* 66(2), 115–121 (2015). | Primary human-food study. Its abstract describes bran obtained by grinding buckwheat groats and bread use, but does not identify the species. Its sample, 20%/35% buckwheat-product shares, baking results, and nutritional results remain study-specific. |
| **Reused: `WP03-BWGROATS-RAW-20261012-S03`** | OQLF, [`sarrasin` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082623/sarrasin), updated 1991. | Supports the base French crop name paired with English `buckwheat` and lists *Fagopyrum esculentum* / *F. sagittatum*. It does not name bran or the proposed French compound. |
| **Reused: `WP03-BARLEY-BRAN-QC-R89-20261013-S01`** | OQLF, [`son` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), recorded in the active ledger as last updated 1982. | Reuse only as existing base-term context. Its record does not attest `son de sarrasin` or establish a Québec-preferred human-food term. The current direct web fetch returned a cache miss, so this review does not rely on it to settle the French display. |
| **R884-S03, proposal-local** | OQLF, [`son` (GDT), agriculture/cereal-growing entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418568/son), dated 1985. | Defines `son` as bran from wheat milling. This supports the French base word only and shows why its extension to buckwheat requires terminology review; it does not establish the exact compound or buckwheat human-food identity. |
| **R884-S04, proposal-local boundary source** | Zhang et al., [“Effects of Tartary Buckwheat Bran Flour on Dough Properties and Quality of Steamed Bread”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8467894/), *Foods* 10(9), 2052 (2021); DOI [10.3390/foods10092052](https://doi.org/10.3390/foods10092052). | Primary study of a specific Tartary-buckwheat bran-flour fraction. It is cited only to keep its species, preparation, blend amounts, and steamed-bread results out of the generic claim; none is transferred to the proposed row. |

No software tests, build, emulator, or deployment checks were run; this is a proposal document only.
