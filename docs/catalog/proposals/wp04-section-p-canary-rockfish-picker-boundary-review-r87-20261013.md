# WP04 Section P — Canary rockfish picker-boundary review (R87)

- **Review date:** 2026-10-13.
- **Open checklist line:** `[ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.` See the [live Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4244).
- **Recommendation:** Hold Canary rockfish (*Sebastes pinniger*) outside active references and the research ledger for now.
- **Decision boundary:** The species and bilingual name are well supported, but the current picker would make `rockfish` return this one named species. Do not add a `rockfish` alias, forms, measurements, conversions, yields, recipe links, or substitutions.
- **Repository rule:** Proposal-only research. `AGENTS.md` says changes limited to database JSON data need no app tests. No tests, Gradle tasks, emulator, or deployment were run.

## Distinctness and current snapshot

The unchecked Section P line includes regional fish. A search of the current plan, WP04 proposal and batch archive, active references and forms, legacy candidates, and research ledger found no previous Canary-rockfish review or identity. This is distinct from the integrated R86 bocaccio identity and the earlier yelloweye/yellowmouth rockfish and Pacific-ocean-perch holds. The term `canary` also occurs in the separate `canary seed groats` ingredient, but that is not a fish review or taxonomic overlap.

The live post-R86 snapshot has **1,418 ingredient references, 104 forms, 63 legacy-import candidates, and 1,757 research-ledger records**. The bundled manifest has **114 recipes and 1,123 ingredient rows**. Exact normalized ownership checks found no active reference, form term, legacy candidate, or ledger identity for `Canary rockfish`, `sébaste canari`, or *Sebastes pinniger*. The prospective ID `ingredient-ref-canary-rockfish` is unallocated. No source IDs with the proposal prefix `WP04-SECTIONP-CANARY-ROCKFISH-R87-20261013-` were found in the ledger or proposal/batch archive.

Relevant live identities remain separately owned:

