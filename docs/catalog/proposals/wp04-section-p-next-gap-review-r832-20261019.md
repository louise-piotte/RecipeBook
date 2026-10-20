# WP04 Section P R832 — raw mixed-species cuttlefish CNF 2015 serving

- **Review date:** 2026-10-19.
- **Candidate:** One historical published portion observation for the existing **ingredient-ref-cuttlefish** identity.
- **Recommendation:** Accept one ledger-only **portion_weight** observation from Health Canada’s CNF 2015 Food Code 3114: **1 food guide serving = 90g = 90.0 g**.
- **Scope:** Keep the row’s raw, mixed-species wording exactly as CNF states. The page does not state species, cleaning status, cut, meat-only scope, or roe inclusion. Its separate **Refuse:** field is blank; this is not a reported zero-refuse value.
- **Write scope:** Proposal only. No catalog, ledger, recipe, plan, roadmap, workflow, or generated file changed. If accepted, the only data change would be JSON ledger evidence; AGENTS.md says database-JSON-only changes need no software tests.

## Open Section P work and prior-work boundary

The live checklist still has the parent **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below”** open at [line 8172 of the plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8190). Recent Section P CNF reviews are adjacent but distinct: R817 covered Eastern oyster, R820 raw mixed-species squid, R823 raw blue mussel, R826 mixed-species scallop, and R829 raw blue crab. R832 concerns the existing generic cuttlefish / seiche row and Food Code 3114 only.

The active cuttlefish identity was integrated in 2022-10-12. Its accepted identity decision kept it separate from calamari/squid, octopus, cuttlefish ink, and prepared products. R215 separately added frozen cuttlefish balls as a finished-product identity; R359 held dried cuttlefish outside the catalog. Neither review covered a CNF portion for raw mixed-species cuttlefish.

## Existing identity and source boundary

| Item | Current evidence and scope | R832 handling |
|---|---|---|
| Active reference | **ingredient-ref-cuttlefish**, category **PROTEIN**, displayed as **cuttlefish / seiche**, with empty alias arrays, null density, and no unit mappings. | Keep the reference, labels, aliases, category, density, and mappings unchanged. |
| Forms and adjacent products | The generic cuttlefish reference has no forms. **ingredient-ref-cuttlefish-balls** is a separate frozen formed-product identity. | Do not add a cuttlefish form, alias, recipe link, or association to cuttlefish balls. |
| Québec French and English identity | OQLF’s GDT entry for [seiche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198916/seiche) gives preferred Québec **seiche**, English **cuttlefish**, and Latin **Sepia sp.** It was last updated in 1998. | Reuse the existing OQLF source; do not change active naming. The entry supports terminology and genus scope, not current availability or a particular product state. |
| Canadian naming boundary | The current [CFIA Fish List Sepia results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s) pair **Cuttlefish / Seiche** with both **Sepia pharaonis** and **Sepia spp.**, and list qualified names such as **Needle cuttlefish / Seiche aiguille** separately. | Reuse the existing CFIA source and leave species-specific terms unassigned. The Fish List does not identify the CNF row’s species. |
| CNF row name | CNF 2015 Food Code 3114 names **Mollusks, cuttlefish, mixed species, raw** / **Mollusques, seiche (seche, sépiole), espèces diverses, crues**. | Record the published portion on the existing generic identity only as a Food Code 3114 observation. Do not turn the CNF wording into aliases or a species claim. |

## Food Code 3114 portion and limits

Health Canada’s [CNF 2015 serving-size page, Food Code 3114](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3114) lists these exact fields:

| Exact page text | R832 treatment |
|---|---|
| **100 grams of edible portion = 100 grams** | CNF edible-portion baseline, not an additional household measure. |
| **1 food guide serving = 90g = 90.0 g** | One source-specific published portion observation: 1 food guide serving → 90.0 g. It is not a kitchen measure, count conversion, or recommendation for a recipe. |
| **Refuse:** followed by blank fields | Preserve the blank as “no refuse value reported.” Do not treat it as zero refuse or infer a shell/cleaning yield. |

