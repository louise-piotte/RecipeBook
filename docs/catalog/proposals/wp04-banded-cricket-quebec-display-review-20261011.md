# WP04 proposal — Québec French display review for banded cricket powder — 2026-10-11

**Scope:** independent review of the French display for the already-integrated human-food powder reference `ingredient-ref-banded-cricket-powder` (*Gryllodes sigillatus*). This is a proposal-only terminology review; it does not change the catalog, ledger, plan, or batch files.

## Recommendation

**Revise** the current French display from `poudre de grillon domestique des tropiques` to **`poudre de grillon à bandes`**. Keep the English display `banded cricket powder`, the `PROTEIN` category, and the current empty alias arrays.

`Poudre de grillon à bandes` is an editorial combination, not a phrase quoted as a whole from a source: Health Canada and a Canadian manufacturer use the product wording *poudre de grillon* for *Gryllodes sigillatus*, while Québec’s edible-insect industry report identifies that species as *grillon à bandes* and marks that species term as preferred by the Québec edible-insect sector. The wording therefore preserves the product state and uses the locally preferred species qualifier. The report is sector terminology evidence, not an OQLF ruling or proof that this exact compound appears on a retail package.

The evidence supports a concrete Québec-oriented display, so I do not recommend holding the row. The proposed display does not eliminate the shared generic search phrase `poudre de grillon`; keep generic cricket aliases out.

## Evidence, separated from interpretation

| Direct source fact | Interpretation for this catalog display | Limit |
|---|---|---|
| The Table Filière des Insectes comestibles’ 2022 Québec industry profile glossary maps `Grillon à bandes (ou grillon domestique tropical)` to *Gryllodes sigillatus*. A footnote says the term marked with superscript 1 was selected as the preferred term by Québec’s edible-insect sector through a May–July 2022 survey. | Use `grillon à bandes` as the Québec species qualifier. It is better supported locally than carrying over `grillon domestique des tropiques` from Health Canada’s other product entries. | The survey is sector-based and dated 2022; the document does not claim an OQLF recommendation or a representative consumer-language study. It gives a species name, not the full powder display. |
| Health Canada’s French non-novel list has a 2017-04-18 entry named `Poudre de grillon (Gryllodes sigillatus)`, described as powder made from whole cricket. Separate entries use `Farine de grillon domestique des tropiques`, `Grillon domestique des tropiques moulus`, and `Grillon domestique des tropiques grillés`. | Health Canada directly supports `poudre de grillon` as the product-state phrase for this species. Its different `grillon domestique des tropiques` wording belongs to separate listed flour, ground, and roasted product descriptions; it is not the wording of the powder entry. | These are product-specific novelty determinations, not common-name approval, label approval, or a language authority’s terminology ruling. The list says the determinations concern novelty only, were not food-use safety assessments, and remain subject to other food requirements. |
| The OQLF’s 2025 GDT entry for `grillon domestique` identifies *Acheta domesticus* (and lists `grillon comestible` as another preferred term for that entry); it notes that this species can be powdered for consumption. | Do not transfer the OQLF’s `grillon domestique` label to *G. sigillatus*. This reinforces choosing the Québec sector’s distinct `grillon à bandes` qualifier over a display built around `grillon domestique`. | The reviewed OQLF entry is for *A. domesticus*. No OQLF GDT entry for *G. sigillatus* was located in this review; that scoped search result is not proof that no OQLF material exists elsewhere. |
| Entomo Farms’ current French FAQ calls its *G. sigillatus* product `poudre de grillon`, says whole crickets are roasted then ground, and gives product-specific serving information. Its English product page likewise identifies *G. sigillatus* and describes roasting and grinding whole crickets. | The species-plus-product construction corresponds to a current Canadian human-food powder product and established French product wording. | This is manufacturer wording and a supplier-specific product description, not a regulatory common-name decision or proof of an exact bilingual package label. |

## Current repository and collision context

