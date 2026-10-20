# WP03 Section U — chervil / cerfeuil identity proposal (R355, 2026-10-16)

- **Status:** Integrated in the bundled catalog on 2026-10-16.
- **Plan anchor:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” open common-herb checklist item `chervil`.
- **Candidate:** Culinary chervil, the leaves of *Anthriscus cerefolium* (L.) Hoffm.
- **Coordination:** This is the next still-open common-herb identity after the integrated R352 summer-savory review. The live references, forms, legacy candidates, research ledger, proposal archive, and batch READMEs contain no chervil identity or active source allocation. The ledger’s unrelated parsnip record mentions “chervil” only while explaining OQLF’s regional `grand chervis` wording; it explicitly keeps parsnip distinct from chervil. No overlapping chervil proposal was found.
- **Disposition:** Add one identity and one fresh form. Do not add aliases, measurements, density, unit mappings, conversions, recipe links, yields, or substitutions.

## Recommendation

Use **cerfeuil / chervil** for the culinary leafy herb *Anthriscus cerefolium* (L.) Hoffm. The OQLF’s Grand dictionnaire terminologique gives `cerfeuil` as the preferred French term, `chervil` in English, and *Anthriscus cerefolium* as the Latin equivalent. Kew currently accepts the full scientific name *Anthriscus cerefolium* (L.) Hoffm. A Metro Québec product listing uses `Cerfeuil frais` / `Fresh Chervil` for a 10 g fresh-herb product, and Metro’s Québec-facing culinary page describes its leaves and fresh use. [S01–S04]

| Field | Proposed value |
|---|---|
| Reference ID | `ingredient-ref-chervil` |
| Category | `HERB` |
| French display | `cerfeuil` |
| English display | `chervil` |
| Aliases | None |
| Identity boundary | Culinary leaves of *Anthriscus cerefolium* (L.) Hoffm. |
| Form | `ingredient-form-chervil-fresh`, code `fresh`, labels `cerfeuil frais` / `fresh chervil`; `prepState: fresh`; no density or match-term aliases |
| Other forms, measures, links, or numeric behavior | None |

The fresh form is supported as a marketed Québec grocery item and gives the picker a direct match for the exact bilingual product phrase. It records the fresh state only; it does not imply a dried-to-fresh conversion or a general substitution rule. Metro says chervil can replace parsley in some culinary uses, but that is a contextual use note, not identity equivalence. [S03–S04]

## Identity and product boundaries

| Term or product | Disposition | Evidence boundary |
|---|---|---|
| `cerfeuil` / `chervil`, *Anthriscus cerefolium* (L.) Hoffm. | Proposed identity | OQLF pairs the French and English terms with the species; Kew accepts the current botanical name. Culinary use focuses on leaves. [S01–S02, S04] |
| `cerfeuil frais` / `fresh chervil` | Fresh form labels, not aliases | Metro’s Québec online-grocery listing names the 10 g item “Cerfeuil frais” in its French listing and “Fresh Chervil” in English. It lists `Cerfeuil` / `Chervil` as the ingredient. Its page reported the item out of stock at review time, so this supports naming and product identity, not present inventory. [S03] |
| `cerfeuil des bois` / wild chervil / cow parsley, *Anthriscus sylvestris* | Keep distinct; do not add as aliases | Herbier du Québec assigns those names to *A. sylvestris*, a separate accepted species, and identifies it as an invasive exotic plant in Québec. [S05] |
| Bulbous-rooted chervil, *Chaerophyllum bulbosum* | Keep distinct; no root form or alias | Kew’s genus account identifies *C. bulbosum* as a separate species with turnip-like roots used as a vegetable. This is not the leafy *Anthriscus cerefolium* herb. [S06] |
| `French parsley` or a parsley alias | Omit | The OQLF and Québec retail wording already supply unambiguous bilingual labels. `parsley` is an active, separate ingredient identity; adding a term containing `parsley` would also make chervil appear for a parsley search. Metro’s statement that chervil may replace parsley does not make the ingredients identical. [S03–S04] |
| `fines herbes` | Do not alias | Metro describes chervil as one component of a French herb bouquet alongside parsley, tarragon, and chives. A mixture is not the chervil identity, and its composition is outside this proposal. [S04] |

## Ownership, picker, and corpus review

