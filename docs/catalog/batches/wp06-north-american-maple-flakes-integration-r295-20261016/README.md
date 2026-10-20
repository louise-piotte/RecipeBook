# WP06 North American maple-flakes identity integration — R295 — 2026-10-16

## Decision

Added identity-only `ingredient-ref-maple-flakes` as **maple flakes / flocons d’érable** in `SUGAR_AND_SWEETENER`. It remains a separate finished product from maple syrup and maple sugar. The association and producer sources describe differing production processes, so the ledger preserves those source-specific descriptions without selecting one universal method.

Aliases remain empty. No form, density, unit mapping, reusable measure, conversion, yield, recipe link, or active substitution was added. The external smoked-tea maple-salmon recipe uses flakes as an unquantified garnish; the bundled corpus has no matching demand among 114 recipes and 1,123 ingredient rows.

## Evidence and source ownership

- Érable du Québec and Maple from Canada provide the bilingual product wording and describe freeze-dried/dehydrated syrup; their pages are the same association's French and English counterparts.
- A Québec producer listing presents maple flakes made from pure maple syrup, while a separate Gaspésie producer's indexed description says crystallized syrup. The latter direct page was unavailable during review and is retained as a discrepancy lead, not a universal process claim.
- A Maple from Canada salmon recipe uses flakes as an unquantified garnish. The association's panko-to-flakes ratio is specific to one breading mixture, not a transferable measure or conversion.
- Mayrand lists flakes separately from maple sugar; its category breadcrumb does not establish synonymy. CFIA's maple-product guidance does not define flakes specifically.
- Eight new source IDs and URLs are recorded in the maple-flakes ledger record. No prior owner was found during the integration review.

## Data changes

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added one identity-only reference with empty alias arrays.
- `docs/catalog/research-ledger.v1.json`: added one reference record and eight source entries, preserving conflicting process descriptions and recording no supported reusable measurement or substitution.
- `BundledIngredientCatalog.kt`: regenerated the picker index from the bundled JSON.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: recorded the WP06 regional-sweep follow-up and maple-flakes checkpoint; broader WP06 work remains open.
- `roadmap.md`: recorded the completed review and validation.

## Verification

Static package normalization/validation, reference normalization, generated-index freshness, ledger schema and source ownership, picker projection, corpus scan, UTF-8/no-BOM, explicit Unicode-escape, local-link, and scoped whitespace checks passed. Final totals: 1,665 references, 127 forms, 2,015 ledger records, 8,892 source entries, 7,529 distinct source IDs, and 6,290 distinct URLs. The corpus remains 114 recipes and 1,123 ingredient rows.

No software tests, builds, or emulator checks were run because this change only adds database JSON data and its generated index, as directed by `AGENTS.md`.

## References

- [R295 proposal](../../proposals/wp06-north-american-maple-flakes-identity-review-r295-20261016.md)
- [Érable du Québec: flocons d’érable](https://erableduquebec.ca/produits/flocons-derable/)
- [Maple from Canada: maple flakes](https://maplefromcanada.ca/products/maple-flakes/)
- [Maple from Canada: smoked-tea maple salmon](https://maplefromcanada.ca/recipes/the-ultimate-smoked-tea-maple-salmon/)
- [Érable du Québec: sucre d’érable](https://erableduquebec.ca/produits/sucre-derable/)
- [Mayrand: pure maple flakes](https://mayrand.ca/en/our-products/grocery/sugar/maple-sugar/flocons-derable-pur-decacer-34109)
- [Amber Maple Products: maple flakes](https://www.ambermaple.ca/products/flocons-erable)
- [Ma Cabane en Gaspésie: flocons d’érable purs](https://www.macabaneengaspesie.com/collections/produits-d-erable/products/flocons-derable)
- [CFIA: labelling requirements for maple products](https://inspection.canada.ca/en/food-labels/labelling/industry/maple-products)
