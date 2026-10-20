# WP04 Section P — black drum / grand tambour identity review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Root-reviewed identity integration of one uncovered fish, including Canadian and Québec naming, product scope, picker behavior, exact ownership, measures/forms, substitutions, and the complete bundled recipe corpus.
- **Disposition:** Integrated species-scoped, identity-only `black drum / grand tambour` for *Pogonias cromis*. Aliases remain empty; no form, measurement, recipe link, conversion, yield, or active substitution was added. See the [integration batch](../batches/wp04-section-p-black-drum-identity-integration-20261013/README.md).

## Candidate boundary

The open Section P parent still names regional fish and vernacular names as unfinished work. This review selects *Pogonias cromis*, distinct from the already active freshwater drum / malachigan (*Aplodinotus grunniens*) and red drum / tambour rouge (*Sciaenops ocellatus*). The exact CFIA Fish List row gives TSN **169288**, *P. cromis*, **Black Drum / Grand Tambour**, and family Sciaenidae. CFIA’s guidance says the Fish List provides accepted English and French fish names for Canadian labelling. OQLF’s edible-fish entry independently gives the preferred Québec French term **grand tambour**, English **black drum**, and the same binomial. It calls the fish a species with commercial potential in Québec; that note is not evidence of current retailer stock. [S01–S03]

The bilingual identity is unambiguous at the species level. The broader words `drum` and `tambour` cover additional fish and should remain unallocated as aliases. The catalog can expose the qualified names while preserving multiple results for these broad picker searches.

| Proposed identity shape (not active data) | Value |
|---|---|
| ID | `ingredient-ref-black-drum` |
| Category | `PROTEIN` |
| English display | `black drum` |
| Québec French display | `grand tambour` |
| Scientific scope | *Pogonias cromis* |
| English aliases | None |
| French aliases | None |

This recommendation represents a named edible-fish identity only. It does not claim that black drum is currently stocked by Québec retailers.

## Taxonomy, bilingual naming, and product-market evidence

- **CFIA and Canadian naming:** The CFIA Fish List has a species-level row for *P. cromis* with the exact label pair **Black Drum / Grand Tambour**. The Fish List guidance describes its common names as those used for Canadian fish labelling; this supports a Canadian market-name identity, not actual current inventory. [S02, S03]
- **Québec terminology:** OQLF lists the entry under zoology/ichthyology and edible fish, pairs **grand tambour** with **black drum** and *P. cromis*, and says the species has commercial potential in Québec. OQLF identifies `tambour`, `grondeur noir`, and `courbine` as context-specific terms not retained by the fish-products terminology committee. Do not use these as aliases. [S01]
- **Canadian fish occurrence:** Fisheries and Oceans Canada’s *Poissons de la côte atlantique du Canada* reports a 1947 *P. cromis* capture in a Fundy weir in Nova Scotia. This is historical occurrence evidence, not a current fishery, retail product, or Québec-availability claim. [S05]
- **Current product-state evidence:** Chile’s Servicio Nacional de Pesca y Acuicultura (Sernapesca) 2026 product basket lists *P. cromis* as frozen raw IQF skinless/boneless fillet, skinless fillet with bones, and whole fish with skin, bones, and scales. This establishes current species-named product presentations in an official seafood product classification; it does not establish a Canadian consumer package, standard serving, yield, or kitchen form. [S06]
- **Québec retail evidence:** No current Québec consumer listing or package identifying *P. cromis* was located in this review. The OQLF commercial-potential note and the CFIA accepted label should not be restated as proof of local stock.

The recommended display does not use OQLF’s broader English variants `sea drum` or `oyster drum`, which TERMIUM also records, and does not add `oyster cracker` or `drummer`. These are not needed to retrieve the species. In the current picker, `oyster` already returns dried oyster, oyster sauce, vegan oyster sauce, and oyster mushrooms; an `oyster drum` alias would mix a fish with those unrelated results. A `sea drum` alias would also add this fish to broad `sea` queries. Retain only the source-backed display pair. [S01, S04]

## Exact ownership and live snapshot

The pre-integration data audit found **1,331 ingredient references, 98 forms, 64 legacy-import candidates, 1,639 research-ledger records, and 8 unit-conversion records**. Recursive exact normalized-value checks found no owner for `ingredient-ref-black-drum`, `candidate-black-drum`, `black drum`, `grand tambour`, *Pogonias cromis*, `sea drum`, `oyster drum`, or `drummer` in identity-bearing fields or values of the active reference catalog, forms, legacy candidates, or ledger. No exact black-drum candidate was found in the current plan, existing Section P proposals, or batch notes. The proposal-local source-ID prefix `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2` was also absent before this file was created.

| Live file | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,331 | `24a903c5ebb3cb254e179d9110ac05203115bd394b4ec96d62e7d9756557c05e` |
| `ingredient-forms.v1.json` | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,639 records; 8 unit conversions | `86c94384e93edee7e403c4cd86ec06a8a021cea82a17a25560ef21bc9ca211c4` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The scoped source prefix is proposal-local only. No owner or source observation was reserved in the shared ledger.

## Current picker projection

The projection follows the current normalizer and phrase-first search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row below uses only the proposed bilingual display names, no aliases, and no forms; it is not active.

