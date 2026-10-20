# WP06 Ethiopian koseret herb identity review

- **Date:** 2026-10-16
- **Status:** Proposal only; no shared catalog, ledger, plan, or roadmap edits made.
- **Scope:** One Ethiopian culinary herb candidate under the still-open African cuisine coverage item in Section 05. This is distinct from the recent korarima and kuli-kuli proposals and from all currently active African identities.
- **Recommendation:** Accept a source-named, identity-only `koseret` candidate for coordinator review. Use the borrowed name `koseret` in both locales; add no aliases pending stronger source-local label evidence and Québec terminology review.

## Open-plan fit and prior-work boundary

Section 05 still has an open coverage item for North Africa, West Africa, Central Africa, the Horn, East Africa, and Southern Africa. Its earlier six-region sweep and the 2026-10-13 continuation integrated bounded identities but left the broader African cuisine item open. Section Z's open African pantry work is adjacent; its remaining named examples focus on condiments and souring ingredients, while this candidate is a dry herb. This packet does not claim to close either checklist.

The archive, live catalog, forms, legacy candidates, and ledger were searched for `koseret`, spelling variants, and the botanical names below. No active or recent proposal for koseret was found. This packet excludes korarima, kuli-kuli, egusi, fonio, dried oyster/Yokhoss, and the other active or recently reviewed African ingredients. It also does not reopen the Section Z groundnut-paste/red-palm boundary or make the herb an alias or mandatory ingredient of niter kibbeh.

## Live package snapshot

Counts and hashes were refreshed from the shared worktree on 2026-10-16 before drafting. Hashes cover exact file bytes. The recipe aggregate follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, its exact recipe file bytes, and a NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,595 references | 515,344 | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 122 forms | 92,787 | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `docs/catalog/legacy-import-identities.v1.json` | 61 candidates | 14,525 | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `docs/catalog/research-ledger.v1.json` | 1,940 records; 8,388 source entries; 7,128 distinct source IDs | 8,465,405 | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe JSON aggregate | 114 files; 1,123 ingredient rows | — | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The proposed reference ID `ingredient-ref-koseret`, target proposal path, and proposal-local source-ID prefix `WP06-KOSERET-20261016-S` were absent from active references, forms, legacy IDs, the research ledger, and the proposal archive at audit time. Recheck at any later integration.

## Candidate and identity boundaries

| Candidate reference ID | Proposed English / fr-CA display | Category | Alias recommendation |
|---|---|---|---|
| `ingredient-ref-koseret` | `koseret` / `koseret` | `HERB` | No aliases. Keep the source-named borrowed term in both locales. Do not add generic translations such as `Ethiopian oregano`, `herbe éthiopienne`, or `verveine d’Afrique` without exact culinary and Québec terminology evidence. |

The Ethiopian Biodiversity Institute (EBI) describes the cultivated variety locally called koseret and distinguishes it from a wild variety. It reports dried leaves as a traditional ingredient in spiced butter and as a food flavoring. Kew's current backbone accepts *Lippia abyssinica* and lists *Lippia adoensis* and *L. adoensis* var. *koseret* as synonyms. The proposed identity therefore follows the Ethiopian culinary name, not a claim that every plant sold under a broader *Lippia* or *verbena* label is the same product.

EBI's document also calls *L. adoensis* “also known as *L. multiflora*”; Kew currently accepts *Lippia multiflora* as a separate species. Do not carry that broad crosswalk into the catalog. Keep the proposed ingredient limited to the source-named Ethiopian cultivated koseret product and leave botanical synonymy outside its alias list.

| Query or boundary | Live ownership or evidence | Disposition |
|---|---|---|
| `koseret`, `kosseret`, `koserete`, `koseret leaf/leaves` | No exact active-reference, form, legacy, ledger, or proposal owner. | A new identity is supported for the source spelling `koseret`. Hold other spellings and compositional phrases from aliases until an ingredient label or regional source establishes them. |
| `Lippia adoensis`, `Lippia adoensis var koseret`, `Lippia abyssinica` | No exact current active-reference, form, legacy, or ledger owner. Kew treats *L. abyssinica* as accepted and the two *L. adoensis* names as synonyms; Ethiopian sources retain the locally relevant variety name. | Keep scientific names in provenance and boundary notes, not user-facing culinary aliases. The source scopes are not fully taxonomically aligned. |
| `Lippia multiflora` | No exact current catalog owner. EBI's identification sheet equates it with *L. adoensis*, while Kew accepts *L. multiflora* separately. | Hold the cross-species alias; preserve this authority disagreement explicitly. |
| `niter kibbeh`, `spiced butter` | Active `ingredient-ref-niter-kibbeh` is a fat identity; `spiced butter` has no exact catalog owner. | Koseret is described as an herb used in some Ethiopian spiced-butter preparation. Keep the herb separate from the prepared butter and do not infer that every niter kibbeh contains koseret. |
| `oregano`, `thyme`, `basil`, `rosemary` | Active examples include `ingredient-ref-dried-oregano`, `ingredient-ref-thyme`, `ingredient-ref-basil`, and `ingredient-ref-dried-rosemary`, all in the `HERB` category. | These are neighboring culinary herbs, not aliases or substitutions. Aroma comparisons do not establish equivalence. |
| Wild *L. adoensis* var. *adoensis* | EBI distinguishes the wild variety from the cultivated variety locally called koseret. | Do not merge the wild variety into this culinary identity or add a botanical-variety alias. |
| `lemon herb`, `Gambian tea bush`, `African verbena`, `butter-clarifying herb` | No exact catalog owner found; these are broader or descriptive names and were not established as Québec culinary terms in this review. | Hold from global aliases. The EBI document's separate *L. multiflora* crosswalk adds reason to avoid broad common-name merges. |

