# WP03 split-pea identity integration — 2026-10-11

## Scope

The Section H checklist grouped green and yellow split peas with unresolved whole dried peas,
soybeans, edamame, and fresh shell beans. Québec terminology and product listings support two
color-specific split-pea identities. This batch adds those two identities only.

## Integrated references

| ID | English / fr-CA display | Accepted aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-green-split-peas` | `green split peas / pois verts cassés` | EN: `green split pea`; fr-CA: `pois vert cassé` | Keep separate from fresh green peas and generic dried whole peas. |
| `ingredient-ref-yellow-split-peas` | `yellow split peas / pois jaunes cassés` | EN: `yellow split pea`; fr-CA: `pois jaune cassé` | Keep separate from generic dried whole yellow peas. |

Both references use `LEGUME_AND_PULSE`. The legacy `ingredient-ref-split-peas` candidate remains
unpromoted; the new color-specific identities do not establish a generic split-pea reference. No
forms, density, unit mappings, conversions, package yields, substitutions, or recipe links were
added. Whole/split and hulled/unhulled modeling remains open, as do the other pea and soybean items.

## Evidence

- The [OQLF Grand dictionnaire terminologique entry for *pois cassé*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489155/pois-casse)
  defines a split pea as a dry pea whose two cotyledons are separated and explicitly lists *pois
  jaune cassé* / yellow split pea and *pois vert cassé* / green split pea.
- [Mayrand's Québec rice and grain listings](https://mayrand.ca/fr/nos-produits/epicerie/riz-et-grain)
  list *pois jaunes cassés* and *pois verts cassés* separately, alongside whole yellow peas.
- [Loblaws' French-locale search results](https://www.loblaws.ca/fr/search?search-bar=green+split+peas)
  list separate packaged products named *pois verts cassés* and *pois jaunes cassés*.
- [Artisan Tradition's pulse products](https://www.artisan-tradition.ca/en/legumineuses-pulses)
  list organic green and yellow split peas separately and distinguish whole yellow peas.
- [Diefenbaker Spice & Pulse](https://www.dspdirect.ca/special-crop-products.php) describes green
  and yellow split peas as separate products and lists whole yellow peas separately. No processing
  detail was promoted into catalog forms.

## Package and verification

The package contains 981 ingredient references, 61 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,256 records, 3,985 source entries, and 3,259 distinct source
IDs. Ingredient-reference normalization passed and bundled seed-package validation reported the
package valid. No tests or emulator deployment were run, following the current `AGENTS.md` rule for
changes that only add database JSON data.
