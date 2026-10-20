# WP03 Section K R321 Garland chrysanthemum identity

Integrated the bounded identity recommendation in the [R321 proposal](../../proposals/wp03-section-k-garland-chrysanthemum-identity-review-r321-20261016.md).

## Catalog result

- Added identity-only `garland chrysanthemum / chrysanthème comestible` for the edible leafy crop *Glebionis coronaria* (older source name: *Chrysanthemum coronarium*), in `VEGETABLE_AND_AROMATIC`.
- Added only the bounded aliases supported by the reviewed sources: qualified English `chrysanthemum greens`, `edible chrysanthemum`, `shungiku`, `tong ho`, `tong hao`, `tung ho`, and French `chrysanthème à couronnes` (with the listed regional spellings in their source language arrays).
- Kept bare botanical names, generic `chrysanthemum / chrysanthème`, `crown daisy`, `chop suey greens`, flower/tea wording, and unrelated ornamental plants out of explicit aliases. The phrase-first picker still returns the edible row for the one-word queries `chrysanthemum` and `chrysanthème`, because those words occur within the qualified display names.
- Added eight identity sources and one accepted identity decision. Measurement and substitution research remain open; no measurements, forms, recipe links, density, unit mappings, conversions, yields, or substitutions were added.
- The manifest-ordered bundle scan found no matching text, ingredient row, or reference link across 114 recipes / 1,123 ingredient rows.

## Evidence boundaries

Kew accepts *Glebionis coronaria*, lists *Chrysanthemum coronarium* as a synonym, and records food use. The Ontario Ministry of Agriculture crop profile identifies the older taxon and culinary use of young leaves, but its English and French pages date from 2012. A Québec grower uses `chrysanthème comestible` for leaves grown as food and lists `chrysanthème à couronnes`, `shungiku`, and `tung ho`; its site history scopes the naming to a Québec producer, not an official terminology ruling or same-day stock check. TERMIUM supports botanical name pairs, but only indexed text was available. The Ontario Asian-vegetables page corroborates qualified `Chrysanthemum greens`, `Tong ho choy`, and `Tong hao cai` in indexed text; direct opens returned 403. The Woks of Life article directly identifies the leaves of *G. coronaria* as `chrysanthemum greens` and maps `tong ho` to that crop. Together these support the qualified English alias and narrow Cantonese alias; neither is Canadian or Québec official terminology. The Ontario seed listing was marked sold out and supports only crop-name use, not fresh-ingredient measures.

## Picker projection

The projection follows the phrase-first search behavior in `IngredientSearch.kt`.

| Query | Result after integration |
|---|---|
| `garland chrysanthemum` | Garland chrysanthemum |
| `chrysanthème comestible` | Garland chrysanthemum |
| `chrysanthemum greens` | Garland chrysanthemum |
| `edible chrysanthemum` | Garland chrysanthemum |
| `shungiku`, `tong ho`, `tong hao`, `tung ho` | Garland chrysanthemum |
| `chrysanthème à couronnes` | Garland chrysanthemum |
| `chrysanthemum`, `chrysanthème` | Garland chrysanthemum (word match inside a qualified display) |
| `crown daisy`, `chop suey greens`, `chrysanthemum tea` | No result |

## Validation

The bundled seed package validated and was normalized; the reference normalizer reported no changes after canonicalization, and the generated ingredient index was current. Ledger schema, source-ID uniqueness, exact picker projection, recipe-corpus boundary, escaped-Unicode encoding, local links, and whitespace checks passed.

At this integration checkpoint there are 1,676 ingredient references, 127 forms, and 2,023 research-ledger records with 8,999 source occurrences, 7,630 distinct source IDs, and 6,377 distinct source URLs. Totals may advance with later catalog work. No software tests, builds, emulator checks, or deployment were run because this only adds database JSON data under `AGENTS.md`.
