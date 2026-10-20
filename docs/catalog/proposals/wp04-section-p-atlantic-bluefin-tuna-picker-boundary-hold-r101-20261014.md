# WP04 Section P — Atlantic bluefin tuna picker-boundary hold

- **Review date:** 2026-10-14
- **Scope:** Atlantic bluefin tuna, *Thunnus thynnus*, and the adjacent Pacific bluefin name boundary.
- **Recommendation:** Keep an Atlantic bluefin identity outside the active picker for now. The qualified fish name is supported, but the single-row projection would make broad `bluefin` and `thon rouge` searches select Atlantic bluefin alone, while Canadian sources apply those names across *T. thynnus* and *T. orientalis*.
- **Disposition:** Hold recorded on 2026-10-14; see [the batch record](../batches/wp04-section-p-atlantic-bluefin-picker-boundary-hold-integration-20261014/README.md).
- **Data effect:** Proposal-only hold. Do not add a reference, alias, form, measure, recipe link, conversion, yield, or substitution.

## Existing scope and ownership

The Section P parent covers salmon, tuna, and other finfish. Its previous salmon/tuna species-scope review kept the bundled `tuna steak` line linked to generic tuna and recorded a general unresolved candidate; it did not simulate the picker effect of a separately qualified Atlantic bluefin row. This review adds that distinct name-collision check without assigning the generic recipe to a tuna species. See [the active plan’s tuna boundary](../../RecipeBook-global-ingredient-catalog-plan.txt#L4658), [the salmon/tuna scope review](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md), and [the prior tuna-steak review](wp04-tuna-steak-recipe-boundary-review-20261011.md).

At the ownership snapshot for this review, the live catalog contained 1,440 ingredient references and 105 forms, the legacy-import file contained 63 candidates, and the research ledger contained 1,780 records. The only active tuna reference is `ingredient-ref-tuna`, displayed as `tuna / thon`, with no aliases. No tuna-specific form is active. No active reference, form, or legacy candidate owns `Atlantic bluefin tuna`, `thon rouge de l’Atlantique`, *Thunnus thynnus*, or the proposed reference ID `ingredient-ref-atlantic-bluefin-tuna`. The ledger has the broader `candidate-wp04-tuna-species-scope`, but no dedicated Atlantic-bluefin candidate or prior Atlantic-bluefin picker decision. The source-ID prefix `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014` was unallocated at review time.

## Canadian and Québec identity evidence

CFIA’s Fish List query, modified **2023-09-18**, assigns TSN 172421 to *T. thynnus* and TSN 172422 to *T. orientalis*. It lists `Bluefin Tuna` for both taxa and lists `Thon Rouge` for both, although on different bilingual rows: `Bluefin Tuna / Thon Rouge` and `Northern Bluefin Tuna / Thon Rouge de l’Atlantique` for *T. thynnus*; `Bluefin Tuna / Thon` and `Oriental Tuna / Thon Rouge` for *T. orientalis*. CFIA also provides the fully qualified `Pacific Bluefin Tuna / Thon Rouge du Pacifique` name for *T. orientalis*. Thus the Fish List supports a narrow Atlantic name pair, but the short picker terms still span both identities.

OQLF’s edible-fish GDT entry, last updated **2012**, prefers **thon rouge**, gives **bluefin tuna**, and identifies *T. thynnus*. It also says the commercial market does not distinguish the two forms it describes as subspecies. This is useful Québec terminology evidence, but the older nomenclature does not resolve the separate *T. orientalis* entry in the later-modified CFIA Fish List. Fisheries and Oceans Canada’s bilingual species profiles identify Atlantic bluefin tuna / thon rouge as *T. thynnus*.

Current Québec-facing market evidence illustrates the same naming boundary. The Montréal retailer La Mer lists fresh `Thon Bluefin` products including a darne advertised at about 250 g and a saku portion advertised at about 200 g. Those are seller-specific product descriptions and amounts; the pages do not give a scientific name. The Québec wholesaler JANS Seafood labels its farmed product `Bluefin` and identifies its species as *T. orientalis*. JANS is a commercial source, not a taxonomic authority, but its local product evidence confirms that `Bluefin` is used for the Pacific taxon in Québec trade. Neither listing establishes a recipe measure or a general preparation form.

If this identity is revisited for addition, the narrow bilingual display to evaluate is `Atlantic bluefin tuna / thon rouge de l’Atlantique`, corresponding to CFIA’s qualified row. Keep aliases empty. Do not shorten the displays to `bluefin tuna / thon rouge`, and do not add `bluefin`, `thon rouge`, `tuna`, or `thon` as aliases.

## Picker projection

The audit follows `IngredientReferenceSearchIndex`: it folds accents and punctuation, returns complete normalized word-phrase matches first, then falls back to substring matching. The projection below simulates the qualified Atlantic display pair above without adding it to the live catalog.

| Search query | Current result | With a single Atlantic-bluefin row | Boundary |
|---|---|---|---|
| `Atlantic bluefin tuna` | None | Atlantic bluefin tuna / thon rouge de l’Atlantique | A qualified English search would identify the proposed taxon. |
| `thon rouge de l’Atlantique` | None | Atlantic bluefin tuna / thon rouge de l’Atlantique | A qualified Québec French search would identify the proposed taxon. |
| `bluefin tuna` / `bluefin` | None | Atlantic bluefin tuna / thon rouge de l’Atlantique | The single result would imply that the broad CFIA term names only *T. thynnus*, despite its use for *T. orientalis* too. |
| `thon rouge` | None | Atlantic bluefin tuna / thon rouge de l’Atlantique | The single result would hide the CFIA *T. orientalis* `Oriental Tuna / Thon Rouge` row. |
| `tuna` / `thon` | Generic tuna / thon | Generic tuna / thon; Atlantic bluefin tuna / thon rouge de l’Atlantique | The generic recipe search becomes multi-result, but the species collision on `bluefin` and `thon rouge` remains. |
| `Pacific bluefin` / `thon rouge du Pacifique` | None | None | The Atlantic display does not claim the Pacific-qualified name. |

The narrow display pair is not enough to make this a safe singleton: the current picker treats each word within a display phrase as searchable. Leave the row unallocated until a paired Pacific-bluefin review can preserve both species in the broad results, or search can represent the known cross-taxon name boundary without selecting one species alone.

## Bundled recipe demand and product behavior

The complete manifest-listed scan covered **114 recipe files, 1,123 ingredient rows, and 753,928 recipe-file bytes**. It found zero full-file hits and zero ingredient-row hits for `Atlantic bluefin tuna`, `bluefin tuna`, `thon rouge`, `thon rouge de l’Atlantique`, *Thunnus thynnus*, and *Thunnus orientalis*.

The only tuna line is recipe 111, line 1: `1 tuna steak`, linked to `ingredient-ref-tuna`, with a count quantity. It contains no species, source label, product cut beyond “steak,” or weight. It cannot support an Atlantic-bluefin link or transfer the La Mer package weights. No preparation form, default measure, density, unit mapping, conversion, cooking yield, or species-level substitution is supported. The wholesaler and retailer product descriptions do not establish a role- and method-scoped replacement for generic tuna or any other fish. Add no recipe link or substitution rule.

## Considered row if the picker boundary is resolved

This is the narrow identity pair considered for a later review, **not a proposal to add the row now**:

```json
{
  "id": "ingredient-ref-atlantic-bluefin-tuna",
  "nameEn": "Atlantic bluefin tuna",
  "nameFr": "thon rouge de l\u2019Atlantique",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
```

No density, mapping, form, measure, recipe link, conversion, yield, or substitution accompanies this hypothetical row. The reason for holding it is the projected broad-query collision, not a lack of taxonomic evidence.

## Sources

All online sources were accessed **2026-10-14**. The CFIA Fish List reports its modification date in the page footer.

| Source ID | Source and date | Use and limit |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014-S01` | CFIA, [Fish List tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna), modified 2023-09-18. | TSNs, *T. thynnus* and *T. orientalis*, and their Canadian fish common-name rows. Label-naming evidence, not recipe intent. |
| `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014-S02` | OQLF, [GDT: thon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge), last updated 2012. | Preferred Québec edible-fish term, English equivalent, *T. thynnus* identification, and the older commercial-naming note. |
| `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014-S03` | Fisheries and Oceans Canada, [Bluefin Tuna profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-eng.html), accessed 2026-10-14; no publication date displayed. | Identifies Atlantic Bluefin Tuna as *T. thynnus*. Taxon evidence; management text is not used to claim a current quota or harvest permission. |
| `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014-S04` | Fisheries and Oceans Canada, [Thon rouge profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-fra.html), accessed 2026-10-14; no publication date displayed. | French government species profile for *T. thynnus* and Atlantic wording. |
| `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014-S05` | JANS Seafood, [products and weekly arrivals](https://www.jansseafood.ca/), accessed 2026-10-14. | Québec wholesaler lists farmed Bluefin as *T. orientalis*, fresh H&G, with listed sourcing and availability. Commercial use evidence, not a naming authority. |
| `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014-S06` | Poissonnerie La Mer, [Thon Bluefin — Darne](https://www.lamer.ca/products/thon-bluefin-darne), accessed 2026-10-14. | Current Montréal-facing fresh product page; seller gives a roughly 250 g darne and no Latin name. SKU-specific product information only. |
| `WP04-SECTIONP-ATLANTIC-BLUEFIN-R101-20261014-S07` | Poissonnerie La Mer, [Thon Bluefin — Saku](https://www.lamer.ca/products/darne-thon-bluefin-frais), accessed 2026-10-14. | Current Montréal-facing fresh product page; seller gives a roughly 200 g saku presentation and no Latin name. SKU-specific product information only. |

## Review result

Hold Atlantic bluefin tuna outside active references and the research ledger. Preserve the generic `tuna / thon` row and recipe 111 link. Revisit after a separate *T. orientalis* name and picker review or after the search behavior can keep the cross-taxon `bluefin` and `thon rouge` queries visibly unresolved. The batch record documents this hold without changing catalog or ledger data. Static checks covered current ownership, source-ID availability, picker projection, manifest-listed recipe demand, source links, local plan link, UTF-8, and whitespace. No app tests or emulator work were run; this is a documentation-only hold.
