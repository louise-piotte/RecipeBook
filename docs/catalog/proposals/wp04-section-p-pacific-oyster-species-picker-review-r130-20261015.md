# WP04 Section P — Pacific oyster species and picker review (R130)

- **Review and source-access date:** 2026-10-15.
- **Packet type:** one species-level oyster identity, taxonomy, Québec naming, Canadian market, picker, and recipe-demand review.
- **Candidate:** Pacific oyster / *huître creuse du Pacifique*; current accepted taxon *Magallana gigas*, reported in Canadian fish-name and fishery sources as *Crassostrea gigas*.
- **Accepted decision:** Add one identity-only `PROTEIN` reference as `Pacific oyster / huître creuse du Pacifique`. Keep the generic fresh-oyster candidate unresolved. Add only the source-supported qualified name variants listed in the exact delta below.
- **Shared-data effect:** the identity reference and an evidence-backed ledger record were integrated. No forms, measurements, recipe links, conversions, yields, or substitutions were added. Database JSON additions require no tests under the current `AGENTS.md` rule.

## Parent checklist and scope

The exact open Section P parent item is **Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below** in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5279). The parent remains open.

This review covers only the species *M. gigas* (the *C. gigas* combination still used by Canadian food-name sources). The earlier [fresh-oyster review](wp04-section-p-fresh-oyster-identity-boundary-review-20261012.md) held the *unqualified* fresh-oyster candidate and explicitly excluded species-qualified oyster items. That generic hold remains correct and is not reopened here. No other focused Pacific-oyster proposal or allocation was found. The active dried-oyster, oyster-sauce, vegan oyster-sauce, and oyster-mushroom identities remain separate.

## Ownership and prior-work audit

At the 2026-10-15 snapshot, the live package contained **1,477 references** and **109 forms**; the legacy-import file contained **61 candidates**; the ledger contained **1,822 records**; and the manifest listed **114 recipes**. Scans of active names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs found no owner for `ingredient-ref-pacific-oyster`, *Pacific oyster*, *huître creuse du Pacifique*, *Crassostrea gigas*, or *Magallana gigas*. The existing ledger row `ingredient-ref-fresh-oyster` remains `candidate` / `needs_clarification`; it does not allocate this species.

The active oyster-adjacent references are `ingredient-ref-dried-oyster`, `ingredient-ref-oyster-sauce`, `ingredient-ref-vegan-oyster-sauce`, `ingredient-ref-oyster-mushroom`, and `ingredient-ref-king-oyster-mushroom`. No live form is attached to a fresh or Pacific oyster identity. The proposal-local source prefix **`WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015`** was searched in the ledger and proposal/batch archive before assignment; no prior match was found.

## Species identity, taxonomy, and Québec naming

The CFIA Fish List currently reports *Crassostrea gigas* (TSN 79868) with **Pacific Oyster / Huître du Pacifique** and **Oyster / Huître Creuse Pacifique** rows. It also includes an unqualified **Huître** row for *C. gigas*, while other oyster taxa have their own unqualified `Oyster` or `Huître` rows. Use the species-qualified names only; do not attach bare `oyster` or `huître` as aliases. The CFIA list is Canadian fish-label nomenclature, not evidence of a particular package, recipe equivalence, or the current accepted zoological combination. [S01]

OQLF's edible-fish GDT entry gives the preferred Québec French term **huître creuse du Pacifique**, pairs it with English **Pacific oyster**, and names *Crassostrea gigas*. It says the species has commercial potential in Québec. The entry was last updated in 2012, so it establishes normalized Québec terminology and species scope, not current Québec inventory. OQLF says **huître japonaise** and **huître géante du Pacifique** were not retained by the fish-product terminology committee; neither is proposed as an alias. [S02]

Current taxonomic sources recognize a name transition without indicating a different oyster species. ITIS treats *Magallana gigas* as the valid name and *Crassostrea gigas* as its synonym; WoRMS also accepts *M. gigas*. A CFIA notice dated 2026-09-04 describes changing its susceptible-species list from *C. gigas* to *M. gigas* effective 2026-10-05. That notice concerns aquatic-animal import-health requirements; it is not a change to the CFIA Fish List's common food names. DFO's current 2026/2027 plan and the OQLF entry continue to display *C. gigas*. Record both combinations in the evidence; do not create two catalog identities or scientific-name search aliases. [S03–S05]

## Canadian and Québec human-food-market evidence

