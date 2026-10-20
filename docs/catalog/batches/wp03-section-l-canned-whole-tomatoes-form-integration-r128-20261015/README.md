# WP03 Section L R128 — canned whole tomatoes

## Decision

Added `ingredient-form-tomatoes-canned-whole` under the existing generic
`ingredient-ref-tomatoes`. The label is `canned whole tomatoes` / `tomates entières en conserve`.
The catalog keeps `whole tomatoes` / `tomates entières` as aliases on generic tomatoes because the
wording does not identify a canned product by itself; those queries return the generic tomato
reference without a form hint. Explicit canned-whole phrases return the new form. Broad `canned
tomatoes` / `tomates en conserve` terms remain shared with the canned-diced form, so they do not
suggest either cut as a unique result.

The retired legacy reference candidate `ingredient-ref-whole-tomatoes` is recorded as merged into
the form and removed from `legacy-import-identities.v1.json`. Tomato paste, sauce, and the existing
canned-diced form remain separate. No recipe ingredient rows or links changed.

CFIA's Grade Compendium §47 defines whole and almost-whole canned tomato presentations separately
and lists them alongside diced and other cuts. Current Canadian retail listing evidence identifies
Aylmer whole tomatoes as a 796 mL Canadian product. Those package volume and presentation labels do
not provide a mass, density, drained yield, or conversion. [CFIA Grade Compendium, Volume 3](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-3), [Metro Aylmer Whole Tomatoes](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/tomatoes-paste/whole-tomatoes/p/058807665502).

## Data and scope

- Added one `canned_whole` form and one accepted ingredient-form ledger record.
- Added the unqualified bilingual search aliases to the generic tomato reference and documented why
  they carry no canned-state hint.
- Marked the old standalone whole-tomato candidate as merged into the form; removed it from the
  active legacy-candidate list.
- Added no density, unit mapping, package yield, recipe link, conversion, or active substitution.
- Kept the broad Section L produce checklist open.

The proposal's recipe audit covered all 114 manifest-listed recipes and 1,123 ingredient rows. It
found no canned-whole tomato recipe demand. The already-linked canned-diced line in recipe 034 remains
unchanged.

## Static validation

Passed:

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 -B tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`

No tests were run. This change only adds or updates database JSON data and its generated reference
index, as allowed by `AGENTS.md`.

After this batch, the package has 1,477 references, 108 forms, 1,821 ledger records, 7,557 source
entries, and 6,425 distinct source IDs. It has 62 active legacy candidates and 114 recipes / 1,123
ingredient rows.

See the [proposal](../../proposals/wp03-section-l-tomato-product-gap-review-20261015-r128.md) and
the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). Section L remains
open.
