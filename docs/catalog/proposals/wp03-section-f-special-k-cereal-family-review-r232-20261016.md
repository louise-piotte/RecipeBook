# WP03 Section F — Special K Canadian cereal-family identity review (R232)

**Review date:** 2026-10-16
**Disposition:** Accepted and integrated the five cereal products currently enumerated on WK Kellogg Canada’s English and French Special K family pages as five separate, identity-only `GRAIN_AND_CEREAL` references.
**Proposal scope:** Names and boundaries only. This review makes no edits to reference JSON, forms, the research ledger, recipes, generated catalog, plan, roadmap, or checklist.

## Checklist context and candidate audit

The live Section F checklist still leaves **“Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps”** open ([plan, line 3681](../../RecipeBook-global-ingredient-catalog-plan.txt#L3690)). R226’s [sorghum-flakes boundary recheck](wp03-section-f-white-sorghum-poha-boundary-recheck-r226-20261016.md) and the R231 [Koshihikari review](wp03-section-f-koshihikari-rice-identity-review-r231-20261016.md) concern different products. The current review covers the unallocated Canadian Special K ready-to-eat cereal products as a product-family identity gap.

At the proposal audit snapshot, searches of active references, forms, the research ledger, proposals, and batches found no Special K reference, form, candidate, recipe allocation, prior focused review, or source entry for the product identifiers examined below. That snapshot contained 1,621 ingredient references and 122 forms. The proposed reference IDs were not present in that snapshot:

| Proposed ID | English display | French display |
| --- | --- | --- |
| `ingredient-ref-special-k-red-berries-cereal` | Special K Red Berries Cereal | Céréales Special K Baies rouges |
| `ingredient-ref-special-k-vanilla-almond-cereal` | Special K Vanilla Almond Cereal | Céréales Special K Vanille et amandes |
| `ingredient-ref-special-k-fruit-yogurt-flavour-cereal` | Special K Fruit & Yogurt Flavour Cereal | Céréales Special K Saveur Fruits et Yogourt |
| `ingredient-ref-special-k-original-cereal` | Special K Original Cereal | Céréales Special K Original |
| `ingredient-ref-special-k-cinnamon-maple-crumble-cereal` | Special K Cinnamon Maple Crumble Flavour Cereal | Céréales Special K croustade à l'érable et à la cannelle |

The English and French family pages enumerate those same five product titles. Their French wording is manufacturer product-title evidence for the Canadian French catalog; it is not an OQLF ruling or a generic translation rule. Direct Canadian product pages also provide product-specific formulations and sizes for Original, Red Berries, Vanilla Almond, Fruit & Yogurt, and Cinnamon Maple Crumble [S01–S08].

## Blueberry boundary

Québec retailer pages also retain a Special K Blueberry cereal listing. Metro’s English and French listings use product number **064100138070**, describe a 317 g product, list dried blueberries with whole-grain wheat and rice, and currently show the product out of stock [S09–S10]. Super C retains a French listing under the same code and 317 g size, but the page includes a promotion end date in June 2025, so that page is weak evidence of current availability [S11]. The current Canadian manufacturer family pages enumerate five other products and do not list Blueberry [S01–S02]. WK Kellogg’s U.S. product page does list a Blueberry cereal, but it is explicitly a U.S. page and cannot establish Canadian SKU status or Canadian product naming [S12].

The retailer listings establish that a distinct Blueberry cereal SKU has existed in Canadian retail data; they do not establish whether it remains a currently marketed Canadian product. “Out of stock” is store- or listing-level availability, not proof of discontinuation. For this promotion, follow the current Canadian manufacturer-listed five-product set and **do not add Blueberry**. Reopen that boundary if WK Kellogg Canada confirms the SKU or a current Québec listing shows active availability and a current product label. Do not translate the U.S. page or infer Blueberry as an alias for fresh blueberries.

## Identity, alias, and category boundaries

The five proposed rows represent distinct boxed, ready-to-eat cereal products. Their formulas differ: Original is a rice-and-wheat cereal; Red Berries includes dried strawberries; Vanilla Almond includes almonds; Fruit & Yogurt includes dried fruit, yogurt powder, and whole-grain oats; Cinnamon Maple Crumble includes whole-grain oats, cinnamon, and baked crumble pieces [S03–S08]. Keep each product separate from the other Special K variants and from the ingredients named in their formulas.

If accepted, assign each row to `GRAIN_AND_CEREAL`, with empty English and French alias arrays. Do not add aliases such as `Special K`, `cereal`, `rice flakes`, `blueberries`, `strawberries`, `almonds`, or `yogurt`; the product names themselves provide bilingual picker terms, while component terms identify different ingredients. Keep the Blueberry name and code out of aliases and active references while its Canadian status remains unresolved.

Relevant existing owners are not duplicates:

- `ingredient-ref-rice-cereal` owns **crispy rice cereal / céréales de riz croustillantes**, not the formulated Special K Original boxed product.
- `ingredient-ref-blueberries` owns **blueberries / bleuets**.
- `ingredient-ref-mini-wheats-blueberry` owns **Mini-Wheats Blueberry Flavour Cereal / Céréales Mini-Wheats Bleuet**.
- Other Special K component ingredients such as rice, wheat, oats, almonds, and dried fruit remain separate ingredients.

Exact and normalized searches across active reference IDs, bilingual names and aliases, form IDs/labels/match terms, and ledger text found no owner for the five proposed identities, their proposed IDs, the brand phrase `Special K`, the Blueberry product number, or the Fruit & Yogurt GTIN `00064100351349`. No existing ledger source entry matches the reviewed URLs. Searches of the proposal and batch directories found no earlier Special K identity or family decision. Family-level picker coverage follows the approach in the earlier [Mini-Wheats family hold](wp03-section-f-mini-wheats-original-frosted-family-picker-hold-review-r182-20261016.md) and [family integration review](wp03-section-f-mini-wheats-family-picker-review-r200-20261016.md): review siblings together when a brand query should resolve to a coherent product set.

## Picker impact

The live picker folds accents and punctuation and returns complete normalized word phrases before using substring fallback ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). A static projection from the current references and forms gives:

| Query | Current result | After the five proposed rows |
| --- | --- | --- |
| `Special K` | 0 | 5 proposed products |
| `Céréales Special K` | 0 | 5 proposed products |
| `Special K Original` | 0 | 1 Original row |
| `Special K Fruit & Yogurt` | 0 | 1 Fruit & Yogurt row |
| `cereal` | 33 English-name matches | 38, including the five rows |
| `blueberry` | 1: Mini-Wheats Blueberry | unchanged; Blueberry is not being promoted |
| `bleuets` | 1: generic blueberries | unchanged; no Blueberry cereal alias is added |

Adding only one or two current products would make a broad `Special K` search look like a one- or two-item family. The five-item promotion gives the family query the same five products shown on the current Canadian manufacturer pages. If Blueberry is later verified as current, add it as a sixth product and rerun these query projections. The family query is limited to the manufacturer-listed Canadian product set checked on 2026-10-16; it is not a statement about historical or U.S. Special K products.

## Bundled recipe-corpus demand

The manifest-listed bundle contains **114 recipe files and 1,123 ingredient-like records**. A scan of serialized recipe content found no matches for `Special K`, `Special-K`, `SpecialK`, `Special K Blueberry`, `blueberry cereal`, `cereal Special K`, `Céréales Special K`, or `Céréales aux bleuets`. No recipe currently demands any of the five rows, no Blueberry recipe allocation is supported, and no recipe link or legacy mapping is proposed.

## Measures, density, forms, yields, and substitutions

- **Servings:** The Canadian Original product page reports a 32 g nutrition-label serving; the Fruit & Yogurt Canadian SmartLabel reports 1 cup (44 g) [S03, S06–S07]. These are different SKU-specific nutrition servings. If the family is integrated, retain a serving only as its product-specific research-ledger observation. Do not turn either into a shared cup mapping or transfer it to a sibling.
- **Package sizes:** The source pages list different package sizes, including 345/485 g for Original, 320/450/700 g for Red Berries, 355/525 g for Vanilla Almond, 360 g for Fruit & Yogurt, and 354 g for Cinnamon Maple Crumble [S03–S08]. Net package mass is not a recipe quantity, volume conversion, or yield.
- **Density and unit mappings:** The products have different flakes, fruit, nuts, and clusters. The sources do not support a common g/ml density or family-wide cup-to-mass mapping. Leave `defaultDensity` null and `unitMappings` empty. A serving label alone does not establish a reusable volume measure.
- **Forms and yields:** These are ready-to-eat products. No dry/cooked form distinction, preparation yield, or process conversion is supported. Add no forms or yields.
- **Substitutions:** No source establishes a tested, quantity-qualified substitution between these products or another cereal. Their shared brand or grain components do not establish equivalence. Add no global or contextual substitution rules.
- **Blueberry numeric evidence:** The 317 g retailer package is net content only. Its out-of-stock status, package weight, and ingredient list do not support an active measure or conversion.

## Conditional reference shape

Root integration added five references with the IDs and bilingual names above, `category: "GRAIN_AND_CEREAL"`, empty alias arrays, null density, and empty unit mappings. It recorded Original’s 32 g nutrition portion and Fruit & Yogurt’s 1 cup (44 g) serving only as SKU-specific ledger observations. No reusable measures, forms, recipe links, conversions, yields, or substitutions were added. The Blueberry SKU remains outside active references and the ledger while current Canadian product status is unresolved.

## Source register

Sources were checked online on 2026-10-16. Root registered R232 sources S01–S08 on the five accepted ledger records. Sources S09–S12 remain proposal-only because they concern the held Blueberry SKU or the U.S. product page.

| Source ID | Source | Evidence and limit |
| --- | --- | --- |
| WP03-SPECIALK-CANADA-R232-20261016-S01 | WK Kellogg Canada, [Special K brand page, English](https://www.wkkellogg.ca/en/our-foods/our-brands/special-k) | Current Canadian brand page enumerates the five English product titles. It does not list Blueberry. |
| WP03-SPECIALK-CANADA-R232-20261016-S02 | WK Kellogg Canada, [Special K brand page, French](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/special-k) | Current Canadian French brand page lists the five French product titles. Supports manufacturer wording, not an OQLF terminology decision. |
| WP03-SPECIALK-CANADA-R232-20261016-S03 | WK Kellogg Canada, [Céréales Special K Original](https://www.wkkellogg.ca/fr/produits/c-r-ales-special-k-originales-product) | Product title, 32 g serving, 345/485 g packages, ingredients, and Québec retailer links. Product-specific only. |
| WP03-SPECIALK-CANADA-R232-20261016-S04 | WK Kellogg Canada, [Special K Red Berries Cereal](https://www.wkkellogg.ca/en/products/special-k-with-red-berries-cereal-product) | Canadian product page lists the separate Red Berries product, 320/450/700 g package options, and its ingredients. Supports product identity, not a transferable measure. |
| WP03-SPECIALK-CANADA-R232-20261016-S05 | WK Kellogg Canada, [Special K Vanilla Almond Cereal](https://www.wkkellogg.ca/en/products/special-k-vanilla-almond-cereal-product) | Canadian product page lists the Vanilla Almond product, 355/525 g sizes, and almonds in its ingredient list. The French display comes from S02. |
| WP03-SPECIALK-CANADA-R232-20261016-S06 | WK Kellogg SmartLabel, [Special K Fruit & Yogurt Flavour Cereal](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100351349) | Canadian label page identifies the 360 g product and 1 cup (44 g) serving. This is product-specific label evidence. |
| WP03-SPECIALK-CANADA-R232-20261016-S07 | WK Kellogg SmartLabel, [Céréales Special K Saveur Fruits et Yogourt](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00064100351349) | Canadian French label supports the bilingual product name and repeats the SKU-specific serving. |
| WP03-SPECIALK-CANADA-R232-20261016-S08 | WK Kellogg Canada, [Céréales Special K croustade à l'érable et à la cannelle](https://www.wkkellogg.ca/fr/produits/special-k-cereal-cinnamon-maple-crumble) | Canadian product page gives the French product title, 354 g package, ingredients, and Québec retailer links. |
| WP03-SPECIALK-CANADA-R232-20261016-S09 | Metro Canada, [Special K Blueberry Cereal](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/blueberry-cereal/p/064100138070) | Canadian retailer listing gives 317 g, UPC/product number 064100138070, ingredients, and current out-of-stock status. Retail listing and availability do not prove current manufacturer marketing. |
| WP03-SPECIALK-CANADA-R232-20261016-S10 | Metro Québec, [Céréales aux bleuets, Special K](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-aux-bleuets-entiers/p/064100138070) | French retail title and same product number; page showed the item out of stock and an expired August 2026 promotion. Secondary naming evidence; no claim of current stock. |
| WP03-SPECIALK-CANADA-R232-20261016-S11 | Super C Québec, [Céréales de riz et de blé aux bleuets Special K](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-aux-bleuets/p/064100138070) | French retailer title, 317 g package, same product number, and ingredients. The page retains a 2025 promotion date, so it is not sufficient evidence of current availability. |
| WP03-SPECIALK-CANADA-R232-20261016-S12 | WK Kellogg U.S., [Special K Blueberry Cereal](https://www.wkkellogg.com/products/special-k-cereal-blueberry) | Confirms a U.S. product under that name, but the page is marked USA and lists U.S. package sizes. It does not establish a current Canadian SKU or Québec French title. |

## Recommendation and limits

**Accepted and integrated the five manufacturer-listed Canadian Special K cereals as separate identity-only references, with no aliases or active numeric conversions. Keep the retailer-listed Blueberry SKU on a bounded hold.** The five bilingual product names are directly supported by WK Kellogg Canada, and product-level pages confirm distinct formulas and package identities. The Blueberry product number is identifiable in Québec retail pages, but both current Metro listings show it out of stock, Super C’s French page has stale promotional data, and the manufacturer’s Canadian family pages do not enumerate it. This is not enough to call Blueberry either a current Canadian offering or discontinued.

The corpus has no matching demand. Do not attach a recipe link, shared serving, density, unit mapping, form, yield, or substitution to the family. Reopen the Blueberry boundary only when a Canadian manufacturer page or current available Québec product listing clarifies its status and French title; then re-run ownership and picker projections. Section F remains open.
