# WP02 B2 — Bambara groundnut flour identity review (R74)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, recipe, generated file, or test was changed.
- **Scope:** One additional pulse-flour identity under Section B, alternative flours. This review does not reopen the accepted whole-seed identity for *Vigna subterranea* or decide a Bambara starch, protein isolate, fermented food, or okpa recipe.
- **Open checklist item:** [Section 04, lines 1831–1832](../../RecipeBook-global-ingredient-catalog-plan.txt#L1831): `[ ] Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours.` Bambara groundnut flour is an additional pulse-flour candidate within this open coverage item; it is not written into the checklist yet.
- **Recommendation:** Integrate one identity-only row for human-food flour made by milling *Vigna subterranea* seeds. Keep forms, unit mappings, density, conversions, yield, recipe links, and substitutions empty.
- **Proposed ID:** `ingredient-ref-bambara-groundnut-flour` (unreserved; no exact active-reference, form, or legacy-candidate owner).
- **Proposal-local source prefix:** `WP02-B2-BAMBARA-FLOUR-R74-20261013` (no collision found in the current source ledger or proposal/batch archive before drafting).

## Recommendation

Add **`Bambara groundnut flour / farine de pois bambara`** as a separate `FLOUR_AND_STARCH` reference for plain food flour milled from Bambara groundnut (*Vigna subterranea*) seed. A current Canadian flour retailer lists “Bambara Beans Flour”; another Canadian seller describes “Okpa Flour (Bambara Beans Flour)” as 100% Bambara bean/nut. The EU’s current French legal label name for this food form is “Farine de pois bambara (Vigna subterranea).” Together, the species, product, and French-label evidence supports this narrow identity. [S01–S04]

Add only the source-attested English alias **`Bambara beans flour`**. Do not add `Okpa flour`: that is a use-qualified product/recipe name, and no bundled recipe asks for it. Do not add the shorter `Bambara flour`, `groundnut flour`, or any French seed alias as a flour alias. Retain `pois bambara`, `pois de terre`, and `voandzou` on the existing whole-seed row. The French display `farine de pois bambara` is supported by the EU food label and the existing Canadian French seed term, but this is **not** an OQLF ruling or a Québec flour-package attestation; keep that scope explicit. [S01–S03, WP03-H-BAMBARA-20261011-S03, WP03-H-REGIONAL-PULSES-20261011-S09]

The flour is a product identity rather than a preparation form of the whole seed. Research studies distinguish Bambara flour from starch and protein isolates, while their flour-making methods vary by soaking, drying, dehulling, milling, and sieve size. Do not encode those study-specific methods as catalog forms. [S04–S05]

## Candidate boundary

| Candidate wording or data | Disposition | Boundary |
|---|---|---|
| `Bambara groundnut flour` | **Accept as English display** for `ingredient-ref-bambara-groundnut-flour`. | Flour made from *Vigna subterranea* seed. The English phrase matches current food-science usage; Canadian product listings attest a Bambara-bean flour product. [S02–S05] |
| `farine de pois bambara` | **Accept as provisional fr-CA display**, with the limits above. | Exact EU French legal name for flour of *Vigna subterranea*; `pois bambara` is also the existing CFIA French seed name. No Québec-specific flour label or OQLF flour entry was found. [S01; WP03-H-BAMBARA-20261011-S03] |
| `Bambara beans flour` | **Accept as the only English alias.** | Exact wording on current Canadian retail listings. It remains product-qualified and preserves the species distinction. [S02–S03] |
| `Okpa flour`, `Bambara flour`, `groundnut flour` | **Do not add as aliases.** | `Okpa` denotes a recipe/use context; the shorter terms are less specific than the product name or risk broadening an existing seed/peanut search. [S02–S03] |
| `farine de voandzou`, `farine de pois de terre`, bare `voandzou` or `pois bambara` | **Do not add as French aliases.** | These are not flour-specific labels in the reviewed Canadian/French sources; the bare seed terms already belong to `ingredient-ref-bambara-beans`. [WP03-H-BAMBARA-20261011-S03, WP03-H-REGIONAL-PULSES-20261011-S09] |
| Soaked, roasted, dehulled, or fine/coarse flour forms | **No form additions.** | Research methods establish experimental flour variants, not stable consumer form labels or a recipe-driven need. [S04–S05] |
| Measurement, conversion, yield, or substitution data | **No additions.** | Evidence is method- or recipe-specific and does not establish a household measure, reusable density, processing yield, or replacement rule. [S02–S05] |

## Live catalog, ledger, archive, and recipe audit

Read-only snapshot of the shared worktree on 2026-10-13:

| Surface | Current state |
|---|---:|
| Active ingredient references | 1,396 |
| Ingredient forms | 103 |
| Legacy import candidates | 63 |
| Research-ledger records | 1,732 |
| Manifest-listed recipe files / ingredient rows | 114 / 1,123 |

Accent-, punctuation-, and case-normalized exact-name checks found no flour owner for `Bambara groundnut flour`, `Bambara beans flour`, `Okpa flour`, `farine de pois bambara`, `farine de pois de terre`, or `farine de voandzou` in active reference names/aliases, form labels/match terms, or legacy import candidates. No form mentions Bambara or Voandzou. The live seed row and its current ownership are:

| Active ID | Display and aliases | Result |
|---|---|---|
| `ingredient-ref-bambara-beans` | `Bambara beans / pois bambara`; EN aliases `Bambara bean`, `Bambara groundnut`, `Bambara groundnuts`; FR aliases `pois de terre`, `voandzou`; category `LEGUME_AND_PULSE`; `defaultDensity: null`; `unitMappings: []`. | Keep all these seed names on the whole-food identity. The proposed flour row does not replace or move any of them. The existing verified seed record retains measurement state `researched_no_supported_value` and substitution state `researched_no_supported_substitute`. [WP03-H-BAMBARA-20261011-S03, WP03-H-REGIONAL-PULSES-20261011-S09] |

The [prior WP03 seed review](wp03-bambara-groundnut-identity-quebec-display-review-20261011.md) and seed ledger decision explicitly leave flour for separate review; they do not decide a flour reference, flour-specific naming, or flour data. The broader archive search found only compound-food mentions, including `WP03-OGI-BABA-BOUNDARY-20261013-S04` (Bambara flour in a fortified sorghum study formula) and `WP03-FONIO-FLAKES-20261013-R10-S05` (Bambara flour in a composite flake study). Neither is a WP02 flour-identity decision. No prior WP02 Bambara-flour proposal, batch decision, or source-prefix collision was found.

The ordered scan of all **114** manifest recipe files and **1,123** ingredient rows found **zero** line or full-recipe hits for Bambara flour, Bambara groundnut flour, Bambara beans flour, Okpa flour, and the corresponding reviewed French phrases. There is no bundled recipe demand, measure to link, recipe line to relink, or recipe-specific substitution to encode.

### Search ownership effect

The current exact queries `Bambara groundnut`, `Bambara beans`, and `pois bambara` are owned by the seed row through its existing display/aliases. The proposed English display, alias, and French display include those phrases, so after integration each query will return both the seed and flour identities under the current complete-phrase search behavior. This adds a distinguishable flour choice while preserving the seed result. `Bambara groundnut flour`, `Bambara beans flour`, and `farine de pois bambara` have no current exact owner. Do not add bare French seed aliases to the flour row.

## Measurement, conversion, yield, and substitution limits

- **Measurement and density:** Adegunwa et al. report laboratory **bulk density of 0.64–0.80 g/mL** across Bambara-flour samples made after autoclaving, boiling, cold/hot soaking, or roasting, followed by drying and milling. Those tested samples and treatments are not a standardized retail flour or household scoop method. Do not set `defaultDensity` from this range. The Canadian listings give package masses (including 2 lb and 16 oz), not cup weights or fill methods. [S02–S04]
- **Conversion:** No reviewed Canadian product listing or study gives a flour-specific mass-per-cup value or a standardized volume measure. The laboratory bulk-density range cannot be converted into a reusable kitchen mapping. Keep `unitMappings: []` and add no unit conversion. [S02–S04]
- **Yield:** OsiAfrik gives one Okpa preparation using 1 lb flour and says the recipe makes 12 portions. That is a seller-specific cooked-dish yield, not a flour milling yield or a general yield for Bambara flour. Do not add a yield record. [S03]
- **Substitution:** Okpa use demonstrates one dish made with Bambara flour; it does not establish a ratio for replacing chickpea, pea, wheat, peanut, or other flour. No global or contextual substitution is justified. [S03–S05]

## Exact future integration delta

If accepted, add one identity-only row:

```json
{
  "id": "ingredient-ref-bambara-groundnut-flour",
  "nameEn": "Bambara groundnut flour",
  "nameFr": "farine de pois bambara",
  "aliasesEn": ["Bambara beans flour"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "FLOUR_AND_STARCH"
}
```

Register the same identity and proposal-local sources in the research ledger, with no form, measure, mapping, conversion, yield, recipe link, or substitution record. Keep the Section B parent item open until its remaining coverage is resolved. Under the current `AGENTS.md` rule, an integration that only adds database JSON data does not require tests or emulator verification.

## Sources

Sources were checked online on **2026-10-13**. Proposal-local IDs use the prefix above; the two WP03 IDs below already exist in the seed ledger and are cited for the current seed naming only.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-BAMBARA-FLOUR-R74-20261013-S01** | European Commission, [Implementing Regulation (EU) 2024/2047, French text](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32024R2047). Names the flour form `Farine de pois bambara (Vigna subterranea)` for labeling foods containing it. | Current EU novel-food label requirement; not a Québec or Canadian retail naming ruling. |
| **WP03-H-BAMBARA-20261011-S03** | CFIA, [French organic seed and grain extension-code table](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme). Pairs *Vigna subterranea* with `Pois bambara` for seed and grain products. | The table was modified 2020-04-07 and concerns organic commodity classification, not flour or retail terminology. Reused from the existing seed record. |
| **WP03-H-REGIONAL-PULSES-20261011-S09** | Translation Bureau, [TERMIUM Plus record for *Voandzeia subterranea*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=44&i=&index=frr&lang=fra&sg_kp_wet=10146040&srchtxt=PRODUIT+ALIMENTAIRE). Lists French `pois bambara` and `voandzou` for the food seed. | Canadian terminology supports seed wording, not Québec flour prevalence or flour aliases. Reused from the existing seed record. |
| **WP02-B2-BAMBARA-FLOUR-R74-20261013-S02** | Kasoa Tropical Food Market, [Be Chosen Foods — Bambara Beans Flour](https://www.kasoatropicalfood.com/en-ca/kasoa-products-flour/3). The current listing names a 2 lb product. | Canadian retail product evidence and package size only; no ingredient panel, process, or household measure. |
| **WP02-B2-BAMBARA-FLOUR-R74-20261013-S03** | OsiAfrik, [Okpa Flour (Bambara Beans Flour), 16 oz](https://www.osiafrik.ca/products/okpa-flour-16-oz). States the flour is made from 100% Bambara bean/nut and gives an Okpa recipe. | Canadian seller statement and one product-specific recipe; not a general formulation or substitution source. |
| **WP02-B2-BAMBARA-FLOUR-R74-20261013-S04** | Adegunwa et al., [“Effects of Treatments on the Antinutritional Factors and Functional Properties of Bambara Groundnut (*Voandzeia subterranea*) Flour”](https://doi.org/10.1111/jfpp.12159), *Journal of Food Processing and Preservation* 38 (2014), 1875–1881. Reports 0.64–0.80 g/mL bulk-density range across treated flour samples and says seeds were treated, dried, and milled. | Laboratory functional-property results; treatments and measured bulk density do not define a universal retail or household measure. |
| **WP02-B2-BAMBARA-FLOUR-R74-20261013-S05** | Kaptso et al., [“Physicochemical and micro-structural properties of flours, starch and proteins from two varieties of legumes: bambara groundnut”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4519478/), *Journal of Food Science and Technology* 52 (2015), 4915–4924. Separately analyzes flour and starch/protein isolates; describes soaking, drying, dehulling, milling, and 500 μm sieving for its study flour. | Cameroon study methods establish distinct research products, not a commercial processing standard or recipe form taxonomy. |

## What remains open

- No independent Québec flour-package wording was located. Revisit `farine de pois bambara` if a Québec-specific product label or OQLF flour entry becomes available; do not describe the current evidence as an OQLF endorsement.
- Do not create a Bambara starch, protein isolate, fermented product, or okpa identity from this review; each needs its own product and scope evidence.
- Revisit measures or process-specific forms only if a stable product standard or bundled recipe demand establishes a reusable need.
