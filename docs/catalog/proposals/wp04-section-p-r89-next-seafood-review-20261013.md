# WP04 Section P — sea scallop / pétoncle géant review (R89)

- **Review date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, Québec naming, picker ownership, recipe-demand, and numeric-evidence review.
- **Checklist:** Section P remains open. The parent checklist still includes fish and regional seafood under the live [WP04 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4244).
- **Recommendation:** Add one species-scoped, identity-only `PROTEIN` reference for *Placopecten magellanicus*: `sea scallop / pétoncle géant`. Keep the species-unspecified `scallop / pétoncle` and `dried scallop / pétoncle séché` identities separate. Record MAPAQ's source-specific 10–50 g muscle range in the research ledger, but add no forms, density, unit mapping, recipe link, cooking yield, package conversion, or substitution rule.
- **Write scope:** This proposal file only. No shared JSON, catalog, ledger, plan, roadmap, generated index, batch README, recipe, or code was edited. No tests, Gradle tasks, or emulator work were run.
- **R88 boundary:** This is a scallop identity proposal. It does not reopen the unrelated *Peprilus triacanthus* butterfish hold in R88.

## Why this is a distinct open item

The October 12 generic scallop review accepted `ingredient-ref-scallop` for species-unspecified scallop muscle. It explicitly left named species out of that row's aliases and did not decide whether a separately qualified species row should be created. The October 13 Fumoir d’Antan review concerns one maker's smoked product, not the species identity. This proposal adds the *P. magellanicus* choice without changing either prior scope or decision.

Québec's preferred species name and DFO's Canadian harvested-species guide both identify `pétoncle géant / sea scallop` as *Placopecten magellanicus*. That exact qualified query currently has no picker result. The bare `scallop / pétoncle` terms already return both the general scallop identity and dried scallop; the proposed row would make those broader searches show three distinct choices, leaving the general choice visible.

## Exact proposed reference delta

Add one row to `ingredient-references.v1.json`; keep all 104 forms and all recipe references unchanged.

