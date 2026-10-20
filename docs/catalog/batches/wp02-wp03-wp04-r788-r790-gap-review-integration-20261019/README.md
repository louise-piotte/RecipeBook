# WP02/WP03/WP04 R788–R790 integration — 2026-10-19

Integrated three reviewed gaps across glutinous-rice-flour substitution evidence, the Quaker Squares
cereal family, and water-packed canned tuna. The active changes stay within the recipe evidence and
product scopes established by their sources.

## Decisions

- **R788 — glutinous-rice-flour substitution evidence:** Updated the existing
  ingredient-ref-glutinous-rice-flour ledger row with one ICE garlic-scape kimchi-pancake finding:
  the named recipe can be made with all-purpose flour alone. The page gives no revised amount, so no
  equal-quantity replacement or adjustment was inferred. Preserved R785's five measurement
  observations and measurement state. Added no active rule, recipe link, alias, or measurement.
  See the [R788 proposal](../../proposals/wp02-b2-b3-next-open-gap-review-r788-20261019.md).
- **R789 — Quaker Squares cereal family:** Added identity-only bilingual references for Corn Squares,
  Oatmeal Squares, and Oatmeal Squares Maple & Brown Sugar Flavour. Recorded one manufacturer
  Nutrition Facts portion for each named cereal (1 cup / 30 g; 3/4 cup / 45 g; 3/4 cup / 45 g),
  without turning those portions into a general measure. Reused the existing French Corn Squares
  source ID under its original corn-bran owner. Added no aliases, forms, density, mappings, recipe
  links, or substitutions. See the
  [R789 proposal](../../proposals/wp03-section-f-next-open-gap-review-r789-20261019.md).
- **R790 — canned tuna in water:** Added one bilingual canned tuna in water / thon en conserve
  dans l’eau form under the existing canned-tuna market identity. Clover Leaf pages document three
  products spanning albacore, skipjack, and yellowfin and chunk/flaked presentations. Recorded each
  product's 1/2-can drained (55 g) label portion separately. These observations do not define a
  shared can size, drained yield, or conversion. No recipe link or substitution was added. See the
  [R790 proposal](../../proposals/wp04-section-p-next-open-gap-review-r790-20261019.md).

## Package state

- 1,876 ingredient references and 196 forms.
- 114 manifest-listed recipes and 1,123 structured ingredient rows.
- 2,281 research-ledger records, 10,678 source entries, 8,987 distinct source IDs, and 7,634
  distinct source URLs.
- R789's generated Kotlin reference index is current at 1,876 references.

## Static verification

- python3 tools/seed_package/normalize_bundled_seed_package.py --check — normalized.
- python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only — valid, including
  bundled schema and research-ledger validation.
- python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check — current.
- All 14 new source IDs map to their documented source URL. R789's Squares family source is shared
  across the three new cereal records; the pre-existing French Corn Squares source remains owned by
  the corn-bran record and is reused without a second ID.
- The picker projection keeps full Quaker product phrases product-specific and leaves broad
  cereal/fish searches multi-result. The exact canned-tuna water phrases point to the existing
  canned-tuna reference and carry the proposed form hint; generic tuna and thon queries remain
  unchanged.
- The 114-file / 1,123-row recipe corpus contains no Quaker Squares or canned-tuna demand. Its only
  tuna row remains the raw tuna steak in recipe 111. R788's ICE recipe is external to the bundle.
- Bundled JSON remains ASCII-escaped with no BOM; the research ledger and Markdown are UTF-8 without
  BOM. The new source IDs, observation IDs, and relative proposal links were checked. Scoped
  git diff --check passed for the integration files.

No software tests, build, emulator run, or deployment were performed because the active application
change only adds database JSON data (and its generated reference index), as specified in AGENTS.md.
The Section A6, Section F, and Section P parent checklists remain open.
