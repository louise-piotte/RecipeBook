# WP04 Section P — blue swimming crab / étrille bleue picker-boundary review

- **Review date:** 2026-10-13.
- **Status:** Root integrated a verified, unresolved candidate record into the research ledger on 2026-10-13; no active catalog row was added. See the [round-six integration](../batches/wp02-wp03-wp04-round6-gap-review-integration-20261013/README.md).
- **Recommendation:** **Hold** a new active identity for *Portunus pelagicus* until the ingredient picker can keep the species-qualified phrase separate from shorter CFIA names that resolve to a genus or another species. The exact English/French display pair is supported by CFIA, and current Québec retail evidence identifies the species, but the present phrase-first picker would make `swimming crab` and `étrille` select this one species by themselves.
- **Candidate row evaluated conditionally:** `ingredient-ref-blue-swimming-crab`, category `PROTEIN`, English `blue swimming crab`, French `étrille bleue`, empty alias arrays, null density, and empty unit mappings. This row is **not recommended for insertion in the current picker**. No species-specific form, recipe link, numeric behavior, or substitution is proposed.

## Decision and scope

The active Section P checklist still leaves the broader fish and seafood species/product boundary work open. Its round-five completion explicitly added `blue crab / crabe bleu` for *Callinectes sapidus* while keeping blue swimming crab distinct. The round-five proposal named *Portunus pelagicus* only as a possible later review; it did not make an identity or hold decision for it. The current active references and forms contain the generic crab-meat identity and its Jumbo Lump grade, Dungeness crab, and the integrated blue-crab identity, but no blue swimming crab row. There is no focused earlier proposal, batch, or ledger candidate for *P. pelagicus*.

This packet reviews only *P. pelagicus*, the neighboring *C. sapidus* name boundary, product evidence, and the picker behavior caused by the candidate display. It does not reopen the accepted crab-meat/Jumbo Lump or Dungeness decisions, nor the round-five blue-crab integration. The generic-crab hold remains about an unqualified whole-crab identity; it does not settle this separate species candidate.

The identity and product evidence is adequate to document *P. pelagicus* as a distinct Canadian seafood species. The active-picker boundary is not safe yet: CFIA also assigns the shorter English common name `Swimming Crab` to *Portunus* spp., and another CFIA row names *Necora puber* `Étrille commune`. The current search code matches complete word phrases anywhere inside a display term. A conditional `blue swimming crab / étrille bleue` row would therefore appear as the only result for the broader queries `swimming crab` and `étrille`, even though those phrases are not species-specific in the CFIA list. Hold the active row until those shorter queries can remain unallocated or become clearly multiple-choice.

## Taxon and Canadian / Québec naming evidence

CFIA’s Fish List shows *Portunus pelagicus* (TSN 199965) with the exact species-qualified pair **Blue Swimming Crab / étrille bleue**. On the same crab query, CFIA assigns *Portunus* spp. (TSN 98717) **Swimming Crab** and **Crab / Crabe**; it also assigns *Necora puber* **Velvet Swimming crab / Étrille commune**. These are different taxon scopes, not aliases for the *P. pelagicus* entry. The Fish List page says its names are Canadian-acceptable common names for fish labeling; the crab query reports a last-modified date of 2023-09-18. That is authoritative Canadian naming evidence, but it does not prove local harvest, a recipe meaning, or culinary equivalence.

The exact-term search of OQLF’s GDT did not surface a species entry for `étrille bleue`. I therefore treat that phrase as CFIA’s French common name and do not claim it is an OQLF-preferred Québec term. OQLF’s existing `crabe bleu` entry explicitly scopes preferred Québec French **crabe bleu**, English **blue crab**, and *Callinectes sapidus*; that phrase already belongs to the integrated `ingredient-ref-blue-crab`. DFO’s 2025 eastern-Canada crab identification guide independently labels *C. sapidus* `Crabe bleu`. These references support keeping `crabe bleu` and `blue crab` with *C. sapidus*, not extending them to *P. pelagicus*.

Current Canadian retail and brand pages reveal competing wording. Metro’s English page for a wild crab-claw-meat SKU identifies its ingredient as `BLUE SWIMMING CRAB (PORTUNUS PELAGICUS)`; the matching Québec French page names the ingredient `CRABE BATAILLEUR (PORTUNUS PELAGICUS)`. Ocean’s, a Canadian-owned seafood brand, identifies its wild crab meat as *P. pelagicus* but calls the source animals `crabes bleus`. The latter wording conflicts with OQLF’s species-scoped `crabe bleu` term. Neither French phrase is promoted to an alias: `crabe batailleur` is SKU-scoped retailer wording, while `crabes bleus` creates a direct collision with the active *C. sapidus* row. Use only CFIA’s qualified pair when describing the conditional candidate, and keep it held for picker reasons.

