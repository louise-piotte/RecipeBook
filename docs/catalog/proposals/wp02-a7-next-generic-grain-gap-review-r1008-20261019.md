# WP02 Section A7 R1008: wild-rice-bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated into the bundled ingredient reference catalog and research ledger, with the review recorded in the R1008–R1010 integration README. No forms or recipe rows were changed.
- **Open-plan anchor:** Section A7 remains open for other grain meals and milling products, including the unresolved generic wheat-meal question ([catalog plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** A bran milling fraction from wild rice, proposed as `wild rice bran / son de riz sauvage`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for wild-rice bran. A 2026 primary study distinguishes a wild-rice bran-powder fraction from whole and milled grain. The evidence supports the milling-fraction identity, while its measurements and material properties remain specific to the study samples.
- **Scope:** One generic culinary milling identity. No brand, product line, flavour family, SKU, or retailer-variant roster was researched.

## Recommendation and identity boundary

Add one identity-only reference for the bran fraction of wild rice, using `wild rice bran` as the English display. Li et al. compare whole grain, milled grain, and bran-powder fractions from *Zizania palustris* wild rice and describe the bran fraction as relevant to cereal-food development. This supports a distinct generic milling-fraction identity rather than another commercial product entry. [S01]

The paper studies *Z. palustris* and does not establish equivalent processing or properties for every species covered by the broader wild-rice name. Keep the proposed evidence boundary at the studied *Z. palustris* fraction; do not claim that all *Zizania* species yield equivalent bran. Keep the candidate separate from ordinary rice bran (*Oryza sativa*), the active whole wild-rice identity, wild-rice flour, wild-rice blend, and puffed wild rice. Do not add aliases.

Use `son de riz sauvage` as a descriptive French display, provisionally. Existing OQLF sources directly attest `riz sauvage` for `wild rice` and support `son` as a cereal-milling term, but neither source attests the compound `son de riz sauvage`. Do not describe the compound as an OQLF-preferred term. [WP03-S12; WP03-BARLEY-BRAN-QC-R89-20261013-S01]

The study's sample sourcing, three kernel-length grades, laboratory milling, bran-powder preparation, composition assays, and antioxidant measurements remain study-specific. They do not define a general commercial grade, extraction rate, stabilization method, household amount, bulk density, serving, nutritional claim, health effect, or recipe substitution. Do not transfer the existing dry/cooked wild-rice CNF portions or any whole-grain measurement to bran.

No alias, form, household measure, density, unit mapping, recipe link, conversion, yield, or substitution is proposed. If accepted, keep measurement and substitution research at `not_yet_researched` until those questions receive separate, source-backed review.

## Minimal proposed reference

```json
{
  "id": "ingredient-ref-wild-rice-bran",
  "nameEn": "wild rice bran",
  "nameFr": "son de riz sauvage",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

## Current exact-owner and recipe-demand audit

Read-only snapshot of the current bundled package and research ledger on 2026-10-19:

| Surface | Current state | Finding |
|---|---:|---|
| Ingredient references | 2,021 | No exact owner for `ingredient-ref-wild-rice-bran`, `wild rice bran`, `wild-rice bran`, `bran of wild rice`, `son de riz sauvage`, or `Zizania palustris bran`. Preserve `ingredient-ref-wild-rice`, `ingredient-ref-wild-rice-flour`, `ingredient-ref-wild-rice-blend`, and `ingredient-ref-puffed-wild-rice`; none is the bran fraction. |
| Ingredient forms | 205 | No wild-rice-bran form, label, or match-term owner. The existing dry and cooked forms remain attached to whole wild rice; do not transfer them. |
| Legacy import identities | 55 candidates | No exact candidate ID or normalized proposed phrase. No legacy promotion or merge is proposed. |
| Research ledger | 2,427 records | No wild-rice-bran identity or exact proposed phrase. DOI `10.1016/j.fochx.2026.103961`, its article URL, and the R1008 source ID are unowned. Existing wild-rice identity evidence remains with its current record; reuse OQLF and Ontario sources only for their existing base-name/taxon claims. |
| Proposal and batch archive | Current archive scanned | No prior wild-rice-bran identity review, candidate ID, article DOI, or article URL was found. The proposed R1008 filename and source-ID prefix are unused. |
| Bundled recipes | 114 manifest-listed files / 1,123 ingredient rows | Full recipe text and ingredient rows contain zero occurrences of the proposed ID, `wild rice bran`, `wild-rice bran`, `son de riz sauvage`, or `Zizania palustris bran`; there are zero direct links to the proposed ID. No recipe demand or recipe link is supported. |

The active `ingredient-ref-wild-rice` identity is `wild rice / riz sauvage`, with dry and cooked forms. The other active wild-rice rows cover flour, a blend, and puffed grain. Keep all of those identities, existing branded rows, and their evidence unchanged. No evidence or measurement is transferred from a branded row or whole-wild-rice form.

## Queued-work disposition

The open A7 parent calls for generic grain meals and milling products. The named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead is a commercial-product-only follow-up and remains out of scope because commercial-product counts do not add ingredient diversity. R875 already recorded this disposition; preserve its historical record and product-scoped evidence, stop that product-only line, and keep the separate generic wheat-meal question unresolved. This review did not research or add any other branded, product-line, flavour-family, SKU, or retailer-variant candidate.

## Source register and limits

| Source ID | Source and locator | Support and limit |
|---|---|---|
| **S01 — `WP02-A7-WILD-RICE-BRAN-R1008-20261019-S01`** | Xin-Yu Li et al., [“Exploring the functional food potential of wild rice (*Zizania palustris*): A comparative analysis of morphological, nutritional, bioactive compounds, and antioxidant activity in whole, milled, and bran fractions”](https://doi.org/10.1016/j.fochx.2026.103961), *Food Chemistry: X* 36 (May 2026), 103961. Abstract; §§1–2.1, 3, and 4. | Primary study explicitly distinguishes wild-rice whole-grain, milled-grain, and bran-powder fractions and identifies the studied grain as *Z. palustris*. It supports the existence of a named milling fraction and research into possible food use. Its commercially packaged market samples, kernel-size grades, milling setup, bran preparation, analytical composition, antioxidant assays, and discussion of potential application remain specific to those study materials; they do not establish a transferable consumer grade, recipe amount, density, or health claim. |
| **Reused: `WP03-S12`** | OQLF, [GDT: riz sauvage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage). | Supports the existing Québec French/English base pair `riz sauvage / wild rice`. It does not attest a bran identity or the proposed French compound. |
| **Reused: `WP03-S13`** | Ontario Ministry of Agriculture, Food and Rural Affairs, [wild rice](https://www.omafra.gov.on.ca/CropOp/fr/field_grain/spec_grains/wiri.html). | Identifies northern wild rice as *Zizania palustris*. Reuse only as taxon context; it does not establish wild-rice bran or a milling specification. |
| **Reused: `WP03-BARLEY-BRAN-QC-R89-20261013-S01`** | OQLF, [GDT: son](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), cereal-processing domain. | Supports the French milling base term `son` only. It does not attest `son de riz sauvage`, wild-rice culinary use, or the bran identity. |

## Disposition

Recommend one identity-only `wild rice bran / son de riz sauvage` reference, with the French compound marked descriptive and provisional. Keep the source boundary at the studied *Zizania palustris* bran-powder fraction, retain all laboratory and sample-specific values in the study context, and add no aliases, forms, recipe links, numeric behavior, conversions, yields, or substitutions. Preserve current wild-rice and rice identities and all product-scoped evidence. Section A7 remains open for other generic milling gaps. This file is the only write in this review; no tests, build, emulator run, or deployment were requested or performed.
