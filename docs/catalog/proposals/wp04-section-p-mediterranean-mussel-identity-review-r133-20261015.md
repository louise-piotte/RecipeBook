# WP04 Section P — Mediterranean mussel identity review (R133)

- **Review and source-access date:** 2026-10-15.
- **Packet type:** species identity, Canadian/Québec market, picker-boundary, recipe-demand, and data-scope review.
- **Candidate:** Mediterranean mussel, *Mytilus galloprovincialis*; Québec French **moule méditerranéenne**.
- **Recommendation:** add one identity-only `PROTEIN` reference for this species, with only species-qualified names and the exact Canadian product name as search terms. Keep the generic mussel candidate unchanged. Add no form, measure, recipe link, conversion, yield, or substitution.
- **Write scope:** this proposal only. No catalog JSON, ledger, plan, roadmap, recipe, application code, or generated file was changed.

## Open checklist and candidate boundary

The still-open WP04 Section P parent is **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.”** in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5303). The roadmap records the R130 Pacific-oyster and R131 Eastern-oyster integrations and R132's whole/live green-sea-urchin picker hold; Section P remains open ([R130](../../../roadmap.md#L890), [R131](../../../roadmap.md#L896), [R132](../../../roadmap.md#L897)).

This packet reviews only *Mytilus galloprovincialis*. It does not repeat the R130 Pacific-oyster or R131 Eastern-oyster decisions, the R132 whole/live green sea urchin review, or the earlier extracted-gonad/uni hold. The active [blue-mussel review](wp04-blue-mussel-identity-review-20261011.md) concerns *M. edulis*, while the active [green-lipped-mussel reference](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) is *Perna canaliculus*. Both remain distinct. The pre-existing generic `ingredient-ref-mussel` ledger candidate remains unresolved; an exact, species-qualified product does not allocate every unqualified mussel request to *M. galloprovincialis*.

## Ownership and prior-decision audit

The audited package snapshot contains **1,483 active references**, **109 forms**, **61 legacy-import candidates**, and **1,828 research-ledger records**. The bundled manifest lists **114 recipes**.

No active reference, ingredient form, or legacy-import candidate owns `ingredient-ref-mediterranean-mussel`, *Mytilus galloprovincialis*, `Mediterranean mussel`, `moule méditerranéenne`, `moule gallo`, or the seller's `Honey Mussels` product title. No form is attached to the active blue- or green-lipped-mussel references. A focused archive search found no earlier species-specific Mediterranean-mussel decision. The two existing ledger mentions are in the blue-mussel identity record and generic-mussel candidate: both cite CFIA aquatic-animal-health nomenclature only to keep the broad mussel scope distinct; neither allocates *M. galloprovincialis* as a consumer-food identity.

The proposal-local source-ID prefix **`WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015`** was checked against the current ledger, proposals, and batch archive before use; it has no match. These proposal source IDs are not shared ledger IDs.

## Species naming and Canadian/Québec market evidence

The CFIA Fish List associates TSN 79456 and *M. galloprovincialis* with the Canadian food-name row `Mussel / Moule Méditerranéenne`. A second row reads `Mediterannean Mussel / Moule`; the English spelling is transposed, and the bare English and French terms also occur for other mussel species. The Fish List describes its English and French common names as names acceptable in Canada for fish labelling. Use the correctly spelled, species-qualified pair **Mediterranean mussel / moule méditerranéenne**; do not copy the misspelling or use bare `mussel`, `mussels`, `moule`, or `moules` as aliases. [S01]

Fisheries and Oceans Canada (DFO) separately lists `Mussel, Gallo / Mediterranean` and *M. galloprovincialis* in its English farmed-species table, and `Moule gallo` with the same binomial in the French table. DFO is documenting Canadian aquaculture nomenclature and production context, not prescribing a consumer label. Its tables place this farmed species in British Columbia. [S02–S03]

The Canadian Aquaculture Industry Alliance likewise says: **“In British Columbia, both Blue mussels and Mediterranean mussels (*Mytilus galloprovincialis*) are farmed.”** This confirms a Canadian aquaculture distinction from blue mussels but is industry context, not a retail label. [S04]

Seafood Depot's current Canadian product page is the direct food-market product match: it titles the item **“Honey Mussels”**, gives *Mytilus galloprovincialis*, and lists **“Fresh,” “Cultured in British Columbia,”** and **“Product of Canada.”** The seller's contact address is in Vaughan, Ontario. The page establishes a named Canadian human-food product and exact taxon; it does not show a package size, inventory status, live-state claim, or general usage of “honey mussel” by other sellers. Retain `Honey Mussels` only as this exact product-search term, not as the display name or a generic synonym. [S05]

