# WP04 Section P — Hiramasa product-boundary review (R85)

- **Recommendation:** Hold a general Hiramasa ingredient reference and keep it out of active references, forms, aliases, recipes, and the research ledger for now.
- **Candidate:** Hiramasa, a Japanese-market name associated with *Seriola lalandi* in some product lines.
- **Checklist scope:** The open Section P parent line says: “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.” See the [live Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4217).
- **Snapshot:** 1,415 ingredient references, 104 forms, 63 legacy candidates, 1,754 research-ledger records, and 114 bundled recipes with 1,123 ingredient rows.
- **Scope of this review:** This is distinct from the accepted [R84 cobia identity](wp04-section-p-cobia-identity-review-r84-20261013.md) and its [integration batch](../batches/wp02-wp03-wp04-r84-integration-20261013/README.md), as well as other archived Section P fish reviews. The archive, active references/forms, legacy candidates, ledger, plan, and roadmap contain no prior Hiramasa or *Seriola lalandi* decision.

## Decision and evidence boundary

The evidence establishes a specific Hiramasa product line from Clean Seas as *Seriola lalandi*. Poissonnerie La Mer’s Montréal arrival list separately names a Hiramasa fillet from Australia and a whole-fish Hiramasa H&G line marked “CLEAN SEAS.” The fillet row does not carry the Clean Seas mark or a scientific name. Clean Seas itself says its Yellowtail Kingfish is *S. lalandi* and that its Kingfish is also known as Hiramasa. That is enough to identify the branded whole-fish line, but it does not establish that the separate unbranded fillet line is the same branded product.

The plain market name also has a species boundary problem. A Monterey Bay Aquarium Seafood Watch report focused on Mexican aquaculture says *S. lalandi* and *S. rivoliana* products are both marketed as Hiramasa among other names. This is not evidence that the Montréal products are either species; it shows why Hiramasa alone is not a globally stable taxonomic alias.

Québec French naming adds another boundary. CFIA lists *S. lalandi* as Great Amberjack / Sériole chicard. OQLF’s entry for the unqualified French name sériole instead maps it to *S. dumerili* and gives greater amberjack as its English equivalent. I found no OQLF GDT entry for sériole chicard in this lookup. Using sériole alone for *S. lalandi* would therefore conflict with the Québec entry. The CFIA French species name is usable evidence, but the Québec-facing supplier presents the name Hiramasa in both columns rather than sériole/chicard terminology.

**Hold condition:** Reconsider a species-level catalog row when the Québec supplier identifies the fillet’s species or explicitly confirms that the unbranded fillet is the Clean Seas *S. lalandi* product. If only the Clean Seas SKU is in scope, retain that limit in any later proposal; do not generalize its alias to all Hiramasa products.

## Live ownership and overlap audit

Exact scans of the current [reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json) found no owner for Hiramasa, *Seriola lalandi*, Great Amberjack, Sériole chicard, or Yellowtail Kingfish. No prior proposal, batch README, checklist history, or [roadmap entry](../../../roadmap.md) contains this candidate. The proposed source-ID prefix WP04-SECTIONP-HIRAMASA-BOUNDARY-R85-20261013- is unused. No active ID is reserved because this is a hold.

The active catalog contains nearby fish identities such as cobia, barracuda, Atlantic and Pacific mackerel, and multiple other regionally scoped fish; none is an alias owner for Hiramasa. The OQLF lexical entry for sériole is not an active ingredient reference and describes *S. dumerili*, a different species. No reference, form, ledger row, legacy candidate, recipe link, or picker alias is proposed in this review.

## Identity, product, form, measurement, and substitution limits

| Question | Finding | Catalog consequence |
|---|---|---|
| Identity | Clean Seas maps its own Hiramasa / Yellowtail Kingfish to *Seriola lalandi*. The La Mer whole-fish listing marks a Hiramasa H&G SKU “CLEAN SEAS”; the separate fillet entry names no species or brand. Another aquaculture market report applies Hiramasa to both *S. lalandi* and *S. rivoliana*. | Do not assign the general Québec Hiramasa fillet label to one taxon yet. No active identity or alias. |
| Québec French display | CFIA supplies Sériole chicard for *S. lalandi*. OQLF’s unqualified sériole entry is *S. dumerili*, not *S. lalandi*. La Mer prints Hiramasa in both FR and EN columns. | Do not use bare sériole as the French label or alias. A later taxon-level proposal should decide whether the CFIA term is suitable for display alongside the seller’s borrowed trade name. |
| Product presentations | The seller lists a filet under its FILLETS section and a separate Hiramasa H&G line under WHOLE FISH. The source does not define H&G or state that the fillet uses the same branded fish. | Do not add fillet, whole, head-off, or gutted forms from these listings. The category headings remain seller presentation, not reusable catalog state. |
| Measurement | The seller’s sale-unit column says KG. The whole-fish line has a size value of 6/8 with no unit or definition. | KG is a sale unit; 6/8 is unexplained. Neither is an ingredient amount, portion, count-to-mass mapping, package conversion, or reusable measurement. |
| Conversion and yield | No source provides a recipe conversion, density, edible yield, or processing ratio for this candidate. | Add no conversions, density, or yield. |
| Substitution | The bundled recipes contain no Hiramasa demand, recipe role, or method. No source supports replacing another amberjack or fish in a recipe. | Add no substitutions, directed form rules, or recipe-line links. Do not infer raw-use or cooking equivalence. |

The CFIA Fish List marks *S. lalandi* as subject to histamine; that is a regulatory risk classification, not a recipe measure, product form, or equivalence rule, and this proposal does not copy it into ingredient data.

