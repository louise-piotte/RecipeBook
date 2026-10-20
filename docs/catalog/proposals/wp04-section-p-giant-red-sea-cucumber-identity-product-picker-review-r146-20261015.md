# WP04 Section P — giant red sea cucumber identity and product-picker review (R146)

- **Review date:** 2026-10-15.
- **Open checklist item:** sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood with verified names in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5831).
- **Candidate:** giant red sea cucumber, *Apostichopus californicus*; proposed French display **holothurie de Californie**.
- **Disposition:** **Add one species-scoped identity only.** DFO’s current English and French profiles pair the common names with the accepted species. The 2025/2026 Pacific fishery plan and a current British Columbia supplier document commercial products of that species. This review found no Québec species-labelled retail SKU; DFO says the Canadian market is restricted and most product is exported to Asian markets. The Canadian commercial product evidence and species-specific bilingual name support an identity row, while product parts remain distinct and no household measurement is supported.
- **Data outcome:** Propose one `PROTEIN` ingredient reference with species-qualified aliases. Add no forms, recipe links, measurements, conversions, yields, or substitutions. This document is proposal-only; no shared catalog, ledger, plan, roadmap, generated data, or recipe data changed. No tests were run.

## Scope and prior-work boundary

This is a species-specific follow-up, not a re-review of generic `sea cucumber / concombre de mer`. Earlier reviews held the generic candidate because those names cover multiple species and edible parts. A later review integrated orange-footed sea cucumber, *Cucumaria frondosa*, with its distinct dried, gutted body-wall form. Those decisions remain in the [generic sea-cucumber hold](wp04-sea-cucumber-species-product-boundary-review-20261011.md) and [orange-footed reassessment](wp04-sea-cucumber-current-product-state-reassessment-20261011.md). The current [R145 pitot review](wp04-section-p-northern-propeller-clam-pitot-picker-boundary-review-r145-20261015.md) is a separate shellfish boundary.

The live catalog snapshot contains **1,501 references and 118 forms**. Searches of the Section P plan, proposal and batch archive, active references/forms, legacy-import identities, and ledger found no active reference, form, or legacy candidate for *A. californicus*, its synonym *Parastichopus californicus*, `giant red sea cucumber`, `California sea cucumber`, or `holothurie de Californie`. The unresolved ledger record `candidate-sea-cucumber` and its prior sources discuss the broad category. That record already contains the DFO English species profile (`WP04-SEACUCUMBER-20261011-S06`), but it does not allocate this species as an ingredient reference or decide its picker boundary. Reuse that existing evidence rather than duplicate its ledger source. The current orange-footed reference remains a separate *C. frondosa* identity.

## Identity, taxonomy, and Canadian / Québec naming

Fisheries and Oceans Canada’s English species profile names **Giant Red Sea Cucumber** as *Apostichopus californicus*. Its current French profile, updated 2026-06-12, names the same taxon **holothurie de Californie**. Use these species-qualified display names. I found no OQLF species entry or Québec retail SKU pairing this taxon with a French product label; the DFO French species heading is the direct bilingual Canadian authority for this name.

Use *Apostichopus californicus* as the current accepted taxon. ITIS and WoRMS list *Parastichopus californicus* as a synonym of *A. californicus*. DFO’s 2025 biomass report uses the accepted binomial and says the species is commonly called Giant Red or California Sea Cucumber. A Canadian supplier still uses the older *Parastichopus* combination on its product page. These are consistent species references across an updated scientific name and a retained industry name, not evidence of two ingredient identities. Store both binomials and **California sea cucumber** as searchable English aliases so those source labels resolve to one accepted species row.

CFIA’s Fish List currently presents the species under the older *Parastichopus californicus* name. It lists `Sea Cucumber / Holothurie` and `California Sea Cucumber / Concombre De Mer`; the same Fish List applies `Sea Cucumber / Concombre De Mer` to *Parastichopus tremulus*. OQLF’s general `concombre de mer` entry also says that several holothurian species carry the name. Treat the CFIA pair as regulatory naming evidence, not as a species-specific Québécois preference or deciding taxonomic authority. Keep **concombre de mer**, **holothurie**, **bêche-de-mer**, **biche-de-mer**, and **trepang** out of the alias arrays: they are generic or product-part terms, and the prior generic hold explicitly keeps them unallocated.

