# WP02 Section 04 B3 R119 — jicama-starch product-boundary hold

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as a documentation-only hold; no active catalog or ledger data was added.
- **Open plan item:** Section 04 B3, line 2209: “Water-chestnut flour and other documented regional starches.”
- **Scope:** Starch experimentally isolated from *Pachyrhizus erosus* roots (jicama). This review is separate from the active fresh-root identity and independent of R118's `katakuriko` alias review for potato starch.
- **Proposal-local source-ID prefix:** `WP02-B3-PACHYRHIZUS-EROSUS-STARCH-HOLD-R119-20261014`; checked against the live ledger and proposal/batch archive, with no collision found.

## Recommendation

**Hold a new active ingredient reference and all aliases pending evidence of a current edible starch product or named Canadian/Québec use.** Primary studies demonstrate that starch can be extracted from roots identified as *P. erosus* and characterized as a separate material. They do not establish a current Canadian or Québec retail, food-service, or ingredient-supplier product. No such product or Québec product label surfaced in the bounded search described below. Keep this candidate distinct from the existing whole jicama root; do not treat laboratory extraction or a paper's industrial-potential statement as market adoption.

`jicama starch` is a research-material phrase, not an active alias. `Pachyrhizus erosus starch` is a useful source-qualified research description. `fécule de jicama` is only a provisional French construction: OQLF supports `fécule` for starch in underground plant organs and gives the root name `dolique bulbeux`, but does not attest this complete food-product name. Do not activate `amidon de jicama`, `fécule de jicama`, `amidon de dolique bulbeux`, or `fécule de dolique bulbeux` until a product source and Québec terminology review support the actual display. Do not add `yam bean starch` or `amidon d'igname haricot`; OQLF's existing root entry lists “yam bean” and “yam-bean” but also distinguishes jicama from yam-bean.

If a current Canadian/Québec source later identifies a food-grade starch product and its botanical source, reconsider a separate identity for starch isolated from *P. erosus*. Recheck the proposed ID `ingredient-ref-jicama-starch` at that time; it is not reserved. Keep the root's existing identity and aliases unchanged.

## Why the research is not market evidence

- Stevenson, Jane, and Inglett (2007), including USDA Agricultural Research Service co-authorship, characterized starch extracted from jícama roots grown in Texas and two Mexican locations. Its statement that the starch might have advantages in industrial applications is a research implication, not a current product listing, supply specification, or evidence of Canadian use. [S03]
- Shi et al. (2021) bought fresh roots in local markets in Fuzhou and Nanning, China, then washed, peeled, chopped, water-squeezed, filtered, cold-precipitated, centrifuged, washed, and freeze-dried the starch in a laboratory. The authors describe developing a novel starch resource for commercial markets as a motivation. That process establishes a research isolate, not a commercially sold edible starch. [S04]
- Ramírez-Balboa et al. (2023) separately prepared jicama starch and jicama flour in a food-technology laboratory in Nayarit, Mexico. Their “flour” came from the washed residues after starch extraction, so it is a distinct research material and not evidence that either product is sold in Canada. The article's abstract says jicama starches could substitute for commercial ones, but identifies no specific commercial starch, recipe context, proportion, or tested replacement method. [S05]
- Targeted searches on 2026-10-14 for `jicama starch` / `Pachyrhizus erosus starch` with Canada, Canadian supplier, product, buy, edible powder, and Québec/French terms surfaced research papers and fresh jicama listings, but no standalone Canadian/Québec starch product or exact Québec product name. A Real Canadian Superstore search result showed fresh jicama root, not extracted starch; that is root-market evidence only. [S06]

This is a bounded search result, not proof that no such product exists. Current evidence supports the research identity of a separate extracted starch and the botanical relationship to the existing root; it does not support cataloging a current Canadian/Québec food ingredient. Reopen the hold when a current product or producer source identifies the isolated food starch and its source, with a product-specific Québec French name reviewed separately.

## Live ownership and picker behavior

The active catalog has one nearby identity: `ingredient-ref-jicama`, displayed as `jicama / dolique bulbeux`, with French alias `dolique tubéreux`. It is the whole edible root. Its category is `VEGETABLE_AND_AROMATIC`; `defaultDensity` is null and `unitMappings` is empty. The ledger marks root identity verified and leaves measurement and substitution research open, recording OQLF's unresolved yam-bean boundary. No active form is attached to jicama.

