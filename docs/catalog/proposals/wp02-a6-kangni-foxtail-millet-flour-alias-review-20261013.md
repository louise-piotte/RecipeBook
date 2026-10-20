# WP02 A6 review: Kangni name for foxtail millet flour — 2026-10-13

## Review record

- **Reviewed and sources accessed:** 2026-10-13.
- **Status:** Integrated 2026-10-13. Added the two accepted English aliases to the existing foxtail grain and flour rows and recorded the evidence on their existing ledger records. See the [integration batch](../batches/wp02-a6-kangni-foxtail-millet-flour-alias-integration-20261013/README.md).
- **Scope:** Reassess the previously inactive regional phrase `kangni flour` and the bare grain name `kangni` for the existing foxtail-millet grain and flour rows. This is an alias review, not a new ingredient identity or process review.
- **Plan context:** WP02 A6 remains open. Makki atta, Bajri, and Thinai are already integrated; the existing kodo, proso, and foxtail flour rows are also active. The [Thinai proposal](wp02-a6-thinai-foxtail-millet-flour-alias-review-20261013.md) listed Kangni among names left inactive because it had not established a stable Canadian alias set. This packet rechecks that specific gap using direct Canadian product wording and current primary grain-name evidence.
- **Held-term boundary:** The separate brown-top flour candidate remains held. Its [review](wp02-a6-next-regional-flour-gap-sweep-20261012.md) records `Hari Kangni Atta`; the current Canadian Aura listing also distinguishes `Foxtail Millet Flour (Kangni Flour)` from `Browntop Millet Flour (Hari Kangni Flour)`. This proposal does not assign `Hari Kangni`, `Hari Kangni Flour`, or `Hari Kangni Atta` to foxtail millet or change the brown-top hold.
- **Proposal-local source IDs:** `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01` through `S06`. No matching source-ID prefix was found in the live ledger or archived proposal files before drafting.

## Integration outcome

Added **`kangni`** to `aliasesEn` on the existing grain row `ingredient-ref-foxtail-millet`, and **`kangni flour`** to `aliasesEn` on the existing flour row `ingredient-ref-foxtail-millet-flour`. Both existing display pairs remain unchanged, `aliasesFr` remains empty, and no ingredient ID or form was allocated.

ICAR–Indian Institute of Millets Research (IIMR) currently lists Punjabi `Kangni` under Foxtail Millet. Two Canadian retail pages connect the name to foxtail-millet flour: Aura Natural Market uses the exact product wording `Foxtail Millet Flour (Kangni Flour)`, and Mississauga's Namaste Supermarket says its product is known as Kangni in India [S01–S03]. These sources support the two exact English search terms, while the nearby `Hari Kangni` product wording remains separate.

| Term or field | Recommendation | Evidence boundary |
|---|---|---|
| `kangni` | Add to the English aliases of `ingredient-ref-foxtail-millet`. | IIMR's current millet-name table pairs Punjabi `Kangni` with Foxtail Millet; OQLF identifies the existing grain display's species as *Setaria italica*. [S01, S04] |
| `kangni flour` | Add to the English aliases of `ingredient-ref-foxtail-millet-flour`. | Aura's Canadian product listing uses the exact phrase in the title `Foxtail Millet Flour (Kangni Flour)`. Namaste independently describes its titled Foxtail Millet Flour as known as Kangni in India. [S02–S03] |
| `kangani`, `kangani flour`, `kangni atta` | Leave inactive. | The current IIMR webpage uses `Kangni`; a 2025 IIMR handout gives the spelling `Kangani` for Punjabi. The Canadian product evidence reviewed here supports `Kangni`/`Kangni Flour`, not `Kangani` or `Kangni Atta`. [S01–S03, S06] |
| `hari kangni`, `hari kangni flour`, `hari kangni atta` | Leave unassigned; do not add to either foxtail row. | The brown-top flour review retains that candidate as held. Aura's listing presents `Browntop Millet Flour (Hari Kangni Flour)` separately from its foxtail product. The listing alone does not satisfy the held candidate's Québec naming gate. [S02; prior brown-top hold] |
| French display and aliases | Retain `millet d'Italie` on grain and `farine de millet d'Italie` on flour; keep French aliases empty. | OQLF lists `millet d'Italie` as a preferred French name for *Setaria italica*. The current Canadian French product listing uses `Farine de millet S&V Foxtail`; no reviewed Québec/Canadian French source uses `farine de Kangni`. [S04–S05] |
| Forms, measures, density, conversions, yields, and substitutions | Add none. | The naming evidence does not establish numeric or functional behavior. Existing source-scoped flour research remains unchanged; active density and mappings are empty and no substitution rule is attached. |
| New identity, recipe link, or recipe edit | Add none. | The existing grain and species-qualified flour identities cover the evidence; the corpus scan found no matching recipe demand. |

## Name and product boundary

The existing grain row is `foxtail millet / millet d'Italie`, and its botanical scope is *Setaria italica*. IIMR's current page lists `Kangni` as the Punjabi name under Foxtail Millet and notes it was updated on 2026-07-07 [S01]. The same official table lists different names by language. This review adopts only the exact `Kangni` spelling used on that page and supported by Canadian product wording; it does not broaden the row to every regional name found in other sources.

