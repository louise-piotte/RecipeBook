# WP04 Section Q salted duck-egg form integration — R292 — 2026-10-16

## Decision

Added `ingredient-form-duck-egg-salted` under the existing `ingredient-ref-duck-egg` reference. The bilingual display is **salted duck egg / œuf de canard salé**, with narrow plural and cooked-salted matching terms. The form captures salting without requiring that the egg be cooked. The French wording is attested on Québec-facing products and is not claimed as an OQLF-standardized term.

Kept salted duck-egg yolk, preserved duck egg / century egg / pidan, chicken and quail eggs, and generic salted egg separate. No new ingredient reference, density, measure, conversion, yield, recipe link, or active substitution was added. The ledger records that no reusable measurement or supported substitution was established. No matching recipe demand was found among the 114 bundled recipes and 1,123 ingredient rows.

## Evidence and source ownership

- T&T Supermarket's Québec-facing China Maid listing uses **Œufs de Canard Salés** for a 375 g product. Its URL slug says “preserved,” but the listing title does not justify treating salted and preserved eggs as synonyms. The listing's direct page returned an internal error; indexed product details were used, and no ingredient declaration was claimed.
- T&T's egg category separately lists salted duck eggs, cooked salted duck eggs, preserved duck eggs, and salted duck-egg yolk. These product names support the picker boundary only.
- Walmart Canada's French listing identifies a whole, cooked, salted duck-egg product with duck eggs, salt, and water. Its 350 g package and stock status remain SKU-specific.
- The CFIA egg commodity page is reused under existing source ID `WP04-EGG-S01`. It supplies broad licensing-category context only. No source ID or URL was duplicated, and the existing CFIA source mappings remain unchanged.

## Data changes

- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`: added one salted form, with no density.
- `docs/catalog/research-ledger.v1.json`: added one form record, three new retailer source IDs, one reused CFIA source ID, and one no-supported-substitution finding. No measurement observation was added.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: checked the salted whole-duck-egg subtask; the broader Section Q checklist remains open.
- `roadmap.md`: recorded the completed review and validation.

## Verification

Static database/package validation passed: bundled-package normalization and validation, reference normalization check, generated catalog check, ledger schema and source ownership, form and substitution boundaries, picker projection, 114-recipe corpus scan (1,123 ingredient rows), UTF-8/no-BOM and explicit Unicode-escape checks, Markdown links, and scoped whitespace checks.

Final totals: 1,663 references, 127 forms, 2,013 ledger records, 8,872 source entries, 7,512 distinct source IDs, and 6,273 distinct URLs. The bundle remains at 114 recipes and 1,123 ingredient rows.

No software tests, builds, or emulator checks were run because this change only adds database JSON data, as directed by the project's `AGENTS.md`.

## References

- [R292 proposal](../../proposals/wp04-section-q-salted-duck-egg-form-review-r292-20261016.md)
- [T&T salted duck egg listing](https://www.tntsupermarket.com/fr/74792601-cm-preserved-duck-eggs.html)
- [T&T egg category](https://www.tntsupermarket.com/eng/product-categories/tt-dairy-frozen/tt-eggs.html)
- [Walmart Canada French product listing](https://www.walmart.ca/fr/ip/Six-Fortune-Cuits-ufs-Sal-s-Du-Canard/6000196478522)
- [CFIA egg commodity guidance](https://inspection.canada.ca/en/food-licences/obtain-licence?wbdisable=true)
