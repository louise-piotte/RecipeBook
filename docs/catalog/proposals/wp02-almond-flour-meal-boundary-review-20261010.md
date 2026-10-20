# WP02 B2 — Almond flour and almond meal boundary review

**Review date:** 2026-10-10  
**Scope:** Almond flour versus almond meal only. This is a source review; no seed, ledger, plan, roadmap, code, or test changes are made here.

## Recommendation

Keep the existing **almond flour / farine d'amande** identity at **ingredient-ref-almond-flour**. Do not add a second ingredient reference named “almond meal” and do not make “almond meal” a blanket alias for almond flour.

The labels are not a reliable boundary by themselves. Sources describe a typical finer-flour/coarser-meal difference, but Canadian product records and manufacturers also use “meal” for blanched ground almonds and “meal/flour” for the same labeled product. The more defensible distinction is product-specific: retain explicit grind, skin/blanching, and defatting information when a recipe or named product supplies it. Do not infer those properties from “flour” or “meal” alone.

| Catalog decision | Proposal |
| --- | --- |
| Existing identity | Keep ID ingredient-ref-almond-flour; retain English display **almond flour** and Québec French display **farine d'amande**. |
| Separate almond-meal identity | Hold. No recipe demand or stable term-to-product definition supports a second general identity today. |
| English aliases | None proposed. Remove the current **ground almonds** alias from automatic matching: it is an underspecified preparation phrase and causes a real broad-query collision with whole almonds. |
| French aliases | Retain existing **poudre d'amande**; **poudre d'amandes** is also directly attested in Canadian French-market product naming and may be added as a spelling/plural variant. |
| Numeric and substitution data | Add none. This review establishes no density, unit mapping, measure, yield, conversion, or flour/meal substitution. |

The Québec Food Directory uses the product name “Poudre d'amande / Amandes blanchies moulues” for a pure product made from blanched, ground almonds. A Montréal culinary supplier independently sells a 100% almond product as “Poudre d'Amande.” These support the proposed French search wording for an almond-ground product; they do not establish that every item sold as almond flour or meal has the same grind or processing. Robin Hood Canada's manufacturer pages directly support the proposed English and Québec French display pair.

## Boundary and scope

“Almond meal” can refer to a coarser product, often but not invariably with skins, or can be a label for ground blanched almonds. The Almond Board of California describes almond flour as typically blanched and finer than almond meal, while King Arthur Baking says meal/flour naming can be a brand distinction and that grind may differ independently of the label. The Québec Food Directory’s named product “Almond Meal / Ground Blanched Almonds” is a direct counterexample to treating “meal” as necessarily skin-on or as a separate standardized product. Bob’s Red Mill likewise markets a natural almond flour and calls it “almond meal flour,” with whole almonds including skins as the ingredient.

Accordingly:

- Keep the single unqualified almond-flour identity for exact “almond flour” recipe wording. Do not infer blanched, natural/skin-on, fine, coarse, or defatted product state when the recipe does not say so.
- Leave “almond meal” unresolved as a catalog search term. If a future recipe calls for it, inspect the recipe’s context or named product before linking it. A distinct identity would need evidence of a stable product boundary and a Québec French name, not just a label difference.
- Treat “coarse” as an explicit grind description if supported by a specific source or recipe. Do not automatically treat all meal as coarse or all flour as fine.
- Do not collapse defatted almond flour into the ordinary ground-almond product. The Almond Board describes defatted almond flour as a product from which some oil has been removed; it is outside this review and has no matching bundled recipe.
- This review does not cover almond pulp/by-product, almond protein powder, almond butter, almond paste or marzipan, almond extract, or almond beverages. The existing whole-almond, butter, paste, and extract references remain distinct.
- CFIA’s flour/grind guidance is in its grain-and-bakery material and does not define an almond-meal class. The general CFIA common-name guidance says an unstandardized food is named by its generally known name or an accurate descriptive name. The reviewed CFIA pages do not supply an almond-flour/meal-specific identity standard, so no regulatory distinction is claimed here.

## Attested labels and rejected aliases

