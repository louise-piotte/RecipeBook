# WP04 Section P — paired *Micropterus* bass / achigan review (R91)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** paired species identity, Québec terminology and sale context, picker ownership, recipe demand, and measurement-boundary review.
- **Checklist:** the live [Section P fish and regional-fish item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4300) remains open.
- **Recommendation:** add two identity-only `PROTEIN` references for smallmouth bass / achigan à petite bouche (*Micropterus dolomieu*) and largemouth bass / achigan à grande bouche (*M. salmoides*), with no aliases. Together, the qualified display names preserve the two-species *Micropterus* meaning of broad `achigan` and `bass` picker queries; a single smallmouth row would have made both queries return only one species.
- **Proposed data delta:** two reference rows and two `ingredient_reference` ledger records. No forms, legacy candidates, recipe links, measurements, conversions, yields, or substitutions.
- **Status:** Accepted and integrated 2026-10-14; see the [integration record](../batches/wp04-section-p-micropterus-pair-identity-integration-20261014/README.md).
- **Tests:** No app, Gradle, instrumentation, or emulator tests were run because the accepted change only adds database JSON data and its generated index under `AGENTS.md`. Static validation is recorded in the integration README.

## Why the paired review is stronger than the previous hold

The open Section P item explicitly includes regional fish. This review addresses the Québec freshwater *Micropterus* pair identified by OQLF, CFIA, and local Québec fish sources. It does not reopen the R90 King Clip product-to-taxon hold or the separate white-bass/striped-bass (*Morone*), black-sea-bass (*Centropristis striata*), or European-sea-bass (*Dicentrarchus labrax*) picker holds. Those are different taxa and remain separate boundaries.

The earlier R91 draft held smallmouth bass because `achigan` and its OQLF English equivalent `bass` are broader than *M. dolomieu* alone. That concern is valid for a singleton, but the sibling species can be represented at the same time with its own preferred Québec name. OQLF defines edible `achigan / bass` as the genus *Micropterus*, names both native Canadian species, and gives separate preferred names and binomials for each. With both rows active, the exact picker phrase stage returns two results for either broad query. The pair therefore resolves the singleton allocation problem while retaining the distinction between the species.

This is an identity decision, not a claim that every fish label containing `bass` means *Micropterus*. CFIA assigns `bass` and `sea bass` compounds to other genera as well. Those species remain outside this pair and keep their own reviews or holds.

## Identity, Québec terminology, and local food context

| Source | Finding | Limit |
|---|---|---|
| OQLF GDT, `achigan` | Places it in zoology/ichthyology and edible fish; gives English `bass` and Latin *Micropterus*. Its Canadian note distinguishes smallmouth (*M. dolomieu*) and largemouth (*M. salmoides*). | Defines the genus-level relationship, not a recipe equivalence or an all-family meaning for every English use of `bass`. |
| OQLF GDT, `achigan à petite bouche` | Preferred Québec/Canadian French term; pairs with `smallmouth bass` and *M. dolomieu*. The entry classifies the fish as edible. | The entry lists `perche noire` and `perche truitée` as France/Europe terms and gives several rare English equivalents; none is needed as an alias. OQLF's generic `achigan` note also calls smallmouth `achigan noir`; omit that shorter alias here because it is not needed for picker access and would sit close to the separate, excluded black-sea-bass wording `achigan noir de mer`. |
| OQLF GDT, `achigan à grande bouche` | Preferred Québec/Canadian French term; pairs with `largemouth bass` and *M. salmoides*. The entry classifies it as edible. It discourages `black-bass` in Canadian French. | Do not import the listed rare English forms such as `largemouth black bass`, `green bass`, or `bigmouth bass`; the exact Québec/Canadian display is sufficient. |
| CFIA Fish List | Separately lists TSN 550562 as `Smallmouth Bass / Achigan à Petite Bouche` and TSN 168160 as `Largemouth Bass / Achigan à Grande Bouche`. | Canadian fish-label naming evidence, not a product listing or culinary substitution source. |
| Fisheries and Oceans Canada, Aquaculture Sector Snapshot | Lists smallmouth bass as farmed finfish in Ontario and Québec and largemouth bass in Ontario. | Does not state whether the fish are raised for food, stocking, or another purpose, or whether a seller currently has them. |
| Government of Québec, `Principales espèces pêchées au Québec` poster | Lists both achigans among principal species fished in Québec. | Confirms regional species presence, not commercial catch volume or product supply. |
| Le Québec Cuisine, `Les achigans` | Describes two Québec species, says they are delicious, and suggests obtaining them from a commercial fisher or catching them. It also says they are not ordinarily found in fishmongers. | Local culinary reference, not a current inventory or proof of species-specific commercial landings. Its adult body-size description is not a recipe portion or yield. |
| Québec's consolidated fish-sale regulation and MAPAQ permit guidance | The regulation, current to 2026-06-01, expressly names both species in article 30, restricts ordinary sale of dead fish, and then permits specified channels: qualifying commercial catch, aquaculture, fishing-pond sales, and certain imports. Article 32 requires a numbered invoice recording species and number. MAPAQ's current freshwater-commercial-fishing page says a permit allows sale of fish taken and kept for consumption and bars sale of sport-caught fish. | These conditional legal pathways support consumer-food relevance; they do not establish a present-day SKU, an achigan-specific commercial landing, or any seller's inventory. |

