# R861–R863 — Generic ingredient identity integration

Integrated 2026-10-19. This batch adds three generic culinary identities: potato flakes, common purslane, and witch flounder. It does not expand any brand, product-line, flavor-family, or retailer-specific roster.

## Decisions

- **WP02 R861 — Potato flakes:** added identity-only `potato flakes / flocons de pommes de terre` as a dehydrated potato ingredient. Kept it distinct from potato flour, potato starch, granules, whole potato, and `papa seca`. OQLF's French term and process description date to 1982; that limitation is recorded for future review. The manufacturer source describes a generic processing class. No product-specific measurements, industrial applications, or formulation claims were generalized.
- **WP03 R862 — Common purslane:** added identity-only `common purslane / pourpier commun` for *Portulaca oleracea*, with the narrow aliases `purslane / pourpier`. Kept it separate from waterleaf (*Talinum fruticosum*), parsley, other *Portulaca* species, and the collision-prone `pursley` spelling. No foraging guidance or edible-part claims for other species were added.
- **WP04 R863 — Witch flounder:** added identity-only `witch flounder / plie grise` for *Glyptocephalus cynoglossus*, without aliases. Kept the species separate from the multi-species flounder and sole market groups and other flatfish identities. The DFO French-language profile returned HTTP 500; OQLF supports the Québec French display, and no claim depends on the inaccessible page. CFIA Fish List and the DFO 2026 management plan are reused from existing ledger sources.

The recipe bundle has no exact matching demand for these three identities. No forms, measures, densities, mappings, conversions, yields, recipe links, or substitutions were added. Existing branded references and their product-scoped evidence remain untouched.

## Scope queue review

The cross-category plan audit found no open checklist task whose sole objective is a brand/product roster. The Section F cereal-mix item remains generic ingredient-diversity work. Section K's Broccolini mention is an existing trademark alias exclusion, not a queued task; it was not researched or expanded. Additional branded products, product lines, flavors, and retailer-only variants remain out of scope because commercial roster size is not ingredient diversity. Existing data were not deleted, merged, or generalized.

## Sources

- [R861 potato flakes proposal](../../proposals/wp02-generic-flour-starch-diversity-review-r861-20261019.md)
- [R862 common purslane proposal](../../proposals/wp03-generic-produce-herb-diversity-review-r862-20261019.md)
- [R863 witch flounder proposal](../../proposals/wp04-generic-seafood-diversity-review-r863-20261019.md)
- [Generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)

## Validation

The bundled seed-package normalization and schema checks passed; the generated Kotlin catalog index is current at 1,895 references. Additional scoped checks cover ledger schema, ID/source ownership, picker projection, recipe corpus, UTF-8/no-BOM, escaped Unicode in database JSON, Markdown links and plan anchors, and whitespace. No software tests, build, emulator, or deployment were run because the catalog data changes only add database JSON, as allowed by `AGENTS.md`.
