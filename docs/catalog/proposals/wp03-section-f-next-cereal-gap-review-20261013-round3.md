# WP03 Section F — Bengali `chira` alias review (2026-10-13, round 3)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated. Added `chira` to the existing flattened-rice aliases and recorded the supporting sources plus one recipe-scoped portion observation in the ledger; see the [round-three integration note](../batches/wp02-wp03-wp04-round3-gap-review-integration-20261013/README.md). No recipe or active conversion data changed.
- **Scope:** Decide whether bare `chira`, the Bangladesh rice-flake name used by the reviewed regional and Canadian sources, should be an English search alias on the existing flattened-rice identity. This review does not reopen other regional aliases or poha grades.
- **Plan context:** The active Section F checkpoint says common rice-flake names and thin/medium/thick poha grades are integrated, while specialized regional terms and manufacturer-specific grades remain open ([active Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2280)).
- **Prior-review check:** The 2026-10-10 poha-grade batch explicitly left `chira` outside aliases for separate regional/product-scope review. The 2026-10-12 `aval` review mentioned `chira` only as an unallocated adjacent term, and the later `chiura`, `atukulu`, and `avalakki` reviews accepted those spellings individually. I found no focused `chira` decision in the proposal or batch archive. This review is therefore distinct from the accepted Nepali `chiura` alias and does not repeat it. See the [poha-grade batch](../batches/poha-thickness-synonyms-integration-20261010/README.md), [aval review](wp03-section-f-regional-cereal-mix-next-gap-review-20261012.md), [chiura review](wp03-section-f-chiura-beaten-rice-alias-boundary-review-20261012.md), and [round-two avalakki review](wp03-section-f-next-cereal-gap-review-20261013-round2.md).

## Recommendation

**Integrate only bare `chira` as an English alias on `ingredient-ref-flattened-rice-poha`.** Bangladesh Rice Research Institute material calls the product “flattened rice” or “Chira”; PRAN’s manufacturer label and a current Toronto-area product listing use the same name for flattened rice. Keep the current English and Québec French displays, current French aliases, category, and forms unchanged. Create no new ingredient identity, form, or legacy candidate.

| Field | Proposed disposition |
| --- | --- |
| Existing owner | `ingredient-ref-flattened-rice-poha` |
| English display | Keep `flattened rice (poha)` |
| Québec French display | Keep `flocons de riz (poha)` |
| English aliases | Add only `chira` |
| French aliases | Keep `riz aplati` and `riz battu`; add none |
| Category | Keep `GRAIN_AND_CEREAL` |
| New identity, form, or legacy candidate | None |
| Recipe links or recipe edits | None |
| Density, active unit mapping, conversion, yield, or substitution rule | None |

Treat `chira` as one regional search name for the existing plain flattened-rice ingredient. Do not add the product/process-qualified `Dheki Chira`, soaked `Chira, veja`, or prepared `Chira moa` wording as global aliases or forms. Keep red-rice flakes, corn poha, brown-rice flakes, puffed rice, and prepared rice-flake snacks within their existing boundaries.

## Ownership and prior-decision audit

The read-only audit used the repository’s NFKD/accent/punctuation-folded normalized search key. It covered active reference names and aliases, form labels and match terms, all legacy candidate names and aliases, ledger strings/decisions, and the Section F proposal/batch archive.

| Artifact | Review-time state and exact-key result |
| --- | --- |
| Active ingredient references | 1,338 references; 147 in `GRAIN_AND_CEREAL`. No exact normalized owner for `chira`, `chire`, `chira rice`, `chira flakes`, `chira veja`, `Dheki Chira`, `chira poha`, `chira upma`, `dahi chira`, or `chira bhaja`. |
| Ingredient forms | 98 forms. No exact form label or match term for those candidate phrases. The existing flattened-rice forms are only thin, medium, and thick commercial poha. |
| Legacy import identities | 64 candidates. No exact candidate name, alias, or identifier for `chira` or the checked qualified variants. |
| Research ledger | 1,646 records, 6,225 source entries, and 5,229 distinct source IDs. No exact `chira` string, source, or decision is present. The existing poha record already owns identity and accepted synonym decisions, the accepted `chiura`, `aval`, `atukulu`, and `avalakki` aliases, the source-scoped no-generic-measure finding, and the blocked grade-substitution finding. |
| Proposal and batch archive | `chira` appears as an explicit pending term in the 2026-10-10 poha-grade batch and as a no-owner neighbor in the 2026-10-12 `aval` audit. No earlier focused `chira` alias/identity proposal or decision was found. The accepted `chiura` review is specifically about Nepalese `chiura`; it does not allocate Bengali `chira`. |

