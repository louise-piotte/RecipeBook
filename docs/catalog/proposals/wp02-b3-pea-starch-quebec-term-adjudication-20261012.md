# WP02 B3 pea starch Québec term adjudication

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp02-b3-pea-starch-quebec-terminology-integration-20261012/README.md).
- **Scope:** Resolve the pending Québec French terminology note on the integrated `ingredient-ref-pea-starch` row. This review does not reopen the pea-starch identity, English display, or existing `native pea starch` alias.
- **Recommendation:** **Accept `amidon de pois` as the Québec French display; reject `fécule de pois` as an alias. Add no French alias or new identity.** The integration updates the existing ledger decision’s provisional wording with this bounded terminology conclusion; the active reference row itself needs no change.

## Relation to prior WP02 work

The integrated pea-starch identity review accepted `pea starch / amidon de pois` and the English alias `native pea starch`, while explicitly leaving the French display provisional for an independent Québec terminology review. This proposal addresses only that open note; see [the identity proposal](wp02-b3-pea-starch-identity-review-20261012.md) and [its integration record](../batches/wp02-b3-pea-starch-identity-integration-20261012/README.md). It does not repeat the identity review or settle the wider B2/B3 checklist.

## Pre-integration read-only snapshot

Read on 2026-10-12 before integration. Hashes are SHA-256 over exact file bytes. The recipe digest hashes each manifest-ordered relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte.

| Surface | Current state | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,252 rows | `a67716b92d4129d7ecbd7109e5481787f12b3a479fb6f09769e5cd00e6a3ecf8` |
| Ingredient forms | 94 rows | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy import candidates | 66 rows | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,560 records / 5,434 source entries / 4,472 distinct source IDs | `2e667165a27c6fca16738e7f724b6a2495a8ef12dbc4c4e58528ec7b50764eba` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 753,736 bytes | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

The source-ID prefix `WP02-B3-PEA-STARCH-QUEBEC-TERM-20261012` was checked against the current ledger and proposal/batch files before drafting; no collision was found.

## Exact ownership and picker boundary

Search normalization follows `IngredientSearch.kt`: lowercase, Unicode NFKD, accent folding, punctuation-to-space normalization, and complete word-phrase matching before substring fallback. Singular and plural forms are not stemmed.

| Phrase / identifier | Active reference owner | Form owner | Legacy owner | Ledger status |
|---|---|---|---|---|
| `pea starch` | `ingredient-ref-pea-starch` (`nameEn`) | None | None | Its ingredient-reference record is `ingredient-ref-pea-starch`. |
| `amidon de pois` | `ingredient-ref-pea-starch` (`nameFr`) | None | None | Same identity record; not a second candidate. |
| `native pea starch` | `ingredient-ref-pea-starch` (`aliasesEn`) | None | None | Recorded as the English alias in that identity decision. |
| `fécule de pois` | None | None | None | No exact term owner or dedicated identity record. |
| `amidon natif de pois` / `amidon de pois natif` | None | None | None | No exact term owner or dedicated identity record. |
| `modified pea starch` / `amidon de pois modifié` | None | None | None | No exact term owner or dedicated identity record. |

The pea-starch row currently has `aliasesFr: []`, `defaultDensity: null`, and `unitMappings: []`. No form points to it. The ledger records identity as `verified`; measurement and substitution remain `not_yet_researched`. A separate mung-bean-starch ledger record cites the Montréal vermicelli page as evidence about mung starch; its note only records pea starch as a second ingredient in that finished product, not as a mung-starch synonym or owner.

Current picker results: `pea starch`, `native pea starch`, and `amidon de pois` each return only `ingredient-ref-pea-starch`; `fécule de pois` and `amidon natif de pois` return no result. Broad `amidon` returns seven starch references and `pois` returns 19 pulse/pea-related references, including the target. `pea flour` returns the existing yellow-pea-flour result; `farine de pois` returns three flour results and not pea starch. Accepting the current display keeps these boundaries unchanged. Adding the rejected phrase would make it searchable, but the reviewed terminology does not justify the mapping.

## Québec French wording decision

OQLF’s 2026 GDT entry marks **amidon** as the preferred term for starch generally. It says **fécule** is used in some contexts for starch in plant tubers, or more generally underground plant organs, and gives potato starch as the example. Its note places starch in legumes as well as tubers and cereals. Pea starch is from pea seeds, not an underground organ; applying OQLF’s general distinction supports **amidon de pois** and weighs against a broad `fécule de pois` alias. This is an application of OQLF’s general rule: the entry does not provide a dedicated headword for the exact compound `amidon de pois`. [S01]

A current French SUE Foods listing in Montréal declares `amidon de pois` in a finished bean-thread vermicelli alongside green mung-bean starch and water. This is direct Québec-market wording for a food ingredient, but it is not a package of pure pea starch and gives no grade or amount. [S04] The English AAFC market-analysis page uses `pea starch` for the Canadian packaged-food ingredient category and reproduces product-label examples; it documents market terminology, not a technical standard or current standalone SKU. [S02] NutriPea’s current manufacturer page identifies its Accu-Gel product as pea starch derived from Canadian yellow peas and calls it a native starch, supporting the existing English wording only for that named product. [S03]

