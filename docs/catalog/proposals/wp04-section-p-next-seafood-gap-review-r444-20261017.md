# WP04 Section P R444 — popcorn shrimp product boundary review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717)). The parent remains open.
- **Scope:** Determine whether the separately named Canadian popcorn-shrimp product class has a distinct owner, stable Québec-facing name, or overlap with the regular and coconut butterfly-shrimp rows. This review does not reopen generic fresh/cooked shrimp, shrimp species, dried or canned shrimp, shrimp balls, tempura shrimp, crab, or any existing product decision.
- **Recommendation:** Add identity-only **popcorn shrimp / crevettes popcorn** as a species-neutral prepared-product identity in PROTEIN, with only the directly supported product-name aliases below. Treat breading wording as a search alias, not a shared form. Keep species and SKU-specific size, tail state, freezing, seasoning, and package facts unassigned. Add no form, reusable measure, density, mapping, recipe link, yield, conversion, or substitution.
- **Status:** Root-reviewed and integrated on 2026-10-17; see the [R443–R445 integration README](../batches/wp02-wp04-wp06-r443-r445-next-gap-review-integration-20261017/README.md). No app tests or emulator checks were run because the changes only add database JSON data and documentation.
- **Allocated source IDs:** WP04-SECTIONP-POPCORN-SHRIMP-R444-20261017-S01 through S05 are now attached to the R444 ledger record. Reused source IDs are identified below.

## Candidate selection and proposed delta

R438 integrated the regular breaded butterfly-shrimp product and explicitly kept the popcorn variant separate. R441 then integrated the separately named coconut butterfly product without changing that boundary. The live Metro listing used by R438 lists regular butterfly shrimp, coconut butterfly shrimp, and breaded popcorn shrimp as separate product names. Current High Liner and BlueWater manufacturer pages, plus Québec-facing retailer listings, now provide enough direct product evidence to review the remaining popcorn-shrimp owner independently. [R438-S09, R441-S06, S01-S05]

The evidence supports one identity for products sold under the popcorn-shrimp name. It does not establish one universal formula, shrimp species, size grade, coating, tail state, frozen/cooked state, or preparation standard.

| Proposed field | Value |
|---|---|
| ID | ingredient-ref-popcorn-shrimp |
| Category | PROTEIN |
| English display | popcorn shrimp |
| French display | crevettes popcorn |
| English aliases | breaded popcorn shrimp; jumbo popcorn shrimp |
| French aliases | crevette popcorn; crevettes popcorn panées |
| defaultDensity | null |
| unitMappings | [] |

Keep bare shrimp/crevette, breaded shrimp/crevettes panées, popcorn, High Liner, BlueWater, and unrelated butterfly, coconut, tempura, species, and formed-product names out of the aliases. The full phrase popcorn shrimp is searchable through the display. The locally attested French wording is commercial usage; it is not presented as an OQLF-approved term.

## Ownership, overlap, and snapshot audit

The audit used the current plan, active references and forms, legacy candidates, research ledger, package-yield and substitution files, recent Section P proposals/batches, IngredientSearch.kt, and the full manifest-listed recipe corpus.

| Surface | Current owner or snapshot | R444 handling |
|---|---|---|
| Section P checklist | The parent item for shrimp/prawn preparations and crab/crayfish remains open. R438 and R441 are accepted children; neither allocates popcorn shrimp. | Review only the distinct product name left separate by R438. |
| Active references | 1,736 references and 141 forms. No normalized display, alias, reference ID, or form owns popcorn shrimp, crevettes popcorn, crevette popcorn, giant/jumbo popcorn shrimp, or the proposed ID. | Propose ingredient-ref-popcorn-shrimp; do not add popcorn language to another row. |
| Nearby popcorn identity | ingredient-ref-popcorn is the ready-popped corn identity, maïs soufflé. It is the only current result for popcorn. | Preserve that row. The broad popcorn query will gain a seafood result if R444 is integrated. |
| Nearby shrimp products | R438 owns regular breaded butterfly shrimp; R441 owns coconut butterfly shrimp; existing rows separately own canned cocktail shrimp, dried shrimp, Northern shrimp, saeu-jeot, shrimp balls, and shrimp pastes. | Do not add popcorn aliases or forms to these rows. Keep popcorn shrimp separate from both butterfly products and all other shrimp states. |
| Legacy candidates and ledger | The 56 legacy candidates contain no popcorn-shrimp candidate. The ledger has 2,095 records, 9,513 source entries, 8,063 distinct source IDs, and 6,779 distinct URLs. No popcorn-shrimp identity/candidate record or proposed ID exists. R438 ledger source S09 notes popcorn shrimp as a separate Metro product; that note is a boundary citation, not an allocated owner. | Add no legacy mapping and do not duplicate the R438 S09 source record. |
| Forms, package yields, substitutions | No popcorn-shrimp form, package-yield record, substitution observation, or substitution rule is allocated. The shared substitution files have no active rules. | Add none. |
| Recent Section P R4xx decisions | R401 holds cod roe; R404 adds steamed monkfish liver; R407 adds salmon roe; R410 holds Nenu Dieune; R413 holds sujiko; R416 holds herring roe; R419 adds masago; R422 adds tobiko; R428 adds whole tilapia; R432 adds crab cake; R435 adds crab claws; R438 adds breaded butterfly shrimp; R441 adds coconut butterfly shrimp. The R4xx roe, fish, and crab decisions do not own this product. | Keep each decision unchanged. Only R438/R441 are immediate shrimp-product neighbors, and both preserve the popcorn boundary. |
| Proposed identifiers and URLs | No R444 source-ID-prefix collision, proposed reference-ID collision, or exact URL collision was found for S01-S05. The target proposal path was unused. | Keep the five new IDs local to this proposal until root review. Reuse earlier terminology, CFIA, and category-page evidence by its existing ID. |

