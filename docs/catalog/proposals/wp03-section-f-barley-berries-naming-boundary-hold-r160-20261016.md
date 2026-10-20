# WP03 Section F — “barley berries” naming boundary hold (R160, 2026-10-16)

## Review record

- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, recipe, or generated-index file was changed.
- **Recommendation:** Keep the bare phrase **barley berries** unassigned. Do not add it as an alias to generic barley, hulled barley, or another existing row, and do not create a new ingredient identity.
- **Identity and candidate IDs:** None proposed or allocated. The exact candidate string `ingredient-ref-barley-berries` was checked and is unused; this review does not reserve it.
- **Ledger change:** None recommended. The source labels S01–S06 below are local to this proposal, not allocated ledger source IDs.
- **Scope:** Canadian human-food listings use “barley berries” for whole-kernel products with different processing states. The current evidence does not establish one product identity, one Québec French name, or a useful unqualified picker destination.

## Candidate choice and prior work

The active [Section F plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L519) keeps further grain identities and naming boundaries open. The most recent focused Section F reviews considered soft white winter wheat berries in R157, puffed teff naming in R158, and soft red wheat berries in R159; none allocates or decides the barley-berries phrase. The [R159 proposal](wp03-section-f-soft-red-wheat-berries-identity-review-r159-20261016.md) and [R159 integration record](../batches/wp02-wp03-wp04-r159-gap-review-integration-20261016/README.md) confirm that the current review follows the integrated R159 package.

The archive has adjacent barley decisions, which remain intact:

