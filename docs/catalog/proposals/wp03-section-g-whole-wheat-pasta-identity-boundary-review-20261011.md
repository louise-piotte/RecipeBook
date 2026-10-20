# WP03 Section G whole-wheat pasta identity/form boundary review

- **Reviewed:** 2026-10-11
- **Recommendation:** Integrate an identity-only candidate, `ingredient-ref-whole-wheat-pasta`, displayed as **whole-wheat pasta / pâtes de blé entier**, in `GRAIN_AND_CEREAL`. The whole-wheat qualifier describes the pasta product’s composition; it is not a preparation form under the generic pasta row.
- **Proposal status:** This review does not change the seed, ledger, checklist, or any shared catalog file. The row is a recommendation for a later integration.
- **Evidence scope:** Current Québec and Canadian wording, manufacturer descriptions and ingredient lists, the live catalog and ledger, exact bundled-recipe demand, and the available measurement/substitution evidence.

## Current snapshot and exact audit

Snapshot read from the live package and catalog files on 2026-10-11:

| Artifact | Current count or result |
| --- | ---: |
| Active ingredient references | 973 |
| Active ingredient forms | 61 |
| Research-ledger records / source entries | 1,248 / 3,936 |
| Legacy import candidates | 75 |
| Manifest recipes / ingredient rows | 114 / 1,123 |
| Direct / contextual substitution rules | 0 / 0 |
| Package-yield records | 1; the only record is for canned black beans |
| Whole-wheat pasta identity or exact whole-wheat pasta alias | None |
| Whole-wheat pasta forms | None |

The active generic row is `ingredient-ref-pasta` — **pasta / pâtes alimentaires**, with French alias **pâte alimentaire** and category `GRAIN_AND_CEREAL`. Current adjacent identities are `ingredient-ref-egg-pasta` — **egg pasta / pâtes aux œufs** (French alias **pâtes alimentaires aux œufs**), `ingredient-ref-egg-noodles` — **egg noodles / nouilles aux œufs**, and named pasta shapes including macaroni, spaghetti, penne, fusilli, farfalle, and orzo. The whole-wheat flour row, `ingredient-ref-whole-wheat-flour` — **whole-wheat flour / farine de blé entier**, is a separate `FLOUR_AND_STARCH` product. No active reference or alias exactly matches **whole wheat pasta**, **whole-grain pasta**, **pâtes de blé entier**, **pâtes alimentaires de blé entier**, **pâtes de blé complet**, **pâtes de grains entiers**, or **whole wheat noodles**. Those phrases also have no exact whole-wheat-pasta match among the 75 legacy candidates.

No form is attached to the generic pasta, egg pasta, egg noodles, or the named shape references. Those references have null `defaultDensity` values and empty `unitMappings`. No current package-yield or direct/contextual substitution record refers to pasta. The ledger contains the verified generic `ingredient-ref-pasta` record, sourced to **WP03-S149**, whose decision explicitly leaves composition distinctions open and adds no form or numeric data. The live ledger now also contains the identity-only `ingredient-ref-egg-pasta` record and its proposal-local-to-that-integration sources **WP03-EGGPASTA-QC-20261011-S01–S09**. It has no whole-wheat-pasta identity record or source record. The existing whole-wheat-flour record remains a flour record; it does not support pasta aliases or measurements.

All 1,123 ingredient rows in the 114 manifest recipe files were scanned for pasta/noodle names and IDs, whole-wheat/whole-grain phrases, and the proposed English and French phrases: **zero matching ingredient rows**. There is no generic-pasta, egg-pasta, egg-noodle, or named-pasta-shape ingredient row to relink. Recipe 015, **Beef Stroganov / Bœuf Stroganov**, says in its final instruction to serve with “rice or noodles” / “du riz ou des nouilles”; that is an unqualified serving suggestion, not an ingredient line or evidence for whole-wheat pasta. A separate source note mentions whole-wheat panko, but the actual ingredient row is **panko bread crumbs** (`ingredient-ref-panko`), not pasta.

## Boundary and proposed catalog row

Whole-wheat pasta is a marketed, composition-qualified pasta product class. Keeping it as an ingredient identity lets an explicit whole-wheat ingredient phrase resolve distinctly from broad pasta, without pretending that whole-wheat pasta is one preparation state. The food-quality specification and maker sources describe whole-wheat products with differing ingredient blends; the identity should therefore record the explicit product class, not a fixed whole-grain percentage or formula.

| Field | Recommendation |
| --- | --- |
| ID | `ingredient-ref-whole-wheat-pasta` |
| English display | **whole-wheat pasta** |
| Québec French display | **pâtes de blé entier** |
| English aliases | None; hyphenation is folded by the current search normalizer, so “whole wheat pasta” resolves through the display name. |
| French aliases | **pâtes alimentaires de blé entier**. Keep the display as *pâtes de blé entier*, used directly in Canadian French food guidance and manufacturer text. |
| Category | `GRAIN_AND_CEREAL`, consistent with generic and egg pasta. Do not reuse the whole-wheat flour category. |
| Scope | A finished pasta product explicitly identified as whole wheat / blé entier. Do not infer it from a recipe’s use of whole-wheat flour, a wheat-only ingredient list, or a whole-grain claim that does not identify wheat. |
| Forms, density, unit mappings, yields, conversions, substitutions | None activated by this review. |
| Recipe links | None; the full manifest ingredient-line audit found no matching demand. |

