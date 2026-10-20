# WP04 Section P — crayfish / crawfish / écrevisse picker-boundary recheck (R501)

- **Review and source-access date:** 2026-10-17.
- **Packet type:** proposal-only reassessment of the existing freshwater-crayfish candidate, current Canadian and Québec food-market usage, and picker boundary.
- **Recommendation:** Promote the existing ledger ID **ingredient-ref-crayfish** to a bounded identity-only **freshwater crayfish / écrevisse d’eau douce** row in **PROTEIN**, with no aliases or forms. Keep **crawfish** out of the global alias list.
- **Status:** Proposed; no catalog JSON, ledger, generated code, plan, roadmap, workflow, or recipe was changed. Root owns any integration.
- **Scope:** Edible freshwater crayfish as an ingredient class. This does not identify a species or claim that live, cooked, frozen, whole-animal, tail, and picked-meat products are interchangeable.

## Why this reopens the hold

The 2026-10-12 hold correctly declined to map the unqualified English names across the whole fish-label and market scope: OQLF defines **écrevisse** as an edible freshwater crustacean but notes that English **crayfish** and **crawfish** are also used colloquially for langouste; CFIA’s species-indexed list attaches those English names to multiple freshwater taxa and to some crustaceans whose French common name is **langouste**. The earlier Québec live-product reassessment also correctly noted that Poissonnerie La Mer’s live local item did not identify a species and was out of season and sold out.

