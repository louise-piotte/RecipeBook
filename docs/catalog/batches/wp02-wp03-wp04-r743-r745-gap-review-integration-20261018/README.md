# WP02/WP03/WP04 R743–R745 integration — 2026-10-18

## Decisions

- **R743 — white fonio flour measurement:** Completed the deferred measurement review on the existing fonio-flour ledger row. A 2025 native-Acha study reports loose and tapped laboratory densities, but the sample is not species-resolved and its cited measurement method is not reproduced. Current white-fonio product instructions give cup amounts without paired gram mass. Set measurement research to researched_no_supported_value; kept measurement observations empty, refreshed the existing Aga source in place, added two source records and one accepted decision, and preserved R722 substitution evidence. No active measure, density, mapping, conversion, alias, form, or recipe link was added.
- **R744 — prepared kasha:** Held the ledger-only candidate outside active references and aliases. OQLF defines kacha / kasha as prepared gruel, while a current Québec seller uses Kasha for dry roasted buckwheat. The current picker returns fingerroot for kacha through substring fallback, so a phrase-first prepared-kasha row would replace that result. No catalog or ledger data was allocated.
- **R745 — live Blue Crab:** Held the proposed live form under the existing Blue Crab identity. The supplier’s taxon-specific live offer is seasonal and special-order; adding the qualified phrase would make generic live and vivant queries Blue-Crab-only results. No catalog or ledger data was allocated.

## Data boundaries

- Active references remain **1,848** and forms remain **178**. The catalog generator reports that its output is current.
- The fonio ledger row now has measurementState researched_no_supported_value, with zero measurement observations and no change to its supported R722 substitution finding.
- The ledger has **2,235 records**, **10,493 source entries**, **8,857 distinct source IDs**, and **7,504 distinct URLs**. Validation returned zero errors; every source ID maps to one URL. The two new source URLs are owned only by the fonio-flour record, and existing WP02-S93 still points to the same row and Aga product URL.
- R744 and R745 leave active ingredient references, forms, aliases, recipe links, and ledger data unchanged.

## Static verification

- normalize_bundled_seed_package.py --check passed; the package is already normalized.
- generate_bundled_ingredient_catalog.py --check passed at **1,848 references**.
- validate_research_ledger() passed with **2,235 records and zero errors**.
- Picker projections from the current data and IngredientSearch.kt confirm: kasha returns 0, kacha returns fingerroot, sarrasin returns 15; live returns 6 and vivant returns 0. With only the proposed Blue Crab form added, both generic state queries become Blue-Crab-only results, while crab and crabe remain at 13 each.
- The bundled manifest lists **114 recipes and 1,123 structured ingredient rows**. A scan of candidate fonio, kasha/kacha, and Blue Crab terms found no matching files or ingredient rows.
- Scoped UTF-8/no-BOM, local-link, mojibake, whitespace, and git diff --check checks passed.
- No software tests, build, emulator run, or deployment were performed. The shared data change is a database JSON research-ledger update; the other two decisions are documentation-only holds, and the updated AGENTS.md says database-JSON-only changes need no tests.

## Review files

- [R743 fonio-flour measurement review](../../proposals/wp02-a6-fonio-flour-measurement-review-r743-20261018.md)
- [R744 prepared-kasha picker-boundary review](../../proposals/wp03-section-f-kasha-prepared-gruel-picker-boundary-review-r744-20261018.md)
- [R745 live Blue Crab form hold](../../proposals/wp04-section-p-blue-crab-live-form-picker-hold-r745-20261018.md)
- [Global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
- [Workflow checkpoints](../../ingredient-catalog-workflow.md)
- [Roadmap](../../../../roadmap.md)
