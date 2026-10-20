# WP04 Section P — Rockfish / sébaste multi-species market-name group review

- **Review and source-access date:** 2026-10-19.
- **Status:** Proposal only. No catalog, ledger, plan, checklist, recipe, or workflow data changed.
- **Plan anchor:** The open Section P finfish and regional-fish checklist begins at [global catalog plan, line 7172](../../RecipeBook-global-ingredient-catalog-plan.txt#L7190); Section P begins at [line 7148](../../RecipeBook-global-ingredient-catalog-plan.txt#L7166).
- **Candidate:** The Canadian broad fish-label pair `Rockfish / Sébaste`, represented as a visibly qualified multi-species name group.
- **Recommendation:** Add identity-only `rockfish (name used for multiple fish species) / sébaste (nom utilisé pour plusieurs espèces de poissons)` as `ingredient-ref-rockfish-market-group` in `PROTEIN`.

## Scope and queue disposition

This proposal addresses one generic seafood name group under the open finfish checklist. It does not assign a single species, define a biological group beyond the source-attested name scope, or claim that fish sold under the broad name are interchangeable.

The 2026-10-19 [generic ingredient coverage review](../batches/generic-ingredient-scope-review-20261019/README.md) found no open checklist task whose sole objective is a brand, product-line, flavour-family, or retailer-variant roster. Such roster work is out of scope because commercial-product counts do not add ingredient diversity. That review records the Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead as out of scope for the same generic-coverage reason; that product-only line is closed and is not pursued here. No commercial brand or product pages were researched for this proposal. Preserve every existing branded entry and product-scoped observation.

## Why this is a distinct generic identity gap

The Canadian Food Inspection Agency (CFIA) Fish List includes the generic genus-level entry `Sebastes spp.` paired with the English name `Rockfish` and the French name `Sébaste`. It also applies `Rockfish` wording across many separately named taxa. This is direct evidence that the broad English label and paired French term cover multiple fish species in Canadian fish nomenclature; it is not evidence that the listed species share culinary performance. [S01, S02]

The Office québécois de la langue française (OQLF) classifies **sébaste** in both ichthyology and edible-fish domains, links it to *Sebastes* sp., and records three species in Québec catches. The entry was last updated in 2012 and states that one species-specific term is normalized for Québec fish-product marketing to avoid consumer labelling confusion. This is a limit on the proposal: the visibly qualified French group display below is a catalog-authored search scope, not an OQLF-approved product-label class. [S03]

Québec's 2026 MAPAQ seafood brochure documents `sébaste` as a Québec fishery group. It reports preliminary 2025 landings under that group and describes the fish as valued for its delicate, slightly sweet flavour. Those claims support a culinary fish ingredient context; the landings and commercial values are fishery statistics, not recipe amounts, portions, or reusable measures. The brochure does not identify the species behind any individual product. [S04]

This fills the generic `rockfish / sébaste` name gap while keeping the visible scope broad. It does not expand to every CFIA row containing `rockfish`, `redfish`, `rosefish`, `ocean perch`, `snapper`, or `poisson rose`; those words have overlapping, source-specific assignments and are excluded from aliases.

## Existing boundaries to preserve

Keep the active `Québec redfish / sébaste du Québec` market group distinct. It represents a Québec *Sebastes* fishery scope and does not provide a Canada-wide alias for this proposal. Keep the active species-scoped Acadian redfish, Beaked redfish, and bocaccio identities unchanged. Preserve the holds for Pacific ocean perch, Canary rockfish, Yelloweye rockfish, and Yellowmouth rockfish; none is promoted, merged, or given a new alias here.

Also keep other redfish, snapper, rosefish, ocean-perch, and prepared-fish identities separate. In particular, do not use the new group to infer a species for a recipe or an unqualified supplier product. Existing source evidence, measurements, and decisions remain attached to their current records.

## Proposed identity delta

If accepted, add one identity-only reference:

```json
{
  "id": "ingredient-ref-rockfish-market-group",
  "nameEn": "rockfish (name used for multiple fish species)",
  "nameFr": "sébaste (nom utilisé pour plusieurs espèces de poissons)",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The parentheses are a catalog-authored scope qualifier. Add no aliases, forms, density, unit mappings, package relationships, measurements, edible or cooking yield, conversion, recipe link, or substitution. The sources do not establish a common preparation state, amount, safe-cooking equivalence, or interchangeable performance across the named taxa.

## Source register and limits

Sources were checked on 2026-10-19. Reused source IDs retain their existing owners. The focused CFIA result is proposal-local and is not a shared-ledger write.

| Source ID | Source | Supports and limits |
|---|---|---|
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes the Fish List as Canadian English/French fish-label common-name guidance paired with scientific names. It defines the source's scope, not culinary equivalence or current retail inventory. |
| **Proposal-local `WP04-SECTIONP-ROCKFISH-MARKET-GROUP-20261019-S01`** | CFIA, [Fish List results for `Rockfish`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=rockfish) | Includes `Sebastes spp. — Rockfish — Sébaste` and many separate taxa with Rockfish wording. The result page displays a 2023-09-18 modification date. Rows are not product counts or a complete market survey; the names do not prove interchangeability. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01`** | OQLF, [sébaste (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Identifies `sébaste` as a Québec edible-fish term for *Sebastes* sp., notes three species in Québec catches, and gives English translations including `redfish`, `rosefish`, and `ocean perch`. Last updated in 2012. Its warning about consumer fish labels means the proposed visibly qualified French catalog wording must not be presented as an OQLF-approved generic product label. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S02`** | MAPAQ, [Poissons et fruits de mer du Québec à l’international (2026 brochure PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/BR_brochure-poissons-fruits-mer-qc-int_MAPAQ.pdf) | Uses `SÉBASTE` for the Québec fishery group; reports preliminary 2025 landings and describes the fish as valued for delicate, slightly sweet flavour. Group-level fishery/culinary context only; no specific species, recipe portion, product state, or consumer-stock guarantee. |
| **R01 — proposal-local audit** | Read-only review of the Section P checklist, generic-scope review, active references/forms, legacy candidates, research ledger, WP04 fish proposals, seed manifest, recipe files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) | Repository ownership, queue, picker, and recipe-demand observations only; not an external source or shared-ledger record. |

## Catalog, archive, picker, and recipe audit

The worktree snapshot contained **1,907 ingredient references**, **201 forms**, **56 legacy candidates**, and **2,313 research-ledger records**. Exact normalized ownership checks found no exact active reference, form, legacy candidate, ledger record ID, or ledger identity-text owner for `ingredient-ref-rockfish-market-group` or either proposed display. The focused source-ID prefix was not present in the ledger. No proposal file owns the proposed ID or qualified displays.

Current nearby active identities include Québec redfish, Acadian redfish, Beaked redfish, bocaccio, and canned Québec redfish. The proposal preserves them. Earlier Pacific ocean-perch and individual rockfish reviews held species-specific rows because their displays would make the broad `sébaste` or `rockfish` search appear to name one species. A qualified market-name group changes that broad query result without reopening those holds.

The static picker projection follows phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It adds only the proposed display pair and no aliases or forms.

| Query | Current results | With proposed row | Boundary |
|---|---|---|---|
| `rockfish` | 0 | 1: visibly qualified multi-species name group | The broad English term becomes searchable without selecting one species. |
| `sébaste` / `sebaste` | 4 existing references | 5, including the qualified group | Existing Québec redfish and species-qualified rows remain visible. |
| Exact proposed English or French display | 0 | 1 | Exact broad group label. |
| `redfish` | 4 existing references | Unchanged | No redfish alias is added. |
| `ocean perch`, `Pacific Ocean Perch` | 0 | 0 | The held *Sebastes alutus* candidate remains unallocated. |
| `Yellowmouth Rockfish`, `Canary Rockfish` | 0 | 0 | Species-specific holds remain untouched; the generic group does not absorb qualified names. |
| `Bocaccio` | Existing bocaccio reference | Unchanged | The active species identity remains separate. |
| `Québec redfish` | Raw and canned Québec redfish references | Unchanged | Existing regional raw/prepared boundary remains separate. |

The manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. A normalized whole-phrase scan of every parsed recipe object and ingredient row found **zero matches** for `rockfish`, `sébaste`, `Sebastes`, or the reviewed species-specific rockfish terms. There is no bundled recipe demand, species selection, amount, preparation state, or substitution context. Do not add a recipe link.

## Evidence limits

- CFIA's list contains label names associated with named taxa, including a genus-level `Sebastes spp.` entry. The proposal represents the broad paired market wording and does not claim that all rows containing `Rockfish` share one culinary identity.
- OQLF's *sébaste* entry is Québec-specific and warns against confusing consumer fish labels; it does not standardize the proposal's catalog-authored parenthetical as a market label.
- MAPAQ's 2026 brochure describes a Québec fishery group and taste, but it does not establish one species, a retail package, or an individual recipe ingredient.
- No forms, measures, densities, yields, conversions, recipe links, or substitutions are supported. The proposal makes no food-safety equivalence claim.
- No brands, commercial product lines, flavours, SKUs, or retailer variants were researched. Existing branded entries and their product-specific evidence remain intact.

## Files reviewed

`AGENTS.md`; the Section P plan parent and finfish checklist; `docs/catalog/ingredient-catalog-workflow.md`; the [2026-10-19 generic ingredient coverage review](../batches/generic-ingredient-scope-review-20261019/README.md); current ingredient references, forms, legacy identities, research ledger, seed manifest, and all manifest-listed recipes; and relevant WP04 Quebec-redfish, Acadian-redfish, Beaked-redfish, bocaccio, Pacific-ocean-perch, Canary-rockfish, Yelloweye-rockfish, and Yellowmouth-rockfish records.

No software tests, build, emulator check, or deployment were run. This proposal changes no application or database data.
