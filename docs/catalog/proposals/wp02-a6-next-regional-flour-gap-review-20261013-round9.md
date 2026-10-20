# WP02 A6 Round 9: Ramdana grain and amaranth-flour aliases — 2026-10-13

## Review record

- **Status:** Proposal only. This review changes no catalog, form, ledger, recipe, generated, checklist, or roadmap file.
- **Scope:** One uncovered regional name family: `ramdana` for amaranth seed/grain and the flour-qualified phrase `ramdana flour`.
- **Plan/archive:** The broad WP02 A6 regional-flour checklist remains open. I reread the active A6 checklist and proposal/batch archive, including the integrated round-eight `jowar atta` review. Before this proposal, `ramdana` and `ram dana` did not occur in the A6 plan/archive, research ledger, active references/forms, or legacy import candidates. This is distinct from integrated Rajgira aliases and the held Chaulai names.
- **Recommendation:** Integrate only `ramdana` on the existing amaranth-grain reference and `ramdana flour` on the existing amaranth-flour reference. Keep all French wording, identities, forms, measurements, conversions, yields, recipes, and substitutions unchanged.
- **New source-ID prefix:** `WP02-A6-RAMDANA-AMARANTH-ALIAS-20261013-R9`; S01–S05 were absent from the ledger and catalog archive when checked. No new measurement-observation or substitution-finding ID is proposed.

## Recommendation and exact delta

Government of India eNAM lists `Ramdana` as a common name for amaranth seed and names three *Amaranthus* species. A Ministry of Food Processing Industries/NIFTEM processing report independently says that amaranth grain in India is also known as Ramdana and that amaranth seed can be ground into flour [S01–S02]. Current Canadian retail wording corroborates the product term: an Atlantic Canada retailer has a slash-separated amaranth-flour title [S03], and a Canadian marketplace's indexed title contains the contiguous phrase `RAMDANA Flour` [S05]. Together, these support an English grain alias and a flour-qualified English alias on the two existing generic amaranth references.

The mapping from the retail name to generic amaranth flour remains an inference bounded by those sources: the official sources establish the Ramdana-to-amaranth-seed relationship and that amaranth seed is ground into flour; retailer titles corroborate Canadian use of the flour wording. The Shahi product-detail page returned a cache miss and the Silkrute page returned HTTP 403, so neither retail source is used to claim product contents, a specific species, extraction level, or processing method.

| Existing reference | Exact alias delta | Fields to retain |
|---|---|---|
| `ingredient-ref-amaranth-grain` — `amaranth / amarante`, `GRAIN_AND_CEREAL` | Append `ramdana` to `aliasesEn` (`[]` → `["ramdana"]`). | Keep display names, `aliasesFr: []`, `defaultDensity: null`, `unitMappings: []`, category, and identity. |
| `ingredient-ref-amaranth-flour` — `amaranth flour / farine d'amarante`, `FLOUR_AND_STARCH` | Append `ramdana flour` to `aliasesEn` (`["rajgira flour", "rajgira atta"]` → `["rajgira flour", "rajgira atta", "ramdana flour"]`). | Keep display names, existing Rajgira aliases, `aliasesFr: []`, `defaultDensity: null`, `unitMappings: []`, category, and identity. |

Do not add a separate Ramdana identity, form, legacy candidate, or recipe link. Do not add `ramdana atta`, spaced `ram dana`, or French `farine de ramdana` in this pass: `ramdana` and the independently attested flour-qualified term `ramdana flour` cover the supported grain/flour search boundary without adding an unneeded product-name variant. The official regional sources spell the grain name as one word.

## Current owner and normalized-key audit

The two existing owners have no attached ingredient forms. The grain row has no active density or unit mappings and its ledger states `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. The flour row also has no active density or unit mappings; its ledger states `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`.

Exact normalized-key ownership was checked against active reference names and aliases, form IDs/labels/match terms, all 64 legacy import candidates, and ledger record IDs. The normalization follows `IngredientSearch.kt` (case folding, NFKD accent folding, punctuation-to-space, and whitespace collapse).

| Normalized key | Current exact owner | Proposed owner / decision |
|---|---|---|
| `ramdana` | None | `ingredient-ref-amaranth-grain` as an English alias. The flour-qualified alias will also surface the flour row for a bare query. |
| `ramdana flour` | None | `ingredient-ref-amaranth-flour` as an English alias. |
| `ramdana atta`, `ram dana`, `farine de ramdana` | None | Leave unassigned. |
| `amaranth` | `ingredient-ref-amaranth-grain` | Unchanged. |
| `amaranth flour`, `farine d'amarante` | `ingredient-ref-amaranth-flour` | Unchanged. |

