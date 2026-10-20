# WP03 Section M citrus, Section N mushroom, and Section P finfish integration — 2026-10-09

## Scope and disposition

This batch integrates bounded recommendations from the [citrus identity review](../../proposals/wp03-citrus-identity-coordinator-review-20261009.md), its [independent Québec terminology follow-up](../../proposals/wp03-citrus-overlap-terminology-independent-review-20261009.md), the [culinary mushroom review](../../proposals/wp03-culinary-mushroom-identities-review-20261009.md), and the [finfish review](../../proposals/wp04-finfish-identity-coordinator-review-20261009.md).

The batch adds and promotes ingredient identities only. It changes no recipe links, forms, densities, unit mappings, package yields, conversions, or substitutions. Named citrus juice, zest, peel, and processed products remain separate work.

## Accepted identities

| Identity | fr-CA / English | Decision and boundary |
|---|---|---|
| Sweet orange | `orange douce` / `orange`; EN alias `sweet orange` | Promoted the existing legacy candidate. Kept separate from bitter orange and orange products. |
| Lemon | `citron` / `lemon` | Existing reference; added OQLF identity evidence. Did not add English `citron` as a lemon alias. |
| Lime | `lime` / `lime`; FR alias `citron vert` | Promoted the existing legacy candidate. Kept variety-unspecified; did not alias `limette`. |
| Grapefruit | `pamplemousse (Citrus paradisi)` / `grapefruit`; FR alias `pomélo (Citrus paradisi)` | Promoted the legacy candidate after independent terminology review. The species-qualified display keeps the Québec term visible. |
| Mandarin | `mandarine` / `mandarin` | Separate from clementine and unqualified tangerine. |
| Clementine | `clémentine` / `clementine` | Kept separate from mandarin and tangerine. |
| True pomelo | `pomélo (Citrus maxima)` / `pomelo`; FR alias `pamplemousse (Citrus maxima)`; EN aliases `pummelo`, `shaddock` | Separate from grapefruit, with qualified French wording. |
| Kumquat | `kumquat` / `kumquat`; EN alias `cumquat` | Kept separate from calamondin and preserved/candied products. |
| Yuzu | `yuzu` / `yuzu` | Same display in both languages; juice and zest remain separate products. |
| Sudachi | `sudachi` / `sudachi` | Retained the Japanese name in both languages; not aliased to yuzu, kabosu, or lime. |
| Calamansi / calamondin | `calamondin` / `calamansi`; FR alias `calamansi`, EN alias `calamondin` | One food identity based on government commodity sources; no separate calamansi/calamondin rows. |
| Citron / cédrat | `cédrat` / `citron (cedrat)`; FR alias `poncire`; EN aliases `etrog`, `esrog`, `ethrog` | Kept distinct from lemon. Bare French `citron` stays on lemon; an English `citron` query can show both localized rows. |
| Bergamot | `bergamote` / `bergamot` | Kept separate from bergamot tea, oil, flavoring, and extract. |
| Finger lime | `lime caviar` / `finger lime`; FR alias `citron-caviar` | Kept distinct from ordinary lime; the alias refers to the fruit, not caviar generally. |
| Bitter orange | `orange amère` / `bitter orange`; aliases `bigarade`, `orange de Séville`, `sour orange`, `Seville orange` | Kept separate from sweet orange, clementine, and orange products. |
| Shiitake mushroom | `shitaké` / `shiitake mushroom` | Added with the Québec term and source-attested spelling variants only. |
| Oyster mushroom | `pleurote en huître` / `oyster mushroom` | Kept distinct from king oyster mushroom. |
| Chanterelle mushroom | `chanterelle` / `chanterelle mushroom` | Added as a distinct mushroom identity; broader `girolle` remains inactive. |
| Morel mushroom | `morille` / `morel mushroom` | Added as a distinct mushroom identity. |
| Atlantic cod | `morue de l’Atlantique` / `Atlantic cod` | Species-qualified; bare `cod` and `morue` were not activated as aliases. |
| Haddock | `églefin` / `haddock`; FR alias `aiglefin` | Kept separate from cod. |
| Atlantic halibut | `flétan de l’Atlantique` / `Atlantic halibut`; FR alias `flétan` | Species-qualified; bare English `halibut` was not activated as an alias. |

