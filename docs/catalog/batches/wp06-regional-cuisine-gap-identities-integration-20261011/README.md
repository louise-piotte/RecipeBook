# WP06 regional cuisine identity integration — 2026-10-11

## Scope and decisions

Integrated the source-backed decisions from the [East Asia](../../proposals/wp06-east-asia-cuisine-gap-sweep-20261011.md), [South Asia](../../proposals/wp06-south-asia-cuisine-gap-sweep-20261011.md), and [Southeast Asia](../../proposals/wp06-southeast-asia-cuisine-gap-sweep-20261011.md) gap sweeps.

- Promoted the existing `ingredient-ref-five-spice-powder` legacy candidate as `five-spice powder / cinq épices chinoises`, with no aliases. It stays distinct from panch phoron, garam masala, allspice, and Sichuan mala; no regional formula is stored.
- Added `matcha / matcha` with only `thé matcha` as a French alias. Keep it separate from generic green tea, tea powder, flavoured products, mixes, and prepared drinks.
- Added `Indian gooseberry / groseille indienne` with `amla` as an English alias. It stays distinct from `gooseberry / groseille à maquereau`; no bare `gooseberry`, `groseille`, `aonla`, or powder form was added.
- Added `khoya / khoya` with English aliases `khoa` and `mawa`, following the FSSAI product boundary. It remains separate from paneer/chhena, condensed or evaporated milk, ghee, and generic milk solids. Nepalese `khuwa` was not included.
- Added whole dried `anardana / graines entières de grenade anardana` with only `anar dana` as an English alias. It remains separate from fresh pomegranate, fresh arils/seeds, pomegranate molasses, and unrelated souring ingredients.
- Added `Thai basil / basilic thaï` as a herb, with no species or cultivar inference.
- Added `Vietnamese coriander / coriandre vietnamienne` as a separate *Persicaria odorata* identity. `rau ram`, `rau răm`, and `renouée odorante` stay out of locale alias fields pending a language-field review; cilantro and culantro remain distinct.
- Added `yardlong bean / dolique asperge`. Active aliases are limited to OQLF-listed English and French synonyms. The exact recipe phrase `haricots kilomètres` remains evidence only; common green beans and generic cowpea remain distinct.
- Added `toasted rice powder / poudre de riz rôti` with `khao khua` as an English search alias. It remains separate from raw/glutinous rice, rice flour, glutinous rice flour, and roasted red rice flour.

The three regional reviews found no exact bundled ingredient-line demand for these nine identities. Green papaya and Thai eggplant remain qualified source recipe variants of existing papaya and eggplant. No recipe text, links, quantities, forms, densities, unit mappings, measurements, yields, conversions, or substitution rules changed.

Kokum remains unresolved after the South Asia sweep; no kokum/Garcinia identity was added. Goraka also remains unresolved because its species and edible product part are not yet corroborated. The East, South, and Southeast Asia coverage checklists remain open beyond these bounded samples.

## Evidence and records

Source details and accepted decisions are recorded in the [research ledger](../../research-ledger.v1.json). Local evidence and dispositions are in the three linked proposal packets. Root review confirmed the [OQLF dolique asperge entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082968/dolique-asperge), including its distinction from common green beans, and added a Québec fresh-amla listing as supplemental evidence for `groseille indienne`.

## Verification

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check` passed; the package was already normalized.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 922 references.
- `validate_research_ledger()` passed with 1,180 records and no errors; targeted UTF-8/no-BOM checks and `git diff --check` passed for the batch files.
- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: 80 tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon`: 395 tests passed, 0 failed.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon --console=plain`: 37 XML cases on Pixel 9a / Android 16 (API 36), 35 passed, 2 skipped, 0 failed, and 0 errors.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5560 ./tools/deploy_to_pixel9a_emulator.sh`: test and assemble steps passed; the debug APK installed and MainActivity launched.
- Pixel picker QA confirmed all nine English searches and all nine French searches return their intended catalog identities, including `amla`, `mawa`, `anar dana`, `khao khua`, `coriandre`, and `dolique asperge`. The French `rau ram` query had no result, and `groseille à maquereau` remained distinct from `groseille indienne`.
- The temporary unsaved recipe draft was discarded. French home returned to `Toutes les recettes (114)`.
- The original owner AVD `userdata-qemu.img` SHA-256 remained `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997`; app QA used the disposable `RecipeBook_Pixel_9a_QA` clone.
- Package checkpoint: 922 references, 51 forms, 114 recipes / 1,123 ingredient rows, 1,180 ledger records / 3,130 source entries / 2,532 distinct source IDs, and 76 legacy candidates. Reference JSON SHA-256: `17a99acc6db95a1402dbb46f609ce971d1337c33381bb9a301801b2909b3a24b`; ledger SHA-256: `6709375017ea198cefd1a16243dfe5af7f8f253a59024884b6be3ba4b222b9e4`.

## Screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English five-spice powder | [picker-en-five-spice-powder.png](screenshots/picker-en-five-spice-powder.png) | `d662e33232516c6a34545d91d8e83bf03a5a6a41882cbf1a35fda8772ef6d416` |
| English matcha | [picker-en-matcha.png](screenshots/picker-en-matcha.png) | `084a906c60cff7abbdd9bb6a2d1815845fc24e9d589b1628bd4b6487db81661a` |
| English Indian gooseberry / amla | [picker-en-indian-gooseberry-amla.png](screenshots/picker-en-indian-gooseberry-amla.png) | `72e0fc5567aefd6fd4bf25524433640ecce4ec4e678bfe8a20ae26a8a73813ac` |
| English khoya | [picker-en-khoya.png](screenshots/picker-en-khoya.png) | `2ddae9f143b30c439f2e640a1dfdef96e44ce04c896c0339e741a2fd6bb59354` |
| English anardana | [picker-en-anardana.png](screenshots/picker-en-anardana.png) | `417baeaaca561af525fc22c57977daf6b92f7de56b25109734688d28673d370a` |
| English Thai basil | [picker-en-thai-basil.png](screenshots/picker-en-thai-basil.png) | `3d93515205ea51ae31ef0de95384d48952fc8b30c578a2635e368453e66681f0` |
| English Vietnamese coriander | [picker-en-vietnamese-coriander.png](screenshots/picker-en-vietnamese-coriander.png) | `38002505dc15965960932ed36d91ca2029d2f3cee391524b9a0eda6f4f1e6d52` |
| English yardlong bean | [picker-en-yardlong-bean.png](screenshots/picker-en-yardlong-bean.png) | `50a5fb290c9499a74e0e4d0e228f0f933ae2f58b7944430f7e41a861d840b587` |
| English toasted rice powder | [picker-en-toasted-rice-powder.png](screenshots/picker-en-toasted-rice-powder.png) | `2d6372a3d4526268501b675e6dcaea3fa3457b99bb5b6554eeb44e9be2fa67c9` |
| French cinq épices chinoises | [picker-fr-five-spice-powder.png](screenshots/picker-fr-five-spice-powder.png) | `b0593a066b5bdcddb40556a8ac9b5258ccf9e7d0e8e53c96dd429b92bf29a41a` |
| French matcha | [picker-fr-matcha.png](screenshots/picker-fr-matcha.png) | `efd725adb6c7ad6ee20a2561848855ab4db56c2c9f2d41b2d7e8a42d8fcc3668` |
| French groseille indienne | [picker-fr-indian-gooseberry-amla.png](screenshots/picker-fr-indian-gooseberry-amla.png) | `8d6647f5d02e454ca88fe6de4c73c8dfa8517b5039aaea48cd70c16b0f8571e9` |
| French khoya | [picker-fr-khoya.png](screenshots/picker-fr-khoya.png) | `704c7c884414b27e5c07d5101009e9d5aa226f883b2c4b75b89739f1cb719cb0` |
| French graines entières de grenade anardana | [picker-fr-anardana.png](screenshots/picker-fr-anardana.png) | `f8830be688bdfb3aecbc7c4038b93b3186836d51ad20e3dd1dd9499240a713b9` |
| French basilic thaï | [picker-fr-thai-basil.png](screenshots/picker-fr-thai-basil.png) | `1b866f891c4b093c4d01da66ec43acfacabfdaf220a95997352a8bfe2e75ff96` |
| French coriandre vietnamienne | [picker-fr-vietnamese-coriander.png](screenshots/picker-fr-vietnamese-coriander.png) | `9b86d8fb4879cdab1bc2ea0e189bd944f9c551af5902360a239e7deeec44ef9d` |
| French dolique asperge | [picker-fr-yardlong-bean.png](screenshots/picker-fr-yardlong-bean.png) | `c3145f693264bf791cabc52809b7e7147b3eeeb14003ad3603058ff20c11d376` |
| French poudre de riz rôti | [picker-fr-toasted-rice-powder.png](screenshots/picker-fr-toasted-rice-powder.png) | `98450eab532853522fd8e9d861fc86ae5ece13c0d7e3815023779f2cf1e695c6` |
| French gooseberry boundary | [boundary-fr-gooseberry-maquereau.png](screenshots/boundary-fr-gooseberry-maquereau.png) | `8ae1e26c7dd40fe696ba3198520dcc3966b054d1d24933497ecca5a17ea1e1b4` |
| French home with 114 recipes | [home-fr-114-recipes.png](screenshots/home-fr-114-recipes.png) | `f62262a4f698ab4319e62be7fecd9abaac7185aa6ac0f866969ec8bdaf7182b4` |