No candidate term has an exact active form, legacy-candidate, or ledger-record-ID owner. The existing `rajgira flour` and `rajgira atta` remain flour aliases only; this proposal does not reopen their prior boundary or add `rajgira` to the grain row. The separate Chaulai hold across grain, greens, and flour also remains unchanged.

## Picker projection, including forms

I reproduced the current phrase-first, substring-fallback search over all live reference and form search terms, then applied only the two alias additions above. Results below use the active reference order. Neither affected reference has an attached form, so no query produces a form hint.

| Query | Current result | Projected result | Form hint |
|---|---|---|---|
| `ramdana` | No result | `ingredient-ref-amaranth-flour` (`amaranth flour / farine d'amarante`) and `ingredient-ref-amaranth-grain` (`amaranth / amarante`) | None |
| `ramdana flour` | No result | `ingredient-ref-amaranth-flour` only | None |
| `ram dana` | No result | No result | None |
| `ramdana atta` | No result | No result | None |
| `rajgira`, `rajgira flour`, `rajgira atta` | `ingredient-ref-amaranth-flour` only | Same | None |
| `amaranth flour` | Generic and sprouted amaranth flour | Same | None on either result |
| `farine d'amarante` | Generic and sprouted amaranth flour | Same | None on either result |
| `amarante` | Six existing amaranth grain/flour/greens/flakes/puffed/sprouted references | Same | None on the six results |

The short query intentionally presents both grain and flour, while the qualified query selects flour alone. This is a picker alias projection, not a new claim that every product labelled for fasting is a single-ingredient flour.

## Québec French boundary

Keep the current Québec displays `amarante` and `farine d'amarante`; keep both `aliasesFr` arrays empty. OQLF's existing `amarante` entry identifies the preferred French term and notes that the seeds can be ground into flour [existing `WP03-S23` and `WP02-S28`]. The already-recorded Aliments du Québec product listing also uses `farine d'amarante` [existing `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S06`]. None of these supports translating the regional English name into `farine de ramdana`. The existing distinction from OQLF's food-colouring term `amaranthe` remains intact [existing `WP02-S30`].

## Measurement, density, and substitution limits

No new numerical or substitution behavior is supported or proposed.

- **Grain:** eNAM's moisture and other tradable quality parameters concern seed lots, not recipe amounts or kitchen measures. The NIFTEM processing report discusses seed processing and flour as a possible use, but gives no household measure, volume-to-mass conversion, or recipe yield [S01–S02]. The grain record remains unresearched for measurement and substitutions.
- **Flour:** Shahi Grocery's 2 lb and 400 g values are package sizes, not recipe measures [S03]. The listing page did not expose a product ingredient panel or measure. Do not infer a density or cup mapping from those package masses.
- **Existing flour research:** An existing amaranth-flour ledger source entry reports a paper-specific bulk-density range across tested particle-size fractions, but no transferable default; active `defaultDensity` remains null and `unitMappings` remains empty. Its only stored portion observation is a manufacturer’s approximate 40–50 g one-person starting quantity for Chaulai Aata, with no household volume; it is not a Ramdana product measurement. The existing `amaranth-flour-no-supported-substitute-20261012` finding says that product advice and controlled bread trials do not establish a general replacement rule. Preserve both records as source-scoped evidence; do not extend them to Ramdana by aliasing.
- **Active behavior:** Neither target has forms or a recipe link. The global and contextual substitution-rule files remain empty. Add no form conversion, active density, unit mapping, measure, yield, global/contextual substitution, or recipe-line substitution.

## Recipe demand

The scan covered every recipe path in the split-package manifest: **114 recipe files and all 1,123 ingredient rows**. It searched normalized serialized strings and row fields for `ramdana`, `ramdana flour`, `ramdana atta`, `ram dana`, `amaranth`, `amaranth flour`, `amarante`, `farine d'amarante`, and both target reference IDs.

- Recipe files with a match: **0**.
- Ingredient rows with a match: **0**.
- Direct recipe links to `ingredient-ref-amaranth-grain` or `ingredient-ref-amaranth-flour`: **0**.

No recipe text, amount, link, or instruction is proposed.

## Source register and collision audit

