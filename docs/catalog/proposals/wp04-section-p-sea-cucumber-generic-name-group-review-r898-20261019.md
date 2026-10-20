# WP04 Section P — sea cucumber generic name-group review (R898)

- **Review and source-access date:** 2026-10-19.
- **Status:** Accepted and integrated on 2026-10-19 as a separate qualified name-group reference and ledger record. The pre-existing held candidate and all 13 of its sources remain unchanged.
- **Root source recheck:** CFIA indexed Fish List results show the exact bilingual pair for multiple taxa; OQLF confirms both the shared multi-species name and the Québec retail-label limitation; CFIA guidance confirms multi-species group names may be considered. The query endpoint did not render directly, so the indexed official result table remains the evidence limit.
- **Open plan anchor:** [Sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood](../../RecipeBook-global-ingredient-catalog-plan.txt#L9303). The broad Section P parent remains open.
- **Existing owner:** The unresolved generic candidate is **candidate-sea-cucumber**. It has 13 historical source records and a prior hold decision. Before integration there was no active generic reference; the two active rows were species-scoped.
- **Recommendation:** Add a separate identity-only, visibly qualified search name group while preserving the held candidate: **sea cucumber (name used for multiple species) / concombre de mer (nom utilisé pour plusieurs espèces)**. This records a shared bilingual name without defining a taxon or claiming that species, parts, or preparations are interchangeable.

## Why revisit the earlier hold

The 2026-10-11 review correctly kept the unresolved generic candidate out of the active catalog because the name spans species and product parts, and the recipe corpus had no demand. After review of the repeated CFIA name pair, this integration adds a separate qualified name-group reference while preserving that candidate unchanged. The CFIA Fish List applies the exact pair “Sea Cucumber / Concombre De Mer” to multiple taxa. This proposal addresses only the shared-name/search identity: the qualifier makes the name-group scope visible alongside the two species references. It does not undo the earlier boundary decision about species, edible parts, or product states.

The proposed French wording is a catalog-authored search display, not a standardized Québec commercial label. The OQLF’s 2012 fish-product entry for *holothurie* says that *concombre de mer*, *bêche de mer*, *trépang*, and *tripang* were not retained for Québec fish-product marketing because one normalized term should correspond to a specific species. That is a material limit: the broad phrase may help a recipe catalog identify a name group, but this proposal does not present it as a label-ready retail name.

CFIA’s indexed Fish List results show the exact bilingual pair “Sea Cucumber / Concombre De Mer” for at least *Athyonidium chilensis*, *Cucumaria frondosa*, *Holothuria scabra*, and *Parastichopus tremulus*. Other rows use species-qualified English wording or a different French pairing. The group is therefore limited to the repeated exact pair; it is not a list of every holothurian, all edible sea-cucumber products, or every fish-list row containing either word.

## Integrated identity only

Added one separate **PROTEIN** reference:

    {
      "id": "ingredient-ref-sea-cucumber-name-group",
      "nameEn": "sea cucumber (name used for multiple species)",
      "nameFr": "concombre de mer (nom utilisé pour plusieurs espèces)",
      "aliasesEn": ["sea cucumbers"],
      "aliasesFr": ["concombres de mer"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-19T00:00:00Z",
      "category": "PROTEIN"
    }

The plural forms are search inflections only. Keep the singular phrase in the visibly qualified display, not as an alias on any species row. Do not add *holothurie*, *bêche-de-mer*, *bêche de mer*, *biche-de-mer*, *trepang*, *tripang*, or *sea slug* as aliases. The sources do not support transferring those terms to this catalog identity, and the OQLF specifically cautions against several of them for Québec fish-product labelling.

Add no form, species or taxon membership list, measurement, density, unit mapping, package relationship, conversion, yield, recipe link, or substitution. In particular, the name group must not be used to infer whether a line means whole animal, muscle, skin, body wall, dried, frozen, gutted, or another part or state.

### Ledger disposition

Added a separate **ingredient-ref-sea-cucumber-name-group** record with **recordType** `ingredient_reference` and **identityState** `verified` only for this qualified shared-name-group scope. The existing **candidate-sea-cucumber** record, its unresolved decision, all 13 source records, and `researched_no_supported_value` measurement state remain unchanged. The new record cites only the reviewed transferable generic-name evidence: it reuses the existing generic OQLF source **WP04-SEACUCUMBER-20261011-S01**, adds the current CFIA repeated-name result, OQLF naming caveat, and CFIA common-name guidance. Species- and product-specific candidate sources were not copied. The new record has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; no measurement or substitution finding was added.

## Source-by-source transferability review

| Evidence | Transferability decision |
|---|---|
| OQLF, generic *concombre de mer* entry, updated 1983; existing source **WP04-SEACUCUMBER-20261011-S01** | Reusable only for the fact that the generic French name is used for multiple holothurian species and is paired with English *sea cucumber*. It does not identify a recipe-compatible species or edible part. |
| CFIA Fish List, exact “Sea Cucumber / Concombre De Mer” pair across multiple species; fresh result reviewed below | Reusable only to document a shared bilingual name group. It does not establish a taxonomy, a single culinary ingredient state, or an equivalence class. |
| OQLF, *holothurie* fish-product terminology, updated 2012 | Use as a limitation, not as support for the generic display: OQLF identifies the Québec fish-product naming concern and prefers a species-linked term for marketing. The proposed qualified catalog display is not an approved label. |
| OQLF, *holothurie touffue* / *Cucumaria frondosa*, updated 2026; existing source **WP04-SEACUCUMBER-20261011-S02** | Do not transfer the species identity or its preferred name to the group. Keep *orange-footed sea cucumber / holothurie touffue* and *concombre de mer du Nord* scoped to *C. frondosa*. |
| Seafood from Canada, DFO, Québec producer listings, and the *C. frondosa* processing-yield study already recorded on the candidate | Do not transfer any edible-part claim, fresh/dried/frozen product claim, processing method, yield, package amount, or species statement. Each remains scoped to its source, named species, fishery, study, and product as originally recorded. |
| DFO Pacific plan and giant-red sea-cucumber profile already recorded on the candidate | Do not transfer Pacific *Apostichopus californicus* fishery data, frozen muscle-strip or dried-skin claims, landing figures, or other product-specific evidence to the name group. |

No product-specific measure or claim was generalized. Manufacturer and seller pages were not pursued for this name-group review.

## Current ownership, picker projection, and recipe demand

The pre-integration 2026-10-19 read-only snapshot contains **1,924 active ingredient references**, **201 forms**, **56 legacy candidates**, **2,327 ledger records**, **10,979 ledger source entries**, and **9,216 distinct source IDs**. The seed manifest lists **114 recipes** with **1,123 structured ingredient rows**.

Before integration, the only active sea-cucumber references were:

- **ingredient-ref-giant-red-sea-cucumber** — *giant red sea cucumber / holothurie de Californie*, with species-qualified aliases.
- **ingredient-ref-orange-footed-sea-cucumber** — *orange-footed sea cucumber / holothurie touffue*, with species-qualified aliases.
- One form under the latter: dried, gutted body wall of orange-footed sea cucumber.

Before integration, no active generic row or legacy-import identity owned the proposed name group. The ledger candidate was its sole generic-history owner. The proposed reference ID was unused across active references, forms, legacy candidates, and ledger record IDs; the proposal path and R898 source-ID prefix were also unused before drafting. The Section P queue and current cross-category scope-review README showed no other live WP04 assignment for this candidate.

The picker projection below mirrors phrase-first matching and partial-match fallback in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static data projection, not an emulator result.

| Query | Pre-integration results | With proposed group (now active) | Boundary |
|---|---:|---:|---|
| “sea cucumber” | 2: giant red; orange-footed | 3, including qualified name group | Keeps the broad query visibly multi-result; does not select a species. |
| “sea cucumbers” | 0 | 1 | Plural search inflection only. |
| “concombre de mer” | 1: orange-footed via “concombre de mer du Nord” | 2, including qualified name group | Does not make the generic phrase an alias on a species row. |
| “concombres de mer” | 0 | 1 | Plural search inflection only. |
| “holothurie” | 2: the two species rows | 2 | No broad *holothurie* alias is introduced. |
| “concombre de mer du Nord”; *Cucumaria frondosa*; *Apostichopus californicus* | 1 each, species-scoped | Unchanged | Preserve current species-specific ownership. |
| “bêche-de-mer”; “bêche de mer”; “biche-de-mer”; “trepang”; “tripang”; “sea slug” | 0 | 0 | No unsupported alternate-language or broad aliases. |

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for “sea cucumber(s),” “concombre(s) de mer,” “holothurie(s),” *Cucumaria*, *Apostichopus*, “bêche-de-mer,” “biche-de-mer,” “trepang,” “tripang,” and “sea slug.” **There were zero recipe-file hits and zero ingredient-row hits.** No recipe amount, product state, form, or substitution target is supported by the bundle; none is proposed.

## Queue disposition and no-transfer boundary

The reviewed Section P line is generic seafood identity work, not a commercial roster assignment. No brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task was encountered or pursued. Any such roster-only work is out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and their evidence remain untouched.

Keep all existing species identities and product records intact. Do not delete or merge the giant-red or orange-footed entries into the group. Do not move the orange-footed dried, gutted body-wall form. Do not generalize fishery product measurements, analytical processing yields, seller pack sizes, or amounts from named products or studies to this group. No source supports a generic mass/volume conversion, edible yield, preparation equivalence, storage claim, safety claim, or recipe substitution.

The name group does not designate all Holothuroidea or all CFIA rows containing “sea cucumber” or “concombre de mer.” It records only that the exact bilingual pair is applied to multiple seafood species. Similar names and product use do not establish culinary interchangeability.

## Sources

The source IDs below were proposal-local. Integration reuses existing source `WP04-SEACUCUMBER-20261011-S01` for the OQLF generic-name evidence and adds S01, S03, and S04 under the proposal prefix; no source entry was copied from the candidate for a species or commercial product.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP04-SECTIONP-SEACUCUMBER-NAME-GROUP-R898-20261019-S01** | CFIA, [Fish List results for sea cucumber](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=sea%20cucumber), checked 2026-10-19. The official indexed results show the exact “Sea Cucumber / Concombre De Mer” pair for multiple taxa, including *Athyonidium chilensis*, *Cucumaria frondosa*, *Holothuria scabra*, and *Parastichopus tremulus*. The list’s displayed modification date is 2023-09-18. | Species-linked Canadian labelling names, not recipe aliases, a complete taxonomy, current retail supply, product state, or interchangeability. The query endpoint did not render directly in the web reader; the indexed official result supplied the rows. |
| **Existing `WP04-SEACUCUMBER-20261011-S01` (reused)** | Office québécois de la langue française, [concombre de mer, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435715/concombre-de-mer), food/fishery-products domain, updated 1983. It pairs the French term with *sea cucumber* and says several holothurian species carry the name. | Generic terminology only; the old entry does not establish a current retail product, a species membership list, or culinary equivalence. |
| **WP04-SECTIONP-SEACUCUMBER-NAME-GROUP-R898-20261019-S03** | Office québécois de la langue française, [holothurie, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198935/holothurie), updated 2012. It says that broad alternatives including *concombre de mer* were not retained for Québec fish-product commercialization to avoid label confusion, and that one normalized term corresponds to one specific species. | A naming constraint and caveat. It does not establish an approved internal catalog search display; this qualified display must not be represented as an official commercial label. |
| **WP04-SECTIONP-SEACUCUMBER-NAME-GROUP-R898-20261019-S04** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25. Sections 4 and 5.2.2 describe the Fish List’s species-linked labelling role and note that group names covering multiple species may be considered. | Labelling guidance; it does not establish recipe identity, aliases, or culinary equivalence for this catalog. |
| **WP04-SECTIONP-SEACUCUMBER-NAME-GROUP-R898-20261019-R01** | Read-only repository audit: the [open Section P anchor](../../RecipeBook-global-ingredient-catalog-plan.txt#L9303), previous [generic hold](wp04-sea-cucumber-species-product-boundary-review-20261011.md), [species/product reassessment](wp04-sea-cucumber-current-product-state-reassessment-20261011.md), current active references/forms, legacy identities, research ledger, recipe manifest and files, and [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Ownership, recipe-demand, and picker evidence only; not external identity evidence or a shared-ledger source. |

## Recommendation

Accept one separate identity-only **PROTEIN** name group for **sea cucumber (name used for multiple species) / concombre de mer (nom utilisé pour plusieurs espèces)**. Keep the generic phrase visibly qualified, preserve the held candidate exactly as it was, preserve the giant-red and orange-footed identities and the orange-footed form, and retain all previous product-specific evidence at its original scope. The earlier hold remains intact for species, edible-part, and product equivalence; the new reference resolves only the shared-name search identity. Leave recipe links, forms, measurements, conversions, yields, and substitutions absent.
