# WP03 Section K generic edible-flower diversity review — borage flowers — R874

**Status:** Integrated on 2026-10-19; see the [R874 integration README](../batches/wp03-section-k-borage-flowers-identity-integration-r874-20261019/README.md).

**Reviewed:** 2026-10-19

**Plan anchor:** The open [documented edible-flower checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6607).

## Recommendation

Add one identity-only reference for **borage flowers / fleurs de bourrache**, scoped to the edible floral part of positively identified, food-grown *Borago officinalis*. Keep the base plant, leaves, seeds, seed oil, and unrelated plants called borage separate. The Québécois food-wording source supplies `bourrache / borage` and the Latin name; a Québec biological-production guide documents `fleurs de bourrache`, identifies the edible floral part, and describes food use. Colorado State and University of Alaska Cooperative Extension sources independently support edible garnish/candied or recipe uses.

The Québec guide says to detach the flower from the hairy calyx and achenes. Its 2009 edition also reports pyrrolizidines in aboveground parts and animal toxicity in cited studies, with greater concern for prolonged use. Keep this as dated, source-scoped evidence. It is not a current human-risk assessment, a safety recommendation, or a numeric limit. No safe serving amount can be inferred from these sources. CSU additionally cautions that edible flowers require positive identification and food-safe growing/source selection. This row makes no foraging guarantee.

## Exact data

```json
{
  "id": "ingredient-ref-borage-flowers",
  "nameFr": "fleurs de bourrache",
  "nameEn": "borage flowers",
  "aliasesFr": [],
  "aliasesEn": ["borage blossoms"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Do not add plain `borage` or `bourrache` as aliases; those are names of the base plant, not specifically its edible flowers. Do not add the scientific name as a picker alias. Add no forms, recipe links, measures, density, unit mappings, conversions, yields, or substitutions. Keep measurement and substitution research `not_yet_researched`.

## Sources and transfer limits

| Source ID | Source | Evidence and limit |
|---|---|---|
| `WP03-K-BORAGE-FLOWERS-R874-20261019-S01` | OQLF, [bourrache (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297066/bourrache), updated 1990. | Food/vegetable-domain entry pairs `bourrache` with `borage` and *Borago officinalis*. It establishes the base plant name and taxon, not flower-part wording or edible use. |
| `WP03-K-BORAGE-FLOWERS-R874-20261019-S02` | Colorado State University Extension, [Edible Flowers](https://extension.colostate.edu/resource/edible-flowers/), 1996; reviewed 2025-08. | Lists *B. officinalis* / borage for garnish and candying. Its general positive-identification and food-safe sourcing cautions apply; it gives no reusable quantity. |
| `WP03-K-BORAGE-FLOWERS-R874-20261019-S03` | Filière des plantes médicinales biologiques du Québec, [La bourrache — Guide de production sous régie biologique](https://www.agrireseau.qc.ca/agriculturebiologique/documents/guide-bourrache.pdf), 2009 edition, legal deposit 2010. | Québec source labels the taxon *B. officinalis*, names it `bourrache / borage`, says the flowers are edible after detaching them from the calyx and achenes, and describes use in confectionery, syrup, and pastry garnish. It also reports pyrrolizidines in aerial parts based on older cited studies; this is retained as a dated source caution only, with no human safety threshold inferred. Any cultivation, harvest, or dried-flower production figures are source-specific, not kitchen measures. |
| `WP03-K-BORAGE-FLOWERS-R874-20261019-S04` | University of Alaska Fairbanks Cooperative Extension, [An Alaska Herb Garden](https://www.uaf.edu/news/archives/wordpress-images/2015/01/Herb-Book-11-3-14.pdf), November 2014. | States that borage flowers are edible and gives garnish, drink, dessert, and candy uses. Its named recipe contexts and ingredient amounts do not transfer to a general flower measure. |

## Ownership and recipe checks

Pre-integration audit found no exact owner for `borage flowers`, `borage blossoms`, `fleurs de bourrache`, *Borago officinalis*, or the proposed ID in active references, forms, the ledger, or legacy import identities. The 114 manifest-listed recipes were scanned; no recipe file, structured ingredient, or full-text occurrence matched. No recipe link is added.

Exact queries `borage flowers`, `borage blossoms`, and `fleurs de bourrache` resolve to the new identity. Search for plain `borage` or `bourrache` returns the flower identity because the display contains those words; the visible display explicitly says flowers. No broad whole-plant alias is stored.

No branded or retailer-specific product evidence was researched. Product-specific measurements elsewhere remain with their products and are not transferred. No queued brand-only task was found in the cross-category scope audit; any future commercial roster-only expansion remains out of scope because product counts do not measure ingredient diversity.

No software tests were run. This database JSON addition is covered by the `AGENTS.md` data-only testing exception; static data and package checks are recorded in the integration README.
