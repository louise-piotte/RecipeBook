# WP04 Section P R775 — whole Arctic-char form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Packet type:** proposal-only form, source-ownership, picker, and recipe-corpus review.
- **Disposition:** add one state-neutral `whole_fish` form, **whole Arctic char / omble chevalier entier**, under the existing `ingredient-ref-arctic-char` identity for *Salvelinus alpinus*.
- **Scope:** whole presentation only. Do not change the species identity or add aliases, fresh/frozen state, cleaning details, measures, recipe links, conversions, yields, or substitutions.
- **Status:** this proposal changes no shared catalog or ledger JSON, plan, roadmap, generated file, workflow, recipe, or application code.

## Checklist fit and review boundary

The finfish and regional-fish parent in the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6946) remains open after R772. Arctic char is an existing species identity within that open coverage. Its active reference, `ingredient-ref-arctic-char`, is displayed as `Arctic char / omble chevalier`, has the narrow English alias `Arctic charr`, has null density and no unit mappings, and has no attached form. Its verified identity sources are already owned by that reference: OQLF source `WP04-SEA-GAP-20261009-S01` and Fisheries and Oceans Canada source `WP04-SEA-GAP-20261009-S02`.

A focused search of the proposal, batch, and plan archive found no earlier decision for a raw whole-Arctic-char form or the exact proposed phrase `omble chevalier entier`. The earlier identity-only review and coordinator packet describe market presentations as outside identity scope; the coordinator packet's historical DFO categories are not current product evidence. R492 created a separate **smoked Arctic char** reference and recipe-specific 100 g finding; it did not create a raw whole-fish form. The current whole-fish forms for rainbow trout (R757), lake trout (R760), brook trout (R763), Atlantic herring (R769), and bluefish (R772) belong to distinct identities and do not resolve this form question.

## Recommended delta

Add one form under the verified Arctic-char identity:

