# WP05 Section V — Cooking-wine product boundary review

**Date:** 2026-10-12  
**Disposition:** Research integrated as a held boundary; no active catalog row or alias is warranted by current recipe demand.

## Decision

Keep named salted white and red cooking wines, salted Shaoxing cooking wine, mirin-style sweet
cooking seasoning, and shio mirin distinct from plain wine or generic mirin when a recipe identifies
those products. Do not add a broad `cooking wine / vin de cuisine` alias: Québec terminology
establishes the term pair but not one composition, and Canadian listings use overlapping cooking-use
labels for products with different reported ingredients.

The bundled corpus has no product-qualified demand. Recipe 066#9 says only `mirin`; recipe 096#4 says
only `white wine`. Neither supports relinking to a cooking product. No forms, measurements, density,
unit mappings, conversions, yields, substitutions, or recipe links changed. The plan item is complete
as a reviewed disposition, with activation deferred until an exact recipe or imported-library line
requires a named product.

## Held boundaries

- Metro's Château Thierry white cooking wine listing reports wine with 1.5 g salt per 100 mL;
  Loblaws lists Kedem red cooking wine as selected red grapes seasoned with 1.5% salt. These named
  products are not aliases of plain white or red wine.
- Walmart's Double Happiness Shao Xing cooking wine lists water, glutinous rice, wheat, salt, and
  caramel colour. Keep the salted product distinct from sake, generic rice wine, and any unqualified
  Shaoxing beverage.
- Kikkoman Kotteri mirin-style sweet cooking seasoning has a listed corn-syrup/glucose-fructose
  formulation. Keep it distinct from generic mirin if specifically requested.
- OQLF identifies shio mirin as a salted type, but no current Canadian product package was verified.
  Preserve the term as a held subtype and do not make it an alias of generic mirin.
- T&T Shaoxing/Huadiao/rice cooking products and Mizkan sweet cooking seasoning remain held because
  accessible Canadian listings did not expose enough package ingredients or French product wording
  for a product-specific catalog decision.

## Evidence

The full source register, product-specific limits, and recipe-demand audit are in
[`wp05-section-v-salted-cooking-wines-boundary-review-20261012.md`](../../proposals/wp05-section-v-salted-cooking-wines-boundary-review-20261012.md).
Root review additionally verified the current Loblaws Kedem red-wine ingredient declaration and
Québec product wording, and Walmart Canada's French Shao Xing listing. The evidence supports these
named examples only; it does not define one generic cooking-wine composition or any conversion or
substitution.

This integration changed documentation only. No app tests or emulator checks were needed.
