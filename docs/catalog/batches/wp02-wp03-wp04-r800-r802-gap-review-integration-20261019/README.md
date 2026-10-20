# WP02/WP03/WP04 R800–R802 integration — 2026-10-19

Integrated three bounded catalog updates while keeping the broader Section A7, F, and P reviews open.

## Decisions

### R800 — emmer-flour product portion

Added Purcell Mountain Farms Organic Emmer Flour’s published Nutrition Facts serving, **1/4 cup (45 g)**, as one `portion_weight` observation on the existing `ingredient-ref-emmer-flour` ledger row. Allocated source `WP02A4-EM-S04`; observation ID: `emmer-flour-purcell-organic-whole-grain-quarter-cup-45-g-r800-20261019`. The amount stays specific to the named whole-grain Unifine product. No generic cup weight, density, mapping, conversion, or Québec availability is inferred. The active emmer-flour reference and substitution research state remain unchanged.

### R801 — Love Crunch Red Berries granola

Added identity-only `ingredient-ref-love-crunch-dark-chocolate-red-berries-granola`, displayed as **Love Crunch Organic Dark Chocolate & Red Berries Granola / Granola au chocolat noir et baies rouges biologique, Love Crunch**, in `GRAIN_AND_CEREAL`. The English and French-localized Nature’s Path Canada pages carry the same UPC digits in their product-image filenames; Metro Québec’s indexed French listing pairs product number `058449771760` with French product wording. Allocated manufacturer English/French, retailer, and collection sources S01–S04. The row has no aliases, forms, measurements, component or recipe links, conversions, yields, or substitutions. It represents one supported variant, not a complete Love Crunch family roster.

### R802 — canned tuna in olive oil

Added `ingredient-form-canned-tuna-in-olive-oil` under existing `ingredient-ref-canned-tuna`, labeled **canned tuna in olive oil / thon en conserve dans l’huile d’olive**. English and French form match terms are `tuna in olive oil` and `thon dans l’huile d’olive`. Allocated current Clover Leaf catalogue and product sources S01–S04 and reused the parent-owned R168 Metro Québec source without changing its URL. Species, cut, formula, package amount, drained state, serving, and no-drain instruction remain product-specific. No measurement, density, unit mapping, conversion, yield, recipe link, or substitution was added.

## Package snapshot

- **1,883** ingredient references and **198** forms.
- **56** legacy-import candidates.
- **2,290** research-ledger records, **10,730** source entries, **9,028** distinct source IDs, **7,675** distinct URLs, and **819** measurement observations.
- **114** manifest-listed recipes with **1,123** structured ingredient rows.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package is normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — package and ledger schema are valid.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — reference names and aliases are normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated index is current at 1,883 references.
- The nine newly allocated source IDs are unique and each maps to one URL. The reused R168 source ID retains its URL. Observation IDs are unique.
- Static picker projection with the current phrase-first matcher:

  | Query | Before | After |
  |---|---:|---:|
  | `Love Crunch` | 0 | 1 |
  | `dark chocolate and red berries`; `chocolat noir et baies rouges` | 0 | 1 |
  | `granola` | 6 | 7 |
  | `red berries`; `baies rouges` | 1 / 1 | 2 / 2 |
  | `Cranberry Almond Crunch` | 1 | 1 |
  | `canned tuna in olive oil`; `tuna in olive oil` | 0 / 0 | 1 / 1 (olive-oil form hint) |
  | `thon en conserve dans l’huile d’olive`; `thon dans l’huile d’olive` | 0 / 0 | 1 / 1 (olive-oil form hint) |
  | `thon en conserve dans l’huile` | 0 | 1 (parent, no form hint) |
  | `canned tuna`; `thon en conserve` | 1 / 1 | 1 / 1 |
  | `tuna`; `thon` | 9 / 9 | 9 / 9 |
  | `olive oil`; `huile d’olive` | 3 / 3 | 4 / 4 |

- The manifest-listed corpus scan covered 114 files and 1,123 ingredient rows. It found no emmer/flour candidate, Love Crunch/UPC/product-name, or canned-tuna-in-olive-oil match. Recipe 111’s tuna steak and separate olive-oil line are not canned tuna.
- Seed JSON remains ASCII-escaped UTF-8 without BOM; documentation is UTF-8 without BOM. Source ownership, local links, and scoped whitespace were reviewed.
- **No software tests, app build, emulator run, or deployment were performed.** The active catalog changes add database JSON data, so the no-testing rule in `AGENTS.md` applies.

## Files

- [Global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
- [R800 proposal](../../proposals/wp02-section-a7-next-grain-meal-gap-review-r800-20261019.md)
- [R801 proposal](../../proposals/wp03-section-f-love-crunch-red-berries-identity-review-r801-20261019.md)
- [R802 proposal](../../proposals/wp04-section-p-canned-tuna-in-olive-oil-form-review-r802-20261019.md)
- [Research ledger](../../research-ledger.v1.json)
