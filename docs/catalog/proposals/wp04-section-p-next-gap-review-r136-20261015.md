# WP04 Section P — Icelandic scallop identity review (R136)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Icelandic scallop, *Chlamys islandica*; Québec French **pétoncle d’Islande**.
- **Recommendation:** Add an identity-only `PROTEIN` reference for this species, with only species-qualified English and French names. The current picker keeps broad scallop queries multi-result, and the exact species terms resolve only to this candidate. Keep it separate from generic scallop, sea scallop, and dried scallop.
- **Data boundary:** Record MAPAQ’s species-specific 7–25 g muscle range as a source-reported observation only. Add no form, density, unit mapping, recipe link, conversion, edible or cooking yield, or substitution.
- **Write scope:** This proposal only. No shared catalog JSON, ledger, generated file, plan, or roadmap was edited.

## Open checklist and candidate selection

The active Section P parent remains **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.”** in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5334). R130 and R131 added Pacific and Eastern oysters, R132 held whole/live green sea urchin, R133 added Mediterranean mussel, and R135 held Olympia oyster because its shared English common name and French mapping cannot be represented safely by the current picker. This review selects a separate scallop species with a distinct, documented Québec market name. It does not repeat those prior decisions.

The species is useful as a narrow identity: current Québec sources name the Icelandic scallop as a cultured and commercial species, DFO’s current survey dataset identifies *C. islandica*, and a Sept-Îles fishmonger lists a “petit pétoncle d’Islande.” A Labrador seafood co-operative also lists the product with its scientific name. These sources establish a Canadian food-market context, while the species-qualified pair avoids claiming that every generic scallop request names this taxon. The broad `scallop` and `pétoncle` searches already have several results and remain multi-result after the proposed row.

## Ownership and prior-decision audit

The reviewed snapshot contains **1,488 active references**, **109 forms**, **61 legacy-import candidates**, and **1,833 research-ledger records** (**7,655 source entries / 6,511 distinct source IDs**). The bundled manifest lists **114 recipes**.

No active reference, form, or legacy candidate uses `ingredient-ref-icelandic-scallop`, *Chlamys islandica*, or the qualified terms `Icelandic scallop`, `Iceland scallop`, and `pétoncle d’Islande`; no ledger record is keyed to this ID or taxon. The sea-scallop ledger record cites the same MAPAQ guide and mentions Icelandic scallop as a separate species in source context, but its identity and only measurement observation concern *Placopecten magellanicus* (10–50 g). This proposal assigns MAPAQ’s 7–25 g Iceland-scallop interval to a separate species-keyed record. The active related references are:

- `ingredient-ref-scallop`: species-unspecified marketed scallop / pétoncle.
- `ingredient-ref-sea-scallop`: sea scallop / pétoncle géant, *Placopecten magellanicus*.
- `ingredient-ref-dried-scallop`: dried scallop / pétoncle séché, including `conpoy`.

None has an attached form. The generic and sea-scallop references have ledger records; the dried-scallop record remains a distinct product identity. Existing decisions are preserved, and this packet does not reopen the separate smoked-scallop product hold. A search of prior proposals and batches found references to Iceland scallop as a species context, but no focused Icelandic-scallop identity decision or allocation.

The proposed ID `ingredient-ref-icelandic-scallop` is unallocated. The proposal-local source prefix **`WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015`** was checked against the shared ledger, proposal files, and batch files; no collision was found.

## Species name and bilingual display

Use the accepted taxon *Chlamys islandica* and the display pair **Icelandic scallop / pétoncle d’Islande**.

