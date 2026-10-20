# WP03 Section F — Vector Canadian cereal-family identity review (R251)

**Review date:** 2026-10-16
**Disposition:** Recommend six separate, identity-only `GRAIN_AND_CEREAL` references for the current Canadian Vector cereal and granola lineup.
**Proposal scope:** Naming, product boundaries, picker behavior, and source-specific quantity limits only. This proposal does not change catalog JSON, the research ledger, recipes, the plan, or the roadmap.

## Checklist context and candidate audit

The active Section F parent remains open for further grain and cereal identity coverage ([plan, line 528](../../RecipeBook-global-ingredient-catalog-plan.txt#L528)). The plan's R247 item concerns the separate, unresolved Leader Price precooked durum-wheat product ([plan, line 3396](../../RecipeBook-global-ingredient-catalog-plan.txt#L3405)); this review does not reopen that boundary. Recent cereal work on Special K, Quaker Super Grains, PC Blue Menu Supergrains, Cheerios, Mini-Wheats, and All-Bran covers other manufacturer families and remains outside this candidate's scope. The latest WP03 entries in [roadmap.md](../../../roadmap.md) likewise contain no Vector decision.

Before selecting Vector, I searched the current references, forms, legacy-import identities, research ledger, bundled recipes, current plan, roadmap, and the proposal/batch archives for `Vector`, `Kellogg's Vector`, `Vector cereal`, and the French brand/product phrase. The worktree snapshot contained **1,640 active references**, **124 forms**, **61 legacy candidates**, **1,987 ledger records**, and **114 manifest-listed recipe files / 1,123 ingredient rows**. None of those audited files contains a Vector candidate, owner, form, recipe allocation, prior focused review, or source entry. The active generic `ingredient-ref-granola` remains a distinct adjacent identity; it does not own these branded product names.

The official Canadian Vector family pages enumerate six current products in English and French. A partial addition would make the broad `Vector` query appear to select the whole lineup while omitting manufacturer-listed siblings. Reviewing the six-item family together gives one bounded, picker-visible gap and does not revisit the other recently integrated or held brands.

## Proposed identities and product boundary

The suggested displays below use the manufacturer’s Canadian product names, omitting only the trademark symbol. The French displays are taken from WK Kellogg Canada’s French family/product pages; they are manufacturer wording, not OQLF rulings.

| Proposed reference ID | English display | French display | Product-specific package/serving evidence |
|---|---|---|---|
| `ingredient-ref-vector-maple-flavour-cereal` | Vector Maple Flavour Cereal | Céréales Vector à saveur d'érable | 306 g package; label serving 1 cup (44 g). |
| `ingredient-ref-vector-meal-replacement` | Vector Meal Replacement | Substitut de repas Vector | 400 g, 550 g, 850 g, and 1.13 kg packages; manufacturer describes a 55 g serving with 200 mL skim milk. |
| `ingredient-ref-vector-peanut-butter-flavour-cereal` | Vector Peanut Butter Flavour Cereal | Céréales Vector à saveur de beurre d’arachides | 306 g package; label serving 1 cup (44 g). |
| `ingredient-ref-vector-chocolate-granola-cereal` | Vector Chocolate Flavour Granola Cereal | Granola Vector Saveur de chocolat | 311 g package; label serving 1 cup (108 g). |
| `ingredient-ref-vector-vanilla-almond-granola-cereal` | Vector Vanilla Almond Granola Cereal | Granola Vector Vanille et amandes | 311 g package; label serving 1 cup (98 g). |
| `ingredient-ref-vector-strawberry-granola` | Vector Strawberry Granola | Granolas aux fraises Vector | 311 g package; label serving 1 cup (118 g). |

These are dry packaged, formulated cereal or granola products sold under one Canadian brand family. The products vary in cereal pieces, multigrain flakes, granola clusters, flavourings, and inclusions; retain each marketed product as a separate identity. In particular, `Vector Meal Replacement` is one branded cereal product. The title does not establish a general meal-replacement ingredient class, and the manufacturer describes its own blend as multigrain flakes with granola clusters [S05].

Keep each Vector identity separate from generic `granola`, plain cereal-grain identities, and the ingredients in a product formula. Do not infer a grain species, nutrition claim, formula-wide composition, or generic cereal alias from one Vector SKU. Do not include Vector protein bars or products sold outside the current six-item Canadian cereal-family page.

If accepted, assign each proposed row to `GRAIN_AND_CEREAL`, with empty alias arrays, null `defaultDensity`, and empty `unitMappings`. Add no forms, substitutions, conversions, yields, or recipe links. The product name itself supplies the branded search terms; ingredient words such as oats, wheat, soy, peanut butter, maple, chocolate, vanilla, almonds, or strawberries must not become aliases.

## Picker behavior

The current picker folds accents and punctuation, prefers complete word phrases, then falls back to substring matching ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). A static projection from the current package has no Vector results. Under the proposed six bilingual display pairs:

| Query | Current result | With all six proposed rows |
|---|---|---|
| `Vector` | 0 | All six product identities. The brand word appears in every proposed English and French display. |
| Exact English or French product title | 0 | The matching single product identity. |
| `granola` | Generic `granola` | Generic `granola` plus the chocolate, vanilla-almond, and strawberry Vector products. |
| `cereal` | 43 existing name/form matches | Those existing matches plus the four Vector titles containing *Cereal/Céréales* in English or French. |
| `Céréales Vector` | 0 | The Maple and Peanut Butter products, whose French titles contain this phrase. The other four use `Granola` or `Substitut de repas` in their French titles. |

The short brand query `Vector` returns the complete listed family. Keep the exact manufacturer titles rather than adding repeated family aliases such as `Vector cereal` or `Céréales Vector` to every row; repeated normalized aliases would make ownership ambiguous. This leaves the narrower French phrase query at two products, while the shared brand query remains complete. Do not make a one- or two-SKU addition that turns `Vector` into a misleading family singleton.

## Bundled recipe-corpus demand

The manifest-listed package snapshot has **114 recipes and 1,123 ingredient rows**. A search of the serialized recipe files for `Vector`, `Kellogg's Vector`, `Vector cereal`, `Céréales Vector`, and the six proposed product-name phrases found no recipe-file or ingredient-row hits. No recipe currently demands a Vector product, and no recipe link or legacy mapping is proposed.

## Source-specific quantity limits

The quantities in the proposed-identities table are SKU-specific package sizes or manufacturer label servings. Retain them only as separate observations on the corresponding product records if the family is later integrated:

- Maple and Peanut Butter each have a 306 g package and a 1 cup (44 g) label serving [S03–S04]. These label servings are not interchangeable with each other or other cereal/granola products.
- Meal Replacement is sold in four package sizes. The manufacturer pairs 55 g of cereal with 200 mL of skim milk when describing one serving [S05]. This is a product/preparation statement, not a cereal volume measure or a reusable dairy quantity.
- Chocolate, Vanilla Almond, and Strawberry granola products each have a 311 g package. Their SmartLabel pages separately state 1 cup servings of 108 g, 98 g, and 118 g [S06–S08]. Do not average these amounts or infer one Vector-granola conversion.
- Package net weights are not kitchen measures. None of the reviewed sources supports a reusable density, cup-to-mass mapping, preparation yield, or substitution ratio. Leave all active numeric behavior empty.

The manufacturer warns that product information may change and directs consumers to the current package label. The observations above therefore apply only to the identified Canadian products and the source panels checked on 2026-10-16; they must not be presented as timeless brand-wide quantities.

## Source register

Sources were checked online on **2026-10-16**. Pages generally show no publication or update date; the retrieval date is not treated as a publication date. The following `WP03-VECTOR-R251-20261016-Sxx` identifiers are proposal-local and unallocated; no ledger source records were written.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP03-VECTOR-R251-20261016-S01` | WK Kellogg Canada, [Vector family page, English](https://www.wkkellogg.ca/en/our-foods/our-brands/vector) | Current Canadian manufacturer page lists six products: Maple Flavour Cereal, Meal Replacement, Peanut Butter Flavour Cereal, Chocolate Flavour Granola Cereal, Vanilla Almond Granola Cereal, and Strawberry Granola. It is the bounded English family roster, not a history of discontinued products or U.S. variants. |
| `WP03-VECTOR-R251-20261016-S02` | WK Kellogg Canada, [Vector family page, French](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/vector) | Canadian French page lists the six French names used above. This supports the manufacturer’s product titles, not an OQLF terminology ruling. |
| `WP03-VECTOR-R251-20261016-S03` | WK Kellogg Canada, [Maple cereal](https://www.wkkellogg.ca/fr/produits/vector-cereal-maple) and [SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100137516) | Product page lists the Maple cereal and 306 g package; SmartLabel identifies 1 cup (44 g). Package/serving evidence is SKU-specific. |
| `WP03-VECTOR-R251-20261016-S04` | WK Kellogg Canada, [Peanut Butter cereal](https://www.wkkellogg.ca/fr/produits/vector-cereal-peanut-butter) and [SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724101043) | Product page names the French and English product, lists 306 g, and states a 44 g serving; SmartLabel gives 1 cup (44 g). |
| `WP03-VECTOR-R251-20261016-S05` | WK Kellogg Canada, [Meal Replacement product page](https://www.wkkellogg.ca/fr/produits/substitut-de-repas-vector-product) | French product page names the product, lists 400/550/850/1,134 g packages and Québec retailer links, and describes a 55 g portion with 200 mL skim milk. This is product-specific preparation wording, not a volume conversion. |
| `WP03-VECTOR-R251-20261016-S06` | WK Kellogg Canada, [Chocolate Flavour Granola Cereal](https://www.wkkellogg.ca/en/products/vector-chocolate-granola-cereal) and [SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724102149) | Current product page identifies toasted oat clusters with chocolate-flavoured chunks and a 311 g package; SmartLabel states 1 cup (108 g). French title comes from the manufacturer’s French family page; the individual French detail page did not return readable content during this review. |
| `WP03-VECTOR-R251-20261016-S07` | WK Kellogg Canada, [Vanilla Almond Granola Cereal](https://www.wkkellogg.ca/fr/produits/vecteur-vanille-amande-granola-cereales) and [SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724102163) | Canadian page names toasted oat clusters with vanilla and almonds and lists 311 g; SmartLabel states 1 cup (98 g). French manufacturer product-page text is available and the page lists Québec retailers. |
| `WP03-VECTOR-R251-20261016-S08` | WK Kellogg Canada, [Strawberry Granola](https://www.wkkellogg.ca/en/products/vector-cereal-granola-granola-strawberry) and [SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724104792) | Current Canadian product page names the strawberry granola and describes toasted oat clusters with real strawberries; SmartLabel lists 311 g and 1 cup (118 g). The individual French product page did not return readable content during this review; its French title is listed on S02. |
| `WP03-VECTOR-R251-20261016-S09` | Metro Québec, [Peanut Butter Vector cereal](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-au-beurre-d-arachides/p/059724101043) and [Meal Replacement Vector cereal](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-substitut-de-repas/p/064100028975) | Québec retailer pages use French cereal listings for both products, list 306 g and 400 g respectively, and provide product numbers and ingredient declarations. Listing presence is not a claim of in-stock status or permanent availability. |
| `WP03-VECTOR-R251-20261016-S10` | Metro Québec, [Granola and health cereals](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante) | Current indexed aisle listing includes the 311 g Vector chocolate granola product under a French retail title. It is retailer evidence for the chocolate SKU; it does not replace the manufacturer’s English/French family roster. |

## Recommendation and limits

**Recommend adding the six manufacturer-listed Canadian Vector products as separate identity-only `GRAIN_AND_CEREAL` references, with empty aliases and no active numeric or recipe behavior.** The recommended scope is the six-item lineup on WK Kellogg Canada’s current English and French family pages. Keep the Maple cereal, Meal Replacement, Peanut Butter cereal, and three granola products distinct from one another, the generic granola identity, and their formula ingredients. The broad `Vector` picker query would then return the complete six-product family.

There is no recipe demand, transferable household measure, form, density, yield, conversion, or substitution evidence. Direct French product-page text was unavailable in this review for Chocolate and Strawberry; their French titles are nevertheless listed on the current Canadian French family page. Reopen that naming check if an individual product label contradicts the manufacturer’s family-page wording. Section F remains open.

No software tests or emulator checks were run: this is a documentation-only proposal with no application or database JSON changes.
