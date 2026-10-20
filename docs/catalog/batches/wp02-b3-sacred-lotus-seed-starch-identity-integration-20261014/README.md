# WP02 Section 04 B3 — sacred lotus seed starch integration

Reviewed and integrated 2026-10-14. The broader Section 04 B3 starch review remains open.

## Decision

Added identity-only **sacred lotus seed starch (Nelumbo nucifera) / amidon de graines de lotus sacré
(Nelumbo nucifera)** for the separately isolated starch fraction from sacred lotus seeds. It remains
distinct from whole sacred lotus seeds, whole-seed flour, and extracted lotus-rhizome starch. The
French display is descriptive and provisional; no Québec seed-starch product label or OQLF headword
was found.

Both alias arrays are empty. No forms, measurements, conversions, recipe links, yields, or
substitutions were added. The 114-recipe / 1,123-ingredient-row corpus has no matching demand. The
seed-starch studies provide lab extraction and characterization, not culinary exchange ratios,
household measures, or reusable density.

## Integration and static review

- Added `ingredient-ref-lotus-seed-starch` and one accepted research-ledger record with seven
  sources and empty observation/substitution arrays.
- Updated the Section 04 B3 checklist, roadmap, reviewed proposal, and generated catalog.
- After this and the same-batch cereal integration: 1,438 references, 105 forms, and 1,778 ledger
  records.
- Package normalization/validation, reference normalization, ledger-schema validation,
  generated-index freshness, source ownership, picker projection, recipe scan, encoding, local
  links, and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the change only adds database
  JSON data and its generated catalog index.

See the detailed [review proposal](../../proposals/wp02-next-specialty-flour-starch-gap-review-r101-20261014.md).

## Sources

- Kew's [Plants of the World Online entry](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605422-1)
  accepts *Nelumbo nucifera*. The Muséum national d’Histoire naturelle's [Lotus sacré page](https://www.mnhn.fr/fr/lotus-sacre)
  pairs that species with the French name and describes its seeds as edible.
- OQLF's [amidon entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon)
  supports `amidon` as the preferred general term for starch. Its [racine de lotus entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434863/racine-de-lotus)
  names the edible rhizome vegetable and does not cover seed starch.
- Ito et al.'s primary [1996 study](https://www.jstage.jst.go.jp/article/jag1994/43/1/43_1_7/_article)
  prepares starch from the *N. nucifera* seed embryo and compares it with lotus-root starch.
  Chandak et al.'s [2025 comparison](https://doi.org/10.1002/star.202400067) treats seed starch and
  rhizome starch as separate isolated samples. A 2024 [seed-starch modification study](https://doi.org/10.1016/j.ijbiomac.2024.135032)
  likewise starts from native seed starch; its lab treatments are not catalog forms.
