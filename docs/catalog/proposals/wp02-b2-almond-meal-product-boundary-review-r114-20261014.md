# WP02 B2 — Almond meal product-boundary review (R114)

**Review date:** 2026-10-14

**Scope:** Reassess the open WP02 B2 almond-flour versus almond-meal distinction using current catalog ownership, picker behavior, the full bundled recipe corpus, and Canadian/Québec product and terminology evidence. This is a proposal only; no seed, ledger, plan, roadmap, runtime, or test files are changed.

## Recommendation

**Decision: HOLD `almond meal` as unresolved and unassigned.** Do not add a separate generic almond-meal reference and do not add `almond meal` as a blanket alias for `ingredient-ref-almond-flour`.

Current Canadian and Québec listings do not give the label one stable product boundary. A Québec Food Directory product named “Almond Meal / Ground Blanched Almonds” is made from blanched, ground almonds. A Canadian seller describes its finely milled whole-almond flour as also known as “almond meal.” Mayrand lists an “Extra-Fine Almond Meal” product, while a Québec-facing French listing uses `poudre d'amande naturelle` for a product described as granular. These examples show that `meal` can be a product-specific synonym, a retailer label on fine-ground almonds, or a cue for a more textured product. The term alone does not reliably specify grind or skin state.

Keep the existing ordinary `almond flour / farine d'amande` identity and its current French aliases as they are. The separate `defatted almond flour / farine d’amande déshuilée` identity accepted in R87 remains separate. If a future recipe or package names almond meal, use its recipe context or named product to resolve grind, skin, and product identity before assigning it. A product-specific synonym does not justify a global picker alias.

| Decision area | Proposal |
|---|---|
| Generic almond meal | Hold unassigned. No separate active identity and no generic alias. |
| Ordinary almond flour | Keep `ingredient-ref-almond-flour`, display `almond flour / farine d'amande`, with its existing `poudre d'amande` and `poudre d'amandes` French aliases. |
| `ground almonds` | Keep unassigned as a generic phrase. It describes a preparation and does not identify a grind or product state. |
| Forms and numeric values | Add no almond-meal form, density, unit mapping, portion, conversion, or yield. Do not derive any from product-specific serving evidence. |
| Substitutions | Add no almond-meal-to-almond-flour rule. Conditional advice that two labels can work alike when the grind matches is not a general recipe rule. |

This conclusion is consistent with the existing [WP02 B2 plan item](../../RecipeBook-global-ingredient-catalog-plan.txt), the earlier [almond flour/meal boundary review](wp02-almond-flour-meal-boundary-review-20261010.md), and the [almond flour measurement follow-up](wp02-b2-almond-flour-measurement-followup-20261012.md). This review adds current product and picker evidence; it does not change those shared files.

## Current catalog ownership and picker projection

The live [ingredient-reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) has 1,456 active references. `ingredient-ref-almond-flour` is `almond flour / farine d'amande`, with English aliases empty, French aliases `poudre d'amande` and `poudre d'amandes`, `defaultDensity: null`, and empty `unitMappings`. It has no attached flour forms in the [form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json). The separate active defatted-almond-flour reference is present and remains outside this ordinary flour/meal boundary. The whole-almond reference has the forms blanched, finely chopped, and sliced; none is an almond-flour or almond-meal form.

The [research ledger](../research-ledger.v1.json) has a verified ordinary almond-flour identity record with 15 sources, three product-specific measurement observations, and substitution research marked `researched_no_supported_substitute`. There is no almond-meal candidate or ingredient identity record. The [legacy-import identity inventory](../legacy-import-identities.v1.json) has 63 candidates and no almond-meal or almond-flour owner. The global [substitution-rules file](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json) and [contextual-substitution-rules file](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json) have no almond-meal or almond-flour rule; the [package-yield file](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json) has no almond entry.

The following is a static projection of the current reference/form terms through the normalization and phrase-first matching logic in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is not a runtime or emulator test.

| Query | Current results | Ownership implication |
|---|---|---|
| `almond meal` | No result | No active reference, alias, or form owns the phrase. |
| `almond meal flour` | No result | No combined phrase is stored. |
| `ground almonds` | No result | The older broad alias is absent; do not restore it. |
| `almond flour` | Ordinary almond flour and defatted almond flour | The qualified defatted name contains the phrase, so the broad query is not a unique identity selection. |
| `farine d'amande` | Ordinary almond flour and defatted almond flour | The qualified defatted display contains the broad French phrase. |
| `poudre d'amande` | Ordinary almond flour and defatted almond flour | The current ordinary alias and the qualified defatted alias both contain this phrase. |
| `poudre d'amandes` | Ordinary almond flour | Current plural French alias remains on the ordinary row. |
| `amandes moulues` | No result | The phrase occurs only as recipe preparation wording in the current corpus; it is not a catalog alias. |