## Active ownership and archive audit

Exact-key ownership was checked across current reference display names and aliases, all attached form labels and match terms, legacy-import candidates, and ledger record IDs. Normalization follows `normalizeIngredientSearchKey`: lowercase, NFKD decomposition, accent folding, punctuation-to-space, and whitespace folding.

| Normalized key or record ID | Current exact owner | Finding |
|---|---|---|
| `ingredient-ref-blue-swimming-crab` | None in references, forms, legacy candidates, or ledger records. | Candidate ID is unallocated. |
| `blue swimming crab`; `étrille bleue`; *Portunus pelagicus* | None in current reference/form/legacy exact terms; no focused ledger candidate. | CFIA source names this taxon. Latin remains evidence, not a search alias. |
| `blue crab`; `crabe bleu` | `ingredient-ref-blue-crab`, **blue crab / crabe bleu**, *Callinectes sapidus*. | Keep ownership unchanged; do not alias either term to *P. pelagicus*. |
| `crab meat`; `chair de crabe` | `ingredient-ref-crab`, **crab meat / chair de crabe**. | Species-unspecified edible crab meat; not a species assignment. |
| `jumbo lump crab meat`; `chair de crabe en gros morceaux (jumbo lump)` | `ingredient-form-crab-jumbo-lump` attached to `ingredient-ref-crab`. | Existing grade form; no transfer to the candidate. |
| `swimming crab` | No active reference/form/legacy exact owner. CFIA assigns this name to *Portunus* spp. | Do not add it as an alias. The conditional display itself still matches this phrase in the current picker; that is a hold reason. |
| `étrille` | No active exact owner. CFIA’s crab list also has *Necora puber* `Étrille commune`. | Do not add it as an alias. The conditional French display itself matches the shorter phrase; that is another hold reason. |
| `blue swimmer crab`; `crabe bleu nageur`; `crabe batailleur`; `crabes bleus` | No active exact reference/form/legacy owner. | Exclude from aliases: CFIA’s supported pair is different; `crabe batailleur` is a single retailer label; Ocean’s `crabes bleus` collides with OQLF’s *C. sapidus* term. |
| Bare `crab` / `crabe` | No exact bare-key owner. | Search already reaches several crab-related rows by phrase matching. Candidate projection is shown below; the generic-crab hold remains unchanged. |

The source-ID prefix `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-` and the proposal finding ID `WP04-SECTIONP-BLUE-SWIMMING-CRAB-HOLD-20261013-R6-F01` were absent from the ledger, catalog, legacy file, and proposal/batch archive before this draft. The three new source IDs below are distinct. Existing round-five CFIA, OQLF, and DFO source IDs are explicitly reused for their original source pages rather than reissued as new sources. At integration, root added the three new R6 source records to the verified unresolved candidate record, along with exact copies of the five reused R5 source entries. No active ingredient reference or substitution finding was created.

## Picker projection, including attached forms

Projection uses the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior over live bilingual names, aliases, and form terms. Exact form-term matches are checked first; otherwise complete normalized phrases anywhere within a term take priority over substring matching. Forms below are attached to the result row; they are not separate ingredient references.

| Query | Current result(s) and attached form(s) | If the conditional row were added | Effect |
|---|---|---|---|
| `blue swimming crab` | No result. | `ingredient-ref-blue-swimming-crab` (blue swimming crab / étrille bleue); no form. | Full species-qualified English query is distinct. |
| `étrille bleue` | No result. | `ingredient-ref-blue-swimming-crab`; no form. | Full CFIA French name is distinct. |
| `blue crab` | `ingredient-ref-blue-crab` (blue crab / crabe bleu); no form. | Same result only. | Existing species ownership remains intact. |
| `crabe bleu` | `ingredient-ref-blue-crab`; no form. | Same result only. | OQLF’s *C. sapidus* term does not transfer. |
| `swimming crab` | No result. | `ingredient-ref-blue-swimming-crab`; no form. | **Unsafe singleton:** CFIA also assigns `Swimming Crab` to *Portunus* spp. |
| `étrille` | No result. | `ingredient-ref-blue-swimming-crab`; no form. | **Unsafe singleton:** CFIA also names *Necora puber* `Étrille commune`. |
| `crab` | `ingredient-ref-crab` (with `ingredient-form-crab-jumbo-lump` attached); `ingredient-ref-dungeness-crab`; `ingredient-ref-blue-crab`. | Same three plus `ingredient-ref-blue-swimming-crab` (no form). | Broad English query grows from three to four; existing rows remain visible. |
| `crabe` | `ingredient-ref-crab` (with Jumbo Lump attached); Dungeness crab; blue crab. | Same three; the candidate does not contain the word `crabe`. | Broad French query remains at three. |
| `crab meat`; `chair de crabe` | `ingredient-ref-crab`, with Jumbo Lump attached. | Same result and form. | No species-specific meat form is implied. |
| `jumbo lump crab meat` | `ingredient-ref-crab`, exact attached form `ingredient-form-crab-jumbo-lump`. | Same result and form. | Existing recipe-grade selection remains unchanged. |
| `blue swimmer crab`; `crabe batailleur`; *Portunus pelagicus* | No result. | No result with the conditional row’s exact names only. | No retail wording, unsourced variant, or Latin alias is added. |

