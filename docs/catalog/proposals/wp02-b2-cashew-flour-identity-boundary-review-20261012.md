# WP02 B2 candidate review — cashew flour

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No canonical JSON, ledger, plan, roadmap, recipe, generated file, or test was changed.
- **Scope:** One uncovered B2 identity candidate: flour made by milling edible cashew kernels. This does not review cashew butter, cashew flour measurements, or substitutions.
- **Source-ID prefix:** `WP02-B2-CASHEW-FLOUR-20261012`; absent from the current research ledger and proposal archive before this review.

## Recommendation

**Accept one identity-only candidate for integration:**

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-cashew-flour` |
| Category | `FLOUR_AND_STARCH` |
| English display | `cashew flour` |
| French display | `farine de noix de cajou` |
| English aliases | `[]` |
| French aliases | `[]` |
| Density / unit mappings | `null` / `[]` |

Scope the identity to flour made by milling edible cashew kernels. The reviewed Québec recipe guidance and product pages show cashew kernels being milled or sold as cashew flour. Keep whole cashews, cashew butter, flour blends, and any explicitly defatted or press-cake product distinct. The evidence does not establish a standardized defatting process or a shared identity for `cashew meal`.

The exact English and Québec French displays are independently attested: a manufacturer uses `Cashew Flour`, a Québec recipe publication uses `Farine de noix de cajou`, and a Canadian French retailer listing names `Farine de noix de cajou biologique crue`. [S01–S04]

Do not add aliases for `cashew meal`, `ground cashews`, `cashew nut flour`, `cashew powder`, `farine de cajou`, `poudre de cajou`, `farine d’anacarde`, or `farine de noix d’acajou`. The sources do not establish these as stable flour names or synonyms. Search behavior also makes broad aliases harmful: `noix de cajou` already returns both the whole-cashew and cashew-butter references.

## Candidate status: accepted identity versus holds

| Candidate | Status | Decision |
|---|---|---|
| `cashew flour / farine de noix de cajou` made from edible cashew kernels | **Accepted identity candidate** | Add one identity-only reference with the displays above and empty alias arrays. |
| `cashew meal`, `ground cashews`, `cashew powder`, and `cashew nut flour` | **Hold as aliases** | No reviewed source establishes these exact phrases as stable equivalents; `ground cashews` also names an ordinary preparation rather than a distinct catalog product. |
| Defatted cashew flour or cashew press cake | **Hold as a separate candidate** | No reviewed source establishes a product process, shared label, or boundary for these materials. Do not merge them into this whole-kernel identity. |
| `farine de cajou`, `poudre de cajou`, `farine d’anacarde`, `farine de noix d’acajou` | **Hold as French aliases** | These were not established as flour labels by the reviewed Québec sources. Use the directly attested `farine de noix de cajou` display. |
| Forms, measures, density, conversion, yield, or substitution | **Hold** | The available numbers describe grinder time or package size; they are not general culinary measures or conversion evidence. |

## Bounded catalog delta

| Surface | Proposed change | Boundary |
|---|---|---|
| Ingredient references | Add `ingredient-ref-cashew-flour` with `cashew flour / farine de noix de cajou`, category `FLOUR_AND_STARCH`, and no aliases. | Whole-kernel flour identity only. |
| `ingredient-ref-cashews` | No change. | Retain `cashews / noix de cajou`; do not add flour wording to the whole ingredient. |
| `ingredient-ref-cashew-butter` | No change. | Retain `cashew butter / beurre de noix de cajou`; butter is a distinct processed product. |
| Forms and recipe links | No change. | No form, recipe line, or recipe association is supported. |
| Numeric and substitution data | No change. | Keep density null, unit mappings empty, and measurement/substitution research unassigned. |

## Workspace audit and exact search ownership

Read-only snapshot of the shared worktree on 2026-10-12:

| Surface | State and SHA-256 |
|---|---|
| Ingredient references | 1,294 rows; 137 `FLOUR_AND_STARCH`; `d2993b7527813432410d7c7926aa38335d39afda59523c967c46b95b96b6af98` |
| Ingredient forms | 98 rows; `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows; `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,602 records / 5,779 source entries / 4,804 distinct source IDs; `771a9aa6c65226e1b4e66a6c1893d1ee88957b0af9a8d234c6b8ac348f12316f` |
| Active plan | `docs/RecipeBook-global-ingredient-catalog-plan.txt`; `21f78b152805ca7dbc8eb1e2528038787c61e2d60ec9ef4d16268be00fe348bf` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows; fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The plan’s B2 alternative-flour section begins at line 1345 and tracks nut flours alongside pulse, grain, and root flours. It contains no cashew-flour decision. The whole-cashew identity and separate cashew-butter reference are already active, but neither constitutes a flour identity. A case-insensitive scan of prior `wp02-*` proposals and batches found no `cashew flour`, `farine de noix de cajou`, or `cashew meal` review. `ground cashews` appears once in the sunflower-flour proposal as a contextual food comparison; it is not a cashew-flour identity review. No `ingredient-ref-cashew-flour` row or ledger record exists.

Current active cashew-related ownership:

| Current term | Owner | Notes |
|---|---|---|
| `cashews` | `ingredient-ref-cashews` (`nameEn`) | Exact whole-cashew display. |
| `noix de cajou` | `ingredient-ref-cashews` (`nameFr`) and phrase inside `ingredient-ref-cashew-butter`’s French name | The picker currently returns both whole cashews and cashew butter for this complete phrase. |
| `cashew butter` | `ingredient-ref-cashew-butter` (`nameEn`) | Existing butter identity; its ledger record is verified, with measurement and substitution research not yet done. |
| `beurre de noix de cajou` | `ingredient-ref-cashew-butter` (`nameFr`) | Existing French butter display. |
| `cashew flour`, `farine de noix de cajou`, `cashew meal`, `ground cashews`, `farine de cajou` | No exact current owner in references, forms, legacy candidates, or ledger | Only the first two are proposed as displays; keep the other phrases unassigned. |

The picker normalizes accents and punctuation, prefers complete normalized word phrases, then falls back to partial matching. Under current behavior, `cashew flour` and `farine de noix de cajou` return no reference. With the proposed displays, each becomes an exact phrase for the new row. `noix de cajou` continues to return the existing cashew and butter references and adds the flour row; `cashews` continues to resolve to the whole-cashew reference. The unqualified query `cashew` currently returns the butter reference; adding the proposed row would also return cashew flour, while the plural `cashews` remains the whole-nut query. No generic `cashew` alias is needed.

The evidence ledger contains `ingredient-ref-cashews` and `ingredient-ref-cashew-butter`, each with verified identity and measurement/substitution states `not_yet_researched`; it contains no cashew-flour identity or measurements. The whole-cashew record cites the OQLF’s `noix de cajou` terminology. The butter record has separate product evidence and does not support flour aliases, measures, or substitutions. The proposal-local source-ID prefix was absent from the ledger and proposal archive before drafting.

## Bundled recipe demand

The scan covered every recipe listed in the seed manifest: 114 files and 1,123 ingredient rows. It searched complete recipe JSON text and each ingredient row for `cashew`, `cashews`, `cashew flour`, `cashew meal`, `ground cashew`, `cajou`, `noix de cajou`, `acajou`, and `anacarde`. **Result: zero phrase matches in recipe files and zero ingredient rows linked to either `ingredient-ref-cashews` or `ingredient-ref-cashew-butter`.** The bundled corpus therefore gives no direct cashew-flour demand or basis for recipe links, relinking, measurements, or substitution. This is only a statement about the current bundle.

The recipe fingerprint is SHA-256 over each manifest-ordered relative recipe path, a NUL byte, the file bytes, and a NUL byte, concatenated for all listed files.

## Numeric, conversion, and substitution limits

- Télé-Québec describes blending raw cashew halves briefly until broken and warns that continued blending can turn the material into butter. Its eight-second instruction is a grinder-time instruction, not a weight or volume measure. The article’s general advice for making nut flour likewise provides no cashew-specific mass/volume conversion. [S02]
- The manufacturer page gives package size options and marks the variants sold out or unavailable when accessed; package size is not a cooking measure. The Canadian French listing is a 50 lb bulk product title, not evidence of a household measure or density. [S03–S04]
- No reviewed source establishes grams per cup, a stable household measure, bulk density, an ingredient-unit mapping, or a reusable yield. Keep `defaultDensity: null` and `unitMappings: []`.
- No reviewed source tests cashew flour as a general one-to-one replacement for all-purpose flour, almond flour, or another flour. Do not transfer the article’s almond-flour advice to cashew flour. Add no global or contextual substitution, conversion, or recipe-specific link.

## Source register

All sources were accessed on 2026-10-12. Source IDs are proposal-local; no ledger entries were written.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-CASHEW-FLOUR-20261012-S01** | Office québécois de la langue française, [*noix de cajou* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869307/noix-de-cajou). Supports the Québec French ingredient wording `noix de cajou`, with `cajou` and other nut terms recorded as variants. | Terminology evidence for the nut, not a ruling on flour terminology. |
| **WP02-B2-CASHEW-FLOUR-20261012-S02** | Télé-Québec, [*Faire sa farine maison en 1 minute*](https://cuisinez.telequebec.tv/articles/103/faire-sa-farine-maison-en-1-minute), section “Farine de noix de cajou.” Names the preparation `farine de noix de cajou` and describes grinding raw cashew halves until broken while avoiding overprocessing into butter. | Direct Québec naming and home-preparation evidence; it provides no cashew flour mass/volume conversion, density, or flour-substitution test. |
| **WP02-B2-CASHEW-FLOUR-20261012-S03** | Hearthy Foods, [*Cashew Flour*](https://www.hearthyfoods.com/en-ca/products/cashew-flour). The English product page says its flour is made from raw cashews and lists a single cashew ingredient; its 1 lb and 5 lb variants were marked sold out or unavailable when accessed. | Manufacturer product evidence and English wording; the page does not establish Canadian stock, a standardized process, or a reusable package-to-kitchen measure. |
| **WP02-B2-CASHEW-FLOUR-20261012-S04** | Fun Foods Canada, [French Canadian-distribution product listing](https://funfoods.ca/fr/collections/grocery-and-food-items-pantry-essentials-snacks-beverages-canadian-distribution), indexed title `Farine de noix de cajou biologique crue` with a 50 lb package. | Canadian-facing retail wording and bulk package context; collection listing rather than a process specification, and no Québec-origin claim or household measure. |

