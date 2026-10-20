# WP03 Section U R335 — perilla leaf identity integration

Reviewed and integrated on 2026-10-16. Added one identity-only HERB reference for the culinary leaves of *Perilla frutescens*:

- `ingredient-ref-perilla-leaves`: `perilla leaves / feuilles de périlla`.
- English aliases: `perilla leaf`, `shiso leaves`; French aliases: `feuille de périlla`, `shiso`.

Kew accepts *P. frutescens* and records shiso as a common name for var. *crispa*. OMAFRA documents culinary leaf use and distinguishes green and purple crop types. Health Canada lists perilla leaf separately from seed and leaf oil. A Québec horticultural listing uses `Périlla` and shiso; a Montréal restaurant uses `feuilles de périlla` for leaves served in a Korean wrap context. The Québec wording is source-attested usage, not an OQLF ruling. These sources do not establish that cultivar-specific products are interchangeable.

Before integration, the live catalog had 1,683 references, 129 forms, 58 legacy candidates, and 2,031 ledger records. No current reference, form, legacy candidate, or ledger identity owned the leaf phrases or proposed ID. The manifest scan covered 114 recipes and 1,123 ingredient rows; no candidate phrase appeared in a recipe file or ingredient row.

## Picker projection

The projection applies the phrase-first matching behavior in [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It compares the current catalog with the proposed display and aliases:

| Query | Before R335 | After R335 |
|---|---:|---:|
| `perilla leaves`, `perilla leaf` | 0 | 1 |
| `feuilles de périlla`, `feuille de périlla` | 0 | 1 |
| `shiso leaves`, `shiso` | 0 | 1 |
| `perilla`, `périlla` | perilla seeds | perilla seeds + perilla leaves |
| `perilla seeds` | perilla seeds | perilla seeds |
| Botanical names | 0 | 0 |

The short query intentionally returns the separate edible parts together. Complete part-qualified phrases keep the leaves distinct from seeds.

The accepted ledger decision is identity-only. Measurement and general substitution research remain `not_yet_researched`. No forms, measures, mappings, density, conversions, yields, recipe links, or active substitutions were added. The six sources are listed under the R335 source prefix in `docs/catalog/research-ledger.v1.json`; the [proposal](../../proposals/wp03-section-u-next-open-identity-review-r335-20261016.md) records the scope limits and omitted measure evidence. The candidate recipe corpus remains unchanged.

Static package, reference-normalization, generated-index, ledger, picker, corpus, encoding, local-link, and whitespace checks passed. The combined catalog contains 1,684 references, 129 forms, 58 legacy candidates, and 2,032 ledger records. No software tests, builds, emulator checks, or deployment were run because the change adds database JSON data and the generated catalog projection under `AGENTS.md`.