The row’s title explicitly says **raw** and **mixed species**. It does not say whether the serving is cleaned, which anatomical parts are included, or whether roe is included. The CNF 2015 [Users’ Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes conversion-factor weights as generic weights for described portions and weights of edible material without refuse. That does not define the cuttlefish size, cleaning state, or procedure behind this row. Do not derive whole-as-purchased mass, shell/skin/ink removal, cooking yield, density, or a reusable recipe quantity from the page.

Health Canada’s [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as relational CSV files and the CNF 2015 viewer remains available as an interim access route. The CNF 2026 Food Code 3114 row was not inspected for this review; no claim about its contents or continuity is made.

## Exact proposed ledger delta

Add the following Food Code 3114 source to the existing **ingredient-ref-cuttlefish** ledger record. The exact page URL has no current ledger owner. Use a new source ID for that page. Reuse the existing guide source ID **WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S02** and current CNF overview source ID **WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S03** with their registered source details; do not create duplicate IDs. Reuse existing OQLF and CFIA identity source IDs if the integration decision cites them.

~~~json
{
  "sourceId": "WP04-SECTIONP-CUTTLEFISH-CNF-PORTION-R832-20261019-S01",
  "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3114",
  "title": "Health Canada, Canadian Nutrient File 2015 serving size, Food Code 3114",
  "versionOrDate": "CNF 2015; page details modified 2019-03-01",
  "accessedOn": "2026-10-19",
  "locator": "Bilingual row names; Food Code 3114; 100 grams of edible portion = 100 grams; 1 food guide serving = 90g = 90.0 g; Refuse: (no values listed).",
  "supports": "The CNF 2015 page names raw, mixed-species cuttlefish and lists one food-guide portion of 90.0 g. It lists no count or volume measure and no refuse values. It provides no species, cleaning state, cut, meat-only scope, roe inclusion, or weighing procedure.",
  "sourceKind": "food_composition"
}
~~~

Append this observation to the same ledger record:

~~~json
{
  "observationId": "cuttlefish-raw-cnf2015-one-food-guide-serving-r832-20261019",
  "relationship": "portion_weight",
  "value": 90.0,
  "valueUnit": "g",
  "foodDescription": "Mollusks, cuttlefish, mixed species, raw / Mollusques, seiche (seche, sépiole), espèces diverses, crues (CNF 2015 Food Code 3114).",
  "foodState": "Raw, mixed-species cuttlefish as named by CNF 2015 Food Code 3114. The source does not state species, cleaning state, anatomical cut, meat-only scope, or roe inclusion.",
  "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g. Its Refuse: fields are blank; the page gives no weighing procedure.",
  "quantityBasis": "One source-specific published food-guide portion for CNF 2015 Food Code 3114. Keep 90.0 g attached to that label only. Do not treat it as a recipe amount, household measure, cuttlefish count conversion, refuse value, yield, or preparation instruction.",
  "sourceQuantity": {
    "amount": 1,
    "unit": "food guide serving"
  },
  "observedMassG": 90.0,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP04-SECTIONP-CUTTLEFISH-CNF-PORTION-R832-20261019-S01",
    "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S02"
  ]
}
~~~

Append one accepted measurement decision citing S01–S03, and set only **measurementState** to **researched_supported**:

~~~json
{
  "outcome": "accepted",
  "reason": "Record one historical CNF 2015 Food Code 3114 published portion for raw mixed-species cuttlefish: 1 food guide serving = 90g = 90.0 g. The page's Refuse: fields are blank, not zero. The CNF 2026 Food Code 3114 row was not inspected; do not infer cleaning, species, anatomical cut, meat-only scope, roe inclusion, count/volume conversion, yield, or recipe measure.",
  "sourceIds": [
    "WP04-SECTIONP-CUTTLEFISH-CNF-PORTION-R832-20261019-S01",
    "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S02",
    "WP04-SECTIONP-BLUE-CRAB-CNF-PORTION-R829-20261019-S03"
  ]
}
~~~

Keep **identityState** and **substitutionResearchState** unchanged. Leave the active reference and forms unchanged: no density, unit mapping, measurement conversion, recipe link, package yield, form, or substitution rule is proposed. The 90.0 g observation is ledger evidence only.

## Ownership, picker, and recipe audit

- The exact CNF Food Code 3114 serving-page URL and proposed observation ID have no current ledger owners. The new R832 source ID has no ledger or proposal-archive collision. The CNF Users’ Guide and CNF overview URLs already have ledger owners; reuse the registered R829 source IDs. OQLF and CFIA naming URLs likewise have existing cuttlefish source ownership; reuse those IDs rather than adding duplicates.
- Exact active English/French terms remain owned by **ingredient-ref-cuttlefish**; **ingredient-ref-cuttlefish-balls** owns its separate qualified ball terms. No alias or form term is added.
- Picker projections remain unchanged. The phrase-first matcher in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) also matches a query phrase inside a longer indexed term; broad/subphrase checks showed **cuttlefish** and **seiche** still return the generic cuttlefish and frozen cuttlefish balls, **squid** still returns calamari, **calamari** still returns its current two results, and **cuttlefish balls** still returns only the frozen-ball identity. **cleaned** still returns the existing whole-tilapia reference; **cleaned cuttlefish** and **seiche nettoyée** still have no result. A ledger-only observation adds no searchable term or form hint.
- Parsed all **114 manifest recipes / 1,123 structured ingredient rows**. There are no cuttlefish, seiche, or Sepia mentions and no recipe demand for this portion. The 140 g sliced-calamari line in recipe 023 remains a separate ingredient and does not supply cuttlefish demand.
- Current catalog measurement state has no default density or unit mappings for generic cuttlefish, and the generic identity has no forms. No cuttlefish-specific package-yield or global/contextual substitution rule exists in the checked seed data. This review leaves substitution research open because its scope is the CNF measurement observation.

## Static review and limits

- Re-read the live Section P checklist, current cuttlefish reference/form and ledger rows, research-ledger schema, related plan entries, and prior cuttlefish identity, frozen cuttlefish-ball, dried-cuttlefish, and recent Section P CNF proposals.
- Rechecked the CNF 2015 serving page, CNF 2015 Users’ Guide, current CNF overview, OQLF GDT entry, and CFIA Fish List online on 2026-10-19. The exact CNF page is historical; CNF 2026 Food Code 3114 was not row-checked.
- Audited exact source-ID and URL ownership, active alias/form ownership, phrase-first picker projections including subphrases, the full manifest recipe corpus, null density/empty mappings, and the relevant substitution/package-yield files.
- This file is proposal-only. No software tests, builds, emulator, deployment, or shared catalog validation were run. The project AGENTS.md rule waives app tests for any eventual database-JSON-only integration.