The Canadian product evidence is species-linked but geographically bounded. DFO’s 2025/2026 Pacific plan identifies *A. californicus* as the only sea-cucumber species harvested commercially in British Columbia. It describes frozen muscle strips and skin processed by boiling and salting before final drying, with product shipped mainly to Asian markets; its French counterpart says the Canadian market is restricted. A current BC supplier sells giant red sea cucumber meat and skin under the older synonym. This supports a Canadian commercial species/product boundary. It does **not** establish a Québec retail SKU or current Québec shelf availability; the review makes no claim about either.

## Current ownership and picker projection

The picker search projection follows phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Reference display names and aliases are searchable, as are attached form labels and terms; scientific names are searchable only when stored in an alias. The proposed row includes the DFO species names and the two taxon combinations, but no generic aliases or forms.

| Query | Current result count | With proposed row | Result / boundary |
|---|---:|---:|---|
| `giant red sea cucumber` | 0 | 1 | Exact English species name. |
| `California sea cucumber` | 0 | 1 | Source-backed English synonym. |
| `holothurie de Californie` | 0 | 1 | DFO French species name. |
| `Apostichopus californicus` | 0 | 1 | Current accepted binomial alias. |
| `Parastichopus californicus` | 0 | 1 | Synonym used in CFIA and supplier records. |
| `sea cucumber` | 1 | 2 | Orange-footed sea cucumber and this species are both visible; the broad English query remains multi-result. |
| `holothurie` | 1 | 2 | Orange-footed sea cucumber and this species are both visible; the broad French genus term remains multi-result. |
| `concombre de mer` | 1 | 1 | The existing orange-footed row matches through its species-qualified alias `concombre de mer du Nord`. This proposal adds no generic French alias and does not treat the current result as resolution of the generic candidate. |
| `trepang` | 0 | 0 | Product name for dried skin, not a species alias. |
| `bêche-de-mer` | 0 | 0 | Generic product-category wording; not a species alias. |

The English and `holothurie` searches stay multi-result because the proposed display names contain those broad terms and the existing orange-footed species is already searchable. The French generic `concombre de mer` query has a pre-existing single phrase match against `concombre de mer du Nord`; this proposal deliberately does not expand that alias into the unresolved generic name. The species-qualified display and binomials remain directly searchable without assigning generic French terms to *A. californicus*.

## Full bundled-recipe demand

The scan followed all **114** recipe paths in the bundled [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), parsed all **1,123** `ingredients[]` rows, and inspected only each row’s `ingredientName` and `originalText` fields. It excluded recipe titles, instructions, tags, notes, and other JSON text. Matching normalized case, accents, punctuation, and whitespace. Search terms covered *Apostichopus californicus*, *Parastichopus californicus*, `giant red sea cucumber`, `giant red Pacific sea cucumber`, `California sea cucumber`, `holothurie de Californie`, `holothurie du Pacifique`, `concombre de mer`, `sea cucumber`, and `trepang`.

**Result: 0 matching ingredient rows in 0 recipe files.** The bundle provides no direct recipe demand or product-state cue for this candidate; no recipe link or automatic relink is proposed.

## Product forms, numeric evidence, and substitutions

DFO describes two distinct commercial product states: frozen muscle strips and skin that is boiled and salted in British Columbia, then dried for the export market. The French plan calls these *lamelles de muscle congelées* and *peau séchée*. The current BC supplier separates frozen meat from cooked, salted skin and says dried skin can be produced on request. This is enough to identify real species-linked Canadian product states, but not to equate muscle, skin, whole animal, dried skin, or the existing *C. frondosa* body-wall form. Do not add a form until a recipe-facing product boundary is selected and supported.

The supplier’s 2 lb meat packs, 30 lb master cartons, 1 lb skin packs, and 40 lb bulk skin packs are SKU-specific package amounts. DFO’s eviscerated landing weight in pounds and split-pound price reporting are fishery and market measures. Its animal length and weight observations describe biological specimens; DFO also notes that muscle weight and body mass vary with the species’ annual internal-organ cycle. None is a reusable household measure, recipe portion, edible-yield factor, density, or unit conversion. No source reviewed supplies a general culinary drying or rehydration ratio.

No recipe or cited source supports substituting giant red sea cucumber meat or skin for *C. frondosa* body wall, another holothurian, shellfish, or a generic seafood ingredient. Add no substitution rule.

## Source register

Sources were accessed on 2026-10-15 unless a source-specific date is shown. IDs below are local to this proposal, except the explicitly marked source already present in the ledger.