The listed current counts are the post-R441 snapshot. R438’s S09 and R441’s S06 are reused only for their market-category boundary; neither replaces the direct product-page evidence below.

## Picker projection

Projection follows the live normalization and phrase-first/substring search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses all current reference and form terms plus the proposed display and aliases.

| Query | Current result | With proposed row |
|---|---|---|
| popcorn shrimp; breaded popcorn shrimp; jumbo popcorn shrimp | None | ingredient-ref-popcorn-shrimp only |
| crevettes popcorn; crevette popcorn; crevettes popcorn panées | None | ingredient-ref-popcorn-shrimp only |
| shrimp | Seven results: breaded butterfly shrimp, canned cocktail shrimp, coconut butterfly shrimp, dried shrimp, Northern shrimp, saeu-jeot, and shrimp balls | Same seven plus popcorn shrimp (eight) |
| crevettes | Eleven results, including the existing shrimp preparations and pastes | Same eleven plus popcorn shrimp (twelve) |
| popcorn | ingredient-ref-popcorn only | ingredient-ref-popcorn plus ingredient-ref-popcorn-shrimp |
| breaded | breaded butterfly shrimp and frozen breaded fish sticks | Those two plus popcorn shrimp |
| butterfly shrimp; coconut butterfly shrimp; coconut shrimp | R438 and R441; R441 only; no result | Unchanged |
| shrimp balls; crab cake; crab claws | Each selects its dedicated existing row | Unchanged |

The broad popcorn result changes from one corn identity to a two-result corn/seafood query. Exact popcorn-shrimp and crevettes-popcorn phrases select only the proposed product row. This is an explicit picker cost, not a reason to assign popcorn shrimp to the unrelated corn reference.

## Manifest recipe-demand scan

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were parsed. The scan searched each full recipe document and each structured ingredient row for popcorn, popcorn shrimp, jumbo/giant/breaded popcorn shrimp, shrimp, crevette/crevettes, popcorn crevette variants, butterfly shrimp, shrimp balls, and tempura.

There were zero matching recipe files and zero matching ingredient rows for every searched term. The corpus therefore contains no request for popcorn shrimp and no shrimp or crevette ingredient line. No recipe link, recipe edit, or recipe-derived amount is proposed.

## Numeric, form, and substitution boundaries

- **Species:** Do not assign a taxon. The manufacturer and retailer product pages name shrimp without naming a species. CFIA Fish List evidence shows that broad shrimp names relate to multiple taxa; it supports leaving the species field unassigned, not a product taxonomy.
- **Forms:** Add no form under shrimp or under the proposed product. Popcorn shrimp is the product identity selected from current market names. Do not infer a universal breaded, tail-off, frozen, or cooked form from one SKU’s presentation.
- **Measures and package values:** High Liner lists a 330 g package and a nutrition serving of six shrimp (92 g); BlueWater lists a separate 325 g package. Keep these values specific to their own products. A nutrition serving does not establish a reusable count-to-mass conversion, a package yield, portion weight, density, or volume mapping. Add no active measure or numeric observation.
- **Substitutions:** Add no global or contextual rule between popcorn shrimp and generic shrimp, regular/coconut butterfly shrimp, tempura shrimp, canned/dried shrimp, shrimp balls, fish sticks, crab, or another seafood. The sources describe branded products and cooking directions, not a tested recipe- and method-scoped interchange.
- **Ledger state if accepted:** Use one ingredient-reference record with identityState verified, measurementState researched_no_supported_value, and substitutionResearchState not_yet_researched. Do not add measurement, package-yield, form, conversion, substitution, or recipe-line records.

## Sources and limits

The pages were checked on 2026-10-17. Manufacturer pages establish their own product names and SKU descriptions. Québec grocery pages support locally visible wording and current product listings; they do not establish a province-wide terminology standard, steady store inventory, or common product formula. The French product name below is supported as Québec/Canadian commercial usage. No exact OQLF entry for popcorn shrimp/crevettes popcorn was found. The OQLF butterfly-shrimp entry is used only for the neighboring product boundary. MAPAQ is not used because this is a multi-brand prepared retail product review with no claim about a Québec fishery or taxon.

