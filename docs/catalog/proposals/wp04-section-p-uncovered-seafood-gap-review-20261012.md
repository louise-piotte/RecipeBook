# WP04 Section P — Pacific cod identity review

- **Review date:** 2026-10-12.
- **Packet type:** proposal-only identity, measurement, substitution, and recipe-demand review.
- **Disposition:** propose one species-scoped, identity-only reference for Pacific cod / morue du Pacifique (*Gadus macrocephalus*). Use `gray cod` and `grey cod` only as English search aliases. Keep generic `cod / morue`, Alaska pollock, salt cod, and stockfish separate. No recipe link, form, default density, unit mapping, conversion, yield, or substitution rule is proposed.
- **Worktree scope:** this proposal file only. No shared catalog JSON, research ledger, recipe, checklist, roadmap, workflow, generated file, or test was changed.

## Bounded decision

Recommend adding one `PROTEIN` identity:

| Candidate ID | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|
| `ingredient-ref-pacific-cod` | **Pacific cod** | **morue du Pacifique** | `gray cod`; `grey cod` | None | *Gadus macrocephalus* |

CFIA lists *G. macrocephalus* under `Pacific Cod` and `Grey Cod / Morue du Pacifique`. Fisheries and Oceans Canada (DFO) independently pairs `Pacific Cod` and `Morue du Pacifique` with the same species. TERMIUM Plus identifies `morue du Pacifique` as the standardized commercial term and lists both gray/grey spellings for this taxon. These sources support the qualified display and the two English spelling aliases. They do not support unqualified `cod` or `morue` as aliases.

Keep this species distinct from:

- Atlantic cod, *Gadus morhua*, already represented by `ingredient-ref-atlantic-cod` as `Atlantic cod / morue de l’Atlantique`;
- Alaska pollock, *Gadus chalcogrammus*, already represented by `ingredient-ref-alaska-pollock` as `Alaska pollock / goberge de l’Alaska`;
- salt cod and stockfish, which are separate preservation/product identities and do not establish Pacific cod preservation forms.

DFO describes Pacific cod as considered equivalent to Atlantic cod in the marketplace. This is evidence about market positioning. It does not establish identical species, recipe performance, quantity, preparation, cooking time, food safety, or a recipe-scoped substitution. Keep the two references separate and add no crosswalk or substitution rule.

## Prior-work and current-state boundary

The Section P checklist and related seafood packets were reviewed before selecting this gap. Earlier work names Pacific cod in `docs/catalog/batches/protein-dairy-identities.md` as a **candidate, not a seed addition**. The WP04 finfish identity coordinator separately records the CFIA overlap of generic `Cod / Morue` across Pacific and Atlantic cod; it does not allocate a Pacific cod reference. The later finfish-gap, pollock/mackerel, and Section P next-gap packets do not add or hold Pacific cod. Current Section P work on red hake, Alaska pollock, lobster, scallop, crab, crayfish, oyster, cuttlefish, octopus, clam, fish balls/surimi, and preserved-fish states remains outside this species decision.

The current active Pacific-facing finfish rows include Alaska pollock, Pacific halibut, Pacific mackerel, Pacific sardine, and sablefish. None identifies *G. macrocephalus*. The live ledger has no Pacific-cod identity or candidate record. This proposal therefore covers one unallocated species identity and does not repeat an existing held seafood boundary.

## Exact-key ownership and live snapshot

