# WP04 Section P — generic oyster / huître multi-species identity review (R871)

- **Review and source-access date:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. See the [R871/R873 integration README](../batches/wp03-wp04-r871-r873-generic-identity-integration-20261019/README.md).
- **Exact plan anchor:** The open shellfish identity parent, [global catalog plan, line 8324](../../RecipeBook-global-ingredient-catalog-plan.txt#L8342). Section P begins at [line 7120](../../RecipeBook-global-ingredient-catalog-plan.txt#L7138).
- **Candidate:** The existing unresolved generic fresh-oyster candidate, `ingredient-ref-fresh-oyster`.
- **Recommendation:** Promote that candidate in place to an identity-only, visibly qualified species-neutral ingredient group: `oyster (name used for multiple oyster species) / huître (nom utilisé pour plusieurs espèces d’huîtres)`. This is a generic name group, not a taxon or a claim that its member species are interchangeable.

## Scope and prior decisions

This review addresses one generic shellfish identity gap under the open Section P parent. The current candidate was held because a bare oyster row could wrongly imply one species. This proposal resolves the generic name at an explicitly multi-species scope; it does not select a species or make any claim about culinary, nutritional, safety, or preparation equivalence.

Keep the existing Pacific, Eastern, Kumamoto, and European flat oyster references and the Olympia-oyster hold unchanged. Keep dried oyster, oyster sauce, vegan oyster-style sauce, and oyster mushrooms distinct. The R817 historical CNF portions remain attached to the Eastern-oyster evidence and do not transfer to this group. No source-specific quantity or product claim is generalized.

The R866 snapper and R869 mackerel market-name groups address separate finfish terms. R871 is a shellfish identity and does not reopen or absorb either fish group.

The 2026-10-19 generic-scope review found no open checklist item whose sole objective is a brand, product-line, flavor, or retailer-variant roster. Any brand-only child task encountered later is out of scope because commercial-product counts do not add ingredient diversity. No branded roster was researched here. Existing branded rows and their product-scoped evidence remain preserved.

## Bilingual identity and limits

OQLF’s food-mollusc entry normalizes Québec French **huître**, pairs it with English **American oyster**, and identifies *Crassostrea virginica*. The entry also describes cupped and flat oyster types, but it is not evidence that its preferred commercial term names every oyster species. Use the qualifier in the proposed catalog display to make the broader catalog scope visible; do not present that display as an OQLF ruling or a Canadian product-label approval. [S01]

DFO’s Canadian bivalve identification page lists three harvested oyster species: American oyster (*Crassostrea virginica*), Olympia oyster (*Ostrea conchaphila*), and Pacific oyster (*Crassostrea gigas*). This establishes Canadian species diversity, not a shared recipe identity or culinary equivalence. [S02]

CFIA describes its Fish List as a source of acceptable English and French fish names paired with scientific names. Its oyster results attach the unqualified English term `Oyster` and/or French `Huître` to multiple species entries, alongside species-qualified terms. This supports a visible name group for the broad catalog query, but the list remains species-linked labeling evidence; it is not a recipe taxonomy or an exhaustive market roster. [S03, S04]

The parenthetical wording is a catalog-authored scope qualifier. It does not establish one biological group, one legal label pair across every species, a common edible yield, a shared preparation state, or a substitution relationship.

## Exact proposed data

If accepted, promote the existing candidate **in place** as `ingredient-ref-fresh-oyster`. Retain its OQLF and DFO sources and the earlier unresolved decision as review history; append the R871 identity decision rather than deleting or overwriting prior evidence. Do not create a second oyster-group ID.

### Ingredient reference

```json
{
  "id": "ingredient-ref-fresh-oyster",
  "nameEn": "oyster (name used for multiple oyster species)",
  "nameFr": "huître (nom utilisé pour plusieurs espèces d’huîtres)",
  "aliasesEn": ["oysters"],
  "aliasesFr": ["huîtres"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The singular displays support the broad `oyster` and `huître` queries; the aliases cover their plain plurals. Keep species names, scientific names, named regional oysters, and prepared-product names out of the aliases.

### Ledger disposition if integrated later

On the existing `ingredient-ref-fresh-oyster` record, change `recordType` from `candidate` to `ingredient_reference` and `identityState` from `needs_clarification` to `verified` for the explicitly qualified generic-name scope. Keep `measurementState` and `substitutionResearchState` as `not_yet_researched`. Preserve both current source entries and the existing unresolved decision in the record history; append one accepted R871 identity decision and its CFIA source entry. The proposal-local audit and source IDs below are not shared-ledger writes.

Add no forms, measurements, density, unit mappings, recipe links, product/package relationships, conversions, yields, or substitutions. Do not attach R817’s Eastern-oyster CNF 2015 portions to this row; those remain code- and species-scoped observations.

## Source, catalog, picker, and recipe audit

### Sources

Sources were checked on 2026-10-19. Reused source IDs remain owned by their existing shared-ledger records. S03 is proposal-local evidence for the focused Fish List results and would require a unique ledger source entry only if a later integration accepts this proposal.

| Source ID | Source | Supports and limits |
|---|---|---|
| **Reused `WP04-DOYS-S02`** | OQLF, [huître (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre), updated 2012. | Québec-preferred base term, food-mollusc domain, English `American oyster`, *Crassostrea virginica*, and a note distinguishing cupped and flat oysters. Its species pairing limits how the broad display should be described; it is not a multi-species label ruling. |
| **Reused `WP04-MOLLUSKS-20261009-S14`** | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm), accessed 2026-10-19. | Lists American, Olympia, and Pacific oyster species harvested in Canada. Species and harvest context only; no product, household measurement, equivalence, or recipe mapping. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), rechecked 2026-10-19. | Explains that the Fish List provides English/French fish names acceptable for Canadian labeling paired with scientific names and TSNs. It defines source scope, not recipe equivalence. |
| **Proposal-local `WP04-SECTIONP-OYSTER-MARKET-GROUP-R871-20261019-S01`** | CFIA, [Fish List search results for `Oyster`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=&cmbIn=e&lang=e&q=oyster), accessed through the current indexed result view on 2026-10-19. | The result set attaches unqualified `Oyster` and/or `Huître` to multiple oyster taxa, including entries for *Crassostrea gigas*, *C. virginica*, *Ostrea conchaphila*, *O. edulis*, and *O. lurida*. Results are species-linked label names, not a culinary grouping or count of products. The legacy query page could not be opened directly in the web reader; the prior source audit and current indexed results were used, so no claim is made about changes to individual rows since that review. |
| **R01 — proposal-local audit** | Read-only review of the current plan, references, forms, legacy candidates, ledger, oyster proposals/batches, scope review, manifest-listed recipe files, and `IngredientSearch.kt`. | Repository state and search projection only; not an external source or shared-ledger record. |

### Current catalog and archive ownership

The refreshed worktree snapshot contains **1,902 ingredient references**, **201 forms**, **56 legacy candidates**, and **2,310 research-ledger records** with **10,895 source entries**. The manifest lists **114 recipes** containing **1,123 ingredient rows**.

There is no active reference with ID `ingredient-ref-fresh-oyster`; the shared ledger owns that ID only as the existing unresolved candidate. No exact normalized active reference, form, legacy identity, or ledger text owner was found for the proposed qualified displays or plural aliases. Related words occur within existing species and prepared-product names, which is expected substring overlap. The only oyster-related legacy candidate is the separate stale oyster-sauce candidate; do not promote or merge it.

Current oyster-related active references remain nine rows: dried oyster; Eastern, European flat, Kumamoto, and Pacific oysters; king oyster mushroom; oyster mushroom; oyster sauce; and vegan oyster sauce. The broad `oyster` and `huître` queries already return multiple choices. R871 adds one visibly qualified generic identity alongside those choices; it does not replace a species, product, sauce, or mushroom row.

The earlier generic fresh-oyster boundary review and its integration hold remain part of the archive. R130/R131/R137/R139 cover separate species identities; R135 keeps Olympia oyster outside active data; R817 records historical Eastern-oyster portions. This proposal resolves only the generic wording as a multi-species catalog group and does not transfer any of those decisions or measurements.

The static projection follows phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It adds the exact proposed row above.

| Query | Current results | With the proposed row | Boundary |
|---|---:|---:|---|
| `oyster` | 9 | 10 | Remains multi-result; the new visible qualifier identifies the generic group. |
| `oysters` | 4 | 5 | Adds the unqualified plural group beside species and dried-oyster results. |
| `huître` / `huitre` | 7 | 8 | Remains multi-result across species and prepared names. |
| `huîtres` / `huitres` | 6 | 7 | Adds the unqualified plural group without displacing existing product names. |
| `oyster sauce` | 2 | 2 | Oyster and vegan oyster sauces remain distinct condiment identities. |
| `dried oyster` | 1 | 1 | The dried product remains separate; no dried alias is added to the generic group. |
| `Eastern oyster`, `Pacific oyster`, `European oyster`, `Kumamoto oyster` | Each selects its existing species row | Unchanged | No species-qualified term is aliased to the generic group. |
| *Crassostrea virginica*, *C. gigas*, *Ostrea conchaphila* | No scientific-name result | No scientific-name result | Scientific names remain evidence, not picker aliases. |

### Bundled recipe audit

All **114 manifest-listed recipe files**, all **1,123 structured ingredient rows**, and complete recipe JSON text were scanned for `oyster`, `oysters`, `huître` / `huitre`, `huîtres` / `huitres`, and the relevant *Crassostrea* and *Ostrea* genus wording. The scan found **zero matching files, zero matching ingredient rows, and zero links to `ingredient-ref-fresh-oyster`**. The bundle provides no species-specific recipe, amount, form, or substitution context. This generic-identity proposal adds no recipe link or quantity.

## Unresolved risks

- OQLF normalizes `huître` for *C. virginica* while noting more than one oyster type. The visible qualifier is therefore necessary, and the French display remains a catalog-authored broad scope rather than a claim about accepted commercial labeling.
- CFIA’s Fish List is a species-linked labeling source with overlapping names. The group models broad unqualified catalog wording and does not claim that every term or taxon in the list is coextensive.
- No bundled recipe requests oyster. The identity is proposed for generic ingredient diversity; the absence of recipe demand means no recipe-specific species or product can be inferred.
- The proposal establishes no common taste, texture, preparation, food-safety treatment, count or mass, edible yield, conversion, or substitution across oyster species.
- Existing brand or product-specific rows and observations remain untouched; no brand, product-line, flavor, or retailer-variant roster is included.

## Files reviewed

`AGENTS.md`; the Section P shellfish parent and fresh-oyster hold in `docs/RecipeBook-global-ingredient-catalog-plan.txt`; `docs/catalog/batches/generic-ingredient-scope-review-20261019/README.md`; the existing fresh-oyster hold and oyster species proposals/batches; active ingredient references and forms; legacy identities; the research ledger; the seed manifest and all manifest-listed recipes; and `IngredientSearch.kt`.

Integrated on 2026-10-19 with the [R871/R873 batch](../batches/wp03-wp04-r871-r873-generic-identity-integration-20261019/README.md). No software tests were run because the change adds database JSON data under `AGENTS.md`.
