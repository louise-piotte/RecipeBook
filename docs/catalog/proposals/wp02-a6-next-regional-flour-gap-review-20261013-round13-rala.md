# WP02 A6 round 13: Rala / Rala Peeth boundary review

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated: grain alias and ledger-only flour boundary decision. No recipe or application logic changed.
- **Scope:** One uncovered regional foxtail-millet name: the Marathi grain name `Rala` and the source-specific flour wording `Rala Peeth`.
- **Recommendation:** Add only `rala` as an English alias on the existing foxtail-millet grain reference. Hold `rala flour`, `rala peeth`, and `rala atta` off the flour reference pending stable product wording and process scope.
- **Root integration:** Root added the source-backed grain alias and recorded the unresolved flour boundary on the existing ledger row.

## Why this is a distinct A6 gap

The active A6 checklist remains open for regional grain flours. I reread the current checklist and the proposal/batch archive through round twelve, including the integrated foxtail flour aliases `thinai flour`, `kangni flour`, and `korra flour`, plus their paired grain names. The exact normalized key `rala` and the flour-qualified forms `rala flour`, `rala peeth`, and `rala atta` have no prior A6 decision, hold, ledger source, or active owner. Existing foxtail aliases and the previously reviewed flour packets remain unchanged.

## Exact owner and proposed catalog fields

The live grain reference is **`ingredient-ref-foxtail-millet`**, displayed as `foxtail millet / millet d'Italie`, category `GRAIN_AND_CEREAL`. Its English aliases are `thinai`, `kangni`, and `korra`; its French aliases are empty. The target flour reference is **`ingredient-ref-foxtail-millet-flour`**, displayed as `foxtail millet flour / farine de millet d'Italie`, category `FLOUR_AND_STARCH`. Its English aliases are `thinai flour`, `kangni flour`, and `korra flour`; its French aliases are empty.

| Reference and field | Current | Proposed |
|---|---|---|
| `ingredient-ref-foxtail-millet.aliasesEn` | `thinai`, `kangni`, `korra` | Append `rala` |
| `ingredient-ref-foxtail-millet.aliasesFr` | Empty | Empty |
| `ingredient-ref-foxtail-millet-flour.aliasesEn` | `thinai flour`, `kangni flour`, `korra flour` | Unchanged; hold `rala flour`, `rala peeth`, and `rala atta` |
| `ingredient-ref-foxtail-millet-flour.aliasesFr` | Empty | Empty |

No new ingredient identity, form, legacy candidate, recipe link, or French display is proposed. Retain the existing English and Québec French displays, categories, null `defaultDensity`, and empty `unitMappings` on both references. Do not add botanical `Setaria italica` as an alias or create a French construction such as `farine de rala`.

## Identity and regional naming evidence

ICAR–Indian Institute of Millets Research's current language table lists Marathi `Rala` under Foxtail Millet; the page footer says it was updated 2026-07-07 [existing source `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01`]. This is direct primary evidence for `rala` as a grain-level synonym of the already verified *Setaria italica* identity. It does not name flour or establish a Canadian product name. A 2025 IIMR foxtail-millet leaflet independently includes Rala in its source-grain name list [existing source `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06`].

The only direct `Rala Peeth` flour result found is an India-based Millets Now product page. Its indexed product title and image alt text say “Soaked and Sundried Foxtail Millet Flour l Rala Peeth”; the currently visible page heading is only “Soaked & Sundried Foxtail Millet Flour,” the item is marked sold out, and the page identifies Agrozee Organics Pvt. Ltd. in Pune [S01]. This is weak, product-specific evidence: the Rala wording appears in the image/index text but not the current visible product heading, and the same page qualifies the flour as soaked and sundried. It does not show that bare `Rala Peeth` or `Rala flour` is a stable generic name for any foxtail-millet flour.

I found no current Canadian or Québec product page using Rala as a flour name. The current Canada-facing Silkrute listing already reviewed for Korra shows an imported foxtail-millet-flour product and a list of regional names, but does not include Rala [existing source `WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S03`]. That one listing is not comprehensive and its omission does not prove Canadian non-use. It does not supply the missing positive local product evidence for a flour alias.

## Québec French boundary

Keep `millet d'Italie` and `farine de millet d'Italie`. OQLF identifies *Setaria italica*, lists `millet d'Italie` among its preferred French terms, and gives `foxtail millet` as the English equivalent [existing source `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07`]. OQLF does not list Rala or name a flour product. No Québec source supports a distinct Rala flour display or alias. Do not turn the Marathi grain name into a French flour term by translation or transliteration.

## Product and process boundary

| Term | Decision | Evidence boundary |
|---|---|---|
| `rala` | Add to the existing foxtail-millet grain row. | Current IIMR maps the Marathi term to Foxtail Millet. No new grain identity is needed. |
| `rala flour` | Hold off the existing foxtail-millet-flour row. | No reviewed Canadian/Québec label uses the phrase; the direct flour page found does not show this exact stable wording in its current heading. |
| `rala peeth` | Hold off the flour row. | The only hit is tied to a soaked-and-sundried product and appears in its image/index title text rather than the current visible heading. Do not erase that process qualifier by attaching the term to generic flour. |
| `rala atta` | Leave unassigned. | No reviewed source establishes this exact product phrase. Do not infer it from the grain name plus a general word for flour. |
| New soaked/sundried flour identity | Do not allocate. | One product page is insufficient to establish a stable bilingual identity or a separate catalog boundary; no Québec French display was found. |

