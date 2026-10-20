# WP04 Section P R742 — fresh whole Pacific cod form review

- **Review date:** 2026-10-18.
- **Status:** Integrated in the WP02/WP03/WP04 R740–R742 batch. The qualified fresh-whole form and its form-level source record are active; no recipe, measure, yield, conversion, or substitution was added.
- **Checklist:** The Section P finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6840). The latest [R737–R739 checkpoint](../ingredient-catalog-workflow.md#L3039) added a fresh-whole Atlantic-cod form; this review selects the distinct Pacific-cod identity.
- **Candidate:** One `fresh_whole` form under existing `ingredient-ref-pacific-cod` for *Gadus macrocephalus*.
- **Recommendation:** Add `fresh whole Pacific cod / morue du Pacifique fraîche entière`. Current Metro consumer guidance places Pacific cod in a whole-or-fillet, fresh-or-frozen fish-counter offer. Canfisco's current species page confirms the species and fresh product forms; its detailed whole-round table is from June 2023. Together, these support the presentation category, while no current SKU-level whole-Pacific-cod listing or Québec inventory was found. Do not imply a specific cleaning state, measure, yield, recipe link, or substitution.

## Bounded identity and form decision

The active reference is `ingredient-ref-pacific-cod`, displayed as **Pacific cod / morue du Pacifique**, with English aliases `gray cod` and `grey cod`; it has no French aliases, density, or unit mappings. Its only active form is `ingredient-form-pacific-cod-loin`. The proposed ID `ingredient-form-pacific-cod-fresh-whole` and exact bilingual labels have no active reference/form or legacy-candidate owner, no research-ledger record, and no earlier focused fresh-whole Pacific-cod proposal or integration. The open Section P finfish parent and the proposal archive were re-read before this selection.

The proposed French form composes the existing Québec French identity with feminine adjective agreement: `morue du Pacifique fraîche entière`. It does not claim that Metro or Canfisco uses that exact French SKU title. Keep `morue`, `cod`, `whole cod`, `morue entière`, `whole fish`, `poisson entier`, scientific names, and alternative gray/grey names out of new aliases or match terms; the full form labels alone are sufficient. This does not reopen R739's Atlantic-cod form or the Atlantic-cod fillet and centre-cut holds.

## Evidence and source ownership

| Evidence and owner | Supports | Limits |
|---|---|---|
| Existing ledger sources `WP04-PACIFIC-COD-IDENTITY-20261012-S01`, `...-S02`, and `...-S03`: CFIA Fish List [Pacific Cod search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pacific%20Cod), and DFO [Pacific Cod profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-eng.html) / [Morue du Pacifique profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-fra.html). | Reuse these current ledger-owned sources for the existing name pair and *G. macrocephalus*. DFO identifies the species as commercially important in Canada. | Identity/distribution evidence only. DFO's statement that Pacific cod is considered a market equivalent to Atlantic cod is not evidence of a cooking or recipe substitution. Reuse the existing source IDs; do not duplicate their source objects or URLs. |
| New proposal source `WP04-SECTIONP-PACIFIC-COD-FRESH-WHOLE-R742-20261018-S01`, Metro [Cod](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/cod), accessed 2026-10-18. | Current consumer guidance identifies the species in its North Pacific section, describes Pacific cod, and says it is available fresh or frozen, whole or in fillets from the Metro fish expert. | Guidance is species-contextual rather than an item-level SKU listing; it does not establish selected-store inventory, whole-fish cleaning state, size, or a reusable measure. No exact URL owner was found in the live ledger or proposal/batch archive. |
| New proposal source `WP04-SECTIONP-PACIFIC-COD-FRESH-WHOLE-R742-20261018-S02`, Metro [Morue](https://www.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/morue), accessed 2026-10-18. | The paired French page's North Pacific/Pacific-cod section says the fishmonger offers morue fresh or frozen, whole and in fillets. It supports the Québec-facing form wording in context. | Paired language route for the same Metro guidance, not independent market evidence. It gives no product code or exact stock state. No exact URL owner was found in the live ledger or proposal/batch archive. |
| New proposal source `WP04-SECTIONP-PACIFIC-COD-FRESH-WHOLE-R742-20261018-S03`, Canfisco Group [Pacific Cod](https://canfiscogroup.com/our-products/pacific-cod/), accessed 2026-10-18. | Current supplier page names *Gadus macrocephalus* and lists headed-and-gutted fish, skinless fillets, fresh, IQF, and shatterpack forms. It confirms current supplier-level species and product activity. | The current HTML page does not explicitly list whole-round fish or pair freshness with each individual form; headed-and-gutted is not relabeled as whole-round. No item code, consumer quantity, or Québec stock is given. No exact URL owner was found in the live ledger or proposal/batch archive. |
| New proposal source `WP04-SECTIONP-PACIFIC-COD-FRESH-WHOLE-R742-20261018-S04`, Canfisco Group [Groundfish Fresh & Frozen product catalogue (June 2023 PDF)](https://canfiscogroup.com/wp-content/uploads/2023/06/CanfiscoGroup-products-2023-06.pdf), pp. 9–10, accessed 2026-10-18. | The catalogue names Pacific cod, *G. macrocephalus*, as fresh and frozen and sold as fillets, dressed head off, or whole round year-round. This supplies the detailed supplier form boundary absent from the current product page. | This is a 2023 supplier catalogue, not 2026 inventory. The URL had no live ledger owner; its earlier proposal-only citations did not establish a ledger owner or a Pacific-cod whole-round decision. Integration added it once under source ID `WP04-SECTIONP-PACIFIC-COD-FRESH-WHOLE-R742-20261018-S04`. |

At review time, the live ledger snapshot contained **2,234 records, 10,483 source entries, 8,850 distinct source IDs, and 7,497 distinct URLs**. The proposed R742 prefix and form ID were unallocated. The new Metro and Canfisco HTML URLs had no live ledger or earlier archive owner. The Canfisco PDF URL had prior proposal-only references but no live ledger source. Existing Pacific-cod identity sources were owned by the `ingredient-form-pacific-cod-loin` ledger record and are reused in the new form record.

## Exact proposed delta

Integration added this single form to the existing Pacific-cod reference and created the form-level ledger record `ingredient-form-pacific-cod-fresh-whole`. It reuses the existing CFIA and paired DFO source IDs above and records the R742 product sources once. Measurement and substitution work remain unclaimed for this form; no recipe-line, density, unit mapping, conversion, package yield, edible yield, or cooking yield is supported.

```json
{
  "id": "ingredient-form-pacific-cod-fresh-whole",
  "ingredientRefId": "ingredient-ref-pacific-cod",
  "formCode": "fresh_whole",
  "labelFr": "morue du Pacifique fraîche entière",
  "labelEn": "fresh whole Pacific cod",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Présentation de morue du Pacifique fraîche vendue entière. Les sources établissent cette catégorie, mais ne précisent pas si le poisson est éviscéré ou vendu avec la tête. Aucune mesure, conversion, relation de rendement ou substitution n’est établie.",
  "notesEn": "Fresh Pacific cod sold as a whole-fish presentation. The sources support this presentation category but do not state whether the fish is gutted or sold with its head. No measure, conversion, yield relationship, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Metro's typical fish-size description (about 2.5–3.6 kg) is biological context, not a product pack size, serving, or cooking yield. The older Canfisco catalogue lists commercial forms but no consumer measure. Do not turn either into a reusable amount. No source establishes a directed form conversion or contextual ingredient substitution; do not infer one from DFO's market-equivalence statement or from the related Atlantic-cod form.

## Picker projection

The projection mirrors accent-folded phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It adds only the two full labels; all match-term arrays remain empty.

| Query | Current result count | With proposed form | Effect |
|---|---:|---:|---|
| `fresh whole Pacific cod`; `morue du Pacifique fraîche entière` | 0 each | 1 each | Both full labels resolve to the existing Pacific-cod parent. |
| `Pacific cod`; `morue du Pacifique` | 1 each | 1 each | Existing species identity remains the result. |
| `cod`; `morue` | 7; 7 | 7; 7 | Broad cod searches are unchanged. |
| `whole fish`; `poisson entier` | 1 each | 1 each | Generic whole-fish results are unchanged. |
| `fillet`; `filet` | 7; 2 | 7; 2 | Existing fish-cut results are unchanged. |
| `whole`; `entière`; `fresh whole` | 45; 11; 4 | 46; 12; 5 | These broad state queries gain the Pacific-cod parent and remain multi-result. |
| `fresh`; `fraîche`; `frais` | 35; 7; 28 | 36; 8; 28 | English and feminine French freshness queries gain the form; masculine `frais` is unchanged. |
| `whole cod`; `morue entière` | 0 each | 0 each | No unqualified cod/whole alias is introduced. |

The qualified form survives the picker projection. It makes the new whole-fish presentation discoverable without changing the existing species owner or broad cod, French morue, generic whole-fish, and fillet result sets.

## Recipe and numeric evidence

Scanned the current manifest's **114 recipe files**, all **1,123 structured ingredient rows**, and the full recipe JSON text. The manifest SHA-256 is `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; the concatenated manifest-order recipe-content SHA-256 is `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`. No recipe contains `Pacific cod`, `morue du Pacifique`, *Gadus macrocephalus*, either proposed form label, or any cod/morue ingredient row. There is no bundle demand, serving amount, method, or recipe substitution to attach.

The existing Pacific-cod parent has a verified identity and null density/unit mappings. Its existing loin form has no supported reusable measurement or substitute. No active package yield, unit conversion, global substitution rule, contextual substitution rule, or recipe line targets Pacific cod. R742 adds none. The evidence review is limited to identity and market form; it does not make a food-safety or raw-consumption equivalence claim.

## Static review and scope

- Re-read the current Section P finfish checklist, R737–R739 checkpoint, R739's Atlantic-cod boundary, active references/forms, relevant ledger rows, legacy candidates, and prior proposal/batch archive.
- Verified the proposed form ID/source-ID prefix and checked current ledger ownership for each exact URL; the live Pacific-cod form list contains only the cod loin.
- Reproduced picker result counts from the active bilingual catalog terms and the live phrase-first search rules.
- Scanned all manifest-listed recipes and inspected relevant package-yield/substitution files; integration added only the qualified form and its form-level ledger record.
- Checked this proposal's relative links, UTF-8 without BOM, final newline, and scoped whitespace. No software tests, build, emulator, or deployment were run: the catalog addition is database JSON and is exempt from testing under [AGENTS.md](../../../AGENTS.md).

## Bounded recommendation

The integrated `fresh_whole` form under `ingredient-ref-pacific-cod` uses the bilingual labels and notes shown above. Current Metro guidance supports a whole, fresh/frozen Pacific-cod fish-counter presentation in species context; Canfisco's 2023 product table explicitly lists whole-round Pacific cod, while its current page confirms the supplier still lists the species and other forms. The source-age and SKU/stock limits remain explicit. No broad aliases, cleaning assumptions, quantities, yields, substitutions, or recipe links were added. The broader Section P finfish checklist remains open.
