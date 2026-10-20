# WP02/WP03/WP04 R725–R727 integration — 2026-10-18

Integrated two bounded catalog updates and one documentation-only hold. Sections A6, F, and P remain open.

## Decisions

- **R725 — teff-flour substitution evidence:** Added one source-scoped `SubstitutionFinding` to the existing `ingredient-ref-teff-flour` research record. Westpoint Naturals recommends reducing recipe flour by 10–20% for chocolate cookies, cakes, and brownies and replacing the removed amount with an equal weight of its Teff Flour. The source does not state whether the reduction is based on mass or volume, so no amount was calculated and no active substitution rule was added. Refreshed Bob's Red Mill source `WP02-S91` in place to include its separate approximate 25% baked-goods guidance; added the alternative-flour guide, Westpoint product page, and Coleman et al. study as source records. Measurement remains `not_yet_researched`; no aliases, forms, measures, recipe links, density, mapping, yield, or rule were added. See the [R725 proposal](../../proposals/wp02-a6-next-gap-review-r725-20261018.md).
- **R726 — Holy Crap cereal family hold:** Kept Apple Cinnamon Superseed cereal and Well.ca's indexed 2 tbsp / 30 g listing outside active references and the ledger pending a bilingual review of the maker's four-product family. A one-row addition would make family phrases resolve to a single flavor and change the phrase-first `superseed` result from Nature's Path's existing oatmeal row. The listing's 30 g value remains unallocated. See the [R726 proposal](../../proposals/wp03-section-f-next-gap-review-r726-20261018.md).
- **R727 — sailfish genus-level identity:** Added identity-only `sailfish / voilier` as `ingredient-ref-sailfish-market-group`, scoped to the CFIA `Istiophorus spp.` label and corroborated by OQLF's genus-level French term. The distinct Indo-Pacific Sailfish species wording remains unassigned. No aliases, forms, measurements, conversions, yields, recipe links, or substitutions were added. See the [R727 proposal](../../proposals/wp04-section-p-next-gap-review-r727-20261018.md).

## Package state

- 1,846 ingredient references, 174 forms, 114 recipes, and 1,123 structured recipe ingredient rows.
- 2,229 research-ledger records, 10,462 source entries, 8,831 distinct source IDs, and 7,479 distinct source URLs.
- No bundled recipe or ingredient row links to teff flour, sailfish, or the held Holy Crap cereal family.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check --validate-only` — bundled package valid and normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,846 references.
- Research ledger validates against `docs/catalog/research-ledger.schema.json`.
- All five new source IDs have one ledger owner. Existing Bob's Red Mill source `WP02-S91` remains on the teff record exactly once and was refreshed in place. The shared CFIA Fish List results URL uses a row-specific sailfish locator.
- Picker projection: `sailfish` and `voilier` each return 0 → 1; Indo-Pacific species-qualified queries remain 0; broad `fish` and `poisson` remain 18 and 14 results. R726's proposal records the hypothetical family-query effect and why the candidate remains held.
- Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows for the reviewed products and candidate names; no matches were found.
- Modified JSON and documentation files decode as UTF-8 without BOM; French catalog data remains stored as Unicode escapes. Local links and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were performed. The shared data changes add database JSON under `AGENTS.md`; R726 is documentation-only.
