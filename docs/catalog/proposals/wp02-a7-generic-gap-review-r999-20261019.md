# WP02 Section A7 R999: Khorasan-bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal-only. No shared data, plan, roadmap, generated file, recipe, or test has been changed by this proposal.
- **Open-plan anchor:** Section A7 remains open for other grain meals and milling products, including the unresolved generic wheat-meal question ([catalog plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected gap:** The human-food bran fraction from Khorasan wheat, proposed as `Khorasan bran / son de blé khorasan`.
- **Scope:** One generic milling identity. No commercial brands, product lines, flavour families, SKUs, or retailer variants were researched.

## Recommendation and identity boundary

Add one identity-only `GRAIN_AND_CEREAL` reference for bran from Khorasan wheat (*Triticum turgidum* subsp. *turanicum*). The 2025 food-science study identifies one Khorasan sample and prepares its bran for analysis and a common-wheat bread trial. This directly supports a food-use milling-fraction identity, but the evidence comes from one study sample and does not establish a market grade, consumer standard, or general availability. [S01]

Keep Khorasan bran separate from intact Khorasan wheat, Khorasan flour, flakes, semolina, puffed wheat, and generic wheat bran. The OQLF Khorasan entry defines the crop as an ancient durum-wheat variety; it supports the crop boundary and French base name but does not name bran. OQLF’s cereal-milling entry supports `son` as a French base term but does not attest the compound `son de blé khorasan`. Use that compound descriptively and provisionally for Québec. [S02–S03]

The article’s sample, laboratory milling, 0.5 mm grinding, sieve fractions, analytical values, 20% flour replacement in common-wheat type 00 bread, and formula-specific water adjustment stay tied to that study. None is a household amount, a universal grade, or an active substitution rule. Preserve all existing Khorasan and wheat-bran entries and their evidence; do not transfer their product-specific measurements or claims.

No alias, form, household measure, density, unit mapping, recipe link, conversion, yield, or active substitution is proposed.

## Minimal proposed reference

```json
{
  "id": "ingredient-ref-khorasan-bran",
  "nameEn": "Khorasan bran",
  "nameFr": "son de blé khorasan",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

## Ownership and recipe-demand audit

Read-only audit of the bundled data and plan on 2026-10-19:

| Surface | Current state | Finding |
|---|---:|---|
| Ingredient references | 2,013 | No `ingredient-ref-khorasan-bran`, `Khorasan bran`, `Khorasan wheat bran`, `son de blé khorasan`, or `son de khorasan` owner. Preserve `ingredient-ref-khorasan-wheat-grain`, Khorasan flour, flakes, semolina, puffed Khorasan wheat, generic wheat bran, and every other bran fraction. |
| Ingredient forms | 205 | No Khorasan-bran form, label, or match term. Add no form or grade. |
| Legacy import identities | 55 | No Khorasan-bran phrase or candidate ID. No legacy candidate is promoted, removed, or merged. |
| Research ledger | 2,419 | No Khorasan-bran record or exact phrase. The 2025 paper already supports einkorn bran and emmer bran on separate records; this review uses a new Khorasan-specific source ID and locator for the distinct Khorasan claim. Keep all existing source objects and claims unchanged. |
| Bundled recipes | 114 files / 1,123 rows | Manifest-ordered file scan found no occurrence of the proposed ID, Khorasan-bran phrases, or the taxon. No recipe link or demand-driven measure is proposed. |

The paper’s recipe-style bread formula is experimental evidence for the tested Khorasan-bran sample only. It does not support a general replacement amount or a recipe-line link. No product-only lead was opened or pursued.

## Measurement and substitution states

If accepted, create a ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`.

- The targeted measure search returned no transferable Khorasan-bran cup amount, consumer portion, density, or mass-volume mapping. The 250 g sieve aliquot, 1 g water-retention sample, and analytical results are laboratory procedures, not kitchen measures.
- Record at most one blocked finding for the study-specific 20% replacement of total flour mass with bran from its Khorasan sample in a common-wheat type 00 bread formula. The study optimizes water by formula and does not establish a reusable ratio, home-baking recommendation, or hydration adjustment.
- Add no measurement observation, global substitution, contextual substitution, conversion, or recipe-line link.

## Sources

| Source ID | Source and locator | Support and limit |
|---|---|---|
| `WP02-A7-KHORASAN-BRAN-R999-20261019-S01` (proposal-local) | Toumi et al., [“Using Bran of Ancient and Old Grains for Wheat Bread Production”](https://pmc.ncbi.nlm.nih.gov/articles/PMC11898424/), *Foods* 14(5), 860 (2025), DOI 10.3390/foods14050860. Abstract; §2.1 and Table 1; §§2.2–2.3; §§2.6. | Table 1 identifies one ancient-wheat Khorasan sample as *T. turgidum* subsp. *turanicum*. Methods state the resulting bran was analyzed and used in wheat-bread formulations. Supports human-food research use of the milling fraction. The sample, processing, analyses, and formula remain study-specific. The same article supports different cereal-specific claims on earlier ledger records; this new source ID and locator are scoped to Khorasan only. |
| Reused `WP02A4-KH-S01` | OQLF, [GDT: blé khorasan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan). | Identifies the French crop name `blé khorasan`, English Khorasan wheat, and the crop taxon. Supports the crop name and identity only; it does not name bran. Reuse the existing source ID without changing its wheat-grain or flour claims. |
| Reused `WP03-BARLEY-BRAN-QC-R89-20261013-S01` | OQLF, [GDT: son](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), cereal-processing domain. | Supports the French cereal-milling base term `son` only. It does not attest `son de blé khorasan`, establish Khorasan bran, or supply human-food evidence. Reuse only for the lexical base. |

## Disposition

Recommend one identity-only generic Khorasan-bran reference, displayed as `Khorasan bran / son de blé khorasan`, with no aliases or numeric behavior. Keep its French compound provisional, retain the study formula and lab measurements as source-scoped evidence, and preserve all current Khorasan/wheat identities and branded rows without merging or evidence transfer. Section A7 remains open for other generic milling gaps.
