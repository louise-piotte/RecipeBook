# WP04 Section P — Atlantic menhaden human-food market and picker review (R125)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Atlantic menhaden, *Brevoortia tyrannus*.
- **Question:** Do Canadian and Québec fish-name evidence and current market evidence justify an active recipe ingredient identity, or do the names presently document taxonomy and feed use only?
- **Disposition:** Integrated on 2026-10-15 as a documentation-only hold. Keep Atlantic menhaden outside active ingredient references and the research ledger until a Canadian/Québec human-food product or a bundled recipe requests it; no shared catalog or ledger data changed.

## Recommendation

Do not add a fish identity or ledger candidate for *Brevoortia tyrannus* now. The name is well supported as a species name: CFIA's current aquatic-animal health list pairs the taxon with `Atlantic menhaden`, and Québec's officialized-term index includes `alose tyran`. Those naming records do not establish that whole fish is currently sold for household cooking in Canada or Québec. The reviewed Canadian evidence instead describes no Canadian fishery and documents menhaden meal in feed and pet-food products. The 114-recipe bundle has no matching request.

This is one unallocated species question under the still-open WP04 Section P fish and regional-seafood checklist. It does not revisit blueback herring (*Alosa aestivalis*), European smelt (*Osmerus eperlanus*), or Atlantic saury (*Scomberesox saurus*). Those are separately reviewed in the [R124 blueback-herring packet](wp04-section-p-blueback-herring-alose-ete-picker-market-hold-r124-20261015.md), [R122 European-smelt packet](wp04-section-p-european-smelt-picker-boundary-review-r122-20261015.md), and [R123 Atlantic-saury packet](wp04-section-p-atlantic-saury-paired-picker-market-hold-r123-20261015.md). The [American-shad review](wp04-section-p-american-shad-identity-review-20261012.md) covers *Alosa sapidissima*, not *Brevoortia tyrannus*. None allocates an Atlantic-menhaden reference. The plan's broad Section P fish and seafood work remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Name and market evidence

CFIA's aquatic-animal-health table associates *Brevoortia tyrannus* with the English name `Atlantic menhaden`; its French counterpart lists `menhaden tyran`. CFIA explicitly says those names serve aquatic-animal-health purposes and do not replace its Fish List for food labelling. Use those tables as taxon/name evidence only, not as proof that either string is a CFIA-approved retail fish label. The OQLF officialized-term index includes `alose tyran`; Fisheries and Oceans Canada's bilingual species-code table separately pairs *B. tyrannus* with `alose tyran / Atlantic menhaden`. Together these support Québec French terminology and species identification, but not current food-market availability.

The market evidence points away from activating a recipe ingredient today:

- A 2024 Fisheries and Oceans Canada review of fish mortality at the Annapolis tidal station reports that Atlantic menhaden are **not fished in Canada** and that Canadian presence is unpredictable. This is a station-impact review rather than a national landings census; it is useful evidence about Canadian harvest, not proof that no imported product can ever be sold.
- NOAA's current species page describes the large U.S. commercial fishery and its uses in fishmeal, fish oil, fertilizer, animal feed, bait, and supplements. That evidence describes the principal commercial fishery; it does not rule out historical or niche direct consumption.
- CFIA's Canadian Feed Ingredients Table allows `menhaden` as a source descriptor for fish-meal feed ingredients. This is an animal-feed standard, not a human-food identity.
- A currently accessible Sherbrooke pet retailer lists `farine d’alose tyran` in a cat-food formula. This confirms the Québec phrase in a local animal-food context, not a human-food SKU or a usable cooking form.

The bounded current-market search found no Québec or Canadian human-food listing for whole Atlantic menhaden, fillets, or a species-identified menhaden food product. Search results and selected retailer coverage cannot establish that no niche, imported, or direct-sale item exists. A matching human-food product or recipe would warrant a fresh review.

## Picker and exact-key audit

The review follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent and punctuation folding, complete normalized-word phrase matches first, then substring fallback. The live snapshot contains 1,471 ingredient references, 105 forms, 63 legacy candidates, and 1,812 ledger records with 7,492 source entries and 6,370 distinct source IDs. No active reference, form, legacy identity, or ledger record owns the candidate's species name, taxon, or proposed qualified bilingual display.

For a picker projection only, I compared current results with a hypothetical alias-free row displayed as `Atlantic menhaden / alose tyran`. This does not propose creating that row.

| Query | Current result | With hypothetical row | Implication |
|---|---|---|---|
| `Atlantic menhaden` / `menhaden` | None | Atlantic menhaden | Qualified name resolves to the proposed species. |
| `alose tyran` | None | Atlantic menhaden | Qualified Québec term resolves to the proposed species. |
| `alose` | American shad | American shad; Atlantic menhaden | A hypothetical French display expands the broad query rather than preserving its current single result. |
| `shad` | American shad | American shad | Do not add `shad` as an alias; it would falsely merge distinct taxa and picker intent. |
| `herring` | Atlantic herring; Pacific herring | Atlantic herring; Pacific herring | No effect if the row has no herring alias. |
| `bunker`, `pogy`, `pogie`, `fatback`, `mossback` | None | None | Do not add vernacular names as aliases without a relevant Canadian food label or recipe. |
| `Brevoortia tyrannus` | None | None | Keep the binomial in research provenance, not as a user-facing alias. |

Keep all names out of the active picker while the row is held. If later evidence supports activation, the only candidate display proposed for fresh review is `Atlantic menhaden / alose tyran`, with empty alias arrays. Do not add generic `alose`, `shad`, `herring`, `bunker`, `pogy`/`pogie`, `fatback`, `mossback`, or the binomial as aliases. The hypothetical display itself would make `alose` a two-result query; do not hide that effect.

