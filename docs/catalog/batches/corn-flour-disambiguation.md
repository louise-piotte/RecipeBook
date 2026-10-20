# WP02 A5 Corn Flour Disambiguation

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Resolve the regional English `corn flour` alias collision and retain fine/medium/coarse
  cornmeal grinds as descriptors. No new identity, measurement, or substitution is introduced.
- **Input package:** 312 ingredient references, SHA-256
  `21fd07b36a70bd1ced76cb8d2c8f2e575c434cac7557fc1dd2eb95539d3b1b19`; 462 research-ledger records,
  SHA-256 `a39870dff7b9654050be71cbf292fcf05d35437ff7a2133bc583d3170191fe43`; 114 bundled recipe files.

## Evidence and decision

OQLF's `farine de maïs` entry defines finely milled maize and lists English `corn flour`; it also
records `cornstarch` as UK usage for that product [S88]. OQLF's `amidon de maïs` entry identifies
maize starch and lists `corn flour` as a UK English term [S89]. The catalog has no regional scope for
English aliases, so the unqualified spelling cannot safely identify one global product.

| Stable ID | English / fr-CA display | Alias decision | Boundary |
| --- | --- | --- | --- |
| `ingredient-ref-cornstarch` | cornstarch / fécule de maïs | Removed the global English alias `corn flour`; aliases remain empty. | Extracted maize starch; retain explicit English/French names. |
| `ingredient-ref-whole-kernel-corn-flour` | whole-kernel corn flour / farine de maïs | No unqualified `corn flour` alias. | Whole-kernel maize flour; retain its qualified canonical names. |
| `ingredient-ref-precooked-corn-flour` | precooked corn flour / farine de maïs précuite | No aliases. | Separate precooked product identity. |
| `ingredient-ref-masa-harina` | masa harina / farine de maïs nixtamalisée | No aliases. | Separate nixtamalized product identity. |
| `ingredient-ref-cornmeal` | cornmeal / semoule de maïs | Keep the existing English alias `corn meal`. | Fine, medium, and coarse describe grinds of this identity [S5]. |

The exact normalized catalog key `corn flour` is unassigned. The picker performs substring matching,
so the live `corn flour` query returns the clearly qualified `precooked corn flour` and
`whole-kernel corn flour` rows, but not cornstarch. Explicit `cornstarch` and accent-folded French
`fécule de maïs` queries return cornstarch. The French `farine de mais` query shows three qualified
flour identities—whole-kernel, nixtamalized, and precooked—with no cornstarch result. `semoule de
mais` returns the single cornmeal identity. The regression test checks exact catalog-key lookup and
keeps `fine cornmeal` and `coarse cornmeal` out of the exact identity index.

## Sources

- **S5 — OQLF, semoule de maïs:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais).
  Defines dried, ground maize and describes fine, medium, and coarse as grinds of semoule de maïs.
- **S88 — OQLF, farine de maïs:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais).
  Defines fine powder from milled maize and lists English `corn flour`; the entry also records
  `cornstarch` as a UK term.
- **S89 — OQLF, amidon de maïs:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais).
  Defines maize starch and lists English `corn starch`, UK `maize starch`, and UK `corn flour`.

## Recipe and integration audit

All 114 bundled recipe JSON files were parsed and their ingredient-name and original-line fields were
searched for the removed `corn flour` spelling. No ingredient line matched; no recipe was relinked.
The alias correction changes no reference count and adds no compatibility layer.

The final reference package has 312 references (SHA-256
`5d933e22f2fb78b28a64e86c6a86ba48467cfc9919a07cc62e8dce9be632e82d`); the research ledger has 462
records (SHA-256 `e3dce6d0df1b8b1df4aaac5e6859d908df49e9ef45facf65f7c399743c71c56a`). The flour/starch
identity count remains 37.

## Verification

- Android unit tests: 206 passed.
- Python seed-package tests: 9 passed.
- Android 16 / API 36 Pixel 9a instrumentation: 26 cases, 24 passed, two QA-gated skips, zero
  failures/errors. The skipped cases were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and
  `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The deploy script passed its test and debug-assembly steps and installed/launched on the isolated
  temporary 8 GB Pixel 9a profile at 1080×2424. The original emulator and its recipe library remained
  separate.
- Reference/package normalization and validation, generated-catalog freshness, ledger schema and
  alias-collision checks, UTF-8/no-BOM audit across all 124 bundled JSON files, and `git diff --check`
  passed.
- The blank QA draft was discarded. The French home screen showed 114 recipes.

Screenshots: `pixel9a-corn-flour-ambiguous-en.png`,
`pixel9a-corn-flour-whole-kernel-en.png`, `pixel9a-cornstarch-exact-en.png`,
`pixel9a-farine-de-mais-fr-ca.png`, `pixel9a-fecule-de-mais-fr-ca.png`,
`pixel9a-semoule-de-mais-fr-ca.png`, and `pixel9a-corn-products-home-fr-ca-114.png` in this batch
directory.

## Remaining work

- Obtain independent bilingual Québec French review of the maize-flour names and alias boundary.
- Keep density, measurement, conversion, and substitution evidence as separate open work.
- Continue the remaining A4/A5 identities and the wider catalog plan.
