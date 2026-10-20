# WP02 Rye Flour Identity (Section 04 A4)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add the general rye-flour milling identity with Québec French and English displays. Leave extraction, whole-grain, light/dark, meal, and pumpernickel distinctions unresolved for separate review.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `860d7e7f37b6fbe825d0fc2739a59e951975451a49f02c99872b376b82618e23` (301 references); pre-integration evidence-ledger SHA-256 `cb1de9ade9d699be3231335d1a0524d9949b062cbf356c4a0d15aafe0fb73aff` (451 records); plan snapshot SHA-256 `7bc0a33808735aef5698c161559fcd9093357abdb1dca6c79ed827e0b4366409`.
- **Recipe audit:** no bundled recipe ingredient line contains `rye flour`, `farine de seigle`, or `seigle`; no recipe line was relinked.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 flour review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-rye-flour` | rye flour / farine de seigle | None | OQLF directly pairs the English and Québec French terms. Canadian product labels use the same pair. Keep whole-grain, light/dark, and other extraction or grind qualifiers out of aliases until they are separately reviewed. [S01–S03] |

The row uses `FLOUR_AND_STARCH`, null density, and empty unit mappings. No aliases to rye grain,
rye meal, or pumpernickel meal were added; whether those require separate IDs or forms remains open.
No grade, whole-grain status, ash value, density, yield, conversion, form, or substitution data was
activated.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — OQLF, farine de seigle:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle). Prefers `farine de seigle`, lists `rye flour`, and notes that light and dark rye flours differ. This packet accepts only the general identity and names.
- **S02 — AGROBIO, 2023 product catalog:** [Canadian Québec product catalog (PDF)](https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf). A Québec-grown rye product is labeled `FARINE DE SEIGLE` / `ORGANIC RYE FLOUR`. Its organic, milling, and nutrition claims are not imported.
- **S03 — La Milanaise, organic whole rye flour:** [Québec mill product page](https://lamilanaise.com/produits/farine-de-seigle-entiere-biologique-la-milanaise/). Confirms a whole-rye product qualifier in Québec; no whole-grain or product-specific numeric values are added to the general row.

## Integration and verification

- Added `ingredient-ref-rye-flour` to the canonical seed and evidence ledger as an identity-only reference with identity state `verified`.
- The reference JSON has 302 rows (SHA-256 `f3b10cbe28cee065a339bc215e617a0217322d451d4e24dc6cf370cad3063a41`); the evidence ledger has 452 records (SHA-256 `4281b713779da258a08b98ea7a83d220f17ab713c6bb324c03aaa765897feacb`).
- `:app:testDebugUnitTest` passed all 201 tests. Pixel 9a / Android 16 instrumentation reported 26 cases: 24 passed, zero failures/errors, and two environment-gated skips.
- All 9 Python seed-package tests, reference/package normalization and validation, generated-index freshness, ledger schema and alias-collision checks, UTF-8/no-BOM checks across 124 bundled JSON files, and `git diff --check` passed.
- The deploy script's `test` and `:app:assembleDebug` tasks passed; the APK installed and launched on the Pixel 9a emulator.
- Live picker searches `rye flour` and `farine de seigle` each returned only `rye flour`. The empty probe was dismissed without saving, and the home list still showed 114 recipes.
- Screenshots: `pixel9a-rye-flour-picker.png` and `pixel9a-farine-de-seigle-picker.png` in this directory.

## Remaining work

- Obtain independent bilingual Québec French review of the display and identity boundary.
- Review useful rye extraction/grind classes, pumpernickel meal, and the other A4 cereal flours without collapsing them into rye flour.
