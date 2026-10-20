# WP04 Section P — lobster / homard identity boundary review

- **Status:** Integrated on 2026-10-12. Promoted the held candidate in place and added the accepted reference names, aliases, eight sources, and decision; generic crab and crayfish boundaries remain open.
- **Review date:** 2026-10-12.
- **Scope:** the held generic `lobster / homard` candidate, with Canadian and Québec common-name and product evidence. Keep European lobster, langoustine, langouste/spiny lobster, crayfish, and other crustacean products separate.
- **Disposition:** accepted and integrated the held candidate as one identity-only *Homarus americanus* reference. Use species-qualified displays `American lobster / homard d’Amérique`, with only the directly attested bare-name aliases `lobster / homard` and the documented species-name equivalents listed below. Do not create a genus-wide row or map it to other lobster-like crustaceans.

## Accepted decision

Promoted `ingredient-ref-lobster` from its held candidate state to one `PROTEIN` identity scoped to *Homarus americanus*. The CFIA Fish List pairs both accepted Canadian names `Lobster / Homard` and `American Lobster / Homard Américain` with *H. americanus*. The Atlantic Fishery Regulations likewise pair `Lobster / Homard` with that species. Québec terminology and current Metro product listings independently connect `homard` products with *H. americanus* [S01–S04, S07–S08].

Use **American lobster** and **homard d’Amérique** as the displays. The Québec display is used by MAPAQ and appears as a preferred term in the OQLF’s 2024 species entry [S05, S07]. Keep **lobster** and **homard** as search aliases because the Canadian Fish List and Atlantic regulation name those terms for this species [S01, S03]. The OQLF also records **American lobster / homard américain** and, in its 2024 entry, **North American Lobster / homard d’Amérique**; include `homard américain` and `North American lobster` as evidenced search aliases [S05]. Do not add plural, scientific-name, or product-state aliases.

This resolves the Canadian seafood common name to a species-bounded identity. The OQLF’s food-domain crustacean terminology entry says `homard` applies only to genus *Homarus* and warns against extending it to other genera such as langouste. Its separate *Homarus gammarus* entry also lists `homard` and `lobster` for European lobster [S04, S06]. Keep **European lobster / homard européen** outside this species-scoped row; a recipe or product explicitly naming that species should receive separate review.

Do not add forms for live, cooked, frozen, brined, canned, or extracted products. MAPAQ describes these as distinct market presentations, but the current recipe bundle does not request any of them. Do not add `lobster meat`, `lobster tail`, claw, paste, stock, or prepared lobster products as aliases or forms. Add no recipe links, amounts, densities, unit mappings, yields, conversions, or substitutions.