- DFO's current 2026/2027 Pacific Region plan identifies the species as Pacific oyster (*Crassostrea gigas*) and describes an active commercial fishery on British Columbia's south coast. The plan was modified 2026-03-12. This is current Canadian harvest and market-sector evidence, not a claim of routine Québec availability or a consumer retail product. [S06]
- Vancouver supplier Smokey Bay lists farmed, Canadian-origin Pacific oysters, explicitly names *Crassostrea gigas*, and describes its wholesale product as live and whole in-shell with year-round availability. Its case quantities and size classes apply to this supplier's commercial product, not household measures or universal forms. The page has no item-specific publication date. [S07]
- Metro Québec currently retains a product page titled **Huîtres du Pacifique entières dans l'eau**, 133 g, but marked out of stock when reviewed. The page does not provide a binomial. It supports Québec use of the qualified Pacific wording, but not current availability or the species of a particular lot. The 133 g is a package size, not a recipe measure. [S08]

Together the official name, OQLF normalization, active Canadian fishery, and a species-labelled Canadian seafood product support a species-only identity. The local Metro page is corroborating Québec market wording only; do not claim that the species-specific item was in stock in Québec on the review date.

## Picker projection

The projection follows the current phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It adds one hypothetical row with the exact display and aliases shown in the proposed JSON delta. Broad names stay visible alongside existing seafood-related choices.

| Query | Current result | With proposed row | Boundary |
|---|---|---|---|
| `Pacific oyster` | None | Pacific oyster / huître creuse du Pacifique | Qualified English name selects this species. |
| `Pacific oysters` | None | Pacific oyster / huître creuse du Pacifique | Supported plural alias selects this species. |
| `huître creuse du Pacifique` | None | Pacific oyster / huître creuse du Pacifique | OQLF-preferred Québec French term selects this species. |
| `huître du Pacifique`, `huîtres du Pacifique` | None | Pacific oyster / huître creuse du Pacifique | CFIA singular and current Québec retail plural wording remain species-qualified. |
| `oyster` | Five existing rows: dried oyster, king oyster mushroom, oyster mushroom, oyster sauce, and vegan oyster sauce | Those five plus Pacific oyster | Bare English search gains a choice; it does not resolve generic fresh oyster. |
| `oysters` | Dried oyster | Dried oyster plus Pacific oyster | The plural alias preserves both preserved and species-qualified choices. |
| `huître` / `huitre` | Dried oyster, oyster mushroom, oyster sauce | Those three plus Pacific oyster | Bare French search remains multiple-choice. |
| `huîtres` / `huitres` | Existing dried oyster and oyster-sauce wording | Existing results plus Pacific oyster | Plural search remains multiple-choice. |
| `Pacific` / `Pacifique` | Six existing Pacific-qualified fish references, with one additional Indo-Pacific mackerel match in French | Existing results plus Pacific oyster | Geographic modifier remains a broad multi-result query. |
| `Japanese oyster`, `huître japonaise`, *Crassostrea gigas*, *Magallana gigas* | None | None | Excluded from picker aliases; taxonomy remains in the source record. |

Do not add aliases for bare `oyster`, `oysters`, `huître`, `huîtres`, `Pacific`, or `Pacifique`. Keep the generic fresh-oyster candidate unresolved. Keep dried oyster and other oyster-named ingredients separate.

## Bundled recipe demand and data boundaries

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and complete recipe JSON text were checked for `Pacific oyster(s)`, *huître creuse du Pacifique*, *huître(s) du Pacifique*, *Crassostrea gigas*, *Magallana gigas*, `Pacific cupped oyster`, `Japanese oyster`, and the other proposed or excluded qualified names. The scan found **zero matching files and zero matching ingredient rows**. A separate broad `oyster` / `huître` row scan also found no bundled ingredient-line mentions. There is no recipe link or species-specific recipe demand.

Add no form, density, unit mapping, conversion, package-size mapping, count weight, edible or cooking yield, or substitution. DFO's fishery quota, Smokey Bay's live whole-shell wholesale offering and dozen-based case sizes, and Metro's out-of-stock 133 g can are source-specific market observations. They do not establish a reusable recipe amount, a universal species form, or interchangeability with American oyster, dried oyster, or oyster sauce. Do not infer raw-consumption, handling, or cooking equivalence.

## Recommendation and exact candidate delta

Add only identity `ingredient-ref-pacific-oyster` in category `PROTEIN`, with the preferred Québec display and narrowly scoped name variants below. Keep *Magallana gigas* / *Crassostrea gigas* in the research evidence rather than picker aliases. Keep generic fresh oyster unresolved. **No forms, measurements, recipe links, conversions, yields, or substitutions are supported.**