- MAPAQ’s 2025 pectiniculture guide identifies *Chlamys islandica* as **pétoncle d’Islande**; the relevant species passage is French-only and does not provide an English common name. The current Québec aquaculture page, updated 2026-06-16 and reporting 2025 data, says that several scallop species are cultivated in Québec. [S01–S02]
- The English display term is supported separately: MAPAQ’s 2009 species table lists *C. islandica* with English **Icelandic scallop**, and Torngat lists **“Icelandic Scallops (Chlamys Islandica)”**. DFO and ITIS use **Iceland scallop**. [S07, S09–S10, S12]
- CFIA’s Fish List has separate rows for *C. islandica* (TSN 79619): one pairs `Icelandic Scallop` with `Coquille Saint-Jacques`, while another gives French-only `Pétoncle D’Islande`; it also lists `Pétoncle De L’Atlantique`. These rows do not establish the proposed English/French display pair, and the other French labels are not appropriate Québec picker terms. [S05]
- OQLF normalizes **pétoncle** for Québec, pairs the food term with English **scallop**, and identifies Québec catches as *C. islandica* (pétoncle d’Islande) and *P. magellanicus* (pétoncle géant). It discourages **coquille Saint-Jacques**, whose named species are European. The entry was last updated in 1998, so use it for Québec terminology, not current inventory. [S06]
- DFO’s 2021 English bivalve page lists **Iceland scallop (Chlamys islandicus)**, and its French counterpart gives **pétoncle d’Islande (Chlamys islandicus)**. This is a bilingual common-name pair with an older taxon spelling, not a separate species: MAPAQ, CFIA, and ITIS use *C. islandica*, and a 2015 DFO technical report explicitly directs its database to “correct species name to *Chlamys islandica*.” The current DFO survey dataset also uses *C. islandica*. [S03, S07–S09, S13]

Use `Iceland scallop` as a species-qualified English alias because DFO and ITIS use it. [S07, S09] Use the co-op’s product wording `Icelandic scallops` as an English plural alias and the regular French plural `pétoncles d’Islande` as a search alias. [S10–S12] Do not add `scallop`, `scallops`, `pétoncle`, or `pétoncles` as aliases: the canonical displays already contain these broad terms, and they belong to multiple active species/product results. [S05–S06] Do not add the binomial, `coquille Saint-Jacques`, `noix de Saint-Jacques`, `peigne islandais`, or `pétoncle de l’Atlantique` as aliases. The last term is broad and the CFIA alternatives do not establish a preferred Québec display. [S05–S06]

## Canadian and Québec food-market evidence

