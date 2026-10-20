# WP03 Section L R669 — Jalapeño smoked-and-dried chipotle form review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated in the R666–R669 coverage batch. Added the whole smoked-and-dried form under jalapeño and preserved the separate adobo identity and ambiguous bare-query behavior.
- **Plan anchors:** The open bell-pepper/fresh-chile and fresh/dried/smoked product-state work is in [Section L](../../RecipeBook-global-ingredient-catalog-plan.txt#L6209) and [dried chiles](../../RecipeBook-global-ingredient-catalog-plan.txt#L6300). The earlier Mexico/Central America sweep already recommended reviewing whole dried chipotle while flagging the active jalapeño relationship and `chipotle in adobo` picker boundary ([Rationale](wp06-mexico-central-america-gap-sweep-20261009.md#L73)).
- **Scope:** Add the smoked-and-dried whole jalapeño form represented by the Québec term *chipotle* to the existing `ingredient-ref-jalapeno-pepper`. Do not create a new base reference or change the separate `ingredient-ref-chipotle-in-adobo` compound identity.
- **Source ownership:** Reuse the existing `WP03-L-JALAPENO-20261018-R629-S01` OQLF source by ID; its locator already covers the OQLF definition of *chipotle*. The four R669 source IDs below are new and were checked against the active ledger and proposal/batch archive. The new URLs have no current ledger source entries.

## Recommendation

Add one `whole_smoked_dried` form under the verified jalapeño reference:

```json
{
  "id": "ingredient-form-jalapeno-pepper-whole-smoked-dried",
  "ingredientRefId": "ingredient-ref-jalapeno-pepper",
  "formCode": "whole_smoked_dried",
  "labelFr": "piment jalapeno entier fumé et séché (chipotle)",
  "labelEn": "whole smoked-and-dried jalapeño pepper (chipotle)",
  "prepState": "smoked_dried",
  "matchTermsFr": [],
  "matchTermsEn": ["chipotle chili", "chipotle chilli"],
  "densityGPerMl": null,
  "notesFr": "Le chipotle est un piment jalapeno mûr fumé et séché; aucune mesure générale ni densité n'est établie.",
  "notesEn": "Chipotle is a ripe jalapeño pepper that is smoked and dried; no general measure or density is established."
}
```

The labels use OQLF's preferred French spelling `jalapeno` without the Spanish tilde and retain its French term `chipotle`; OQLF lists English `chipotle chili` and `chipotle chilli`. The whole-state wording is supported by Canadian product listings. The catalog model stores this as a form of jalapeño because OQLF explicitly describes it as the smoked-and-dried jalapeño product, not a separate botanical ingredient. Keep the bare French term out of `matchTermsFr`: `chipotle` is also part of the existing `chipotle in adobo` identity, and the search index gives an exact form-term match priority over other matching identities. The form label itself still lets the bare query find both candidates.

No reference aliases, density, unit mapping, measurement observation, package yield, conversion, recipe line, or substitution rule is proposed. The inspected 85 g and 1 lb/150 g seller package labels are not kitchen measures; the Unimarket page is unavailable and internally inconsistent about the package quantity. Keep measurement research on the proposed form `researched_no_supported_value` only for the reviewed whole-smoked-and-dried product pages; do not interpret package net mass as a serving or density. Keep substitution research `not_yet_researched`: this batch does not perform a structured, context-specific substitution review. Its preliminary search surfaced unsupported exact-ratio SEO pages and the recipe publisher's one-sauce preference for canned adobo peppers, but neither establishes a general substitution or proves that no supported substitute exists. Add no substitution finding or runtime suggestion.

## Current ownership and duplication audit

| Surface | Current state | R669 disposition |
|---|---|---|
| Jalapeño identity | `ingredient-ref-jalapeno-pepper`, `piment jalapeno / jalapeno pepper`, category `VEGETABLE_AND_AROMATIC`; one French plural alias; density null and mappings empty. | Keep identity, category, aliases, and numeric fields unchanged. |
| Existing jalapeño form | `ingredient-form-jalapeno-pepper-fresh` is the only attached form. | Add one separate smoked-and-dried whole form; keep fresh form unchanged. |
| Chipotle in adobo | `ingredient-ref-chipotle-in-adobo` is a distinct `SAUCE_AND_CONDIMENT` identity used by recipe lines. | Keep it as the prepared pepper-and-sauce product. Do not move its recipe links or add `chipotle in adobo` to the new form. |
| Powdered chipotle | Québec seller Épices Crousset lists `Chipotle moulu`; it is ground, not a whole dried pepper. | Do not model ground/powdered product with this whole form. Keep a separate WP03 chile-powder review open. |
| Other chipotle terms | The earlier Mexico/Central America sweep documented the existing adobo identity and proposed a distinct whole dried chipotle candidate. | Resolve the candidate as a jalapeño form, not a parallel base reference. Keep `morita`, `meco`, `chipotle in adobo`, and chipotle-flavoured seasoning blends out of aliases. |
| Form/ledger ID | Neither `ingredient-form-jalapeno-pepper-whole-smoked-dried` nor a ledger record for that ID exists. | Allocate this form ID and one matching `ingredient_form` ledger record only after acceptance. |
| Recipe demand | All 114 manifest-listed recipe files were scanned; exact chipotle usage is in prepared `chipotle in adobo` lines, with no whole dried chipotle line. | Add no recipe link or recipe-line substitution. |

The shared OQLF source ID remains record-local to the jalapeño reference in R629 and is reused here for its exact URL. R669-S01 through S04 are new source IDs and each has one proposed owner. Do not duplicate the OQLF URL under a new ID.

## Evidence and limits

1. **Québec terminology and identity — OQLF, GDT: [piment jalapeno](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869222/piment-jalapeno), updated 2012.** The fiche prefers `piment jalapeno` in French, rejects the Spanish tilde in French orthography, lists English `chipotle`, `chipotle chili`, and `chipotle chilli` as associated terms, and states that smoked-and-dried jalapeño takes the name *chipotle*. This directly supports the form relationship and bilingual terms, not whole-pod retail availability.
2. **Current Canadian bilingual product listing — `WP03-L-JALAPENO-20261018-R669-S01` — [Unimarket, Chile Chipotle Seco Ahumado Entero / Dried Whole Smoked Chile Chipotle](https://unimarket.ca/collections/dried-chiles/products/chile-chipotle-seco-ahumado-entero-dried-whole-smoked-chile-chipotle-150g).** The product title and description identify whole smoked-dried jalapeño peppers. The page currently says unavailable and conflicts between the title's 1 lb and body text's 150 g; neither availability nor package quantity is used as a general claim.
3. **Canadian retail boundary — `WP03-L-JALAPENO-20261018-R669-S02` — [MexiMarket, Dried Whole Chipotle Pepper 85 Gr](https://www.meximarket.ca/products/dried-whole-chipotle-pepper-85-gr).** The current listing uses a whole, dried chipotle product title and shows an 85 g seller package. The page does not identify the maker or establish a mass per pepper; the package is not a household measure.
4. **Québec product and local wording — `WP03-L-JALAPENO-20261018-R669-S03` — [Épices Crousset, Chipotle moulu](https://crousset.com/produit/chipotle-moulu/).** The Magog seller describes chipotle as a red, matured jalapeño hot-dried to produce a smoky taste. This confirms local chipotle usage and the pepper relationship, but the item is ground and does not support the whole form or a general conversion.
5. **Québec recipe-publisher context — `WP03-L-JALAPENO-20261018-R669-S04` — [La petite bette, Marinade et sauce Chipotle maison](https://lapetitebette.com/recette/marinade-sauce-chipotle/), published 2026-01-15, updated 2026-01-20.** The author describes chipotle as ripened red jalapeño that is smoked and usually dried, distinguishes whole/dried, powdered, and adobo-packed presentations, and recommends canned adobo pepper for that specific sauce. This is a recipe-specific preference, not a general substitution rule.

The identity evidence does not establish a universal species/cultivar beyond the OQLF's jalapeño relationship, heat level, smoking wood, drying method, drying duration, or origin. No density or reusable mass/volume measure was found. A separate whole-versus-powdered distinction remains necessary.

## Picker and corpus projection

This projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): form labels and match terms are included with their parent reference; complete phrases are preferred before substring fallback.

- `chipotle` returns both the jalapeño reference (through the form label) and the separate `chipotle in adobo` reference; because `chipotle` is not an exact form match term, the existing exact-form priority does not hide the condiment. This intentionally exposes the raw dried chile and prepared sauce as distinct choices without forcing a form hint for an ambiguous query.
- `chipotle chili` and `chipotle chilli` resolve to the jalapeño reference/form.
- `chipotle in adobo` continues to resolve only to the prepared condiment.
- `jalapeno` continues to return the jalapeño identity; `fresh jalapeno pepper` continues to return the same identity, with the existing fresh form hint.
- The full 114-recipe/1,123-line scan found no whole dried chipotle demand; existing chipotle mentions remain linked to the adobo product.

## Integrated ledger record

Add one `ingredient_form` record keyed by the form ID above. It has `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`; include the reused OQLF source ID and new R669 product/Québec sources. Keep `measurementObservations` and `substitutionFindings` absent, and record that package quantities are not measures and substitution research remains open. The only new form has `densityGPerMl: null` and no numeric or recipe behavior.

## Static acceptance checks reviewed during integration

- Confirm the R629 OQLF source ID still points to the same URL and no source-ID duplicate is introduced.
- Confirm the form and ledger IDs are unallocated and all four R669 source IDs are unique.
- Confirm `chipotle in adobo` remains a separate reference and recipe links are unchanged.
- Project exact picker results for `chipotle`, `chipotle chili`, `chipotle chilli`, `chipotle in adobo`, `jalapeno`, and `fresh jalapeno pepper`.
- Scan all manifest recipes for jalapeño/chipotle terms and retain recipe links only where the exact product state matches.
- Run seed-package normalization/validation, generated-index freshness, ledger schema/custom validation, source/form ownership, UTF-8/no-BOM, local-link, and scoped whitespace checks. No software tests are needed if integration only adds database JSON data and its generated catalog index under the repository's updated testing rule.
