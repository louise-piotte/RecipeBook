# WP04 Section P — gray snapper / vivaneau gris picker-boundary review (R308)

- **Review and source-access date:** 2026-10-16.
- **Checklist linkage:** the open Section P checklist item ([plan line 5689](../../RecipeBook-global-ingredient-catalog-plan.txt#L5698)): `[ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.` This review addresses only the unreviewed species *Lutjanus griseus*.
- **Candidate:** gray snapper / vivaneau gris (*Lutjanus griseus*).
- **Disposition:** **Hold** the species outside active references and the research ledger. OQLF supports the species-specific bilingual name pair, but those display names would make the broader `snapper` and `vivaneau` searches return this one candidate. CFIA’s Fish List applies those broad names to multiple taxa. The bundled recipes contain no matching demand.
- **Proposal-only status:** this is the only artifact proposed. Do not change shared catalog JSON, the ledger, plan, roadmap, generated files, recipes, or batch history. No software tests, build, emulator checks, or deployment were run.
- **Proposal-local source IDs:** `WP04-SECTION-P-R308-20261016-S01` through `S06`; `R01` is a proposal-local repository audit label. Reused shared evidence is cited by its existing source ID below.

## Why this is an open, distinct gap

The Section P finfish checklist remains open. A read-only exact-key search of current references, forms, legacy identities, ledger text, plan, proposals, and batch notes found no existing owner or focused review for *L. griseus*, `gray snapper`, `grey snapper`, `mangrove snapper`, `lawyer snapper`, `vivaneau gris`, or `lutian gris`. The prospective reference ID `ingredient-ref-gray-snapper` and the R308 source-ID prefix are also unallocated. The scan covered all catalog and research artifacts in the current worktree; it does not treat broad mentions of snapper as a prior species allocation. [R01]

This is a new species candidate, separate from the existing *Lutjanus campechanus* red-snapper hold. That earlier review leaves broad snapper / vivaneau wording unallocated because CFIA uses those names across several species and the picker would present one species as the only result. This review does not reopen or change that hold. It also excludes the integrated R304 `maquereau bleu` alias review, which concerns Atlantic mackerel. [reused `WP04-SECTIONP-RED-SNAPPER-20261012-R1-S02` and `S03`; see the [red-snapper review](wp04-section-p-red-snapper-vivaneau-picker-boundary-review-20261012.md) and [R304 review](wp04-section-p-next-gap-review-r304-20261016.md)]

## Species and market-name evidence

OQLF’s edible-fish entry identifies *Lutjanus griseus*, prefers the Québec French name **vivaneau gris**, and pairs it with **gray snapper**. It also records **mangrove snapper** and **lawyer snapper** as English terms, says `lutian gris` was not retained by the fish-products terminology committee, and notes commercial potential in Québec. This is Québec terminology and species evidence; the entry was last updated in 2012 and does not establish current local stock or a consumer package label. [S01]

Florida’s Fish and Wildlife Conservation Commission independently lists the common names Gray Snapper and Mangrove Snapper for *L. griseus*. The U.S. FDA Seafood List assigns this species the acceptable U.S. market name `Snapper` and common name `Gray Snapper`; it lists `Mangrove Snapper` and `Lawyer` only as vernacular cross-references. These U.S. sources confirm the species-name relationship but do not establish a Canadian label or a Canadian synonym policy. [S02, S04]

Seafood Depot’s supplier page identifies a product as **Mangrove Snapper — *Lutjanus griseus*** and describes it as whole, fresh, wild, and product of the U.S.A. This is source-specific supplier evidence, not a Québec retail listing, proof of current inventory, or a transferable whole-fish form specification. [S03]

Can-Am Fruits et Légumes’ Montréal fish list includes `vivaneau` among fresh and frozen fish and separately names `vivaneau américain` and `vivaneau b-liner` in its whole-fish section, without scientific names. These are product-category labels on the page, not stock or species evidence; none identifies *L. griseus*. [S06]

CFIA describes its Fish List as a source of French and English common names acceptable in Canada for fish labelling, paired with scientific names. The previously reviewed CFIA snapper query returns multiple taxa under `Snapper` and `Vivaneau`; retain that shared evidence rather than duplicating it. Do not infer that the U.S. FDA entry establishes a Canadian common name or claim that a generic Québec listing identifies this taxon. [reused `WP04-SECTIONP-RED-SNAPPER-20261012-R1-S02` and `S03`]

Keep the animal-health name **mangrove red snapper** for *Lutjanus argentimaculatus* separate. CFIA’s susceptible-species list explicitly says its common names serve aquatic-animal-health purposes and do not replace the CFIA Fish List. It is not evidence that *L. argentimaculatus* and *L. griseus* are the same species or that their food names are interchangeable. [S05]

## Exact recommendation and naming boundary

| Candidate field or term | Recommendation |
|---|---|
| Prospective identity | Hold `ingredient-ref-gray-snapper` for *L. griseus* outside active references and the research ledger. If the picker can preserve broad query scope in a future review, consider the bilingual display `gray snapper / vivaneau gris`. |
| `mangrove snapper`; `lawyer snapper` | Do not allocate aliases. OQLF records them as English terms for *L. griseus*, but each still contains the broad token `snapper`; this review does not activate the candidate. |
| `grey snapper` | Do not add as an alias. Neither the preferred OQLF English term nor the reviewed product page establishes this spelling as a separate Québec-facing label. |
| `mangrove red snapper` | Keep separate from *L. griseus*; CFIA’s aquatic-animal-health list applies this name to *L. argentimaculatus*. |
| Generic `snapper` / `vivaneau` | Keep unallocated. CFIA’s Fish List uses these names for multiple taxa, and an active row would capture both broad searches. |
| Forms, measures, recipes, conversions, yields, substitutions | Add none. No bundled recipe or reviewed source supplies reusable kitchen evidence for this species. |

## Exact-key ownership and picker projection

The read-only ownership audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): NFKD normalization, accent folding, punctuation-to-space normalization, complete word-phrase matches first, then substring fallback. It found no exact active reference, form, legacy identity, or ledger identity for the candidate names or scientific name. The candidate-specific phrases are absent from the proposal and batch archive; the exact source prefix is unallocated. [R01]

The static projection below adds only the prospective display names to the current references and forms. It reproduces the picker’s name matching; it is not an app test or a change to shared data.

| Query | Current picker | With hypothetical `gray snapper / vivaneau gris` row | Boundary |
|---|---|---|---|
| `gray snapper` | None | Candidate only | OQLF-supported qualified query. |
| `vivaneau gris` | None | Candidate only | OQLF preferred Québec French query. |
| `snapper` | None | Candidate only | A broad multi-species term would resolve as this one fish. |
| `vivaneau` | None | Candidate only | A broad French market term would resolve as this one fish. |
| `gray` | Pacific cod | Pacific cod and candidate | The English color token adds a second result. |
| `gris` | Dark buckwheat flour | Candidate only | The exact `gris` match takes precedence over the existing substring-only result for `grise`. |
| `mangrove snapper`; `lawyer snapper`; `grey snapper` | None | None | No alias is proposed. |
| `Lutjanus griseus`; `mangrove red snapper` | None | None | Scientific-name and different-species terms remain outside the picker. |

Omitting `snapper` and `vivaneau` from aliases cannot prevent the broad-query capture because both words appear in the proposed display names. Keep the existing generic snapper / vivaneau boundary unallocated until picker behavior can retain the broader family choices or the catalog models a non-exclusive market group with appropriate results.

## Bundled-recipe demand

The manifest-ordered audit covered all **114 recipe files** and **1,123 ingredient rows**. It searched complete recipe JSON text and ingredient rows for `gray snapper`, `grey snapper`, `mangrove snapper`, `lawyer snapper`, `vivaneau gris`, `vivaneau sarde grise`, `lutian gris`, *Lutjanus griseus*, and the broad `snapper` / `vivaneau` terms. It found zero matching recipe files and zero matching ingredient rows. No recipe link, amount, form, or substitution is supported. [R01]

## Source register and limits

The new sources below were accessed on 2026-10-16. These IDs are proposal-local and are not allocated to the shared ledger. Prior CFIA Fish List sources are reused under their existing IDs, not copied into a new ledger record.

| Source ID | Primary source | Evidence and limits |
|---|---|---|
| **WP04-SECTION-P-R308-20261016-S01** | OQLF, [vivaneau gris, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199104/vivaneau-gris) | Prefers `vivaneau gris`, pairs it with `gray snapper` and *L. griseus*, records other English terms, rejects `lutian gris` for fish-products terminology, and notes commercial potential in Québec. Updated 2012; not current retail inventory. |
| **WP04-SECTION-P-R308-20261016-S02** | Florida Fish and Wildlife Conservation Commission, [Gray Snapper species account](https://myfwc.com/research/saltwater/codes/food-bait-finfish/gray-snapper/) | Gives *L. griseus* and common names Gray Snapper and Mangrove Snapper. Florida fisheries context, not Canadian food-labelling authority. |
| **WP04-SECTION-P-R308-20261016-S03** | Seafood Depot, [Mangrove Snapper](https://www.seafooddepot.ca/product-snappermangrove) | Supplier product page names *L. griseus* and describes one source-specific item as whole, fresh, wild, and Product of U.S.A.; no Québec store or recipe specification is identified. |
| **WP04-SECTION-P-R308-20261016-S04** | U.S. FDA, [Seafood List entry for *Lutjanus griseus*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Lutjanus_griseus&set=SeafoodList) | Gives U.S. acceptable market name `Snapper`, common name `Gray Snapper`, and `Mangrove Snapper` and `Lawyer` as vernacular cross-references only. U.S. naming evidence, not Canadian label authority. |
| **WP04-SECTION-P-R308-20261016-S05** | CFIA, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species) | Lists *L. argentimaculatus* as `mangrove red snapper` and expressly limits names to aquatic-animal-health use; does not replace the CFIA Fish List. Used only to avoid conflating two taxa. |
| **WP04-SECTION-P-R308-20261016-S06** | Can-Am Fruits et Légumes, Montréal, [fish and seafood products](https://www.canamfruits.com/produits/poissons-etbrfruits-de-mer/) | Lists generic `Vivaneau` in fresh/frozen fish and names `Vivaneau américain` and `Vivaneau b-liner` in whole fish without taxa. Does not establish current stock or identify *L. griseus*. |
| **Reused `WP04-SECTIONP-RED-SNAPPER-20261012-R1-S02` and `S03`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [snapper query results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=snapper) | The overview describes accepted English/French names and species identities for Canadian fish labelling; the query shows `Snapper` / `Vivaneau` assigned across multiple taxa. Existing source IDs are reused; neither source proves this candidate’s current Québec market presence. |
| **WP04-SECTION-P-R308-20261016-R01** | [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5698), current [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), Section P proposals and batches, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) | Read-only exact-key and source-prefix audit, static picker projection, and recipe-corpus scan. Repository evidence only; proposal-local ID, not a ledger source. |

## Unresolved follow-up

OQLF supplies a Québec-preferred species name and notes commercial potential, but no current Québec consumer listing reviewed here identifies a product as *L. griseus*. The supplier page is product-specific and not Québec retail evidence; the Montréal product list uses broad labels without scientific names. More importantly, even a taxon-identified product would not resolve the picker’s broad-query capture while the only supported displays contain `snapper` and `vivaneau`. Reconsider this candidate if picker behavior can preserve multi-species query scope, or if a future product model can retain the specific identity without claiming the broad terms. Do not turn the source-specific supplier format into a reusable whole-fish form or infer a recipe quantity or substitute.

## Final disposition

**Hold** *Lutjanus griseus* outside active references and the research ledger. Preserve `gray snapper / vivaneau gris` as the OQLF-supported candidate name pair for a future picker review; keep the English alternates, generic snapper / vivaneau terms, *L. argentimaculatus*, all forms and numeric behavior, recipe links, and substitutions unallocated. This proposal documents one distinct species gap and does not reopen the red-snapper hold or the R304 mackerel alias.
