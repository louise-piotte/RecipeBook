# WP03 Section L tomato and cucurbit identity integration — 2026-10-09

## Scope and disposition

This coordinator integration advances the existing Section L review in
[`wp03-tomato-cucurbit-coordinator-review-20261009.md`](../../proposals/wp03-tomato-cucurbit-coordinator-review-20261009.md).
The section remains open: whole/crushed/puréed/passata/sun-dried/oil-packed tomato products,
eggplant types, kabocha, delicata, and the rest of the Section L produce sweep still need review.

The accepted catalog work is identity-only except for the exact canned-diced tomato form named in
recipe 034. No density, unit mapping, package yield, measurement observation, conversion, or
substitution was added.

| Identity or form | fr-CA / English | Evidence and boundary |
|---|---|---|
| Generic tomato aliases | `tomate` / `tomato` added to `tomates` / `tomatoes` | Keep tomato paste, sauce, and named varieties separate; a `tomato` search can return those distinct products together. |
| Cherry tomato | `tomate cerise` / `cherry tomato`; `tomate cocktail` alias | OQLF source S02. |
| Plum tomato | `tomate prune` / `plum tomato`; `tomate oblongue`, `tomate allongée`, and Québec `tomate italienne` aliases | OQLF source S03; remains distinct from generic and cherry tomato. |
| Tomatillo | `tomatille` / `tomatillo`; `alkékenge du Mexique` alias | OQLF source S08; never mapped to green/unripe tomato. |
| Eggplant | `aubergine` / `eggplant` | OQLF source S09; named subtypes remain open. |
| Cucumber | Existing `concombre` / `cucumber` identity verified | OQLF source S10; no cultivar forms inferred. |
| Zucchini | `courgette` / `zucchini`; existing legacy candidate promoted in place | OQLF source S11. |
| Summer squash | `courge d’été` / `summer squash` | OQLF source S12; modeled as a broad class, not an alias of zucchini. |
| Pumpkin | `citrouille` / `pumpkin` | OQLF source S17; kept separate from pumpkin spice and not aliased to `potiron`. |
| Butternut squash | `courge butternut` / `butternut squash`; legacy candidate promoted in place | OQLF source S14; replaced the misleading legacy French display `courge musquée`. |
| Acorn squash | `courge poivrée` / `acorn squash`; `courgeron` and `pepper squash` aliases | OQLF source S15. |
| Spaghetti squash | `courge spaghetti` / `spaghetti squash` | OQLF source S16; no pasta alias. |
| Canned diced tomatoes | Form `tomates en dés en conserve` / `canned diced tomatoes` under generic tomatoes | CFIA sources S04–S05 support the canned product and diced presentation. Recipe 034#8 now links this form; its text, amount, unit, and preparation remain unchanged. |
| Tomato paste | Existing `pâte de tomates` / `tomato paste` identity verified | OQLF source S06; kept separate from purée, pulp, sauce, and generic tomato. |

The source map and limitations are documented in the linked coordinator proposal. Integrated evidence
is also stored in `docs/catalog/research-ledger.v1.json` under the stable IDs
`WP03-TC-20261009-S01`–`S17` (only sources attached to accepted rows are included).

## Exact checks

The catalog unit test covers English/French picker terms, keeps tomatillo outside tomato search,
preserves the separate pumpkin-spice result, and confirms every added identity has null density and
no unit mappings. The seed-package test verifies that the chili recipe retains its original 798 ml
line and points to the canned-diced form under `ingredient-ref-tomatoes`.

## Package audit

The package moved from 543 references / 32 forms / 722 ledger records / 96 legacy candidates to the
following verified state. Promoting zucchini and butternut legacy identities accounts for the two
candidate removals. The recipe corpus remains 114 recipes / 1,123 ingredient rows.

| Artifact | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 553 | `ef0e0b74cff528390443d3d6f5ea4dbe164b6bc31901be3df4ee01ddbeac9af4` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Manifest recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 731 records / 1,193 source entries / 1,007 source IDs | `7a8ca099dd119fba800c0c3d3f3ef27ecc31bbd02b4e5f3fd911a1c31fb8220f` |
| Legacy candidates | 94 | `1421628350323bd7c3fbf2dc566073cfc602f3dc6ff054b44aca3034680e69b5` |

UTF-8 without BOM was retained for the changed bundled JSON. Seed-package and reference
normalization, generated-index freshness, research-ledger validation, `git diff --check`, and all
10 Python seed-package tests passed. `:app:testDebugUnitTest` passed all 317 tests.

## Pixel 9a / Android 16 verification

The deploy script installed and launched the fresh build on `emulator-5556`. English `tomato` search
returned generic tomatoes, cherry tomato, plum tomato, tomato paste, and tomato sauce. French
`tomate` search returned the generic tomatoes, cherry tomato, plum tomato, and tomato sauce.
The separate unit test confirms that `tomatillo` is not pulled into the English `tomato` search,
and that pumpkin spice stays separate from pumpkin. The existing French `courgeron` search returned
`courge poivrée`.

The 31-case Android instrumentation run had 27 passes, two skips, and two Espresso window-focus
timeouts while Android System UI was unresponsive. After rebooting the emulator, both failed test
methods passed when rerun individually. The draft used for picker checks was discarded; the French
home was restored with 114 recipes.

| Screenshot | Query or state | SHA-256 |
|---|---|---|
| `screenshots/wp03-en-tomato-picker.png` | English `tomato` | `1c286afd656e579b96cf9a576bae464819fb2b67b7cfec6386a4a993619f97e3` |
| `screenshots/wp03-fr-tomato-picker.png` | French `tomate` | `686705492a60d846586d7b03b29a3aff33c184c0c9caf02d322fbe6acb496baf` |
| `screenshots/wp03-fr-courgeron.png` | French `courgeron` → `courge poivrée` | `e66d1bd019bd4e284c9a30ffba15925da5e5dbceffff5366881eb6569f2001ac` |
| `screenshots/wp03-fresh-home-en.png` | English home, 114 recipes | `ca9ece58a7b24ca69bc94a6465b923e3976806220941c1b74285c5115fd77dde` |
| `screenshots/wp03-home-fr-114.png` | Restored French home, 114 recipes | `e78a734cf0b19dc1d17102d5717c8be0257d2b25551591313be9275fb1166f9a` |

## Remaining work

The Section L parent checklist remains open. Tomato whole/crushed/puréed/passata/sun-dried/oil-packed
products, eggplant subtypes, kabocha, delicata, and the remaining produce sweep still need review.
The separate gourds/okra proposal is tracked in
[`wp03-gourds-okra-identity-coordinator-review-20261009.md`](../../proposals/wp03-gourds-okra-identity-coordinator-review-20261009.md).
