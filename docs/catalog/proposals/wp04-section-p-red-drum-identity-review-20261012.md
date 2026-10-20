# WP04 Section P — red drum / tambour rouge identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only review of one species-scoped finfish identity, Québec terminology, exact-key ownership, and recipe demand.
- **Disposition:** Recommend an identity-only `PROTEIN` reference for red drum / tambour rouge (*Sciaenops ocellatus*), with no aliases. Keep redfish, other drum species, and other bass-named fish distinct.
- **Worktree scope:** This proposal file only. No canonical catalog, ledger, plan, roadmap, generated file, recipe, or test was changed. No tests or emulator checks were run.

## Recommendation

| Candidate ID | Category | English display | fr-CA display | Aliases | Taxon |
|---|---|---|---|---|---|
| `ingredient-ref-red-drum` | `PROTEIN` | **red drum** | **tambour rouge** | None | *Sciaenops ocellatus* |

The CFIA Fish List pairs **Red Drum / Tambour rouge** with *Sciaenops ocellatus*. The OQLF Grand dictionnaire terminologique independently identifies *S. ocellatus* in its edible-fish domain and gives **tambour rouge** as a preferred Québec French term. A current Vaughan seafood supplier catalogue lists **Red Drum** under the same scientific name as a farmed seafood product offered whole or as fillets. Together these sources support a bounded species identity and Canadian seafood-market relevance. They do not establish Québec retail stock, current on-hand inventory, wild harvest status, or general product forms.

Keep the alias lists empty. In particular, do not add `redfish`, which currently points to a different Québec *Sebastes* market group; do not add bare `drum` or `tambour`; and do not add source-listed alternatives such as `channel bass`. Do not infer a species from another product merely called redfish, drum, or bass.

This recommendation identifies the fish only. It adds no form, measure, density, unit mapping, conversion, yield, recipe link, or substitution.

## Section P audit and previous allocation

The Section P finfish parent checklist remains open for broad and regional-fish coverage. Its current freshwater-drum entry explicitly says to keep **Red Drum** distinct from freshwater drum / malachigan; that is a separation note, not an allocation of the red-drum identity.

The complete exact-name scan of Section P proposals and batch records found red drum / tambour rouge / *Sciaenops ocellatus* only in the [freshwater-drum boundary proposal](wp04-section-p-freshwater-drum-malachigan-identity-boundary-review-20261012.md) and its [integration README](../batches/wp04-section-p-freshwater-drum-malachigan-identity-integration-20261012/README.md). Those records explicitly exclude it from the freshwater-drum scope. No dedicated red-drum proposal, active integration, or hold was found. The [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt) has the same two boundary mentions and no separate red-drum item. This review therefore treats red drum as an unallocated species gap, rather than reopening one of the already integrated or held candidates.

At the audit snapshot, the live package held 1,293 ingredient references and 98 forms; the legacy import file held 64 candidates; the research ledger held 1,601 records. Exact-name searches across those references, forms, legacy candidates, and ledger ownership found no active or legacy owner for **red drum**, **tambour rouge**, or *Sciaenops ocellatus*. The only ledger text hit is the existing `ingredient-ref-freshwater-drum` record, where CFIA evidence and the decision note identify Red Drum as a different species. It is not a red-drum candidate record.

## Exact-key ownership and picker boundary

The current picker normalizes accents and punctuation and gives complete normalized word-phrase matches priority. It matches query words within displayed names even when those words are not stored as aliases ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The ownership audit included active bilingual display names and aliases, attached form names and match terms, legacy names and aliases, and ledger record IDs/identity ownership.

| Phrase or key | Current owner / result | Effect of this proposal |
|---|---|---|
| `freshwater drum` / `malachigan` / *Aplodinotus grunniens* | Active `ingredient-ref-freshwater-drum`; no aliases. | Remains unchanged and distinct from *S. ocellatus*. |
| `redfish` | Active `ingredient-ref-quebec-redfish` — Québec redfish / sébaste du Québec, a local *Sebastes* market group. | Remains with that row; `redfish` is not an alias for red drum. |
| `red drum` / `tambour rouge` | No current exact owner. | Each phrase would identify the proposed row. |
| *Sciaenops ocellatus* | No current reference, form, legacy, or ledger identity owner. | Not proposed as an alias; the taxon remains evidence for the row’s scope. |
| `drum` | Current phrase search returns `ingredient-ref-freshwater-drum`. | Would return both the freshwater-drum and red-drum rows. This gives the broad English query two species choices instead of narrowing it to one. |
| `tambour` | No current exact owner. | Because the displayed French phrase contains this word, a bare `tambour` query would return the proposed red-drum row. OQLF’s supported product term is species-qualified (`tambour rouge` or `tambour ocellé`); do not store bare `tambour` as an alias. Reassess if a separate generic French drum identity is later proposed. |
| `channel bass` / `redfish` | No red-drum owner; `redfish` currently belongs to the Québec *Sebastes* group. | Neither source-listed term is proposed as an alias. This also keeps bass-named fish and Québec redfish scope separate. |

