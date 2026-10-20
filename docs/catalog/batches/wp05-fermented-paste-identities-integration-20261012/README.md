# WP05 Section X fermented paste identities

Integrated on 2026-10-12 from the proposal-only review in
[`wp05-fermented-fish-shrimp-condiments-review-20261011.md`](../../proposals/wp05-fermented-fish-shrimp-condiments-review-20261011.md).

## Catalog changes

Added five identity-only `SAUCE_AND_CONDIMENT` references:

| ID | English display | fr-CA display | Aliases |
|---|---|---|---|
| `ingredient-ref-belacan` | `belacan` | `belacan (pâte de crevettes fermentée malaisienne)` | `belachan` in EN and FR |
| `ingredient-ref-terasi` | `terasi` | `terasi (pâte de crevettes fermentée indonésienne)` | `terasi udang` in EN and FR |
| `ingredient-ref-bagoong-alamang` | `bagoong alamang` | `bagoong alamang (condiment philippin aux crevettes fermentées)` | none |
| `ingredient-ref-bagoong-isda` | `bagoong isda` | `bagoong isda (pâte de poisson fermentée philippine)` | none |
| `ingredient-ref-prahok` | `prahok` | `prahok (pâte de poisson fermentée cambodgienne)` | `prohok`, `prohoc` in EN and FR |

The French parentheticals are descriptive labels, not claims of OQLF standardization. The Montreal
menu directly supports the belacan and prahok descriptions; Canadian French retail wording supports
the borrowed bagoong-alamang name. The source register and exact limits are in the proposal.

The broad `ngapi` candidate remains held because the source record covers both fish and shrimp
products; the unresolved identity decision is recorded as `candidate-ngapi` in the research ledger.
Keep it distinct from existing `kapi`, `padaek`, liquid fish sauce/patis, and prepared sambals. No recipe links, forms, density, unit mappings, measurements, package yields, conversions,
or substitution rules were added. Measurement and substitution research remains `not_yet_researched`.

## Snapshot and verification

- Package: 1,095 references, 79 forms, 114 recipes, and 1,123 ingredient rows.
- Ledger: 1,395 records, 4,646 source entries, 3,805 distinct source IDs, and 8 unit conversions.
- The bundled package normalizer reported zero changed parts; package validation passed.
- Ingredient-reference normalization completed for 1,095 references.
- The generated Kotlin ingredient index was regenerated and its freshness check passed.
- Normalized-key checks found each proposed display and alias owned by exactly its intended reference; `ngapi` has no active owner. The recipe-line scan found no matching candidate terms.
- Modified JSON is UTF-8 without BOM; bundled seed text uses explicit Unicode escapes.
- No unit tests, instrumentation tests, or emulator checks were run because this change only adds database catalog data, under the current `AGENTS.md` rule.
