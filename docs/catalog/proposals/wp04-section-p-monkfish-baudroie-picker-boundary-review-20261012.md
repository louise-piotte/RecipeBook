# WP04 Section P — Monkfish / baudroie species and picker boundary

- **Review / source-access date:** 2026-10-12.
- **Packet type:** Canadian/Québec naming, taxonomic, exact-owner, recipe-demand, picker, measurement, and substitution review.
- **Recommendation:** **Hold allocation of the monkfish / baudroie candidate.** The verified name evidence spans two commercially encountered *Lophius* species, and the picker would return a single species row for the unqualified search words `monkfish` or `baudroie`. The recipe bundle has no exact demand to justify resolving that choice now.
- **Disposition:** Accepted as a documentation-only hold on 2026-10-12. No reference, form, recipe link, ledger record, measurement, or substitution was added.

## Candidate and identity boundary

| Candidate | Prospective category | English term in sources | Québec French term | Taxon scope | Decision |
|---|---|---|---|---|---|
| Monkfish / baudroie | `PROTEIN` if later allocated | `monkfish` | `baudroie`; species-qualified `baudroie d’Amérique` | OQLF uses *Lophius* sp. for the market category; DFO’s Canadian species page pairs `Monkfish` with *Lophius americanus*. The CFIA Fish List also gives `Monkfish` for *L. piscatorius*. | Hold; do not assign the generic words to one species. |

OQLF prefers **baudroie** for the Québec commercial-fish context and says two species may occur in commerce: *Lophius piscatorius* and *L. americanus*. Its English terms include `monk fish`, `angler`, and `goosefish`; it does not make those terms species-specific. The CFIA Fish List similarly returns `Monkfish` for both *L. americanus* and *L. piscatorius*. DFO’s bilingual species profile provides a valid narrower pair—`Monkfish` / `baudroie d’Amérique` for *L. americanus*—but the unqualified English label still overlaps the other commercial species in CFIA’s list.

Do not add `lotte` as a French alias. OQLF marks that usage for baudroie as discouraged, and the current Québec wildlife species page uses **lotte** for freshwater burbot, *Lota lota*. An older DFO market guide does use `lotte` for the edible tail of *L. americanus*; retain that as a historical/market wording observation, not as a Québec catalog alias. OQLF also says `crapaud de mer` was not retained for Québec fish-product marketing. Keep `goosefish`, `angler`, `stargazer`, and the broader `baudroie` names unassigned until a source-backed product or search boundary distinguishes them.

## Prior coverage, ownership, and source-ID uniqueness

The open Section P plan includes regional fish. A repository search across the plan, existing proposals, batch checkpoints, live references/forms, and research ledger found no earlier monkfish, baudroie, goosefish, or *Lophius* review or integration. This packet is distinct from the recent tilapia, generic powder, fish-ball, surimi, crayfish, and preserved-fish work.

At this pre-integration audit snapshot, the live catalog had 1,246 ingredient references and 94 forms; the legacy-import file had 66 candidates; and the research ledger had 1,553 records. The snapshot predates the same-day pea-starch and maize-poha additions. Exact normalized-name/alias checks across those active references, forms, legacy candidates, and ledger found no owner for `monkfish`, `monk fish`, `baudroie`, `baudroie d’Amérique`, `goosefish`, `angler`, `crapaud de mer`, `lotte`, *Lophius americanus*, or *Lophius piscatorius*. There is no current active `burbot / lotte` owner either. Existing fish balls, fish stock, fish sauce, and other seafood rows do not claim these keys.

The repository’s `normalizeIngredientSearchKey` folds case, accents, ligatures, punctuation, and whitespace. `IngredientReferenceSearchIndex` first matches a complete normalized word phrase anywhere within a display name or alias, then uses partial matching if no complete phrase exists. Current catalog queries for the candidate terms return no result. If a species row is added with `American monkfish` or `baudroie d’Amérique` as a display phrase, a bare `monkfish` or `baudroie` query will still match that phrase and can surface the species-only row without an unresolved generic choice. Do not treat the visible qualifier as protection against that picker result.

Proposal-local source IDs `WP04-SECTIONP-MONKFISH-20261012-S01` through `S06` were checked against the 5,391 existing ledger source entries (4,429 distinct source IDs) and proposal/batch Markdown. No ID collision was found.

## Bundled recipe demand

