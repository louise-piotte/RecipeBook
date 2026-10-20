# WP04 Section P — generic clam / palourde Québec market boundary review

- **Review and source access date:** 2026-10-12.
- **Scope:** the held generic `ingredient-ref-clam` candidate; active reference, form, and legacy exact-key ownership; current Canadian and Québec common-name/product evidence; and all manifest-listed recipes.
- **Recommendation:** keep the generic clam candidate on hold. The available Canadian taxonomy and current Québec market evidence still do not support one species-stable French consumer label, and no bundled recipe requests a clam product.
- **Proposal status:** Hold integrated into the Section P checklist, roadmap, and workflow on 2026-10-12. The existing candidate remains unchanged; see [hold README](../batches/wp04-section-p-clam-hold-integration-20261012/README.md).

## Integration status (2026-10-12)

Root accepted the hold on the existing `ingredient-ref-clam` candidate. No active `clam / palourde` reference, alias, form, or new ledger record was added; the existing unresolved candidate and its three source records remain unchanged. The checklist, roadmap, and workflow now link to the [hold README](../batches/wp04-section-p-clam-hold-integration-20261012/README.md). The package snapshot and exact-key audit below are from this proposal review.

## Recommendation

Do not promote the unqualified `clam` candidate or assign it `palourde` as a French display. CFIA's Fish List applies English `Clam` to several taxa whose French common names differ: *Mya arenaria* is also `Mye`, *Spisula solidissima* is `Mactre d'Amérique`, some *Meretrix* species are `Palourde`, *Siliqua patula* is associated with `Couteau de l'Atlantique`, and *Mercenaria mercenaria* has several English names including `Clam`. DFO's current Canadian bivalve identification guide lists many harvested clam species and uses different French names for them. It even calls *Arctica islandica* `Palourde américaine`, while OQLF reserves that preferred Québec food-mollusc name for *Mercenaria mercenaria*. The sources therefore do not converge on a single generic bilingual identity.

OQLF's food-mollusc entries identify **mye** for *Mya arenaria* and **palourde américaine** for *Mercenaria mercenaria*. Both entries note that broad alternatives such as `clam`, `coque`, or `palourde` were not retained for Québec fish-product marketing to avoid consumer-label confusion. A current Montréal fish-shop collection uses the broader retail heading `Palourdes` while listing Littleneck, Pasta, Savoury, Cherrystone, New Zealand `coques`, razor clams, and species-specific `Myes` separately. This documents a real product-category umbrella, but it does not identify one recipe-stable ingredient or a single French display.

All 114 manifest-listed recipes were scanned. There is no clam, palourde, mye, quahog, or related clam ingredient row. Recipe 093#4 says only `Cooked meat or seafood, to taste`; it does not identify clams. Keep the hold on the existing candidate until a recipe or requested product names the intended clam species or market type. Do not add broad aliases, forms, measurements, or substitutions from category or taxonomic evidence.

## Current candidate and decision

| Candidate ID | Ledger state | Recommendation |
|---|---|---|
| `ingredient-ref-clam` | `recordType: candidate`; `identityState: needs_clarification`; measurement and substitution research are `not_yet_researched`; three existing source entries | Keep unresolved. Do not create an active `clam / palourde` reference or a duplicate candidate. Reopen if a recipe or product request establishes which market name and product it means. |

The existing ledger decision holds pending a product or recipe target, because Québec commercial terminology distinguishes clam species and names. Its sources are the OQLF entries `WP04-MOLLUSKS-20261009-S07` and `WP04-MOLLUSKS-20261009-S08`, plus DFO's Canadian bivalve identification page `WP04-MOLLUSKS-20261009-S14`. This review adds current CFIA and retailer evidence in this proposal only; it does not append sources or alter the ledger decision.

## Naming and product boundaries

| Term or product | Decision |
|---|---|
| **Generic `clam / clams`** | Keep unallocated. CFIA uses `Clam` for multiple taxa and pairs those entries with different French names. The unqualified English term does not identify one species or Québec market label. [S01; reused `WP04-MOLLUSKS-20261009-S07`–`S08`] |
| **`palourde / palourdes`** | Do not use as a universal French display or global alias. OQLF's species-specific entries restrict the normalized Québec fish-market terms, while the current retailer's `Palourdes` collection contains several product and species names. The retail aisle heading is useful evidence of broad market grouping, not of one ingredient identity. [S02–S03; reused `WP04-MOLLUSKS-20261009-S07`–`S08`] |
| **Mye / soft-shell clam; palourde américaine / hard-shell clam** | Keep the terms scoped to their named species. OQLF identifies *Mya arenaria* as `mye` and *Mercenaria mercenaria* as `palourde américaine`; it says generic alternatives are not retained for Québec commercial fish labeling. DFO's French guide also uses `Palourde américaine` for *Arctica islandica*, further cautioning against a species-free alias. [S02; reused `WP04-MOLLUSKS-20261009-S07`–`S08`] |
| **Razor clam / couteau** | Do not use bare `couteau` as an alias. CFIA pairs a clam name with `Couteau de l'Atlantique` for *Siliqua patula*, while DFO's French guide calls *Siliqua patula* `Couteau`; unrelated recipe instructions use `couteau` for the kitchen tool. It is a separate species/name boundary, not a generic clam term. [S01–S02] |
| **Cockle / coque** | Keep outside this review and on its separate unresolved candidate. OQLF's use of `coque` as a contextual term for specific clams does not make it interchangeable with the held generic cockle/coque boundary. [reused `WP04-MOLLUSKS-20261009-S07`–`S08`] |
| **Littleneck, Manila, quahog, mactres, palourdes couteaux, chowder, breaded or canned products** | Keep product and species names separate. The DFO and retail listings show different named products; none is requested by a bundled recipe. No global aliases, forms, recipe links, or numeric behavior follow from these listings. [S01–S03] |
| **Other shellfish, seafood, or `fruits de mer`** | Keep as broad categories, not generic clam aliases. This review does not change the separate crab, mussel, oyster, scallop, cockle, squid, cuttlefish, or octopus decisions. |

