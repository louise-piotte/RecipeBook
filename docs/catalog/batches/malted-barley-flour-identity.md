# WP02 Section A7 Malted Barley Flour Identity

## Packet record

- **Owner:** integration owner (WP10)
- **Research packet:** WP02 baking catalog; identity and naming only
- **Research date:** 2026-10-06
- **Reviewers:** independent Québec French reviewer — pending
- **Status:** identity integrated and verified; R549 measurement/substitution evidence review integrated; independent Québec French review pending
- **Canonical ID:** `ingredient-ref-malted-barley-flour`
- **Category:** `FLOUR_AND_STARCH`

## Accepted identity

| Field | Value |
| --- | --- |
| English display | `malted barley flour` |
| Québec French display | `farine d'orge maltée` |
| English search alias | `malt barley flour` |
| French aliases | none |
| Density / unit mappings | none |
| Forms / conversion rules | none |
| Substitutions | none |
| Measurement state | `researched_no_supported_value` |
| Substitution research state | `researched_no_supported_substitute` for a general home-recipe wheat-flour replacement; one conditional bread-study recommendation is retained as evidence only |

OQLF pairs its preferred French term `farine d'orge maltée` with English `malt barley flour`
[WP02-S110]. CFIA separately names `malted barley flour` and `malted wheat flour` as permitted flour
ingredients, with a 0.50% flour-composition allowance in specified standardized white and
whole-wheat flours [WP02-S111]. That allowance is not a direct recipe replacement ratio. Ontario's
Arva Flour Mills describes malted barley flour as barley that has been germinated, dried, and ground
[WP02-S112–S113]. These sources support a named malted-barley-flour identity distinct from
unqualified barley flour.

Use `FLOUR_AND_STARCH` for this milled flour product. Do not merge it with general barley flour,
malted wheat flour, malt extract, or malt syrup. The product source describes diastatic and
non-diastatic variants; this catalog entry does not select or encode either variant. R549 later
reviewed measures and wheat replacement: it adds no reusable measure, density, conversion, yield, or
active substitution rule, and preserves the study's conditional 5% bread recommendation only as
evidence. See the [R549 proposal](../proposals/wp02-next-gap-review-r549-20261017.md) and
[R549–R551 integration README](wp02-wp03-wp04-r549-r551-gap-review-integration-20261017/README.md).

## Catalog and recipe audit

Before integration, the canonical reference catalog had no exact normalized identity or alias for
`malted barley flour`, `malt barley flour`, or `farine d'orge maltée`. All 114 bundled recipe JSON
files were searched for these terms and `farine de malt d'orge`; no ingredient text matched and no
recipe line was relinked.

## Sources

- [WP02-S110 — OQLF, farine d'orge maltée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee): Québec French preferred term and English equivalent `malt barley flour`.
- [WP02-S111 — CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0): Volume 12, standards 12.1.1 and 12.1.3 allow malted barley flour up to 0.50% in specified standardized flours; this is a composition allowance, not a recipe replacement ratio.
- [WP02-S112 — Arva Flour Mills, Malted Barley Flour](https://arvaflourmills.com/products/malted-barley-flour): Ontario mill's English product page describes barley that is germinated, dried, and ground.
- [WP02-S113 — Arva Flour Mills, Farine d'orge maltée](https://arvaflourmills.com/fr/products/malted-barley-flour): French product name for the same malted-barley-flour product.

## Initial identity-integration acceptance checks — 2026-10-06

| Check | State |
| --- | --- |
| Name, alias, category, and separation decisions recorded in the research ledger | Pass: see `ingredient-ref-malted-barley-flour` and sources WP02-S110–S113. |
| Canonical reference has no unsupported numeric, form, conversion, yield, or active substitution behavior | Pass: the active reference remains unchanged by R549; the evidence-only study finding is in the research ledger. |
| Recipe audit across all 114 bundled recipes | Pass: no matches; no recipe edits. |
| Package normalization, package validation, generated index, and Android unit tests | Pass: normalization, validation, generator freshness, all 9 Python package tests, and all 233 Android unit tests. |
| Unicode and repository checks | Pass: 125 bundled JSON files contain escaped Unicode and no BOM; `git diff --check` passes. |
| Pixel 9a / Android 16 English and fr-CA picker searches | Pass: English `malted barley flour`, OQLF English alias `malt barley flour`, and French accent-folded `orge maltee` each returned the malted-barley-flour row. |
| Independent Québec French review | Pending. |

The validated package has 330 references (SHA-256
`cbce256e3cad40b92a0a3b36e5833a3a974cec4ce06afa237426870a355e563b`); the ledger has 484 records
(SHA-256 `d7a07dc2754d932c4271b4ddd3178d0b9c05c99cdc067af7c0cb13e41ed5a73a`). The deployed app
passed `tools/deploy_to_pixel9a_emulator.sh` on Pixel 9a / Android 16 (API 36, 1080×2424). Search
screenshots: `pixel9a-malted-barley-flour-picker-en.png`,
`pixel9a-malted-barley-flour-alias-en.png`, and
`pixel9a-malted-barley-flour-picker-fr-ca.png`. Unsaved QA drafts were discarded; the restored
fr-CA home still shows all 114 recipes in `pixel9a-malted-barley-flour-home-fr-ca-114.png`.

The wider A7 review remains open for other grain meals, toasted-barley synonym/product coverage,
gluten-flour terminology, measurements, substitutions, and independent bilingual review. The separate
roasted barley flour row is tracked in `roasted-barley-flour-identity.md`.

R549 updated the malted-barley-flour ledger states and added a bounded research finding on
2026-10-17. No software tests were run for that JSON-only data change under `AGENTS.md`; current
validation is recorded in the R549–R551 integration README.
