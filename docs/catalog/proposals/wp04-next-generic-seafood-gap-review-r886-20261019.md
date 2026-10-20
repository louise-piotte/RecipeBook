# WP04 Section P — qualified eel name-group review (R886)

- **Review and source-access date:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, checklist, workflow, roadmap, or batch file was changed.
- **Exact open plan anchor:** The Section P fish parent at [global catalog plan, line 7195](../../RecipeBook-global-ingredient-catalog-plan.txt#L7213); WP04 remains `in_progress` in the [workflow](../ingredient-catalog-workflow.md#L410).
- **Candidate:** Existing unresolved ledger record `candidate-unqualified-eel-identity-boundary`.
- **Recommendation:** Re-key and promote that candidate to an identity-only, visibly qualified name group: `eel (name used for multiple Anguilla species) / anguille (nom utilisé pour plusieurs espèces du genre Anguilla)`. This describes the exact bilingual name that CFIA lists for several species. It is a catalog name group, not a taxon, recipe synonym, or culinary-equivalence claim.

## Scope and earlier decision

This is one generic seafood identity gap under the still-open fish parent. The 2026-10-11 boundary review correctly held bare global `eel / anguille`: CFIA uses the exact `Eel / Anguille` pair for more than one species, while OQLF scopes Québec food-fish `anguille` to American eel, *Anguilla rostrata*. It also found no eel demand in the bundled recipes. The proposed qualified group records the repeated label without resolving bare `anguille` as a general Québec name or treating eel taxa as interchangeable.

The current CFIA result table lists `Eel / Anguille` for *Anguilla dieffenbachii*, *A. japonica*, and *A. rostrata*. It separately lists *A. rostrata* as `American eel / Anguille américaine`, *A. australis* as `Short-finned Eel / Anguille d’Australie`, and *Conger* spp. under `Conger Eel`. The proposed group covers only the exact repeated pair on the three named *Anguilla* entries. It does not absorb short-finned eel, conger, European eel, other eel names, or species-specific identities.

Keep active `American eel / anguille` and the prepared-food identity `smoked eel / anguille fumée` unchanged. Do not map `unagi`, `anago`, or `kabayaki` to this group or to American eel. Existing source records about smoked or seller-listed eel products remain attached to their existing identities, with every product-specific claim scoped there. No new product or retailer research was pursued. The queue review found no open brand-, product-line-, flavour-family-, or retailer-variant-only task; any such roster work remains out of scope because commercial-product counts do not add ingredient diversity.

## Proposed bilingual identity and limits

The qualified display is catalog-authored. It is not presented as a CFIA-approved compound common name or an OQLF-normalized term. CFIA says its Fish List provides species-linked common names for fish labeling in Canada; it does not prescribe recipe aliases or establish culinary equivalence. OQLF continues to support bare Québec `anguille` for *A. rostrata*, so that bare singular is deliberately not an alias on the proposed group.

The plural aliases below are search inflections only. They do not claim that OQLF normalizes broad `anguilles` to multiple species. Do not add scientific species names, `American eel`, prepared products, regional names, `unagi`, `anago`, or `kabayaki` as aliases.

## Exact proposed data

If accepted, rename the existing ledger candidate to `ingredient-ref-eel-name-group`; there is no active reference or ledger record with that target ID. Do not retain a second unresolved candidate for the same qualified name-group review.

### Ingredient reference

```json
{
  "id": "ingredient-ref-eel-name-group",
  "nameEn": "eel (name used for multiple Anguilla species)",
  "nameFr": "anguille (nom utilisé pour plusieurs espèces du genre Anguilla)",
  "aliasesEn": ["eels"],
  "aliasesFr": ["anguilles"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not create forms or numeric behavior. Add no density, unit mapping, recipe link, package relationship, conversion, yield, or substitution.

### Ledger disposition if integrated later

On the existing `candidate-unqualified-eel-identity-boundary` record, change `recordId` to `ingredient-ref-eel-name-group`, `recordType` from `candidate` to `ingredient_reference`, and `identityState` from `needs_clarification` to `verified` only for this explicitly qualified label-group scope. Preserve all seven existing sources and the 2026-10-11 unresolved decision verbatim as history. Its earlier conclusion that bare `eel / anguille` is unresolved remains valid. Append the proposal-local CFIA result source below and one accepted R886 decision that cites that result, the existing CFIA common-names guidance, and the existing OQLF entry. Do not repurpose the old product listings as evidence for the generic name group.

Keep `measurementState` and `substitutionResearchState` as `not_yet_researched`. The current candidate's seven historical sources include a prior CFIA result and product-specific records; none supplies a reusable measure or recipe-level substitution.

## Sources and scope limits

| Source ID | Source | Supports and limits |
|---|---|---|
| **Proposal-local `WP04-SECTIONP-EEL-NAME-GROUP-R886-20261019-S01`** | CFIA, [Fish List results for eel](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=eel), checked 2026-10-19. | The current indexed result table exposes the exact `Eel / Anguille` rows for *A. dieffenbachii*, *A. japonica*, and *A. rostrata*, plus the separate entries noted above. The legacy query endpoint could not be opened directly in the web reader; the indexed official table supplied the rows. This is species-linked labeling evidence, not a recipe synonym, a complete survey of eel taxonomy, or an equivalence claim. |
| **Reused `WP04-EEL-GENERIC-20261011-S02`** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25. | Defines the Fish List’s Canadian labeling scope and explains that the listed common names are species-linked. It does not prescribe catalog search behavior or recipe identity. |
| **Reused `WP04-SEA-GAP-20261009-S03`** | OQLF, [anguille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199945/anguille), last updated 2011. | Normalizes Québec food-fish `anguille` to American eel / *Anguilla rostrata*. This supports the existing species-scoped row and limits use of bare `anguille`; it does not support a broad French alias. |
| **Repository audit R01** | Read-only review of the plan, workflow, scope-review README, current references, forms, legacy identities, research ledger, manifest-listed recipes, and `IngredientSearch.kt`. | Records current ownership, recipe demand, and picker projection only; it is not external identity evidence or a shared-ledger source. |

The existing `WP04-EEL-GENERIC-20261011-S01` CFIA record remains historical evidence on the unresolved eel candidate and the smoked-eel record. Its prior ownership and product-source rows are preserved. The R886 proposal-local source ID is unused in the current ledger; it records the 2026-10-19 check without overwriting the older source history.

## Current ownership and picker audit

The read-only snapshot contains **1,912 ingredient references**, **201 forms**, **56 legacy identities**, **2,317 research-ledger records**, and **10,930 ledger source entries**. The manifest lists **114 recipes** and **1,123 structured ingredient rows**.

The active eel-related references are only `ingredient-ref-american-eel` (`American eel / anguille`) and `ingredient-ref-smoked-eel` (`smoked eel / anguille fumée`); neither has aliases or forms containing an eel term. No exact normalized active-reference, form, or legacy owner exists for `eels`, `anguilles`, the proposed qualified displays, `ingredient-ref-eel-name-group`, `Anguilla rostrata`, `Anguilla dieffenbachii`, `Anguilla japonica`, `Conger eel`, `unagi`, `anago`, or `kabayaki`. The exact word query `eel` currently finds the American-eel and smoked-eel display names, not a generic alias. The exact `anguille` query likewise finds those two rows through their displays.

Projection follows the phrase-first matching and partial-match fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current results | With proposed row | Boundary |
|---|---:|---:|---|
| `eel` | American eel; smoked eel | Those two plus the qualified group | Remains a multiple-result query; it does not resolve bare `eel` to one species. |
| `anguille` | American eel; smoked eel | Those two plus the qualified group | The OQLF-backed bare display remains on American eel; the group is visibly qualified. |
| `eels`; `anguilles` | None | Qualified group | Plural search inflections only. |
| Full proposed English or French display | None | Qualified group only | The full qualifier selects only this name group. |
| `American eel`; `smoked eel`; `anguille fumée` | Existing species/product row | Unchanged | Preserve the species and prepared-food identities. |
| `Anguilla` | None | Qualified group through the genus in its visible display | This is a name-group result, not a new species alias or taxon reference. |
| `Anguilla rostrata`; `Anguilla japonica`; `Conger eel`; `unagi`; `anago`; `kabayaki` | None | None | Do not add these terms as aliases or imply species or preparation mappings. |

## Bundled recipe demand

All **114 manifest-listed recipe files**, their **1,123 structured ingredient rows**, and all string fields were scanned with complete word matching for `eel`, `eels`, `anguille`, `anguilles`, `Anguilla`, `unagi`, `anago`, `kabayaki`, and `conger`.

- Ingredient-row matches: **0**.
- Any recipe-string matches: **0**.
- Eel-specific amounts, recipe links, preparation states, and substitution targets: **none**.

No recipe demand is inferred, and no recipe line is attached to the proposed group.

## Risks and review outcome

- **French singular ambiguity:** `anguille` is an OQLF-backed species name for *A. rostrata*. The qualified display is necessary, and the bare singular must not be added as an alias.
- **Search ambiguity:** broad `eel` and `anguille` queries will each show three candidates. The proposed visible qualifier makes the shared-label scope clear, while American eel and smoked eel remain separate.
- **Taxon boundary:** the group is limited to the repeated CFIA label on the three cited *Anguilla* entries. Short-finned eel and *Conger* entries are separately named; this review does not merge or generalize across them.
- **Evidence boundary:** CFIA is a fish-label naming authority. Its rows do not establish that recipe uses are interchangeable, safe to prepare alike, or share amounts, yields, or substitutions. The bundled recipe corpus supplies no countervailing demand.
- **Product scope:** prior smoked/unagi/anago listings and all current commercial entries stay unchanged and product-specific. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched; those counts would not add ingredient diversity.

## Files reviewed and audit disposition

- Read `AGENTS.md`, the [generic ingredient scope-review README](../batches/generic-ingredient-scope-review-20261019/README.md), the open Section P fish parent, the current WP04 workflow row, and the [2026-10-11 eel boundary review](wp04-unqualified-eel-identity-boundary-review-20261011.md).
- Read the current active references and forms, legacy identities, relevant ledger records and sources, the bundled manifest and every manifest-listed recipe, and `IngredientSearch.kt`.
- Exact-name/alias and ID ownership, source-ID/URL ownership, picker projection, recipe scan, plan links, UTF-8 text, and proposal-target checks were completed read-only. The target proposal path and R886 source ID were unused before creation. No software tests, builds, emulator runs, or deployments were performed; this is proposal-only documentation and it does not change database JSON.

## Recommendation

Accept one identity-only reference for `eel (name used for multiple Anguilla species) / anguille (nom utilisé pour plusieurs espèces du genre Anguilla)` by re-keying and promoting the held candidate as described above. Preserve the American-eel species row, smoked-eel prepared-food row, all existing source records, and the earlier hold on unqualified bare `eel / anguille`. Keep measurements and substitutions open, and add no forms, recipe links, or numeric behavior.
