# WP02/WP03/WP04 identity additions — R84

- **Integrated:** 2026-10-13.
- **Scope:** Three source-reviewed, identity-only ingredient references; no recipe lines or runtime conversion behavior.
- **Inventory after integration:** 1,415 references, 104 forms, 1,754 research-ledger records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows.
- **Source records:** 15 new source IDs across three accepted ledger records.

## Accepted rows

- **WP02 B2:** `Brazilian pinhão flour / farine de graines du pin du Paraná` for *Araucaria angustifolia*. The French compound is provisional for Québec. Keep it separate from Pinus pine-nut flour and Bunya nuts. Leave generic `pine seed flour` and `pine nut flour` unassigned; add no aliases. Source-specific package portions, research processes, and blend ratios do not become measures, yields, or substitutions. See the [review proposal](../../proposals/wp02-b2-brazilian-pinhao-flour-identity-review-r84-20261013.md).
- **WP03 Section F:** `whole wheat couscous / couscous de blé entier` for the plain single-ingredient TIPIAK product named on Canadian English and French pages. Keep it separate from generic, pearl, barley, regional, and blended couscous. See the [review proposal](../../proposals/wp03-section-f-next-grain-review-r84-20261013.md).
- **WP04 Section P:** `cobia / cobia` for *Rachycentron canadum*, using the OQLF-preferred bilingual display. Alternate names, including `black bonito`, remain unassigned so broad bonito searches keep their prior results. The seller's fillet and whole-fish listings and their `KG` / `6/8` fields do not create reusable forms or measures. See the [review proposal](../../proposals/wp04-section-p-cobia-identity-review-r84-20261013.md).

All three rows have empty aliases and add no forms, default densities, unit mappings, active measures, conversions, yields, recipe links, or substitutions. No candidate terms matched the bundled recipe corpus. The Section 04 B2 flour parent, Section F processed-grain parent, and Section P fish parent remain open.

## Static validation

The following data and catalog checks passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Research-ledger validation against `docs/catalog/research-ledger.schema.json`
- Candidate ID, source ID, source ownership, empty-alias/form/numeric-field, picker-boundary, and recipe-corpus checks
- UTF-8 without BOM, final newline, local Markdown links, and changed-file whitespace checks

No app tests, Gradle tasks, emulator checks, or deployment were run. `AGENTS.md` says changes limited to adding database JSON data do not need testing. The generated Kotlin catalog was refreshed from the canonical reference JSON.
