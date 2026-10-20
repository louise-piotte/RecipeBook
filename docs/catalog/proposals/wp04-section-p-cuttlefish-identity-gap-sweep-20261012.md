# WP04 Section P — cuttlefish / seiche consumer identity gap sweep

- **Review and source access date:** 2026-10-12.
- **Scope:** the open mollusk/cephalopod candidate `cuttlefish / seiche`; active reference, form, legacy, and ledger ownership; Canadian and Québec product naming; and all manifest-listed recipes.
- **Recommendation:** promote the held candidate to one identity-only `PROTEIN` reference, `cuttlefish / seiche`, bounded to the unqualified *Sepia* cuttlefish market identity. Keep squid/calamari, octopus, named cuttlefish species, cuttlefish ink, and processed products separate.
- **Proposal status:** integrated. The held ledger candidate is promoted to one identity-only active `PROTEIN` reference; no forms, aliases, recipe links, or numeric behavior were added. See [the integration record](../batches/wp04-section-p-cuttlefish-identity-integration-20261012/README.md).

## Recommendation

The Québec and Canadian evidence now supports a narrow consumer ingredient identity. OQLF gives **seiche** as the preferred Québec term in the food-mollusc domain, with English **cuttlefish** and Latin *Sepia* sp. The current CFIA Fish List includes the same unqualified English/French pair for *Sepia* spp. and *Sepia pharaonis*, while listing other cuttlefish and bobtail-squid names separately. Current Canadian product listings independently use `cuttlefish` for food products, and a Québec grocery listing uses `boulette de seiche` for a frozen product. These sources support the named food category; they do not select a species for an unqualified recipe or establish one preparation state.

The recommendation is an identity-only row with the two supported display names and **no aliases**. Keep its taxonomic evidence in the ledger rather than turning Latin names or product-state wording into global search terms. The English alias `squid` is already owned by the active `ingredient-ref-calamari`; it must not be moved or duplicated. CFIA lists plural `Seiches` for Sepiolidae bobtail squid, so do not add `seiches` as a French plural alias.

No cuttlefish appears in the 114 bundled recipes. Recipe 023#1 asks for `140 g sliced calamari` and remains linked to the existing calamari identity; the unlinked `Cooked meat or seafood, to taste` option in recipe 093 does not choose a cephalopod. The product evidence can support a distinct picker identity without inferring recipe demand or linking either row.

## Identity-only row

| ID | Category | English display | Québec French display | Aliases | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-cuttlefish` | `PROTEIN` | **cuttlefish** | **seiche** | None | The unqualified food-mollusc name supported for *Sepia* spp. / *Sepia* sp.; no single species selected. |

The existing held ledger candidate was promoted under this same ID. No forms for fresh, frozen, whole, cleaned, uncleaned, sliced, dried, or processed cuttlefish were added; no recipe links, measures, density, unit mappings, conversion, package yield, edible yield, or substitutions were added.

## Naming and product boundaries

| Term or product | Decision |
|---|---|
| **Cuttlefish / seiche** | Use only as the two display labels above. OQLF supplies the Québec term and *Sepia* genus scope; CFIA’s generic *Sepia* entries and current Canadian food listings corroborate the market identity. Do not infer an individual species. [reused `WP04-MOLLUSKS-20261009-S10`; S01, S03–S06] |
| **Squid / calamari / calmar** | Retain the separate active `ingredient-ref-calamari` (`calamari / calmar`, English alias `squid`). The recipe's calamari line is unchanged. Neither `squid` nor `calamari` is an alias for cuttlefish. [reused `WP04-S38`; S01, S03] |
| **Cuttlefish species names** | Do not add `needle cuttlefish / seiche aiguille`, `golden cuttlefish / seiche dorée`, `Japanese spineless cuttlefish / sépia inerme japonaise`, or *Sepia pharaonis* as aliases. CFIA lists qualified species names separately; a later recipe or product request can establish whether one needs a separate row. [S01, S03] |
| **`seiches` / bobtail squid** | Do not add plural `seiches`: CFIA assigns `Bobtail squid / Seiches` to *Sepiolidae* spp., a distinct group from the proposed *Sepia* cuttlefish identity. [S01] |
| **`Sepia`** | Do not add it as an alias. One Canadian seller uses it as a product heading, while OQLF and CFIA use *Sepia* taxonomically; the supported consumer display is `cuttlefish / seiche`. [reused `WP04-MOLLUSKS-20261009-S10`; S01, S04] |
| **Cuttlefish ink / encre de seiche; dried or preserved cuttlefish** | Do not alias these to the animal identity or add product forms. Ink, drying, and preservation describe distinct products or states, none requested by the recipe bundle. |
| **Octopus / pieuvre / poulpe; cephalopod; seafood / fruits de mer** | Keep separate. The ledger already holds `ingredient-ref-octopus`; CFIA distinguishes cephalopods from the French `fruits de mer` label class. Do not use broad class or mix names as aliases. [reused `WP04-DOYS-S04` and `WP04-MOLLUSKS-20261009-S11`] |

The current DFO landings page reports Canadian commercial landings through 2024 and explains that unlisted species are grouped into “Other”; it gives squid in “Other shellfish” as an example. This dataset does not establish a cuttlefish harvest, consumer name, or species for the products below. No Canadian harvest-origin claim is made. [S02]

## Exact-key ownership and ledger state

The audit used the same search-key operations as `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It compared exact normalized keys against all active reference names and aliases, form labels and match terms, and legacy candidate names and aliases.

