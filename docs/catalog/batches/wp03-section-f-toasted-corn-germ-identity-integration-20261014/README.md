# WP03 Section F R95 — Toasted Corn Germ Integration

Reviewed and integrated 2026-10-14. The broader Section F preprocessed-grain sweep remains open.

## Decision

Added identity-only `toasted corn germ / germe de maïs grillé` as a `GRAIN_AND_CEREAL` reference.
The French display is attested on current Québec retail ingredient labels; it is not an OQLF ruling.
Alias arrays are empty. Keep unheated corn germ, corn germ meal/cake, corn germ oil, corn oil, and
composite foods separate. The existing corn-oil row retains `huile de germes de maïs`.

The Tostitos package's 50 g serving describes the finished chips and supplies no measure for the
corn-germ ingredient. No density, mapping, form, measurement observation, recipe link, conversion,
yield, or substitution was added. The bundled recipe corpus has no matching demand.

The picker returns the new row for `toasted corn germ` and `germe de maïs grillé`; `germ` returns
wheat germ and toasted corn germ. The short query `germe` is broad because accent folding also
matches `germé` on existing sprouted-grain rows. `germes de maïs` remains on corn oil.

## Integration and validation

- Added one reference, one accepted `ingredient_reference` ledger record, and regenerated the Kotlin
  ingredient catalog index. Current counts: 1,428 references, 105 forms, 1,768 ledger records, 63
  legacy candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the Section F checklist, global catalog plan, and `roadmap.md`.
- Seed-package, reference-normalization, ledger-schema, and generated-index checks passed. Static
  picker projection, exact-key ownership, candidate source-ID uniqueness, recipe scan, UTF-8/no-BOM, local-link,
  and whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because this change only adds database
  JSON data and its generated catalog index under `AGENTS.md`.

See the detailed [R95 review](../../proposals/wp03-section-f-r95-toasted-corn-germ-identity-review-20261014.md).

## Main sources

- The [Tostitos Canada ingredient listing](https://www.tastyrewards.com/en-ca/brands/tostitos/products/tostitosr-multigrain-rounds-tortilla-chips)
  names Toasted Corn Germ in a current composite product.
- [Walmart Canada's French listing](https://www.walmart.ca/fr/ip/Chips-tortilla-Tostitos-Multigrain-Rondes/6000197240203?classType=REGULAR)
  and [Metro Québec](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/croustilles-de-mais-et-tortillas/croustilles-de-tortillas-multigrain/p/060410901151)
  both use `Germe de maïs grillé` in ingredient declarations.
- [CerealVeneta](https://cerealveneta.it/en/semi-finished/toasted-granulated-corn-germ/) documents toasted
  corn germ as a food-industry ingredient and its processing boundary.
- [CFIA's feed ingredient table](https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table?wbdisable=false)
  supports keeping oil-milling corn germ meal distinct from the toasted human-food ingredient.
