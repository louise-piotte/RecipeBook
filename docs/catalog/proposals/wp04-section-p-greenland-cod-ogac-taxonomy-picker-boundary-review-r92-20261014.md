# WP04 Section P R92 — Greenland cod / ogac taxonomy and picker boundary

- **Review date:** 2026-10-14.
- **Packet type:** regional-finfish identity, taxonomy, Québec terminology, picker, recipe-demand, and numeric-evidence boundary review.
- **Status:** Documentation-only hold integrated 2026-10-14; no catalog, ledger, form, recipe, or numeric data changed. See [the integration record](../batches/wp04-section-p-greenland-cod-ogac-boundary-hold-integration-20261014/README.md).
- **Open checklist:** Section P still asks for salmon, cod, and regional fish in the [live plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4315). The WP04 identity packet lists Pacific cod as a candidate and says to confirm fish names with CFIA before acceptance ([packet](../batches/protein-dairy-identities.md#L53)).
- **Recommendation:** Hold Greenland cod / ogac outside active references, aliases, forms, and the research ledger. OQLF and CFIA support the edible-fish name pair `Greenland cod / ogac`, but current taxonomic references disagree whether *Gadus ogac* is a separate species or is treated as a subspecies/synonym of *G. macrocephalus*. No Québec product or bundled recipe resolves whether the catalog should give this market name a separate picker identity.
- **Shared-data delta:** none. Do not create a `Greenland cod` row or attach `ogac` to Pacific cod until the taxonomic and product scope is reconciled.
- **Tests:** none run. This is a documentation-only proposal.

## Candidate and prior-work scope

This is a distinct, previously unreviewed regional-fish candidate under Section P. A repository search found one neighboring mention in the Arctic-cod review, which says to keep Greenland cod / ogac distinct while reviewing *Boreogadus saida*. The salt-cod review mentions *G. ogac* only in a Spanish commercial-name list. Neither review allocates, holds, or reconciles a Greenland-cod identity. No focused Greenland-cod proposal, integration, or batch decision was found.

This review does not reopen the integrated Atlantic, Pacific, or Arctic cod identities, salt cod, stockfish, sablefish, or Atlantic tomcod. It also avoids the recent Section P rounds: R89 sea scallop, R90 King Clip, and R91 paired *Micropterus* bass. The R91 integration record records a pre-R92 snapshot of 1,424 references, 104 forms, and 1,763 ledger records; the current snapshot is 1,425 references, 104 forms, and 1,764 ledger records.

## Identity and Québec terminology evidence

OQLF’s edible-fish entry gives **ogac** as the preferred Québec French term for *Gadus ogac* and **Greenland cod** as its English equivalent. It also lists **fjord cod** in English, but explicitly discourages **morue**: that commercial name was tolerated only from 1971 to 1976. Do not derive `morue du Groenland` or add broad `morue` wording from the English name.

CFIA’s Fish List, modified 2023-09-18, has a separate TSN 164717 entry for *G. ogac* and lists `Greenland Cod / Ogac`. The same list separately gives *G. macrocephalus* the names `Cod / Morue`, `Pacific Cod`, and `Grey Cod / Morue du Pacifique`; *G. morhua* also has `Cod / Morue`. This supports a distinct Canadian food-label name entry, but the Fish List is not a consensus taxonomic treatment.

The taxonomy is not settled across authorities:

- ITIS's TSN 164717 report currently marks *Gadus ogac* as a valid species; the page lists its latest record review as 2014.
- WoRMS currently returns *G. ogac* and the historical combination *G. morhua ogac* as accepted under *G. macrocephalus*.
- Carr et al. (1999) found the sampled *G. ogac* and *G. macrocephalus* genetically indistinguishable and recommended synonymizing them. Coulson et al. (2006), using more complete mitochondrial genomes, described Arcto-Atlantic Greenland cod as a genomically distinguishable subspecies within pan-Pacific *G. macrocephalus*.
- The Northwest Atlantic Fisheries Organization’s Denmark/Greenland Research Report for 2024 uses the combined form *Gadus macrocephalus/G. ogac* for Greenland cod. It reports 10 tonnes landed in 2024 and says the fish is mainly consumed by people in Greenland in dried or frozen form. That is recent regional fishery/product evidence, but it does not settle the taxonomy or establish a Québec product identity.

DFO’s 2004 annotated Arctic-fish list includes *G. ogac* in Québec and records the names `Greenland Cod` and `Ogac`; it describes limited commercial importance. That is a regional occurrence and historical fishery note, not current retail evidence. No current Québec manufacturer or retailer package naming this fish was located in this review.

## Current catalog ownership and picker projection

The live snapshot parsed successfully: **1,425 references, 104 forms, 63 legacy candidates, and 1,764 ledger records** (7,110 nested source entries / 5,999 distinct source IDs). The manifest lists **114 recipes and 1,123 ingredient rows**.

Normalized exact-key checks across reference names and aliases, attached form labels and match terms, legacy names and aliases, and ledger record IDs found no owner for `Greenland cod`, `ogac`, `fjord cod`, `Gadus ogac`, `morue ogac`, `morue du Groenland`, or the proposed ID `ingredient-ref-greenland-cod`. No candidate-specific record was found in the research ledger. No form is attached to the five active cod-related identities below.

| Active reference | Display | Relevant boundary |
|---|---|---|
| `ingredient-ref-arctic-cod` | Arctic cod / morue polaire | *Boreogadus saida*; no Greenland-cod alias. |
| `ingredient-ref-atlantic-cod` | Atlantic cod / morue de l’Atlantique | *Gadus morhua*; distinct species identity. |
| `ingredient-ref-pacific-cod` | Pacific cod / morue du Pacifique; aliases `gray cod`, `grey cod` | *Gadus macrocephalus*; no `ogac` alias. |
| `ingredient-ref-sablefish` | sablefish / morue charbonnière; aliases `black cod`, `morue noire` | Separate *Anoplopoma fimbria* identity. |
| `ingredient-ref-salt-cod` | salt cod / morue salée | Preserved product, not a species identity. |

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases match before substring fallback. I applied that behavior to the current references and forms, and to a conditional `Greenland cod / ogac` display with no aliases. This is a static projection, not a UI test.

| Query | Current results | Conditional display | Consequence |
|---|---|---|---|
| `Greenland cod`, `ogac`, `fjord cod`, `Gadus ogac` | None | `Greenland cod / ogac` | The qualified name becomes searchable if its identity is resolved. |
| `cod` | Five: Arctic cod, Atlantic cod, Pacific cod, sablefish (`black cod`), salt cod | Those five plus Greenland cod | It remains a multi-result query; the hold is about taxonomic identity, not a singleton search trap. |
| `morue` | Five: Arctic cod, Atlantic cod, Pacific cod, sablefish, salt cod | Same five | The OQLF-preferred French display `ogac` does not make the discouraged commercial name `morue` an alias. |
| `Pacific cod`, `morue du Pacifique` | Pacific cod only | Unchanged | Do not silently absorb or alias the Greenland market name to the Pacific display. |

Do not add `uugaq`, `uugak`, `ovak`, or other Inuit-language terms as global aliases in this proposal. DFO sources record some such terms across more than one cod taxon; their community and regional scope would need its own review.

## Bundled recipe demand

I scanned every manifest-listed recipe file, each ingredient row, and the parsed recipe content for `Greenland cod`, `ogac`, `fjord cod`, *Gadus ogac*, and related unqualified phrase variants. The scan found **zero candidate-term hits in all 114 recipe files and zero matching ingredient rows**. It also found zero ingredient rows requesting even generic `cod` or `morue`.

There is no candidate recipe to link, relink, or scope to a form. No bundled recipe supports a replacement between Greenland cod / ogac and Pacific cod, Atlantic cod, Arctic cod, or salt cod. A taxonomic synonym or market-name relationship by itself would not establish recipe performance, an amount, preparation, or a directed substitution rule.

## Measures, forms, yields, and substitution limits

The reviewed current fishery report describes dried and frozen Greenland-market product and gives a fishery landing total; neither is a kitchen measure. DFO’s 71.1 cm entry is a biological maximum length, not a count-to-weight conversion or serving quantity. A targeted Health Canada Canadian Nutrient File search for Greenland cod / *G. ogac* did not surface a species-matched food or serving record. No source reviewed supports a household measure, density, unit mapping, fillet count, edible portion, package yield, or cooking yield.

No dried or frozen form is proposed: the NAFO statement is a Greenland fishery summary, not a Québec package specification or a recipe request. Add no unit conversion or active substitution. Measurement, yield, and substitution evidence stays unresolved because no candidate record is proposed.

## Exact proposed delta

**Hold the candidate with zero shared-data changes.** In particular, do not add a new reference, add `ogac` as a Pacific-cod alias, create a candidate ledger record, attach a form, or change any recipe, mapping, yield, or substitution.

```json
{
  "ingredient-references.v1.json": [],
  "ingredient-forms.v1.json": [],
  "legacy-import-identities.v1.json.candidates": [],
  "research-ledger.v1.json.records": [],
  "recipeIngredientLinks": [],
  "unitConversions": [],
  "packageYields": [],
  "substitutionRules": []
}
```

The R92 source IDs below are proposal-local. They are not new research-ledger source entries. Revisit after a crosswalk determines whether the Greenland-cod food-market identity should share `ingredient-ref-pacific-cod` under the current WoRMS treatment or remain separate under the CFIA/OQLF names, and after a Canadian/Québec product or recipe supports that scope.

## Source register

Sources were accessed on 2026-10-14. The source IDs are unique to this proposal.

| Source ID | Source and locator | Support and limit |
|---|---|---|
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S01` | OQLF GDT, [ogac](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488152/ogac), last updated 1983. | Marks `ogac` as preferred in Québec’s zoology/ichthyology and edible-fish domains; English equivalents are `Greenland cod` and `fjord cod`; taxon is *Gadus ogac*. `Morue` is discouraged and was tolerated as a commercial name only from 1971 to 1976. Terminology evidence, not current product availability. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S02` | CFIA, [Fish List query for *Gadus ogac*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Gadus%20ogac), Fish List modified 2023-09-18. | TSN 164717 is listed with `Greenland Cod / Ogac`. Adjacent *G. macrocephalus* and *G. morhua* entries also use `Cod / Morue`. Canadian fish-label names, not a taxonomic consensus or app alias standard. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S03` | ITIS, [*Gadus ogac*, TSN 164717](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=164717). | The report marks *G. ogac* as a valid species and records English `Greenland cod`, English `ogac`, and French `ogac` / `morue ogac`; its latest record review is 2014. Its French synonym inventory does not supersede OQLF’s Québec product-term recommendation. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S04` | WoRMS, [taxon-list search for *Gadus morhua*](https://www.marinespecies.org/aphia.php?p=taxlist&tName=Gadus+morhua), generated 2026-09-05. | Returns *G. ogac* and *G. morhua ogac* as accepted under *G. macrocephalus*. Current marine taxonomic-registry treatment; not a Canadian fish-label decision. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S05` | Carr, Kivlichan, Pepin, and Crutcher, [“Molecular systematics of gadid fishes: implications for the biogeographic origins of Pacific species”](https://doi.org/10.1139/z98-194), *Canadian Journal of Zoology* 77(1), 19–26 (1999). | The mitochondrial comparison found the sampled *G. ogac* and *G. macrocephalus* genetically indistinguishable and recommended synonymization. A taxonomic study, not food naming or a recipe substitution source. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S06` | Coulson et al., [“Mitochondrial genomics of gadine fishes: implications for taxonomy and biogeographic origins from whole-genome data sets”](https://pubmed.ncbi.nlm.nih.gov/17110992/), *Genome* 49(9), 1115–1130 (2006). | Full-mitochondrial-genome study describes Arcto-Atlantic Greenland cod as a genomically distinguishable subspecies within pan-Pacific *G. macrocephalus*. This supports the taxonomic ambiguity; it does not decide the catalog’s food-product scope. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S07` | Coad and Reist, DFO, [Annotated List of the Arctic Marine Fishes of Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/278854.pdf), Canadian Manuscript Report 2674 (2004), p. 34. | Lists Greenland cod / Ogac in Québec and describes limited commercial importance. Historical regional distribution and fishery information, not current retail availability, package measures, or recipe demand. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S08` | Northwest Atlantic Fisheries Organization, [Denmark/Greenland Research Report for 2024](https://www.nafo.int/Portals/0/PDFs/sc/2025/scs25-12.pdf), p. 4. | The June 2025 fishery report uses *Gadus macrocephalus/G. ogac*, reports 10 t landed in 2024, and describes dried/frozen product for the Greenlandic human-food market. It demonstrates a regional product context but does not resolve taxonomy or Québec availability. |
| `WP04-SECTIONP-GREENLAND-COD-BOUNDARY-R92-20261014-S09` | Health Canada, [Canadian Nutrient File search](https://food-nutrition.canada.ca/cnf-fce/newSearch), targeted search for Greenland cod / *Gadus ogac*. | No species-matched food or serving page surfaced in the targeted search. This limited negative search does not establish that no analysis exists elsewhere. |

## Static review record

- Read the current `AGENTS.md`, `Requirements.md`, the WP04 protein/dairy identity packet, the exact open Section P plan line, and the latest roadmap through R91.
- Reviewed the current Arctic-cod and salt-cod references plus the R89 sea-scallop, R90 King Clip, and R91 paired-*Micropterus* archives. The prior Arctic-cod mention is only a species-boundary sentence, not a Greenland-cod decision.
- Parsed live references, forms, legacy candidates, ledger, manifest, and all manifest-listed recipe JSON. Confirmed 1,425 references, 104 forms, 63 legacy candidates, 1,764 ledger records, 114 recipes, and 1,123 ingredient rows.
- Checked normalized exact ownership for candidate terms, scientific name, ID, form labels/match terms, legacy names/aliases, and ledger record IDs. Confirmed the proposed source-ID prefix was unused in the current catalog archive and ledger before drafting.
- Reproduced the current phrase-first picker projection for `cod`, `morue`, `Pacific cod`, `Greenland cod`, and `ogac`. Scanned all recipe files, ingredient rows, and parsed text for the candidate and broad cod terms.
- Verified UTF-8/no-BOM and source pages online. No app, Gradle, instrumentation, emulator, catalog, ledger, or database-data changes were made for this hold.
