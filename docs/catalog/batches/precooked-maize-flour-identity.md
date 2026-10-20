# WP02 A5 Precooked Corn Flour Identity

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add a distinct precooked maize-flour identity and keep it separate from nixtamalized masa harina, whole-kernel corn flour, cornmeal, and cornstarch. Identity only; no measurements or substitutions.
- **Input package:** 311 ingredient references, SHA-256 `56c251d1724ac379d1686c39d08eb23b8905f7e83a98f6cea844881a9d7963eb`; 461 research-ledger records, SHA-256 `0bb072965e15711c6d608fcbf559e22fca7f4e69b17a59b47fe317bcd17fd8e3`; 114 bundled recipe files.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-precooked-corn-flour` | precooked corn flour / farine de maïs précuite | None | `FLOUR_AND_STARCH`; a separate precooked maize-flour product. Keep distinct from masa harina, untreated whole-kernel corn flour, cornmeal, and cornstarch. [S85–S87] |

The reference has null density and empty unit mappings. No forms, conversions, or substitutions were
added. The English product page uses “Pre-cooked White Corn Meal” as its title but explicitly calls
the product “100% pre-cooked white corn flour”; the general identity follows the product description
without carrying the white-corn qualifier. The Montréal French listing uses `farine de maïs précuite`.
Do not add brand, color, or `pre-cooked corn meal` aliases. In particular, `masa harina`, `Maseca`,
and instant corn-masa wording are not aliases for this precooked identity.

## Source register

Sources were accessed on 2026-10-06.

- **S85 — Gwirtz and Garcia-Casal, Processing maize flour and corn meal food products:** [PubMed review](https://pubmed.ncbi.nlm.nih.gov/24329576/). The abstract distinguishes precooked refined maize flour from dehydrated nixtamalized flour and describes different processing paths. No numeric or nutritional data is used.
- **S86 — P.A.N. Food Business Solutions, Pre-cooked White Corn Meal:** [Manufacturer product page](https://panfoodbusiness.global/en/harina-precocida-de-maiz-blanco-english/). The description identifies the product as pre-cooked and specifies that it is 100% pre-cooked white corn flour, contrasting it with whole corn and raw corn flour. Brand, color, and applications are not imported.
- **S87 — L'Española, Farine de maïs précuite DOÑA AREPA:** [Montréal supplier listing](https://lespanola.com/fr/products/chapelure-pan-rallado-500-g-1). The Québec-market page uses the exact French display and lists `farine de maïs précuite` as the ingredient. The brand is not imported.

## Recipe and duplicate audit

All 114 bundled recipe JSON files were searched for `precooked corn flour`, `pre-cooked corn flour`,
`precooked maize flour`, `farine de maïs précuite`, `farine de maïs blanc précuite`, `harina de maíz
precocida`, and related precooked-cornmeal wording. No ingredient line matched; no recipe was relinked.

## Integration and verification

Integration added one canonical reference and generated catalog entry, plus a regression test asserting
its exact English and Québec French names, category, empty aliases and numeric fields, normalized
search results, and distinct IDs from related maize products. The final reference package has 312
references (SHA-256
`21fd07b36a70bd1ced76cb8d2c8f2e575c434cac7557fc1dd2eb95539d3b1b19`); the research ledger has 462
records (SHA-256 `a39870dff7b9654050be71cbf292fcf05d35437ff7a2133bc583d3170191fe43`).

- Android unit tests: 205 passed.
- Python seed-package tests: 9 passed.
- Android 16 / API 36 Pixel 9a instrumentation: 26 cases, 24 passed, two QA-gated skips, zero failures or errors. The skipped cases were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The project deploy script passed its test and debug-assembly steps and installed/launched on an isolated temporary 8 GB Pixel 9a profile at 1080×2424; the profile had 6.7 GB free. The original Pixel emulator remained separate and displayed its 114-recipe library.
- Reference normalization, bundled-package normalization and validation, generated-catalog freshness, `git diff --check`, and a UTF-8/no-BOM audit of all 124 bundled JSON files passed. The audit found no raw non-ASCII bytes or known mojibake markers.
- Live picker searches returned `precooked corn flour` in English and the exact localized result `farine de maïs précuite` for the accent-folded French query. The probe ingredient was not selected; the blank draft was discarded and the French home screen settled at 114 recipes.

Screenshots: `pixel9a-precooked-corn-flour-picker-en.png`,
`pixel9a-precooked-corn-flour-picker-fr-ca.png`, and
`pixel9a-precooked-corn-flour-home-fr-ca-114.png` in this batch directory.

## Remaining work

- Obtain independent bilingual Québec French review of `farine de maïs précuite` and the process boundary.
- The separate unqualified corn-flour naming and cornmeal-grind review is recorded in
  `corn-flour-disambiguation.md`; independent bilingual approval remains pending.
- Keep density, measurement, conversion, and substitution research separate; no numeric or replacement data is active.
- Continue the remaining A4/A5 identities and the wider catalog plan.
