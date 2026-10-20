# WP04 Section P — alewife / gaspareau picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Proposal-only finfish identity, Québec naming, picker-scope, and full-corpus review.
- **Disposition:** Keep alewife / gaspareau (*Alosa pseudoharengus*) out of the active catalog for now. Primary sources support the species and Québec name, but the canonical French search phrase `gaspareau` also denotes a two-species fishery group in Maritime and Government of Canada sources. The current picker would return the species row alone for that phrase, with no way to expose the broader market scope.
- **Worktree scope:** This is the only file written by this review. Shared catalog data were read only. No app tests were run.

## Bounded decision

Section P still has an open regional-fish identity checklist. The American-shad packet and integration note mention gaspareau/alewife only as a distinct neighboring species; neither reviewed or allocated the alewife identity. This review closes that exact naming and picker question without changing shared data.

The species name itself is well supported. OQLF prefers Québec French **gaspareau**, classifies it as an edible fish, and pairs it with English **alewife** and *Alosa pseudoharengus*. Fisheries and Oceans Canada has matching English and French species profiles. CFIA’s Fish List also lists Alewife / Gaspareau for *A. pseudoharengus* and lists blueback herring / alose d’été under the separate *A. aestivalis* taxon.

The picker boundary blocks a safe allocation today. DFO’s 2021 Maritimes fishery plan says alewife and blueback herring are collectively called `gaspereau` there and that harvesters generally do not distinguish them. TERMIUM Plus likewise records `gaspareau` and `hareng de rivière` as names used collectively for both taxa in one terminology record; another record uses those names for *A. pseudoharengus* alone. These are context-dependent scopes for the same bilingual search surface. Because the app searches both display names globally, setting `gaspareau` as the French display would make the unqualified query return only *A. pseudoharengus*, even though a Maritime fishery request may refer to both species.

**Recommendation: hold active allocation of `ingredient-ref-alewife` until the picker can represent or disambiguate the species-specific Québec identity and the broader `gaspereau` fishery usage.** Do not add a reference or ledger record in the meantime. Revisit if a future picker change can show both scopes or if a recipe/product source provides an unambiguous species-specific request and display.

The provisional species-scoped identity, if that boundary is resolved later, would be:

| Candidate ID (unallocated) | Category | English display | fr-CA display | Taxon | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-alewife` | PROTEIN | alewife | gaspareau | *Alosa pseudoharengus* | None proposed |

Do not use the provisional row as permission to resolve a recipe line that only says `gaspereau`, `gaspereau fishery`, `river herring`, or `herring`.

## Prior-work and ownership boundary

The live Section P checklist at `docs/RecipeBook-global-ingredient-catalog-plan.txt` still leaves the broader fish and regional-fish item open. Its American-shad entry explicitly keeps gaspareau and herring outside the American-shad identity. A current exact-name scan of the plan, active catalog, proposal archive, batch archive, legacy candidates, and research ledger found no focused alewife/gaspareau review, hold, active reference, or legacy allocation. The only focused archive hits are the American-shad proposal and integration note, both of which keep the species separate.

Exact ownership was checked using the normalization in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, Unicode NFKD, accent folding, compatibility folding for `œ` / `æ` / `ß` and `&`, then punctuation and whitespace normalization.

| Phrase or key | Active reference | Active form | Legacy candidate | Ledger record ID | Finding |
|---|---|---|---|---|---|
| `alewife`; `gaspareau`; `gaspereau`; *Alosa pseudoharengus* | None | None | None | None | No exact owner. |
| `faux hareng`; `hareng fluvial`; `hareng de rivière`; `river herring` | None | None | None | None | No exact owner; several are listed as common names, but some have broader fishery use. |
| `blueback herring`; `alose d’été`; *Alosa aestivalis* | None | None | None | None | No exact owner; keep this separate species out of the provisional alewife row. |
| `ingredient-ref-alewife` | None | None | None | None | Proposed ID is unallocated. |

The ledger has two contextual mentions, neither of which allocates alewife: `ingredient-ref-american-shad` lists gaspareau/alewife as a separate species in its no-substitution rationale, and `ingredient-ref-atlantic-herring` says to keep river herring outside Atlantic herring. These records are cross-species boundary notes, not alewife research records.

### Picker behavior

Current results were read from the live reference and form JSON using the same complete-phrase-first, substring-fallback behavior as `IngredientReferenceSearchIndex`.

| Query | Current picker result | If the provisional row were added |
|---|---|---|
| `alewife` | No result | The provisional alewife identity. |
| `gaspareau` | No result | The provisional alewife identity, although the phrase also has a documented collective fishery use. This single-result behavior is the hold reason. |
| `gaspereau` | No result | Still no result without adding it as an alias. Do not add it: it is an English variant and is also used collectively. |
| `river herring` / `hareng de rivière` | No result | Still no result if excluded from aliases; source scope is not consistently species-only. |
| `faux hareng` / `hareng fluvial` | No result | Still no result if excluded from aliases. OQLF prefers `gaspareau` for Québec. |
| `herring` / `hareng` | Atlantic herring and Pacific herring | Unchanged; the provisional names add neither term. |
| `blueback herring` | No result | Still no result; *A. aestivalis* is outside this review. |
| `shad` / `alose` | American shad | Unchanged; alewife is a distinct species. |

The identity pair is not in dispute; the global one-result behavior for the French display phrase is. A species-only result would conceal the separately documented Maritime catch-group scope. Do not broaden the row with aliases such as `gaspereau`, `river herring`, `hareng de rivière`, generic `herring` / `hareng`, `shad` / `alose`, or alternate herring names. Do not add the scientific name as a search alias.

## Full bundled-recipe audit

All 114 paths in the bundled manifest were read in manifest order. The scan inspected the 1,123 ingredient rows and every string in each complete recipe JSON for alewife, gaspareau/gaspereau, *A. pseudoharengus*, the CFIA common-name variants, river herring, blueback herring, alose d’été, and *A. aestivalis*. It found **zero matching ingredient rows and zero matching recipe files**. A separate whole-phrase scan found no generic `herring` or `hareng` wording in the recipe JSON either.

There is no species-specific ingredient line, recipe link, or recipe demand to support active allocation. No recipe amount can be relinked to this fish.

## Aliases, forms, numeric data, conversions, and substitutions

- **Aliases:** None proposed. OQLF lists `gaspereau` as an English term and CFIA lists other common-name entries, but adding them would broaden the global picker surface. DFO and TERMIUM document collective use for some of these terms. `gasparot` is not proposed; OQLF says the variant was not retained by the fish-product terminology committee.
- **Forms:** None. No recipe requests fresh, whole, fillet, roe, smoked, dried, salted, canned, or another product state. The separate Section P preserved-fish and roe reviews remain in force.
- **Density and unit mappings:** No supported g/mL density or volume-to-mass mapping. If a future active reference is justified, leave density null and unit mappings empty.
- **Measurements and conversions:** DFO’s species profile reports biological fish length and body weight (marine fish are usually under 30 cm and around 400 g; landlocked populations are smaller). These are specimen observations, not edible portions, fillet measures, count weights, recipe servings, or purchase yields. Add no active measure, g↔oz mapping, count conversion, package amount, edible yield, or cooking yield. CFIA’s Fish List flags the species as subject to histamine production; this label-list hazard is not a cooking rule or numeric conversion.
- **Substitutions:** No supported directed recipe substitution was found. Do not map alewife to blueback herring, Atlantic/Pacific herring, American shad, or another fish based on family, habitat, common-name overlap, or fishery grouping. If later allocated after picker disambiguation, record no supported substitute until a source establishes a specific dish, method, direction, and quantity adjustment.
- **Recipe links:** None. The corpus contains no matching term or species-specific request.

## Live snapshot

Counts and hashes below were refreshed from the shared worktree immediately before this proposal was finalized. File hashes cover exact bytes. The recipe corpus digest follows the manifest’s stored `recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, exact file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,270 references | `6559f9b7af6928c73c4f6c84edf21e56a455ebc9d313d07882618f421ad59354` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,578 records; 5,577 source entries; 4,613 distinct source IDs | `924213ec3b353a9c94eda878e17e9322ee246580a9039d3a8277beb38c18aba6` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Sources checked