Do not alias generic `pasta / pâtes alimentaires`, `egg pasta / pâtes aux œufs`, `egg noodles / nouilles aux œufs`, or `whole-wheat flour / farine de blé entier`. Whole-wheat and egg are separate composition distinctions; a whole-wheat label does not establish egg content, and the reviewed sources do not establish a combined whole-wheat egg-pasta product. Catelli’s example lists whole-grain durum semolina as its ingredient while separately warning that the product is made on equipment that handles egg-containing products. That warning is not an egg ingredient declaration.

OQLF lists *blé complet* alongside *blé entier* for the wheat term, but I do not add *pâtes de blé complet* as an alias here because I found direct Canadian pasta wording with *blé entier* and no direct Québec pasta example with *blé complet*.

Do not alias **whole-grain pasta / pâtes de grains entiers** or **multigrain pasta / pâtes multigrains** to the proposed wheat-specific row. “Whole grain” can describe non-wheat grains or a blend, and “multigrain” alone does not establish whole-grain content. Catelli’s multigrain spaghetti, for example, lists five whole-grain flours/semolinas. The proposed identity should not absorb gluten-free or other non-wheat pasta identities either.

Macaroni, spaghetti, penne, fusilli, farfalle, and other shape names remain separate from the composition identity. Do not add shape names as aliases or create a whole-wheat identity per shape in this review. A phrase such as “whole-wheat macaroni” specifies both a composition and a shape; the current reference/one-form representation does not hold two independent qualifiers on one line. The same boundary applies to **fresh** and **dry** pasta: both are preparation/product-state distinctions, not synonyms for whole-wheat. Leave fresh/dry forms and any composition-by-shape intersections to their own review rather than creating a `whole_wheat` form or a `whole_wheat_dried` form here.

## Measurement and substitution evidence

These sources show why evidence must remain attached to the named food, shape, state, product, or recipe:

- **Manufacturer package basis:** Catelli’s current Whole Grains Macaroni product pages list a 375 g package and nutritional information for 85 g, described as “about 1/4 of the pack.” Those are product-label facts, not a general pasta conversion. The page does not give grams per cup or a dry-to-cooked yield. The listed package weight and approximate serving wording should not be used to manufacture a package-yield record.
- **Canadian Nutrient File serving portions:** Health Canada food code 4457 is specifically **Pasta, macaroni (elbow), whole wheat, cooked / Pâtes, macaroni (coudes), blé entier, cuit**. It lists 100 mL = 59.2 g, 125 mL = 74.0 g, and 250 mL = 147.9 g. This is a useful shape- and cooked-state-specific reference, not a manufacturer package label, a dry-pasta measure, or a transferable density for every whole-wheat pasta shape. Do not attach it to a generic whole-wheat pasta identity without a model that preserves the macaroni and cooked qualifiers.
- **Recipe-specific quantity:** A Health Canada macaroni-and-cheese recipe lists **375 mL (1 1/2 cups) whole-wheat macaroni or fusilli** and then boils it. The “or” supports these alternatives in that recipe only; it supplies no mass, conversion, cooking-yield factor, or generic shape substitution rule. Health Canada also publishes a French recipe using one 340 g package of large whole-wheat pasta shells; that is package-specific recipe use, not a universal package yield.
- **Substitution status:** There is no evidence here for a generic ratio between regular and whole-wheat pasta, for replacing whole-wheat pasta with whole-wheat flour, or for substituting all whole-wheat shapes for one another. The single macaroni-or-fusilli recipe option is not enough to create a global rule. Keep current direct and contextual substitution rules at zero.

## Sources and claim limits

Access dates for web sources below are 2026-10-11. New IDs in this table are local to this proposal; no ledger records were edited. Existing catalog source IDs are retained where cited.

