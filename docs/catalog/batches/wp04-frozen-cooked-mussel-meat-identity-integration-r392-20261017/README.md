# WP04 frozen cooked mussel-meat identity integration — R392

## Decision

Added one identity-only `PROTEIN` reference: `frozen cooked mussel meat / chair de moule cuite surgelée`. Kept only the exact paired product-title variants `frozen cooked mussel meat without shell` and `chair de moule cuite sans coquilles surgelée` as aliases. The shell-free wording belongs to those named SKUs; it does not declare a universal state for every product in the identity group.

Super C and Food Basics list the same 900 g product number, `710497549028`, in French and English. Metro lists the paired 340 g product number `059749994569` with “without shell” / “sans coquilles” titles. The pages identify no scientific species. MAPAQ's older Québec factsheet lists individually frozen cooked blue-mussel meat as a producer format; that does not identify the retailer SKUs or create a reusable package measure. CFIA lists generic mussel names across multiple taxa, so the new identity stays species-neutral.

Kept `ingredient-ref-blue-mussel`, Mediterranean and green-lipped mussels, the unresolved generic mussel candidate, smoked mussels, mussels in brine, escabeche, dried mussels, and seafood medley products separate. The identity does not assert a universal shell state, immediate readiness, or preparation instructions. Added no forms, measures, density, unit mappings, recipe links, conversions, yields, or substitutions. The package amounts remain source-specific; measurement research found no supported reusable value, and substitution research found no supported substitute. The 114-recipe / 1,123-row corpus has no matching mussel ingredient request.

Four retailer records and the reused CFIA and MAPAQ source records are linked to the accepted decision under `ingredient-ref-frozen-cooked-mussel-meat`.

## Sources

- [Super C: Chair de moule cuite surgelée, 900 g](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/chair-de-moule-cuite-surgelee/p/710497549028)
- [Food Basics: Frozen Cooked Mussel Meat, 900 g](https://www.foodbasics.ca/aisles/frozen/fish-seafood/shrimp-seafood/frozen-cooked-mussel-meat/p/710497549028)
- [Metro: Frozen Cooked Mussel Meat without Shell, 340 g](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/shrimp-seafood/frozen-cooked-mussel-meat-without-shell/p/059749994569)
- [Metro: Chair de moule cuite sans coquilles surgelée, 340 g](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/chair-de-moule-cuite-sans-coquilles-surgelee/p/059749994569)
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp)
- [MAPAQ: Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf)

## Static validation

- Bundled seed package and research ledger validation passed.
- Ingredient-reference normalization and generated picker-index freshness passed; the index contains 1,703 references after the R392 and R393 additions.
- New source IDs are unique; reused source IDs still resolve to the same URLs.
- Exact phrase ownership, source links, UTF-8 without BOM, mojibake scan, and scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, or deployment tests were run for this database JSON addition under `AGENTS.md`.

See the [R392 proposal](../../proposals/wp04-section-p-frozen-cooked-mussel-meat-product-boundary-review-r392-20261017.md). Section P remains open.