- Generic `barley / orge` was added as an unqualified edible-grain choice in [R52](wp03-section-f-generic-barley-grain-identity-review-20261013-r52.md).
- [R88](wp03-section-f-next-grain-review-r88-20261013.md) mapped `hulless barley`, `naked barley`, and `orge à grains nus` to the existing `hulled barley / orge mondé` row.
- Pot barley remains a separate identity with a provisional French display, as reviewed in [R110](wp03-section-f-pot-barley-quebec-display-recheck-r110-20261014.md).
- A [barley-meal boundary review](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md#L45) quotes one Yukon mill's phrase “whole hulless barley berries” while describing cross-cut pieces sold as barley meal or grits. That is a contextual description inside the barley-meal review, not an ownership decision for the general phrase “barley berries.”

No focused proposal, hold, active reference, form, legacy-import identity, or ledger candidate for the bare term was found. The current active plan does not allocate it.

## Product and naming boundary

Two Canadian product pages use the phrase for different processing states:

1. Against the Grain Farms' Ontario Made listing is titled **Whole Grain Barley Berries** and describes its “ATG barley berries” as a hulless Canadian barley variety [S01].
2. Expeditor Dry Goods' Alberta listing is titled **Purple Barley Berries** and explicitly says the berries are **semi-pearled** [S02].

This means the phrase does not identify a single degree of processing. Assigning it to `hulled barley` would misclassify at least the semi-pearled product; assigning it to generic `barley` would turn a product-specific search into a single broad result that hides the available processing choices. A new row would also have no stable boundary while the same phrase is used for both hulless and semi-pearled grains.

The Québec terminology sources do not resolve that ambiguity. OQLF pairs **barley / orge** and says `orge` applies to the plant and grain [S03]. Its separate entry for **hulled barley / orge mondé** defines barley whose outer covering has been removed [S04]. Neither entry defines “barley berries” or supplies a Québec French consumer term for the hulless and semi-pearled products together. The CFIA's French `grain d'orge` definition is in an **animal-feed** ingredient table and is not adopted as a human-food picker name [S05].

Do not add `grains d'orge`, `grain d'orge`, or `orge en grains` as aliases on this evidence. The first two phrases were not found as exact keys in the current reference/form/legacy catalogs, and the reviewed French regulatory use is outside the human-food scope. Keep the established Québec displays `orge`, `orge mondé`, `orge perlé`, and provisional `orge en pot` attached to their current identities.

## Current ownership and picker audit

The current package contains **1,534 references**, **119 forms**, **61 legacy candidates**, and **1,879 ledger records / 7,983 source entries / 6,831 distinct source IDs**. The manifest lists **114 recipes / 1,123 structured ingredient rows**. Exact keys were compared after the app's accent, case, punctuation, and ligature normalization; the picker behavior was reviewed in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Normalized query | Current exact owner | Effect or boundary |
| --- | --- | --- |
| `barley berries`; `barley berry`; `whole barley berries`; `whole grain barley berries`; `purple barley berries`; `hulled barley berries` | None | No current search result. |
| `grains d'orge`; `grain d'orge`; `orge en grains` | None | No exact French key. The animal-feed definition for `grain d'orge` is not a culinary alias decision. |
| `barley` | `ingredient-ref-barley` — `barley / orge` | The existing generic query returns 18 barley-related choices, including hulled, pearl, pot, flakes, and flour. |
| `hulled barley`; `orge mondé` | `ingredient-ref-hulled-barley` — `hulled barley / orge mondé` | Keep the established hulled choice and its current aliases `hulless barley`, `naked barley`, and `orge à grains nus`. |
| `pearl barley`; `orge perlé` | `ingredient-ref-pearl-barley` — `pearl barley / orge perlé` | Keep separate from hulled and pot barley. |
| `pot barley`; `orge en pot` | `ingredient-ref-pot-barley` — `pot barley / orge en pot` | Keep the current provisional French display; this review does not reopen it. |

If the exact English alias `barley berries` were added to `ingredient-ref-barley`, the picker would return only that generic row for the exact query. If assigned to `ingredient-ref-hulled-barley`, the picker would return only hulled barley, despite the Canadian semi-pearled example. No new ID is justified by the observed name alone.

| Local source label | Exact current ledger ownership by URL |
| --- | --- |
| S01, S02, S06 | No current ledger source record. |
| S03 | `WP03-GENERIC-BARLEY-R52-20261013-S01` on `ingredient-ref-barley` and `ingredient-ref-barley-bran`; `WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S03` on `ingredient-ref-barley-starch`; `WP03-PBARLEY-20261011-S04` on `ingredient-ref-puffed-barley`; `WP03-QCBARLEY-20261012-S05` on `ingredient-ref-quick-cooking-barley`; and `WP03-SPBARLEY-20261012-S06` on `ingredient-ref-sprouted-barley`. |
| S04 | `WP03-S32` on `ingredient-ref-hulled-barley` and `ingredient-ref-pot-barley`; `WP03-PB-NAME-20261011-S01` also appears on `ingredient-ref-pot-barley`. |
| S05 | `WP03-PRYE-20261011-S06` on `candidate-puffed-rye`; `WP04-BONGA-POWDER-20261011-S05` on `ingredient-ref-bonga-dried-fish-powder`; `WP03-MILO-GRAIN-20261012-S04-FR` on `ingredient-ref-grain-sorghum`; `WP03-S139` on `ingredient-ref-hominy-grits` and `ingredient-ref-pearled-hominy`; and `WP02-B3-PEA-STARCH-IDENTITY-20261012-S03` on `ingredient-ref-pea-starch`. |

Reuse existing source records if evidence is later integrated; do not allocate duplicate source IDs. The checked R160 source-ID prefix `WP03-BARLEY-BERRIES-R160-20261016-S` has no active ledger collision, and no source IDs are allocated here.

## Recipe demand, measures, and substitution behavior

The full manifest scan covered all **114 listed recipe files** and **1,123 structured ingredient rows**. It found zero exact phrase mentions for the English/French candidate variants above and zero rows linked to generic, hulled, pearl, or pot barley. There is no bundled recipe demand for a new identity, alias, or process form.

The active `ingredient-ref-barley` row has `defaultDensity: null` and `unitMappings: []`. It has no ingredient form or package-yield entry. The only active barley forms are dry and cooked pearl-barley forms; both explicitly carry no density, conversion, or cooking-yield relation. The Ontario Made page's `1/4 cup` is tied to a fiber claim and gives no mass; Expeditor's `454 g` is the listed product package size, not a recipe conversion. No mass/volume conversion, density, or reusable yield can be inferred from these observations.

The current global and contextual substitution-rule files contain no barley rules. The generic barley ledger record already marks measurement research as `researched_no_supported_value` and substitution research as `researched_no_supported_substitute`. No form conversion, cooking yield, recipe link, or substitute is proposed.

## Bounded hold and reopening condition

Keep the bare phrase unassigned. Reopen only if a Québec-facing human-food label or controlled product specification pairs “barley berries” with a defined hull/pearling state and an appropriate French product name, or if recipe demand calls for a narrower grain state. A qualified, source-backed phrase can then be reviewed against the existing generic, hulled, pearl, and pot identities. The bare phrase still should not become an alias if the product scope continues to span processing states.

## Source register

| Local label | Source | Evidence and limits |
| --- | --- | --- |
| S01 | Against the Grain Farms, [Whole Grain Barley Berries](https://supportontariomade.ca/explore-products/whole-grain-barley-berries), Ontario Made listing; accessed 2026-10-16. | Product title, “ATG barley berries” wording, and description of the maker's hulless barley variety. It supports this seller's whole-grain product wording and process description; it provides no French product title or reusable measure. |
| S02 | Expeditor Dry Goods, [Purple Barley Berries](https://expeditordrygoods.com/products/purple-barley-berries); accessed 2026-10-16. | Alberta-grown product listing says its barley berries are semi-pearled and whole grain. The page shows a 454 g package and “Sale Coming soon”; neither package size nor availability is treated as a recipe measure or evidence of inventory. No French label is shown. |
| S03 | Office québécois de la langue française, [orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), updated 2019; accessed 2026-10-16. | Gives `barley` as the English equivalent of `orge` and says `orge` applies to the plant and grain. It does not specify hull, pearling, or the term “barley berries.” |
| S04 | Office québécois de la langue française, [orge mondé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde), updated 2004; accessed 2026-10-16. | Gives `hulled barley` as the English equivalent and defines barley whose outer covering has been removed. It does not define semi-pearled barley or “barley berries.” |
| S05 | Canadian Food Inspection Agency, [Tableau canadien des ingrédients des aliments du bétail](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail), entry 1-201-002; accessed 2026-10-16. | Defines `grain d'orge` as whole barley grains within a regulated animal-feed ingredient table. This is a domain-specific French term, not a Québec human-food product label. |
| S06 | Central Milling, [Organic Hulled Barley Berries](https://centralmilling.com/product/organic-whole-barley-berries/); accessed 2026-10-16. | A U.S. mill uses the qualified title and says the tough outer hull has been removed. This confirms “berries” also appears with a hulled product, but it is not Canadian or Québec naming evidence. |