## Exact-key ownership and recipe audit

The exact-key audit used the same operations as `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It compared exact normalized phrases in active reference names and aliases, form labels and match terms, and legacy-candidate names and aliases. Partial phrase and substring matches were not counted as exact owners.

| Exact query keys | Active exact owner / state at proposal review |
|---|---|
| `clam`, `clams`, `clam meat`, `clam chowder`, `palourde`, `palourdes`, `mye`, `myes`, `soft shell clam`, `hard shell clam`, `quahog`, `coque`, `coques`, `littleneck`, `manila clam`, `razor clam`, `mactre d'amerique`, `couteau`, *Mya arenaria*, and *Mercenaria mercenaria* | No exact active reference, form, or legacy-candidate owner. `ingredient-ref-clam` appears only as the held ledger candidate. |
| `cockle`, `coque` | No active exact owner; the distinct `ingredient-ref-cockle` remains an unresolved ledger candidate. It is not merged with clam. |
| `couteau` in recipe text | No exact active ingredient owner. Recipe full-text matches are utensil instructions, not ingredient rows or product requests. |

The audit followed every path in `manifest.v1.json`, parsed all 1,123 `ingredients[]` rows across 114 recipes, and scanned each full recipe JSON for `clam`, `palourde`, `mye`, `quahog`, `coque`, `couteau`, clam species names, and product wording. **Zero ingredient rows matched any clam product or species term.** The full recipe files include nine uses of `couteau` in French cooking instructions for a kitchen knife; none is in an ingredient row. The unlinked broad seafood option in recipe 093#4 is not a clam request.

## Refreshed package, ledger, and generated-catalog snapshot

Proposal-review snapshot read from the shared worktree on **2026-10-12**. Hashes cover exact file bytes. The recipe-corpus digest hashes sorted recipe basenames, NUL, exact file bytes, NUL.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,220 references | `fd9b020e6938097508e264c0674262f5cae43579744fdc204dce7adbb07b7f2c` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,521 records; 5,150 source entries; 4,213 distinct source IDs | `165c9edc5ecd7876136f93db01d00f359781057ff7da6f664eed474138d46be9` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2` |
| `BundledIngredientCatalog.kt` | 1,220 generated reference entries | `66b567a40639ffa2ab5139dd728c535249f644d8bf61050587fee14632aa16f0` |

The three proposal-local source IDs `WP04-CLAM-QUEBEC-BOUNDARY-20261012-S01` through `S03` were checked absent from the shared research ledger and existing catalog proposal/batch files before assignment. Nothing from these sources was added to the ledger.

## Sources

All new sources were accessed on 2026-10-12. The three source IDs below are unique to this proposal.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-CLAM-QUEBEC-BOUNDARY-20261012-S01** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Current lookup entries include *Mya arenaria* (`Soft-shell Clam`, `Clam` / `Mye`), *Mercenaria mercenaria* (`Clam`, `Hard-shell Clam`, `Quahog`, and other English names), *Spisula solidissima* (`Clam` / `Mactre d'Amérique`), *Meretrix* species (`Clam` / `Palourde`), and *Siliqua patula* (`Clam` / `Couteau de l'Atlantique`). The common-name entries cross species and do not select one French consumer display. |
| **WP04-CLAM-QUEBEC-BOUNDARY-20261012-S02** | Fisheries and Oceans Canada, [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm) | Current French identification page lists many Canadian harvested palourde/clam species, including mye, mactres, palourdes, couteau, and clovisse. It labels *Arctica islandica* `Palourde américaine`, unlike OQLF's species-specific `palourde américaine` entry for *Mercenaria mercenaria*. This is a naming comparison, not an ingredient mapping or a claim that the DFO taxonomic page is a consumer label standard. |
| **WP04-CLAM-QUEBEC-BOUNDARY-20261012-S03** | Poissonnerie La Mer (Montréal), [Palourdes collection in French](https://www.lamer.ca/collections/palourdes) / [English](https://www.lamer.ca/en/collections/palourdes) | Current retailer collection groups live clams/palourdes and lists Littleneck, Pasta, Savoury, Cherrystone, New Zealand coques, razor clams, myes, chowder, breaded clams, and canned Stimpson's clams. It shows the range of products under a broad retail category; item availability varies and no specific recipe target is established. |

Reused ledger sources: `WP04-MOLLUSKS-20261009-S07` (OQLF, [palourde américaine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198879/palourde-americaine)); `WP04-MOLLUSKS-20261009-S08` (OQLF, [mye (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198878/mye)); and `WP04-MOLLUSKS-20261009-S14` (DFO, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm)). These existing source IDs are reused, not duplicated as new proposal-local sources.

No tests or emulator checks were run because the accepted hold changes documentation only and adds no database or runtime data.