The paired identity is supported even though no current Québec fishmonger SKU was found. The evidence establishes edible species, locally recognized Québec names, local fish context, and regulated sale pathways. Treat current product supply as unconfirmed and do not attach a seller product or package claim.

## Exact ownership and related fish boundary audit

The current live snapshot contains **1,421 ingredient references, 104 forms, 63 legacy candidates, 1,760 research-ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows**.

Exact normalized-key checks across reference displays and aliases, attached form labels and match terms, legacy candidate displays and aliases, and ledger identity fields found no owner for `smallmouth bass`, `smallmouth`, `achigan à petite bouche`, `achigan noir`, *Micropterus dolomieu*, `largemouth bass`, `largemouth`, `achigan à grande bouche`, or *Micropterus salmoides*. The two proposed reference IDs, `ingredient-ref-smallmouth-bass` and `ingredient-ref-largemouth-bass`, are also unused. No relevant form or legacy candidate exists.

Current active search has one incidental fallback for each of `bass` and `achigan`: `bottle gourd / courge bouteille` has alias `courge calebasse`, which contains the substring `bass`; `freshwater drum / malachigan` contains the substring `achigan`. Neither is an exact owner of those search words. The paired qualified displays become exact word-phrase matches and outrank these substring fallbacks. Separately, the unrelated broad `bar` query returns 37 substring-fallback references, as shown below.

Keep the neighboring fish names and identities separate:

- CFIA uses `White Bass / Bar Blanc` for *Morone chrysops* and `Striped Bass / Bar d'Amérique` for *M. saxatilis*. Their existing Section P holds remain in force.
- CFIA uses `Sea Bass / Bar Commun` for *Dicentrarchus labrax*, `Black Sea Bass / Fanfre Noir` and French-only `Bar noir` for *Centropristis striata*, `Blackfin Sea Bass / Bar à nageoires noires` for *Lateolabrax latus*, and `Rock Bass / Crapet de roche` for *Ambloplites rupestris*. These are separate taxa, not *Micropterus* aliases.
- CFIA's `White Perch / Bar Blanc d'Amérique` is *Morone americana*, a different fish from white bass. The active `barramundi / barramundi` row is *Lates calcarifer*; neither becomes a `bass` alias here.
- Do not add generic `bass`, `bar`, `sea bass`, `black bass`, `bar blanc`, `bar rayé`, `perche noire`, scientific names, or rare source-listed alternatives as aliases. The displays already supply the qualified English and Québec French searches; the generic word-phrase results will be plural because both species rows are present.

The source-ID prefix `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014` was checked against the shared ledger and other proposal/archive files before integration. The accepted source records now appear on the two shared ledger entries.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes names and aliases, returns complete word-phrase matches first, and uses substring matching only if that stage is empty. I applied those rules to the current references and forms, then to a temporary in-memory pair using the two proposed displays and empty alias lists.

| Query | Current picker | With the proposed pair | Boundary |
|---|---|---|---|
| `bass` | `bottle gourd / courge bouteille`, substring fallback through `courge calebasse` | Both *Micropterus* rows | The exact `bass` token in each English display wins over the unrelated fallback. This covers the genus-level OQLF `achigan / bass` meaning as a two-result pair; it does not claim that all CFIA bass-named genera have been catalogued. |
| `achigan` | `freshwater drum / malachigan`, substring fallback | Both *Micropterus* rows | The exact French word in both preferred displays wins over the unrelated fallback. |
| `smallmouth bass`, `achigan à petite bouche` | None | Smallmouth bass / achigan à petite bouche only | Species-qualified English and Québec French searches resolve to *M. dolomieu*. |
| `largemouth bass`, `achigan à grande bouche` | None | Largemouth bass / achigan à grande bouche only | Species-qualified English and Québec French searches resolve to *M. salmoides*. |
| `bar` | 37 substring-fallback references, including Bambara items, barley products, barracuda, barramundi, and barbecue sauce | Same current fallback set | Neither display contains `bar`; the pair does not claim the broad French/English `bar` query. |
| `bar blanc`, `bar d'Amérique`, `bar commun`, `bar noir`, `bar rayé`; `sea bass`, `white bass`, `striped bass`, `black sea bass`, `rock bass` | None | None | Keep each distinct family/species out of this *Micropterus* pair. Their respective identities remain unmerged. |
| `achigan noir`, `achigan noir de mer`, `perche noire` | None | None | Omit these alternate or overlapping names from aliases; the preferred Québec displays remain exact and discoverable. |

