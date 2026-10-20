# WP04 Section P R597 — North African catfish picker hold

Date: 2026-10-17

## Decision

Keep North African catfish, *Clarias gariepinus*, outside active references, legacy identities, and the shared research ledger. CFIA lists an exact Canadian species-label pair, but adding the French name would make a broad `poisson-chat` query return this one species alone. The current catalog has no generic French catfish result, and no bundled recipe or Canadian/Québec product request disambiguates the broad query. No reference, form, measure, conversion, yield, recipe link, or substitution was added.

This hold concerns picker scope; it does not reject the CFIA names as valid labels. Revisit after the picker can preserve broad French catfish scope or a source-backed recipe/product makes a species-specific request.

## Evidence

- CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp): TSN 164125 identifies *Clarias gariepinus* as North African Catfish / Poisson-chat Nord Africain and African Catfish / Poisson-chat Africain. The same list gives Bighead Catfish / Poisson-chat for *Clarias macrocephalus*, underscoring why the generic French phrase should remain broad. Reused existing CFIA source IDs; no source rows were added to the shared ledger.
- CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list): describes the Canadian fish-label role and acceptable English/French common names, scientific names, and TSNs.
- FAO, [A review of on-farm feed management practices for North African catfish (*Clarias gariepinus*) in sub-Saharan Africa](https://www.fao.org/fishery/docs/CDrom/T583/root/17.pdf), 2013: supports the taxon and historical aquaculture context only.
- Ghana Fisheries Commission, [2023 Annual Performance Report](https://www.mofaq.gov.gh/wp-content/uploads/2025/04/Very-final_2023-APR-FINAL-02082024_Board.pdf), published April 2024: reports 2023 output under “African catfish,” but the cited table does not give a scientific name, so the category is not mapped to *C. gariepinus*.

The source-era and taxonomy limits stay explicit. FAO’s regional production statistics are historical; Ghana’s report gives a dated African-catfish category without a species-level identification. Neither source establishes Canadian availability or a recipe use.

See the [R597 proposal](../../proposals/wp04-section-p-next-seafood-review-r597-20261017.md), the [regional finfish checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6426), and the broader [Section P review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14981). Both larger plan items remain open.

## Static verification

The proposal’s source ownership, picker projection, and bundled-recipe scan found no candidate owner or recipe demand. UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No catalog JSON changed and no app tests, build, emulator check, or deployment were needed for this documentation-only hold.