The exact source label pair is sufficiently distinct for an identity-only row. The existing one-word `drum` search becomes explicitly multi-result, while the generic Québec redfish result remains separate. The remaining `tambour` partial-query behavior is disclosed above and does not establish a generic food identity.

## Canadian and Québec naming / product scope

- **Canadian fish-label nomenclature:** CFIA’s Fish List assigns *Sciaenops ocellatus* the bilingual common names **Red Drum / Tambour rouge**. CFIA describes this list as the English and French common names acceptable in Canada for fish labelling, alongside scientific names used to identify imported fish species. The Fish List is nomenclature evidence; it is not a retail-stock feed, harvest authorization, food-safety finding, or culinary equivalence standard. The lookup record was modified 2023-09-18.
- **Québec French:** OQLF’s GDT entry is in both ichthyology and **alimentation — poisson comestible**. It identifies *Sciaenops ocellatus* and gives **tambour rouge** and **tambour ocellé** as preferred French terms; its English terminology includes **red drum** and other alternatives. Use the CFIA-matched `tambour rouge` display. The entry’s last-update date is 2004, so it supports the Québec terminology boundary, not a claim of recent Québec retail adoption.
- **Current Canadian supplier listing:** Seacore Seafood, a Canadian supplier at Vaughan, Ontario, currently lists **Red Drum** as *Sciaenops ocellatus* and describes its catalogue item as a farm-raised product of Texas, available as whole fish or fillet. This supports a current Canadian seafood-supplier listing for the food fish. The page does not show stock by location, Québec delivery, or a French product label; those claims are not made here. The supplier’s origin and presentations apply to its listing only.
- **Food versus other uses:** The reviewed Canadian listing is in a seafood supplier’s salt-water-fish product catalogue, while OQLF explicitly classifies the term as edible fish. No bait, aquarium, pet, or feed listing was used to support the proposed food identity.

Do not infer that the fish is harvested in Québec or Canada, that the supplier’s farm origin or presentations are universal, or that the listing guarantees a consumer can buy it at a particular time or location. Do not add `redfish` or related market words to the candidate: redfish is not a species-resolving label here and is already used by the Québec redfish group.

## Bundled recipe demand and numeric limits

The full manifest-ordered bundle was scanned: **114 recipe files and 1,123 ingredient rows**. Normalized phrase searches covered `red drum`, `tambour rouge`, `tambour ocellé`, *Sciaenops ocellatus*, `channel bass`, `redfish`, and `spottail sea bass`, in every ingredient row and in all recipe-object text. There were **zero matching ingredient rows and zero matching recipe files**. No recipe link or relink is supported.

The supplier page’s product presentations are not recipe measures. The sources establish no household amount, serving weight, density, count-to-weight relation, edible yield, cooking yield, or conversion. No source supports replacing freshwater drum, Québec redfish, bass, or any other finfish with red drum. Add no global or contextual substitution, safety equivalence, or preparation rule.

## Sources

All sources were accessed 2026-10-12. Source IDs are proposal-local and were not added to the shared research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-RED-DRUM-20261012-S01** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | The result row for *Sciaenops ocellatus* gives **Red Drum / Tambour rouge**. CFIA says the Fish List supplies acceptable Canadian English/French common names for fish labelling and species names; the lookup data is dated 2023-09-18. Nomenclature only, not inventory or permission to harvest/sell a particular fish. |
| **WP04-P-RED-DRUM-20261012-S02** | Office québécois de la langue française, [GDT — tambour rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358055/tambour-rouge) | Places the term in ichthyology and edible-fish domains, identifies *S. ocellatus*, and lists `tambour rouge` / `tambour ocellé` as preferred French terms and `red drum` among English terms. Last updated 2004; terminology evidence only. |
| **WP04-P-RED-DRUM-20261012-S03** | Seacore Seafood, [Red Drum](https://www.seacoreseafood.com/product/red-drum) | Current Canadian supplier catalogue at Vaughan, Ontario, identifies *S. ocellatus* and lists a farm-raised Texas product as whole or fillet. Product listing only; no confirmed local inventory, Québec delivery, French label, general forms, or recipe amount. |

## Review result

The Section P evidence supports one distinct species-scoped row, **red drum / tambour rouge** (*Sciaenops ocellatus*), with no aliases. The row remains separate from freshwater drum / malachigan and Québec redfish / sébaste du Québec. No recipe demand, form, measurement, conversion, yield, or substitution is supported.
