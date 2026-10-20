# WP04 Section P — generic conch / conque name-group review (R904)

- **Review date:** 2026-10-19.
- **Status:** Integrated as a separate qualified generic name-group reference; the prior `candidate-conch` hold is preserved unchanged.
- **Open plan anchor:** [Sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood](../../RecipeBook-global-ingredient-catalog-plan.txt#L9311). The earlier conch hold is recorded at [plan line 9356](../../RecipeBook-global-ingredient-catalog-plan.txt#L9356).
- **Recommendation:** Add a separate identity-only, visibly qualified Canadian label-name group: `conch (name used for multiple gastropod taxa) / conque (nom utilisé pour plusieurs taxons de gastéropodes)`. CFIA currently lists the exact English/French pair for both *Lobatus gigas* and *Strombus* spp. The group records shared label wording only; it is not a taxon, product specification, culinary-equivalence claim, or species assignment.

## Scope and selection

This is one generic seafood naming gap under the still-open Section P parent. It revisits the earlier generic conch hold only to represent the repeated, species-linked Canadian label pair as an explicitly qualified search identity. The old hold remains correct for assigning an unqualified recipe or product to a species. A separate name group makes the shared-label scope visible without choosing Queen Conch or another gastropod.

The cross-category [generic ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md) found no open assignment whose sole deliverable is a commercial-product roster. Its repeated Section F cereal-roster clauses remain out of scope because commercial-product counts do not add ingredient diversity. No roster-only WP04 item was encountered or pursued here. The proposal concerns one generic culinary name gap, not commercial-product enumeration.

## Naming evidence and transferability boundary

CFIA's Fish List currently shows the exact pair `Conch / Conque` for TSN 72554, *Lobatus gigas*, and TSN 72555, *Strombus* spp. The pair therefore occurs on more than one taxonomic entry within Strombidae. CFIA describes the Fish List as English and French names tied to listed fish and seafood species; its guidance also says a common name must be the one listed for the actual species, and notes that group names covering multiple species may be considered. This evidence supports a bounded label-name search group. It does **not** establish that the proposed catalog wording is a CFIA-approved group name or that the represented taxa are interchangeable in recipes.

OQLF identifies *strombe* as an edible tropical gastropod in Strombidae and describes *strombe géant* (*Strombus gigas*) as a mollusc known for its meat. Government of Canada material likewise describes Queen Conch (*L. gigas*) as an edible marine snail. These sources establish culinary relevance for their stated genus/species scope only. They do not transfer a species, edible part, processing state, yield, safety or trade authorization, or recipe behavior to every taxon appearing under the Fish List label.

Keep the exact-pair scope narrow. Do not include the CFIA French-only `Conque` entry associated with *Busycon*, or the OQLF species names `conque canaliculée` (*Busycon canaliculatum*) and `conque à nodules` (*B. carica*). Their English naming and taxonomy differ, and the prior review keeps those whelk-related gastropods separate. Do not use `Queen Conch`, `Pink Conch`, `strombe géant`, `strombe rose`, `lambi`, *Lobatus gigas*, or *Strombus* as aliases; those terms are narrower or regionally scoped. The qualified group neither resolves those identities nor subsumes whelk, abalone, sea cucumber, periwinkle, or generic shellfish.

## Integrated reference

Add one **PROTEIN** reference under a new ID, keeping the held `candidate-conch` record and all of its sources and decisions unchanged:

```json
{
  "id": "ingredient-ref-conch-market-group",
  "nameEn": "conch (name used for multiple gastropod taxa)",
  "nameFr": "conque (nom utilisé pour plusieurs taxons de gastéropodes)",
  "aliasesEn": ["conchs"],
  "aliasesFr": ["conques"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The parenthetical qualifiers are catalog-authored scope descriptions, not normalized Québec commercial terms. The plural aliases are search inflections only. The new reference has a **separate** ledger record with identity verified only at the qualified name-group scope; its measurement and substitution research remain `not_yet_researched`. The existing candidate was not converted and none of its source evidence was moved.

## Pre-integration ownership and picker projection

The pre-R904 package snapshot has **1,931 active ingredient references**, **201 forms**, and **56 legacy identities**. The research ledger has **2,334 records**, **11,006 source entries**, and **9,233 distinct source IDs**. Before R904 integration, the only conch-specific ledger owner was the unresolved `candidate-conch`, with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, `substitutionResearchState: researched_no_supported_substitute`, 13 historical source entries, and its prior unresolved decision. It has no active picker result.

Before R904 integration, no active reference, form, or legacy identity owned `conch`, `conchs`, `conque`, `conques`, the qualified names, or ID `ingredient-ref-conch-market-group`; the integrated reference now owns only the visibly qualified generic label-name group. The reference ID and source ownership were checked before writing this review. No product or branded row is changed or repurposed.

Projection follows phrase-first search and partial fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Before R904 integration | With R904 group | Boundary |
|---|---:|---:|---|
| `conch` / `conchs` | 0 / 0 | 1 / 1 | Selects only the visibly qualified shared-label group. |
| `conque` / `conques` | 0 / 0 | 1 / 1 | Selects only the qualified French group; the explanatory compound is catalog-authored. |
| Full English or French qualified display | 0 | 1 each | Selects the proposed row. |
| `Queen Conch`, `Pink Conch`, `strombe géant`, `lambi`, *Lobatus gigas*, *Strombus* | 0 | 0 | Species, regional, and scientific names are not aliases. |
| `conque canaliculée`, `conque à nodules`, `whelk`, `buccin`, `ormeau`, `concombre de mer` | 0 | 0 | No Busycon/whelk or neighboring shellfish identity is introduced. |

The broad query would return the qualified name group alone until more specific rows exist; its visible qualifier says that the matching label spans multiple gastropod taxa. It does not tell a cook which species or product a recipe intends. A future species-specific identity would remain a separate result rather than being merged into this group.

## Recipe demand and data boundary

The manifest lists **114 recipes and 1,123 ingredient rows**. A read-only scan of every manifest-listed recipe file, its serialized text, and its ingredient rows searched for `conch`, `conchs`, `conque`, `conques`, `Queen Conch`, `Pink Conch`, `strombe`, `lambi`, *Lobatus*, and *Strombus*. It found **zero matching recipe files and zero matching ingredient rows**. There is no recipe quantity, intended species, form, recipe link, or substitution to associate with this group.

No form, measure, default density, unit mapping, conversion, edible or cooking yield, recipe link, or substitution is proposed. The old candidate's measurement and substitution findings remain on that record. Its Pearlmark and PriceSmart product observations, including named species/product states and package values, remain source-specific. This review did not reuse them as evidence for the generic group; no product-only value is generalized.

## Source transferability review

| Source | Transferability decision |
|---|---|
| Existing `candidate-conch` source `WP04-CONCH-20261011-S01` — CFIA Fish List lookup. | Preserve on the existing candidate with its earlier unresolved decision. Root rechecked the exact repeated pair in the current official table under `R904-S01`; the candidate record and its source are not moved or rewritten. |
| `R904-S01` — CFIA, [current Fish List result table](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s), accessed 2026-10-19; Fish List page dated 2023-09-18. | Current result rows at TSNs 72554 and 72555 respectively show `Conch / Conque` for *Lobatus gigas* and *Strombus* spp. The direct exact-name query was inaccessible; root verified the pair in the opened official Fish List results table and the existing candidate's exact-lookup record. This supports repeated label wording only, not culinary equivalence or product state. |
| `R904-S02` — CFIA, [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25; rechecked 2026-10-19. | Supports the Fish List's species-linked label scope and its statement that group names covering multiple species may be considered. It does not approve the catalog-authored qualified display. |
| Reused `WP04-CONCH-20261011-S05` — OQLF, [strombe géant](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358664/strombe-geant), last updated 2004; reopened 2026-10-19. | Retain only the stated *Strombus gigas* names and food description. Do not transfer `lambi`, regional usage, or species-specific terminology as a group alias. |
| Reused `WP04-CONCH-20261011-S06` — OQLF, [strombe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358684/strombe), last updated 2004; reopened 2026-10-19. | Establishes a Québec edible-mollusc term for genus *Strombus*; it does not establish the English `conch` label, the proposed group display, or food properties across other taxa. |
| `R904-S03` — Environment and Climate Change Canada, [Fine for import of Queen conch meat](https://www.canada.ca/en/environment-climate-change/services/environmental-enforcement/notifications/import-queen-conch-meat.html), 2012. | States that Queen Conch (*Strombus gigas*) is an edible marine snail used for meat. Use only for this species' food context. It is an enforcement report, not evidence of a current product, lawful import status for any item, or shared processing/culinary behavior across the name group. |
| Existing OQLF *Busycon* entries and the Pearlmark / PriceSmart product sources on `candidate-conch`. | Not transferred. They remain species- or product-specific on the existing candidate; no package amount, cleaned/frozen state, species, origin, or claim is generalized here. |
| Repository audit (`R01`). | Read-only comparison of the open plan, scope review, current references/forms/legacy identities, candidate and source ownership, picker code, recipe manifest, and recipe files. Supports ownership, projection, and demand findings only. |

## Recommendation

Accepted and added `ingredient-ref-conch-market-group` only as the visibly qualified, identity-only `Conch / Conque` name group above. Preserve `candidate-conch`, its unresolved species/product boundary, its 13 sources, and every existing branded or product-specific row and value unchanged. Do not transfer product quantities or named-product claims. The bundle has no conch demand, so no recipe, quantity, form, conversion, yield, or substitution is proposed. Section P remains open.

## Files reviewed

`AGENTS.md`; the Section P parent and prior conch hold in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9311); the prior [conch product-boundary review](wp04-conch-quebec-product-boundary-review-20261011.md); the [generic scope review](../batches/generic-ingredient-scope-review-20261019/README.md); current ingredient references, forms, legacy identities, and research ledger; the recipe manifest and all 114 listed recipes; and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

## Root integration review

The exact CFIA query URL already had two ledger owners for sea-cucumber results. Root review opened the current Fish List results table and directly confirmed TSN 72554 *Lobatus gigas* and TSN 72555 *Strombus* spp. each have the exact common-name pair `Conch / Conque`. The current table’s shared wording supports a qualified catalog search group only; CFIA’s guidance limits commercial naming to the listed name for the actual species and says group names may be considered, without approving this catalog-authored display. OQLF confirms the genus *Strombus* is an edible mollusc and confines `strombe géant`, `lambi`, `Queen Conch`, and `pink conch` to the narrower *Strombus gigas* entry. The Government of Canada food-use report supports Queen Conch only and is not used for current import legality or general product behavior.

Added `ingredient-ref-conch-market-group` in `PROTEIN` with only plural inflection aliases, null density, and no forms/mappings. Ledger source IDs `R904-S01`, `R904-S02`, and `R904-S03` record the current CFIA table, CFIA group-name guidance, and species-scoped Queen Conch food-use context. `R904-S01` shares a URL with the older sea-cucumber-scoped results but records only the conch rows; those existing records were not changed. The reused OQLF genus source retains its original narrow scope; the older CFIA source attached to `candidate-conch` was not modified. `candidate-conch` and all 13 source entries and its unresolved decision remain unchanged. The proposal’s corpus scan found no conch recipe or ingredient-row demand. No brand or product roster was pursued, and no product-specific values were generalized.

No software tests, build, emulator, or deployment were run because this active change only adds database JSON data under `AGENTS.md`. Static validation and preservation checks are recorded in the [R902–R904 integration README](../batches/wp02-wp03-wp04-r902-r904-generic-review-integration-20261019/README.md).
