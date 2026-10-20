# WP02 Section A7 R1025: oat bran flour identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, or batch file was changed.
- **Open-plan anchor:** WP02 Section A7 remains open for other grain meals and milling products, including the unresolved generic wheat-meal candidate ([plan, A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** Generic food-use **oat bran flour**, a bran-based milling ingredient named directly in primary noodle and muffin studies.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference, `oat bran flour / farine de son d’avoine`. Keep the French compound descriptive and provisional for Québec. Add no aliases, forms, reusable measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. Do not research or add brands, product lines, flavours, SKUs, or retailer variants. Commercial-product counts do not add ingredient diversity.

## Identity boundary and bilingual naming

The candidate is the generic food ingredient explicitly named **oat bran flour** in food studies and used as a flour component in noodles and muffins [S01–S02]. The reviewed papers do not establish a universal particle size, milling specification, composition, or rule for when oat bran becomes flour. Keep the row limited to the source-named ingredient class; do not infer a fine-grind threshold or treat every oat-bran powder as this candidate.

Keep it separate from:

- **`ingredient-ref-oat-bran` — oat bran / son d’avoine.** This is the existing bran identity, with dry and cooked forms. OQLF says oat bran is also consumed as a powder added to foods or recipes, so the reviewed evidence does not justify adding `oat bran flour`, `ground oat bran`, or `oat bran powder` as aliases to either row [reused S03].
- **`ingredient-ref-defatted-oat-bran` — defatted oat bran / son d’avoine dégraissé.** Oil-removal processing is a separate qualification; preserve its studies and findings on that row.
- **`ingredient-ref-oat-flour` — oat flour / farine d’avoine** and **`ingredient-ref-whole-grain-oat-flour` — whole grain oat flour / farine d’avoine entière.** Those are oat-kernel flour identities, not bran-based flour.
- Oat-bran concentrates, isolated beta-glucan/fibre/protein ingredients, feed-grade fractions, and composite or formulated foods containing bran.

Use the descriptive French display **farine de son d’avoine** provisionally. OQLF’s preferred term is **son d’avoine**; its definition identifies the bran as the oat grain’s outer layer and notes that it is consumed as cereal or powder added to foods. That supports the French base term and culinary context, but does not attest the exact compound **farine de son d’avoine** as a Québec-preferred name [S03]. Keep both alias arrays empty pending independent Québec review. Do not substitute the existing `farine d’avoine` name, which belongs to oat flour.

## Ownership and recipe-demand audit

Read-only repository audit on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,035** active rows. No exact normalized owner was found for `oat bran flour`, `oat-bran flour`, `farine de son d’avoine`, `farine de son d'avoine`, `ground oat bran`, or ID `ingredient-ref-oat-bran-flour`. Nearby owners are oat bran, defatted oat bran, oat flour, and whole-grain oat flour. | A new exact identity is unowned. Preserve each adjacent reference, its aliases, and its evidence. |
| Ingredient forms | **205** forms. The two forms attached to `ingredient-ref-oat-bran` are `dry` and `cooked`; no form owns the candidate ID or flour wording. | Add no form. Flour is proposed as a milling identity, not as a cooking-state form of oat bran. |
| Research ledger | **2,440** records. No exact oat-bran-flour record or record for the two primary-study DOIs below was found. The oat-bran record is identity-verified with measurement and substitution research still `not_yet_researched`; it owns the CNF dry and cooked sources. The defatted-oat-bran record owns its own biscuit/dissertation evidence and a reused OQLF source. | If accepted, create a separate candidate record and source IDs. Do not move any source, state, quantity, or finding from oat bran, defatted oat bran, or oat flour. Reuse the existing OQLF source only for `son d’avoine` and its stated culinary context. |
| Legacy import identities | **55** candidates. No exact English/French candidate wording or proposed ID was found. | No legacy promotion, merge, or alias transfer is proposed. |
| Bundled recipes | Scanned all **114** manifest-listed recipes and **1,123** ingredient rows for the candidate ID, candidate English/French wording, and related oat-bran flour/powder phrases. Found **0 matching recipe files and 0 matching ingredient rows**. | No bundled recipe demand, quantity, or link supports adding a recipe link or reusable value. |
| Proposal/source history | R978 covers defatted oat bran; R962 covers oat germ meal; neither owns oat bran flour. The reused OQLF `son d’avoine` source is currently attached to existing oat-ingredient research. | Preserve those reviews and source ownership; do not duplicate or broaden the OQLF claim. |

The reference search also checked `oat bran`, `oat flour`, and their French displays to confirm the adjacent identities remain distinct. No candidate-specific ingredient link or old identity is present in the bundled package.

## Numeric and substitution limits

The primary studies report formula-specific uses, not household portions or general conversion guidance:

- S01 tests noodle flour blends containing **30% oat bran flour + 70% wheat flour**, and a second blend containing **15% oat bran flour + 15% Tartary buckwheat bran flour + 70% wheat flour**. Its flour samples, ratios, cooking results, and sensory results apply only to the tested noodles.
- S02 uses oat bran flour as a **10% w/w** wheat-flour replacement in one muffin test and at **5% w/w** with another flour in combination tests. Those levels and outcomes apply only to that muffin study.

Neither study supplies a transferable household volume-to-mass amount, bulk density, unit mapping, cooking yield, or all-purpose recipe instruction. Exact-phrase measure checks for oat-bran-flour cup weights and density did not find a generic, authoritative value. If integrated, set measurement research to `researched_no_supported_value`, keep `defaultDensity` null and mappings empty, and add no reusable measurement observation. Keep the reported formula percentages attached only to their source contexts.

The studies demonstrate particular flour-blend/replacement experiments, but they do not establish a recipe-independent or sufficiently bounded contextual replacement rule. If integrated, set substitution research to `blocked_pending_evidence`; preserve the study formulas as source-specific findings only. Add no global or contextual substitution, form conversion, yield, or recipe link.

## Source register

These sources are proposal-local; this review does not add them to the shared ledger.

| Source | Source and locator | What it supports and limits |
|---|---|---|
| **S01 / `WP02-A7-OAT-BRAN-FLOUR-R1025-20261019-S01`** | Peng et al., [“Effects of Oat Bran Flour and Tartary Buckwheat Bran Flour on Structure, Cooking Quality and Digestive Characteristics of Wheat Noodles”](https://www.chinaagrisci.com/EN/abstract/abstract23060.shtml), *Scientia Agricultura Sinica* 56(20) (2023), 4102–4114, DOI [10.3864/j.issn.0578-1752.2023.20.014](https://doi.org/10.3864/j.issn.0578-1752.2023.20.014), abstract and Table 1. | Directly names oat bran flour as an ingredient in wheat noodles and reports sample-specific flour blends and properties. Supports generic culinary use; does not define a standard grind, retail grade, universal composition, household measure, or transferable substitution ratio. |
| **S02 / `WP02-A7-OAT-BRAN-FLOUR-R1025-20261019-S02`** | Hamzacebi & Tacer-Caba, [“Date seed, oat bran and quinoa flours as elements of overall muffin quality”](https://research.itu.edu.tr/en/publications/date-seed-oat-bran-and-quinoa-flours-as-elements-of-overall-muffi/), *Current Research in Nutrition and Food Science* 9(1) (2021), 147–157, DOI [10.12944/CRNFSJ.9.1.15](https://doi.org/10.12944/CRNFSJ.9.1.15), abstract. | Names oat-bran flour in muffin formulation and reports tested replacement levels. Supports food use; the tested muffins and ratios do not establish general baking advice, measure, density, or substitution rule. |
| **Reused S03 / `WP02-B2-OAT-GERM-R933-20261019-S04`** | Office québécois de la langue française, [“son d’avoine” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18955166/son-davoine), last updated 2017. | Defines the preferred French base term and describes oat bran as the grain’s outer layer, separated during flour milling and consumed as cereal or powder added to foods/recipes. Supports the base noun and culinary context only; it does not attest `farine de son d’avoine` or define oat-bran flour as a universal grade. Reuse from existing ledger ownership; do not create a duplicate source record. |

## Cross-category queue scope

The open plan’s named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead is commercial-product-only and remains out of scope because another commercial product count would not add ingredient diversity. Stop that line; preserve the historical [R605 hold](wp02-a7-next-grain-meal-gap-review-r605-20261018.md), generic wheat-meal uncertainty, existing branded rows, and their product-specific evidence. No brand or retailer research was performed for this review.

## Proposed minimal state and decision

If accepted, add only this identity row:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-oat-bran-flour` |
| English display | `oat bran flour` |
| French display | `farine de son d’avoine` (descriptive; provisional for Québec) |
| Category | `FLOUR_AND_STARCH` |
| English/French aliases | Empty |
| Default density / unit mappings | `null` / empty |
| Forms, measurements, recipe links, conversions, yields, active substitutions | None |
| Proposed research states | Identity verified; measurement `researched_no_supported_value`; substitution `blocked_pending_evidence` |

This one identity-only row represents the generic oat-bran-flour ingredient named in primary food studies. Keep it distinct from oat bran and oat-kernel flour, leave the French compound provisional, and preserve all source-specific study amounts without creating reusable measures or active substitutions. This file is proposal-only; no tests or builds were run.
