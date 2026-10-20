# WP04 Section P — Beaked redfish / sébaste atlantique identity review

- **Review and source-access date:** 2026-10-13.
- **Status:** Integrated R73.
- **Scope:** One species-scoped finfish identity, *Sebastes mentella* (TSN 166756).
- **Integrated reference:** Added identity-only `Beaked redfish / sébaste atlantique` as `ingredient-ref-beaked-redfish` in `PROTEIN`. Both alias arrays are empty. No form, measure, recipe link, density, unit mapping, conversion, yield, or substitution was added.

## Identity and Québec / Canadian naming scope

The Canadian Food Inspection Agency (CFIA) Fish List links TSN 166756 and *Sebastes mentella* to species-associated label names. The queried list includes `Beaked Redfish / Poisson Rose`, `Rosefish / Sébaste Atalantique` (spelled this way in the CFIA output), `Ocean Perch / Poisson Rouge`, `Atlantic Ocean Perch / Perche Rose`, `Redfish / Sébaste`, and `Atlantic Rosefish / Perche Rose Atlantique`. Its output also has a separate hazard column that marks this species “Subject to Environmental Contaminants.” That flag is hazard metadata, not part of the common-name mapping and not a contaminant concentration, species-specific mercury measurement, or consumption recommendation.

The Government of Canada Translation Bureau’s TERMIUM Plus record (2023-01-04) identifies *S. mentella*. It marks English `beaked redfish` as the trade name recommended by the commercial-fisheries terminology committee and Fisheries and Oceans Canada; `deepwater redfish` is another correct English term, not the stated recommendation. In French, TERMIUM marks `sébaste atlantique` as the normalized commercial name and `sébaste du Nord` as another correct term. The integrated display uses the recommended English name and the standardized French name. Neither alternate term is added as an alias.

Québec scope is supported by the Québec-facing Mange ton Saint-Laurent species page, which pairs *Sebastes mentella* with `sébaste atlantique` and lists the English names `beaked redfish` and `deepwater redfish`. Its page was last modified 2025-12-16. This is local species-name and food-context evidence; no stock-status, fishery reopening, or availability claim from that page is used here. OQLF’s `sébaste` entry remains broader: it covers *Sebastes* sp., lists generic English translations `redfish`, `rosefish`, and `ocean perch`, and says Québec catches include *S. marinus*, *S. fasciatus*, and *S. mentella*. OQLF also says `poisson rouge` and `perche de mer` were not retained for Québec fish-product marketing. The genus-level entry does not define this species’ display name or make its broad terms species synonyms.

A French-language Metro product page provides one Canadian product-state link to the taxon: item 246551 is titled `Filet de sébaste décongelé` in French and `Thawed Rockfish Fillet` in English; its ingredient text identifies `Sebastes mentella` and gives Northwest Atlantic, Canada as provenance. It is an individual previously frozen/thawed fillet listing, not evidence that every product sold as `sébaste`, `redfish`, or `rockfish` is this species. At the selected store the page reported the product out of stock. This SKU evidence does not establish current Québec-wide inventory or species-specific availability.

**Naming confidence:** High for the scientific identity and English/French species pair, based on CFIA, TERMIUM, and the Québec species page. The direct OQLF entry is explicitly group-level. Retail support is species-identified for this one SKU only.

## Exact ownership and archive status

The read-only audit covered active reference displays and aliases, form labels and match terms, legacy-import candidates, ledger record IDs and identity allocations, the full bundled recipe package, and the Section P proposal/batch archive. Current snapshot counts were 1,395 active references, 102 forms, 63 legacy candidates, and 1,730 ledger records with 5,766 distinct source IDs.

| Candidate or nearby term | Current ownership and boundary |
|---|---|
| `Beaked redfish`, `sébaste atlantique`, *Sebastes mentella*, TSN 166756 | No active display/alias, form label/match term, or legacy-import candidate owns this species identity. The exact binomial and TSN are evidence, not proposed picker aliases. |
| `ingredient-ref-beaked-redfish`, `candidate-beaked-redfish` | No active reference ID, legacy ID, or ledger record ID collision. No ledger record allocates *S. mentella* as a distinct ingredient identity. |
| Existing redfish rows | `ingredient-ref-quebec-redfish` is the verified Québec *Sebastes* market-group row (`Québec redfish / sébaste du Québec`). `ingredient-ref-acadian-redfish` is the R72 species row (`Acadian redfish / sébaste acadien`) for *S. fasciatus*. Neither row has attached forms. Their existing group/fishery source notes that *S. mentella* occurs in the Québec market/fishery; those mentions do not allocate it as an ingredient row. |
| Ledger ownership | The group ledger record is `ingredient-ref-quebec-redfish`; the species record is `ingredient-ref-acadian-redfish`. There is no `ingredient-ref-beaked-redfish` or `candidate-beaked-redfish` record. R72’s *S. mentella* reference is fishery-context evidence for the two-species Unit 1 fishery, not an identity allocation. |
| Broad and overlapping names | `redfish` and `sébaste` belong to the names of both the existing group row and the Acadian species row. CFIA’s `redfish`, `ocean perch`, `rosefish`, `Atlantic rosefish`, and related labels overlap taxonomic/common-name use; they are not copied into the new alias arrays. `poisson rouge` is also excluded given OQLF’s Québec marketing note. |
| Prior review | The earlier [Québec redfish group review](wp04-section-p-quebec-redfish-market-group-review-20261012.md) explicitly left species identities separate from the group. R72 reviewed and integrated *S. fasciatus* as Acadian redfish. Other archive mentions of *S. mentella* are group or fishery context; the proposal/batch archive contains no dedicated *S. mentella* identity allocation or product-boundary disposition. |