| Source ID | Direct source and locator | Supports and limits |
|---|---|---|
| **Existing ledger source** `WP04-SEACUCUMBER-20261011-S06` | Fisheries and Oceans Canada, [Giant Red Sea Cucumber species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/giant-red-sea-cucumber-holothurie-pac-eng.html), species overview and fishery processing; updated 2026-06-12. | Already recorded in the broad sea-cucumber ledger record. Pairs *Apostichopus californicus* with the English name and describes frozen muscle strips and dried skin. Reuse this evidence; do not duplicate its source ID. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S01` | Fisheries and Oceans Canada, [Holothurie de Californie species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/giant-red-sea-cucumber-holothurie-pac-fra.html), species overview and fishery processing; updated 2026-06-12. | Directly pairs *A. californicus* with French **holothurie de Californie** and describes frozen muscle and dried skin products. Federal French terminology, not a Québec retailer SKU. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S02` | Fisheries and Oceans Canada, [Sea Cucumber (Apostichopus californicus) by dive, 2025/2026](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/sea-cucumber-holothurie-ifmp-pgip-sm-eng.html), Pacific Region IFMP summary, economic profile and products. | Current species-specific BC commercial fishery, frozen muscle strips, skin semi-processed by boiling and salting before export drying, and Asian market orientation. The plan says the species is the only sea cucumber harvested commercially in BC; this does not establish Québec retail availability. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S03` | Fisheries and Oceans Canada, [Holothurie (Apostichopus californicus) en plongée, 2025/2026](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/sea-cucumber-holothurie-ifmp-pgip-sm-fra.html), profil économique et produits. | French counterpart confirms *holothurie*, *lamelles de muscle congelées*, *peau séchée*, and says the Canadian market is restricted. Fishery and market context, not a household measure. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S04` | Fisheries and Oceans Canada, [Biomass estimates for Giant Red Sea Cucumber](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs97-6-3665-eng.pdf), surveys conducted 2014–2020, introduction. | Uses accepted *A. californicus* and states the species is commonly called Giant Red or California Sea Cucumber. Supports the English alias and accepted taxon, not Québec consumer wording. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S05` | ITIS, [*Apostichopus californicus*, TSN 1078919](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=1078919), taxonomy and nomenclature. | Valid accepted name; lists *Parastichopus californicus* as a synonym. Taxonomic authority, not product terminology. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S06` | WoRMS, [*Apostichopus californicus* taxon details](https://www.marinespecies.org/aphia.php?id=529363&p=taxdetails), AphiaID 529363. | Accepted species, synonym *Parastichopus californicus*, and French `holothurie de Californie`. Marine taxonomy and name evidence, not Québec retail evidence. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S07` | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 158344, *Parastichopus californicus*; dynamic list, data modified 2023-09-18. | Lists `Sea Cucumber / Holothurie`, `California Sea Cucumber / Concombre De Mer`, and `Holothurie Du Pacifique`; also applies `Sea Cucumber / Concombre De Mer` to *P. tremulus*. Regulatory naming evidence under the older combination; not the deciding taxonomy authority or Québec-preferred species name. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S08` | RBS Seafood Harvesting, [Sea Cucumbers](https://www.rbsseafoods.com/products/sea-cucumbers/), product description and package options. | Current British Columbia supplier page identifies giant red sea cucumber with the older *Parastichopus californicus* combination; lists frozen meat, cooked/salted skin, and dried skin on request. Its 2 lb, 30 lb, 1 lb, and 40 lb quantities are supplier package sizes only; this is wholesale product evidence, not a Québec retail SKU. |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S09` | Office québécois de la langue française, [concombre de mer](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435715/concombre-de-mer), Grand dictionnaire terminologique, food/fishery-products domain; last updated 1983. | Lists the generic French name family and English `sea cucumber`, and says several holothurian species carry the name. Supports keeping the broad French term separate from this species-specific row. |

## Exact proposed data delta

Add the following identity-only reference. This is a proposal for root review; no shared JSON was edited.

```json
{
  "id": "ingredient-ref-giant-red-sea-cucumber",
  "nameFr": "holothurie de Californie",
  "nameEn": "giant red sea cucumber",
  "aliasesFr": [],
  "aliasesEn": [
    "Apostichopus californicus",
    "California sea cucumber",
    "Parastichopus californicus"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not add bare `sea cucumber`, `concombre de mer`, `holothurie`, `bêche-de-mer`, `biche-de-mer`, or `trepang` as aliases; the species-qualified English and French display names necessarily contain `sea cucumber` and `holothurie`, and their projected queries remain multi-result. Keep the existing orange-footed dried-body-wall form and all muscle/skin/whole product forms separate. Add no culinary quantity, density, package mapping, conversion, yield, recipe link, or substitution. The source-supported identity can be integrated without deciding those product or generic-category questions.
