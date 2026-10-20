# WP04 Section P — swordfish / espadon identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, naming, picker, recipe-demand, and measurement review.
- **Disposition:** Recommend one identity-only `PROTEIN` reference for **swordfish / espadon** (*Xiphias gladius*). Add no aliases, forms, density, unit mappings, conversions, yields, substitutions, or recipe links. Keep other billfish, tuna, and processed seafood separate.
- **Worktree scope:** This proposal file only. No catalog or ledger JSON, recipe, plan, roadmap, generated file, or other file was changed. No tests or emulator checks were run.

## Why this is a distinct open gap

The live Section P plan still calls for broader fish and regional-seafood review. A targeted repository search of the plan, proposal and batch files, live ingredient references and forms, legacy candidates, research ledger, and bundled recipes found no swordfish/espadon identity review or allocation. This is separate from existing finfish species reviews and from the open fish-powder, fish-ball, and surimi product boundaries.

The Québec terminology authority identifies *Xiphias gladius* as a food fish with commercial potential in Québec. The Canadian Fish List and Fisheries and Oceans Canada pair the species with the same English and French names. Current Metro fish guidance includes swordfish among the varieties at its Québec counter; federal import records also list Montréal and Dorval importers for fresh/chilled swordfish. The evidence supports a distinct, locally relevant fish identity. It does not establish a bundled-recipe request or a transferable kitchen measure.

## Bounded recommendation

| Candidate ID | Category | English display | fr-CA display | Aliases | Species scope |
|---|---|---|---|---|---|
| `ingredient-ref-swordfish` | `PROTEIN` | **swordfish** | **espadon** | None | *Xiphias gladius* |

Use the OQLF preferred French term `espadon`. The OQLF notes that `poisson-sabre` and `poisson-épée` are used in some contexts but were not retained by the Committee on Fish Products Terminology. Do not activate them as catalog aliases. Do not add `broadbill`, scientific nomenclature, generic `billfish`, or source-language translations as aliases; the reviewed Canadian and Québec naming authorities already supply a sufficient bilingual pair.

Keep swordfish separate from marlin, sailfish, tuna, and other billfish. The fact that DFO says swordfish resembles tuna is descriptive, not an identity or substitution rule. Keep roe, fish balls, surimi, powders, stock, and other processed fish products outside this species reference.

## Current catalog and exact-name ownership

At the review snapshot, the live package contains **1,288 references**, **98 forms**, and **114 manifest-listed recipes / 1,123 ingredient rows**; the legacy file contains **64 candidates** and the research ledger **1,596 records**. Exact-key checks applied the normalization in `IngredientSearch.kt`—lowercase, Unicode compatibility normalization, accent removal, punctuation/space normalization, and the existing ligature folds—to active reference names/aliases, form labels/match terms, legacy names/aliases/IDs, and ledger record IDs.

| Candidate key | Active reference owner | Active form owner | Legacy owner | Ledger record-ID owner |
|---|---|---|---|---|
| `swordfish` | None | None | None | None |
| `espadon` | None | None | None | None |
| `poisson-sabre` / `poisson-épée` | None | None | None | None |
| `Xiphias gladius` | None | None | None | None |
| `ingredient-ref-swordfish` | None | None | None | None |

No `WP04-SWORDFISH-ESPA-IDENTITY-20261012-*` source IDs existed in the ledger or repository before this proposal. The nearest active fish rows remain distinct: Atlantic herring, swordfish-adjacent tunas and mackerels, fish balls, fish stock, Bonga powder, and other species identities. None owns `swordfish` or `espadon`.

### Picker behavior

`IngredientReferenceSearchIndex` first returns complete normalized word-phrase matches across reference names, aliases, and attached form terms, and falls back to substring matching only if no complete phrase matches.

- Today, `swordfish`, `espadon`, `poisson-sabre`, `poisson-épée`, and `Xiphias gladius` return no active identity.
- Adding only the proposed display pair makes `swordfish` and `espadon` return `ingredient-ref-swordfish`.
- Today, the broad English query `fish` returns four rows: Bonga dried fish powder, fish balls, fish sauce, and fish stock. The French query `poisson` returns seven rows, including Bonga powder, fish balls, fish stock, and regional fish pastes. The proposed one-word displays do not add a whole-word `fish` or `poisson` match, and the existing complete-phrase results prevent substring fallback from changing those broad result sets.
- Do not add `poisson` or `fish` as aliases. Do not add the unretained `poisson-sabre` / `poisson-épée` spellings or scientific name as search terms.

## Full bundled-recipe audit

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned with normalized whole-phrase matching. The scan covered `swordfish`, `sword fish`, `espadon`, `poisson sabre`, `poisson épée`, *Xiphias gladius*, `broadbill`, and `broad bill`; it found **zero matching recipe files and zero matching ingredient rows**. No exact recipe demand or recipe link is supported. Other fish recipes and generic “seafood” wording do not identify swordfish.