The IDs below are proposal-local and were checked against the live ledger and existing proposal/batch source IDs. Sources support naming and search scope only; none supplies recipe measurements or substitution guidance.

| Source ID | Source | What it supports and limits |
|---|---|---|
| `WP04-ALEWIFE-GASPAREAU-PICKER-20261012-S01` | OQLF, [gaspareau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198866/gaspareau) | Prefers Québec French `gaspareau`, places it in zoology/ichthyology and edible fish, and pairs it with English `alewife` and *Alosa pseudoharengus*. It calls the fishery commercially potential in Québec; this is not proof of current retail availability. It says `gasparot` was not retained by the fish-product terminology committee. |
| `WP04-ALEWIFE-GASPAREAU-PICKER-20261012-S02` | Fisheries and Oceans Canada, [Alewife species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/alewife-gaspareau-eng.html) | Identifies Alewife as *A. pseudoharengus* and lists additional English names. Its lengths and weights describe fish biology, not portions or culinary conversions. |
| `WP04-ALEWIFE-GASPAREAU-PICKER-20261012-S03` | Pêches et Océans Canada, [Gaspareau species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/alewife-gaspareau-fra.html) | Uses `Gaspareau` for *A. pseudoharengus* and gives the same species profile in French. Its biological sizes are not kitchen measures. |
| `WP04-ALEWIFE-GASPAREAU-PICKER-20261012-S04` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | The current list pairs *A. pseudoharengus* with Alewife / Gaspareau and additional common-name entries, while separately listing *A. aestivalis* as Blueback Herring / Herring – Alose d’été. The overview says the list provides common names acceptable for Canadian fish labelling. It also flags histamine hazard for these taxa; that is not recipe data. |
| `WP04-ALEWIFE-GASPAREAU-PICKER-20261012-S05` | DFO, [2021 Gaspereau Integrated Fishery Management Plan, Maritimes Region](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/gaspereau-gaspareau/index-eng.html) | Says alewife (*A. pseudoharengus*) and blueback herring (*A. aestivalis*) are collectively known as `gaspereau` in the Maritimes fishery and that harvesters tend not to distinguish them. This documents fishery-group usage, not a recipe equivalence. |
| `WP04-ALEWIFE-GASPAREAU-PICKER-20261012-S06` | Government of Canada Translation Bureau, [TERMIUM Plus: gaspareau](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=GASPAREAU) | Record 1 says `gaspareau` and `hareng de rivière` can refer collectively to *A. pseudoharengus* and *A. aestivalis*; a separate record uses those terms for *A. pseudoharengus* alone. The differing scopes are the ambiguity relevant to the picker. |

Keep the Section P regional-fish parent item open. No catalog, ledger, plan, roadmap, recipe, generated file, or implementation change is proposed by this packet.
