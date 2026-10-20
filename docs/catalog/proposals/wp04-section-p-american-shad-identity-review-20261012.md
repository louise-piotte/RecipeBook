# WP04 Section P — American shad identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Proposal-only species identity, Québec naming, measurement, substitution, and full-corpus review.
- **Disposition:** Propose one identity-only finfish reference for American shad / alose savoureuse, *Alosa sapidissima*. Keep it species-qualified, with no aliases, forms, recipe links, or numeric behavior.
- **Worktree scope:** This proposal file only. No catalog JSON, research ledger, recipe, checklist, roadmap, workflow, generated file, or test was changed. No tests or emulator work were run.

## Bounded decision

Recommend a new identity-only PROTEIN reference:

| Candidate ID | English display | fr-CA display | Aliases | Taxon |
|---|---|---|---|---|
| ingredient-ref-american-shad | American shad | alose savoureuse | None | *Alosa sapidissima* |

This is one currently uncovered species within the open Section P regional-fish item. OQLF’s GDT entry places alose savoureuse in the edible-fish domain, pairs it with American shad and *Alosa sapidissima*, and identifies it as the normalized Québec commercial-fish term. CFIA’s Fish List has the same species-qualified English/French pair. DFO’s bilingual profiles and TERMIUM confirm the taxon and language pair. No source supports extending this identity to a general shad, alose, herring, or gaspareau request.

The candidate is a naming identity only. The Québec government’s current species profile calls the fishery marginal and classifies the species as vulnerable. Registering its name would not imply market availability, permission to catch or sell it, or a sourcing recommendation. A future recipe that explicitly names this fish would still need its own source and product-state review.

Keep the following outside this identity:

- Unqualified shad and alose. OQLF’s separate alose entry pairs the unqualified French and English words with *Alosa alosa*, while CFIA’s Fish List also lists Shad for *A. sapidissima*. These overlapping uses make the short words unsuitable as global aliases.
- Alose d’Amérique. OQLF says this context-specific name was not retained for Québec fish-product labeling. TERMIUM also marks it as old. Do not add it as an alias, even though the Québec wildlife profile lists it among alternate names.
- Alose canadienne and the English variants Atlantic shad, common shad, and white shad. Older DFO and current Québec/TERMIUM sources attest some of these variants, but the selected displays are already unambiguous and no recipe or product request needs extra global aliases.
- Gaspareau/alewife (*Alosa pseudoharengus*), alose d’été (*A. aestivalis*), alose à gésier (*Dorosoma cepedianum*), Atlantic herring (*Clupea harengus*), roe, and preserved or prepared fish products. Shared family, habitat, or related wording does not make them this species.

After integration, the app’s phrase search can still return the species row for a query such as shad or alose because those words occur in the stored display. That search behavior would not create a stored generic alias or authorize linking an unqualified recipe line.

## Prior-work and checklist boundary

The current plan’s broad Section P checklist still includes regional fish. The 2026-10-12 roadmap records Pacific cod and lake whitefish as newly integrated and says Section P remains open. I rechecked the plan, roadmap, all current WP04 finfish and seafood proposal/batch files, and the related integration and hold packets before selecting this candidate. No earlier packet names American shad, alose savoureuse, or *Alosa sapidissima*, and no prior proposal reserves a shad/alose identity or candidate record.

The finfish boundary audit included the coordinator and follow-up reviews for Atlantic cod, haddock, halibut, rainbow trout, white hake, Atlantic herring, Alaska pollock and mackerels; the generic sole/flounder/turbot, bass/bream, snapper/grouper, tilapia, catfish, and carp holds; the freshwater walleye/pike/perch review; salmon/tuna scope; sardines; sablefish; the 2026-10-12 red-hake / Atlantic-pollock sweep; and the recent Pacific-cod and lake-whitefish reviews. Their species-qualified rows and held broad-market terms remain distinct. The proposal also rechecked the Section P seafood coordinator and the mollusk, shrimp, crab/crayfish, lobster/langoustine, mussel, clam/oyster, cockle, scallop, periwinkle, whelk/conch, sea-cucumber, sea-urchin/roe, cuttlefish/octopus, fish-powder, fish-ball/surimi, and preserved-fish reviews. This candidate does not reopen any of those boundaries.

