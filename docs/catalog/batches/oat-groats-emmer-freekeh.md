# WP03 oat groats, emmer wheat, and freekeh

Integration checkpoint, 2026-10-06. This batch adds three grain identities to the canonical split
seed package. The plan and shared source register are in
[`plant-grains-cereals.md`](plant-grains-cereals.md).

## Integrated rows

| ID | English display | fr-CA display | Category | Boundary |
| --- | --- | --- | --- | --- |
| `ingredient-ref-oat-groats` | oat groats | gruau d'avoine entier | `GRAIN_AND_CEREAL` | Whole oat kernel after hull removal; separate from steel-cut, rolled, quick, and instant oats. |
| `ingredient-ref-emmer-grain` | emmer wheat | blé amidonnier | `GRAIN_AND_CEREAL` | Species-specific grain identity; separate from emmer flour, spelt, and einkorn. |
| `ingredient-ref-freekeh` | freekeh | freekeh | `GRAIN_AND_CEREAL` | Immature wheat that is roasted and crushed; separate from raw green wheat, bulgur, and cracked mature wheat. |

All three rows are identity-only. They have no aliases, forms, density, unit mappings, yields,
conversions, measurements, or substitutions.

CFIA defines oat groats as oat kernels with the inedible hull removed and distinguishes whole groats
from steel-cut, rolled, quick, and instant products. Its French survey uses *gruau d'avoine entier*
for whole groats. The full French qualifier is retained because OQLF's unqualified *gruau* is a
cooked oatmeal dish. TERMIUM standardizes `emmer wheat / blé amidonnier`; its separate farro entry
warns that *farro* can cover einkorn, emmer, and spelt. TERMIUM defines freekeh as immature wheat
that is roasted and crushed, and retains the masculine French form *freekeh*.

## Candidates kept open

- At this 2026-10-06 checkpoint, `ingredient-ref-instant-oats` remained a `needs_clarification`
  ledger candidate. The 2026-10-07 follow-up promoted it in place as a separate identity for plain
  instant flakes; it is not an alias of `ingredient-ref-quick-oats`. See
  `instant-oats-puffed-rice-identities.md`.
  The identity-versus-form choice and Québec French display remain open.
- `ingredient-ref-farro` remains a `needs_clarification` ledger candidate. Unqualified `farro` is
  not an active alias on emmer grain or emmer flour because the name can refer to multiple wheat
  species.
- Independent Québec French review remains open for *gruau d'avoine entier*, the existing quick-oats
  wording, *blé amidonnier*, and other Section F displays.

## Recipe and catalog checks

The 114 bundled recipe files were scanned for oat-groat, emmer, freekeh, farro, instant-oat, broken-
rice, wheat-berry, and steel-cut-oat terms at this checkpoint. No matches were found, so no recipe
line changed. At that time `farro`, `instant oats`, and discouraged *avoine épointée* did not return
the active rows. The later instant-oats search result and full bilingual display audit are recorded
in `instant-oats-puffed-rice-identities.md`.

- Seed reference count: 347; SHA-256 `e93f731b87e5b08c2fdcaa6802518d29220e0516a90ec40f4f331e1a657d8f73`.
- Evidence ledger count: 506; SHA-256 `9fe733df985ccc10879980409f9b32ebac0d7a458d757ffc0eb974d989d1b7d5`.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Package validation, normalized-state checks, generated catalog freshness, and all 9 Python package
  tests pass. The Android unit suite passes with 247 tests.
- The UTF-8 audit found no BOM or raw non-ASCII bytes in the reference JSON or research ledger. The
  grain packet source register contains unique IDs S1–S72; the recipe audit found 0 matching files.

## Pixel 9a verification

The deployed Android 16 / Pixel 9a picker showed these single-result English and fr-CA searches:

- `oat groats` → **oat groats**; `gruau d` → **gruau d'avoine entier**.
- `emmer wheat` → **emmer wheat**; accent-folded `ble amidonnier` → **blé amidonnier**.
- `freekeh` → **freekeh** in both locales.

The temporary recipe was discarded and the French home screen returned to **Toutes les recettes
(114)**. The install first failed with insufficient emulator storage. Recovery required uninstalling
RecipeBook, which cleared emulator-local app data; deployment then succeeded and the bundled library
was reseeded. No repository or user recipe data was cleared.

Screenshots:

- English pickers: [`oat groats`](pixel9a-oat-groats-picker-en.png), [`emmer wheat`](pixel9a-emmer-wheat-picker-en.png), [`freekeh`](pixel9a-freekeh-picker-en.png).
- fr-CA pickers: [`gruau d'avoine entier`](pixel9a-oat-groats-picker-fr-ca.png), [`blé amidonnier`](pixel9a-emmer-wheat-picker-fr-ca.png), [`freekeh`](pixel9a-freekeh-picker-fr-ca.png).
- Restored home: [`114 French recipes`](pixel9a-oat-groats-emmer-freekeh-home-fr-ca-114.png).

## Source basis

- [CFIA, Bacterial Pathogens and Indicators in Oats (English)](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/testing-reports-and-journal-articles/april-1-2018-march-31-2020-0) and [French version](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues/1-avril-2018-au-31-mars-2020-0): groat definition and separate oat sample categories.
- [Canadian Grain Commission, Glossary](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/28-glossary/glossary.html): groats are hulled grain kernels.
- [OQLF, *gruau*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau): Québec cooked-oatmeal terminology.
- [Department of National Defence, Food Quality Specifications – Cereal Grain (French)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf): includes whole wheat grains, emmer, and freekeh as food-grain items.
- [TERMIUM Plus, emmer wheat / blé amidonnier](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=1&i=&index=ptb&lang=eng&sg_kp_wet=10423209&srchtxt=CENTEIO), [farro](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=EINKORN), and [freekeh](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?codom2nd_wet=1&consrv_prsent=1&i=1&index=esr&lang=eng&srchtxt=MADRE): standardized species terminology, farro's broad scope, and freekeh processing definition.