The false-specificity risk is caused by the current search algorithm, not by a shared exact key: the full candidate labels are exact species names, but their contiguous shorter phrases are also indexed as complete phrase matches. A user who searches the CFIA genus name `swimming crab` or the shorter French term `étrille` would get one narrower species. This review does not propose a generic *Portunus* reference to mask that result; there is no recipe demand or stable product scope for such a broader row in this packet.

## Product states, numeric evidence, and substitutions

Evidence dimensions remain separate:

- **Taxonomic identity:** CFIA’s species row maps *P. pelagicus* to `Blue Swimming Crab / étrille bleue`; the genus-level *Portunus* row and adjacent *Necora puber* row show why the active picker remains held.
- **Québec SKU/product state:** Metro’s English and French listings are the same **227 g** wild crab-claw-meat SKU, product 731149113954. The English ingredient line says `BLUE SWIMMING CRAB (PORTUNUS PELAGICUS)`; the French line says `CRABE BATAILLEUR (PORTUNUS PELAGICUS)` and also lists sodium acid pyrophosphate. Both pages showed out of stock when accessed. This is evidence for the species and one claw-meat product state, not a generic raw, live, cooked, frozen, drained, or whole-crab form, nor a generally reusable French product name.
- **Other Canadian packaged crab meat:** Ocean’s French product page states that its wild crab meat comes from *P. pelagicus* and lists ingredients, but the visible text gives no package mass or recipe quantity. Its `crabes bleus` wording is retained as a source-specific label only. Clover Leaf’s current French product page says its nationally available crab meat may be sourced as *Portunus* spp. from Vietnam and *P. pelagicus* from Indonesia. That supports commercial availability of both scopes but does not identify one consistent species for the broad product.
- **Measurements:** Metro’s 227 g is a package amount for that single claw-meat SKU; the listing does not state a drained mass, edible yield, number of claws, or serving equivalence. Clover Leaf shows a nutrition-panel serving of **¼ cup (55 g)** for its crab-meat product, but its sourcing statement spans genus-level *Portunus* spp. and *P. pelagicus*. That serving is not a species-wide volume-to-mass conversion, density, unit mapping, yield, or default measure. Add none of these to the conditional species row.
- **Substitutions:** No reviewed source establishes a directed conversion between *P. pelagicus* and *C. sapidus*, Dungeness crab, generic crab meat, or Jumbo Lump crab meat. No source supports a contextual recipe substitution, portion equivalence, or package yield. Add no global or contextual substitution rule.

## Recipe demand

The scan covered every path in the live `manifest.v1.json` and checked complete UTF-8 recipe JSON, ingredient names/original text, ingredient-reference IDs, and form IDs for `blue swimming crab`, `blue swimmer crab`, `blue crab`, `crabe bleu`, `crabes bleus`, `étrille bleue`, `étrille`, `crabe batailleur`, `crabe bleu nageur`, `Portunus pelagicus`, `Portunus spp.`, `swimming crab`, and the candidate reference/form IDs.

**Result: 0 of 114 recipe files and 0 of 1,123 ingredient rows match the candidate terms or IDs.** The only crab-specific recipe ingredient row remains recipe **019#8**, `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. It does not identify a crab species. The round-six candidate creates no recipe relink, ingredient form, or substitution demand.

## Sources and ID reuse

Sources were checked on 2026-10-13. Reused round-five source IDs refer to the same already-integrated evidence records and must not be duplicated in the ledger. New R6 source IDs are proposal-local and currently unallocated.

