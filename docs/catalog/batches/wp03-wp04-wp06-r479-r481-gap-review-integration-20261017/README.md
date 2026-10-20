# WP03/WP04/WP06 R479–R481 gap review integration — 2026-10-17

## Decisions

| Review | Disposition | Boundary |
|---|---|---|
| [R479 steel-cut-oat terminology](../../proposals/wp03-section-f-next-gap-review-r479-20261017.md) | Added English aliases `Irish oats` and `pinhead oats`, plus French alias `avoine irlandaise`, to `ingredient-ref-steel-cut-oats`. | Retained `steel-cut oats / avoine découpée` as the display. Kept prepared `gruau irlandais`, `avoine écossaise`, discouraged `avoine épointée`, and broad flake wording out of aliases. Added no forms, measurements, recipe links, conversions, or substitutions. |
| [R480 lobster meat](../../proposals/wp04-section-p-lobster-meat-product-boundary-review-r480-20261017.md) | Added identity-only `lobster meat / chair de homard` as `ingredient-ref-lobster-meat` in `PROTEIN`, with one `cooked_frozen` form. | Kept meat separate from American and European lobster, intact claws, the held tail, lobster paste, tomalley, roe, cocktail, and imitation products. Species, cuts, package sizes, and formulas remain SKU-specific. Added no aliases, measures, conversions, yields, recipe links, or substitutions. |
| [R481 dried Gnetum leaves](../../proposals/wp06-african-next-regional-review-r481-20261017.md) | Added identity-only `dried Gnetum leaves / feuilles séchées de Gnetum` as `ingredient-ref-dried-gnetum-leaves` in `VEGETABLE_AND_AROMATIC`. | Kept regional names and species names out of global aliases. Added no forms, measures, density, mappings, conversions, yields, recipe links, or substitutions. |

## Evidence and corpus

- R479 reuses the existing OQLF entry for `avoine découpée`; RICARDO supports `avoine irlandaise`, and the Bob’s Red Mill Canada product page independently describes the cut-oat relationship. The product and recipe amounts remain source-specific.
- R480 uses two Metro locale pages for one Sogel SKU, a second Atlantic Star SKU, and already-registered La Pantrée, La Mer, MAPAQ, and CFIA sources. Existing source IDs and URL ownership were reused for those shared sources. The Sogel species declaration and every package amount remain SKU-specific.
- R481 uses Codex and FAO/PROTA evidence for the genus-level leaf product and dried trade form, plus current Québec and Canadian retail pages. Local names including `eru`, `okok`, `okazi`, `fumbwa`, `afang`, `ukasi`, and `koko` remain source context only.
- The manifest-ordered scan covered all **114 recipe files** and **1,123 structured ingredient rows**. None of the candidate-specific or boundary phrases matched a recipe file or ingredient row. The corpus fingerprint remains `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

## Picker projection

- R479 routes `Irish oats`, `pinhead oats`, and `avoine irlandaise` to the existing steel-cut-oats row. The broad `oats` and `avoine` result counts do not increase.
- R480 adds one lobster-meat result to exact `lobster meat` / `chair de homard` queries; the cooked-frozen product phrases show the attached form. Broad `lobster` / `homard` searches remain multiple-result searches.
- R481 makes the exact dried-Gnetum display searchable. Local-name and species phrases remain unowned by this identity.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` and `--check` passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at **1,759 references**.
- Research-ledger JSON Schema validation passed. Source-ID ownership has one URL per ID; the 11 newly allocated IDs map to the 11 new URLs, and all newly referenced pre-existing sources retained their registered URLs.
- The recipe corpus scan found no candidate hits. JSON files are UTF-8 without BOM and use explicit Unicode escapes. Scoped whitespace checks passed for the files changed by this batch.
- No app tests, builds, emulator checks, or deployment were run for this batch because it only adds database JSON data and regenerates the data-derived ingredient index under `AGENTS.md`.

## Snapshot after integration

- 1,759 ingredient references; 143 forms; 56 legacy-import candidates.
- 2,118 ledger records; 9,663 source entries; 8,201 distinct source IDs; 6,914 distinct source URLs.
- 114 recipes; 1,123 ingredient rows; manifest-ordered recipe corpus SHA-256: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.
- Reference JSON SHA-256: `6ee14418ed799f355ca1b4d4288fa0c1a632af64d845d981d45d08c941e2c01c`.
- Form JSON SHA-256: `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6`.
- Research-ledger SHA-256: `4297add583a88dabe2d17b7f4741c1ca086630e53d676a80d799fc55138d7127`.

Broader Section F grain coverage, Section P seafood coverage, and African regional coverage remain open.
