# WP03 Section J onion, fingerroot, and wasabi-root integration — 2026-10-09

## Scope

This batch integrates the five identity-only candidates accepted in the [Section J proposal](../../proposals/wp03-section-j-onion-root-followup-20261009.md): yellow onion, Spanish onion, sweet onion, fingerroot, and wasabi root. All are `VEGETABLE_AND_AROMATIC` references with null density and empty unit mappings. No form, measurement, conversion, yield, substitution, or recipe-link data was added.

## Accepted identities and boundaries

| ID | English | fr-CA | Aliases and boundary |
|---|---|---|---|
| `ingredient-ref-yellow-onion` | yellow onion | oignon jaune | No aliases. The old `yellow onion` alias was removed from the generic onion row; its `gros oignon` French alias remains. |
| `ingredient-ref-spanish-onion` | Spanish onion | oignon d’Espagne | No aliases. Kept distinct from both generic onion and the broad sweet-onion class. |
| `ingredient-ref-sweet-onion` | sweet onion | oignon doux | No aliases. Spanish onion and named sweet cultivars were not merged into this class. |
| `ingredient-ref-fingerroot` | fingerroot | krachai | English alias `Chinese key`; French aliases `kachai`, `krachaï`. `Chinese ginger`, galangal terms, and `petits doigts` remain excluded. Québec French wording is provisional pending independent review. |
| `ingredient-ref-wasabi-root` | wasabi root | racine de wasabi | No aliases. Unqualified `wasabi` can name the plant or its condiment; paste and powder remain separate product work. |

Pearl/pickling onion, spring onion, eddoe, and broad arrowhead remain on hold. Existing oca, ulluco, and mashua recommendations were not duplicated. Four recipe rows have explicit yellow-onion wording and one each explicitly names Spanish and sweet onion, but their links remain unchanged in this identity-only tranche. Other onion and root recipe links are unchanged.

## Evidence

Source records are in `docs/catalog/research-ledger.v1.json` under the WP03 Section J source IDs. OQLF directly supports [yellow onion / oignon jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296971/oignon-jaune), [Spanish onion / oignon d’Espagne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083678/oignon-despagne), and [wasabi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533049/wasabi). Health Canada uses the bilingual name sweet onion / oignon doux. Kew and JIRCAS document fingerroot / Chinese key / krachai; the Québec culinary source records krachai spellings in use locally. The proposal contains the full evidence register and exact source limits.

The generic onion row retains `gros oignon`. In the original emulator profile, an older persisted English alias caused the English query `yellow onion` to show both `onion` and `yellow onion`; the canonical seed and bundled-catalog unit test assign the phrase only to the named identity. The French query `oignon jaune` returned the new row. No stored catalog row was migrated or overwritten, consistent with the pre-MVP data policy.

## Verification

- Package normalization and generated-index freshness pass at 618 references.
- The 317 Android unit tests pass, including exact alias search for `yellow onion`, fingerroot aliases, and wasabi root.
- The updated build was deployed to Pixel 9a / Android 16 emulator `emulator-5556`. English `fingerroot` returned the expected row; English `wasabi root` displayed `racine de wasabi` in French; French `krachai` returned `krachai`; French `wasabi root` displayed `racine de wasabi`; and French `oignon jaune` returned only `oignon jaune`.
- The English yellow-onion screenshot documents the preserved-profile alias described above. A temporary secondary user was removed after its first-run library remained empty. The original profile was restored to French; its recipe home shows 114 recipes. The empty draft was discarded.

| Screenshot | Evidence | SHA-256 |
|---|---|---|
| `screenshots/fingerroot-en-picker.png` | English fingerroot query | `d0ce3a33e73ce5cd5cfa6c860dfd5c1f2749bd9a8efd7f54f2eaedb0bedb0114` |
| `screenshots/krachai-fr-picker.png` | French krachai query and display | `81973797a05d8e74cee32feeaaa583075d508bc48a05ae05f6cd47ff279f6172` |
| `screenshots/wasabi-root-en-picker.png` | English wasabi-root query | `b3f5e363b47d0ff2dc788b54c5f85f7f4e5d6a0c1dd896dfe0bce748f4329355` |
| `screenshots/wasabi-root-fr-picker.png` | English query displayed as French racine de wasabi | `85ce2119c140b38cc1deffdebf112903eb1bf813f0083f404d0e21f7a8b5f60d` |
| `screenshots/yellow-onion-fr-picker.png` | French query returns the named row | `f3b24b4d0bac9d8b59a492e6e3d13bc2c939ef539ce9566c13b18278367b5ad0` |
| `screenshots/yellow-onion-en-existing-profile.png` | Existing local alias also returns generic onion on the English query | `70939b858501bdbbb3b514ff0ca45012ddef945e4c0633ed88da43269c9d80ac` |

At integration time the package contained 585 references (`665c70d107dab7be7c125b91f1555a265782098c23278e71d5d4ed01efb49bd9`), 33 forms (`275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732`), 760 ledger records / 1,251 source entries / 1,060 source IDs (`9a1b3f54b103d3949c5c488902b1d1b651aece7620ffff0a3bb898ce8ef72a1e`), and 91 legacy candidates (`a17f086ab34de2d4c760259ceaed9ad5ed5d4a54030cc6ba8821bb672616edc5`). The later Section M fruit integration brings the shared package to 618 references; its current counts and hashes are in the companion README.
