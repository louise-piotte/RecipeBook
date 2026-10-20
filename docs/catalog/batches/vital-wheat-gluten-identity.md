# WP02 Section A7 Vital Wheat Gluten Identity

## Packet record

- **Owner:** integration owner (WP10)
- **Research packet:** WP02 baking catalog; identity and naming only
- **Research date:** 2026-10-06
- **Reviewers:** independent Québec French reviewer — pending
- **Status:** identity integrated and runtime verified; independent bilingual review pending
- **Canonical ID:** `ingredient-ref-vital-wheat-gluten`
- **Category:** `GRAIN_AND_CEREAL`; OQLF places the term under processed cereal foods

## Accepted identity

| Field | Value |
| --- | --- |
| English display | `vital wheat gluten` |
| Québec French display | `gluten de froment élastique` |
| French search alias | `gluten de blé vital` |
| English aliases | none |
| Density / unit mappings | none |
| Forms / conversion rules | none |
| Substitutions | none |
| Measurement state | `not_yet_researched` |
| Substitution research state | `not_yet_researched` |

OQLF gives `gluten de froment élastique` as the preferred Québec French term and pairs it with
`vital wheat gluten`. Its definition describes industrial wheat gluten with agglomerating and
elastic properties when hydrated or rehydrated [WP02-S105]. Health Canada's Canadian Nutrient File
uses the bilingual names `Wheat, vital wheat gluten / Blé, gluten de blé vital`; only the name was
used, not its serving value [WP02-S106]. The cereal-derived identity uses `GRAIN_AND_CEREAL` in
keeping with OQLF's processed-cereal domain classification.

Keep this reference separate from `ingredient-ref-high-gluten-flour`: one is gluten as a processed
cereal product, while the other is a named flour product. Do not add `gluten flour` as an alias.
CFIA separately defines and standardizes `Gluten Flour` in section 12.1.5, but that wording alone
does not establish universal equivalence with vital wheat gluten [WP02-S107]. Wheat-starch,
gluten-flour, and source-specific product boundaries remain open to further evidence review.

## Recipe audit

All 114 bundled recipe JSON files were searched with word-boundary matching for `vital wheat gluten`,
`gluten de froment élastique` (accent-folded and unaccented), `gluten de blé vital`, and `gluten flour`.
No ingredient text matched. No recipe line was relinked.

## Sources

- [WP02-S105 — OQLF, gluten de froment élastique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084319/gluten-de-froment-elastique): preferred Québec term, English translation, definition, and processed-cereal domain.
- [WP02-S106 — Health Canada, Canadian Nutrient File, Wheat, vital wheat gluten](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6591): bilingual food name only; serving and nutrient information not imported.
- [WP02-S107 — CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0): section 12.1.5 defines the standardized `Gluten Flour` product; no equivalence is inferred.

## Acceptance checks

| Check | State |
| --- | --- |
| Name, alias, category, and boundary decisions recorded in the research ledger | Pass: see `ingredient-ref-vital-wheat-gluten` and sources WP02-S105–S107. |
| Canonical reference has no unsupported density, mapping, form, conversion, yield, or substitution | Pass: identity-only row. |
| Recipe audit across all 114 bundled recipes | Pass: no matches; no recipe edits. |
| Package normalization, package tests, generated index, and Android unit tests | Pass: normalized/validated package; generator current at 328 references; 9 Python tests and all 231 Android unit tests pass. |
| Pixel 9a / Android 16 English and fr-CA picker searches | Pass: API 36 / 1080×2424; English exact name, French preferred term, and accent-folded French alias each returned the intended row. |
| Independent Québec French review | Pending. |

The deployed build and both `test` and `:app:assembleDebug` tasks in
`tools/deploy_to_pixel9a_emulator.sh` passed. Both empty QA drafts were discarded. The fr-CA home
screen returned to 114 recipes. Screenshots:

- English picker: `pixel9a-vital-wheat-gluten-picker-en.png`
- French preferred term: `pixel9a-vital-wheat-gluten-picker-fr-ca.png`
- French alias: `pixel9a-vital-wheat-gluten-alias-fr-ca.png`
- English home with 114 recipes after draft discard: `pixel9a-vital-wheat-gluten-home-en-114.png`
- Final home with 114 recipes: `pixel9a-vital-wheat-gluten-home-fr-ca-114.png`

Final canonical package: 328 references, SHA-256
`324e9fc91390484a68d1e1739c3aa0c2c899ccf840917331885f0ffec239c899`. Evidence ledger: 482 records,
SHA-256 `3efb96503365656610203aef474c92a7fd288a44004b4e96a6d2d7ab6385907e`. Package validation,
generated-catalog freshness, no-BOM/escaped-Unicode checks across 125 JSON files, and
`git diff --check` passed.

The broader A7 grain-meal, wheat-starch, malted-flour, toasted-flour, and gluten-flour terminology
review remains open.