## Proposed reference shape

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-lobster` (reuse the held candidate ID) |
| French display | `homard d’Amérique` |
| English display | `American lobster` |
| French search aliases | `homard`; `homard américain` |
| English search aliases | `lobster`; `North American lobster` |
| Category | `PROTEIN` |
| Scope | *Homarus americanus* only |
| Forms and numeric behavior | None |
| Recipe links | None; no bundled lobster row exists |

Do not add *Homarus americanus* as a user-facing alias. Keep `homard européen / European lobster` (*H. gammarus*) separate. Keep `langoustine / scampi` (including the existing `ingredient-ref-langoustine` row), `langouste / spiny lobster / rock lobster`, crawfish/crayfish, squat lobster, and surimi or lobster-flavoured products outside this identity. The bare name aliases are supported as Canadian market names by CFIA and the Atlantic regulation; they are not a license to merge European lobster or unrelated crustaceans.

## Candidate and exact-key ownership audit

Before integration, the ledger contained `ingredient-ref-lobster` as a `candidate` with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its latest decision said to wait for a product or recipe target while preserving the Homarus/langouste distinction. This review supplied a species-specific Canadian product target, after which the existing ledger record was promoted in place.

I checked normalized complete-name keys before integration using the same NFKD, case-folding, accent removal, punctuation folding, and whitespace collapsing as `normalizeIngredientSearchKey` in `IngredientSearch.kt`. At that time, active reference names and aliases, form labels and match terms, and legacy candidate names and aliases had no exact owner for `lobster`, `lobsters`, `homard`, `homards`, `American lobster`, `homard américain`, `homard d’Amérique`, `North American lobster`, `European lobster`, `homard européen`, `lobster meat`, `chair de homard`, `spiny lobster`, `rock lobster`, `langouste`, `lobster tail`, or `live lobster`. After integration, the accepted displays and aliases have `ingredient-ref-lobster` as their sole exact owner; excluded terms remain unallocated.

Before integration, the exact queries `lobster` and `homard` had no active result. They now resolve to `ingredient-ref-lobster`. The separate `ingredient-ref-langoustine` displays `scampi / langoustine` with French plural `langoustines`; it does not own any lobster key. The English terms `Norway lobster` and `Dublin Bay prawn` remain associated with *Nephrops norvegicus* in CFIA and the existing langoustine evidence, so they are intentionally excluded.

## Manifest recipe audit

I scanned all **114 manifest-listed recipe files / 1,123 ingredient rows**, including each ingredient’s `ingredientName`, `originalText`, and reference ID, as well as recipe text. There are **0 lobster or homard ingredient-row matches** and no lobster/homard recipe-text hits.

| Recipe / row | Current ingredient | Boundary |
|---|---|---|
| 019 / #8 | `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump` | Specific crab meat and grade; no lobster demand. |
| 023 / #1 | `140 g sliced calamari`, linked to `ingredient-ref-calamari` | Existing calamari line; separate cephalopod identity. |
| 093 / #4 | `Cooked meat or seafood, to taste`, unlinked | Generic optional ingredient with no species or product selection; not evidence for a lobster link. |

The recommendation is supported by stable Canadian/Québec identity and product naming, not by recipe demand. Keep all three recipe rows as they are.

## Live package and ledger snapshot

Counts and SHA-256 hashes below are the review-time pre-integration snapshot of the shared worktree on 2026-10-12. They precede the concurrent kuttu alias integration and this lobster integration. File hashes cover exact bytes. The recipe-corpus digest sorts manifest-listed recipe basenames lexically and hashes each basename, a NUL byte, exact file bytes, and a NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,222 references | `a912956b021d756b7e394e0a7f2e8daf6080f10ec07472aade584aaabe5b3b9e` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `docs/catalog/legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `docs/catalog/research-ledger.v1.json` | 1,522 records; 5,174 source entries; 4,237 distinct source IDs | `7284dd1c15b93f24ab68f14d44a36d6aefed5f8e01ef50a7b73313f01d529adc` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2` |
| `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` | 1,222 references | `f944a0bd729531ff5fb68d33c4dbf528edbbad7e5ce53740b5a0c3368cb2a460` |

The active package and generated catalog remain unchanged by this proposal. The new source IDs below were checked against all source IDs in the live ledger and current catalog proposal/batch documentation; no collision was found.

## Remaining Section P gaps

This integration resolves the Canadian `lobster / homard` common-name boundary as species-scoped *Homarus americanus*. Section P remains open for generic shrimp/prawn, whole crab beyond the active crab-meat identity, and crayfish boundaries; generic mussel, clam, fresh oyster, scallop, and cockle; other finfish and regional fish scope; preserved fish and seafood product states; fish powder, fish balls, and surimi; roe products; and sea urchin, abalone, conch, whelk, sea cucumber, and regional seafood. Keep these held candidates and product states separate from the American-lobster row.

## Source register

All sources were accessed on 2026-10-12. These IDs were proposal-local during review and were added to the existing lobster ledger record during integration.

| Source ID | Source and use | Limit |
|---|---|---|
| `WP04-LOBSTER-HOMARD-20261012-S01` | CFIA Fish List, [*Homarus americanus* results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). Lists *H. americanus* with both `American Lobster / Homard Américain` and `Lobster / Homard`. | Canadian common-name evidence for this listed species; not a kitchen form or recipe link. |
| `WP04-LOBSTER-HOMARD-20261012-S02` | CFIA, [Fish List common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Says the list collects French and English common names recognized by law or generally known and that listed species names should be used for Canadian sales or processing. | Labelling guidance; does not establish a recipe’s species where the recipe is silent. |
| `WP04-LOBSTER-HOMARD-20261012-S03` | Government of Canada, [Atlantic Fishery Regulations, 1985, Schedule I](https://laws-lois.justice.gc.ca/eng/regulations/SOR-86-21/section-sched892491.html). Part IV, item 4, lists `Lobster` as *Homarus americanus*; the page states the consolidated text is current to 2026-06-14. | Atlantic fishery naming; do not extend it to unrelated lobster-like taxa. |
| `WP04-LOBSTER-HOMARD-20261012-S04` | OQLF, [homard (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198631/homard). Gives normalized Québec `homard`, English `lobster` and `American lobster`, and says the name homard applies only to genus *Homarus*; warns against using it for langouste. | Last updated 2007; broad genus-level terminology, not proof that all *Homarus* products sold in Québec are one species. |
| `WP04-LOBSTER-HOMARD-20261012-S05` | OQLF GDT / Faune et flore du pays, [homard d’Amérique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573556/homard-damerique), 2024. Pairs `homard d’Amérique` / `North American Lobster` with *H. americanus*. | Species terminology, not a recipe or product-state specification. |
| `WP04-LOBSTER-HOMARD-20261012-S06` | OQLF, [homard européen (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358906/homard-europeen). Pairs *Homarus gammarus* with `homard européen / European lobster` and also records the base words `homard / lobster`. | Establishes a separate named species and broader linguistic usage; does not establish a Québec retail item for this review. |
| `WP04-LOBSTER-HOMARD-20261012-S07` | MAPAQ, [Les crustacés du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentaire/peche/FI_crustaces-quebec_MAPAQ.pdf). Identifies Québec’s American lobster as *H. americanus*, discusses its consumer market, and lists whole and meat product presentations. | Product-category evidence only; no package sizes, yields, or forms are proposed here. |
| `WP04-LOBSTER-HOMARD-20261012-S08` | Metro, [Homard cuit](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/homard-cuit/p/221532). The current Québec retailer listing uses `Homard cuit`, identifies *H. americanus*, and gives Northwest Atlantic Canada provenance. | The listing showed out of stock when accessed; it supports the product name/species pairing, not current availability. |

## Integration record

Promoted the existing `ingredient-ref-lobster` ledger candidate in place and added the active row
`American lobster / homard d’Amérique` with only `lobster`, `North American lobster`, `homard`, and
`homard américain` as aliases. Added eight source records and an accepted decision to the same ledger
record. No forms, recipe links, measures, conversions, yields, substitutions, or compatibility data
were added. Static package, reference-normalization, generated-catalog, ledger, exact-key, recipe,
UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this
change only adds database JSON data and its generated catalog entry. See
`docs/catalog/batches/wp04-section-p-american-lobster-identity-integration-20261012/README.md`.
