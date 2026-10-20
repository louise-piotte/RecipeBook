# WP03 Section I chopped pistachio form review — 2026-10-12

## Decision

Accept `chopped pistachios / pistaches hachées` as a recipe-named form under the existing
`ingredient-ref-pistachios` identity and link only optional recipe row `056#29`. Preserve the
source wording and its missing amount. The exact cut remains recipe-specific; do not add a measure,
density, conversion, yield, or substitution.

This form is separate from the generic `crushed nuts / noix concassées` garnish and does not resolve
the distinct `finely ground pistachios` wording in recipe `017#1`. The latter remains held under the
[ground-form boundary review](wp03-section-i-ground-pistachio-form-boundary-review-20261012.md).

## Exact recipe demand

Recipe `056`, [Pistachio Chocolate Mousse Cake](../../../app/src/main/assets/seed/bundled-library/recipes/056-gateau-mousse-a-la-pistache-et-au-chocolat-pistachio-chocolate-mousse-cake-04dff954-4213-492a-9194-4bed8553d145.v1.json), has this source-derived optional decoration row:

| Row | Existing identity | Source wording | Amount state |
|---|---|---|---|
| `056#29` | `ingredient-ref-pistachios` | `Chopped pistachios, for decoration` / `pistaches hachées` in the bilingual decorating instruction | Missing; optional |

The closing instructions say to decorate the cake with chopped pistachios in English and *pistaches
hachées* in French. This is an explicit named state but does not establish a particle-size
threshold. The recipe source URL is [Where Is Cake — Pistachio Chocolate Mousse Cake](https://whereiscake.com/recipe/pistachio-chocolate-mousse-cake/); the publisher page was inaccessible to the browser during this review, so the saved bilingual bundle wording is the directly inspected evidence.

## Québec French wording

The OQLF's [*hacher* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491547/hacher) defines the culinary verb as reducing food to small pieces and gives English *chop*. This supports `pistaches hachées` for the source's `chopped pistachios`; it does not set a pistachio-specific cut size.

## Boundaries

- Link the form only to `056#29`; keep its `optional: true` state, notes, and lack of quantity unchanged.
- Do not link the ground/crumb preparation in `017#1` to this form. The publisher comparison and unresolved crumb-versus-ground wording are recorded in the separate ground-form review.
- Do not generalize particle size, measurements, density, unit mappings, conversions, yields, or substitutions.
- Keep pistachio paste and pistachio butter as separate ingredient identities.

## Ledger

The new `ingredient-form-pistachios-chopped` ledger record contains two source entries:

| Source ID | Source and scope |
|---|---|
| `WP03-I-PISTACHIO-CHOPPED-FORM-20261012-S01` | Where Is Cake recipe page and saved bilingual recipe row/instruction; supports only the named decoration state in `056#29`. |
| `WP03-I-PISTACHIO-CHOPPED-FORM-20261012-S02` | OQLF *hacher*; supports the French wording and English correspondence, not a size threshold. |

Measurement and substitution research remain `not_yet_researched`. No measurement observation or
numeric behavior was added.
