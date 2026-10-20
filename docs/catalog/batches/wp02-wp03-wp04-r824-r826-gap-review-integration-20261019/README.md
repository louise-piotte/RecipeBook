# WP02/WP03/WP04 R824–R826 gap review integration — 2026-10-19

## Scope and disposition

Reviewed and integrated three proposal-only research reviews. The wider WP02 Section A7, WP03 Section F, and WP04 Section P work remains open.

- **R824 — white whole-wheat flour:** recorded King Arthur Baking’s one-loaf *Ancient Grains Bread* flour line, 1 cup (113 g), as one source-specific portion on the existing white whole-wheat flour ledger row. The listed amount is shared by “Premium or White Whole Wheat”; it applies to white whole-wheat flour only if that option is selected. This is not a distinct white-flour-only weight, generic measure, density, or active conversion. No alias, form, recipe link, or substitution rule was added.
- **R825 — parboiled rice:** recorded CNF 2015 Food Code 4472 dry portions of 100 mL = 78.2 g and 250 mL = 195.5 g, plus its 25.7 g “amount to make 125 mL” entry as an explicitly directional, source-scoped ledger observation. The two dry portions do not define a reusable density. No form or dry-to-cooked conversion was activated; CNF 2026 row inspection remains open.
- **R826 — generic scallop:** recorded CNF 2015 Food Code 3213 portions of one small raw mixed-species scallop = 6.0 g and one large = 15.0 g. CNF’s 2015 guide treats the masses as edible portions without refuse. The page’s blank refuse field is not zero; shell-on mass, roe state, size cutoffs, weighing method, yield, and reusable count conversion remain unspecified. CNF 2026 row inspection remains open.

## Data and catalog effects

The research ledger is the only database JSON file changed. It now has **2,294 records**, **10,783 source entries**, **9,075 distinct source IDs**, **7,715 distinct source URLs**, **857 measurement observations**, and **361 substitution findings**. Four source entries and six measurement observations were added; R825 reused its existing CNF Food Code 4472 source, and its updated source details now include the measurement evidence. No source ID maps to conflicting URLs, and no observation or finding ID is duplicated.

The bundled catalog remains at **1,886 references and 199 forms**. No active reference, form, alias, generated index, density, unit mapping, conversion, package yield, recipe link, or substitution rule changed. The package remains at **114 recipes** and **1,123 structured ingredient rows**, including **1,097** with an `ingredientRefId`; no recipe file changed.

## Static validation

- Research-ledger JSON Schema validation passed with zero errors. Source-ID/URL integrity and observation/finding-ID uniqueness checks passed.
- Rechecked each proposal’s source and observation IDs against the integrated ledger. R824 is scoped to King Arthur’s shared recipe line; R825 remains exact to CNF 2015 Food Code 4472; R826 remains exact to CNF 2015 Food Code 3213 and edible-portion guidance. CNF 2026 row-level inspection remains open for R825 and R826.
- The seed package and generated ingredient index were unchanged. JSON remains UTF-8 without BOM and ASCII-escaped; a stable-format round-trip check passed. Proposal, integration, plan, roadmap, and workflow local links were checked, as were scoped whitespace and mojibake checks.
- No software tests, app build, emulator run, or deployment were performed. Under the updated `AGENTS.md` rule, the active database changes add research JSON data only.

See the [R824 proposal](../../proposals/wp02-section-a7-next-gap-review-r824-20261019.md), [R825 proposal](../../proposals/wp03-section-f-next-gap-review-r825-20261019.md), and [R826 proposal](../../proposals/wp04-section-p-next-gap-review-r826-20261019.md).
