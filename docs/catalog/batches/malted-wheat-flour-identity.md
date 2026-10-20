# WP02 Section A7 Malted Wheat Flour Identity

## Packet record

- **Owner:** integration owner (WP10)
- **Research packet:** WP02 baking catalog; identity and naming only
- **Research date:** 2026-10-06
- **Reviewers:** independent Québec French reviewer — pending
- **Status:** identity integrated; package, tests, and runtime verification passed; independent Québec French review pending
- **Canonical ID:** `ingredient-ref-malted-wheat-flour`
- **Category:** `FLOUR_AND_STARCH`

## Accepted identity

| Field | Value |
| --- | --- |
| English display | `malted wheat flour` |
| Québec French display | `farine de blé maltée` |
| English aliases | none |
| French aliases | none |
| Density / unit mappings | none |
| Forms / conversion rules | none |
| Substitutions | none |
| Measurement state | `not_yet_researched` |
| Substitution research state | `not_yet_researched` |

CFIA lists malted wheat flour separately from malted barley flour as a flour ingredient [WP02-S114].
Government of Canada terminology pairs `malted wheat flour` with `farine de blé maltée`
[WP02-S115]. A milling-product catalogue describes the flour as made by germinating, drying, and
milling wheat [WP02-S116], while a Canadian ingredient listing names malted wheat flour separately
from malted barley flour in both English and French [WP02-S117].

Use `FLOUR_AND_STARCH` for this milled wheat-flour product. Keep it distinct from general and
whole-wheat flour, malted barley flour, and vital wheat gluten. No aliases, density, measurement,
conversion, yield, safety, or substitution claim is inferred.

## Catalog and recipe audit

Before integration, the canonical reference catalog had no exact normalized identity or alias for
`malted wheat flour`, `farine de blé maltée`, or its unaccented spelling. All 114 bundled recipe JSON
files were searched with accent-folded matching; no ingredient text matched and no recipe line was
relinked.

## Sources

- [WP02-S114 — CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0): Volume 12, section 12.1.1 lists malted wheat flour separately from malted barley flour; no numeric limits are imported.
- [WP02-S115 — TERMIUM Plus, Government of Canada](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=esw&lang=eng&srchtxt=TRIGO): bilingual terminology entry pairs `malted wheat flour` with `farine de blé maltée`.
- [WP02-S116 — Molino Bongiovanni, catalogue de produits maltés](https://www.molinobongiovanni.com/files/ProductsCatalogVer1-FR.pdf): French product name and description of flour made by germinating, drying, and milling wheat.
- [WP02-S117 — Whole-Grains, Canadian product list](https://whole-grains.ca/): bilingual ingredient lists name malted wheat and barley flours separately in products containing both cereal ingredients.

## Acceptance checks

| Check | State |
| --- | --- |
| Name, category, and separation decisions recorded in the research ledger | Pass: see `ingredient-ref-malted-wheat-flour` and sources WP02-S114–S117. |
| Canonical reference has no unsupported numeric, form, conversion, yield, or substitution data | Pass: identity-only row. |
| Recipe audit across all 114 bundled recipes | Pass: no matches; no recipe edits. |
| Package normalization, package tests, generated index, and Android unit tests | Pass: package valid, generated index current at 331 references, 9 Python tests and 234 Android unit tests passed. |
| Pixel 9a / Android 16 English and fr-CA picker searches | Pass: English `malted wheat flour` and accent-folded French `farine de ble maltee` each returned the intended row; blank draft discarded and 114-recipe French home restored. |
| Escaped Unicode/no-BOM audit, `git diff --check`, and live screenshot evidence | Pass: all 125 bundled JSON files use escaped Unicode and have no BOM; diff check passed. |
| Independent Québec French review | Pending. |

The wider A7 review remains open for other grain meals, other malted and toasted flours, gluten-flour
terminology, measurements, substitutions, and independent bilingual review.


## Verification evidence

- Seed reference JSON: 331 rows, SHA-256 `50e01d83117d276235c5980a26e33ea626af17128a0052a0e9d29ffb5b20fcf8`.
- Evidence ledger: 485 records, SHA-256 `957c06b0f93d0eaad859d9253b5963c226444f4b783f0978a5f7d3b01e7c5209`.
- Pixel 9a / Android 16 API 36 at 1080×2424: English and French picker results were visually checked; blank drafts were discarded and the French home remained at 114 recipes.
- Screenshots: [English picker](pixel9a-malted-wheat-flour-picker-en.png), [fr-CA picker](pixel9a-malted-wheat-flour-picker-fr-ca.png), [English home](pixel9a-malted-wheat-flour-home-en-114.png), [fr-CA home](pixel9a-malted-wheat-flour-home-fr-ca-114.png).
