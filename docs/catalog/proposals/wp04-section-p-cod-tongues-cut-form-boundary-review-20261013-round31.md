# WP04 Section P — cod tongues cut and state boundary review (round 31)

- **Review / online source-access date:** 2026-10-13.
- **Disposition:** Hold the unqualified cod-tongue term outside active references and forms for now. Current sources identify a real regional cut and a Québec French term, but the same name explicitly covers fresh and salted product. A single form under Atlantic cod would route the unqualified query to one state and hide the salted interpretation; a parallel form under salt cod needs current product or recipe evidence for that state.
- **Scope:** the food product called cod tongue(s) / langue(s) de morue, described in Canadian culinary sources as flesh from the cod’s throat or lower jaw. This packet does not review generic fish tongue, cod species coverage, cod cheeks, or preserved-fish forms generally.
- **Proposal-only status:** this file only. No reference, form, alias, ledger candidate, recipe link, shared plan, roadmap, or code was changed. No tests were run.
- **New source-ID prefix:** **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-**. It was absent from the proposal/batch archive and shared ledger when checked. IDs below are local to this packet, not ledger entries.

## Decision

Section P still leaves fish powder, fish balls, and surimi open, and its broader regional seafood work remains active. The live catalog and archive contain a separate, unallocated cod-tongue cut boundary. This is distinct from the crab-flavoured pollock flakes proposal in round 29 and dried fish maw in round 30: a cod tongue is a small flesh cut from a cod head, not a prepared pollock product, fish paste, or swim bladder.

Do not create an ingredient reference such as “cod tongues,” or an active form under Atlantic cod or salt cod at this time. OQLF’s GDT gives the preferred Québec term “langue de morue,” pairs it with English “cod tongue,” and explicitly notes that it may be fresh or salted [S01]. The two states are already represented by different active reference boundaries: Atlantic cod and salt cod. However, the current Québec-facing product page reviewed here is described as frozen Icelandic cod and inconsistently calls the item “fresh”; it does not establish a salted SKU or identify a species [S03]. Historical Newfoundland usage establishes that salted tongues existed, but it is not a current product match [S02].

If a current Canadian/Québec product label or recipe confirms both states, revisit as cut forms on the existing owners: fresh/frozen, unsalted product under the species-specific Atlantic cod reference only when the product source names that taxon; salted product under the existing salt-cod identity only when the product or recipe establishes that scope. The generic phrase should return both choices if both are activated. Do not create a standalone identity, infer that all cod species share the product, or copy the term onto Arctic cod, Pacific cod, Atlantic tomcod, sablefish, fish balls, surimi, or fish powder.

Keep cod cheeks distinct. A current Canadian seafood supplier lists Atlantic cod tongues and Atlantic cod cheeks as separate products [S05]. Do not use “cod jowls” as an alias: one seller uses it as a synonym for tongues, but the reviewed supplier distinguishes tongues from cheeks and does not settle whether “jowls” is a stable Canadian cut name [S04–S05]. Keep generic “fish tongues” separate from this cod-specific term.

## Exact ownership and archive audit

The audit used the live search normalization in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and NFKD normalization, accent and punctuation folding, and collapsed spaces. It checked active reference names and aliases; form labels and match terms; all legacy candidate fields; ledger records; the live Section P checklist; and proposal/batch files.

The current package snapshot contains **1,364 active references, 100 forms, 64 legacy candidates, and 1,691 ledger records**. The active-catalog package has 114 manifest-listed recipes.