The grapefruit and true-pomelo French terms overlap in Québec references. Each shared query—`pamplemousse`, `pomélo`, or `pomelo`—returns both species-qualified picker rows, and the picker selects only the row tapped. The seed validator still sees unique full names and aliases. OQLF’s entries support the shared terminology and distinct species identities ([pomélo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506586/pomelo), [pamplemousse](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506588/pamplemousse)).

The finfish boundary follows the CFIA’s species-linked bilingual common-name guidance. No substitutions or species-general aliases were inferred. The OQLF mushroom entries support the selected Québec names for shiitake, oyster mushroom, and morel; they do not make those mushroom types interchangeable.

## Evidence and unchanged data

Accepted source evidence is stored in `docs/catalog/research-ledger.v1.json` under the stable WP03 M, WP03 N, and WP04 finfish source IDs listed in the coordinator proposals. The grapefruit, pomelo, and cédrat decisions also reuse the directly relevant OQLF entries. Candidate identities not accepted in this batch remain open in the catalog plan.

The three citrus legacy rows for orange, lime, and grapefruit were promoted and removed from the legacy candidate file. The candidate count fell from 94 to 91. The lemon-juice, lime-juice, lemon-zest, and makrut-lime-leaf references remain separate. No recipe row was relinked.

## Verification

Seed-package normalization, generated-index freshness, ledger validation, `git diff --check`, all 10 Python seed-package tests, and `:app:testDebugUnitTest` passed (317 tests). The deploy script installed and launched the build on the Pixel 9a / Android 16 emulator `emulator-5556`.

On the French picker, `pamplemousse` returned `pamplemousse (Citrus paradisi)` and `pomélo (Citrus maxima)`; `citron` showed `cédrat` and lemon’s `citron` row. English mode returned `grapefruit` and `pomelo` for `pamplemousse`. French `haddock` returned `églefin`, English `aiglefin` returned `haddock`, and English `shiitake` returned French `shitaké`. The empty draft was discarded without saving, French was restored, and the home screen showed 114 recipes.

| Screenshot | Query or state | SHA-256 |
|---|---|---|
| `screenshots/citron-vert-fr-picker.png` | French `citron vert` shows lime and lime juice as separate rows | `ace0824ea1e7d8fbfc56d00e88a056e53aa9deaa8da64e6869c8adf196ac9039` |
| `screenshots/pamplemousse-fr-picker.png` | French shared query returns both qualified species rows | `8ee94ef49ea9c7980b4f61871b5b082a1922b72ceb3d370d2a9df0647eff70a3` |
| `screenshots/pamplemousse-en-picker.png` | English labels `grapefruit` and `pomelo` for the shared query | `9aec666039283928528b0007c3f7b03bba69ff201dded42e537a275b6862736f` |
| `screenshots/pomelo-fr-picker.png` | Unaccented French-locale query `pomelo` returns both species rows | `8b242a0da201362724418190d269785c6ef30757d1e28708c01899cc72302178` |
| `screenshots/citron-fr-picker.png` | French `citron` shows distinct cédrat and lemon rows | `c5921cb8c521e7c793d86c5ee4d0ff3416284d12cd063314ab6c7ef54b70c488` |
| `screenshots/shiitake-fr-picker.png` | French `shitaké` result for the English `shiitake` query | `bc72dff92594a0962e2cdf82904705b7eb23636ee681b64f16f646f897b5d385` |

At this batch checkpoint, the package contained 580 references, 33 forms, 755 ledger records / 1,242 source entries / 1,051 distinct source IDs, 91 legacy candidates, and 114 recipes / 1,123 ingredient rows. The checkpoint counts precede the separate Section J identity integration.

## Remaining work

The larger Section M, Section N, and Section P checklist items remain open. Other citrus forms and products, the remaining mushroom species and fungi, species-level finfish coverage, shellfish, and their measurement or substitution research still need separate reviewed batches.