| Query | Current results | With hypothetical row | Result |
|---|---|---|---|
| `black drum` | None | black drum / grand tambour | One species-specific result. |
| `grand tambour` | None | black drum / grand tambour | One species-specific result. |
| `drum` | freshwater drum; red drum | freshwater drum; red drum; black drum | Broad English query continues to show multiple fish. |
| `tambour` | red drum | red drum; black drum | Broad French query displays both matching choices. |
| `oyster` | dried oyster; oyster sauce; vegan oyster sauce; king oyster mushroom; oyster mushroom | Same five results | No broad-query pollution when `oyster drum` stays inactive. |
| `sea` | coarse sea salt; fine sea salt; flaky sea salt; orange-footed sea cucumber; sea buckthorn berry; sea lettuce | Same six results | No broad-query pollution when `sea drum` stays inactive. |
| `oyster drum`; `sea drum` | None | None | Keep these English variants out of aliases. |

The broad `drum` and `tambour` results include other taxa or products, so they are not safe aliases for this species. The qualified names make the intended fish searchable without assigning those broad terms to one species.

## Bundled recipe demand

The audit scanned every path in the live manifest: **114 recipe files, 1,123 ingredient rows, 753,792 bytes**, with corpus digest `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. All JSON string fields and ingredient rows were searched using normalized case, accents, punctuation, and whitespace for `black drum`, `grand tambour`, *Pogonias cromis*, `sea drum`, `oyster drum`, `oyster cracker`, and `drummer`.

**Results: zero recipe-file hits, zero ingredient-row hits, and zero ingredient-row hits for adjacent broad terms `drum` or `tambour`.** The recipe corpus therefore supports no recipe link, preparation form, amount, cooking method, or recipe-scoped substitution for this candidate.

## Measures, forms, and substitution

No app form, measure, density, unit mapping, count-to-mass conversion, volume conversion, edible-yield value, or cooking-yield value is proposed.

- Sernapesca’s product classifications establish several frozen raw product presentations but contain no household serving measure or portion mass. Treat them only as product-state evidence. [S06]
- Health Canada’s current Canadian Nutrient File search portal was checked for the common and scientific names, but this review did not surface a species-matched serving record. Health Canada’s accessible common-food fish table also did not surface black drum. Record the measurement question as unresolved rather than as proof that no analysis exists. Do not transfer values for freshwater drum, red drum, or other finfish. [S07, S08]
- No source located gives a black-drum-specific density, cup volume, standard fillet weight, edible-portion yield, whole-to-fillet yield, cooked yield, or measured recipe amount. Add none.
- No recipe or product source provides a directed, quantity-backed black-drum substitute. Keep black drum distinct from freshwater drum, red drum, other croakers, bass, and generic white fish; add no global or contextual substitution.

## Revisit and integration bounds

If integrated, create only the species-scoped identity row shown above. Leave both alias arrays empty. Keep `drum`, `tambour`, `sea drum`, `oyster drum`, `oyster cracker`, `drummer`, `grondeur noir`, and `courbine` outside the row. Add no form, measurement, recipe link, conversion, yield, or substitution. Revisit product forms or quantitative data only when a Canadian/Québec product or exact recipe supplies the named state and amount. A new Québec retailer listing would establish availability, not a general measure or substitute.

## Sources

Online sources were accessed on **2026-10-13**. The source IDs are proposal-local and are not shared-ledger additions.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S01` | OQLF, GDT, [grand tambour](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199003/grand-tambour), updated 2011. | Edible-fish entry pairs preferred Québec `grand tambour`, English `black drum`, and *Pogonias cromis*. Says the species has commercial potential in Québec; this does not establish current retail supply. Identifies `tambour`, `grondeur noir`, and `courbine` as terms not retained by the fish-products terminology committee. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S02` | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Black%20Drum), last modified 2023-09-18. | Lists TSN 169288, *P. cromis*, `Black Drum / Grand Tambour`, family Sciaenidae. Canadian fish-labelling name evidence, not a store listing. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S03` | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Says the guidance applies to commercial fish prepared/imported in Canada and that the Fish List supplies English/French names for Canadian fish labelling. Does not prove that a specific product is currently stocked. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S04` | Translation Bureau, TERMIUM Plus, [OYSTER DRUM](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=1&i=&index=enr&lang=fra&sg_kp_wet=1589048&srchtxt=OYSTER+DRUM), record dated 2023-01-04. | Maps *P. cromis* to `black drum` as the trade name recommended by the fisheries terminology committee and DFO; also records `sea drum` and `oyster drum` in English and `grand tambour` as the normalized French commercial name. Alternate terms are not proposed as picker aliases. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S05` | DFO, [Poissons de la côte atlantique du Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/110180_P2.pdf), species entry for `Grand Tambour / Black drum`. | Reports a 1947 capture in a Nova Scotia Fundy weir and identifies *P. cromis*. Historical occurrence only; no current fishery, sales, or culinary measure is inferred. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S06` | Servicio Nacional de Pesca y Acuicultura (Chile), [2026 Canasta de Productos](https://www.sernapesca.cl/app/uploads/2026/03/canasta_usuarios_ingles_v20260312.pdf), black drum rows. | Lists species-matched frozen raw IQF skinless/boneless fillet, skinless fillet with bones, and whole product with skin/bones/scales. Product-classification evidence, not Canadian inventory or home-measure evidence. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S07` | Health Canada, [Canadian Nutrient File search portal](https://food-nutrition.canada.ca/cnf-fce/newSearch). | Searched for the common and scientific names. The reviewed search did not surface a species-matched serving record; this is not proof that no analysis exists. |
| `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S08` | Health Canada, [Nutrient Value of Some Common Foods, fish and shellfish table](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html). | The current page lists common fish measures but no black-drum row. Do not transfer another species’ measure. |

No app tests or emulator checks were run because the integration only adds database JSON data and documentation.
