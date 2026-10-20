# WP04 Section P — Canadian/Québec freshwater finfish gaps

- **Packet type:** proposal-only, species identity and search-boundary review.
- **Review date:** 2026-10-10.
- **Disposition:** advance three identity-only freshwater finfish candidates: walleye, northern pike, and yellow perch. Use only the directly supported species-qualified English/fr-CA display pairs and no aliases. Keep generic fish names unresolved.
- **Scope:** this file only. No active catalog, ledger, legacy candidates, tests, plan, roadmap, code, recipes, or other proposal was edited.

## Scope and prior work

This pass screens additional Canadian/Québec freshwater finfish after the earlier Section P packets. It excludes every already active species identity, including American plaice, channel catfish, and Pacific halibut, and does not reopen Atlantic cod, haddock, Atlantic halibut, Arctic char, American eel, rainbow trout, white hake, Atlantic herring, Alaska pollock, Atlantic and Pacific mackerel, or spotted Spanish mackerel. Broad/product rows for salmon fillets and tuna, and the separate salt-cod, stockfish, and dried-bonito products, are not expanded into species claims.

Prior finfish packets were checked for established decisions and held names: the identity coordinator review, species follow-up, pollock/mackerel boundary review, the prior finfish-gap packet, and the seafood coordinator review. The former gap packet's American plaice, channel catfish, and Pacific halibut recommendations are now active catalog rows and ledger records, so they are not repeated here. The pollock packet also establishes that CFIA's **walleye pollock** is *Gadus chalcogrammus*; that marine pollock remains distinct from the freshwater **walleye**, *Sander vitreus*.

## Refreshed inventory and audit

Counts and file digests below were read from the current worktree snapshot. The recipe-corpus digest iterates the 114 `recipeFiles` entries in `manifest.v1.json` order and hashes each relative path, a NUL byte, the exact file bytes, and a NUL byte.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 660 references | `0ed3cf126bc93c3dc709b222d831aade0d68990c944c3e2da6835ba058c8af4a` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| `docs/catalog/research-ledger.v1.json` | 844 records; 1,446 source entries / 1,213 distinct source IDs | `b4c72b7199cc4736f2ae26a72d546080b43b7d98694352974de4813a6b84f380` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

All 660 reference names and aliases, all 33 form labels and match terms, the 86 legacy candidates and aliases, and the finfish-related ledger records were inspected. The three proposed IDs (`ingredient-ref-walleye`, `ingredient-ref-northern-pike`, and `ingredient-ref-yellow-perch`) do not occur in the references, legacy list, or ledger. The proposed English and French display phrases have no exact normalized collision in active reference names/aliases, form labels/match terms, or legacy names/aliases. Walleye occurs in prior pollock naming evidence, but not as a ledger record for *Sander vitreus*; the source specifically scopes **walleye pollock** to the separate *Gadus chalcogrammus* identity.

The 114 manifest-listed recipe files and all 1,123 `ingredients[]` rows were parsed. Candidate English/fr-CA names and binomials were searched across each row's original text, ingredient name, reference/form IDs, and localized notes, and across all parsed recipe strings. There are zero recipe-row or full-file hits for these three species or their binomials. The aquatic and generic fish-related ingredient rows are:

| Recipe / row | Ingredient text | Boundary |
|---|---|---|
| 019 / 8 | `1 lb jumbo lump crab meat` | Shellfish; already linked to its grade-specific identity. |
| 023 / 1 | `140 g sliced calamari` | Mollusc; not finfish. |
| 077 / 10 | `675 g salmon fillets without skin, cut into cubes` | Existing broad salmon-fillets identity; no freshwater species inferred. |
| 093 / 4 | `Cooked meat or seafood, to taste` | Unlinked generic option. It does not select a fish or species and remains unresolved. |
| 093 / 6 | `2 tbsp fish sauce` | Condiment, not finfish. |
| 095 / 5 | `1 tbsp fish sauce` | Condiment, not finfish. |
| 111 / 1 | `1 tuna steak` | Existing broad tuna identity; no species inferred. |

The scan found no recipe call for walleye, northern pike, yellow perch, or a freshwater-fish form. Recipe coverage therefore does not support relinking, a form, an amount, or a substitution for these candidates.

## Proposed identity-only candidates

| Candidate ID | Category | English display | fr-CA display | Aliases | Species scope |
|---|---|---|---|---|---|
| `ingredient-ref-walleye` | `PROTEIN` | **walleye** | **doré jaune** | None. | *Sander vitreus*. The OQLF entry links the same English/French pair to the older combination *Stizostedion vitreum*; the Québec government species profile and CFIA use *Sander vitreus*. |
| `ingredient-ref-northern-pike` | `PROTEIN` | **northern pike** | **grand brochet** | None. | *Esox lucius*. |
| `ingredient-ref-yellow-perch` | `PROTEIN` | **yellow perch** | **perchaude** | None. | *Perca flavescens*. |

