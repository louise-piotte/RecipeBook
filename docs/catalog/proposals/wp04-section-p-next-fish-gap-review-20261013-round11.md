# WP04 Section P — black bullhead / barbotte noire identity review

- **Review date:** 2026-10-13
- **Recommendation:** Add one identity-only `PROTEIN` reference for **black bullhead / barbotte noire**, *Ameiurus melas*. Keep both alias arrays empty. Do not add a product form, recipe link, measure, density, unit mapping, conversion, yield, or substitution.
- **Proposal status:** Integrated by root in round eleven; the original review and integration record are preserved below.

## Candidate and ownership

The Section P finfish parent remains open. This is a distinct third species in the bullhead group after the integrated brown bullhead / `barbotte` (*A. nebulosus*) and yellow bullhead / `barbotte jaune` (*A. natalis*). The round-ten chain-pickerel review is a separate family and boundary. The checklist, proposal/batch archive, live references, forms, legacy candidates, and ledger contain no focused black-bullhead decision or allocation. Earlier brown- and yellow-bullhead records name black bullhead only as an adjacent taxon, not as an identity owner.

Before this proposal, the exact candidate reference ID, English name, qualified Québec French name, and current scientific name had no active reference, attached-form, legacy-candidate, or ledger identity owner. The exact key `barbotte` is already owned by brown bullhead; it must stay there. The shared names `bullhead` and `barbotte` are not proposed as aliases.

| Proposed field | Value |
|---|---|
| Reference ID | `ingredient-ref-black-bullhead` |
| Category | `PROTEIN` |
| English display | `black bullhead` |
| Québec French display | `barbotte noire` |
| Identity scope | *Ameiurus melas* (Rafinesque, 1820) only |
| English/French aliases | `[]` / `[]` |
| Default density / unit mappings | `null` / `[]` |
| Forms, measures, recipe links, conversions, yields | none |
| Active substitutions | none |

The current Gouvernement du Québec fishery-education page explicitly distinguishes `barbotte noire` (*A. melas*), `barbotte jaune` (*A. natalis*), and `barbotte brune` (*A. nebulosus*). Manitoba’s current fishery regulations identify black bullhead as *A. melas*. The federal Freshwater Fish Marketing Act schedule uses the older synonym *Ictalurus melas*; ITIS confirms it is a synonym of the valid name *A. melas*. The federal schedule also uses the unqualified synonym `bullhead` for both black and brown bullheads, so that word is not safe as an alias.

Québec’s OQLF food-fish entry for bare `barbotte` maps it to brown bullhead, *A. nebulosus*, and says `barbotte brune` was not retained for Québec fish-product labeling. Keep the existing brown-bullhead product identity intact. Use the explicitly qualified government term `barbotte noire` only as this row’s display. Do not add `barbotte`, `barbotte brune`, `black catfish`, `catfish`, `poisson-chat`, `poisson-chat noir`, `bullhead`, or either scientific-name spelling as aliases.

## Current and conditional picker projection

I audited the projection using the current `IngredientSearch.kt` behavior: normalized complete phrases are selected first, then substring fallback. Queries below include each reference’s English/French display and aliases plus attached form labels and match terms. The current three bullhead-related references have no attached forms, and the proposed row has none.

| Query | Current result(s) | If proposed row is integrated | Effect |
|---|---|---|---|
| `black bullhead` | none | black bullhead / barbotte noire | Qualified English search resolves to the candidate. |
| `barbotte noire` | none | black bullhead / barbotte noire | Qualified Québec French search resolves to the candidate. |
| `bullhead` | brown bullhead / barbotte; yellow bullhead / barbotte jaune | those two plus black bullhead / barbotte noire | Broad term offers three qualified species, not a singleton. |
| `barbotte` | brown bullhead / barbotte; yellow bullhead / barbotte jaune | those two plus black bullhead / barbotte noire | Local broad term offers all three qualified species. This does not reassign the existing bare food-fish identity. |
| `catfish` | brown bullhead / barbotte; channel catfish / barbue de rivière | unchanged | No bare `catfish` alias is introduced. |
| `poisson-chat` | none | none | No broad French catfish term is introduced. |
| `black` | 27 reference results | 28 reference results | Candidate adds one ordinary partial-search result; the broad query remains a multi-result search. |
| `noire` | 5 reference results | 6 reference results | Candidate adds one qualified French phrase result among existing results. |
| `Ameiurus melas`; `Ictalurus melas` | none | none | Scientific names remain evidence, not picker aliases. |

