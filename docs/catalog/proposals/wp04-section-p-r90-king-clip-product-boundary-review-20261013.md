# WP04 Section P — King Clip product-to-species boundary (R90)

- **Review date:** 2026-10-13.
- **Packet type:** proposal-only seafood product identity, taxon-boundary, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Hold Seacore's current Canadian **King Clip** fillet listing outside active ingredient references and the research ledger. The seller page does not name a taxon, while Québec and federal terminology sources apply **kingklip** to both *Genypterus blacodes* and *G. capensis*. Do not bind the SKU to either species or create a taxon-free `King Clip` ingredient row.
- **Data delta:** none. No reference, alias, form, candidate, ledger record, recipe link, conversion, yield, or substitution is proposed.
- **Tests:** none run. This is a documentation-only proposal; no database JSON changed.

## Why this is an open and distinct Section P question

The active [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4278) keeps finfish and regional seafood coverage open. The existing cusk review accepted *Brosme brosme* as `cusk / brosme` and explicitly kept cusk-eel/kingklip separate. That review did not identify the species behind Seacore's separate, current **King Clip** SKU or resolve the cross-species use of `kingklip`. This review concerns that product-to-taxon assignment; it does not reopen cusk, sea scallop, or another recent integration.

Seacore Seafood lists **King Clip** as fresh, wild fillets from Costa Rica on its Canadian distributor site. The page supplies no Latin name. OQLF identifies *G. blacodes* as the edible fish **abadèche rose** and lists `kingklip` among its English terms. OQLF separately identifies *G. capensis* as the edible fish **abadèche du Cap** and lists `kingklip` and `South African kingklip` as English terms. The Government of Canada's TERMIUM Plus entry for *G. capensis* explicitly notes that `kingklip` is also used for *G. blacodes*. The seller's unqualified `King Clip` label therefore cannot select one species.

## Identity and product evidence

| Evidence | Finding | Boundary |
|---|---|---|
| OQLF GDT, *abadèche rose* | Preferred Québec French term for edible *Genypterus blacodes*. English terms include `golden kingklip`, `kingklip`, and `pink cusk-eel`; contextual `lingue` was not retained for Québec fish-product marketing. | Supports a species-qualified identity and wording; it does not identify Seacore's SKU. |
| OQLF GDT, *abadèche du Cap* | Preferred Québec French term for edible *Genypterus capensis*. English terms include `kingklip` and `South African kingklip`; the entry notes commercial potential in Québec. | “Commercial potential” is not a current product or availability finding. The English `kingklip` term overlaps *G. blacodes*. |
| Government of Canada, TERMIUM Plus | Records `kingklip` for *G. capensis* and states that the common name is also used for *G. blacodes*. | Establishes the cross-species naming conflict; not a package declaration. |
| CFIA Fish List | The result for TSN 165000, *G. blacodes*, lists `Cusk-eel / Abadéche Rose` and `Kingklip`. The list was modified 2023-09-18. | Canadian common-name and taxon evidence. It is not a species statement on the current `King Clip` listing and does not erase the OQLF/TERMIUM usage for *G. capensis*. |
| Seacore Seafood, current product page | Lists **King Clip** as fresh, wild fillets, product of Costa Rica; page identifies the seller in Vaughan, Ontario. | Current Canadian seller evidence, but no binomial, package weight, count, recipe basis, or Québec-specific retail evidence. |

The exact product title's spacing does not establish that it is *G. blacodes*. Nor does a country-of-origin statement identify a fish species. Keep the item separate from `cusk / brosme` (*Brosme brosme*), from both *Genypterus* species identities, and from generic fish or cusk-eel synonyms until a package or manufacturer source identifies this SKU's taxon.

## Exact ownership and prior-review audit

The current live snapshot contains **1,421 ingredient references, 104 forms, 63 legacy candidates, 1,760 research-ledger records, 114 recipe files, and 1,123 ingredient rows**. Exact normalized-key checks across active reference displays and aliases, attached form labels and match terms, legacy candidate displays and aliases, and ledger identity ownership found no active owner for `King Clip`, `king clip`, `kingklip`, `kingclip`, `king klip`, `pink cusk-eel`, `abadèche rose`, `abadèche du Cap`, *Genypterus blacodes*, *G. capensis*, or `ingredient-ref-pink-cusk-eel`.

