# WP03 Section F Sushi Rice Québec Terminology Review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Root review integrated on 2026-10-11. The candidate remains held as `needs_clarification`; three independent-review sources and the updated decision are recorded in the research ledger. No active catalog row, form, or recipe link was added. See [`wp02-wp03-wp04-quebec-flour-sushi-rice-serrano-portion-integration-20261011`](../batches/wp02-wp03-wp04-quebec-flour-sushi-rice-serrano-portion-integration-20261011/README.md).
- **Scope:** independently recheck the held `ingredient-ref-sushi-rice` candidate against current OQLF terminology, Canadian and Québec retail wording, product-class boundaries, exact bundled-recipe demand, and active picker collisions.
- **Disposition:** retain the ledger-only candidate as `needs_clarification`. The French retail wording `riz à sushi` is current and recognizable, but the phrase does not identify one stable grain class or reliably distinguish dry retail grain from cooked, seasoned sushi rice. No recipe requires a new identity.

## Current package and candidate audit

At review time, the split bundled package contains **950 active ingredient references** and **53 forms**. The manifest lists **114 recipes** with **1,123 ingredient rows**. The research ledger already has a single `ingredient-ref-sushi-rice` record with `recordType: candidate`, `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. No active sushi-rice identity or form is present.

The active rice references relevant to this review remain separate:

| Active reference | Display | Meaning relevant to this candidate |
| --- | --- | --- |
| `ingredient-ref-rice` | `rice / riz` | Generic grain identity; its existing dry and cooked forms do not mean cooked-and-seasoned sushi rice. |
| `ingredient-ref-short-grain-rice` | `short-grain rice / riz à grain court` | Grain-length class; French alias `riz à grains courts`. |
| `ingredient-ref-medium-grain-rice` | `medium-grain rice / riz à grain moyen` | Separate grain-length class. |
| `ingredient-ref-calrose-rice` | `calrose rice / riz Calrose` | Named market type, which is sold for sushi in some Canadian products. |
| `ingredient-ref-glutinous-rice` | `glutinous rice / riz gluant` | Separate starch/texture type; it is not an alias for sushi rice. |

The current active catalog has no exact display, alias, or form term for `sushi rice`, `riz à sushi`, `riz sushi`, or `riz à sushis`. A normalized-query audit using the application’s whole-phrase-first search behavior returned no active reference for those queries. The same audit keeps `short-grain rice` and `riz à grain court` on the short-grain row, `Calrose` on the Calrose row, and `glutinous rice` / `riz gluant` on the glutinous-rice row (the latter also finds glutinous-rice flour because that longer term contains the phrase). Broad `rice` and `riz` queries match many rice-family references and do not identify a sushi-rice class.

## Dry retail grain and prepared sushi rice are different scopes

Québec and Canadian product pages provide a credible current French retail term: **`riz à sushi`**. They also show why activating that phrase as one ingredient identity remains unsafe without narrowing the catalog scope further.

| Current source | Product wording and scope | Boundary supported |
| --- | --- | --- |
| Dainty Québec product page, [Riz à sushi Calrose](https://dainty.ca/fr/produits/riz-sushi-calrose/) | Markets a dry sushi-use product as medium-grain Calrose. | `riz à sushi` can identify a product whose underlying grain is medium-grain Calrose. |
| MITO, [Riz à sushi Calrose – 450 g](https://mito.ca/produit/riz-calrose-450-g/) | Québec product page lists the ingredient as Calrose rice and describes Calrose as medium-grain. | A second Québec retail example applies sushi wording to Calrose; it does not create a new grain class. |
| Walmart Canada, [Hakuro Premium Sushi Rice](https://www.walmart.ca/en/ip/Hakuro-Premium-Sushi-Rice/3U478VX51H55?classType=REGULAR) and [French listing](https://www.walmart.ca/fr/ip/Hakuro-Riz-sushi-de-qualit-sup-rieure/3U478VX51H55?classType=REGULAR) | The paired Canadian English/French listings call it `Premium Sushi Rice / Riz à sushi de qualité supérieure` and identify it as Koshihikari short-grain Japonica rice. | The same retail term also covers a short-grain Koshihikari product. Walmart notes that product information comes from vendors and is not independently verified; treat this as retail evidence, not an authoritative composition standard. |
| RiceSelect manufacturer, [Sushi Rice](https://www.riceselect.com/products/riceselect-sushi-rice) | Identifies its dry retail product as short-grain rice from Koshihikari and Calihikari; directions first cook the grain and then add a vinegar, sugar, and salt dressing. | Supports the dry-grain and seasoned-preparation distinction for one product only. |
| Toronto Public Health, [Specific Food Processes](https://www.toronto.ca/community-people/health-wellness-care/health-programs-advice/food-safety/food-safety-for-businesses/food-safety-resources/specialty-foods/) | Defines sushi rice in a food-safety context as a ready-to-eat preparation commonly made by mixing cooked rice with sugar, salt, and rice vinegar. | The phrase also names the cooked, seasoned preparation, not only the dry grain sold in a bag. |

The current Canadian product examples differ on grain length: Dainty and MITO sell Calrose described as medium-grain, while Hakuro and RiceSelect identify their sushi-marketed products as short-grain. The evidence therefore does not support mapping all dry `sushi rice` to `short-grain rice`, to `medium-grain rice`, or to `Calrose`. Nor does the fact that a dry product is marketed for sushi establish that it is an independent grain identity rather than a use-qualified market description.

The phrase is also used for the resulting cooked, seasoned rice. Toronto Public Health explicitly describes that prepared food as ready to eat. OQLF’s [sushi entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi) defines sushi as a Japanese dish made with vinegared rice and possible fillings; it does not define a dry grain or give a preferred term for dry rice sold for sushi. This makes the wording ambiguous at the ingredient-editor level even though the French phrase is attested in retail listings.

## Québec terminology and active-identity collisions

OQLF provides stable Québec terminology for the established grain classes and for the prepared dish, but not a separate dry sushi-rice class:

- OQLF’s [sushi entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi) treats `sushi` as the prepared dish. It gives no preferred French name for a dry ingredient class called sushi rice.
- OQLF’s [short-grain rice entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354929/riz-a-grain-court) directly pairs `short-grain rice` with `riz à grain court`; it also lists `riz à grains courts`, `riz à grain rond`, and `riz à grains ronds` as preferred French terms. The definition is based on grain proportions and cooking behavior, not sushi use.
- OQLF’s [glutinous-rice entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux) lists `riz gluant`, `riz glutineux`, and `riz doux` for the distinct glutinous/sweet-rice class. Sticky texture in cooked sushi rice does not establish this ingredient identity. RiceSelect likewise says its Sushi Rice can be sticky without being a glutinous-rice variety in its [sticky-rice explainer](https://www.riceselect.com/blog/how-to-prepare-the-best-sticky-rice).

Current Canadian French product wording confirms `riz à sushi` as a use label. The evidence does **not** establish that it should be stored as a Québec French alias for an existing class: adding it to short-grain rice would exclude the documented medium-grain Calrose products; adding it to Calrose would exclude the documented short-grain product; adding it to glutinous rice or generic cooked rice would conflate distinct ingredient and preparation boundaries.

## Bundled recipe demand

I scanned every recipe listed by the current manifest: **114 recipe files and 1,123 ingredient rows**. Searches of all recipe text and each ingredient row found **zero exact hits** for `sushi rice`, `riz à sushi`, `riz sushi`, `riz à sushis`, `short-grain rice`, `short grain rice`, `riz à grain court`, `riz à grains courts`, `Calrose`, `glutinous rice`, `riz gluant`, `sticky rice`, or `riz collant`.

No recipe line, quantity, recipe link, or preparation form justifies a new sushi-rice reference. The absence of recipe demand means there is no current recipe context that could tell the picker whether the intended item is dry retail grain or prepared seasoned rice.

## Recommended disposition

| Concern | Recommendation |
| --- | --- |
| **Ingredient identity** | Keep `ingredient-ref-sushi-rice` ledger-only with `identityState: needs_clarification`. Do not add an active `sushi rice / riz à sushi` row. The French wording is attested, but dry retail products sold under it do not share one grain-length or named market-type identity, and the same phrase names the cooked, seasoned preparation. |
| **Aliases** | Add no sushi terms to short-grain rice, Calrose, medium-grain rice, glutinous rice, or generic rice. Do not add `riz à sushi` to an active row solely because it is current Québec retail wording. |
| **Forms** | Add no sushi-specific dry, cooked, or seasoned form. Existing generic-rice dry/cooked forms describe state; they do not cover sushi seasoning. |
| **Measurements and conversions** | Add no density, unit mapping, rice-to-water ratio, dry-to-cooked yield, or conversion. Product instructions are product-specific, and no bundled recipe requests a quantity. |
| **Substitutions** | Add no global or contextual substitution. The sources establish intended use, not a general equivalence or substitution ratio. |
| **Recipes** | Make no recipe links or line edits; no exact recipe demand exists. |

Reopen only if a recipe or product workflow requires a clearly named scope. For example, a future proposal could assess a dry retail market category independently if product evidence defines it consistently and recipe use supports the distinction. It should still keep any cooked, seasoned preparation separate and should not infer an alias to a grain-length class or Calrose.

## Source register

Root integrated source IDs `WP03-SUSHI-QC-20261011-S05`, `WP03-SUSHI-QC-20261011-S06`, and `WP03-SUSHI-QC-20261011-S09` into the central ledger. The other source IDs in this table point to OQLF, Dainty, RiceSelect, and Toronto sources already represented by the earlier ledger review. These references document the independent terminology and current product pass.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-SUSHI-QC-20261011-S01` | OQLF, [sushi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi), definition and preferred term; updated 2015 | Defines the prepared dish and its vinegared rice. Does not define a dry sushi-rice ingredient or its display label. |
| `WP03-SUSHI-QC-20261011-S02` | OQLF, [riz à grain court](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354929/riz-a-grain-court), definition and preferred variants; updated 2005 | Supports the grain-length class and direct English/French terminology. Does not make sushi use an alias or prescribe a universal numeric cutoff. |
| `WP03-SUSHI-QC-20261011-S03` | OQLF, [riz glutineux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux), preferred terms and English translation; updated 1997 | Supports the separate terms `riz gluant`, `riz glutineux`, and `riz doux`. The page is older and is used here for terminology, not modern product specifications. |
| `WP03-SUSHI-QC-20261011-S04` | Dainty, [Le meilleur riz à sushi pour les recettes japonaises](https://dainty.ca/fr/produits/riz-sushi-calrose/), type of grain and product description | Current Québec French retail wording `riz à sushi`; product is medium-grain Calrose. Supports this product only, not a universal sushi-rice class. |
| `WP03-SUSHI-QC-20261011-S05` | MITO, [Riz à sushi Calrose – 450 g](https://mito.ca/produit/riz-calrose-450-g/), product title, ingredient, and chef note | Québec retail wording on a dry Calrose product; explicitly calls Calrose medium-grain. Does not show that all sushi rice is Calrose. |
| `WP03-SUSHI-QC-20261011-S06` | Walmart Canada, [Hakuro Premium Sushi Rice](https://www.walmart.ca/en/ip/Hakuro-Premium-Sushi-Rice/3U478VX51H55?classType=REGULAR) and [French product listing](https://www.walmart.ca/fr/ip/Hakuro-Riz-sushi-de-qualit-sup-rieure/3U478VX51H55?classType=REGULAR), product title and details | Paired Canadian retail listings establish current English/French usage and identify this product as Koshihikari short-grain Japonica. Walmart cautions that vendor-supplied product text is not independently verified; supports a product example, not a technical standard. |
| `WP03-SUSHI-QC-20261011-S07` | RiceSelect, [Sushi Rice](https://www.riceselect.com/products/riceselect-sushi-rice), product description and cooking instructions | Identifies a dry sushi-marketed product as short-grain Koshihikari/Calihikari and shows cooking plus later seasoning. Manufacturer evidence applies to its product only. |
| `WP03-SUSHI-QC-20261011-S08` | City of Toronto Public Health, [Specific Food Processes](https://www.toronto.ca/community-people/health-wellness-care/food-safety/food-safety-for-businesses/food-safety-resources/specialty-foods/), sushi-rice section | Defines sushi rice as a cooked, seasoned, ready-to-eat preparation in its food-safety context. Does not classify the dry grain sold at retail. |
| `WP03-SUSHI-QC-20261011-S09` | RiceSelect, [How to Make Sticky Rice: Tips and Techniques](https://www.riceselect.com/blog/how-to-prepare-the-best-sticky-rice), sections “What is Sticky Rice?” and “How to Make Sticky Rice with Sushi Rice” | Explicitly distinguishes its sushi rice from glutinous rice while describing sticky texture and use. Supports the product/texture boundary, not universal terminology. |

## Review disposition

Retain the existing unresolved candidate and its `needs_clarification` state. This refresh confirms that `riz à sushi` is current Québec retail language, but it does not resolve the dry product boundary or the collision with prepared seasoned rice. Do not activate an identity, aliases, forms, recipe links, measurements, conversions, yields, or substitutions from this packet.