Aura Natural Market's current Canadian collection places the two distinct titles side by side: `Foxtail Millet Flour (Kangni Flour)` and `Browntop Millet Flour (Hari Kangni Flour)` [S02]. Namaste Supermarket in Mississauga independently titles its item `S&V Foxtail Millet Flour` and says it is known as Kangni in India [S03]. The source-grain mapping is anchored by IIMR, not inferred from a seller's regional label. Retain the target flour as a product from foxtail millet, separate from the grain row and generic millet flour.

The A6 brown-top candidate remains unallocated pending a Québec French display; its earlier review specifically keeps `Hari Kangni Atta` as source wording rather than a global alias. This proposal adds only the unqualified name `Kangni` and the qualified phrase `Kangni Flour` to the *Setaria italica* rows. It leaves the full `Hari Kangni` phrase unassigned so it cannot silently move the brown-top candidate or its product wording.

For French, OQLF identifies *Setaria italica* and lists `millet d'Italie` among its preferred French terms, while noting the bird-feed association of `millet des oiseaux` [S04]. The current French Canadian retailer listing calls its product `Farine de millet S&V Foxtail` and describes it as made from Foxtail millet [S05]. Retain the existing French display `farine de millet d'Italie`; do not add `farine de Kangni`, translate the Punjabi name, or treat the retailer's untranslated `Foxtail` as an OQLF ruling.

## Live catalog, exact ownership, and picker audit

Pre-integration snapshot read from the shared worktree on 2026-10-13. File hashes cover exact bytes. The recipe corpus fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Store | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,333 rows; 427,066 bytes | `6e80317089b2bbd55991234e8dc9a880654d78355f463f6feebd809e7a0c1823` |
| Ingredient forms | 98 rows; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,641 records; 6,145 source entries; 5,158 distinct source IDs; 8 unit conversions; 6,056,484 bytes | `3a61c7a9d3ba0f871582221dfc993aae99eb9959c632215cc1e2c416212ed1e3` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The active target references remain `ingredient-ref-foxtail-millet` (`GRAIN_AND_CEREAL`) and `ingredient-ref-foxtail-millet-flour` (`FLOUR_AND_STARCH`). Their displays are `foxtail millet / millet d'Italie` and `foxtail millet flour / farine de millet d'Italie`; their current English aliases are `thinai` and `thinai flour`, respectively. The flour row has `defaultDensity: null`, `unitMappings: []`, and no attached form.

Exact normalized-key ownership was checked against active reference IDs, names, and aliases; form IDs, labels, and match terms; legacy candidate IDs, names, and aliases; and ledger record IDs. Normalization follows `IngredientSearch.kt`: lowercase, NFKD/accent and ligature folding, punctuation to spaces, then whitespace collapse.

| Normalized key | Current exact owner | Proposed disposition |
|---|---|---|
| `kangni` | None | Add to the existing foxtail-millet grain row. |
| `kangni flour` | None | Add to the existing foxtail-millet-flour row. |
| `kangani`, `kangani flour`, `kangni atta` | None | Leave inactive. |
| `hari kangni`, `hari kangni flour`, `hari kangni atta` | None in the active stores | Leave unassigned; keep the separate brown-top candidate held. |
| `foxtail millet`; `thinai` | `ingredient-ref-foxtail-millet` | Retain existing grain ownership. |
| `foxtail millet flour`; `thinai flour`; `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` | Retain existing flour ownership. |
| `millet d'Italie` | `ingredient-ref-foxtail-millet` | Retain the current French grain display; picker phrase behavior also exposes the existing flour row. |

The current picker normalizes both query and catalog terms, prefers complete contiguous word-phrase matches, then falls back to substring matches. The projection below applies that behavior to the current catalog and then to the two proposed aliases only. There are no exact form-name collisions for these queries.

| Query | Current result | With proposed aliases | Effect |
|---|---|---|---|
| `kangni flour` | None | `ingredient-ref-foxtail-millet-flour` only | The qualified phrase selects flour. |
| `kangni` | None | `ingredient-ref-foxtail-millet` and `ingredient-ref-foxtail-millet-flour` | The grain name offers both distinct choices. |
| `kangani`, `kangani flour`, `kangni atta` | None | None | Unreviewed spellings and constructions remain inactive. |
| `hari kangni`, `hari kangni flour`, `hari kangni atta` | None | None | The held brown-top wording is not assigned to foxtail millet. |
| `foxtail millet flour` | Foxtail-millet flour only | Same | The canonical flour phrase stays specific. |
| `foxtail millet` | Foxtail-millet grain and flour | Same | Existing species-level query behavior is retained. |
| `thinai flour` | Foxtail-millet flour only | Same | The previous Thinai alias stays unchanged. |
| `thinai` | Foxtail-millet grain and flour | Same | The previous Thinai grain/flour behavior stays unchanged. |
| `farine de millet d'Italie` | Foxtail-millet flour only | Same | The French flour display remains specific. |
| `millet d'Italie` | Foxtail-millet grain and flour | Same | Existing French phrase behavior is retained. |

