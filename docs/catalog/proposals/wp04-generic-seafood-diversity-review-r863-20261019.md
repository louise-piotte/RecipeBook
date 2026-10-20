# WP04 Section P — Witch Flounder / plie grise identity review (R863)

- **Status:** Proposal only; no catalog or ledger data changed.
- **Review date:** 2026-10-19.
- **Recommendation:** Add one identity-only `PROTEIN` reference for Witch Flounder / plie grise (*Glyptocephalus cynoglossus*), with no aliases or numeric behavior.
- **Exact plan anchor:** The open Section P finfish and regional-fish parent, [global catalog plan, line 7115](../../RecipeBook-global-ingredient-catalog-plan.txt#L7133). Section P begins at [line 7091](../../RecipeBook-global-ingredient-catalog-plan.txt#L7109).

## Scope and queue disposition

This is one generic species-identity gap under Section P’s open finfish parent. It does not reopen the species-neutral flounder or sole market groups, American plaice, winter flounder, yellowfin sole, or earlier flatfish boundary reviews. Those existing entries and evidence remain intact.

The 2026-10-19 generic-scope review found no open checklist task whose sole objective is another branded-product roster. Any brand-specific canned product, product-line, retailer-only variant, or flavor child task is out of scope because catalog exhaustiveness measures ingredient diversity, not the number of commercial products. No such product was researched or proposed here; existing branded references remain unchanged.

## Identity and Québec naming evidence

OQLF’s edible-fish entry normalizes **plie grise**, pairs it with English **witch flounder**, and identifies *Glyptocephalus cynoglossus*. It explicitly discourages *sole* and *sole grise* because Canadian flatfish sold under the commercial name *sole* can refer to several different species. The Québec display should therefore use `plie grise`; the source-listed French `plie cynoglosse` is identified as France usage, and the other broader market wording is not promoted to aliases. [S01]

CFIA’s Fish List associates TSN 172873 (*G. cynoglossus*) with `Witch Flounder`, `Greysole / Plie Grise`, and generic `Flounder / Plie`. The same lookup applies `Flounder / Plie` to multiple other taxa. This supports the species boundary, but it is fish-labelling nomenclature rather than evidence that the species is interchangeable with other flatfish. [S02]

Fisheries and Oceans Canada identifies *G. cynoglossus* as a North Atlantic species found in the Gulf of St. Lawrence. Its current 2026 Gulf groundfish management plan lists witch flounder in NAFO divisions 4RST. These sources establish Canadian species and fishery context, not current retail stock in Québec or consumer demand. [S03, S04]

## Proposed identity delta

If accepted, add one reference:

```json
{
  "id": "ingredient-ref-witch-flounder",
  "nameEn": "witch flounder",
  "nameFr": "plie grise",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

Keep *Glyptocephalus cynoglossus* in identity evidence, not as a picker alias. Do not add `flounder`, `plie`, `sole`, `sole grise`, `grey sole`, `gray sole`, `greysole`, or `plie cynoglosse` as aliases. OQLF cautions against the sole labels, while CFIA applies the broader flounder/plie wording across taxa. The active market groups already preserve those broad searches.

Add no forms, measures, density, unit mappings, package relationships, conversion, yield, recipe link, or substitution. No source supports a recipe portion or culinary interchangeability with other species.

## Current ownership, picker, and recipe audit

The current canonical reference JSON has **1,892** entries and the forms JSON has **201** entries. The legacy identity file has **56** candidates and the research ledger has **2,300** records. No active reference, form, legacy candidate, or ledger record owns the proposed ID, exact bilingual display pair, or scientific name. Existing `ingredient-ref-flounder-market-group` and `ingredient-ref-sole-market-group` remain untouched; related species references also remain separate.

The query projection follows the current phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current results | With proposed row | Effect |
| --- | ---: | ---: | --- |
| `witch flounder` | 0 | 1 | Exact English species identity. |
| `plie grise` | 0 | 1 | Exact Québec French species identity. |
| `flounder` | 2 | 3 | Remains a multi-result query; the group and dried-flatfish powder remain visible. |
| `plie` | 2 | 3 | Remains a multi-result query; American plaice and the flounder market group remain visible. |
| `sole` | 2 | 2 | Unchanged; no sole term is added. |
| `grey sole`, `gray sole`, `sole grise` | 0 | 0 | No ambiguous sole aliases are introduced. |

The complete manifest-listed corpus was scanned: **114 recipe files and 1,123 ingredient rows**. There were no matches for `witch flounder`, `plie grise`, `plie cynoglosse`, *Glyptocephalus cynoglossus*, `grey sole`, or `gray sole`; no recipe link is supported.

## Source register and limits

Sources were accessed on 2026-10-19. New IDs below are proposal-local only; no source or finding is added to the shared ledger by this proposal. Reuse existing ledger source IDs for the CFIA flounder lookup and the DFO 2026 Gulf plan rather than duplicating those URLs.

| Source ID | Source and evidence | Limit |
| --- | --- | --- |
| **WP04-SECTIONP-WITCH-FLOUNDER-R863-20261019-S01** | OQLF GDT, [plie grise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198644/plie-grise). Edible-fish domain; preferred Québec term, English `witch flounder`, and *G. cynoglossus*; notes that `sole` and `sole grise` are discouraged. | Terminology and species identity; not current retail inventory or culinary-measure evidence. |
| **Reused WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02** | CFIA, [Fish List flounder query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=flounder). Lists the species-specific and broad Flounder/Plie names, with the 2023-09-18 Fish List modification date. | Canadian fish-labelling names, not ingredient equivalence or present retail availability. |
| **WP04-SECTIONP-WITCH-FLOUNDER-R863-20261019-S02** | Fisheries and Oceans Canada, [Witch Flounder profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/witch-flounder-plie-grise-eng.html). Identifies *G. cynoglossus* and its North Atlantic/Gulf of St. Lawrence distribution. | Biological profile; no recipe, measurement, or current store-stock claim. |
| **Reused WP04-P-ATLANTIC-WOLFFISH-20261012-S04** | Fisheries and Oceans Canada, [2026 Gulf of St. Lawrence Groundfish Integrated Fisheries Management Plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2026/groundfish-poisson-fond-4rst-3pn-4vn-eng.html). Includes witch flounder (*G. cynoglossus*) in NAFO divisions 4RST. | Fishery-management evidence, not current consumer inventory or kitchen guidance. |
| **WP04-SECTIONP-WITCH-FLOUNDER-R863-20261019-S03** | Fisheries and Oceans Canada, [Commercial fisheries for witch flounder](https://www.dfo-mpo.gc.ca/fisheries-peches/commercial-commerciale/atl-arc/witch-flounder-plie-gris-eng.html). Current commercial-fishery page with 2026–27 fishery-plan links. | Does not prove current Québec retail supply, a recipe request, or a preparation state. |

The DFO French-language profile switch returned an HTTP 500 during this review and is not relied on; OQLF supplies the Québec French naming evidence and CFIA provides the bilingual Fish List rows. No inaccessible page is treated as reviewed.

## Files checked

- `AGENTS.md`, `roadmap.md`, and `docs/RecipeBook-global-ingredient-catalog-plan.txt` (Section P and its finfish, flounder, and sea-bream progress).
- `docs/catalog/ingredient-catalog-workflow.md` and the current [generic-scope review](../batches/generic-ingredient-scope-review-20261019/README.md).
- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`, `ingredient-forms.v1.json`, and `manifest.v1.json` plus all manifest-listed recipe files.
- `docs/catalog/legacy-import-identities.v1.json` and `docs/catalog/research-ledger.v1.json`.
- Relevant WP04 history: the [finfish gaps review](wp04-finfish-gaps-20261010.md), the [sole market-name review](wp04-section-p-sole-market-gap-review-r277-20261016.md), the [flounder market-group review](wp04-section-p-flounder-market-group-review-r280-20261016.md), the [R604 bream market-group review](wp04-section-p-bream-sea-bream-market-group-review-r604-20261018.md), and the [R630 gilthead-bream review](wp04-section-p-next-regional-fish-gap-review-r630-20261018.md).
- `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` for the picker projection.

## Unresolved risks

- The proposal establishes a valid generic edible-fish identity and Canadian fishery context, but not current Québec consumer availability or recipe demand.
- The CFIA Fish List uses several broad or overlapping flatfish market names. The identity is safe only with the proposed species-qualified displays and without the excluded aliases.
- No measurement, preservation/form, yield, or substitution evidence was researched or found; all remain open.
- No software tests are needed for proposal-only work.
