# WP04 Section P — crappie pair identity and picker review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Canadian/Québec identity, ownership, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** integrate a two-row, identity-only `PROTEIN` pair: black crappie / marigane noire (*Pomoxis nigromaculatus*) and white crappie / marigane blanche (*Pomoxis annularis*). Add no aliases, forms, recipe links, measures, density, unit mappings, conversion, yield, or substitution.
- **Status:** accepted and integrated as a two-row identity-only pair; the plan and roadmap record the disposition. The package snapshot below is the pre-integration audit baseline.
- **Scope:** integration adds only the two named species identities and their research-ledger records. It adds no recipes, forms, numeric behavior, or application-code changes. No app tests or emulator work were run because this is database JSON data plus its generated index.

## Bounded identity decision

| Proposed reference ID | Category | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|---|
| `ingredient-ref-black-crappie` | `PROTEIN` | black crappie | marigane noire | None | None | *Pomoxis nigromaculatus* |
| `ingredient-ref-white-crappie` | `PROTEIN` | white crappie | marigane blanche | None | None | *Pomoxis annularis* |

The Québec OQLF entry and Québec species profile support **marigane noire / black crappie** and *P. nigromaculatus*. OQLF classifies the term under edible-fish terminology and says the species has commercial potential in Québec; that statement does not establish current sales. The Québec profile documents the species in southern Québec and the St. Lawrence. DFO’s 2025 synopsis distinguishes black and white crappie as separate *Pomoxis* species and reports that hybrids can be difficult to identify.

For white crappie, Ontario’s government species pages pair **White Crappie / marigane blanche** with *P. annularis*. These are authoritative bilingual Canadian naming sources, not Québec-specific terminology evidence. The reviewed Québec fish profile, poster, and OQLF record support black crappie; this review found no corresponding Québec white-crappie profile or current Québec market listing. Do not describe white crappie as Québec-preferred, locally available, or commercially sold in Québec.

The food-identity evidence for white crappie is Ontario’s official bilingual Guide to Eating Ontario Fish. It lists White Crappie / Marigane blanche among fish caught in Ontario and supplies consumption advice tied to waterbody, species, and fish length. This supports a Canadian food identity beyond a fishing-regulation name, but it documents wild-caught Ontario fish and contaminant-related meal guidance. It is not evidence of Québec retail supply, a Québec culinary tradition, or a recipe/product form. Ontario’s 2026 fishing summary separately defines the broad English `crappie` and French `marigane` terms as covering both named species; that regulatory definition helps bound generic query scope but is not food evidence by itself.

Use only the qualified display pair for each species. Do not add `crappie` or `marigane` as aliases: each broad query will match both display names as a phrase contained in those names. Do not add `crapet noir`, `crapet calico`, or `calico` for black crappie; OQLF says the first two names were not retained by the fish-product terminology committee. Keep `perche argentée` (France/Europe), hybrids, and other regional names unassigned. A query match is not permission to relink an unqualified recipe line to either species.

## Prior-work and held-candidate comparison

The live Section P checklist still covers regional fish after the completed Nile-perch work. A repository search of the plan, proposals, batches, active references, forms, legacy identities, and research ledger found no prior black-crappie or white-crappie allocation or dedicated review before this proposal. The existing yellow-perch and Nile-perch identities remain separate; neither is a synonym or product equivalent for either *Pomoxis* species.

The prior Section P holds establish a consistent test for broad-query risk:

| Held candidate | Broad query and current species-only projection | Why it was held | Crappie-pair comparison |
|---|---|---|---|
| Nile tilapia / tilapia du Nil (*Oreochromis niloticus*) | `tilapia` can return the qualified Nile-tilapia candidate alone. | A sole species-specific result can appear to settle an unresolved generic query. | A black-only row would have the same problem. With both qualified crappie rows, `crappie` returns two distinct species rows. |
| Cunner / tanche-tautogue (*Tautogolabrus adspersus*) | `tanche` can return the qualified cunner row alone. | Same one-result scope problem; the Québec market review also found no commercial fishing and no current commercialization in Québec. | The crappie pair avoids a single species-only result; no claim is made about Québec white-crappie availability. |
| Gilthead bream / dorade royale (*Sparus aurata*) | `bream` and `dorade` can each return the qualified gilthead-bream row alone. | Each broad query can surface just one species while its generic scope remains unresolved. | `crappie` and `marigane` return both qualified species rows, visibly retaining the two-species ambiguity. |