This is a static projection from the search implementation, not a runtime picker test.

## Bundled recipe demand

All **114 manifest-listed recipe files**, **1,123 ingredient rows**, and parsed string fields were scanned with project-style normalized whole-phrase matching. Candidate terms included `kangni flour`, `kangni`, `kangani flour`, `kangani`, `kangni atta`, `hari kangni`, `hari kangni atta`, the existing foxtail/Thinai names, and the French displays.

- Recipe files with any candidate phrase: **0**.
- Ingredient rows with any candidate phrase: **0**.
- Ingredient rows linked directly to `ingredient-ref-foxtail-millet-flour`: **0**.

No recipe link, quantity, instruction, substitution, or recipe edit is proposed. The alias addresses a documented market-name gap, not bundled recipe demand.

## Measurements, density, and substitutions

The current flour row has no active density or unit mapping, and the forms file has no form linked to it. The flour ledger record stores the foxtail-flour study's **502.6 and 534.9 kg/m³** endpoints as moisture-dependent, source-specific observations; neither is active density. It also stores a bread-ready-mix finding where **30%** was selected among the study's tested blend levels in that one formula; the finding remains `blocked_pending_evidence`, with no active wheat substitution. Health Canada's generic millet-flour food-code portion reviewed in the [Thinai packet](wp02-a6-thinai-foxtail-millet-flour-alias-review-20261013.md) gives **250 mL = 125.7 g** and a **20 g** serving, but it does not identify *Setaria italica* and was not assigned to this row. The current records do not activate a default density, cup conversion, or substitution.

This proposal adds no numeric observation, measure, density, conversion, yield, form, or substitution. The substitution and contextual-substitution rule files contain no active rule for foxtail-millet flour. Keep all existing source-scoped findings and inactive runtime fields unchanged.

## Evidence register

All new sources below were accessed on 2026-10-13. Their IDs are now recorded on the existing foxtail grain and flour ledger records.

| ID | Source and evidence | Limit |
|---|---|---|
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01** | ICAR–Indian Institute of Millets Research, [Millets Information: common names in Indian languages](https://www.millets.res.in/millets_info.php). The current page lists Punjabi `Kangni` under `Foxtail Millet`; the footer says the page was updated 2026-07-07. | Primary grain-name mapping, not a flour specification or Canadian terminology authority. The page's nutrition values and cultivation information are not recipe data. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S02** | Aura Natural Market, Canada, [Products — page 320](https://www.auramarket.ca/collections/all?grid_list=&page=320&view=view-48). The current listing names `Neem Leaf Foxtail Millet Flour (Kangni Flour) 908g` and separately `Neem Leaf Browntop Millet Flour (Hari Kangni Flour) 908g`. | Retailer product-title evidence only. The Foxtail listing showed out-of-stock status when accessed; no availability, package-weight measure, species test, process, or culinary behavior is inferred. The separate Browntop wording does not resolve the existing Québec naming hold. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S03** | Namaste Supermarket, Mississauga, [S&V Foxtail Millet Flour 2lb](https://namastemississauga.ca/products/sv-foxtail-millet-flour-2lb/019a4ff8-0c43-788c-ad2e-81dfef832863). The title names foxtail-millet flour; its product description says it is known as Kangni in India. The site gives a Mississauga, Ontario address. | Canadian retailer product wording; the marketing, package size, price, and health claims are not adopted. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S04** | Office québécois de la langue française, [millet des oiseaux, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux). Identifies *Setaria italica*, lists `millet d'Italie` among preferred French names, and notes the bird-feed association of `millet des oiseaux`. | Québec grain terminology, not a Kangni or flour-specific term. The entry was last updated in 2010; no newer OQLF wording was located during this review. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S05** | Spice Divine, [Farine de millet S&V Foxtail 2 lb](https://spicedivine.ca/fr/products/sv-foxtail-millet-flour). Its French-facing Canadian listing uses that product title and describes it as made from foxtail millet. | Retailer language, not a terminology ruling; it does not use `Kangni` in French or establish a French alias. Its current stock status is not relied upon. |
| **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06** | ICAR–Indian Institute of Millets Research, [Foxtail millet](https://www.millets.res.in/farmer/2025/Millets_chalisa/English/7Millets_chalisa_foxtail_millet.pdf), 2025 millet leaflet, p. 1. Lists `Kangani` as a Punjabi name, alongside `Kangni` as a common name. | Official institute source showing a spelling variation; it does not resolve a Canadian product alias, and no `Kangani` form is proposed. Its cultivation, nutrition, and agronomy values are not recipe data. |

## Integrated boundary

The integration retains all French fields, active density/mapping fields, forms, recipe links, and substitution rules. `Kangani`, `Kangni Atta`, and the entire `Hari Kangni` phrase family remain inactive; the brown-top candidate remains held. No app tests or emulator checks were run because the change only adds database JSON data and documentation.
