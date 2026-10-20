# WP03 Section F: Mini-Wheats Original Frosted family and picker review (R182)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Root disposition recorded below; no shared catalog or ledger data was integrated.
- **Open checklist:** The active plan retains the Section F review of regional cereal mixes and preprocessed grains [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L3513), and its broader Section F cereal/preprocessed-grain review remains open [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L13305).
- **Candidate reviewed:** **Mini-Wheats Original Frosted Cereal / Céréales Mini-Wheats Originale**, the current Canadian SKU.
- **Recommendation:** **Hold the single-SKU catalog addition** pending a family-wide Mini-Wheats picker review. The Canadian bilingual SKU identity is clear, but the manufacturer currently lists eight Mini-Wheats products. Adding only Original Frosted would make bare `Mini-Wheats` return a single flavor when seven other named cereal variants are current. Keep the candidate out of active references and the research ledger for now; add no alias, form, measure, mapping, conversion, recipe link, or substitution.

## Product identity, French naming, and family boundary

WK Kellogg Co Canada's current English product page identifies **Mini-Wheats Original Frosted Cereal**. The Canadian French page identifies **Céréales Mini-Wheats Originale**, describes the cereal as whole-grain wheat, and includes Québec in its regional retailer selector, including Metro Québec, Provigo, Maxi, and other retailers [S01–S04]. A current Maxi Québec product page lists `Mini Wheats Céréales originale`, 460 g, and “Préparé au Canada” [S05]. Use the Canadian French manufacturer's exact title if this identity is reconsidered. It is commercial product wording, not an OQLF terminology ruling.

The candidate is a named frosted, ready-to-eat shredded-wheat-style cereal product. The manufacturer ingredient panel lists whole-grain wheat, sugars (sugar and brown-rice syrup), gelatin, BHT, and vitamins/minerals [S03–S04]. Keep it distinct from generic `shredded wheat cereal / blé filamenté`: the cereal's frosting, ingredient formula, and brand-specific product identity do not establish equivalence to plain shredded wheat or a same-ingredient form conversion.

The manufacturer's current English and French brand pages each list eight product names [S01–S02]:

| English manufacturer listing | Canadian French manufacturer listing |
|---|---|
| Mini-Wheats Original Frosted Cereal | Céréales Mini-Wheats Originale |
| Mini-Wheats Brown Sugar Flavour Cereal | Céréales Mini-Wheats Saveur de cassonade |
| Mini-Wheats Strawberry Flavour | Céréales Mini-Wheats Fraise |
| Kellogg's Mini-Wheats Low Sugar Cereal | Céréales Kellogg's Mini-Wheats à faible teneur en sucre |
| Mini-Wheats Original Minis Cereal | Céréales Mini-Wheats Minis Originale |
| Mini-Wheats Blueberry Flavour Cereal | Céréales Mini-Wheats Bleuet |
| Mini-Wheats Chocolate Flavour Cereal | Céréales Mini-Wheats Saveur de chocolat |
| Mini-Wheats Pumpkin Spice Flavour Cereal | Céréales Mini-Wheats Saveur d’épices à citrouille |

These are separately named formulations or sizes, not synonyms for Original Frosted. A catalog entry bearing the unavoidable brand phrase `Mini-Wheats` would make the broad brand query point to Original Frosted alone. The family needs a deliberate multi-row decision, or a different picker design that can represent the family without misdirecting the query, before one SKU is activated.

| Neighbor | Existing owner or status | Boundary |
|---|---|---|
| `shredded wheat cereal / blé filamenté` | `ingredient-ref-shredded-wheat-cereal` | Plain shredded-wheat cereal identity. Do not transfer this branded frosted product to it or use it as a substitute without evidence. |
| Generic wheat, whole-wheat flour, and brown-rice syrup | Existing ingredient references | Formula components are not aliases or mappings for the formulated cereal. |
| Seven other Mini-Wheats products | Manufacturer-listed siblings; no exact active references found | Keep each product name distinct. Do not treat a single Original row as the brand-family identity. |

## Ownership and source-collision audit

The current working-tree snapshot contains **1,559 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,904 research-ledger records**, with **8,168 source entries**, **6,979 distinct source IDs**, and **5,775 distinct source URLs**.

Exact normalized ownership searches across active displays and aliases, form labels and match terms, legacy-import names and aliases, ledger records, the active plan, prior proposal and batch files, and the recipe corpus found no current owner or focused proposal/hold for `Mini-Wheats Original Frosted Cereal`, `Céréales Mini-Wheats Originale`, `Mini-Wheats Originale`, `Mini-Wheats`, product number `21607207_EA`, or prospective ID `ingredient-ref-mini-wheats-original-frosted`. No Mini-Wheats candidate is active in the ledger. The existing shredded-wheat identity remains a neighboring generic cereal owner only.

The proposed audit IDs `WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S01` through `S05` and the exact English/French manufacturer and Maxi URLs in the source register are absent from the ledger. The source URLs are product/family-specific current Canadian pages, not U.S. Mini-Wheats pages or generic international product data.

## Picker projection

The current picker normalizes accents and punctuation, prefers complete word-phrase matches, and only uses substring matching when no full phrase matches. The current catalog projection is:

