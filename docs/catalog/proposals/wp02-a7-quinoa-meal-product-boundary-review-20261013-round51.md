# WP02 A7 — Quinoa Meal Product and Québec French Boundary Review (R51)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. Keep the phrase unresolved and unallocated. This file changes no shared catalog, form, legacy, ledger, recipe, plan, roadmap, or batch file.
- **Proposal-local source IDs:** `WP02-A7-QUINOA-MEAL-20261013-R51-S01` through `S08`. These IDs are unique to this proposal and are not ledger records.
- **Scope:** Plain dry-milled quinoa described as `quinoa meal`, apart from R38's experimental malted quinoa flour review. No new identity, alias, form, measure, or substitution is proposed.

## Recommendation

Keep **`quinoa meal` unresolved and unallocated**. Do not add it as an alias to `ingredient-ref-quinoa-flour`, and do not create a separate grain-meal or flour reference. Current sources do not establish one stable product boundary: an Australian flour seller uses `quinoa meal` and `ground quinoa` as synonyms for its whole-seed flour, while food-science papers sometimes distinguish quinoa meal from flour and sometimes use *meal* for a lab-milled sample that they later call flour [S01–S03]. The exact phrase also appears in a Canadian retailer listing for a ready-to-eat pesto dish made with cooked quinoa, not a milled ingredient [S08].

The reviewed Québec producer uses **`farine de quinoa`** for its named flour product, and OQLF's 2025 entry supports **`quinoa`** for the seed/pseudocereal. Neither supplies a Québec French name for a separate meal product [S04–S06]. Do not invent `farine de quinoa moulue`, `semoule de quinoa`, or another French display from an English phrase. Keep generic, roasted, white, red, and black quinoa flour, whole quinoa, quinoa flakes, puffed quinoa, and the dry/cooked whole-quinoa forms under their current owners.

| Phrase or product | Disposition | Boundary |
| --- | --- | --- |
| `quinoa meal` / `whole quinoa meal` | **Hold unallocated** | Research terminology and one foreign seller's synonym do not establish a stable Canadian/Québec product class. |
| `ground quinoa` | **Do not add as an alias** | Graina uses it for one seller's quinoa flour; no Canadian/Québec product or terminology evidence establishes it as a general alias [S01]. |
| `quinoa flour` / `farine de quinoa` | **Retain current identity** | Existing generic product `ingredient-ref-quinoa-flour`; Québec product wording supports this pair [S04]. |
| `Quinoa Meal, Basil Pesto` | **Treat as a prepared dish name** | The Canadian retail listing says ready to eat and lists cooked quinoa with pesto ingredients [S08]. It is not evidence for dry meal. |
| French phrase for a distinct quinoa meal | **Unresolved** | No OQLF or Québec product source reviewed names a separate meal product [S04–S06]. |

## Checklist, archive, and ownership audit

The live [A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) remains open for grain meals, malted/toasted flour identities, and gluten-flour equivalence. It now records R50's malted pearl-millet hold. R38 reviews **malted** quinoa flour only; it does not resolve plain `quinoa meal`. The prior [A7 grain-meal and malt/toasted boundary review](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md), meal proposals, plan dispositions, archive, live references/forms, legacy identities, and ledger were scanned. None owns or decides the exact plain phrase `quinoa meal`, `whole quinoa meal`, or `candidate-quinoa-meal`; R51's filename and source-ID prefix were unused before this review.

At this snapshot the package has **1,370 active references** and **100 forms**. Eight references contain quinoa terminology:

| Active owner | Category | Current English / French | Aliases and numeric fields |
| --- | --- | --- | --- |
| `ingredient-ref-quinoa` | `GRAIN_AND_CEREAL` | `quinoa / quinoa` | English alias `quinua`; no density or unit mappings. |
| `ingredient-ref-quinoa-flour` | `FLOUR_AND_STARCH` | `quinoa flour / farine de quinoa` | No aliases, density, or unit mappings. |
| `ingredient-ref-roasted-quinoa-flour` | `FLOUR_AND_STARCH` | `roasted quinoa flour / farine de quinoa torréfiée` | No aliases, density, or unit mappings. |
| `ingredient-ref-white-quinoa-flour` | `FLOUR_AND_STARCH` | `white quinoa flour / farine de quinoa blanc` | No aliases, density, or unit mappings. |
| `ingredient-ref-red-quinoa-flour` | `FLOUR_AND_STARCH` | `red quinoa flour / farine de quinoa rouge` | No aliases, density, or unit mappings. |
| `ingredient-ref-black-quinoa-flour` | `FLOUR_AND_STARCH` | `black quinoa flour / farine de quinoa noir` | No aliases, density, or unit mappings. |
| `ingredient-ref-quinoa-flakes` | `GRAIN_AND_CEREAL` | `quinoa flakes / flocons de quinoa` | No aliases, density, or unit mappings. |
| `ingredient-ref-puffed-quinoa` | `GRAIN_AND_CEREAL` | `puffed quinoa / quinoa soufflé` | No aliases, density, or unit mappings. |

