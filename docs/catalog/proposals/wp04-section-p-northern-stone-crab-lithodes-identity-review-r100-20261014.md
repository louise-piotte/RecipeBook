# WP04 Section P — Northern stone crab identity review

- **Review date:** 2026-10-14
- **Scope:** One crustacean species, *Lithodes maja* (the spelling *L. maia* appears in older Québec and Canadian material).
- **Recommendation:** Add a species-scoped, identity-only `PROTEIN` reference for **Northern stone crab / crabe épineux**. This records a named edible species and does not assert current Québec retail supply, a directed fishery, or harvest authorization.
- **Integration status:** Integrated 2026-10-14; see [the batch record](../batches/wp04-section-p-northern-stone-crab-lithodes-identity-integration-20261014/README.md).

## Proposed canonical reference

```json
{
  "id": "ingredient-ref-northern-stone-crab",
  "nameEn": "Northern stone crab",
  "nameFr": "crabe \u00e9pineux",
  "aliasesEn": [],
  "aliasesFr": ["crabe \u00e9pineux du nord"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
```

Keep *Lithodes maja* in the evidence record rather than adding a Latin-name alias; the reference schema has no taxon field. Use the Québec French display `crabe épineux` from OQLF and its English equivalent `Northern stone crab`. Retain `crabe épineux du nord` only as the DFO-sourced qualified French alias. Do not add `deepsea king crab` / `deep-sea king crab`, `crabe royal de roche`, `king crab`, `Norway king crab`, or *Lithodes maia* as aliases. Those terms either broaden a king-crab query or represent scientific nomenclature rather than a recipe search name.

## Selection and existing ownership

