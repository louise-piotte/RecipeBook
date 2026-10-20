# WP02 Section B2/B3 regional flour and starch residual gap sweep

- **Date:** 2026-10-12
- **Status:** Integrated on 2026-10-12. The reviewed alias and evidence are in the canonical reference and existing ledger record; the plan, roadmap, workflow, and integration report are updated.
- **Scope:** One narrow residual naming gap on the existing potato-starch reference, plus the nearby French retail wording that must stay unassigned. This does not reopen the cassava alias, water-chestnut boundary, warabi-ko hold, or quinoa/Hattai-ko holds.
- **Decision:** Accept `amidon de pommes de terre` as an additional Québec French alias of the existing `ingredient-ref-potato-starch`. Keep `farine de pommes de terre` unassigned. Preserve separate potato-flour and potato-starch identities; add no reference, form, measurement, conversion, yield, recipe link, or substitution.

## Read-only snapshot and audit method

This proposal-stage snapshot predates the separate WP02 Section D integration completed later on 2026-10-12. Hashes are SHA-256 of the exact files at proposal review; the current integration snapshot appears at the end of this document.

| Surface | Snapshot |
|---|---|
| Ingredient references | 1,233 rows; `0a0336b7429232a4a48eb344c266d8e5ba94aa587047186c2bd56b6af62b6e0d` |
| Ingredient forms | 86 rows; `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,531 records / 5,271 source entries / 4,313 distinct source IDs; `d665f791e7f6077054ce3bcc2e0b6aeb2434b346703b62e74257aa9fde8edbdd` |
| Legacy import candidates | 66 rows; `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Seed manifest | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 recipes / 1,123 ingredient rows / 752,993 bytes; `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The recipe digest was recalculated in manifest order over each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte. Candidate ownership was checked against every reference name and alias, every form label and match term, and every legacy candidate name and alias. Phrase matching follows the current ingredient-search normalization: case and diacritics fold, punctuation and spacing normalize, and the search does not convert singulars to plurals.

## Decision and Québec French review

OQLF's *fécule de pomme de terre* entry lists four preferred French terms: `fécule de pomme de terre`, `fécule de pommes de terre`, `amidon de pomme de terre`, and `amidon de pommes de terre`. The last phrase is the one exact preferred term missing from the live potato-starch row. OQLF says `fécule` is the more precise term for starch from underground plant parts, while `amidon de pomme de terre` is common usage. Add the exact plural term as a search alias to the existing starch row; retain `fécule de pomme de terre` as the display. [S01]

The OQLF page's definition includes both wet extraction and milling cooked, dried tubers, and its English translations include both `potato flour` and `potato starch`. It therefore supports the Québec French wording but does not justify merging the project's two established English product identities. The current potato-flour ledger evidence pairs `potato flour / farine de pomme de terre` and distinguishes cooked, dried, ground whole-potato flour from starch washed from crushed potatoes [WP02-S37, WP02-S38]. A current Canadian manufacturer likewise describes its own `potato flour` as cooked, dried, and ground potatoes [S05]. Keep those identities separate and do not add `potato flour` as an English alias of the starch row.

`Farine de pommes de terre` remains held. Walmart Canada's French listing uses that title for a Kupiec product and displays a 14-digit product code, but says the product is out of stock and warns that supplier and marketplace data may not be independently verified. It does not state a preparation process. Kupiec's own Polish page explains that its product named `mąka ziemniaczana` is starch obtained from potatoes; this illustrates why a literal retail translation containing *farine* cannot safely be mapped to the whole-potato flour row or globally assigned to the starch row. A second retailer lists a same-brand 500 g product with an EAN that matches the Walmart code after a leading zero and describes starch separation; that cross-retailer metadata is only corroborative and is not a general French naming authority. [S02–S04]

| Phrase or decision | Proposal | Reason |
|---|---|---|
| `amidon de pommes de terre` | **Accept** on `ingredient-ref-potato-starch` as an additional French alias. | Exact OQLF preferred term; no exact current owner. The existing row already owns OQLF's singular `amidon de pomme de terre` and plural `fécule de pommes de terre`. [S01] |
| `farine de pomme de terre` | **Keep** on `ingredient-ref-potato-flour` as its current French display. | Existing bilingual Statistics Canada evidence and technical product-boundary evidence are recorded as WP02-S37/S38. No change is proposed. |
| `farine de pommes de terre` | **Hold; assign to neither row.** | It has no exact catalog owner. Similar wording appears on a source-specific retail listing for a product whose French listing does not establish process; the separate whole-potato flour class is also active. Do not infer a broad alias from one listing. [S02–S05] |
| English `potato flour` | **Keep** on `ingredient-ref-potato-flour`; do not alias to starch. | OQLF's English cross-reference is broad, while the existing technical evidence and current Canadian manufacturer product evidence preserve a whole-potato flour class. [S01, S05, WP02-S37/S38] |

## Exact current owners and collisions

| Exact phrase | Current exact owner in the reference catalog | Forms / legacy candidates |
|---|---|---|
| `farine de pomme de terre` | `ingredient-ref-potato-flour` (`nameFr`) | No exact hit |
| `farine de pommes de terre` | None; held | No exact hit |
| `potato flour` | `ingredient-ref-potato-flour` (`nameEn`) | No exact hit |
| `potato starch` | `ingredient-ref-potato-starch` (`nameEn`) | No exact hit |
| `fécule de pomme de terre` | `ingredient-ref-potato-starch` (`nameFr`) | No exact hit |
| `fécule de pommes de terre` | `ingredient-ref-potato-starch` (`aliasesFr`) | No exact hit |
| `amidon de pomme de terre` | `ingredient-ref-potato-starch` (`aliasesFr`) | No exact hit |
| `amidon de pommes de terre` | None; proposed alias | No exact hit |

The proposed plural alias does not collide with a form, legacy candidate, or another active reference. It is distinct under the app's current plural-sensitive phrase search from both the existing singular `amidon de pomme de terre` and the whole-potato-flour display. Keep `farine de pommes de terre` out of both alias arrays; the nearby singular flour display is an identity boundary, not permission to synthesize a plural alias.

The only direct overlap in prior material is the existing potato-flour/starch boundary and its OQLF source: ledger records `ingredient-ref-potato-flour` and `ingredient-ref-potato-starch` cite WP02-S37–S39, and the plan/workflow already say not to activate the OQLF English cross-reference as a potato-flour synonym. The residual regional-starches review, the next-open B2/B3 review, and the recent Section B gap sweeps address other regional candidates or carry this potato boundary forward; none records the exact plural alias `amidon de pommes de terre` as owned or proposed. A proposal search for that exact phrase returned no prior match. The broader checklist remains open for its other candidates.

## Recipe demand audit

All strings in all 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `potato flour`, `potato starch`, the singular and plural `farine de pomme(s) de terre`, `fécule de pomme(s) de terre`, `amidon de pomme(s) de terre`, `Kupiec`, and the reviewed product-code strings. The audit found **zero matching recipe files and zero matching ingredient rows**. A separate ID search found no recipe line linked to `ingredient-ref-potato-flour` or `ingredient-ref-potato-starch`. No recipe link, relinking, quantity, form hint, or contextual replacement is proposed.

## Forms, measurements, and substitutions

- The 86-row forms file has no exact potato-flour or potato-starch form label or match term. Keep the existing two references identity-only; add no form or form conversion.
- The current potato-starch ledger record has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; preserve both states. Keep `defaultDensity: null` and `unitMappings: []` on the catalog row.
- The reviewed product pages report package sizes (Kupiec 500 g; Galloway's 455 g and 1 kg options), not a volume-to-mass measure, bulk density, or recipe yield. Do not convert package net mass to a cup measure or density.
- OQLF identifies thickening as a use, and Kupiec describes its product as a thickener. The reviewed sources do not give a tested, source-neutral replacement ratio or recipe-level substitution direction. Add no global or contextual rule; numeric substitution evidence remains unavailable and the research state stays `not_yet_researched`.

## Integrated change set

The proposal stage made no shared-file edits. After the bounded evidence and ownership review, the coordinator integrated the accepted change set:

1. **`app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`** — added only `amidon de pommes de terre` to `aliasesFr` on `ingredient-ref-potato-starch` and updated that row's `updatedAt` to 2026-10-12. Its ID, display names, category, empty `aliasesEn`, null density, and empty unit mappings are preserved; the potato-flour row is unchanged.
2. **`docs/catalog/research-ledger.v1.json`** — added the five source entries below and an accepted decision to the existing potato-starch record. The measurement and substitution research states remain `not_yet_researched`.
3. **Documentation** — updated the plan checklist, roadmap, catalog workflow, and flour/starch review notes. No ingredient forms, recipe files, substitution rules, or legacy candidates changed.

## Proposal-local source IDs

The five IDs below use prefix `WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012`. They were checked against the ledger before integration and remain unique in the updated ledger. S01 rechecks an OQLF page already referenced by WP02-S39 because the plural preferred term was the specific gap under review.

| ID | Source and bounded evidence | Ledger `sourceKind` | Limits |
|---|---|---|
| **WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012-S01** | Office québécois de la langue française, [*fécule de pomme de terre* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre), updated 2004; accessed 2026-10-12. Lists the four preferred French terms, including `amidon de pommes de terre`, defines the powder as wet-extracted or milled cooked/dried tubers, and includes both `potato flour` and `potato starch` as English translations. | `other` | Québec French terminology authority. The broad definition and dual English translation do not establish that the two active English catalog identities are interchangeable. |
| **WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012-S02** | Kupiec, [*Mąka ziemniaczana 500g*](https://kupiec.pl/sklep/niezb%C4%99dne-w-kuchni/73-maka-ziemniaczana-500g.html), official manufacturer page; accessed 2026-10-12. The manufacturer describes this product as potato starch obtained from potatoes and lists `mąka ziemniaczana` as its 100% ingredient. | `manufacturer` | First-party statement for this named Polish product; not a Québec French naming source or volume measure. |
| **WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012-S03** | Walmart Canada, [*Farine de Pommes de Terre*](https://www.walmart.ca/fr/ip/Farine-de-Pommes-de-Terre/18X5YZEXIFQC), French product listing; accessed 2026-10-12. Shows Kupiec, the French title, code `05902172000428`, out-of-stock status, and a marketplace-data accuracy disclaimer. | `other` | Retail listing only; it does not specify a process, and its wording must not be generalized as an accepted Québec synonym. |
| **WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012-S04** | E-spolem, [*Kupiec Mąka ziemniaczana 500 g*](https://espolem.szczecin.pl/pl/p/Kupiec-Maka-ziemniaczana-500-g/11762), retailer listing; accessed 2026-10-12. Lists code `5902172000428` and describes mechanical separation of starch granules. This is consistent with the Walmart listing's code after its leading zero. | `other` | Retailer product metadata is corroborative only; it does not establish general French term ownership or override the manufacturer/OQLF limits. |
| **WP02-B2-POTATO-STARCH-QUEBEC-ALIAS-20261012-S05** | Galloway's Wholesome Foods, [*Potato flour*](https://www.gallowaysfoods.com/products/potato-flour), current Canadian manufacturer/product page; accessed 2026-10-12. Describes its product as cooked, dried, and ground potatoes; lists 455 g and 1 kg variants. | `manufacturer` | Supports a Canadian whole-potato flour product boundary only; its package sizes are not kitchen measures or generic density data. |

## Remaining gaps

- The phrase `farine de pommes de terre` needs a Québec terminology decision tied to a verified package/process before it can be assigned. Keep it off both active alias arrays in the meantime.
- No current recipe uses either potato flour or potato starch by name, and no source reviewed here establishes an active numeric or substitution behavior. Measurements and substitutions remain unresearched at the generic catalog level.
- Other regional B2/B3 flour and starch checklist items remain outside this bounded proposal and still need their own source-backed decisions. This proposal does not mark the plan checklist complete.



## Integration outcome (2026-10-12)

The exact OQLF-preferred French alias `amidon de pommes de terre` is now owned by `ingredient-ref-potato-starch`; the reviewed `farine de pommes de terre` phrase remains unassigned. The existing whole-potato flour identity remains separate. The audit still finds no matching recipe text and no recipe line linked to either potato-flour or potato-starch reference.

Static checks passed: reference normalization, seed-package normalization and validation, generated-catalog freshness, source-backed ledger validation, exact phrase ownership, recipe-demand scan, and UTF-8 without BOM. No tests or emulator checks were run because this was a database-JSON-only update under `AGENTS.md`.

| Surface | Current snapshot after integration |
|---|---|
| Ingredient references | 1,235 rows; SHA-256 `fe44e14adc8b1ad613dd84e15a36a6c381f96ecded39a777fae1279bfc674abd` |
| Ingredient forms | 86 rows; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,533 records / 5,285 source entries / 4,327 distinct source IDs; SHA-256 `893670ac5a67b8f9c4d1eb1688184aa3a1016c620a59cd1f7028d864e0a9b5b1` |
| Legacy import candidates | 66 rows; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Generated Kotlin catalog | 1,235 references; SHA-256 `6984414cba0130931d13751768e8cdf3c2e1dd4b66ff7cec586b1dccd515cbf9` |
| Seed manifest | 114 recipes; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 752,993 bytes; SHA-256 `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

See the [integration report](../batches/wp02-b2-potato-starch-quebec-alias-integration-20261012/README.md). The broader B2/B3 checklist remains open.
