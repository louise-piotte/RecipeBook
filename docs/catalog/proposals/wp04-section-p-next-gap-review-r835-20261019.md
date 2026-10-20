# WP04 Section P R835 — American lobster CNF 2015 boiled/steamed portions

- **Review date:** 2026-10-19.
- **Candidate:** Historical published portions for the existing **ingredient-ref-lobster** identity, `American lobster / homard d’Amérique` (*Homarus americanus*).
- **Recommendation:** Accept four source-specific **portion_weight** observations from Health Canada’s CNF 2015 Food Code 3210. The row is explicitly boiled or steamed American (northern) lobster. Keep all four measures ledger-only.
- **Scope:** Record the listed CNF values as edible portions for the named food-code row. The CNF page separately reports total refuse 78%; do not convert that field into shell-on mass, an edible yield, or a mass of whole lobster. The CNF 2026 Food Code / measure relationship was not inspected.
- **Write scope:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, generated file, or database JSON changed. If accepted, the data change would be limited to research-ledger JSON; `AGENTS.md` says database-JSON-only changes need no software tests.

## Open item and prior-work boundary

Section P remains open, and the American-lobster ledger row still has `measurementState: not_yet_researched`. This review is separate from the completed American-lobster identity, European-lobster identity, lobster-claw product, and lobster-meat product decisions. It adds no identity, alias, form, recipe link, conversion, yield, or substitution.

No Food Code 3210 or exact CNF 2015 serving-page URL is currently owned in the research ledger. The proposal does not revisit R832’s raw mixed-species cuttlefish Food Code 3114, R829’s raw blue crab Food Code 3096, or any earlier completed lobster work. The latest R830–R832 batch is recorded in the [integration README](../batches/wp02-wp03-wp04-r830-r832-gap-review-integration-20261019/README.md).

## Source scope and exact values

Health Canada’s [CNF 2015 serving-size page, Food Code 3210](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3210) names the item **“Crustaceans, lobster, american (northern), boiled or steamed”** / **“Crustacés, homard, d'amérique, à vapeur ou bouilli.”** It lists:

| CNF 2015 serving description | Published mass | Proposed treatment |
|---|---:|---|
| 100 mL diced | 61.3 g | One code-specific volume portion |
| 250 mL | 153.2 g | One code-specific volume portion |
| 1 food guide serving | 75.0 g | One code-specific food-guide portion |
| 125 mL | 76.6 g | One code-specific volume portion |

The same page lists **Refuse: total refuse 78%**. The [CNF 2015 Users’ Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) explains that conversion weights are generic weights for the portions described and are weights of edible material without refuse. The 78% field is separate source context. Do not reconcile it with the listed edible portions, derive a 22% edible share or any shell-on mass, or claim that the portions represent a lobster as purchased. The page states no dicing size, packing convention, meat-extraction method, or weighing protocol.

The [OQLF GDT entry for homard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198631/homard) and its [homard d’Amérique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573556/homard-damerique) support the existing Québec species boundary and the *Homarus americanus* identity. These entries support identity only; the CNF page itself supplies the product state and portions.

