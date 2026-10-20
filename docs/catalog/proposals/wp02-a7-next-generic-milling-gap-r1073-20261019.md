# WP02 Section A7 R1073: defatted wheat bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Accepted and integrated. The shared data integration is recorded in the [R1073–R1076 batch README](../batches/wp02-wp07-wp08-r1073-r1076-generic-gap-integration-20261019/README.md).
- **Open-plan anchor:** Section A7 remains open for review of “other grain meals (including the unresolved wheat-meal candidate) and milling products” ([catalog plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected generic gap:** Culinary **defatted wheat bran**, kept separate from ordinary wheat bran, wheat bran flour, wheat germ fractions, and defatted bran from other grains.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, **defatted wheat bran / son de blé dégraissé**. The French compound is a descriptive, provisional display. Add no aliases, forms, reusable measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavour-family, SKU, or retailer-variant research was performed. Commercial-product counts do not add ingredient diversity.

## Identity boundary and naming

Two primary human-food biscuit studies explicitly include defatted wheat bran among the cereal-bran ingredients used in biscuit formulation. Nagi et al. name wheat among the cereal brans defatted in their methods and conclude that full-fat and defatted wheat bran were used in biscuits [S01]. Kaur et al. independently list defatted wheat bran among the cereal brans used in biscuit formulations [S02]. Together these support a generic source-grain-qualified ingredient identity. They do not define a universal commercial grade, a residual-fat threshold, or a consumer defatting procedure.

Keep the proposed identity distinct from:

- **`ingredient-ref-wheat-bran` — wheat bran / son de blé.** This is the existing unqualified wheat-bran milling fraction. Keep its three source-bounded weight observations, its recipe-specific wheat-bran-to-wheat-germ finding, and all source ownership on that row. None establishes a measure or substitution for defatted wheat bran.
- **`ingredient-ref-wheat-bran-flour` — wheat bran flour / farine de son de blé.** Added at R1031, this is flour made from bran, not a fat-removal state. Preserve its identity and study-specific milling and formula evidence.
- **`ingredient-ref-defatted-wheat-germ-meal`**, which is the separate wheat-germ fraction after defatting and milling. It is not bran.
- **`ingredient-ref-defatted-oat-bran`**, **`ingredient-ref-defatted-rice-bran`**, and **`ingredient-ref-defatted-barley-bran`**. These are grain-specific identities; do not transfer their properties, names, measures, or study results to wheat.
- Wheat flour, whole-wheat flour, wheat germ, aleurone, bran-containing blends, and other wheat milling fractions.

Use **son de blé dégraissé** as a transparent descriptive French construction based on the OQLF term **son de blé**. The OQLF entry supplies the base term and English equivalent, but does not attest the compound with *dégraissé*. Keep the French display provisional and both alias arrays empty. Do not add *son de blé déshuilé* or other unverified variants.

## Scope and queued-work disposition

- The open A7 line still points to the unresolved generic wheat-meal question. The historical Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead is a named commercial product and remains **out of scope**: commercial-product counts do not add ingredient diversity. Stop product-only research on that lead. Preserve its R605 history, all existing branded references and product-scoped claims, and the separate unresolved generic wheat-meal question.
- R1063's sorghum fine-shorts review retains a boundary hold; it concerns a different grain and an unsettled milling stream. Do not reopen or transfer its evidence.
- R1067's **defatted barley bran** identity is present in the live reference catalog and ledger. Its Nagi et al. source entry remains scoped to barley. This R1073 proposal uses separate wheat-specific claims from sources that explicitly name wheat; it does not broaden the barley record or transfer a barley result.
- No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Existing branded rows and product-specific evidence remain unchanged.

## Live ownership and recipe-demand audit

Read-only audit of the live repository on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,069** references. No proposed ID or normalized variants such as `defatted wheat bran`, `wheat bran defatted`, `defatted bran from wheat`, `son de blé dégraissé`, or `son de blé déshuilé` are present. Existing wheat bran and wheat bran flour remain separately owned; wheat-germ meal and defatted oat, rice, and barley bran remain distinct. | If accepted, add one new identity and preserve every neighboring reference, alias, measurement, and source claim. |
| Ingredient forms | **205** forms. No form or match term names the proposed identity. | Add no form. Defatting describes the distinct bran ingredient here; the sources establish no reusable form transition or home-preparation state. |
| Research ledger | **2,474** records. No candidate ID, exact candidate wording, or French compound is recorded. The live wheat-bran record is verified with three source-bounded measurements and one recipe-specific finding; the wheat-bran-flour record is separate. The defatted oat, rice, and barley records are also separate. | If accepted, create a separate wheat record and new wheat-scoped source IDs. Keep all present source ownership and findings intact. |
| Legacy import identities | **55** candidates. No exact candidate wording or proposed ID occurs. | No legacy promotion, merge, or alias transfer is proposed. |
| Bundled recipes | **114** manifest-listed files and **1,123** structured ingredient rows. A normalized text scan found no candidate term, proposed ID, or wheat-bran wording in recipe JSON or ingredient rows. | No recipe demand, quantity, or recipe link supports a reusable value. |
| Forms, mappings, rules, and history | No form, unit mapping, conversion, yield, active substitution, recipe link, or prior focused defatted-wheat-bran review was found. R1031 concerns wheat bran flour; R1067 concerns defatted barley bran. | Add no operational data. Keep the prior identities and decisions unchanged. |

The candidate audit checked English and French phrase variants plus the proposed ID across live references, forms, ledger, legacy identities, and the complete recipe bundle. The counts above reflect the current live package and ledger, including the already integrated defatted-barley-bran row.

## Measurements, forms, and substitution limits

No reviewed source establishes a generic household measure, cup weight, density, unit mapping, conversion, cooking yield, or repeatable consumer preparation state for defatted wheat bran. Nagi et al.'s hexane ratio, extraction duration, drying, grinding, and 48-mesh sieving describe a laboratory protocol for study samples [S01]. They are not instructions for home processing, a universal defatting standard, or a commercial-grade specification.

A primary wheat-bran density study was screened as a boundary check, not as evidence for a value on this candidate. It measured **ordinary wheat bran**, separated into coarse, medium, and fine experimental particle-size fractions; its bulk-density values varied by fraction, and its method used a graduated cylinder with shaking or tapping [S03]. It neither defatted the wheat bran nor supplies a kitchen measure for the proposed ingredient. Do not copy those densities, ordinary wheat-bran chart values, or product-specific wheat-bran portions into this row. Recommend `defaultDensity: null`, `unitMappings: []`, no measurement observations, and `measurementState: researched_no_supported_value`.

Both biscuit studies tested particular formulas and materials. Their inclusion percentages and sensory or physicochemical results remain attached to the respective formulations. They do not define a general replacement for wheat flour, a use outside those biscuit formulas, or a contextual rule with a reusable role, quantity basis, and adjustment. If a ledger record is created, set `substitutionResearchState: blocked_pending_evidence`, optionally record a blocked study-specific finding with empty `replacements`, and add no global or contextual rule, recipe-line link, conversion, or yield. Leave forms absent.

## Integrated evidence sources and narrow reuse

The R1073 wheat-specific source IDs below are now recorded in the shared ledger. The existing Nagi et al. source ID remains on the defatted-barley-bran record, and the existing Kaur et al. source ID remains on the defatted-oat-bran record; neither was broadened to support the wheat identity.

| Source | Exact locator | Supports and limitations |
|---|---|---|
| **S01 / `WP02-A7-DEFATTED-WHEAT-BRAN-R1073-20261019-S01`** | H.P.S. Nagi, J. Kaur, B.N. Dar, and S. Sharma, [“Effect of Storage Period and Packaging on the Shelf Life of Cereal Bran Incorporated Biscuits”](https://scialert.net/fulltext/?doi=ajft.2012.301.310), *American Journal of Food Technology* 7(5) (2012), 301–310, DOI [10.3923/ajft.2012.301.310](https://doi.org/10.3923/ajft.2012.301.310). Publisher article/citation and abstract; **Materials and Methods**, “Materials,” “Defatted bran,” “Drying,” “Grinding,” and “Sieving”; **Conclusion**. | Primary human-food study. The abstract describes blending full-fat and defatted cereal brans into biscuits (article lines 17–25, 45–50); methods say wheat bran was procured, wheat is among the brans defatted, and describe the study's hexane protocol and particle preparation (lines 98–108); the conclusion names wheat among the full-fat and defatted brans used in biscuits (lines 189–193). The solvent, wheat sample, extraction ratio/time, drying/grinding/sieve, formula, and results are study-specific. This does not define a generic residual-fat level, consumer process, household measure, density, or transferable substitution. |
| **S02 / `WP02-A7-DEFATTED-WHEAT-BRAN-R1073-20261019-S02`** | J. Kaur, H.P.S. Nagi, Savita Sharma, and B.N. Dar, [“Physico-chemical and sensory quality of cereal bran enriched biscuits”](https://indianjournals.com/article/jdfhs-31-3-004), *Journal of Dairying, Foods & Home Sciences* 31(3) (2012), 176–183. IndianJournals publisher record: article metadata and **Abstract**. | Separate primary human-food study. Its abstract lists defatted wheat among cereal brans used to replace wheat flour in biscuit formulas at tested 0, 5, 10, 15, and 20% levels and reports sensory evaluation. Those proportions and outcomes are formula-specific; they do not constitute a reusable substitution ratio, yield, or household quantity. |
| **Reused source `WP02-S98`** | Office québécois de la langue française, [GDT: `son de blé`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18097318/son-de-ble), entry “son de blé,” term and English translation. Current owner: `ingredient-ref-wheat-bran`. | Supports the base French term and its English equivalent only. It does not attest the compound `son de blé dégraissé`; reuse narrowly and keep the existing source entry on its current owner. |
| **Screened source S03; not proposed as evidence for a candidate measurement** | Oluwatoyin Oladayo Onipe, Daniso Beswa, and Afam Israel Obiefuna Jideani, [“Effect of size reduction on colour, hydration and rheological properties of wheat bran”](https://new.scielo.br/j/cta/a/xTRMfgQ7X9RZgNxTxpLhkvn/?ilang=en&lang=en), *Food Science and Technology* 37(3) (2017), DOI [10.1590/1678-457X.12216](https://doi.org/10.1590/1678-457X.12216). **Materials and methods**, “Sample preparation” and “Bulk and packed density”; **Table 2** and discussion. | Primary study of purchased wheat bran, milled/sieved into study particle-size fractions; it reports different bulk and packed densities by particle size (Table 2). This is ordinary bran, not defatted wheat bran, and laboratory cylinder measurements are not recipe-picker measures. It is cited only to explain why the values are not transferable. |

## Proposed minimal data and ledger state

The accepted integration added only this reference:

```json
{
  "id": "ingredient-ref-defatted-wheat-bran",
  "nameEn": "defatted wheat bran",
  "nameFr": "son de blé dégraissé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The integration created a separate ledger record with:

- `recordId: ingredient-ref-defatted-wheat-bran`; `recordType: ingredient_reference`.
- `identityState: verified`, based on two primary human-food studies that explicitly include defatted wheat bran in biscuit formulations. Keep the French compound descriptive and provisional.
- `measurementState: researched_no_supported_value`; no measurement observation, density, unit mapping, or form.
- `substitutionResearchState: blocked_pending_evidence`; the cited formula levels remain study-specific, with no active rule or recipe link.
- No aliases, conversions, yields, recipe links, or forms.
- Preserve the wheat-bran, wheat-bran-flour, wheat-germ, and defatted oat/rice/barley records and all source-scoped observations. Do not transfer the Nagi study's extraction protocol or either study's sample values, formulas, or outcomes to another identity.

The accepted integration added the generic reference and ledger record, updated the plan and roadmap, and regenerated the catalog index. Static package and ledger checks passed. No software tests, builds, or emulator checks were run because the application change only adds database JSON under `AGENTS.md`. Section A7 remains open for other generic milling gaps.
