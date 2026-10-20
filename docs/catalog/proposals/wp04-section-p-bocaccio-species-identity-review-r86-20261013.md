# WP04 Section P — bocaccio species identity review (R86)

- **Review date:** 2026-10-13.
- **Open checklist line:** `[ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.` See the [live Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4233).
- **Recommendation:** Add identity-only `bocaccio / bocaccio` for *Sebastes paucispinis* as `PROTEIN`.
- **Data boundary:** Empty aliases; no forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions.
- **Repository rule:** Proposal-only research. `AGENTS.md` says changes limited to database JSON data need no app tests. No tests, Gradle tasks, emulator, or deployment were run.

## Distinctness and current snapshot

The active checklist includes regional fish and has no focused bocaccio decision. Searches of the current plan, WP04 proposal and batch archive, live references, forms, legacy candidates, and ledger found no prior *Sebastes paucispinis* review or `bocaccio` allocation. This proposal does not reopen the R85 Hiramasa hold, the redfish market-group work, or the yelloweye/yellowmouth rockfish holds. Those neighboring decisions concern other terms or taxa.

The post-R85 snapshot contains **1,417 ingredient references, 104 forms, 63 legacy candidates, and 1,756 ledger records**. The current manifest contains **114 recipes and 1,123 ingredient rows**. Exact normalized ownership checks found no active reference, form label/match term, legacy candidate, or ledger identity record for `bocaccio`, `bocaccio rockfish`, `sébaste bocace`, or *Sebastes paucispinis*. The prospective `ingredient-ref-bocaccio` and source-ID prefix `WP04-SECTIONP-BOCACCIO-R86-20261013-` are unallocated.

Current neighboring catalog ownership is distinct:

| Current owner | Scope | Boundary retained |
|---|---|---|
| `ingredient-ref-quebec-redfish` — `Québec redfish / sébaste du Québec` | Québec-market *Sebastes* group | Keep this broad market identity distinct from a named western Pacific species. |
| `ingredient-ref-acadian-redfish` — `Acadian redfish / sébaste acadien` | *Sebastes fasciatus* | No shared `redfish`, `rockfish`, `sébaste`, or Latin-name alias is proposed. |
| `ingredient-ref-beaked-redfish` — `Beaked redfish / sébaste atlantique` | *Sebastes mentella* | Keep species-specific Atlantic naming separate. |
| `ingredient-ref-sablefish` — `sablefish / morue charbonnière` | *Anoplopoma fimbria* | Do not transfer `rockfish`, `black cod`, or French `sébaste` wording. |

There is no form attached to the prospective identity. The existing related entries and the proposal archive do not allocate `bocaccio` or its scientific name.

## Species and Québec French naming scope

The Canadian Government terminology record for *Sebastes paucispinis* marks English **bocaccio** and French **bocaccio** as correct terms; it also lists **bocaccio rockfish** and **sébaste bocace** as correct. The French CFIA Fish List selector independently includes **Bocaccio** among its French common-name options. DFO’s September 2024 stock update identifies Bocaccio Rockfish as *Sebastes paucispinis* and discusses the species’ British Columbia fishery. Together, these sources support a Canadian English/French identity with the same short display word, not a claim about current Québec retail supply. [S01–S03]

OQLF search did not return a bocaccio-specific entry. OQLF’s existing **sébaste** entry is explicitly a Québec fish-product term for a market group whose named catches are *S. marinus*, *S. fasciatus*, and *S. mentella*; it is not a blanket Québec market name for every *Sebastes*. Use the federal terminology-backed French display **bocaccio**, and do not add `sébaste bocace` as an alias: the alias would cause broad `sébaste` searches to include a non-Québec market species. Do not imply that OQLF has approved `bocaccio` or `sébaste bocace`. [reused WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01]

