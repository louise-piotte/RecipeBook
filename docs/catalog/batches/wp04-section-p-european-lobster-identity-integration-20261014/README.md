# WP04 Section P — European lobster identity integration

Reviewed and integrated 2026-10-14. The broader Section P seafood sweep remains open.

## Decision

Added identity-only **European lobster / homard européen** for *Homarus gammarus*, separate from
the existing **American lobster / homard d’Amérique** identity. The OQLF supports the qualified
bilingual name and edible-crustacean scope. A Nova Scotia distributor names the same species on a
live wholesale product. CFIA's aquatic-health list distinguishes the two taxa; its separate Fish
List currently assigns unqualified `Lobster / Homard` to *H. americanus* and does not list
*H. gammarus*. The catalog display is species-qualified and is not presented as an approved CFIA
package label.

The new row has no aliases. Broad `lobster` and `homard` searches now return both species through
their qualified display names; the unqualified aliases remain on the American-lobster row. No forms,
measures, density, mappings, conversions, yields, recipe links, or substitutions were added. The
distributor's dated 30 lb case is a wholesale package observation only. The 114-recipe / 1,123-row
corpus has no lobster or homard demand.

## Integration and validation

- Added `ingredient-ref-european-lobster` and one accepted research-ledger record with five source
  records.
- Updated the Section P checklist, roadmap, and reviewed proposal; refreshed the generated
  ingredient catalog.
- Current counts: 1,434 references, 105 forms, 1,774 ledger records, 63 legacy candidates, 114
  recipes, and 1,123 ingredient rows.
- Seed-package and reference normalization, ledger-schema validation, generated-index freshness,
  source ownership, picker projection, recipe scan, encoding, local links, and scoped whitespace
  checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the change only adds database
  JSON data and its generated catalog index.

See the detailed [review proposal](../../proposals/wp04-section-p-next-unreviewed-seafood-review-20261014.md).

## Sources

- OQLF's [homard européen entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358906/homard-europeen)
  pairs the French and English qualified names with *Homarus gammarus* in the edible-crustacean
  domain.
- CFIA's [aquatic-animal species list](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species)
  distinguishes *H. gammarus* from *H. americanus* and explains that it does not replace the Fish
  List for food labeling. CFIA's [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list)
  assigns the unqualified pair to *H. americanus*. Its [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names)
  describes the list's role for Canadian fish labels.
- World Link Food Distributors' [European lobster page](https://atlanticlobster.ca/product/european-lobster/)
  identifies a dated Nova Scotia wholesale product as *H. gammarus* and lists a 30 lb box. That
  package is not treated as a reusable kitchen measure.
