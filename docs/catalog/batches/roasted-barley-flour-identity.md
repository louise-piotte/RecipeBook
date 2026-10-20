# WP02 Roasted Barley Flour Identity (A7/B6)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** identity and English alias integrated; initial and follow-up verification passed; independent Québec French review pending
- **Research date:** 2026-10-06
- **Scope:** Add the Québec mill's named roasted-barley flour product as an identity-only ingredient.
  Keep it distinct from general and malted barley flour. Accept only the manufacturer-backed English alias `toasted barley flour`; keep regional roasted-grain names out until their exact product boundaries are established.

## Accepted identity

| Stable ID | English / fr-CA display | Aliases | Category |
| --- | --- | --- | --- |
| `ingredient-ref-roasted-barley-flour` | roasted barley flour / farine d'orge torréfiée | English: `toasted barley flour` | `FLOUR_AND_STARCH` |

Les Moulins de Soulanges sells a product named `Roasted Barley Flour` and describes a roasting /
heat-treatment process for barley used in bakery products [WP02-S123]. Its French page calls the
product `Farine d'Orge Torréfié` [WP02-S124]. The catalog display corrects adjective agreement to
`farine d'orge torréfiée`; independent Québec French review is pending. OQLF's unqualified
`farine d'orge / barley flour` remains the general milling identity [WP02-S125]. The existing
malted-barley identity remains separate: OQLF gives a distinct malted-barley term, and an Ontario
mill describes malting as germinating, drying, and milling barley [WP02-S110–S113].

The reference has one source-backed English alias, `toasted barley flour`, and no French aliases, density, unit mapping, form, conversion, yield, or substitution data. Eurogerm's manufacturer catalogue identifies its barley product with this name, and its Parfen leaflet defines the product line as roasted cereal flour made by milling roasted cereal [WP02-S144–S145]. This supports the shared ingredient class, not identical brand-specific processing or performance. `Hattai-ko` and `mugikogashi` remain unresolved and are not aliases; see `toasted-barley-boundary-review.md`.

## Catalog and recipe audit

The pre-integration catalog had no exact roasted-barley-flour identity or aliases. A normalized
exact-name check found no collision for either accepted display. Broad searches for `barley flour`
and `farine d'orge` intentionally include general, malted, and roasted identities; complete
qualified English and French phrases are checked separately in the search tests and live picker.
The 114 bundled recipe files contain no exact `roasted barley flour`, `toasted barley flour`,
`farine d'orge torréfiée`, `hattai-ko`, or `mugikogashi` ingredient text. No recipe line was changed.

## Sources

Sources were accessed on 2026-10-06.

- **WP02-S123 — Les Moulins de Soulanges, Roasted Barley Flour:** [English product page](https://moulinsdesoulanges.com/language/en/roasted-barley-flour/).
  The Québec mill names a roasted barley flour product, describes its roasting / heat-treatment
  process, and lists bakery uses. Product performance, nutrition, and health claims are not imported.
- **WP02-S124 — Les Moulins de Soulanges, Farine d'Orge Torréfié:** [French product page](https://moulinsdesoulanges.com/language/fr/farine-dorge-torrefie/).
  The same mill names the French product and describes its roasting / heat-treatment process. The
  catalog corrects the page's adjective agreement; it does not activate the page spelling as an alias.
- **WP02-S125 — OQLF, farine d'orge:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge).
  Pairs the general Québec French name `farine d'orge` with English `barley flour`.
- **WP02-S110–S113 — malted barley flour boundary:** OQLF, CFIA, and Arva Flour Mills sources
  recorded in `baking-flours-starches.md` document malted barley flour as a distinct product and
  describe a germination-based milling process. No malted terms are added to this row.

## Acceptance checks

| Check | State |
| --- | --- |
| Accepted names, category, source links, and separation decisions recorded in the evidence ledger | Pass at initial integration: the 487-record ledger validated; the follow-up alias sources are recorded in `toasted-barley-boundary-review.md`. |
| One reviewed English alias; no unsupported numeric, form, conversion, yield, or substitution data | Pass after follow-up validation: `toasted barley flour` is the sole alias; all numeric and substitution fields remain empty. |
| English and Québec French complete-name search returns the intended row; unsupported names remain unassigned | Initial integration preceded the alias; follow-up live English and accent-folded French queries returned the intended row, while `hattai-ko` and `mugikogashi` returned no rows. See `toasted-barley-boundary-review.md`. |
| Recipe audit across all 114 bundled recipes | Pass: no matches; no recipe edits |
| Package normalization and validation; generated index freshness; Python and Android unit tests | Pass: follow-up normalization/validation, generator check, 9 Python tests, and all 242 Android unit tests. |
| Escaped-Unicode/no-BOM audit and `git diff --check` | Pass: 125 bundled JSON files, zero BOMs or literal non-ASCII; whole-repository diff check passes. |
| Pixel 9a / Android 16 English and fr-CA picker verification | Pass: the live English alias and accent-folded fr-CA display-name searches each returned the intended row; `hattai-ko` and `mugikogashi` returned no rows. |
| Independent Québec French review | Pending |

## Verification record

At initial integration, before the later alias, the normalized package contained 332 references (SHA-256
`253fa2288ca9ad528192fcc0300f83ea754a469dc87b61136f2882428e0b4a3a`); the evidence ledger contains
487 records (SHA-256 `0d4d92f61f167bfdf9964296fc34aba673ef6554906a021d0c0275b4b33039d9`). Package
normalization reported zero changed parts; package validation and generated-catalog freshness passed.
All 9 Python package tests and 235 Android debug unit tests passed at initial integration, before the follow-up alias. `git diff --check` passed.
All 125 bundled JSON files are UTF-8 without BOM and contain escaped Unicode.

`tools/deploy_to_pixel9a_emulator.sh` passed its test/debug-assembly steps and installed/launched the
build on Pixel 9a / Android 16 API 36 at 1080×2424. The initial integration check returned the
single row `roasted barley flour` for the complete English query and `farine d'orge torréfiée` for
the accent-folded French query `farine d orge torrefiee`; `toasted barley flour` had no result then,
before the alias was added. The follow-up live alias and unsupported-name results, current hashes,
and instrumentation details are in `toasted-barley-boundary-review.md`.

Screenshots in this directory:

- `pixel9a-roasted-barley-flour-picker-en.png`
- `pixel9a-roasted-barley-flour-picker-fr-ca.png`
- `pixel9a-roasted-barley-no-toasted-result.png`
- `pixel9a-roasted-barley-flour-home-en-114.png`
- `pixel9a-roasted-barley-flour-home-fr-ca-114.png`

Follow-up alias screenshots are listed in `toasted-barley-boundary-review.md`.

## Remaining work

- Obtain independent Québec French review of `farine d'orge torréfiée` and its relationship to the
  source page's spelling.
- Maintain the alias only as a name/class match for roasted-barley flour; leave `hattai-ko` and
  `mugikogashi` unresolved until their grain boundaries and Québec French naming are established.
- Research density/measurement and substitution as separate completeness dimensions.