- The current Québec government [portrait of commercial aquaculture](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-aquaculture-commerciale) says Québec marine farms cultivate “différentes espèces de pétoncles”; the linked MAPAQ pectiniculture guide specifically identifies *P. magellanicus* and *C. islandica*. It documents cultivation and commercialization in Québec, not a species-specific current retail pack. [S01–S02]
- DFO’s [Mingan Archipelago Icelandic scallop survey dataset](https://open.canada.ca/data/en/dataset/3b5a7db7-e007-4202-bb24-201e4ee907a0) names *C. islandica* and describes surveys at one- or two-year intervals. Its data include biometrics, sizes, weights, and sex through 2025; the portal record was modified 2026-03-24. This is current Québec fishery and science context, not retail inventory or kitchen-measure evidence. [S03]
- DFO’s 2022 Québec stock assessment says the commercial fishery targets both pétoncle d’Islande and pétoncle géant, and that landings are generally recorded as muscle weight. It also says the shelled muscles are difficult to distinguish visually, while a fishing sector’s catch is generally one species. This supports separate taxon identities and shows why a generic shucked scallop listing cannot be assigned to *C. islandica* without species wording. [S04]
- The current [Torngat Fish Co-op seafood page](https://www.torngatfishcoop.com/about) lists **“Icelandic Scallops (Chlamys Islandica)”** among its seafood offerings. The co-op says its seafood is harvested from Labrador Sea waters and that products ship within Newfoundland and Labrador and to the rest of Canada. This is direct Canadian supplier evidence for the product/taxon pair; the page does not give an Icelandic-scallop pack size or guarantee current stock. [S10]
- Sept-Îles’ [Poissonnerie Soucy product page](https://www.dupecheur7iles.ca/poissonnerie-soucy) lists **“Pétoncles U12”** and says several scallop formats are available year-round, from **“du petit pétoncle d’islande”** to the larger U12 scallop. The same page describes the counter as seasonal (March–October) and says frozen products can be obtained by appointment in winter. This is local Québec retail wording and seller catalog context, not a binomial, species-specific size/weight, or stock guarantee; it does not assign every U12 product to *C. islandica*. [S11]

Together, the Québec aquaculture sources establish cultivation context, while the two seller pages provide Canadian product listings; the DFO pages provide fishery and survey context. The Sept-Îles listing supplies the direct local French market wording, and the co-op supplies a Canadian seller’s explicit species pairing. These listings support a Canadian food-market identity but do not guarantee current inventory or make generic scallop products species-identifiable.

### Direct source links

| ID | Direct source |
|---|---|
| S01 | [Gouvernement du Québec, Portrait de l’aquaculture commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-aquaculture-commerciale) |
| S02 | [MAPAQ / CEGRIM, La pectiniculture](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_pectiniculture_MAPAQ.pdf) |
| S03 | [DFO, Scientific survey of Icelandic scallop in the Mingan Archipelago](https://open.canada.ca/data/en/dataset/3b5a7db7-e007-4202-bb24-201e4ee907a0) |
| S04 | [DFO, Évaluation des stocks de pétoncles des eaux côtières du Québec en 2022](https://publications.gc.ca/collections/collection_2023/mpo-dfo/fs70-6/Fs70-6-2023-034-fra.pdf) |
| S05 | [CFIA Fish List, scallop results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=scallop) |
| S06 | [OQLF, pétoncle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199064/petoncle) |
| S07 | [DFO, Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) |
| S08 | [DFO benthic database review report](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/359886.pdf) |
| S09 | [ITIS, Chlamys islandica, TSN 79619](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=79619) |
| S10 | [Torngat Fish Co-op seafood page](https://www.torngatfishcoop.com/about) |
| S11 | [Poissonnerie Soucy product page](https://www.dupecheur7iles.ca/poissonnerie-soucy) |
| S12 | [MAPAQ, Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf) |
| S13 | [DFO, Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm) |

## Forms, measurements, and substitutions

MAPAQ’s current pectiniculture guide describes broad scallop marketing states: adductor muscle sold fresh or frozen by meat weight, possible sale of the gonad (“corail”), and whole juvenile scallops marketed as “princesses.” It does not map those states to *C. islandica*. Do not add `fresh`, `frozen`, `whole`, `live`, `roe-attached`, or `princess` as a form under this identity based on that family-level material. The current reference catalog has no forms for generic scallop or sea scallop either. [S02]

MAPAQ’s older *Les mollusques du Québec* guide reports an Iceland-scallop shell diameter of **7–11 cm** and says the weight of its muscle reaches **7–25 g**. The muscle interval is species-specific, so it is appropriate as a source-reported count-weight observation in the research ledger. It is not a recipe serving, a count-per-pound grade, an edible-yield ratio, or a mass/volume conversion; the guide does not specify a weighing method or product state. DFO’s newer survey dataset includes scientific biometrics but does not establish a general kitchen amount. Keep the observation out of `defaultDensity`, `unitMappings`, and forms. [S03, S12]

No reviewed source establishes a global substitution between *C. islandica*, *P. magellanicus*, dried/conpoy scallop, or a generic scallop ingredient. Similar family membership and a shared marketed muscle are not a validated recipe substitution. The bundled corpus has no Icelandic-scallop recipe context from which to justify a contextual replacement. Record substitution research as complete with no supported substitute; add no conversion rule, contextual rule, recipe-line link, or replacement quantity.

## Picker projection

The projection reproduces the phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) against the current references and forms, then adds the proposed bilingual displays and aliases. Scientific names are not separate, non-searchable qualifiers in the reference schema.

| Query | Current exact phrase results | With proposed row | Effect |
|---|---|---|---|
| `scallop` / `scallops` | 3: dried scallop, generic scallop, sea scallop | Those three plus Icelandic scallop | Broad English searches remain multi-result. |
| `pétoncle` / `pétoncles` | 3: dried scallop, generic scallop, sea scallop | Those three plus pétoncle d’Islande | Broad Québec French searches remain multi-result. |
| `Icelandic scallop` / `Icelandic scallops` | 0 | Icelandic scallop only | Source-qualified English terms resolve to the species row. |
| `Iceland scallop` | 0 | Icelandic scallop only | DFO/ITIS alternate species name resolves through a qualified alias. |
| `pétoncle d’Islande` / `pétoncles d’Islande` | 0 | pétoncle d’Islande only | The Québec species-specific term resolves to the row. |
| `coquille Saint-Jacques`, `noix de Saint-Jacques`, `peigne islandais`, `pétoncle de l’Atlantique` | 0 | 0 | Conflicting or non-preferred names stay unassigned. |

The result projection adds one species choice to already multi-result broad searches. It does not create a single species result for generic `scallop` / `pétoncle`, and the exact qualified name does not collide with the generic or sea-scallop reference.

## Manifest recipe demand

The full bundled-library manifest was parsed and all **114 manifest-listed recipe files** were read. The corrected demand scan inspected only strings inside each recipe’s `ingredients` array: `ingredientName`, `originalText`, and ingredient-row notes when present. It did not count titles, instructions, source descriptions, tags, or other non-ingredient fields as recipe demand. All **1,123 ingredient rows** were scanned for scallop and pétoncle terms, Icelandic/Iceland scallop names, *C. islandica* and *C. islandicus*, `corail`, and Saint-Jacques/peigne alternatives. The scan found **0 matching recipe files and 0 matching ingredient rows**; no row is linked to an active scallop reference. No recipe link is proposed.

## Recommendation and exact candidate JSON delta

Add `ingredient-ref-icelandic-scallop` as an identity-only `PROTEIN` reference. Its scope is the species-qualified edible scallop ingredient; preserve the whole/roe/live product state as unresolved unless a recipe and product source establish the intended form. Do not modify the generic `ingredient-ref-scallop`, sea-scallop, or dried-scallop decisions.

### Ingredient reference

```json
{
  "id": "ingredient-ref-icelandic-scallop",
  "nameFr": "pétoncle d\u2019Islande",
  "nameEn": "Icelandic scallop",
  "aliasesFr": [
    "pétoncles d\u2019Islande"
  ],
  "aliasesEn": [
    "Iceland scallop",
    "Icelandic scallops"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not add generic scallop/pétoncle aliases, scientific names, `coquille Saint-Jacques`, or broad Atlantic/peigne terms.

### Research ledger record

The record keeps the MAPAQ range as a source-scoped observation only. Its `researched_supported` measurement state does not imply a recipe amount or active conversion. Substitution research is `researched_no_supported_substitute`; no substitution finding or candidate rule is proposed.

```json
{
  "recordId": "ingredient-ref-icelandic-scallop",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S01",
      "url": "https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-aquaculture-commerciale",
      "title": "Gouvernement du Québec, Portrait de l’aquaculture commerciale",
      "versionOrDate": "Updated 2026-06-16; reports 2025 data",
      "accessedOn": "2026-10-15",
      "locator": "Inland/water aquaculture section; marine species and linked MAPAQ pectiniculture guide.",
      "supports": "States that different scallop species are cultivated in Québec. The page is current production context; the linked guide identifies Chlamys islandica specifically.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S02",
      "url": "https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_pectiniculture_MAPAQ.pdf",
      "title": "MAPAQ / CEGRIM, La pectiniculture",
      "versionOrDate": "Québec legal deposit 2025",
      "accessedOn": "2026-10-15",
      "locator": "PDF pages 1 and 5: French species identification on p. 1 and general commercialization strategies on p. 5.",
      "supports": "Identifies Chlamys islandica as pétoncle d’Islande; the relevant species passage is French-only and provides no English common name. This is a maritime risk-response information sheet that also describes Québec cultivation and general muscle, gonad, and juvenile whole-product marketing strategies, without assigning each state to this species or documenting current retail availability.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S03",
      "url": "https://open.canada.ca/data/en/dataset/3b5a7db7-e007-4202-bb24-201e4ee907a0",
      "title": "Fisheries and Oceans Canada, Scientific survey of Icelandic scallop (Chlamys islandica) in the Mingan Archipelago",
      "versionOrDate": "Published 2025-10-01; record modified 2026-03-24; survey data include biometrics through 2025",
      "accessedOn": "2026-10-15",
      "locator": "Dataset description and record metadata.",
      "supports": "Uses Icelandic scallop / Chlamys islandica for an ongoing Québec survey and describes size, weight, and sex data. Scientific biometrics are not a kitchen portion or conversion.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S04",
      "url": "https://publications.gc.ca/collections/collection_2023/mpo-dfo/fs70-6/Fs70-6-2023-034-fra.pdf",
      "title": "Fisheries and Oceans Canada, Évaluation des stocks de pétoncles des eaux côtières du Québec en 2022",
      "versionOrDate": "2022 assessment, published 2023",
      "accessedOn": "2026-10-15",
      "locator": "Description of the fishery, pp. 5–6 of the report.",
      "supports": "Describes the Québec commercial fishery as targeting both pétoncle d’Islande and pétoncle géant; reports landings generally by muscle weight and notes that shelled muscles are difficult to distinguish visually. Does not support a recipe conversion or substitution.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S05",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=scallop",
      "title": "Canadian Food Inspection Agency, Fish List results for scallop",
      "versionOrDate": "Fish List modified 2023-09-18; query checked 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Separate TSN 79619 rows for Chlamys islandica.",
      "supports": "Lists Icelandic Scallop paired with Coquille Saint-jacques in one row, Pétoncle d’Islande without an English name in a separate row, and Pétoncle de l’Atlantique in another. The separate rows do not establish the proposed bilingual display pair.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S06",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199064/petoncle",
      "title": "Office québécois de la langue française, pétoncle (GDT)",
      "versionOrDate": "Updated 1998",
      "accessedOn": "2026-10-15",
      "locator": "Food-domain preferred term, English equivalent, species note, and discouraged term.",
      "supports": "Normalizes pétoncle / scallop for Québec, names Chlamys islandica as pétoncle d’Islande among Québec catches, and discourages coquille Saint-Jacques for Canadian scallops.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S07",
      "url": "https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm",
      "title": "Fisheries and Oceans Canada, Identifying bivalve shellfish",
      "versionOrDate": "Modified 2021-06-09",
      "accessedOn": "2026-10-15",
      "locator": "Scallops section, Iceland scallop entry.",
      "supports": "Uses the English name Iceland scallop for Chlamys islandicus. The paired French page gives pétoncle d’Islande for that older spelling; the currently accepted species spelling is supported separately by current taxonomic and fisheries sources.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S08",
      "url": "https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/359886.pdf",
      "title": "Fisheries and Oceans Canada, benthic database review report",
      "accessedOn": "2026-10-15",
      "locator": "Species record 4322, Chlamys islandicus.",
      "supports": "The DFO report’s instruction is: “Database: correct species name to Chlamys islandica.” It identifies the earlier islandicus spelling as a database name to correct, not a separate species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S09",
      "url": "https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=79619",
      "title": "Integrated Taxonomic Information System, Chlamys islandica, TSN 79619",
      "accessedOn": "2026-10-15",
      "locator": "Current taxonomic record and common-name field.",
      "supports": "Lists Chlamys islandica as the valid species and Iceland scallop as an English common name.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S10",
      "url": "https://www.torngatfishcoop.com/about",
      "title": "Torngat Fish Co-op, Happy Valley–Goose Bay Fish Market and Co-operative",
      "accessedOn": "2026-10-15",
      "locator": "Seafood offering list and company/product description.",
      "supports": "Lists “Icelandic Scallops (Chlamys Islandica)” and says its seafood is harvested from Labrador Sea waters and shipped within Newfoundland and Labrador and to the rest of Canada. Seller-page product evidence, not a pack-size or stock guarantee.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S11",
      "url": "https://www.dupecheur7iles.ca/poissonnerie-soucy",
      "title": "Poissonnerie Soucy, seafood product listings",
      "accessedOn": "2026-10-15",
      "locator": "Pétoncles U12 listing and the description of several scallop formats available year-round.",
      "supports": "Uses the Québec product wording “petit pétoncle d’islande” and contrasts it with larger U12 scallops; the page says several scallop formats are available year-round. It also describes the fish counter as seasonal and winter frozen products as available by appointment. The seller does not identify the binomial or state which sizes/species are in each package, and this page does not guarantee current stock.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S12",
      "url": "https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf",
      "title": "MAPAQ, Les mollusques du Québec",
      "versionOrDate": "Publication number 09-0018; 2009",
      "accessedOn": "2026-10-15",
      "locator": "Species/common-name table and pétoncle d’Islande size and weight section, pp. 4–5 of the PDF.",
      "supports": "Lists Chlamys islandica with the English common name “Icelandic scallop” and the French display Pétoncle d’Islande. Reports a 7–11 cm shell diameter and states “le poids de son muscle atteint de 7 g à 25 g.” The muscle range is a source-specific individual observation, not a serving, method-defined count measure, cooking yield, or unit conversion.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S13",
      "url": "https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm",
      "title": "Fisheries and Oceans Canada, Identification des mollusques bivalves",
      "versionOrDate": "Modified 2021-06-09",
      "accessedOn": "2026-10-15",
      "locator": "Pétoncles section, pétoncle d’Islande entry.",
      "supports": "Uses the French name pétoncle d’Islande and prints Chlamys islandicus. The paired English page gives Iceland scallop for that older spelling; this page does not establish the currently accepted taxon spelling.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "icelandic-scallop-one-muscle-weight-range-20261015",
      "relationship": "count_weight",
      "valueIntervals": [
        {
          "lowerValue": 7,
          "upperValue": 25,
          "unit": "g",
          "lowerInclusive": null,
          "upperInclusive": null,
          "intervalKind": "source_reported_range",
          "origin": "source_reported",
          "reportedText": "Le poids de son muscle atteint de 7 g à 25 g."
        }
      ],
      "sourceQuantity": {
        "amount": 1,
        "unit": "muscle"
      },
      "foodDescription": "One Chlamys islandica muscle, as described by MAPAQ.",
      "foodState": "Not stated; the source does not specify fresh, frozen, or cooked state.",
      "measurementMethod": "MAPAQ source-reported range in its species-specific size/weight section; sampling and weighing method are not stated.",
      "quantityBasis": "One muscle is the source unit, not a serving. The guide does not pair muscle weight with shell-on whole weight or describe an edible-yield method.",
      "evidenceKind": "estimate",
      "sourceIds": [
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S12"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only Icelandic scallop / pétoncle d’Islande for Chlamys islandica. Keep generic scallop, sea scallop, and dried scallop separate; retain only source-qualified species names.",
      "sourceIds": [
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S02",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S03",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S05",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S06",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S07",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S08",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S09",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S10",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S11",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S12",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S13"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Keep the MAPAQ 7–25 g muscle interval only as a source-reported observation; it does not support a recipe portion, density, unit mapping, package yield, or conversion. No source or bundled recipe supports substitution for this species; add no form or substitution rule.",
      "sourceIds": [
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S02",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S03",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S04",
        "WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S12"
      ]
    }
  ]
}
```

## Static review record

- Re-read the open Section P checklist and R130–R135 plan/roadmap context; reviewed the live reference catalog, forms, legacy candidates, research ledger, and recent shellfish proposals/batches.
- Confirmed that the proposed ID, source prefix, and qualified terms have no active owner or prior focused decision. Existing generic, sea, and dried scallop identities have no forms attached.
- Reproduced current picker search behavior and the proposed-row projection; broad English/French queries remain multi-result.
- Parsed the manifest and scanned all 114 recipe files / 1,123 ingredient rows using ingredient-field-only text. There were no matches for the species or related scallop terms.
- The proposed ledger record follows `docs/catalog/research-ledger.schema.json`; the interval is a research observation only. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. This work changes only a proposal document; no shared data was changed.
