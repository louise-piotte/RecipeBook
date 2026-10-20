# WP06 Andean tuber identity integration

Date: 2026-10-10  
Status: Three identity-only references, evidence records, regression coverage, and disposable Pixel 9a search QA are complete. Broader Andean tuber coverage and independent Québec terminology review remain open.

Proposal input: [WP06 Andean oca, ulluco, and mashua identity review](../../proposals/wp06-andean-tubers-review-20261009.md).

## Accepted identities

| ID | English display | Proposed fr-CA display | Accepted aliases | Boundary |
|---|---|---|---|---|
| `ingredient-ref-oca` | `oca` | `oca` | none | Edible tuber of *Oxalis tuberosa*. Do not add overlapping regional plant names such as `ruba` or `cubio`. |
| `ingredient-ref-ulluco` | `ulluco` | `ulluque` | EN: `papa lisa`, `melloca` | Edible tuber of *Ullucus tuberosus*; edible leaves remain separate. |
| `ingredient-ref-mashua` | `mashua` | `capucine tubéreuse` | EN: `tuberous nasturtium` | Edible tuber of *Tropaeolum tuberosum*; regional `cubio` and unqualified `nabo` remain inactive. |

All three rows use `VEGETABLE_AND_AROMATIC`, null default density, empty unit mappings, and no `IngredientForm` records. No recipe ingredient line was found in the 114-recipe / 1,123-row package, so no recipe was linked or edited. The ledger records identity evidence, a bounded no-supported-measurement result, and source-limited substitution research. Search-result ratio claims from an unattributed substitution site were retained as rejected leads; they do not create app rules. The exact-name CNF/FDC searches did not surface candidate-specific household portions, densities, or cooking yields.

Independent Québec review remains open for the proposed displays `ulluque` and `capucine tubéreuse`; TERMIUM is a federal terminology source, not a Québec market survey. Oca's shared Colombian vernacular names were excluded from aliases. CIP crop pages distinguish the three crops and edible tubers, but direct retrieval returned 403 during review; their search-indexed content was treated as bounded support, not as a product specification or preparation standard.

## Package snapshot

SHA-256 values cover exact file bytes. The recipe fingerprint covers manifest-ordered relative paths and exact file bytes with NUL separators.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 795 | `ba56d62f2f1e8a0b7cef04714eaca075fbacde76bfeb7020927aa6fe9b08f6fb` |
| Ingredient forms | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Research ledger | 1,021 records / 2,183 source entries / 1,765 source IDs | `936cd1e2ce2867ae360f7ec6842248b214118193493819a08686f920e9d64f8e` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files / 1,123 ingredient rows | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |
| Generated Kotlin catalog | — | `2f643f33a998c8e38078b60f8a24e62dec5ed8e7145128b8ebacb1aa6d1ad50c` |

## Validation and emulator QA

- Seed-package normalization reported no changed parts; ingredient-reference normalization passed; generated-catalog `--check` passed at 795 references; package and research-ledger validation reported zero errors; `git diff --check` passed.
- Python seed-package tests: 26 passed. Android unit tests: 343 passed, 0 failures/errors/skips. The repository deploy script also completed its full `test`, `:app:assembleDebug`, install, and launch stages.
- Seed JSON remained UTF-8 without BOM, with French accents represented as JSON Unicode escapes.
- QA used Android 16 / API 36, Pixel 9a profile, 1080 × 2424 at 420 dpi, serial `emulator-5558`. French searches for `oca`, `ulluque`, and accent-folded `capucine tubereuse` returned the expected localized rows. English searches for `mashua`, `papa lisa`, and `tuberous nasturtium` returned the intended identities. `ruba` and `cubio` returned no reusable ingredients.
- The blank ingredient-manager screen was exited without creating or saving an ingredient. The app returned to the French home showing `Toutes les recettes (114)`.
- The QA profile was a disposable `RecipeBook_QA` AVD under `/tmp`; only that profile was wiped and shut down. The owner Pixel 9a `userdata-qemu.img` SHA-256 was `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` before and after QA. Owner serial `emulator-5554` remained online; no owner app data was touched.

Screenshots are in [`screenshots/`](screenshots/); their SHA-256 values are listed in [`SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Sources and scope limits

- Royal Botanic Gardens, Kew, Plants of the World Online: [*Oxalis tuberosa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:178566-2/general-information), [*Ullucus tuberosus*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:167633-1/general-information), and [*Tropaeolum tuberosum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:310353-2/general-information). Kew accepts the taxa as separate food-use species; it does not establish Québec product labels or substitutions.
- Translation Bureau, TERMIUM Plus: [oca](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=16&i=&index=alt&lang=eng&sg_kp_wet=517514&srchtxt=OCA), [ulluco / ulluque](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=ULLUQUE), and [*Tropaeolum tuberosum*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=64&i=&index=enr&lang=eng&sg_kp_wet=379210&srchtxt=FOURTH). These support the recorded bilingual terms and narrow English aliases, not Québec retail prevalence.
- International Potato Center: [Oca, Ulluco y Mashua](https://cipotato.org/es/raices-y-tuberculos/oca-ulluco-y-mashua/) and [Andean Root and Tuber Crops](https://cipotato.org/genebankcip/process/andean-root-and-tuber-crops-artcs/). Search-indexed crop descriptions support separate crops, tuber use, and ordinary culinary context; direct page retrieval returned 403 during this review.
- The full source-to-claim record, including bounded measurement and substitution searches, is in the proposal and `WP06-ANDEAN-TUBERS-20261009-S01`–`S13` ledger entries.
