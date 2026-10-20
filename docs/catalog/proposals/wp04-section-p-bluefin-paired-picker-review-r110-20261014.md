# WP04 Section P — Atlantic/Pacific bluefin paired picker review (R110)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** Proposal-only species identity, bilingual market-name, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Integrate Atlantic bluefin tuna / `thon rouge de l’Atlantique` (*Thunnus thynnus*) and Pacific bluefin tuna / `thon rouge du Pacifique` (*T. orientalis*) together as two alias-free, identity-only `PROTEIN` references. A Pacific-only row would still make shared `bluefin` and `thon rouge` searches select one species. The paired rows make those queries return both species.
- **Integration status:** Accepted as a paired identity-only addition. The reference JSON, research ledger, generated index, plan, roadmap, and batch README now record both rows. Recipes and runtime behavior were not changed. No app tests or emulator checks were run because the data changes only add database JSON and generated catalog entries under the updated `AGENTS.md` rule.

## Why this is one open Section P gap

The Section P finfish checklist remains open. The 2026-10-14 Atlantic-bluefin R101 review held *T. thynnus* outside the picker because Canadian name sources apply broad `Bluefin Tuna` and `Thon Rouge` wording to both *T. thynnus* and *T. orientalis*. R101 explicitly left a paired Pacific-bluefin review as the route to revisit that hold. This packet completes that paired name and picker review; it does not reopen the generic `tuna / thon` recipe link or the separate yellowfin-tuna identity. The recently integrated R109 pompano market group is unrelated.

The paired allocation is the minimum scope that prevents an unqualified `bluefin` or `thon rouge` search from looking species-specific. It does not claim to exhaust all taxa whose names contain `bluefin`: CFIA also lists Southern Bluefin Tuna (*Thunnus maccoyii*), which remains a separate Section P identity review. Do not assign that species’ name to either proposed row.

## Identity and Québec/Canadian name boundary

CFIA’s current Fish List returns separate taxon rows and TSNs for *T. thynnus* (172421) and *T. orientalis* (172422). For both taxa it lists broad `Bluefin Tuna` wording; the French rows include `Thon Rouge` for the Atlantic taxon and `Thon` for Pacific rows, with `Thon Rouge` also appearing on a Pacific `Oriental Tuna` row. The qualified CFIA rows include Atlantic names `Atlantic Bluefin Tuna` and `Northern Bluefin Tuna`, with `Thon Rouge De L’Atlantique`, plus the paired Pacific name `Pacific Bluefin Tuna / Thon Rouge Du Pacifique`. DFO and TERMIUM also support the proposed display pair `Atlantic bluefin tuna / thon rouge de l’Atlantique`. TERMIUM Plus records `thon rouge` as shared or historically used across the Atlantic and Pacific taxa. OQLF’s 2012 entry for `thon rouge` reflects older subspecies nomenclature and says those forms were not commercially distinguished; that historical note is retained as a terminology limitation, not used to merge the two currently distinct CFIA taxa.

| Proposed ID | Category | English display | fr-CA display | Aliases | Taxon scope |
|---|---|---|---|---|---|
| `ingredient-ref-atlantic-bluefin-tuna` | `PROTEIN` | `Atlantic bluefin tuna` | `thon rouge de l’Atlantique` | None | *Thunnus thynnus* |
| `ingredient-ref-pacific-bluefin-tuna` | `PROTEIN` | `Pacific bluefin tuna` | `thon rouge du Pacifique` | None | *Thunnus orientalis* |

The display strings already contain the useful qualified phrases. Keep aliases empty: do not add bare `bluefin`, `bluefin tuna`, `thon rouge`, `thon`, `Oriental Tuna`, or the older unqualified/northern names as aliases. Do not assign the obsolete combination *T. thynnus orientalis* to either row; TERMIUM lists it as historical nomenclature for the Pacific fish, while CFIA now assigns a separate TSN and species row to *T. orientalis*. Do not add `Southern Bluefin Tuna / thon rouge du Sud` here; it is a distinct third taxon and is outside this paired review.

## Exact ownership and prior-work audit

The read-only ownership snapshot contains 1,449 active references, 105 forms, 63 legacy-import candidates, and 1,789 research-ledger records. The two proposed reference IDs and qualified display phrases have no active reference, form, legacy-candidate, or dedicated ledger owner. The active tuna references are only `ingredient-ref-tuna` (`tuna / thon`) and `ingredient-ref-yellowfin-tuna` (`yellowfin tuna / thon à nageoires jaunes`). No tuna-specific form is active. The ledger contains the broader unresolved `candidate-wp04-tuna-species-scope`; it does not allocate either proposed species identity.

