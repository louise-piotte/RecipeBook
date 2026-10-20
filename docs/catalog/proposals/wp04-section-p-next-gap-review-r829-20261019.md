# WP04 Section P R829 — raw blue-crab CNF 2015 portion evidence

- **Review date:** 2026-10-19.
- **Candidate:** One source-specific portion observation for the existing **ingredient-ref-blue-crab** (*Callinectes sapidus*) identity.
- **Recommendation:** Accept one historical **published_portion / count_weight** observation from Health Canada’s CNF 2015 Food Code 3096. Record the page’s reported **1 crab (150 g) = 23.1 g** as one edible-portion observation and preserve its separately reported **total refuse 86%** as source context. Do not reconcile or derive one value from the other.
- **Write scope:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, or generated file was changed. If accepted, the proposed catalog/ledger integration would add database JSON data only; the project’s AGENTS.md rule says no software tests are needed for that change.

## Open Section P work and prior-work boundary

The live plan keeps **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below”** open at [line 8172](../../RecipeBook-global-ingredient-catalog-plan.txt#L8190). R829 fills a measurement-evidence gap on an already active crustacean identity. It does not add a new species, recipe link, form, or conversion.

Prior blue-crab decisions remain separate:

- R5 established the identity-only **blue crab / crabe bleu** row for *Callinectes sapidus*.
- R78 held an unqualified soft-shell-crab form because its terms would make broad searches misleading.
- R745 held a supplier-specific live-blue-crab form; the supplier’s “live” offer is not a general form or CNF raw-state equivalence.
- R814 recorded Clover Leaf canned-crab label portions on the species-unspecified **ingredient-ref-crab** meat identity. Its product and packing evidence does not describe a whole raw blue crab.

R811’s cockle hold, R817’s Eastern-oyster portions, R820’s raw mixed-species squid observation, R823’s raw blue-mussel portions, and R826’s raw mixed-species scallop portions concern other identities or boundaries. R829 adds only one Food Code 3096 observation to the existing blue-crab record.

## Existing identity, labels, and terminology evidence

| Item | Current evidence and scope | R829 handling |
|---|---|---|
| Active reference | **ingredient-ref-blue-crab** is **PROTEIN**, displayed as **blue crab / crabe bleu**; both alias arrays are empty, density is null, and unit mappings are empty. | Preserve the row, labels, aliases, category, density, and mappings unchanged. |
| Québec French and English identity | OQLF’s [GDT entry for crabe bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu) pairs preferred Québec **crabe bleu**, English **blue crab**, and *Callinectes sapidus*. The page is dated last updated 1998: it supports terminology and taxonomic scope, not current local inventory. | Reuse the existing ledger-owned OQLF source; add no identity source or alias. |
| Current Canadian name boundary | CFIA’s [Fish List crab results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) show *C. sapidus* with separate **Blue Crab / Crabe** and **Crab / Crabe Bleu** rows, as well as other taxa under broad **Crab / Crabe**. The list separately assigns **Blue Swimming Crab / étrille bleue** to *Portunus pelagicus*. | Keep OQLF’s preferred bilingual display and the empty aliases. Do not use CFIA’s broad **Crabe** row or add **blue swimming crab** to this identity. |
| Recent Canadian species cross-check | Fisheries and Oceans Canada’s [2025 eastern-Canada crab identification guide](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-12-2025-fra.pdf) labels *Callinectes sapidus* **Crabe bleu**. Its map and “species to watch” context concern observations/distribution, not a stable Québec commercial fishery. | Reuse the existing ledger source. Do not infer Québec availability, product form, or substitution. |
| CNF descriptor | CNF 2015 Food Code 3096 displays **“Crustaceans, crab, blue, raw”** / **“Crustacés, crabe, bleu, cru”**. This CNF entry supplies no binomial. | Treat the CNF food-name pair as the source’s row description, not a new canonical label, alias, or independent taxonomic proof. The existing OQLF/CFIA/DFO evidence supplies the identity crosswalk. |

## Food Code 3096 portion and evidence limits

Health Canada’s [CNF 2015 serving-size page, Food Code 3096](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3096) displays:

| Exact page text | R829 interpretation |
|---|---|
| **1 crab (150 g) = 23.1 g** | One Food Code 3096 count-portion observation, stored as **1 crab (150 g)** → **23.1 g**. |
| **Refuse: total refuse 86 %** | Preserve as separately reported page context. Do not use it to derive, correct, or reconcile the 23.1 g portion. |
| **100 grams of edible portion = 100 grams** | CNF’s edible-portion baseline, not an additional household measure. |
| **1 food guide serving = 90g = 90.0 g** | A guide serving, not a crab count or recipe measure; do not add it as an observation. |

Health Canada’s [2015 CNF Users’ Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) explains that conversion-factor weights are generic weights for described portions and that the weights are for edible material without refuse. This supports treating the page’s 23.1 g as its published edible portion. It does not define the crab’s size, a weighing procedure, live status, cooking readiness, crab-meat-only scope, or roe inclusion. The page and guide do not explain the relationship among the parenthetical 150 g descriptor, the 23.1 g count portion, and the separate 86% refuse figure; no arithmetic or yield is proposed.

Health Canada’s [current Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), dated 2026-06-19, states that CNF 2026 is published as relational CSV files and that the CNF 2015 online viewer remains accessible as an interim measure while a more user-friendly CNF 2026 access route is developed. R829 records only the observed 2015 row. **It does not claim Food Code 3096 or its portion persists in CNF 2026**; the current 2026 row-level measure was not verified in this review.

## Forms, active numbers, and substitutions

- **Forms and raw/cooked state:** There are no forms on **ingredient-ref-blue-crab**. **Raw** is the CNF 2015 Food Code 3096 description only; do not add a raw or live form. The source does not establish cooked, shell-free, meat-only, or roe state.
- **Density and unit mapping:** Keep **defaultDensity: null** and **unitMappings: []**. A one-page, food-code-specific crab portion does not establish a reusable count-to-mass mapping or a meaningful mass-volume density.
- **Recipe demand:** The manifest corpus has no blue-crab, *C. sapidus*, or **crabe bleu** ingredient row or text hit. Recipe 019 asks for 1 lb of Jumbo Lump crab meat linked to **ingredient-ref-crab / ingredient-form-crab-jumbo-lump**; this is species-unspecified crab meat, not blue crab. Do not relink it.
- **Substitution:** No global or contextual rule references **ingredient-ref-blue-crab**, and no current recipe line supplies a species-specific substitution context. CNF portion data is not substitution evidence. Keep **substitutionResearchState: not_yet_researched** unchanged and add no substitution finding or rule.

## Ownership and picker projection

The current reference/form ownership audit found only **ingredient-ref-blue-crab** as the exact active owner of **blue crab** and **crabe bleu**. *Callinectes sapidus* is not an indexed alias. The adjacent blue-swimming-crab name remains a distinct, unresolved candidate; prior reviews do not assign that name to this row. The exact CNF Food Code 3096 URL has no existing ledger owner. The CNF 2015 Users’ Guide URL is already cited by eight other records, and the current CNF overview URL by 25; R829 therefore proposes record-specific source IDs for both. All proposed source and observation IDs below were checked for existing ID collisions.

The current IngredientSearch.kt projection gives phrase-first word-phrase matching, including a query phrase contained within a longer indexed term, before falling back to substring matching. The static projection over active references and forms is:

| Query | Current result count | Example / boundary |
|---|---:|---|
| **blue crab**; **crabe bleu** | 1 each | Existing **ingredient-ref-blue-crab**. |
| **crab** | 14 | Multiple crab and crab-product rows; the one-word query also matches the **crab** subphrase in **blue crab**. |
| **crabe** | 13 | Multiple crab and crab-product rows; this subphrase also matches **crabe bleu**. |
| **blue**; **bleu** | 8; 6 | Both remain multi-result broad searches. |
| **crab meat** | 2 | Generic crab meat and imitation crab results. |
| **blue crab meat** | 0 | No meat product is assigned to the species. |

The recommended change is ledger-only, so it introduces no indexed term and every result count above stays the same. In particular, it does not make the broad **crab / crabe** subphrase appear resolved to one species.

## Exact proposed ledger delta

Append these three sources to the existing **ingredient-ref-blue-crab** ledger record. S01’s exact serving-page URL has no current ledger owner. S02 and S03 use new record-specific source IDs because their URLs are already shared by other ledger records. Reuse the existing OQLF, CFIA, and DFO identity sources; do not append duplicate identity entries.

~~~json
[
  {
    "sourceId": "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3096",
    "title": "Health Canada, Canadian Nutrient File 2015 serving size, Food Code 3096",
    "versionOrDate": "CNF 2015; page details modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "Bilingual row names; Food Code 3096; 1 crab (150 g) = 23.1 g; Refuse: total refuse 86 %; 100 g edible-portion baseline; 90 g food-guide serving.",
    "supports": "Publishes one count portion for the raw blue-crab row in CNF 2015 Food Code 3096 and separately reports total refuse 86%. The page provides no binomial, weighing protocol, or explanation reconciling the portion, parenthetical 150 g, and refuse fields.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S02",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html",
    "title": "Health Canada, Canadian Nutrient File — Users Guide",
    "versionOrDate": "2015",
    "accessedOn": "2026-10-19",
    "locator": "Section C, Conversion factor file, portion size conversion factors.",
    "supports": "Explains that CNF portion weights are generic weights for described portions and are weights of edible material without refuse. It does not resolve the source page’s crab size or the relationship among its 150 g, 23.1 g, and refuse fields, and it is not a CNF 2026 row check.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S03",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html",
    "title": "Health Canada, Canadian Nutrient File overview",
    "versionOrDate": "Page details 2026-06-19",
    "accessedOn": "2026-10-19",
    "locator": "Data publication and access statement for CNF 2026 and the interim CNF 2015 online viewer.",
    "supports": "States that CNF 2026 is available as relational CSV files and that the CNF 2015 online viewer remains accessible as an interim access route. Supports the version limitation only; this source does not verify the Food Code 3096 row in CNF 2026.",
    "sourceKind": "food_composition"
  }
]
~~~

Append one observation:

~~~json
{
  "observationId": "blue-crab-raw-cnf2015-one-crab-r829-20261019",
  "relationship": "count_weight",
  "value": 23.1,
  "valueUnit": "g",
  "foodDescription": "Crustaceans, crab, blue, raw / Crustacés, crabe, bleu, cru (CNF 2015 Food Code 3096).",
  "foodState": "Raw blue crab as named by CNF 2015 Food Code 3096. The source does not state live status, cooked state, crab-meat-only scope, or roe inclusion.",
  "measurementMethod": "The CNF 2015 serving-size page states 1 crab (150 g) = 23.1 g; it reports Refuse: total refuse 86 % separately and provides no weighing protocol.",
  "quantityBasis": "One source-specific published edible portion for CNF 2015 Food Code 3096. The CNF 2015 Users’ Guide says described portion weights are generic and represent edible material without refuse. Keep 23.1 g attached only to this page’s one-crab portion; do not reconcile it with or derive from the parenthetical 150 g or the separate 86% refuse field, infer a yield, or create a reusable count conversion.",
  "sourceQuantity": { "amount": 1, "unit": "crab (150 g)" },
  "observedMassG": 23.1,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S01",
    "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S02"
  ]
}
~~~

