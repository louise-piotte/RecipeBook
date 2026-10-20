# WP04 Section P — Arctic grayling / ombre arctique species and picker hold

- **Review date:** 2026-10-12.
- **Candidate:** *Thymallus arcticus*, Canadian common names `Arctic Grayling / Ombre Arctique`.
- **Accepted disposition:** **Hold** the prospective species reference unallocated.
- **Reason:** the source-backed names identify a real species and the evidence supports northern food use, but a row using the qualified displays would make bare `grayling` and `ombre` queries return this one species alone. The French query would also suppress two current cucumber fallback results. No Québec consumer naming or Québec availability was established by the reviewed sources.
- **Reconciliation:** the accepted hold is recorded in the [hold batch note](../batches/wp04-section-p-arctic-grayling-picker-hold-integration-20261012/README.md), the active plan, and the roadmap. No catalog or ledger data was added. This was documentation-only; no app, unit, instrumentation, or emulator tests were run.

## Candidate and boundary

The candidate is *Thymallus arcticus*. CFIA’s Fish List pairs it with `Arctic Grayling` and `Ombre Arctique`; Yukon’s French freshwater-fish guide also identifies `Ombre arctique` and gives the scientific name in its index. These sources support the species identity and the Canadian French name as a fish-listing term. They do not establish that Québec consumers use this term or that the species is available through Québec retail or food service.

Keep the name species-qualified. CFIA separately lists *Thymallus thymallus* as `Grayling / Ombre Commun`. Do not treat bare `grayling` or `ombre` as a unique identity, and do not merge this candidate with the existing Arctic char, brook trout, lake trout, or other Salmonidae references. `Thymallus arcticus` is the clearest scientific query if a future recipe or package identifies this species.

The reviewed northern-use evidence is bounded. Yukon’s freshwater-fish guide records Arctic grayling as an important early-spring food source for First Nations. In the Public Health Agency of Canada’s Foodbook 2.0 table of country-food exposures in the past seven days, the Yukon estimate for Arctic grayling is 0.6% (standard error 0.4; 95% confidence interval 0.0–1.3) and is flagged as based on a small sample. The question was not asked in the Northwest Territories or Nunavut. These observations support documented northern food use; they do not establish current commercial supply, a retail product, regular availability, or Québec use. [S03, S04]

## Exact ownership and live snapshot

The exact normalized-key audit covered active reference names and aliases, form labels and match terms, legacy-import names and aliases, ledger record IDs and text, the generated catalog, the Section P plan, and archived proposal and batch files. It used the same search normalization as `IngredientSearch.kt`: lowercase, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace.

| Prospective key or name | Active reference owner | Form owner | Legacy owner | Ledger/archive result |
|---|---|---|---|---|
| `ingredient-ref-arctic-grayling` | None; ID absent | None | None; ID absent | No ledger record or earlier candidate review |
| `Arctic grayling` / `Ombre arctique` | None | None | None | No prior focused review or hold |
| `Thymallus arcticus` | None | None | None | No record or source mention |
| `grayling` / `ombre` | No exact stored alias owner | None | None | No candidate ownership; the generic-query picker behavior is audited below |
| `WP04-ARCTIC-GRAYLING-20261012-` | — | — | — | No collision in the live ledger, proposal archive, batch archive, or plan; IDs below are proposal-local |

The live package snapshot was read on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Current count / bytes | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,322 references; 423,233 bytes | `6dbbf6e07afe5c4bffde815065d5eaf377e3b5446c068bab0d8965b5df711545` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,630 records; 5,992 source entries; 5,009 distinct source IDs; 8 conversions; 5,945,593 bytes | `c78b083f60d80d623805af87f2b4283811a55495ed4d5c11433a01742e174b13` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,322 references; 579,379 bytes | `2c1988ca630ddbca1174eba71d9fd574d23a11b441615d468a03a3bd0ac9b2fd` |

The package has no candidate form, reference link, recipe link, or candidate-specific package yield. Its current substitution-rule files contain no rules. The ledger’s eight conversions belong to other identities; none is assigned to this candidate.

## Phrase-first picker audit

The current picker normalizes search text and returns complete word-phrase matches before substring fallback. The following static projection applies that behavior to the current names, aliases, forms, and a hypothetical row with displays `Arctic grayling / Ombre arctique` and the scientific-name alias `Thymallus arcticus`.

| Query | Current live picker | With the hypothetical row | Boundary |
|---|---|---|---|
| `Arctic grayling` | No results | Arctic grayling / ombre arctique only, phrase-first | Species-qualified English query |
| `Ombre arctique` | No results | Arctic grayling / ombre arctique only, phrase-first | Species-qualified French query |
| `Thymallus arcticus` | No results | Arctic grayling / ombre arctique only, phrase-first | Species-qualified scientific query |
| `grayling` | No results | Arctic grayling / ombre arctique only, phrase-first | Bare query becomes a single species result even though CFIA also lists `Grayling / Ombre Commun` for *T. thymallus*. |
| `ombre` | `cucumber / concombre` and `orange-footed sea cucumber / holothurie touffue`, substring fallback | Arctic grayling / ombre arctique only, phrase-first | `ombre` occurs inside `concombre`; adding the qualified display changes this to a phrase hit and suppresses both current fallback results. |