These are proposed species identities, not cuts, preparations, preservation states, portion sizes, or recipe equivalents.

## Naming and search boundaries

- **Walleye:** Use `walleye / doré jaune` for *Sander vitreus*. OQLF marks `doré jaune` as the normalized Québec fish-product name and says `doré blanc` and `sandre` were not retained for that naming context. Do not add `pickerel`, `yellow pickerel`, or `walleye pike` as aliases: `pickerel` is also an English term listed for northern pike, and the catalog display should retain the species qualifier. Do not merge this freshwater fish with active Alaska pollock; CFIA lists `Walleye Pollock` under *Gadus chalcogrammus*.
- **Northern pike:** Use `northern pike / grand brochet` for *Esox lucius*. The Québec species profile distinguishes it from muskellunge, chain pickerel, and redfin pickerel. Although sources list several popular English and French variants, do not add generic `pickerel`, `pike`, or `brochet` aliases that could collapse distinct fish names.
- **Yellow perch:** Use `yellow perch / perchaude` for *Perca flavescens*. OQLF says `perchaude` is the normalized Québec fish-product term and that `perche` was not retained for this context. Do not add `perch`, `perche`, `American perch`, or `lake perch` as aliases; keep other perch-named species distinct.

The app's normalized search behavior was checked from `IngredientSearch.kt`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ`, `æ`, `ß`, and `&`, strip combining marks, replace other punctuation with spaces, then collapse whitespace. It returns whole-word phrase matches before substring fallback. A read-only simulation with the three proposed rows and current catalog/forms found:

| Query | Candidate result |
|---|---|
| `walleye`, `doré jaune`, `doré` | Walleye only. |
| `northern pike`, `grand brochet`, `pike`, `brochet` | Northern pike only. |
| `yellow perch`, `perchaude`, `perch` | Yellow perch only. |
| `pickerel`, `perche` | No result from the proposed rows. |

The one-word searches `doré`, `pike`, `brochet`, and `perch` match words inside the species-qualified displays; that search behavior does not create aliases or a generic family identity. `pickerel` remains unassigned because sources use it for more than one Canadian species. Broad `fish / poisson`, `freshwater fish / poisson d'eau douce`, and the recipe's `seafood` wording also remain unresolved rather than being pointed at one species.

## Unresolved product and quantity scope

No form, cut, skin/bone state, cooked/raw state, fresh/frozen state, density, unit mapping, package amount, portion default, conversion, yield, or substitution is proposed. Québec biological profiles contain fish size/weight observations, but those do not establish edible portion or a recipe count-to-mass conversion. No recipe line is changed or linked to a new identity.

## Sources

Sources were accessed 2026-10-10. The IDs below are unique to this proposal and are not ledger entries.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| `WP04-FRESHWATER-FINFISH-20261010-S01` | OQLF GDT, [doré jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198870/dore-jaune) | Normalized Québec fish-product term, direct English `walleye` pairing, and commercial fish context. OQLF's Latin field uses the older *Stizostedion vitreum* combination; it does not establish a culinary form. |
| `WP04-FRESHWATER-FINFISH-20261010-S02` | Gouvernement du Québec, [Doré jaune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/dore-jaune) | Direct French/English names, current *Sander vitreus*, freshwater classification, and Québec distribution. Biological size/weight information is not a kitchen measure. |
| `WP04-FRESHWATER-FINFISH-20261010-S03` | OQLF GDT, [grand brochet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872759/grand-brochet) | Direct `grand brochet / northern pike` and *Esox lucius* pairing, including the food-fish domain; naming evidence only. |
| `WP04-FRESHWATER-FINFISH-20261010-S04` | Gouvernement du Québec, [Grand brochet](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/grand-brochet) | Direct French/English names, *E. lucius*, freshwater classification, and distinction from muskellunge and other pickerels. Biological profile, not a recipe or equivalence source. |
| `WP04-FRESHWATER-FINFISH-20261010-S05` | OQLF GDT, [perchaude](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198859/perchaude) | Normalized Québec `perchaude`, direct English `yellow perch`, *Perca flavescens*, and explicit reason not to use `perche` for commercial fish-product naming. Naming evidence only. |
| `WP04-FRESHWATER-FINFISH-20261010-S06` | Gouvernement du Québec, [Perchaude](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/perchaude) | Direct French/English names, *P. flavescens*, freshwater classification, and Québec distribution. The listed alternate names are not all adopted as catalog aliases. |
| `WP04-FRESHWATER-FINFISH-20261010-S07` | CFIA Fish List, [pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock) | Lists `Walleye Pollock` as *Gadus chalcogrammus*, distinguishing the active Alaska-pollock species from *Sander vitreus*. Canadian fish-label names, not recipe equivalence. |

The `WP04-FRESHWATER-FINFISH-20261010-S01`–`S07` prefix was checked against all source IDs in the 1,213-ID ledger set and the existing catalog proposal files; no collision was found. Candidate IDs and names are proposal recommendations only. No active data or recipe changes are requested by this packet.