## Picker and recipe-corpus review

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns complete-word-phrase matches before substring fallback, and searches aliases plus attached form terms. In the current 1,415-reference/104-form catalog, direct simulations for Hiramasa, *Seriola lalandi*, Great Amberjack, Sériole chicard, Yellowtail Kingfish, yellowtail, amberjack, and sériole return no results.

Counterfactual behavior explains why the product boundary should stay explicit. If an entry used CFIA’s Great Amberjack / Sériole chicard names, a one-word amberjack query would still match the “Great Amberjack” phrase, and sériole would match inside “Sériole chicard.” The current catalog has no competing Seriola entry, so either query would misleadingly return just the proposed fish. CFIA lists other amberjack and Seriola taxa, and OQLF assigns bare sériole to *S. dumerili*. Do not add bare amberjack, yellowtail, kingfish, or sériole aliases. A later species-specific entry would need a decision about how to expose the term Hiramasa without implying a global synonym.

All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned for Hiramasa, *Seriola lalandi*, Great Amberjack, Sériole chicard, Yellowtail Kingfish, and Clean Seas. The scan found no matching recipe file or ingredient row; there is no bundled recipe demand.

## Prospective integration delta

No integration is recommended in R85. The prospective delta is empty: no reference, form, alias, legacy candidate, ledger record, recipe link, measurement, conversion, yield, or substitution change. There is no JSON snippet to apply.

## Source register

Sources were checked on 2026-10-13. Source IDs are unique to this proposal.

| Source ID | Source | Supports | Limits |
|---|---|---|---|
| WP04-SECTIONP-HIRAMASA-BOUNDARY-R85-20261013-S01 | Canadian Food Inspection Agency, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), entries for TSN 168695 and related Seriola rows; page modified 2023-09-18. | Maps *S. lalandi* to Great Amberjack / Sériole chicard. The same table lists different English and French names for *S. dumerili*, *S. quinqueradiata*, *S. rivoliana*, *Seriola* spp., and *S. zonata*. | Canadian fish-label terminology, not proof of Québec inventory or a culinary alias. Risk-group classifications are not imported into the catalog. |
| WP04-SECTIONP-HIRAMASA-BOUNDARY-R85-20261013-S02 | Office québécois de la langue française, [GDT: sériole](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198975/seriole), updated 2012. | Prefers sériole for edible *S. dumerili*, with English greater amberjack; notes that grande sériole and sériole couronnée were not retained by the fish-products terminology committee. | This is a different Seriola species. It does not establish a preferred Québec term for *S. lalandi*. |
| WP04-SECTIONP-HIRAMASA-BOUNDARY-R85-20261013-S03 | Poissonnerie La Mer, [arrival list / liste des arrivages, 2026-01-23](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_23-01-2026.pdf?v=1769118808), page 1, lines 18 and 61. | Montréal seller lists FILET DE HIRAMASA / HIRAMASA FILLET, Australia, KG; separately lists HIRAMASA H&G in the whole-fish section, Australia, size 6/8, note “CLEAN SEAS,” KG. | Dated product listing, not current stock. Neither row gives the Latin name. The Clean Seas note applies only to the H&G row. No size unit or H&G expansion is given. |
| WP04-SECTIONP-HIRAMASA-BOUNDARY-R85-20261013-S04 | Poissonnerie La Mer, [arrival list / liste des arrivages, 2026-04-17](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_17-04-2026.pdf?v=1776376250), page 1, Hiramasa fillet row. | A second dated Montréal listing again gives FILET DE HIRAMASA / HIRAMASA FILLET, Australia, with KG as sale unit. | It does not state the species or tie this fillet to the Clean Seas H&G SKU. Dated listing, not October inventory. |
| WP04-SECTIONP-HIRAMASA-BOUNDARY-R85-20261013-S05 | Clean Seas Seafood, [Our Fish](https://cleanseas.com.au/our-fish/). | Producer says its Yellowtail Kingfish is *Seriola lalandi* and that its Kingfish is also known as Hiramasa. | This maps the producer’s own line, not every product sold as Hiramasa. It does not establish that La Mer’s separately listed filet carries this brand. |
| WP04-SECTIONP-HIRAMASA-BOUNDARY-R85-20261013-S06 | Monterey Bay Aquarium Seafood Watch, [Mexico yellowtail/amberjack assessment](https://www.seafoodwatch.org/globalassets/sfw-data-blocks/reports/a/mba_seafoodwatch_amberjackmexico_report.pdf), introduction, p. 7. | Says Mexican farmed products from *S. lalandi* and *S. rivoliana* are marketed under overlapping names including Hiramasa. | Scope is Mexican aquaculture. It demonstrates market-name variability, not species identity for the Montréal listings or all global usage. |

## Static review record

- Read the current [AGENTS.md](../../../AGENTS.md), live Section P line, current roadmap, active catalog, forms, legacy candidates, research ledger, proposal archive, batch archive, and current picker source. The instruction states that database-JSON-only additions need no tests; this is documentation-only, so no app tests or emulator were run.
- Verified the active counts and manifest totals stated above. No Hiramasa or *S. lalandi* owner or prior decision was found in the scanned active data, archive, plan, or roadmap.
- Scanned all manifest recipes and rows for the candidate names; zero recipe hits.
- Checked the picker projection against the live search algorithm; current searches return no result, while broad counterfactual queries would use the partial words in the CFIA labels.
- Checked source-ID uniqueness, all local Markdown links, UTF-8 without BOM, final newline, and trailing whitespace after writing. No prospective JSON snippet was included, so JSON-snippet/schema validation is not applicable.
