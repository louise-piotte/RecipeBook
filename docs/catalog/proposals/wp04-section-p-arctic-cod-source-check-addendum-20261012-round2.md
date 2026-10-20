# WP04 Section P — Arctic cod source-check addendum

- **Review date:** 2026-10-12.
- **Related proposal:** [WP04 Section P Arctic cod identity review](wp04-section-p-next-open-seafood-gap-review-20261012-round2.md).
- **Scope:** Independent online check of the proposal's identity/name sources and a fresh exact-key ownership check against the active ingredient package and research ledger.
- **Outcome:** The bounded *Boreogadus saida* identity and the display pair **Arctic cod / morue polaire** remain supported. The no-alias proposal is conservative and defensible, with one explicit tradeoff: CFIA also accepts **Polar Cod** as an English name for this taxon, so omitting it makes that Canadian label wording unavailable as a picker query. The Canadian Nutrient File negative lookup could not be independently reproduced and should remain weak, non-exclusionary evidence.
- **Scope of edits:** This addendum only. No catalog JSON, seed data, ledger, checklist, roadmap, recipe, or application code was changed. No tests or emulator checks were run.

## Source-check findings

| Addendum source ID | Online source | Independently checked finding |
|---|---|---|
| `WP04-P-ARCTIC-COD-SOURCE-CHECK-20261012-R2-S01` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | CFIA describes the list as identifying English and French common names acceptable for Canadian fish labelling. The current list shows TSN 164706, *Boreogadus saida*, as **Arctic Cod / Morue Polaire**, and also has an English-only **Polar Cod** row for the same TSN. The list result displays a 2023-09-18 modification date. This confirms both the proposed display pair and the accepted-name tradeoff; it does not establish current Québec retail availability. |
| `WP04-P-ARCTIC-COD-SOURCE-CHECK-20261012-R2-S02` | OQLF, [morue polaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199114/morue-polaire) | The edible-fish entry names *B. saida*, gives **morue polaire** as the preferred term, and gives **Arctic cod** and **polar cod** as English translations. It says **saïda** and **saïda franc** were not retained by the fish-product terminology committee. The entry was last updated in 2011. |
| `WP04-P-ARCTIC-COD-SOURCE-CHECK-20261012-R2-S03` | DFO, [Arctic Cod](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-cod-morue-polaire-eng.html) and [Morue polaire](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-cod-morue-polaire-fra.html) | The English and French species profiles both identify *B. saida*. They describe Canadian range from the Beaufort Sea to the Grand Banks, occasional Gulf of St. Lawrence occurrence, and approximate biological body length of 30 cm. These are species and biology details, not retail, serving, or kitchen-measure evidence. |
| `WP04-P-ARCTIC-COD-SOURCE-CHECK-20261012-R2-S04` | Coad and Reist, DFO, [Annotated List of the Arctic Marine Fishes of Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/278854.pdf) (2004), pp. 38–39 | The report separately lists *Arctogadus glacialis* as **Polar Cod / Saïda imberbe** and *B. saida* as **Arctic Cod / Saïda franc**. It lists *B. saida* in Québec and describes limited commercial and local food use. It reports 40 cm for *B. saida*, whereas the current DFO profile says about 30 cm; both are biological length observations, not culinary measures. |
| `WP04-P-ARCTIC-COD-SOURCE-CHECK-20261012-R2-S05` | ITIS, [*Boreogadus saida*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=164706) and [*Arctogadus glacialis*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=164704) | The records report both taxa as valid and list **Arctic cod** and **polar cod** as common English names for each. That overlap supports excluding either term as a globally unambiguous alias. The *A. glacialis* record was visible in indexed ITIS results during this check; direct page retrieval was intermittent. |
| `WP04-P-ARCTIC-COD-SOURCE-CHECK-20261012-R2-S06` | Health Canada, [Canadian Nutrient File search](https://food-nutrition.canada.ca/cnf-fce/newSearch) | The page identifies itself as information on the 2015 CNF publication and says that publication will not be updated while Health Canada works toward a more user-friendly way to access the CNF 2026 dataset. Its search controls are dynamically rendered; this source check could not reproduce the proposal's no-match result for *B. saida* or Arctic cod. Keep the earlier lookup only as a limited report of what that review surfaced, not as verified proof that a species-matched food or serving entry is absent. |

These IDs are local to this addendum and are not research-ledger records.

## Name boundary and recommendation

The evidence supports **Arctic cod / morue polaire** as a Canadian and Québec food-name pair for *B. saida*. The 2004 DFO checklist and ITIS also show why the English common names need a boundary: they overlap with *A. glacialis*. CFIA's additional **Polar Cod** row for *B. saida* does not remove that cross-taxon ambiguity in other naming systems.

The proposal's no-alias shape is therefore reasonable if the picker must not silently assign a taxon to an unqualified term. Record that this intentionally omits a CFIA-accepted Canadian English name. If product-scope lookup of **Polar Cod** is required later, resolve that with an explicit market or taxon disambiguation mechanism before adding a global alias. Do not add **saïda**, **saïda franc**, or the binomial as picker aliases: OQLF's Québec terminology boundary and the scientific-name role in the packet do not establish them as preferred Québec consumer terms.

The reviewed sources support no product form, density, serving amount, unit mapping, yield, or substitution. Keep those fields empty/null unless positive, food-specific evidence is found. The CNF lookup limitation does not change that conclusion because the addendum found no positive kitchen-measure evidence.

## Current active ownership check

The live package checked on 2026-10-12 contains **1,301 active references, 98 forms, 64 legacy candidates, 1,609 research-ledger records, and 8 unit conversions**. A fresh exact normalized-key pass covered reference IDs, names, and aliases; form IDs, labels, and match terms; legacy IDs, names, and aliases; and strings in ledger records and conversion records. It normalized case, accents, Unicode compatibility forms, and punctuation/spacing.

No exact normalized owner was found for:

- `ingredient-ref-arctic-cod` or `candidate-arctic-cod`;
- **Arctic cod**, **morue polaire**, or *Boreogadus saida*;
- **polar cod**, **saïda**, or **saïda franc**; or
- the proposal-local source-ID prefix `WP04-P-ARCTIC-COD-IDENTITY-20261012-R2`.

Related but distinct active references remain present: Atlantic cod / morue de l’Atlantique, Pacific cod / morue du Pacifique, sablefish / morue charbonnière, salt cod / morue salée, and Atlantic tomcod / poulamon. The exact-key result does not imply that broad words such as `cod` or `morue` are absent from those existing names. Recheck ownership immediately before any later integration because the shared package is actively changing.

The recipe corpus and picker projection from the linked proposal were not rerun as part of this source-and-ownership addendum.
