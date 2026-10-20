# WP03 lentil type integration — 2026-10-11

## Scope

The Section H checklist named brown, green, French green, black/Beluga, red, and yellow lentils.
The bundled library previously had only the broad `lentils / lentilles` reference and a separate
green lentil flour identity. This batch adds four identity-only market classes and leaves two
unclear labels open.

## Integrated references

| ID | English / fr-CA display | Accepted aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-green-lentils` | `green lentils / lentilles vertes` | None | Keep specific Laird, Eston, and other cultivar names out of the generic green row. |
| `ingredient-ref-french-green-lentils` | `French green lentils / lentilles vertes françaises` | fr-CA: `lentilles françaises` | Keep separate from general green lentils and do not alias the protected `Lentille verte du Puy` origin name. |
| `ingredient-ref-red-lentils` | `red lentils / lentilles rouges` | fr-CA: `lentilles corail` | The Canadian grain class is based on cotyledon colour. Whole, split, and decorticated presentations remain unresolved forms. |
| `ingredient-ref-black-beluga-lentils` | `black Beluga lentils / lentilles noires Beluga` | EN: `Beluga lentils`; fr-CA: `lentilles Beluga` | Keep generic `black lentils` out because the sources do not establish that every black lentil is Beluga. |

All four references use `LEGUME_AND_PULSE`. Density, unit mappings, forms, conversions, package
yields, substitutions, and recipe links remain unset. The existing generic lentils identity stays
broad and has no class aliases.

## Open boundaries

- **Brown lentils:** Québec retailers list brown lentils separately from red lentils, but a Canadian
  processor also uses `brown lentil` for whole red lentils. Keep the broad brown label open until a
  stable class boundary is supported.
- **Yellow lentils:** Canadian research recognizes yellow lentils, and a retailer ingredient list
  names them in a blend. Other supplier wording describes split yellow lentils as dehulled/split
  green lentils. The available sources do not establish one standalone Québec product class and
  French label, so no yellow row or alias was added.
- **Processing:** The generic whole/split/dehulled checklist remains open. The red-lentil class does
  not imply one processing state; no recipe lines were linked.

## Evidence

- The [Canadian Grain Commission](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/18-lentils/classes-types-varieties.html)
  defines red versus other lentils by cotyledon colour and describes seed-coat colours/types. It
  provides a grading boundary, not kitchen measures or consumer aliases.
- [Canadian Food Focus](https://canadianfoodfocus.org/courses/learn-to-cook-with-lentils/lessons/lentils-in-the-grocery-store/topic/lentil-options/)
  names French green and black Beluga lentils in the Canadian grocery market and explains that red
  lentils may be whole or split after removal of the seed coat.
- The [INAO product page](https://www.inao.gouv.fr/en/node/4840) marks `Lentille verte du Puy` as an
  AOP product tied to a defined area. It supports keeping Puy wording out of the broader French
  green class.
- [Mayrand](https://mayrand.ca/fr/nos-produits/epicerie/riz-et-grain/lentille), [Délices de la forêt
  Valli](https://delicesdelaforet.com/categorie-produit/legumineuses/lentilles-en-vrac-940/), and
  [La Moisson](https://lamoisson.com/collections/legumineuse-legumes) provide Québec product wording
  for green, red, French green, black Beluga, and brown lentils.
- The [La Recette5 bulk list](https://www.epicerielarecette.com/assets/site/img/presse/LISTE%20PRODUITS%20VRAC%20%20%202025-04-15.pdf)
  uses `lentilles rouges (corail)` and `lentilles noires Béluga` for branded products. The spelling
  `Beluga` follows the active Québec product listings.
- [Diefenbaker Spice & Pulse](https://www.dspdirect.ca/special-crop-products.php) describes whole red
  lentils as also known as brown lentils and split yellow lentils as made from green lentils after
  dehulling and splitting. This conflicting supplier usage is retained as a boundary finding, not
  promoted into a catalog alias.
- [Metro](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/rice/rice-and-lentil-mix/p/813515020025)
  lists yellow lentils as one ingredient in a blend, without a standalone product definition.
- [USDA ARS](https://www.ars.usda.gov/research/publications/publication/?seqNo115=435761) identifies
  six study varieties: red, yellow, green, brown, French green, and black. Its sample terminology
  does not settle local product boundaries or Québec French naming.

## Package and verification

The package now contains 979 ingredient references, 61 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,254 records, 3,975 source entries, and 3,254 distinct source
IDs. No forms, recipe files, or numeric behavior changed. The ingredient-reference normalizer
completed, and bundled seed-package normalization/validation reported the package valid with no
additional parts to rewrite. No tests were run, following the current `AGENTS.md` rule for
database-JSON data additions. No emulator deployment or picker QA was needed for this data-only
catalog update.