Do not add the row or bare aliases now. The matching terms are embedded in the qualified displays, so omitting `grayling` and `ombre` from alias arrays would not prevent these broad-query results. Reopen only when picker behavior can keep the broad scope visible or a recipe/import supplies an unambiguous species-qualified name.

## Full recipe-corpus demand

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned. The phrase audit covered `Arctic grayling`, `Ombre arctique`, `grayling`, `ombre`, *Thymallus arcticus*, and `ingredient-ref-arctic-grayling` in complete parsed recipe text and ingredient fields, using normalized whole-word phrase matching.

**Result: zero matching recipe files and zero matching ingredient rows.** No current recipe calls for the species, its fillet or whole-fish product, or a preparation state. The present corpus supplies no recipe amount, count, package size, line link, or relink.

## Product, measurement, and substitution limits

Yukon’s guide reports biological size observations of 25–40 cm and 0.25–1 kg. These describe fish in a wildlife guide; they are not package weights, edible yields, household portions, recipe measures, or a basis for unit conversion. No reviewed source establishes whole, fillet, fresh, frozen, dried, or other market form for a Québec product. No density, unit mapping, quantity, or cooking yield is proposed.

No recipe demand or product specification supports substituting Arctic grayling for Arctic char, brook trout, lake trout, whitefish, or generic fish. Family membership, habitat, regional use, and the shared word `grayling` do not demonstrate culinary interchangeability. Add no form, measurement, conversion, yield, recipe link, or substitution while the candidate is held.

## Source register and limits

Sources were accessed on 2026-10-12. The source IDs below are unique to this proposal and were not added to the ledger.

| Proposal source ID | Primary source | Supports and limits |
|---|---|---|
| **WP04-ARCTIC-GRAYLING-20261012-S01** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), entries for *Thymallus arcticus* and *T. thymallus*. | Lists *T. arcticus* as `Arctic Grayling / Ombre Arctique` and *T. thymallus* as `Grayling / Ombre Commun`. The dynamic list is nomenclature evidence; by itself it does not establish Québec retail inventory or consumer usage. |
| **WP04-ARCTIC-GRAYLING-20261012-S02** | CFIA, [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Defines the list as French and English names acceptable for Canadian fish labelling and describes the commercial labelling scope. This is not an OQLF terminology ruling or evidence of current Québec product availability. |
| **WP04-ARCTIC-GRAYLING-20261012-S03** | Government of Yukon, [Liste des poissons d’eau douce du Yukon](https://yukon.ca/sites/default/files/env/env-yukon-freshwater-fishes-fr.pdf), pp. 29 and 34. | Uses `Ombre arctique`, identifies *Thymallus arcticus* in its index, describes Yukon freshwater habitat, records early-spring food use by First Nations, and reports biological size/weight ranges. The guide is regional natural-history material, not a current commercial product or Québec-market source. |
| **WP04-ARCTIC-GRAYLING-20261012-S04** | Public Health Agency of Canada, [Foodbook 2.0 Report](https://www.canada.ca/en/public-health/services/publications/food-nutrition/foodbook-report-2.html), Table 11, “Seafood,” and footnotes 11.3–11.4. | The Jan. 2023–Jan. 2024 survey reports past-seven-day Arctic grayling exposure of 0.6% in Yukon (SE 0.4; 95% CI 0.0–1.3), with a small-sample caution. It says the question was not asked in Northwest Territories or Nunavut. This indicates reported northern consumption, not sourcing channel, trade, product form, or Québec availability. |

The OQLF site was searched for `Arctic grayling`, `ombre arctique`, and *Thymallus arcticus*; no relevant edible-fish or consumer-name entry surfaced in this review. A current Québec retail or food-service listing was also not located. Therefore neither Québec consumer naming nor Québec availability is established here. CFIA’s French labelling name remains evidence of Canadian nomenclature only.

## Static checks

- Parsed the active reference, forms, legacy, ledger, manifest, recipe, substitution, and package-yield JSON files without modifying them.
- Rechecked normalized ownership and candidate ID absence across the active references, forms, legacy candidates, ledger, generated catalog, plan, and proposal/batch archive.
- Reproduced phrase-first then substring-fallback behavior from `IngredientSearch.kt` for the five queries shown above.
- Scanned all 114 manifest recipe paths / 1,123 ingredient rows and recorded the manifest-ordered corpus digest.
- Confirmed the proposal path and source-ID prefix were unused before writing this file.
- This was a documentation-only proposal. No app tests or emulator checks were run.