## Measurements, density, and substitutions

Health Canada’s Canadian Nutrient File (CNF) lists **Fish, swordfish, raw / Poisson, espadon, cru**, food code 3075. It reports a source-specific piece of 11 × 5 × 2 cm as **115.7 g**, a **90 g** food-guide serving, and 100 g edible portion = 100 g. The same page shows 0% total refuse. These are published CNF observations for this raw food entry, not a standard steak size, recipe portion, whole-fish yield, or household-volume conversion. If integration records the CNF evidence in the ledger, retain the dimensions, food state, and source basis with the observation; do not activate a general `piece` measure or derive yield from the refuse field.

No reviewed source supports a swordfish-specific density or volume-to-mass mapping. Leave `defaultDensity` null and `unitMappings` empty. Do not make the 90 g nutrition-guide serving a recipe serving default.

No bundled recipe or reviewed source establishes swordfish as a replacement for tuna, marlin, mahi-mahi, or another fish. Similar texture, shared grilling use, and generic fish-cooking advice do not establish equal culinary role, quantity, or method. Record no supported substitute; add no global or contextual substitution rule.

## Recommended integration delta

1. Add `ingredient-ref-swordfish` as a `PROTEIN` reference with `nameEn: "swordfish"`, `nameFr: "espadon"`, empty alias arrays, null `defaultDensity`, and empty `unitMappings`.
2. Add a verified ledger record scoped to *Xiphias gladius*. Preserve CNF’s raw swordfish portion facts only as source-specific observations if the measurement ledger is updated; do not turn them into active measures, densities, mappings, or yields. Record no supported substitute.
3. Leave all forms, recipe links, other fish identities, fish powders, fish balls, surimi boundaries, and substitution rules unchanged.

## Sources

Online sources were accessed on **2026-10-12**. The new source IDs below were checked against the live ledger and repository before this proposal was written.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S01** | Office québécois de la langue française, [espadon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198924/espadon) | Identifies the edible species *Xiphias gladius*, gives `swordfish` as English, prefers `espadon`, and calls the fish commercially relevant in Québec. Notes that `poisson-sabre` and `poisson-épée` were not retained by the fish-products terminology committee. Terminology and identity evidence, not a measure or recipe. |
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S02** | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/redirect-cfia-fish-list) | The live Fish List entry pairs *Xiphias gladius* with `Swordfish / Espadon` and flags the species as subject to environmental contaminants. The name entry supports the bilingual identity; the hazard note is not used here to make a consumption or recipe claim. |
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S03** | Fisheries and Oceans Canada, [Swordfish species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/swordfish-espadon-eng.html) and [Espadon profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/swordfish-espadon-fra.html) | Paired government pages identify *Xiphias gladius* and describe its Atlantic distribution, including Canadian waters. They establish species context, not a recipe portion or food substitution. |
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S04** | Metro Québec, [Savoureux festin de la mer](https://api.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/savoureux-festin-la-mer) | Current French-language fish-counter guidance lists espadon among fresh or frozen varieties and names grilled swordfish as a use. This supports Québec consumer wording and culinary-food status, not inventory at every store or a standardized portion. |
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S05** | Metro banners, [Anchors Aweigh! Discover Exotic Fish](https://www.bannieresdeproximite.ca/en/products-to-discover/fish-seafood/advice-from-my-fishmonger/anchors-aweigh-discover-exotic-fish) | Current English-language Québec fish-counter guidance names swordfish and reports that most swordfish sold in Québec comes from western Atlantic stocks. Retail guidance, not species identification for any individual package. |
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S06** | Innovation, Science and Economic Development Canada, [Canadian Importers Database — fresh/chilled swordfish, HS 030247](https://ised-isde.canada.ca/app/ixb/cid-bdic/productReportHS10.html?hsCode=0302470000) | The 2024 major-importer list includes firms in Montréal and Dorval for fresh/chilled swordfish. Importer data supports Canadian market presence but does not prove retail availability or end use. |
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S07** | Health Canada, [Canadian Nutrient File serving sizes, food code 3075](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3075) | Lists the bilingual raw swordfish food and the 115.7 g dimensioned piece, 90 g food-guide serving, edible-portion basis, and 0% total refuse. These are CNF-specific observations only; not recipe defaults, density, active yield, or a general steak-size rule. |
| **WP04-SWORDFISH-ESPA-IDENTITY-20261012-S08** | Pearlmark Foods, [Swordfish](https://www.pearlmarkfoods.com/our-products/swordfish) | Current Canadian distributor page names *Xiphias gladius* and lists steak/loin products and case sizes. Product and package details do not establish household measures or conversions. |

## Refreshed snapshot

The proposal-only snapshot is 1,288 active references, 98 forms, 64 legacy candidates, 1,596 ledger records, and 114 bundled recipes / 1,123 ingredient rows. No test or emulator run is applicable to this research-only proposal.
