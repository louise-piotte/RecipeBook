# WP04 Section P — island mackerel identity boundary review (R316)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** island mackerel, *Rastrelliger faughni* Matsui, 1967 (ITIS TSN 202055).
- **Decision:** **Hold this candidate outside active ingredient references and the shared research ledger.** ITIS verifies the species and records the English/French common-name pair **island mackerel / maquereau des îles**. Canada's tariff schedule also pairs *R. faughni* with “Island mackerels” in a frozen-fish tariff line. Those establish taxonomic and trade-nomenclature links, but this review found no current Canadian or Québec human-food product listing that identifies this species. A Québec product listing uses the near-identical geographic phrase **maquereau des Îles-de-la-Madeleine** without a binomial, so using `maquereau des îles` as an active picker display could misdirect users selecting that local product. CFIA and OQLF species-specific naming could not be confirmed for this candidate.
- **Open checklist:** the plan's Section P fish-name item remains open: [resolve vernacular fish names against appropriate identity evidence](../../RecipeBook-global-ingredient-catalog-plan.txt#L7163). This review follows the already integrated R311 *R. kanagurta* and R314 *R. brachysoma* rows without extending their names or evidence to another sibling.
- **Shared-data effect:** none. No candidate row, source record, alias, form, measure, recipe link, conversion, yield, or substitution is proposed for shared data.
- **Tests:** none. This is proposal-only documentation; no app tests, builds, emulator checks, or deployment were run.
- **Proposal-local source-ID prefix:** `WP04-SECTIONP-ISLAND-MACKEREL-R316-20261016`; all IDs below remain local to this proposal and are not allocated in the research ledger.

## Ownership and prior decisions

The live reference catalog has separate Atlantic, canned, Indian, narrow-barred Spanish, Pacific, short, smoked, and spotted Spanish mackerel rows. The active forms file has no mackerel form. The ledger has 2,020 records and no *R. faughni*, `island mackerel`, or `maquereau des îles` record; the legacy-import identities file has no exact candidate. An exact candidate-name/ID/source-prefix search found no owner in the current catalog, legacy identities, ledger, prior Section P proposals, or batches. The proposed reference ID `ingredient-ref-island-mackerel` and R316 source prefix are unused.

The focused [R311 review](wp04-section-p-next-gap-review-r311-20261016.md) and [R314 review](wp04-section-p-short-mackerel-identity-review-r314-20261016.md) add the distinct *R. kanagurta* and *R. brachysoma* identities. Their evidence is species-scoped: do not reuse `maquereau des Indes`, `maquereau trapu`, `Indian mackerel`, or `short mackerel` for *R. faughni*. The target has not been assigned by those integrations or by any prior R316-name review. [R01]

## Taxonomy and naming evidence

ITIS reports *Rastrelliger faughni* Matsui, 1967 as a valid species with verified record credibility. Its common-name fields pair the taxon with **island mackerel** in English and **maquereau des îles** in French. This is direct species-level naming evidence; it is not proof of Canadian label acceptance, Québec terminology, current product availability, or culinary behavior. [S01]

Canada's official text for the Canada–Indonesia CEPA includes the Canadian tariff schedule. Frozen-fish tariff line 0303.59.10 lists **Indian mackerels (*Rastrelliger kanagurta*); Island mackerels (*Rastrelliger faughni*)**. This is a Canadian trade-classification name paired with the species, not an actual import record, a consumer package, or evidence of an available Canadian/Québec SKU. The schedule does not establish a recipe form or a measure. [S02]

CFIA's Fish List overview says that its list supplies English and French common names acceptable for Canadian fish labelling and the corresponding scientific names and TSNs. I searched the exact binomial and `island mackerel` in the Fish List and targeted CFIA web queries, but the legacy query endpoint was inaccessible in the web tool and no exact species result surfaced in indexed CFIA pages. **I cannot confirm whether CFIA currently lists *R. faughni* or assigns these names to it.** Do not treat that access limitation as evidence that the species is absent from the Fish List. [S03]

Targeted OQLF searches did not surface a species-specific GDT entry for *R. faughni* or `maquereau des îles`. The OQLF's general food/ichthyology entry for `maquereau` gives *Scomber* sp. and notes commercial potential in Québec; it does not identify *Rastrelliger*. The OQLF separately records `maquereau trapu` for *R. brachysoma*, the R314 sibling. Neither entry can be extended to *R. faughni*. ITIS's French common name remains useful candidate evidence, but an exact Québec food name is unverified. [S04; R314]