| Phrase | Disposition | Boundary |
|---|---|---|
| `amidon de pois` | **Accept as the existing fr-CA display.** | OQLF’s preferred generic term plus direct Montréal food-label usage support the wording; do not create a duplicate alias. |
| `fécule de pois` | **Reject as an active alias.** | OQLF associates *fécule* with starch from underground plant parts; no reviewed Québec product or terminology source establishes this phrase for pea-seed starch. A future package-specific label could be reviewed on its own evidence. |
| `amidon natif de pois` | **Hold as an alias.** | A French Cosucra page uses the wording for its named animal-feed product, not a Québec human-food label. Its wording does not establish a general food synonym. [S05] |
| `amidon de pois modifié` | **Hold outside this identity.** | This is qualifier-bearing modified-starch wording, not a synonym for the existing unqualified display. No modified-starch row or source-backed mapping is proposed. |

The targeted OQLF search found no exact compound entry for `amidon de pois` or `fécule de pois`. That absence is not proof that the latter phrase never appears; the decision rests on OQLF’s positive generic guidance and the current Québec label evidence above.

## Bundled recipe demand

All 114 recipe files listed by the current seed manifest and their 1,123 ingredient rows were scanned for normalized complete phrases `pea starch`, `native pea starch`, `amidon de pois`, `fécule de pois`, and the native/modified variants above, both in full recipe text and in ingredient-line fields. The audit found **zero matching recipe files, zero matching ingredient rows, and zero ingredient lines linked to `ingredient-ref-pea-starch`**. No recipe relink or recipe-driven alias is proposed.

## Numeric, form, and substitution limits

- Preserve the current null density, empty unit mappings, no-form state, and the ledger’s `not_yet_researched` measurement and substitution states.
- OQLF describes starch generally as a powder; that is not pea-starch particle-size or form evidence. The vermicelli’s 250 g package value is for the finished noodle product, not its pea-starch portion. The AAFC counts describe product launches, not recipe quantities or serving measures. [S01, S02, S04]
- NutriPea describes a food ingredient’s applications and native-starch properties; it publishes no household measure, bulk density, or recipe conversion on the reviewed page. Cosucra’s animal-feed dosage and bag weights are product/use-specific and must not become human-food measures or substitutions. [S03, S05]
- Add no density, unit mapping, form, conversion, package yield, recipe link, or substitution—global or contextual. Similar source material does not establish interchangeability with corn, potato, tapioca, rice, mung-bean starch, or pea flour.

## Proposal-local sources

All pages were accessed on 2026-10-12. The proposal-local IDs were unallocated before integration. Root added the OQLF evidence as S01; the existing SUE Foods source already attached to the pea-starch record was reused instead of adding a duplicate entry. S02, S03, and S05 remain proposal-only evidence.

| ID | Source and bounded evidence | Limits |
|---|---|---|
| **WP02-B3-PEA-STARCH-QUEBEC-TERM-20261012-S01** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Marks *amidon* as preferred; describes *fécule* as contextual wording for starch in tubers or more generally underground plant organs; notes starch in legumes. | General terminology entry; it does not list a pea-starch compound headword or specifically decide `amidon de pois`. Applying its plant-part distinction to pea seeds is an inference. |
| **WP02-B3-PEA-STARCH-QUEBEC-TERM-20261012-S02** | Agriculture and Agri-Food Canada, [*Pea starch ingredients in packaged food and beverage products in Canada and the United States markets*](https://agriculture.canada.ca/en/international-trade/reports-and-guides/customized-report-service-product-launch-analysis-pea-starch-ingredients-packaged-food-and-beverage). Uses `pea starch` for Canadian packaged-food ingredient reporting and reproduces ingredient-label examples. | The market-launch dataset concerns 2019–2023 with 2024 source reporting; it is market analysis, not an ingredient specification or current package label. |
| **WP02-B3-PEA-STARCH-QUEBEC-TERM-20261012-S03** | NutriPea, [*Products*](https://nutripea.com/products), current manufacturer page. Describes Canadian-yellow-pea-derived food-grade starch products and calls Accu-Gel a native starch. | Manufacturer evidence about its named product and source; not evidence that every pea starch is native or interchangeable. |
| **WP02-B3-PEA-STARCH-QUEBEC-TERM-20261012-S04** | SUE Foods, Montréal, [*Vermicelles aux haricots (lungkow)*](https://suefoods.com/products/pagoda-brand-vermicelles-aux-haricots-lungkow). Current French listing gives the ingredient declaration `amidon de pois, amidon de haricot mungo vert, eau`. | One finished mixed-starch vermicelli listing; no standalone pea-starch package, botanical specification, ingredient proportion, or recipe measure. |
| **WP02-B3-PEA-STARCH-QUEBEC-TERM-20261012-S05** | Cosucra, [*NASTAR™ alimentation : amidon de pois*](https://www.cosucraanimalnutrition.com/fr/other-products/native-pea-starch-native-nastar-feed/). The French page uses `amidon natif de pois` for its NASTAR product and identifies animal-feed applications. | A named animal-feed product page, not Québec usage or a human-food synonym source. Its dosage and package quantities are excluded from the catalog. |

## Integration result

The existing `ingredient-ref-pea-starch` row remains unchanged. Root added the OQLF source under proposal ID S01 and replaced the provisional wording in its accepted ledger decision, reusing existing SUE Foods source `WP02-B3-PEA-STARCH-IDENTITY-20261012-S04` for direct Montréal label evidence. The decision confirms `amidon de pois`, rejects `fécule de pois` as an alias, and holds `amidon natif de pois` and modified-starch wording outside the generic identity. No alias, form, recipe, measurement, conversion, or substitution changed. No app tests or emulator checks were run because this is a database-JSON-only research-ledger update. Broader WP02 B2/B3 review remains open; see the [integration record](../batches/wp02-b3-pea-starch-quebec-terminology-integration-20261012/README.md).
