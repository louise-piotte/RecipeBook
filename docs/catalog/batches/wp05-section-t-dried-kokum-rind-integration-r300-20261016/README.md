# WP05 Section T dried kokum rind integration — R300 — 2026-10-16

## Decision

Added identity-only `ingredient-ref-dried-kokum-rind` as **dried kokum rind / écorce séchée de kokum** in `BAKING_AND_SPICE`. Added English alias `kokam` and French aliases `kokum séché` and `amsul`.

The identity is scoped to the *Garcinia indica* fruit rind used as a dried souring spice. It remains separate from Malabar tamarind (*Garcinia cambogia*), goraka, tamarind, kokum butter, juices, powders, syrups, and prepared drinks. The borrowed name `kokum` is retained in French with a clear product description; no OQLF entry for this culinary product was found.

The French-language retailer's suggestion to substitute kokum for tamarind mentions coconut dishes broadly but lacks recipe-level role, method, and preparation scope. It is recorded as blocked evidence. No active substitution rule, form, measurement, conversion, yield, or recipe link was added. The 200 g retail package is package data only. The bundled corpus has no matching demand.

## Data changes

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added one identity-only reference.
- `docs/catalog/research-ledger.v1.json`: added one reference record, five new source IDs, one reused Health Canada source ID, and one blocked substitution finding.
- `BundledIngredientCatalog.kt`: regenerated the picker index from the bundled JSON.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: resolved the kokum identity item and updated the regional and Section T checklists; goraka remains open.
- `roadmap.md`: recorded the review and static validation.

## Verification

Static package normalization/validation, reference normalization, generated-index freshness, ledger schema and source ownership, picker projection, corpus scan, UTF-8/no-BOM, explicit Unicode escaping, local links, and scoped whitespace checks passed. No software tests, builds, or emulator checks were run for this database JSON addition, following the repository instruction.

## References

- [R300 proposal](../../proposals/wp05-section-t-dried-kokum-rind-identity-review-r300-20261016.md)
- [ICAR-CCARI Goa: Kokum](https://ccari.res.in/dss/kokum.html)
- [Indian Institute of Spices Research: Garcinia](https://www.spices.res.in/crops/garcinia)
- [Zaika Foods: Kokum](https://zaikafoods.ca/products/zaika-kokum)
- [Table Indienne: Kokum (Amsul)](https://www.table-indienne.fr/fr/products/kokum)
- [Spices Board of India: Kokam](https://www.indianspices.com/spice-catalog/kokam.html)
- [Health Canada: Groupes de cultures et propriétés chimiques](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html)
