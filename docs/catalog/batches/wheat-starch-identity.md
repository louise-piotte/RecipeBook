# WP02 Section A7 Wheat Starch Identity

## Packet record

- **Owner:** integration owner (WP10)
- **Research packet:** WP02 baking catalog; identity and naming only
- **Research date:** 2026-10-06
- **Reviewers:** independent Québec French reviewer — pending
- **Status:** identity integrated and verified; independent Québec French review pending
- **Canonical ID:** `ingredient-ref-wheat-starch`
- **Category:** `FLOUR_AND_STARCH`

## Accepted identity

| Field | Value |
| --- | --- |
| English display | `wheat starch` |
| Québec French display | `amidon de blé` |
| French search alias | `amidon de froment` |
| English aliases | none |
| Density / unit mappings | none |
| Forms / conversion rules | none |
| Substitutions | none |
| Measurement state | `not_yet_researched` |
| Substitution research state | `not_yet_researched` |

OQLF defines wheat starch as starch from species of *Triticum* and lists `amidon de blé` and
`amidon de froment` as preferred French terms [WP02-S108]. The `amidon de blé` form is the display;
the other OQLF term is retained as an alias. CFIA's bread standard lists wheat starch separately
from wheat flour, wheat meal, and gluten flour as a possible grain ingredient [WP02-S109].

Keep this identity separate from whole-wheat and all-purpose flour, corn starch, and vital wheat
gluten. No conversion, density, yield, form, measurement, safety, or substitution claim is inferred.

## Catalog and recipe audit

Before integration, the canonical reference catalog had no exact normalized identity or alias for
`wheat starch`, `amidon de blé`, or `amidon de froment`. All 114 bundled recipe JSON files were
searched with word-boundary matching for these terms, accent-folded; no ingredient text matched and
no recipe line was relinked.

## Sources

- [WP02-S108 — OQLF, amidon de froment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432751/amidon-de-froment): Québec definition and preferred French terms `amidon de froment` and `amidon de blé`, paired with English `wheat starch`.
- [WP02-S109 — CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0): section 12.2.1 lists wheat starch distinctly as a possible bread ingredient; limits and amounts are not imported.

## Acceptance checks

| Check | State |
| --- | --- |
| Name, alias, category, and separation decisions recorded in the research ledger | Pass: see `ingredient-ref-wheat-starch` and sources WP02-S108–S109. |
| Canonical reference has no unsupported numeric, form, conversion, yield, or substitution data | Pass: identity-only row. |
| Recipe audit across all 114 bundled recipes | Pass: no matches; no recipe edits. |
| Package normalization, package validation, generated index, and Android unit tests | Pass: normalization, validation, generator freshness, all 9 Python package tests, and all 232 Android unit tests. |
| Unicode and repository checks | Pass: 125 bundled JSON files contain escaped Unicode and no BOM; `git diff --check` passes. |
| Pixel 9a / Android 16 English and fr-CA picker searches | Pass: English `wheat starch`, French `amidon de ble`, and French alias `amidon de froment` each returned the same intended row. |
| Independent Québec French review | Pending. |

The validated package has 329 references (SHA-256
`12e6cf81eb4d6036486bb21054aea560f4233b234b3bb69a65bd57164a397f1b`); the ledger has 483 records
(SHA-256 `ec160a3ff29af6f28defe316ffb495edf3aaed521d751aa5e5eedcdbbc4aa969`). The deployed app
passed `tools/deploy_to_pixel9a_emulator.sh` on Pixel 9a / Android 16 (API 36, 1080×2424). Search
screenshots: `pixel9a-wheat-starch-picker-en.png`, `pixel9a-wheat-starch-picker-fr-ca.png`, and
`pixel9a-wheat-starch-alias-fr-ca.png`. Unsaved QA drafts were discarded; the restored fr-CA home
still shows all 114 recipes in `pixel9a-wheat-starch-home-fr-ca-114.png`.

The wider A7 review remains open for other grain meals, malted flour, toasted flour, gluten-flour
terminology, measurements, substitutions, and independent bilingual review.