The reference ID and source-ID prefix `WP04-SECTIONP-BEAKED-REDFISH-20261013-R73-` were checked against active catalog data, the ledger, and proposal/batch archives; no collision was found. No new source ID is assigned to the already registered CFIA, OQLF, and DFO pages cited below.

## Picker projection

`IngredientSearch.kt` lowercases, applies Unicode NFKD, folds selected ligatures, removes diacritics, converts punctuation to spaces, and checks complete normalized word phrases before substring fallback. The projection adds one reference with empty alias arrays and no forms.

| Search | Current results | With proposal | Result |
|---|---|---|---|
| `Beaked redfish` | 0 | 1 | `Beaked redfish / sébaste atlantique` |
| `sébaste atlantique` / `sebaste atlantique` | 0 | 1 | Accent folding matches the French display. |
| `redfish` | 2 | 3 | `Québec redfish / sébaste du Québec`, `Acadian redfish / sébaste acadien`, and `Beaked redfish / sébaste atlantique` all remain visible. |
| `sébaste` / `sebaste` | 2 | 3 | The Québec market group and both species rows remain distinct. |
| `Québec redfish` / `sébaste du Québec` | 1 group result | 1 group result | No change to the broader group selection. |
| `Acadian redfish` / `sébaste acadien` | 1 Acadian result | 1 Acadian result | No change to R72’s *S. fasciatus* selection. |
| `deepwater redfish`, `sébaste du Nord`, `Poisson Rose`, `Poisson Rouge`, `ocean perch`, `rosefish`, `rockfish`, scientific name, TSN | 0 | 0 | These are not display terms or aliases. The recommended/standardized pair remains narrow; broad or alternate names are not made species synonyms. |

The broad queries still distinguish the Québec group from the two species-scoped rows. The generic Québec product and fishery are not silently remapped to *S. mentella*.

## Bundled recipe demand

The manifest lists 114 complete recipe files with 1,123 ingredient rows. A phrase scan of every complete recipe JSON file and every ingredient row found **zero** matches for `Beaked redfish`, `deepwater redfish`, `sébaste atlantique`, *Sebastes mentella*, `S. mentella`, or TSN 166756. There were also zero ingredient-row matches for the generic `redfish` or `sébaste` terms. The corpus supplies no recipe link, quantity, preparation form, yield, count-to-mass evidence, or substitution basis for this species.

## Numeric, conversion, and substitution limits

- Metro item 246551 offers SKU-specific options described as `200g fillet (1 pers.)`, `400g fillet (2 pers.)`, `600g fillet (3 pers.)`, and `800g fillet (4 pers.)`. These are product-page variant/serving labels for one thawed SKU. They are not a general fillet mass, reusable portion, species-wide conversion, or current availability claim.
- Health Canada Canadian Nutrient File code 3031, `Fish, ocean perch, Atlantic, raw`, lists 100 g edible portion = 100 g, 1 fish (500 g) = 141.1 g edible, a 90 g food-guide serving, and 72% refuse. Code 3032, `Fish, ocean perch (rosefish, redfish), Atlantic, baked or broiled`, lists 100 ml flaked = 57.5 g, 250 ml = 143.7 g, a 75 g food-guide serving, and 72% refuse. These records use common names without a binomial; CFIA maps overlapping `ocean perch`/`rosefish`/`redfish` wording across *Sebastes*. The figures therefore remain CNF-entry-specific and do not establish *S. mentella*-specific raw yield, cooked density, household mapping, or portion size. The cooked flaked-food volume weights are not proposed as a reusable density or conversion.
- The CFIA environmental-contaminant flag is separate from its species/common-name rows and from these CNF serving examples. This review adds no contaminant measurement or dietary/mercury recommendation.
- DFO’s 2025–2026 Unit 1 announcement identifies *S. mentella* and *S. fasciatus* as the two key Gulf redfish species; its 2026–2027 plan sets a **60,000 t** total allowable catch for the Unit 1 redfish fishery. Those are fishery-management statements, not species-specific retail-lot identity or Québec product availability. The quota is not a culinary amount.
- No reviewed source supports a *Sebastes mentella*-specific or transferable directed form conversion, edible/cooking yield, or contextual substitution between this species, Acadian redfish, the generic Québec group, or another fish. No candidate-specific density, mass-volume mapping, count conversion, yield, or substitution rule was added.