- **Ownership:** The Section U checklist names chervil as open. No active reference, form, legacy candidate, chervil-owned ledger record, proposal, batch, or WP06 source allocation was found. The existing parsnip ledger note is a boundary citation, not prior chervil research ownership.
- **Current catalog:** The live reference JSON contains no `chervil`, `cerfeuil`, or *Anthriscus cerefolium* row. `ingredient-ref-parsley` and `ingredient-ref-dried-parsley` remain separate rows; cilantro and dill also have their own identities. The existing `ingredient-ref-bois-dinde-leaves` is West Indian bay and does not overlap.
- **Picker behavior:** `IngredientReferenceSearchIndex` searches display names, aliases, and form labels after accent/punctuation normalization. It returns complete word-phrase matches first and falls back to substring matching only when no phrase matches. `cerfeuil` and `chervil` will match the proposed displays; `cerfeuil frais` and `fresh chervil` will match the fresh-form labels and provide a fresh-form hint. No alias is needed. Do not add `French parsley`: the `parsley` query would phrase-match that alias and return chervil alongside the active parsley rows. `fines herbes`, `cerfeuil des bois`, and `wild chervil` remain outside the proposed identity.
- **Bundled recipes:** The package currently contains 114 recipe files and 1,123 ingredient rows. No ingredient row contains `chervil`, `cerfeuil`, or the botanical name in its original text, ingredient name, reference ID, or form ID. The corpus has one `fines herbes` mention in a sauce description, not an ingredient line. Existing parsley mentions are not chervil demand. Therefore, add no recipe links, measures, conversions, or substitution behavior.

## Implementation notes

- Add a single `HERB` reference with ID `ingredient-ref-chervil`, displays `cerfeuil` / `chervil`, empty alias arrays, null density, and no unit mappings.
- Add a single fresh form with ID `ingredient-form-chervil-fresh`, linked to that reference, labels `cerfeuil frais` / `fresh chervil`, `formCode: fresh`, `prepState: fresh`, null density, and empty match-term arrays.
- Do not import `French parsley`, `cerfeuil des bois`, `wild chervil`, `cow parsley`, `fines herbes`, or root-chervil wording.
- Record the identity evidence in the research ledger if integrated. Measurement and substitution research may remain unresearched; this proposal establishes no measurement or substitution behavior.
- The proposal is archived as a record of the evidence and picker decisions. The integrated catalog change is summarized in the batch README below.

## Sources

Accessed 2026-10-16.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **S01** | Office québécois de la langue française, [GDT: cerfeuil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095314/cerfeuil) | Preferred French term `cerfeuil`; English `chervil`; Latin *Anthriscus cerefolium* Hoffmann; botanical description of the plant and its leaves. | Last updated 1982; establishes terminology and identity, not current market availability. |
| **S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Anthriscus cerefolium*](https://powo.science.kew.org/taxon/837913-1) | Accepts *Anthriscus cerefolium* (L.) Hoffm. as the current name. | Taxonomy source; not Québec culinary-market evidence. |
| **S03** | Metro, [Irrésistible Cerfeuil frais, 10 g](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/fines-herbes-fraiches/cerfeuil-frais/p/059749955799) | French listing uses `Cerfeuil frais`; English page uses `Fresh Chervil`; product is in the fresh-herbs aisle and lists chervil as the ingredient. | The English page showed the item out of stock; product listing does not establish botanical species or guarantee inventory. The French URL redirects to Metro’s English page in the web review. |
| **S04** | Metro, [Cerfeuil](https://www.metro.ca/produits-a-decouvrir/fruits-et-legumes/nos-fruits-legumes-et-fines-herbes/cerfeuil) | French-indexed Québec retailer page names the herb and describes its leaves, delicate anise note, fresh handling, recipe uses, and distinction from parsley by describing parsley as a possible substitute rather than the same identity. | The reviewed French URL redirected to Metro’s English page; the search-indexed French content was visible at access time. Culinary guidance, not a botanical authority or universal substitution rule. |
| **S05** | Herbier du Québec, [Anthrisque des bois](https://herbierduquebec.gouv.qc.ca/produit/anthrisque-des-bois/) | Assigns `cerfeuil des bois`, `wild chervil`, and `cow parsley` to *Anthriscus sylvestris*, separate from *A. cerefolium*. | Botanical boundary source; does not assess edible use. |
| **S06** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Chaerophyllum*, General information](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:30028190-2/general-information) | Distinguishes bulbous-rooted chervil, *Chaerophyllum bulbosum*, whose turnip-like root is eaten as a vegetable. | Does not provide a Québec French retail term. |

## Integration record

- Added `ingredient-ref-chervil` (`HERB`) with display names `cerfeuil` / `chervil`, no aliases, density, or unit mappings.
- Added `ingredient-form-chervil-fresh` with labels `cerfeuil frais` / `fresh chervil`, fresh state, no match-term aliases, density, measure, or conversion.
- Recorded separate identity and form evidence in `docs/catalog/research-ledger.v1.json`. The 10 g Metro package is naming and product evidence only, not a reusable amount.
- Added the completed chervil check under Section U. The broader herb checklist remains open.
- Static package, generated-index, ledger, picker-boundary, corpus, encoding, and whitespace checks are recorded in [the integration README](../batches/wp03-section-u-chervil-identity-integration-r355-20261016/README.md). No software tests were run because this change only adds database JSON data under `AGENTS.md`.