Adding `almond meal` to the ordinary row would make a phrase that sometimes denotes a coarser product resolve as ordinary almond flour without any form hint or product qualifier. The current picker does not encode brand-specific synonyms or infer a grind from the term.

## Recipe demand

The manifest currently lists **114 recipe files**. A scan of every recipe JSON string and ingredient row found 1,123 ingredient rows, exactly two direct links to `ingredient-ref-almond-flour`, and no direct link or text asking for `almond meal`. The scanned corpus fingerprint (sorted manifest file name, NUL, exact file bytes, NUL) is `6da951379f244128afc89f9f0e347df7713928ba78cb6256937a637583410c5d`.

| Recipe | Current row and quantity | Interpretation |
|---|---|---|
| [Linzer Cookies](../../../app/src/main/assets/seed/bundled-library/recipes/010-biscuit-linzer-linzer-cookies-a1e9ba5d-be5c-447d-a368-3ae4954a0a07.v1.json) | `150 g almond flour` linked to `ingredient-ref-almond-flour`; French instructions say `farine d'amande`. | Direct ordinary almond-flour demand. |
| [Almond Frangipane Mini Tarts](../../../app/src/main/assets/seed/bundled-library/recipes/110-tartelettes-a-la-frangipane-aux-amandes-almond-frangipane-mini-tarts-b55e38ff-597e-441b-9a89-a4e06c07248a.v1.json) | `113 g almond flour` linked to `ingredient-ref-almond-flour`; French frangipane instructions say `farine d'amande`. | Direct ordinary almond-flour demand. |

The only relevant French `amandes moulues` wording occurs in the [almond paste and marzipan recipe](../../../app/src/main/assets/seed/bundled-library/recipes/079-pate-d-amande-et-massepain-almond-paste-and-marzipan-1dca3c8b-ed68-4397-b804-ae62e769ee5e.v1.json). Its ingredient row is blanched whole almonds linked to `ingredient-ref-almonds`; the instruction says to grind them with sugar as a preparation step. It is not evidence for a standalone flour or meal identity. No recipe contains `almond meal`, `almond meal flour`, `ground almonds`, `poudre d'amande`, or `poudre d'amandes`.

## Product and terminology boundary

The Canadian Food Inspection Agency's [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) says a food's common name is its prescribed standardized name when one exists, otherwise its generally known name or a specific descriptive name. The current [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) includes a mixed-nuts standard and wheat-flour standards, but a search of that document for `almond meal` returned no match. This is bounded regulatory context, not a claim that the term has no use in Canada. The OQLF [GDT entry for `amande douce`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297061/amande-douce) confirms the base food term but does not define an almond-meal compound; that entry does not establish that no local compound term exists.

The direct product evidence remains mixed:

- The Québec Food Directory's AgroFusion listing is named **Almond Meal / Ground Blanched Almonds**. Its description says California almonds, blanched and ground; the ingredients are almonds. The record was last updated in 2024, so it supports a Québec product label and boundary example, not a verified current retail stock claim or universal definition.
- Ameen Foods' Canadian listing is **Almond Flour (Ground Almonds)**, describes a finely milled whole-almond powder-fine flour, and names `almond meal` among that specific product's “also known as” terms. This is direct product-specific synonym evidence. It does not establish that all products called almond meal are fine or interchangeable.
- Mayrand lists a Québec-retail product as **Extra-Fine Almond Meal 1 kg**. Its French URL identifies it as `amande moulue en farine extra-fine`. This supports overlapping retailer terminology and shows that the word `meal` is not consistently restricted to a coarse product; the listing does not provide a processing specification.
- Nutterie's French product page is titled **Poudre d'amande naturelle**, describes a granular texture, and lists almonds as its ingredient; its product URL uses `natural-almond-meal`. This supports the French product wording and a more textured product example, but it does not establish a general translation rule.
- King Arthur Baking says some products are labeled almond meal instead of almond flour as a brand distinction and can be used interchangeably if their grind is the same; it also notes that a coarser grind changes texture. The Almond Board of California describes flour as typically finer than meal, while stating both forms can be natural or blanched. These sources explain why grind may matter, but their general guidance does not override the varying Canadian and Québec product labels.

The combined evidence supports neither a general separate identity nor a safe global alias. It supports a product-level distinction when a recipe or package states a specific grind or product. Keep `almond meal` held until such context or a stable Canadian/Québec term-to-product boundary is available.

## Numeric, form, and substitution limits

There are a few source-specific portion statements, but none is a generic catalog conversion:

- King Arthur's current [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) lists almond flour at **1 cup = 96 g** and almond meal at **1 cup = 84 g**. The chart does not state its cup capacity or a row-specific fill method. These are two chart entries, not a universal meal/flour distinction and not a supported density or unit mapping.
- The Québec Food Directory product record gives that named blanched-ground product a serving of **28 g per 1/4 cup**. This is a product-specific serving statement. Do not convert it to a generic measure, especially across products with different grind or packing.
- The active almond-flour ledger already records King Arthur's **1 cup = 96 g**, the same package PDF's **1/8 cup = 16 g**, and Bob's Red Mill Canada's **2 tbsp = 14 g**. The King Arthur package values conflict when scaled, and the source methods are unstated. The ledger correctly keeps `defaultDensity` null and `unitMappings` empty. See the [measurement follow-up](wp02-b2-almond-flour-measurement-followup-20261012.md) and its [ledger observations](../research-ledger.v1.json).

The almond-flour reference has no attached forms; the whole-almond forms do not transfer to ground flour or meal. Add no almond-meal form or product yield. King Arthur's interchangeability statement is conditional on matching grind, and the Almond Board says a coarser meal changes texture; neither defines a recipe-specific quantity, direction, or safe substitution context. The existing flour ledger separately has no reusable substitution rule. Add no meal-to-flour or flour-to-meal substitution.

## Source register

All external pages below were accessed on **2026-10-14**. Page update/crawl dates are given where visible and are not the access dates.

| ID | Source and relevant evidence | Limit |
|---|---|---|
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S01` | MAPAQ / Québec Food Directory, [Almond Meal / Ground Blanched Almonds](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8208081). Lists the AgroFusion 3 kg product, says almonds are blanched and ground, names almonds as the ingredient, and reports a serving of 28 g per 1/4 cup. The page says last updated 2024-03-18. | One Québec product record; old last-updated date and no evidence of current shelf availability. The serving does not establish a general measure or a standardized meal identity. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S02` | Ameen Foods Canada, [Almond Flour (Ground Almonds)](https://ameenfoods.ca/products/almond-flour). Describes a fine whole-almond flour and includes `almond meal`, `ground almonds`, and `amandes moulues` in this product's “also known as” list; lists 100% almonds and ships to Canada. | Direct synonym evidence for one seller's finely ground SKU only; not an official term standard or evidence that all almond meal is fine. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S03` | Mayrand, [Extra-Fine Almond Meal 1 kg](https://mayrand.ca/en/our-products/fruits-and-vegetables/nuts-and-dried-fruits/nuts/amande-moulue-en-farine-extra-fine-mayrand-chef-33498). Lists a Québec retail product under `Extra-Fine Almond Meal`; its French URL calls it ground almond in extra-fine flour. | Retail name and product path only; page gives no grind specification, ingredient declaration, or measurement. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S04` | Nutterie, [Poudre d'amande naturelle](https://nutterie.com/fr/products/natural-almond-meal). French product title, granular-texture description, almond ingredient, and 1 kg package. | One retailer product description; not a general French translation or measurement standard. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S05` | King Arthur Baking, [Almond flour 101](https://www.kingarthurbaking.com/blog/2021/01/11/almond-flour-guide-gluten-free-baking). Says some brands use meal and flour labels interchangeably if the grind matches and notes texture differences with coarser grind. | Test-kitchen guidance; not a Canadian/Québec standard, specific SKU equivalency, or recipe-level substitution ratio. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S06` | Almond Board of California, [Different Ways to Incorporate Almonds in Your Diet](https://www.almonds.org/why-almonds/almonds-in-many-forms). Describes typical finer almond flour/coarser meal and states that both forms are available natural or blanched. | Trade-association general product guidance; typical practice is not a universal label definition or a Canadian identity standard. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S07` | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart). Lists flour at 96 g/cup and meal at 84 g/cup. | Chart-specific weights with unstated cup and filling methods; do not store as density, unit mapping, or transferable measure. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S08` | CFIA, [Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name). Explains prescribed common names and the generally known or descriptive-name fallback. | General labeling guidance only; it does not define almond flour or almond meal. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S09` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0). The current document has mixed-nut and wheat-flour standards; a search for `almond meal` returned no match. | A bounded check of this standards document; absence there is not proof that a term has no market use or that no other rule applies. |
| `WP02-B2-ALMOND-MEAL-BOUNDARY-R114-20261014-S10` | OQLF, [GDT: amande douce](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297061/amande-douce). Confirms the base Québec French food term `amande`. | The entry does not define `farine d'amande`, `poudre d'amande`, or an almond-meal compound; it is not evidence that no local compound exists. |

## Review disposition

Keep the generic almond-meal term unresolved and unassigned. Make no catalog, ledger, plan, or roadmap delta from this proposal. Revisit only if a recipe or named Canadian/Québec product establishes the intended grind/skin state and supports a Québec French product name. Until then, keep the current active aliases, source-specific measurement observations, null density, empty mappings, and absence of forms or almond meal substitution rules unchanged.
