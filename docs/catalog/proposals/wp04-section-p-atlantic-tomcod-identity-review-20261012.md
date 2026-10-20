# WP04 Section P — Atlantic tomcod / poulamon identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only finfish identity, Québec naming, exact-ownership, and recipe-demand review.
- **Disposition:** **Accept** one identity-only `PROTEIN` reference for Atlantic tomcod / poulamon (*Microgadus tomcod*). Add no aliases, forms, recipe links, or numeric or substitution behavior.
- **Integration status:** accepted and integrated on 2026-10-12. Added the identity-only reference and ledger evidence described below; no recipe content or numeric behavior changed. No app tests or emulator checks were run because this was a database-JSON catalog addition under `AGENTS.md`.

## Bounded recommendation

| Candidate ID | Category | English display | fr-CA display | Additional aliases | Taxon |
|---|---|---|---|---|---|
| `ingredient-ref-atlantic-tomcod` | `PROTEIN` | **Atlantic tomcod** | **poulamon** | None | *Microgadus tomcod* |

The OQLF edible-fish entry pairs *Atlantic tomcod* with *poulamon* and *Microgadus tomcod*. The current Québec species profile and CFIA Fish List independently pair the same taxon with Atlantic tomcod and poulamon-related naming. Use the OQLF-normalized Québec product name `poulamon`; retain the English geographic qualifier to keep this identity distinct from other fish that may be called tomcod. [S01–S03]

This is one species identity. It is not Atlantic cod, Pacific cod, the unrelated freshwater burbot called `lotte`, or a generic “small cod” identity. The fact that the Québec wildlife profile lists `petite morue` and `loche` among contextual names does not make those safe ingredient aliases: OQLF specifically excludes them from Québec fish-product marketing terminology. [S01–S02]

## Prior-work boundary and unfinished status

I read the global catalog plan and the recent Section P proposals and integration packets before selecting this gap. The recent finfish work covers red hake, bluefish, American shad, Pacific cod, lake whitefish, lake trout, Atlantic capelin, and other previously reviewed species or held market-name boundaries. A search across prior WP04 Section P proposals and batches found no earlier `Atlantic tomcod`, `tomcod`, `poulamon`, or *M. tomcod* decision. The active catalog, forms, legacy candidates, and ledger also contain no allocation for this fish. This proposal therefore addresses one unreviewed species, without reopening the cod, burbot, capelin, or other fish decisions.

## Live snapshot and exact ownership audit

Proposal-time snapshot read from the live worktree on 2026-10-12, before this identity was integrated. Hashes cover exact file bytes and are historical baseline values. The recipe-corpus digest iterates `manifest.v1.json` in stored `recipeFiles` order and hashes each relative path, a NUL byte, the exact recipe bytes, and another NUL byte.

| Artifact | Count / kind | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,252 references | `a67716b92d4129d7ecbd7109e5481787f12b3a479fb6f09769e5cd00e6a3ecf8` |
| `BundledIngredientCatalog.kt` | Generated import catalog | `e9608c08c9259d9893caea23c440a6162aa952e6d3f3bd2ab96c85b5dfcc6221` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,560 records; 5,435 source entries; 4,473 distinct source IDs | `8eadbfd35168df462e10ad6db01b3e1840d84735d493ace0501bfe2d833491ae` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,736 bytes | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

The exact-key audit mirrors `normalizeIngredientSearchKey`: lowercase, NFKD, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It checked active reference names and aliases, form labels and match terms, legacy candidate names and aliases, ledger record IDs, generated catalog text, and the proposed IDs.

| Candidate or boundary key | Exact current owner / result |
|---|---|
| `Atlantic tomcod`, `tomcod`, `poulamon`, `poulamon atlantique`, *Microgadus tomcod* | No exact active reference, form, legacy candidate, ledger record, or generated-catalog owner. |
| `ingredient-ref-atlantic-tomcod`, `candidate-atlantic-tomcod` | Neither ID is allocated in references, forms, legacy candidates, or ledger records. |
| `petit poisson des chenaux`, `poisson des chenaux`, `petite morue`, `loche`, `frostfish`, `tommycod` | No exact active reference, form, or legacy-candidate owner. They are not proposed as aliases. |
| `Atlantic cod` / `morue de l’Atlantique` | Existing `ingredient-ref-atlantic-cod`, a different species (*Gadus morhua*). |
| `Pacific cod` / `morue du Pacifique` | Existing `ingredient-ref-pacific-cod`, a different species (*Gadus macrocephalus*). |
| `salt cod` / `morue salée` | Existing `ingredient-ref-salt-cod`, a preservation/product identity, not a tomcod identity. |
| `sablefish` / `morue charbonnière` | Existing `ingredient-ref-sablefish`, *Anoplopoma fimbria*; its French name does not make `morue` a shared fish identity. |
| `burbot` / `lotte` | No exact active owner in this snapshot. Keep *Lota lota* distinct if reviewed later; the Québec tomcod profile explicitly notes it as a similar species and distinguishes their anatomy. |

