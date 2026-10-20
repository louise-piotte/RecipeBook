# WP04 Section P — green sea urchin identity and whole-product boundary review (R132)

- **Review and source-access date:** 2026-10-15.
- **Packet type:** species identity, Québec market/product, picker-boundary, recipe-demand, and data-scope review.
- **Candidate:** green sea urchin, *Strongylocentrotus droebachiensis*; Québec French **oursin vert**.
- **Recommendation:** hold an active whole/live species row and make no catalog or ledger change. OQLF terminology, Canadian species/stock sources, and a current Montréal fishmonger listing support the distinct species and a Québec whole/live product. Under the current phrase-first picker, however, that row would be the sole result for broad `sea urchin` and `oursin` searches even though CFIA assigns overlapping sea-urchin names to more than one species. The bundled corpus has no matching recipe demand.
- **Write scope:** this proposal only. No reference, form, legacy candidate, research-ledger record, recipe link, plan, roadmap, application code, or generated index is changed.

## Open checklist and selection boundary

The still-open WP04 Section P parent is **“Sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood with verified names”** in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5643). The Section P shellfish identity parent also remains open after the Pacific and Eastern oyster integrations.

This is a review of one concrete candidate: the **whole/live green sea urchin species** represented by a Québec retailer's *S. droebachiensis* product. It is not a re-review of the already integrated Pacific oyster (*Magallana gigas* / *Crassostrea gigas*) or Eastern oyster (*Crassostrea virginica*), and it does not reopen the generic fresh-oyster candidate.

The prior [sea-urchin gonad/uni product review](wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md) held extracted edible gonads because no recipe requested them. That review explicitly kept whole/live urchins and species-qualified `oursin vert` separate; it did not allocate a *S. droebachiensis* reference or decide the whole/live species picker boundary. This packet does not repeat or change that uni decision. The existing unresolved `candidate-sea-urchin-gonads-uni` record remains untouched.

The active plan's parent remains open. The roadmap records the R130 Pacific-oyster and R131 Eastern-oyster integrations and says Section P remains open; this candidate is a separate echinoderm and product state.

## Ownership and prior-decision audit

The current package snapshot contains **1,482 active references**, **109 forms**, **61 legacy-import candidates**, and **1,827 research-ledger records**. The seed manifest lists **114 recipes**.

There is no active reference, form, or legacy-import candidate for `green sea urchin`, `sea urchin`, `oursin vert`, `oursin`, or *Strongylocentrotus droebachiensis*. No active form attaches to a sea-urchin identity. The only related ledger record is the distinct, unresolved `candidate-sea-urchin-gonads-uni` record for extracted gonads; it is not an active whole-animal identity and is not reused here. The prospective ID `ingredient-ref-green-sea-urchin` is unallocated.

The proposal-local source prefix **`WP04-SECTIONP-GREEN-SEA-URCHIN-R132-20261015`** was checked against the live ledger and the existing proposal/batch archive before assignment; it has no collision. These source IDs remain local to this proposal and are not ledger records.

## Species naming and Canadian/Québec product evidence

OQLF's food-products/zoology entry normalizes **oursin vert** and links it to *Strongylocentrotus droebachiensis*. It lists `green sea urchin` among the English translations and says `châtaigne de mer` was not retained for Québec fish-product marketing to avoid consumer-label confusion. The entry was last updated in 2012, so it supports the Québec species term, not current product availability. [S01]

CFIA's Fish List identifies *S. droebachiensis* (TSN 157969) with `Sea Urchin / Oursin Vert` and `Green Sea Urchin / Oursin`. Its results also identify *S. purpuratus* (TSN 157975) with `Purple Sea Urchin / Oursin` and `Sea Urchin / Oursin Violet`. Thus the species-qualified pair is supported, while bare `sea urchin` and especially bare `oursin` do not define a unique species across the Canadian list. The Fish List is a Canadian common-name source; it does not make the taxa culinary substitutes. [S02]

DFO's 2026 research document analyzes green-sea-urchin stocks in Québec coastal fishing areas in 2024 using reported landings and effort from 2002–2024, a fishery-independent Saguenay survey, and size observations. It establishes current Québec fishery context and the species, not a retail recipe amount or a universal edible-product state. [S03]