Current ownership of the nearest active records is:

| Reference | Current names and aliases | Boundary |
| --- | --- | --- |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`; English aliases `beaten rice`, `flaked rice`, `rice flakes`, `chiura`, `aval`, `atukulu`, `avalakki`; French aliases `riz aplati`, `riz battu` | Correct owner for the bare flattened-rice product name. `defaultDensity` is null and `unitMappings` is empty. |
| `ingredient-ref-red-rice-flakes` | `red rice flakes / riz rouge aplati`; aliases `red rice poha`, `poha rouge` | Keep explicit red-rice wording separate. |
| `ingredient-ref-corn-poha` | `corn poha / poha de maïs`; maize-qualified aliases | Keep maize flakes separate from rice flakes. |
| `ingredient-ref-brown-rice-flakes` | `brown rice flakes / flocons de riz brun` | Keep the brown-rice product separate. |
| `ingredient-ref-puffed-rice` and `ingredient-ref-rice-cereal` | Puffed rice and crispy rice cereal identities | Keep both separate from flattened rice. |

The three existing forms attached to the flattened-rice row are `ingredient-form-flattened-rice-poha-thin`, `ingredient-form-flattened-rice-poha-medium`, and `ingredient-form-flattened-rice-poha-thick`; each has `densityGPerMl: null`. No form is proposed for `chira`.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds search terms, returns complete normalized word-phrase matches first, and uses substring fallback only when no complete phrase matches. The projection below applies that current rule to the live reference/form rows, then models the single proposed alias. It is static code/data analysis, not live picker QA.

| Query | Current projection | With only `chira` added |
| --- | --- | --- |
| `chira` | `ingredient-ref-canna-starch` as a partial match through its alias `achira starch` | `ingredient-ref-flattened-rice-poha` as the sole complete-phrase result; this suppresses the unrelated partial match |
| `achira starch` | `ingredient-ref-canna-starch` as a complete-phrase result | Same exact result: `ingredient-ref-canna-starch` |
| `chira rice`, `chira flakes`, `chira veja`, or `Dheki Chira` | No result | No result; none is proposed as an alias or form phrase |
| `chiura` | `ingredient-ref-flattened-rice-poha` | Unchanged |
| `chuda` | No result | No result; not reviewed or added |
| `poha` | Three results: generic flattened rice, red rice flakes, and corn poha | Unchanged |
| `rice flakes` | Three results: brown rice flakes, generic flattened rice, and red rice flakes | Unchanged |
| `riz aplati` or `riz battu` | `ingredient-ref-flattened-rice-poha` | Unchanged |

The one-word alias fixes the current bare-query collision by winning the phrase-first pass. It does not alter the exact `achira starch` lookup or broaden a query to qualified phrases.

## Recipe-demand audit

A read-only scan covered every recipe path in the current bundled manifest, the full serialized recipe JSON, every ingredient row, and existing reference links. Terms included `chira`, `chire`, `chira rice`, `chira flakes`, `chira poha`, `chira veja`, `Dheki Chira`, `chirar polao`, `chira moa`, `chiura`, `chuda`, `chiwda`, `chivda`, the active flattened-rice aliases, and the current English and French poha names.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Candidate/neighbor phrase hits in complete recipe files | 0 |
| Candidate/neighbor phrase hits in ingredient rows | 0 |
| Existing links to `ingredient-ref-flattened-rice-poha` | 0 |
| Recipe-file bytes | 753,792 |
| Manifest-order corpus fingerprint | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The fingerprint hashes each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order. The corpus has no `chira` demand, poha ingredient line, measure, form-specific use, or recipe link; no recipe change is proposed.

## Identity and naming evidence

The best primary regional source is the Bangladesh Rice Research Institute’s 2022–23 annual report. Its Grain Quality and Nutrition section calls the product “flattened rice, or ‘Chira’” and separately identifies *chira moa* as a snack made from puffed and flattened rice. The report says that market survey covered three Bangladesh districts, so it supports a Bangladesh regional product name and a boundary against the composite snack, not a universal process specification.

PRAN’s current manufacturer page labels its product `PRAN Flattened Rice (Chira)` and gives Bangladesh as country of origin. The current HalalHub category page, whose footer identifies Toronto, Ontario, lists `Pran FLATTENED Chira 500g` from Bangla Town Grocery for local delivery and shows it in stock. This directly supports current Canadian English retail wording. It remains marketplace/SKU evidence, not a Québec terminology ruling.

The Bangladesh Food Composition Table separately lists `Rice flaked / Chira` and `Rice flakes, white grain, water-soaked / Chira, veja`. This supports the plain-product relation and shows that the soaked name is a state-qualified entry. Do not add `veja` or a soaked form to the active alias. The table’s values are published per 100 g edible portion; its `1.00` is the edible-portion coefficient, not a density or kitchen conversion.

No reviewed Canadian French page or Québec terminology authority uses `chira` as a French label. Keep `flocons de riz (poha)`, `riz aplati`, and `riz battu` unchanged; current Canadian French support is already recorded under `WP03-S95` and `WP03-POHA-GRADES-20261010-S02`.

## Measurement, forms, and substitutions

### Source-scoped measurement observations

The current poha ledger record has `measurementState: researched_no_supported_value`; the active reference has null density and no unit mappings. One reviewed recipe source does give a bounded household amount: FAO/BBF’s Bangladesh complementary-feeding booklet lists **60 g, 3 fistfuls** of chira for its *Chirar Polao* formula, for children aged 9–11 months and 12–23 months. Record this only as one published recipe portion if accepted, for example as `relationship: portion_weight`, `sourceQuantity: { amount: 3, unit: "fistful" }`, `observedMassG: 60`, and `evidenceKind: published_portion`, linked to source `WP03-CHIRA-20261013-R3-S04`.

The source does not define a standard fist size, a cup capacity, a fill/packing method, a universal chira grade, or a general adult recipe portion. It gives 70 g of water and reports a 230 g cooked dish/one bowl and two servings, but those figures belong to the whole egg/vegetable/oil/water recipe and do not establish a plain-rice-flake yield. Its footnote says that using *Dheki Chira* requires more soaking water and soaking time, without giving an adjustment amount. Therefore:

- If the 60 g / 3 fistful observation is added to the poha record, set its research state to `researched_supported` for the existence of this bounded observation; keep `defaultDensity: null` and `unitMappings: []`.
- Do not turn `3 fistfuls` into a reusable `1 fistful = 20 g` mapping, a cup conversion, a default density, a package yield, or a cooking-yield rule.
- The FAO table’s 9.9 g water per 100 g for `Rice flaked / Chira` and 73.2 g water per 100 g for the distinct `Chira, veja` soaked entry are proximate composition values, not density. Keep the soaked entry outside active forms and aliases.
- PRAN’s 200 g pouch and HalalHub’s 500 g marketplace SKU are package quantities only, not portions or conversion evidence.
- Leave the three current thin/medium/thick poha forms unchanged; all their active densities remain null. Do not infer that bare `chira` names one of those grades.

### Substitutions

No reviewed source recommends replacing chira with another grain, replacing another ingredient with chira, or exchanging thin/medium/thick poha grades at a ratio for a defined dish and method. The *Chirar Polao* ingredient list and its *Dheki Chira* soaking note are recipe/preparation context, not substitution instructions. The current poha ledger state remains `substitutionResearchState: blocked_pending_evidence`, and its existing no-grade-interchangeability finding remains unresolved. Add no same-ingredient form conversion, contextual ingredient substitution, warning, or recipe-line substitution link.

## Source register and source-ID audit

The four new IDs below were checked against all 5,229 distinct source IDs in the live ledger and all 5,747 distinct source-ID tokens in the proposal/batch archive; none is allocated elsewhere. The Bangladesh Food Composition Table is cited under its existing ledger ID `WP06-SA-20261010-S19` rather than given a duplicate ID. That existing source entry is currently on a different record and points to other table rows; if reused on the poha record, use a locator for entries `01_0010`–`01_0011` and the measurement limits stated above.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP03-CHIRA-20261013-R3-S01` | Bangladesh Rice Research Institute, [Annual Report 2022–23](https://objectstorage.ap-dcc-gazipur-1.oraclecloud15.com/n/axvjbnqprylg/b/V2Ministry/o/office-brri/2024/12/b135fc29b4f04df696380cfd901fc11f.pdf), Grain Quality and Nutrition, PDF pp. 87–88 (printed pp. 68–69). Accessed 2026-10-13. | Primary Bangladesh rice-research source calls flattened rice `Chira` and distinguishes composite `chira moa`. The market survey is limited to three districts; the report does not give a household measure or substitution. |
| `WP03-CHIRA-20261013-R3-S02` | PRAN Foods, [PRAN Flattened Rice (Chira)](https://www.pranfoods.net/brand/product/109), product details. Accessed 2026-10-13. | Manufacturer’s exact product name; lists Bangladesh origin and a 200 g pouch. Supports name and product identity; package weight is not a household portion. |
| `WP03-CHIRA-20261013-R3-S03` | HalalHub, [Flattened & Puffed Rice](https://halal-hub.ca/products?category=flattened_puffed_rice&page=3), `Pran FLATTENED Chira 500g` listing from Bangla Town Grocery. Accessed 2026-10-13; page indexed three weeks earlier. | Current Canadian listing names the product, shows local delivery/in-stock status, and identifies Toronto, ON, Canada in the site footer. Supports Canadian English product wording only; the 500 g is a SKU package size. |
| Reused `WP06-SA-20261010-S19` | Food and Agriculture Organization / Institute of Nutrition and Food Science, University of Dhaka, [Food Composition Table for Bangladesh](https://www.fao.org/fileadmin/templates/food_composition/documents/FCT_10_2_14_final_version.pdf), 2013, PDF p. 27, entries `01_0010` and `01_0011`; general basis PDF p. 11. | Regional technical table names flaked rice `Chira` and water-soaked white-grain rice flakes `Chira, veja`. Values are per 100 g edible portion; `1.00` is the edible-portion coefficient. Moisture composition is not density or a kitchen measure. The URL already has this ID in the live ledger for unrelated table entries; reuse the ID and do not allocate a duplicate. |
| `WP03-CHIRA-20261013-R3-S04` | FAO / Bangladesh Breastfeeding Foundation, [Complementary feeding for children aged 6–23 months, English recipe booklet](https://www.fao.org/fileadmin/user_upload/nutrition/docs/education/resources/by_country/Bangladesh/EN-Recipe_booklet_complementary_feeding_English.pdf), *Chirar Polao*, ingredient table and footnotes. The FAO country-materials page lists the English and Bengali booklet; accessed 2026-10-13. | Publishes one recipe-scoped `60 g / 3 fistfuls` amount, its child-age/texture scope, and a *Dheki Chira* soaking note. The source does not define fist volume or support generic conversion, density, yield, or substitution. |

## Review-time baseline snapshot

Read-only snapshot after `avalakki` integration and before this proposal. SHA-256 values cover exact file bytes; the corpus fingerprint uses the manifest-order path/NUL/file-bytes/NUL method above.

| Artifact | Current count/state | SHA-256 or fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,338 references; 147 `GRAIN_AND_CEREAL` | `2e7900418e95d420b0fe16f44d64e870f59c032e0134b187375d329698e3a88a` |
| `ingredient-forms.v1.json` | 98 forms; three attached to flattened rice/poha | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; no exact `chira` owner | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,646 records; 6,225 source entries; 5,229 distinct source IDs | `43a6523376af96b26ab0bc7c7c23c56dc66b1c44f029cdb7fa49e169257c7436` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,338 references | `3fe619271d9f59f865bd4955651b655f824b26b2f9652b98586f0e3cf4958596` |
| `package-yields.v1.json` | One package-yield record; none for flattened rice/poha | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Global substitution rules | 0 rules; none for flattened rice/poha | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0 rules; none for flattened rice/poha | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Disposition

Integrated the single English alias `chira` on `ingredient-ref-flattened-rice-poha`. Reused the existing Bangladesh Food Composition Table source ID for its newly reviewed rice-flake entries and allocated the four unique source IDs above. Recorded the *Chirar Polao* `60 g / 3 fistfuls` amount only as a published recipe-scoped portion for the complete formula for one 230 g cooked bowl and two servings; marked measurement research `researched_supported`. Active density, mappings, yields, recipe links, and substitution rules remain unchanged. The current English/French displays, French aliases, three poha-grade forms, red/brown/corn rice-flake boundaries, and blocked grade-substitution finding are preserved. Static checks and the database-data testing exemption are recorded in the [integration note](../batches/wp02-wp03-wp04-round3-gap-review-integration-20261013/README.md).
