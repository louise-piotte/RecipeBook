# WP02/WP03/WP04 R716–R718 integration — 2026-10-18

Integrated two evidence-backed ledger updates and one picker-boundary hold. The reviewed catalog parents remain open.

## Decisions

- **R716 — polvilho azedo substitution evidence:** Added one directed, evidence-only finding on the existing `ingredient-ref-brazil-polvilho-azedo` ledger record for partial replacement by polvilho doce in the 2016 UFC polvilho-biscuit formulation. The source reports 30%, 40%, and 50% replacement and no significant specific-volume variation through 50% at its stated p=0.05 criterion. Reading the percentages against the 100-part azedo line is an inference; the source does not state the mass/volume basis. No active rule, recipe link, amount conversion, or inverse finding was added. See the [R716 proposal](../../proposals/wp02-b2-b3-next-flour-starch-gap-review-r716-20261018.md).
- **R717 — Canadian Bob's Red Mill 8 Grain portion:** Added a ledger-only `portion_weight` observation of 1/4 cup (45 g), scoped to Healthy Planet retailer SKU A0063910. The product match to Canadian Bob's item P101125 rests on the Canadian product title, 709 g size, and soy-containing formula; no manufacturer UPC appears on the retailer listing. The observation preserves that limit, does not create a density or active cup mapping, and does not use the U.S. P101124 40 g serving. See the [R717 proposal](../../proposals/wp03-section-f-next-cereal-grain-gap-review-r717-20261018.md).
- **R718 — rock sole / limande picker boundary:** Kept Northern Rock Sole, Southern Rock Sole, and Common Dab outside active references and the research ledger. The three supported identities would make `rock sole` and `limande` multi-result queries, but Common Dab would make the broader `dab` query return only that row despite CFIA assigning dab-containing names to other flatfish. Preserve the prior R126 hold; add no shared source or identity. See the [R718 proposal](../../proposals/wp04-section-p-next-fish-gap-review-r718-20261018.md).

## Package state

- 1,841 ingredient references, 174 forms, 114 recipes, and 1,123 structured recipe ingredient rows; no bundled seed recipe or active catalog identity changed.
- 2,224 research-ledger records, 10,439 source entries, 8,808 distinct source IDs, and 7,457 distinct source URLs.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid, including seed package and research ledger schema validation.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,841 references.
- R716 and R717 proposal examples were checked against the ledger `Record` and `MeasurementObservation` schemas. New R716/R717 source IDs and URLs have no prior owners; R718 identifiers remain proposal-local.
- The R716/R717 updates add only research-ledger JSON data. No software tests, build, emulator run, or deployment were needed under `AGENTS.md`; R718 is a documentation-only hold.

WP02 A7/B3, WP03 Section F, and WP04 Section P remain open.
