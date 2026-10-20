# WP03 Section H soybean and edamame identity integration — 2026-10-11

## Scope

This batch adds separate, identity-only references for soybeans and immature green edamame. Québec
terminology and current local product listings support the names. No bundled recipe ingredient line
matched either identity, so no recipe links were added.

## Integrated references

| ID | English / fr-CA display | Accepted aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-soybeans` | `soybeans / fèves de soya` | EN: `soya bean`, `soya beans`, `soybean`; fr-CA: `fèves de soja` | Keep soy flour, sprouts, sauces, and fermented products separate. OQLF's entry spans pod and contained seed, so this batch does not distinguish those presentations. |
| `ingredient-ref-edamame` | `edamame / fèves de soya vertes` | EN: `edamame bean`, `green vegetable soybean`, `vegetable soybean`; fr-CA: `fève de soya verte`, `fève edamame`, `édamames` | Keep the immature green soybean distinct from the general soybean identity. Fresh/frozen, in-pod/shelled, and cooked states remain unmodeled. |

Both references use `LEGUME_AND_PULSE`. They have no forms, densities, unit mappings, recipe links,
package yields, conversions, or substitutions. Retail labels mentioning frozen or shelled edamame
were used only as identity evidence; those states were not generalized.

## Evidence

- [OQLF, *fève de soya*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18954613/feve-de-soya)
  supports the Québec soybean term and the English equivalents *soya bean* and *soybean*. The entry
  covers both the pod and its seeds, which is why neither is modeled as a form here. [Ecolocal's raw
  soybean listing](https://ecolocal.csur.ca/F%C3%A8ves-de-soya-crues) corroborates local dried-bean
  product wording without establishing universal cooking states or measures.
- [OQLF, *fève de soya verte*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532560/feve-de-soya-verte)
  defines the green soybean as immature and supports *édamame* and English *edamame*. The singular
  *fève de soya verte* is included as an alias alongside the plural display.
- Québec retail listings corroborate use of *édamames* and *fèves de soya vertes* at
  [Loblaws](https://www.loblaws.ca/fr/search?search-bar=edamame), *fèves edamame écossées* at
  [Mayrand](https://mayrand.ca/fr/nos-produits/surgele/legumes-surgeles/legumes-surgeles/feves-edamame-ecossees-iqf-13844),
  and *edamames en cosse* at
  [Super C](https://prod-ereceipt.superc.ca/allees/produits-surgeles/fruits-et-legumes/melanges-et-edamames/edamames-en-cosse-surgeles/p/059749993821).
  These listings show distinct market presentations but do not justify adding freshness, freezing,
  shelling, or cooking forms.

## Remaining work

- Dried whole peas and fresh shell beans remain open identity questions.
- Whole/split and hulled/unhulled distinctions, cooking and canning states, and bean cooking liquids
  remain open form questions under Section H.

## Package and verification

The package contains 991 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,269 records, 4,022 source entries, and 3,291 distinct source
IDs. Ingredient-reference normalization passed and bundled seed-package validation reported the
package valid. No tests or emulator deployment were run, following the current `AGENTS.md` rule for
changes that only add database JSON data.