At the proposal-time snapshot, no active forms were attached because the identity did not yet exist. A full-text search of the then-current ledger and catalog package found no candidate term or taxon. The proposal-local source prefix `WP04-SECTIONP-ATLANTIC-TOMCOD-20261012-S` was unallocated at that time; integration registered S01–S04 on the new ledger record.

## Picker phrase boundary

The displays make `Atlantic tomcod`, `tomcod`, and `poulamon` usable search phrases; a `tomcod` query matches a word in the English display, so no duplicate stored alias is needed. The result remains visibly qualified as **Atlantic tomcod / poulamon**.

Do not add `cod`, `morue`, `petite morue`, `loche`, or `petit poisson des chenaux` as aliases. A `cod` search is already captured by whole-phrase matches for Atlantic cod, Pacific cod, and salt cod; it does not need to fall back to the suffix inside `tomcod`. `Morue` likewise returns existing cod/sablefish products. OQLF says `petite morue`, `loche`, and `poisson des chenaux` are not retained for fish-product marketing in Québec. The current substring fallback also makes a `loche` query match `effiloché` in the unrelated `porc effiloché sous vide` recipe; this substring is not an exact name owner.

The Québec government species profile uses `poulamon atlantique`, while OQLF normalizes the commercial fish name to `poulamon` and explicitly does not retain the longer phrase in Québec fish-product marketing. Keep `poulamon atlantique` out of the stored aliases under this display policy. This means that exact compound query is not guaranteed to resolve to the shorter `poulamon` display; the normalized product term remains the picker boundary. [S01–S02]

## Complete recipe-corpus demand audit

All 114 manifest-listed recipe files, all 1,123 ingredient rows, and their parsed string fields were checked for exact normalized word phrases: `Atlantic tomcod`, `tomcod`, `poulamon`, `poulamon atlantique`, *Microgadus tomcod*, `petit poisson des chenaux`, `poisson des chenaux`, `petite morue`, `loche`, `frostfish`, and `tommycod`.

**Result: zero exact phrase hits in ingredient rows and zero exact phrase hits in recipe files.** A naive substring scan flags `loche` inside the French word `effiloché` in recipe 082, but the picker’s whole-word phrase pass does not treat that as a `loche` phrase; the current substring fallback can still surface it if no exact match exists. The recipe bundle therefore provides no tomcod recipe request, form, amount, measure, product state, or substitution context.

Nearby rows show why no seafood inference is warranted:

| Recipe row | Ingredient text | Limit |
|---|---|---|
| 077#10 | `675 g salmon fillets without skin, cut into cubes` | Existing salmon-fillets identity; no cod-family species is implied. |
| 093#4 | `Cooked meat or seafood, to taste` | Unlinked broad option; it does not select a fish or taxon. |
| 093#6 and 095#5 | `fish sauce` | Existing condiment, not fish flesh. |
| 111#1 | `1 tuna steak` | Existing broad tuna identity; not evidence for a tomcod recipe. |

## English / fr-CA evidence and taxon limits

- **Québec product terminology:** OQLF identifies *poulamon* as its normalized edible-fish term and pairs it with English *Atlantic tomcod* and *Microgadus tomcod*. It says the related forms `poulamon atlantique`, `loche`, `petite morue`, and `poisson des chenaux` are not retained for Québec fish-product marketing. This supports the localized display and alias exclusions, not a claim about every colloquial or regulatory context. [S01]
- **Current Québec species profile:** the Government of Québec page, last updated 2026-10-02, identifies *Poulamon atlantique*, English *Atlantic tomcod*, and *Microgadus tomcod*. It also lists the popular names `petit poisson des chenaux`, `petite morue`, and `loche`, and distinguishes the fish from burbot (*Lota lota*). This is species and regional-use evidence; its wildlife names do not override OQLF’s fish-product display recommendation. [S02]
- **Canadian fish-label name:** CFIA lists *Microgadus tomcod* as both `Tomcod` and `Atlantic Tomcod / Poulamon`. This independently ties the bilingual product name to the taxon; it does not justify broad `cod` / `morue` aliases. [S03]
- **Current regulatory cross-check:** the consolidated Québec Fishery Regulations, current to 2026-09-21, include `Atlantic tomcod (Poulamon atlantique)` with *Microgadus tomcod*. This confirms a current regulatory bilingual species label; use OQLF, rather than the regulation, for the Québec recipe-picker display. [S04]