| ID | Source | Claim supported | Limits |
| --- | --- | --- | --- |
| **WP03-S149** | OQLF, [pâte alimentaire (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870035/pate-alimentaire) (existing ledger source; accessed 2026-10-11) | The generic pasta definition covers semolina or flour with water or eggs, varied shapes, and fresh and dry types. This supports keeping composition, shape, and state distinctions out of the generic alias set. | Does not define whole-wheat pasta or provide measurements. The OQLF notes that *pâte alimentaire* in ordinary use often refers specifically to dry pasta. |
| **WP03-WWPASTA-QC-20261011-S01** | OQLF, [blé entier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361583/ble-entier) (accessed 2026-10-11) | Defines whole wheat as wheat without removal of its constituents and gives *blé entier* and *blé complet* as preferred French terms. It supports the wheat-specific composition qualifier. | Does not name pasta. The entry’s 95% note concerns the Canadian meaning of *farine de blé entier* and must not be transferred to pasta. The entry was last updated in 2002. |
| **WP03-WWPASTA-QC-20261011-S02** | Catelli, [Whole Grains Macaroni (English manufacturer page)](https://www.catelli.ca/en/pastas/catelli-healthy-harvest-whole-wheat-macaroni/) and [Grains Entiers Macaroni (French manufacturer page)](https://www.catelli.ca/fr/pastas/catelli-moisson-sante-macaroni-ble-entier) (accessed 2026-10-11) | Current bilingual pages market the product as whole-grain/whole-wheat macaroni; the French page says *pâtes de grains entiers*, promotes 100% Canadian whole wheat, and lists *semoule de blé dur à grains entiers*. The English ingredient is whole-grain durum wheat semolina. The English page provides a 375 g pack size and both pages give an 85 g label basis. | One brand and one macaroni SKU. The page’s equipment warning for egg-containing products is not an egg ingredient. Its “about 1/4 pack” wording is approximate and does not establish a generic portion or package yield. |
| **WP03-WWPASTA-QC-20261011-S03** | Metro, [Catelli macaroni de blé entier, product 064200115933](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/pates/pates-macaroni-de-ble-entier/p/064200115933) (accessed 2026-10-11) | The Québec retailer listing uses the product title **Pâtes macaroni de blé entier**, shows a 375 g Catelli package, and lists whole-grain durum wheat semolina as the ingredient. This directly corroborates the French qualifier in retail naming. | The live retailer page returned HTTP 403 to direct open; the indexed product listing was available. Product availability, price, ingredients, and size are listing/SKU-specific and may change. |
| **WP03-WWPASTA-QC-20261011-S04** | Catelli, [Multigrain Spaghetti (manufacturer page)](https://www.catelli.ca/en/pastas/catelli-healthy-harvest-multigrain-spaghetti/) (accessed 2026-10-11) | The manufacturer lists five grain ingredients, including whole-grain durum wheat, rye, buckwheat, barley, and brown rice. It supports keeping broad whole-grain and multigrain wording out of a wheat-specific alias set and keeping shape separate. | One multigrain SKU. Its ingredient mix does not define all whole-grain or multigrain pasta products. |
| **WP03-WWPASTA-QC-20261011-S05** | Department of National Defence, [Food Quality Specifications — Pasta and Noodles, SQA-21](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-21-2018-fra.pdf) (dated 2018-04-01; accessed 2026-10-11) | The specification discusses whole-wheat pasta, dried and fresh types, additional egg ingredients, and named shape types; it also states that its whole-wheat pasta products can use a blend of whole and ordinary grains. | This is a federal purchasing specification, not a compositional regulation or universal current manufacturer formula. It does not support a household conversion or a fixed recipe for all whole-wheat pasta. |
| **WP03-WWPASTA-QC-20261011-S06** | Health Canada, [Canadian Nutrient File serving portions, food code 4457](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4457) and [French view](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4457&lang=fre) (accessed 2026-10-11; page modified 2019-03-01) | The listed food is cooked whole-wheat elbow macaroni; it reports 100, 125, and 250 mL portions as 59.2, 74.0, and 147.9 g. | A database entry for one cooked shape, not a product-specific package label or a generic dry/shape-independent density. |
| **WP03-WWPASTA-QC-20261011-S07** | Health Canada, [Mac & Cheese with a Veggie Twist](https://www.canada.ca/content/dam/canada/health-canada/migration/healthy-canadians/alt/pdf/eating-nutrition/healthy-eating-saine-alimentation/tips-conseils/recipes-recettes/mac_cheese_macaroni_fromage-eng.pdf) (accessed 2026-10-11) | One recipe lists 375 mL (1 1/2 cups) whole-wheat macaroni **or fusilli** and boils the selected pasta. This is a recipe-specific choice outside this bundle. | One recipe context and volume measure only; it gives neither mass nor a generic interchangeability rule. |
| **WP03-WWPASTA-QC-20261011-S08** | Health Canada, [Coquilles de pâtes au tofu et à la courge musquée](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/recettes/coquilles-pates-tofu-courge-musquee.html) (accessed 2026-10-11; page details 2026-04-14) | Uses the direct Québec French wording **coquilles de pâtes de blé entier gros format** and one 340 g package for six servings. This confirms the French phrase and a recipe-specific pack quantity. | Recipe-specific size and serving count; it does not establish a standard package size or a generic package yield. |

## Disposition and saved-file checks

Recommend adding the identity-only row described above. Keep forms, mappings, package yield, conversion, substitution, and recipe links empty; keep fresh/dry and shape questions open under Section G. No exact recipe demand justifies relinking a bundled line today, but current Canadian and Québec sources establish a distinct, bilingual whole-wheat pasta class and provide a clean boundary from flour, generic pasta, egg pasta, shapes, and state.

The proposal file was checked as UTF-8 without a BOM, with a final newline. A mojibake-marker scan found none; the no-index whitespace-diff check emitted no warnings.