| Candidate or neighboring term | Current ownership |
|---|---|
| “cod tongue,” “cod tongues,” “tongue of cod,” “langue de morue,” and “langues de morue” | No exact normalized active-reference, form, legacy-candidate, or ledger owner. No exact cod-tongue review was found in the plan, proposal archive, or batch archive. |
| Proposed ID ingredient-ref-cod-tongues / candidate-cod-tongues | No active reference, form, legacy, or ledger allocation. Do not allocate either while this hold stands. |
| ingredient-ref-atlantic-cod | Existing PROTEIN reference, displayed as “Atlantic cod / morue de l’Atlantique,” with no aliases or forms. Current Canadian supplier evidence ties its product wording to Gadus morhua [S05]. |
| ingredient-ref-salt-cod | Existing separate salt-cod product identity; no cod-tongue form is attached. OQLF and the historical Newfoundland dictionary establish that the cod-tongue term can include salted product, but neither is current evidence for a particular salted Canadian/Québec SKU [S01–S02]. |
| Arctic cod, Pacific cod, sablefish / “black cod,” and other existing cod-like references | Keep their existing species/product boundaries. Their shared “cod” or “morue” word is not evidence that the cut is sold or used from those taxa. |
| Existing WP04 product boundaries | Bonga dried fish powder, fish balls, held generic fish powder, held anchovy powder, held surimi shreds, and the round-29 crab-flavoured pollock flakes remain separate. None owns the exact cod-tongue phrases. The round-30 fish-maw review concerns a different organ and product. |

No R31 source-ID prefix or exact cod-tongue candidate phrase was found before drafting. The broad terms “cod” and “morue” are already shared across several active references; this review does not add either as an alias.

## Picker and search effect

The projection below statically mirrors the app’s complete-word-phrase-first search, followed by substring fallback. It is a data-level projection, not a runtime picker test.

| Query | Current results | If one generic form were placed under Atlantic cod | Boundary |
|---|---|---|---|
| “cod tongues” / “cod tongue” | None | Atlantic cod alone | This would resolve the phrase to the fresh/frozen species row even though the Québec terminology entry covers fresh or salted product. |
| “langues de morue” / “langue de morue” | None | Atlantic cod alone | Same state ambiguity in French. |
| “cod” | Five rows: Arctic cod, Atlantic cod, Pacific cod, sablefish (through “black cod”), and salt cod | Same five | Atlantic cod already owns the exact token. A form adds no sixth reference. |
| “morue” | Five rows: Arctic cod, Atlantic cod, Pacific cod, sablefish, and salt cod | Same five | The French species and product owners are already visible. |
| “fish” / “poisson” | Four / seven rows respectively | Unchanged | The proposed cut should not gain generic fish-family aliases. |
| “tongue” | No result | Atlantic cod alone | A single fresh/frozen form would be the only active choice. |
| “langue” | One substring-fallback result, textured vegetable protein, because its French “languettes” form contains that character sequence | An exact “langue de morue” term would return Atlantic cod and suppress that incidental fallback | If the boundary is later accepted, this is a predictable consequence of the existing exact-phrase priority. |
| “cod jowls” / “fish tongues” | None | None if excluded as proposed | Keep these broad or unsettled seller terms off the active form. |

If future evidence supports both unpreserved Atlantic cod tongues and salted cod tongues, the same generic phrase should be present on both source-bounded cut forms so search offers the two existing owners. The current evidence is not sufficient to activate that two-state mapping: the recent Québec page is frozen, its product descriptor conflicts internally, and no current reviewed Canadian/Québec source establishes a salted tongue SKU [S03–S05].

## Recipe-demand audit

The full bundled-library scan read all **114** manifest-listed recipe files and **1,123** ingredient rows. It searched recipe JSON text and ingredient rows for cod tongue(s), tongue(s) of cod, langue(s) de morue, cod jowls, and fish tongue(s). It found **zero matching files and zero matching ingredient rows**. The broader terms “cod” and “morue” also occur in no bundled recipe. There is no seed recipe link or current app demand to allocate.

External culinary evidence exists but does not change that result:

- A Coup de Pouce recipe credited to the Institut de tourisme et d’hôtellerie du Québec, “Langues de morue vinaigrette,” lists 450 g for six portions and sautés the cut in butter [S06]. It is a 2005 recipe record, not a bundled recipe or a standard portion.
- A 1999 Government of Newfoundland and Labrador tourism program lists cod tongues on a Brigus traditional-food menu [S07]. This supports regional culinary context, not current Québec recipe demand.

## Numeric and substitution limits

