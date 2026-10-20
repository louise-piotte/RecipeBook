# WP04/WP12 Proposal: CNF 2026 Portion Retrieval Check

**Review date:** 2026-10-10  
**Status:** The initial 2026-10-10 retrieval audit was followed by a successful official-file download and row comparison on 2026-10-11; see the addendum and [integration batch](../batches/wp04-wp12-cnf-2026-portion-retrieval-integration-20261011/README.md).

## 2026-10-11 successful retrieval addendum

The four official CSV resources were downloaded directly after the research connector and ordinary shell DNS had failed. The Food Name, Measure Name, Measure Type, and Measure Weight Conversion tables were joined by their published `Food_Code`, `Measure_Code`, and `Measure_Type_Code` fields. The exact user-defined count portions and separate refuse rows are:

| Ingredient / CNF food row | Exact CNF 2026 measure row | Mass | Separate refuse row |
| --- | --- | ---: | ---: |
| Raw garlic, code 2394, *Allium sativum* | code 482, `1 clove` / `1 gousse` | 3 g | 13%, total refuse; knob and skin |
| Raw onion, code 2401, *Allium cepa* | code 139, `1 large` / `1 gros` | 150 g | 10%, total refuse |
| Raw carrot, code 2380, *Daucus carota* | code 1244, `1 small (14cm long)` / `1 petit (14cm long)` | 50 g | 11%, total refuse |
| Raw leek, code 2396, *Allium ampeloprasum* | code 149, `1 leek` / `1 poireau` | 89 g | 56%, total refuse; tops, root ends and skin |
| Red-ripe raw tomato year-round average, code 2460, *Solanum lycopersicum* | code 1298, `1 large whole (7.6cm dia)` / `1 gros entier (7.6cm dia)` | 182 g | 9%, total refuse |

The five exact rows are now recorded as source-specific `count_weight` observations in their ingredient-reference ledger records. Garlic and leek corroborate the existing USDA observations. The large onion observation is kept distinct from USDA ERS's one-medium-onion 110 g assumption. Carrot's 14 cm length and tomato's 7.6 cm diameter remain explicit: neither dimension appears in its recipe wording, so those observations do not assign a mass to the recipe lines. The leek's named bulb/lower-leaf food record and separate refuse value remain attached to its observation. No active unit mapping, recipe amount, form, yield, or substitution changed.

Official CSV resource links:

- [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv)
- [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv)
- [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv)
- [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv)

## Disposition

Health Canada has published the Canadian Nutrient File (CNF) 2026 as relational CSV files, including Food Name, Measure Name, Measure Type, and Measure Weight Conversion. The official resource listing and direct download paths are discoverable, but the 2026 files could not be retrieved in this environment: direct portal opens were inaccessible/403, the portal API was inaccessible through the research connector, and shell `curl` could not resolve `open.canada.ca`.

Therefore none of the five historical 2015 count portions below can yet be compared with a CNF 2026 food-description and measure-weight row. Keep all five values provisional under the prior review. Do not create a 2026 source-specific ledger observation from the resource listing alone. No FoodData Central match was used as a substitute.

The exact recipe-line UUIDs and current ingredient-reference mappings are included so the next retrieval pass can join evidence to demand without widening scope. The current mappings are from the bundled recipe lines; this proposal does not change them.

## Pre-integration reference snapshot

Use the historical baseline in [the produce count and edible-portion gap review](wp04-wp12-produce-count-edible-portion-gap-review-20261010.md), specifically its “Live snapshot before integration” table. That snapshot recorded the 114-recipe set and catalog/ledger hashes before integration of that proposal. This retrieval follow-up does not recompute those hashes and makes no canonical changes.

## Five provisional portions and recipe demand

The 2015 codes and values below are reproduced from source IDs `WP04-WP12-PRODUCE-20261010-S01` through `S05` in the prior review. They are historical evidence only. The 2026 food names, measure labels, weights, and field relationships remain unverified here.

| Food / 2015 CNF locator | Current mapping and exact recipe ingredient-line IDs | Prior published portion (2015 only) | 2026 comparison result |
| --- | --- | --- | --- |
| Raw garlic; 2015 food code 2394 | `ingredient-ref-garlic`: `4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-2` (1 clove, minced); `4cbff09a-679f-420c-89e2-4175fb8e8662-ingredient-5` (2 cloves, finely chopped); `6cd92702-2256-4fc5-8f41-91ca188b4fbf-ingredient-6` (2 cloves, chopped); `e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-5` (3 cloves, chopped); `d356eec5-b3c4-4e22-b943-63900317e569-ingredient-10` (2 garlic cloves, minced); `1d0098bc-da72-40b3-ab68-d128d7ba0c3c-ingredient-4` (2 garlic cloves, coarsely chopped); `89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-11` (3 cloves, minced); `834bade3-bdda-432f-a4a6-1cb0fec6f065-ingredient-6` (1 clove, grated); `7239d74f-e895-421d-96e4-09a049546aa1-ingredient-7` (1 clove, minced); `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-4` (4 cloves, crushed). | *Garlic, raw*: 1 clove = 3.0 g edible portion; refuse 13% (knob and skin). The measure has no clove-size qualifier. | **Not comparable yet.** 2026 Food Name and measure rows were not retrieved. The recipe wording is clove-specific; stored units vary between `clove` and `count`. Do not apply to size-qualified cloves elsewhere. |
| Raw onion; 2015 food code 2401 | `ingredient-ref-onion`: `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-3` (1 large onion, chopped). | *Onion, raw*: 1 large = 150.0 g edible portion; refuse 10%. The historical page has no medium portion. | **Not comparable yet.** Need the 2026 generic onion description plus a matching large measure row. Do not carry the 2015 food code or weight forward. |
| Raw carrot; 2015 food code 2380 | `ingredient-ref-carrot`: `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-6` (4 small carrots, diced). | *Carrot, raw*: 1 small (14 cm long) = 50.0 g edible portion; refuse 11%. | **Not comparable yet.** Need the 2026 carrot description and the exact small-size measure. The recipe says “small” but gives no length. |
| Raw leek; 2015 food code 2396 | `ingredient-ref-leek`: `1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-2` (1 leek). | *Leeks (bulb and lower-leaf portion), raw*: 1 leek = 89.0 g edible portion; refuse 56%. | **Not comparable yet.** Need the 2026 food description and one-leek measure. Preserve the historical entry’s edible bulb/lower-leaf basis; it is not whole-leek gross weight. |
| Large raw tomato; 2015 food code 2460 | `ingredient-ref-tomatoes`: `7f200ce7-8ce5-4f82-97aa-e3eccebc2fd7-ingredient-1` (4 large tomatoes, diced). | *Tomato, red, ripe, raw, year-round average*: 1 large whole (7.6 cm diameter) = 182.0 g edible portion; refuse 9%. | **Not comparable yet.** Need a matching 2026 red-ripe raw food description and large-whole measure. The recipe gives “large” but no diameter or cultivar. |

