# WP03 Section H dried whole peas and shell-bean boundary — 2026-10-11

## Scope

This batch adds an identity-only, color-unspecified dried whole pea reference and records why the
broader phrase “fresh shell beans” does not map to one global ingredient. No bundled recipe line uses
dried whole peas or fresh shell beans, so no recipe links were added.

## Integrated reference

| ID | English / fr-CA display | Accepted aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-dried-whole-peas` | `dried whole peas / pois secs entiers` | None | Keep color unspecified and do not merge with fresh green peas or green/yellow split peas. Do not infer the existing dried-yellow-pea line's whole/split state. |

The English and French displays are descriptive product labels: OQLF prefers *dried pea / pois sec*
and says dried peas are marketed whole or split. The whole qualifier identifies this product
presentation; it is not an alias for generic peas or a color-specific dry pea. The reference uses
`LEGUME_AND_PULSE` and has no forms, density, unit mappings, recipe links, package yields,
conversions, or substitutions.

## Fresh shell beans boundary

No global `fresh shell beans / haricots à écosser` reference was added. The category spans multiple
species and can refer either to edible young pods or to seeds removed from mature pods. OQLF
describes common-bean pods eaten whole before maturity, while the same *haricot* term also names the
seeds; Québec colloquial *fève* usage is broad. OQLF's *gourgane / broad bean* is a species-specific
*Vicia faba* identity. CFIA's fresh-produce classifications list peas, cowpeas, Lima beans, wax
beans, green beans, and fababeans as separate products. Keep future entries species- and
product-specific, with the edible part or harvest stage supplied by the recipe or product evidence.

## Evidence

- [OQLF, *pois sec*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296896/pois-sec)
  defines the mature, dehydrated pea seed and says dried peas are sold whole or split. It supports
  the dry product boundary, not a color, recipe measure, or conversion.
- [Codex Alimentarius, CXS 171-1989](https://www.fao.org/input/download/standards/56/CXS_171e.pdf)
  covers whole, shelled, or split dry pulses and includes peas of *Pisum sativum*. Its presentation
  definitions support distinguishing whole from split; they do not supply kitchen measures or
  conversions.
- [OQLF, *haricot*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296925/haricot)
  describes the common-bean pod as eaten whole while immature and notes that *haricot* can also
  name the contained seeds. Its Québec note describes *fève* usage as variable.
- [OQLF, *gourgane*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351051/gourgane)
  identifies the Québec broad bean as *Vicia faba* and says its seeds are extracted from pods; this
  is species-specific evidence, not a generic shell-bean name.
- [CFIA's fresh-produce OGD classifications](https://inspection.canada.ca/en/food-labels/organic-products/import-requirements/organic-ogd-codes-seeds-amp-grains)
  lists green peas, cowpeas, Lima beans, wax beans, green beans, and fababeans separately. The
  product classifications support keeping a broad shell-bean bucket unallocated.

## Remaining work

- Whole/split and hulled/unhulled distinctions remain open where a specific recipe or product
  requires them.
- Dry, soaked, cooked, canned, puréed/refried, fermented, and cooking-liquid entries remain open
  under Section H.

## Package and verification

The package contains 992 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,271 records, 4,027 source entries, and 3,296 distinct source
IDs. Ingredient-reference normalization passed and bundled seed-package validation reported the
package valid. No tests or emulator deployment were run, following the current `AGENTS.md` rule for
changes that only add database JSON data.