The recommendation is a narrow exception to those species-only holds: the current picker projection returns two separately named identities for each broad term, consistent with the current Ontario regulatory scope, rather than one species presented as the only match. The projection has no separate generic crappie row, so generic ingredient text remains unresolved and must not be auto-linked. If the picker UI does not visibly present both qualified labels together, keep the pair unallocated until that behavior is addressed.

## Exact ownership and live snapshot

The ownership audit checked active reference names and aliases, form labels and match terms, legacy-import candidates, ledger IDs and identity text, and the generated catalog. Search normalization mirrors `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, Unicode NFKD, fold `œ`/`æ`/`ß`, remove combining marks, normalize punctuation, and collapse whitespace. The live catalog and archived review records had no exact owner for either proposed ID or the candidate identity phrases.

| Candidate key or proposed ID | Active reference owner | Active form owner | Legacy candidate owner | Ledger record owner |
|---|---|---|---|---|
| `ingredient-ref-black-crappie` | None; ID absent | None | None; ID absent | None; record ID absent |
| `ingredient-ref-white-crappie` | None; ID absent | None | None; ID absent | None; record ID absent |
| `black crappie` / `white crappie` | None | None | None | None |
| `marigane noire` / `marigane blanche` | None | None | None | None |
| `crapet noir` / `crapet calico` / `calico` | None | None | None | None |
| *Pomoxis nigromaculatus* / *P. annularis* | None | None | None | None |

The broad terms `crappie` and `marigane` are not exact-key aliases or owners. The proposed pair will make them phrase matches against two display names; see the picker projection below. This live snapshot was captured for this revision on 2026-10-12. File hashes cover exact bytes. The recipe-corpus digest hashes each manifest-listed relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / size | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,275 references; 408,396 bytes | `40a36a787b887078915723b74fecaca1703b51ab39333e806a41924db5b654bb` |
| `ingredient-forms.v1.json` | 94 forms; 70,793 bytes | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates; 15,508 bytes | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,583 records; 5,615 source entries; 4,651 distinct source IDs; 8 conversions; 5,494,244 bytes | `4dca77aa41700c23f2a188a0dabb34eff9cd6abb0644b5c403f62e0ec3acdfd3` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,275 references; 558,911 bytes | `f352a91fab8c7dbf32e3fb266e079a6f4c779534a910cabf9fc7ac74db350982` |

These hashes document the pre-integration audit snapshot. The source IDs below are now attached to the two accepted ledger records.

## Picker-query behavior

The picker’s `IngredientReferenceSearchIndex` indexes bilingual reference names and aliases plus attached form terms. It returns complete normalized word-phrase matches first and falls back to substring matching only when no complete phrase matches. The projection below applies that implementation to the live 1,275-reference / 94-form catalog plus the two proposed display-only rows. It is a static search-index projection, not a UI interaction test.

| Query | Current live results | With both proposed display rows | Interpretation |
|---|---|---|---|
| `black crappie` | None | `black crappie / marigane noire` only | Qualified English phrase selects black crappie. |
| `marigane noire` | None | `black crappie / marigane noire` only | Qualified French phrase selects black crappie. |
| `white crappie` | None | `white crappie / marigane blanche` only | Qualified English phrase selects white crappie. |
| `marigane blanche` | None | `white crappie / marigane blanche` only | Qualified French phrase selects white crappie. |
| `crappie` | None | Both proposed rows | The English word is contained in both qualified displays; it is not an alias. The two results expose ambiguity rather than silently selecting one species. |
| `marigane` | None | Both proposed rows | The French word is contained in both qualified displays; it is not an alias. The two results expose ambiguity rather than silently selecting one species. |
| `crapet noir`, `crapet calico`, `calico`, `perche argentée` | None | None | Excluded names remain unsearchable on these rows. |
| `black` | 23 references | 24 references, including black crappie | Expected broad word query; black crappie joins unrelated black-labeled ingredients. |

No separate generic reference or alias is projected. The two broad-query matches do not classify an unqualified recipe, purchase, or food label as either species. DFO also notes that black/white crappie hybrids can be difficult to identify; this proposal assigns no hybrid identity.

## Full bundled-recipe audit

All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned for black and white crappie, `crappie`, `marigane`, `marigane blanche`, `crapet noir`, `crapet calico`, *Pomoxis nigromaculatus*, *P. annularis*, both proposed IDs, and the excluded name variants. The scan included ingredient names, original text, reference/form identifiers, nested recipe content, and complete parsed recipe files.

**Result: zero candidate-name, taxon, or ID hits in ingredient rows and zero matching recipe files.** Nearby seafood is not species demand: recipe `019#8` requests jumbo-lump crab meat; `023#1` requests sliced calamari; `077#10` requests salmon fillets; `093#4` has generic free-text `Cooked meat or seafood, to taste` without a reference; `093#6` and `095#5` use fish sauce as a condiment; and `111#1` requests a tuna steak. None identifies either crappie species.

