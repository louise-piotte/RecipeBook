# WP03 dried-grape and Agaricus names / WP04 shrimp boundary — 2026-10-09

## Scope and disposition

This integration reviews the [Sultana/dried-grape proposal](../../proposals/wp03-section-m-sultana-raisin-boundary-20261009.md), [Agaricus market-name proposal](../../proposals/wp03-agaricus-market-terms-review-20261009.md), and [fresh shrimp/prawn proposal](../../proposals/wp04-fresh-shrimp-prawn-boundary-review-20261009.md).

It adds three identity-only references. It changes no recipes or recipe links, legacy candidate rows, forms, measurements, yields, conversions, or substitutions.

| Identity | fr-CA / English | Boundary |
|---|---|---|
| Sultana raisins | `raisins sultana` / `sultana raisins` | Only English alias: `sultanas`. Keep golden raisins and `raisin de Smyrne` inactive; keep generic raisins and dried currants separate. |
| Cremini mushroom | `cremini` / `cremini mushroom` | Separate brown Agaricus market product. Keep `champignon café` and `champignon brun` unassigned because those can span the broader brown product class. |
| Portobello mushroom | `champignon portobello` / `portobello mushroom` | Separate market product within *Agaricus bisporus*, with documented spelling variants kept on this row only. |

The unqualified button term remains unresolved: OQLF uses “button mushroom” for the broader cultivated *Agaricus bisporus* group, while Canadian production sources also use “white button” for a narrower product. Unqualified shimeji and porcini stay open. Generic fresh shrimp/prawn remains held because the recipe bundle has no shrimp/prawn line and picker searches would overlap existing dried shrimp and Kapi. Sections M, N, and P remain in progress.

## Evidence and catalog boundaries

The DND dried-fruit purchasing specification and the Codex raisins standard document Sultana and golden wording in context-specific ways; Codex also allows “Golden” to describe bleached raisins. OQLF lists Sultana as one dried-raisin type and places `raisin de Smyrne` across botanical and food-fruit domains. Québec product listings use `raisins sultana`. These sources support a named Sultana product without making every golden-raisin or Smyrna phrase a universal alias. The Sultana evidence and source register are in the proposal. ([DND dried-fruit specification](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-eng.pdf), [Codex Standard for Raisins](https://www.fao.org/input/download/standards/244/CXS_067e.pdf), [OQLF raisin sec](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084076/raisin-sec), [OQLF raisin de Smyrne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297130/raisin-de-smyrne), [MAPAQ Sultana product](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8208065).)

OQLF identifies *champignon de Paris* as *A. bisporus*, describes cremini/crimini as café-coloured, and describes portobello as a larger, more mature café mushroom. Québec, CFIA, Statistics Canada, and DND materials support the shared species and current market distinctions; they do not establish interchangeable names or a universal maturity conversion. ([OQLF champignon de Paris](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869343/champignon-de-paris), [CFIA mushroom list](https://inspection.canada.ca/en/plant-health/invasive-pests-and-plants/directives/horticulture/94-26), [Statistics Canada Mushroom Growers’ Survey](https://www23.statcan.gc.ca/imdb/p3Instr.pl?Function=assembleInstr&Item_Id=1559878&wbdisable=true), [DND mushroom specification](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-11-2018-eng.pdf).)

For shrimp/prawn, the [OQLF crevette entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette) scopes “prawn” as UK usage, while the [CFIA Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) ties common names to listed species. The proposal records the full context review, the recipe scan, and the overlap with current dried-shrimp and Kapi results.

The live normalized-key audit found no exact active-reference, form, legacy, or ledger term owner for the accepted IDs and terms. No candidate phrase appears in the 114 bundled recipes / 1,123 ingredient rows. Recipe 102#7 remains linked to generic raisins; the three `white mushrooms` recipe lines remain generic and were not linked to button or cremini.

A plural `raisins` picker query intentionally returns generic raisins, dried currants, and Sultana raisins. Singular `raisin` remains distinct from the new Sultana row. The tests also ensure that the broader `champignon café` phrase does not resolve to cremini.

## Verification

Package/reference normalization, generated-index freshness, research-ledger validation, alias-collision checks, UTF-8/no-BOM checks, `git diff --check`, all 10 Python seed-package tests, and all 317 Android unit tests passed. The ledger validates with 817 records and no errors. The repository deploy script completed its `test` and debug-assembly tasks, installed the app, and launched it on the API 36 Pixel 9a profile at `emulator-5556`.

English and French picker searches returned the expected localized Sultana, cremini, and portobello rows. The blank unsaved draft was closed without selecting an ingredient; the app returned to the French home showing 114 recipes. Both language home screenshots are included below. Screenshots show query text and localized results; hashes cover exact PNG bytes and are also listed in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

| Screenshot | Query → displayed result | SHA-256 |
|---|---|---|
| `screenshots/en-sultana.png` | `sultana` → `sultana raisins` | `4d882d375b7ddfd975b31a829b82f349c143f7257cd55417a86766ef39fafb81` |
| `screenshots/en-cremini.png` | `cremini` → `cremini mushroom` | `19e5b3bdc58a5937fc5b3dce1bf157ea77a2d10ab78fac6a304dcb7a0a8c3f73` |
| `screenshots/en-portabella.png` | `portabella` → `portobello mushroom` | `1db3bc8747cca17e5c0349bf7de1f27104ce4e5495e09231d3dc2d1f5cef1a1d` |
| `screenshots/fr-sultanas.png` | `sultanas` → `raisins sultana` | `32fafb4414b82aeac748cafc26da332c8619718f325baf690c75e38004796fe2` |
| `screenshots/fr-crimini.png` | `crimini` → `cremini` | `ef84cefcf502ab0a9f77eabaa89fb7e1749b6b416ad1d04e11f1a5905556245b` |
| `screenshots/fr-portabella.png` | `portabella` → `champignon portobello` | `d56f822f717d73d84874853630922be2f2e211862524c893c44fb1d28fd17efc` |
| `screenshots/home-en-restored.png` | English home; 114 recipes | `440754c67c5faa0fda1769f233278af52017f637adefa203325c6acc85748d3d` |
| `screenshots/home-fr-restored.png` | French home; 114 recipes | `fe1ec4107c2638b4adf762db4fbb1994078e08e981c07d2d31fcd182cf9a102b` |

## Package snapshot

Hashes are SHA-256 of exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and another NUL byte, in manifest order.

| Data | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 646 | `b78ddd512c3cf5bf77955875035b36610ef6699181963b92a47ef5753d140ce4` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Research ledger | 817 records / 1,388 source entries / 1,166 distinct source IDs | `ca8a3824ff1f0cb8cf522c4430d72184027f5bb93163d83653abca8903b84b58` |
| Legacy candidates | 86 | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The canonical seed package remains the only full-library interchange shape. These additions are identity-only; the catalog plan remains open for remaining fruit products, fungi, seafood, regional names, and evidence-backed measurements and substitutions.