```json
{
  "id": "ingredient-form-arctic-char-whole-fish",
  "ingredientRefId": "ingredient-ref-arctic-char",
  "formCode": "whole_fish",
  "labelFr": "omble chevalier entier",
  "labelEn": "whole Arctic char",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Opercule indique que ses ombles chevaliers sont offerts en filets ou entiers chez son partenaire montréalais; ceux vendus aux particuliers sont emballés sous vide et congelés. Seacore offre aussi l’omble chevalier entier frais ou congelé. La forme décrit uniquement la présentation entière et ne précise pas l’état de fraîcheur ou de congélation, la tête, l’éviscération, l’écaillage, la peau ou les arêtes. Les poids et formats des fournisseurs ainsi que la quantité d’une recette MAPAQ demeurent propres à leurs sources. Aucune mesure, densité, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Opercule lists its Arctic char as fillets or whole fish through its Montréal partner; the fish sold to individual customers are vacuum-packed and frozen. Seacore also offers Arctic char whole in fresh and frozen supply. This form describes only the whole presentation and specifies no fresh or frozen state, head, gutting, scaling, skin, or bones. Supplier weights and sizes, and the quantity in a MAPAQ recipe, remain source-specific. No measure, density, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

If integrated, the form-owned ledger record should use `recordId: ingredient-form-arctic-char-whole-fish`, `recordType: ingredient_form`, and `identityState: verified`. Set `measurementState: researched_no_supported_value`: vendor size ranges and weights, and MAPAQ’s one whole fish in one four-person recipe, do not establish a reusable measure or weight. Leave `substitutionResearchState: not_yet_researched`; this review does not research substitutions. Add no measurement observation, density, unit mapping, conversion, yield, recipe-line link, or substitution rule. Reuse the two existing identity source records rather than duplicating them.

## Current product evidence and form limits

Current supplier evidence supports a species-qualified whole presentation. Seacore identifies its product as Arctic Char, *Salvelinus alpinus*, and lists whole or fillet product in both fresh and frozen supply [S02]. Opercule, a Montréal Arctic-char producer, says its fish are available to individual customers at Boucherie Lawrence as fillets or whole fish; that route is vacuum-packed and frozen [S01]. Boucherie Lawrence’s current French product page calls the item `omble chevalier entier`, but was marked sold out when checked; it supports the product wording, not current stock [S03].

MAPAQ and ITHQ’s Québec recipe names `1 Omble chevalier du Québec entier (ou 2 filets)` for four people and then instructs the cook to fillet a whole fish if that option is used [S04]. This is one external recipe’s own quantity, not a bundled recipe link, typical fish size, per-person amount, or reusable count-to-weight conversion. The proposed state-neutral form does not promote supplier-specific freshness, freezing, vacuum packaging, weights, size grades, or recipe quantity.

## Current picker projection

The projection follows the current [phrase-first, substring-fallback search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including accent folding and form hints only when a complete form label is queried. It adds the two labels and no match terms.

| Query | Current results | With proposed form | Effect |
|---|---:|---:|---|
| `whole Arctic char` | 0 | 1 | Exact English form label selects Arctic char and supplies the form hint. |
| `omble chevalier entier` | 0 | 1 | Exact French form label selects the same identity and supplies the form hint. |
| `Arctic char`; `omble chevalier` | 2; 2 | 2; 2 | Existing raw Arctic-char and smoked-Arctic-char results stay unchanged. |
| `Arctic` | 3 | 3 | Arctic cod, raw Arctic char, and smoked Arctic char remain the results. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches remain on the existing whole-tilapia identity. |
| `whole`; `entier` | 55; 28 | 56; 29 | Each broad fragment gains Arctic char and remains multi-result. |
| `char` | 3 | 3 | The existing raw char, smoked char, and char-siu-sauce results remain unchanged. |
| `fish`; `poisson` | 18; 14 | 18; 14 | General fish searches are unchanged. |
| `fresh whole` | 8 | 8 | The form adds no fresh-state wording. |
| `whole char` | 0 | 0 | No generic or reordered term is added. |

The qualified form labels make the whole presentation searchable without turning a broad `whole fish`, `poisson entier`, `char`, or `Arctic` query into a species-specific result.

## Manifest recipe-corpus audit

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**, checking decoded full recipe JSON for `Arctic char`, `Arctic charr`, `omble chevalier`, *Salvelinus alpinus*, `whole Arctic char`, and `omble chevalier entier`. It found **zero matching files and zero matching ingredient rows**. The bundle supplies no Arctic-char recipe context, amount, form link, or substitution. MAPAQ’s separate external recipe supports whole-fish culinary use but is not bundled demand and is not linked to a recipe row.

## Source ownership and source register

The current package has **1,864 ingredient references**, **189 forms**, and **2,262 research-ledger records**. The active `ingredient-ref-arctic-char` has no form. Exact-ID searches found no owner for `ingredient-form-arctic-char-whole-fish` in the active reference or form catalog, legacy candidates, or ledger. The four proposed source IDs and four product/recipe URLs below have no exact prior owner in the live ledger or earlier proposal/batch archive. Reuse `WP04-SEA-GAP-20261009-S01` and `WP04-SEA-GAP-20261009-S02`, already owned by `ingredient-ref-arctic-char`, for the bilingual identity and taxon.

| Proposed source ID / owner | Source and locator | Support and limits |
|---|---|---|
| `WP04-SECTIONP-ARCTIC-CHAR-WHOLE-FORM-R775-20261018-S01` | Opercule, [Clients](https://www.opercule.ca/clients), “Omble chevalier” and “Particuliers” sections; accessed 2026-10-18. | Montréal producer says its Arctic char are sold to individual customers at Boucherie Lawrence as fillets or whole fish and vacuum-packed/frozen. It also describes its fish as fresh and traceable for the restaurant, grocery, and fishmonger trade. This is producer and route-to-market evidence, not a live retailer stock feed; seasonal market weights are not measures. |
| `WP04-SECTIONP-ARCTIC-CHAR-WHOLE-FORM-R775-20261018-S02` | Seacore Seafood, [Arctic Char](https://www.seacoreseafood.com/product/Arctic_Char), species, characteristics, and product-number sections; accessed 2026-10-18. | Current Canadian supplier page pairs Arctic Char with *Salvelinus alpinus*, lists whole or fillet, and describes fresh and frozen supply. Its 2–4, 4–6, and 6–8 lb whole-product grades and product numbers remain supplier-specific and are not reusable size measures. |
| `WP04-SECTIONP-ARCTIC-CHAR-WHOLE-FORM-R775-20261018-S03` | Boucherie Lawrence, [omble chevalier entier](https://boucherielawrence.com/fr/products/whole-arctic-char), product title and listing; accessed 2026-10-18. | Montréal retailer uses the exact French product phrase and links the product to local producer Opercule. The page was marked sold out and gives an approximate 1 kg checkout basis; neither indicates continuing stock or a reusable weight. |
| `WP04-SECTIONP-ARCTIC-CHAR-WHOLE-FORM-R775-20261018-S04` | MAPAQ and ITHQ, [Omble chevalier aux noisettes](https://www.mapaq.gouv.qc.ca/SiteCollectionDocuments/ConsommationPortail/Recettes/recettes_Ombles_2021.pdf), page 1, ingredient list and step 1; accessed 2026-10-18. | Québec recipe lists one whole Québec Arctic char or two fillets for four people and describes filleting the whole-fish option. This is one formula’s specific ingredient quantity and preparation, not a generic count/weight relation, standard size, or bundled recipe link. |
| **Reused `WP04-SEA-GAP-20261009-S01`** | OQLF, [omble chevalier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198861/omble-chevalier), already owned by `ingredient-ref-arctic-char`. | Supports Québec-normalized `omble chevalier`, English `Arctic char`, and *S. alpinus*. Reuse the existing identity source; do not register a duplicate. |
| **Reused `WP04-SEA-GAP-20261009-S02`** | Fisheries and Oceans Canada, [Omble chevalier (*Salvelinus alpinus*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-char-omble-chevalier-fra.html), already owned by `ingredient-ref-arctic-char`. | Confirms the species identity and Canadian context. Biological size or weight information is not a culinary measure or yield. Reuse the existing identity source; do not register a duplicate. |

The proposed form and new source IDs are local to this proposal until integration. Do not add the supplier’s size specifications or package basis to shared reusable fields.

## Bounded recommendation

Add only `whole Arctic char / omble chevalier entier` as a `whole_fish` presentation under verified *Salvelinus alpinus*, with empty match-term arrays and null density. Current suppliers support whole fish across fresh and frozen contexts, while the Québec product route uses a frozen presentation; therefore the reusable form records whole presentation only. Keep product weights, temperature, vacuum packing, cleaning state, the one external recipe quantity, measures, yields, recipe links, conversions, and substitutions out of active data. Section P remains open.

No software tests, build, emulator, or deployment were run for this proposal-only review. Static data and document consistency checks are recorded with delivery.
