# WP02/WP03/WP04 R797–R799 integration — 2026-10-19

Integrated three bounded follow-ups while keeping the broader Section A7, F, and P reviews open.

## Decisions

### R797 — Khorasan flour portion

Recorded the Québec Food Directory's **1/3 cup (60 g)** nutrition serving for La Milanaise Organic Unbleached White Khorasan Flour (GTIN `627062198614`) as one `portion_weight` observation on the existing `ingredient-ref-khorasan-flour` research-ledger row. Reused the existing `WP02A4-KH-S02` source entry and refreshed its product-sheet locator and support text. Observation ID: `la-milanaise-white-khorasan-flour-third-cup-60g-r797-20261019`.

The observation remains product-specific. The active identity and aliases, null density, empty unit mappings, and `not_yet_researched` substitution state remain unchanged. Do not transfer the portion to Khorasan semolina, whole or sifted flour, or a general cup conversion.

### R798 — Great Grains Nut Medley hold

Kept Post Great Grains Nut Medley outside active references and the research ledger. The Canadian retailer-linked result and brand-level Canadian manufacturing report do not establish this current SKU or a product-matched Canadian French name; the Québec phrase is historical. No ID, alias, source record, or active data was allocated. Reopen only with current product evidence and product-matched French naming.

### R799 — canned mackerel in tomato sauce

Added identity-only `ingredient-ref-canned-mackerel-in-tomato-sauce`, displayed as **canned mackerel in tomato sauce / maquereau en conserve à la sauce tomate**, in `PROTEIN`. Its French aliases are `maquereau en sauce tomate` and `morceaux de maquereau en sauce tomate`, matching the reviewed Grace Foods, Ligo, and Old Fisherman product wording. The row is species-neutral and has no English aliases, density, mappings, forms, observations, conversions, yields, recipe links, or substitutions.

Allocated R799 source IDs S01–S03 for Aliments Toyo, Provigo Québec, and Grace Foods Canada. Reused existing R176 source IDs S06 and S07 for Brunswick's manufacturer page and Walmart Canada's canned-mackerel category; those same source IDs and URLs remain on the broad canned-mackerel owner. Updated their access date and support descriptions to match the current page checks. Grace's French catalogue lists plain tomato-sauce mackerel separately from chili-qualified mackerel and chinchard. No scientific species or common sauce formula is inferred.

## Current package snapshot

- **1,882** ingredient references and **197** forms.
- **56** legacy-import candidates.
- **2,288** research-ledger records, **10,720** source entries, **9,019** distinct source IDs, **7,666** distinct source URLs, and **818** measurement observations.
- **114** manifest-listed recipes with **1,123** structured ingredient rows.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — already normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid, including package and research-ledger schema validation.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — current at 1,882 references.
- Research-ledger source IDs map consistently to one URL; the new R799 IDs each map to one new URL, while reused R176 IDs retain their existing URL.
- No exact reference-name, alias, or form-term owner conflicts with the R799 display/aliases; the R797 observation ID is unique, and each new R799 source ID is allocated once.
- Static picker projection with the current phrase-first matcher:

  | Query | Before | After |
  |---|---:|---:|
  | `canned mackerel in tomato sauce`; `mackerel in tomato sauce` | 0 | 1 |
  | `maquereau en conserve à la sauce tomate`; `maquereau en sauce tomate`; `morceaux de maquereau en sauce tomate` | 0 | 1 |
  | `canned mackerel`; `maquereau en conserve` | 1 | 2 |
  | `mackerel`; `maquereau` | 9 / 7 | 10 / 8 |
  | `tomato sauce`; `sauce tomate` | 3 / 3 | 4 / 4 |
  | `mackerel in tomato sauce with chili` | 0 | 0 |

- The manifest-ordered scan found no Khorasan/Kamut, Great Grains/Nut Medley, or mackerel/maquereau match in the 1,123 structured recipe ingredient rows. One row in recipe 090 requests generic tomato sauce and remains linked to `ingredient-ref-tomato-sauce`; it is not seafood demand.
- Updated JSON files are ASCII-escaped without BOM. Proposal and integration documentation is UTF-8 without BOM. Local proposal links and scoped whitespace checks were reviewed.
- **No software tests, app build, emulator run, or deployment were performed after integration.** The active application-data changes only add database JSON, so the `AGENTS.md` testing exception applies.

## Files

- [Global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
- [R797 proposal](../../proposals/wp02-section-a7-next-grain-meal-gap-review-r797-20261019.md)
- [R798 proposal](../../proposals/wp03-section-f-next-cereal-grain-gap-review-r798-20261019.md)
- [R799 proposal](../../proposals/wp04-section-p-canned-mackerel-tomato-sauce-product-review-r799-20261019.md)
- [Research ledger](../../research-ledger.v1.json)
