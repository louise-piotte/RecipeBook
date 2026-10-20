# WP04 Section P — generic mussel / moule multi-species identity review (R883)

- **Review and source-access date:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, research ledger, batch, checklist, workflow, plan, or roadmap file was changed.
- **Exact open plan anchor:** The shellfish parent, [global catalog plan, line 8368](../../RecipeBook-global-ingredient-catalog-plan.txt#L8386). WP04 is still `in_progress` in the [workflow](../ingredient-catalog-workflow.md#L410).
- **Candidate:** The existing unresolved ledger candidate `ingredient-ref-mussel`.
- **Recommendation:** Promote that candidate in place to an identity-only, visibly qualified species-neutral name group: `mussel (name used for multiple mussel species) / moule (nom utilisé pour plusieurs espèces de moules)`. This represents unqualified wording that CFIA applies across multiple named taxa; it is neither a taxon nor a claim that those taxa are interchangeable.

## Scope and prior decisions

This is one generic shellfish identity gap under the open Section P parent. The current candidate remains held because the OQLF preferred Québec product-label term **moule** is species-scoped to *Mytilus edulis*, while the earlier review did not yet establish the broader label-name boundary. The current CFIA Fish List provides that boundary: it applies the English name **Mussel** and/or the French name **Moule** to multiple distinct taxa. The proposal uses a visible qualifier to keep the broader catalog scope legible.

Keep the species-scoped blue mussel (*Mytilus edulis*), Mediterranean mussel (*M. galloprovincialis*), and green-lipped mussel (*Perna canaliculus*) rows unchanged. Keep frozen cooked mussel meat, smoked mussels, mussels in brine, and canned mussels in escabeche as separate prepared-product identities. None becomes an alias, form, or sub-type of this name group. The existing species and product-scoped evidence stays attached to its current rows.

The DFO page says blue mussel is the single mussel species harvested in Canada. That harvest statement does not erase the CFIA label-name overlap: the Fish List describes names used on Canadian labels for species-linked fish entries, including imported taxa. Neither source proves that all mussel species share a recipe identity, preparation, flavour, yield, measurement, safety treatment, or substitution relationship.

The reviewed generic-scope checklist found no open task solely for a commercial product roster. No brand, product-line, flavour-family, or retailer-variant research was pursued. Any such roster-only work remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-specific claims remain preserved.

## Bilingual identity and limits

The proposed display qualifier is catalog-authored. Do not present it as an OQLF-normalized term, a CFIA approval for the complete qualified phrase, or a taxonomic group. CFIA's rows link each common name to a scientific name/Taxonomic Serial Number. Among the examples, the broader words recur with *Mytilus californianus*, *M. chilensis*, *M. edulis*, *M. galloprovincialis*, *Modiolus modiolus*, *Perna canaliculus*, and *P. viridis*. Exact pairings vary: some rows pair `Mussel / Moule`, some provide only one of the two terms, and some use a species-qualified name with `Moule`.

OQLF continues to own the normalized Québec display `moule` for *M. edulis* / English `blue mussel`; its note says one term corresponding to a specific species is normalized to avoid consumer-label confusion. That evidence limits the generic French wording. Keep the full visible qualifier and retain no bare `moule` alias on this proposed row. The plural `moules` alias supports broad catalog search only; it is not claimed to be a normalized Québec commercial species name.

## Exact proposed data

If accepted, promote the existing candidate **in place** as `ingredient-ref-mussel`. Do not create a second mussel record.

### Ingredient reference

```json
{
  "id": "ingredient-ref-mussel",
  "nameEn": "mussel (name used for multiple mussel species)",
  "nameFr": "moule (nom utilisé pour plusieurs espèces de moules)",
  "aliasesEn": ["mussels"],
  "aliasesFr": ["moules"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not add scientific names, species-qualified names, geographic labels, or prepared-product terms as aliases. Do not alias the bare French singular `moule`, which is already the exact display of the *M. edulis* reference.

### Ledger disposition if integrated later

On the existing `ingredient-ref-mussel` record, change `recordType` from `candidate` to `ingredient_reference` and `identityState` from `needs_clarification` to `verified` for this explicitly qualified catalog name-group scope. Preserve the five existing sources and both earlier unresolved decisions as review history. Append the new CFIA result source and one accepted R883 identity decision; its source list should cite the new CFIA result and the existing OQLF and DFO entries. Do not rewrite historical rationale: the R883 decision should clarify that DFO's single-species harvest statement is limited to Canadian harvest, while CFIA supports broader species-linked labeling names.

Keep `measurementState` and `substitutionResearchState` as `not_yet_researched`. Add no forms, measurements, density, unit mappings, recipe links, product/package relationships, conversions, yields, or substitutions. The proposal-local source ID below is not a shared-ledger write.

## Sources and scope limits

Sources were checked on 2026-10-19. Existing source IDs remain owned by their current records. S01 is proposal-local and should be assigned to this candidate only if the identity proposal is later integrated.

| Source ID | Source | Supports and limits |
|---|---|---|
| **Reused `WP04-MOLLUSKS-20261009-S06`** | OQLF, [moule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule), updated 2012. | Normalizes Québec `moule`, pairs it with `blue mussel` / *Mytilus edulis*, and cautions that one term corresponding to a specific species is normalized to avoid consumer-label confusion. It does not support using bare `moule` as a broad catalog alias. |
| **Reused `WP04-BLUE-MUSSEL-20261011-S02`** | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm), section “Mussels,” modified 2021-06-09. | Says blue mussel (*M. edulis*) is the single mussel species harvested in Canada. Harvest context only; it does not identify every imported product or resolve a general food-label term. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Supplies the labeling-source context for the species-linked Fish List. It does not establish recipe equivalence or culinary grouping. |
| **Proposal-local `WP04-SECTIONP-MUSSEL-MARKET-GROUP-R883-20261019-S01`** | CFIA, [Fish List results for `mussel`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=mussel), checked 2026-10-19; the visible Fish List page says last modified 2023-09-18. | The result rows associate `Mussel` and/or `Moule` with more than one species, including the taxa named above. The legacy query endpoint could not be opened directly in the web reader; the current indexed Fish List result table exposed the species-linked rows. No claim is made about a change to any row since the source snapshot. This is labeling evidence, not recipe taxonomy, current inventory, or proof of equivalence. |
| **R01 — proposal-local audit** | Read-only review of the current plan, workflow, scope-review README, references, forms, legacy identities, ledger, manifest-listed recipes, and `IngredientSearch.kt`. | Repository state, exact-key ownership, and picker projection only; not an external source or shared-ledger entry. |

## Current catalog, exact ownership, and picker audit

The read-only snapshot contains **1,909 ingredient references**, **201 forms**, **56 legacy identities**, **2,315 research-ledger records**, and **10,920 ledger source entries**. The manifest lists **114 recipes** and **1,123 ingredient rows**.

The ledger owns `ingredient-ref-mussel` only as the unresolved candidate; no active reference uses that ID. No other exact normalized active-reference, form, or legacy-identity owner was found for the proposed qualified English/French displays, the plural aliases `mussels` / `moules`, or the relevant scientific names. The exact French key `moule` is owned by active `ingredient-ref-blue-mussel` as OQLF's *M. edulis* display; it is deliberately not proposed as a generic alias. Form text containing `semoule` is an unrelated substring, not a mussel/moule form. Before this proposal was created, the target path and R883 source ID were unused.

The current mussel-related active rows are blue mussel, Mediterranean mussel, green-lipped mussel, frozen cooked mussel meat, smoked mussels, mussels in brine, and canned mussels in escabeche. They remain separate. Projection follows phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current results | With proposed row | Result boundary |
|---|---:|---:|---|
| `mussel` | 4 | 5 | The new qualified group appears beside the named species/product rows; remains multi-result. |
| `mussels` | 5 | 6 | Adds the qualified group; remains multi-result. |
| `moule` | 4 | 5 | The existing blue-mussel display remains; the qualified group is also visible. |
| `moules` | 5 | 6 | Adds the qualified group without making the broad query a singleton. |
| `blue mussel`; `moule bleue` | Each selects the current blue-mussel row | Unchanged | Species-qualified terms stay on *M. edulis*. |
| `Mediterranean mussel`; `moule méditerranéenne` | Each selects the current Mediterranean row | Unchanged | The species-scoped row remains separate. |
| `green-lipped mussel`; `moule verte` | Each selects the current green-lipped row | Unchanged | The *Perna canaliculus* row remains separate. |
| `smoked mussels`; `moules fumées` | Each selects the current smoked product | Unchanged | No universal smoked form is created. |
| `mussels in brine`; `moules en saumure` | Each selects the current brined product | Unchanged | The product row remains separate. |
| `canned mussels in escabeche`; `conserve de moules à l’escabèche` | Each selects the current escabeche product | Unchanged | The product row remains separate. |
| `frozen cooked mussel meat`; `chair de moule cuite surgelée` | Each selects the current frozen cooked-meat product | Unchanged | The product row remains separate. |
| Proposed qualified English/French displays | No current result | One proposed row each | Each full qualified phrase selects only the proposed group. |

### Bundled recipe demand

All **114 manifest-listed recipe files** and all **1,123 structured ingredient rows** were scanned for mussel/moule wording, *Mytilus* / *Perna* names, and links to the candidate ID. The scan found **zero matching ingredient rows and zero candidate links**. Other recipe text can contain French `moule` for baking molds; those occurrences do not request shellfish. No recipe, amount, form, or substitution context can be inferred from the bundle, so no recipe link or quantity is proposed.

## Unresolved risks

- The French term `moule` has a strong OQLF species-specific owner. The group must keep its full visible qualifier, and the catalog-authored display must not be described as a normalized commercial term. Broad `moule` search will now show both the species-scoped blue-mussel row and the qualified group; this is an intentional multi-result disambiguation.
- CFIA's common-name table is species-linked labeling evidence. Its overlapping names justify a generic wording group in the catalog but do not identify the taxon in an unqualified recipe or establish any culinary, safety, measurement, or substitution equivalence.
- DFO's Canadian harvest statement is limited to harvested Canadian species. It is not evidence that every label or imported ingredient called `mussel` is *M. edulis*.
- The bundle has no mussel ingredient demand. The proposal addresses generic ingredient diversity only; it provides no species-specific or preparation-specific recipe mapping.
- Existing commercial entries, branded rows, and product-specific claims remain untouched. Product-line and retailer-variant coverage was not researched.

## Files reviewed and audit disposition

- Read `AGENTS.md`, the [generic ingredient scope-review README](../batches/generic-ingredient-scope-review-20261019/README.md), the open Section P parent in the global catalog plan, and the current WP04 workflow row.
- Read the current active references and forms, legacy-import identities, the `ingredient-ref-mussel` ledger record, the bundled manifest and all manifest-listed recipe ingredient rows, `IngredientSearch.kt`, the [blue-mussel identity review](wp04-blue-mussel-identity-review-20261011.md), and the [R823 blue-mussel measurement proposal](wp04-section-p-next-gap-review-r823-20261019.md).
- Static exact-key ownership, picker projection, recipe-row scan, source/plan-link review, and proposal/source-ID collision checks are documented above. No software tests, builds, emulator runs, or deployments were performed; this is a proposal-only documentation change and it does not change database JSON.

## Recommendation

Accept promotion of the existing `ingredient-ref-mussel` candidate in place to the visibly qualified generic name group `mussel (name used for multiple mussel species) / moule (nom utilisé pour plusieurs espèces de moules)`. Add only the generic identity to the active reference projection and the source/decision history described above if a later integration approves it. Keep the three species-scoped mussel rows and every prepared-product row distinct; retain the prior hold decisions; keep measurement and substitution research open; and add no forms, recipe links, reusable numeric behavior, conversions, yields, or substitutions.