| Phrase | Current owner / picker result | Decision in this proposal |
|---|---|---|
| `jicama` | `ingredient-ref-jicama` | Keep as the root identity. |
| `dolique bulbeux`, `dolique tubéreux` | `ingredient-ref-jicama` | Keep existing Québec root names. |
| `yam bean`, `yam-bean` | No active owner | Keep unresolved under the existing OQLF boundary. |
| `jicama starch`, `Pachyrhizus erosus starch`, `starch from jicama` | No exact active reference, form, legacy candidate, or ledger identity | Research wording only; no new row now. |
| `amidon de jicama`, `fécule de jicama`, `amidon de dolique bulbeux`, `fécule de dolique bulbeux` | No exact active reference, form, legacy candidate, or ledger identity | Provisional French constructions only; no active name or alias. |

`IngredientSearch.kt` lowercases and Unicode-normalizes phrases, folds accents and punctuation, prefers complete word-phrase matches, then falls back to substring matching. Currently, `jicama` and `dolique bulbeux` return only the root row; the qualified starch and French starch queries above return no row. If a separate starch identity is eventually accepted, its exact qualified query should return that row, while a broad `jicama` query would return both root and starch. This is a predicted picker effect, not a proposed catalog change.

The legacy-candidate file and all active forms were checked alongside references and ledger records. No jicama-starch candidate or exact phrase owner was found. Prior regional starch reviews do not decide this identity. R118 covers only `katakuriko` as a lookup alias for existing potato starch; it provides no evidence about *P. erosus* starch and is not reused here.

## Measurements, density, and substitutions

The studies provide numeric observations, but none is ready to become a reusable kitchen conversion:

- Shi et al. report extraction yields of **2.20 ± 0.01%** for the Fujian sample and **1.09 ± 0.10%** for the Guangxi sample, from three repetitions. These yields reflect the study's fresh roots, locations, sample handling, and laboratory extraction method. They are not household extraction yields, purchased-product yields, or recipe quantities. [S04]
- Ramírez-Balboa et al. measured dry-basis apparent/bulk density by filling a 10 mL test tube to capacity without compacting the sample. The two study starch samples measured **1.14 ± 0.00** and **1.15 ± 0.00 g/cm³**. These are method- and sample-specific bulk-density observations, not an app default density, cup conversion, or evidence for a commercial product's packing behavior. The same paper reports separate flour densities; do not transfer those values to starch. [S05]
- No reviewed source gives a household cup/spoon measurement for a sold jicama starch, and no reviewed recipe defines a jicama-starch conversion or extraction yield. Keep any future active `defaultDensity` null and `unitMappings` empty unless separate product-relevant evidence supports a verified conversion.
- The 2023 statement about replacing “commercial” starches gives no named comparator, recipe method, direction-specific quantity, or ratio. No global or contextual substitution rule is proposed. The live global and contextual substitution-rule files have no rules, and the one package-yield record is unrelated. Do not infer a substitution from research functionality or compare jicama starch with potato, corn, tapioca, or another starch as a recipe equivalent.

## Bundled demand and review snapshot

The manifest contains **114 recipes** with **1,123 ingredient rows**. A manifest-ordered scan found no jicama-root links and no text matches for the candidate English, botanical, or French starch phrases. The bundled library therefore supplies no current recipe demand or recipe-level conversion/substitution context. This is a bundled-corpus result, not a market-demand survey.

Read-only audit snapshot on 2026-10-14:

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,463 | `17ebce2b7ed8bc7de3b3176ee82141521ca46a628bb35613005b4822209b27e3` |
| Active ingredient forms | 105 | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| Research-ledger records | 1,804 | `9ae2b920f0f605f711ee53253dda47c8ae3746195fd9cc30c711db6dc5124489` |
| Legacy import candidates | 63 | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The exact-phrase and archive review included active references/forms, ledger and legacy candidate records, previous B3 proposals/batches, and the current picker implementation. The candidate was not reviewed in R118.

## Scope if reconsidered

