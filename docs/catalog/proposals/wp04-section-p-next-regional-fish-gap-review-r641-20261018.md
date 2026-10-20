# WP04 Section P R641 — Bowfin / *Amia calva* identity review

- **Status:** Accepted and integrated on 2026-10-18 as an identity-only reference and evidence record.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** The broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6536).
- **Candidate:** Bowfin, *Amia calva* (CFIA TSN 161104).
- **Recommendation:** Advance one bounded, identity-only reference using English `Bowfin` and Québec French `poisson-castor`, with the CFIA spelling `Bow Fin` as an English alias. The Québec term and species pairing are supported by OQLF's fish-product terminology record; the Fish List independently supports the bilingual pairing. This recommendation does not claim present retail availability.
- **Scope:** This review concerns only *A. calva*. It does not reopen R618, R622, R626, R630, R633, or R637, and it makes no change to the separate spiny dogfish hold. The older dogfish review mentions *A. calva* only as a Fish List name-collision example; it did not allocate Bowfin or review its Québec French name.

## Identity and Québec naming evidence

The Canadian Food Inspection Agency (CFIA) Fish List result for *Amia calva* (TSN 161104) gives `Bow Fin / Poisson-castor`. It also associates the English common names `Dogfish` and `Mudfish` with this taxon. CFIA describes the Fish List as Canadian-acceptable fish-labelling names paired with scientific names and TSNs. This supports a taxon-specific bilingual identity and explains why the other English labels should not be treated as culinary or market-group equivalences. [S01; reused overview S02]

OQLF's GDT fiche 1199117 is in edible-fish and ichthyology domains, identifies the Latin name *Amia calva*, and calls the species one with commercial potential in Québec. It normalizes `poisson-castor` for Québec fish-product commercialization and lists `bowfin` in English. OQLF also lists `amie chauve`, `amie`, and `poisson des marais` as terms used in other contexts, then explicitly says those French terms were not retained for Québec fish-product commercialization to avoid consumer-label confusion. Its additional English translations include `mudfish`, `dogfish`, and `grinnel`; these do not need to become picker aliases. [S03]

The BAPE-archived 2015 Québec fish-and-habitat technical report reproduces a table of species commercially fished in the Saint-Laurent in 2008. The table identifies `Poisson-castor / Amia calva` and reports 1.7 metric tonnes, with data credited to CRÉ de la Mauricie (2011). This is historical regional landing evidence, not proof of current catch, retailer inventory, a recipe portion, or a yield. [S04]

The current MAPAQ freshwater commercial-fishing page says a permit is required, describes roughly twenty freshwater or migratory species as commercially fished, and explains that permitted fish caught and kept for consumption may be sold. It provides general regulatory context; it does not establish that Bowfin is currently among the licensed catch or sold at retail. [reused S05]

## Exact proposed catalog delta

Add one identity-only `PROTEIN` reference if accepted:

```json
{
  "id": "ingredient-ref-bowfin",
  "nameFr": "poisson-castor",
  "nameEn": "Bowfin",
  "aliasesFr": [],
  "aliasesEn": ["Bow Fin"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "PROTEIN"
}
```

Use no French aliases. Do not add `dogfish`, `mudfish`, or `grinnel` as English aliases: CFIA and OQLF use these as additional names, while `dogfish` also collides with the separately reviewed dogfish naming boundary. Do not add `amie chauve`, `amie`, or `poisson des marais`; OQLF explicitly excludes those French terms in the Québec fish-product context. Do not add the scientific name as a picker alias. Add no form, measure, density, unit mapping, package yield, conversion, recipe link, or substitution.

## Active ownership, picker behavior, and recipe demand

The read-only audit covered the active ingredient references and forms, the legacy-import identity list, the research ledger, the Section P plan, the relevant proposal and integration archive, `IngredientSearch.kt`, the bundled recipe manifest, and every manifest-listed recipe. The current package has **1,830 active references**, **160 forms**, **56 legacy candidates**, **2,201 research-ledger records**, and **114 bundled recipes with 1,123 structured ingredient rows**. No active reference, form, legacy candidate, or ledger record owns *Amia calva*, `Bowfin`, `Bow Fin`, `poisson-castor`, `ingredient-ref-bowfin`, `candidate-bowfin`, or the R641 source-ID prefix. The archive has no focused Bowfin review or allocation; its sole *Amia calva* mention is the unrelated name-collision note in the spiny dogfish review. [R01]

