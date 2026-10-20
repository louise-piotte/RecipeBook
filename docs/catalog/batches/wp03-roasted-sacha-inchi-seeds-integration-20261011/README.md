# WP03 Section I roasted sacha inchi seed identity — 2026-10-11

## Scope

This batch adds a narrow identity for the explicitly roasted sacha inchi seed product. It does not
add a raw-seed identity or imply a safe home-roasting procedure. No bundled recipe line uses this
ingredient, so no recipe link was added.

## Integrated reference

| ID | English / fr-CA display | Aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-roasted-sacha-inchi-seeds` | `roasted sacha inchi seeds / graines de sacha inchi grillées` | None | Prepared roasted product only; raw or unprocessed seed is out of scope. |

The reference uses `NUT_SEED_AND_DRIED_FRUIT`, has no forms, density, unit mappings, package yields,
recipe links, conversions, or substitutions. The French display is a descriptive borrowed-name
label supported by a French product listing, not an OQLF or TERMIUM ruling.

## Processing and safety boundary

EFSA's 2026 opinion concerns seeds that are shelled or peeled, washed in hot water, and roasted under
the proposed conditions, with roasting up to 120 °C. Its safety conclusion applies to that product
and those conditions. It is not a Canadian authorization and does not establish a general home
processing procedure. A 2018 study reports roasting-related changes in tested samples but likewise
does not establish universal home-processing guidance.

Health Canada's non-novel determinations list entries for sacha inchi fruit and seed protein, not a
blanket whole-seed determination. That list alone does not decide the status of every roasted-seed
product. The identity therefore stays explicitly product-scoped and makes no regulatory claim.

## Measurements and substitutions

No supported kitchen measure or density was found. A Canadian 200 g retail package is net mass, not
a volume conversion. A secondary substitution page suggests roasted pumpkin seeds or peanuts for
snack/topping use, but supplies no tested recipe context or ratio; neither candidate was accepted as
a substitution rule. No allergen or nutrition equivalence is implied.

## Evidence

- [EFSA, *Safety of roasted seeds from Plukenetia volubilis L. as a traditional food from a third country*](https://efsa.onlinelibrary.wiley.com/doi/10.2903/j.efsa.2026.10256), sections 3.3 and 5. Supports only the proposed washed-and-roasted product and conditions.
- [2018 roasting study](https://pmc.ncbi.nlm.nih.gov/articles/PMC6133840/). Reports effects in tested samples; not a universal preparation procedure.
- [Walmart Canada product listing](https://www.walmart.ca/en/ip/Organic-Sacha-Inchi-Seeds-200g/797PR692GHK0). Corroborates a Canadian roasted, unsalted product; package mass is not a kitchen measure.
- [Sacha Inchi Laos, *Graines de Sacha Inchi grillées salées*](https://sachainchilaos.com/produit/sacha-inchi-salted-roasted-seeds/). Supports descriptive French roasted-product wording; the salted variant is not encoded in the catalog name.
- [Health Canada, List of non-novel determinations](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html). The listed fruit and seed-protein determinations do not establish a general whole-seed status.
- [Ingredient Substitutes, sacha inchi oil substitutes](https://www.ingredientsubstitutes.com/sacha-inchi-oil-substitute). A weak secondary source retained only to document rejected pumpkin-seed and peanut candidates.

## Package and verification

The package contains 993 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,272 records, 4,033 source entries, and 3,302 distinct source
IDs. Ingredient-reference normalization and bundled seed-package validation passed. No tests or
emulator deployment were run because this batch only adds database JSON data, as allowed by
`AGENTS.md`.