The current Capone Gourmet page offers 1 lb, 5 lb, and 10 lb choices, and elsewhere lists 20 lb; these are seller package options, not servings, piece counts, or recipe quantities. The same page calls the product frozen Icelandic cod but includes a “fresh” product descriptor, so it does not settle state [S03]. Salties lists a 50 g size and a 5 kg minimum order; that is seller-specific product sizing and order quantity, not a default mass for one tongue or a household portion [S04]. The ITHQ recipe’s 450 g for six portions remains one recipe-specific amount [S06].

No reviewed source establishes a density, volume measure, edible yield, per-tongue mass, standard portion, pack-to-recipe conversion, or cooking conversion. Add no density, unit mapping, package yield, conversion, or recipe amount. No reviewed source validates replacing tongues with cod cheeks, cod fillet, another fish species, fish balls, surimi, fish powder, or salt cod at any ratio. Add no substitution rule or recipe-line substitution.

## Source register

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-S01** | Office québécois de la langue française, [langue de morue (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488142/langue-de-morue), preferred term, English equivalent, note; entry last updated 1983. | Authoritative Québec terminology: preferred “langue de morue,” English “cod tongue,” and note “fresh or salted.” It does not define an exact anatomical boundary or identify a current retail SKU. |
| **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-S02** | University of British Columbia, [DCHP-3: cod tongue](https://dchp.arts.ubc.ca/entries/cod%20tongue), definition and quotations from 2001 and 2007. | Canadian historical lexicographic evidence scopes the Newfoundland food term to cod-head throat/lower-jaw flesh and records fresh and salted uses. Historical quotations are not a current product specification; the descriptions do not establish a standardized cut. |
| **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-S03** | Capone Gourmet, [Langue de morue surgelé – Islande](https://caponegourmet.com/products/langue-de-morue-surgele-islande), product title, available package options, product description, and “Caractéristiques du produit.” | Current Québec-facing French product wording and frozen Icelandic origin; the page says it ships across Québec. It has conflicting “frozen” and “fresh” wording and no scientific species or ingredient statement. The package options are seller listings only. |
| **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-S04** | Salties, [Fresh Cod Tongues](https://www.salties.ca/products/fresh-cod-tongues), product title and indexed listing. | Current Canadian supplier wording pairs fresh cod tongues with Gadus morhua and “langues de morue”; the listing shows a 50 g size and 5 kg minimum order. It is supplier-specific, does not establish a household portion, and its “cod jowls / fish tongues” synonym wording is not adopted as a global alias. |
| **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-S05** | Kata Seafoods, [Atlantic Cod Supplier Canada](https://www.kataseafoods.com/seafoodproducts/atlanticcod), “Atlantic Cod Tongues,” “Atlantic Cod Cheeks,” and species description. | Current Canadian supplier page presents tongues and cheeks as separate Atlantic cod product lines and identifies Atlantic cod as Gadus morhua. It is wholesale marketing evidence, not a current Québec retail SKU, product label, package specification, or recipe test. |
| **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-S06** | Coup de Pouce, [Langues de morue vinaigrette](https://www.coupdepouce.com/cuisine/entrees-et-accompagnements/recette/langues-de-morue-vinaigrette), dated 2005-07-14, recipe yield and ingredient line; credit: Institut de tourisme et d’hôtellerie du Québec. | Québec culinary wording and one 450 g / six-portion recipe. This is a source-specific historical recipe amount, not an app recipe, serving standard, density, or conversion. |
| **WP04-SECTIONP-COD-TONGUE-CUT-20261013-R31-S07** | Government of Newfoundland and Labrador, [Two major Soiree ’99 summer events unveiled](https://www.releases.gov.nl.ca/releases/1999/tcr/0504n01.htm), Brigus menu, lines 100–103. | Official provincial tourism material identifies cod tongues as a local menu item. It is dated 1999 and supplies no product specification, quantity, or current supply evidence. |

## Next action

Keep the unqualified term unallocated. Revisit if a current Canadian/Québec label or recipe distinguishes fresh/frozen tongues from salted tongues and provides a source-matched species or salt-cod product scope. Then model only the confirmed cut as a form under its existing reference, project the generic English/French queries against both owners, and repeat the bundled-recipe scan. Until then, keep all shared catalog, ledger, plan, and roadmap data unchanged.