A repository-wide search across the current catalog, ledger, roadmap, plan, and existing proposal/batch files found no prior American-shad phrase, taxon, reference ID, candidate ID, or source-ID prefix. The broad regional-fish checklist remains open after this single-candidate review.

## Live ownership snapshot and exact-key audit

Snapshot read from the live worktree on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus digest iterates manifest.recipeFiles in stored order and hashes each UTF-8 relative path, a NUL byte, the exact recipe bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,239 references | fe3c4a2c0ec423a2a0e9bb2b1eaa43cd4fb73dfa20e44bc1050d3f551ec98f71 |
| ingredient-forms.v1.json | 86 forms | 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| legacy-import-identities.v1.json | 66 candidates | bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f |
| research-ledger.v1.json | 1,538 records; 5,318 source entries; 4,360 distinct source IDs | bda81990f4d69c2c69fff716dfd22a8287d59c35de4907194f63821a1c4bdb33 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,993 recipe-file bytes | 2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27 |

Exact-key checks mirror normalizeIngredientSearchKey in IngredientSearch.kt: lowercase with Locale.ROOT; apply Unicode NFKD; fold œ, æ, ß, and ampersand; remove combining marks; replace non-alphanumeric runs with spaces; trim and collapse whitespace. Candidate phrases were compared with all active reference names and aliases, every form label and match term, legacy-candidate names and aliases, and ledger record IDs.

| Normalized query | Exact active reference / form / legacy / ledger-ID owner | Boundary result |
|---|---|---|
| american shad | None | Candidate English display. |
| alose savoureuse | None | Candidate fr-CA display. |
| alosa sapidissima | None | Taxon is not an existing search term or ledger record ID. |
| shad | None | Do not add as an alias; sources use it with more than one species scope. |
| alose | None | Do not add as an alias; OQLF separately maps it to *Alosa alosa*. |
| alose d amerique; alose canadienne | None | Alternate names are excluded from the bounded display. |
| atlantic shad; common shad; white shad | None | Attested variants, not needed as aliases. |
| alose commune; alose blanche; alose atlantique | None | Termium variants; not added as aliases. |
| alosa pseudoharengus; gaspareau; alewife; faux hareng | None | Related species and names remain separate. |
| alosa aestivalis; alose d ete | None | Related alose species remains separate. |
| dorosoma cepedianum; alose a gesier | None | Gizzard shad remains separate. |
| ingredient-ref-american-shad; candidate-american-shad | Neither ID exists in references, forms, legacy candidates, or ledger records. | New ID is unallocated. |

The live catalog does contain Atlantic herring / hareng de l’Atlantique as a separate reference. No proposed display, taxon, or alias has an exact owner there. It remains distinct despite the shared clupeid family. The seven proposal-local source IDs below were checked against every live ledger source ID and the source IDs in existing proposal/batch files; none is reused.

## Full manifest recipe-demand audit

All 114 paths from manifest.v1.json were read in manifest order. The scan checked every string in the 1,123 ingredient rows and every string value in each complete recipe JSON. Normalized whole-word phrases included American shad, alose savoureuse, *Alosa sapidissima*, shad, alose, alose d’Amérique, alose canadienne, Atlantic/common/white shad, alose commune/blanche/atlantique, gaspareau, alewife, alose d’été, alose à gésier, and the related taxa listed above.

**Result: zero matching ingredient rows and zero matching recipe files.** Nearby seafood rows do not select this species: recipe 077#10 requests salmon fillets; 111#1 requests a tuna steak; 093#4 is the unlinked “Cooked meat or seafood, to taste” placeholder; 093#6 and 095#5 request fish sauce; 019#8 requests Jumbo Lump crab meat; and 023#1 requests calamari. None supports a shad identity, form, amount, or recipe link.

## Measurement, density, and substitution evidence

