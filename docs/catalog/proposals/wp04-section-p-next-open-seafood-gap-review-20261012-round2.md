# WP04 Section P — Arctic cod / morue polaire identity review

- **Review and source-access date:** 2026-10-12.
- **Status:** Integrated on 2026-10-12. See [integration README](../batches/wp04-section-p-arctic-cod-identity-integration-20261012/README.md).
- **Packet type:** Review and integration record for one northern finfish identity, Québec naming, species-name boundaries, picker behavior, recipe demand, and available measure/substitution evidence.
- **Decision:** Add identity-only `PROTEIN` reference Arctic cod / morue polaire (*Boreogadus saida*), with no aliases. Both English common names **Arctic cod** and **polar cod** have broader scientific use for a second cod species, so use the row only for the CFIA/OQLF Canadian fish-name scope and do not infer a species from unqualified wording in another market.
- **Integration scope:** Added one reference and one research-ledger record; no forms, recipe links, density, unit mappings, measures, conversions, yields, or active substitution rules changed. Static package, generated-index, ledger, ownership, corpus, encoding, and whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Candidate and identity boundary

The open Section P checklist includes cod and regional fish. The Québec GDT directly pairs edible-fish **morue polaire** with **Arctic cod** and *Boreogadus saida*. CFIA's Fish List and DFO's English and French species profiles corroborate that same Canadian food-name pair and taxon. DFO's Arctic-fish checklist records the species in Québec and describes limited commercial and local food use. This supports a bounded identity review; it does not establish a current Québec retail product or a recipe use.

| Candidate ID | Category | English display | fr-CA display | Aliases | Taxon |
|---|---|---|---|---|---|
| **ingredient-ref-arctic-cod** | `PROTEIN` | **Arctic cod** | **morue polaire** | None | *Boreogadus saida* |

The integrated row is identity-only. Keep it distinct from Atlantic cod (*Gadus morhua*), Pacific cod (*G. macrocephalus*), Greenland cod / ogac (*G. ogac*), and Polar cod / saïda imberbe (*Arctogadus glacialis*).

### Alias boundary

- Add no aliases. **Polar cod** is a particularly unsafe alias: OQLF and CFIA also list it for *B. saida*, but Fisheries and Oceans Canada's Arctic-fish checklist and ITIS assign Polar cod to the separate *A. glacialis*. ITIS also includes Arctic cod among *A. glacialis* common names, even though CFIA and OQLF pair the Canadian food name Arctic cod / morue polaire with *B. saida*. Retain the CFIA/OQLF food-label scope; do not use either common-name overlap to identify an unqualified product from another market.
- Do not add **cod**, **morue**, **saïda**, **saïda franc**, or *Boreogadus saida* as aliases. OQLF explicitly says saïda and saïda franc were not retained for Québec fish-product marketing. The species name remains a verification field in this proposal, not a picker term.
- Keep the active Atlantic cod, Pacific cod, sablefish, and salt-cod references separate. The word `cod` in a display or `black cod` alias does not make these the same species or a substitution chain.

## Current ownership and picker projection

The initial snapshot contained 1,301 active references, 98 forms, 64 legacy candidates, 1,609 ledger records, and 8 unit conversions. Immediately before integration, the live package had 1,303 references, 98 forms, 64 legacy candidates, and 1,611 ledger records. Fresh exact normalized-key checks found no prior owner for `ingredient-ref-arctic-cod`, `candidate-arctic-cod`, **Arctic cod**, **morue polaire**, *Boreogadus saida*, **polar cod**, **saïda**, or **saïda franc** in active reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, or ledger record IDs and text. The proposal-local source-ID prefix `WP04-P-ARCTIC-COD-IDENTITY-20261012-R2` was also unused. These are exact-owner findings; broader search phrases still match words inside existing display names.

The static projection mirrors normalized complete-phrase-first matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms. The integrated display-only row adds the following picker results:

| Query | Before integration | With integrated row | Interpretation |
|---|---|---|---|
| `Arctic cod` | None | Arctic cod / morue polaire | Exact proposed display; the row is uniquely selectable under the CFIA/OQLF Canadian food-name pairing. Do not use that result to assign *A. glacialis* from an unqualified foreign-market label. |
| `morue polaire` | None | Arctic cod / morue polaire | Exact Québec-preferred display and OQLF taxon. |
| `cod` | Atlantic cod; Pacific cod; sablefish; salt cod | Those four plus Arctic cod | Complete-word matches return several species and one preserved product; the new row does not suppress current choices. |
| `morue` | Atlantic cod; Pacific cod; sablefish; salt cod | Those four plus Arctic cod | The broad French query continues to show all matching rows. |
| `Arctic` | Arctic char | Arctic char; Arctic cod | The broader regional word returns two identities. |
| `polar cod` | None | None | Intentionally unsearchable as an alias because the term spans *B. saida* and *A. glacialis* in authoritative usage. |

This static code-and-data projection is not an app UI test. The picker indexes names and aliases, not the scientific name stored in the proposal.

## Bundled-recipe demand

All 114 recipe paths in `manifest.v1.json` and all 1,123 ingredient rows were scanned. Full recipe JSON text was checked for **Arctic cod**, **morue polaire**, *Boreogadus saida*, **polar cod**, **saïda**, and **saïda franc**; ingredient rows were additionally checked for broad **cod** and **morue** phrases.