| Active reference | Current display | Current aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-quebec-redfish` | `Québec redfish / sébaste du Québec` | None | Québec market-group identity; it does not claim Canary rockfish. |
| `ingredient-ref-acadian-redfish` | `Acadian redfish / sébaste acadien` | None | Atlantic species identity; no `rockfish` alias. |
| `ingredient-ref-beaked-redfish` | `Beaked redfish / sébaste atlantique` | None | Atlantic species identity; no `rockfish` alias. |
| `ingredient-ref-bocaccio` | `bocaccio / bocaccio` | None | Separate Pacific species; no `rockfish` or `sébaste` alias. |
| `ingredient-ref-canary-seed-groats` | `canary seed groats / grains mondés d’alpiste des Canaries` | None | Existing food ingredient that already matches the shorter English query `canary`. |

No active identity currently owns bare `rockfish`. CFIA lists the generic `Sebastes spp.` as `Rockfish / Sébaste` and assigns the English name `Rockfish` to many named taxa, including Canary rockfish. That source ownership is much broader than *S. pinniger*.

## Species, product, and Québec naming scope

OQLF’s GDT entry `sébaste canari` identifies *Sebastes pinniger*, gives English `canary rockfish` and `rockfish`, classifies it as an edible fish, and says it has commercial potential in Québec. The entry was last updated in 1998. CFIA’s Fish List independently maps *S. pinniger* to `Canary Rockfish / Sébaste Canari`; it also gives that same taxon `Rockfish` and `Pacific Snapper`, and contains a generic *Sebastes spp.* `Rockfish / Sébaste` entry. These sources support the identity and the Québec French display, while also showing why the unqualified terms are not species-exclusive. [S01–S02]

DFO’s January 2023 stock assessment covers the British Columbia coastwide population and describes it as almost entirely harvested by commercial trawl fleets, with smaller other-gear catches. It reports a 2017–2021 average catch of 789 tonnes. This is contemporary BC fishery evidence; it does not establish a current Québec retail SKU or household food availability. OQLF’s dated commercial-potential note is not evidence of present-day Québec sales. I found no current Québec consumer listing in this review. Do not state a current Québec market or conservation status from these sources. [S03]

Use the preferred French display `sébaste canari` if this identity is reconsidered. Do not use English `Canary` alone: OQLF’s bilingual fish term is `canary rockfish`, and bare `canary` is also part of an existing seed ingredient name. Keep `orange rockfish`, `snapper`, `red snapper`, `Pacific snapper`, and `fantail rockfish` out of aliases. CFIA applies Pacific-snapper wording to multiple *Sebastes* taxa, and the DFO/archived terminology material does not establish those alternate names as safe recipe-picker equivalents. [S02–S04]

## Current ownership and picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes the bilingual display names, aliases, and attached form terms. It returns full normalized word-phrase matches first, then uses substring matching only when no phrase match exists. I projected the live 1,418 references and 104 forms, then added a synthetic row with only the proposed displays `Canary rockfish / sébaste canari` and no aliases/forms:

| Query | Current picker | With synthetic row | Review |
|---|---|---|---|
| `canary rockfish` | No result | Canary rockfish / sébaste canari | Correct species-qualified English query. |
| `sébaste canari` | No result | Canary rockfish / sébaste canari | Correct species-qualified French query. |
| `rockfish` | No result | Canary rockfish / sébaste canari | Unsafe single result: OQLF lists bare `rockfish` as an English term for this species, while CFIA assigns `Rockfish` to many taxa and to generic *Sebastes* spp. |
| `canary` | Canary seed groats | Canary seed groats; Canary rockfish | Adds a fish beside an unrelated seed ingredient under a short, unqualified query. |
| `sébaste` | Québec redfish; Acadian redfish; Beaked redfish | Same three, plus Canary rockfish | The full French phrase adds a fourth named fish under the existing genus/group query. |
| `orange rockfish`, `snapper`, `red snapper`, `Pacific snapper`, `fantail rockfish` | No result | No result | Keep these alternate names out; they are not supported as exclusive picker terms here. |
| `fish`, `poisson` | Existing phrase-match results | Unchanged | The proposed names add neither bare token. |

Although exact `canary rockfish` and `sébaste canari` queries would be useful, the same canonical display necessarily makes generic `rockfish` a singleton. There is no generic rockfish identity or picker behavior that can show a broad choice alongside multiple species-qualified entries. Hold until the catalog has a reviewed group/species boundary for this term or the picker can distinguish unqualified group searches from exact species queries. Do not work around this by substituting bare `Canary` for the English name.

## Recipe demand and numeric, form, and substitution limits

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `canary rockfish`, `sébaste canari`, *Sebastes pinniger*, `orange rockfish`, `Pacific snapper`, `red snapper`, and `fantail rockfish`. No matching recipe file or ingredient row was found. The existing canary-seed occurrence is unrelated; no recipe link or relink is supported.

DFO’s 789-tonne figure is a BC fishery catch average for 2017–2021, not a recipe quantity, portion, or Québec sales measure. An archived DFO Pacific market guide lists fresh/frozen fillets and secondary portions/sticks, but the retrieved guide does not establish a current date or a Québec seller. Those historical market formats do not justify active ingredient forms. No reviewed source supplies a household measure, unit mapping, density, mass-volume conversion, edible yield, or cooking yield. Add none.

No dish- or method-specific substitution research was performed. Do not infer that Canary rockfish can replace bocaccio, Québec/Acadian/beaked redfish, another rockfish, snapper, cod, salmon, or generic white fish. Add no substitution finding, rule, or recipe-line substitution. Because this is a hold, create no reference or ledger record and add no JSON data.

## Source register

These IDs are local to this proposal; no source or decision is being written into the canonical ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-CANARY-ROCKFISH-R87-20261013-S01` | Office québécois de la langue française, [sébaste canari (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198977/sebaste-canari), last updated 1998. | Identifies *Sebastes pinniger*, gives English `canary rockfish` and `rockfish`, uses the preferred French `sébaste canari`, and calls it a fish with commercial potential in Québec. The dated potential statement does not verify current consumer-market availability. |
| `WP04-SECTIONP-CANARY-ROCKFISH-R87-20261013-S02` | Canadian Food Inspection Agency, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), entries for taxon 166734 and *Sebastes* spp. | Lists *S. pinniger* as `Canary Rockfish / Sébaste Canari`, also lists `Rockfish` and `Pacific Snapper` for *S. pinniger*, and has a separate generic *Sebastes spp.* `Rockfish / Sébaste` row. This is Canadian naming guidance, not evidence of a Québec SKU or culinary interchangeability. |
| `WP04-SECTIONP-CANARY-ROCKFISH-R87-20261013-S03` | Fisheries and Oceans Canada, [Canary Rockfish stock assessment for British Columbia in 2022](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41097312.pdf), Science Advisory Report 2023/002, January 2023. | Confirms the taxon and BC commercial-fishery scope; the summary reports 789 t average catch for 2017–2021. Catch and stock assessment data are not recipe measures or Québec market evidence. No present-day conservation claim is made here. |
| `WP04-SECTIONP-CANARY-ROCKFISH-R87-20261013-S04` | Fisheries and Oceans Canada, [Canary Rockfish species/market guide](https://waves-vagues.dfo-mpo.gc.ca/Library/40582644.pdf), archived DFO library PDF. | Lists fresh/frozen fillets and secondary portions/sticks and calls the species commercially interesting on the Pacific coast. The retrieved source has no verified current date and is not Québec-specific; it does not establish a modern Québec product or reusable recipe form. |

## Static review record

- Re-read current `AGENTS.md`, the exact unchecked Section P line, active references/forms, legacy candidates, ledger, and proposal/batch archive. Confirmed this is distinct from R86 bocaccio and prior rockfish holds.
- Checked exact candidate names and ID ownership across the live data, and checked the proposal-local source-ID prefix against the archive and ledger.
- Reproduced the active phrase-first/fallback behavior from `IngredientSearch.kt` using reference displays, aliases, and all attached form terms; projected both English and Québec French queries before/after a synthetic candidate row.
- Scanned the full **114-recipe / 1,123-row** corpus for the candidate and neighboring terms; found no recipe demand.
- Proposal-only static checks: UTF-8 without BOM, LF, final newline, no trailing whitespace, local Markdown links, and unique source IDs. No JSON delta or schema change is proposed.
- No app tests, Gradle tasks, emulator, or deployment were run. This hold changes no database JSON; the repository rule also says JSON-data-only changes need no tests.