| Term | Decision | Evidence and limit |
| --- | --- | --- |
| almond flour | Keep as English display | Robin Hood Canada uses this name for finely ground blanched whole almonds. Other manufacturers use “almond flour” for natural/skin-on products too, so the name alone does not encode skin or grind. |
| farine d'amande | Keep as fr-CA display | Robin Hood Canada uses this Québec French product name for the named almond-flour product. |
| poudre d'amande | Retain existing French alias | The Québec Food Directory uses it in a product name for blanched, ground almonds; La Guilde Culinaire uses it for a 100% almond product. This supports the term as a market label, not a universal grind specification. |
| poudre d'amandes | Attested optional French alias | Canadian French-market retail product headings use this plural spelling for almond powder/flour products. Keep it tied to the same generic almond-ground identity, without a grind or blanching claim. |
| ground almonds | Reject as an active alias | Too broad: it describes preparation without specifying grind or product state. In the current catalog it also makes the query “almonds” return both whole almonds and almond flour. |
| almond meal | Keep unassigned | Sources use the term for different grind/skin states, including ground blanched almonds. It does not currently identify a stable separate reference. |
| ground blanched almonds | Do not add as an automatic alias | Attested as the name/description of a specific Québec-directory product, but that listing does not give a grind grade. One product label does not make this phrase a reliable general synonym for all recipes asking for almond flour. |
| almond powder, almond meal/flour, natural almond flour, blanched almond flour, coarse almond meal | Do not add as unqualified aliases | These are product, processing, or texture-qualified phrases. Retain such qualifiers when a recipe or package actually supplies them; this review does not establish them as interchangeable terms. |
| amandes moulues, amandes blanchies moulues | Do not add as general aliases | The directory and suppliers use these descriptive phrases for specific products. Without grind context they may also describe a preparation rather than a stable catalog identity. |

No almond meal-specific French display is proposed. Do not translate “almond meal” automatically as farine d'amande or poudre d'amande until a source-qualified product boundary and Québec French terminology review establish the intended ingredient.

## Bundled recipe demand and search collisions

The live bundled package contains 114 recipe files. A full string scan of those recipe JSON files found **two ingredient rows** linked to ingredient-ref-almond-flour, both explicitly requesting almond flour. It found no ingredient row or other recipe string requesting “almond meal” or “ground almonds.”

| Recipe | Ingredient row | French recipe wording/context | Source |
| --- | --- | --- | --- |
| Biscuits Linzer / Linzer Cookies | a1e9ba5d-be5c-447d-a368-3ae4954a0a07-ingredient-2 — “150 g almond flour” | French instructions also say “farine d'amande.” | Preppy Kitchen, [Linzer Cookies](https://preppykitchen.com/linzer-cookies/); bundled file app/src/main/assets/seed/bundled-library/recipes/010-biscuit-linzer-linzer-cookies-a1e9ba5d-be5c-447d-a368-3ae4954a0a07.v1.json |
| Tartelettes à la frangipane aux amandes / Almond Frangipane Mini Tarts | b55e38ff-597e-441b-9a89-a4e06c07248a-ingredient-8 — “113 g almond flour” (Frangipane group) | French instructions use “farine d'amande” in the frangipane. | Tablespoon, [Almond Frangipane Mini Tarts](https://www.tblspoon.com/home/almond-frangipane-mini-tarts); bundled file app/src/main/assets/seed/bundled-library/recipes/110-tartelettes-a-la-frangipane-aux-amandes-almond-frangipane-mini-tarts-b55e38ff-597e-441b-9a89-a4e06c07248a.v1.json |

The current exact-query inventory was checked against the seed’s bilingual names and aliases using the app’s normalized whole-word phrase search followed by its substring fallback:

| Query | Current results | Observation |
| --- | --- | --- |
| almond flour | 1 — almond flour | Exact identity is unique. |
| farine d'amande | 1 — almond flour | Exact French display is unique. |
| poudre d'amande | 1 — almond flour | Current alias resolves only to the existing identity. |
| ground almonds | 1 — almond flour | It resolves because it is currently stored as an alias, though that mapping is too broad. |
| almond meal | 0 | No existing identity or alias. |
| almond | 4 — almond butter, almond extract, almond flour, almond paste | A base-word search is ambiguous across distinct ingredient classes. |
| almonds | 2 — almond flour, almonds | Current ground-almonds alias collides with the whole-almond identity on the plural query. |

