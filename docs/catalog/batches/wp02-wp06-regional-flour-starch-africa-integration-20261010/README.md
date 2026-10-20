# WP02 / WP06 regional flour, starch, and Africa identity integration

**Integrated:** 2026-10-10  
**Status:** focused identity batch complete; broader WP02 and WP06 checklists remain open.

## Decisions

### Regional starches

Added four source-bounded `FLOUR_AND_STARCH` references:

| ID | fr-CA display | English display | Evidence boundary |
|---|---|---|---|
| `ingredient-ref-kudzu-starch` | `kouzou` | `kudzu starch` | `kuzu starch` is the only English alias. The older OQLF entry does not identify a species, so botanical scope remains flagged for clarification. No arrowroot crosswalk. |
| `ingredient-ref-sweet-potato-starch` | `fécule de patate douce` | `sweet potato starch` | Extracted starch remains separate from whole sweet potato and sweet-potato flour. |
| `ingredient-ref-mung-bean-starch` | `amidon de haricot mungo` | `mung bean starch` | French display remains provisional: local ingredient wording is attested in finished noodles, not a standalone starch package. Separate from the pulse, flour, and finished cellophane noodles. |
| `ingredient-ref-lotus-root-starch` | `amidon de racine de lotus` | `lotus root starch` | French display remains provisional: Canadian wording appears in a trademark goods declaration. Separate from lotus-root vegetable and flour/powder. |

All four have null density and empty unit mappings. Native and pregelatinized starch are process classes, not source-neutral identities; the research ledger records the boundary without an active reference or global alias. No starch forms, measurements, conversions, yields, recipe links, or substitutions were added. Other B2/B3 candidates remain open.

### African cuisine gap sweep

Integrated eight identity-only rows from a bounded sweep across six regions:

| ID | fr-CA / English display | Search aliases | Category |
|---|---|---|---|
| `ingredient-ref-merguez-sausage` | `merguez` / `merguez sausage` | FR `mergues`, `merghez`; EN `mergues sausage` | `PROTEIN` |
| `ingredient-ref-cassava-leaves` | `feuilles de manioc` / `cassava leaves` | None; prepared names such as pondu and isombe are not global aliases | `VEGETABLE_AND_AROMATIC` |
| `ingredient-ref-safou` | `safou` / `safou` | FR `atanga`, `attanga` | `FRUIT` |
| `ingredient-ref-soumbala` | `soumbala` / `soumbala` | None; dawadawa, iru, afitin, sonru, and nététu remain separate/unresolved names | `SAUCE_AND_CONDIMENT` |
| `ingredient-ref-ogbono-kernels` | `graines d’ogbono` / `ogbono kernels` | None; not mango/fruit, egusi, or a soup identity | `NUT_SEED_AND_DRIED_FRUIT` |
| `ingredient-ref-berbere` | `berbere` / `berbere` | EN `berbere powder` | `BAKING_AND_SPICE` |
| `ingredient-ref-niter-kibbeh` | `niter kibbeh` / `niter kibbeh` | None; distinct from butter and generic ghee | `FAT_AND_OIL` |
| `ingredient-ref-biltong` | `biltong` / `biltong` | None; distinct from jerky, charqui, and cecina | `PROTEIN` |

Matooke remains a ledger candidate because the reviewed name can refer to both an East African highland cooking-banana group and its prepared staple. This sweep is a bounded gap review, not a claim of full African cuisine coverage; Section 05 remains open. No forms, numeric values, conversions, yields, recipe links, or substitutions were added.

### Québec flour terminology

The independent Québec review supports the generic base phrase `farine de blé tendre`, while treating grade-number-country displays as descriptive rather than established Québec terms. Québec products use bare T55/T65 labels, so these queries no longer return the French national-class rows: `farine T55`, `T55`, `French T55 flour`, and their T65 counterparts. The explicit `French type 55/65 flour` and `farine de type 55/65 (France)` wording remains. Short French aliases for Italian type 1 and type 2 were removed because this review found no local product wording for them. Product-specific Tipo 00/T50 language remains product-specific and does not create a class crosswalk.

## Evidence and scope

The integration follows the proposal-only reviews:

- [WP02 regional starches review](../../proposals/wp02-regional-starches-open-gap-review-20261010.md)
- [WP02 Québec wheat-flour terminology review](../../proposals/wp02-regional-wheat-flour-quebec-terminology-review-20261010.md)
- [WP06 African cuisine gap sweep](../../proposals/wp06-african-cuisine-gap-sweep-20261010.md)

The evidence ledger adds source records for the accepted identities and for the held native/pregelatinized and matooke boundaries. Source IDs remain attached to the exact claim they support. The recipe corpus was not edited.

## Artifact snapshot

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 703 references | `424578020c8f6d75f2bd2025f5a6abc17d379d681eaeffcdf8a5ea94e103cc39` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `research-ledger.v1.json` | 892 records; 1,682 source entries; 1,388 distinct source IDs | `cfc06a40c19721554aef2ab8a6ab39dbdd4302cf502907acb5debd28710a70fe` |
| Recipe manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipes | 114 files; 1,123 ingredient rows | fingerprint `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` (unchanged) |

No new active forms, measurement observations, or substitution findings were added for these identities. All changed JSON/docs decode as UTF-8 without BOM; catalog JSON uses explicit Unicode escapes.

## Verification

- Seed-package normalization and validation, ingredient-reference normalization, generated catalog freshness, ledger schema/evidence validation, and `git diff --check` passed.
- All 10 Python seed-package tests passed.
- Android unit tests: 322 passed, 0 failed, 0 skipped.
- Pixel 9a / Android 16 API 36 connected instrumentation on `emulator-5556`: 30 XML cases, 28 passed, 2 skipped, 0 failures/errors. The deploy script's full test and debug assembly stages passed; install and launch succeeded.
- English live picker checks resolved the accepted names and aliases, including `merguez sausage`, `mergues`, `biltong`, `feuilles de manioc`, `atanga`, `graines d ogbono`, `berbere powder`, `niter kibbeh`, `kuzu starch`, `kouzou`, `fecule de patate douce`, `amidon de haricot mungo`, and `amidon de racine de lotus`. The French query `farine de ble tendre de type 55 France` returned the qualified France type-55 row.
- English no-result checks passed for `T55`, `T65`, `farine T55`, `farine T65`, `French T55 flour`, `French T65 flour`, `matooke`, `dawadawa`, and `Japanese arrowroot`.
- In fr-CA mode, searches for `fecule de patate douce`, `feuilles de manioc`, `amidon de haricot mungo`, `graines d ogbono`, `mergues`, `kouzou`, and `niter kibbeh` displayed the correct French labels, including `fécule de patate douce` and `graines d’ogbono`. French no-result checks passed for `T65`, `French T65 flour`, `matooke`, and `dawadawa`.
- The temporary drafts were discarded without saving. The app was left in French on the home screen showing all 114 recipes.

Screenshots and checksums are in [`screenshots/`](screenshots/) and [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).