This recommendation preserves a useful, primary-source grain search alias while withholding the less certain flour phrase. The bare query `rala` will therefore return the verified grain only; the flour-qualified forms remain unmatched until their product scope is established.

## Exact normalized ownership and picker projection

The audit covered reference names and aliases, all attached form labels and match terms, legacy-candidate names/aliases, and ledger record IDs. Normalization follows `IngredientSearch.kt`: lowercase with `Locale.ROOT`, NFKD accent folding, punctuation-to-space conversion, and whitespace collapse. The picker checks complete normalized word phrases before substring fallback.

| Normalized key | Current exact owner | Projection after only `rala` is added to the grain row |
|---|---|---|
| `rala` | None | `ingredient-ref-foxtail-millet` |
| `rala flour` | None | None; held |
| `rala peeth` | None | None; held |
| `rala atta` | None | None; held |
| `foxtail millet` | `ingredient-ref-foxtail-millet` | Grain and flour remain available through the existing phrase-containing flour display |
| `foxtail millet flour` | `ingredient-ref-foxtail-millet-flour` | Flour only |
| `millet d'italie` | `ingredient-ref-foxtail-millet` | Grain and flour remain available through the existing flour display |
| `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` | Flour only |

Static query projection from the current references and attached forms:

| Query | Current picker result | With the proposed grain alias |
|---|---|---|
| `rala` | No result | `ingredient-ref-foxtail-millet` |
| `Rala Peeth` | No result | No result |
| `rala flour` | No result | No result |
| `rala atta` | No result | No result |
| `foxtail millet` | `ingredient-ref-foxtail-millet`, `ingredient-ref-foxtail-millet-flour` | Same two references |
| `foxtail millet flour` | `ingredient-ref-foxtail-millet-flour` | Same flour reference |
| `millet d'Italie` | `ingredient-ref-foxtail-millet`, `ingredient-ref-foxtail-millet-flour` | Same two references |
| `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` | Same flour reference |

Neither target reference has an attached form, so no query returns a form hint. No exact proposed key is owned by a reference, form, legacy candidate, or ledger record ID. Canonical IDs and existing display ownership shown above remain unchanged.

## Measurement and substitution limits

