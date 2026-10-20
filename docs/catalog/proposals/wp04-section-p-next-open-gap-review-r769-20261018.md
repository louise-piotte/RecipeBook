# WP04 Section P R769 — whole Atlantic-herring form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Status:** Proposal only. This review changes no shared catalog, ledger, plan, roadmap, recipe, workflow, generated-index, or application file.
- **Checklist fit:** The Section P finfish parent remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6941). The existing Atlantic-herring reference is identity-only; no whole-fish form is attached.
- **Candidate:** One state-neutral `whole_fish` form under `ingredient-ref-atlantic-herring` for *Clupea harengus*.
- **Recommendation:** Add **whole Atlantic herring / hareng de l’Atlantique entier**, without match terms. Current Canadian species and product-form guidance identifies Atlantic herring as whole in fresh and frozen forms, and a Canadian retailer currently lists a whole Atlantic-herring product. Do not encode either state, cleaning/head condition, or market-specific size. Add no measure, recipe link, conversion, yield, or substitution.

## Existing identity and distinct open form

The active `ingredient-ref-atlantic-herring` reference is displayed as `Atlantic herring / hareng de l’Atlantique`, with no aliases, attached forms, default density, or unit mappings. Its verified identity sources pair *Clupea harengus* with the bilingual species name. The active form list has no form under this reference.

The dedicated [Atlantic-herring identity review](wp04-finfish-species-followup-20261009.md) accepted only the species identity and explicitly left forms open; it did not reject a whole-fish presentation. Later herring reviews address separate products: R154’s kipper boundary, R166’s Matjes boundary, R178’s tomato-sauce fillets, R180’s smoked fillets in oil, R185’s mustard-herring boundary, R204’s salted/smoked bloater, and R416’s roe hold. None allocates an unpreserved whole-fish form to Atlantic herring. Keep Pacific herring and the herring roe, kipper, bloater, smoked, marinated, and canned products distinct.

R763’s whole-brook-trout form and R766’s whole-lake-whitefish form belong to other species. This proposal does not add a generic `whole herring` or `hareng entier` term that could present one species as the answer for both Atlantic and Pacific herring.

## Product scope and bilingual labels

The current Seafood from Canada English and French species pages identify Atlantic herring as *Clupea harengus*. Their product-form sections list the fish whole when fresh and when frozen; the English gallery also labels an image “Fresh whole Atlantic Herring.” These are current Canadian species/product-category pages, not a dated store inventory. [S01–S02]

Seafood Depot’s current Canadian supplier page identifies Herring as *Clupea harengus harengus*, calls it Atlantic Herring, and lists whole or fillet forms in fresh and frozen states. It says its herring is wild, caught in Eastern Canada, and that fresh is available by special order. The supplier’s taxonomic wording and availability remain source-specific; the active catalog identity stays scoped to *C. harengus*. [S03]

Caudle’s Catch currently lists **Whole Atlantic Herring**, SKU 3162, as frozen whole, wild-caught Canadian herring. The page says the item is on backorder but remains purchasable; this supports a current product listing, not immediate stock. Its rough 400–600 g range and sale by the pound remain retailer-specific market details. The product page does not give a binomial. [S04]

Compose the French form label from the active identity’s French name and the supported whole presentation: `hareng de l’Atlantique entier`. The source category explicitly supports *entier* for Atlantic herring in French. Keep `whole herring`, `hareng entier`, `fresh`, `frozen`, and generic `whole fish` phrases out of match terms. Keep the state-neutral form separate from the source-specific frozen Caudle’s SKU.

## Proposal-only form delta

If accepted, add only this form under the existing reference:

```json
{
  "id": "ingredient-form-atlantic-herring-whole-fish",
  "ingredientRefId": "ingredient-ref-atlantic-herring",
  "formCode": "whole_fish",
  "labelFr": "hareng de l’Atlantique entier",
  "labelEn": "whole Atlantic herring",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Les pages Seafood from Canada indiquent que le hareng de l’Atlantique est offert entier, frais ou congelé. Caudle’s Catch décrit un produit propre à son détaillant comme hareng de l’Atlantique entier congelé; cette température et la disponibilité différée demeurent propres à sa fiche. La forme décrit uniquement la présentation entière et ne précise pas la tête, l’éviscération, l’écaillage, la peau ou les arêtes. La vente à la livre et la fourchette approximative de 400 à 600 g sont des détails marchands, pas une mesure de cuisine ou une portion standard. Aucune densité, mesure, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Seafood from Canada lists Atlantic herring whole, fresh or frozen. Caudle’s Catch describes its own product as frozen whole Atlantic herring; that state and its backorder status remain specific to that listing. This form describes only the whole presentation and specifies no head, gutting, scaling, skin, or bones. The by-the-pound sale and approximate 400–600 g range are retailer details, not a kitchen measure or standard portion. No density, measure, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

If integrated, the form-owned ledger record should use `recordId: ingredient-form-atlantic-herring-whole-fish`, `recordType: ingredient_form`, and `identityState: verified`. Set `measurementState: researched_no_supported_value`: the current seller’s 400–600 g rough fish weight and per-pound pricing do not establish a recipe amount, kitchen measure, standard portion, or reusable count-to-mass mapping. Add no measurement observation, density, unit mapping, conversion, yield, or recipe link. Leave `substitutionResearchState: not_yet_researched`; this form review does not test or support a substitute.

## Picker projection

The static projection follows the current [phrase-first, substring-fallback search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including accent folding and form hints only for a complete form label. It adds the two proposed labels, with no match terms.

| Query | Current results | With form | Effect |
|---|---:|---:|---|
| `whole Atlantic herring` | 0 | 1 | The species-qualified English form label selects the existing Atlantic-herring parent and supplies its form hint. |
| `hareng de l’Atlantique entier` | 0 | 1 | The species-qualified French form label selects the same parent and supplies its form hint. |
| `Atlantic herring`; `hareng de l’Atlantique` | 1; 1 | 1; 1 | Existing identity queries remain unchanged and receive no form hint unless the full form label is entered. |
| `herring`; `hareng` | 5; 5 | 5; 5 | Existing multi-result searches remain unchanged; the form adds no new reference. |
| `whole herring`; `hareng entier` | 0; 0 | 0; 0 | No unqualified whole-herring match term is added; the two herring species are not collapsed to one result. |
| `whole`; `entier` | 53; 26 | 54; 27 | Both broad presentation searches gain Atlantic herring and remain multi-result. |
| `fresh whole`; `frozen whole` | 8; 1 | 8; 1 | No freshness or frozen-state term is added. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches remain unchanged. |
| `fish`; `poisson` | 18; 14 | 18; 14 | General fish searches remain unchanged. |

## Recipe demand and numeric limits

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**, checking full decoded recipe JSON text. It found **zero matching files and zero ingredient rows** for `Atlantic herring`, `hareng de l’Atlantique`, `hareng de l'Atlantique`, *Clupea harengus*, `whole Atlantic herring`, `whole herring`, `hareng entier`, and `hareng de l’Atlantique entier`. The bundled corpus supplies no Atlantic-herring recipe, use context, amount, form link, or substitution. The Seafood from Canada page’s linked external recipes are not bundled recipe demand and are not linked here.