No recipe link or relink is proposed.

## Measurements, product states, and substitution limits

The Québec black-crappie profile reports observed lengths of 8–29 cm, possible length around 35 cm, and possible weight up to 1 kg; the Québec freshwater-fish poster lists an observed 76–289 mm range. Ontario’s white-crappie profile reports a 20–30 cm length range. These are species-identification or biological observations, not sold-package weights, edible yields, fillet sizes, household counts, recipe portions, or cooking conversions.

Ontario’s consumption guide gives meal-frequency advice for fish caught in particular Ontario waters, by species and fish length, in relation to contaminants. It is not a default recipe portion or transferable Québec food-safety advice. No reviewed source establishes a white-crappie retail product in Québec, a current Québec market listing, a species-specific Québec recipe, a product state, a fillet yield, a cooking method, storage guidance, or a safe cooking temperature. OQLF’s commercial-potential note for black crappie is not evidence of current retail availability. The evidence supports a named Canadian food-fish identity for white crappie, while Québec occurrence and market availability remain unestablished here.

- **Aliases:** none beyond each qualified English/French display pair.
- **Forms:** none; do not infer whole, gutted, filleted, skin-on/off, fresh, frozen, cooked, or preserved states.
- **Density and unit mappings:** none; use null density and empty mappings.
- **Measures, conversions, and yields:** none; no count, mass, volume, portion, edible-yield, or raw/cooked conversion is supported.
- **Substitutions:** none; black and white crappie are separate identities, and taxonomy or food-safety guidance does not establish recipe interchangeability. Do not assign hybrids, generic fish, perch, sunfish, rock bass, or another species as substitutes.
- **Recipe links:** none; the bundled corpus has no species-specific demand.

## Integration applied

1. Added `ingredient-ref-black-crappie` in `PROTEIN` with `nameEn: "black crappie"`, `nameFr: "marigane noire"`, empty aliases, null `defaultDensity`, and empty `unitMappings`.
2. Added `ingredient-ref-white-crappie` in `PROTEIN` with `nameEn: "white crappie"`, `nameFr: "marigane blanche"`, empty aliases, null `defaultDensity`, and empty `unitMappings`.
3. Added one verified `ingredient_reference` ledger record per ID with identity, geographic, and species-specific food sources. Both records use measurement state `researched_no_supported_value` and substitution state `researched_no_supported_substitute`; Ontario consumption guidance remains source context, not a catalog measure or Québec safety rule.
4. Added no ingredient forms, generic crappie/marigane reference, recipe link, conversion, yield, or substitution. Unqualified recipe terms remain unresolved and hybrids unassigned.
5. Kept yellow perch, Nile perch, Nile tilapia, rock bass, other sunfish, and unrelated black-labeled ingredients separate. See the [integration record](../batches/wp04-section-p-crappie-pair-identity-integration-20261012/README.md).

