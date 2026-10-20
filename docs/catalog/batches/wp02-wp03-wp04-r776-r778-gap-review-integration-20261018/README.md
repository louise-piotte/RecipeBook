# WP02/WP03/WP04 R776–R778 gap-review integration

Date: 2026-10-18

## Decisions

- **R776 — generic spelt-flour measurements:** changed the existing `ingredient-ref-spelt-flour` ledger measurement state to `researched_supported` and recorded four separate King Arthur Baking observations: its chart’s 1 cup = 99 g row, Spelt Pita’s 2 cups = 198 g, and Honey Spelt Sourdough’s 1 cup = 99 g levain and 3 cups = 298 g dough quantities. The recipe instructions support spoon-and-sweep weighing, but the chart notes that recipe weights can differ. Bob’s Red Mill’s 1/4 cup (30 g) serving is for a specifically whole-grain product and remains a comparator for the separate whole-spelt row. No default density, unit mapping, active conversion, form, recipe link, yield, or substitution was added.
- **R777 — sorghum CNF 2026 row access:** rechecked Health Canada’s current overview, the official Open Government listing, and the four direct CSV resources for Food Code 4432. The overview confirms the relational CSV release, but the listing returned 403 and the row files were inaccessible through the browser. The review makes no row-presence, row-absence, preparation-state, measure, or value claim. The CNF 2026 join remains open; no ledger, catalog, or R756 form change was made, and no CNF 2015 portions were transferred.
- **R778 — whole Yellow perch:** added a state-neutral `whole_fish` form, `whole yellow perch / perchaude entière`, under the existing verified *Perca flavescens* identity. The form has empty match-term arrays and null density. The Allseas “dressed” qualifier, seasonal temperature details, 227–600 g supplier size, and 10 lb case remain source-specific. No measure, cleaning state, conversion, yield, recipe link, or substitution was added. This is separate from R691’s held fillet form.

## Package snapshot

- **1,866 ingredient references and 191 forms.** R778 adds one form; R776 and R777 change no picker terms or reference rows.
- **2,266 research-ledger records, 10,632 source entries, 8,950 distinct source IDs, and 7,597 distinct source URLs.** R776 adds two new recipe sources and reuses the chart source. R778 adds one Allseas source and reuses the two Yellow-perch identity sources. R777 adds no ledger source.
- **114 manifest-listed recipes and 1,123 structured ingredient rows.** The spelt and Yellow-perch candidate scans found no recipe-file hits, ingredient-row hits, or direct links; sorghum also has no bundled corpus demand.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the package is already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 1,866 references; the generated index is current.
- Research-ledger validation passed with 2,266 records and zero errors.
- Source ownership, current picker projection, manifest-listed recipe corpus, UTF-8 without BOM, escaped Unicode in bundled JSON, local links, mojibake markers, and scoped whitespace were checked.
- Picker effects: R776 and R777 leave search unchanged. R778 makes `whole yellow perch` and `perchaude entière` each return Yellow perch; `yellow perch` stays at two, `perch` at five, `whole fish` and `poisson entier` at one each, `whole` moves 56→57, and `entière` moves 13→14. Fillet queries remain unchanged.
- **No software tests, build, emulator run, or deployment were performed.** The active catalog changes only add database JSON data under the updated `AGENTS.md` rule.

Sections A6, F, and P remain open.

## Proposals

- [R776 generic spelt-flour measurement review](../../proposals/wp02-a6-spelt-flour-measurement-review-r776-20261018.md)
- [R777 CNF 2026 sorghum row-access recheck](../../proposals/wp03-section-f-cnf2026-sorghum-row-recheck-r777-20261018.md)
- [R778 whole Yellow-perch form review](../../proposals/wp04-section-p-next-open-gap-review-r778-20261018.md)
