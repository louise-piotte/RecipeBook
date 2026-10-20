# WP02 Roasted Wheat Flour Identities (A7)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** two identity-only rows integrated; package, tests, and Pixel 9a verification passed; independent Québec French review pending
- **Research date:** 2026-10-06
- **Scope:** Add a Québec-mill roasted wheat flour and a separately declared roasted wheat malt flour.
  Keep both distinct from general and malted wheat flour, and from each other.

## Accepted identities

| Stable ID | English / fr-CA display | Aliases | Category |
| --- | --- | --- | --- |
| `ingredient-ref-roasted-wheat-flour` | roasted wheat flour / farine de blé torréfiée | None | `FLOUR_AND_STARCH` |
| `ingredient-ref-roasted-wheat-malt-flour` | roasted wheat malt flour / farine de malt de blé torréfié | None | `FLOUR_AND_STARCH` |

Les Moulins de Soulanges names a `Roasted Wheat Flour` product in English and a corresponding
`Farine de Blé Torréfié` product in French [WP02-S126–S127]. The French page explicitly discusses
roasting the wheat flour. The catalog uses `farine de blé torréfiée` with adjective agreement; it
does not add the source spelling as an alias. OQLF lists `farine de blé` as a preferred term for
the general wheat-flour identity [WP02-S128]. Existing evidence distinguishes malted wheat flour
from general wheat flour and other cereal malt flours [WP02-S114–S117].

Diversi Foods' bilingual technical sheet separately lists wheat malt flour and roasted wheat malt
flour in its ingredient declaration [WP02-S129]. This supports a separately named ingredient, while
the report does not establish a detailed process specification or a home-kitchen conversion. This
compound ingredient remains separate from both roasted wheat flour and ordinary malted wheat flour.

Both rows contain no aliases, density, unit mappings, forms, conversions, yield, measurement, or
substitution data. Roasted wheat flour is not assigned a whole-grain or extraction class. The source
does not establish `toasted wheat flour` as an equivalent. No generic `roasted malt flour` alias is
activated.

## Catalog and recipe audit

Before integration, the active catalog had no exact English or French identity or alias for either
product. The 114 bundled recipe files contained no matching English or French ingredient wording;
no recipe line was changed. Complete bilingual search phrases are covered by unit tests, while
broader `wheat flour` searches intentionally include several distinct wheat-flour identities.

## Sources

Sources were accessed on 2026-10-06.

- **WP02-S126 — Les Moulins de Soulanges, Roasted Wheat Flour:** [English product page](https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/).
  Establishes a named roasted-wheat-flour product and describes its bakery role. Product performance,
  nutrition, and health claims are not imported.
- **WP02-S127 — Les Moulins de Soulanges, Farine de Blé Torréfié:** [French product page](https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/).
  Names the corresponding product and explicitly discusses roasting wheat flour. The catalog corrects
  adjective agreement and does not activate the page spelling as an alias.
- **WP02-S128 — OQLF, farine de froment:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297140/farine-de-froment).
  Pairs English `wheat flour` with French `farine de froment` and lists `farine de blé` as a preferred
  French term.
- **WP02-S129 — Diversi Foods, Technical Sheet 74-05:** [Bilingual ingredient declaration](https://diversifoods.com/uploads/files/technical-reports/74-05.pdf).
  Separately lists wheat malt flour and roasted wheat malt flour in English and French. Supports the
  separate declared name only; no detailed process or kitchen quantity is imported.
- **WP02-S114–S117 — malted wheat flour boundary:** CFIA, TERMIUM Plus, Molino Bongiovanni, and
  Canadian product-list sources recorded in `baking-flours-starches.md` support malted wheat flour
  as a separately named product.

## Acceptance checks

| Check | State |
| --- | --- |
| Accepted names, category, source links, and separation decisions recorded in the evidence ledger | Pass: records `ingredient-ref-roasted-wheat-flour` and `ingredient-ref-roasted-wheat-malt-flour` use WP02-S114–S117 and WP02-S126–S129. |
| No aliases or unsupported numeric, form, conversion, yield, measurement, or substitution data | Pass: both seed rows are identity-only. |
| Normalized catalog-name and 114-recipe audit | Pass: no prior row or recipe line matched; no recipe was changed. |
| English and Québec French complete-name picker behavior, including unsupported names | Pass: unit tests and live searches returned one intended row for each full name; unsupported toasted/generic names returned no result. |
| Package normalization, validation, generated index, Python tests, and Android unit tests | Pass: normalization changed zero parts, package validation passed, generated index is current at 334 references, all 9 Python tests and 236 Android unit tests passed. |
| Escaped-Unicode/no-BOM audit and `git diff --check` | Pass: all 125 bundled JSON files have no BOM or literal non-ASCII; `git diff --check` passed. |
| Pixel 9a / Android 16 live picker verification and restored French home | Pass: both English rows, both accent-folded French rows, and both unsupported-name searches checked on Pixel 9a / Android 16 API 36; discarded probes and restored fr-CA with all 114 recipes. |
| Independent Québec French review | Pending. |

## Verification record

The normalized package contains 334 references (SHA-256
`6bd08f1544bf28ea19ec89b96ffbd6cb96d17afa31758a31617784f52a8df356`); the evidence ledger contains
489 records (SHA-256 `923565f2482875a1660cc2b2dee96d8e095fee5b5ff9679ac7bd0c263074eff0`). Package
normalization reported zero changed parts; package validation, generator freshness, all 9 Python
package tests, all 236 Android unit tests, and `git diff --check` passed. All 125 bundled JSON files
are UTF-8 without BOM and contain escaped Unicode.

`tools/deploy_to_pixel9a_emulator.sh` passed its unit-test and debug-assembly steps, installed and
launched the app on Pixel 9a / Android 16 API 36 at 1080×2424, and preserved the existing library.
In English locale, `roasted wheat flour` and `roasted wheat malt flour` each returned their exact
English display. In fr-CA, accent-folded `farine de ble torrefiee` and
`farine de malt de ble torrefie` each returned the intended French display. `toasted wheat flour`
and `roasted malt flour` returned no results. Both blank drafts were discarded; the 114-recipe home
was confirmed in English and French, and the emulator was restored to its starting fr-CA locale.

Screenshots in this directory:

- `pixel9a-roasted-wheat-flour-picker-en.png`
- `pixel9a-roasted-wheat-flour-picker-fr-ca.png`
- `pixel9a-roasted-wheat-malt-flour-picker-en.png`
- `pixel9a-roasted-wheat-malt-flour-picker-fr-ca.png`
- `pixel9a-roasted-wheat-no-toasted-result.png`
- `pixel9a-roasted-wheat-no-generic-malt-result.png`
- `pixel9a-roasted-wheat-home-en-114.png`
- `pixel9a-roasted-wheat-home-fr-ca-114.png`

## Remaining work

- Obtain independent Québec French review of both displays, especially `farine de blé torréfiée` and
  `farine de malt de blé torréfié`.
- Continue reviewing other grain meals, malted/toasted products, and gluten-flour equivalence.
- Research measurement and substitution as separate completeness dimensions; do not activate values
  from the identity sources in this packet.