No current form hint is attached to the brown, yellow, or channel-catfish rows. The proposed row creates no form hint. The `black` and `noire` results remain reference-only results for this candidate; no fish state or preparation is inferred from their match.

## Canadian/Québec name, market, and product boundary

The Québec source proves a local **name and taxon pairing**, not that *A. melas* is currently caught, sold, or available to Québec consumers. The current Aliments du Québec page for `Barbotte` lists products from Lac Saint-Pierre, but OQLF’s food-fish entry scopes that unqualified product name to brown bullhead. That current listing does not identify black bullhead. Its brown-bullhead forms and the displayed bulk-format wording `4.54` stay with that specific listing; the unit is unspecified there and none of it transfers to *A. melas*.

The federal Freshwater Fish Marketing Act schedule (consolidated to 2026-09-21) lists Black bullhead (*Ictalurus melas*) separately from Brown bullhead and gives `bullhead` as a synonym for each. This is Canadian commercial-fish nomenclature, not a current Québec SKU or a general retail availability claim. The schedule’s genus is older than the current *Ameiurus* name. Manitoba’s current regulation provides the contemporary *A. melas* species pairing. The older DFO Canadian fishery report calls the species an occasional recreational and incidental commercial fish; its dates and scope make it historical fishery context only. Alberta’s current species page says black bullhead has been stocked for sport and human consumption, while also treating it as prohibited invasive fish in Alberta. That regional source does not establish Québec supply or a present consumer product.

CFIA’s Fish List is the Canadian common-name resource for fish labeling. The accessible English-name selector showed `Brown Bullhead`, `Yellow Bullhead`, and `Bullhead`, but not `Black Bullhead`; its direct legacy query-results endpoint was not accessible in this browser session. I therefore do not represent `black bullhead` or `barbotte noire` as a verified CFIA Fish List label. The Québec government term, Manitoba species listing, ITIS taxonomy, and federal freshwater-marketing nomenclature support the bounded catalog identity; current Québec retail availability remains unestablished.

## Measurement and substitution evidence

| Dimension | Finding | Catalog consequence |
|---|---|---|
| Identity | Government of Québec pairs the qualified French name with *A. melas*; current Manitoba regulation and ITIS support the species identity; the federal schedule preserves the commercial-name boundary under an older synonym. | Identity can be represented at species scope. |
| Market/product state | No current Québec consumer product located for black bullhead. The current `Barbotte` product page belongs to the brown-bullhead name. Federal fish-market naming and older incidental-catch evidence do not establish a current SKU. | Add no live, whole, dressed, skinned, fillet, frozen, or preserved form. Do not transfer brown-bullhead product observations. |
| Numeric evidence | No source reviewed supplies a black-bullhead serving, edible mass, fillet yield, package weight, density, count-to-mass, or kitchen conversion. Fishing rules, biological identification information, and historical fishery categories are not ingredient quantities. | `measurementState`: `researched_no_supported_value`; no measurement observation or active numeric behavior. |
| Substitution | No recipe or reviewed culinary source compares black bullhead with brown/yellow bullhead or channel catfish using a cooking method and quantity. Shared family, `bullhead` wording, and a commercial-fish category do not prove interchangeability. | `substitutionResearchState`: `researched_no_supported_substitute`; no substitution rule or recipe-line link. |

If integrated, a ledger record should use `recordId: ingredient-ref-black-bullhead`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Keep `measurementObservations` empty. If root records the negative substitution review, proposed finding ID `black-bullhead-no-supported-substitute-20261013-r11` is unallocated and collision-free at review time. No product/measurement/substitution status is inferred from scientific identity alone.

## Recipe demand

The manifest-listed recipe corpus contains **114 files and 1,123 ingredient rows**. I scanned every parsed recipe document string and each ingredient row, including original text, ingredient names, and reference links, using the current accent/punctuation-folded whole-phrase search behavior. The scan covered `black bullhead`, `barbotte noire`, *Ameiurus melas*, *Ictalurus melas*, `bullhead`, `barbotte`, brown and yellow bullhead names, `catfish`, `poisson-chat`, and the neighboring channel-catfish name.