Québec French naming is supported by more than one source, with different limits:

- OQLF's GDT entry for **moule d'élevage** defines a farmed sea mussel and explicitly notes: **“On distingue deux types de moules d'élevage : *Mytilus edulis* et *Mytilus galloprovincialis*.”** This establishes that the Québec term is shared across species; it is not an alias for this species. [S06]
- A Québec mussel-marketing strategy labels its comparison column **“Moule méditerranéenne”** and identifies it as *Mytilus galloprovincialis*. It says this species was farmed in France and in Washington and California; the text does not establish current Québec inventory. The report's indexed PDF table and text remain useful for the Québec French name and for understanding older commercial observations, not for claiming current local supply. [S07]
- A Québec IGA seafood article includes the exact phrase **“moules méditerranéennes *Mytilus galloprovincialis*”** and names a Portuguese farm and FAO fishing area 27. This supports Québec-facing consumer terminology and imported-product context, not a current shelf listing. The page appeared in the search index during this review, but direct retrieval returned a cache miss, so this packet treats it as indexed evidence only. [S08]

Taken together, the Fish List's Canadian food-name link, the current Canadian seller's taxon-labelled product, DFO's Canadian farmed-species record, and Québec sources supporting **moule méditerranéenne** justify one narrow species identity. They do not resolve the generic mussel candidate, establish a Québec retail SKU, or make these mussels interchangeable with another species.

## Picker projection and aliases

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, prefers complete word-phrase matches, then falls back to partial matching. A static projection of the proposed bilingual display and aliases below gives these results against the current 1,483 references:

| Query | Current active results | With the proposed reference | Picker boundary |
|---|---|---|---|
| `mussel` | Blue mussel; green-lipped mussel | Those two plus Mediterranean mussel | Broad English query remains multiple-choice. |
| `mussels` | Blue mussel | Blue and Mediterranean mussel | The species-specific plural adds a second result; do not alias bare `mussels` separately. |
| `moule` | Blue mussel; green-lipped mussel | Those two plus Mediterranean mussel | Broad French query remains multiple-choice. |
| `moules` | Blue mussel | Blue and Mediterranean mussel | The species-specific plural adds a second result; do not alias bare `moules` separately. |
| `Mediterranean mussel`, `Mediterranean mussels`, `moule méditerranéenne`, `moules méditerranéennes`, `moule gallo`, `Mussel, Gallo`, or `Honey Mussels` | No exact result | Mediterranean mussel only | Qualified names and the exact seller product title select the species. |
| `moule d'élevage`, `Mytilus galloprovincialis` | No exact result | No exact result | The OQLF term is shared across species; the scientific name remains research evidence rather than a search alias. |