The parent [Section P checklist item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6869) remains open; the earlier [2026-10-12 hold check](../../RecipeBook-global-ingredient-catalog-plan.txt#L7035) records the now-revisited candidate decision. This packet reopens only that scoped decision and does not close the parent checklist.

A current Metro Québec seafood guide now defines **crayfish / écrevisse** directly as a freshwater crustacean, says only some species grow large enough to eat, describes its flesh and culinary uses, and says Metro seafood counters offer it live. The English and French guides use the corresponding names for the same freshwater food category. This supports a **bounded freshwater food identity**, while leaving species and product state unresolved. It does not make **crawfish** safe as a global alias: a current Costco Canada product listing pairs that English product title with French **écrevisses**, but it is one imported, cooked, Cajun-seasoned SKU and has no species name. A global alias would erase both that product limitation and the documented langouste overlap.

The proposed English display **freshwater crayfish** makes the scope visible when the picker finds **crayfish**. The French display **écrevisse d’eau douce** preserves the preferred Québec term while making the freshwater boundary explicit. Do not add **crawfish**, **crawdad**, **langouste**, **spiny lobster**, or any species names as aliases.

## Proposed identity boundary

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-crayfish (reuse the existing research candidate ID) |
| Category | PROTEIN |
| English display | freshwater crayfish |
| Québec French display | écrevisse d’eau douce |
| English aliases | none |
| French aliases | none |
| Density and unit mappings | none |
| Forms | none |
| Scope | Edible freshwater crayfish as a species-neutral ingredient class; no species is selected. Product state remains explicit in recipe text or product-specific work. |
| Exclusions | Langouste/spiny lobster, American and European lobster, langoustine/scampi, crab and crab meat, shrimp/prawns, surimi, and separately named prepared seafood dishes or products. |

The R501 proposal source IDs do not allocate a new reference ID. The identity is narrower than the old generic candidate proposal: it accepts the freshwater food sense and leaves the broader English **crawfish** mapping unresolved because the catalog alias fields are global rather than region-scoped.

## Current package ownership and archive audit

Snapshot checked before drafting; file digests cover exact bytes.

| Surface | Current count and owner | Result |
|---|---|---|
| Active ingredient references | 1,781 rows; 581,233 bytes; SHA-256 0789eeee3627a6c9cb5814e284d27a8c51486337698693bd5fbcc76d2ce35bd8 | No active name or alias owns crayfish, crawfish, crawdad, écrevisse, or the freshwater-qualified phrases. No active reference uses ID ingredient-ref-crayfish. |
| Active ingredient forms | 143 forms; 113,370 bytes; SHA-256 ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6 | No form label or match term owns this family. There is no crayfish form. |
| Legacy import identities | 56 candidates; 13,351 bytes; SHA-256 8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720 | No family name, alias, or candidate ID is present. No legacy mapping is proposed. |
| Research ledger | 2,139 records; 9,794 source entries; 8,289 distinct source IDs; 7,001 distinct exact URLs; 9,918,732 bytes; SHA-256 9021ec38d5f79b9895bbbdb54dbf5cb40cfa2e3768fe3dbf5a74b962663ddfee | The sole family record is ingredient-ref-crayfish, record type candidate, identity needs_clarification, measurement not_yet_researched, substitution not_yet_researched. It currently owns the OQLF source ID WP04-MOLLUSKS-20261009-S04. |
| Manifest | 114 recipe paths; 12,011 bytes; SHA-256 b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 | Recipe manifest unchanged from the recent R158 and R498 reviews. |

Exact normalized ownership checks followed normalizeIngredientSearchKey in IngredientSearch.kt across active display names, aliases, form labels and match terms, legacy names and aliases, and ledger IDs. There is no current active result for **crayfish**, **crawfish**, **crawdads**, **écrevisse**, **freshwater crayfish**, **écrevisse d’eau douce**, **crayfish tail**, **crawfish tail**, or **crayfish meat**. The ledger candidate is not supplied to the picker.

Nearby active identities are distinct: ingredient-ref-lobster is American lobster / homard d’Amérique; ingredient-ref-european-lobster is European lobster / homard européen; ingredient-ref-langoustine is scampi / langoustine; ingredient-ref-crab and ingredient-ref-crab-claws cover crab meat and crab claws; ingredient-ref-lobster-claws and ingredient-ref-lobster-meat cover separate lobster products. None has a crayfish-family alias or form. No active generic langouste/spiny-lobster row owns the proposed freshwater display.

| Prior work | Recorded decision | R501 treatment |
|---|---|---|
| 2026-10-12 crayfish/crawfish/écrevisse boundary proposal and hold integration | Held ingredient-ref-crayfish because the English names cross freshwater and langouste scopes and there was no recipe demand. | Keep the CFIA/OQLF collision finding; add current product evidence and narrow the accepted identity to the explicit freshwater food class. |
| 2026-10-12 Québec live-product picker reassessment and integration README | Kept the candidate held after the La Mer live listing failed to identify species; the one-pound count was product-specific and the item was out of season. | Recheck La Mer’s current page and retain those limits. Metro’s current definition supports a bounded food class, not a species or generic count. |
| R158 WP04 smoked-trout proposal and integration README (2026-10-16) | Added a separate smoked-trout product identity; no crayfish allocation. | No ownership or alias change. |
| R456 lobster-claws proposal/integration (2026-10-17) | Added lobster claws as a cut-product identity, separate from lobster, crab claws, and lobster meat. | Preserve those product boundaries; no crayfish source or owner. |
| R495 canned Québec redfish and R498 monkfish proposals (2026-10-17) | Reassessed separate regional fish products and market names. | Neither allocates crayfish/crawfish/écrevisse or changes the picker owner. |

The earlier crayfish reviews and their integration READMEs remain linked here: [2026-10-12 boundary review](wp04-section-p-crayfish-crawfish-ecrevisse-boundary-review-20261012.md), [2026-10-12 live-product reassessment](wp04-section-p-crayfish-local-product-picker-reassessment-20261012.md), [boundary-hold integration](../batches/wp04-section-p-crayfish-crawfish-ecrevisse-hold-integration-20261012/README.md), and [live-product integration](../batches/wp04-section-p-crayfish-live-product-picker-reassessment-20261012/README.md). The [R158 integration audit](../batches/wp02-wp03-wp04-r158-gap-review-integration-20261016/README.md) is included because it is the recent R158 Section P checkpoint.

A read-only scan of current proposals and batch archives found no existing R501 prefix, no active or archived freshwater-crayfish reference ID, and no later crayfish allocation after the two 2026-10-12 holds. The exact proposed ID reuses the ledger candidate; no additional identity ID is introduced.

## Source-ID to exact-URL register

Each source ID below maps to exactly one URL. “Live ledger” means the ID and URL already occur together in the shared ledger; “archive-only” means the ID was used in a prior proposal but was not registered in the shared ledger; “new R501” means the ID and exact URL were not found in the live ledger or proposal/batch archive.

| Source ID and status | Source and exact URL | Evidence and limits |
|---|---|---|
| Reuse live-ledger WP04-MOLLUSKS-20261009-S04 | OQLF, [écrevisse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363436/ecrevisse) | Preferred Québec term in the food-domain entry; defines a small freshwater crustacean and lists English **crayfish** and **crawfish**. It also notes colloquial English use for langouste. Last updated 2011; terminology and scope evidence, not a species or product-state identification. Do not mint another source ID for this already-owned URL. |
| Reuse archive-only WP04-CRAYFISH-20261012-S02 | CFIA Fish List results, https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp | Species-indexed rows use crayfish/crawfish for multiple freshwater taxa and also for some entries whose French name is langouste. This URL is already owned by many unrelated source IDs in the ledger; the R12 ID is archive-only. Common-name evidence does not make the listed species interchangeable. |
| Reuse archive-only WP04-CRAYFISH-20261012-S03 | CFIA, [guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains that the Fish List provides species-specific Canadian common names. The exact URL is already represented by many other ledger source IDs; the R12 ID is archive-only. Regulatory naming guidance, not a culinary identity or recipe measure. |
| Reuse archive-only WP04-CRAYFISH-20261012-S07 | Metro Québec, [Tout sur les écrevisses](https://api.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/ecrevisses) | Rechecked 2026-10-17. Metro describes écrevisse as a freshwater crustacean, says only some species are large enough to consume, and describes live counter offerings and cooking uses. Consumer guide evidence, not species identification or a selected-store inventory check. Search-index content was available; direct page retrieval failed. |
| Reuse archive-only WP04-CRAYFISH-LIVE-PICKER-20261012-S01 | Poissonnerie La Mer, [Live Crayfish - 1lb](https://www.lamer.ca/en/products/ecrevisse-vivante) | Current Montréal listing says “Live Quebec Crayfish,” image alt text “Écrevisse vivante - 1lb,” and 14–16 per pound; it is currently shown out of season and sold out. No species is named. The count is one seasonal live product’s detail, not a general count conversion or yield. |
| New R501 WP04-SECTIONP-CRAYFISH-BOUNDARY-RECHECK-R501-20261017-S01 | Metro, [Crayfish](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/crayfish) | Rechecked 2026-10-17. English consumer guide explicitly describes freshwater crayfish as a food crustacean, discusses edible species and cooking, and says live crayfish are offered at Metro seafood counters. No species, store-level stock, serving quantity, or general product form is specified. Search-index content was available; direct page retrieval returned 403. |
| New R501 WP04-SECTIONP-CRAYFISH-BOUNDARY-RECHECK-R501-20261017-S02 | Costco Canada, [Seacore Cooked Cajun Seasoned Whole Crawfish, item 1655897](https://www.costco.ca/p/-/seacore-cooked-cajun-seasoned-whole-crawfish-227-kg-5-lb-x-2-pack/100972365) | Current English Canadian online listing names a whole cooked, individually frozen crawfish product from Egypt and includes crawfish, salt, and red pepper. The item is online-only and delivery is postal-code dependent. This is one prepared product, with no scientific species; its title does not justify a global alias or a whole-to-tail/meat equivalence. |
| New R501 WP04-SECTIONP-CRAYFISH-BOUNDARY-RECHECK-R501-20261017-S03 | Costco Canada, [Seacore – Écrevisses entières cuites assaisonnées à la cajun, item 1655897](https://www.costco.ca/p/-/seacore-cooked-cajun-seasoned-whole-crawfish-227-kg-5-lb-x-2-pack/100972365?langId=-25) | French localization of the same Costco SKU and URL family calls the product **écrevisses entières cuites**. It is the same product as S02, not an independent species or quantity observation. The French page was available in the search index; direct retrieval failed. |

The OQLF ID is already live on the existing crayfish ledger candidate. The CFIA Fish List and common-name guidance URLs are already owned in the live ledger under other IDs; reuse the archive-only crayfish source IDs shown above rather than mint duplicate mappings. Metro’s French URL and La Mer’s product URL are archived but currently unregistered. The three new R501 URLs are not owned in the live ledger or the archive. If root accepts the proposal and registers every listed source mapping, integration should update and reclassify the existing `ingredient-ref-crayfish` candidate record rather than create a duplicate. The expected ledger totals remain 2,139 records, while source entries increase by seven, distinct source IDs by seven, and distinct URLs by five (from 2,139 / 9,794 / 8,289 / 7,001 to 2,139 / 9,801 / 8,296 / 7,006, respectively), assuming no intervening repository updates.

## Current picker behavior and projection

The recipe picker builds its index from active ingredient references and forms in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) and [RecipeEditorScreen.kt](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt). Research-ledger candidates and legacy candidates are not indexed. Search normalizes case, accents, ligatures, punctuation, and spaces, prefers complete word-phrase matches across terms, then uses substring matching.

The projected row uses only the two displays above, with empty aliases and no forms.

| Query | Current active result | With proposed row | Boundary |
|---|---|---|---|
| crayfish | None | freshwater crayfish / écrevisse d’eau douce | The query matches the word in the scoped English display; the result visibly states freshwater scope. |
| freshwater crayfish | None | freshwater crayfish / écrevisse d’eau douce | Exact scoped English phrase. |
| écrevisse; ecrevisse | None | freshwater crayfish / écrevisse d’eau douce | Accent-insensitive word-phrase match on the French display. |
| écrevisse d’eau douce | None | freshwater crayfish / écrevisse d’eau douce | Exact scoped French phrase. |
| crawfish; crawdad; crawdads | None | None | Do not activate these broader English aliases. A Canadian retail crawfish title is retained as product evidence only. |
| crayfish tail; crawfish tail; crayfish meat | None | None | No tail, meat, picked-meat identity, or form is created. |
| langouste; lobster; scampi/langoustine | No crayfish result; lobster and langoustine identities remain separately scoped | Unchanged; no crayfish term is added to these identities | Preserve the lobster/langoustine boundary; do not import the CFIA English common-name overlap as a catalog alias. |

This is a static projection of the current search algorithm, not an emulator or visual picker check.

## Full manifest recipe scan and fingerprint

The scan parsed every manifest-listed recipe file, every complete recipe JSON string including localized text, and every structured ingredients[] row. It searched case-insensitively for crayfish/crawfish, their plural forms, crawdad/crawdads, écrevisse/écrevisses with and without accents, freshwater-qualified phrases, crayfish tail/meat, and langouste/spiny-lobster terms.

- Manifest recipe files: **114**
- Structured ingredient rows: **1,123**
- Total exact recipe-file bytes: **753,988**
- Files containing a reviewed crayfish-family phrase: **0**
- Ingredient rows containing a reviewed crayfish-family phrase: **0**
- Manifest-order recipe-corpus fingerprint: **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e**

The fingerprint hashes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte in manifest order. The scan also confirms adjacent ingredient rows are not crayfish requests: recipe 019’s jumbo lump crab meat is linked to the crab identity, while recipe 093’s optional “cooked meat or seafood, to taste” is species-unspecified and cannot select crayfish, langouste, crab, or any other shellfish. The corpus has no species, product state, amount, recipe link, or preparation request for this identity.

## Forms, measures, package yields, and substitutions

- **Forms:** Add none. The reviewed food-market evidence includes Metro’s live counter offering, La Mer’s local live listing, and Costco’s cooked, Cajun-seasoned, individually frozen whole product. These are differing product states; they do not define a reusable form relation or a form-specific recipe request.
- **Measurements:** Record no density, household-volume mapping, unit mapping, conversion, or numeric portion. La Mer’s 14–16 per pound is one seasonal live Québec listing; Costco’s roughly 10–15 whole animals per pound is one cooked/frozen imported SKU. Their distinct product scopes and counts do not support a generic count-to-mass rule.
- **Yield:** Add no edible-meat, shelling, thawing, or cooking yield. No source gives a reusable relationship from live/whole animals to tail or picked meat.
- **Substitutions:** Add no global or contextual rule. These sources do not show safe or tested substitution between freshwater crayfish and lobster/langouste, langoustine, crab, shrimp/prawn, or surimi.
- **Proposed evidence state if integrated:** identity verified for the bounded freshwater ingredient class; measurement researched with no reusable value; substitution remains not yet researched. Do not add recipe links, package-yield rows, forms, or numeric observations.

## Final recommendation

Accept one identity-only row by promoting the existing ingredient-ref-crayfish candidate to **freshwater crayfish / écrevisse d’eau douce**, with no aliases. This updates the earlier hold only at the freshwater-food boundary now defined by OQLF and the current Metro Québec/English food guides. Keep **crawfish** out of global aliases because the catalog cannot encode a region-qualified alias and current CFIA/OQLF evidence still records non-freshwater use. Keep all species and product-state decisions open, and leave the Section P parent checklist open.

No tests, builds, emulator checks, or deployment were run. This proposal does not modify database JSON or any shared integration artifact.
