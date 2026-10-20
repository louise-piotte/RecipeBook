# WP04 Section P — inconnu / inconnu species identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** species identity, Canadian label and regional market scope, picker behavior, ownership, recipe demand, and numeric/form boundary review.
- **Recommendation:** add an identity-only `PROTEIN` reference for *Stenodus leucichthys*, displayed as **Inconnu / inconnu**, with `coney` as the sole English alias. Keep the other TERMIUM alternatives `beloribitsa`, `sheefish`, `connie`, and `conny` out of the row; do not add `nelma` without Canadian source evidence tying it to this taxon. Do not add a recipe link, form, measurement, conversion, yield, or substitution.
- **Scope:** integrated as an identity-only reference and research-ledger record. No recipe, form, measure, conversion, yield, substitution rule, or application logic was added.

## Candidate and source boundary

Section P still has open regional finfish work. This pass selects inconnu, *Stenodus leucichthys*, a distinct northern freshwater species not allocated or held in the current plan, catalog, ledger, or prior WP04 proposals. It is separate from lake whitefish / grand corégone (*Coregonus clupeaformis*), Atlantic bonito, eulachon, Atlantic capelin, and American smelt.

| Candidate ID | Category | English display | fr-CA display | Aliases | Species |
|---|---|---|---|---|---|
| `ingredient-ref-inconnu` | `PROTEIN` | `inconnu` | `inconnu` | EN: `coney`; FR: none | *Stenodus leucichthys* |

The CFIA Fish List assigns *S. leucichthys* both `Coney / Inconnu` and English `Inconnu` entries. The Government of Canada Translation Bureau’s TERMIUM Plus entry gives **inconnu** as a correct English and French term and identifies it as the normalized commercial name recommended by the Office de la langue française and the commercial-fisheries terminology committee. Use that shared bilingual term as the display. Keep `coney` as the only alias because CFIA lists it for this species; do not import TERMIUM’s other English alternatives as catalog aliases. `Nelma` was not verified as a Canadian market term for this species in the sources consulted, so it is not included.

The market evidence is regional. Fisheries and Oceans Canada (DFO) documents inconnu in commercial, recreational, and subsistence fisheries in the Northwest Territories, Yukon, and northern British Columbia. Its current Arctic freshwater page says Great Slave Lake inconnu are incidental catch in the lake-whitefish and lake-trout commercial fishery; the Buffalo River stock is classified critical and some other stocks are extirpated. DFO’s 2026 Great Slave Lake commercial-fisher consultation included inconnu in its stock-assessment discussion. These sources support a bounded Canadian fish identity and fishery context, not broad Canadian retail availability, present supply, harvest permission, or a consumer product specification.

## Prior-work check and pre-integration ownership snapshot

The global catalog plan, Section P proposals and batches, pre-integration active references/forms, legacy candidates, and research ledger were checked. No dedicated inconnu identity proposal or hold was found. This is separate from the round5 eulachon hold and does not reopen any existing Section P decision.

The ownership audit used the key normalization in `IngredientSearch.kt` (lowercase, NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, normalize punctuation, then collapse spaces). Exact normalized ownership and picker phrase matching were checked separately.

| Live artifact | Count | Exact-byte SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,312 references | `c0245d768db432aed546e591e4a848daa0de8fe64d375ffe7d9aae8226a747d3` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,620 records | `3959016b78323b78542cac11d8018f0ee1aa90a13a25fd5125adc84363153da2` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The exact candidate keys `inconnu`, `coney`, *Stenodus leucichthys*, `ingredient-ref-inconnu`, and `candidate-inconnu` have no active-reference, form, legacy-name, or ledger-record owner. `sheefish`, `connie`, `conny`, `beloribitsa`, and `nelma` are also unowned. The exact key `whitefish` has no field owner, but the picker matches the word inside the active **lake whitefish** display. `poisson blanc` has no exact owner. Do not add either broad whitefish phrase as an alias: CFIA uses whitefish wording across more than one taxon, and the active lake-whitefish identity already appears for the English picker query.