The active `ingredient-ref-cusk` reference owns only `cusk / brosme`; it remains a separate species identity. The existing cusk proposal and ledger mention *G. blacodes* and kingklip only as an excluded neighbor and reuse the CFIA Fish List lookup below. No focused earlier proposal or integration was found for the current Seacore **King Clip** product or the `kingklip` two-species product boundary. No form, active measurement, package-yield record, or substitution rule is linked to this product.

New proposal-local source IDs `WP04-SECTIONP-KING-CLIP-BOUNDARY-R90-20261013-S01` through `S05` were checked against the live ledger and proposal/batch archive and were unused before this proposal. The prior CFIA source `WP04-P-CUSK-BROSME-20261012-S02` is reused rather than duplicated.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, punctuation, and accents, returns complete word-phrase matches first, and uses substring matches only when there are no complete phrase matches. I statically evaluated the current JSON and a conditional `pink cusk-eel / abadèche rose` row with empty aliases; that row is illustrative and is **not** proposed for insertion.

| Query | Current result | Conditional species row with no aliases | Decision |
|---|---|---|---|
| `King Clip`, `king clip`, `kingklip`, `kingclip`, `king klip` | None | None | Do not add these seller/shared market terms as aliases to one species. A singleton would conceal the *G. blacodes* / *G. capensis* conflict. |
| `pink cusk-eel`, `abadèche rose` | None | `pink cusk-eel / abadèche rose` | These names are specific to *G. blacodes*, but the current seller item is not linked to that taxon. |
| `abadèche du Cap` | None | None | Distinct Québec name for *G. capensis*; it does not identify the SKU. |
| `cusk` | `cusk / brosme` | `cusk / brosme` plus `pink cusk-eel / abadèche rose` | A future species row would leave two distinct cusk-family search choices visible; it still would not assign the seller product. |
| `eel` | `American eel / anguille` | `American eel / anguille` plus `pink cusk-eel / abadèche rose` | A hypothetical qualified display broadens this query; no alias is needed. |

No taxon-free display is proposed: Seacore has no Québec French product name, and a generic active `King Clip` row would store the unresolved species claim as though it were one ingredient identity.

## Recipe demand

I scanned the full manifest-ordered corpus: all **114 recipe files**, all **1,123 ingredient rows**, and the complete parsed recipe JSON for `King Clip`, `king clip`, `kingklip`, `kingclip`, `king klip`, `pink cusk-eel`, `abadèche rose`, `abadèche du Cap`, *Genypterus blacodes*, and *G. capensis*. The scan found **zero candidate-term hits in ingredient rows and zero matching recipe files**. There is no recipe line or user-requested product that ties the seller SKU to either taxon. No recipe link or relink is proposed.

## Measures, conversions, yields, and substitutions

The current Seacore page does not report a net weight, fillet count, serving size, edible basis, or recipe amount. Seacore's product-list PDF is dated with prices as of 2016-08-31 and lists SKU 423005 as `KING CLIP FILLETS 3-5 LB FRESH`, with a 50 lb case and a skinless/boneless description. This dated seller pack specification is not an amount tied to the current web page or a kitchen portion, edible-yield study, or unit mapping. Do not transfer it to the catalog.

The reviewed OQLF, TERMIUM, CFIA, and current seller pages provide no density, count-to-mass value, volume mapping, whole-to-edible yield, or cooking-yield factor for the current item. This scoped naming/product review did not find a recipe- or method-specific substitute for either species or the seller SKU; it does not claim a comprehensive substitution survey. Add no measurement observation, active form, conversion, yield, package value, or substitution rule.

## Recommended disposition and exact delta

**Hold** the product-to-species allocation. The exact proposed shared-data delta is empty:

```json
{
  "ingredient-references.v1.json": [],
  "ingredient-forms.v1.json": [],
  "legacy-import-identities.v1.json": [],
  "research-ledger.v1.json": [],
  "recipe-links": [],
  "conversions": [],
  "yields": [],
  "substitutions": []
}
```

Reopen this boundary if the current seller or package supplies the scientific name for the **King Clip** item, or a bundled recipe requests a species-qualified product. If a source later identifies *G. blacodes*, consider only `pink cusk-eel / abadèche rose` as the display pair. If it identifies *G. capensis*, obtain a species-qualified bilingual display whose English term is separately supported and does not present the shared `kingklip` query as exclusive to that species. Keep unqualified `kingklip` and `King Clip` out of global aliases unless a broader multi-species picker allocation is separately resolved. Any measure, yield, or substitution requires its own product- and method-matched evidence.

## Sources

Sources were accessed on 2026-10-13. Source IDs below are proposal-local and have not been added to the research ledger.

| Source ID | Direct source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-KING-CLIP-BOUNDARY-R90-20261013-S01` | OQLF, [abadèche rose (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199126/abadeche-rose) | Preferred French term for edible *G. blacodes*; English translations include `golden kingklip`, `kingklip`, and `pink cusk-eel`; last updated 2011. Terminology, not Seacore taxon identification. |
| `WP04-SECTIONP-KING-CLIP-BOUNDARY-R90-20261013-S02` | OQLF, [abadèche du Cap (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199127/abadeche-du-cap) | Preferred French term for edible *G. capensis*; English terms include `kingklip` and `South African kingklip`; last updated 2011. The commercial-potential note is not proof of current Québec supply. |
| `WP04-SECTIONP-KING-CLIP-BOUNDARY-R90-20261013-S03` | Translation Bureau, [TERMIUM Plus search result for *Genypterus capensis*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frb&lang=eng&srchtxt=ABADECHE+CAP) | Lists `kingklip` for *G. capensis* and notes the common name is also used for *G. blacodes*; gives French `abadèche du Cap`. Record dated 2023-01-04; page reports last modified 2026-08-30. Naming evidence, not a package declaration. |
| `WP04-SECTIONP-KING-CLIP-BOUNDARY-R90-20261013-S04` | Seacore Seafood, [King Clip](https://www.seacoreseafood.com/product/King_Clip) | Current Canadian seller listing: fillets, fresh, wild, product of Costa Rica; no binomial or package amount. It supports a seller product-name boundary only. |
| `WP04-SECTIONP-KING-CLIP-BOUNDARY-R90-20261013-S05` | Seacore Seafood, [Fish and Seafood Product List (PDF)](https://www.seacoreseafood.com/user_files/upload/files/Seacore%20Seafood%20Product%20List%20Fish%20and%20Seafood.pdf) | Page 1 says prices as of 2016-08-31; page 8 lists item 423005 as 3–5 lb fresh King Clip fillets and a 50 lb case, skinless/boneless. The PDF does not identify the species or tie the pack specification to a consumer recipe quantity. |
| **Reused** `WP04-P-CUSK-BROSME-20261012-S02` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | The result for TSN 165000 lists *G. blacodes* as `Cusk-eel / Abadéche Rose` and separately `Kingklip`. Modified 2023-09-18. This is Canadian common-name evidence; it does not identify the taxon on Seacore's current item. |

## Static checks performed

- Re-read the current `AGENTS.md`, `Requirements.md`, WP04 Section P checklist, latest roadmap entries, and the prior cusk, shellfish, and R89 proposal/archive records.
- Verified reference, form, legacy-candidate, ledger-record, proposal, and batch ownership for the candidate names and IDs; checked the five new proposal-local source IDs for collisions.
- Reproduced the active phrase-first and substring-fallback search behavior from `IngredientSearch.kt` against the current references/forms and the conditional species row.
- Parsed the manifest-listed recipes and scanned all 114 files and 1,123 ingredient rows plus full recipe JSON text for the candidate spellings and both scientific names.
- Read the saved proposal back as UTF-8 without BOM and checked its source links and R90 source-ID uniqueness. No app, Gradle, emulator, or test tasks were run.
