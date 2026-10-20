# WP02 A7/B6 Generic Toasted-Barley Boundary Review

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** alias integration and device verification complete; regional Japanese names remain unresolved; independent Québec French review pending
- **Research date:** 2026-10-06
- **Scope:** Determine whether generic `toasted barley flour` can map to the Québec mill's existing `roasted barley flour` identity, and record the current evidence boundary for Japanese regional roasted-grain terms.

## Decision

Add `toasted barley flour` as the English alias of `ingredient-ref-roasted-barley-flour`; do not create a duplicate generic row. Eurogerm’s manufacturer catalogue identifies its barley product as `toasted barley flour`, and its Parfen leaflet describes that line as roasted cereal flour made by milling roasted cereal, listing Orge Fruité 130 as barley [WP02-S144–S145]. This matches the core barley-plus-roasting-and-milling ingredient class of the Québec mill’s roasted-barley-flour product [WP02-S123–S124]. The alias records a name/class match, not identical brand-specific processing or performance. No French alias is added; retain the Québec mill-backed display `farine d'orge torréfiée` pending independent review.

Keep `hattai-ko` and `mugikogashi` inactive as aliases. A Japanese manufacturer describes regional versions using barley in Kanto, naked barley west of Kansai, and corn or millet in some other regions; the material is roasted and ground. The same page's English rendering calls naked barley “rye,” so this review relies on the Japanese description and NARO's classification of naked barley as a barley type [WP02-S141, WP02-S143]. MAFF meeting notes also mention Hattai-ko and roasted barley flour as traditional storage foods, but do not define one grain specification or milling process [WP02-S142]. These sources do not establish the Québec French label or equivalence to the Québec mill product.

The generic English product phrase is now searchable through the existing roasted-barley row. Regional names, product-specific process differences, measurements, and substitutions remain open.

## Catalog and recipe audit

- `ingredient-ref-roasted-barley-flour` is `roasted barley flour / farine d'orge torréfiée`, category `FLOUR_AND_STARCH`, with the single English alias `toasted barley flour` and no French aliases or numeric/conversion data.
- The existing row is updated; no new row is added. The package remains at 338 references.
- No recipe line is changed. The earlier audit of 114 bundled recipes found no exact generic toasted-barley wording or regional names.
- `hattai-ko` and `mugikogashi` remain absent from active aliases.

## Acceptance checks

| Check | State |
| --- | --- |
| Use one existing identity row for the supported shared ingredient class | Pass: `toasted barley flour` is the sole English alias on `ingredient-ref-roasted-barley-flour`; no duplicate row was added. |
| Keep regional terms and unsupported French aliases inactive | Pass: `hattai-ko` and `mugikogashi` are absent from aliases; no French alias was added. |
| Keep identity separate from measurement and substitution evidence | Pass: density, unit mappings, forms, conversions, yields, and substitutions remain empty. |
| Preserve recipe data | Pass: no bundled recipe matches were found and no recipe line changed. |
| Validate package, generated index, and automated tests | Pass: 338-reference package, generated index, 9 Python package tests, and 242 Android unit tests. |
| Verify exact English and fr-CA picker behavior on Pixel 9a / Android 16 | Pass: supported queries returned one intended row; both unresolved regional queries returned no row. |
| Obtain independent Québec French culinary review | Pending |

## Verification record

The normalized package has 338 references (reference JSON SHA-256
`842401a34b68f45e6cbd49aaa55b29089ee99270714dcacf0998524d028af2fa`); the 493-record evidence
ledger SHA-256 is `82f9b91bfb89a35b69f154302e49e947b47e7ecaf440aec903213db34550842c`. Package
validation and normalization checks passed with zero changed parts; generated-index freshness passed
at 338 references. All 9 Python seed-package tests and 242 Android debug unit tests passed. The
125 bundled JSON files have no BOM, invalid UTF-8, or literal non-ASCII. `git diff --check` passed.

The Pixel 9a / Android 16 API 36 picker returned exactly one row, `roasted barley flour`, for
`toasted barley flour`. The accent-folded fr-CA query `farine d orge torrefiee` returned exactly
`farine d'orge torréfiée`. `hattai-ko` and `mugikogashi` each returned no row. The connected Gradle
instrumentation task could not install because emulator storage was insufficient; after direct APK
installation, AndroidJUnitRunner completed 29 tests (27 passed, 2 assumption skips, 0
failures). The blank draft was discarded, and the French home was restored with all 114 recipes.

Screenshots:

- `pixel9a-toasted-barley-alias-picker-en.png`
- `pixel9a-roasted-barley-picker-fr-ca.png`
- `pixel9a-toasted-barley-no-hattai-ko.png`
- `pixel9a-toasted-barley-no-mugikogashi.png`
- `pixel9a-toasted-barley-home-fr-ca-114.png`

## Sources

Sources were accessed on 2026-10-06. Only the cited name, process, and product-boundary details are used.

- **WP02-S123–S125 — Québec mill product and base barley term:** recorded in `baking-flours-starches.md`. The mill's English and French pages name its roasted barley flour product; OQLF supplies the general `barley flour / farine d'orge` pair.
- **WP02-S141 — Maehara Seifun, Hattai-ko:** [manufacturer page](https://gishi.co.jp/home/item.asp?ct=28). Regional cereal inputs and roasting / grinding are described in Japanese. Its separate English rendering says rye for naked barley; that wording is not used as evidence.
- **WP02-S142 — MAFF Chugoku-Shikoku regional bureau:** [barley and naked-barley meeting record](https://www.maff.go.jp/chushi/seisan/mugi/mugiproject/attach/pdf/event-19.pdf), page 1. Mentions Hattai-ko, roasted barley flour, and roasting as a processing approach, without defining a uniform product.
- **WP02-S143 — NARO:** [What is high beta-glucan barley?](https://www.naro.go.jp/publicity_report/publication/files/20180731nics_kind_pamph.pdf). Its classification diagram places naked barley under barley.
- **WP02-S144 — Eurogerm / ProBlend:** [Bakery Ingredients catalogue](https://www.problend-eurogerm.com/images/fiche-bakery-ingredient.pdf), page 2. Lists item 23143, Parfen Orge Fruite, under toasted barley flour and names toasted barley flour as the ingredient.
- **WP02-S145 — Eurogerm:** [Parfen Taste Colour Ingredients](https://www.problend-eurogerm.com/images/Fiches%20pdf%20ANG/Parfen_ANG08.pdf). Describes the Parfen range as roasted cereal flours made by milling roasted cereal and lists Orge Fruité 130 as barley.

## Remaining work

- Obtain independent Québec French review of `farine d'orge torréfiée` and the English alias.
- Revisit `hattai-ko` and `mugikogashi` only with a product-specific grain/process source and Québec French naming evidence.
- Keep density, measurement, and substitution research separate from identity review.
