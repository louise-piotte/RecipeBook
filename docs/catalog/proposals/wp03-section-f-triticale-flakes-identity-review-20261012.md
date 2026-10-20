# WP03 Section F: triticale-flakes identity review

- **Status:** Integrated on 2026-10-12. Added the identity-only flakes row and its five source records plus accepted decision; broader Section F work remains open.
- **Date:** 2026-10-12.
- **Scope:** One named preprocessed-grain product, plain triticale flakes, with current Canadian retail evidence and current Québec French ingredient wording.
- **Decision:** Add identity-only `triticale flakes / flocons de triticale` as `ingredient-ref-triticale-flakes` in `GRAIN_AND_CEREAL`. Keep aliases, forms, quantities, measures, recipe links, conversions, yields, and substitutions empty.
- **Source IDs:** `WP03-TRITICALE-FLAKES-20261012-S01` through `S05`. They were proposal-local during review and were added to the new flakes ledger record during integration.

## Why this is a distinct open item

Section F still asks for regional cereal-mix and preprocessed-grain coverage ([plan lines 1930–1944](../../RecipeBook-global-ingredient-catalog-plan.txt#L2023)). A repository-wide search of the current plan, proposals, batch notes, active catalog, forms, legacy identities, ledger, and bundled recipes found no prior focused triticale-flakes identity decision. The recently integrated barley, rye, wheat, spelt, millet, and amaranth flakes do not cover flakes made from the separate active triticale grain identity.

The package already has `ingredient-ref-triticale-grain` as unqualified `triticale / triticale`. A current Ontario mill sells a standalone product titled `Triticale Flakes`; a current Canadian bread ingredient listing names `triticale flakes`; and Québec product records for Canadian-made multigrain foods list the matching ingredient `flocons de triticale` [S01–S03, S05]. This supports a narrow processed-product identity. It does not support equating flakes with whole triticale grain, triticale meal or flour, or a composite cereal mix.

## Proposed identity and boundary

| Field | Recommendation |
| --- | --- |
| ID | `ingredient-ref-triticale-flakes` |
| English display | `triticale flakes` |
| Québec French display | `flocons de triticale` |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | None |
| Forms, density, unit mappings | None; null density and empty mappings |
| Recipe links, measures, conversions, yields, substitutions | None |

Keep the new row separate from `ingredient-ref-triticale-grain`, triticale flour or meal, rye flakes, wheat flakes, malted or brewing products, animal feed, and formulated multigrain foods. In particular, do not add bare `triticale` as an alias to the flakes row: the active grain identity already owns that exact term. The source pages do not establish that every product called triticale flakes uses the same steaming, rolling, roasting, cultivar, or whole-grain process, so none of those details belongs in the general identity.

## Current source evidence

| ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-TRITICALE-FLAKES-20261012-S01` | Arva Flour Mill, Ontario, [Triticale Flakes](https://arvaflourmills.com/products/triticale-flakes-400g), current product page, accessed 2026-10-12. | A Canadian flour mill offers a standalone retail item under the exact English name `Triticale Flakes`. Its page identifies the mill in Arva, Ontario and presents a cart action. It does not provide a flaking process, package serving, recipe direction, or French display. |
| `WP03-TRITICALE-FLAKES-20261012-S02` | Metro, [Country Harvest 14 Grains Sliced Bread](https://www.metro.ca/en/online-grocery/aisles/bread-bakery-products/packaged-bread/whole-wheat-grain/14-grains-sliced-bread/p/063400138711), current Canadian listing, accessed 2026-10-12. | The product is marked Made in Canada and its ingredient declaration includes `triticale flakes` in a whole-grain-and-seed mix. This is a formulated bread ingredient declaration, not a standalone flakes specification or evidence about a general recipe measure. |
| `WP03-TRITICALE-FLAKES-20261012-S03` | Super C, [Pain tranché aux 14 grains Country Harvest](https://www.superc.ca/allees/pains-et-patisseries/pains-emballes/ble-entier-et-cereales/pain-tranche-aux-14-grains/p/063400138711), current French Canadian listing, accessed 2026-10-12. | The matching product number `063400138711` lists `flocons de triticale` in its grain mix. This is product-level Québec French ingredient wording; it does not establish a standalone Québec package or a process specification. The retailer page was available through its indexed listing but refused direct automated page retrieval during this review. |
| `WP03-TRITICALE-FLAKES-20261012-S04` | Office québécois de la langue française, GDT, [triticale](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480832/triticale), accessed 2026-10-12. | Gives French `triticale` as a masculine noun and the English term `triticale`, defining the grain as a wheat–rye hybrid. This supports the base French noun, not a preferred flake compound or processing claim. |
| `WP03-TRITICALE-FLAKES-20261012-S05` | Gouvernement du Québec, Répertoire des aliments québécois, [Boulangerie Grissol Melba Toast Grain Entier 10 Sachets Individuels](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8247419), updated 2026-07-24. | The record identifies a Québec food manufacturer and lists `flocons de triticale` as one ingredient in a multigrain mix. This independently corroborates current Québec food-label wording; it does not establish standalone product availability or a general flaking method. |

The English and French listings for Country Harvest use the same product number [S02–S03]. Together with the standalone Ontario listing [S01], they support the proposed product name pair without promoting the multigrain formulas to aliases. The OQLF entry supports the base term only [S04].

## Exact-key ownership and bundled recipe audit

The pre-integration check used the repository `normalize_search_key` rules (case-folding, Unicode decomposition and accent folding, ligature folding, then punctuation-to-space normalization). Candidate strings were `triticale flakes`, `triticale flake`, `flaked triticale`, `whole triticale flakes`, `triticale grain flakes`, `flocons de triticale`, `flocon de triticale`, `triticale en flocons`, and the proposed ID `ingredient-ref-triticale-flakes`.

| Area | Current result |
| --- | --- |
| Active references | Before integration, the only active triticale reference was `ingredient-ref-triticale-grain`, displayed as `triticale / triticale`, with empty aliases, null density, and empty unit mappings. It owns the exact normalized key `triticale`; no active reference owned the candidate flake ID or exact flake phrases. |
| Forms | The package has 86 forms. No form ID, label, or match term owns or contains a candidate triticale-flakes term. |
| Legacy identities | The 66 legacy candidates contain no exact candidate ID or flake phrase. |
| Research ledger | The current ledger has 1,522 records and 5,174 source entries. Its only triticale record is the five-source active `ingredient-ref-triticale-grain` record; no triticale-flakes ID or exact candidate phrase is present. |
| Manifest recipes | All 114 manifest-listed recipe JSON files were read. The audit covered all 1,123 top-level ingredient rows and full recipe text. There are no triticale mentions, candidate phrase hits, ingredient-reference hits, or rows to relink. |

No recipe demand or transferable numeric behavior follows from the retail and ingredient-list sources. Keep any SKU-specific package amounts or nutrition values out of shared catalog behavior.

## Snapshot recorded for this review

These are pre-integration shared-worktree snapshots captured during this proposal review, not committed-baseline values.

| Artifact | Current count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,222 references, including 108 `GRAIN_AND_CEREAL`; 390,768 bytes | `adc268b4042a99ef804fe37622df5b7879e80b12e334027bf2f3c093c1ef3fa1` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files, 1,123 ingredient rows, 752,942 bytes; manifest-order digest computed from relative path, NUL, file bytes, NUL | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `research-ledger.v1.json` | 1,522 records, 5,179 source entries, 4,242 distinct source IDs; 5,026,594 bytes | `b33869499cd80d2d5ce6ac421dab937fb3a256e913e857b4dbf0c9a4246940c9` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `BundledIngredientCatalog.kt` | 1,222 references; 535,244 bytes | `682fc3b8fa9162e5ccc1ec886a180f7cdf64f94093fb76e528e7bac27f0658d8` |

## Remaining Section F work

This one candidate does not close Section F. The live plan still leaves unqualified farro, generic sushi rice, pearled hominy, pozole corn, generic grits and polenta, dried sweet corn, and remaining puffed-grain candidates unresolved ([plan lines 502–508](../../RecipeBook-global-ingredient-catalog-plan.txt#L502), [1839–1885](../../RecipeBook-global-ingredient-catalog-plan.txt#L1932)). Species-level review still has held brown-top, barnyard, and Sikiya/crab-finger millet candidates, alongside broader grain and Québec terminology work ([plan lines 509–522](../../RecipeBook-global-ingredient-catalog-plan.txt#L509)). The plan also leaves dry/cooked forms open where recipe or measurement needs justify them, and keeps regional cereal-mix and preprocessed-grain coverage open beyond the specific identities already reviewed ([plan lines 1929–1970](../../RecipeBook-global-ingredient-catalog-plan.txt#L2022)).

## Source-ID and file checks

All five `WP03-TRITICALE-FLAKES-20261012-S01`–`S05` identifiers were checked against the shared ledger and existing proposal files before integration; they were unique to this review. This Markdown file is UTF-8 without a BOM.

## Integration record

Added `ingredient-ref-triticale-flakes` as `triticale flakes / flocons de triticale`, with no aliases, forms, recipe links, or numeric behavior. Added the five source entries and accepted decision to its new ledger record. The triticale-grain reference remains unchanged. Static package, reference-normalization, generated-catalog, ledger, exact-key, recipe, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only adds database JSON data and its generated catalog entry. See `docs/catalog/batches/wp03-section-f-triticale-flakes-integration-20261012/README.md`.