**Result: zero matching recipe files and zero matching ingredient rows** for the candidate or these neighboring terms. The corpus supplies no reason to link a recipe, attach a product state, set a measure, or define a substitution. The manifest-ordered corpus digest, using each relative path, a NUL byte, exact file bytes, and another NUL byte, is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` (753,792 recipe-file bytes).

## Ownership and source-ID audit

Before this proposal, the live catalog had **1,342 references**, **98 forms**, and **64 legacy candidates**. Exact key and source-text checks found no `ingredient-ref-black-bullhead`, `black bullhead`, `barbotte noire`, *Ameiurus melas*, *Ictalurus melas*, or `candidate-black-bullhead` owner in active references/forms, legacy candidates, or a ledger identity record. No form is attached to the brown/yellow/channel bullhead references. Existing neighboring owners are:

- Brown bullhead / `barbotte`, with qualified aliases `brown catfish` / `barbotte brune`.
- Yellow bullhead / `barbotte jaune`, with empty alias arrays.
- Channel catfish / `barbue de rivière`.

The proposed reference ID and negative-substitution finding ID above were not present in the ledger. New source IDs `WP04-P-BLACK-BULLHEAD-20261013-R11-S01` through `S07` were checked against all current ledger source IDs and the proposal/batch archive; none collides. For source URLs already represented by existing ledger records, this packet reuses the existing IDs rather than minting duplicate registrations: `WP04-BROWN-BULLHEAD-20261012-S01` (OQLF `barbotte`), `WP04-FINFISH-GAPS-20261010-S11` (CFIA Fish List overview), and `WP04-BROWN-BULLHEAD-20261012-S05` (Aliments du Québec `Barbotte`). The CFIA selector page and all other new URLs had no exact URL registration in the current ledger. No source or finding record is written by this proposal.

## Baseline snapshot

Hashes and counts below describe the live state read during this review on 2026-10-13, after the integrated round-ten chain-pickerel hold and same-day catalog work. The catalog files remain untouched by this proposal.

| Artifact | Baseline | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,342 references | 430,224 | `1a66cb1c4ac57ffff1df85a058c94fe10d5d85385c3b2c12107326e712cc7d5f` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,653 records; 6,345 source entries; 5,326 unique source IDs | 6,312,486 | `4b85be2b024f00cc20bb2bafb80a8cbd549b70549cbe5107c41e03e2b71af0f0` |
| Bundled manifest | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,342 references | 588,540 | `35742dd9a9f5bb52b4eb45b1826fcf9633e58ffd4002ac97b95c1877a7ec0165` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 753,792 total file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Source register and limits

Sources were accessed 2026-10-13. Reused source IDs are marked as existing; new IDs are candidate-specific.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-P-BLACK-BULLHEAD-20261013-R11-S01` | Gouvernement du Québec / MFFP, [Pleins feux sur… la pêche à la barbotte](https://mffp.gouv.qc.ca/jeunesse/peche-barbotte/). Distinguishes `barbotte noire` (*A. melas*), `barbotte jaune` (*A. natalis*), and `barbotte brune` (*A. nebulosus*) in Québec freshwater-fishing education. | Name and species distinction only; not evidence of a current Québec consumer product, fishery volume, or edible measure. |
| `WP04-P-BLACK-BULLHEAD-20261013-R11-S02` | Government of Canada, [Manitoba Fishery Regulations, 1987, Schedule VI](https://laws-lois.justice.gc.ca/eng/regulations/SOR-87-509/page-10.html), current to 2026-07-21. Lists `Black bullhead / Ameiurus melas`. | Current regional regulatory species name; not a product presentation, portion, or province-wide market claim. |
| `WP04-P-BLACK-BULLHEAD-20261013-R11-S03` | Government of Canada, [Freshwater Fish Marketing Act, Schedule](https://laws-lois.justice.gc.ca/eng/acts/F-13/page-3.html) (current to 2026-09-21) and [bilingual Act PDF](https://laws-lois.justice.gc.ca/PDF/F-13.pdf). Lists Black bullhead (*Ictalurus melas*) with synonym `bullhead`; brown bullhead separately has the same synonym. | Canadian fish-market nomenclature under an older genus spelling; it is not a current retailer SKU. The duplicate broad synonym is not activated. |
| `WP04-P-BLACK-BULLHEAD-20261013-R11-S04` | Integrated Taxonomic Information System (ITIS), [*Ameiurus melas* report, TSN 164039](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=164039). Gives valid *A. melas* and synonym *Ictalurus melas*, with English `Black Bullhead` and French `barbotte noire`. | Taxonomic and common-name cross-reference; not Canadian retail evidence. |
| `WP04-BROWN-BULLHEAD-20261012-S01` (reused) | OQLF GDT, [barbotte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198876/barbotte). The edible-fish entry assigns bare Québec `barbotte` to *A. nebulosus* and says `barbotte brune` was not retained for product labeling. | Existing term ownership and Québec naming boundary for brown bullhead; it does not itself name black bullhead. |
| `WP04-FINFISH-GAPS-20261010-S11` (reused) | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). Describes the Fish List’s Canadian fish-labeling role. | Does not establish inventory. The direct legacy query-results endpoint did not load in the browser session. |
| `WP04-P-BLACK-BULLHEAD-20261013-R11-S07` | CFIA, [English Fish List name selector](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpsel.asp?lang=e). The accessible list included Brown Bullhead, Yellow Bullhead, and Bullhead; its page reports a 2023-09-18 modification date. | The selector is a labeling reference, not retail evidence; because the direct query endpoint was inaccessible and the menu is not freshly modified, absence of `Black Bullhead` is not treated as definitive. This review makes no CFIA-approved-name claim. |
| `WP04-P-BLACK-BULLHEAD-20261013-R11-S05` | Fisheries and Oceans Canada, [Morphological and Ecological Characteristics of Canadian Freshwater Fishes](https://publications.gc.ca/collections/collection_2007/dfo-mpo/Fs97-4-2554E.pdf), bullhead-catfish table. Reports an occasional recreational and incidental commercial fishery for black bullhead. | Historical fishery context from an older report, not evidence of current supply, Québec sale, a retail product, or food quantity. |
| `WP04-P-BLACK-BULLHEAD-20261013-R11-S06` | Government of Alberta, [Black bullhead](https://www.alberta.ca/black-bullhead). Notes the species was stocked for sport and human consumption and is now prohibited as an invasive species in Alberta. | Regional history and Alberta restriction only; does not establish current Québec or broader Canadian retail availability. |
| `WP04-BROWN-BULLHEAD-20261012-S05` (reused) | Aliments du Québec, [Barbotte — Simmer International](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/barbotte). Current Québec product page lists local barbotte presentations; OQLF scopes the name to brown bullhead. | Evidence for the existing brown-bullhead product only. The forms and unit-unspecified `4.54` format do not transfer to black bullhead. |

## Static verification

- Re-read the active WP04 Section P checklist, current roadmap checkpoint, `AGENTS.md`, and current fish proposals/batches before selecting this candidate.
- Audited exact ownership across 1,342 active references, 98 forms, 64 legacy candidates, and 1,653 ledger records; projected current and conditional queries with attached form terms.
- Scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows; candidate and neighboring bullhead phrases had zero file/row hits.
- Recomputed the file hashes and corpus digest in the baseline table; checked candidate source IDs and reused source URLs against the live ledger and archive.
- No catalog, ledger, checklist, roadmap, generated code, recipe, or application file was edited. This is a proposal-only review; no app, unit, instrumentation, emulator, or application tests were run.

## Root integration result (2026-10-13)

Added identity-only `ingredient-ref-black-bullhead` as **black bullhead / barbotte noire**, *Ameiurus melas*, in `PROTEIN`, with empty aliases, null density, and no unit mappings. Registered seven new sources and reused the three existing OQLF, CFIA overview, and Aliments du Québec sources. The ledger marks identity verified, measurement `researched_no_supported_value`, and substitution `researched_no_supported_substitute`, with no observations and one bounded no-supported-substitute finding. No form, recipe link, active rule, or Québec retail availability claim was added.
