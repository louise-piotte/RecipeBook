# WP02 Section A: `entire wheat flour` alias boundary

**Review date:** 2026-10-12

**Status:** Integrated on 2026-10-12. This proposal retains its pre-integration ownership and picker snapshot; the accepted change is recorded in `docs/catalog/batches/wp02-a1-entire-wheat-flour-alias-integration-20261012/README.md`.

**Scope:** Determine whether the source-backed English term `entire wheat flour` should be searchable on the existing whole-wheat-flour identity. This does not reopen other flour classes or aliases.

**Proposal-local source IDs:** `WP02-A1-ENTIRE-WHEAT-ALIAS-20261012-S01` through `S03`; the prefix was checked against the ledger before drafting.

## Recommendation

**Add only `entire wheat flour` as an English search alias on the existing `ingredient-ref-whole-wheat-flour` row.** Keep the display pair `whole-wheat flour / farine de blé entier`, the French alias array empty, and the existing numeric and substitution states unchanged. Do not create a new identity or alias `wholemeal flour`.

Both the current Canadian Food Compositional Standards and the OQLF directly recognize `entire wheat flour` with whole-wheat flour. The CFIA standard is titled “Whole Wheat Flour or Entire Wheat Flour”; OQLF lists `entire wheat flour` as an English term for Québec French `farine de blé entier`. The exact English phrase currently returns no picker result, while the active whole-wheat row has no aliases. Adding this one phrase would give the recognized Canadian/Québec wording a unique search destination without taking over a French query or an adjacent milling identity. [S01–S02]

Keep `wholemeal flour` separate from this alias decision. Scotland’s statutory definition, in force since 3 February 2025, describes wholemeal flour as flour consisting of the whole product from milling or grinding cleaned cereals. That is broader than a wheat-specific term, so do not attach it to the wheat-only row. [S03]

## Proposed search delta

