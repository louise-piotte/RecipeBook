# WP03 dried-fruit, WP03 fungi, and WP04 finfish follow-up — 2026-10-09

## Scope and disposition

This batch integrates reviewed subsets from the [dried-fruit product review](../../proposals/wp03-dried-fruit-products-next-review-20261009.md), [culinary-fungi follow-up](../../proposals/wp03-other-culinary-fungi-followup-20261009.md), and [pollock/mackerel species-boundary review](../../proposals/wp04-pollock-mackerel-species-boundary-review-20261009.md). The proposal packets hold the full source notes and candidate-by-candidate decisions.

The batch adds 12 identity-only references and two English aliases to the existing dried tart-cherries reference. It changes no recipe links, forms, densities, unit mappings, yields, conversions, measurements, or substitutions. No legacy candidates were promoted.

## Accepted identities

| Identity | fr-CA / English | Boundary |
|---|---|---|
| Dried barberry | `épine-vinette séchée` / `dried barberry` | Plural aliases only; keep separate from other dried berries. |
| Dried wolfberry | `baie du lyciet séchée` / `dried wolfberry` | Plural aliases only; Goji spellings remain inactive. |
| Dried sweet cherries | `cerises douces séchées` / `dried sweet cherries` | OQLF's `cerise douce` supports the fruit name; `cerises séchées sucrées` could suggest sweetened cherries. |
| Bunashimeji mushroom | `bunashimeji` / `bunashimeji mushroom` | Product-qualified name; bare `shimeji` stays unresolved. |
| Wood ear mushroom | `champignon noir` / `wood ear mushroom` | Genus-level culinary identity; species is unset. |
| Snow fungus | `trémelle blanche` / `snow fungus` | Scoped to *Tremella fuciformis*. |
| Straw mushroom | `volvaire asiatique` / `straw mushroom` | Scoped to *Volvariella volvacea*. |
| Lion’s mane mushroom | `hydne hérisson` / `lion’s mane mushroom` | Culinary market identity without a universal species assignment; supplements, mycelium, extracts, and powders are excluded. |
| Alaska pollock | `goberge de l’Alaska` / `Alaska pollock` | Species-qualified. |
| Atlantic mackerel | `maquereau de l’Atlantique` / `Atlantic mackerel` | Species-qualified. |
| Pacific mackerel | `maquereau du Pacifique` / `Pacific mackerel` | Species-qualified. |
| Spotted Spanish mackerel | `thazard tacheté` / `spotted Spanish mackerel` | Species-qualified. |

The existing dried tart-cherries reference gains only `dried sour cherries` and `dried red tart cherries` as English aliases. Its French display and identity remain unchanged.

## Held boundaries and evidence notes

- Sultana and golden-raisin aliases remain conditional. Goji spellings and generic `dried cherries` remain unresolved.
- Generic shimeji and porcini remain unresolved; the mushroom packet explains the Québec French naming and species boundaries.
- Generic pollock / `goberge`, Atlantic pollock, and generic mackerel / `maquereau` remain unresolved. The fish proposal's spotted Spanish mackerel display is supported by its OQLF S11 citation for `thazard tacheté`; S12 is the separate `thazard` entry used in the king-mackerel boundary discussion.
- OQLF’s [cerise douce entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358079/cerise-douce) supports the clearer French display `cerises douces séchées`. The proposal packets retain the remaining source evidence, including S13 for the Montréal-area Lion’s Mane market name.

## Verification

Seed-package normalization, reference normalization, generated-index freshness, ledger validation, alias-collision checks, UTF-8/no-BOM checks, `git diff --check`, all 10 Python seed-package tests, and all 317 Android unit tests passed. The research ledger validates 813 records with no errors.

The updated app deployed and launched on `emulator-5556`, Android 16 / API 36, using the `RecipeBook_Pixel_9a` profile. English and French picker searches returned the accepted localized rows; the unsaved blank draft was discarded and the French home was restored with 114 recipes. The final home screenshot is `screenshots/home-fr-restored.png`.

The standard `Pixel_9a` AVD (`emulator-5554`) had 419 MB free and rejected installation with `INSTALL_FAILED_INSUFFICIENT_STORAGE`; deployment and UI verification succeeded on the attached Pixel 9a profile at `emulator-5556` without wiping either emulator. On that reused profile, seed loading preserved its pre-existing dried-tart-cherries row, so the two new aliases were verified in the canonical catalog/tests rather than by changing the local row. No migration or compatibility layer was added.

Screenshots show the picker query and localized result. Their filenames reflect query language; the displayed result follows the active app language. SHA-256 values cover exact PNG bytes and are also listed in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

