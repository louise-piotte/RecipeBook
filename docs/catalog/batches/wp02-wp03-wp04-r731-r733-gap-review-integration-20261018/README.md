# WP02/WP03/WP04 R731–R733 integration — 2026-10-18

Integrated two bounded catalog updates and one product-form update. Sections A6, F, and P remain open.

## Decisions

- **R731 — buckwheat-flour portion:** Recorded Coop Agrobio’s 2023 catalog serving of 1/4 cup (40 g) as a product-specific `portion_weight` observation on the existing generic buckwheat-flour ledger row. The current cooperative page confirms that organic buckwheat flour remains in its portfolio but gives no serving. The dated label does not specify cup capacity, fill method, or weighing procedure, so measurement is `researched_no_supported_value`; no generic measure, density, mapping, or conversion was added. Substitution research remains `not_yet_researched`. See the [R731 proposal](../../proposals/wp02-a6-next-gap-review-r731-20261018.md).
- **R732 — Apple Jacks cereal:** Added identity-only `Kellogg's Apple Jacks cereal / Céréales Kellogg's Apple Jacks` from the paired Canadian manufacturer SmartLabel entries. Recorded the 1 cup (39 g) label serving only for UPC `00064100133396`. Walmart’s separate 320 g listing has no visible UPC crosswalk to the 345 g SmartLabel record and is not used for the portion. No aliases, forms, active measure, density, mapping, recipe link, yield, or substitution was added. See the [R732 proposal](../../proposals/wp03-section-f-next-open-gap-review-r732-20261018.md).
- **R733 — whole Atlantic wolffish form:** Added one `whole_fish` form under the existing Atlantic wolffish identity, labeled `whole Atlantic wolffish / loup de l’Atlantique entier`. La Mer’s dated arrivals list places the named fish under its whole-fish heading. The adjacent fillet listing is excluded because adding a singular `fillet` phrase would collapse the broad fillet search. No freshness, freezing, cleaning, size, measure, yield, recipe link, or substitution behavior was added. See the [R733 proposal](../../proposals/wp04-section-p-whole-atlantic-wolffish-form-review-r733-20261018.md).

## Package state

- 1,848 ingredient references, 175 forms, 114 recipes, and 1,123 structured recipe ingredient rows.
- 2,232 research-ledger records, 10,472 source entries, 8,841 distinct source IDs, and 7,488 distinct source URLs.
- No bundled recipe or ingredient row matches the reviewed products or whole-wolffish form.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check --validate-only` — bundled package valid and normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,848 references.
- Research ledger validates against `docs/catalog/research-ledger.schema.json` and the package’s semantic/source-ownership checks; zero ledger errors.
- All six new source IDs have one owner. R731 reuses the 2023 catalog PDF URL with its existing rye/spelt owners and a new page-specific buckwheat source ID; the other five new source URLs are unique.
- Picker projection: Apple Jacks English and French full-name searches each return one product; `apple cinnamon` still returns Apple Cinnamon Chex alone. Broad `apple`, `Kellogg’s`, `cereal`, and `céréales` searches return 5, 6, 77, and 73 results. Whole Atlantic wolffish English and French form searches each return one parent with the form hint; `wolffish` and `loup` remain multi-result, generic `whole fish` and `poisson entier` each remain at one, and `fillet` / `filet` remain at 7 / 2.
- Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows for the reviewed names and IDs; no matches were found.
- Modified JSON and documentation files decode as UTF-8 without BOM; French seed values use explicit Unicode escapes. Local links and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were performed. The catalog changes add database JSON data and documentation under [AGENTS.md](../../../../AGENTS.md); software testing is not required for database-JSON-only changes.