| Key | Exact owner / state at proposal review |
|---|---|
| `cuttlefish`, `cuttle fish`, `cuttlefishes`, `seiche`, `seiches`, `Sepia`, `Sepia sp.`, `Sepia spp.`, `cuttlefish ink`, `encre de seiche` | No exact active reference, form, or legacy-candidate owner before this integration. The accepted display names are now owned by `ingredient-ref-cuttlefish`; the remaining terms stay unallocated. |
| `squid` | Exact active owner: `ingredient-ref-calamari`, `PROTEIN`, verified; this is an English alias supported by OQLF and already accepted in the ledger. |
| `calamari`, `calmar` | Exact active owner: `ingredient-ref-calamari` as the English and French display names. No change proposed. |
| `octopus`, `pieuvre`, `poulpe` | No active reference/form/legacy owner. Existing ledger candidate `ingredient-ref-octopus` remains `needs_clarification`. |

Before integration, the ledger held `ingredient-ref-cuttlefish` as a **candidate**, with identity `needs_clarification`, measurement and substitution research `not_yet_researched`, two source entries, and an unresolved decision to hold pending recipe demand. Its prior evidence is OQLF source `WP04-MOLLUSKS-20261009-S10` and CFIA labeling source `WP04-DOYS-S04`. Integration promoted this same record to `ingredient_reference` / `verified`, appended the six new sources, and replaced its pending identity decision; no duplicate candidate was created. The adjacent `ingredient-ref-calamari` remains verified with its accepted `squid` alias; `ingredient-ref-octopus` remains held.

## Prior-work reconciliation

- The [2026-10-09 mollusk boundary review](wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md) held cuttlefish for lack of a concrete recipe or product target and accepted `squid` as an English alias on the existing calamari reference. The new Canadian product listings support the narrow consumer identity here; they do not reopen the squid decision or create a cuttlefish recipe link.
- The [cockle/coque review](wp04-cockle-coque-identity-boundary-review-20261011.md) continues to hold the unqualified bivalve name because its common-name evidence crosses species. It is unrelated to the *Sepia* cephalopod scope.
- The [preserved-seafood state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) keeps salt cod, stockfish, dried bonito, dried shrimp/scallop/oyster, named fish powders, and other preservation products separate and rejects universal preservation forms. None is a cuttlefish identity or a basis for adding dried, canned, smoked, or oil-packed cuttlefish behavior.
- The existing species/product reviews for crab meat, blue mussel, periwinkle, conch, whelk, abalone, and sea cucumber retain their own boundaries. No related row is broadened or relinked here.

## Complete bundled-recipe audit

All 114 paths in the current `manifest.v1.json`, every `ingredients[]` row (1,123 total), and the full JSON text of each recipe were scanned for `cuttlefish`, `cuttle fish`, `seiche`, *Sepia*, cuttlefish-product terms, squid/calamari variants, octopus names, and broader cephalopod phrases. **There are zero exact cuttlefish/seiche ingredient hits and zero cuttlefish/seiche full-file hits.** The only cephalopod ingredient-row hit is:

| Recipe row | Exact ingredient text | Current link and boundary |
|---|---|---|
| 023#1 | `140 g sliced calamari` | `ingredient-ref-calamari`; remains a squid/calamari request. `sliced into rings` is recipe preparation text, not a global cuttlefish form. |

Recipe 093#4 (`Cooked meat or seafood, to taste`) is an unlinked broad option, not a request for cuttlefish or any other named cephalopod. No recipe link or relink is supported.

## Refreshed package, ledger, and generated-catalog snapshot

