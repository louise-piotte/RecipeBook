# WP04 Section P R778 — whole Yellow perch form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Packet type:** proposal-only form, source-ownership, picker, and recipe-corpus review.
- **Disposition:** add one state-neutral `whole_fish` form, **whole yellow perch / perchaude entière**, under the existing `ingredient-ref-yellow-perch` identity for *Perca flavescens*.
- **Scope:** whole presentation only. Do not change the species identity or add a cleaning state, temperature, measure, recipe link, conversion, yield, or substitution.
- **Status:** this proposal changes no shared catalog or ledger JSON, plan, roadmap, generated file, workflow, recipe, or application code.

## Checklist fit and review boundary

The finfish and regional-fish checklist remains open in [Section P of the catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6950). The integrated R773–R775 checkpoint records a whole-Arctic-char form, which belongs to a different species, *Salvelinus alpinus*; it does not resolve Yellow perch. The recent [R766 whole-lake-whitefish review](wp04-section-p-next-open-gap-review-r766-20261018.md) concerns *Coregonus clupeaformis*, another separate identity. The active Yellow-perch reference, `ingredient-ref-yellow-perch`, is the verified identity **yellow perch / perchaude** for *Perca flavescens*. It currently has no attached form.

This review is distinct from [R691](wp04-section-p-yellow-perch-ontario-fillet-boundary-review-r691-20261018.md), which held Metro's fresh Ontario Yellow-perch fillet form because its wording would make generic `perch fillets` and `perch fillet` queries return Yellow perch alone despite the wider perch family. R691 did not decide the whole-fish presentation. This review adds only species-qualified whole labels, which do not contain either fillet phrase. It preserves R600's separate Eurasian-perch identity and the existing two-result `yellow perch` query.

The current Allseas supplier profile provides distinct evidence for a whole Yellow-perch product and explicitly identifies the species as *Perca flavescens*. It calls the product “Whole dressed Yellow Perch”; its dressing description, seasonal fresh/previously-frozen schedule, size range, and wholesale case size remain specific to that supplier listing. The form below records only “whole.” [S01]

## Recommended delta

Add one form under the existing verified Yellow-perch identity:

```json
{
  "id": "ingredient-form-yellow-perch-whole-fish",
  "ingredientRefId": "ingredient-ref-yellow-perch",
  "formCode": "whole_fish",
  "labelFr": "perchaude entière",
  "labelEn": "whole yellow perch",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Allseas Fisheries indique un produit « Whole dressed Yellow Perch » et identifie l’espèce comme Perca flavescens. La forme décrit uniquement la présentation entière. Le qualificatif « dressed », les périodes frais/congelé, les poids individuels habituels de 227 à 600 g et la caisse de 10 lb demeurent propres à la fiche du fournisseur et ne définissent pas une mesure ou un état de préparation réutilisable. Aucune densité, mesure de cuisine, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Allseas Fisheries lists a “Whole dressed Yellow Perch” product and identifies it as Perca flavescens. This form describes only the whole presentation. The listing’s “dressed” qualifier, fresh/previously-frozen periods, typical 227–600 g whole-fish size, and 10 lb case remain supplier-specific and establish no reusable preparation state or kitchen measure. No density, kitchen measure, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

If integrated, the form-ledger record should use `recordId: ingredient-form-yellow-perch-whole-fish`, `recordType: ingredient_form`, and `identityState: verified`. Set `measurementState: researched_no_supported_value`: the source’s individual size range and wholesale case are product details, not reusable recipe quantities. Leave `substitutionResearchState: not_yet_researched`; this review does not research substitutions. Add no measurement observation, density, unit mapping, conversion, yield, recipe-line link, or substitution rule. Reuse the existing Yellow-perch identity sources rather than duplicating them.

## Source ownership and current catalog state

The live reference catalog has 1,866 references and the form catalog has 190 forms. The exact active `ingredient-ref-yellow-perch` has no attached form, and the legacy-import identity list has no Yellow-perch candidate. The proposed form ID `ingredient-form-yellow-perch-whole-fish` is absent from active references, forms, the research ledger, and the proposal/batch archive. Proposed source ID `WP04-SECTIONP-YELLOW-PERCH-WHOLE-FORM-R778-20261018-S01` and the exact Allseas Yellow-perch product URL have no prior owner in the research ledger or proposal/batch archive. Allseas’ different whole-lake-whitefish product URL is already owned by R766 source `WP04-SECTIONP-LAKE-WHITEFISH-WHOLE-FORM-R766-20261018-S02`; it identifies another product and is not reused here.

The existing parent ledger record already owns OQLF source `WP04-FRESHWATER-FINFISH-20261010-S05` and Gouvernement du Québec source `WP04-FRESHWATER-FINFISH-20261010-S06`. Reuse those identity sources; do not allocate copies. The Allseas page is the only proposed new product source. Its product-profile information is not a live stock feed or a current Québec retail listing.

| Source ID / owner | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-YELLOW-PERCH-WHOLE-FORM-R778-20261018-S01** | Allseas Fisheries, [Yellow Lake Perch](https://www.allseas.net/product/freshwater-fish/yellow-perch-whole), product heading and details, source lines 57–74; accessed 2026-10-18. | Labels the product “Whole dressed Yellow Perch” and names *Perca flavescens* (lines 57–60). It also shows Lake Erie Canada/USA provenance, a fresh/previously-frozen schedule, 227–600 g typical whole sizes, and a 10 lb case (lines 62–74). The page supports the species-qualified whole presentation; it does not establish continuing inventory, Québec retail availability, a transferable cleaned/dressed state, a recipe amount, or a kitchen measure. |
| **Reused `WP04-FRESHWATER-FINFISH-20261010-S05`** | OQLF, [perchaude (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198859/perchaude), already owned by `ingredient-ref-yellow-perch`; source lines 19–64. | Supports normalized Québec French `perchaude`, English `yellow perch`, and *Perca flavescens*; its note excludes `perche` from Québec fish-product marketing (lines 35–47). Reuse for the parent identity; it does not establish the whole presentation. |
| **Reused `WP04-FRESHWATER-FINFISH-20261010-S06`** | Gouvernement du Québec, [Perchaude species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/perchaude), already owned by `ingredient-ref-yellow-perch`; source lines 11–34 and 176. | Confirms `Perchaude / Yellow perch / Perca flavescens` and its freshwater classification; the profile was updated 2026-10-15. Reuse for the parent identity; it does not establish a food-market form. |

The source IDs in this proposal are proposal-local until integration. No shared ledger allocation is made here.

## Current picker projection

The projection follows the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) matcher: normalized complete phrases are preferred, substring matching is used only if no full-phrase results exist, and a form hint is available when the complete form label is queried. The hypothetical form contributes only `whole yellow perch` and `perchaude entière`; both match-term arrays are empty.

| Query | Current results | With proposed form | Effect |
|---|---:|---:|---|
| `whole yellow perch`; `perchaude entière` | 0; 0 | 1 Yellow-perch result each | Adds the two intended species-qualified phrases and corresponding form hint. |
| `yellow perch` | 2: Eurasian perch and Yellow perch | Same 2 | Preserves R600's separate *Perca* identities. |
| `perchaude` | 1 Yellow-perch result | Same 1 | Existing Québec species-name search is unchanged. |
| `perch`; `perche` | 5; 2 | Same 5; 2 | Broad fish-family queries retain all current results. |
| `perch fillets`; `perch fillet` | 0; 0 | Same 0; 0 | Unlike the held R691 wording, the whole labels do not create a singleton generic fillet result. |
| `whole perch` | 0 | 0 | No reordered or generic perch phrase is added. |
| `whole fish`; `poisson entier` | 1; 1, Whole tilapia | Same 1; 1 | Broad whole-fish queries remain unchanged. |
| `whole`; `entière` | 56; 13 | 57; 14 | Each short query gains Yellow perch and remains multi-result. |
| `fish`; `poisson` | 42; 21 | Same 42; 21 | General fish queries are unchanged. |
| `fresh whole` | 8 | 8 | No freshness wording is added. |
| `filet`; `fillets` | 7; 7 | Same 7; 7 | Existing fillet searches are unchanged. |

## Manifest recipe-corpus audit

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It searched the decoded recipe JSON and ingredient rows for `yellow perch`, `yellow lake perch`, `perchaude`, *Perca flavescens*, `whole yellow perch`, and `perchaude entière`. It found **zero matching recipe files and zero matching ingredient rows**. The bundled corpus supplies no Yellow-perch recipe context, amount, form link, or substitution, so no recipe link or numeric observation is proposed.

## Bounded recommendation

Add only `whole yellow perch / perchaude entière` as a `whole_fish` presentation under the existing verified *Perca flavescens* identity, with empty match-term arrays and null density. Keep the supplier’s dressed qualifier, fresh/previously-frozen periods, 227–600 g whole-size range, and 10 lb case out of reusable form and measure fields. Add no cleaning/head/skin/bone state, conversion, yield, recipe link, or substitution. The R691 Ontario fillet hold and the broader Section P finfish checklist remain unchanged.

No software tests, build, emulator, or deployment were run for this proposal-only review. Static data and document consistency checks are recorded with delivery.
