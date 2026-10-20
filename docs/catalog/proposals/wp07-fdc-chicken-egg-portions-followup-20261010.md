# WP07 Proposal: FoodData Central Chicken-Egg Portion Follow-up

**Review date:** 2026-10-10  
**Status:** Historical initial proposal-only retrieval review. The coordinator later retrieved the official April 2026 Foundation Foods archive and integrated three exact count portions as ledger-only observations; see wp07-fdc-chicken-egg-archive-retrieval-20261010.md. Snapshot counts and access limits below describe this initial review.

**Coordinator resolution:** The official archive confirms 50.3 g for one Grade A, Large whole egg without shell, 34.0 g for one white, and 17.0 g for one yolk. The exact rows, source limits, and ledger disposition are in the linked archive-retrieval packet above. Runtime states remain blocked; no cross-market mapping or individual-egg variability range was inferred.

## Disposition

The live evidence ledger still has 23 source-qualified `count_weight` observations for chicken whole egg, egg white, and egg yolk (13 / 5 / 5). The official FoodData Central (FDC) search page confirms three Foundation Foods egg records by their NDB numbers and descriptions. FDC's public search extraction does not expose their detailed measure rows; the current item API requires an API key, and the official April 2026 ZIP could not be parsed by the available browser reader. Therefore, this proposal does **not** treat exact FDC weights as verified evidence.

Third-party transcriptions point to potentially useful FDC portions: whole egg without shell at 50.3 g, one white at 34 g, and one yolk at 17 g. If the official records confirm those exact rows, the whole-egg and white values would be source-specific additions alongside existing USDA SR28 values of 50 g and 33 g, respectively. The 17 g yolk portion would be another source-specific confirmation of the existing SR28/HG72 value, not a new mass result. These mirror values are discovery leads only. Retrieve the official detail payload or official April 2026 Foundation Foods `food_portion` data before adding any numeric row to the shared ledger.

Do not average FDC and existing values, map an unspecified egg count, derive shell-on weight or a shell fraction, or add density. The relevant recipes explicitly include both large and unsized eggs, and the FDC Foundation item wording does not itself publish a portion-weight variability interval.

## Live snapshot and prior proposal audit

The current ledger records 13 whole-egg portions, five whites, and five yolks. Every row uses `relationship: count_weight`, `valueUnit: g`, a source-specific food description and state, an explicit method/basis, `evidenceKind: published_portion`, source IDs, and a `sourceQuantity` object. The three ingredient-reference measurement states remain `blocked_pending_evidence`; there is no egg form, active mapping, or default density.

The existing 23 rows were re-read individually: whole egg contains seven CNF portions (six size-labelled one-egg portions plus a separate two-large portion), three USDA HG72 size-labelled portions, and three USDA SR28 size-labelled portions. White contains CNF large-one and unsized-three portions, a Foodtasia two-large-white recipe target, one HG72 large-white portion, and one SR28 large-white portion. Yolk contains three CNF portions (large-one, unqualified-two, unqualified-four), one HG72 large-yolk portion, and one SR28 large-yolk portion. No FDC numeric portion is present in those rows.

The earlier proposal, [WP07 chicken egg count-to-mass evidence review](wp07-chicken-egg-count-mass-evidence-review-20261010.md), already recorded the three FDC Foundation search hits as an unresolved lead: NDB 1123 whole, 1124 white, and 1125 yolk. It correctly made no numeric claim because it could not read the item portions. The duck/quail proposal concerns other species and contributes no chicken-egg portion rows. No other proposal in the reviewed corpus contains FDC count-to-edible-mass data for these three chicken-egg records.

| Snapshot artifact | Current count / size | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 703 references / 222,185 bytes | `424578020c8f6d75f2bd2025f5a6abc17d379d681eaeffcdf8a5ea94e103cc39` |
| Ingredient forms | 34 forms / 23,272 bytes | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 892 records / 1,814,626 bytes | `cfc06a40c19721554aef2ab8a6ab39dbdd4302cf502907acb5debd28710a70fe` |
| Recipe set | 114 recipe files; fingerprint method and value match the prior proposal | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