The archive audit found R101 as the Atlantic singleton hold and no dedicated Pacific-bluefin proposal or integration. R101’s cross-taxon name evidence is relevant background, not a previous Pacific identity decision. Before this file was written, the source-ID prefix `WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-` was absent from the ledger and proposal/batch archive; the listed sources are now recorded on the accepted ledger entries.

| Proposed allocation or term | Active reference owner | Form/legacy owner | Ledger/archive result |
|---|---|---|---|
| `ingredient-ref-atlantic-bluefin-tuna` / `ingredient-ref-pacific-bluefin-tuna` | None | None | No species-specific record or ID allocation. |
| `Atlantic bluefin tuna`, `thon rouge de l’Atlantique`, *T. thynnus* | None | None | Only R101’s held Atlantic candidate review; no active identity. |
| `Pacific bluefin tuna`, `thon rouge du Pacifique`, *T. orientalis* | None | None | R101 mentions it as the adjacent taxon but does not decide its row or integration. |
| `bluefin`, `bluefin tuna`, `thon rouge` | None as active names | None | Broad tuna-scope ledger evidence only; no dedicated row owner. |
| `WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S01`–`S08` | — | — | Prefix unused before this proposal. |

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases rank before substring fallback. I applied that phrase-matching behavior to the current bilingual references and to two hypothetical alias-free rows. This is a static projection, not a UI test.

| Query | Current results | With both proposed rows | Effect |
|---|---|---|---|
| `Atlantic bluefin tuna`, `thon rouge de l’Atlantique` | None | Atlantic row only | Qualified term selects *T. thynnus*. |
| `Pacific bluefin tuna`, `thon rouge du Pacifique` | None | Pacific row only | Qualified term selects *T. orientalis*. |
| `bluefin`, `bluefin tuna`, `thon rouge` | None | Both rows | Broad shared terms stay visibly multi-result. |
| `tuna`, `thon` | Generic tuna and yellowfin tuna | Those two plus both proposed rows | The general tuna choices remain available; recipe 111 is not assigned to a species. |
| `Southern Bluefin Tuna`, `thon rouge du Sud` | None | None | Southern bluefin remains a separate, unreviewed identity. |

No form term or additional alias is needed for the qualified choices. The broad-result projection covers the Atlantic/Pacific conflict that caused R101’s hold; it is not a claim that the current catalog already covers every tuna species in CFIA’s list.

## Bundled recipe demand

All 114 files listed in the bundled manifest and all 1,123 ingredient rows were scanned for `bluefin`, `bluefin tuna`, `Atlantic bluefin`, `Pacific bluefin`, `thon rouge`, `thon rouge de l’Atlantique`, `thon rouge du Pacifique`, *Thunnus thynnus*, and *Thunnus orientalis*.

**Result: zero species-specific or bluefin phrase hits in recipe files or ingredient rows.** The bundle has one generic tuna line: recipe 111’s `1 tuna steak`, still linked to `ingredient-ref-tuna`. It has no species label, product source, or taxon. The separate Anova measurement observation in the ledger describes tuna steaks generically and cannot be reassigned to either bluefin species. Do not add or change recipe links.

## Product, measurement, and substitution limits

Québec wholesaler JANS Seafood’s current product page lists farmed Pacific bluefin (*T. orientalis*) as fresh headed-and-gutted fish, with 40/60 kg, 60/80 kg, and 80/100 kg size bands. Its off-season section separately lists Canadian wild-caught Atlantic bluefin (*T. thynnus*) as fresh headed-and-gutted, with supplier size bands and an August–November season. This is direct Québec trade evidence for both taxa and shows why the seller’s broad `Bluefin` wording cannot identify one species by itself. These whole-fish size bands and package descriptions are supplier-specific grades, not kitchen measures, transferable portion weights, or app forms. They do not establish current stock on the access date.

Health Canada’s CNF food code 3079 is titled `Fish, tuna, bluefin, fresh, raw` and lists a 90 g Food Guide serving, but the entry does not identify Atlantic or Pacific species. Keep it as a generic-bluefin observation only; do not attach it to either species row. No reviewed source supplies a species-specific density, cup/volume mapping, count-to-mass value, edible yield, cooking yield, or reusable serving conversion. If integrated, both rows should keep null default density and empty unit mappings, with no forms, package-yield rules, conversions, or active numeric values.

The scoped review found no dish-, role-, or method-specific substitution evidence between Atlantic and Pacific bluefin, either species and generic tuna, or either species and another fish. The generic sous-vide tuna recipe does not establish species interchangeability. Add no global or contextual substitution. Keep substitution evidence at `not_yet_researched` unless a later focused source review supports a narrower finding.