| Source ID | Source | Evidence and limit |
|---|---|---|
| WP04-SECTIONP-POPCORN-SHRIMP-R444-20261017-S01 | High Liner, [Jumbo Popcorn Shrimp](https://www.highliner.com/products/family-favourites/family-favourites-jumbo-popcorn-shrimp). | Current manufacturer page names Jumbo Popcorn Shrimp, describes a crispy breaded coating, and lists 330 g plus a serving of six shrimp (92 g). These are High Liner product facts, not general product specifications or a reusable measure. |
| WP04-SECTIONP-POPCORN-SHRIMP-R444-20261017-S02 | BlueWater Seafoods, [Popcorn Shrimp](https://www.bluewater.ca/en/products/popcorn-shrimp/). | Current manufacturer page names Popcorn Shrimp and describes a 325 g tail-off shrimp product breaded with panko. Its product formula, tail state, weight, and cooking directions are BlueWater-specific. |
| WP04-SECTIONP-POPCORN-SHRIMP-R444-20261017-S03 | BlueWater Seafoods, [Crevettes Popcorn](https://www.bluewater.ca/fr/produits/crevettes-popcorn/). | French manufacturer page for the same BlueWater product as S02. Directly supports Crevettes Popcorn and the breaded product description, but is not an independent product/formula or an OQLF terminology ruling. |
| WP04-SECTIONP-POPCORN-SHRIMP-R444-20261017-S04 | Super C Québec, [Crevettes popcorn panées sans queue surgelées, BlueWater product 062218153091](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crevettes-popcorn-panees-sans-queue-surgelees/p/062218153091). | Current Québec-facing retailer title, 325 g SKU, and ingredient-panel wording. The retailer page did not open directly in the research browser, so these product details rely on its current indexed listing; no price or selected-store stock claim is used. Same BlueWater product as S02/S03, not an independent formulation. |
| WP04-SECTIONP-POPCORN-SHRIMP-R444-20261017-S05 | Metro Québec, [seasoned and breaded seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes). | Current listing includes High Liner’s “Crevettes popcorn géantes panées et surgelées” 330 g item 061763002267. The product-detail page returned 403 in the research browser; no price, promotion, or store-stock claim is used. It is the same High Liner product as S01, not an independent formula. |
| Reused WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S01 | Office québécois de la langue française, [crevette en papillon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497145/crevette-en-papillon), R438 source S01. | Gives the Québec French/English butterfly-shrimp pair only. It does not define popcorn shrimp or the French popcorn product name. Reused for the adjacent product boundary; no duplicate source entry. |
| Reused WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S03 and WP04-ABALONE-20261011-S03 | CFIA, [Fish List shrimp lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp) and [common-names guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Existing Fish List and common-name guidance sources show that fish species common names are species-linked and that broad shrimp names span taxa. This supports leaving product species unassigned; CFIA does not define popcorn shrimp as a prepared-food category. Reuse the existing source IDs/URLs. |
| Reused WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S09 | Metro, [current English seafood listings](https://www.metro.ca/en/online-grocery/themed-baskets/mmmazing/seafood) and [French seasoned-and-breaded seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes), R438 source S09. | Separates regular butterfly shrimp, coconut butterfly shrimp, and breaded popcorn shrimp in current listings. Supports a product-name boundary only, not a shared recipe, formula, or substitution. Reuse without duplicating the ledger source. |
| Reused WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S06 | Metro Québec, [frozen seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer), R441 source S06. | Supports keeping generic coconut shrimp separate from coconut butterfly shrimp and other shrimp product names. Reused as neighboring scope; no new source entry. |
| WP04-SECTIONP-POPCORN-SHRIMP-R444-20261017-R01 | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717), current references/forms/legacy candidates/ledger/package-yield and substitution files, recent Section P proposals/batches, IngredientSearch.kt, and all manifest-listed recipe files. | Confirms the repository snapshot, owner/source-ID/URL checks, picker projection, and recipe scan. This audit does not extend external-source claims. |

## Disposition and integration recommendation

Recommend adding identity-only popcorn shrimp / crevettes popcorn with only the displays and exact product-name variants above. The proposal is supported by two current manufacturer product lines and Québec-facing retail names, while the market pages preserve meaningful differences between butterfly and popcorn products. Keep the product species-neutral. Retain each 330 g/325 g package and High Liner six-shrimp/92 g nutrition serving as source-specific only; add no active numeric data, form, recipe link, or substitution.

If integrated, reuse the existing OQLF and CFIA source IDs plus R438 S09 and R441 S06; attach S01-S05 as new sources. Preserve ingredient-ref-popcorn as corn and both butterfly identities as separate seafood products. The full bundle has no matching demand. Section P remains open for the broader shrimp, crab, crayfish, and seafood coverage.

No shared catalog, ledger, plan, roadmap, recipe, index, or code update is made by this proposal.