Set only this ledger record’s **measurementState** to **researched_supported**. Append one **accepted** measurement decision citing S01–S03 and stating that the single observation is historical CNF 2015 raw-blue-crab Food Code 3096 evidence; CNF 2026 row-level contents remain unverified. Preserve the source’s separate 86% refuse statement without calculation or reconciliation. Keep **identityState**, **substitutionResearchState**, active reference fields, forms, recipes, package yields, conversions, densities, unit mappings, and substitutions unchanged.

## Static review and limits

- Read AGENTS.md, Requirements.md, the current roadmap.md catalog entries, the live Section P checklist, the catalog workflow and relevant schemas, the current blue-crab reference/form/ledger rows, and prior blue-crab and recent Section P proposals.
- Rechecked the OQLF, CFIA, DFO, CNF 2015 serving page, CNF 2015 Users’ Guide, and current CNF overview online on 2026-10-19. The CNF 2026 relational files were not downloaded or row-checked; no claim about their Food Code 3096 contents is made.
- Audited exact label and source-ID ownership, form and substitution ownership, phrase-first query/subphrase behavior in IngredientSearch.kt, and every manifest-listed recipe. The corpus snapshot contains 114 recipes / 1,123 structured ingredient rows.
- No app tests, build, emulator, deployment, or shared catalog validation was run. This file is a proposal only; the user’s AGENTS.md rule waives software tests for a future database-JSON-only integration.