1. Require a current Canadian/Québec food product, manufacturer, or ingredient-supplier source that identifies an edible starch product and its plant source as *Pachyrhizus erosus*.
2. Review its exact English and Québec French product names independently. Do not use the active whole-root names as starch aliases by default; do not import unresolved `yam bean` terms.
3. If identity is accepted, create a separate `FLOUR_AND_STARCH` reference and ledger record. Keep density, mappings, forms, conversions, package yields, recipe links, and substitutions unknown unless separately supported.
4. Keep the Section 04 B3 checklist item open. This proposal does not close regional-starch coverage.

## Sources

Sources accessed on 2026-10-14. The source IDs below are local to this proposal and have not been added to the shared ledger.

| ID | Source and evidence boundary |
|---|---|
| **WP02-B3-PACHYRHIZUS-EROSUS-STARCH-HOLD-R119-20261014-S01** | Office québécois de la langue française, [*dolique bulbeux* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17020934/dolique-bulbeux). Supports the Québec whole-root terms `dolique bulbeux` / `dolique tubéreux`, English `jicama`, and Latin *Pachyrhizus erosus*. The entry's English synonyms include yam-bean terms but its note distinguishes jicama from yam-bean. It does not name a starch product. |
| **WP02-B3-PACHYRHIZUS-EROSUS-STARCH-HOLD-R119-20261014-S02** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Gives preferred general French `amidon` and explains `fécule` as a more specific term for starch in tubers or other underground organs. It does not attest a jicama-starch food-product name. |
| **WP02-B3-PACHYRHIZUS-EROSUS-STARCH-HOLD-R119-20261014-S03** | Stevenson, Jane, and Inglett, [“Characterisation of Jícama (*Pachyrhizus erosus* L. Urban) Starch From Taproots Grown in USA and Mexico”](https://doi.org/10.1002/star.200600596), *Starch/Stärke* 59 (2007), 132–140. USDA ARS co-authorship; characterizes starch extracted from study roots from Texas and two Mexican locations. Reports laboratory functional properties and suggests possible industrial advantages, not market availability, product labeling, or kitchen measures. |
| **WP02-B3-PACHYRHIZUS-EROSUS-STARCH-HOLD-R119-20261014-S04** | Shi et al., [“Physicochemical and Functional Properties of Starches from *Pachyrhizus erosus* with Low Digestibility”](https://doi.org/10.2991/efood.k.210626.001), *eFood* 2(3) (2021), 154–161. Primary study; identifies roots from Fuzhou and Nanning markets, describes its lab extraction process, and reports sample-specific extraction yields. The authors discuss future commercialization potential; the paper is not evidence of a current commercial product. |
| **WP02-B3-PACHYRHIZUS-EROSUS-STARCH-HOLD-R119-20261014-S05** | Ramírez-Balboa et al., [“Physicochemical and proximal characterization of starch and flour of jicama (*Pachyrhizus erosus* L.)”](https://doi.org/10.15741/revbio.10.e1427), *Revista Bio Ciencias* 10, e1427 (2023). Primary laboratory study in Nayarit; treats extracted starch separately from flour made from post-extraction residues and describes the 10 mL bulk-density method. Its values and qualitative substitution statement are not product-wide kitchen conversions or a tested recipe replacement. |
| **WP02-B3-PACHYRHIZUS-EROSUS-STARCH-HOLD-R119-20261014-S06** | Real Canadian Superstore, [catalog search result for “yuca”](https://www.realcanadiansuperstore.ca/en/search?search-bar=yuca), surfaced in the 2026-10-14 search. The result included fresh jicama root (shown out of stock when indexed), not extracted jicama starch. Dynamic retailer search output is used only to distinguish the root listing from the starch candidate, not to claim comprehensive market absence. |

## Static review performed

Re-read `AGENTS.md`, the catalog plan, relevant B3 proposals/batches, active references/forms, legacy identities, ledger, current picker implementation, and the seed manifest/recipes. Checked exact ownership, root-vs-starch boundaries, measurement and substitution scope, bundled demand, and the proposal-local source-ID prefix. Used current web searches for English and French product terms with Canadian/Québec modifiers. Root integrated this review as a documentation-only hold, recorded in the batch README and catalog plan. No active catalog or ledger data was added. No app or emulator tests were run. Keep this regional-starch checklist item open and retain the unresolved decisions above.
