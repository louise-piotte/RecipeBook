# WP04 Section P R757 — fresh whole rainbow-trout form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Status:** Proposal only; no shared catalog, ledger, roadmap, plan, workflow, recipe, or application files changed.
- **Checklist fit:** The Section P finfish parent remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6888). The latest [R752–R754 checkpoint](../../../roadmap.md#L1497) added a fresh-whole Atlantic-halibut form. This review targets the separate, existing rainbow-trout identity and does not repeat the recent cod, haddock, wolffish, halibut, pike, Walleye, or crab work.
- **Candidate:** One `fresh_whole` form under `ingredient-ref-rainbow-trout` for *Oncorhynchus mykiss*.
- **Recommendation:** **Add** `fresh whole rainbow trout / truite arc-en-ciel entière fraîche` with no extra match terms. Metro's bilingual listing for one product identifies the whole-fish presentation, English and French product names, and *O. mykiss*. Keep its out-of-stock indicator, 450 g average, Great Lakes provenance, and aquaculture method specific to that SKU. The source does not state head, gutting, or scaling status. Do not add a measure, recipe link, yield, conversion, or substitution.

## Exact scope and prior work

The active reference is `ingredient-ref-rainbow-trout`, displayed as `rainbow trout / truite arc-en-ciel`, with no aliases and no attached forms. R548 held a distinct **fillet-cut** form because the natural proposed labels would make `trout fillet / filet de truite` return rainbow trout alone. This proposal does not reopen that cut decision: a whole-fish form is supported by a separate exact SKU, and the current picker projection below shows that the generic `whole fish / poisson entier` results do not change.

The form ID `ingredient-form-rainbow-trout-fresh-whole`, the proposed R757 source-ID prefix, and the two Metro product-page URLs were not found in the active forms, ledger, or proposal/batch archive. The two language pages are the same Metro product number **208107**, not independent products. Existing identity source `WP04-FINFISH-FOLLOWUP-20261009-S01` (OQLF) is already owned by the rainbow-trout reference and should be reused if integrated; do not duplicate its ledger source entry.

Current snapshot: **1,848 ingredient references / 181 forms / 56 legacy candidates; 2,238 ledger records / 10,511 source entries / 8,870 distinct source IDs / 7,517 distinct URLs.** The identity ledger row is verified; its measurement and substitution states remain `not_yet_researched`.

## Product and Québec naming evidence

Metro's English product page is titled **Fresh Whole Rainbow Trout**, product number 208107. Its indexed product details identify *Oncorhynchus mykiss*, Great Lakes/Canada provenance, farm-raised open-environment aquaculture, a 450 g average, and an out-of-stock status at the selected location. The paired French product page uses **Truite arc-en-ciel entière fraîche** for that same product number and identifies the same binomial. These pages directly support the product identity and state pairing, but they do not establish general or continuing store stock. Direct page opens returned HTTP 403 during this review; the current English and French product entries and details were available through Metro's indexed product results and current category listing.

OQLF's [truite arc-en-ciel entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel) prefers `truite arc-en-ciel`, pairs it with English `rainbow trout` and *Oncorhynchus mykiss*, and distinguishes the freshwater fish from the narrower marine/anadromous use of `saumon arc-en-ciel`. It supports the established identity and Québec-facing name, not Metro's product state. Reuse its existing source ID rather than adding a ledger source record.

The recommended French label uses Metro's bilingual title exactly. The form does not claim that the product is cleaned, gutted, scaled, head-on, or head-off. Do not transfer the SKU's average weight, provenance, farm method, or stock state to the reusable form.

## Proposal-only data delta

If integrated, add only the following form under the existing rainbow-trout reference and create one form-owned ledger record using the two proposal-local Metro source IDs below plus the existing OQLF identity source. Leave match terms empty.

```json
{
  "id": "ingredient-form-rainbow-trout-fresh-whole",
  "ingredientRefId": "ingredient-ref-rainbow-trout",
  "formCode": "fresh_whole",
  "labelFr": "truite arc-en-ciel entière fraîche",
  "labelEn": "fresh whole rainbow trout",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Présentation de truite arc-en-ciel entière fraîche listée par Metro sous le no de produit 208107 et identifiée comme Oncorhynchus mykiss. La page du produit indiquait que l’article était en rupture de stock lors de la vérification; elle n’établit pas un approvisionnement continu ni un état général de tête, d’éviscération ou d’écaillage. Aucune mesure, densité, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Fresh whole rainbow-trout presentation listed by Metro under product no. 208107 and identified as Oncorhynchus mykiss. The product page showed the item out of stock at review time; it does not establish continuing stock or a general head, gutting, or scaling state. No measure, density, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

## Picker projection

The projection follows the current [phrase-first, substring-fallback matcher](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It adds only the bilingual form labels and no match terms.

| Query | Current results | With the proposed form | Effect |
|---|---:|---:|---|
| `fresh whole rainbow trout` | 0 | 1 | Selects the existing rainbow-trout reference and supplies the form hint for the complete label. |
| `truite arc-en-ciel entière fraîche` | 0 | 1 | Selects the same reference and supplies the form hint for the complete French label. |
| `rainbow trout`; `truite arc-en-ciel` | 1; 1 | 1; 1 | Existing species identity results remain unchanged. |
| `trout`; `truite` | 7; 6 | 7; 6 | Broad trout searches are unchanged. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches remain unchanged. |
| `whole`; `entière`; `fresh whole` | 49; 12; 7 | 50; 13; 8 | Each gains rainbow trout and remains multi-result. |

The proposal does not add `whole trout`, `truite entière`, `trout fillet`, or `filet de truite` as aliases or match terms. The R548 fillet hold stays intact.

## Recipe corpus and numeric scope

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**, including the full decoded JSON and ingredient-row text. The strings `rainbow trout`, `truite arc-en-ciel`, *Oncorhynchus mykiss*, `fresh whole rainbow trout`, `truite arc-en-ciel entière fraîche`, `trout`, and `truite` yielded **zero matching files and zero matching ingredient rows**. No bundled recipe selects this form or supplies an amount, preparation, or use context.

The Metro page's 450 g average is a SKU-level observation, not a typical fish weight, kitchen measure, serving, count mapping, density, or yield. Add no measurement observation, unit mapping, conversion, edible/cooking yield, recipe link, or substitution.

## Sources and source ownership

Online sources were checked 2026-10-18. New IDs are proposal-local; they are not additions to the shared ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-RAINBOW-TROUT-FRESH-WHOLE-R757-20261018-S01` | Metro, [Fresh Whole Rainbow Trout, product 208107](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/whole-fish/fresh-whole-rainbow-trout/p/208107). | English item page title and product details identify whole rainbow trout and *O. mykiss*. Indexed listing says 450 g average and out of stock at the selected location; these are product-specific details and are not encoded as general catalog data. Direct open returned 403. |
| `WP04-SECTIONP-RAINBOW-TROUT-FRESH-WHOLE-R757-20261018-S02` | Metro, [Truite arc-en-ciel entière fraîche, product 208107](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-entiers/truite-arc-en-ciel-entiere-fraiche/p/208107). | French route for the same SKU and product identity, with the same *O. mykiss* identification and selected-location out-of-stock notice. It is not an independent second product. Direct open returned 403. |
| **Reused `WP04-FINFISH-FOLLOWUP-20261009-S01`** | OQLF, [truite arc-en-ciel (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel). | Existing ledger source owned by `ingredient-ref-rainbow-trout`; supports the Québec-preferred name, English `rainbow trout`, and *O. mykiss*. Reuse without duplicating the ledger source. |

## Bounded recommendation

Add only the qualified fresh-whole rainbow-trout presentation form, with empty match-term arrays and one form-owned research record. Keep the selected-store out-of-stock message and all package, origin, and aquaculture details scoped to Metro product 208107. Preserve the R548 fillet hold and all broad trout identities. No shared catalog, ledger, plan, roadmap, or recipe change is proposed in this file.
