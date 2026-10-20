# WP03 citrus and sea vegetables / WP04 squid integration — 2026-10-10

## Reviewed proposals

This checkpoint integrates the [citrus product review](../../proposals/wp03-citrus-products-boundary-review-20261009.md), [sea-vegetable boundary review](../../proposals/wp03-sea-vegetables-algae-product-boundaries-20261009.md), and [mollusk and cephalopod review](../../proposals/wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md). Their source registers contain the full evidence trail. The review used OQLF entries for Québec terms including [zeste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497908/zeste), [wakamé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8394948/wakame), [main-de-mer palmée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26511888/main-de-mer-palmee), and [calmar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar), plus Fisheries and Oceans Canada’s [2025 Québec seaweed guide](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-13-2025-fra.pdf) and [English guide](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-13-2025-eng.pdf). The mollusk review also reuses the already-ledgered OQLF source `WP04-S38` for the English equivalent `squid`.

## Decisions

| Catalog change | fr-CA / English | Boundary |
|---|---|---|
| Add citrus zest | `zeste d’agrumes` / `citrus zest` | General cross-citrus product, separate from lemon zest. Recipe 111#5 still has its optional grouped-aromatics wording and remains unlinked. |
| Add nori | `nori` / `nori` | OQLF’s pressed, dried product from *Porphyra* varieties; aliases `laitue pourpre` and `purple laver`. No separate form or hydration yield. |
| Add kombu | `kombu` / `kombu` | `konbu` spelling alias in both languages; not a generic kelp identity. |
| Add arame | `aramé` / `arame` | Keep separate from kombu and generic kelp. |
| Add sea lettuce | `laitue de mer` / `sea lettuce` | Keep separate from the broader aonori/aosa market wording. |
| Add dulse | `main-de-mer palmée` / `dulse` | Do not activate regionally ambiguous `petit goémon`. |
| Add Japanese wakame | `wakamé` / `wakame` | Scoped to OQLF’s *Undaria pinnatifida* identity. |
| Add Atlantic wakame | `alarie succulente` / `winged kelp` | Qualified aliases: `wakamé atlantique`, `Atlantic wakame`, and `dabberlocks`; kept separate from Japanese wakame. |
| Update calamari | `calmar` / `calamari` | Add English alias `squid` to the existing identity only. Keep `encornet` and `encornets` inactive. |

Generic kelp, aonori, and sea grapes remain unresolved. Generic crab, lobster, crayfish, langoustine, mussel, clam, fresh oyster, scallop, cuttlefish, and octopus also remain held; preserve the existing dried-seafood, sauce, mushroom, and grade-specific crab identities. Sections M, N, and P remain open.

These additions are identity-only. No recipe rows or links, forms, quantities, densities, unit mappings, yields, conversions, or substitutions changed. The only related recipe wording is the existing optional citrus-zest note in 111#5; no product-specific citrus line or quantity was inferred.

## Search behavior

Pixel 9a / Android 16 picker checks used a clean app data store so the installed app loaded the current canonical seed. English searches returned `nori`, `citrus zest`, `squid` → `calamari`, and `Atlantic wakame` → `winged kelp`. French searches returned `laitue de mer`, `main-de-mer palmée` → `main-de-mer palmée`, and `zeste` → `zeste d’agrumes` alongside the existing `zeste de citron`.

A bare `wakame` query intentionally displays both `wakamé` and `alarie succulente`: the picker searches full words across aliases, so the qualified Atlantic name remains discoverable without collapsing the two identities. A `kelp` query can also find `winged kelp`; that broad-word result does not create a generic kelp identity. No row was selected and the blank draft was discarded.

## Verification

- Bundled seed-package normalization, ingredient-reference normalization, and generated-index freshness checks passed. The generated Kotlin index contains 654 references.
- The research ledger validates with 838 records and zero errors. All 10 Python seed-package tests and all 317 Android unit tests passed.
- `tools/deploy_to_pixel9a_emulator.sh` completed its test/build/install/launch flow on the Pixel 9a / Android 16 emulator `emulator-5556`. After resetting only the emulator app data to load the current seed, the library contained 114 recipes.
- English and French picker checks above passed. The draft was discarded, and the final French home shows `Toutes les recettes (114)`.

Screenshots show the query and localized result; exact PNG SHA-256 values are recorded in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

| Screenshot | Query → visible result |
|---|---|
| `screenshots/picker-en-nori.png` | `nori` → `nori` |
| `screenshots/picker-en-citrus-zest.png` | `citrus zest` → `citrus zest` |
| `screenshots/picker-en-squid.png` | `squid` → `calamari` |
| `screenshots/picker-en-atlantic-wakame.png` | `Atlantic wakame` → `winged kelp` |
| `screenshots/picker-fr-wakame.png` | `wakame` → `wakamé`; `alarie succulente` |
| `screenshots/picker-fr-laitue-de-mer.png` | `laitue de mer` → `laitue de mer` |
| `screenshots/picker-fr-main-de-mer-palmee.png` | `main-de-mer palmee` → `main-de-mer palmée` |
| `screenshots/picker-fr-zeste.png` | `zeste` → `zeste d’agrumes`; `zeste de citron` |
| `screenshots/home-en-restored.png` | English home; 114 recipes |
| `screenshots/home-final-fr.png` | French home; 114 recipes |

## Package snapshot

Hashes cover exact file bytes. The recipe-corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order.

| Data | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 654 | `7ea212dc45e6c03d47826ac3bbd44e87171492e26aeef1d71e341836109ace3f` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Research ledger | 838 records / 1,430 source entries / 1,197 distinct source IDs | `3fb50a7a1b31678ea02d67d861e92a001e63152e79d473a55a32b188ea9df063` |
| Legacy candidates | 86 | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The canonical split seed package remains the sole full-library interchange format. Broad Section M/N/P coverage, independent Québec terminology review, and evidence-backed measurement and substitution work remain active.
