# WP04 Section P R637 — Northern searobin / *Prionotus carolinus* identity review

- **Status:** Accepted and integrated 2026-10-18. The identity reference, evidence ledger row, generated picker projection, plan, roadmap, and workflow log are updated; no recipe or app logic changed.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** The broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6536).
- **Candidate:** Northern searobin, *Prionotus carolinus* (DFO species code 800; CFIA lists the genus *Prionotus* spp. under TSN 166973).
- **Revised recommendation:** **Advance a bounded species identity** for *P. carolinus*, using English `Northern searobin` and Québec French `grondin` as the primary picker names, with no aliases. OQLF's species-level commercial terminology entry explicitly identifies *P. carolinus*, normalizes `grondin` for Québec fish-product commercialization, and gives `northern searobin` as an English translation. CFIA's `Searobin` remains a genus-level name for *Prionotus* spp.; it is not the basis for broadening the reference. The picker will match `searobin` through the English primary name, so the result must remain visibly species-qualified. The spaced query `sea robin` will not match this closed-compound English spelling, keeping the unrelated `Houbou Sea Robin` menu wording outside the candidate.
- **Scope:** This reviews only *P. carolinus* and its common-name boundary. It does not reopen R618, R622, R626, R630, or R633, and does not propose a general gurnard/grondin market group.

## Evidence and identity boundary

Fisheries and Oceans Canada's species-code report lists `northern searobin / prionote du nord` for *Prionotus carolinus*. DFO's Atlantic-coast species account also uses `prionote du nord` and reports Canadian records limited to the Bay of Fundy. These establish the taxon and an English species-qualified name; DFO's French common name is useful taxonomic evidence but is not the proposed Québec commercial display. [S02, S03]

CFIA's Fish List gives *Prionotus* spp. (TSN 166973) the English label `Searobin` without a French label, and separately pairs `Gurnard / Grondin` with that genus. It also applies `Gurnard / Grondin` to other taxa, including *Chelidonichthys cuculus*, *C. spinosus*, *Eutrigla gurnardus*, *Lepidotrigla argus*, and *Trigloporus lastoviza*. This is a broader Canadian genus-level label, not a competing species-level identity. Its scope means a bare `searobin` query is broader than *P. carolinus*; the proposed display therefore remains `Northern searobin`, and the record is not a genus-wide market group. [S01, WP04-FINFISH-GAPS-20261010-S11]

The earlier OQLF edible-fish entry for generic `grondin` concerns family Triglidae and gives `gurnard` / *Trigla*; by itself it would not qualify a species-level picker result. [S04] However, the newly reviewed OQLF GDT fiche 1199013 is explicitly species-level: its Latin term is *Prionotus carolinus*; its note calls this a fish species with commercial potential in Québec; and its preferred term is `grondin`, normalized by OQLF for Québec fish-product commercialization. OQLF says `trigle` and `prionote` were not retained in this commercial context to avoid consumer-label confusion, because one term corresponding to a specific species is normalized. Its English translations include `northern searobin`, `common searobin`, `searobin`, and `gurnard`. This evidence directly supplies the Québec product name absent from the earlier review. [S07]

Zen Japanese Restaurant's first-party Markham menu dated April 13, 2025 lists `Houbou Sea Robin, Hyogo` under seasonal fresh catch. It gives a Japanese source region but no scientific name or French product name. The current menu does not list Sea Robin. This dated listing does not identify *P. carolinus* and is not evidence against OQLF's species-specific Québec product designation; it does support keeping the spaced phrase `sea robin` out of the proposed primary name and aliases. [S05, S06]

## Exact disposition

**Integrated bounded catalog delta:**

```json
{
  "id": "ingredient-ref-northern-searobin",
  "nameFr": "grondin",
  "nameEn": "Northern searobin",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "PROTEIN"
}
```

This is one species identity, *P. carolinus*, not a `Searobin`, `Gurnard`, or `Grondin` market group. Keep `prionote du nord` as DFO taxonomic evidence rather than a picker alias because OQLF specifically says `prionote` was not retained for Québec fish-product commercialization. Do not add `sea robin`, `searobin`, `common searobin`, `gurnard`, or scientific-name aliases; the primary `Northern searobin` already has source support. Do not add a form, measurement, density, unit mapping, recipe link, conversion, yield, or substitution.

The catalog can show the species-qualified English primary name while honoring OQLF's Québec commercial French term. The current search matcher will still return this record for bare `searobin` because that token is part of the primary English name; this does not make the row a genus-wide identity, and the visible result stays species-qualified. The closed-compound spelling does not match the separate phrase `sea robin` from the Houbou menu. A future genus/group record would need its own scope evidence. No recipe demand or culinary behavior is inferred.

## Active ownership, picker behavior, and recipe demand

The pre-integration read-only snapshot contained **1,828 active ingredient references**, **159 forms**, **56 legacy-import identities**, **2,199 research-ledger records**, and **114 bundled recipes**. Exact searches found no active reference, form, legacy candidate, or identity-record owner for *Prionotus carolinus*, `Northern searobin`, `Northern sea robin`, `prionote du nord`, `Searobin`, `Sea Robin`, `Houbou`, or the proposed `ingredient-ref-northern-searobin`, `candidate-northern-searobin`, and R637 source-ID prefix. The archive and plan search found no prior focused *Prionotus* or sea-robin identity review. [R01]

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) search first matches complete normalized word phrases and then falls back to substring matches. These queries currently return **no active result**:

