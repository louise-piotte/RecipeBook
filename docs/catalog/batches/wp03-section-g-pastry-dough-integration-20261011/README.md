# WP03 Section G pastry and dough identity integration — 2026-10-11

## Scope

This batch adds five product identities supported by Québec terminology or supplier/product
listings. The recipe audit found no purchased pastry or dough ingredient lines for these products;
the references therefore have no recipe links or numeric behavior.

## Integrated references

| ID | English / fr-CA display | Accepted aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-puff-pastry` | `puff pastry / pâte feuilletée` | EN: `flaky pastry` | Do not encode butter/margarine formulation or sheet presentation as a form. Rough puff remains separate and unallocated. |
| `ingredient-ref-phyllo-pastry` | `phyllo pastry / pâte filo` | EN: `filo`, `phyllo dough`, `filo dough`; fr-CA: `pâte phyllo` | Keep separate from puff pastry; no sheet-count-to-mass conversion. |
| `ingredient-ref-kataifi-dough` | `kataifi dough / pâte kataifi` | EN: `kataifi pastry`, `knafi pastry` | Keep shredded dough separate from phyllo, generic shredded pastry, and prepared kunafa mix. |
| `ingredient-ref-shortcrust-pastry` | `shortcrust pastry / pâte brisée` | None | Keep separate from puff pastry, shortbread dough (*pâte sablée*), and the broader pie-crust identity. |
| `ingredient-ref-pizza-dough` | `pizza dough / pâte à pizza` | None | Keep separate from baked/parbaked pizza crusts and prepared bases. |

All five use `BAKING_MIXIN_AND_PANTRY`. They have no forms, densities, unit mappings, recipe links,
package yields, conversions, or substitutions. No direct recipe amounts or retail package weights were
promoted.

## Open boundaries

- **Rough puff / blitz puff:** no bought-product evidence or bundle demand supports a reference now;
  keep it separate from classic puff pastry.
- **Pie shells:** keep the existing `pie crust / pâte à tarte` identity and its six recipe lines.
  Leave shell-state modeling and the candidate `pie shell` alias open; do not merge shortcrust or
  assign a universal five-inch shell mass.
- **American biscuit dough:** the English product concept is distinct from cookies, baked biscuits,
  scones, and biscuit mix, but its Québec French display remains unresolved. Do not alias the
  ambiguous *pâte à biscuits*.
- **Bought choux paste and shells:** keep raw paste separate from unfilled cream-puff and éclair
  shells; the bundle has no bought-product line and the wholesale French labels do not establish a
  preferred general Québec name.

## Evidence

- [OQLF's *pâte feuilletée* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429641/pate-feuilletee)
  pairs the term with *puff pastry* and *flaky pastry*. A [Québec Selection product listing](https://www.superc.ca/en/aisles/frozen/meals-sides/chicken-turkey-meals/frozen-rolled-puff-pastry-sheets/p/059749950275)
  corroborates a current local sheet product; its listed package weight is product-specific.
- [OQLF's *pâte filo* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8972938/pate-filo)
  supports the filo/phyllo name variants. [Metro's frozen phyllo listing](https://www.metro.ca/en/online-grocery/aisles/frozen/bakery/pie-shells-dough/frozen-phyllo-pastry/p/059749896290)
  corroborates a distinct thin-sheet product; no sheet measure is generalized.
- [Produits de Pâtisserie Orientale](https://www.myphyllo.com/fr/food-service-products)
  lists kataifi separately from phyllo and from other kataifi presentations. The [Québec Tasty / PLMA
  supplier brochure](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/relations-internationales/Representations/Chicago/publications/en/BR-brochure-participants-PLMA-2024.pdf)
  describes kataifi (knafi) as shredded dough and phyllo as thin sheets.
- [OQLF's *pâte brisée* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898104/pate-brisee)
  supports *shortcrust pastry* and distinguishes it by preparation from feuilletage. OQLF's
  [*pâte sablée* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037277/pate-sablee)
  supports keeping shortbread dough separate.
- [OQLF's *pâte à pizza* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544314/pate-a-pizza)
  supports the bilingual identity name. [Metro's 700 g fresh pizza-dough listing](https://www.metro.ca/en/online-grocery/aisles/bread-bakery-products/tortillas-flat-breads/pizza-dough-bases/original-pizza-dough/p/059749877749)
  corroborates a bought product; its package is not a general yield or measure.

## Package and verification

The package contains 989 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,267 records, 4,016 source entries, and 3,285 distinct source
IDs. Ingredient-reference normalization passed and bundled seed-package validation reported the
package valid. No tests or emulator deployment were run, following the current `AGENTS.md` rule for
changes that only add database JSON data.
