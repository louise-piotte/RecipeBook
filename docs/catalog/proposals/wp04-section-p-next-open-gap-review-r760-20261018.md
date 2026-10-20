# WP04 Section P R760 — whole lake-trout form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Status:** Proposal only. No shared catalog, ledger, roadmap, plan, workflow, recipe, or application files changed.
- **Checklist fit:** The Section P finfish parent remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6888). The latest [R755–R757 checkpoint](../../../roadmap.md#L1499) added a fresh-whole rainbow-trout form. R760 covers a distinct whole-fish presentation under the existing lake-trout identity; it does not repeat the recent cod, haddock, wolffish, halibut, pike, Walleye, rainbow-trout, octopus, or crab decisions.
- **Candidate:** One `whole_fish` form under `ingredient-ref-lake-trout` for *Salvelinus namaycush*.
- **Recommendation:** Add **whole lake trout / touladi entier** with no match terms. The Freshwater Fish Marketing Corporation lists *Salvelinus namaycush* as touladi and offers it whole and as fillets, fresh July–September and frozen throughout the year. Because the offer covers more than one temperature state, describe only the whole-fish presentation. Do not claim a particular SKU, current fresh inventory, Québec retail availability, cleaning state, measure, yield, recipe link, or substitution.

## Current catalog and exact gap

The active reference is `ingredient-ref-lake-trout`, displayed as `lake trout / touladi`, with English alias `lake charr`, no French aliases, no default density, no unit mappings, and no attached forms. Its identity ledger record is verified; measurement and substitution research remain `not_yet_researched`.

The dedicated lake-trout identity review already established the species-qualified English and Québec French names. A whole-fish form is a separate presentation decision. The existing form list has no form under `ingredient-ref-lake-trout`; the form ID `ingredient-form-lake-trout-whole-fish`, proposed R760 source IDs, and the French and English product-page URLs below have no exact owner in the active catalog, ledger, proposal archive, or batch archive. Reuse parent source `WP04-NEXT-FISH-GAP-20261012-S01` (OQLF) for the existing bilingual identity rather than creating another OQLF entry.

## Product boundary and bilingual naming

The Freshwater Fish Marketing Corporation’s French [Touladi product profile](https://officedecommercialisationdupoissondeaudouce.com/especes/) names *Salvelinus namaycush* and says the corporation offers touladi whole and in fillets, fresh from July through September and frozen year-round. The paired English [Products page](https://freshwaterfish.com/products/) lists **Lake Trout** in the same current product range. These are corporate product profiles, not dated retail inventory or a Québec-specific sales listing. The pages do not say whether a whole fish is gutted, scaled, head-on, skin-on, or bone-in. The source’s fresh season and year-round frozen offer are not converted into standard forms here; the reusable form names only the whole presentation.

OQLF’s existing [touladi entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198855/touladi) pairs Québec-normalized `touladi` with English `lake trout` and *S. namaycush*. The entry notes that touladi is generally reserved for recreational fishing in Québec, with an incidental-capture commercial exception. This supports the bilingual identity, not routine Québec retail availability. The Gouvernement du Québec’s [current touladi profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/touladi), updated 2026-10-15, independently lists `Touladi / Lake trout / Salvelinus namaycush`.

The proposed labels compose the established bilingual species names with the supplier-supported whole presentation. French `entier` agrees with masculine `touladi`. They are catalog labels, not claimed verbatim titles from a packaged SKU. Keep `whole trout`, `whole fish`, `poisson entier`, generic `trout` / `truite`, and `lake charr` out of new form match terms; the existing species alias remains on the parent identity.

## Proposal-only data delta

If integrated, add one state-neutral whole-fish form under the existing reference and one form-owned ledger record. Reuse the existing OQLF identity source; do not add aliases or match terms.

```json
{
  "id": "ingredient-form-lake-trout-whole-fish",
  "ingredientRefId": "ingredient-ref-lake-trout",
  "formCode": "whole_fish",
  "labelFr": "touladi entier",
  "labelEn": "whole lake trout",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Présentation entière de touladi offerte par l’Office de commercialisation du poisson d’eau douce. Le profil indique une offre fraîche de juillet à septembre et congelée toute l’année; la forme ne distingue pas ces états. Il ne précise pas si le poisson entier est vidé, écaillé, avec ou sans tête, avec peau ou avec arêtes. Aucune mesure, densité, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Whole-lake-trout presentation offered by the Freshwater Fish Marketing Corporation. Its profile states a fresh offer from July through September and frozen product year-round; the form does not distinguish these states. The page does not say whether whole fish are gutted, scaled, head-on, skin-on, or bone-in. No measure, density, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The proposed form ledger record should use `recordId: ingredient-form-lake-trout-whole-fish`, `recordType: ingredient_form`, `identityState: verified`, and leave `measurementState` and `substitutionResearchState` as `not_yet_researched`. The supplier page states no package amount, household measure, portion, edible yield, or cooking yield. Do not add a density, unit mapping, conversion, recipe-line link, package yield, or active substitution. Do not infer equivalence with brook trout, brown trout, rainbow trout, Arctic char, Walleye, or another fish.

## Picker projection

The projection follows the current [phrase-first, substring-fallback matcher](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including accent folding and form hints only when a query exactly matches a full form label. Counts compare the current package with the proposed bilingual labels and no match terms.

| Query | Current results | With form | Effect |
|---|---:|---:|---|
| `whole lake trout` | 0 | 1 | Full English form label selects lake trout and supplies the form hint. |
| `touladi entier` | 0 | 1 | Full French form label selects the same reference and supplies the form hint. |
| `lake trout`; `touladi` | 1; 1 | 1; 1 | Existing identity searches are unchanged. |
| `lake charr`; `trout`; `truite` | 1; 7; 6 | 1; 7; 6 | Existing alias and broader trout searches are unchanged. |
| `whole trout` | 0 | 0 | Word order is not added as a match term. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches retain their current scope. |
| `whole`; `entier` | 50; 23 | 51; 24 | Each broad whole-presentation query gains lake trout and remains multi-result. |
| `fresh whole`; `frais entier` | 8; 5 | 8; 5 | The proposed form does not assign a fresh state. |
| `fish`; `poisson` | 18; 14 | 18; 14 | General fish searches are unchanged. |

The complete English and French product phrases become selectable without changing broad lake-trout, trout, or whole-fish searches.

## Recipe corpus and numeric scope

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**, checking the full decoded JSON text. `lake trout`, `touladi`, `lake charr`, *Salvelinus namaycush*, `whole lake trout`, and `touladi entier` produce **zero matching files and zero matching ingredient rows**. The corpus supplies no recipe amount, use context, or form link for this candidate.

The existing identity has null density and empty unit mappings. No lake-trout entry appears in package yields, and the identity ledger states that measurement and substitution research have not yet been completed. The product profile’s July–September and year-round descriptions are availability periods, not recipe amounts or yields. Add no numeric observation, measurement, conversion, yield, recipe link, or substitution.

## Sources and ownership

Online sources checked 2026-10-18. Proposed source IDs are local to this review until integration.

| Source ID / owner | Source and evidence | Limits |
|---|---|---|
| `WP04-SECTIONP-LAKE-TROUT-WHOLE-FORM-R760-20261018-S01` | Freshwater Fish Marketing Corporation, [Touladi product profile](https://officedecommercialisationdupoissondeaudouce.com/especes/). Locator: Touladi entry, taxon, presentation, and seasonal state statement. | Supports the named species and sale as whole fish or fillets, fresh July–September and frozen year-round. It is a corporate product profile, not a dated inventory or a Québec retail listing; it does not specify the whole fish’s cleaning or head state. |
| `WP04-SECTIONP-LAKE-TROUT-WHOLE-FORM-R760-20261018-S02` | Freshwater Fish Marketing Corporation, [Products](https://freshwaterfish.com/products/). Locator: current product list, Lake Trout heading. | Supports the current English product-category name on the same corporation’s English route. It is the paired language page for S01, not independent seller evidence; whole-presentation detail is taken from the French profile. |
| `WP04-SECTIONP-LAKE-TROUT-WHOLE-FORM-R760-20261018-S03` | Gouvernement du Québec, [Touladi](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/touladi), updated 2026-10-15. Locator: French and English names and scientific name. | Confirms `Touladi / Lake trout / Salvelinus namaycush`; it is a species profile, not product-form, retail-availability, or recipe-measure evidence. |
| **Reused `WP04-NEXT-FISH-GAP-20261012-S01`** | OQLF, [touladi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198855/touladi), already owned by `ingredient-ref-lake-trout`. | Supports the Québec-normalized name, English `lake trout`, taxon, and Québec fish-market term choice. Reuse the existing parent source entry; do not duplicate it. |

The proposed form ID, R760 source IDs, and product-page URLs have no exact active reference, form, ledger, proposal, or batch owner. Keep the existing `ingredient-ref-lake-trout` identity and its source ownership unchanged.

## Bounded recommendation

Add only `whole lake trout / touladi entier` as a `whole_fish` presentation under the verified *Salvelinus namaycush* reference, with empty match-term arrays and a form-owned ledger row. Keep fresh and frozen states outside this form because the supplier offers both; do not infer head, gutting, scaling, skin, or bones. Leave measurements, yields, recipe links, conversions, and substitutions unavailable. Section P remains open. This file is a proposal only; no software tests apply.