## Recipe demand and data boundaries

All **114** manifest-listed recipe JSON files and their **1,123** ingredient rows were scanned for `Atlantic menhaden`, `menhaden`, *Brevoortia tyrannus*, `alose tyran`, `menhaden tyran`, `bunker`, `pogy`, `pogie`, `fatback`, and `mossback`. The scan found **zero matching recipe files and zero matching ingredient rows**. The recipe corpus therefore supports no reference link, relink, amount, preparation state, or recipe-scoped substitute.

No cooking measurement, density, count weight, edible yield, or cooking yield can be derived from the reviewed feed, fishery, and naming sources. Add no form, default density, unit mapping, conversion, measure, package observation, yield, or substitution rule. If a future source identifies menhaden oil or meal as a human-food ingredient, review that processed product separately rather than treating it as a whole-fish form. Do not infer substitution for Atlantic herring, American shad, blueback herring, or any other fish from family relationship or forage-fish use.

If future demand supports a whole-fish identity, revisit it as one species-scoped `PROTEIN` row with the qualified display above, no aliases, `defaultDensity: null`, empty `unitMappings`, and no forms or recipe links unless separate evidence establishes those fields. That conditional schema sketch is not an integration request today.

## Source register

These proposal-local IDs are not shared-ledger records. All were checked against the current ledger and proposal/batch archive before writing; the R125 prefix has no prior owner.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S01** | Canadian Food Inspection Agency, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species). Pairs *Brevoortia tyrannus* with `Atlantic menhaden`. | CFIA states this list is for aquatic-animal-health purposes and does not replace the Fish List used for food labelling. Common-name/taxon evidence only. |
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S02** | Agence canadienne d’inspection des aliments, [Espèces vulnérables au syndrome ulcératif épizootique](https://inspection.canada.ca/fr/sante-animaux/animaux-aquatiques/maladies/especes-vulnerables/syndrome-ulceratif-epizootique). Lists *B. tyrannus* as `menhaden tyran`. | Animal-health terminology, not a food label; page metadata gives a 2021 modification date. |
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S03** | Office québécois de la langue française, [Index alphabétique des termes officialisés](https://www.oqlf.gouv.qc.ca/ressources/bibliotheque/officialisation/termes-officialises-index-alphabetique.aspx). Includes `alose tyran`. | Establishes the Québec officialized term, not product availability or culinary usage. |
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S04** | Fisheries and Oceans Canada, [Rapport statistique: codes d’espèces](https://publications.gc.ca/collections/collection_2014/mpo-dfo/Fs97-13-1254.pdf). The bilingual species table maps *Brevoortia tyrannus* to `alose tyran / Atlantic menhaden`. | A 2014 species-code table; taxonomic naming evidence, not a current retail-name standard. |
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S05** | Fisheries and Oceans Canada, [Fish mortality and its population-level impacts at the Annapolis Tidal Hydroelectric Generating Station](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/40840086.pdf), p. 65. Says the species is not fished in Canada and Canadian occurrence is unpredictable. | Regional environmental assessment with a species paragraph; not a national landings database or import/retail survey. |
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S06** | NOAA Fisheries, [Atlantic Menhaden](https://www.fisheries.noaa.gov/species/atlantic-menhaden). Describes the U.S. commercial fishery and uses including meal, oil, bait, fertilizer, and animal feed. | U.S. fishery profile; does not describe Canadian consumer availability or exclude niche direct consumption. |
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S07** | Canadian Food Inspection Agency, [Canadian Feed Ingredients Table](https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table?wbdisable=false), entries for fish meal and mechanically extracted fish meal. Allows `menhaden` as a kind/origin descriptor in feed-meal labeling. | Livestock-feed ingredient standard, not a human-food ingredient listing. |
| **WP04-SECTIONP-ATLANTIC-MENHADEN-R125-20261015-S08** | Sherbrooke Canin, [Nutram Total T24 cat food](https://sherbrookecanin.com/products/nutram-total-t24-chat-sans-grains-truite-et-saumon). Its French ingredient list includes `farine d’alose tyran`. | One Quebec pet-food SKU, not food for human consumption; the page does not provide a whole-fish product or cooking measure. |

## Static review record

- Read `AGENTS.md`, the open Section P plan item, recent R121–R124 Section P proposals and batch READMEs, the American-shad identity review, current ingredient references/forms, legacy identities, the research ledger, the recipe manifest, and the picker matcher.
- Confirmed no dedicated Atlantic-menhaden/alose-tyran proposal, integration record, active identity, legacy candidate, or ledger candidate exists. The proposed reference ID `ingredient-ref-atlantic-menhaden` is unallocated.
- Audited the live picker with the current catalog and the hypothetical alias-free display; audited exact term ownership and the normalized broad `alose` / `shad` outcomes.
- Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows; candidate-name and vernacular scans returned no matches.
- Confirmed proposal-local source-ID uniqueness against current catalog source IDs and the proposal/batch archive. Checked local Markdown links, UTF-8/no-BOM encoding, LF line endings, final newline, mojibake markers, and whitespace after writing.
- This is one proposal-only file. No shared catalog, ledger, plan, roadmap, generated index, recipe, source code, or batch file was changed. No tests were run; no database JSON changed, and `AGENTS.md` exempts database-JSON-only additions from tests.


## Integration disposition

The hold is integrated in the [batch README](../batches/wp04-section-p-atlantic-menhaden-human-food-market-hold-integration-r125-20261015/README.md). No reference, ledger record, or source ID was added. The eight evidence IDs remain local to this proposal. No tests were needed for this documentation-only hold.