The phrase `bass` is used for several fish families in the CFIA list. The two-result `bass` projection is therefore deliberately limited to the OQLF-defined *Micropterus* pair; it does not close the broader Section P bass/sea-bass inventory. The paired `achigan` result is the more precise Québec genus-level boundary.

## Recipe demand

I scanned all **114 manifest-listed recipe files**, their **1,123 ingredient rows**, and full recipe JSON text for whole-phrase occurrences of `smallmouth bass`, `smallmouth`, `achigan à petite bouche`, `achigan noir`, *Micropterus dolomieu*, `largemouth bass`, `largemouth`, `achigan à grande bouche`, and *Micropterus salmoides*. There were **zero matching files and zero matching ingredient rows**. No recipe link or species-specific ingredient line is proposed.

## Forms, measures, yields, and substitutions

The identity and local culinary sources do not establish a reusable raw/frozen, whole/fillet, skin/bone, cooked, smoked, canned, or other ingredient form. Le Québec Cuisine's approximate adult length and mass describe a fish, not a recipe serving, product unit, count-to-mass mapping, or edible portion. No reviewed source supplies a species-matched density, household measure, package size, fillet weight, edible yield, or cooking yield. No recipe or source establishes a directed substitution between the two achigans or to another bass, perch, trout, or generic fish.

The exact proposed delta therefore adds no form, density, unit mapping, measurement observation, recipe link, conversion, yield, or substitution rule. Keep measurement and substitution ledger states at `researched_no_supported_value` and `researched_no_supported_substitute` respectively; do not infer food-safety, cooking, curing, or storage equivalence.

## Exact proposed shared-data delta

This accepted delta was integrated into the canonical seed reference file and research ledger. The exact rows and ledger states below document the resulting identity-only addition; see the integration README for validation results.

### `ingredient-references.v1.json`

```json
[
  {
    "id": "ingredient-ref-smallmouth-bass",
    "nameFr": "achigan à petite bouche",
    "nameEn": "smallmouth bass",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-14T00:00:00Z",
    "category": "PROTEIN"
  },
  {
    "id": "ingredient-ref-largemouth-bass",
    "nameFr": "achigan à grande bouche",
    "nameEn": "largemouth bass",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-14T00:00:00Z",
    "category": "PROTEIN"
  }
]
```

### `research-ledger.v1.json`

Append the following two records. Each record uses the Source objects specified in the source table below; when integrated, those objects are stored inline as required by the current ledger schema. The repeated source IDs are intentional because the OQLF genus, CFIA, regional, culinary, and sale-context sources cover both species. Let `P` mean `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014`.

| `recordId` | `recordType` | `identityState` | `measurementState` | `substitutionResearchState` | Exact `sources[].sourceId` values | Accepted decision |
|---|---|---|---|---|---|---|
| `ingredient-ref-smallmouth-bass` | `ingredient_reference` | `verified` | `researched_no_supported_value` | `researched_no_supported_substitute` | `P-S01`, `P-S02`, `P-S04`, `P-S05`, `P-S06`, `P-S07`, `P-S08`, `P-S09` | Add identity-only smallmouth bass / achigan à petite bouche for *M. dolomieu*, with no aliases. Keep largemouth separate. Add no form, measure, density, mapping, recipe link, conversion, yield, or substitution. `decisions[0].sourceIds` uses this same set. |
| `ingredient-ref-largemouth-bass` | `ingredient_reference` | `verified` | `researched_no_supported_value` | `researched_no_supported_substitute` | `P-S01`, `P-S03`, `P-S04`, `P-S05`, `P-S06`, `P-S07`, `P-S08`, `P-S09` | Add identity-only largemouth bass / achigan à grande bouche for *M. salmoides*, with no aliases. Keep smallmouth separate. Add no form, measure, density, mapping, recipe link, conversion, yield, or substitution. `decisions[0].sourceIds` uses this same set. |

