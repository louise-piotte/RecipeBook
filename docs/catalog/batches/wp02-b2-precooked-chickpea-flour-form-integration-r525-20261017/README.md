# WP02 B2 R525 integration — precooked chickpea flour

- **Date:** 2026-10-17
- **Decision:** Add `precooked chickpea flour / farine de pois chiche précuite` as a processing form under the existing `ingredient-ref-chickpea-flour` identity.
- **Catalog delta:** Added one form. Kept the descriptive Québec French display provisional, both match-term arrays empty, and `densityGPerMl` null. Added no reference, alias, unit mapping, recipe link, conversion, yield, or substitution.
- **Research ledger:** Added the form record with verified identity and seven source entries. Retained the reported `0.70 ± 0.00 g/mL` bulk density only as a Naturelka sample-specific laboratory observation; it is not assigned as active density for Simpson Seeds or for precooked chickpea flour generally. No product-matched household measure or general substitution was supported.
- **Recipe demand:** The manifest-ordered scan covered 114 recipes and 1,123 ingredient rows and found no matching phrase or direct link to generic chickpea flour, Desi chickpea flour, or chana sattu.

Simpson Seeds lists raw and precooked chickpea flour as separate product formats. A French-language supplier distinguishes `farine de pois chiche précuite` from `farine de pois chiche prégélatinisée`; the French form label remains descriptive and provisional for Québec. Keep this form distinct from raw flour, roasted chana sattu, and pregelatinized chickpea flour. Do not add `instant flour`, hyphenated `pre-cooked`, or plural French wording as aliases.

## Snapshot

| Artifact | Post-integration count |
|---|---:|
| Ingredient references | 1,797 |
| Ingredient forms | 144 |
| Legacy candidates | 56 |
| Research ledger records | 2,154 |
| Research ledger source entries | 9,900 |
| Distinct source IDs | 8,378 |
| Distinct source URLs | 7,086 |

See the [R525 proposal](../../proposals/wp02-b2-next-flour-starch-gap-review-r525-20261017.md) for source limits, ownership review, picker projection, and the full corpus fingerprint.

## Validation and status

Static seed-package normalization and validation, generated-index freshness, ledger schema and source linkage, exact form ownership, bilingual picker projection, UTF-8/no-BOM with escaped seed-package Unicode, local links, and scoped whitespace checks passed. No app tests, build, emulator run, or deployment was needed because this change only adds database JSON data under `AGENTS.md`.

Broader WP02 B2/B3 flour and starch review remains open.