Only `ingredient-ref-quinoa` has forms: `ingredient-form-quinoa-dry` (`quinoa, dry / quinoa, sec`) and `ingredient-form-quinoa-cooked` (`quinoa, cooked / quinoa, cuit`). Neither form has a density. No meal or flour form exists. No exact phrase owner or proposed candidate ID occurs in legacy-import identities or ledger records.

`IngredientReferenceSearchIndex` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) indexes reference names, aliases, and attached form labels; it prefers complete word-phrase matches and then falls back to partial matches. Static projections from the current package are:

| Query | Current static result | If a `quinoa meal` alias were added to generic quinoa flour |
| --- | --- | --- |
| `quinoa meal` | No result. | Returns `ingredient-ref-quinoa-flour`, resolving a potentially distinct meal term to plain flour. |
| `whole quinoa meal`; `ground quinoa`; `semoule de quinoa`; `farine de quinoa moulue` | No result. | Unchanged unless separate unsupported terms were added. |
| `quinoa` | Eight references listed above. | Still eight for an alias; a separate identity would expand it to nine. |
| `quinoa flour`; `farine de quinoa` | Five references: generic, roasted, and white/red/black quinoa flours. | Still five for an alias; a separate identity would not match these phrases unless an unsupported alias were added. |
| `meal` | Five references: cornmeal, cracker crumbs (`cracker meal` alias), matzo meal, rye meal, and whole wheat meal. | Would return six references if the alias were attached to quinoa flour. |

The new `meal` result from an alias could make an unrelated generic meal query return plain quinoa flour. A separate identity would instead broaden both the `quinoa` and `meal` searches without a supported French display or an established meal-versus-flour definition. No picker or catalog change is recommended.

## Product and naming search audit

On 2026-10-13 I checked these bounded web queries: `"quinoa meal" quinoa flour "meal" ground quinoa`; `"whole quinoa meal" flour`; `site:graina.com.au/products/organic-quinoa-flour "quinoa meal"`; `site:instacart.ca "Quinoa Meal" Cucina Amore`; `"quinoa meal" Canada flour product`; `"farine de quinoa" "quinoa meal" Canada`; `site:ca "quinoa meal" flour`; `site:vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt "farine de quinoa"`; and `site:quinoaquebec.com "Farine de quinoa"`.

The bounded results included Graina's Australian `Organic Quinoa Flour`, whose indexed product-description text reports `quinoa meal` and `ground quinoa` as synonyms; the Québec producer's `Farine de quinoa` product heading; a Canadian supplier's listing for `Organic Quinoa Flour`; and Canadian retailer listings where `Quinoa Meal` is part of a ready-to-eat dish name. I found no Canadian/Québec standalone dry product page that specifies a quinoa meal grind and gives a meal-specific French name. Search results are not exhaustive market evidence; retain the hold rather than treating absence as proof that no such product exists.

### Bundled recipe demand

The manifest lists **114 recipe files** with **1,123 ingredient rows**. I scanned every manifest-listed recipe, every ingredient row, and the complete serialized recipe text for `quinoa meal`, `whole quinoa meal`, `quinoa meal flour`, `ground quinoa`, `quinoa flour`, `farine de quinoa`, `farine de quinoa moulue`, `quinoa semolina`, and `semoule de quinoa`. The candidate-specific phrase scan found **zero recipe files and zero ingredient rows**. A broad `quinoa` scan finds two recipes: recipe 016 uses 2 cups of cooked whole quinoa, while recipe 018 mentions quinoa as an optional serving suggestion. Neither uses a meal or flour product. There is no bundled demand, recipe link, or substitution use case for this candidate.

## Measurement and substitution limits

- No exact-form household measure, bulk density, or mass/volume observation for a separately defined **quinoa meal** was located. Graina's 250 g, 500 g, and 1,000 g options are package formats for that seller's flour, not recipe measures or density evidence [S01]. The live quinoa and quinoa-flour references have null density and empty unit mappings; no candidate measure should be copied from adjacent quinoa flour products.
- Youssif et al. condition seeds to 16% moisture for tissue separation, mill them into a lab sample called “whole quinoa meal,” and pass it through a 50-mesh screen [S03]. These are experimental preparation parameters. They do not establish a retail meal specification, a household measure, a cup-to-gram mapping, or density; they must not be generalized to a commercial candidate.
- Chauhan et al. test 0–20% manually dehulled quinoa meal or flour in wheat bread and discuss one 10% level for extracted meal/flour; Youssif et al. test rice/quinoa-flour blends in gluten-free bread [S02–S03]. These are formulation-specific research ratios. They do not establish that meal and flour are equivalent or support a general substitution rule, and no recipe-line substitution is proposed.
- Do not add a form conversion, yield, density, unit mapping, recipe link, or substitution rule. The existing dry/cooked states apply to whole quinoa, not ground products.