| Source ID | Source and evidence | Limits |
|---|---|---|
| Reused `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S02` | CFIA, [Fish List crab query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab). Lists *P. pelagicus* as `Blue Swimming Crab / étrille bleue`, *Portunus* spp. as `Swimming Crab` and `Crab / Crabe`, and *Necora puber* as `Velvet Swimming crab / Étrille commune`. | Official common-name/taxon labeling evidence; page states it was modified 2023-09-18. Does not establish market availability, recipe scope, or food measures. |
| Reused `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S03` | CFIA, [Fish List blue query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue). Lists the separate blue-name rows for *Callinectes sapidus* and *P. pelagicus*. | Naming and taxon scope only. |
| Reused `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S04` | CFIA, [Fish List scope and purpose](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). Describes Canadian-acceptable English/French common names, scientific names, and TSNs. | Labeling guidance; not recipe taxonomy or market evidence. |
| Reused `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S01` | OQLF, [GDT: crabe bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu). Preferred Québec `crabe bleu`, English `blue crab`, Latin *Callinectes sapidus*. | GDT page last updated 1998. It supports the *C. sapidus* collision, not current supply of *P. pelagicus*. |
| Reused `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S05` | Fisheries and Oceans Canada, [2025 eastern-Canada crab identification guide](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-12-2025-fra.pdf). Labels *C. sapidus* as `Crabe bleu`. | Confirms the neighboring *C. sapidus* name only; does not describe *P. pelagicus* products. |
| `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-S01` | Metro, Aqua Star wild crab-claw-meat product 731149113954: [English listing](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/lobster-crab-pollock/wild-crab-claw-meat/p/731149113954) and [Québec French listing](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/chair-de-pince-de-crabe-sauvage/p/731149113954). Both show 227 g; English ingredients say `BLUE SWIMMING CRAB (PORTUNUS PELAGICUS)`, while French ingredients say `CRABE BATAILLEUR (PORTUNUS PELAGICUS)`. | Both listings showed out of stock. The English page was accessible; the French page returned 403 and its indexed text was used. Package mass and French wording remain SKU-specific, not global forms or aliases. |
| `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-S02` | Ocean’s, [Chair de crabe sauvage](https://oceans.ca/fr/products/chair-de-crabe-sauvage/). Canadian-owned brand page identifies *P. pelagicus* and describes `crabes bleus`; lists the product ingredients and wild-caught trap harvest. | Manufacturer product description; no package mass in visible text. The French common wording conflicts with the OQLF-scoped `crabe bleu` and is not used as an alias. |
| `WP04-SECTIONP-BLUE-SWIMMING-CRAB-IDENTITY-20261013-R6-S03` | Clover Leaf, [Morceaux de crabe](https://www.cloverleaf.ca/fr/produits/morceaux-de-crabe-clover-leaf/). Current French page says the product is available nationally, lists nutrition at ¼ cup (55 g), and identifies sourcing as *Portunus* spp. (Vietnam) and *P. pelagicus* (Indonesia). | Product-level sourcing and serving data; it does not guarantee a specific species in a given package or establish a species-wide measure. |

## Baseline snapshot and verification

Snapshot recomputed from the shared worktree on 2026-10-13 after the visible round-five integration. Hashes cover exact bytes. The recipe corpus digest uses manifest order and hashes each recipe-relative path, a NUL byte, exact file bytes, and a trailing NUL byte.

| Artifact | Count / bytes | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,339 references / 429,152 bytes | `0c82c3f233e7d4056a39a38cf637062dac7efa2ae3cae3953e32cac96beb5021` |
| `ingredient-forms.v1.json` | 98 forms / 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates / 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,647 records; 6,265 source entries; 5,266 distinct source IDs / 6,232,586 bytes | `36a911dc6f79532bf3748c30fd03fde84f2c1ed35c420dab32ef18d68af382cf` |
| `manifest.v1.json` | 114 recipe paths / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `BundledIngredientCatalog.kt` | 587,150 bytes | `9934d4b5a64965502d52f5161ae3435aaa431c66bb8e86526836bc047aaf8c4b` |
| `package-yields.v1.json` | 1 record / 853 bytes | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| `substitution-rules.v1.json`; `contextual-substitution-rules.v1.json` | 0 rules / 3 bytes each | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |

Static review confirmed the current owner set and attached crab form, the candidate ledger record, the picker projection, the zero-demand recipe scan, and no collision for the new R6 source IDs. The proposal text was checked as UTF-8 without BOM. No app, unit, instrumentation, emulator, or application tests were run for this database-JSON-only integration, under the rule in `AGENTS.md`.