## Integrated reference shape

The two identity-only references were added together:

```json
[
  {
    "id": "ingredient-ref-atlantic-bluefin-tuna",
    "nameEn": "Atlantic bluefin tuna",
    "nameFr": "thon rouge de l’Atlantique",
    "aliasesEn": [],
    "aliasesFr": [],
    "defaultDensity": null,
    "unitMappings": [],
    "category": "PROTEIN"
  },
  {
    "id": "ingredient-ref-pacific-bluefin-tuna",
    "nameEn": "Pacific bluefin tuna",
    "nameFr": "thon rouge du Pacifique",
    "aliasesEn": [],
    "aliasesFr": [],
    "defaultDensity": null,
    "unitMappings": [],
    "category": "PROTEIN"
  }
]
```

The ledger now has a separate verified identity record for each ID, with no measurement observations or substitution findings. No species-specific kitchen value was transferred; supplier grades and the generic CNF portion remain bounded evidence. The existing generic tuna candidate and recipe 111 link are unchanged. Section P remains open.

## Sources

Sources were opened or rechecked on 2026-10-14. These source IDs are recorded on the two accepted research-ledger entries.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S01** | CFIA, [Fish List tuna query](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna) | Lists separate TSNs and scientific names for *T. thynnus* and *T. orientalis*, with their broad and qualified English/French names. Fish-labelling evidence, not recipe intent. The list reports a 2023-09-18 modification date. |
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes the Fish List’s Canadian English/French common names and corresponding scientific names/TSNs for fish labelling. It does not establish a recipe resolver or culinary interchangeability. |
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S03** | Government of Canada Translation Bureau, [TERMIUM Plus search for *Thunnus thynnus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frb&lang=eng&srchtxt=THUNNUS+THYNNUS) | The fish record gives `Pacific bluefin tuna` / `thon rouge du Pacifique`, lists *T. orientalis* and the older *T. thynnus orientalis* name, and notes that `thon rouge` is also used for *T. thynnus*. Terminology record dated 2010-04-08; it is name-boundary evidence, not current market stock. |
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S04** | Fisheries and Oceans Canada, [Bluefin Tuna profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-eng.html) and [French Thon rouge profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-fra.html) | Identifies Atlantic Bluefin Tuna / thon rouge as *T. thynnus*. Species-profile evidence; the current CFIA rows in S01 provide the qualified Canadian bilingual fish-label names. |
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S05** | OQLF, [GDT: thon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge) | Preferred Québec fish-product term and English `bluefin tuna`; the entry was last updated in 2012 and describes the older two-subspecies commercial treatment. Retained to explain the historic broad-name collision, not to merge current CFIA species rows. |
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S06** | Fisheries and Oceans Canada, [Pacific tuna 2025–2026 integrated fisheries management plan summary](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/tuna-thon-ifmp-pgip-sm-eng.html) | Names Pacific Bluefin Tuna (*T. orientalis*) among incidental catch in the Canadian north-Pacific albacore fishery and says the Canadian Pacific tuna fishery focuses on albacore. This supports a Canadian taxon/occurrence boundary, not a directed commercial fishery or current retail availability. |
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S07** | JANS Seafood (Saint-Laurent, Québec), [All products](https://www.jansseafood.ca/all-products) | Lists farmed *T. orientalis* and wild-caught Canadian *T. thynnus* under broad `Bluefin` wording, with source-specific product states, origins, seasons, package descriptions, and fish-size grades. Commercial listing evidence only; no general form, kitchen portion, or stock guarantee. |
| **WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S08** | Health Canada, [Canadian Nutrient File serving portion 3079](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3079) | Gives a 90 g Food Guide portion for generic raw `bluefin` tuna. The record does not identify a species, so the value is not assigned to either proposed reference. |

## Static review record

- Re-read the Section P checklist, current reference/form package, research ledger, legacy identities, R101 proposal/batch, and nearby tuna identity/scope proposals.
- Checked both proposed IDs, names, aliases, forms, ledger entries, and source-ID prefix for existing ownership; only the generic tuna species-scope candidate and R101’s held Atlantic review were relevant prior records.
- Projected current and paired picker results using the repository’s phrase-first word matching behavior.
- Scanned the 114 manifest-listed recipe files and 1,123 ingredient rows; found no bluefin/species-name demand and one unchanged generic tuna line.
- The proposal and integration documentation are UTF-8 text with no BOM and final newlines. Static reference normalization, bundled-package validation, generated-index freshness, ledger validation, picker projection, recipe scan, and local documentation checks passed. No app tests or emulator checks were run because the active changes only add database JSON data and generated catalog entries.