The Fish List's `Mussel` and `Moule` names are not species-specific across listed mussels. In this catalog, the existing blue-mussel identity uses the Québec display `moule`; adding the proposed qualified display changes broad `moule` searches from multiple current results to three and does not make the Mediterranean species look like the sole answer. Do not add generic names, the shared OQLF `moule d'élevage`, or an unqualified `mussel`/`moule` alias. Keep `moule gallo` and `Mussel, Gallo` as qualified DFO terms; keep `Honey Mussels` bounded to the named Seafood Depot product.

## Full recipe demand and data boundaries

The scan parsed **all 114 recipe files listed by the manifest** and counted **1,123 ingredient rows**. It searched the string fields in the ingredient arrays—rather than every recipe title, instruction, and note—for `mussel`/`mussels`, `moule`/`moules`, Mediterranean-mussel wording, `moule gallo`, `Honey Mussels`, and *Mytilus galloprovincialis*. It found **zero matching recipe files and zero matching ingredient rows**.

A broad whole-file search for `moule` was rejected as demand evidence because French recipe instructions use *moule* for baking pans; that lexical match is not a mussel ingredient request. The final zero is from the corrected ingredient-field-only scan, with no recipe link warranted.

Product and literature sources document some specific states and numbers, but none establish reusable catalog values:

- Seafood Depot calls its one named Canadian product **“Fresh”** but does not say it is live, give a shell-on package weight, or specify a recipe measure. DFO's **“suspended”** entry describes aquaculture technique, not a kitchen form. FAO's 2009 Galicia-focused species sheet discusses fresh, canned, and frozen markets, but that regional historical profile is not a Canadian or Québec product specification. Do not add fresh/live/raw/cooked/canned/frozen forms to the active form catalog from this evidence alone. [S02–S05, S09]
- The older Québec strategy's table gives **“Nombre/livre” 10 à 15** for *M. galloprovincialis* and **“Rendement en chair” 50%**. Its footnote explains that its yield method compares cooked flesh weight with flesh-plus-shell weight. The table attributes its data to technical sheets from SODIM, France, and New Zealand, and does not identify a current Canadian/Québec SKU, individual recipe preparation, or general range. FAO's 2009 Galicia profile separately says meat weight can be 50% of total weight **“when the mussels are in their best conditions.”** These are variable commercial/biological observations, not a supported universal count-to-weight mapping, density, recipe yield, or serving measure. Preserve the reported per-pound count in S07's source note; the ledger's `count_weight` interval format requires a mass unit per counted item, so no derived per-mussel mass interval is stored. The two 50% figures remain source-specific ledger observations, not active yield rules. [S07, S09]
- No reviewed source establishes a tested substitution between Mediterranean and blue/green-lipped mussels, between species and forms, or for any particular dish. Species membership in the same genus and broad culinary use do not establish a safe numeric conversion. Add no form conversion or contextual substitution rule.

## Recommendation and exact candidate JSON delta

Add `ingredient-ref-mediterranean-mussel` as an identity-only `PROTEIN` reference. Keep the unresolved generic `ingredient-ref-mussel`, existing blue mussel, and green-lipped mussel records unchanged.

### Ingredient reference

```json
{
  "id": "ingredient-ref-mediterranean-mussel",
  "nameFr": "moule m\u00e9diterran\u00e9enne",
  "nameEn": "Mediterranean mussel",
  "aliasesFr": [
    "moules m\u00e9diterran\u00e9ennes",
    "moule gallo"
  ],
  "aliasesEn": [
    "Mediterranean mussels",
    "Mussel, Gallo",
    "Honey Mussels"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not add bare `mussel(s)` / `moule(s)`, the shared `moule d'élevage`, the misspelled Fish List variant `Mediterannean Mussel`, or the scientific binomial as aliases. The IGA and Québec strategy sources support the French display; the DFO rows support `moule gallo` and `Mussel, Gallo`; Seafood Depot supports `Honey Mussels` solely as the exact vendor product title.

## Source register

All sources below were checked or search-indexed on **2026-10-15**. The RMAQ PDF is older; the IGA result was indexed but could not be directly fetched. Limits are recorded so those sources are not presented as current inventory or generic recipe specifications.

| Source ID | Direct source and exact wording used | What it supports and limit |
|---|---|---|
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S01** | Canadian Food Inspection Agency, [CFIA Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 79456, *Mytilus galloprovincialis*: `Mussel / Moule Méditerranéenne`; second row `Mediterannean Mussel / Moule`. CFIA's [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) says the list provides French and English common names acceptable in Canada for fish labelling. | Canadian food-name/species pairing. The second English spelling is transposed, and generic `Mussel`/`Moule` are also assigned to other taxa; neither typo nor bare term is proposed as an alias. Dynamic results checked on the review date. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S02** | Fisheries and Oceans Canada, [Search Aquaculture Farmed Species](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-eng.htm), table row `Mussel, Gallo / Mediterranean | Mytilus galloprovincialis | Shellfish | British Columbia`; date modified 2015-03-03. | Canadian farmed-species and English aquaculture-name evidence. It is not a consumer-label authority and does not describe kitchen forms. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S03** | Pêches et Océans Canada, [Espèces d'élevage en aquaculture au Canada](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-fra.htm), row `Moule gallo | Mytilus galloprovincialis | Mollusques et crustacés | Colombie-Britannique`; date modified 2014-11-21. | Canadian French aquaculture name and province. `Moule gallo` is retained as a qualified alias, not the display name or a claim about consumer-label wording. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S04** | Canadian Aquaculture Industry Alliance, [Canadian Farmed Mussels](https://aquaculture.ca/canadian-farmed-mussels), exact sentence: `In British Columbia, both Blue mussels and Mediterranean mussels (Mytilus galloprovincialis) are farmed.` | Industry confirmation that this species is farmed in Canada and distinct from *M. edulis*. The page also contains older production statistics; none are used as current volume figures. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S05** | Seafood Depot, [Honey Mussels](https://www.seafooddepot.ca/product-musselhoney2), accessed directly 2026-10-15; exact product fields: `Honey Mussels`, `Mytilus galloprovincialis`, `Fresh`, `Cultured in British Columbia`, `Product of Canada`. The page footer carries 2009–2026 copyright. | Direct Canadian human-food product/taxon match and the exact product-title alias. The page does not show current inventory, package weight, live state, or a standard recipe use. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S06** | Office québécois de la langue française, [moule d'élevage (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408342/moule-delevage), last updated 1990; definition `Moule qui fait l'objet d'un élevage en mer pratiqué dans des parcs à moules`; note: `On distingue deux types de moules d'élevage : Mytilus edulis et Mytilus galloprovincialis.` | Québec terminology shows `moule d'élevage` spans both species. It is deliberately excluded as a species alias. The entry is not a current market listing. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S07** | Réseau des ressources marines du Québec, [Stratégie de mise en marché de la moule du Québec](https://rmquebec.ca/images/Documentation/etudes_et_recherches/Moules/710%2C60_Moules_marketing_final.pdf), search-indexed PDF; table header `Moule méditerranéenne` and species row *Mytilus galloprovincialis*. The indexed table gives `Nombre/livre` 10 à 15 and `Rendement en chair` 50%; footnote: `Ici, il s'agit du poids de la chair après la cuisson par rapport au poids de la chair et de la coquille.` | Québec French and historical commercial context. The PDF says the species is cultivated in France and in Washington/California, not that it is currently sold in Québec. Direct fetch failed during this review; the reported count and yield values are preserved as source-specific context only, not as reusable count mappings or active yield rules. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S08** | IGA Québec, [Quels sont les produits de la mer les plus écoresponsables?](https://www.iga.ca/fr/articles/quels_sont_les_produits_de_la_mer_les_plus_ecoresponsables), search-indexed article; exact indexed wording: `À l'exception des moules méditerranéennes Mytilus galloprovincialis d'élevage par filières en suspension de Companhia de Pescarias do Algarve dans la zone de pêche 27 (océan Atlantique, nord-est).` | Québec-facing terminology and an imported-farm product context. Direct retrieval returned a cache miss; the result is not treated as a current SKU or inventory confirmation. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S09** | Food and Agriculture Organization, [*Mytilus galloprovincialis* cultured aquatic species fact sheet](https://www.fao.org/fishery/docs/CDrom/aquaculture/I1129m/file/fr/fr_mediterraneanmussel.htm), dated 2009 and focused on Galicia, Spain. It gives `En Mediterranean mussel / Fr Moule méditerranéenne`; states `Le poids moyen peut représenter 50 pour cent du poids total quand les moules sont dans leurs meilleures conditions`; and describes fresh, canned, and frozen markets. | Species naming, non-Canadian product-state examples, and condition-dependent biological yield. This historical regional profile does not establish Canadian/Québec product forms, a universal edible yield, or substitutions. |
| **WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S10** | Canadian Food Inspection Agency, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species), row *Mytilus galloprovincialis* / `Mediterranean mussel`; the page explicitly says these names are for aquatic-animal-health purposes and **“do not replace the CFIA Fish List”** used for labelling. | Confirms the scientific-name pairing seen in the earlier blue-mussel ledger evidence and clarifies its limited use. The consumer-name decision relies on S01 instead. |

## Static review record

- Read `AGENTS.md`, relevant bilingual reference and form/substitution requirements in `Requirements.md`, the open Section P plan parent, current roadmap entries, active references/forms, legacy candidates, ledger ownership, and the focused proposal/batch archive.
- Confirmed there is no current active, form, legacy, or species-specific ledger allocation for *M. galloprovincialis*. The pre-existing generic mussel candidate and the separate blue- and green-lipped-mussel references remain unchanged.
- Reproduced the phrase-first picker projection using the current search normalization. Broad `mussel(s)` and `moule(s)` queries remain multi-result; the proposed species-qualified names and exact seller product phrase are unique.
- Parsed the 114 manifest-listed recipes and all 1,123 ingredient rows; the corrected ingredient-field-only scan found zero mussel-name or *M. galloprovincialis* demand. Whole-file `moule` hits in pan instructions were not counted as ingredient demand.
- This is documentation-only. No tests were run. Under the current `AGENTS.md` rule, no app, Gradle, unit, instrumentation, emulator, or deployment testing is needed for JSON-only database additions; this packet does not integrate any data.
