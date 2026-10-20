# WP02 Section A7 R972: defatted rice bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, checklist, or recipe data was changed.
- **Open-plan anchor:** Section A7 remains open for other grain meals and milling products ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected gap:** Generic **defatted rice bran**, a rice-bran fraction after oil removal and used as an ingredient in human-food research.
- **Recommendation:** If accepted, add one identity-only GRAIN_AND_CEREAL reference for “defatted rice bran / son de riz dégraissé.” Keep it separate from the existing raw/general rice-bran identity. Add no aliases, forms, measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavour-family, SKU, or retailer roster was researched. Preserve existing branded rows and keep their evidence and product-specific values on their current owners.

## Candidate selection and identity boundary

Primary food-science studies identify defatted rice bran as rice bran after oil extraction and test it as an ingredient in chapati and bread formulations [S01–S02]. This is a distinct processed milling ingredient, not another named rice-bran product. The studies also distinguish laboratory-prepared and commercial samples, which is a reason to keep their sample properties scoped rather than treating every defatted rice bran as compositionally or functionally identical.

Keep the proposed identity separate from:

- ingredient-ref-rice-bran, the existing generic “rice bran / son de riz” row. Defatting changes the ingredient material; it is not an alias or a presentation form of the active row.
- ingredient-ref-rice-bran-oil, the extracted oil.
- Rice germ, rice flour, rice starch, bran extracts, isolated hemicellulose/fibre, and protein concentrates.
- Stabilized or named retail products, feed-grade bran, and composite foods containing rice bran.

The proposed English name is the exact generic term used in both reviewed food studies. The proposed French display “son de riz dégraissé” is a transparent, provisional construction. The existing rice-bran ledger record already owns Canadian/French evidence for “son de riz” on a human-food ingredient label, and the CFIA source requires the source cereal to be named for bran. The FAO French-language source uses “son de riz stabilisé et dégraissé”; it supports the descriptive wording but is not a Québec product label or OQLF ruling [S03]. The existing OQLF entry uses preferred “issues de riz” for a definition framed around stock feed and medicinal use; it does not approve the proposed human-food compound [reused WP03-RICE-BRAN-20261013-S06]. Keep the French compound provisional and both alias arrays empty.

The exact proposed English and French phrases currently have no active owner. Broad “rice bran” and “son de riz” searches belong to the current raw/general rice-bran row; after adding the longer qualified display, those broad searches may surface both distinct identities. Do not move a raw-bran alias to the proposed row.

## Ownership and recipe-demand snapshot

Read-only audit of the live repository on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **1,989** references. No exact proposed ID, “defatted rice bran,” or “son de riz dégraissé” display or alias is active. The adjacent owner is ingredient-ref-rice-bran, “rice bran / son de riz,” category GRAIN_AND_CEREAL. | Add one separate process-defined identity only if accepted. Preserve the current raw/general row and all branded entries. |
| Ingredient forms | **205** forms. No candidate ID or exact defatted-rice-bran term is registered. | Add no form; oil removal defines a processed ingredient identity, not a reusable preparation form. |
| Legacy import identities | **55** candidates. No exact proposed ID, English name, or French display is present. | No legacy promotion, merge, or alias transfer is needed. |
| Research ledger | **2,394** records. No generic defatted-rice-bran record or exact candidate phrase is present. The existing rice-bran record owns its own source entries, a Westpoint Naturals stabilized-rice-bran label observation, and a blocked muffin/cake replacement finding. | If accepted, allocate a new identity record and new primary-study source entries. Keep raw-bran evidence and its existing source ownership unchanged. |
| Bundled recipes | **114** manifest-listed recipes and **1,123** ingredient rows. A normalized scan of the full recipe JSON and ingredient rows for “defatted rice bran,” “defatted-rice-bran,” “de-oiled rice bran,” “rice bran meal,” “son de riz dégraissé,” and “issues de riz dégraissées” found **0 recipe files, 0 matching ingredient rows, and 0 direct links** to the proposed ID. | There is no bundled recipe demand or recipe-line amount/link supporting the candidate. |

The existing raw/general rice-bran record is researched_no_supported_value for reusable measurement behavior and has blocked_pending_evidence substitution research. Its one 2 tbsp (15 g) observation is from a Westpoint Naturals stabilized-rice-bran product label; its muffin/cake suggestion is for that same product. Neither transfers to generic defatted rice bran. Preserve the existing row and its source-specific evidence without alteration.

## Evidence and limits