Health Canada’s [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as relational CSV files and the CNF 2015 viewer remains available as an interim access route. The CNF 2026 files were not inspected for Food Code 3210 in this review; no continuity, row-presence, or row-absence claim is made.

## Exact proposed ledger delta

Add these source entries to `ingredient-ref-lobster`. The CNF 2015 serving-page URL has no ledger owner. The Users’ Guide and overview URLs already have owners under other WP04 source IDs; these new IDs keep each row’s source statements scoped to this review while preserving an unambiguous ID-to-URL mapping.

~~~json
[
  {
    "sourceId": "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3210",
    "title": "Health Canada, Canadian Nutrient File 2015 serving size, Food Code 3210",
    "versionOrDate": "CNF 2015; page details modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "Bilingual food names; Food Code 3210; 100 mL diced = 61.3 g; 250 mL = 153.2 g; 1 food guide serving = 75 g = 75.0 g; 125 mL = 76.6 g; Refuse: total refuse 78%.",
    "supports": "The CNF 2015 page names boiled or steamed American (northern) lobster and lists four published portions. It separately reports total refuse 78%. It states no dicing size, packing convention, meat-extraction method, weighing procedure, or as-purchased whole-lobster mass; this is not a CNF 2026 row check.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S02",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html",
    "title": "Health Canada, Canadian Nutrient File — Users Guide",
    "versionOrDate": "2015",
    "accessedOn": "2026-10-19",
    "locator": "Section C, Conversion factor file, portion size conversion factors.",
    "supports": "Explains that CNF conversion weights are generic weights for described portions and are weights of edible material without refuse. It does not describe this lobster row’s meat-extraction, dicing, or packing method, or establish an as-purchased lobster weight.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S03",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html",
    "title": "Health Canada, Canadian Nutrient File overview",
    "versionOrDate": "Page details 2026-06-19",
    "accessedOn": "2026-10-19",
    "locator": "Data publication and access statement for CNF 2026 and the interim CNF 2015 online viewer.",
    "supports": "States that CNF 2026 is available as relational CSV files and the CNF 2015 online viewer remains available as an interim route. It does not verify Food Code 3210 in CNF 2026.",
    "sourceKind": "food_composition"
  }
]
~~~

Append these four `measurementObservations` to the same record:

~~~json
[
  {
    "observationId": "american-lobster-boiled-steamed-cnf2015-100ml-diced-r835-20261019",
    "relationship": "portion_weight",
    "value": 61.3,
    "valueUnit": "g",
    "foodDescription": "Crustaceans, lobster, american (northern), boiled or steamed / Crustacés, homard, d'amérique, à vapeur ou bouilli (CNF 2015 Food Code 3210).",
    "foodState": "Boiled or steamed American (northern) lobster as named by CNF 2015 Food Code 3210. The source does not state meat-extraction method or the dicing and packing convention.",
    "measurementMethod": "The CNF 2015 serving-size page lists 100 mL diced = 61.3 g. It gives no dicing size, packing, or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3210. The CNF 2015 Users’ Guide describes portion weights as generic weights for the described edible portions without refuse. Do not apply this value to whole/as-purchased lobster or use it as an identity-wide volume conversion; do not infer shell-on mass or yield from the separate 78% refuse field.",
    "sourceQuantity": {"amount": 100, "unit": "mL diced"},
    "observedMassG": 61.3,
    "observedVolumeMl": 100,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S01",
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S02"
    ]
  },
  {
    "observationId": "american-lobster-boiled-steamed-cnf2015-250ml-r835-20261019",
    "relationship": "portion_weight",
    "value": 153.2,
    "valueUnit": "g",
    "foodDescription": "Crustaceans, lobster, american (northern), boiled or steamed / Crustacés, homard, d'amérique, à vapeur ou bouilli (CNF 2015 Food Code 3210).",
    "foodState": "Boiled or steamed American (northern) lobster as named by CNF 2015 Food Code 3210. The source does not state the cut, meat-extraction method, or volume-packing convention.",
    "measurementMethod": "The CNF 2015 serving-size page lists 250 mL = 153.2 g. It gives no packing or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3210. The CNF 2015 Users’ Guide describes portion weights as generic weights for the described edible portions without refuse. Do not apply this value to whole/as-purchased lobster or use it as an identity-wide volume conversion; do not infer shell-on mass or yield from the separate 78% refuse field.",
    "sourceQuantity": {"amount": 250, "unit": "mL"},
    "observedMassG": 153.2,
    "observedVolumeMl": 250,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S01",
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S02"
    ]
  },
  {
    "observationId": "american-lobster-boiled-steamed-cnf2015-one-food-guide-serving-r835-20261019",
    "relationship": "portion_weight",
    "value": 75.0,
    "valueUnit": "g",
    "foodDescription": "Crustaceans, lobster, american (northern), boiled or steamed / Crustacés, homard, d'amérique, à vapeur ou bouilli (CNF 2015 Food Code 3210).",
    "foodState": "Boiled or steamed American (northern) lobster as named by CNF 2015 Food Code 3210. The source does not state meat-extraction method or any serving-preparation procedure.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 75 g = 75.0 g.",
    "quantityBasis": "One source-specific published food-guide portion for CNF 2015 Food Code 3210. Do not treat it as a recipe recommendation, whole/as-purchased mass, cooking yield, or reusable count conversion; do not infer yield from the separate 78% refuse field.",
    "sourceQuantity": {"amount": 1, "unit": "food guide serving"},
    "observedMassG": 75.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S01",
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S02"
    ]
  },
  {
    "observationId": "american-lobster-boiled-steamed-cnf2015-125ml-r835-20261019",
    "relationship": "portion_weight",
    "value": 76.6,
    "valueUnit": "g",
    "foodDescription": "Crustaceans, lobster, american (northern), boiled or steamed / Crustacés, homard, d'amérique, à vapeur ou bouilli (CNF 2015 Food Code 3210).",
    "foodState": "Boiled or steamed American (northern) lobster as named by CNF 2015 Food Code 3210. The source does not state the cut or volume-packing convention.",
    "measurementMethod": "The CNF 2015 serving-size page lists 125 mL = 76.6 g. It gives no packing or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3210. The CNF 2015 Users’ Guide describes portion weights as generic weights for the described edible portions without refuse. Do not apply this value to whole/as-purchased lobster or use it as an identity-wide volume conversion; do not infer shell-on mass or yield from the separate 78% refuse field.",
    "sourceQuantity": {"amount": 125, "unit": "mL"},
    "observedMassG": 76.6,
    "observedVolumeMl": 125,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S01",
      "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S02"
    ]
  }
]
~~~

