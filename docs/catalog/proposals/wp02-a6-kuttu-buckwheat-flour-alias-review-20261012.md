# WP02 A6 regional flour naming review: kuttu and buckwheat flour

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12. The three accepted aliases are on the existing buckwheat-flour reference and the five source records plus accepted decision are on its ledger entry; broader A6 coverage remains open.
- **Scope:** Decide whether the source-backed regional flour names `kuttu atta`, `kuttu ka atta`, and `kuttu flour` belong on the existing buckwheat-flour reference.
- **Source IDs:** `WP02-A6-KUTTU-FLOUR-20261012-S01` through `S05`. They were proposal-local during review and were added to the existing buckwheat-flour ledger record during integration.
- **A6 status:** Keep the broad regional-grain-flour checklist open.

## Recommendation

**Recommend adding three English aliases**—`kuttu atta`, `kuttu ka atta`, and `kuttu flour`—to the existing `ingredient-ref-buckwheat-flour`. Do not create a separate kuttu-flour identity. The FSSAI identifies buckwheat flour as “kuttu atta,” and current Canadian retail listings use the paired names `Kuttu Atta` / `Kuttu Flour` and `buckwheat flour` for flour made from buckwheat [S01–S03].

Retain the current display pair `buckwheat flour / farine de sarrasin`. OQLF gives `farine de sarrasin` as the preferred Québec French term, and the Québec Food Directory uses it in a current flour product name [S04–S05]. Add no French aliases: no reviewed Québec or Canadian source uses `farine de kuttu`. Do not add bare `kuttu`, which is a regional name for the source grain, or the title-specific phrase `kuttu flour atta` [S01–S05].

| Wording | Disposition | Boundary |
|---|---|---|
| `kuttu atta` | **Recommend English alias** on `ingredient-ref-buckwheat-flour`. | FSSAI directly pairs `kuttu atta` with buckwheat flour; the current Canadian Tezmart listing also uses it for buckwheat flour. [S01–S02] |
| `kuttu ka atta` | **Recommend English alias** on the same reference. | Tezmart explicitly says buckwheat flour is commonly known by this name in parts of India and describes its listed product as ground buckwheat. [S02] |
| `kuttu flour` | **Recommend English alias** on the same reference. | The current Canadian Swadesh listing equates its Kuttu Flour product with buckwheat flour and says it is made from ground buckwheat seeds. [S03] |
| `buckwheat flour / farine de sarrasin` | Retain as the existing display pair. | Existing catalog identity; Québec terminology and market usage support this French display. [S04–S05] |
| `kuttu` | Keep off the flour row. | FSSAI uses Kuttu as the common name for buckwheat itself; the unqualified source-grain word should not be collapsed into a flour alias. [S01] |
| `kuttu flour atta`; `farine de kuttu`; `farine de kuttu atta` | Do not add. | The first is a retailer’s product-title construction; no Québec/Canadian French source supports the French forms. [S02, S04–S05] |
| New kuttu flour ID, form, or grain reference | Do not create in this proposal. | Evidence resolves the qualified flour wording to the existing buckwheat-flour identity. |

No recipe link, form, measurement, density, conversion, yield, substitution, or other numeric behavior is supported or proposed.

## Naming evidence and Québec boundary

The Food Safety and Standards Authority of India’s 2024 notice refers to “buckwheat whole & flour (kuttu atta)” among food items requiring inspection during the festival period [S01]. This is a regulatory notice, not a milling specification. A current Canadian Tezmart product page titled “Asian Kuttu Flour Atta” says that buckwheat flour is commonly known as `kuttu ka atta` in much of northern and western India, and also calls it `kuttu atta`; it identifies buckwheat as the product’s ground source [S02]. Swadesh Supermarket’s current Canadian listing is titled “Kuttu Flour” and describes it as buckwheat flour made from finely ground buckwheat seeds [S03]. These independent listings support the three exact English search aliases, but do not establish a uniform regional flour process or recipe behavior.

For Québec French, OQLF identifies `farine de sarrasin` as the preferred term and translates it as `buckwheat flour` [S04]. The Québec Food Directory lists a La Milanaise product as `Farine de sarrasin entière biologique` [S05]. Retain the active local display. The sources do not support French forms built from `kuttu`; do not translate the English regional name mechanically.

## Live package, ledger, exact-key, and recipe audit

The read-only audit used the split bundled-seed package, legacy-import candidates, research ledger, generated Kotlin ingredient catalog, and every path in the current seed manifest. Exact normalized-key checks use the project `normalize_search_key` behavior: Unicode NFKD and case-folding, ligature and accent folding, punctuation replacement, and whitespace collapse.