I scanned all 114 bundled recipe files and all 1,123 ingredient rows for whole-word-phrase occurrences of `monkfish`, `monk fish`, `monk`, `goosefish`, `angler`, `angler fish`, `anglerfish`, `stargazer`, `baudroie`, `crapaud de mer`, `lotte`, `American monkfish`, and both *Lophius* species names. The scan found **zero hits in the recipe corpus and zero ingredient-row hits**. There is no exact recipe line to link, no requested cut or preparation state, and no amount to normalize.

## Measurement and substitution limits

- DFO’s species profile reports whole-animal biology, including lengths over one metre and weights over 20 kg. Those are biological facts, not edible portions or recipe weights; do not copy them into culinary measurements.
- An older DFO identification/market guide describes the commercial product as a frozen, headless, skinned tail sorted by size and characterizes the flesh as lean and white. This is product-presentation evidence only. It gives no reproducible kitchen portion, count, yield, density, or conversion; its `lotte` wording is excluded from the Québec alias set for the reasons above.
- No recipe or reviewed source supports a form mapping, edible-yield factor, count/weight conversion, default density, or package-size relationship. Leave those fields absent; measurement state remains `not_yet_researched`.
- Shared `lean white fish` wording does not establish a safe exchange with cod, hake, halibut, or another fish. Add no global or contextual substitution. Substitution research remains `not_yet_researched`.

## Hold decision and remaining work

Root accepted the hold. Keep generic `monkfish / baudroie` unresolved and do not create a species-only *L. americanus* row while the picker maps bare terms to that single result. Reopen only with an exact recipe/product request or search behavior that can show the generic candidate alongside species-qualified choices. Keep *L. piscatorius*, *L. americanus*, freshwater burbot (*Lota lota*), and historical `lotte` wording distinct. No source IDs were added to the ledger. See the hold checkpoint in the plan and [batch note](../batches/wp04-section-p-monkfish-baudroie-search-hold-integration-20261012/README.md). Section P remains open for its other finfish, seafood products, remaining shellfish, and roe gaps.

## Sources

Sources were accessed or rechecked on 2026-10-12. Taxonomic and market terminology below does not establish culinary measurements or substitutions.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-MONKFISH-20261012-S01` | OQLF GDT, [baudroie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198872/baudroie), updated 2011 | Prefers `baudroie`, maps English `monk fish`, `angler`, and `goosefish` to *Lophius* sp., and says *L. piscatorius* and *L. americanus* may occur in commerce. Rejects `lotte` for baudroie and says `crapaud de mer` was not retained for Québec fish-product marketing. Terminology only. |
| `WP04-SECTIONP-MONKFISH-20261012-S02` | CFIA, [Fish List search results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), page marked modified 2023-09-18 | The lookup lists `Monkfish` for both *L. americanus* and *L. piscatorius*, alongside other names. Its *L. piscatorius* entry gives `Monkfish / Baudroie Commune`; *L. americanus* includes `Monkfish` and `Monk / Baudroie`. This lookup does not make the bare English name species-exclusive. |
| `WP04-SECTIONP-MONKFISH-20261012-S03` | Fisheries and Oceans Canada, [Monkfish](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/monkfish-baudroie-amerique-eng.html) | Species page identifies `Monkfish` as *Lophius americanus* and describes its Canadian Atlantic range and whole-animal biology. The biological size/weight statements are not recipe measurements. Page modified 2016-12-19. |
| `WP04-SECTIONP-MONKFISH-20261012-S04` | Pêches et Océans Canada, [Baudroie d’Amérique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/monkfish-baudroie-amerique-fra.html) | Bilingual species page identifies `Baudroie d’Amérique` as *Lophius americanus*. Supports the species-qualified French name, not a generic alias or culinary conversion. |
| `WP04-SECTIONP-MONKFISH-20261012-S05` | Gouvernement du Québec, [Lotte](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/lotte), updated 2026-10-02 | Identifies Québec freshwater `lotte` as burbot, *Lota lota*. This current local taxon/name pair is a reason to keep `lotte` off a marine *Lophius* identity. Biological profile only. |
| `WP04-SECTIONP-MONKFISH-20261012-S06` | DFO, [Atlantic fish identification/market guide](https://waves-vagues.dfo-mpo.gc.ca/Library/24740v.3fre.pdf), p. 25 | Its *L. americanus* entry describes the edible tail as sold frozen, headless, skinned, and size-sorted; the flesh is described as lean and white. It also uses `lotte` for the tail. Treat this older market wording as a documented conflict, not a current Québec alias or a measure/yield/substitution source. |