```json
{
  "id": "ingredient-ref-pacific-oyster",
  "nameFr": "hu\u00eetre creuse du Pacifique",
  "nameEn": "Pacific oyster",
  "aliasesFr": [
    "hu\u00eetre du Pacifique",
    "hu\u00eetres du Pacifique"
  ],
  "aliasesEn": [
    "Pacific oysters"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

## Source register

These proposal-local IDs are not shared-ledger records. The prefix was checked against the current ledger and existing proposal/batch files before use.

| Source ID | Source and support | Limits |
|---|---|---|
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S01** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [searchable Fish List results](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp). The result set pairs *Crassostrea gigas* (TSN 79868) with Pacific Oyster / Huître du Pacifique and lists unqualified oyster names across multiple oyster taxa. The result set was retrieved 2026-10-15; the overview was last modified 2019-06-28. | Canadian labelling-name evidence; the Fish List does not resolve recipe intent or current consumer inventory. Its displayed *Crassostrea* name is distinct from current taxonomic databases' accepted *Magallana* combination. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S02** | OQLF, [huître creuse du Pacifique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198688/huitre-creuse-du-pacifique), last updated 2012. Preferred Québec name, English equivalent, species, Québec commercial-potential note, and non-retained alternate terms. | Terminology and species-name evidence, not a current product listing or market census. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S03** | Integrated Taxonomic Information System, [*Magallana gigas*, TSN 1267873](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=1267873), retrieved 2026-10-15. Accepts *M. gigas* and lists *Crassostrea gigas* as a synonym. | Taxonomic status and synonymy only; does not set Canadian food labels. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S04** | World Register of Marine Species, [*Magallana gigas*](https://www.marinespecies.org/aphia.php?id=836033&p=taxdetails), retrieved 2026-10-15. Accepts *M. gigas* and lists *C. gigas* as a superseded combination. | Marine taxonomy database; not Canadian market or label evidence. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S05** | CFIA, [2026-09-04 notice on susceptible aquatic-animal species](https://inspection.canada.ca/en/animal-health/aquatic-animals/notices-industry/2026-09-04). Describes the *Crassostrea gigas* to *Magallana gigas* taxonomic update, effective 2026-10-05. | This notice concerns import-health susceptibility lists and requirements; it does not amend or explain the Fish List's common names. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S06** | Fisheries and Oceans Canada, [Pacific oyster 2026/2027 integrated fisheries management plan summary](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/oyster-huitre-ifmp-pgip-sm-fra.html), modified 2026-03-12. Identifies *C. gigas* and describes an active British Columbia commercial fishery. | Current fishery and Canadian supply context; not Québec retail availability, household measures, or a consumer recipe. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S07** | Smokey Bay Seafood, [Live Pacific Oysters for Raw Bar](https://smokeybay.com/pacific-oysters/), accessed 2026-10-15. Lists *C. gigas*, British Columbia origin, farmed, live, whole in shell, and year-round supplier availability. | One Canadian wholesale supplier's page, undated at item level; presentation, case quantity, and size classes are not generic catalog forms or measures. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S08** | Metro Québec, [Huîtres du Pacifique entières dans l'eau Clover Leaf](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/huitres-du-pacifique-entieres-dans-l-eau/p/061362444406), accessed 2026-10-15. The 133 g product page uses the Québec plural name. | Marked out of stock when checked; no binomial supplied. Supports local listing terminology only; net package weight is not a recipe amount. |
| **WP04-SECTIONP-PACIFIC-OYSTER-R130-20261015-S09** | Local static audit of the plan, roadmap, live references/forms, legacy candidates, ledger, recipe manifest/corpus, search implementation, and focused Section P proposals/batches; accessed 2026-10-15. | Bounded repository snapshot and search; absence from bundled recipes or reviewed listings does not prove universal absence of demand or Québec availability. |

## Static review record

- Read `AGENTS.md`, Requirements FR-3/FR-5/FR-7, the current Section P plan and roadmap context, live references/forms, legacy candidates, research ledger, manifest-listed recipes, and `IngredientSearch.kt`.
- Audited the existing fresh-oyster hold and nearby Section P oyster decisions. The generic hold excludes species-qualified identities; no focused *M. gigas* identity decision or allocation was found.
- Confirmed that the proposed candidate ID and exact bilingual keys have no active reference, form, legacy, or ledger owner, and that the source prefix is unique in the ledger/proposal/batch archive.
- Scanned all 114 manifest paths and 1,123 ingredient rows. The candidate and related oyster wording have no recipe hits; no recipe links or numeric behavior are proposed.
- This is proposal-only documentation. No unit, instrumentation, Gradle, emulator, or other tests were run.