**Result: zero candidate-term hits in recipe files, zero candidate-term ingredient rows, and zero broad cod/morue ingredient rows.** No recipe link, relink, amount, preparation state, measure, or recipe-scoped substitute is supported by the bundle.

## Forms, measurements, and substitutions

No product form, package size, density, unit mapping, count conversion, edible yield, or active measure is proposed.

- DFO's species profile describes Arctic cod as reaching about 30 cm; the 2004 DFO Arctic-fish checklist lists a size of 40 cm. These are biological body-size observations with different source wording, not fish portions, fillet masses, edible yields, or count-to-mass conversions.
- A targeted search of Health Canada's Canadian Nutrient File portal/index for **Arctic cod** and *Boreogadus saida* did not surface a species-matched food/serving entry. This negative result is limited to that search; it does not establish that no nutrient analysis exists elsewhere. The integrated row keeps `defaultDensity` null and `unitMappings` empty.
- No source reviewed gives a directed Arctic-cod-to-Atlantic-cod, Pacific-cod, pollock, or other-fish recipe substitution with method, amount, or adjustment. Similar family placement and the shared common word `cod` are not recipe-substitution evidence. Add no global or contextual substitution rule.

## Acceptance checks and unresolved gaps

The integration applies these boundaries:

1. Add only `ingredient-ref-arctic-cod` with the display pair **Arctic cod / morue polaire** and no aliases; keep density null and unit mappings/forms empty.
2. Preserve broad `cod` and `morue` results so they expose Arctic cod alongside Atlantic cod, Pacific cod, sablefish, and salt cod. Keep `polar cod`, `saïda`, and the scientific name out of picker aliases.
3. Treat *B. saida* as the identity only when the Canadian/OQLF fish-name scope or explicit taxon supports it. Do not map an unqualified `polar cod` or a source explicitly naming *A. glacialis* to this row.
4. Re-scan the full bundled recipe corpus before attaching any future recipe link, amount, form, measure, conversion, yield, or substitute.

Remaining gaps are current Québec retail/product availability, whether a bilingual consumer package uses the CFIA/OQLF pair, species-specific kitchen measurements, and any method- and quantity-backed substitute. The integrated identity is supported for Canadian/Québec food terminology, while the broader common-name overlap remains a boundary that the picker cannot encode by itself.

## Sources

Online sources were accessed on 2026-10-12. IDs below are proposal-local, not shared-ledger additions.

| Source ID | Source and date | Evidence and limits |
|---|---|---|
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S01** | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Arctic%20Cod) — Fish List modified 2023-09-18; searched Arctic Cod / *Boreogadus saida* | Lists *B. saida* as **Arctic Cod / Morue Polaire** and also lists English **Polar Cod** for that taxon. The retrieved list has no *A. glacialis* row. Canadian fish-label naming evidence, not current Québec retail availability or a recipe equivalence. |
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S02** | OQLF GDT, [morue polaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199114/morue-polaire) — last updated 2011 | In edible-fish terminology, pairs preferred Québec **morue polaire**, English **Arctic cod** / **polar cod**, and *B. saida*. Says the species has commercial potential in Québec. Excludes **saïda** and **saïda franc** from Québec fish-product marketing. Terminology evidence, not a current retailer/product source. |
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S03** | DFO, [Arctic Cod](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-cod-morue-polaire-eng.html) — modified 2016-12-19 | Gives *B. saida*, Canadian distribution from the Beaufort Sea to the Grand Banks, occasional Gulf of St. Lawrence occurrence, and biological size context. Not a recipe measure, retail listing, or substitution source. |
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S04** | Pêches et Océans Canada, [Morue polaire](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-cod-morue-polaire-fra.html) — modified 2016-12-19 | Confirms the French species heading **Morue polaire** and *B. saida*; gives the same habitat and biological-size context as S03. No kitchen measurement or product form. |
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S05** | B.W. Coad and J.D. Reist, DFO, [Annotated List of the Arctic Marine Fishes of Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/278854.pdf), Canadian Manuscript Report 2674 (2004), pp. 38–39 | Lists *A. glacialis* as **Polar Cod / Saïda imberbe** and *B. saida* as **Arctic Cod / Saïda franc**, records *B. saida* in Québec, and describes limited commercial and local food use. Its biological size entry is not a kitchen measure. |
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S06** | ITIS, [*Boreogadus saida*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=164706) — taxonomic report accessed 2026-10-12 | Reports *B. saida* as a valid species and lists common names **Arctic cod**, **polar cod**, and **saïda franc**. Taxonomy/common-name inventory; not Québec market authorization. |
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S07** | ITIS, [*Arctogadus glacialis*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=164704) — taxonomic report accessed 2026-10-12 | Reports a separate valid species and lists **polar cod** and **Arctic cod** as common names. This makes both terms poor global aliases despite the narrower CFIA/OQLF Canadian food-label pairing. |
| **WP04-P-ARCTIC-COD-IDENTITY-20261012-R2-S08** | Health Canada, [Canadian Nutrient File search](https://food-nutrition.canada.ca/cnf-fce/newSearch) — 2015 CNF page, modified 2019-03-01; targeted portal/index terms Arctic cod / *Boreogadus saida* | No species-matched food or serving page surfaced in the targeted search. This is limited negative lookup evidence and does not rule out all other composition research. |

The integrated package contains 1,304 active references and the ledger contains 1,612 records. No tests or emulator checks were run because the change only adds database JSON data under `AGENTS.md`.