| Query | Current results | If only Original Frosted were added |
|---|---:|---:|
| `Mini-Wheats` | 0 | 1, the Original Frosted row |
| `Mini-Wheats Original Frosted Cereal` | 0 | 1, the Original Frosted row |
| `Céréales Mini-Wheats Originale` | 0 | 1, the Originale row |
| `shredded wheat` | 1, generic shredded-wheat cereal | 1; the frosted brand name is not an exact phrase match |
| `cereal` / `céréales` | 20 / 17 | 21 / 18 |

The one-result `Mini-Wheats` query is the collision that blocks single-SKU activation: the current manufacturer family has eight products, but the catalog would imply that only Original Frosted satisfies the family term. Adding `Mini-Wheats` as an alias would preserve the same problem and is not recommended. A future family review must account for all currently listed variants, local names and any discontinued/retail-only differences before assigning several rows or a family search strategy.

## Recipe-corpus demand

The full manifest corpus contains **114 recipe files and 1,123 ingredient rows**. Full serialized recipe files and ingredient rows were scanned for the English and French product titles, `Mini-Wheats`, `Mini Wheats`, `Original Frosted`, and product number `21607207_EA`. The scan found **0 matching files and 0 matching ingredient rows**. The corpus supplies no reason to bypass the family picker review or create recipe links.

## Numeric, preparation, and substitution boundaries

- **Retailer serving:** Maxi lists **23 biscuits (55 g)** for its current 460 g item [S05]. This is a retailer-panel observation for that SKU and displayed package, not a general Mini-Wheats measure, a reusable biscuit count, or a mass-volume mapping. The manufacturer product pages direct readers to SmartLabel for full nutrition details; no active measure or ledger value is proposed while the identity remains held.
- **Package sizes:** The English SKU page lists 400 g, 460 g, 650 g, 1,050 g, and 1,600 g options. The French product page's prose names 460 g and 1,050 g while its variant selector displays other sizes as well [S03–S04]. This mismatch reinforces that package sizes are SKU/retailer-specific; none is an ingredient amount or yield.
- **Forms and preparation:** The pages describe ready-to-eat cereal and provide no reusable preparation state or cooking yield. Add no form or yield.
- **Composition:** Whole-grain wheat, sugar, brown-rice syrup, gelatin, and fortification ingredients are label components, not a quantitative product formula. Add no component links or conversions.
- **Substitution:** No reviewed source establishes a tested quantity-qualified substitution between this cereal, plain shredded wheat, another Mini-Wheats product, or bran flakes. Add no global or contextual rule.

## Source register

Sources accessed 2026-10-16. Proposal-local IDs are not ledger additions.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S01` | WK Kellogg Co Canada, [Mini-Wheats English brand page](https://www.wkkellogg.ca/en/our-foods/our-brands/mini-wheats), current product list. | Lists eight current English Mini-Wheats product variants. Establishes that the broad brand phrase has multiple product referents, not their full ingredient formulas. |
| `WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S02` | WK Kellogg Co Canada, [Mini-Wheats French brand page](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/mini-wheats), current Canadian French product list. | Lists the corresponding eight French product names. Supports family scope and French naming; it does not establish a single French alias or shared formulation. |
| `WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S03` | WK Kellogg Co Canada, [Mini-Wheats Original Frosted Cereal](https://www.wkkellogg.ca/en/products/mini-wheats-original-frosted-cereal-product), product title, description, ingredients, and package selectors. | Confirms current Canadian SKU identity, whole-grain wheat, ingredient statement, and listed package options. The page refers full nutrition details to SmartLabel; its package sizes are not recipe measures. |
| `WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S04` | WK Kellogg Co Canada, [Céréales Mini-Wheats Originale](https://www.wkkellogg.ca/fr/produits/cereales-mini-wheats-originale), French SKU page and Québec retailer selector. | Confirms the Canadian French product title, French ingredient list, available retailer routes including Maxi, Provigo and Metro Québec, and product-specific description. It is brand wording rather than an OQLF ruling. |
| `WP03-MINI-WHEATS-ORIGINAL-R182-20261016-S05` | Maxi Québec, [Kellogg’s Mini Wheats Céréales originale, 460 g](https://www.maxi.ca/fr/mini-wheats-c-r-ales-originale/p/21607207_EA), current listing, ingredients and nutrition panel. | Confirms a Québec retail listing and the 460 g SKU; reports 23 biscuits (55 g) as its panel serving. Package and serving data remain retailer/SKU-specific, approximate per the retailer disclaimer, and inactive. |

## Recommendation

**Hold Mini-Wheats Original Frosted outside active references and the research ledger pending a family-wide catalog and picker decision.** The exact bilingual Canadian product identity and a Québec retail listing are established, but the brand pages currently enumerate eight distinct products. A single Original row would make bare `Mini-Wheats` appear to select the whole family while returning only one flavor. Keep it separate from generic shredded wheat and all listed siblings. Add no alias, form, measurement, mapping, conversion, yield, recipe link, or substitution while held. Section F remains open.

## Root integration decision

**Hold confirmed.** Mini-Wheats Original Frosted remains outside active references and the research ledger pending a family-wide catalog and picker decision. The Canadian manufacturer pages list eight separate Mini-Wheats products, so a single Original row would make the broad brand query return one flavor. Keep this product separate from generic shredded wheat and the other branded variants. No recipe demand was found. The R182 plan and batch README record the hold; no shared catalog or ledger data changed.