This is a read-only catalog/search inspection, not a picker or emulator test. The current almond-flour ledger record remains identityState unreviewed with no evidence sources. If this recommendation is accepted, record the identity evidence and mark the identity reviewed; leave measurementState blocked_pending_evidence and substitutionResearchState not_yet_researched. The active seed currently has null default density and no unit mappings for this row.

## Source register and claim support

| ID | Source | Claim supported and scope |
| --- | --- | --- |
| WP02-ALMOND-FLOUR-MEAL-20261010-S01 | CFIA, [Standards of identity for food](https://inspection.canada.ca/en/food-labels/labelling/industry/standards-identity) | Defines what Canadian food compositional standards do and distinguishes standardized from unstandardized foods. General regulatory context only; it does not define almond flour or almond meal. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S02 | CFIA, [Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) | Says unstandardized products use a generally known or accurate descriptive name and that a condition should be stated when needed to distinguish similar foods. Does not establish an almond-specific common name. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S03 | CFIA, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products) | Discusses coarse-grind naming when a flour product meets the grain/bakery compositional standard except for grind size. This is not evidence that almond meal falls under that standard. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S04 | MAPAQ, [Répertoire des aliments québécois: Poudre d'amande / Amandes blanchies moulues](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8208081) | Product entry names a Montréal supplier’s product “Poudre d'amande / Amandes blanchies moulues”; English rendering is “Almond Meal / Ground Blanched Almonds.” It describes blanched ground California almonds and lists almonds as the ingredient. Supports Québec product wording and demonstrates that “meal” is not necessarily skin-on. This is one named product record, not a standard definition. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S05 | Robin Hood Canada, [Almond Flour](https://www.robinhood.ca/en/products/specialty-flours/almond) and [Farine d'amande](https://www.robinhood.ca/fr/produits/farine-de-specialite/amande) | Manufacturer uses the English/French display pair and describes its product as finely ground blanched whole almonds. Product-specific naming and composition only. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S06 | King Arthur Baking, [Almond flour 101](https://www.kingarthurbaking.com/blog/2021/01/11/almond-flour-guide-gluten-free-baking) | Describes blanched and natural almond flour, variation in texture by brand, meal as a label sometimes used in place of flour when grind matches, and a coarser meal as a texture option. Technical baking guidance, not a food standard. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S07 | Almond Board of California, [Almond Forms for Every Function](https://www.almonds.org/sites/default/files/2021-01/Almond%20Forms%20For%20Every%20Function%20v2_0.pdf) | Describes flour as typically blanched and finer than meal, with meal generally coarser; separately identifies defatted almond flour. The qualifiers are typical product distinctions, not a universal naming rule. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S08 | Bob's Red Mill, [Natural Almond Flour](https://www.bobsredmill.com/product/natural-almond-meal-flour) | The manufacturer labels a skin-on, whole-almond product “Natural Almond Flour” and describes it as “almond meal flour.” Demonstrates overlapping product-label usage; it does not define all almond meal. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S09 | La Guilde Culinaire, [Poudre d'Amande](https://www.laguildeculinaire.com/products/poudre-damande-500gr) | Québec culinary retailer uses the French product name for a 100% almond product made from shelled, blanched almonds then ground. Supports French market wording for this product; no universal grind or equivalence claim. |
| WP02-ALMOND-FLOUR-MEAL-20261010-S10 | Metro Canada, [Bob's Red Mill Poudre d'amandes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/poudre-d-amandes/p/039978313812) | Canadian French-market product heading attests the plural phrase poudre d'amandes for an almond flour product. Retailer catalog wording only; check package details before inferring exact processing. |

The directory and product pages may change, and the product evidence establishes only the named products. No recipe amounts, densities, conversions, yields, or substitutions have been derived from these sources.

## Next action

Have the integration owner accept the one-identity boundary, add the evidence to the almond-flour ledger record, retain farine d'amande and poudre d'amande, and remove ground almonds from automatic aliases because it demonstrably collides with whole almonds. Add poudre d'amandes only if the coordinator wants to cover this source-attested plural query. Keep almond meal unassigned until a bundled recipe or exact product use establishes the needed grind/process scope and a Québec French term is reviewed. The rest of WP02 B2 remains open.
