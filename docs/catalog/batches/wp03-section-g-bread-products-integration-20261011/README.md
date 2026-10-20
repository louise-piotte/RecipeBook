# WP03 Section G prepared-bread identity integration — 2026-10-11

## Scope

This batch adds three generic prepared-bread identities supported by Québec terminology or product
listings. The 114-recipe bundle has no purchased roll, sandwich-bread, sourdough-bread, or generic
flatbread ingredient rows, so the new references are identity-only and have no recipe links.

## Integrated references

| ID | English / fr-CA display | Accepted aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-bread-roll` | `bread roll / petit pain` | EN: `bread rolls`; fr-CA: `petits pains` | Do not alias bare `roll`/`bun` or named hamburger, dinner, hot-dog, bao, or filled products. |
| `ingredient-ref-sandwich-bread` | `sandwich bread / pain de mie` | EN: `sandwich loaf`; fr-CA: `pain à sandwich` | Keep sliced presentation terms separate; do not alias `sliced bread` or `pain en tranches`. |
| `ingredient-ref-sourdough-bread` | `sourdough bread / pain au levain` | None | Finished bread remains separate from `sourdough starter / levain naturel`; do not enforce a universal no-added-yeast composition rule. |

All three use `BAKING_MIXIN_AND_PANTRY`. No forms, densities, unit mappings, recipe links,
conversions, package yields, or substitutions were added. The live `brioche bread / pain brioche`,
regional prepared breads, and single sourdough-starter form remain unchanged. Generic flatbread stays
a family term; the named roll subtypes remain open until ingredient demand identifies a type.

## Evidence

- [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=10&i=&index=enb&lang=fra&sg_kp_wet=2033164&srchtxt=BAKING)
  pairs `bread roll` with *petit pain*. The source's size description and approximate weight were not
  used.
- The OQLF entries for [*pain à sandwich*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491481/pain-a-sandwich),
  [*pain de mie*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497992/pain-de-mie),
  and [*pain en tranches*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298433/pain-en-tranches)
  distinguish the sandwich-loaf product from sliced presentation. [Aliments du Québec's pain de mie
  listing](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/le-pain-de-mie)
  corroborates current local product naming.
- The OQLF entry for [*pain au levain*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410395/pain-au-levain)
  gives *sourdough bread* as the English equivalent. [Aliments du Québec's current product listing](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/pain-au-levain)
  corroborates local product wording. Current supplier wording can differ from the OQLF entry's
  narrow no-added-yeast definition, so that composition claim is not encoded.

## Package and verification

The package contains 984 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,262 records, 4,006 source entries, and 3,275 distinct source
IDs. Ingredient-reference normalization passed and bundled seed-package validation reported the
package valid. No tests or emulator deployment were run, following the current `AGENTS.md` rule for
changes that only add database JSON data.