The current online listing from Montréal fishmonger Poissonnerie La Mer is titled **Oursins Verts Vivants**. It identifies the product as *S. droebachiensis*, local to Rimouski, Québec, wild-harvested and live. It offers 500 g, 1 kg, and a 4.54 kg preorder case; the page reports a source-specific unit calibre of 40–100 g. Its preparation note describes opening the animal and removing the gonads for consumption. This is direct Québec human-food retail evidence for a whole/live animal distinct from separately sold gonads. It is one seller's current listing, not a market census or a guarantee of inventory at every access time. [S04]

DFO's species profile likewise distinguishes the green species and says the commercial fishery is for its eggs, most of which are exported to Asia. Its page was modified in 2022 and describes a fishery context; it does not establish that all green urchins are sold whole or that the Québec listing represents the wider Canadian market. [S05]

## Picker projection and ambiguity

The current search implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) matches complete word phrases within reference names and aliases before partial matching. A static projection considered the qualified hypothetical display `green sea urchin / oursin vert`, with only plural forms of those qualified names as hypothetical aliases. No row or aliases are proposed for integration.

| Query | Current active results | With the hypothetical qualified row | Boundary |
|---|---|---|---|
| `green sea urchin`, `green sea urchins` | None | `ingredient-ref-green-sea-urchin` alone | Species-qualified English wording identifies *S. droebachiensis*. |
| `oursin vert`, `oursins verts` | None | `ingredient-ref-green-sea-urchin` alone | OQLF-preferred Québec French wording identifies *S. droebachiensis*. |
| `sea urchin`, `sea urchins` | None | `ingredient-ref-green-sea-urchin` alone | The display contains the broad phrase, so avoiding a broad alias cannot prevent a singleton result. CFIA also lists a purple sea-urchin species under a name containing `Sea Urchin`. |
| `oursin`, `oursins` | None | `ingredient-ref-green-sea-urchin` alone | The French display contains this broad word. CFIA uses `Oursin` for more than one listed species. |
| `uni`, `gonades d’oursin` | None | None | These refer to the distinct extracted-gonad product boundary; the existing uni candidate remains held. |

The local catalog currently returns no active sea-urchin species for any query above. Adding only the qualified species display would make both broad queries look resolved to this one row, despite the Canadian species/name collision and the distinct whole-live versus extracted-gonad products. This proposal therefore adds no aliases and holds the reference itself; aliases alone cannot fix the picker behavior because the broad words occur in the required bilingual display.

## Full recipe demand and product data boundary

The manifest-listed corpus scan covered **all 114 recipe files and all 1,123 ingredient rows**. It searched full recipe JSON and ingredient-line content for `sea urchin`, `green sea urchin`, `sea egg`, `uni`, `oursin`, `oursin vert`, `gonades d’oursin`, and *Strongylocentrotus droebachiensis*. It found **zero matching recipe files and zero matching ingredient rows**. No recipe link, quantity, recipe form, or substitution target can be established from the bundle.

La Mer's 40–100 g per-animal calibre and package options describe that seller's whole/live product. They do not support a reusable count-to-mass measure, default density, unit mapping, edible yield, or conversion from live shell-on animal to edible gonads. Add no `whole`, `live`, `raw`, cooked, frozen, or other active form without recipe demand and a clear form use-case. Keep the whole/live item distinct from extracted gonads/uni, other sea-urchin species, and fish roe.

No reviewed source supports substituting green sea urchin for extracted uni, purple/red sea urchins, fish roe, or another shellfish. Add no global form conversion, contextual substitution, yield, or recipe-line substitution.

## Recommendation and no-delta record

**Hold** the green sea-urchin whole/live species row outside the active picker and research ledger for now. Do not allocate `ingredient-ref-green-sea-urchin`; add no reference JSON, legacy candidate, ledger record, alias, form, recipe link, density, unit mapping, measure, conversion, yield, or substitution. Preserve the existing `candidate-sea-urchin-gonads-uni` decision unchanged.

