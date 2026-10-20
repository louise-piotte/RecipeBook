# WP03 dried-fruit, WP03 fungi, and WP04 finfish follow-up — 2026-10-09

## Scope and disposition

This batch integrated the accepted identity-only recommendations from the [dried-fruit review](../../proposals/wp03-dried-fruit-products-review-20261009.md), [culinary mushroom follow-up](../../proposals/wp03-remaining-culinary-mushroom-identities-20261009.md), and [finfish follow-up](../../proposals/wp04-finfish-species-followup-20261009.md). The three proposal packets were checked against the shared baseline of 618 active references, 33 forms, 790 ledger records, 88 legacy candidates, and 114 bundled recipes / 1,123 ingredient rows.

The integration adds 11 identities and promotes two matching legacy candidates. It changes no recipe links, forms, densities, unit mappings, package yields, conversions, or substitutions. It adds no recipe rows or numeric observations.

## Accepted identities

| Identity | fr-CA / English | Aliases and boundary |
|---|---|---|
| Dried apricot | `abricot séché` / `dried apricot` | Promoted the legacy candidate; plural aliases `abricots séchés` / `dried apricots`. |
| Dried fig | `figue sèche` / `dried fig` | Added plural and French spelling variants `figues sèches`, `figues séchées` / `dried figs`. |
| Prune | `pruneau` / `dried prune` | Promoted the legacy candidate and narrowed its English display from `prune`; plural aliases `pruneaux` / `dried prunes`. Bare `prune` is not an alias. |
| Dried dates | `dattes séchées` / `dried dates` | Added singular aliases `datte séchée` / `dried date`. Generic recipe 058#2 remains on generic dates. |
| Dried currants | `raisins de Corinthe séchés` / `dried currants` | Added aliases `raisin de Corinthe` / `dried currant`; this is the dried grape product, distinct from black and red currant berries. |
| Dried tart cherries | `cerises séchées acidulées` / `dried tart cherries` | No aliases added; generic and sweet dried-cherry terms remain open. |
| King oyster mushroom | `pleurote royal` / `king oyster mushroom` | English alias `king oyster`; kept distinct from oyster mushroom. |
| Enoki mushroom | `champignon enoki` / `enoki mushroom` | Plural aliases `champignons enoki` / `enoki mushrooms`. |
| Maitake mushroom | `champignon maitake` / `maitake mushroom` | Aliases `polypore en touffes` / `maitake`. |
| Culinary truffle | `truffe` / `truffle` | No aliases or broader fungal claims added. |
| Rainbow trout | `truite arc-en-ciel` / `rainbow trout` | Species-qualified; no bare trout alias. |
| White hake | `merluche blanche` / `white hake` | Species-qualified; no broader hake alias. |
| Atlantic herring | `hareng de l’Atlantique` / `Atlantic herring` | Species-qualified; no bare herring alias. |

Sultana and golden-raisin terms remain conditional aliases and were not activated. Barberry, goji, generic/sweet dried cherries, dried citrus peel, and candied fruit remain open. Other mushrooms/fungi and fish species remain on the catalog plan. The accepted dried-fruit, fungal, and finfish decisions and source IDs are recorded in `docs/catalog/research-ledger.v1.json`.

Representative source references include the [Canadian dried-fruit specifications in English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-eng.pdf) and [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-16-2018-fra.pdf), and OQLF entries for [figue sèche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10437379/figue-seche), [pruneau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084075/pruneau), and [raisin de Corinthe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298833/raisin-de-corinthe). Mushroom terminology is supported by Aliments du Québec’s [Pleurote Royal](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/pleurote-royal), Health Canada’s [enoki notice in English](https://recalls-rappels.canada.ca/en/alert-recall/imported-raw-enoki-mushrooms-what-you-need-know-safe-food-practices) and [French](https://recalls-rappels.canada.ca/fr/avis-rappel/champignons-enoki-crus-importes-ce-que-vous-devez-savoir-sur-pratiques-salubrite), and the OQLF entry for [truffe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082620/truffe). Fish names follow the OQLF entries for [truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel) and [merluche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199931/merluche), plus Department of Fisheries and Oceans pages for [white hake](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2025/white-hake-merluche-blanche-2025-fra.html) and [Atlantic herring](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2025/herring-4t-hareng-fra.html). The proposal packets retain the complete evidence notes and decisions.

## Verification

Passed seed-package validation (including schema and research-ledger checks), seed-package normalization and check, ingredient-reference normalization and check, generated-index freshness, `git diff --check`, all 10 Python seed-package tests, and `:app:testDebugUnitTest` (317 tests). The deploy script installed and launched the build on Pixel 9a / Android 16 emulator `emulator-5556`.

English and French picker searches returned the expected identities for dried dates, enoki, dried currants, king oyster mushroom, and Atlantic herring. No result was selected. Both empty drafts were discarded, French was restored, and the home still showed 114 recipes.

| Screenshot | Query or state | SHA-256 |
|---|---|---|
| `screenshots/fr-dried-dates.png` | French picker: `dried dates` returns `dattes séchées` | `a856210f9c134764e86a6cafbd42ad2a3a09ca1fc869ab22853c0f9c046d1232` |
| `screenshots/fr-enoki.png` | French picker: `enoki` returns `champignon enoki` | `82d3b93acd8fa9e1f42dcbd4cee8ee7b727d9d9cf16fbc45315cb90657fa8e2e` |
| `screenshots/fr-atlantic-herring.png` | French picker: `hareng` returns `hareng de l’Atlantique` | `1545bc4e1c6d4bcc98d804a77265177066ff22ab4434b158b31520b3265155c9` |
| `screenshots/fr-dried-currants.png` | French picker: `Corinthe` returns `raisins de Corinthe séchés` | `dc4d59a9c1acd0fa73133a15354ac1369b0b3009e978eaa84276fb785da346af` |
| `screenshots/en-atlantic-herring.png` | English picker: `Atlantic herring` returns the species-qualified identity | `aa5362c106e526ab25d5460021233aa4609a3cd61a16f47af9803583b1fce2b8` |
| `screenshots/en-king-oyster.png` | English picker: `king oyster` returns `king oyster mushroom` | `adc803c59754f9df1bd5aaab7b900e6d526a494a3d73e4425b9c3f25296c5563` |
| `screenshots/en-dried-dates.png` | English picker: `dried dates` returns the expected identity | `c736059f9d284a061861cf0b818e6d8c2cd4bfc32d7bf90bdc3273cf0b92b7c2` |
| `screenshots/home-fr-restored.png` | French home after discarding drafts; 114 recipes | `705b10144380e1b104dbf51c6f74ff20e5649ac65bc3a1a0994f9788989e7de1` |

## Package snapshot

Hashes are SHA-256 of exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a NUL byte, in manifest order.

| Data | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 631 | `8935fb3c03acc994f0127d59a2a44c580e93260db8367229c0d9cdb9975dbfe0` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Research ledger | 801 records / 1,321 source entries / 1,119 distinct source IDs | `99448ddaf0ac44ef0b34130634eead1132e41a90ce0f69cada0f60e6a66cba2e` |
| Legacy candidates | 86 | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Seed manifest | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

Sections M, N, and P remain open for the unreviewed fruit products, fungal identities/forms, fish and seafood species, regional naming, and future evidence-backed measurement and substitution work.
