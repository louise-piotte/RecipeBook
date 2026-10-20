# WP03 Section F R589 — quick-oats CNF 2026 access hold

Integrated the [R589 proposal](../../proposals/wp03-section-f-next-gap-review-r589-20261017.md) as a documentation-only access recheck for quick oats, CNF Food Code 1439.

## Result

Health Canada’s current CNF page says CNF 2026 is published as relational CSV files and that the 2015 online search remains available as an interim route. The official 2026 listing identifies the Food Name, Measure Weight Conversion, Measure Name, and Measure Type resources, but the browser could not read their contents. The resource page returned 403 or was unavailable through the browser, and the coordinator’s direct in-memory retrieval attempt failed at DNS for all four CSVs.

No CNF 2026 row-presence, row-absence, name, measure, or value claim is supported for Food Code 1439. The existing CNF 2015 page remains historical evidence only; it shows `Cereal, hot, oats, quick, dry, Quaker` / `Céréale, chaude, avoine (gruau), rapide, sèche, Quaker` and its existing 30 g servings. It does not substitute for a 2026 row join.

## Catalog and recipe state

No catalog or ledger data changed. Keep `ingredient-ref-quick-oats`, its current aliases, null density, empty unit mappings, no attached form, and its blocked measurement state. The R573 Quaker serving remains a branded observation, not a generic measure. The two existing recipe links and amounts remain unchanged.

The open CNF 2026 row-review task remains open. R589 records the failed access attempt so the next review can retry the four-file join without treating inaccessible data as evidence of missing rows. Its S01–S04 identifiers are proposal-local access-attempt labels, not research-ledger source IDs.

## Validation and scope

- Reviewed the open Section F plan item, the R573 quick-oats entry, the live reference, the quick-oats ledger record, forms, substitutions, and source ownership.
- Scanned all 114 manifest-listed recipes and 1,123 structured ingredient rows; exactly two rows remain linked to quick oats.
- Checked proposal-local source labels for collisions and checked local links, line anchors, UTF-8/no-BOM, and scoped whitespace.
- Updated the plan and roadmap to record the access hold while keeping the row join open.
- No database JSON changed. No software tests, build, emulator check, or deployment was needed or run.

## Sources

- Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), including CNF 2026 publication information and the interim 2015 online notice.
- Open Government Portal, [Canadian Nutrient File 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), which lists the four relational CSV resources.
- Health Canada, [CNF 2015 quick-oats Food Code 1439 serving page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1439&wbdisable=true), historical code and serving evidence only.