| Field | Current state | Proposal |
|---|---|---|
| Identity | `ingredient-ref-whole-wheat-flour` | Reuse this identity; allocate no new reference ID. |
| English display | `whole-wheat flour` | No change. |
| French display | `farine de blé entier` | No change; this is the preferred OQLF term and the existing Canadian-facing display. |
| English aliases | Empty | Add only `entire wheat flour`. |
| French aliases | Empty | Keep empty. Do not add `farine de blé complet`; its current phrase-first search already finds the wheat-meal row through `farine de blé complet brute`. Do not add `farine intégrale de blé`, which is already the base wording of the distinct white whole-wheat row. |
| Forms | None attached | Add none. This is an English name for the same wheat-flour identity, not a preparation state. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` | No change. |
| Recipe links | None to this identity | Add none; the bundled recipes contain no matching phrase or direct link. |

Do not add `wholemeal flour`, `whole meal flour`, `whole grain wheat flour`, `100% whole wheat flour`, `farine intégrale`, or any product/brand name as an alias from this review. The Canadian term does not mean that every kernel component must be present in exactly its original proportions: the federal standard allows up to 5% of the source wheat’s natural constituents to be absent. The existing row remains the standardized whole-wheat-flour identity, not a guarantee of 100% whole-kernel retention. [S01–S02]

## Identity and naming boundary

The OQLF defines `farine de blé entier` as a wheat milling product and gives `farine de blé complet` as an alternate preferred French term. Its English terms are `whole wheat flour` and `entire wheat flour`. The Canadian standard likewise names **Whole Wheat Flour or Entire Wheat Flour** as one wheat product and defines its composition. These sources support one bilingual ingredient identity with an additional English spelling/term, rather than a new identity. [S01–S02]

Keep nearby identities separate:

| Neighbor | Boundary |
|---|---|
| White whole-wheat flour / `farine intégrale de blé blanc` | This separate row identifies white wheat while retaining the whole grain. Do not move its display or `hard white whole wheat flour` alias to the generic Canadian whole-wheat row. |
| Whole-wheat pastry flour / `farine de blé entier à pâtisserie` | Keep its pastry qualifier and identity separate. The proposed alias contains no pastry qualifier. |
| Whole wheat meal / `farine de blé entier brute` | Keep the coarser meal row separate. Do not add `entire wheat flour` to its names or aliases. |
| Graham flour / `farine Graham` | Keep the standardized Graham identity separate; OQLF and CFIA distinguish Graham flour from whole-wheat flour. |
| Generic wholemeal flour | Do not map the unqualified phrase to wheat. The Scottish statutory definition covers flour from cleaned cereals generally, not wheat alone. |

## Ownership and picker audit

The live audit checked complete normalized phrases and candidate IDs in active reference names/aliases, form labels/match terms, legacy identities, ledger record IDs, and the proposal archive. Normalization follows `IngredientSearch.kt`: lowercase, Unicode NFKD, accent and ligature folding, punctuation-to-space normalization, then complete word-phrase matching before substring fallback.

| Surface | Current finding |
|---|---|
| Active references | `ingredient-ref-whole-wheat-flour` is `whole-wheat flour / farine de blé entier` with both alias arrays empty. No active row owns `entire wheat flour`, `wholemeal flour`, `whole meal flour`, or proposed candidate ID `ingredient-ref-entire-wheat-flour`. |
| Forms | No form is attached to the target whole-wheat identity, and no form label or match term owns the candidate phrases. |
| Legacy identities | No legacy candidate owns the candidate phrases or ID. |
| Research ledger | The existing `ingredient-ref-whole-wheat-flour` record already cites the CFIA 12.1.3 title “Whole Wheat Flour or Entire Wheat Flour” as source `S2`; its accepted decision restored the existing identity but did not record an alias decision. No separate ledger record ID owns `entire wheat flour`. Reuse the existing identity record if the alias is later integrated. |
| Proposal archive | No dedicated `entire wheat flour` alias proposal, candidate ID, or proposal-local source prefix was found. Related whole-wheat, wheat-meal, white-whole-wheat, and Graham reviews preserve the neighboring boundaries but do not propose this English alias. |

Current picker behavior and the effect of the proposed single alias:

| Query | Current phrase-first result | After proposal |
|---|---|---|
| `entire wheat flour` | No result | Only `ingredient-ref-whole-wheat-flour` |
| `whole-wheat flour` | `ingredient-ref-whole-wheat-flour` and `ingredient-ref-white-whole-wheat-flour` | Unchanged |
| `farine de blé entier` | Whole-wheat flour, whole-wheat meal, and whole-wheat pastry flour | Unchanged |
| `farine de blé complet` | Whole wheat meal, because its French alias is `farine de blé complet brute` | Unchanged; no French alias added |
| `farine intégrale de blé` | White whole-wheat flour | Unchanged |
| `wholemeal flour` | No result | No alias proposed |

The existing English `whole-wheat flour` query is a family search because it is a phrase within both generic and white whole-wheat names. The new `entire wheat flour` alias is complete and occurs on no other active name, so its exact query has a single destination. No French picker behavior changes.

## Recipe demand

All **114 manifest-listed bundled recipe files** and their **1,123 ingredient rows** were scanned for `entire wheat flour`, `wholemeal flour`, `wholemeal`, `whole meal flour`, `farine de blé complet`, `farine de blé entier`, and direct links to `ingredient-ref-whole-wheat-flour`.

- Candidate-phrase recipe files: **0**.
- Ingredient rows linked to `ingredient-ref-whole-wheat-flour`: **0**.
- No recipe link or recipe quantity is proposed.

The alias is supported by the Canadian and Québec name boundary, not by recipe demand. The recipe corpus provides no evidence for a measurement or substitution rule.

## Numeric, form, and substitution limits

| Property | Disposition |
|---|---|
| Density and household measurements | No supported density, cup mass, or other household measure. Keep `defaultDensity: null`. |
| Unit mappings and conversions | None. Keep `unitMappings: []`; no volume-to-mass, grade-to-grade, or country-grade conversion is supported. |
| Forms | None. The alias changes no preparation state. |
| Substitutions | No new rule. The existing whole-wheat ledger record remains `researched_no_supported_substitute`; do not generalize product-specific test-kitchen evidence. |
| Recipe links | None. |
| Composition numbers | CFIA’s 95% minimum and ash, moisture, and fineness criteria are regulatory product specifications, not recipe quantities or catalog conversion values. Keep them in the existing source record only; add no active numeric fields. |

## Live-package snapshot

Read-only snapshot refreshed immediately before finalization on 2026-10-12, after a concurrent package update. Exact candidate ownership, picker behavior, and recipe results were rechecked against this snapshot. Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,270 | `6559f9b7af6928c73c4f6c84edf21e56a455ebc9d313d07882618f421ad59354` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy-import candidates | 65 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,578 records; 5,577 source entries; 4,613 distinct source IDs; 8 unit conversions | `924213ec3b353a9c94eda878e17e9322ee246580a9039d3a8277beb38c18aba6` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Sources

Sources accessed or rechecked on 2026-10-12. Source IDs in this table are proposal-local and are not ledger entries.

| ID | Source | Evidence and limit |
|---|---|---|
| **S01** | CFIA, [Canadian Food Compositional Standards, Volume 12, §12.1.3](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Current Canadian standard names “Whole Wheat Flour or Entire Wheat Flour” and defines the wheat product. It specifies a minimum 95% of the wheat’s natural constituents, plus ash, moisture, and fineness criteria. These are regulatory identity specifications, not household measures or conversion data. The live ledger already stores this source as `S2` on the whole-wheat record. |
| **S02** | OQLF, [farine de blé entier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361931/farine-de-ble-entier) | Québec preferred terms are `farine de blé entier` and `farine de blé complet`; the listed English terms are `whole wheat flour` and `entire wheat flour`. The note describes the Canadian 95% compositional standard and distinguishes Graham flour. The record was last updated in 2002; it is terminology evidence, not a current retail listing. |
| **S03** | The Scottish Ministers, [The Bread and Flour Amendment (Scotland) Regulations 2024](https://www.legislation.gov.uk/ssi/2024/387/pdfs/ssi_20240387_en.pdf), regs. 1–2 | Defines “wholemeal flour” as flour consisting of the whole product from milling or grinding cleaned cereals; this definition came into force 3 February 2025. It demonstrates a current cereal-wide use in Scotland, not a Canadian/Québec synonym for wheat flour. |

Coordinator integration added only the English alias `entire wheat flour` to the existing whole-wheat-flour identity and recorded the accepted alias decision on its existing ledger record. All displays, French aliases, numeric fields, forms, recipe links, conversions, and substitutions remain unchanged. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`. See the integration record linked above.