The Québec species profile reports observed fish lengths of 11–61 cm, adult lengths of about 40–60 cm, and a largest-specimen weight near 4.5 kg. DFO’s species profile gives a similar biological length range and a 1–3 kg body-weight range. These describe live fish specimens, not edible portions, fillets, recipe serving sizes, or as-purchased culinary units. The profile’s report of a marginal commercial fishery is not a current product specification.

No reviewed source supports a recipe portion, count weight, fillet weight, volume-to-mass measure, edible yield, cooking yield, or fish-specific density in g/mL. Leave all such values unknown; add no measurement observations, default density, unit mapping, form, conversion, or package yield. The sources identify the fish and its local status but establish no directed culinary substitution between American shad and herring, gaspareau, other aloses, or another fish. If accepted, record measurementState as researched_no_supported_value and substitutionResearchState as researched_no_supported_substitute. Do not infer equivalence from taxonomy, habitat, flesh description, or market class.

## Recommended integration delta

1. Add ingredient-ref-american-shad as a PROTEIN reference with English display American shad and fr-CA display alose savoureuse. Add no aliases.
2. Add a ledger record for the same species-scoped identity and the seven sources below. Record the Quebec vulnerability / marginal-fishery note as a sourcing boundary, not an availability or harvest claim.
3. Leave density null and unitMappings empty. Add no form, numeric observation, conversion, yield, recipe link, or substitution rule. Set measurementState to researched_no_supported_value and substitutionResearchState to researched_no_supported_substitute.
4. Keep unqualified shad/alose and all named related species, existing finfish references, and existing Section P product holds unchanged. Leave the parent Section P checklist open.

## Sources checked

All sources were accessed on 2026-10-12. The IDs below are proposal-local and absent from the live ledger and previous proposal/batch files.

| Source ID | Source | What it supports and limits |
|---|---|---|
| WP04-AMERICAN-SHAD-20261012-S01 | OQLF, [alose savoureuse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198929/alose-savoureuse) | Québec edible-fish term; preferred normalized French name; English American shad and Latin *Alosa sapidissima*; says alose d’Amérique was not retained for Québec fish-product labeling. Naming evidence, not availability or cooking guidance. |
| WP04-AMERICAN-SHAD-20261012-S02 | OQLF, [alose (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198932/alose) | Shows that unqualified alose / shad has a separate *Alosa alosa* scope in Québec fish terminology. Supports excluding the short names as aliases. |
| WP04-AMERICAN-SHAD-20261012-S03 | CFIA, [Fish List result for American Shad](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=American%20Shad&wbdisable=true) | Lists *Alosa sapidissima* as American Shad / Alose Savoureuse, and separately includes Shad for that species with no French name. Canadian fish-label naming; it does not make unqualified recipes species-specific. |
| WP04-AMERICAN-SHAD-20261012-S04 | TERMIUM Plus, [record for *Alosa sapidissima*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&index=frr&lang=fra&srchtxt=CRUSTACES) | Record 20 pairs American shad with normalized alose savoureuse. Lists other English and French variants, and marks alose d’Amérique old. Supports the selected name while leaving aliases out. |
| WP04-AMERICAN-SHAD-20261012-S05 | Fisheries and Oceans Canada, [American Shad](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/american-shad-alose-savoureuse-eng.html) | Canadian species profile and biological size information. Size is not culinary portion or conversion evidence. |
| WP04-AMERICAN-SHAD-20261012-S06 | Pêches et Océans Canada, [Alose savoureuse](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/american-shad-alose-savoureuse-fra.html) | French species profile confirms taxon, range, and biological size; not a recipe, consumer product, measurement, or substitution source. |
| WP04-AMERICAN-SHAD-20261012-S07 | Gouvernement du Québec, [Alose savoureuse](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/alose-savoureuse) | Current bilingual Québec species profile, taxon, related-species distinctions, observed body sizes, vulnerable status, and marginal commercial-fishery note. These do not establish edible yields, product availability, or cooking substitutions. |

This is documentation-only proposal research. No catalog or recipe JSON changed and no tests or emulator checks were run.