The live Section P checklist leaves crab identities open under the shrimp/prawn and crab heading at [plan line 4795](../../RecipeBook-global-ingredient-catalog-plan.txt#L4804). The just-integrated stone-crab review concerns the CFIA *Menippe* group and explicitly preserves *Lithodes* as a separate taxon. It did not review *L. maja* as its own catalog identity; it only recorded the adjacent name boundary. No other focused *Northern stone crab* review or integration was found in the Section P proposal and batch archive.

At review time, the bundled reference catalog had 1,438 rows, ingredient forms had 105 rows, legacy import identities had 63 candidates, and the research ledger had 1,778 records. Exact-name, alias, and identifier scans found:

- The only active exact owner is `ingredient-ref-stone-crab`, whose English display is `stone crab / crabe caillou` for the *Menippe* market group. It does not own `Northern stone crab`, `crabe épineux`, or *Lithodes*.
- No active reference, form, legacy candidate, or ledger candidate owns `ingredient-ref-northern-stone-crab`, `candidate-northern-stone-crab`, or the proposed bilingual display pair.
- The ledger currently mentions Northern stone crab only in the R99 *Menippe* sources and decision, which state that *Lithodes* is separate. Reuse the existing CFIA crab-query and OQLF `crabe épineux` evidence IDs from that review; do not duplicate those records.
- The source-ID prefix `WP04-SECTIONP-NORTHERN-STONE-CRAB-R100-20261014` was unallocated at review time.

The proposal is limited to this identity. It does not reopen generic crab meat, rock crab, Jonah crab, snow crab, golden or red king crab holds, or the *Menippe* stone-crab row.

## Taxon, Canadian naming, and Québec wording

CFIA’s Fish List crab query has TSN 97943, *Lithodes maja*, with the entries **Deepsea King Crab / Crabe épineux**, **Crab / Crabe**, and French **Crabe Royal De Roche**. This is the Canadian fish-labelling name source. OQLF’s edible-crustacean entry prefers **crabe épineux**, gives English **Northern stone crab** and **deep-sea king crab**, and identifies *Lithodes maia*. It says the species has commercial potential in Québec; the entry was last updated in 1998, so that note is not current proof of a fishery or retail supply. [reused R99-S01, R99-S03]

The spelling conflict is resolvable for the identity field: the World Register of Marine Species marks *Lithodes maia* as an incorrect subsequent spelling and accepts *Lithodes maja*. CFIA and recent DFO material also use *L. maja*. The proposed identity therefore uses the accepted spelling while preserving OQLF’s supported French common name. [R100-S01–S02; reused R99-S01, R99-S03]

## Market and product-state boundary

No current Québec retailer or Canadian manufacturer product page identifying a *Lithodes maja* food SKU was located in this bounded search. The current Metro item reviewed for R99 is labeled frozen cooked `stone crab claws` but gives no scientific name, so it remains product evidence for that listing and cannot be assigned to *Lithodes*. The OQLF commercial-potential note is useful Québec context, not a current availability statement.

The most recent relevant federal fishery evidence located is DFO’s June 2023 assessment of the Gulf of St. Lawrence Greenland-halibut fishery. Its observer table reports `crabe épineux du nord` as bycatch: 23 t average estimated catch for 2000–2020, 3 t in 2021, and 0 t in 2022; the occurrence column reports 47%, 19%, and 0% for those periods. This is bycatch in a different directed fishery, not a consumer product listing or evidence of an authorized directed Northern-stone-crab fishery. [R100-S02]

DFO’s August 1998 stock-status report said the species was not then fished commercially on Canadian coasts, described it as bycatch, and discussed possible development. The same report records a plant-shelling trial with a 26% meat yield and describes the meat as firmer and saltier than snow crab. That 26% is a historical industrial processing result; it is not a home-preparation yield, edible-portion default, or conversion. [R100-S03] The 2000 Newfoundland and Labrador exploratory-fishery project summary documents historical test fishing and processing interest, not current retail availability. [R100-S04]

No forms, cuts, preservation states, package measures, densities, unit mappings, conversion, cooking yield, or recipe link are supported for the live reference. Do not transfer cooked claws or package data from the R99 Metro `stone crab` listing. The federal fishery records’ tonnes and catch percentages stay research observations, not recipe quantities.

## Picker projection

The audit followed `IngredientReferenceSearchIndex`: normalized complete phrases are matched across the reference display names, aliases, and form terms before substring fallback. The projection uses only the proposed display pair and the one qualified French alias above.

| Search query | Current result | With proposed reference | Boundary |
|---|---|---|---|
| `Northern stone crab` | None | Northern stone crab / crabe épineux | Qualified English query resolves to the proposed identity. |
| `crabe épineux` | None | Northern stone crab / crabe épineux | Preferred Québec French term resolves to the same identity. |
| `crabe épineux du nord` | None | Northern stone crab / crabe épineux | DFO’s qualified French wording resolves to the same identity. |
| `stone crab` | stone crab / crabe caillou | stone crab / crabe caillou; Northern stone crab / crabe épineux | Both distinct crab identities remain visible. |
| `crab` / `crabe` | Six crab-related references | The same six plus Northern stone crab | Broad searches remain multi-result. |
| `king crab` / `deep-sea king crab` | None | None | Omitted aliases avoid making one unqualified king-crab query look species-resolved. |
| `crabe royal` | None | None | Omitted `crabe royal de roche` avoids capturing a broad French king-crab query. |

The current six broad crab results are blue crab, crab meat, crab-flavoured pollock flakes, Dungeness crab, Jonah crab, and stone crab. The new display intentionally shares `stone crab` as a phrase with the existing *Menippe* row, so that search returns both rather than silently mapping an unqualified phrase to either taxon.

## Bundled recipe demand and substitution

The complete manifest-listed corpus scan covered **114 recipe files, 1,123 ingredient rows, and 753,928 recipe-file bytes**. It found zero full-file hits and zero ingredient-row hits for `Northern stone crab`, `crabe épineux`, `crabe épineux du nord`, *Lithodes maja*, *Lithodes maia*, `deep-sea king crab`, and `crabe royal de roche`.

The only direct crab-meat ingredient demand is recipe 019, line 8: `1 lb jumbo lump crab meat`, linked to the existing crab-meat reference and jumbo-lump form. It does not identify *Lithodes* or support a species link, form, measure, yield, or substitution. DFO’s texture and processing observations do not establish recipe-scoped equivalence with snow crab, the *Menippe* stone-crab product, or another crab. Add no global form conversion or contextual substitution rule.

## Sources

Access date for online pages: **2026-10-14**. In-text source labels abbreviate the full IDs below; for example, `R100-S01` denotes `WP04-SECTIONP-NORTHERN-STONE-CRAB-R100-20261014-S01`.

| ID | Source and date | Use and limit |
|---|---|---|
| **Reused `WP04-SECTIONP-STONE-CRAB-R99-20261014-S01`** | CFIA, [Fish List crab query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab); list modified 2023-09-18. | TSN 97943 lists *L. maja*, `Deepsea King Crab / Crabe épineux`, and neighboring names. Canadian labelling names; not product availability. |
| **Reused `WP04-SECTIONP-STONE-CRAB-R99-20261014-S03`** | OQLF, [GDT: crabe épineux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198939/crabe-epineux); last updated 1998. | Preferred Québec French name, English equivalents, older *L. maia* spelling, edible-crustacean domain, and historical commercial-potential note. |
| **WP04-SECTIONP-NORTHERN-STONE-CRAB-R100-20261014-S01** | World Register of Marine Species, [*Lithodes maia* name details](https://www.marinespecies.org/aphia.php?p=taxdetails&id=590139); taxonomic record checked 2026-10-14. | Marks *L. maia* as an incorrect subsequent spelling and accepts *L. maja*. Taxonomic crosswalk only. |
| **WP04-SECTIONP-NORTHERN-STONE-CRAB-R100-20261014-S02** | DFO, [Assessment of the Gulf of St. Lawrence Greenland halibut stock in 2022](https://publications.gc.ca/collections/collection_2023/mpo-dfo/fs70-6/Fs70-6-2023-022-fra.pdf), June 2023, table 1. | Reports the species as bycatch in the observer data for 2000–2020, 2021, and 2022; does not establish a directed fishery or consumer sale. |
| **WP04-SECTIONP-NORTHERN-STONE-CRAB-R100-20261014-S03** | DFO, [Crabe épineux de l’estuaire et du golfe du Saint-Laurent](https://publications.gc.ca/collections/collection_2016/mpo-dfo/Fs76-1-C4-04-1998-fra.pdf), stock-status report C4-04, August 1998. | Historical fishery status, bycatch, possible development, and industrial shelling trial; not current market evidence or a home-cooking conversion. |
| **WP04-SECTIONP-NORTHERN-STONE-CRAB-R100-20261014-S04** | Newfoundland and Labrador Fisheries Diversification Program, [FDP 84: Northern Stone Crab exploratory fishing](https://www.gov.nl.ca/fisheries/files/research-development-fdp-pdf-fdp-84.pdf), survey conducted May–June 2000. | Records a historical exploratory fishery and processing interest; not a current Canadian product specification. |

## Review result

Recommend the identity-only row shown above. Keep market availability, legal sourcing, and product state unresolved; keep all forms, measures, recipe links, conversions, yields, and substitutions empty. The review checked ownership, source-ID availability, picker projection, the full recipe corpus, and source links. The accepted catalog and ledger changes are documented in the linked batch record above. No application tests or emulator work were run for the database-JSON-only integration.
