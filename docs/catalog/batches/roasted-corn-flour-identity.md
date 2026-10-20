# WP02 Roasted Corn Flour Identity (A5/A7/B6)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** integrated and verified; independent bilingual review remains pending
- **Research date:** 2026-10-06
- **Scope:** Review Les Moulins de Soulanges' roasted corn flour against the existing precooked corn
  flour identity. Keep source-named products distinct where the available evidence does not establish
  equivalence.

## Accepted identity

| Stable ID | English / fr-CA display | Aliases | Category |
| --- | --- | --- | --- |
| `ingredient-ref-roasted-corn-flour` | roasted corn flour / farine de maïs torréfiée | None | `FLOUR_AND_STARCH` |

Les Moulins de Soulanges lists `Roasted Corn Flour` as a functional flour and says its product uses
heat treatment to promote gelatinization of corn starch [WP02-S130]. Its French page names `Farine de
Maïs Torréfié` and describes the corresponding thermal treatment [WP02-S131]. The catalog uses
`farine de maïs torréfiée` with adjective agreement. OQLF supports the base term `farine de maïs`
[WP02-S88]. No performance, gluten-free, nutrition, health, preservation, or replacement claims are
imported.

The existing `precooked corn flour / farine de maïs précuite` identity is grounded in a separately
named P.A.N. product described as `100% pre-cooked white corn flour`; a Montréal supplier uses the
French name `farine de maïs précuite` [WP02-S86–S87]. The manufacturer pages describe both products
as heat-treated maize flours, but they do not establish that `roasted corn flour` and `precooked corn
flour` are equivalent names or processing classes. Keep the source-named identities separate without
claiming that they can never overlap in broader regional usage.

The new row has no aliases, density, unit mappings, forms, conversions, yield, measurement, or
substitution data. Do not map `toasted corn flour`, generic `corn flour`, or `precooked corn flour`
to it. The unqualified `corn flour` spelling remains unassigned because it conflicts across regional
English usage.

## Catalog and recipe audit

Before integration, no exact catalog name or alias matched `roasted corn flour`, `farine de maïs
torréfiée`, or its accent-folded spelling. The existing `precooked corn flour` row remained the sole
exact match for its own English and French names. The 114 bundled recipe files contained no matching
roasted-corn ingredient wording; no recipe line was changed.

## Sources

Sources were accessed on 2026-10-06.

- **WP02-S130 — Les Moulins de Soulanges, Roasted Corn Flour:** [English product page](https://moulinsdesoulanges.com/language/en/roasted-corn-flour/).
  Names the functional flour product and describes heat treatment to promote corn-starch
  gelatinization. Manufacturer performance and nutrition claims are not imported.
- **WP02-S131 — Les Moulins de Soulanges, Farine de Maïs Torréfié:** [French product page](https://moulinsdesoulanges.com/language/fr/farine-de-mais-torrefie/).
  Names the French product and describes its thermal treatment. The catalog corrects adjective
  agreement and does not activate the page spelling as an alias.
- **WP02-S86–S87 — precooked corn flour boundary:** P.A.N.'s manufacturer page identifies its
  product as 100% pre-cooked white corn flour; the Montréal supplier uses `farine de maïs précuite`.
  These sources support the existing precooked name, not equivalence with the roasted product.
- **WP02-S88–S89 — regional corn-flour naming boundary:** OQLF gives `farine de maïs` for finely
  milled kernels and documents the cross-region collision around English `corn flour`; the catalog
  keeps unqualified `corn flour` unassigned.

## Acceptance checks

| Check | State |
| --- | --- |
| Accepted name, category, source links, and precooked-product boundary recorded in the evidence ledger | Pass: record `ingredient-ref-roasted-corn-flour` uses WP02-S86–S88 and WP02-S130–S131. |
| No aliases or unsupported numeric, form, conversion, yield, measurement, or substitution data | Pass: the seed row is identity-only. |
| Normalized catalog-name and 114-recipe audit | Pass: no prior roasted-corn row or matching recipe line; no recipe changed. |
| English and Québec French complete-name picker behavior and unsupported names | Pass in unit tests and Pixel live searches; separate precooked rows returned. |
| Package normalization, validation, generated index, Python tests, and Android unit tests | Pass; 238 Android unit tests and 9 Python tests. |
| Android instrumentation on Pixel 9a / Android 16 API 36 | Pass: 29 tests, 27 passed, 2 environment-gated skips, no failures/errors. |
| Escaped-Unicode/no-BOM audit and `git diff --check` | Pass across 125 bundled JSON files. |
| Pixel 9a / Android 16 live picker verification and restored French home | Pass; 114 recipes remain and locale restored to fr-CA. |
| Independent Québec French review | Pending. |

## Verification record

Final verification on 2026-10-06: the normalized package contains 335 ingredient references; the
reference file SHA-256 is
`a187ece7f7a834bd6fb5adb8368605cc55908999de185b81be36894730c1178c`. The evidence ledger contains
490 records with SHA-256
`26e9c10aab4f31e98688031b90f0ca412f6b3fd58ff5baf2ebe5f56056584375`. Package normalization reported
zero changed parts. Package validation, generated-index freshness (335 references), all 9 Python
package tests, all 238 Android unit tests, escaped-Unicode/no-BOM checks across 125 bundled JSON
files, and `git diff --check` passed. Pixel 9a / Android 16 API 36 instrumentation passed 27 of 29
tests, with two environment-gated skips and no failures or errors.

Live picker searches returned `roasted corn flour` and the distinct `precooked corn flour`; the
accent-folded French searches returned `farine de maïs torréfiée` and `farine de maïs précuite` as
separate rows. `toasted corn flour` returned no result. The blank draft was discarded, and the final
French home shows all 114 recipes. Screenshots:

- English: `pixel9a-roasted-corn-flour-picker-en.png` and
  `pixel9a-roasted-corn-precooked-boundary-en.png`.
- French and boundary: `pixel9a-roasted-corn-flour-picker-fr-ca.png`,
  `pixel9a-roasted-corn-precooked-boundary-fr-ca.png`, and
  `pixel9a-roasted-corn-no-toasted-result.png`.
- Restored library: `pixel9a-roasted-corn-home-restored-fr-ca.png` (and the English 114-recipe
  check `pixel9a-roasted-corn-home-en-114.png`).

## Remaining work

- Obtain independent Québec French review of `farine de maïs torréfiée` and the distinction from
  `farine de maïs précuite`.
- Research measurement and substitution as separate completeness dimensions; do not activate values
  from the product descriptions in this packet.
- Continue the remaining A5/A7/B6 flour identities and the wider catalog plan.