| Screenshot | Query → displayed result | SHA-256 |
|---|---|---|
| `screenshots/en-alaska-pollock.png` | `Alaska pollock` → `Alaska pollock` | `73aa7669ba6b3adc0ae672d84147d7a49c88ff96fa997fd812be3411b4de6060` |
| `screenshots/en-atlantic-mackerel.png` | `Atlantic mackerel` → `Atlantic mackerel` | `b50d511b84def0277d1d21e186d0106ea4180971cd6737275b8a3a48ede5cd3e` |
| `screenshots/en-dried-sweet-cherries.png` | `dried sweet cherries` → `dried sweet cherries` | `86c92a5071ba1608cba0a6cc6d58574df372468ad91d614dd4e2aa4f70e20426` |
| `screenshots/en-dried-wolfberries.png` | `dried wolfberries` → `baie du lyciet séchée` | `ecaef0dd06282139cd3ff2bf5b5251d6708dcdec44c59a1ed2d29d189d411450` |
| `screenshots/en-lions-mane.png` | `lion` → `lion’s mane mushroom` | `41906ac09a82e8f233bf3f89edb77f00ed80300608c5462b4a9860ecd4da8af2` |
| `screenshots/en-snow-fungus.png` | `snow fungus` → `trémelle blanche` | `5ffe9f209a135f20fb4622a6bea84f76bb175b4af3da728b66b8417ab8f3f736` |
| `screenshots/en-spotted-spanish-mackerel.png` | `spotted Spanish mackerel` → `thazard tacheté` | `374c10426a72de4097efa055a4120afe70800d5216b615be4e1634bcb74dcc05` |
| `screenshots/en-straw-mushroom.png` | `straw mushroom` → `volvaire asiatique` | `788884dfc706f6f6f159182cfe77c4bba4c0d1129d94f705084b7972261848d1` |
| `screenshots/en-wood-ear.png` | `wood ear mushroom` → `champignon noir` | `b3ac07ed32f21207bb6dbe6b8822e180d6be15efba5f78e0a84417b4982f8855` |
| `screenshots/fr-dried-barberry.png` | `epine vinette` → `épine-vinette séchée` | `8b9903527af2cc8ce93edb0438b2f3da3847ffd99d297c02c4e840fb7d3004e0` |
| `screenshots/fr-dried-sweet-cherries.png` | `cerises douces` → `cerises douces séchées` | `0c25c4c90cf0df9e08298d9640302518f4eda9ea64555bda579164f52f647c8d` |
| `screenshots/fr-dried-wolfberry.png` | `lyciet` → `baie du lyciet séchée` | `09cbbcadfdc4fc6a50d2378c3fdaf7099aa8de5c3d9ec3eeca9424aeffc85125` |
| `screenshots/fr-lions-mane.png` | `hydne` → `hydne hérisson` | `7fc4527010c561bdd9c4ac05f4f131972e7edcc0ccc32a907de6670fd98b47da` |
| `screenshots/fr-pacific-mackerel.png` | `maquereau du Pacifique` → `maquereau du Pacifique` | `b185ec827236a74249aed8e160fb2a287caf5334325b08d0ebaebf62e3318871` |
| `screenshots/fr-snow-fungus.png` | `tremelle` → `trémelle blanche` | `c4554e404c6f4e6b7c976a6acb0a219a511c5fa501847a257c3f4032b815fadb` |
| `screenshots/fr-spotted-spanish-mackerel.png` | `thazard tachete` → `thazard tacheté` | `d97e02fc39bd2021e84b58a1e88893482c0834b10c3123dc9b68e14b20b124f7` |
| `screenshots/fr-straw-mushroom.png` | `volvaire` → `volvaire asiatique` | `778b625c85939f59352c9086bc143aa926a3b7bcd2f41d41d1a9e5b267aea5e1` |
| `screenshots/home-fr-restored.png` | French home restored; 114 recipes | `e81428ec714c8b6109429d4f9a232192737502c4354b46bbe3ee01fb4edbd15c` |

## Package snapshot

Hashes are SHA-256 of exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a NUL byte, in manifest order.

| Data | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 643 | `e983262f70b8195e83b50eb1b4a205ec0adab7eb3c193e1c31b8fba8f2e6ca18` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Research ledger | 813 records / 1,360 source entries / 1,150 distinct source IDs | `0f3b91d066acb2a4149b13e079deea12dd0235db403865d73fffb2c8ec2749c0` |
| Legacy candidates | 86 | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

Sections M, N, and P remain open for the unresolved dried-fruit products, fungal identities and forms, fish and seafood species, regional naming, and evidence-backed measurement and substitution work.