Add one accepted measurement decision citing S01–S03 and set only `measurementState` to `researched_supported`:

~~~json
{
  "outcome": "accepted",
  "reason": "Record the four historical CNF 2015 Food Code 3210 portions for boiled or steamed American (northern) lobster: 100 mL diced = 61.3 g; 250 mL = 153.2 g; 1 food guide serving = 75.0 g; and 125 mL = 76.6 g. Keep each value attached to this described row as a generic edible portion without refuse. The separately reported total refuse 78% is not a yield and must not be reconciled with or used to derive a whole/as-purchased weight. CNF 2026 Food Code 3210 was not inspected; do not infer a cooking method beyond the food-code name, a cut, shell state, meat-extraction or packing method, density, recipe measure, or active conversion.",
  "sourceIds": [
    "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S01",
    "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S02",
    "WP04-SECTIONP-LOBSTER-CNF-PORTIONS-R835-20261019-S03"
  ]
}
~~~

Keep `identityState` and `substitutionResearchState` unchanged. Keep the active reference and forms unchanged: no density, unit mapping, active measurement conversion, form, recipe link, package yield, alias, or substitution rule is proposed.

## Ownership and recipe/search audit

- The new CNF Food Code 3210 page URL and proposed source ID and four observation IDs have no current ledger collision. The CNF Users’ Guide and CNF overview URLs already occur under other source IDs. These proposed IDs each map to the exact official URL shown above; no source ID is repointed. No `3210` CNF source page or row entry is present in the live ledger or current plan.
- The active **ingredient-ref-lobster** remains the American-lobster row with null density and no unit mappings. The separate `ingredient-ref-european-lobster`, `ingredient-ref-lobster-claws`, and `ingredient-ref-lobster-meat` rows remain distinct. The only current lobster form is cooked frozen meat under `ingredient-ref-lobster-meat`; there is no boiled/steamed whole-lobster form under the target identity.
- A static reproduction of the current phrase-first search projection showed `lobster` and `homard` returning American lobster, European lobster, lobster claws, and lobster meat; `American lobster` and `homard d’Amérique` return the American-lobster row; `lobster meat` and `lobster claws` remain owned by their distinct product identities. The proposal adds no search terms, so these results remain unchanged.
- Parsed all **114** manifest recipe files and **1,123** structured ingredient rows. There are no lobster or homard mentions. No recipe link or recipe-specific quantity is justified.
- No form, density, unit mapping, active conversion, package yield, or lobster-specific substitution rule is added by this review. The research concern is the bounded historical CNF portion evidence only.

## Static review and limits

- Re-read `AGENTS.md`, the plan’s Section P checklist and lobster decisions, `roadmap.md`, the current workflow, and the R830–R832 integration README before selecting this item.
- Verified the Health Canada [CNF 2015 Food Code 3210 serving page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3210), the [CNF 2015 Users’ Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), the [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), and OQLF’s [homard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198631/homard) and [homard d’Amérique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573556/homard-damerique) entries. The CNF 2026 Food Code 3210 row was not accessed; no current-edition claim is made.
- Audited target identity, existing forms, source URL/ID ownership, observation-ID ownership, current broad and qualified picker ownership, and the full recipe bundle. Search results are static projections from the current data and search implementation; no app tests were run.
- This file is proposal-only. No software tests, app build, emulator run, deployment, or shared-file validation was performed. Any later integration that only adds database JSON does not require tests under `AGENTS.md`.