The candidate is supported as a Québec species and food product. The hold is specifically about broad-query ambiguity in the current picker and the absence of any bundled recipe demand; the market and name findings are not a claim that green sea urchin is unavailable or inedible. Reopen if a bundled recipe explicitly requests *S. droebachiensis* or if search can present the broader species and product choices instead of returning this one hypothetical row for `sea urchin` / `oursin`.

## Source register

All web sources were accessed on **2026-10-15**. IDs below are unique to this proposal and are not shared research-ledger source IDs.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-GREEN-SEA-URCHIN-R132-20261015-S01** | Office québécois de la langue française, [oursin vert, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198891/oursin-vert), last updated 2012. Preferred food-product term `oursin vert`; links it to *Strongylocentrotus droebachiensis* and gives English `green sea urchin` among the translations. Rejects `châtaigne de mer` for Québec fish-product marketing to avoid confusion. | Terminology and species scope; not current inventory or a product-state specification. The additional English translations include broad terms and are not proposed as catalog aliases. |
| **WP04-SECTIONP-GREEN-SEA-URCHIN-R132-20261015-S02** | Canadian Food Inspection Agency, [Fish List search results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on%2F1000&cmbIn=e&lang=e&q=sea%20urchin), checked for TSNs 157969 and 157975. Lists *S. droebachiensis* as `Sea Urchin / Oursin Vert` and `Green Sea Urchin / Oursin`; lists *S. purpuratus* as `Purple Sea Urchin / Oursin` and `Sea Urchin / Oursin Violet`. | Canadian food common-name evidence; the Fish List does not define culinary interchangeability or resolve a recipe's intended species. The dynamic result page may change. |
| **WP04-SECTIONP-GREEN-SEA-URCHIN-R132-20261015-S03** | Government of Canada Publications / Canadian Science Advisory Secretariat, [Assessment of green sea urchin stocks in Québec's coastal waters in 2024](https://publications.gc.ca/site/eng/9.961519/publication.html), published May 2026. Names *S. droebachiensis* and describes data used to assess Québec coastal fishing areas, landings/effort through 2024, survey data, and size measurements. | Fishery and stock context, not a current retail SKU, culinary form standard, recipe measure, or edible yield. |
| **WP04-SECTIONP-GREEN-SEA-URCHIN-R132-20261015-S04** | Poissonnerie La Mer, [Oursins verts vivants](https://www.lamer.ca/products/oursins-verts-vivants), product page reviewed 2026-10-15. Current Québec listing names *S. droebachiensis*, Rimouski origin, wild harvest, live state, package options, and a 40–100 g per-animal calibre; its preparation text distinguishes gonads inside the whole animal. | One retailer's item page. Package and calibre are source-specific, and a listing does not guarantee current inventory or universal handling, yield, or recipe measures. |
| **WP04-SECTIONP-GREEN-SEA-URCHIN-R132-20261015-S05** | Fisheries and Oceans Canada, [Oursin vert species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/green-sea-urchin-oursin-vert-fra.html), modified 2022-01-25. Identifies *S. droebachiensis* and describes a commercial fishery for its gonads/eggs, mostly exported to Asia. | Species/fishery context only; it does not establish Québec whole-live retail supply or a universal form/measure. |

## Static review record

- Read `AGENTS.md`, the relevant bilingual ingredient-reference and conversion/substitution requirements in `Requirements.md`, the open Section P plan checklist, and the current R130/R131 roadmap context.
- Reviewed current references, forms, legacy candidates, ledger ownership, and the focused sea-urchin proposal/batch archive. The sole related ledger item is the distinct extracted-gonad/uni candidate; no whole/live species allocation was found.
- Confirmed the proposed future reference ID and this proposal's source-ID prefix have no current owner/collision in the ledger and focused archive.
- Reproduced the phrase-first picker projection for a hypothetical qualified row; the broad English and French queries would each return that row alone.
- Scanned the full manifest-listed corpus: **114 recipe files / 1,123 ingredient rows**, with zero full-file hits and zero ingredient-row hits for the checked species/product terms.
- This is documentation-only. No app, Gradle, unit, instrumentation, or emulator tests were run; no shared catalog, ledger, roadmap, or generated file was edited.
