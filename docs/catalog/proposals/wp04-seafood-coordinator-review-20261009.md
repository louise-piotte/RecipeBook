# WP04 Section P — seafood coordinator gap review

- **Packet type:** proposal-only coordinator audit; no canonical catalog, ledger, recipe, plan, roadmap, generated file, or test was changed.
- **Review date:** 2026-10-09.
- **Scope:** remaining finfish, shellfish, prepared seafood, and regional aquatic protein gaps after the existing WP04 reviews. Identity, product state, measurement, and substitution findings are kept separate.
- **Disposition:** advance two identity-only regional candidates—Arctic char and American eel—plus a narrow crab-alias cleanup. Keep surimi and fish-ball product scope open until a recipe or exact product label creates a concrete target. Section P remains open.

## Prior work and scope boundary

This audit read the global ingredient-catalog plan, the current WP04 proposal packets, the earlier `protein-dairy-identities.md` packet, and the North American cuisine gap sweep before screening candidates. It does not reopen already reviewed topics:

| Earlier work | Current disposition used here |
|---|---|
| Dried shrimp / dried scallop, dried oyster, salt cod / stockfish, dried bonito / katsuobushi | Integrated identities. Keep these products separate from fresh/cooked shellfish, generic fish, stock, and one another. No new forms, measures, or substitutes are proposed. |
| Tobiko / masago and neighboring roe | Existing proposal remains proposal-only. It found no matching bundled recipe row. Keep loose roe, salmon roe / ikura, caviar, sea-urchin gonads / uni, and cured roe products distinct; no roe identity is advanced here. |
| Bottarga / poutargue | Coordinator recheck deferred a row because the corpus has no roe recipe. No repeat bottarga recommendation is made. |
| Existing WP04 protein packet | Its live seafood identities are calamari, jumbo lump crab meat, salmon fillets, and tuna. It already flags broad salmon/tuna species scope and the over-broad `crab meat` alias. |
| WP06 North American cuisine sweep | Already routed Arctic char and eel to WP04. This packet supplies the bounded WP04 identity and product review rather than creating duplicate regional candidates. Parks Canada's eel source is reused as `WP06-NA-CUISINE-20261009-S13`. |

The high-level P checklist remains broader than these decisions: named finfish, fresh shellfish, molluscs, preservation products, fish powder, fish balls, surimi, and regionally used aquatic foods still need recipe-led, source-specific review.

## Refreshed audit snapshot

