# WP03 R913–R916 generic boundary integration

Reviewed 2026-10-19. The user clarified that generic ingredient diversity is the priority across every ingredient type. Commercial brand, product-line, flavour-family, SKU, and retailer-variant rosters remain out of scope because product counts do not add ingredient diversity. Existing entries and source-scoped values were preserved.

## Integrated outcomes

- **Plantain maturity (R913): hold.** Keep one generic fresh plantain identity. Add no maturity alias or form until a bundled recipe requires it; color alone does not establish physiological maturity. Keep plantain flour and the held starch candidate separate.
- **Cooking apples (R914): hold.** Retain generic `apple / pomme`. Québec `pomme à cuire` usage varies by cooking result and also occurs as a regulated seasonal sales designation; no bundled apple ingredient line establishes a separate identity or form. Recipe amounts remain recipe-scoped.
- **Dried mushrooms (R915): add one form.** Added `dried mushrooms / champignons séchés` with `formCode=dried` under the existing species-unspecified mushroom identity. The `dried / séché` state does not encode species, blend composition, piece size, rehydration, or soaking-liquid use.
- **Melon/cantaloupe naming (R916): hold.** OQLF supports `melon` and `melon brodé` and documents common North American use of `cantaloupe/cantaloup` for melon brodé, while also defining a distinct cantaloup. The bundle has no matching line to disambiguate; existing watermelon, winter melon, bitter melon, and seed products remain untouched.

## Evidence scope

The bilingual Health Canada mushroom-soup pages give a recipe-specific 190 mL (3/4 cup) dried-mushroom alternative to the recipe’s specified white and cremini mushrooms. Télé-Québec lists one 14 g forest-mushroom blend sachet, rehydrated in 250 mL boiling water for 20 minutes, with the solids drained and liquid kept separately. The ledger records the 14 g sachet as one published recipe portion; every amount and method remains source-scoped. No general conversion, density, yield, or substitution was added.

The bundled corpus still has no generic dried-mushroom line, no plantain line, and no apple or melon/cantaloupe line. No recipe was changed or linked. Existing named mushroom identities and all prior candidate decisions remain intact.

## Cross-category queue review

The current reviews assigned only generic identity and form questions. No roster-only assignment was pursued. The open Section F cereal-mix sweep remains open for generic cereal diversity only; its branded product-family and retailer-variant expansion is already marked out of scope. The queue scan found no additional task limited to commercial products. Preserve existing branded references, and review transferability before applying a product-specific claim to a generic ingredient.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`: valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`: already normalized.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`: already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`: current at 1,939 references.
- Research-ledger JSON Schema: 0 errors; duplicate record IDs, duplicate observation IDs, and source-ID/URL conflicts: 0. The new form ledger record points to the existing generic mushroom reference.
- Recipe corpus remains 114 recipes / 1,123 ingredient rows; this integration did not change recipe files.
- Touched JSON is ASCII-escaped and UTF-8 without BOM. Local links and scoped whitespace checks passed.
- No Gradle, Android instrumentation, emulator, or deployment tests were run because the only catalog data change adds database JSON under `AGENTS.md`; the other outcomes are documentation-only holds.

## Proposals

- [R913 plantain maturity](../../proposals/wp03-section-m-generic-plantain-ripeness-review-r913-20261019.md)
- [R914 cooking-apple distinction](../../proposals/wp03-section-m-generic-cooking-apple-review-r914-20261019.md)
- [R915 dried-mushroom form](../../proposals/wp03-section-n-generic-dried-mushroom-form-review-r915-20261019.md)
- [R916 melon/cantaloupe naming](../../proposals/wp03-section-m-generic-melon-naming-review-r916-20261019.md)
