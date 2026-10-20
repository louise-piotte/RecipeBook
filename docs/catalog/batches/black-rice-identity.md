# WP03 black rice identity

- **Reviewed:** 2026-10-07
- **Status:** identity integrated; independent Québec French review remains open.
- **Scope:** generic black rice as an edible grain identity. No state forms, measurements, yields,
  conversions, substitutions, or recipe-link changes are included.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-black-rice` | black rice | riz noir | None | `GRAIN_AND_CEREAL` | Broad color identity. Keep black glutinous rice, named varieties, purple rice, black fonio, and brown rice distinct. Brown milling status can overlap with rice color; no color × milling × cooking-state matrix is created. |

The federal food-quality specification gives the bilingual names *Black Rice / Riz noir* and describes Indonesian black rice and Thai jasmine black rice as examples. The International Rice Research Institute reports black-rice varieties that are both glutinous and non-glutinous. Therefore `black glutinous rice` is not a global alias for this row or for glutinous rice. No aliases, forms, default density, or unit mappings were added.

## Candidate boundaries

- **Black glutinous rice:** a supported rice product, but the black-rice and glutinous characteristics can coexist. Keep it separate from generic black rice and from generic glutinous rice unless a recipe/product needs the combined identity.
- **Purple rice:** the federal specification lists black and purple as separate color descriptors; it does not establish purple rice as one globally stable product identity. Do not add it as an alias based on color wording alone.
- **Brown rice:** a milling distinction that can overlap with color and length; do not form a Cartesian product of rice dimensions.
- **Black fonio:** an unrelated grain already active as `ingredient-ref-black-fonio`.
- **Black-rice vinegar:** the plan's later vinegar sweep includes this product. It is not in the active seed. If activated, the current phrase search will return both the grain and vinegar for the shorter query `black rice` / `riz noir`, so the query result must be reviewed then.

## Recipe and collision audit

The active seed had 360 references before integration and contained no exact normalized display key for `black rice` or `riz noir`. The 114 bundled recipe files contain no black-rice wording. The new row has no aliases, so it does not claim names belonging to black fonio or other rice products. At the current seed snapshot, each full bilingual display query returns the new row. Broad `black` searches may return other black ingredients. An independent audit confirmed the count and exact-key checks and agreed that the federal color list should not be treated as proof of a separate global purple-rice identity.

No recipe was relinked and no quantities changed. Before future integration of black-rice vinegar, reassess the shorter-query overlap documented above.

## Sources

- **WP03-S128 — Government of Canada, [Food Quality Specifications — Rice (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf):** the `Black Rice` section gives the product description and examples Indonesian black rice and Thai jasmine black rice. No product-specific aliases or numeric values are inferred.
- **WP03-S129 — Government of Canada, [Spécifications sur la qualité des aliments — Riz (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf):** the corresponding `Riz noir` section supports the French display wording. The federal bilingual label is not treated as independent Québec synonym approval.
- **WP03-S130 — International Rice Research Institute, [Innovators in rice science](https://ricetoday.irri.org/innovators-in-rice-science/):** documents black-rice variety diversity, including glutinous and non-glutinous kinds; used for the identity boundary only.

## Verification record

Verified 2026-10-07 on Pixel 9a / Android 16 API 36 (1080×2424). The picker returned exactly one row for `black rice` in English and `riz noir` in fr-CA. Screenshots: `pixel9a-black-rice-picker-en.png` (SHA-256 `ab339c62fb4b801f091a5881b9c7375431f2bdbfa0aaceb6a0169877856e1971`) and `pixel9a-black-rice-picker-fr-ca.png` (SHA-256 `115617f3416a58313a90cb295bf25c242a6bf0fdc99dfcbe6e9d49a3d382c403`).

The deployment script passed all 259 Android unit tests and assembled, installed, and launched the debug APK (SHA-256 `a6903d977f4d8d79b6a177cebcb99ae1d6903b6a112aaee6f4f7a7e9c0684079`). Connected Android 16 instrumentation reported 29 tests: 27 passed, 2 environment-gated skips, 0 failures. Seed/package normalization, generated-index and ledger checks, Python package tests, encoding, and diff checks are recorded in the plan checkpoint. The verified seed references file SHA-256 is `0015397c57e243fc720f601834109b60e96b741fa31ece31a17481fb0f095f93`; generated Kotlin index SHA-256 is `7b02f6c4a477683847882683487a66599529f4d122098f12a3bab7703dbe0260`; research ledger SHA-256 is `31a920323e83fab55d5cde21f6616d3a1901cf45892faf0b29ded3ccc2dd4f9b`.

### Cumulative ledger follow-up

Later Section F reviews added scoped edible red-rice evidence and the unresolved polenta boundary. The cumulative ledger now has 529 records and SHA-256 `de8074f7309d14728e1745e2ca7bb6bc2a4845fd67030463375e72de8070c37c`; the 362-reference seed/index hashes above remain the historical black-rice verification snapshot.