## Pre-integration picker projection and alias decision

The projection follows the phrase-first behavior in `IngredientReferenceSearchIndex`: a complete normalized phrase match returns every matching display or alias before the substring fallback. No active form mentions inconnu or `coney`.

| Query | Picker before integration | With the integrated display and alias | Decision |
|---|---|---|---|
| `inconnu` | None | Inconnu / inconnu | Species-specific Canadian common name; source-backed display. |
| `coney` | None | Inconnu / inconnu | CFIA-listed English name for *S. leucichthys*; sole alias. |
| `whitefish` | Lake whitefish / grand corégone | Lake whitefish / grand corégone | Do not add this broad term to the candidate. |
| `poisson blanc` | None | None | Keep the broad French product wording unassigned. |
| `beloribitsa`, `sheefish`, `connie`, `conny` | None | None | TERMIUM alternatives are not added as general aliases. |
| `nelma` | None | None | No Canadian source consulted here ties it to this taxon as a market name. |
| *Stenodus leucichthys* | None | None | Keep the taxon as research evidence, not a picker term. |

`inconnu` is also an ordinary French word meaning “unknown”; the proposed identity uses it only in its established fish-naming sense. No bundled recipe contains this term, so this proposal does not assign an existing recipe phrase from context.

## Full bundled-recipe demand

The manifest-ordered corpus contains **114 recipe files and 1,123 ingredient rows**. I scanned every listed recipe file and ingredient row for `inconnu`, `coney`, the other candidate/alternative terms, the scientific name, and whitefish comparators. There were zero candidate-term hits in recipe rows and zero candidate-term hits in recipe-file text. The corpus digest, hashing each manifest path, a NUL byte, the exact file bytes, and a NUL byte, is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

The nearby fish demand remains distinct: recipe 077 row 10 asks for salmon fillets; recipe 111 row 1 asks for one tuna steak; recipes 093 row 6 and 095 row 5 ask for fish sauce, a condiment. Recipe 093 row 4 offers generic “cooked meat or seafood, to taste,” without selecting a species or amount. None supports an inconnu link, measurement, or substitution.

## Forms, measurements, and substitutions

No active form, measure, density, unit mapping, conversion, yield, recipe link, or substitution rule applies to this candidate. The live global and contextual substitution-rule files contain no rules. The ledger has no inconnu record and no candidate-keyed unit conversion.

DFO’s species profile reports biological lengths of 450–760 mm, with individuals reaching 1.1 m. Those are fish-size observations, not edible portions, fillet weights, package sizes, servings, counts, or kitchen conversions. The reviewed Canadian and Québec sources do not establish a current consumer product form or recipe quantity. The older Great Slave Lake map reproduced on DFO’s commercial-fishery page is explicitly effective for 2023–2024; it is not treated as a current product or catch specification. A targeted CNF lookup was not completed, so this review makes no claim about whether CNF contains a species-matched entry and proposes no CNF measure.

Do not infer a substitute from inconnu’s membership in Salmonidae, DFO’s description of its relationship to whitefish, or its incidental catch alongside lake whitefish and lake trout. No recipe source supplies a method- and quantity-backed substitute. Keep all numeric, form, and substitution data absent.

## Recommendation

Advance one species-scoped, identity-only **Inconnu / inconnu** reference for *Stenodus leucichthys*, using only the CFIA-listed `coney` English alias. Keep the row separate from broad whitefish, lake whitefish, lake trout, and all preserved or finished fish products. Do not claim general Canadian supply or infer a use for the unqualified recipe phrase “seafood.” Add no forms, measures, conversions, yields, recipe links, or substitutions. Section P remains open.

## Sources

