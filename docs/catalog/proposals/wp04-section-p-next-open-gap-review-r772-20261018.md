# WP04 Section P R772 — whole bluefish form review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Packet type:** proposal-only form, source-ownership, picker, and recipe-corpus review.
- **Disposition:** add one state-neutral `whole_fish` form, **whole bluefish / tassergal entier**, under the existing `ingredient-ref-bluefish` identity for *Pomatomus saltatrix*.
- **Scope:** one whole-fish presentation only. Do not change the species identity or add aliases, preparation details, measures, recipe links, conversions, yields, or substitutions.

## Review boundary

Section P still leaves finfish and regional fish coverage open. The R769 review added a whole Atlantic-herring form under a different species identity; it does not cover bluefish. The 2026-10-12 [bluefish identity review](wp04-section-p-bluefish-tassergal-identity-review-20261012.md) accepted `bluefish / tassergal` for *P. saltatrix* and explicitly left forms such as whole fish, fillet, frozen, smoked, salted, and cooked outside that identity. This proposal addresses only one presentation that the identity review deferred. It does not reopen the bluefish name, its species boundary, the held snapper name, or any other product state.

An archive search found no earlier proposal or batch decision for a whole-bluefish form, `whole bluefish`, or `tassergal entier`. The active reference `ingredient-ref-bluefish` exists with no attached form. The proposed form ID `ingredient-form-bluefish-whole-fish` has no current owner in the active reference/form catalogs, legacy-import identities, or ledger.

## Recommended delta

Add one form under the verified bluefish identity:

```json
{
  "id": "ingredient-form-bluefish-whole-fish",
  "ingredientRefId": "ingredient-ref-bluefish",
  "formCode": "whole_fish",
  "labelFr": "tassergal entier",
  "labelEn": "whole bluefish",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Supermarché PA affiche un produit Whole Bluefish; son emballage approximatif d’environ 550 g demeure propre à cette fiche. La liste d’arrivages bilingue de Poissonnerie La Mer classe TASSERGAL / BLUEFISH sous POISSONS ENTIERS / WHOLE FISH. La forme décrit uniquement la présentation entière. Elle ne précise pas la température, la tête, l’éviscération, l’écaillage, la peau ou les arêtes. Aucune mesure, densité, conversion, relation de rendement, recette liée ou substitution n’est établie.",
  "notesEn": "Supermarché PA lists a Whole Bluefish product; its approximate 550 g package remains specific to that listing. Poissonnerie La Mer's bilingual arrival list places TASSERGAL / BLUEFISH under WHOLE FISH. This form describes only the whole presentation. It specifies no temperature, head, gutting, scaling, skin, or bones. No measure, density, conversion, yield relationship, linked recipe, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Keep both match-term arrays empty. The bilingual labels provide the species-qualified whole phrases without adding broad terms such as `whole fish`, `poisson entier`, `fish`, `poisson`, or `blue`.

## Sources and ownership

The existing identity sources remain attached to `ingredient-ref-bluefish`: `WP04-SECTIONP-BLUEFISH-20261012-S01` ([OQLF, **tassergal**](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198905/tassergal)) and `WP04-SECTIONP-BLUEFISH-20261012-S02` ([CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue&wbdisable=true)). They pair bluefish with tassergal and *P. saltatrix*. Reuse those existing source IDs for the identity context; do not register duplicates.

| Proposed source ID | Primary source and locator | Support and limit |
|---|---|---|
| `WP04-SECTIONP-BLUEFISH-WHOLE-FORM-R772-20261018-S01` | Supermarché PA, [Whole Bluefish](https://www.supermarchepa.com/products/whole-bluefish-tassergal-entier), product title, Fish & Seafood collection, and package description. | Current retailer page lists a product as **Whole Bluefish**. It gives an approximate package weight of 550 g but no taxon, temperature, or preparation details. Use it for the product presentation only; do not promote the package estimate into a reusable measure. No exact URL owner was found in the ledger. |
| `WP04-SECTIONP-BLUEFISH-WHOLE-FORM-R772-20261018-S02` | Poissonnerie La Mer, [arrival list dated 2026-04-17 (PDF)](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_17-04-2026.pdf?v=1776376250), row under `POISSONS ENTIERS / WHOLE FISH`. | The bilingual commercial list pairs `TASSERGAL / BLUEFISH` in the whole-fish section and gives Atlantic origin. It also shows a 50% yield value and sale by kilogram; these are supplier data with no defined recipe-measure or yield basis and remain unmodeled. No exact URL owner was found in the ledger. |

The R772 source-ID prefix and proposed form ID are unallocated. Neither product-source URL has an exact owner in the ledger. A later La Mer list dated 2026-04-28 contains the same Bluefish row, but its exact URL is already owned by `WP04-SECTIONP-GOLDEN-TILEFISH-BOUNDARY-R82-20261013-S04` on `ingredient-ref-grouper-market-group` for a separate Black Grouper fillet row. R772 uses the directly reviewed 2026-04-17 PDF instead of reusing that URL or repurposing its source ID. The new sources are proposal-local until integration.

## Current picker projection

The projection uses the current `IngredientReferenceSearchIndex` behavior: normalized exact form phrases are matched first, followed by full-word-phrase matching and then substring fallback. Adding the two labels as form terms produces these results at the reference level:

| Query | Before | With proposed form | Effect |
|---|---|---|---|
| `bluefish` | Bluefish only | Bluefish only | No change. |
| `tassergal` | Bluefish only | Bluefish only | No change. |
| `whole bluefish` | No result | Bluefish only | Adds the intended qualified form phrase and form hint. |
| `tassergal entier` | No result | Bluefish only | Adds the intended qualified French phrase and form hint. |
| `whole fish` | Whole Tilapia only | Whole Tilapia only | No change to the existing broad phrase. |
| `poisson entier` | Whole Tilapia only | Whole Tilapia only | No change to the existing broad phrase. |
| `whole` | 54 references | 55 references | Adds Bluefish to this generic fragment query because the qualified label contains `whole`. |
| `blue` / `fish` | 8 / 18 references | 8 / 18 references | No change; the existing Bluefish reference already matches these partial queries. |

No standalone `whole` or `fish` match term is added. The broad `whole` fragment gains one result as an expected consequence of the displayed form; the broader complete phrases remain unchanged.

## Manifest recipe-corpus audit

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**. It searched decoded full recipe JSON and ingredient-row values for `bluefish`, `blue fish`, `tassergal`, `Pomatomus saltatrix`, `Pomatomidae`, `whole bluefish`, and `tassergal entier`. It found **zero matching files and zero matching ingredient rows**. The bundled corpus therefore supplies no bluefish recipe context, amount, form link, or substitution. No recipe link is proposed.

## Measurement, yield, and substitution limits

- Supermarché PA's approximate 550 g package is specific to that retailer's product listing, not a standard whole-bluefish size or kitchen measure.
- La Mer's 50% yield value is shown in a supplier arrival table without a defined edible-yield or recipe basis. Do not encode it as a reusable yield. Its kilogram sales unit is not a kitchen measure.
- The form describes whole presentation only. Do not infer fresh or frozen state, head or gut state, scaling, skin, bones, or a cleaned/dressed condition from these sources.
- No source in this review supports a bluefish density, unit mapping, conversion, serving amount, recipe link, or safe substitution. Keep `densityGPerMl` null and add no mapping or substitution rule.

## Recommendation

Add only `ingredient-form-bluefish-whole-fish` as a `whole_fish` presentation with the labels above. Keep `ingredient-ref-bluefish` as the existing alias-free identity for *P. saltatrix*. Do not add a fresh/frozen, fillet, cooked, smoked, salted, cleaned, or dressed form; a measure or yield; a recipe link; or a substitution.

No software tests, build, emulator, or deployment were run for this proposal-only data review.