```json
{
  "id": "ingredient-ref-sea-scallop",
  "nameFr": "p\u00e9toncle g\u00e9ant",
  "nameEn": "sea scallop",
  "aliasesFr": [
    "p\u00e9toncles g\u00e9ants",
    "p\u00e9toncle g\u00e9ant de l'atlantique nord"
  ],
  "aliasesEn": [
    "sea scallops",
    "giant scallop",
    "giant scallops",
    "Atlantic scallop"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

The aliases are limited to plural spellings and the species-qualified English/French names supported by OQLF and CFIA. Keep bare `scallop(s)` and `pétoncle(s)` on the existing general identity; do not add bare `noix`, `coquille Saint-Jacques`, `Noix de Saint-Jacques`, Bay/Hokkaido terms, or scientific names as picker aliases. OQLF describes `noix` as a culinary word for scallop muscle but the current `noix` query is broad; CFIA's Saint-Jacques label and OQLF's Québec/European terminology boundary do not make that a useful Québec picker alias. The Latin name is evidence for species identity, not a recipe-facing name.

## Current ownership and picker projection

I inspected the active reference and form data, legacy-import identities, and ledger. No active reference, form, legacy candidate, or species-specific ledger record owns `sea scallop`, `giant scallop`, `pétoncle géant`, `Atlantic scallop`, or the proposed ID. *Placopecten magellanicus* appears in the existing generic scallop ledger record only as a species named in its supporting DFO species-list source; it has no species-level identity decision or reference. There are no scallop-named forms. The accepted generic scallop record already owns `scallop meat` and the plural broad aliases, and the separate dried-scallop row owns its dried-product wording and `conpoy`.

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): names, aliases, and attached form terms are normalized for case and accents; full word phrases rank before substring fallback. I applied that logic to the current JSON and a synthetic row with the proposed names and aliases. This is a static code projection, not a UI test.

| Query | Current results | With proposed row | Meaning |
|---|---|---|---|
| `sea scallop`, `sea scallops`, `giant scallop(s)`, `pétoncle géant`, `pétoncle géant de l’Atlantique Nord`, `Atlantic scallop` | None | `ingredient-ref-sea-scallop` only | The qualified species names become discoverable. |
| `scallop(s)`, `pétoncle(s)` | `ingredient-ref-scallop`, `ingredient-ref-dried-scallop` | Those two plus `ingredient-ref-sea-scallop` | The broad term still presents general, dried, and species-scoped choices. |
| `dried scallop` | `ingredient-ref-dried-scallop` only | Unchanged | Dried product remains separate. |
| `noix` | 23 unrelated references | Unchanged | No bare `noix` alias is added. |
| `sea` | 7 existing references | 8, adding `ingredient-ref-sea-scallop` | This very broad word gains one plausible result while all current results remain. |
| `Hokkaido`, `Bay scallop`, `seafood`, `Placopecten magellanicus` | None | None | Excluded product names and the scientific name are not picker aliases. |

## Recipe demand

The live manifest lists 114 recipe files with 1,123 ingredient rows. I scanned every listed file and row for `sea scallop(s)`, `giant scallop(s)`, `pétoncle(s) géant(s)`, the CFIA long name, `Atlantic scallop`, *Placopecten magellanicus*, *Pecten magellanicus*, `scallop meat`, and `scallops`. The scan found zero matching recipe files and zero matching ingredient rows. No recipe link, ingredient relink, recipe quantity, or species substitution follows.

## Measurements, product states, and substitutions

MAPAQ publication 09-0018 reports a marketed sea-scallop shell diameter of 9–15 cm, whole scallop weight of 100–400 g, and muscle weight of 10–50 g. The proposed ledger delta retains only the muscle range as one source-reported muscle observation. The document does not specify freshness/cooked state, measurement method, sample design, or a serving basis. Its separate shell and muscle ranges are not paired observations, so no whole-to-edible yield can be derived from their endpoints.

The same MAPAQ guide lists Québec scallop formats such as fresh, frozen, half-shell, and smoked, including historical package and count-size descriptions. It discusses two Québec species and does not map each listed format to *P. magellanicus*. The current Québec transformation page likewise says two species are transformed and gives product states at the group level. Neither source justifies species-specific forms or reusable package quantities. MAPAQ's nutrition table is per 100 g of meat; that is a nutrition basis, not a recipe serving recommendation.

DFO's Newfoundland-and-Labrador management plan reports a sea-scallop factor of 8.3 for commercial gross-weight-to-meat fishery accounting, with a 1,000 t to 121 t example. It is not a culinary yield or count-to-weight conversion. Keep it as source context only. There is no source-backed volume measure or density, no package-to-recipe mapping, and no processing or cooking yield for this proposal. The reviewed identity, harvest, terminology, and government market pages provide no substitute evidence; substitution research remains `not_yet_researched`, with no global rule proposed.

## Exact proposed ledger delta

Add one `ingredient_reference` record with seven new, proposal-scoped source IDs. The interval below is the only measurement observation; it remains source-scoped and is not an active unit conversion.

```json
{
  "recordId": "ingredient-ref-sea-scallop",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031442/petoncle-geant",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, p\u00e9toncle g\u00e9ant (GDT)",
      "versionOrDate": "Last updated 1990",
      "accessedOn": "2026-10-13",
      "locator": "Preferred French term; English term list; Latin-name entries.",
      "supports": "Preferred French term is p\u00e9toncle g\u00e9ant; English terms include giant scallop and sea scallop. The Latin entries include Pecten magellanicus and Placopecten magellanicus. Terminology evidence, not a measure or market-availability survey.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=scallop",
      "title": "Canadian Food Inspection Agency, Fish List scallop query",
      "versionOrDate": "Fish List modified 2023-09-18",
      "accessedOn": "2026-10-13",
      "locator": "TSN 79718 rows for Placopecten magellanicus; comparison rows for other scallop taxa.",
      "supports": "For Placopecten magellanicus, lists Sea Scallop, Giant Scallop, Atlantic Scallop, Scallop, and corresponding French names. The same query shows unqualified scallop/p\u00e9toncle wording on multiple taxa; the list is for Canadian fish-labelling names, not culinary equivalence.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S03",
      "url": "https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm",
      "title": "Fisheries and Oceans Canada, Identification des mollusques bivalves (see also English version)",
      "versionOrDate": "Modified 2021-06-09",
      "accessedOn": "2026-10-13",
      "locator": "P\u00e9toncles section; English equivalent at https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm.",
      "supports": "Lists P\u00e9toncle g\u00e9ant (Placopecten magellanicus) as a harvested Atlantic-coast species, distinct from Iceland scallop and Pacific pink/spiny scallops. Maximum 20 cm is whole-shell biological length, not a culinary measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S04",
      "url": "https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf",
      "title": "Minist\u00e8re de l’Agriculture, des P\u00eacheries et de l’Alimentation du Qu\u00e9bec, Les mollusques du Qu\u00e9bec",
      "versionOrDate": "Publication number 09-0018; document publication date not stated",
      "accessedOn": "2026-10-13",
      "locator": "P\u00e9toncle g\u00e9ant and P\u00e9toncle d’Islande sections; pp. 4–5 of the PDF.",
      "supports": "Reports sea-scallop shell diameter 9–15 cm, whole weight 100–400 g, and muscle weight 10–50 g; separately reports Iceland-scallop muscle 7–25 g. The method and food state are not stated. The guide lists product formats and package/count descriptions for Québec scallops but does not assign each to one species. Only the 10–50 g muscle range is retained as a source-specific observation.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S05",
      "url": "https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins",
      "title": "Gouvernement du Qu\u00e9bec, Transformation des produits marins",
      "versionOrDate": "Page updated 2026-06-16",
      "accessedOn": "2026-10-13",
      "locator": "P\u00e9toncle entry under Mollusques.",
      "supports": "States that two species, p\u00e9toncle g\u00e9ant and p\u00e9toncle d’Islande, are transformed in Qu\u00e9bec and lists fresh, live, frozen, smoked, and half-shell product states. The page does not map each state to one species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S06",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, p\u00e9toncle (GDT)",
      "versionOrDate": "Last updated 1998",
      "accessedOn": "2026-10-13",
      "locator": "Commercial-part note and culinary term note.",
      "supports": "Describes the marketed Qu\u00e9bec scallop as the adductor muscle, sometimes accompanied by coral, rather than the whole animal; says the muscle is often called noix in culinary use. Supports edible-part scope, not species-specific aliases or a recipe measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S07",
      "url": "https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/scallop-petoncle/2019/index-fra.html",
      "title": "Fisheries and Oceans Canada, Plan de gestion int\u00e9gr\u00e9e des p\u00eaches du p\u00e9toncle, Terre-Neuve-et-Labrador",
      "versionOrDate": "2019 regional management plan",
      "accessedOn": "2026-10-13",
      "locator": "Section 7.2, conversion factors for fisheries reporting.",
      "supports": "Reports a factor of 8.3 for commercial gross-weight-to-meat accounting for p\u00e9toncle g\u00e9ant, with a 1,000 t to 121 t example. This is fisheries landing accounting, not a cooking yield or kitchen conversion.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "sea-scallop-mapaq-one-muscle-weight-range-20261013",
      "relationship": "count_weight",
      "valueIntervals": [
        {
          "lowerValue": 10,
          "upperValue": 50,
          "unit": "g",
          "lowerInclusive": null,
          "upperInclusive": null,
          "intervalKind": "source_reported_range",
          "origin": "source_reported",
          "reportedText": "Le muscle m\u00eame p\u00e8se de 10 g \u00e0 50 g."
        }
      ],
      "foodDescription": "P\u00e9toncle g\u00e9ant (Placopecten magellanicus) adductor muscle; MAPAQ source-reported muscle weight.",
      "foodState": "Not specified; the source does not say fresh, frozen, or cooked.",
      "sourceQuantity": {
        "amount": 1,
        "unit": "adductor muscle"
      },
      "measurementMethod": "MAPAQ source-reported product-size range; sampling and weighing method are not stated.",
      "quantityBasis": "One muscle as described by MAPAQ, not a serving. Whole-shell size and whole-scallop weight are stated separately and are not paired to the muscle range; do not derive edible yield.",
      "evidenceKind": "estimate",
      "sourceIds": [
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S04"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add a species-scoped identity-only PROTEIN reference for sea scallop / p\u00e9toncle g\u00e9ant (Placopecten magellanicus), scoped to its edible adductor muscle. Keep generic scallop and dried scallop separate. No forms or recipe links are supported.",
      "sourceIds": [
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S01",
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S02",
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S03",
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S04",
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S05",
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S06"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Retain the MAPAQ muscle range only as a source-specific observation. Its missing method/state and DFO’s fisheries conversion factor do not support a density, package conversion, kitchen yield, or reusable mass mapping. Substitution research remains not_yet_researched.",
      "sourceIds": [
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S04",
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S05",
        "WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S07"
      ]
    }
  ]
}
```

The projected catalog totals would be 1,421 references, 104 forms, and 1,760 ledger records. Legacy identities remain at 63; recipes remain at 114 files and 1,123 ingredient rows. No generated-index or runtime change follows from this proposal.

## Source register and limits

All seven IDs use the new prefix `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-`. They were checked for prior use in the proposal archive, batch archive, ledger, and live plan before this file was written.

| Source ID | Direct source | Evidence used and limits |
|---|---|---|
| `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S01` | OQLF, [pétoncle géant (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031442/petoncle-geant) | Preferred Québec French species term; English `giant scallop` and `sea scallop`; taxonomic entries include *Pecten magellanicus* and *Placopecten magellanicus*. Last updated 1990; terminology evidence only. |
| `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S02` | CFIA, [Fish List query for scallop](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=scallop) | For TSN 79718, *P. magellanicus*, the result lists `Sea Scallop`, `Giant Scallop`, `Atlantic Scallop`, and French labels including `Pétoncle Géant De L'Atlantique Nord`; it also assigns unqualified scallop/pétoncle names across multiple taxa. Fish-labelling names, not culinary equivalence. Modified 2023-09-18. |
| `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S03` | DFO, [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm) and [English version](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) | Identifies *P. magellanicus* as pétoncle géant / sea scallop from the Atlantic coast and distinguishes it from Iceland and Pacific scallops. The 20 cm figure is shell length. Modified 2021-06-09. |
| `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S04` | MAPAQ, [Les mollusques du Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf) | Publication 09-0018, date not stated. Reports 10–50 g for the giant-scallop muscle, and separately 100–400 g whole and 9–15 cm shell. Does not state measurement method or food state; ranges are not paired, and its product formats are not assigned by species. |
| `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S05` | Gouvernement du Québec, [Transformation des produits marins](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins) | Updated 2026-06-16. Confirms two transformed Québec species and group-level product states. It is not a product-by-species matrix or package-conversion source. |
| `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S06` | OQLF, [pétoncle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle) | Says the marketed Québec part is the adductor muscle, sometimes with coral, and notes culinary `noix`. Last updated 1998; general part terminology, not a species-specific measure. |
| `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S07` | DFO, [Pétoncle — Région de Terre-Neuve-et-Labrador](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/scallop-petoncle/2019/index-fra.html) | Section 7.2 reports 8.3 for fishery gross-weight-to-meat accounting and an example. The 2019 regional management factor is not a recipe yield. |

## Static checks performed

- Re-read the current `AGENTS.md`, `Requirements.md`, Section P work packet/open checklist, current roadmap, R88 integration record, generic scallop identity archive, and smoked-scallop product archive.
- Parsed current reference, form, legacy, ledger, manifest, and recipe JSON. Confirmed 1,420 references, 104 forms, 63 legacy candidates, 1,759 ledger records, 114 manifest-listed recipe files, and 1,123 ingredient rows.
- Checked exact owner terms across active references, forms, legacy identities, and ledger. Confirmed no species-level `sea scallop` row or ID; found *Placopecten magellanicus* only in the existing generic scallop ledger's DFO supporting-source description.
- Scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows for the species names and related scallop phrases listed above; found zero matches.
- Inspected the picker implementation and statically projected the proposed row against the current references for qualified, broad, dried, `noix`, and general `sea` queries.
- Checked all seven proposed R89 source IDs against the existing proposal/archive, batch archive, ledger, and plan before use; no prior use was found.
- No app tests, Gradle tasks, emulator runs, or deployment were performed. This packet changes no application data or code and the current project instructions exempt data-only work from tests.

This proposal covers one species-level seafood identity only. It does not complete or close WP04 Section P.