Sources were checked on 2026-10-12. IDs below are proposal-local and were absent from the live ledger and existing WP04 proposal/batch files before this review.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-P-INCONNU-SCOPE-20261012-R6-S01` | CFIA, [Fish List search results for inconnu](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Inconnu) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | The result identifies *Stenodus leucichthys* and lists `Coney / Inconnu` plus English `Inconnu`. The Fish List is Canadian fish-labelling terminology, not a recipe-equivalence or retail-inventory source. The legacy query result was accessible through the official result/search output; direct opening of that legacy query endpoint is not supported by this browser client. |
| `WP04-P-INCONNU-SCOPE-20261012-R6-S02` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Fish List’s Canadian label-name role and species-linked scientific identifiers. It does not establish current supply or recipe use. |
| `WP04-P-INCONNU-SCOPE-20261012-R6-S03` | Government of Canada Translation Bureau, [TERMIUM Plus fish entry for *Stenodus leucichthys*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=CONNY) | Gives `inconnu` as a correct English and normalized French fish name, and identifies the term as commercially standardized by OLF and the commercial-fisheries terminology committee. It lists `beloribitsa`, `sheefish`, `connie`, `conny`, and `coney` as English alternatives; only `coney` is used as a source-backed catalog alias. The entry rendered in browser search output; direct opening was unavailable. |
| `WP04-P-INCONNU-SCOPE-20261012-R6-S04` | Fisheries and Oceans Canada, [Inconnu (*Stenodus leucichthys*) species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/inconnu-eng.html) | Current Canadian distribution and fishery context, including present Great Slave Lake catch, the fishery’s commercial/recreational/subsistence settings, stock status, and biological length observations. It is not a product label, household measure, or cooking guide. |
| `WP04-P-INCONNU-SCOPE-20261012-R6-S05` | Fisheries and Oceans Canada, [Arctic freshwater commercial-fishery page (EN)](https://www.dfo-mpo.gc.ca/fisheries-peches/commercial-commerciale/atl-arc/inconnu-eng.html) and [French page](https://www.dfo-mpo.gc.ca/fisheries-peches/commercial-commerciale/atl-arc/inconnu-fra.html) | States that Great Slave Lake inconnu is incidental catch in the lake-whitefish/lake-trout commercial fishery; notes critical Buffalo River stock and extirpated stocks. The embedded map is dated 2023–2024; no current product state is inferred from it. |
| `WP04-P-INCONNU-SCOPE-20261012-R6-S06` | Fisheries and Oceans Canada, [Great Slave Lake consultations for commercial fishers, 2026](https://www.dfo-mpo.gc.ca/about-notre-sujet/engagement/2026/great-slave-lake-grand-lac-esclaves-eng.html) | Confirms current 2026 commercial-fisher consultation and that inconnu was included in latest stock-assessment discussion. It is a fishery-planning source, not a consumer product or harvest authorization. |
| `WP04-P-INCONNU-SCOPE-20261012-R6-S07` | Government of Northwest Territories, [Fish species and catch limits (French)](https://www.gov.nt.ca/ecc/fr/services/obtenir-un-permis-de-peche/especes-de-poissons-et-limites-de-prise) | Identifies `Inconnu` with *S. leucichthys* and reports regional sport-fishing rules. The rules are jurisdictional fishing information, not kitchen measures or permission to harvest a specific stock. |

## Integration record

Root integrated `ingredient-ref-inconnu` as `inconnu / inconnu` in `PROTEIN`, with `coney` as its sole English alias. Seven primary-source records and one accepted identity decision were added to the research ledger. Measurement and substitution research remain `not_yet_researched`; no forms, observations, density, mappings, recipe links, rules, or yields were added. The regional fisheries evidence is not treated as general Canadian retail availability.

After integration, the catalog has 1,313 references and the ledger has 1,621 records, 5,936 source entries, and 4,953 distinct source IDs. The 114-file / 1,123-row recipe corpus remains unchanged and contains no candidate term or linked inconnu row. Package normalization/validation, reference normalization, generated-index freshness, ledger schema validation, exact ownership, picker projection, recipe corpus, UTF-8/no-BOM, and scoped whitespace checks passed. Under the updated repository rule, no app tests or emulator checks were run for this database-JSON addition. See the integration README at `docs/catalog/batches/wp04-section-p-inconnu-identity-integration-20261012/README.md`.
