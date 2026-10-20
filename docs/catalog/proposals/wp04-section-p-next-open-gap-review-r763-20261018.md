# WP04 Section P R763 — whole brook-trout form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Status:** Proposal only. This review changes no shared catalog, ledger, plan, roadmap, recipe, workflow, generated-index, or application file.
- **Checklist fit:** The Section P finfish parent remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6896). The [R761–R763 integration checkpoint](../batches/wp02-wp03-wp04-r761-r763-gap-review-integration-20261018/README.md) lists the WP04 R763 review as pending.
- **Candidate:** One state-neutral `whole_fish` form under the existing `ingredient-ref-brook-trout` identity for *Salvelinus fontinalis*.
- **Recommendation:** Add **whole brook trout / omble de fontaine entier**, without match terms. Raymer Aquaculture’s paired buyer pages identify whole portions for the table market and distinguish them from live fish for stocking. Treat “portions” as nonnumeric wording. Do not add a fresh or frozen state, cleaning or head state, measure, recipe link, conversion, yield, or substitution.

## Current identity and distinct open form

The active `ingredient-ref-brook-trout` reference is displayed as `brook trout / omble de fontaine`, with English aliases `brook charr` and `speckled trout` and French search alias `truite mouchetée`. Its existing OQLF and Gouvernement du Québec sources identify *Salvelinus fontinalis* and distinguish it from rainbow trout, lake trout, and Arctic char. The reference has no attached form, default density, or unit mapping. Reuse its existing identity sources; do not add another fish identity or alias.

The dedicated [brook-trout identity review](wp04-section-p-brook-trout-omble-de-fontaine-identity-review-20261012.md) accepted that identity only and did not assess a market presentation. The current form list has no brook-trout form. R757’s fresh-whole form belongs to *Oncorhynchus mykiss* rainbow trout; R760’s whole-fish form belongs to *Salvelinus namaycush* lake trout. This proposal concerns the separate *S. fontinalis* owner and has no fresh-state or generic whole-trout search term.

The [R548 rainbow-trout fillet review](wp04-section-p-next-gap-review-r548-20261017.md) is a distinct cut boundary. The [canned-trout R201](wp04-section-p-canned-trout-product-boundary-review-r201-20261016.md) and [smoked-trout R158](wp04-section-p-smoked-trout-product-boundary-review-r158-20261016.md) reviews concern finished products and do not allocate a raw whole-brook-trout form. The generic tuna line and species decisions also remain untouched: [R112](wp04-section-p-albacore-tuna-identity-review-r112-20261014.md) and [R102](wp04-section-p-yellowfin-tuna-identity-review-r102-20261014.md) concern *Thunnus alalunga* and *T. albacares*, while the [tuna-steak boundary review](wp04-tuna-steak-recipe-boundary-review-20261011.md) keeps recipe `111#1` on generic tuna. None identifies brook trout or supplies a form or amount for it.

## Product scope and bilingual labels

Raymer Aquaculture’s live French buyer page says brook trout is available **entière (portion) pour la table** or live for stocking Gaspésie lakes and rivers. Its English counterpart says **whole (portions) for the table market** or live for stocking. The distinction supports the food-market form while excluding the live stocking product. The pages do not establish an exact SKU, continuing inventory, or the fish’s head, gutting, scaling, skin, or bone state.

Use `whole brook trout / omble de fontaine entier`, composing the supplier-supported whole presentation with the existing species names. The French label uses masculine `entier`, consistent with the normalized term `omble de fontaine`. Keep `whole trout`, `truite entière`, `poisson entier`, and other generic search terms out of the form. Keep `matchTermsEn` and `matchTermsFr` empty so only the complete species-qualified labels select the form hint.

## Proposal-only form delta

If accepted, add this single form under the existing reference:

```json
{
  "id": "ingredient-form-brook-trout-whole-fish",
  "ingredientRefId": "ingredient-ref-brook-trout",
  "formCode": "whole_fish",
  "labelFr": "omble de fontaine entier",
  "labelEn": "whole brook trout",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Raymer indique que l’omble de fontaine est disponible entier (portion) pour le marché de la table, et séparément vivant pour l’ensemencement. « Portion » ne donne aucun compte ni poids. La fiche technique indique une taille moyenne de marché de 350 à 900 g, sans établir un poids de portion ou une mesure de recette. La forme ne précise ni l’état de fraîcheur ou de congélation, ni la tête, l’éviscération, l’écaillage, la peau ou les arêtes. Aucune densité, mesure de cuisine, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Raymer lists brook trout as whole (portions) for the table market, separately from live fish for stocking. ‘Portions’ provides no count or weight. Its technical sheet states an average consumption-market size of 350–900 g, which does not establish portion weight or a recipe measure. The form specifies no fresh or frozen state, head, gutting, scaling, skin, or bones. No kitchen measure, density, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The form-level ledger record should use `recordId: ingredient-form-brook-trout-whole-fish`, `recordType: ingredient_form`, and `identityState: verified`. Use `measurementState: researched_no_supported_value`: the producer’s 350–900 g average market-size range is not a portion weight, kitchen measure, package quantity, or recipe amount. Leave `substitutionResearchState: not_yet_researched`; this review does not research or propose a substitute. No measurement observation, density, unit mapping, conversion, yield, linked recipe, or substitution rule is proposed.

## Picker projection

The static projection follows the current [phrase-first, substring-fallback search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including accent folding and form hints for a complete form label. It adds only the two proposed labels and no match terms.

| Query | Current results | With form | Effect |
|---|---:|---:|---|
| `whole brook trout` | 0 | 1 | Exact English form label selects brook trout and supplies the form hint. |
| `omble de fontaine entier` | 0 | 1 | Exact French form label selects the same reference and supplies the form hint. |
| `brook trout`; `omble de fontaine` | 1; 1 | 1; 1 | Existing identity searches are unchanged. |
| `trout`; `truite` | 7; 6 | 7; 6 | Broad trout searches are unchanged. |
| `omble`; `charr` | 3; 3 | 3; 3 | Existing broader family searches are unchanged. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches are unchanged. |
| `whole trout` | 0 | 0 | No generic or reordered phrase is added. |
| `fresh whole` | 8 | 8 | No fresh-state phrase is added. |
| `whole`; `entier` | 51; 24 | 52; 25 | Each broad presentation query adds brook trout and remains multi-result. |
| `fish`; `poisson` | 18; 14 | 18; 14 | General fish searches are unchanged. |

## Recipe demand and numeric limits

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**, including full recipe JSON text. It found **zero matching files and zero ingredient rows** for `brook trout`, `brook charr`, `speckled trout`, `omble de fontaine`, `truite mouchetée`, *Salvelinus fontinalis*, `whole brook trout`, `omble de fontaine entier`, and the broad terms `trout` and `truite`. The bundled corpus supplies no brook-trout recipe, state, use context, amount, form link, or substitution. This is a bounded catalog-coverage proposal based on a Québec producer’s market presentation, not a recipe-backed addition.

Raymer’s word `portion` gives no number or weight. The separate technical sheet’s 350–900 g figure is average market size; it does not establish a portion size, kitchen measure, package amount, count-to-mass mapping, density, or yield. Do not record it as a reusable measure. Do not transfer recipe `111#1`’s generic tuna count or source-specific tuna steak ranges to this fish.

## Ownership and source register

The live package contains **1,850 references** and **185 forms**; the ledger contains **2,244 records**. `ingredient-ref-brook-trout` is active but has no form. Exact-ID checks found no owner for `ingredient-form-brook-trout-whole-fish` in active references, forms, legacy candidates, or ledger records. The R763 source IDs below and the three Raymer URLs have no exact ledger owner. The broad Raymer [Poissons et fruits de mer](https://raymeraquaculture.ca/poissons-et-fruits-de-mer/) page is already owned by R697 for dried capelin and is not reused here.

New source IDs are local to this proposal until integration. The two buyer pages are Raymer’s paired language pages for the same supplier statement, not independent product evidence. Reuse the existing OQLF and Québec sources on `ingredient-ref-brook-trout`; do not register those source URLs again.

| Source ID / existing owner | Source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-BROOK-TROUT-WHOLE-FORM-R763-20261018-S01` | Raymer Aquaculture, [Pourquoi choisir l’omble Raymer Aquaculture?](https://raymeraquaculture.ca/pourquoi-acheter-lomble-signe-raymer-aquaculture-2/), “Sous quelle forme…” | Identifies omble de fontaine as available whole (portion) for the table or live for stocking. It establishes a producer-stated food presentation, not a particular SKU, numeric portion, or continuing inventory. |
| `WP04-SECTIONP-BROOK-TROUT-WHOLE-FORM-R763-20261018-S02` | Raymer Aquaculture, [Why choose Raymer Aquaculture trout and char?](https://raymeraquaculture.ca/pourquoi-acheter-lomble-signe-raymer-aquaculture/), “How are … sold?” | English counterpart identifies brook trout as whole (portions) for the table market or live for stocking. It is the same producer statement as S01, not independent corroboration. |
| `WP04-SECTIONP-BROOK-TROUT-WHOLE-FORM-R763-20261018-S03` | Raymer Aquaculture, [Fiche technique : Omble de fontaine](https://raymeraquaculture.ca/fiche-technique-omble-de-fontaine/), scientific name, English common name, and market-size lines. | Identifies *Salvelinus fontinalis* as Brook trout / Brook charr and states an average consumption-market size of 350–900 g. The size range is market context, not a portion or recipe measure; common-name variants are not added as aliases. |
| **Reused `WP04-P-BROOK-TROUT-20261012-S01`** | OQLF, [omble de fontaine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198650/omble-de-fontaine), already owned by `ingredient-ref-brook-trout`. | Supports Québec-normalized `omble de fontaine`, English `brook trout`, and *S. fontinalis*. Its note on non-retained product-label terms supports keeping the display normalized. Reuse without another ledger source entry. |
| **Reused `WP04-P-BROOK-TROUT-20261012-S02`** | Gouvernement du Québec, [Omble de fontaine](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/omble-fontaine), updated 2026-10-02, already owned by `ingredient-ref-brook-trout`. | Confirms the bilingual species name and taxon and distinguishes brook trout from rainbow trout, touladi, and omble chevalier. It is species evidence, not the source for a current form. |

The proposed form ID and source IDs are not active allocations. The Raymer buyer-page and technical-sheet URLs have no previous exact owner. Keep the broader Raymer catalogue URL on its existing R697 capelin record.

## Bounded recommendation

Add only `whole brook trout / omble de fontaine entier` under verified *Salvelinus fontinalis*, with `formCode: whole_fish`, `prepState: whole`, null density, and empty match-term arrays. Limit the form to Raymer’s table-market whole presentation. Keep live stocking separate, treat “portion” as nonnumeric, and add no temperature, cleaning, measure, recipe, yield, conversion, or substitution data. Section P remains open. This proposal-only review requires no software tests, build, emulator run, or deployment.