| Surface | Snapshot at audit time | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,222 rows; 386,970 bytes | `a912956b021d756b7e394e0a7f2e8daf6080f10ec07472aade584aaabe5b3b9e` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,522 records; 5,174 source entries; 4,237 distinct source IDs; 5,022,942 bytes | `7284dd1c15b93f24ab68f14d44a36d6aefed5f8e01ef50a7b73313f01d529adc` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | Ordered fingerprint `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1 file; 1,222 generated references; 535,200 bytes | `f944a0bd729531ff5fb68d33c4dbf528edbbad7e5ce53740b5a0c3368cb2a460` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte. File SHA-256 values cover exact bytes.

| Exact normalized key | Current owner |
|---|---|
| `buckwheat flour`; `farine de sarrasin` | `ingredient-ref-buckwheat-flour` |
| `kuttu atta`; `kuttu ka atta`; `kuttu flour`; `kuttu`; `farine de kuttu`; `farine de kuttu atta`; `kuttu flour atta`; proposed IDs `ingredient-ref-kuttu-atta` and `ingredient-ref-kuttu-flour` | None across reference names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, or ledger record IDs |

The live `ingredient-ref-buckwheat-flour` row is verified, has no aliases, `defaultDensity: null`, and `unitMappings: []`. Its ledger record is accepted with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it retains three existing source IDs (`WP02-S25`, `WP02-S26`, `WP02-S31`) and no kuttu alias decision. The existing flour ID is the sole exact owner of the two canonical display keys. The forms file and legacy candidates have no exact owner for the proposed kuttu aliases or IDs.

All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned across every string field for normalized whole-phrase matches for `kuttu atta`, `kuttu ka atta`, `kuttu flour`, `kuttu`, `kuttu flour atta`, `farine de kuttu`, `buckwheat flour`, and `farine de sarrasin`. Result: **zero recipe-file hits and zero ingredient-row hits**; no recipe references `ingredient-ref-buckwheat-flour`. No recipe link is proposed.

## Source register

Sources were checked on 2026-10-12. Retail listings establish current wording, not universal product specifications.

| Source ID | Source and locator | Support and limit |
|---|---|---|
| **WP02-A6-KUTTU-FLOUR-20261012-S01** | Food Safety and Standards Authority of India, [Monitoring the sale of food items during festival season](https://fssai.gov.in/upload/advisories/2024/03/65fd2cad004c7Monitoring%20the%20sale%20of%20food%20items%20during%20festival%20season.pdf), dated 2024-03-21, subject/body. | Calls out “buckwheat whole & flour (kuttu atta)” and directs food-safety monitoring. Supports the flour/name pair; does not set a Canadian name or product process. |
| **WP02-A6-KUTTU-FLOUR-20261012-S02** | Tezmart, Mississauga, [Asian Kuttu Flour Atta](https://tezmart.ca/product/asian-kuttu-flour-atta-112277), current product title and description. | Explicitly describes buckwheat flour as `kuttu ka atta` and `kuttu atta`, and says the product is ground from buckwheat. Retail wording is not a universal milling specification. |
| **WP02-A6-KUTTU-FLOUR-20261012-S03** | Swadesh Supermarket, Ontario, [Kuttu Flour 400g](https://www.swadesh.ca/products/kuttu-flour-400g), current product title and description. | Equates `Kuttu Flour` with buckwheat flour and says it is made from finely ground buckwheat seeds. Retail wording only. |
| **WP02-A6-KUTTU-FLOUR-20261012-S04** | Office québécois de la langue française, [farine de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin), GDT preferred term and English translation. | Directly pairs preferred Québec French `farine de sarrasin` with English `buckwheat flour`. No kuttu term is listed. |
| **WP02-A6-KUTTU-FLOUR-20261012-S05** | Québec Food Directory, [Farine de sarrasin entière biologique](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201450), La Milanaise product sheet, current directory record updated 2026-07-24. | Confirms current Québec product naming with `farine de sarrasin`; its ingredient declaration says organic buckwheat. Package, nutrition, and culinary details are not imported. |

## Disposition

Accepted the three exact English aliases on the existing `ingredient-ref-buckwheat-flour`; retain `buckwheat flour / farine de sarrasin` as the display pair and keep bare `kuttu` off the flour row. Add no new identity, French alias, form, recipe link, measurement, conversion, yield, substitution, or other numeric behavior. This narrow terminology decision does not close broader WP02 A6 coverage.

## Integration record

The accepted English aliases were added to `ingredient-ref-buckwheat-flour`; the French display, empty forms, null density, empty unit mappings, and all recipe files remain unchanged. The five source entries and accepted alias decision were added to the existing `ingredient-ref-buckwheat-flour` record in `docs/catalog/research-ledger.v1.json`. No recipe contains a kuttu or buckwheat-flour ingredient line, so no recipe link was added. Static package, generated-catalog, ledger, exact-key, recipe, UTF-8/no-BOM, and scoped whitespace checks were run. No tests or emulator checks were run; this update only adds database JSON data and its generated catalog entry. See `docs/catalog/batches/wp02-kuttu-buckwheat-alias-integration-20261012/README.md`.
