# WP06 Europe R449 Piquillo pepper identity integration

Integrated on 2026-10-17 after root review of the [R449 proposal](../../proposals/wp06-europe-piquillo-pepper-identity-review-r449-20261017.md).

## Decision

Added identity-only `piquillo pepper / piment de piquillo` as `ingredient-ref-piquillo-pepper` in `VEGETABLE_AND_AROMATIC`, with `piquillo peppers` as its only alias. Québec-facing Metro product wording supports the English plural and French singular ingredient name; ILIOS lists Piquillo peppers imported from Peru, so the generic variety row does not imply Lodosa origin. Kept `Pimiento del Piquillo de Lodosa`, `Piquillo de Lodosa`, and `Lodosa` outside the aliases because those terms concern the protected-origin subset. Kept other named peppers separate.

The complete 114-recipe / 1,123-row bundled corpus has no matching phrase or linked recipe. Added no forms, reusable measures, density, unit mappings, recipe links, conversions, yields, or substitutions. Measurement research found no supported reusable value; substitution research remains not yet researched.

## Data and validation

- Added one reference and one identity ledger record with eight source entries. The general ILIOS catalogue URL is already present for unrelated product locators; this record uses a new source ID and the Piquillo-specific item locator.
- Ingredient forms remain at **141**; no recipe files or numeric behavior changed.
- Current totals: **1,741 references**, **141 forms**, **2,100 research-ledger records**, and **9,551 source entries**.
- Bundled package normalization and validation passed; the generated ingredient index is current. UTF-8, no-BOM, and touched-document whitespace checks passed.
- No app tests, build, emulator check, or deployment was run because this update only adds database JSON data.

## Sources reviewed

- [European Commission, Implementing Regulation (EU) 2020/1528](https://eur-lex.europa.eu/eli/reg_impl/2020/1528/oj/eng), confirming the current registered Piquillo de Lodosa PDO name.
- [Spanish Ministry of Agriculture, Piquillo de Lodosa PDO specification](https://www.mapa.gob.es/dam/mapa/contenido/alimentacion/temas/calidad-agroalimentaria/2017-calidad-diferenciada/nuevo_denominaciones/pliegos-de-condiciones/pliego-condiciones-agroalimentarios/pimiento_piquillo_lodosa_2020_10_21.pdf) and [official product record](https://www.mapa.gob.es/es/alimentacion/temas/calidad-agroalimentaria/dop-igp/detalle/hortalizas/dop_pimientopiquillo), used to bound the protected product and its variety.
- Metro Québec [French listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/piments-de-piquillo-grilles/p/055789001076) and [English listing](https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/pickles-antipasto/grilled-piquillo-peppers/p/055789001076) for the same item 055789001076. The retailer pages were search-indexed but direct Metro fetches returned 403 during review.
- [ILIOS Foods French catalogue](https://fr.iliosfoods.ca/products), item 2895IG, listed as Piments Piquillo and imported from Peru.
- Montréal retailer [L’Española’s Lodosa listing](https://lespanola.com/products/el-navarrico-whole-lodosa-piquillo-peppers-390-g) and [Piquillo de Lodosa regulatory board origin page](https://www.piquillodelodosa.com/en/denominacion-origen/origen), used for the protected-region boundary. The retailer page does not establish PDO certification.

WP06 Europe remains open for other regional identities.