The five new source IDs below were checked against all 5,300 distinct source IDs in the live ledger and text/JSON files under `docs/catalog`; each had zero matches before assignment. Existing ledger sources listed after the table are reused references, not new registrations.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| **WP02-A6-RAMDANA-AMARANTH-ALIAS-20261013-R9-S01** | Government of India, National Agriculture Market (eNAM), [Commodity Quality list, item 209: Amaranth Seed](https://enam.gov.in/web/docs/221_commodity_list.pdf), checked 2026-10-13. | Lists “Ramdana” among common names for amaranth seed and names *Amaranthus caudatus*, *A. cruentus*, and *A. hypochondriacus*. Primary regional commodity evidence for the seed identity; not a flour specification or species-specific alias. `sourceKind: regional_authority`. |
| **WP02-A6-RAMDANA-AMARANTH-ALIAS-20261013-R9-S02** | National Institute of Food Technology Entrepreneurship and Management, Ministry of Food Processing Industries, [PM FME Detailed Project Report of Amaranthus Processing Unit](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/amaranthusdpr.pdf), printed p. 4, product introduction and uses. | Says amaranth grain in India is also known as Ramdana and that amaranth seed can be flaked, extruded, or ground into flour. Supports the regional grain/flour relationship, not a standardized commercial composition, household amount, or density. `sourceKind: regional_authority`. |
| **WP02-A6-RAMDANA-AMARANTH-ALIAS-20261013-R9-S03** | Shahi Grocery, Atlantic Canada, [Atta & Flours collection](https://www.shahigrocery.com/atta-flours?limit=100&order=ASC&page=2&sort=p.sort_order), collection description and MEGH product title; checked 2026-10-13. | The collection describes online Indian flour service in Atlantic Canada and lists `MEGH Fasting Rajgaro/Rajgira/Ramdana/Amaranth Flour` in 2 lb and 400 g packages. Direct product detail returned a cache miss; use the title for Canadian retail wording only, not contents, stock, or recipe measurement. `sourceKind: other`. |
| **WP02-A6-RAMDANA-AMARANTH-ALIAS-20261013-R9-S04** | Neelam Foodland Canada, [Page 61 product collection](https://neelamfoodlandca.com/collections/all?page=61), product title `Rajgira Ramdana 100 Gm`, lines 607–618; accessed 2026-10-13. | Corroborates the Ramdana grain wording on a Canada-facing storefront. The search index reports a five-month-old crawl; no current stock or composition claim is made. The listed 100 g is package mass, not a recipe amount. `sourceKind: other`. |
| **WP02-A6-RAMDANA-AMARANTH-ALIAS-20261013-R9-S05** | Silkrute Canada, [Hungry Harvest Rajgira/Ramdana flour listing](https://www.silkrute.ca/grocery/cooking/flour/hungry-harvest-rajgira-flour-amaranth-flour-gluten-free-protein-rich-rajgira-atta-ramdana-flour-200-gram/), indexed title and description; search-index crawl two months old, checked 2026-10-13. | Indexed title contains `RAJGIRA Atta RAMDANA Flour`; indexed description says Rajgira atta is obtained from Rajgira/Ramadana (amaranth seeds), with `Ramadana` differing by one letter from the title spelling and the eNAM/NIFTEM spelling. The title provides the Canadian-market wording match; the separate official sources support the identity mapping. Direct fetch returned HTTP 403, so use only the indexed naming content; do not infer current stock, exact package contents, or recipe behavior. `sourceKind: other`. |

**Existing sources reused without duplication:** OQLF `WP03-S23` / `WP02-S28` for Québec `amarante` and flour wording; Aliments du Québec `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S06` for the current French product label; the existing amaranth-flour study and retailer source IDs `WP02-A6-RAJGIRA-FLOUR-ALIAS-20261012-S07` and `S08` for the previously reviewed measurement/substitution boundary; and `WP02-S30` for the `amaranthe` spelling boundary. No new measurement-observation or substitution-finding ID is proposed.

## Baseline snapshot and verification

Snapshot read from the shared working tree on 2026-10-13 after round-eight integration and before this proposal was created. Hashes cover exact file bytes. The corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, exact recipe bytes, and a trailing NUL byte.

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,342 rows | `71e1a1aa77fb9c6063c2b85f5178b5784f949b692ea7471f11415427ff766c0e` |
| Ingredient forms | 98 rows | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,651 records; 6,309 source entries / 5,300 distinct source IDs; 341 measurement observations; 190 substitution findings; 8 unit conversions | `60c4b13c5bd39aa4e18fe2dd5abe8b0e1be337d98b1b1d75c37a97a0cfa60aa5` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Global substitution rules | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Generated `BundledIngredientCatalog.kt` | 1,342 references | `c546347852e2163f099237f7a1c65f3ee77e5656c1eb1cdeca16812beb2cb77e` |

## Root integration result

Accepted only the paired aliases: `ramdana` on `ingredient-ref-amaranth-grain` and `ramdana flour` on `ingredient-ref-amaranth-flour`. Registered the proposal’s five new sources on the corresponding existing ledger records and recorded accepted alias decisions. French wording, forms, measurements, conversions, yields, recipe links, and substitutions remain unchanged. Static review and picker projection confirmed bare `ramdana` returns the grain and flour choices while `ramdana flour` selects flour. No app, unit, instrumentation, emulator, or application tests were run because this change only adds data to database JSON files.
