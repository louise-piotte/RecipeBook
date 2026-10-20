# WP04 Section P — generic mackerel / maquereau market-name group (R869)

- **Review date:** 2026-10-19.
- **Status:** Proposal only; no catalog, ledger, plan, recipe, or workflow data changed.
- **Recommendation:** Add one identity-only `PROTEIN` reference for the Canadian multi-species market-name pair `mackerel / maquereau`, with the visible qualifier `name used for multiple fish species` in both languages. Do not assign a single species or claim culinary interchangeability.
- **Plan anchor:** The current Section P parent begins at [line 7120](../../RecipeBook-global-ingredient-catalog-plan.txt#L7138), and its open fish-identity checklist is at [line 7144](../../RecipeBook-global-ingredient-catalog-plan.txt#L7162). Earlier qualified mackerel rows deliberately kept the generic words off their identities at [line 9003](../../RecipeBook-global-ingredient-catalog-plan.txt#L9031); R869 resolves that separate generic market-name gap.

## Scope and prior decisions

This review advances one generic seafood identity boundary under the open finfish parent. The group represents the broad bilingual Canadian label pair `Mackerel / Maquereau` where CFIA associates that pair with more than one fish species. It is a market-name group, not a biological taxon or a promise that its member species have equivalent culinary performance.

The 2026-10-09 [pollock and mackerel species review](wp04-pollock-mackerel-species-boundary-review-20261009.md) advanced qualified Atlantic and Pacific mackerel identities but left generic `mackerel / maquereau` unresolved because the Canadian list spans multiple species. R869 resolves that gap at the market-name level, using the same visibly qualified grouping approach used elsewhere in Section P. It does not change the earlier qualified identities or convert the group into an alias on them.

Keep all existing rows and evidence intact, including Atlantic, Pacific, Indian, short, Japanese Spanish, narrow-barred Spanish, and spotted Spanish mackerel; canned mackerel; canned mackerel in tomato sauce; and smoked mackerel. The existing horse-mackerel / `chinchard` hold remains separate. The new group covers only the bare paired market names `Mackerel / Maquereau`; it does not absorb every fish whose longer name contains “mackerel,” such as horse, Spanish, king, Atka, snake, or icefish mackerel labels. Do not use the group to resolve or merge any species row.

The 2026-10-19 cross-category scope review says coverage means generic ingredient diversity, not exhaustive brand, product-line, flavor, or retailer-variant rosters. No brand-only child task appeared in the reviewed Section P queue. No commercial-product rosters were researched for R869. If such a child task appears later, it remains out of scope for that reason; existing branded rows and their product-scoped evidence remain preserved.

## Bilingual identity evidence and boundary

OQLF’s GDT entry gives the preferred Québec edible-fish term **maquereau**, the English term **mackerel**, and *Scomber* sp. It was last updated in 1998. This supports the Québec French and English generic terms, but its *Scomber* scope is narrower than every name containing “mackerel.” Do not read it as a current inventory statement or a complete taxonomy of mackerel-named fish. [S01]

CFIA describes its Fish List as a Canadian fish-labelling resource that pairs acceptable English and French common names with scientific names and taxonomic serial numbers. Its mackerel results include the exact pair **Mackerel / Maquereau** for *Scomber* spp. (TSN 172411) and *Rastrelliger kanagurta* (TSN 172462). CFIA also lists many qualified or compound mackerel names against other taxa, often with different French terms or no French name. This supports a visibly multi-species group only for the exact paired bare label; it does not support importing all those compound names, assigning one taxon, or treating the fish as interchangeable. [S02, S03]

The CFIA search page reports 94 result rows in the reviewed query; that count includes repeated rows for species risk information and is not a count of species. The result page displays a 2023-09-18 modification date. This is Canadian labelling nomenclature, not evidence of current Québec retail stock, recipe demand, or culinary equivalence.

## Proposed identity delta

If accepted, add one identity-only reference:

```json
{
  "id": "ingredient-ref-mackerel-market-group",
  "nameEn": "mackerel (name used for multiple fish species)",
  "nameFr": "maquereau (nom utilisé pour plusieurs espèces de poissons)",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The parenthetical is a catalog-authored scope qualifier, not a quoted CFIA common name. Keep the scientific names, species-qualified names, and all product-specific names out of aliases. In particular, do not add `Atlantic mackerel`, `Pacific mackerel`, `Indian mackerel`, `short mackerel`, `Spanish mackerel`, `horse mackerel`, `king mackerel`, `maquereau de l’Atlantique`, `maquereau du Pacifique`, `maquereau des Indes`, `chinchard`, `thazard`, or any scientific name as an alias.

Add no forms, measures, density, unit mappings, recipe links, package relationships, conversions, yields, or substitutions. The name group does not establish common cooking times, safety, flavor, texture, edible yield, or a tested replacement ratio among its member species.

## Source, catalog, archive, and recipe audit

### Source ownership and limits

The two identity sources already have ledger owners, so this proposal allocates no new source IDs or ledger findings. The CFIA overview source is also already shared across Section P identity records.

| Source ID | Source | Supports and limits |
|---|---|---|
| **Reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S07`** | OQLF, [GDT: *maquereau*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau), accessed 2026-10-19. | Gives the Québec-preferred edible-fish term `maquereau`, English `mackerel` / `Atlantic mackerel`, and Latin *Scomber* sp.; the entry was last updated in 1998. Terminology and taxon scope only, not current sales, measures, or equivalence across species. |
| **Reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06`** | CFIA, [Fish List results for `Mackerel`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?c=&lang=e&q=Mackerel), rechecked 2026-10-19. | Lists the exact `Mackerel / Maquereau` pair for *Scomber* spp. and *Rastrelliger kanagurta* among other species-qualified or compound-name rows. The result page is labelling evidence, not culinary equivalence or retail inventory. The web reader could not decode this legacy result URL directly; the same CFIA query was reviewed through the indexed result view. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), rechecked 2026-10-19. | Describes the Fish List’s English/French acceptable fish-labelling names paired with scientific names and TSNs. It defines the source’s scope, not recipe use or interchangeability. |
| **R01 (proposal-local audit)** | Read-only audit of this proposal’s plan, catalog, ledger, archive, recipe manifest, and search implementation. | Repository evidence only; not a source citation or shared-ledger record. |

### Active catalog and archive ownership

The refreshed snapshot contains **1,898 ingredient references**, **201 forms**, **56 legacy candidates**, and **2,306 research-ledger records** with **10,877 source entries**. No active reference, form, legacy candidate, or ledger record owns proposed ID `ingredient-ref-mackerel-market-group` or either proposed qualified display. The bare words occur within longer existing terms and in prior research; that is phrase-search overlap, not exact ownership of a generic group row.

Current related reference rows are the qualified species identities Atlantic, Indian, Pacific, short, Japanese Spanish, narrow-barred Spanish, and spotted Spanish mackerel, plus the distinct canned, canned-in-tomato-sauce, and smoked identities. `Gooseberry / groseille à maquereau` also appears for the French substring query. The earlier R157 `horse mackerel / chinchard` hold remains unchanged. The archive contains earlier discussions that kept generic mackerel unresolved but no active generic group allocation; R869 is not a repeat of the snapper or witch-flounder work.

The proposed ID and qualified display pair have no exact normalized owner in references, forms, legacy candidates, or ledger record IDs/text. The source IDs and URLs in S01–S03 are already registered to their existing owners; preserve those records rather than creating duplicate source entries. No proposal or batch archive entry owns the R869 proposal path or a generic mackerel group ID.

The static picker projection follows phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The group has empty alias arrays; broad results arise from the words in the visible display.

| Query | Current results | With proposed row | Boundary |
|---|---:|---:|---|
| `mackerel` | 10 references | 11 | Remains multi-result; the generic market-name group appears alongside existing qualified and prepared identities. |
| `maquereau` | 7 fish references plus gooseberry | 8 fish references plus gooseberry | Remains multi-result; no product or species row is replaced. |
| `mackerel (name used for multiple fish species)` | 0 | 1 | Exact proposed English display. |
| `maquereau (nom utilisé pour plusieurs espèces de poissons)` | 0 | 1 | Exact proposed French display; normalizer folds accents. |
| `Atlantic mackerel`, `Pacific mackerel`, `Indian mackerel`, `short mackerel` | Existing exact species result | Unchanged | The group adds none of these phrases as an alias. |
| `canned mackerel`, `smoked mackerel` | Existing prepared-product results | Unchanged | Prepared identities and evidence remain separate. |
| `horse mackerel` | 0 | 0 | The R157 `chinchard` boundary hold remains unchanged. |
| `Spanish mackerel` | 3 species-qualified results | 3 species-qualified results | No bare Spanish-mackerel phrase is added to the generic group. |
| `king mackerel` | 0 | 0 | No king-mackerel or `thazard` identity is added. |
| `Scomber`, *Scomber scombrus*, *Rastrelliger kanagurta* | No scientific-name result | No scientific-name result | Taxa remain evidence, not aliases or picker keys. |

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned, including full recipe JSON text. Searches for `mackerel`, `maquereau`, and `Scomber` found **zero matching recipe files and zero matching ingredient rows**. No recipe demand, amount, preparation state, reference link, or substitution context supports a recipe change.

## Unresolved risks and limits

- OQLF’s 1998 `maquereau` entry identifies *Scomber* sp., while CFIA assigns the paired `Mackerel / Maquereau` label to both *Scomber* spp. and *Rastrelliger kanagurta*. The proposed row therefore represents the observed Canadian paired market-name group, not a taxonomic class. Reviewers may choose to narrow it to OQLF’s *Scomber* scope if the picker cannot make this distinction clear.
- CFIA’s Fish List documents acceptable Canadian labelling names. It does not establish that every fish under a broad name has matching culinary performance or that the named fish are interchangeable.
- No current Québec consumer listing or bundled recipe demand was found for an unqualified raw mackerel group. This proposal is a naming-boundary recommendation, not a claim of current stock or usage frequency.
- No form, measurement, density, yield, conversion, or substitution evidence was established. All remain unmodeled.
- Existing branded identities and their product-specific evidence remain untouched. No brand, product-line, flavor-family, or retailer-variant roster was researched or proposed.

## Files reviewed

`AGENTS.md`; [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) (Section P parent and mackerel checklist); `docs/catalog/ingredient-catalog-workflow.md`; the [2026-10-19 generic-scope review](../batches/generic-ingredient-scope-review-20261019/README.md); current ingredient references, forms, legacy identities, research ledger, seed manifest, and all manifest-listed recipes; the 2026-10-09 pollock/mackerel species review; mackerel species and preparation boundary proposals; the R157 horse-mackerel hold; and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

No software tests were run. This proposal changes no application or catalog data.
