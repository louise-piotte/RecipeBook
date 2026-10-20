# WP03 Section J spring-onion / pearl-onion boundary review — 2026-10-11

## Scope and recommendation

This review covers only the remaining spring-onion / pearl-onion boundary. It does not redo the completed green-onion alias review in [`wp03-j-green-onions-scallions-review-20261011.md`](wp03-j-green-onions-scallions-review-20261011.md).

**Recommend one new identity-only reference for raw pearl onions / oignon perlé. Do not add a separate spring-onion identity, do not add an onion form, and do not link or relabel any bundled recipe row.** The OQLF defines the relevant small-onion class as *Allium cepa*, gives *oignon perlé* and *oignon à mariner* as context-specific French terms, and identifies English *pearl onion* and *pickling onion*. A current Metro Québec-market listing sells fresh red pearl onions as a distinct small-bulb product, while Québec recipes use peeled pearl onions whole or in pieces. This evidence supports a useful ingredient identity; it does not establish a generic count, volume-to-mass conversion, density, yield, or substitution.

Keep the term *pickling onion* scoped to the raw small onion. Keep *pickled onion* / *oignon mariné* as a separate preserved-product candidate, and keep *cocktail onion* out of the raw identity aliases because current Canadian retail use names a prepared, pickled product that way.

## Snapshot and exact-owner audit

The audit read the live package on 2026-10-11: 1,008 active ingredient references, 66 forms, 114 manifest-listed recipe files with 1,123 ingredient rows, 1,289 ledger records, and 75 legacy-import candidates. Exact phrase ownership was checked with the project `normalize_search_key` routine against active reference names and aliases, form labels and match terms, and legacy candidate names and aliases.

| Query / record | Current owner or result | Boundary |
|---|---|---|
| `onion`, `oignon` | `ingredient-ref-onion` | Generic onion remains the broad parent identity. Its only current alias is French `gros oignon`; it has null density and no unit mappings. |
| `green onion`, `oignon vert` | `ingredient-ref-green-onions` | Existing active identity; its current alias set contains `scallions`. Its completed review is out of scope here. No spring-onion owner or separate row was found. |
| `yellow onion`, `white onion`, `red onion`, `sweet onion`, `Spanish onion` and French display terms | Their existing named references | These named onion identities remain unchanged. None exactly owns a pearl-onion query. |
| `pearl onion(s)`, `oignon perle`, `oignon perlé`, `oignons perlés`, `pickling onion(s)`, `oignon(s) à mariner` | No exact active reference, form, or legacy candidate owner | A new `ingredient-ref-pearl-onion` ID is available. |
| `spring onion(s)`, `oignon nouveau(x)` | No exact active reference, form, or legacy candidate owner | Do not create a second identity; OQLF lists English *spring onion* under its existing *oignon vert* entry. The alias decision stays with the completed green-onion review. |
| `pickled onion(s)`, `oignon au vinaigre`, `oignon mariné` | No active reference; existing ledger record `candidate-pickled-onions` is `needs_clarification` | Keep as the preserved product boundary. That candidate already records OQLF evidence distinguishing raw pickling onions from the finished preserved food. |
| `cocktail onion(s)` | No exact active owner | Keep out of raw aliases: Metro's current Canadian grocery listing explicitly sells *Pickled Sour Cocktail Onions* in its pickles/antipasto aisle. |

There is no active `ingredient-ref-pearl-onion` or `ingredient-ref-spring-onion`, and no relevant legacy candidate. No current form label or match term names any of these products. Existing generic onion count observations are not transferable to a very small onion. The package's global and contextual substitution-rule arrays are both empty; the ledger has no onion unit conversion.

## Terminology and product boundary

OQLF's 2002 *petit oignon* entry defines a very small *Allium cepa* onion picked before maturity, when the bulb is barely formed. Its preferred French terms are *petit oignon* and *petit oignon blanc*. In some contexts, it lists *oignon à mariner*, *oignon perle*, and *oignon perlé*, explaining that the first two refer more specifically to small onions used to make marinades and that *oignon perlé* is an acceptable calque. Its English entry gives *pickling onion* and lists *pearl onion* and *cocktail onion* as associated terms for small onions used in marinades. [S01]