Hashes were refreshed from the live worktree while preparing this review. The recipe-corpus hash is SHA-256 over recipe files sorted by basename, with each basename, NUL byte, exact file bytes, and NUL byte added in order.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 512 references | `3c84c47314c63fd5d5e91d2aa00ec204a3f16f9e4e068990097b2a71316e8497` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 32 forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `docs/catalog/legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| `docs/catalog/research-ledger.v1.json` | 692 records | `3aeff6dd9e43422aee43f450fda6a3de8eb464458757366ebe47de2a1b3eb384` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 recipes / 1,123 ingredient rows | `c8dd5e5aa0d0a22a82fac7ee53b850580fad02687dca99a75e5784f50faabf0b` |

## Current catalog and recipe audit

The live reference scan found these aquatic or adjacent entries:

- `PROTEIN`: calamari; dried bonito; dried oyster; dried scallop; dried shrimp; jumbo lump crab meat; salmon fillets; salt cod; stockfish; tuna.
- Other categories: fish sauce and Kapi are `SAUCE_AND_CONDIMENT`; oyster sauce and vegan oyster sauce are `SAUCE_AND_CONDIMENT`; Hondashi is `STOCK_AND_BROTH`.
- No one of the 32 active forms describes seafood. The only aquatic-sounding legacy hit is an oyster-sauce condiment candidate; there is no legacy seafood-protein identity.
- Exact normalized-key checks found no active reference, form, or legacy candidate for Arctic char / Arctic charr / omble chevalier; American eel / anguille; surimi; fish balls; or imitation crab. The proposed eel and char names also had no exact match in the 1,123 recipe rows. `crab meat` is the exception: it is an active alias on jumbo lump crab meat.

Every `originalText` and `ingredientName` field in all 1,123 rows was scanned. The seafood-related hits were:

| Recipe / row | Source ingredient text | Current interpretation |
|---|---|---|
| 019, row 8 | `1 lb jumbo lump crab meat` | Linked to `ingredient-ref-jumbo-lump-crab-meat`. The recipe is grade-specific; the active generic alias `crab meat` discards that scope. |
| 023, row 1 | `140 g sliced calamari` | Linked to `ingredient-ref-calamari`. `Sliced` is this recipe's cut instruction, not evidence for a global seafood form or species. |
| 077, row 10 | `675 g salmon fillets without skin, cut into cubes` | Linked to `ingredient-ref-salmon-fillets-without-skin`. Preserve the line's amount and skin/cut wording; it does not identify a salmon species or justify an active cube form. |
| 093, row 4 | `Cooked meat or seafood, to taste` | Unlinked generic option with no amount or unit. It is not enough to select a seafood identity. |
| 093, row 6 | `2 tbsp fish sauce` | Linked condiment, outside WP04 protein coverage. |
| 095, row 5 | `1 tbsp fish sauce` | Linked condiment, outside WP04 protein coverage. |
| 111, row 1 | `1 tuna steak` | Linked to broad `tuna`; a single count does not identify species, weight, cut yield, or a form conversion. |

No roe, eel, Arctic char, fresh shrimp, fish balls, surimi, imitation crab, stockfish, dried-seafood, or other smoked/canned fish line appears in the bundled recipe fields. The two fish-sauce rows remain WP05 condiment lines, not fish-protein demand.

## Bounded recommendations

### 1. Advance Arctic char / omble chevalier as an identity only

Recommend one `PROTEIN` identity with EN display **Arctic char** and fr-CA display **omble chevalier**. OQLF maps the species name *Salvelinus alpinus* to English `Arctic char` and identifies `omble chevalier` as the preferred Québec term; its entry says `omble de l’Arctique` was not retained by the fish-product terminology committee [WP04-SEA-GAP-S01]. DFO identifies the same species, notes its resemblance to salmon and trout, and documents its northern Canadian range and commercial importance [WP04-SEA-GAP-S02]. Similarity and market positioning do not make it a salmon/trout synonym or general replacement.

Keep aliases narrow: `Arctic charr` is directly listed by OQLF as an English equivalent. Omit bare `char` / `charr` to preserve the explicit species scope; CFIA recommends including the species name for single-species fish products [existing `WP04-DOYS-S04`]. Do not add `salmon`, `trout`, or the rejected `omble de l’Arctique` wording. The candidate names have no exact normalized collision in the active references, forms, or legacy list.

Identity does not settle forms. A DFO Cambridge Bay fishery plan describes product presentations including dressed whole fresh/frozen fish, headless-and-tailless fish, fillets, smoked/sliced fillets, confit, and a product called `charqui` [WP04-SEA-GAP-S05]. These market presentations are not a universal recipe form set; do not add them as aliases or conversions. In particular, the plan's product wording is not grounds to merge Arctic char with the existing camelid `charqui` identity. No bundled amount is available. DFO biological size/weight ranges are not edible-portion data, density, or a kitchen conversion. No substitution rule is supported; a market description of char as an alternative to farmed salmon is not recipe substitution evidence.

### 2. Advance American eel / anguille as an identity only

Recommend one species-scoped `PROTEIN` identity with EN display **American eel** and fr-CA display **anguille**. OQLF normalizes `anguille` in Québec and explicitly maps it to American eel, *Anguilla rostrata*; `anguille américaine` is labelled France/Europe in that entry [WP04-SEA-GAP-S03]. DFO's Maritimes assessment identifies American eel in waters including the Bras d’Or Lakes [WP04-SEA-GAP-S04], which grounds the regional eel in Parks Canada's Cape Breton recipe. Preserve the source region; do not add a global bare `eel` alias that could select another eel product or an electric eel.

Parks Canada's chef-tested Eel Stew describes eels of the Bras d’Or Lakes in a Mi’kmaq regional context. Its source recipe lists `2 eels`, skinned, at 4½ lb / 2 kg, or an alternative 3½ lb / 1.5 kg of halibut, cod, or mackerel fillet. Those are quantities for this single recipe, without a stated serving basis, not average eel weight or a general count-to-mass conversion [reused `WP06-NA-CUISINE-20261009-S13`]. The page notes that eel was hard to find and often sold precooked and smoked; that availability note is not a default eel form or a universal product specification.

The Parks source supports one recipe-specific adaptation: it used halibut instead of eel and lists cod or mackerel fillet as alternatives for this stew. If recorded, keep that observation scoped to this Eel Stew and its source quantities. It does not support a general eel-to-fish substitution, a preservation/cooking equivalence, or a Mi’kmaq-endorsed substitute. No eel measure, form, density, or global/context-free substitution should be activated from it.

### 3. Remove the unqualified `crab meat` alias from jumbo lump crab meat

The live `ingredient-ref-jumbo-lump-crab-meat` row has the alias `crab meat`, while its only bundled recipe match explicitly requests `jumbo lump crab meat`. Recommend removing the broad alias from the jumbo-lump reference. Do not add a generic crab-meat identity unless a recipe or product source needs that broader grade. This is a scope correction, not a new seafood row.

### 4. Keep surimi and fish balls as product-boundary work, not one seafood identity

CFIA describes surimi as a paste made from highly refined minced fish. Fish products made from surimi use the name by which the food is generally known, with descriptors such as roll or cake; products shaped/flavoured to resemble crab, shrimp, or scallop must make their imitation nature clear [existing ledger source `WP04-DOYS-S04`]. This supports distinctions among the fish paste base, a finished surimi product, imitation crab, and an actual crab-meat request. It does not make `surimi`, `fish ball`, `imitation crab`, `crab stick`, and `crab meat` synonyms.

No such terms occur in the current recipe rows or catalog. Defer a global fish-ball identity and any surimi form/alias until an exact recipe or product label establishes its fish composition and finished product name. No amount, conversion, or substitution is proposed.

## Genuine open terminology and product scope

- The existing broad `salmon fillets` and `tuna` references still do not choose a species. Keep those recipe-linked rows as written; use the CFIA Fish List for future species-specific Canadian common names. Do not backfill a species from culinary context alone.
- The only shellfish recipe demand beyond calamari is specifically jumbo lump crab. Generic shrimp/prawn, crab, lobster/crayfish, mussel, clam, oyster, and scallop identities are not supplied by their dried-product rows. Keep dried products distinct; do not infer same-species forms before base identity and product scope are reviewed.
- Do not create a generic `seafood` ↔ `fruits de mer` identity or alias. CFIA distinguishes French `fruits de mer` (qualifying marine invertebrates) from `produits de la mer` / `produits de la pêche`, while English `seafood` can include fish, squid, octopus, and cuttlefish [existing `WP04-DOYS-S04`].
- The Section P preservation checklist remains open for smoked, salted, dried, canned, oil- or water-packed, and fermented aquatic products, plus fish powder, fish balls, and surimi. A preservation or grinding adjective does not establish one shared product identity or a form relation across species.
- Sea urchin / uni, abalone, conch, whelk, sea cucumber, salmon roe, caviar, and other regional aquatic foods remain separate future identity work. The roe packet's sea-urchin boundary says its edible portion is gonad tissue, not fish roe; it does not establish a broader sea-urchin food identity.
- Continue regional species naming with community and Québec terminology review when recipes require it. The two candidates here add no Indigenous-language aliases and do not generalize one region's foods to other communities.

## Source register and ID audit

All online sources below were accessed 2026-10-09. New IDs use the checked-unique `WP04-SEA-GAP-20261009` prefix; the CFIA labelling source reuses `WP04-DOYS-S04`, and Parks Canada's eel recipe reuses the existing WP06 source ID rather than duplicating it.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SEA-GAP-20261009-S01** | OQLF GDT, [omble chevalier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198861/omble-chevalier) (updated 2011) | Preferred Québec French term, English equivalents, and species *Salvelinus alpinus*. Says `omble de l’Arctique` was not retained by the fish-product terminology committee. Terminology evidence, not a recipe or product-form standard. |
| **WP04-SEA-GAP-20261009-S02** | Fisheries and Oceans Canada, [Omble chevalier (*Salvelinus alpinus*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-char-omble-chevalier-fra.html) (modified 2025-07-04) | Species profile, northern Canadian distribution, similarities to salmon/trout, and commercial/food importance. Biological description does not define edible yield, recipe measures, or substitutions. |
| **WP04-SEA-GAP-20261009-S03** | OQLF GDT, [anguille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199945/anguille) (updated 2011) | Normalized Québec `anguille` maps to American eel, *Anguilla rostrata*; marks `anguille américaine` as France/Europe. Terminology evidence only. |
| **WP04-SEA-GAP-20261009-S04** | Fisheries and Oceans Canada, [2010 status of American eel (*Anguilla rostrata*) in Maritimes Region](https://waves-vagues.dfo-mpo.gc.ca/Library/348251.pdf) | Identifies American eel in Maritime Region waters, including Bras d’Or Lakes drainages. Older regional fisheries assessment; used to ground species/region, not present-day supply or a food label. |
| **WP04-SEA-GAP-20261009-S05** | Fisheries and Oceans Canada, [Cambridge Bay Arctic Char Commercial Fishery integrated management plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/arctic-char-omble-chev/arctic-char-omble-chev-fra.html) | Lists historical commercial product presentations for Arctic char. Supports product-state scope only; its commercial categories and historical market data are not global culinary forms or conversion evidence. |
| **Existing WP06-NA-CUISINE-20261009-S13** | Parks Canada, [Eel Stew](https://parks.canada.ca/culture/gourmand-gourmet/recette-recipe80) (modified 2024-05-29) | Cape Breton/Bras d’Or Lakes recipe context, printed eel and alternate-fillet quantities, and one chef-tested adaptation. Not a general quantity or a community-endorsed/general substitution rule. |
| **Existing WP04-DOYS-S04** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Common-name guidance, CFIA Fish List guidance, seafood/French naming boundary, and surimi/imitations requirements. Reused from the current ledger; no duplicate source ID is assigned. |

The five new `WP04-SEA-GAP-20261009-S01`–`S05` IDs and source URLs were checked against the live ledger and current proposal/batch files before use; no collision was found. The Parks Canada and CFIA sources are reused under their existing IDs. No recipe, catalog, ledger, plan, roadmap, generated index, or test was changed by this packet.