The 2013 COSEWIC report lists **rock salmon**, **salmon rockfish**, **Pacific red snapper**, **Pacific snapper**, **Oregon red snapper**, and **Longjaws** among other common or market names, and states that some are shared with other species. These names stay out of search aliases. In particular, `rockfish` or `rock salmon` would make broad queries appear species-resolved; `Pacific red snapper` and `Pacific snapper` overlap held snapper terminology; `salmon rockfish` would overlap salmon searches. The report is used only for the documented common-name boundary, not current market or harvest status. [S04]

The 2024 DFO stock update is British Columbia stock evidence. It supports the species and a contemporary managed fishery context, but it does not show that bocaccio is sold to Québec consumers. The reviewed record does not establish a current Québec seller, label, or recipe. Adding the identity therefore records the valid Canadian fish name and its taxon only; it makes no Québec availability, provenance, sustainability, or harvest-permission claim.

## Current ownership and picker projection

`IngredientSearch.kt` normalizes English/French reference names, aliases, and attached form terms, returns complete word-phrase matches first, and uses substring fallback only when no phrase match exists. I projected the current 1,417 references / 104 forms with a synthetic identity that has only the proposed displays `bocaccio / bocaccio` and no aliases or forms.

| Query | Current picker | With proposed row | Boundary |
|---|---|---|---|
| `bocaccio` | No result | **bocaccio / bocaccio** | Exact species-name query selects one identity. |
| `bocaccio rockfish` | No result | No result | Excluded as an alias to avoid making broad `rockfish` a singleton. |
| `sébaste bocace` | No result | No result | Not an alias; no OQLF-specific approval was found. |
| `sébaste` | Québec redfish, Acadian redfish, Beaked redfish | Same three results | No `sébaste` token or prefix alias is introduced. |
| `redfish` | Québec redfish, Acadian redfish, Beaked redfish | Same three results | Do not capture the Québec group or its named species. |
| `rockfish`, `rock salmon` | No result | No result | Other common names are excluded. |
| `Pacific red snapper`, `Pacific snapper`, `red snapper` | No result | No result | Do not reopen or broaden snapper naming. |
| `salmon` | Salmon fillets | Salmon fillets | No salmon-bearing alias is introduced. |
| `fish`, `poisson` | Existing phrase-match sets | Unchanged | `bocaccio` contains neither broad token. |

The proposed bilingual display is the same word in both locales. It does not add unqualified `fish`, `poisson`, `redfish`, `rockfish`, `snapper`, `salmon`, or `sébaste` search terms. Search results for the French query `bocaccio` and English query `bocaccio` resolve to the same identity, while the local redfish terms retain their existing ownership.

## Recipe demand and forms, numeric, and substitution limits

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and their parsed JSON text were scanned for `bocaccio`, `bocaccio rockfish`, `sébaste bocace`, *Sebastes paucispinis*, `rock salmon`, `salmon rockfish`, and the snapper/rockfish market-name variants above. The scan found **zero matching recipe files and zero matching ingredient rows**. The nearby generic seafood placeholder, fish sauce, salmon fillets, and tuna request do not select bocaccio. No recipe link or relink is supported.

No reviewed source establishes a consumer presentation such as fresh, frozen, whole, fillet, smoked, or canned bocaccio. Add no form. DFO’s catch totals, biomass estimates, and biological length observations are stock/fishery evidence, not household measures, portions, densities, edible-yield values, or kitchen conversions. The CFIA and terminology records give names and species, not culinary amounts. No reviewed source provides a transferable quantity, unit mapping, mass-volume conversion, cooking yield, or edible-portion yield. If integrated, use `measurementState: researched_no_supported_value` with no measurement observations or numeric catalog behavior.

No dish/method-specific substitution research was performed. Do not infer replacement for redfish, other rockfish, snapper, salmon, cod, or generic white fish from family membership or shared market context. If integrated, leave `substitutionResearchState: not_yet_researched`; add no substitution finding, rule, or recipe-line substitution.

## Exact proposed database JSON delta

