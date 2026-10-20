# WP03 generic produce/herb diversity review — common purslane — R862

**Status:** Proposal only. No catalog, ledger, plan, roadmap, workflow, code, or other file was changed.

**Reviewed:** 2026-10-19
**Plan anchors:** [Section K leafy-green diversity](../../RecipeBook-global-ingredient-catalog-plan.txt#L6495), especially [other regional greens and shoots](../../RecipeBook-global-ingredient-catalog-plan.txt#L6593); preserve the [wild-plant handling boundary](../../RecipeBook-global-ingredient-catalog-plan.txt#L6608).

## Recommendation

Add one identity-only leafy vegetable reference for common purslane, *Portulaca oleracea*:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-common-purslane` |
| English display | `common purslane` |
| Québec French display | `pourpier commun` |
| Category | `VEGETABLE_AND_AROMATIC` |
| English aliases | `purslane` |
| French aliases | `pourpier` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

The identity is for the food plant *Portulaca oleracea*, commonly sold or gathered for its leaves and used as a leafy vegetable. It does not represent every plant called purslane, all species in *Portulaca*, or a foraging identification. Keep its English and French names specific enough to distinguish it from the separate *Talinum fruticosum* waterleaf discussion in [WP06 R502](wp06-african-next-regional-review-r502-20261017.md).

## Why this is an open generic gap

Section K still asks for additional documented regional greens. The current bundled reference JSON contains 1,892 identities; searches of reference names and aliases, ingredient forms, the research ledger, and legacy candidates found no common-purslane or *Portulaca oleracea* identity or candidate. A search of the 114 manifest-listed bundled recipe files found no matching purslane wording or botanical name. That absence describes this bundle only; no recipe demand is claimed.

Recent WP03 progress has added named leafy-green identities, while the broader Section K sweep remains open. The most recent WP03 plant-food changes recorded in the workflow include Section L R629–R675 pepper, tomato, and jackfruit follow-ups; this candidate is a distinct Section K leafy-green identity.

**Existing out-of-scope boundary:** Section K mentions the Broccolini trademark only as a generic-alias exclusion; it is not a queued research task. This proposal does not research or expand that branded product. Existing branded rows and all existing data remain untouched.

## Bilingual naming and boundaries

| Term | Treatment | Evidence and reason |
|---|---|---|
| `common purslane` / `pourpier commun` | Displays | OQLF lists both as preferred terms and links the French vegetable entry to *Portulaca oleracea*. The Québec Herbier records *pourpier potager* / *common purslane* for the same species. |
| `purslane` / `pourpier` | Narrow search aliases | OQLF lists these as English and French terms for its *P. oleracea* vegetable entry. The alias `pourpier` belongs to this source-bounded identity; it is not transferred to waterleaf. |
| `pursley` | Do not activate | OQLF lists it as an English synonym, but it is very close in spelling to the existing `parsley` identity and could create a misleading picker result. |
| `pourpier potager`, `pourpier comestible`, `garden purslane` | Evidence only | Québec botanical and retail sources use these descriptions, but the proposed display and aliases are sufficient; no extra alias is needed. The retail page is for a potted plant, not a fresh-produce package. |
| *Portulaca oleracea* | Ledger/taxonomic scope only | It fixes the identity boundary. Do not add it as a user-facing alias or generalize to the genus. |
| `Surinam purslane`, `pourpier de Suriname`, *Talinum fruticosum* | Keep separate / do not alias | R502's waterleaf proposal explicitly excludes these as names for *Talinum*. It does not establish them as synonyms for *P. oleracea*. Do not cross-link waterleaf and common purslane. |

The OQLF entry is old (last updated in 1991), but a current Québec gardening retailer independently uses *pourpier comestible* for *P. oleracea*. No reviewed source supports a common kitchen amount, mass, density, form conversion, cooking yield, or substitute.

## Proposed data

### Active reference

```json
{
  "id": "ingredient-ref-common-purslane",
  "nameFr": "pourpier commun",
  "nameEn": "common purslane",
  "aliasesFr": ["pourpier"],
  "aliasesEn": ["purslane"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Research ledger

Add an `ingredient_reference` record with ID `ingredient-ref-common-purslane`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Store the sources below and an `accepted` identity decision. Add no measurement observations or substitution findings. The source IDs are proposal-only and were not found in the existing ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP03-PURSLANE-IDENTITY-R862-20261019-S01` | Office québécois de la langue française, [GDT: pourpier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082784/pourpier) | The entry is in the vegetable domain; preferred French terms are `pourpier` and `pourpier commun`, English terms include `purslane` and `common purslane`, and the Latin name is *Portulaca oleracea*. Its notes describe culinary use and ordinary sale of leaves, including historical Québec context. Last updated 1991, so it is terminology and identity evidence, not current retail availability evidence. `sourceKind: regional_authority`. |
| `WP03-PURSLANE-IDENTITY-R862-20261019-S02` | Gouvernement du Québec, [Herbier du Québec: Pourpier potager](https://herbierduquebec.gouv.qc.ca/produit/pourpier-potager/) | Records French `pourpier potager`, English `common purslane`, and *Portulaca oleracea*; supports the local species/name boundary, not food use or recipe measurement. `sourceKind: regional_authority`. |
| `WP03-PURSLANE-IDENTITY-R862-20261019-S03` | Pépinière.ca, [Pourpier comestible](https://www.pepiniere.ca/products/pepiniere-ca-pourpier-comestible) | Québec-facing retailer identifies *P. oleracea* as edible purslane and describes culinary use of its leaves and young stems. It is a potted-plant listing and showed no stock when accessed; its pot size, plant dimensions, and availability do not transfer to a recipe ingredient. `sourceKind: other`. |
| `WP03-PURSLANE-IDENTITY-R862-20261019-S04` | University of Wisconsin–Madison Division of Extension, [Common Purslane, *Portulaca oleracea*](https://hort.extension.wisc.edu/articles/common-purslane-portulaca-oleracea/) | Updated 2025; identifies common purslane and describes it as a fresh or cooked vegetable used in salads, soups, stews, and sauces. This supports generic culinary identity only; no quantity or conversion is transferred. `sourceKind: extension`. |

## Audit and unresolved risks

- Checked the active reference JSON, ingredient-forms JSON, research ledger, legacy-import candidates, Section K/L checklist, `ingredient-catalog-workflow.md`, the generic-ingredient scope review, recent WP03 progress, R502's waterleaf boundary, and all manifest-listed recipe files. Exact name/ID/source-prefix searches found no existing purslane identity, ledger candidate, or owner for this proposal's ID and source IDs.
- The proposed identity does not claim ordinary fresh-cut purslane is currently sold in Québec grocery stores. The Québec retail evidence is for a potted plant, and the listing showed it out of stock when accessed.
- No botanical foraging guidance is proposed. Field identification, pesticide exposure, and handling cautions remain outside the catalog identity; preserve the plan's explicit no-foraging-guarantee rule.
- `pourpier` has a separate naming discussion in R502 for waterleaf. OQLF ties it to the *P. oleracea* vegetable entry, while R502 does not use it for *Talinum*. Keep the source IDs and taxonomic scopes separate; recheck picker ownership if a future Surinam-purslane identity is proposed.
- A Québec IRIIS phytoprotection search result was not used: direct page retrieval returned a cache miss. No claim in this proposal depends on that inaccessible page.

This proposal-only review does not require software tests.