The query projection follows the current [ingredient picker search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which returns complete normalized word phrases first and falls back to substring matches only when there are no phrase matches:

| Query | Before | With proposed row | Boundary |
|---|---|---|---|
| `Bowfin`, `Bow Fin`, `poisson-castor` | No result | Bowfin / poisson-castor | Each points to the same bounded identity. |
| `poisson` | 13 results | The same 13 plus Bowfin | Remains a broad multi-result search. |
| `castor` | Granulated sugar | Granulated sugar and Bowfin | The existing sugar result comes from its `castor sugar` form term; the proposed fish is a distinct second result. |
| `dogfish`, `mudfish`, `grinnel`, `Amia calva`, `amie`, `amie chauve`, `poisson des marais` | No result | No result | None is added as a picker term. The unrelated spiny dogfish decision remains unchanged. |

All **114 recipe files and 1,123 structured ingredient rows** were scanned, including complete recipe JSON text, for *Amia calva*, Bowfin/Bow Fin, `poisson-castor`, the other English names above, and the excluded French names. There were **zero recipe-file or ingredient-row hits**. No candidate-specific recipe demand, requested amount, preparation, form, or substitution is present; no culinary behavior follows.

## Source-ID and URL ownership

The `WP04-SECTIONP-BOWFIN-R641-20261018-` source-ID prefix and proposed reference ID are unallocated. The CFIA Bow Fin query URL, OQLF fiche URL, and BAPE report URL have no exact URL owner in the current research ledger. The CFIA results endpoint is shared by many other query records, so this proposal uses a distinct query URL and does not reuse an unrelated fish-query source ID. Reuse the existing CFIA overview and MAPAQ permit source IDs rather than duplicating those shared URLs. [R01]

| ID | Source and evidence | Ownership and limits |
|---|---|---|
| **New `WP04-SECTIONP-BOWFIN-R641-20261018-S01`** | CFIA, [Fish List query for Bow Fin](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Bow%20Fin). Lists TSN 161104, *Amia calva*, with `Bow Fin / Poisson-castor`; the associated `Dogfish` and `Mudfish` names remain excluded from the proposed aliases. | No exact query-URL or source-ID owner. Canadian fish-labelling evidence, not culinary equivalence or current retail availability. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing ledger source for acceptable Canadian English/French fish names and corresponding taxa/TSNs; reuse it for the list's scope. |
| **New `WP04-SECTIONP-BOWFIN-R641-20261018-S02`** | OQLF, [GDT: poisson-castor, fiche 1199117](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199117/poisson-castor). | No exact URL or source-ID owner. Species-specific Québec fish-product terminology and commercial-potential note; not a current inventory listing. |
| **New `WP04-SECTIONP-BOWFIN-R641-20261018-S03`** | BAPE archive, [*Projet Oléoduc Énergie Est — Rapport de données techniques révisé : Poisson et habitat du poisson – Segment Québec*](https://archives.bape.gouv.qc.ca/sections/mandats/oleoduc_energie-est/documents/PR8.5.6.1.1.pdf), table 3-1, page 3-2. | No exact URL or source-ID owner. Historical 2008 commercial-landing table reproduced in a 2015 technical report; not current catch or culinary-measure evidence. |
| **Reused `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S09`** | Gouvernement du Québec / MAPAQ, [Permis de pêche commerciale en eau douce](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce). | Existing ledger owner for the shared page's general permit and sale rules. It does not establish current Bowfin catch or retail supply. |
| **R01** | Read-only audit of the package, ledger, archive, picker implementation, plan, roadmap, and all bundled recipes. | Repository evidence only; no shared file was modified. |

## Recommendation

**Advance the bounded identity** `Bowfin / poisson-castor` for *Amia calva*, with only `Bow Fin` as an English alias. CFIA and OQLF pair the taxon with the bilingual name, and OQLF's species-specific Québec product terminology settles the French display. Keep the broader and non-retained names out of the picker, preserve the distinct existing sugar result for `castor`, and make no claim that the historical commercial landing establishes present retail supply. The Section P checklist remains open for other fish gaps.

Root review reopened the OQLF fiche and BAPE report and independently verified the CFIA name/species query. The reference and ledger entry are integrated; the package, generated index, and ledger schema passed static validation. No software tests, build, or emulator run were needed because this change only adds database JSON data under `AGENTS.md`.
