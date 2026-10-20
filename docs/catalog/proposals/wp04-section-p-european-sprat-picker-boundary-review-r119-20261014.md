# WP04 Section P R119 — *Sprattus sprattus* / sprat picker-boundary review

- **Review date:** 2026-10-14.
- **Packet type:** proposal-only naming, picker, and product-boundary review.
- **Status:** Integrated by root on 2026-10-14 as a documentation-only hold; no active catalog or ledger data was added.
- **Bounded candidate:** *Sprattus sprattus* (OQLF preferred French and English term: `sprat`).
- **Parent checklist item:** [Global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), Section P: “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.”
- **Recommendation:** Keep *S. sprattus* outside active ingredient references, forms, and the research ledger for now. CFIA assigns `Sprat / Sprat` to *Sprattus antipodum* and *Sprattus* spp. as well as the French name `Sprat` to other taxa. A row using OQLF's `sprat / sprat` display would make a broad `sprat` query appear unique in the current picker.
- **Scope:** This review addresses one species and its common-name collision. It does not decide broader fish taxonomy, food safety, or interchangeability among sprat-, sardine-, and herring-labelled foods. Section P remains open.

## Why this is a distinct review

The [R118 bigeye tuna review](wp04-next-section-p-bigeye-tuna-picker-boundary-review-20261014-r118.md) covers *Thunnus obesus* and the bare `bigeye` query. The [R116 skipjack hold](wp04-next-section-p-finfish-gap-review-20261014-r1.md) and [R117 paired integration](../batches/wp04-section-p-skipjack-pair-identity-integration-20261014/README.md) address *Katsuwonus pelamis* and *Euthynnus lineatus*. None settles *Sprattus sprattus* or the bare `sprat` query.

The earlier [sardine identity review](wp04-sardine-fish-identity-boundary-review-20261011.md) mentions *S. sprattus* only within a Codex list of species used in canned sardine-type products. That product-class mention did not allocate an active sprat identity, aliases, forms, or picker behavior. A repository scan found no dedicated sprat proposal or integration, and no exact active identity owner.

## Canadian and Québec name evidence

The CFIA Fish List ties common names to scientific taxa. In the `sprat` search results reviewed on 2026-10-14, relevant rows include:

| Taxon | English name | French name | Picker implication |
|---|---|---|---|
| *Sprattus antipodum* | Sprat | Sprat | Shares both short terms with the proposed OQLF display. |
| *Sprattus* spp. | Sprat | Sprat | Genus-level entry shares both short terms. |
| *Sprattus sprattus* | Brisling Sardine | Sprat | The species-specific CFIA English name differs from the short French name. |
| *Corica soborna* | Ganges River Sprat | Sprat | Adds another taxon under the exact French word and contains the English word in a qualified name. |

These are bounded CFIA Fish List examples for this review, not an exhaustive inventory of every global, trade, or local use of `sprat`. CFIA's guidance says its Fish List collects French and English fish names recognized by legislation and/or by which fish are generally known, and that the listed names should be used for the species being sold or processed in Canada. That labeling reference helps expose the collision; it does not prescribe RecipeBook's internal taxonomy or picker policy [S01–S02].

The OQLF GDT entry, last updated in 2012, identifies `sprat` as the preferred Québec French term for an edible fish and also gives English `sprat`. It lists `brisling` and `sardine` as English terms; `esprot` is a contextual French term that the fisheries terminology committee did not retain. Its Latin field includes both an older misspelling, *Spratus spratus*, and the correct *Sprattus sprattus*. Use the current CFIA binomial spelling for this review; do not turn the OQLF's alternative terms into picker aliases automatically [S03].

CFIA's separate susceptible-species list calls *S. sprattus* “European sprat,” but explicitly says that list is for aquatic-animal health and does not replace the Fish List for fish labelling. It supports an English taxonomic qualifier only; this proposal does not translate it into an unsupported French display or use it to resolve the food-label collision [S04].

## Live ownership and picker effect

Read-only snapshot taken on 2026-10-14:

| Artifact | Current count | Exact candidate ownership |
|---|---:|---|
| [ingredient-references.v1.json](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,463 references | No exact *S. sprattus*, `sprat`, `sprats`, `brisling`, `Brisling Sardine`, `esprot`, or proposed identity owner. |
| [ingredient-forms.v1.json](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 105 forms | No sprat or candidate-specific form label or match term. |
| [legacy-import-identities.v1.json](../legacy-import-identities.v1.json) | 63 candidates | No exact candidate name, alias, or binomial owner. |
| [research-ledger.v1.json](../research-ledger.v1.json) | 1,804 records | No identity record for the candidate or its reviewed name set. |
| [manifest.v1.json](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) and recipe files | 114 recipe files; 1,123 ingredient rows | No `sprat`, `Sprattus`, `brisling`, or `esprot` mention in the manifest-listed corpus. |

Nearby active identities include Atlantic herring / `hareng de l’Atlantique`, Pacific herring / `hareng du Pacifique`, European pilchard / `sardine européenne`, and Pacific sardine / `sardine du Pacifique`. No sprat row is hidden under one of those owners. The current `sardine` picker query returns the two qualified sardine references; `herring` and `hareng` each return the two qualified herring references.

The current matcher in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns full word-phrase matches first, and falls back to substring matches only when no phrase matches exist. With a hypothetical alias-free row named `sprat / sprat`, the picker projection is:

| Query | Current results | Projected results |
|---|---:|---:|
| `sprat` | 0 | 1: *S. sprattus* |
| `Sprattus sprattus` | 0 | 0; it would require an explicit binomial search term to return the candidate. |
| `European sprat`, `sprat européen`, `Brisling Sardine`, `brisling` | 0 | 0 with that hypothetical display and no aliases. |
| `sardine` | 2: European pilchard and Pacific sardine | 2 with that hypothetical display and no aliases. |
| `sardine européenne`, `sardine du Pacifique` | 1 each | Remain on their qualified identities. |

The first row is the boundary: CFIA's short `Sprat / Sprat` names cover multiple taxa, while RecipeBook would expose only one new species result. If `Brisling Sardine` or OQLF's English alternative `sardine` were added as a display term or alias, broad `sardine` would instead return a third row alongside the two current sardine references. A qualified `European sprat` display would still make bare `sprat` match this single row, and its source is not a CFIA food-label name. Keep all broad alternatives out of an active row until Section P has a shared-name policy and an appropriately scoped set of identities.

## Product states and Québec market evidence

Metro currently lists Riga `Sprat fumés marinés dans l'huile`, a 160 g SKU. Its ingredient declaration says naturally smoked sprats, canola oil, and salt, but gives no scientific name. This is evidence of a Québec-listed smoked, oil-marinated sprat product, not a species crosswalk to *S. sprattus*. The 160 g figure is the package mass for that item only; it is not a drained weight, serving, recipe measure, or yield [S05].

Codex CXS 244-2004 separately defines a salted-sprat product class scoped to *S. sprattus*. It permits product made from fresh or frozen fish and several presentations, including whole, headed, gutted, or filleted fish. That standard distinguishes salted sprat from Metro's smoked, oil-marinated SKU; it does not make those states interchangeable or identify the Metro fish [S06].

The targeted Health Canada Canadian Nutrient File search did not establish a species-specific household portion for *S. sprattus*. Generic herring or sardine servings are not transferable to this candidate or to the Metro package. No reusable measure, density, unit mapping, edible yield, or cooking yield is supported here [S07].

## Bundled recipe demand and substitutions

All 114 manifest-listed recipe files and their 1,123 ingredient rows were checked for `sprat`, `sprats`, *Sprattus*, `brisling`, and `esprot`; there were no matching recipe files or rows. The bundle has no species-specific recipe demand, quantity, state, or link to assign to this candidate.

The global and contextual substitution-rule files currently contain zero rules. No recipe or reviewed source validates replacing sprat with sardine, Atlantic herring, Pacific herring, or another fish in a defined dish, role, or method. Add no recipe-line substitution, global or contextual rule, yield, density, or form conversion. Similar family membership, canned sardine-type standards, and a shared retail word do not establish culinary, curing, storage, or safety equivalence.

## Recommendation

1. Hold *S. sprattus* outside active references, forms, and the research ledger. Do not add a row named `sprat / sprat` while the current picker would make the shared term a singleton.
2. Keep `Brisling Sardine`, `brisling`, `sardine`, `esprot`, `European sprat`, and the binomial out of active aliases for this packet. The sources differ in naming scope, and several terms would broaden existing picker queries without resolving all taxa.
3. Add no product form, amount, measure, density, mapping, conversion, yield, recipe link, or substitution. The Metro package and Codex salted product remain distinct evidence examples, not exhaustive product-state inventories.
4. Keep Section P open. Revisit this candidate if the broader `sprat` name group is represented or if the product explicitly accepts a single result for the broad query. Recheck the current catalog and source pages before any later integration.

**Reviewer question:** Should the active picker represent the other taxa that share `Sprat / Sprat` before exposing *S. sprattus*, or is a singleton result for bare `sprat` acceptable while a species-qualified query remains unresolved?

## Source register

Sources were checked on 2026-10-14. Retail listings can change; the source scopes below limit what this proposal concludes.

| ID | Source and URL | Use and limit |
|---|---|---|
| **S01** | CFIA, [Fish List query for `sprat`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=sprat) and [Fish List landing page](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Scientific names, English/French common-name rows, TSNs, and list date displayed as 2023-09-18. Bounded Canadian common-name evidence; not an app identity schema or exhaustive inventory of global and trade wording. |
| **S02** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Describes the Fish List's common-name scope and use for Canadian fish sold or processed. It does not prescribe picker behavior. |
| **S03** | OQLF, [GDT: sprat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199079/sprat) | Preferred French `sprat`, English terms, contextual `esprot`, and Latin terms; last updated 2012. Terminology evidence, not current market inventory or a reason to activate all alternatives as aliases. |
| **S04** | CFIA, [Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species) | Uses “European sprat” for *S. sprattus* and explicitly limits the list to aquatic-animal health purposes; it does not replace the CFIA Fish List for food labelling. |
| **S05** | Metro, [Riga Sprat fumés marinés dans l'huile](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/sprat-fumes-marines-dans-l-huile/p/069694005821) | Product name, 160 g SKU, and ingredients. No binomial or transferable recipe measure. |
| **S06** | FAO/WHO Codex Alimentarius, [CXS 244-2004, Standard for Salted Atlantic Herring and Salted Sprat](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B244-2004%252FCXS_244e.pdf) | Product standard scoped to salted *S. sprattus*; supports the separate salted state and named presentations. Not a Québec SKU identity or kitchen-measure source. |
| **S07** | Health Canada, [Canadian Nutrient File search](https://food-nutrition.canada.ca/cnf-fce/newSearch) | Targeted search for species-specific serving evidence. This review did not find a transferable amount for *S. sprattus*; absence in that search is not a claim about every possible database record or product. |

## Static review record

Read the current AGENTS.md, Section P plan, reference and form files, legacy candidates, research ledger, manifest-listed recipes, relevant prior proposals and batches, and current matcher source. Rechecked the candidate and its common-name variants against live owners. The projected picker counts above follow the current search implementation. Root integrated this review as a documentation-only hold, recorded in the batch README and catalog plan. No catalog JSON, ledger, recipe, or generated index changed. No app or emulator tests were run.
