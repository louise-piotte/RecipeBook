# WP02 B1 hazelnut flour versus hazelnut meal — boundary review

- **Review date:** 2026-10-10
- **Scope:** identity labels and aliases for ground hazelnut products; recipe demand and active search collisions.
- **Disposition:** keep the existing identity-only `hazelnut flour / farine de noisette` row. Hold a separate `hazelnut meal` identity and all meal-related aliases. The reviewed evidence uses the two English names both interchangeably and distinctly, and the bundled recipes do not require either product.
- **Change status:** proposal only. No seed, ledger, checklist, batch report, code, or test files were changed.

## Recommended decisions

| Item | Decision | Reason |
| --- | --- | --- |
| `ingredient-ref-hazelnut-flour` | **Keep** | The live reference already has the source-backed English and French display names, the `FLOUR_AND_STARCH` category, empty aliases and unit mappings, and null density. Its ledger identity state is `verified`; measurements and substitutions remain `not_yet_researched`. |
| Separate hazelnut-meal identity | **Hold; do not add** | English-language manufacturer and industry sources use *meal* for a product also called *flour*, while at least one supplier uses the terms for different grind grades. The reviewed sources do not establish a stable market-wide boundary. No bundled recipe asks for meal. |
| Aliases on the existing flour row | **Keep empty; add none and remove none** | The current aliases are empty. Assigning *hazelnut meal* or its French retail wording could pull a coarser meal product into the flour result. The reviewed alternative terms need a source-specific grade or process before they can safely identify this row. |
| Proposed Canadian English / Québec French display | **Keep** `hazelnut flour` / `farine de noisette` | Both are attested as product wording in Canadian retail sources. The OQLF supports the underlying noun pair *noisette / hazelnut*, but does not define a flour or meal term. `Farine de noisette` is therefore a source-backed product label, not an OQLF ruling. |

The reviewed Canadian retail wording also includes `hazelnut meal flour`, `farine de noisettes`, and an ingredient declaration `farine / semoule de noisette`. These attestations demonstrate naming overlap; they are **not** proposed as aliases. Hold `hazelnut meal`, `farine de noisettes`, and `farine / semoule de noisette` outside the active row until a recipe or product specification identifies the intended grind/product. Do not add broad `ground hazelnuts`, `hazelnut powder`, `poudre de noisette(s)`, `noisettes moulues`, `filbert meal/flour`, or `tourteau de noisette` aliases from this review. The latter wording can denote press cake used to make a defatted flour, which is process-qualified rather than generic.

## Live catalog, ledger, search, and recipe audit

The audit read the active `ingredient-references.v1.json` and `ingredient-forms.v1.json`, `research-ledger.v1.json`, and `legacy-import-identities.v1.json`; query behavior follows `IngredientSearch.kt`. The current split seed package contains **709 ingredient references** and **34 forms**. The current research ledger has **898 records**; the legacy import candidate list has **84 candidates**. The active `ingredient-ref-hazelnut-flour` row is present exactly once with `hazelnut flour / farine de noisette`, no aliases, null density, no unit mappings, and category `FLOUR_AND_STARCH`. Its ledger record is identity-verified; measurement and substitution states are `not_yet_researched`. There is no separate hazelnut-meal reference or ledger identity record. No hazelnut flour/meal phrase belongs to a form or legacy candidate.

The query results below follow the app's normalized, whole-word-phrase-first search behavior over current active references and forms. When the phrase has no match, search falls back to substring matching.

| Query | Current result |
| --- | --- |
| `hazelnut flour` | `ingredient-ref-hazelnut-flour` only |
| `farine de noisette` | `ingredient-ref-hazelnut-flour` only |
| `hazelnut meal`; `hazelnut meal flour` | No active reference or form result |
| `farine de noisettes`; `farine / semoule de noisette`; `hazelnut powder`; `poudre de noisette(s)`; `noisettes moulues`; `ground hazelnuts`; `filbert meal/flour`; `tourteau de noisette` | No active reference or form result |
| `hazelnut` | Hazelnut butter, hazelnut flour, and hazelnut spread with cocoa. Whole hazelnuts do not match this singular whole-word query. |
| `hazelnuts` | Whole hazelnuts only |
| `noisette` | Hazelnut butter and hazelnut flour |
| `noisettes` | Gianduja nut chocolate, hazelnut butter (through its existing `beurre de noisettes` alias), hazelnut spread with cocoa, and whole hazelnuts |

Recipe demand was checked through every path in the package manifest: **114 recipes and 1,123 ingredient rows**. Exact searches across recipe ingredient lines and text found **no** `hazelnut flour`, `hazelnut meal`, `hazelnut meal flour`, `farine de noisette(s)`, `farine / semoule de noisette`, `poudre de noisette(s)`, `noisettes moulues`, or `ground hazelnuts` demand. Broader hazelnut ingredient matches are limited to three lines in two recipes:

- `021-buche-de-noel-yule-log…`: `60 g finely chopped hazelnuts`, linked to whole hazelnuts.
- `031-dattes-au-chocolat-3-saveurs-chocolate-dates-3-flavors…`: hazelnut butter and whole hazelnuts in the hazelnut version.