Proposal-review snapshot re-read from the shared worktree on **2026-10-12**, before cuttlefish integration and after concurrent worktree updates. File hashes cover exact file bytes. The manifest-ordered recipe-corpus digest hashes each manifest-relative recipe path, NUL, exact file bytes, NUL.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,217 references | `ddae6e2ca49e677e775946d8e4860d8b34e045a9993feb0f850f88767202d9ac` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,520 records; 5,133 source entries; 4,196 distinct source IDs | `7e5c4d725908208bbd1814c1645fd7ba2f2f8ad95d939ae66a0d8f98af65cca4` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `BundledIngredientCatalog.kt` | 1,217 generated reference entries | `457ffd0ca375a04256b2a406a262cf9ceca6b3dec5d18416216aae57243e78a9` |

The source IDs `WP04-CUTTLEFISH-IDENTITY-20261012-S01` through `S06` were checked absent from the shared research ledger and existing proposal/batch files before assignment, then added to the existing candidate record at integration. The previously recorded OQLF and CFIA-labeling sources listed above were reused, not duplicated as new source IDs.

## Sources

All new sources were accessed on 2026-10-12. Source IDs are unique to this proposal.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-CUTTLEFISH-IDENTITY-20261012-S01** | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) (search scientific name `Sepia`) | Lists *Sepia pharaonis* and *Sepia* spp. as **Cuttlefish / Seiche**; separately lists qualified *Sepia* species and *Sepiella japonica*; lists *Sepiolidae* spp. as **Bobtail squid / Seiches**. This is Canadian fish-label common-name evidence, not proof of one species behind a recipe. The current list is dated 2023-09-18. |
| **WP04-CUTTLEFISH-IDENTITY-20261012-S02** | Fisheries and Oceans Canada, [Seafisheries landings dashboard](https://www.dfo-mpo.gc.ca/stats/commercial/sea-maritimes-eng.htm) | Current page covers 1990–2024 commercial landings and states that species not listed are grouped in “Other,” using squid in “Other shellfish” as an example. It does not identify consumer cuttlefish naming or establish cuttlefish as a Canadian catch. Page modified 2026-09-25. |
| **WP04-CUTTLEFISH-IDENTITY-20261012-S03** | Fresh Water Foods Inc. (Richmond Hill, Ontario), [Cephalopods](https://freshwaterfood.ca/cephalopods.html) | Current Canadian importer lists *Sepia pharaonis* cuttlefish (whole-cleaned, fillets, baby, IQF/block) separately from squid and octopus; its baby cuttlefish/squid offer identifies *Sepia* spp. and *Loligo* spp. separately. Wholesale availability and product specifications do not establish a global form or recipe mapping. |
| **WP04-CUTTLEFISH-IDENTITY-20261012-S04** | Seafood Depot (Vaughan, Ontario), [Cuttlefish](https://www.seafooddepot.ca/product-cuttlefish) | Current product page uses `Cuttlefish` / `Sepia`, lists whole cleaned or uncleaned and fresh/frozen product from Thailand and Italy, and describes it as similar to squid. It does not identify the species; its `Sepia` heading is not proposed as a global alias. |
| **WP04-CUTTLEFISH-IDENTITY-20261012-S05** | Azuma Foods (Canada), [Osushiya Mongo](https://azumafoods.ca/products/osushiya-mongo/) | Current product page names cuttlefish and `Sliced Cuttlefish (Seiche tranché)`, gives frozen package storage and a product ingredient list. It supports a Canadian French product use, not an unprocessed or generic frozen form. |
| **WP04-CUTTLEFISH-IDENTITY-20261012-S06** | Metro Québec, [Boulette de seiche surgelée](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/boulette-de-seiche-surgelee/p/821964020305) | Consumer listing names a 180 g frozen cuttlefish ball; the page reported it out of stock when reviewed. The prepared product supports Québec consumer wording but is not a plain cuttlefish form or species declaration. |

Reused ledger sources: `WP04-MOLLUSKS-20261009-S10` (OQLF, [`seiche`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198916/seiche)); `WP04-DOYS-S04` (CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish)); `WP04-S38` (OQLF, [`calmar`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar)); and `WP04-MOLLUSKS-20261009-S11` (OQLF, [`pieuvre`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre)).

## Remaining Section P gaps

This proposal advances only cuttlefish/seiche and leaves the broader checklist open. Other mollusk/cephalopod work remains separately scoped: generic lobster, crayfish, langoustine, clam, fresh oyster, generic/fresh scallop, octopus, and the held unqualified cockle/coque, conch, and whelk boundaries. The blue-mussel and periwinkle identities, crab-meat identity, squid alias, and recent preserved-seafood decisions remain as already reviewed. Finfish species and recipe boundaries, roe, fish powders, fish balls/surimi, regional seafood names, and preservation/product-state questions remain separate Section P work.

No test or emulator check was run because the integration only adds database JSON data and regenerates its catalog index under the current `AGENTS.md` rule.