OQLF separately defines a *pickled onion* (*oignon au vinaigre* / *oignon mariné*) as a small onion macerated in a vinegar solution with salt, sugar, and flavourings. That is a prepared ingredient, not a raw-onion synonym. [S02] Metro's product listing reinforces the distinction: the fresh produce section lists *Oignons perlés rouges* (284 g; ingredient listed as *Oignon perlé rouge*) and describes them for marinades, stews, roasting, or sautéing. In a different pantry aisle, Metro sells *Pickled Sour Cocktail Onions* in a 375 mL vinegar product. The latter is why *cocktail onion* is not proposed as a raw pearl-onion alias despite OQLF's associated-term entry. [S04, S08]

CFIA's Canadian onion grade standard applies to onion varieties of *Allium cepa* and defines a Canada No. 1 Pickling grade with 13–25 mm bulbs, with a larger packaged size range also permitted. This is evidence that small pickling onions are a recognized fresh-onion class; it is not proof that every retail pearl onion is that grade, a particular cultivar, or harvested at the same maturity. Do not store the grade diameters as a universal pearl-onion size range. [S03]

Use **pearl onion / oignon perlé** as the new identity's display. The product boundary is the raw, small-bulb onion marketed as a pearl onion. Do not infer one colour, cultivar, package, harvest method, or preservation state. Do not add broad `small onion` / `petit oignon` aliases: those are broader source headwords and would widen matching beyond the marketed pearl-onion product. Do not add `cocktail onion`, `pickled onion`, or `oignon mariné` to this row.

## Recipe and measurement audit

The complete bundled recipe scan found **zero** ingredient-row hits and **zero** whole-recipe text hits for pearl onion, pickling onion, cocktail onion, spring onion, *oignon perle/perlé*, *oignon à mariner*, *petit oignon*, or *oignon nouveau*. No recipe links should change. The external Québec examples below show that this is a useful catalog product name, but they are not bundled recipe demand:

| External Québec example | Published quantity and use | What it supports |
|---|---|---|
| Metro, *Saumon poché aux petits légumes* | 175 g mixed pearl onions, peeled; added whole to the poaching vegetables. [S05] | A named raw pearl-onion recipe ingredient. This recipe amount is not a general portion conversion. |
| IGA, *Trempette chaude aux fèves au lard* | 250 mL pearl onions, peeled and quartered. [S06] | A second local recipe use; the recipe does not publish a corresponding mass. |

The 284 g Metro retail package is package net weight only. CFIA's size criteria are diameters, not count or mass. Neither these package/recipe quantities nor the generic onion CNF portions supports a pearl-onion density, count-to-weight mapping, volume mapping, edible-yield factor, or cooking yield. Record no active measurement observation for pearl onion; set `measurementState` to `researched_no_supported_value` if this identity is integrated. Leave `defaultDensity` null and `unitMappings` empty. No form is warranted: the raw small-bulb market class is the ingredient identity, while peeled, quartered, roasted, or pickled states are recipe preparation or separate preserved-product concerns.

No bundled pearl-onion recipe role exists to evaluate a substitution against. Do not copy the generic onion size observations, or add a pearl-to-yellow/white-onion substitution, density, yield, or conversion. Keep substitution research `not_yet_researched` until recipe demand makes a scoped review useful.

## Proposed exact data changes