The recipe fingerprint is calculated over manifest-listed paths sorted by relative path, then path bytes, NUL, raw file bytes, NUL. This confirms the recipe corpus is unchanged from the previous proposal snapshot.

## Official FDC records and retrieval result

The [official FDC Foundation search for eggs](https://fdc.nal.usda.gov/food-search/?query=eggs&type=Foundation) lists:

| Official search description | NDB number | FDC item ID found in a third-party transcription | Exact portion row status |
| --- | ---: | ---: | --- |
| Eggs, Grade A, Large, egg whole | 1123 | 748967 | Not confirmed from the official item payload |
| Eggs, Grade A, Large, egg white | 1124 | 747997 | Not confirmed from the official item payload |
| Eggs, Grade A, Large, egg yolk | 1125 | 748236 | Not confirmed from the official item payload |

USDA's [Foundation Foods documentation](https://fdc.nal.usda.gov/docs/Foundation_Foods_Documentation_Apr2024.pdf) says Foundation Foods provide sample and acquisition detail. Its portions are in grams of edible material without refuse; portion weights are data-type-specific and are exposed in the measure tab or `food_portion` download file. The [current FDC download page](https://fdc.nal.usda.gov/download-datasets/) lists an April 2026 Foundation Foods JSON release. The [FDC API guide](https://fdc.nal.usda.gov/api-guide/) documents `GET /food/{fdcId}` as the food-details endpoint and says an API key is required for every request.

Retrieval checks on 2026-10-10:

- The public FDC search extraction returned the three names, NDB numbers, and 2019-07-08 search dates, but not serving-weight values.
- The official April 2026 ZIP link was available from the download page, but the browser reader rejected the `application/zip` response as unsupported.
- The documented API endpoint and the FDC item-detail route did not return a readable payload through the available browsing path. Direct workspace network lookup also failed at DNS resolution. The API guide's documented low-rate `DEMO_KEY` does not change this retrieval limitation.
- No official item JSON or `food_portion` row was available to inspect. Consequently, FDC portion descriptions, weights, and any entry-level method notes are still unverified here.

## Discovery-only portion leads

These values appear in a non-USDA mirror that labels its pages as USDA FDC Foundation Foods data. They are useful search targets, not primary-source confirmation and not eligible as shared ledger evidence by themselves.

| Mirrored FDC item | Mirrored portion row | Existing ledger comparison | Proposal disposition |
| --- | --- | --- | --- |
| FDC 748967 / NDB 1123, whole egg | `1 egg`, description `whole without shell`, 50.3 g; the mirror also shows a separate 50 g generic-weight row with no clear count description | USDA SR28 and HG72 each report 1 large edible egg = 50 g; CNF reports 1 large = 52.7 g | Possible source-specific addition only if the official row confirms the explicit 50.3 g count portion. Do not infer that the ambiguous 50 g row is another one-egg measure. |
| FDC 747997 / NDB 1124, egg white | `1 egg white`, 34 g; the mirror also shows a 50 g row with no clear count description | CNF, SR28, and HG72 each report 1 large white = 33 g; one recipe-specific source reports 2 large whites = 60 g | Possible distinct count portion if the official row confirms 34 g and its size/item basis. Keep separate from 33 g. |
| FDC 748236 / NDB 1125, egg yolk | `1 egg yolk`, 17 g | SR28 and HG72 report 1 large yolk = 17 g; CNF reports 1 large yolk = 16.1 g | Exact published-mass match to two current U.S. observations. A verified FDC row would add independent source provenance, but no new count weight; keep it out of a “new weight result” tally. |

Discovery links: [FDC 748967 mirror](https://fooddata.the50.store/foods/748967-eggs-grade-a-large-egg-whole), [FDC 747997 mirror](https://fooddata.the50.store/foods/747997-eggs-grade-a-large-egg-white), and [FDC 748236 mirror](https://fooddata.the50.store/foods/748236-eggs-grade-a-large-egg-yolk). These pages are third-party mirrors and were not used to certify any exact source claim in this proposal.

The same mirror lists analyzed sample records, but those concern Foundation nutrient/sample metadata. They do not establish egg portion-weight sample counts or a distribution/range for the published household measure. Do not convert a sample count for composition values into a variability range for the serving weight.

## Candidate ledger shape after official verification

If official FDC detail or download rows verify the descriptions and gram weights above, keep the observations attached to their existing ingredient-reference IDs and preserve the item-specific scope. Suggested observation IDs:

| Candidate observation ID | Ingredient reference | Conditional value | `sourceQuantity` |
| --- | --- | ---: | --- |
| `WP07-EGG-FDC748967-whole-without-shell` | `ingredient-ref-egg` | 50.3 g | `{ "amount": 1, "unit": "egg, whole without shell" }`; proposed source `WP07-FDC-EGG-20261010-S01` |
| `WP07-EGG-FDC747997-large-white` | `ingredient-ref-egg-white` | 34 g | `{ "amount": 1, "unit": "large egg white" }`; proposed source `WP07-FDC-EGG-20261010-S02` |
| `WP07-EGG-FDC748236-large-yolk` | `ingredient-ref-egg-yolk` | 17 g | `{ "amount": 1, "unit": "large egg yolk" }`; proposed source `WP07-FDC-EGG-20261010-S03` |

The unit strings above retain the portion name and the item size qualifier; they do not create application units or conversions. For each confirmed row, use the current ledger shape:

```json
{
  "observationId": "WP07-EGG-FDC748967-whole-without-shell",
  "relationship": "count_weight",
  "value": 50.3,
  "valueUnit": "g",
  "foodDescription": "Exact FDC food description, with FDC ID and NDB number",
  "foodState": "Exact FDC state and portion description; distinguish edible contents from shell-on egg",
  "measurementMethod": "USDA FDC Foundation Foods item portion record and exact data release",
  "quantityBasis": "This FDC item and named portion only; source country/grade qualifier retained",
  "evidenceKind": "published_portion",
  "sourceIds": ["WP07-FDC-EGG-20261010-S01"],
  "sourceQuantity": {"amount": 1, "unit": "egg, whole without shell"}
}
```

Do not use the conditional values or wording in this example until the official `food_portion` row is in hand. The official item descriptions shown by FDC search do not explicitly say “chicken”; retain the same species inference caveat already documented for generic USDA whole-egg records. A white or yolk row is edible egg-part mass, not whole-egg mass.

## Existing-observation collisions and recipe demand

If confirmed, the potential portion leads compare as follows:

- **Whole egg:** 50.3 g would be close to SR28/HG72's integer 50 g and below CNF's 52.7 g. Keep the value at its FDC-published precision and preserve the U.S. Grade A Large/raw/fresh/without-shell qualifiers. Do not round it into, average with, or replace the SR28 value.
- **White:** 34 g would differ from CNF/SR28/HG72's 33 g large-white entries. A one-white row must not be substituted for the Foodtasia two-large-white, 60 g recipe-specific target.
- **Yolk:** 17 g exactly matches the SR28 and HG72 one-large-yolk masses, while CNF reports 16.1 g for one large yolk. If retained, mark it as another source-qualified portion record and explicitly identify it as corroboration, not a new weight result.
- **Ambiguous unlabelled 50 g rows:** the mirrored whole and white pages also show 50 g entries with a blank portion name. The current view does not establish those as a one-egg or one-white portion; exclude them unless official FDC metadata resolves their quantity and measure.

The current manifest has 114 recipes. A fresh scan found 62 linked egg-part lines across 55 recipe files: 48 whole eggs, 8 whites, and 6 yolks. Source text explicitly identifies 26 large whole eggs and one medium whole egg; 20 whole-egg lines have no size, and one uses a 150 g mass amount. For whites, five lines say large and three are unsized; for yolks, four say large, one is unsized, and one is a 60 g mass amount. The Amaretti recipe says “2 large egg whites (60 g),” so its own quantity is already explicit and source-specific. This demand supports preserving size and form qualifiers; it does not select FDC's U.S. Large item as the answer for unsized recipe lines.

## Initial recommendation and completed follow-up

1. Keep the existing 23 observations unchanged and the three runtime measurement states blocked.
2. Retrieve official FDC details for IDs 748967, 747997, and 748236 using a key-enabled `/food/{fdcId}` request, or download the April 2026 Foundation Foods ZIP and inspect the matching `food_portion` entries.
3. Verify exact FDC IDs, `dataType`, item descriptions, portion `amount`, `modifier`, `portionDescription`, `gramWeight`, and `dataPoints`/food-state context. Record only fields actually present; do not interpret composition sample metadata as portion-weight variability.
4. If official rows confirm 50.3 g whole egg and 34 g white, add them as distinct ledger-only observations. Decide whether the verified 17 g yolk portion merits a separate source record as corroboration; do not count it as a novel mass value.
5. Preserve all current CNF, SR28, HG72, and recipe-specific conflicts. Add no general count conversion, density, shell factor, or recipe relink.

## Sources

- **[S1]** USDA Agricultural Research Service, [FoodData Central Foundation search: eggs](https://fdc.nal.usda.gov/food-search/?query=eggs&type=Foundation), accessed 2026-10-10. Locator: Foundation Foods results for NDB 1123, 1124, and 1125; item labels and displayed search dates only.
- **[S2]** USDA Agricultural Research Service, [FoodData Central Foundation Foods Documentation](https://fdc.nal.usda.gov/docs/Foundation_Foods_Documentation_Apr2024.pdf), April 2024 edition. Locators: Foundation sample-data description; “Weights”/portion discussion; portions are edible grams and FoodData Central exposes food-specific portion weights in the measure tab or food-portion download.
- **[S3]** USDA Agricultural Research Service, [FoodData Central Download Datasets](https://fdc.nal.usda.gov/download-datasets/), accessed 2026-10-10. Locator: latest Foundation Foods release table lists April 2026 JSON/CSV downloads.
- **[S4]** USDA Agricultural Research Service, [FoodData Central API Guide](https://fdc.nal.usda.gov/api-guide/), accessed 2026-10-10. Locators: API Details endpoint `/food/{fdcId}`; API key requirement and documented `DEMO_KEY` access.
- **Proposed source IDs if later integrated:** `WP07-FDC-EGG-20261010-S01` for FDC 748967 / NDB 1123; `...-S02` for FDC 747997 / NDB 1124; and `...-S03` for FDC 748236 / NDB 1125. Reserve them only after the official records and exact portions are confirmed.
- **[L1]** FoodData Explorer, [FDC 748967 whole egg transcription](https://fooddata.the50.store/foods/748967-eggs-grade-a-large-egg-whole), third-party discovery lead only; not accepted as official evidence.
- **[L2]** FoodData Explorer, [FDC 747997 egg-white transcription](https://fooddata.the50.store/foods/747997-eggs-grade-a-large-egg-white), third-party discovery lead only; not accepted as official evidence.
- **[L3]** FoodData Explorer, [FDC 748236 yolk transcription](https://fooddata.the50.store/foods/748236-eggs-grade-a-large-egg-yolk), third-party discovery lead only; not accepted as official evidence.
- **[P1]** Current shared ledger `docs/catalog/research-ledger.v1.json`, records `ingredient-ref-egg`, `ingredient-ref-egg-white`, and `ingredient-ref-egg-yolk`; SHA-256 and counts in the snapshot table above.
- **[P2]** [Prior WP07 chicken egg review](wp07-chicken-egg-count-mass-evidence-review-20261010.md), including the earlier FDC retrieval gap and recipe-line audit.

## Review checks

- [x] Audited all 23 integrated chicken-egg `count_weight` observations and existing FDC follow-up note.
- [x] Confirmed official FDC Foundation search records and documented the current retrieval path and its limits.
- [x] Compared discovery-only mirrored portions against CNF/SR28/HG72/Foodtasia observations without asserting the mirror as primary evidence.
- [x] Re-scanned the manifest-listed recipe lines and confirmed the existing 114-file recipe fingerprint.
- [x] Kept this work proposal-only; no shared data, code, roadmap, plan, or tests were edited.
- [x] Retrieve and verify the three official FDC `food_portion` rows; completed in wp07-fdc-chicken-egg-archive-retrieval-20261010.md with ledger-only observations and no runtime mapping.