## Sources

Sources were accessed on 2026-10-12. Ontario white-crappie sources establish a Canadian bilingual species name and an Ontario wild-fish food identity. They do not establish Québec retail availability or Québec-specific terminology preference.

| Proposal source ID | Primary source | Evidence and limits |
|---|---|---|
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S01 | Office québécois de la langue française, [marigane noire (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198862/marigane-noire) | Pairs `marigane noire`, `black crappie`, and *P. nigromaculatus* in ichthyology and edible-fish terminology; notes commercial potential in Québec. Says `crapet calico` and `crapet noir` were not retained by the fish-product terminology committee and labels `perche argentée` France/Europe. It does not prove current sales or a kitchen measure. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S02 | Gouvernement du Québec, [Marigane noire species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/marigane-noire) | Pairs the bilingual black-crappie name and taxon; documents southern Québec/St. Lawrence presence, alternate names, body-size observations, and wild-fish consumption precautions. Does not establish a current retail listing, and its alternate names are not all suitable catalog aliases. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S03 | Fisheries and Oceans Canada, Powell and Plourde, [A Biological Synopsis of Black Crappie (*Pomoxis nigromaculatus*) (2025)](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41273990.pdf) | Confirms Canadian black/white *Pomoxis* species distinction and discusses difficult-to-identify hybrids. Its species and recreational-fishery coverage is not a current Québec market listing or culinary-measure source. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S04 | Gouvernement du Québec, [Poissons d’eau douce du Québec poster (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/faune/documents/animaux/affiche-poissons-eau-douce.pdf) | Lists `Marigane noire` with *P. nigromaculatus* and an observed size range. Supports Québec identification, not a portion or product measure. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S05 | Government of Ontario, [White Crappie species profile](https://www.ontario.ca/page/white-crappie) | Names White Crappie (*P. annularis*), calls it native to Ontario, and places its range in the lower Great Lakes; gives biological length of 20–30 cm. This is species/distribution evidence, not Québec occurrence, market evidence, or a recipe portion. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S06 | Gouvernement de l’Ontario, [Marigane blanche species profile](https://www.ontario.ca/fr/page/marigane-blanche) | Pairs French `marigane blanche` with *P. annularis*, identifies it as native to Ontario and gives the lower Great Lakes range and biological length. Ontario French naming evidence, not a Québec-specific term ruling. Page indicates update 2024-02-23. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S07 | Government of Ontario, [Guide to Eating Ontario Fish](https://www.ontario.ca/page/guide-eating-ontario-fish) | Lists White Crappie in its fish-consumption advisory and species material. The guide helps identify and prepare safe amounts of fish caught from more than 2,800 Ontario locations; advice depends on waterbody, species, and length. This is food/consumption evidence, not retail supply, a recipe, a universal serving size, or Québec safety guidance. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S08 | Gouvernement de l’Ontario, [Guide de consommation du poisson de l’Ontario](https://www.ontario.ca/fr/page/guide-de-consommation-du-poisson-de-lontario) | Lists Marigane blanche and provides Ontario-catch consumption guidance tied to location, species, and length. Supports the French food identity in Ontario only; not Québec market or terminology-preference evidence. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S09 | Government of Ontario, [2026 Ontario Fishing Regulations Summary (PDF)](https://www.ontario.ca/files/2025-12/mnr-2026-fishing-regulations-summary-en-2025-12-08.pdf) | Defines `crappie` for the summary as including both Black Crappie and White Crappie. Supports the broad English regulatory scope, not food identity or Québec usage. |
| WP04-SECTIONP-BLACK-CRAPPIE-20261012-S10 | Gouvernement de l’Ontario, [Résumé des règlements de la pêche de l’Ontario 2026 (PDF)](https://www.ontario.ca/files/2025-12/mnr-2026-fishing-regulations-summary-fr-2025-12-08.pdf) | Defines `marigane` for the summary as including both marigane noire and marigane blanche. Supports the broad French regulatory scope, not food identity or Québec usage. |