## Proposal-local source register

Sources were checked on **2026-10-13**. Source IDs below are local to R51 and are not added to the research ledger.

| ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **S01** | Graina, [Organic Quinoa Flour](https://graina.com.au/products/organic-quinoa-flour), indexed product-description text, current page heading/description, and pack-size options. | Search-indexed product-description text says “also known as quinoa meal, ground quinoa”; the visible page calls the product flour made from quinoa seed and offers 250/500/1,000 g packs. | One seller's Australian synonym usage, with the synonym visible in the search index rather than the page text extracted on review; it does not establish a Canadian/Québec product class, meal-specific grind, or fr-CA name. Pack sizes are not recipe measures or density. |
| **S02** | Chauhan, Zillman & Eskin, [“Dough mixing and breadmaking properties of quinoa-wheat flour blends”](https://academic.oup.com/ijfst/article/27/6/701/7867713), *International Journal of Food Science & Technology* 27(6) (1992), 701–705, abstract; [DOI](https://doi.org/10.1111/j.1365-2621.1992.tb01241.x). | The study separately names manually dehulled quinoa meal and flour and reports wheat-bread trials using both. | Historical formulation research, not a consumer specification, milling standard, exact-form measure, or reusable substitution ratio. The abstract does not define a retail meal grind. |
| **S03** | Youssif et al., [“Utilization of Quinoa Seeds to Produce Gluten-Free Pan Bread”](https://jfds.journals.ekb.eg/article_36010_a59ae867d590ace9f3acad5fc26610c1.pdf), *Journal of Food and Dairy Science* 9(7) (2018), p. 222, Methods §§ “Preparation of quinoa seeds flour” and “Preparation of gluten free pan bread blends”; Tables 1 and 4. | The methods call the sieved lab material “whole quinoa meal”; later methods/results call it quinoa flour and test it in rice-based gluten-free bread. The paper records 16% seed conditioning and 50-mesh sieving. | One Egyptian laboratory's sample and formulation, with internally mixed meal/flour wording. Moisture and sieve conditions are not product standards, measures, or general substitution guidance. |
| **S04** | Quinoa du Québec, [Nos produits pour les professionnels](https://www.quinoaquebec.com/nosproduitprofessionnel), headings “Farine de quinoa” and “Flocons de quinoa.” | A Québec quinoa producer names generic and roasted flour under `Farine de quinoa`, and separately names flakes. Supports retaining the active flour wording and product separation. | Wholesale product page; it does not name a distinct meal product or supply a meal-specific alias. |
| **S05** | OQLF, [quinoa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), preferred terms, definition, and notes; updated 2025. | Québec-preferred `quinoa`, masculine noun; identifies the consumed seeds and classifies the plant as a pseudocereal. | Does not define flour, meal, grind, or a French compound for quinoa meal. |
| **S06** | Gouvernement du Québec, [L’alimentation responsable dans les services de garde éducatifs à l’enfance](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/famille/publications-adm/Service_de_garde/sante-securite/gazelle-potiron-guide-alim-resp.pdf), §6 “Les desserts,” printed p. 27 (PDF page 27), lines on “farines de quinoa.” | Québec French educational guidance uses the ordinary phrase `farines de quinoa` for flour in baking. | General nutrition guidance, not a standalone product label or a term for a separate meal grind. |
| **S07** | For Good Measure, [Product list](https://www.forgoodmeasure.ca/productlist), “Alternative Baking Ingredients.” | Canadian supplier lists `Organic Quinoa Flour, 400g`, not a quinoa meal item in its reviewed list. | A product list is not an exhaustive Canadian market survey and gives no meal-specific bilingual label or flour measurement. The listed package size is not a recipe measure. |
| **S08** | Instacart Canada, [Cucina & Amore Quinoa Meal, Basil Pesto](https://www.instacart.ca/products/385892-cucina-amore-quinoa-meal-basil-pesto-7-9-oz), title, “Ready to eat” product details, and ingredient list. | Canadian-facing retailer title includes `Quinoa Meal`; the listing describes a microwaveable prepared dish and lists cooked quinoa, basil, oil, nuts, cheeses, and seasonings. | Retailer listing for a prepared food, not a dry milling product or manufacturer's terminology standard. Its package/serving information must not be transferred to dry quinoa or meal. |

## Next action

Leave `quinoa meal` unallocated. Reopen only if a Canadian or Québec manufacturer/retailer publishes a standalone dry product page or bilingual package with a defined meal-versus-flour boundary and an exact French label. Then review that exact product's measurements independently; do not infer them from whole quinoa, generic quinoa flour, the experimental sieve, or package mass.
