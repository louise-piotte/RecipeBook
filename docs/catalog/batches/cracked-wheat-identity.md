# WP02 Section A7 Cracked Wheat Identity

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate cracked wheat as a grain/cereal identity distinct from processed bulgur and from the separately standardized crushed/coarse-ground wheat product. No measurement or substitution data is established.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-cracked-wheat` | cracked wheat / blé concassé | None | `GRAIN_AND_CEREAL`; cracked/cut wheat kernels. Keep distinct from bulgur/boulgour, which OQLF defines as sprouted, precooked, and dried wheat that is then cracked, and from crushed/coarse-ground wheat under the Canadian standard. [S101–S104] |

The existing `ingredient-ref-bulgur` remains unchanged and retains only `bulgur / boulgour` as
display names. The mixed marketplace use of “cracked wheat” and bulgur does not create an alias:
their processing differs, so catalog search keeps the identities separate. The new row has null
density and empty unit mappings; no aliases, forms, conversions, observations, package values, or
substitutions were added.

## Source register

- **S101 — CFIA, Canadian Food Compositional Standards:** [Volume 12, standard 12.1.7](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0).
  Defines cracked wheat and separately defines crushed/coarse-ground wheat. Sieve, ash, and moisture
  criteria are not imported into the catalog.
- **S102 — CFIA, cereals and bakery products (French):** [Official French guidance](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie).
  Uses `blé concassé` in official French cereal guidance; used for naming only.
- **S103 — Arva Flour Mills, Blé concassé 700 g:** [Ontario mill product page](https://arvaflourmills.com/fr/products/cracked-wheat).
  Uses `blé concassé` and describes crushed whole raw wheat kernels. Product-specific claims are not
  generalized.
- **S104 — OQLF, boulgour:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour).
  Defines bulgur/boulgour as sprouted wheat that is precooked, dried, and cracked; supports the
  processing boundary from raw cracked wheat.

These sources are attached to `ingredient-ref-cracked-wheat` in
`docs/catalog/research-ledger.v1.json` as `WP02-S101` through `WP02-S104`.

## Recipe and integration audit

All 114 bundled recipe JSON files were parsed and checked for `cracked wheat`, `blé concassé`,
accent-folded `ble concasse`, and bulgur/boulgour. No match was found, so no recipe line was
relinked. The audited recipe snapshot fingerprint is
`558a9ca9b1334e8039709aa2954b7a3a5451513ba55c5fa873189fe8cf6df282` (sorted filename, NUL, file
bytes, NUL).

The integrated canonical package has 327 references (SHA-256
`d461db849c417fa3ca449d22959ef3e1b9034a58dfbb676f23f0077d1b5d7606`). The research ledger has 481
records (SHA-256 `8fe524536046a05e6dd9de4734dc8e9731905a347d2c6c76589018a57c110a2b`).

## Verification

- All 230 Android unit tests and all 9 Python seed-package tests passed. Bundled-package validation,
  generated-index freshness, ledger schema and alias-collision validation, UTF-8/no-BOM and escaped
  Unicode audit across 125 bundled JSON files, and `git diff --check` passed.
- `tools/deploy_to_pixel9a_emulator.sh` passed its Gradle `test` and debug-assembly steps and
  installed/launched `MainActivity` on Android 16 / API 36 at 1080×2424.
- The English picker returned one result for `cracked wheat`. In French, the accent-folded query
  `ble concasse` returned one result with the displayed label `blé concassé`. The unsaved draft was
  discarded; the French home still showed 114 recipes.
- Screenshots: [English picker](pixel9a-cracked-wheat-picker-en.png),
  [French picker](pixel9a-cracked-wheat-picker-fr-ca.png), and
  [French home with 114 recipes](pixel9a-cracked-wheat-home-fr-ca.png).

## Remaining work

- Keep the broader A7 review open for other grain meals, wheat starch, malted flour, vital wheat
  gluten, and toasted flour.
- Obtain independent bilingual Québec French review of `blé concassé` and the separate bulgur
  boundary.
- Research measurement and substitution evidence separately; these identity sources do not support
  numeric values or equivalence claims.