The audit follows `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace other punctuation with spaces, and collapse whitespace. Candidate keys were checked against active ingredient-reference names and aliases, all active form labels and match terms, legacy-candidate names and aliases, and ledger record IDs. Exact key ownership is distinct from a shorter query matching a word inside a display.

Snapshot read from the live worktree on 2026-10-12. Hashes cover exact file bytes. The recipe corpus digest iterates the manifest's `recipeFiles` array in stored order and hashes each relative path, a NUL byte, exact recipe-file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,235 references | `fe44e14adc8b1ad613dd84e15a36a6c381f96ecded39a777fae1279bfc674abd` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,534 records; 5,294 source entries; 4,336 distinct source IDs | `baffa3f9442bacf3807d44676fd051956e827e75c97518f7007312a8ee2e58eb` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,993 recipe-file bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

Exact normalized-key results:

| Candidate or boundary key | Exact active reference / form / legacy owner | Decision |
|---|---|---|
| `Pacific cod` | None | Proposed display; `ingredient-ref-pacific-cod` is unallocated. |
| `morue du Pacifique` | None | Proposed fr-CA display; `ingredient-ref-pacific-cod` is unallocated. |
| `Gadus macrocephalus` | None | No taxon string is stored as an active reference, form, legacy name, or alias. |
| `gray cod`; `grey cod` | None | Proposed English spelling aliases. |
| `cod`; `morue` | No exact field owner | Do not add as aliases; complete-word search currently finds qualified names and preserved cod products. After integration, the query will also find the Pacific-qualified display. |
| `morue grise` | None | Do not add; TERMIUM marks this term as European usage. |
| `Alaska cod` | None | Do not add; it is absent from CFIA’s listed preferred Pacific-cod names and is not needed for Québec/Canadian search coverage. |
| `ingredient-ref-pacific-cod`; `candidate-pacific-cod` | Neither ID exists in references, forms, legacy identities, or ledger records. | The reference ID is available for the proposed row; no pre-existing candidate record needs promotion. |

The active exact owner for `Atlantic cod / morue de l’Atlantique` is `ingredient-ref-atlantic-cod`; the exact owner for `Alaska pollock / goberge de l’Alaska` is `ingredient-ref-alaska-pollock`. Neither owns the proposed full Pacific cod display or taxon. Existing salt-cod and stockfish records remain product-specific and do not own `Pacific cod` or `morue du Pacifique`.

The six proposal-local source IDs `WP04-PACIFIC-COD-IDENTITY-20261012-S01` through `S06` were checked before drafting and are absent from the live ledger and existing proposal/batch files. Reused ledger sources are listed separately and are not reissued under new IDs.

## Full manifest recipe-demand audit

All 114 paths listed in `manifest.v1.json` were read in manifest order. The audit examined every one of the 1,123 ingredient rows (`ingredientName`, `originalText`, and `ingredientRefId`), all parsed string values in each recipe JSON file, and the complete parsed file text. Search used normalized whole-word phrases for `Pacific cod`, `morue du Pacifique`, *Gadus macrocephalus*, `gray cod`, `grey cod`, `grayfish`, `greyfish`, `Alaska cod`, `morue grise`, and the generic words `cod` and `morue`.

**Result: zero matching ingredient rows and zero matching recipe files.** The active salmon-fillets and tuna recipe rows do not identify cod or its species. No recipe link, relink, form, or recipe-derived measurement is supported.

## Measurement and density evidence

Health Canada’s 2015 Canadian Nutrient File (CNF) online serving pages report source-specific portions for Pacific cod. They provide observations, not ingredient-wide defaults:

| CNF record | Source-reported portion | Scope and limit |
|---|---|---|
| Food code 3196, `Fish, cod (gray cod), pacific, raw` | 1 fillet = 119.3 g; one food-guide serving = 90 g; total refuse = 66%. | The page does not explain how the high refuse figure relates to the displayed fillet portion. Preserve the source wording as a bounded observation only; do not use it as an edible-fillet count conversion, edible yield, or default recipe weight. |
| Food code 3139, `Fish, cod (gray cod), pacific, baked or broiled` | 100 mL flaked = 57.5 g; 250 mL = 143.7 g; one food-guide serving = 75 g. | Prepared and flaked state only. The volume values are source-specific bulk portions, not a raw-fish conversion or general density. The food-guide serving is not a recipe serving recommendation. |

No source located in this review supports a general Pacific-cod density in g/mL, raw volume-to-mass mapping, standard fillet weight, or edible-portion/cooking yield. The prepared CNF flake observations do not establish any such value. If the identity is integrated, the ledger can preserve the raw fillet figure with its refuse caveat and the cooked-flake portions as separate `portion_weight` / `count_weight` observations, with explicit food states and no runtime unit mapping. Leave `defaultDensity` null and `unitMappings` empty; create no seafood form without a recipe/product request.

## Substitution evidence

DFO’s species profile says Pacific cod is considered equivalent to Atlantic cod in the marketplace. It gives no recipe context, amount, treatment, or adjustment. No recipe in the bundled corpus requests either cod species, and this review found no Canadian/Québec recipe source establishing a directed Pacific-cod-to-Atlantic-cod recipe substitution with usable method and quantity guidance.

Recommended ledger state if the identity is accepted: `substitutionResearchState: researched_no_supported_substitute`, with the DFO marketplace statement retained as a limitation rather than a runtime rule. Do not create a global Pacific-cod ↔ Atlantic-cod mapping, a contextual substitution, or any cooking-safety, storage, curing, or raw-consumption equivalence.

## Recommended integration delta

1. Add `ingredient-ref-pacific-cod` in `PROTEIN` with English display `Pacific cod`, Québec French display `morue du Pacifique`, and English aliases `gray cod` and `grey cod`; add no French alias.
2. Add one verified ledger record keyed by the same ID. Attach the sources below and preserve the two CNF portion observations only with their exact food-state and source-basis limitations. Set `measurementState: researched_supported` only for those source-specific observations; keep density unknown and activate no unit mapping.
3. Record that no recipe-scoped substitute is supported. Keep Atlantic cod and Pacific cod as distinct reference IDs despite DFO’s market-equivalence note.
4. Make no recipe, form, conversion, yield, density, package-yield, legacy-candidate, or substitution-rule change. Leave all other Section P rows and holds unchanged.

## Sources

Sources were accessed on 2026-10-12. The new IDs are proposal-local; they are not live ledger additions.

| Source ID | Primary Canadian / Québec source | Evidence and limits |
|---|---|---|
| **WP04-PACIFIC-COD-IDENTITY-20261012-S01** | CFIA Fish List, [Pacific Cod query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pacific%20Cod) | Lists *Gadus macrocephalus* as `Pacific Cod` and `Grey Cod / Morue du Pacifique`. The species list provides common-name and taxon evidence, not recipe equivalence. |
| **WP04-PACIFIC-COD-IDENTITY-20261012-S02** | Fisheries and Oceans Canada, [Pacific Cod](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-eng.html) | Pairs `Pacific Cod` with *G. macrocephalus* and says it is commercially important in Canada and considered equivalent to Atlantic cod in the marketplace. The latter is not a recipe substitution rule. |
| **WP04-PACIFIC-COD-IDENTITY-20261012-S03** | Pêches et Océans Canada, [Morue du Pacifique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-fra.html) | Direct Québec-facing French profile for *G. macrocephalus*; describes the Canadian commercial fishery and repeats the market-equivalence limit. Not a form, portion, or culinary substitution source. |
| **WP04-PACIFIC-COD-IDENTITY-20261012-S04** | Government of Canada Translation Bureau, [TERMIUM Plus: gray cod](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=GRAY+COD) | The *G. macrocephalus* entry lists `Pacific cod`, `gray cod`, and `grey cod`; it identifies `morue du Pacifique` as the commercial term standardized by the former Office de la langue française and the commercial-fisheries terminology committee. It marks `morue grise` as European usage and also lists broader/less suitable variants that this proposal does not add. |
| **WP04-PACIFIC-COD-IDENTITY-20261012-S05** | Health Canada, [CNF serving size, food 3196](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3196) | 2015 CNF online record for raw Pacific cod; reports one fillet as 119.3 g, a 90 g food-guide serving, and 66% total refuse. Keep the record-specific amount and unresolved refuse interpretation visible; do not activate a count mapping or edible yield. |
| **WP04-PACIFIC-COD-IDENTITY-20261012-S06** | Health Canada, [CNF serving size, food 3139](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3139) | 2015 CNF online record for baked or broiled Pacific cod; reports 100 mL flaked as 57.5 g, 250 mL as 143.7 g, and a 75 g food-guide serving. This is not a raw-fish density or recipe default. |

Reused sources already present in the live ledger:

- **`WP04-FINFISH-ID-20261009-S06`** — CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Reused for the scope of the Fish List and Canadian species-specific common names; no duplicate source entry is assigned here.
- **`WP04-FINFISH-ID-20261009-S07`** — CFIA Fish List, [cod query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Cod). Reused for the generic `Cod / Morue` overlap across species, including *G. macrocephalus* and *G. morhua*; no duplicate source entry is assigned here.

No tests or emulator checks were run for this proposal-only review.
