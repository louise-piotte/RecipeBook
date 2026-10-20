# WP05 Montreal steak spice identity integration

## Decision

Added identity-only `Montreal steak spice / épices à steak de Montréal`, with English alias `Montreal
steak seasoning` and French alias `épices à steak Montréal`. Current Québec retailer listings pair the
English and French names for a Firebarns product; a Metro recipe supports the fuller French wording.
A separate Club House product listing supports the English variant and shows a different blend formula.

OQLF’s `épices pour bifteck` entry distinguishes a plain spice mixture from a seasoning containing
salt, vegetables, or other ingredients, so it is not used as an alias. Keep this identity separate
from seasoning salt, plain salt, generic rubs, sauces, marinades, and other steak blends. No recipe
line matched. Added no form, density, unit mapping, package yield, conversion, or substitution.

Sources: [identity review](../../proposals/wp05-montreal-steak-spice-identity-review-20261011.md),
[Metro Firebarns EN](https://www.metro.ca/en/online-grocery/aisles/pantry/herbs-spices-sauces/spices/montreal-steak-spice/p/628176089362),
[Metro Firebarns FR](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/epices/epices-a-steak-montreal/p/628176089362),
[OQLF terminology](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299097/epices-pour-bifteck).

## Files and verification

Updated the reference JSON, generated Kotlin search index, research ledger, global plan, and roadmap. The
package has 1,036 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,328
records / 4,346 source entries / 3,579 distinct source IDs.

Package normalization and validation, reference normalization, generated-index freshness, research-ledger
schema validation, exact collision and recipe-demand checks, UTF-8/no-BOM, whitespace, and scoped
`git diff --check` passed. No tests or emulator were needed for the database JSON addition.