Keep the candidate limited to *M. tomcod*. Do not merge it with Atlantic cod (*Gadus morhua*), Pacific cod (*G. macrocephalus*), burbot (*Lota lota*), Pacific tomcod (*Microgadus proximus*), or any generic “cod,” “tomcod,” or “fish” category. Shared family membership, names used in another context, or regional fishing practices do not establish an ingredient equivalence.

## Numeric, form, conversion, and substitution limits

The Québec wildlife profile reports typical observed length of 16–25 cm, a maximum of 45 cm, and general weight below 150 g. Those are biological observations, not an edible-yield measure, recipe portion, count-to-weight conversion, or default quantity. No recipe line supplies a culinary measure.

Do not add a fresh, frozen, whole, gutted, fillet, cooked, smoked, dried, canned, powdered, or other form. The naming and species sources do not establish a catalog-level product-form mapping. Keep `defaultDensity` null and `unitMappings` empty; add no package amount, portion, edible yield, conversion, or recipe link. Measurement research remains unresearched.

No source establishes a global same-fish form conversion or a contextual recipe substitution between tomcod and Atlantic/Pacific cod, burbot, smelt, capelin, pollock, or another finfish. Add no global or contextual substitution rule. Similarity to the cod family or to burbot is not substitution evidence; substitution research remains unresearched.

## Sources

Sources were accessed on 2026-10-12. Source IDs were proposal-local during review; S01–S04 were registered on the integrated ledger record.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ATLANTIC-TOMCOD-20261012-S01** | OQLF GDT, [poulamon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198839/poulamon) | Edible-fish domain; normalized Québec display `poulamon`; English `Atlantic tomcod` / `tomcod`; Latin *Microgadus tomcod*. Explicit Québec product-marketing exclusions for `poulamon atlantique`, `loche`, `petite morue`, and `poisson des chenaux`. The page’s terminology record was last updated in 2011; current usage is cross-checked against S02–S04. |
| **WP04-SECTIONP-ATLANTIC-TOMCOD-20261012-S02** | Gouvernement du Québec, [Poulamon atlantique](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/poulamon-atlantique) | Current species profile, last updated 2026-10-02; pairs French and English names with *M. tomcod*, gives Québec range/popular names and distinguishes burbot. Biological size/weight and wildlife terminology do not establish a recipe measure or product alias. |
| **WP04-SECTIONP-ATLANTIC-TOMCOD-20261012-S03** | CFIA Fish List, [Atlantic tomcod query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Atlantic%20Tomcod) | Lists *M. tomcod* under `Tomcod` and `Atlantic Tomcod / Poulamon`. Canadian fish-label naming evidence; no cooking form, conversion, or substitution basis. |
| **WP04-SECTIONP-ATLANTIC-TOMCOD-20261012-S04** | Department of Justice Canada, [Québec Fishery Regulations, 1990 — Schedule 3](https://laws-lois.justice.gc.ca/eng/regulations/SOR-90-214/section-sched922404.html?txthl=white) | Consolidated regulation current to 2026-09-21 lists `Atlantic tomcod (Poulamon atlantique)` with *M. tomcod*. Regulatory species naming only; it does not set the catalog’s commercial display or support culinary behavior. |

## Integration result

- Added `ingredient-ref-atlantic-tomcod` in `PROTEIN` with English display `Atlantic tomcod`, fr-CA display `poulamon`, and no aliases.
- Added the four registered taxonomic and Québec naming sources plus the accepted identity decision to `ingredient-ref-atlantic-tomcod` in the research ledger. Measurement and substitution research remain unresearched.
- Added no forms, numeric behavior, recipe links, conversions, yields, or substitutions. Other names and taxa remain unassigned or separate; broader Section P finfish coverage remains open.
- Static seed-package, reference, generated-index, ledger, exact-phrase, corpus, encoding, and scoped whitespace checks passed. No app tests or emulator checks were run for this database-JSON addition under `AGENTS.md`.
