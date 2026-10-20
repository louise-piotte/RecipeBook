# WP02 Section A cereal-flour identity review: triticale flour

- **Review date:** 2026-10-12
- **Status:** Integrated on 2026-10-12 as identity-only `ingredient-ref-triticale-flour`. See [the integration record](../batches/wp02-section-a-triticale-flour-identity-integration-20261012/README.md).
- **Scope:** Whether flour made from food-grade triticale should have its own `FLOUR_AND_STARCH` reference, distinct from the active triticale grain and triticale-flakes identities.
- **Proposal-local source prefix:** `WP02-SECTION-A-TRITICALE-FLOUR-20261012-S01` through `S04`; no source-ID prefix or proposed reference ID collision was found in the live research ledger.

## Recommendation

**Add one identity-only reference:** `triticale flour / farine de triticale`, category `FLOUR_AND_STARCH`, stable ID `ingredient-ref-triticale-flour`.

The OQLF gives the exact Québec French preferred term `farine de triticale` and English equivalent `triticale flour`. Usito identifies triticale as a wheat–rye cereal hybrid and also uses *triticale* for its grains and the flour extracted from them. The Government of Saskatchewan describes human-food triticale flour as whole-grain flour used in health-food products. Together, these sources establish a useful flour identity and its French display. The Saskatchewan page also says the food market is poorly developed; this proposal makes no claim of broad retail availability. [S01–S03]

| Field | Proposed value |
|---|---|
| Stable ID | `ingredient-ref-triticale-flour` |
| English display | `triticale flour` |
| Québec French display | `farine de triticale` |
| English aliases | None |
| French aliases | None |
| Category | `FLOUR_AND_STARCH` |
| Default density | `null` |
| Unit mappings | `[]` |

The identity covers flour milled from food-grade triticale. The reviewed Saskatchewan source describes the flour as whole-grain; do not add an unqualified whole-grain process attribute, extraction value, grade, or form from that one general description. Keep triticale separate from wheat flour and rye flour because Usito defines it as a distinct hybrid cereal. [S02–S03]

## Name and product boundaries

| Phrase or neighbor | Disposition | Evidence and limit |
|---|---|---|
| `triticale flour` / `farine de triticale` | Use as the paired displays on one new reference; leave both alias arrays empty. | These are the direct OQLF English/French term pair. No additional spelling or regional synonym is needed. [S01] |
| `triticale` | Retain on `ingredient-ref-triticale-grain`. Do not add it as a flour alias. | The live grain row owns the exact word; Usito also uses it as the name of the source cereal. The flour qualifier preserves product state. [S02] |
| `triticale flakes` / `flocons de triticale` | Retain on `ingredient-ref-triticale-flakes`. Do not merge with flour. | The active flake reference represents a separately milled/processed cereal presentation; the recent WP03 review excludes flour from its scope. |
| `triticale meal` | Leave unresolved. Do not map it to flour or to the triticale grain row. | A prior A7 residual review held triticale meal because its milling fraction and Québec product display were not established. Flour-specific evidence here does not resolve meal. |
| Wheat flour or rye flour | Keep separate. Do not alias `triticale flour` to either. | Usito defines triticale as a wheat–rye cross; the Saskatchewan source describes flour from that cereal as its own food product. [S02–S03] |
| Whole-grain, wholemeal, feed, silage, or forage qualifiers | Do not add aliases or separate forms from this review. | Saskatchewan describes a whole-grain food flour but gives no flour-grade taxonomy; feed, silage, and forage are different uses and are outside the food-flour identity. [S03] |

## Measurements, forms, conversions, substitutions, and recipe links

- **Forms:** None. Flour is the ingredient product identity; no separate preparation form is established.
- **Measurements:** No source supports a class-wide cup mass, density, package yield, or recipe portion. If integrated, record `measurementState: researched_no_supported_value`; keep `defaultDensity: null` and `unitMappings: []`. Statistics Canada's mill-survey categories are production and inventory reporting fields, not kitchen measures. [S04]
- **Conversions:** None. Do not derive a grain-to-flour yield or a wheat/rye crosswalk from the source descriptions.
- **Substitutions:** None. The Saskatchewan comparison with bread-wheat flour is qualitative milling/baking context, not a tested replacement direction or ratio. If integrated, record `substitutionResearchState: researched_no_supported_substitute`. [S03]
- **Recipe links:** None. A full scan of every manifest-listed recipe found no triticale wording, candidate phrase, or reference ID; do not create or relink a recipe line.

## Live ownership, picker, and recipe audit

Read-only snapshot on 2026-10-12. File hashes cover exact bytes. The recipe digest hashes each manifest-ordered relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Surface | Snapshot | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,270 | `feb642bf2bee7302a02fe4030fe38189f8f423f897437b6b68881285a4500915` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy-import candidates | 65 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,578 records; 5,581 source entries; 4,617 distinct source IDs; 8 unit conversions | `86272bdcb8fa38a7b1984879ed76df09893a3ba306df041fab118ec24573588b` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

