# WP04 Section P — Snapper / vivaneau multi-species market group review (R866)

- **Review and source-access date:** 2026-10-19.
- **Exact plan anchor:** The open Section P finfish and regional-fish parent, [global catalog plan, line 7115](../../RecipeBook-global-ingredient-catalog-plan.txt#L7133). Section P begins at [line 7091](../../RecipeBook-global-ingredient-catalog-plan.txt#L7109).
- **Candidate:** the generic seafood market names `snapper / vivaneau`, represented as one visibly multi-species ingredient identity.
- **Recommendation:** Add identity-only `snapper (name used for multiple fish species) / vivaneau (nom utilisé pour plusieurs espèces de poissons)` as `ingredient-ref-snapper-market-group` in `PROTEIN`.
- **Status:** Accepted and integrated as `ingredient-ref-snapper-market-group`; see the [R864–R866 integration README](../batches/wp02-wp03-wp04-r864-r866-generic-identity-integration-20261019/README.md). The shared Fish List overview reuses existing source ID `WP04-FINFISH-GAPS-20261010-S11`; the snapper query and three OQLF boundary sources are recorded with their proposal IDs.

## Scope and queue disposition

This is one generic finfish ingredient identity under the still-open Section P parent. It represents the broad market-name group evidenced by Canadian fish-label nomenclature. It does not assign a species, claim that species are interchangeable, or stand for every item with a snapper-like name.

The 2026-10-19 cross-category generic-scope review found no open checklist task whose sole objective is another branded-product roster. Additional brand, product-line, flavor-family, and retailer-only variant work remains out of scope because catalog coverage measures ingredient diversity, not commercial-roster size. No brand-specific child work was researched or proposed here. Existing branded entries and their product-scoped evidence remain intact.

## Why this is a distinct identity gap

Earlier WP04 reviews held single-species snapper candidates because the supported names would make broad `snapper` and `vivaneau` searches look species-resolved. The [red-snapper review](wp04-section-p-red-snapper-vivaneau-picker-boundary-review-20261012.md) records the conflict between *Lutjanus campechanus* and *L. purpureus* name assignments; later reviews held [gray snapper (R308)](wp04-section-p-next-gap-review-r308-20261016.md) (*L. griseus*) and [yellowtail snapper (R700)](wp04-section-p-next-open-seafood-gap-review-r700-20261018.md) (*Ocyurus chrysurus*) for the same broad-query problem. Those species decisions remain unchanged.

The current CFIA Fish List search applies `Snapper` and `Vivaneau` wording to multiple taxa, including records for *Apsilus* spp., *Lutjanus* spp., *Macolor* spp., and species-specific snappers. It also lists specific pairs such as Yellowtail Snapper / Vivaneau à Queue Jaune and Southern Red Snapper / Vivaneau rouge. This supports a broad market-name group in both languages. It is not a biological family definition, exhaustive species roster, or culinary-equivalence class. [S01, S02]

This follows the existing Section P pattern for explicitly qualified [bream and sea-bream](wp04-section-p-bream-sea-bream-market-group-review-r604-20261018.md), [flounder](wp04-section-p-flounder-market-group-review-r280-20261016.md), [sole](wp04-section-p-sole-market-gap-review-r277-20261016.md), and [grouper](wp04-section-p-grouper-market-group-review-r680-20261018.md) market-name groups. The parenthetical wording is a descriptive catalog qualifier, not a quoted regulatory class. This proposal does not reopen the species holds or add individual snapper rows.

## Proposed identity delta

If accepted, add only this reference:

```json
{
  "id": "ingredient-ref-snapper-market-group",
  "nameEn": "snapper (name used for multiple fish species)",
  "nameFr": "vivaneau (nom utilisé pour plusieurs espèces de poissons)",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The identity has no single taxon. Keep `red snapper`, `gray snapper`, `yellowtail snapper`, `vivaneau rouge`, `vivaneau gris`, `vivaneau à queue jaune`, `Pacific snapper`, `poisson rose`, and scientific names outside its aliases. In particular, do not use the group to resolve or merge the held species-specific candidates.

Add no forms, product states, measures, density, unit mappings, package relationships, conversion, edible or cooking yield, recipe link, or substitution. The CFIA names establish labeling scope only; they do not establish interchangeable culinary performance or safe cooking, curing, storage, or raw-consumption equivalence.

## Current catalog, archive, and picker audit

The live snapshot contained **1,896 ingredient references, 201 forms, 56 legacy candidates, and 2,304 research-ledger records**. Normalized exact-owner checks covered reference IDs, names and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs and content. No exact active, form, legacy, or ledger owner was found for the proposed ID, `snapper`, `vivaneau`, or the proposed qualified displays. The broad words appear in archived WP04 research because prior proposals evaluated and held species-specific snapper candidates; those mentions are not an active generic identity.

The focused archive shows these nearby decisions:

- The red-snapper review held *L. campechanus* and the generic snapper/vivaneau allocations because CFIA's labels span taxa and the proposed species row would capture both broad searches.
- R308 held gray snapper (*L. griseus*) for the same picker boundary.
- R700 held yellowtail snapper (*O. chrysurus*) because its supported display would capture the same broad searches.
- R680 added the corresponding visibly qualified grouper / mérou market group without reopening the Red Grouper hold; R604 established the bream and sea-bream group pattern.

This proposal fills only the unallocated generic market-name-group gap. It preserves each reviewed decision and does not imply those named species are cataloged or interchangeable.

The static projection follows phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Only the proposed display pair is added; aliases remain empty.

| Query | Current picker | With proposed row | Boundary |
|---|---:|---:|---|
| `snapper` | 0 | 1: visibly qualified snapper market group | Exposes the broad English market name without selecting a species. |
| `vivaneau` | 0 | 1: visibly qualified vivaneau market group | Exposes the broad French market name without selecting a species. |
| `red snapper`, `gray snapper`, `yellowtail snapper` | 0 | 0 | The group does not absorb held species-specific phrases. |
| `vivaneau rouge`, `vivaneau gris`, `vivaneau à queue jaune` | 0 | 0 | No specific French name is aliased to the broad group. |
| `Pacific snapper`, `poisson rose` | 0 | 0 | CFIA rows with these different paired names are not imported into the group. |
| *Lutjanus campechanus*, *L. griseus*, *Ocyurus chrysurus* | 0 | 0 | Scientific names remain evidence, not picker aliases. |

The visible multi-species qualifier makes the broad result's scope explicit. Future source-qualified species rows may appear alongside this group when their own name and picker boundaries are reviewed; they should remain separate identities.

## Bundled-recipe demand audit

The audit read all **114 manifest-listed recipe files** and all **1,123 ingredient rows**, including parsed ingredient data and complete recipe JSON text. Whole-phrase scans covered `snapper`, `vivaneau`, the red/gray/yellowtail names in both languages, and *Lutjanus campechanus*, *L. purpureus*, *L. griseus*, and *Ocyurus chrysurus*.

**Result: zero matching recipe files and zero matching ingredient rows for every reviewed term.** There is no recipe amount, preparation state, linked line, or demand for a form or substitution. Do not create or relink a recipe row.

## Source register and limits

Sources were reviewed on 2026-10-19. The identifiers below are proposal-local citations only; this proposal creates no shared-ledger source, decision, or candidate record.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP04-SECTIONP-SNAPPER-MARKET-GROUP-R866-20261019-S01** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes the Fish List as a source of English and French common names acceptable for Canadian fish labelling, paired with scientific names. It establishes Canadian label-name scope, not a culinary-equivalence rule or current retail inventory. |
| **WP04-SECTIONP-SNAPPER-MARKET-GROUP-R866-20261019-S02** | CFIA, [English `snapper` Fish List search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=&cmbIn=e&lang=e&q=snapper) | Search results apply `Snapper` and French `Vivaneau` wording across multiple taxa and include separately named red, yellowtail, silk, lane, and other snapper entries; the list also has snapper-labeled taxa outside Lutjanidae. The query returned 57 rows in the reviewed view; rows are not a count of species. The list's displayed modification date is 2023-09-18. This is regulatory naming evidence, not a complete market survey. |
| Reused **WP04-SECTIONP-RED-SNAPPER-20261012-R1-S01**, **WP04-SECTION-P-R308-20261016-S01**, and **WP04-SECTIONP-YELLOWTAIL-SNAPPER-R700-20261018-S01** | OQLF GDT, [vivaneau rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199102/vivaneau-rouge), [vivaneau gris](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199104/vivaneau-gris), and [vivaneau à queue jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1299192/vivaneau-a-queue-jaune) | Québec terminology entries map distinct qualified French fish names to different snapper taxa. They support keeping species phrases outside the broad group's aliases; they do not standardize all snappers as one species, demonstrate substitution, or prove current stock. Their prior proposal citations remain their original owners. |
| **WP04-SECTIONP-SNAPPER-MARKET-GROUP-R866-20261019-R01** | Read-only repository audit: [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7133), active references/forms, [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [scope review](../batches/generic-ingredient-scope-review-20261019/README.md), relevant WP04 proposals/batches, recipe manifest/files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) | Records the current owner/archive check, cross-category roster disposition, static picker projection, and recipe-demand scan. This is proposal evidence, not a shared ledger source. |

## Unresolved risks

- The CFIA Fish List is a labeling-name source, not a comprehensive record of every seafood sold under the word `snapper` or `vivaneau`. The group represents the broad names evidenced there and makes no exhaustive biological or commercial roster claim.
- The paired generic names are not coextensive with every CFIA row containing `Snapper`; some entries use a different French common name. Keep unpaired labels such as `Pacific snapper / poisson rose` separate.
- The proposal found no bundled recipe demand and does not rely on a current Québec consumer listing or claim present stock. Its identity is justified by shared Canadian labeling scope, not recipe frequency or product measurements.
- Species-specific snapper entries remain unallocated under their existing holds. The group must not be used to infer any one species for a recipe or supplier product.
- No measurement, form, yield, conversion, or substitution evidence was established. All remain unmodeled.

## Files reviewed

`AGENTS.md`; the Section P parent in `docs/RecipeBook-global-ingredient-catalog-plan.txt`; `docs/catalog/ingredient-catalog-workflow.md`; the 2026-10-19 generic-scope review; current ingredient-reference, ingredient-form, legacy-identity, and research-ledger JSON; the seed manifest and all manifest-listed recipe files; WP04 red/gray/yellowtail snapper holds; WP04 R604 bream and R680 grouper group proposals; and `IngredientSearch.kt`.

No software tests, build, emulator check, or deployment were run. The active change only adds database JSON under the exception in `AGENTS.md`; static validation is recorded in the integration README.
