# WP02/WP03/WP04 R722–R724 integration — 2026-10-18

Integrated two bounded data updates and one documentation-only fish-name hold. Sections A6, F, and P remain open.

## Decisions

- **R722 — fonio-flour cookie evidence:** Added one source-scoped finding to the existing `ingredient-ref-fonio-flour` research record. McWatters et al. report a 50% white-fonio share in one tested wheat/fonio sugar-cookie flour blend. The methods also report 75.5 g flour in the base recipe, but do not state whether flour-component percentages are by mass or volume. The ledger therefore retains the share only; it does not derive component grams or establish a general replacement ratio. The finding records the study’s sensory results and limits. Substitution research is `researched_supported`; measurement remains `not_yet_researched`. No active rule, measure, form, recipe link, alias, or reference was added. See the [R722 proposal](../../proposals/wp02-a6-next-open-gap-review-r722-20261018.md).
- **R723 — Canadian Froot Loops products:** Added identity-only `Froot Loops cereal / Céréales Froot Loops`, `Froot Loops Less Sugar cereal / Céréales Froot Loops Moins de sucre`, and `Froot Loops with Marshmallow cereal / Céréales Froot Loops avec guimauves`. Each uses paired manufacturer English/French product pages. Cocoa Loops remains separate. No aliases, forms, measurements, conversions, yields, recipe links, or substitutions were added. See the [R723 proposal](../../proposals/wp03-section-f-next-open-gap-review-r723-20261018.md).
- **R724 — Red Mullet picker boundary:** Kept the CFIA Red Mullet group outside active references, aliases, legacy candidates, and the research ledger. The English market group spans *Mullus* and *Upeneichthys*; the reviewed French terms do not establish a Québec name coextensive with that scope. No shared data was allocated. See the [R724 proposal](../../proposals/wp04-section-p-next-open-gap-review-r724-20261018.md).

## Package state

- 1,845 ingredient references, 174 forms, 114 recipes, and 1,123 structured recipe ingredient rows.
- 2,228 research-ledger records, 10,457 source entries, 8,826 distinct source IDs, and 7,475 distinct source URLs.
- No bundled recipe or ingredient row links to the new Froot Loops references.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check --validate-only` — package normalized and valid.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,845 references.
- The research ledger validates against `docs/catalog/research-ledger.schema.json`; the full-library seed package validator also passed.
- All seven newly allocated source IDs and URLs have one ledger owner. R724 allocated no source ID or ledger entry.
- Picker projection matches the proposal: `Froot Loops` returns 0 → 3; each full English/French product phrase returns 0 → 1; `Cocoa Loops` remains 1 → 1; broad `Loops` returns 1 → 4. Broad `cereal` and `céréales` result counts increase from 72 → 75 and 68 → 71.
- Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows for the three new IDs and product names; no matches were found.
- The modified JSON and documentation files decode as UTF-8 without BOM. French catalog names are stored as JSON Unicode escapes. Local links and whitespace were checked.
- No software tests, build, emulator run, or deployment were performed. The only shared data update adds database JSON under the current `AGENTS.md` rule; R724 is documentation-only.
