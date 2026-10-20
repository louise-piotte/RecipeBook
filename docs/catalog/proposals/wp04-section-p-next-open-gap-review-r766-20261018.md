# WP04 Section P R766 — whole lake-whitefish form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Status:** Proposal only. This review changes no shared catalog, ledger, plan, roadmap, recipe, workflow, generated-index, or application file.
- **Checklist fit:** The Section P finfish parent remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6896). The [roadmap’s R763 checkpoint](../../../roadmap.md#L1504) records whole brook trout under a different species; the [R761–R763 integration README](../batches/wp02-wp03-wp04-r761-r763-gap-review-integration-20261018/README.md) carries the same boundary.
- **Candidate:** One state-neutral `whole_fish` form under the existing `ingredient-ref-lake-whitefish` identity for *Coregonus clupeaformis*.
- **Recommendation:** Add **whole lake whitefish / grand corégone entier**, with no form match terms. Current Canadian supplier pages identify this species and offer it whole. Keep fresh/frozen state and the supplier-specific “dressed” wording outside the reusable form. Add no measure, recipe link, conversion, yield, or substitution.

## Current identity and distinct open form

The active reference is `ingredient-ref-lake-whitefish`, displayed as `lake whitefish / grand corégone`, with no aliases, attached forms, default density, or unit mappings. The dedicated [lake-whitefish identity review](wp04-section-p-lake-whitefish-identity-review-20261012.md) established the species-qualified identity and retained a Health Canada 75 g baked-food table entry only as a source-specific observation; it did not allocate a raw product form. The active form list still has no form under this reference.

The later [R191 smoked-lake-whitefish review](wp04-section-p-smoked-lake-whitefish-product-identity-review-r191-20261016.md) covers a finished smoked product. Its boundary explicitly keeps that identity separate from raw lake whitefish and says not to add a smoked form to the raw reference; it does not decide the whole raw-fish presentation. R757’s fresh-whole form belongs to rainbow trout (*Oncorhynchus mykiss*), R760’s whole-fish form belongs to lake trout (*Salvelinus namaycush*), and R763’s whole-fish form belongs to brook trout (*Salvelinus fontinalis*). None allocates a form to *C. clupeaformis*.

## Product scope and bilingual labels

Seacore’s current [Whitefish product page](https://www.seacoreseafood.com/product/Whitefish) identifies *Coregonus clupeaformis*, gives Lake Whitefish as another name, and lists whole and fillet presentations in both fresh and frozen states. Allseas’ current [Lake Whitefish product page](https://www.allseas.net/product/freshwater-fish/whitefish-whole) identifies the same taxon and lists a whole dressed product. Together they support a whole-fish presentation; they do not establish one specific retail SKU or continuing inventory. Seacore’s state choices and Allseas’ seasonal fresh availability do not make freshness or frozen state part of the reusable form. “Dressed” is Allseas’ product wording only and is not generalized to this form.

Reuse the existing OQLF source for `grand corégone`, already attached to the raw lake-whitefish reference. The term is Québec’s standardized commercial name for *C. clupeaformis*; OQLF does not retain `poisson blanc` as a species-specific fish-market name. Compose the French form label from that identity and `entier`. Keep broad `whitefish`, `white fish`, `poisson blanc`, `corégone de lac`, and generic whole-fish wording out of new aliases and match terms.

## Proposal-only form delta

If accepted, add this single state-neutral form under the existing reference:

```json
{
  "id": "ingredient-form-lake-whitefish-whole-fish",
  "ingredientRefId": "ingredient-ref-lake-whitefish",
  "formCode": "whole_fish",
  "labelFr": "grand corégone entier",
  "labelEn": "whole lake whitefish",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Seacore indique que le Coregonus clupeaformis est offert entier ou en filets, frais ou congelé. Allseas répertorie un produit spécifique de grand corégone entier habillé; cet état de préparation demeure propre à ce produit. La forme décrit uniquement la présentation entière et ne précise pas l’état frais ou congelé, la tête, l’éviscération, l’écaillage, la peau ou les arêtes. Les tailles et le format de caisse du fournisseur ne sont pas des mesures de cuisine. Aucune densité, mesure, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Seacore lists Coregonus clupeaformis whole or as fillets, fresh or frozen. Allseas lists a supplier-specific whole dressed whitefish product; that preparation wording remains specific to its product. This form describes only the whole presentation and specifies no fresh or frozen state, head, gutting, scaling, skin, or bones. Supplier size and case details are not kitchen measures. No density, measure, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

If integrated, the form-owned ledger row should use `recordId: ingredient-form-lake-whitefish-whole-fish`, `recordType: ingredient_form`, and `identityState: verified`. Use `measurementState: researched_no_supported_value`: the identity review’s 75 g entry is for baked reference food, while Allseas’ 1–1.5 kg typical whole size and 10 lb case are supplier-specific trade details, not a recipe measure or portion. Use `substitutionResearchState: not_yet_researched` for this form; the existing identity-level no-supported-substitute review does not establish a whole-form rule. Add no measurement observation, density, unit mapping, conversion, package yield, recipe link, or substitution rule.

## Picker projection

The static projection follows the current [phrase-first, substring-fallback search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including accent folding and form hints only for a complete form phrase. It adds only the proposed bilingual labels.

| Query | Current results | With form | Effect |
|---|---:|---:|---|
| `whole lake whitefish` | 0 | 1 | Exact English form label selects lake whitefish and supplies its form hint. |
| `grand corégone entier` | 0 | 1 | Exact French form label selects the same reference and supplies its form hint. |
| `lake whitefish`; `grand corégone` | 2; 2 | 2; 2 | Raw and smoked lake-whitefish identities remain separate; existing searches are unchanged. |
| `whitefish` | 2 | 2 | The current raw and smoked results remain unchanged; no broad alias is added. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches remain unchanged. |
| `whole`; `entier` | 52; 25 | 53; 26 | Each broad presentation query adds lake whitefish and remains multi-result. |
| `fresh whole` | 8 | 8 | The proposal assigns no freshness state. |
| `fish`; `poisson` | 18; 14 | 18; 14 | General fish searches are unchanged. |

## Recipe demand and numeric limits

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**, checking full decoded recipe JSON text. It found **zero matching recipe files and zero ingredient rows** for `lake whitefish`, `grand corégone`, *Coregonus clupeaformis*, `whole lake whitefish`, `grand corégone entier`, or `smoked lake whitefish`. The bundled corpus supplies no lake-whitefish recipe, use context, amount, form link, or substitution.

The existing 75 g value describes baked food only. Allseas’ whole-fish size range and case size are trade facts, not a household quantity, edible yield, or preparation conversion. Record none of these as a reusable measure or yield. Do not transfer any amount or preparation state from smoked lake whitefish or another fish.

## Ownership and source register

The live package contains **1,850 references** and **186 forms**; the research ledger contains **2,245 records**. `ingredient-ref-lake-whitefish` is active and has no attached form. Exact-ID checks found no owner for `ingredient-form-lake-whitefish-whole-fish` in active references, forms, legacy candidates, or ledger records. The two R766 source IDs and the Seacore and Allseas URLs below have no exact owner in the ledger or proposal/batch archive. Reuse `WP04-LAKE-WHITEFISH-20261012-S04` for OQLF terminology; do not register a duplicate OQLF source. The Freshwater Fish Marketing Corporation’s French `/especes/` and English `/products/` URLs are already owned by R760 with `Touladi` and `Lake Trout` locators and lake-trout-specific support. This proposal does not reuse those records for another species.

New source IDs are local to this proposal until integration. The linked product pages were accessed on 2026-10-18.

| Source ID / existing owner | Source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-LAKE-WHITEFISH-WHOLE-FORM-R766-20261018-S01` | Seacore Seafood Products, [Whitefish](https://www.seacoreseafood.com/product/Whitefish), species and product characteristics. | Identifies *Coregonus clupeaformis* as Lake Whitefish and lists whole or fillet forms in fresh and frozen states. It is a supplier product page, not a dated inventory or Québec-specific retail listing; it does not describe cleaning, head, skin, or bones. |
| `WP04-SECTIONP-LAKE-WHITEFISH-WHOLE-FORM-R766-20261018-S02` | Allseas Fisheries, [Lake Whitefish — whole](https://www.allseas.net/product/freshwater-fish/whitefish-whole), product name, taxon, availability, sizes, and pack-size lines. | Identifies *C. clupeaformis* and lists a whole dressed product, with supplier-specific seasonal availability, 1–1.5 kg typical whole size, and 10 lb case. These details do not establish general freshness, dressing, portion size, recipe measure, or yield. |
| **Reused `WP04-LAKE-WHITEFISH-20261012-S04`** | OQLF, [grand corégone (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199106/grand-coregone), already owned by `ingredient-ref-lake-whitefish`. | Pairs the Québec-standardized `grand corégone` with lake whitefish and *C. clupeaformis*. It supports the species name, not the whole-fish presentation. Reuse without another ledger source entry. |

## Bounded recommendation

Add only `whole lake whitefish / grand corégone entier` under verified *Coregonus clupeaformis*, with `formCode: whole_fish`, `prepState: whole`, null density, and empty match-term arrays. Keep fresh/frozen state and supplier-specific dressing, size, and case details out of the form. Add no reusable measure, conversion, yield, recipe link, or substitution. Section P remains open. This proposal-only review requires no software tests, build, emulator run, or deployment.