Do not turn Caudle’s product-specific rough size or its per-pound sale into a measure, standard serving, yield, density, conversion, or substitution. No cleaning, head, gutting, scaling, skin, or bone state is established for the reusable form. The current product source identifies its frozen state, while the species/product-form pages list whole Atlantic herring in both fresh and frozen categories; the form itself remains state-neutral.

## Ownership and source register

At the proposal snapshot, the live package contains **1,857 references** and **187 forms**; the research ledger contains **2,253 records**. `ingredient-ref-atlantic-herring` is active and has no attached form. Exact-ID checks found no owner for `ingredient-form-atlantic-herring-whole-fish` in active references, forms, legacy-import identities, or ledger records. The proposed R769 source IDs and the Seafood from Canada, Seafood Depot, and Caudle’s Catch URLs have no exact owner in the ledger or proposal/batch archive. Reuse the existing Atlantic-herring identity sources `WP04-FINFISH-FOLLOWUP-20261009-S05` and `S06` for the existing DFO English/French species-name and taxon evidence; do not register duplicate identity sources. The current product sources below are proposal-local until integration.

| Source ID / existing owner | Source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-HERRING-WHOLE-FORM-R769-20261018-S01` | Seafood from Canada, [Herring, Atlantic](https://seafoodfromcanada.ca/seafood/herring-atlantic/), species, product forms, and image gallery. | Identifies *Clupea harengus* and lists fresh and frozen whole product forms; gallery image is labeled “Fresh whole Atlantic Herring.” Current national species/product-category evidence, not store inventory or product specification. |
| `WP04-SECTIONP-ATLANTIC-HERRING-WHOLE-FORM-R769-20261018-S02` | Seafood from Canada, [Hareng, atlantique](https://seafoodfromcanada.ca/fr/seafood/hareng-atlantique/), species and “Formes du produit.” | Identifies *C. harengus* and lists `Frais : entier` and `Congelé : entier`. Supports French wording and both states at category level; not a current retailer listing. |
| `WP04-SECTIONP-ATLANTIC-HERRING-WHOLE-FORM-R769-20261018-S03` | Seafood Depot, [Herring](https://www.seafooddepot.ca/product-herring2), product characteristics and availability note. | Identifies its Herring item as *Clupea harengus harengus* and Atlantic Herring; lists whole or fillet, fresh and frozen, wild, caught in Eastern Canada, and says fresh is available by special order. Current supplier evidence; its trinomial and special-order status are source-specific. |
| `WP04-SECTIONP-ATLANTIC-HERRING-WHOLE-FORM-R769-20261018-S04` | Caudle’s Catch Seafood, [Whole Atlantic Herring](https://caudlescatchseafood.com/products/whole-canadian-herring), product title, SKU 3162, description, and availability notice. | Current Canadian retail listing identifies the product as frozen whole Atlantic herring and says it is available on backorder for purchase. It gives retailer-specific by-pound pricing and rough 400–600 g size; neither is a reusable measure or recipe amount. No scientific name is stated. |
| **Reused `WP04-FINFISH-FOLLOWUP-20261009-S05`** | Fisheries and Oceans Canada, [Atlantic Herring rebuilding plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2025/herring-4t-hareng-eng.html), already owned by `ingredient-ref-atlantic-herring`. | Supports the existing English species name and *C. harengus* identity. Reuse without another ledger source entry. |
| **Reused `WP04-FINFISH-FOLLOWUP-20261009-S06`** | Pêches et Océans Canada, [Plan de rétablissement : Hareng de l’Atlantique](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2025/herring-4t-hareng-fra.html), already owned by `ingredient-ref-atlantic-herring`. | Supports the existing Québec French species name and *C. harengus* identity. Reuse without another ledger source entry. |

## Bounded recommendation

Add only `whole Atlantic herring / hareng de l’Atlantique entier` under verified *Clupea harengus*, with `formCode: whole_fish`, `prepState: whole`, null density, and empty match-term arrays. Keep fresh/frozen state, backorder status, seller-specific weight, head/cleaning condition, and package details out of the reusable form. Add no measure, conversion, yield, recipe link, or substitution. Section P remains open. This proposal-only review requires no software tests, build, emulator run, or deployment.