If accepted, add this one identity-only reference to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-bocaccio",
  "nameFr": "bocaccio",
  "nameEn": "bocaccio",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "PROTEIN"
}
```

Add one `ingredient_reference` ledger record for the same ID. This is the complete prospective ledger delta; add no form, measurement observation, conversion, yield, substitution finding, or recipe link.

```json
{
  "recordId": "ingredient-ref-bocaccio",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-BOCACCIO-R86-20261013-S01",
      "url": "https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ptr&lang=eng&srchtxt=SEBASTES+PAUCISPINIS",
      "title": "TERMIUM Plus, Sebastes paucispinis",
      "accessedOn": "2026-10-13",
      "locator": "English and French fish terms for the species record",
      "supports": "Marks English bocaccio and French bocaccio as correct names for Sebastes paucispinis; also lists bocaccio rockfish and sébaste bocace, which are not activated as aliases.",
      "sourceKind": "other",
      "versionOrDate": "Record dated 2014-12-01; page modified 2026-07-09"
    },
    {
      "sourceId": "WP04-SECTIONP-BOCACCIO-R86-20261013-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpsel.asp?cmbIn=f&wbdisable=true",
      "title": "Canadian Food Inspection Agency, Fish List French-name selector",
      "accessedOn": "2026-10-13",
      "locator": "French common-name selection list includes Bocaccio",
      "supports": "Shows Bocaccio in the CFIA French common-name selector. The selector alone does not display a taxon mapping; pair it with the species-linked TERMIUM and DFO sources.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Fish List modified 2023-09-18"
    },
    {
      "sourceId": "WP04-SECTIONP-BOCACCIO-R86-20261013-S03",
      "url": "https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41260284.pdf",
      "title": "Fisheries and Oceans Canada, Update of the 2019 Bocaccio (Sebastes paucispinis) Stock Assessment for British Columbia in 2024",
      "accessedOn": "2026-10-13",
      "locator": "September 2024 report title and Context, pages 0–1; species and BC stock/fishery scope",
      "supports": "Identifies Bocaccio Rockfish as Sebastes paucispinis and reports a British Columbia stock-assessment/fishery context. Stock biomass, catch, and biological length data are not recipe quantities or evidence of Québec consumer availability.",
      "sourceKind": "regional_authority",
      "versionOrDate": "DFO Science Response 2024/033, September 2024"
    },
    {
      "sourceId": "WP04-SECTIONP-BOCACCIO-R86-20261013-S04",
      "url": "https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/bocaccio-2013.html",
      "title": "COSEWIC, Bocaccio (Sebastes paucispinis) assessment and status report",
      "accessedOn": "2026-10-13",
      "locator": "Species description, common/market-name list, and note that some names are shared",
      "supports": "Confirms the binomial and records other names including Pacific red snapper, Pacific snapper, rock salmon, and salmon rockfish, some shared with other species. Used to exclude those broad market terms, not to claim current market availability or status.",
      "sourceKind": "regional_authority",
      "versionOrDate": "2013 status report"
    },
    {
      "sourceId": "WP04-FINFISH-ID-20261009-S06",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "Canadian Food Inspection Agency, Guidance on determining the common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-09",
      "locator": "CFIA Fish List scope and species naming guidance.",
      "supports": "Describes the Canadian Fish List as a source of English/French common names tied to fish species.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste",
      "title": "Office québécois de la langue française, sébaste (GDT)",
      "accessedOn": "2026-10-12",
      "locator": "Zoology/ichthyology and edible-fish domains; preferred Québec term, market scope, catch note, and English terms.",
      "supports": "Normalizes sébaste for Québec fish marketing, pairs it with English redfish and Sebastes sp., and reports that Québec catches include S. marinus, S. fasciatus, and S. mentella. The entry's composition is a 2012 snapshot and does not identify a particular retail fillet.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only bocaccio / bocaccio for Sebastes paucispinis, with no aliases. TERMIUM and the CFIA French-name list support the bilingual display, while DFO and COSEWIC support the taxon. Keep sébaste bocace, bocaccio rockfish, and the shared Pacific red snapper/snapper/rock-salmon names outside the picker. The reviewed sources and bundled recipes establish no reusable measures, forms, yields, conversions, or recipe links; no substitution research is claimed.",
      "sourceIds": [
        "WP04-SECTIONP-BOCACCIO-R86-20261013-S01",
        "WP04-SECTIONP-BOCACCIO-R86-20261013-S02",
        "WP04-SECTIONP-BOCACCIO-R86-20261013-S03",
        "WP04-SECTIONP-BOCACCIO-R86-20261013-S04",
        "WP04-FINFISH-ID-20261009-S06",
        "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01"
      ]
    }
  ]
}
```

If accepted, counts would become **1,418 references, 104 forms, 63 legacy candidates, and 1,757 ledger records**; recipe counts and rows remain 114 / 1,123.

## Source register

New source IDs use the unallocated prefix `WP04-SECTIONP-BOCACCIO-R86-20261013-`. The CFIA naming guidance and OQLF `sébaste` source are reused from their existing ledger records; they are not new source registrations.

| Source ID | Source | Evidence and limits |
|---|---|---|
| WP04-SECTIONP-BOCACCIO-R86-20261013-S01 | TERMIUM Plus, [Sebastes paucispinis](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ptr&lang=eng&srchtxt=SEBASTES+PAUCISPINIS), record dated 2014-12-01. | Marks English `bocaccio` and French `bocaccio` as correct, and lists other terms including `bocaccio rockfish` and `sébaste bocace`. Federal terminology evidence, not a Québec retail product or proof of OQLF approval. |
| WP04-SECTIONP-BOCACCIO-R86-20261013-S02 | CFIA, [French Fish List name selector](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpsel.asp?cmbIn=f&wbdisable=true). | Includes `Bocaccio` in the French common-name selector. The selector is not a species-result table; use TERMIUM and DFO for the species mapping. The Fish List reports modification date 2023-09-18. |
| WP04-SECTIONP-BOCACCIO-R86-20261013-S03 | Fisheries and Oceans Canada, [Bocaccio stock-assessment update for British Columbia in 2024](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41260284.pdf), Science Response 2024/033. | Identifies *Sebastes paucispinis* and scopes its stock/fishery data to British Columbia. Stock statistics do not establish a Québec consumer product or recipe quantity. |
| WP04-SECTIONP-BOCACCIO-R86-20261013-S04 | COSEWIC, [Bocaccio (*Sebastes paucispinis*) assessment and status report](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/bocaccio-2013.html), 2013. | Identifies the species, lists several shared common/market names, and says bocaccio is also used in French. Used only to keep those broad alternates out of aliases; not current market or harvest evidence. |
| Reused WP04-FINFISH-ID-20261009-S06 | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Says the CFIA Fish List provides Canadian English/French common names tied to fish species. Naming guidance, not recipe equivalence. |
| Reused WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01 | OQLF, [sébaste (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste), last updated 2012. | Québec-specific scope for bare `sébaste`; identifies the Québec catch group and its named species. It does not assign that Québec product term to bocaccio. |

## Static review record

- Re-read current `AGENTS.md`, the exact open Section P parent line, post-R85 live references/forms/legacy/ledger, and the proposal/batch archive. No duplicate bocaccio candidate or decision was found.
- Checked exact name/ID ownership and the proposal-local source-ID prefix across active data, ledger, and archive.
- Reproduced current phrase-first/fallback picker behavior from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including current reference displays, aliases, and all attached form terms; projected each listed query before and after a synthetic row.
- Scanned all **114** manifest-listed recipe files and **1,123** ingredient rows for the candidate, binomial, and neighboring names; zero candidate demand was found.
- Static proposal checks: UTF-8 without BOM, final newline, LF, no trailing whitespace, local Markdown links, unique source IDs, and parse/schema validation of both JSON snippets.
- No app tests, Gradle tasks, emulator, or deployment were run; this is proposal-only, and the eventual integration is limited to database JSON data.
