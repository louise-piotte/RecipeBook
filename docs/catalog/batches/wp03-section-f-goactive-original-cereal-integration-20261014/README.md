# WP03 Section F R96 — Kashi GoActive Original Cereal Integration

Reviewed and integrated 2026-10-14. The broader Section F preprocessed-grain sweep remains open.

## Decision

Added identity-only `Kashi GoActive Original Cereal / Céréales Kashi GOACTIVE Originale` as
`ingredient-ref-kashi-goactive-original-cereal` in `GRAIN_AND_CEREAL`. Current Canadian manufacturer
labels establish the bilingual product identity, its ingredient declaration, and a product-specific
1 cup (52 g) serving; Kashi's Québec product listing uses the French name. Keep the finished boxed
cereal distinct from the inner puffed-grain blend, component ingredients, other cereals, and the
older Go Lean listing.

Alias arrays and forms are empty. Default density is null and unit mappings are empty. The 1 cup
(52 g) serving is recorded only as a product-specific ledger observation because the manufacturer
does not specify a cup-volume convention or measuring method. No general conversion, recipe link,
yield, or substitution was added. The 114-recipe corpus has no matching product demand.

## Integration and validation

- Added one canonical ingredient reference, one accepted `ingredient_reference` research-ledger
  record, and regenerated the Kotlin ingredient catalog index. Current counts: 1,429 references,
  105 forms, 1,769 ledger records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the Section F checklist, global catalog plan, roadmap, and proposal decision status.
- Seed-package and reference-normalization checks passed; research-ledger schema validation passed;
  generated-index check passed. Static picker projection, source/ID ownership, recipe-corpus,
  UTF-8/no-BOM, local-link, and whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the application change adds
  database JSON data and its generated catalog index under the `AGENTS.md` exception.

See the detailed [R96 review](../../proposals/wp03-section-f-r96-goactive-original-cereal-identity-review-20261014.md).

## Sources

- [WK Kellogg Canada English SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00018627115939) and
  [French SmartLabel](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00018627115939) show the
  same UPC and package, the exact English and French product names, the ingredient lists, and the
  product-specific 1 cup / 1 tasse (52 g) serving.
- Kashi Canada's [French product page](https://www.kashi.ca/fr/produits/cereales-kashi-goactive-originales-product)
  uses `Céréales Kashi GOACTIVE Originale` and lists Québec-area retailers.
- A separate [Super C Go Lean listing](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-soufflees-de-8-grains-entiers/p/018627597667)
  has an older eight-grain name and formulation; it was not used as an alias or as evidence for the
  current GoActive formula.