The grain row remains `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; it has no measurement observations, substitution findings, forms, active density, or unit mappings. This name decision adds no numerical evidence to the grain.

The flour row remains `measurementState: researched_supported` and `substitutionResearchState: blocked_pending_evidence`. Its existing source-scoped observations are the two foxtail-flour laboratory bulk-density endpoints, 502.6 and 534.9 kg/m³, measured across the paper's moisture conditions, with no household fill convention; its existing blocked substitution finding concerns one wheat bread-ready-mix study. Those records are not repeated, averaged, or generalized here. The Millets Now page's package text (500 g in its indexed title) is package mass, not a household measure, density, or conversion. No Rala-specific cup/spoon mass, density, unit mapping, conversion, yield, substitute, replacement ratio, observation ID, or finding ID is proposed.

## Full bundled recipe-demand scan

The scan covered every manifest-listed recipe file and every ingredient row, including serialized recipe strings, all ingredient-row string fields, and direct `ingredientRefId` links. It used project-style lowercase, accent/punctuation-folded phrase matching. Candidate wording included `rala`, `rala flour`, `rala peeth`, `rala atta`, `Setaria italica`, the current foxtail-grain and flour displays/aliases, both French displays, and both target reference IDs.

- Manifest-listed recipes: **114 files**.
- Ingredient rows: **1,123**.
- Recipe files containing a candidate phrase: **0**.
- Ingredient rows containing a candidate phrase: **0**.
- Direct links to `ingredient-ref-foxtail-millet`: **0**.
- Direct links to `ingredient-ref-foxtail-millet-flour`: **0**.
- No recipe change or link is proposed.

Manifest-ordered recipe corpus fingerprint: `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` (753,792 bytes).

## Source and identifier collision audit

The research ledger currently has 1,655 records, 6,385 source occurrences, and 5,353 distinct source IDs; its 342 measurement-observation IDs and 192 substitution-finding IDs are unique within their respective sets. The single new proposal source ID below was absent from the live ledger and every other proposal/batch document before drafting. The current IIMR page, IIMR leaflet, OQLF entry, and Canadian marketplace listing are reused through their existing ledger source IDs; no duplicate source IDs are proposed for them.

| ID | Collision check |
|---|---|
| `WP02-A6-RALA-FOXTAIL-ALIAS-20261013-R13-S01` | New Millets Now product-boundary source ID; absent from ledger and proposal/batch archive before drafting. |
| `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01` | Existing IIMR language-table source ID; reused for the already-recorded current page's Marathi Rala entry. |
| `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06` | Existing IIMR 2025 leaflet source ID; reused for its Rala source-grain cross-check. |
| `WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S03` | Existing Canada-facing Silkrute listing source ID; reused only as a bounded local-market check. |
| `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07` | Existing OQLF source ID; reused for the canonical French grain name. |

No new record ID, form ID, legacy ID, measurement-observation ID, or substitution-finding ID is proposed. If root integrates the grain alias, update each existing ledger occurrence of the IIMR source entry to mention the Marathi Rala row, preserving its current source ID. If root records the flour hold, add S01 to the existing flour record and use an unresolved naming decision; leave its numeric and substitution states unchanged.

## Baseline snapshot

Read-only snapshot captured on 2026-10-13 before drafting. File hashes cover exact bytes. Concurrent root work changed the shared reference JSON and plan while this proposal was being drafted; a final read-only check confirmed the two foxtail target rows, their ledger states, and the reviewed candidate ownership were unchanged. These hashes document the proposal-input snapshot; root should recheck live ownership and source IDs at integration time.

| Surface | Baseline | SHA-256 |
|---|---|---|
| Active ingredient references | 1,343 rows | `43c02ea1acdf0ff3cc2e47a6ac28a634f7fd08488e5a40b52b063d4663ff9a05` |
| Ingredient forms | 98 rows; no target forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,655 records; 6,385 source occurrences; 5,353 distinct source IDs | `2f10900fc04496a287904033694094a2fc4a058c5711a64b567953fb6dbcd77d` |
| Active A6 plan | 939,209 bytes | `5ccd2b3f4cfc893ff5b8c8941d5d9a067c0ba25ff6ad879961ebbc921f21e0c4` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Source register

Online pages were checked on 2026-10-13. Existing source IDs refer to entries already in the shared ledger; only S01 is proposal-local.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| Existing `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01` | ICAR–Indian Institute of Millets Research, [Millets Information: common names in Indian languages](https://millets.res.in/millets_info.php), Foxtail Millet row; footer updated 2026-07-07. | Current primary crosswalk lists Marathi `Rala` for Foxtail Millet. Supports the grain alias only, not flour wording, process, measurement, or Canadian product availability. |
| Existing `WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S06` | ICAR–Indian Institute of Millets Research, [Foxtail millet leaflet](https://www.millets.res.in/farmer/2025/Millets_chalisa/English/7Millets_chalisa_foxtail_millet.pdf), 2025, p. 1. | Primary institute cross-check for Rala as a foxtail-millet regional name. Not a flour product or Canadian label. |
| **WP02-A6-RALA-FOXTAIL-ALIAS-20261013-R13-S01** | Millets Now / Agrozee Organics Pvt. Ltd., [Soaked & Sundried Foxtail Millet Flour](https://milletsnow.com/products/foxtail-millet-flour-unpolished-soaked-and-sundried), product page, heading, image alt text, availability, and seller details. | The indexed/alt text uses `Rala Peeth`, but the current visible product heading omits Rala and the page marks the product sold out. The page identifies one soaked-and-sundried foxtail flour product; do not generalize its name/process to plain flour. No recipe measure or substitution evidence is supplied. |
| Existing `WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S03` | Silkrute Canada, [B&B Organics Foxtail Millet Flour, 500 g](https://www.silkrute.ca/grocery/cooking/flour/product-130613/), product title and alternate-name string. | Current Canada-facing marketplace listing for an India-origin flour. It names other regional terms but not Rala; the list is not exhaustive and is not proof of non-use. Package mass is not a kitchen measure. |
| Existing `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07` | Office québécois de la langue française, [millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), preferred terms and English/Latin fields. | Identifies *Setaria italica*, English `foxtail millet`, and preferred French `millet d'Italie`; notes bird-feed use of `millet des oiseaux`. Does not name Rala or foxtail-millet flour. |

## Static verification and integration status

- Re-read `AGENTS.md`, the current A6 checklist, catalog workflow, and relevant identity, Québec naming, measurement, substitution, and source rules in Sections 03 and 06–09.
- Searched the proposal and batch archive, live references, forms, legacy candidates, and research ledger for a prior Rala decision or exact owner; none was found.
- Reproduced current picker results from live references and forms, then projected only the proposed grain alias in memory.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; no candidate wording or direct target links were found.
- Checked the new source ID against the ledger and proposal/batch archive before drafting; it was unique. No app, unit, instrumentation, emulator, or application tests were run for this proposal-only review.

**Root integration result:** On 2026-10-13, root added `rala` to the existing `ingredient-ref-foxtail-millet` English aliases and recorded an accepted source-backed decision. Root recorded an unresolved decision on `ingredient-ref-foxtail-millet-flour` and registered the one Rala Peeth product source. Existing IIMR ledger source entries were updated in place with the Rala mapping while retaining their source IDs. No flour alias, new identity, form, recipe link, measure, conversion, yield, observation, or substitution was added; the flour row's existing measurement observations and blocked substitution finding remain unchanged. No Android tests or emulator checks were run because this integration only adds database JSON data and documentation under the updated workspace rule.
