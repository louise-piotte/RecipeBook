# WP03 Section M proposal — generic feijoa identity (R943)

- **Reviewed:** 2026-10-19
- **Status:** Integrated. Root accepted the generic identity and added one reference and one research-ledger record. The existing generic guava and all unrelated branded entries remain unchanged.
- **Scope:** One generic culinary fruit identity, *Feijoa sellowiana* (also listed by OQLF as *Acca sellowiana*). No commercial-product or cultivar roster.
- **Plan anchor:** Section M remains open for regional fruits from cuisine sweeps and for remaining generic fruit coverage ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7025)). WP03 is owned by the plant ingredient catalog agent.

## Recommendation

Add one identity-only `feijoa / feijoa` reference in `FRUIT`, scoped to the culinary fruit of *Feijoa sellowiana*. OQLF's GDT places `feijoa` in the food/fruit domain, gives `feijoa` in both French and English, and lists English `pineapple guava`. University of Florida IFAS independently identifies the fruit as feijoa / pineapple guava, distinguishes it from common guava, and documents fresh dessert use as well as canned and jellied uses. This is a distinct generic fruit identity missing from the current catalog. [S01–S02]

Keep the English alias narrowly qualified as `pineapple guava`; do not add bare `guava`, `Brazilian guava`, `goyavier du Brésil`, or `goyave-ananas`. UF/IFAS distinguishes feijoa from common guava, while its Spanish extension text also uses a Brazilian-guava name for a different *Psidium* species. The unqualified guava identity stays separate. [S01–S02]

This proposal does not create a canned, jellied, fresh, peeled, or pulp form. Source descriptions of preparation and processing establish culinary relevance, but do not define a reusable form boundary or recipe demand. Do not transfer a fresh-fruit measurement, peel rule, cultivar property, or source-specific replacement claim into active data.

## Current ownership and scope check

The live package snapshot has **1,961 ingredient references, 205 forms, and 114 manifest-listed recipes with 1,123 ingredient rows**. A case-insensitive scan of the active references, research ledger, and all bundled recipe ingredient and source text found no `feijoa`, `pineapple guava`, `Feijoa sellowiana`, or `Acca sellowiana` match. There is no exact active owner, legacy candidate, form, or ledger record for the proposed identity or qualified English alias.

The existing `ingredient-ref-guava` remains `guava / goyave` with empty alias lists. Preserve it unchanged. No branded feijoa row or product-specific evidence was found in the active package or ledger; this proposal does not add, merge, delete, or reuse any branded entry or claim. The WP03 Section M owner remains responsible for the generic identity decision.

| Query | Current owner | With proposal | Search consequence |
|---|---|---|---|
| `feijoa` / `feijoas` | None | `ingredient-ref-feijoa` | Selects the new generic fruit. |
| `pineapple guava` | None | `ingredient-ref-feijoa` | The qualified phrase selects feijoa. |
| `guava` | `ingredient-ref-guava` | Both the generic guava and feijoa rows | Expected qualified-name overlap: the search treats `guava` as a complete word in `pineapple guava`. Keep both full display names and do not add bare `guava` as a feijoa alias. |

The unchecked-plan scope scan found no task assigned solely to expand a brand, product-line, flavour-family, SKU, or retailer-variant roster. Two open checklist items mention brands only to constrain evidence transfer. Any commercial-only roster expansion remains out of scope because commercial-product counts do not add ingredient diversity. The selected work is generic culinary fruit coverage.

## Recipe-demand check

All **114 manifest-listed recipes and 1,123 ingredient rows** were scanned for `feijoa`, `feijoas`, `pineapple guava`, `pineapple-guava`, `goyavier du Brésil`, `goyave-ananas`, and both scientific-name variants. No ingredient row or recipe source/text match was found. Do not create a recipe link, relink, or quantity.

The absence of bundled demand does not erase the open regional-fruit coverage gap: the OQLF food-domain entry and independent extension evidence support a useful generic lookup identity. The identity decision is source-backed and does not imply that feijoas are commonly available in Québec.

## Proposed reference row

The integrated reference contains only:

```json
{
  "id": "ingredient-ref-feijoa",
  "nameFr": "feijoa",
  "nameEn": "feijoa",
  "aliasesFr": [],
  "aliasesEn": ["feijoas", "pineapple guava"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FRUIT"
}
```

Use the attested English plural `feijoas` and the qualified OQLF English term. Do not alias the bare common-guava term. Keep fruit forms, density, mappings, package yields, conversions, recipe links, and substitutions empty.

## Proposed ledger state and evidence limits

The `ingredient_reference` ledger record for `ingredient-ref-feijoa` uses:

- `identityState: verified` for the generic culinary fruit identity and bilingual display;
- `measurementState: researched_no_supported_value`;
- `substitutionResearchState: blocked_pending_evidence`;
- no active measurement observations, form record, conversion, yield, or substitution rule.

UF/IFAS reports typical fruit weights and says pulp may substitute in a recipe calling for banana or apple. Those statements are not general app measurements or a scoped substitution rule: the reported weight is horticultural size information and the replacement claim omits dish, role, preparation, ratio, and warning scope. Keep them source-bounded; do not encode either as active behavior. The source's fresh, canned, and jellied use descriptions likewise do not establish Québec market availability, fruit-part equivalence, a peel rule, edible yield, or interchangeable forms. [S02]

The OQLF page is authoritative for Québec terminology but dates from 1991. Its sensory and peel note is not used to establish a preparation rule; this proposal does not decide whether a given recipe uses flesh alone or another part. OQLF lists both scientific-name forms, and UF/IFAS uses *Feijoa sellowiana*; no botanical-name alias is proposed. [S01–S02]

## Sources

Sources were accessed 2026-10-19. The source IDs listed below are now recorded on `ingredient-ref-feijoa` in the shared ledger.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-SECTIONM-FEIJ-R943-20261019-S01** | Office québécois de la langue française, [feijoa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082817/feijoa), entry updated 1991. | Supports preferred Québec French `feijoa`, English `feijoa` and `pineapple guava`, food/fruit domain, and the listed scientific-name forms *Feijoa sellowiana* / *Acca sellowiana*. Its dated sensory and peel note is not adopted as a current preparation rule. |
| **WP03-SECTIONM-FEIJ-R943-20261019-S02** | University of Florida IFAS Extension, [Growing Feijoa Fruit in Florida](https://ask.ifas.ufl.edu/publication/HS1424). | Supports the feijoa / pineapple-guava naming, distinction from common guava, and fresh-dessert, canned, and jellied culinary uses. Its Florida horticultural context, cultivar details, typical weights, storage guidance, and broad pulp-substitution sentence do not establish Québec availability, transferable measures, peel behavior, or general substitutions. |

## Reopen and preservation criteria

Accept the identity only with the scope and names above. Keep generic guava distinct and preserve every existing branded row and product-scoped source record. Reopen alias, form, measurement, peel, or substitution work only when a recipe or source with the relevant scope supports that specific decision. The broader Section M fruit and fruit-product checklist remains open.