| Proposal-local source | Evidence and limits |
|---|---|
| **S01.** Deep N. Yadav, Krishna K. Singh, and Jagbir Rehal, [“Studies on fortification of wheat flour with defatted rice bran for chapati making”](https://pmc.ncbi.nlm.nih.gov/articles/PMC3550885/), *Journal of Food Science and Technology* 49(1), 96–102 (2012), DOI [10.1007/s13197-011-0264-9](https://doi.org/10.1007/s13197-011-0264-9). | The authors identify edible-grade defatted rice bran sourced from a local extraction unit and use it in wheat-flour chapati trials. The paper varies particle size and blend percentage. Those sample, sieve, stabilization, formula, and sensory findings are limited to the study; they do not establish a standard grade, home-recipe ratio, household measure, density, or general replacement advice. |
| **S02.** Sudha Sairam, A. G. Gopala Krishna, and Asna Urooj, [“Physico-chemical characteristics of defatted rice bran and its utilization in a bakery product”](https://pmc.ncbi.nlm.nih.gov/articles/PMC3551176/), *Journal of Food Science and Technology* 48(4), 478–483 (2011), DOI [10.1007/s13197-011-0262-y](https://doi.org/10.1007/s13197-011-0262-y). | The study compares laboratory solvent-extracted and commercial defatted-bran samples and uses one commercial sample in bread trials. Its sample properties, bulk-density and absorption data, bread formulations, and outcomes remain tied to those exact samples and methods; they do not support a generic consumer measure or reusable density. |
| **S03.** FAO, [Le riz dans la nutrition humaine — Valeur nutritionnelle du riz et des régimes alimentaires à base de riz](https://www.fao.org/4/t0567f/T0567F08.htm), section “Effet hypocholestérolémique du son de riz,” accessed 2026-10-19. | Provides the French-language wording “son de riz stabilisé et dégraissé.” The paragraph cites animal-study findings and is used here only as a wording attestation, not as a human-food claim, Québec-preferred term, product definition, or numeric evidence. |

The new R972 source IDs are WP02-A7-DEFATTED-RICE-BRAN-R972-20261019-S01 through S03. The IDs and exact URLs above were absent from the live ledger and proposal/batch archive during this audit.

Reuse existing source ownership only for the adjacent generic rice-bran naming boundary:

- WP03-RICE-BRAN-20261013-S02 and S03 are the existing CFIA English and French bran-naming sources; they support naming the cereal source, not the proposed defatting process.
- WP03-RICE-BRAN-20261013-S04 is the existing Enjoy Life Canada French ingredient glossary using “son de riz” for human food; it supports the base phrase, not the defatted qualifier.
- WP03-RICE-BRAN-20261013-S06 is the existing OQLF “issues de riz” entry; it is not evidence for the proposed Québec human-food compound.

These sources remain owned by the active raw/general rice-bran ledger record. Reuse their source IDs in a future integration if needed; do not create duplicate ledger entries. WP03-RICE-BRAN-20261013-S01, the Westpoint product page, remains product-specific and is not used as evidence for the proposed identity.

## Measurement and substitution review

- **Measurement:** Bounded exact-name searches covered household volume/weight wording and generic bulk-density wording, without researching brands or retail variants. No supported household measure, recipe-serving weight, or transferable g/ml density was found. The two primary papers report laboratory or named-sample properties, not a general kitchen conversion. If integrated, set measurement research to researched_no_supported_value; add no measurement observation, form, unit mapping, default density, conversion, or package yield. Do not transfer the raw-bran Westpoint 2 tbsp (15 g) label portion.
- **Substitution:** S01 and S02 study defatted rice bran as a partial component in particular wheat-flour chapati and bread formulations. Their particle sizes, blend percentages, dough behavior, ingredient lots, methods, and results are experimental conditions, not reusable recipe substitutions. The existing raw-bran row's Westpoint suggestion is limited to muffins/cakes and a named stabilized retail product. If integrated, retain blocked_pending_evidence for contextual substitution research and add no finding that recommends another ingredient, no global or contextual rule, and no recipe-line substitution link.

## Proposed minimal state

If accepted, add only:

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-defatted-rice-bran |
| English display | defatted rice bran |
| French display | son de riz dégraissé (provisional descriptive construction) |
| Category | GRAIN_AND_CEREAL |
| English/French aliases | Empty |
| Default density / unit mappings | null / empty |
| Forms, recipe links, conversions, yields, active rules | None |
| Proposed research states | Identity verified; measurement researched_no_supported_value; substitution blocked_pending_evidence |

Keep all existing rice-bran and branded entries, names, references, source ownership, evidence, and measurements unchanged. Do not transfer product-specific measurements or claims without a separate transferability review.

## Cross-category queue scope

The current A7 checklist repeats Anson Mills’ named Colonial-Style Toasted Stone Cut Wheat Meal as a product-only lead while also stating it is out of scope ([plan, line 2301](../../RecipeBook-global-ingredient-catalog-plan.txt#L2301)). Do not research or expand that commercial product: commercial-product counts do not add ingredient diversity. Preserve the historical R605 record and all existing evidence. The two Section F commercial cereal-roster clauses are already marked out of scope in the plan; the latest cross-category scope note reports no new roster-only assignment. No brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued for R972.
