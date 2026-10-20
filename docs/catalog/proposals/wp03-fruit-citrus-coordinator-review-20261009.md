# WP03 Section M coordinator review: small-fruit identity gaps

**Review date:** 2026-10-09  
**Disposition:** Proposal only; no shared catalog, recipe, ledger, checklist, or plan data was changed.

## Recommendation

Advance a bounded small-fruit identity set with Québec French names grounded in the Office québécois de la langue française (OQLF): blackberry, black currant, red currant, gooseberry, elderberry, lingonberry, and cloudberry. The OQLF’s small-fruit vocabulary explicitly distinguishes these names and their French terms, including several easily conflated berries. [OQLF, Vocabulaire des petits fruits](https://www.oqlf.gouv.qc.ca/ressources/bibliotheque/dictionnaires/terminologie_fruits.aspx)

This is the highest-confidence slice of Section M for a coordinator decision. Recipe evidence is sparse for these seven gaps, so it is a taxonomy/Québec terminology recommendation rather than a recipe-driven expansion. Keep fruit identity separate from fresh/frozen, dried, pitted, puréed, juiced, sweetened, or preserved material. Do not add measurements or substitutions from this review.

## Refreshed working-tree snapshot

The requested baseline changed while the shared catalog work was underway, so these counts and hashes were refreshed immediately before writing this review.

| File or corpus | Current count | SHA-256 |
|---|---:|---|
| Bundled ingredient references | 524 | c12bda3457be0432e689128dd327fd5363f6ace930825d1d08460ab313acdf18 |
| Bundled ingredient forms | 32 | 02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca |
| Bundled manifest recipe paths | 114 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Research ledger records / source entries | 704 / 1,157 | 121f86a6063e8d3b37553b10ab09c727917ec03f6ad03f938d7c4e19ce97af66 |
| Legacy identity candidates | 97 | 0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80 |
| Manifest-ordered recipe corpus | 114 recipes / 1,123 ingredient rows | 81a6a940e7bfdbe76f85b0b68b7b6c2a69ba8dec31a4a48c45f5ed31a0668937 |

The recipe digest is SHA-256 over each manifest-relative recipe path, a NUL byte, its exact file bytes, and a NUL byte, in manifest order. The proposed source-ID prefix WP03-M-FRUIT-CITRUS-20261009 has no collision among the current ledger source entries.

## Audit coverage and current state

The plan’s Section M checklist and Requirements.md were reviewed alongside the prior coordinator and regional fruit reports. The audit checked every live ingredient reference and form, the complete legacy candidate list, the research ledger, and all 1,123 ingredient rows from the 114 manifest recipes. A broad fruit-family text scan surfaced 47 rows; that includes one lexical false positive (“sugar pearls”) and one generic “citrus zest” row that does not identify a specific fruit.

There are 16 current references categorized FRUIT. The fruit identities relevant to this section include banana, blueberries, cherries, cranberries, lemon, mangos, pineapple, raspberries, strawberries, Saskatoon berry, açaí, cupuaçu, and jackfruit. Coconut is already covered in the WP03 coconut review. Maraschino cherries and their jar juice are processed products, not additional fresh-fruit identities. No current ingredient form points to a FRUIT reference.

Of the seven proposed small-fruit identities, the legacy list contains one direct candidate: ingredient-ref-blackberry, with English “blackberry” and French “mûre.” Reuse and review that candidate rather than minting a duplicate. The legacy list also has older apple, citrus, peach/pear, dried-apricot, prune, and preserve candidates, but those are outside this bounded proposal. Legacy cherry, mango, and raspberry candidates overlap current identities and should not be reintroduced as new identities. The legacy strawberry-jam candidate is a prepared product rather than a fruit identity and remains a separate product review.

The recipe rows that establish the current berry baseline include blueberries in 014#1 and 106#2; fresh and dried cranberries in 021#1, 025#9, and 098#1; raspberry jam in 010#10, raspberries in 108#2, and freeze-dried raspberries in 112#3–4. No recipe ingredient row names any of the seven proposed gaps. Other Section M rows confirm existing fruit-state/product distinctions: fresh-or-frozen blueberries and cherries, dried cranberries, freeze-dried berries, fresh strawberries, lemon/lime juice and zest, and maraschino cherries/juice. These descriptions do not supply a conversion factor or substitution rule.

## Exact identity candidates

Use these as distinct ingredient references in category FRUIT. Names below follow the OQLF vocabulary; aliases should be added only when the alias has a stable, unambiguous meaning in both language matching and the catalog.

| Proposed English name | Proposed Québec French name | Candidate key | Evidence and boundary |
|---|---|---|---|
| blackberry | mûre | ingredient-ref-blackberry (existing legacy candidate) | Keep distinct from black raspberry; do not use “mûre” as an alias for raspberry. [OQLF, mûre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357938/mure) |
| black currant | cassis | ingredient-ref-black-currant | Distinct from red currant and gooseberry. OQLF also records “groseille noire” and “gadelle noire”; treat those as candidate French aliases only if the catalog accepts their regional scope. [OQLF, cassis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358081/cassis) |
| red currant | groseille rouge à grappes | ingredient-ref-red-currant | Keep separate from black currant and gooseberry. “Groseille à grappes” is the broad OQLF term; “gadelle” is a Québec usage worth reviewing as an alias. [OQLF, groseille à grappes](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357861/groseille-a-grappes) |
| gooseberry | groseille à maquereau | ingredient-ref-gooseberry | Do not shorten the French display name to bare “groseille”: Québec usage can make it ambiguous with currants. |
| elderberry | baie de sureau | ingredient-ref-elderberry | Preserve “baie de sureau” as the fruit name; do not add “sureau” alone as an alias without reviewing its plant/material ambiguity. |
| lingonberry | airelle rouge | ingredient-ref-lingonberry | Keep distinct from cranberry/canneberge; do not add “atoca” here. [OQLF, airelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358162/airelle) |
| cloudberry | chicouté | ingredient-ref-cloudberry | OQLF’s preferred Québec name. Avoid broad “salmonberry” aliases. [OQLF, chicouté](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358247/chicoute) |

The OQLF lists “atoca” as a Québec/Canadian alternative for cranberry. It may be a French alias for the existing ingredient-ref-cranberries, but the alias model does not carry a region tag; keep it out unless the coordinator accepts that loss of usage context. [OQLF, canneberge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8873045/canneberge)

## Identity, processing, and product-scope decisions

- A named berry is an identity. Fresh/frozen, ripe/unripe, whole/chopped, pitted, dried, freeze-dried, sweetened, puréed, juiced, and drained describe a state or product. The 32 current forms contain no fruit form; this review does not invent forms before the broader form model is settled.
- Existing material-specific references such as dried cranberries, raisins, freeze-dried berries, raspberry jam, lemon juice/zest, lime juice, maraschino cherries, and maraschino cherry juice remain product references. Do not turn these into aliases for their fresh fruit. The CFIA’s standards distinguish fruit juice, jams, jellies, marmalades, and preserves as named product classes. [CFIA, Canadian Standards of Identity, Volume 4](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-standards-identity-volume-4)
- Fresh versus dried material needs a separately sourced product/form decision. In particular, “currant” may mean a fresh Ribes berry or dried Zante grapes in a recipe context; do not use it as a cross-product alias. Current ingredient-ref-raisins already covers raisins / raisins secs.
- A future cranberry alias decision should retain the distinction from lingonberry. Saskatoon berry/amélanche is already integrated by the WP06 Saskatoon batch; do not add “serviceberry” as a broad alias because it covers multiple regional species.
- The active cherries reference carries aliases for “fresh,” “frozen,” and “pitted” cherries. Those are state/preparation terms, not identity synonyms. Review that existing alias placement when fruit forms are coordinated; this report makes no data change.

## Unresolved Section M terms kept out of this bounded proposal

- Citrus needs its own naming pass. English “citron” names cédrat, while French “citron” is the current lemon name; do not cross-map them. “Pamplemousse” is used inconsistently for grapefruit and true pomelo, and calamansi must not be inferred to mean calamondin. OQLF’s citrus entries should anchor that follow-up: [agrume](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26526449/agrume), [cédrat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366593/cedrat), [pamplemousse](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506588/pamplemousse), and [pomélo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506586/pomelo).
- OQLF’s mûre entry also notes that the French word can name either a Rubus berry or a Morus fruit. Keep the proposed blackberry mapped to the Rubus meaning, and do not use “mûre” as an alias for any future mulberry reference. [OQLF, mûre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357938/mure)
- General dates versus Medjool dates need a product/variety decision. The active Medjool reference has broad “dates” / “dattes” aliases, while recipe 058#2 uses generic dates without a reference. A generic-date row should not be silently absorbed by the named Medjool variety.
- Legacy “pomegranate seeds” names a prepared part, not a whole-fruit identity; active pomegranate molasses is likewise a product. Keep those distinct if pomegranate fruit is added later.
- Jackfruit’s base identity is already integrated; maturity and canned/product boundaries are addressed by the separate WP06 jackfruit review. Saskatoon, açaí, and cupuaçu are already integrated. Chokecherry and region-specific preserves remain with the North American, South American, and Mexico/Central America WP06 reviews rather than being duplicated here.

No form change, measurement mapping, package yield, density, or substitution is justified by the scanned recipe quantities. In particular, unpaired ingredient amounts are not conversion evidence, and this proposal contains no fruit substitutions.
