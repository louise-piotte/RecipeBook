# WP04 Section P — striped mullet / mulet cabot market and picker review (R129)

- **Review and source-access date:** 2026-10-15.
- **Status:** Documentation-only hold integrated into the plan and roadmap; see the [R129 batch README](../batches/wp04-section-p-striped-mullet-picker-hold-integration-r129-20261015/README.md).
- **Packet type:** species identity, Canadian and Québec human-food-market, name, picker, and recipe-demand review.
- **Candidate:** striped mullet, *Mugil cephalus* (ITIS TSN 170335; CFIA TSN 170335).
- **Recommendation:** Hold the species outside active references, forms, and the research ledger. Do not resolve broad `mullet` or `mulet` searches to this single taxon.
- **Worktree scope at proposal handoff:** This proposal only. Integration added the batch README and plan/roadmap notes; no catalog, ledger, package, index, recipe, or application data changed. No tests were run.

## Parent checklist and bounded question

The exact open parent item is **P Fish shellfish seafood products roe and other regional proteins** in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4692):

> [ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper,
>     tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

This review asks whether a species row for *M. cephalus* can safely be exposed under the current bilingual ingredient picker. It covers no other mullet or goatfish identity, no roe or bottarga product, and no general fish form or substitution.

## Prior-work audit and current ownership

The Section P parent item remains open; this species has no focused active decision. The [R63 West African goatfish review](wp04-section-p-west-african-goatfish-picker-boundary-review-20261013-round63.md) discussed **red mullet** only as neighboring CFIA wording for *Mullus* and *Upeneichthys* products, distinct from *Pseudupeneus* goatfish. It did not assess or allocate *M. cephalus*. Earlier bottarga proposals mention *M. cephalus* as the source of a specific Orbetello cured-roe product; they address roe processing, not the whole fish, its bilingual picker identity, or Canadian whole-fish supply. These adjacent mentions are not a prior whole-fish review or allocation.

At proposal handoff on 2026-10-15, the split package contained **1,477 references** and **108 forms**; the legacy-import file contained **62 candidates**; the research ledger contained **1,821 records, 7,557 source entries, and 6,425 distinct source IDs**. After the same-day R129 tomato-form integration, root rechecked the active snapshot: **1,477 references**, **109 forms**, **61 legacy candidates**, and **1,822 ledger records, 7,571 source entries, and 6,429 distinct source IDs**. A case-insensitive scan of current reference names and aliases, form labels and match terms, legacy names and aliases, and ledger records found no owner for *Mugil cephalus*, **striped/grey/black mullet**, **mulet cabot**, or the prospective IDs `ingredient-ref-striped-mullet` and `candidate-striped-mullet`. No form is attached to this candidate, and the proposal-local source prefix remains unused in the current shared ledger.

The proposal-local source prefix **`WP04-SECTIONP-STRIPED-MULLET-R129-20261015`** was checked against ledger source IDs and the proposal/batch archive before assignment; no prior owner was found.

## Species identity and Québec naming

The current CFIA Fish List records *M. cephalus* as **Grey Mullet / Mulet Cabot** and also lists **Striped Mullet** for the same taxon. CFIA describes the Fish List as its reference for English and French fish names acceptable for Canadian labelling, with scientific names and taxonomic serial numbers. The same list separately applies **Mullet** to *Mullus surmuletus*, **Red Mullet** to *Mullus* spp. and *Upeneichthys* spp., and **Mullet / Suceur Ballot** and **Common Mullet / Suceur Rouge** to two *Moxostoma* species. Those are independent label-name rows across different taxa; they do not make the fishes interchangeable. [S01]

OQLF's edible-fish GDT entry identifies *M. cephalus*, prefers the Québec French name **mulet cabot**, and gives English **striped mullet** and **grey mullet**. It marks the species as having commercial potential in Québec, but the terminology record was last updated in 2011 and does not establish a current local sale. OQLF lists **muge cabot** and **muge** as contextual alternatives but says the Québec fish-product terminology committee did not retain those names. Keep the normalized compound `mulet cabot`; do not shorten it to `mulet` or use `muge` as a display or alias. [S02]

ITIS recognizes *M. cephalus* as a valid species and lists striped, gray, and black mullet as common names. This independently supports the species and the Canadian supplier's exact **Black Mullet** product wording; it does not determine Canadian package-label acceptability. [S03]

## Canadian and Québec human-food-market evidence

- Vaughan seafood supplier Seacore currently lists **Black Mullet — *Mugil cephalus*** and describes its own item as whole, fresh, wild, and a product of the USA. This is current Canadian wholesale-market evidence for a human-food product with an explicit species identity. It is not a Québec retail SKU or proof of routine Canadian catch. The source's SKU language does not override CFIA/OQLF's preferred bilingual pair. [S04]
- Montréal supplier United Seafood's current whole-fish selection includes **Red Mullet**. The page gives a Montréal address but no binomial, origin, or taxonomic scope for that listing. CFIA assigns Red Mullet to other taxonomic rows as well as groups, so do not identify this Québec item as *M. cephalus* or add `red mullet` to a striped-mullet row. [S05]
- Montréal retailer La Gambas currently lists **Oeuf de Mulet (Nenu Dieune)** as frozen fish roe of Senegal/Atlantic origin. The item is roe, not whole-fish flesh; its page gives no source species and has inconsistent weight information. It demonstrates Québec food use of broad `mulet` wording, but neither identifies *M. cephalus* nor supports a roe form, fish measure, or species link. Keep the roe product boundary separate. [S06]

The exact *M. cephalus* whole-fish product is therefore established in Canadian wholesale trade, but the bounded search found no current Québec whole-fish listing that identifies this species. OQLF's dated commercial-potential note and the unrelated Montréal red-mullet and mullet-roe listings are not species-specific Québec sale evidence.

## Picker projection

The projection follows the current bilingual phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Complete normalized word phrases are returned before substring fallback. This is a static projection from the live references and forms with one hypothetical alias-free `striped mullet / mulet cabot` row; no catalog row is proposed for activation.

| Query | Current result | With a hypothetical `striped mullet / mulet cabot` row | Boundary |
|---|---|---|---|
| `striped mullet` | None | striped mullet / mulet cabot | Species-qualified English wording selects the candidate. |
| `mulet cabot` | None | striped mullet / mulet cabot | OQLF-preferred Québec French compound selects the candidate. |
| `mullet` | None | striped mullet / mulet cabot only | A broad English query becomes a singleton even though CFIA applies Mullet names across *Mugil*, *Mullus*, and *Moxostoma* taxa. |
| `mulet` | None | striped mullet / mulet cabot only | The compound display would make this broad token species-specific even though a current Montréal roe listing uses `mulet` without naming the source species. |
| `grey mullet`, `gray mullet`, `black mullet` | None | None with no aliases | ITIS and Seacore use these names for *M. cephalus*, but no alias is proposed while the row is held. |
| `red mullet`, `rouget-barbet` | None | None | Do not redirect CFIA's *Mullus* / *Upeneichthys* market names or the R63 goatfish boundary to this species. |
| `mullet roe`, `oeuf de mulet`, `Mugil cephalus` | None | None | Do not merge the Québec roe item with whole-fish flesh or add the binomial as an alias. |

The exact bilingual pair is well supported, but adding the display would make broad `mullet` and `mulet` queries select *M. cephalus* alone. CFIA's current name rows apply English `Mullet` to other taxa, and the Montréal roe listing shows that Québec sellers also use short `mulet` wording without a source-species statement. The current picker has no broader fish-name choice that could keep these queries unresolved, and adding aliases would not repair the display-term collision. Keep this species unallocated until search can preserve the broad choice set or a user supplies a qualified name.

## Bundled recipe demand and data boundaries

The current manifest lists **114 recipe files and 1,123 ingredient rows**. Every manifest-listed file and row was scanned for **striped mullet**, **grey/gray/black mullet**, **mullet**, **mulet cabot**, **mulet**, **muge cabot**, **Mugil cephalus**, **red mullet**, **mullet roe**, and **oeuf de mulet**. The scan found **zero matching files and zero matching ingredient rows** for every term. No recipe link, relink, preparation state, amount, or recipe-scoped substitution is justified.

Seacore's **whole, fresh, wild** description belongs to one supplier product. It does not establish generic ingredient forms, a package/portion measure, density, mass-volume conversion, count weight, edible yield, or cooking yield. Add no form or numeric behavior. No recipe or reviewed source establishes a directed, context-scoped substitution between *M. cephalus* and red mullet, goatfish, another mullet taxon, or a different finfish.

## Recommendation

Keep *Mugil cephalus* outside active references, forms, legacy candidates, and the shared research ledger. The evidence supports a real species identity, the Québec display **mulet cabot**, and a current Canadian whole-fish SKU. The blocker is picker scope: `mullet` and `mulet` would become singleton results for one species even though Canadian name sources apply those words in other fish contexts; current Québec listings reviewed do not resolve that species ambiguity, and the recipe bundle has no demand. **JSON delta: none.** Do not add a reference, alias, candidate, form, recipe link, density, mapping, conversion, yield, or substitution.

## Source register

These proposal-local source IDs are not shared-ledger records.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S01** | Canadian Food Inspection Agency, [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [searchable Fish List](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp). Current result rows list *M. cephalus* as Grey Mullet / Mulet Cabot and Striped Mullet; separately list Mullet for *Mullus surmuletus*, Red Mullet for *Mullus* spp. and *Upeneichthys* spp., and Mullet/Common Mullet for *Moxostoma* species. | Official Canadian labelling-name source; its overview says acceptable names and scientific names/TSNs, but it is not product availability, culinary equivalence, or recipe evidence. The English overview is dated 2019-06-28; the result set was accessed 2026-10-15. |
| **WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S02** | Office québécois de la langue française, [GDT: mulet cabot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198990/mulet-cabot), last updated 2011. Gives preferred `mulet cabot`, English `striped mullet` and `grey mullet`, and *M. cephalus*; says `muge cabot` and `muge` were not retained for fish-product marketing. | Québec terminology and edible-fish naming, not a current product listing or market census. |
| **WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S03** | Integrated Taxonomic Information System, [*Mugil cephalus* report, TSN 170335](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=170335), retrieved 2026-10-15. Treats the species as valid and lists striped, gray, and black mullet as English common names. | Taxonomy/common-name cross-reference; not Canadian food-label authorization or a market survey. |
| **WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S04** | Seacore Seafood Products, [Black Mullet](https://www.seacoreseafood.com/product/Mullet_Black), retrieved 2026-10-15. Lists *M. cephalus*, whole/fresh/wild product, USA origin, and a Vaughan, Ontario business address. | Canadian supplier product evidence; not a Québec retail listing, universal form, or reusable measure. The web page has no item-specific publication date. |
| **WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S05** | United Seafood, [The Whole Fish Selection](https://www.unitedseafood.ca/wholefish.html), retrieved 2026-10-15. Montréal supplier page includes `Red Mullet` in its current whole-fish selection and gives a Saint-Léonard address. | No binomial, product origin, item state beyond the page's whole-fish section, or current inventory guarantee; do not assign the product to *M. cephalus*. |
| **WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S06** | Poissonnerie La Gambas, [Oeuf de Mulet (Nenu Dieune)](https://lagambas.ca/products/oeuf-de-mulet-nenu-dieun), retrieved 2026-10-15. Current Montreal retailer page marks a frozen Senegal/Atlantic-origin fish-roe product in stock. | Roe, not whole-fish meat; no source species; page's product/variant weights conflict. Supports only broad Québec food-market wording, not a species identity or measurement. |
| **WP04-SECTIONP-STRIPED-MULLET-R129-20261015-S07** | Local static audit of the live references, forms, legacy candidates, ledger, manifest-listed recipe corpus, search implementation, plan, roadmap, and focused WP04 proposal/batch archive; accessed 2026-10-15. | Bounded repository snapshot and search only; absence from the bundle or reviewed listings does not prove universal Canadian unavailability. |

## Static review record

- Read `AGENTS.md`, Requirements FR-3/FR-5/FR-7, the open Section P parent checklist, current roadmap context, live references/forms, legacy candidates, ledger, recipe manifest, and `IngredientSearch.kt`.
- Audited Section P proposals and batches for *M. cephalus* and its names. The exact focus remains unallocated; prior bottarga mentions concern roe, and R63's red-mullet note concerns a different fish-name boundary.
- Read the split package and scanned all **114 manifest-listed recipe files** and **1,123 ingredient rows** for the candidate names and broad terms. No recipe match was found.
- Projected the current matcher against the hypothetical alias-free bilingual display. Exact qualified queries resolve to the candidate; bare `mullet` and `mulet` would each produce that one row despite broader CFIA English naming and the Québec seller's species-unspecified use of `mulet` for roe.
- Confirmed the candidate is unowned in the current active package, legacy file, and research ledger; all seven proposal-local source IDs are unique. No shared JSON, catalog, index, recipe, or application data changed.
- Root independently reviewed CFIA's Fish List result rows, the OQLF GDT entry, ITIS, and the listed Canadian/Québec supplier pages before integrating this documentation-only hold. No unit, instrumentation, Gradle, emulator, or other tests were run.
