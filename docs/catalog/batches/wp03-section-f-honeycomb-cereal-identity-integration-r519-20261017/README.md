# WP03 Section F R519 integration — Honeycomb cereal

- **Date:** 2026-10-17
- **Decision:** Add identity-only `Honeycomb cereal / Céréales Honeycomb` for the named current Canadian finished cereal.
- **Catalog ID:** `ingredient-ref-honeycomb-cereal`
- **Category:** `GRAIN_AND_CEREAL`
- **Aliases:** none. Keep `Original Honeycomb`, `Post Honeycomb`, and the Mayrand descriptor `Céréales miel Honeycomb` out of the picker. The French display follows Post Canada’s French-language wording; it is descriptive, not an OQLF ruling.
- **Behavior:** no forms, density, unit mappings, measurements, conversions, yields, recipe links, or substitutions. Measurement research found no reusable value; substitution research remains unresearched.

## Evidence and boundary

Post Consumer Brands Canada’s [English product page](https://www.postconsumerbrands.ca/brand/honeycomb/original-honeycomb/) identifies Original Honeycomb, lists 400 g and 525 g boxes, and publishes a finished cereal ingredient panel with whole-grain corn flour, sugars including honey, and whole-grain oat flour. The manufacturer cautions that formulas and ingredients may change. Its [French-Canadian product page](https://www.postconsumerbrands.ca/fr-ca/marques/honeycomb-fr/originale/) calls the product Honeycomb, uses “les céréales Honeycomb,” and lists the same package sizes.

Québec retailer [Mayrand lists Céréales miel Honeycomb 400 g](https://mayrand.ca/fr/nos-produits/epicerie/cereales-et-barre/cereales/cereales-honey-comb-post-06993), item 06993, unit UPC 628154138983. This supports a Québec-facing product presentation and naming evidence; it does not make the retailer’s entire descriptor a preferred generic French name. Package weights and UPCs identify product presentations only. They do not establish a household measure, conversion, density, or transferable portion.

The row represents the named finished cereal. It remains distinct from honey, corn or oat ingredients, plain puffed grains, honeycomb candy, and honeycomb-textured toppings. No components or substitutes were linked.

## Picker and corpus results

The static phrase-first projection against the current bilingual catalog gives:

| Query | Before | After | Result |
|---|---:|---:|---|
| `Honeycomb`; `Honeycomb cereal`; `Céréales Honeycomb` | 0; 0; 0 | 1; 1; 1 | Each resolves to `ingredient-ref-honeycomb-cereal`. |
| `Original Honeycomb`; `Post Honeycomb` | 0; 0 | 0; 0 | No aliases were added. |
| `Céréales miel Honeycomb`; `céréales miel` | 0; 0 | 0; 0 | The retailer’s descriptive phrase remains source evidence only. |
| `honey`; `miel` | 8; 6 | 8; 6 | Unchanged. |
| `cereal`; `céréales` | 57; 53 | 58; 54 | Each broad category search gains the named cereal. |
| `puffed corn`; `honey corn cereal` | 0; 0 | 0; 0 | No component or puffed-corn aliases were added. |

The complete 114-file, 1,123-row manifest recipe scan found no candidate-specific demand. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

## Source ownership and static validation

Three sources were registered to `ingredient-ref-honeycomb-cereal`: `WP03-POST-HONEYCOMB-CEREAL-R519-20261017-S01` for the Post English product page, `WP03-POST-HONEYCOMB-CEREAL-R519-20261017-S02` for the Post French-Canadian product page, and `WP03-POST-HONEYCOMB-CEREAL-R519-20261017-S03` for the Mayrand Québec product listing. At proposal review, each source ID and exact URL was unowned. After integration the ledger has 2,150 records, 9,866 source entries, 8,350 distinct source IDs, and 7,060 distinct URLs; no source ID maps to more than one URL.

At integration the catalog contains 1,793 references, 143 forms, and 56 legacy candidates. Seed package normalization and validation passed, and the generated ingredient index is current at 1,793 references. Local Markdown links, UTF-8/no-BOM, whitespace, picker projections, recipe corpus, and source ownership were checked.

No software tests, build, emulator check, or deployment were run because this change only adds database JSON data under `AGENTS.md`. Section F remains open for broader cereal and preprocessed-grain review. See the [R519 proposal](../../proposals/wp03-section-f-next-gap-review-r519-20261017.md).