| Candidate field | Evidence and boundary | Recommendation |
|---|---|---|
| Species | ITIS recognizes valid *R. faughni*, distinct from the R311 *R. kanagurta* and R314 *R. brachysoma* species. | Keep the candidate taxon explicit in this proposal; do not merge it with either sibling or with generic mackerel. |
| English name | ITIS uses `island mackerel`; Canada's tariff schedule pairs `Island mackerels` with *R. faughni* for frozen fish. No species-qualified Canadian consumer SKU was found. | Do not add an active reference yet; retain the name only as source-supported candidate evidence. |
| French name | ITIS uses `maquereau des îles`; no exact OQLF entry or CFIA bilingual row was verified. Québec product wording uses `maquereau des Îles-de-la-Madeleine` for a geographically sourced fish without identifying *R. faughni*. | Keep the French phrase out of the active picker until its Québec food-market meaning and accepted labeling are clearer. |
| Aliases | The reviewed evidence does not establish a Canadian or Québec product alias for this species. Overseas/local names and genus-level sibling names do not transfer. | Add no aliases, including binomial search terms or generic `mackerel` / `maquereau`. |
| Forms and numeric data | Canada's tariff row is a trade classification. The Québec local product page describes a distinct, currently out-of-stock six-pack, 2.6 kg, line-caught, filleted and frozen-vacuum-packed mackerel; it supplies no species binomial. | Do not add frozen, filleted, whole, or other forms; do not reuse the package amount, infer a serving or count-weight, or derive density, unit mapping, conversion, or yield. |
| Recipes and substitutions | The bundled corpus has no candidate-name or genus match. The global and contextual substitution-rule files are empty, and no reviewed source supports interchangeability with another fish. | Add no recipe link, global or contextual substitution, warning, or recipe-line alternative. |

## Canadian and Québec food-market evidence

The CEPA tariff schedule gives an official Canadian species-linked designation for a frozen-fish customs category. It does not report trade volume or prove that a Canadian business currently imports or sells the fish. Searches for *R. faughni*, `island mackerel`, and `maquereau des îles` in Canadian and Québec food-retail contexts did not surface a current human-food product that named this taxon. Search coverage is bounded and does not prove that no niche import exists.

Distribution 4 Fourchettes lists **Maquereau des Îles-de-la-Madeleine** as six packages, 2.6 kg total, line-caught, filleted, and frozen under vacuum; the page showed the product as out of stock when checked. It gives no binomial. This is evidence for a Québec geographic product name and source-specific package wording, not *R. faughni* or an available SKU. The similarity between its French wording and ITIS's species name makes the shorter `maquereau des îles` unsafe to expose as a Québec picker name without stronger market labeling evidence. Do not attach the local SKU's package weight or filleted/frozen state to the island-mackerel candidate. [S05]

No reviewed source supplies a target-specific household portion, recipe quantity, density, yield, or safe replacement. The CEPA tariff unit is for trade classification, not cooking. The six-pack/2.6 kg amount on the Québec page belongs only to its unidentified local product. Do not convert either observation into reusable ingredient behavior.

## Picker boundary

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases match before substring fallback. It uses live bilingual names and aliases plus a hypothetical alias-free `Island mackerel / maquereau des îles` row; no catalog data is changed by this projection.

| Query | Current active picker | If the hypothetical row were added | Boundary |
|---|---|---|---|
| `island mackerel` | No result | Island mackerel only | ITIS and Canada trade schedule names select *R. faughni*. |
| `maquereau des îles` | No result | Island mackerel only | The exact phrase is ITIS-attested but is not confirmed as a Québec food-label name; it overlaps the beginning of a local Îles-de-la-Madeleine product phrase. |
| `maquereau des Îles-de-la-Madeleine` | No result | No result | The hypothetical shorter display does not contain this entire query phrase, so the picker would not resolve the local SKU name to the species. Its species is also unspecified. |
| `mackerel` | Eight: Atlantic, canned, Indian, narrow-barred Spanish, Pacific, short, smoked, and spotted Spanish mackerel | Same eight plus Island mackerel (nine) | A broad English query remains multi-result. |
| `maquereau` | Seven: Atlantic, canned, Indian, Pacific, short, and smoked mackerel, plus gooseberry / `groseille à maquereau` | Same seven plus Island mackerel (eight) | A broad French query remains multi-result, but does not resolve the Québec local product's species. |
| `Rastrelliger faughni` | No result | No result | Keep scientific names in evidence rather than adding them as picker aliases. |

