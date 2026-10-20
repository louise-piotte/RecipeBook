# WP02 Atta Identity (Section 04 A2)

## Packet record

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Scope:** Integrate the source-backed regional wheat-flour identity atta with English and Québec French names and collision-reviewed aliases. This identity-only tranche does not complete A2 or WP02.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `f7ca3b37bf58862f09f032d587f0419f499f3bd8e8ae24b071e492f8fb025f90` (297 references); pre-integration ledger SHA-256 `43435d42eb13b685c313c92607469ad94202942616ad842a3ca77d05b6af1b77`; plan snapshot SHA-256 `6a59142581cc70d05a3198bedbd0d446d045ab4bc632674d402b552dcbab3d43`.
- **Recipe audit:** no direct recipe or catalog occurrence of `atta`, `maida`, `chapati flour`, `chappati flour`, or `farine à chapati` was found; no recipe line was relinked.
- **Dependencies:** WP01 identity/evidence contract; WP02 flour/starch source packet; WP10 canonical seed integration.

## Integrated identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-atta` | atta / atta | EN: `ata`, `chapati flour`, `chappati flour`; FR: `farine atta`, `farine à chapati` | OQLF accepts the same display term in English and Québec French and lists the activated aliases. It defines atta as a distinct Indian wheat-flour product used for flatbreads. Keep it separate from generic whole-wheat flour. `farine à chapati` is explicitly rare. [S01] |

The OQLF note also records the commercial phrase `chakki atta`, where `chakki` signals stone milling.
It is not activated as an alias because it carries an additional milling qualifier. The identity is in
`FLOUR_AND_STARCH`, has null density and empty unit mappings, and has no forms or substitution data.

The existing `ingredient-ref-whole-wheat-flour` ID and its display are unchanged. At this packet's
2026-10-05 input snapshot, `maida` remained unmerged. The follow-up review established its bilingual
market naming and regional product boundary; see `maida-identity.md`. It is stored separately from
all-purpose flour, cake flour, and whole-wheat flour.

## Source register

Sources were accessed on 2026-10-05.

- **S01 — OQLF, « atta »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26574258/atta), updated 2024. The entry defines atta, gives its Indian flatbread context, accepts `atta`, `farine atta`, and rare `farine à chapati` in French, and lists `atta`, `ata`, `chapati flour`, and `chappati flour` in English.

The source is used for the named identity and terminology only. No product-specific measurements,
composition percentages, conversions, or substitutions were inferred.

## Integration and verification

- Added `ingredient-ref-atta` to the canonical seed and research ledger with identity state `verified`; no measurement or substitution evidence was activated.
- Normalized-key collision review found no existing canonical name or alias collision for the display or OQLF-listed aliases.
- Unit and ingredient-catalog search fixtures cover canonical and alias queries, including the Québec French rare term.
- `:app:testDebugUnitTest` passed with 201 tests, zero failures, errors, or skips. Connected Pixel 9a / Android 16 instrumentation completed 26 tests: 24 passed, zero failures/errors, and two existing environment-gated tests were skipped.
- All 9 Python package tests passed. Ingredient-reference normalization, bundled-package validation/normalization, generated-index freshness, ledger schema validation (448 records), alias-collision checks, UTF-8/no-BOM checks across 124 seed JSON files, and `git diff --check` passed.
- The deploy script's `test` task and `:app:assembleDebug` passed; the build installed and launched on Pixel 9a / Android 16. Live picker queries `atta` and `farine a chapati` each returned only `atta`. The unsaved probe was discarded; the home screen remained at 114 recipes.
- Screenshots: [atta](pixel9a-atta-picker.png) and [Québec French alias](pixel9a-atta-french-alias-picker.png).

## Remaining work

- Obtain independent bilingual Québec French review for `atta` and its aliases.
- Continue independent bilingual review of `maida` alongside the other A2 identities; its integration is recorded in `maida-identity.md`.
- Continue the remaining A2 wheat-class and regional-flour review.