- The current active reference is `ingredient-ref-banded-cricket-powder`, category `PROTEIN`, displayed as `banded cricket powder` / `poudre de grillon domestique des tropiques`. Both alias arrays are empty; density is `null`; unit mappings are empty.
- The other active cricket powder reference is `ingredient-ref-house-cricket-powder`, displayed as `house cricket powder` / `poudre de grillon domestique`; its alias arrays are also empty. The proposed full French display `poudre de grillon à bandes` is distinct from that row and from the current active full display strings.
- Search is phrase-based and allows partial term matches in `IngredientSearch.kt`. The current displays share both `poudre de grillon` and `grillon domestique`, so those queries can return both references. Under the proposed name, `grillon à bandes` becomes a distinctive query for the banded-cricket row, but `poudre de grillon` remains a shared phrase. Do not add `poudre de grillon`, `grillon domestique`, or unqualified English `cricket powder` aliases; each is ambiguous across the two species. Keep the alias arrays empty unless later recipe or product evidence supports a more specific powder synonym.
- A read-only scan of `ingredient-forms.v1.json`, substitution rules, contextual substitution rules, package yields, and `legacy-import-identities.v1.json` found no cricket-specific form, conversion, substitution, yield, or legacy-import candidate. The 76 legacy candidates contain no cricket-, *Gryllodes*-, or *Acheta*-named candidate.
- A fresh scan of all **114** manifest-listed recipe files counted **1,123 ingredient rows** and found **zero** cricket-, grillon-, insect-, *Gryllodes*-, or *Acheta*-related matches. The corpus therefore gives no recipe demand that would resolve generic cricket wording or support a recipe link.
- The research ledger contains one manufacturer-specific observation for this product: approximately **1 level tbsp / 10 g**. That remains a product-specific observation, not a generic tablespoon weight, density, or unit conversion. This display review adds no measure, density, form, conversion, yield, or substitution rule; the listed terminology sources do not support any of those behaviors.
- WP04 Section Q’s integrated banded-cricket item is checked, while its nested request for an independent Québec French display review remains open. The prior identity-boundary proposal explicitly treated the current French wording as provisional and left it open to this review.

## Display decision

| Field | Recommendation |
|---|---|
| English display | Retain `banded cricket powder` |
| French display | Revise to `poudre de grillon à bandes` |
| Exact existing full-key collision | None found for the proposed full French display |
| Partial-query collision | `poudre de grillon` remains shared with house-cricket powder search |
| Aliases | Keep empty; do not add generic cricket or powder terms |
| Category / behavior | Keep `PROTEIN`; identity-only, with no new forms or measurement/conversion behavior |

## Source register

All web sources below were accessed 2026-10-11.

| Source | Direct evidence used | Scope limit |
|---|---|---|
| Table Filière des Insectes comestibles (TFIC), [*Portrait de l’industrie des insectes comestibles du Québec en 2022*](https://www.agrireseau.net/documents/Document_110246.pdf), glossary, p. 10 | Maps *G. sigillatus* to `grillon à bandes` (or `grillon domestique tropical`); the footnote says `grillon à bandes` was the preferred term selected by the Québec edible-insect sector survey in May–July 2022. The report identifies the TFIC as its author and lists Québec agriculture ministry participation in review. | Québec industry terminology evidence, not OQLF standardization or retail label approval; survey is from 2022. |
| Health Canada, [French list of non-novel determinations](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html); English counterpart, [List of non-novel determinations](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html) | The 2017-04-18 *G. sigillatus* powder entry is `Poudre de grillon (Gryllodes sigillatus)` and describes powder made from whole crickets. Other *G. sigillatus* entries separately describe banded-cricket flour, ground crickets, and roasted whole crickets. | A novelty list, not a terminology authority, product endorsement, safety assessment, or general approval for other processes or uses. |
| Office québécois de la langue française, [GDT: grillon domestique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26579641/grillon-domestique), updated 2025 | Pairs `grillon domestique` and `grillon comestible` with *Acheta domesticus*; notes the species may be powdered for consumption. | Supports the house-cricket distinction only, not a name for *G. sigillatus*. |
| Entomo Farms, [FAQ poudre de grillon](https://entomofarms.com/fr/questions-frequentes/) and [Cricket powder](https://entomofarms.com/cricket-powder/) | Current manufacturer pages use `poudre de grillon`, identify *G. sigillatus*, and describe powder from whole roasted and ground crickets. | Product-specific manufacturer wording/process; not an OQLF term, universal composition/measure, or approved common label. |

## Verification note

Proposal only. No catalog, ledger, plan, roadmap, recipe, test, or code file was changed. No tests were run.
