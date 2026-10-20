# WP04 Section P — Sea lamprey identity and Québec availability boundary

- **Packet type:** proposal-only identity review and exact future JSON delta.
- **Review date:** 2026-10-13.
- **Decision:** integrate one identity-only reference for sea lamprey, *Petromyzon marinus*, with English display `sea lamprey` and Québec French display `lamproie`. Keep the record species-scoped. Do not add a product form, alias, measure, conversion, yield, recipe link, or substitution.
- **Availability boundary:** the identity is supported as an edible fish with commercial potential in Québec, but the reviewed supplier directories list no distributor and the current Exploramer profile says it is not yet commercialized in Québec. This proposal does not claim a current Québec retail supply chain.
- **Scope:** one distinct regional-fish candidate on the open Section P checklist. This does not reopen American eel or the generic eel hold, and it does not repeat the prior Northern shrimp, katsuobushi powder, sea raven, crab, or crayfish reviews.

## Open checklist line and live ownership

The open plan line is:

> [ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

Current files inspected: [plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy import candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json).

| Live file | Current count | Sea-lamprey ownership |
|---|---:|---|
| Ingredient references | 1,405 | No name, alias, scientific-name, or stable-ID match. `ingredient-ref-sea-lamprey` is unused. |
| Ingredient forms | 104 | No matching label, match term, or owner. |
| Legacy import candidates | 63 | No matching name, alias, or scientific-name text. |
| Research-ledger records | 1,744 | No sea-lamprey candidate or reference record. |

The nearest relevant owner is `ingredient-ref-american-eel`: English display `American eel`, French display `anguille`, no aliases, no forms, category `PROTEIN`. The separate `candidate-unqualified-eel-identity-boundary` remains `needs_clarification`; it holds bare `eel / anguille` as a global identity. This proposal does not add `eel`, `sea eel`, `anguille`, or any eel synonym to the lamprey row. The OQLF's English equivalents include `eel` and `sea eel`, but importing either would make the existing `eel` picker query return both the American-eel row and the sea-lamprey row. The OQLF equivalence is terminology evidence for *P. marinus*, not a reason to merge these species or alias their ingredient identities.

Archive and collision audit covered proposal and batch files, live references/forms, legacy candidates, and ledger records for `lamprey`, `sea lamprey`, `lamproie`, `lamproie marine`, `grande lamproie marine`, `Petromyzon marinus`, and `sea eel`. No prior sea-lamprey decision or R80 source-ID collision was found. The pre-existing eel decision is explicitly preserved.

## Identity and Québec naming

The OQLF GDT entry is unusually direct for a regional fish identity: it is in the zoology/ichthyology and edible-fish domains, maps the preferred Québec French term `lamproie` to *Petromyzon marinus*, and gives `sea lamprey` in English. It describes the species as having commercial potential in Québec. It was last updated in 2011, so its potential statement is not evidence of present-day availability. The same entry says `lamproie marine` and `grande lamproie marine` were not retained by the Comité de normalisation de la terminologie des produits de la pêche. The Québec freshwater-fish poster separately prints `lamproie marine` for *P. marinus* as a species-identification label. These are different contexts: use OQLF's preferred edible-fish term for the catalog display and retain the qualified label as source context, not as an alias.

DFO describes *P. marinus* as native to the Atlantic Ocean and found along the North American Atlantic coast from Newfoundland and Labrador to Florida. It also documents the introduced Great Lakes population and the binational control program. Do not describe all Québec or Atlantic sea lampreys as invasive; the ecological control issue is scoped to inland populations introduced through the canal route. Québec's freshwater-fish poster lists five Petromyzontidae species, including *P. marinus* and four other lamprey taxa. The current Québec profile for the threatened Northern brook lamprey, *Ichthyomyzon fossor*, lists sea lamprey among its similar species. This supports keeping a food identity species-scoped and not treating the family word as a universal fish-product identity.

The CFIA guidance says its Fish List supplies the English and French common names used when fish are sold or processed in Canada. The live Fish List page did not expose an inspectable exact *P. marinus* row in this review, so this proposal makes no claim that CFIA's current list confirms or omits a particular row. The proposed catalog names are supported by OQLF and Exploramer's bilingual species listing; the row must not be treated as a CFIA-compliant commercial label.

## Québec availability and source limits

Exploramer's Fourchette bleue profile identifies *P. marinus*, names it `lamproie` in cuisine, and currently states both `Pas encore commercialisée au Québec` and `Pas de pêche commerciale au Québec`. The profile has no visible revision date (the site carries a 2023 copyright notice), so treat it as a current page checked on 2026-10-13, not a timestamped stock or market survey. Its 2021 and 2022 supplier directories both list `Lamproie marine / Sea lamprey / Petromyzon marinus` with `Aucun distributeur`. Those directories provide a date-bounded supply boundary, not proof that the species has never been eaten, caught, imported, or sold.

A 2022 Mauricie food-program report says sea lamprey occurs in Lac Saint-Pierre and explains that Fourchette bleue selects edible species that are present in sufficient quantity and could be commercialized more broadly. This is contextual reporting about the program, not a landing record, retailer listing, or species-identification authority. The 1961 Fisheries Research Board/DFO report describes a lamprey fishery at Southampton, Ontario, and roasted/canned lampreys sold in Toronto at that time. That historical, Ontario-scoped account does not establish a current Québec fishery, current availability, or a present-day product form.

Taken together, the sources support a named edible species concept and justify an identity-only row, while withholding retail/product claims. The exact 114-recipe/1,123-row bundle scan found no sea-lamprey demand. A future recipe or actual SKU would be needed before assigning a product form, quantity, cooking conversion, or market-specific synonym.

## Exact picker projections

The projection uses the active search implementation in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including normalized phrase-first matching over displays, aliases, and attached forms. The proposed row has no aliases and no forms.

| Query | Current result | With the proposed row | Boundary |
|---|---|---|---|
| `sea` | 6 references | 7 references, adding `ingredient-ref-sea-lamprey` | Broad query gains one result. |
| `sea lamprey` | none | `ingredient-ref-sea-lamprey` | Species-qualified English query. |
| `lamprey` | none | `ingredient-ref-sea-lamprey` | Matches the word in the species display; it is not a generic-family reference. |
| `lamproie` | none | `ingredient-ref-sea-lamprey` | Matches OQLF's preferred Québec food-fish display. Other Québec lamprey taxa exist, so this singleton result should not be used for field identification or harvesting. |
| `lamproie marine` | none | none | Not added as alias because OQLF does not retain it as the Québec fish-product term; the Government species poster's qualified label remains source context. |
| `eel` | `ingredient-ref-american-eel` | unchanged | Do not import OQLF's `eel` / `sea eel` English equivalents as aliases. |
| `anguille` | `ingredient-ref-american-eel` | unchanged | Preserve the species-specific Québec eel record and existing generic-eel hold. |
| `sea eel` | none | none | Do not add this OQLF English equivalent as an alias; it collides semantically with the eel boundary. |
| `Petromyzon marinus` | none | none | Scientific name is ledger evidence, not a user-facing alias. |

Although `lamprey` and `lamproie` searches each produce one result after integration, the identity's canonical English display is qualified (`sea lamprey`), and the French display is the OQLF-preferred edible-fish term for this species. The picker does not encode taxonomic uncertainty for broad queries. If another edible lamprey species is proposed later, review both broad-query results before adding it; do not silently give a generic family query a unique species interpretation.

## Recipe demand, forms, measures, yield, and substitutions

The bundled manifest currently lists 114 recipes and 1,123 ingredient rows. A normalized phrase scan over all ingredient lines and recipe JSON text found **0** occurrences of `lamprey`, `sea lamprey`, `lamproie`, `lamproie marine`, `grande lamproie marine`, `Petromyzon marinus`, or `sea eel`. No recipe links, serving quantity, ingredient preparation state, or contextual substitution target exist.

| Data concern | Evidence and limit | Proposed result |
|---|---|---|
| Identity | OQLF and Exploramer connect the bilingual name to *P. marinus*. | One species-scoped `PROTEIN` reference. |
| Product/form | Fourchette bleue says it is not yet commercialized in Québec; its profile says it is cut into pieces rather than eaten as fillet. This is culinary description, not a standardized retail form or form-to-form rule. The 1961 Ontario report is historical only. | No form row, canned/smoked/fresh alias, or processing-state equivalence. |
| Measurements | Fourchette bleue and DFO give maximum marine body size as 120 cm and 2.5 kg. These are biological size limits, not edible portion sizes or recipe measures. | No default density, count-to-weight observation, household measure, or unit mapping. |
| Conversion | No supported edible-mass, cleaned-weight, cooked-weight, or volumetric conversion was found. | No conversions. |
| Yield | Sources provide no standardized edible-portion yield or SKU/package yield. | No package-yield or recipe-yield record. |
| Substitution | Similar eel-like shape does not establish culinary equivalence; DFO notes lampreys lack jaws and have cartilaginous skeletons, distinct from true eels. No source or recipe supports a replacement. | No global or contextual substitution. |
| Safety/process | The Exploramer page includes cleaning and bleeding advice, but it is not a government food-safety standard. | Do not derive safety, curing, storage, or raw-consumption rules from this identity review. |

## Exact future JSON delta

This is the complete proposed data delta for later review/integration. It is not applied by this proposal. The empty alias arrays intentionally avoid unqualified `eel` and `sea eel` ownership. No form, unit mapping, recipe link, yield, conversion, or substitution is implied.

Add one object to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-sea-lamprey",
  "nameFr": "lamproie",
  "nameEn": "sea lamprey",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

Add one object to `research-ledger.v1.json` `records`:

```json
{
  "recordId": "ingredient-ref-sea-lamprey",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199001/lamproie",
      "title": "Office québécois de la langue française, lamproie (GDT)",
      "accessedOn": "2026-10-13",
      "locator": "Preferred Québec food-fish term, English and Latin equivalents, and note on commercial potential.",
      "supports": "Maps preferred Québec French lamproie and English sea lamprey to Petromyzon marinus in the edible-fish domain. Its commercial-potential note was last updated in 2011 and does not prove current availability.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S03",
      "url": "https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sealamprey-lamproiemarine-eng.html",
      "title": "Fisheries and Oceans Canada, Sea Lamprey — Petromyzon marinus",
      "accessedOn": "2026-10-13",
      "locator": "Species name, Atlantic native range, inland introduced population scope, and species description.",
      "supports": "Confirms the scientific identity and distinguishes native Atlantic distribution from introduced Great Lakes populations; biological maximum size is not a culinary measure.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S04",
      "url": "https://cdn-contenu.quebec.ca/cdn-contenu/faune/documents/animaux/affiche-poissons-eau-douce.pdf",
      "title": "Gouvernement du Québec, Poissons d’eau douce du Québec — affiche",
      "accessedOn": "2026-10-13",
      "locator": "Poster entries 1–5 under Petromyzontidae, including lamproie marine / Petromyzon marinus.",
      "supports": "Documents five lamprey taxa in the Québec freshwater-fish identification poster, including the distinct P. marinus species; poster length ranges are biological observations, not recipe measures.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S05",
      "url": "https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/lamproie-du-nord",
      "title": "Gouvernement du Québec, Lamproie du Nord",
      "accessedOn": "2026-10-13",
      "locator": "Scientific name Ichthyomyzon fossor, threatened status, and similar-species list; page updated 2026-10-02.",
      "supports": "Shows that another Québec Petromyzontidae species is distinct and lists lamproie marine among similar species. This is a taxonomy/search-boundary source, not edible-product evidence for the Northern brook lamprey.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S06",
      "url": "https://fourchettebleue.ca/produits/lamproie-marine/",
      "title": "Exploramer, Fourchette bleue, Lamproie marine",
      "accessedOn": "2026-10-13",
      "locator": "Species/scientific-name and cuisine-name fields; statements on Québec commercialization; body-size and cooking notes. Page has no visible revision date.",
      "supports": "Identifies P. marinus and the cuisine name lamproie, while stating that it is not yet commercialized in Québec and that there is no Québec commercial fishery. Its 120 cm / 2.5 kg body-size value and 2–3 hour simmer suggestion are not standardized ingredient measurements or yield evidence.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S07",
      "url": "https://exploramer.qc.ca/wp-content/uploads/2021/04/Repertoire-des-fournisseurs-2021.pdf",
      "title": "Exploramer / Fourchette bleue, Répertoire des fournisseurs 2021",
      "accessedOn": "2026-10-13",
      "locator": "Page 7, Lamproie marine / Sea lamprey / Petromyzon marinus entry: Aucun distributeur.",
      "supports": "Confirms the program's bilingual species identification and that its 2021 supplier directory listed no distributor. It does not prove no other source or product existed.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S08",
      "url": "https://exploramer.qc.ca/wp-content/uploads/2022/05/22.05.04-Repertoire-des-fournisseurs-2022.pdf",
      "title": "Exploramer / Fourchette bleue, Répertoire des fournisseurs 2022",
      "accessedOn": "2026-10-13",
      "locator": "Page 5, Lamproie marine / Sea lamprey / Petromyzon marinus entry: Aucun distributeur.",
      "supports": "Confirms the program's bilingual species identification and that its 2022 supplier directory listed no distributor. It is date-bounded supply evidence, not a current 2026 market survey.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one identity-only PROTEIN reference for Petromyzon marinus using OQLF's preferred Québec edible-fish term lamproie and English sea lamprey. This records an edible species with Québec commercial potential, not current local availability. Preserve empty aliases to avoid eel/sea-eel collisions. Do not add product forms, quantities, unit mappings, yields, conversions, recipe links, or substitutions; the reviewed Québec directories list no distributor and the recipe corpus has no demand.",
      "sourceIds": [
        "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S01",
        "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S03",
        "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S04",
        "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S05",
        "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S06",
        "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S07",
        "WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S08"
      ]
    }
  ]
}
```

No object is proposed for `ingredient-forms.v1.json`, `legacy-import-identities.v1.json`, conversion data, yields, recipe files, recipe links, or substitution rules. The CFIA name-label guidance is recorded below as a naming limitation, but its exact live Fish List row was not verified and is therefore omitted from the identity record's supporting source IDs.

## Source register

| ID | Primary source and scope |
|---|---|
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S01` | [OQLF, `lamproie` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199001/lamproie). Last updated 2011. Preferred Québec food-fish term, English and Latin equivalents, edible-fish domain, commercial-potential note, and terminology-committee caveat. Terminology identity is not current supply evidence. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S02` | [CFIA, Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) and [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). The guidance defines label-naming scope; the browser could not retrieve an exact *P. marinus* Fish List row, so none is claimed. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S03` | [Fisheries and Oceans Canada, Sea Lamprey](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/sealamprey-lamproiemarine-eng.html). Species identity, native Atlantic range, introduced Great Lakes population history, morphology, and biological maximum size. Page modified 2018-05-04. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S04` | [Gouvernement du Québec, Poissons d’eau douce du Québec — affiche](https://cdn-contenu.quebec.ca/cdn-contenu/faune/documents/animaux/affiche-poissons-eau-douce.pdf). Entries 1–5 are Petromyzontidae; poster labels *P. marinus* `Lamproie marine`. Québec species inventory, not a food availability source. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S05` | [Gouvernement du Québec, Lamproie du Nord](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/lamproie-du-nord). *Ichthyomyzon fossor*, threatened status, related lamprey names, and page update date 2026-10-02. This is a distinct taxon and picker-boundary source. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S06` | [Exploramer / Fourchette bleue, Lamproie marine](https://fourchettebleue.ca/produits/lamproie-marine/). *P. marinus*, Québec cuisine name `lamproie`, no current Québec commercial fishery/marketing claim, body-size notes, and culinary preparation description. No visible revision date. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S07` | [Exploramer / Fourchette bleue, Répertoire des fournisseurs 2021](https://exploramer.qc.ca/wp-content/uploads/2021/04/Repertoire-des-fournisseurs-2021.pdf), p. 7. Bilingual species and scientific name; no distributor in that directory. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S08` | [Exploramer / Fourchette bleue, Répertoire des fournisseurs 2022](https://exploramer.qc.ca/wp-content/uploads/2022/05/22.05.04-Repertoire-des-fournisseurs-2022.pdf), p. 5. Bilingual species and scientific name; no distributor in that directory. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S09` | [Mauricie Miam, Fourchette bleue in Mauricie](https://mauriciemiam.ca/2022/03/04/la-microbrasserie-le-presbytere-est-pionniere-en-mauricie-en-recevant-la-premiere-certification-fourchette-bleue/), 2022. Secondary local report on the program's edible-species rationale and mention of Lac Saint-Pierre; not a landing record or product listing. Used only as local context, not in the ledger delta. |
| `WP04-SECTIONP-SEA-LAMPREY-BOUNDARY-R80-20261013-S10` | [Fisheries Research Board of Canada / DFO, Lamprey Fisheries, Past and Present, of North America and Europe](https://waves-vagues.dfo-mpo.gc.ca/Library/40612867.pdf), 1961, pp. 7–8. Historical report describes a lamprey fishery at Southampton, Ontario, and roasted/canned product; not evidence of present-day Québec availability or a current *P. marinus* SKU. |

## Static review record

- Confirmed the exact open checklist wording and inspected current references, forms, ledger, legacy candidates, recipe manifest, search implementation, and proposal/batch archive.
- Candidate-term scans returned no live reference, form, legacy, ledger, or archive owner for the reviewed sea-lamprey names and scientific name; the existing American eel row and generic-eel hold remain separate.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; candidate-name phrase demand: 0.
- Recomputed current and proposed picker projections from display names, aliases, and forms with the phrase-first normalization behavior; values are tabulated above.
- Source-register IDs are unique within this proposal and the R80 prefix has no collision in the live ledger or proposal/batch archive. Source links were checked against the cited official, Exploramer, and local pages/PDFs.
- The reference and ledger JSON examples parse as JSON. UTF-8 without BOM, final newline, no trailing whitespace, and no mojibake markers were checked on this proposal file.
- No app tests, Gradle tasks, emulator, or shared catalog/checklist/ledger files were changed for this proposal-only review.