Keep all target names out of the active picker under this hold. If later current Canadian/Québec food-label evidence resolves the species and French-market boundary, reassess an identity-only row with only the verified species-qualified bilingual names. Do not activate a lone row solely to expose a taxonomic name while its Québec product interpretation remains uncertain. [R01]

## Bundled recipe demand and substitution boundary

The manifest-ordered scan parsed all **114 recipe files** and **1,123 ingredient rows**, checking complete recipe JSON and ingredient-row text for `island mackerel`, `maquereau des îles`, *Rastrelliger faughni*, `faughni`, and `Rastrelliger`. It found **zero matching files and zero matching ingredient rows**. There is no bundled demand for a candidate identity, recipe relink, amount, or method. [R01]

The active bundled global and contextual substitution-rule files each contain zero rules. No source or recipe establishes directed, method- or dish-scoped replacement between *R. faughni* and Indian, short, Atlantic, Pacific, Spanish, canned, or smoked mackerel, or another fish. Add no substitution, conversion, or recipe-line link. [R01]

## Source register

All source IDs below are proposal-local. `R01` is a repository audit label, not a shared-ledger source record.

| Source ID | Source | Finding and limits |
|---|---|---|
| **WP04-SECTIONP-ISLAND-MACKEREL-R316-20261016-S01** | ITIS, [Report: *Rastrelliger faughni*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=202055), accessed 2026-10-16. | TSN 202055; rank species; current standing valid; record credibility `verified - standards met`; common names `island mackerel` and `maquereau des îles`. Taxonomy and global common-name evidence, not Canadian/Québec labelling or food-market availability. |
| **WP04-SECTIONP-ISLAND-MACKEREL-R316-20261016-S02** | Government of Canada, [Text of the Canada–Indonesia CEPA, Appendix I tariff schedule](https://www.international.gc.ca/trade-commerce/trade-agreements-accords-commerciaux/agr-acc/indonesia-indonesie/cepa-apeg/text-texte.aspx?lang=eng), accessed 2026-10-16. | Canadian frozen-fish tariff line 0303.59.10 pairs “Island mackerels” with *R. faughni* (and separately pairs Indian mackerel with *R. kanagurta*). Trade-classification evidence only; it does not prove shipments, retail availability, Canadian bilingual consumer-label acceptance, or culinary form. |
| **WP04-SECTIONP-ISLAND-MACKEREL-R316-20261016-S03** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and attempted [exact-species Fish List query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s&q=Rastrelliger%20faughni), accessed 2026-10-16. | The overview defines the Fish List as a source of acceptable Canadian English/French fish-label names and species scientific names/TSNs. The exact legacy query was inaccessible through the web tool, and indexed queries did not surface a result. This review cannot confirm a CFIA row or claim that none exists. |
| **WP04-SECTIONP-ISLAND-MACKEREL-R316-20261016-S04** | OQLF, [GDT: `maquereau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau), accessed 2026-10-16. | Gives English `mackerel`, Latin *Scomber* sp., and a note that the name applies to a species with commercial potential in Québec. Targeted searches did not surface a species-specific *R. faughni* entry. The generic entry does not assign *Rastrelliger* or establish `maquereau des îles` as Québec consumer wording. |
| **WP04-SECTIONP-ISLAND-MACKEREL-R316-20261016-S05** | Distribution 4 Fourchettes, [Maquereau des Îles-de-la-Madeleine](https://distribution4fourchettes.com/produit/maquereau-des-iles-de-la-madeleine/), accessed 2026-10-16. | The Québec product page describes six packs, 2.6 kg, line fishing, filleting, and frozen vacuum packing; it showed `Rupture de stock`. It gives no scientific name. This supports the local geographic phrase and product-specific details, not *R. faughni*, current availability, a reusable form, or recipe portion. |
| **WP04-SECTIONP-ISLAND-MACKEREL-R316-R01** | Read-only audit of the Section P plan, current [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), prior proposals and batches, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), manifest-listed recipes, substitution files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Exact ownership and source-prefix audit, static picker projection, full recipe-corpus scan, and rule/form inspection. Repository evidence only; not a shared-ledger source. |

## Final recommendation

**Hold** *Rastrelliger faughni* outside active references and the shared ledger. Taxonomy and international/Canadian trade nomenclature support the species and the name `island mackerel`, while ITIS also attests `maquereau des îles`. The review could not verify a CFIA food-label row, a species-specific OQLF entry, or current Canadian/Québec food-market product evidence; the local Québec geographic mackerel phrase is not assigned to this species. The bundle has no demand. Do not add an identity, French display, alias, form, measure, recipe link, conversion, yield, or substitution until the Canadian/Québec identity and market boundary is resolved.
