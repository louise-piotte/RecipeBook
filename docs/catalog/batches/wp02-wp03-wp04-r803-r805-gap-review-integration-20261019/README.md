# WP02/WP03/WP04 R803–R805 integration — 2026-10-19

Integrated three bounded updates while leaving the broad Section A7, Section F, and Section P checklist items open.

## Decisions

### R803 — whole-wheat pastry-flour portions

Recorded one product-specific `portion_weight` observation on the existing `ingredient-ref-whole-wheat-pastry-flour` ledger record: King Arthur Baking Whole Wheat Pastry Graham Flour, SKU `212374`, uses the combined `Whole Wheat Pastry Flour / Graham Flour` chart row, `1 cup = 96 g`, linked to that named product.

A direct audit of the Québec Food Directory page for La Milanaise GTIN `627062110319` found conflicting same-page fields: Nutrition Facts says `1/4 cup (30 g)`, while supplemental serving information says `1/3 cup (60 g)` and `Serve prepared: Yes`. The listing attributes data to GS1 and does not explain the relationship; neither Québec quantity is recorded as an observation. The existing source `WP02A1-S03` was updated to document the conflict, and the shared King Arthur chart source `WP07-KAB-IWC` was reused. The King Arthur portion does not establish a generic cup weight or filling convention; no density, mapping, conversion, form, recipe link, or substitution was added. The English/French reference, null density, empty mappings, and `not_yet_researched` substitution state remain unchanged.

### R804 — Love Crunch Coconut granola

Added identity-only `ingredient-ref-love-crunch-dark-chocolate-coconut-granola` as `GRAIN_AND_CEREAL`:

- English: `Love Crunch Organic Dark Chocolate & Coconut Granola`
- French: `Granola avec noix de coco et chocolat noir biologique, Love Crunch`

The manufacturer’s Canada page identifies the finished granola and its product image carries UPC `058449772019`; Metro’s indexed Québec French listing pairs the same number with French wording and a 325 g package. The French listing’s direct page was unavailable, so it is used as indexed product-identity evidence only. The reference has no aliases, forms, measures, component or recipe links, conversions, yields, or substitutions. It is distinct from the R801 Red Berries product and does not claim to list the whole brand family.

### R805 — canned tuna in broth and oil

Added `ingredient-form-canned-tuna-in-broth-and-oil` under the existing `ingredient-ref-canned-tuna` parent. Labels are `canned tuna in broth and oil / thon en conserve dans le bouillon et l’huile`; match terms are `tuna in broth and oil / thon dans bouillon et huile`.

Paired Clover Leaf English and French product pages identify albacore solid and yellowfin chunk products in this combined medium. Their broth/oil ratios differ, so species, cut, ingredient formula, blend ratio, package, and drained serving stay source-specific. Current Metro Québec indexed titles support the French product wording; direct retailer page openings returned HTTP 403. The R168 English/French tuna catalog sources remain parent-owned and were reused. The water and olive-oil-only forms stay separate. No measurement, density, mapping, conversion, yield, recipe link, or substitution was added.

## Package snapshot

- **1,884** ingredient references and **199** forms.
- **56** legacy-import candidates.
- **2,292** research-ledger records, **10,741** source entries, **9,036** distinct source IDs, **7,683** distinct URLs, and **820** measurement observations.
- **114** manifest-listed recipes with **1,123** structured ingredient rows.

The 11 added source entries comprise eight new source IDs and URLs, one reused shared King Arthur chart entry, and two reused parent-owned R168 tuna catalog entries. Source IDs each map consistently to one URL; the single new R803 measurement observation ID is unique.

## Picker and recipe-corpus review

R803 changes ledger evidence only and has no picker effect. Static projections using the current phrase-first matcher show the R804 and R805 changes:

| Query | Before | After |
|---|---:|---:|
| `Love Crunch` | 1 | 2 |
| `dark chocolate and coconut`; `noix de coco et chocolat noir` | 0 / 0 | 1 / 1 |
| `granola` | 7 | 8 |
| `coconut`; `noix de coco` | 16 / 11 | 17 / 12 |
| `red berries`; `baies rouges` | 2 / 2 | 2 / 2 |
| `Cranberry Almond Crunch` | 1 | 1 |
| Full English and French tuna broth-and-oil phrases | No form hint | Canned-tuna parent with the new form hint |
| `canned tuna in broth`; `tuna in broth`; `thon en conserve dans le bouillon` | No result | Canned-tuna parent, no form hint |
| `broth`; `bouillon` | 5 / 10 | 6 / 11 |
| `canned tuna`; `thon en conserve` | 1 / 1 | 1 / 1 |
| `tuna`; `thon` | 9 / 9 | 9 / 9 |
| `canned tuna in water`; `canned tuna in olive oil` | Existing water/oil hints | Same existing hints |

The manifest-listed corpus remains 114 recipes and 1,123 ingredient rows. It has no whole-wheat pastry-flour, Love Crunch Coconut/UPC, or canned-tuna-in-broth-and-oil match. Recipe 111’s tuna steak remains separate from canned tuna. No recipe rows or links were changed.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — seed package and research ledger schema valid.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — reference names and aliases normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated index current at 1,884 references.
- Source ownership, URL consistency, observation-ID uniqueness, picker projections, and the manifest-listed recipe corpus were reviewed.
- Seed JSON is UTF-8 without BOM with non-ASCII data stored as Unicode escapes; proposal and batch documents are UTF-8 without BOM. Local links, mojibake markers, and scoped whitespace were checked.
- **No software tests, app build, emulator run, or deployment were performed.** The active database changes only add JSON data, so the no-testing rule in `AGENTS.md` applies.

## Files

- [Global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
- [R803 proposal](../../proposals/wp02-section-a7-whole-wheat-pastry-flour-measurement-review-r803-20261019.md)
- [R804 proposal](../../proposals/wp03-section-f-love-crunch-dark-chocolate-coconut-identity-review-r804-20261019.md)
- [R805 proposal](../../proposals/wp04-section-p-canned-tuna-in-broth-and-oil-form-review-r805-20261019.md)
- [Research ledger](../../research-ledger.v1.json)