No unit-conversion record is proposed. Forms, legacy identities, recipe links, package yields, contextual substitutions, and the Section P checklist are unchanged by this proposal.

## Sources

All pages below were accessed 2026-10-14. The IDs are unique within this proposal and absent from the live ledger/archive. Their values provide the source objects to attach to the two proposed ledger records.

| Source ID | Direct source | Locator and support | Limit |
|---|---|---|---|
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S01` | OQLF GDT, [achigan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8370827/achigan) | Edible-fish domain; English and Latin equivalents; note naming both native Canadian *Micropterus* species. Supports the genus and broad query relationship. | Terminology/taxonomy, not recipe substitution. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S02` | OQLF GDT, [achigan à petite bouche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359907/achigan-a-petite-bouche) | Preferred Québec/Canadian term, English `smallmouth bass`, Latin *M. dolomieu*, and edible-fish domain. | Do not import the France/Europe names or rare English synonyms as aliases. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S03` | OQLF GDT, [achigan à grande bouche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359908/achigan-a-grande-bouche) | Preferred Québec/Canadian term, English `largemouth bass`, Latin *M. salmoides*, edible-fish domain; discourages `black-bass` in Canadian French. | Do not import the rare English alternatives as aliases. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S04` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Rows for TSN 550562 (*M. dolomieu*) and 168160 (*M. salmoides*) list separate bilingual common names. | Fish-label name evidence, not a product, recipe, or substitution source. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S05` | Fisheries and Oceans Canada, [Aquaculture Sector Snapshot — farmed species](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-eng.htm?wbdisable=true) | Current table lists smallmouth in Ontario/Québec and largemouth in Ontario. | Does not specify purpose or consumer availability. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S06` | Government of Québec, [Principales espèces pêchées au Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/peche/documents/AF_especes_pechees.pdf) | Lists both achigans among principal Québec fish species. | Does not distinguish commercial and recreational catch or identify products. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S07` | Le Québec Cuisine, [Les achigans](https://quebecuisine.ca/aliments/les-achigans/) | Describes two Québec species as delicious; says they are not ordinarily sold in fishmongers and points to a commercial fisher or direct catch. | Local food context, not a current SKU or market-wide stock claim. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S08` | Éditeur officiel du Québec, [Règlement sur l’aquaculture et la vente des poissons](https://www.legisquebec.gouv.qc.ca/fr/document/rc/c-61.1,%20r.%207) | Current consolidated text (to 2026-06-01), arts. 30 and 32: lists both species, generally restricts dead-fish sales, specifies exceptions, and requires species/count invoice records. | Legal scope, not proof that any particular seller or lot meets an exception. |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S09` | MAPAQ, [Permis de pêche commerciale en eau douce](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce) | Updated 2026-09-18; states that a commercial permit covers sale of fish caught and kept for consumption and prohibits sale of sport-caught fish. | General permit guidance; it does not list achigan-specific commercial landings or inventory. |

## Static checks performed

- Re-read the repository instructions, `Requirements.md`, the open Section P checklist, the relevant finfish sweep, the latest roadmap entries, R90 King Clip record, and nearby bass/sea-bass reviews.
- Parsed live references, forms, legacy candidates, ledger, and manifest; confirmed the counts above and no exact candidate identity/ID owner.
- Reproduced the Kotlin phrase-first and substring-fallback search against current data and a temporary two-row in-memory pair. Confirmed `bass` and `achigan` return the two species, qualified searches return one species each, current false fallbacks disappear for those exact queries, and `bar` is unchanged.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows/full JSON text; found zero candidate phrase hits.
- Rechecked source-ID prefix collisions, the direct authoritative pages, UTF-8 without BOM, local links, and trailing whitespace after saving.
- No app, Gradle, instrumentation, or emulator tests were run for the proposal or integration. The accepted integration updated the reference JSON, research ledger, generated index, plan, roadmap, and README; see the [integration record](../batches/wp04-section-p-micropterus-pair-identity-integration-20261014/README.md).