## Integrated disposition

Added `ingredient-ref-beaked-redfish` as a `PROTEIN` identity with display names `Beaked redfish / sébaste atlantique` for *Sebastes mentella* and empty aliases. TERMIUM supplies the preferred English trade name and standardized French commercial term; CFIA links the species to Canadian fish-label names; Québec terminology and the French-language species-identified product page support local context. The picker can expose the exact qualified identity while keeping the generic Québec group and R72 Acadian row visible together on broad searches. Keep all SKU, CNF, and fishery quantities source-scoped, and add no form, measure, conversion, recipe link, yield, or substitution.

## Sources

Sources were reviewed on 2026-10-13. Reused IDs are already registered in the active `ingredient-ref-quebec-redfish` ledger record.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BEAKED-REDFISH-20261013-R73-S01** | Government of Canada Translation Bureau, [TERMIUM Plus: *Sebastes mentella*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ptr&lang=eng&srchtxt=SEBASTES+MENTELLA) | Fish record dated 2023-01-04 identifies the taxon; recommends `beaked redfish` as the trade name; also recognizes `deepwater redfish`; standardizes French `sébaste atlantique` and lists `sébaste du Nord` separately. Only the recommended English and standardized French terms are used. |
| **WP04-SECTIONP-BEAKED-REDFISH-20261013-R73-S02** | Mange ton Saint-Laurent!, [Sébaste atlantique](https://mangetonsaintlaurent.com/especes/sebaste-atlantique/) | Québec-facing species page directly pairs *S. mentella* with `sébaste atlantique` and names `beaked redfish` / `deepwater redfish`. Last modified 2025-12-16. Used only for local identity/culinary naming context, not fishery status, availability, health guidance, or a kitchen measure. |
| **WP04-SECTIONP-BEAKED-REDFISH-20261013-R73-S03** | Metro, [Filet de sébaste décongelé, item 246551](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filet-de-sebaste-decongele/p/246551) | French-language product page names a thawed rockfish fillet and identifies *S. mentella*, Northwest Atlantic/Canada provenance, and a wild bottom-trawl method. Lists 200/400/600/800 g variant labels for 1/2/3/4 persons. SKU-specific only; page reported out of stock at the selected store and inventory may change. |
| **WP04-SECTIONP-BEAKED-REDFISH-20261013-R73-S04** | Health Canada, [Canadian Nutrient File, food code 3031](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3031) | Raw Atlantic ocean-perch entry; records 500 g whole fish → 141.1 g edible, 90 g guide serving, and 72% refuse. It has no species binomial and does not support an *S. mentella* conversion. |
| **WP04-SECTIONP-BEAKED-REDFISH-20261013-R73-S05** | Health Canada, [Canadian Nutrient File, food code 3032](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3032) | Baked/broiled Atlantic ocean-perch/rosefish/redfish entry; records 100 ml flaked = 57.5 g, 250 ml = 143.7 g, 75 g guide serving, and 72% refuse. Common-name-only entry, not species-specific; no density or mapping is proposed. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S05`** | CFIA, [Fish List redfish query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Redfish) | Maps TSN 166756 / *S. mentella* to Canadian label names, while similar terms overlap other taxa. Its environmental-contaminant hazard field is independent of that mapping and is not culinary or mercury advice. Fish List modified 2023-09-18. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01`** | OQLF GDT, [sébaste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Québec edible-fish term scoped to *Sebastes* sp.; names three species in Québec catches and gives generic translations `redfish`, `rosefish`, `ocean perch`. Last updated 2012; not a species-specific display. Notes that `poisson rouge` and `perche de mer` were not retained for Québec fish-product marketing. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S03`** | Fisheries and Oceans Canada, [Unit 1 Redfish Management Plan 2026–2027](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-33-fra.html) | Sets a combined 60,000 t Unit 1 fishery TAC for 2026–2027. Not product-name, retail-lot identity, species-specific availability, or recipe-measure evidence. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S04`** | Fisheries and Oceans Canada, [second year of the commercial Redfish fishery (2025–2026)](https://www.canada.ca/en/fisheries-oceans/news/2025/06/fisheries-and-oceans-canada-announces-details-for-second-year-of-commercial-redfish-fishery.html) | Identifies *S. mentella* and *S. fasciatus* as the two key Gulf redfish species in the Unit 1 fishery context. Its 2025–2026 management scope does not identify a particular product or establish retail availability. |

**Integration checks:** Reference and ledger ownership, source-ID collision, picker projection, and complete recipe/ingredient-row scans were checked. The active reference and ledger record contain only the qualified display pair, with empty alias arrays and no numeric or recipe behavior. UTF-8 without BOM, relative links, and whitespace were checked. No app tests or emulator checks were run because the change only adds database JSON data.
