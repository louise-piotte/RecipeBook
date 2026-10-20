# WP03 Section F R777 — CNF 2026 sorghum row access recheck — 2026-10-18

## Review record

- **Scope:** Recheck the still-open Health Canada CNF 2026 row join for Food Code **4432**, `Grains, sorghum / Grains céréaliers, sorgho`, on the existing grain-sorghum record and its R756 whole-grain forms.
- **Proposal-local finding ID:** `grain-sorghum-cnf2026-code-4432-row-join-unresolved-r777-20261018`.
- **Recommendation:** **Keep the code-4432 row join open and make no catalog or ledger change.** Health Canada currently describes CNF 2026 as downloadable relational CSV files, but this review could not retrieve the four row files through the browser. The accessible metadata and the older CNF 2015 serving page do not establish 2026 row presence, absence, names, preparation state, measure types, or values.
- **Boundary from R756:** [R756](wp03-section-f-next-gap-review-r756-20261018.md) added whole-grain dry and cooked forms based on USDA Food Buying Guide state and yield evidence. R777 does not reopen those form decisions, transfer the three older CNF portions to either form, or add another measurement observation.
- **Plan fit:** The open Section F checklist under “Dry versus cooked forms for remaining grains” explicitly leaves the CNF 2026 Food Code 4432 join unresolved after R756 ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4756)). [R580](wp03-section-f-next-gap-review-r580-20261017.md) had already documented an earlier access hold; this review records a fresh access check against the current Health Canada overview and Open Government listing.

## Current catalog, ledger, and ownership

The active reference is `ingredient-ref-grain-sorghum` (`grain sorghum / sorgho à graine`), category `GRAIN_AND_CEREAL`. Its aliases, null default density, empty unit mappings, and verified identity are unchanged. R756 has attached `ingredient-form-grain-sorghum-whole-dry` and `ingredient-form-grain-sorghum-whole-cooked`; each has an empty match-term list and null density. Their exact labels are searchable form hints, not separate ingredient identities.

The reference ledger currently has `measurementState: researched_supported` and three existing CNF 2015 code-4432 observations: 100 mL = 81.2 g, 250 mL = 202.9 g, and 1 serving = 20.0 g. These remain owned by source `WP03-SORGHUM-GRAINS-20261012-S03`, which describes the 2015 entry without specifying whole versus decorticated grain, raw versus cooked state, or packing method. R756's two form records each own its USDA source and one USDA-specific observation; neither has a CNF 2026 source. Preserve the existing measurement states and observations. Do not treat this inaccessible 2026 row review as evidence that a measurement value is unsupported or absent.

The current CNF 2026 resource URLs below are shared dataset-file URLs already referenced for other Food Codes. The ledger has no 2026 source or observation specifically owned by grain-sorghum Food Code 4432. R580's access-review IDs are proposal-local and were not added to the shared ledger. The R777 IDs in this proposal are likewise proposal-local access records only; do not add them or any observations to the ledger without row-level retrieval and verification. The R777 source-ID strings, proposal path, and proposal-local finding ID were checked against the ledger and archive and are not already allocated.

## Current authoritative source check

| Proposal-local source ID | Primary source and finding | Limit |
|---|---|---|
| `WP03-CNF2026-SORGHUM-4432-R777-S01` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). The current overview says the CNF is published as relational CSV files, identifies the 2026 guides and files, and says the online CNF 2015 remains available as an interim access route. | Establishes publication/access context, not Food Code 4432's 2026 record or any measure value. |
| `WP03-CNF2026-SORGHUM-4432-R777-S02` | Health Canada / Open Government Canada, [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). The current listing exposes the four relational resources below. | Resource metadata does not show their contents or code-4432 rows. The listing page returned 403 in this browser check. |
| `WP03-CNF2026-SORGHUM-4432-R777-S03` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv). | Direct browser retrieval reported that the URL was not accessible. No file bytes or food-name row were inspected. |
| `WP03-CNF2026-SORGHUM-4432-R777-S04` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Direct browser retrieval reported that the URL was not accessible. No conversion row, measure code, value, or type was inspected. |
| `WP03-CNF2026-SORGHUM-4432-R777-S05` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv). | Direct browser retrieval reported that the URL was not accessible. No English or French measure label was inspected. |
| `WP03-CNF2026-SORGHUM-4432-R777-S06` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv). | Direct browser retrieval reported that the URL was not accessible. No type label or interpretation was inspected. |
| Existing `WP03-SORGHUM-GRAINS-20261012-S03` | Health Canada, [CNF 2015 serving portions, Food Code 4432](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4432). | Confirms only the existing 2015 values and their state-unspecified source description; it cannot stand in for the CNF 2026 rows. |

The current Health Canada overview was opened on 2026-10-18. The official dataset listing and direct file URLs were checked through the browser tool; the listing returned 403 and each direct CSV URL was reported inaccessible. The search result for the official listing exposed the resource names and exact download URLs, but no CSV content. Therefore this check makes **no** row-presence or row-absence claim and reports no new Food Code 4432 label, serving, conversion, or preparation state.

## Picker projection and bundled recipe demand

I statically projected the current references and forms using the phrase-first matching behavior in `IngredientSearch.kt`:

| Query | Current result | R777 effect |
|---|---|---|
| `grain sorghum`, `sorgho à graine`, `sorgho en grains` | `ingredient-ref-grain-sorghum` | None. |
| Full dry or cooked whole-grain form label in English or French | `ingredient-ref-grain-sorghum`; the exact form label can supply the matching form hint | None. These do not add separate picker identities. |
| `sorghum`, `sorgho` | Six references: grain, puffed, flour, grits, semolina, and starch | None. No new identity or alias is proposed. |
| `dry sorghum`, `cooked sorghum` | No result | None. No broad parent alias is proposed. |

The manifest lists **114 recipe files** and **1,123 structured ingredient rows**. A scan of complete serialized recipe text and ingredient rows for `sorghum`, `sorgho`, the grain-sorghum reference ID, and the R756 whole-grain form IDs found zero file hits and zero row hits. There is no bundled recipe link or recipe-driven reason to assign the CNF observations to a form.

## Bounded disposition

- Keep `ingredient-ref-grain-sorghum`, both R756 forms, their source ownership, all existing observations, and current measurement states unchanged.
- Keep the 2026 Food Code 4432 row join open. Do not infer that a row is missing from the files, and do not transfer the 2015 observations to a dry or cooked form.
- Revisit only after the official Food Name, Measure Weight Conversion, Measure Name, and Measure Type files can be fetched and joined using their documented keys. If the joined 2026 food description still does not state preparation, retain that limitation when deciding whether an observation belongs to a form.
- Add no reference, alias, form, source record, measurement observation, density, unit mapping, active conversion, additional yield, recipe link, or substitution in this review.

## Review checks

- Checked the live Section F plan, R580 access hold and integration note, R756 form proposal and current catalog/ledger records.
- Rechecked Health Canada's current CNF overview, the official Open Government dataset listing, and all four direct CNF 2026 resource URLs; no CSV row contents were available through the browser.
- Checked proposal-local source IDs and the R777 proposal path against existing catalog, ledger, and proposal/archive ownership. The four resource URLs are generic shared CNF files, not code-4432 row evidence.
- Reproduced current picker projections from live references/forms and the search implementation; scanned all manifest-listed recipe files and structured ingredient rows.
- This is a standalone proposal only. No shared catalog, ledger, plan, roadmap, workflow, generated index, recipe, or app file was edited. No software tests, build, emulator, or deployment were run.