| Query | Before integration | After integration |
|---|---|---|
| `sea robin` | None | Still none: the primary is the closed-compound `Northern searobin`; no spaced alias is proposed. |
| `searobin` | None | Matches *P. carolinus* via the primary `Northern searobin`. CFIA uses bare `Searobin` at genus scope, while the visible picker result remains species-qualified and the row does not claim all genus members. |
| `northern searobin` | None | Matches the DFO and OQLF species-supported primary name. |
| `grondin` | None | Matches the OQLF-normalized Québec fish-product name specifically tied to *P. carolinus*; do not generalize it to a family market group. |
| `prionote du nord`; `gurnard`; *Prionotus carolinus* | None | No aliases proposed: OQLF excludes `prionote` from this commercial naming context; `gurnard` is broader; the binomial remains research evidence. |

The manifest-ordered scan covered **all 114 recipe files and 1,123 structured ingredient rows**, as well as complete recipe JSON text, for *Prionotus carolinus*, `northern searobin`, `Northern sea robin`, `prionote du nord`, `searobin`, `sea robin`, `Houbou`, `gurnard`, and `grondin`. It found **zero recipe-file matches and zero ingredient-row matches**. No recipe link or candidate-specific culinary behavior is supported. [R01]

## Source-ID and URL ownership

Before integration, the R637 source IDs were proposal-local. The CFIA overview ID is reused; the exact CFIA query URL, OQLF fiche 1199013, DFO species-code report, Zen 2025 menu PDF, and current Zen menu page had no exact URL owner in the shared ledger. The DFO Atlantic-coast book URL is already present under the Atlantic-bonito and black-drum source IDs for different species locators; it was not duplicated. The unfiltered CFIA results endpoint also has many owners; the exact R637 query URL is distinct. The OQLF species fiche is now registered in the shared ledger with its source evidence because the identity delta is integrated. [R01]

| ID | Source and evidence | Ownership and limit |
|---|---|---|
| **New `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S01`** | CFIA, [Fish List query for Searobin](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Searobin). Lists *Prionotus* spp. `Searobin` and `Gurnard / Grondin`. | Exact query URL has no owner. The unfiltered results endpoint is shared by other records. Canadian fish-labelling terminology; the row is genus-level and leaves French blank for `Searobin`. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing shared source ID reused for the Canadian fish-name / taxon scope; not evidence of retail availability. |
| **New `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S02`** | Fisheries and Oceans Canada, [species-code report](https://publications.gc.ca/collections/collection_2014/mpo-dfo/Fs97-13-1254.pdf), row 800. Pairs *Prionotus carolinus* with `northern searobin / prionote du nord`. | No exact URL or source-ID owner. Official species/name record; not current Québec market evidence. |
| **Proposal-local `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S03`** | Fisheries and Oceans Canada, [*Poissons de la côte Atlantique du Canada*](https://waves-vagues.dfo-mpo.gc.ca/Library/110180_P2.pdf), *P. carolinus* species entry. | Exact URL is already owned by `WP04-P-ATLANTIC-BONITO-20261012-R3-S04` and `WP04-P-BLACK-DRUM-BOUNDARY-20261013-R2-S05`, with other species locators. DFO describes the French name and rare Bay of Fundy records; it does not establish market supply. |
| **New `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S04`** | OQLF, [GDT: grondin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3297715/grondin). Edible-fish entry for family Triglidae; English `gurnard`, Latin *Trigla*. | No exact URL or source-ID owner. Generic family-level terminology only; no *P. carolinus* entry. |
| **New `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S05`** | Zen Japanese Restaurant, Markham, [first-party dine-in menu dated 2025-04-13](https://static1.squarespace.com/static/5b46405ff93fd4c178abe0d1/t/67fc4c8dd48e0a4089adff18/1744587917467/Dine-In%2BMenu%2B04.13.2025.pdf). Lists `Houbou Sea Robin, Hyogo` as a seasonal fresh catch. | No exact URL or source-ID owner. Canadian restaurant wording and product origin; no binomial or French label, and the menu is dated. |
| **New `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S06`** | Zen Japanese Restaurant, [current first-party menu](https://zenjapaneserestaurant.com/en/menu/). Lists the current menu and its change notice. | No exact URL or source-ID owner. Context for the dated 2025 menu only; the page does not identify current Sea Robin availability. |
| **New `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S07`** | OQLF, [GDT: grondin, fiche 1199013](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199013/grondin). Identifies *Prionotus carolinus*, marks it as a fish species with commercial potential in Québec, normalizes `grondin` for fish-product commercialization, rejects `trigle`/`prionote` in that context, and translates it with `northern searobin` among other English terms. | Exact URL and proposal-local ID have no shared-ledger owner. Species-specific Québec naming evidence; not evidence of current inventory at a particular retailer. |
| **R01** | Read-only audit of the current references/forms, legacy candidates, research ledger and source ownership, Section P plan, roadmap, archive, picker behavior, manifest, and all bundled recipes. | Repository evidence only. No shared file was modified. |

## Final recommendation

**Added the bounded species identity.** OQLF fiche 1199013 resolves the previous Québec commercial-name gap with `grondin` tied to *P. carolinus*; DFO and OQLF support `Northern searobin` in English. CFIA’s genus-level `Searobin` and `Gurnard / Grondin` rows remain picker-scope context, so the row has no aliases or group expansion. The Houbou menu item remains an unidentified, separate spaced `Sea Robin` usage. The 114-recipe corpus has no demand, so no recipe link or culinary behavior was added. Measurement and substitution research remain open. Section P remains open for other regional fish.

This database-JSON-only integration needed no software tests under `AGENTS.md`. Static validation covers package normalization, generated index, ledger/source ownership, picker projection, recipe corpus, local links, UTF-8/no-BOM, and scoped whitespace.