These are whole-nut and butter ingredients, not flour/meal requirements; no relinking is proposed.

## Evidence and limits

All linked online sources below were checked on **2026-10-10**. For Nutworks, the wording was available in the indexed product listing while direct access showed the storefront in maintenance mode.

| Source | Claim supported | Limits |
| --- | --- | --- |
| [OQLF, *noisette*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083830/noisette) | Québec terminology entry pairs *noisette* with English *hazelnut*. It notes that hazelnuts are consumed as nuts or in powder, including in pastry. | It does not give a preferred term for hazelnut flour or meal, or establish that flour, meal, and powder are equivalent. Targeted OQLF/TERMIUM searches in this review did not locate a dedicated entry for those products; that is not proof that no such entry exists. |
| [Bob’s Red Mill, Hazelnut Flour/Meal Natural](https://www.bobsredmill.com/product/hazelnut-flour-meal) | Manufacturer uses both names on one product page and describes the product as ground from whole nuts. This directly attests overlapping retail use. | A single product label does not define all products sold as meal or flour. Its raw-nut description is not a universal process rule. |
| [Oregon Hazelnut Industry Office, “Hazelnut meal explained”](https://oregonhazelnuts.org/hazelnut-meal-explained/) | The industry office explicitly says hazelnut meal is often called hazelnut flour and describes a finely ground hazelnut product. | Oregon industry usage is not a Canadian standard or a universal definition. |
| [Atlas Hazelnuts, “Hazelnut Meal & Hazelnut Flour”](https://atlashazelnuts.com/hazelnut-meal-flour.html) | Supplier separately lists coarse meal and fine flour options, showing that some product lines use the names to distinguish grind. | This is one supplier's product taxonomy. The page was search-indexed, but direct fetch returned an error during review. It does not establish that unqualified *meal* always means coarse or that all flour is finer. |
| [Edora Hazelnuts, Hazelnut Flour](https://edorahazelnuts.com/products/hazelnut-flour/) | Manufacturer describes the product as “flour — or meal” and separately mentions project-specific defatted options. This supports overlapping names and cautions against making defatted content universal. | It does not define a general meal/flour grade boundary. |
| [FoodServiceDirect Canada, hazelnut flour / Good Eats Hazelnut Meal / Flour](https://www.foodservicedirect.ca/foods/baking-ingredients/flours/hazelnut-flour.html) | Canadian distributor uses `hazelnut flour` as its page heading and lists a Good Eats product named `Hazelnut Meal / Flour`. This attests both English names in Canadian retail/distribution. | Its retail category and product listing do not define a universal grind or make every meal product equivalent to flour. |
| [Healthy Planet Canada, Good Eats Hazelnut Meal Flour](https://www.healthyplanetcanada.com/fr/grocery/flour/good-eats-hazelnut-meal-flour-gluten-free-400g.html) | Canadian retail listing uses English `Hazelnut Meal Flour`; its French page displays `farine de noisette` and describes ground whole hazelnuts. The ingredient declaration says `Farine / semoule de noisette`. This supports the proposed bilingual display and attests local retail name variation. | Retail copy and the product's wording do not define a universal grind or settle the meal/flour boundary. |
| [Nutworks Canada, Hazelnut Meal / *farine de noisettes*](https://store.nutworks.ca/fr/products/hazelnut-meal) | Canadian storefront search listing pairs the English product *Hazelnut Meal* with French title *farine de noisettes*. | The wording is supported by the indexed listing, not direct page content; the store was in maintenance mode. It does not give a product grind specification. |
| [CFIA, AIRS updates, December 2, 2024](https://inspection.canada.ca/en/importing-food-plants-animals/plant-and-plant-product/airs/cfia-airs-updates-2024-12-02) | The Canadian import system groups hazelnut under the commodity description “flour, meal and powder.” This shows an administrative category that does not separate those names. | AIRS commodity grouping is not a consumer-language ruling or a product standard and is not used here to equate products. |
| [La Maison de la Noisette, *farine de noisettes déshuilée*](https://boutique.lamaisondelanoisette.com/produit/la-farine-de-noisettes-deshuilee-500gcopie/) | French-language manufacturer describes a defatted hazelnut flour made from finely ground press cake (`tourteaux`). It supports keeping press-cake-derived flour process-qualified. | France-based product wording is not a Québec French authority or evidence that generic meal is defatted. |

## Scope limitations

This review decides names, aliases, and whether to create a separate meal identity. It does not decide fat level, defatting, roast, skin status, particle-size thresholds, product performance, or whether a specific recipe can substitute meal for flour. The sources are manufacturer, industry, government import taxonomy, and Canadian retail evidence rather than a binding product standard. No numeric conversion, measurement, yield, density, nutritional value, or substitution is proposed.

## Next integration action

Keep the active flour reference unchanged and record this review as the B1 boundary disposition when the integration owner next updates the WP02 decision ledger/checkpoint. Do not add a meal reference or aliases now. Reopen the decision only if a bundled recipe requires meal or a named supplier/standard gives a stable, reviewable product boundary and Québec French label for the intended meal grade.
