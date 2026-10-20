# WP04 Section P — barracuda market-group identity review (R83)

- **Review date:** 2026-10-13.
- **Recommendation:** Integrate one identity-only `PROTEIN` reference for the Canadian/Québec market group **barracuda / barracuda**, scoped to *Sphyraena* spp. Do not assign the Montréal seller’s `seudd` SKU to a species.
- **Data boundary:** Add no aliases, forms, measurements, density, unit mappings, conversion, yield, recipe link, or substitution.
- **Repository rule:** This is proposal-only research. `AGENTS.md` says changes limited to database JSON data need no app tests; no tests or emulator were run.

## Open checklist line and distinctness

The live [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4193) still has this open parent line:

> [ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

The plan, proposal and batch archive contain no dedicated barracuda / *Sphyraena* market-group decision. This review is distinct from the completed bluefish/tassergal, golden-tilefish, monkfish/baudroie, swordfish/espadon, and other finfish work; it does not reopen any crab/shrimp item or R82 golden tilefish.

The current post-R82 snapshot contains **1,409 ingredient references, 104 forms, 63 legacy candidates, and 1,748 ledger records**. Exact-name and ID scans found no active reference, form, legacy candidate, or ledger owner for `barracuda`, `bécune`, `sennet`, `seudd`, `Sphyraena`, `Sawtooth Barracuda`, or `ingredient-ref-barracuda`. No existing record claims the proposed ID. The proposal-local source-ID prefix `WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-` was also absent from the ledger and proposal/batch archive.

## Identity and Québec naming scope

OQLF’s fish/food entry identifies *Sphyraena* sp., gives English **barracuda**, prefers Québec French **barracuda**, and describes commercial potential in Québec. It explicitly says French **bécune** was not retained by the fish-products terminology committee. This supports a genus-level market identity and the same display word in both locales; it does not identify a particular species or establish present inventory. [S01]

The CFIA Fish List contains a group row for *Sphyraena* spp. named **Barracuda / Bécune** and a separate species row for *Sphyraena putnamae*, **Sawtooth Barracuda / Bécune chevronnée**. CFIA’s guidance says the Fish List supplies Canadian fish-labelling names, and that group names may cover multiple species. The CFIA French group label conflicts with OQLF’s Québec-preferred product terminology; use OQLF’s **barracuda** for the French display and do not turn **bécune** into an alias. The specific sawtooth species remains outside this group row’s identity claim. [S02–S03]

A Montréal-area seafood retailer lists a French/English product as **Barracuda frais (seudd) / Guinean Wild-caught Fresh Barracuda (seudd)**. The listing says it is cleaned, scaled, frozen, and about 1 kg, and was marked sold out when checked. It supports Québec product wording and a local seller listing, not current stock or taxonomic identification: no scientific name is shown, and **seudd** is seller wording rather than a verified synonym. Do not encode it as a species name, alias, form, or recipe ingredient. [S04–S05]

## Current ownership and picker projection

The live reference, forms, legacy, and ledger audit found no exact owner for the candidate name, Québec preferred display, competing French term, English term, binomial/genus, or proposed ID. Nearby fish references do not own these keys; shared membership in `PROTEIN` does not imply identity or substitution.

`IngredientSearch.kt` searches complete normalized word phrases across reference displays/aliases and attached form terms first, then uses substring fallback only when no phrase match exists. A local projection using the current catalog and a synthetic row with only the proposed bilingual displays gives:

| Query | Current picker | With proposed row | Boundary |
|---|---|---|---|
| `barracuda` | No result | One result: **barracuda / barracuda** | The result is explicitly the *Sphyraena* market group, not a species selection. |
| `bécune` | No result | No result | Excluded from aliases because OQLF rejects it for Québec fish-product terminology. |
| `sennet` | No result | No result | OQLF lists this as an English equivalent, but it is unnecessary for the reviewed Québec-facing display and is not added as an alias. |
| `sawtooth barracuda` | No result | No result | The query is more specific than the generic display phrase; it remains unassigned. |
| `seudd` or `Sphyraena` | No result | No result | Retail wording and scientific name remain outside search terms. |

With the exact market-group name in both displays, a generic `barracuda` query selects that group only. The app has no taxonomy-aware warning or product-origin disambiguation, so future species-specific or differently scoped market records must be reviewed before addition; the present generic row must not be re-labelled as a species. No broad `fish` or `poisson` alias is introduced.

## Recipe demand and numeric limits

The manifest lists **114 recipes** and **1,123 ingredient rows**. All manifest-listed recipe JSON files and ingredient rows were scanned for `barracuda`, `bécune`, `sennet`, `seudd`, `Sphyraena`, and `sawtooth barracuda`; the scan found **zero matching files and zero matching rows**. There is no bundled recipe demand, role, method, amount, or recipe link for this group. The generic recipe phrase `Cooked meat or seafood, to taste` does not select barracuda.

The retailer’s “about 1 kg” statement is a seller-specific approximate package observation for one cleaned/scaled/frozen listing, which was sold out at retrieval. It is not a per-fish mass, standard pack quantity, serving size, density, or recipe amount. No source reviewed here supports a reusable household measure, unit mapping, mass-volume conversion, fish-size conversion, cleaning or edible yield, or raw-to-cooked yield. Because this evidence review found no reusable value, set `measurementState` to `researched_no_supported_value`; add no numeric behavior or measurement-ledger observation.

The seller’s comparison to tuna is flavor copy, not a recipe-backed substitution. No source or bundled line establishes interchangeability with tuna, another finfish, or shellfish, or supplies a ratio and method scope. Because substitution evidence was reviewed and no supported substitute was established, set `substitutionResearchState` to `researched_no_supported_substitute`. Add no global or contextual substitution and no recipe-line substitution.

## Exact proposed database delta

If accepted, add this one reference row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-barracuda",
  "nameFr": "barracuda",
  "nameEn": "barracuda",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

Add one verified `ingredient_reference` record for that ID to the research ledger. This exact delta uses source IDs S01–S05 below; its decision accepts only the CFIA/OQLF *Sphyraena* market group, uses OQLF’s preferred French display `barracuda`, excludes `bécune`, `sennet`, `seudd`, and species-level names from aliases, and records that no recipe demand or reusable numeric/form/substitution behavior is established. Add no form, alias, legacy candidate, recipe link, measurement, conversion, yield, or substitution record.

```json
{
  "recordId": "ingredient-ref-barracuda",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199023/barracuda",
      "title": "Office québécois de la langue française, GDT: barracuda",
      "accessedOn": "2026-10-13",
      "locator": "Preferred fish/food term, English equivalent, genus-level Latin name, and terminology note",
      "supports": "Pairs the preferred Québec French and English term barracuda with Sphyraena sp.; says bécune was not retained for fish-product terminology and notes commercial potential in Québec.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Last updated 2011"
    },
    {
      "sourceId": "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "Canadian Food Inspection Agency, Fish List",
      "accessedOn": "2026-10-13",
      "locator": "Query Sphyraena; group row and separate Sphyraena putnamae row",
      "supports": "Lists Sphyraena spp. as Barracuda / Bécune and separately lists S. putnamae as Sawtooth Barracuda / Bécune chevronnée.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Fish List page modified 2023-09-18"
    },
    {
      "sourceId": "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S03",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "Canadian Food Inspection Agency, Guidance on determining the common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-13",
      "locator": "Fish List scope and group-name policy",
      "supports": "Explains the Canadian fish-labelling role of the CFIA Fish List and states that group names may cover multiple species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S04",
      "url": "https://guineasea.com/fr/products/fresh-barracuda",
      "title": "GuineaSea, Barracuda frais (seudd)",
      "accessedOn": "2026-10-13",
      "locator": "French product page; title, product condition, approximate package wording, pickup location, and stock status",
      "supports": "A Montréal-area seller lists barracuda (seudd) as cleaned, scaled, frozen, about 1 kg, and marks the product sold out; the page provides no scientific name or transferable measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S05",
      "url": "https://guineasea.com/products/fresh-barracuda",
      "title": "GuineaSea, Guinean Wild-caught Fresh Barracuda (seudd)",
      "accessedOn": "2026-10-13",
      "locator": "English product page for the same Montréal-area listing",
      "supports": "The English page repeats the product’s approximate 1 kg and cleaned/scaled/frozen wording; its fresh title does not establish a fresh form, species, or current inventory.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add an identity-only PROTEIN reference for the Sphyraena market group as barracuda / barracuda. Use the OQLF-preferred Québec French display, do not add bécune, sennet, seudd, Latin, or species-level aliases, and keep the seller’s species-unspecified SKU separate from a taxon claim. No bundled recipe demand or reusable form, numeric, conversion, yield, or substitution behavior is supported.",
      "sourceIds": [
        "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S01",
        "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S02",
        "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S03",
        "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S04",
        "WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S05"
      ]
    }
  ]
}
```

## Source register

| Source ID | Source | Use and limits |
|---|---|---|
| WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S01 | Office québécois de la langue française, [GDT: barracuda](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199023/barracuda), last updated 2011. | Gives English `barracuda`, Latin *Sphyraena* sp., and the preferred Québec French term `barracuda`; classifies it as edible fish and notes commercial potential in Québec. Says `bécune` was not retained by the fish-products terminology committee. Terminology and genus-level name evidence, not current inventory or recipe evidence. |
| WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S02 | Canadian Food Inspection Agency, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), query `Sphyraena`, checked 2026-10-13. | Lists *Sphyraena* spp. as `Barracuda / Bécune` and separately lists *S. putnamae* as `Sawtooth Barracuda / Bécune chevronnée`. The Fish List page reports a 2023-09-18 modification date. Canadian labelling names, not recipe-picker behavior, product traceability, or an assignment of the GuineaSea SKU to a species. |
| WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S03 | Canadian Food Inspection Agency, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), checked 2026-10-13. | Explains the CFIA Fish List’s Canadian labelling role and that group names may cover multiple species. It does not prescribe app display wording; OQLF supplies the Québec French preference used here. |
| WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S04 | GuineaSea, [Barracuda frais (seudd), French product listing](https://guineasea.com/fr/products/fresh-barracuda), checked 2026-10-13. | Montréal-area retailer page gives the French product name, cleaned/scaled/frozen condition, approximate 1 kg wording, and shows the item sold out. It provides no scientific name, validated alias, reusable measure, or current stock. |
| WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S05 | GuineaSea, [Guinean Wild-caught Fresh Barracuda (seudd), English product listing](https://guineasea.com/products/fresh-barracuda), checked 2026-10-13. | English page for the same seller product and Montréal-area pickup gives the corresponding product wording and approximate package details. Its “fresh” title coexists with “frozen” in the product state; do not infer a fresh form. It does not identify a species. |

## Static review record

- Re-read current `AGENTS.md`, the open checklist parent, proposal/batch archive, live reference/form/legacy/ledger data, manifest, and recipe corpus.
- Checked the current picker implementation and ran a local phrase-first/fallback projection for the current and synthetic candidate row.
- Audited ownership and source-ID collisions; confirmed no candidate owner, proposed reference ID, or source-ID-prefix collision.
- Scanned all 114 manifest-listed recipe files / 1,123 ingredient rows for the candidate terms; zero hits.
- Proposal-only static checks: UTF-8 without BOM, final newline, trailing whitespace, local Markdown links, source-ID uniqueness, and JSON snippet parsing/shape. No app tests, Gradle tasks, or emulator were run.
