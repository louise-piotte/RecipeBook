# WP04 Section P — bream and sea-bream market-name groups (R604)

- **Review date:** 2026-10-18.
- **Checklist:** Open Section P finfish item: salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.
- **Recommendation:** Represent generic `bream / brème` and marine `sea bream / dorade` as two distinct identity-only market-name groups. Each visible display says the name is used for multiple fish species.
- **Scope:** This review covers broad common-name searches only. It does not assign a taxon, species, product state, recipe link, measure, form, conversion, yield, or substitution.
- **Status:** Integrated. The accepted rows, ledger decisions, checklist sub-item, roadmap entry, and static checks are recorded in the [R604 integration README](../batches/wp04-section-p-bream-sea-bream-market-group-integration-r604-20261018/README.md).

## Name boundary

The CFIA Fish List uses `Bream / Brème` for *Abramis brama*, `Bream / Bogue` for *Boops boops*, and `White Amur Bream / Brème` for *Parabramis pekinensis*. It also lists several marine Sparidae under `Sea Bream` or `Seabream`, including *Pagellus acarne*, *Pagrus auratus*, *P. caeruleostictus*, *P. major*, and *P. pagrus*. French rows include `Dorade` for *P. auratus* and `Dorade Japonaise` for *P. major*. OQLF separately identifies *Sparus aurata* as `dorade royale`, with `gilthead bream` as its English name. These entries show that the broad English and French wording spans several distinct fish identities. They are accepted fish-labelling names, not a culinary equivalence or substitution standard. [S01–S02]

Keep generic `bream / brème` separate from marine `sea bream / dorade`. An English `bream` search can find both groups because `bream` is part of the compound name `sea bream`; the visible qualifier preserves both scopes in the picker. The French terms remain paired according to CFIA's displayed names: `brème` for the broad bream group and `dorade` for the marine sea-bream group. This pairing does not claim the French words are synonyms.

The prior [gilthead-bream hold](wp04-section-p-gilthead-bream-dorade-royale-picker-boundary-review-20261012.md) remains species-scoped. This integration adds no *Sparus aurata* identity or alias; `gilthead bream` and `dorade royale` remain outside the active catalog.

## Picker scope and active rows

The localized display retains a visible multi-species qualifier. No aliases are required: the display names themselves cover the broad queries.

| Query | Integrated result | Boundary |
|---|---|---|
| `bream` | `bream (name used for multiple fish species)` and `sea bream (name used for multiple fish species)` | The two visibly distinct name groups preserve the broad and marine scopes. Neither selects a taxon. |
| `sea bream` | The sea-bream group | No specific Sparidae is selected. |
| `brème` | The bream group | Keep this French label distinct from `dorade`. |
| `dorade` | The sea-bream group | The qualifier states that the name covers multiple fish species. |
| `gilthead bream`, `dorade royale`, `daurade royale` | No result added by this integration | Do not turn the broad groups into a species identity or alias. |
| `porgy`, `brème commune`, `Dorade Japonaise` | No result added by this integration | These remain source-specific names outside the groups' search terms. |

Accepted identity-only rows:

| ID | English display | Québec French display | Category |
|---|---|---|---|
| `ingredient-ref-bream-market-group` | `bream (name used for multiple fish species)` | `brème (nom utilisé pour plusieurs espèces de poissons)` | `PROTEIN` |
| `ingredient-ref-sea-bream-market-group` | `sea bream (name used for multiple fish species)` | `dorade (nom utilisé pour plusieurs espèces de poissons)` | `PROTEIN` |

Both rows have empty alias lists, null density, and empty unit mappings. They have no taxon, forms, measures, recipe links, conversions, yields, or substitutions. A future species-specific fish or product needs its own source-backed identity.

## Recipe demand and numeric behavior

The manifest-listed bundle contains 114 recipe files and 1,123 ingredient rows. A whole-phrase scan for `bream`, `brème`, `sea bream`, `seabream`, `dorade`, `daurade`, `porgy`, `brème commune`, `dorade royale`, and `gilthead bream` found no matches. No recipe link or numeric behavior follows from the bundled recipes. The CFIA retail-labelling names and the OQLF terminology entry provide no kitchen measure, edible yield, conversion, or substitution rule.

## Ownership and archive check

Before integration, neither proposed reference ID was present in active references, forms, or research-ledger record IDs. A scan of active fish reference and form names found no existing `bream`, `brème`, `sea bream`, `seabream`, `dorade`, `daurade`, or `porgy` owner. The CFIA source allocation `WP04-SECTIONP-BREAM-MARKET-GROUP-R604-20261018-S01` is new. OQLF source allocation `WP04-P-GILTHEAD-BREAM-20261012-S02` is reused from the existing gilthead-bream proposal and has been rechecked for this review.

## Sources

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-SECTIONP-BREAM-MARKET-GROUP-R604-20261018-S01` | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). Rows include *Abramis brama* (Bream / Brème), *Boops boops* (Bream / Bogue), *Parabramis pekinensis* (White Amur Bream / Brème), multiple Sparidae with Sea Bream / Seabream wording, *Pagrus auratus* (Silver Seabream / Dorade), *Pagrus major* (Japanese Seabream / Dorade Japonaise), and *Sparus aurata* (Gilthead Bream / Dorade Royale). | The Fish List is for Canadian fish labelling. It does not establish that these taxa are interchangeable in recipes. The list's displayed modification date is 2023-09-18. |
| Reused `WP04-P-GILTHEAD-BREAM-20261012-S02` | OQLF, [GDT: dorade royale](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199006/dorade-royale). Identifies *Sparus aurata* and gives the Québec-preferred qualified term `dorade royale`. | Last updated in 2011. This is terminology evidence for one qualified species name, not evidence of current product availability or a broad culinary equivalence. |

## Integration decision

Add the two explicitly qualified, species-neutral market-name groups listed above. Keep `bream / brème` separate from `sea bream / dorade`; retain the gilthead-bream hold as a species-specific decision. The Section P parent checklist remains open.