The normalized-key audit covered English/French reference names and aliases, form labels and match terms, legacy identities, and candidate IDs. The current search behavior prioritizes complete word-phrase matches and then falls back to substring matches. A live `koseret` or `Lippia` probe has no result; `niter kibbeh` and `oregano` continue to return their own active references. No form, density, unit mapping, conversion, yield, substitution, or product-state mapping is proposed.

## Bundled recipe demand

All 114 manifest-listed recipes and 1,123 ingredient records were scanned, including serialized recipe text and ingredient rows. Exact normalized probes for `koseret`, `kosseret`, `koserete`, `koseret leaf/leaves`, `Lippia adoensis`, `Lippia adoensis var. koseret`, `Lippia abyssinica`, and `Lippia multiflora` returned zero full-recipe and zero ingredient-line matches.

The active niter-kibbeh reference is a nearby catalog boundary, not bundled recipe demand for its herb ingredient. No recipe link or recipe line is proposed. The EBI's use description does not establish a universal niter-kibbeh formula, a measure, a preserved-butter safety process, or a substitution for oregano or another herb.

## Sources and limits

Sources were checked on 2026-10-16. Source IDs are local to this proposal and have not been entered in the shared research ledger.

| ID | Source and locator | Claim used and limit |
|---|---|---|
| **WP06-KOSERET-20261016-S01** | Ethiopian Biodiversity Institute, Genetic Resources Access and Benefit Sharing Directorate, [“Identification of *Lippia adoensis* for Access and Benefit sharing”](https://ebi.gov.et/wp-content/uploads/2022/02/Identification-of-Lippia-adoensis.pdf), reviewed by Dr. Zeleke W/Tenssay, 2016. | Identifies the cultivated variety locally called koseret, distinguishes it from a wild variety, and reports dried leaves used in spiced butter and food flavoring. It is an institutional ethnobotanical profile, not a uniform retail specification or food-preservation validation. |
| **WP06-KOSERET-20261016-S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Lippia abyssinica*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:863497-1). | Accepts *L. abyssinica* and lists *L. adoensis* and *L. adoensis* var. *koseret* as synonyms; its range covers multiple African regions. Supports taxonomic context, not a universal culinary name. |
| **WP06-KOSERET-20261016-S03** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Lippia multiflora*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:863736-1). | Accepts *L. multiflora* as a separate species. This contradicts the EBI profile's broad “also known as” statement for *L. adoensis*; the proposal does not adopt that crosswalk. |
| **WP06-KOSERET-20261016-S04** | Addis Ababa University repository, [“Studies on Phenolic Contents and Biofunctional Activities of Selected Ethiopian Spices and Herbs”](https://etd.aau.edu.et/items/325417d7-755e-484a-93f4-237c9cea623d), M.Sc. thesis, 2015. | Lists *Lippia adoensis* var. *koseret* among Ethiopian food-flavoring herbs. It is academic corroboration, not a source for a fixed dried form, amount, preservation method, or a Québec French name. |

No OQLF entry or Québec product label for koseret surfaced in the targeted terminology search. The borrowed display is therefore preferred over an invented translation. The EBI profile's preservation statement is recorded only as a reported traditional use; it does not support food-safety or storage instructions. No quantitative or substitution evidence is proposed.

## Next actions

1. Coordinator: decide whether to add `ingredient-ref-koseret` as an identity-only `HERB` row with `koseret` displayed in English and fr-CA.
2. If accepted, keep aliases empty unless a direct product label or Québec/community source supports exact additional wording. Recheck catalog, form, legacy, ledger, and recipe ownership at integration time.
3. Keep wild *Lippia* varieties, *L. multiflora*, broad verbena/oregano names, and prepared niter kibbeh outside this identity. Add no forms, recipe links, measurements, densities, mappings, conversions, yields, or substitutions.
4. Continue the open African regional coverage review; this candidate does not close Section 05 or Section Z.

This deliverable is proposal documentation only. No tests, build, emulator, or deployment checks were run.
