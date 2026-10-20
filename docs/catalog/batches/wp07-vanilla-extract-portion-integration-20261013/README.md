# WP07 vanilla-extract portion integration

Date: 2026-10-13

## Disposition

Recorded USDA SR28 NDB 02050's published **1 teaspoon = 4.2 g** vanilla-extract portion on the existing `ingredient-ref-vanilla-extract` research-ledger record. The observation is tied to that exact food code and source row. It does not establish a millilitre amount, teaspoon convention, fill method, general extract density, or applicability to other vanilla extracts and flavour preparations.

The ledger measurement state is now `researched_supported` because one source-qualified portion is available. `defaultDensity` remains null, `unitMappings` remains empty, and no active conversion, form, substitution, or recipe quantity changed. The substitution state remains `researched_no_supported_substitute`.

## Source evidence

The [USDA National Nutrient Database for Standard Reference, Release 28 — EPA Content](https://ods.od.nih.gov/pubs/usdandb/EPA-Content.pdf) lists NDB 02050, `Vanilla extract`, at 4.2 g per 1.0 tsp in its `Per Measure` table. The adjacent imitation vanilla extract records have separate food codes and are not included. See the [review proposal](../../proposals/wp07-vanilla-extract-portion-review-20261013.md) for the exact observation and source limitation.

## Current package state

| Artifact | State after integration |
|---|---:|
| Ingredient references | 1,357 |
| Ingredient forms | 100 |
| Research-ledger records | 1,681 |
| Source entries / distinct source IDs / distinct URLs | 6,571 / 5,507 / 4,589 |
| Measurement observations | 344 |
| Substitution findings | 195 |
| Generated Kotlin references | 1,357 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes |

The existing vanilla-extract identity remains linked to **53 ingredient rows across 46 recipes**. No recipe JSON, reference JSON, form JSON, active rule, or generated catalog field changed.

## Verification

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed, including the research-ledger schema and reference/source checks.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; the generated index remains current at 1,357 references.
- A focused data assertion confirmed the observation's source, amount, and mass; confirmed `observedVolumeMl` is absent; and confirmed density and unit mappings remain empty.
- The recipe corpus remains at the recorded file, row, and byte counts. No recipe line was edited.
- UTF-8 without BOM, mojibake, and `git diff --check` checks passed for the changed ledger, proposal, plan, and roadmap.
- No app, unit, instrumentation, emulator, or other tests were run because the implementation adds only a database JSON observation under the updated `AGENTS.md` rule.

WP07 remains open; this single source-specific portion does not complete the measurement checklist.