Add this row to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` if accepted. It intentionally has no recipe links, forms, measurements, conversions, yields, or substitution rules.

```json
{
  "id": "ingredient-ref-pearl-onion",
  "nameFr": "oignon perl\u00e9",
  "nameEn": "pearl onion",
  "aliasesFr": ["oignon perle", "oignons perl\u00e9s", "oignon \u00e0 mariner", "oignons \u00e0 mariner"],
  "aliasesEn": ["pearl onions", "pickling onion", "pickling onions"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Add this record to `docs/catalog/research-ledger.v1.json`. The source IDs below are unique to this review; the existing `candidate-pickled-onions` record needs no edit.

```json
{
  "recordId": "ingredient-ref-pearl-onion",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870618/petit-oignon",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, petit oignon (GDT)",
      "accessedOn": "2026-10-11",
      "locator": "Definition, French terms used in certain contexts, English terms, and Latin name.",
      "supports": "Defines the very small onion as Allium cepa and lists oignon perle, oignon perl\u00e9, pearl onion, and pickling onion in context; distinguishes the raw ingredient from the preserved food.",
      "sourceKind": "regional_authority",
      "versionOrDate": "2002"
    },
    {
      "sourceId": "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/21799246/oignon-au-vinaigre",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, oignon au vinaigre (GDT)",
      "accessedOn": "2026-10-11",
      "locator": "Definition and preferred terms.",
      "supports": "Defines the vinegar-preserved product and gives oignon au vinaigre and oignon marin\u00e9, distinct from raw pearl/pickling onions.",
      "sourceKind": "regional_authority",
      "versionOrDate": "2016"
    },
    {
      "sourceId": "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S03",
      "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-2",
      "title": "Canadian Food Inspection Agency, Canadian Grade Compendium: Volume 2 - Fresh Fruit or Vegetables",
      "accessedOn": "2026-10-11",
      "locator": "Part 2, Grades and Requirements for Onions, ss. 161–165.",
      "supports": "Applies onion grading to Allium cepa varieties and specifies Canada No. 1 Pickling size ranges; does not establish a universal pearl-onion cultivar, size, count, or mass.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S04",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/oignons-et-poireaux/oignons-perles-rouges/p/033383603513",
      "title": "Metro, Oignons perl\u00e9s rouges",
      "accessedOn": "2026-10-11",
      "locator": "Fresh-produce category, 284 g product label, ingredient statement, and product description.",
      "supports": "Current Canadian retail example of a distinct fresh pearl-onion product; package weight is not a count conversion or yield.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S05",
      "url": "https://www.metro.ca/recettes-et-occasions/recettes/saumon-poche-aux-petits-legumes",
      "title": "Metro, Saumon poch\u00e9 aux petits l\u00e9gumes",
      "accessedOn": "2026-10-11",
      "locator": "Ingredient line and method.",
      "supports": "Uses 175 g mixed peeled pearl onions in one recipe; does not establish a general measure or conversion.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S06",
      "url": "https://www.iga.ca/fr/recettes/trempette_de_feves_au_lard_et_creme_fraiche_croustilles_epicees_de_pain_pita",
      "title": "IGA, Trempette chaude aux f\u00e8ves au lard et cr\u00e8me fra\u00eeche",
      "accessedOn": "2026-10-11",
      "locator": "Ingredient line for peeled and quartered pearl onions.",
      "supports": "Uses 250 mL pearl onions in one Québec recipe; no matching mass is given.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S07",
      "url": "https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/pickles-antipasto/pickled-sour-cocktail-onions/p/059000004594",
      "title": "Metro, Bick's Pickled Sour Cocktail Onions",
      "accessedOn": "2026-10-11",
      "locator": "Pantry / pickles and antipasto aisle, product name, 375 mL package, and ingredient list.",
      "supports": "Shows Canadian retail use of cocktail onions for a prepared vinegar-preserved product; supports excluding cocktail onion from the raw identity aliases.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept a separate raw pearl-onion identity, pearl onion / oignon perl\u00e9, for the named small-bulb product class. Keep it distinct from generic onion for retrieval and recipe specificity; do not infer cultivar, colour, maturity method, or a form conversion. Add only the specific raw terms listed in the proposed reference row.",
      "sourceIds": [
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S01",
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S03",
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S04"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Keep cocktail onion, pickled onion, and oignon marin\u00e9 outside the raw identity. Cocktail onion is used by a current retailer for a pickled product; OQLF separately defines the preserved onion. Leave the existing candidate-pickled-onions ledger record in its current needs_clarification state.",
      "sourceIds": [
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S02",
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S07"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "No general pearl-onion density, count-to-mass or volume-to-mass mapping, edible yield, cooking yield, or substitution is supported. External recipe and retail package quantities remain source-specific and are not bundled recipe demand.",
      "sourceIds": [
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S03",
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S04",
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S05",
        "WP03-J-PEARL-SPRING-BOUNDARY-20261011-S06"
      ]
    }
  ]
}
```

No updates are proposed for the green-onion row, generic onion aliases, any bundled recipe row, the legacy file, the plan, or the roadmap. The new identity should be integrated only as an identity reference and ledger entry if accepted.

## Remaining gaps

- The bundled library currently has no pearl-onion or spring-onion recipe line; defer recipe links and user-facing measurements until that demand appears.
- OQLF's entry is dated 2002. The current Metro example confirms a marketed red pearl-onion product but does not establish that every supplier's product uses one cultivar, harvest stage, or commercial grade.
- The `candidate-pickled-onions` record remains unresolved and separate. Future recipe evidence should determine whether the prepared product needs its own active identity.
- The spring-onion alias question remains with the completed green-onion review; this document proposes no change to its active row.