### Ledger disposition

No candidate 2026 `published_portion` observation is recommended because no exact 2026 food/portion pair was read from the official files. The source IDs below document the dataset and retrieval paths only; they are not measurement evidence and should not be attached to a portion observation. Retain the earlier 2015 candidate values as provisional and out of the canonical ledger pending a successful 2026 comparison.

If the official files later verify an exact food description and exact count measure with a published gram weight, propose only that source-specific observation, retaining the exact 2026 source description, portion label, food/measure identifiers, and weight. If the official measure is absent or differs, record no match. Do not infer a missing size, derive a count from volume, apply a density, scale one portion to another size, or turn these observations into runtime count conversions.

## Official source register and retrieval record

These proposal source IDs are supplemental references, not ledger insertions.

| Source ID | Official source and locator | What it establishes / access result |
| --- | --- | --- |
| `WP04-WP12-PRODUCE-20261010-S20` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Health Canada says CNF 2026 is published in relational Excel-compatible CSV files, identifies a 2026 database-structure/file-content guide, and says the 2015 CNF online remains an interim measure. The page was readable. It does not give the five requested portion values. |
| `WP04-WP12-PRODUCE-20261010-S21` | Open Government Portal, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), record ID `1b6139bd-ed7e-4043-bc28-ff00e10f3109`. | The portal listing exposed publication date 2026-05-14, release date 2026-05-19, and a metadata revision dated 2026-10-04 during this check. Its indexed resource listing gave the download paths below. The dataset page itself returned 403 when opened directly here; metadata visibility is not file-content verification. |
| `WP04-WP12-PRODUCE-20261010-S22` | Open Government Portal, [CNF 2026 database structure and file content description](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e0cafc22-f564-4524-b82a-9ad7554f57ef/download/canadian-nutrient-file_database-structure-and-file-content-description_2026.pdf). | Health Canada describes this guide as the document for linking relational files and understanding database fields. The guide download could not be opened from this environment, so no join key or field interpretation is asserted here. |

Official 2026 data paths listed on the portal record:

- All resource files ZIP: [cnf_fcen_all-files-data_2026.zip](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip)
- Food Name CSV: [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv)
- Measure Name CSV: [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv)
- Measure Type CSV: [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv)
- Measure Weight Conversion CSV: [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv)

Retrieval attempts on 2026-10-10:

1. The portal dataset listing was available to the web search index, exposing the metadata and resource links. Directly opening the dataset page returned `403 Forbidden`.
2. Direct web opens of the ZIP, Food Name CSV, Measure Name CSV, Measure Type CSV, Measure Weight Conversion CSV, and structure-guide PDF were reported inaccessible or returned an internal fetch error. The CKAN `package_show` and `datastore_search` API URLs were also inaccessible through the web connector.
3. A local direct-download check for the Measure Weight Conversion CSV failed before HTTP access because DNS could not resolve the portal host:

   ```sh
   curl --fail --location --max-time 15 --silent --show-error \
     'https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv' | head -c 500
   ```

   Observed error: `curl: (6) Could not resolve host: open.canada.ca`.

## Comparison hold and boundary risks

Resume only when the official files can be downloaded and parsed. Use the published 2026 structure guide to resolve the actual relational keys; then inspect Food Name, Measure Name, Measure Type, and Measure Weight Conversion rows for the five exact food descriptions and count qualifiers above. Record source row identifiers and the exact unit/weight fields before deciding whether any match exists. The failure to retrieve the data is not evidence that a portion is absent.

Potential identity collisions to resolve from the actual 2026 rows:

- Garlic: raw whole garlic vs prepared, dried, or other garlic forms; no size-specific clove inference.
- Onion: generic raw onion vs variety-specific, cooked, or prepared descriptions; the recipe mapping is generic onion.
- Carrot: “small” measure vs any dimension-specific or alternative count measure.
- Leek: whole-count wording vs the historical bulb/lower-leaf edible-part definition and its large refuse share.
- Tomato: red-ripe raw year-round average vs other raw states, varieties, or prepared forms; “large” may have a dimension definition.

These are unresolved collision checks, not confirmed 2026 alternatives. Keep refuse and edible-portion semantics attached to the source record if the 2026 documentation provides them; do not add the historical refuse percentage to the listed edible weight. Do not reinterpret recipe preparation (minced, chopped, diced, crushed, grated) as a source portion or cooked yield.

## Scope and validation

This proposal adds no active count conversion, density, or measurement observation. It changes no canonical seed, ledger, recipe, plan, or roadmap file. No tests were run.
