# WP04 Section P — frozen sablefish fillet product-form review (R706)

- **Review date:** 2026-10-18.
- **Packet type:** proposal-only product-form and picker-boundary review.
- **Disposition:** hold the prospective frozen sablefish fillet form outside active forms and the shared research ledger. Current Montréal product pages support the bilingual product form, and CFIA/OQLF name evidence ties it to the existing sablefish identity. Under the live phrase-first picker, however, the natural product labels make the broad queries `cod fillet` and `filet de morue` return sablefish alone. The manifest-listed recipe bundle has no demand for this fish or form.
- **Shared-data effect:** none. Do not add a form, ledger entry, recipe link, measure, conversion, yield, or substitution in this review. The existing `ingredient-ref-sablefish` row remains unchanged.

## Open checklist item and bounded scope

This review selects one unallocated product form beneath the still-open Section P finfish item: “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish” in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6766). The broader fish-product work also remains open. This packet covers only a Québec-listed **frozen fillet of sablefish**; it does not reconsider the species identity or other sablefish products.

The live catalog has `ingredient-ref-sablefish` (`sablefish / morue charbonnière`) with the search aliases `black cod` and `morue noire`, and no attached form. The existing [sablefish identity review](wp04-section-p-sablefish-identity-boundary-review-20261011.md) accepted the species identity but explicitly proposed no product-state behavior. Its general product examples did not decide or add this specific frozen-fillets form. Exact searches across the current references, forms, legacy identities, ledger, and proposal/batch archive found no owner for `ingredient-form-sablefish-frozen-fillet` or a prior frozen-sablefish-fillet form decision.

This form is separate from the fresh, farmed black-cod fillet La Mer lists under another product route. It is also separate from Atlantic cod fillets, salt cod, canned cod liver, smoked cod, and sablefish's `morue noire` search alias. `Black cod` is a source-backed name for *Anoplopoma fimbria* here; it does not make sablefish a *Gadus* cod.

## Québec naming and product evidence

The [OQLF entry for *morue charbonnière*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198952/morue-charbonniere) gives the preferred Québec edible-fish term, English `sablefish` and `black cod`, and *Anoplopoma fimbria*. It says `morue noire` was not retained by the Fish Products Terminology Committee, so that name stays only as the existing search alias.

CFIA's [Fish List search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sablefish) lists *A. fimbria* as `Sablefish` and `Black Cod / Morue Charbonnière`. The [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) describes the list as a Canadian fish-label naming resource. DFO's [sablefish profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sablefish-morue-charbonniere-eng.html) identifies the species and places it in the North Pacific, including British Columbia.

La Mer, a Montréal fish market, lists the same frozen product in both locales:

| Route | Product wording and state | Page details |
|---|---|---|
| [English](https://www.lamer.ca/en/products/filet-morue-charbonniere-congele) | `Frozen Black Cod fillet`; description says a whole fillet of frozen Black Cod. | Origin: British Columbia. The page offers 170 g and 400 g formats. These are product variants, not reusable portion or conversion data. |
| [French](https://www.lamer.ca/products/filet-morue-charbonniere-congele) | `Filet de Morue charbonnière congelée`. | Same product route and description, with the same format choices and British Columbia origin. |

The product name and origin, combined with the CFIA/OQLF species pair, support a narrow match to the existing *A. fimbria* identity. The retail page does not publish a binomial; the species assignment comes from the official name boundary rather than an inference from fillet shape or texture. The seller's separate fresh, farmed fillet is outside this frozen form. A separate Montréal listing for “Black Cod Fillets” claims Atlantic capture without a binomial; because DFO places *A. fimbria* in the Pacific, that listing is not used to identify a product or assign its provenance.

## Picker projection and hold reason

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes bilingual terms and returns full word-phrase matches before substring fallback. It uses the live reference/form terms and, hypothetically, only the two product labels above; no shared data was changed.

| Query | Current picker results | With a form labelled `frozen black cod fillet / filet de morue charbonnière congelée` | Assessment |
|---|---|---|---|
| `sablefish`; `black cod`; `morue charbonnière` | Sablefish | Same Sablefish row | Existing identity searches remain unchanged. |
| `fillet`; `filet` | Seven rows each | Eight rows each, including Sablefish | Broad cut searches stay multi-result because no bare `fillet` or `filet` term is added. |
| `cod fillet` | No result | Sablefish only | The English product label makes an unqualified cod-cut query appear species-resolved to sablefish. Atlantic cod is a separate active identity. |
| `filet de morue` | No result | Sablefish only | The French product label makes a broader cod-cut query appear species-resolved to sablefish. |
| `frozen black cod fillet`; `filet de morue charbonnière congelée` | No result | Sablefish only | Full product phrases are useful, but they also expose the shorter ambiguous queries above. |
| `cod`; `morue` | Eight and seven rows respectively | Same result counts | The general queries remain broad; the cut-specific query behavior is the concern. |

The name evidence and product are strong, but the live picker has no way to expose the complete product phrase without also matching its shorter `cod fillet` and `filet de morue` subphrases. A future integration should wait until a picker behavior or matching catalog context can keep those broad queries visibly multi-choice. Do not work around the issue by adding a bare `fillet`, `filet`, `cod`, or `morue` alias.

## Recipe demand and quantities

I scanned all **114 manifest-listed recipe files** and **1,123 ingredient rows** for `sablefish`, `black cod`, `morue charbonnière`, `morue noire`, *Anoplopoma fimbria*, and the product phrases `frozen black cod fillet`, `filet de morue charbonnière congelée`, `cod fillet`, and `filet de morue`. There were **zero recipe-file hits and zero ingredient-row hits**. The bundle supports no recipe link, form selection, portion, or substitution for this candidate.

Do not promote the seller's 170 g or 400 g package variants to kitchen measures, a default portion, or a fillet count-to-mass rule. Do not infer density, edible yield, frozen-to-thawed conversion, or culinary interchangeability with Atlantic cod. Keep the existing ledger measurement and substitution statuses unchanged.

## Conditional integration shape

If later picker work preserves the cod-cut boundary, represent this as a form under the existing identity, not a new ingredient reference:

```json
{
  "id": "ingredient-form-sablefish-frozen-fillet",
  "ingredientRefId": "ingredient-ref-sablefish",
  "formCode": "frozen",
  "labelFr": "filet de morue charbonnière congelée",
  "labelEn": "frozen black cod fillet",
  "prepState": "frozen",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null
}
```

For such a future integration, keep notes to the single frozen-fillets presentation; add no package amount, measure, density, mapping, conversion, yield, recipe link, or substitution. Reuse the existing identity evidence IDs `WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S01` (CFIA), `S02` (OQLF), `S03`/`S04` (DFO English/French) rather than re-registering those sources. If the decision is revisited, the two La Mer locale routes below need new source entries scoped to this form. The proposed R706 IDs remain proposal-local and are not allocated in the shared ledger.

## Source register

| Proposal-local ID | Source | What it supports |
|---|---|---|
| `WP04-SECTIONP-SABLEFISH-FROZEN-FILLET-R706-20261018-S01` | La Mer, [Frozen Black Cod fillet](https://www.lamer.ca/en/products/filet-morue-charbonniere-congele), accessed 2026-10-18. | Product name, frozen whole-fillet presentation, British Columbia origin, and 170 g/400 g SKU formats. Product-level evidence only; package formats are not reusable measures. |
| `WP04-SECTIONP-SABLEFISH-FROZEN-FILLET-R706-20261018-S02` | La Mer, [Filet de Morue charbonnière congelée](https://www.lamer.ca/products/filet-morue-charbonniere-congele), accessed 2026-10-18. | Paired Québec French product name, frozen state, and same product details. Product-level evidence only. |
| Reused `WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S01` | CFIA, [Fish List sablefish search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sablefish). | Existing ledger evidence tying `Sablefish` and `Black Cod / Morue Charbonnière` to *Anoplopoma fimbria*. |
| Reused `WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S02` | OQLF, [*morue charbonnière*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198952/morue-charbonniere). | Preferred Québec edible-fish term, accepted English names, taxon, and status of `morue noire`. |
| Reused `WP04-SABLEFISH-IDENTITY-BOUNDARY-20261011-S03` / `S04` | DFO, [Sablefish profile (English)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sablefish-morue-charbonniere-eng.html) / [Morue charbonnière profile (French)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sablefish-morue-charbonniere-fra.html). | Species identification and Pacific range; not a recipe or product-measure source. |
| Proposal-only excluded source | MTL Meats, [Black Cod Fillets](https://mtlmeats.ca/products/black-cod-fillets), accessed 2026-10-18. | Its “wild-caught in the Atlantic” claim does not identify the taxon and conflicts with the DFO Pacific range for *A. fimbria*. It is excluded from this candidate's product identity and provenance evidence. |
| Repository audit | Current seed references/forms, legacy identities, research ledger, plan, prior Section P proposals/batches, current search implementation, manifest, and manifest-listed recipes. | Exact ownership check, form-absence check, picker projection, and full recipe-corpus scan. This is repository evidence, not a shared-ledger source. |

This is a documentation-only hold. No software tests, build, emulator, or deployment checks were run.