I checked exact normalized keys across active reference names and aliases, form labels and match terms, legacy IDs and names/aliases, and research-ledger record IDs. Ownership is:

| Exact phrase or ID | Current owner |
|---|---|
| `ingredient-ref-triticale-flour` | None in references, forms, legacy candidates, or ledger record IDs. |
| `triticale flour`; `farine de triticale` | None. |
| `whole grain triticale flour`; `farine de triticale à grains entiers`; `farine intégrale de triticale` | None; none is proposed as an alias or display. |
| `triticale` | `ingredient-ref-triticale-grain` (`triticale / triticale`). |
| `triticale flakes`; `flocons de triticale` | `ingredient-ref-triticale-flakes` (`triticale flakes / flocons de triticale`). |
| Forms and legacy candidates containing triticale | None. |
| Ledger records | Existing records are `ingredient-ref-triticale-grain` and `ingredient-ref-triticale-flakes`; there is no triticale-flour record. The grain record already cites Saskatchewan and Usito for grain identity and flour context. |

The archive search found no earlier focused triticale-flour proposal. The WP03 triticale-flakes review expressly leaves flour outside its scope; the A7 residual grain-meals proposal holds *triticale meal* because its product scope is unclear. This proposal uses direct flour evidence and does not reopen either decision.

Picker behavior follows `IngredientSearch.kt`: normalize case and accents, fold common ligatures, replace punctuation with spaces, prefer complete normalized word-phrase matches, then use substring fallback. Before a new row is added, `triticale flour` and `farine de triticale` return no reference. A broad `triticale` query currently returns both the grain and flakes references. After integration, the two complete proposed displays should each uniquely match the flour row; the broad `triticale` query should show all three choices. Keep bare `triticale` off the flour alias list.

I scanned all 114 recipe files in the manifest, including every ingredient row and the full serialized recipe text. There were zero mentions of `triticale`, `triticale flour`, `farine de triticale`, or `ingredient-ref-triticale-flour`; no recipe link is supported.

## Source register

Sources were accessed or rechecked on 2026-10-12. They support the stated product identity and names only.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP02-SECTION-A-TRITICALE-FLOUR-20261012-S01** | Office québécois de la langue française, [farine de triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497480/farine-de-triticale), updated 1984. | Gives preferred Québec French `farine de triticale` and English `triticale flour`. This terminology entry does not set milling or nutritional specifications. |
| **WP02-SECTION-A-TRITICALE-FLOUR-20261012-S02** | Usito, Université de Sherbrooke, [triticale](https://usito.usherbrooke.ca/d%C3%A9finitions/triticale), content updated 2026-05-22. | Defines triticale as a cereal hybrid of wheat and rye; includes the cereal's grains and extracted flour among uses of the word. Supports the source-grain boundary and current Québec French naming, not a flour grade. |
| **WP02-SECTION-A-TRITICALE-FLOUR-20261012-S03** | Government of Saskatchewan, [Triticale: Production and Use](https://www.saskatchewan.ca/business/agriculture-natural-resources-and-industry/agribusiness-farmers-and-ranchers/crops-and-irrigation/field-crops/cereals-barley-wheat-oats-triticale/triticale-production-and-use), “Milling and Baking.” | Describes triticale flour as whole-grain flour used in health-food products and notes the food market is poorly developed. It supports the flour product and its narrow known milling scope; it gives no grade, numerical performance threshold, household measure, or general replacement rule. |
| **WP02-SECTION-A-TRITICALE-FLOUR-20261012-S04** | Statistics Canada, [Monthly Millers Survey, 2024](https://www23.statcan.gc.ca/imdb/p3Instr_f.pl?Function=assembleInstr&Item_Id=1530723), archived survey instrument. | Under triticale grain products, the 2024 mill survey separately lists `farine de triticale` for human-consumption output and stocks. The page is archived and is evidence of a recognized mill-output category, not current production volume, retail availability, or a food standard. |

## Accepted scope

The integrated reference uses the bilingual displays above, category `FLOUR_AND_STARCH`, empty alias arrays, null default density, and no unit mappings. It adds no forms, conversions, measurements, yields, substitution rules, legacy-candidate changes, or recipe links. Triticale grain, flakes, flour, and any future meal identity remain separate. The broader Section A checklist remains open.

## Integration result

Integrated with the proposed displays and category. The new ledger record reuses the proposal's four source IDs, records no supported class-wide measure or direct substitute, and leaves aliases, forms, unit mappings, conversions, yields, legacy candidates, and recipe links unchanged. Post-integration picker and package checks are recorded in the batch README. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
